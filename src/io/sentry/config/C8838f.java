package io.sentry.config;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: io.sentry.config.f */
/* loaded from: classes8.dex */
public final /* synthetic */ class C8838f {
    /* renamed from: a */
    public static Boolean m17931a(AbstractC8839g gVar, String str) {
        String property = gVar.getProperty(str);
        if (property != null) {
            return Boolean.valueOf(property);
        }
        return null;
    }

    /* renamed from: b */
    public static Double m17930b(AbstractC8839g gVar, String str) {
        String property = gVar.getProperty(str);
        if (property != null) {
            try {
                return Double.valueOf(property);
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* renamed from: c */
    public static List m17929c(AbstractC8839g gVar, String str) {
        String property = gVar.getProperty(str);
        if (property != null) {
            return Arrays.asList(property.split(","));
        }
        return Collections.emptyList();
    }

    /* renamed from: d */
    public static Long m17928d(AbstractC8839g gVar, String str) {
        String property = gVar.getProperty(str);
        if (property != null) {
            try {
                return Long.valueOf(property);
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* renamed from: e */
    public static String m17927e(AbstractC8839g gVar, String str, String str2) {
        String property = gVar.getProperty(str);
        return property != null ? property : str2;
    }
}
