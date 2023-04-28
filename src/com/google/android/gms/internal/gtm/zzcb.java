package com.google.android.gms.internal.gtm;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import ba.C3429b;
import p213l9.C10373n;
import p420x9.C14004p;

/* loaded from: classes3.dex */
public final class zzcb implements ServiceConnection {
    final /* synthetic */ zzcc zza;
    private volatile boolean zzb;
    private volatile zzey zzc;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzcb(zzcc zzccVar) {
        this.zza = zzccVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0064 A[Catch: all -> 0x0044, TRY_ENTER, TryCatch #2 {, blocks: (B:6:0x000f, B:7:0x0012, B:27:0x0080, B:28:0x0083, B:5:0x0008, B:10:0x0015, B:12:0x0021, B:14:0x002b, B:15:0x002e, B:16:0x0033, B:17:0x003b, B:20:0x0047, B:22:0x0050, B:23:0x0064, B:25:0x0068, B:26:0x007e), top: B:37:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0050 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.content.ServiceConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onServiceConnected(android.content.ComponentName r3, android.os.IBinder r4) {
        /*
            r2 = this;
            java.lang.String r3 = "AnalyticsServiceConnection.onServiceConnected"
            p420x9.C14004p.m2056e(r3)
            monitor-enter(r2)
            if (r4 != 0) goto L_0x0014
            com.google.android.gms.internal.gtm.zzcc r3 = r2.zza     // Catch: all -> 0x0044
            java.lang.String r4 = "Service connected with null binder"
            r3.zzJ(r4)     // Catch: all -> 0x0044
            r2.notifyAll()     // Catch: all -> 0x0089
            monitor-exit(r2)     // Catch: all -> 0x0089
            return
        L_0x0014:
            r3 = 0
            java.lang.String r0 = r4.getInterfaceDescriptor()     // Catch: all -> 0x0044, RemoteException -> 0x0046
            java.lang.String r1 = "com.google.android.gms.analytics.internal.IAnalyticsService"
            boolean r1 = r1.equals(r0)     // Catch: all -> 0x0044, RemoteException -> 0x0046
            if (r1 == 0) goto L_0x003b
            java.lang.String r0 = "com.google.android.gms.analytics.internal.IAnalyticsService"
            android.os.IInterface r0 = r4.queryLocalInterface(r0)     // Catch: all -> 0x0044, RemoteException -> 0x0046
            boolean r1 = r0 instanceof com.google.android.gms.internal.gtm.zzey     // Catch: all -> 0x0044, RemoteException -> 0x0046
            if (r1 == 0) goto L_0x002e
            com.google.android.gms.internal.gtm.zzey r0 = (com.google.android.gms.internal.gtm.zzey) r0     // Catch: all -> 0x0044, RemoteException -> 0x0046
            goto L_0x0033
        L_0x002e:
            com.google.android.gms.internal.gtm.zzey r0 = new com.google.android.gms.internal.gtm.zzey     // Catch: all -> 0x0044, RemoteException -> 0x0046
            r0.<init>(r4)     // Catch: all -> 0x0044, RemoteException -> 0x0046
        L_0x0033:
            com.google.android.gms.internal.gtm.zzcc r4 = r2.zza     // Catch: all -> 0x0044, RemoteException -> 0x0047
            java.lang.String r1 = "Bound to IAnalyticsService interface"
            r4.zzO(r1)     // Catch: all -> 0x0044, RemoteException -> 0x0047
            goto L_0x004e
        L_0x003b:
            com.google.android.gms.internal.gtm.zzcc r4 = r2.zza     // Catch: all -> 0x0044, RemoteException -> 0x0046
            java.lang.String r1 = "Got binder with a wrong descriptor"
            r4.zzK(r1, r0)     // Catch: all -> 0x0044, RemoteException -> 0x0046
            r0 = r3
            goto L_0x004e
        L_0x0044:
            r3 = move-exception
            goto L_0x0085
        L_0x0046:
            r0 = r3
        L_0x0047:
            com.google.android.gms.internal.gtm.zzcc r4 = r2.zza     // Catch: all -> 0x0044
            java.lang.String r1 = "Service connect failed to get IAnalyticsService"
            r4.zzJ(r1)     // Catch: all -> 0x0044
        L_0x004e:
            if (r0 != 0) goto L_0x0064
            ba.b r3 = ba.C3429b.m34394b()     // Catch: all -> 0x0044, IllegalArgumentException -> 0x0080
            com.google.android.gms.internal.gtm.zzcc r4 = r2.zza     // Catch: all -> 0x0044, IllegalArgumentException -> 0x0080
            android.content.Context r4 = r4.zzo()     // Catch: all -> 0x0044, IllegalArgumentException -> 0x0080
            com.google.android.gms.internal.gtm.zzcc r0 = r2.zza     // Catch: all -> 0x0044, IllegalArgumentException -> 0x0080
            com.google.android.gms.internal.gtm.zzcb r0 = com.google.android.gms.internal.gtm.zzcc.zza(r0)     // Catch: all -> 0x0044, IllegalArgumentException -> 0x0080
            r3.m34393c(r4, r0)     // Catch: all -> 0x0044, IllegalArgumentException -> 0x0080
            goto L_0x0080
        L_0x0064:
            boolean r4 = r2.zzb     // Catch: all -> 0x0044
            if (r4 != 0) goto L_0x007e
            com.google.android.gms.internal.gtm.zzcc r4 = r2.zza     // Catch: all -> 0x0044
            java.lang.String r1 = "onServiceConnected received after the timeout limit"
            r4.zzR(r1)     // Catch: all -> 0x0044
            com.google.android.gms.internal.gtm.zzcc r4 = r2.zza     // Catch: all -> 0x0044
            l9.n r4 = r4.zzq()     // Catch: all -> 0x0044
            com.google.android.gms.internal.gtm.zzbz r1 = new com.google.android.gms.internal.gtm.zzbz     // Catch: all -> 0x0044
            r1.<init>(r2, r0, r3)     // Catch: all -> 0x0044
            r4.m13536e(r1)     // Catch: all -> 0x0044
            goto L_0x0080
        L_0x007e:
            r2.zzc = r0     // Catch: all -> 0x0044
        L_0x0080:
            r2.notifyAll()     // Catch: all -> 0x0089
            monitor-exit(r2)     // Catch: all -> 0x0089
            return
        L_0x0085:
            r2.notifyAll()     // Catch: all -> 0x0089
            throw r3     // Catch: all -> 0x0089
        L_0x0089:
            r3 = move-exception
            monitor-exit(r2)     // Catch: all -> 0x0089
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzcb.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C14004p.m2056e("AnalyticsServiceConnection.onServiceDisconnected");
        this.zza.zzq().m13536e(new zzca(this, componentName));
    }

    public final zzey zza() {
        zzcb zzcbVar;
        C10373n.m13537d();
        Intent intent = new Intent("com.google.android.gms.analytics.service.START");
        intent.setComponent(new ComponentName("com.google.android.gms", "com.google.android.gms.analytics.service.AnalyticsService"));
        Context zzo = this.zza.zzo();
        intent.putExtra("app_package_name", zzo.getPackageName());
        C3429b b = C3429b.m34394b();
        synchronized (this) {
            this.zzc = null;
            this.zzb = true;
            zzcbVar = this.zza.zza;
            boolean a = b.m34395a(zzo, intent, zzcbVar, 129);
            this.zza.zzP("Bind to service requested", Boolean.valueOf(a));
            if (!a) {
                this.zzb = false;
                return null;
            }
            try {
                this.zza.zzw();
                wait(zzeu.zzL.zzb().longValue());
            } catch (InterruptedException unused) {
                this.zza.zzR("Wait for service connect was interrupted");
            }
            this.zzb = false;
            zzey zzeyVar = this.zzc;
            this.zzc = null;
            if (zzeyVar == null) {
                this.zza.zzJ("Successfully bound to service but never got onServiceConnected callback");
            }
            return zzeyVar;
        }
    }
}
