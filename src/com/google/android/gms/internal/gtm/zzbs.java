package com.google.android.gms.internal.gtm;

/* loaded from: classes3.dex */
public abstract class zzbs extends zzbr {
    private boolean zza;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzbs(zzbv zzbvVar) {
        super(zzbvVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzW() {
        if (!zzY()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void zzX() {
        zzd();
        this.zza = true;
    }

    public final boolean zzY() {
        return this.zza;
    }

    protected abstract void zzd();
}
