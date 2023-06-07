package com.discord.chat.presentation.message.viewholder;

import android.content.Context;
import com.discord.chat.bridge.Message;
import com.discord.chat.bridge.attachment.Attachment;
import com.discord.chat.bridge.embed.Embed;
import com.discord.chat.bridge.sticker.Sticker;
import com.discord.primitives.MessageFlag;
import com.discord.primitives.MessageFlagKt;
import com.discord.react_strings.I18nMessage;
import com.discord.react_strings.I18nUtilsKt;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002¨\u0006\u0006"}, d2 = {"getContentlessPreviewText", "", "context", "Landroid/content/Context;", "message", "Lcom/discord/chat/bridge/Message;", "chat_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ThreadEmbedViewHolderKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence getContentlessPreviewText(Context context, Message message) {
        int i10;
        int i11;
        List<Sticker> stickers = message.getStickers();
        int i12 = 0;
        if (stickers != null) {
            i10 = stickers.size();
        } else {
            i10 = 0;
        }
        if (i10 > 0) {
            return I18nUtilsKt.i18nFormat$default(context, I18nMessage.REPLY_QUOTE_STICKER_MOBILE, null, 2, null);
        }
        if (MessageFlagKt.hasMessageFlag(Long.valueOf(message.getFlags()), MessageFlag.IS_VOICE_MESSAGE)) {
            return I18nUtilsKt.i18nFormat$default(context, I18nMessage.REPLY_QUOTE_VOICE_MESSAGE_MOBILE, null, 2, null);
        }
        List<Attachment> attachments = message.getAttachments();
        if (attachments != null) {
            i11 = attachments.size();
        } else {
            i11 = 0;
        }
        List<Embed> embeds = message.getEmbeds();
        if (embeds != null) {
            i12 = embeds.size();
        }
        if (i11 > 0 || i12 > 0) {
            return I18nUtilsKt.i18nFormat$default(context, I18nMessage.REPLY_QUOTE_NO_TEXT_CONTENT_MOBILE, null, 2, null);
        }
        return null;
    }
}
