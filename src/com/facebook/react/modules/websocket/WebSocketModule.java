package com.facebook.react.modules.websocket;

import com.facebook.fbreact.specs.NativeWebSocketModuleSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.network.ForwardingCookieHandler;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okio.ByteString;
import p163j$.util.concurrent.ConcurrentHashMap;
import p307qj.AbstractC12251t;
import p414x3.C13925a;

@ReactModule(hasConstants = false, name = "WebSocketModule")
/* loaded from: classes7.dex */
public final class WebSocketModule extends NativeWebSocketModuleSpec {
    public static final String NAME = "WebSocketModule";
    public static final String TAG = "WebSocketModule";
    private ForwardingCookieHandler mCookieHandler;
    public OnOpenHandler mOnOpenHandler = null;
    private final Map<Integer, WebSocket> mWebSocketConnections = new ConcurrentHashMap();
    private final Map<Integer, ContentHandler> mContentHandlers = new ConcurrentHashMap();

    /* loaded from: classes7.dex */
    public interface ContentHandler {
        void onMessage(String str, WritableMap writableMap);

        void onMessage(ByteString byteString, WritableMap writableMap);
    }

    /* loaded from: classes7.dex */
    public interface OnOpenHandler {
        void onOpen(WebSocket webSocket, int i);
    }

