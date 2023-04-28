package com.google.android.gms.analytics;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.internal.gtm.zzfm;
import com.google.android.gms.internal.gtm.zzfn;

/* loaded from: classes5.dex */
public final class AnalyticsService extends Service implements zzfm {

    /* renamed from: k */
    private zzfn<AnalyticsService> f10002k;

    /* renamed from: a */
    private final zzfn<AnalyticsService> m29203a() {
        if (this.f10002k == null) {
            this.f10002k = new zzfn<>(this);
        }
        return this.f10002k;
    }

    @Override // com.google.android.gms.internal.gtm.zzfm
    public boolean callServiceStopSelfResult(int i) {
        return stopSelfResult(i);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        m29203a();
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        m29203a().zze();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        m29203a().zzf();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        m29203a().zza(intent, i, i2);
        return 2;
    }

    @Override // com.google.android.gms.internal.gtm.zzfm
    public final void zza(JobParameters jobParameters, boolean z) {
        throw new UnsupportedOperationException();
    }
}
