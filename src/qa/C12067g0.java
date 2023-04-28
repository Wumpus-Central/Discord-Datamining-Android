package qa;

import java.math.RoundingMode;
import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: qa.g0 */
/* loaded from: classes3.dex */
final class C12067g0 {

    /* renamed from: a */
    private final String f27095a;

    /* renamed from: b */
    private final char[] f27096b;

    /* renamed from: c */
    final int f27097c;

    /* renamed from: d */
    final int f27098d;

    /* renamed from: e */
    final int f27099e;

    /* renamed from: f */
    final int f27100f;

    /* renamed from: g */
    private final byte[] f27101g;

    /* renamed from: h */
    private final boolean[] f27102h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12067g0(String str, char[] cArr) {
        String str2;
        boolean z;
        boolean z2;
        this.f27095a = (String) C12080n.m7871b(str);
        this.f27096b = (char[]) C12080n.m7871b(cArr);
        try {
            int b = C12075k0.m7876b(cArr.length, RoundingMode.UNNECESSARY);
            this.f27098d = b;
            int min = Math.min(8, Integer.lowestOneBit(b));
            try {
                this.f27099e = 8 / min;
                this.f27100f = b / min;
                this.f27097c = cArr.length - 1;
                byte[] bArr = new byte[128];
                Arrays.fill(bArr, (byte) -1);
                for (int i = 0; i < cArr.length; i++) {
                    char c = cArr[i];
                    if (c < 128) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C12080n.m7867f(z, "Non-ASCII character: %s", c);
                    if (bArr[c] == -1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    C12080n.m7867f(z2, "Duplicate character: %s", c);
                    bArr[c] = (byte) i;
                }
                this.f27101g = bArr;
                boolean[] zArr = new boolean[this.f27099e];
                for (int i2 = 0; i2 < this.f27100f; i2++) {
                    zArr[C12075k0.m7877a(i2 << 3, this.f27098d, RoundingMode.CEILING)] = true;
                }
                this.f27102h = zArr;
            } catch (ArithmeticException e) {
                String str3 = new String(cArr);
                if (str3.length() != 0) {
                    str2 = "Illegal alphabet ".concat(str3);
                } else {
                    str2 = new String("Illegal alphabet ");
                }
                throw new IllegalArgumentException(str2, e);
            }
        } catch (ArithmeticException e2) {
            int length = cArr.length;
            StringBuilder sb2 = new StringBuilder(35);
            sb2.append("Illegal alphabet length ");
            sb2.append(length);
            throw new IllegalArgumentException(sb2.toString(), e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final char m7887a(int i) {
        return this.f27096b[i];
    }

    /* renamed from: b */
    public final boolean m7886b(char c) {
        byte[] bArr = this.f27101g;
        return c < bArr.length && bArr[c] != -1;
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (obj instanceof C12067g0) {
            return Arrays.equals(this.f27096b, ((C12067g0) obj).f27096b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f27096b);
    }

    public final String toString() {
        return this.f27095a;
    }
}
