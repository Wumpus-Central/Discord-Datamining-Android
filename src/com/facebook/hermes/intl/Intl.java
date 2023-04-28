package com.facebook.hermes.intl;

import android.icu.lang.UCharacter;
import android.icu.util.ULocale;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import p078e6.AbstractC6709a;
import p129h5.C7848j;

@AbstractC6709a
/* loaded from: classes7.dex */
public class Intl {
    /* renamed from: a */
    private static List<String> m31637a(List<String> list) {
        if (list.size() == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str == null) {
                throw new C7848j("Incorrect locale information provided");
            } else if (!str.isEmpty()) {
                String b = C4874f.m31596b(str);
                if (!b.isEmpty() && !arrayList.contains(b)) {
                    arrayList.add(b);
                }
            } else {
                throw new C7848j("Incorrect locale information provided");
            }
        }
        return arrayList;
    }

    @AbstractC6709a
    public static List<String> getCanonicalLocales(List<String> list) {
        return m31637a(list);
    }

    @AbstractC6709a
    public static String toLocaleLowerCase(List<String> list, String str) {
        String lowerCase;
        String[] strArr = new String[list.size()];
        if (Build.VERSION.SDK_INT < 24) {
            return str.toLowerCase((Locale) C4875g.m31578f((String[]) list.toArray(strArr)).f8066a.mo21162h());
        }
        lowerCase = UCharacter.toLowerCase((ULocale) C4875g.m31581c((String[]) list.toArray(strArr)).f8066a.mo21162h(), str);
        return lowerCase;
    }

    @AbstractC6709a
    public static String toLocaleUpperCase(List<String> list, String str) {
        String upperCase;
        String[] strArr = new String[list.size()];
        if (Build.VERSION.SDK_INT < 24) {
            return str.toUpperCase((Locale) C4875g.m31578f((String[]) list.toArray(strArr)).f8066a.mo21162h());
        }
        upperCase = UCharacter.toUpperCase((ULocale) C4875g.m31581c((String[]) list.toArray(strArr)).f8066a.mo21162h(), str);
        return upperCase;
    }
}
