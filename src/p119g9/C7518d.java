package p119g9;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: g9.d */
/* loaded from: classes5.dex */
public final class C7518d {

    /* renamed from: a */
    private static final byte[] f16295a = {0, 0, 0, 1};

    /* renamed from: b */
    private static final String[] f16296b = {"", "A", "B", "C"};

    /* renamed from: a */
    public static String m22350a(int i, int i2, int i3) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }

    /* renamed from: b */
    public static List<byte[]> m22349b(boolean z) {
        return Collections.singletonList(z ? new byte[]{1} : new byte[]{0});
    }

    /* renamed from: c */
    public static String m22348c(C7571z zVar) {
        char c;
        zVar.m21978l(24);
        int e = zVar.m21985e(2);
        boolean d = zVar.m21986d();
        int e2 = zVar.m21985e(5);
        int i = 0;
        for (int i2 = 0; i2 < 32; i2++) {
            if (zVar.m21986d()) {
                i |= 1 << i2;
            }
        }
        int i3 = 6;
        int[] iArr = new int[6];
        for (int i4 = 0; i4 < 6; i4++) {
            iArr[i4] = zVar.m21985e(8);
        }
        int e3 = zVar.m21985e(8);
        Object[] objArr = new Object[5];
        objArr[0] = f16296b[e];
        objArr[1] = Integer.valueOf(e2);
        objArr[2] = Integer.valueOf(i);
        if (d) {
            c = 'H';
        } else {
            c = 'L';
        }
        objArr[3] = Character.valueOf(c);
        objArr[4] = Integer.valueOf(e3);
        StringBuilder sb2 = new StringBuilder(C7557q0.m22209D("hvc1.%s%d.%X.%c%d", objArr));
        while (i3 > 0 && iArr[i3 - 1] == 0) {
            i3--;
        }
        for (int i5 = 0; i5 < i3; i5++) {
            sb2.append(String.format(".%02X", Integer.valueOf(iArr[i5])));
        }
        return sb2.toString();
    }

    /* renamed from: d */
    public static byte[] m22347d(byte[] bArr, int i, int i2) {
        byte[] bArr2 = f16295a;
        byte[] bArr3 = new byte[bArr2.length + i2];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i, bArr3, bArr2.length, i2);
        return bArr3;
    }

    /* renamed from: e */
    private static int m22346e(byte[] bArr, int i) {
        int length = bArr.length - f16295a.length;
        while (i <= length) {
            if (m22345f(bArr, i)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: f */
    private static boolean m22345f(byte[] bArr, int i) {
        if (bArr.length - i <= f16295a.length) {
            return false;
        }
        int i2 = 0;
        while (true) {
            byte[] bArr2 = f16295a;
            if (i2 >= bArr2.length) {
                return true;
            }
            if (bArr[i + i2] != bArr2[i2]) {
                return false;
            }
            i2++;
        }
    }

    /* renamed from: g */
    public static Pair<Integer, Integer> m22344g(byte[] bArr) {
        C7570y yVar = new C7570y(bArr);
        yVar.m22017P(9);
        int D = yVar.m22029D();
        yVar.m22017P(20);
        return Pair.create(Integer.valueOf(yVar.m22025H()), Integer.valueOf(D));
    }

    /* renamed from: h */
    public static boolean m22343h(List<byte[]> list) {
        if (list.size() == 1 && list.get(0).length == 1 && list.get(0)[0] == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public static byte[][] m22342i(byte[] bArr) {
        int i;
        if (!m22345f(bArr, 0)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        do {
            arrayList.add(Integer.valueOf(i2));
            i2 = m22346e(bArr, i2 + f16295a.length);
        } while (i2 != -1);
        byte[][] bArr2 = new byte[arrayList.size()];
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            int intValue = ((Integer) arrayList.get(i3)).intValue();
            if (i3 < arrayList.size() - 1) {
                i = ((Integer) arrayList.get(i3 + 1)).intValue();
            } else {
                i = bArr.length;
            }
            int i4 = i - intValue;
            byte[] bArr3 = new byte[i4];
            System.arraycopy(bArr, intValue, bArr3, 0, i4);
            bArr2[i3] = bArr3;
        }
        return bArr2;
    }
}
