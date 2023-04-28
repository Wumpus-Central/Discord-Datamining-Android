package com.facebook.hermes.unicode;

import java.text.Collator;
import java.text.DateFormat;
import java.text.Normalizer;
import java.util.Locale;
import p078e6.AbstractC6709a;

@AbstractC6709a
/* loaded from: classes7.dex */
public class AndroidUnicodeUtils {
    @AbstractC6709a
    public static String convertToCase(String str, int i, boolean z) {
        Locale locale;
        if (z) {
            locale = Locale.getDefault();
        } else {
            locale = Locale.ENGLISH;
        }
        if (i == 0) {
            return str.toUpperCase(locale);
        }
        if (i == 1) {
            return str.toLowerCase(locale);
        }
        throw new RuntimeException("Invalid target case");
    }

    @AbstractC6709a
    public static String dateFormat(double d, boolean z, boolean z2) {
        DateFormat dateFormat;
        if (z && z2) {
            dateFormat = DateFormat.getDateTimeInstance(2, 2);
        } else if (z) {
            dateFormat = DateFormat.getDateInstance(2);
        } else if (z2) {
            dateFormat = DateFormat.getTimeInstance(2);
        } else {
            throw new RuntimeException("Bad dateFormat configuration");
        }
        return dateFormat.format(Long.valueOf((long) d)).toString();
    }

    @AbstractC6709a
    public static int localeCompare(String str, String str2) {
        return Collator.getInstance().compare(str, str2);
    }

    @AbstractC6709a
    public static String normalize(String str, int i) {
        if (i == 0) {
            return Normalizer.normalize(str, Normalizer.Form.NFC);
        }
        if (i == 1) {
            return Normalizer.normalize(str, Normalizer.Form.NFD);
        }
        if (i == 2) {
            return Normalizer.normalize(str, Normalizer.Form.NFKC);
        }
        if (i == 3) {
            return Normalizer.normalize(str, Normalizer.Form.NFKD);
        }
        throw new RuntimeException("Invalid form");
    }
}
