package com.discord.react_asset_fetcher;

import com.discord.react_resource_cache.ReactResourceCache;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/discord/react_asset_fetcher/ReactAssetCache;", "Lcom/discord/react_resource_cache/ReactResourceCache;", "Lcom/discord/react_asset_fetcher/ReactAsset;", "()V", "cacheKey", "", "getCacheKey", "()Ljava/lang/String;", "react_asset_fetcher_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ReactAssetCache extends ReactResourceCache<ReactAsset> {
    public static final ReactAssetCache INSTANCE = new ReactAssetCache();
    private static final String cacheKey = "ReactAssetCache";

    private ReactAssetCache() {
    }

    @Override // com.discord.react_resource_cache.ReactResourceCache
    public String getCacheKey() {
        return cacheKey;
    }
}
