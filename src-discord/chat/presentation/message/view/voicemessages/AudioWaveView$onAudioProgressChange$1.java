package com.discord.chat.presentation.message.view.voicemessages;

import com.discord.chat.presentation.message.view.voicemessages.AudioWaveView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;


@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/discord/chat/presentation/message/view/voicemessages/AudioWaveView$ProgressEvent;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

public final class AudioWaveView$onAudioProgressChange$1 extends s implements Function1<AudioWaveView.ProgressEvent, Unit> {
    public static final AudioWaveView$onAudioProgressChange$1 INSTANCE = new AudioWaveView$onAudioProgressChange$1();

    AudioWaveView$onAudioProgressChange$1() {
        super(1);
    }

    @Override 
    public   Unit invoke(AudioWaveView.ProgressEvent progressEvent) {
        invoke2(progressEvent);
        return Unit.f20666a;
    }

    
    public final void invoke2(AudioWaveView.ProgressEvent it) {
        q.g(it, "it");
    }
}
