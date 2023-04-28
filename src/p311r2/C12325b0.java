package p311r2;

import android.graphics.PointF;
import p331s2.AbstractC12777c;

/* renamed from: r2.b0 */
/* loaded from: classes.dex */
public class C12325b0 implements AbstractC12349n0<PointF> {

    /* renamed from: a */
    public static final C12325b0 f27694a = new C12325b0();

    private C12325b0() {
    }

    /* renamed from: b */
    public PointF mo7097a(AbstractC12777c cVar, float f) {
        AbstractC12777c.EnumC12779b Q = cVar.mo5497Q();
        if (Q == AbstractC12777c.EnumC12779b.BEGIN_ARRAY) {
            return C12354s.m7091e(cVar, f);
        }
        if (Q == AbstractC12777c.EnumC12779b.BEGIN_OBJECT) {
            return C12354s.m7091e(cVar, f);
        }
        if (Q == AbstractC12777c.EnumC12779b.NUMBER) {
            PointF pointF = new PointF(((float) cVar.mo5486s()) * f, ((float) cVar.mo5486s()) * f);
            while (cVar.mo5488p()) {
                cVar.mo5494Y();
            }
            return pointF;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is " + Q);
    }
}
