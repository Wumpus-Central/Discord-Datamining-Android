package p118g8;

import android.os.Parcel;
import android.os.Parcelable;
import p119g9.C7557q0;
import p119g9.C7570y;

/* renamed from: g8.a */
/* loaded from: classes7.dex */
public final class C7496a extends AbstractC7497b {
    public static final Parcelable.Creator<C7496a> CREATOR = new C0233a();

    /* renamed from: k */
    public final long f16248k;

    /* renamed from: l */
    public final long f16249l;

    /* renamed from: m */
    public final byte[] f16250m;

    /* renamed from: g8.a$a */
    /* loaded from: classes7.dex */
    class C0233a implements Parcelable.Creator<C7496a> {
        C0233a() {
        }

        /* renamed from: a */
        public C7496a createFromParcel(Parcel parcel) {
            return new C7496a(parcel, null);
        }

        /* renamed from: b */
        public C7496a[] newArray(int i) {
            return new C7496a[i];
        }
    }

    /* synthetic */ C7496a(Parcel parcel, C0233a aVar) {
        this(parcel);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C7496a m22398a(C7570y yVar, int i, long j) {
        long F = yVar.m22027F();
        int i2 = i - 4;
        byte[] bArr = new byte[i2];
        yVar.m22006j(bArr, 0, i2);
        return new C7496a(F, bArr, j);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f16248k);
        parcel.writeLong(this.f16249l);
        parcel.writeByteArray(this.f16250m);
    }

    private C7496a(long j, byte[] bArr, long j2) {
        this.f16248k = j2;
        this.f16249l = j;
        this.f16250m = bArr;
    }

    private C7496a(Parcel parcel) {
        this.f16248k = parcel.readLong();
        this.f16249l = parcel.readLong();
        this.f16250m = (byte[]) C7557q0.m22145j(parcel.createByteArray());
    }
}
