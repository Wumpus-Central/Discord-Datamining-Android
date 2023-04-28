package androidx.camera.core;

import android.media.Image;
import android.media.ImageReader;
import android.view.Surface;
import androidx.camera.core.impl.utils.C1868q;
import java.util.concurrent.Executor;
import p390w.AbstractC13635m1;

/* renamed from: androidx.camera.core.d */
/* loaded from: classes.dex */
final class C1797d implements AbstractC13635m1 {

    /* renamed from: a */
    private final ImageReader f1683a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1797d(ImageReader imageReader) {
        this.f1683a = imageReader;
    }

    /* renamed from: i */
    private boolean m39799i(RuntimeException runtimeException) {
        return "ImageReaderContext is not initialized".equals(runtimeException.getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ void m39798j(AbstractC13635m1.AbstractC13636a aVar) {
        aVar.mo3152a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m39797k(Executor executor, final AbstractC13635m1.AbstractC13636a aVar, ImageReader imageReader) {
        executor.execute(new Runnable() { // from class: androidx.camera.core.c
            @Override // java.lang.Runnable
            public final void run() {
                C1797d.this.m39798j(aVar);
            }
        });
    }

    @Override // p390w.AbstractC13635m1
    /* renamed from: a */
    public synchronized int mo3158a() {
        return this.f1683a.getImageFormat();
    }

    @Override // p390w.AbstractC13635m1
    /* renamed from: b */
    public synchronized int mo3157b() {
        return this.f1683a.getMaxImages();
    }

    @Override // p390w.AbstractC13635m1
    public synchronized void close() {
        this.f1683a.close();
    }

    @Override // p390w.AbstractC13635m1
    /* renamed from: d */
    public synchronized ImageProxy mo3156d() {
        Image image;
        try {
            image = this.f1683a.acquireLatestImage();
        } catch (RuntimeException e) {
            if (m39799i(e)) {
                image = null;
            } else {
                throw e;
            }
        }
        if (image == null) {
            return null;
        }
        return new C1765a(image);
    }

    @Override // p390w.AbstractC13635m1
    /* renamed from: e */
    public synchronized void mo3155e() {
        this.f1683a.setOnImageAvailableListener(null, null);
    }

    @Override // p390w.AbstractC13635m1
    /* renamed from: f */
    public synchronized void mo3154f(final AbstractC13635m1.AbstractC13636a aVar, final Executor executor) {
        this.f1683a.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: androidx.camera.core.b
            @Override // android.media.ImageReader.OnImageAvailableListener
            public final void onImageAvailable(ImageReader imageReader) {
                C1797d.this.m39797k(executor, aVar, imageReader);
            }
        }, C1868q.m39615a());
    }

    @Override // p390w.AbstractC13635m1
    /* renamed from: g */
    public synchronized ImageProxy mo3153g() {
        Image image;
        try {
            image = this.f1683a.acquireNextImage();
        } catch (RuntimeException e) {
            if (m39799i(e)) {
                image = null;
            } else {
                throw e;
            }
        }
        if (image == null) {
            return null;
        }
        return new C1765a(image);
    }

    @Override // p390w.AbstractC13635m1
    public synchronized int getHeight() {
        return this.f1683a.getHeight();
    }

    @Override // p390w.AbstractC13635m1
    public synchronized Surface getSurface() {
        return this.f1683a.getSurface();
    }

    @Override // p390w.AbstractC13635m1
    public synchronized int getWidth() {
        return this.f1683a.getWidth();
    }
}
