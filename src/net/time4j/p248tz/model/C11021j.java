package net.time4j.p248tz.model;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import net.time4j.C10779a0;
import net.time4j.base.AbstractC10811a;
import net.time4j.base.AbstractC10817f;
import net.time4j.base.AbstractC10818g;
import net.time4j.base.C10812b;
import net.time4j.base.C10813c;
import net.time4j.p248tz.C11028p;
import net.time4j.p248tz.C11029q;
import p143hj.EnumC8042a0;
import p163j$.util.Spliterator;
import p163j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: net.time4j.tz.model.j */
/* loaded from: classes8.dex */
public final class C11021j extends AbstractC11024l {

    /* renamed from: q */
    private static final int f24495q = C10812b.m12207i(C10812b.m12204l(EnumC8042a0.MODIFIED_JULIAN_DATE.m20754h(AbstractC11024l.m11207f(100), EnumC8042a0.UNIX)));
    private static final long serialVersionUID = 2456700806862862287L;

    /* renamed from: l */
    private final transient C11029q f24496l;

    /* renamed from: m */
    private final transient List<AbstractC11012d> f24497m;

    /* renamed from: n */
    private final transient ConcurrentMap<Integer, List<C11029q>> f24498n;

    /* renamed from: o */
    private final transient List<C11029q> f24499o;

