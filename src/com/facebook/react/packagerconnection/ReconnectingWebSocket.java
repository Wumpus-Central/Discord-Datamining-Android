package com.facebook.react.packagerconnection;

import android.os.Handler;
import android.os.Looper;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.nio.channels.ClosedChannelException;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okio.ByteString;
import p307qj.AbstractC12251t;
import p414x3.C13925a;

/* loaded from: classes7.dex */
public final class ReconnectingWebSocket extends AbstractC12251t {
    private static final int RECONNECT_DELAY_MS = 2000;
    private static final String TAG = "ReconnectingWebSocket";
    private ConnectionCallback mConnectionCallback;
    private MessageCallback mMessageCallback;
    private final OkHttpClient mOkHttpClient;
    private boolean mSuppressConnectionErrors;
    private final String mUrl;
    private WebSocket mWebSocket;
    private boolean mClosed = false;
    private final Handler mHandler = new Handler(Looper.getMainLooper());

    /* loaded from: classes7.dex */
    public interface ConnectionCallback {
        void onConnected();

        void onDisconnected();
    }

    /* loaded from: classes7.dex */
    public interface MessageCallback {
        void onMessage(String str);

        void onMessage(ByteString byteString);
    }

    public ReconnectingWebSocket(String str, MessageCallback messageCallback, ConnectionCallback connectionCallback) {
        this.mUrl = str;
        this.mMessageCallback = messageCallback;
        this.mConnectionCallback = connectionCallback;
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.mOkHttpClient = builder.m9912e(10L, timeUnit).m9917P(10L, timeUnit).m9918O(0L, TimeUnit.MINUTES).m9914c();
    }

    private void abort(String str, Throwable th2) {
        String str2 = TAG;
        C13925a.m2287k(str2, "Error occurred, shutting down websocket connection: " + str, th2);
        closeWebSocketQuietly();
    }

    private void closeWebSocketQuietly() {
        WebSocket webSocket = this.mWebSocket;
        if (webSocket != null) {
            try {
                webSocket.mo9802g(RNCWebViewManager.COMMAND_CLEAR_FORM_DATA, "End of session");
            } catch (Exception unused) {
            }
            this.mWebSocket = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void delayedReconnect() {
        if (!this.mClosed) {
            connect();
        }
    }

    private void reconnect() {
        if (!this.mClosed) {
            if (!this.mSuppressConnectionErrors) {
                String str = TAG;
                C13925a.m2304H(str, "Couldn't connect to \"" + this.mUrl + "\", will silently retry");
                this.mSuppressConnectionErrors = true;
            }
            this.mHandler.postDelayed(new Runnable() { // from class: com.facebook.react.packagerconnection.ReconnectingWebSocket.1
                @Override // java.lang.Runnable
                public void run() {
                    ReconnectingWebSocket.this.delayedReconnect();
                }
            }, 2000L);
            return;
        }
        throw new IllegalStateException("Can't reconnect closed client");
    }

    public void closeQuietly() {
        this.mClosed = true;
        closeWebSocketQuietly();
        this.mMessageCallback = null;
        ConnectionCallback connectionCallback = this.mConnectionCallback;
        if (connectionCallback != null) {
            connectionCallback.onDisconnected();
        }
    }

    public void connect() {
        if (!this.mClosed) {
            this.mOkHttpClient.m9967C(new Request.Builder().m9865l(this.mUrl).m9875b(), this);
            return;
        }
        throw new IllegalStateException("Can't connect closed client");
    }

    @Override // p307qj.AbstractC12251t
    public synchronized void onClosed(WebSocket webSocket, int i, String str) {
        this.mWebSocket = null;
        if (!this.mClosed) {
            ConnectionCallback connectionCallback = this.mConnectionCallback;
            if (connectionCallback != null) {
                connectionCallback.onDisconnected();
            }
            reconnect();
        }
    }

    @Override // p307qj.AbstractC12251t
    public synchronized void onFailure(WebSocket webSocket, Throwable th2, Response response) {
        if (this.mWebSocket != null) {
            abort("Websocket exception", th2);
        }
        if (!this.mClosed) {
            ConnectionCallback connectionCallback = this.mConnectionCallback;
            if (connectionCallback != null) {
                connectionCallback.onDisconnected();
            }
            reconnect();
        }
    }

    @Override // p307qj.AbstractC12251t
    public synchronized void onMessage(WebSocket webSocket, String str) {
        MessageCallback messageCallback = this.mMessageCallback;
        if (messageCallback != null) {
            messageCallback.onMessage(str);
        }
    }

    @Override // p307qj.AbstractC12251t
    public synchronized void onOpen(WebSocket webSocket, Response response) {
        this.mWebSocket = webSocket;
        this.mSuppressConnectionErrors = false;
        ConnectionCallback connectionCallback = this.mConnectionCallback;
        if (connectionCallback != null) {
            connectionCallback.onConnected();
        }
    }

    public synchronized void sendMessage(String str) {
        WebSocket webSocket = this.mWebSocket;
        if (webSocket != null) {
            webSocket.mo9803b(str);
        } else {
            throw new ClosedChannelException();
        }
    }

    @Override // p307qj.AbstractC12251t
    public synchronized void onMessage(WebSocket webSocket, ByteString byteString) {
        MessageCallback messageCallback = this.mMessageCallback;
        if (messageCallback != null) {
            messageCallback.onMessage(byteString);
        }
    }

    public synchronized void sendMessage(ByteString byteString) {
        WebSocket webSocket = this.mWebSocket;
        if (webSocket != null) {
            webSocket.mo9804a(byteString);
        } else {
            throw new ClosedChannelException();
        }
    }
}
