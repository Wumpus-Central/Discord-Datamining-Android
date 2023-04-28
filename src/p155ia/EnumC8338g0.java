package p155ia;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ia.g0 */
/* loaded from: classes5.dex */
public enum EnumC8338g0 implements Parcelable {
    USER_VERIFICATION_REQUIRED("required"),
    USER_VERIFICATION_PREFERRED("preferred"),
    USER_VERIFICATION_DISCOURAGED("discouraged");
    
    public static final Parcelable.Creator<EnumC8338g0> CREATOR = new Parcelable.Creator<EnumC8338g0>() { // from class: ia.f0
        /* renamed from: a */
        private static EnumC8338g0 m19949a(Parcel parcel) {
            try {
                return EnumC8338g0.m19946a(parcel.readString());
            } catch (C8341h0 e) {
                throw new RuntimeException(e);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ EnumC8338g0 createFromParcel(Parcel parcel) {
            return m19949a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ EnumC8338g0[] newArray(int i) {
            return new EnumC8338g0[i];
        }
    };

    /* renamed from: k */
    private final String f18170k;

    EnumC8338g0(String str) {
        this.f18170k = str;
    }

    /* renamed from: a */
    public static EnumC8338g0 m19946a(String str) {
        EnumC8338g0[] values;
        for (EnumC8338g0 g0Var : values()) {
            if (str.equals(g0Var.f18170k)) {
                return g0Var;
            }
        }
        throw new C8341h0(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f18170k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f18170k);
    }
}
