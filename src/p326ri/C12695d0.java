package p326ri;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000\f\n\u0002\u0010\f\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¨\u0006\u0003"}, m15073d2 = {"", "", "a", "kotlin-stdlib"}, m15072k = 2, m15071mv = {1, 8, 0})
/* renamed from: ri.d0 */
/* loaded from: classes8.dex */
public final class C12695d0 {
    /* renamed from: a */
    public static final String m5850a(char c) {
        String valueOf = String.valueOf(c);
        C9971q.m14635e(valueOf, "null cannot be cast to non-null type java.lang.String");
        Locale locale = Locale.ROOT;
        String upperCase = valueOf.toUpperCase(locale);
        C9971q.m14634f(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        if (upperCase.length() <= 1) {
            return String.valueOf(Character.toTitleCase(c));
        }
        if (c == 329) {
            return upperCase;
        }
        char charAt = upperCase.charAt(0);
        C9971q.m14635e(upperCase, "null cannot be cast to non-null type java.lang.String");
        String substring = upperCase.substring(1);
        C9971q.m14634f(substring, "this as java.lang.String).substring(startIndex)");
        C9971q.m14635e(substring, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = substring.toLowerCase(locale);
        C9971q.m14634f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return charAt + lowerCase;
    }
}
