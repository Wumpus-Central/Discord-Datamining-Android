package androidx.camera.core;

import android.graphics.Rect;
import android.media.Image;
import androidx.camera.core.ImageProxy;
import java.util.HashSet;
import java.util.Set;

/* renamed from: androidx.camera.core.i0 */
/* loaded from: classes.dex */
abstract class AbstractC1833i0 implements ImageProxy {

    /* renamed from: k */
    protected final ImageProxy f1782k;

    /* renamed from: l */
    private final Set<AbstractC1834a> f1783l = new HashSet();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.core.i0$a */
    /* loaded from: classes.dex */
    public interface AbstractC1834a {
        /* renamed from: c */
        void mo39498c(ImageProxy imageProxy);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1833i0(ImageProxy imageProxy) {
        this.f1782k = imageProxy;
    }

    @Override // androidx.camera.core.ImageProxy
    /* renamed from: O */
    public synchronized void mo39605O(Rect rect) {
        this.f1782k.mo39605O(rect);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized void m39702b(AbstractC1834a aVar) {
        this.f1783l.add(aVar);
    }

    @Override // androidx.camera.core.ImageProxy, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            this.f1782k.close();
        }
        m39700g();
    }

    @Override // androidx.camera.core.ImageProxy
    /* renamed from: d0 */
    public synchronized ImageProxy.AbstractC1764a[] mo39701d0() {
        return this.f1782k.mo39701d0();
    }

    /* renamed from: g */
    protected void m39700g() {
        HashSet<AbstractC1834a> hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.f1783l);
        }
        for (AbstractC1834a aVar : hashSet) {
            aVar.mo39498c(this);
        }
    }

    @Override // androidx.camera.core.ImageProxy
    public synchronized int getFormat() {
        return this.f1782k.getFormat();
    }

    @Override // androidx.camera.core.ImageProxy
    public synchronized int getHeight() {
        return this.f1782k.getHeight();
    }

    @Override // androidx.camera.core.ImageProxy
    public synchronized int getWidth() {
        return this.f1782k.getWidth();
    }

    @Override // androidx.camera.core.ImageProxy
    /* renamed from: p0 */
    public synchronized AbstractC1876k1 mo39604p0() {
        return this.f1782k.mo39604p0();
    }

    @Override // androidx.camera.core.ImageProxy
    /* renamed from: r0 */
    public synchronized Image mo39699r0() {
        return this.f1782k.mo39699r0();
    }
}
