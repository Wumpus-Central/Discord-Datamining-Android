package com.discord.chat.presentation.message.view.voicemessages;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

final class AudioPlayerView$animatorManager$2 extends s implements Function0<AudioPlayerWipeAnimatorManager> {
    final  Context $context;
    final  AudioPlayerView this$0;

    
    
    public AudioPlayerView$animatorManager$2(Context context, AudioPlayerView audioPlayerView) {
        super(0);
        this.$context = context;
        this.this$0 = audioPlayerView;
    }

    
    @Override 
    public final AudioPlayerWipeAnimatorManager invoke() {
        return new AudioPlayerWipeAnimatorManager(this.$context, this.this$0.getBinding());
    }
}
