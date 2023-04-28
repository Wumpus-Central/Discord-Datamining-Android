package p087ei;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ei.d */
/* loaded from: classes8.dex */
public class C6918d implements AbstractC6940k {

    /* renamed from: b */
    private final Lock f15064b;

    public C6918d(Lock lock) {
        C9971q.m14633g(lock, "lock");
        this.f15064b = lock;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final Lock m23941a() {
        return this.f15064b;
    }

    @Override // p087ei.AbstractC6940k
    public void lock() {
        this.f15064b.lock();
    }

    @Override // p087ei.AbstractC6940k
    public void unlock() {
        this.f15064b.unlock();
    }

    public /* synthetic */ C6918d(Lock lock, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ReentrantLock() : lock);
    }
}
