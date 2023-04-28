package androidx.core.p018os;

import android.os.LocaleList;
import java.util.Locale;

/* renamed from: androidx.core.os.r */
/* loaded from: classes.dex */
final class C2456r implements AbstractC2452n {

    /* renamed from: a */
    private final LocaleList f3383a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2456r(Object obj) {
        this.f3383a = (LocaleList) obj;
    }

    @Override // androidx.core.p018os.AbstractC2452n
    /* renamed from: a */
    public Object mo37718a() {
        return this.f3383a;
    }

    public boolean equals(Object obj) {
        boolean equals;
        equals = this.f3383a.equals(((AbstractC2452n) obj).mo37718a());
        return equals;
    }

    @Override // androidx.core.p018os.AbstractC2452n
    public Locale get(int i) {
        Locale locale;
        locale = this.f3383a.get(i);
        return locale;
    }

    public int hashCode() {
        int hashCode;
        hashCode = this.f3383a.hashCode();
        return hashCode;
    }

    public String toString() {
        String localeList;
        localeList = this.f3383a.toString();
        return localeList;
    }
}
