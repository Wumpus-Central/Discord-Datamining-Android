package fk;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import okio.C11440a;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u0004\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0005H\u0014R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, m15073d2 = {"Lfk/x;", "Lokio/a;", "Ljava/io/IOException;", "cause", "t", "", "x", "Ljava/net/Socket;", "m", "Ljava/net/Socket;", "socket", "<init>", "(Ljava/net/Socket;)V", "okio"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: fk.x */
/* loaded from: classes8.dex */
public final class C7381x extends C11440a {

    /* renamed from: m */
    private final Socket f15900m;

    public C7381x(Socket socket) {
        C9971q.m14633g(socket, "socket");
        this.f15900m = socket;
    }

    @Override // okio.C11440a
    /* renamed from: t */
    protected IOException mo382t(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // okio.C11440a
    /* renamed from: x */
    protected void mo381x() {
        Logger logger;
        Logger logger2;
        try {
            this.f15900m.close();
        } catch (AssertionError e) {
            if (C7366m.m22818e(e)) {
                logger2 = C7367n.f15865a;
                Level level = Level.WARNING;
                logger2.log(level, "Failed to close timed out socket " + this.f15900m, (Throwable) e);
                return;
            }
            throw e;
        } catch (Exception e2) {
            logger = C7367n.f15865a;
            Level level2 = Level.WARNING;
            logger.log(level2, "Failed to close timed out socket " + this.f15900m, (Throwable) e2);
        }
    }
}
