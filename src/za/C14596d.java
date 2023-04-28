package za;

import android.os.Parcel;
import android.os.Parcelable;
import com.reactnativecommunity.webview.RNCWebViewManager;
import p420x9.C13996n;
import p441y9.AbstractC14320a;
import p441y9.C14323c;

/* renamed from: za.d */
/* loaded from: classes3.dex */
public final class C14596d extends AbstractC14320a {
    public static final Parcelable.Creator<C14596d> CREATOR = new C14597e();

    /* renamed from: k */
    final int f33071k;

    /* renamed from: l */
    public final String f33072l;

    /* renamed from: m */
    public final String f33073m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C14596d(int i, String str, String str2) {
        this.f33071k = i;
        this.f33072l = str;
        this.f33073m = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C14596d) && hashCode() == obj.hashCode()) {
            C14596d dVar = (C14596d) obj;
            if (C13996n.m2071b(this.f33072l, dVar.f33072l) && C13996n.m2071b(this.f33073m, dVar.f33073m)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C13996n.m2070c(this.f33072l, this.f33073m);
    }

    public final String toString() {
        String str = this.f33072l;
        String str2 = this.f33073m;
        return "namespace=" + str + ", type=" + str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C14323c.m857a(parcel);
        C14323c.m842p(parcel, 1, this.f33072l, false);
        C14323c.m842p(parcel, 2, this.f33073m, false);
        C14323c.m848j(parcel, RNCWebViewManager.COMMAND_CLEAR_FORM_DATA, this.f33071k);
        C14323c.m856b(parcel, a);
    }
}
