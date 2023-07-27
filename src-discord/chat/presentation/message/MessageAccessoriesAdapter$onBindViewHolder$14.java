package com.discord.chat.presentation.message;

import com.discord.chat.bridge.contentnode.EmojiContentNode;
import com.discord.chat.presentation.events.ChatEventHandler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;


@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)

public  class MessageAccessoriesAdapter$onBindViewHolder$14 extends n implements Function1<EmojiContentNode, Unit> {
    
    public MessageAccessoriesAdapter$onBindViewHolder$14(Object obj) {
        super(1, obj, ChatEventHandler.class, "onTapEmoji", "onTapEmoji(Lcom/discord/chat/bridge/contentnode/EmojiContentNode;)V", 0);
    }

    @Override 
    public   Unit invoke(EmojiContentNode emojiContentNode) {
        invoke2(emojiContentNode);
        return Unit.f20666a;
    }

    
    public final void invoke2(EmojiContentNode p02) {
        q.g(p02, "p0");
        ((ChatEventHandler) this.receiver).onTapEmoji(p02);
    }
}
