package net.time4j;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.text.ParsePosition;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import net.time4j.base.AbstractC10811a;
import net.time4j.base.AbstractC10814d;
import net.time4j.base.C10812b;
import net.time4j.base.C10813c;
import p143hj.AbstractC8046c;
import p143hj.AbstractC8048d;
import p143hj.AbstractC8050e;
import p143hj.AbstractC8075n;
import p143hj.AbstractC8077o;
import p143hj.AbstractC8079p;
import p143hj.AbstractC8080q;
import p143hj.AbstractC8091z;
import p143hj.C8087x;
import p161ij.AbstractC8657l;
import p161ij.AbstractC8669t;
import p161ij.AbstractC8684y;
import p161ij.C8627a;
import p161ij.C8629b;
import p161ij.C8668s;
import p161ij.EnumC8658m;
import p161ij.EnumC8671v;
import p163j$.util.concurrent.ConcurrentHashMap;

/* renamed from: net.time4j.z0 */
/* loaded from: classes8.dex */
public final class C11045z0 implements Serializable {
    private static final long serialVersionUID = 7794495882610436763L;

    /* renamed from: v */
    private static final Map<Locale, C11045z0> f24546v = new ConcurrentHashMap();

    /* renamed from: w */
    public static final C11045z0 f24547w = new C11045z0(EnumC11039x0.MONDAY, 4, EnumC11039x0.SATURDAY, EnumC11039x0.SUNDAY);

    /* renamed from: x */
    private static final AbstractC8684y f24548x;

    /* renamed from: k */
    private final transient EnumC11039x0 f24549k;

    /* renamed from: l */
    private final transient int f24550l;

    /* renamed from: m */
    private final transient EnumC11039x0 f24551m;

    /* renamed from: n */
    private final transient EnumC11039x0 f24552n;

    /* renamed from: o */
    private final transient AbstractC10819c<Integer, C10892f0> f24553o;

    /* renamed from: p */
    private final transient AbstractC10819c<Integer, C10892f0> f24554p;

    /* renamed from: q */
    private final transient AbstractC10819c<Integer, C10892f0> f24555q;

    /* renamed from: r */
    private final transient AbstractC10819c<Integer, C10892f0> f24556r;

    /* renamed from: s */
    private final transient AbstractC10820c0<EnumC11039x0> f24557s;

    /* renamed from: t */
    private final transient Set<AbstractC8079p<?>> f24558t;

    /* renamed from: u */
    private final transient AbstractC8075n<AbstractC10811a> f24559u;

    /* renamed from: net.time4j.z0$a */
    /* loaded from: classes8.dex */
    class C11046a implements AbstractC8075n<AbstractC10811a> {

        /* renamed from: k */
        final /* synthetic */ EnumC11039x0 f24560k;

        /* renamed from: l */
        final /* synthetic */ EnumC11039x0 f24561l;

        C11046a(EnumC11039x0 x0Var, EnumC11039x0 x0Var2) {
            this.f24560k = x0Var;
            this.f24561l = x0Var2;
        }

