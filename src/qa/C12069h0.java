package qa;

import java.math.RoundingMode;
import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: qa.h0 */
/* loaded from: classes3.dex */
class C12069h0 extends AbstractC12061d0 {

    /* renamed from: f */
    final C12067g0 f27103f;
    @NullableDecl

    /* renamed from: g */
    private final Character f27104g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12069h0(String str, String str2, @NullableDecl Character ch2) {
        this(new C12067g0(str, str2.toCharArray()), ch2);
    }

    @Override // qa.AbstractC12061d0
    /* renamed from: a */
    final int mo7884a(int i) {
        C12067g0 g0Var = this.f27103f;
        return g0Var.f27099e * C12075k0.m7877a(i, g0Var.f27100f, RoundingMode.CEILING);
    }

    @Override // qa.AbstractC12061d0
    /* renamed from: e */
    void mo7879e(Appendable appendable, byte[] bArr, int i, int i2) {
        C12080n.m7871b(appendable);
        int i3 = 0;
        C12080n.m7869d(0, i2 + 0, bArr.length);
        while (i3 < i2) {
            m7883f(appendable, bArr, i3 + 0, Math.min(this.f27103f.f27100f, i2 - i3));
            i3 += this.f27103f.f27100f;
        }
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj instanceof C12069h0) {
            C12069h0 h0Var = (C12069h0) obj;
            if (this.f27103f.equals(h0Var.f27103f) && C12074k.m7878a(this.f27104g, h0Var.f27104g)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final void m7883f(Appendable appendable, byte[] bArr, int i, int i2) {
        boolean z;
        C12080n.m7871b(appendable);
        C12080n.m7869d(i, i + i2, bArr.length);
        int i3 = 0;
        if (i2 <= this.f27103f.f27100f) {
            z = true;
        } else {
            z = false;
        }
        C12080n.m7868e(z);
        long j = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            j = (j | (bArr[i + i4] & 255)) << 8;
        }
        int i5 = ((i2 + 1) << 3) - this.f27103f.f27098d;
        while (i3 < (i2 << 3)) {
            C12067g0 g0Var = this.f27103f;
            appendable.append(g0Var.m7887a(((int) (j >>> (i5 - i3))) & g0Var.f27097c));
            i3 += this.f27103f.f27098d;
        }
        if (this.f27104g != null) {
            while (i3 < (this.f27103f.f27100f << 3)) {
                appendable.append(this.f27104g.charValue());
                i3 += this.f27103f.f27098d;
            }
        }
    }

    public int hashCode() {
        return this.f27103f.hashCode() ^ Arrays.hashCode(new Object[]{this.f27104g});
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BaseEncoding.");
        sb2.append(this.f27103f.toString());
        if (8 % this.f27103f.f27098d != 0) {
            if (this.f27104g == null) {
                sb2.append(".omitPadding()");
            } else {
                sb2.append(".withPadChar('");
                sb2.append(this.f27104g);
                sb2.append("')");
            }
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12069h0(C12067g0 g0Var, @NullableDecl Character ch2) {
        this.f27103f = (C12067g0) C12080n.m7871b(g0Var);
        if (ch2 == null || !g0Var.m7886b(ch2.charValue())) {
            this.f27104g = ch2;
            return;
        }
        throw new IllegalArgumentException(C12078m.m7874b("Padding character %s was already in alphabet", ch2));
    }
}
