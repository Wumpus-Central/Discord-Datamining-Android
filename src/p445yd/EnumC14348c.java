package p445yd;

import p137hd.C7997b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: yd.c */
/* loaded from: classes3.dex */
abstract class EnumC14348c extends Enum<EnumC14348c> {

    /* renamed from: k */
    public static final EnumC14348c f32477k;

    /* renamed from: l */
    public static final EnumC14348c f32478l;

    /* renamed from: m */
    public static final EnumC14348c f32479m;

    /* renamed from: n */
    public static final EnumC14348c f32480n;

    /* renamed from: o */
    public static final EnumC14348c f32481o;

    /* renamed from: p */
    public static final EnumC14348c f32482p;

    /* renamed from: q */
    public static final EnumC14348c f32483q;

    /* renamed from: r */
    public static final EnumC14348c f32484r;

    /* renamed from: s */
    private static final /* synthetic */ EnumC14348c[] f32485s;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* renamed from: yd.c$a */
    /* loaded from: classes3.dex */
    static class C14349a extends EnumC14348c {
        C14349a(String str, int i) {
            super(str, i, null);
        }

        @Override // p445yd.EnumC14348c
        /* renamed from: a */
        boolean mo799a(int i, int i2) {
            return ((i + i2) & 1) == 0;
        }
    }

    static {
        C14349a aVar = new C14349a("DATA_MASK_000", 0);
        f32477k = aVar;
        EnumC14348c bVar = new EnumC14348c("DATA_MASK_001", 1) { // from class: yd.c.b
            @Override // p445yd.EnumC14348c
            /* renamed from: a */
            boolean mo799a(int i, int i2) {
                return (i & 1) == 0;
            }
        };
        f32478l = bVar;
        EnumC14348c cVar = new EnumC14348c("DATA_MASK_010", 2) { // from class: yd.c.c
            @Override // p445yd.EnumC14348c
            /* renamed from: a */
            boolean mo799a(int i, int i2) {
                return i2 % 3 == 0;
            }
        };
        f32479m = cVar;
        EnumC14348c dVar = new EnumC14348c("DATA_MASK_011", 3) { // from class: yd.c.d
            @Override // p445yd.EnumC14348c
            /* renamed from: a */
            boolean mo799a(int i, int i2) {
                return (i + i2) % 3 == 0;
            }
        };
        f32480n = dVar;
        EnumC14348c eVar = new EnumC14348c("DATA_MASK_100", 4) { // from class: yd.c.e
            @Override // p445yd.EnumC14348c
            /* renamed from: a */
            boolean mo799a(int i, int i2) {
                return (((i / 2) + (i2 / 3)) & 1) == 0;
            }
        };
        f32481o = eVar;
        EnumC14348c fVar = new EnumC14348c("DATA_MASK_101", 5) { // from class: yd.c.f
            @Override // p445yd.EnumC14348c
            /* renamed from: a */
            boolean mo799a(int i, int i2) {
                return (i * i2) % 6 == 0;
            }
        };
        f32482p = fVar;
        EnumC14348c gVar = new EnumC14348c("DATA_MASK_110", 6) { // from class: yd.c.g
            @Override // p445yd.EnumC14348c
            /* renamed from: a */
            boolean mo799a(int i, int i2) {
                return (i * i2) % 6 < 3;
            }
        };
        f32483q = gVar;
        EnumC14348c hVar = new EnumC14348c("DATA_MASK_111", 7) { // from class: yd.c.h
            @Override // p445yd.EnumC14348c
            /* renamed from: a */
            boolean mo799a(int i, int i2) {
                return (((i + i2) + ((i * i2) % 3)) & 1) == 0;
            }
        };
        f32484r = hVar;
        f32485s = new EnumC14348c[]{aVar, bVar, cVar, dVar, eVar, fVar, gVar, hVar};
    }

    private EnumC14348c(String str, int i) {
    }

    public static EnumC14348c valueOf(String str) {
        return (EnumC14348c) Enum.valueOf(EnumC14348c.class, str);
    }

    public static EnumC14348c[] values() {
        return (EnumC14348c[]) f32485s.clone();
    }

    /* renamed from: a */
    abstract boolean mo799a(int i, int i2);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m800b(C7997b bVar, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            for (int i3 = 0; i3 < i; i3++) {
                if (mo799a(i2, i3)) {
                    bVar.m20924d(i3, i2);
                }
            }
        }
    }

    /* synthetic */ EnumC14348c(String str, int i, C14349a aVar) {
        this(str, i);
    }
}
