package p400w9;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Set;
import p365u9.C13215a;
import p365u9.C13217c;
import p384v9.C13456a;
import p420x9.AbstractC13957c;
import p420x9.AbstractC13977h;
import p420x9.AbstractC13983j;
import p420x9.C14004p;

/* renamed from: w9.g */
/* loaded from: classes5.dex */
public final class ServiceConnectionC13823g implements C13456a.AbstractC13463f, ServiceConnection {

    /* renamed from: k */
    private final String f31124k;

    /* renamed from: l */
    private final String f31125l;

    /* renamed from: m */
    private final ComponentName f31126m;

    /* renamed from: n */
    private final Context f31127n;

    /* renamed from: o */
    private final AbstractC13817d f31128o;

    /* renamed from: p */
    private final Handler f31129p;

    /* renamed from: q */
    private final AbstractC13825h f31130q;

    /* renamed from: r */
    private IBinder f31131r;

    /* renamed from: s */
    private boolean f31132s;

    /* renamed from: t */
    private String f31133t;

    /* renamed from: u */
    private String f31134u;

    /* renamed from: s */
    private final void m2564s() {
        if (Thread.currentThread() != this.f31129p.getLooper().getThread()) {
            throw new IllegalStateException("This method should only run on the NonGmsServiceBrokerClient's handler thread.");
        }
    }

    /* renamed from: t */
    private final void m2563t(String str) {
        String.valueOf(this.f31131r);
    }

    @Override // p384v9.C13456a.AbstractC13463f
    /* renamed from: a */
    public final boolean mo2576a() {
        m2564s();
        return this.f31131r != null;
    }

    @Override // p384v9.C13456a.AbstractC13463f
    /* renamed from: b */
    public final void mo2575b(String str) {
        m2564s();
        this.f31133t = str;
        mo2152l();
    }

    @Override // p384v9.C13456a.AbstractC13463f
    /* renamed from: c */
    public final boolean mo2574c() {
        m2564s();
        return this.f31132s;
    }

    @Override // p384v9.C13456a.AbstractC13463f
    /* renamed from: d */
    public final String mo2573d() {
        String str = this.f31124k;
        if (str != null) {
            return str;
        }
        C14004p.m2051j(this.f31126m);
        return this.f31126m.getPackageName();
    }

    @Override // p384v9.C13456a.AbstractC13463f
    /* renamed from: e */
    public final boolean mo2160e() {
        return false;
    }

    @Override // p384v9.C13456a.AbstractC13463f
    /* renamed from: f */
    public final void mo2572f(AbstractC13957c.AbstractC0452c cVar) {
        m2564s();
        m2563t("Connect started.");
        if (mo2576a()) {
            try {
                mo2575b("connect() called when already connected");
            } catch (Exception unused) {
            }
        }
        try {
            Intent intent = new Intent();
            ComponentName componentName = this.f31126m;
            if (componentName != null) {
                intent.setComponent(componentName);
            } else {
                intent.setPackage(this.f31124k).setAction(this.f31125l);
            }
            boolean bindService = this.f31127n.bindService(intent, this, AbstractC13977h.m2106a());
            this.f31132s = bindService;
            if (!bindService) {
                this.f31131r = null;
                this.f31130q.mo2560b(new C13215a(16));
            }
            m2563t("Finished connect.");
        } catch (SecurityException e) {
            this.f31132s = false;
            this.f31131r = null;
            throw e;
        }
    }

    @Override // p384v9.C13456a.AbstractC13463f
    /* renamed from: g */
    public final boolean mo2156g() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public final /* synthetic */ void m2571h() {
        this.f31132s = false;
        this.f31131r = null;
        m2563t("Disconnected.");
        this.f31128o.mo2581e(1);
    }

    @Override // p384v9.C13456a.AbstractC13463f
    /* renamed from: i */
    public final void mo2570i(AbstractC13983j jVar, Set<Scope> set) {
    }

    @Override // p384v9.C13456a.AbstractC13463f
    /* renamed from: j */
    public final Set<Scope> mo2111j() {
        return Collections.emptySet();
    }

    @Override // p384v9.C13456a.AbstractC13463f
    /* renamed from: k */
    public final void mo2569k(AbstractC13957c.AbstractC13961e eVar) {
    }

    @Override // p384v9.C13456a.AbstractC13463f
    /* renamed from: l */
    public final void mo2152l() {
        m2564s();
        m2563t("Disconnect called.");
        try {
            this.f31127n.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        this.f31132s = false;
        this.f31131r = null;
    }

    @Override // p384v9.C13456a.AbstractC13463f
    /* renamed from: n */
    public final int mo143n() {
        return 0;
    }

    @Override // p384v9.C13456a.AbstractC13463f
    /* renamed from: o */
    public final C13217c[] mo2568o() {
        return new C13217c[0];
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        this.f31129p.post(new Runnable() { // from class: w9.v
            @Override // java.lang.Runnable
            public final void run() {
                ServiceConnectionC13823g.this.m2566q(iBinder);
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f31129p.post(new Runnable() { // from class: w9.u
            @Override // java.lang.Runnable
            public final void run() {
                ServiceConnectionC13823g.this.m2571h();
            }
        });
    }

    @Override // p384v9.C13456a.AbstractC13463f
    /* renamed from: p */
    public final String mo2567p() {
        return this.f31133t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public final /* synthetic */ void m2566q(IBinder iBinder) {
        this.f31132s = false;
        this.f31131r = iBinder;
        m2563t("Connected.");
        this.f31128o.mo2582c(new Bundle());
    }

    /* renamed from: r */
    public final void m2565r(String str) {
        this.f31134u = str;
    }
}
