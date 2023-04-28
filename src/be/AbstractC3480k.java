package be;

import com.facebook.react.bridge.Dynamic;

/* renamed from: be.k */
/* loaded from: classes6.dex */
public abstract class AbstractC3480k<T> {

    /* renamed from: a */
    private T f5616a;

    public AbstractC3480k() {
    }

    public AbstractC3480k(T t) {
        this.f5616a = t;
    }

    /* renamed from: a */
    public T m34313a() {
        return this.f5616a;
    }

    /* renamed from: b */
    public void m34312b(Dynamic dynamic) {
        this.f5616a = mo34309c(dynamic);
    }

    /* renamed from: c */
    abstract T mo34309c(Dynamic dynamic);
}
