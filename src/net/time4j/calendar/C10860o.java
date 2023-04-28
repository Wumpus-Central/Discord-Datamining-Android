package net.time4j.calendar;

import java.io.Serializable;
import java.text.ParsePosition;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import net.time4j.base.C10813c;

/* renamed from: net.time4j.calendar.o */
/* loaded from: classes8.dex */
public class C10860o implements Comparable<C10860o>, Serializable {
    private static final long serialVersionUID = -4556668597489844917L;

    /* renamed from: w */
    private static final C10860o[] f24077w;

    /* renamed from: x */
    private static final Map<String, String[]> f24078x;

    /* renamed from: y */
    private static final Map<String, String[]> f24079y;

    /* renamed from: z */
    private static final Set<String> f24080z;
    private final int number;

    /* renamed from: k */
    private static final String[] f24065k = {"jia", "yi", "bing", "ding", "wu", "ji", "geng", "xin", "ren", "gui"};

    /* renamed from: l */
    private static final String[] f24066l = {"jiǎ", "yǐ", "bǐng", "dīng", "wù", "jǐ", "gēng", "xīn", "rén", "guǐ"};

    /* renamed from: m */
    private static final String[] f24067m = {"甲", "乙", "丙", "丁", "戊", "己", "庚", "辛", "壬", "癸"};

    /* renamed from: n */
    private static final String[] f24068n = {"갑", "을", "병", "정", "무", "기", "경", "신", "임", "계"};

    /* renamed from: o */
    private static final String[] f24069o = {"giáp", "ất", "bính", "đinh", "mậu", "kỷ", "canh", "tân", "nhâm", "quý"};

    /* renamed from: p */
    private static final String[] f24070p = {"Цзя", "И", "Бин", "Дин", "У", "Цзи", "Гэн", "Синь", "Жэнь", "Гуй"};

    /* renamed from: q */
    private static final String[] f24071q = {"zi", "chou", "yin", "mao", "chen", "si", "wu", "wei", "shen", "you", "xu", "hai"};

    /* renamed from: r */
    private static final String[] f24072r = {"zǐ", "chǒu", "yín", "mǎo", "chén", "sì", "wǔ", "wèi", "shēn", "yǒu", "xū", "hài"};

    /* renamed from: s */
    private static final String[] f24073s = {"子", "丑", "寅", "卯", "辰", "巳", "午", "未", "申", "酉", "戌", "亥"};

    /* renamed from: t */
    private static final String[] f24074t = {"자", "축", "인", "묘", "진", "사", "오", "미", "신", "유", "술", "해"};

    /* renamed from: u */
    private static final String[] f24075u = {"tí", "sửu", "dần", "mão", "thìn", "tị", "ngọ", "mùi", "thân", "dậu", "tuất", "hợi"};

    /* renamed from: v */
    private static final String[] f24076v = {"Цзы", "Чоу", "Инь", "Мао", "Чэнь", "Сы", "У", "Вэй", "Шэнь", "Ю", "Сюй", "Хай"};

    /* renamed from: net.time4j.calendar.o$a */
    /* loaded from: classes8.dex */
    public enum EnumC10861a {
        ZI_1_RAT,
        CHOU_2_OX,
        YIN_3_TIGER,
        MAO_4_HARE,
        CHEN_5_DRAGON,
        SI_6_SNAKE,
        WU_7_HORSE,
        WEI_8_SHEEP,
        SHEN_9_MONKEY,
        YOU_10_FOWL,
        XU_11_DOG,
        HAI_12_PIG;

        /* renamed from: a */
        public String m11966a(Locale locale) {
            String language = locale.getLanguage();
            Map map = C10860o.f24079y;
            if (language.isEmpty()) {
                language = "root";
            }
            String[] strArr = (String[]) map.get(language);
            if (strArr == null) {
                strArr = C10860o.f24072r;
            }
            return strArr[ordinal()];
        }
    }

    /* renamed from: net.time4j.calendar.o$b */
    /* loaded from: classes8.dex */
    public enum EnumC10862b {
        JIA_1_WOOD_YANG,
        YI_2_WOOD_YIN,
        BING_3_FIRE_YANG,
        DING_4_FIRE_YIN,
        WU_5_EARTH_YANG,
        JI_6_EARTH_YIN,
        GENG_7_METAL_YANG,
        XIN_8_METAL_YIN,
        REN_9_WATER_YANG,
        GUI_10_WATER_YIN;

