package p319ra;

import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.Parcelable;
import p441y9.C14321b;

/* renamed from: ra.f0 */
/* loaded from: classes3.dex */
public final class C12507f0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int x = C14321b.m860x(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        BluetoothDevice bluetoothDevice = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < x) {
            int p = C14321b.m868p(parcel);
            int k = C14321b.m873k(p);
            if (k == 1) {
                str = C14321b.m879e(parcel, p);
            } else if (k == 2) {
                str2 = C14321b.m879e(parcel, p);
            } else if (k == 3) {
                str3 = C14321b.m879e(parcel, p);
            } else if (k == 4) {
                bluetoothDevice = (BluetoothDevice) C14321b.m880d(parcel, p, BluetoothDevice.CREATOR);
            } else if (k != 5) {
                C14321b.m861w(parcel, p);
            } else {
                bArr = C14321b.m882b(parcel, p);
            }
        }
        C14321b.m874j(parcel, x);
        return new C12504e0(str, str2, str3, bluetoothDevice, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C12504e0[i];
    }
}
