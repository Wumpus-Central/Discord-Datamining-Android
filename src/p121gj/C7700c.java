package p121gj;

import java.io.ObjectInputStream;
import java.io.Serializable;
import java.io.StreamCorruptedException;
import net.time4j.C10779a0;
import net.time4j.C10892f0;
import net.time4j.base.C10813c;
import p143hj.EnumC8042a0;
import p271oj.C11410d;
import p271oj.EnumC11413f;

/* renamed from: gj.c */
/* loaded from: classes8.dex */
public final class C7700c implements Serializable {
    private static final long serialVersionUID = 486345450973062467L;
    private final EnumC11413f scale;
    private final double value;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: gj.c$a */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class C7701a {

        /* renamed from: a */
        static final /* synthetic */ int[] f16709a;

        static {
            int[] iArr = new int[EnumC11413f.values().length];
            f16709a = iArr;
            try {
                iArr[EnumC11413f.UT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16709a[EnumC11413f.TT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16709a[EnumC11413f.POSIX.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private C7700c(double d, EnumC11413f fVar) {
        m21631a(d, fVar);
        this.value = d;
        this.scale = fVar;
    }

    /* renamed from: a */
    private static void m21631a(double d, EnumC11413f fVar) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException("Value is not finite: " + d);
        }
        int i = C7701a.f16709a[fVar.ordinal()];
        if (i != 1 && i != 2 && i != 3) {
            throw new IllegalArgumentException("Unsupported time scale: " + fVar);
        } else if (Double.compare(990575.0d, d) > 0 || Double.compare(d, 2817152.0d) > 0) {
            throw new IllegalArgumentException("Out of range: " + d);
        }
    }

    /* renamed from: d */
    static double m21628d(C10779a0 a0Var, EnumC11413f fVar) {
        return ((a0Var.mo10105i(fVar) + m21627e(fVar)) + (a0Var.mo10106d(fVar) / 1.0E9d)) / 86400.0d;
    }

    /* renamed from: e */
    private static long m21627e(EnumC11413f fVar) {
        int i = C7701a.f16709a[fVar.ordinal()];
        if (i == 1 || i == 2) {
            return 210929832000L;
        }
        if (i == 3) {
            return 210866760000L;
        }
        throw new UnsupportedOperationException(fVar.name());
    }

    /* renamed from: f */
    public static C7700c m21626f(double d) {
        return new C7700c(d, EnumC11413f.TT);
    }

    /* renamed from: g */
    public static C7700c m21625g(C10779a0 a0Var) {
        EnumC11413f fVar = EnumC11413f.TT;
        return new C7700c(m21628d(a0Var, fVar), fVar);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        try {
            objectInputStream.defaultReadObject();
            m21631a(this.value, this.scale);
        } catch (ClassNotFoundException unused) {
            throw new StreamCorruptedException();
        } catch (IllegalArgumentException unused2) {
            throw new StreamCorruptedException();
        }
    }

    /* renamed from: b */
    public double m21630b() {
        return this.value - 2400000.5d;
    }

    /* renamed from: c */
    public double m21629c() {
        return this.value;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7700c)) {
            return false;
        }
        C7700c cVar = (C7700c) obj;
        if (this.value == cVar.value && this.scale == cVar.scale) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public C10779a0 m21624h() {
        EnumC11413f fVar;
        double d = this.value * 86400.0d;
        EnumC11413f fVar2 = this.scale;
        if (!C11410d.m10131A().m10127G() && fVar2 != (fVar = EnumC11413f.POSIX)) {
            if (fVar2 == EnumC11413f.TT) {
                C10892f0 Q0 = C10892f0.m11869Q0((long) Math.floor(m21630b()), EnumC8042a0.MODIFIED_JULIAN_DATE);
                d -= EnumC11413f.m10108b(Q0.mo11643m(), Q0.mo11642n());
            }
            d += 6.3072E7d;
            fVar2 = fVar;
        }
        return C10779a0.m12308o0(C10813c.m12190m((long) d, m21627e(fVar2)), (int) ((d - Math.floor(d)) * 1.0E9d), fVar2);
    }

    public int hashCode() {
        return C7697a.m21639a(this.value) ^ this.scale.hashCode();
    }

    public String toString() {
        return "JD(" + this.scale.name() + ')' + this.value;
    }
}
