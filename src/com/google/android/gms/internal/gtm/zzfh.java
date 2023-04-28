package com.google.android.gms.internal.gtm;

import android.content.SharedPreferences;
import p213l9.C10373n;

/* loaded from: classes3.dex */
public final class zzfh extends zzbs {
    private SharedPreferences zza;
    private long zzb;
    private long zzc = -1;
    private final zzfg zzd = new zzfg(this, "monitoring", zzeu.zzP.zzb().longValue(), null);

    /* JADX INFO: Access modifiers changed from: protected */
    public zzfh(zzbv zzbvVar) {
        super(zzbvVar);
        zzw();
    }

    public final long zza() {
        C10373n.m13537d();
        zzW();
        long j = this.zzb;
        if (j != 0) {
            return j;
        }
        long j2 = this.zza.getLong("first_run", 0L);
        if (j2 != 0) {
            this.zzb = j2;
            return j2;
        }
        long a = zzC().mo33581a();
        SharedPreferences.Editor edit = this.zza.edit();
        edit.putLong("first_run", a);
        if (!edit.commit()) {
            zzR("Failed to commit first run time");
        }
        this.zzb = a;
        return a;
    }

    public final long zzb() {
        C10373n.m13537d();
        zzW();
        long j = this.zzc;
        if (j != -1) {
            return j;
        }
        long j2 = this.zza.getLong("last_dispatch", 0L);
        this.zzc = j2;
        return j2;
    }

    @Override // com.google.android.gms.internal.gtm.zzbs
    protected final void zzd() {
        this.zza = zzo().getSharedPreferences("com.google.android.gms.analytics.prefs", 0);
    }

    public final zzfg zze() {
        return this.zzd;
    }

    public final void zzi() {
        C10373n.m13537d();
        zzW();
        long a = zzC().mo33581a();
        SharedPreferences.Editor edit = this.zza.edit();
        edit.putLong("last_dispatch", a);
        edit.apply();
        this.zzc = a;
    }
}
