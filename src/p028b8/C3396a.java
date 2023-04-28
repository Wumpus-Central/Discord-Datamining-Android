package p028b8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p079e7.C6722k;
import p119g9.C7557q0;
import p459z7.C14576a;

/* renamed from: b8.a */
/* loaded from: classes7.dex */
public final class C3396a implements C14576a.AbstractC14577b {

    /* renamed from: k */
    public final String f5428k;

    /* renamed from: l */
    public final String f5429l;

    /* renamed from: m */
    public final long f5430m;

    /* renamed from: n */
    public final long f5431n;

    /* renamed from: o */
    public final byte[] f5432o;

    /* renamed from: p */
    private int f5433p;

    /* renamed from: q */
    private static final C6722k f5426q = new C6722k.C6724b().m24488e0("application/id3").m24519E();

    /* renamed from: r */
    private static final C6722k f5427r = new C6722k.C6724b().m24488e0("application/x-scte35").m24519E();
    public static final Parcelable.Creator<C3396a> CREATOR = new C0078a();

    /* renamed from: b8.a$a */
    /* loaded from: classes7.dex */
    class C0078a implements Parcelable.Creator<C3396a> {
        C0078a() {
        }

        /* renamed from: a */
        public C3396a createFromParcel(Parcel parcel) {
            return new C3396a(parcel);
        }

        /* renamed from: b */
        public C3396a[] newArray(int i) {
            return new C3396a[i];
        }
    }

    public C3396a(String str, String str2, long j, long j2, byte[] bArr) {
        this.f5428k = str;
        this.f5429l = str2;
        this.f5430m = j;
        this.f5431n = j2;
        this.f5432o = bArr;
    }

    @Override // p459z7.C14576a.AbstractC14577b
    /* renamed from: Q */
    public byte[] mo180Q() {
        if (mo179g() != null) {
            return this.f5432o;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3396a.class != obj.getClass()) {
            return false;
        }
        C3396a aVar = (C3396a) obj;
        if (this.f5430m != aVar.f5430m || this.f5431n != aVar.f5431n || !C7557q0.m22159c(this.f5428k, aVar.f5428k) || !C7557q0.m22159c(this.f5429l, aVar.f5429l) || !Arrays.equals(this.f5432o, aVar.f5432o)) {
            return false;
        }
        return true;
    }

    @Override // p459z7.C14576a.AbstractC14577b
    /* renamed from: g */
    public C6722k mo179g() {
        String str = this.f5428k;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1468477611:
                if (str.equals("urn:scte:scte35:2014:bin")) {
                    c = 0;
                    break;
                }
                break;
            case -795945609:
                if (str.equals("https://aomedia.org/emsg/ID3")) {
                    c = 1;
                    break;
                }
                break;
            case 1303648457:
                if (str.equals("https://developer.apple.com/streaming/emsg-id3")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return f5427r;
            case 1:
            case 2:
                return f5426q;
            default:
                return null;
        }
    }

    public int hashCode() {
        int i;
        if (this.f5433p == 0) {
            String str = this.f5428k;
            int i2 = 0;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            int i3 = (527 + i) * 31;
            String str2 = this.f5429l;
            if (str2 != null) {
                i2 = str2.hashCode();
            }
            long j = this.f5430m;
            long j2 = this.f5431n;
            this.f5433p = ((((((i3 + i2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + Arrays.hashCode(this.f5432o);
        }
        return this.f5433p;
    }

    public String toString() {
        return "EMSG: scheme=" + this.f5428k + ", id=" + this.f5431n + ", durationMs=" + this.f5430m + ", value=" + this.f5429l;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f5428k);
        parcel.writeString(this.f5429l);
        parcel.writeLong(this.f5430m);
        parcel.writeLong(this.f5431n);
        parcel.writeByteArray(this.f5432o);
    }

    C3396a(Parcel parcel) {
        this.f5428k = (String) C7557q0.m22145j(parcel.readString());
        this.f5429l = (String) C7557q0.m22145j(parcel.readString());
        this.f5430m = parcel.readLong();
        this.f5431n = parcel.readLong();
        this.f5432o = (byte[]) C7557q0.m22145j(parcel.createByteArray());
    }
}
