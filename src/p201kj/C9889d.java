package p201kj;

/* renamed from: kj.d */
/* loaded from: classes8.dex */
public class C9889d {
    /* renamed from: a */
    public static String m15076a(String str) {
        int i;
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        int i2 = 0;
        boolean z = false;
        while (i2 < length) {
            char charAt = str.charAt(i2);
            if (charAt == '\'') {
                int i3 = i2 + 1;
                if (i3 >= length || str.charAt(i3) != '\'') {
                    z = !z;
                } else {
                    sb2.append(charAt);
                    i2 = i3;
                }
                sb2.append(charAt);
            } else if (z) {
                sb2.append(charAt);
            } else if (!(charAt == 'z' || charAt == 'Z' || charAt == 'v' || charAt == 'V' || charAt == 'x' || charAt == 'X')) {
                sb2.append(charAt);
            }
            i2++;
        }
        int i4 = 0;
        while (i4 < sb2.length()) {
            char charAt2 = sb2.charAt(i4);
            if (charAt2 == ' ' && (i = i4 + 1) < sb2.length() && sb2.charAt(i) == ' ') {
                sb2.deleteCharAt(i4);
            } else if (charAt2 == '[' || charAt2 == ']' || charAt2 == '(' || charAt2 == ')') {
                sb2.deleteCharAt(i4);
            } else {
                i4++;
            }
            i4--;
            i4++;
        }
        String trim = sb2.toString().trim();
        if (trim.endsWith(" '")) {
            return trim.substring(0, trim.length() - 2) + "'";
        } else if (trim.endsWith(",")) {
            return trim.substring(0, trim.length() - 1);
        } else {
            return trim;
        }
    }
}
