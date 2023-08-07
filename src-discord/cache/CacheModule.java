package com.discord.cache;

import android.content.Context;
import android.content.SharedPreferences;
import com.discord.app_database.AppDatabaseModule;
import com.discord.cache.legacy.LegacyCacheUtilsKt;
import com.discord.logging.Log;
import com.discord.misc.utilities.time.TimeElapsed;
import com.discord.tti_manager.TTIMetrics;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.module.annotations.ReactModule;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.collections.w;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import nf.a;
import ni.v;

@ReactModule(name = "MMKVManager")
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000  2\u00020\u0001:\u0001 B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\n\u001a\u00020\u000bH\u0007J\u0012\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\rH\u0007J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\b\u0010\u0011\u001a\u00020\rH\u0016J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0013\u001a\u00020\u0014J\u0010\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0018\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007J\u0018\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\rH\u0007R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/discord/cache/CacheModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "fastCacheSharedPrefs", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "migrationSharedPrefs", "sharedPrefs", "clear", "", "getItem", "", "key", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "getName", "getToken", "sanitized", "", "migrateAmoledThemeSetting", "context", "Lcom/facebook/react/bridge/ReactContext;", "migrateAuthToken", "migrateLegacySettings", "refresh", "exclude", "Lcom/facebook/react/bridge/ReadableArray;", "removeItem", "setItem", "value", "Companion", "cache_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class CacheModule extends ReactContextBaseJavaModule {
    private static final String CACHE_STORE_NAME = "CacheStore";
    public static final Companion Companion = new Companion(null);
    private static final HashSet<String> FAST_CACHE_KEYS;
    private static boolean cacheLoaded;
    private static final String logTag;
    private final SharedPreferences fastCacheSharedPrefs;
    private final SharedPreferences migrationSharedPrefs;
    private final SharedPreferences sharedPrefs;

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0006j\b\u0012\u0004\u0012\u00020\u0004`\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/discord/cache/CacheModule$Companion;", "", "()V", "CACHE_STORE_NAME", "", "FAST_CACHE_KEYS", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "cacheLoaded", "", "logTag", "get", "Lcom/discord/cache/CacheModule;", "reactContext", "Lcom/facebook/react/bridge/ReactContext;", "getOrNull", "quickInitCache", "", "applicationContext", "Landroid/content/Context;", "cache_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CacheModule get(ReactContext reactContext) {
            q.h(reactContext, "reactContext");
            CacheModule orNull = getOrNull(reactContext);
            q.e(orNull);
            return orNull;
        }

        public final CacheModule getOrNull(ReactContext reactContext) {
            q.h(reactContext, "reactContext");
            return (CacheModule) reactContext.getNativeModule(CacheModule.class);
        }

        public final void quickInitCache(Context applicationContext) {
            q.h(applicationContext, "applicationContext");
            a.b(false, false, null, null, 0, new CacheModule$Companion$quickInitCache$1(applicationContext), 31, null);
        }
    }

    static {
        HashSet<String> e10;
        e10 = w.e("_clientStateKey", "_userIdKey", AppDatabaseModule.LAST_DATABASE_USER_ID_PREFERENCES_KEY, "token");
        FAST_CACHE_KEYS = e10;
        String simpleName = CacheModule.class.getSimpleName();
        q.g(simpleName, "CacheModule::class.java.simpleName");
        logTag = simpleName;
    }

    
    public CacheModule(ReactApplicationContext reactContext) {
        super(reactContext);
        q.h(reactContext, "reactContext");
        this.sharedPrefs = reactContext.getSharedPreferences(CACHE_STORE_NAME, 0);
        this.migrationSharedPrefs = reactContext.getSharedPreferences("MigrationPrefStore", 0);
        this.fastCacheSharedPrefs = reactContext.getSharedPreferences("FastCacheStore", 0);
        migrateLegacySettings(reactContext);
    }

    public static  String getToken$default(CacheModule cacheModule, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return cacheModule.getToken(z10);
    }

    private final void migrateAmoledThemeSetting(ReactContext reactContext) {
        boolean wasLegacyUsingAMOLEDTheme = LegacyCacheUtilsKt.wasLegacyUsingAMOLEDTheme(reactContext);
        SharedPreferences sharedPrefs = this.sharedPrefs;
        q.g(sharedPrefs, "sharedPrefs");
        SharedPreferences.Editor editor = sharedPrefs.edit();
        q.g(editor, "editor");
        if (wasLegacyUsingAMOLEDTheme) {
            editor.putString("legacy_useAMOLEDTheme", "true");
        } else {
            editor.remove("legacy_useAMOLEDTheme");
        }
        editor.apply();
    }

    private final void migrateAuthToken(ReactContext reactContext) {
        String legacyAuthToken;
        if (getItem("token") == null && (legacyAuthToken = LegacyCacheUtilsKt.getLegacyAuthToken(reactContext)) != null) {
            setItem("token", "\"" + legacyAuthToken + "\"");
        }
    }

    private final void migrateLegacySettings(ReactContext reactContext) {
        if (!this.migrationSharedPrefs.getBoolean("migrated_legacy", false)) {
            migrateAuthToken(reactContext);
            migrateAmoledThemeSetting(reactContext);
            SharedPreferences migrationSharedPrefs = this.migrationSharedPrefs;
            q.g(migrationSharedPrefs, "migrationSharedPrefs");
            SharedPreferences.Editor editor = migrationSharedPrefs.edit();
            q.g(editor, "editor");
            editor.putBoolean("migrated_legacy", true);
            editor.apply();
        }
    }

    @ReactMethod
    public final void clear() {
        SharedPreferences sharedPrefs = this.sharedPrefs;
        q.g(sharedPrefs, "sharedPrefs");
        SharedPreferences.Editor editor = sharedPrefs.edit();
        q.g(editor, "editor");
        editor.clear();
        editor.apply();
        SharedPreferences fastCacheSharedPrefs = this.fastCacheSharedPrefs;
        q.g(fastCacheSharedPrefs, "fastCacheSharedPrefs");
        SharedPreferences.Editor editor2 = fastCacheSharedPrefs.edit();
        q.g(editor2, "editor");
        editor2.clear();
        editor2.apply();
    }

    @ReactMethod
    public final void getItem(String key, Promise promise) {
        q.h(key, "key");
        q.h(promise, "promise");
        if (!cacheLoaded) {
            TTIMetrics tTIMetrics = TTIMetrics.INSTANCE;
            TTIMetrics.record$default(tTIMetrics, "WARNING: Cache accessed before parsed " + key, 0L, null, false, 14, null);
        }
        try {
            promise.resolve(this.sharedPrefs.getString(key, null));
        } catch (Throwable th2) {
            promise.reject(th2);
        }
    }

    @Override 
    public String getName() {
        return "MMKVManager";
    }

    public final String getToken(boolean z10) {
        String r02;
        if (!z10) {
            return getItem("token");
        }
        String item = getItem("token");
        if (item == null) {
            return null;
        }
        r02 = v.r0(item, "\"");
        return r02;
    }

    @ReactMethod
    public final void refresh(ReadableArray exclude, Promise promise) {
        Throwable th2;
        Set F0;
        q.h(exclude, "exclude");
        q.h(promise, "promise");
        TimeElapsed timeElapsed = new TimeElapsed(0L, 1, null);
        TTIMetrics.record$default(TTIMetrics.INSTANCE, "Storage.refresh() Start", 0L, null, false, 14, null);
        try {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            ArrayList<Object> arrayList = exclude.toArrayList();
            q.g(arrayList, "exclude.toArrayList()");
            F0 = r.F0(arrayList);
            Log log = Log.INSTANCE;
            String str = logTag;
            Log.i$default(log, str, "Refresh preferences excluding " + F0, (Throwable) null, 4, (Object) null);
            try {
                Iterator<T> it = this.sharedPrefs.getAll().entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    String str2 = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (!F0.contains(str2)) {
                        q.f(value, "null cannot be cast to non-null type kotlin.String");
                        writableNativeMap.putString(str2, (String) value);
                    }
                }
                promise.resolve(writableNativeMap);
                Log log2 = Log.INSTANCE;
                String str3 = logTag;
                String duration = timeElapsed.getDuration();
                Log.i$default(log2, str3, "Refreshed preferences in " + duration, (Throwable) null, 4, (Object) null);
            } catch (Throwable th3) {
                th2 = th3;
                try {
                    promise.reject(th2);
                } finally {
                    TTIMetrics.record$default(TTIMetrics.INSTANCE, "Storage.refresh() End", 0L, null, false, 14, null);
                }
            }
        } catch (Throwable th4) {
            th2 = th4;
        }
    }

    @ReactMethod
    public final void removeItem(String key) {
        q.h(key, "key");
        SharedPreferences sharedPrefs = this.sharedPrefs;
        q.g(sharedPrefs, "sharedPrefs");
        SharedPreferences.Editor editor = sharedPrefs.edit();
        q.g(editor, "editor");
        editor.remove(key);
        editor.apply();
        if (FAST_CACHE_KEYS.contains(key)) {
            SharedPreferences fastCacheSharedPrefs = this.fastCacheSharedPrefs;
            q.g(fastCacheSharedPrefs, "fastCacheSharedPrefs");
            SharedPreferences.Editor editor2 = fastCacheSharedPrefs.edit();
            q.g(editor2, "editor");
            editor2.remove(key);
            editor2.apply();
        }
    }

    @ReactMethod
    public final void setItem(String key, String value) {
        q.h(key, "key");
        q.h(value, "value");
        SharedPreferences sharedPrefs = this.sharedPrefs;
        q.g(sharedPrefs, "sharedPrefs");
        SharedPreferences.Editor editor = sharedPrefs.edit();
        q.g(editor, "editor");
        editor.putString(key, value);
        editor.apply();
        if (FAST_CACHE_KEYS.contains(key)) {
            SharedPreferences fastCacheSharedPrefs = this.fastCacheSharedPrefs;
            q.g(fastCacheSharedPrefs, "fastCacheSharedPrefs");
            SharedPreferences.Editor editor2 = fastCacheSharedPrefs.edit();
            q.g(editor2, "editor");
            editor2.putString(key, value);
            editor2.apply();
        }
    }

    @ReactMethod
    public final String getItem(String key) {
        q.h(key, "key");
        HashSet<String> hashSet = FAST_CACHE_KEYS;
        if (hashSet.contains(key)) {
            if (!this.fastCacheSharedPrefs.getBoolean("initialized", false)) {
                SharedPreferences fastCacheSharedPrefs = this.fastCacheSharedPrefs;
                q.g(fastCacheSharedPrefs, "fastCacheSharedPrefs");
                SharedPreferences.Editor editor = fastCacheSharedPrefs.edit();
                q.g(editor, "editor");
                editor.putBoolean("initialized", true);
                for (String str : hashSet) {
                    editor.putString(str, this.sharedPrefs.getString(str, null));
                }
                editor.apply();
            }
            return this.fastCacheSharedPrefs.getString(key, null);
        }
        if (!cacheLoaded) {
            TTIMetrics tTIMetrics = TTIMetrics.INSTANCE;
            TTIMetrics.record$default(tTIMetrics, "WARNING: Cache accessed before parsed " + key, 0L, null, false, 14, null);
        }
        return this.sharedPrefs.getString(key, null);
    }
}
