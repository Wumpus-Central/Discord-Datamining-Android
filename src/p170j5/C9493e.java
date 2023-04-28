package p170j5;

import java.io.UnsupportedEncodingException;
import p394w3.C13740j;

/* renamed from: j5.e */
/* loaded from: classes7.dex */
public class C9493e {
    /* renamed from: a */
    public static byte[] m16135a(String str) {
        C13740j.m2834g(str);
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("ASCII not found!", e);
        }
    }

    /* renamed from: b */
    public static boolean m16134b(byte[] bArr, byte[] bArr2, int i) {
        C13740j.m2834g(bArr);
        C13740j.m2834g(bArr2);
        if (bArr2.length + i > bArr.length) {
            return false;
        }
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            if (bArr[i + i2] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m16133c(byte[] bArr, byte[] bArr2) {
        return m16134b(bArr, bArr2, 0);
    }
}
