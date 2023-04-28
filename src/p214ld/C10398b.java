package p214ld;

import p214ld.C10403e;

/* renamed from: ld.b */
/* loaded from: classes3.dex */
final class C10398b {

    /* renamed from: a */
    private final int f22782a;

    /* renamed from: b */
    private final byte[] f22783b;

    private C10398b(int i, byte[] bArr) {
        this.f22782a = i;
        this.f22783b = bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C10398b[] m13500b(byte[] bArr, C10403e eVar) {
        boolean z;
        int i;
        int i2;
        C10403e.C10406c d = eVar.m13484d();
        C10403e.C10405b[] a = d.m13476a();
        int i3 = 0;
        for (C10403e.C10405b bVar : a) {
            i3 += bVar.m13478a();
        }
        C10398b[] bVarArr = new C10398b[i3];
        int i4 = 0;
        for (C10403e.C10405b bVar2 : a) {
            int i5 = 0;
            while (i5 < bVar2.m13478a()) {
                int b = bVar2.m13477b();
                bVarArr[i4] = new C10398b(b, new byte[d.m13475b() + b]);
                i5++;
                i4++;
            }
        }
        int length = bVarArr[0].f22783b.length - d.m13475b();
        int i6 = length - 1;
        int i7 = 0;
        for (int i8 = 0; i8 < i6; i8++) {
            int i9 = 0;
            while (i9 < i4) {
                bVarArr[i9].f22783b[i8] = bArr[i7];
                i9++;
                i7++;
            }
        }
        if (eVar.m13479i() == 24) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = 8;
        } else {
            i = i4;
        }
        int i10 = 0;
        while (i10 < i) {
            bVarArr[i10].f22783b[i6] = bArr[i7];
            i10++;
            i7++;
        }
        int length2 = bVarArr[0].f22783b.length;
        while (length < length2) {
            int i11 = 0;
            while (i11 < i4) {
                if (z) {
                    i2 = (i11 + 8) % i4;
                } else {
                    i2 = i11;
                }
                bVarArr[i2].f22783b[(!z || i2 <= 7) ? length : length - 1] = bArr[i7];
                i11++;
                i7++;
            }
            length++;
        }
        if (i7 == bArr.length) {
            return bVarArr;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public byte[] m13501a() {
        return this.f22783b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m13499c() {
        return this.f22782a;
    }
}
