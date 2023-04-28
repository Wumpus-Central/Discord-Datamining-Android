package p420x9;

import android.os.Bundle;
import p384v9.C13456a;

/* renamed from: x9.w */
/* loaded from: classes5.dex */
public class C14022w implements C13456a.AbstractC13459d {

    /* renamed from: l */
    public static final C14022w f31608l = m2018a().m2016a();

    /* renamed from: k */
    private final String f31609k;

    /* renamed from: x9.w$a */
    /* loaded from: classes5.dex */
    public static class C14023a {

        /* renamed from: a */
        private String f31610a;

        /* synthetic */ C14023a(C14027y yVar) {
        }

        /* renamed from: a */
        public C14022w m2016a() {
            return new C14022w(this.f31610a, null);
        }
    }

    /* synthetic */ C14022w(String str, C14029z zVar) {
        this.f31609k = str;
    }

    /* renamed from: a */
    public static C14023a m2018a() {
        return new C14023a(null);
    }

    /* renamed from: b */
    public final Bundle m2017b() {
        Bundle bundle = new Bundle();
        String str = this.f31609k;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C14022w)) {
            return false;
        }
        return C13996n.m2071b(this.f31609k, ((C14022w) obj).f31609k);
    }

    public final int hashCode() {
        return C13996n.m2070c(this.f31609k);
    }
}
