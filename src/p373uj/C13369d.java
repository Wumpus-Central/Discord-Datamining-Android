package p373uj;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.C9971q;
import p327rj.C12729c;

@Metadata(m15074d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010)\u001a\u00020%\u0012\u0006\u0010-\u001a\u00020\u0010¢\u0006\u0004\b.\u0010/J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004J'\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\f\u001a\u00020\u0006J\u0006\u0010\r\u001a\u00020\u0006J\u000f\u0010\u000e\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0011\u001a\u00020\u0010H\u0016R\"\u0010\u0016\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0012\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0015R$\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR \u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001e\u001a\u0004\b\u001f\u0010 R\"\u0010$\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0012\u001a\u0004\b\"\u0010\u000f\"\u0004\b#\u0010\u0015R\u001a\u0010)\u001a\u00020%8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010-\u001a\u00020\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b*\u0010,¨\u00060"}, m15073d2 = {"Luj/d;", "", "Luj/a;", "task", "", "delayNanos", "", "i", "", "recurrence", "k", "(Luj/a;JZ)Z", "a", "n", "b", "()Z", "", "toString", "Z", "g", "setShutdown$okhttp", "(Z)V", "shutdown", "Luj/a;", "c", "()Luj/a;", "l", "(Luj/a;)V", "activeTask", "", "Ljava/util/List;", "e", "()Ljava/util/List;", "futureTasks", "d", "m", "cancelActiveTask", "Luj/e;", "Luj/e;", "h", "()Luj/e;", "taskRunner", "f", "Ljava/lang/String;", "()Ljava/lang/String;", "name", "<init>", "(Luj/e;Ljava/lang/String;)V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: uj.d */
/* loaded from: classes8.dex */
public final class C13369d {

    /* renamed from: a */
    private boolean f29927a;

    /* renamed from: b */
    private AbstractC13366a f29928b;

    /* renamed from: c */
    private final List<AbstractC13366a> f29929c = new ArrayList();

    /* renamed from: d */
    private boolean f29930d;

    /* renamed from: e */
    private final C13370e f29931e;

    /* renamed from: f */
    private final String f29932f;

    public C13369d(C13370e taskRunner, String name) {
        C9971q.m14633g(taskRunner, "taskRunner");
        C9971q.m14633g(name, "name");
        this.f29931e = taskRunner;
        this.f29932f = name;
    }

    /* renamed from: j */
    public static /* synthetic */ void m3829j(C13369d dVar, AbstractC13366a aVar, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        dVar.m3830i(aVar, j);
    }

    /* renamed from: a */
    public final void m3838a() {
        if (!C12729c.f28589h || !Thread.holdsLock(this)) {
            synchronized (this.f29931e) {
                if (m3837b()) {
                    this.f29931e.m3817h(this);
                }
                Unit unit = Unit.f22042a;
            }
            return;
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

    /* renamed from: b */
    public final boolean m3837b() {
        AbstractC13366a aVar = this.f29928b;
        if (aVar != null) {
            C9971q.m14636d(aVar);
            if (aVar.m3847a()) {
                this.f29930d = true;
            }
        }
        boolean z = false;
        for (int size = this.f29929c.size() - 1; size >= 0; size--) {
            if (this.f29929c.get(size).m3847a()) {
                AbstractC13366a aVar2 = this.f29929c.get(size);
                if (C13370e.f29935j.m3814a().isLoggable(Level.FINE)) {
                    C13367b.m3841a(aVar2, this, "canceled");
                }
                this.f29929c.remove(size);
                z = true;
            }
        }
        return z;
    }

    /* renamed from: c */
    public final AbstractC13366a m3836c() {
        return this.f29928b;
    }

    /* renamed from: d */
    public final boolean m3835d() {
        return this.f29930d;
    }

    /* renamed from: e */
    public final List<AbstractC13366a> m3834e() {
        return this.f29929c;
    }

    /* renamed from: f */
    public final String m3833f() {
        return this.f29932f;
    }

    /* renamed from: g */
    public final boolean m3832g() {
        return this.f29927a;
    }

    /* renamed from: h */
    public final C13370e m3831h() {
        return this.f29931e;
    }

    /* renamed from: i */
    public final void m3830i(AbstractC13366a task, long j) {
        C9971q.m14633g(task, "task");
        synchronized (this.f29931e) {
            if (!this.f29927a) {
                if (m3828k(task, j, false)) {
                    this.f29931e.m3817h(this);
                }
                Unit unit = Unit.f22042a;
            } else if (task.m3847a()) {
                if (C13370e.f29935j.m3814a().isLoggable(Level.FINE)) {
                    C13367b.m3841a(task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (C13370e.f29935j.m3814a().isLoggable(Level.FINE)) {
                    C13367b.m3841a(task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    /* renamed from: k */
    public final boolean m3828k(AbstractC13366a task, long j, boolean z) {
        boolean z2;
        String str;
        C9971q.m14633g(task, "task");
        task.m3843e(this);
        long c = this.f29931e.m3818g().mo3811c();
        long j2 = c + j;
        int indexOf = this.f29929c.indexOf(task);
        if (indexOf != -1) {
            if (task.m3845c() <= j2) {
                if (C13370e.f29935j.m3814a().isLoggable(Level.FINE)) {
                    C13367b.m3841a(task, this, "already scheduled");
                }
                return false;
            }
            this.f29929c.remove(indexOf);
        }
        task.m3842g(j2);
        if (C13370e.f29935j.m3814a().isLoggable(Level.FINE)) {
            if (z) {
                str = "run again after " + C13367b.m3840b(j2 - c);
            } else {
                str = "scheduled after " + C13367b.m3840b(j2 - c);
            }
            C13367b.m3841a(task, this, str);
        }
        Iterator<AbstractC13366a> it = this.f29929c.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (it.next().m3845c() - c > j) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                break;
            }
            i++;
        }
        if (i == -1) {
            i = this.f29929c.size();
        }
        this.f29929c.add(i, task);
        if (i == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public final void m3827l(AbstractC13366a aVar) {
        this.f29928b = aVar;
    }

    /* renamed from: m */
    public final void m3826m(boolean z) {
        this.f29930d = z;
    }

    /* renamed from: n */
    public final void m3825n() {
        if (!C12729c.f28589h || !Thread.holdsLock(this)) {
            synchronized (this.f29931e) {
                this.f29927a = true;
                if (m3837b()) {
                    this.f29931e.m3817h(this);
                }
                Unit unit = Unit.f22042a;
            }
            return;
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

    public String toString() {
        return this.f29932f;
    }
}
