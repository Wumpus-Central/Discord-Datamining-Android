package p186k0;

import p186k0.C9699f;

/* renamed from: k0.i */
/* loaded from: classes.dex */
final class C9709i extends C9699f.AbstractC9705g {

    /* renamed from: a */
    private final int f21589a;

    /* renamed from: b */
    private final int f21590b;

    /* renamed from: c */
    private final int f21591c;

    /* renamed from: d */
    private final int f21592d;

    /* renamed from: k0.i$b */
    /* loaded from: classes.dex */
    static final class C9711b extends C9699f.AbstractC9705g.AbstractC9706a {

        /* renamed from: a */
        private Integer f21593a;

        /* renamed from: b */
        private Integer f21594b;

        /* renamed from: c */
        private Integer f21595c;

        /* renamed from: d */
        private Integer f21596d;

        @Override // p186k0.C9699f.AbstractC9705g.AbstractC9706a
        /* renamed from: a */
        C9699f.AbstractC9705g mo15548a() {
            String str = "";
            if (this.f21593a == null) {
                str = str + " audioSource";
            }
            if (this.f21594b == null) {
                str = str + " sampleRate";
            }
            if (this.f21595c == null) {
                str = str + " channelCount";
            }
            if (this.f21596d == null) {
                str = str + " audioFormat";
            }
            if (str.isEmpty()) {
                return new C9709i(this.f21593a.intValue(), this.f21594b.intValue(), this.f21595c.intValue(), this.f21596d.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p186k0.C9699f.AbstractC9705g.AbstractC9706a
        /* renamed from: c */
        public C9699f.AbstractC9705g.AbstractC9706a mo15547c(int i) {
            this.f21596d = Integer.valueOf(i);
            return this;
        }

        @Override // p186k0.C9699f.AbstractC9705g.AbstractC9706a
        /* renamed from: d */
        public C9699f.AbstractC9705g.AbstractC9706a mo15546d(int i) {
            this.f21593a = Integer.valueOf(i);
            return this;
        }

        @Override // p186k0.C9699f.AbstractC9705g.AbstractC9706a
        /* renamed from: e */
        public C9699f.AbstractC9705g.AbstractC9706a mo15545e(int i) {
            this.f21595c = Integer.valueOf(i);
            return this;
        }

        @Override // p186k0.C9699f.AbstractC9705g.AbstractC9706a
        /* renamed from: f */
        public C9699f.AbstractC9705g.AbstractC9706a mo15544f(int i) {
            this.f21594b = Integer.valueOf(i);
            return this;
        }
    }

    @Override // p186k0.C9699f.AbstractC9705g
    /* renamed from: b */
    public int mo15552b() {
        return this.f21592d;
    }

    @Override // p186k0.C9699f.AbstractC9705g
    /* renamed from: c */
    public int mo15551c() {
        return this.f21589a;
    }

    @Override // p186k0.C9699f.AbstractC9705g
    /* renamed from: d */
    public int mo15550d() {
        return this.f21591c;
    }

    @Override // p186k0.C9699f.AbstractC9705g
    /* renamed from: e */
    public int mo15549e() {
        return this.f21590b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9699f.AbstractC9705g)) {
            return false;
        }
        C9699f.AbstractC9705g gVar = (C9699f.AbstractC9705g) obj;
        if (this.f21589a == gVar.mo15551c() && this.f21590b == gVar.mo15549e() && this.f21591c == gVar.mo15550d() && this.f21592d == gVar.mo15552b()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f21589a ^ 1000003) * 1000003) ^ this.f21590b) * 1000003) ^ this.f21591c) * 1000003) ^ this.f21592d;
    }

    public String toString() {
        return "Settings{audioSource=" + this.f21589a + ", sampleRate=" + this.f21590b + ", channelCount=" + this.f21591c + ", audioFormat=" + this.f21592d + "}";
    }

    private C9709i(int i, int i2, int i3, int i4) {
        this.f21589a = i;
        this.f21590b = i2;
        this.f21591c = i3;
        this.f21592d = i4;
    }
}