    /* renamed from: p */
    private final transient boolean f24500p;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: net.time4j.tz.model.j$a */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class C11022a {

        /* renamed from: a */
        static final /* synthetic */ int[] f24501a;

        static {
            int[] iArr = new int[EnumC11017i.values().length];
            f24501a = iArr;
            try {
                iArr[EnumC11017i.f24490k.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24501a[EnumC11017i.f24491l.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24501a[EnumC11017i.f24492m.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11021j(C11028p pVar, List<AbstractC11012d> list, boolean z) {
        this(new C11029q(Long.MIN_VALUE, pVar.m11187j(), pVar.m11187j(), 0), list, z);
    }

    /* renamed from: m */
    private static C11029q m11217m(long j, C11029q qVar, List<AbstractC11012d> list) {
        long max = Math.max(j, qVar.m11173e());
        int h = qVar.m11170h();
        int size = list.size();
        int i = Integer.MIN_VALUE;
        C11029q qVar2 = null;
        int i2 = 0;
        while (qVar2 == null) {
            int i3 = i2 % size;
            AbstractC11012d dVar = list.get(i3);
            AbstractC11012d dVar2 = list.get(((i2 - 1) + size) % size);
            int o = m11215o(dVar, h, dVar2.m11236e());
            if (i2 == 0) {
                i = m11209u(dVar, o + max);
            } else if (i3 == 0) {
                i++;
            }
            long p = m11214p(dVar, i, o);
            if (p > max) {
                qVar2 = new C11029q(p, h + dVar2.m11236e(), h + dVar.m11236e(), dVar.m11236e());
            }
            i2++;
        }
        return qVar2;
    }

    /* renamed from: o */
    private static int m11215o(AbstractC11012d dVar, int i, int i2) {
        EnumC11017i d = dVar.m11237d();
        int i3 = C11022a.f24501a[d.ordinal()];
        if (i3 == 1) {
            return 0;
        }
        if (i3 == 2) {
            return i;
        }
        if (i3 == 3) {
            return i + i2;
        }
        throw new UnsupportedOperationException(d.name());
    }

    /* renamed from: p */
    private static long m11214p(AbstractC11012d dVar, int i, int i2) {
        return dVar.mo11232b(i).m11838s0(dVar.m11235f()).m11662T(C11028p.m11181p(i2)).mo11325h();
    }

    /* renamed from: q */
    private List<C11029q> m11213q(int i) {
        List<C11029q> putIfAbsent;
        Integer valueOf = Integer.valueOf(i);
        List<C11029q> list = this.f24498n.get(valueOf);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        int h = this.f24496l.m11170h();
        int size = this.f24497m.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC11012d dVar = this.f24497m.get(i2);
            AbstractC11012d dVar2 = this.f24497m.get(((i2 - 1) + size) % size);
            arrayList.add(new C11029q(m11214p(dVar, i, m11215o(dVar, h, dVar2.m11236e())), h + dVar2.m11236e(), h + dVar.m11236e(), dVar.m11236e()));
        }
        List<C11029q> unmodifiableList = Collections.unmodifiableList(arrayList);
        if (i > f24495q || !this.f24500p || (putIfAbsent = this.f24498n.putIfAbsent(valueOf, unmodifiableList)) == null) {
            return unmodifiableList;
        }
        return putIfAbsent;
    }

    /* renamed from: r */
    private List<C11029q> m11212r(AbstractC10811a aVar) {
        return m11213q(this.f24497m.get(0).mo11230i(aVar));
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public static List<C11029q> m11211s(C11029q qVar, List<AbstractC11012d> list, long j, long j2) {
        int i;
        int i2;
        long e = qVar.m11173e();
        int i3 = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i3 > 0) {
            throw new IllegalArgumentException("Start after end.");
        } else if (j2 <= e || i3 == 0) {
            return Collections.emptyList();
        } else {
            ArrayList arrayList = new ArrayList();
            int size = list.size();
            int h = qVar.m11170h();
            int i4 = Integer.MIN_VALUE;
            int i5 = 0;
            while (true) {
                int i6 = i5 % size;
                AbstractC11012d dVar = list.get(i6);
                AbstractC11012d dVar2 = list.get(((i5 - 1) + size) % size);
                int o = m11215o(dVar, h, dVar2.m11236e());
                if (i5 == 0) {
                    i2 = size;
                    i = h;
                    i4 = m11209u(dVar, Math.max(j, e) + o);
                } else {
                    i2 = size;
                    i = h;
                    if (i6 == 0) {
                        i4++;
                    }
                }
                long p = m11214p(dVar, i4, o);
                i5++;
                if (p >= j2) {
                    return Collections.unmodifiableList(arrayList);
                }
                if (p >= j && p > e) {
                    arrayList.add(new C11029q(p, i + dVar2.m11236e(), i + dVar.m11236e(), dVar.m11236e()));
                }
                h = i;
                size = i2;
            }
        }
    }

    /* renamed from: u */
    private static int m11209u(AbstractC11012d dVar, long j) {
        return dVar.mo11231h(EnumC8042a0.MODIFIED_JULIAN_DATE.m20754h(C10813c.m12201b(j, 86400), EnumC8042a0.UNIX));
    }

    private Object writeReplace() {
        return new SPX(this, 125);
    }

    @Override // net.time4j.p248tz.AbstractC11008m
    /* renamed from: a */
    public C11029q mo11224a(AbstractC10811a aVar, AbstractC10818g gVar) {
        return m11219k(aVar, AbstractC11024l.m11203j(aVar, gVar));
    }

    @Override // net.time4j.p248tz.AbstractC11008m
    /* renamed from: b */
    public C11029q mo11223b(AbstractC10817f fVar) {
        AbstractC11012d dVar;
        C11029q qVar;
        long e = this.f24496l.m11173e();
        C11029q qVar2 = null;
        if (fVar.mo11325h() <= e) {
            return null;
        }
        int h = this.f24496l.m11170h();
        int size = this.f24497m.size();
        int i = size - 1;
        int u = m11209u(this.f24497m.get(0), fVar.mo11325h() + m11215o(dVar, h, this.f24497m.get(i).m11236e()));
        List<C11029q> q = m11213q(u);
        for (int i2 = 0; i2 < size; i2++) {
            C11029q qVar3 = q.get(i2);
            long e2 = qVar3.m11173e();
            if (fVar.mo11325h() >= e2) {
                if (e2 > e) {
                    qVar2 = qVar3;
                }
            } else if (qVar2 != null) {
                return qVar2;
            } else {
                if (i2 == 0) {
                    qVar = m11213q(u - 1).get(i);
                } else {
                    qVar = q.get(i2 - 1);
                }
                if (qVar.m11173e() > e) {
                    return qVar;
                }
                return qVar2;
            }
        }
        return qVar2;
    }

    @Override // net.time4j.p248tz.AbstractC11008m
    /* renamed from: c */
    public boolean mo11222c() {
        for (AbstractC11012d dVar : this.f24497m) {
            if (dVar.m11236e() < 0) {
                return true;
            }
        }
        return false;
    }

    @Override // net.time4j.p248tz.AbstractC11008m
    /* renamed from: d */
    public C11028p mo11221d() {
        return C11028p.m11181p(this.f24496l.m11169i());
    }

    @Override // net.time4j.p248tz.AbstractC11008m
    /* renamed from: e */
    public List<C11028p> mo11220e(AbstractC10811a aVar, AbstractC10818g gVar) {
        return m11210t(aVar, AbstractC11024l.m11203j(aVar, gVar));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11021j)) {
            return false;
        }
        C11021j jVar = (C11021j) obj;
        if (!this.f24496l.equals(jVar.f24496l) || !this.f24497m.equals(jVar.f24497m)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.f24496l.hashCode() * 17) + (this.f24497m.hashCode() * 37);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public C11029q m11219k(AbstractC10811a aVar, long j) {
        if (j <= this.f24496l.m11173e() + Math.max(this.f24496l.m11172f(), this.f24496l.m11169i())) {
            return null;
        }
        for (C11029q qVar : m11212r(aVar)) {
            long e = qVar.m11173e();
            if (qVar.m11168j()) {
                if (j < qVar.m11172f() + e) {
                    return null;
                }
                if (j < e + qVar.m11169i()) {
                    return qVar;
                }
            } else if (!qVar.m11167k()) {
                continue;
            } else if (j < qVar.m11169i() + e) {
                return null;
            } else {
                if (j < e + qVar.m11172f()) {
                    return qVar;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public C11029q m11218l() {
        return this.f24496l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public List<AbstractC11012d> m11216n() {
        return this.f24497m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public List<C11028p> m11210t(AbstractC10811a aVar, long j) {
        long e = this.f24496l.m11173e();
        int i = this.f24496l.m11169i();
        if (j <= e + Math.max(this.f24496l.m11172f(), i)) {
            return AbstractC11024l.m11205h(i);
        }
        for (C11029q qVar : m11212r(aVar)) {
            long e2 = qVar.m11173e();
            int i2 = qVar.m11169i();
            if (qVar.m11168j()) {
                if (j < qVar.m11172f() + e2) {
                    return AbstractC11024l.m11205h(qVar.m11172f());
                }
                if (j < e2 + i2) {
                    return Collections.emptyList();
                }
            } else if (!qVar.m11167k()) {
                continue;
            } else if (j < i2 + e2) {
                return AbstractC11024l.m11205h(qVar.m11172f());
            } else {
                if (j < e2 + qVar.m11172f()) {
                    return AbstractC11024l.m11204i(i2, qVar.m11172f());
                }
            }
            i = i2;
        }
        return AbstractC11024l.m11205h(i);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder((int) Spliterator.NONNULL);
        sb2.append(C11021j.class.getName());
        sb2.append("[initial=");
        sb2.append(this.f24496l);
        sb2.append(",rules=");
        sb2.append(this.f24497m);
        sb2.append(']');
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11021j(C11029q qVar, List<AbstractC11012d> list, boolean z) {
        C11029q qVar2;
        this.f24498n = new ConcurrentHashMap();
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Missing daylight saving rules.");
        } else if (list.size() < 128) {
            list = z ? new ArrayList(list) : list;
            Collections.sort(list, EnumC11023k.INSTANCE);
            String str = null;
            if (list.size() > 1) {
                for (AbstractC11012d dVar : list) {
                    if (str == null) {
                        str = dVar.mo11233a();
                    } else if (!str.equals(dVar.mo11233a())) {
                        throw new IllegalArgumentException("Rules with different calendar systems not permitted.");
                    }
                }
            }
            this.f24500p = "iso8601".equals(str);
            if (qVar.m11173e() != Long.MIN_VALUE) {
                if (qVar.m11169i() == m11217m(qVar.m11173e(), qVar, list).m11172f()) {
                    qVar2 = qVar;
                } else {
                    throw new IllegalArgumentException("Inconsistent model: " + qVar + " / " + list);
                }
            } else if (qVar.m11174d() == 0) {
                qVar2 = new C11029q(C10779a0.m12326W().m20708P().mo11325h(), qVar.m11170h(), qVar.m11170h(), 0);
            } else {
                throw new IllegalArgumentException("Initial transition must not have any dst-offset: " + qVar);
            }
            this.f24496l = qVar2;
            List<AbstractC11012d> unmodifiableList = Collections.unmodifiableList(list);
            this.f24497m = unmodifiableList;
            this.f24499o = m11211s(qVar2, unmodifiableList, 0L, AbstractC11024l.m11207f(1));
        } else {
            throw new IllegalArgumentException("Too many daylight saving rules: " + list);
        }
    }
}
