package com.google.android.gms.internal.gtm;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import p213l9.C10373n;
import p420x9.C14004p;

/* loaded from: classes3.dex */
public final class zzbq extends zzbs {
    private final zzck zza;

    public zzbq(zzbv zzbvVar, zzbw zzbwVar) {
        super(zzbvVar);
        C14004p.m2051j(zzbwVar);
        this.zza = new zzck(zzbvVar, zzbwVar);
    }

    public final void zzc() {
        zzW();
        Context zzo = zzo();
        if (!zzfi.zza(zzo) || !zzfn.zzh(zzo)) {
            zze(null);
            return;
        }
        Intent intent = new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
        intent.setComponent(new ComponentName(zzo, "com.google.android.gms.analytics.AnalyticsService"));
        zzo.startService(intent);
    }

    @Override // com.google.android.gms.internal.gtm.zzbs
    protected final void zzd() {
        this.zza.zzX();
    }

    public final void zze(zzcz zzczVar) {
        zzW();
        zzq().m13536e(new zzbo(this, zzczVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzi() {
        C10373n.m13537d();
        this.zza.zzl();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzj() {
        C10373n.m13537d();
        this.zza.zzm();
    }

    public final void zzk() {
        zzW();
        C10373n.m13537d();
        zzck zzckVar = this.zza;
        C10373n.m13537d();
        zzckVar.zzW();
        zzckVar.zzO("Service disconnected");
    }

    public final void zzm() {
        this.zza.zzaa();
    }
}
