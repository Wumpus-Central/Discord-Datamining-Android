package com.discord.audio;

import com.discord.codegen.NativeAudioRouteEmitterSpec;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableNativeMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016¨\u0006\f"}, d2 = {"Lcom/discord/audio/AudioRouteEmitterModule;", "Lcom/discord/codegen/NativeAudioRouteEmitterSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getCurrentRoute", "", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "getName", "", "Companion", "audio_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class AudioRouteEmitterModule extends NativeAudioRouteEmitterSpec {
    public static final Companion Companion = new Companion(null);
    public static final String NAME = "RTNAudioRouteEmitter";

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/discord/audio/AudioRouteEmitterModule$Companion;", "", "()V", "NAME", "", "create", "Lcom/facebook/react/bridge/NativeModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "audio_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final NativeModule create(ReactApplicationContext reactContext) {
            q.h(reactContext, "reactContext");
            return new AudioRouteEmitterModule(reactContext);
        }
    }

    
    public AudioRouteEmitterModule(ReactApplicationContext reactContext) {
        super(reactContext);
        q.h(reactContext, "reactContext");
    }

    @Override 
    public void getCurrentRoute(Promise promise) {
        if (promise != null) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString("routeType", "Speaker");
            writableNativeMap.putBoolean("multipleRoutesAvailable", false);
            promise.resolve(writableNativeMap);
        }
    }

    @Override 
    public String getName() {
        return "RTNAudioRouteEmitter";
    }
}
