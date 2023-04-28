package p080e8;

import android.os.Parcel;
import android.os.Parcelable;
import p119g9.C7557q0;

/* renamed from: e8.n */
/* loaded from: classes7.dex */
public final class C6762n extends AbstractC6753i {
    public static final Parcelable.Creator<C6762n> CREATOR = new C6763a();

    /* renamed from: l */
    public final String f14415l;

    /* renamed from: m */
    public final String f14416m;

    /* renamed from: e8.n$a */
    /* loaded from: classes7.dex */
    class C6763a implements Parcelable.Creator<C6762n> {
        C6763a() {
        }

        /* renamed from: a */
        public C6762n createFromParcel(Parcel parcel) {
            return new C6762n(parcel);
        }

        /* renamed from: b */
        public C6762n[] newArray(int i) {
            return new C6762n[i];
        }
    }

    public C6762n(String str, String str2, String str3) {
        super(str);
        this.f14415l = str2;
        this.f14416m = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6762n.class != obj.getClass()) {
            return false;
        }
        C6762n nVar = (C6762n) obj;
        if (!this.f14402k.equals(nVar.f14402k) || !C7557q0.m22159c(this.f14415l, nVar.f14415l) || !C7557q0.m22159c(this.f14416m, nVar.f14416m)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int hashCode = (527 + this.f14402k.hashCode()) * 31;
        String str = this.f14415l;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = (hashCode + i) * 31;
        String str2 = this.f14416m;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }

    @Override // p080e8.AbstractC6753i
    public String toString() {
        return this.f14402k + ": url=" + this.f14416m;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f14402k);
        parcel.writeString(this.f14415l);
        parcel.writeString(this.f14416m);
    }

    C6762n(Parcel parcel) {
        super((String) C7557q0.m22145j(parcel.readString()));
        this.f14415l = parcel.readString();
        this.f14416m = (String) C7557q0.m22145j(parcel.readString());
    }
}
