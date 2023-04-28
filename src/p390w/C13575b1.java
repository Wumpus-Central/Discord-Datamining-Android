package p390w;

import android.view.Surface;
import androidx.concurrent.futures.C2114c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p120gc.AbstractFutureC7576b;
import p390w.AbstractC13689w0;
import p431y.AbstractC14182c;
import p431y.C14186f;

/* renamed from: w.b1 */
/* loaded from: classes.dex */
public final class C13575b1 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w.b1$a */
    /* loaded from: classes.dex */
    public class C13576a implements AbstractC14182c<List<Surface>> {

        /* renamed from: a */
        final /* synthetic */ boolean f30364a;

        /* renamed from: b */
        final /* synthetic */ C2114c.C2115a f30365b;

        /* renamed from: c */
        final /* synthetic */ ScheduledFuture f30366c;

        C13576a(boolean z, C2114c.C2115a aVar, ScheduledFuture scheduledFuture) {
            this.f30364a = z;
            this.f30365b = aVar;
            this.f30366c = scheduledFuture;
        }

        /* renamed from: b */
        public void mo1412a(List<Surface> list) {
            ArrayList arrayList = new ArrayList(list);
            if (this.f30364a) {
                arrayList.removeAll(Collections.singleton(null));
            }
            this.f30365b.m38961c(arrayList);
            this.f30366c.cancel(true);
        }

        @Override // p431y.AbstractC14182c
        public void onFailure(Throwable th2) {
            this.f30365b.m38961c(Collections.unmodifiableList(Collections.emptyList()));
            this.f30366c.cancel(true);
        }
    }

    /* renamed from: e */
    public static void m3325e(List<AbstractC13689w0> list) {
        for (AbstractC13689w0 w0Var : list) {
            w0Var.m3022d();
        }
    }

    /* renamed from: f */
    public static void m3324f(List<AbstractC13689w0> list) {
        if (!list.isEmpty()) {
            int i = 0;
            do {
                try {
                    list.get(i).m3016j();
                    i++;
                } catch (AbstractC13689w0.C13690a e) {
                    for (int i2 = i - 1; i2 >= 0; i2--) {
                        list.get(i2).m3022d();
                    }
                    throw e;
                }
            } while (i < list.size());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ void m3323g(AbstractFutureC7576b bVar, C2114c.C2115a aVar, long j) {
        if (!bVar.isDone()) {
            aVar.m38958f(new TimeoutException("Cannot complete surfaceList within " + j));
            bVar.cancel(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ void m3322h(Executor executor, final AbstractFutureC7576b bVar, final C2114c.C2115a aVar, final long j) {
        executor.execute(new Runnable() { // from class: w.x0
            @Override // java.lang.Runnable
            public final void run() {
                C13575b1.m3323g(AbstractFutureC7576b.this, aVar, j);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static /* synthetic */ Object m3320j(List list, ScheduledExecutorService scheduledExecutorService, final Executor executor, final long j, boolean z, final C2114c.C2115a aVar) {
        final AbstractFutureC7576b n = C14186f.m1415n(list);
        ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new Runnable() { // from class: w.z0
            @Override // java.lang.Runnable
            public final void run() {
                C13575b1.m3322h(executor, n, aVar, j);
            }
        }, j, TimeUnit.MILLISECONDS);
        aVar.m38963a(new Runnable() { // from class: w.a1
            @Override // java.lang.Runnable
            public final void run() {
                AbstractFutureC7576b.this.cancel(true);
            }
        }, executor);
        C14186f.m1427b(n, new C13576a(z, aVar, schedule), executor);
        return "surfaceList";
    }

    /* renamed from: k */
    public static AbstractFutureC7576b<List<Surface>> m3319k(Collection<AbstractC13689w0> collection, final boolean z, final long j, final Executor executor, final ScheduledExecutorService scheduledExecutorService) {
        final ArrayList arrayList = new ArrayList();
        for (AbstractC13689w0 w0Var : collection) {
            arrayList.add(C14186f.m1419j(w0Var.m3018h()));
        }
        return C2114c.m38964a(new C2114c.AbstractC0030c() { // from class: w.y0
            @Override // androidx.concurrent.futures.C2114c.AbstractC0030c
            /* renamed from: a */
            public final Object mo1403a(C2114c.C2115a aVar) {
                Object j2;
                j2 = C13575b1.m3320j(arrayList, scheduledExecutorService, executor, j, z, aVar);
                return j2;
            }
        });
    }
}
