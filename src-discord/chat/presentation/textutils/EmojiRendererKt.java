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
import ji.u;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u001a\n\u0010\b\u001a\u00020\t*\u00020\u0005¨\u0006\n"}, d2 = {"renderEmoji", "", "builder", "Lcom/facebook/drawee/span/DraweeSpanStringBuilder;", "emoji", "Lcom/discord/chat/bridge/contentnode/EmojiContentNode;", "rc", "Lcom/discord/chat/presentation/textutils/RenderContext;", "renderable", "Lcom/discord/emoji/RenderableEmoji;", "chat_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EmojiRendererKt {
    public static final void renderEmoji(DraweeSpanStringBuilder builder, EmojiContentNode emoji, RenderContext rc2) {
        int i10;
        int i11;
        q.g(builder, "builder");
        q.g(emoji, "emoji");
        q.g(rc2, "rc");
        boolean jumboable = emoji.getJumboable();
        Integer emojiSizeOverride = rc2.getEmojiSizeOverride();
        if (emojiSizeOverride != null) {
            i10 = emojiSizeOverride.intValue();
        } else if (jumboable) {
            i10 = SizeUtilsKt.getDpToPx(48);
        } else {
            i10 = (int) (SizeUtilsKt.getDpToPx(20) * FontManager.INSTANCE.getFontScale(rc2.getContext()));
        }
        if (jumboable) {
            i11 = 1;
        } else {
            i11 = 2;
        }
        RenderableEmoji renderable = renderable(emoji);
        Object[] objArr = {new EmojiAccessibilitySpan(renderable.getContentDescription()), new ClickableSpan(null, null, null, new EmojiRendererKt$renderEmoji$clickableSpan$1(rc2, emoji), 7, null)};
        int length = builder.length();
        RenderableEmojiKt.renderEmojiInto(builder, renderable, rc2.getContext(), i10, rc2.getAnimateEmoji(), i11, new EmojiRendererKt$renderEmoji$1$1(rc2));
        for (int i12 = 0; i12 < 2; i12++) {
            Object obj = objArr[i12];
            if (obj != null) {
                builder.setSpan(obj, length, builder.length(), 33);
            }
        }
    }

    public static final RenderableEmoji renderable(EmojiContentNode emojiContentNode) {
        boolean w10;
        q.g(emojiContentNode, "<this>");
        if (emojiContentNode instanceof CustomEmojiContentNode) {
            RenderableEmoji.Companion companion = RenderableEmoji.Companion;
            CustomEmojiContentNode customEmojiContentNode = (CustomEmojiContentNode) emojiContentNode;
            long id2 = customEmojiContentNode.getId();
            w10 = u.w(customEmojiContentNode.getSrc());
            boolean z10 = true;
            if (!(!w10) || q.b(customEmojiContentNode.getSrc(), customEmojiContentNode.getFrozenSrc())) {
                z10 = false;
            }
            return companion.customWithEmojiId(id2, z10, customEmojiContentNode.getAlt());
        } else if (emojiContentNode instanceof UnicodeEmojiContentNode) {
            return RenderableEmoji.Companion.unicode(((UnicodeEmojiContentNode) emojiContentNode).getSurrogate());
        } else {
            throw new ff.q();
        }
    }
}
