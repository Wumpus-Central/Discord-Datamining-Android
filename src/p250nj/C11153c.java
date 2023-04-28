package p250nj;

import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Set;
import p161ij.AbstractC8670u;
import p161ij.EnumC8635e;
import p161ij.EnumC8658m;
import p161ij.EnumC8671v;
import p201kj.AbstractC9888c;

/* renamed from: nj.c */
/* loaded from: classes8.dex */
public final class C11153c implements AbstractC8670u, AbstractC9888c {

    /* renamed from: a */
    private static final Set<String> f24816a;

    /* renamed from: b */
    private static final Set<Locale> f24817b;

    static {
        String[] split = C11155e.m10681h("calendar/names/iso8601/iso8601", Locale.ROOT).m10683f("languages").split(" ");
        HashSet hashSet = new HashSet();
        Collections.addAll(hashSet, split);
        Set<String> unmodifiableSet = Collections.unmodifiableSet(hashSet);
        f24816a = unmodifiableSet;
        HashSet hashSet2 = new HashSet();
        for (String str : unmodifiableSet) {
            hashSet2.add(new Locale(str));
        }
        for (EnumC11154d dVar : EnumC11154d.values()) {
            hashSet2.add(new Locale(dVar.name()));
        }
        f24817b = Collections.unmodifiableSet(hashSet2);
    }

    /* renamed from: l */
    private static String[] m10699l(Locale locale, EnumC8671v vVar) {
        EnumC8671v vVar2;
        C11155e m = m10698m(locale);
        String[] strArr = null;
        EnumC8671v vVar3 = null;
        if (m != null) {
            if (vVar == EnumC8671v.SHORT) {
                vVar = EnumC8671v.ABBREVIATED;
            }
            String n = m10697n(m, "ERA");
            if (vVar == EnumC8671v.NARROW) {
                vVar3 = EnumC8671v.ABBREVIATED;
            }
            strArr = m10696o(m, 5, n, vVar, vVar3, EnumC8658m.FORMAT, 0);
            if (strArr == null && vVar != (vVar2 = EnumC8671v.ABBREVIATED)) {
                strArr = m10699l(locale, vVar2);
            }
        }
        if (strArr != null) {
            return strArr;
        }
        throw new MissingResourceException("Cannot find ISO-8601-resource for era and locale: " + locale, C11153c.class.getName(), locale.toString());
    }

    /* renamed from: m */
    private static C11155e m10698m(Locale locale) {
        return C11155e.m10681h("calendar/names/iso8601/iso8601", locale);
    }

    /* renamed from: n */
    private static String m10697n(C11155e eVar, String str) {
        if (!eVar.m10687b("useShortKeys") || !"true".equals(eVar.m10683f("useShortKeys"))) {
            return str;
        }
        return str.substring(0, 1);
    }

    /* renamed from: o */
    private static String[] m10696o(C11155e eVar, int i, String str, EnumC8671v vVar, EnumC8671v vVar2, EnumC8658m mVar, int i2) {
        boolean z;
        String[] o;
        String[] strArr = new String[i];
        if (str.length() == 1) {
            z = true;
        } else {
            z = false;
        }
        for (int i3 = 0; i3 < i; i3++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append('(');
            if (z) {
                char charAt = vVar.name().charAt(0);
                if (mVar != EnumC8658m.STANDALONE) {
                    charAt = Character.toLowerCase(charAt);
                }
                sb2.append(charAt);
            } else {
                sb2.append(vVar.name());
                if (mVar == EnumC8658m.STANDALONE) {
                    sb2.append('|');
                    sb2.append(mVar.name());
                }
            }
            sb2.append(')');
            sb2.append('_');
            sb2.append(i3 + i2);
            String sb3 = sb2.toString();
            if (eVar.m10687b(sb3)) {
                strArr[i3] = eVar.m10683f(sb3);
            } else if (vVar2 == null || (o = m10696o(eVar, i, str, vVar2, null, mVar, i2)) == null) {
                return null;
            } else {
                strArr[i3] = o[i3];
            }
        }
        return strArr;
    }

