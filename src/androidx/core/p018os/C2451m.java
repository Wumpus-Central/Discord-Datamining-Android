package androidx.core.p018os;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* renamed from: androidx.core.os.m */
/* loaded from: classes.dex */
final class C2451m implements AbstractC2452n {

    /* renamed from: c */
    private static final Locale[] f3377c = new Locale[0];

    /* renamed from: d */
    private static final Locale f3378d = new Locale("en", "XA");

    /* renamed from: e */
    private static final Locale f3379e = new Locale("ar", "XB");

    /* renamed from: f */
    private static final Locale f3380f = C2449l.m37728b("en-Latn");

    /* renamed from: a */
    private final Locale[] f3381a;

    /* renamed from: b */
    private final String f3382b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2451m(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f3381a = f3377c;
            this.f3382b = "";
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < localeArr.length; i++) {
            Locale locale = localeArr[i];
            if (locale != null) {
                if (!hashSet.contains(locale)) {
                    Locale locale2 = (Locale) locale.clone();
                    arrayList.add(locale2);
                    m37722b(sb2, locale2);
                    if (i < localeArr.length - 1) {
                        sb2.append(',');
                    }
                    hashSet.add(locale2);
                }
            } else {
                throw new NullPointerException("list[" + i + "] is null");
            }
        }
        this.f3381a = (Locale[]) arrayList.toArray(new Locale[0]);
        this.f3382b = sb2.toString();
    }

    /* renamed from: b */
    static void m37722b(StringBuilder sb2, Locale locale) {
        sb2.append(locale.getLanguage());
        String country = locale.getCountry();
        if (country != null && !country.isEmpty()) {
            sb2.append('-');
            sb2.append(locale.getCountry());
        }
    }

    @Override // androidx.core.p018os.AbstractC2452n
    /* renamed from: a */
    public Object mo37718a() {
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2451m)) {
            return false;
        }
        Locale[] localeArr = ((C2451m) obj).f3381a;
        if (this.f3381a.length != localeArr.length) {
            return false;
        }
        int i = 0;
        while (true) {
            Locale[] localeArr2 = this.f3381a;
            if (i >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i].equals(localeArr[i])) {
                return false;
            }
            i++;
        }
    }

    @Override // androidx.core.p018os.AbstractC2452n
    public Locale get(int i) {
        if (i >= 0) {
            Locale[] localeArr = this.f3381a;
            if (i < localeArr.length) {
                return localeArr[i];
            }
        }
        return null;
    }

    public int hashCode() {
        int i = 1;
        for (Locale locale : this.f3381a) {
            i = (i * 31) + locale.hashCode();
        }
        return i;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        int i = 0;
        while (true) {
            Locale[] localeArr = this.f3381a;
            if (i < localeArr.length) {
                sb2.append(localeArr[i]);
                if (i < this.f3381a.length - 1) {
                    sb2.append(',');
                }
                i++;
            } else {
                sb2.append("]");
                return sb2.toString();
            }
        }
    }
}
