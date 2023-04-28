package sa;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: sa.a0 */
/* loaded from: classes3.dex */
public final class C12828a0 extends AbstractC12830b0 {

    /* renamed from: m */
    final transient int f28893m;

    /* renamed from: n */
    final transient int f28894n;

    /* renamed from: o */
    final /* synthetic */ AbstractC12830b0 f28895o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12828a0(AbstractC12830b0 b0Var, int i, int i2) {
        this.f28895o = b0Var;
        this.f28893m = i;
        this.f28894n = i2;
    }

    @Override // sa.AbstractC12858y
    /* renamed from: b */
    final int mo5256b() {
        return this.f28895o.mo5255e() + this.f28893m + this.f28894n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // sa.AbstractC12858y
    /* renamed from: e */
    public final int mo5255e() {
        return this.f28895o.mo5255e() + this.f28893m;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C12853t.m5265a(i, this.f28894n, "index");
        return this.f28895o.get(i + this.f28893m);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // sa.AbstractC12858y
    /* renamed from: i */
    public final boolean mo5252i() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // sa.AbstractC12858y
    /* renamed from: j */
    public final Object[] mo5251j() {
        return this.f28895o.mo5251j();
    }

    @Override // sa.AbstractC12830b0
    /* renamed from: p */
    public final AbstractC12830b0 mo5317p(int i, int i2) {
        C12853t.m5262d(i, i2, this.f28894n);
        AbstractC12830b0 b0Var = this.f28895o;
        int i3 = this.f28893m;
        return b0Var.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f28894n;
    }

    @Override // sa.AbstractC12830b0, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
