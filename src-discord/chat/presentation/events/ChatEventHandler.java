package com.discord.chat.presentation.events;

import com.discord.chat.bridge.MediaType;
import com.discord.chat.bridge.botuikit.SelectComponent;
import com.discord.chat.bridge.contentnode.CommandMentionContentNode;
import com.discord.chat.bridge.contentnode.EmojiContentNode;
import com.discord.chat.bridge.contentnode.LinkContentNode;
import com.discord.chat.bridge.sticker.Sticker;
import com.discord.chat.presentation.list.ScrollState;
import com.discord.chat.reactevents.ViewResizeMode;
import com.discord.primitives.ChannelId;
import com.discord.primitives.MessageId;
import com.discord.reactions.ReactionView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\n\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0007\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0002Ï\u0001J%\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ1\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\nH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&J%\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u0013J\u0010\u0010 \u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001eH&J%\u0010%\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010$J%\u0010'\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010$J%\u0010)\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b(\u0010\u0013JA\u00103\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010+\u001a\u00020*2\b\u0010,\u001a\u0004\u0018\u00010\n2\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b1\u00102J%\u00105\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b4\u0010\u0013J$\u00107\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\n2\b\u00106\u001a\u0004\u0018\u00010\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\nH&J.\u00109\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\n2\b\u00106\u001a\u0004\u0018\u00010\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\n2\b\u00108\u001a\u0004\u0018\u00010\nH&J\u0010\u0010<\u001a\u00020\u00062\u0006\u0010;\u001a\u00020:H&J\u0010\u0010>\u001a\u00020\u00062\u0006\u0010=\u001a\u00020\nH&J\u0010\u0010?\u001a\u00020\u00062\u0006\u0010=\u001a\u00020\nH&Ji\u0010N\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010A\u001a\u00020@2\u0006\u0010B\u001a\u00020\n2\u0006\u0010C\u001a\u00020@2\u0006\u0010D\u001a\u00020@2\u0006\u0010E\u001a\u00020@2\u0006\u0010F\u001a\u00020@2\u0006\u0010H\u001a\u00020G2\b\u0010J\u001a\u0004\u0018\u00010I2\b\u0010K\u001a\u0004\u0018\u00010@H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bL\u0010MJ9\u0010U\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010O\u001a\u00020@2\b\u0010Q\u001a\u0004\u0018\u00010P2\b\u0010R\u001a\u0004\u0018\u00010PH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bS\u0010TJ\b\u0010V\u001a\u00020\u0006H&J\b\u0010W\u001a\u00020\u0006H&J\u0018\u0010X\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\nH&J\u0010\u0010Z\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020YH&J\u0010\u0010[\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020YH&J%\u0010_\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\\\u001a\u00020\u0002H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b]\u0010^J3\u0010c\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010`\u001a\u0004\u0018\u00010PH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\ba\u0010bJ-\u0010g\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010d\u001a\u00020\nH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\be\u0010fJ-\u0010i\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010d\u001a\u00020\nH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bh\u0010fJ\u0018\u0010l\u001a\u00020\u00062\u0006\u0010j\u001a\u00020\n2\u0006\u0010k\u001a\u00020\nH&J\b\u0010m\u001a\u00020\u0006H&J(\u0010o\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\n2\u0006\u00106\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010n\u001a\u00020\nH&J/\u0010t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010+\u001a\u00020*2\u0006\u0010q\u001a\u00020pH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\br\u0010sJ\u0010\u0010v\u001a\u00020\u00062\u0006\u0010u\u001a\u00020\nH&J\u001d\u0010y\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bw\u0010xJ\u001d\u0010{\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bz\u0010xJ\u0010\u0010}\u001a\u00020\u00062\u0006\u0010|\u001a\u00020\nH&J\u0019\u0010\u0080\u0001\u001a\u00020\u00062\u0006\u0010~\u001a\u00020\n2\u0006\u0010\u007f\u001a\u00020\nH&J'\u0010\u0082\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b\u0081\u0001\u0010\u0013J'\u0010\u0084\u0001\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b\u0083\u0001\u0010$J\u001f\u0010\u0086\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b\u0085\u0001\u0010xJ\u001f\u0010\u0088\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b\u0087\u0001\u0010xJ\u0013\u0010\u008b\u0001\u001a\u00020\u00062\b\u0010\u008a\u0001\u001a\u00030\u0089\u0001H&J'\u0010\u008d\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b\u008c\u0001\u0010\u0013J)\u0010\u0091\u0001\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0007\u00106\u001a\u00030\u008e\u0001H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J'\u0010\u0093\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b\u0092\u0001\u0010\u0013J'\u0010\u0095\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b\u0094\u0001\u0010\u0013J'\u0010\u0097\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b\u0096\u0001\u0010\u0013J\t\u0010\u0098\u0001\u001a\u00020\u0006H&J3\u0010\u009c\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\t\u0010\u0099\u0001\u001a\u0004\u0018\u00010\nH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J\u001f\u0010\u009e\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b\u009d\u0001\u0010xJ\u001f\u0010 \u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b\u009f\u0001\u0010xJ\u0012\u0010¢\u0001\u001a\u00020\u00062\u0007\u0010¡\u0001\u001a\u00020\nH&J'\u0010¤\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b£\u0001\u0010\u0013J=\u0010«\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010¦\u0001\u001a\u00030¥\u00012\b\u0010§\u0001\u001a\u00030¥\u00012\u0007\u0010¨\u0001\u001a\u00020\u0010H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b©\u0001\u0010ª\u0001JG\u0010°\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010¦\u0001\u001a\u00030¥\u00012\b\u0010¬\u0001\u001a\u00030¥\u00012\u0007\u0010¨\u0001\u001a\u00020\u00102\b\u0010\u00ad\u0001\u001a\u00030¥\u0001H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b®\u0001\u0010¯\u0001J+\u0010´\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\t\u0010±\u0001\u001a\u0004\u0018\u00010\nH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b²\u0001\u0010³\u0001J\u0012\u0010¶\u0001\u001a\u00020\u00062\u0007\u0010µ\u0001\u001a\u00020\nH&J\u0012\u0010·\u0001\u001a\u00020\u00062\u0007\u0010µ\u0001\u001a\u00020\nH&J(\u0010¹\u0001\u001a\u00020\u00062\u0006\u0010.\u001a\u00020-2\u0006\u0010\u0016\u001a\u00020\u0015H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b¸\u0001\u0010\u0090\u0001J;\u0010¾\u0001\u001a\u00020\u00062\u0007\u00106\u001a\u00030\u008e\u00012\u0007\u0010º\u0001\u001a\u00020\u00152\u0007\u0010»\u0001\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b¼\u0001\u0010½\u0001J\u001f\u0010À\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b¿\u0001\u0010xJ\u001b\u0010Ã\u0001\u001a\u00020\u00062\u0007\u0010Á\u0001\u001a\u00020@2\u0007\u0010Â\u0001\u001a\u00020@H&RG\u0010É\u0001\u001a/\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010@\u0012\u0007\u0012\u0005\u0018\u00010Å\u0001\u0012\u0004\u0012\u00020\u0006\u0018\u00010Ä\u0001j\u0005\u0018\u0001`Æ\u00018&X¦\u0004ø\u0001\u0001¢\u0006\b\u001a\u0006\bÇ\u0001\u0010È\u0001R6\u0010Î\u0001\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0006\u0018\u00010Ê\u0001j\u0005\u0018\u0001`Ë\u00018&X¦\u0004ø\u0001\u0001¢\u0006\b\u001a\u0006\bÌ\u0001\u0010Í\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006Ð\u0001"}, d2 = {"Lcom/discord/chat/presentation/events/ChatEventHandler;", "", "Lcom/discord/primitives/MessageId;", "messageId", "Lcom/discord/chat/bridge/contentnode/LinkContentNode;", "node", "", "onLinkClicked-ntcYbpo", "(Ljava/lang/String;Lcom/discord/chat/bridge/contentnode/LinkContentNode;)V", "onLinkClicked", "", "url", "title", "onLinkClicked-u7_MRrM", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "onLinkLongClicked", "Lcom/discord/primitives/UserId;", "userId", "onLongPressAvatar-x5gers8", "(Ljava/lang/String;J)V", "onLongPressAvatar", "Lcom/discord/primitives/ChannelId;", "channelId", "Lcom/discord/reactions/ReactionView$Reaction;", "reaction", "onLongPressReaction-Eqy5D80", "(Ljava/lang/String;JLcom/discord/reactions/ReactionView$Reaction;)V", "onLongPressReaction", "onLongPressUsername-x5gers8", "onLongPressUsername", "Lcom/discord/chat/presentation/list/ScrollState;", "scrollState", "onScrollStateChanged", "Lcom/discord/chat/bridge/sticker/Sticker;", "sticker", "onStickerClicked-Ayv7vGE", "(Lcom/discord/chat/bridge/sticker/Sticker;Ljava/lang/String;)V", "onStickerClicked", "onStickerLongClicked-Ayv7vGE", "onStickerLongClicked", "onTapAvatar-x5gers8", "onTapAvatar", "", "messageFlags", "customId", "Lcom/discord/primitives/ApplicationId;", "applicationId", "", "indices", "onTapButtonActionComponent-NkFJqEg", "(Ljava/lang/String;JLjava/lang/String;J[I)V", "onTapButtonActionComponent", "onTapCall-pfaIj0E", "onTapCall", "guildId", "onTapChannel", "originalLink", "onLongPressChannel", "", "text", "onTapCopyText", "giftCode", "onTapGiftCodeAccept", "onTapGiftCodeEmbed", "", "attachmentIndex", "type", "viewWidth", "viewHeight", "viewX", "viewY", "Lcom/discord/chat/reactevents/ViewResizeMode;", "viewResizeMode", "", "portal", "embedIndex", "onTapImage-a6FnO-k", "(Ljava/lang/String;ILjava/lang/String;IIIILcom/discord/chat/reactevents/ViewResizeMode;Ljava/lang/Double;Ljava/lang/Integer;)V", "onTapImage", "index", "", "primary", "secondary", "onTapInviteEmbed-AFFcxXc", "(Ljava/lang/String;ILjava/lang/Boolean;Ljava/lang/Boolean;)V", "onTapInviteEmbed", "onTapLoadMessagesAfter", "onTapLoadMessagesBefore", "onTapMention", "Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;", "onTapCommand", "onLongPressCommand", "originId", "onTapMessageReply-0eiqbug", "(JLjava/lang/String;)V", "onTapMessageReply", "isBurst", "onTapReaction-u7_MRrM", "(Ljava/lang/String;Lcom/discord/reactions/ReactionView$Reaction;Ljava/lang/Boolean;)V", "onTapReaction", "summaryId", "onTapSummary-sekaTiM", "(JLjava/lang/String;Ljava/lang/String;)V", "onTapSummary", "onTapSummaryJump-sekaTiM", "onTapSummaryJump", "roleName", "roleIconSource", "onTapRoleIcon", "onTapSuppressNotificationsIcon", "roleId", "onTapConnectionsRoleTag", "Lcom/discord/chat/bridge/botuikit/SelectComponent;", "selectComponent", "onTapSelectActionComponent-u7_MRrM", "(Ljava/lang/String;JLcom/discord/chat/bridge/botuikit/SelectComponent;)V", "onTapSelectActionComponent", "timestamp", "onTapTimestamp", "onTapThreadEmbed-1xi1bu0", "(Ljava/lang/String;)V", "onTapThreadEmbed", "onTapToggleBlockedMessages-1xi1bu0", "onTapToggleBlockedMessages", "fileId", "onTapUploadProgressClose", "uploaderId", "itemId", "onTapCancelUploadItem", "onTapUsername-x5gers8", "onTapUsername", "onWelcomeReplyClicked-Ayv7vGE", "onWelcomeReplyClicked", "onTapInviteToSpeak-1xi1bu0", "onTapInviteToSpeak", "onTapJoinActivity-1xi1bu0", "onTapJoinActivity", "Lcom/discord/chat/bridge/contentnode/EmojiContentNode;", "emoji", "onTapEmoji", "onTapFollowForumPost-pfaIj0E", "onTapFollowForumPost", "Lcom/discord/primitives/GuildId;", "onTapShareForumPost-mgk6anA", "(JJ)V", "onTapShareForumPost", "onTapReactionOverflow-pfaIj0E", "onTapReactionOverflow", "onTapAutoModerationActions-pfaIj0E", "onTapAutoModerationActions", "onTapAutoModerationFeedback-pfaIj0E", "onTapAutoModerationFeedback", "onTapOpTag", "tagType", "onTapTag-Eqy5D80", "(Ljava/lang/String;JLjava/lang/String;)V", "onTapTag", "onTapRemix-1xi1bu0", "onTapRemix", "onTapSeeMore-1xi1bu0", "onTapSeeMore", "description", "onTapShowAltText", "onInitiateReply-pfaIj0E", "onInitiateReply", "", "totalDurationSecs", "startDurationSecs", "senderUserId", "voiceMessagePlaybackStarted-OuNwOLg", "(Ljava/lang/String;FFJ)V", "voiceMessagePlaybackStarted", "endDurationSecs", "durationListeningSecs", "voiceMessagePlaybackEnded-HuwN0RY", "(Ljava/lang/String;FFJF)V", "voiceMessagePlaybackEnded", "errorMessage", "voiceMessagePlaybackFailed-ntcYbpo", "(Ljava/lang/String;Ljava/lang/String;)V", "voiceMessagePlaybackFailed", "embeddedActivityKey", "onTapJoinEmbeddedActivity", "onTapDismissEmbeddedActivity", "onTapActivityBookmarkEmbed-uU1mFKc", "onTapActivityBookmarkEmbed", "parentChannelId", "threadId", "onTapPostPreviewEmbed-kUTrp-s", "(JJJLjava/lang/String;)V", "onTapPostPreviewEmbed", "onTapDismissMediaPostSharePrompt-1xi1bu0", "onTapDismissMediaPostSharePrompt", "firstVisibleMessageIndex", "lastVisibleMessageIndex", "onFirstLayout", "Lkotlin/Function4;", "Lcom/discord/chat/bridge/MediaType;", "Lcom/discord/chat/presentation/events/MessageLongPress;", "getOnMessageLongPressed", "()Lkotlin/jvm/functions/Function4;", "onMessageLongPressed", "Lkotlin/Function2;", "Lcom/discord/chat/presentation/events/MessageTapped;", "getOnMessageTapped", "()Lkotlin/jvm/functions/Function2;", "onMessageTapped", "Empty", "chat_release"}, k = 1, mv = {1, 8, 0})

public interface ChatEventHandler {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    
    public static final class DefaultImpls {
        
        public static  void m194onLinkClickedu7_MRrM$default(ChatEventHandler chatEventHandler, String str, String str2, String str3, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 4) != 0) {
                    str3 = null;
                }
                chatEventHandler.mo158onLinkClickedu7_MRrM(str, str2, str3);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onLinkClicked-u7_MRrM");
        }

        
        public static  void m195onTapButtonActionComponentNkFJqEg$default(ChatEventHandler chatEventHandler, String str, long j10, String str2, long j11, int[] iArr, int i10, Object obj) {
            if (obj == null) {
                chatEventHandler.mo168onTapButtonActionComponentNkFJqEg(str, (i10 & 2) != 0 ? 0L : j10, str2, j11, iArr);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onTapButtonActionComponent-NkFJqEg");
        }

        
        public static  void m196onTapReactionu7_MRrM$default(ChatEventHandler chatEventHandler, String str, ReactionView.Reaction reaction, Boolean bool, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 4) != 0) {
                    bool = Boolean.FALSE;
                }
                chatEventHandler.mo178onTapReactionu7_MRrM(str, reaction, bool);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onTapReaction-u7_MRrM");
        }

        
        public static  void m197onTapSelectActionComponentu7_MRrM$default(ChatEventHandler chatEventHandler, String str, long j10, SelectComponent selectComponent, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    j10 = 0;
                }
                chatEventHandler.mo182onTapSelectActionComponentu7_MRrM(str, j10, selectComponent);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onTapSelectActionComponent-u7_MRrM");
        }
    }

    @Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\r\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u0007\n\u0002\b\u000e\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016J%\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0017H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019J/\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J%\u0010 \u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\"H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010\u0014J.\u0010$\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u001b2\b\u0010%\u001a\u0004\u0018\u00010\u001b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u001b2\b\u0010&\u001a\u0004\u0018\u00010\u001bH\u0016J\u0010\u0010'\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020(H\u0016J/\u0010)\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010*\u001a\u0004\u0018\u00010+H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b,\u0010-J%\u0010.\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\"H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b/\u0010\u0014J\u0010\u00100\u001a\u00020\n2\u0006\u00101\u001a\u000202H\u0016J%\u00103\u001a\u00020\n2\u0006\u00104\u001a\u0002052\u0006\u0010\u000f\u001a\u00020\u0010H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b6\u00107J%\u00108\u001a\u00020\n2\u0006\u00104\u001a\u0002052\u0006\u0010\u000f\u001a\u00020\u0010H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b9\u00107J%\u0010:\u001a\u00020\n2\u0006\u0010;\u001a\u00020<2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b=\u0010>J%\u0010?\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b@\u0010\u0014J%\u0010A\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bB\u0010\u0014J%\u0010C\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\"H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bD\u0010\u0014J?\u0010E\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010F\u001a\u00020G2\b\u0010H\u001a\u0004\u0018\u00010\u001b2\u0006\u0010;\u001a\u00020<2\u0006\u0010I\u001a\u00020JH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bK\u0010LJ%\u0010M\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bN\u0010\u0014J\u0018\u0010O\u001a\u00020\n2\u0006\u0010P\u001a\u00020\u001b2\u0006\u0010Q\u001a\u00020\u001bH\u0016J$\u0010R\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u001b2\b\u0010%\u001a\u0004\u0018\u00010\u001b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u001bH\u0016J\u0010\u0010S\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020(H\u0016J(\u0010T\u001a\u00020\n2\u0006\u0010!\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\u001b2\u0006\u0010U\u001a\u00020\u001bH\u0016J\u0010\u0010V\u001a\u00020\n2\u0006\u0010W\u001a\u00020XH\u0016J\u0010\u0010Y\u001a\u00020\n2\u0006\u0010Z\u001a\u00020\u001bH\u0016J\u001d\u0010[\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\\\u0010]J\u0010\u0010^\u001a\u00020\n2\u0006\u0010_\u001a\u00020`H\u0016J%\u0010a\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bb\u0010\u0014J\u0010\u0010c\u001a\u00020\n2\u0006\u0010d\u001a\u00020\u001bH\u0016J\u0010\u0010e\u001a\u00020\n2\u0006\u0010d\u001a\u00020\u001bH\u0016Ji\u0010f\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010g\u001a\u00020\f2\u0006\u0010h\u001a\u00020\u001b2\u0006\u0010i\u001a\u00020\f2\u0006\u0010j\u001a\u00020\f2\u0006\u0010k\u001a\u00020\f2\u0006\u0010l\u001a\u00020\f2\u0006\u0010m\u001a\u00020n2\b\u0010o\u001a\u0004\u0018\u00010p2\b\u0010q\u001a\u0004\u0018\u00010\fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\br\u0010sJ9\u0010t\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010u\u001a\u00020\f2\b\u0010v\u001a\u0004\u0018\u00010w2\b\u0010x\u001a\u0004\u0018\u00010wH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\by\u0010zJ\u001d\u0010{\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b|\u0010]J\u001d\u0010}\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b~\u0010]J\u0010\u0010\u007f\u001a\u00020\n2\u0006\u0010Z\u001a\u00020\u001bH\u0016J\t\u0010\u0080\u0001\u001a\u00020\nH\u0016J\t\u0010\u0081\u0001\u001a\u00020\nH\u0016J\u0019\u0010\u0082\u0001\u001a\u00020\n2\u0006\u0010!\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\u001bH\u0016J)\u0010\u0083\u0001\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00122\u0007\u0010\u0084\u0001\u001a\u00020\u0010H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\t\u0010\u0087\u0001\u001a\u00020\nH\u0016J;\u0010\u0088\u0001\u001a\u00020\n2\u0007\u0010%\u001a\u00030\u0089\u00012\u0007\u0010\u008a\u0001\u001a\u00020\u00122\u0007\u0010\u008b\u0001\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0010H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J5\u0010\u008e\u0001\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010*\u001a\u0004\u0018\u00010+2\t\u0010\u008f\u0001\u001a\u0004\u0018\u00010wH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J'\u0010\u0092\u0001\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b\u0093\u0001\u0010\u0014J\u001f\u0010\u0094\u0001\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b\u0095\u0001\u0010]J\u001b\u0010\u0096\u0001\u001a\u00020\n2\u0007\u0010\u0097\u0001\u001a\u00020\u001b2\u0007\u0010\u0098\u0001\u001a\u00020\u001bH\u0016J\u001f\u0010\u0099\u0001\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b\u009a\u0001\u0010]J2\u0010\u009b\u0001\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010F\u001a\u00020G2\b\u0010\u009c\u0001\u001a\u00030\u009d\u0001H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J(\u0010 \u0001\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00122\u0007\u0010%\u001a\u00030\u0089\u0001H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b¡\u0001\u0010>J\u0012\u0010¢\u0001\u001a\u00020\n2\u0007\u0010£\u0001\u001a\u00020\u001bH\u0016J1\u0010¤\u0001\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00102\u0007\u0010¥\u0001\u001a\u00020\u001bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b¦\u0001\u0010§\u0001J1\u0010¨\u0001\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00102\u0007\u0010¥\u0001\u001a\u00020\u001bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b©\u0001\u0010§\u0001J\t\u0010ª\u0001\u001a\u00020\nH\u0016J3\u0010«\u0001\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\t\u0010¬\u0001\u001a\u0004\u0018\u00010\u001bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u00ad\u0001\u0010®\u0001J\u001f\u0010¯\u0001\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b°\u0001\u0010]J\u0012\u0010±\u0001\u001a\u00020\n2\u0007\u0010²\u0001\u001a\u00020\u001bH\u0016J\u001f\u0010³\u0001\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b´\u0001\u0010]J\u0012\u0010µ\u0001\u001a\u00020\n2\u0007\u0010¶\u0001\u001a\u00020\u001bH\u0016J'\u0010·\u0001\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\"H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b¸\u0001\u0010\u0014J'\u0010¹\u0001\u001a\u00020\n2\u0006\u00104\u001a\u0002052\u0006\u0010\u000f\u001a\u00020\u0010H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\bº\u0001\u00107JG\u0010»\u0001\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010¼\u0001\u001a\u00030½\u00012\b\u0010¾\u0001\u001a\u00030½\u00012\u0007\u0010¿\u0001\u001a\u00020\"2\b\u0010À\u0001\u001a\u00030½\u0001H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\bÁ\u0001\u0010Â\u0001J+\u0010Ã\u0001\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\t\u0010Ä\u0001\u001a\u0004\u0018\u00010\u001bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\bÅ\u0001\u0010Æ\u0001J=\u0010Ç\u0001\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010¼\u0001\u001a\u00030½\u00012\b\u0010È\u0001\u001a\u00030½\u00012\u0007\u0010¿\u0001\u001a\u00020\"H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\bÉ\u0001\u0010Ê\u0001R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006Ë\u0001"}, d2 = {"Lcom/discord/chat/presentation/events/ChatEventHandler$Empty;", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "()V", "onMessageLongPressed", "", "getOnMessageLongPressed", "()Ljava/lang/Void;", "onMessageTapped", "getOnMessageTapped", "onFirstLayout", "", "firstVisibleMessageIndex", "", "lastVisibleMessageIndex", "onInitiateReply", "messageId", "Lcom/discord/primitives/MessageId;", "channelId", "Lcom/discord/primitives/ChannelId;", "onInitiateReply-pfaIj0E", "(Ljava/lang/String;J)V", "onLinkClicked", "node", "Lcom/discord/chat/bridge/contentnode/LinkContentNode;", "onLinkClicked-ntcYbpo", "(Ljava/lang/String;Lcom/discord/chat/bridge/contentnode/LinkContentNode;)V", "url", "", "title", "onLinkClicked-u7_MRrM", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "onLinkLongClicked", "onLongPressAvatar", "userId", "Lcom/discord/primitives/UserId;", "onLongPressAvatar-x5gers8", "onLongPressChannel", "guildId", "originalLink", "onLongPressCommand", "Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;", "onLongPressReaction", "reaction", "Lcom/discord/reactions/ReactionView$Reaction;", "onLongPressReaction-Eqy5D80", "(Ljava/lang/String;JLcom/discord/reactions/ReactionView$Reaction;)V", "onLongPressUsername", "onLongPressUsername-x5gers8", "onScrollStateChanged", "scrollState", "Lcom/discord/chat/presentation/list/ScrollState;", "onStickerClicked", "sticker", "Lcom/discord/chat/bridge/sticker/Sticker;", "onStickerClicked-Ayv7vGE", "(Lcom/discord/chat/bridge/sticker/Sticker;Ljava/lang/String;)V", "onStickerLongClicked", "onStickerLongClicked-Ayv7vGE", "onTapActivityBookmarkEmbed", "applicationId", "Lcom/discord/primitives/ApplicationId;", "onTapActivityBookmarkEmbed-uU1mFKc", "(JJ)V", "onTapAutoModerationActions", "onTapAutoModerationActions-pfaIj0E", "onTapAutoModerationFeedback", "onTapAutoModerationFeedback-pfaIj0E", "onTapAvatar", "onTapAvatar-x5gers8", "onTapButtonActionComponent", "messageFlags", "", "customId", "indices", "", "onTapButtonActionComponent-NkFJqEg", "(Ljava/lang/String;JLjava/lang/String;J[I)V", "onTapCall", "onTapCall-pfaIj0E", "onTapCancelUploadItem", "uploaderId", "itemId", "onTapChannel", "onTapCommand", "onTapConnectionsRoleTag", "roleId", "onTapCopyText", "text", "", "onTapDismissEmbeddedActivity", "embeddedActivityKey", "onTapDismissMediaPostSharePrompt", "onTapDismissMediaPostSharePrompt-1xi1bu0", "(Ljava/lang/String;)V", "onTapEmoji", "emoji", "Lcom/discord/chat/bridge/contentnode/EmojiContentNode;", "onTapFollowForumPost", "onTapFollowForumPost-pfaIj0E", "onTapGiftCodeAccept", "giftCode", "onTapGiftCodeEmbed", "onTapImage", "attachmentIndex", "type", "viewWidth", "viewHeight", "viewX", "viewY", "viewResizeMode", "Lcom/discord/chat/reactevents/ViewResizeMode;", "portal", "", "embedIndex", "onTapImage-a6FnO-k", "(Ljava/lang/String;ILjava/lang/String;IIIILcom/discord/chat/reactevents/ViewResizeMode;Ljava/lang/Double;Ljava/lang/Integer;)V", "onTapInviteEmbed", "index", "primary", "", "secondary", "onTapInviteEmbed-AFFcxXc", "(Ljava/lang/String;ILjava/lang/Boolean;Ljava/lang/Boolean;)V", "onTapInviteToSpeak", "onTapInviteToSpeak-1xi1bu0", "onTapJoinActivity", "onTapJoinActivity-1xi1bu0", "onTapJoinEmbeddedActivity", "onTapLoadMessagesAfter", "onTapLoadMessagesBefore", "onTapMention", "onTapMessageReply", "originId", "onTapMessageReply-0eiqbug", "(JLjava/lang/String;)V", "onTapOpTag", "onTapPostPreviewEmbed", "Lcom/discord/primitives/GuildId;", "parentChannelId", "threadId", "onTapPostPreviewEmbed-kUTrp-s", "(JJJLjava/lang/String;)V", "onTapReaction", "isBurst", "onTapReaction-u7_MRrM", "(Ljava/lang/String;Lcom/discord/reactions/ReactionView$Reaction;Ljava/lang/Boolean;)V", "onTapReactionOverflow", "onTapReactionOverflow-pfaIj0E", "onTapRemix", "onTapRemix-1xi1bu0", "onTapRoleIcon", "roleName", "roleIconSource", "onTapSeeMore", "onTapSeeMore-1xi1bu0", "onTapSelectActionComponent", "selectComponent", "Lcom/discord/chat/bridge/botuikit/SelectComponent;", "onTapSelectActionComponent-u7_MRrM", "(Ljava/lang/String;JLcom/discord/chat/bridge/botuikit/SelectComponent;)V", "onTapShareForumPost", "onTapShareForumPost-mgk6anA", "onTapShowAltText", "description", "onTapSummary", "summaryId", "onTapSummary-sekaTiM", "(JLjava/lang/String;Ljava/lang/String;)V", "onTapSummaryJump", "onTapSummaryJump-sekaTiM", "onTapSuppressNotificationsIcon", "onTapTag", "tagType", "onTapTag-Eqy5D80", "(Ljava/lang/String;JLjava/lang/String;)V", "onTapThreadEmbed", "onTapThreadEmbed-1xi1bu0", "onTapTimestamp", "timestamp", "onTapToggleBlockedMessages", "onTapToggleBlockedMessages-1xi1bu0", "onTapUploadProgressClose", "fileId", "onTapUsername", "onTapUsername-x5gers8", "onWelcomeReplyClicked", "onWelcomeReplyClicked-Ayv7vGE", "voiceMessagePlaybackEnded", "totalDurationSecs", "", "endDurationSecs", "senderUserId", "durationListeningSecs", "voiceMessagePlaybackEnded-HuwN0RY", "(Ljava/lang/String;FFJF)V", "voiceMessagePlaybackFailed", "errorMessage", "voiceMessagePlaybackFailed-ntcYbpo", "(Ljava/lang/String;Ljava/lang/String;)V", "voiceMessagePlaybackStarted", "startDurationSecs", "voiceMessagePlaybackStarted-OuNwOLg", "(Ljava/lang/String;FFJ)V", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Empty implements ChatEventHandler {
        public static final Empty INSTANCE = new Empty();
        private static final Void onMessageLongPressed = null;
        private static final Void onMessageTapped = null;

        private Empty() {
        }

        @Override 
        public void onFirstLayout(int i10, int i11) {
        }

        @Override 
        
        public void mo156onInitiateReplypfaIj0E(String messageId, long j10) {
            q.h(messageId, "messageId");
        }

        @Override 
        
        public void mo157onLinkClickedntcYbpo(String messageId, LinkContentNode node) {
            q.h(messageId, "messageId");
            q.h(node, "node");
        }

        @Override 
        
        public void mo158onLinkClickedu7_MRrM(String messageId, String url, String str) {
            q.h(messageId, "messageId");
            q.h(url, "url");
        }

        @Override 
        public void onLinkLongClicked(LinkContentNode node) {
            q.h(node, "node");
        }

        @Override 
        
        public void mo159onLongPressAvatarx5gers8(String messageId, long j10) {
            q.h(messageId, "messageId");
        }

        @Override 
        public void onLongPressChannel(String channelId, String str, String str2, String str3) {
            q.h(channelId, "channelId");
        }

        @Override 
        public void onLongPressCommand(CommandMentionContentNode node) {
            q.h(node, "node");
        }

        @Override 
        
        public void mo160onLongPressReactionEqy5D80(String messageId, long j10, ReactionView.Reaction reaction) {
            q.h(messageId, "messageId");
        }

        @Override 
        
        public void mo161onLongPressUsernamex5gers8(String messageId, long j10) {
            q.h(messageId, "messageId");
        }

        @Override 
        public void onScrollStateChanged(ScrollState scrollState) {
            q.h(scrollState, "scrollState");
        }

        @Override 
        
        public void mo162onStickerClickedAyv7vGE(Sticker sticker, String messageId) {
            q.h(sticker, "sticker");
            q.h(messageId, "messageId");
        }

        @Override 
        
        public void mo163onStickerLongClickedAyv7vGE(Sticker sticker, String messageId) {
            q.h(sticker, "sticker");
            q.h(messageId, "messageId");
        }

        @Override 
        
        public void mo164onTapActivityBookmarkEmbeduU1mFKc(long j10, long j11) {
        }

        @Override 
        
        public void mo165onTapAutoModerationActionspfaIj0E(String messageId, long j10) {
            q.h(messageId, "messageId");
        }

        @Override 
        
        public void mo166onTapAutoModerationFeedbackpfaIj0E(String messageId, long j10) {
            q.h(messageId, "messageId");
        }

        @Override 
        
        public void mo167onTapAvatarx5gers8(String messageId, long j10) {
            q.h(messageId, "messageId");
        }

        @Override 
        
        public void mo168onTapButtonActionComponentNkFJqEg(String messageId, long j10, String str, long j11, int[] indices) {
            q.h(messageId, "messageId");
            q.h(indices, "indices");
        }

        @Override 
        
        public void mo169onTapCallpfaIj0E(String messageId, long j10) {
            q.h(messageId, "messageId");
        }

        @Override 
        public void onTapCancelUploadItem(String uploaderId, String itemId) {
            q.h(uploaderId, "uploaderId");
            q.h(itemId, "itemId");
        }

        @Override 
        public void onTapChannel(String channelId, String str, String str2) {
            q.h(channelId, "channelId");
        }

        @Override 
        public void onTapCommand(CommandMentionContentNode node) {
            q.h(node, "node");
        }

        @Override 
        public void onTapConnectionsRoleTag(String userId, String guildId, String channelId, String roleId) {
            q.h(userId, "userId");
            q.h(guildId, "guildId");
            q.h(channelId, "channelId");
            q.h(roleId, "roleId");
        }

        @Override 
        public void onTapCopyText(CharSequence text) {
            q.h(text, "text");
        }

        @Override 
        public void onTapDismissEmbeddedActivity(String embeddedActivityKey) {
            q.h(embeddedActivityKey, "embeddedActivityKey");
        }

        @Override 
        
        public void mo170onTapDismissMediaPostSharePrompt1xi1bu0(String messageId) {
            q.h(messageId, "messageId");
        }

        @Override 
        public void onTapEmoji(EmojiContentNode emoji) {
            q.h(emoji, "emoji");
        }

        @Override 
        
        public void mo171onTapFollowForumPostpfaIj0E(String messageId, long j10) {
            q.h(messageId, "messageId");
        }

        @Override 
        public void onTapGiftCodeAccept(String giftCode) {
            q.h(giftCode, "giftCode");
        }

        @Override 
        public void onTapGiftCodeEmbed(String giftCode) {
            q.h(giftCode, "giftCode");
        }

        @Override 
        
        public void mo172onTapImagea6FnOk(String messageId, int i10, String type, int i11, int i12, int i13, int i14, ViewResizeMode viewResizeMode, Double d10, Integer num) {
            q.h(messageId, "messageId");
            q.h(type, "type");
            q.h(viewResizeMode, "viewResizeMode");
        }

        @Override 
        
        public void mo173onTapInviteEmbedAFFcxXc(String messageId, int i10, Boolean bool, Boolean bool2) {
            q.h(messageId, "messageId");
        }

        @Override 
        
        public void mo174onTapInviteToSpeak1xi1bu0(String messageId) {
            q.h(messageId, "messageId");
        }

        @Override 
        
        public void mo175onTapJoinActivity1xi1bu0(String messageId) {
            q.h(messageId, "messageId");
        }

        @Override 
        public void onTapJoinEmbeddedActivity(String embeddedActivityKey) {
            q.h(embeddedActivityKey, "embeddedActivityKey");
        }

        @Override 
        public void onTapLoadMessagesAfter() {
        }

        @Override 
        public void onTapLoadMessagesBefore() {
        }

        @Override 
        public void onTapMention(String userId, String channelId) {
            q.h(userId, "userId");
            q.h(channelId, "channelId");
        }

        @Override 
        
        public void mo176onTapMessageReply0eiqbug(long j10, String originId) {
            q.h(originId, "originId");
        }

        @Override 
        public void onTapOpTag() {
        }

        @Override 
        
        public void mo177onTapPostPreviewEmbedkUTrps(long j10, long j11, long j12, String messageId) {
            q.h(messageId, "messageId");
        }

        @Override 
        
        public void mo178onTapReactionu7_MRrM(String messageId, ReactionView.Reaction reaction, Boolean bool) {
            q.h(messageId, "messageId");
        }

        @Override 
        
        public void mo179onTapReactionOverflowpfaIj0E(String messageId, long j10) {
            q.h(messageId, "messageId");
        }

        @Override 
        
        public void mo180onTapRemix1xi1bu0(String messageId) {
            q.h(messageId, "messageId");
        }

        @Override 
        public void onTapRoleIcon(String roleName, String roleIconSource) {
            q.h(roleName, "roleName");
            q.h(roleIconSource, "roleIconSource");
        }

        @Override 
        
        public void mo181onTapSeeMore1xi1bu0(String messageId) {
            q.h(messageId, "messageId");
        }

        @Override 
        
        public void mo182onTapSelectActionComponentu7_MRrM(String messageId, long j10, SelectComponent selectComponent) {
            q.h(messageId, "messageId");
            q.h(selectComponent, "selectComponent");
        }

        @Override 
        
        public void mo183onTapShareForumPostmgk6anA(long j10, long j11) {
        }

        @Override 
        public void onTapShowAltText(String description) {
            q.h(description, "description");
        }

        @Override 
        
        public void mo184onTapSummarysekaTiM(long j10, String messageId, String summaryId) {
            q.h(messageId, "messageId");
            q.h(summaryId, "summaryId");
        }

        @Override 
        
        public void mo185onTapSummaryJumpsekaTiM(long j10, String messageId, String summaryId) {
            q.h(messageId, "messageId");
            q.h(summaryId, "summaryId");
        }

        @Override 
        public void onTapSuppressNotificationsIcon() {
        }

        @Override 
        
        public void mo186onTapTagEqy5D80(String messageId, long j10, String str) {
            q.h(messageId, "messageId");
        }

        @Override 
        
        public void mo187onTapThreadEmbed1xi1bu0(String messageId) {
            q.h(messageId, "messageId");
        }

        @Override 
        public void onTapTimestamp(String timestamp) {
            q.h(timestamp, "timestamp");
        }

        @Override 
        
        public void mo188onTapToggleBlockedMessages1xi1bu0(String messageId) {
            q.h(messageId, "messageId");
        }

        @Override 
        public void onTapUploadProgressClose(String fileId) {
            q.h(fileId, "fileId");
        }

        @Override 
        
        public void mo189onTapUsernamex5gers8(String messageId, long j10) {
            q.h(messageId, "messageId");
        }

        @Override 
        
        public void mo190onWelcomeReplyClickedAyv7vGE(Sticker sticker, String messageId) {
            q.h(sticker, "sticker");
            q.h(messageId, "messageId");
        }

        @Override 
        
        public void mo191voiceMessagePlaybackEndedHuwN0RY(String messageId, float f10, float f11, long j10, float f12) {
            q.h(messageId, "messageId");
        }

        @Override 
        
        public void mo192voiceMessagePlaybackFailedntcYbpo(String messageId, String str) {
            q.h(messageId, "messageId");
        }

        @Override 
        
        public void mo193voiceMessagePlaybackStartedOuNwOLg(String messageId, float f10, float f11, long j10) {
            q.h(messageId, "messageId");
        }

        @Override 
        public Void getOnMessageLongPressed() {
            return onMessageLongPressed;
        }

        @Override 
        public Void getOnMessageTapped() {
            return onMessageTapped;
        }
    }

    Function4<MessageId, ChannelId, Integer, MediaType, Unit> getOnMessageLongPressed();

    Function2<MessageId, ChannelId, Unit> getOnMessageTapped();

    void onFirstLayout(int i10, int i11);

    
    void mo156onInitiateReplypfaIj0E(String str, long j10);

    
    void mo157onLinkClickedntcYbpo(String str, LinkContentNode linkContentNode);

    
    void mo158onLinkClickedu7_MRrM(String str, String str2, String str3);

    void onLinkLongClicked(LinkContentNode linkContentNode);

    
    void mo159onLongPressAvatarx5gers8(String str, long j10);

    void onLongPressChannel(String str, String str2, String str3, String str4);

    void onLongPressCommand(CommandMentionContentNode commandMentionContentNode);

    
    void mo160onLongPressReactionEqy5D80(String str, long j10, ReactionView.Reaction reaction);

    
    void mo161onLongPressUsernamex5gers8(String str, long j10);

    void onScrollStateChanged(ScrollState scrollState);

    
    void mo162onStickerClickedAyv7vGE(Sticker sticker, String str);

    
    void mo163onStickerLongClickedAyv7vGE(Sticker sticker, String str);

    
    void mo164onTapActivityBookmarkEmbeduU1mFKc(long j10, long j11);

    
    void mo165onTapAutoModerationActionspfaIj0E(String str, long j10);

    
    void mo166onTapAutoModerationFeedbackpfaIj0E(String str, long j10);

    
    void mo167onTapAvatarx5gers8(String str, long j10);

    
    void mo168onTapButtonActionComponentNkFJqEg(String str, long j10, String str2, long j11, int[] iArr);

    
    void mo169onTapCallpfaIj0E(String str, long j10);

    void onTapCancelUploadItem(String str, String str2);

    void onTapChannel(String str, String str2, String str3);

    void onTapCommand(CommandMentionContentNode commandMentionContentNode);

    void onTapConnectionsRoleTag(String str, String str2, String str3, String str4);

    void onTapCopyText(CharSequence charSequence);

    void onTapDismissEmbeddedActivity(String str);

    
    void mo170onTapDismissMediaPostSharePrompt1xi1bu0(String str);

    void onTapEmoji(EmojiContentNode emojiContentNode);

    
    void mo171onTapFollowForumPostpfaIj0E(String str, long j10);

    void onTapGiftCodeAccept(String str);

    void onTapGiftCodeEmbed(String str);

    
    void mo172onTapImagea6FnOk(String str, int i10, String str2, int i11, int i12, int i13, int i14, ViewResizeMode viewResizeMode, Double d10, Integer num);

    
    void mo173onTapInviteEmbedAFFcxXc(String str, int i10, Boolean bool, Boolean bool2);

    
    void mo174onTapInviteToSpeak1xi1bu0(String str);

    
    void mo175onTapJoinActivity1xi1bu0(String str);

    void onTapJoinEmbeddedActivity(String str);

    void onTapLoadMessagesAfter();

    void onTapLoadMessagesBefore();

    void onTapMention(String str, String str2);

    
    void mo176onTapMessageReply0eiqbug(long j10, String str);

    void onTapOpTag();

    
    void mo177onTapPostPreviewEmbedkUTrps(long j10, long j11, long j12, String str);

    
    void mo178onTapReactionu7_MRrM(String str, ReactionView.Reaction reaction, Boolean bool);

    
    void mo179onTapReactionOverflowpfaIj0E(String str, long j10);

    
    void mo180onTapRemix1xi1bu0(String str);

    void onTapRoleIcon(String str, String str2);

    
    void mo181onTapSeeMore1xi1bu0(String str);

    
    void mo182onTapSelectActionComponentu7_MRrM(String str, long j10, SelectComponent selectComponent);

    
    void mo183onTapShareForumPostmgk6anA(long j10, long j11);

    void onTapShowAltText(String str);

    
    void mo184onTapSummarysekaTiM(long j10, String str, String str2);

    
    void mo185onTapSummaryJumpsekaTiM(long j10, String str, String str2);

    void onTapSuppressNotificationsIcon();

    
    void mo186onTapTagEqy5D80(String str, long j10, String str2);

    
    void mo187onTapThreadEmbed1xi1bu0(String str);

    void onTapTimestamp(String str);

    
    void mo188onTapToggleBlockedMessages1xi1bu0(String str);

    void onTapUploadProgressClose(String str);

    
    void mo189onTapUsernamex5gers8(String str, long j10);

    
    void mo190onWelcomeReplyClickedAyv7vGE(Sticker sticker, String str);

    
    void mo191voiceMessagePlaybackEndedHuwN0RY(String str, float f10, float f11, long j10, float f12);

    
    void mo192voiceMessagePlaybackFailedntcYbpo(String str, String str2);

    
    void mo193voiceMessagePlaybackStartedOuNwOLg(String str, float f10, float f11, long j10);
}
