package p118g8;

import android.os.Parcel;
import android.os.Parcelable;
import p119g9.C7544l0;
import p119g9.C7570y;

/* renamed from: g8.g */
/* loaded from: classes7.dex */
public final class C7508g extends AbstractC7497b {
    public static final Parcelable.Creator<C7508g> CREATOR = new C7509a();

    /* renamed from: k */
    public final long f16284k;

    /* renamed from: l */
    public final long f16285l;

    /* renamed from: g8.g$a */
    /* loaded from: classes7.dex */
    class C7509a implements Parcelable.Creator<C7508g> {
        C7509a() {
        }

        /* renamed from: a */
        public C7508g createFromParcel(Parcel parcel) {
            return new C7508g(parcel.readLong(), parcel.readLong(), null);
        }

        /* renamed from: b */
        public C7508g[] newArray(int i) {
            return new C7508g[i];
        }
    }

    /* synthetic */ C7508g(long j, long j2, C7509a aVar) {
        this(j, j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C7508g m22375a(C7570y yVar, long j, C7544l0 l0Var) {
        long b = m22374b(yVar, j);
        return new C7508g(b, l0Var.m22264b(b));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static long m22374b(C7570y yVar, long j) {
        long D = yVar.m22029D();
        if ((128 & D) != 0) {
            return 8589934591L & ((((D & 1) << 32) | yVar.m22027F()) + j);
        }
        return -9223372036854775807L;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f16284k);
        parcel.writeLong(this.f16285l);
    }

    private C7508g(long j, long j2) {
        this.f16284k = j;
        this.f16285l = j2;
    }
}
