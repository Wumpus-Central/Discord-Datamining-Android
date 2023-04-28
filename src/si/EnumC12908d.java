package si;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

@Metadata(m15074d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0007\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, m15073d2 = {"Lsi/d;", "", "Ljava/util/concurrent/TimeUnit;", "k", "Ljava/util/concurrent/TimeUnit;", "b", "()Ljava/util/concurrent/TimeUnit;", "timeUnit", "<init>", "(Ljava/lang/String;ILjava/util/concurrent/TimeUnit;)V", "l", "m", "n", "o", "p", "q", "r", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: si.d */
/* loaded from: classes8.dex */
public enum EnumC12908d {
    NANOSECONDS(TimeUnit.NANOSECONDS),
    MICROSECONDS(TimeUnit.MICROSECONDS),
    MILLISECONDS(TimeUnit.MILLISECONDS),
    SECONDS(TimeUnit.SECONDS),
    MINUTES(TimeUnit.MINUTES),
    HOURS(TimeUnit.HOURS),
    DAYS(TimeUnit.DAYS);
    

    /* renamed from: k */
    private final TimeUnit f28996k;

    EnumC12908d(TimeUnit timeUnit) {
        this.f28996k = timeUnit;
    }

    /* renamed from: b */
    public final TimeUnit m5087b() {
        return this.f28996k;
    }
}
