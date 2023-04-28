package com.henninghall.date_picker;

import android.content.Context;
import android.content.res.Configuration;
import com.henninghall.date_picker.C5886e;
import hk.C8092a;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: com.henninghall.date_picker.g */
/* loaded from: classes6.dex */
public class C5892g {
    /* renamed from: a */
    public static String m26970a(String str) {
        return m26966e(str, C5886e.EnumC5889c.d);
    }

    /* renamed from: b */
    public static String m26969b(Locale locale) {
        return ((SimpleDateFormat) DateFormat.getDateInstance(0, locale)).toLocalizedPattern().replaceAll(",", "").replaceAll("([a-zA-Z]+)", " $1").trim();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static String m26968c(Locale locale) {
        return ((SimpleDateFormat) DateFormat.getDateTimeInstance(0, 0, locale)).toLocalizedPattern().replace(",", "");
    }

    /* renamed from: d */
    public static String m26967d(String str) {
        return m26966e(str, C5886e.EnumC5889c.MMMEd);
    }

    /* renamed from: e */
    private static String m26966e(String str, C5886e.EnumC5889c cVar) {
        try {
            try {
                return C5886e.m26975b(str, cVar);
            } catch (C5886e.C5890d unused) {
                return C5886e.f11700a.get(cVar);
            }
        } catch (C5886e.C5890d unused2) {
            return C5886e.m26975b(str.substring(0, str.indexOf("_")), cVar);
        }
    }

    /* renamed from: f */
    public static Locale m26965f(String str) {
        try {
            return C8092a.m20634e(str);
        } catch (Exception unused) {
            return C8092a.m20634e(str.substring(0, str.indexOf("_")));
        }
    }

    /* renamed from: g */
    public static String m26964g(Locale locale, int i, Context context) {
        try {
            Configuration configuration = new Configuration(context.getResources().getConfiguration());
            configuration.setLocale(locale);
            return context.createConfigurationContext(configuration).getText(i).toString();
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: h */
    public static String m26963h(String str) {
        return m26966e(str, C5886e.EnumC5889c.y);
    }

    /* renamed from: i */
    public static boolean m26962i(Locale locale) {
        DateFormat timeInstance = DateFormat.getTimeInstance(0, locale);
        if (!(timeInstance instanceof SimpleDateFormat) || !((SimpleDateFormat) timeInstance).toPattern().contains("a")) {
            return false;
        }
        return true;
    }
}
