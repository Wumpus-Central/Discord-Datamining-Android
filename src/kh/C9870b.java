package kh;

import p159ih.C8544c;
import p159ih.EnumC8571j;
import p159ih.EnumC8573k;
import p159ih.EnumC8624x;
import ph.C11710j;

/* renamed from: kh.b */
/* loaded from: classes8.dex */
public class C9870b {

    /* renamed from: A */
    public static final C0301b f38748A;

    /* renamed from: B */
    public static final C0301b f38749B;

    /* renamed from: C */
    public static final C0301b f38750C;

    /* renamed from: D */
    public static final C0301b f38751D;

    /* renamed from: E */
    public static final C0301b f38752E;

    /* renamed from: F */
    public static final C0301b f38753F;

    /* renamed from: G */
    public static final C0301b f38754G;

    /* renamed from: H */
    public static final C0301b f38755H;

    /* renamed from: I */
    public static final C0301b f38756I;

    /* renamed from: J */
    public static final C0301b f38757J;

    /* renamed from: K */
    public static final C0301b f38758K;

    /* renamed from: L */
    public static final C0301b f38759L;

    /* renamed from: M */
    public static final C0301b f38760M;

    /* renamed from: N */
    public static final C0301b f38761N;

    /* renamed from: O */
    public static final C0301b f38762O = AbstractC9873d.m15136c();

    /* renamed from: a */
    public static final C0301b f22000a;

    /* renamed from: b */
    public static final C0301b f22001b;

    /* renamed from: c */
    public static final C0301b f22002c;

    /* renamed from: d */
    public static final AbstractC9873d<EnumC8624x> f22003d;

    /* renamed from: e */
    public static final AbstractC9873d<EnumC8573k> f22004e;

    /* renamed from: f */
    public static final AbstractC9873d<C8544c.EnumC0270c> f22005f;

    /* renamed from: g */
    public static final C0301b f22006g;

    /* renamed from: h */
    public static final C0301b f22007h;

    /* renamed from: i */
    public static final C0301b f22008i;

    /* renamed from: j */
    public static final C0301b f22009j;

    /* renamed from: k */
    public static final C0301b f22010k;

    /* renamed from: l */
    public static final C0301b f22011l;

    /* renamed from: m */
    public static final C0301b f22012m;

    /* renamed from: n */
    public static final C0301b f22013n;

    /* renamed from: o */
    public static final AbstractC9873d<EnumC8571j> f22014o;

    /* renamed from: p */
    public static final C0301b f22015p;

    /* renamed from: q */
    public static final C0301b f22016q;

    /* renamed from: r */
    public static final C0301b f22017r;

    /* renamed from: s */
    public static final C0301b f22018s;

    /* renamed from: t */
    public static final C0301b f22019t;

    /* renamed from: u */
    public static final C0301b f22020u;

    /* renamed from: v */
    public static final C0301b f22021v;

    /* renamed from: w */
    public static final C0301b f22022w;

    /* renamed from: x */
    public static final C0301b f22023x;

    /* renamed from: y */
    public static final C0301b f22024y;

    /* renamed from: z */
    public static final C0301b f22025z;

    /* renamed from: kh.b$b */
    /* loaded from: classes8.dex */
    public static class C0301b extends AbstractC9873d<Boolean> {
        public C0301b(int i) {
            super(i, 1);
        }

        /* renamed from: f */
        private static /* synthetic */ void m15145f(int i) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$BooleanFlagField", "get"));
        }

        /* renamed from: g */
        public Boolean mo15135d(int i) {
            boolean z = true;
            if ((i & (1 << this.f22027a)) == 0) {
                z = false;
            }
            Boolean valueOf = Boolean.valueOf(z);
            if (valueOf == null) {
                m15145f(0);
            }
            return valueOf;
        }

