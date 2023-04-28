package p161ij;

import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import net.time4j.p248tz.AbstractC11001k;
import net.time4j.p248tz.AbstractC11027o;
import p143hj.AbstractC8046c;
import p143hj.AbstractC8048d;
import p143hj.AbstractC8053f0;
import p143hj.C8087x;
import p271oj.EnumC11413f;

/* renamed from: ij.a */
/* loaded from: classes8.dex */
public final class C8627a implements AbstractC8048d {

    /* renamed from: b */
    public static final AbstractC8046c<String> f19053b = C8666q.m18415a("CALENDAR_TYPE", String.class);

    /* renamed from: c */
    public static final AbstractC8046c<Locale> f19054c = C8666q.m18415a("LANGUAGE", Locale.class);

    /* renamed from: d */
    public static final AbstractC8046c<AbstractC11001k> f19055d = C8666q.m18415a("TIMEZONE_ID", AbstractC11001k.class);

    /* renamed from: e */
    public static final AbstractC8046c<AbstractC11027o> f19056e = C8666q.m18415a("TRANSITION_STRATEGY", AbstractC11027o.class);

    /* renamed from: f */
    public static final AbstractC8046c<EnumC8637g> f19057f = C8666q.m18415a("LENIENCY", EnumC8637g.class);

    /* renamed from: g */
    public static final AbstractC8046c<EnumC8671v> f19058g = C8666q.m18415a("TEXT_WIDTH", EnumC8671v.class);

    /* renamed from: h */
    public static final AbstractC8046c<EnumC8658m> f19059h = C8666q.m18415a("OUTPUT_CONTEXT", EnumC8658m.class);

    /* renamed from: i */
    public static final AbstractC8046c<Boolean> f19060i = C8666q.m18415a("PARSE_CASE_INSENSITIVE", Boolean.class);

    /* renamed from: j */
    public static final AbstractC8046c<Boolean> f19061j = C8666q.m18415a("PARSE_PARTIAL_COMPARE", Boolean.class);

    /* renamed from: k */
    public static final AbstractC8046c<Boolean> f19062k = C8666q.m18415a("PARSE_MULTIPLE_CONTEXT", Boolean.class);

    /* renamed from: l */
    public static final AbstractC8046c<EnumC8641j> f19063l = C8666q.m18415a("NUMBER_SYSTEM", EnumC8641j.class);

    /* renamed from: m */
    public static final AbstractC8046c<Character> f19064m = C8666q.m18415a("ZERO_DIGIT", Character.class);

    /* renamed from: n */
    public static final AbstractC8046c<Boolean> f19065n = C8666q.m18415a("NO_GMT_PREFIX", Boolean.class);

    /* renamed from: o */
    public static final AbstractC8046c<Character> f19066o = C8666q.m18415a("DECIMAL_SEPARATOR", Character.class);

    /* renamed from: p */
    public static final AbstractC8046c<Character> f19067p = C8666q.m18415a("PAD_CHAR", Character.class);

    /* renamed from: q */
    public static final AbstractC8046c<Integer> f19068q = C8666q.m18415a("PIVOT_YEAR", Integer.class);

    /* renamed from: r */
    public static final AbstractC8046c<Boolean> f19069r = C8666q.m18415a("TRAILING_CHARACTERS", Boolean.class);

    /* renamed from: s */
    public static final AbstractC8046c<Integer> f19070s = C8666q.m18415a("PROTECTED_CHARACTERS", Integer.class);

    /* renamed from: t */
    public static final AbstractC8046c<String> f19071t = C8666q.m18415a("CALENDAR_VARIANT", String.class);

    /* renamed from: u */
    public static final AbstractC8046c<AbstractC8053f0> f19072u = C8666q.m18415a("START_OF_DAY", AbstractC8053f0.class);

    /* renamed from: v */
    public static final AbstractC8046c<Boolean> f19073v = C8666q.m18415a("FOUR_DIGIT_YEAR", Boolean.class);

    /* renamed from: w */
    public static final AbstractC8046c<EnumC11413f> f19074w = C8666q.m18415a("TIME_SCALE", EnumC11413f.class);

    /* renamed from: x */
    public static final AbstractC8046c<String> f19075x = C8666q.m18415a("FORMAT_PATTERN", String.class);

    /* renamed from: y */
    private static final C8627a f19076y = new C8627a();

    /* renamed from: a */
    private final Map<String, Object> f19077a;

