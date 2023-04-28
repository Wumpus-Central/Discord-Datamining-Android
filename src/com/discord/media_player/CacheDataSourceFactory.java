package com.discord.media_player;

import android.content.Context;
import com.brentvatne.exoplayer.C4142b;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DefaultHttpDataSource;
import com.google.android.exoplayer2.upstream.cache.C5295b;
import com.google.android.exoplayer2.upstream.cache.C5297c;
import com.google.android.exoplayer2.upstream.cache.SimpleCache;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p081e9.C6787r;
import p100f9.C7098j;
import p131h7.C7933c;

@Metadata(m15074d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0011\b\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, m15073d2 = {"Lcom/discord/media_player/CacheDataSourceFactory;", "Lcom/google/android/exoplayer2/upstream/DataSource$Factory;", "defaultDatasourceFactory", "Lcom/google/android/exoplayer2/upstream/DefaultHttpDataSource$Factory;", "(Lcom/google/android/exoplayer2/upstream/DefaultHttpDataSource$Factory;)V", "createDataSource", "Lcom/google/android/exoplayer2/upstream/DataSource;", "Companion", "media_player_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes5.dex */
public final class CacheDataSourceFactory implements DataSource.Factory {
    private static final String CACHE_DIR_NAME = "app_media_player";
    private static final long CACHE_MAX_SIZE = 104857600;
    public static final Companion Companion = new Companion(null);
    private static SimpleCache cache;
    private static CacheDataSourceFactory factory;
    private final DefaultHttpDataSource.Factory defaultDatasourceFactory;

    @Metadata(m15074d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000b\u001a\u00020\nJ\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m15073d2 = {"Lcom/discord/media_player/CacheDataSourceFactory$Companion;", "", "()V", "CACHE_DIR_NAME", "", "CACHE_MAX_SIZE", "", "cache", "Lcom/google/android/exoplayer2/upstream/cache/SimpleCache;", "factory", "Lcom/discord/media_player/CacheDataSourceFactory;", "getInstance", "getSimpleCache", "context", "Landroid/content/Context;", "init", "", "media_player_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final SimpleCache getSimpleCache(Context context) {
            return new SimpleCache(new File(context.getCacheDir(), CacheDataSourceFactory.CACHE_DIR_NAME), new C7098j(CacheDataSourceFactory.CACHE_MAX_SIZE), new C7933c(context));
        }

        public final CacheDataSourceFactory getInstance() {
            CacheDataSourceFactory cacheDataSourceFactory = CacheDataSourceFactory.factory;
            if (cacheDataSourceFactory != null) {
                return cacheDataSourceFactory;
            }
            C9971q.m14615y("factory");
            return null;
        }

        public final void init(Context context) {
            C9971q.m14633g(context, "context");
            CacheDataSourceFactory.cache = getSimpleCache(context);
            CacheDataSourceFactory cacheDataSourceFactory = null;
            CacheDataSourceFactory.factory = new CacheDataSourceFactory(null, 1, null);
            CacheDataSourceFactory cacheDataSourceFactory2 = CacheDataSourceFactory.factory;
            if (cacheDataSourceFactory2 == null) {
                C9971q.m14615y("factory");
            } else {
                cacheDataSourceFactory = cacheDataSourceFactory2;
            }
            C4142b.m32654f(cacheDataSourceFactory);
        }
    }

    private CacheDataSourceFactory(DefaultHttpDataSource.Factory factory2) {
        this.defaultDatasourceFactory = factory2;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
    public DataSource createDataSource() {
        SimpleCache simpleCache;
        SimpleCache simpleCache2 = cache;
        SimpleCache simpleCache3 = null;
        if (simpleCache2 == null) {
            C9971q.m14615y("cache");
            simpleCache = null;
        } else {
            simpleCache = simpleCache2;
        }
        DefaultHttpDataSource a = this.defaultDatasourceFactory.createDataSource();
        C6787r rVar = new C6787r();
        SimpleCache simpleCache4 = cache;
        if (simpleCache4 == null) {
            C9971q.m14615y("cache");
        } else {
            simpleCache3 = simpleCache4;
        }
        return new C5297c(simpleCache, a, rVar, new C5295b(simpleCache3, CACHE_MAX_SIZE), 3, null);
    }

    /* synthetic */ CacheDataSourceFactory(DefaultHttpDataSource.Factory factory2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new DefaultHttpDataSource.Factory() : factory2);
    }
}
