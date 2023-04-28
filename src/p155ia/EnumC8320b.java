package p155ia;

import android.os.Parcel;
import android.os.Parcelable;
import p155ia.EnumC8320b;

/* renamed from: ia.b */
/* loaded from: classes5.dex */
public enum EnumC8320b implements Parcelable {
    PLATFORM("platform"),
    CROSS_PLATFORM("cross-platform");
    
    public static final Parcelable.Creator<EnumC8320b> CREATOR = new Parcelable.Creator<EnumC8320b>() { // from class: ia.c0
        /* renamed from: a */
        private static EnumC8320b m19958a(Parcel parcel) {
            try {
                return EnumC8320b.m19963a(parcel.readString());
            } catch (EnumC8320b.C8321a e) {
                throw new RuntimeException(e);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ EnumC8320b createFromParcel(Parcel parcel) {
            return m19958a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ EnumC8320b[] newArray(int i) {
            return new EnumC8320b[i];
        }
    };

    /* renamed from: k */
    private final String f18145k;

    /* renamed from: ia.b$a */
    /* loaded from: classes5.dex */
    public static class C8321a extends Exception {
        public C8321a(String str) {
            super(String.format("Attachment %s not supported", str));
        }
    }

    EnumC8320b(String str) {
        this.f18145k = str;
    }

    /* renamed from: a */
    public static EnumC8320b m19963a(String str) {
        EnumC8320b[] values;
        for (EnumC8320b bVar : values()) {
            if (str.equals(bVar.f18145k)) {
                return bVar;
            }
        }
        throw new C8321a(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f18145k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f18145k);
    }
}
