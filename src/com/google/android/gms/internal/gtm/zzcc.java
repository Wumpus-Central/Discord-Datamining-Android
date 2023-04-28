package com.google.android.gms.internal.gtm;

import android.content.ComponentName;
import android.os.RemoteException;
import ba.C3429b;
import java.util.Collections;
import p213l9.C10373n;
import p420x9.C14004p;

/* loaded from: classes3.dex */
public final class zzcc extends zzbs {
    private final zzcb zza = new zzcb(this);
    private final zzcw zzb;
    private final zzfo zzc;
    private zzey zzd;

    public zzcc(zzbv zzbvVar) {
        super(zzbvVar);
        this.zzc = new zzfo(zzbvVar.zzr());
        this.zzb = new zzby(this, zzbvVar);
    }

    public static /* bridge */ /* synthetic */ void zzb(zzcc zzccVar, ComponentName componentName) {
        C10373n.m13537d();
        if (zzccVar.zzd != null) {
            zzccVar.zzd = null;
            zzccVar.zzP("Disconnected from device AnalyticsService", componentName);
            zzccVar.zzs().zzk();
        }
    }

    public static /* bridge */ /* synthetic */ void zzi(zzcc zzccVar, zzey zzeyVar) {
        C10373n.m13537d();
        zzccVar.zzd = zzeyVar;
        zzccVar.zzj();
        zzccVar.zzs().zzj();
    }

    private final void zzj() {
        this.zzc.zzb();
        zzcw zzcwVar = this.zzb;
        zzw();
        zzcwVar.zzg(zzeu.zzK.zzb().longValue());
    }

    public final void zzc() {
        C10373n.m13537d();
        zzW();
        try {
            C3429b.m34394b().m34393c(zzo(), this.zza);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        if (this.zzd != null) {
            this.zzd = null;
            zzs().zzk();
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzbs
    protected final void zzd() {
    }

    public final boolean zzf() {
        C10373n.m13537d();
        zzW();
        if (this.zzd != null) {
            return true;
        }
        zzey zza = this.zza.zza();
        if (zza == null) {
            return false;
        }
        this.zzd = zza;
        zzj();
        return true;
    }

    public final boolean zzg() {
        C10373n.m13537d();
        zzW();
        if (this.zzd != null) {
            return true;
        }
        return false;
    }

    public final boolean zzh(zzex zzexVar) {
        String str;
        C14004p.m2051j(zzexVar);
        C10373n.m13537d();
        zzW();
        zzey zzeyVar = this.zzd;
        if (zzeyVar == null) {
            return false;
        }
        if (zzexVar.zzh()) {
            zzw();
            str = zzct.zzi();
        } else {
            zzw();
            str = zzct.zzk();
        }
        try {
            zzeyVar.zzf(zzexVar.zzg(), zzexVar.zzd(), str, Collections.emptyList());
            zzj();
            return true;
        } catch (RemoteException unused) {
            zzO("Failed to send hits to AnalyticsService");
            return false;
        }
    }
}
