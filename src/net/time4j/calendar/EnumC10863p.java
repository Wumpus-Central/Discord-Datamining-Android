package net.time4j.calendar;

import java.text.ParsePosition;
import java.util.Locale;
import net.time4j.C10779a0;
import p121gj.C7700c;
import p121gj.EnumC7703e;
import p143hj.AbstractC8085v;

/* renamed from: net.time4j.calendar.p */
/* loaded from: classes8.dex */
public enum EnumC10863p {
    MINOR_01_LICHUN_315,
    MAJOR_01_YUSHUI_330,
    MINOR_02_JINGZHE_345,
    MAJOR_02_CHUNFEN_000,
    MINOR_03_QINGMING_015,
    MAJOR_03_GUYU_030,
    MINOR_04_LIXIA_045,
    MAJOR_04_XIAOMAN_060,
    MINOR_05_MANGZHONG_075,
    MAJOR_05_XIAZHI_090,
    MINOR_06_XIAOSHU_105,
    MAJOR_06_DASHU_120,
    MINOR_07_LIQIU_135,
    MAJOR_07_CHUSHU_150,
    MINOR_08_BAILU_165,
    MAJOR_08_QIUFEN_180,
    MINOR_09_HANLU_195,
    MAJOR_09_SHUANGJIANG_210,
    MINOR_10_LIDONG_225,
    MAJOR_10_XIAOXUE_240,
    MINOR_11_DAXUE_255,
    MAJOR_11_DONGZHI_270,
    MINOR_12_XIAOHAN_285,
    MAJOR_12_DAHAN_300;
    

    /* renamed from: I */
    private static final EnumC10863p[] f38887I = values();

    /* renamed from: J */
    private static final String[] f38888J = {"lichun", "yushui", "jingzhe", "chunfen", "qingming", "guyu", "lixia", "xiaoman", "mangzhong", "xiazhi", "xiaoshu", "dashu", "liqiu", "chushu", "bailu", "qiufen", "hanlu", "shuangjiang", "lidong", "xiaoxue", "daxue", "dongzhi", "xiaohan", "dahan"};

    /* renamed from: K */
    private static final String[] f38889K = {"lìchūn", "yǔshuǐ", "jīngzhé", "chūnfēn", "qīngmíng", "gǔyǔ", "lìxià", "xiǎomǎn", "mángzhòng", "xiàzhì", "xiǎoshǔ", "dàshǔ", "lìqiū", "chǔshǔ", "báilù", "qiūfēn", "hánlù", "shuāngjiàng", "lìdōng", "xiǎoxuě", "dàxuě", "dōngzhì", "xiǎohán", "dàhán"};

    /* renamed from: L */
    private static final String[] f38890L = {"立春", "雨水", "惊蛰", "春分", "清明", "谷雨", "立夏", "小满", "芒种", "夏至", "小暑", "大暑", "立秋", "处暑", "白露", "秋分", "寒露", "霜降", "立冬", "小雪", "大雪", "冬至", "小寒", "大寒"};

    /* renamed from: M */
    private static final String[] f38891M = {"立春", "雨水", "驚蟄", "春分", "清明", "穀雨", "立夏", "小滿", "芒種", "夏至", "小暑", "大暑", "立秋", "處暑", "白露", "秋分", "寒露", "霜降", "立冬", "小雪", "大雪", "冬至", "小寒", "大寒"};

    /* renamed from: N */
    private static final String[] f38892N = {"입춘", "우수", "경칩", "춘분", "청명", "곡우", "입하", "소만", "망종", "하지", "소서", "대서", "입추", "처서", "백로", "추분", "한로", "상강", "입동", "소설", "대설", "동지", "소한", "대한"};

    /* renamed from: O */
    private static final String[] f38893O = {"Lập xuân", "Vũ thủy", "Kinh trập", "Xuân phân", "Thanh minh", "Cốc vũ", "Lập hạ", "Tiểu mãn", "Mang chủng", "Hạ chí", "Tiểu thử", "Đại thử", "Lập thu", "Xử thử", "Bạch lộ", "Thu phân", "Hàn lộ", "Sương giáng", "Lập đông", "Tiểu tuyết", "Đại tuyết", "Đông chí", "Tiểu hàn", "Đại hàn"};

