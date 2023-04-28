package net.time4j.p248tz;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import net.time4j.base.AbstractC10811a;
import net.time4j.base.AbstractC10818g;
import net.time4j.base.C10812b;
import net.time4j.base.C10813c;
import p163j$.util.DesugarTimeZone;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: net.time4j.tz.n */
/* loaded from: classes8.dex */
public final class C11025n implements AbstractC11027o, Serializable {

    /* renamed from: m */
    private static final Map<Integer, C11025n> f24505m = new HashMap();
    private static final long serialVersionUID = 1790434289322009750L;

    /* renamed from: k */
    private final transient EnumC10992b f24506k;

    /* renamed from: l */
    private final transient EnumC10997g f24507l;

    /* renamed from: net.time4j.tz.n$a */
    /* loaded from: classes8.dex */
    static /* synthetic */ class C11026a {

        /* renamed from: a */
        static final /* synthetic */ int[] f24508a;

        static {
            int[] iArr = new int[EnumC10992b.values().length];
            f24508a = iArr;
            try {
                iArr[EnumC10992b.PUSH_FORWARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24508a[EnumC10992b.NEXT_VALID_TIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24508a[EnumC10992b.ABORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        EnumC10992b[] values;
        EnumC10997g[] values2;
        for (EnumC10992b bVar : EnumC10992b.values()) {
            for (EnumC10997g gVar : EnumC10997g.values()) {
                f24505m.put(Integer.valueOf((bVar.ordinal() * 2) + gVar.ordinal()), new C11025n(bVar, gVar));
            }
        }
    }

    private C11025n(EnumC10992b bVar, EnumC10997g gVar) {
        this.f24506k = bVar;
        this.f24507l = gVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static C11025n m11201d(EnumC10992b bVar, EnumC10997g gVar) {
        return f24505m.get(Integer.valueOf((bVar.ordinal() * 2) + gVar.ordinal()));
    }

    /* renamed from: e */
    private static void m11200e(AbstractC10811a aVar, AbstractC10818g gVar, AbstractC11002l lVar) {
        throw new IllegalArgumentException("Invalid local timestamp due to timezone transition: local-date=" + aVar + ", local-time=" + gVar + " [" + lVar.mo11286z().mo11196a() + "]");
    }

    /* renamed from: f */
    private static long m11199f(int i, int i2, int i3, int i4, int i5, int i6) {
        return C10813c.m12194i(C10813c.m12190m(C10812b.m12206j(i, i2, i3), 40587L), 86400L) + (i4 * 3600) + (i5 * 60) + i6;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    private Object writeReplace() {
        return new SPX(this, 13);
    }

    @Override // net.time4j.p248tz.AbstractC11027o
    /* renamed from: a */
    public AbstractC11027o mo11198a(EnumC10997g gVar) {
        if (gVar == this.f24507l) {
            return this;
        }
        return this.f24506k.m11333a(gVar);
    }

    @Override // net.time4j.p248tz.AbstractC11027o
    /* renamed from: b */
    public long mo11197b(AbstractC10811a aVar, AbstractC10818g gVar, AbstractC11002l lVar) {
        long f;
        int i;
        EnumC10992b bVar;
        int m = aVar.mo11643m();
        int n = aVar.mo11642n();
        int o = aVar.mo11641o();
        int p = gVar.mo11640p();
        int j = gVar.mo11644j();
        int g = gVar.mo11648g();
        AbstractC11008m y = lVar.mo11287y();
        if (y == null && this.f24507l == EnumC10997g.LATER_OFFSET && ((bVar = this.f24506k) == EnumC10992b.PUSH_FORWARD || bVar == EnumC10992b.ABORT)) {
            GregorianCalendar gregorianCalendar = new GregorianCalendar(DesugarTimeZone.getTimeZone(lVar.mo11286z().mo11196a()));
            gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
            gregorianCalendar.set(14, 0);
            gregorianCalendar.set(m, n - 1, o, p, j, g);
            int i2 = gregorianCalendar.get(1);
            int i3 = 1 + gregorianCalendar.get(2);
            int i4 = gregorianCalendar.get(5);
            int i5 = gregorianCalendar.get(11);
            int i6 = gregorianCalendar.get(12);
            int i7 = gregorianCalendar.get(13);
            if (this.f24506k == EnumC10992b.ABORT && !(m == i2 && n == i3 && o == i4 && p == i5 && j == i6 && g == i7)) {
                m11200e(aVar, gVar, lVar);
            }
            f = m11199f(i2, i3, i4, i5, i6, i7);
            i = lVar.mo11323A(aVar, gVar).m11187j();
        } else if (y != null) {
            C11029q a = y.mo11224a(aVar, gVar);
            if (a != null) {
                if (a.m11168j()) {
                    int i8 = C11026a.f24508a[this.f24506k.ordinal()];
                    if (i8 == 1) {
                        f = m11199f(m, n, o, p, j, g) + a.m11171g();
                        i = a.m11169i();
                    } else if (i8 == 2) {
                        return a.m11173e();
                    } else {
                        if (i8 == 3) {
                            m11200e(aVar, gVar, lVar);
                        } else {
                            throw new UnsupportedOperationException(this.f24506k.name());
                        }
                    }
                } else if (a.m11167k()) {
                    f = m11199f(m, n, o, p, j, g);
                    i = a.m11169i();
                    if (this.f24507l == EnumC10997g.EARLIER_OFFSET) {
                        i = a.m11172f();
                    }
                }
            }
            return m11199f(m, n, o, p, j, g) - y.mo11220e(aVar, gVar).get(0).m11187j();
        } else {
            throw new UnsupportedOperationException("Timezone provider does not expose its transition history.");
        }
        return f - i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m11202c() {
        return (this.f24506k.ordinal() * 2) + this.f24507l.ordinal();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(C11025n.class.getName());
        sb2.append(":[gap=");
        sb2.append(this.f24506k);
        sb2.append(",overlap=");
        sb2.append(this.f24507l);
        sb2.append(']');
        return sb2.toString();
    }
}
