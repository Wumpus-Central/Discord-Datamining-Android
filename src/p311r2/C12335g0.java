package p311r2;

import p331s2.AbstractC12777c;
import p358u2.C13181d;

/* renamed from: r2.g0 */
/* loaded from: classes.dex */
public class C12335g0 implements AbstractC12349n0<C13181d> {

    /* renamed from: a */
    public static final C12335g0 f27705a = new C12335g0();

    private C12335g0() {
    }

    /* renamed from: b */
    public C13181d mo7097a(AbstractC12777c cVar, float f) {
        boolean z;
        if (cVar.mo5497Q() == AbstractC12777c.EnumC12779b.BEGIN_ARRAY) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            cVar.mo5493g();
        }
        float s = (float) cVar.mo5486s();
        float s2 = (float) cVar.mo5486s();
        while (cVar.mo5488p()) {
            cVar.mo5494Y();
        }
        if (z) {
            cVar.mo5491i();
        }
        return new C13181d((s / 100.0f) * f, (s2 / 100.0f) * f);
    }
}
