package p319ra;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.util.Arrays;
import p420x9.C13996n;
import p441y9.AbstractC14320a;
import p441y9.C14323c;

/* renamed from: ra.p0 */
/* loaded from: classes3.dex */
public final class C12531p0 extends AbstractC14320a {
    public static final Parcelable.Creator<C12531p0> CREATOR = new C12533q0();

    /* renamed from: k */
    private long f28194k;

    /* renamed from: l */
    private int f28195l;

    /* renamed from: m */
    private byte[] f28196m;

    /* renamed from: n */
    private ParcelFileDescriptor f28197n;

    /* renamed from: o */
    private String f28198o;

    /* renamed from: p */
    private long f28199p;

    /* renamed from: q */
    private ParcelFileDescriptor f28200q;

    /* renamed from: r */
    private Uri f28201r;

    /* renamed from: s */
    private long f28202s;

    /* renamed from: t */
    private boolean f28203t;

    /* renamed from: u */
    private C12525m0 f28204u;

    /* renamed from: v */
    private long f28205v;

    /* renamed from: w */
    private String f28206w;

    /* renamed from: x */
    private String f28207x;

    private C12531p0() {
        this.f28199p = -1L;
        this.f28202s = 0L;
        this.f28203t = false;
        this.f28205v = 0L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C12531p0) {
            C12531p0 p0Var = (C12531p0) obj;
            if (C13996n.m2071b(Long.valueOf(this.f28194k), Long.valueOf(p0Var.f28194k)) && C13996n.m2071b(Integer.valueOf(this.f28195l), Integer.valueOf(p0Var.f28195l)) && Arrays.equals(this.f28196m, p0Var.f28196m) && C13996n.m2071b(this.f28197n, p0Var.f28197n) && C13996n.m2071b(this.f28198o, p0Var.f28198o) && C13996n.m2071b(Long.valueOf(this.f28199p), Long.valueOf(p0Var.f28199p)) && C13996n.m2071b(this.f28200q, p0Var.f28200q) && C13996n.m2071b(this.f28201r, p0Var.f28201r) && C13996n.m2071b(Long.valueOf(this.f28202s), Long.valueOf(p0Var.f28202s)) && C13996n.m2071b(Boolean.valueOf(this.f28203t), Boolean.valueOf(p0Var.f28203t)) && C13996n.m2071b(this.f28204u, p0Var.f28204u) && C13996n.m2071b(Long.valueOf(this.f28205v), Long.valueOf(p0Var.f28205v)) && C13996n.m2071b(this.f28206w, p0Var.f28206w) && C13996n.m2071b(this.f28207x, p0Var.f28207x)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C13996n.m2070c(Long.valueOf(this.f28194k), Integer.valueOf(this.f28195l), Integer.valueOf(Arrays.hashCode(this.f28196m)), this.f28197n, this.f28198o, Long.valueOf(this.f28199p), this.f28200q, this.f28201r, Long.valueOf(this.f28202s), Boolean.valueOf(this.f28203t), this.f28204u, Long.valueOf(this.f28205v), this.f28206w, this.f28207x);
    }

    /* renamed from: p */
    public final ParcelFileDescriptor m6582p() {
        return this.f28197n;
    }

    /* renamed from: r */
    public final ParcelFileDescriptor m6581r() {
        return this.f28200q;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C14323c.m857a(parcel);
        C14323c.m845m(parcel, 1, this.f28194k);
        C14323c.m848j(parcel, 2, this.f28195l);
        C14323c.m852f(parcel, 3, this.f28196m, false);
        C14323c.m844n(parcel, 4, this.f28197n, i, false);
        C14323c.m842p(parcel, 5, this.f28198o, false);
        C14323c.m845m(parcel, 6, this.f28199p);
        C14323c.m844n(parcel, 7, this.f28200q, i, false);
        C14323c.m844n(parcel, 8, this.f28201r, i, false);
        C14323c.m845m(parcel, 9, this.f28202s);
        C14323c.m855c(parcel, 10, this.f28203t);
        C14323c.m844n(parcel, 11, this.f28204u, i, false);
        C14323c.m845m(parcel, 12, this.f28205v);
        C14323c.m842p(parcel, 13, this.f28206w, false);
        C14323c.m842p(parcel, 14, this.f28207x, false);
        C14323c.m856b(parcel, a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12531p0(long j, int i, byte[] bArr, ParcelFileDescriptor parcelFileDescriptor, String str, long j2, ParcelFileDescriptor parcelFileDescriptor2, Uri uri, long j3, boolean z, C12525m0 m0Var, long j4, String str2, String str3) {
        this.f28194k = j;
        this.f28195l = i;
        this.f28196m = bArr;
        this.f28197n = parcelFileDescriptor;
        this.f28198o = str;
        this.f28199p = j2;
        this.f28200q = parcelFileDescriptor2;
        this.f28201r = uri;
        this.f28202s = j3;
        this.f28203t = z;
        this.f28204u = m0Var;
        this.f28205v = j4;
        this.f28206w = str2;
        this.f28207x = str3;
    }
}
