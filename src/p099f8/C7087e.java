package p099f8;

import android.os.Parcel;
import android.os.Parcelable;
import p079e7.C6722k;
import p103fc.C7113b;
import p459z7.C14576a;
import p459z7.C14578b;

/* renamed from: f8.e */
/* loaded from: classes7.dex */
public final class C7087e implements C14576a.AbstractC14577b {
    public static final Parcelable.Creator<C7087e> CREATOR = new C7088a();

    /* renamed from: k */
    public final float f15468k;

    /* renamed from: l */
    public final int f15469l;

    /* renamed from: f8.e$a */
    /* loaded from: classes7.dex */
    class C7088a implements Parcelable.Creator<C7087e> {
        C7088a() {
        }

        /* renamed from: a */
        public C7087e createFromParcel(Parcel parcel) {
            return new C7087e(parcel, (C7088a) null);
        }

        /* renamed from: b */
        public C7087e[] newArray(int i) {
            return new C7087e[i];
        }
    }

    /* synthetic */ C7087e(Parcel parcel, C7088a aVar) {
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
        if (obj == null || C7087e.class != obj.getClass()) {
            return false;
        }
        C7087e eVar = (C7087e) obj;
        if (this.f15468k == eVar.f15468k && this.f15469l == eVar.f15469l) {
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
        return ((527 + C7113b.m23368a(this.f15468k)) * 31) + this.f15469l;
    }

    public String toString() {
        return "smta: captureFrameRate=" + this.f15468k + ", svcTemporalLayerCount=" + this.f15469l;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f15468k);
        parcel.writeInt(this.f15469l);
    }

    public C7087e(float f, int i) {
        this.f15468k = f;
        this.f15469l = i;
    }

    private C7087e(Parcel parcel) {
        this.f15468k = parcel.readFloat();
        this.f15469l = parcel.readInt();
    }
}
