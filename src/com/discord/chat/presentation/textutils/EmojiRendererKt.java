package com.discord.chat.presentation.textutils;

import com.discord.chat.bridge.contentnode.CustomEmojiContentNode;
import com.discord.chat.bridge.contentnode.EmojiContentNode;
import com.discord.chat.bridge.contentnode.UnicodeEmojiContentNode;
import com.discord.emoji.RenderableEmoji;
import com.discord.emoji.RenderableEmojiKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.react.FontManager;
import com.discord.span.utilities.spannable.ClickableSpan;
import com.discord.span.utilities.spannable.EmojiAccessibilitySpan;
import com.facebook.drawee.span.DraweeSpanStringBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import nf.C11088q;
import p326ri.C12718u;

@Metadata(m15074d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u001a\n\u0010\b\u001a\u00020\t*\u00020\u0005¨\u0006\n"}, m15073d2 = {"renderEmoji", "", "builder", "Lcom/facebook/drawee/span/DraweeSpanStringBuilder;", "emoji", "Lcom/discord/chat/bridge/contentnode/EmojiContentNode;", "rc", "Lcom/discord/chat/presentation/textutils/RenderContext;", "renderable", "Lcom/discord/emoji/RenderableEmoji;", "chat_release"}, m15072k = 2, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class EmojiRendererKt {
    public static final void renderEmoji(DraweeSpanStringBuilder builder, EmojiContentNode emoji, RenderContext rc) {
        int i;
        int i2;
        C9971q.m14633g(builder, "builder");
        C9971q.m14633g(emoji, "emoji");
        C9971q.m14633g(rc, "rc");
        boolean jumboable = emoji.getJumboable();
        Integer emojiSizeOverride = rc.getEmojiSizeOverride();
        if (emojiSizeOverride != null) {
            i = emojiSizeOverride.intValue();
        } else if (jumboable) {
            i = SizeUtilsKt.getDpToPx(48);
        } else {
            i = (int) (SizeUtilsKt.getDpToPx(20) * FontManager.INSTANCE.getFontScale(rc.getContext()));
        }
        if (jumboable) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        RenderableEmoji renderable = renderable(emoji);
        Object[] objArr = {new EmojiAccessibilitySpan(renderable.getContentDescription()), new ClickableSpan(null, null, null, new EmojiRendererKt$renderEmoji$clickableSpan$1(rc, emoji), 7, null)};
        int length = builder.length();
        RenderableEmojiKt.renderEmojiInto(builder, renderable, rc.getContext(), i, rc.getAnimateEmoji(), i2, new EmojiRendererKt$renderEmoji$1$1(rc));
        for (int i3 = 0; i3 < 2; i3++) {
            Object obj = objArr[i3];
            if (obj != null) {
                builder.setSpan(obj, length, builder.length(), 33);
            }
        }
    }

    public static final RenderableEmoji renderable(EmojiContentNode emojiContentNode) {
        boolean w;
        C9971q.m14633g(emojiContentNode, "<this>");
        if (emojiContentNode instanceof CustomEmojiContentNode) {
            RenderableEmoji.Companion companion = RenderableEmoji.Companion;
            CustomEmojiContentNode customEmojiContentNode = (CustomEmojiContentNode) emojiContentNode;
            long id2 = customEmojiContentNode.getId();
            w = C12718u.m5729w(customEmojiContentNode.getSrc());
            boolean z = true;
            if (!(!w) || C9971q.m14638b(customEmojiContentNode.getSrc(), customEmojiContentNode.getFrozenSrc())) {
                z = false;
            }
            return companion.customWithEmojiId(id2, z, customEmojiContentNode.getAlt());
        } else if (emojiContentNode instanceof UnicodeEmojiContentNode) {
            return RenderableEmoji.Companion.unicode(((UnicodeEmojiContentNode) emojiContentNode).getSurrogate());
        } else {
            throw new C11088q();
        }
    }
}
