package net.time4j;

import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.concurrent.ConcurrentMap;
import net.time4j.base.AbstractC10814d;
import p161ij.AbstractC8667r;
import p161ij.AbstractC8683x;
import p161ij.EnumC8659n;
import p161ij.EnumC8671v;
import p163j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: net.time4j.s0 */
/* loaded from: classes8.dex */
public final class C10986s0 {

    /* renamed from: n */
    private static final ConcurrentMap<Locale, C10986s0> f24405n = new ConcurrentHashMap();

    /* renamed from: o */
    private static final AbstractC11036w[] f24406o = {EnumC10882f.f24151n, EnumC10882f.f24153p, EnumC10882f.f24154q, EnumC10882f.f24155r, EnumC10899g.f24189k, EnumC10899g.f24190l, EnumC10899g.f24191m, EnumC10899g.f24192n, EnumC10899g.f24193o, EnumC10899g.f24194p};

    /* renamed from: p */
    private static final AbstractC8683x f24407p;

    /* renamed from: q */
    private static final AbstractC8683x f24408q;

    /* renamed from: a */
    private final Locale f24409a;

    /* renamed from: b */
    private final Map<AbstractC11036w, Map<EnumC8671v, Map<EnumC8659n, String>>> f24410b;

    /* renamed from: c */
    private final Map<AbstractC11036w, Map<EnumC8659n, String>> f24411c;

    /* renamed from: d */
    private final Map<AbstractC11036w, Map<EnumC8659n, String>> f24412d;

    /* renamed from: e */
    private final Map<AbstractC11036w, Map<EnumC8659n, String>> f24413e;

    /* renamed from: f */
    private final Map<AbstractC11036w, Map<EnumC8659n, String>> f24414f;

    /* renamed from: g */
    private final Map<Integer, Map<EnumC8671v, String>> f24415g;

    /* renamed from: h */
    private final String f24416h;

    /* renamed from: i */
    private final String f24417i;

    /* renamed from: j */
    private final String f24418j;

    /* renamed from: k */
    private final String f24419k;

    /* renamed from: l */
    private final Map<EnumC11039x0, String> f24420l;

