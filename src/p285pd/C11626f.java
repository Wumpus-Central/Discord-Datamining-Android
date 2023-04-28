package p285pd;

import p066dd.EnumC6432a;
import p137hd.C7996a;

/* renamed from: pd.f */
/* loaded from: classes3.dex */
public final class C11626f extends AbstractC11636p {

    /* renamed from: i */
    private final int[] f25924i = new int[4];

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p285pd.AbstractC11636p
    /* renamed from: k */
    public int mo9178k(C7996a aVar, int[] iArr, StringBuilder sb2) {
        int[] iArr2 = this.f25924i;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int j = aVar.m20932j();
        int i = iArr[1];
        for (int i2 = 0; i2 < 4 && i < j; i2++) {
            sb2.append((char) (AbstractC11636p.m9186i(aVar, iArr2, i, AbstractC11636p.f25946g) + 48));
            for (int i3 : iArr2) {
                i += i3;
            }
        }
        int i4 = AbstractC11636p.m9184m(aVar, i, true, AbstractC11636p.f25944e)[1];
        for (int i5 = 0; i5 < 4 && i4 < j; i5++) {
            sb2.append((char) (AbstractC11636p.m9186i(aVar, iArr2, i4, AbstractC11636p.f25946g) + 48));
            for (int i6 : iArr2) {
                i4 += i6;
            }
        }
        return i4;
    }

    @Override // p285pd.AbstractC11636p
    /* renamed from: p */
    EnumC6432a mo9177p() {
        return EnumC6432a.EAN_8;
    }
}
