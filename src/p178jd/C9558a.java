package p178jd;

import p163j$.util.Spliterator;

/* renamed from: jd.a */
/* loaded from: classes3.dex */
public final class C9558a {

    /* renamed from: j */
    public static final C9558a f21173j;

    /* renamed from: m */
    public static final C9558a f21176m;

    /* renamed from: n */
    public static final C9558a f21177n;

    /* renamed from: o */
    public static final C9558a f21178o;

    /* renamed from: a */
    private final int[] f21179a;

    /* renamed from: b */
    private final int[] f21180b;

    /* renamed from: c */
    private final C9559b f21181c;

    /* renamed from: d */
    private final C9559b f21182d;

    /* renamed from: e */
    private final int f21183e;

    /* renamed from: f */
    private final int f21184f;

    /* renamed from: g */
    private final int f21185g;

    /* renamed from: h */
    public static final C9558a f21171h = new C9558a(4201, 4096, 1);

    /* renamed from: i */
    public static final C9558a f21172i = new C9558a(1033, Spliterator.IMMUTABLE, 1);

    /* renamed from: k */
    public static final C9558a f21174k = new C9558a(19, 16, 1);

    /* renamed from: l */
    public static final C9558a f21175l = new C9558a(285, Spliterator.NONNULL, 0);

    static {
        C9558a aVar = new C9558a(67, 64, 1);
        f21173j = aVar;
        C9558a aVar2 = new C9558a(301, Spliterator.NONNULL, 1);
        f21176m = aVar2;
        f21177n = aVar2;
        f21178o = aVar;
    }

    public C9558a(int i, int i2, int i3) {
        this.f21184f = i;
        this.f21183e = i2;
        this.f21185g = i3;
        this.f21179a = new int[i2];
        this.f21180b = new int[i2];
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            this.f21179a[i5] = i4;
            i4 <<= 1;
            if (i4 >= i2) {
                i4 = (i4 ^ i) & (i2 - 1);
            }
        }
        for (int i6 = 0; i6 < i2 - 1; i6++) {
            this.f21180b[this.f21179a[i6]] = i6;
        }
        this.f21181c = new C9559b(this, new int[]{0});
        this.f21182d = new C9559b(this, new int[]{1});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m16005a(int i, int i2) {
        return i ^ i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public C9559b m16004b(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.f21181c;
        } else {
            int[] iArr = new int[i + 1];
            iArr[0] = i2;
            return new C9559b(this, iArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m16003c(int i) {
        return this.f21179a[i];
    }

    /* renamed from: d */
    public int m16002d() {
        return this.f21185g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public C9559b m16001e() {
        return this.f21182d;
    }

    /* renamed from: f */
    public int m16000f() {
        return this.f21183e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public C9559b m15999g() {
        return this.f21181c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public int m15998h(int i) {
        if (i != 0) {
            return this.f21179a[(this.f21183e - this.f21180b[i]) - 1];
        }
        throw new ArithmeticException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public int m15997i(int i) {
        if (i != 0) {
            return this.f21180b[i];
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public int m15996j(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.f21179a;
        int[] iArr2 = this.f21180b;
        return iArr[(iArr2[i] + iArr2[i2]) % (this.f21183e - 1)];
    }

    public String toString() {
        return "GF(0x" + Integer.toHexString(this.f21184f) + ',' + this.f21183e + ')';
    }
}
