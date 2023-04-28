package io.sentry.android.core;

import android.os.FileObserver;
import io.sentry.AbstractC8845d0;
import io.sentry.AbstractC8869g0;
import io.sentry.C9116v;
import io.sentry.EnumC8942n3;
import io.sentry.hints.AbstractC8882a;
import io.sentry.hints.AbstractC8883b;
import io.sentry.hints.AbstractC8885d;
import io.sentry.hints.AbstractC8886e;
import io.sentry.hints.AbstractC8887f;
import io.sentry.hints.AbstractC8892k;
import io.sentry.util.C9105h;
import io.sentry.util.C9111k;
import java.io.File;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: io.sentry.android.core.l0 */
/* loaded from: classes8.dex */
final class FileObserverC8764l0 extends FileObserver {

    /* renamed from: a */
    private final String f19362a;

    /* renamed from: b */
    private final AbstractC8845d0 f19363b;

    /* renamed from: c */
    private final AbstractC8869g0 f19364c;

    /* renamed from: d */
    private final long f19365d;

    /* renamed from: io.sentry.android.core.l0$a */
    /* loaded from: classes8.dex */
    private static final class C8765a implements AbstractC8883b, AbstractC8887f, AbstractC8892k, AbstractC8885d, AbstractC8882a, AbstractC8886e {

        /* renamed from: a */
        boolean f19366a;

        /* renamed from: b */
        boolean f19367b;

        /* renamed from: c */
        private CountDownLatch f19368c;

        /* renamed from: d */
        private final long f19369d;

        /* renamed from: e */
        private final AbstractC8869g0 f19370e;

        public C8765a(long j, AbstractC8869g0 g0Var) {
            reset();
            this.f19369d = j;
            this.f19370e = (AbstractC8869g0) C9111k.m16995a(g0Var, "ILogger is required.");
        }

        @Override // io.sentry.hints.AbstractC8887f
        /* renamed from: a */
        public boolean mo17717a() {
            return this.f19366a;
        }

        @Override // io.sentry.hints.AbstractC8892k
        /* renamed from: b */
        public void mo17716b(boolean z) {
            this.f19367b = z;
            this.f19368c.countDown();
        }

        @Override // io.sentry.hints.AbstractC8887f
        /* renamed from: c */
        public void mo17715c(boolean z) {
            this.f19366a = z;
        }

        @Override // io.sentry.hints.AbstractC8885d
        /* renamed from: d */
        public boolean mo17178d() {
            try {
                return this.f19368c.await(this.f19369d, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                this.f19370e.mo17723b(EnumC8942n3.ERROR, "Exception while awaiting on lock.", e);
                return false;
            }
        }

        @Override // io.sentry.hints.AbstractC8892k
        /* renamed from: e */
        public boolean mo17714e() {
            return this.f19367b;
        }

        @Override // io.sentry.hints.AbstractC8886e
        public void reset() {
            this.f19368c = new CountDownLatch(1);
            this.f19366a = false;
            this.f19367b = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FileObserverC8764l0(String str, AbstractC8845d0 d0Var, AbstractC8869g0 g0Var, long j) {
        super(str);
        this.f19362a = str;
        this.f19363b = (AbstractC8845d0) C9111k.m16995a(d0Var, "Envelope sender is required.");
        this.f19364c = (AbstractC8869g0) C9111k.m16995a(g0Var, "Logger is required.");
        this.f19365d = j;
    }

    @Override // android.os.FileObserver
    public void onEvent(int i, String str) {
        if (str != null && i == 8) {
            this.f19364c.mo17722c(EnumC8942n3.DEBUG, "onEvent fired for EnvelopeFileObserver with event type %d on path: %s for file %s.", Integer.valueOf(i), this.f19362a, str);
            C9116v e = C9105h.m17014e(new C8765a(this.f19365d, this.f19364c));
            AbstractC8845d0 d0Var = this.f19363b;
            d0Var.mo17040a(this.f19362a + File.separator + str, e);
        }
    }
}
