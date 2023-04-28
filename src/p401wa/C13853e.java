package p401wa;

import android.bluetooth.BluetoothDevice;

/* renamed from: wa.e */
/* loaded from: classes3.dex */
public final class C13853e {

    /* renamed from: a */
    private String f31174a;

    /* renamed from: b */
    private String f31175b;

    /* renamed from: c */
    private BluetoothDevice f31176c;

    /* renamed from: d */
    private byte[] f31177d;

    /* renamed from: a */
    public final C13853e m2537a(BluetoothDevice bluetoothDevice) {
        this.f31176c = bluetoothDevice;
        this.f31175b = "__UNRECOGNIZED_BLUETOOTH_DEVICE__";
        this.f31177d = "__UNRECOGNIZED_BLUETOOTH_DEVICE__".getBytes();
        return this;
    }

    /* renamed from: b */
    public final C13853e m2536b(byte[] bArr) {
        this.f31177d = bArr;
        return this;
    }

    /* renamed from: c */
    public final C13853e m2535c(String str) {
        this.f31175b = str;
        return this;
    }

    /* renamed from: d */
    public final C13853e m2534d(String str) {
        this.f31174a = str;
        return this;
    }

    /* renamed from: e */
    public final C13851c m2533e() {
        return new C13851c(this.f31174a, this.f31175b, this.f31176c, this.f31177d, null);
    }
}
