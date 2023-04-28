package p229m8;

import java.util.Locale;

/* renamed from: m8.m */
/* loaded from: classes7.dex */
public final class C10559m {

    /* renamed from: a */
    private final String[] f23386a;

    /* renamed from: b */
    private final int[] f23387b;

    /* renamed from: c */
    private final String[] f23388c;

    /* renamed from: d */
    private final int f23389d;

    private C10559m(String[] strArr, int[] iArr, String[] strArr2, int i) {
        this.f23386a = strArr;
        this.f23387b = iArr;
        this.f23388c = strArr2;
        this.f23389d = i;
    }

    /* renamed from: b */
    public static C10559m m12815b(String str) {
        String[] strArr = new String[5];
        int[] iArr = new int[4];
        String[] strArr2 = new String[4];
        return new C10559m(strArr, iArr, strArr2, m12814c(str, strArr, iArr, strArr2));
    }

    /* renamed from: c */
    private static int m12814c(String str, String[] strArr, int[] iArr, String[] strArr2) {
        String str2;
        strArr[0] = "";
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            int indexOf = str.indexOf("$", i);
            char c = 65535;
            if (indexOf == -1) {
                strArr[i2] = strArr[i2] + str.substring(i);
                i = str.length();
            } else if (indexOf != i) {
                strArr[i2] = strArr[i2] + str.substring(i, indexOf);
                i = indexOf;
            } else if (str.startsWith("$$", i)) {
                strArr[i2] = strArr[i2] + "$";
                i += 2;
            } else {
                int i3 = i + 1;
                int indexOf2 = str.indexOf("$", i3);
                String substring = str.substring(i3, indexOf2);
                if (substring.equals("RepresentationID")) {
                    iArr[i2] = 1;
                } else {
                    int indexOf3 = substring.indexOf("%0");
                    if (indexOf3 != -1) {
                        str2 = substring.substring(indexOf3);
                        if (!str2.endsWith("d") && !str2.endsWith("x")) {
                            str2 = str2 + "d";
                        }
                        substring = substring.substring(0, indexOf3);
                    } else {
                        str2 = "%01d";
                    }
                    substring.hashCode();
                    switch (substring.hashCode()) {
                        case -1950496919:
                            if (substring.equals("Number")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 2606829:
                            if (substring.equals("Time")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 38199441:
                            if (substring.equals("Bandwidth")) {
                                c = 2;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            iArr[i2] = 2;
                            break;
                        case 1:
                            iArr[i2] = 4;
                            break;
                        case 2:
                            iArr[i2] = 3;
                            break;
                        default:
                            throw new IllegalArgumentException("Invalid template: " + str);
                    }
                    strArr2[i2] = str2;
                }
                i2++;
                strArr[i2] = "";
                i = indexOf2 + 1;
            }
        }
        return i2;
    }

    /* renamed from: a */
    public String m12816a(String str, long j, int i, long j2) {
        StringBuilder sb2 = new StringBuilder();
        int i2 = 0;
        while (true) {
            int i3 = this.f23389d;
            if (i2 < i3) {
                sb2.append(this.f23386a[i2]);
                int i4 = this.f23387b[i2];
                if (i4 == 1) {
                    sb2.append(str);
                } else if (i4 == 2) {
                    sb2.append(String.format(Locale.US, this.f23388c[i2], Long.valueOf(j)));
                } else if (i4 == 3) {
                    sb2.append(String.format(Locale.US, this.f23388c[i2], Integer.valueOf(i)));
                } else if (i4 == 4) {
                    sb2.append(String.format(Locale.US, this.f23388c[i2], Long.valueOf(j2)));
                }
                i2++;
            } else {
                sb2.append(this.f23386a[i3]);
                return sb2.toString();
            }
        }
    }
}
