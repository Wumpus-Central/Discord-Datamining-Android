package p080e8;

import android.os.Parcel;
import android.os.Parcelable;
import p119g9.C7557q0;

/* renamed from: e8.m */
/* loaded from: classes7.dex */
public final class C6760m extends AbstractC6753i {
    public static final Parcelable.Creator<C6760m> CREATOR = new C6761a();

    /* renamed from: l */
    public final String f14413l;

    /* renamed from: m */
    public final String f14414m;

    /* renamed from: e8.m$a */
    /* loaded from: classes7.dex */
    class C6761a implements Parcelable.Creator<C6760m> {
        C6761a() {
        }

        /* renamed from: a */
        public C6760m createFromParcel(Parcel parcel) {
            return new C6760m(parcel);
        }

        /* renamed from: b */
        public C6760m[] newArray(int i) {
            return new C6760m[i];
        }
    }

    public C6760m(String str, String str2, String str3) {
        super(str);
        this.f14413l = str2;
        this.f14414m = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6760m.class != obj.getClass()) {
            return false;
        }
        C6760m mVar = (C6760m) obj;
        if (!this.f14402k.equals(mVar.f14402k) || !C7557q0.m22159c(this.f14413l, mVar.f14413l) || !C7557q0.m22159c(this.f14414m, mVar.f14414m)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int hashCode = (527 + this.f14402k.hashCode()) * 31;
        String str = this.f14413l;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = (hashCode + i) * 31;
        String str2 = this.f14414m;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }

    @Override // p080e8.AbstractC6753i
    public String toString() {
        return this.f14402k + ": description=" + this.f14413l + ": value=" + this.f14414m;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f14402k);
        parcel.writeString(this.f14413l);
        parcel.writeString(this.f14414m);
    }

    C6760m(Parcel parcel) {
        super((String) C7557q0.m22145j(parcel.readString()));
        this.f14413l = parcel.readString();
        this.f14414m = (String) C7557q0.m22145j(parcel.readString());
    }
}
