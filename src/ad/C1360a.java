package ad;

import p284pc.AbstractC11611c;
import p284pc.AbstractC11612d;

/* renamed from: ad.a */
/* loaded from: classes3.dex */
public final class C1360a {

    /* renamed from: p */
    private static final C1360a f302p = new C0005a().m41238a();

    /* renamed from: a */
    private final long f303a;

    /* renamed from: b */
    private final String f304b;

    /* renamed from: c */
    private final String f305c;

    /* renamed from: d */
    private final EnumC1362c f306d;

    /* renamed from: e */
    private final EnumC1363d f307e;

    /* renamed from: f */
    private final String f308f;

    /* renamed from: g */
    private final String f309g;

    /* renamed from: h */
    private final int f310h;

    /* renamed from: i */
    private final int f311i;

    /* renamed from: j */
    private final String f312j;

    /* renamed from: k */
    private final long f313k;

    /* renamed from: l */
    private final EnumC1361b f314l;

    /* renamed from: m */
    private final String f315m;

    /* renamed from: n */
    private final long f316n;

    /* renamed from: o */
    private final String f317o;

    /* renamed from: ad.a$a */
    /* loaded from: classes3.dex */
    public static final class C0005a {

        /* renamed from: a */
        private long f318a = 0;

        /* renamed from: b */
        private String f319b = "";

        /* renamed from: c */
        private String f320c = "";

        /* renamed from: d */
        private EnumC1362c f321d = EnumC1362c.UNKNOWN;

        /* renamed from: e */
        private EnumC1363d f322e = EnumC1363d.UNKNOWN_OS;

        /* renamed from: f */
        private String f323f = "";

        /* renamed from: g */
        private String f324g = "";

        /* renamed from: h */
        private int f325h = 0;

        /* renamed from: i */
        private int f326i = 0;

        /* renamed from: j */
        private String f327j = "";

        /* renamed from: k */
        private long f328k = 0;

        /* renamed from: l */
        private EnumC1361b f329l = EnumC1361b.UNKNOWN_EVENT;

        /* renamed from: m */
        private String f330m = "";

        /* renamed from: n */
        private long f331n = 0;

        /* renamed from: o */
        private String f332o = "";

        C0005a() {
        }

        /* renamed from: a */
        public C1360a m41238a() {
            return new C1360a(this.f318a, this.f319b, this.f320c, this.f321d, this.f322e, this.f323f, this.f324g, this.f325h, this.f326i, this.f327j, this.f328k, this.f329l, this.f330m, this.f331n, this.f332o);
        }

        /* renamed from: b */
        public C0005a m41237b(String str) {
            this.f330m = str;
            return this;
        }

        /* renamed from: c */
        public C0005a m41236c(String str) {
            this.f324g = str;
            return this;
        }

        /* renamed from: d */
        public C0005a m41235d(String str) {
            this.f332o = str;
            return this;
        }

        /* renamed from: e */
        public C0005a m41234e(EnumC1361b bVar) {
            this.f329l = bVar;
            return this;
        }

        /* renamed from: f */
        public C0005a m41233f(String str) {
            this.f320c = str;
            return this;
        }

        /* renamed from: g */
        public C0005a m41232g(String str) {
            this.f319b = str;
            return this;
        }

        /* renamed from: h */
        public C0005a m41231h(EnumC1362c cVar) {
            this.f321d = cVar;
            return this;
        }

        /* renamed from: i */
        public C0005a m41230i(String str) {
            this.f323f = str;
            return this;
        }

        /* renamed from: j */
        public C0005a m41229j(long j) {
            this.f318a = j;
            return this;
        }

        /* renamed from: k */
        public C0005a m41228k(EnumC1363d dVar) {
            this.f322e = dVar;
            return this;
        }

        /* renamed from: l */
        public C0005a m41227l(String str) {
            this.f327j = str;
            return this;
        }

