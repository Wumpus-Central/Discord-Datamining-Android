package p117g7;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* renamed from: g7.m0 */
/* loaded from: classes7.dex */
public class C7469m0 {
    /* renamed from: a */
    public static List<byte[]> m22562a(byte[] bArr) {
        long e = m22558e(m22559d(bArr));
        long e2 = m22558e(3840L);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(m22561b(e));
        arrayList.add(m22561b(e2));
        return arrayList;
    }

    /* renamed from: b */
    private static byte[] m22561b(long j) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j).array();
    }

    /* renamed from: c */
    public static int m22560c(byte[] bArr) {
        return bArr[9] & 255;
    }

    /* renamed from: d */
    private static int m22559d(byte[] bArr) {
        return (bArr[10] & 255) | ((bArr[11] & 255) << 8);
    }

    /* renamed from: e */
    private static long m22558e(long j) {
        return (j * 1000000000) / 48000;
    }
}
