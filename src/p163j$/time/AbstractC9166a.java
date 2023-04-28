package p163j$.time;

import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import p163j$.util.function.BiConsumer;

/* renamed from: j$.time.a */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC9166a {
    /* renamed from: a */
    public static void m16733a(ConcurrentMap concurrentMap, BiConsumer biConsumer) {
        biConsumer.getClass();
        for (Map.Entry entry : concurrentMap.entrySet()) {
            try {
                biConsumer.accept(entry.getKey(), entry.getValue());
            } catch (IllegalStateException unused) {
            }
        }
    }

    /* renamed from: b */
    public static /* synthetic */ long m16732b(long j, long j2) {
        long j3 = j + j2;
        boolean z = true;
        boolean z2 = (j2 ^ j) < 0;
        if ((j ^ j3) < 0) {
            z = false;
        }
        if (z2 || z) {
            return j3;
        }
        throw new ArithmeticException();
    }

    /* renamed from: c */
    public static /* synthetic */ long m16731c(long j, long j2) {
        long j3 = j % j2;
        if (j3 == 0) {
            return 0L;
        }
        return (((j ^ j2) >> 63) | 1) > 0 ? j3 : j3 + j2;
    }

    /* renamed from: d */
    public static /* synthetic */ long m16730d(long j, long j2) {
        long j3 = j / j2;
        return (j - (j2 * j3) != 0 && (((j ^ j2) >> 63) | 1) < 0) ? j3 - 1 : j3;
    }
}
