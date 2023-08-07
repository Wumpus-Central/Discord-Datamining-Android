package com.discord.bridge;

import com.facebook.react.bridge.JSIModule;
import com.facebook.react.bridge.JSIModulePackage;
import com.facebook.react.bridge.JSIModuleSpec;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.j;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/discord/bridge/DCDJSIModulePackage;", "Lcom/facebook/react/bridge/JSIModulePackage;", "()V", "getJSIModules", "", "Lcom/facebook/react/bridge/JSIModuleSpec;", "Lcom/facebook/react/bridge/JSIModule;", "reactApplicationContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "jsContext", "Lcom/facebook/react/bridge/JavaScriptContextHolder;", "app_canaryRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class DCDJSIModulePackage implements JSIModulePackage {
    @Override 
    public List<JSIModuleSpec<JSIModule>> getJSIModules(ReactApplicationContext reactApplicationContext, JavaScriptContextHolder jsContext) {
        List<JSIModuleSpec<JSIModule>> h10;
        q.h(reactApplicationContext, "reactApplicationContext");
        q.h(jsContext, "jsContext");
        h10 = j.h();
        return h10;
    }
}
