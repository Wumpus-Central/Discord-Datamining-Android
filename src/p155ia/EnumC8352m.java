package p155ia;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import p155ia.EnumC8352m;

/* renamed from: ia.m */
/* loaded from: classes5.dex */
public enum EnumC8352m implements Parcelable {
    NOT_SUPPORTED_ERR(9),
    INVALID_STATE_ERR(11),
    SECURITY_ERR(18),
    NETWORK_ERR(19),
    ABORT_ERR(20),
    TIMEOUT_ERR(23),
    ENCODING_ERR(27),
    UNKNOWN_ERR(28),
    CONSTRAINT_ERR(29),
    DATA_ERR(30),
    NOT_ALLOWED_ERR(35),
    ATTESTATION_NOT_PRIVATE_ERR(36);
    
    public static final Parcelable.Creator<EnumC8352m> CREATOR = new Parcelable.Creator<EnumC8352m>() { // from class: ia.w0
        /* renamed from: a */
        private static EnumC8352m m19891a(Parcel parcel) {
            try {
                return EnumC8352m.m19933b(parcel.readInt());
            } catch (EnumC8352m.C8353a e) {
                throw new IllegalArgumentException(e);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ EnumC8352m createFromParcel(Parcel parcel) {
            return m19891a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ EnumC8352m[] newArray(int i) {
            return new EnumC8352m[i];
        }
    };

    /* renamed from: k */
    private final int f18198k;

    /* renamed from: ia.m$a */
    /* loaded from: classes5.dex */
    public static class C8353a extends Exception {
        public C8353a(int i) {
            super(String.format(Locale.US, "Error code %d is not supported", Integer.valueOf(i)));
        }
    }

    EnumC8352m(int i) {
        this.f18198k = i;
    }

    /* renamed from: b */
    public static EnumC8352m m19933b(int i) {
        EnumC8352m[] values;
        for (EnumC8352m mVar : values()) {
            if (i == mVar.f18198k) {
                return mVar;
            }
        }
        throw new C8353a(i);
    }

    /* renamed from: a */
    public final int m19934a() {
        return this.f18198k;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f18198k);
    }
}
