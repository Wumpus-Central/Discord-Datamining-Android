package p380v5;

import android.graphics.Bitmap;
import com.facebook.common.references.CloseableReference;
import com.facebook.imageutils.C5064a;
import p005a4.AbstractC1260a;
import p005a4.AbstractC1262c;
import p394w3.C13740j;

/* renamed from: v5.d */
/* loaded from: classes7.dex */
public class C13433d extends AbstractC13431b implements AbstractC1260a {

    /* renamed from: m */
    private CloseableReference<Bitmap> f29980m;

    /* renamed from: n */
    private volatile Bitmap f29981n;

    /* renamed from: o */
    private final AbstractC13438i f29982o;

    /* renamed from: p */
    private final int f29983p;

    /* renamed from: q */
    private final int f29984q;

    public C13433d(Bitmap bitmap, AbstractC1262c<Bitmap> cVar, AbstractC13438i iVar, int i) {
        this(bitmap, cVar, iVar, i, 0);
    }

    /* renamed from: r */
    private synchronized CloseableReference<Bitmap> m3730r() {
        CloseableReference<Bitmap> closeableReference;
        closeableReference = this.f29980m;
        this.f29980m = null;
        this.f29981n = null;
        return closeableReference;
    }

    /* renamed from: s */
    private static int m3729s(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getHeight();
    }

    /* renamed from: t */
    private static int m3728t(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getWidth();
    }

    /* renamed from: C */
    public int m3735C() {
        return this.f29983p;
    }

    @Override // p380v5.AbstractC13432c
    /* renamed from: b */
    public AbstractC13438i mo3734b() {
        return this.f29982o;
    }

    @Override // p380v5.AbstractC13432c, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        CloseableReference<Bitmap> r = m3730r();
        if (r != null) {
            r.close();
        }
    }

    @Override // p380v5.AbstractC13432c
    /* renamed from: g */
    public int mo3733g() {
        return C5064a.m30859e(this.f29981n);
    }

    @Override // com.facebook.imagepipeline.image.ImageInfo
    public int getHeight() {
        int i;
        if (this.f29983p % 180 != 0 || (i = this.f29984q) == 5 || i == 7) {
            return m3728t(this.f29981n);
        }
        return m3729s(this.f29981n);
    }

    @Override // com.facebook.imagepipeline.image.ImageInfo
    public int getWidth() {
        int i;
        if (this.f29983p % 180 != 0 || (i = this.f29984q) == 5 || i == 7) {
            return m3729s(this.f29981n);
        }
        return m3728t(this.f29981n);
    }

    @Override // p380v5.AbstractC13432c
    public synchronized boolean isClosed() {
        boolean z;
        if (this.f29980m == null) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    @Override // p380v5.AbstractC13431b
    /* renamed from: n */
    public Bitmap mo3732n() {
        return this.f29981n;
    }

    /* renamed from: p */
    public synchronized CloseableReference<Bitmap> m3731p() {
        return CloseableReference.m32027r(this.f29980m);
    }

    /* renamed from: z */
    public int m3727z() {
        return this.f29984q;
    }

    public C13433d(Bitmap bitmap, AbstractC1262c<Bitmap> cVar, AbstractC13438i iVar, int i, int i2) {
        this.f29981n = (Bitmap) C13740j.m2834g(bitmap);
        this.f29980m = CloseableReference.m32033Y(this.f29981n, (AbstractC1262c) C13740j.m2834g(cVar));
        this.f29982o = iVar;
        this.f29983p = i;
        this.f29984q = i2;
    }

    public C13433d(CloseableReference<Bitmap> closeableReference, AbstractC13438i iVar, int i) {
        this(closeableReference, iVar, i, 0);
    }

    public C13433d(CloseableReference<Bitmap> closeableReference, AbstractC13438i iVar, int i, int i2) {
        CloseableReference<Bitmap> closeableReference2 = (CloseableReference) C13740j.m2834g(closeableReference.m32028n());
        this.f29980m = closeableReference2;
        this.f29981n = closeableReference2.m32039C();
        this.f29982o = iVar;
        this.f29983p = i;
        this.f29984q = i2;
    }
}
