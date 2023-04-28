package p265od;

import java.util.Map;
import p066dd.C6435d;
import p066dd.C6437f;
import p066dd.EnumC6436e;
import p137hd.C7997b;
import p137hd.C8000e;
import p178jd.C9558a;
import p178jd.C9560c;
import p178jd.C9561d;

/* renamed from: od.c */
/* loaded from: classes3.dex */
public final class C11257c {

    /* renamed from: a */
    private final C9560c f25169a = new C9560c(C9558a.f21178o);

    /* renamed from: a */
    private void m10319a(byte[] bArr, int i, int i2, int i3, int i4) {
        int i5;
        int i6 = i2 + i3;
        if (i4 == 0) {
            i5 = 1;
        } else {
            i5 = 2;
        }
        int[] iArr = new int[i6 / i5];
        for (int i7 = 0; i7 < i6; i7++) {
            if (i4 == 0 || i7 % 2 == i4 - 1) {
                iArr[i7 / i5] = bArr[i7 + i] & 255;
            }
        }
        try {
            this.f25169a.m15987a(iArr, i3 / i5);
            for (int i8 = 0; i8 < i2; i8++) {
                if (i4 == 0 || i8 % 2 == i4 - 1) {
                    bArr[i8 + i] = (byte) iArr[i8 / i5];
                }
            }
        } catch (C9561d unused) {
            throw C6435d.m25562a();
        }
    }

    /* renamed from: b */
    public C8000e m10318b(C7997b bVar, Map<EnumC6436e, ?> map) {
        byte[] bArr;
        byte[] a = new C11255a(bVar).m10329a();
        m10319a(a, 0, 10, 10, 0);
        int i = a[0] & 15;
        if (i == 2 || i == 3 || i == 4) {
            m10319a(a, 20, 84, 40, 1);
            m10319a(a, 20, 84, 40, 2);
            bArr = new byte[94];
        } else if (i == 5) {
            m10319a(a, 20, 68, 56, 1);
            m10319a(a, 20, 68, 56, 2);
            bArr = new byte[78];
        } else {
            throw C6437f.m25561a();
        }
        System.arraycopy(a, 0, bArr, 0, 10);
        System.arraycopy(a, 20, bArr, 10, bArr.length - 10);
        return C11256b.m10328a(bArr, i);
    }
}
