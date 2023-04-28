package p319ra;

import android.os.Parcel;
import android.os.Parcelable;
import com.reactnativecommunity.webview.RNCWebViewManager;
import p441y9.AbstractC14320a;
import p441y9.C14323c;

/* renamed from: ra.x0 */
/* loaded from: classes3.dex */
public final class C12547x0 extends AbstractC14320a {
    public static final Parcelable.Creator<C12547x0> CREATOR = new C12549y0();

    /* renamed from: k */
    final int f28232k;

    /* renamed from: l */
    final int f28233l;

    /* renamed from: m */
    final byte[] f28234m;

    /* renamed from: n */
    final boolean f28235n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12547x0(int i, int i2, byte[] bArr, boolean z) {
        this.f28232k = i;
        this.f28233l = i2;
        this.f28234m = bArr;
        this.f28235n = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C14323c.m857a(parcel);
        C14323c.m848j(parcel, 1, this.f28233l);
        C14323c.m852f(parcel, 2, this.f28234m, false);
        C14323c.m855c(parcel, 3, this.f28235n);
        C14323c.m848j(parcel, RNCWebViewManager.COMMAND_CLEAR_FORM_DATA, this.f28232k);
        C14323c.m856b(parcel, a);
    }
}
