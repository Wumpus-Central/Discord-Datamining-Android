package com.facebook.hermes.intl;

import android.icu.util.ULocale;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import p129h5.AbstractC7805b;
import p129h5.C7863m;
import p129h5.C7915x;

/* renamed from: com.facebook.hermes.intl.g */
/* loaded from: classes7.dex */
public class C4875g {

    /* renamed from: com.facebook.hermes.intl.g$a */
    /* loaded from: classes7.dex */
    public static class C4876a {

        /* renamed from: a */
        public AbstractC7805b<?> f8066a;

        /* renamed from: b */
        public HashMap<String, String> f8067b = new HashMap<>();
    }

    /* renamed from: a */
    public static String m31583a(String[] strArr, String str) {
        while (Arrays.asList(strArr).indexOf(str) <= -1) {
            int lastIndexOf = str.lastIndexOf("-");
            if (lastIndexOf < 0) {
                return "";
            }
            if (lastIndexOf >= 2 && str.charAt(lastIndexOf - 2) == '-') {
                lastIndexOf -= 2;
            }
            str = str.substring(0, lastIndexOf);
        }
        return str;
    }

    /* renamed from: b */
    public static ULocale m31582b(AbstractC7805b<?> bVar) {
        ULocale[] availableLocales;
        ULocale acceptLanguage;
        availableLocales = ULocale.getAvailableLocales();
        ULocale[] uLocaleArr = {(ULocale) bVar.mo21167c()};
        boolean[] zArr = new boolean[1];
        acceptLanguage = ULocale.acceptLanguage(uLocaleArr, availableLocales, zArr);
        if (zArr[0] || acceptLanguage == null) {
            return null;
        }
        return acceptLanguage;
    }

    /* renamed from: c */
    public static C4876a m31581c(String[] strArr) {
        C4876a aVar = new C4876a();
        for (String str : strArr) {
            AbstractC7805b b = C7863m.m21221b(str);
            ULocale b2 = m31582b(b);
            if (b2 != null) {
                aVar.f8066a = C7915x.m21159k(b2);
                aVar.f8067b = b.mo21169a();
                return aVar;
            }
        }
        aVar.f8066a = C7915x.m21161i();
        return aVar;
    }

    /* renamed from: d */
    public static String[] m31580d(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (m31582b(C7863m.m21221b(str)) != null) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: e */
    public static String[] m31579e() {
        ArrayList arrayList = new ArrayList();
        for (Locale locale : Locale.getAvailableLocales()) {
            arrayList.add(locale.toLanguageTag());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: f */
    public static C4876a m31578f(String[] strArr) {
        return m31577g(strArr, m31579e());
    }

    /* renamed from: g */
    public static C4876a m31577g(String[] strArr, String[] strArr2) {
        C4876a aVar = new C4876a();
        for (String str : strArr) {
            AbstractC7805b b = C7863m.m21221b(str);
            String a = m31583a(strArr2, b.mo21165e());
            if (!a.isEmpty()) {
                aVar.f8066a = C7863m.m21221b(a);
                aVar.f8067b = b.mo21169a();
                return aVar;
            }
        }
        aVar.f8066a = C7863m.m21222a();
        return aVar;
    }

    /* renamed from: h */
    public static String[] m31576h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        String[] e = m31579e();
        for (String str : strArr) {
            String a = m31583a(e, C7863m.m21221b(str).mo21165e());
            if (a != null && !a.isEmpty()) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }
}
