package p236n0;

import p236n0.AbstractC10684h;
import p390w.AbstractC13609j;

/* renamed from: n0.g */
/* loaded from: classes.dex */
final class C10681g extends AbstractC10684h {

    /* renamed from: a */
    private final String f23641a;

    /* renamed from: b */
    private final int f23642b;

    /* renamed from: c */
    private final AbstractC13609j f23643c;

    /* renamed from: n0.g$b */
    /* loaded from: classes.dex */
    static final class C10683b extends AbstractC10684h.AbstractC10685a {

        /* renamed from: a */
        private String f23644a;

        /* renamed from: b */
        private Integer f23645b;

        /* renamed from: c */
        private AbstractC13609j f23646c;

        @Override // p236n0.AbstractC10684h.AbstractC10685a
        /* renamed from: a */
        public AbstractC10684h mo12643a() {
            String str = "";
            if (this.f23644a == null) {
                str = str + " mimeType";
            }
            if (this.f23645b == null) {
                str = str + " profile";
            }
            if (str.isEmpty()) {
                return new C10681g(this.f23644a, this.f23645b.intValue(), this.f23646c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p236n0.AbstractC10684h.AbstractC10685a
        /* renamed from: b */
        public AbstractC10684h.AbstractC10685a mo12642b(AbstractC13609j jVar) {
            this.f23646c = jVar;
            return this;
        }

        @Override // p236n0.AbstractC10684h.AbstractC10685a
        /* renamed from: c */
        public AbstractC10684h.AbstractC10685a mo12641c(int i) {
            this.f23645b = Integer.valueOf(i);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: d */
        public AbstractC10684h.AbstractC10685a m12648d(String str) {
            if (str != null) {
                this.f23644a = str;
                return this;
            }
            throw new NullPointerException("Null mimeType");
        }
    }

    @Override // p236n0.AbstractC10684h
    /* renamed from: b */
    public AbstractC13609j mo12646b() {
        return this.f23643c;
    }

    @Override // p236n0.AbstractC10684h
    /* renamed from: c */
    public String mo12645c() {
        return this.f23641a;
    }

    @Override // p236n0.AbstractC10684h
    /* renamed from: d */
    public int mo12644d() {
        return this.f23642b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC10684h)) {
            return false;
        }
        AbstractC10684h hVar = (AbstractC10684h) obj;
        if (this.f23641a.equals(hVar.mo12645c()) && this.f23642b == hVar.mo12644d()) {
            AbstractC13609j jVar = this.f23643c;
            if (jVar == null) {
                if (hVar.mo12646b() == null) {
                    return true;
                }
            } else if (jVar.equals(hVar.mo12646b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = (((this.f23641a.hashCode() ^ 1000003) * 1000003) ^ this.f23642b) * 1000003;
        AbstractC13609j jVar = this.f23643c;
        if (jVar == null) {
            i = 0;
        } else {
            i = jVar.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "MimeInfo{mimeType=" + this.f23641a + ", profile=" + this.f23642b + ", compatibleCamcorderProfile=" + this.f23643c + "}";
    }

    private C10681g(String str, int i, AbstractC13609j jVar) {
        this.f23641a = str;
        this.f23642b = i;
        this.f23643c = jVar;
    }
}
