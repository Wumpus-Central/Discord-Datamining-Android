package p315r6;

import p279p6.AbstractC11573c;
import p279p6.AbstractC11575e;
import p279p6.C11572b;
import p315r6.AbstractC12428n;

/* renamed from: r6.c */
/* loaded from: classes7.dex */
final class C12408c extends AbstractC12428n {

    /* renamed from: a */
    private final AbstractC12430o f27935a;

    /* renamed from: b */
    private final String f27936b;

    /* renamed from: c */
    private final AbstractC11573c<?> f27937c;

    /* renamed from: d */
    private final AbstractC11575e<?, byte[]> f27938d;

    /* renamed from: e */
    private final C11572b f27939e;

    /* renamed from: r6.c$b */
    /* loaded from: classes7.dex */
    static final class C12410b extends AbstractC12428n.AbstractC12429a {

        /* renamed from: a */
        private AbstractC12430o f27940a;

        /* renamed from: b */
        private String f27941b;

        /* renamed from: c */
        private AbstractC11573c<?> f27942c;

        /* renamed from: d */
        private AbstractC11575e<?, byte[]> f27943d;

        /* renamed from: e */
        private C11572b f27944e;

        @Override // p315r6.AbstractC12428n.AbstractC12429a
        /* renamed from: a */
        public AbstractC12428n mo6808a() {
            String str = "";
            if (this.f27940a == null) {
                str = str + " transportContext";
            }
            if (this.f27941b == null) {
                str = str + " transportName";
            }
            if (this.f27942c == null) {
                str = str + " event";
            }
            if (this.f27943d == null) {
                str = str + " transformer";
            }
            if (this.f27944e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new C12408c(this.f27940a, this.f27941b, this.f27942c, this.f27943d, this.f27944e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p315r6.AbstractC12428n.AbstractC12429a
        /* renamed from: b */
        AbstractC12428n.AbstractC12429a mo6807b(C11572b bVar) {
            if (bVar != null) {
                this.f27944e = bVar;
                return this;
            }
            throw new NullPointerException("Null encoding");
        }

        @Override // p315r6.AbstractC12428n.AbstractC12429a
        /* renamed from: c */
        AbstractC12428n.AbstractC12429a mo6806c(AbstractC11573c<?> cVar) {
            if (cVar != null) {
                this.f27942c = cVar;
                return this;
            }
            throw new NullPointerException("Null event");
        }

        @Override // p315r6.AbstractC12428n.AbstractC12429a
        /* renamed from: d */
        AbstractC12428n.AbstractC12429a mo6805d(AbstractC11575e<?, byte[]> eVar) {
            if (eVar != null) {
                this.f27943d = eVar;
                return this;
            }
            throw new NullPointerException("Null transformer");
        }

        @Override // p315r6.AbstractC12428n.AbstractC12429a
        /* renamed from: e */
        public AbstractC12428n.AbstractC12429a mo6804e(AbstractC12430o oVar) {
            if (oVar != null) {
                this.f27940a = oVar;
                return this;
            }
            throw new NullPointerException("Null transportContext");
        }

        @Override // p315r6.AbstractC12428n.AbstractC12429a
        /* renamed from: f */
        public AbstractC12428n.AbstractC12429a mo6803f(String str) {
            if (str != null) {
                this.f27941b = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }
    }

    @Override // p315r6.AbstractC12428n
    /* renamed from: b */
    public C11572b mo6814b() {
        return this.f27939e;
    }

    @Override // p315r6.AbstractC12428n
    /* renamed from: c */
    AbstractC11573c<?> mo6813c() {
        return this.f27937c;
    }

    @Override // p315r6.AbstractC12428n
    /* renamed from: e */
    AbstractC11575e<?, byte[]> mo6811e() {
        return this.f27938d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC12428n)) {
            return false;
        }
        AbstractC12428n nVar = (AbstractC12428n) obj;
        if (!this.f27935a.equals(nVar.mo6810f()) || !this.f27936b.equals(nVar.mo6809g()) || !this.f27937c.equals(nVar.mo6813c()) || !this.f27938d.equals(nVar.mo6811e()) || !this.f27939e.equals(nVar.mo6814b())) {
            return false;
        }
        return true;
    }

    @Override // p315r6.AbstractC12428n
    /* renamed from: f */
    public AbstractC12430o mo6810f() {
        return this.f27935a;
    }

    @Override // p315r6.AbstractC12428n
    /* renamed from: g */
    public String mo6809g() {
        return this.f27936b;
    }

    public int hashCode() {
        return ((((((((this.f27935a.hashCode() ^ 1000003) * 1000003) ^ this.f27936b.hashCode()) * 1000003) ^ this.f27937c.hashCode()) * 1000003) ^ this.f27938d.hashCode()) * 1000003) ^ this.f27939e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f27935a + ", transportName=" + this.f27936b + ", event=" + this.f27937c + ", transformer=" + this.f27938d + ", encoding=" + this.f27939e + "}";
    }

    private C12408c(AbstractC12430o oVar, String str, AbstractC11573c<?> cVar, AbstractC11575e<?, byte[]> eVar, C11572b bVar) {
        this.f27935a = oVar;
        this.f27936b = str;
        this.f27937c = cVar;
        this.f27938d = eVar;
        this.f27939e = bVar;
    }
}
