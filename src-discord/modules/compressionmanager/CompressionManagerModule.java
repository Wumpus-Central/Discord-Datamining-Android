package com.discord.modules.compressionmanager;

import com.discord.logging.Log;
import com.discord.misc.utilities.time.TimeElapsed;
import com.discord.resource_usage.DeviceResourceUsageRecorder;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.websocket.WebSocketModule;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.ByteArrayOutputStream;
import java.util.Map;
import java.util.zip.Inflater;
import java.util.zip.InflaterOutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import okio.ByteString;
import ti.a;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00132\u00020\u0001:\u0002\u0013\u0014B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0007H\u0007J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0007H\u0007J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\u0004\u0018\u00010\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/discord/modules/compressionmanager/CompressionManagerModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "inflaters", "", "", "Ljava/util/zip/Inflater;", "webSocketModule", "Lcom/facebook/react/modules/websocket/WebSocketModule;", "getWebSocketModule", "()Lcom/facebook/react/modules/websocket/WebSocketModule;", "disableZlibStreamSupport", "", "socketId", "enableZlibStreamSupport", "getName", "", "Companion", "ContentHandler", "app_canaryRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class CompressionManagerModule extends ReactContextBaseJavaModule {
    public static final Companion Companion = new Companion(null);
    private static final String logTag = CompressionManagerModule.class.getSimpleName();
    private final Map<Integer, Inflater> inflaters = new ConcurrentHashMap();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/discord/modules/compressionmanager/CompressionManagerModule$Companion;", "", "()V", "logTag", "", "kotlin.jvm.PlatformType", "app_canaryRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    
    public CompressionManagerModule(ReactApplicationContext reactContext) {
        super(reactContext);
        q.h(reactContext, "reactContext");
    }

    private final WebSocketModule getWebSocketModule() {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            return (WebSocketModule) reactApplicationContextIfActiveOrWarn.getNativeModule(WebSocketModule.class);
        }
        return null;
    }

    @ReactMethod
    public final void disableZlibStreamSupport(int i10) {
        WebSocketModule webSocketModule = getWebSocketModule();
        if (webSocketModule != null) {
            webSocketModule.setContentHandler(i10, null);
        }
        this.inflaters.remove(Integer.valueOf(i10));
    }

    @ReactMethod
    public final void enableZlibStreamSupport(int i10) {
        Map<Integer, Inflater> map = this.inflaters;
        Integer valueOf = Integer.valueOf(i10);
        Inflater inflater = map.get(valueOf);
        if (inflater == null) {
            inflater = new Inflater();
            map.put(valueOf, inflater);
        }
        Inflater inflater2 = inflater;
        WebSocketModule webSocketModule = getWebSocketModule();
        if (webSocketModule != null) {
            webSocketModule.setContentHandler(i10, new ContentHandler(inflater2));
        }
    }

    @Override 
    public String getName() {
        return "DCDCompressionManager";
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\rB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/discord/modules/compressionmanager/CompressionManagerModule$ContentHandler;", "Lcom/facebook/react/modules/websocket/WebSocketModule$ContentHandler;", "inflater", "Ljava/util/zip/Inflater;", "(Ljava/util/zip/Inflater;)V", "onMessage", "", "text", "", "params", "Lcom/facebook/react/bridge/WritableMap;", "byteString", "Lokio/ByteString;", "ZLibByteStream", "app_canaryRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    private static final class ContentHandler implements WebSocketModule.ContentHandler {
        private final Inflater inflater;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\b¨\u0006\n"}, d2 = {"Lcom/discord/modules/compressionmanager/CompressionManagerModule$ContentHandler$ZLibByteStream;", "Ljava/io/ByteArrayOutputStream;", "bytes", "Lokio/ByteString;", "inflater", "Ljava/util/zip/Inflater;", "(Lokio/ByteString;Ljava/util/zip/Inflater;)V", "toDecodedString", "", "Companion", "app_canaryRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        
        private static final class ZLibByteStream extends ByteArrayOutputStream {
            public static final Companion Companion = new Companion(null);
            private static final int INFLATE_BUFFER_SIZE = 4096;
            private static final int INITIAL_BUFFER_SIZE_MULTIPLIER = 2;

            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/discord/modules/compressionmanager/CompressionManagerModule$ContentHandler$ZLibByteStream$Companion;", "", "()V", "INFLATE_BUFFER_SIZE", "", "INITIAL_BUFFER_SIZE_MULTIPLIER", "app_canaryRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
            
            public static final class Companion {
                private Companion() {
                }

                public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            
            public ZLibByteStream(ByteString bytes, Inflater inflater) {
                super(bytes.z() * 2);
                q.h(bytes, "bytes");
                q.h(inflater, "inflater");
                InflaterOutputStream inflaterOutputStream = new InflaterOutputStream(this, inflater, 4096);
                bytes.E(inflaterOutputStream);
                inflaterOutputStream.flush();
            }

            public final String toDecodedString() {
                byte[] buf = ((ByteArrayOutputStream) this).buf;
                q.g(buf, "buf");
                return new String(buf, 0, ((ByteArrayOutputStream) this).count, a.f28775b);
            }
        }

        public ContentHandler(Inflater inflater) {
            q.h(inflater, "inflater");
            this.inflater = inflater;
        }

        @Override 
        public void onMessage(String str, WritableMap params) {
            q.h(params, "params");
            params.putString("data", str);
            if (str != null) {
                DeviceResourceUsageRecorder.Companion companion = DeviceResourceUsageRecorder.Companion;
                companion.setSocketBytesReceived(companion.getSocketBytesReceived() + str.length());
            }
        }

        @Override 
        public void onMessage(ByteString byteString, WritableMap params) {
            q.h(byteString, "byteString");
            q.h(params, "params");
            TimeElapsed timeElapsed = new TimeElapsed(0L, 1, null);
            String decodedString = new ZLibByteStream(byteString, this.inflater).toDecodedString();
            if (timeElapsed.getDurationMillis() > 100) {
                Log log = Log.INSTANCE;
                String logTag = CompressionManagerModule.logTag;
                q.g(logTag, "logTag");
                String duration = timeElapsed.getDuration();
                Log.i$default(log, logTag, "Decompressed ZLib message in " + duration, (Throwable) null, 4, (Object) null);
            }
            params.putString("type", "text");
            params.putString("data", decodedString);
            DeviceResourceUsageRecorder.Companion companion = DeviceResourceUsageRecorder.Companion;
            companion.setSocketBytesReceived(companion.getSocketBytesReceived() + byteString.z());
        }
    }
}
