package com.google.android.gms.nearby.messages.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p441y9.AbstractC14320a;
import p441y9.C14323c;
import p442ya.C14326a;
import p442ya.C14335i;
import za.AbstractC14595c;
import za.AbstractC14608p;
import za.AbstractC14610r;
import za.C14603k;

/* loaded from: classes3.dex */
public final class SubscribeRequest extends AbstractC14320a implements ReflectedParcelable {
    public static final Parcelable.Creator<SubscribeRequest> CREATOR = new C14603k();

    /* renamed from: A */
    public final int f37395A;

    /* renamed from: k */
    final int f10277k;

    /* renamed from: l */
    public final AbstractC14608p f10278l;

    /* renamed from: m */
    public final C14335i f10279m;

    /* renamed from: n */
    public final AbstractC14610r f10280n;

    /* renamed from: o */
    public final C14326a f10281o;

    /* renamed from: p */
    public final PendingIntent f10282p;
    @Deprecated

    /* renamed from: q */
    public final int f10283q;
    @Deprecated

    /* renamed from: r */
    public final String f10284r;
    @Deprecated

    /* renamed from: s */
    public final String f10285s;

    /* renamed from: t */
    public final byte[] f10286t;
    @Deprecated

    /* renamed from: u */
    public final boolean f10287u;

    /* renamed from: v */
    public final AbstractC14595c f10288v;
    @Deprecated

    /* renamed from: w */
    public final boolean f10289w;
    @Deprecated

    /* renamed from: x */
    public final ClientAppContext f10290x;

    /* renamed from: y */
    public final boolean f10291y;

    /* renamed from: z */
    public final int f10292z;

    public SubscribeRequest(int i, IBinder iBinder, C14335i iVar, IBinder iBinder2, C14326a aVar, PendingIntent pendingIntent, int i2, String str, String str2, byte[] bArr, boolean z, IBinder iBinder3, boolean z2, ClientAppContext clientAppContext, boolean z3, int i3, int i4) {
        AbstractC14608p pVar;
        AbstractC14610r rVar;
        this.f10277k = i;
        AbstractC14595c cVar = null;
        if (iBinder == null) {
            pVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.IMessageListener");
            pVar = queryLocalInterface instanceof AbstractC14608p ? (AbstractC14608p) queryLocalInterface : new C5450i0(iBinder);
        }
        this.f10278l = pVar;
        this.f10279m = iVar;
        if (iBinder2 == null) {
            rVar = null;
        } else {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
            rVar = queryLocalInterface2 instanceof AbstractC14610r ? (AbstractC14610r) queryLocalInterface2 : new C5452j0(iBinder2);
        }
        this.f10280n = rVar;
        this.f10281o = aVar;
        this.f10282p = pendingIntent;
        this.f10283q = i2;
        this.f10284r = str;
        this.f10285s = str2;
        this.f10286t = bArr;
        this.f10287u = z;
        if (iBinder3 != null) {
            IInterface queryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.nearby.messages.internal.ISubscribeCallback");
            cVar = queryLocalInterface3 instanceof AbstractC14595c ? (AbstractC14595c) queryLocalInterface3 : new C5460n0(iBinder3);
        }
        this.f10288v = cVar;
        this.f10289w = z2;
        this.f10290x = ClientAppContext.m28929p(clientAppContext, str2, str, z2);
        this.f10291y = z3;
        this.f10292z = i3;
        this.f37395A = i4;
    }

    public final String toString() {
        String str;
        String valueOf = String.valueOf(this.f10278l);
        String valueOf2 = String.valueOf(this.f10279m);
        String valueOf3 = String.valueOf(this.f10280n);
        String valueOf4 = String.valueOf(this.f10281o);
        String valueOf5 = String.valueOf(this.f10282p);
        byte[] bArr = this.f10286t;
        if (bArr == null) {
            str = null;
        } else {
            str = "<" + bArr.length + " bytes>";
        }
        return "SubscribeRequest{messageListener=" + valueOf + ", strategy=" + valueOf2 + ", callback=" + valueOf3 + ", filter=" + valueOf4 + ", pendingIntent=" + valueOf5 + ", hint=" + str + ", subscribeCallback=" + String.valueOf(this.f10288v) + ", useRealClientApiKey=" + this.f10289w + ", clientAppContext=" + String.valueOf(this.f10290x) + ", isDiscardPendingIntent=" + this.f10291y + ", zeroPartyPackageName=" + this.f10284r + ", realClientPackageName=" + this.f10285s + ", isIgnoreNearbyPermission=" + this.f10287u + ", callingContext=" + this.f37395A + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        IBinder iBinder2;
        int a = C14323c.m857a(parcel);
        C14323c.m848j(parcel, 1, this.f10277k);
        AbstractC14608p pVar = this.f10278l;
        IBinder iBinder3 = null;
        if (pVar == null) {
            iBinder = null;
        } else {
            iBinder = pVar.asBinder();
        }
        C14323c.m849i(parcel, 2, iBinder, false);
        C14323c.m844n(parcel, 3, this.f10279m, i, false);
        AbstractC14610r rVar = this.f10280n;
        if (rVar == null) {
            iBinder2 = null;
        } else {
            iBinder2 = rVar.asBinder();
        }
        C14323c.m849i(parcel, 4, iBinder2, false);
        C14323c.m844n(parcel, 5, this.f10281o, i, false);
        C14323c.m844n(parcel, 6, this.f10282p, i, false);
        C14323c.m848j(parcel, 7, this.f10283q);
        C14323c.m842p(parcel, 8, this.f10284r, false);
        C14323c.m842p(parcel, 9, this.f10285s, false);
        C14323c.m852f(parcel, 10, this.f10286t, false);
        C14323c.m855c(parcel, 11, this.f10287u);
        AbstractC14595c cVar = this.f10288v;
        if (cVar != null) {
            iBinder3 = cVar.asBinder();
        }
        C14323c.m849i(parcel, 12, iBinder3, false);
        C14323c.m855c(parcel, 13, this.f10289w);
        C14323c.m844n(parcel, 14, this.f10290x, i, false);
        C14323c.m855c(parcel, 15, this.f10291y);
        C14323c.m848j(parcel, 16, this.f10292z);
        C14323c.m848j(parcel, 17, this.f37395A);
        C14323c.m856b(parcel, a);
    }

    public SubscribeRequest(IBinder iBinder, C14335i iVar, IBinder iBinder2, C14326a aVar, PendingIntent pendingIntent, byte[] bArr, IBinder iBinder3, boolean z, int i, int i2) {
        this(3, iBinder, iVar, iBinder2, aVar, pendingIntent, 0, null, null, null, false, iBinder3, false, null, false, 0, i2);
    }
}
