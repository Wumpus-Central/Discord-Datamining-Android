package com.discord.chat.presentation.list.messagebundling;

import com.discord.chat.bridge.Message;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.reactions.ReactionView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m15073d2 = {"<anonymous>", "", "it", "Lcom/discord/reactions/ReactionView$Reaction;", "invoke"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class MessageBundleConversationView$configure$3$3 extends AbstractC9973s implements Function1<ReactionView.Reaction, Unit> {
    final /* synthetic */ ChatEventHandler $eventHandler;
    final /* synthetic */ Message $message;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageBundleConversationView$configure$3$3(ChatEventHandler chatEventHandler, Message message) {
        super(1);
        this.$eventHandler = chatEventHandler;
        this.$message = message;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ReactionView.Reaction reaction) {
        invoke2(reaction);
        return Unit.f22042a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ReactionView.Reaction it) {
        C9971q.m14633g(it, "it");
        ChatEventHandler.DefaultImpls.m41737onTapReactionu7_MRrM$default(this.$eventHandler, this.$message.m41579getId3Eiw7ao(), it, null, 4, null);
    }
}
