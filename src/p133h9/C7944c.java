package p133h9;

import p119g9.C7570y;

/* renamed from: h9.c */
/* loaded from: classes5.dex */
public final class C7944c {

    /* renamed from: a */
    public final int f17050a;

    /* renamed from: b */
    public final int f17051b;

    /* renamed from: c */
    public final String f17052c;

    private C7944c(int i, int i2, String str) {
        this.f17050a = i;
        this.f17051b = i2;
        this.f17052c = str;
    }

    /* renamed from: a */
    public static C7944c m21077a(C7570y yVar) {
        String str;
        yVar.m22016Q(2);
        int D = yVar.m22029D();
        int i = D >> 1;
        int D2 = ((yVar.m22029D() >> 3) & 31) | ((D & 1) << 5);
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = "hev1";
        } else if (i != 9) {
            return null;
        } else {
            str = "avc3";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        String str2 = ".0";
        sb2.append(str2);
        sb2.append(i);
        if (D2 >= 10) {
            str2 = ".";
        }
        sb2.append(str2);
        sb2.append(D2);
        return new C7944c(i, D2, sb2.toString());
    }
}
