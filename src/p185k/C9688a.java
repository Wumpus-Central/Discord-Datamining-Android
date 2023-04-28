package p185k;

import java.util.concurrent.Executor;

/* renamed from: k.a */
/* loaded from: classes.dex */
public class C9688a extends AbstractC9693d {

    /* renamed from: c */
    private static volatile C9688a f21544c;

    /* renamed from: d */
    private static final Executor f21545d = new ExecutorC0294a();

    /* renamed from: e */
    private static final Executor f21546e = new ExecutorC9689b();

    /* renamed from: a */
    private AbstractC9693d f21547a;

    /* renamed from: b */
    private AbstractC9693d f21548b;

    /* renamed from: k.a$a */
    /* loaded from: classes.dex */
    static class ExecutorC0294a implements Executor {
        ExecutorC0294a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            C9688a.m15590d().mo15585c(runnable);
        }
    }

    /* renamed from: k.a$b */
    /* loaded from: classes.dex */
    static class ExecutorC9689b implements Executor {
        ExecutorC9689b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            C9688a.m15590d().mo15587a(runnable);
        }
    }

    private C9688a() {
        C9691c cVar = new C9691c();
        this.f21548b = cVar;
        this.f21547a = cVar;
    }

    /* renamed from: d */
    public static C9688a m15590d() {
        if (f21544c != null) {
            return f21544c;
        }
        synchronized (C9688a.class) {
            if (f21544c == null) {
                f21544c = new C9688a();
            }
        }
        return f21544c;
    }

    @Override // p185k.AbstractC9693d
    /* renamed from: a */
    public void mo15587a(Runnable runnable) {
        this.f21547a.mo15587a(runnable);
    }

    @Override // p185k.AbstractC9693d
    /* renamed from: b */
    public boolean mo15586b() {
        return this.f21547a.mo15586b();
    }

    @Override // p185k.AbstractC9693d
    /* renamed from: c */
    public void mo15585c(Runnable runnable) {
        this.f21547a.mo15585c(runnable);
    }
}
