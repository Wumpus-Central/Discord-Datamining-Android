package p214ld;

import p066dd.C6437f;

/* renamed from: ld.e */
/* loaded from: classes3.dex */
public final class C10403e {

    /* renamed from: h */
    private static final C10403e[] f22799h = m13487a();

    /* renamed from: a */
    private final int f22800a;

    /* renamed from: b */
    private final int f22801b;

    /* renamed from: c */
    private final int f22802c;

    /* renamed from: d */
    private final int f22803d;

    /* renamed from: e */
    private final int f22804e;

    /* renamed from: f */
    private final C10406c f22805f;

    /* renamed from: g */
    private final int f22806g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ld.e$b */
    /* loaded from: classes3.dex */
    public static final class C10405b {

        /* renamed from: a */
        private final int f22807a;

        /* renamed from: b */
        private final int f22808b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public int m13478a() {
            return this.f22807a;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public int m13477b() {
            return this.f22808b;
        }

        private C10405b(int i, int i2) {
            this.f22807a = i;
            this.f22808b = i2;
        }
    }

    private C10403e(int i, int i2, int i3, int i4, int i5, C10406c cVar) {
        C10405b[] a;
        this.f22800a = i;
        this.f22801b = i2;
        this.f22802c = i3;
        this.f22803d = i4;
        this.f22804e = i5;
        this.f22805f = cVar;
        int b = cVar.m13475b();
        int i6 = 0;
        for (C10405b bVar : cVar.m13476a()) {
            i6 += bVar.m13478a() * (bVar.m13477b() + b);
        }
        this.f22806g = i6;
    }

    /* renamed from: a */
    private static C10403e[] m13487a() {
        return new C10403e[]{new C10403e(1, 10, 10, 8, 8, new C10406c(5, new C10405b(1, 3))), new C10403e(2, 12, 12, 10, 10, new C10406c(7, new C10405b(1, 5))), new C10403e(3, 14, 14, 12, 12, new C10406c(10, new C10405b(1, 8))), new C10403e(4, 16, 16, 14, 14, new C10406c(12, new C10405b(1, 12))), new C10403e(5, 18, 18, 16, 16, new C10406c(14, new C10405b(1, 18))), new C10403e(6, 20, 20, 18, 18, new C10406c(18, new C10405b(1, 22))), new C10403e(7, 22, 22, 20, 20, new C10406c(20, new C10405b(1, 30))), new C10403e(8, 24, 24, 22, 22, new C10406c(24, new C10405b(1, 36))), new C10403e(9, 26, 26, 24, 24, new C10406c(28, new C10405b(1, 44))), new C10403e(10, 32, 32, 14, 14, new C10406c(36, new C10405b(1, 62))), new C10403e(11, 36, 36, 16, 16, new C10406c(42, new C10405b(1, 86))), new C10403e(12, 40, 40, 18, 18, new C10406c(48, new C10405b(1, 114))), new C10403e(13, 44, 44, 20, 20, new C10406c(56, new C10405b(1, 144))), new C10403e(14, 48, 48, 22, 22, new C10406c(68, new C10405b(1, 174))), new C10403e(15, 52, 52, 24, 24, new C10406c(42, new C10405b(2, 102))), new C10403e(16, 64, 64, 14, 14, new C10406c(56, new C10405b(2, 140))), new C10403e(17, 72, 72, 16, 16, new C10406c(36, new C10405b(4, 92))), new C10403e(18, 80, 80, 18, 18, new C10406c(48, new C10405b(4, 114))), new C10403e(19, 88, 88, 20, 20, new C10406c(56, new C10405b(4, 144))), new C10403e(20, 96, 96, 22, 22, new C10406c(68, new C10405b(4, 174))), new C10403e(21, 104, 104, 24, 24, new C10406c(56, new C10405b(6, 136))), new C10403e(22, 120, 120, 18, 18, new C10406c(68, new C10405b(6, 175))), new C10403e(23, 132, 132, 20, 20, new C10406c(62, new C10405b(8, 163))), new C10403e(24, 144, 144, 22, 22, new C10406c(62, new C10405b(8, 156), new C10405b(2, 155))), new C10403e(25, 8, 18, 6, 16, new C10406c(7, new C10405b(1, 5))), new C10403e(26, 8, 32, 6, 14, new C10406c(11, new C10405b(1, 10))), new C10403e(27, 12, 26, 10, 24, new C10406c(14, new C10405b(1, 16))), new C10403e(28, 12, 36, 10, 16, new C10406c(18, new C10405b(1, 22))), new C10403e(29, 16, 36, 14, 16, new C10406c(24, new C10405b(1, 32))), new C10403e(30, 16, 48, 14, 22, new C10406c(28, new C10405b(1, 49)))};
    }

    /* renamed from: h */
    public static C10403e m13480h(int i, int i2) {
        C10403e[] eVarArr;
        if ((i & 1) == 0 && (i2 & 1) == 0) {
            for (C10403e eVar : f22799h) {
                if (eVar.f22801b == i && eVar.f22802c == i2) {
                    return eVar;
                }
            }
            throw C6437f.m25561a();
        }
        throw C6437f.m25561a();
    }

    /* renamed from: b */
    public int m13486b() {
        return this.f22804e;
    }

    /* renamed from: c */
    public int m13485c() {
        return this.f22803d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public C10406c m13484d() {
        return this.f22805f;
    }

    /* renamed from: e */
    public int m13483e() {
        return this.f22802c;
    }

    /* renamed from: f */
    public int m13482f() {
        return this.f22801b;
    }

    /* renamed from: g */
    public int m13481g() {
        return this.f22806g;
    }

    /* renamed from: i */
    public int m13479i() {
        return this.f22800a;
    }

    public String toString() {
        return String.valueOf(this.f22800a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ld.e$c */
    /* loaded from: classes3.dex */
    public static final class C10406c {

        /* renamed from: a */
        private final int f22809a;

        /* renamed from: b */
        private final C10405b[] f22810b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public C10405b[] m13476a() {
            return this.f22810b;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public int m13475b() {
            return this.f22809a;
        }

        private C10406c(int i, C10405b bVar) {
            this.f22809a = i;
            this.f22810b = new C10405b[]{bVar};
        }

        private C10406c(int i, C10405b bVar, C10405b bVar2) {
            this.f22809a = i;
            this.f22810b = new C10405b[]{bVar, bVar2};
        }
    }
}
