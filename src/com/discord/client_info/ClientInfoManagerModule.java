package com.discord.client_info;

import com.discord.codegen.NativeClientInfoManagerSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nf.C11098x;
import p267of.C11289v;

@Metadata(m15074d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \t2\u00020\u0001:\u0001\tB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\n"}, m15073d2 = {"Lcom/discord/client_info/ClientInfoManagerModule;", "Lcom/discord/codegen/NativeClientInfoManagerSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getConstants", "", "", "getName", "Companion", "client_info_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class ClientInfoManagerModule extends NativeClientInfoManagerSpec {
    public static final Companion Companion = new Companion(null);
    public static final String NAME = "RTNClientInfoManager";

    @Metadata(m15074d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m15073d2 = {"Lcom/discord/client_info/ClientInfoManagerModule$Companion;", "", "()V", "NAME", "", "create", "Lcom/facebook/react/bridge/NativeModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "client_info_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final NativeModule create(ReactApplicationContext reactContext) {
            C9971q.m14633g(reactContext, "reactContext");
            return new ClientInfoManagerModule(reactContext);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClientInfoManagerModule(ReactApplicationContext reactContext) {
        super(reactContext);
        C9971q.m14633g(reactContext, "reactContext");
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, String> getConstants() {
        Map<String, String> l;
        ClientInfo clientInfo = ClientInfo.INSTANCE;
        ClientInfoCache clientInfoCache = ClientInfoCache.INSTANCE;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        C9971q.m14634f(reactApplicationContext, "reactApplicationContext");
        l = C11289v.m10247l(C11098x.m10921a("Identifier", clientInfo.getPackageName()), C11098x.m10921a("Version", clientInfo.getVersionName()), C11098x.m10921a("Build", clientInfo.getVersionCode()), C11098x.m10921a("Manifest", clientInfo.getOtaManifestETag()), C11098x.m10921a("OTABuild", clientInfo.getOtaVersion()), C11098x.m10921a("DeviceVendorID", clientInfoCache.getDeviceVendorId(reactApplicationContext)), C11098x.m10921a("ReleaseChannel", clientInfo.getReleaseChannel()), C11098x.m10921a("SentryDsn", "https://70545531dfe34835bf4dd0996821e8b6@o64374.ingest.sentry.io/5992375"));
        return l;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }
}
