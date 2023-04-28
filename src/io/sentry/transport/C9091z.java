package io.sentry.transport;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;

/* renamed from: io.sentry.transport.z */
/* loaded from: classes8.dex */
public final class C9091z {

    /* renamed from: a */
    private final C9092a f19945a;

    /* renamed from: io.sentry.transport.z$a */
    /* loaded from: classes8.dex */
    private static final class C9092a extends AbstractQueuedSynchronizer {
        C9092a(int i) {
            setState(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public void m17087d() {
            releaseShared(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public int m17086e() {
            return getState();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public void m17085f() {
            int state;
            do {
                state = getState();
            } while (!compareAndSetState(state, state + 1));
        }

        @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
        public int tryAcquireShared(int i) {
            return getState() == 0 ? 1 : -1;
        }

        @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
        public boolean tryReleaseShared(int i) {
            int state;
            int i2;
            do {
                state = getState();
                if (state == 0) {
                    return false;
                }
                i2 = state - 1;
            } while (!compareAndSetState(state, i2));
            if (i2 == 0) {
                return true;
            }
            return false;
        }
    }

    public C9091z(int i) {
        if (i >= 0) {
            this.f19945a = new C9092a(i);
            return;
        }
        throw new IllegalArgumentException("negative initial count '" + i + "' is not allowed");
    }

    /* renamed from: a */
    public void m17094a() {
        this.f19945a.m17087d();
    }

    /* renamed from: b */
    public int m17093b() {
        return this.f19945a.m17086e();
    }

    /* renamed from: c */
    public void m17092c() {
        this.f19945a.m17085f();
    }

    /* renamed from: d */
    public boolean m17091d(long j, TimeUnit timeUnit) {
        return this.f19945a.tryAcquireSharedNanos(1, timeUnit.toNanos(j));
    }

    public C9091z() {
        this(0);
    }
}
