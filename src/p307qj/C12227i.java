package p307qj;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import p373uj.C13370e;
import p389vj.C13555h;

@Metadata(m15074d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB!\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0007\u0010\u000fB\t\b\u0016¢\u0006\u0004\b\u0007\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\u0011"}, m15073d2 = {"Lqj/i;", "", "Lvj/h;", "a", "Lvj/h;", "()Lvj/h;", "delegate", "<init>", "(Lvj/h;)V", "", "maxIdleConnections", "", "keepAliveDuration", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "(IJLjava/util/concurrent/TimeUnit;)V", "()V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: qj.i */
/* loaded from: classes8.dex */
public final class C12227i {

    /* renamed from: a */
    private final C13555h f27500a;

    public C12227i(C13555h delegate) {
        C9971q.m14633g(delegate, "delegate");
        this.f27500a = delegate;
    }

    /* renamed from: a */
    public final C13555h m7346a() {
        return this.f27500a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C12227i(int i, long j, TimeUnit timeUnit) {
        this(new C13555h(C13370e.f29933h, i, j, timeUnit));
        C9971q.m14633g(timeUnit, "timeUnit");
    }

    public C12227i() {
        this(5, 5L, TimeUnit.MINUTES);
    }
}
