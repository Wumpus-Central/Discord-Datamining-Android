package p442ya;

import p384v9.C13456a;
import p420x9.C13996n;

/* renamed from: ya.e */
/* loaded from: classes3.dex */
public class C14330e implements C13456a.AbstractC13459d {

    /* renamed from: k */
    public final String f32446k;

    /* renamed from: l */
    public final int f32447l;

    /* renamed from: m */
    public final String f32448m;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C14330e)) {
            return false;
        }
        C14330e eVar = (C14330e) obj;
        String str = eVar.f32446k;
        if (!C13996n.m2071b(null, null) || !C13996n.m2071b(null, null) || !C13996n.m2071b(null, null) || this.f32447l != eVar.f32447l) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C13996n.m2070c(null, Boolean.FALSE, null, null, Integer.valueOf(this.f32447l));
    }
}
