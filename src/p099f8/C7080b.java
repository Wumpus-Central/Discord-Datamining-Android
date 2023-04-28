package p099f8;

import android.os.Parcel;
import android.os.Parcelable;
import p079e7.C6722k;
import p103fc.C7118f;
import p459z7.C14576a;
import p459z7.C14578b;

/* renamed from: f8.b */
/* loaded from: classes7.dex */
public final class C7080b implements C14576a.AbstractC14577b {
    public static final Parcelable.Creator<C7080b> CREATOR = new C7081a();

    /* renamed from: k */
    public final long f15458k;

    /* renamed from: l */
    public final long f15459l;

    /* renamed from: m */
    public final long f15460m;

    /* renamed from: n */
    public final long f15461n;

    /* renamed from: o */
    public final long f15462o;

    /* renamed from: f8.b$a */
    /* loaded from: classes7.dex */
    class C7081a implements Parcelable.Creator<C7080b> {
        C7081a() {
        }

        /* renamed from: a */
        public C7080b createFromParcel(Parcel parcel) {
            return new C7080b(parcel, null);
        }

        /* renamed from: b */
        public C7080b[] newArray(int i) {
            return new C7080b[i];
        }
    }

    /* synthetic */ C7080b(Parcel parcel, C7081a aVar) {
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
        if (obj == null || C7080b.class != obj.getClass()) {
            return false;
        }
        C7080b bVar = (C7080b) obj;
        if (this.f15458k == bVar.f15458k && this.f15459l == bVar.f15459l && this.f15460m == bVar.f15460m && this.f15461n == bVar.f15461n && this.f15462o == bVar.f15462o) {
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
        return ((((((((527 + C7118f.m23352b(this.f15458k)) * 31) + C7118f.m23352b(this.f15459l)) * 31) + C7118f.m23352b(this.f15460m)) * 31) + C7118f.m23352b(this.f15461n)) * 31) + C7118f.m23352b(this.f15462o);
    }

    public String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f15458k + ", photoSize=" + this.f15459l + ", photoPresentationTimestampUs=" + this.f15460m + ", videoStartPosition=" + this.f15461n + ", videoSize=" + this.f15462o;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f15458k);
        parcel.writeLong(this.f15459l);
        parcel.writeLong(this.f15460m);
        parcel.writeLong(this.f15461n);
        parcel.writeLong(this.f15462o);
    }

    public C7080b(long j, long j2, long j3, long j4, long j5) {
        this.f15458k = j;
        this.f15459l = j2;
        this.f15460m = j3;
        this.f15461n = j4;
        this.f15462o = j5;
    }

    private C7080b(Parcel parcel) {
        this.f15458k = parcel.readLong();
        this.f15459l = parcel.readLong();
        this.f15460m = parcel.readLong();
        this.f15461n = parcel.readLong();
        this.f15462o = parcel.readLong();
    }
}
