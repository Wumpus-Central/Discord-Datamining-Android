package com.discord.audio.enums;

import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0080\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/discord/audio/enums/AudioManagerBroadcastAction;", "", "action", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getAction", "()Ljava/lang/String;", "AudioBecomingNoisy", "HeadsetPlug", "ScoAudioStateUpdated", "MicrophoneMuteChanged", "SpeakerphoneStateChanged", "Companion", "audio_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public enum AudioManagerBroadcastAction {
    AudioBecomingNoisy("android.media.AUDIO_BECOMING_NOISY"),
    HeadsetPlug("android.intent.action.HEADSET_PLUG"),
    ScoAudioStateUpdated("android.media.ACTION_SCO_AUDIO_STATE_UPDATED"),
    MicrophoneMuteChanged("android.media.action.MICROPHONE_MUTE_CHANGED"),
    SpeakerphoneStateChanged("android.media.action.SPEAKERPHONE_STATE_CHANGED");
    
    public static final Companion Companion = new Companion(null);
    private final String action;

    AudioManagerBroadcastAction(String str) {
        this.action = str;
    }

    public final String getAction() {
        return this.action;
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/discord/audio/enums/AudioManagerBroadcastAction$Companion;", "", "()V", "from", "Lcom/discord/audio/enums/AudioManagerBroadcastAction;", "intent", "Landroid/content/Intent;", "action", "", "audio_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AudioManagerBroadcastAction from(String action) {
            AudioManagerBroadcastAction[] values;
            q.h(action, "action");
            for (AudioManagerBroadcastAction audioManagerBroadcastAction : AudioManagerBroadcastAction.values()) {
                if (q.c(audioManagerBroadcastAction.getAction(), action)) {
                    return audioManagerBroadcastAction;
                }
            }
            return null;
        }

        public final AudioManagerBroadcastAction from(Intent intent) {
            q.h(intent, "intent");
            String action = intent.getAction();
            if (action != null) {
                return AudioManagerBroadcastAction.Companion.from(action);
            }
            return null;
        }
    }
}
