package com.facebook.react.devsupport;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import com.facebook.react.bridge.Inspector;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p307qj.AbstractC12251t;
import p414x3.C13925a;

/* loaded from: classes7.dex */
public class InspectorPackagerConnection {
    private static final String TAG = "InspectorPackagerConnection";
    private BundleStatusProvider mBundleStatusProvider;
    private final Connection mConnection;
    private final Map<String, Inspector.LocalConnection> mInspectorConnections = new HashMap();
    private final String mPackageName;

    /* loaded from: classes7.dex */
    public interface BundleStatusProvider {
        BundleStatus getBundleStatus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes7.dex */
    public class Connection extends AbstractC12251t {
        private static final int RECONNECT_DELAY_MS = 2000;
        private boolean mClosed;
        private final Handler mHandler = new Handler(Looper.getMainLooper());
        private OkHttpClient mHttpClient;
        private boolean mSuppressConnectionErrors;
        private final String mUrl;
        private WebSocket mWebSocket;

        public Connection(String str) {
            this.mUrl = str;
        }

        private void abort(String str, Throwable th2) {
            C13925a.m2287k(InspectorPackagerConnection.TAG, "Error occurred, shutting down websocket connection: " + str, th2);
            InspectorPackagerConnection.this.closeAllConnections();
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

        private void reconnect() {
            if (!this.mClosed) {
                if (!this.mSuppressConnectionErrors) {
                    C13925a.m2304H(InspectorPackagerConnection.TAG, "Couldn't connect to packager, will silently retry");
                    this.mSuppressConnectionErrors = true;
                }
                this.mHandler.postDelayed(new Runnable() { // from class: com.facebook.react.devsupport.InspectorPackagerConnection.Connection.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!Connection.this.mClosed) {
                            Connection.this.connect();
                        }
                    }
                }, 2000L);
                return;
            }
            throw new IllegalStateException("Can't reconnect closed client");
        }

        public void close() {
            this.mClosed = true;
            WebSocket webSocket = this.mWebSocket;
            if (webSocket != null) {
                try {
                    webSocket.mo9802g(RNCWebViewManager.COMMAND_CLEAR_FORM_DATA, "End of session");
                } catch (Exception unused) {
                }
                this.mWebSocket = null;
            }
        }

        public void connect() {
            if (!this.mClosed) {
                if (this.mHttpClient == null) {
                    OkHttpClient.Builder builder = new OkHttpClient.Builder();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    this.mHttpClient = builder.m9912e(10L, timeUnit).m9917P(10L, timeUnit).m9918O(0L, TimeUnit.MINUTES).m9914c();
                }
                this.mHttpClient.m9967C(new Request.Builder().m9865l(this.mUrl).m9875b(), this);
                return;
            }
            throw new IllegalStateException("Can't connect closed client");
        }

        @Override // p307qj.AbstractC12251t
        public void onClosed(WebSocket webSocket, int i, String str) {
            this.mWebSocket = null;
            InspectorPackagerConnection.this.closeAllConnections();
            if (!this.mClosed) {
                reconnect();
            }
        }

        @Override // p307qj.AbstractC12251t
        public void onFailure(WebSocket webSocket, Throwable th2, Response response) {
            if (this.mWebSocket != null) {
                abort("Websocket exception", th2);
            }
            if (!this.mClosed) {
                reconnect();
            }
        }

