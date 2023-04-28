package p183jj;

import java.text.ParseException;
import java.util.Collections;
import java.util.Locale;
import net.time4j.C10779a0;
import net.time4j.C10892f0;
import net.time4j.C10906g0;
import net.time4j.C10917h0;
import net.time4j.C11045z0;
import net.time4j.p248tz.C11028p;
import p143hj.AbstractC8048d;
import p143hj.AbstractC8075n;
import p143hj.AbstractC8077o;
import p143hj.AbstractC8079p;
import p143hj.AbstractC8080q;
import p143hj.AbstractC8083t;
import p161ij.C8627a;
import p161ij.EnumC8635e;
import p161ij.EnumC8637g;
import p161ij.EnumC8641j;
import p183jj.C9637c;

/* renamed from: jj.l */
/* loaded from: classes8.dex */
public class C9661l {

    /* renamed from: a */
    private static final char f21437a;

    /* renamed from: b */
    private static final C9664c f21438b;

    /* renamed from: c */
    private static final C9664c f21439c;

    /* renamed from: d */
    private static final AbstractC8075n<AbstractC8077o> f21440d;

    /* renamed from: e */
    private static final AbstractC8075n<Character> f21441e;

    /* renamed from: f */
    public static final C9637c<C10892f0> f21442f;

    /* renamed from: g */
    public static final C9637c<C10892f0> f21443g;

    /* renamed from: h */
    public static final C9637c<C10892f0> f21444h;

    /* renamed from: i */
    public static final C9637c<C10892f0> f21445i;

    /* renamed from: j */
    public static final C9637c<C10892f0> f21446j;

    /* renamed from: k */
    public static final C9637c<C10892f0> f21447k;

    /* renamed from: l */
    public static final C9637c<C10892f0> f21448l;

    /* renamed from: m */
    public static final C9637c<C10892f0> f21449m;

    /* renamed from: n */
    public static final C9637c<C10906g0> f21450n;

    /* renamed from: o */
    public static final C9637c<C10906g0> f21451o;

    /* renamed from: p */
    public static final C9637c<C10917h0> f21452p;

    /* renamed from: q */
    public static final C9637c<C10917h0> f21453q;

    /* renamed from: r */
    public static final C9637c<C10779a0> f21454r;

    /* renamed from: s */
    public static final C9637c<C10779a0> f21455s;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: jj.l$a */
    /* loaded from: classes8.dex */
    public static class C9662a implements AbstractC9648e<C10892f0> {

        /* renamed from: a */
        final /* synthetic */ boolean f21456a;

        C9662a(boolean z) {
            this.f21456a = z;
        }

