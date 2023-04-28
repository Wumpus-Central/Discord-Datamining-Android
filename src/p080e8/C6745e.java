package p080e8;

import android.os.Parcel;
import android.os.Parcelable;
import p119g9.C7557q0;

/* renamed from: e8.e */
/* loaded from: classes7.dex */
public final class C6745e extends AbstractC6753i {
    public static final Parcelable.Creator<C6745e> CREATOR = new C6746a();

    /* renamed from: l */
    public final String f14390l;

    /* renamed from: m */
    public final String f14391m;

    /* renamed from: n */
    public final String f14392n;

    /* renamed from: e8.e$a */
    /* loaded from: classes7.dex */
    class C6746a implements Parcelable.Creator<C6745e> {
        C6746a() {
        }

        /* renamed from: a */
        public C6745e createFromParcel(Parcel parcel) {
            return new C6745e(parcel);
        }

        /* renamed from: b */
        public C6745e[] newArray(int i) {
            return new C6745e[i];
        }
    }

    public C6745e(String str, String str2, String str3) {
        super("COMM");
        this.f14390l = str;
        this.f14391m = str2;
        this.f14392n = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6745e.class != obj.getClass()) {
            return false;
        }
        C6745e eVar = (C6745e) obj;
        if (!C7557q0.m22159c(this.f14391m, eVar.f14391m) || !C7557q0.m22159c(this.f14390l, eVar.f14390l) || !C7557q0.m22159c(this.f14392n, eVar.f14392n)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int i2;
        String str = this.f14390l;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = (527 + i) * 31;
        String str2 = this.f14391m;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        String str3 = this.f14392n;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return i5 + i3;
    }

    @Override // p080e8.AbstractC6753i
    public String toString() {
        return this.f14402k + ": language=" + this.f14390l + ", description=" + this.f14391m;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f14402k);
        parcel.writeString(this.f14390l);
        parcel.writeString(this.f14392n);
    }

    C6745e(Parcel parcel) {
        super("COMM");
        this.f14390l = (String) C7557q0.m22145j(parcel.readString());
        this.f14391m = (String) C7557q0.m22145j(parcel.readString());
        this.f14392n = (String) C7557q0.m22145j(parcel.readString());
    }
}
