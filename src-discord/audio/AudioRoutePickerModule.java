package com.discord.audio;

import com.discord.logging.Log;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\bH\u0007J\b\u0010\f\u001a\u00020\bH\u0007J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\u000f"}, d2 = {"Lcom/discord/audio/AudioRoutePickerModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getName", "", "handleAudioRoute", "", "isSpeaker", "", "resetPortOverride", "showAudioPicker", "toggleSpeaker", "Companion", "audio_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AudioRoutePickerModule extends ReactContextBaseJavaModule {
    public static final Companion Companion = new Companion(null);
    private static final String logTag = "AudioRoutePickerModule";

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/discord/audio/AudioRoutePickerModule$Companion;", "", "()V", "logTag", "", "audio_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioRoutePickerModule(ReactApplicationContext reactContext) {
        super(reactContext);
        q.g(reactContext, "reactContext");
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "AudioRoutePicker";
    }

    @ReactMethod
    public final void handleAudioRoute(boolean z10) {
        Log log = Log.INSTANCE;
        Log.i$default(log, logTag, "handleAudioRoute " + z10, (Throwable) null, 4, (Object) null);
    }

    @ReactMethod
    public final void resetPortOverride() {
        Log.i$default(Log.INSTANCE, logTag, "resetPortOverride", (Throwable) null, 4, (Object) null);
    }

    @ReactMethod
    public final void showAudioPicker() {
        Log.i$default(Log.INSTANCE, logTag, "resetPortOverride", (Throwable) null, 4, (Object) null);
    }

    @ReactMethod
    public final void toggleSpeaker(boolean z10) {
        Log log = Log.INSTANCE;
        Log.i$default(log, logTag, "toggleSpeaker " + z10, (Throwable) null, 4, (Object) null);
    }
}
