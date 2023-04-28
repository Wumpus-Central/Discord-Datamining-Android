package okio;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m15074d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\b\b\u0016\u0018\u0000 \t2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\b\u0010\r\u001a\u00020\u0000H\u0016J\b\u0010\u000e\u001a\u00020\u0000H\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016R\u0016\u0010\u0012\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011R\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0013¨\u0006\u0017"}, m15073d2 = {"Lokio/Timeout;", "", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "g", "h", "", "e", "c", "deadlineNanoTime", "d", "b", "a", "", "f", "Z", "hasDeadline", "J", "timeoutNanos", "<init>", "()V", "okio"}, m15072k = 1, m15071mv = {1, 4, 0})
/* loaded from: classes8.dex */
public class Timeout {

    /* renamed from: a */
    private boolean f25548a;

    /* renamed from: b */
    private long f25549b;

    /* renamed from: c */
    private long f25550c;

    /* renamed from: e */
    public static final C11439b f25547e = new C11439b(null);

    /* renamed from: d */
    public static final Timeout f25546d = new C11438a();

    @Metadata(m15074d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000b"}, m15073d2 = {"okio/Timeout$a", "Lokio/Timeout;", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "g", "deadlineNanoTime", "d", "", "f", "okio"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: okio.Timeout$a */
    /* loaded from: classes8.dex */
    public static final class C11438a extends Timeout {
        C11438a() {
        }

        @Override // okio.Timeout
        /* renamed from: d */
        public Timeout mo9681d(long j) {
            return this;
        }

        @Override // okio.Timeout
        /* renamed from: f */
        public void mo9680f() {
        }

        @Override // okio.Timeout
        /* renamed from: g */
        public Timeout mo9679g(long j, TimeUnit unit) {
            C9971q.m14633g(unit, "unit");
            return this;
        }
    }

    @Metadata(m15074d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m15073d2 = {"Lokio/Timeout$b;", "", "Lokio/Timeout;", "NONE", "Lokio/Timeout;", "<init>", "()V", "okio"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: okio.Timeout$b */
    /* loaded from: classes8.dex */
    public static final class C11439b {
        private C11439b() {
        }

        public /* synthetic */ C11439b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public Timeout mo9686a() {
        this.f25548a = false;
        return this;
    }

    /* renamed from: b */
    public Timeout mo9685b() {
        this.f25550c = 0L;
        return this;
    }

    /* renamed from: c */
    public long mo9684c() {
        if (this.f25548a) {
            return this.f25549b;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    /* renamed from: d */
    public Timeout mo9681d(long j) {
        this.f25548a = true;
        this.f25549b = j;
        return this;
    }

    /* renamed from: e */
    public boolean mo9683e() {
        return this.f25548a;
    }

    /* renamed from: f */
    public void mo9680f() {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        } else if (this.f25548a && this.f25549b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    /* renamed from: g */
    public Timeout mo9679g(long j, TimeUnit unit) {
        boolean z;
        C9971q.m14633g(unit, "unit");
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f25550c = unit.toNanos(j);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j).toString());
    }

    /* renamed from: h */
    public long mo9682h() {
        return this.f25550c;
    }
}
