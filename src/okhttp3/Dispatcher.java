package okhttp3;

import com.facebook.react.uimanager.ViewDefaults;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C9907k;
import kotlin.collections.C9914r;
import kotlin.jvm.internal.C9971q;
import p327rj.C12729c;
import p389vj.C13545e;

@Metadata(m15074d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b9\u0010:J\u0016\u0010\u0006\u001a\b\u0018\u00010\u0004R\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J+\u0010\u000e\u001a\u00020\r\"\u0004\b\u0000\u0010\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0010\u001a\u00020\r2\n\u0010\f\u001a\u00060\u0004R\u00020\u0005H\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010\u0012\u001a\u00020\rJ\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0015\u001a\u00020\r2\n\u0010\f\u001a\u00060\u0004R\u00020\u0005H\u0000¢\u0006\u0004\b\u0015\u0010\u0011J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0016\u0010\u0014J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017J\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017J\u0006\u0010\u001c\u001a\u00020\u001bR*\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b8F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R*\u0010#\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\u001b8F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u001e\u001a\u0004\b$\u0010 \"\u0004\b%\u0010\"R.\u0010-\u001a\u0004\u0018\u00010&2\b\u0010'\u001a\u0004\u0018\u00010&8F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0018\u00101\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u001e\u00104\u001a\f\u0012\b\u0012\u00060\u0004R\u00020\u0005028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00103R\u001e\u00105\u001a\f\u0012\b\u0012\u00060\u0004R\u00020\u0005028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00103R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\u0005028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u00103R\u0011\u00108\u001a\u00020.8G¢\u0006\u0006\u001a\u0004\b/\u00107¨\u0006;"}, m15073d2 = {"Lokhttp3/Dispatcher;", "", "", "host", "Lvj/e$a;", "Lvj/e;", "e", "", "j", "T", "Ljava/util/Deque;", "calls", "call", "", "f", "(Ljava/util/Deque;Ljava/lang/Object;)V", "b", "(Lvj/e$a;)V", "a", "c", "(Lvj/e;)V", "g", "h", "", "Lokhttp3/Call;", "k", "l", "", "m", "maxRequests", "I", "i", "()I", "n", "(I)V", "maxRequestsPerHost", "getMaxRequestsPerHost", "o", "Ljava/lang/Runnable;", "<set-?>", "Ljava/lang/Runnable;", "getIdleCallback", "()Ljava/lang/Runnable;", "setIdleCallback", "(Ljava/lang/Runnable;)V", "idleCallback", "Ljava/util/concurrent/ExecutorService;", "d", "Ljava/util/concurrent/ExecutorService;", "executorServiceOrNull", "Ljava/util/ArrayDeque;", "Ljava/util/ArrayDeque;", "readyAsyncCalls", "runningAsyncCalls", "runningSyncCalls", "()Ljava/util/concurrent/ExecutorService;", "executorService", "<init>", "()V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* loaded from: classes8.dex */
public final class Dispatcher {

    /* renamed from: c */
    private Runnable f25371c;

    /* renamed from: d */
    private ExecutorService f25372d;

    /* renamed from: a */
    private int f25369a = 64;

    /* renamed from: b */
    private int f25370b = 5;

    /* renamed from: e */
    private final ArrayDeque<C13545e.RunnableC13546a> f25373e = new ArrayDeque<>();

    /* renamed from: f */
    private final ArrayDeque<C13545e.RunnableC13546a> f25374f = new ArrayDeque<>();

    /* renamed from: g */
    private final ArrayDeque<C13545e> f25375g = new ArrayDeque<>();

    /* renamed from: e */
    private final C13545e.RunnableC13546a m10083e(String str) {
        Iterator<C13545e.RunnableC13546a> it = this.f25374f.iterator();
        while (it.hasNext()) {
            C13545e.RunnableC13546a next = it.next();
            if (C9971q.m14638b(next.m3399d(), str)) {
                return next;
            }
        }
        Iterator<C13545e.RunnableC13546a> it2 = this.f25373e.iterator();
        while (it2.hasNext()) {
            C13545e.RunnableC13546a next2 = it2.next();
            if (C9971q.m14638b(next2.m3399d(), str)) {
                return next2;
            }
        }
        return null;
    }

    /* renamed from: f */
    private final <T> void m10082f(Deque<T> deque, T t) {
        Runnable runnable;
        synchronized (this) {
            if (deque.remove(t)) {
                runnable = this.f25371c;
                Unit unit = Unit.f22042a;
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        if (!m10078j() && runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: j */
    private final boolean m10078j() {
        int i;
        boolean z;
        if (!C12729c.f28589h || !Thread.holdsLock(this)) {
            ArrayList arrayList = new ArrayList();
            synchronized (this) {
                Iterator<C13545e.RunnableC13546a> it = this.f25373e.iterator();
                C9971q.m14634f(it, "readyAsyncCalls.iterator()");
                while (it.hasNext()) {
                    C13545e.RunnableC13546a asyncCall = it.next();
                    if (this.f25374f.size() >= this.f25369a) {
                        break;
                    } else if (asyncCall.m3400c().get() < this.f25370b) {
                        it.remove();
                        asyncCall.m3400c().incrementAndGet();
                        C9971q.m14634f(asyncCall, "asyncCall");
                        arrayList.add(asyncCall);
                        this.f25374f.add(asyncCall);
                    }
                }
                if (m10075m() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                Unit unit = Unit.f22042a;
            }
            int size = arrayList.size();
            for (i = 0; i < size; i++) {
                ((C13545e.RunnableC13546a) arrayList.get(i)).m3402a(m10084d());
            }
            return z;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Thread ");
        Thread currentThread = Thread.currentThread();
        C9971q.m14634f(currentThread, "Thread.currentThread()");
        sb2.append(currentThread.getName());
        sb2.append(" MUST NOT hold lock on ");
        sb2.append(this);
        throw new AssertionError(sb2.toString());
    }

    /* renamed from: a */
    public final synchronized void m10087a() {
        Iterator<C13545e.RunnableC13546a> it = this.f25373e.iterator();
        while (it.hasNext()) {
            it.next().m3401b().cancel();
        }
        Iterator<C13545e.RunnableC13546a> it2 = this.f25374f.iterator();
        while (it2.hasNext()) {
            it2.next().m3401b().cancel();
        }
        Iterator<C13545e> it3 = this.f25375g.iterator();
        while (it3.hasNext()) {
            it3.next().cancel();
        }
    }

    /* renamed from: b */
    public final void m10086b(C13545e.RunnableC13546a call) {
        C13545e.RunnableC13546a e;
        C9971q.m14633g(call, "call");
        synchronized (this) {
            this.f25373e.add(call);
            if (!call.m3401b().m3412q() && (e = m10083e(call.m3399d())) != null) {
                call.m3398e(e);
            }
            Unit unit = Unit.f22042a;
        }
        m10078j();
    }

    /* renamed from: c */
    public final synchronized void m10085c(C13545e call) {
        C9971q.m14633g(call, "call");
        this.f25375g.add(call);
    }

    /* renamed from: d */
    public final synchronized ExecutorService m10084d() {
        ExecutorService executorService;
        if (this.f25372d == null) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            SynchronousQueue synchronousQueue = new SynchronousQueue();
            this.f25372d = new ThreadPoolExecutor(0, (int) ViewDefaults.NUMBER_OF_LINES, 60L, timeUnit, synchronousQueue, C12729c.m5632K(C12729c.f28590i + " Dispatcher", false));
        }
        executorService = this.f25372d;
        C9971q.m14636d(executorService);
        return executorService;
    }

    /* renamed from: g */
    public final void m10081g(C13545e.RunnableC13546a call) {
        C9971q.m14633g(call, "call");
        call.m3400c().decrementAndGet();
        m10082f(this.f25374f, call);
    }

    /* renamed from: h */
    public final void m10080h(C13545e call) {
        C9971q.m14633g(call, "call");
        m10082f(this.f25375g, call);
    }

    /* renamed from: i */
    public final synchronized int m10079i() {
        return this.f25369a;
    }

    /* renamed from: k */
    public final synchronized List<Call> m10077k() {
        int t;
        List<Call> unmodifiableList;
        ArrayDeque<C13545e.RunnableC13546a> arrayDeque = this.f25373e;
        t = C9907k.m14809t(arrayDeque, 10);
        ArrayList arrayList = new ArrayList(t);
        for (C13545e.RunnableC13546a aVar : arrayDeque) {
            arrayList.add(aVar.m3401b());
        }
        unmodifiableList = Collections.unmodifiableList(arrayList);
        C9971q.m14634f(unmodifiableList, "Collections.unmodifiable…yncCalls.map { it.call })");
        return unmodifiableList;
    }

    /* renamed from: l */
    public final synchronized List<Call> m10076l() {
        int t;
        List o0;
        List<Call> unmodifiableList;
        ArrayDeque<C13545e> arrayDeque = this.f25375g;
        ArrayDeque<C13545e.RunnableC13546a> arrayDeque2 = this.f25374f;
        t = C9907k.m14809t(arrayDeque2, 10);
        ArrayList arrayList = new ArrayList(t);
        for (C13545e.RunnableC13546a aVar : arrayDeque2) {
            arrayList.add(aVar.m3401b());
        }
        o0 = C9914r.m14750o0(arrayDeque, arrayList);
        unmodifiableList = Collections.unmodifiableList(o0);
        C9971q.m14634f(unmodifiableList, "Collections.unmodifiable…yncCalls.map { it.call })");
        return unmodifiableList;
    }

    /* renamed from: m */
    public final synchronized int m10075m() {
        return this.f25374f.size() + this.f25375g.size();
    }

    /* renamed from: n */
    public final void m10074n(int i) {
        boolean z = true;
        if (i < 1) {
            z = false;
        }
        if (z) {
            synchronized (this) {
                this.f25369a = i;
                Unit unit = Unit.f22042a;
            }
            m10078j();
            return;
        }
        throw new IllegalArgumentException(("max < 1: " + i).toString());
    }

    /* renamed from: o */
    public final void m10073o(int i) {
        boolean z = true;
        if (i < 1) {
            z = false;
        }
        if (z) {
            synchronized (this) {
                this.f25370b = i;
                Unit unit = Unit.f22042a;
            }
            m10078j();
            return;
        }
        throw new IllegalArgumentException(("max < 1: " + i).toString());
    }
}
