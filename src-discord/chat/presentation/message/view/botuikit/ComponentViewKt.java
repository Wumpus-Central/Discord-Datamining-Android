package com.discord.chat.presentation.message.view.botuikit;

import android.content.Context;
import com.discord.chat.bridge.botuikit.ComponentEmoji;
import com.discord.emoji.RenderableEmoji;
import com.discord.emoji.RenderableEmojiKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0014\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¨\u0006\u0007"}, d2 = {"renderable", "Lcom/discord/emoji/RenderableEmoji;", "Lcom/discord/chat/bridge/botuikit/ComponentEmoji;", "setEmojiOrHide", "", "Lcom/facebook/drawee/span/SimpleDraweeSpanTextView;", "componentEmoji", "chat_release"}, k = 2, mv = {1, 8, 0}, xi = 48)

public final class ComponentViewKt {
    
    
    public static final com.discord.emoji.RenderableEmoji renderable(com.discord.chat.bridge.botuikit.ComponentEmoji r5) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.presentation.message.view.botuikit.ComponentViewKt.renderable(com.discord.chat.bridge.botuikit.ComponentEmoji):com.discord.emoji.RenderableEmoji");
    }

    public static final void setEmojiOrHide(SimpleDraweeSpanTextView simpleDraweeSpanTextView, ComponentEmoji componentEmoji) {
        q.g(simpleDraweeSpanTextView, "<this>");
        if (componentEmoji == null) {
            simpleDraweeSpanTextView.setVisibility(8);
            return;
        }
        simpleDraweeSpanTextView.setVisibility(0);
        RenderableEmoji renderable = renderable(componentEmoji);
        Context context = simpleDraweeSpanTextView.getContext();
        q.f(context, "context");
        simpleDraweeSpanTextView.setDraweeSpanStringBuilder(RenderableEmojiKt.renderEmoji$default(renderable, context, SizeUtilsKt.getDpToPx(20), componentEmoji.getAnimated(), 1, null, 32, null));
    }
}
