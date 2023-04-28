package qa;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: qa.i0 */
/* loaded from: classes3.dex */
final class C12071i0 extends C12069h0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C12071i0(String str, String str2, @NullableDecl Character ch2) {
        this(new C12067g0(str, str2.toCharArray()), ch2);
    }

    @Override // qa.C12069h0, qa.AbstractC12061d0
    /* renamed from: e */
    final void mo7879e(Appendable appendable, byte[] bArr, int i, int i2) {
        C12080n.m7871b(appendable);
        int i3 = i2 + 0;
        int i4 = 0;
        C12080n.m7869d(0, i3, bArr.length);
        while (i2 >= 3) {
            int i5 = i4 + 1;
            int i6 = i5 + 1;
            int i7 = ((bArr[i5] & 255) << 8) | ((bArr[i4] & 255) << 16);
            i4 = i6 + 1;
            int i8 = i7 | (bArr[i6] & 255);
            appendable.append(this.f27103f.m7887a(i8 >>> 18));
            appendable.append(this.f27103f.m7887a((i8 >>> 12) & 63));
            appendable.append(this.f27103f.m7887a((i8 >>> 6) & 63));
            appendable.append(this.f27103f.m7887a(i8 & 63));
            i2 -= 3;
        }
        if (i4 < i3) {
            m7883f(appendable, bArr, i4, i3 - i4);
        }
    }

    private C12071i0(C12067g0 g0Var, @NullableDecl Character ch2) {
        super(g0Var, ch2);
        char[] cArr;
        cArr = g0Var.f27096b;
        C12080n.m7868e(cArr.length == 64);
    }
}
