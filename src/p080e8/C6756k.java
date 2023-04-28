package p080e8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p119g9.C7557q0;

/* renamed from: e8.k */
/* loaded from: classes7.dex */
public final class C6756k extends AbstractC6753i {
    public static final Parcelable.Creator<C6756k> CREATOR = new C6757a();

    /* renamed from: l */
    public final int f14406l;

    /* renamed from: m */
    public final int f14407m;

    /* renamed from: n */
    public final int f14408n;

    /* renamed from: o */
    public final int[] f14409o;

    /* renamed from: p */
    public final int[] f14410p;

    /* renamed from: e8.k$a */
    /* loaded from: classes7.dex */
    class C6757a implements Parcelable.Creator<C6756k> {
        C6757a() {
        }

        /* renamed from: a */
        public C6756k createFromParcel(Parcel parcel) {
            return new C6756k(parcel);
        }

        /* renamed from: b */
        public C6756k[] newArray(int i) {
            return new C6756k[i];
        }
    }

    public C6756k(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f14406l = i;
        this.f14407m = i2;
        this.f14408n = i3;
        this.f14409o = iArr;
        this.f14410p = iArr2;
    }

    @Override // p080e8.AbstractC6753i, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6756k.class != obj.getClass()) {
            return false;
        }
        C6756k kVar = (C6756k) obj;
        if (this.f14406l == kVar.f14406l && this.f14407m == kVar.f14407m && this.f14408n == kVar.f14408n && Arrays.equals(this.f14409o, kVar.f14409o) && Arrays.equals(this.f14410p, kVar.f14410p)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + this.f14406l) * 31) + this.f14407m) * 31) + this.f14408n) * 31) + Arrays.hashCode(this.f14409o)) * 31) + Arrays.hashCode(this.f14410p);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f14406l);
        parcel.writeInt(this.f14407m);
        parcel.writeInt(this.f14408n);
        parcel.writeIntArray(this.f14409o);
        parcel.writeIntArray(this.f14410p);
    }

    C6756k(Parcel parcel) {
        super("MLLT");
        this.f14406l = parcel.readInt();
        this.f14407m = parcel.readInt();
        this.f14408n = parcel.readInt();
        this.f14409o = (int[]) C7557q0.m22145j(parcel.createIntArray());
        this.f14410p = (int[]) C7557q0.m22145j(parcel.createIntArray());
    }
}
