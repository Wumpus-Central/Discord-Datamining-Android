package fk;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import okio.Timeout;

@Metadata(m15074d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0018\u0010\u0017J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001J\u0018\u0010\b\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016J\u0010\u0010\u000e\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0004H\u0016J\b\u0010\u000f\u001a\u00020\u0001H\u0016J\b\u0010\u0010\u001a\u00020\u0001H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016R\"\u0010\u0002\u001a\u00020\u00018\u0007@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m15073d2 = {"Lfk/h;", "Lokio/Timeout;", "delegate", "j", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "g", "h", "", "e", "c", "deadlineNanoTime", "d", "b", "a", "", "f", "Lokio/Timeout;", "i", "()Lokio/Timeout;", "setDelegate", "(Lokio/Timeout;)V", "<init>", "okio"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: fk.h */
/* loaded from: classes8.dex */
public class C7360h extends Timeout {

    /* renamed from: f */
    private Timeout f15850f;

    public C7360h(Timeout delegate) {
        C9971q.m14633g(delegate, "delegate");
        this.f15850f = delegate;
    }

    @Override // okio.Timeout
    /* renamed from: a */
    public Timeout mo9686a() {
        return this.f15850f.mo9686a();
    }

    @Override // okio.Timeout
    /* renamed from: b */
    public Timeout mo9685b() {
        return this.f15850f.mo9685b();
    }

    @Override // okio.Timeout
    /* renamed from: c */
    public long mo9684c() {
        return this.f15850f.mo9684c();
    }

    @Override // okio.Timeout
    /* renamed from: d */
    public Timeout mo9681d(long j) {
        return this.f15850f.mo9681d(j);
    }

    @Override // okio.Timeout
    /* renamed from: e */
    public boolean mo9683e() {
        return this.f15850f.mo9683e();
    }

    @Override // okio.Timeout
    /* renamed from: f */
    public void mo9680f() {
        this.f15850f.mo9680f();
    }

    @Override // okio.Timeout
    /* renamed from: g */
    public Timeout mo9679g(long j, TimeUnit unit) {
        C9971q.m14633g(unit, "unit");
        return this.f15850f.mo9679g(j, unit);
    }

    @Override // okio.Timeout
    /* renamed from: h */
    public long mo9682h() {
        return this.f15850f.mo9682h();
    }

    /* renamed from: i */
    public final Timeout m22833i() {
        return this.f15850f;
    }

    /* renamed from: j */
    public final C7360h m22832j(Timeout delegate) {
        C9971q.m14633g(delegate, "delegate");
        this.f15850f = delegate;
        return this;
    }
}
