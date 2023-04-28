package p319ra;

import p401wa.AbstractC13852d;
import p401wa.C13853e;

/* renamed from: ra.k */
/* loaded from: classes3.dex */
final class C12520k extends AbstractC12532q {

    /* renamed from: a */
    final /* synthetic */ C12504e0 f28182a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12520k(BinderC12526n nVar, C12504e0 e0Var) {
        super(null);
        this.f28182a = e0Var;
    }

    @Override // com.google.android.gms.common.api.internal.C5378d.AbstractC5380b
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6569a(Object obj) {
        boolean e0;
        AbstractC13852d dVar = (AbstractC13852d) obj;
        e0 = BinderC12526n.m6585e0(this.f28182a);
        if (e0) {
            C13853e eVar = new C13853e();
            eVar.m2534d(this.f28182a.m6605u());
            eVar.m2537a(this.f28182a.m6608p());
            dVar.m2539a("__UNRECOGNIZED_BLUETOOTH_DEVICE__", eVar.m2533e());
            return;
        }
        String r = this.f28182a.m6607r();
        C13853e eVar2 = new C13853e();
        eVar2.m2534d(this.f28182a.m6605u());
        eVar2.m2535c(this.f28182a.m6606t());
        eVar2.m2536b(this.f28182a.m6604z());
        dVar.m2539a(r, eVar2.m2533e());
    }
}
