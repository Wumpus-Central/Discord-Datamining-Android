package p041c8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p079e7.C6722k;
import p119g9.C7557q0;
import p459z7.C14576a;
import p459z7.C14578b;

/* renamed from: c8.a */
/* loaded from: classes7.dex */
public final class C3778a implements C14576a.AbstractC14577b {
    public static final Parcelable.Creator<C3778a> CREATOR = new C0097a();

    /* renamed from: k */
    public final int f6190k;

    /* renamed from: l */
    public final String f6191l;

    /* renamed from: m */
    public final String f6192m;

    /* renamed from: n */
    public final int f6193n;

    /* renamed from: o */
    public final int f6194o;

    /* renamed from: p */
    public final int f6195p;

    /* renamed from: q */
    public final int f6196q;

    /* renamed from: r */
    public final byte[] f6197r;

    /* renamed from: c8.a$a */
    /* loaded from: classes7.dex */
    class C0097a implements Parcelable.Creator<C3778a> {
        C0097a() {
        }

        /* renamed from: a */
        public C3778a createFromParcel(Parcel parcel) {
            return new C3778a(parcel);
        }

        /* renamed from: b */
        public C3778a[] newArray(int i) {
            return new C3778a[i];
        }
    }

    public C3778a(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.f6190k = i;
        this.f6191l = str;
        this.f6192m = str2;
        this.f6193n = i2;
        this.f6194o = i3;
        this.f6195p = i4;
        this.f6196q = i5;
        this.f6197r = bArr;
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
        if (obj == null || C3778a.class != obj.getClass()) {
            return false;
        }
        C3778a aVar = (C3778a) obj;
        if (this.f6190k == aVar.f6190k && this.f6191l.equals(aVar.f6191l) && this.f6192m.equals(aVar.f6192m) && this.f6193n == aVar.f6193n && this.f6194o == aVar.f6194o && this.f6195p == aVar.f6195p && this.f6196q == aVar.f6196q && Arrays.equals(this.f6197r, aVar.f6197r)) {
            return true;
        }
        return false;
    }

    @Override // p459z7.C14576a.AbstractC14577b
    /* renamed from: g */
    public /* synthetic */ C6722k mo179g() {
        return C14578b.m177b(this);
    }

    public int hashCode() {
        return ((((((((((((((527 + this.f6190k) * 31) + this.f6191l.hashCode()) * 31) + this.f6192m.hashCode()) * 31) + this.f6193n) * 31) + this.f6194o) * 31) + this.f6195p) * 31) + this.f6196q) * 31) + Arrays.hashCode(this.f6197r);
    }

    public String toString() {
        return "Picture: mimeType=" + this.f6191l + ", description=" + this.f6192m;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f6190k);
        parcel.writeString(this.f6191l);
        parcel.writeString(this.f6192m);
        parcel.writeInt(this.f6193n);
        parcel.writeInt(this.f6194o);
        parcel.writeInt(this.f6195p);
        parcel.writeInt(this.f6196q);
        parcel.writeByteArray(this.f6197r);
    }

    C3778a(Parcel parcel) {
        this.f6190k = parcel.readInt();
        this.f6191l = (String) C7557q0.m22145j(parcel.readString());
        this.f6192m = (String) C7557q0.m22145j(parcel.readString());
        this.f6193n = parcel.readInt();
        this.f6194o = parcel.readInt();
        this.f6195p = parcel.readInt();
        this.f6196q = parcel.readInt();
        this.f6197r = (byte[]) C7557q0.m22145j(parcel.createByteArray());
    }
}
