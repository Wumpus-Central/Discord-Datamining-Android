package com.google.android.gms.fido.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.fido.common.Transport;

/* loaded from: classes5.dex */
public enum Transport implements ReflectedParcelable {
    BLUETOOTH_CLASSIC("bt"),
    BLUETOOTH_LOW_ENERGY("ble"),
    NFC("nfc"),
    USB("usb"),
    INTERNAL("internal"),
    CABLE("cable");
    
    public static final Parcelable.Creator<Transport> CREATOR = new Parcelable.Creator<Transport>() { // from class: com.google.android.gms.fido.common.a
        /* renamed from: a */
        private static Transport m28938a(Parcel parcel) {
            try {
                return Transport.m28939a(parcel.readString());
            } catch (Transport.C5428a e) {
                throw new RuntimeException(e);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Transport createFromParcel(Parcel parcel) {
            return m28938a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Transport[] newArray(int i) {
            return new Transport[i];
        }
    };

    /* renamed from: k */
    private final String f10253k;

    /* renamed from: com.google.android.gms.fido.common.Transport$a */
    /* loaded from: classes5.dex */
    public static class C5428a extends Exception {
        public C5428a(String str) {
            super(str);
        }
    }

    Transport(String str) {
        this.f10253k = str;
    }

    /* renamed from: a */
    public static Transport m28939a(String str) {
        Transport[] values;
        for (Transport transport : values()) {
            if (str.equals(transport.f10253k)) {
                return transport;
            }
        }
        throw new C5428a(String.format("Transport %s not supported", str));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f10253k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f10253k);
    }
}
