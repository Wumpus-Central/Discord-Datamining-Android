package com.discord.hosts;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0007¨\u0006\u000b"}, d2 = {"Lcom/discord/hosts/HostsModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "context", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getName", "", "setHosts", "", "api", "cdn", "hosts_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class HostsModule extends ReactContextBaseJavaModule {
    
    public HostsModule(ReactApplicationContext context) {
        super(context);
        q.h(context, "context");
    }

    @Override 
    public String getName() {
        return "Hosts";
    }

    @ReactMethod
    public final void setHosts(String api, String cdn) {
        q.h(api, "api");
        q.h(cdn, "cdn");
        Hosts hosts = Hosts.INSTANCE;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        q.g(reactApplicationContext, "reactApplicationContext");
        hosts.init(reactApplicationContext, api, cdn);
    }
}
