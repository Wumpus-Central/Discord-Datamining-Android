package sa;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: sa.b */
/* loaded from: classes3.dex */
public final class C12829b extends AbstractC12830b0 {

    /* renamed from: o */
    static final AbstractC12830b0 f28896o = new C12829b(new Object[0], 0);

    /* renamed from: m */
    final transient Object[] f28897m;

    /* renamed from: n */
    private final transient int f28898n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12829b(Object[] objArr, int i) {
        this.f28897m = objArr;
        this.f28898n = i;
    }

    @Override // sa.AbstractC12830b0, sa.AbstractC12858y
    /* renamed from: a */
    final int mo5257a(Object[] objArr, int i) {
        System.arraycopy(this.f28897m, 0, objArr, 0, this.f28898n);
        return this.f28898n;
    }

    @Override // sa.AbstractC12858y
    /* renamed from: b */
    final int mo5256b() {
        return this.f28898n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // sa.AbstractC12858y
    /* renamed from: e */
    public final int mo5255e() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C12853t.m5265a(i, this.f28898n, "index");
        Object obj = this.f28897m[i];
        obj.getClass();
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // sa.AbstractC12858y
    /* renamed from: i */
    public final boolean mo5252i() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // sa.AbstractC12858y
    /* renamed from: j */
    public final Object[] mo5251j() {
        return this.f28897m;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f28898n;
    }
}
