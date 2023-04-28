package androidx.camera.core;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.camera.core.C1766a0;
import androidx.camera.core.impl.MetadataHolderService;
import androidx.camera.core.impl.utils.C1849j;
import androidx.concurrent.futures.C2114c;
import androidx.core.p018os.C2445i;
import androidx.core.util.C2517g;
import com.discord.media.utils.DiscordVideoMediaSource;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Executor;
import p120gc.AbstractFutureC7576b;
import p390w.AbstractC13579c0;
import p390w.AbstractC13584d0;
import p390w.AbstractC13616k0;
import p390w.AbstractC13702y2;
import p390w.C13602h0;
import p390w.C13627l0;
import p431y.C14186f;

/* renamed from: androidx.camera.core.z */
/* loaded from: classes.dex */
public final class C1961z {

    /* renamed from: o */
    private static final Object f2055o = new Object();

    /* renamed from: p */
    private static final SparseArray<Integer> f2056p = new SparseArray<>();

    /* renamed from: c */
    private final C1766a0 f2059c;

    /* renamed from: d */
    private final Executor f2060d;

    /* renamed from: e */
    private final Handler f2061e;

    /* renamed from: f */
    private final HandlerThread f2062f;

    /* renamed from: g */
    private AbstractC13584d0 f2063g;

    /* renamed from: h */
    private AbstractC13579c0 f2064h;

    /* renamed from: i */
    private AbstractC13702y2 f2065i;

    /* renamed from: j */
    private Context f2066j;

    /* renamed from: k */
    private final AbstractFutureC7576b<Void> f2067k;

    /* renamed from: n */
    private final Integer f2070n;

    /* renamed from: a */
    final C13602h0 f2057a = new C13602h0();

    /* renamed from: b */
    private final Object f2058b = new Object();

    /* renamed from: l */
    private EnumC1962a f2068l = EnumC1962a.UNINITIALIZED;

    /* renamed from: m */
    private AbstractFutureC7576b<Void> f2069m = C14186f.m1421h(null);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.camera.core.z$a */
    /* loaded from: classes.dex */
    public enum EnumC1962a {
        UNINITIALIZED,
        INITIALIZING,
        INITIALIZING_ERROR,
        INITIALIZED,
        SHUTDOWN
    }

