package net.time4j;

import p143hj.AbstractC8069k0;
import p143hj.AbstractC8074m0;
import p143hj.AbstractC8079p;
import p143hj.AbstractC8080q;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: net.time4j.f */
/* loaded from: classes8.dex */
public abstract class EnumC10882f extends Enum<EnumC10882f> implements AbstractC11032u {

    /* renamed from: k */
    public static final EnumC10882f f24148k;

    /* renamed from: l */
    public static final EnumC10882f f24149l;

    /* renamed from: m */
    public static final EnumC10882f f24150m;

    /* renamed from: n */
    public static final EnumC10882f f24151n;

    /* renamed from: o */
    public static final EnumC10882f f24152o;

    /* renamed from: p */
    public static final EnumC10882f f24153p;

    /* renamed from: q */
    public static final EnumC10882f f24154q;

    /* renamed from: r */
    public static final EnumC10882f f24155r;

    /* renamed from: s */
    private static final /* synthetic */ EnumC10882f[] f24156s;

    /* renamed from: co */
    private final AbstractC11032u f24157co;
    private final AbstractC11032u eof;
    private final AbstractC11032u joda;
    private final AbstractC11032u kld;
    private final AbstractC11032u nvd;

    /* renamed from: ui */
    private final AbstractC11032u f24158ui;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* renamed from: net.time4j.f$a */
    /* loaded from: classes8.dex */
    static class C10883a extends EnumC10882f {
        C10883a(String str, int i) {
            super(str, i, null);
        }

        @Override // net.time4j.AbstractC11036w
        /* renamed from: a */
        public char mo11166a() {
            return 'I';
        }

