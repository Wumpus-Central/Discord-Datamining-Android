package p080e8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p119g9.C7557q0;

/* renamed from: e8.f */
/* loaded from: classes7.dex */
public final class C6747f extends AbstractC6753i {
    public static final Parcelable.Creator<C6747f> CREATOR = new C6748a();

    /* renamed from: l */
    public final String f14393l;

    /* renamed from: m */
    public final String f14394m;

    /* renamed from: n */
    public final String f14395n;

    /* renamed from: o */
    public final byte[] f14396o;

    /* renamed from: e8.f$a */
    /* loaded from: classes7.dex */
    class C6748a implements Parcelable.Creator<C6747f> {
        C6748a() {
        }

        /* renamed from: a */
        public C6747f createFromParcel(Parcel parcel) {
            return new C6747f(parcel);
        }

        /* renamed from: b */
        public C6747f[] newArray(int i) {
            return new C6747f[i];
        }
    }

    public C6747f(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f14393l = str;
        this.f14394m = str2;
        this.f14395n = str3;
        this.f14396o = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6747f.class != obj.getClass()) {
            return false;
        }
        C6747f fVar = (C6747f) obj;
        if (!C7557q0.m22159c(this.f14393l, fVar.f14393l) || !C7557q0.m22159c(this.f14394m, fVar.f14394m) || !C7557q0.m22159c(this.f14395n, fVar.f14395n) || !Arrays.equals(this.f14396o, fVar.f14396o)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int i2;
        String str = this.f14393l;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = (527 + i) * 31;
        String str2 = this.f14394m;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        String str3 = this.f14395n;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return ((i5 + i3) * 31) + Arrays.hashCode(this.f14396o);
    }

    @Override // p080e8.AbstractC6753i
    public String toString() {
        return this.f14402k + ": mimeType=" + this.f14393l + ", filename=" + this.f14394m + ", description=" + this.f14395n;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f14393l);
        parcel.writeString(this.f14394m);
        parcel.writeString(this.f14395n);
        parcel.writeByteArray(this.f14396o);
    }

    C6747f(Parcel parcel) {
        super("GEOB");
        this.f14393l = (String) C7557q0.m22145j(parcel.readString());
        this.f14394m = (String) C7557q0.m22145j(parcel.readString());
        this.f14395n = (String) C7557q0.m22145j(parcel.readString());
        this.f14396o = (byte[]) C7557q0.m22145j(parcel.createByteArray());
    }
}
