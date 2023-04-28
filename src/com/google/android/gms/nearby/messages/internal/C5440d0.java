package com.google.android.gms.nearby.messages.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import p441y9.AbstractC14320a;
import p441y9.C14323c;
import za.AbstractC14608p;
import za.AbstractC14610r;
import za.C14604l;

/* renamed from: com.google.android.gms.nearby.messages.internal.d0 */
/* loaded from: classes3.dex */
public final class C5440d0 extends AbstractC14320a {
    public static final Parcelable.Creator<C5440d0> CREATOR = new C14604l();

    /* renamed from: k */
    final int f10311k;

    /* renamed from: l */
    public final AbstractC14608p f10312l;

    /* renamed from: m */
    public final AbstractC14610r f10313m;

    /* renamed from: n */
    public final PendingIntent f10314n;
    @Deprecated

    /* renamed from: o */
    public final int f10315o;
    @Deprecated

    /* renamed from: p */
    public final String f10316p;
    @Deprecated

    /* renamed from: q */
    public final String f10317q;
    @Deprecated

    /* renamed from: r */
    public final boolean f10318r;
    @Deprecated

    /* renamed from: s */
    public final ClientAppContext f10319s;

    public C5440d0(int i, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, int i2, String str, String str2, boolean z, ClientAppContext clientAppContext) {
        AbstractC14608p pVar;
        this.f10311k = i;
        AbstractC14610r rVar = null;
        if (iBinder == null) {
            pVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.IMessageListener");
            pVar = queryLocalInterface instanceof AbstractC14608p ? (AbstractC14608p) queryLocalInterface : new C5450i0(iBinder);
        }
        this.f10312l = pVar;
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
            rVar = queryLocalInterface2 instanceof AbstractC14610r ? (AbstractC14610r) queryLocalInterface2 : new C5452j0(iBinder2);
        }
        this.f10313m = rVar;
        this.f10314n = pendingIntent;
        this.f10315o = i2;
        this.f10316p = str;
        this.f10317q = str2;
        this.f10318r = z;
        this.f10319s = ClientAppContext.m28929p(clientAppContext, str2, str, z);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int a = C14323c.m857a(parcel);
        C14323c.m848j(parcel, 1, this.f10311k);
        AbstractC14608p pVar = this.f10312l;
        if (pVar == null) {
            iBinder = null;
        } else {
            iBinder = pVar.asBinder();
        }
        C14323c.m849i(parcel, 2, iBinder, false);
        C14323c.m849i(parcel, 3, this.f10313m.asBinder(), false);
        C14323c.m844n(parcel, 4, this.f10314n, i, false);
        C14323c.m848j(parcel, 5, this.f10315o);
        C14323c.m842p(parcel, 6, this.f10316p, false);
        C14323c.m842p(parcel, 7, this.f10317q, false);
        C14323c.m855c(parcel, 8, this.f10318r);
        C14323c.m844n(parcel, 9, this.f10319s, i, false);
        C14323c.m856b(parcel, a);
    }

    public C5440d0(IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent) {
        this(1, iBinder, iBinder2, pendingIntent, 0, null, null, false, null);
    }
}
