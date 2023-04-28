package p386vd;

/* renamed from: vd.b */
/* loaded from: classes3.dex */
public final class C13491b {

    /* renamed from: f */
    public static final C13491b f30136f = new C13491b(929, 3);

    /* renamed from: a */
    private final int[] f30137a;

    /* renamed from: b */
    private final int[] f30138b;

    /* renamed from: c */
    private final C13492c f30139c;

    /* renamed from: d */
    private final C13492c f30140d;

    /* renamed from: e */
    private final int f30141e;

    private C13491b(int i, int i2) {
        this.f30141e = i;
        this.f30137a = new int[i];
        this.f30138b = new int[i];
        int i3 = 1;
        for (int i4 = 0; i4 < i; i4++) {
            this.f30137a[i4] = i3;
            i3 = (i3 * i2) % i;
        }
        for (int i5 = 0; i5 < i - 1; i5++) {
            this.f30138b[this.f30137a[i5]] = i5;
        }
        this.f30139c = new C13492c(this, new int[]{0});
        this.f30140d = new C13492c(this, new int[]{1});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m3594a(int i, int i2) {
        return (i + i2) % this.f30141e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public C13492c m3593b(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.f30139c;
        } else {
            int[] iArr = new int[i + 1];
            iArr[0] = i2;
            return new C13492c(this, iArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m3592c(int i) {
        return this.f30137a[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public C13492c m3591d() {
        return this.f30140d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public int m3590e() {
        return this.f30141e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public C13492c m3589f() {
        return this.f30139c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public int m3588g(int i) {
        if (i != 0) {
            return this.f30137a[(this.f30141e - this.f30138b[i]) - 1];
        }
        throw new ArithmeticException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public int m3587h(int i) {
        if (i != 0) {
            return this.f30138b[i];
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public int m3586i(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.f30137a;
        int[] iArr2 = this.f30138b;
        return iArr[(iArr2[i] + iArr2[i2]) % (this.f30141e - 1)];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public int m3585j(int i, int i2) {
        int i3 = this.f30141e;
        return ((i + i3) - i2) % i3;
    }
}
