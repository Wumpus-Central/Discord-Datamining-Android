package p210l6;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: l6.a */
/* loaded from: classes7.dex */
public final class C10348a {

    /* renamed from: a */
    private final C10348a f22686a = null;

    /* renamed from: b */
    private final AtomicReference<C0322a> f22687b;

    /* renamed from: c */
    private final int f22688c;

    /* renamed from: d */
    private boolean f22689d;

    /* renamed from: e */
    private final boolean f22690e;

    /* renamed from: f */
    private int[] f22691f;

    /* renamed from: g */
    private int f22692g;

    /* renamed from: h */
    private int f22693h;

    /* renamed from: i */
    private int f22694i;

    /* renamed from: j */
    private int f22695j;

    /* renamed from: k */
    private int f22696k;

    /* renamed from: l6.a$a */
    /* loaded from: classes7.dex */
    private static final class C0322a {

        /* renamed from: a */
        public final int f22697a;

        /* renamed from: b */
        public final int f22698b;

        /* renamed from: c */
        public final int f22699c;

        /* renamed from: d */
        public final int[] f22700d;

        /* renamed from: e */
        public final String[] f22701e;

        /* renamed from: f */
        public final int f22702f;

        /* renamed from: g */
        public final int f22703g;

        public C0322a(int i, int i2, int i3, int[] iArr, String[] strArr, int i4, int i5) {
            this.f22697a = i;
            this.f22698b = i2;
            this.f22699c = i3;
            this.f22700d = iArr;
            this.f22701e = strArr;
            this.f22702f = i4;
            this.f22703g = i5;
        }

        /* renamed from: a */
        public static C0322a m13556a(int i) {
            int i2 = i << 3;
            return new C0322a(i, 0, C10348a.m13565a(i), new int[i2], new String[i << 1], i2 - i, i2);
        }
    }

    private C10348a(int i, boolean z, int i2, boolean z2) {
        this.f22688c = i2;
        this.f22689d = z;
        this.f22690e = z2;
        int i3 = 16;
        if (i >= 16) {
            if (((i - 1) & i) != 0) {
                while (i3 < i) {
                    i3 += i3;
                }
            }
            this.f22687b = new AtomicReference<>(C0322a.m13556a(i));
        }
        i = i3;
        this.f22687b = new AtomicReference<>(C0322a.m13556a(i));
    }

    /* renamed from: a */
    static int m13565a(int i) {
        int i2 = i >> 2;
        if (i2 < 64) {
            return 4;
        }
        if (i2 <= 256) {
            return 5;
        }
        return i2 <= 1024 ? 6 : 7;
    }

    /* renamed from: b */
    private final int m13564b() {
        int i = this.f22692g;
        return (i << 3) - i;
    }

    /* renamed from: c */
    public static C10348a m13563c() {
        long currentTimeMillis = System.currentTimeMillis();
        return m13562d((((int) currentTimeMillis) + ((int) (currentTimeMillis >>> 32))) | 1);
    }

    /* renamed from: d */
    protected static C10348a m13562d(int i) {
        return new C10348a(64, true, i, true);
    }

    /* renamed from: e */
    public int m13561e() {
        int i = this.f22693h;
        int i2 = 0;
        for (int i3 = 3; i3 < i; i3 += 4) {
            if (this.f22691f[i3] != 0) {
                i2++;
            }
        }
        return i2;
    }

    /* renamed from: f */
    public int m13560f() {
        int i = this.f22694i;
        int i2 = 0;
        for (int i3 = this.f22693h + 3; i3 < i; i3 += 4) {
            if (this.f22691f[i3] != 0) {
                i2++;
            }
        }
        return i2;
    }

    /* renamed from: g */
    public int m13559g() {
        return (this.f22696k - m13564b()) >> 2;
    }

    /* renamed from: h */
    public int m13558h() {
        int i = this.f22694i + 3;
        int i2 = this.f22692g + i;
        int i3 = 0;
        while (i < i2) {
            if (this.f22691f[i] != 0) {
                i3++;
            }
            i += 4;
        }
        return i3;
    }

    /* renamed from: i */
    public int m13557i() {
        int i = this.f22692g << 3;
        int i2 = 0;
        for (int i3 = 3; i3 < i; i3 += 4) {
            if (this.f22691f[i3] != 0) {
                i2++;
            }
        }
        return i2;
    }

    public String toString() {
        int e = m13561e();
        int f = m13560f();
        int h = m13558h();
        int g = m13559g();
        return String.format("[%s: size=%d, hashSize=%d, %d/%d/%d/%d pri/sec/ter/spill (=%s), total:%d]", C10348a.class.getName(), Integer.valueOf(this.f22695j), Integer.valueOf(this.f22692g), Integer.valueOf(e), Integer.valueOf(f), Integer.valueOf(h), Integer.valueOf(g), Integer.valueOf(e + f + h + g), Integer.valueOf(m13557i()));
    }
}
