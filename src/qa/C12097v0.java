package qa;

import android.os.IBinder;
import android.os.Parcel;
import p155ia.C8359p;
import p155ia.C8366s;

/* renamed from: qa.v0 */
/* loaded from: classes3.dex */
public final class C12097v0 extends C12055a0 implements AbstractC12093t0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C12097v0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
    }

    @Override // qa.AbstractC12093t0
    /* renamed from: c0 */
    public final void mo7849c0(AbstractC12089r0 r0Var, C8359p pVar) {
        Parcel b = m7893b();
        C12083o0.m7861b(b, r0Var);
        C12083o0.m7860c(b, pVar);
        m7892c(1, b);
    }

    @Override // qa.AbstractC12093t0
    /* renamed from: x */
    public final void mo7848x(AbstractC12089r0 r0Var, C8366s sVar) {
        Parcel b = m7893b();
        C12083o0.m7861b(b, r0Var);
        C12083o0.m7860c(b, sVar);
        m7892c(2, b);
    }
}
