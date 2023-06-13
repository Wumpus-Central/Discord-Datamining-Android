package com.discord.react_strings;

import com.discord.react_resource_cache.ReactResourceCache;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/discord/react_strings/I18nCache;", "Lcom/discord/react_resource_cache/ReactResourceCache;", "Lcom/discord/react_strings/I18nMessage;", "()V", "cacheKey", "", "getCacheKey", "()Ljava/lang/String;", "react_strings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class I18nCache extends ReactResourceCache<I18nMessage> {
    public static final I18nCache INSTANCE = new I18nCache();
    private static final String cacheKey = "i18nCache";

    private I18nCache() {
    }

    @Override // com.discord.react_resource_cache.ReactResourceCache
    public String getCacheKey() {
        return cacheKey;
    }
}
