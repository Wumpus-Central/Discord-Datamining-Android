package com.discord.bridge;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import com.facebook.react.TurboReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import gf.x;
import hf.v;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"com/discord/bridge/DCDModuleProvider$getTurboPackageForModule$1", "Lcom/facebook/react/TurboReactPackage;", "getModule", "Lcom/facebook/react/bridge/NativeModule;", ZeroconfModule.KEY_SERVICE_NAME, "", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "getReactModuleInfoProvider", "Lcom/facebook/react/module/model/ReactModuleInfoProvider;", "app_canaryRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DCDModuleProvider$getTurboPackageForModule$1 extends TurboReactPackage {
    final /* synthetic */ String $moduleName;
    final /* synthetic */ Function1<ReactApplicationContext, NativeModule> $onNativeModule;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public DCDModuleProvider$getTurboPackageForModule$1(String str, Function1<? super ReactApplicationContext, ? extends NativeModule> function1) {
        this.$moduleName = str;
        this.$onNativeModule = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map getReactModuleInfoProvider$lambda$1(String moduleName) {
        Map l10;
        q.g(moduleName, "$moduleName");
        l10 = v.l(x.a(moduleName, new ReactModuleInfo(moduleName, moduleName, false, false, true, false, true)));
        return l10;
    }

    @Override // com.facebook.react.TurboReactPackage
    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        if (reactApplicationContext == null) {
            return null;
        }
        String str2 = this.$moduleName;
        Function1<ReactApplicationContext, NativeModule> function1 = this.$onNativeModule;
        if (q.b(str, str2)) {
            return function1.invoke(reactApplicationContext);
        }
        return null;
    }

    @Override // com.facebook.react.TurboReactPackage
    public ReactModuleInfoProvider getReactModuleInfoProvider() {
        final String str = this.$moduleName;
        return new ReactModuleInfoProvider() { // from class: com.discord.bridge.a
            @Override // com.facebook.react.module.model.ReactModuleInfoProvider
            public final Map getReactModuleInfos() {
                Map reactModuleInfoProvider$lambda$1;
                reactModuleInfoProvider$lambda$1 = DCDModuleProvider$getTurboPackageForModule$1.getReactModuleInfoProvider$lambda$1(str);
                return reactModuleInfoProvider$lambda$1;
            }
        };
    }
}
