package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class zzft extends zzbs {
    protected String zza;
    protected String zzb;
    protected boolean zzc;
    protected int zzd;
    protected boolean zze;
    protected boolean zzf;

    public zzft(zzbv zzbvVar) {
        super(zzbvVar);
    }

    public final boolean zzc() {
        zzW();
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.gtm.zzbs
    protected final void zzd() {
        ApplicationInfo applicationInfo;
        int i;
        int i2;
        Context zzo = zzo();
        try {
            applicationInfo = zzo.getPackageManager().getApplicationInfo(zzo.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException e) {
            zzS("PackageManager doesn't know about the app package", e);
            applicationInfo = null;
        }
        if (applicationInfo == null) {
            zzR("Couldn't get ApplicationInfo to load global config");
            return;
        }
        Bundle bundle = applicationInfo.metaData;
        if (bundle != null && (i = bundle.getInt("com.google.android.gms.analytics.globalConfigResource")) > 0) {
            zzbv zzt = zzt();
            zzew zzewVar = (zzew) new zzcs(zzt, new zzev(zzt)).zza(i);
            if (zzewVar != null) {
                zzO("Loading global XML config values");
                String str = zzewVar.zza;
                if (str != null) {
                    this.zzb = str;
                    zzG("XML config - app name", str);
                }
                String str2 = zzewVar.zzb;
                if (str2 != null) {
                    this.zza = str2;
                    zzG("XML config - app version", str2);
                }
                String str3 = zzewVar.zzc;
                boolean z = false;
                if (str3 != null) {
                    String lowerCase = str3.toLowerCase(Locale.US);
                    if ("verbose".equals(lowerCase)) {
                        i2 = 0;
                    } else if ("info".equals(lowerCase)) {
                        i2 = 1;
                    } else if ("warning".equals(lowerCase)) {
                        i2 = 2;
                    } else if ("error".equals(lowerCase)) {
                        i2 = 3;
                    } else {
                        i2 = -1;
                    }
                    if (i2 >= 0) {
                        zzP("XML config - log level", Integer.valueOf(i2));
                    }
                }
                int i3 = zzewVar.zzd;
                if (i3 >= 0) {
                    this.zzd = i3;
                    this.zzc = true;
                    zzG("XML config - dispatch period (sec)", Integer.valueOf(i3));
                }
                int i4 = zzewVar.zze;
                if (i4 != -1) {
                    if (1 == i4) {
                        z = true;
                    }
                    this.zzf = z;
                    this.zze = true;
                    zzG("XML config - dry run", Boolean.valueOf(z));
                }
            }
        }
    }

    public final boolean zze() {
        zzW();
        return this.zze;
    }

    public final boolean zzf() {
        zzW();
        return false;
    }
}
