package p295q6;

import java.util.List;
import p295q6.AbstractC12026m;

/* renamed from: q6.g */
/* loaded from: classes7.dex */
final class C12013g extends AbstractC12026m {

    /* renamed from: a */
    private final long f26935a;

    /* renamed from: b */
    private final long f26936b;

    /* renamed from: c */
    private final AbstractC12021k f26937c;

    /* renamed from: d */
    private final Integer f26938d;

    /* renamed from: e */
    private final String f26939e;

    /* renamed from: f */
    private final List<AbstractC12024l> f26940f;

    /* renamed from: g */
    private final EnumC12033p f26941g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q6.g$b */
    /* loaded from: classes7.dex */
    public static final class C12015b extends AbstractC12026m.AbstractC12027a {

        /* renamed from: a */
        private Long f26942a;

        /* renamed from: b */
        private Long f26943b;

        /* renamed from: c */
        private AbstractC12021k f26944c;

        /* renamed from: d */
        private Integer f26945d;

        /* renamed from: e */
        private String f26946e;

        /* renamed from: f */
        private List<AbstractC12024l> f26947f;

        /* renamed from: g */
        private EnumC12033p f26948g;

        @Override // p295q6.AbstractC12026m.AbstractC12027a
        /* renamed from: a */
        public AbstractC12026m mo7973a() {
            String str = "";
            if (this.f26942a == null) {
                str = str + " requestTimeMs";
            }
            if (this.f26943b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new C12013g(this.f26942a.longValue(), this.f26943b.longValue(), this.f26944c, this.f26945d, this.f26946e, this.f26947f, this.f26948g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p295q6.AbstractC12026m.AbstractC12027a
        /* renamed from: b */
        public AbstractC12026m.AbstractC12027a mo7972b(AbstractC12021k kVar) {
            this.f26944c = kVar;
            return this;
        }

        @Override // p295q6.AbstractC12026m.AbstractC12027a
        /* renamed from: c */
        public AbstractC12026m.AbstractC12027a mo7971c(List<AbstractC12024l> list) {
            this.f26947f = list;
            return this;
        }

        @Override // p295q6.AbstractC12026m.AbstractC12027a
        /* renamed from: d */
        AbstractC12026m.AbstractC12027a mo7970d(Integer num) {
            this.f26945d = num;
            return this;
        }

        @Override // p295q6.AbstractC12026m.AbstractC12027a
        /* renamed from: e */
        AbstractC12026m.AbstractC12027a mo7969e(String str) {
            this.f26946e = str;
            return this;
        }

        @Override // p295q6.AbstractC12026m.AbstractC12027a
        /* renamed from: f */
        public AbstractC12026m.AbstractC12027a mo7968f(EnumC12033p pVar) {
            this.f26948g = pVar;
            return this;
        }

        @Override // p295q6.AbstractC12026m.AbstractC12027a
        /* renamed from: g */
        public AbstractC12026m.AbstractC12027a mo7967g(long j) {
            this.f26942a = Long.valueOf(j);
            return this;
        }

        @Override // p295q6.AbstractC12026m.AbstractC12027a
        /* renamed from: h */
        public AbstractC12026m.AbstractC12027a mo7966h(long j) {
            this.f26943b = Long.valueOf(j);
            return this;
        }
    }

    @Override // p295q6.AbstractC12026m
    /* renamed from: b */
    public AbstractC12021k mo7980b() {
        return this.f26937c;
    }

    @Override // p295q6.AbstractC12026m
    /* renamed from: c */
    public List<AbstractC12024l> mo7979c() {
        return this.f26940f;
    }

    @Override // p295q6.AbstractC12026m
    /* renamed from: d */
    public Integer mo7978d() {
        return this.f26938d;
    }

    @Override // p295q6.AbstractC12026m
    /* renamed from: e */
    public String mo7977e() {
        return this.f26939e;
    }

    public boolean equals(Object obj) {
        AbstractC12021k kVar;
        Integer num;
        String str;
        List<AbstractC12024l> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC12026m)) {
            return false;
        }
        AbstractC12026m mVar = (AbstractC12026m) obj;
        if (this.f26935a == mVar.mo7975g() && this.f26936b == mVar.mo7974h() && ((kVar = this.f26937c) != null ? kVar.equals(mVar.mo7980b()) : mVar.mo7980b() == null) && ((num = this.f26938d) != null ? num.equals(mVar.mo7978d()) : mVar.mo7978d() == null) && ((str = this.f26939e) != null ? str.equals(mVar.mo7977e()) : mVar.mo7977e() == null) && ((list = this.f26940f) != null ? list.equals(mVar.mo7979c()) : mVar.mo7979c() == null)) {
            EnumC12033p pVar = this.f26941g;
            if (pVar == null) {
                if (mVar.mo7976f() == null) {
                    return true;
                }
            } else if (pVar.equals(mVar.mo7976f())) {
                return true;
            }
        }
        return false;
    }

    @Override // p295q6.AbstractC12026m
    /* renamed from: f */
    public EnumC12033p mo7976f() {
        return this.f26941g;
    }

    @Override // p295q6.AbstractC12026m
    /* renamed from: g */
    public long mo7975g() {
        return this.f26935a;
    }

    @Override // p295q6.AbstractC12026m
    /* renamed from: h */
    public long mo7974h() {
        return this.f26936b;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        long j = this.f26935a;
        long j2 = this.f26936b;
        int i5 = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        AbstractC12021k kVar = this.f26937c;
        int i6 = 0;
        if (kVar == null) {
            i = 0;
        } else {
            i = kVar.hashCode();
        }
        int i7 = (i5 ^ i) * 1000003;
        Integer num = this.f26938d;
        if (num == null) {
            i2 = 0;
        } else {
            i2 = num.hashCode();
        }
        int i8 = (i7 ^ i2) * 1000003;
        String str = this.f26939e;
        if (str == null) {
            i3 = 0;
        } else {
            i3 = str.hashCode();
        }
        int i9 = (i8 ^ i3) * 1000003;
        List<AbstractC12024l> list = this.f26940f;
        if (list == null) {
            i4 = 0;
        } else {
            i4 = list.hashCode();
        }
        int i10 = (i9 ^ i4) * 1000003;
        EnumC12033p pVar = this.f26941g;
        if (pVar != null) {
            i6 = pVar.hashCode();
        }
        return i10 ^ i6;
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f26935a + ", requestUptimeMs=" + this.f26936b + ", clientInfo=" + this.f26937c + ", logSource=" + this.f26938d + ", logSourceName=" + this.f26939e + ", logEvents=" + this.f26940f + ", qosTier=" + this.f26941g + "}";
    }

    private C12013g(long j, long j2, AbstractC12021k kVar, Integer num, String str, List<AbstractC12024l> list, EnumC12033p pVar) {
        this.f26935a = j;
        this.f26936b = j2;
        this.f26937c = kVar;
        this.f26938d = num;
        this.f26939e = str;
        this.f26940f = list;
        this.f26941g = pVar;
    }
}
