package p031bk;

import java.util.logging.Handler;
import java.util.logging.LogRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016¨\u0006\n"}, m15073d2 = {"Lbk/f;", "Ljava/util/logging/Handler;", "Ljava/util/logging/LogRecord;", "record", "", "publish", "flush", "close", "<init>", "()V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: bk.f */
/* loaded from: classes8.dex */
public final class C3731f extends Handler {

    /* renamed from: a */
    public static final C3731f f6070a = new C3731f();

    private C3731f() {
    }

    @Override // java.util.logging.Handler
    public void close() {
    }

    @Override // java.util.logging.Handler
    public void flush() {
    }

    @Override // java.util.logging.Handler
    public void publish(LogRecord record) {
        int b;
        C9971q.m14633g(record, "record");
        C3730e eVar = C3730e.f6069c;
        String loggerName = record.getLoggerName();
        C9971q.m14634f(loggerName, "record.loggerName");
        b = C3732g.m33722b(record);
        String message = record.getMessage();
        C9971q.m14634f(message, "record.message");
        eVar.m33727a(loggerName, b, message, record.getThrown());
    }
}
