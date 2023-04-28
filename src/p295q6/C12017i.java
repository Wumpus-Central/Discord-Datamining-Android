package p295q6;

import p295q6.AbstractC12029o;

/* renamed from: q6.i */
/* loaded from: classes7.dex */
final class C12017i extends AbstractC12029o {

    /* renamed from: a */
    private final AbstractC12029o.EnumC12032c f26950a;

    /* renamed from: b */
    private final AbstractC12029o.EnumC12031b f26951b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q6.i$b */
    /* loaded from: classes7.dex */
    public static final class C12019b extends AbstractC12029o.AbstractC12030a {

        /* renamed from: a */
        private AbstractC12029o.EnumC12032c f26952a;

        /* renamed from: b */
        private AbstractC12029o.EnumC12031b f26953b;

        @Override // p295q6.AbstractC12029o.AbstractC12030a
        /* renamed from: a */
        public AbstractC12029o mo7957a() {
            return new C12017i(this.f26952a, this.f26953b);
        }

        @Override // p295q6.AbstractC12029o.AbstractC12030a
        /* renamed from: b */
        public AbstractC12029o.AbstractC12030a mo7956b(AbstractC12029o.EnumC12031b bVar) {
            this.f26953b = bVar;
            return this;
        }

        @Override // p295q6.AbstractC12029o.AbstractC12030a
        /* renamed from: c */
        public AbstractC12029o.AbstractC12030a mo7955c(AbstractC12029o.EnumC12032c cVar) {
            this.f26952a = cVar;
            return this;
        }
    }

    @Override // p295q6.AbstractC12029o
    /* renamed from: b */
    public AbstractC12029o.EnumC12031b mo7959b() {
        return this.f26951b;
    }

    @Override // p295q6.AbstractC12029o
    /* renamed from: c */
    public AbstractC12029o.EnumC12032c mo7958c() {
        return this.f26950a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC12029o)) {
            return false;
        }
        AbstractC12029o oVar = (AbstractC12029o) obj;
        AbstractC12029o.EnumC12032c cVar = this.f26950a;
        if (cVar != null ? cVar.equals(oVar.mo7958c()) : oVar.mo7958c() == null) {
            AbstractC12029o.EnumC12031b bVar = this.f26951b;
            if (bVar == null) {
                if (oVar.mo7959b() == null) {
                    return true;
                }
            } else if (bVar.equals(oVar.mo7959b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        AbstractC12029o.EnumC12032c cVar = this.f26950a;
        int i2 = 0;
        if (cVar == null) {
            i = 0;
        } else {
            i = cVar.hashCode();
        }
        int i3 = (i ^ 1000003) * 1000003;
        AbstractC12029o.EnumC12031b bVar = this.f26951b;
        if (bVar != null) {
            i2 = bVar.hashCode();
        }
        return i3 ^ i2;
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f26950a + ", mobileSubtype=" + this.f26951b + "}";
    }

    private C12017i(AbstractC12029o.EnumC12032c cVar, AbstractC12029o.EnumC12031b bVar) {
        this.f26950a = cVar;
        this.f26951b = bVar;
    }
}
