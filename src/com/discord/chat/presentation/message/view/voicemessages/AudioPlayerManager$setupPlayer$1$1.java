package com.discord.chat.presentation.message.view.voicemessages;

import com.discord.chat.presentation.message.view.voicemessages.AudioPlayerManager;
import com.discord.media_player.MediaPlayer;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m15073d2 = {"<anonymous>", "", "event", "Lcom/discord/media_player/MediaPlayer$Event;", "invoke"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class AudioPlayerManager$setupPlayer$1$1 extends AbstractC9973s implements Function1<MediaPlayer.Event, Unit> {
    final /* synthetic */ Function1<MediaPlayer.Event, Unit> $onStateChanged;
    final /* synthetic */ AudioPlayerManager.AudioSource $source;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AudioPlayerManager$setupPlayer$1$1(AudioPlayerManager.AudioSource audioSource, Function1<? super MediaPlayer.Event, Unit> function1) {
        super(1);
        this.$source = audioSource;
        this.$onStateChanged = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(MediaPlayer.Event event) {
        invoke2(event);
        return Unit.f22042a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(MediaPlayer.Event event) {
        MediaPlayer.Event event2;
        Map map;
        C9971q.m14633g(event, "event");
        if (C9971q.m14638b(event, MediaPlayer.Event.PlaybackEnded.INSTANCE)) {
            map = AudioPlayerManager.currentProgressMap;
            map.remove(this.$source);
            AudioPlayerManager.INSTANCE.abandonAudioFocus();
        } else {
            AudioPlayerManager.INSTANCE.storeDuration(this.$source);
        }
        event2 = AudioPlayerManager.mediaPlayerState;
        if (!C9971q.m14638b(event2, event)) {
            AudioPlayerManager.mediaPlayerState = event;
            this.$onStateChanged.invoke(event);
        }
    }
}
