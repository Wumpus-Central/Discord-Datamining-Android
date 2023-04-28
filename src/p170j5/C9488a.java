package p170j5;

import p095f4.C7014c;
import p170j5.C9490c;
import p394w3.C13735h;
import p394w3.C13740j;

/* renamed from: j5.a */
/* loaded from: classes7.dex */
public class C9488a implements C9490c.AbstractC9491a {

    /* renamed from: c */
    private static final byte[] f20994c;

    /* renamed from: d */
    private static final int f20995d;

    /* renamed from: e */
    private static final byte[] f20996e;

    /* renamed from: f */
    private static final int f20997f;

    /* renamed from: i */
    private static final byte[] f21000i;

    /* renamed from: j */
    private static final int f21001j;

    /* renamed from: k */
    private static final byte[] f21002k;

    /* renamed from: l */
    private static final int f21003l;

    /* renamed from: o */
    private static final byte[] f21006o;

    /* renamed from: q */
    private static final int f21008q;

    /* renamed from: a */
    final int f21009a = C13735h.m2849a(21, 20, f20995d, f20997f, 6, f21001j, f21003l, 12);

    /* renamed from: b */
    private boolean f21010b = false;

    /* renamed from: g */
    private static final byte[] f20998g = C9493e.m16135a("GIF87a");

    /* renamed from: h */
    private static final byte[] f20999h = C9493e.m16135a("GIF89a");

    /* renamed from: m */
    private static final byte[] f21004m = C9493e.m16135a("ftyp");

    /* renamed from: n */
    private static final byte[][] f21005n = {C9493e.m16135a("heic"), C9493e.m16135a("heix"), C9493e.m16135a("hevc"), C9493e.m16135a("hevx"), C9493e.m16135a("mif1"), C9493e.m16135a("msf1")};

    /* renamed from: p */
    private static final byte[] f21007p = {77, 77, 0, 42};

    static {
        byte[] bArr = {-1, -40, -1};
        f20994c = bArr;
        f20995d = bArr.length;
        byte[] bArr2 = {-119, 80, 78, 71, 13, 10, 26, 10};
        f20996e = bArr2;
        f20997f = bArr2.length;
        byte[] a = C9493e.m16135a("BM");
        f21000i = a;
        f21001j = a.length;
        byte[] bArr3 = {0, 0, 1, 0};
        f21002k = bArr3;
        f21003l = bArr3.length;
        byte[] bArr4 = {73, 73, 42, 0};
        f21006o = bArr4;
        f21008q = bArr4.length;
    }

    /* renamed from: c */
    private static C9490c m16154c(byte[] bArr, int i) {
        C13740j.m2839b(Boolean.valueOf(C7014c.m23650h(bArr, 0, i)));
        if (C7014c.m23651g(bArr, 0)) {
            return C9489b.f21016f;
        }
        if (C7014c.m23652f(bArr, 0)) {
            return C9489b.f21017g;
        }
        if (!C7014c.m23655c(bArr, 0, i)) {
            return C9490c.f21023c;
        }
        if (C7014c.m23656b(bArr, 0)) {
            return C9489b.f21020j;
        }
        if (C7014c.m23654d(bArr, 0)) {
            return C9489b.f21019i;
        }
        return C9489b.f21018h;
    }

    /* renamed from: d */
    private static boolean m16153d(byte[] bArr, int i) {
        byte[] bArr2 = f21000i;
        if (i < bArr2.length) {
            return false;
        }
        return C9493e.m16133c(bArr, bArr2);
    }

    /* renamed from: e */
    private static boolean m16152e(byte[] bArr, int i) {
        if (i < f21008q || (!C9493e.m16133c(bArr, f21006o) && !C9493e.m16133c(bArr, f21007p))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    private static boolean m16151f(byte[] bArr, int i) {
        if (i < 6) {
            return false;
        }
        if (C9493e.m16133c(bArr, f20998g) || C9493e.m16133c(bArr, f20999h)) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private static boolean m16150g(byte[] bArr, int i) {
        if (i < 12 || bArr[3] < 8 || !C9493e.m16134b(bArr, f21004m, 4)) {
            return false;
        }
        for (byte[] bArr2 : f21005n) {
            if (C9493e.m16134b(bArr, bArr2, 8)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    private static boolean m16149h(byte[] bArr, int i) {
        byte[] bArr2 = f21002k;
        if (i < bArr2.length) {
            return false;
        }
        return C9493e.m16133c(bArr, bArr2);
    }

    /* renamed from: i */
    private static boolean m16148i(byte[] bArr, int i) {
        byte[] bArr2 = f20994c;
        if (i < bArr2.length || !C9493e.m16133c(bArr, bArr2)) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    private static boolean m16147j(byte[] bArr, int i) {
        byte[] bArr2 = f20996e;
        if (i < bArr2.length || !C9493e.m16133c(bArr, bArr2)) {
            return false;
        }
        return true;
    }

    @Override // p170j5.C9490c.AbstractC9491a
    /* renamed from: a */
    public final C9490c mo16143a(byte[] bArr, int i) {
        C13740j.m2834g(bArr);
        if (!this.f21010b && C7014c.m23650h(bArr, 0, i)) {
            return m16154c(bArr, i);
        }
        if (m16148i(bArr, i)) {
            return C9489b.f21011a;
        }
        if (m16147j(bArr, i)) {
            return C9489b.f21012b;
        }
        if (this.f21010b && C7014c.m23650h(bArr, 0, i)) {
            return m16154c(bArr, i);
        }
        if (m16151f(bArr, i)) {
            return C9489b.f21013c;
        }
        if (m16153d(bArr, i)) {
            return C9489b.f21014d;
        }
        if (m16149h(bArr, i)) {
            return C9489b.f21015e;
        }
        if (m16150g(bArr, i)) {
            return C9489b.f21021k;
        }
        if (m16152e(bArr, i)) {
            return C9489b.f21022l;
        }
        return C9490c.f21023c;
    }

    @Override // p170j5.C9490c.AbstractC9491a
    /* renamed from: b */
    public int mo16142b() {
        return this.f21009a;
    }
}