    /* renamed from: p */
    private static String m10695p(String str, EnumC8671v vVar, EnumC8658m mVar) {
        char charAt = vVar.name().charAt(0);
        if (mVar == EnumC8658m.FORMAT) {
            charAt = Character.toLowerCase(charAt);
        }
        return "P(" + String.valueOf(charAt) + ")_" + str;
    }

    /* renamed from: q */
    private static String[] m10694q(Locale locale, EnumC8671v vVar, EnumC8658m mVar) {
        C11155e m = m10698m(locale);
        if (m != null) {
            if (vVar == EnumC8671v.SHORT) {
                vVar = EnumC8671v.ABBREVIATED;
            }
            String p = m10695p("am", vVar, mVar);
            String p2 = m10695p("pm", vVar, mVar);
            if (m.m10687b(p) && m.m10687b(p2)) {
                return new String[]{m.m10683f(p), m.m10683f(p2)};
            }
            if (mVar == EnumC8658m.STANDALONE) {
                EnumC8671v vVar2 = EnumC8671v.ABBREVIATED;
                if (vVar == vVar2) {
                    return m10694q(locale, vVar, EnumC8658m.FORMAT);
                }
                return m10694q(locale, vVar2, mVar);
            }
            EnumC8671v vVar3 = EnumC8671v.ABBREVIATED;
            if (vVar != vVar3) {
                return m10694q(locale, vVar3, mVar);
            }
        }
        throw new MissingResourceException("Cannot find ISO-8601-resource for am/pm and locale: " + locale, C11153c.class.getName(), locale.toString());
    }

    /* renamed from: r */
    private static String[] m10693r(Locale locale, EnumC8671v vVar, EnumC8658m mVar) {
        String[] strArr;
        C11155e m = m10698m(locale);
        if (m != null) {
            if (vVar == EnumC8671v.SHORT) {
                vVar = EnumC8671v.ABBREVIATED;
            }
            strArr = m10696o(m, 12, m10697n(m, "MONTH_OF_YEAR"), vVar, null, mVar, 1);
            if (strArr == null) {
                EnumC8658m mVar2 = EnumC8658m.STANDALONE;
                if (mVar == mVar2) {
                    if (vVar != EnumC8671v.NARROW) {
                        strArr = m10693r(locale, vVar, EnumC8658m.FORMAT);
                    }
                } else if (vVar == EnumC8671v.ABBREVIATED) {
                    strArr = m10693r(locale, EnumC8671v.WIDE, EnumC8658m.FORMAT);
                } else if (vVar == EnumC8671v.NARROW) {
                    strArr = m10693r(locale, vVar, mVar2);
                }
            }
        } else {
            strArr = null;
        }
        if (strArr != null) {
            return strArr;
        }
        throw new MissingResourceException("Cannot find ISO-8601-month for locale: " + locale, C11153c.class.getName(), locale.toString());
    }

    /* renamed from: s */
    private static String[] m10692s(Locale locale, EnumC8671v vVar, EnumC8658m mVar) {
        String[] strArr;
        C11155e m = m10698m(locale);
        if (m != null) {
            if (vVar == EnumC8671v.SHORT) {
                vVar = EnumC8671v.ABBREVIATED;
            }
            strArr = m10696o(m, 4, m10697n(m, "QUARTER_OF_YEAR"), vVar, null, mVar, 1);
            if (strArr == null) {
                EnumC8658m mVar2 = EnumC8658m.STANDALONE;
                if (mVar == mVar2) {
                    if (vVar != EnumC8671v.NARROW) {
                        strArr = m10692s(locale, vVar, EnumC8658m.FORMAT);
                    }
                } else if (vVar == EnumC8671v.ABBREVIATED) {
                    strArr = m10692s(locale, EnumC8671v.WIDE, EnumC8658m.FORMAT);
                } else if (vVar == EnumC8671v.NARROW) {
                    strArr = m10692s(locale, vVar, mVar2);
                }
            }
        } else {
            strArr = null;
        }
        if (strArr != null) {
            return strArr;
        }
        throw new MissingResourceException("Cannot find ISO-8601-quarter-of-year for locale: " + locale, C11153c.class.getName(), locale.toString());
    }

    /* renamed from: t */
    private static char m10691t(EnumC8635e eVar) {
        return Character.toLowerCase(eVar.name().charAt(0));
    }

