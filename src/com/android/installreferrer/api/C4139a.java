package com.android.installreferrer.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.List;
import p174j9.AbstractC9507a;
import p413x2.AbstractC13923a;
import p413x2.C13924b;
import p434y2.C14220a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.android.installreferrer.api.a */
/* loaded from: classes.dex */
public class C4139a extends InstallReferrerClient {

    /* renamed from: a */
    private int f6930a = 0;

    /* renamed from: b */
    private final Context f6931b;

    /* renamed from: c */
    private AbstractC9507a f6932c;

    /* renamed from: d */
    private ServiceConnection f6933d;

    /* renamed from: com.android.installreferrer.api.a$b */
    /* loaded from: classes.dex */
    private final class ServiceConnectionC4140b implements ServiceConnection {

        /* renamed from: k */
        private final AbstractC13923a f6934k;

        private ServiceConnectionC4140b(AbstractC13923a aVar) {
            if (aVar != null) {
                this.f6934k = aVar;
                return;
            }
            throw new RuntimeException("Please specify a listener to know when setup is done.");
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C14220a.m1350a("InstallReferrerClient", "Install Referrer service connected.");
            C4139a.this.f6932c = AbstractC9507a.AbstractBinderC0284a.m16114b(iBinder);
            C4139a.this.f6930a = 2;
            this.f6934k.onInstallReferrerSetupFinished(0);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            C14220a.m1349b("InstallReferrerClient", "Install Referrer service disconnected.");
            C4139a.this.f6932c = null;
            C4139a.this.f6930a = 0;
            this.f6934k.onInstallReferrerServiceDisconnected();
        }
    }

    public C4139a(Context context) {
        this.f6931b = context.getApplicationContext();
    }

    /* renamed from: g */
    private boolean m32662g() {
        if (this.f6931b.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300) {
            return true;
        }
        return false;
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    /* renamed from: a */
    public void mo32667a() {
        this.f6930a = 3;
        if (this.f6933d != null) {
            C14220a.m1350a("InstallReferrerClient", "Unbinding from service.");
            this.f6931b.unbindService(this.f6933d);
            this.f6933d = null;
        }
        this.f6932c = null;
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    /* renamed from: b */
    public C13924b mo32666b() {
        if (m32661h()) {
            Bundle bundle = new Bundle();
            bundle.putString("package_name", this.f6931b.getPackageName());
            try {
                return new C13924b(this.f6932c.mo16113m(bundle));
            } catch (RemoteException e) {
                C14220a.m1349b("InstallReferrerClient", "RemoteException getting install referrer information");
                this.f6930a = 0;
                throw e;
            }
        } else {
            throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
        }
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    /* renamed from: d */
    public void mo32665d(AbstractC13923a aVar) {
        ServiceInfo serviceInfo;
        if (m32661h()) {
            C14220a.m1350a("InstallReferrerClient", "Service connection is valid. No need to re-initialize.");
            aVar.onInstallReferrerSetupFinished(0);
            return;
        }
        int i = this.f6930a;
        if (i == 1) {
            C14220a.m1349b("InstallReferrerClient", "Client is already in the process of connecting to the service.");
            aVar.onInstallReferrerSetupFinished(3);
        } else if (i == 3) {
            C14220a.m1349b("InstallReferrerClient", "Client was already closed and can't be reused. Please create another instance.");
            aVar.onInstallReferrerSetupFinished(3);
        } else {
            C14220a.m1350a("InstallReferrerClient", "Starting install referrer service setup.");
            Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
            intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
            List<ResolveInfo> queryIntentServices = this.f6931b.getPackageManager().queryIntentServices(intent, 0);
            if (queryIntentServices == null || queryIntentServices.isEmpty() || (serviceInfo = queryIntentServices.get(0).serviceInfo) == null) {
                this.f6930a = 0;
                C14220a.m1350a("InstallReferrerClient", "Install Referrer service unavailable on device.");
                aVar.onInstallReferrerSetupFinished(2);
                return;
            }
            String str = serviceInfo.packageName;
            String str2 = serviceInfo.name;
            if (!"com.android.vending".equals(str) || str2 == null || !m32662g()) {
                C14220a.m1349b("InstallReferrerClient", "Play Store missing or incompatible. Version 8.3.73 or later required.");
                this.f6930a = 0;
                aVar.onInstallReferrerSetupFinished(2);
                return;
            }
            Intent intent2 = new Intent(intent);
            ServiceConnectionC4140b bVar = new ServiceConnectionC4140b(aVar);
            this.f6933d = bVar;
            try {
                if (this.f6931b.bindService(intent2, bVar, 1)) {
                    C14220a.m1350a("InstallReferrerClient", "Service was bonded successfully.");
                    return;
                }
                C14220a.m1349b("InstallReferrerClient", "Connection to service is blocked.");
                this.f6930a = 0;
                aVar.onInstallReferrerSetupFinished(1);
            } catch (SecurityException unused) {
                C14220a.m1349b("InstallReferrerClient", "No permission to connect to service.");
                this.f6930a = 0;
                aVar.onInstallReferrerSetupFinished(4);
            }
        }
    }

    /* renamed from: h */
    public boolean m32661h() {
        return (this.f6930a != 2 || this.f6932c == null || this.f6933d == null) ? false : true;
    }
}
