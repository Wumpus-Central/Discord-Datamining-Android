package ph;

/* renamed from: ph.z */
/* loaded from: classes8.dex */
public final class C11747z {

    /* renamed from: a */
    static final int f26223a = m8693c(1, 3);

    /* renamed from: b */
    static final int f26224b = m8693c(1, 4);

    /* renamed from: c */
    static final int f26225c = m8693c(2, 0);

    /* renamed from: d */
    static final int f26226d = m8693c(3, 2);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* renamed from: ph.z$b */
    /* loaded from: classes8.dex */
    public static class EnumC11749b extends Enum<EnumC11749b> {

        /* renamed from: A */
        public static final EnumC11749b f39114A;

        /* renamed from: B */
        public static final EnumC11749b f39115B;

        /* renamed from: C */
        public static final EnumC11749b f39116C;

        /* renamed from: D */
        public static final EnumC11749b f39117D;

        /* renamed from: E */
        private static final /* synthetic */ EnumC11749b[] f39118E;

        /* renamed from: m */
        public static final EnumC11749b f26227m;

        /* renamed from: n */
        public static final EnumC11749b f26228n;

        /* renamed from: o */
        public static final EnumC11749b f26229o;

        /* renamed from: p */
        public static final EnumC11749b f26230p;

        /* renamed from: q */
        public static final EnumC11749b f26231q;

        /* renamed from: r */
        public static final EnumC11749b f26232r;

        /* renamed from: s */
        public static final EnumC11749b f26233s;

        /* renamed from: t */
        public static final EnumC11749b f26234t;

        /* renamed from: u */
        public static final EnumC11749b f26235u;

        /* renamed from: v */
        public static final EnumC11749b f26236v;

        /* renamed from: w */
        public static final EnumC11749b f26237w;

        /* renamed from: x */
        public static final EnumC11749b f26238x;

        /* renamed from: y */
        public static final EnumC11749b f26239y;

        /* renamed from: z */
        public static final EnumC11749b f26240z;

        /* renamed from: k */
        private final EnumC11753c f26241k;

        /* renamed from: l */
        private final int f26242l;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
        /* renamed from: ph.z$b$a */
        /* loaded from: classes8.dex */
        static class C11750a extends EnumC11749b {
            C11750a(String str, int i, EnumC11753c cVar, int i2) {
                super(str, i, cVar, i2);
            }

            @Override // ph.C11747z.EnumC11749b
            /* renamed from: c */
            public boolean mo8690c() {
                return false;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
        /* renamed from: ph.z$b$b */
        /* loaded from: classes8.dex */
        static class C0375b extends EnumC11749b {
            C0375b(String str, int i, EnumC11753c cVar, int i2) {
                super(str, i, cVar, i2);
            }

            @Override // ph.C11747z.EnumC11749b
            /* renamed from: c */
            public boolean mo8690c() {
                return false;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
        /* renamed from: ph.z$b$c */
        /* loaded from: classes8.dex */
        static class C11751c extends EnumC11749b {
            C11751c(String str, int i, EnumC11753c cVar, int i2) {
                super(str, i, cVar, i2);
            }

            @Override // ph.C11747z.EnumC11749b
            /* renamed from: c */
            public boolean mo8690c() {
                return false;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
        /* renamed from: ph.z$b$d */
        /* loaded from: classes8.dex */
        static class C11752d extends EnumC11749b {
            C11752d(String str, int i, EnumC11753c cVar, int i2) {
                super(str, i, cVar, i2);
            }

            @Override // ph.C11747z.EnumC11749b
            /* renamed from: c */
            public boolean mo8690c() {
                return false;
            }
        }

        static {
            EnumC11749b bVar = new EnumC11749b("DOUBLE", 0, EnumC11753c.DOUBLE, 1);
            f26227m = bVar;
            EnumC11749b bVar2 = new EnumC11749b("FLOAT", 1, EnumC11753c.FLOAT, 5);
            f26228n = bVar2;
            EnumC11753c cVar = EnumC11753c.LONG;
            EnumC11749b bVar3 = new EnumC11749b("INT64", 2, cVar, 0);
            f26229o = bVar3;
            EnumC11749b bVar4 = new EnumC11749b("UINT64", 3, cVar, 0);
            f26230p = bVar4;
            EnumC11753c cVar2 = EnumC11753c.INT;
            EnumC11749b bVar5 = new EnumC11749b("INT32", 4, cVar2, 0);
            f26231q = bVar5;
            EnumC11749b bVar6 = new EnumC11749b("FIXED64", 5, cVar, 1);
            f26232r = bVar6;
            EnumC11749b bVar7 = new EnumC11749b("FIXED32", 6, cVar2, 5);
            f26233s = bVar7;
            EnumC11749b bVar8 = new EnumC11749b("BOOL", 7, EnumC11753c.BOOLEAN, 0);
            f26234t = bVar8;
            C11750a aVar = new C11750a("STRING", 8, EnumC11753c.STRING, 2);
            f26235u = aVar;
            EnumC11753c cVar3 = EnumC11753c.MESSAGE;
            C0375b bVar9 = new C0375b("GROUP", 9, cVar3, 3);
            f26236v = bVar9;
            C11751c cVar4 = new C11751c("MESSAGE", 10, cVar3, 2);
            f26237w = cVar4;
            C11752d dVar = new C11752d("BYTES", 11, EnumC11753c.BYTE_STRING, 2);
            f26238x = dVar;
            EnumC11749b bVar10 = new EnumC11749b("UINT32", 12, cVar2, 0);
            f26239y = bVar10;
            EnumC11749b bVar11 = new EnumC11749b("ENUM", 13, EnumC11753c.ENUM, 0);
            f26240z = bVar11;
            EnumC11749b bVar12 = new EnumC11749b("SFIXED32", 14, cVar2, 5);
            f39114A = bVar12;
            EnumC11749b bVar13 = new EnumC11749b("SFIXED64", 15, cVar, 1);
            f39115B = bVar13;
            EnumC11749b bVar14 = new EnumC11749b("SINT32", 16, cVar2, 0);
            f39116C = bVar14;
            EnumC11749b bVar15 = new EnumC11749b("SINT64", 17, cVar, 0);
            f39117D = bVar15;
            f39118E = new EnumC11749b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, aVar, bVar9, cVar4, dVar, bVar10, bVar11, bVar12, bVar13, bVar14, bVar15};
        }

        public static EnumC11749b valueOf(String str) {
            return (EnumC11749b) Enum.valueOf(EnumC11749b.class, str);
        }

        public static EnumC11749b[] values() {
            return (EnumC11749b[]) f39118E.clone();
        }

        /* renamed from: a */
        public EnumC11753c m8692a() {
            return this.f26241k;
        }

        /* renamed from: b */
        public int m8691b() {
            return this.f26242l;
        }

        /* renamed from: c */
        public boolean mo8690c() {
            return true;
        }

        private EnumC11749b(String str, int i, EnumC11753c cVar, int i2) {
            this.f26241k = cVar;
            this.f26242l = i2;
        }
    }

    /* renamed from: ph.z$c */
    /* loaded from: classes8.dex */
    public enum EnumC11753c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(AbstractC11691d.f26108k),
        ENUM(null),
        MESSAGE(null);
        

        /* renamed from: k */
        private final Object f26253k;

        EnumC11753c(Object obj) {
            this.f26253k = obj;
        }
    }

    /* renamed from: a */
    public static int m8695a(int i) {
        return i >>> 3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static int m8694b(int i) {
        return i & 7;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static int m8693c(int i, int i2) {
        return (i << 3) | i2;
    }
}
