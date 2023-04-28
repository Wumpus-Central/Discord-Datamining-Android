package p159ih;

import java.io.IOException;
import ph.AbstractC11686a;
import ph.AbstractC11687b;
import ph.AbstractC11691d;
import ph.AbstractC11702i;
import ph.AbstractC11726r;
import ph.AbstractC11727s;
import ph.C11694e;
import ph.C11695f;
import ph.C11697g;
import ph.C11710j;
import ph.C11713k;

/* renamed from: ih.v */
/* loaded from: classes8.dex */
public final class C8614v extends AbstractC11702i implements AbstractC11726r {

    /* renamed from: v */
    private static final C8614v f19004v;

    /* renamed from: w */
    public static AbstractC11727s<C8614v> f19005w = new C8615a();

    /* renamed from: l */
    private final AbstractC11691d f19006l;

    /* renamed from: m */
    private int f19007m;

    /* renamed from: n */
    private int f19008n;

    /* renamed from: o */
    private int f19009o;

    /* renamed from: p */
    private EnumC8617c f19010p;

    /* renamed from: q */
    private int f19011q;

    /* renamed from: r */
    private int f19012r;

    /* renamed from: s */
    private EnumC8619d f19013s;

    /* renamed from: t */
    private byte f19014t;

    /* renamed from: u */
    private int f19015u;

    /* renamed from: ih.v$a */
    /* loaded from: classes8.dex */
    static class C8615a extends AbstractC11687b<C8614v> {
        C8615a() {
        }

        /* renamed from: m */
        public C8614v mo8771d(C11694e eVar, C11697g gVar) {
            return new C8614v(eVar, gVar);
        }
    }

    /* renamed from: ih.v$b */
    /* loaded from: classes8.dex */
    public static final class C8616b extends AbstractC11702i.AbstractC11704b<C8614v, C8616b> implements AbstractC11726r {

        /* renamed from: l */
        private int f19016l;

        /* renamed from: m */
        private int f19017m;

        /* renamed from: n */
        private int f19018n;

        /* renamed from: p */
        private int f19020p;

        /* renamed from: q */
        private int f19021q;

        /* renamed from: o */
        private EnumC8617c f19019o = EnumC8617c.ERROR;

        /* renamed from: r */
        private EnumC8619d f19022r = EnumC8619d.LANGUAGE_VERSION;

