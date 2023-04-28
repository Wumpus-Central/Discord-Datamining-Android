package p319ra;

import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p420x9.C13996n;
import p441y9.AbstractC14320a;
import p441y9.C14323c;

/* renamed from: ra.e0 */
/* loaded from: classes3.dex */
public final class C12504e0 extends AbstractC14320a {
    public static final Parcelable.Creator<C12504e0> CREATOR = new C12507f0();

    /* renamed from: k */
    private String f28156k;

    /* renamed from: l */
    private String f28157l;

    /* renamed from: m */
    private String f28158m;

    /* renamed from: n */
    private BluetoothDevice f28159n;

    /* renamed from: o */
    private byte[] f28160o;

    private C12504e0() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C12504e0) {
            C12504e0 e0Var = (C12504e0) obj;
            if (C13996n.m2071b(this.f28156k, e0Var.f28156k) && C13996n.m2071b(this.f28157l, e0Var.f28157l) && C13996n.m2071b(this.f28158m, e0Var.f28158m) && C13996n.m2071b(this.f28159n, e0Var.f28159n) && Arrays.equals(this.f28160o, e0Var.f28160o)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C13996n.m2070c(this.f28156k, this.f28157l, this.f28158m, this.f28159n, Integer.valueOf(Arrays.hashCode(this.f28160o)));
    }

    /* renamed from: p */
    public final BluetoothDevice m6608p() {
        return this.f28159n;
    }

    /* renamed from: r */
    public final String m6607r() {
        return this.f28156k;
    }

    /* renamed from: t */
    public final String m6606t() {
        return this.f28158m;
    }

    /* renamed from: u */
    public final String m6605u() {
        return this.f28157l;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C14323c.m857a(parcel);
        C14323c.m842p(parcel, 1, this.f28156k, false);
        C14323c.m842p(parcel, 2, this.f28157l, false);
        C14323c.m842p(parcel, 3, this.f28158m, false);
        C14323c.m844n(parcel, 4, this.f28159n, i, false);
        C14323c.m852f(parcel, 5, this.f28160o, false);
        C14323c.m856b(parcel, a);
    }

    /* renamed from: z */
    public final byte[] m6604z() {
        return this.f28160o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12504e0(String str, String str2, String str3, BluetoothDevice bluetoothDevice, byte[] bArr) {
        this.f28156k = str;
        this.f28157l = str2;
        this.f28158m = str3;
        this.f28159n = bluetoothDevice;
        this.f28160o = bArr;
    }
}
