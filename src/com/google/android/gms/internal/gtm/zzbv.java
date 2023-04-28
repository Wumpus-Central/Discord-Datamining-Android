package com.google.android.gms.internal.gtm;

import android.annotation.SuppressLint;
import android.content.Context;
import ca.AbstractC3797d;
import ca.C3798e;
import p213l9.C10361b;
import p213l9.C10373n;
import p420x9.C14004p;

@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes3.dex */
public final class zzbv {
    private static volatile zzbv zza;
    private final Context zzb;
    private final Context zzc;
    private final AbstractC3797d zzd = C3798e.m33579c();
    private final zzct zze = new zzct(this);
    private final zzfb zzf;
    private final C10373n zzg;
    private final zzbq zzh;
    private final zzcy zzi;
    private final zzft zzj;
    private final zzfh zzk;
    private final C10361b zzl;
    private final zzcn zzm;
    private final zzbi zzn;
    private final zzcf zzo;
    private final zzcx zzp;

    protected zzbv(zzbw zzbwVar) {
        Context zza2 = zzbwVar.zza();
        C14004p.m2050k(zza2, "Application context can't be null");
        Context zzb = zzbwVar.zzb();
        C14004p.m2051j(zzb);
        this.zzb = zza2;
        this.zzc = zzb;
        zzfb zzfbVar = new zzfb(this);
        zzfbVar.zzX();
        this.zzf = zzfbVar;
        zzfb zzm = zzm();
        String str = zzbt.zza;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 134);
        sb2.append("Google Analytics ");
        sb2.append(str);
        sb2.append(" is starting up. To enable debug logging on a device run:\n  adb shell setprop log.tag.GAv4 DEBUG\n  adb logcat -s GAv4");
        zzm.zzM(sb2.toString());
        zzfh zzfhVar = new zzfh(this);
        zzfhVar.zzX();
        this.zzk = zzfhVar;
        zzft zzftVar = new zzft(this);
        zzftVar.zzX();
        this.zzj = zzftVar;
        zzbq zzbqVar = new zzbq(this, zzbwVar);
        zzcn zzcnVar = new zzcn(this);
        zzbi zzbiVar = new zzbi(this);
        zzcf zzcfVar = new zzcf(this);
        zzcx zzcxVar = new zzcx(this);
        C10373n a = C10373n.m13540a(zza2);
        a.m13535f(new zzbu(this));
        this.zzg = a;
        C10361b bVar = new C10361b(this);
        zzcnVar.zzX();
        this.zzm = zzcnVar;
        zzbiVar.zzX();
        this.zzn = zzbiVar;
        zzcfVar.zzX();
        this.zzo = zzcfVar;
        zzcxVar.zzX();
        this.zzp = zzcxVar;
        zzcy zzcyVar = new zzcy(this);
        zzcyVar.zzX();
        this.zzi = zzcyVar;
        zzbqVar.zzX();
        this.zzh = zzbqVar;
        bVar.m13543d();
        this.zzl = bVar;
        zzbqVar.zzm();
    }

    public static zzbv zzg(Context context) {
        C14004p.m2051j(context);
        if (zza == null) {
            synchronized (zzbv.class) {
                if (zza == null) {
                    AbstractC3797d c = C3798e.m33579c();
                    long b = c.mo33580b();
                    zzbv zzbvVar = new zzbv(new zzbw(context));
                    zza = zzbvVar;
                    C10361b.m13544c();
                    long b2 = c.mo33580b() - b;
                    long longValue = zzeu.zzQ.zzb().longValue();
                    if (b2 > longValue) {
                        zzbvVar.zzm().zzT("Slow initialization (ms)", Long.valueOf(b2), Long.valueOf(longValue));
                    }
                }
            }
        }
        return zza;
    }

    private static final void zzs(zzbs zzbsVar) {
        C14004p.m2050k(zzbsVar, "Analytics service not created/initialized");
        C14004p.m2059b(zzbsVar.zzY(), "Analytics service not initialized");
    }

    public final Context zza() {
        return this.zzb;
    }

    public final Context zzb() {
        return this.zzc;
    }

    public final C10373n zzd() {
        C14004p.m2051j(this.zzg);
        return this.zzg;
    }

    public final zzbq zzf() {
        zzs(this.zzh);
        return this.zzh;
    }

    public final zzct zzj() {
        return this.zze;
    }

    public final zzcy zzl() {
        zzs(this.zzi);
        return this.zzi;
    }

    public final zzfb zzm() {
        zzs(this.zzf);
        return this.zzf;
    }

    public final zzfb zzn() {
        return this.zzf;
    }

    public final zzfh zzo() {
        zzs(this.zzk);
        return this.zzk;
    }

    public final zzfh zzp() {
        zzfh zzfhVar = this.zzk;
        if (zzfhVar == null || !zzfhVar.zzY()) {
            return null;
        }
        return this.zzk;
    }

    public final zzft zzq() {
        zzs(this.zzj);
        return this.zzj;
    }

    public final AbstractC3797d zzr() {
        return this.zzd;
    }
}