        @Override // p143hj.AbstractC8086w
        public double getLength() {
            return 3.1556952E10d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: net.time4j.f$i */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class C10890i {

        /* renamed from: a */
        static final /* synthetic */ int[] f24159a;

        static {
            int[] iArr = new int[EnumC10882f.values().length];
            f24159a = iArr;
            try {
                iArr[EnumC10882f.f24154q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24159a[EnumC10882f.f24155r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24159a[EnumC10882f.f24148k.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24159a[EnumC10882f.f24149l.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24159a[EnumC10882f.f24150m.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24159a[EnumC10882f.f24151n.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f24159a[EnumC10882f.f24152o.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f24159a[EnumC10882f.f24153p.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: net.time4j.f$j */
    /* loaded from: classes8.dex */
    public static class C10891j<T extends AbstractC8080q<T>> implements AbstractC8074m0<T> {

        /* renamed from: a */
        private final EnumC10882f f24160a;

        /* renamed from: b */
        private final int f24161b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C10891j(EnumC10882f fVar) {
            this(fVar, 0);
        }

        /* renamed from: e */
        private static long m11888e(C10892f0 f0Var, C10892f0 f0Var2) {
            if (f0Var.mo11643m() == f0Var2.mo11643m()) {
                return f0Var2.m11881F0() - f0Var.m11881F0();
            }
            return f0Var2.m11880G0() - f0Var.m11880G0();
        }

        /* renamed from: f */
        private long m11887f(C10892f0 f0Var, C10892f0 f0Var2) {
            long H0 = f0Var2.m11879H0() - f0Var.m11879H0();
            int i = this.f24161b;
            if (i == 5 || i == 2 || i == 6) {
                EnumC10882f fVar = EnumC10882f.f24153p;
                int i2 = (H0 > 0L ? 1 : (H0 == 0L ? 0 : -1));
                if (i2 <= 0 || !C10892f0.m11834w0(fVar, f0Var, H0, i).m20670R(f0Var2)) {
                    if (i2 >= 0 || !C10892f0.m11834w0(fVar, f0Var, H0, this.f24161b).m20669T(f0Var2)) {
                        return H0;
                    }
                    return H0 + 1;
                }
                return H0 - 1;
            }
            int i3 = (H0 > 0L ? 1 : (H0 == 0L ? 0 : -1));
            if (i3 <= 0 || f0Var2.mo11641o() >= f0Var.mo11641o()) {
                if (i3 >= 0 || f0Var2.mo11641o() <= f0Var.mo11641o()) {
                    return H0;
                }
                return H0 + 1;
            }
            return H0 - 1;
        }

        /* renamed from: c */
        public T mo11636b(T t, long j) {
            AbstractC8079p<C10892f0> pVar = C10892f0.f24172x;
            return (T) t.mo15654D(pVar, C10892f0.m11834w0(this.f24160a, (C10892f0) t.mo11371r(pVar), j, this.f24161b));
        }

        /* renamed from: d */
        public long mo11637a(T t, T t2) {
            long j;
            AbstractC8079p<C10892f0> pVar = C10892f0.f24172x;
            C10892f0 f0Var = (C10892f0) t.mo11371r(pVar);
            C10892f0 f0Var2 = (C10892f0) t2.mo11371r(pVar);
            switch (C10890i.f24159a[this.f24160a.ordinal()]) {
                case 1:
                    j = m11888e(f0Var, f0Var2) / 7;
                    break;
                case 2:
                    j = m11888e(f0Var, f0Var2);
                    break;
                case 3:
                    j = m11887f(f0Var, f0Var2) / 12000;
                    break;
                case 4:
                    j = m11887f(f0Var, f0Var2) / 1200;
                    break;
                case 5:
                    j = m11887f(f0Var, f0Var2) / 120;
                    break;
                case 6:
                    j = m11887f(f0Var, f0Var2) / 12;
                    break;
                case 7:
                    j = m11887f(f0Var, f0Var2) / 3;
                    break;
                case 8:
                    j = m11887f(f0Var, f0Var2);
                    break;
                default:
                    throw new UnsupportedOperationException(this.f24160a.name());
            }
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i == 0) {
                return j;
            }
            AbstractC8079p<C10906g0> pVar2 = C10906g0.f24207y;
            if (!t.mo11377e(pVar2) || !t2.mo11377e(pVar2)) {
                return j;
            }
            EnumC10882f fVar = this.f24160a;
            boolean z = true;
            if (!(fVar == EnumC10882f.f24155r || ((C10892f0) f0Var.m20683K(j, fVar)).mo11874M(f0Var2) == 0)) {
                z = false;
            }
            if (!z) {
                return j;
            }
            C10906g0 g0Var = (C10906g0) t.mo11371r(pVar2);
            C10906g0 g0Var2 = (C10906g0) t2.mo11371r(pVar2);
            if (i > 0 && g0Var.m11784A0(g0Var2)) {
                return j - 1;
            }
            if (i >= 0 || !g0Var.m11783B0(g0Var2)) {
                return j;
            }
            return j + 1;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public C10891j(EnumC10882f fVar, int i) {
            this.f24160a = fVar;
            this.f24161b = i;
        }
    }

    static {
        C10883a aVar = new C10883a("MILLENNIA", 0);
        f24148k = aVar;
        EnumC10882f bVar = new EnumC10882f("CENTURIES", 1) { // from class: net.time4j.f.b
            @Override // net.time4j.AbstractC11036w
            /* renamed from: a */
            public char mo11166a() {
                return 'C';
            }

            @Override // p143hj.AbstractC8086w
            public double getLength() {
                return 3.1556952E9d;
            }
        };
        f24149l = bVar;
        EnumC10882f cVar = new EnumC10882f("DECADES", 2) { // from class: net.time4j.f.c
            @Override // net.time4j.AbstractC11036w
            /* renamed from: a */
            public char mo11166a() {
                return 'E';
            }

            @Override // p143hj.AbstractC8086w
            public double getLength() {
                return 3.1556952E8d;
            }
        };
        f24150m = cVar;
        EnumC10882f dVar = new EnumC10882f("YEARS", 3) { // from class: net.time4j.f.d
            @Override // net.time4j.AbstractC11036w
            /* renamed from: a */
            public char mo11166a() {
                return 'Y';
            }

            @Override // p143hj.AbstractC8086w
            public double getLength() {
                return 3.1556952E7d;
            }
        };
        f24151n = dVar;
        EnumC10882f eVar = new EnumC10882f("QUARTERS", 4) { // from class: net.time4j.f.e
            @Override // net.time4j.AbstractC11036w
            /* renamed from: a */
            public char mo11166a() {
                return 'Q';
            }

            @Override // p143hj.AbstractC8086w
            public double getLength() {
                return 7889238.0d;
            }
        };
        f24152o = eVar;
        EnumC10882f fVar = new EnumC10882f("MONTHS", 5) { // from class: net.time4j.f.f
            @Override // net.time4j.AbstractC11036w
            /* renamed from: a */
            public char mo11166a() {
                return 'M';
            }

            @Override // p143hj.AbstractC8086w
            public double getLength() {
                return 2629746.0d;
            }
        };
        f24153p = fVar;
        EnumC10882f gVar = new EnumC10882f("WEEKS", 6) { // from class: net.time4j.f.g
            @Override // net.time4j.AbstractC11036w
            /* renamed from: a */
            public char mo11166a() {
                return 'W';
            }

            @Override // p143hj.AbstractC8086w
            public double getLength() {
                return 604800.0d;
            }
        };
        f24154q = gVar;
        EnumC10882f hVar = new EnumC10882f("DAYS", 7) { // from class: net.time4j.f.h
            @Override // net.time4j.AbstractC11036w
            /* renamed from: a */
            public char mo11166a() {
                return 'D';
            }

            @Override // p143hj.AbstractC8086w
            public double getLength() {
                return 86400.0d;
            }
        };
        f24155r = hVar;
        f24156s = new EnumC10882f[]{aVar, bVar, cVar, dVar, eVar, fVar, gVar, hVar};
    }

    private EnumC10882f(String str, int i) {
        this.eof = new C10881e0(this, 2);
        this.kld = new C10881e0(this, 5);
        this.f24158ui = new C10881e0(this, 4);
        this.nvd = new C10881e0(this, 1);
        this.f24157co = new C10881e0(this, 3);
        this.joda = new C10881e0(this, 6);
    }

    /* renamed from: d */
    public static AbstractC11032u m11891d() {
        return C11037w0.f24520k;
    }

    public static EnumC10882f valueOf(String str) {
        return (EnumC10882f) Enum.valueOf(EnumC10882f.class, str);
    }

    public static EnumC10882f[] values() {
        return (EnumC10882f[]) f24156s.clone();
    }

    @Override // p143hj.AbstractC8086w
    /* renamed from: b */
    public boolean mo11165b() {
        return true;
    }

    /* renamed from: c */
    public <T extends AbstractC8069k0<? super EnumC10882f, T>> long m11892c(T t, T t2) {
        return t.m20682L(t2, this);
    }

    /* synthetic */ EnumC10882f(String str, int i, C10883a aVar) {
        this(str, i);
    }
}
