package p386vd;

import p066dd.C6435d;

/* renamed from: vd.a */
/* loaded from: classes3.dex */
public final class C13490a {

    /* renamed from: a */
    private final C13491b f30135a = C13491b.f30136f;

    /* renamed from: b */
    private int[] m3597b(C13492c cVar) {
        int d = cVar.m3581d();
        int[] iArr = new int[d];
        int i = 0;
        for (int i2 = 1; i2 < this.f30135a.m3590e() && i < d; i2++) {
            if (cVar.m3583b(i2) == 0) {
                iArr[i] = this.f30135a.m3588g(i2);
                i++;
            }
        }
        if (i == d) {
            return iArr;
        }
        throw C6435d.m25562a();
    }

    /* renamed from: c */
    private int[] m3596c(C13492c cVar, C13492c cVar2, int[] iArr) {
        int d = cVar2.m3581d();
        int[] iArr2 = new int[d];
        for (int i = 1; i <= d; i++) {
            iArr2[d - i] = this.f30135a.m3586i(i, cVar2.m3582c(i));
        }
        C13492c cVar3 = new C13492c(this.f30135a, iArr2);
        int length = iArr.length;
        int[] iArr3 = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            int g = this.f30135a.m3588g(iArr[i2]);
            iArr3[i2] = this.f30135a.m3586i(this.f30135a.m3585j(0, cVar.m3583b(g)), this.f30135a.m3588g(cVar3.m3583b(g)));
        }
        return iArr3;
    }

    /* renamed from: d */
    private C13492c[] m3595d(C13492c cVar, C13492c cVar2, int i) {
        if (cVar.m3581d() < cVar2.m3581d()) {
            cVar2 = cVar;
            cVar = cVar2;
        }
        C13492c f = this.f30135a.m3589f();
        C13492c d = this.f30135a.m3591d();
        while (true) {
            cVar2 = cVar;
            cVar = cVar2;
            f = d;
            if (cVar.m3581d() < i / 2) {
                int c = f.m3582c(0);
                if (c != 0) {
                    int g = this.f30135a.m3588g(c);
                    return new C13492c[]{f.m3579f(g), cVar.m3579f(g)};
                }
                throw C6435d.m25562a();
            } else if (!cVar.m3580e()) {
                C13492c f2 = this.f30135a.m3589f();
                int g2 = this.f30135a.m3588g(cVar.m3582c(cVar.m3581d()));
                while (cVar2.m3581d() >= cVar.m3581d() && !cVar2.m3580e()) {
                    int d2 = cVar2.m3581d() - cVar.m3581d();
                    int i2 = this.f30135a.m3586i(cVar2.m3582c(cVar2.m3581d()), g2);
                    f2 = f2.m3584a(this.f30135a.m3593b(d2, i2));
                    cVar2 = cVar2.m3575j(cVar.m3577h(d2, i2));
                }
                d = f2.m3578g(f).m3575j(f).m3576i();
            } else {
                throw C6435d.m25562a();
            }
        }
    }

    /* renamed from: a */
    public int m3598a(int[] iArr, int i, int[] iArr2) {
        C13492c cVar = new C13492c(this.f30135a, iArr);
        int[] iArr3 = new int[i];
        boolean z = false;
        for (int i2 = i; i2 > 0; i2--) {
            int b = cVar.m3583b(this.f30135a.m3592c(i2));
            iArr3[i - i2] = b;
            if (b != 0) {
                z = true;
            }
        }
        if (!z) {
            return 0;
        }
        C13492c d = this.f30135a.m3591d();
        if (iArr2 != null) {
            for (int i3 : iArr2) {
                int c = this.f30135a.m3592c((iArr.length - 1) - i3);
                C13491b bVar = this.f30135a;
                d = d.m3578g(new C13492c(bVar, new int[]{bVar.m3585j(0, c), 1}));
            }
        }
        C13492c[] d2 = m3595d(this.f30135a.m3593b(i, 1), new C13492c(this.f30135a, iArr3), i);
        C13492c cVar2 = d2[0];
        C13492c cVar3 = d2[1];
        int[] b2 = m3597b(cVar2);
        int[] c2 = m3596c(cVar3, cVar2, b2);
        for (int i4 = 0; i4 < b2.length; i4++) {
            int length = (iArr.length - 1) - this.f30135a.m3587h(b2[i4]);
            if (length >= 0) {
                iArr[length] = this.f30135a.m3585j(iArr[length], c2[i4]);
            } else {
                throw C6435d.m25562a();
            }
        }
        return b2.length;
    }
}
