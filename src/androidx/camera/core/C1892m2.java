package androidx.camera.core;

/* renamed from: androidx.camera.core.m2 */
/* loaded from: classes.dex */
final class C1892m2 extends AbstractC1833i0 {

    /* renamed from: m */
    private boolean f1893m = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1892m2(ImageProxy imageProxy) {
        super(imageProxy);
    }

    @Override // androidx.camera.core.AbstractC1833i0, androidx.camera.core.ImageProxy, java.lang.AutoCloseable
    public synchronized void close() {
        if (!this.f1893m) {
            this.f1893m = true;
            super.close();
        }
    }
}
