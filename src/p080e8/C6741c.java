package p080e8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p119g9.C7557q0;

/* renamed from: e8.c */
/* loaded from: classes7.dex */
public final class C6741c extends AbstractC6753i {
    public static final Parcelable.Creator<C6741c> CREATOR = new C6742a();

    /* renamed from: l */
    public final String f14379l;

    /* renamed from: m */
    public final int f14380m;

    /* renamed from: n */
    public final int f14381n;

    /* renamed from: o */
    public final long f14382o;

    /* renamed from: p */
    public final long f14383p;

    /* renamed from: q */
    private final AbstractC6753i[] f14384q;

    /* renamed from: e8.c$a */
    /* loaded from: classes7.dex */
    class C6742a implements Parcelable.Creator<C6741c> {
        C6742a() {
        }

        /* renamed from: a */
        public C6741c createFromParcel(Parcel parcel) {
            return new C6741c(parcel);
        }

        /* renamed from: b */
        public C6741c[] newArray(int i) {
            return new C6741c[i];
        }
    }

    public C6741c(String str, int i, int i2, long j, long j2, AbstractC6753i[] iVarArr) {
        super("CHAP");
        this.f14379l = str;
        this.f14380m = i;
        this.f14381n = i2;
        this.f14382o = j;
        this.f14383p = j2;
        this.f14384q = iVarArr;
    }

    @Override // p080e8.AbstractC6753i, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6741c.class != obj.getClass()) {
            return false;
        }
        C6741c cVar = (C6741c) obj;
        if (this.f14380m == cVar.f14380m && this.f14381n == cVar.f14381n && this.f14382o == cVar.f14382o && this.f14383p == cVar.f14383p && C7557q0.m22159c(this.f14379l, cVar.f14379l) && Arrays.equals(this.f14384q, cVar.f14384q)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = (((((((527 + this.f14380m) * 31) + this.f14381n) * 31) + ((int) this.f14382o)) * 31) + ((int) this.f14383p)) * 31;
        String str = this.f14379l;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return i2 + i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f14379l);
        parcel.writeInt(this.f14380m);
        parcel.writeInt(this.f14381n);
        parcel.writeLong(this.f14382o);
        parcel.writeLong(this.f14383p);
        parcel.writeInt(this.f14384q.length);
        for (AbstractC6753i iVar : this.f14384q) {
            parcel.writeParcelable(iVar, 0);
        }
    }

    C6741c(Parcel parcel) {
        super("CHAP");
        this.f14379l = (String) C7557q0.m22145j(parcel.readString());
        this.f14380m = parcel.readInt();
        this.f14381n = parcel.readInt();
        this.f14382o = parcel.readLong();
        this.f14383p = parcel.readLong();
        int readInt = parcel.readInt();
        this.f14384q = new AbstractC6753i[readInt];
        for (int i = 0; i < readInt; i++) {
            this.f14384q[i] = (AbstractC6753i) parcel.readParcelable(AbstractC6753i.class.getClassLoader());
        }
    }
}
