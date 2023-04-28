package p287pj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.text.DateFormatSymbols;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import net.time4j.base.AbstractC10814d;
import net.time4j.p248tz.AbstractC11031s;
import net.time4j.p248tz.EnumC10994d;
import p163j$.util.concurrent.ConcurrentHashMap;
import p250nj.C11155e;

/* renamed from: pj.b */
/* loaded from: classes8.dex */
public class C11782b implements AbstractC11031s {

    /* renamed from: a */
    private static final ConcurrentMap<Locale, Map<String, Map<EnumC10994d, String>>> f26290a = new ConcurrentHashMap();

    /* renamed from: b */
    private static final Set<String> f26291b;

    /* renamed from: c */
    private static final Map<String, Set<String>> f26292c;

    /* renamed from: d */
    private static final Map<String, String> f26293d;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("Z");
        hashSet.add("GMT");
        hashSet.add("GMT0");
        hashSet.add("Greenwich");
        hashSet.add("UCT");
        hashSet.add("UTC");
        hashSet.add("UTC0");
        hashSet.add("Universal");
        hashSet.add("Zulu");
        f26291b = Collections.unmodifiableSet(hashSet);
        HashMap hashMap = new HashMap();
        m8626f(hashMap, "data/zone1970.tab");
        f26292c = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        m8631a(hashMap2, "CL", "America/Santiago");
        m8631a(hashMap2, "CN", "Asia/Shanghai");
        m8631a(hashMap2, "DE", "Europe/Berlin");
        m8631a(hashMap2, "EC", "America/Guayaquil");
        m8631a(hashMap2, "ES", "Europe/Madrid");
        m8631a(hashMap2, "MH", "Pacific/Majuro");
        m8631a(hashMap2, "MY", "Asia/Kuala_Lumpur");
        m8631a(hashMap2, "NZ", "Pacific/Auckland");
        m8631a(hashMap2, "PT", "Europe/Lisbon");
        m8631a(hashMap2, "UA", "Europe/Kiev");
        m8631a(hashMap2, "UZ", "Asia/Tashkent");
        f26293d = Collections.unmodifiableMap(hashMap2);
    }

    /* renamed from: a */
    private static void m8631a(Map<String, String> map, String str, String str2) {
        map.put(str, str2);
    }

    /* renamed from: b */
    private static void m8630b(Map<String, Set<String>> map, String str, String str2) {
        Set<String> set = map.get(str);
        if (set == null) {
            set = new LinkedHashSet<>();
            map.put(str, set);
        }
        set.add(str2);
    }

    /* renamed from: d */
    private static C11155e m8628d(Locale locale) {
        return C11155e.m10681h("olson/zones/tzname", locale);
    }

    /* renamed from: f */
    static void m8626f(Map<String, Set<String>> map, String str) {
        InputStream e = AbstractC10814d.m12187c().mo12185e(AbstractC10814d.m12187c().mo12184f("olson", C11782b.class, str), true);
        if (e == null) {
            e = C11782b.class.getClassLoader().getResourceAsStream(str);
        }
        try {
            if (e != null) {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(e, "UTF-8"));
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            try {
                                e.close();
                                return;
                            } catch (IOException e2) {
                                e2.printStackTrace(System.err);
                                return;
                            }
                        } else if (!readLine.startsWith("#") && !readLine.isEmpty()) {
                            String[] split = readLine.split("\t");
                            if (split.length >= 3) {
                                for (String str2 : split[0].split(",")) {
                                    m8630b(map, str2, split[2]);
                                }
                            }
                        }
                    }
                } catch (UnsupportedEncodingException e3) {
                    throw new AssertionError(e3);
                } catch (IOException e4) {
                    throw new IllegalStateException(e4);
                }
            } else {
                System.err.println("Warning: File \"" + str + "\" not found.");
            }
        } catch (Throwable th2) {
            try {
                e.close();
            } catch (IOException e5) {
                e5.printStackTrace(System.err);
            }
            throw th2;
        }
    }

    @Override // net.time4j.p248tz.AbstractC11031s
    /* renamed from: c */
    public Set<String> mo8629c(Locale locale, boolean z) {
        String country = locale.getCountry();
        if (z) {
            if (country.equals("US")) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                linkedHashSet.add("America/New_York");
                linkedHashSet.add("America/Chicago");
                linkedHashSet.add("America/Denver");
                linkedHashSet.add("America/Los_Angeles");
                linkedHashSet.add("America/Anchorage");
                linkedHashSet.add("Pacific/Honolulu");
                return Collections.unmodifiableSet(linkedHashSet);
            }
            String str = f26293d.get(country);
            if (str != null) {
                return Collections.singleton(str);
            }
        }
        Set<String> set = f26292c.get(country);
        if (set == null) {
            return Collections.emptySet();
        }
        return set;
    }

    @Override // net.time4j.p248tz.AbstractC11031s
    /* renamed from: e */
    public String mo8627e(boolean z, Locale locale) {
        return m8628d(locale).m10683f(z ? "utc-literal" : "offset-pattern");
    }

    @Override // net.time4j.p248tz.AbstractC11031s
    /* renamed from: g */
    public String mo8625g(String str, EnumC10994d dVar, Locale locale) {
        if (f26291b.contains(str)) {
            return "";
        }
        Map<String, Map<EnumC10994d, String>> map = f26290a.get(locale);
        if (map == null) {
            String[][] zoneStrings = DateFormatSymbols.getInstance(locale).getZoneStrings();
            HashMap hashMap = new HashMap();
            for (String[] strArr : zoneStrings) {
                EnumMap enumMap = new EnumMap(EnumC10994d.class);
                enumMap.put((EnumMap) EnumC10994d.LONG_STANDARD_TIME, (EnumC10994d) strArr[1]);
                enumMap.put((EnumMap) EnumC10994d.SHORT_STANDARD_TIME, (EnumC10994d) strArr[2]);
                enumMap.put((EnumMap) EnumC10994d.LONG_DAYLIGHT_TIME, (EnumC10994d) strArr[3]);
                enumMap.put((EnumMap) EnumC10994d.SHORT_DAYLIGHT_TIME, (EnumC10994d) strArr[4]);
                hashMap.put(strArr[0], enumMap);
            }
            map = f26290a.putIfAbsent(locale, hashMap);
            if (map == null) {
                map = hashMap;
            }
        }
        Map<EnumC10994d, String> map2 = map.get(str);
        if (map2 != null) {
            return map2.get(dVar);
        }
        return "";
    }
}
