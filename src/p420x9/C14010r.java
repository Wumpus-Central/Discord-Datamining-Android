package p420x9;

import android.os.Parcel;
import android.os.Parcelable;
import p441y9.AbstractC14320a;
import p441y9.C14323c;

/* renamed from: x9.r */
/* loaded from: classes5.dex */
public class C14010r extends AbstractC14320a {
    public static final Parcelable.Creator<C14010r> CREATOR = new C14026x0();

    /* renamed from: k */
    private final int f31591k;

    /* renamed from: l */
    private final boolean f31592l;

    /* renamed from: m */
    private final boolean f31593m;

    /* renamed from: n */
    private final int f31594n;

    /* renamed from: o */
    private final int f31595o;

    public C14010r(int i, boolean z, boolean z2, int i2, int i3) {
        this.f31591k = i;
        this.f31592l = z;
        this.f31593m = z2;
        this.f31594n = i2;
        this.f31595o = i3;
    }

    /* renamed from: p */
    public int m2037p() {
        return this.f31594n;
    }

    /* renamed from: r */
    public int m2036r() {
        return this.f31595o;
    }

    /* renamed from: t */
    public boolean m2035t() {
        return this.f31592l;
    }

    /* renamed from: u */
    public boolean m2034u() {
        return this.f31593m;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C14323c.m857a(parcel);
        C14323c.m848j(parcel, 1, m2033z());
        C14323c.m855c(parcel, 2, m2035t());
        C14323c.m855c(parcel, 3, m2034u());
        C14323c.m848j(parcel, 4, m2037p());
        C14323c.m848j(parcel, 5, m2036r());
        C14323c.m856b(parcel, a);
    }

    /* renamed from: z */
    public int m2033z() {
        return this.f31591k;
    }
}
