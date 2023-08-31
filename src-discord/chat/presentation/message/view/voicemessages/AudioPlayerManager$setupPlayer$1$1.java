package com.discord.chat.presentation.message.view.voicemessages;

import com.discord.chat.presentation.message.view.voicemessages.AudioPlayerManager;
import com.discord.media_player.MediaPlayer;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;


@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "event", "Lcom/discord/media_player/MediaPlayer$Event;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

public final class AudioPlayerManager$setupPlayer$1$1 extends s implements Function1<MediaPlayer.Event, Unit> {
    final  Function1<MediaPlayer.Event, Unit> $onStateChanged;
    final  AudioPlayerManager.AudioSource $source;

    
    
    
    public AudioPlayerManager$setupPlayer$1$1(AudioPlayerManager.AudioSource audioSource, Function1<? super MediaPlayer.Event, Unit> function1) {
        super(1);
        this.$source = audioSource;
        this.$onStateChanged = function1;
    }

    @Override 
    public   Unit invoke(MediaPlayer.Event event) {
        invoke2(event);
        return Unit.f21215a;
    }

    
    public final void invoke2(MediaPlayer.Event event) {
        MediaPlayer.Event event2;
        Map map;
        q.h(event, "event");
        if (q.c(event, MediaPlayer.Event.PlaybackEnded.INSTANCE)) {
            map = AudioPlayerManager.currentProgressMap;
            map.remove(this.$source);
            AudioPlayerManager.INSTANCE.abandonAudioFocus();
        } else {
            AudioPlayerManager.INSTANCE.storeDuration(this.$source);
        }
        event2 = AudioPlayerManager.mediaPlayerState;
        if (!q.c(event2, event)) {
            AudioPlayerManager.mediaPlayerState = event;
            this.$onStateChanged.invoke(event);
        }
    }
}
