package sd;

import p137hd.C7996a;

/* renamed from: sd.h */
/* loaded from: classes3.dex */
abstract class AbstractC12869h extends AbstractC12871j {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC12869h(C7996a aVar) {
        super(aVar);
    }

    /* renamed from: e */
    private static void m5244e(StringBuilder sb2, int i) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < 13; i4++) {
            int charAt = sb2.charAt(i4 + i) - '0';
            if ((i4 & 1) == 0) {
                charAt *= 3;
            }
            i3 += charAt;
        }
        int i5 = 10 - (i3 % 10);
        if (i5 != 10) {
            i2 = i5;
        }
        sb2.append(i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final void m5243f(StringBuilder sb2, int i) {
        sb2.append("(01)");
        int length = sb2.length();
        sb2.append('9');
        m5242g(sb2, i, length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final void m5242g(StringBuilder sb2, int i, int i2) {
        for (int i3 = 0; i3 < 4; i3++) {
            int f = m5237b().m5206f((i3 * 10) + i, 10);
            if (f / 100 == 0) {
                sb2.append('0');
            }
            if (f / 10 == 0) {
                sb2.append('0');
            }
            sb2.append(f);
        }
        m5244e(sb2, i2);
    }
}
