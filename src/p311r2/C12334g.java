package p311r2;

import android.graphics.Color;
import p331s2.AbstractC12777c;

/* renamed from: r2.g */
/* loaded from: classes.dex */
public class C12334g implements AbstractC12349n0<Integer> {

    /* renamed from: a */
    public static final C12334g f27704a = new C12334g();

    private C12334g() {
    }

    /* renamed from: b */
    public Integer mo7097a(AbstractC12777c cVar, float f) {
        boolean z;
        double d;
        if (cVar.mo5497Q() == AbstractC12777c.EnumC12779b.BEGIN_ARRAY) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            cVar.mo5493g();
        }
        double s = cVar.mo5486s();
        double s2 = cVar.mo5486s();
        double s3 = cVar.mo5486s();
        if (cVar.mo5497Q() == AbstractC12777c.EnumC12779b.NUMBER) {
            d = cVar.mo5486s();
        } else {
            d = 1.0d;
        }
        if (z) {
            cVar.mo5491i();
        }
        if (s <= 1.0d && s2 <= 1.0d && s3 <= 1.0d) {
            s *= 255.0d;
            s2 *= 255.0d;
            s3 *= 255.0d;
            if (d <= 1.0d) {
                d *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) d, (int) s, (int) s2, (int) s3));
    }
}
