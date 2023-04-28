package net.time4j.history;

import net.time4j.base.C10812b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: net.time4j.history.c */
/* loaded from: classes8.dex */
abstract class EnumC10926c extends Enum<EnumC10926c> implements AbstractC10925b {

    /* renamed from: k */
    public static final EnumC10926c f24247k;

    /* renamed from: l */
    public static final EnumC10926c f24248l;

    /* renamed from: m */
    public static final EnumC10926c f24249m;

    /* renamed from: n */
    private static final /* synthetic */ EnumC10926c[] f24250n;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* renamed from: net.time4j.history.c$a */
    /* loaded from: classes8.dex */
    static class C10927a extends EnumC10926c {
        C10927a(String str, int i) {
            super(str, i, null);
        }

        @Override // net.time4j.history.AbstractC10925b
        /* renamed from: a */
        public long mo11598a(C10934h hVar) {
            return C10812b.m12206j(EnumC10926c.m11599f(hVar), hVar.m11543d(), hVar.m11545b());
        }

        @Override // net.time4j.history.AbstractC10925b
        /* renamed from: b */
        public int mo11597b(C10934h hVar) {
            return C10812b.m12212d(EnumC10926c.m11599f(hVar), hVar.m11543d());
        }

        @Override // net.time4j.history.AbstractC10925b
        /* renamed from: c */
        public C10934h mo11596c(long j) {
            EnumC10937j jVar;
            long l = C10812b.m12204l(j);
            int i = C10812b.m12207i(l);
            int h = C10812b.m12208h(l);
            int g = C10812b.m12209g(l);
            if (i <= 0) {
                jVar = EnumC10937j.BC;
            } else {
                jVar = EnumC10937j.AD;
            }
            if (i <= 0) {
                i = 1 - i;
            }
            return new C10934h(jVar, i, h, g);
        }

        @Override // net.time4j.history.AbstractC10925b
        /* renamed from: d */
        public boolean mo11595d(C10934h hVar) {
            return C10812b.m12210f(EnumC10926c.m11599f(hVar), hVar.m11543d(), hVar.m11545b());
        }
    }

    static {
        C10927a aVar = new C10927a("GREGORIAN", 0);
        f24247k = aVar;
        EnumC10926c bVar = new EnumC10926c("JULIAN", 1) { // from class: net.time4j.history.c.b
            @Override // net.time4j.history.AbstractC10925b
            /* renamed from: a */
            public long mo11598a(C10934h hVar) {
                return C10943m.m11490h(EnumC10926c.m11599f(hVar), hVar.m11543d(), hVar.m11545b());
            }

            @Override // net.time4j.history.AbstractC10925b
            /* renamed from: b */
            public int mo11597b(C10934h hVar) {
                return C10943m.m11496b(EnumC10926c.m11599f(hVar), hVar.m11543d());
            }

            @Override // net.time4j.history.AbstractC10925b
            /* renamed from: c */
            public C10934h mo11596c(long j) {
                EnumC10937j jVar;
                long i = C10943m.m11489i(j);
                int g = C10943m.m11491g(i);
                int f = C10943m.m11492f(i);
                int e = C10943m.m11493e(i);
                if (g <= 0) {
                    jVar = EnumC10937j.BC;
                } else {
                    jVar = EnumC10937j.AD;
                }
                if (g <= 0) {
                    g = 1 - g;
                }
                return new C10934h(jVar, g, f, e);
            }

            @Override // net.time4j.history.AbstractC10925b
            /* renamed from: d */
            public boolean mo11595d(C10934h hVar) {
                return C10943m.m11494d(EnumC10926c.m11599f(hVar), hVar.m11543d(), hVar.m11545b());
            }
        };
        f24248l = bVar;
        EnumC10926c cVar = new EnumC10926c("SWEDISH", 2) { // from class: net.time4j.history.c.c
            @Override // net.time4j.history.AbstractC10925b
            /* renamed from: a */
            public long mo11598a(C10934h hVar) {
                int f = EnumC10926c.m11599f(hVar);
                if (hVar.m11545b() == 30 && hVar.m11543d() == 2 && f == 1712) {
                    return -53576L;
                }
                return C10943m.m11490h(f, hVar.m11543d(), hVar.m11545b()) - 1;
            }

            @Override // net.time4j.history.AbstractC10925b
            /* renamed from: b */
            public int mo11597b(C10934h hVar) {
                int f = EnumC10926c.m11599f(hVar);
                if (hVar.m11543d() == 2 && f == 1712) {
                    return 30;
                }
                return C10943m.m11496b(f, hVar.m11543d());
            }

            @Override // net.time4j.history.AbstractC10925b
            /* renamed from: c */
            public C10934h mo11596c(long j) {
                if (j == -53576) {
                    return new C10934h(EnumC10937j.AD, 1712, 2, 30);
                }
                return EnumC10926c.f24248l.mo11596c(j + 1);
            }

            @Override // net.time4j.history.AbstractC10925b
            /* renamed from: d */
            public boolean mo11595d(C10934h hVar) {
                int f = EnumC10926c.m11599f(hVar);
                if (hVar.m11545b() == 30 && hVar.m11543d() == 2 && f == 1712) {
                    return true;
                }
                return C10943m.m11494d(f, hVar.m11543d(), hVar.m11545b());
            }
        };
        f24249m = cVar;
        f24250n = new EnumC10926c[]{aVar, bVar, cVar};
    }

    private EnumC10926c(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static int m11599f(C10934h hVar) {
        return hVar.m11544c().m11528a(hVar.m11542e());
    }

    public static EnumC10926c valueOf(String str) {
        return (EnumC10926c) Enum.valueOf(EnumC10926c.class, str);
    }

    public static EnumC10926c[] values() {
        return (EnumC10926c[]) f24250n.clone();
    }

    /* synthetic */ EnumC10926c(String str, int i, C10927a aVar) {
        this(str, i);
    }
}
