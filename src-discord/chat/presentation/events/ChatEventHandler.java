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

@Metadata(d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\n\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0007\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0002À\u0001J%\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ1\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\nH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&J%\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u0013J\u0010\u0010 \u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001eH&J%\u0010%\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010$J%\u0010'\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010$J%\u0010)\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b(\u0010\u0013JA\u00103\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010+\u001a\u00020*2\b\u0010,\u001a\u0004\u0018\u00010\n2\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b1\u00102J%\u00105\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b4\u0010\u0013J$\u00107\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\n2\b\u00106\u001a\u0004\u0018\u00010\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\nH&J.\u00109\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\n2\b\u00106\u001a\u0004\u0018\u00010\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\n2\b\u00108\u001a\u0004\u0018\u00010\nH&J\u0010\u0010<\u001a\u00020\u00062\u0006\u0010;\u001a\u00020:H&J\u0010\u0010>\u001a\u00020\u00062\u0006\u0010=\u001a\u00020\nH&J\u0010\u0010?\u001a\u00020\u00062\u0006\u0010=\u001a\u00020\nH&Ji\u0010N\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010A\u001a\u00020@2\u0006\u0010B\u001a\u00020\n2\u0006\u0010C\u001a\u00020@2\u0006\u0010D\u001a\u00020@2\u0006\u0010E\u001a\u00020@2\u0006\u0010F\u001a\u00020@2\u0006\u0010H\u001a\u00020G2\b\u0010J\u001a\u0004\u0018\u00010I2\b\u0010K\u001a\u0004\u0018\u00010@H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bL\u0010MJ9\u0010U\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010O\u001a\u00020@2\b\u0010Q\u001a\u0004\u0018\u00010P2\b\u0010R\u001a\u0004\u0018\u00010PH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bS\u0010TJ\b\u0010V\u001a\u00020\u0006H&J\b\u0010W\u001a\u00020\u0006H&J\u0018\u0010X\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\nH&J\u0010\u0010Z\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020YH&J\u0010\u0010[\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020YH&J%\u0010_\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\\\u001a\u00020\u0002H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b]\u0010^J3\u0010c\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010`\u001a\u0004\u0018\u00010PH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\ba\u0010bJ\u0018\u0010f\u001a\u00020\u00062\u0006\u0010d\u001a\u00020\n2\u0006\u0010e\u001a\u00020\nH&J\b\u0010g\u001a\u00020\u0006H&J(\u0010i\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\n2\u0006\u00106\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010h\u001a\u00020\nH&J/\u0010n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010+\u001a\u00020*2\u0006\u0010k\u001a\u00020jH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bl\u0010mJ\u0010\u0010p\u001a\u00020\u00062\u0006\u0010o\u001a\u00020\nH&J\u001d\u0010s\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bq\u0010rJ\u001d\u0010u\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bt\u0010rJ\u0010\u0010w\u001a\u00020\u00062\u0006\u0010v\u001a\u00020\nH&J\u0018\u0010z\u001a\u00020\u00062\u0006\u0010x\u001a\u00020\n2\u0006\u0010y\u001a\u00020\nH&J%\u0010|\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b{\u0010\u0013J%\u0010~\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b}\u0010$J\u001e\u0010\u0080\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u007f\u0010rJ\u001f\u0010\u0082\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b\u0081\u0001\u0010rJ\u0013\u0010\u0085\u0001\u001a\u00020\u00062\b\u0010\u0084\u0001\u001a\u00030\u0083\u0001H&J'\u0010\u0087\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b\u0086\u0001\u0010\u0013J)\u0010\u008b\u0001\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0007\u00106\u001a\u00030\u0088\u0001H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J'\u0010\u008d\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b\u008c\u0001\u0010\u0013J'\u0010\u008f\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b\u008e\u0001\u0010\u0013J'\u0010\u0091\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b\u0090\u0001\u0010\u0013J\t\u0010\u0092\u0001\u001a\u00020\u0006H&J\u001f\u0010\u0094\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b\u0093\u0001\u0010rJ\u0012\u0010\u0096\u0001\u001a\u00020\u00062\u0007\u0010\u0095\u0001\u001a\u00020\nH&J'\u0010\u0098\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b\u0097\u0001\u0010\u0013J=\u0010\u009f\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u009a\u0001\u001a\u00030\u0099\u00012\b\u0010\u009b\u0001\u001a\u00030\u0099\u00012\u0007\u0010\u009c\u0001\u001a\u00020\u0010H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u009d\u0001\u0010\u009e\u0001JG\u0010¤\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u009a\u0001\u001a\u00030\u0099\u00012\b\u0010 \u0001\u001a\u00030\u0099\u00012\u0007\u0010\u009c\u0001\u001a\u00020\u00102\b\u0010¡\u0001\u001a\u00030\u0099\u0001H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b¢\u0001\u0010£\u0001J+\u0010¨\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\t\u0010¥\u0001\u001a\u0004\u0018\u00010\nH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b¦\u0001\u0010§\u0001J\u0012\u0010ª\u0001\u001a\u00020\u00062\u0007\u0010©\u0001\u001a\u00020\nH&J\u0012\u0010«\u0001\u001a\u00020\u00062\u0007\u0010©\u0001\u001a\u00020\nH&J(\u0010\u00ad\u0001\u001a\u00020\u00062\u0006\u0010.\u001a\u00020-2\u0006\u0010\u0016\u001a\u00020\u0015H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b¬\u0001\u0010\u008a\u0001J;\u0010²\u0001\u001a\u00020\u00062\u0007\u00106\u001a\u00030\u0088\u00012\u0007\u0010®\u0001\u001a\u00020\u00152\u0007\u0010¯\u0001\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b°\u0001\u0010±\u0001J\u001f\u0010´\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b³\u0001\u0010rRG\u0010º\u0001\u001a/\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010@\u0012\u0007\u0012\u0005\u0018\u00010¶\u0001\u0012\u0004\u0012\u00020\u0006\u0018\u00010µ\u0001j\u0005\u0018\u0001`·\u00018&X¦\u0004ø\u0001\u0001¢\u0006\b\u001a\u0006\b¸\u0001\u0010¹\u0001R6\u0010¿\u0001\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0006\u0018\u00010»\u0001j\u0005\u0018\u0001`¼\u00018&X¦\u0004ø\u0001\u0001¢\u0006\b\u001a\u0006\b½\u0001\u0010¾\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006Á\u0001"}, d2 = {"Lcom/discord/chat/presentation/events/ChatEventHandler;", "", "Lcom/discord/primitives/MessageId;", "messageId", "Lcom/discord/chat/bridge/contentnode/LinkContentNode;", "node", "", "onLinkClicked-ntcYbpo", "(Ljava/lang/String;Lcom/discord/chat/bridge/contentnode/LinkContentNode;)V", "onLinkClicked", "", "url", "title", "onLinkClicked-u7_MRrM", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "onLinkLongClicked", "Lcom/discord/primitives/UserId;", "userId", "onLongPressAvatar-x5gers8", "(Ljava/lang/String;J)V", "onLongPressAvatar", "Lcom/discord/primitives/ChannelId;", "channelId", "Lcom/discord/reactions/ReactionView$Reaction;", "reaction", "onLongPressReaction-Eqy5D80", "(Ljava/lang/String;JLcom/discord/reactions/ReactionView$Reaction;)V", "onLongPressReaction", "onLongPressUsername-x5gers8", "onLongPressUsername", "Lcom/discord/chat/presentation/list/ScrollState;", "scrollState", "onScrollStateChanged", "Lcom/discord/chat/bridge/sticker/Sticker;", "sticker", "onStickerClicked-Ayv7vGE", "(Lcom/discord/chat/bridge/sticker/Sticker;Ljava/lang/String;)V", "onStickerClicked", "onStickerLongClicked-Ayv7vGE", "onStickerLongClicked", "onTapAvatar-x5gers8", "onTapAvatar", "", "messageFlags", "customId", "Lcom/discord/primitives/ApplicationId;", "applicationId", "", "indices", "onTapButtonActionComponent-NkFJqEg", "(Ljava/lang/String;JLjava/lang/String;J[I)V", "onTapButtonActionComponent", "onTapCall-pfaIj0E", "onTapCall", "guildId", "onTapChannel", "originalLink", "onLongPressChannel", "", "text", "onTapCopyText", "giftCode", "onTapGiftCodeAccept", "onTapGiftCodeEmbed", "", "attachmentIndex", "type", "viewWidth", "viewHeight", "viewX", "viewY", "Lcom/discord/chat/reactevents/ViewResizeMode;", "viewResizeMode", "", "portal", "embedIndex", "onTapImage-a6FnO-k", "(Ljava/lang/String;ILjava/lang/String;IIIILcom/discord/chat/reactevents/ViewResizeMode;Ljava/lang/Double;Ljava/lang/Integer;)V", "onTapImage", "index", "", "primary", "secondary", "onTapInviteEmbed-AFFcxXc", "(Ljava/lang/String;ILjava/lang/Boolean;Ljava/lang/Boolean;)V", "onTapInviteEmbed", "onTapLoadMessagesAfter", "onTapLoadMessagesBefore", "onTapMention", "Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;", "onTapCommand", "onLongPressCommand", "originId", "onTapMessageReply-0eiqbug", "(JLjava/lang/String;)V", "onTapMessageReply", "isBurst", "onTapReaction-u7_MRrM", "(Ljava/lang/String;Lcom/discord/reactions/ReactionView$Reaction;Ljava/lang/Boolean;)V", "onTapReaction", "roleName", "roleIconSource", "onTapRoleIcon", "onTapSuppressNotificationsIcon", "roleId", "onTapConnectionsRoleTag", "Lcom/discord/chat/bridge/botuikit/SelectComponent;", "selectComponent", "onTapSelectActionComponent-u7_MRrM", "(Ljava/lang/String;JLcom/discord/chat/bridge/botuikit/SelectComponent;)V", "onTapSelectActionComponent", "timestamp", "onTapTimestamp", "onTapThreadEmbed-1xi1bu0", "(Ljava/lang/String;)V", "onTapThreadEmbed", "onTapToggleBlockedMessages-1xi1bu0", "onTapToggleBlockedMessages", "fileId", "onTapUploadProgressClose", "uploaderId", "itemId", "onTapCancelUploadItem", "onTapUsername-x5gers8", "onTapUsername", "onWelcomeReplyClicked-Ayv7vGE", "onWelcomeReplyClicked", "onTapInviteToSpeak-1xi1bu0", "onTapInviteToSpeak", "onTapJoinActivity-1xi1bu0", "onTapJoinActivity", "Lcom/discord/chat/bridge/contentnode/EmojiContentNode;", "emoji", "onTapEmoji", "onTapFollowForumPost-pfaIj0E", "onTapFollowForumPost", "Lcom/discord/primitives/GuildId;", "onTapShareForumPost-mgk6anA", "(JJ)V", "onTapShareForumPost", "onTapReactionOverflow-pfaIj0E", "onTapReactionOverflow", "onTapAutoModerationActions-pfaIj0E", "onTapAutoModerationActions", "onTapAutoModerationFeedback-pfaIj0E", "onTapAutoModerationFeedback", "onTapOpTag", "onTapSeeMore-1xi1bu0", "onTapSeeMore", "description", "onTapShowAltText", "onInitiateReply-pfaIj0E", "onInitiateReply", "", "totalDurationSecs", "startDurationSecs", "senderUserId", "voiceMessagePlaybackStarted-OuNwOLg", "(Ljava/lang/String;FFJ)V", "voiceMessagePlaybackStarted", "endDurationSecs", "durationListeningSecs", "voiceMessagePlaybackEnded-HuwN0RY", "(Ljava/lang/String;FFJF)V", "voiceMessagePlaybackEnded", "errorMessage", "voiceMessagePlaybackFailed-ntcYbpo", "(Ljava/lang/String;Ljava/lang/String;)V", "voiceMessagePlaybackFailed", "embeddedActivityKey", "onTapJoinEmbeddedActivity", "onTapDismissEmbeddedActivity", "onTapActivityLauncherEmbed-uU1mFKc", "onTapActivityLauncherEmbed", "parentChannelId", "threadId", "onTapPostPreviewEmbed-kUTrp-s", "(JJJLjava/lang/String;)V", "onTapPostPreviewEmbed", "onTapDismissMediaPostSharePrompt-1xi1bu0", "onTapDismissMediaPostSharePrompt", "Lkotlin/Function4;", "Lcom/discord/chat/bridge/MediaType;", "Lcom/discord/chat/presentation/events/MessageLongPress;", "getOnMessageLongPressed", "()Lkotlin/jvm/functions/Function4;", "onMessageLongPressed", "Lkotlin/Function2;", "Lcom/discord/chat/presentation/events/MessageTapped;", "getOnMessageTapped", "()Lkotlin/jvm/functions/Function2;", "onMessageTapped", "Empty", "chat_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes8.dex */
public interface ChatEventHandler {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class DefaultImpls {
        /* renamed from: onLinkClicked-u7_MRrM$default  reason: not valid java name */
        public static /* synthetic */ void m174onLinkClickedu7_MRrM$default(ChatEventHandler chatEventHandler, String str, String str2, String str3, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 4) != 0) {
                    str3 = null;
                }
                chatEventHandler.mo142onLinkClickedu7_MRrM(str, str2, str3);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onLinkClicked-u7_MRrM");
        }

        /* renamed from: onTapButtonActionComponent-NkFJqEg$default  reason: not valid java name */
        public static /* synthetic */ void m175onTapButtonActionComponentNkFJqEg$default(ChatEventHandler chatEventHandler, String str, long j10, String str2, long j11, int[] iArr, int i10, Object obj) {
            if (obj == null) {
                chatEventHandler.mo152onTapButtonActionComponentNkFJqEg(str, (i10 & 2) != 0 ? 0L : j10, str2, j11, iArr);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onTapButtonActionComponent-NkFJqEg");
        }

        /* renamed from: onTapReaction-u7_MRrM$default  reason: not valid java name */
        public static /* synthetic */ void m176onTapReactionu7_MRrM$default(ChatEventHandler chatEventHandler, String str, ReactionView.Reaction reaction, Boolean bool, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 4) != 0) {
                    bool = Boolean.FALSE;
                }
                chatEventHandler.mo162onTapReactionu7_MRrM(str, reaction, bool);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onTapReaction-u7_MRrM");
        }

        /* renamed from: onTapSelectActionComponent-u7_MRrM$default  reason: not valid java name */
        public static /* synthetic */ void m177onTapSelectActionComponentu7_MRrM$default(ChatEventHandler chatEventHandler, String str, long j10, SelectComponent selectComponent, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    j10 = 0;
                }
                chatEventHandler.mo165onTapSelectActionComponentu7_MRrM(str, j10, selectComponent);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onTapSelectActionComponent-u7_MRrM");
        }
    }

    @Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\r\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0007\n\u0002\b\u000e\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J%\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J%\u0010\u001c\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010\u0010J.\u0010 \u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00172\b\u0010!\u001a\u0004\u0018\u00010\u00172\b\u0010\u000b\u001a\u0004\u0018\u00010\u00172\b\u0010\"\u001a\u0004\u0018\u00010\u0017H\u0016J\u0010\u0010#\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020$H\u0016J/\u0010%\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b(\u0010)J%\u0010*\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b+\u0010\u0010J\u0010\u0010,\u001a\u00020\n2\u0006\u0010-\u001a\u00020.H\u0016J%\u0010/\u001a\u00020\n2\u0006\u00100\u001a\u0002012\u0006\u0010\u000b\u001a\u00020\fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b2\u00103J%\u00104\u001a\u00020\n2\u0006\u00100\u001a\u0002012\u0006\u0010\u000b\u001a\u00020\fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b5\u00103J%\u00106\u001a\u00020\n2\u0006\u00107\u001a\u0002082\u0006\u0010\r\u001a\u00020\u000eH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b9\u0010:J%\u0010;\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b<\u0010\u0010J%\u0010=\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b>\u0010\u0010J%\u0010?\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b@\u0010\u0010J?\u0010A\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010B\u001a\u00020C2\b\u0010D\u001a\u0004\u0018\u00010\u00172\u0006\u00107\u001a\u0002082\u0006\u0010E\u001a\u00020FH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bG\u0010HJ%\u0010I\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bJ\u0010\u0010J\u0018\u0010K\u001a\u00020\n2\u0006\u0010L\u001a\u00020\u00172\u0006\u0010M\u001a\u00020\u0017H\u0016J$\u0010N\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00172\b\u0010!\u001a\u0004\u0018\u00010\u00172\b\u0010\u000b\u001a\u0004\u0018\u00010\u0017H\u0016J\u0010\u0010O\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020$H\u0016J(\u0010P\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\u00172\u0006\u0010Q\u001a\u00020\u0017H\u0016J\u0010\u0010R\u001a\u00020\n2\u0006\u0010S\u001a\u00020TH\u0016J\u0010\u0010U\u001a\u00020\n2\u0006\u0010V\u001a\u00020\u0017H\u0016J\u001d\u0010W\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bX\u0010YJ\u0010\u0010Z\u001a\u00020\n2\u0006\u0010[\u001a\u00020\\H\u0016J%\u0010]\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b^\u0010\u0010J\u0010\u0010_\u001a\u00020\n2\u0006\u0010`\u001a\u00020\u0017H\u0016J\u0010\u0010a\u001a\u00020\n2\u0006\u0010`\u001a\u00020\u0017H\u0016Ji\u0010b\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010c\u001a\u00020d2\u0006\u0010e\u001a\u00020\u00172\u0006\u0010f\u001a\u00020d2\u0006\u0010g\u001a\u00020d2\u0006\u0010h\u001a\u00020d2\u0006\u0010i\u001a\u00020d2\u0006\u0010j\u001a\u00020k2\b\u0010l\u001a\u0004\u0018\u00010m2\b\u0010n\u001a\u0004\u0018\u00010dH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bo\u0010pJ9\u0010q\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010r\u001a\u00020d2\b\u0010s\u001a\u0004\u0018\u00010t2\b\u0010u\u001a\u0004\u0018\u00010tH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bv\u0010wJ\u001d\u0010x\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\by\u0010YJ\u001d\u0010z\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b{\u0010YJ\u0010\u0010|\u001a\u00020\n2\u0006\u0010V\u001a\u00020\u0017H\u0016J\b\u0010}\u001a\u00020\nH\u0016J\b\u0010~\u001a\u00020\nH\u0016J\u0018\u0010\u007f\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\u0017H\u0016J)\u0010\u0080\u0001\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0007\u0010\u0081\u0001\u001a\u00020\fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\t\u0010\u0084\u0001\u001a\u00020\nH\u0016J;\u0010\u0085\u0001\u001a\u00020\n2\u0007\u0010!\u001a\u00030\u0086\u00012\u0007\u0010\u0087\u0001\u001a\u00020\u000e2\u0007\u0010\u0088\u0001\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J5\u0010\u008b\u0001\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010&\u001a\u0004\u0018\u00010'2\t\u0010\u008c\u0001\u001a\u0004\u0018\u00010tH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J'\u0010\u008f\u0001\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b\u0090\u0001\u0010\u0010J\u001b\u0010\u0091\u0001\u001a\u00020\n2\u0007\u0010\u0092\u0001\u001a\u00020\u00172\u0007\u0010\u0093\u0001\u001a\u00020\u0017H\u0016J\u001f\u0010\u0094\u0001\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b\u0095\u0001\u0010YJ2\u0010\u0096\u0001\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010B\u001a\u00020C2\b\u0010\u0097\u0001\u001a\u00030\u0098\u0001H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J(\u0010\u009b\u0001\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0007\u0010!\u001a\u00030\u0086\u0001H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b\u009c\u0001\u0010:J\u0012\u0010\u009d\u0001\u001a\u00020\n2\u0007\u0010\u009e\u0001\u001a\u00020\u0017H\u0016J\t\u0010\u009f\u0001\u001a\u00020\nH\u0016J\u001f\u0010 \u0001\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b¡\u0001\u0010YJ\u0012\u0010¢\u0001\u001a\u00020\n2\u0007\u0010£\u0001\u001a\u00020\u0017H\u0016J\u001f\u0010¤\u0001\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b¥\u0001\u0010YJ\u0012\u0010¦\u0001\u001a\u00020\n2\u0007\u0010§\u0001\u001a\u00020\u0017H\u0016J'\u0010¨\u0001\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b©\u0001\u0010\u0010J'\u0010ª\u0001\u001a\u00020\n2\u0006\u00100\u001a\u0002012\u0006\u0010\u000b\u001a\u00020\fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b«\u0001\u00103JG\u0010¬\u0001\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u00ad\u0001\u001a\u00030®\u00012\b\u0010¯\u0001\u001a\u00030®\u00012\u0007\u0010°\u0001\u001a\u00020\u001e2\b\u0010±\u0001\u001a\u00030®\u0001H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b²\u0001\u0010³\u0001J+\u0010´\u0001\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\t\u0010µ\u0001\u001a\u0004\u0018\u00010\u0017H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b¶\u0001\u0010·\u0001J=\u0010¸\u0001\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u00ad\u0001\u001a\u00030®\u00012\b\u0010¹\u0001\u001a\u00030®\u00012\u0007\u0010°\u0001\u001a\u00020\u001eH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\bº\u0001\u0010»\u0001R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006¼\u0001"}, d2 = {"Lcom/discord/chat/presentation/events/ChatEventHandler$Empty;", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "()V", "onMessageLongPressed", "", "getOnMessageLongPressed", "()Ljava/lang/Void;", "onMessageTapped", "getOnMessageTapped", "onInitiateReply", "", "messageId", "Lcom/discord/primitives/MessageId;", "channelId", "Lcom/discord/primitives/ChannelId;", "onInitiateReply-pfaIj0E", "(Ljava/lang/String;J)V", "onLinkClicked", "node", "Lcom/discord/chat/bridge/contentnode/LinkContentNode;", "onLinkClicked-ntcYbpo", "(Ljava/lang/String;Lcom/discord/chat/bridge/contentnode/LinkContentNode;)V", "url", "", "title", "onLinkClicked-u7_MRrM", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "onLinkLongClicked", "onLongPressAvatar", "userId", "Lcom/discord/primitives/UserId;", "onLongPressAvatar-x5gers8", "onLongPressChannel", "guildId", "originalLink", "onLongPressCommand", "Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;", "onLongPressReaction", "reaction", "Lcom/discord/reactions/ReactionView$Reaction;", "onLongPressReaction-Eqy5D80", "(Ljava/lang/String;JLcom/discord/reactions/ReactionView$Reaction;)V", "onLongPressUsername", "onLongPressUsername-x5gers8", "onScrollStateChanged", "scrollState", "Lcom/discord/chat/presentation/list/ScrollState;", "onStickerClicked", "sticker", "Lcom/discord/chat/bridge/sticker/Sticker;", "onStickerClicked-Ayv7vGE", "(Lcom/discord/chat/bridge/sticker/Sticker;Ljava/lang/String;)V", "onStickerLongClicked", "onStickerLongClicked-Ayv7vGE", "onTapActivityLauncherEmbed", "applicationId", "Lcom/discord/primitives/ApplicationId;", "onTapActivityLauncherEmbed-uU1mFKc", "(JJ)V", "onTapAutoModerationActions", "onTapAutoModerationActions-pfaIj0E", "onTapAutoModerationFeedback", "onTapAutoModerationFeedback-pfaIj0E", "onTapAvatar", "onTapAvatar-x5gers8", "onTapButtonActionComponent", "messageFlags", "", "customId", "indices", "", "onTapButtonActionComponent-NkFJqEg", "(Ljava/lang/String;JLjava/lang/String;J[I)V", "onTapCall", "onTapCall-pfaIj0E", "onTapCancelUploadItem", "uploaderId", "itemId", "onTapChannel", "onTapCommand", "onTapConnectionsRoleTag", "roleId", "onTapCopyText", "text", "", "onTapDismissEmbeddedActivity", "embeddedActivityKey", "onTapDismissMediaPostSharePrompt", "onTapDismissMediaPostSharePrompt-1xi1bu0", "(Ljava/lang/String;)V", "onTapEmoji", "emoji", "Lcom/discord/chat/bridge/contentnode/EmojiContentNode;", "onTapFollowForumPost", "onTapFollowForumPost-pfaIj0E", "onTapGiftCodeAccept", "giftCode", "onTapGiftCodeEmbed", "onTapImage", "attachmentIndex", "", "type", "viewWidth", "viewHeight", "viewX", "viewY", "viewResizeMode", "Lcom/discord/chat/reactevents/ViewResizeMode;", "portal", "", "embedIndex", "onTapImage-a6FnO-k", "(Ljava/lang/String;ILjava/lang/String;IIIILcom/discord/chat/reactevents/ViewResizeMode;Ljava/lang/Double;Ljava/lang/Integer;)V", "onTapInviteEmbed", "index", "primary", "", "secondary", "onTapInviteEmbed-AFFcxXc", "(Ljava/lang/String;ILjava/lang/Boolean;Ljava/lang/Boolean;)V", "onTapInviteToSpeak", "onTapInviteToSpeak-1xi1bu0", "onTapJoinActivity", "onTapJoinActivity-1xi1bu0", "onTapJoinEmbeddedActivity", "onTapLoadMessagesAfter", "onTapLoadMessagesBefore", "onTapMention", "onTapMessageReply", "originId", "onTapMessageReply-0eiqbug", "(JLjava/lang/String;)V", "onTapOpTag", "onTapPostPreviewEmbed", "Lcom/discord/primitives/GuildId;", "parentChannelId", "threadId", "onTapPostPreviewEmbed-kUTrp-s", "(JJJLjava/lang/String;)V", "onTapReaction", "isBurst", "onTapReaction-u7_MRrM", "(Ljava/lang/String;Lcom/discord/reactions/ReactionView$Reaction;Ljava/lang/Boolean;)V", "onTapReactionOverflow", "onTapReactionOverflow-pfaIj0E", "onTapRoleIcon", "roleName", "roleIconSource", "onTapSeeMore", "onTapSeeMore-1xi1bu0", "onTapSelectActionComponent", "selectComponent", "Lcom/discord/chat/bridge/botuikit/SelectComponent;", "onTapSelectActionComponent-u7_MRrM", "(Ljava/lang/String;JLcom/discord/chat/bridge/botuikit/SelectComponent;)V", "onTapShareForumPost", "onTapShareForumPost-mgk6anA", "onTapShowAltText", "description", "onTapSuppressNotificationsIcon", "onTapThreadEmbed", "onTapThreadEmbed-1xi1bu0", "onTapTimestamp", "timestamp", "onTapToggleBlockedMessages", "onTapToggleBlockedMessages-1xi1bu0", "onTapUploadProgressClose", "fileId", "onTapUsername", "onTapUsername-x5gers8", "onWelcomeReplyClicked", "onWelcomeReplyClicked-Ayv7vGE", "voiceMessagePlaybackEnded", "totalDurationSecs", "", "endDurationSecs", "senderUserId", "durationListeningSecs", "voiceMessagePlaybackEnded-HuwN0RY", "(Ljava/lang/String;FFJF)V", "voiceMessagePlaybackFailed", "errorMessage", "voiceMessagePlaybackFailed-ntcYbpo", "(Ljava/lang/String;Ljava/lang/String;)V", "voiceMessagePlaybackStarted", "startDurationSecs", "voiceMessagePlaybackStarted-OuNwOLg", "(Ljava/lang/String;FFJ)V", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Empty implements ChatEventHandler {
        public static final Empty INSTANCE = new Empty();
        private static final Void onMessageLongPressed = null;
        private static final Void onMessageTapped = null;

        private Empty() {
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* renamed from: onInitiateReply-pfaIj0E */
        public void mo140onInitiateReplypfaIj0E(String messageId, long j10) {
            q.g(messageId, "messageId");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* renamed from: onLinkClicked-ntcYbpo */
        public void mo141onLinkClickedntcYbpo(String messageId, LinkContentNode node) {
            q.g(messageId, "messageId");
            q.g(node, "node");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* renamed from: onLinkClicked-u7_MRrM */
        public void mo142onLinkClickedu7_MRrM(String messageId, String url, String str) {
            q.g(messageId, "messageId");
            q.g(url, "url");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        public void onLinkLongClicked(LinkContentNode node) {
            q.g(node, "node");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* renamed from: onLongPressAvatar-x5gers8 */
        public void mo143onLongPressAvatarx5gers8(String messageId, long j10) {
            q.g(messageId, "messageId");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        public void onLongPressChannel(String channelId, String str, String str2, String str3) {
            q.g(channelId, "channelId");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        public void onLongPressCommand(CommandMentionContentNode node) {
            q.g(node, "node");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* renamed from: onLongPressReaction-Eqy5D80 */
        public void mo144onLongPressReactionEqy5D80(String messageId, long j10, ReactionView.Reaction reaction) {
            q.g(messageId, "messageId");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* renamed from: onLongPressUsername-x5gers8 */
        public void mo145onLongPressUsernamex5gers8(String messageId, long j10) {
            q.g(messageId, "messageId");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        public void onScrollStateChanged(ScrollState scrollState) {
            q.g(scrollState, "scrollState");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* renamed from: onStickerClicked-Ayv7vGE */
        public void mo146onStickerClickedAyv7vGE(Sticker sticker, String messageId) {
            q.g(sticker, "sticker");
            q.g(messageId, "messageId");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* renamed from: onStickerLongClicked-Ayv7vGE */
        public void mo147onStickerLongClickedAyv7vGE(Sticker sticker, String messageId) {
            q.g(sticker, "sticker");
            q.g(messageId, "messageId");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* renamed from: onTapActivityLauncherEmbed-uU1mFKc */
        public void mo148onTapActivityLauncherEmbeduU1mFKc(long j10, long j11) {
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* renamed from: onTapAutoModerationActions-pfaIj0E */
        public void mo149onTapAutoModerationActionspfaIj0E(String messageId, long j10) {
            q.g(messageId, "messageId");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* renamed from: onTapAutoModerationFeedback-pfaIj0E */
        public void mo150onTapAutoModerationFeedbackpfaIj0E(String messageId, long j10) {
            q.g(messageId, "messageId");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* renamed from: onTapAvatar-x5gers8 */
        public void mo151onTapAvatarx5gers8(String messageId, long j10) {
            q.g(messageId, "messageId");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* renamed from: onTapButtonActionComponent-NkFJqEg */
        public void mo152onTapButtonActionComponentNkFJqEg(String messageId, long j10, String str, long j11, int[] indices) {
            q.g(messageId, "messageId");
            q.g(indices, "indices");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* renamed from: onTapCall-pfaIj0E */
        public void mo153onTapCallpfaIj0E(String messageId, long j10) {
            q.g(messageId, "messageId");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        public void onTapCancelUploadItem(String uploaderId, String itemId) {
            q.g(uploaderId, "uploaderId");
            q.g(itemId, "itemId");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        public void onTapChannel(String channelId, String str, String str2) {
            q.g(channelId, "channelId");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        public void onTapCommand(CommandMentionContentNode node) {
            q.g(node, "node");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        public void onTapConnectionsRoleTag(String userId, String guildId, String channelId, String roleId) {
            q.g(userId, "userId");
            q.g(guildId, "guildId");
            q.g(channelId, "channelId");
            q.g(roleId, "roleId");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        public void onTapCopyText(CharSequence text) {
            q.g(text, "text");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        public void onTapDismissEmbeddedActivity(String embeddedActivityKey) {
            q.g(embeddedActivityKey, "embeddedActivityKey");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* renamed from: onTapDismissMediaPostSharePrompt-1xi1bu0 */
        public void mo154onTapDismissMediaPostSharePrompt1xi1bu0(String messageId) {
            q.g(messageId, "messageId");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        public void onTapEmoji(EmojiContentNode emoji) {
            q.g(emoji, "emoji");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* renamed from: onTapFollowForumPost-pfaIj0E */
        public void mo155onTapFollowForumPostpfaIj0E(String messageId, long j10) {
            q.g(messageId, "messageId");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        public void onTapGiftCodeAccept(String giftCode) {
            q.g(giftCode, "giftCode");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        public void onTapGiftCodeEmbed(String giftCode) {
            q.g(giftCode, "giftCode");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* renamed from: onTapImage-a6FnO-k */
        public void mo156onTapImagea6FnOk(String messageId, int i10, String type, int i11, int i12, int i13, int i14, ViewResizeMode viewResizeMode, Double d10, Integer num) {
            q.g(messageId, "messageId");
            q.g(type, "type");
            q.g(viewResizeMode, "viewResizeMode");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* renamed from: onTapInviteEmbed-AFFcxXc */
        public void mo157onTapInviteEmbedAFFcxXc(String messageId, int i10, Boolean bool, Boolean bool2) {
            q.g(messageId, "messageId");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* renamed from: onTapInviteToSpeak-1xi1bu0 */
        public void mo158onTapInviteToSpeak1xi1bu0(String messageId) {
            q.g(messageId, "messageId");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* renamed from: onTapJoinActivity-1xi1bu0 */
        public void mo159onTapJoinActivity1xi1bu0(String messageId) {
            q.g(messageId, "messageId");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        public void onTapJoinEmbeddedActivity(String embeddedActivityKey) {
            q.g(embeddedActivityKey, "embeddedActivityKey");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        public void onTapLoadMessagesAfter() {
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        public void onTapLoadMessagesBefore() {
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        public void onTapMention(String userId, String channelId) {
            q.g(userId, "userId");
            q.g(channelId, "channelId");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* renamed from: onTapMessageReply-0eiqbug */
        public void mo160onTapMessageReply0eiqbug(long j10, String originId) {
            q.g(originId, "originId");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        public void onTapOpTag() {
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* renamed from: onTapPostPreviewEmbed-kUTrp-s */
        public void mo161onTapPostPreviewEmbedkUTrps(long j10, long j11, long j12, String messageId) {
            q.g(messageId, "messageId");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* renamed from: onTapReaction-u7_MRrM */
        public void mo162onTapReactionu7_MRrM(String messageId, ReactionView.Reaction reaction, Boolean bool) {
            q.g(messageId, "messageId");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* renamed from: onTapReactionOverflow-pfaIj0E */
        public void mo163onTapReactionOverflowpfaIj0E(String messageId, long j10) {
            q.g(messageId, "messageId");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        public void onTapRoleIcon(String roleName, String roleIconSource) {
            q.g(roleName, "roleName");
            q.g(roleIconSource, "roleIconSource");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* renamed from: onTapSeeMore-1xi1bu0 */
        public void mo164onTapSeeMore1xi1bu0(String messageId) {
            q.g(messageId, "messageId");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* renamed from: onTapSelectActionComponent-u7_MRrM */
        public void mo165onTapSelectActionComponentu7_MRrM(String messageId, long j10, SelectComponent selectComponent) {
            q.g(messageId, "messageId");
            q.g(selectComponent, "selectComponent");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* renamed from: onTapShareForumPost-mgk6anA */
        public void mo166onTapShareForumPostmgk6anA(long j10, long j11) {
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        public void onTapShowAltText(String description) {
            q.g(description, "description");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        public void onTapSuppressNotificationsIcon() {
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* renamed from: onTapThreadEmbed-1xi1bu0 */
        public void mo167onTapThreadEmbed1xi1bu0(String messageId) {
            q.g(messageId, "messageId");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        public void onTapTimestamp(String timestamp) {
            q.g(timestamp, "timestamp");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* renamed from: onTapToggleBlockedMessages-1xi1bu0 */
        public void mo168onTapToggleBlockedMessages1xi1bu0(String messageId) {
            q.g(messageId, "messageId");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        public void onTapUploadProgressClose(String fileId) {
            q.g(fileId, "fileId");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* renamed from: onTapUsername-x5gers8 */
        public void mo169onTapUsernamex5gers8(String messageId, long j10) {
            q.g(messageId, "messageId");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* renamed from: onWelcomeReplyClicked-Ayv7vGE */
        public void mo170onWelcomeReplyClickedAyv7vGE(Sticker sticker, String messageId) {
            q.g(sticker, "sticker");
            q.g(messageId, "messageId");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* renamed from: voiceMessagePlaybackEnded-HuwN0RY */
        public void mo171voiceMessagePlaybackEndedHuwN0RY(String messageId, float f10, float f11, long j10, float f12) {
            q.g(messageId, "messageId");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* renamed from: voiceMessagePlaybackFailed-ntcYbpo */
        public void mo172voiceMessagePlaybackFailedntcYbpo(String messageId, String str) {
            q.g(messageId, "messageId");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* renamed from: voiceMessagePlaybackStarted-OuNwOLg */
        public void mo173voiceMessagePlaybackStartedOuNwOLg(String messageId, float f10, float f11, long j10) {
            q.g(messageId, "messageId");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        public Void getOnMessageLongPressed() {
            return onMessageLongPressed;
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        public Void getOnMessageTapped() {
            return onMessageTapped;
        }
    }

    Function4<MessageId, ChannelId, Integer, MediaType, Unit> getOnMessageLongPressed();

    Function2<MessageId, ChannelId, Unit> getOnMessageTapped();

    /* renamed from: onInitiateReply-pfaIj0E  reason: not valid java name */
    void mo140onInitiateReplypfaIj0E(String str, long j10);

    /* renamed from: onLinkClicked-ntcYbpo  reason: not valid java name */
    void mo141onLinkClickedntcYbpo(String str, LinkContentNode linkContentNode);

    /* renamed from: onLinkClicked-u7_MRrM  reason: not valid java name */
    void mo142onLinkClickedu7_MRrM(String str, String str2, String str3);

    void onLinkLongClicked(LinkContentNode linkContentNode);

    /* renamed from: onLongPressAvatar-x5gers8  reason: not valid java name */
    void mo143onLongPressAvatarx5gers8(String str, long j10);

    void onLongPressChannel(String str, String str2, String str3, String str4);

    void onLongPressCommand(CommandMentionContentNode commandMentionContentNode);

    /* renamed from: onLongPressReaction-Eqy5D80  reason: not valid java name */
    void mo144onLongPressReactionEqy5D80(String str, long j10, ReactionView.Reaction reaction);

    /* renamed from: onLongPressUsername-x5gers8  reason: not valid java name */
    void mo145onLongPressUsernamex5gers8(String str, long j10);

    void onScrollStateChanged(ScrollState scrollState);

    /* renamed from: onStickerClicked-Ayv7vGE  reason: not valid java name */
    void mo146onStickerClickedAyv7vGE(Sticker sticker, String str);

    /* renamed from: onStickerLongClicked-Ayv7vGE  reason: not valid java name */
    void mo147onStickerLongClickedAyv7vGE(Sticker sticker, String str);

    /* renamed from: onTapActivityLauncherEmbed-uU1mFKc  reason: not valid java name */
    void mo148onTapActivityLauncherEmbeduU1mFKc(long j10, long j11);

    /* renamed from: onTapAutoModerationActions-pfaIj0E  reason: not valid java name */
    void mo149onTapAutoModerationActionspfaIj0E(String str, long j10);

    /* renamed from: onTapAutoModerationFeedback-pfaIj0E  reason: not valid java name */
    void mo150onTapAutoModerationFeedbackpfaIj0E(String str, long j10);

    /* renamed from: onTapAvatar-x5gers8  reason: not valid java name */
    void mo151onTapAvatarx5gers8(String str, long j10);

    /* renamed from: onTapButtonActionComponent-NkFJqEg  reason: not valid java name */
    void mo152onTapButtonActionComponentNkFJqEg(String str, long j10, String str2, long j11, int[] iArr);

    /* renamed from: onTapCall-pfaIj0E  reason: not valid java name */
    void mo153onTapCallpfaIj0E(String str, long j10);

    void onTapCancelUploadItem(String str, String str2);

    void onTapChannel(String str, String str2, String str3);

    void onTapCommand(CommandMentionContentNode commandMentionContentNode);

    void onTapConnectionsRoleTag(String str, String str2, String str3, String str4);

    void onTapCopyText(CharSequence charSequence);

    void onTapDismissEmbeddedActivity(String str);

    /* renamed from: onTapDismissMediaPostSharePrompt-1xi1bu0  reason: not valid java name */
    void mo154onTapDismissMediaPostSharePrompt1xi1bu0(String str);

    void onTapEmoji(EmojiContentNode emojiContentNode);

    /* renamed from: onTapFollowForumPost-pfaIj0E  reason: not valid java name */
    void mo155onTapFollowForumPostpfaIj0E(String str, long j10);

    void onTapGiftCodeAccept(String str);

    void onTapGiftCodeEmbed(String str);

    /* renamed from: onTapImage-a6FnO-k  reason: not valid java name */
    void mo156onTapImagea6FnOk(String str, int i10, String str2, int i11, int i12, int i13, int i14, ViewResizeMode viewResizeMode, Double d10, Integer num);

    /* renamed from: onTapInviteEmbed-AFFcxXc  reason: not valid java name */
    void mo157onTapInviteEmbedAFFcxXc(String str, int i10, Boolean bool, Boolean bool2);

    /* renamed from: onTapInviteToSpeak-1xi1bu0  reason: not valid java name */
    void mo158onTapInviteToSpeak1xi1bu0(String str);

    /* renamed from: onTapJoinActivity-1xi1bu0  reason: not valid java name */
    void mo159onTapJoinActivity1xi1bu0(String str);

    void onTapJoinEmbeddedActivity(String str);

    void onTapLoadMessagesAfter();

    void onTapLoadMessagesBefore();

    void onTapMention(String str, String str2);

    /* renamed from: onTapMessageReply-0eiqbug  reason: not valid java name */
    void mo160onTapMessageReply0eiqbug(long j10, String str);

    void onTapOpTag();

    /* renamed from: onTapPostPreviewEmbed-kUTrp-s  reason: not valid java name */
    void mo161onTapPostPreviewEmbedkUTrps(long j10, long j11, long j12, String str);

    /* renamed from: onTapReaction-u7_MRrM  reason: not valid java name */
    void mo162onTapReactionu7_MRrM(String str, ReactionView.Reaction reaction, Boolean bool);

    /* renamed from: onTapReactionOverflow-pfaIj0E  reason: not valid java name */
    void mo163onTapReactionOverflowpfaIj0E(String str, long j10);

    void onTapRoleIcon(String str, String str2);

    /* renamed from: onTapSeeMore-1xi1bu0  reason: not valid java name */
    void mo164onTapSeeMore1xi1bu0(String str);

    /* renamed from: onTapSelectActionComponent-u7_MRrM  reason: not valid java name */
    void mo165onTapSelectActionComponentu7_MRrM(String str, long j10, SelectComponent selectComponent);

    /* renamed from: onTapShareForumPost-mgk6anA  reason: not valid java name */
    void mo166onTapShareForumPostmgk6anA(long j10, long j11);

    void onTapShowAltText(String str);

    void onTapSuppressNotificationsIcon();

    /* renamed from: onTapThreadEmbed-1xi1bu0  reason: not valid java name */
    void mo167onTapThreadEmbed1xi1bu0(String str);

    void onTapTimestamp(String str);

    /* renamed from: onTapToggleBlockedMessages-1xi1bu0  reason: not valid java name */
    void mo168onTapToggleBlockedMessages1xi1bu0(String str);

    void onTapUploadProgressClose(String str);

    /* renamed from: onTapUsername-x5gers8  reason: not valid java name */
    void mo169onTapUsernamex5gers8(String str, long j10);

    /* renamed from: onWelcomeReplyClicked-Ayv7vGE  reason: not valid java name */
    void mo170onWelcomeReplyClickedAyv7vGE(Sticker sticker, String str);

    /* renamed from: voiceMessagePlaybackEnded-HuwN0RY  reason: not valid java name */
    void mo171voiceMessagePlaybackEndedHuwN0RY(String str, float f10, float f11, long j10, float f12);

    /* renamed from: voiceMessagePlaybackFailed-ntcYbpo  reason: not valid java name */
    void mo172voiceMessagePlaybackFailedntcYbpo(String str, String str2);

    /* renamed from: voiceMessagePlaybackStarted-OuNwOLg  reason: not valid java name */
    void mo173voiceMessagePlaybackStartedOuNwOLg(String str, float f10, float f11, long j10);
}
