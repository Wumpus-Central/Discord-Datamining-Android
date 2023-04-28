package com.discord.hosts;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.C9677q;

@Metadata(m15074d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0007¨\u0006\u000b"}, m15073d2 = {"Lcom/discord/hosts/HostsModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "context", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getName", "", "setHosts", "", "api", "cdn", "hosts_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes5.dex */
public final class HostsModule extends ReactContextBaseJavaModule {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HostsModule(ReactApplicationContext context) {
        super(context);
        C9677q.m14633g(context, "context");
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "Hosts";
    }

    @ReactMethod
    public final void setHosts(String api, String cdn) {
        C9677q.m14633g(api, "api");
        C9677q.m14633g(cdn, "cdn");
        Hosts hosts = Hosts.INSTANCE;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        C9677q.m14634f(reactApplicationContext, "reactApplicationContext");
        hosts.init(reactApplicationContext, api, cdn);
    }
}
