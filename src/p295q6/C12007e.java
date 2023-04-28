package p295q6;

import p295q6.AbstractC12021k;

/* renamed from: q6.e */
/* loaded from: classes7.dex */
final class C12007e extends AbstractC12021k {

    /* renamed from: a */
    private final AbstractC12021k.EnumC12023b f26917a;

    /* renamed from: b */
    private final AbstractC11996a f26918b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q6.e$b */
    /* loaded from: classes7.dex */
    public static final class C12009b extends AbstractC12021k.AbstractC12022a {

        /* renamed from: a */
        private AbstractC12021k.EnumC12023b f26919a;

        /* renamed from: b */
        private AbstractC11996a f26920b;

        @Override // p295q6.AbstractC12021k.AbstractC12022a
        /* renamed from: a */
        public AbstractC12021k mo8002a() {
            return new C12007e(this.f26919a, this.f26920b);
        }

        @Override // p295q6.AbstractC12021k.AbstractC12022a
        /* renamed from: b */
        public AbstractC12021k.AbstractC12022a mo8001b(AbstractC11996a aVar) {
            this.f26920b = aVar;
            return this;
        }

        @Override // p295q6.AbstractC12021k.AbstractC12022a
        /* renamed from: c */
        public AbstractC12021k.AbstractC12022a mo8000c(AbstractC12021k.EnumC12023b bVar) {
            this.f26919a = bVar;
            return this;
        }
    }

    @Override // p295q6.AbstractC12021k
    /* renamed from: b */
    public AbstractC11996a mo8004b() {
        return this.f26918b;
    }

    @Override // p295q6.AbstractC12021k
    /* renamed from: c */
    public AbstractC12021k.EnumC12023b mo8003c() {
        return this.f26917a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC12021k)) {
            return false;
        }
        AbstractC12021k kVar = (AbstractC12021k) obj;
        AbstractC12021k.EnumC12023b bVar = this.f26917a;
        if (bVar != null ? bVar.equals(kVar.mo8003c()) : kVar.mo8003c() == null) {
            AbstractC11996a aVar = this.f26918b;
            if (aVar == null) {
                if (kVar.mo8004b() == null) {
                    return true;
                }
            } else if (aVar.equals(kVar.mo8004b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        AbstractC12021k.EnumC12023b bVar = this.f26917a;
        int i2 = 0;
        if (bVar == null) {
            i = 0;
        } else {
            i = bVar.hashCode();
        }
        int i3 = (i ^ 1000003) * 1000003;
        AbstractC11996a aVar = this.f26918b;
        if (aVar != null) {
            i2 = aVar.hashCode();
        }
        return i3 ^ i2;
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f26917a + ", androidClientInfo=" + this.f26918b + "}";
    }

    private C12007e(AbstractC12021k.EnumC12023b bVar, AbstractC11996a aVar) {
        this.f26917a = bVar;
        this.f26918b = aVar;
    }
}
