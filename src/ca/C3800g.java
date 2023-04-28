package ca;

/* renamed from: ca.g */
/* loaded from: classes5.dex */
public class C3800g {

    /* renamed from: a */
    private static final char[] f6293a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b */
    private static final char[] f6294b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a */
    public static String m33572a(byte[] bArr) {
        return m33571b(bArr, false);
    }

    /* renamed from: b */
    public static String m33571b(byte[] bArr, boolean z) {
        int length = bArr.length;
        StringBuilder sb2 = new StringBuilder(length + length);
        for (int i = 0; i < length && (!z || i != length - 1 || (bArr[i] & 255) != 0); i++) {
            char[] cArr = f6293a;
            sb2.append(cArr[(bArr[i] & 240) >>> 4]);
            sb2.append(cArr[bArr[i] & 15]);
        }
        return sb2.toString();
    }
}
