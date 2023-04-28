package androidx.core.util;

/* loaded from: classes.dex */
public class Pools$SynchronizedPool<T> extends Pools$SimplePool<T> {

    /* renamed from: c */
    private final Object f3481c = new Object();

    public Pools$SynchronizedPool(int i) {
        super(i);
    }

    @Override // androidx.core.util.Pools$SimplePool, androidx.core.util.AbstractC2516f
    public T acquire() {
        T t;
        synchronized (this.f3481c) {
            t = (T) super.acquire();
        }
        return t;
    }

    @Override // androidx.core.util.Pools$SimplePool, androidx.core.util.AbstractC2516f
    public boolean release(T t) {
        boolean release;
        synchronized (this.f3481c) {
            release = super.release(t);
        }
        return release;
    }
}
