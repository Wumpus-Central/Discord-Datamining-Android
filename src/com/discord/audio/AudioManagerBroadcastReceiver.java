package com.discord.audio;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.discord.audio.enums.AudioManagerBroadcastAction;
import com.discord.audio.enums.ScoAudioState;
import com.discord.audio.enums.WiredHeadsetState;
import com.discord.logging.Log;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C9610j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9677q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m15074d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB-\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\bJ\u001a\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u000e\u0010\u000e\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bR\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m15073d2 = {"Lcom/discord/audio/AudioManagerBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "onWiredHeadsetPlug", "Lkotlin/Function1;", "Lcom/discord/audio/enums/WiredHeadsetState;", "", "onScoAudioStateUpdate", "Lcom/discord/audio/enums/ScoAudioState$Update;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "onReceive", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "register", "Companion", "audio_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes.dex */
public final class AudioManagerBroadcastReceiver extends BroadcastReceiver {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "AudioManagerBroadcasts";
    private final Function1<ScoAudioState.Update, Unit> onScoAudioStateUpdate;
    private final Function1<WiredHeadsetState, Unit> onWiredHeadsetPlug;

    @Metadata(m15074d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m15073d2 = {"Lcom/discord/audio/AudioManagerBroadcastReceiver$Companion;", "", "()V", "TAG", "", "audio_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AudioManagerBroadcastAction.values().length];
            try {
                iArr[AudioManagerBroadcastAction.HeadsetPlug.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AudioManagerBroadcastAction.ScoAudioStateUpdated.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AudioManagerBroadcastReceiver(Function1<? super WiredHeadsetState, Unit> onWiredHeadsetPlug, Function1<? super ScoAudioState.Update, Unit> onScoAudioStateUpdate) {
        C9677q.m14633g(onWiredHeadsetPlug, "onWiredHeadsetPlug");
        C9677q.m14633g(onScoAudioStateUpdate, "onScoAudioStateUpdate");
        this.onWiredHeadsetPlug = onWiredHeadsetPlug;
        this.onScoAudioStateUpdate = onScoAudioStateUpdate;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        C9677q.m14633g(context, "context");
        if (intent != null) {
            AudioManagerBroadcastAction from = AudioManagerBroadcastAction.Companion.from(intent);
            if (from == null) {
                Log log = Log.INSTANCE;
                String action = intent.getAction();
                Log.w$default(log, TAG, "unable to parse AudioManagerBroadcastAction for action: " + action, (Throwable) null, 4, (Object) null);
                return;
            }
            try {
                int i = WhenMappings.$EnumSwitchMapping$0[from.ordinal()];
                if (i == 1) {
                    this.onWiredHeadsetPlug.invoke(WiredHeadsetState.Companion.from(intent));
                } else if (i == 2) {
                    this.onScoAudioStateUpdate.invoke(ScoAudioState.Companion.getScoAudioUpdate(intent));
                }
            } catch (Throwable th2) {
                Log log2 = Log.INSTANCE;
                log2.m32179e(TAG, "error handling " + from, th2);
            }
        }
    }

    public final void register(Context context) {
        List<AudioManagerBroadcastAction> l;
        C9677q.m14633g(context, "context");
        l = C9610j.m14817l(AudioManagerBroadcastAction.HeadsetPlug, AudioManagerBroadcastAction.ScoAudioStateUpdated);
        IntentFilter intentFilter = new IntentFilter();
        for (AudioManagerBroadcastAction audioManagerBroadcastAction : l) {
            intentFilter.addAction(audioManagerBroadcastAction.getAction());
        }
        context.registerReceiver(this, intentFilter);
    }
}
