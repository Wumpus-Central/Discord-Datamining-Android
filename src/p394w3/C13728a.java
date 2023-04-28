package p394w3;

import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: w3.a */
/* loaded from: classes7.dex */
public final class C13728a {
    /* renamed from: a */
    public static long m2859a(InputStream inputStream, OutputStream outputStream) {
        C13740j.m2834g(inputStream);
        C13740j.m2834g(outputStream);
        byte[] bArr = new byte[4096];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += read;
        }
    }

    /* renamed from: b */
    public static int m2858b(InputStream inputStream, byte[] bArr, int i, int i2) {
        C13740j.m2834g(inputStream);
        C13740j.m2834g(bArr);
        if (i2 >= 0) {
            int i3 = 0;
            while (i3 < i2) {
                int read = inputStream.read(bArr, i + i3, i2 - i3);
                if (read == -1) {
                    break;
                }
                i3 += read;
            }
            return i3;
        }
        throw new IndexOutOfBoundsException("len is negative");
    }
}
