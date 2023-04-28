package p458z6;

import java.util.Set;
import p458z6.AbstractC14553f;

/* renamed from: z6.c */
/* loaded from: classes7.dex */
final class C14548c extends AbstractC14553f.AbstractC14555b {

    /* renamed from: a */
    private final long f32977a;

    /* renamed from: b */
    private final long f32978b;

    /* renamed from: c */
    private final Set<AbstractC14553f.EnumC14557c> f32979c;

    /* renamed from: z6.c$b */
    /* loaded from: classes7.dex */
    static final class C14550b extends AbstractC14553f.AbstractC14555b.AbstractC14556a {

        /* renamed from: a */
        private Long f32980a;

        /* renamed from: b */
        private Long f32981b;

        /* renamed from: c */
        private Set<AbstractC14553f.EnumC14557c> f32982c;

        @Override // p458z6.AbstractC14553f.AbstractC14555b.AbstractC14556a
        /* renamed from: a */
        public AbstractC14553f.AbstractC14555b mo225a() {
            String str = "";
            if (this.f32980a == null) {
                str = str + " delta";
            }
            if (this.f32981b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f32982c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new C14548c(this.f32980a.longValue(), this.f32981b.longValue(), this.f32982c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p458z6.AbstractC14553f.AbstractC14555b.AbstractC14556a
        /* renamed from: b */
        public AbstractC14553f.AbstractC14555b.AbstractC14556a mo224b(long j) {
            this.f32980a = Long.valueOf(j);
            return this;
        }

        @Override // p458z6.AbstractC14553f.AbstractC14555b.AbstractC14556a
        /* renamed from: c */
        public AbstractC14553f.AbstractC14555b.AbstractC14556a mo223c(Set<AbstractC14553f.EnumC14557c> set) {
            if (set != null) {
                this.f32982c = set;
                return this;
            }
            throw new NullPointerException("Null flags");
        }

        @Override // p458z6.AbstractC14553f.AbstractC14555b.AbstractC14556a
        /* renamed from: d */
        public AbstractC14553f.AbstractC14555b.AbstractC14556a mo222d(long j) {
            this.f32981b = Long.valueOf(j);
            return this;
        }
    }

    @Override // p458z6.AbstractC14553f.AbstractC14555b
    /* renamed from: b */
    long mo228b() {
        return this.f32977a;
    }

    @Override // p458z6.AbstractC14553f.AbstractC14555b
    /* renamed from: c */
    Set<AbstractC14553f.EnumC14557c> mo227c() {
        return this.f32979c;
    }

    @Override // p458z6.AbstractC14553f.AbstractC14555b
    /* renamed from: d */
    long mo226d() {
        return this.f32978b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC14553f.AbstractC14555b)) {
            return false;
        }
        AbstractC14553f.AbstractC14555b bVar = (AbstractC14553f.AbstractC14555b) obj;
        if (this.f32977a == bVar.mo228b() && this.f32978b == bVar.mo226d() && this.f32979c.equals(bVar.mo227c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f32977a;
        long j2 = this.f32978b;
        return ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f32979c.hashCode();
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f32977a + ", maxAllowedDelay=" + this.f32978b + ", flags=" + this.f32979c + "}";
    }

    private C14548c(long j, long j2, Set<AbstractC14553f.EnumC14557c> set) {
        this.f32977a = j;
        this.f32978b = j2;
        this.f32979c = set;
    }
}
