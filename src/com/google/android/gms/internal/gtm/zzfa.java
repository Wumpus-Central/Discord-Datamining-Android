package com.google.android.gms.internal.gtm;

import android.annotation.SuppressLint;
import android.util.Log;
import p213l9.AbstractC10362c;

@Deprecated
/* loaded from: classes3.dex */
public final class zzfa {
    private static volatile AbstractC10362c zza = new zzcu();

    @SuppressLint({"LogTagMismatch"})
    public static void zzb(String str, Object obj) {
        String str2;
        zzfb zza2 = zzfb.zza();
        if (zza2 != null) {
            zza2.zzK(str, obj);
        } else if (zzf(3)) {
            if (obj != null) {
                String str3 = (String) obj;
                StringBuilder sb2 = new StringBuilder(str.length() + 1 + str3.length());
                sb2.append(str);
                sb2.append(":");
                sb2.append(str3);
                str2 = sb2.toString();
            } else {
                str2 = str;
            }
            Log.e(zzeu.zzc.zzb(), str2);
        }
        AbstractC10362c cVar = zza;
        if (cVar != null) {
            cVar.error(str);
        }
    }

    public static boolean zzf(int i) {
        if (zza == null || zza.getLogLevel() > i) {
            return false;
        }
        return true;
    }
}
