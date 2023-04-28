package p185k;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: k.c */
/* loaded from: classes.dex */
public class C9691c extends AbstractC9693d {

    /* renamed from: a */
    private final Object f21549a = new Object();

    /* renamed from: b */
    private final ExecutorService f21550b = Executors.newFixedThreadPool(4, new ThreadFactoryC9692a());

    /* renamed from: c */
    private volatile Handler f21551c;

    /* renamed from: k.c$a */
    /* loaded from: classes.dex */
    class ThreadFactoryC9692a implements ThreadFactory {

        /* renamed from: a */
        private final AtomicInteger f21552a = new AtomicInteger(0);

        ThreadFactoryC9692a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format("arch_disk_io_%d", Integer.valueOf(this.f21552a.getAndIncrement())));
            return thread;
        }
    }

    /* renamed from: d */
    private static Handler m15588d(Looper looper) {
        Handler createAsync;
        if (Build.VERSION.SDK_INT >= 28) {
            createAsync = Handler.createAsync(looper);
            return createAsync;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }

    @Override // p185k.AbstractC9693d
    /* renamed from: a */
    public void mo15587a(Runnable runnable) {
        this.f21550b.execute(runnable);
    }

    @Override // p185k.AbstractC9693d
    /* renamed from: b */
    public boolean mo15586b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    @Override // p185k.AbstractC9693d
    /* renamed from: c */
    public void mo15585c(Runnable runnable) {
        if (this.f21551c == null) {
            synchronized (this.f21549a) {
                if (this.f21551c == null) {
                    this.f21551c = m15588d(Looper.getMainLooper());
                }
            }
        }
        this.f21551c.post(runnable);
    }
}
