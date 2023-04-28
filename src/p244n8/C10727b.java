package p244n8;

import p079e7.C6722k;
import p119g9.C7510a;
import p119g9.C7544l0;
import p228m7.AbstractC10514i;
import p228m7.AbstractC10515j;
import p228m7.AbstractC10516k;
import p228m7.C10533x;
import p336s7.C12809f;
import p348t7.C12985g;
import p398w7.C13754b;
import p398w7.C13760e;
import p398w7.C13767h;
import p398w7.C13768h0;

/* renamed from: n8.b */
/* loaded from: classes7.dex */
public final class C10727b implements AbstractC10741j {

    /* renamed from: d */
    private static final C10533x f23787d = new C10533x();

    /* renamed from: a */
    final AbstractC10514i f23788a;

    /* renamed from: b */
    private final C6722k f23789b;

    /* renamed from: c */
    private final C7544l0 f23790c;

    public C10727b(AbstractC10514i iVar, C6722k kVar, C7544l0 l0Var) {
        this.f23788a = iVar;
        this.f23789b = kVar;
        this.f23790c = l0Var;
    }

    @Override // p244n8.AbstractC10741j
    /* renamed from: a */
    public boolean mo12480a(AbstractC10515j jVar) {
        return this.f23788a.mo2224e(jVar, f23787d) == 0;
    }

    @Override // p244n8.AbstractC10741j
    /* renamed from: b */
    public void mo12479b(AbstractC10516k kVar) {
        this.f23788a.mo2227b(kVar);
    }

    @Override // p244n8.AbstractC10741j
    /* renamed from: c */
    public void mo12478c() {
        this.f23788a.mo2228a(0L, 0L);
    }

    @Override // p244n8.AbstractC10741j
    /* renamed from: d */
    public boolean mo12477d() {
        AbstractC10514i iVar = this.f23788a;
        return (iVar instanceof C13768h0) || (iVar instanceof C12985g);
    }

    @Override // p244n8.AbstractC10741j
    /* renamed from: e */
    public boolean mo12476e() {
        AbstractC10514i iVar = this.f23788a;
        return (iVar instanceof C13767h) || (iVar instanceof C13754b) || (iVar instanceof C13760e) || (iVar instanceof C12809f);
    }

    @Override // p244n8.AbstractC10741j
    /* renamed from: f */
    public AbstractC10741j mo12475f() {
        AbstractC10514i iVar;
        C7510a.m22366f(!mo12477d());
        AbstractC10514i iVar2 = this.f23788a;
        if (iVar2 instanceof C10759u) {
            iVar = new C10759u(this.f23789b.f14320m, this.f23790c);
        } else if (iVar2 instanceof C13767h) {
            iVar = new C13767h();
        } else if (iVar2 instanceof C13754b) {
            iVar = new C13754b();
        } else if (iVar2 instanceof C13760e) {
            iVar = new C13760e();
        } else if (iVar2 instanceof C12809f) {
            iVar = new C12809f();
        } else {
            throw new IllegalStateException("Unexpected extractor type for recreation: " + this.f23788a.getClass().getSimpleName());
        }
        return new C10727b(iVar, this.f23789b, this.f23790c);
    }
}
