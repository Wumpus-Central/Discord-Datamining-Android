package qa;

import java.io.IOException;

/* renamed from: qa.d0 */
/* loaded from: classes3.dex */
public abstract class AbstractC12061d0 {

    /* renamed from: a */
    private static final AbstractC12061d0 f27089a = new C12071i0("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');

    /* renamed from: b */
    private static final AbstractC12061d0 f27090b = new C12071i0("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');

    /* renamed from: c */
    private static final AbstractC12061d0 f27091c = new C12069h0("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');

    /* renamed from: d */
    private static final AbstractC12061d0 f27092d = new C12069h0("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');

    /* renamed from: e */
    private static final AbstractC12061d0 f27093e = new C12065f0("base16()", "0123456789ABCDEF");

    /* renamed from: c */
    private final String m7890c(byte[] bArr, int i, int i2) {
        C12080n.m7869d(0, i2, bArr.length);
        StringBuilder sb2 = new StringBuilder(mo7884a(i2));
        try {
            mo7879e(sb2, bArr, 0, i2);
            return sb2.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: d */
    public static AbstractC12061d0 m7889d() {
        return f27093e;
    }

    /* renamed from: a */
    abstract int mo7884a(int i);

    /* renamed from: b */
    public final String m7891b(byte[] bArr) {
        return m7890c(bArr, 0, bArr.length);
    }

    /* renamed from: e */
    abstract void mo7879e(Appendable appendable, byte[] bArr, int i, int i2);
}
