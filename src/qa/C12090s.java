package qa;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: qa.s */
/* loaded from: classes3.dex */
public final class C12090s extends AbstractC12086q {

    /* renamed from: m */
    private final transient int f27137m;

    /* renamed from: n */
    private final transient int f27138n;

    /* renamed from: o */
    private final /* synthetic */ AbstractC12086q f27139o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12090s(AbstractC12086q qVar, int i, int i2) {
        this.f27139o = qVar;
        this.f27137m = i;
        this.f27138n = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // qa.AbstractC12088r
    /* renamed from: f */
    public final Object[] mo7843f() {
        return this.f27139o.mo7843f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // qa.AbstractC12088r
    /* renamed from: g */
    public final int mo7842g() {
        return this.f27139o.mo7842g() + this.f27137m;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C12080n.m7872a(i, this.f27138n);
        return this.f27139o.get(i + this.f27137m);
    }

    @Override // qa.AbstractC12088r
    /* renamed from: i */
    final int mo7841i() {
        return this.f27139o.mo7842g() + this.f27137m + this.f27138n;
    }

    @Override // qa.AbstractC12086q
    /* renamed from: j */
    public final AbstractC12086q mo7855j(int i, int i2) {
        C12080n.m7869d(i, i2, this.f27138n);
        AbstractC12086q qVar = this.f27139o;
        int i3 = this.f27137m;
        return (AbstractC12086q) qVar.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f27138n;
    }

    @Override // qa.AbstractC12086q, java.util.List
    public final /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
