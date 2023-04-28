package p445yd;

import p445yd.C14363j;

/* renamed from: yd.b */
/* loaded from: classes3.dex */
final class C14347b {

    /* renamed from: a */
    private final int f32475a;

    /* renamed from: b */
    private final byte[] f32476b;

    private C14347b(int i, byte[] bArr) {
        this.f32475a = i;
        this.f32476b = bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C14347b[] m802b(byte[] bArr, C14363j jVar, EnumC14359f fVar) {
        int i;
        if (bArr.length == jVar.m771h()) {
            C14363j.C14365b f = jVar.m773f(fVar);
            C14363j.C14364a[] a = f.m766a();
            int i2 = 0;
            for (C14363j.C14364a aVar : a) {
                i2 += aVar.m768a();
            }
            C14347b[] bVarArr = new C14347b[i2];
            int i3 = 0;
            for (C14363j.C14364a aVar2 : a) {
                int i4 = 0;
                while (i4 < aVar2.m768a()) {
                    int b = aVar2.m767b();
                    bVarArr[i3] = new C14347b(b, new byte[f.m765b() + b]);
                    i4++;
                    i3++;
                }
            }
            int length = bVarArr[0].f32476b.length;
            int i5 = i2 - 1;
            while (i5 >= 0 && bVarArr[i5].f32476b.length != length) {
                i5--;
            }
            int i6 = i5 + 1;
            int b2 = length - f.m765b();
            int i7 = 0;
            for (int i8 = 0; i8 < b2; i8++) {
                int i9 = 0;
                while (i9 < i3) {
                    bVarArr[i9].f32476b[i8] = bArr[i7];
                    i9++;
                    i7++;
                }
            }
            int i10 = i6;
            while (i10 < i3) {
                bVarArr[i10].f32476b[b2] = bArr[i7];
                i10++;
                i7++;
            }
            int length2 = bVarArr[0].f32476b.length;
            while (b2 < length2) {
                int i11 = 0;
                while (i11 < i3) {
                    if (i11 < i6) {
                        i = b2;
                    } else {
                        i = b2 + 1;
                    }
                    bVarArr[i11].f32476b[i] = bArr[i7];
                    i11++;
                    i7++;
                }
                b2++;
            }
            return bVarArr;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public byte[] m803a() {
        return this.f32476b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m801c() {
        return this.f32475a;
    }
}