        /* renamed from: h */
        public int mo15134e(Boolean bool) {
            if (bool.booleanValue()) {
                return 1 << this.f22027a;
            }
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kh.b$c */
    /* loaded from: classes8.dex */
    public static class C9872c<E extends C11710j.AbstractC11711a> extends AbstractC9873d<E> {

        /* renamed from: c */
        private final E[] f22026c;

        public C9872c(int i, E[] eArr) {
            super(i, m15141g(eArr));
            this.f22026c = eArr;
        }

        /* renamed from: f */
        private static /* synthetic */ void m15142f(int i) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "enumEntries", "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField", "bitWidth"));
        }

        /* renamed from: g */
        private static <E> int m15141g(E[] eArr) {
            if (eArr == null) {
                m15142f(0);
            }
            int length = eArr.length - 1;
            if (length == 0) {
                return 1;
            }
            for (int i = 31; i >= 0; i--) {
                if (((1 << i) & length) != 0) {
                    return i + 1;
                }
            }
            throw new IllegalStateException("Empty enum: " + eArr.getClass());
        }

        /* renamed from: h */
        public E mo15135d(int i) {
            E[] eArr;
            int i2 = this.f22027a;
            int i3 = (i & (((1 << this.f22028b) - 1) << i2)) >> i2;
            for (E e : this.f22026c) {
                if (e.getNumber() == i3) {
                    return e;
                }
            }
            return null;
        }

        /* renamed from: i */
        public int mo15134e(E e) {
            return e.getNumber() << this.f22027a;
        }
    }

    /* renamed from: kh.b$d */
    /* loaded from: classes8.dex */
    public static abstract class AbstractC9873d<E> {

        /* renamed from: a */
        public final int f22027a;

        /* renamed from: b */
        public final int f22028b;

        /* JADX WARN: Incorrect types in method signature: <E::Lph/j$a;>(Lkh/b$d<*>;[TE;)Lkh/b$d<TE;>; */
        /* renamed from: a */
        public static AbstractC9873d m15138a(AbstractC9873d dVar, C11710j.AbstractC11711a[] aVarArr) {
            return new C9872c(dVar.f22027a + dVar.f22028b, aVarArr);
        }

        /* renamed from: b */
        public static C0301b m15137b(AbstractC9873d<?> dVar) {
            return new C0301b(dVar.f22027a + dVar.f22028b);
        }

        /* renamed from: c */
        public static C0301b m15136c() {
            return new C0301b(0);
        }

        /* renamed from: d */
        public abstract E mo15135d(int i);

        /* renamed from: e */
        public abstract int mo15134e(E e);

        private AbstractC9873d(int i, int i2) {
            this.f22027a = i;
            this.f22028b = i2;
        }
    }

    static {
        C0301b c = AbstractC9873d.m15136c();
        f22000a = c;
        f22001b = AbstractC9873d.m15137b(c);
        C0301b c2 = AbstractC9873d.m15136c();
        f22002c = c2;
        AbstractC9873d<EnumC8624x> a = AbstractC9873d.m15138a(c2, EnumC8624x.values());
        f22003d = a;
        AbstractC9873d<EnumC8573k> a2 = AbstractC9873d.m15138a(a, EnumC8573k.values());
        f22004e = a2;
        AbstractC9873d<C8544c.EnumC0270c> a3 = AbstractC9873d.m15138a(a2, C8544c.EnumC0270c.values());
        f22005f = a3;
        C0301b b = AbstractC9873d.m15137b(a3);
        f22006g = b;
        C0301b b2 = AbstractC9873d.m15137b(b);
        f22007h = b2;
        C0301b b3 = AbstractC9873d.m15137b(b2);
        f22008i = b3;
        C0301b b4 = AbstractC9873d.m15137b(b3);
        f22009j = b4;
        C0301b b5 = AbstractC9873d.m15137b(b4);
        f22010k = b5;
        f22011l = AbstractC9873d.m15137b(b5);
        C0301b b6 = AbstractC9873d.m15137b(a);
        f22012m = b6;
        f22013n = AbstractC9873d.m15137b(b6);
        AbstractC9873d<EnumC8571j> a4 = AbstractC9873d.m15138a(a2, EnumC8571j.values());
        f22014o = a4;
        C0301b b7 = AbstractC9873d.m15137b(a4);
        f22015p = b7;
        C0301b b8 = AbstractC9873d.m15137b(b7);
        f22016q = b8;
        C0301b b9 = AbstractC9873d.m15137b(b8);
        f22017r = b9;
        C0301b b10 = AbstractC9873d.m15137b(b9);
        f22018s = b10;
        C0301b b11 = AbstractC9873d.m15137b(b10);
        f22019t = b11;
        C0301b b12 = AbstractC9873d.m15137b(b11);
        f22020u = b12;
        C0301b b13 = AbstractC9873d.m15137b(b12);
        f22021v = b13;
        f22022w = AbstractC9873d.m15137b(b13);
        C0301b b14 = AbstractC9873d.m15137b(a4);
        f22023x = b14;
        C0301b b15 = AbstractC9873d.m15137b(b14);
        f22024y = b15;
        C0301b b16 = AbstractC9873d.m15137b(b15);
        f22025z = b16;
        C0301b b17 = AbstractC9873d.m15137b(b16);
        f38748A = b17;
        C0301b b18 = AbstractC9873d.m15137b(b17);
        f38749B = b18;
        C0301b b19 = AbstractC9873d.m15137b(b18);
        f38750C = b19;
        C0301b b20 = AbstractC9873d.m15137b(b19);
        f38751D = b20;
        C0301b b21 = AbstractC9873d.m15137b(b20);
        f38752E = b21;
        f38753F = AbstractC9873d.m15137b(b21);
        C0301b b22 = AbstractC9873d.m15137b(c2);
        f38754G = b22;
        C0301b b23 = AbstractC9873d.m15137b(b22);
        f38755H = b23;
        f38756I = AbstractC9873d.m15137b(b23);
        C0301b b24 = AbstractC9873d.m15137b(a2);
        f38757J = b24;
        C0301b b25 = AbstractC9873d.m15137b(b24);
        f38758K = b25;
        f38759L = AbstractC9873d.m15137b(b25);
        C0301b c3 = AbstractC9873d.m15136c();
        f38760M = c3;
        f38761N = AbstractC9873d.m15137b(c3);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004a  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void m15147a(int r5) {
        /*
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 1
            r2 = 0
            r3 = 2
            if (r5 == r1) goto L_0x002b
            if (r5 == r3) goto L_0x0026
            r4 = 5
            if (r5 == r4) goto L_0x002b
            r4 = 6
            if (r5 == r4) goto L_0x0021
            r4 = 8
            if (r5 == r4) goto L_0x002b
            r4 = 9
            if (r5 == r4) goto L_0x0021
            r4 = 11
            if (r5 == r4) goto L_0x002b
            java.lang.String r4 = "visibility"
            r0[r2] = r4
            goto L_0x002f
        L_0x0021:
            java.lang.String r4 = "memberKind"
            r0[r2] = r4
            goto L_0x002f
        L_0x0026:
            java.lang.String r4 = "kind"
            r0[r2] = r4
            goto L_0x002f
        L_0x002b:
            java.lang.String r4 = "modality"
            r0[r2] = r4
        L_0x002f:
            java.lang.String r2 = "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags"
            r0[r1] = r2
            switch(r5) {
                case 3: goto L_0x004a;
                case 4: goto L_0x0045;
                case 5: goto L_0x0045;
                case 6: goto L_0x0045;
                case 7: goto L_0x0040;
                case 8: goto L_0x0040;
                case 9: goto L_0x0040;
                case 10: goto L_0x003b;
                case 11: goto L_0x003b;
                default: goto L_0x0036;
            }
        L_0x0036:
            java.lang.String r5 = "getClassFlags"
            r0[r3] = r5
            goto L_0x004e
        L_0x003b:
            java.lang.String r5 = "getAccessorFlags"
            r0[r3] = r5
            goto L_0x004e
        L_0x0040:
            java.lang.String r5 = "getPropertyFlags"
            r0[r3] = r5
            goto L_0x004e
        L_0x0045:
            java.lang.String r5 = "getFunctionFlags"
            r0[r3] = r5
            goto L_0x004e
        L_0x004a:
            java.lang.String r5 = "getConstructorFlags"
            r0[r3] = r5
        L_0x004e:
            java.lang.String r5 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            java.lang.String r5 = java.lang.String.format(r5, r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kh.C9870b.m15147a(int):void");
    }

    /* renamed from: b */
    public static int m15146b(boolean z, EnumC8624x xVar, EnumC8573k kVar, boolean z2, boolean z3, boolean z4) {
        if (xVar == null) {
            m15147a(10);
        }
        if (kVar == null) {
            m15147a(11);
        }
        return f22002c.mo15134e(Boolean.valueOf(z)) | f22004e.mo15134e(kVar) | f22003d.mo15134e(xVar) | f38757J.mo15134e(Boolean.valueOf(z2)) | f38758K.mo15134e(Boolean.valueOf(z3)) | f38759L.mo15134e(Boolean.valueOf(z4));
    }
}
