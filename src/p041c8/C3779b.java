package p041c8;

import android.os.Parcel;
import android.os.Parcelable;
import p079e7.C6722k;
import p119g9.C7557q0;
import p459z7.C14576a;
import p459z7.C14578b;

/* renamed from: c8.b */
/* loaded from: classes7.dex */
public final class C3779b implements C14576a.AbstractC14577b {
    public static final Parcelable.Creator<C3779b> CREATOR = new C3780a();

    /* renamed from: k */
    public final String f6198k;

    /* renamed from: l */
    public final String f6199l;

    /* renamed from: c8.b$a */
    /* loaded from: classes7.dex */
    class C3780a implements Parcelable.Creator<C3779b> {
        C3780a() {
        }

        /* renamed from: a */
        public C3779b createFromParcel(Parcel parcel) {
            return new C3779b(parcel);
        }

        /* renamed from: b */
        public C3779b[] newArray(int i) {
            return new C3779b[i];
        }
    }

    public C3779b(String str, String str2) {
        this.f6198k = str;
        this.f6199l = str2;
    }

    @Override // p459z7.C14576a.AbstractC14577b
    /* renamed from: Q */
    public /* synthetic */ byte[] mo180Q() {
        return C14578b.m178a(this);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3779b.class != obj.getClass()) {
            return false;
        }
        C3779b bVar = (C3779b) obj;
        if (!this.f6198k.equals(bVar.f6198k) || !this.f6199l.equals(bVar.f6199l)) {
            return false;
        }
        return true;
    }

    @Override // p459z7.C14576a.AbstractC14577b
    /* renamed from: g */
    public /* synthetic */ C6722k mo179g() {
        return C14578b.m177b(this);
    }

    public int hashCode() {
        return ((527 + this.f6198k.hashCode()) * 31) + this.f6199l.hashCode();
    }

    public String toString() {
        return "VC: " + this.f6198k + "=" + this.f6199l;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f6198k);
        parcel.writeString(this.f6199l);
    }

    C3779b(Parcel parcel) {
        this.f6198k = (String) C7557q0.m22145j(parcel.readString());
        this.f6199l = (String) C7557q0.m22145j(parcel.readString());
    }
}
