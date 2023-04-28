package com.discord.chat.presentation.message.view.voicemessages;

import android.app.Activity;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;
import kotlin.Metadata;
import kotlin.jvm.internal.C9677q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@ReactModule(name = AudioPlayerManagerModule.NAME)
@Metadata(m15074d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\r"}, m15073d2 = {"Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManagerModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getName", "", "maybePlayCurrentPlayer", "", "pauseCurrentPlayer", "storePauseState", "", "Companion", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class AudioPlayerManagerModule extends ReactContextBaseJavaModule {
    public static final Companion Companion = new Companion(null);
    public static final String NAME = "DCDAudioPlayerManager";

    @Metadata(m15074d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m15073d2 = {"Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManagerModule$Companion;", "", "()V", "NAME", "", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioPlayerManagerModule(ReactApplicationContext reactContext) {
        super(reactContext);
        C9677q.m14633g(reactContext, "reactContext");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void maybePlayCurrentPlayer$lambda$1() {
        AudioPlayerManager.INSTANCE.maybePlayCurrentPlayer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pauseCurrentPlayer$lambda$0(boolean z) {
        AudioPlayerManager.INSTANCE.pauseCurrentPlayer(z);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public final void maybePlayCurrentPlayer() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            currentActivity.runOnUiThread(new Runnable() { // from class: com.discord.chat.presentation.message.view.voicemessages.d
                @Override // java.lang.Runnable
                public final void run() {
                    AudioPlayerManagerModule.maybePlayCurrentPlayer$lambda$1();
                }
            });
        }
    }

    @ReactMethod
    public final void pauseCurrentPlayer(final boolean z) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            currentActivity.runOnUiThread(new Runnable() { // from class: com.discord.chat.presentation.message.view.voicemessages.c
                @Override // java.lang.Runnable
                public final void run() {
                    AudioPlayerManagerModule.pauseCurrentPlayer$lambda$0(z);
                }
            });
        }
    }
}
