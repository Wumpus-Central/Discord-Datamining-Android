package androidx.camera.view;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: androidx.camera.view.h */
/* loaded from: classes.dex */
public final /* synthetic */ class C2062h {
    /* renamed from: a */
    public static /* synthetic */ boolean m39137a(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }
}
