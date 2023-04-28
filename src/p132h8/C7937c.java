package p132h8;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: h8.c */
/* loaded from: classes7.dex */
public final class C7937c implements Comparable<C7937c>, Parcelable {
    public static final Parcelable.Creator<C7937c> CREATOR = new C7938a();

    /* renamed from: k */
    public final int f17034k;

    /* renamed from: l */
    public final int f17035l;

    /* renamed from: m */
    public final int f17036m;

    /* renamed from: h8.c$a */
    /* loaded from: classes7.dex */
    class C7938a implements Parcelable.Creator<C7937c> {
        C7938a() {
        }

        /* renamed from: a */
        public C7937c createFromParcel(Parcel parcel) {
            return new C7937c(parcel);
        }

        /* renamed from: b */
        public C7937c[] newArray(int i) {
            return new C7937c[i];
        }
    }

    public C7937c(int i, int i2, int i3) {
        this.f17034k = i;
        this.f17035l = i2;
        this.f17036m = i3;
    }

    /* renamed from: a */
    public int compareTo(C7937c cVar) {
        int i = this.f17034k - cVar.f17034k;
        if (i != 0) {
            return i;
        }
        int i2 = this.f17035l - cVar.f17035l;
        if (i2 == 0) {
            return this.f17036m - cVar.f17036m;
        }
        return i2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7937c.class != obj.getClass()) {
            return false;
        }
        C7937c cVar = (C7937c) obj;
        if (this.f17034k == cVar.f17034k && this.f17035l == cVar.f17035l && this.f17036m == cVar.f17036m) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f17034k * 31) + this.f17035l) * 31) + this.f17036m;
    }

    public String toString() {
        return this.f17034k + "." + this.f17035l + "." + this.f17036m;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f17034k);
        parcel.writeInt(this.f17035l);
        parcel.writeInt(this.f17036m);
    }

    C7937c(Parcel parcel) {
        this.f17034k = parcel.readInt();
        this.f17035l = parcel.readInt();
        this.f17036m = parcel.readInt();
    }
}
