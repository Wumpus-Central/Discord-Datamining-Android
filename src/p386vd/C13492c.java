package p386vd;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: vd.c */
/* loaded from: classes3.dex */
public final class C13492c {

    /* renamed from: a */
    private final C13491b f30142a;

    /* renamed from: b */
    private final int[] f30143b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C13492c(C13491b bVar, int[] iArr) {
        if (iArr.length != 0) {
            this.f30142a = bVar;
            int length = iArr.length;
            if (length <= 1 || iArr[0] != 0) {
                this.f30143b = iArr;
                return;
            }
            int i = 1;
            while (i < length && iArr[i] == 0) {
                i++;
            }
            if (i == length) {
                this.f30143b = new int[]{0};
                return;
            }
            int[] iArr2 = new int[length - i];
            this.f30143b = iArr2;
            System.arraycopy(iArr, i, iArr2, 0, iArr2.length);
            return;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C13492c m3584a(C13492c cVar) {
        if (!this.f30142a.equals(cVar.f30142a)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        } else if (m3580e()) {
            return cVar;
        } else {
            if (cVar.m3580e()) {
                return this;
            }
            int[] iArr = this.f30143b;
            int[] iArr2 = cVar.f30143b;
            if (iArr.length <= iArr2.length) {
                iArr = iArr2;
                iArr2 = iArr;
            }
            int[] iArr3 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr3, 0, length);
            for (int i = length; i < iArr.length; i++) {
                iArr3[i] = this.f30142a.m3594a(iArr2[i - length], iArr[i]);
            }
            return new C13492c(this.f30142a, iArr3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m3583b(int i) {
        if (i == 0) {
            return m3582c(0);
        }
        if (i == 1) {
            int i2 = 0;
            for (int i3 : this.f30143b) {
                i2 = this.f30142a.m3594a(i2, i3);
            }
            return i2;
        }
        int[] iArr = this.f30143b;
        int i4 = iArr[0];
        int length = iArr.length;
        for (int i5 = 1; i5 < length; i5++) {
            C13491b bVar = this.f30142a;
            i4 = bVar.m3594a(bVar.m3586i(i, i4), this.f30143b[i5]);
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m3582c(int i) {
        int[] iArr = this.f30143b;
        return iArr[(iArr.length - 1) - i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public int m3581d() {
        return this.f30143b.length - 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean m3580e() {
        return this.f30143b[0] == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public C13492c m3579f(int i) {
        if (i == 0) {
            return this.f30142a.m3589f();
        }
        if (i == 1) {
            return this;
        }
        int length = this.f30143b.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = this.f30142a.m3586i(this.f30143b[i2], i);
        }
        return new C13492c(this.f30142a, iArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public C13492c m3578g(C13492c cVar) {
        if (!this.f30142a.equals(cVar.f30142a)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        } else if (m3580e() || cVar.m3580e()) {
            return this.f30142a.m3589f();
        } else {
            int[] iArr = this.f30143b;
            int length = iArr.length;
            int[] iArr2 = cVar.f30143b;
            int length2 = iArr2.length;
            int[] iArr3 = new int[(length + length2) - 1];
            for (int i = 0; i < length; i++) {
                int i2 = iArr[i];
                for (int i3 = 0; i3 < length2; i3++) {
                    int i4 = i + i3;
                    C13491b bVar = this.f30142a;
                    iArr3[i4] = bVar.m3594a(iArr3[i4], bVar.m3586i(i2, iArr2[i3]));
                }
            }
            return new C13492c(this.f30142a, iArr3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public C13492c m3577h(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.f30142a.m3589f();
        } else {
            int length = this.f30143b.length;
            int[] iArr = new int[i + length];
            for (int i3 = 0; i3 < length; i3++) {
                iArr[i3] = this.f30142a.m3586i(this.f30143b[i3], i2);
            }
            return new C13492c(this.f30142a, iArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public C13492c m3576i() {
        int length = this.f30143b.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = this.f30142a.m3585j(0, this.f30143b[i]);
        }
        return new C13492c(this.f30142a, iArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public C13492c m3575j(C13492c cVar) {
        if (!this.f30142a.equals(cVar.f30142a)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        } else if (cVar.m3580e()) {
            return this;
        } else {
            return m3584a(cVar.m3576i());
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(m3581d() * 8);
        for (int d = m3581d(); d >= 0; d--) {
            int c = m3582c(d);
            if (c != 0) {
                if (c < 0) {
                    sb2.append(" - ");
                    c = -c;
                } else if (sb2.length() > 0) {
                    sb2.append(" + ");
                }
                if (d == 0 || c != 1) {
                    sb2.append(c);
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
