package p183jj;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import net.time4j.AbstractC10819c;
import net.time4j.C10892f0;
import net.time4j.C10906g0;
import net.time4j.C11045z0;
import net.time4j.history.C10929d;
import p143hj.AbstractC8070l;
import p143hj.AbstractC8073m;
import p143hj.AbstractC8079p;
import p143hj.AbstractC8082s;
import p143hj.C8087x;
import p143hj.EnumC8042a0;
import p161ij.AbstractC8633c;
import p161ij.AbstractC8669t;
import p161ij.C8627a;
import p161ij.EnumC8635e;
import p161ij.EnumC8641j;
import p161ij.EnumC8658m;
import p161ij.EnumC8671v;
import p183jj.C9637c;
import p201kj.AbstractC9886a;

/* renamed from: jj.w */
/* loaded from: classes8.dex */
public enum EnumC9682w {
    CLDR,
    SIMPLE_DATE_FORMAT,
    CLDR_24,
    CLDR_DATE,
    DYNAMIC;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: jj.w$a */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class C9683a {

        /* renamed from: a */
        static final /* synthetic */ int[] f21533a;

        static {
            int[] iArr = new int[EnumC9682w.values().length];
            f21533a = iArr;
            try {
                iArr[EnumC9682w.CLDR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21533a[EnumC9682w.SIMPLE_DATE_FORMAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21533a[EnumC9682w.CLDR_24.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21533a[EnumC9682w.CLDR_DATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21533a[EnumC9682w.DYNAMIC.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* renamed from: B */
    private Map<AbstractC8079p<?>, AbstractC8079p<?>> m15626B(C9637c.C9640d<?> dVar, C8087x<?> xVar, Locale locale, char c, int i) {
        if (!(c == 'B' || c == 'O' || c == 'Q')) {
            if (c == 'S') {
                dVar.m15814g(C10906g0.f38918K, i);
            } else if (c == 'Z') {
                m15620f(dVar, c, 2, false);
            } else if (!(c == 'e' || c == 'g')) {
                if (c == 'u') {
                    dVar.m15813h(C10892f0.f38901F, i);
                } else if (!(c == 'x' || c == 'b' || c == 'c' || c == 'q' || c == 'r')) {
                    switch (c) {
                        case 'U':
                        case 'V':
                            break;
                        case 'W':
                            dVar.m15814g(C11045z0.m11129j(locale).m11138a(), i);
                            break;
                        case 'X':
                            if (i < 4) {
                                return m15614l(dVar, xVar, locale, 'X', i, true);
                            }
                            throw new IllegalArgumentException("Too many pattern letters (X): " + i);
                        default:
                            return m15614l(dVar, xVar, locale, c, i, true);
                    }
                }
            }
            return Collections.emptyMap();
        }
        throw new IllegalArgumentException("CLDR pattern symbol not supported in SimpleDateFormat-style: " + c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private static void m15625a(C9637c.C9640d<?> dVar, AbstractC8079p<? extends Enum> pVar, int i) {
        dVar.m15800u(pVar, i, 9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    private static void m15624b(C9637c.C9640d<?> dVar, AbstractC8079p<? extends Enum> pVar) {
        dVar.m15795z(pVar);
    }

    /* renamed from: c */
    private static void m15623c(C9637c.C9640d<?> dVar, int i) {
        if (i == 1) {
            dVar.m15811j(C10892f0.f38899D, 1, 2);
        } else if (i == 2) {
            dVar.m15814g(C10892f0.f38899D, 2);
        } else if (i == 3) {
            dVar.m15819b0(C8627a.f19058g, EnumC8671v.ABBREVIATED);
            dVar.m15795z(C10892f0.f38898C);
            dVar.m15837L();
        } else if (i == 4) {
            dVar.m15819b0(C8627a.f19058g, EnumC8671v.WIDE);
            dVar.m15795z(C10892f0.f38898C);
            dVar.m15837L();
        } else if (i == 5) {
            dVar.m15819b0(C8627a.f19058g, EnumC8671v.NARROW);
            dVar.m15795z(C10892f0.f38898C);
            dVar.m15837L();
        } else {
            throw new IllegalArgumentException("Too many pattern letters for month: " + i);
        }
    }

    /* renamed from: d */
    private static <V extends Enum<V>> void m15622d(C9637c.C9640d<?> dVar, int i, AbstractC8669t<?> tVar) {
        if (i == 1 || i == 2) {
            if (Enum.class.isAssignableFrom(tVar.getType())) {
                AbstractC8079p<V> pVar = (AbstractC8079p) m15617i(tVar);
                if (i == 1) {
                    dVar.m15800u(pVar, 1, 2);
                } else if (i == 2) {
                    dVar.m15813h(pVar, 2);
                }
            } else {
                dVar.m15821a0(AbstractC9886a.f22039c, i);
                dVar.m15848A(tVar);
                dVar.m15837L();
            }
        } else if (i == 3) {
            dVar.m15819b0(C8627a.f19058g, EnumC8671v.ABBREVIATED);
            dVar.m15848A(tVar);
            dVar.m15837L();
        } else if (i == 4) {
            dVar.m15819b0(C8627a.f19058g, EnumC8671v.WIDE);
            dVar.m15848A(tVar);
            dVar.m15837L();
        } else if (i == 5) {
            dVar.m15819b0(C8627a.f19058g, EnumC8671v.NARROW);
            dVar.m15848A(tVar);
            dVar.m15837L();
        } else {
            throw new IllegalArgumentException("Too many pattern letters for month: " + i);
        }
    }

    /* renamed from: e */
    private static void m15621e(AbstractC8079p<Integer> pVar, char c, C9637c.C9640d<?> dVar, int i, boolean z) {
        if (i == 1) {
            dVar.m15811j(pVar, 1, 2);
        } else if (i == 2 || z) {
            dVar.m15814g(pVar, i);
        } else {
            throw new IllegalArgumentException("Too many pattern letters (" + c + "): " + i);
        }
    }

    /* renamed from: f */
    private static void m15620f(C9637c.C9640d<?> dVar, char c, int i, boolean z) {
        String str = "Z";
        if (i == 1) {
            EnumC8635e eVar = EnumC8635e.SHORT;
            if (!z) {
                str = "+00";
            }
            dVar.m15846C(eVar, false, Collections.singletonList(str));
        } else if (i == 2) {
            EnumC8635e eVar2 = EnumC8635e.MEDIUM;
            if (!z) {
                str = "+0000";
            }
            dVar.m15846C(eVar2, false, Collections.singletonList(str));
        } else if (i == 3) {
            EnumC8635e eVar3 = EnumC8635e.MEDIUM;
            if (!z) {
                str = "+00:00";
            }
            dVar.m15846C(eVar3, true, Collections.singletonList(str));
        } else if (i == 4) {
            EnumC8635e eVar4 = EnumC8635e.LONG;
            if (!z) {
                str = "+0000";
            }
            dVar.m15846C(eVar4, false, Collections.singletonList(str));
        } else if (i == 5) {
            EnumC8635e eVar5 = EnumC8635e.LONG;
            if (!z) {
                str = "+00:00";
            }
            dVar.m15846C(eVar5, true, Collections.singletonList(str));
        } else {
            throw new IllegalArgumentException("Too many pattern letters (" + c + "): " + i);
        }
    }

    /* renamed from: g */
    private static void m15619g(C9637c.C9640d<?> dVar, int i) {
        if (i == 1 || i == 2) {
            dVar.m15813h(C10892f0.f38897B, i);
        } else if (i == 3) {
            dVar.m15819b0(C8627a.f19058g, EnumC8671v.ABBREVIATED);
            dVar.m15795z(C10892f0.f38897B);
            dVar.m15837L();
        } else if (i == 4) {
            dVar.m15819b0(C8627a.f19058g, EnumC8671v.WIDE);
            dVar.m15795z(C10892f0.f38897B);
            dVar.m15837L();
        } else if (i == 5) {
            dVar.m15819b0(C8627a.f19058g, EnumC8671v.NARROW);
            dVar.m15795z(C10892f0.f38897B);
            dVar.m15837L();
        } else {
            throw new IllegalArgumentException("Too many pattern letters for quarter-of-year: " + i);
        }
    }

    /* renamed from: h */
    private static int m15618h(int i) {
        return (i < 65 || i > 90) ? (i + 65) - 97 : i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: i */
    private static <T> T m15617i(Object obj) {
        return obj;
    }

    /* renamed from: j */
    private Map<AbstractC8079p<?>, AbstractC8079p<?>> m15616j(C9637c.C9640d<?> dVar, Locale locale, char c, int i) {
        C8087x<?> t = m15606t(dVar);
        if (m15603x(c) && !m15602y(t)) {
            return m15608r(dVar, t, c, i, locale);
        }
        if (c != 'h' || !m15607s(t).equals("ethiopic")) {
            return m15614l(dVar, t, locale, c, i, false);
        }
        AbstractC8079p<Integer> q = m15609q(t);
        if (q != null) {
            m15621e(q, c, dVar, i, false);
            return Collections.emptyMap();
        }
        throw new IllegalArgumentException("Ethiopian time not available.");
    }

    /* renamed from: k */
    private Map<AbstractC8079p<?>, AbstractC8079p<?>> m15615k(C9637c.C9640d<?> dVar, Locale locale, char c, int i) {
        if (c != 'H') {
            return m15616j(dVar, locale, c, i);
        }
        m15621e(C10906g0.f38913F, c, dVar, i, false);
        return Collections.emptyMap();
    }

    /* renamed from: l */
    private Map<AbstractC8079p<?>, AbstractC8079p<?>> m15614l(C9637c.C9640d<?> dVar, C8087x<?> xVar, Locale locale, char c, int i, boolean z) {
        EnumC8671v vVar;
        EnumC8671v vVar2;
        EnumC8671v vVar3;
        int i2 = 4;
        switch (c) {
            case 'A':
                dVar.m15811j(C10906g0.f38921N, i, 8);
                break;
            case 'B':
                dVar.m15819b0(C8627a.f19058g, m15604v(i));
                dVar.m15816e();
                dVar.m15837L();
                break;
            case 'C':
            case 'I':
            case 'J':
            case 'N':
            case 'P':
            case 'R':
            case 'T':
            case 'U':
            case '[':
            case '\\':
            case ']':
            case '^':
            case '_':
            case '`':
            case 'f':
            case 'i':
            case 'j':
            case 'l':
            case 'n':
            case 'o':
            case 'p':
            case 't':
            case 'v':
            default:
                throw new IllegalArgumentException("Unsupported pattern symbol: " + c);
            case 'D':
                if (i < 3) {
                    dVar.m15811j(C10892f0.f38902G, i, 3);
                    break;
                } else if (i == 3 || z) {
                    dVar.m15814g(C10892f0.f38902G, i);
                    break;
                } else {
                    throw new IllegalArgumentException("Too many pattern letters (D): " + i);
                }
            case 'E':
                if (i <= 3) {
                    vVar = EnumC8671v.ABBREVIATED;
                } else if (i == 4 || z) {
                    vVar = EnumC8671v.WIDE;
                } else if (i == 5) {
                    vVar = EnumC8671v.NARROW;
                } else if (i == 6) {
                    vVar = EnumC8671v.SHORT;
                } else {
                    throw new IllegalArgumentException("Too many pattern letters (E): " + i);
                }
                dVar.m15819b0(C8627a.f19058g, vVar);
                dVar.m15795z(C10892f0.f38901F);
                dVar.m15837L();
                break;
            case 'F':
                if (i == 1 || z) {
                    dVar.m15814g(C10892f0.f38904I, i);
                    break;
                } else {
                    throw new IllegalArgumentException("Too many pattern letters (F): " + i);
                }
            case 'G':
                if (i <= 3) {
                    vVar2 = EnumC8671v.ABBREVIATED;
                } else if (i == 4 || z) {
                    vVar2 = EnumC8671v.WIDE;
                } else if (i == 5) {
                    vVar2 = EnumC8671v.NARROW;
                } else {
                    throw new IllegalArgumentException("Too many pattern letters (G): " + i);
                }
                dVar.m15819b0(C8627a.f19058g, vVar2);
                C10929d D = C10929d.m11591D(locale);
                dVar.m15848A((AbstractC8669t) AbstractC8669t.class.cast(D.m11573i()));
                dVar.m15837L();
                HashMap hashMap = new HashMap();
                hashMap.put(C10892f0.f24174z, D.m11582M());
                hashMap.put(C10892f0.f38898C, D.m11592C());
                hashMap.put(C10892f0.f38899D, D.m11592C());
                hashMap.put(C10892f0.f38900E, D.m11575g());
                hashMap.put(C10892f0.f38902G, D.m11574h());
                return hashMap;
            case 'H':
                m15621e(C10906g0.f38912E, c, dVar, i, z);
                break;
            case 'K':
                m15621e(C10906g0.f38911D, c, dVar, i, z);
                break;
            case 'L':
                dVar.m15819b0(C8627a.f19059h, EnumC8658m.STANDALONE);
                if (!z) {
                    i2 = i;
                }
                m15623c(dVar, Math.min(i, i2));
                dVar.m15837L();
                break;
            case 'M':
                if (!z) {
                    i2 = i;
                }
                m15623c(dVar, Math.min(i, i2));
                break;
            case 'O':
                if (i == 1) {
                    dVar.m15797x();
                    break;
                } else if (i == 4) {
                    dVar.m15805p();
                    break;
                } else {
                    throw new IllegalArgumentException("Count of pattern letters is not 1 or 4: " + i);
                }
            case 'Q':
                m15619g(dVar, i);
                break;
            case 'S':
                dVar.m15812i(C10906g0.f38920M, i, i, false);
                break;
            case 'V':
                if (i == 2) {
                    try {
                        dVar.m15847B();
                        break;
                    } catch (IllegalStateException e) {
                        throw new IllegalArgumentException(e.getMessage());
                    }
                } else {
                    throw new IllegalArgumentException("Count of pattern letters is not 2: " + i);
                }
            case 'W':
                if (i == 1) {
                    dVar.m15814g(C11045z0.m11129j(locale).m11126m(), 1);
                    break;
                } else {
                    throw new IllegalArgumentException("Too many pattern letters (W): " + i);
                }
            case 'X':
                m15620f(dVar, c, i, true);
                break;
            case 'Y':
                if (i != 2) {
                    dVar.m15844E(C10892f0.f38896A, i, false);
                    break;
                } else {
                    dVar.m15845D(C10892f0.f38896A);
                    break;
                }
            case 'Z':
                if (i < 4) {
                    dVar.m15846C(EnumC8635e.LONG, false, Collections.singletonList("+0000"));
                    break;
                } else if (i == 4) {
                    dVar.m15805p();
                    break;
                } else if (i == 5) {
                    dVar.m15846C(EnumC8635e.LONG, true, Collections.singletonList("Z"));
                    break;
                } else {
                    throw new IllegalArgumentException("Too many pattern letters (Z): " + i);
                }
            case 'a':
                if (z) {
                    vVar3 = EnumC8671v.ABBREVIATED;
                } else {
                    vVar3 = m15604v(i);
                }
                dVar.m15819b0(C8627a.f19058g, vVar3);
                dVar.m15795z(C10906g0.f38908A);
                dVar.m15837L();
                if (m15607s(xVar).equals("ethiopic")) {
                    AbstractC8079p<Integer> q = m15609q(xVar);
                    if (q != null) {
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put(q, C10906g0.f38909B);
                        return hashMap2;
                    }
                    throw new IllegalArgumentException("Ethiopian time not available.");
                }
                break;
            case 'b':
                dVar.m15819b0(C8627a.f19058g, m15604v(i));
                dVar.m15815f();
                dVar.m15837L();
                break;
            case 'c':
                if (i != 2) {
                    dVar.m15819b0(C8627a.f19059h, EnumC8658m.STANDALONE);
                    if (i == 1) {
                        dVar.m15813h(C11045z0.m11129j(locale).m11130i(), 1);
                    } else {
                        m15614l(dVar, xVar, locale, 'E', i, z);
                    }
                    dVar.m15837L();
                    break;
                } else {
                    throw new IllegalArgumentException("Invalid pattern count of 2 for symbol 'c'.");
                }
            case 'd':
                m15621e(C10892f0.f38900E, c, dVar, i, z);
                break;
            case 'e':
                if (i > 2) {
                    m15614l(dVar, xVar, locale, 'E', i, z);
                    break;
                } else {
                    dVar.m15813h(C11045z0.m11129j(locale).m11130i(), i);
                    break;
                }
            case 'g':
                dVar.m15804q(EnumC8042a0.MODIFIED_JULIAN_DATE, i, 18, EnumC9684x.SHOW_WHEN_NEGATIVE);
                break;
            case 'h':
                m15621e(C10906g0.f38909B, c, dVar, i, z);
                break;
            case 'k':
                m15621e(C10906g0.f38910C, c, dVar, i, z);
                break;
            case 'm':
                m15621e(C10906g0.f38914G, c, dVar, i, z);
                break;
            case 'q':
                dVar.m15819b0(C8627a.f19059h, EnumC8658m.STANDALONE);
                m15619g(dVar, i);
                dVar.m15837L();
                break;
            case 'r':
                dVar.m15819b0(C8627a.f19063l, EnumC8641j.f19112k);
                dVar.m15823Z(C8627a.f19064m, '0');
                dVar.m15844E(C10892f0.f24174z, i, true);
                dVar.m15837L();
                dVar.m15837L();
                break;
            case 's':
                m15621e(C10906g0.f38916I, c, dVar, i, z);
                break;
            case 'u':
                dVar.m15844E(C10892f0.f24174z, i, true);
                break;
            case 'w':
                if (i <= 2) {
                    AbstractC10819c<Integer, C10892f0> n = C11045z0.m11129j(locale).m11125n();
                    Iterator<AbstractC8079p<?>> it = xVar.m20644x().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            AbstractC8079p<?> next = it.next();
                            if (next.mo11060a() == c) {
                                C11045z0 z0Var = C11045z0.f24547w;
                                if (next.equals(z0Var.m11125n())) {
                                    n = z0Var.m11125n();
                                }
                            }
                        }
                    }
                    m15621e(n, c, dVar, i, z);
                    break;
                } else {
                    throw new IllegalArgumentException("Too many pattern letters (w): " + i);
                }
            case 'x':
                m15620f(dVar, c, i, false);
                break;
            case 'y':
                if (i != 2) {
                    dVar.m15844E(C10892f0.f24174z, i, false);
                    break;
                } else {
                    dVar.m15845D(C10892f0.f24174z);
                    break;
                }
            case 'z':
                try {
                    if (i < 4) {
                        dVar.m15796y();
                        break;
                    } else {
                        if (i != 4 && !z) {
                            throw new IllegalArgumentException("Too many pattern letters (z): " + i);
                        }
                        dVar.m15803r();
                    }
                } catch (IllegalStateException e2) {
                    throw new IllegalArgumentException(e2.getMessage());
                }
        }
        return Collections.emptyMap();
    }

    /* renamed from: m */
    private Map<AbstractC8079p<?>, AbstractC8079p<?>> m15613m(C9637c.C9640d<?> dVar, char c, int i, Locale locale) {
        boolean z;
        boolean z2;
        if (c < 'A' || c > 'Z') {
            z = false;
        } else {
            z = true;
        }
        AbstractC8079p<?> o = m15611o(m15606t(dVar), locale, c);
        if (o != null) {
            if (z && (((z2 = o instanceof AbstractC8669t)) || Enum.class.isAssignableFrom(o.getType()))) {
                if (i == 1) {
                    dVar.m15819b0(C8627a.f19058g, EnumC8671v.NARROW);
                } else if (i == 2) {
                    dVar.m15819b0(C8627a.f19058g, EnumC8671v.SHORT);
                } else if (i == 3) {
                    dVar.m15819b0(C8627a.f19058g, EnumC8671v.ABBREVIATED);
                } else if (i == 4) {
                    dVar.m15819b0(C8627a.f19058g, EnumC8671v.WIDE);
                } else {
                    throw new IllegalArgumentException("Illegal count of symbols: " + c);
                }
                if (z2) {
                    dVar.m15848A((AbstractC8669t) m15617i(o));
                } else {
                    m15624b(dVar, (AbstractC8079p) m15617i(o));
                }
                dVar.m15837L();
            } else if (o.getType() == Integer.class) {
                dVar.m15811j((AbstractC8079p) m15617i(o), i, 9);
            } else if (Enum.class.isAssignableFrom(o.getType())) {
                m15625a(dVar, (AbstractC8079p) m15617i(o), i);
            } else {
                throw new IllegalArgumentException("Can only handle enum or integer elements in a numerical way: " + o);
            }
            return Collections.emptyMap();
        }
        throw new IllegalArgumentException("Cannot resolve symbol: " + c);
    }

    /* renamed from: n */
    private static AbstractC8079p<?> m15612n(Set<AbstractC8079p<?>> set, char c, String str) {
        char c2;
        if (c == 'L') {
            c2 = 'M';
        } else if (c == 'c') {
            c2 = 'e';
        } else {
            c2 = c;
        }
        for (AbstractC8079p<?> pVar : set) {
            if (pVar.mo11063M() && pVar.mo11060a() == c2 && !(c2 == 'M' && pVar.name().equals("MONTH_AS_NUMBER"))) {
                return pVar;
            }
        }
        if (c == 'y' && str.equals("net.time4j.PlainDate")) {
            return C10892f0.f24174z;
        }
        throw new IllegalArgumentException("Cannot find any chronological date element for symbol " + c + " in \"" + str + "\".");
    }

    /* renamed from: o */
    private static AbstractC8079p<?> m15611o(C8087x<?> xVar, Locale locale, int i) {
        AbstractC8079p<?> p = m15610p(xVar, locale, i, false);
        if (p == null) {
            return m15610p(xVar, locale, i, true);
        }
        return p;
    }

    /* renamed from: p */
    private static AbstractC8079p<?> m15610p(C8087x<?> xVar, Locale locale, int i, boolean z) {
        if (z) {
            i = m15618h(i);
        }
        for (AbstractC8079p<?> pVar : xVar.m20644x()) {
            int a = pVar.mo11060a();
            if (z) {
                a = m15618h(a);
                continue;
            }
            if (a == i) {
                return pVar;
            }
        }
        for (AbstractC8082s sVar : xVar.m20646v()) {
            for (AbstractC8079p<?> pVar2 : sVar.mo10715b(locale, C8627a.m18481f())) {
                int a2 = pVar2.mo11060a();
                if (z) {
                    a2 = m15618h(a2);
                    continue;
                }
                if (a2 == i) {
                    return pVar2;
                }
            }
        }
        return null;
    }

    /* renamed from: q */
    private static AbstractC8079p<Integer> m15609q(C8087x<?> xVar) {
        for (AbstractC8082s sVar : xVar.m20646v()) {
            for (AbstractC8079p<?> pVar : sVar.mo10715b(Locale.ROOT, C8627a.m18481f())) {
                if (pVar.name().equals("ETHIOPIAN_HOUR")) {
                    return (AbstractC8079p) m15617i(pVar);
                }
            }
        }
        return null;
    }

    /* renamed from: r */
    private Map<AbstractC8079p<?>, AbstractC8079p<?>> m15608r(C9637c.C9640d<?> dVar, C8087x<?> xVar, char c, int i, Locale locale) {
        AbstractC8079p<Integer> pVar;
        EnumC8671v vVar;
        EnumC8671v vVar2;
        EnumC8671v vVar3;
        if (c == 'g') {
            dVar.m15804q(EnumC8042a0.MODIFIED_JULIAN_DATE, i, 18, EnumC9684x.SHOW_WHEN_NEGATIVE);
            return Collections.emptyMap();
        } else if (c == 'G' && xVar == C10892f0.m11835v0()) {
            return m15614l(dVar, xVar, locale, c, i, false);
        } else {
            Set<AbstractC8079p<?>> u = m15605u(xVar, c, locale);
            String name = dVar.m15833P().m20648q().getName();
            AbstractC8079p<?> n = m15612n(u, c, name);
            AbstractC8669t<?> tVar = null;
            if (Integer.class.isAssignableFrom(n.getType())) {
                if (n instanceof AbstractC9886a) {
                    tVar = (AbstractC8669t) m15617i(n);
                }
                pVar = (AbstractC8079p) m15617i(n);
            } else if (n instanceof AbstractC8669t) {
                tVar = (AbstractC8669t) m15617i(n);
                pVar = null;
            } else {
                throw new IllegalStateException("Implementation error: " + n + " in \"" + name + "\"");
            }
            if (c == 'L') {
                dVar.m15819b0(C8627a.f19059h, EnumC8658m.STANDALONE);
                m15622d(dVar, i, tVar);
                dVar.m15837L();
            } else if (c == 'M') {
                m15622d(dVar, i, tVar);
            } else if (c != 'U') {
                boolean z = true;
                if (c != 'W') {
                    if (c == 'r') {
                        dVar.m15819b0(C8627a.f19063l, EnumC8641j.f19112k);
                        dVar.m15823Z(C8627a.f19064m, '0');
                        dVar.m15844E(pVar, i, true);
                        dVar.m15837L();
                        dVar.m15837L();
                    } else if (c == 'w') {
                        m15621e(pVar, c, dVar, i, false);
                    } else if (c != 'y') {
                        switch (c) {
                            case 'D':
                                if (i < 3) {
                                    dVar.m15811j(pVar, i, 3);
                                    break;
                                } else if (i == 3) {
                                    dVar.m15814g(pVar, i);
                                    break;
                                } else {
                                    throw new IllegalArgumentException("Too many pattern letters (D): " + i);
                                }
                            case 'E':
                                if (i <= 3) {
                                    vVar2 = EnumC8671v.ABBREVIATED;
                                } else if (i == 4) {
                                    vVar2 = EnumC8671v.WIDE;
                                } else if (i == 5) {
                                    vVar2 = EnumC8671v.NARROW;
                                } else if (i == 6) {
                                    vVar2 = EnumC8671v.SHORT;
                                } else {
                                    throw new IllegalArgumentException("Too many pattern letters (E): " + i);
                                }
                                dVar.m15819b0(C8627a.f19058g, vVar2);
                                dVar.m15848A(tVar);
                                dVar.m15837L();
                                break;
                            case 'F':
                                if (i == 1) {
                                    dVar.m15814g(pVar, i);
                                    break;
                                } else {
                                    throw new IllegalArgumentException("Too many pattern letters (F): " + i);
                                }
                            case 'G':
                                if (i <= 3) {
                                    vVar3 = EnumC8671v.ABBREVIATED;
                                } else if (i == 4) {
                                    vVar3 = EnumC8671v.WIDE;
                                } else if (i == 5) {
                                    vVar3 = EnumC8671v.NARROW;
                                } else {
                                    throw new IllegalArgumentException("Too many pattern letters (G): " + i);
                                }
                                dVar.m15819b0(C8627a.f19058g, vVar3);
                                dVar.m15848A(tVar);
                                dVar.m15837L();
                                break;
                            default:
                                switch (c) {
                                    case 'c':
                                        if (i != 2) {
                                            dVar.m15819b0(C8627a.f19059h, EnumC8658m.STANDALONE);
                                            if (i == 1) {
                                                dVar.m15813h((AbstractC8079p) m15617i(n), 1);
                                            } else {
                                                m15608r(dVar, xVar, 'E', i, locale);
                                            }
                                            dVar.m15837L();
                                            break;
                                        } else {
                                            throw new IllegalArgumentException("Invalid pattern count of 2 for symbol 'c'.");
                                        }
                                    case 'd':
                                        if (pVar != null) {
                                            m15621e(pVar, c, dVar, i, false);
                                            break;
                                        } else if (i <= 2) {
                                            dVar.m15821a0(AbstractC9886a.f22039c, i);
                                            dVar.m15848A(tVar);
                                            dVar.m15837L();
                                            break;
                                        } else {
                                            throw new IllegalArgumentException("Too many pattern letters for day-of-month: " + i);
                                        }
                                    case 'e':
                                        if (i > 2) {
                                            m15608r(dVar, xVar, 'E', i, locale);
                                            break;
                                        } else {
                                            dVar.m15813h((AbstractC8079p) m15617i(n), i);
                                            break;
                                        }
                                    default:
                                        throw new IllegalArgumentException("Unsupported pattern symbol: " + c);
                                }
                        }
                    } else {
                        if (!locale.getLanguage().equals("am") || !m15607s(xVar).equals("ethiopic")) {
                            z = false;
                        } else {
                            dVar.m15819b0(C8627a.f19063l, EnumC8641j.f19118q);
                        }
                        if (i == 2) {
                            dVar.m15845D(pVar);
                        } else {
                            dVar.m15844E(pVar, i, false);
                        }
                        if (z) {
                            dVar.m15837L();
                        }
                    }
                } else if (i == 1) {
                    dVar.m15814g(pVar, 1);
                } else {
                    throw new IllegalArgumentException("Too many pattern letters (W): " + i);
                }
            } else if (tVar != null) {
                if (i <= 3) {
                    vVar = EnumC8671v.ABBREVIATED;
                } else if (i == 4) {
                    vVar = EnumC8671v.WIDE;
                } else if (i == 5) {
                    vVar = EnumC8671v.NARROW;
                } else {
                    throw new IllegalArgumentException("Too many pattern letters (U): " + i);
                }
                dVar.m15819b0(C8627a.f19058g, vVar);
                dVar.m15848A(tVar);
                dVar.m15837L();
            } else {
                throw new IllegalStateException("Implementation error: " + n + " in \"" + name + "\"");
            }
            return Collections.emptyMap();
        }
    }

    /* renamed from: s */
    private static String m15607s(C8087x<?> xVar) {
        AbstractC8633c cVar = (AbstractC8633c) xVar.m20648q().getAnnotation(AbstractC8633c.class);
        if (cVar == null) {
            return "iso8601";
        }
        return cVar.value();
    }

    /* renamed from: t */
    private static C8087x<?> m15606t(C9637c.C9640d<?> dVar) {
        return dVar.m15833P();
    }

    /* renamed from: u */
    private static Set<AbstractC8079p<?>> m15605u(C8087x<?> xVar, char c, Locale locale) {
        if (!(c == 'w' || c == 'W' || c == 'e' || c == 'c')) {
            return xVar.m20644x();
        }
        for (AbstractC8082s sVar : xVar.m20646v()) {
            for (AbstractC8079p<?> pVar : sVar.mo10715b(locale, C8627a.m18481f())) {
                if (((c == 'e' || c == 'c') && pVar.name().equals("LOCAL_DAY_OF_WEEK")) || ((c == 'w' && pVar.name().equals("WEEK_OF_YEAR")) || (c == 'W' && pVar.name().equals("WEEK_OF_MONTH")))) {
                    HashSet hashSet = new HashSet();
                    hashSet.add(pVar);
                    return hashSet;
                }
            }
        }
        return Collections.emptySet();
    }

    /* renamed from: v */
    private static EnumC8671v m15604v(int i) {
        if (i <= 3) {
            return EnumC8671v.ABBREVIATED;
        }
        if (i == 4) {
            return EnumC8671v.WIDE;
        }
        if (i == 5) {
            return EnumC8671v.NARROW;
        }
        throw new IllegalArgumentException("Too many pattern letters: " + i);
    }

    /* renamed from: x */
    private static boolean m15603x(char c) {
        if (c == 'L' || c == 'M' || c == 'U' || c == 'W' || c == 'g' || c == 'r' || c == 'w' || c == 'y') {
            return true;
        }
        switch (c) {
            case 'D':
            case 'E':
            case 'F':
            case 'G':
                return true;
            default:
                switch (c) {
                    case 'c':
                    case 'd':
                    case 'e':
                        return true;
                    default:
                        return false;
                }
        }
    }

    /* renamed from: y */
    private static boolean m15602y(C8087x<?> xVar) {
        return m15607s(xVar).equals("iso8601");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public Map<AbstractC8079p<?>, AbstractC8079p<?>> m15601z(C9637c.C9640d<?> dVar, Locale locale, char c, int i) {
        C8087x<?> t = m15606t(dVar);
        int i2 = C9683a.f21533a[ordinal()];
        if (i2 == 1) {
            return m15616j(dVar, locale, c, i);
        }
        if (i2 == 2) {
            return m15626B(dVar, t, locale, c, i);
        }
        if (i2 == 3) {
            return m15615k(dVar, locale, c, i);
        }
        if (i2 == 4) {
            Class<?> q = t.m20648q();
            if (AbstractC8073m.class.isAssignableFrom(q) || AbstractC8070l.class.isAssignableFrom(q)) {
                return m15608r(dVar, t, c, i, locale);
            }
            throw new IllegalArgumentException("No calendar chronology.");
        } else if (i2 == 5) {
            return m15613m(dVar, c, i, locale);
        } else {
            throw new UnsupportedOperationException(name());
        }
    }
}
