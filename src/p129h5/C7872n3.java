package p129h5;

import android.icu.text.NumberingSystem;
import android.icu.text.RuleBasedCollator;
import android.icu.util.Calendar;
import android.icu.util.ULocale;
import android.os.Build;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: h5.n3 */
/* loaded from: classes7.dex */
public class C7872n3 {

    /* renamed from: a */
    public static String f17005a = "calendar";

    /* renamed from: b */
    public static String f17006b = "ca";

    /* renamed from: c */
    public static String f17007c = "numbers";

    /* renamed from: d */
    public static String f17008d = "nu";

    /* renamed from: e */
    public static String f17009e = "hours";

    /* renamed from: f */
    public static String f17010f = "hc";

    /* renamed from: g */
    public static String f17011g = "collation";

    /* renamed from: h */
    public static String f17012h = "co";

    /* renamed from: i */
    public static String f17013i = "colnumeric";

    /* renamed from: j */
    public static String f17014j = "kn";

    /* renamed from: k */
    public static String f17015k = "colcasefirst";

    /* renamed from: l */
    public static String f17016l = "kf";

    /* renamed from: m */
    private static HashMap<String, String> f17017m = new C7873a();

    /* renamed from: n */
    private static HashMap<String, String> f17018n = new C7874b();

    /* renamed from: o */
    private static final Map<String, String> f17019o = new C7875c();

    /* renamed from: p */
    private static Map<String, String> f17020p = new C7876d();

    /* renamed from: q */
    private static Map<String, String> f17021q = new C7877e();

    /* renamed from: r */
    private static Map<String, String[]> f17022r = new C7878f();

    /* renamed from: h5.n3$a */
    /* loaded from: classes7.dex */
    class C7873a extends HashMap<String, String> {
        C7873a() {
            put(C7872n3.f17006b, C7872n3.f17005a);
            put(C7872n3.f17008d, C7872n3.f17007c);
            put(C7872n3.f17010f, C7872n3.f17009e);
            put(C7872n3.f17012h, C7872n3.f17011g);
            put(C7872n3.f17014j, C7872n3.f17013i);
            put(C7872n3.f17016l, C7872n3.f17015k);
        }
    }

    /* renamed from: h5.n3$b */
    /* loaded from: classes7.dex */
    class C7874b extends HashMap<String, String> {
        C7874b() {
            put(C7872n3.f17005a, C7872n3.f17006b);
            put(C7872n3.f17007c, C7872n3.f17008d);
            put(C7872n3.f17009e, C7872n3.f17010f);
            put(C7872n3.f17011g, C7872n3.f17012h);
            put(C7872n3.f17013i, C7872n3.f17014j);
            put(C7872n3.f17015k, C7872n3.f17016l);
        }
    }

    /* renamed from: h5.n3$c */
    /* loaded from: classes7.dex */
    class C7875c extends HashMap<String, String> {
        C7875c() {
            put("dictionary", "dict");
            put("phonebook", "phonebk");
            put("traditional", "trad");
            put("gb2312han", "gb2312");
        }
    }

    /* renamed from: h5.n3$d */
    /* loaded from: classes7.dex */
    class C7876d extends HashMap<String, String> {
        C7876d() {
            put("gregorian", "gregory");
        }
    }

    /* renamed from: h5.n3$e */
    /* loaded from: classes7.dex */
    class C7877e extends HashMap<String, String> {
        C7877e() {
            put("traditional", "traditio");
        }
    }

    /* renamed from: h5.n3$f */
    /* loaded from: classes7.dex */
    class C7878f extends HashMap<String, String[]> {
        C7878f() {
            put("nu", new String[]{"adlm", "ahom", "arab", "arabext", "bali", "beng", "bhks", "brah", "cakm", "cham", "deva", "diak", "fullwide", "gong", "gonm", "gujr", "guru", "hanidec", "hmng", "hmnp", "java", "kali", "khmr", "knda", "lana", "lanatham", "laoo", "latn", "lepc", "limb", "mathbold", "mathdbl", "mathmono", "mathsanb", "mathsans", "mlym", "modi", "mong", "mroo", "mtei", "mymr", "mymrshan", "mymrtlng", "newa", "nkoo", "olck", "orya", "osma", "rohg", "saur", "segment", "shrd", "sind", "sinh", "sora", "sund", "takr", "talu", "tamldec", "telu", "thai", "tibt", "tirh", "vaii", "wara", "wcho"});
            put("co", new String[]{"big5han", "compat", "dict", "direct", "ducet", "emoji", "eor", "gb2312", "phonebk", "phonetic", "pinyin", "reformed", "searchjl", "stroke", "trad", "unihan", "zhuyin"});
            put("ca", new String[]{"buddhist", "chinese", "coptic", "dangi", "ethioaa", "ethiopic", "gregory", "hebrew", "indian", "islamic", "islamic-umalqura", "islamic-tbla", "islamic-civil", "islamic-rgsa", "iso8601", "japanese", "persian", "roc"});
        }
    }

    /* renamed from: a */
    public static String m21212a(String str) {
        return f17017m.containsKey(str) ? f17017m.get(str) : str;
    }

    /* renamed from: b */
    public static String m21211b(String str) {
        return f17018n.containsKey(str) ? f17018n.get(str) : str;
    }

    /* renamed from: c */
    public static boolean m21210c(String str, String str2, AbstractC7805b bVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            ULocale uLocale = (ULocale) bVar.mo21162h();
            String[] strArr = new String[0];
            if (str.equals("co")) {
                if (str2.equals("standard") || str2.equals("search")) {
                    return false;
                }
                strArr = RuleBasedCollator.getKeywordValuesForLocale("co", uLocale, false);
            } else if (str.equals("ca")) {
                strArr = Calendar.getKeywordValuesForLocale("ca", uLocale, false);
            } else if (str.equals("nu")) {
                strArr = NumberingSystem.getAvailableNames();
            }
            if (strArr.length == 0) {
                return true;
            }
            return Arrays.asList(strArr).contains(str2);
        } else if (f17022r.containsKey(str)) {
            return Arrays.asList(f17022r.get(str)).contains(str2);
        } else {
            return true;
        }
    }

    /* renamed from: d */
    public static String m21209d(String str) {
        if (!f17020p.containsKey(str)) {
            return str;
        }
        return f17020p.get(str);
    }

    /* renamed from: e */
    public static String m21208e(String str) {
        Map<String, String> map = f17019o;
        if (!map.containsKey(str)) {
            return str;
        }
        return map.get(str);
    }

    /* renamed from: f */
    public static Object m21207f(String str, Object obj) {
        if (str.equals("ca") && C7840i.m21246m(obj)) {
            return m21209d((String) obj);
        }
        if (str.equals("nu") && C7840i.m21246m(obj)) {
            return m21206g((String) obj);
        }
        if (str.equals("co") && C7840i.m21246m(obj)) {
            return m21208e((String) obj);
        }
        if (str.equals("kn") && C7840i.m21246m(obj) && obj.equals("yes")) {
            return C7840i.m21241r("true");
        }
        if ((str.equals("kn") || str.equals("kf")) && C7840i.m21246m(obj) && obj.equals("no")) {
            return C7840i.m21241r("false");
        }
        return obj;
    }

    /* renamed from: g */
    public static String m21206g(String str) {
        if (!f17021q.containsKey(str)) {
            return str;
        }
        return f17021q.get(str);
    }
}
