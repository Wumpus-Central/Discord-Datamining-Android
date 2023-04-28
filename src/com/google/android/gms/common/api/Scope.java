package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p420x9.C14004p;
import p441y9.AbstractC14320a;
import p441y9.C14323c;

/* loaded from: classes5.dex */
public final class Scope extends AbstractC14320a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new C5369a();

    /* renamed from: k */
    final int f10099k;

    /* renamed from: l */
    private final String f10100l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Scope(int i, String str) {
        C14004p.m2054g(str, "scopeUri must not be null or empty");
        this.f10099k = i;
        this.f10100l = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f10100l.equals(((Scope) obj).f10100l);
    }

    public int hashCode() {
        return this.f10100l.hashCode();
    }

    /* renamed from: p */
    public String m29115p() {
        return this.f10100l;
    }

    public String toString() {
        return this.f10100l;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a = C14323c.m857a(parcel);
        C14323c.m848j(parcel, 1, this.f10099k);
        C14323c.m842p(parcel, 2, m29115p(), false);
        C14323c.m856b(parcel, a);
    }

    public Scope(String str) {
        this(1, str);
    }
}
