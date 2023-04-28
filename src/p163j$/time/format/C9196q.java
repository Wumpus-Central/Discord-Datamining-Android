package p163j$.time.format;

import p163j$.time.AbstractC9209m;
import p163j$.time.C9203g;
import p163j$.time.chrono.AbstractC9170b;
import p163j$.time.chrono.AbstractC9175g;
import p163j$.time.temporal.AbstractC9222j;
import p163j$.time.temporal.AbstractC9223k;
import p163j$.time.temporal.AbstractC9224l;
import p163j$.time.temporal.AbstractC9226n;
import p163j$.time.temporal.C9229q;
import p163j$.time.temporal.EnumC9213a;

/* renamed from: j$.time.format.q */
/* loaded from: classes2.dex */
final class C9196q implements AbstractC9223k {

    /* renamed from: a */
    final /* synthetic */ AbstractC9170b f20190a;

    /* renamed from: b */
    final /* synthetic */ AbstractC9223k f20191b;

    /* renamed from: c */
    final /* synthetic */ AbstractC9175g f20192c;

    /* renamed from: d */
    final /* synthetic */ AbstractC9209m f20193d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9196q(C9203g gVar, AbstractC9223k kVar, AbstractC9175g gVar2, AbstractC9209m mVar) {
        this.f20190a = gVar;
        this.f20191b = kVar;
        this.f20192c = gVar2;
        this.f20193d = mVar;
    }

    @Override // p163j$.time.temporal.AbstractC9223k
    /* renamed from: a */
    public final C9229q mo16635a(AbstractC9224l lVar) {
        AbstractC9170b bVar = this.f20190a;
        return (bVar == null || !lVar.mo16628c()) ? this.f20191b.mo16635a(lVar) : ((C9203g) bVar).mo16635a(lVar);
    }

    @Override // p163j$.time.temporal.AbstractC9223k
    /* renamed from: b */
    public final boolean mo16634b(AbstractC9224l lVar) {
        AbstractC9170b bVar = this.f20190a;
        return (bVar == null || !lVar.mo16628c()) ? this.f20191b.mo16634b(lVar) : ((C9203g) bVar).mo16634b(lVar);
    }

    @Override // p163j$.time.temporal.AbstractC9223k
    /* renamed from: c */
    public final long mo16633c(AbstractC9224l lVar) {
        AbstractC9170b bVar = this.f20190a;
        return (bVar == null || !lVar.mo16628c()) ? this.f20191b.mo16633c(lVar) : ((C9203g) bVar).mo16633c(lVar);
    }

    @Override // p163j$.time.temporal.AbstractC9223k
    /* renamed from: d */
    public final Object mo16632d(AbstractC9226n nVar) {
        return nVar == AbstractC9222j.m16642d() ? this.f20192c : nVar == AbstractC9222j.m16636j() ? this.f20193d : nVar == AbstractC9222j.m16638h() ? this.f20191b.mo16632d(nVar) : nVar.mo16624a(this);
    }

    @Override // p163j$.time.temporal.AbstractC9223k
    /* renamed from: e */
    public final /* synthetic */ int mo16631e(EnumC9213a aVar) {
        return AbstractC9222j.m16645a(this, aVar);
    }
}
