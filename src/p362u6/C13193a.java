package p362u6;

import javax.inject.Provider;
import p347t6.AbstractC12970a;

/* renamed from: u6.a */
/* loaded from: classes7.dex */
public final class C13193a<T> implements Provider<T>, AbstractC12970a<T> {

    /* renamed from: c */
    private static final Object f29589c = new Object();

    /* renamed from: a */
    private volatile Provider<T> f29590a;

    /* renamed from: b */
    private volatile Object f29591b = f29589c;

    private C13193a(Provider<T> provider) {
        this.f29590a = provider;
    }

    /* renamed from: a */
    public static <P extends Provider<T>, T> AbstractC12970a<T> m4366a(P p) {
        if (p instanceof AbstractC12970a) {
            return (AbstractC12970a) p;
        }
        return new C13193a((Provider) C13196d.m4361b(p));
    }

    /* renamed from: b */
    public static <P extends Provider<T>, T> Provider<T> m4365b(P p) {
        C13196d.m4361b(p);
        if (p instanceof C13193a) {
            return p;
        }
        return new C13193a(p);
    }

    /* renamed from: c */
    public static Object m4364c(Object obj, Object obj2) {
        boolean z;
        if (obj != f29589c) {
            z = true;
        } else {
            z = false;
        }
        if (!z || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // javax.inject.Provider
    public T get() {
        T t = (T) this.f29591b;
        Object obj = f29589c;
        if (t == obj) {
            synchronized (this) {
                t = this.f29591b;
                if (t == obj) {
                    t = this.f29590a.get();
                    this.f29591b = m4364c(this.f29591b, t);
                    this.f29590a = null;
                }
            }
        }
        return t;
    }
}
