package com.discord.chat.presentation.message.system;

import com.discord.chat.presentation.events.ChatEventHandler;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9679s;

@Metadata(m15074d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m15073d2 = {"<anonymous>", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "invoke"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
final class SystemMessageWrapperView$setMessage$eventHandlerProvider$1 extends AbstractC9679s implements Function0<ChatEventHandler> {
    final /* synthetic */ ChatEventHandler $eventHandler;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SystemMessageWrapperView$setMessage$eventHandlerProvider$1(ChatEventHandler chatEventHandler) {
        super(0);
        this.$eventHandler = chatEventHandler;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ChatEventHandler invoke() {
        return this.$eventHandler;
    }
}
