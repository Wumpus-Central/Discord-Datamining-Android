package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import p441y9.AbstractC14320a;
import p441y9.C14323c;
import za.AbstractC14610r;
import za.AbstractC14614v;

/* renamed from: com.google.android.gms.nearby.messages.internal.z */
/* loaded from: classes3.dex */
public final class C5472z extends AbstractC14320a {
    public static final Parcelable.Creator<C5472z> CREATOR = new C5434a0();

    /* renamed from: k */
    final int f10366k;

    /* renamed from: l */
    public final AbstractC14610r f10367l;

    /* renamed from: m */
    public final AbstractC14614v f10368m;

    /* renamed from: n */
    public boolean f10369n;
    @Deprecated

    /* renamed from: o */
    public String f10370o;
    @Deprecated

    /* renamed from: p */
    public final ClientAppContext f10371p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5472z(int i, IBinder iBinder, IBinder iBinder2, boolean z, String str, ClientAppContext clientAppContext) {
        AbstractC14610r rVar;
        AbstractC14614v vVar;
        this.f10366k = i;
        if (iBinder == null) {
            rVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
            rVar = queryLocalInterface instanceof AbstractC14610r ? (AbstractC14610r) queryLocalInterface : new C5452j0(iBinder);
        }
        this.f10367l = rVar;
        if (iBinder2 == null) {
            vVar = null;
        } else {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.messages.internal.IStatusCallback");
            vVar = queryLocalInterface2 instanceof AbstractC14614v ? (AbstractC14614v) queryLocalInterface2 : new C5458m0(iBinder2);
        }
        this.f10368m = vVar;
        this.f10369n = z;
        this.f10370o = str;
        this.f10371p = ClientAppContext.m28929p(clientAppContext, null, str, false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C14323c.m857a(parcel);
        C14323c.m848j(parcel, 1, this.f10366k);
        C14323c.m849i(parcel, 2, this.f10367l.asBinder(), false);
        C14323c.m849i(parcel, 3, this.f10368m.asBinder(), false);
        C14323c.m855c(parcel, 4, this.f10369n);
        C14323c.m842p(parcel, 5, this.f10370o, false);
        C14323c.m844n(parcel, 6, this.f10371p, i, false);
        C14323c.m856b(parcel, a);
    }

    public C5472z(IBinder iBinder, IBinder iBinder2) {
        this(1, iBinder, iBinder2, false, null, null);
    }
}
