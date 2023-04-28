package p250nj;

import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import net.time4j.base.AbstractC10814d;
import p163j$.util.concurrent.ConcurrentHashMap;

/* renamed from: nj.e */
/* loaded from: classes8.dex */
public final class C11155e {

    /* renamed from: e */
    private static final ConcurrentMap<C11157b, C11156a> f24824e = new ConcurrentHashMap(32);

    /* renamed from: f */
    private static final ReferenceQueue<Object> f24825f = new ReferenceQueue<>();

    /* renamed from: a */
    private final C11155e f24826a;

    /* renamed from: b */
    private final Map<String, String> f24827b;

    /* renamed from: c */
    private final String f24828c;

    /* renamed from: d */
    private final Locale f24829d;

    /* renamed from: nj.e$a */
    /* loaded from: classes8.dex */
    private static class C11156a extends SoftReference<C11155e> {

        /* renamed from: a */
        private C11157b f24830a;

        C11156a(C11155e eVar, C11157b bVar) {
            super(eVar, C11155e.f24825f);
            this.f24830a = bVar;
        }
    }

    /* renamed from: nj.e$b */
    /* loaded from: classes8.dex */
    private static class C11157b {

        /* renamed from: a */
        private final String f24831a;

        /* renamed from: b */
        private final Locale f24832b;

        C11157b(String str, Locale locale) {
            this.f24831a = str;
            this.f24832b = locale;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11157b)) {
                return false;
            }
            C11157b bVar = (C11157b) obj;
            if (!this.f24831a.equals(bVar.f24831a) || !this.f24832b.equals(bVar.f24832b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (this.f24831a.hashCode() << 3) ^ this.f24832b.hashCode();
        }

        public String toString() {
            return this.f24831a + "/" + this.f24832b;
        }
    }

    private C11155e(C11159g gVar, String str, Locale locale) {
        int i;
        this.f24826a = null;
        this.f24828c = str;
        this.f24829d = locale;
        HashMap hashMap = new HashMap();
        while (true) {
            String g = gVar.m10666g();
            if (g != null) {
                String trim = g.trim();
                if (!trim.isEmpty() && trim.charAt(0) != '#') {
                    int length = trim.length();
                    int i2 = 0;
                    while (true) {
                        if (i2 < length) {
                            if (trim.charAt(i2) == '=' && (i = i2 + 1) < length) {
                                hashMap.put(trim.substring(0, i2), trim.substring(i));
                                break;
                            }
                            i2++;
                        } else {
                            break;
                        }
                    }
                }
            } else {
                this.f24827b = Collections.unmodifiableMap(hashMap);
                return;
            }
        }
    }

    /* renamed from: c */
    public static List<Locale> m10686c(Locale locale) {
        String a = EnumC11154d.m10689a(locale);
        String country = locale.getCountry();
        String variant = locale.getVariant();
        LinkedList linkedList = new LinkedList();
        if (!variant.isEmpty()) {
            linkedList.add(new Locale(a, country, variant));
        }
        if (!country.isEmpty()) {
            linkedList.add(new Locale(a, country, ""));
        }
        if (!a.isEmpty()) {
            linkedList.add(new Locale(a, "", ""));
            if (a.equals("nn")) {
                linkedList.add(new Locale("nb", "", ""));
            }
        }
        linkedList.add(Locale.ROOT);
        return linkedList;
    }

