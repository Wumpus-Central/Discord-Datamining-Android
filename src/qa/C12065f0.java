package qa;

import p163j$.util.Spliterator;

/* renamed from: qa.f0 */
/* loaded from: classes3.dex */
final class C12065f0 extends C12069h0 {

    /* renamed from: h */
    private final char[] f27094h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12065f0(String str, String str2) {
        this(new C12067g0(str, str2.toCharArray()));
    }

    @Override // qa.C12069h0, qa.AbstractC12061d0
    /* renamed from: e */
    final void mo7879e(Appendable appendable, byte[] bArr, int i, int i2) {
        C12080n.m7871b(appendable);
        C12080n.m7869d(0, i2 + 0, bArr.length);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = bArr[i3 + 0] & 255;
            appendable.append(this.f27094h[i4]);
            appendable.append(this.f27094h[i4 | Spliterator.NONNULL]);
        }
    }

    private C12065f0(C12067g0 g0Var) {
        super(g0Var, null);
        char[] cArr;
        this.f27094h = new char[512];
        cArr = g0Var.f27096b;
        C12080n.m7868e(cArr.length == 16);
        for (int i = 0; i < 256; i++) {
            this.f27094h[i] = g0Var.m7887a(i >>> 4);
            this.f27094h[i | Spliterator.NONNULL] = g0Var.m7887a(i & 15);
        }
    }
}
