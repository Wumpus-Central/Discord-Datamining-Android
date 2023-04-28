package com.facebook.react.modules.network;

/* loaded from: classes7.dex */
public class HeaderUtil {
    public static String stripHeaderName(String str) {
        StringBuilder sb2 = new StringBuilder(str.length());
        int length = str.length();
        boolean z = false;
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt <= ' ' || charAt >= 127) {
                z = true;
            } else {
                sb2.append(charAt);
            }
        }
        if (z) {
            return sb2.toString();
        }
        return str;
    }

    public static String stripHeaderValue(String str) {
        StringBuilder sb2 = new StringBuilder(str.length());
        int length = str.length();
        boolean z = false;
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if ((charAt <= 31 || charAt >= 127) && charAt != '\t') {
                z = true;
            } else {
                sb2.append(charAt);
            }
        }
        if (z) {
            return sb2.toString();
        }
        return str;
    }
}