        /* renamed from: a */
        public boolean test(AbstractC10811a aVar) {
            EnumC11039x0 f = EnumC11039x0.m11154f(C10812b.m12213c(aVar.mo11643m(), aVar.mo11642n(), aVar.mo11641o()));
            if (f == this.f24560k || f == this.f24561l) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: net.time4j.z0$b */
    /* loaded from: classes8.dex */
    private static class C11047b<T extends AbstractC8080q<T>> implements AbstractC8091z<T, Integer> {

        /* renamed from: k */
        private final C11049d f24563k;

        /* synthetic */ C11047b(C11049d dVar, C11046a aVar) {
            this(dVar);
        }

        /* renamed from: a */
        private AbstractC8079p<?> m11123a(T t, boolean z) {
            int i;
            C10892f0 f0Var = (C10892f0) t.mo11371r(C10892f0.f24172x);
            AbstractC10820c0<EnumC11039x0> i2 = this.f24563k.m11091H().m11130i();
            int intValue = mo11076n(t).intValue();
            if (z) {
                if (this.f24563k.m11089J()) {
                    i = 52;
                } else {
                    i = 4;
                }
                if (intValue >= i) {
                    C10892f0 f0Var2 = (C10892f0) f0Var.mo15654D(i2, t.mo11380b(i2));
                    if (this.f24563k.m11089J()) {
                        if (f0Var2.m11881F0() < f0Var.m11881F0()) {
                            return C10892f0.f38902G;
                        }
                    } else if (f0Var2.mo11641o() < f0Var.mo11641o()) {
                        return C10892f0.f38900E;
                    }
                }
            } else if (intValue <= 1) {
                C10892f0 f0Var3 = (C10892f0) f0Var.mo15654D(i2, t.mo11373k(i2));
                if (this.f24563k.m11089J()) {
                    if (f0Var3.m11881F0() > f0Var.m11881F0()) {
                        return C10892f0.f38902G;
                    }
                } else if (f0Var3.mo11641o() > f0Var.mo11641o()) {
                    return C10892f0.f38900E;
                }
            }
            return i2;
        }

        /* renamed from: i */
        private int m11120i(C10892f0 f0Var) {
            if (!this.f24563k.m11089J()) {
                return C10812b.m12212d(f0Var.mo11643m(), f0Var.mo11642n());
            }
            if (C10812b.m12211e(f0Var.mo11643m())) {
                return 366;
            }
            return 365;
        }

        /* renamed from: j */
        private int m11119j(C10892f0 f0Var) {
            return m11113t(f0Var, 1);
        }

        /* renamed from: p */
        private int m11117p(C10892f0 f0Var) {
            return m11113t(f0Var, -1);
        }

        /* renamed from: s */
        private int m11114s(C10892f0 f0Var) {
            return m11113t(f0Var, 0);
        }

        /* renamed from: t */
        private int m11113t(C10892f0 f0Var, int i) {
            int i2;
            int i3;
            if (this.f24563k.m11089J()) {
                i2 = f0Var.m11881F0();
            } else {
                i2 = f0Var.mo11641o();
            }
            int c = C11045z0.m11136c((f0Var.m11880G0() - i2) + 1).m11157c(this.f24563k.m11091H());
            if (c <= 8 - this.f24563k.m11091H().m11132g()) {
                i3 = 2 - c;
            } else {
                i3 = 9 - c;
            }
            if (i == -1) {
                i2 = 1;
            } else if (i != 0) {
                if (i == 1) {
                    i2 = m11120i(f0Var);
                } else {
                    throw new AssertionError("Unexpected: " + i);
                }
            }
            return C10813c.m12202a(i2 - i3, 7) + 1;
        }

        /* renamed from: v */
        private C10892f0 m11111v(C10892f0 f0Var, int i) {
            int s = m11114s(f0Var);
            if (i == s) {
                return f0Var;
            }
            return f0Var.m11863W0(f0Var.m11880G0() + ((i - s) * 7));
        }

        /* renamed from: e */
        public AbstractC8079p<?> mo11086b(T t) {
            return m11123a(t, true);
        }

        /* renamed from: f */
        public AbstractC8079p<?> mo11085c(T t) {
            return m11123a(t, false);
        }

        /* renamed from: o */
        public Integer mo11084d(T t) {
            return Integer.valueOf(m11119j((C10892f0) t.mo11371r(C10892f0.f24172x)));
        }

        /* renamed from: q */
        public Integer mo11078k(T t) {
            return Integer.valueOf(m11117p((C10892f0) t.mo11371r(C10892f0.f24172x)));
        }

        /* renamed from: r */
        public Integer mo11076n(T t) {
            return Integer.valueOf(m11114s((C10892f0) t.mo11371r(C10892f0.f24172x)));
        }

        /* renamed from: u */
        public boolean mo11081h(T t, Integer num) {
            if (num == null) {
                return false;
            }
            int intValue = num.intValue();
            C10892f0 f0Var = (C10892f0) t.mo11371r(C10892f0.f24172x);
            if (intValue < m11117p(f0Var) || intValue > m11119j(f0Var)) {
                return false;
            }
            return true;
        }

        /* renamed from: w */
        public T mo11077m(T t, Integer num, boolean z) {
            AbstractC8079p<C10892f0> pVar = C10892f0.f24172x;
            C10892f0 f0Var = (C10892f0) t.mo11371r(pVar);
            if (num != null && (z || mo11081h(t, num))) {
                return (T) t.mo15654D(pVar, m11111v(f0Var, num.intValue()));
            }
            throw new IllegalArgumentException("Invalid value: " + num + " (context=" + t + ")");
        }

        private C11047b(C11049d dVar) {
            this.f24563k = dVar;
        }
    }

    /* renamed from: net.time4j.z0$c */
    /* loaded from: classes8.dex */
    private static class C11048c<T extends AbstractC8080q<T>> implements AbstractC8091z<T, Integer> {

        /* renamed from: k */
        private final C11049d f24564k;

        /* synthetic */ C11048c(C11049d dVar, C11046a aVar) {
            this(dVar);
        }

        /* renamed from: a */
        private int m11109a(C10892f0 f0Var) {
            int i;
            if (this.f24564k.m11089J()) {
                i = f0Var.m11881F0();
            } else {
                i = f0Var.mo11641o();
            }
            int j = m11105j(f0Var, 0);
            if (j <= i) {
                int i2 = ((i - j) / 7) + 1;
                if ((i2 >= 53 || (!this.f24564k.m11089J() && i2 >= 5)) && m11105j(f0Var, 1) + m11104o(f0Var, 0) <= i) {
                    return 1;
                }
                return i2;
            }
            return (((i + m11104o(f0Var, -1)) - m11105j(f0Var, -1)) / 7) + 1;
        }

        /* renamed from: e */
        private AbstractC8079p<?> m11108e() {
            return this.f24564k.m11091H().m11130i();
        }

        /* renamed from: j */
        private int m11105j(C10892f0 f0Var, int i) {
            EnumC11039x0 t = m11099t(f0Var, i);
            C11045z0 H = this.f24564k.m11091H();
            int c = t.m11157c(H);
            if (c <= 8 - H.m11132g()) {
                return 2 - c;
            }
            return 9 - c;
        }

        /* renamed from: o */
        private int m11104o(C10892f0 f0Var, int i) {
            if (!this.f24564k.m11089J()) {
                int m = f0Var.mo11643m();
                int n = f0Var.mo11642n() + i;
                if (n == 0) {
                    m--;
                    n = 12;
                } else if (n == 13) {
                    m++;
                    n = 1;
                }
                return C10812b.m12212d(m, n);
            } else if (C10812b.m12211e(f0Var.mo11643m() + i)) {
                return 366;
            } else {
                return 365;
            }
        }

        /* renamed from: p */
        private int m11103p(C10892f0 f0Var) {
            int i;
            if (this.f24564k.m11089J()) {
                i = f0Var.m11881F0();
            } else {
                i = f0Var.mo11641o();
            }
            int j = m11105j(f0Var, 0);
            if (j <= i) {
                int j2 = m11105j(f0Var, 1) + m11104o(f0Var, 0);
                if (j2 <= i) {
                    try {
                        int j3 = m11105j(f0Var, 1);
                        j2 = m11105j(f0Var, 2) + m11104o(f0Var, 1);
                        j = j3;
                    } catch (RuntimeException unused) {
                        j2 += 7;
                    }
                }
                return (j2 - j) / 7;
            }
            return ((j + m11104o(f0Var, -1)) - m11105j(f0Var, -1)) / 7;
        }

        /* renamed from: t */
        private EnumC11039x0 m11099t(C10892f0 f0Var, int i) {
            if (this.f24564k.m11089J()) {
                return EnumC11039x0.m11154f(C10812b.m12213c(f0Var.mo11643m() + i, 1, 1));
            }
            int m = f0Var.mo11643m();
            int n = f0Var.mo11642n() + i;
            if (n == 0) {
                m--;
                n = 12;
            } else if (n == 13) {
                m++;
                n = 1;
            } else if (n == 14) {
                m++;
                n = 2;
            }
            return EnumC11039x0.m11154f(C10812b.m12213c(m, n, 1));
        }

        /* renamed from: v */
        private C10892f0 m11097v(C10892f0 f0Var, int i) {
            int a = m11109a(f0Var);
            if (i == a) {
                return f0Var;
            }
            return f0Var.m11863W0(f0Var.m11880G0() + ((i - a) * 7));
        }

        /* renamed from: f */
        public AbstractC8079p<?> mo11086b(T t) {
            return m11108e();
        }

        /* renamed from: i */
        public AbstractC8079p<?> mo11085c(T t) {
            return m11108e();
        }

        /* renamed from: q */
        public Integer mo11084d(T t) {
            return Integer.valueOf(m11103p((C10892f0) t.mo11371r(C10892f0.f24172x)));
        }

        /* renamed from: r */
        public Integer mo11078k(T t) {
            return 1;
        }

        /* renamed from: s */
        public Integer mo11076n(T t) {
            return Integer.valueOf(m11109a((C10892f0) t.mo11371r(C10892f0.f24172x)));
        }

        /* renamed from: u */
        public boolean mo11081h(T t, Integer num) {
            if (num == null) {
                return false;
            }
            int intValue = num.intValue();
            if (this.f24564k.m11089J() && intValue >= 1 && intValue <= 52) {
                return true;
            }
            if (this.f24564k.m11089J() && intValue != 53) {
                return false;
            }
            C10892f0 f0Var = (C10892f0) t.mo11371r(C10892f0.f24172x);
            if (intValue < 1 || intValue > m11103p(f0Var)) {
                return false;
            }
            return true;
        }

        /* renamed from: w */
        public T mo11077m(T t, Integer num, boolean z) {
            AbstractC8079p<C10892f0> pVar = C10892f0.f24172x;
            C10892f0 f0Var = (C10892f0) t.mo11371r(pVar);
            if (num != null && (z || mo11081h(t, num))) {
                return (T) t.mo15654D(pVar, m11097v(f0Var, num.intValue()));
            }
            throw new IllegalArgumentException("Invalid value: " + num + " (context=" + t + ")");
        }

        private C11048c(C11049d dVar) {
            this.f24564k = dVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: net.time4j.z0$d */
    /* loaded from: classes8.dex */
    public class C11049d extends AbstractC10778a<Integer> {
        private static final long serialVersionUID = -5936254509996557266L;
        private final int category;

        C11049d(String str, int i) {
            super(str);
            this.category = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: H */
        public C11045z0 m11091H() {
            return C11045z0.this;
        }

        /* renamed from: I */
        private boolean m11090I() {
            return this.category >= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: J */
        public boolean m11089J() {
            return this.category % 2 == 0;
        }

        private Object readResolve() {
            C11045z0 H = m11091H();
            int i = this.category;
            if (i == 0) {
                return H.m11125n();
            }
            if (i == 1) {
                return H.m11126m();
            }
            if (i == 2) {
                return H.m11137b();
            }
            if (i == 3) {
                return H.m11138a();
            }
            throw new InvalidObjectException("Unknown category: " + this.category);
        }

        /* renamed from: F */
        public Integer mo11059f() {
            return Integer.valueOf(m11089J() ? 52 : 5);
        }

        /* renamed from: G */
        public Integer mo11062T() {
            return 1;
        }

        @Override // p143hj.AbstractC8079p
        /* renamed from: M */
        public boolean mo11063M() {
            return true;
        }

        @Override // p143hj.AbstractC8079p
        /* renamed from: U */
        public boolean mo11061U() {
            return false;
        }

        @Override // p143hj.AbstractC8050e, p143hj.AbstractC8079p
        /* renamed from: a */
        public char mo11060a() {
            int i = this.category;
            if (i == 0) {
                return 'w';
            }
            if (i != 1) {
                return super.mo11060a();
            }
            return 'W';
        }

        @Override // p143hj.AbstractC8079p
        public Class<Integer> getType() {
            return Integer.class;
        }

        @Override // p143hj.AbstractC8050e, p143hj.AbstractC8079p
        /* renamed from: i */
        public boolean mo11088i() {
            return true;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p143hj.AbstractC8050e
        /* renamed from: q */
        public <T extends AbstractC8080q<T>> AbstractC8091z<T, Integer> mo11057q(C8087x<T> xVar) {
            if (!xVar.m20657A(C10892f0.f24172x)) {
                return null;
            }
            if (m11090I()) {
                return new C11047b(this, null);
            }
            return new C11048c(this, null);
        }

        @Override // p143hj.AbstractC8050e
        /* renamed from: s */
        protected boolean mo11055s(AbstractC8050e<?> eVar) {
            return m11091H().equals(((C11049d) eVar).m11091H());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p143hj.AbstractC8050e
        /* renamed from: v */
        public AbstractC8079p<?> mo11053v() {
            return C10892f0.f38904I;
        }
    }

    /* renamed from: net.time4j.z0$e */
    /* loaded from: classes8.dex */
    private static class C11050e<T extends AbstractC8080q<T>> implements AbstractC8091z<T, EnumC11039x0> {

        /* renamed from: k */
        final C11051f f24565k;

        /* synthetic */ C11050e(C11051f fVar, C11046a aVar) {
            this(fVar);
        }

        /* renamed from: a */
        private AbstractC8079p<?> m11087a(T t) {
            AbstractC8079p<C10906g0> pVar = C10906g0.f24207y;
            if (t.mo11377e(pVar)) {
                return pVar;
            }
            return null;
        }

        /* renamed from: e */
        public AbstractC8079p<?> mo11086b(T t) {
            return m11087a(t);
        }

        /* renamed from: f */
        public AbstractC8079p<?> mo11085c(T t) {
            return m11087a(t);
        }

        /* renamed from: i */
        public EnumC11039x0 mo11084d(T t) {
            C10892f0 f0Var = (C10892f0) t.mo11371r(C10892f0.f24172x);
            if ((f0Var.mo12079c() + 7) - f0Var.m11882E0().m11157c(this.f24565k.m11067H()) > C10892f0.m11835v0().mo20650n().mo11791a()) {
                return EnumC11039x0.FRIDAY;
            }
            return this.f24565k.mo11059f();
        }

        /* renamed from: j */
        public EnumC11039x0 mo11078k(T t) {
            C10892f0 f0Var = (C10892f0) t.mo11371r(C10892f0.f24172x);
            if ((f0Var.mo12079c() + 1) - f0Var.m11882E0().m11157c(this.f24565k.m11067H()) < C10892f0.m11835v0().mo20650n().mo11788d()) {
                return EnumC11039x0.MONDAY;
            }
            return this.f24565k.mo11062T();
        }

        /* renamed from: o */
        public EnumC11039x0 mo11076n(T t) {
            return ((C10892f0) t.mo11371r(C10892f0.f24172x)).m11882E0();
        }

        /* renamed from: p */
        public boolean mo11081h(T t, EnumC11039x0 x0Var) {
            if (x0Var == null) {
                return false;
            }
            try {
                mo11077m(t, x0Var, false);
                return true;
            } catch (RuntimeException unused) {
                return false;
            }
        }

        /* renamed from: q */
        public T mo11077m(T t, EnumC11039x0 x0Var, boolean z) {
            if (x0Var != null) {
                AbstractC8079p<C10892f0> pVar = C10892f0.f24172x;
                C10892f0 f0Var = (C10892f0) t.mo11371r(pVar);
                long G0 = f0Var.m11880G0();
                EnumC11039x0 c = C11045z0.m11136c(G0);
                if (x0Var == c) {
                    return t;
                }
                return (T) t.mo15654D(pVar, f0Var.m11863W0((G0 + x0Var.m11157c(this.f24565k.m11067H())) - c.m11157c(this.f24565k.m11067H())));
            }
            throw new IllegalArgumentException("Missing weekday.");
        }

        private C11050e(C11051f fVar) {
            this.f24565k = fVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: net.time4j.z0$f */
    /* loaded from: classes8.dex */
    public class C11051f extends AbstractC10778a<EnumC11039x0> implements AbstractC10820c0<EnumC11039x0>, AbstractC8657l<EnumC11039x0>, AbstractC8669t<EnumC11039x0> {
        private static final long serialVersionUID = 1945670789283677398L;

        C11051f() {
            super("LOCAL_DAY_OF_WEEK");
        }

        /* renamed from: E */
        private C8668s m11070E(AbstractC8048d dVar, EnumC8658m mVar) {
            return C8629b.m18468d((Locale) dVar.mo15674c(C8627a.f19054c, Locale.ROOT)).m18456p((EnumC8671v) dVar.mo15674c(C8627a.f19058g, EnumC8671v.WIDE), mVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: H */
        public C11045z0 m11067H() {
            return C11045z0.this;
        }

        private Object readResolve() {
            return C11045z0.this.m11130i();
        }

        @Override // p161ij.AbstractC8657l
        /* renamed from: C */
        public boolean mo11072C(AbstractC8080q<?> qVar, int i) {
            EnumC11039x0[] values;
            for (EnumC11039x0 x0Var : EnumC11039x0.values()) {
                if (x0Var.m11157c(C11045z0.this) == i) {
                    qVar.mo15654D(this, x0Var);
                    return true;
                }
            }
            return false;
        }

        /* renamed from: F */
        public EnumC11039x0 mo11059f() {
            return C11045z0.this.m11133f().m11156d(6);
        }

        /* renamed from: G */
        public EnumC11039x0 mo11062T() {
            return C11045z0.this.m11133f();
        }

        /* renamed from: I */
        public int m11066I(EnumC11039x0 x0Var) {
            return x0Var.m11157c(C11045z0.this);
        }

        /* renamed from: J */
        public EnumC11039x0 mo11054u(CharSequence charSequence, ParsePosition parsePosition, AbstractC8048d dVar) {
            int index = parsePosition.getIndex();
            AbstractC8046c<EnumC8658m> cVar = C8627a.f19059h;
            EnumC8658m mVar = EnumC8658m.FORMAT;
            EnumC8658m mVar2 = (EnumC8658m) dVar.mo15674c(cVar, mVar);
            EnumC11039x0 x0Var = (EnumC11039x0) m11070E(dVar, mVar2).m18412c(charSequence, parsePosition, getType(), dVar);
            if (x0Var != null || !((Boolean) dVar.mo15674c(C8627a.f19062k, Boolean.TRUE)).booleanValue()) {
                return x0Var;
            }
            parsePosition.setErrorIndex(-1);
            parsePosition.setIndex(index);
            if (mVar2 == mVar) {
                mVar = EnumC8658m.STANDALONE;
            }
            return (EnumC11039x0) m11070E(dVar, mVar).m18412c(charSequence, parsePosition, getType(), dVar);
        }

        /* renamed from: K */
        public int mo11056r(EnumC11039x0 x0Var, AbstractC8077o oVar, AbstractC8048d dVar) {
            return m11066I(x0Var);
        }

        @Override // p143hj.AbstractC8079p
        /* renamed from: M */
        public boolean mo11063M() {
            return true;
        }

        @Override // p143hj.AbstractC8079p
        /* renamed from: U */
        public boolean mo11061U() {
            return false;
        }

        @Override // p143hj.AbstractC8050e, p143hj.AbstractC8079p
        /* renamed from: a */
        public char mo11060a() {
            return 'e';
        }

        @Override // p143hj.AbstractC8079p
        public Class<EnumC11039x0> getType() {
            return EnumC11039x0.class;
        }

        @Override // p143hj.AbstractC8050e
        /* renamed from: o */
        public int compare(AbstractC8077o oVar, AbstractC8077o oVar2) {
            int c = ((EnumC11039x0) oVar.mo11371r(this)).m11157c(C11045z0.this);
            int c2 = ((EnumC11039x0) oVar2.mo11371r(this)).m11157c(C11045z0.this);
            if (c < c2) {
                return -1;
            }
            if (c == c2) {
                return 0;
            }
            return 1;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p143hj.AbstractC8050e
        /* renamed from: q */
        public <T extends AbstractC8080q<T>> AbstractC8091z<T, EnumC11039x0> mo11057q(C8087x<T> xVar) {
            if (xVar.m20657A(C10892f0.f24172x)) {
                return new C11050e(this, null);
            }
            return null;
        }

        @Override // p143hj.AbstractC8050e
        /* renamed from: s */
        protected boolean mo11055s(AbstractC8050e<?> eVar) {
            return m11067H().equals(((C11051f) eVar).m11067H());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p143hj.AbstractC8050e
        /* renamed from: v */
        public AbstractC8079p<?> mo11053v() {
            return C10892f0.f38901F;
        }

        @Override // p161ij.AbstractC8669t
        /* renamed from: z */
        public void mo11052z(AbstractC8077o oVar, Appendable appendable, AbstractC8048d dVar) {
            appendable.append(m11070E(dVar, (EnumC8658m) dVar.mo15674c(C8627a.f19059h, EnumC8658m.FORMAT)).m18409f((Enum) oVar.mo11371r(this)));
        }
    }

    static {
        AbstractC8684y yVar;
        Iterator it = AbstractC10814d.m12187c().mo12183g(AbstractC8684y.class).iterator();
        if (it.hasNext()) {
            yVar = (AbstractC8684y) it.next();
        } else {
            yVar = null;
        }
        f24548x = yVar;
    }

    private C11045z0(EnumC11039x0 x0Var, int i, EnumC11039x0 x0Var2, EnumC11039x0 x0Var3) {
        if (x0Var == null) {
            throw new NullPointerException("Missing first day of week.");
        } else if (i < 1 || i > 7) {
            throw new IllegalArgumentException("Minimal days in first week out of range: " + i);
        } else if (x0Var2 == null) {
            throw new NullPointerException("Missing start of weekend.");
        } else if (x0Var3 != null) {
            this.f24549k = x0Var;
            this.f24550l = i;
            this.f24551m = x0Var2;
            this.f24552n = x0Var3;
            C11049d dVar = new C11049d("WEEK_OF_YEAR", 0);
            this.f24553o = dVar;
            C11049d dVar2 = new C11049d("WEEK_OF_MONTH", 1);
            this.f24554p = dVar2;
            C11049d dVar3 = new C11049d("BOUNDED_WEEK_OF_YEAR", 2);
            this.f24555q = dVar3;
            C11049d dVar4 = new C11049d("BOUNDED_WEEK_OF_MONTH", 3);
            this.f24556r = dVar4;
            C11051f fVar = new C11051f();
            this.f24557s = fVar;
            this.f24559u = new C11046a(x0Var2, x0Var3);
            HashSet hashSet = new HashSet();
            hashSet.add(dVar);
            hashSet.add(dVar2);
            hashSet.add(fVar);
            hashSet.add(dVar3);
            hashSet.add(dVar4);
            this.f24558t = Collections.unmodifiableSet(hashSet);
        } else {
            throw new NullPointerException("Missing end of weekend.");
        }
    }

    /* renamed from: c */
    static EnumC11039x0 m11136c(long j) {
        return EnumC11039x0.m11154f(C10813c.m12199d(j + 5, 7) + 1);
    }

    /* renamed from: j */
    public static C11045z0 m11129j(Locale locale) {
        int i;
        if (locale.getCountry().isEmpty()) {
            return f24547w;
        }
        Map<Locale, C11045z0> map = f24546v;
        C11045z0 z0Var = map.get(locale);
        if (z0Var != null) {
            return z0Var;
        }
        AbstractC8684y yVar = f24548x;
        if (yVar == null) {
            GregorianCalendar gregorianCalendar = new GregorianCalendar(locale);
            int firstDayOfWeek = gregorianCalendar.getFirstDayOfWeek();
            if (firstDayOfWeek == 1) {
                i = 7;
            } else {
                i = firstDayOfWeek - 1;
            }
            return m11128k(EnumC11039x0.m11154f(i), gregorianCalendar.getMinimalDaysInFirstWeek());
        }
        C11045z0 z0Var2 = new C11045z0(EnumC11039x0.m11154f(yVar.mo10623d(locale)), yVar.mo10625b(locale), EnumC11039x0.m11154f(yVar.mo10624c(locale)), EnumC11039x0.m11154f(yVar.mo10626a(locale)));
        if (map.size() > 150) {
            map.clear();
        }
        map.put(locale, z0Var2);
        return z0Var2;
    }

    /* renamed from: k */
    public static C11045z0 m11128k(EnumC11039x0 x0Var, int i) {
        return m11127l(x0Var, i, EnumC11039x0.SATURDAY, EnumC11039x0.SUNDAY);
    }

    /* renamed from: l */
    public static C11045z0 m11127l(EnumC11039x0 x0Var, int i, EnumC11039x0 x0Var2, EnumC11039x0 x0Var3) {
        if (x0Var == EnumC11039x0.MONDAY && i == 4 && x0Var2 == EnumC11039x0.SATURDAY && x0Var3 == EnumC11039x0.SUNDAY) {
            return f24547w;
        }
        return new C11045z0(x0Var, i, x0Var2, x0Var3);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    private Object writeReplace() {
        return new SPX(this, 3);
    }

    /* renamed from: a */
    public AbstractC10819c<Integer, C10892f0> m11138a() {
        return this.f24556r;
    }

    /* renamed from: b */
    public AbstractC10819c<Integer, C10892f0> m11137b() {
        return this.f24555q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public Set<AbstractC8079p<?>> m11135d() {
        return this.f24558t;
    }

    /* renamed from: e */
    public EnumC11039x0 m11134e() {
        return this.f24552n;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11045z0)) {
            return false;
        }
        C11045z0 z0Var = (C11045z0) obj;
        if (this.f24549k == z0Var.f24549k && this.f24550l == z0Var.f24550l && this.f24551m == z0Var.f24551m && this.f24552n == z0Var.f24552n) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public EnumC11039x0 m11133f() {
        return this.f24549k;
    }

    /* renamed from: g */
    public int m11132g() {
        return this.f24550l;
    }

    /* renamed from: h */
    public EnumC11039x0 m11131h() {
        return this.f24551m;
    }

    public int hashCode() {
        return (this.f24549k.name().hashCode() * 17) + (this.f24550l * 37);
    }

    /* renamed from: i */
    public AbstractC10820c0<EnumC11039x0> m11130i() {
        return this.f24557s;
    }

    /* renamed from: m */
    public AbstractC10819c<Integer, C10892f0> m11126m() {
        return this.f24554p;
    }

    /* renamed from: n */
    public AbstractC10819c<Integer, C10892f0> m11125n() {
        return this.f24553o;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append(C11045z0.class.getName());
        sb2.append("[firstDayOfWeek=");
        sb2.append(this.f24549k);
        sb2.append(",minimalDaysInFirstWeek=");
        sb2.append(this.f24550l);
        sb2.append(",startOfWeekend=");
        sb2.append(this.f24551m);
        sb2.append(",endOfWeekend=");
        sb2.append(this.f24552n);
        sb2.append(']');
        return sb2.toString();
    }
}
