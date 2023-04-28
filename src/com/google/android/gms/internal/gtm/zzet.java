package com.google.android.gms.internal.gtm;

/* loaded from: classes3.dex */
public final class zzet<V> {
    private final zzes<V> zza;
    private final V zzb;
    private final V zzc;
    private final Object zzd = new Object();

    private zzet(V v, V v2, zzes<V> zzesVar) {
        this.zzb = v;
        this.zzc = v2;
        this.zza = zzesVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> zzet<T> zza(T t, T t2, zzes<T> zzesVar) {
        return new zzet<>(t, t2, zzesVar);
    }

    public final V zzb() {
        synchronized (this.zzd) {
        }
        return this.zzb;
    }
}
