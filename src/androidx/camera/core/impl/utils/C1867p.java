package androidx.camera.core.impl.utils;

/* renamed from: androidx.camera.core.impl.utils.p */
/* loaded from: classes.dex */
final class C1867p {

    /* renamed from: a */
    private final long f1847a;

    /* renamed from: b */
    private final long f1848b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1867p(long j, long j2) {
        this.f1847a = j;
        this.f1848b = j2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public long m39617a() {
        return this.f1848b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public long m39616b() {
        return this.f1847a;
    }

    public String toString() {
        return this.f1847a + "/" + this.f1848b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1867p(double d) {
        this((long) (d * 10000.0d), 10000L);
    }
}
