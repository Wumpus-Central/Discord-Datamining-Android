package p315r6;

import java.util.Map;
import p315r6.AbstractC12420i;

/* renamed from: r6.b */
/* loaded from: classes7.dex */
final class C12406b extends AbstractC12420i {

    /* renamed from: a */
    private final String f27923a;

    /* renamed from: b */
    private final Integer f27924b;

    /* renamed from: c */
    private final C12419h f27925c;

    /* renamed from: d */
    private final long f27926d;

    /* renamed from: e */
    private final long f27927e;

    /* renamed from: f */
    private final Map<String, String> f27928f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r6.b$b */
    /* loaded from: classes7.dex */
    public static final class C0398b extends AbstractC12420i.AbstractC12421a {

        /* renamed from: a */
        private String f27929a;

        /* renamed from: b */
        private Integer f27930b;

        /* renamed from: c */
        private C12419h f27931c;

        /* renamed from: d */
        private Long f27932d;

        /* renamed from: e */
        private Long f27933e;

        /* renamed from: f */
        private Map<String, String> f27934f;

        @Override // p315r6.AbstractC12420i.AbstractC12421a
        /* renamed from: d */
        public AbstractC12420i mo6830d() {
            String str = "";
            if (this.f27929a == null) {
                str = str + " transportName";
            }
            if (this.f27931c == null) {
                str = str + " encodedPayload";
            }
            if (this.f27932d == null) {
                str = str + " eventMillis";
            }
            if (this.f27933e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f27934f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new C12406b(this.f27929a, this.f27930b, this.f27931c, this.f27932d.longValue(), this.f27933e.longValue(), this.f27934f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p315r6.AbstractC12420i.AbstractC12421a
        /* renamed from: e */
        protected Map<String, String> mo6829e() {
            Map<String, String> map = this.f27934f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p315r6.AbstractC12420i.AbstractC12421a
        /* renamed from: f */
        public AbstractC12420i.AbstractC12421a mo6828f(Map<String, String> map) {
            if (map != null) {
                this.f27934f = map;
                return this;
            }
            throw new NullPointerException("Null autoMetadata");
        }

        @Override // p315r6.AbstractC12420i.AbstractC12421a
        /* renamed from: g */
        public AbstractC12420i.AbstractC12421a mo6827g(Integer num) {
            this.f27930b = num;
            return this;
        }

        @Override // p315r6.AbstractC12420i.AbstractC12421a
        /* renamed from: h */
        public AbstractC12420i.AbstractC12421a mo6826h(C12419h hVar) {
            if (hVar != null) {
                this.f27931c = hVar;
                return this;
            }
            throw new NullPointerException("Null encodedPayload");
        }

        @Override // p315r6.AbstractC12420i.AbstractC12421a
        /* renamed from: i */
        public AbstractC12420i.AbstractC12421a mo6825i(long j) {
            this.f27932d = Long.valueOf(j);
            return this;
        }

        @Override // p315r6.AbstractC12420i.AbstractC12421a
        /* renamed from: j */
        public AbstractC12420i.AbstractC12421a mo6824j(String str) {
            if (str != null) {
                this.f27929a = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }

        @Override // p315r6.AbstractC12420i.AbstractC12421a
        /* renamed from: k */
        public AbstractC12420i.AbstractC12421a mo6823k(long j) {
            this.f27933e = Long.valueOf(j);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p315r6.AbstractC12420i
    /* renamed from: c */
    public Map<String, String> mo6843c() {
        return this.f27928f;
    }

    @Override // p315r6.AbstractC12420i
    /* renamed from: d */
    public Integer mo6842d() {
        return this.f27924b;
    }

    @Override // p315r6.AbstractC12420i
    /* renamed from: e */
    public C12419h mo6841e() {
        return this.f27925c;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC12420i)) {
            return false;
        }
        AbstractC12420i iVar = (AbstractC12420i) obj;
        if (!this.f27923a.equals(iVar.mo6836j()) || ((num = this.f27924b) != null ? !num.equals(iVar.mo6842d()) : iVar.mo6842d() != null) || !this.f27925c.equals(iVar.mo6841e()) || this.f27926d != iVar.mo6840f() || this.f27927e != iVar.mo6835k() || !this.f27928f.equals(iVar.mo6843c())) {
            return false;
        }
        return true;
    }

    @Override // p315r6.AbstractC12420i
    /* renamed from: f */
    public long mo6840f() {
        return this.f27926d;
    }

    public int hashCode() {
        int i;
        int hashCode = (this.f27923a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f27924b;
        if (num == null) {
            i = 0;
        } else {
            i = num.hashCode();
        }
        long j = this.f27926d;
        long j2 = this.f27927e;
        return ((((((((hashCode ^ i) * 1000003) ^ this.f27925c.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f27928f.hashCode();
    }

    @Override // p315r6.AbstractC12420i
    /* renamed from: j */
    public String mo6836j() {
        return this.f27923a;
    }

    @Override // p315r6.AbstractC12420i
    /* renamed from: k */
    public long mo6835k() {
        return this.f27927e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f27923a + ", code=" + this.f27924b + ", encodedPayload=" + this.f27925c + ", eventMillis=" + this.f27926d + ", uptimeMillis=" + this.f27927e + ", autoMetadata=" + this.f27928f + "}";
    }

    private C12406b(String str, Integer num, C12419h hVar, long j, long j2, Map<String, String> map) {
        this.f27923a = str;
        this.f27924b = num;
        this.f27925c = hVar;
        this.f27926d = j;
        this.f27927e = j2;
        this.f27928f = map;
    }
}
