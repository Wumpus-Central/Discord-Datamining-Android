package androidx.core.p018os;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

/* renamed from: androidx.core.os.l */
/* loaded from: classes.dex */
public final class C2449l {

    /* renamed from: b */
    private static final C2449l f3375b = m37729a(new Locale[0]);

    /* renamed from: a */
    private final AbstractC2452n f3376a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.os.l$a */
    /* loaded from: classes.dex */
    public static class C2450a {
        /* renamed from: a */
        static LocaleList m37725a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        /* renamed from: b */
        static LocaleList m37724b() {
            LocaleList adjustedDefault;
            adjustedDefault = LocaleList.getAdjustedDefault();
            return adjustedDefault;
        }

        /* renamed from: c */
        static LocaleList m37723c() {
            LocaleList localeList;
            localeList = LocaleList.getDefault();
            return localeList;
        }
    }

    private C2449l(AbstractC2452n nVar) {
        this.f3376a = nVar;
    }

    /* renamed from: a */
    public static C2449l m37729a(Locale... localeArr) {
        if (Build.VERSION.SDK_INT >= 24) {
            return m37726d(C2450a.m37725a(localeArr));
        }
        return new C2449l(new C2451m(localeArr));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static Locale m37728b(String str) {
        if (str.contains("-")) {
            String[] split = str.split("-", -1);
            if (split.length > 2) {
                return new Locale(split[0], split[1], split[2]);
            }
            if (split.length > 1) {
                return new Locale(split[0], split[1]);
            }
            if (split.length == 1) {
                return new Locale(split[0]);
            }
        } else if (!str.contains("_")) {
            return new Locale(str);
        } else {
            String[] split2 = str.split("_", -1);
            if (split2.length > 2) {
                return new Locale(split2[0], split2[1], split2[2]);
            }
            if (split2.length > 1) {
                return new Locale(split2[0], split2[1]);
            }
            if (split2.length == 1) {
                return new Locale(split2[0]);
            }
        }
        throw new IllegalArgumentException("Can not parse language tag: [" + str + "]");
    }

    /* renamed from: d */
    public static C2449l m37726d(LocaleList localeList) {
        return new C2449l(new C2456r(localeList));
    }

    /* renamed from: c */
    public Locale m37727c(int i) {
        return this.f3376a.get(i);
    }

    public boolean equals(Object obj) {
        return (obj instanceof C2449l) && this.f3376a.equals(((C2449l) obj).f3376a);
    }

    public int hashCode() {
        return this.f3376a.hashCode();
    }

    public String toString() {
        return this.f3376a.toString();
    }
}
