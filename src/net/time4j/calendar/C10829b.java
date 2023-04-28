package net.time4j.calendar;

import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import net.time4j.C11045z0;
import net.time4j.EnumC11039x0;
import net.time4j.base.C10813c;
import net.time4j.calendar.service.C10875e;
import net.time4j.calendar.service.C10876f;
import p143hj.AbstractC8048d;
import p143hj.AbstractC8050e;
import p143hj.AbstractC8070l;
import p143hj.AbstractC8077o;
import p143hj.AbstractC8079p;
import p143hj.AbstractC8080q;
import p143hj.AbstractC8082s;
import p143hj.AbstractC8091z;
import p143hj.C8087x;
import p143hj.EnumC8042a0;

/* renamed from: net.time4j.calendar.b */
/* loaded from: classes8.dex */
public class C10829b {

    /* renamed from: a */
    public static final AbstractC8079p<Integer> f24026a = C10858m.f24062k;

    /* renamed from: net.time4j.calendar.b$b */
    /* loaded from: classes8.dex */
    private static class C0349b<D extends AbstractC8080q<D>> implements AbstractC8091z<D, Integer> {

        /* renamed from: k */
        private final C10832d<?> f24027k;

        /* renamed from: a */
        private AbstractC8079p<?> m12151a(D d, boolean z) {
            C10834f X = C10834f.m12110X(d.getClass(), ((C10832d) this.f24027k).model);
            int r = m12143r(d);
            EnumC8042a0 a0Var = EnumC8042a0.UTC;
            long longValue = ((Long) d.mo11371r(a0Var)).longValue();
            int s = d.mo11370s(((C10832d) this.f24027k).dayElement);
            if (z) {
                if (((Integer) d.mo11380b(((C10832d) this.f24027k).dayElement)).intValue() < s + (((Long) d.mo15654D(X, d.mo11380b(X)).mo11371r(a0Var)).longValue() - longValue)) {
                    return ((C10832d) this.f24027k).dayElement;
                }
            } else if (r <= 1) {
                if (((Integer) d.mo11373k(((C10832d) this.f24027k).dayElement)).intValue() > s - (longValue - ((Long) d.mo15654D(X, d.mo11373k(X)).mo11371r(a0Var)).longValue())) {
                    return ((C10832d) this.f24027k).dayElement;
                }
            }
            return X;
        }

        /* renamed from: i */
        private int m12148i(D d) {
            return m12142s(d, 1);
        }

        /* renamed from: o */
        private int m12146o(D d) {
            return m12142s(d, -1);
        }

        /* renamed from: r */
        private int m12143r(D d) {
            return m12142s(d, 0);
        }

        /* renamed from: s */
        private int m12142s(D d, int i) {
            int i2;
            int s = d.mo11370s(((C10832d) this.f24027k).dayElement);
            int c = C10829b.m12153c((((Long) d.mo11371r(EnumC8042a0.UTC)).longValue() - s) + 1).m11157c(((C10832d) this.f24027k).model);
            if (c <= 8 - ((C10832d) this.f24027k).model.m11132g()) {
                i2 = 2 - c;
            } else {
                i2 = 9 - c;
            }
            if (i == -1) {
                s = 1;
            } else if (i != 0) {
                if (i == 1) {
                    s = ((Integer) d.mo11380b(((C10832d) this.f24027k).dayElement)).intValue();
                } else {
                    throw new AssertionError("Unexpected: " + i);
                }
            }
            return C10813c.m12202a(s - i2, 7) + 1;
        }

        /* renamed from: u */
        private D m12140u(D d, int i) {
            int r = m12143r(d);
            if (i == r) {
                return d;
            }
            EnumC8042a0 a0Var = EnumC8042a0.UTC;
            return (D) d.m20661C(a0Var, ((Long) d.mo11371r(a0Var)).longValue() + ((i - r) * 7));
        }

        /* renamed from: e */
        public AbstractC8079p<?> mo11086b(D d) {
            return m12151a(d, true);
        }

        /* renamed from: f */
        public AbstractC8079p<?> mo11085c(D d) {
            return m12151a(d, false);
        }

        /* renamed from: j */
        public Integer mo11084d(D d) {
            return Integer.valueOf(m12148i(d));
        }

