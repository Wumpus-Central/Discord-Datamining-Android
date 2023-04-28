package p437y5;

import android.graphics.Bitmap;
import p394w3.C13740j;

/* renamed from: y5.o */
/* loaded from: classes7.dex */
public class C14244o implements AbstractC14235h {
    /* renamed from: g */
    public Bitmap get(int i) {
        return Bitmap.createBitmap(1, (int) Math.ceil(i / 2.0d), Bitmap.Config.RGB_565);
    }

    /* renamed from: h */
    public void release(Bitmap bitmap) {
        C13740j.m2834g(bitmap);
        bitmap.recycle();
    }
}
