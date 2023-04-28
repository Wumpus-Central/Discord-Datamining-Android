package com.facebook.react.views.text;

import java.text.BreakIterator;

/* loaded from: classes7.dex */
public enum TextTransform {
    NONE,
    UPPERCASE,
    LOWERCASE,
    CAPITALIZE,
    UNSET;

    /* renamed from: com.facebook.react.views.text.TextTransform$1 */
    /* loaded from: classes7.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$react$views$text$TextTransform;

        static {
            int[] iArr = new int[TextTransform.values().length];
            $SwitchMap$com$facebook$react$views$text$TextTransform = iArr;
            try {
                iArr[TextTransform.UPPERCASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$facebook$react$views$text$TextTransform[TextTransform.LOWERCASE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$facebook$react$views$text$TextTransform[TextTransform.CAPITALIZE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static String apply(String str, TextTransform textTransform) {
        if (str == null) {
            return null;
        }
        int i = AnonymousClass1.$SwitchMap$com$facebook$react$views$text$TextTransform[textTransform.ordinal()];
        if (i == 1) {
            return str.toUpperCase();
        }
        if (i == 2) {
            return str.toLowerCase();
        }
        if (i != 3) {
            return str;
        }
        return capitalize(str);
    }

    private static String capitalize(String str) {
        BreakIterator wordInstance = BreakIterator.getWordInstance();
        wordInstance.setText(str);
        StringBuilder sb2 = new StringBuilder(str.length());
        int first = wordInstance.first();
        while (true) {
            first = wordInstance.next();
            if (first == -1) {
                return sb2.toString();
            }
            String substring = str.substring(first, first);
            if (Character.isLetterOrDigit(substring.charAt(0))) {
                sb2.append(Character.toUpperCase(substring.charAt(0)));
                sb2.append(substring.substring(1).toLowerCase());
            } else {
                sb2.append(substring);
            }
        }
    }
}
