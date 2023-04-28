package androidx.core.util;

/* loaded from: classes.dex */
public class Pools$SimplePool<T> implements AbstractC2516f<T> {

    /* renamed from: a */
    private final Object[] f3479a;

    /* renamed from: b */
    private int f3480b;

    public Pools$SimplePool(int i) {
        if (i > 0) {
            this.f3479a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    /* renamed from: a */
    private boolean m37609a(T t) {
        for (int i = 0; i < this.f3480b; i++) {
            if (this.f3479a[i] == t) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.core.util.AbstractC2516f
    public T acquire() {
        int i = this.f3480b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.f3479a;
        T t = (T) objArr[i2];
        objArr[i2] = null;
        this.f3480b = i - 1;
        return t;
    }

    @Override // androidx.core.util.AbstractC2516f
    public boolean release(T t) {
        if (!m37609a(t)) {
            int i = this.f3480b;
            Object[] objArr = this.f3479a;
            if (i >= objArr.length) {
                return false;
            }
            objArr[i] = t;
            this.f3480b = i + 1;
            return true;
        }
        throw new IllegalStateException("Already in the pool!");
    }
}