        @Override // p307qj.AbstractC12251t
        public void onMessage(WebSocket webSocket, String str) {
            try {
                InspectorPackagerConnection.this.handleProxyMessage(new JSONObject(str));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        @Override // p307qj.AbstractC12251t
        public void onOpen(WebSocket webSocket, Response response) {
            this.mWebSocket = webSocket;
        }

        public void send(final JSONObject jSONObject) {
            new AsyncTask<WebSocket, Void, Void>() { // from class: com.facebook.react.devsupport.InspectorPackagerConnection.Connection.2
                /* JADX INFO: Access modifiers changed from: protected */
                public Void doInBackground(WebSocket... webSocketArr) {
                    if (!(webSocketArr == null || webSocketArr.length == 0)) {
                        try {
                            webSocketArr[0].mo9803b(jSONObject.toString());
                        } catch (Exception e) {
                            C13925a.m2303I(InspectorPackagerConnection.TAG, "Couldn't send event to packager", e);
                        }
                    }
                    return null;
                }
            }.execute(this.mWebSocket);
        }
    }

    public InspectorPackagerConnection(String str, String str2, BundleStatusProvider bundleStatusProvider) {
        this.mConnection = new Connection(str);
        this.mPackageName = str2;
        this.mBundleStatusProvider = bundleStatusProvider;
    }

    private JSONArray getPages() {
        List<Inspector.Page> pages = Inspector.getPages();
        JSONArray jSONArray = new JSONArray();
        BundleStatus bundleStatus = this.mBundleStatusProvider.getBundleStatus();
        for (Inspector.Page page : pages) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", String.valueOf(page.getId()));
            jSONObject.put("title", page.getTitle());
            jSONObject.put("app", this.mPackageName);
            jSONObject.put("vm", page.getVM());
            jSONObject.put("isLastBundleDownloadSuccess", bundleStatus.isLastDownloadSucess);
            jSONObject.put("bundleUpdateTimestamp", bundleStatus.updateTimestamp);
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    private void handleConnect(JSONObject jSONObject) {
        final String string = jSONObject.getString("pageId");
        if (this.mInspectorConnections.remove(string) == null) {
            try {
                this.mInspectorConnections.put(string, Inspector.connect(Integer.parseInt(string), new Inspector.RemoteConnection() { // from class: com.facebook.react.devsupport.InspectorPackagerConnection.1
                    @Override // com.facebook.react.bridge.Inspector.RemoteConnection
                    public void onDisconnect() {
                        try {
                            InspectorPackagerConnection.this.mInspectorConnections.remove(string);
                            InspectorPackagerConnection inspectorPackagerConnection = InspectorPackagerConnection.this;
                            inspectorPackagerConnection.sendEvent("disconnect", inspectorPackagerConnection.makePageIdPayload(string));
                        } catch (JSONException e) {
                            C13925a.m2303I(InspectorPackagerConnection.TAG, "Couldn't send event to packager", e);
                        }
                    }

                    @Override // com.facebook.react.bridge.Inspector.RemoteConnection
                    public void onMessage(String str) {
                        try {
                            InspectorPackagerConnection.this.sendWrappedEvent(string, str);
                        } catch (JSONException e) {
                            C13925a.m2303I(InspectorPackagerConnection.TAG, "Couldn't send event to packager", e);
                        }
                    }
                }));
            } catch (Exception e) {
                C13925a.m2303I(TAG, "Failed to open page: " + string, e);
                sendEvent("disconnect", makePageIdPayload(string));
            }
        } else {
            throw new IllegalStateException("Already connected: " + string);
        }
    }

    private void handleDisconnect(JSONObject jSONObject) {
        Inspector.LocalConnection remove = this.mInspectorConnections.remove(jSONObject.getString("pageId"));
        if (remove != null) {
            remove.disconnect();
        }
    }

    private void handleWrappedEvent(JSONObject jSONObject) {
        String string = jSONObject.getString("pageId");
        String string2 = jSONObject.getString("wrappedEvent");
        Inspector.LocalConnection localConnection = this.mInspectorConnections.get(string);
        if (localConnection == null) {
            C13925a.m2304H(TAG, "PageID " + string + " is disconnected. Dropping event: " + string2);
            return;
        }
        localConnection.sendMessage(string2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject makePageIdPayload(String str) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("pageId", str);
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendEvent(String str, Object obj) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event", str);
        jSONObject.put("payload", obj);
        this.mConnection.send(jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendWrappedEvent(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("pageId", str);
        jSONObject.put("wrappedEvent", str2);
        sendEvent("wrappedEvent", jSONObject);
    }

    void closeAllConnections() {
        for (Map.Entry<String, Inspector.LocalConnection> entry : this.mInspectorConnections.entrySet()) {
            entry.getValue().disconnect();
        }
        this.mInspectorConnections.clear();
    }

    public void closeQuietly() {
        this.mConnection.close();
    }

    public void connect() {
        this.mConnection.connect();
    }

    void handleProxyMessage(JSONObject jSONObject) {
        String string = jSONObject.getString("event");
        string.hashCode();
        char c = 65535;
        switch (string.hashCode()) {
            case 530405532:
                if (string.equals("disconnect")) {
                    c = 0;
                    break;
                }
                break;
            case 951351530:
                if (string.equals("connect")) {
                    c = 1;
                    break;
                }
                break;
            case 1328613653:
                if (string.equals("wrappedEvent")) {
                    c = 2;
                    break;
                }
                break;
            case 1962251790:
                if (string.equals("getPages")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                handleDisconnect(jSONObject.getJSONObject("payload"));
                return;
            case 1:
                handleConnect(jSONObject.getJSONObject("payload"));
                return;
            case 2:
                handleWrappedEvent(jSONObject.getJSONObject("payload"));
                return;
            case 3:
                sendEvent("getPages", getPages());
                return;
            default:
                throw new IllegalArgumentException("Unknown event: " + string);
        }
    }

    public void sendEventToAllConnections(String str) {
        for (Map.Entry<String, Inspector.LocalConnection> entry : this.mInspectorConnections.entrySet()) {
            entry.getValue().sendMessage(str);
        }
    }

    /* loaded from: classes7.dex */
    public static class BundleStatus {
        public Boolean isLastDownloadSucess;
        public long updateTimestamp;

        public BundleStatus(Boolean bool, long j) {
            this.isLastDownloadSucess = bool;
            this.updateTimestamp = j;
        }

        public BundleStatus() {
            this(Boolean.FALSE, -1L);
        }
    }
}
