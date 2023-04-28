package p359u3;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: u3.g */
/* loaded from: classes7.dex */
public abstract class AbstractRunnableC13189g<T> implements Runnable {

    /* renamed from: k */
    protected final AtomicInteger f29580k = new AtomicInteger(0);

    /* renamed from: a */
    public void m4382a() {
        if (this.f29580k.compareAndSet(0, 2)) {
            mo4379d();
        }
    }

    /* renamed from: b */
    protected abstract void mo4381b(T t);

    /* renamed from: c */
    protected abstract T mo4380c();

    /* renamed from: d */
    protected abstract void mo4379d();

    /* renamed from: e */
    protected abstract void mo4378e(Exception exc);

    /* renamed from: f */
    protected abstract void mo4377f(T t);

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f29580k.compareAndSet(0, 1)) {
            try {
                T c = mo4380c();
                this.f29580k.set(3);
                try {
                    mo4377f(c);
                } finally {
                    mo4381b(c);
                }
            } catch (Exception e) {
                this.f29580k.set(4);
                mo4378e(e);
            }
        }
    }
}