    /* renamed from: h */
    public static C11155e m10681h(String str, Locale locale) {
        C11155e eVar;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Base name must not be empty.");
        } else if (locale != null) {
            C11157b bVar = new C11157b(str, locale);
            C11156a aVar = f24824e.get(bVar);
            if (!(aVar == null || (eVar = aVar.get()) == null)) {
                return eVar;
            }
            while (true) {
                Reference<? extends Object> poll = f24825f.poll();
                if (poll == null) {
                    break;
                }
                f24824e.remove(((C11156a) poll).f24830a);
            }
            ArrayList arrayList = new ArrayList();
            for (Locale locale2 : m10686c(locale)) {
                try {
                    C11155e i = m10680i(str, locale2);
                    if (i != null) {
                        arrayList.add(i);
                    }
                } catch (IOException e) {
                    throw new IllegalStateException(e);
                }
            }
            if (!arrayList.isEmpty()) {
                for (int size = arrayList.size() - 1; size >= 1; size--) {
                    int i2 = size - 1;
                    arrayList.set(i2, ((C11155e) arrayList.get(i2)).m10678k((C11155e) arrayList.get(size)));
                }
                C11155e eVar2 = (C11155e) arrayList.get(0);
                f24824e.putIfAbsent(bVar, new C11156a(eVar2, bVar));
                return eVar2;
            }
            throw new MissingResourceException("Cannot find resource bundle for: " + m10679j(str, locale), C11155e.class.getName(), "");
        } else {
            throw new NullPointerException("Missing locale.");
        }
    }

    /* renamed from: i */
    private static C11155e m10680i(String str, Locale locale) {
        Throwable th2;
        int indexOf = str.indexOf(47);
        String substring = str.substring(0, indexOf);
        String j = m10679j(str.substring(indexOf + 1), locale);
        InputStream e = AbstractC10814d.m12187c().mo12185e(AbstractC10814d.m12187c().mo12184f(substring, C11155e.class, j), true);
        C11155e eVar = null;
        C11159g gVar = null;
        if (e == null) {
            try {
                e = AbstractC10814d.m12187c().m12186d(C11155e.class, j, true);
            } catch (IOException unused) {
                return null;
            }
        }
        if (e != null) {
            try {
                C11159g gVar2 = new C11159g(e);
                try {
                    eVar = new C11155e(gVar2, str, locale);
                    gVar2.close();
                } catch (Throwable th3) {
                    th2 = th3;
                    gVar = gVar2;
                    if (gVar != null) {
                        gVar.close();
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                th2 = th4;
            }
        }
        return eVar;
    }

    /* renamed from: j */
    private static String m10679j(String str, Locale locale) {
        String a = EnumC11154d.m10689a(locale);
        String country = locale.getCountry();
        String variant = locale.getVariant();
        StringBuilder sb2 = new StringBuilder(str.length() + 20);
        sb2.append(str.replace('.', '/'));
        if (!a.isEmpty()) {
            sb2.append('_');
            sb2.append(a);
            if (!variant.isEmpty()) {
                sb2.append('_');
                sb2.append(country);
                sb2.append('_');
                sb2.append(variant);
            } else if (!country.isEmpty()) {
                sb2.append('_');
                sb2.append(country);
            }
        }
        sb2.append(".properties");
        return sb2.toString();
    }

    /* renamed from: k */
    private C11155e m10678k(C11155e eVar) {
        return eVar == null ? this : new C11155e(this, eVar);
    }

    /* renamed from: b */
    public boolean m10687b(String str) {
        if (str != null) {
            C11155e eVar = this;
            while (eVar.f24827b.get(str) == null) {
                eVar = eVar.f24826a;
                if (eVar == null) {
                    return false;
                }
            }
            return true;
        }
        throw new NullPointerException("Missing resource key.");
    }

    /* renamed from: d */
    public Set<String> m10685d() {
        return this.f24827b.keySet();
    }

    /* renamed from: e */
    public Locale m10684e() {
        return this.f24829d;
    }

    /* renamed from: f */
    public String m10683f(String str) {
        if (str != null) {
            C11155e eVar = this;
            do {
                String str2 = eVar.f24827b.get(str);
                if (str2 != null) {
                    return str2;
                }
                eVar = eVar.f24826a;
            } while (eVar != null);
            throw new MissingResourceException("Cannot find property resource for: " + m10679j(this.f24828c, this.f24829d) + "=>" + str, C11155e.class.getName(), str);
        }
        throw new NullPointerException("Missing resource key.");
    }

    /* renamed from: g */
    public Set<String> m10682g() {
        HashSet hashSet = new HashSet(this.f24827b.keySet());
        C11155e eVar = this;
        while (true) {
            eVar = eVar.f24826a;
            if (eVar == null) {
                return Collections.unmodifiableSet(hashSet);
            }
            hashSet.addAll(eVar.f24827b.keySet());
        }
    }

    private C11155e(C11155e eVar, C11155e eVar2) {
        this.f24826a = eVar2;
        this.f24828c = eVar.f24828c;
        this.f24829d = eVar.f24829d;
        this.f24827b = eVar.f24827b;
    }
}
