package p285pd;

import com.google.zxing.Result;
import java.util.EnumMap;
import java.util.Map;
import p066dd.C6441j;
import p066dd.C6446o;
import p066dd.EnumC6432a;
import p066dd.EnumC6445n;
import p137hd.C7996a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: pd.n */
/* loaded from: classes3.dex */
public final class C11634n {

    /* renamed from: c */
    private static final int[] f25937c = {24, 20, 18, 17, 12, 6, 3, 10, 9, 5};

    /* renamed from: a */
    private final int[] f25938a = new int[4];

    /* renamed from: b */
    private final StringBuilder f25939b = new StringBuilder();

    /* renamed from: a */
    private int m9194a(C7996a aVar, int[] iArr, StringBuilder sb2) {
        int[] iArr2 = this.f25938a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int j = aVar.m20932j();
        int i = iArr[1];
        int i2 = 0;
        for (int i3 = 0; i3 < 5 && i < j; i3++) {
            int i4 = AbstractC11636p.m9186i(aVar, iArr2, i, AbstractC11636p.f25947h);
            sb2.append((char) ((i4 % 10) + 48));
            for (int i5 : iArr2) {
                i += i5;
            }
            if (i4 >= 10) {
                i2 |= 1 << (4 - i3);
            }
            if (i3 != 4) {
                i = aVar.m20933h(aVar.m20934f(i));
            }
        }
        if (sb2.length() == 5) {
            if (m9191d(sb2.toString()) == m9192c(i2)) {
                return i;
            }
            throw C6441j.m25551a();
        }
        throw C6441j.m25551a();
    }

    /* renamed from: c */
    private static int m9192c(int i) {
        for (int i2 = 0; i2 < 10; i2++) {
            if (i == f25937c[i2]) {
                return i2;
            }
        }
        throw C6441j.m25551a();
    }

    /* renamed from: d */
    private static int m9191d(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        for (int i2 = length - 2; i2 >= 0; i2 -= 2) {
            i += charSequence.charAt(i2) - '0';
        }
        int i3 = i * 3;
        for (int i4 = length - 1; i4 >= 0; i4 -= 2) {
            i3 += charSequence.charAt(i4) - '0';
        }
        return (i3 * 3) % 10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
        if (r5.equals("90000") == false) goto L_0x001d;
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String m9190e(java.lang.String r5) {
        /*
            r0 = 0
            char r1 = r5.charAt(r0)
            r2 = 48
            r3 = 1
            if (r1 == r2) goto L_0x004d
            r2 = 53
            if (r1 == r2) goto L_0x004a
            r2 = 57
            java.lang.String r4 = ""
            if (r1 == r2) goto L_0x0015
            goto L_0x004f
        L_0x0015:
            int r1 = r5.hashCode()
            r2 = -1
            switch(r1) {
                case 54118329: goto L_0x0035;
                case 54395376: goto L_0x002a;
                case 54395377: goto L_0x001f;
                default: goto L_0x001d;
            }
        L_0x001d:
            r0 = r2
            goto L_0x003e
        L_0x001f:
            java.lang.String r0 = "99991"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0028
            goto L_0x001d
        L_0x0028:
            r0 = 2
            goto L_0x003e
        L_0x002a:
            java.lang.String r0 = "99990"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0033
            goto L_0x001d
        L_0x0033:
            r0 = r3
            goto L_0x003e
        L_0x0035:
            java.lang.String r1 = "90000"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L_0x003e
            goto L_0x001d
        L_0x003e:
            switch(r0) {
                case 0: goto L_0x0048;
                case 1: goto L_0x0045;
                case 2: goto L_0x0042;
                default: goto L_0x0041;
            }
        L_0x0041:
            goto L_0x004f
        L_0x0042:
            java.lang.String r5 = "0.00"
            return r5
        L_0x0045:
            java.lang.String r5 = "Used"
            return r5
        L_0x0048:
            r5 = 0
            return r5
        L_0x004a:
            java.lang.String r4 = "$"
            goto L_0x004f
        L_0x004d:
            java.lang.String r4 = "£"
        L_0x004f:
            java.lang.String r5 = r5.substring(r3)
            int r5 = java.lang.Integer.parseInt(r5)
            int r0 = r5 / 100
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r5 = r5 % 100
            r1 = 10
            if (r5 >= r1) goto L_0x006e
            java.lang.String r1 = "0"
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r5 = r1.concat(r5)
            goto L_0x0072
        L_0x006e:
            java.lang.String r5 = java.lang.String.valueOf(r5)
        L_0x0072:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            r1.append(r0)
            r0 = 46
            r1.append(r0)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p285pd.C11634n.m9190e(java.lang.String):java.lang.String");
    }

    /* renamed from: f */
    private static Map<EnumC6445n, Object> m9189f(String str) {
        String e;
        if (str.length() != 5 || (e = m9190e(str)) == null) {
            return null;
        }
        EnumMap enumMap = new EnumMap(EnumC6445n.class);
        enumMap.put((EnumMap) EnumC6445n.SUGGESTED_PRICE, (EnumC6445n) e);
        return enumMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public Result m9193b(int i, C7996a aVar, int[] iArr) {
        StringBuilder sb2 = this.f25939b;
        sb2.setLength(0);
        int a = m9194a(aVar, iArr, sb2);
        String sb3 = sb2.toString();
        Map<EnumC6445n, Object> f = m9189f(sb3);
        float f2 = i;
        Result result = new Result(sb3, null, new C6446o[]{new C6446o((iArr[0] + iArr[1]) / 2.0f, f2), new C6446o(a, f2)}, EnumC6432a.UPC_EAN_EXTENSION);
        if (f != null) {
            result.m27002g(f);
        }
        return result;
    }
}
