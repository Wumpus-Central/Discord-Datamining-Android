package p285pd;

import p066dd.C6441j;
import p066dd.EnumC6432a;
import p137hd.C7996a;

/* renamed from: pd.e */
/* loaded from: classes3.dex */
public final class C11625e extends AbstractC11636p {

    /* renamed from: j */
    static final int[] f25922j = {0, 11, 13, 14, 19, 25, 28, 21, 22, 26};

    /* renamed from: i */
    private final int[] f25923i = new int[4];

    /* renamed from: r */
    private static void m9213r(StringBuilder sb2, int i) {
        for (int i2 = 0; i2 < 10; i2++) {
            if (i == f25922j[i2]) {
                sb2.insert(0, (char) (i2 + 48));
                return;
            }
        }
        throw C6441j.m25551a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p285pd.AbstractC11636p
    /* renamed from: k */
    public int mo9178k(C7996a aVar, int[] iArr, StringBuilder sb2) {
        int[] iArr2 = this.f25923i;
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
        m9213r(sb2, i2);
        int i6 = AbstractC11636p.m9184m(aVar, i, true, AbstractC11636p.f25944e)[1];
        for (int i7 = 0; i7 < 6 && i6 < j; i7++) {
            sb2.append((char) (AbstractC11636p.m9186i(aVar, iArr2, i6, AbstractC11636p.f25946g) + 48));
            for (int i8 : iArr2) {
                i6 += i8;
            }
        }
        return i6;
    }

    @Override // p285pd.AbstractC11636p
    /* renamed from: p */
    EnumC6432a mo9177p() {
        return EnumC6432a.EAN_13;
    }
}
