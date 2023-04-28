package p257o5;

import android.graphics.Bitmap;
import p005a4.AbstractC1262c;

/* renamed from: o5.e */
/* loaded from: classes7.dex */
public class C11202e implements AbstractC1262c<Bitmap> {

    /* renamed from: a */
    private static C11202e f24988a;

    private C11202e() {
    }

    /* renamed from: a */
    public static C11202e m10499a() {
        if (f24988a == null) {
            f24988a = new C11202e();
        }
        return f24988a;
    }

    /* renamed from: b */
    public void release(Bitmap bitmap) {
        bitmap.recycle();
    }
}
