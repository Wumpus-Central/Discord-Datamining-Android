package com.discord.app_database;

import android.content.Context;
import com.discord.cache.CacheModule;
import com.discord.kvstorage.discordapp.DiscordMobileApi;
import com.discord.logging.Log;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;
import java.util.Map;
import kf.x;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.q;
import kotlinx.serialization.json.Json;
import lf.v;
import of.a;
import xi.v1;

@ReactModule(name = AppDatabaseModule.LOG_TAG)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0007¨\u0006\r"}, d2 = {"Lcom/discord/app_database/AppDatabaseModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getConstants", "", "", "getName", "setUserId", "", "userId", "Companion", "app_database_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class AppDatabaseModule extends ReactContextBaseJavaModule {
    public static final Companion Companion = new Companion(null);
    public static final String LAST_DATABASE_USER_ID_PREFERENCES_KEY = "_databaseUserId";
    private static final String LAST_DATABASE_USER_ID_PREFERENCES_STORE = "FastCacheStore";
    private static final String LOG_TAG = "AppDatabase";
    private static String dataDirectory;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0002J\u0019\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0002\u0010\rJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/discord/app_database/AppDatabaseModule$Companion;", "", "()V", "LAST_DATABASE_USER_ID_PREFERENCES_KEY", "", "LAST_DATABASE_USER_ID_PREFERENCES_STORE", "LOG_TAG", "dataDirectory", "databaseName", "userId", "getGuildVersions", "", "Lcom/discord/app_database/GuildVersion;", "(Ljava/lang/String;)[Lcom/discord/app_database/GuildVersion;", "initializeAppDatabase", "", "context", "Landroid/content/Context;", "initializeAppDatabaseAsync", "app_database_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final String databaseName(String str) {
            return "@account." + str;
        }

        
        public final void initializeAppDatabaseAsync(Context context) {
            DiscordMobileApi.initialize(AppDatabaseModule.dataDirectory);
            String string = context.getSharedPreferences(AppDatabaseModule.LAST_DATABASE_USER_ID_PREFERENCES_STORE, 0).getString(AppDatabaseModule.LAST_DATABASE_USER_ID_PREFERENCES_KEY, null);
            if (string == null || q.c(string, "")) {
                Log.i$default(Log.INSTANCE, AppDatabaseModule.LOG_TAG, "speculative database open skipped: userId was empty.", (Throwable) null, 4, (Object) null);
                return;
            }
            String databaseName = databaseName(string);
            DiscordMobileApi.openAsync(databaseName);
            Log log = Log.INSTANCE;
            Log.i$default(log, AppDatabaseModule.LOG_TAG, "speculatively opening " + databaseName, (Throwable) null, 4, (Object) null);
        }

        public final GuildVersion[] getGuildVersions(String userId) {
            q.h(userId, "userId");
            if (AppDatabaseModule.dataDirectory == null) {
                Log.e$default(Log.INSTANCE, AppDatabaseModule.LOG_TAG, "couldn't load guild versions: data directory is unavailable", (Throwable) null, 4, (Object) null);
                return new GuildVersion[0];
            }
            DiscordMobileApi.initialize(AppDatabaseModule.dataDirectory);
            try {
                String json = DiscordMobileApi.getGuildVersions(databaseName(userId));
                Json.a aVar = Json.f21969d;
                q.g(json, "json");
                aVar.a();
                return (GuildVersion[]) aVar.b(new v1(f0.b(GuildVersion.class), GuildVersion$$serializer.INSTANCE), json);
            } catch (Exception e10) {
                Log log = Log.INSTANCE;
                String message = e10.getMessage();
                Log.e$default(log, AppDatabaseModule.LOG_TAG, "couldn't load guild versions: " + message, (Throwable) null, 4, (Object) null);
                return new GuildVersion[0];
            }
        }

        public final void initializeAppDatabase(Context context) {
            q.h(context, "context");
            AppDatabaseModule.dataDirectory = context.getFilesDir().getAbsolutePath();
            a.b(false, false, null, null, 0, new AppDatabaseModule$Companion$initializeAppDatabase$1(context), 31, null);
        }
    }

    
    public AppDatabaseModule(ReactApplicationContext reactContext) {
        super(reactContext);
        q.h(reactContext, "reactContext");
    }

    @Override 
    public Map<String, String> getConstants() {
        Map<String, String> l10;
        CacheModule.Companion companion = CacheModule.Companion;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        q.g(reactApplicationContext, "reactApplicationContext");
        l10 = v.l(x.a("userId", companion.get(reactApplicationContext).getItem(LAST_DATABASE_USER_ID_PREFERENCES_KEY)));
        return l10;
    }

    @Override 
    public String getName() {
        return LOG_TAG;
    }

    @ReactMethod
    public final void setUserId(String str) {
        if (str != null) {
            CacheModule.Companion companion = CacheModule.Companion;
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            q.g(reactApplicationContext, "reactApplicationContext");
            companion.get(reactApplicationContext).setItem(LAST_DATABASE_USER_ID_PREFERENCES_KEY, str);
            return;
        }
        CacheModule.Companion companion2 = CacheModule.Companion;
        ReactApplicationContext reactApplicationContext2 = getReactApplicationContext();
        q.g(reactApplicationContext2, "reactApplicationContext");
        companion2.get(reactApplicationContext2).removeItem(LAST_DATABASE_USER_ID_PREFERENCES_KEY);
    }
}
