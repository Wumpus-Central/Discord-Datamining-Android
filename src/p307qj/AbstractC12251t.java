package p307qj;

import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import okhttp3.Response;
import okhttp3.WebSocket;
import okio.ByteString;

@Metadata(m15074d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016J \u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\bH\u0016J \u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\bH\u0016J\"\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\u0017"}, m15073d2 = {"Lqj/t;", "", "Lokhttp3/WebSocket;", "webSocket", "Lokhttp3/Response;", "response", "", "onOpen", "", "text", "onMessage", "Lokio/ByteString;", "bytes", "", "code", "reason", "onClosing", "onClosed", "", "t", "onFailure", "<init>", "()V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: qj.t */
/* loaded from: classes8.dex */
public abstract class AbstractC12251t {
    public void onClosed(WebSocket webSocket, int i, String reason) {
        C9971q.m14633g(webSocket, "webSocket");
        C9971q.m14633g(reason, "reason");
    }

    public void onClosing(WebSocket webSocket, int i, String reason) {
        C9971q.m14633g(webSocket, "webSocket");
        C9971q.m14633g(reason, "reason");
    }

    public void onFailure(WebSocket webSocket, Throwable t, Response response) {
        C9971q.m14633g(webSocket, "webSocket");
        C9971q.m14633g(t, "t");
    }

    public void onMessage(WebSocket webSocket, String text) {
        C9971q.m14633g(webSocket, "webSocket");
        C9971q.m14633g(text, "text");
    }

    public void onMessage(WebSocket webSocket, ByteString bytes) {
        C9971q.m14633g(webSocket, "webSocket");
        C9971q.m14633g(bytes, "bytes");
    }

    public void onOpen(WebSocket webSocket, Response response) {
        C9971q.m14633g(webSocket, "webSocket");
        C9971q.m14633g(response, "response");
    }
}
