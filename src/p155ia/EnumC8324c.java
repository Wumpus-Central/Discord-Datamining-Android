package p155ia;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.react.uimanager.ViewProps;
import p155ia.EnumC8324c;

/* renamed from: ia.c */
/* loaded from: classes5.dex */
public enum EnumC8324c implements Parcelable {
    NONE(ViewProps.NONE),
    INDIRECT("indirect"),
    DIRECT("direct");
    
    public static final Parcelable.Creator<EnumC8324c> CREATOR = new Parcelable.Creator<EnumC8324c>() { // from class: ia.k0
        /* renamed from: a */
        private static EnumC8324c m19935a(Parcel parcel) {
            try {
                return EnumC8324c.m19959a(parcel.readString());
            } catch (EnumC8324c.C8325a e) {
                throw new RuntimeException(e);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ EnumC8324c createFromParcel(Parcel parcel) {
            return m19935a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ EnumC8324c[] newArray(int i) {
            return new EnumC8324c[i];
        }
    };

    /* renamed from: k */
    private final String f18153k;

    /* renamed from: ia.c$a */
    /* loaded from: classes5.dex */
    public static class C8325a extends Exception {
        public C8325a(String str) {
            super(String.format("Attestation conveyance preference %s not supported", str));
        }
    }

    EnumC8324c(String str) {
        this.f18153k = str;
    }

    /* renamed from: a */
    public static EnumC8324c m19959a(String str) {
        EnumC8324c[] values;
        for (EnumC8324c cVar : values()) {
            if (str.equals(cVar.f18153k)) {
                return cVar;
            }
        }
        throw new C8325a(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f18153k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f18153k);
    }
}
