package p178jd;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: jd.b */
/* loaded from: classes3.dex */
public final class C9559b {

    /* renamed from: a */
    private final C9558a f21186a;

    /* renamed from: b */
    private final int[] f21187b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9559b(C9558a aVar, int[] iArr) {
        if (iArr.length != 0) {
            this.f21186a = aVar;
            int length = iArr.length;
            if (length <= 1 || iArr[0] != 0) {
                this.f21187b = iArr;
                return;
            }
            int i = 1;
            while (i < length && iArr[i] == 0) {
                i++;
            }
            if (i == length) {
                this.f21187b = new int[]{0};
                return;
            }
            int[] iArr2 = new int[length - i];
            this.f21187b = iArr2;
            System.arraycopy(iArr, i, iArr2, 0, iArr2.length);
            return;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C9559b m15995a(C9559b bVar) {
        if (!this.f21186a.equals(bVar.f21186a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (m15991e()) {
            return bVar;
        } else {
            if (bVar.m15991e()) {
                return this;
            }
            int[] iArr = this.f21187b;
            int[] iArr2 = bVar.f21187b;
            if (iArr.length <= iArr2.length) {
                iArr = iArr2;
                iArr2 = iArr;
            }
            int[] iArr3 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr3, 0, length);
            for (int i = length; i < iArr.length; i++) {
                iArr3[i] = C9558a.m16005a(iArr2[i - length], iArr[i]);
            }
            return new C9559b(this.f21186a, iArr3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m15994b(int i) {
        if (i == 0) {
            return m15993c(0);
        }
        if (i == 1) {
            int i2 = 0;
            for (int i3 : this.f21187b) {
                i2 = C9558a.m16005a(i2, i3);
            }
            return i2;
        }
        int[] iArr = this.f21187b;
        int i4 = iArr[0];
        int length = iArr.length;
        for (int i5 = 1; i5 < length; i5++) {
            i4 = C9558a.m16005a(this.f21186a.m15996j(i, i4), this.f21187b[i5]);
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m15993c(int i) {
        int[] iArr = this.f21187b;
        return iArr[(iArr.length - 1) - i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public int m15992d() {
        return this.f21187b.length - 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean m15991e() {
        return this.f21187b[0] == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public C9559b m15990f(int i) {
        if (i == 0) {
            return this.f21186a.m15999g();
        }
        if (i == 1) {
            return this;
        }
        int length = this.f21187b.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = this.f21186a.m15996j(this.f21187b[i2], i);
        }
        return new C9559b(this.f21186a, iArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public C9559b m15989g(C9559b bVar) {
        if (!this.f21186a.equals(bVar.f21186a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (m15991e() || bVar.m15991e()) {
            return this.f21186a.m15999g();
        } else {
            int[] iArr = this.f21187b;
            int length = iArr.length;
            int[] iArr2 = bVar.f21187b;
            int length2 = iArr2.length;
            int[] iArr3 = new int[(length + length2) - 1];
            for (int i = 0; i < length; i++) {
                int i2 = iArr[i];
                for (int i3 = 0; i3 < length2; i3++) {
                    int i4 = i + i3;
                    iArr3[i4] = C9558a.m16005a(iArr3[i4], this.f21186a.m15996j(i2, iArr2[i3]));
                }
            }
            return new C9559b(this.f21186a, iArr3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public C9559b m15988h(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.f21186a.m15999g();
        } else {
            int length = this.f21187b.length;
            int[] iArr = new int[i + length];
            for (int i3 = 0; i3 < length; i3++) {
                iArr[i3] = this.f21186a.m15996j(this.f21187b[i3], i2);
            }
            return new C9559b(this.f21186a, iArr);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(m15992d() * 8);
        for (int d = m15992d(); d >= 0; d--) {
            int c = m15993c(d);
            if (c != 0) {
                if (c < 0) {
                    sb2.append(" - ");
                    c = -c;
                } else if (sb2.length() > 0) {
                    sb2.append(" + ");
                }
                if (d == 0 || c != 1) {
                    int i = this.f21186a.m15997i(c);
                    if (i == 0) {
                        sb2.append('1');
                    } else if (i == 1) {
                        sb2.append('a');
                    } else {
                        sb2.append("a^");
                        sb2.append(i);
                    }
                }
                if (d != 0) {
                    if (d == 1) {
                        sb2.append('x');
                    } else {
                        sb2.append("x^");
                        sb2.append(d);
                    }
                }
            }
        }
        return sb2.toString();
    }
}
