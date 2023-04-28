package p080e8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p119g9.C7557q0;

/* renamed from: e8.d */
/* loaded from: classes7.dex */
public final class C6743d extends AbstractC6753i {
    public static final Parcelable.Creator<C6743d> CREATOR = new C6744a();

    /* renamed from: l */
    public final String f14385l;

    /* renamed from: m */
    public final boolean f14386m;

    /* renamed from: n */
    public final boolean f14387n;

    /* renamed from: o */
    public final String[] f14388o;

    /* renamed from: p */
    private final AbstractC6753i[] f14389p;

    /* renamed from: e8.d$a */
    /* loaded from: classes7.dex */
    class C6744a implements Parcelable.Creator<C6743d> {
        C6744a() {
        }

        /* renamed from: a */
        public C6743d createFromParcel(Parcel parcel) {
            return new C6743d(parcel);
        }

        /* renamed from: b */
        public C6743d[] newArray(int i) {
            return new C6743d[i];
        }
    }

    public C6743d(String str, boolean z, boolean z2, String[] strArr, AbstractC6753i[] iVarArr) {
        super("CTOC");
        this.f14385l = str;
        this.f14386m = z;
        this.f14387n = z2;
        this.f14388o = strArr;
        this.f14389p = iVarArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6743d.class != obj.getClass()) {
            return false;
        }
        C6743d dVar = (C6743d) obj;
        if (this.f14386m != dVar.f14386m || this.f14387n != dVar.f14387n || !C7557q0.m22159c(this.f14385l, dVar.f14385l) || !Arrays.equals(this.f14388o, dVar.f14388o) || !Arrays.equals(this.f14389p, dVar.f14389p)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int i2 = (((527 + (this.f14386m ? 1 : 0)) * 31) + (this.f14387n ? 1 : 0)) * 31;
        String str = this.f14385l;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return i2 + i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f14385l);
        parcel.writeByte(this.f14386m ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f14387n ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f14388o);
        parcel.writeInt(this.f14389p.length);
        for (AbstractC6753i iVar : this.f14389p) {
            parcel.writeParcelable(iVar, 0);
        }
    }

    C6743d(Parcel parcel) {
        super("CTOC");
        this.f14385l = (String) C7557q0.m22145j(parcel.readString());
        boolean z = true;
        this.f14386m = parcel.readByte() != 0;
        this.f14387n = parcel.readByte() == 0 ? false : z;
        this.f14388o = (String[]) C7557q0.m22145j(parcel.createStringArray());
        int readInt = parcel.readInt();
        this.f14389p = new AbstractC6753i[readInt];
        for (int i = 0; i < readInt; i++) {
            this.f14389p[i] = (AbstractC6753i) parcel.readParcelable(AbstractC6753i.class.getClassLoader());
        }
    }
}
