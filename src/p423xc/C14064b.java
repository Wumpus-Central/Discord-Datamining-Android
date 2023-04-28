package p423xc;

import p423xc.AbstractC14071f;

/* renamed from: xc.b */
/* loaded from: classes3.dex */
final class C14064b extends AbstractC14071f {

    /* renamed from: a */
    private final String f31742a;

    /* renamed from: b */
    private final long f31743b;

    /* renamed from: c */
    private final AbstractC14071f.EnumC14073b f31744c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xc.b$b */
    /* loaded from: classes3.dex */
    public static final class C0454b extends AbstractC14071f.AbstractC14072a {

        /* renamed from: a */
        private String f31745a;

        /* renamed from: b */
        private Long f31746b;

        /* renamed from: c */
        private AbstractC14071f.EnumC14073b f31747c;

        @Override // p423xc.AbstractC14071f.AbstractC14072a
        /* renamed from: a */
        public AbstractC14071f mo1771a() {
            String str = "";
            if (this.f31746b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new C14064b(this.f31745a, this.f31746b.longValue(), this.f31747c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p423xc.AbstractC14071f.AbstractC14072a
        /* renamed from: b */
        public AbstractC14071f.AbstractC14072a mo1770b(AbstractC14071f.EnumC14073b bVar) {
            this.f31747c = bVar;
            return this;
        }

        @Override // p423xc.AbstractC14071f.AbstractC14072a
        /* renamed from: c */
        public AbstractC14071f.AbstractC14072a mo1769c(String str) {
            this.f31745a = str;
            return this;
        }

        @Override // p423xc.AbstractC14071f.AbstractC14072a
        /* renamed from: d */
        public AbstractC14071f.AbstractC14072a mo1768d(long j) {
            this.f31746b = Long.valueOf(j);
            return this;
        }
    }

    @Override // p423xc.AbstractC14071f
    /* renamed from: b */
    public AbstractC14071f.EnumC14073b mo1774b() {
        return this.f31744c;
    }

    @Override // p423xc.AbstractC14071f
    /* renamed from: c */
    public String mo1773c() {
        return this.f31742a;
    }

    @Override // p423xc.AbstractC14071f
    /* renamed from: d */
    public long mo1772d() {
        return this.f31743b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC14071f)) {
            return false;
        }
        AbstractC14071f fVar = (AbstractC14071f) obj;
        String str = this.f31742a;
        if (str != null ? str.equals(fVar.mo1773c()) : fVar.mo1773c() == null) {
            if (this.f31743b == fVar.mo1772d()) {
                AbstractC14071f.EnumC14073b bVar = this.f31744c;
                if (bVar == null) {
                    if (fVar.mo1774b() == null) {
                        return true;
                    }
                } else if (bVar.equals(fVar.mo1774b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        String str = this.f31742a;
        int i2 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        long j = this.f31743b;
        int i3 = (((i ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        AbstractC14071f.EnumC14073b bVar = this.f31744c;
        if (bVar != null) {
            i2 = bVar.hashCode();
        }
        return i3 ^ i2;
    }

    public String toString() {
        return "TokenResult{token=" + this.f31742a + ", tokenExpirationTimestamp=" + this.f31743b + ", responseCode=" + this.f31744c + "}";
    }

    private C14064b(String str, long j, AbstractC14071f.EnumC14073b bVar) {
        this.f31742a = str;
        this.f31743b = j;
        this.f31744c = bVar;
    }
}
