package p161ij;

import com.discord.nearby.NearbyManager;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.Normalizer;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import net.time4j.base.AbstractC10814d;
import p143hj.AbstractC8064i;
import p143hj.AbstractC8079p;
import p143hj.C8087x;
import p163j$.util.concurrent.ConcurrentHashMap;
import p201kj.AbstractC9888c;
import p201kj.C9889d;
import p250nj.C11153c;
import p250nj.C11155e;

/* renamed from: ij.b */
/* loaded from: classes8.dex */
public final class C8629b {

    /* renamed from: l */
    private static final Set<String> f19080l;

    /* renamed from: m */
    private static final AbstractC8636f f19081m;

    /* renamed from: n */
    private static final AbstractC8670u f19082n;

    /* renamed from: o */
    private static final AbstractC8670u f19083o;

    /* renamed from: p */
    private static final ConcurrentMap<String, C8629b> f19084p;

    /* renamed from: a */
    private final String f19085a;

    /* renamed from: b */
    private final Map<EnumC8671v, Map<EnumC8658m, C8668s>> f19086b;

    /* renamed from: c */
    private final Map<EnumC8671v, Map<EnumC8658m, C8668s>> f19087c;

    /* renamed from: d */
    private final Map<EnumC8671v, Map<EnumC8658m, C8668s>> f19088d;

    /* renamed from: e */
    private final Map<EnumC8671v, Map<EnumC8658m, C8668s>> f19089e;

    /* renamed from: f */
    private final Map<EnumC8671v, Map<EnumC8658m, C8668s>> f19090f;

    /* renamed from: g */
    private final Map<EnumC8671v, C8668s> f19091g;

    /* renamed from: h */
    private final Map<String, String> f19092h;

    /* renamed from: i */
    private final String f19093i;

    /* renamed from: j */
    private final Locale f19094j;

