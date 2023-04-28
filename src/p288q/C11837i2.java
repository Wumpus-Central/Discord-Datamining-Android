package p288q;

import p272p.C11502b;
import p355u.C13167g;
import p390w.AbstractC13697x2;
import p390w.C13594f1;
import p390w.C13639n0;

/* renamed from: q.i2 */
/* loaded from: classes.dex */
final class C11837i2 extends C11883o0 {

    /* renamed from: c */
    static final C11837i2 f26424c = new C11837i2(new C13167g());

    /* renamed from: b */
    private final C13167g f26425b;

    private C11837i2(C13167g gVar) {
        this.f26425b = gVar;
    }

    @Override // p288q.C11883o0, p390w.C13639n0.AbstractC13641b
    /* renamed from: a */
    public void mo3128a(AbstractC13697x2<?> x2Var, C13639n0.C13640a aVar) {
        super.mo3128a(x2Var, aVar);
        if (x2Var instanceof C13594f1) {
            C13594f1 f1Var = (C13594f1) x2Var;
            C11502b.C11503a aVar2 = new C11502b.C11503a();
            if (f1Var.m3272O()) {
                this.f26425b.m4430a(f1Var.m3280G(), aVar2);
            }
            aVar.m3140e(aVar2.m9555b());
            return;
        }
        throw new IllegalArgumentException("config is not ImageCaptureConfig");
    }
}
