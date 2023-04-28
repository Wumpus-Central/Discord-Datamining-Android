package p230m9;

import android.os.Bundle;
import p384v9.C13456a;
import p420x9.C13996n;

/* renamed from: m9.c */
/* loaded from: classes5.dex */
public final class C10563c implements C13456a.AbstractC13459d {

    /* renamed from: l */
    public static final C10563c f23412l = new C10563c(new Bundle(), null);

    /* renamed from: k */
    private final Bundle f23413k;

    /* synthetic */ C10563c(Bundle bundle, C10567g gVar) {
        this.f23413k = bundle;
    }

    /* renamed from: a */
    public final Bundle m12808a() {
        return new Bundle(this.f23413k);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10563c)) {
            return false;
        }
        return C13996n.m2072a(this.f23413k, ((C10563c) obj).f23413k);
    }

    public final int hashCode() {
        return C13996n.m2070c(this.f23413k);
    }
}
