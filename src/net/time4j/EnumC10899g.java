package net.time4j;

import p143hj.AbstractC8069k0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: net.time4j.g */
/* loaded from: classes8.dex */
public abstract class EnumC10899g extends Enum<EnumC10899g> implements AbstractC11034v {

    /* renamed from: k */
    public static final EnumC10899g f24189k;

    /* renamed from: l */
    public static final EnumC10899g f24190l;

    /* renamed from: m */
    public static final EnumC10899g f24191m;

    /* renamed from: n */
    public static final EnumC10899g f24192n;

    /* renamed from: o */
    public static final EnumC10899g f24193o;

    /* renamed from: p */
    public static final EnumC10899g f24194p;

    /* renamed from: q */
    private static final long[] f24195q = {1, 60, 3600, 3600000, 3600000000L, 3600000000000L};

    /* renamed from: r */
    private static final /* synthetic */ EnumC10899g[] f24196r;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* renamed from: net.time4j.g$a */
    /* loaded from: classes8.dex */
    static class C10900a extends EnumC10899g {
        C10900a(String str, int i) {
            super(str, i, null);
        }

        @Override // net.time4j.AbstractC11036w
        /* renamed from: a */
        public char mo11166a() {
            return 'H';
        }

        @Override // p143hj.AbstractC8086w
        public double getLength() {
            return 3600.0d;
        }
    }

    static {
        C10900a aVar = new C10900a("HOURS", 0);
        f24189k = aVar;
        EnumC10899g bVar = new EnumC10899g("MINUTES", 1) { // from class: net.time4j.g.b
            @Override // net.time4j.AbstractC11036w
            /* renamed from: a */
            public char mo11166a() {
                return 'M';
            }

            @Override // p143hj.AbstractC8086w
            public double getLength() {
                return 60.0d;
            }
        };
        f24190l = bVar;
        EnumC10899g cVar = new EnumC10899g("SECONDS", 2) { // from class: net.time4j.g.c
            @Override // net.time4j.AbstractC11036w
            /* renamed from: a */
            public char mo11166a() {
                return 'S';
            }

            @Override // p143hj.AbstractC8086w
            public double getLength() {
                return 1.0d;
            }
        };
        f24191m = cVar;
        EnumC10899g dVar = new EnumC10899g("MILLIS", 3) { // from class: net.time4j.g.d
            @Override // net.time4j.AbstractC11036w
            /* renamed from: a */
            public char mo11166a() {
                return '3';
            }

            @Override // p143hj.AbstractC8086w
            public double getLength() {
                return 0.001d;
            }
        };
        f24192n = dVar;
        EnumC10899g eVar = new EnumC10899g("MICROS", 4) { // from class: net.time4j.g.e
            @Override // net.time4j.AbstractC11036w
            /* renamed from: a */
            public char mo11166a() {
                return '6';
            }

            @Override // p143hj.AbstractC8086w
            public double getLength() {
                return 1.0E-6d;
            }
        };
        f24193o = eVar;
        EnumC10899g fVar = new EnumC10899g("NANOS", 5) { // from class: net.time4j.g.f
            @Override // net.time4j.AbstractC11036w
            /* renamed from: a */
            public char mo11166a() {
                return '9';
            }

            @Override // p143hj.AbstractC8086w
            public double getLength() {
                return 1.0E-9d;
            }
        };
        f24194p = fVar;
        f24196r = new EnumC10899g[]{aVar, bVar, cVar, dVar, eVar, fVar};
    }

    private EnumC10899g(String str, int i) {
    }

    public static EnumC10899g valueOf(String str) {
        return (EnumC10899g) Enum.valueOf(EnumC10899g.class, str);
    }

    public static EnumC10899g[] values() {
        return (EnumC10899g[]) f24196r.clone();
    }

    @Override // p143hj.AbstractC8086w
    /* renamed from: b */
    public boolean mo11165b() {
        return false;
    }

    /* renamed from: c */
    public <T extends AbstractC8069k0<? super EnumC10899g, T>> long m11785c(T t, T t2) {
        return t.m20682L(t2, this);
    }

    /* synthetic */ EnumC10899g(String str, int i, C10900a aVar) {
        this(str, i);
    }
}
