package com.discord.chat.presentation.message.viewholder;

import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.message.messagepart.GuildInviteDisabledMessageAccessory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GuildInviteDisabledViewHolder$bind$1$1 extends s implements Function1<String, Unit> {
    final /* synthetic */ GuildInviteDisabledMessageAccessory $inviteAccessory;
    final /* synthetic */ GuildInviteDisabledViewHolder this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuildInviteDisabledViewHolder$bind$1$1(GuildInviteDisabledViewHolder guildInviteDisabledViewHolder, GuildInviteDisabledMessageAccessory guildInviteDisabledMessageAccessory) {
        super(1);
        this.this$0 = guildInviteDisabledViewHolder;
        this.$inviteAccessory = guildInviteDisabledMessageAccessory;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.f20663a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String it) {
        q.g(it, "it");
        ChatEventHandler.DefaultImpls.m183onLinkClickedu7_MRrM$default(this.this$0.getEventHandler(), this.$inviteAccessory.mo215getMessageId3Eiw7ao(), it, null, 4, null);
    }
}
