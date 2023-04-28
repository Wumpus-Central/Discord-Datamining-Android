package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.Image;
import androidx.camera.core.ImageProxy;
import java.nio.ByteBuffer;
import p390w.C13671s2;

/* renamed from: androidx.camera.core.a */
/* loaded from: classes.dex */
final class C1765a implements ImageProxy {

    /* renamed from: k */
    private final Image f1590k;

    /* renamed from: l */
    private final C0020a[] f1591l;

    /* renamed from: m */
    private final AbstractC1876k1 f1592m;

    /* renamed from: androidx.camera.core.a$a */
    /* loaded from: classes.dex */
    private static final class C0020a implements ImageProxy.AbstractC1764a {

        /* renamed from: a */
        private final Image.Plane f1593a;

        C0020a(Image.Plane plane) {
            this.f1593a = plane;
        }

        @Override // androidx.camera.core.ImageProxy.AbstractC1764a
        /* renamed from: c */
        public synchronized ByteBuffer mo39901c() {
            return this.f1593a.getBuffer();
        }

        @Override // androidx.camera.core.ImageProxy.AbstractC1764a
        /* renamed from: d */
        public synchronized int mo39900d() {
            return this.f1593a.getRowStride();
        }

        @Override // androidx.camera.core.ImageProxy.AbstractC1764a
        /* renamed from: e */
        public synchronized int mo39899e() {
            return this.f1593a.getPixelStride();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1765a(Image image) {
        this.f1590k = image;
        Image.Plane[] planes = image.getPlanes();
        if (planes != null) {
            this.f1591l = new C0020a[planes.length];
            for (int i = 0; i < planes.length; i++) {
                this.f1591l[i] = new C0020a(planes[i]);
            }
        } else {
            this.f1591l = new C0020a[0];
        }
        this.f1592m = AbstractC1904p1.m39540d(C13671s2.m3091a(), image.getTimestamp(), 0, new Matrix());
    }

    @Override // androidx.camera.core.ImageProxy
    /* renamed from: O */
    public synchronized void mo39605O(Rect rect) {
        this.f1590k.setCropRect(rect);
    }

    @Override // androidx.camera.core.ImageProxy, java.lang.AutoCloseable
    public synchronized void close() {
        this.f1590k.close();
    }

    @Override // androidx.camera.core.ImageProxy
    /* renamed from: d0 */
    public synchronized ImageProxy.AbstractC1764a[] mo39701d0() {
        return this.f1591l;
    }

    @Override // androidx.camera.core.ImageProxy
    public synchronized int getFormat() {
        return this.f1590k.getFormat();
    }

    @Override // androidx.camera.core.ImageProxy
    public synchronized int getHeight() {
        return this.f1590k.getHeight();
    }

    @Override // androidx.camera.core.ImageProxy
    public synchronized int getWidth() {
        return this.f1590k.getWidth();
    }

    @Override // androidx.camera.core.ImageProxy
    /* renamed from: p0 */
    public AbstractC1876k1 mo39604p0() {
        return this.f1592m;
    }

    @Override // androidx.camera.core.ImageProxy
    /* renamed from: r0 */
    public synchronized Image mo39699r0() {
        return this.f1590k;
    }
}
