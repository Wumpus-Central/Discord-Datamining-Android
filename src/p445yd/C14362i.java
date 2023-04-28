package p445yd;

import p066dd.C6446o;

/* renamed from: yd.i */
/* loaded from: classes3.dex */
public final class C14362i {

    /* renamed from: a */
    private final boolean f32512a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C14362i(boolean z) {
        this.f32512a = z;
    }

    /* renamed from: a */
    public void m779a(C6446o[] oVarArr) {
        if (this.f32512a && oVarArr != null && oVarArr.length >= 3) {
            C6446o oVar = oVarArr[0];
            oVarArr[0] = oVarArr[2];
            oVarArr[2] = oVar;
        }
    }
}
