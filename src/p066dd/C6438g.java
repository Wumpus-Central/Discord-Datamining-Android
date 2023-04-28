package p066dd;

/* renamed from: dd.g */
/* loaded from: classes3.dex */
public final class C6438g extends AbstractC6439h {

    /* renamed from: c */
    private final AbstractC6439h f13506c;

    public C6438g(AbstractC6439h hVar) {
        super(hVar.m25558d(), hVar.m25559a());
        this.f13506c = hVar;
    }

    @Override // p066dd.AbstractC6439h
    /* renamed from: b */
    public byte[] mo25550b() {
        byte[] b = this.f13506c.mo25550b();
        int d = m25558d() * m25559a();
        byte[] bArr = new byte[d];
        for (int i = 0; i < d; i++) {
            bArr[i] = (byte) (255 - (b[i] & 255));
        }
        return bArr;
    }

    @Override // p066dd.AbstractC6439h
    /* renamed from: c */
    public byte[] mo25549c(int i, byte[] bArr) {
        byte[] c = this.f13506c.mo25549c(i, bArr);
        int d = m25558d();
        for (int i2 = 0; i2 < d; i2++) {
            c[i2] = (byte) (255 - (c[i2] & 255));
        }
        return c;
    }

    @Override // p066dd.AbstractC6439h
    /* renamed from: e */
    public AbstractC6439h mo25557e() {
        return this.f13506c;
    }

    @Override // p066dd.AbstractC6439h
    /* renamed from: f */
    public boolean mo25556f() {
        return this.f13506c.mo25556f();
    }

    @Override // p066dd.AbstractC6439h
    /* renamed from: g */
    public AbstractC6439h mo25555g() {
        return new C6438g(this.f13506c.mo25555g());
    }
}
