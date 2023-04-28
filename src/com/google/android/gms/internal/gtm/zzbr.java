package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import ca.AbstractC3797d;
import p213l9.C10373n;
import p420x9.C14004p;

/* loaded from: classes3.dex */
public class zzbr {
    private final zzbv zza;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzbr(zzbv zzbvVar) {
        C14004p.m2051j(zzbvVar);
        this.zza = zzbvVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String zzD(String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String zza = zza(obj);
        String zza2 = zza(obj2);
        String zza3 = zza(obj3);
        StringBuilder sb2 = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(zza)) {
            sb2.append(str2);
            sb2.append(zza);
            str2 = str3;
        }
        if (!TextUtils.isEmpty(zza2)) {
            sb2.append(str2);
            sb2.append(zza2);
        } else {
            str3 = str2;
        }
        if (!TextUtils.isEmpty(zza3)) {
            sb2.append(str3);
            sb2.append(zza3);
        }
        return sb2.toString();
    }

    public static final boolean zzV() {
        return Log.isLoggable(zzeu.zzc.zzb(), 2);
    }

    private static String zza(Object obj) {
        if (obj == null) {
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof Boolean) {
            if (obj == Boolean.TRUE) {
                return "true";
            }
            return "false";
        } else if (obj instanceof Throwable) {
            return ((Throwable) obj).toString();
        } else {
            return obj.toString();
        }
    }

    private final void zzb(int i, String str, Object obj, Object obj2, Object obj3) {
        zzfb zzfbVar;
        zzbv zzbvVar = this.zza;
        if (zzbvVar != null) {
            zzfbVar = zzbvVar.zzn();
        } else {
            zzfbVar = null;
        }
        if (zzfbVar != null) {
            String zzb = zzeu.zzc.zzb();
            if (Log.isLoggable(zzb, i)) {
                Log.println(i, zzb, zzD(str, obj, obj2, obj3));
            }
            if (i >= 5) {
                zzfbVar.zze(i, str, obj, obj2, obj3);
                return;
            }
            return;
        }
        String zzb2 = zzeu.zzc.zzb();
        if (Log.isLoggable(zzb2, i)) {
            Log.println(i, zzb2, zzD(str, obj, obj2, obj3));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzfh zzA() {
        return this.zza.zzo();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzft zzB() {
        return this.zza.zzq();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final AbstractC3797d zzC() {
        return this.zza.zzr();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzE() {
        this.zza.zzj();
    }

    public final void zzF(String str) {
        zzb(3, str, null, null, null);
    }

    public final void zzG(String str, Object obj) {
        zzb(3, str, obj, null, null);
    }

    public final void zzH(String str, Object obj, Object obj2) {
        zzb(3, str, obj, obj2, null);
    }

    public final void zzI(String str, Object obj, Object obj2, Object obj3) {
        zzb(3, "POST compressed size, ratio %, url", obj, obj2, obj3);
    }

    public final void zzJ(String str) {
        zzb(6, str, null, null, null);
    }

    public final void zzK(String str, Object obj) {
        zzb(6, str, obj, null, null);
    }

    public final void zzL(String str, Object obj, Object obj2) {
        zzb(6, str, obj, obj2, null);
    }

    public final void zzM(String str) {
        zzb(4, str, null, null, null);
    }

    public final void zzO(String str) {
        zzb(2, str, null, null, null);
    }

    public final void zzP(String str, Object obj) {
        zzb(2, str, obj, null, null);
    }

    public final void zzQ(String str, Object obj, Object obj2) {
        zzb(2, str, obj, obj2, null);
    }

    public final void zzR(String str) {
        zzb(5, str, null, null, null);
    }

    public final void zzS(String str, Object obj) {
        zzb(5, str, obj, null, null);
    }

    public final void zzT(String str, Object obj, Object obj2) {
        zzb(5, str, obj, obj2, null);
    }

    public final void zzU(String str, Object obj, Object obj2, Object obj3) {
        zzb(5, "Deleted fewer hits then expected", obj, obj2, obj3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Context zzo() {
        return this.zza.zza();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final C10373n zzq() {
        return this.zza.zzd();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzbq zzs() {
        return this.zza.zzf();
    }

    public final zzbv zzt() {
        return this.zza;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzct zzw() {
        return this.zza.zzj();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzcy zzy() {
        return this.zza.zzl();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzfb zzz() {
        return this.zza.zzm();
    }
}
