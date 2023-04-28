package p257o5;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import com.facebook.imageutils.C5064a;
import p314r5.C12387a;
import p394w3.C13740j;
import p437y5.AbstractC14235h;

@TargetApi(21)
/* renamed from: o5.a */
/* loaded from: classes7.dex */
public class C11198a extends PlatformBitmapFactory {

    /* renamed from: a */
    private final AbstractC14235h f24981a;

    /* renamed from: b */
    private final C12387a f24982b;

    public C11198a(AbstractC14235h hVar, C12387a aVar) {
        this.f24981a = hVar;
        this.f24982b = aVar;
    }

    @Override // com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory
    /* renamed from: d */
    public CloseableReference<Bitmap> mo10504d(int i, int i2, Bitmap.Config config) {
        boolean z;
        Bitmap bitmap = this.f24981a.get(C5064a.m30860d(i, i2, config));
        if (bitmap.getAllocationByteCount() >= i * i2 * C5064a.m30861c(config)) {
            z = true;
        } else {
            z = false;
        }
        C13740j.m2839b(Boolean.valueOf(z));
        bitmap.reconfigure(i, i2, config);
        return this.f24982b.m6972c(bitmap, this.f24981a);
    }
}