    public WebSocketModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mCookieHandler = new ForwardingCookieHandler(reactApplicationContext);
    }

    private String getCookie(String str) {
        try {
            List<String> list = this.mCookieHandler.get(new URI(getDefaultOrigin(str)), new HashMap()).get("Cookie");
            if (list != null && !list.isEmpty()) {
                return list.get(0);
            }
            return null;
        } catch (IOException | URISyntaxException unused) {
            throw new IllegalArgumentException("Unable to get cookie from " + str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007e A[Catch: URISyntaxException -> 0x00bf, TryCatch #0 {URISyntaxException -> 0x00bf, blocks: (B:2:0x0000, B:11:0x002c, B:14:0x0034, B:17:0x003c, B:20:0x0046, B:29:0x005a, B:30:0x006e, B:31:0x007e, B:32:0x008d, B:34:0x0093, B:35:0x00ae), top: B:39:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0093 A[Catch: URISyntaxException -> 0x00bf, TryCatch #0 {URISyntaxException -> 0x00bf, blocks: (B:2:0x0000, B:11:0x002c, B:14:0x0034, B:17:0x003c, B:20:0x0046, B:29:0x005a, B:30:0x006e, B:31:0x007e, B:32:0x008d, B:34:0x0093, B:35:0x00ae), top: B:39:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ae A[Catch: URISyntaxException -> 0x00bf, TRY_LEAVE, TryCatch #0 {URISyntaxException -> 0x00bf, blocks: (B:2:0x0000, B:11:0x002c, B:14:0x0034, B:17:0x003c, B:20:0x0046, B:29:0x005a, B:30:0x006e, B:31:0x007e, B:32:0x008d, B:34:0x0093, B:35:0x00ae), top: B:39:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String getDefaultOrigin(java.lang.String r12) {
        /*
            java.lang.String r0 = ""
            java.net.URI r1 = new java.net.URI     // Catch: URISyntaxException -> 0x00bf
            r1.<init>(r12)     // Catch: URISyntaxException -> 0x00bf
            java.lang.String r2 = r1.getScheme()     // Catch: URISyntaxException -> 0x00bf
            int r3 = r2.hashCode()     // Catch: URISyntaxException -> 0x00bf
            r4 = 3804(0xedc, float:5.33E-42)
            java.lang.String r5 = "https"
            java.lang.String r6 = "http"
            r7 = -1
            r8 = 0
            r9 = 3
            r10 = 2
            r11 = 1
            if (r3 == r4) goto L_0x0046
            r4 = 118039(0x1cd17, float:1.65408E-40)
            if (r3 == r4) goto L_0x003c
            r4 = 3213448(0x310888, float:4.503E-39)
            if (r3 == r4) goto L_0x0034
            r4 = 99617003(0x5f008eb, float:2.2572767E-35)
            if (r3 == r4) goto L_0x002c
            goto L_0x0050
        L_0x002c:
            boolean r2 = r2.equals(r5)     // Catch: URISyntaxException -> 0x00bf
            if (r2 == 0) goto L_0x0050
            r2 = r9
            goto L_0x0051
        L_0x0034:
            boolean r2 = r2.equals(r6)     // Catch: URISyntaxException -> 0x00bf
            if (r2 == 0) goto L_0x0050
            r2 = r10
            goto L_0x0051
        L_0x003c:
            java.lang.String r3 = "wss"
            boolean r2 = r2.equals(r3)     // Catch: URISyntaxException -> 0x00bf
            if (r2 == 0) goto L_0x0050
            r2 = r8
            goto L_0x0051
        L_0x0046:
            java.lang.String r3 = "ws"
            boolean r2 = r2.equals(r3)     // Catch: URISyntaxException -> 0x00bf
            if (r2 == 0) goto L_0x0050
            r2 = r11
            goto L_0x0051
        L_0x0050:
            r2 = r7
        L_0x0051:
            if (r2 == 0) goto L_0x007e
            if (r2 == r11) goto L_0x006e
            if (r2 == r10) goto L_0x005a
            if (r2 == r9) goto L_0x005a
            goto L_0x008d
        L_0x005a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: URISyntaxException -> 0x00bf
            r2.<init>()     // Catch: URISyntaxException -> 0x00bf
            r2.append(r0)     // Catch: URISyntaxException -> 0x00bf
            java.lang.String r0 = r1.getScheme()     // Catch: URISyntaxException -> 0x00bf
            r2.append(r0)     // Catch: URISyntaxException -> 0x00bf
            java.lang.String r0 = r2.toString()     // Catch: URISyntaxException -> 0x00bf
            goto L_0x008d
        L_0x006e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: URISyntaxException -> 0x00bf
            r2.<init>()     // Catch: URISyntaxException -> 0x00bf
            r2.append(r0)     // Catch: URISyntaxException -> 0x00bf
            r2.append(r6)     // Catch: URISyntaxException -> 0x00bf
            java.lang.String r0 = r2.toString()     // Catch: URISyntaxException -> 0x00bf
            goto L_0x008d
        L_0x007e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: URISyntaxException -> 0x00bf
            r2.<init>()     // Catch: URISyntaxException -> 0x00bf
            r2.append(r0)     // Catch: URISyntaxException -> 0x00bf
            r2.append(r5)     // Catch: URISyntaxException -> 0x00bf
            java.lang.String r0 = r2.toString()     // Catch: URISyntaxException -> 0x00bf
        L_0x008d:
            int r2 = r1.getPort()     // Catch: URISyntaxException -> 0x00bf
            if (r2 == r7) goto L_0x00ae
            java.lang.String r2 = "%s://%s:%s"
            java.lang.Object[] r3 = new java.lang.Object[r9]     // Catch: URISyntaxException -> 0x00bf
            r3[r8] = r0     // Catch: URISyntaxException -> 0x00bf
            java.lang.String r0 = r1.getHost()     // Catch: URISyntaxException -> 0x00bf
            r3[r11] = r0     // Catch: URISyntaxException -> 0x00bf
            int r0 = r1.getPort()     // Catch: URISyntaxException -> 0x00bf
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: URISyntaxException -> 0x00bf
            r3[r10] = r0     // Catch: URISyntaxException -> 0x00bf
            java.lang.String r12 = java.lang.String.format(r2, r3)     // Catch: URISyntaxException -> 0x00bf
            goto L_0x00be
        L_0x00ae:
            java.lang.String r2 = "%s://%s"
            java.lang.Object[] r3 = new java.lang.Object[r10]     // Catch: URISyntaxException -> 0x00bf
            r3[r8] = r0     // Catch: URISyntaxException -> 0x00bf
            java.lang.String r0 = r1.getHost()     // Catch: URISyntaxException -> 0x00bf
            r3[r11] = r0     // Catch: URISyntaxException -> 0x00bf
            java.lang.String r12 = java.lang.String.format(r2, r3)     // Catch: URISyntaxException -> 0x00bf
        L_0x00be:
            return r12
        L_0x00bf:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unable to set "
            r1.append(r2)
            r1.append(r12)
            java.lang.String r12 = " as default origin header"
            r1.append(r12)
            java.lang.String r12 = r1.toString()
            r0.<init>(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.modules.websocket.WebSocketModule.getDefaultOrigin(java.lang.String):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyWebSocketFailed(int i, String str) {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("id", i);
        createMap.putString("message", str);
        sendEvent("websocketFailed", createMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendEvent(String str, WritableMap writableMap) {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContextIfActiveOrWarn.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, writableMap);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void addListener(String str) {
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void close(double d, String str, double d2) {
        int i = (int) d2;
        WebSocket webSocket = this.mWebSocketConnections.get(Integer.valueOf(i));
        if (webSocket != null) {
            try {
                webSocket.mo9802g((int) d, str);
                this.mWebSocketConnections.remove(Integer.valueOf(i));
                this.mContentHandlers.remove(Integer.valueOf(i));
            } catch (Exception e) {
                C13925a.m2287k(ReactConstants.TAG, "Could not close WebSocket connection for id " + i, e);
            }
        }
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void connect(String str, ReadableArray readableArray, ReadableMap readableMap, double d) {
        boolean z;
        final int i = (int) d;
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient c = builder.m9912e(10L, timeUnit).m9917P(10L, timeUnit).m9918O(0L, TimeUnit.MINUTES).m9914c();
        Request.Builder l = new Request.Builder().m9866k(Integer.valueOf(i)).m9865l(str);
        String cookie = getCookie(str);
        if (cookie != null) {
            l.m9876a("Cookie", cookie);
        }
        if (readableMap == null || !readableMap.hasKey("headers") || !readableMap.getType("headers").equals(ReadableType.Map)) {
            z = false;
        } else {
            ReadableMap map = readableMap.getMap("headers");
            ReadableMapKeySetIterator keySetIterator = map.keySetIterator();
            z = false;
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                if (ReadableType.String.equals(map.getType(nextKey))) {
                    if (nextKey.equalsIgnoreCase("origin")) {
                        z = true;
                    }
                    l.m9876a(nextKey, map.getString(nextKey));
                } else {
                    C13925a.m2304H(ReactConstants.TAG, "Ignoring: requested " + nextKey + ", value not a string");
                }
            }
        }
        if (!z) {
            l.m9876a("origin", getDefaultOrigin(str));
        }
        if (readableArray != null && readableArray.size() > 0) {
            StringBuilder sb2 = new StringBuilder("");
            for (int i2 = 0; i2 < readableArray.size(); i2++) {
                String trim = readableArray.getString(i2).trim();
                if (!trim.isEmpty() && !trim.contains(",")) {
                    sb2.append(trim);
                    sb2.append(",");
                }
            }
            if (sb2.length() > 0) {
                sb2.replace(sb2.length() - 1, sb2.length(), "");
                l.m9876a("Sec-WebSocket-Protocol", sb2.toString());
            }
        }
        c.m9967C(l.m9875b(), new AbstractC12251t() { // from class: com.facebook.react.modules.websocket.WebSocketModule.1
            @Override // p307qj.AbstractC12251t
            public void onClosed(WebSocket webSocket, int i3, String str2) {
                WritableMap createMap = Arguments.createMap();
                createMap.putInt("id", i);
                createMap.putInt("code", i3);
                createMap.putString("reason", str2);
                WebSocketModule.this.sendEvent("websocketClosed", createMap);
            }

            @Override // p307qj.AbstractC12251t
            public void onClosing(WebSocket webSocket, int i3, String str2) {
                webSocket.mo9802g(i3, str2);
            }

            @Override // p307qj.AbstractC12251t
            public void onFailure(WebSocket webSocket, Throwable th2, Response response) {
                WebSocketModule.this.notifyWebSocketFailed(i, th2.getMessage());
            }

            @Override // p307qj.AbstractC12251t
            public void onMessage(WebSocket webSocket, String str2) {
                WritableMap createMap = Arguments.createMap();
                createMap.putInt("id", i);
                createMap.putString("type", "text");
                ContentHandler contentHandler = (ContentHandler) WebSocketModule.this.mContentHandlers.get(Integer.valueOf(i));
                if (contentHandler != null) {
                    contentHandler.onMessage(str2, createMap);
                } else {
                    createMap.putString("data", str2);
                }
                WebSocketModule.this.sendEvent("websocketMessage", createMap);
            }

            @Override // p307qj.AbstractC12251t
            public void onOpen(WebSocket webSocket, Response response) {
                WebSocketModule.this.mWebSocketConnections.put(Integer.valueOf(i), webSocket);
                WritableMap createMap = Arguments.createMap();
                createMap.putInt("id", i);
                createMap.putString("protocol", response.m9835s("Sec-WebSocket-Protocol", ""));
                WebSocketModule.this.sendEvent("websocketOpen", createMap);
                OnOpenHandler onOpenHandler = WebSocketModule.this.mOnOpenHandler;
                if (onOpenHandler != null) {
                    onOpenHandler.onOpen(webSocket, i);
                }
            }

            @Override // p307qj.AbstractC12251t
            public void onMessage(WebSocket webSocket, ByteString byteString) {
                WritableMap createMap = Arguments.createMap();
                createMap.putInt("id", i);
                createMap.putString("type", "binary");
                ContentHandler contentHandler = (ContentHandler) WebSocketModule.this.mContentHandlers.get(Integer.valueOf(i));
                if (contentHandler != null) {
                    contentHandler.onMessage(byteString, createMap);
                } else {
                    createMap.putString("data", byteString.mo9718a());
                }
                WebSocketModule.this.sendEvent("websocketMessage", createMap);
            }
        });
        c.m9941r().m10084d().shutdown();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "WebSocketModule";
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void ping(double d) {
        int i = (int) d;
        WebSocket webSocket = this.mWebSocketConnections.get(Integer.valueOf(i));
        if (webSocket == null) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("id", i);
            createMap.putString("message", "client is null");
            sendEvent("websocketFailed", createMap);
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putInt("id", i);
            createMap2.putInt("code", 0);
            createMap2.putString("reason", "client is null");
            sendEvent("websocketClosed", createMap2);
            this.mWebSocketConnections.remove(Integer.valueOf(i));
            this.mContentHandlers.remove(Integer.valueOf(i));
            return;
        }
        try {
            webSocket.mo9804a(ByteString.f25541n);
        } catch (Exception e) {
            notifyWebSocketFailed(i, e.getMessage());
        }
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void removeListeners(double d) {
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void send(String str, double d) {
        int i = (int) d;
        WebSocket webSocket = this.mWebSocketConnections.get(Integer.valueOf(i));
        if (webSocket == null) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("id", i);
            createMap.putString("message", "client is null");
            sendEvent("websocketFailed", createMap);
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putInt("id", i);
            createMap2.putInt("code", 0);
            createMap2.putString("reason", "client is null");
            sendEvent("websocketClosed", createMap2);
            this.mWebSocketConnections.remove(Integer.valueOf(i));
            this.mContentHandlers.remove(Integer.valueOf(i));
            return;
        }
        try {
            webSocket.mo9803b(str);
        } catch (Exception e) {
            notifyWebSocketFailed(i, e.getMessage());
        }
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void sendBinary(String str, double d) {
        int i = (int) d;
        WebSocket webSocket = this.mWebSocketConnections.get(Integer.valueOf(i));
        if (webSocket == null) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("id", i);
            createMap.putString("message", "client is null");
            sendEvent("websocketFailed", createMap);
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putInt("id", i);
            createMap2.putInt("code", 0);
            createMap2.putString("reason", "client is null");
            sendEvent("websocketClosed", createMap2);
            this.mWebSocketConnections.remove(Integer.valueOf(i));
            this.mContentHandlers.remove(Integer.valueOf(i));
            return;
        }
        try {
            webSocket.mo9804a(ByteString.m9716c(str));
        } catch (Exception e) {
            notifyWebSocketFailed(i, e.getMessage());
        }
    }

    public void setContentHandler(int i, ContentHandler contentHandler) {
        if (contentHandler != null) {
            this.mContentHandlers.put(Integer.valueOf(i), contentHandler);
        } else {
            this.mContentHandlers.remove(Integer.valueOf(i));
        }
    }

    public void sendBinary(ByteString byteString, int i) {
        WebSocket webSocket = this.mWebSocketConnections.get(Integer.valueOf(i));
        if (webSocket == null) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("id", i);
            createMap.putString("message", "client is null");
            sendEvent("websocketFailed", createMap);
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putInt("id", i);
            createMap2.putInt("code", 0);
            createMap2.putString("reason", "client is null");
            sendEvent("websocketClosed", createMap2);
            this.mWebSocketConnections.remove(Integer.valueOf(i));
            this.mContentHandlers.remove(Integer.valueOf(i));
            return;
        }
        try {
            webSocket.mo9804a(byteString);
        } catch (Exception e) {
            notifyWebSocketFailed(i, e.getMessage());
        }
    }
}
