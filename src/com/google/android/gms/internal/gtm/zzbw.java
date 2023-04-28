package com.google.android.gms.internal.gtm;

import android.content.Context;
import p420x9.C14004p;

/* loaded from: classes3.dex */
public final class zzbw {
    private final Context zza;
    private final Context zzb;

    public zzbw(Context context) {
        C14004p.m2051j(context);
        Context applicationContext = context.getApplicationContext();
        C14004p.m2050k(applicationContext, "Application context can't be null");
        this.zza = applicationContext;
        this.zzb = applicationContext;
    }

    public final Context zza() {
        return this.zza;
    }

    public final Context zzb() {
        return this.zzb;
    }
}
