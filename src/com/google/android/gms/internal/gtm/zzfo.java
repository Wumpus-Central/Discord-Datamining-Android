package com.google.android.gms.internal.gtm;

import ca.AbstractC3797d;
import p420x9.C14004p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzfo {
    private final AbstractC3797d zza;
    private long zzb;

    public zzfo(AbstractC3797d dVar) {
        C14004p.m2051j(dVar);
        this.zza = dVar;
    }

    public final void zza() {
        this.zzb = 0L;
    }

    public final void zzb() {
        this.zzb = this.zza.mo33580b();
    }

    public final boolean zzc(long j) {
        if (this.zzb != 0 && this.zza.mo33580b() - this.zzb <= j) {
            return false;
        }
        return true;
    }
}
