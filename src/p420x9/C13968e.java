package p420x9;

import android.os.Parcel;
import android.os.Parcelable;
import p441y9.AbstractC14320a;
import p441y9.C14323c;

/* renamed from: x9.e */
/* loaded from: classes5.dex */
public class C13968e extends AbstractC14320a {
    public static final Parcelable.Creator<C13968e> CREATOR = new C13976g1();

    /* renamed from: k */
    private final C14010r f31500k;

    /* renamed from: l */
    private final boolean f31501l;

    /* renamed from: m */
    private final boolean f31502m;

    /* renamed from: n */
    private final int[] f31503n;

    /* renamed from: o */
    private final int f31504o;

    /* renamed from: p */
    private final int[] f31505p;

    public C13968e(C14010r rVar, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.f31500k = rVar;
        this.f31501l = z;
        this.f31502m = z2;
        this.f31503n = iArr;
        this.f31504o = i;
        this.f31505p = iArr2;
    }

    /* renamed from: B */
    public final C14010r m2126B() {
        return this.f31500k;
    }

    /* renamed from: p */
    public int m2125p() {
        return this.f31504o;
    }

    /* renamed from: r */
    public int[] m2124r() {
        return this.f31503n;
    }

    /* renamed from: t */
    public int[] m2123t() {
        return this.f31505p;
    }

    /* renamed from: u */
    public boolean m2122u() {
        return this.f31501l;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C14323c.m857a(parcel);
        C14323c.m844n(parcel, 1, this.f31500k, i, false);
        C14323c.m855c(parcel, 2, m2122u());
        C14323c.m855c(parcel, 3, m2121z());
        C14323c.m847k(parcel, 4, m2124r(), false);
        C14323c.m848j(parcel, 5, m2125p());
        C14323c.m847k(parcel, 6, m2123t(), false);
        C14323c.m856b(parcel, a);
    }

    /* renamed from: z */
    public boolean m2121z() {
        return this.f31502m;
    }
}
