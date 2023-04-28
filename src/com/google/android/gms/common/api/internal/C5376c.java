package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.collection.C2095b;
import ca.C3799f;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C5378d;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import na.HandlerC10772f;
import p163j$.util.concurrent.ConcurrentHashMap;
import p365u9.C13215a;
import p365u9.C13220f;
import p384v9.AbstractC13468e;
import p384v9.AbstractC13478k;
import p384v9.C13456a;
import p400w9.AbstractC13831k;
import p400w9.C13813b;
import p400w9.C13824g0;
import p400w9.C13845w;
import p400w9.C13846x;
import p420x9.AbstractC13977h;
import p420x9.AbstractC14020v;
import p420x9.C13978h0;
import p420x9.C13993m;
import p420x9.C14007q;
import p420x9.C14010r;
import p420x9.C14016t;
import p420x9.C14018u;

/* renamed from: com.google.android.gms.common.api.internal.c */
/* loaded from: classes5.dex */
public class C5376c implements Handler.Callback {

    /* renamed from: B */
    public static final Status f37390B = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* renamed from: C */
    private static final Status f37391C = new Status(4, "The user must be signed in to make this API call.");

    /* renamed from: D */
    private static final Object f37392D = new Object();

    /* renamed from: E */
    private static C5376c f37393E;

    /* renamed from: A */
    private volatile boolean f37394A;

    /* renamed from: o */
    private C14016t f10127o;

    /* renamed from: p */
    private AbstractC14020v f10128p;

    /* renamed from: q */
    private final Context f10129q;

    /* renamed from: r */
    private final C13220f f10130r;

    /* renamed from: s */
    private final C13978h0 f10131s;

    /* renamed from: z */
    private final Handler f10138z;

    /* renamed from: k */
    private long f10123k = 5000;

    /* renamed from: l */
    private long f10124l = 120000;

    /* renamed from: m */
    private long f10125m = 10000;

    /* renamed from: n */
    private boolean f10126n = false;

    /* renamed from: t */
    private final AtomicInteger f10132t = new AtomicInteger(1);

    /* renamed from: u */
    private final AtomicInteger f10133u = new AtomicInteger(0);

    /* renamed from: v */
    private final Map<C13813b<?>, C5411t<?>> f10134v = new ConcurrentHashMap(5, 0.75f, 1);

    /* renamed from: w */
    private C5400m f10135w = null;

    /* renamed from: x */
    private final Set<C13813b<?>> f10136x = new C2095b();

    /* renamed from: y */
    private final Set<C13813b<?>> f10137y = new C2095b();

    private C5376c(Context context, Looper looper, C13220f fVar) {
        this.f37394A = true;
        this.f10129q = context;
        HandlerC10772f fVar2 = new HandlerC10772f(looper, this);
        this.f10138z = fVar2;
        this.f10130r = fVar;
        this.f10131s = new C13978h0(fVar);
        if (C3799f.m33578a(context)) {
            this.f37394A = false;
        }
        fVar2.sendMessage(fVar2.obtainMessage(6));
    }

