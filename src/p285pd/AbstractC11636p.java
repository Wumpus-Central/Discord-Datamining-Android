package p285pd;

import com.google.zxing.Result;
import java.util.Arrays;
import java.util.Map;
import p066dd.AbstractC6444m;
import p066dd.AbstractC6447p;
import p066dd.C6435d;
import p066dd.C6437f;
import p066dd.C6441j;
import p066dd.C6446o;
import p066dd.EnumC6432a;
import p066dd.EnumC6436e;
import p066dd.EnumC6445n;
import p137hd.C7996a;

/* renamed from: pd.p */
/* loaded from: classes3.dex */
public abstract class AbstractC11636p extends AbstractC11631k {

    /* renamed from: d */
    static final int[] f25943d = {1, 1, 1};

    /* renamed from: e */
    static final int[] f25944e = {1, 1, 1, 1, 1};

    /* renamed from: f */
    static final int[] f25945f = {1, 1, 1, 1, 1, 1};

    /* renamed from: g */
    static final int[][] f25946g;

    /* renamed from: h */
    static final int[][] f25947h;

    /* renamed from: a */
    private final StringBuilder f25948a = new StringBuilder(20);

    /* renamed from: b */
    private final C11635o f25949b = new C11635o();

    /* renamed from: c */
    private final C11627g f25950c = new C11627g();

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        f25946g = iArr;
        int[][] iArr2 = new int[20];
        f25947h = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i = 10; i < 20; i++) {
            int[] iArr3 = f25946g[i - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i2 = 0; i2 < iArr3.length; i2++) {
                iArr4[i2] = iArr3[(iArr3.length - i2) - 1];
            }
            f25947h[i] = iArr4;
        }
    }

    /* renamed from: h */
    static boolean m9187h(CharSequence charSequence) {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i = length - 1;
        if (m9181q(charSequence.subSequence(0, i)) == Character.digit(charSequence.charAt(i), 10)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static int m9186i(C7996a aVar, int[] iArr, int i, int[][] iArr2) {
        AbstractC11631k.m9200e(aVar, i, iArr);
        int length = iArr2.length;
        float f = 0.48f;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            float d = AbstractC11631k.m9201d(iArr, iArr2[i3], 0.7f);
            if (d < f) {
                i2 = i3;
                f = d;
            }
        }
        if (i2 >= 0) {
            return i2;
        }
        throw C6441j.m25551a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public static int[] m9184m(C7996a aVar, int i, boolean z, int[] iArr) {
        return m9183n(aVar, i, z, iArr, new int[iArr.length]);
    }

    /* renamed from: n */
    private static int[] m9183n(C7996a aVar, int i, boolean z, int[] iArr, int[] iArr2) {
        int i2;
        int j = aVar.m20932j();
        if (z) {
            i2 = aVar.m20933h(i);
        } else {
            i2 = aVar.m20934f(i);
        }
        int length = iArr.length;
        boolean z2 = z;
        int i3 = 0;
        int i4 = i2;
        while (i2 < j) {
            if (aVar.m20936d(i2) != z2) {
                iArr2[i3] = iArr2[i3] + 1;
            } else {
                if (i3 != length - 1) {
                    i3++;
                } else if (AbstractC11631k.m9201d(iArr2, iArr, 0.7f) < 0.48f) {
                    return new int[]{i4, i2};
                } else {
                    i4 += iArr2[0] + iArr2[1];
                    int i5 = i3 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i5);
                    iArr2[i5] = 0;
                    iArr2[i3] = 0;
                    i3--;
                }
                iArr2[i3] = 1;
                z2 = !z2;
            }
            i2++;
        }
        throw C6441j.m25551a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public static int[] m9182o(C7996a aVar) {
        int[] iArr = new int[f25943d.length];
        int[] iArr2 = null;
        boolean z = false;
        int i = 0;
        while (!z) {
            int[] iArr3 = f25943d;
            Arrays.fill(iArr, 0, iArr3.length, 0);
            iArr2 = m9183n(aVar, i, false, iArr3, iArr);
            int i2 = iArr2[0];
            int i3 = iArr2[1];
            int i4 = i2 - (i3 - i2);
            if (i4 >= 0) {
                z = aVar.m20931k(i4, i2, false);
            }
            i = i3;
        }
        return iArr2;
    }

    /* renamed from: q */
    static int m9181q(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        for (int i2 = length - 1; i2 >= 0; i2 -= 2) {
            int charAt = charSequence.charAt(i2) - '0';
            if (charAt < 0 || charAt > 9) {
                throw C6437f.m25561a();
            }
            i += charAt;
        }
        int i3 = i * 3;
        for (int i4 = length - 2; i4 >= 0; i4 -= 2) {
            int charAt2 = charSequence.charAt(i4) - '0';
            if (charAt2 < 0 || charAt2 > 9) {
                throw C6437f.m25561a();
            }
            i3 += charAt2;
        }
        return (1000 - i3) % 10;
    }

    @Override // p285pd.AbstractC11631k
    /* renamed from: b */
    public Result mo6515b(int i, C7996a aVar, Map<EnumC6436e, ?> map) {
        return mo9185l(i, aVar, m9182o(aVar), map);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo9180g(String str) {
        return m9187h(str);
    }

    /* renamed from: j */
    int[] mo9179j(C7996a aVar, int i) {
        return m9184m(aVar, i, false, f25943d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k */
    public abstract int mo9178k(C7996a aVar, int[] iArr, StringBuilder sb2);

    /* renamed from: l */
    public Result mo9185l(int i, C7996a aVar, int[] iArr, Map<EnumC6436e, ?> map) {
        AbstractC6447p pVar;
        int i2;
        String c;
        int[] iArr2 = null;
        if (map == null) {
            pVar = null;
        } else {
            pVar = (AbstractC6447p) map.get(EnumC6436e.NEED_RESULT_POINT_CALLBACK);
        }
        boolean z = true;
        if (pVar != null) {
            pVar.m25542a(new C6446o((iArr[0] + iArr[1]) / 2.0f, i));
        }
        StringBuilder sb2 = this.f25948a;
        sb2.setLength(0);
        int k = mo9178k(aVar, iArr, sb2);
        if (pVar != null) {
            pVar.m25542a(new C6446o(k, i));
        }
        int[] j = mo9179j(aVar, k);
        if (pVar != null) {
            pVar.m25542a(new C6446o((j[0] + j[1]) / 2.0f, i));
        }
        int i3 = j[1];
        int i4 = (i3 - j[0]) + i3;
        if (i4 >= aVar.m20932j() || !aVar.m20931k(i3, i4, false)) {
            throw C6441j.m25551a();
        }
        String sb3 = sb2.toString();
        if (sb3.length() < 8) {
            throw C6437f.m25561a();
        } else if (mo9180g(sb3)) {
            EnumC6432a p = mo9177p();
            float f = i;
            Result result = new Result(sb3, null, new C6446o[]{new C6446o((iArr[1] + iArr[0]) / 2.0f, f), new C6446o((j[1] + j[0]) / 2.0f, f)}, p);
            try {
                Result a = this.f25949b.m9188a(i, aVar, j[1]);
                result.m27001h(EnumC6445n.UPC_EAN_EXTENSION, a.m27003f());
                result.m27002g(a.m27005d());
                result.m27008a(a.m27004e());
                i2 = a.m27003f().length();
            } catch (AbstractC6444m unused) {
                i2 = 0;
            }
            if (map != null) {
                iArr2 = (int[]) map.get(EnumC6436e.ALLOWED_EAN_EXTENSIONS);
            }
            if (iArr2 != null) {
                int length = iArr2.length;
                int i5 = 0;
                while (true) {
                    if (i5 >= length) {
                        z = false;
                        break;
                    } else if (i2 == iArr2[i5]) {
                        break;
                    } else {
                        i5++;
                    }
                }
                if (!z) {
                    throw C6441j.m25551a();
                }
            }
            if ((p == EnumC6432a.EAN_13 || p == EnumC6432a.UPC_A) && (c = this.f25950c.m9210c(sb3)) != null) {
                result.m27001h(EnumC6445n.POSSIBLE_COUNTRY, c);
            }
            return result;
        } else {
            throw C6435d.m25562a();
        }
    }

    /* renamed from: p */
    abstract EnumC6432a mo9177p();
}
