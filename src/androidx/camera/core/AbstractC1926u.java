package androidx.camera.core;

/* renamed from: androidx.camera.core.u */
/* loaded from: classes.dex */
public abstract class AbstractC1926u {

    /* renamed from: androidx.camera.core.u$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1927a {
        /* renamed from: a */
        public static AbstractC1927a m39502a(int i) {
            return m39501b(i, null);
        }

        /* renamed from: b */
        public static AbstractC1927a m39501b(int i, Throwable th2) {
            return new C1810g(i, th2);
        }

        /* renamed from: c */
        public abstract Throwable mo39500c();

        /* renamed from: d */
        public abstract int mo39499d();
    }

    /* renamed from: androidx.camera.core.u$b */
    /* loaded from: classes.dex */
    public enum EnumC1928b {
        PENDING_OPEN,
        OPENING,
        OPEN,
        CLOSING,
        CLOSED
    }

    /* renamed from: a */
    public static AbstractC1926u m39506a(EnumC1928b bVar) {
        return m39505b(bVar, null);
    }

    /* renamed from: b */
    public static AbstractC1926u m39505b(EnumC1928b bVar, AbstractC1927a aVar) {
        return new C1806f(bVar, aVar);
    }

    /* renamed from: c */
    public abstract AbstractC1927a mo39504c();

    /* renamed from: d */
    public abstract EnumC1928b mo39503d();
}
