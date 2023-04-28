package net.time4j.calendar.service;

import com.discord.nearby.NearbyManager;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Set;
import p161ij.AbstractC8670u;
import p161ij.C8629b;
import p161ij.EnumC8658m;
import p161ij.EnumC8671v;
import p250nj.C11155e;
import p250nj.EnumC11154d;

/* renamed from: net.time4j.calendar.service.b */
/* loaded from: classes8.dex */
public final class C10872b implements AbstractC8670u {

    /* renamed from: a */
    private static final String[] f24131a = new String[0];

    /* renamed from: b */
    private static final Set<String> f24132b;

    /* renamed from: c */
    private static final Set<String> f24133c;

    /* renamed from: d */
    private static final Set<Locale> f24134d;

    static {
        String[] split = C11155e.m10681h("calendar/names/generic/generic", Locale.ROOT).m10683f("languages").split(" ");
        HashSet hashSet = new HashSet();
        Collections.addAll(hashSet, split);
        hashSet.add("");
        Set<String> unmodifiableSet = Collections.unmodifiableSet(hashSet);
        f24133c = unmodifiableSet;
        HashSet hashSet2 = new HashSet();
        for (String str : unmodifiableSet) {
            if (str.isEmpty()) {
                hashSet2.add(Locale.ROOT);
            } else {
                hashSet2.add(new Locale(str));
            }
        }
        f24134d = Collections.unmodifiableSet(hashSet2);
        HashSet hashSet3 = new HashSet();
        hashSet3.add("buddhist");
        hashSet3.add("chinese");
        hashSet3.add("coptic");
        hashSet3.add("dangi");
        hashSet3.add("ethiopic");
        hashSet3.add("frenchrev");
        hashSet3.add("hindu");
        hashSet3.add("generic");
        hashSet3.add("hebrew");
        hashSet3.add("indian");
        hashSet3.add("islamic");
        hashSet3.add("japanese");
        hashSet3.add("juche");
        hashSet3.add("persian");
        hashSet3.add("roc");
        hashSet3.add("vietnam");
        f24132b = Collections.unmodifiableSet(hashSet3);
    }

    /* renamed from: c */
    private static int m11925c(String str) {
        if (str.equals("hindu")) {
            return 6;
        }
        if (str.equals("ethiopic") || str.equals("generic") || str.equals("roc") || str.equals("buddhist") || str.equals("korean")) {
            return 2;
        }
        return 1;
    }

    /* renamed from: d */
    private static int m11924d(String str) {
        if (str.equals("coptic") || str.equals("ethiopic") || str.equals("generic") || str.equals("hebrew")) {
            return 13;
        }
        return 12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static C11155e m11923f(String str, Locale locale) {
        String str2 = "calendar/names/" + str + "/" + str;
        if (!f24133c.contains(EnumC11154d.m10689a(locale))) {
            locale = Locale.ROOT;
        }
        return C11155e.m10681h(str2, locale);
    }

    /* renamed from: i */
    private static String m11922i(C11155e eVar, String str) {
        if (!eVar.m10687b("useShortKeys") || !"true".equals(eVar.m10683f("useShortKeys"))) {
            return str;
        }
        return str.substring(0, 1);
    }

    /* renamed from: l */
    private static String[] m11921l(C11155e eVar, String str, String str2, int i, String str3, EnumC8671v vVar, EnumC8658m mVar, boolean z, int i2) {
        String[] strArr = new String[i];
        boolean z2 = true;
        if (str3.length() != 1) {
            z2 = false;
        }
        for (int i3 = 0; i3 < i; i3++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str3);
            sb2.append('(');
            if (z2) {
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
                if (z) {
                    sb2.append('|');
                    sb2.append("LEAP");
                }
            }
            sb2.append(')');
            sb2.append('_');
            sb2.append(i3 + i2);
            if (z && i3 == 6 && str.equals("hebrew")) {
                sb2.append('L');
            }
            String sb3 = sb2.toString();
            if (!eVar.m10687b(sb3)) {
                return null;
            }
            String f = eVar.m10683f(sb3);
            if (z && str.equals("chinese")) {
                f = m11920m(f, str2, vVar, mVar);
            }
            strArr[i3] = f;
        }
        return strArr;
    }

    /* renamed from: m */
    private static String m11920m(String str, String str2, EnumC8671v vVar, EnumC8658m mVar) {
        String str3;
        if (str2.equals("en")) {
            if (vVar == EnumC8671v.NARROW) {
                return "i" + str;
            }
            return "(leap) " + str;
        } else if (str2.equals("de") || str2.equals("es") || str2.equals("fr") || str2.equals("it") || str2.equals("pt") || str2.equals("ro")) {
            if (vVar == EnumC8671v.NARROW) {
                return "i" + str;
            }
            return "(i) " + str;
        } else if (str2.equals("ja")) {
            return "閏" + str;
        } else if (str2.equals("ko")) {
            return "윤" + str;
        } else if (str2.equals("zh")) {
            return "閏" + str;
        } else if (!str2.equals("vi")) {
            return "*" + str;
        } else if (vVar == EnumC8671v.NARROW) {
            return str + "n";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            if (mVar == EnumC8658m.STANDALONE) {
                str3 = " Nhuận";
            } else {
                str3 = " nhuận";
            }
            sb2.append(str3);
            return sb2.toString();
        }
    }

