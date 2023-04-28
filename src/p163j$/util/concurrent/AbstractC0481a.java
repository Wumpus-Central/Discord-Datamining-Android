package p163j$.util.concurrent;

import sun.misc.Unsafe;

/* renamed from: j$.util.concurrent.a */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC0481a {
    /* renamed from: a */
    public static /* synthetic */ boolean m16571a(Unsafe unsafe, Object obj, long j, Object obj2, Object obj3) {
        while (!unsafe.compareAndSwapObject(obj, j, obj2, obj3)) {
            if (unsafe.getObject(obj, j) != obj2) {
                return false;
            }
        }
        return true;
    }
}
