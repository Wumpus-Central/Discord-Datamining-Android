package p201kj;

import p161ij.EnumC8641j;

/* renamed from: kj.b */
/* loaded from: classes8.dex */
public class C9887b {
    /* renamed from: a */
    public static String m15077a(EnumC8641j jVar, char c, int i) {
        if (!jVar.mo18426l()) {
            return jVar.mo18424p(i);
        }
        int i2 = c - '0';
        String num = Integer.toString(i);
        if (i2 == 0) {
            return num;
        }
        StringBuilder sb2 = new StringBuilder();
        int length = num.length();
        for (int i3 = 0; i3 < length; i3++) {
            sb2.append((char) (num.charAt(i3) + i2));
        }
        return sb2.toString();
    }
}
