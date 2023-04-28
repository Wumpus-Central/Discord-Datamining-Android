package p095f4;

import com.facebook.webpsupport.WebpBitmapFactoryImpl;
import java.io.UnsupportedEncodingException;

/* renamed from: f4.c */
/* loaded from: classes7.dex */
public class C7014c {

    /* renamed from: a */
    public static final boolean f15297a = false;

    /* renamed from: b */
    public static final boolean f15298b = true;

    /* renamed from: c */
    public static final boolean f15299c = m23653e();

    /* renamed from: d */
    public static AbstractC7012b f15300d = null;

    /* renamed from: e */
    private static boolean f15301e = false;

    /* renamed from: f */
    private static final byte[] f15302f = m23657a("RIFF");

    /* renamed from: g */
    private static final byte[] f15303g = m23657a("WEBP");

    /* renamed from: h */
    private static final byte[] f15304h = m23657a("VP8 ");

    /* renamed from: i */
    private static final byte[] f15305i = m23657a("VP8L");

    /* renamed from: j */
    private static final byte[] f15306j = m23657a("VP8X");

    /* renamed from: a */
    private static byte[] m23657a(String str) {
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("ASCII not found!", e);
        }
    }

    /* renamed from: b */
    public static boolean m23656b(byte[] bArr, int i) {
        boolean z;
        boolean j = m23648j(bArr, i + 12, f15306j);
        if ((bArr[i + 20] & 2) == 2) {
            z = true;
        } else {
            z = false;
        }
        if (!j || !z) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m23655c(byte[] bArr, int i, int i2) {
        if (i2 < 21 || !m23648j(bArr, i + 12, f15306j)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m23654d(byte[] bArr, int i) {
        boolean z;
        boolean j = m23648j(bArr, i + 12, f15306j);
        if ((bArr[i + 20] & 16) == 16) {
            z = true;
        } else {
            z = false;
        }
        if (!j || !z) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private static boolean m23653e() {
        return true;
    }

    /* renamed from: f */
    public static boolean m23652f(byte[] bArr, int i) {
        return m23648j(bArr, i + 12, f15305i);
    }

    /* renamed from: g */
    public static boolean m23651g(byte[] bArr, int i) {
        return m23648j(bArr, i + 12, f15304h);
    }

    /* renamed from: h */
    public static boolean m23650h(byte[] bArr, int i, int i2) {
        if (i2 < 20 || !m23648j(bArr, i, f15302f) || !m23648j(bArr, i + 8, f15303g)) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public static AbstractC7012b m23649i() {
        AbstractC7012b bVar;
        if (f15301e) {
            return f15300d;
        }
        try {
            boolean z = WebpBitmapFactoryImpl.f8814a;
            bVar = (AbstractC7012b) WebpBitmapFactoryImpl.class.newInstance();
        } catch (Throwable unused) {
            bVar = null;
        }
        f15301e = true;
        return bVar;
    }

    /* renamed from: j */
    private static boolean m23648j(byte[] bArr, int i, byte[] bArr2) {
        if (bArr2 == null || bArr == null || bArr2.length + i > bArr.length) {
            return false;
        }
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            if (bArr[i2 + i] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }
}
