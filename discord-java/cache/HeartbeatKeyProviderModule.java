package com.discord.cache;

import android.content.SharedPreferences;
import com.discord.codegen.NativeHeartbeatKeyProviderSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.annotations.ReactModule;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@ReactModule(name = "HeartbeatKeyProviderModule")
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\n\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\n\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\n\u0010\u000b\u001a\u0004\u0018\u00010\tH\u0016J\n\u0010\f\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\r\u001a\u00020\tH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\tH\u0016J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\tH\u0016J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\tH\u0016J\u0010\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\tH\u0016R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/discord/cache/HeartbeatKeyProviderModule;", "Lcom/discord/codegen/NativeHeartbeatKeyProviderSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "sharedPrefs", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "getHeartbeatInitializedTimestamp", "", "getHeartbeatRefreshedTimestamp", "getHeartbeatUUID", "getLatestHeartbeatEventTimestamp", "getName", "setHeartbeatInitializedTimestamp", "", "timestamp", "setHeartbeatRefreshedTimestamp", "setHeartbeatUUID", "uuid", "setLatestHeartbeatEventTimestamp", "Companion", "cache_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HeartbeatKeyProviderModule extends NativeHeartbeatKeyProviderSpec {
    public static final Companion Companion = new Companion(null);
    public static final String NAME = "RTNHeartbeatKeyProvider";
    private final SharedPreferences sharedPrefs;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/discord/cache/HeartbeatKeyProviderModule$Companion;", "", "()V", "NAME", "", "create", "Lcom/facebook/react/bridge/NativeModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "cache_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final NativeModule create(ReactApplicationContext reactContext) {
            q.g(reactContext, "reactContext");
            return new HeartbeatKeyProviderModule(reactContext);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeartbeatKeyProviderModule(ReactApplicationContext reactContext) {
        super(reactContext);
        q.g(reactContext, "reactContext");
        this.sharedPrefs = reactContext.getSharedPreferences("heartbeat_keys", 0);
    }

    @Override // com.discord.codegen.NativeHeartbeatKeyProviderSpec
    public String getHeartbeatInitializedTimestamp() {
        return this.sharedPrefs.getString(HeartbeatKeyProviderModuleKt.LATEST_HEARTBEAST_INITIALIZED_TIMESTAMP, null);
    }

    @Override // com.discord.codegen.NativeHeartbeatKeyProviderSpec
    public String getHeartbeatRefreshedTimestamp() {
        return this.sharedPrefs.getString(HeartbeatKeyProviderModuleKt.LATEST_HEARTBEAST_TIMESTAMP, null);
    }

    @Override // com.discord.codegen.NativeHeartbeatKeyProviderSpec
    public String getHeartbeatUUID() {
        return this.sharedPrefs.getString(HeartbeatKeyProviderModuleKt.LATEST_HEARTBEAT_UUID, null);
    }

    @Override // com.discord.codegen.NativeHeartbeatKeyProviderSpec
    public String getLatestHeartbeatEventTimestamp() {
        return this.sharedPrefs.getString(HeartbeatKeyProviderModuleKt.LATEST_HEARTBEAST_EVENT_TIMESTAMP, null);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.discord.codegen.NativeHeartbeatKeyProviderSpec
    public void setHeartbeatInitializedTimestamp(String timestamp) {
        q.g(timestamp, "timestamp");
        SharedPreferences sharedPrefs = this.sharedPrefs;
        q.f(sharedPrefs, "sharedPrefs");
        SharedPreferences.Editor editor = sharedPrefs.edit();
        q.f(editor, "editor");
        editor.putString(HeartbeatKeyProviderModuleKt.LATEST_HEARTBEAST_INITIALIZED_TIMESTAMP, timestamp);
        editor.apply();
    }

    @Override // com.discord.codegen.NativeHeartbeatKeyProviderSpec
    public void setHeartbeatRefreshedTimestamp(String timestamp) {
        q.g(timestamp, "timestamp");
        SharedPreferences sharedPrefs = this.sharedPrefs;
        q.f(sharedPrefs, "sharedPrefs");
        SharedPreferences.Editor editor = sharedPrefs.edit();
        q.f(editor, "editor");
        editor.putString(HeartbeatKeyProviderModuleKt.LATEST_HEARTBEAST_TIMESTAMP, timestamp);
        editor.apply();
    }

    @Override // com.discord.codegen.NativeHeartbeatKeyProviderSpec
    public void setHeartbeatUUID(String uuid) {
        q.g(uuid, "uuid");
        SharedPreferences sharedPrefs = this.sharedPrefs;
        q.f(sharedPrefs, "sharedPrefs");
        SharedPreferences.Editor editor = sharedPrefs.edit();
        q.f(editor, "editor");
        editor.putString(HeartbeatKeyProviderModuleKt.LATEST_HEARTBEAT_UUID, uuid);
        editor.apply();
    }

    @Override // com.discord.codegen.NativeHeartbeatKeyProviderSpec
    public void setLatestHeartbeatEventTimestamp(String timestamp) {
        q.g(timestamp, "timestamp");
        SharedPreferences sharedPrefs = this.sharedPrefs;
        q.f(sharedPrefs, "sharedPrefs");
        SharedPreferences.Editor editor = sharedPrefs.edit();
        q.f(editor, "editor");
        editor.putString(HeartbeatKeyProviderModuleKt.LATEST_HEARTBEAST_TIMESTAMP, timestamp);
        editor.apply();
    }
}
