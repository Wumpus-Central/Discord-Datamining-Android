package p177jc;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;
import p163j$.util.concurrent.ConcurrentHashMap;
import p300qc.AbstractC12104b;
import p300qc.AbstractC12105c;
import p300qc.AbstractC12106d;
import p300qc.C12103a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: jc.u */
/* loaded from: classes3.dex */
public class C9552u implements AbstractC12106d, AbstractC12105c {

    /* renamed from: a */
    private final Map<Class<?>, ConcurrentHashMap<AbstractC12104b<Object>, Executor>> f21163a = new HashMap();

    /* renamed from: b */
    private Queue<C12103a<?>> f21164b = new ArrayDeque();

    /* renamed from: c */
    private final Executor f21165c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9552u(Executor executor) {
        this.f21165c = executor;
    }

    /* renamed from: d */
    private synchronized Set<Map.Entry<AbstractC12104b<Object>, Executor>> m16013d(C12103a<?> aVar) {
        Set<Map.Entry<AbstractC12104b<Object>, Executor>> set;
        ConcurrentHashMap<AbstractC12104b<Object>, Executor> concurrentHashMap = this.f21163a.get(aVar.m7834a());
        if (concurrentHashMap == null) {
            set = Collections.emptySet();
        } else {
            set = concurrentHashMap.entrySet();
        }
        return set;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ void m16012e(Map.Entry entry, C12103a aVar) {
        ((AbstractC12104b) entry.getKey()).mo7833a(aVar);
    }

    @Override // p300qc.AbstractC12106d
    /* renamed from: a */
    public <T> void mo7832a(Class<T> cls, AbstractC12104b<? super T> bVar) {
        m16010g(cls, this.f21165c, bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m16014c() {
        Queue<C12103a<?>> queue;
        synchronized (this) {
            queue = this.f21164b;
            if (queue != null) {
                this.f21164b = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            for (C12103a<?> aVar : queue) {
                m16011f(aVar);
            }
        }
    }

    /* renamed from: f */
    public void m16011f(final C12103a<?> aVar) {
        C9522c0.m16097b(aVar);
        synchronized (this) {
            Queue<C12103a<?>> queue = this.f21164b;
            if (queue != null) {
                queue.add(aVar);
                return;
            }
            for (final Map.Entry<AbstractC12104b<Object>, Executor> entry : m16013d(aVar)) {
                entry.getValue().execute(new Runnable() { // from class: jc.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        C9552u.m16012e(entry, aVar);
                    }
                });
            }
        }
    }

    /* renamed from: g */
    public synchronized <T> void m16010g(Class<T> cls, Executor executor, AbstractC12104b<? super T> bVar) {
        C9522c0.m16097b(cls);
        C9522c0.m16097b(bVar);
        C9522c0.m16097b(executor);
        if (!this.f21163a.containsKey(cls)) {
            this.f21163a.put(cls, new ConcurrentHashMap<>());
        }
        this.f21163a.get(cls).put(bVar, executor);
    }
}
