package io.sentry;

/* renamed from: io.sentry.r1 */
/* loaded from: classes8.dex */
public final class C9031r1<T> {

    /* renamed from: a */
    private final Class<T> f19858a;

    private C9031r1(Class<T> cls) {
        this.f19858a = cls;
    }

    /* renamed from: a */
    public static <T> C9031r1<T> m17192a(Class<T> cls) {
        return new C9031r1<>(cls);
    }

    /* renamed from: b */
    public T m17191b() {
        return this.f19858a.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
    }
}
