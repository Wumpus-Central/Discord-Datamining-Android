package p072e0;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: e0.h */
/* loaded from: classes.dex */
final class C6535h {

    /* renamed from: a */
    private AtomicInteger f13688a = new AtomicInteger(0);

    /* renamed from: b */
    private final Lock f13689b;

    /* renamed from: c */
    private final Condition f13690c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6535h() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f13689b = reentrantLock;
        this.f13690c = reentrantLock.newCondition();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m25355a() {
        this.f13689b.lock();
        try {
            int andDecrement = this.f13688a.getAndDecrement();
            if (andDecrement == -1) {
                throw new IllegalStateException("Unable to decrement. Counter already destroyed");
            } else if (andDecrement != 0) {
                this.f13690c.signal();
            } else {
                throw new IllegalStateException("Unable to decrement. No corresponding counter increment");
            }
        } finally {
            this.f13689b.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m25354b() {
        this.f13689b.lock();
        while (!this.f13688a.compareAndSet(0, -1)) {
            try {
                try {
                    this.f13690c.await();
                } catch (InterruptedException unused) {
                }
            } finally {
                this.f13689b.unlock();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Finally extract failed */
    /* renamed from: c */
    public boolean m25353c() {
        this.f13689b.lock();
        try {
            if (this.f13688a.get() == -1) {
                this.f13689b.unlock();
                return false;
            }
            this.f13688a.getAndIncrement();
            this.f13689b.unlock();
            return true;
        } catch (Throwable th2) {
            this.f13689b.unlock();
            throw th2;
        }
    }
}
