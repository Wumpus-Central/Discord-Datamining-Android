package p133h9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p119g9.C7557q0;

/* renamed from: h9.b */
/* loaded from: classes5.dex */
public final class C7942b implements Parcelable {
    public static final Parcelable.Creator<C7942b> CREATOR = new C7943a();

    /* renamed from: k */
    public final int f17045k;

    /* renamed from: l */
    public final int f17046l;

    /* renamed from: m */
    public final int f17047m;

    /* renamed from: n */
    public final byte[] f17048n;

    /* renamed from: o */
    private int f17049o;

    /* renamed from: h9.b$a */
    /* loaded from: classes5.dex */
    class C7943a implements Parcelable.Creator<C7942b> {
        C7943a() {
        }

        /* renamed from: a */
        public C7942b createFromParcel(Parcel parcel) {
            return new C7942b(parcel);
        }

        /* renamed from: b */
        public C7942b[] newArray(int i) {
            return new C7942b[i];
        }
    }

    public C7942b(int i, int i2, int i3, byte[] bArr) {
        this.f17045k = i;
        this.f17046l = i2;
        this.f17047m = i3;
        this.f17048n = bArr;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7942b.class != obj.getClass()) {
            return false;
        }
        C7942b bVar = (C7942b) obj;
        if (this.f17045k == bVar.f17045k && this.f17046l == bVar.f17046l && this.f17047m == bVar.f17047m && Arrays.equals(this.f17048n, bVar.f17048n)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.f17049o == 0) {
            this.f17049o = ((((((527 + this.f17045k) * 31) + this.f17046l) * 31) + this.f17047m) * 31) + Arrays.hashCode(this.f17048n);
        }
        return this.f17049o;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ColorInfo(");
        sb2.append(this.f17045k);
        sb2.append(", ");
        sb2.append(this.f17046l);
        sb2.append(", ");
        sb2.append(this.f17047m);
        sb2.append(", ");
        sb2.append(this.f17048n != null);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        boolean z;
        parcel.writeInt(this.f17045k);
        parcel.writeInt(this.f17046l);
        parcel.writeInt(this.f17047m);
        if (this.f17048n != null) {
            z = true;
        } else {
            z = false;
        }
        C7557q0.m22164Z0(parcel, z);
        byte[] bArr = this.f17048n;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }

    C7942b(Parcel parcel) {
        this.f17045k = parcel.readInt();
        this.f17046l = parcel.readInt();
        this.f17047m = parcel.readInt();
        this.f17048n = C7557q0.m22202G0(parcel) ? parcel.createByteArray() : null;
    }
}
