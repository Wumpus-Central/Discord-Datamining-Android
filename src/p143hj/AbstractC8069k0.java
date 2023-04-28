package p143hj;

import java.io.Serializable;
import net.time4j.base.C10813c;
import p143hj.AbstractC8069k0;

/* renamed from: hj.k0 */
/* loaded from: classes8.dex */
public abstract class AbstractC8069k0<U, T extends AbstractC8069k0<U, T>> extends AbstractC8080q<T> implements Comparable<T>, Serializable {
    /* renamed from: I */
    private AbstractC8074m0<T> m20685I(U u) {
        return mo11639t().m20707Q(u);
    }

    /* renamed from: F */
    public abstract int compareTo(T t);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: G */
    public abstract C8059h0<U, T> mo11639t();

    /* renamed from: J */
    public T m20684J(long j, U u) {
        return m20683K(C10813c.m12192k(j), u);
    }

    /* renamed from: K */
    public T m20683K(long j, U u) {
        if (j == 0) {
            return (T) ((AbstractC8069k0) mo11638u());
        }
        try {
            return m20685I(u).mo11636b((T) mo11638u(), j);
        } catch (IllegalArgumentException e) {
            ArithmeticException arithmeticException = new ArithmeticException("Result beyond boundaries of time axis.");
            arithmeticException.initCause(e);
            throw arithmeticException;
        }
    }

    /* renamed from: L */
    public long m20682L(T t, U u) {
        return m20685I(u).mo11637a((T) mo11638u(), t);
    }
}
