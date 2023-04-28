package p326ri;

import eg.C6884j;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000\u0018\n\u0002\u0010\r\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0005\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0000\u001a\u0012\u0010\t\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007\u001a\u0012\u0010\n\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007\u001a\u0012\u0010\u000b\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007¨\u0006\f"}, m15073d2 = {"", "", "X0", "Y0", "(Ljava/lang/CharSequence;)Ljava/lang/Character;", "Z0", "", "", "n", "W0", "a1", "b1", "kotlin-stdlib"}, m15072k = 5, m15071mv = {1, 8, 0}, m15068xs = "kotlin/text/StringsKt")
/* renamed from: ri.x */
/* loaded from: classes8.dex */
public class C12724x extends C12723w {
    /* renamed from: W0 */
    public static String m5656W0(String str, int i) {
        boolean z;
        int g;
        C9971q.m14633g(str, "<this>");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            g = C6884j.m23957g(i, str.length());
            String substring = str.substring(g);
            C9971q.m14634f(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    /* renamed from: X0 */
    public static char m5655X0(CharSequence charSequence) {
        boolean z;
        int T;
        C9971q.m14633g(charSequence, "<this>");
        if (charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            T = C12719v.m5695T(charSequence);
            return charSequence.charAt(T);
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    /* renamed from: Y0 */
    public static Character m5654Y0(CharSequence charSequence) {
        boolean z;
        C9971q.m14633g(charSequence, "<this>");
        if (charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(charSequence.length() - 1));
    }

    /* renamed from: Z0 */
    public static char m5653Z0(CharSequence charSequence) {
        C9971q.m14633g(charSequence, "<this>");
        int length = charSequence.length();
        if (length == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        } else if (length == 1) {
            return charSequence.charAt(0);
        } else {
            throw new IllegalArgumentException("Char sequence has more than one element.");
        }
    }

    /* renamed from: a1 */
    public static String m5652a1(String str, int i) {
        boolean z;
        int g;
        C9971q.m14633g(str, "<this>");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            g = C6884j.m23957g(i, str.length());
            String substring = str.substring(0, g);
            C9971q.m14634f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    /* renamed from: b1 */
    public static String m5651b1(String str, int i) {
        boolean z;
        int g;
        C9971q.m14633g(str, "<this>");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int length = str.length();
            g = C6884j.m23957g(i, length);
            String substring = str.substring(length - g);
            C9971q.m14634f(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }
}
