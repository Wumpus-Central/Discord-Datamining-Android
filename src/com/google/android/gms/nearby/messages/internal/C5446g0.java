package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import p441y9.AbstractC14320a;
import p441y9.C14323c;

/* renamed from: com.google.android.gms.nearby.messages.internal.g0 */
/* loaded from: classes3.dex */
public final class C5446g0 extends AbstractC14320a {
    public static final Parcelable.Creator<C5446g0> CREATOR = new C5448h0();

    /* renamed from: k */
    public final int f10325k;
    @Deprecated

    /* renamed from: l */
    public final ClientAppContext f10326l;

    /* renamed from: m */
    public final int f10327m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5446g0(int i, ClientAppContext clientAppContext, int i2) {
        this.f10325k = i;
        this.f10326l = clientAppContext;
        this.f10327m = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C14323c.m857a(parcel);
        C14323c.m848j(parcel, 1, this.f10325k);
        C14323c.m844n(parcel, 2, this.f10326l, i, false);
        C14323c.m848j(parcel, 3, this.f10327m);
        C14323c.m856b(parcel, a);
    }
}
