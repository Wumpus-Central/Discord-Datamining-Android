package p319ra;

import com.google.android.gms.common.api.Status;
import p400w9.AbstractC13815c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ra.b1 */
/* loaded from: classes3.dex */
public final class C12496b1 extends AbstractC12502d1 {

    /* renamed from: a */
    final /* synthetic */ Status f28149a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12496b1(BinderC12499c1 c1Var, Status status) {
        this.f28149a = status;
    }

    @Override // com.google.android.gms.common.api.internal.C5378d.AbstractC5380b
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6569a(Object obj) {
        AbstractC13815c cVar = (AbstractC13815c) obj;
        if (this.f28149a.m29108z()) {
            cVar.mo2591a(this.f28149a);
        } else {
            cVar.mo2590b(this.f28149a);
        }
    }
}
