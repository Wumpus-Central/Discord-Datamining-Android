package com.discord.image.fresco.config;

import android.content.Context;
import com.facebook.cache.disk.DiskCacheConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\b\u001a\u00020\t*\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002J\n\u0010\f\u001a\u00020\t*\u00020\nJ\n\u0010\r\u001a\u00020\t*\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/discord/image/fresco/config/FrescoDiskCache;", "", "()V", "CACHE_DIR", "", "CACHE_DIR_SMALL", "MAX_DISK_CACHE_SIZE", "", "newDiskCacheConfig", "Lcom/facebook/cache/disk/DiskCacheConfig;", "Landroid/content/Context;", "directoryName", "newRegularDiskCache", "newSmallDiskCache", "fresco_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FrescoDiskCache {
    private static final String CACHE_DIR = "app_images_cache";
    private static final String CACHE_DIR_SMALL = "app_images_cache_small";
    public static final FrescoDiskCache INSTANCE = new FrescoDiskCache();
    private static final long MAX_DISK_CACHE_SIZE = 62914560;

    private FrescoDiskCache() {
    }

    private final DiskCacheConfig newDiskCacheConfig(Context context, String str) {
        DiskCacheConfig n10 = DiskCacheConfig.m(context).p(context.getCacheDir()).o(str).q(MAX_DISK_CACHE_SIZE).n();
        q.f(n10, "newBuilder(this)\n       …IZE)\n            .build()");
        return n10;
    }

    public final DiskCacheConfig newRegularDiskCache(Context context) {
        q.g(context, "<this>");
        return newDiskCacheConfig(context, CACHE_DIR);
    }

    public final DiskCacheConfig newSmallDiskCache(Context context) {
        q.g(context, "<this>");
        return newDiskCacheConfig(context, CACHE_DIR_SMALL);
    }
}
