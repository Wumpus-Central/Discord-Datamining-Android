package com.discord.chat.presentation.message.view.voicemessages;

import com.discord.media_player.MediaPlayer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;


@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "event", "Lcom/discord/media_player/MediaPlayer$Event;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

public final class AudioPlayerView$prepareAudio$1 extends s implements Function1<MediaPlayer.Event, Unit> {
    final  AudioPlayerView this$0;

    
    
    public AudioPlayerView$prepareAudio$1(AudioPlayerView audioPlayerView) {
        super(1);
        this.this$0 = audioPlayerView;
    }

    @Override 
    public   Unit invoke(MediaPlayer.Event event) {
        invoke2(event);
        return Unit.f20679a;
    }

    
    public final void invoke2(MediaPlayer.Event event) {
        q.g(event, "event");
        if (q.b(event, MediaPlayer.Event.Paused.INSTANCE) ? true : q.b(event, MediaPlayer.Event.PlaybackEnded.INSTANCE)) {
            this.this$0.maybeLogPlaybackEnded();
        } else if (event instanceof MediaPlayer.Event.PlaybackError) {
            this.this$0.maybeLogPlaybackFailed(((MediaPlayer.Event.PlaybackError) event).getException().getMessage());
        } else if (q.b(event, MediaPlayer.Event.StartedPlaying.INSTANCE)) {
            this.this$0.maybeLogPlaybackStarted();
        }
        AudioPlayerView.setState$default(this.this$0, null, true, 1, null);
    }
}
