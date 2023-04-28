package qa;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: qa.w */
/* loaded from: classes3.dex */
public final class C12098w<E> extends AbstractC12086q<E> {

    /* renamed from: o */
    static final AbstractC12086q<Object> f27144o = new C12098w(new Object[0], 0);

    /* renamed from: m */
    private final transient Object[] f27145m;

    /* renamed from: n */
    private final transient int f27146n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12098w(Object[] objArr, int i) {
        this.f27145m = objArr;
        this.f27146n = i;
    }

    @Override // qa.AbstractC12086q, qa.AbstractC12088r
    /* renamed from: a */
    final int mo7845a(Object[] objArr, int i) {
        System.arraycopy(this.f27145m, 0, objArr, 0, this.f27146n);
        return this.f27146n + 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // qa.AbstractC12088r
    /* renamed from: f */
    public final Object[] mo7843f() {
        return this.f27145m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // qa.AbstractC12088r
    /* renamed from: g */
    public final int mo7842g() {
        return 0;
    }

    @Override // java.util.List
    public final E get(int i) {
        C12080n.m7872a(i, this.f27146n);
        return (E) this.f27145m[i];
    }

    @Override // qa.AbstractC12088r
    /* renamed from: i */
    final int mo7841i() {
        return this.f27146n;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f27146n;
    }
}
