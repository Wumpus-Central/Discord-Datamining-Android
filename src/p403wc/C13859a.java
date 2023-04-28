package p403wc;

import p403wc.AbstractC13864d;
import p403wc.C13862c;

/* renamed from: wc.a */
/* loaded from: classes3.dex */
final class C13859a extends AbstractC13864d {

    /* renamed from: b */
    private final String f31194b;

    /* renamed from: c */
    private final C13862c.EnumC13863a f31195c;

    /* renamed from: d */
    private final String f31196d;

    /* renamed from: e */
    private final String f31197e;

    /* renamed from: f */
    private final long f31198f;

    /* renamed from: g */
    private final long f31199g;

    /* renamed from: h */
    private final String f31200h;

    /* renamed from: wc.a$b */
    /* loaded from: classes3.dex */
    static final class C13860b extends AbstractC13864d.AbstractC13865a {

        /* renamed from: a */
        private String f31201a;

        /* renamed from: b */
        private C13862c.EnumC13863a f31202b;

        /* renamed from: c */
        private String f31203c;

        /* renamed from: d */
        private String f31204d;

        /* renamed from: e */
        private Long f31205e;

        /* renamed from: f */
        private Long f31206f;

        /* renamed from: g */
        private String f31207g;

        @Override // p403wc.AbstractC13864d.AbstractC13865a
        /* renamed from: a */
        public AbstractC13864d mo2492a() {
            String str = "";
            if (this.f31202b == null) {
                str = str + " registrationStatus";
            }
            if (this.f31205e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f31206f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new C13859a(this.f31201a, this.f31202b, this.f31203c, this.f31204d, this.f31205e.longValue(), this.f31206f.longValue(), this.f31207g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p403wc.AbstractC13864d.AbstractC13865a
        /* renamed from: b */
        public AbstractC13864d.AbstractC13865a mo2491b(String str) {
            this.f31203c = str;
            return this;
        }

        @Override // p403wc.AbstractC13864d.AbstractC13865a
        /* renamed from: c */
        public AbstractC13864d.AbstractC13865a mo2490c(long j) {
            this.f31205e = Long.valueOf(j);
            return this;
        }

        @Override // p403wc.AbstractC13864d.AbstractC13865a
        /* renamed from: d */
        public AbstractC13864d.AbstractC13865a mo2489d(String str) {
            this.f31201a = str;
            return this;
        }

        @Override // p403wc.AbstractC13864d.AbstractC13865a
        /* renamed from: e */
        public AbstractC13864d.AbstractC13865a mo2488e(String str) {
            this.f31207g = str;
            return this;
        }

        @Override // p403wc.AbstractC13864d.AbstractC13865a
        /* renamed from: f */
        public AbstractC13864d.AbstractC13865a mo2487f(String str) {
            this.f31204d = str;
            return this;
        }

        @Override // p403wc.AbstractC13864d.AbstractC13865a
        /* renamed from: g */
        public AbstractC13864d.AbstractC13865a mo2486g(C13862c.EnumC13863a aVar) {
            if (aVar != null) {
                this.f31202b = aVar;
                return this;
            }
            throw new NullPointerException("Null registrationStatus");
        }

        @Override // p403wc.AbstractC13864d.AbstractC13865a
        /* renamed from: h */
        public AbstractC13864d.AbstractC13865a mo2485h(long j) {
            this.f31206f = Long.valueOf(j);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public C13860b() {
        }

        private C13860b(AbstractC13864d dVar) {
            this.f31201a = dVar.mo2509d();
            this.f31202b = dVar.mo2506g();
            this.f31203c = dVar.mo2511b();
            this.f31204d = dVar.mo2507f();
            this.f31205e = Long.valueOf(dVar.mo2510c());
            this.f31206f = Long.valueOf(dVar.mo2505h());
            this.f31207g = dVar.mo2508e();
        }
    }

    @Override // p403wc.AbstractC13864d
    /* renamed from: b */
    public String mo2511b() {
        return this.f31196d;
    }

    @Override // p403wc.AbstractC13864d
    /* renamed from: c */
    public long mo2510c() {
        return this.f31198f;
    }

    @Override // p403wc.AbstractC13864d
    /* renamed from: d */
    public String mo2509d() {
        return this.f31194b;
    }

    @Override // p403wc.AbstractC13864d
    /* renamed from: e */
    public String mo2508e() {
        return this.f31200h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC13864d)) {
            return false;
        }
        AbstractC13864d dVar = (AbstractC13864d) obj;
        String str3 = this.f31194b;
        if (str3 != null ? str3.equals(dVar.mo2509d()) : dVar.mo2509d() == null) {
            if (this.f31195c.equals(dVar.mo2506g()) && ((str = this.f31196d) != null ? str.equals(dVar.mo2511b()) : dVar.mo2511b() == null) && ((str2 = this.f31197e) != null ? str2.equals(dVar.mo2507f()) : dVar.mo2507f() == null) && this.f31198f == dVar.mo2510c() && this.f31199g == dVar.mo2505h()) {
                String str4 = this.f31200h;
                if (str4 == null) {
                    if (dVar.mo2508e() == null) {
                        return true;
                    }
                } else if (str4.equals(dVar.mo2508e())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p403wc.AbstractC13864d
    /* renamed from: f */
    public String mo2507f() {
        return this.f31197e;
    }

    @Override // p403wc.AbstractC13864d
    /* renamed from: g */
    public C13862c.EnumC13863a mo2506g() {
        return this.f31195c;
    }

    @Override // p403wc.AbstractC13864d
    /* renamed from: h */
    public long mo2505h() {
        return this.f31199g;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        String str = this.f31194b;
        int i4 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int hashCode = (((i ^ 1000003) * 1000003) ^ this.f31195c.hashCode()) * 1000003;
        String str2 = this.f31196d;
        if (str2 == null) {
            i2 = 0;
        } else {
            i2 = str2.hashCode();
        }
        int i5 = (hashCode ^ i2) * 1000003;
        String str3 = this.f31197e;
        if (str3 == null) {
            i3 = 0;
        } else {
            i3 = str3.hashCode();
        }
        long j = this.f31198f;
        long j2 = this.f31199g;
        int i6 = (((((i5 ^ i3) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.f31200h;
        if (str4 != null) {
            i4 = str4.hashCode();
        }
        return i6 ^ i4;
    }

    @Override // p403wc.AbstractC13864d
    /* renamed from: n */
    public AbstractC13864d.AbstractC13865a mo2499n() {
        return new C13860b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f31194b + ", registrationStatus=" + this.f31195c + ", authToken=" + this.f31196d + ", refreshToken=" + this.f31197e + ", expiresInSecs=" + this.f31198f + ", tokenCreationEpochInSecs=" + this.f31199g + ", fisError=" + this.f31200h + "}";
    }

    private C13859a(String str, C13862c.EnumC13863a aVar, String str2, String str3, long j, long j2, String str4) {
        this.f31194b = str;
        this.f31195c = aVar;
        this.f31196d = str2;
        this.f31197e = str3;
        this.f31198f = j;
        this.f31199g = j2;
        this.f31200h = str4;
    }
}
