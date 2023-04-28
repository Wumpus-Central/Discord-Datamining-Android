package p143hj;

import net.time4j.base.C10813c;
import p143hj.AbstractC8073m;

/* renamed from: hj.m */
/* loaded from: classes8.dex */
public abstract class AbstractC8073m<U, D extends AbstractC8073m<U, D>> extends AbstractC8069k0<U, D> implements AbstractC8056g {
    /* renamed from: Q */
    private AbstractC8068k<D> m20671Q() {
        return mo11639t().mo20650n();
    }

    /* renamed from: X */
    private <T> T m20665X(AbstractC8068k<T> kVar, String str) {
        long c = mo12079c();
        if (kVar.mo11788d() <= c && kVar.mo11791a() >= c) {
            return kVar.mo11790b(c);
        }
        throw new ArithmeticException("Cannot transform <" + c + "> to: " + str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: M */
    public int mo11874M(AbstractC8056g gVar) {
        int i = (mo12079c() > gVar.mo12079c() ? 1 : (mo12079c() == gVar.mo12079c() ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        if (i == 0) {
            return 0;
        }
        return 1;
    }

    /* renamed from: N */
    public int compareTo(D d) {
        if (mo11639t().m20648q() == d.mo11639t().m20648q()) {
            return mo11874M(d);
        }
        throw new ClassCastException("Cannot compare different types of dates, use instance of EpochDays as comparator instead.");
    }

    /* renamed from: R */
    public boolean m20670R(AbstractC8056g gVar) {
        return mo11874M(gVar) > 0;
    }

    /* renamed from: T */
    public boolean m20669T(AbstractC8056g gVar) {
        return mo11874M(gVar) < 0;
    }

    /* renamed from: U */
    public D m20668U(C8058h hVar) {
        long f = C10813c.m12197f(mo12079c(), hVar.m20717b());
        try {
            return m20671Q().mo11790b(f);
        } catch (IllegalArgumentException e) {
            ArithmeticException arithmeticException = new ArithmeticException("Out of range: " + f);
            arithmeticException.initCause(e);
            throw arithmeticException;
        }
    }

    /* renamed from: V */
    public <T extends AbstractC8070l<T>> T m20667V(Class<T> cls, String str) {
        String name = cls.getName();
        C8087x E = C8087x.m20655E(cls);
        if (E != null) {
            return (T) ((AbstractC8070l) m20665X(E.mo20649o(str), name));
        }
        throw new IllegalArgumentException("Cannot find any chronology for given target type: " + name);
    }

    /* renamed from: W */
    public <T extends AbstractC8073m<?, T>> T m20666W(Class<T> cls) {
        String name = cls.getName();
        C8087x E = C8087x.m20655E(cls);
        if (E != null) {
            return (T) ((AbstractC8073m) m20665X(E.mo20650n(), name));
        }
        throw new IllegalArgumentException("Cannot find any chronology for given target type: " + name);
    }

    @Override // p143hj.AbstractC8056g
    /* renamed from: c */
    public long mo12079c() {
        return m20671Q().mo11789c((D) mo11638u());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AbstractC8073m)) {
            return false;
        }
        AbstractC8073m mVar = (AbstractC8073m) obj;
        if (mo11639t().m20648q() == mVar.mo11639t().m20648q() && mo12079c() == mVar.mo12079c()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long c = mo12079c();
        return (int) (c ^ (c >>> 32));
    }
}
