package p161ij;

import com.facebook.react.views.text.TypefaceStyle;
import com.reactnativecommunity.webview.RNCWebViewManager;
import net.time4j.base.C10813c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: ij.j */
/* loaded from: classes8.dex */
public class EnumC8641j extends Enum<EnumC8641j> {

    /* renamed from: C */
    private static final /* synthetic */ EnumC8641j[] f38673C;

    /* renamed from: k */
    public static final EnumC8641j f19112k;

    /* renamed from: l */
    public static final EnumC8641j f19113l;

    /* renamed from: m */
    public static final EnumC8641j f19114m;

    /* renamed from: n */
    public static final EnumC8641j f19115n;

    /* renamed from: o */
    public static final EnumC8641j f19116o;

    /* renamed from: p */
    public static final EnumC8641j f19117p;

    /* renamed from: q */
    public static final EnumC8641j f19118q;

    /* renamed from: r */
    public static final EnumC8641j f19119r;

    /* renamed from: s */
    public static final EnumC8641j f19120s;

    /* renamed from: t */
    public static final EnumC8641j f19121t;

    /* renamed from: u */
    public static final EnumC8641j f19122u;

    /* renamed from: v */
    public static final EnumC8641j f19123v;

    /* renamed from: w */
    public static final EnumC8641j f19124w;

    /* renamed from: x */
    public static final EnumC8641j f19125x;

    /* renamed from: y */
    public static final EnumC8641j f19126y;
    private final String code;

    /* renamed from: z */
    private static final int[] f19127z = {RNCWebViewManager.COMMAND_CLEAR_FORM_DATA, 900, 500, TypefaceStyle.NORMAL, 100, 90, 50, 40, 10, 9, 5, 4, 1};

    /* renamed from: A */
    private static final String[] f38671A = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    /* renamed from: B */
    private static final int[] f38672B = {1, 12, 144, 1728, 20736};

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* renamed from: ij.j$g */
    /* loaded from: classes8.dex */
    static class C8648g extends EnumC8641j {
        C8648g(String str, int i, String str2) {
            super(str, i, str2, null);
        }

        @Override // p161ij.EnumC8641j
        /* renamed from: h */
        public boolean mo18428h(char c) {
            return c >= '0' && c <= '9';
        }

        @Override // p161ij.EnumC8641j
        /* renamed from: j */
        public String mo18427j() {
            return "0123456789";
        }

        @Override // p161ij.EnumC8641j
        /* renamed from: l */
        public boolean mo18426l() {
            return true;
        }

        @Override // p161ij.EnumC8641j
        /* renamed from: n */
        public int mo18425n(String str, EnumC8637g gVar) {
            int parseInt = Integer.parseInt(str);
            if (parseInt >= 0) {
                return parseInt;
            }
            throw new NumberFormatException("Cannot convert negative number: " + str);
        }

        @Override // p161ij.EnumC8641j
        /* renamed from: p */
        public String mo18424p(int i) {
            if (i >= 0) {
                return Integer.toString(i);
            }
            throw new IllegalArgumentException("Cannot convert: " + i);
        }
    }