    public C1961z(Context context, C1766a0.AbstractC1768b bVar) {
        if (bVar != null) {
            this.f2059c = bVar.getCameraXConfig();
        } else {
            C1766a0.AbstractC1768b f = m39411f(context);
            if (f != null) {
                this.f2059c = f.getCameraXConfig();
            } else {
                throw new IllegalStateException("CameraX is not configured properly. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
            }
        }
        Executor G = this.f2059c.m39897G(null);
        Handler J = this.f2059c.m39894J(null);
        this.f2060d = G == null ? new ExecutorC1897o() : G;
        if (J == null) {
            HandlerThread handlerThread = new HandlerThread("CameraX-scheduler", 10);
            this.f2062f = handlerThread;
            handlerThread.start();
            this.f2061e = C2445i.m37735a(handlerThread.getLooper());
        } else {
            this.f2062f = null;
            this.f2061e = J;
        }
        Integer num = (Integer) this.f2059c.mo2977a(C1766a0.f35314C, null);
        this.f2070n = num;
        m39408i(num);
        this.f2067k = m39406k(context);
    }

    /* renamed from: f */
    private static C1766a0.AbstractC1768b m39411f(Context context) {
        String str;
        Application b = C1849j.m39677b(context);
        if (b instanceof C1766a0.AbstractC1768b) {
            return (C1766a0.AbstractC1768b) b;
        }
        try {
            Context a = C1849j.m39678a(context);
            Bundle bundle = a.getPackageManager().getServiceInfo(new ComponentName(a, MetadataHolderService.class), DiscordVideoMediaSource.DEFAULT_WIDTH).metaData;
            if (bundle != null) {
                str = bundle.getString("androidx.camera.core.impl.MetadataHolderService.DEFAULT_CONFIG_PROVIDER");
            } else {
                str = null;
            }
            if (str != null) {
                return (C1766a0.AbstractC1768b) Class.forName(str).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            C1915r1.m39525c("CameraX", "No default CameraXConfig.Provider specified in meta-data. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
            return null;
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException e) {
            C1915r1.m39524d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        }
    }

    /* renamed from: i */
    private static void m39408i(Integer num) {
        synchronized (f2055o) {
            if (num != null) {
                C2517g.m37592c(num.intValue(), 3, 6, "minLogLevel");
                SparseArray<Integer> sparseArray = f2056p;
                int i = 1;
                if (sparseArray.get(num.intValue()) != null) {
                    i = 1 + sparseArray.get(num.intValue()).intValue();
                }
                sparseArray.put(num.intValue(), Integer.valueOf(i));
                m39401p();
            }
        }
    }

    /* renamed from: j */
    private void m39407j(final Executor executor, final long j, final Context context, final C2114c.C2115a<Void> aVar) {
        executor.execute(new Runnable() { // from class: androidx.camera.core.x
            @Override // java.lang.Runnable
            public final void run() {
                C1961z.this.m39404m(context, executor, aVar, j);
            }
        });
    }

    /* renamed from: k */
    private AbstractFutureC7576b<Void> m39406k(final Context context) {
        boolean z;
        AbstractFutureC7576b<Void> a;
        synchronized (this.f2058b) {
            if (this.f2068l == EnumC1962a.UNINITIALIZED) {
                z = true;
            } else {
                z = false;
            }
            C2517g.m37585j(z, "CameraX.initInternal() should only be called once per instance");
            this.f2068l = EnumC1962a.INITIALIZING;
            a = C2114c.m38964a(new C2114c.AbstractC0030c() { // from class: androidx.camera.core.w
                @Override // androidx.concurrent.futures.C2114c.AbstractC0030c
                /* renamed from: a */
                public final Object mo1403a(C2114c.C2115a aVar) {
                    Object n;
                    n = C1961z.this.m39403n(context, aVar);
                    return n;
                }
            });
        }
        return a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ void m39405l(Executor executor, long j, C2114c.C2115a aVar) {
        m39407j(executor, j, this.f2066j, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ void m39404m(Context context, final Executor executor, final C2114c.C2115a aVar, final long j) {
        try {
            Application b = C1849j.m39677b(context);
            this.f2066j = b;
            if (b == null) {
                this.f2066j = C1849j.m39678a(context);
            }
            AbstractC13584d0.AbstractC13585a H = this.f2059c.m39896H(null);
            if (H != null) {
                AbstractC13616k0 a = AbstractC13616k0.m3212a(this.f2060d, this.f2061e);
                C1921t F = this.f2059c.m39898F(null);
                this.f2063g = H.mo3305a(this.f2066j, a, F);
                AbstractC13579c0.AbstractC13580a I = this.f2059c.m39895I(null);
                if (I != null) {
                    this.f2064h = I.mo3315a(this.f2066j, this.f2063g.mo3306c(), this.f2063g.mo3307b());
                    AbstractC13702y2.AbstractC13705c K = this.f2059c.m39893K(null);
                    if (K != null) {
                        this.f2065i = K.mo2993a(this.f2066j);
                        if (executor instanceof ExecutorC1897o) {
                            ((ExecutorC1897o) executor).m39566c(this.f2063g);
                        }
                        this.f2057a.m3258b(this.f2063g);
                        C13627l0.m3168a(this.f2066j, this.f2057a, F);
                        m39402o();
                        aVar.m38961c(null);
                        return;
                    }
                    throw new C1909q1(new IllegalArgumentException("Invalid app configuration provided. Missing UseCaseConfigFactory."));
                }
                throw new C1909q1(new IllegalArgumentException("Invalid app configuration provided. Missing CameraDeviceSurfaceManager."));
            }
            throw new C1909q1(new IllegalArgumentException("Invalid app configuration provided. Missing CameraFactory."));
        } catch (C1909q1 | RuntimeException | C13627l0.C13628a e) {
            if (SystemClock.elapsedRealtime() - j < 2500) {
                C1915r1.m39516l("CameraX", "Retry init. Start time " + j + " current time " + SystemClock.elapsedRealtime(), e);
                C2445i.m37734b(this.f2061e, new Runnable() { // from class: androidx.camera.core.y
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1961z.this.m39405l(executor, j, aVar);
                    }
                }, "retry_token", 500L);
                return;
            }
            synchronized (this.f2058b) {
                this.f2068l = EnumC1962a.INITIALIZING_ERROR;
            }
            if (e instanceof C13627l0.C13628a) {
                C1915r1.m39525c("CameraX", "The device might underreport the amount of the cameras. Finish the initialize task since we are already reaching the maximum number of retries.");
                aVar.m38961c(null);
            } else if (e instanceof C1909q1) {
                aVar.m38958f(e);
            } else {
                aVar.m38958f(new C1909q1(e));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ Object m39403n(Context context, C2114c.C2115a aVar) {
        m39407j(this.f2060d, SystemClock.elapsedRealtime(), context, aVar);
        return "CameraX initInternal";
    }

    /* renamed from: o */
    private void m39402o() {
        synchronized (this.f2058b) {
            this.f2068l = EnumC1962a.INITIALIZED;
        }
    }

    /* renamed from: p */
    private static void m39401p() {
        SparseArray<Integer> sparseArray = f2056p;
        if (sparseArray.size() == 0) {
            C1915r1.m39520h();
        } else if (sparseArray.get(3) != null) {
            C1915r1.m39519i(3);
        } else if (sparseArray.get(4) != null) {
            C1915r1.m39519i(4);
        } else if (sparseArray.get(5) != null) {
            C1915r1.m39519i(5);
        } else if (sparseArray.get(6) != null) {
            C1915r1.m39519i(6);
        }
    }

    /* renamed from: d */
    public AbstractC13579c0 m39413d() {
        AbstractC13579c0 c0Var = this.f2064h;
        if (c0Var != null) {
            return c0Var;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    /* renamed from: e */
    public C13602h0 m39412e() {
        return this.f2057a;
    }

    /* renamed from: g */
    public AbstractC13702y2 m39410g() {
        AbstractC13702y2 y2Var = this.f2065i;
        if (y2Var != null) {
            return y2Var;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    /* renamed from: h */
    public AbstractFutureC7576b<Void> m39409h() {
        return this.f2067k;
    }
}
