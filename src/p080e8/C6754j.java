package p080e8;

import android.os.Parcel;
import android.os.Parcelable;
import p119g9.C7557q0;

/* renamed from: e8.j */
/* loaded from: classes7.dex */
public final class C6754j extends AbstractC6753i {
    public static final Parcelable.Creator<C6754j> CREATOR = new C6755a();

    /* renamed from: l */
    public final String f14403l;

    /* renamed from: m */
    public final String f14404m;

    /* renamed from: n */
    public final String f14405n;

    /* renamed from: e8.j$a */
    /* loaded from: classes7.dex */
    class C6755a implements Parcelable.Creator<C6754j> {
        C6755a() {
        }

        /* renamed from: a */
        public C6754j createFromParcel(Parcel parcel) {
            return new C6754j(parcel);
        }

        /* renamed from: b */
        public C6754j[] newArray(int i) {
            return new C6754j[i];
        }
    }

    public C6754j(String str, String str2, String str3) {
        super("----");
        this.f14403l = str;
        this.f14404m = str2;
        this.f14405n = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6754j.class != obj.getClass()) {
            return false;
        }
        C6754j jVar = (C6754j) obj;
        if (!C7557q0.m22159c(this.f14404m, jVar.f14404m) || !C7557q0.m22159c(this.f14403l, jVar.f14403l) || !C7557q0.m22159c(this.f14405n, jVar.f14405n)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int i2;
        String str = this.f14403l;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = (527 + i) * 31;
        String str2 = this.f14404m;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        String str3 = this.f14405n;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return i5 + i3;
    }

    @Override // p080e8.AbstractC6753i
    public String toString() {
        return this.f14402k + ": domain=" + this.f14403l + ", description=" + this.f14404m;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f14402k);
        parcel.writeString(this.f14403l);
        parcel.writeString(this.f14405n);
    }

    C6754j(Parcel parcel) {
        super("----");
        this.f14403l = (String) C7557q0.m22145j(parcel.readString());
        this.f14404m = (String) C7557q0.m22145j(parcel.readString());
        this.f14405n = (String) C7557q0.m22145j(parcel.readString());
    }
}
