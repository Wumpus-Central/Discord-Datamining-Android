package fj;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import net.time4j.C10779a0;
import net.time4j.C10892f0;
import net.time4j.C10906g0;
import net.time4j.C10917h0;
import net.time4j.C10978p0;
import net.time4j.android.spi.AndroidResourceLoader;
import net.time4j.base.AbstractC10814d;
import net.time4j.p248tz.AbstractC11001k;
import net.time4j.p248tz.AbstractC11002l;
import net.time4j.p248tz.C11028p;
import p161ij.EnumC8635e;
import p183jj.C9637c;

/* renamed from: fj.a */
/* loaded from: classes8.dex */
public class C7349a {

    /* renamed from: a */
    private static final AtomicBoolean f15842a = new AtomicBoolean(false);

    /* renamed from: b */
    private static final AtomicBoolean f15843b = new AtomicBoolean(false);

    /* renamed from: fj.a$b */
    /* loaded from: classes8.dex */
    private static class RunnableC7350b implements Runnable {
        private RunnableC7350b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            long nanoTime = System.nanoTime();
            AbstractC11001k p = C11028p.m11181p(TimeZone.getDefault().getOffset(System.currentTimeMillis()) / RNCWebViewManager.COMMAND_CLEAR_FORM_DATA);
            Locale locale = Locale.getDefault();
            try {
                C10779a0 b = C10978p0.m11387b();
                p = AbstractC11002l.m11309O().mo11286z();
                Log.i("TIME4A", "System time zone at start: [" + p.mo11196a() + "]");
                Log.i("TIME4A", "System locale at start: [" + locale.toString() + "]");
                EnumC8635e eVar = EnumC8635e.FULL;
                Log.i("TIME4A", C9637c.m15895B(eVar, eVar, locale, p).m15865l(b));
                Log.i("TIME4A", "Prefetch thread consumed (in ms): " + ((System.nanoTime() - nanoTime) / 1000000));
            } catch (Throwable th2) {
                Log.e("TIME4A", "Error on prefetch thread with: time zone=" + p.mo11196a() + ", locale=" + locale + "!", th2);
                throw new IllegalStateException(th2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fj.a$c */
    /* loaded from: classes8.dex */
    public static class C7351c extends BroadcastReceiver {
        private C7351c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            AbstractC11002l.C11004b.m11284a();
            Log.i("TIME4A", "Event ACTION_TIMEZONE_CHANGED received, system timezone changed to: [" + AbstractC11002l.m11309O().mo11286z().mo11196a() + "]. Original tz-id reported by Android: [" + intent.getStringExtra("time-zone") + "]");
        }
    }

    /* renamed from: a */
    public static void m22850a(Context context, Runnable runnable) {
        long nanoTime = System.nanoTime();
        m22848c(context, null);
        m22847d(context.getApplicationContext());
        C10917h0 s0 = C10892f0.m11875L0(2021, 3, 27).m11838s0(C10906g0.m11776I0());
        Log.i("TIME4A", "Starting Time4A (v4.8-2021a published on " + s0.m11645i0() + ")");
        if (runnable != null) {
            Executors.defaultThreadFactory().newThread(runnable).start();
        }
        Log.i("TIME4A", "Main-Thread consumed in ms: " + ((System.nanoTime() - nanoTime) / 1000000));
    }

    /* renamed from: b */
    public static void m22849b(Context context, boolean z) {
        RunnableC7350b bVar = null;
        if (z) {
            bVar = new RunnableC7350b();
        }
        m22850a(context, bVar);
    }

    /* renamed from: c */
    public static void m22848c(Context context, AbstractC7352b bVar) {
        if (!f15842a.getAndSet(true)) {
            System.setProperty("net.time4j.base.ResourceLoader", "net.time4j.android.spi.AndroidResourceLoader");
            ((AndroidResourceLoader) AbstractC10814d.m12187c()).m12235j(context, bVar);
        }
    }

    /* renamed from: d */
    public static void m22847d(Context context) {
        if (context != null && !f15843b.getAndSet(true)) {
            System.setProperty("net.time4j.allow.system.tz.override", "true");
            context.registerReceiver(new C7351c(), new IntentFilter("android.intent.action.TIMEZONE_CHANGED"));
        }
    }
}