        /* renamed from: a */
        public String m11965a(Locale locale) {
            String language = locale.getLanguage();
            Map map = C10860o.f24078x;
            if (language.isEmpty()) {
                language = "root";
            }
            String[] strArr = (String[]) map.get(language);
            if (strArr == null) {
                strArr = C10860o.f24066l;
            }
            return strArr[ordinal()];
        }
    }

    static {
        C10860o[] oVarArr = new C10860o[60];
        int i = 0;
        while (i < 60) {
            int i2 = i + 1;
            oVarArr[i] = new C10860o(i2);
            i = i2;
        }
        f24077w = oVarArr;
        HashMap hashMap = new HashMap();
        hashMap.put("root", f24065k);
        String[] strArr = f24067m;
        hashMap.put("zh", strArr);
        hashMap.put("ja", strArr);
        hashMap.put("ko", f24068n);
        hashMap.put("vi", f24069o);
        hashMap.put("ru", f24070p);
        f24078x = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("root", f24071q);
        String[] strArr2 = f24073s;
        hashMap2.put("zh", strArr2);
        hashMap2.put("ja", strArr2);
        hashMap2.put("ko", f24074t);
        hashMap2.put("vi", f24075u);
        hashMap2.put("ru", f24076v);
        f24079y = Collections.unmodifiableMap(hashMap2);
        HashSet hashSet = new HashSet();
        hashSet.add("zh");
        hashSet.add("ja");
        hashSet.add("ko");
        f24080z = Collections.unmodifiableSet(hashSet);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10860o(int i) {
        this.number = i;
    }

    /* renamed from: i */
    public static C10860o m11970i(int i) {
        if (i >= 1 && i <= 60) {
            return f24077w[i - 1];
        }
        throw new IllegalArgumentException("Out of range: " + i);
    }

    /* renamed from: j */
    public static C10860o m11969j(EnumC10862b bVar, EnumC10861a aVar) {
        int ordinal = bVar.ordinal();
        C10860o i = m11970i(ordinal + 1 + C10813c.m12200c((aVar.ordinal() - ordinal) * 25, 60));
        if (i.m11971h() == bVar && i.m11973f() == aVar) {
            return i;
        }
        throw new IllegalArgumentException("Invalid combination of stem and branch.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static C10860o m11968k(CharSequence charSequence, ParsePosition parsePosition, Locale locale, boolean z) {
        EnumC10861a aVar;
        EnumC10862b bVar;
        int i;
        EnumC10862b[] bVarArr;
        Locale locale2 = locale;
        int index = parsePosition.getIndex();
        int length = charSequence.length();
        boolean isEmpty = locale.getLanguage().isEmpty();
        int i2 = index + 1;
        if (i2 >= length || index < 0) {
            parsePosition.setErrorIndex(index);
            return null;
        }
        if (f24080z.contains(locale.getLanguage())) {
            EnumC10862b[] values = EnumC10862b.values();
            int length2 = values.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length2) {
                    bVar = null;
                    break;
                }
                bVar = values[i3];
                if (bVar.m11965a(locale2).charAt(0) == charSequence.charAt(index)) {
                    break;
                }
                i3++;
            }
            if (bVar != null) {
                EnumC10861a[] values2 = EnumC10861a.values();
                int length3 = values2.length;
                for (int i4 = 0; i4 < length3; i4++) {
                    aVar = values2[i4];
                    if (aVar.m11966a(locale2).charAt(0) == charSequence.charAt(i2)) {
                        index += 2;
                        break;
                    }
                }
            }
            aVar = null;
        } else {
            while (true) {
                if (i2 >= length) {
                    i2 = -1;
                    break;
                } else if (charSequence.charAt(i2) == '-') {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 == -1) {
                parsePosition.setErrorIndex(index);
                return null;
            }
            EnumC10862b[] values3 = EnumC10862b.values();
            int length4 = values3.length;
            bVar = null;
            int i5 = 0;
            while (i5 < length4) {
                EnumC10862b bVar2 = values3[i5];
                String a = bVar2.m11965a(locale2);
                int i6 = index;
                while (true) {
                    if (i6 >= i2) {
                        bVarArr = values3;
                        break;
                    }
                    int i7 = i6 - index;
                    char charAt = charSequence.charAt(i6);
                    if (isEmpty) {
                        charAt = m11967l(charAt);
                    }
                    bVarArr = values3;
                    if (i7 < a.length() && a.charAt(i7) == charAt) {
                        if (i7 + 1 == a.length()) {
                            bVar = bVar2;
                            break;
                        }
                        i6++;
                        values3 = bVarArr;
                    }
                }
                i5++;
                values3 = bVarArr;
            }
            if (bVar != null) {
                EnumC10861a[] values4 = EnumC10861a.values();
                int length5 = values4.length;
                int i8 = 0;
                aVar = null;
                while (i8 < length5) {
                    EnumC10861a aVar2 = values4[i8];
                    String a2 = aVar2.m11966a(locale2);
                    int i9 = i2 + 1;
                    while (true) {
                        if (i9 >= length) {
                            i = index;
                            break;
                        }
                        int i10 = (i9 - i2) - 1;
                        char charAt2 = charSequence.charAt(i9);
                        if (isEmpty) {
                            charAt2 = m11967l(charAt2);
                        }
                        i = index;
                        if (i10 >= a2.length() || a2.charAt(i10) != charAt2) {
                            break;
                        } else if (i10 + 1 == a2.length()) {
                            index = i9 + 1;
                            aVar = aVar2;
                            break;
                        } else {
                            i9++;
                            index = i;
                        }
                    }
                    index = i;
                    i8++;
                    locale2 = locale;
                }
            } else if (z && !isEmpty && i2 + 1 < length) {
                return m11968k(charSequence, parsePosition, Locale.ROOT, true);
            } else {
                parsePosition.setErrorIndex(index);
                return null;
            }
        }
        if (bVar != null && aVar != null) {
            parsePosition.setIndex(index);
            return m11969j(bVar, aVar);
        } else if (z && !isEmpty) {
            return m11968k(charSequence, parsePosition, Locale.ROOT, true);
        } else {
            parsePosition.setErrorIndex(index);
            return null;
        }
    }

    /* renamed from: l */
    private static char m11967l(char c) {
        if (c == 224) {
            return 'a';
        }
        if (c == 249) {
            return 'u';
        }
        if (c == 275) {
            return 'e';
        }
        if (c == 299) {
            return 'i';
        }
        if (c == 363) {
            return 'u';
        }
        if (c == 462) {
            return 'a';
        }
        if (c == 464) {
            return 'i';
        }
        if (c == 466) {
            return 'o';
        }
        if (c == 232 || c == 233) {
            return 'e';
        }
        if (c == 236 || c == 237) {
            return 'i';
        }
        return c;
    }

    /* renamed from: e */
    public int compareTo(C10860o oVar) {
        if (getClass().equals(oVar.getClass())) {
            return this.number - ((C10860o) C10860o.class.cast(oVar)).number;
        }
        throw new ClassCastException("Cannot compare different types.");
    }

    public boolean equals(Object obj) {
        if (!getClass().equals(obj.getClass()) || this.number != ((C10860o) obj).number) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public EnumC10861a m11973f() {
        int i = 12;
        int i2 = this.number % 12;
        if (i2 != 0) {
            i = i2;
        }
        return EnumC10861a.values()[i - 1];
    }

    /* renamed from: g */
    public String m11972g(Locale locale) {
        String str;
        EnumC10862b h = m11971h();
        EnumC10861a f = m11973f();
        if (f24080z.contains(locale.getLanguage())) {
            str = "";
        } else {
            str = "-";
        }
        return h.m11965a(locale) + str + f.m11966a(locale);
    }

    public int getNumber() {
        return this.number;
    }

    /* renamed from: h */
    public EnumC10862b m11971h() {
        int i = 10;
        int i2 = this.number % 10;
        if (i2 != 0) {
            i = i2;
        }
        return EnumC10862b.values()[i - 1];
    }

    public int hashCode() {
        return this.number;
    }

    Object readResolve() {
        return m11970i(this.number);
    }

    public String toString() {
        return m11972g(Locale.ROOT) + "(" + String.valueOf(this.number) + ")";
    }
}
