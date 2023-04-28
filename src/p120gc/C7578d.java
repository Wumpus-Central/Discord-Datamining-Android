package p120gc;

import java.util.concurrent.Future;

/* renamed from: gc.d */
/* loaded from: classes3.dex */
public final class C7578d {
    /* renamed from: a */
    public static <V> V m21973a(Future<V> future) {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th2) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }
}