    /* renamed from: P */
    private static final String[] f38894P = {"立春", "雨水", "啓蟄", "春分", "清明", "穀雨", "立夏", "小満", "芒種", "夏至", "小暑", "大暑", "立秋", "処暑", "白露", "秋分", "寒露", "霜降", "立冬", "小雪", "大雪", "冬至", "小寒", "大寒"};

    /* renamed from: net.time4j.calendar.p$a */
    /* loaded from: classes8.dex */
    class C10864a implements AbstractC8085v<D> {
        C10864a() {
        }

        /* JADX WARN: Incorrect return type in method signature: (TD;)TD; */
        /* renamed from: a */
        public AbstractC10840f apply(AbstractC10840f fVar) {
            return EnumC10863p.this.m11956i(fVar.mo12083Y().mo11790b(EnumC10863p.m11958g(fVar)));
        }
    }

    /* renamed from: b */
    private C10779a0 m11963b(C10779a0 a0Var) {
        double d = m11961d();
        double c = C7700c.m21625g(a0Var).m21629c();
        double f = ((m11959f(d - m11953l(c)) * 365.242189d) / 360.0d) + c;
        double max = Math.max(c, f - 5.0d);
        double d2 = f + 5.0d;
        while (true) {
            double d3 = (max + d2) / 2.0d;
            if (d2 - max < 1.0E-5d) {
                return C7700c.m21626f(d3).m21624h();
            }
            if (m11959f(m11953l(d3) - d) < 180.0d) {
                d2 = d3;
            } else {
                max = d3;
            }
        }
    }

    /* renamed from: e */
    private static String[] m11960e(Locale locale) {
        if (locale.getLanguage().equals("zh")) {
            if (locale.getCountry().equals("TW")) {
                return f38891M;
            }
            return f38890L;
        } else if (locale.getLanguage().equals("ko")) {
            return f38892N;
        } else {
            if (locale.getLanguage().equals("vi")) {
                return f38893O;
            }
            if (locale.getLanguage().equals("ja")) {
                return f38894P;
            }
            if (locale.getLanguage().isEmpty()) {
                return f38888J;
            }
            return f38889K;
        }
    }

    /* renamed from: f */
    private static double m11959f(double d) {
        return d - (Math.floor(d / 360.0d) * 360.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static <D extends AbstractC10840f<?, ?>> long m11958g(D d) {
        return d.mo12083Y().m12094q(d.m12082Z(), d.m12071j0().getNumber());
    }

    /* renamed from: h */
    public static EnumC10863p m11957h(C10779a0 a0Var) {
        return f38887I[(((int) Math.floor(m11953l(C7700c.m21625g(a0Var).m21629c()) / 15.0d)) + 3) % 24];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static EnumC10863p m11955j(CharSequence charSequence, Locale locale, ParsePosition parsePosition) {
        String[] e = m11960e(locale);
        boolean isEmpty = locale.getLanguage().isEmpty();
        int index = parsePosition.getIndex();
        for (int i = 0; i < e.length; i++) {
            String str = e[i];
            String charSequence2 = charSequence.subSequence(index, Math.min(charSequence.length(), str.length() + index)).toString();
            if ((isEmpty && charSequence2.equalsIgnoreCase(str)) || charSequence2.equals(str)) {
                parsePosition.setIndex(parsePosition.getIndex() + str.length());
                return f38887I[i];
            }
        }
        if (!locale.getLanguage().isEmpty() && e == f38889K) {
            return m11955j(charSequence, Locale.ROOT, parsePosition);
        }
        parsePosition.setErrorIndex(parsePosition.getIndex());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public static double m11953l(double d) {
        return EnumC7703e.f16729n.mo21595f(d, "solar-longitude");
    }

    /* renamed from: c */
    public String m11962c(Locale locale) {
        return m11960e(locale)[ordinal()];
    }

    /* renamed from: d */
    public int m11961d() {
        return ((ordinal() + 21) % 24) * 15;
    }

    /* renamed from: i */
    public <D extends AbstractC10840f<?, D>> D m11956i(D d) {
        AbstractC10838d Y = d.mo12083Y();
        long c = d.mo12079c();
        return (D) Y.mo11790b(m11963b(Y.m12097n(c)).m12300w0(Y.mo12102i(c)).m11645i0().mo12079c());
    }

    /* renamed from: k */
    public <D extends AbstractC10840f<?, D>> AbstractC8085v<D> m11954k() {
        return new C10864a();
    }
}
