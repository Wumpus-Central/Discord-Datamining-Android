package com.discord.react_asset_fetcher;

import com.discord.react_resource_cache.ReactResourceCache;
import com.discord.react_resource_cache.ReactResourceModule;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016¢\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/discord/react_asset_fetcher/ReactAssetModule;", "Lcom/discord/react_resource_cache/ReactResourceModule;", "Lcom/discord/react_asset_fetcher/ReactAsset;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "cache", "Lcom/discord/react_resource_cache/ReactResourceCache;", "getName", "", "keys", "", "()[Lcom/discord/react_asset_fetcher/ReactAsset;", "keysRequest", "", "callback", "Lcom/facebook/react/bridge/Callback;", "valuesResult", "values", "Lcom/facebook/react/bridge/ReadableArray;", "react_asset_fetcher_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReactAssetModule extends ReactResourceModule<ReactAsset> {
    private final ReactApplicationContext reactContext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactAssetModule(ReactApplicationContext reactContext) {
        super(reactContext);
        q.g(reactContext, "reactContext");
        this.reactContext = reactContext;
    }

    @Override // com.discord.react_resource_cache.ReactResourceModule
    public ReactResourceCache<ReactAsset> cache() {
        ReactAssetCache reactAssetCache = ReactAssetCache.INSTANCE;
        q.e(reactAssetCache, "null cannot be cast to non-null type com.discord.react_resource_cache.ReactResourceCache<com.discord.react_asset_fetcher.ReactAsset>");
        return reactAssetCache;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "ReactAssetModule";
    }

    @ReactMethod
    public final void keysRequest(Callback callback) {
        q.g(callback, "callback");
        callback.invoke(keysArray());
    }

    @ReactMethod
    public final void valuesResult(ReadableArray values) {
        q.g(values, "values");
        cache().set(this.reactContext, reactResources(values));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.discord.react_resource_cache.ReactResourceModule
    public ReactAsset[] keys() {
        return ReactAsset.values();
    }
}
