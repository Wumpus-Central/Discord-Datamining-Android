package p193k7;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import p079e7.C6713c;
import p119g9.C7510a;
import p119g9.C7557q0;

/* renamed from: k7.l */
/* loaded from: classes7.dex */
public final class C9798l implements Comparator<C9800b>, Parcelable {
    public static final Parcelable.Creator<C9798l> CREATOR = new C9799a();

    /* renamed from: k */
    private final C9800b[] f21831k;

    /* renamed from: l */
    private int f21832l;

    /* renamed from: m */
    public final String f21833m;

    /* renamed from: n */
    public final int f21834n;

    /* renamed from: k7.l$a */
    /* loaded from: classes7.dex */
    class C9799a implements Parcelable.Creator<C9798l> {
        C9799a() {
        }

        /* renamed from: a */
        public C9798l createFromParcel(Parcel parcel) {
            return new C9798l(parcel);
        }

        /* renamed from: b */
        public C9798l[] newArray(int i) {
            return new C9798l[i];
        }
    }

    /* renamed from: k7.l$b */
    /* loaded from: classes7.dex */
    public static final class C9800b implements Parcelable {
        public static final Parcelable.Creator<C9800b> CREATOR = new C9801a();

        /* renamed from: k */
        private int f21835k;

        /* renamed from: l */
        public final UUID f21836l;

        /* renamed from: m */
        public final String f21837m;

        /* renamed from: n */
        public final String f21838n;

        /* renamed from: o */
        public final byte[] f21839o;

        /* renamed from: k7.l$b$a */
        /* loaded from: classes7.dex */
        class C9801a implements Parcelable.Creator<C9800b> {
            C9801a() {
            }

            /* renamed from: a */
            public C9800b createFromParcel(Parcel parcel) {
                return new C9800b(parcel);
            }

            /* renamed from: b */
            public C9800b[] newArray(int i) {
                return new C9800b[i];
            }
        }

        public C9800b(UUID uuid, String str, byte[] bArr) {
            this(uuid, null, str, bArr);
        }

        /* renamed from: a */
        public boolean m15323a(C9800b bVar) {
            return m15321e() && !bVar.m15321e() && m15320f(bVar.f21836l);
        }

        /* renamed from: b */
        public C9800b m15322b(byte[] bArr) {
            return new C9800b(this.f21836l, this.f21837m, this.f21838n, bArr);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* renamed from: e */
        public boolean m15321e() {
            return this.f21839o != null;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C9800b)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            C9800b bVar = (C9800b) obj;
            if (!C7557q0.m22159c(this.f21837m, bVar.f21837m) || !C7557q0.m22159c(this.f21838n, bVar.f21838n) || !C7557q0.m22159c(this.f21836l, bVar.f21836l) || !Arrays.equals(this.f21839o, bVar.f21839o)) {
                return false;
            }
            return true;
        }

        /* renamed from: f */
        public boolean m15320f(UUID uuid) {
            return C6713c.f14277a.equals(this.f21836l) || uuid.equals(this.f21836l);
        }

        public int hashCode() {
            int i;
            if (this.f21835k == 0) {
                int hashCode = this.f21836l.hashCode() * 31;
                String str = this.f21837m;
                if (str == null) {
                    i = 0;
                } else {
                    i = str.hashCode();
                }
                this.f21835k = ((((hashCode + i) * 31) + this.f21838n.hashCode()) * 31) + Arrays.hashCode(this.f21839o);
            }
            return this.f21835k;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f21836l.getMostSignificantBits());
            parcel.writeLong(this.f21836l.getLeastSignificantBits());
            parcel.writeString(this.f21837m);
            parcel.writeString(this.f21838n);
            parcel.writeByteArray(this.f21839o);
        }

        public C9800b(UUID uuid, String str, String str2, byte[] bArr) {
            this.f21836l = (UUID) C7510a.m22367e(uuid);
            this.f21837m = str;
            this.f21838n = (String) C7510a.m22367e(str2);
            this.f21839o = bArr;
        }

