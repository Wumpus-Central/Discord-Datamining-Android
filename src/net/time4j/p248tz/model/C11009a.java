package net.time4j.p248tz.model;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import net.time4j.C10779a0;
import net.time4j.base.AbstractC10811a;
import net.time4j.base.AbstractC10817f;
import net.time4j.base.AbstractC10818g;
import net.time4j.p248tz.C11028p;
import net.time4j.p248tz.C11029q;
import p271oj.EnumC11413f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: net.time4j.tz.model.a */
/* loaded from: classes8.dex */
public final class C11009a extends AbstractC11024l {
    private static final long serialVersionUID = -5264909488983076587L;

    /* renamed from: l */
    private final transient C11029q[] f24471l;

    /* renamed from: m */
    private final transient boolean f24472m;

    /* renamed from: n */
    private final transient List<C11029q> f24473n;

    /* renamed from: o */
    private transient int f24474o = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11009a(List<C11029q> list, boolean z, boolean z2) {
        if (!list.isEmpty()) {
            C11029q[] qVarArr = (C11029q[]) list.toArray(new C11029q[list.size()]);
            boolean z3 = false;
            for (C11029q qVar : qVarArr) {
                if (z3 || qVar.m11174d() < 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            }
            this.f24472m = z3;
            if (z) {
                Arrays.sort(qVarArr);
            }
            if (z2) {
                m11254k(qVarArr, list);
            }
            this.f24471l = qVarArr;
            this.f24473n = m11250o(qVarArr, 0L, AbstractC11024l.m11207f(1));
            return;
        }
        throw new IllegalArgumentException("Missing timezone transitions.");
    }

    /* renamed from: k */
    private static void m11254k(C11029q[] qVarArr, List<C11029q> list) {
        int i = qVarArr[0].m11169i();
        for (int i2 = 1; i2 < qVarArr.length; i2++) {
            if (i == qVarArr[i2].m11172f()) {
                i = qVarArr[i2].m11169i();
            } else {
                C10779a0 p0 = C10779a0.m12307p0(qVarArr[i2].m11173e(), EnumC11413f.POSIX);
                throw new IllegalArgumentException("Model inconsistency detected at: " + p0 + " (" + qVarArr[i2].m11173e() + ")  in transitions: " + list);
            }
        }
    }

    /* renamed from: o */
    private static List<C11029q> m11250o(C11029q[] qVarArr, long j, long j2) {
        if (j <= j2) {
            int r = m11247r(j, qVarArr);
            int r2 = m11247r(j2, qVarArr);
            if (r2 == 0) {
                return Collections.emptyList();
            }
            if (r > 0 && qVarArr[r - 1].m11173e() == j) {
                r--;
            }
            int i = r2 - 1;
            if (qVarArr[i].m11173e() == j2) {
                i--;
            }
            if (r > i) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList((i - r) + 1);
            while (r <= i) {
                arrayList.add(qVarArr[r]);
                r++;
            }
            return Collections.unmodifiableList(arrayList);
        }
        throw new IllegalArgumentException("Start after end.");
    }

    /* renamed from: r */
    private static int m11247r(long j, C11029q[] qVarArr) {
        int length = qVarArr.length - 1;
        int i = 0;
        while (i <= length) {
            int i2 = (i + length) / 2;
            if (qVarArr[i2].m11173e() <= j) {
                i = i2 + 1;
            } else {
                length = i2 - 1;
            }
        }
        return i;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    /* renamed from: s */
    private static int m11246s(long j, C11029q[] qVarArr) {
        C11029q qVar;
        int length = qVarArr.length - 1;
        int i = 0;
        while (i <= length) {
            int i2 = (i + length) / 2;
            if (qVarArr[i2].m11173e() + Math.max(qVar.m11169i(), qVar.m11172f()) <= j) {
                i = i2 + 1;
            } else {
                length = i2 - 1;
            }
        }
        return i;
    }

    private Object writeReplace() {
        return new SPX(this, 126);
    }

    @Override // net.time4j.p248tz.AbstractC11008m
    /* renamed from: a */
    public C11029q mo11224a(AbstractC10811a aVar, AbstractC10818g gVar) {
        return m11252m(aVar, gVar, null);
    }

    @Override // net.time4j.p248tz.AbstractC11008m
    /* renamed from: b */
    public C11029q mo11223b(AbstractC10817f fVar) {
        int r = m11247r(fVar.mo11325h(), this.f24471l);
        if (r == 0) {
            return null;
        }
        return this.f24471l[r - 1];
    }

    @Override // net.time4j.p248tz.AbstractC11008m
    /* renamed from: c */
    public boolean mo11222c() {
        return this.f24472m;
    }

    @Override // net.time4j.p248tz.AbstractC11008m
    /* renamed from: d */
    public C11028p mo11221d() {
        return C11028p.m11181p(this.f24471l[0].m11172f());
    }

    @Override // net.time4j.p248tz.AbstractC11008m
    /* renamed from: e */
    public List<C11028p> mo11220e(AbstractC10811a aVar, AbstractC10818g gVar) {
        return m11249p(aVar, gVar, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C11009a) {
            return Arrays.equals(this.f24471l, ((C11009a) obj).f24471l);
        }
        return false;
    }

    public int hashCode() {
        int i = this.f24474o;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f24471l);
        this.f24474o = hashCode;
        return hashCode;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean m11253l(C11009a aVar, int i, int i2) {
        int min = Math.min(i, this.f24471l.length);
        if (min != Math.min(i2, aVar.f24471l.length)) {
            return false;
        }
        for (int i3 = 0; i3 < min; i3++) {
            if (!this.f24471l[i3].equals(aVar.f24471l[i3])) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public C11029q m11252m(AbstractC10811a aVar, AbstractC10818g gVar, C11021j jVar) {
        long j = AbstractC11024l.m11203j(aVar, gVar);
        int s = m11246s(j, this.f24471l);
        C11029q[] qVarArr = this.f24471l;
        if (s != qVarArr.length) {
            C11029q qVar = qVarArr[s];
            if (qVar.m11168j()) {
                if (qVar.m11173e() + qVar.m11172f() <= j) {
                    return qVar;
                }
            } else if (qVar.m11167k() && qVar.m11173e() + qVar.m11169i() <= j) {
                return qVar;
            }
            return null;
        } else if (jVar == null) {
            return null;
        } else {
            return jVar.m11219k(aVar, j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public C11029q m11251n() {
        C11029q[] qVarArr = this.f24471l;
        return qVarArr[qVarArr.length - 1];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public List<C11028p> m11249p(AbstractC10811a aVar, AbstractC10818g gVar, C11021j jVar) {
        long j = AbstractC11024l.m11203j(aVar, gVar);
        int s = m11246s(j, this.f24471l);
        C11029q[] qVarArr = this.f24471l;
        if (s != qVarArr.length) {
            C11029q qVar = qVarArr[s];
            if (qVar.m11168j()) {
                if (qVar.m11173e() + qVar.m11172f() <= j) {
                    return Collections.emptyList();
                }
            } else if (qVar.m11167k() && qVar.m11173e() + qVar.m11169i() <= j) {
                return AbstractC11024l.m11204i(qVar.m11169i(), qVar.m11172f());
            }
            return AbstractC11024l.m11205h(qVar.m11172f());
        } else if (jVar == null) {
            return AbstractC11024l.m11205h(qVarArr[qVarArr.length - 1].m11169i());
        } else {
            return jVar.m11210t(aVar, j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public int m11248q(int i) {
        int min = Math.min(i, this.f24471l.length);
        C11029q[] qVarArr = new C11029q[min];
        System.arraycopy(this.f24471l, 0, qVarArr, 0, min);
        return Arrays.hashCode(qVarArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public void m11245t(int i, ObjectOutput objectOutput) {
        SPX.m11255z(this.f24471l, i, objectOutput);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(C11009a.class.getName());
        sb2.append("[transition-count=");
        sb2.append(this.f24471l.length);
        sb2.append(",hash=");
        sb2.append(hashCode());
        sb2.append(']');
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public void m11244u(ObjectOutput objectOutput) {
        m11245t(this.f24471l.length, objectOutput);
    }
}