    /* renamed from: ij.a$a */
    /* loaded from: classes8.dex */
    static /* synthetic */ class C0273a {

        /* renamed from: a */
        static final /* synthetic */ int[] f19078a;

        static {
            int[] iArr = new int[EnumC8637g.values().length];
            f19078a = iArr;
            try {
                iArr[EnumC8637g.STRICT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19078a[EnumC8637g.SMART.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19078a[EnumC8637g.LAX.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* synthetic */ C8627a(Map map, C0273a aVar) {
        this(map);
    }

    /* renamed from: e */
    public static <A> AbstractC8046c<A> m18482e(String str, Class<A> cls) {
        return C8666q.m18415a(str, cls);
    }

    /* renamed from: f */
    public static C8627a m18481f() {
        return f19076y;
    }

    @Override // p143hj.AbstractC8048d
    /* renamed from: a */
    public boolean mo15676a(AbstractC8046c<?> cVar) {
        return this.f19077a.containsKey(cVar.name());
    }

    @Override // p143hj.AbstractC8048d
    /* renamed from: b */
    public <A> A mo15675b(AbstractC8046c<A> cVar) {
        Object obj = this.f19077a.get(cVar.name());
        if (obj != null) {
            return cVar.type().cast(obj);
        }
        throw new NoSuchElementException(cVar.name());
    }

    @Override // p143hj.AbstractC8048d
    /* renamed from: c */
    public <A> A mo15674c(AbstractC8046c<A> cVar, A a) {
        Object obj = this.f19077a.get(cVar.name());
        if (obj == null) {
            return a;
        }
        return cVar.type().cast(obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8627a) {
            return this.f19077a.equals(((C8627a) obj).f19077a);
        }
        return false;
    }

    public int hashCode() {
        return this.f19077a.hashCode();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(this.f19077a.size() * 32);
        sb2.append(C8627a.class.getName());
        sb2.append('[');
        sb2.append(this.f19077a);
        sb2.append(']');
        return sb2.toString();
    }

    /* renamed from: ij.a$b */
    /* loaded from: classes8.dex */
    public static final class C8628b {

        /* renamed from: a */
        private final Map<String, Object> f19079a = new HashMap();

        public C8628b() {
        }

        /* renamed from: g */
        private <A> void m18474g(AbstractC8046c<A> cVar, A a) {
            if (a != null) {
                this.f19079a.put(cVar.name(), a);
                return;
            }
            throw new NullPointerException("Missing attribute value for key: " + cVar);
        }

        /* renamed from: a */
        public C8627a m18480a() {
            return new C8627a(this.f19079a, null);
        }

        /* renamed from: b */
        public C8628b m18479b(AbstractC8046c<Character> cVar, char c) {
            this.f19079a.put(cVar.name(), Character.valueOf(c));
            return this;
        }

        /* renamed from: c */
        public C8628b m18478c(AbstractC8046c<Integer> cVar, int i) {
            if (cVar != C8627a.f19068q || i >= 100) {
                this.f19079a.put(cVar.name(), Integer.valueOf(i));
                return this;
            }
            throw new IllegalArgumentException("Pivot year in far past not supported: " + i);
        }

        /* renamed from: d */
        public <A extends Enum<A>> C8628b m18477d(AbstractC8046c<A> cVar, A a) {
            if (a != null) {
                this.f19079a.put(cVar.name(), a);
                if (cVar == C8627a.f19057f) {
                    int i = C0273a.f19078a[((EnumC8637g) EnumC8637g.class.cast(a)).ordinal()];
                    if (i == 1) {
                        m18476e(C8627a.f19060i, false);
                        m18476e(C8627a.f19061j, false);
                        m18476e(C8627a.f19069r, false);
                        m18476e(C8627a.f19062k, false);
                    } else if (i == 2) {
                        m18476e(C8627a.f19060i, true);
                        m18476e(C8627a.f19061j, false);
                        m18476e(C8627a.f19069r, false);
                        m18476e(C8627a.f19062k, true);
                    } else if (i == 3) {
                        m18476e(C8627a.f19060i, true);
                        m18476e(C8627a.f19061j, true);
                        m18476e(C8627a.f19069r, true);
                        m18476e(C8627a.f19062k, true);
                    } else {
                        throw new UnsupportedOperationException(a.name());
                    }
                } else if (cVar == C8627a.f19063l) {
                    EnumC8641j jVar = (EnumC8641j) EnumC8641j.class.cast(a);
                    if (jVar.mo18426l()) {
                        m18479b(C8627a.f19064m, jVar.mo18427j().charAt(0));
                    }
                }
                return this;
            }
            throw new NullPointerException("Missing attribute value for key: " + cVar);
        }

        /* renamed from: e */
        public C8628b m18476e(AbstractC8046c<Boolean> cVar, boolean z) {
            this.f19079a.put(cVar.name(), Boolean.valueOf(z));
            return this;
        }

        /* renamed from: f */
        public C8628b m18475f(C8627a aVar) {
            this.f19079a.putAll(aVar.f19077a);
            return this;
        }

        /* renamed from: h */
        public C8628b m18473h(Locale locale) {
            m18474g(C8627a.f19054c, locale);
            return this;
        }

        /* renamed from: i */
        public C8628b m18472i(AbstractC11001k kVar) {
            m18474g(C8627a.f19055d, kVar);
            return this;
        }

        public C8628b(C8087x<?> xVar) {
            m18474g(C8627a.f19053b, C8629b.m18471a(xVar));
        }
    }

    private C8627a() {
        this.f19077a = Collections.emptyMap();
    }

    private C8627a(Map<String, Object> map) {
        this.f19077a = Collections.unmodifiableMap(new HashMap(map));
    }
}
