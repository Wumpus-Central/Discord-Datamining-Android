package com.google.android.gms.internal.gtm;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
abstract class zzxx {
    final Unsafe zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzxx(Unsafe unsafe) {
        this.zza = unsafe;
    }

    public final int zzh(Class<?> cls) {
        return this.zza.arrayBaseOffset(cls);
    }

    public final int zzi(Class<?> cls) {
        return this.zza.arrayIndexScale(cls);
    }

    public final long zzl(Field field) {
        return this.zza.objectFieldOffset(field);
    }
}
