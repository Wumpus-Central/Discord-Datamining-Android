package p133h9;

import java.util.ArrayList;
import java.util.List;
import p079e7.C6728o;
import p119g9.C7518d;
import p119g9.C7566w;
import p119g9.C7570y;

/* renamed from: h9.a */
/* loaded from: classes5.dex */
public final class C7939a {

    /* renamed from: a */
    public final List<byte[]> f17037a;

    /* renamed from: b */
    public final int f17038b;

    /* renamed from: c */
    public final int f17039c;

    /* renamed from: d */
    public final int f17040d;

    /* renamed from: e */
    public final float f17041e;

    /* renamed from: f */
    public final String f17042f;

    private C7939a(List<byte[]> list, int i, int i2, int i3, float f, String str) {
        this.f17037a = list;
        this.f17038b = i;
        this.f17039c = i2;
        this.f17040d = i3;
        this.f17041e = f;
        this.f17042f = str;
    }

    /* renamed from: a */
    private static byte[] m21117a(C7570y yVar) {
        int J = yVar.m22023J();
        int e = yVar.m22011e();
        yVar.m22016Q(J);
        return C7518d.m22347d(yVar.m22012d(), e, J);
    }

    /* renamed from: b */
    public static C7939a m21116b(C7570y yVar) {
        String str;
        float f;
        int i;
        int i2;
        try {
            yVar.m22016Q(4);
            int D = (yVar.m22029D() & 3) + 1;
            if (D != 3) {
                ArrayList arrayList = new ArrayList();
                int D2 = yVar.m22029D() & 31;
                for (int i3 = 0; i3 < D2; i3++) {
                    arrayList.add(m21117a(yVar));
                }
                int D3 = yVar.m22029D();
                for (int i4 = 0; i4 < D3; i4++) {
                    arrayList.add(m21117a(yVar));
                }
                if (D2 > 0) {
                    C7566w.C7568b i5 = C7566w.m22054i((byte[]) arrayList.get(0), D, ((byte[]) arrayList.get(0)).length);
                    int i6 = i5.f16406e;
                    int i7 = i5.f16407f;
                    float f2 = i5.f16408g;
                    str = C7518d.m22350a(i5.f16402a, i5.f16403b, i5.f16404c);
                    i2 = i6;
                    i = i7;
                    f = f2;
                } else {
                    i2 = -1;
                    i = -1;
                    f = 1.0f;
                    str = null;
                }
                return new C7939a(arrayList, D, i2, i, f, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new C6728o("Error parsing AVC config", e);
        }
    }
}
