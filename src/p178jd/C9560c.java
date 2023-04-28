package p178jd;

/* renamed from: jd.c */
/* loaded from: classes3.dex */
public final class C9560c {

    /* renamed from: a */
    private final C9558a f21188a;

    public C9560c(C9558a aVar) {
        this.f21188a = aVar;
    }

    /* renamed from: b */
    private int[] m15986b(C9559b bVar) {
        int d = bVar.m15992d();
        int i = 0;
        if (d == 1) {
            return new int[]{bVar.m15993c(1)};
        }
        int[] iArr = new int[d];
        for (int i2 = 1; i2 < this.f21188a.m16000f() && i < d; i2++) {
            if (bVar.m15994b(i2) == 0) {
                iArr[i] = this.f21188a.m15998h(i2);
                i++;
            }
        }
        if (i == d) {
            return iArr;
        }
        throw new C9561d("Error locator degree does not match number of roots");
    }

    /* renamed from: c */
    private int[] m15985c(C9559b bVar, int[] iArr) {
        int i;
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            int h = this.f21188a.m15998h(iArr[i2]);
            int i3 = 1;
            for (int i4 = 0; i4 < length; i4++) {
                if (i2 != i4) {
                    int j = this.f21188a.m15996j(iArr[i4], h);
                    if ((j & 1) == 0) {
                        i = j | 1;
                    } else {
                        i = j & (-2);
                    }
                    i3 = this.f21188a.m15996j(i3, i);
                }
            }
            iArr2[i2] = this.f21188a.m15996j(bVar.m15994b(h), this.f21188a.m15998h(i3));
            if (this.f21188a.m16002d() != 0) {
                iArr2[i2] = this.f21188a.m15996j(iArr2[i2], h);
            }
        }
        return iArr2;
    }

    /* renamed from: d */
    private C9559b[] m15984d(C9559b bVar, C9559b bVar2, int i) {
        if (bVar.m15992d() < bVar2.m15992d()) {
            bVar2 = bVar;
            bVar = bVar2;
        }
        C9559b g = this.f21188a.m15999g();
        C9559b e = this.f21188a.m16001e();
        do {
            bVar2 = bVar;
            bVar = bVar2;
            g = e;
            if (bVar.m15992d() < i / 2) {
                int c = g.m15993c(0);
                if (c != 0) {
                    int h = this.f21188a.m15998h(c);
                    return new C9559b[]{g.m15990f(h), bVar.m15990f(h)};
                }
                throw new C9561d("sigmaTilde(0) was zero");
            } else if (!bVar.m15991e()) {
                C9559b g2 = this.f21188a.m15999g();
                int h2 = this.f21188a.m15998h(bVar.m15993c(bVar.m15992d()));
                while (bVar2.m15992d() >= bVar.m15992d() && !bVar2.m15991e()) {
                    int d = bVar2.m15992d() - bVar.m15992d();
                    int j = this.f21188a.m15996j(bVar2.m15993c(bVar2.m15992d()), h2);
                    g2 = g2.m15995a(this.f21188a.m16004b(d, j));
                    bVar2 = bVar2.m15995a(bVar.m15988h(d, j));
                }
                e = g2.m15989g(g).m15995a(g);
            } else {
                throw new C9561d("r_{i-1} was zero");
            }
        } while (bVar2.m15992d() < bVar.m15992d());
        throw new IllegalStateException("Division algorithm failed to reduce polynomial?");
    }

    /* renamed from: a */
    public void m15987a(int[] iArr, int i) {
        C9559b bVar = new C9559b(this.f21188a, iArr);
        int[] iArr2 = new int[i];
        boolean z = true;
        for (int i2 = 0; i2 < i; i2++) {
            C9558a aVar = this.f21188a;
            int b = bVar.m15994b(aVar.m16003c(aVar.m16002d() + i2));
            iArr2[(i - 1) - i2] = b;
            if (b != 0) {
                z = false;
            }
        }
        if (!z) {
            C9559b[] d = m15984d(this.f21188a.m16004b(i, 1), new C9559b(this.f21188a, iArr2), i);
            C9559b bVar2 = d[0];
            C9559b bVar3 = d[1];
            int[] b2 = m15986b(bVar2);
            int[] c = m15985c(bVar3, b2);
            for (int i3 = 0; i3 < b2.length; i3++) {
                int length = (iArr.length - 1) - this.f21188a.m15997i(b2[i3]);
                if (length >= 0) {
                    iArr[length] = C9558a.m16005a(iArr[length], c[i3]);
                } else {
                    throw new C9561d("Bad error location");
                }
            }
        }
    }
}
