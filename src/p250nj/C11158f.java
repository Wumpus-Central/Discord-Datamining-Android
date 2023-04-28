package p250nj;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import p161ij.AbstractC8639i;
import p161ij.EnumC8641j;

/* renamed from: nj.f */
/* loaded from: classes8.dex */
public final class C11158f implements AbstractC8639i {

    /* renamed from: c */
    public static final Set<String> f24834c;

    /* renamed from: e */
    private static final Map<String, EnumC8641j> f24836e;

    /* renamed from: b */
    private static final Locale[] f24833b = new Locale[0];

    /* renamed from: d */
    public static final C11158f f24835d = new C11158f();

    static {
        EnumC8641j[] values;
        String[] split = C11155e.m10681h("i18n/numbers/symbol", Locale.ROOT).m10683f("locales").split(" ");
        HashSet hashSet = new HashSet();
        Collections.addAll(hashSet, split);
        f24834c = Collections.unmodifiableSet(hashSet);
        HashMap hashMap = new HashMap();
        for (EnumC8641j jVar : EnumC8641j.values()) {
            hashMap.put(jVar.m18432i(), jVar);
        }
        f24836e = Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: g */
    private static C11155e m10670g(Locale locale) {
        if (f24834c.contains(EnumC11154d.m10689a(locale))) {
            return C11155e.m10681h("i18n/numbers/symbol", locale);
        }
        return null;
    }

    /* renamed from: h */
    private static char m10669h(Locale locale, String str, char c) {
        C11155e g = m10670g(locale);
        if (g == null || !g.m10687b(str)) {
            return c;
        }
        return g.m10683f(str).charAt(0);
    }

    /* renamed from: i */
    private static String m10668i(Locale locale, String str, String str2) {
        C11155e g = m10670g(locale);
        if (g == null || !g.m10687b(str)) {
            return str2;
        }
        return g.m10683f(str);
    }

    @Override // p161ij.AbstractC8639i
    /* renamed from: a */
    public Locale[] mo10676a() {
        return f24833b;
    }

    @Override // p161ij.AbstractC8639i
    /* renamed from: b */
    public char mo10675b(Locale locale) {
        return m10669h(locale, "separator", AbstractC8639i.f19111a.mo10675b(locale));
    }

    @Override // p161ij.AbstractC8639i
    /* renamed from: c */
    public String mo10674c(Locale locale) {
        return m10668i(locale, "plus", AbstractC8639i.f19111a.mo10674c(locale));
    }

    @Override // p161ij.AbstractC8639i
    /* renamed from: d */
    public EnumC8641j mo10673d(Locale locale) {
        String i = m10668i(locale, "numsys", EnumC8641j.f19112k.m18432i());
        EnumC8641j jVar = f24836e.get(i);
        if (jVar != null) {
            return jVar;
        }
        throw new IllegalStateException("Unrecognized number system: " + i + " (locale=" + locale + ')');
    }

    @Override // p161ij.AbstractC8639i
    /* renamed from: e */
    public String mo10672e(Locale locale) {
        return m10668i(locale, "minus", AbstractC8639i.f19111a.mo10672e(locale));
    }

    @Override // p161ij.AbstractC8639i
    /* renamed from: f */
    public char mo10671f(Locale locale) {
        return m10669h(locale, "zero", AbstractC8639i.f19111a.mo10671f(locale));
    }

    public String toString() {
        return "SymbolProviderSPI";
    }
}
