package p249nh;

import kotlin.jvm.internal.C9971q;

/* renamed from: nh.h */
/* loaded from: classes8.dex */
public final class C11144h {

    /* renamed from: a */
    public static final C11144h f24733a = new C11144h();

    /* renamed from: b */
    public static final C11142f f24734b;

    /* renamed from: c */
    public static final C11142f f24735c;

    /* renamed from: d */
    public static final C11142f f24736d;

    /* renamed from: e */
    public static final C11142f f24737e;

    /* renamed from: f */
    public static final C11142f f24738f;

    /* renamed from: g */
    public static final C11142f f24739g;

    /* renamed from: h */
    public static final C11142f f24740h;

    /* renamed from: i */
    public static final C11142f f24741i;

    /* renamed from: j */
    public static final C11142f f24742j;

    /* renamed from: k */
    public static final C11142f f24743k;

    /* renamed from: l */
    public static final C11142f f24744l;

    /* renamed from: m */
    public static final C11142f f24745m;

    /* renamed from: n */
    public static final C11142f f24746n;

    /* renamed from: o */
    public static final C11142f f24747o;

    /* renamed from: p */
    public static final C11142f f24748p;

    /* renamed from: q */
    public static final C11142f f24749q;

    /* renamed from: r */
    public static final C11142f f24750r;

    static {
        C11142f i = C11142f.m10764i("<no name provided>");
        C9971q.m14634f(i, "special(\"<no name provided>\")");
        f24734b = i;
        C11142f i2 = C11142f.m10764i("<root package>");
        C9971q.m14634f(i2, "special(\"<root package>\")");
        f24735c = i2;
        C11142f f = C11142f.m10767f("Companion");
        C9971q.m14634f(f, "identifier(\"Companion\")");
        f24736d = f;
        C11142f f2 = C11142f.m10767f("no_name_in_PSI_3d19d79d_1ba9_4cd0_b7f5_b46aa3cd5d40");
        C9971q.m14634f(f2, "identifier(\"no_name_in_P…_4cd0_b7f5_b46aa3cd5d40\")");
        f24737e = f2;
        C11142f i3 = C11142f.m10764i("<anonymous>");
        C9971q.m14634f(i3, "special(ANONYMOUS_STRING)");
        f24738f = i3;
        C11142f i4 = C11142f.m10764i("<unary>");
        C9971q.m14634f(i4, "special(\"<unary>\")");
        f24739g = i4;
        C11142f i5 = C11142f.m10764i("<unary-result>");
        C9971q.m14634f(i5, "special(\"<unary-result>\")");
        f24740h = i5;
        C11142f i6 = C11142f.m10764i("<this>");
        C9971q.m14634f(i6, "special(\"<this>\")");
        f24741i = i6;
        C11142f i7 = C11142f.m10764i("<init>");
        C9971q.m14634f(i7, "special(\"<init>\")");
        f24742j = i7;
        C11142f i8 = C11142f.m10764i("<iterator>");
        C9971q.m14634f(i8, "special(\"<iterator>\")");
        f24743k = i8;
        C11142f i9 = C11142f.m10764i("<destruct>");
        C9971q.m14634f(i9, "special(\"<destruct>\")");
        f24744l = i9;
        C11142f i10 = C11142f.m10764i("<local>");
        C9971q.m14634f(i10, "special(\"<local>\")");
        f24745m = i10;
        C11142f i11 = C11142f.m10764i("<unused var>");
        C9971q.m14634f(i11, "special(\"<unused var>\")");
        f24746n = i11;
        C11142f i12 = C11142f.m10764i("<set-?>");
        C9971q.m14634f(i12, "special(\"<set-?>\")");
        f24747o = i12;
        C11142f i13 = C11142f.m10764i("<array>");
        C9971q.m14634f(i13, "special(\"<array>\")");
        f24748p = i13;
        C11142f i14 = C11142f.m10764i("<receiver>");
        C9971q.m14634f(i14, "special(\"<receiver>\")");
        f24749q = i14;
        C11142f i15 = C11142f.m10764i("<get-entries>");
        C9971q.m14634f(i15, "special(\"<get-entries>\")");
        f24750r = i15;
    }

    private C11144h() {
    }

    /* renamed from: b */
    public static final C11142f m10761b(C11142f fVar) {
        return (fVar == null || fVar.m10766g()) ? f24737e : fVar;
    }

    /* renamed from: a */
    public final boolean m10762a(C11142f name) {
        boolean z;
        C9971q.m14633g(name, "name");
        String b = name.m10771b();
        C9971q.m14634f(b, "name.asString()");
        if (b.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z || name.m10766g()) {
            return false;
        }
        return true;
    }
}
