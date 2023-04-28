package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.Parcel;
import p319ra.C12491a;
import p319ra.C12497c;

/* renamed from: com.google.android.gms.nearby.messages.internal.k0 */
/* loaded from: classes3.dex */
public final class C5454k0 extends C12491a {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C5454k0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
    }

    /* renamed from: e0 */
    public final void m28917e0(C5446g0 g0Var) {
        Parcel b = m6620b();
        C12497c.m6613c(b, g0Var);
        m6618e(9, b);
    }

    /* renamed from: f0 */
    public final void m28916f0(C5470x xVar) {
        Parcel b = m6620b();
        C12497c.m6613c(b, xVar);
        m6618e(1, b);
    }

    /* renamed from: g0 */
    public final void m28915g0(C5472z zVar) {
        Parcel b = m6620b();
        C12497c.m6613c(b, zVar);
        m6618e(8, b);
    }

    /* renamed from: h0 */
    public final void m28914h0(SubscribeRequest subscribeRequest) {
        Parcel b = m6620b();
        C12497c.m6613c(b, subscribeRequest);
        m6618e(3, b);
    }

    /* renamed from: i0 */
    public final void m28913i0(C5436b0 b0Var) {
        Parcel b = m6620b();
        C12497c.m6613c(b, b0Var);
        m6618e(2, b);
    }

    /* renamed from: j0 */
    public final void m28912j0(C5440d0 d0Var) {
        Parcel b = m6620b();
        C12497c.m6613c(b, d0Var);
        m6618e(4, b);
    }
}
