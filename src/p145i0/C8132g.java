package p145i0;

import p145i0.AbstractC8183q;

/* renamed from: i0.g */
/* loaded from: classes.dex */
final class C8132g extends AbstractC8183q {

    /* renamed from: a */
    private final AbstractC8151j1 f17591a;

    /* renamed from: b */
    private final AbstractC8105a f17592b;

    /* renamed from: c */
    private final int f17593c;

    /* renamed from: i0.g$b */
    /* loaded from: classes.dex */
    static final class C8134b extends AbstractC8183q.AbstractC8184a {

        /* renamed from: a */
        private AbstractC8151j1 f17594a;

        /* renamed from: b */
        private AbstractC8105a f17595b;

        /* renamed from: c */
        private Integer f17596c;

        @Override // p145i0.AbstractC8183q.AbstractC8184a
        /* renamed from: a */
        public AbstractC8183q mo20355a() {
            String str = "";
            if (this.f17594a == null) {
                str = str + " videoSpec";
            }
            if (this.f17595b == null) {
                str = str + " audioSpec";
            }
            if (this.f17596c == null) {
                str = str + " outputFormat";
            }
            if (str.isEmpty()) {
                return new C8132g(this.f17594a, this.f17595b, this.f17596c.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p145i0.AbstractC8183q.AbstractC8184a
        /* renamed from: c */
        AbstractC8151j1 mo20353c() {
            AbstractC8151j1 j1Var = this.f17594a;
            if (j1Var != null) {
                return j1Var;
            }
            throw new IllegalStateException("Property \"videoSpec\" has not been set");
        }

        @Override // p145i0.AbstractC8183q.AbstractC8184a
        /* renamed from: d */
        public AbstractC8183q.AbstractC8184a mo20352d(AbstractC8105a aVar) {
            if (aVar != null) {
                this.f17595b = aVar;
                return this;
            }
            throw new NullPointerException("Null audioSpec");
        }

        @Override // p145i0.AbstractC8183q.AbstractC8184a
        /* renamed from: e */
        public AbstractC8183q.AbstractC8184a mo20351e(int i) {
            this.f17596c = Integer.valueOf(i);
            return this;
        }

        @Override // p145i0.AbstractC8183q.AbstractC8184a
        /* renamed from: f */
        public AbstractC8183q.AbstractC8184a mo20350f(AbstractC8151j1 j1Var) {
            if (j1Var != null) {
                this.f17594a = j1Var;
                return this;
            }
            throw new NullPointerException("Null videoSpec");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public C8134b() {
        }

        private C8134b(AbstractC8183q qVar) {
            this.f17594a = qVar.mo20361d();
            this.f17595b = qVar.mo20363b();
            this.f17596c = Integer.valueOf(qVar.mo20362c());
        }
    }

    @Override // p145i0.AbstractC8183q
    /* renamed from: b */
    public AbstractC8105a mo20363b() {
        return this.f17592b;
    }

    @Override // p145i0.AbstractC8183q
    /* renamed from: c */
    public int mo20362c() {
        return this.f17593c;
    }

    @Override // p145i0.AbstractC8183q
    /* renamed from: d */
    public AbstractC8151j1 mo20361d() {
        return this.f17591a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC8183q)) {
            return false;
        }
        AbstractC8183q qVar = (AbstractC8183q) obj;
        if (!this.f17591a.equals(qVar.mo20361d()) || !this.f17592b.equals(qVar.mo20363b()) || this.f17593c != qVar.mo20362c()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.f17591a.hashCode() ^ 1000003) * 1000003) ^ this.f17592b.hashCode()) * 1000003) ^ this.f17593c;
    }

    @Override // p145i0.AbstractC8183q
    /* renamed from: i */
    public AbstractC8183q.AbstractC8184a mo20356i() {
        return new C8134b(this);
    }

    public String toString() {
        return "MediaSpec{videoSpec=" + this.f17591a + ", audioSpec=" + this.f17592b + ", outputFormat=" + this.f17593c + "}";
    }

    private C8132g(AbstractC8151j1 j1Var, AbstractC8105a aVar, int i) {
        this.f17591a = j1Var;
        this.f17592b = aVar;
        this.f17593c = i;
    }
}