        C9800b(Parcel parcel) {
            this.f21836l = new UUID(parcel.readLong(), parcel.readLong());
            this.f21837m = parcel.readString();
            this.f21838n = (String) C7557q0.m22145j(parcel.readString());
            this.f21839o = parcel.createByteArray();
        }
    }

    public C9798l(List<C9800b> list) {
        this(null, false, (C9800b[]) list.toArray(new C9800b[0]));
    }

    /* renamed from: H */
    public static C9798l m15330H(C9798l lVar, C9798l lVar2) {
        String str;
        C9800b[] bVarArr;
        C9800b[] bVarArr2;
        ArrayList arrayList = new ArrayList();
        if (lVar != null) {
            str = lVar.f21833m;
            for (C9800b bVar : lVar.f21831k) {
                if (bVar.m15321e()) {
                    arrayList.add(bVar);
                }
            }
        } else {
            str = null;
        }
        if (lVar2 != null) {
            if (str == null) {
                str = lVar2.f21833m;
            }
            int size = arrayList.size();
            for (C9800b bVar2 : lVar2.f21831k) {
                if (bVar2.m15321e() && !m15326w(arrayList, size, bVar2.f21836l)) {
                    arrayList.add(bVar2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C9798l(str, arrayList);
    }

    /* renamed from: w */
    private static boolean m15326w(ArrayList<C9800b> arrayList, int i, UUID uuid) {
        for (int i2 = 0; i2 < i; i2++) {
            if (arrayList.get(i2).f21836l.equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: A */
    public C9798l m15331A(String str) {
        if (C7557q0.m22159c(this.f21833m, str)) {
            return this;
        }
        return new C9798l(str, false, this.f21831k);
    }

    /* renamed from: O */
    public C9800b m15329O(int i) {
        return this.f21831k[i];
    }

    /* renamed from: P */
    public C9798l m15328P(C9798l lVar) {
        boolean z;
        String str;
        String str2 = this.f21833m;
        if (str2 == null || (str = lVar.f21833m) == null || TextUtils.equals(str2, str)) {
            z = true;
        } else {
            z = false;
        }
        C7510a.m22366f(z);
        String str3 = this.f21833m;
        if (str3 == null) {
            str3 = lVar.f21833m;
        }
        return new C9798l(str3, (C9800b[]) C7557q0.m22214A0(this.f21831k, lVar.f21831k));
    }

    /* renamed from: b */
    public int compare(C9800b bVar, C9800b bVar2) {
        UUID uuid = C6713c.f14277a;
        if (!uuid.equals(bVar.f21836l)) {
            return bVar.f21836l.compareTo(bVar2.f21836l);
        }
        if (uuid.equals(bVar2.f21836l)) {
            return 0;
        }
        return 1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9798l.class != obj.getClass()) {
            return false;
        }
        C9798l lVar = (C9798l) obj;
        if (!C7557q0.m22159c(this.f21833m, lVar.f21833m) || !Arrays.equals(this.f21831k, lVar.f21831k)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        if (this.f21832l == 0) {
            String str = this.f21833m;
            if (str == null) {
                i = 0;
            } else {
                i = str.hashCode();
            }
            this.f21832l = (i * 31) + Arrays.hashCode(this.f21831k);
        }
        return this.f21832l;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f21833m);
        parcel.writeTypedArray(this.f21831k, 0);
    }

    public C9798l(String str, List<C9800b> list) {
        this(str, false, (C9800b[]) list.toArray(new C9800b[0]));
    }

    public C9798l(C9800b... bVarArr) {
        this((String) null, bVarArr);
    }

    public C9798l(String str, C9800b... bVarArr) {
        this(str, true, bVarArr);
    }

    private C9798l(String str, boolean z, C9800b... bVarArr) {
        this.f21833m = str;
        bVarArr = z ? (C9800b[]) bVarArr.clone() : bVarArr;
        this.f21831k = bVarArr;
        this.f21834n = bVarArr.length;
        Arrays.sort(bVarArr, this);
    }

    C9798l(Parcel parcel) {
        this.f21833m = parcel.readString();
        C9800b[] bVarArr = (C9800b[]) C7557q0.m22145j((C9800b[]) parcel.createTypedArray(C9800b.CREATOR));
        this.f21831k = bVarArr;
        this.f21834n = bVarArr.length;
    }
}
