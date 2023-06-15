package com.discord.chat.presentation.list.messagebundling;

import com.discord.chat.bridge.Message;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.reactions.ReactionView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/discord/reactions/ReactionView$Reaction;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MessageBundleConversationView$configure$3$3 extends s implements Function1<ReactionView.Reaction, Unit> {
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
        return Unit.f22104a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ReactionView.Reaction it) {
        q.g(it, "it");
        ChatEventHandler.DefaultImpls.m176onTapReactionu7_MRrM$default(this.$eventHandler, this.$message.m17getId3Eiw7ao(), it, null, 4, null);
    }
}
