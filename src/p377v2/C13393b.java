package p377v2;

/* renamed from: v2.b */
/* loaded from: classes.dex */
public final class C13393b {

    /* renamed from: a */
    private String f29970a;

    /* renamed from: v2.b$a */
    /* loaded from: classes.dex */
    public static final class C13394a {

        /* renamed from: a */
        private String f29971a;

        /* synthetic */ C13394a(C13412q qVar) {
        }

        /* renamed from: a */
        public C13393b m3764a() {
            String str = this.f29971a;
            if (str != null) {
                C13393b bVar = new C13393b(null);
                bVar.f29970a = str;
                return bVar;
            }
            throw new IllegalArgumentException("Purchase token must be set");
        }

        /* renamed from: b */
        public C13394a m3763b(String str) {
            this.f29971a = str;
            return this;
        }
    }

    /* synthetic */ C13393b(C13413r rVar) {
    }

    /* renamed from: b */
    public static C13394a m3766b() {
        return new C13394a(null);
    }

    /* renamed from: a */
    public String m3767a() {
        return this.f29970a;
    }
}
