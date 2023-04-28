package p250nj;

import java.util.Locale;

/* renamed from: nj.d */
/* loaded from: classes8.dex */
public enum EnumC11154d {
    tl("fil"),
    no("nb"),
    in("id"),
    iw("he");
    

    /* renamed from: o */
    static final EnumC11154d[] f24822o = values();
    private final String alias;

    EnumC11154d(String str) {
        this.alias = str;
    }

    /* renamed from: a */
    public static String m10689a(Locale locale) {
        EnumC11154d[] dVarArr;
        String language = locale.getLanguage();
        if (language.equals("no") && locale.getVariant().equals("NY") && locale.getCountry().equals("NO")) {
            return "nn";
        }
        for (EnumC11154d dVar : f24822o) {
            if (language.equals(dVar.name())) {
                return dVar.alias;
            }
        }
        return language;
    }
}
