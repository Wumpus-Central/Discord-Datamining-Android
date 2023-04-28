package androidx.camera.core;

import android.graphics.Rect;
import android.util.Size;

/* renamed from: androidx.camera.core.k2 */
/* loaded from: classes.dex */
final class C1877k2 extends AbstractC1833i0 {

    /* renamed from: m */
    private final AbstractC1876k1 f1866m;

    /* renamed from: n */
    private Rect f1867n;

    /* renamed from: o */
    private final int f1868o;

    /* renamed from: p */
    private final int f1869p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1877k2(ImageProxy imageProxy, AbstractC1876k1 k1Var) {
        this(imageProxy, null, k1Var);
    }

    @Override // androidx.camera.core.AbstractC1833i0, androidx.camera.core.ImageProxy
    /* renamed from: O */
    public synchronized void mo39605O(Rect rect) {
        if (rect != null) {
            Rect rect2 = new Rect(rect);
            if (!rect2.intersect(0, 0, getWidth(), getHeight())) {
                rect2.setEmpty();
            }
            rect = rect2;
        }
        this.f1867n = rect;
    }

    @Override // androidx.camera.core.AbstractC1833i0, androidx.camera.core.ImageProxy
    public synchronized int getHeight() {
        return this.f1869p;
    }

    @Override // androidx.camera.core.AbstractC1833i0, androidx.camera.core.ImageProxy
    public synchronized int getWidth() {
        return this.f1868o;
    }

    @Override // androidx.camera.core.AbstractC1833i0, androidx.camera.core.ImageProxy
    /* renamed from: p0 */
    public AbstractC1876k1 mo39604p0() {
        return this.f1866m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1877k2(ImageProxy imageProxy, Size size, AbstractC1876k1 k1Var) {
        super(imageProxy);
        if (size == null) {
            this.f1868o = super.getWidth();
            this.f1869p = super.getHeight();
        } else {
            this.f1868o = size.getWidth();
            this.f1869p = size.getHeight();
        }
        this.f1866m = k1Var;
    }
}
