package p155ia;

import android.os.Parcel;
import android.os.Parcelable;
import p155ia.EnumC8371u;

/* renamed from: ia.u */
/* loaded from: classes5.dex */
public enum EnumC8371u implements Parcelable {
    PUBLIC_KEY("public-key");
    
    public static final Parcelable.Creator<EnumC8371u> CREATOR = new Parcelable.Creator<EnumC8371u>() { // from class: ia.e1
        /* renamed from: a */
        private static EnumC8371u m19954a(Parcel parcel) {
            try {
                return EnumC8371u.m19897a(parcel.readString());
            } catch (EnumC8371u.C8372a e) {
                throw new RuntimeException(e);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ EnumC8371u createFromParcel(Parcel parcel) {
            return m19954a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ EnumC8371u[] newArray(int i) {
            return new EnumC8371u[i];
        }
    };

    /* renamed from: k */
    private final String f18260k;

    /* renamed from: ia.u$a */
    /* loaded from: classes5.dex */
    public static class C8372a extends Exception {
        public C8372a(String str) {
            super(str);
        }
    }

    EnumC8371u(String str) {
        this.f18260k = str;
    }

    /* renamed from: a */
    public static EnumC8371u m19897a(String str) {
        EnumC8371u[] values;
        for (EnumC8371u uVar : values()) {
            if (str.equals(uVar.f18260k)) {
                return uVar;
            }
        }
        throw new C8372a(String.format("PublicKeyCredentialType %s not supported", str));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f18260k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f18260k);
    }
}
