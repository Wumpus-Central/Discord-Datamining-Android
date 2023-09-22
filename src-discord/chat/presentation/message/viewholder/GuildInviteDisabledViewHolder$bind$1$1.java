package com.discord.chat.presentation.message.viewholder;

import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.message.messagepart.GuildInviteDisabledMessageAccessory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;


@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

public final class GuildInviteDisabledViewHolder$bind$1$1 extends s implements Function1<String, Unit> {
    final  GuildInviteDisabledMessageAccessory $inviteAccessory;
    final  GuildInviteDisabledViewHolder this$0;

    
    
    public GuildInviteDisabledViewHolder$bind$1$1(GuildInviteDisabledViewHolder guildInviteDisabledViewHolder, GuildInviteDisabledMessageAccessory guildInviteDisabledMessageAccessory) {
        super(1);
        this.this$0 = guildInviteDisabledViewHolder;
        this.$inviteAccessory = guildInviteDisabledMessageAccessory;
    }

    @Override 
    public   Unit invoke(String str) {
        invoke2(str);
        return Unit.f21600a;
    }

    
    public final void invoke2(String it) {
        q.h(it, "it");
        ChatEventHandler.DefaultImpls.m199onLinkClickedu7_MRrM$default(this.this$0.getEventHandler(), this.$inviteAccessory.mo236getMessageId3Eiw7ao(), it, null, 4, null);
    }
}
