package p437y5;

import android.graphics.Bitmap;
import com.facebook.imageutils.C5064a;
import p414x3.C13925a;

/* renamed from: y5.i */
/* loaded from: classes7.dex */
public class C14236i extends AbstractC14247r<Bitmap> {
    /* renamed from: c */
    public Bitmap get(int i) {
        Bitmap bitmap = (Bitmap) super.get(i);
        if (bitmap == null || !m1309e(bitmap)) {
            return null;
        }
        bitmap.eraseColor(0);
        return bitmap;
    }

    /* renamed from: d */
    public int mo1262a(Bitmap bitmap) {
        return C5064a.m30859e(bitmap);
    }

    /* renamed from: e */
    protected boolean m1309e(Bitmap bitmap) {
        if (bitmap == null) {
            return false;
        }
        if (bitmap.isRecycled()) {
            C13925a.m2298N("BitmapPoolBackend", "Cannot reuse a recycled bitmap: %s", bitmap);
            return false;
        } else if (bitmap.isMutable()) {
            return true;
        } else {
            C13925a.m2298N("BitmapPoolBackend", "Cannot reuse an immutable bitmap: %s", bitmap);
            return false;
        }
    }

    /* renamed from: f */
    public void put(Bitmap bitmap) {
        if (m1309e(bitmap)) {
            super.put(bitmap);
        }
    }
}
