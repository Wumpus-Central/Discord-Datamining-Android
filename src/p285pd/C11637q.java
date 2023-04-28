package p285pd;

import p066dd.C6441j;
import p066dd.EnumC6432a;
import p137hd.C7996a;

/* renamed from: pd.q */
/* loaded from: classes3.dex */
public final class C11637q extends AbstractC11636p {

    /* renamed from: j */
    private static final int[] f25951j = {1, 1, 1, 1, 1, 1};

    /* renamed from: k */
    static final int[][] f25952k = {new int[]{56, 52, 50, 49, 44, 38, 35, 42, 41, 37}, new int[]{7, 11, 13, 14, 19, 25, 28, 21, 22, 26}};

    /* renamed from: i */
    private final int[] f25953i = new int[4];

    /* renamed from: r */
    public static String m9176r(String str) {
        char[] cArr = new char[6];
        str.getChars(1, 7, cArr, 0);
        StringBuilder sb2 = new StringBuilder(12);
        sb2.append(str.charAt(0));
        char c = cArr[5];
        switch (c) {
            case '0':
            case '1':
            case '2':
                sb2.append(cArr, 0, 2);
                sb2.append(c);
                sb2.append("0000");
                sb2.append(cArr, 2, 3);
                break;
            case '3':
                sb2.append(cArr, 0, 3);
                sb2.append("00000");
                sb2.append(cArr, 3, 2);
                break;
            case '4':
                sb2.append(cArr, 0, 4);
                sb2.append("00000");
                sb2.append(cArr[4]);
                break;
            default:
                sb2.append(cArr, 0, 5);
                sb2.append("0000");
                sb2.append(c);
                break;
        }
        if (str.length() >= 8) {
            sb2.append(str.charAt(7));
        }
        return sb2.toString();
    }

    /* renamed from: s */
    private static void m9175s(StringBuilder sb2, int i) {
        for (int i2 = 0; i2 <= 1; i2++) {
            for (int i3 = 0; i3 < 10; i3++) {
                if (i == f25952k[i2][i3]) {
                    sb2.insert(0, (char) (i2 + 48));
                    sb2.append((char) (i3 + 48));
                    return;
                }
            }
        }
        throw C6441j.m25551a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p285pd.AbstractC11636p
    /* renamed from: g */
    public boolean mo9180g(String str) {
        return super.mo9180g(m9176r(str));
    }

    @Override // p285pd.AbstractC11636p
    /* renamed from: j */
    protected int[] mo9179j(C7996a aVar, int i) {
        return AbstractC11636p.m9184m(aVar, i, true, f25951j);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p285pd.AbstractC11636p
    /* renamed from: k */
    public int mo9178k(C7996a aVar, int[] iArr, StringBuilder sb2) {
        int[] iArr2 = this.f25953i;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int j = aVar.m20932j();
        int i = iArr[1];
        int i2 = 0;
        for (int i3 = 0; i3 < 6 && i < j; i3++) {
            int i4 = AbstractC11636p.m9186i(aVar, iArr2, i, AbstractC11636p.f25947h);
            sb2.append((char) ((i4 % 10) + 48));
            for (int i5 : iArr2) {
                i += i5;
            }
            if (i4 >= 10) {
                i2 |= 1 << (5 - i3);
            }
        }
        m9175s(sb2, i2);
        return i;
    }

    @Override // p285pd.AbstractC11636p
    /* renamed from: p */
    EnumC6432a mo9177p() {
        return EnumC6432a.UPC_E;
    }
}
