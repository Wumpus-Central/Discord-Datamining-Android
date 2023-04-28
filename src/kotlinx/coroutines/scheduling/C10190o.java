package kotlinx.coroutines.scheduling;

import androidx.concurrent.futures.C2113b;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;

@Metadata(m15074d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b(\u0010)J\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u0012*\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0011J!\u0010\u0017\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0000¢\u0006\u0004\b\u001b\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\f¢\u0006\u0004\b\u001d\u0010\u001eR\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010 R\u0014\u0010%\u001a\u00020\"8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\"8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b&\u0010$¨\u0006*"}, m15073d2 = {"Lkotlinx/coroutines/scheduling/o;", "", "Lkotlinx/coroutines/scheduling/h;", "task", "c", "(Lkotlinx/coroutines/scheduling/h;)Lkotlinx/coroutines/scheduling/h;", "victim", "", "blockingOnly", "", "m", "(Lkotlinx/coroutines/scheduling/o;Z)J", "Lkotlinx/coroutines/scheduling/d;", "queue", "j", "(Lkotlinx/coroutines/scheduling/d;)Z", "i", "()Lkotlinx/coroutines/scheduling/h;", "", "d", "(Lkotlinx/coroutines/scheduling/h;)V", "h", "fair", "a", "(Lkotlinx/coroutines/scheduling/h;Z)Lkotlinx/coroutines/scheduling/h;", "l", "(Lkotlinx/coroutines/scheduling/o;)J", "k", "globalQueue", "g", "(Lkotlinx/coroutines/scheduling/d;)V", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "buffer", "", "e", "()I", "bufferSize", "f", "size", "<init>", "()V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.scheduling.o */
/* loaded from: classes8.dex */
public final class C10190o {

    /* renamed from: b */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f22424b = AtomicReferenceFieldUpdater.newUpdater(C10190o.class, Object.class, "lastScheduledTask");

    /* renamed from: c */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f22425c = AtomicIntegerFieldUpdater.newUpdater(C10190o.class, "producerIndex");

    /* renamed from: d */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f22426d = AtomicIntegerFieldUpdater.newUpdater(C10190o.class, "consumerIndex");

    /* renamed from: e */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f22427e = AtomicIntegerFieldUpdater.newUpdater(C10190o.class, "blockingTasksInBuffer");

    /* renamed from: a */
    private final AtomicReferenceArray<AbstractRunnableC10183h> f22428a = new AtomicReferenceArray<>(128);
    private volatile /* synthetic */ Object lastScheduledTask = null;
    private volatile /* synthetic */ int producerIndex = 0;
    private volatile /* synthetic */ int consumerIndex = 0;
    private volatile /* synthetic */ int blockingTasksInBuffer = 0;

    /* renamed from: b */
    public static /* synthetic */ AbstractRunnableC10183h m14049b(C10190o oVar, AbstractRunnableC10183h hVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return oVar.m14050a(hVar, z);
    }

    /* renamed from: c */
    private final AbstractRunnableC10183h m14048c(AbstractRunnableC10183h hVar) {
        boolean z = true;
        if (hVar.f22413l.mo14053b() != 1) {
            z = false;
        }
        if (z) {
            f22427e.incrementAndGet(this);
        }
        if (m14046e() == 127) {
            return hVar;
        }
        int i = this.producerIndex & 127;
        while (this.f22428a.get(i) != null) {
            Thread.yield();
        }
        this.f22428a.lazySet(i, hVar);
        f22425c.incrementAndGet(this);
        return null;
    }

    /* renamed from: d */
    private final void m14047d(AbstractRunnableC10183h hVar) {
        if (hVar != null) {
            boolean z = true;
            if (hVar.f22413l.mo14053b() != 1) {
                z = false;
            }
            if (z) {
                f22427e.decrementAndGet(this);
            }
        }
    }

    /* renamed from: i */
    private final AbstractRunnableC10183h m14042i() {
        AbstractRunnableC10183h andSet;
        while (true) {
            int i = this.consumerIndex;
            if (i - this.producerIndex == 0) {
                return null;
            }
            int i2 = i & 127;
            if (f22426d.compareAndSet(this, i, i + 1) && (andSet = this.f22428a.getAndSet(i2, null)) != null) {
                m14047d(andSet);
                return andSet;
            }
        }
    }

    /* renamed from: j */
    private final boolean m14041j(C10179d dVar) {
        AbstractRunnableC10183h i = m14042i();
        if (i == null) {
            return false;
        }
        dVar.m14231a(i);
        return true;
    }

    /* renamed from: m */
    private final long m14038m(C10190o oVar, boolean z) {
        AbstractRunnableC10183h hVar;
        do {
            hVar = (AbstractRunnableC10183h) oVar.lastScheduledTask;
            if (hVar == null) {
                return -2L;
            }
            if (z) {
                boolean z2 = true;
                if (hVar.f22413l.mo14053b() != 1) {
                    z2 = false;
                }
                if (!z2) {
                    return -2L;
                }
            }
            long a = C10187l.f22420e.mo14055a() - hVar.f22412k;
            long j = C10187l.f22416a;
            if (a < j) {
                return j - a;
            }
        } while (!C2113b.m38965a(f22424b, oVar, hVar, null));
        m14049b(this, hVar, false, 2, null);
        return -1L;
    }

    /* renamed from: a */
    public final AbstractRunnableC10183h m14050a(AbstractRunnableC10183h hVar, boolean z) {
        if (z) {
            return m14048c(hVar);
        }
        AbstractRunnableC10183h hVar2 = (AbstractRunnableC10183h) f22424b.getAndSet(this, hVar);
        if (hVar2 == null) {
            return null;
        }
        return m14048c(hVar2);
    }

    /* renamed from: e */
    public final int m14046e() {
        return this.producerIndex - this.consumerIndex;
    }

    /* renamed from: f */
    public final int m14045f() {
        return this.lastScheduledTask != null ? m14046e() + 1 : m14046e();
    }

    /* renamed from: g */
    public final void m14044g(C10179d dVar) {
        AbstractRunnableC10183h hVar = (AbstractRunnableC10183h) f22424b.getAndSet(this, null);
        if (hVar != null) {
            dVar.m14231a(hVar);
        }
        do {
        } while (m14041j(dVar));
    }

    /* renamed from: h */
    public final AbstractRunnableC10183h m14043h() {
        AbstractRunnableC10183h hVar = (AbstractRunnableC10183h) f22424b.getAndSet(this, null);
        return hVar == null ? m14042i() : hVar;
    }

    /* renamed from: k */
    public final long m14040k(C10190o oVar) {
        int i = oVar.consumerIndex;
        int i2 = oVar.producerIndex;
        AtomicReferenceArray<AbstractRunnableC10183h> atomicReferenceArray = oVar.f22428a;
        while (true) {
            boolean z = true;
            if (i == i2) {
                break;
            }
            int i3 = i & 127;
            if (oVar.blockingTasksInBuffer == 0) {
                break;
            }
            AbstractRunnableC10183h hVar = atomicReferenceArray.get(i3);
            if (hVar != null) {
                if (hVar.f22413l.mo14053b() != 1) {
                    z = false;
                }
                if (z && C10189n.m14051a(atomicReferenceArray, i3, hVar, null)) {
                    f22427e.decrementAndGet(oVar);
                    m14049b(this, hVar, false, 2, null);
                    return -1L;
                }
            }
            i++;
        }
        return m14038m(oVar, true);
    }

    /* renamed from: l */
    public final long m14039l(C10190o oVar) {
        AbstractRunnableC10183h i = oVar.m14042i();
        if (i == null) {
            return m14038m(oVar, false);
        }
        m14049b(this, i, false, 2, null);
        return -1L;
    }
}
