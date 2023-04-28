package p153i8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p079e7.C6722k;
import p119g9.C7510a;

/* renamed from: i8.u0 */
/* loaded from: classes7.dex */
public final class C8302u0 implements Parcelable {
    public static final Parcelable.Creator<C8302u0> CREATOR = new C8303a();

    /* renamed from: k */
    public final int f18099k;

    /* renamed from: l */
    private final C6722k[] f18100l;

    /* renamed from: m */
    private int f18101m;

    /* renamed from: i8.u0$a */
    /* loaded from: classes7.dex */
    class C8303a implements Parcelable.Creator<C8302u0> {
        C8303a() {
        }

        /* renamed from: a */
        public C8302u0 createFromParcel(Parcel parcel) {
            return new C8302u0(parcel);
        }

        /* renamed from: b */
        public C8302u0[] newArray(int i) {
            return new C8302u0[i];
        }
    }

    public C8302u0(C6722k... kVarArr) {
        C7510a.m22366f(kVarArr.length > 0);
        this.f18100l = kVarArr;
        this.f18099k = kVarArr.length;
    }

    /* renamed from: a */
    public C6722k m19990a(int i) {
        return this.f18100l[i];
    }

    /* renamed from: b */
    public int m19989b(C6722k kVar) {
        int i = 0;
        while (true) {
            C6722k[] kVarArr = this.f18100l;
            if (i >= kVarArr.length) {
                return -1;
            }
            if (kVar == kVarArr[i]) {
                return i;
            }
            i++;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8302u0.class != obj.getClass()) {
            return false;
        }
        C8302u0 u0Var = (C8302u0) obj;
        if (this.f18099k != u0Var.f18099k || !Arrays.equals(this.f18100l, u0Var.f18100l)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        if (this.f18101m == 0) {
            this.f18101m = 527 + Arrays.hashCode(this.f18100l);
        }
        return this.f18101m;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f18099k);
        for (int i2 = 0; i2 < this.f18099k; i2++) {
            parcel.writeParcelable(this.f18100l[i2], 0);
        }
    }

    C8302u0(Parcel parcel) {
        int readInt = parcel.readInt();
        this.f18099k = readInt;
        this.f18100l = new C6722k[readInt];
        for (int i = 0; i < this.f18099k; i++) {
            this.f18100l[i] = (C6722k) parcel.readParcelable(C6722k.class.getClassLoader());
        }
    }
}
