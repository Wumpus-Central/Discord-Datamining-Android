package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import p377v2.AbstractC13391a;
import p377v2.C13404i;
import sa.AbstractBinderC12846m;
import sa.C12844k;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.android.billingclient.api.j */
/* loaded from: classes.dex */
public final class ServiceConnectionC4122j implements ServiceConnection {

    /* renamed from: k */
    private final Object f6878k = new Object();

    /* renamed from: l */
    private boolean f6879l = false;

    /* renamed from: m */
    private AbstractC13391a f6880m;

    /* renamed from: n */
    final /* synthetic */ C4113a f6881n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ ServiceConnectionC4122j(C4113a aVar, AbstractC13391a aVar2, C13404i iVar) {
        this.f6881n = aVar;
        this.f6880m = aVar2;
    }

    /* renamed from: d */
    private final void m32683d(BillingResult billingResult) {
        synchronized (this.f6878k) {
            AbstractC13391a aVar = this.f6880m;
            if (aVar != null) {
                aVar.onBillingSetupFinished(billingResult);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0166  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ java.lang.Object m32686a() {
        /*
            Method dump skipped, instructions count: 367
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.ServiceConnectionC4122j.m32686a():java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void m32685b() {
        this.f6881n.f6837a = 0;
        this.f6881n.f6842f = null;
        m32683d(C4123k.f6895n);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final void m32684c() {
        synchronized (this.f6878k) {
            this.f6880m = null;
            this.f6879l = true;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Handler q;
        Future u;
        BillingResult s;
        C12844k.m5286l("BillingClient", "Billing service connected.");
        this.f6881n.f6842f = AbstractBinderC12846m.m5281b(iBinder);
        C4113a aVar = this.f6881n;
        Callable hVar = new Callable() { // from class: com.android.billingclient.api.h
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ServiceConnectionC4122j.this.m32686a();
                return null;
            }
        };
        Runnable iVar = new Runnable() { // from class: com.android.billingclient.api.i
            @Override // java.lang.Runnable
            public final void run() {
                ServiceConnectionC4122j.this.m32685b();
            }
        };
        q = aVar.m32696q();
        u = aVar.m32692u(hVar, 30000L, iVar, q);
        if (u == null) {
            s = this.f6881n.m32694s();
            m32683d(s);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C12844k.m5285m("BillingClient", "Billing service disconnected.");
        this.f6881n.f6842f = null;
        this.f6881n.f6837a = 0;
        synchronized (this.f6878k) {
            AbstractC13391a aVar = this.f6880m;
            if (aVar != null) {
                aVar.onBillingServiceDisconnected();
            }
        }
    }
}