        /* renamed from: p */
        public Integer mo11078k(D d) {
            return Integer.valueOf(m12146o(d));
        }

        /* renamed from: q */
        public Integer mo11076n(D d) {
            return Integer.valueOf(m12143r(d));
        }

        /* renamed from: t */
        public boolean mo11081h(D d, Integer num) {
            int intValue;
            if (num != null && (intValue = num.intValue()) >= m12146o(d) && intValue <= m12148i(d)) {
                return true;
            }
            return false;
        }

        /* renamed from: v */
        public D mo11077m(D d, Integer num, boolean z) {
            if (num != null && (z || mo11081h(d, num))) {
                return m12140u(d, num.intValue());
            }
            throw new IllegalArgumentException("Invalid value: " + num + " (context=" + d + ")");
        }

        private C0349b(C10832d<?> dVar) {
            this.f24027k = dVar;
        }
    }

    /* renamed from: net.time4j.calendar.b$c */
    /* loaded from: classes8.dex */
    private static class C10831c<D extends AbstractC8080q<D>> implements AbstractC8091z<D, Integer> {

        /* renamed from: k */
        private final C10832d<?> f24028k;

        /* renamed from: a */
        private int m12138a(D d) {
            int o;
            int s = d.mo11370s(((C10832d) this.f24028k).dayElement);
            int j = m12134j(d, 0);
            if (j > s) {
                o = ((s + m12133o(d, -1)) - m12134j(d, -1)) / 7;
            } else if (m12134j(d, 1) + m12133o(d, 0) <= s) {
                return 1;
            } else {
                o = (s - j) / 7;
            }
            return o + 1;
        }

        /* renamed from: e */
        private AbstractC8079p<?> m12137e(Object obj) {
            return new C10834f((Class) obj, ((C10832d) this.f24028k).model);
        }

        /* renamed from: j */
        private int m12134j(D d, int i) {
            EnumC11039x0 t = m12128t(d, i);
            C11045z0 z0Var = ((C10832d) this.f24028k).model;
            int c = t.m11157c(z0Var);
            if (c <= 8 - z0Var.m11132g()) {
                return 2 - c;
            }
            return 9 - c;
        }

