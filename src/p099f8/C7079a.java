package p099f8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p079e7.C6722k;
import p119g9.C7557q0;
import p459z7.C14576a;
import p459z7.C14578b;

/* renamed from: f8.a */
/* loaded from: classes7.dex */
public final class C7079a implements C14576a.AbstractC14577b {
    public static final Parcelable.Creator<C7079a> CREATOR = new C0216a();

    /* renamed from: k */
    public final String f15454k;

    /* renamed from: l */
    public final byte[] f15455l;

    /* renamed from: m */
    public final int f15456m;

    /* renamed from: n */
    public final int f15457n;

    /* renamed from: f8.a$a */
    /* loaded from: classes7.dex */
    class C0216a implements Parcelable.Creator<C7079a> {
        C0216a() {
        }

        /* renamed from: a */
        public C7079a createFromParcel(Parcel parcel) {
            return new C7079a(parcel, null);
        }

        /* renamed from: b */
        public C7079a[] newArray(int i) {
            return new C7079a[i];
        }
    }

    /* synthetic */ C7079a(Parcel parcel, C0216a aVar) {
        this(parcel);
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
        if (obj == null || C7079a.class != obj.getClass()) {
            return false;
        }
        C7079a aVar = (C7079a) obj;
        if (!this.f15454k.equals(aVar.f15454k) || !Arrays.equals(this.f15455l, aVar.f15455l) || this.f15456m != aVar.f15456m || this.f15457n != aVar.f15457n) {
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
        return ((((((527 + this.f15454k.hashCode()) * 31) + Arrays.hashCode(this.f15455l)) * 31) + this.f15456m) * 31) + this.f15457n;
    }

    public String toString() {
        return "mdta: key=" + this.f15454k;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f15454k);
        parcel.writeByteArray(this.f15455l);
        parcel.writeInt(this.f15456m);
        parcel.writeInt(this.f15457n);
    }

    public C7079a(String str, byte[] bArr, int i, int i2) {
        this.f15454k = str;
        this.f15455l = bArr;
        this.f15456m = i;
        this.f15457n = i2;
    }

    private C7079a(Parcel parcel) {
        this.f15454k = (String) C7557q0.m22145j(parcel.readString());
        this.f15455l = (byte[]) C7557q0.m22145j(parcel.createByteArray());
        this.f15456m = parcel.readInt();
        this.f15457n = parcel.readInt();
    }
}
