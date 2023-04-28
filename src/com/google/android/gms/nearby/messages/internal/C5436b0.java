package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import p441y9.AbstractC14320a;
import p441y9.C14323c;
import za.AbstractC14610r;
import za.C14598f;

/* renamed from: com.google.android.gms.nearby.messages.internal.b0 */
/* loaded from: classes3.dex */
public final class C5436b0 extends AbstractC14320a {
    public static final Parcelable.Creator<C5436b0> CREATOR = new C5438c0();

    /* renamed from: k */
    final int f10302k;

    /* renamed from: l */
    public final C14598f f10303l;

    /* renamed from: m */
    public final AbstractC14610r f10304m;
    @Deprecated

    /* renamed from: n */
    public final String f10305n;
    @Deprecated

    /* renamed from: o */
    public final String f10306o;
    @Deprecated

    /* renamed from: p */
    public final boolean f10307p;
    @Deprecated

    /* renamed from: q */
    public final ClientAppContext f10308q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5436b0(int i, C14598f fVar, IBinder iBinder, String str, String str2, boolean z, ClientAppContext clientAppContext) {
        AbstractC14610r rVar;
        this.f10302k = i;
        this.f10303l = fVar;
        if (iBinder == null) {
            rVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
            if (queryLocalInterface instanceof AbstractC14610r) {
                rVar = (AbstractC14610r) queryLocalInterface;
            } else {
                rVar = new C5452j0(iBinder);
            }
        }
        this.f10304m = rVar;
        this.f10305n = str;
        this.f10306o = str2;
        this.f10307p = z;
        this.f10308q = ClientAppContext.m28929p(clientAppContext, str2, str, z);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C14323c.m857a(parcel);
        C14323c.m848j(parcel, 1, this.f10302k);
        C14323c.m844n(parcel, 2, this.f10303l, i, false);
        C14323c.m849i(parcel, 3, this.f10304m.asBinder(), false);
        C14323c.m842p(parcel, 4, this.f10305n, false);
        C14323c.m842p(parcel, 5, this.f10306o, false);
        C14323c.m855c(parcel, 6, this.f10307p);
        C14323c.m844n(parcel, 7, this.f10308q, i, false);
        C14323c.m856b(parcel, a);
    }
}
