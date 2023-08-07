package com.discord.chat.presentation.message.decorations;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/discord/chat/presentation/message/decorations/BackgroundHighlightDecoration;", "Lcom/discord/chat/presentation/message/decorations/HighlightedMessageDecoration;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class BackgroundHighlightDecoration extends HighlightedMessageDecoration {
    
    public BackgroundHighlightDecoration(Context context) {
        super(new BackgroundHighlightDrawer(context));
        q.h(context, "context");
    }
}
