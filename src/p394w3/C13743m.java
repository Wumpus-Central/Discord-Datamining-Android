package p394w3;

import com.facebook.common.internal.Supplier;

/* renamed from: w3.m */
/* loaded from: classes7.dex */
public class C13743m {

    /* renamed from: a */
    public static final Supplier<Boolean> f30711a = new C13745b();

    /* renamed from: b */
    public static final Supplier<Boolean> f30712b = new C13746c();

    /* renamed from: w3.m$a */
    /* loaded from: classes7.dex */
    static class C13744a implements Supplier<T> {

        /* renamed from: a */
        final /* synthetic */ Object f30713a;

        C13744a(Object obj) {
            this.f30713a = obj;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [T, java.lang.Object] */
        @Override // com.facebook.common.internal.Supplier
        public T get() {
            return this.f30713a;
        }
    }

    /* renamed from: w3.m$b */
    /* loaded from: classes7.dex */
    static class C13745b implements Supplier<Boolean> {
        C13745b() {
        }

        /* renamed from: a */
        public Boolean get() {
            return Boolean.TRUE;
        }
    }

    /* renamed from: w3.m$c */
    /* loaded from: classes7.dex */
    static class C13746c implements Supplier<Boolean> {
        C13746c() {
        }

        /* renamed from: a */
        public Boolean get() {
            return Boolean.FALSE;
        }
    }

    /* renamed from: a */
    public static <T> Supplier<T> m2826a(T t) {
        return new C13744a(t);
    }
}
