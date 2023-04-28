package p362u6;

import p347t6.AbstractC12970a;

/* renamed from: u6.c */
/* loaded from: classes7.dex */
public final class C13195c<T> implements AbstractC13194b<T>, AbstractC12970a<T> {

    /* renamed from: b */
    private static final C13195c<Object> f29592b = new C13195c<>(null);

    /* renamed from: a */
    private final T f29593a;

    private C13195c(T t) {
        this.f29593a = t;
    }

    /* renamed from: a */
    public static <T> AbstractC13194b<T> m4363a(T t) {
        return new C13195c(C13196d.m4360c(t, "instance cannot be null"));
    }

    @Override // javax.inject.Provider
    public T get() {
        return this.f29593a;
    }
}
