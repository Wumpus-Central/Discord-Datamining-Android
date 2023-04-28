package za;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.nearby.messages.Message;
import com.reactnativecommunity.webview.RNCWebViewManager;
import p420x9.C13996n;
import p420x9.C14004p;
import p441y9.AbstractC14320a;
import p441y9.C14323c;

/* renamed from: za.f */
/* loaded from: classes3.dex */
public final class C14598f extends AbstractC14320a {
    public static final Parcelable.Creator<C14598f> CREATOR = new C14599g();

    /* renamed from: k */
    final int f33074k;

    /* renamed from: l */
    public final Message f33075l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C14598f(int i, Message message) {
        this.f33074k = i;
        this.f33075l = (Message) C14004p.m2051j(message);
    }

    /* renamed from: p */
    public static final C14598f m136p(Message message) {
        return new C14598f(1, message);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14598f)) {
            return false;
        }
        return C13996n.m2071b(this.f33075l, ((C14598f) obj).f33075l);
    }

    public final int hashCode() {
        return C13996n.m2070c(this.f33075l);
    }

    public final String toString() {
        String message = this.f33075l.toString();
        return "MessageWrapper{message=" + message + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C14323c.m857a(parcel);
        C14323c.m844n(parcel, 1, this.f33075l, i, false);
        C14323c.m848j(parcel, RNCWebViewManager.COMMAND_CLEAR_FORM_DATA, this.f33074k);
        C14323c.m856b(parcel, a);
    }
}
