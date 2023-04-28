package p043cb;

import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import ca.AbstractC3797d;
import ca.C3798e;
import ca.C3805l;
import ca.C3807n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p351ta.C13043b;
import p351ta.C13049h;
import p351ta.C13050i;
import p420x9.C14004p;

/* renamed from: cb.a */
/* loaded from: classes3.dex */
public class C3810a {

    /* renamed from: r */
    private static final long f6310r = TimeUnit.DAYS.toMillis(366);

    /* renamed from: s */
    private static volatile ScheduledExecutorService f6311s = null;

    /* renamed from: t */
    private static final Object f6312t = new Object();

    /* renamed from: u */
    private static volatile AbstractC3814e f6313u = new C3812c();

    /* renamed from: b */
    private final PowerManager.WakeLock f6315b;

    /* renamed from: d */
    private Future<?> f6317d;

    /* renamed from: e */
    private long f6318e;

    /* renamed from: h */
    private int f6321h;

    /* renamed from: k */
    private WorkSource f6324k;

    /* renamed from: l */
    private final String f6325l;

    /* renamed from: m */
    private final String f6326m;

    /* renamed from: n */
    private final Context f6327n;

    /* renamed from: q */
    private final ScheduledExecutorService f6330q;

    /* renamed from: a */
    private final Object f6314a = new Object();

    /* renamed from: c */
    private int f6316c = 0;

    /* renamed from: f */
    private final Set<C3815f> f6319f = new HashSet();

    /* renamed from: g */
    private boolean f6320g = true;

    /* renamed from: j */
    private AbstractC3797d f6323j = C3798e.m33579c();

    /* renamed from: o */
    private final Map<String, C3813d> f6328o = new HashMap();

    /* renamed from: p */
    private AtomicInteger f6329p = new AtomicInteger(0);

    /* renamed from: i */
    C13043b f6322i = null;