        /* renamed from: m */
        public C0005a m41226m(int i) {
            this.f326i = i;
            return this;
        }
    }

    /* renamed from: ad.a$b */
    /* loaded from: classes3.dex */
    public enum EnumC1361b implements AbstractC11611c {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);
        

        /* renamed from: k */
        private final int f337k;

        EnumC1361b(int i) {
            this.f337k = i;
        }

        @Override // p284pc.AbstractC11611c
        public int getNumber() {
            return this.f337k;
        }
    }

    /* renamed from: ad.a$c */
    /* loaded from: classes3.dex */
    public enum EnumC1362c implements AbstractC11611c {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);
        

        /* renamed from: k */
        private final int f343k;

        EnumC1362c(int i) {
            this.f343k = i;
        }

        @Override // p284pc.AbstractC11611c
        public int getNumber() {
            return this.f343k;
        }
    }

    /* renamed from: ad.a$d */
    /* loaded from: classes3.dex */
    public enum EnumC1363d implements AbstractC11611c {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);
        

        /* renamed from: k */
        private final int f349k;

        EnumC1363d(int i) {
            this.f349k = i;
        }

        @Override // p284pc.AbstractC11611c
        public int getNumber() {
            return this.f349k;
        }
    }

    C1360a(long j, String str, String str2, EnumC1362c cVar, EnumC1363d dVar, String str3, String str4, int i, int i2, String str5, long j2, EnumC1361b bVar, String str6, long j3, String str7) {
        this.f303a = j;
        this.f304b = str;
        this.f305c = str2;
        this.f306d = cVar;
        this.f307e = dVar;
        this.f308f = str3;
        this.f309g = str4;
        this.f310h = i;
        this.f311i = i2;
        this.f312j = str5;
        this.f313k = j2;
        this.f314l = bVar;
        this.f315m = str6;
        this.f316n = j3;
        this.f317o = str7;
    }

    /* renamed from: p */
    public static C0005a m41239p() {
        return new C0005a();
    }

    @AbstractC11612d(tag = 13)
    /* renamed from: a */
    public String m41254a() {
        return this.f315m;
    }

    @AbstractC11612d(tag = 11)
    /* renamed from: b */
    public long m41253b() {
        return this.f313k;
    }

    @AbstractC11612d(tag = 14)
    /* renamed from: c */
    public long m41252c() {
        return this.f316n;
    }

    @AbstractC11612d(tag = 7)
    /* renamed from: d */
    public String m41251d() {
        return this.f309g;
    }

    @AbstractC11612d(tag = 15)
    /* renamed from: e */
    public String m41250e() {
        return this.f317o;
    }

    @AbstractC11612d(tag = 12)
    /* renamed from: f */
    public EnumC1361b m41249f() {
        return this.f314l;
    }

    @AbstractC11612d(tag = 3)
    /* renamed from: g */
    public String m41248g() {
        return this.f305c;
    }

    @AbstractC11612d(tag = 2)
    /* renamed from: h */
    public String m41247h() {
        return this.f304b;
    }

    @AbstractC11612d(tag = 4)
    /* renamed from: i */
    public EnumC1362c m41246i() {
        return this.f306d;
    }

    @AbstractC11612d(tag = 6)
    /* renamed from: j */
    public String m41245j() {
        return this.f308f;
    }

    @AbstractC11612d(tag = 8)
    /* renamed from: k */
    public int m41244k() {
        return this.f310h;
    }

    @AbstractC11612d(tag = 1)
    /* renamed from: l */
    public long m41243l() {
        return this.f303a;
    }

    @AbstractC11612d(tag = 5)
    /* renamed from: m */
    public EnumC1363d m41242m() {
        return this.f307e;
    }

    @AbstractC11612d(tag = 10)
    /* renamed from: n */
    public String m41241n() {
        return this.f312j;
    }

    @AbstractC11612d(tag = 9)
    /* renamed from: o */
    public int m41240o() {
        return this.f311i;
    }
}
