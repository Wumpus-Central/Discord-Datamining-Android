package p437y5;

import android.graphics.Bitmap;
import java.util.Set;
import p394w3.C13740j;
import p394w3.C13742l;

/* renamed from: y5.p */
/* loaded from: classes7.dex */
public class C14245p implements AbstractC14235h {

    /* renamed from: a */
    private final Set<Bitmap> f32168a = C13742l.m2828b();

    /* renamed from: g */
    public Bitmap get(int i) {
        Bitmap createBitmap = Bitmap.createBitmap(1, (int) Math.ceil(i / 2.0d), Bitmap.Config.RGB_565);
        this.f32168a.add(createBitmap);
        return createBitmap;
    }

    /* renamed from: h */
    public void release(Bitmap bitmap) {
        C13740j.m2834g(bitmap);
        this.f32168a.remove(bitmap);
        bitmap.recycle();
    }
}
