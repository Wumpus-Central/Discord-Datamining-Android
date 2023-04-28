package net.time4j.calendar.service;

import java.util.Locale;
import p143hj.AbstractC8090y;
import p161ij.C8629b;
import p161ij.EnumC8635e;
import p250nj.C11155e;

/* renamed from: net.time4j.calendar.service.a */
/* loaded from: classes8.dex */
public final class C10871a {
    /* renamed from: a */
    public static String m11926a(String str, AbstractC8090y yVar, Locale locale) {
        EnumC8635e b = EnumC8635e.m18444b(yVar.mo18445a());
        if (str.equals("iso8601")) {
            return C8629b.m18454r(b, locale);
        }
        String str2 = "F(" + Character.toLowerCase(b.name().charAt(0)) + ')';
        C11155e f = C10872b.m11923f(str, locale);
        if (!f.m10687b(str2)) {
            f = C10872b.m11923f("generic", locale);
        }
        return f.m10683f(str2);
    }
}
