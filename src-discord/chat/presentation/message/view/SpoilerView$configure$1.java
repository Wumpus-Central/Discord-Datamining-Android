package com.discord.chat.presentation.message.view;

import com.discord.chat.bridge.spoiler.SpoilerConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.n;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)

 class SpoilerView$configure$1 extends n implements Function0<Unit> {
    
    public SpoilerView$configure$1(Object obj) {
        super(0, obj, SpoilerConfig.class, "onReveal", "onReveal()V", 0);
    }

    @Override 
    
    public final void invoke2() {
        ((SpoilerConfig) this.receiver).onReveal();
    }
}
