package p373uj;

import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m15074d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0019\u001a\u00020\t\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0003\u001a\u00020\u0002H&J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\n\u001a\u00020\tH\u0016R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\bR\"\u0010\u0016\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0019\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0017\u001a\u0004\b\u0010\u0010\u0018R\u0017\u0010\u001d\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b\u000b\u0010\u001c¨\u0006 "}, m15073d2 = {"Luj/a;", "", "", "f", "Luj/d;", "queue", "", "e", "(Luj/d;)V", "", "toString", "a", "Luj/d;", "d", "()Luj/d;", "setQueue$okhttp", "b", "J", "c", "()J", "g", "(J)V", "nextExecuteNanoTime", "Ljava/lang/String;", "()Ljava/lang/String;", "name", "", "Z", "()Z", "cancelable", "<init>", "(Ljava/lang/String;Z)V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: uj.a */
/* loaded from: classes8.dex */
public abstract class AbstractC13366a {

    /* renamed from: a */
    private C13369d f29920a;

    /* renamed from: b */
    private long f29921b;

    /* renamed from: c */
    private final String f29922c;

    /* renamed from: d */
    private final boolean f29923d;

    public AbstractC13366a(String name, boolean z) {
        C9971q.m14633g(name, "name");
        this.f29922c = name;
        this.f29923d = z;
        this.f29921b = -1L;
    }

    /* renamed from: a */
    public final boolean m3847a() {
        return this.f29923d;
    }

    /* renamed from: b */
    public final String m3846b() {
        return this.f29922c;
    }

    /* renamed from: c */
    public final long m3845c() {
        return this.f29921b;
    }

    /* renamed from: d */
    public final C13369d m3844d() {
        return this.f29920a;
    }

    /* renamed from: e */
    public final void m3843e(C13369d queue) {
        boolean z;
        C9971q.m14633g(queue, "queue");
        C13369d dVar = this.f29920a;
        if (dVar != queue) {
            if (dVar == null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f29920a = queue;
                return;
            }
            throw new IllegalStateException("task is in multiple queues".toString());
        }
    }

    /* renamed from: f */
    public abstract long mo469f();

    /* renamed from: g */
    public final void m3842g(long j) {
        this.f29921b = j;
    }

    public String toString() {
        return this.f29922c;
    }

    public /* synthetic */ AbstractC13366a(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? true : z);
    }
}
