package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import p441y9.AbstractC14320a;
import p441y9.C14323c;
import p442ya.C14335i;
import za.AbstractC14610r;
import za.AbstractC14612t;
import za.C14598f;

/* renamed from: com.google.android.gms.nearby.messages.internal.x */
/* loaded from: classes3.dex */
public final class C5470x extends AbstractC14320a {
    public static final Parcelable.Creator<C5470x> CREATOR = new C5471y();

    /* renamed from: k */
    final int f10355k;

    /* renamed from: l */
    public final C14598f f10356l;

    /* renamed from: m */
    public final C14335i f10357m;

    /* renamed from: n */
    public final AbstractC14610r f10358n;
    @Deprecated

    /* renamed from: o */
    public final String f10359o;
    @Deprecated

    /* renamed from: p */
    public final String f10360p;
    @Deprecated

    /* renamed from: q */
    public final boolean f10361q;

    /* renamed from: r */
    public final AbstractC14612t f10362r;
    @Deprecated

    /* renamed from: s */
    public final boolean f10363s;
    @Deprecated

    /* renamed from: t */
    public final ClientAppContext f10364t;

    /* renamed from: u */
    public final int f10365u;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5470x(int i, C14598f fVar, C14335i iVar, IBinder iBinder, String str, String str2, boolean z, IBinder iBinder2, boolean z2, ClientAppContext clientAppContext, int i2) {
        AbstractC14610r rVar;
        this.f10355k = i;
        this.f10356l = fVar;
        this.f10357m = iVar;
        AbstractC14612t tVar = null;
        if (iBinder == null) {
            rVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
            rVar = queryLocalInterface instanceof AbstractC14610r ? (AbstractC14610r) queryLocalInterface : new C5452j0(iBinder);
        }
        this.f10358n = rVar;
        this.f10359o = str;
        this.f10360p = str2;
        this.f10361q = z;
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.messages.internal.IPublishCallback");
            tVar = queryLocalInterface2 instanceof AbstractC14612t ? (AbstractC14612t) queryLocalInterface2 : new C5456l0(iBinder2);
        }
        this.f10362r = tVar;
        this.f10363s = z2;
        this.f10364t = ClientAppContext.m28929p(clientAppContext, str2, str, z2);
        this.f10365u = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int a = C14323c.m857a(parcel);
        C14323c.m848j(parcel, 1, this.f10355k);
        C14323c.m844n(parcel, 2, this.f10356l, i, false);
        C14323c.m844n(parcel, 3, this.f10357m, i, false);
        C14323c.m849i(parcel, 4, this.f10358n.asBinder(), false);
        C14323c.m842p(parcel, 5, this.f10359o, false);
        C14323c.m842p(parcel, 6, this.f10360p, false);
        C14323c.m855c(parcel, 7, this.f10361q);
        AbstractC14612t tVar = this.f10362r;
        if (tVar == null) {
            iBinder = null;
        } else {
            iBinder = tVar.asBinder();
        }
        C14323c.m849i(parcel, 8, iBinder, false);
        C14323c.m855c(parcel, 9, this.f10363s);
        C14323c.m844n(parcel, 10, this.f10364t, i, false);
        C14323c.m848j(parcel, 11, this.f10365u);
        C14323c.m856b(parcel, a);
    }
}