        /* renamed from: a */
        public <R> R mo15705b(C10892f0 f0Var, Appendable appendable, AbstractC8048d dVar, AbstractC8083t<AbstractC8077o, R> tVar) {
            C9637c<C10892f0> cVar;
            if (this.f21456a) {
                cVar = C9661l.f21443g;
            } else {
                cVar = C9661l.f21442f;
            }
            cVar.m15886K(f0Var, appendable, dVar);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: jj.l$b */
    /* loaded from: classes8.dex */
    public static class C9663b implements AbstractC9645d<C10892f0> {

        /* renamed from: a */
        final /* synthetic */ boolean f21457a;

        C9663b(boolean z) {
            this.f21457a = z;
        }

        /* renamed from: b */
        public C10892f0 mo15704a(CharSequence charSequence, C9675s sVar, AbstractC8048d dVar) {
            int length = charSequence.length();
            int f = sVar.m15664f();
            int i = length - f;
            int i2 = 0;
            for (int i3 = f + 1; i3 < length; i3++) {
                char charAt = charSequence.charAt(i3);
                if (charAt == '-') {
                    i2++;
                } else if (charAt == '/' || charAt == 'T') {
                    i = i3 - f;
                    break;
                } else if (charAt == 'W') {
                    if (this.f21457a) {
                        return C9661l.f21447k.m15892E(charSequence, sVar);
                    }
                    return C9661l.f21446j.m15892E(charSequence, sVar);
                }
            }
            if (!this.f21457a) {
                int i4 = i - 4;
                char charAt2 = charSequence.charAt(f);
                if (charAt2 == '+' || charAt2 == '-') {
                    i4 -= 2;
                }
                if (i4 == 3) {
                    return C9661l.f21444h.m15892E(charSequence, sVar);
                }
                return C9661l.f21442f.m15892E(charSequence, sVar);
            } else if (i2 == 1) {
                return C9661l.f21445i.m15892E(charSequence, sVar);
            } else {
                return C9661l.f21443g.m15892E(charSequence, sVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: jj.l$c */
    /* loaded from: classes8.dex */
    public static class C9664c implements AbstractC8075n<AbstractC8077o> {

        /* renamed from: k */
        private final AbstractC8079p<Integer> f21458k;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: jj.l$c$a */
        /* loaded from: classes8.dex */
        public class C9665a implements AbstractC8075n<AbstractC8077o> {

            /* renamed from: k */
            final /* synthetic */ C9664c f21459k;

            C9665a(C9664c cVar) {
                this.f21459k = cVar;
            }

            /* renamed from: a */
            public boolean test(AbstractC8077o oVar) {
                if (C9664c.this.test(oVar) || this.f21459k.test(oVar)) {
                    return true;
                }
                return false;
            }
        }

        C9664c(AbstractC8079p<Integer> pVar) {
            this.f21458k = pVar;
        }

        /* renamed from: a */
        AbstractC8075n<AbstractC8077o> m15702a(C9664c cVar) {
            return new C9665a(cVar);
        }

        /* renamed from: b */
        public boolean test(AbstractC8077o oVar) {
            return oVar.mo11370s(this.f21458k) > 0;
        }
    }

    /* renamed from: jj.l$d */
    /* loaded from: classes8.dex */
    private static class C9666d implements AbstractC8075n<Character> {
        private C9666d() {
        }

        /* synthetic */ C9666d(C9662a aVar) {
            this();
        }

        /* renamed from: a */
        public boolean test(Character ch2) {
            return ch2.charValue() == 'T';
        }
    }

    static {
        char c;
        if (Boolean.getBoolean("net.time4j.format.iso.decimal.dot")) {
            c = '.';
        } else {
            c = ',';
        }
        f21437a = c;
        C9664c cVar = new C9664c(C10906g0.f38916I);
        f21438b = cVar;
        C9664c cVar2 = new C9664c(C10906g0.f38920M);
        f21439c = cVar2;
        f21440d = cVar.m15702a(cVar2);
        f21441e = new C9666d(null);
        f21442f = m15718b(false);
        f21443g = m15718b(true);
        f21444h = m15712h(false);
        f21445i = m15712h(true);
        f21446j = m15707m(false);
        f21447k = m15707m(true);
        f21448l = m15717c(false);
        f21449m = m15717c(true);
        f21450n = m15709k(false);
        f21451o = m15709k(true);
        f21452p = m15708l(false);
        f21453q = m15708l(true);
        f21454r = m15713g(false);
        f21455s = m15713g(true);
    }

    /* renamed from: a */
    private static <T extends AbstractC8080q<T>> void m15719a(C9637c.C9640d<T> dVar, boolean z) {
        dVar.m15819b0(C8627a.f19063l, EnumC8641j.f19112k);
        dVar.m15823Z(C8627a.f19064m, '0');
        dVar.m15814g(C10906g0.f38913F, 2);
        dVar.m15825X();
        if (z) {
            dVar.m15809l(':');
        }
        dVar.m15814g(C10906g0.f38914G, 2);
        dVar.m15824Y(f21440d);
        if (z) {
            dVar.m15809l(':');
        }
        dVar.m15814g(C10906g0.f38916I, 2);
        dVar.m15824Y(f21439c);
        if (f21437a == ',') {
            dVar.m15808m(',', '.');
        } else {
            dVar.m15808m('.', ',');
        }
        dVar.m15812i(C10906g0.f38920M, 0, 9, false);
        for (int i = 0; i < 5; i++) {
            dVar.m15837L();
        }
    }

    /* renamed from: b */
    private static C9637c<C10892f0> m15718b(boolean z) {
        C9637c.C9640d k = C9637c.m15883N(C10892f0.class, Locale.ROOT).m15819b0(C8627a.f19063l, EnumC8641j.f19112k).m15823Z(C8627a.f19064m, '0').m15810k(C10892f0.f24174z, 4, 9, EnumC9684x.SHOW_WHEN_BIG_NUMBER);
        if (z) {
            k.m15809l('-');
        }
        k.m15814g(C10892f0.f38899D, 2);
        if (z) {
            k.m15809l('-');
        }
        return k.m15814g(C10892f0.f38900E, 2).m15837L().m15837L().m15843F().m15878S(EnumC8637g.STRICT);
    }

    /* renamed from: c */
    private static C9637c<C10892f0> m15717c(boolean z) {
        C9637c.C9640d N = C9637c.m15883N(C10892f0.class, Locale.ROOT);
        N.m15817d(C10892f0.f24173y, m15715e(z), m15716d(z));
        return N.m15843F().m15878S(EnumC8637g.STRICT);
    }

    /* renamed from: d */
    private static AbstractC9645d<C10892f0> m15716d(boolean z) {
        return new C9663b(z);
    }

    /* renamed from: e */
    private static AbstractC9648e<C10892f0> m15715e(boolean z) {
        return new C9662a(z);
    }

    /* renamed from: f */
    private static C9637c<C10779a0> m15714f(EnumC8635e eVar, boolean z) {
        C9637c.C9640d N = C9637c.m15883N(C10779a0.class, Locale.ROOT);
        N.m15817d(C10892f0.f24173y, m15715e(z), m15716d(z));
        N.m15809l('T');
        m15719a(N, z);
        N.m15846C(eVar, z, Collections.singletonList("Z"));
        return N.m15843F();
    }

    /* renamed from: g */
    private static C9637c<C10779a0> m15713g(boolean z) {
        C9637c.C9640d N = C9637c.m15883N(C10779a0.class, Locale.ROOT);
        N.m15817d(C10779a0.m12326W().m20712K(), m15714f(EnumC8635e.MEDIUM, z), m15714f(EnumC8635e.SHORT, z));
        return N.m15843F().m15878S(EnumC8637g.STRICT).m15875V(C11028p.f24516u);
    }

    /* renamed from: h */
    private static C9637c<C10892f0> m15712h(boolean z) {
        C9637c.C9640d k = C9637c.m15883N(C10892f0.class, Locale.ROOT).m15819b0(C8627a.f19063l, EnumC8641j.f19112k).m15823Z(C8627a.f19064m, '0').m15810k(C10892f0.f24174z, 4, 9, EnumC9684x.SHOW_WHEN_BIG_NUMBER);
        if (z) {
            k.m15809l('-');
        }
        return k.m15814g(C10892f0.f38902G, 3).m15837L().m15837L().m15843F().m15878S(EnumC8637g.STRICT);
    }

    /* renamed from: i */
    public static C10892f0 m15711i(CharSequence charSequence) {
        C9675s sVar = new C9675s();
        C10892f0 j = m15710j(charSequence, sVar);
        if (j == null || sVar.m15661i()) {
            throw new ParseException(sVar.m15666d(), sVar.m15667c());
        } else if (sVar.m15664f() >= charSequence.length()) {
            return j;
        } else {
            throw new ParseException("Trailing characters found: " + ((Object) charSequence), sVar.m15664f());
        }
    }

    /* renamed from: j */
    public static C10892f0 m15710j(CharSequence charSequence, C9675s sVar) {
        C9637c<C10892f0> cVar;
        C9637c<C10892f0> cVar2;
        int length = charSequence.length();
        int f = sVar.m15664f();
        int i = length - f;
        if (i < 7) {
            sVar.m15659k(length, "Too short to be compatible with ISO-8601: " + ((Object) charSequence.subSequence(f, length)));
            return null;
        }
        int i2 = 0;
        for (int i3 = f + 1; i3 < length; i3++) {
            char charAt = charSequence.charAt(i3);
            if (charAt == '-') {
                i2++;
            } else if (charAt == '/' || charAt == 'T') {
                i = i3 - f;
                break;
            } else if (charAt == 'W') {
                if (i2 > 0) {
                    cVar2 = f21447k;
                } else {
                    cVar2 = f21446j;
                }
                return cVar2.m15892E(charSequence, sVar);
            }
        }
        if (i2 == 0) {
            int i4 = i - 4;
            char charAt2 = charSequence.charAt(f);
            if (charAt2 == '+' || charAt2 == '-') {
                i4 -= 2;
            }
            if (i4 == 3) {
                cVar = f21444h;
            } else {
                cVar = f21442f;
            }
            return cVar.m15892E(charSequence, sVar);
        } else if (i2 == 1) {
            return f21445i.m15892E(charSequence, sVar);
        } else {
            return f21443g.m15892E(charSequence, sVar);
        }
    }

    /* renamed from: k */
    private static C9637c<C10906g0> m15709k(boolean z) {
        C9637c.C9640d N = C9637c.m15883N(C10906g0.class, Locale.ROOT);
        N.m15826W(f21441e, 1);
        m15719a(N, z);
        return N.m15843F().m15878S(EnumC8637g.STRICT);
    }

    /* renamed from: l */
    private static C9637c<C10917h0> m15708l(boolean z) {
        C9637c.C9640d N = C9637c.m15883N(C10917h0.class, Locale.ROOT);
        N.m15817d(C10892f0.f24173y, m15715e(z), m15716d(z));
        N.m15809l('T');
        m15719a(N, z);
        return N.m15843F().m15878S(EnumC8637g.STRICT);
    }

    /* renamed from: m */
    private static C9637c<C10892f0> m15707m(boolean z) {
        C9637c.C9640d k = C9637c.m15883N(C10892f0.class, Locale.ROOT).m15819b0(C8627a.f19063l, EnumC8641j.f19112k).m15823Z(C8627a.f19064m, '0').m15810k(C10892f0.f38896A, 4, 9, EnumC9684x.SHOW_WHEN_BIG_NUMBER);
        if (z) {
            k.m15809l('-');
        }
        k.m15809l('W');
        k.m15814g(C11045z0.f24547w.m11125n(), 2);
        if (z) {
            k.m15809l('-');
        }
        return k.m15813h(C10892f0.f38901F, 1).m15837L().m15837L().m15843F().m15878S(EnumC8637g.STRICT);
    }
}