    /* renamed from: k */
    private final MissingResourceException f19095k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ij.b$a */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class C8630a {

        /* renamed from: a */
        static final /* synthetic */ int[] f19096a;

        /* renamed from: b */
        static final /* synthetic */ int[] f19097b;

        static {
            int[] iArr = new int[EnumC8635e.values().length];
            f19097b = iArr;
            try {
                iArr[EnumC8635e.FULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19097b[EnumC8635e.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19097b[EnumC8635e.MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19097b[EnumC8635e.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[EnumC8671v.values().length];
            f19096a = iArr2;
            try {
                iArr2[EnumC8671v.WIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19096a[EnumC8671v.ABBREVIATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19096a[EnumC8671v.SHORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f19096a[EnumC8671v.NARROW.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* renamed from: ij.b$b */
    /* loaded from: classes8.dex */
    private static class C0274b implements AbstractC8670u {
        private C0274b() {
        }

        /* synthetic */ C0274b(C8630a aVar) {
            this();
        }

        @Override // p161ij.AbstractC8670u
        /* renamed from: a */
        public String[] mo10710a(String str, Locale locale, EnumC8671v vVar) {
            if (vVar == EnumC8671v.NARROW) {
                return new String[]{"B", "A"};
            }
            return new String[]{"BC", "AD"};
        }

        @Override // p161ij.AbstractC8670u
        /* renamed from: b */
        public boolean mo10709b(Locale locale) {
            return true;
        }

        @Override // p161ij.AbstractC8670u
        /* renamed from: e */
        public String[] mo10706e(String str, Locale locale, EnumC8671v vVar, EnumC8658m mVar, boolean z) {
            if (vVar == EnumC8671v.WIDE) {
                return new String[]{"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13"};
            }
            return new String[]{NearbyManager.PERMISSION_DENIED, "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13"};
        }

        @Override // p161ij.AbstractC8670u
        /* renamed from: g */
        public String[] mo10704g(String str, Locale locale, EnumC8671v vVar, EnumC8658m mVar) {
            if (vVar == EnumC8671v.NARROW) {
                return new String[]{"A", "P"};
            }
            return new String[]{"AM", "PM"};
        }

        @Override // p161ij.AbstractC8670u
        /* renamed from: h */
        public String[] mo10703h(String str, Locale locale, EnumC8671v vVar, EnumC8658m mVar) {
            if (vVar == EnumC8671v.NARROW) {
                return new String[]{NearbyManager.PERMISSION_DENIED, "2", "3", "4"};
            }
            return new String[]{"Q1", "Q2", "Q3", "Q4"};
        }

        @Override // p161ij.AbstractC8670u
        /* renamed from: j */
        public boolean mo10701j(String str) {
            return true;
        }

        @Override // p161ij.AbstractC8670u
        /* renamed from: k */
        public String[] mo10700k(String str, Locale locale, EnumC8671v vVar, EnumC8658m mVar) {
            return new String[]{NearbyManager.PERMISSION_DENIED, "2", "3", "4", "5", "6", "7"};
        }

        public String toString() {
            return "FallbackProvider";
        }
    }

    /* renamed from: ij.b$c */
    /* loaded from: classes8.dex */
    private static class C8631c implements AbstractC8636f {

        /* renamed from: a */
        private final AbstractC8636f f19098a;

        C8631c(AbstractC8636f fVar) {
            this.f19098a = fVar;
        }

        /* renamed from: a */
        private static String m18449a(DateFormat dateFormat) {
            if (dateFormat instanceof SimpleDateFormat) {
                return ((SimpleDateFormat) SimpleDateFormat.class.cast(dateFormat)).toPattern();
            }
            throw new IllegalStateException("Cannot retrieve format pattern: " + dateFormat);
        }

        /* renamed from: b */
        private static int m18448b(EnumC8635e eVar) {
            int i = C8630a.f19097b[eVar.ordinal()];
            if (i == 1) {
                return 0;
            }
            if (i == 2) {
                return 1;
            }
            if (i == 3) {
                return 2;
            }
            if (i == 4) {
                return 3;
            }
            throw new UnsupportedOperationException("Unknown: " + eVar);
        }

        @Override // p161ij.AbstractC8636f
        /* renamed from: c */
        public String mo10708c(EnumC8635e eVar, Locale locale) {
            String str;
            AbstractC8636f fVar = this.f19098a;
            if (fVar == null) {
                str = m18449a(DateFormat.getTimeInstance(m18448b(eVar), locale));
            } else if (fVar instanceof AbstractC9888c) {
                str = ((AbstractC9888c) AbstractC9888c.class.cast(fVar)).mo10707d(eVar, locale, true);
            } else {
                str = fVar.mo10708c(eVar, locale);
            }
            return C9889d.m15076a(str);
        }

        @Override // p161ij.AbstractC8636f
        /* renamed from: f */
        public String mo10705f(EnumC8635e eVar, EnumC8635e eVar2, Locale locale) {
            AbstractC8636f fVar = this.f19098a;
            if (fVar == null) {
                return m18449a(DateFormat.getDateTimeInstance(m18448b(eVar), m18448b(eVar2), locale));
            }
            return this.f19098a.mo10705f(eVar, eVar2, locale).replace("{1}", this.f19098a.mo10702i(eVar, locale)).replace("{0}", fVar.mo10708c(eVar2, locale));
        }

        @Override // p161ij.AbstractC8636f
        /* renamed from: i */
        public String mo10702i(EnumC8635e eVar, Locale locale) {
            AbstractC8636f fVar = this.f19098a;
            if (fVar == null) {
                return m18449a(DateFormat.getDateInstance(m18448b(eVar), locale));
            }
            return fVar.mo10702i(eVar, locale);
        }
    }

    /* renamed from: ij.b$d */
    /* loaded from: classes8.dex */
    private static class C8632d implements AbstractC8670u {
        private C8632d() {
        }

        /* synthetic */ C8632d(C8630a aVar) {
            this();
        }

        /* renamed from: c */
        private static String[] m18447c(String[] strArr, int i) {
            String[] strArr2 = new String[i];
            for (int i2 = 0; i2 < i; i2++) {
                if (!strArr[i2].isEmpty()) {
                    strArr2[i2] = m18446d(strArr[i2]);
                } else {
                    strArr2[i2] = String.valueOf(i2 + 1);
                }
            }
            return strArr2;
        }

        /* renamed from: d */
        private static String m18446d(String str) {
            char charAt = Normalizer.normalize(str, Normalizer.Form.NFD).charAt(0);
            if (charAt >= 'A' && charAt <= 'Z') {
                return String.valueOf(charAt);
            }
            if (charAt >= 'a' && charAt <= 'z') {
                return String.valueOf((char) (charAt - ' '));
            }
            if (charAt >= 1040 && charAt <= 1071) {
                return String.valueOf(charAt);
            }
            if (charAt < 1072 || charAt > 1103) {
                return str;
            }
            return String.valueOf((char) (charAt - ' '));
        }

        @Override // p161ij.AbstractC8670u
        /* renamed from: a */
        public String[] mo10710a(String str, Locale locale, EnumC8671v vVar) {
            DateFormatSymbols instance = DateFormatSymbols.getInstance(locale);
            if (vVar != EnumC8671v.NARROW) {
                return instance.getEras();
            }
            String[] eras = instance.getEras();
            String[] strArr = new String[eras.length];
            int length = eras.length;
            for (int i = 0; i < length; i++) {
                if (!eras[i].isEmpty()) {
                    strArr[i] = m18446d(eras[i]);
                } else if (i == 0 && eras.length == 2) {
                    strArr[i] = "B";
                } else if (i == 1 && eras.length == 2) {
                    strArr[i] = "A";
                } else {
                    strArr[i] = String.valueOf(i);
                }
            }
            return strArr;
        }

        @Override // p161ij.AbstractC8670u
        /* renamed from: b */
        public boolean mo10709b(Locale locale) {
            String language = locale.getLanguage();
            for (Locale locale2 : DateFormatSymbols.getAvailableLocales()) {
                if (locale2.getLanguage().equals(language)) {
                    return true;
                }
            }
            return false;
        }

        @Override // p161ij.AbstractC8670u
        /* renamed from: e */
        public String[] mo10706e(String str, Locale locale, EnumC8671v vVar, EnumC8658m mVar, boolean z) {
            DateFormatSymbols instance = DateFormatSymbols.getInstance(locale);
            int i = C8630a.f19096a[vVar.ordinal()];
            if (i == 1) {
                return instance.getMonths();
            }
            if (i == 2 || i == 3) {
                return instance.getShortMonths();
            }
            if (i == 4) {
                return m18447c(instance.getShortMonths(), 12);
            }
            throw new UnsupportedOperationException(vVar.name());
        }

        @Override // p161ij.AbstractC8670u
        /* renamed from: g */
        public String[] mo10704g(String str, Locale locale, EnumC8671v vVar, EnumC8658m mVar) {
            if (vVar == EnumC8671v.NARROW) {
                return new String[]{"A", "P"};
            }
            return DateFormatSymbols.getInstance(locale).getAmPmStrings();
        }

        @Override // p161ij.AbstractC8670u
        /* renamed from: h */
        public String[] mo10703h(String str, Locale locale, EnumC8671v vVar, EnumC8658m mVar) {
            return new String[]{"Q1", "Q2", "Q3", "Q4"};
        }

        @Override // p161ij.AbstractC8670u
        /* renamed from: j */
        public boolean mo10701j(String str) {
            return "iso8601".equals(str);
        }

        @Override // p161ij.AbstractC8670u
        /* renamed from: k */
        public String[] mo10700k(String str, Locale locale, EnumC8671v vVar, EnumC8658m mVar) {
            String[] strArr;
            DateFormatSymbols instance = DateFormatSymbols.getInstance(locale);
            int i = C8630a.f19096a[vVar.ordinal()];
            if (i == 1) {
                strArr = instance.getWeekdays();
            } else if (i == 2 || i == 3) {
                strArr = instance.getShortWeekdays();
            } else if (i == 4) {
                strArr = m18447c(mo10700k("", locale, EnumC8671v.SHORT, mVar), 7);
            } else {
                throw new UnsupportedOperationException("Unknown text width: " + vVar);
            }
            if (strArr.length <= 7) {
                return strArr;
            }
            String str2 = strArr[1];
            String[] strArr2 = new String[7];
            System.arraycopy(strArr, 2, strArr2, 0, 6);
            strArr2[6] = str2;
            return strArr2;
        }

        public String toString() {
            return "JDKTextProvider";
        }
    }

    static {
        AbstractC8636f fVar;
        HashSet hashSet = new HashSet();
        hashSet.add("ar");
        hashSet.add("dv");
        hashSet.add("fa");
        hashSet.add("ha");
        hashSet.add("he");
        hashSet.add("iw");
        hashSet.add("ji");
        hashSet.add("ps");
        hashSet.add("sd");
        hashSet.add("ug");
        hashSet.add("ur");
        hashSet.add("yi");
        f19080l = Collections.unmodifiableSet(hashSet);
        Iterator it = AbstractC10814d.m12187c().mo12183g(AbstractC8636f.class).iterator();
        if (it.hasNext()) {
            fVar = (AbstractC8636f) it.next();
        } else {
            fVar = new C11153c();
        }
        f19081m = new C8631c(fVar);
        f19082n = new C8632d(null);
        f19083o = new C0274b(null);
        f19084p = new ConcurrentHashMap();
    }

    private C8629b(String str, Locale locale, AbstractC8670u uVar) {
        EnumC8671v[] values;
        MissingResourceException e;
        this.f19085a = uVar.toString();
        int i = 0;
        Map<EnumC8671v, Map<EnumC8658m, C8668s>> unmodifiableMap = Collections.unmodifiableMap(m18462j(str, locale, uVar, false));
        this.f19086b = unmodifiableMap;
        Map<EnumC8671v, Map<EnumC8658m, C8668s>> j = m18462j(str, locale, uVar, true);
        if (j == null) {
            this.f19087c = unmodifiableMap;
        } else {
            this.f19087c = Collections.unmodifiableMap(j);
        }
        EnumMap enumMap = new EnumMap(EnumC8671v.class);
        EnumC8671v[] values2 = EnumC8671v.values();
        int length = values2.length;
        int i2 = 0;
        while (i2 < length) {
            EnumC8671v vVar = values2[i2];
            EnumMap enumMap2 = new EnumMap(EnumC8658m.class);
            EnumC8658m[] values3 = EnumC8658m.values();
            int length2 = values3.length;
            int i3 = i;
            while (i3 < length2) {
                EnumC8658m mVar = values3[i3];
                enumMap2.put((EnumMap) mVar, (EnumC8658m) new C8668s(uVar.mo10703h(str, locale, vVar, mVar)));
                i3++;
                values2 = values2;
            }
            enumMap.put((EnumMap) vVar, (EnumC8671v) enumMap2);
            i2++;
            i = 0;
        }
        this.f19088d = Collections.unmodifiableMap(enumMap);
        EnumMap enumMap3 = new EnumMap(EnumC8671v.class);
        EnumC8671v[] values4 = EnumC8671v.values();
        int length3 = values4.length;
        for (int i4 = 0; i4 < length3; i4++) {
            EnumC8671v vVar2 = values4[i4];
            EnumMap enumMap4 = new EnumMap(EnumC8658m.class);
            EnumC8658m[] values5 = EnumC8658m.values();
            int length4 = values5.length;
            int i5 = 0;
            while (i5 < length4) {
                EnumC8658m mVar2 = values5[i5];
                enumMap4.put((EnumMap) mVar2, (EnumC8658m) new C8668s(uVar.mo10700k(str, locale, vVar2, mVar2)));
                i5++;
                values4 = values4;
                length3 = length3;
            }
            enumMap3.put((EnumMap) vVar2, (EnumC8671v) enumMap4);
        }
        this.f19089e = Collections.unmodifiableMap(enumMap3);
        EnumMap enumMap5 = new EnumMap(EnumC8671v.class);
        for (EnumC8671v vVar3 : EnumC8671v.values()) {
            enumMap5.put((EnumMap) vVar3, (EnumC8671v) new C8668s(uVar.mo10710a(str, locale, vVar3)));
        }
        this.f19091g = Collections.unmodifiableMap(enumMap5);
        EnumMap enumMap6 = new EnumMap(EnumC8671v.class);
        EnumC8671v[] values6 = EnumC8671v.values();
        int length5 = values6.length;
        for (int i6 = 0; i6 < length5; i6++) {
            EnumC8671v vVar4 = values6[i6];
            EnumMap enumMap7 = new EnumMap(EnumC8658m.class);
            EnumC8658m[] values7 = EnumC8658m.values();
            int length6 = values7.length;
            int i7 = 0;
            while (i7 < length6) {
                EnumC8658m mVar3 = values7[i7];
                enumMap7.put((EnumMap) mVar3, (EnumC8658m) new C8668s(uVar.mo10704g(str, locale, vVar4, mVar3)));
                i7++;
                values6 = values6;
            }
            enumMap6.put((EnumMap) vVar4, (EnumC8671v) enumMap7);
        }
        this.f19090f = Collections.unmodifiableMap(enumMap6);
        HashMap hashMap = new HashMap();
        try {
            C11155e h = C11155e.m10681h("calendar/names/" + str + "/" + str, locale);
            for (String str2 : h.m10682g()) {
                hashMap.put(str2, h.m10683f(str2));
            }
            e = null;
        } catch (MissingResourceException e2) {
            e = e2;
        }
        this.f19092h = Collections.unmodifiableMap(hashMap);
        this.f19093i = str;
        this.f19094j = locale;
        this.f19095k = e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m18471a(C8087x<?> xVar) {
        AbstractC8633c cVar = (AbstractC8633c) xVar.m20648q().getAnnotation(AbstractC8633c.class);
        if (cVar == null) {
            return "iso8601";
        }
        return cVar.value();
    }

    /* renamed from: c */
    public static C8629b m18469c(String str, Locale locale) {
        AbstractC8670u uVar;
        if (str != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(':');
            sb2.append(locale.getLanguage());
            String country = locale.getCountry();
            if (!country.isEmpty()) {
                sb2.append('-');
                sb2.append(country);
            }
            String sb3 = sb2.toString();
            C8629b bVar = f19084p.get(sb3);
            if (bVar != null) {
                return bVar;
            }
            if (!locale.getLanguage().isEmpty() || !str.equals("iso8601")) {
                Iterator it = AbstractC10814d.m12187c().mo12183g(AbstractC8670u.class).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        uVar = null;
                        break;
                    }
                    AbstractC8670u uVar2 = (AbstractC8670u) it.next();
                    if (uVar2.mo10701j(str) && uVar2.mo10709b(locale)) {
                        uVar = uVar2;
                        break;
                    }
                }
                if (uVar == null) {
                    AbstractC8670u uVar3 = f19082n;
                    if (uVar3.mo10701j(str) && uVar3.mo10709b(locale)) {
                        uVar = uVar3;
                    }
                    if (uVar == null) {
                        uVar = f19083o;
                    }
                }
            } else {
                uVar = f19083o;
            }
            C8629b bVar2 = new C8629b(str, locale, uVar);
            C8629b putIfAbsent = f19084p.putIfAbsent(sb3, bVar2);
            if (putIfAbsent != null) {
                return putIfAbsent;
            }
            return bVar2;
        }
        throw new NullPointerException("Missing calendar type.");
    }

    /* renamed from: d */
    public static C8629b m18468d(Locale locale) {
        return m18469c("iso8601", locale);
    }

    /* renamed from: e */
    private String m18467e(String str) {
        if (!this.f19092h.containsKey("useShortKeys") || !"true".equals(this.f19092h.get("useShortKeys"))) {
            return str;
        }
        if (str.equals("MONTH_OF_YEAR") || str.equals("DAY_OF_WEEK") || str.equals("QUARTER_OF_YEAR") || str.equals("ERA")) {
            return str.substring(0, 1);
        }
        if (str.equals("EVANGELIST")) {
            return "EV";
        }
        if (str.equals("SANSCULOTTIDES")) {
            return "S";
        }
        if (str.equals("DAY_OF_DECADE")) {
            return "D";
        }
        return str;
    }

    /* renamed from: f */
    private static String m18466f(String str, int i, String... strArr) {
        if (strArr == null || strArr.length <= 0) {
            if (i > 0) {
                return null;
            }
            return str;
        } else if (strArr.length < i) {
            return null;
        } else {
            StringBuilder sb2 = new StringBuilder(str);
            boolean z = true;
            for (int i2 = 0; i2 < strArr.length - i; i2++) {
                if (z) {
                    sb2.append('(');
                    z = false;
                } else {
                    sb2.append('|');
                }
                sb2.append(strArr[i2]);
            }
            if (!z) {
                sb2.append(')');
            }
            return sb2.toString();
        }
    }

    /* renamed from: i */
    private C8668s m18463i(EnumC8671v vVar, EnumC8658m mVar, boolean z) {
        if (z) {
            return this.f19087c.get(vVar).get(mVar);
        }
        return this.f19086b.get(vVar).get(mVar);
    }

    /* renamed from: j */
    private static Map<EnumC8671v, Map<EnumC8658m, C8668s>> m18462j(String str, Locale locale, AbstractC8670u uVar, boolean z) {
        EnumC8671v vVar;
        EnumMap enumMap;
        EnumC8658m[] mVarArr;
        int i;
        EnumMap enumMap2 = new EnumMap(EnumC8671v.class);
        EnumC8671v[] values = EnumC8671v.values();
        int length = values.length;
        boolean z2 = false;
        int i2 = 0;
        while (i2 < length) {
            EnumC8671v vVar2 = values[i2];
            EnumMap enumMap3 = new EnumMap(EnumC8658m.class);
            EnumC8658m[] values2 = EnumC8658m.values();
            int length2 = values2.length;
            boolean z3 = z2;
            int i3 = 0;
            while (i3 < length2) {
                EnumC8658m mVar = values2[i3];
                String[] e = uVar.mo10706e(str, locale, vVar2, mVar, z);
                if (!z || z3) {
                    i = length2;
                    mVarArr = values2;
                    enumMap = enumMap3;
                    vVar = vVar2;
                } else {
                    i = length2;
                    mVarArr = values2;
                    enumMap = enumMap3;
                    vVar = vVar2;
                    z3 = !Arrays.equals(uVar.mo10706e(str, locale, vVar2, mVar, false), e);
                }
                enumMap.put((EnumMap) mVar, (EnumC8658m) new C8668s(e));
                i3++;
                length2 = i;
                values2 = mVarArr;
                enumMap3 = enumMap;
                vVar2 = vVar;
            }
            enumMap2.put((EnumMap) vVar2, (EnumC8671v) enumMap3);
            i2++;
            z2 = z3;
        }
        if (!z || z2) {
            return enumMap2;
        }
        return null;
    }

    /* renamed from: q */
    public static boolean m18455q(Locale locale) {
        return f19080l.contains(locale.getLanguage());
    }

    /* renamed from: r */
    public static String m18454r(EnumC8635e eVar, Locale locale) {
        return f19081m.mo10702i(eVar, locale);
    }

    /* renamed from: s */
    public static String m18453s(EnumC8635e eVar, EnumC8635e eVar2, Locale locale) {
        return f19081m.mo10705f(eVar, eVar2, locale);
    }

    /* renamed from: t */
    public static String m18452t(EnumC8635e eVar, Locale locale) {
        return f19081m.mo10708c(eVar, locale);
    }

    /* renamed from: u */
    public static String m18451u(EnumC8635e eVar, EnumC8635e eVar2, Locale locale) {
        return C9889d.m15076a(f19081m.mo10705f(eVar, eVar2, locale));
    }

    /* renamed from: v */
    private static String m18450v(String str, int i, int i2) {
        return str + '_' + (i + i2);
    }

    /* renamed from: b */
    public C8668s m18470b(EnumC8671v vVar) {
        return this.f19091g.get(vVar);
    }

    /* renamed from: g */
    public C8668s m18465g(EnumC8671v vVar, EnumC8658m mVar) {
        return m18463i(vVar, mVar, true);
    }

    /* renamed from: h */
    public C8668s m18464h(EnumC8671v vVar, EnumC8658m mVar) {
        return this.f19090f.get(vVar).get(mVar);
    }

    /* renamed from: k */
    public C8668s m18461k(EnumC8671v vVar, EnumC8658m mVar) {
        return this.f19088d.get(vVar).get(mVar);
    }

    /* renamed from: l */
    public C8668s m18460l(EnumC8671v vVar, EnumC8658m mVar) {
        return m18463i(vVar, mVar, false);
    }

    /* renamed from: m */
    public <V extends Enum<V>> C8668s m18459m(AbstractC8079p<V> pVar, String... strArr) {
        return m18458n(pVar.name(), pVar.getType(), strArr);
    }

    /* renamed from: n */
    public <V extends Enum<V>> C8668s m18458n(String str, Class<V> cls, String... strArr) {
        String str2;
        if (this.f19095k == null) {
            V[] enumConstants = cls.getEnumConstants();
            int length = enumConstants.length;
            String[] strArr2 = new String[length];
            String e = m18467e(str);
            int i = !AbstractC8064i.class.isAssignableFrom(cls) ? 1 : 0;
            for (int i2 = 0; i2 < length; i2++) {
                int i3 = 0;
                while (true) {
                    String f = m18466f(e, i3, strArr);
                    if (f == null) {
                        str2 = null;
                        break;
                    }
                    str2 = m18450v(f, i2, i);
                    if (this.f19092h.containsKey(str2)) {
                        break;
                    }
                    i3++;
                }
                if (str2 != null) {
                    strArr2[i2] = this.f19092h.get(str2);
                } else if (this.f19092h.containsKey(str)) {
                    strArr2[i2] = this.f19092h.get(str);
                } else {
                    strArr2[i2] = enumConstants[i2].name();
                }
            }
            return new C8668s(strArr2);
        }
        throw new MissingResourceException(this.f19095k.getMessage(), this.f19095k.getClassName(), this.f19095k.getKey());
    }

    /* renamed from: o */
    public Map<String, String> m18457o() {
        return this.f19092h;
    }

    /* renamed from: p */
    public C8668s m18456p(EnumC8671v vVar, EnumC8658m mVar) {
        return this.f19089e.get(vVar).get(mVar);
    }

    public String toString() {
        return this.f19085a + "(" + this.f19093i + "/" + this.f19094j + ")";
    }
}
