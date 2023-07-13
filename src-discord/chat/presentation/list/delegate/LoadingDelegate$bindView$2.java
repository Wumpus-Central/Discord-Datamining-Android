package com.discord.chat.presentation.list.delegate;

import com.discord.chat.presentation.events.ChatEventHandler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.n;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)

 class LoadingDelegate$bindView$2 extends n implements Function0<Unit> {
    
    public LoadingDelegate$bindView$2(Object obj) {
        super(0, obj, ChatEventHandler.class, "onTapLoadMessagesAfter", "onTapLoadMessagesAfter()V", 0);
    }

    @Override 
    
    public final void invoke2() {
        ((ChatEventHandler) this.receiver).onTapLoadMessagesAfter();
    }
}
