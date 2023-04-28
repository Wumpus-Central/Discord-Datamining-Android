package p285pd;

import com.google.zxing.Result;
import java.util.Map;
import p066dd.C6437f;
import p066dd.C6441j;
import p066dd.C6446o;
import p066dd.EnumC6432a;
import p066dd.EnumC6436e;
import p137hd.C7996a;

/* renamed from: pd.h */
/* loaded from: classes3.dex */
public final class C11628h extends AbstractC11631k {

    /* renamed from: b */
    private static final int[] f25927b = {6, 8, 10, 12, 14};

    /* renamed from: c */
    private static final int[] f25928c = {1, 1, 1, 1};

    /* renamed from: d */
    private static final int[][] f25929d = {new int[]{1, 1, 2}, new int[]{1, 1, 3}};

    /* renamed from: e */
    private static final int[][] f25930e = {new int[]{1, 1, 2, 2, 1}, new int[]{2, 1, 1, 1, 2}, new int[]{1, 2, 1, 1, 2}, new int[]{2, 2, 1, 1, 1}, new int[]{1, 1, 2, 1, 2}, new int[]{2, 1, 2, 1, 1}, new int[]{1, 2, 2, 1, 1}, new int[]{1, 1, 1, 2, 2}, new int[]{2, 1, 1, 2, 1}, new int[]{1, 2, 1, 2, 1}, new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    /* renamed from: a */
    private int f25931a = -1;

    /* renamed from: g */
    private static int m9209g(int[] iArr) {
        int length = f25930e.length;
        float f = 0.38f;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            float d = AbstractC11631k.m9201d(iArr, f25930e[i2], 0.5f);
            if (d < f) {
                i = i2;
                f = d;
            } else if (d == f) {
                i = -1;
            }
        }
        if (i >= 0) {
            return i % 10;
        }
        throw C6441j.m25551a();
    }

    /* renamed from: h */
    private int[] m9208h(C7996a aVar) {
        int[] iArr;
        int i;
        aVar.m20929m();
        try {
            try {
                iArr = m9205k(aVar, m9204l(aVar), f25929d[0]);
            } catch (C6441j unused) {
                iArr = m9205k(aVar, i, f25929d[1]);
            }
            m9203m(aVar, iArr[0]);
            int i2 = iArr[0];
            iArr[0] = aVar.m20932j() - iArr[1];
            iArr[1] = aVar.m20932j() - i2;
            return iArr;
        } finally {
            aVar.m20929m();
        }
    }

    /* renamed from: i */
    private static void m9207i(C7996a aVar, int i, int i2, StringBuilder sb2) {
        int[] iArr = new int[10];
        int[] iArr2 = new int[5];
        int[] iArr3 = new int[5];
        while (i < i2) {
            AbstractC11631k.m9200e(aVar, i, iArr);
            for (int i3 = 0; i3 < 5; i3++) {
                int i4 = i3 * 2;
                iArr2[i3] = iArr[i4];
                iArr3[i3] = iArr[i4 + 1];
            }
            sb2.append((char) (m9209g(iArr2) + 48));
            sb2.append((char) (m9209g(iArr3) + 48));
            for (int i5 = 0; i5 < 10; i5++) {
                i += iArr[i5];
            }
        }
    }

    /* renamed from: j */
    private int[] m9206j(C7996a aVar) {
        int[] k = m9205k(aVar, m9204l(aVar), f25928c);
        int i = k[1];
        int i2 = k[0];
        this.f25931a = (i - i2) / 4;
        m9203m(aVar, i2);
        return k;
    }

    /* renamed from: k */
    private static int[] m9205k(C7996a aVar, int i, int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int j = aVar.m20932j();
        int i2 = i;
        boolean z = false;
        int i3 = 0;
        while (i < j) {
            if (aVar.m20936d(i) != z) {
                iArr2[i3] = iArr2[i3] + 1;
            } else {
                if (i3 != length - 1) {
                    i3++;
                } else if (AbstractC11631k.m9201d(iArr2, iArr, 0.5f) < 0.38f) {
                    return new int[]{i2, i};
                } else {
                    i2 += iArr2[0] + iArr2[1];
                    int i4 = i3 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i4);
                    iArr2[i4] = 0;
                    iArr2[i3] = 0;
                    i3--;
                }
                iArr2[i3] = 1;
                z = !z;
            }
            i++;
        }
        throw C6441j.m25551a();
    }

    /* renamed from: l */
    private static int m9204l(C7996a aVar) {
        int j = aVar.m20932j();
        int f = aVar.m20934f(0);
        if (f != j) {
            return f;
        }
        throw C6441j.m25551a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001b, code lost:
        return;
     */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m9203m(p137hd.C7996a r3, int r4) {
        /*
            r2 = this;
            int r0 = r2.f25931a
            int r0 = r0 * 10
            if (r0 >= r4) goto L_0x0007
            goto L_0x0008
        L_0x0007:
            r0 = r4
        L_0x0008:
            int r4 = r4 + (-1)
        L_0x000a:
            if (r0 <= 0) goto L_0x0019
            if (r4 < 0) goto L_0x0019
            boolean r1 = r3.m20936d(r4)
            if (r1 != 0) goto L_0x0019
            int r0 = r0 + (-1)
            int r4 = r4 + (-1)
            goto L_0x000a
        L_0x0019:
            if (r0 != 0) goto L_0x001c
            return
        L_0x001c:
            dd.j r3 = p066dd.C6441j.m25551a()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p285pd.C11628h.m9203m(hd.a, int):void");
    }

    @Override // p285pd.AbstractC11631k
    /* renamed from: b */
    public Result mo6515b(int i, C7996a aVar, Map<EnumC6436e, ?> map) {
        int[] iArr;
        boolean z;
        int[] j = m9206j(aVar);
        int[] h = m9208h(aVar);
        StringBuilder sb2 = new StringBuilder(20);
        m9207i(aVar, j[1], h[0], sb2);
        String sb3 = sb2.toString();
        if (map != null) {
            iArr = (int[]) map.get(EnumC6436e.ALLOWED_LENGTHS);
        } else {
            iArr = null;
        }
        if (iArr == null) {
            iArr = f25927b;
        }
        int length = sb3.length();
        int length2 = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= length2) {
                z = false;
                break;
            }
            int i4 = iArr[i2];
            if (length == i4) {
                z = true;
                break;
            }
            if (i4 > i3) {
                i3 = i4;
            }
            i2++;
        }
        if (!z && length > i3) {
            z = true;
        }
        if (z) {
            float f = i;
            return new Result(sb3, null, new C6446o[]{new C6446o(j[1], f), new C6446o(h[0], f)}, EnumC6432a.ITF);
        }
        throw C6437f.m25561a();
    }
}
