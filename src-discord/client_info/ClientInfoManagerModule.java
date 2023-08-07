package com.discord.client_info;

import com.discord.codegen.NativeClientInfoManagerSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.Map;
import jf.x;
import kf.v;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \t2\u00020\u0001:\u0001\tB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\n"}, d2 = {"Lcom/discord/client_info/ClientInfoManagerModule;", "Lcom/discord/codegen/NativeClientInfoManagerSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getConstants", "", "", "getName", "Companion", "client_info_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class ClientInfoManagerModule extends NativeClientInfoManagerSpec {
    public static final Companion Companion = new Companion(null);
    public static final String NAME = "RTNClientInfoManager";

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/discord/client_info/ClientInfoManagerModule$Companion;", "", "()V", "NAME", "", "create", "Lcom/facebook/react/bridge/NativeModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "client_info_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final NativeModule create(ReactApplicationContext reactContext) {
            q.h(reactContext, "reactContext");
            return new ClientInfoManagerModule(reactContext);
        }
    }

    
    public ClientInfoManagerModule(ReactApplicationContext reactContext) {
        super(reactContext);
        q.h(reactContext, "reactContext");
    }

    @Override 
    public Map<String, String> getConstants() {
        Map<String, String> l10;
        ClientInfo clientInfo = ClientInfo.INSTANCE;
        ClientInfoCache clientInfoCache = ClientInfoCache.INSTANCE;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        q.g(reactApplicationContext, "reactApplicationContext");
        l10 = v.l(x.a("Identifier", clientInfo.getPackageName()), x.a("Version", clientInfo.getVersionName()), x.a("Build", clientInfo.getVersionCode()), x.a("Manifest", clientInfo.getOtaManifestETag()), x.a("OTABuild", clientInfo.getOtaVersion()), x.a("DeviceVendorID", clientInfoCache.getDeviceVendorId(reactApplicationContext)), x.a("ReleaseChannel", clientInfo.getReleaseChannel()), x.a("SentryDsn", "https:
        return l10;
    }

    @Override 
    public String getName() {
        return "RTNClientInfoManager";
    }
}
