package p244n8;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p079e7.C6722k;
import p459z7.C14576a;
import p459z7.C14578b;

/* renamed from: n8.r */
/* loaded from: classes7.dex */
public final class C10753r implements C14576a.AbstractC14577b {
    public static final Parcelable.Creator<C10753r> CREATOR = new C10754a();

    /* renamed from: k */
    public final String f23900k;

    /* renamed from: l */
    public final String f23901l;

    /* renamed from: m */
    public final List<C10755b> f23902m;

    /* renamed from: n8.r$a */
    /* loaded from: classes7.dex */
    class C10754a implements Parcelable.Creator<C10753r> {
        C10754a() {
        }

        /* renamed from: a */
        public C10753r createFromParcel(Parcel parcel) {
            return new C10753r(parcel);
        }

        /* renamed from: b */
        public C10753r[] newArray(int i) {
            return new C10753r[i];
        }
    }

    public C10753r(String str, String str2, List<C10755b> list) {
        this.f23900k = str;
        this.f23901l = str2;
        this.f23902m = Collections.unmodifiableList(new ArrayList(list));
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
        if (obj == null || C10753r.class != obj.getClass()) {
            return false;
        }
        C10753r rVar = (C10753r) obj;
        if (!TextUtils.equals(this.f23900k, rVar.f23900k) || !TextUtils.equals(this.f23901l, rVar.f23901l) || !this.f23902m.equals(rVar.f23902m)) {
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
        String str = this.f23900k;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        String str2 = this.f23901l;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return ((i3 + i2) * 31) + this.f23902m.hashCode();
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("HlsTrackMetadataEntry");
        if (this.f23900k != null) {
            str = " [" + this.f23900k + ", " + this.f23901l + "]";
        } else {
            str = "";
        }
        sb2.append(str);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f23900k);
        parcel.writeString(this.f23901l);
        int size = this.f23902m.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeParcelable(this.f23902m.get(i2), 0);
        }
    }

    C10753r(Parcel parcel) {
        this.f23900k = parcel.readString();
        this.f23901l = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add((C10755b) parcel.readParcelable(C10755b.class.getClassLoader()));
        }
        this.f23902m = Collections.unmodifiableList(arrayList);
    }

    /* renamed from: n8.r$b */
    /* loaded from: classes7.dex */
    public static final class C10755b implements Parcelable {
        public static final Parcelable.Creator<C10755b> CREATOR = new C10756a();

        /* renamed from: k */
        public final int f23903k;

        /* renamed from: l */
        public final int f23904l;

        /* renamed from: m */
        public final String f23905m;

        /* renamed from: n */
        public final String f23906n;

        /* renamed from: o */
        public final String f23907o;

        /* renamed from: p */
        public final String f23908p;

        /* renamed from: n8.r$b$a */
        /* loaded from: classes7.dex */
        class C10756a implements Parcelable.Creator<C10755b> {
            C10756a() {
            }

            /* renamed from: a */
            public C10755b createFromParcel(Parcel parcel) {
                return new C10755b(parcel);
            }

            /* renamed from: b */
            public C10755b[] newArray(int i) {
                return new C10755b[i];
            }
        }

        public C10755b(int i, int i2, String str, String str2, String str3, String str4) {
            this.f23903k = i;
            this.f23904l = i2;
            this.f23905m = str;
            this.f23906n = str2;
            this.f23907o = str3;
            this.f23908p = str4;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C10755b.class != obj.getClass()) {
                return false;
            }
            C10755b bVar = (C10755b) obj;
            if (this.f23903k != bVar.f23903k || this.f23904l != bVar.f23904l || !TextUtils.equals(this.f23905m, bVar.f23905m) || !TextUtils.equals(this.f23906n, bVar.f23906n) || !TextUtils.equals(this.f23907o, bVar.f23907o) || !TextUtils.equals(this.f23908p, bVar.f23908p)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i;
            int i2;
            int i3;
            int i4 = ((this.f23903k * 31) + this.f23904l) * 31;
            String str = this.f23905m;
            int i5 = 0;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            int i6 = (i4 + i) * 31;
            String str2 = this.f23906n;
            if (str2 != null) {
                i2 = str2.hashCode();
            } else {
                i2 = 0;
            }
            int i7 = (i6 + i2) * 31;
            String str3 = this.f23907o;
            if (str3 != null) {
                i3 = str3.hashCode();
            } else {
                i3 = 0;
            }
            int i8 = (i7 + i3) * 31;
            String str4 = this.f23908p;
            if (str4 != null) {
                i5 = str4.hashCode();
            }
            return i8 + i5;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f23903k);
            parcel.writeInt(this.f23904l);
            parcel.writeString(this.f23905m);
            parcel.writeString(this.f23906n);
            parcel.writeString(this.f23907o);
            parcel.writeString(this.f23908p);
        }

        C10755b(Parcel parcel) {
            this.f23903k = parcel.readInt();
            this.f23904l = parcel.readInt();
            this.f23905m = parcel.readString();
            this.f23906n = parcel.readString();
            this.f23907o = parcel.readString();
            this.f23908p = parcel.readString();
        }
    }
}