    static {
        C8648g gVar = new C8648g("ARABIC", 0, "latn");
        f19112k = gVar;
        EnumC8641j hVar = new EnumC8641j("ARABIC_INDIC", 1, "arab") { // from class: ij.j.h
            @Override // p161ij.EnumC8641j
            /* renamed from: j */
            public String mo18427j() {
                return "٠١٢٣٤٥٦٧٨٩";
            }

            @Override // p161ij.EnumC8641j
            /* renamed from: l */
            public boolean mo18426l() {
                return true;
            }
        };
        f19113l = hVar;
        EnumC8641j iVar = new EnumC8641j("ARABIC_INDIC_EXT", 2, "arabext") { // from class: ij.j.i
            @Override // p161ij.EnumC8641j
            /* renamed from: j */
            public String mo18427j() {
                return "۰۱۲۳۴۵۶۷۸۹";
            }

            @Override // p161ij.EnumC8641j
            /* renamed from: l */
            public boolean mo18426l() {
                return true;
            }
        };
        f19114m = iVar;
        EnumC8641j jVar = new EnumC8641j("BENGALI", 3, "beng") { // from class: ij.j.j
            @Override // p161ij.EnumC8641j
            /* renamed from: j */
            public String mo18427j() {
                return "০১২৩৪৫৬৭৮৯";
            }

            @Override // p161ij.EnumC8641j
            /* renamed from: l */
            public boolean mo18426l() {
                return true;
            }
        };
        f19115n = jVar;
        EnumC8641j kVar = new EnumC8641j("DEVANAGARI", 4, "deva") { // from class: ij.j.k
            @Override // p161ij.EnumC8641j
            /* renamed from: j */
            public String mo18427j() {
                return "०१२३४५६७८९";
            }

            @Override // p161ij.EnumC8641j
            /* renamed from: l */
            public boolean mo18426l() {
                return true;
            }
        };
        f19116o = kVar;
        EnumC8641j lVar = new EnumC8641j("DOZENAL", 5, "dozenal") { // from class: ij.j.l
            @Override // p161ij.EnumC8641j
            /* renamed from: h */
            public boolean mo18428h(char c) {
                return (c >= '0' && c <= '9') || c == 8586 || c == 8587;
            }

            @Override // p161ij.EnumC8641j
            /* renamed from: j */
            public String mo18427j() {
                return "0123456789↊↋";
            }

            @Override // p161ij.EnumC8641j
            /* renamed from: l */
            public boolean mo18426l() {
                return false;
            }

            @Override // p161ij.EnumC8641j
            /* renamed from: n */
            public int mo18425n(String str, EnumC8637g gVar2) {
                int parseInt = Integer.parseInt(str.replace((char) 8586, 'a').replace((char) 8587, 'b'), 12);
                if (parseInt >= 0) {
                    return parseInt;
                }
                throw new NumberFormatException("Cannot convert negative number: " + str);
            }

            @Override // p161ij.EnumC8641j
            /* renamed from: o */
            public int mo18429o(int i, Appendable appendable) {
                char c;
                if (i >= 0) {
                    int i2 = 1;
                    while (true) {
                        if (i2 > 4) {
                            i2 = 0;
                            break;
                        } else if (i < EnumC8641j.f38672B[i2]) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (i2 > 0) {
                        int i3 = i2 - 1;
                        do {
                            int i4 = i / EnumC8641j.f38672B[i3];
                            if (i4 == 11) {
                                c = 8587;
                            } else if (i4 == 10) {
                                c = 8586;
                            } else {
                                c = (char) (i4 + 48);
                            }
                            appendable.append(c);
                            i -= i4 * EnumC8641j.f38672B[i3];
                            i3--;
                        } while (i3 >= 0);
                        return i2;
                    }
                }
                return EnumC8641j.super.mo18429o(i, appendable);
            }

            @Override // p161ij.EnumC8641j
            /* renamed from: p */
            public String mo18424p(int i) {
                if (i >= 0) {
                    return Integer.toString(i, 12).replace('a', (char) 8586).replace('b', (char) 8587);
                }
                throw new IllegalArgumentException("Cannot convert: " + i);
            }
        };
        f19117p = lVar;
        EnumC8641j mVar = new EnumC8641j("ETHIOPIC", 6, "ethiopic") { // from class: ij.j.m
            @Override // p161ij.EnumC8641j
            /* renamed from: h */
            public boolean mo18428h(char c) {
                return c >= 4969 && c <= 4988;
            }

            @Override // p161ij.EnumC8641j
            /* renamed from: j */
            public String mo18427j() {
                return "፩፪፫፬፭፮፯፰፱፲፳፴፵፶፷፸፹፺፻፼";
            }

            @Override // p161ij.EnumC8641j
            /* renamed from: l */
            public boolean mo18426l() {
                return false;
            }

            @Override // p161ij.EnumC8641j
            /* renamed from: n */
            public int mo18425n(String str, EnumC8637g gVar2) {
                int i;
                int i2 = 1;
                int i3 = 1;
                boolean z = false;
                boolean z2 = false;
                int i4 = 0;
                int i5 = 0;
                for (int length = str.length() - 1; length >= 0; length--) {
                    char charAt = str.charAt(length);
                    if (charAt >= 4969 && charAt < 4978) {
                        i = (charAt + 1) - 4969;
                    } else if (charAt < 4978 || charAt >= 4987) {
                        if (charAt == 4988) {
                            if (z && i5 == 0) {
                                i5 = 1;
                            }
                            i4 = EnumC8641j.m18433g(i4, i5, i3);
                            if (z) {
                                i3 *= 100;
                            } else {
                                i3 *= 10000;
                            }
                            z2 = true;
                            z = false;
                            i5 = 0;
                        } else if (charAt == 4987) {
                            i4 = EnumC8641j.m18433g(i4, i5, i3);
                            i3 *= 100;
                            z = true;
                            z2 = false;
                            i5 = 0;
                        }
                    } else {
                        i = ((charAt + 1) - 4978) * 10;
                    }
                    i5 += i;
                }
                if ((!z && !z2) || i5 != 0) {
                    i2 = i5;
                }
                return EnumC8641j.m18433g(i4, i2, i3);
            }

            /* JADX WARN: Removed duplicated region for block: B:33:0x0070  */
            /* JADX WARN: Removed duplicated region for block: B:35:0x0075  */
            /* JADX WARN: Removed duplicated region for block: B:37:0x007a  */
            /* JADX WARN: Removed duplicated region for block: B:45:0x007d A[SYNTHETIC] */
            @Override // p161ij.EnumC8641j
            /* renamed from: p */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public java.lang.String mo18424p(int r11) {
                /*
                    r10 = this;
                    r0 = 1
                    if (r11 < r0) goto L_0x0085
                    java.lang.String r11 = java.lang.String.valueOf(r11)
                    int r1 = r11.length()
                    int r1 = r1 - r0
                    int r2 = r1 % 2
                    if (r2 != 0) goto L_0x0023
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    java.lang.String r3 = "0"
                    r2.append(r3)
                    r2.append(r11)
                    java.lang.String r11 = r2.toString()
                    int r1 = r1 + 1
                L_0x0023:
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    r3 = r1
                L_0x0029:
                    if (r3 < 0) goto L_0x0080
                    int r4 = r1 - r3
                    char r4 = r11.charAt(r4)
                    int r3 = r3 + (-1)
                    int r5 = r1 - r3
                    char r5 = r11.charAt(r5)
                    r6 = 48
                    r7 = 0
                    if (r5 == r6) goto L_0x0042
                    int r5 = r5 + 4920
                    char r5 = (char) r5
                    goto L_0x0043
                L_0x0042:
                    r5 = r7
                L_0x0043:
                    if (r4 == r6) goto L_0x0049
                    int r4 = r4 + 4929
                    char r4 = (char) r4
                    goto L_0x004a
                L_0x0049:
                    r4 = r7
                L_0x004a:
                    int r6 = r3 % 4
                    int r6 = r6 / 2
                    r8 = 4987(0x137b, float:6.988E-42)
                    if (r3 == 0) goto L_0x005d
                    if (r6 == 0) goto L_0x005a
                    if (r5 != 0) goto L_0x0058
                    if (r4 == 0) goto L_0x005d
                L_0x0058:
                    r6 = r8
                    goto L_0x005e
                L_0x005a:
                    r6 = 4988(0x137c, float:6.99E-42)
                    goto L_0x005e
                L_0x005d:
                    r6 = r7
                L_0x005e:
                    r9 = 4969(0x1369, float:6.963E-42)
                    if (r5 != r9) goto L_0x006d
                    if (r4 != 0) goto L_0x006d
                    if (r1 <= r0) goto L_0x006d
                    if (r6 == r8) goto L_0x006e
                    int r8 = r3 + 1
                    if (r8 != r1) goto L_0x006d
                    goto L_0x006e
                L_0x006d:
                    r7 = r5
                L_0x006e:
                    if (r4 == 0) goto L_0x0073
                    r2.append(r4)
                L_0x0073:
                    if (r7 == 0) goto L_0x0078
                    r2.append(r7)
                L_0x0078:
                    if (r6 == 0) goto L_0x007d
                    r2.append(r6)
                L_0x007d:
                    int r3 = r3 + (-1)
                    goto L_0x0029
                L_0x0080:
                    java.lang.String r11 = r2.toString()
                    return r11
                L_0x0085:
                    java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "Can only convert positive numbers: "
                    r1.append(r2)
                    r1.append(r11)
                    java.lang.String r11 = r1.toString()
                    r0.<init>(r11)
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: p161ij.EnumC8641j.C8653m.mo18424p(int):java.lang.String");
            }
        };
        f19118q = mVar;
        EnumC8641j nVar = new EnumC8641j("GUJARATI", 7, "gujr") { // from class: ij.j.n
            @Override // p161ij.EnumC8641j
            /* renamed from: j */
            public String mo18427j() {
                return "૦૧૨૩૪૫૬૭૮૯";
            }

            @Override // p161ij.EnumC8641j
            /* renamed from: l */
            public boolean mo18426l() {
                return true;
            }
        };
        f19119r = nVar;
        EnumC8641j oVar = new EnumC8641j("JAPANESE", 8, "jpan") { // from class: ij.j.o
            @Override // p161ij.EnumC8641j
            /* renamed from: j */
            public String mo18427j() {
                return "一二三四五六七八九十百千";
            }

            @Override // p161ij.EnumC8641j
            /* renamed from: l */
            public boolean mo18426l() {
                return false;
            }

            @Override // p161ij.EnumC8641j
            /* renamed from: n */
            public int mo18425n(String str, EnumC8637g gVar2) {
                boolean z;
                String j = mo18427j();
                int i = 0;
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                for (int length = str.length() - 1; length >= 0; length--) {
                    char charAt = str.charAt(length);
                    if (charAt != 21313) {
                        if (charAt != 21315) {
                            if (charAt != 30334) {
                                int i5 = 0;
                                while (true) {
                                    if (i5 >= 9) {
                                        z = false;
                                        break;
                                    } else if (j.charAt(i5) == charAt) {
                                        int i6 = i5 + 1;
                                        if (i4 == 1) {
                                            i2 += i6 * RNCWebViewManager.COMMAND_CLEAR_FORM_DATA;
                                            i4 = -1;
                                        } else if (i3 == 1) {
                                            i2 += i6 * 100;
                                            i3 = -1;
                                        } else if (i == 1) {
                                            i2 += i6 * 10;
                                            i = -1;
                                        } else {
                                            i2 += i6;
                                        }
                                        z = true;
                                    } else {
                                        i5++;
                                    }
                                }
                                if (!z) {
                                    throw new IllegalArgumentException("Invalid Japanese numeral: " + str);
                                }
                            } else if (i3 == 0 && i4 == 0) {
                                i3++;
                            } else {
                                throw new IllegalArgumentException("Invalid Japanese numeral: " + str);
                            }
                        } else if (i4 == 0) {
                            i4++;
                        } else {
                            throw new IllegalArgumentException("Invalid Japanese numeral: " + str);
                        }
                    } else if (i == 0 && i3 == 0 && i4 == 0) {
                        i++;
                    } else {
                        throw new IllegalArgumentException("Invalid Japanese numeral: " + str);
                    }
                }
                if (i == 1) {
                    i2 += 10;
                }
                if (i3 == 1) {
                    i2 += 100;
                }
                if (i4 == 1) {
                    return i2 + RNCWebViewManager.COMMAND_CLEAR_FORM_DATA;
                }
                return i2;
            }

            @Override // p161ij.EnumC8641j
            /* renamed from: p */
            public String mo18424p(int i) {
                if (i < 1 || i > 9999) {
                    throw new IllegalArgumentException("Cannot convert: " + i);
                }
                String j = mo18427j();
                int i2 = i / RNCWebViewManager.COMMAND_CLEAR_FORM_DATA;
                int i3 = i % RNCWebViewManager.COMMAND_CLEAR_FORM_DATA;
                int i4 = i3 / 100;
                int i5 = i3 % 100;
                int i6 = i5 / 10;
                int i7 = i5 % 10;
                StringBuilder sb2 = new StringBuilder();
                if (i2 >= 1) {
                    if (i2 > 1) {
                        sb2.append(j.charAt(i2 - 1));
                    }
                    sb2.append((char) 21315);
                }
                if (i4 >= 1) {
                    if (i4 > 1) {
                        sb2.append(j.charAt(i4 - 1));
                    }
                    sb2.append((char) 30334);
                }
                if (i6 >= 1) {
                    if (i6 > 1) {
                        sb2.append(j.charAt(i6 - 1));
                    }
                    sb2.append((char) 21313);
                }
                if (i7 > 0) {
                    sb2.append(j.charAt(i7 - 1));
                }
                return sb2.toString();
            }
        };
        f19120s = oVar;
        EnumC8641j aVar = new EnumC8641j("KHMER", 9, "khmr") { // from class: ij.j.a
            @Override // p161ij.EnumC8641j
            /* renamed from: j */
            public String mo18427j() {
                return "០១២៣៤៥៦៧៨៩";
            }

            @Override // p161ij.EnumC8641j
            /* renamed from: l */
            public boolean mo18426l() {
                return true;
            }
        };
        f19121t = aVar;
        EnumC8641j bVar = new EnumC8641j("MYANMAR", 10, "mymr") { // from class: ij.j.b
            @Override // p161ij.EnumC8641j
            /* renamed from: j */
            public String mo18427j() {
                return "၀၁၂၃၄၅၆၇၈၉";
            }

            @Override // p161ij.EnumC8641j
            /* renamed from: l */
            public boolean mo18426l() {
                return true;
            }
        };
        f19122u = bVar;
        EnumC8641j cVar = new EnumC8641j("ORYA", 11, "orya") { // from class: ij.j.c
            @Override // p161ij.EnumC8641j
            /* renamed from: j */
            public String mo18427j() {
                return "୦୧୨୩୪୫୬୭୮୯";
            }

            @Override // p161ij.EnumC8641j
            /* renamed from: l */
            public boolean mo18426l() {
                return true;
            }
        };
        f19123v = cVar;
        EnumC8641j dVar = new EnumC8641j("ROMAN", 12, "roman") { // from class: ij.j.d
            @Override // p161ij.EnumC8641j
            /* renamed from: h */
            public boolean mo18428h(char c) {
                char upperCase = Character.toUpperCase(c);
                return upperCase == 'I' || upperCase == 'V' || upperCase == 'X' || upperCase == 'L' || upperCase == 'C' || upperCase == 'D' || upperCase == 'M';
            }

            @Override // p161ij.EnumC8641j
            /* renamed from: j */
            public String mo18427j() {
                return "IVXLCDM";
            }

            @Override // p161ij.EnumC8641j
            /* renamed from: l */
            public boolean mo18426l() {
                return false;
            }

            /* JADX WARN: Code restructure failed: missing block: B:67:0x0016, code lost:
                continue;
             */
            @Override // p161ij.EnumC8641j
            /* renamed from: n */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public int mo18425n(java.lang.String r11, p161ij.EnumC8637g r12) {
                /*
                    Method dump skipped, instructions count: 222
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: p161ij.EnumC8641j.C8645d.mo18425n(java.lang.String, ij.g):int");
            }

            @Override // p161ij.EnumC8641j
            /* renamed from: p */
            public String mo18424p(int i) {
                if (i < 1 || i > 3999) {
                    throw new IllegalArgumentException("Out of range (1-3999): " + i);
                }
                StringBuilder sb2 = new StringBuilder();
                for (int i2 = 0; i2 < EnumC8641j.f19127z.length; i2++) {
                    while (i >= EnumC8641j.f19127z[i2]) {
                        sb2.append(EnumC8641j.f38671A[i2]);
                        i -= EnumC8641j.f19127z[i2];
                    }
                }
                return sb2.toString();
            }
        };
        f19124w = dVar;
        EnumC8641j eVar = new EnumC8641j("TELUGU", 13, "telu") { // from class: ij.j.e
            @Override // p161ij.EnumC8641j
            /* renamed from: j */
            public String mo18427j() {
                return "౦౧౨౩౪౫౬౭౮౯";
            }

            @Override // p161ij.EnumC8641j
            /* renamed from: l */
            public boolean mo18426l() {
                return true;
            }
        };
        f19125x = eVar;
        EnumC8641j fVar = new EnumC8641j("THAI", 14, "thai") { // from class: ij.j.f
            @Override // p161ij.EnumC8641j
            /* renamed from: j */
            public String mo18427j() {
                return "๐๑๒๓๔๕๖๗๘๙";
            }

            @Override // p161ij.EnumC8641j
            /* renamed from: l */
            public boolean mo18426l() {
                return true;
            }
        };
        f19126y = fVar;
        f38673C = new EnumC8641j[]{gVar, hVar, iVar, jVar, kVar, lVar, mVar, nVar, oVar, aVar, bVar, cVar, dVar, eVar, fVar};
    }

    /* synthetic */ EnumC8641j(String str, int i, String str2, C8648g gVar) {
        this(str, i, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static int m18433g(int i, int i2, int i3) {
        return C10813c.m12198e(i, C10813c.m12195h(i2, i3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static int m18431k(char c) {
        if (c == 'C') {
            return 100;
        }
        if (c == 'D') {
            return 500;
        }
        if (c == 'I') {
            return 1;
        }
        if (c == 'V') {
            return 5;
        }
        if (c == 'X') {
            return 10;
        }
        if (c == 'L') {
            return 50;
        }
        if (c == 'M') {
            return RNCWebViewManager.COMMAND_CLEAR_FORM_DATA;
        }
        throw new NumberFormatException("Invalid Roman digit: " + c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static boolean m18430m(char c, char c2) {
        if (c == 'C') {
            return c2 == 'M' || c2 == 'D';
        }
        if (c == 'I') {
            return c2 == 'X' || c2 == 'V';
        }
        if (c != 'X') {
            return false;
        }
        return c2 == 'C' || c2 == 'L';
    }

    public static EnumC8641j valueOf(String str) {
        return (EnumC8641j) Enum.valueOf(EnumC8641j.class, str);
    }

    public static EnumC8641j[] values() {
        return (EnumC8641j[]) f38673C.clone();
    }

    /* renamed from: h */
    public boolean mo18428h(char c) {
        String j = mo18427j();
        int length = j.length();
        for (int i = 0; i < length; i++) {
            if (j.charAt(i) == c) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public String m18432i() {
        return this.code;
    }

    /* renamed from: j */
    public String mo18427j() {
        throw new AbstractMethodError();
    }

    /* renamed from: l */
    public boolean mo18426l() {
        throw new AbstractMethodError();
    }

    /* renamed from: n */
    public int mo18425n(String str, EnumC8637g gVar) {
        if (mo18426l()) {
            int charAt = mo18427j().charAt(0) - '0';
            StringBuilder sb2 = new StringBuilder();
            int length = str.length();
            for (int i = 0; i < length; i++) {
                sb2.append((char) (str.charAt(i) - charAt));
            }
            int parseInt = Integer.parseInt(sb2.toString());
            if (parseInt >= 0) {
                return parseInt;
            }
            throw new NumberFormatException("Cannot convert negative number: " + str);
        }
        throw new NumberFormatException("Cannot convert: " + str);
    }

    /* renamed from: o */
    public int mo18429o(int i, Appendable appendable) {
        String p = mo18424p(i);
        appendable.append(p);
        return p.length();
    }

    /* renamed from: p */
    public String mo18424p(int i) {
        if (!mo18426l() || i < 0) {
            throw new IllegalArgumentException("Cannot convert: " + i);
        }
        int charAt = mo18427j().charAt(0) - '0';
        String num = Integer.toString(i);
        StringBuilder sb2 = new StringBuilder();
        int length = num.length();
        for (int i2 = 0; i2 < length; i2++) {
            sb2.append((char) (num.charAt(i2) + charAt));
        }
        return sb2.toString();
    }

    private EnumC8641j(String str, int i, String str2) {
        this.code = str2;
    }
}