        private C8616b() {
            m18515w();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: v */
        public static C8616b m18516v() {
            return new C8616b();
        }

        /* renamed from: w */
        private void m18515w() {
        }

        /* renamed from: A */
        public C8616b m18525A(EnumC8617c cVar) {
            cVar.getClass();
            this.f19016l |= 4;
            this.f19019o = cVar;
            return this;
        }

        /* renamed from: B */
        public C8616b m18524B(int i) {
            this.f19016l |= 16;
            this.f19021q = i;
            return this;
        }

        /* renamed from: C */
        public C8616b m18523C(int i) {
            this.f19016l |= 1;
            this.f19017m = i;
            return this;
        }

        /* renamed from: D */
        public C8616b m18522D(int i) {
            this.f19016l |= 2;
            this.f19018n = i;
            return this;
        }

        /* renamed from: E */
        public C8616b m18521E(EnumC8619d dVar) {
            dVar.getClass();
            this.f19016l |= 32;
            this.f19022r = dVar;
            return this;
        }

        /* renamed from: s */
        public C8614v build() {
            C8614v t = m18518t();
            if (t.mo8775j()) {
                return t;
            }
            throw AbstractC11686a.AbstractC0372a.m9031l(t);
        }

        /* renamed from: t */
        public C8614v m18518t() {
            C8614v vVar = new C8614v(this);
            int i = this.f19016l;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            vVar.f19008n = this.f19017m;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            vVar.f19009o = this.f19018n;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            vVar.f19010p = this.f19019o;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            vVar.f19011q = this.f19020p;
            if ((i & 16) == 16) {
                i2 |= 16;
            }
            vVar.f19012r = this.f19021q;
            if ((i & 32) == 32) {
                i2 |= 32;
            }
            vVar.f19013s = this.f19022r;
            vVar.f19007m = i2;
            return vVar;
        }

        /* renamed from: u */
        public C8616b mo8846m() {
            return m18516v().mo8844o(m18518t());
        }

        /* renamed from: x */
        public C8616b mo8844o(C8614v vVar) {
            if (vVar == C8614v.m18552A()) {
                return this;
            }
            if (vVar.m18542K()) {
                m18523C(vVar.m18548E());
            }
            if (vVar.m18541L()) {
                m18522D(vVar.m18547F());
            }
            if (vVar.m18544I()) {
                m18525A(vVar.m18550C());
            }
            if (vVar.m18545H()) {
                m18512z(vVar.m18551B());
            }
            if (vVar.m18543J()) {
                m18524B(vVar.m18549D());
            }
            if (vVar.m18540M()) {
                m18521E(vVar.m18546G());
            }
            m8843q(m8845n().m9017b(vVar.f19006l));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
        /* renamed from: y */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public p159ih.C8614v.C8616b mo9032k(ph.C11694e r3, ph.C11697g r4) {
            /*
                r2 = this;
                r0 = 0
                ph.s<ih.v> r1 = p159ih.C8614v.f19005w     // Catch: all -> 0x000f, k -> 0x0011
                java.lang.Object r3 = r1.mo8771d(r3, r4)     // Catch: all -> 0x000f, k -> 0x0011
                ih.v r3 = (p159ih.C8614v) r3     // Catch: all -> 0x000f, k -> 0x0011
                if (r3 == 0) goto L_0x000e
                r2.mo8844o(r3)
            L_0x000e:
                return r2
            L_0x000f:
                r3 = move-exception
                goto L_0x001b
            L_0x0011:
                r3 = move-exception
                ph.q r4 = r3.m8810a()     // Catch: all -> 0x000f
                ih.v r4 = (p159ih.C8614v) r4     // Catch: all -> 0x000f
                throw r3     // Catch: all -> 0x0019
            L_0x0019:
                r3 = move-exception
                r0 = r4
            L_0x001b:
                if (r0 == 0) goto L_0x0020
                r2.mo8844o(r0)
            L_0x0020:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p159ih.C8614v.C8616b.mo9032k(ph.e, ph.g):ih.v$b");
        }

        /* renamed from: z */
        public C8616b m18512z(int i) {
            this.f19016l |= 8;
            this.f19020p = i;
            return this;
        }
    }

    /* renamed from: ih.v$c */
    /* loaded from: classes8.dex */
    public enum EnumC8617c implements C11710j.AbstractC11711a {
        WARNING(0, 0),
        ERROR(1, 1),
        HIDDEN(2, 2);
        

        /* renamed from: o */
        private static C11710j.AbstractC11712b<EnumC8617c> f19026o = new C8618a();

        /* renamed from: k */
        private final int f19028k;

        /* renamed from: ih.v$c$a */
        /* loaded from: classes8.dex */
        static class C8618a implements C11710j.AbstractC11712b<EnumC8617c> {
            C8618a() {
            }

            /* renamed from: b */
            public EnumC8617c mo8811a(int i) {
                return EnumC8617c.m18511a(i);
            }
        }

        EnumC8617c(int i, int i2) {
            this.f19028k = i2;
        }

        /* renamed from: a */
        public static EnumC8617c m18511a(int i) {
            if (i == 0) {
                return WARNING;
            }
            if (i == 1) {
                return ERROR;
            }
            if (i != 2) {
                return null;
            }
            return HIDDEN;
        }

        @Override // ph.C11710j.AbstractC11711a
        public final int getNumber() {
            return this.f19028k;
        }
    }

    /* renamed from: ih.v$d */
    /* loaded from: classes8.dex */
    public enum EnumC8619d implements C11710j.AbstractC11711a {
        LANGUAGE_VERSION(0, 0),
        COMPILER_VERSION(1, 1),
        API_VERSION(2, 2);
        

        /* renamed from: o */
        private static C11710j.AbstractC11712b<EnumC8619d> f19032o = new C8620a();

        /* renamed from: k */
        private final int f19034k;

        /* renamed from: ih.v$d$a */
        /* loaded from: classes8.dex */
        static class C8620a implements C11710j.AbstractC11712b<EnumC8619d> {
            C8620a() {
            }

            /* renamed from: b */
            public EnumC8619d mo8811a(int i) {
                return EnumC8619d.m18509a(i);
            }
        }

        EnumC8619d(int i, int i2) {
            this.f19034k = i2;
        }

        /* renamed from: a */
        public static EnumC8619d m18509a(int i) {
            if (i == 0) {
                return LANGUAGE_VERSION;
            }
            if (i == 1) {
                return COMPILER_VERSION;
            }
            if (i != 2) {
                return null;
            }
            return API_VERSION;
        }

        @Override // ph.C11710j.AbstractC11711a
        public final int getNumber() {
            return this.f19034k;
        }
    }

    static {
        C8614v vVar = new C8614v(true);
        f19004v = vVar;
        vVar.m18539N();
    }

    /* renamed from: A */
    public static C8614v m18552A() {
        return f19004v;
    }

    /* renamed from: N */
    private void m18539N() {
        this.f19008n = 0;
        this.f19009o = 0;
        this.f19010p = EnumC8617c.ERROR;
        this.f19011q = 0;
        this.f19012r = 0;
        this.f19013s = EnumC8619d.LANGUAGE_VERSION;
    }

    /* renamed from: O */
    public static C8616b m18538O() {
        return C8616b.m18516v();
    }

    /* renamed from: P */
    public static C8616b m18537P(C8614v vVar) {
        return m18538O().mo8844o(vVar);
    }

    /* renamed from: B */
    public int m18551B() {
        return this.f19011q;
    }

    /* renamed from: C */
    public EnumC8617c m18550C() {
        return this.f19010p;
    }

    /* renamed from: D */
    public int m18549D() {
        return this.f19012r;
    }

    /* renamed from: E */
    public int m18548E() {
        return this.f19008n;
    }

    /* renamed from: F */
    public int m18547F() {
        return this.f19009o;
    }

    /* renamed from: G */
    public EnumC8619d m18546G() {
        return this.f19013s;
    }

    /* renamed from: H */
    public boolean m18545H() {
        return (this.f19007m & 8) == 8;
    }

    /* renamed from: I */
    public boolean m18544I() {
        return (this.f19007m & 4) == 4;
    }

    /* renamed from: J */
    public boolean m18543J() {
        return (this.f19007m & 16) == 16;
    }

    /* renamed from: K */
    public boolean m18542K() {
        return (this.f19007m & 1) == 1;
    }

    /* renamed from: L */
    public boolean m18541L() {
        return (this.f19007m & 2) == 2;
    }

    /* renamed from: M */
    public boolean m18540M() {
        return (this.f19007m & 32) == 32;
    }

    /* renamed from: Q */
    public C8616b mo8779e() {
        return m18538O();
    }

    /* renamed from: R */
    public C8616b mo8782a() {
        return m18537P(this);
    }

    @Override // ph.AbstractC11724q
    /* renamed from: c */
    public int mo8781c() {
        int i = this.f19015u;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if ((this.f19007m & 1) == 1) {
            i2 = 0 + C11695f.m8906o(1, this.f19008n);
        }
        if ((this.f19007m & 2) == 2) {
            i2 += C11695f.m8906o(2, this.f19009o);
        }
        if ((this.f19007m & 4) == 4) {
            i2 += C11695f.m8920h(3, this.f19010p.getNumber());
        }
        if ((this.f19007m & 8) == 8) {
            i2 += C11695f.m8906o(4, this.f19011q);
        }
        if ((this.f19007m & 16) == 16) {
            i2 += C11695f.m8906o(5, this.f19012r);
        }
        if ((this.f19007m & 32) == 32) {
            i2 += C11695f.m8920h(6, this.f19013s.getNumber());
        }
        int size = i2 + this.f19006l.size();
        this.f19015u = size;
        return size;
    }

    @Override // ph.AbstractC11724q
    /* renamed from: d */
    public void mo8780d(C11695f fVar) {
        mo8781c();
        if ((this.f19007m & 1) == 1) {
            fVar.m8933a0(1, this.f19008n);
        }
        if ((this.f19007m & 2) == 2) {
            fVar.m8933a0(2, this.f19009o);
        }
        if ((this.f19007m & 4) == 4) {
            fVar.m8942S(3, this.f19010p.getNumber());
        }
        if ((this.f19007m & 8) == 8) {
            fVar.m8933a0(4, this.f19011q);
        }
        if ((this.f19007m & 16) == 16) {
            fVar.m8933a0(5, this.f19012r);
        }
        if ((this.f19007m & 32) == 32) {
            fVar.m8942S(6, this.f19013s.getNumber());
        }
        fVar.m8917i0(this.f19006l);
    }

    @Override // ph.AbstractC11702i, ph.AbstractC11724q
    /* renamed from: h */
    public AbstractC11727s<C8614v> mo8778h() {
        return f19005w;
    }

    @Override // ph.AbstractC11726r
    /* renamed from: j */
    public final boolean mo8775j() {
        byte b = this.f19014t;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f19014t = (byte) 1;
        return true;
    }

    private C8614v(AbstractC11702i.AbstractC11704b bVar) {
        super(bVar);
        this.f19014t = (byte) -1;
        this.f19015u = -1;
        this.f19006l = bVar.m8845n();
    }

    private C8614v(boolean z) {
        this.f19014t = (byte) -1;
        this.f19015u = -1;
        this.f19006l = AbstractC11691d.f26108k;
    }

    private C8614v(C11694e eVar, C11697g gVar) {
        this.f19014t = (byte) -1;
        this.f19015u = -1;
        m18539N();
        AbstractC11691d.C11693b w = AbstractC11691d.m9011w();
        C11695f J = C11695f.m8951J(w, 1);
        boolean z = false;
        while (!z) {
            try {
                try {
                    try {
                        int K = eVar.m8996K();
                        if (K != 0) {
                            if (K == 8) {
                                this.f19007m |= 1;
                                this.f19008n = eVar.m8968s();
                            } else if (K == 16) {
                                this.f19007m |= 2;
                                this.f19009o = eVar.m8968s();
                            } else if (K == 24) {
                                int n = eVar.m8973n();
                                EnumC8617c a = EnumC8617c.m18511a(n);
                                if (a == null) {
                                    J.m8905o0(K);
                                    J.m8905o0(n);
                                } else {
                                    this.f19007m |= 4;
                                    this.f19010p = a;
                                }
                            } else if (K == 32) {
                                this.f19007m |= 8;
                                this.f19011q = eVar.m8968s();
                            } else if (K == 40) {
                                this.f19007m |= 16;
                                this.f19012r = eVar.m8968s();
                            } else if (K == 48) {
                                int n2 = eVar.m8973n();
                                EnumC8619d a2 = EnumC8619d.m18509a(n2);
                                if (a2 == null) {
                                    J.m8905o0(K);
                                    J.m8905o0(n2);
                                } else {
                                    this.f19007m |= 32;
                                    this.f19013s = a2;
                                }
                            } else if (!mo8836q(eVar, J, gVar, K)) {
                            }
                        }
                        z = true;
                    } catch (IOException e) {
                        throw new C11713k(e.getMessage()).m8802i(this);
                    }
                } catch (C11713k e2) {
                    throw e2.m8802i(this);
                }
            } catch (Throwable th2) {
                try {
                    J.m8952I();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f19006l = w.m9007i();
                    throw th3;
                }
                this.f19006l = w.m9007i();
                mo8837n();
                throw th2;
            }
        }
        try {
            J.m8952I();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f19006l = w.m9007i();
            throw th4;
        }
        this.f19006l = w.m9007i();
        mo8837n();
    }
}
