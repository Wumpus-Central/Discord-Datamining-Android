package p183jj;

import com.facebook.react.uimanager.ViewDefaults;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import net.time4j.C10779a0;
import net.time4j.C10892f0;
import net.time4j.C10906g0;
import net.time4j.C10961k;
import net.time4j.C10983r;
import net.time4j.base.AbstractC10817f;
import net.time4j.history.C10929d;
import net.time4j.p248tz.AbstractC11001k;
import net.time4j.p248tz.AbstractC11002l;
import net.time4j.p248tz.AbstractC11027o;
import net.time4j.p248tz.C11028p;
import net.time4j.p248tz.EnumC10996f;
import net.time4j.p248tz.EnumC10997g;
import p143hj.AbstractC8046c;
import p143hj.AbstractC8048d;
import p143hj.AbstractC8053f0;
import p143hj.AbstractC8070l;
import p143hj.AbstractC8073m;
import p143hj.AbstractC8075n;
import p143hj.AbstractC8077o;
import p143hj.AbstractC8078o0;
import p143hj.AbstractC8079p;
import p143hj.AbstractC8080q;
import p143hj.AbstractC8082s;
import p143hj.AbstractC8083t;
import p143hj.AbstractC8084u;
import p143hj.AbstractC8090y;
import p143hj.C8059h0;
import p143hj.C8066j;
import p143hj.C8081r;
import p143hj.C8087x;
import p143hj.EnumC8045b0;
import p143hj.EnumC8076n0;
import p161ij.AbstractC8669t;
import p161ij.C8627a;
import p161ij.EnumC8635e;
import p161ij.EnumC8637g;
import p161ij.EnumC8671v;
import p163j$.util.Spliterator;
import p234mj.C10668a;

/* renamed from: jj.c */
/* loaded from: classes8.dex */
public final class C9637c<T> implements AbstractC9648e<T>, AbstractC9645d<T> {

    /* renamed from: r */
    public static final C9637c<C10779a0> f21335r = m15885L();

    /* renamed from: a */
    private final C8087x<T> f21336a;

    /* renamed from: b */
    private final C9642e<?> f21337b;

    /* renamed from: c */
    private final C9634b f21338c;

    /* renamed from: d */
    private final List<C9658i> f21339d;

    /* renamed from: e */
    private final Map<AbstractC8079p<?>, Object> f21340e;

    /* renamed from: f */
    private final C9659j f21341f;

    /* renamed from: g */
    private final boolean f21342g;

    /* renamed from: h */
    private final boolean f21343h;

    /* renamed from: i */
    private final boolean f21344i;

    /* renamed from: j */
    private final int f21345j;

    /* renamed from: k */
    private final EnumC8637g f21346k;

    /* renamed from: l */
    private final boolean f21347l;

    /* renamed from: m */
    private final boolean f21348m;

    /* renamed from: n */
    private final boolean f21349n;

    /* renamed from: o */
    private final C8087x<?> f21350o;

    /* renamed from: p */
    private final int f21351p;

    /* renamed from: q */
    private final boolean f21352q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: jj.c$a */
    /* loaded from: classes8.dex */
    public static class C9638a implements AbstractC9648e<AbstractC11001k> {
        C9638a() {
        }

        /* renamed from: a */
        public <R> R mo15705b(AbstractC11001k kVar, Appendable appendable, AbstractC8048d dVar, AbstractC8083t<AbstractC8077o, R> tVar) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: jj.c$b */
    /* loaded from: classes8.dex */
    public static class C9639b implements AbstractC9645d<AbstractC11001k> {

        /* renamed from: a */
        final /* synthetic */ Map f21353a;

        C9639b(Map map) {
            this.f21353a = map;
        }

