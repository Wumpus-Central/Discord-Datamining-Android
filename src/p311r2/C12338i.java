package p311r2;

import p223m2.C10470b;
import p331s2.AbstractC12777c;

/* renamed from: r2.i */
/* loaded from: classes.dex */
public class C12338i implements AbstractC12349n0<C10470b> {

    /* renamed from: a */
    public static final C12338i f27709a = new C12338i();

    /* renamed from: b */
    private static final AbstractC12777c.C12778a f27710b = AbstractC12777c.C12778a.m5511a("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of");

    private C12338i() {
    }

    /* renamed from: b */
    public C10470b mo7097a(AbstractC12777c cVar, float f) {
        C10470b.EnumC10471a aVar = C10470b.EnumC10471a.CENTER;
        cVar.mo5492h();
        C10470b.EnumC10471a aVar2 = aVar;
        String str = null;
        String str2 = null;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = true;
        while (cVar.mo5488p()) {
            switch (cVar.mo5496S(f27710b)) {
                case 0:
                    str = cVar.mo5509C();
                    break;
                case 1:
                    str2 = cVar.mo5509C();
                    break;
                case 2:
                    f2 = (float) cVar.mo5486s();
                    break;
                case 3:
                    int t = cVar.mo5485t();
                    aVar2 = C10470b.EnumC10471a.CENTER;
                    if (t <= aVar2.ordinal() && t >= 0) {
                        aVar2 = C10470b.EnumC10471a.values()[t];
                        break;
                    }
                    break;
                case 4:
                    i = cVar.mo5485t();
                    break;
                case 5:
                    f3 = (float) cVar.mo5486s();
                    break;
                case 6:
                    f4 = (float) cVar.mo5486s();
                    break;
                case 7:
                    i2 = C12354s.m7092d(cVar);
                    break;
                case 8:
                    i3 = C12354s.m7092d(cVar);
                    break;
                case 9:
                    f5 = (float) cVar.mo5486s();
                    break;
                case 10:
                    z = cVar.mo5487r();
                    break;
                default:
                    cVar.mo5495U();
                    cVar.mo5494Y();
                    break;
            }
        }
        cVar.mo5489l();
        return new C10470b(str, str2, f2, aVar2, i, f3, f4, i2, i3, f5, z);
    }
}