        /* renamed from: o */
        private int m12133o(D d, int i) {
            int s = d.mo11370s(((C10832d) this.f24028k).dayElement);
            if (i == -1) {
                AbstractC8079p pVar = ((C10832d) this.f24028k).dayElement;
                EnumC8042a0 a0Var = EnumC8042a0.UTC;
                return C10829b.m12152d(pVar, d.m20661C(a0Var, ((Long) d.mo11371r(a0Var)).longValue() - s));
            } else if (i == 0) {
                return C10829b.m12152d(((C10832d) this.f24028k).dayElement, d);
            } else {
                if (i == 1) {
                    int d2 = C10829b.m12152d(((C10832d) this.f24028k).dayElement, d);
                    AbstractC8079p pVar2 = ((C10832d) this.f24028k).dayElement;
                    EnumC8042a0 a0Var2 = EnumC8042a0.UTC;
                    return C10829b.m12152d(pVar2, d.m20661C(a0Var2, ((((Long) d.mo11371r(a0Var2)).longValue() + d2) + 1) - s));
                }
                throw new AssertionError("Unexpected: " + i);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: p */
        private int m12132p(D d) {
            int s = d.mo11370s(((C10832d) this.f24028k).dayElement);
            int j = m12134j(d, 0);
            if (j <= s) {
                int j2 = m12134j(d, 1) + m12133o(d, 0);
                if (j2 <= s) {
                    try {
                        int j3 = m12134j(d, 1);
                        EnumC8042a0 a0Var = EnumC8042a0.UTC;
                        j2 = m12134j(d.m20661C(a0Var, ((Long) d.mo11371r(a0Var)).longValue() + 7), 1) + m12133o(d, 1);
                        j = j3;
                    } catch (RuntimeException unused) {
                        j2 += 7;
                    }
                }
                return (j2 - j) / 7;
            }
            return ((j + m12133o(d, -1)) - m12134j(d, -1)) / 7;
        }

        /* renamed from: t */
        private EnumC11039x0 m12128t(D d, int i) {
            int s = d.mo11370s(((C10832d) this.f24028k).dayElement);
            if (i == -1) {
                EnumC8042a0 a0Var = EnumC8042a0.UTC;
                long longValue = ((Long) d.mo11371r(a0Var)).longValue() - s;
                return C10829b.m12153c((longValue - d.m20661C(a0Var, longValue).mo11370s(((C10832d) this.f24028k).dayElement)) + 1);
            } else if (i == 0) {
                return C10829b.m12153c((((Long) d.mo11371r(EnumC8042a0.UTC)).longValue() - s) + 1);
            } else {
                if (i == 1) {
                    return C10829b.m12153c(((((Long) d.mo11371r(EnumC8042a0.UTC)).longValue() + C10829b.m12152d(((C10832d) this.f24028k).dayElement, d)) + 1) - s);
                }
                throw new AssertionError("Unexpected: " + i);
            }
        }

        /* renamed from: v */
        private D m12126v(D d, int i) {
            int a = m12138a(d);
            if (i == a) {
                return d;
            }
            EnumC8042a0 a0Var = EnumC8042a0.UTC;
            return (D) d.m20661C(a0Var, ((Long) d.mo11371r(a0Var)).longValue() + ((i - a) * 7));
        }

        /* renamed from: f */
        public AbstractC8079p<?> mo11086b(D d) {
            return m12137e(d.getClass());
        }

        /* renamed from: i */
        public AbstractC8079p<?> mo11085c(D d) {
            return m12137e(d.getClass());
        }

        /* renamed from: q */
        public Integer mo11084d(D d) {
            return Integer.valueOf(m12132p(d));
        }

        /* renamed from: r */
        public Integer mo11078k(D d) {
            return 1;
        }

        /* renamed from: s */
        public Integer mo11076n(D d) {
            return Integer.valueOf(m12138a(d));
        }

        /* renamed from: u */
        public boolean mo11081h(D d, Integer num) {
            int intValue;
            if (num != null && (intValue = num.intValue()) >= 1 && intValue <= m12132p(d)) {
                return true;
            }
            return false;
        }

        /* renamed from: w */
        public D mo11077m(D d, Integer num, boolean z) {
            int intValue = num.intValue();
            if (z || mo11081h(d, num)) {
                return m12126v(d, intValue);
            }
            throw new IllegalArgumentException("Invalid value: " + intValue + " (context=" + d + ")");
        }

        private C10831c(C10832d<?> dVar) {
            this.f24028k = dVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: net.time4j.calendar.b$d */
    /* loaded from: classes8.dex */
    public static class C10832d<T extends AbstractC8080q<T>> extends C10876f<T> {
        private static final long serialVersionUID = -7471192143785466686L;
        private final boolean bounded;
        private final AbstractC8079p<Integer> dayElement;
        private final C11045z0 model;

        C10832d(String str, Class<T> cls, int i, int i2, char c, C11045z0 z0Var, AbstractC8079p<Integer> pVar, boolean z) {
            super(str, cls, i, i2, c);
            if (z0Var != null) {
                this.model = z0Var;
                this.dayElement = pVar;
                this.bounded = z;
                return;
            }
            throw new NullPointerException("Missing week model.");
        }

        /* renamed from: H */
        static <T extends AbstractC8080q<T>> C10832d<T> m12122H(String str, Class<T> cls, int i, int i2, char c, C11045z0 z0Var, AbstractC8079p<Integer> pVar, boolean z) {
            return new C10832d<>(str, cls, i, i2, c, z0Var, pVar, z);
        }

        @Override // p143hj.AbstractC8050e, p143hj.AbstractC8079p
        /* renamed from: i */
        public boolean mo11088i() {
            return true;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p143hj.AbstractC8050e
        /* renamed from: q */
        public <D extends AbstractC8080q<D>> AbstractC8091z<D, Integer> mo11057q(C8087x<D> xVar) {
            if (!m11919A().equals(xVar.m20648q())) {
                return null;
            }
            if (this.bounded) {
                return new C0349b(this);
            }
            return new C10831c(this);
        }

        @Override // net.time4j.calendar.service.AbstractC10874d
        protected Object readResolve() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // net.time4j.calendar.service.AbstractC10874d, p143hj.AbstractC8050e
        /* renamed from: s */
        public boolean mo11055s(AbstractC8050e<?> eVar) {
            if (!super.mo11055s(eVar)) {
                return false;
            }
            C10832d dVar = (C10832d) C10832d.class.cast(eVar);
            if (!this.model.equals(dVar.model) || this.bounded != dVar.bounded) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: net.time4j.calendar.b$e */
    /* loaded from: classes8.dex */
    private static class C10833e<T extends AbstractC8080q<T>> implements AbstractC8091z<T, EnumC11039x0> {

        /* renamed from: k */
        private final C10834f<?> f24029k;

        /* renamed from: a */
        public AbstractC8079p<?> mo11086b(T t) {
            return null;
        }

        /* renamed from: e */
        public AbstractC8079p<?> mo11085c(T t) {
            return null;
        }

        /* renamed from: f */
        public EnumC11039x0 mo11084d(T t) {
            long j;
            C8087x E = C8087x.m20655E(t.getClass());
            if (t instanceof AbstractC8070l) {
                j = E.mo20649o(((AbstractC8070l) AbstractC8070l.class.cast(t)).mo11570l()).mo11791a();
            } else {
                j = E.mo20650n().mo11791a();
            }
            long longValue = ((Long) t.mo11371r(EnumC8042a0.UTC)).longValue();
            if ((longValue + 7) - C10829b.m12153c(longValue).m11157c(((C10834f) this.f24029k).model) > j) {
                return C10829b.m12153c(j);
            }
            return this.f24029k.mo11059f();
        }

        /* renamed from: i */
        public EnumC11039x0 mo11078k(T t) {
            long j;
            C8087x E = C8087x.m20655E(t.getClass());
            if (t instanceof AbstractC8070l) {
                j = E.mo20649o(((AbstractC8070l) AbstractC8070l.class.cast(t)).mo11570l()).mo11788d();
            } else {
                j = E.mo20650n().mo11788d();
            }
            long longValue = ((Long) t.mo11371r(EnumC8042a0.UTC)).longValue();
            if ((longValue + 1) - C10829b.m12153c(longValue).m11157c(((C10834f) this.f24029k).model) < j) {
                return C10829b.m12153c(j);
            }
            return this.f24029k.mo11062T();
        }

        /* renamed from: j */
        public EnumC11039x0 mo11076n(T t) {
            return C10829b.m12153c(((Long) t.mo11371r(EnumC8042a0.UTC)).longValue());
        }

        /* renamed from: o */
        public boolean mo11081h(T t, EnumC11039x0 x0Var) {
            if (x0Var == null) {
                return false;
            }
            try {
                mo11077m(t, x0Var, false);
                return true;
            } catch (ArithmeticException | IllegalArgumentException unused) {
                return false;
            }
        }

        /* renamed from: p */
        public T mo11077m(T t, EnumC11039x0 x0Var, boolean z) {
            EnumC8042a0 a0Var = EnumC8042a0.UTC;
            long longValue = ((Long) t.mo11371r(a0Var)).longValue();
            EnumC11039x0 c = C10829b.m12153c(longValue);
            if (x0Var == c) {
                return t;
            }
            return (T) t.m20661C(a0Var, (longValue + x0Var.m11157c(((C10834f) this.f24029k).model)) - c.m11157c(((C10834f) this.f24029k).model));
        }

        private C10833e(C10834f<?> fVar) {
            this.f24029k = fVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: net.time4j.calendar.b$f */
    /* loaded from: classes8.dex */
    public static class C10834f<T extends AbstractC8080q<T>> extends C10875e<EnumC11039x0, T> {
        private static final long serialVersionUID = 5613494586572932860L;
        private final C11045z0 model;

        C10834f(Class<T> cls, C11045z0 z0Var) {
            super("LOCAL_DAY_OF_WEEK", cls, EnumC11039x0.class, 'e');
            this.model = z0Var;
        }

        /* renamed from: X */
        static <T extends AbstractC8080q<T>> C10834f<T> m12110X(Class<T> cls, C11045z0 z0Var) {
            return new C10834f<>(cls, z0Var);
        }

        @Override // net.time4j.calendar.service.C10875e
        /* renamed from: L */
        protected boolean mo11912L() {
            return true;
        }

        /* renamed from: S */
        public EnumC11039x0 mo11059f() {
            return this.model.m11133f().m11156d(6);
        }

        /* renamed from: V */
        public EnumC11039x0 mo11062T() {
            return this.model.m11133f();
        }

        /* renamed from: W */
        public int mo11904O(EnumC11039x0 x0Var) {
            return x0Var.m11157c(this.model);
        }

        @Override // p143hj.AbstractC8050e
        /* renamed from: o */
        public int compare(AbstractC8077o oVar, AbstractC8077o oVar2) {
            int c = ((EnumC11039x0) oVar.mo11371r(this)).m11157c(this.model);
            int c2 = ((EnumC11039x0) oVar2.mo11371r(this)).m11157c(this.model);
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
        public <D extends AbstractC8080q<D>> AbstractC8091z<D, EnumC11039x0> mo11057q(C8087x<D> xVar) {
            if (m11919A().equals(xVar.m20648q())) {
                return new C10833e(this);
            }
            return null;
        }

        @Override // net.time4j.calendar.service.AbstractC10874d
        protected Object readResolve() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // net.time4j.calendar.service.AbstractC10874d, p143hj.AbstractC8050e
        /* renamed from: s */
        public boolean mo11055s(AbstractC8050e<?> eVar) {
            if (super.mo11055s(eVar)) {
                return this.model.equals(((C10834f) C10834f.class.cast(eVar)).model);
            }
            return false;
        }
    }

    /* renamed from: net.time4j.calendar.b$g */
    /* loaded from: classes8.dex */
    static class C10835g implements AbstractC8082s {

        /* renamed from: a */
        private final Class<? extends AbstractC8080q> f24030a;

        /* renamed from: b */
        private final AbstractC8079p<Integer> f24031b;

        /* renamed from: c */
        private final AbstractC8079p<Integer> f24032c;

        /* renamed from: d */
        private final C11045z0 f24033d;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C10835g(Class<? extends AbstractC8080q> cls, AbstractC8079p<Integer> pVar, AbstractC8079p<Integer> pVar2, C11045z0 z0Var) {
            this.f24030a = cls;
            this.f24031b = pVar;
            this.f24032c = pVar2;
            this.f24033d = z0Var;
        }

        @Override // p143hj.AbstractC8082s
        /* renamed from: a */
        public AbstractC8080q<?> mo10716a(AbstractC8080q<?> qVar, Locale locale, AbstractC8048d dVar) {
            return qVar;
        }

        @Override // p143hj.AbstractC8082s
        /* renamed from: b */
        public Set<AbstractC8079p<?>> mo10715b(Locale locale, AbstractC8048d dVar) {
            C11045z0 z0Var;
            if (locale.getCountry().isEmpty()) {
                z0Var = this.f24033d;
            } else {
                z0Var = C11045z0.m11129j(locale);
            }
            HashSet hashSet = new HashSet();
            hashSet.add(C10834f.m12110X(this.f24030a, z0Var));
            hashSet.add(C10832d.m12122H("WEEK_OF_MONTH", this.f24030a, 1, 5, 'W', z0Var, this.f24031b, false));
            hashSet.add(C10832d.m12122H("WEEK_OF_YEAR", this.f24030a, 1, 52, 'w', z0Var, this.f24032c, false));
            hashSet.add(C10832d.m12122H("BOUNDED_WEEK_OF_MONTH", this.f24030a, 1, 5, (char) 0, z0Var, this.f24031b, true));
            hashSet.add(C10832d.m12122H("BOUNDED_WEEK_OF_YEAR", this.f24030a, 1, 52, (char) 0, z0Var, this.f24032c, true));
            return Collections.unmodifiableSet(hashSet);
        }

        @Override // p143hj.AbstractC8082s
        /* renamed from: c */
        public boolean mo10714c(Class<?> cls) {
            return this.f24030a.equals(cls);
        }

        @Override // p143hj.AbstractC8082s
        /* renamed from: d */
        public boolean mo10713d(AbstractC8079p<?> pVar) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static EnumC11039x0 m12153c(long j) {
        return EnumC11039x0.m11154f(C10813c.m12199d(j + 5, 7) + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static <D extends AbstractC8080q<D>> int m12152d(AbstractC8079p<?> pVar, D d) {
        return ((Integer) Integer.class.cast(d.mo11380b(pVar))).intValue();
    }
}