    /* renamed from: a */
    public static void m29082a() {
        synchronized (f37392D) {
            C5376c cVar = f37393E;
            if (cVar != null) {
                cVar.f10133u.incrementAndGet();
                Handler handler = cVar.f10138z;
                handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static Status m29074i(C13813b<?> bVar, C13215a aVar) {
        String b = bVar.m2592b();
        String valueOf = String.valueOf(aVar);
        StringBuilder sb2 = new StringBuilder(String.valueOf(b).length() + 63 + valueOf.length());
        sb2.append("API: ");
        sb2.append(b);
        sb2.append(" is not available on this device. Connection failed with: ");
        sb2.append(valueOf);
        return new Status(aVar, sb2.toString());
    }

    /* renamed from: j */
    private final C5411t<?> m29073j(AbstractC13468e<?> eVar) {
        C13813b<?> r = eVar.m3626r();
        C5411t<?> tVar = this.f10134v.get(r);
        if (tVar == null) {
            tVar = new C5411t<>(this, eVar);
            this.f10134v.put(r, tVar);
        }
        if (tVar.m28973P()) {
            this.f10137y.add(r);
        }
        tVar.m28984E();
        return tVar;
    }

    /* renamed from: k */
    private final AbstractC14020v m29072k() {
        if (this.f10128p == null) {
            this.f10128p = C14018u.m2023a(this.f10129q);
        }
        return this.f10128p;
    }

    /* renamed from: l */
    private final void m29071l() {
        C14016t tVar = this.f10127o;
        if (tVar != null) {
            if (tVar.m2027p() > 0 || m29076g()) {
                m29072k().mo147f(tVar);
            }
            this.f10127o = null;
        }
    }

    /* renamed from: m */
    private final <T> void m29070m(TaskCompletionSource<T> taskCompletionSource, int i, AbstractC13468e eVar) {
        C5416y b;
        if (i != 0 && (b = C5416y.m28942b(this, i, eVar.m3626r())) != null) {
            Task<T> a = taskCompletionSource.m28902a();
            final Handler handler = this.f10138z;
            handler.getClass();
            a.mo28870c(new Executor() { // from class: w9.o
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    handler.post(runnable);
                }
            }, b);
        }
    }

    /* renamed from: y */
    public static C5376c m29058y(Context context) {
        C5376c cVar;
        synchronized (f37392D) {
            if (f37393E == null) {
                f37393E = new C5376c(context.getApplicationContext(), AbstractC13977h.m2104c().getLooper(), C13220f.m4286k());
            }
            cVar = f37393E;
        }
        return cVar;
    }

    /* renamed from: A */
    public final <O extends C13456a.AbstractC13459d> Task<Void> m29092A(AbstractC13468e<O> eVar, AbstractC5384f<C13456a.AbstractC13457b, ?> fVar, AbstractC5392i<C13456a.AbstractC13457b, ?> iVar, Runnable runnable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        m29070m(taskCompletionSource, fVar.m29046e(), eVar);
        C5388g0 g0Var = new C5388g0(new C13846x(fVar, iVar, runnable), taskCompletionSource);
        Handler handler = this.f10138z;
        handler.sendMessage(handler.obtainMessage(8, new C13845w(g0Var, this.f10133u.get(), eVar)));
        return taskCompletionSource.m28902a();
    }

    /* renamed from: B */
    public final <O extends C13456a.AbstractC13459d> Task<Boolean> m29091B(AbstractC13468e<O> eVar, C5378d.C5379a aVar, int i) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        m29070m(taskCompletionSource, i, eVar);
        C5393i0 i0Var = new C5393i0(aVar, taskCompletionSource);
        Handler handler = this.f10138z;
        handler.sendMessage(handler.obtainMessage(13, new C13845w(i0Var, this.f10133u.get(), eVar)));
        return taskCompletionSource.m28902a();
    }

    /* renamed from: G */
    public final <O extends C13456a.AbstractC13459d> void m29086G(AbstractC13468e<O> eVar, int i, AbstractC5374b<? extends AbstractC13478k, C13456a.AbstractC13457b> bVar) {
        C5385f0 f0Var = new C5385f0(i, bVar);
        Handler handler = this.f10138z;
        handler.sendMessage(handler.obtainMessage(4, new C13845w(f0Var, this.f10133u.get(), eVar)));
    }

    /* renamed from: H */
    public final <O extends C13456a.AbstractC13459d, ResultT> void m29085H(AbstractC13468e<O> eVar, int i, AbstractC5389h<C13456a.AbstractC13457b, ResultT> hVar, TaskCompletionSource<ResultT> taskCompletionSource, AbstractC13831k kVar) {
        m29070m(taskCompletionSource, hVar.m29033d(), eVar);
        C5391h0 h0Var = new C5391h0(i, hVar, taskCompletionSource, kVar);
        Handler handler = this.f10138z;
        handler.sendMessage(handler.obtainMessage(4, new C13845w(h0Var, this.f10133u.get(), eVar)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public final void m29084I(C13993m mVar, int i, long j, int i2) {
        Handler handler = this.f10138z;
        handler.sendMessage(handler.obtainMessage(18, new C5417z(mVar, i, j, i2)));
    }

    /* renamed from: J */
    public final void m29083J(C13215a aVar, int i) {
        if (!m29075h(aVar, i)) {
            Handler handler = this.f10138z;
            handler.sendMessage(handler.obtainMessage(5, i, 0, aVar));
        }
    }

    /* renamed from: b */
    public final void m29081b() {
        Handler handler = this.f10138z;
        handler.sendMessage(handler.obtainMessage(3));
    }

    /* renamed from: c */
    public final void m29080c(AbstractC13468e<?> eVar) {
        Handler handler = this.f10138z;
        handler.sendMessage(handler.obtainMessage(7, eVar));
    }

    /* renamed from: d */
    public final void m29079d(C5400m mVar) {
        synchronized (f37392D) {
            if (this.f10135w != mVar) {
                this.f10135w = mVar;
                this.f10136x.clear();
            }
            this.f10136x.addAll(mVar.m29006t());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final void m29078e(C5400m mVar) {
        synchronized (f37392D) {
            if (this.f10135w == mVar) {
                this.f10135w = null;
                this.f10136x.clear();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final boolean m29076g() {
        if (this.f10126n) {
            return false;
        }
        C14010r a = C14007q.m2042b().m2043a();
        if (a != null && !a.m2035t()) {
            return false;
        }
        int a2 = this.f10131s.m2102a(this.f10129q, 203400000);
        if (a2 == -1 || a2 == 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public final boolean m29075h(C13215a aVar, int i) {
        return this.f10130r.m4276u(this.f10129q, aVar, i);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        C13813b bVar;
        C13813b bVar2;
        C13813b bVar3;
        C13813b bVar4;
        int i = message.what;
        long j = 300000;
        C5411t<?> tVar = null;
        switch (i) {
            case 1:
                if (true == ((Boolean) message.obj).booleanValue()) {
                    j = 10000;
                }
                this.f10125m = j;
                this.f10138z.removeMessages(12);
                for (C13813b<?> bVar5 : this.f10134v.keySet()) {
                    Handler handler = this.f10138z;
                    handler.sendMessageDelayed(handler.obtainMessage(12, bVar5), this.f10125m);
                }
                break;
            case 2:
                C13824g0 g0Var = (C13824g0) message.obj;
                Iterator<C13813b<?>> it = g0Var.m2562a().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else {
                        C13813b<?> next = it.next();
                        C5411t<?> tVar2 = this.f10134v.get(next);
                        if (tVar2 == null) {
                            g0Var.m2561b(next, new C13215a(13), null);
                            break;
                        } else if (tVar2.m28974O()) {
                            g0Var.m2561b(next, C13215a.f29674o, tVar2.m28954v().mo2573d());
                        } else {
                            C13215a t = tVar2.m28956t();
                            if (t != null) {
                                g0Var.m2561b(next, t, null);
                            } else {
                                tVar2.m28979J(g0Var);
                                tVar2.m28984E();
                            }
                        }
                    }
                }
            case 3:
                for (C5411t<?> tVar3 : this.f10134v.values()) {
                    tVar3.m28985D();
                    tVar3.m28984E();
                }
                break;
            case 4:
            case 8:
            case 13:
                C13845w wVar = (C13845w) message.obj;
                C5411t<?> tVar4 = this.f10134v.get(wVar.f31164c.m3626r());
                if (tVar4 == null) {
                    tVar4 = m29073j(wVar.f31164c);
                }
                if (!tVar4.m28973P() || this.f10133u.get() == wVar.f31163b) {
                    tVar4.m28983F(wVar.f31162a);
                    break;
                } else {
                    wVar.f31162a.mo29022a(f37390B);
                    tVar4.m28977L();
                    break;
                }
                break;
            case 5:
                int i2 = message.arg1;
                C13215a aVar = (C13215a) message.obj;
                Iterator<C5411t<?>> it2 = this.f10134v.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        C5411t<?> next2 = it2.next();
                        if (next2.m28958r() == i2) {
                            tVar = next2;
                        }
                    }
                }
                if (tVar != null) {
                    if (aVar.m4298p() == 13) {
                        String d = this.f10130r.mo4272d(aVar.m4298p());
                        String r = aVar.m4297r();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(d).length() + 69 + String.valueOf(r).length());
                        sb2.append("Error resolution was canceled by the user, original error message: ");
                        sb2.append(d);
                        sb2.append(": ");
                        sb2.append(r);
                        C5411t.m28951y(tVar, new Status(17, sb2.toString()));
                        break;
                    } else {
                        C5411t.m28951y(tVar, m29074i(C5411t.m28953w(tVar), aVar));
                        break;
                    }
                } else {
                    StringBuilder sb3 = new StringBuilder(76);
                    sb3.append("Could not find API instance ");
                    sb3.append(i2);
                    sb3.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb3.toString(), new Exception());
                    break;
                }
            case 6:
                if (this.f10129q.getApplicationContext() instanceof Application) {
                    ComponentCallbacks2C5372a.m29099c((Application) this.f10129q.getApplicationContext());
                    ComponentCallbacks2C5372a.m29100b().m29101a(new C5404o(this));
                    if (!ComponentCallbacks2C5372a.m29100b().m29097e(true)) {
                        this.f10125m = 300000L;
                        break;
                    }
                }
                break;
            case 7:
                m29073j((AbstractC13468e) message.obj);
                break;
            case 9:
                if (this.f10134v.containsKey(message.obj)) {
                    this.f10134v.get(message.obj).m28978K();
                    break;
                }
                break;
            case 10:
                for (C13813b<?> bVar6 : this.f10137y) {
                    C5411t<?> remove = this.f10134v.remove(bVar6);
                    if (remove != null) {
                        remove.m28977L();
                    }
                }
                this.f10137y.clear();
                break;
            case 11:
                if (this.f10134v.containsKey(message.obj)) {
                    this.f10134v.get(message.obj).m28976M();
                    break;
                }
                break;
            case 12:
                if (this.f10134v.containsKey(message.obj)) {
                    this.f10134v.get(message.obj).m28972a();
                    break;
                }
                break;
            case 14:
                C5402n nVar = (C5402n) message.obj;
                C13813b<?> a = nVar.m29003a();
                if (!this.f10134v.containsKey(a)) {
                    nVar.m29002b().m28900c(Boolean.FALSE);
                    break;
                } else {
                    nVar.m29002b().m28900c(Boolean.valueOf(C5411t.m28975N(this.f10134v.get(a), false)));
                    break;
                }
            case 15:
                C5412u uVar = (C5412u) message.obj;
                Map<C13813b<?>, C5411t<?>> map = this.f10134v;
                bVar = uVar.f10215a;
                if (map.containsKey(bVar)) {
                    Map<C13813b<?>, C5411t<?>> map2 = this.f10134v;
                    bVar2 = uVar.f10215a;
                    C5411t.m28987B(map2.get(bVar2), uVar);
                    break;
                }
                break;
            case 16:
                C5412u uVar2 = (C5412u) message.obj;
                Map<C13813b<?>, C5411t<?>> map3 = this.f10134v;
                bVar3 = uVar2.f10215a;
                if (map3.containsKey(bVar3)) {
                    Map<C13813b<?>, C5411t<?>> map4 = this.f10134v;
                    bVar4 = uVar2.f10215a;
                    C5411t.m28986C(map4.get(bVar4), uVar2);
                    break;
                }
                break;
            case 17:
                m29071l();
                break;
            case 18:
                C5417z zVar = (C5417z) message.obj;
                if (zVar.f10234c == 0) {
                    m29072k().mo147f(new C14016t(zVar.f10233b, Arrays.asList(zVar.f10232a)));
                    break;
                } else {
                    C14016t tVar5 = this.f10127o;
                    if (tVar5 != null) {
                        List<C13993m> r2 = tVar5.m2026r();
                        if (tVar5.m2027p() != zVar.f10233b || (r2 != null && r2.size() >= zVar.f10235d)) {
                            this.f10138z.removeMessages(17);
                            m29071l();
                        } else {
                            this.f10127o.m2025t(zVar.f10232a);
                        }
                    }
                    if (this.f10127o == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(zVar.f10232a);
                        this.f10127o = new C14016t(zVar.f10233b, arrayList);
                        Handler handler2 = this.f10138z;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), zVar.f10234c);
                        break;
                    }
                }
                break;
            case 19:
                this.f10126n = false;
                break;
            default:
                StringBuilder sb4 = new StringBuilder(31);
                sb4.append("Unknown message id: ");
                sb4.append(i);
                Log.w("GoogleApiManager", sb4.toString());
                return false;
        }
        return true;
    }

    /* renamed from: n */
    public final int m29069n() {
        return this.f10132t.getAndIncrement();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public final C5411t m29059x(C13813b<?> bVar) {
        return this.f10134v.get(bVar);
    }
}
