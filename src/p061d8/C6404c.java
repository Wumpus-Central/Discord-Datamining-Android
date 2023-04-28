package p061d8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p079e7.C6722k;
import p119g9.C7510a;
import p459z7.C14576a;
import p459z7.C14578b;

/* renamed from: d8.c */
/* loaded from: classes7.dex */
public final class C6404c implements C14576a.AbstractC14577b {
    public static final Parcelable.Creator<C6404c> CREATOR = new C6405a();

    /* renamed from: k */
    public final byte[] f13388k;

    /* renamed from: l */
    public final String f13389l;

    /* renamed from: m */
    public final String f13390m;

    /* renamed from: d8.c$a */
    /* loaded from: classes7.dex */
    class C6405a implements Parcelable.Creator<C6404c> {
        C6405a() {
        }

        /* renamed from: a */
        public C6404c createFromParcel(Parcel parcel) {
            return new C6404c(parcel);
        }

        /* renamed from: b */
        public C6404c[] newArray(int i) {
            return new C6404c[i];
        }
    }

    public C6404c(byte[] bArr, String str, String str2) {
        this.f13388k = bArr;
        this.f13389l = str;
        this.f13390m = str2;
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
        if (obj == null || C6404c.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f13388k, ((C6404c) obj).f13388k);
    }

    @Override // p459z7.C14576a.AbstractC14577b
    /* renamed from: g */
    public /* synthetic */ C6722k mo179g() {
        return C14578b.m177b(this);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f13388k);
    }

    public String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.f13389l, this.f13390m, Integer.valueOf(this.f13388k.length));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.f13388k);
        parcel.writeString(this.f13389l);
        parcel.writeString(this.f13390m);
    }

    C6404c(Parcel parcel) {
        this.f13388k = (byte[]) C7510a.m22367e(parcel.createByteArray());
        this.f13389l = parcel.readString();
        this.f13390m = parcel.readString();
    }
}
