package com.discord.chat.presentation.message.viewholder;

import com.discord.chat.presentation.events.ChatEventHandler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)

 class EmbedViewHolder$bind$5 extends n implements Function1<CharSequence, Unit> {
    
    public EmbedViewHolder$bind$5(Object obj) {
        super(1, obj, ChatEventHandler.class, "onTapCopyText", "onTapCopyText(Ljava/lang/CharSequence;)V", 0);
    }

    @Override 
    public   Unit invoke(CharSequence charSequence) {
        invoke2(charSequence);
        return Unit.f21213a;
    }

    
    public final void invoke2(CharSequence p02) {
        q.h(p02, "p0");
        ((ChatEventHandler) this.receiver).onTapCopyText(p02);
    }
}
