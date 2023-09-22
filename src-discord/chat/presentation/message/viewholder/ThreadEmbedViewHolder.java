package com.discord.chat.presentation.message.viewholder;

import android.view.View;
import com.discord.chat.presentation.message.messagepart.ThreadEmbedMessageAccessory;
import com.discord.chat.presentation.message.view.ThreadEmbedView;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J%\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nø\u0001\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/discord/chat/presentation/message/viewholder/ThreadEmbedViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "threadEmbedView", "Lcom/discord/chat/presentation/message/view/ThreadEmbedView;", "(Lcom/discord/chat/presentation/message/view/ThreadEmbedView;)V", "bind", "", "threadItem", "Lcom/discord/chat/presentation/message/messagepart/ThreadEmbedMessageAccessory;", "onTapThreadEmbed", "Lkotlin/Function1;", "Lcom/discord/primitives/MessageId;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class ThreadEmbedViewHolder extends MessagePartViewHolder {
    private final ThreadEmbedView threadEmbedView;

    
    public ThreadEmbedViewHolder(ThreadEmbedView threadEmbedView) {
        super(threadEmbedView, null);
        q.h(threadEmbedView, "threadEmbedView");
        this.threadEmbedView = threadEmbedView;
    }

    
    public static final void bind$lambda$1$lambda$0(Function1 onTapThreadEmbed, ThreadEmbedMessageAccessory threadItem, View view) {
        q.h(onTapThreadEmbed, "$onTapThreadEmbed");
        q.h(threadItem, "$threadItem");
        onTapThreadEmbed.invoke(MessageId.m636boximpl(threadItem.mo236getMessageId3Eiw7ao()));
    }

    
    
    
    
    public final void bind(final com.discord.chat.presentation.message.messagepart.ThreadEmbedMessageAccessory r35, final kotlin.jvm.functions.Function1<? super com.discord.primitives.MessageId, kotlin.Unit> r36) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.presentation.message.viewholder.ThreadEmbedViewHolder.bind(com.discord.chat.presentation.message.messagepart.ThreadEmbedMessageAccessory, kotlin.jvm.functions.Function1):void");
    }
}
