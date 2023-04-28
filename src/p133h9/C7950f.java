package p133h9;

import java.util.Collections;
import java.util.List;
import p079e7.C6728o;
import p119g9.C7518d;
import p119g9.C7566w;
import p119g9.C7570y;
import p119g9.C7571z;

/* renamed from: h9.f */
/* loaded from: classes5.dex */
public final class C7950f {

    /* renamed from: a */
    public final List<byte[]> f17077a;

    /* renamed from: b */
    public final int f17078b;

    /* renamed from: c */
    public final String f17079c;

    private C7950f(List<byte[]> list, int i, String str) {
        this.f17077a = list;
        this.f17078b = i;
        this.f17079c = str;
    }

    /* renamed from: a */
    public static C7950f m21055a(C7570y yVar) {
        List list;
        try {
            yVar.m22016Q(21);
            int D = yVar.m22029D() & 3;
            int D2 = yVar.m22029D();
            int e = yVar.m22011e();
            int i = 0;
            for (int i2 = 0; i2 < D2; i2++) {
                yVar.m22016Q(1);
                int J = yVar.m22023J();
                for (int i3 = 0; i3 < J; i3++) {
                    int J2 = yVar.m22023J();
                    i += J2 + 4;
                    yVar.m22016Q(J2);
                }
            }
            yVar.m22017P(e);
            byte[] bArr = new byte[i];
            int i4 = 0;
            String str = null;
            for (int i5 = 0; i5 < D2; i5++) {
                int D3 = yVar.m22029D() & 127;
                int J3 = yVar.m22023J();
                for (int i6 = 0; i6 < J3; i6++) {
                    int J4 = yVar.m22023J();
                    byte[] bArr2 = C7566w.f16395a;
                    System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
                    int length = i4 + bArr2.length;
                    System.arraycopy(yVar.m22012d(), yVar.m22011e(), bArr, length, J4);
                    if (D3 == 33 && i6 == 0) {
                        str = C7518d.m22348c(new C7571z(bArr, length, length + J4));
                    }
                    i4 = length + J4;
                    yVar.m22016Q(J4);
                }
            }
            if (i == 0) {
                list = null;
            } else {
                list = Collections.singletonList(bArr);
            }
            return new C7950f(list, D + 1, str);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new C6728o("Error parsing HEVC config", e2);
        }
    }
}