    /* renamed from: m */
    private final Map<EnumC11039x0, String> f24421m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: net.time4j.s0$a */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class C10987a {

        /* renamed from: a */
        static final /* synthetic */ int[] f24422a;

        static {
            int[] iArr = new int[EnumC8671v.values().length];
            f24422a = iArr;
            try {
                iArr[EnumC8671v.WIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24422a[EnumC8671v.ABBREVIATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24422a[EnumC8671v.SHORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24422a[EnumC8671v.NARROW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: net.time4j.s0$b */
    /* loaded from: classes8.dex */
    private static class C10988b implements AbstractC8683x {
        private C10988b() {
        }

        /* synthetic */ C10988b(C10987a aVar) {
            this();
        }

        /* renamed from: F */
        private static String m11353F(String str, String str2, String str3, EnumC8671v vVar, EnumC8659n nVar) {
            int i = C10987a.f24422a[vVar.ordinal()];
            if (i == 1) {
                return m11352G(str, nVar);
            }
            if (i == 2 || i == 3) {
                return m11352G(str2, nVar);
            }
            if (i == 4) {
                return "{0}" + str3;
            }
            throw new UnsupportedOperationException(vVar.name());
        }

        /* renamed from: G */
        private static String m11352G(String str, EnumC8659n nVar) {
            String str2;
            if (nVar == EnumC8659n.ONE) {
                str2 = "";
            } else {
                str2 = "s";
            }
            return "{0} " + str + str2;
        }

        /* renamed from: H */
        private static String m11351H(String str, boolean z, EnumC8659n nVar) {
            String str2;
            if (nVar == EnumC8659n.ONE) {
                str2 = "";
            } else {
                str2 = "s";
            }
            if (z) {
                return "in {0} " + str + str2;
            }
            return "{0} " + str + str2 + " ago";
        }

        /* renamed from: I */
        private static String m11350I(String str, boolean z) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(z ? "+" : "-");
            sb2.append("{0} ");
            sb2.append(str);
            return sb2.toString();
        }

        /* renamed from: J */
        private static String m11349J(String str) {
            return "{0} " + str;
        }

        @Override // p161ij.AbstractC8683x
        /* renamed from: B */
        public String mo10664B(Locale locale, boolean z, EnumC8659n nVar) {
            if (locale.getLanguage().equals("en")) {
                return m11351H("month", z, nVar);
            }
            return m11350I("m", z);
        }

        @Override // p161ij.AbstractC8683x
        /* renamed from: C */
        public String mo10663C(Locale locale, EnumC8671v vVar, EnumC8659n nVar) {
            if (locale.getLanguage().equals("en")) {
                return m11353F("microsecond", "µsec", "µs", vVar, nVar);
            }
            return m11349J("µs");
        }

        @Override // p161ij.AbstractC8683x
        /* renamed from: D */
        public String mo10662D(Locale locale, boolean z, EnumC8659n nVar) {
            if (locale.getLanguage().equals("en")) {
                return m11351H("hour", z, nVar);
            }
            return m11350I("h", z);
        }

        @Override // p161ij.AbstractC8683x
        /* renamed from: E */
        public String mo10661E(Locale locale, EnumC8671v vVar, EnumC8659n nVar) {
            if (locale.getLanguage().equals("en")) {
                return m11353F("millisecond", "msec", "ms", vVar, nVar);
            }
            return m11349J("ms");
        }

        @Override // p161ij.AbstractC8683x
        /* renamed from: a */
        public String mo10652a(Locale locale, EnumC8671v vVar, EnumC8659n nVar) {
            if (locale.getLanguage().equals("en")) {
                return m11353F("nanosecond", "nsec", "ns", vVar, nVar);
            }
            return m11349J("ns");
        }

        @Override // p161ij.AbstractC8683x
        /* renamed from: c */
        public String mo10650c(Locale locale, EnumC8671v vVar, EnumC8659n nVar) {
            if (locale.getLanguage().equals("en")) {
                return m11353F("month", "mth", "m", vVar, nVar);
            }
            return m11349J("m");
        }

        @Override // p161ij.AbstractC8683x
        /* renamed from: f */
        public String mo10647f(Locale locale) {
            return "now";
        }

        @Override // p161ij.AbstractC8683x
        /* renamed from: g */
        public String mo10646g(Locale locale, EnumC8671v vVar, EnumC8659n nVar) {
            if (locale.getLanguage().equals("en")) {
                return m11353F("day", "day", "d", vVar, nVar);
            }
            return m11349J("d");
        }

        @Override // p161ij.AbstractC8683x
        /* renamed from: i */
        public String mo10644i(Locale locale, boolean z, EnumC8659n nVar) {
            if (locale.getLanguage().equals("en")) {
                return m11351H("second", z, nVar);
            }
            return m11350I("s", z);
        }

        @Override // p161ij.AbstractC8683x
        /* renamed from: l */
        public String mo10641l(Locale locale, EnumC8671v vVar, int i) {
            if (i >= 2) {
                StringBuilder sb2 = new StringBuilder(i * 5);
                for (int i2 = 0; i2 < i; i2++) {
                    sb2.append('{');
                    sb2.append(i2);
                    sb2.append('}');
                    if (i2 < i - 1) {
                        sb2.append(", ");
                    }
                }
                return sb2.toString();
            }
            throw new IllegalArgumentException("Size must be greater than 1.");
        }

        @Override // p161ij.AbstractC8683x
        /* renamed from: m */
        public String mo10640m(Locale locale, EnumC8671v vVar, EnumC8659n nVar) {
            if (locale.getLanguage().equals("en")) {
                return m11353F("year", "yr", "y", vVar, nVar);
            }
            return m11349J("y");
        }

        @Override // p161ij.AbstractC8683x
        /* renamed from: n */
        public String mo10639n(Locale locale, boolean z, EnumC8659n nVar) {
            if (locale.getLanguage().equals("en")) {
                return m11351H("week", z, nVar);
            }
            return m11350I("w", z);
        }

        @Override // p161ij.AbstractC8683x
        /* renamed from: o */
        public String mo10638o(Locale locale, boolean z, EnumC8659n nVar) {
            if (locale.getLanguage().equals("en")) {
                return m11351H("year", z, nVar);
            }
            return m11350I("y", z);
        }

        @Override // p161ij.AbstractC8683x
        /* renamed from: r */
        public String mo10635r(Locale locale, EnumC8671v vVar, EnumC8659n nVar) {
            if (locale.getLanguage().equals("en")) {
                return m11353F("second", "sec", "s", vVar, nVar);
            }
            return m11349J("s");
        }

        @Override // p161ij.AbstractC8683x
        /* renamed from: s */
        public String mo10634s(Locale locale, EnumC8671v vVar, EnumC8659n nVar) {
            if (locale.getLanguage().equals("en")) {
                return m11353F("minute", "min", "m", vVar, nVar);
            }
            return m11349J("min");
        }

        @Override // p161ij.AbstractC8683x
        /* renamed from: v */
        public String mo10631v(Locale locale, EnumC8671v vVar, EnumC8659n nVar) {
            if (locale.getLanguage().equals("en")) {
                return m11353F("hour", "hr", "h", vVar, nVar);
            }
            return m11349J("h");
        }

        @Override // p161ij.AbstractC8683x
        /* renamed from: w */
        public String mo10630w(Locale locale, boolean z, EnumC8659n nVar) {
            if (locale.getLanguage().equals("en")) {
                return m11351H("minute", z, nVar);
            }
            return m11350I("min", z);
        }

        @Override // p161ij.AbstractC8683x
        /* renamed from: x */
        public String mo10629x(Locale locale, EnumC8671v vVar, EnumC8659n nVar) {
            if (locale.getLanguage().equals("en")) {
                return m11353F("week", "wk", "w", vVar, nVar);
            }
            return m11349J("w");
        }

        @Override // p161ij.AbstractC8683x
        /* renamed from: y */
        public String mo10628y(Locale locale, boolean z, EnumC8659n nVar) {
            if (locale.getLanguage().equals("en")) {
                return m11351H("day", z, nVar);
            }
            return m11350I("d", z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [ij.x] */
    static {
        C10988b bVar = null;
        C10988b bVar2 = new C10988b(null);
        f24408q = bVar2;
        Iterator it = AbstractC10814d.m12187c().mo12183g(AbstractC8683x.class).iterator();
        if (it.hasNext()) {
            bVar = (AbstractC8683x) it.next();
        }
        if (bVar != null) {
            bVar2 = bVar;
        }
        f24407p = bVar2;
    }

    private C10986s0(Locale locale) {
        String str;
        String str2;
        String str3;
        String str4;
        EnumC11039x0[] values;
        EnumC8671v[] values2;
        EnumC8659n[] values3;
        this.f24409a = locale;
        HashMap hashMap = new HashMap(10);
        HashMap hashMap2 = new HashMap(10);
        HashMap hashMap3 = new HashMap(10);
        HashMap hashMap4 = new HashMap(10);
        HashMap hashMap5 = new HashMap(10);
        HashMap hashMap6 = new HashMap(10);
        AbstractC11036w[] wVarArr = f24406o;
        int length = wVarArr.length;
        int i = 0;
        while (i < length) {
            AbstractC11036w wVar = wVarArr[i];
            EnumMap enumMap = new EnumMap(EnumC8671v.class);
            EnumC8671v[] values4 = EnumC8671v.values();
            int i2 = 0;
            for (int length2 = values4.length; i2 < length2; length2 = length2) {
                EnumC8671v vVar = values4[i2];
                EnumMap enumMap2 = new EnumMap(EnumC8659n.class);
                EnumC8659n[] values5 = EnumC8659n.values();
                int length3 = values5.length;
                int i3 = 0;
                while (i3 < length3) {
                    EnumC8659n nVar = values5[i3];
                    enumMap2.put((EnumMap) nVar, (EnumC8659n) m11356f(locale, wVar, vVar, nVar));
                    i3++;
                    length3 = length3;
                    values5 = values5;
                }
                enumMap.put((EnumMap) vVar, (EnumC8671v) Collections.unmodifiableMap(enumMap2));
                i2++;
                length = length;
                values4 = values4;
            }
            hashMap.put(wVar, Collections.unmodifiableMap(enumMap));
            if (!Character.isDigit(wVar.mo11166a())) {
                EnumMap enumMap3 = new EnumMap(EnumC8659n.class);
                EnumC8659n[] values6 = EnumC8659n.values();
                int length4 = values6.length;
                int i4 = 0;
                while (i4 < length4) {
                    EnumC8659n nVar2 = values6[i4];
                    enumMap3.put((EnumMap) nVar2, (EnumC8659n) m11355g(locale, wVar, false, false, nVar2));
                    i4++;
                    values6 = values6;
                }
                hashMap2.put(wVar, Collections.unmodifiableMap(enumMap3));
                EnumMap enumMap4 = new EnumMap(EnumC8659n.class);
                EnumC8659n[] values7 = EnumC8659n.values();
                int length5 = values7.length;
                int i5 = 0;
                while (i5 < length5) {
                    EnumC8659n nVar3 = values7[i5];
                    enumMap4.put((EnumMap) nVar3, (EnumC8659n) m11355g(locale, wVar, false, true, nVar3));
                    i5++;
                    values7 = values7;
                }
                hashMap4.put(wVar, Collections.unmodifiableMap(enumMap4));
                EnumMap enumMap5 = new EnumMap(EnumC8659n.class);
                EnumC8659n[] values8 = EnumC8659n.values();
                int length6 = values8.length;
                int i6 = 0;
                while (i6 < length6) {
                    EnumC8659n nVar4 = values8[i6];
                    enumMap5.put((EnumMap) nVar4, (EnumC8659n) m11355g(locale, wVar, true, false, nVar4));
                    i6++;
                    length6 = length6;
                    values8 = values8;
                }
                hashMap3.put(wVar, Collections.unmodifiableMap(enumMap5));
                EnumMap enumMap6 = new EnumMap(EnumC8659n.class);
                for (EnumC8659n nVar5 : EnumC8659n.values()) {
                    enumMap6.put((EnumMap) nVar5, (EnumC8659n) m11355g(locale, wVar, true, true, nVar5));
                }
                hashMap5.put(wVar, Collections.unmodifiableMap(enumMap6));
            }
            i++;
            wVarArr = wVarArr;
            length = length;
        }
        for (int i7 = 2; i7 <= 7; i7++) {
            Integer valueOf = Integer.valueOf(i7);
            EnumMap enumMap7 = new EnumMap(EnumC8671v.class);
            for (EnumC8671v vVar2 : EnumC8671v.values()) {
                enumMap7.put((EnumMap) vVar2, (EnumC8671v) m11357e(locale, vVar2, valueOf.intValue()));
            }
            hashMap6.put(valueOf, Collections.unmodifiableMap(enumMap7));
        }
        this.f24410b = Collections.unmodifiableMap(hashMap);
        this.f24411c = Collections.unmodifiableMap(hashMap2);
        this.f24412d = Collections.unmodifiableMap(hashMap3);
        this.f24413e = Collections.unmodifiableMap(hashMap4);
        this.f24414f = Collections.unmodifiableMap(hashMap5);
        this.f24415g = Collections.unmodifiableMap(hashMap6);
        EnumMap enumMap8 = new EnumMap(EnumC11039x0.class);
        EnumMap enumMap9 = new EnumMap(EnumC11039x0.class);
        EnumC11039x0[] values9 = EnumC11039x0.values();
        int length7 = values9.length;
        int i8 = 0;
        while (true) {
            str = "";
            if (i8 < length7) {
                EnumC11039x0 x0Var = values9[i8];
                enumMap8.put((EnumMap) x0Var, (EnumC11039x0) str);
                enumMap9.put((EnumMap) x0Var, (EnumC11039x0) str);
                i8++;
            } else {
                try {
                    break;
                } catch (MissingResourceException unused) {
                    str4 = str;
                    str2 = str4;
                }
            }
        }
        AbstractC8683x xVar = f24407p;
        String str5 = xVar.mo10647f(locale);
        if (xVar instanceof AbstractC8667r) {
            AbstractC8667r rVar = (AbstractC8667r) AbstractC8667r.class.cast(xVar);
            String e = rVar.mo10648e(locale);
            try {
                str2 = rVar.mo10632u(locale);
                try {
                    str = rVar.mo10643j(locale);
                    for (EnumC11039x0 x0Var2 : EnumC11039x0.values()) {
                        enumMap8.put((EnumMap) x0Var2, (EnumC11039x0) rVar.mo10636q(x0Var2, locale));
                        enumMap9.put((EnumMap) x0Var2, (EnumC11039x0) rVar.mo10665A(x0Var2, locale));
                    }
                    str3 = str;
                    str = e;
                } catch (MissingResourceException unused2) {
                    str4 = str;
                    str = e;
                    str5 = f24408q.mo10647f(locale);
                    str3 = str4;
                    this.f24416h = str5;
                    this.f24417i = str;
                    this.f24418j = str2;
                    this.f24419k = str3;
                    this.f24420l = Collections.unmodifiableMap(enumMap8);
                    this.f24421m = Collections.unmodifiableMap(enumMap9);
                }
            } catch (MissingResourceException unused3) {
                str4 = str;
                str2 = str4;
            }
        } else {
            str3 = str;
            str2 = str3;
        }
        this.f24416h = str5;
        this.f24417i = str;
        this.f24418j = str2;
        this.f24419k = str3;
        this.f24420l = Collections.unmodifiableMap(enumMap8);
        this.f24421m = Collections.unmodifiableMap(enumMap9);
    }

    /* renamed from: a */
    private static char m11361a(AbstractC11036w wVar) {
        char a = wVar.mo11166a();
        if (wVar == EnumC10899g.f24190l) {
            return 'N';
        }
        return a;
    }

    /* renamed from: c */
    private static String m11359c(AbstractC8683x xVar, Locale locale, char c, EnumC8671v vVar, EnumC8659n nVar) {
        if (c == '3') {
            return xVar.mo10661E(locale, vVar, nVar);
        }
        if (c == '6') {
            return xVar.mo10663C(locale, vVar, nVar);
        }
        if (c == '9') {
            return xVar.mo10652a(locale, vVar, nVar);
        }
        if (c == 'D') {
            return xVar.mo10646g(locale, vVar, nVar);
        }
        if (c == 'H') {
            return xVar.mo10631v(locale, vVar, nVar);
        }
        if (c == 'S') {
            return xVar.mo10635r(locale, vVar, nVar);
        }
        if (c == 'W') {
            return xVar.mo10629x(locale, vVar, nVar);
        }
        if (c == 'Y') {
            return xVar.mo10640m(locale, vVar, nVar);
        }
        if (c == 'M') {
            return xVar.mo10650c(locale, vVar, nVar);
        }
        if (c == 'N') {
            return xVar.mo10634s(locale, vVar, nVar);
        }
        throw new UnsupportedOperationException("Unit-ID: " + c);
    }

    /* renamed from: d */
    private static String m11358d(AbstractC8683x xVar, Locale locale, char c, boolean z, boolean z2, EnumC8659n nVar) {
        if (z2 && (xVar instanceof AbstractC8667r)) {
            AbstractC8667r rVar = (AbstractC8667r) AbstractC8667r.class.cast(xVar);
            if (c == 'D') {
                return rVar.mo10645h(locale, z, nVar);
            }
            if (c == 'H') {
                return rVar.mo10642k(locale, z, nVar);
            }
            if (c == 'S') {
                return rVar.mo10633t(locale, z, nVar);
            }
            if (c == 'W') {
                return rVar.mo10637p(locale, z, nVar);
            }
            if (c == 'Y') {
                return rVar.mo10627z(locale, z, nVar);
            }
            if (c == 'M') {
                return rVar.mo10651b(locale, z, nVar);
            }
            if (c == 'N') {
                return rVar.mo10649d(locale, z, nVar);
            }
            throw new UnsupportedOperationException("Unit-ID: " + c);
        } else if (c == 'D') {
            return xVar.mo10628y(locale, z, nVar);
        } else {
            if (c == 'H') {
                return xVar.mo10662D(locale, z, nVar);
            }
            if (c == 'S') {
                return xVar.mo10644i(locale, z, nVar);
            }
            if (c == 'W') {
                return xVar.mo10639n(locale, z, nVar);
            }
            if (c == 'Y') {
                return xVar.mo10638o(locale, z, nVar);
            }
            if (c == 'M') {
                return xVar.mo10664B(locale, z, nVar);
            }
            if (c == 'N') {
                return xVar.mo10630w(locale, z, nVar);
            }
            throw new UnsupportedOperationException("Unit-ID: " + c);
        }
    }

    /* renamed from: e */
    private static String m11357e(Locale locale, EnumC8671v vVar, int i) {
        try {
            return f24407p.mo10641l(locale, vVar, i);
        } catch (MissingResourceException unused) {
            return f24408q.mo10641l(locale, vVar, i);
        }
    }

    /* renamed from: f */
    private static String m11356f(Locale locale, AbstractC11036w wVar, EnumC8671v vVar, EnumC8659n nVar) {
        try {
            return m11359c(f24407p, locale, m11361a(wVar), vVar, nVar);
        } catch (MissingResourceException unused) {
            return m11359c(f24408q, locale, m11361a(wVar), vVar, nVar);
        }
    }

    /* renamed from: g */
    private static String m11355g(Locale locale, AbstractC11036w wVar, boolean z, boolean z2, EnumC8659n nVar) {
        try {
            return m11358d(f24407p, locale, m11361a(wVar), z, z2, nVar);
        } catch (MissingResourceException unused) {
            return m11358d(f24408q, locale, m11361a(wVar), z, z2, nVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static C10986s0 m11354h(Locale locale) {
        if (locale != null) {
            ConcurrentMap<Locale, C10986s0> concurrentMap = f24405n;
            C10986s0 s0Var = concurrentMap.get(locale);
            if (s0Var != null) {
                return s0Var;
            }
            C10986s0 s0Var2 = new C10986s0(locale);
            C10986s0 putIfAbsent = concurrentMap.putIfAbsent(locale, s0Var2);
            if (putIfAbsent != null) {
                return putIfAbsent;
            }
            return s0Var2;
        }
        throw new NullPointerException("Missing language.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public String m11360b() {
        return this.f24418j;
    }
}
