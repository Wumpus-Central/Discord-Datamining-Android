package com.google.android.gms.internal.gtm;

import p163j$.util.Spliterator;
import p420x9.C14004p;

/* loaded from: classes3.dex */
public final class zzfb extends zzbs {
    private static zzfb zza;

    public zzfb(zzbv zzbvVar) {
        super(zzbvVar);
    }

    public static zzfb zza() {
        return zza;
    }

    protected static final String zzf(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        String str = "-";
        if (obj instanceof Long) {
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return String.valueOf(obj);
            }
            if (String.valueOf(obj).charAt(0) != '-') {
                str = "";
            }
            String valueOf = String.valueOf(Math.abs(l.longValue()));
            return str + Math.round(Math.pow(10.0d, valueOf.length() - 1)) + "..." + str + Math.round(Math.pow(10.0d, valueOf.length()) - 1.0d);
        } else if (obj instanceof Boolean) {
            return String.valueOf(obj);
        } else {
            if (obj instanceof Throwable) {
                return obj.getClass().getCanonicalName();
            }
            return str;
        }
    }

    public final void zzb(zzex zzexVar, String str) {
        String str2;
        String str3;
        if (zzexVar != null) {
            str2 = zzexVar.toString();
        } else {
            str2 = "no hit data";
        }
        if (str.length() != 0) {
            str3 = "Discarding hit. ".concat(str);
        } else {
            str3 = new String("Discarding hit. ");
        }
        zzS(str3, str2);
    }

    @Override // com.google.android.gms.internal.gtm.zzbs
    protected final void zzd() {
        synchronized (zzfb.class) {
            zza = this;
        }
    }

    public final synchronized void zze(int i, String str, Object obj, Object obj2, Object obj3) {
        char c;
        C14004p.m2051j(str);
        if (zzw().zzb()) {
            zzw();
            c = 'C';
        } else {
            zzw();
            c = 'c';
        }
        char charAt = "01VDIWEA?".charAt(i);
        String str2 = zzbt.zza;
        String zzD = zzbr.zzD(str, zzf(obj), zzf(obj2), zzf(obj3));
        StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 4 + String.valueOf(zzD).length());
        sb2.append("3");
        sb2.append(charAt);
        sb2.append(c);
        sb2.append(str2);
        sb2.append(":");
        sb2.append(zzD);
        String sb3 = sb2.toString();
        if (sb3.length() > 1024) {
            sb3 = sb3.substring(0, Spliterator.IMMUTABLE);
        }
        zzfh zzp = zzt().zzp();
        if (zzp != null) {
            zzp.zze().zzc(sb3);
        }
    }
}