    @Override // p161ij.AbstractC8670u
    /* renamed from: a */
    public String[] mo10710a(String str, Locale locale, EnumC8671v vVar) {
        String str2;
        EnumC8671v vVar2;
        if (str.equals("chinese") || str.equals("vietnam")) {
            return f24131a;
        }
        if (str.equals("japanese")) {
            if (vVar == EnumC8671v.NARROW) {
                return new String[]{"M", "T", "S", "H"};
            }
            return new String[]{"Meiji", "Taishō", "Shōwa", "Heisei"};
        } else if (str.equals("dangi") || str.equals("juche")) {
            String[] a = mo10710a("korean", locale, vVar);
            String[] strArr = new String[1];
            if (str.equals("dangi")) {
                str2 = a[0];
            } else {
                str2 = a[1];
            }
            strArr[0] = str2;
            return strArr;
        } else {
            C11155e f = m11923f(str, locale);
            if (vVar == EnumC8671v.SHORT) {
                vVar = EnumC8671v.ABBREVIATED;
            }
            String[] l = m11921l(f, str, locale.getLanguage(), m11925c(str), m11922i(f, "ERA"), vVar, EnumC8658m.FORMAT, false, 0);
            if (l == null && vVar != (vVar2 = EnumC8671v.ABBREVIATED)) {
                l = mo10710a(str, locale, vVar2);
            }
            if (l != null) {
                return l;
            }
            throw new MissingResourceException("Cannot find calendar resource for era.", C10872b.class.getName(), locale.toString());
        }
    }

    @Override // p161ij.AbstractC8670u
    /* renamed from: b */
    public boolean mo10709b(Locale locale) {
        return true;
    }

    @Override // p161ij.AbstractC8670u
    /* renamed from: e */
    public String[] mo10706e(String str, Locale locale, EnumC8671v vVar, EnumC8658m mVar, boolean z) {
        String str2 = str;
        EnumC8671v vVar2 = vVar;
        if (str2.equals("roc") || str2.equals("buddhist")) {
            List<String> b = C8629b.m18468d(locale).m18460l(vVar2, mVar).m18413b();
            return (String[]) b.toArray(new String[b.size()]);
        } else if (str2.equals("japanese")) {
            return new String[]{NearbyManager.PERMISSION_DENIED, "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13"};
        } else {
            if (str2.equals("dangi") || str2.equals("vietnam")) {
                str2 = "chinese";
            } else if (str2.equals("hindu")) {
                str2 = "indian";
            } else if (str2.equals("juche")) {
                return (String[]) C8629b.m18468d(locale).m18460l(vVar2, mVar).m18413b().toArray(new String[12]);
            }
            C11155e f = m11923f(str2, locale);
            if (vVar2 == EnumC8671v.SHORT) {
                vVar2 = EnumC8671v.ABBREVIATED;
            }
            String[] l = m11921l(f, str2, locale.getLanguage(), m11924d(str2), m11922i(f, "MONTH_OF_YEAR"), vVar2, mVar, z, 1);
            if (l == null) {
                EnumC8658m mVar2 = EnumC8658m.STANDALONE;
                if (mVar == mVar2) {
                    if (vVar2 != EnumC8671v.NARROW) {
                        l = mo10706e(str2, locale, vVar2, EnumC8658m.FORMAT, z);
                    }
                } else if (vVar2 == EnumC8671v.ABBREVIATED) {
                    l = mo10706e(str2, locale, EnumC8671v.WIDE, EnumC8658m.FORMAT, z);
                } else if (vVar2 == EnumC8671v.NARROW) {
                    l = mo10706e(str2, locale, vVar2, mVar2, z);
                }
            }
            if (l != null) {
                return l;
            }
            throw new MissingResourceException("Cannot find calendar month.", C10872b.class.getName(), locale.toString());
        }
    }

    @Override // p161ij.AbstractC8670u
    /* renamed from: g */
    public String[] mo10704g(String str, Locale locale, EnumC8671v vVar, EnumC8658m mVar) {
        return f24131a;
    }

    @Override // p161ij.AbstractC8670u
    /* renamed from: h */
    public String[] mo10703h(String str, Locale locale, EnumC8671v vVar, EnumC8658m mVar) {
        return f24131a;
    }

    @Override // p161ij.AbstractC8670u
    /* renamed from: j */
    public boolean mo10701j(String str) {
        return f24132b.contains(str);
    }

    @Override // p161ij.AbstractC8670u
    /* renamed from: k */
    public String[] mo10700k(String str, Locale locale, EnumC8671v vVar, EnumC8658m mVar) {
        return f24131a;
    }

    public String toString() {
        return "GenericTextProviderSPI";
    }
}
