package com.discord.modules.fastconnectmanager;

import com.discord.cache.CacheModule;
import com.discord.modules.fastconnectmanager.FastConnectManagerModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.modules.websocket.WebSocketModule;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C9677q;
import nf.C10853x;
import okhttp3.WebSocket;
import p164j$.util.concurrent.ConcurrentHashMap;
import p268of.C11053v;

@Metadata(m15074d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\u0006H\u0016J\b\u0010\r\u001a\u00020\u0006H\u0016J\u0016\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u000eH\u0016J\u0012\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\nH\u0007J\u0012\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\nH\u0007J\u0018\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u0004\u0018\u00010\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006&"}, m15073d2 = {"Lcom/discord/modules/fastconnectmanager/FastConnectManagerModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lokhttp3/WebSocket;", "webSocket", "", "socketId", "", "handleWebSocketOpen", "", "sendIdentify", "", "getName", "initialize", "invalidate", "", "getConstants", "clientState", "setClientState", "userId", "setUserId", "payload", "prepareIdentify", "j$/util/concurrent/ConcurrentHashMap", "sockets", "Lj$/util/concurrent/ConcurrentHashMap;", "identified", "Z", "Ljava/lang/Integer;", "identifyPayload", "Ljava/lang/String;", "Lcom/facebook/react/modules/websocket/WebSocketModule;", "getWebSocketModule", "()Lcom/facebook/react/modules/websocket/WebSocketModule;", "webSocketModule", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "app_canaryRelease"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class FastConnectManagerModule extends ReactContextBaseJavaModule {
    private boolean identified;
    private Integer socketId;
    private final ConcurrentHashMap<Integer, WebSocket> sockets = new ConcurrentHashMap<>();
    private String identifyPayload = "";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FastConnectManagerModule(ReactApplicationContext reactContext) {
        super(reactContext);
        C9677q.m14633g(reactContext, "reactContext");
    }

    private final WebSocketModule getWebSocketModule() {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            return (WebSocketModule) reactApplicationContextIfActiveOrWarn.getNativeModule(WebSocketModule.class);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleWebSocketOpen(WebSocket webSocket, int i) {
        if (!sendIdentify(webSocket, i)) {
            this.sockets.put(Integer.valueOf(i), webSocket);
        }
    }

    private final boolean sendIdentify(WebSocket webSocket, int i) {
        Integer num;
        boolean z = false;
        if (webSocket == null) {
            return false;
        }
        if (!this.identified && (num = this.socketId) != null && num.intValue() == i) {
            z = true;
        }
        if (z) {
            webSocket.mo9803b(this.identifyPayload);
            this.identified = true;
        }
        return z;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, String> getConstants() {
        Map<String, String> l;
        CacheModule.Companion companion = CacheModule.Companion;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        C9677q.m14634f(reactApplicationContext, "reactApplicationContext");
        ReactApplicationContext reactApplicationContext2 = getReactApplicationContext();
        C9677q.m14634f(reactApplicationContext2, "reactApplicationContext");
        ReactApplicationContext reactApplicationContext3 = getReactApplicationContext();
        C9677q.m14634f(reactApplicationContext3, "reactApplicationContext");
        l = C11053v.m10247l(C10853x.m10921a("clientState", companion.get(reactApplicationContext).getItem("_clientStateKey")), C10853x.m10921a("userId", companion.get(reactApplicationContext2).getItem("_userIdKey")), C10853x.m10921a("token", CacheModule.getToken$default(companion.get(reactApplicationContext3), false, 1, null)));
        return l;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "DCDFastConnectManager";
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        super.initialize();
        WebSocketModule webSocketModule = getWebSocketModule();
        if (webSocketModule != null) {
            webSocketModule.mOnOpenHandler = new WebSocketModule.OnOpenHandler() { // from class: j3.a
                @Override // com.facebook.react.modules.websocket.WebSocketModule.OnOpenHandler
                public final void onOpen(WebSocket webSocket, int i) {
                    FastConnectManagerModule.this.handleWebSocketOpen(webSocket, i);
                }
            };
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void invalidate() {
        super.invalidate();
        WebSocketModule webSocketModule = getWebSocketModule();
        if (webSocketModule != null) {
            webSocketModule.mOnOpenHandler = null;
        }
    }

    @ReactMethod
    public final void prepareIdentify(String payload, int i) {
        C9677q.m14633g(payload, "payload");
        this.socketId = Integer.valueOf(i);
        this.identifyPayload = payload;
        sendIdentify(this.sockets.get(Integer.valueOf(i)), i);
    }

    @ReactMethod
    public final void setClientState(String str) {
        if (str == null) {
            CacheModule.Companion companion = CacheModule.Companion;
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            C9677q.m14634f(reactApplicationContext, "reactApplicationContext");
            companion.get(reactApplicationContext).removeItem("_clientStateKey");
            return;
        }
        CacheModule.Companion companion2 = CacheModule.Companion;
        ReactApplicationContext reactApplicationContext2 = getReactApplicationContext();
        C9677q.m14634f(reactApplicationContext2, "reactApplicationContext");
        companion2.get(reactApplicationContext2).setItem("_clientStateKey", str);
    }

    @ReactMethod
    public final void setUserId(String str) {
        if (str == null) {
            CacheModule.Companion companion = CacheModule.Companion;
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            C9677q.m14634f(reactApplicationContext, "reactApplicationContext");
            companion.get(reactApplicationContext).removeItem("_userIdKey");
            return;
        }
        CacheModule.Companion companion2 = CacheModule.Companion;
        ReactApplicationContext reactApplicationContext2 = getReactApplicationContext();
        C9677q.m14634f(reactApplicationContext2, "reactApplicationContext");
        companion2.get(reactApplicationContext2).setItem("_userIdKey", str);
    }
}
