package p257o5;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.memory.C4920f;
import p095f4.AbstractC7011a;
import p170j5.C9489b;
import p380v5.C13434e;
import p394w3.C13740j;
import p437y5.C14256y;
import p455z3.AbstractC14535g;

/* renamed from: o5.c */
/* loaded from: classes7.dex */
public class C11200c implements AbstractC7011a {

    /* renamed from: a */
    private final C11199b f24986a;

    /* renamed from: b */
    private final C4920f f24987b;

    public C11200c(C14256y yVar) {
        this.f24987b = yVar.m1230d();
        this.f24986a = new C11199b(yVar.m1226h());
    }

    /* renamed from: b */
    private static BitmapFactory.Options m10501b(int i, Bitmap.Config config) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inSampleSize = i;
        options.inMutable = true;
        return options;
    }

    @Override // p095f4.AbstractC7011a
    @TargetApi(12)
    /* renamed from: a */
    public Bitmap mo10502a(int i, int i2, Bitmap.Config config) {
        Throwable th2;
        C13434e eVar;
        CloseableReference<AbstractC14535g> a = this.f24986a.m10503a((short) i, (short) i2);
        CloseableReference<byte[]> closeableReference = null;
        try {
            eVar = new C13434e(a);
            try {
                eVar.m3719K0(C9489b.f21011a);
                BitmapFactory.Options b = m10501b(eVar.m3715Q(), config);
                int size = a.m32039C().size();
                closeableReference = this.f24987b.m31291a(size + 2);
                byte[] C = closeableReference.m32039C();
                a.m32039C().mo266f(0, C, 0, size);
                Bitmap bitmap = (Bitmap) C13740j.m2834g(BitmapFactory.decodeByteArray(C, 0, size, b));
                bitmap.setHasAlpha(true);
                bitmap.eraseColor(0);
                CloseableReference.m32025t(closeableReference);
                C13434e.m3706h(eVar);
                CloseableReference.m32025t(a);
                return bitmap;
            } catch (Throwable th3) {
                th2 = th3;
                CloseableReference.m32025t(closeableReference);
                C13434e.m3706h(eVar);
                CloseableReference.m32025t(a);
                throw th2;
            }
        } catch (Throwable th4) {
            th2 = th4;
            eVar = null;
        }
    }
}
