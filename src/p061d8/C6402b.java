package p061d8;

import android.os.Parcel;
import android.os.Parcelable;
import p079e7.C6722k;
import p119g9.C7510a;
import p119g9.C7557q0;
import p459z7.C14576a;
import p459z7.C14578b;

/* renamed from: d8.b */
/* loaded from: classes7.dex */
public final class C6402b implements C14576a.AbstractC14577b {
    public static final Parcelable.Creator<C6402b> CREATOR = new C6403a();

    /* renamed from: k */
    public final int f13382k;

    /* renamed from: l */
    public final String f13383l;

    /* renamed from: m */
    public final String f13384m;

    /* renamed from: n */
    public final String f13385n;

    /* renamed from: o */
    public final boolean f13386o;

    /* renamed from: p */
    public final int f13387p;

    /* renamed from: d8.b$a */
    /* loaded from: classes7.dex */
    class C6403a implements Parcelable.Creator<C6402b> {
        C6403a() {
        }

        /* renamed from: a */
        public C6402b createFromParcel(Parcel parcel) {
            return new C6402b(parcel);
        }

        /* renamed from: b */
        public C6402b[] newArray(int i) {
            return new C6402b[i];
        }
    }

    public C6402b(int i, String str, String str2, String str3, boolean z, int i2) {
        C7510a.m22371a(i2 == -1 || i2 > 0);
        this.f13382k = i;
        this.f13383l = str;
        this.f13384m = str2;
        this.f13385n = str3;
        this.f13386o = z;
        this.f13387p = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p061d8.C6402b m25615a(java.util.Map<java.lang.String, java.util.List<java.lang.String>> r13) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p061d8.C6402b.m25615a(java.util.Map):d8.b");
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
        if (obj == null || C6402b.class != obj.getClass()) {
            return false;
        }
        C6402b bVar = (C6402b) obj;
        if (this.f13382k != bVar.f13382k || !C7557q0.m22159c(this.f13383l, bVar.f13383l) || !C7557q0.m22159c(this.f13384m, bVar.f13384m) || !C7557q0.m22159c(this.f13385n, bVar.f13385n) || this.f13386o != bVar.f13386o || this.f13387p != bVar.f13387p) {
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
        int i;
        int i2;
        int i3 = (527 + this.f13382k) * 31;
        String str = this.f13383l;
        int i4 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i5 = (i3 + i) * 31;
        String str2 = this.f13384m;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        String str3 = this.f13385n;
        if (str3 != null) {
            i4 = str3.hashCode();
        }
        return ((((i6 + i4) * 31) + (this.f13386o ? 1 : 0)) * 31) + this.f13387p;
    }

    public String toString() {
        return "IcyHeaders: name=\"" + this.f13384m + "\", genre=\"" + this.f13383l + "\", bitrate=" + this.f13382k + ", metadataInterval=" + this.f13387p;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f13382k);
        parcel.writeString(this.f13383l);
        parcel.writeString(this.f13384m);
        parcel.writeString(this.f13385n);
        C7557q0.m22164Z0(parcel, this.f13386o);
        parcel.writeInt(this.f13387p);
    }

    C6402b(Parcel parcel) {
        this.f13382k = parcel.readInt();
        this.f13383l = parcel.readString();
        this.f13384m = parcel.readString();
        this.f13385n = parcel.readString();
        this.f13386o = C7557q0.m22202G0(parcel);
        this.f13387p = parcel.readInt();
    }
}
