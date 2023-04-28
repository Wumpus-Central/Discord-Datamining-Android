package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import java.util.ArrayList;
import java.util.List;
import p082ea.C6801d;
import p213l9.C10360a;
import p213l9.C10373n;
import p420x9.C14004p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzck extends zzbs {
    private boolean zza;
    private final zzce zzb;
    private final zzfe zzc;
    private final zzfc zzd;
    private final zzcc zze;
    private final zzcw zzg;
    private final zzcw zzh;
    private long zzj;
    private boolean zzk;
    private long zzf = Long.MIN_VALUE;
    private final zzfo zzi = new zzfo(zzC());

    /* JADX INFO: Access modifiers changed from: protected */
    public zzck(zzbv zzbvVar, zzbw zzbwVar) {
        super(zzbvVar);
        C14004p.m2051j(zzbwVar);
        this.zzd = new zzfc(zzbvVar);
        this.zzb = new zzce(zzbvVar);
        this.zzc = new zzfe(zzbvVar);
        this.zze = new zzcc(zzbvVar);
        this.zzg = new zzcg(this, zzbvVar);
        this.zzh = new zzch(this, zzbvVar);
    }

    private final void zzag() {
        zzcy zzy = zzy();
        if (zzy.zze()) {
            zzy.zza();
        }
    }

    private final void zzah() {
        if (this.zzg.zzh()) {
            zzO("All hits dispatched or no network/service. Going to power save mode");
        }
        this.zzg.zzf();
    }

    private final void zzai() {
        long j;
        zzcy zzy = zzy();
        if (zzy.zzc() && !zzy.zze()) {
            C10373n.m13537d();
            zzW();
            try {
                j = this.zzb.zzc();
            } catch (SQLiteException e) {
                zzK("Failed to get min/max hit times from local store", e);
                j = 0;
            }
            if (j != 0) {
                long abs = Math.abs(zzC().mo33581a() - j);
                zzw();
                if (abs <= zzeu.zzn.zzb().longValue()) {
                    zzw();
                    zzP("Dispatch alarm scheduled (ms)", Long.valueOf(zzct.zzd()));
                    zzy.zzb();
                }
            }
        }
    }

    private final boolean zzak(String str) {
        return C6801d.m24304a(zzo()).m24310a(str) == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzc(zzck zzckVar) {
        try {
            zzckVar.zzb.zza();
            zzckVar.zzae();
        } catch (SQLiteException e) {
            zzckVar.zzS("Failed to delete stale hits", e);
        }
        zzcw zzcwVar = zzckVar.zzh;
        zzckVar.zzw();
        zzcwVar.zzg(86400000L);
    }

    public final long zza() {
        long j = this.zzf;
        if (j != Long.MIN_VALUE) {
            return j;
        }
        zzw();
        long longValue = zzeu.zzi.zzb().longValue();
        zzft zzB = zzB();
        zzB.zzW();
        if (!zzB.zzc) {
            return longValue;
        }
        zzft zzB2 = zzB();
        zzB2.zzW();
        return zzB2.zzd * 1000;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzaa() {
        zzW();
        C14004p.m2048m(!this.zza, "Analytics backend already started");
        this.zza = true;
        zzq().m13536e(new zzci(this));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzab() {
        zzW();
        zzw();
        C10373n.m13537d();
        Context zza = zzt().zza();
        if (!zzfi.zza(zza)) {
            zzR("AnalyticsReceiver is not registered or is disabled. Register the receiver for reliable dispatching on non-Google Play devices. See http://goo.gl/8Rd3yj for instructions.");
        } else if (!zzfn.zzh(zza)) {
            zzJ("AnalyticsService is not registered or is disabled. Analytics service at risk of not starting. See http://goo.gl/8Rd3yj for instructions.");
        }
        if (!C10360a.zzb(zza)) {
            zzR("CampaignTrackingReceiver is not registered, not exported or is disabled. Installation campaign tracking is not possible. See http://goo.gl/8Rd3yj for instructions.");
        }
        zzA().zza();
        if (!zzak("android.permission.ACCESS_NETWORK_STATE")) {
            zzJ("Missing required android.permission.ACCESS_NETWORK_STATE. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
            zzad();
        }
        if (!zzak("android.permission.INTERNET")) {
            zzJ("Missing required android.permission.INTERNET. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
            zzad();
        }
        if (zzfn.zzh(zzo())) {
            zzO("AnalyticsService registered in the app manifest and enabled");
        } else {
            zzw();
            zzR("AnalyticsService not registered in the app manifest. Hits might not be delivered reliably. See http://goo.gl/8Rd3yj for instructions.");
        }
        if (!this.zzk) {
            zzw();
            if (!this.zzb.zzac()) {
                zzi();
            }
        }
        zzae();
    }

    public final void zzad() {
        zzW();
        C10373n.m13537d();
        this.zzk = true;
        this.zze.zzc();
        zzae();
    }

    public final void zzae() {
        long j;
        C10373n.m13537d();
        zzW();
        if (!this.zzk) {
            zzw();
            if (zza() > 0) {
                if (this.zzb.zzac()) {
                    this.zzd.zzc();
                    zzah();
                    zzag();
                    return;
                }
                if (!zzeu.zzJ.zzb().booleanValue()) {
                    this.zzd.zza();
                    if (!this.zzd.zzd()) {
                        zzah();
                        zzag();
                        zzai();
                        return;
                    }
                }
                zzai();
                long zza = zza();
                long zzb = zzA().zzb();
                if (zzb != 0) {
                    j = zza - Math.abs(zzC().mo33581a() - zzb);
                    if (j <= 0) {
                        zzw();
                        j = Math.min(zzct.zze(), zza);
                    }
                } else {
                    zzw();
                    j = Math.min(zzct.zze(), zza);
                }
                zzP("Dispatch scheduled (ms)", Long.valueOf(j));
                if (this.zzg.zzh()) {
                    this.zzg.zze(Math.max(1L, j + this.zzg.zzb()));
                    return;
                }
                this.zzg.zzg(j);
                return;
            }
        }
        this.zzd.zzc();
        zzah();
        zzag();
    }

    protected final boolean zzaf() {
        boolean z;
        C10373n.m13537d();
        zzW();
        zzO("Dispatching a batch of local hits");
        if (!this.zze.zzg()) {
            zzw();
            z = true;
        } else {
            z = false;
        }
        boolean zze = true ^ this.zzc.zze();
        if (!z || !zze) {
            zzw();
            int zzh = zzct.zzh();
            zzw();
            long max = Math.max(zzh, zzct.zzg());
            ArrayList arrayList = new ArrayList();
            long j = 0;
            while (true) {
                try {
                    this.zzb.zzm();
                    arrayList.clear();
                    try {
                        List<zzex> zzj = this.zzb.zzj(max);
                        if (zzj.isEmpty()) {
                            zzO("Store is empty, nothing to dispatch");
                            zzah();
                            zzag();
                            try {
                                this.zzb.zzab();
                                this.zzb.zzaa();
                                return false;
                            } catch (SQLiteException e) {
                                zzK("Failed to commit local dispatch transaction", e);
                                zzah();
                                zzag();
                                return false;
                            }
                        } else {
                            zzP("Hits loaded from store. count", Integer.valueOf(zzj.size()));
                            for (zzex zzexVar : zzj) {
                                if (zzexVar.zzb() == j) {
                                    zzL("Database contains successfully uploaded hit", Long.valueOf(j), Integer.valueOf(zzj.size()));
                                    zzah();
                                    zzag();
                                    try {
                                        this.zzb.zzab();
                                        this.zzb.zzaa();
                                        return false;
                                    } catch (SQLiteException e2) {
                                        zzK("Failed to commit local dispatch transaction", e2);
                                        zzah();
                                        zzag();
                                        return false;
                                    }
                                }
                            }
                            if (this.zze.zzg()) {
                                zzw();
                                zzO("Service connected, sending hits to the service");
                                while (!zzj.isEmpty()) {
                                    zzex zzexVar2 = zzj.get(0);
                                    if (!this.zze.zzh(zzexVar2)) {
                                        break;
                                    }
                                    j = Math.max(j, zzexVar2.zzb());
                                    zzj.remove(zzexVar2);
                                    zzG("Hit sent do device AnalyticsService for delivery", zzexVar2);
                                    try {
                                        this.zzb.zzn(zzexVar2.zzb());
                                        arrayList.add(Long.valueOf(zzexVar2.zzb()));
                                    } catch (SQLiteException e3) {
                                        zzK("Failed to remove hit that was send for delivery", e3);
                                        zzah();
                                        zzag();
                                        try {
                                            this.zzb.zzab();
                                            this.zzb.zzaa();
                                            return false;
                                        } catch (SQLiteException e4) {
                                            zzK("Failed to commit local dispatch transaction", e4);
                                            zzah();
                                            zzag();
                                            return false;
                                        }
                                    }
                                }
                            }
                            if (this.zzc.zze()) {
                                List<Long> zzc = this.zzc.zzc(zzj);
                                for (Long l : zzc) {
                                    j = Math.max(j, l.longValue());
                                }
                                try {
                                    this.zzb.zzZ(zzc);
                                    arrayList.addAll(zzc);
                                } catch (SQLiteException e5) {
                                    zzK("Failed to remove successfully uploaded hits", e5);
                                    zzah();
                                    zzag();
                                    try {
                                        this.zzb.zzab();
                                        this.zzb.zzaa();
                                        return false;
                                    } catch (SQLiteException e6) {
                                        zzK("Failed to commit local dispatch transaction", e6);
                                        zzah();
                                        zzag();
                                        return false;
                                    }
                                }
                            }
                            if (arrayList.isEmpty()) {
                                try {
                                    this.zzb.zzab();
                                    this.zzb.zzaa();
                                    return false;
                                } catch (SQLiteException e7) {
                                    zzK("Failed to commit local dispatch transaction", e7);
                                    zzah();
                                    zzag();
                                    return false;
                                }
                            } else {
                                try {
                                    this.zzb.zzab();
                                    this.zzb.zzaa();
                                } catch (SQLiteException e8) {
                                    zzK("Failed to commit local dispatch transaction", e8);
                                    zzah();
                                    zzag();
                                    return false;
                                }
                            }
                        }
                    } catch (SQLiteException e9) {
                        zzS("Failed to read hits from persisted store", e9);
                        zzah();
                        zzag();
                        try {
                            this.zzb.zzab();
                            this.zzb.zzaa();
                            return false;
                        } catch (SQLiteException e10) {
                            zzK("Failed to commit local dispatch transaction", e10);
                            zzah();
                            zzag();
                            return false;
                        }
                    }
                } catch (Throwable th2) {
                    this.zzb.zzab();
                    this.zzb.zzaa();
                    throw th2;
                }
                try {
                    this.zzb.zzab();
                    this.zzb.zzaa();
                    throw th2;
                } catch (SQLiteException e11) {
                    zzK("Failed to commit local dispatch transaction", e11);
                    zzah();
                    zzag();
                    return false;
                }
            }
        } else {
            zzO("No network or service available. Will retry later");
            return false;
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzbs
    protected final void zzd() {
        this.zzb.zzX();
        this.zzc.zzX();
        this.zze.zzX();
    }

    public final void zzf(zzcz zzczVar) {
        zzg(zzczVar, this.zzj);
    }

    public final void zzg(zzcz zzczVar, long j) {
        long j2;
        C10373n.m13537d();
        zzW();
        long zzb = zzA().zzb();
        if (zzb != 0) {
            j2 = Math.abs(zzC().mo33581a() - zzb);
        } else {
            j2 = -1;
        }
        zzG("Dispatching local hits. Elapsed time since last dispatch (ms)", Long.valueOf(j2));
        zzw();
        zzi();
        try {
            zzaf();
            zzA().zzi();
            zzae();
            if (zzczVar != null) {
                zzczVar.zza(null);
            }
            if (this.zzj != j) {
                this.zzd.zzb();
            }
        } catch (Exception e) {
            zzK("Local dispatch failed", e);
            zzA().zzi();
            zzae();
            if (zzczVar != null) {
                zzczVar.zza(e);
            }
        }
    }

    protected final void zzi() {
        if (!this.zzk) {
            zzw();
            if (zzct.zzl() && !this.zze.zzg()) {
                zzw();
                if (this.zzi.zzc(zzeu.zzO.zzb().longValue())) {
                    this.zzi.zzb();
                    zzO("Connecting to service");
                    if (this.zze.zzf()) {
                        zzO("Connected to service");
                        this.zzi.zza();
                        zzm();
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzl() {
        C10373n.m13537d();
        this.zzj = zzC().mo33581a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d A[LOOP:0: B:15:0x004d->B:22:0x0069, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0080 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzm() {
        /*
            r5 = this;
            p213l9.C10373n.m13537d()
            r5.zzw()
            p213l9.C10373n.m13537d()
            r5.zzW()
            r5.zzE()
            r5.zzw()
            boolean r0 = com.google.android.gms.internal.gtm.zzct.zzl()
            if (r0 != 0) goto L_0x001d
            java.lang.String r0 = "Service client disabled. Can't dispatch local hits to device AnalyticsService"
            r5.zzR(r0)
        L_0x001d:
            com.google.android.gms.internal.gtm.zzcc r0 = r5.zze
            boolean r0 = r0.zzg()
            if (r0 != 0) goto L_0x002b
            java.lang.String r0 = "Service not connected"
            r5.zzO(r0)
            return
        L_0x002b:
            com.google.android.gms.internal.gtm.zzce r0 = r5.zzb
            boolean r0 = r0.zzac()
            if (r0 == 0) goto L_0x0034
            return
        L_0x0034:
            java.lang.String r0 = "Dispatching local hits to device AnalyticsService"
            r5.zzO(r0)
        L_0x0039:
            com.google.android.gms.internal.gtm.zzce r0 = r5.zzb     // Catch: SQLiteException -> 0x0084
            r5.zzw()     // Catch: SQLiteException -> 0x0084
            int r1 = com.google.android.gms.internal.gtm.zzct.zzh()     // Catch: SQLiteException -> 0x0084
            long r1 = (long) r1     // Catch: SQLiteException -> 0x0084
            java.util.List r0 = r0.zzj(r1)     // Catch: SQLiteException -> 0x0084
            boolean r1 = r0.isEmpty()     // Catch: SQLiteException -> 0x0084
            if (r1 != 0) goto L_0x0080
        L_0x004d:
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x0039
            r1 = 0
            java.lang.Object r1 = r0.get(r1)
            com.google.android.gms.internal.gtm.zzex r1 = (com.google.android.gms.internal.gtm.zzex) r1
            com.google.android.gms.internal.gtm.zzcc r2 = r5.zze
            boolean r2 = r2.zzh(r1)
            if (r2 != 0) goto L_0x0066
            r5.zzae()
            return
        L_0x0066:
            r0.remove(r1)
            com.google.android.gms.internal.gtm.zzce r2 = r5.zzb     // Catch: SQLiteException -> 0x0073
            long r3 = r1.zzb()     // Catch: SQLiteException -> 0x0073
            r2.zzn(r3)     // Catch: SQLiteException -> 0x0073
            goto L_0x004d
        L_0x0073:
            r0 = move-exception
            java.lang.String r1 = "Failed to remove hit that was send for delivery"
            r5.zzK(r1, r0)
            r5.zzah()
            r5.zzag()
            return
        L_0x0080:
            r5.zzae()     // Catch: SQLiteException -> 0x0084
            return
        L_0x0084:
            r0 = move-exception
            java.lang.String r1 = "Failed to read hits from store"
            r5.zzK(r1, r0)
            r5.zzah()
            r5.zzag()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzck.zzm():void");
    }
}
