package p076e4;

import java.io.InputStream;
import p394w3.C13740j;

/* renamed from: e4.d */
/* loaded from: classes7.dex */
public class C6703d {
    /* renamed from: a */
    public static long m24613a(InputStream inputStream, long j) {
        boolean z;
        C13740j.m2834g(inputStream);
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        C13740j.m2839b(Boolean.valueOf(z));
        long j2 = j;
        while (j2 > 0) {
            long skip = inputStream.skip(j2);
            if (skip <= 0) {
                if (inputStream.read() == -1) {
                    return j - j2;
                }
                skip = 1;
            }
            j2 -= skip;
        }
        return j;
    }
}