        /* renamed from: b */
        public AbstractC11001k mo15704a(CharSequence charSequence, C9675s sVar, AbstractC8048d dVar) {
            int f = sVar.m15664f();
            int i = f + 3;
            if (i > charSequence.length()) {
                return null;
            }
            AbstractC11001k kVar = (AbstractC11001k) this.f21353a.get(charSequence.subSequence(f, i).toString());
            if (kVar != null) {
                sVar.m15658l(i);
                return kVar;
            }
            sVar.m15659k(f, "No time zone information found.");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: jj.c$c */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class C0293c {

        /* renamed from: a */
        static final /* synthetic */ int[] f21354a;

        static {
            int[] iArr = new int[EnumC9682w.values().length];
            f21354a = iArr;
            try {
                iArr[EnumC9682w.CLDR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21354a[EnumC9682w.CLDR_24.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21354a[EnumC9682w.CLDR_DATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21354a[EnumC9682w.SIMPLE_DATE_FORMAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: jj.c$d */
    /* loaded from: classes8.dex */
    public static final class C9640d<T> {

        /* renamed from: n */
        private static final AbstractC8046c<C10961k> f21355n = C8627a.m18482e("CUSTOM_DAY_PERIOD", C10961k.class);

        /* renamed from: a */
        private final C8087x<T> f21356a;

        /* renamed from: b */
        private final C8087x<?> f21357b;

        /* renamed from: c */
        private final Locale f21358c;

        /* renamed from: d */
        private List<C9658i> f21359d;

        /* renamed from: e */
        private LinkedList<C9634b> f21360e;

        /* renamed from: f */
        private int f21361f;

        /* renamed from: g */
        private int f21362g;

        /* renamed from: h */
        private int f21363h;

        /* renamed from: i */
        private String f21364i;

        /* renamed from: j */
        private C10961k f21365j;

        /* renamed from: k */
        private Map<AbstractC8079p<?>, Object> f21366k;

        /* renamed from: l */
        private C8087x<?> f21367l;

        /* renamed from: m */
        private int f21368m;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: jj.c$d$a */
        /* loaded from: classes8.dex */
        public class C9641a implements AbstractC8075n<AbstractC8077o> {

            /* renamed from: k */
            final /* synthetic */ AbstractC8075n f21369k;

            /* renamed from: l */
            final /* synthetic */ AbstractC8075n f21370l;

            C9641a(AbstractC8075n nVar, AbstractC8075n nVar2) {
                this.f21369k = nVar;
                this.f21370l = nVar2;
            }

            /* renamed from: a */
            public boolean test(AbstractC8077o oVar) {
                if (!this.f21369k.test(oVar) || !this.f21370l.test(oVar)) {
                    return false;
                }
                return true;
            }
        }

        /* synthetic */ C9640d(C8087x xVar, Locale locale, C9638a aVar) {
            this(xVar, locale);
        }

        /* renamed from: H */
        private C9658i m15841H(AbstractC8079p<?> pVar) {
            C9658i iVar;
            List<C9658i> list;
            if (this.f21359d.isEmpty()) {
                iVar = null;
            } else {
                iVar = this.f21359d.get(list.size() - 1);
            }
            if (iVar == null) {
                return null;
            }
            if (!iVar.m15744g() || iVar.m15742i()) {
                return iVar;
            }
            throw new IllegalStateException(pVar.name() + " can't be inserted after an element with decimal digits.");
        }

        /* renamed from: I */
        private static void m15840I(AbstractC8046c<?> cVar) {
            if (cVar.name().charAt(0) == '_') {
                throw new IllegalArgumentException("Internal attribute not allowed: " + cVar.name());
            }
        }

        /* renamed from: J */
        private void m15839J(AbstractC8079p<?> pVar) {
            C8087x<?> j = C9637c.m15867j(this.f21356a, this.f21357b, pVar);
            int s = C9637c.m15858s(j, this.f21356a, this.f21357b);
            if (s >= this.f21368m) {
                this.f21367l = j;
                this.f21368m = s;
            }
        }

        /* renamed from: K */
        private void m15838K() {
            if (!m15831R(this.f21356a)) {
                throw new IllegalStateException("Timezone names in specific non-location format can only be reliably combined with instant-like types, for example \"Moment\".");
            }
        }

        /* renamed from: M */
        private void m15836M() {
            for (int size = this.f21359d.size() - 1; size >= 0; size--) {
                C9658i iVar = this.f21359d.get(size);
                if (iVar.m15742i()) {
                    return;
                }
                if (iVar.m15744g()) {
                    throw new IllegalArgumentException("Cannot define more than one element with decimal digits.");
                }
            }
        }

        /* renamed from: N */
        private void m15835N(boolean z, boolean z2) {
            m15836M();
            if (!z && !z2 && this.f21362g != -1) {
                throw new IllegalArgumentException("Cannot add fractional element with variable width after another numerical element with variable width.");
            }
        }

        /* renamed from: O */
        private AbstractC8669t<?> m15834O(boolean z, C10961k kVar) {
            C9634b bVar;
            C8627a a = new C8627a.C8628b(m15833P()).m18480a();
            C9634b bVar2 = a;
            if (kVar != null) {
                if (this.f21360e.isEmpty()) {
                    bVar = new C9634b(a, this.f21358c);
                } else {
                    bVar = this.f21360e.getLast();
                }
                bVar2 = bVar.m15906m(f21355n, kVar);
            }
            for (AbstractC8082s sVar : C10906g0.m11743l0().m20646v()) {
                for (AbstractC8079p<?> pVar : sVar.mo10715b(this.f21358c, bVar2)) {
                    if (z && pVar.mo11060a() == 'b' && m15830S(pVar)) {
                        return (AbstractC8669t) C9637c.m15869h(pVar);
                    }
                    if (!z && pVar.mo11060a() == 'B' && m15830S(pVar)) {
                        return (AbstractC8669t) C9637c.m15869h(pVar);
                    }
                }
            }
            throw new IllegalStateException("Day periods are not supported: " + m15833P().m20648q());
        }

        /* renamed from: Q */
        private static int m15832Q(C9634b bVar) {
            if (bVar == null) {
                return 0;
            }
            return bVar.m15912g();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: R */
        public static boolean m15831R(C8087x<?> xVar) {
            while (!AbstractC10817f.class.isAssignableFrom(xVar.m20648q())) {
                xVar = xVar.mo11619c();
                if (xVar == null) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: S */
        private boolean m15830S(AbstractC8079p<?> pVar) {
            if (!pVar.name().endsWith("_DAY_PERIOD")) {
                return false;
            }
            if (this.f21357b != null || this.f21356a.mo20656D(pVar)) {
                return true;
            }
            C8087x<T> xVar = this.f21356a;
            do {
                xVar = (C8087x<T>) xVar.mo11619c();
                if (xVar == null) {
                    return false;
                }
            } while (!xVar.mo20656D(pVar));
            return true;
        }

        /* renamed from: T */
        private static boolean m15829T(char c) {
            return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
        }

        /* renamed from: V */
        private void m15827V() {
            this.f21363h = 0;
        }

        /* renamed from: o */
        private void m15806o(StringBuilder sb2) {
            if (sb2.length() > 0) {
                m15807n(sb2.toString());
                sb2.setLength(0);
            }
        }

        /* renamed from: s */
        private <V> C9640d<T> m15802s(AbstractC8079p<V> pVar, boolean z, int i, int i2, EnumC9684x xVar) {
            return m15801t(pVar, z, i, i2, xVar, false);
        }

        /* renamed from: t */
        private <V> C9640d<T> m15801t(AbstractC8079p<V> pVar, boolean z, int i, int i2, EnumC9684x xVar, boolean z2) {
            m15839J(pVar);
            C9658i H = m15841H(pVar);
            C9673r rVar = new C9673r(pVar, z, i, i2, xVar, z2);
            if (z) {
                int i3 = this.f21362g;
                if (i3 == -1) {
                    m15798w(rVar);
                } else {
                    C9658i iVar = this.f21359d.get(i3);
                    m15798w(rVar);
                    List<C9658i> list = this.f21359d;
                    if (iVar.m15745f() == list.get(list.size() - 1).m15745f()) {
                        this.f21362g = i3;
                        this.f21359d.set(i3, iVar.m15731t(i));
                    }
                }
            } else if (H == null || !H.m15741j() || H.m15742i()) {
                m15798w(rVar);
                this.f21362g = this.f21359d.size() - 1;
            } else {
                throw new IllegalStateException("Numerical element with variable width can't be inserted after another numerical element. Consider \"addFixedXXX()\" instead.");
            }
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: w */
        public void m15798w(AbstractC9657h<?> hVar) {
            int i;
            int i2;
            C9634b bVar;
            this.f21362g = -1;
            if (!this.f21360e.isEmpty()) {
                bVar = this.f21360e.getLast();
                i2 = bVar.m15912g();
                i = bVar.m15910i();
            } else {
                bVar = null;
                i2 = 0;
                i = 0;
            }
            C9658i iVar = new C9658i(hVar, i2, i, bVar);
            int i3 = this.f21363h;
            if (i3 > 0) {
                iVar = iVar.m15737n(i3, 0);
                this.f21363h = 0;
            }
            this.f21359d.add(iVar);
        }

        /* renamed from: A */
        public C9640d<T> m15848A(AbstractC8669t<?> tVar) {
            m15839J(tVar);
            m15798w(C9633a0.m15917a(tVar));
            return this;
        }

        /* renamed from: B */
        public C9640d<T> m15847B() {
            if (m15831R(this.f21356a)) {
                m15798w(EnumC9644c0.INSTANCE);
                return this;
            }
            throw new IllegalStateException("Only unix timestamps can have a timezone id.");
        }

        /* renamed from: C */
        public C9640d<T> m15846C(EnumC8635e eVar, boolean z, List<String> list) {
            m15798w(new C9649e0(eVar, z, list));
            return this;
        }

        /* renamed from: D */
        public C9640d<T> m15845D(AbstractC8079p<Integer> pVar) {
            m15839J(pVar);
            m15841H(pVar);
            C9652f0 f0Var = new C9652f0(pVar);
            int i = this.f21362g;
            if (i == -1) {
                m15798w(f0Var);
                this.f21362g = this.f21359d.size() - 1;
            } else {
                C9658i iVar = this.f21359d.get(i);
                m15819b0(C8627a.f19057f, EnumC8637g.STRICT);
                m15798w(f0Var);
                m15837L();
                List<C9658i> list = this.f21359d;
                if (iVar.m15745f() == list.get(list.size() - 1).m15745f()) {
                    this.f21362g = i;
                    this.f21359d.set(i, iVar.m15731t(2));
                }
            }
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: E */
        public C9640d<T> m15844E(AbstractC8079p<Integer> pVar, int i, boolean z) {
            C9658i iVar;
            if (this.f21359d.isEmpty()) {
                iVar = null;
            } else {
                List<C9658i> list = this.f21359d;
                iVar = list.get(list.size() - 1);
            }
            if (iVar == null || iVar.m15742i() || !iVar.m15741j() || i != 4) {
                return m15801t(pVar, false, i, 10, EnumC9684x.SHOW_WHEN_NEGATIVE, z);
            }
            return m15801t(pVar, true, 4, 4, EnumC9684x.SHOW_NEVER, z);
        }

        /* renamed from: F */
        public C9637c<T> m15843F() {
            return m15842G(C8627a.m18481f());
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: G */
        public C9637c<T> m15842G(C8627a aVar) {
            boolean z;
            if (aVar != null) {
                int size = this.f21359d.size();
                HashMap hashMap = null;
                for (int i = 0; i < size; i++) {
                    C9658i iVar = this.f21359d.get(i);
                    if (iVar.m15742i()) {
                        int f = iVar.m15745f();
                        int i2 = size - 1;
                        while (true) {
                            if (i2 <= i) {
                                z = false;
                                break;
                            } else if (this.f21359d.get(i2).m15745f() == f) {
                                if (hashMap == null) {
                                    hashMap = new HashMap();
                                }
                                hashMap.put(Integer.valueOf(i), iVar.m15738m(i2));
                                z = true;
                            } else {
                                i2--;
                            }
                        }
                        if (!z) {
                            throw new IllegalStateException("Missing format processor after or-operator.");
                        }
                    }
                }
                if (hashMap != null) {
                    for (Integer num : hashMap.keySet()) {
                        this.f21359d.set(num.intValue(), hashMap.get(num));
                    }
                }
                C9637c<T> cVar = new C9637c<>(this.f21356a, this.f21357b, this.f21358c, this.f21359d, this.f21366k, aVar, this.f21367l, null);
                String str = this.f21364i;
                if (str == null) {
                    str = "";
                }
                if (this.f21365j == null && str.isEmpty()) {
                    return cVar;
                }
                C9634b bVar = ((C9637c) cVar).f21338c;
                if (!str.isEmpty()) {
                    bVar = bVar.m15906m(C8627a.f19075x, str);
                }
                C10961k kVar = this.f21365j;
                if (kVar != null) {
                    bVar = bVar.m15906m(f21355n, kVar);
                }
                return new C9637c<>(cVar, bVar, (C9638a) null);
            }
            throw new NullPointerException("Missing format attributes.");
        }

        /* renamed from: L */
        public C9640d<T> m15837L() {
            this.f21360e.removeLast();
            m15827V();
            return this;
        }

        /* renamed from: P */
        public C8087x<?> m15833P() {
            C8087x<?> xVar = this.f21357b;
            return xVar == null ? (C8087x<T>) this.f21356a : xVar;
        }

        /* renamed from: U */
        public C9640d<T> m15828U() {
            int i;
            int i2;
            C9658i iVar;
            int i3;
            if (!this.f21360e.isEmpty()) {
                i = this.f21360e.getLast().m15910i();
            } else {
                i = 0;
            }
            if (!this.f21359d.isEmpty()) {
                i3 = this.f21359d.size() - 1;
                iVar = this.f21359d.get(i3);
                i2 = iVar.m15745f();
            } else {
                iVar = null;
                i3 = -1;
                i2 = -1;
            }
            if (i == i2) {
                this.f21359d.set(i3, iVar.m15729v());
                m15827V();
                this.f21362g = -1;
                return this;
            }
            throw new IllegalStateException("Cannot start or-block without any previous step in current section.");
        }

        /* renamed from: W */
        public C9640d<T> m15826W(AbstractC8075n<Character> nVar, int i) {
            m15798w(new C9685y(nVar, i));
            return this;
        }

        /* renamed from: X */
        public C9640d<T> m15825X() {
            return m15824Y(null);
        }

        /* renamed from: Y */
        public C9640d<T> m15824Y(AbstractC8075n<AbstractC8077o> nVar) {
            AbstractC8075n<AbstractC8077o> nVar2;
            C9634b bVar;
            C9641a aVar;
            m15827V();
            C8627a.C8628b bVar2 = new C8627a.C8628b();
            if (!this.f21360e.isEmpty()) {
                bVar = this.f21360e.getLast();
                bVar2.m18475f(bVar.m15914e());
                nVar2 = bVar.m15913f();
            } else {
                bVar = null;
                nVar2 = null;
            }
            int Q = m15832Q(bVar) + 1;
            int i = this.f21361f + 1;
            this.f21361f = i;
            if (nVar == null) {
                aVar = nVar2;
            } else if (nVar2 == null) {
                aVar = nVar;
            } else {
                aVar = new C9641a(nVar2, nVar);
            }
            this.f21360e.addLast(new C9634b(bVar2.m18480a(), this.f21358c, Q, i, aVar));
            return this;
        }

        /* renamed from: Z */
        public C9640d<T> m15823Z(AbstractC8046c<Character> cVar, char c) {
            C9634b bVar;
            m15840I(cVar);
            m15827V();
            if (this.f21360e.isEmpty()) {
                bVar = new C9634b(new C8627a.C8628b().m18479b(cVar, c).m18480a(), this.f21358c);
            } else {
                C9634b last = this.f21360e.getLast();
                C8627a.C8628b bVar2 = new C8627a.C8628b();
                bVar2.m18475f(last.m15914e());
                bVar2.m18479b(cVar, c);
                bVar = last.m15907l(bVar2.m18480a());
            }
            this.f21360e.addLast(bVar);
            return this;
        }

        /* renamed from: a0 */
        public C9640d<T> m15821a0(AbstractC8046c<Integer> cVar, int i) {
            C9634b bVar;
            m15840I(cVar);
            m15827V();
            if (this.f21360e.isEmpty()) {
                bVar = new C9634b(new C8627a.C8628b().m18478c(cVar, i).m18480a(), this.f21358c);
            } else {
                C9634b last = this.f21360e.getLast();
                C8627a.C8628b bVar2 = new C8627a.C8628b();
                bVar2.m18475f(last.m15914e());
                bVar2.m18478c(cVar, i);
                bVar = last.m15907l(bVar2.m18480a());
            }
            this.f21360e.addLast(bVar);
            return this;
        }

        /* renamed from: b0 */
        public <A extends Enum<A>> C9640d<T> m15819b0(AbstractC8046c<A> cVar, A a) {
            C9634b bVar;
            m15840I(cVar);
            m15827V();
            if (this.f21360e.isEmpty()) {
                bVar = new C9634b(new C8627a.C8628b().m18477d(cVar, a).m18480a(), this.f21358c);
            } else {
                C9634b last = this.f21360e.getLast();
                C8627a.C8628b bVar2 = new C8627a.C8628b();
                bVar2.m18475f(last.m15914e());
                bVar2.m18477d(cVar, a);
                bVar = last.m15907l(bVar2.m18480a());
            }
            this.f21360e.addLast(bVar);
            return this;
        }

        /* renamed from: d */
        public <V> C9640d<T> m15817d(AbstractC8079p<V> pVar, AbstractC9648e<V> eVar, AbstractC9645d<V> dVar) {
            m15839J(pVar);
            m15798w(new C9650f(pVar, eVar, dVar));
            return this;
        }

        /* renamed from: e */
        public C9640d<T> m15816e() {
            return m15848A(m15834O(false, null));
        }

        /* renamed from: f */
        public C9640d<T> m15815f() {
            return m15848A(m15834O(true, null));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: g */
        public C9640d<T> m15814g(AbstractC8079p<Integer> pVar, int i) {
            return m15802s(pVar, true, i, i, EnumC9684x.SHOW_NEVER);
        }

        /* renamed from: h */
        public <V extends Enum<V>> C9640d<T> m15813h(AbstractC8079p<V> pVar, int i) {
            return m15802s(pVar, true, i, i, EnumC9684x.SHOW_NEVER);
        }

        /* renamed from: i */
        public C9640d<T> m15812i(AbstractC8079p<Integer> pVar, int i, int i2, boolean z) {
            boolean z2;
            m15839J(pVar);
            if (z || i != i2) {
                z2 = false;
            } else {
                z2 = true;
            }
            m15835N(z2, z);
            C9659j jVar = new C9659j(pVar, i, i2, z);
            int i3 = this.f21362g;
            if (i3 == -1 || !z2) {
                m15798w(jVar);
            } else {
                C9658i iVar = this.f21359d.get(i3);
                m15798w(jVar);
                List<C9658i> list = this.f21359d;
                if (iVar.m15745f() == list.get(list.size() - 1).m15745f()) {
                    this.f21362g = i3;
                    this.f21359d.set(i3, iVar.m15731t(i));
                }
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: j */
        public C9640d<T> m15811j(AbstractC8079p<Integer> pVar, int i, int i2) {
            return m15802s(pVar, false, i, i2, EnumC9684x.SHOW_NEVER);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: k */
        public C9640d<T> m15810k(AbstractC8079p<Integer> pVar, int i, int i2, EnumC9684x xVar) {
            return m15802s(pVar, false, i, i2, xVar);
        }

        /* renamed from: l */
        public C9640d<T> m15809l(char c) {
            return m15807n(String.valueOf(c));
        }

        /* renamed from: m */
        public C9640d<T> m15808m(char c, char c2) {
            m15798w(new C9667m(c, c2));
            return this;
        }

        /* renamed from: n */
        public C9640d<T> m15807n(String str) {
            int i;
            C9658i iVar;
            C9667m mVar = new C9667m(str);
            int h = mVar.m15697h();
            if (h > 0) {
                if (this.f21359d.isEmpty()) {
                    iVar = null;
                } else {
                    List<C9658i> list = this.f21359d;
                    iVar = list.get(list.size() - 1);
                }
                if (iVar != null && iVar.m15744g() && !iVar.m15742i()) {
                    throw new IllegalStateException("Numerical literal can't be inserted after an element with decimal digits.");
                }
            }
            if (h == 0 || (i = this.f21362g) == -1) {
                m15798w(mVar);
            } else {
                C9658i iVar2 = this.f21359d.get(i);
                m15798w(mVar);
                int f = iVar2.m15745f();
                List<C9658i> list2 = this.f21359d;
                if (f == list2.get(list2.size() - 1).m15745f()) {
                    this.f21362g = i;
                    this.f21359d.set(i, iVar2.m15731t(h));
                }
            }
            return this;
        }

        /* renamed from: p */
        public C9640d<T> m15805p() {
            m15798w(new C9668n(false));
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: q */
        public C9640d<T> m15804q(AbstractC8079p<Long> pVar, int i, int i2, EnumC9684x xVar) {
            return m15802s(pVar, false, i, i2, xVar);
        }

        /* renamed from: r */
        public C9640d<T> m15803r() {
            m15838K();
            m15798w(new C9646d0(false));
            return this;
        }

        /* renamed from: u */
        public <V extends Enum<V>> C9640d<T> m15800u(AbstractC8079p<V> pVar, int i, int i2) {
            return m15802s(pVar, false, i, i2, EnumC9684x.SHOW_NEVER);
        }

        /* renamed from: v */
        public C9640d<T> m15799v(String str, EnumC9682w wVar) {
            if (wVar != null) {
                Map<AbstractC8079p<?>, AbstractC8079p<?>> emptyMap = Collections.emptyMap();
                int length = str.length();
                Locale locale = this.f21358c;
                StringBuilder sb2 = new StringBuilder();
                if (!this.f21360e.isEmpty()) {
                    locale = this.f21360e.getLast().m15911h();
                }
                int i = 0;
                while (i < length) {
                    char charAt = str.charAt(i);
                    if (m15829T(charAt)) {
                        m15806o(sb2);
                        int i2 = i + 1;
                        while (i2 < length && str.charAt(i2) == charAt) {
                            i2++;
                        }
                        Map<AbstractC8079p<?>, AbstractC8079p<?>> z = wVar.m15601z(this, locale, charAt, i2 - i);
                        if (!z.isEmpty()) {
                            if (emptyMap.isEmpty()) {
                                emptyMap = z;
                            } else {
                                HashMap hashMap = new HashMap(emptyMap);
                                hashMap.putAll(z);
                                emptyMap = hashMap;
                            }
                        }
                        i = i2 - 1;
                    } else if (charAt == '\'') {
                        m15806o(sb2);
                        int i3 = i + 1;
                        int i4 = i3;
                        while (i4 < length) {
                            if (str.charAt(i4) == '\'') {
                                int i5 = i4 + 1;
                                if (i5 >= length || str.charAt(i5) != '\'') {
                                    break;
                                }
                                i4 = i5;
                            }
                            i4++;
                        }
                        if (i4 < length) {
                            if (i3 == i4) {
                                m15809l('\'');
                            } else {
                                m15807n(str.substring(i3, i4).replace("''", "'"));
                            }
                            i = i4;
                        } else {
                            throw new IllegalArgumentException("String literal in pattern not closed: " + str);
                        }
                    } else if (charAt == '[') {
                        m15806o(sb2);
                        m15825X();
                    } else if (charAt == ']') {
                        m15806o(sb2);
                        m15837L();
                    } else if (charAt == '|') {
                        try {
                            m15806o(sb2);
                            m15828U();
                        } catch (IllegalStateException e) {
                            throw new IllegalArgumentException(e);
                        }
                    } else if (charAt == '#' || charAt == '{' || charAt == '}') {
                        throw new IllegalArgumentException("Pattern contains reserved character: '" + charAt + "'");
                    } else {
                        sb2.append(charAt);
                    }
                    i++;
                }
                m15806o(sb2);
                if (!emptyMap.isEmpty()) {
                    int size = this.f21359d.size();
                    for (int i6 = 0; i6 < size; i6++) {
                        C9658i iVar = this.f21359d.get(i6);
                        AbstractC8079p<?> b = iVar.m15747d().mo15599b();
                        if (emptyMap.containsKey(b)) {
                            this.f21359d.set(i6, iVar.m15727x(emptyMap.get(b)));
                        }
                    }
                }
                if (this.f21364i != null) {
                    str = "";
                }
                this.f21364i = str;
                return this;
            }
            throw new NullPointerException("Missing pattern type.");
        }

        /* renamed from: x */
        public C9640d<T> m15797x() {
            m15798w(new C9668n(true));
            return this;
        }

        /* renamed from: y */
        public C9640d<T> m15796y() {
            m15838K();
            m15798w(new C9646d0(true));
            return this;
        }

        /* renamed from: z */
        public <V extends Enum<V>> C9640d<T> m15795z(AbstractC8079p<V> pVar) {
            V[] enumConstants;
            m15839J(pVar);
            if (pVar instanceof AbstractC8669t) {
                m15798w(C9633a0.m15917a((AbstractC8669t) AbstractC8669t.class.cast(pVar)));
            } else {
                HashMap hashMap = new HashMap();
                for (V v : pVar.getType().getEnumConstants()) {
                    hashMap.put(v, v.toString());
                }
                m15798w(new C9670o(pVar, hashMap));
            }
            return this;
        }

        private C9640d(C8087x<T> xVar, Locale locale) {
            this(xVar, locale, (C8087x<?>) null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private C9640d(C8087x<T> xVar, Locale locale, C8087x<?> xVar2) {
            if (xVar == 0) {
                throw new NullPointerException("Missing chronology.");
            } else if (locale != null) {
                this.f21356a = xVar;
                this.f21357b = xVar2;
                this.f21358c = locale;
                this.f21359d = new ArrayList();
                this.f21360e = new LinkedList<>();
                this.f21361f = 0;
                this.f21362g = -1;
                this.f21363h = 0;
                this.f21364i = null;
                this.f21365j = null;
                this.f21366k = new HashMap();
                this.f21367l = xVar;
                this.f21368m = 0;
            } else {
                throw new NullPointerException("Missing locale.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: jj.c$e */
    /* loaded from: classes8.dex */
    public static class C9642e<C> implements AbstractC8084u<C10983r<C>> {

        /* renamed from: k */
        private final C8087x<C> f21372k;

        /* renamed from: l */
        private final List<AbstractC8082s> f21373l;

        private C9642e(C8087x<C> xVar) {
            this.f21372k = xVar;
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(xVar.m20646v());
            arrayList.addAll(C10906g0.m11743l0().m20646v());
            this.f21373l = Collections.unmodifiableList(arrayList);
        }

        /* renamed from: i */
        static <C> C9642e<C> m15790i(C8087x<C> xVar) {
            if (xVar == null) {
                return null;
            }
            return new C9642e<>(xVar);
        }

        /* renamed from: a */
        public C10983r<C> mo11614k(AbstractC8080q<?> qVar, AbstractC8048d dVar, boolean z, boolean z2) {
            C10983r rVar;
            C k = this.f21372k.mo11614k(qVar, dVar, z, z2);
            C10906g0 J = C10906g0.m11743l0().mo11614k(qVar, dVar, z, z2);
            if (k instanceof AbstractC8070l) {
                rVar = C10983r.m11379c((AbstractC8070l) AbstractC8070l.class.cast(k), J);
            } else if (k instanceof AbstractC8073m) {
                rVar = C10983r.m11378d((AbstractC8073m) AbstractC8073m.class.cast(k), J);
            } else {
                throw new IllegalStateException("Cannot determine calendar type: " + k);
            }
            return (C10983r) C9637c.m15869h(rVar);
        }

        @Override // p143hj.AbstractC8084u
        /* renamed from: b */
        public AbstractC8053f0 mo11620b() {
            return this.f21372k.mo11620b();
        }

        @Override // p143hj.AbstractC8084u
        /* renamed from: c */
        public C8087x<?> mo11619c() {
            throw new UnsupportedOperationException("Not used.");
        }

        @Override // p143hj.AbstractC8084u
        /* renamed from: d */
        public int mo11618d() {
            return this.f21372k.mo11618d();
        }

        /* renamed from: e */
        public C8087x<?> m15792e() {
            return (C8087x<C>) this.f21372k;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C9642e) {
                return this.f21372k.equals(((C9642e) obj).f21372k);
            }
            return false;
        }

        /* renamed from: f */
        public List<AbstractC8082s> m15791f() {
            return this.f21373l;
        }

        @Override // p143hj.AbstractC8084u
        /* renamed from: g */
        public String mo11616g(AbstractC8090y yVar, Locale locale) {
            throw new UnsupportedOperationException("Not used.");
        }

        public int hashCode() {
            return this.f21372k.hashCode();
        }

        /* renamed from: j */
        public AbstractC8077o mo11615h(C10983r<C> rVar, AbstractC8048d dVar) {
            throw new UnsupportedOperationException("Not used.");
        }

        public String toString() {
            return this.f21372k.m20648q().getName();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: jj.c$f */
    /* loaded from: classes8.dex */
    public static class C9643f implements AbstractC8077o, AbstractC8078o0, AbstractC10817f {

        /* renamed from: k */
        private final C10983r<?> f21374k;

        /* renamed from: l */
        private final String f21375l;

        /* renamed from: m */
        private final AbstractC11001k f21376m;

        /* synthetic */ C9643f(C10983r rVar, String str, AbstractC11001k kVar, C9638a aVar) {
            this(rVar, str, kVar);
        }

        /* renamed from: c */
        private AbstractC10817f m15788c() {
            AbstractC8053f0 f0Var;
            try {
                f0Var = C8087x.m20655E(this.f21374k.m11375g().getClass()).mo11620b();
            } catch (RuntimeException unused) {
                f0Var = AbstractC8053f0.f17431a;
            }
            return this.f21374k.m11381a(AbstractC11002l.m11310N(this.f21376m), f0Var);
        }

        @Override // net.time4j.base.AbstractC10817f
        /* renamed from: a */
        public int mo11327a() {
            return m15788c().mo11327a();
        }

        @Override // p143hj.AbstractC8077o
        /* renamed from: b */
        public <V> V mo11380b(AbstractC8079p<V> pVar) {
            return (V) this.f21374k.mo11380b(pVar);
        }

        @Override // p143hj.AbstractC8077o
        /* renamed from: e */
        public boolean mo11377e(AbstractC8079p<?> pVar) {
            return this.f21374k.mo11377e(pVar);
        }

        @Override // p143hj.AbstractC8077o
        /* renamed from: f */
        public boolean mo11376f() {
            return true;
        }

        @Override // net.time4j.base.AbstractC10817f
        /* renamed from: h */
        public long mo11325h() {
            return m15788c().mo11325h();
        }

        @Override // p143hj.AbstractC8077o
        /* renamed from: k */
        public <V> V mo11373k(AbstractC8079p<V> pVar) {
            return (V) this.f21374k.mo11373k(pVar);
        }

        @Override // p143hj.AbstractC8077o
        /* renamed from: q */
        public AbstractC11001k mo11372q() {
            return this.f21376m;
        }

        @Override // p143hj.AbstractC8077o
        /* renamed from: r */
        public <V> V mo11371r(AbstractC8079p<V> pVar) {
            return (V) this.f21374k.mo11371r(pVar);
        }

        @Override // p143hj.AbstractC8077o
        /* renamed from: s */
        public int mo11370s(AbstractC8079p<Integer> pVar) {
            return this.f21374k.mo11370s(pVar);
        }

        private C9643f(C10983r<?> rVar, String str, AbstractC11001k kVar) {
            this.f21374k = rVar;
            this.f21375l = str;
            this.f21376m = kVar;
        }
    }

    /* synthetic */ C9637c(C8087x xVar, C8087x xVar2, Locale locale, List list, Map map, C8627a aVar, C8087x xVar3, C9638a aVar2) {
        this(xVar, xVar2, locale, list, map, aVar, xVar3);
    }

    /* renamed from: A */
    private static boolean m15896A(C8087x<?> xVar, C8087x<?> xVar2, AbstractC8079p<?> pVar) {
        for (AbstractC8082s sVar : xVar.m20646v()) {
            if (sVar.mo10713d(pVar)) {
                return true;
            }
        }
        if (xVar2 != null) {
            if (pVar.mo11063M()) {
                for (AbstractC8082s sVar2 : xVar2.m20646v()) {
                    if (sVar2.mo10713d(pVar)) {
                        return true;
                    }
                }
                return false;
            } else if (!pVar.mo11061U() || !C10906g0.m11743l0().mo20656D(pVar)) {
                return false;
            } else {
                for (AbstractC8082s sVar3 : C10906g0.m11743l0().m20646v()) {
                    if (sVar3.mo10713d(pVar)) {
                        return true;
                    }
                }
                return false;
            }
        }
        while (true) {
            xVar = xVar.mo11619c();
            if (xVar == null) {
                return false;
            }
            for (AbstractC8082s sVar4 : xVar.m20646v()) {
                if (sVar4.mo10713d(pVar)) {
                    return true;
                }
            }
        }
    }

    /* renamed from: B */
    public static C9637c<C10779a0> m15895B(EnumC8635e eVar, EnumC8635e eVar2, Locale locale, AbstractC11001k kVar) {
        C9640d dVar = new C9640d(C10779a0.m12326W(), locale, (C9638a) null);
        dVar.m15798w(new C9686z(eVar, eVar2));
        return (C9637c<T>) dVar.m15843F().m15875V(kVar);
    }

    /* renamed from: C */
    public static <T> C9637c<T> m15894C(String str, EnumC9682w wVar, Locale locale, C8087x<T> xVar) {
        C9640d dVar = new C9640d(xVar, locale, (C9638a) null);
        m15870g(dVar, str, wVar);
        try {
            return dVar.m15843F();
        } catch (IllegalStateException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static <T> T m15891F(p183jj.C9637c<?> r15, p143hj.AbstractC8084u<T> r16, java.util.List<p143hj.AbstractC8082s> r17, java.lang.CharSequence r18, p183jj.C9675s r19, p143hj.AbstractC8048d r20, p161ij.EnumC8637g r21, boolean r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p183jj.C9637c.m15891F(jj.c, hj.u, java.util.List, java.lang.CharSequence, jj.s, hj.d, ij.g, boolean, boolean):java.lang.Object");
    }

    /* renamed from: G */
    private static <C> C m15890G(C9637c<?> cVar, C8087x<C> xVar, int i, CharSequence charSequence, C9675s sVar, AbstractC8048d dVar, EnumC8637g gVar, boolean z) {
        boolean z2;
        C8087x<?> xVar2;
        Object obj;
        RuntimeException e;
        C8087x<?> c = xVar.mo11619c();
        if (c == null || xVar == (xVar2 = ((C9637c) cVar).f21350o)) {
            List<AbstractC8082s> v = xVar.m20646v();
            if (i > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            return (C) m15891F(cVar, xVar, v, charSequence, sVar, dVar, gVar, z2, z);
        }
        if (c == xVar2) {
            obj = m15891F(cVar, c, c.m20646v(), charSequence, sVar, dVar, gVar, true, z);
        } else {
            obj = m15890G(cVar, c, i + 1, charSequence, sVar, dVar, gVar, z);
        }
        if (sVar.m15661i()) {
            return null;
        }
        if (obj == null) {
            AbstractC8080q<?> g = sVar.m15663g();
            sVar.m15659k(charSequence.length(), m15855v(g) + m15857t(g));
            return null;
        }
        AbstractC8080q<?> h = sVar.m15662h();
        try {
            if (c instanceof C8059h0) {
                m15880Q(h, ((C8059h0) C8059h0.class.cast(c)).m20712K(), obj);
                C k = xVar.mo11614k(h, dVar, gVar.m18443a(), false);
                if (k == null) {
                    if (!sVar.m15661i()) {
                        sVar.m15659k(charSequence.length(), m15855v(h) + m15857t(h));
                    }
                    return null;
                } else if (gVar.m18441c()) {
                    return (C) m15868i(h, k, charSequence, sVar);
                } else {
                    return k;
                }
            } else {
                try {
                    throw new IllegalStateException("Unsupported chronology or preparser: " + xVar);
                } catch (RuntimeException e2) {
                    e = e2;
                    sVar.m15659k(charSequence.length(), e.getMessage() + m15857t(h));
                    return null;
                }
            }
        } catch (RuntimeException e3) {
            e = e3;
        }
    }

    /* renamed from: H */
    private AbstractC8080q<?> m15889H(CharSequence charSequence, C9675s sVar, AbstractC8048d dVar, boolean z, int i) {
        LinkedList linkedList;
        int i2;
        C9678v vVar;
        C9678v vVar2;
        int i3;
        AbstractC8079p<?> b;
        C9678v vVar3 = new C9678v(i, this.f21347l);
        vVar3.m15629g0(sVar.m15664f());
        if (this.f21342g) {
            LinkedList linkedList2 = new LinkedList();
            linkedList2.push(vVar3);
            linkedList = linkedList2;
        } else {
            linkedList = null;
        }
        int size = this.f21339d.size();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i6 < size) {
            C9658i iVar = this.f21339d.get(i6);
            if (linkedList == null) {
                vVar2 = vVar3;
                vVar = vVar2;
                i2 = i4;
            } else {
                int b2 = iVar.m15749b();
                int i7 = b2;
                while (i7 > i5) {
                    vVar3 = new C9678v(i >>> 1, this.f21347l);
                    vVar3.m15629g0(sVar.m15664f());
                    linkedList.push(vVar3);
                    i7--;
                }
                while (i7 < i5) {
                    vVar3 = (C9678v) linkedList.pop();
                    ((C9678v) linkedList.peek()).m15635a0(vVar3);
                    i7++;
                }
                vVar = vVar3;
                i2 = b2;
                vVar2 = (C9678v) linkedList.peek();
            }
            sVar.m15668b();
            iVar.m15734q(charSequence, sVar, dVar, vVar2, z);
            if (sVar.m15660j() && (b = iVar.m15747d().mo15599b()) != null && this.f21340e.containsKey(b)) {
                vVar2.mo15648I(b, this.f21340e.get(b));
                vVar2.mo15654D(EnumC8076n0.ERROR_MESSAGE, null);
                sVar.m15669a();
                sVar.m15668b();
            }
            if (sVar.m15661i()) {
                int f = iVar.m15745f();
                if (!iVar.m15742i()) {
                    i3 = i6 + 1;
                    while (i3 < size) {
                        C9658i iVar2 = this.f21339d.get(i3);
                        if (iVar2.m15742i() && iVar2.m15745f() == f) {
                            break;
                        }
                        i3++;
                    }
                }
                i3 = i6;
                if (i3 > i6 || iVar.m15742i()) {
                    if (linkedList != null) {
                        vVar = (C9678v) linkedList.pop();
                    }
                    sVar.m15669a();
                    sVar.m15658l(vVar.m15640V());
                    vVar.m15631e0();
                    if (linkedList != null) {
                        linkedList.push(vVar);
                    }
                    i6 = i3;
                } else if (i2 == 0) {
                    if (linkedList != null) {
                        vVar = (C9678v) linkedList.peek();
                    }
                    vVar.m15630f0();
                    return vVar;
                } else {
                    int b3 = iVar.m15749b();
                    int i8 = i3;
                    for (int i9 = i6 + 1; i9 < size && this.f21339d.get(i9).m15749b() > b3; i9++) {
                        i8 = i9;
                    }
                    int i10 = size - 1;
                    while (true) {
                        if (i10 <= i8) {
                            break;
                        } else if (this.f21339d.get(i10).m15745f() == f) {
                            i8 = i10;
                            break;
                        } else {
                            i10--;
                        }
                    }
                    i2--;
                    vVar3 = (C9678v) linkedList.pop();
                    sVar.m15669a();
                    sVar.m15658l(vVar3.m15640V());
                    i6 = i8;
                    i5 = i2;
                    i6++;
                    i4 = i5;
                }
            } else if (iVar.m15742i()) {
                i6 = iVar.m15730u();
            }
            vVar3 = vVar;
            i5 = i2;
            i6++;
            i4 = i5;
        }
        while (i4 > 0) {
            vVar3 = (C9678v) linkedList.pop();
            ((C9678v) linkedList.peek()).m15635a0(vVar3);
            i4--;
        }
        if (linkedList != null) {
            vVar3 = (C9678v) linkedList.peek();
        }
        vVar3.m15630f0();
        return vVar3;
    }

    /* renamed from: L */
    private static C9637c<C10779a0> m15885L() {
        C9640d N = m15883N(C10779a0.class, Locale.ENGLISH);
        m15884M(N);
        N.m15846C(EnumC8635e.MEDIUM, false, Arrays.asList("GMT", "UT", "Z"));
        N.m15828U();
        m15884M(N);
        HashMap hashMap = new HashMap();
        EnumC10996f fVar = EnumC10996f.BEHIND_UTC;
        hashMap.put("EST", C11028p.m11183n(fVar, 5));
        hashMap.put("EDT", C11028p.m11183n(fVar, 4));
        hashMap.put("CST", C11028p.m11183n(fVar, 6));
        hashMap.put("CDT", C11028p.m11183n(fVar, 5));
        hashMap.put("MST", C11028p.m11183n(fVar, 7));
        hashMap.put("MDT", C11028p.m11183n(fVar, 6));
        hashMap.put("PST", C11028p.m11183n(fVar, 8));
        hashMap.put("PDT", C11028p.m11183n(fVar, 7));
        N.m15798w(new C9650f(EnumC9636b0.TIMEZONE_OFFSET, new C9638a(), new C9639b(hashMap)));
        return (C9637c<T>) N.m15843F().m15875V(C11028p.f24516u);
    }

    /* renamed from: M */
    private static void m15884M(C9640d<C10779a0> dVar) {
        C9640d<C10779a0> X = dVar.m15825X();
        AbstractC8046c<EnumC8671v> cVar = C8627a.f19058g;
        EnumC8671v vVar = EnumC8671v.ABBREVIATED;
        X.m15819b0(cVar, vVar).m15795z(C10892f0.f38901F).m15837L().m15807n(", ").m15837L().m15811j(C10892f0.f38900E, 1, 2).m15809l(' ').m15819b0(cVar, vVar).m15795z(C10892f0.f38898C).m15837L().m15809l(' ').m15814g(C10892f0.f24174z, 4).m15809l(' ').m15814g(C10906g0.f38912E, 2).m15809l(':').m15814g(C10906g0.f38914G, 2).m15825X().m15809l(':').m15814g(C10906g0.f38916I, 2).m15837L().m15809l(' ');
    }

    /* renamed from: N */
    public static <T extends AbstractC8080q<T>> C9640d<T> m15883N(Class<T> cls, Locale locale) {
        if (cls != null) {
            C8087x E = C8087x.m20655E(cls);
            if (E != null) {
                return new C9640d<>(E, locale, (C9638a) null);
            }
            throw new IllegalArgumentException("Not formattable: " + cls);
        }
        throw new NullPointerException("Missing chronological type.");
    }

    /* renamed from: O */
    private static <V> void m15882O(AbstractC8080q<?> qVar, AbstractC8079p<V> pVar, Object obj) {
        qVar.mo15654D(pVar, pVar.getType().cast(obj));
    }

    /* renamed from: P */
    private static String m15881P(int i, CharSequence charSequence) {
        int length = charSequence.length();
        if (length - i <= 10) {
            return charSequence.subSequence(i, length).toString();
        }
        return charSequence.subSequence(i, i + 10).toString() + "...";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: Q */
    private static <T> void m15880Q(AbstractC8080q<?> qVar, AbstractC8079p<T> pVar, Object obj) {
        qVar.mo15654D(pVar, pVar.getType().cast(obj));
    }

    /* renamed from: g */
    private static <T> void m15870g(C9640d<T> dVar, String str, EnumC9682w wVar) {
        boolean z;
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(length);
        int i = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt == '\'') {
                int i2 = i + 1;
                if (str.charAt(i2) == 'Z') {
                    z = true;
                } else {
                    z = false;
                }
                while (i2 < length) {
                    if (str.charAt(i2) == '\'') {
                        int i3 = i2 + 1;
                        if (i3 >= length || str.charAt(i3) != '\'') {
                            if (z && i2 == i + 2 && C9640d.m15831R(((C9640d) dVar).f21356a)) {
                                throw new IllegalArgumentException("Z-literal (=UTC+00) should not be escaped: " + str);
                            }
                            i = i2;
                        } else {
                            i2 = i3;
                        }
                    }
                    i2++;
                }
                i = i2;
            } else {
                sb2.append(charAt);
            }
            i++;
        }
        String sb3 = sb2.toString();
        int i4 = C0293c.f21354a[wVar.ordinal()];
        if (i4 == 1 || i4 == 2 || i4 == 3 || i4 == 4) {
            if ((sb3.contains("h") || sb3.contains("K")) && !sb3.contains("a") && !sb3.contains("b") && !sb3.contains("B")) {
                throw new IllegalArgumentException("12-hour-clock requires am/pm-marker or dayperiod: " + str);
            } else if (sb3.contains("Y") && ((sb3.contains("M") || sb3.contains("L")) && !sb3.contains("w"))) {
                throw new IllegalArgumentException("Y as week-based-year requires a week-date-format: " + str);
            } else if (sb3.contains("D") && ((sb3.contains("M") || sb3.contains("L")) && !sb3.contains("d"))) {
                throw new IllegalArgumentException("D is the day of year but not the day of month: " + str);
            }
        }
        dVar.m15799v(str, wVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: h */
    public static <T> T m15869h(Object obj) {
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0107, code lost:
        if (((net.time4j.C10906g0) r10.mo11371r(r6)).mo11640p() == 24) goto L_0x0109;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x012b  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static <T> T m15868i(p143hj.AbstractC8080q<?> r10, T r11, java.lang.CharSequence r12, p183jj.C9675s r13) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p183jj.C9637c.m15868i(hj.q, java.lang.Object, java.lang.CharSequence, jj.s):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static C8087x<?> m15867j(C8087x<?> xVar, C8087x<?> xVar2, AbstractC8079p<?> pVar) {
        if (xVar.mo20656D(pVar)) {
            return xVar;
        }
        if (xVar2 == null) {
            do {
                xVar = xVar.mo11619c();
                if (xVar != null) {
                }
            } while (!xVar.mo20656D(pVar));
            return xVar;
        } else if (pVar.mo11063M() && xVar2.mo20656D(pVar)) {
            return xVar2;
        } else {
            if (pVar.mo11061U() && C10906g0.m11743l0().mo20656D(pVar)) {
                return C10906g0.m11743l0();
            }
        }
        throw new IllegalArgumentException("Unsupported element: " + pVar.name());
    }

    /* renamed from: k */
    private AbstractC8077o m15866k(T t, AbstractC8048d dVar) {
        C10983r rVar;
        C9642e<?> eVar = this.f21337b;
        if (eVar == null) {
            return this.f21336a.mo11615h(t, dVar);
        }
        try {
            Class<?> q = eVar.m15792e().m20648q();
            AbstractC8053f0 f0Var = (AbstractC8053f0) dVar.mo15674c(C8627a.f19072u, this.f21337b.mo11620b());
            C10779a0 a0Var = (C10779a0) C10779a0.class.cast(t);
            AbstractC11001k kVar = (AbstractC11001k) dVar.mo15675b(C8627a.f19055d);
            String str = "";
            if (AbstractC8070l.class.isAssignableFrom(q)) {
                str = (String) dVar.mo15675b(C8627a.f19071t);
                rVar = a0Var.m12304s0((C8066j) m15869h(this.f21337b.m15792e()), str, kVar, f0Var);
            } else if (AbstractC8073m.class.isAssignableFrom(q)) {
                rVar = a0Var.m12303t0(this.f21337b.m15792e(), kVar, f0Var);
            } else {
                throw new IllegalStateException("Unexpected calendar override: " + q);
            }
            return new C9643f(rVar, str, kVar, null);
        } catch (ClassCastException e) {
            throw new IllegalArgumentException("Not formattable: " + t, e);
        } catch (NoSuchElementException e2) {
            throw new IllegalArgumentException(e2.getMessage(), e2);
        }
    }

    /* renamed from: m */
    private String m15864m(AbstractC8077o oVar) {
        StringBuilder sb2 = new StringBuilder(this.f21339d.size() * 8);
        try {
            m15887J(oVar, sb2, this.f21338c, false);
            return sb2.toString();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: n */
    private List<C9658i> m15863n(List<C9658i> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (C9658i iVar : list) {
            arrayList.add(iVar.m15732s(this));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public static int m15858s(C8087x<?> xVar, C8087x<?> xVar2, C8087x<?> xVar3) {
        if (xVar3 != null) {
            return -1;
        }
        int i = 0;
        if (xVar.equals(xVar2)) {
            return 0;
        }
        do {
            xVar2 = xVar2.mo11619c();
            if (xVar2 == null) {
                return ViewDefaults.NUMBER_OF_LINES;
            }
            i++;
        } while (!xVar.equals(xVar2));
        return i;
    }

    /* renamed from: t */
    private static String m15857t(AbstractC8080q<?> qVar) {
        Set<AbstractC8079p<?>> v = qVar.mo15628v();
        StringBuilder sb2 = new StringBuilder(v.size() * 16);
        sb2.append(" [parsed={");
        boolean z = true;
        for (AbstractC8079p<?> pVar : v) {
            if (z) {
                z = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(pVar.name());
            sb2.append('=');
            sb2.append(qVar.mo11371r(pVar));
        }
        sb2.append("}]");
        return sb2.toString();
    }

    /* renamed from: v */
    private static String m15855v(AbstractC8080q<?> qVar) {
        EnumC8076n0 n0Var = EnumC8076n0.ERROR_MESSAGE;
        if (!qVar.mo11377e(n0Var)) {
            return "Insufficient data:";
        }
        String str = "Validation failed => " + ((String) qVar.mo11371r(n0Var));
        qVar.mo15654D(n0Var, null);
        return str;
    }

    /* renamed from: w */
    private boolean m15854w() {
        boolean z = m15851z();
        if (!z) {
            return z;
        }
        AbstractC9657h<?> d = this.f21339d.get(0).m15747d();
        if (d instanceof C9650f) {
            return ((C9650f) C9650f.class.cast(d)).m15777h();
        }
        if (!(d instanceof C9686z)) {
            return false;
        }
        return z;
    }

    /* renamed from: x */
    private boolean m15853x() {
        return this.f21336a.mo11619c() == null && this.f21337b == null;
    }

    /* renamed from: y */
    private static boolean m15852y(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: D */
    public T m15893D(CharSequence charSequence) {
        C9675s sVar = new C9675s();
        T E = m15892E(charSequence, sVar);
        if (E != null) {
            int f = sVar.m15664f();
            if (this.f21348m || f >= charSequence.length()) {
                return E;
            }
            throw new ParseException("Unparsed trailing characters: " + m15881P(f, charSequence), f);
        }
        throw new ParseException(sVar.m15666d(), sVar.m15667c());
    }

    /* renamed from: E */
    public T m15892E(CharSequence charSequence, C9675s sVar) {
        if (!this.f21349n) {
            return mo15704a(charSequence, sVar, this.f21338c);
        }
        C8087x<T> xVar = this.f21336a;
        return (T) m15891F(this, xVar, xVar.m20646v(), charSequence, sVar, this.f21338c, this.f21346k, false, true);
    }

    /* renamed from: I */
    public String m15888I(T t) {
        return m15864m(m15866k(t, this.f21338c));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public Set<C9653g> m15887J(AbstractC8077o oVar, Appendable appendable, AbstractC8048d dVar, boolean z) {
        LinkedList linkedList;
        int i;
        Throwable e;
        int i2;
        int i3;
        if (appendable != null) {
            int size = this.f21339d.size();
            int i4 = 0;
            boolean z2 = dVar == this.f21338c;
            Set<C9653g> linkedHashSet = z ? new LinkedHashSet<>(size) : null;
            if (this.f21343h) {
                LinkedList linkedList2 = new LinkedList();
                linkedList2.push(new StringBuilder(size << 2));
                if (z) {
                    LinkedList linkedList3 = new LinkedList();
                    linkedList3.push(linkedHashSet);
                    linkedList = linkedList3;
                } else {
                    linkedList = null;
                }
                int i5 = 0;
                while (i5 < size) {
                    C9658i iVar = this.f21339d.get(i5);
                    int b = iVar.m15749b();
                    int i6 = b;
                    while (i6 > i4) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append((CharSequence) linkedList2.peek());
                        linkedList2.push(sb2);
                        if (z) {
                            linkedHashSet = new LinkedHashSet<>();
                            linkedHashSet.addAll((Collection) linkedList.peek());
                            linkedList.push(linkedHashSet);
                        }
                        i6--;
                    }
                    while (i6 < i4) {
                        linkedList2.pop();
                        linkedList2.push((StringBuilder) linkedList2.pop());
                        if (z) {
                            linkedHashSet = (Set) linkedList.pop();
                            linkedList.pop();
                            linkedList.push(linkedHashSet);
                        }
                        i6++;
                    }
                    StringBuilder sb3 = (StringBuilder) linkedList2.peek();
                    if (z) {
                        linkedHashSet = (Set) linkedList.peek();
                    }
                    try {
                        i = iVar.m15733r(oVar, sb3, dVar, linkedHashSet, z2);
                        e = null;
                    } catch (C8081r | IllegalArgumentException e2) {
                        e = e2;
                        i = -1;
                    }
                    if (i == -1) {
                        int f = iVar.m15745f();
                        if (!iVar.m15742i()) {
                            i3 = i5;
                            i2 = i3 + 1;
                            while (i2 < size) {
                                C9658i iVar2 = this.f21339d.get(i2);
                                if (iVar2.m15742i() && iVar2.m15745f() == f) {
                                    break;
                                }
                                i2++;
                            }
                        } else {
                            i3 = i5;
                        }
                        i2 = i3;
                        if (i2 > i3 || iVar.m15742i()) {
                            linkedList2.pop();
                            StringBuilder sb4 = new StringBuilder();
                            if (!linkedList2.isEmpty()) {
                                sb4.append((CharSequence) linkedList2.peek());
                            }
                            linkedList2 = linkedList2;
                            linkedList2.push(sb4);
                            if (z) {
                                linkedList.pop();
                                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                                if (!linkedList.isEmpty()) {
                                    linkedHashSet2.addAll((Collection) linkedList.peek());
                                }
                                linkedList = linkedList;
                                linkedList.push(linkedHashSet2);
                            } else {
                                linkedList = linkedList;
                            }
                        } else if (e == null) {
                            throw new IllegalArgumentException("Not formattable: " + oVar);
                        } else {
                            throw new IllegalArgumentException("Not formattable: " + oVar, e);
                        }
                    } else {
                        linkedList = linkedList;
                        linkedList2 = linkedList2;
                        i2 = iVar.m15742i() ? iVar.m15730u() : i5;
                    }
                    i5 = i2 + 1;
                    linkedHashSet = linkedHashSet;
                    i4 = b;
                }
                linkedList2.clear();
                appendable.append((StringBuilder) linkedList2.peek());
                if (z) {
                    linkedHashSet = (Set) linkedList.peek();
                    linkedList.clear();
                }
            } else {
                int i7 = 0;
                while (i7 < size) {
                    try {
                        C9658i iVar3 = this.f21339d.get(i7);
                        iVar3.m15733r(oVar, appendable, dVar, linkedHashSet, z2);
                        if (iVar3.m15742i()) {
                            i7 = iVar3.m15730u();
                        }
                        i7++;
                    } catch (C8081r e3) {
                        throw new IllegalArgumentException("Not formattable: " + oVar, e3);
                    }
                }
            }
            if (z) {
                return Collections.unmodifiableSet(linkedHashSet);
            }
            return null;
        }
        throw new NullPointerException("Missing text result buffer.");
    }

    /* renamed from: K */
    public Set<C9653g> m15886K(T t, Appendable appendable, AbstractC8048d dVar) {
        return m15887J(m15866k(t, dVar), appendable, dVar, true);
    }

    /* renamed from: R */
    public <A extends Enum<A>> C9637c<T> m15879R(AbstractC8046c<A> cVar, A a) {
        return new C9637c<>(this, new C8627a.C8628b().m18475f(this.f21338c.m15914e()).m18477d(cVar, a).m18480a());
    }

    /* renamed from: S */
    public C9637c<T> m15878S(EnumC8637g gVar) {
        return m15879R(C8627a.f19057f, gVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: T */
    public C9637c<T> m15877T(Map<AbstractC8079p<?>, Object> map, C9634b bVar) {
        C9634b k = C9634b.m15908k(bVar, this.f21338c);
        return new C9637c<>(new C9637c(this, map), k, (C10929d) k.mo15674c(C10668a.f23594a, null));
    }

    /* renamed from: U */
    public C9637c<T> m15876U(AbstractC11002l lVar) {
        if (lVar != null) {
            return new C9637c<>(this, this.f21338c.m15907l(new C8627a.C8628b().m18475f(this.f21338c.m15914e()).m18472i(lVar.mo11286z()).m18480a()).m15906m(C8627a.f19056e, lVar.mo11319E()));
        }
        throw new NullPointerException("Missing timezone id.");
    }

    /* renamed from: V */
    public C9637c<T> m15875V(AbstractC11001k kVar) {
        return m15876U(AbstractC11002l.m11310N(kVar));
    }

    @Override // p183jj.AbstractC9645d
    /* renamed from: a */
    public T mo15704a(CharSequence charSequence, C9675s sVar, AbstractC8048d dVar) {
        EnumC8637g gVar;
        C9671p pVar;
        boolean z;
        AbstractC11001k kVar;
        C10779a0 a0Var;
        EnumC10997g gVar2;
        EnumC8637g gVar3 = this.f21346k;
        C9634b bVar = this.f21338c;
        if (dVar != bVar) {
            C9671p pVar2 = new C9671p(dVar, bVar);
            pVar = pVar2;
            gVar = (EnumC8637g) pVar2.mo15674c(C8627a.f19057f, EnumC8637g.SMART);
            z = false;
        } else {
            gVar = gVar3;
            z = true;
            pVar = dVar;
        }
        C9642e<?> eVar = this.f21337b;
        if (eVar == null) {
            return (T) m15890G(this, this.f21336a, 0, charSequence, sVar, pVar, gVar, z);
        }
        List<AbstractC8082s> f = eVar.m15791f();
        C9642e<?> eVar2 = this.f21337b;
        C10983r rVar = (C10983r) m15891F(this, eVar2, f, charSequence, sVar, pVar, gVar, true, z);
        if (sVar.m15661i()) {
            return null;
        }
        AbstractC8080q<?> h = sVar.m15662h();
        if (h.mo11376f()) {
            kVar = h.mo11372q();
        } else {
            AbstractC8046c<AbstractC11001k> cVar = C8627a.f19055d;
            if (pVar.mo15676a(cVar)) {
                kVar = (AbstractC11001k) pVar.mo15675b(cVar);
            } else {
                kVar = null;
            }
        }
        if (kVar != null) {
            AbstractC8053f0 f0Var = (AbstractC8053f0) dVar.mo15674c(C8627a.f19072u, eVar2.mo11620b());
            EnumC8045b0 b0Var = EnumC8045b0.DAYLIGHT_SAVING;
            if (h.mo11377e(b0Var)) {
                boolean booleanValue = ((Boolean) h.mo11371r(b0Var)).booleanValue();
                AbstractC11027o oVar = (AbstractC11027o) pVar.mo15674c(C8627a.f19056e, AbstractC11002l.f24453n);
                if (booleanValue) {
                    gVar2 = EnumC10997g.EARLIER_OFFSET;
                } else {
                    gVar2 = EnumC10997g.LATER_OFFSET;
                }
                a0Var = rVar.m11381a(AbstractC11002l.m11310N(kVar).mo11307Q(oVar.mo11198a(gVar2)), f0Var);
            } else {
                AbstractC8046c<AbstractC11027o> cVar2 = C8627a.f19056e;
                if (pVar.mo15676a(cVar2)) {
                    a0Var = rVar.m11381a(AbstractC11002l.m11310N(kVar).mo11307Q((AbstractC11027o) pVar.mo15675b(cVar2)), f0Var);
                } else {
                    a0Var = rVar.m11381a(AbstractC11002l.m11310N(kVar), f0Var);
                }
            }
        } else {
            a0Var = null;
        }
        if (a0Var == null) {
            sVar.m15659k(charSequence.length(), "Missing timezone or offset.");
            return null;
        }
        h.mo15654D(C10779a0.m12326W().m20712K(), a0Var);
        T t = (T) m15869h(a0Var);
        if (gVar.m18441c()) {
            m15868i(h, t, charSequence, sVar);
        }
        return t;
    }

    @Override // p183jj.AbstractC9648e
    /* renamed from: b */
    public <R> R mo15705b(T t, Appendable appendable, AbstractC8048d dVar, AbstractC8083t<AbstractC8077o, R> tVar) {
        AbstractC8077o k = m15866k(t, dVar);
        m15887J(k, appendable, dVar, false);
        return tVar.apply(k);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9637c)) {
            return false;
        }
        C9637c cVar = (C9637c) obj;
        if (!this.f21336a.equals(cVar.f21336a) || !m15852y(this.f21337b, cVar.f21337b) || !this.f21338c.equals(cVar.f21338c) || !this.f21340e.equals(cVar.f21340e) || !this.f21339d.equals(cVar.f21339d)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.f21336a.hashCode() * 7) + (this.f21338c.hashCode() * 31) + (this.f21339d.hashCode() * 37);
    }

    /* renamed from: l */
    public String m15865l(T t) {
        return m15888I(t);
    }

    /* renamed from: o */
    public AbstractC8048d m15862o() {
        return this.f21338c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public C9634b m15861p() {
        return this.f21338c;
    }

    /* renamed from: q */
    public C8087x<T> m15860q() {
        return this.f21336a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public Map<AbstractC8079p<?>, Object> m15859r() {
        return this.f21340e;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder((int) Spliterator.NONNULL);
        sb2.append("net.time4j.format.ChronoFormatter[chronology=");
        sb2.append(this.f21336a.m20648q().getName());
        if (this.f21337b != null) {
            sb2.append(", override=");
            sb2.append(this.f21337b);
        }
        sb2.append(", default-attributes=");
        sb2.append(this.f21338c);
        sb2.append(", default-values=");
        sb2.append(this.f21340e);
        sb2.append(", processors=");
        boolean z = true;
        for (C9658i iVar : this.f21339d) {
            if (z) {
                sb2.append('{');
                z = false;
            } else {
                sb2.append('|');
            }
            sb2.append(iVar);
        }
        sb2.append("}]");
        return sb2.toString();
    }

    /* renamed from: u */
    public Locale m15856u() {
        return this.f21338c.m15911h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public boolean m15851z() {
        return this.f21351p == 1 && !this.f21342g;
    }

    /* synthetic */ C9637c(C9637c cVar, C9634b bVar, C9638a aVar) {
        this(cVar, bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C9637c(C8087x<T> xVar, C8087x<?> xVar2, Locale locale, List<C9658i> list, Map<AbstractC8079p<?>, Object> map, C8627a aVar, C8087x<?> xVar3) {
        if (xVar == null) {
            throw new NullPointerException("Missing chronology.");
        } else if (!list.isEmpty()) {
            this.f21336a = xVar;
            this.f21337b = C9642e.m15790i(xVar2);
            this.f21350o = xVar3;
            C9634b d = C9634b.m15915d(xVar2 == 0 ? xVar : xVar2, aVar, locale);
            this.f21338c = d;
            this.f21346k = (EnumC8637g) d.mo15674c(C8627a.f19057f, EnumC8637g.SMART);
            this.f21340e = Collections.unmodifiableMap(map);
            C9659j jVar = null;
            boolean z = true;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            int i = 0;
            for (C9658i iVar : list) {
                z3 = iVar.m15742i() ? true : z3;
                if (jVar == null && (iVar.m15747d() instanceof C9659j)) {
                    jVar = (C9659j) C9659j.class.cast(iVar.m15747d());
                }
                if (!z2 && iVar.m15749b() > 0) {
                    z2 = true;
                }
                AbstractC8079p<?> b = iVar.m15747d().mo15599b();
                if (b != null) {
                    i++;
                    if (z && !C9678v.m15639W(b)) {
                        z = false;
                    }
                    if (!z4) {
                        z4 = m15896A(xVar, xVar2, b);
                    }
                }
            }
            this.f21341f = jVar;
            this.f21342g = z2;
            this.f21343h = z3;
            this.f21344i = z4;
            this.f21345j = i;
            this.f21347l = z;
            this.f21348m = ((Boolean) this.f21338c.mo15674c(C8627a.f19069r, Boolean.FALSE)).booleanValue();
            this.f21349n = m15853x();
            this.f21351p = list.size();
            this.f21339d = m15863n(list);
            this.f21352q = m15854w();
        } else {
            throw new IllegalStateException("No format processors defined.");
        }
    }

    private C9637c(C9637c<T> cVar, C8627a aVar) {
        this(cVar, cVar.f21338c.m15907l(aVar), (C10929d) null);
    }

    private C9637c(C9637c<T> cVar, C9634b bVar) {
        this(cVar, bVar, (C10929d) null);
    }

    private C9637c(C9637c<T> cVar, C9634b bVar, C10929d dVar) {
        AbstractC8079p<Integer> pVar;
        if (bVar != null) {
            this.f21336a = cVar.f21336a;
            this.f21337b = cVar.f21337b;
            this.f21350o = cVar.f21350o;
            this.f21338c = bVar;
            this.f21346k = (EnumC8637g) bVar.mo15674c(C8627a.f19057f, EnumC8637g.SMART);
            this.f21340e = Collections.unmodifiableMap(new C9672q(cVar.f21340e));
            this.f21341f = cVar.f21341f;
            this.f21342g = cVar.f21342g;
            this.f21343h = cVar.f21343h;
            this.f21344i = cVar.f21344i || dVar != null;
            this.f21345j = cVar.f21345j;
            int size = cVar.f21339d.size();
            ArrayList arrayList = new ArrayList(cVar.f21339d);
            boolean z = cVar.f21347l;
            for (int i = 0; i < size; i++) {
                C9658i iVar = arrayList.get(i);
                AbstractC8079p<?> b = iVar.m15747d().mo15599b();
                C8087x xVar = this.f21336a;
                xVar = xVar == C10779a0.m12326W() ? xVar.mo11619c() : xVar;
                if (b != null && !xVar.m20657A(b)) {
                    Iterator<AbstractC8082s> it = xVar.m20646v().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        AbstractC8082s next = it.next();
                        if (next.mo10715b(cVar.m15856u(), cVar.f21338c).contains(b)) {
                            Iterator<AbstractC8079p<?>> it2 = next.mo10715b(bVar.m15911h(), bVar).iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                AbstractC8079p<?> next2 = it2.next();
                                if (next2.name().equals(b.name())) {
                                    if (next2 != b) {
                                        arrayList.set(i, iVar.m15727x(next2));
                                        z = false;
                                    }
                                }
                            }
                        }
                    }
                }
                if (dVar != null) {
                    if (b == C10892f0.f24174z) {
                        pVar = dVar.m11582M();
                    } else if (b == C10892f0.f38898C || b == C10892f0.f38899D) {
                        pVar = dVar.m11592C();
                    } else if (b == C10892f0.f38900E) {
                        pVar = dVar.m11575g();
                    } else {
                        pVar = b == C10892f0.f38902G ? dVar.m11574h() : null;
                    }
                    if (pVar != null) {
                        arrayList.set(i, iVar.m15727x(pVar));
                    }
                    z = false;
                }
            }
            this.f21347l = z;
            this.f21348m = ((Boolean) this.f21338c.mo15674c(C8627a.f19069r, Boolean.FALSE)).booleanValue();
            this.f21349n = m15853x();
            this.f21351p = arrayList.size();
            this.f21339d = m15863n(arrayList);
            this.f21352q = m15854w();
            return;
        }
        throw new NullPointerException("Missing global format attributes.");
    }

    private C9637c(C9637c<T> cVar, Map<AbstractC8079p<?>, Object> map) {
        C9642e<?> eVar = cVar.f21337b;
        C8087x<?> e = eVar == null ? null : eVar.m15792e();
        for (AbstractC8079p<?> pVar : map.keySet()) {
            m15867j(cVar.f21336a, e, pVar);
        }
        this.f21336a = cVar.f21336a;
        this.f21337b = cVar.f21337b;
        this.f21350o = cVar.f21350o;
        this.f21338c = cVar.f21338c;
        this.f21346k = cVar.f21346k;
        this.f21341f = cVar.f21341f;
        this.f21342g = cVar.f21342g;
        this.f21343h = cVar.f21343h;
        this.f21344i = cVar.f21344i;
        this.f21345j = cVar.f21345j;
        this.f21348m = cVar.f21348m;
        HashMap hashMap = new HashMap(cVar.f21340e);
        boolean z = cVar.f21347l;
        for (AbstractC8079p<?> pVar2 : map.keySet()) {
            Object obj = map.get(pVar2);
            if (obj == null) {
                hashMap.remove(pVar2);
            } else {
                hashMap.put(pVar2, obj);
                z = z && C9678v.m15639W(pVar2);
            }
        }
        this.f21340e = Collections.unmodifiableMap(hashMap);
        this.f21347l = z;
        this.f21349n = m15853x();
        this.f21351p = cVar.f21351p;
        this.f21339d = m15863n(cVar.f21339d);
        this.f21352q = m15854w();
    }
}
