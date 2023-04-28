package p319ra;

import android.os.Parcel;
import android.os.Parcelable;
import com.reactnativecommunity.webview.RNCWebViewManager;
import p420x9.C13996n;
import p420x9.C14004p;
import p441y9.AbstractC14320a;
import p441y9.C14323c;

/* renamed from: ra.v0 */
/* loaded from: classes3.dex */
public final class C12543v0 extends AbstractC14320a {
    public static final Parcelable.Creator<C12543v0> CREATOR = new C12545w0();

    /* renamed from: n */
    public static final C12543v0 f28226n = new C12543v0(1, "", null);

    /* renamed from: k */
    final int f28227k;

    /* renamed from: l */
    private final String f28228l;

    /* renamed from: m */
    private final String f28229m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12543v0(int i, String str, String str2) {
        this.f28227k = ((Integer) C14004p.m2051j(Integer.valueOf(i))).intValue();
        this.f28228l = str == null ? "" : str;
        this.f28229m = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12543v0)) {
            return false;
        }
        C12543v0 v0Var = (C12543v0) obj;
        if (!C13996n.m2071b(this.f28228l, v0Var.f28228l) || !C13996n.m2071b(this.f28229m, v0Var.f28229m)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C13996n.m2070c(this.f28228l, this.f28229m);
    }

    public final String toString() {
        String str = this.f28228l;
        String str2 = this.f28229m;
        return "NearbyDevice{handle=" + str + ", bluetoothAddress=" + str2 + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C14323c.m857a(parcel);
        C14323c.m842p(parcel, 3, this.f28228l, false);
        C14323c.m842p(parcel, 6, this.f28229m, false);
        C14323c.m848j(parcel, RNCWebViewManager.COMMAND_CLEAR_FORM_DATA, this.f28227k);
        C14323c.m856b(parcel, a);
    }
}
