package p137hd;

import java.util.HashMap;
import java.util.Map;
import p066dd.C6437f;

/* renamed from: hd.d */
/* loaded from: classes3.dex */
public enum EnumC7999d {
    Cp437(new int[]{0, 2}, new String[0]),
    ISO8859_1(new int[]{1, 3}, "ISO-8859-1"),
    ISO8859_2(4, "ISO-8859-2"),
    ISO8859_3(5, "ISO-8859-3"),
    ISO8859_4(6, "ISO-8859-4"),
    ISO8859_5(7, "ISO-8859-5"),
    ISO8859_6(8, "ISO-8859-6"),
    ISO8859_7(9, "ISO-8859-7"),
    ISO8859_8(10, "ISO-8859-8"),
    ISO8859_9(11, "ISO-8859-9"),
    ISO8859_10(12, "ISO-8859-10"),
    ISO8859_11(13, "ISO-8859-11"),
    ISO8859_13(15, "ISO-8859-13"),
    ISO8859_14(16, "ISO-8859-14"),
    ISO8859_15(17, "ISO-8859-15"),
    ISO8859_16(18, "ISO-8859-16"),
    SJIS(20, "Shift_JIS"),
    Cp1250(21, "windows-1250"),
    Cp1251(22, "windows-1251"),
    Cp1252(23, "windows-1252"),
    Cp1256(24, "windows-1256"),
    UnicodeBigUnmarked(25, "UTF-16BE", "UnicodeBig"),
    UTF8(26, "UTF-8"),
    ASCII(new int[]{27, 170}, "US-ASCII"),
    Big5(28),
    GB18030(29, "GB2312", "EUC_CN", "GBK"),
    EUC_KR(30, "EUC-KR");
    

    /* renamed from: N */
    private static final Map<Integer, EnumC7999d> f38489N = new HashMap();

    /* renamed from: O */
    private static final Map<String, EnumC7999d> f38490O = new HashMap();

    /* renamed from: k */
    private final int[] f17249k;

    /* renamed from: l */
    private final String[] f17250l;

    static {
        EnumC7999d[] values;
        for (EnumC7999d dVar : values()) {
            for (int i : dVar.f17249k) {
                f38489N.put(Integer.valueOf(i), dVar);
            }
            f38490O.put(dVar.name(), dVar);
            for (String str : dVar.f17250l) {
                f38490O.put(str, dVar);
            }
        }
    }

    EnumC7999d(int i) {
        this(new int[]{i}, new String[0]);
    }

    /* renamed from: a */
    public static EnumC7999d m20907a(int i) {
        if (i >= 0 && i < 900) {
            return f38489N.get(Integer.valueOf(i));
        }
        throw C6437f.m25561a();
    }

    EnumC7999d(int i, String... strArr) {
        this.f17249k = new int[]{i};
        this.f17250l = strArr;
    }

    EnumC7999d(int[] iArr, String... strArr) {
        this.f17249k = iArr;
        this.f17250l = strArr;
    }
}
