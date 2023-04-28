package p420x9;

import android.os.Parcel;
import android.os.Parcelable;
import p441y9.AbstractC14320a;
import p441y9.C14323c;

/* renamed from: x9.m */
/* loaded from: classes5.dex */
public class C13993m extends AbstractC14320a {
    public static final Parcelable.Creator<C13993m> CREATOR = new C13981i0();

    /* renamed from: k */
    private final int f31554k;

    /* renamed from: l */
    private final int f31555l;

    /* renamed from: m */
    private final int f31556m;

    /* renamed from: n */
    private final long f31557n;

    /* renamed from: o */
    private final long f31558o;

    /* renamed from: p */
    private final String f31559p;

    /* renamed from: q */
    private final String f31560q;

    /* renamed from: r */
    private final int f31561r;

    /* renamed from: s */
    private final int f31562s;

    public C13993m(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
        this.f31554k = i;
        this.f31555l = i2;
        this.f31556m = i3;
        this.f31557n = j;
        this.f31558o = j2;
        this.f31559p = str;
        this.f31560q = str2;
        this.f31561r = i4;
        this.f31562s = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C14323c.m857a(parcel);
        C14323c.m848j(parcel, 1, this.f31554k);
        C14323c.m848j(parcel, 2, this.f31555l);
        C14323c.m848j(parcel, 3, this.f31556m);
        C14323c.m845m(parcel, 4, this.f31557n);
        C14323c.m845m(parcel, 5, this.f31558o);
        C14323c.m842p(parcel, 6, this.f31559p, false);
        C14323c.m842p(parcel, 7, this.f31560q, false);
        C14323c.m848j(parcel, 8, this.f31561r);
        C14323c.m848j(parcel, 9, this.f31562s);
        C14323c.m856b(parcel, a);
    }
}
