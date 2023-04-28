package p080e8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p119g9.C7557q0;

/* renamed from: e8.a */
/* loaded from: classes7.dex */
public final class C6738a extends AbstractC6753i {
    public static final Parcelable.Creator<C6738a> CREATOR = new C0204a();

    /* renamed from: l */
    public final String f14374l;

    /* renamed from: m */
    public final String f14375m;

    /* renamed from: n */
    public final int f14376n;

    /* renamed from: o */
    public final byte[] f14377o;

    /* renamed from: e8.a$a */
    /* loaded from: classes7.dex */
    class C0204a implements Parcelable.Creator<C6738a> {
        C0204a() {
        }

        /* renamed from: a */
        public C6738a createFromParcel(Parcel parcel) {
            return new C6738a(parcel);
        }

        /* renamed from: b */
        public C6738a[] newArray(int i) {
            return new C6738a[i];
        }
    }

    public C6738a(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.f14374l = str;
        this.f14375m = str2;
        this.f14376n = i;
        this.f14377o = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6738a.class != obj.getClass()) {
            return false;
        }
        C6738a aVar = (C6738a) obj;
        if (this.f14376n != aVar.f14376n || !C7557q0.m22159c(this.f14374l, aVar.f14374l) || !C7557q0.m22159c(this.f14375m, aVar.f14375m) || !Arrays.equals(this.f14377o, aVar.f14377o)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int i2 = (527 + this.f14376n) * 31;
        String str = this.f14374l;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = (i2 + i) * 31;
        String str2 = this.f14375m;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return ((i4 + i3) * 31) + Arrays.hashCode(this.f14377o);
    }

    @Override // p080e8.AbstractC6753i
    public String toString() {
        return this.f14402k + ": mimeType=" + this.f14374l + ", description=" + this.f14375m;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f14374l);
        parcel.writeString(this.f14375m);
        parcel.writeInt(this.f14376n);
        parcel.writeByteArray(this.f14377o);
    }

    C6738a(Parcel parcel) {
        super("APIC");
        this.f14374l = (String) C7557q0.m22145j(parcel.readString());
        this.f14375m = parcel.readString();
        this.f14376n = parcel.readInt();
        this.f14377o = (byte[]) C7557q0.m22145j(parcel.createByteArray());
    }
}
