package com.discord.chat.presentation.message.viewholder;

import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.message.messagepart.EphemeralIndicationMessageAccessory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;


@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

public final class EphemeralIndicationViewHolder$bind$1$2 extends s implements Function1<String, Unit> {
    final  EphemeralIndicationMessageAccessory $ephemeralAccessory;
    final  EphemeralIndicationViewHolder this$0;

    
    
    public EphemeralIndicationViewHolder$bind$1$2(EphemeralIndicationViewHolder ephemeralIndicationViewHolder, EphemeralIndicationMessageAccessory ephemeralIndicationMessageAccessory) {
        super(1);
        this.this$0 = ephemeralIndicationViewHolder;
        this.$ephemeralAccessory = ephemeralIndicationMessageAccessory;
    }

    @Override 
    public   Unit invoke(String str) {
        invoke2(str);
        return Unit.f21036a;
    }

    
    public final void invoke2(String it) {
        ChatEventHandler chatEventHandler;
        q.h(it, "it");
        chatEventHandler = this.this$0.eventHandler;
        ChatEventHandler.DefaultImpls.m186onLinkClickedu7_MRrM$default(chatEventHandler, this.$ephemeralAccessory.mo220getMessageId3Eiw7ao(), it, null, 4, null);
    }
}
