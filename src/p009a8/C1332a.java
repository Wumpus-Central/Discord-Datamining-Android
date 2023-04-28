package p009a8;

import android.os.Parcel;
import android.os.Parcelable;
import p079e7.C6722k;
import p119g9.C7510a;
import p459z7.C14576a;
import p459z7.C14578b;

/* renamed from: a8.a */
/* loaded from: classes7.dex */
public final class C1332a implements C14576a.AbstractC14577b {
    public static final Parcelable.Creator<C1332a> CREATOR = new C0004a();

    /* renamed from: k */
    public final int f223k;

    /* renamed from: l */
    public final String f224l;

    /* renamed from: a8.a$a */
    /* loaded from: classes7.dex */
    class C0004a implements Parcelable.Creator<C1332a> {
        C0004a() {
        }

        /* renamed from: a */
        public C1332a createFromParcel(Parcel parcel) {
            return new C1332a(parcel.readInt(), (String) C7510a.m22367e(parcel.readString()));
        }

        /* renamed from: b */
        public C1332a[] newArray(int i) {
            return new C1332a[i];
        }
    }

    public C1332a(int i, String str) {
        this.f223k = i;
        this.f224l = str;
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

    @Override // p459z7.C14576a.AbstractC14577b
    /* renamed from: g */
    public /* synthetic */ C6722k mo179g() {
        return C14578b.m177b(this);
    }

    public String toString() {
        return "Ait(controlCode=" + this.f223k + ",url=" + this.f224l + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f224l);
        parcel.writeInt(this.f223k);
    }
}
