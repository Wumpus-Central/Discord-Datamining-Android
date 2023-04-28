package com.discord.chat.presentation.message.view.voicemessages;

import com.discord.chat.presentation.message.view.voicemessages.AudioWaveView;
import com.discord.media_player.MediaPlayer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import kotlinx.coroutines.Job;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m15073d2 = {"<anonymous>", "", "progressEvent", "Lcom/discord/chat/presentation/message/view/voicemessages/AudioWaveView$ProgressEvent;", "invoke"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class AudioPlayerView$configureAudioWave$1 extends AbstractC9973s implements Function1<AudioWaveView.ProgressEvent, Unit> {
    final /* synthetic */ AudioPlayerViewState $state;
    final /* synthetic */ AudioPlayerView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioPlayerView$configureAudioWave$1(AudioPlayerView audioPlayerView, AudioPlayerViewState audioPlayerViewState) {
        super(1);
        this.this$0 = audioPlayerView;
        this.$state = audioPlayerViewState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AudioWaveView.ProgressEvent progressEvent) {
        invoke2(progressEvent);
        return Unit.f22042a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(AudioWaveView.ProgressEvent progressEvent) {
        Job job;
        long j;
        long j2;
        long j3;
        boolean z;
        C9971q.m14633g(progressEvent, "progressEvent");
        job = this.this$0.resetJob;
        if (job != null) {
            Job.C9996a.m14571a(job, null, 1, null);
        }
        MediaPlayer player$chat_release = this.$state.getPlayer$chat_release();
        int eventAction = progressEvent.getEventAction();
        if (eventAction != 0) {
            if (eventAction == 1) {
                if (player$chat_release != null) {
                    this.this$0.toggleDurationEmitter(this.$state.shouldEmitDuration$chat_release());
                    float progress = progressEvent.getProgress();
                    j3 = this.this$0.durationMs;
                    player$chat_release.seekTo(progress * ((float) j3));
                    z = this.this$0.wasPlayingBeforeBeingPaused;
                    if (z) {
                        this.this$0.wasPlayingBeforeBeingPaused = false;
                        this.$state.play$chat_release();
                    }
                } else {
                    AudioPlayerViewState audioPlayerViewState = this.$state;
                    float progress2 = progressEvent.getProgress();
                    j2 = this.this$0.durationMs;
                    audioPlayerViewState.setCurrentProgress$chat_release(progress2, j2);
                }
            }
        } else if (player$chat_release != null) {
            this.this$0.wasPlayingBeforeBeingPaused = player$chat_release.shouldPlay();
            this.$state.pause$chat_release();
            this.this$0.toggleDurationEmitter(false);
        }
        AudioPlayerView audioPlayerView = this.this$0;
        float progress3 = 1 - progressEvent.getProgress();
        j = this.this$0.durationMs;
        AudioPlayerView.configureDuration$default(audioPlayerView, Long.valueOf(progress3 * ((float) j)), false, 2, null);
        this.this$0.getBinding().wave.setAudioProgress(progressEvent.getProgress(), true);
    }
}
