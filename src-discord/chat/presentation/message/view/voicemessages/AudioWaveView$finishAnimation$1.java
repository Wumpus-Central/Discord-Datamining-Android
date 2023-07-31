package com.discord.chat.presentation.message.view.voicemessages;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;


@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@e(c = "com.discord.chat.presentation.message.view.voicemessages.AudioWaveView$finishAnimation$1", f = "AudioWaveView.kt", l = {135}, m = "invokeSuspend")

public final class AudioWaveView$finishAnimation$1 extends k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int I$0;
    int I$1;
    private  Object L$0;
    Object L$1;
    int label;
    final  AudioWaveView this$0;

    
    
    public AudioWaveView$finishAnimation$1(AudioWaveView audioWaveView, Continuation<? super AudioWaveView$finishAnimation$1> continuation) {
        super(2, continuation);
        this.this$0 = audioWaveView;
    }

    @Override 
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AudioWaveView$finishAnimation$1 audioWaveView$finishAnimation$1 = new AudioWaveView$finishAnimation$1(this.this$0, continuation);
        audioWaveView$finishAnimation$1.L$0 = obj;
        return audioWaveView$finishAnimation$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AudioWaveView$finishAnimation$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f20679a);
    }

    
    
    
    
    @Override 
    
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.presentation.message.view.voicemessages.AudioWaveView$finishAnimation$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
