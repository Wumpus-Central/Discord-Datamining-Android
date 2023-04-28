package p295q6;

import java.util.Arrays;
import p295q6.AbstractC12024l;

/* renamed from: q6.f */
/* loaded from: classes7.dex */
final class C12010f extends AbstractC12024l {

    /* renamed from: a */
    private final long f26921a;

    /* renamed from: b */
    private final Integer f26922b;

    /* renamed from: c */
    private final long f26923c;

    /* renamed from: d */
    private final byte[] f26924d;

    /* renamed from: e */
    private final String f26925e;

    /* renamed from: f */
    private final long f26926f;

    /* renamed from: g */
    private final AbstractC12029o f26927g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q6.f$b */
    /* loaded from: classes7.dex */
    public static final class C12012b extends AbstractC12024l.AbstractC12025a {

        /* renamed from: a */
        private Long f26928a;

        /* renamed from: b */
        private Integer f26929b;

        /* renamed from: c */
        private Long f26930c;

        /* renamed from: d */
        private byte[] f26931d;

        /* renamed from: e */
        private String f26932e;

        /* renamed from: f */
        private Long f26933f;

        /* renamed from: g */
        private AbstractC12029o f26934g;

        @Override // p295q6.AbstractC12024l.AbstractC12025a
        /* renamed from: a */
        public AbstractC12024l mo7989a() {
            String str = "";
            if (this.f26928a == null) {
                str = str + " eventTimeMs";
            }
            if (this.f26930c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f26933f == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new C12010f(this.f26928a.longValue(), this.f26929b, this.f26930c.longValue(), this.f26931d, this.f26932e, this.f26933f.longValue(), this.f26934g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p295q6.AbstractC12024l.AbstractC12025a
        /* renamed from: b */
        public AbstractC12024l.AbstractC12025a mo7988b(Integer num) {
            this.f26929b = num;
            return this;
        }

        @Override // p295q6.AbstractC12024l.AbstractC12025a
        /* renamed from: c */
        public AbstractC12024l.AbstractC12025a mo7987c(long j) {
            this.f26928a = Long.valueOf(j);
            return this;
        }

        @Override // p295q6.AbstractC12024l.AbstractC12025a
        /* renamed from: d */
        public AbstractC12024l.AbstractC12025a mo7986d(long j) {
            this.f26930c = Long.valueOf(j);
            return this;
        }

        @Override // p295q6.AbstractC12024l.AbstractC12025a
        /* renamed from: e */
        public AbstractC12024l.AbstractC12025a mo7985e(AbstractC12029o oVar) {
            this.f26934g = oVar;
            return this;
        }

        @Override // p295q6.AbstractC12024l.AbstractC12025a
        /* renamed from: f */
        AbstractC12024l.AbstractC12025a mo7984f(byte[] bArr) {
            this.f26931d = bArr;
            return this;
        }

        @Override // p295q6.AbstractC12024l.AbstractC12025a
        /* renamed from: g */
        AbstractC12024l.AbstractC12025a mo7983g(String str) {
            this.f26932e = str;
            return this;
        }

        @Override // p295q6.AbstractC12024l.AbstractC12025a
        /* renamed from: h */
        public AbstractC12024l.AbstractC12025a mo7982h(long j) {
            this.f26933f = Long.valueOf(j);
            return this;
        }
    }

    @Override // p295q6.AbstractC12024l
    /* renamed from: b */
    public Integer mo7998b() {
        return this.f26922b;
    }

    @Override // p295q6.AbstractC12024l
    /* renamed from: c */
    public long mo7997c() {
        return this.f26921a;
    }

    @Override // p295q6.AbstractC12024l
    /* renamed from: d */
    public long mo7996d() {
        return this.f26923c;
    }

    @Override // p295q6.AbstractC12024l
    /* renamed from: e */
    public AbstractC12029o mo7995e() {
        return this.f26927g;
    }

    public boolean equals(Object obj) {
        Integer num;
        byte[] bArr;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC12024l)) {
            return false;
        }
        AbstractC12024l lVar = (AbstractC12024l) obj;
        if (this.f26921a == lVar.mo7997c() && ((num = this.f26922b) != null ? num.equals(lVar.mo7998b()) : lVar.mo7998b() == null) && this.f26923c == lVar.mo7996d()) {
            byte[] bArr2 = this.f26924d;
            if (lVar instanceof C12010f) {
                bArr = ((C12010f) lVar).f26924d;
            } else {
                bArr = lVar.mo7994f();
            }
            if (Arrays.equals(bArr2, bArr) && ((str = this.f26925e) != null ? str.equals(lVar.mo7993g()) : lVar.mo7993g() == null) && this.f26926f == lVar.mo7992h()) {
                AbstractC12029o oVar = this.f26927g;
                if (oVar == null) {
                    if (lVar.mo7995e() == null) {
                        return true;
                    }
                } else if (oVar.equals(lVar.mo7995e())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p295q6.AbstractC12024l
    /* renamed from: f */
    public byte[] mo7994f() {
        return this.f26924d;
    }

    @Override // p295q6.AbstractC12024l
    /* renamed from: g */
    public String mo7993g() {
        return this.f26925e;
    }

    @Override // p295q6.AbstractC12024l
    /* renamed from: h */
    public long mo7992h() {
        return this.f26926f;
    }

    public int hashCode() {
        int i;
        int i2;
        long j = this.f26921a;
        int i3 = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f26922b;
        int i4 = 0;
        if (num == null) {
            i = 0;
        } else {
            i = num.hashCode();
        }
        long j2 = this.f26923c;
        int hashCode = (((((i3 ^ i) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f26924d)) * 1000003;
        String str = this.f26925e;
        if (str == null) {
            i2 = 0;
        } else {
            i2 = str.hashCode();
        }
        long j3 = this.f26926f;
        int i5 = (((hashCode ^ i2) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        AbstractC12029o oVar = this.f26927g;
        if (oVar != null) {
            i4 = oVar.hashCode();
        }
        return i5 ^ i4;
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f26921a + ", eventCode=" + this.f26922b + ", eventUptimeMs=" + this.f26923c + ", sourceExtension=" + Arrays.toString(this.f26924d) + ", sourceExtensionJsonProto3=" + this.f26925e + ", timezoneOffsetSeconds=" + this.f26926f + ", networkConnectionInfo=" + this.f26927g + "}";
    }

    private C12010f(long j, Integer num, long j2, byte[] bArr, String str, long j3, AbstractC12029o oVar) {
        this.f26921a = j;
        this.f26922b = num;
        this.f26923c = j2;
        this.f26924d = bArr;
        this.f26925e = str;
        this.f26926f = j3;
        this.f26927g = oVar;
    }
}
