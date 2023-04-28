package p459z7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;
import p079e7.C6722k;
import p119g9.C7557q0;

/* renamed from: z7.a */
/* loaded from: classes7.dex */
public final class C14576a implements Parcelable {
    public static final Parcelable.Creator<C14576a> CREATOR = new C0475a();

    /* renamed from: k */
    private final AbstractC14577b[] f33047k;

    /* renamed from: z7.a$a */
    /* loaded from: classes7.dex */
    class C0475a implements Parcelable.Creator<C14576a> {
        C0475a() {
        }

        /* renamed from: a */
        public C14576a createFromParcel(Parcel parcel) {
            return new C14576a(parcel);
        }

        /* renamed from: b */
        public C14576a[] newArray(int i) {
            return new C14576a[i];
        }
    }

    /* renamed from: z7.a$b */
    /* loaded from: classes7.dex */
    public interface AbstractC14577b extends Parcelable {
        /* renamed from: Q */
        byte[] mo180Q();

        /* renamed from: g */
        C6722k mo179g();
    }

    public C14576a(AbstractC14577b... bVarArr) {
        this.f33047k = bVarArr;
    }

    /* renamed from: a */
    public C14576a m186a(AbstractC14577b... bVarArr) {
        if (bVarArr.length == 0) {
            return this;
        }
        return new C14576a((AbstractC14577b[]) C7557q0.m22214A0(this.f33047k, bVarArr));
    }

    /* renamed from: b */
    public C14576a m185b(C14576a aVar) {
        return aVar == null ? this : m186a(aVar.f33047k);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public AbstractC14577b m184e(int i) {
        return this.f33047k[i];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C14576a.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f33047k, ((C14576a) obj).f33047k);
    }

    /* renamed from: f */
    public int m183f() {
        return this.f33047k.length;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f33047k);
    }

    public String toString() {
        return "entries=" + Arrays.toString(this.f33047k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f33047k.length);
        for (AbstractC14577b bVar : this.f33047k) {
            parcel.writeParcelable(bVar, 0);
        }
    }

    public C14576a(List<? extends AbstractC14577b> list) {
        this.f33047k = (AbstractC14577b[]) list.toArray(new AbstractC14577b[0]);
    }

    C14576a(Parcel parcel) {
        this.f33047k = new AbstractC14577b[parcel.readInt()];
        int i = 0;
        while (true) {
            AbstractC14577b[] bVarArr = this.f33047k;
            if (i < bVarArr.length) {
                bVarArr[i] = (AbstractC14577b) parcel.readParcelable(AbstractC14577b.class.getClassLoader());
                i++;
            } else {
                return;
            }
        }
    }
}
