package p365u9;

import android.os.Parcel;
import android.os.Parcelable;
import p420x9.C13996n;
import p441y9.AbstractC14320a;
import p441y9.C14323c;

/* renamed from: u9.c */
/* loaded from: classes5.dex */
public class C13217c extends AbstractC14320a {
    public static final Parcelable.Creator<C13217c> CREATOR = new C13229o();

    /* renamed from: k */
    private final String f29682k;
    @Deprecated

    /* renamed from: l */
    private final int f29683l;

    /* renamed from: m */
    private final long f29684m;

    public C13217c(String str, int i, long j) {
        this.f29682k = str;
        this.f29683l = i;
        this.f29684m = j;
    }

    public C13217c(String str, long j) {
        this.f29682k = str;
        this.f29684m = j;
        this.f29683l = -1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C13217c) {
            C13217c cVar = (C13217c) obj;
            if (((m4292p() != null && m4292p().equals(cVar.m4292p())) || (m4292p() == null && cVar.m4292p() == null)) && m4291r() == cVar.m4291r()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C13996n.m2070c(m4292p(), Long.valueOf(m4291r()));
    }

    /* renamed from: p */
    public String m4292p() {
        return this.f29682k;
    }

    /* renamed from: r */
    public long m4291r() {
        long j = this.f29684m;
        return j == -1 ? this.f29683l : j;
    }

    public final String toString() {
        C13996n.C13997a d = C13996n.m2069d(this);
        d.m2068a("name", m4292p());
        d.m2068a("version", Long.valueOf(m4291r()));
        return d.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C14323c.m857a(parcel);
        C14323c.m842p(parcel, 1, m4292p(), false);
        C14323c.m848j(parcel, 2, this.f29683l);
        C14323c.m845m(parcel, 3, m4291r());
        C14323c.m856b(parcel, a);
    }
}
