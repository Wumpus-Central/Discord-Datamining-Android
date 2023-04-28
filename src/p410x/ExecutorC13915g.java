package p410x;

import androidx.core.util.C2517g;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: x.g */
/* loaded from: classes.dex */
public final class ExecutorC13915g implements Executor {

    /* renamed from: l */
    private final Executor f31370l;

    /* renamed from: k */
    final Deque<Runnable> f31369k = new ArrayDeque();

    /* renamed from: m */
    private final RunnableC13917b f31371m = new RunnableC13917b();

    /* renamed from: n */
    EnumC13918c f31372n = EnumC13918c.IDLE;

    /* renamed from: o */
    long f31373o = 0;

    /* renamed from: x.g$a */
    /* loaded from: classes.dex */
    class RunnableC13916a implements Runnable {

        /* renamed from: k */
        final /* synthetic */ Runnable f31374k;

        RunnableC13916a(Runnable runnable) {
            this.f31374k = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f31374k.run();
        }
    }

    /* renamed from: x.g$b */
    /* loaded from: classes.dex */
    final class RunnableC13917b implements Runnable {
        RunnableC13917b() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
            if (r1 == false) goto L_?;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
            java.lang.Thread.currentThread().interrupt();
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
            r1 = r1 | java.lang.Thread.interrupted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0049, code lost:
            r3.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
            r2 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
            androidx.camera.core.C1915r1.m39524d("SequentialExecutor", "Exception while executing runnable " + r3, r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:?, code lost:
            return;
         */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void m2323a() {
            /*
                r9 = this;
                r0 = 0
                r1 = r0
            L_0x0002:
                x.g r2 = p410x.ExecutorC13915g.this     // Catch: all -> 0x0068
                java.util.Deque<java.lang.Runnable> r2 = r2.f31369k     // Catch: all -> 0x0068
                monitor-enter(r2)     // Catch: all -> 0x0068
                if (r0 != 0) goto L_0x0026
                x.g r0 = p410x.ExecutorC13915g.this     // Catch: all -> 0x0065
                x.g$c r3 = r0.f31372n     // Catch: all -> 0x0065
                x.g$c r4 = p410x.ExecutorC13915g.EnumC13918c.RUNNING     // Catch: all -> 0x0065
                if (r3 != r4) goto L_0x001c
                monitor-exit(r2)     // Catch: all -> 0x0065
                if (r1 == 0) goto L_0x001b
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L_0x001b:
                return
            L_0x001c:
                long r5 = r0.f31373o     // Catch: all -> 0x0065
                r7 = 1
                long r5 = r5 + r7
                r0.f31373o = r5     // Catch: all -> 0x0065
                r0.f31372n = r4     // Catch: all -> 0x0065
                r0 = 1
            L_0x0026:
                x.g r3 = p410x.ExecutorC13915g.this     // Catch: all -> 0x0065
                java.util.Deque<java.lang.Runnable> r3 = r3.f31369k     // Catch: all -> 0x0065
                java.lang.Object r3 = r3.poll()     // Catch: all -> 0x0065
                java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: all -> 0x0065
                if (r3 != 0) goto L_0x0043
                x.g r0 = p410x.ExecutorC13915g.this     // Catch: all -> 0x0065
                x.g$c r3 = p410x.ExecutorC13915g.EnumC13918c.IDLE     // Catch: all -> 0x0065
                r0.f31372n = r3     // Catch: all -> 0x0065
                monitor-exit(r2)     // Catch: all -> 0x0065
                if (r1 == 0) goto L_0x0042
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L_0x0042:
                return
            L_0x0043:
                monitor-exit(r2)     // Catch: all -> 0x0065
                boolean r2 = java.lang.Thread.interrupted()     // Catch: all -> 0x0068
                r1 = r1 | r2
                r3.run()     // Catch: RuntimeException -> 0x004d, all -> 0x0068
                goto L_0x0002
            L_0x004d:
                r2 = move-exception
                java.lang.String r4 = "SequentialExecutor"
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: all -> 0x0068
                r5.<init>()     // Catch: all -> 0x0068
                java.lang.String r6 = "Exception while executing runnable "
                r5.append(r6)     // Catch: all -> 0x0068
                r5.append(r3)     // Catch: all -> 0x0068
                java.lang.String r3 = r5.toString()     // Catch: all -> 0x0068
                androidx.camera.core.C1915r1.m39524d(r4, r3, r2)     // Catch: all -> 0x0068
                goto L_0x0002
            L_0x0065:
                r0 = move-exception
                monitor-exit(r2)     // Catch: all -> 0x0065
                throw r0     // Catch: all -> 0x0068
            L_0x0068:
                r0 = move-exception
                if (r1 == 0) goto L_0x0072
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r1.interrupt()
            L_0x0072:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p410x.ExecutorC13915g.RunnableC13917b.m2323a():void");
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                m2323a();
            } catch (Error e) {
                synchronized (ExecutorC13915g.this.f31369k) {
                    ExecutorC13915g.this.f31372n = EnumC13918c.IDLE;
                    throw e;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x.g$c */
    /* loaded from: classes.dex */
    public enum EnumC13918c {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ExecutorC13915g(Executor executor) {
        this.f31370l = (Executor) C2517g.m37588g(executor);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        EnumC13918c cVar;
        C2517g.m37588g(runnable);
        synchronized (this.f31369k) {
            EnumC13918c cVar2 = this.f31372n;
            if (!(cVar2 == EnumC13918c.RUNNING || cVar2 == (cVar = EnumC13918c.QUEUED))) {
                long j = this.f31373o;
                RunnableC13916a aVar = new RunnableC13916a(runnable);
                this.f31369k.add(aVar);
                EnumC13918c cVar3 = EnumC13918c.QUEUING;
                this.f31372n = cVar3;
                boolean z = true;
                try {
                    this.f31370l.execute(this.f31371m);
                    if (this.f31372n == cVar3) {
                        z = false;
                    }
                    if (!z) {
                        synchronized (this.f31369k) {
                            if (this.f31373o == j && this.f31372n == cVar3) {
                                this.f31372n = cVar;
                            }
                        }
                        return;
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.f31369k) {
                        EnumC13918c cVar4 = this.f31372n;
                        if ((cVar4 != EnumC13918c.IDLE && cVar4 != EnumC13918c.QUEUING) || !this.f31369k.removeLastOccurrence(aVar)) {
                            z = false;
                        }
                        if (!(e instanceof RejectedExecutionException) || z) {
                            throw e;
                        }
                    }
                    return;
                }
            }
            this.f31369k.add(runnable);
        }
    }
}
