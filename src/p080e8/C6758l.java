package p080e8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p119g9.C7557q0;

/* renamed from: e8.l */
/* loaded from: classes7.dex */
public final class C6758l extends AbstractC6753i {
    public static final Parcelable.Creator<C6758l> CREATOR = new C6759a();

    /* renamed from: l */
    public final String f14411l;

    /* renamed from: m */
    public final byte[] f14412m;

    /* renamed from: e8.l$a */
    /* loaded from: classes7.dex */
    class C6759a implements Parcelable.Creator<C6758l> {
        C6759a() {
        }

        /* renamed from: a */
        public C6758l createFromParcel(Parcel parcel) {
            return new C6758l(parcel);
        }

        /* renamed from: b */
        public C6758l[] newArray(int i) {
            return new C6758l[i];
        }
    }

    public C6758l(String str, byte[] bArr) {
        super("PRIV");
        this.f14411l = str;
        this.f14412m = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6758l.class != obj.getClass()) {
            return false;
        }
        C6758l lVar = (C6758l) obj;
        if (!C7557q0.m22159c(this.f14411l, lVar.f14411l) || !Arrays.equals(this.f14412m, lVar.f14412m)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        String str = this.f14411l;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return ((527 + i) * 31) + Arrays.hashCode(this.f14412m);
    }

    @Override // p080e8.AbstractC6753i
    public String toString() {
        return this.f14402k + ": owner=" + this.f14411l;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f14411l);
        parcel.writeByteArray(this.f14412m);
    }

    C6758l(Parcel parcel) {
        super("PRIV");
        this.f14411l = (String) C7557q0.m22145j(parcel.readString());
        this.f14412m = (byte[]) C7557q0.m22145j(parcel.createByteArray());
    }
}