    /* renamed from: u */
    private static String[] m10690u(Locale locale, EnumC8671v vVar, EnumC8658m mVar) {
        String[] strArr;
        C11155e m = m10698m(locale);
        if (m != null) {
            strArr = m10696o(m, 7, m10697n(m, "DAY_OF_WEEK"), vVar, null, mVar, 1);
            if (strArr == null) {
                EnumC8658m mVar2 = EnumC8658m.STANDALONE;
                if (mVar != mVar2) {
                    EnumC8671v vVar2 = EnumC8671v.ABBREVIATED;
                    if (vVar == vVar2) {
                        strArr = m10690u(locale, EnumC8671v.WIDE, EnumC8658m.FORMAT);
                    } else if (vVar == EnumC8671v.SHORT) {
                        strArr = m10690u(locale, vVar2, EnumC8658m.FORMAT);
                    } else if (vVar == EnumC8671v.NARROW) {
                        strArr = m10690u(locale, vVar, mVar2);
                    }
                } else if (vVar != EnumC8671v.NARROW) {
                    strArr = m10690u(locale, vVar, EnumC8658m.FORMAT);
                }
            }
        } else {
            strArr = null;
        }
        if (strArr != null) {
            return strArr;
        }
        throw new MissingResourceException("Cannot find ISO-8601-day-of-week for locale: " + locale, C11153c.class.getName(), locale.toString());
    }

    @Override // p161ij.AbstractC8670u
    /* renamed from: a */
    public String[] mo10710a(String str, Locale locale, EnumC8671v vVar) {
        return m10699l(locale, vVar);
    }

    @Override // p161ij.AbstractC8670u
    /* renamed from: b */
    public boolean mo10709b(Locale locale) {
        return f24816a.contains(EnumC11154d.m10689a(locale));
    }

    @Override // p161ij.AbstractC8636f
    /* renamed from: c */
    public String mo10708c(EnumC8635e eVar, Locale locale) {
        return mo10707d(eVar, locale, false);
    }

    @Override // p201kj.AbstractC9888c
    /* renamed from: d */
    public String mo10707d(EnumC8635e eVar, Locale locale, boolean z) {
        String str;
        if (!z || eVar != EnumC8635e.FULL) {
            str = "F(" + m10691t(eVar) + ")_t";
        } else {
            str = "F(alt)";
        }
        return m10698m(locale).m10683f(str);
    }

    @Override // p161ij.AbstractC8670u
    /* renamed from: e */
    public String[] mo10706e(String str, Locale locale, EnumC8671v vVar, EnumC8658m mVar, boolean z) {
        return m10693r(locale, vVar, mVar);
    }

    @Override // p161ij.AbstractC8636f
    /* renamed from: f */
    public String mo10705f(EnumC8635e eVar, EnumC8635e eVar2, Locale locale) {
        if (eVar.compareTo(eVar2) < 0) {
            eVar = eVar2;
        }
        return m10698m(locale).m10683f("F(" + m10691t(eVar) + ")_dt");
    }

    @Override // p161ij.AbstractC8670u
    /* renamed from: g */
    public String[] mo10704g(String str, Locale locale, EnumC8671v vVar, EnumC8658m mVar) {
        return m10694q(locale, vVar, mVar);
    }

    @Override // p161ij.AbstractC8670u
    /* renamed from: h */
    public String[] mo10703h(String str, Locale locale, EnumC8671v vVar, EnumC8658m mVar) {
        return m10692s(locale, vVar, mVar);
    }

    @Override // p161ij.AbstractC8636f
    /* renamed from: i */
    public String mo10702i(EnumC8635e eVar, Locale locale) {
        return m10698m(locale).m10683f("F(" + m10691t(eVar) + ")_d");
    }

    @Override // p161ij.AbstractC8670u
    /* renamed from: j */
    public boolean mo10701j(String str) {
        return "iso8601".equals(str);
    }

    @Override // p161ij.AbstractC8670u
    /* renamed from: k */
    public String[] mo10700k(String str, Locale locale, EnumC8671v vVar, EnumC8658m mVar) {
        return m10690u(locale, vVar, mVar);
    }

    public String toString() {
        return "IsoTextProviderSPI";
    }
}
