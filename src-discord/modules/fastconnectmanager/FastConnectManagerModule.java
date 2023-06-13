package com.discord.modules.fastconnectmanager;

import com.discord.app_database.AppDatabaseModule;
import com.discord.app_database.GuildVersion;
import com.discord.cache.CacheModule;
import com.discord.logging.Log;
import com.discord.modules.fastconnectmanager.FastConnectManagerModule;
import com.discord.tti_manager.TTIMetrics;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.modules.websocket.WebSocketModule;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import kg.x;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import lg.v;
import okhttp3.WebSocket;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0006\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u001a\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0002J\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J\u001a\u0010\r\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J\b\u0010\u000e\u001a\u00020\u0002H\u0016J\b\u0010\u000f\u001a\u00020\u0005H\u0016J\b\u0010\u0010\u001a\u00020\u0005H\u0016J\u0016\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0011H\u0016J\u001c\u0010\u0015\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0007J\"\u0010\u0017\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0007R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001dR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001fR\u0016\u0010$\u001a\u0004\u0018\u00010!8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006)"}, d2 = {"Lcom/discord/modules/fastconnectmanager/FastConnectManagerModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "", "key", "value", "", "setCacheValue", "Lokhttp3/WebSocket;", "webSocket", "", "socketId", "handleWebSocketOpen", "", "sendIdentify", "getName", "initialize", "invalidate", "", "getConstants", "userId", "clientState", "setClientState", "payload", "prepareIdentify", "j$/util/concurrent/ConcurrentHashMap", "sockets", "Lj$/util/concurrent/ConcurrentHashMap;", "identified", "Z", "Ljava/lang/Integer;", "identifyUserId", "Ljava/lang/String;", "identifyPayload", "Lcom/facebook/react/modules/websocket/WebSocketModule;", "getWebSocketModule", "()Lcom/facebook/react/modules/websocket/WebSocketModule;", "webSocketModule", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "app_canaryRelease"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class FastConnectManagerModule extends ReactContextBaseJavaModule {
    private boolean identified;
    private String identifyUserId;
    private Integer socketId;
    private final ConcurrentHashMap<Integer, WebSocket> sockets = new ConcurrentHashMap<>();
    private String identifyPayload = "";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FastConnectManagerModule(ReactApplicationContext reactContext) {
        super(reactContext);
        q.g(reactContext, "reactContext");
    }

    private final WebSocketModule getWebSocketModule() {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            return (WebSocketModule) reactApplicationContextIfActiveOrWarn.getNativeModule(WebSocketModule.class);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleWebSocketOpen(WebSocket webSocket, int i10) {
        TTIMetrics.record$default(TTIMetrics.INSTANCE, "Native WebSocket opened", 0L, null, false, 14, null);
        if (!sendIdentify(webSocket, i10)) {
            this.sockets.put(Integer.valueOf(i10), webSocket);
        }
    }

    private final boolean sendIdentify(WebSocket webSocket, int i10) {
        Integer num;
        GuildVersion[] guildVersionArr;
        String str;
        if (webSocket == null || (num = this.socketId) == null || i10 != num.intValue() || this.identified) {
            return false;
        }
        String str2 = this.identifyUserId;
        if (str2 != null) {
            guildVersionArr = AppDatabaseModule.Companion.getGuildVersions(str2);
        } else {
            guildVersionArr = new GuildVersion[0];
        }
        if (str2 != null) {
            str = IdentifyPayload.INSTANCE.withGuildVersions(this.identifyPayload, guildVersionArr);
        } else {
            str = this.identifyPayload;
        }
        if (!q.b(this.identifyPayload, str)) {
            Log log = Log.INSTANCE;
            int length = guildVersionArr.length;
            Log.i$default(log, "FastConnectManagerModule", length + " guild_versions added to identify payload", (Throwable) null, 4, (Object) null);
        }
        TTIMetrics.record$default(TTIMetrics.INSTANCE, "Native WebSocket sent identify", 0L, null, false, 14, null);
        webSocket.b(str);
        this.identified = true;
        return true;
    }

    private final void setCacheValue(String str, String str2) {
        CacheModule.Companion companion = CacheModule.Companion;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        q.f(reactApplicationContext, "reactApplicationContext");
        CacheModule cacheModule = companion.get(reactApplicationContext);
        if (str2 == null) {
            cacheModule.removeItem(str);
        } else {
            cacheModule.setItem(str, str2);
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, String> getConstants() {
        Map<String, String> l10;
        CacheModule.Companion companion = CacheModule.Companion;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        q.f(reactApplicationContext, "reactApplicationContext");
        ReactApplicationContext reactApplicationContext2 = getReactApplicationContext();
        q.f(reactApplicationContext2, "reactApplicationContext");
        ReactApplicationContext reactApplicationContext3 = getReactApplicationContext();
        q.f(reactApplicationContext3, "reactApplicationContext");
        l10 = v.l(x.a("clientState", companion.get(reactApplicationContext).getItem("_clientStateKey")), x.a("userId", companion.get(reactApplicationContext2).getItem("_userIdKey")), x.a("token", CacheModule.getToken$default(companion.get(reactApplicationContext3), false, 1, null)));
        return l10;
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
            webSocketModule.mOnOpenHandler = new WebSocketModule.OnOpenHandler() { // from class: m3.a
                @Override // com.facebook.react.modules.websocket.WebSocketModule.OnOpenHandler
                public final void onOpen(WebSocket webSocket, int i10) {
                    FastConnectManagerModule.this.handleWebSocketOpen(webSocket, i10);
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
    public final void prepareIdentify(String str, String payload, int i10) {
        q.g(payload, "payload");
        this.socketId = Integer.valueOf(i10);
        this.identifyUserId = str;
        this.identifyPayload = payload;
        sendIdentify(this.sockets.get(Integer.valueOf(i10)), i10);
    }

    @ReactMethod
    public final void setClientState(String str, String str2) {
        setCacheValue("_userIdKey", str);
        setCacheValue("_clientStateKey", str2);
    }
}
