package p080e8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p119g9.C7557q0;

/* renamed from: e8.b */
/* loaded from: classes7.dex */
public final class C6739b extends AbstractC6753i {
    public static final Parcelable.Creator<C6739b> CREATOR = new C6740a();

    /* renamed from: l */
    public final byte[] f14378l;

    /* renamed from: e8.b$a */
    /* loaded from: classes7.dex */
    class C6740a implements Parcelable.Creator<C6739b> {
        C6740a() {
        }

        /* renamed from: a */
        public C6739b createFromParcel(Parcel parcel) {
            return new C6739b(parcel);
        }

        /* renamed from: b */
        public C6739b[] newArray(int i) {
            return new C6739b[i];
        }
    }

    public C6739b(String str, byte[] bArr) {
        super(str);
        this.f14378l = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6739b.class != obj.getClass()) {
            return false;
        }
        C6739b bVar = (C6739b) obj;
        if (!this.f14402k.equals(bVar.f14402k) || !Arrays.equals(this.f14378l, bVar.f14378l)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((527 + this.f14402k.hashCode()) * 31) + Arrays.hashCode(this.f14378l);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f14402k);
        parcel.writeByteArray(this.f14378l);
    }

    C6739b(Parcel parcel) {
        super((String) C7557q0.m22145j(parcel.readString()));
        this.f14378l = (byte[]) C7557q0.m22145j(parcel.createByteArray());
    }
}
