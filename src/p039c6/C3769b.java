package p039c6;

import android.graphics.Bitmap;
import com.facebook.common.references.CloseableReference;

/* renamed from: c6.b */
/* loaded from: classes7.dex */
public final class C3769b {
    /* renamed from: a */
    public static boolean m33612a(AbstractC3768a aVar, CloseableReference<Bitmap> closeableReference) {
        if (aVar == null || closeableReference == null) {
            return false;
        }
        Bitmap C = closeableReference.m32039C();
        if (aVar.m33614a()) {
            C.setHasAlpha(true);
        }
        aVar.m33613b(C);
        return true;
    }
}
