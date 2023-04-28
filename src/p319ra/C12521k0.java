package p319ra;

import androidx.collection.SimpleArrayMap;
import ca.C3802i;
import java.io.Closeable;
import java.io.InputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: ra.k0 */
/* loaded from: classes3.dex */
public final class C12521k0 {

    /* renamed from: a */
    private final ExecutorService f28183a;

    /* renamed from: b */
    private volatile InputStream f28184b = null;

    /* renamed from: c */
    private volatile boolean f28185c = false;

    /* renamed from: d */
    private final SimpleArrayMap f28186d = new SimpleArrayMap();

    /* renamed from: e */
    private final SimpleArrayMap f28187e = new SimpleArrayMap();

    public C12521k0() {
        C12515i.m6597a();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), Executors.defaultThreadFactory());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f28183a = Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void m6592a() {
        this.f28185c = true;
        this.f28183a.shutdownNow();
        C3802i.m33567b(this.f28184b);
        for (int i = 0; i < this.f28186d.size(); i++) {
            C3802i.m33567b((Closeable) this.f28186d.m39048n(i));
        }
        this.f28186d.clear();
        for (int i2 = 0; i2 < this.f28187e.size(); i2++) {
            C12531p0 p0Var = (C12531p0) this.f28187e.m39048n(i2);
            C3802i.m33568a(p0Var.m6582p());
            C3802i.m33568a(p0Var.m6581r());
        }
        this.f28187e.clear();
    }
}
