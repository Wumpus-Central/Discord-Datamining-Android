package com.google.android.gms.internal.gtm;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzci implements Runnable {
    final /* synthetic */ zzck zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzci(zzck zzckVar) {
        this.zza = zzckVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzab();
    }
}
