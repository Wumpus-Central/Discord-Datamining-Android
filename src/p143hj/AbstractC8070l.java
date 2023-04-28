package p143hj;

import java.io.Serializable;
import net.time4j.base.C10813c;
import p143hj.AbstractC8070l;

/* renamed from: hj.l */
/* loaded from: classes8.dex */
public abstract class AbstractC8070l<D extends AbstractC8070l<D>> extends AbstractC8080q<D> implements AbstractC8056g, AbstractC8078o0, Comparable<D>, Serializable {
    /* renamed from: L */
    private <T> T m20676L(AbstractC8068k<T> kVar, String str) {
        long c = mo12079c();
        if (kVar.mo11788d() <= c && kVar.mo11791a() >= c) {
            return kVar.mo11790b(c);
        }
        throw new ArithmeticException("Cannot transform <" + c + "> to: " + str);
    }

    /* renamed from: F */
    public int compareTo(D d) {
        int i = (mo12079c() > d.mo12079c() ? 1 : (mo12079c() == d.mo12079c() ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        if (i > 0) {
            return 1;
        }
        return mo11570l().compareTo(d.mo11570l());
    }

    /* renamed from: G */
    protected AbstractC8068k<D> m20680G() {
        return mo11639t().mo20649o(mo11570l());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: I */
    public abstract C8066j<D> mo11639t();

    /* renamed from: J */
    public D m20678J(C8058h hVar) {
        long f = C10813c.m12197f(mo12079c(), hVar.m20717b());
        try {
            return m20680G().mo11790b(f);
        } catch (IllegalArgumentException e) {
            ArithmeticException arithmeticException = new ArithmeticException("Out of range: " + f);
            arithmeticException.initCause(e);
            throw arithmeticException;
        }
    }

    /* renamed from: K */
    public <T extends AbstractC8073m<?, T>> T m20677K(Class<T> cls) {
        String name = cls.getName();
        C8087x E = C8087x.m20655E(cls);
        if (E != null) {
            return (T) ((AbstractC8073m) m20676L(E.mo20650n(), name));
        }
        throw new IllegalArgumentException("Cannot find any chronology for given target type: " + name);
    }

    @Override // p143hj.AbstractC8056g
    /* renamed from: c */
    public long mo12079c() {
        return m20680G().mo11789c((D) mo11638u());
    }

    public abstract boolean equals(Object obj);

    public abstract int hashCode();

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p143hj.AbstractC8080q
    /* renamed from: x */
    public <V> AbstractC8091z<D, V> mo20659x(AbstractC8079p<V> pVar) {
        if (pVar instanceof EnumC8042a0) {
            return ((EnumC8042a0) EnumC8042a0.class.cast(pVar)).m20757c(m20680G());
        }
        return super.mo20659x(pVar);
    }
}
