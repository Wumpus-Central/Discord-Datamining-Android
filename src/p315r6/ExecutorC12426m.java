package p315r6;

import java.util.concurrent.Executor;
import p397w6.C13750a;

/* renamed from: r6.m */
/* loaded from: classes7.dex */
class ExecutorC12426m implements Executor {

    /* renamed from: k */
    private final Executor f27969k;

    /* renamed from: r6.m$a */
    /* loaded from: classes7.dex */
    static class RunnableC12427a implements Runnable {

        /* renamed from: k */
        private final Runnable f27970k;

        RunnableC12427a(Runnable runnable) {
            this.f27970k = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f27970k.run();
            } catch (Exception e) {
                C13750a.m2812c("Executor", "Background execution failure.", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ExecutorC12426m(Executor executor) {
        this.f27969k = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f27969k.execute(new RunnableC12427a(runnable));
    }
}
