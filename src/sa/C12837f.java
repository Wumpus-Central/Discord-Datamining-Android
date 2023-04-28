package sa;

/* renamed from: sa.f */
/* loaded from: classes3.dex */
final class C12837f extends AbstractC12830b0 {

    /* renamed from: m */
    private final transient Object[] f28915m;

    /* renamed from: n */
    private final transient int f28916n;

    /* renamed from: o */
    private final transient int f28917o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12837f(Object[] objArr, int i, int i2) {
        this.f28915m = objArr;
        this.f28916n = i;
        this.f28917o = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C12853t.m5265a(i, this.f28917o, "index");
        Object obj = this.f28915m[i + i + this.f28916n];
        obj.getClass();
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // sa.AbstractC12858y
    /* renamed from: i */
    public final boolean mo5252i() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f28917o;
    }
}
