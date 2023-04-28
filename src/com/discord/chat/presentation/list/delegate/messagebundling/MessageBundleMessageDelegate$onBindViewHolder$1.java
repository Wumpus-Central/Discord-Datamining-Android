package com.discord.chat.presentation.list.delegate.messagebundling;

import com.discord.chat.presentation.list.item.MessageBundleItem;
import com.discord.chat.presentation.message.MessageView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9679s;

@Metadata(m15074d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m15073d2 = {"<anonymous>", "Lcom/discord/chat/presentation/message/MessageView$ChainPart;", "invoke"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
final class MessageBundleMessageDelegate$onBindViewHolder$1 extends AbstractC9679s implements Function0<MessageView.ChainPart> {
    final /* synthetic */ List<MessageBundleItem> $items;
    final /* synthetic */ int $position;
    final /* synthetic */ MessageBundleMessageDelegate this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MessageBundleMessageDelegate$onBindViewHolder$1(MessageBundleMessageDelegate messageBundleMessageDelegate, List<? extends MessageBundleItem> list, int i) {
        super(0);
        this.this$0 = messageBundleMessageDelegate;
        this.$items = list;
        this.$position = i;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final MessageView.ChainPart invoke() {
        MessageView.ChainPart chainPart;
        chainPart = this.this$0.getChainPart(this.$items, this.$position);
        return chainPart;
    }
}