    public C3810a(Context context, int i, String str) {
        String str2;
        String packageName = context.getPackageName();
        C14004p.m2050k(context, "WakeLock: context must not be null");
        C14004p.m2054g(str, "WakeLock: wakeLockName must not be empty");
        this.f6327n = context.getApplicationContext();
        this.f6326m = str;
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2 = "*gcore*:".concat(valueOf);
            } else {
                str2 = new String("*gcore*:");
            }
            this.f6325l = str2;
        } else {
            this.f6325l = str;
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(i, str);
            this.f6315b = newWakeLock;
            if (C3807n.m33549c(context)) {
                WorkSource b = C3807n.m33550b(context, C3805l.m33554a(packageName) ? context.getPackageName() : packageName);
                this.f6324k = b;
                if (b != null) {
                    m33538i(newWakeLock, b);
                }
            }
            ScheduledExecutorService scheduledExecutorService = f6311s;
            if (scheduledExecutorService == null) {
                synchronized (f6312t) {
                    scheduledExecutorService = f6311s;
                    if (scheduledExecutorService == null) {
                        C13049h.m4700a();
                        scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        f6311s = scheduledExecutorService;
                    }
                }
            }
            this.f6330q = scheduledExecutorService;
            return;
        }
        StringBuilder sb2 = new StringBuilder(29);
        sb2.append((CharSequence) "expected a non-null reference", 0, 29);
        throw new C13050i(sb2.toString());
    }

    /* renamed from: e */
    public static /* synthetic */ void m33542e(C3810a aVar) {
        synchronized (aVar.f6314a) {
            if (aVar.m33545b()) {
                Log.e("WakeLock", String.valueOf(aVar.f6325l).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                aVar.m33540g();
                if (aVar.m33545b()) {
                    aVar.f6316c = 1;
                    aVar.m33539h(0);
                }
            }
        }
    }

    /* renamed from: f */
    private final String m33541f(String str) {
        if (this.f6320g) {
            TextUtils.isEmpty(null);
        }
        return null;
    }

    /* renamed from: g */
    private final void m33540g() {
        if (!this.f6319f.isEmpty()) {
            ArrayList arrayList = new ArrayList(this.f6319f);
            this.f6319f.clear();
            if (arrayList.size() > 0) {
                C3815f fVar = (C3815f) arrayList.get(0);
                throw null;
            }
        }
    }

    /* renamed from: h */
    private final void m33539h(int i) {
        synchronized (this.f6314a) {
            if (m33545b()) {
                if (this.f6320g) {
                    int i2 = this.f6316c - 1;
                    this.f6316c = i2;
                    if (i2 > 0) {
                        return;
                    }
                } else {
                    this.f6316c = 0;
                }
                m33540g();
                for (C3813d dVar : this.f6328o.values()) {
                    dVar.f6332a = 0;
                }
                this.f6328o.clear();
                Future<?> future = this.f6317d;
                if (future != null) {
                    future.cancel(false);
                    this.f6317d = null;
                    this.f6318e = 0L;
                }
                this.f6321h = 0;
                if (this.f6315b.isHeld()) {
                    try {
                        this.f6315b.release();
                        if (this.f6322i != null) {
                            this.f6322i = null;
                        }
                    } catch (RuntimeException e) {
                        if (e.getClass().equals(RuntimeException.class)) {
                            Log.e("WakeLock", String.valueOf(this.f6325l).concat(" failed to release!"), e);
                            if (this.f6322i != null) {
                                this.f6322i = null;
                            }
                        } else {
                            throw e;
                        }
                    }
                } else {
                    Log.e("WakeLock", String.valueOf(this.f6325l).concat(" should be held!"));
                }
            }
        }
    }

    /* renamed from: i */
    private static void m33538i(PowerManager.WakeLock wakeLock, WorkSource workSource) {
        try {
            wakeLock.setWorkSource(workSource);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
            Log.wtf("WakeLock", e.toString());
        }
    }

    /* renamed from: a */
    public void m33546a(long j) {
        this.f6329p.incrementAndGet();
        long j2 = Long.MAX_VALUE;
        long max = Math.max(Math.min(Long.MAX_VALUE, f6310r), 1L);
        if (j > 0) {
            max = Math.min(j, max);
        }
        synchronized (this.f6314a) {
            if (!m33545b()) {
                this.f6322i = C13043b.m4701b(false, null);
                this.f6315b.acquire();
                this.f6323j.mo33580b();
            }
            this.f6316c++;
            this.f6321h++;
            m33541f(null);
            C3813d dVar = this.f6328o.get(null);
            if (dVar == null) {
                dVar = new C3813d(null);
                this.f6328o.put(null, dVar);
            }
            dVar.f6332a++;
            long b = this.f6323j.mo33580b();
            if (Long.MAX_VALUE - b > max) {
                j2 = b + max;
            }
            if (j2 > this.f6318e) {
                this.f6318e = j2;
                Future<?> future = this.f6317d;
                if (future != null) {
                    future.cancel(false);
                }
                this.f6317d = this.f6330q.schedule(new Runnable() { // from class: cb.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        C3810a.m33542e(C3810a.this);
                    }
                }, max, TimeUnit.MILLISECONDS);
            }
        }
    }

    /* renamed from: b */
    public boolean m33545b() {
        boolean z;
        synchronized (this.f6314a) {
            if (this.f6316c > 0) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: c */
    public void m33544c() {
        if (this.f6329p.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f6325l).concat(" release without a matched acquire!"));
        }
        synchronized (this.f6314a) {
            m33541f(null);
            if (this.f6328o.containsKey(null)) {
                C3813d dVar = this.f6328o.get(null);
                if (dVar != null) {
                    int i = dVar.f6332a - 1;
                    dVar.f6332a = i;
                    if (i == 0) {
                        this.f6328o.remove(null);
                    }
                }
            } else {
                Log.w("WakeLock", String.valueOf(this.f6325l).concat(" counter does not exist"));
            }
            m33539h(0);
        }
    }

    /* renamed from: d */
    public void m33543d(boolean z) {
        synchronized (this.f6314a) {
            this.f6320g = z;
        }
    }
}
