package p423xc;

import p423xc.AbstractC14067d;

/* renamed from: xc.a */
/* loaded from: classes3.dex */
final class C14062a extends AbstractC14067d {

    /* renamed from: a */
    private final String f31732a;

    /* renamed from: b */
    private final String f31733b;

    /* renamed from: c */
    private final String f31734c;

    /* renamed from: d */
    private final AbstractC14071f f31735d;

    /* renamed from: e */
    private final AbstractC14067d.EnumC14069b f31736e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xc.a$b */
    /* loaded from: classes3.dex */
    public static final class C14063b extends AbstractC14067d.AbstractC14068a {

        /* renamed from: a */
        private String f31737a;

        /* renamed from: b */
        private String f31738b;

        /* renamed from: c */
        private String f31739c;

        /* renamed from: d */
        private AbstractC14071f f31740d;

        /* renamed from: e */
        private AbstractC14067d.EnumC14069b f31741e;

        @Override // p423xc.AbstractC14067d.AbstractC14068a
        /* renamed from: a */
        public AbstractC14067d mo1787a() {
            return new C14062a(this.f31737a, this.f31738b, this.f31739c, this.f31740d, this.f31741e);
        }

        @Override // p423xc.AbstractC14067d.AbstractC14068a
        /* renamed from: b */
        public AbstractC14067d.AbstractC14068a mo1786b(AbstractC14071f fVar) {
            this.f31740d = fVar;
            return this;
        }

        @Override // p423xc.AbstractC14067d.AbstractC14068a
        /* renamed from: c */
        public AbstractC14067d.AbstractC14068a mo1785c(String str) {
            this.f31738b = str;
            return this;
        }

        @Override // p423xc.AbstractC14067d.AbstractC14068a
        /* renamed from: d */
        public AbstractC14067d.AbstractC14068a mo1784d(String str) {
            this.f31739c = str;
            return this;
        }

        @Override // p423xc.AbstractC14067d.AbstractC14068a
        /* renamed from: e */
        public AbstractC14067d.AbstractC14068a mo1783e(AbstractC14067d.EnumC14069b bVar) {
            this.f31741e = bVar;
            return this;
        }

        @Override // p423xc.AbstractC14067d.AbstractC14068a
        /* renamed from: f */
        public AbstractC14067d.AbstractC14068a mo1782f(String str) {
            this.f31737a = str;
            return this;
        }
    }

    @Override // p423xc.AbstractC14067d
    /* renamed from: b */
    public AbstractC14071f mo1792b() {
        return this.f31735d;
    }

    @Override // p423xc.AbstractC14067d
    /* renamed from: c */
    public String mo1791c() {
        return this.f31733b;
    }

    @Override // p423xc.AbstractC14067d
    /* renamed from: d */
    public String mo1790d() {
        return this.f31734c;
    }

    @Override // p423xc.AbstractC14067d
    /* renamed from: e */
    public AbstractC14067d.EnumC14069b mo1789e() {
        return this.f31736e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC14067d)) {
            return false;
        }
        AbstractC14067d dVar = (AbstractC14067d) obj;
        String str = this.f31732a;
        if (str != null ? str.equals(dVar.mo1788f()) : dVar.mo1788f() == null) {
            String str2 = this.f31733b;
            if (str2 != null ? str2.equals(dVar.mo1791c()) : dVar.mo1791c() == null) {
                String str3 = this.f31734c;
                if (str3 != null ? str3.equals(dVar.mo1790d()) : dVar.mo1790d() == null) {
                    AbstractC14071f fVar = this.f31735d;
                    if (fVar != null ? fVar.equals(dVar.mo1792b()) : dVar.mo1792b() == null) {
                        AbstractC14067d.EnumC14069b bVar = this.f31736e;
                        if (bVar == null) {
                            if (dVar.mo1789e() == null) {
                                return true;
                            }
                        } else if (bVar.equals(dVar.mo1789e())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // p423xc.AbstractC14067d
    /* renamed from: f */
    public String mo1788f() {
        return this.f31732a;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        String str = this.f31732a;
        int i5 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i6 = (i ^ 1000003) * 1000003;
        String str2 = this.f31733b;
        if (str2 == null) {
            i2 = 0;
        } else {
            i2 = str2.hashCode();
        }
        int i7 = (i6 ^ i2) * 1000003;
        String str3 = this.f31734c;
        if (str3 == null) {
            i3 = 0;
        } else {
            i3 = str3.hashCode();
        }
        int i8 = (i7 ^ i3) * 1000003;
        AbstractC14071f fVar = this.f31735d;
        if (fVar == null) {
            i4 = 0;
        } else {
            i4 = fVar.hashCode();
        }
        int i9 = (i8 ^ i4) * 1000003;
        AbstractC14067d.EnumC14069b bVar = this.f31736e;
        if (bVar != null) {
            i5 = bVar.hashCode();
        }
        return i9 ^ i5;
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f31732a + ", fid=" + this.f31733b + ", refreshToken=" + this.f31734c + ", authToken=" + this.f31735d + ", responseCode=" + this.f31736e + "}";
    }

    private C14062a(String str, String str2, String str3, AbstractC14071f fVar, AbstractC14067d.EnumC14069b bVar) {
        this.f31732a = str;
        this.f31733b = str2;
        this.f31734c = str3;
        this.f31735d = fVar;
        this.f31736e = bVar;
    }
}
