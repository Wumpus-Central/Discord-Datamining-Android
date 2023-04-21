.class public interface abstract Lcom/discord/chat/presentation/events/ChatEventHandler;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/chat/presentation/events/ChatEventHandler$DefaultImpls;,
        Lcom/discord/chat/presentation/events/ChatEventHandler$Empty;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00ca\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\u0008\n\n\u0002\u0010\r\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0018\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\u0007\n\u0002\u0008\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008f\u0018\u00002\u00020\u0001:\u0002\u00bb\u0001J%\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J1\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\nH&\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&J%\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H&\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J/\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0017H&\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ%\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H&\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u001c\u0010\u0013J\u0010\u0010 \u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001eH&J%\u0010%\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0003\u001a\u00020\u0002H&\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008#\u0010$J%\u0010\'\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0003\u001a\u00020\u0002H&\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008&\u0010$J%\u0010)\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H&\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008(\u0010\u0013JA\u00103\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010+\u001a\u00020*2\u0008\u0010,\u001a\u0004\u0018\u00010\n2\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/H&\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u00081\u00102J%\u00105\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H&\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u00084\u0010\u0013J$\u00107\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\n2\u0008\u00106\u001a\u0004\u0018\u00010\n2\u0008\u0010\u0003\u001a\u0004\u0018\u00010\nH&J.\u00109\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\n2\u0008\u00106\u001a\u0004\u0018\u00010\n2\u0008\u0010\u0003\u001a\u0004\u0018\u00010\n2\u0008\u00108\u001a\u0004\u0018\u00010\nH&J\u0010\u0010<\u001a\u00020\u00062\u0006\u0010;\u001a\u00020:H&J\u0010\u0010>\u001a\u00020\u00062\u0006\u0010=\u001a\u00020\nH&J\u0010\u0010?\u001a\u00020\u00062\u0006\u0010=\u001a\u00020\nH&Ji\u0010N\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010A\u001a\u00020@2\u0006\u0010B\u001a\u00020\n2\u0006\u0010C\u001a\u00020@2\u0006\u0010D\u001a\u00020@2\u0006\u0010E\u001a\u00020@2\u0006\u0010F\u001a\u00020@2\u0006\u0010H\u001a\u00020G2\u0008\u0010J\u001a\u0004\u0018\u00010I2\u0008\u0010K\u001a\u0004\u0018\u00010@H&\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008L\u0010MJ9\u0010U\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010O\u001a\u00020@2\u0008\u0010Q\u001a\u0004\u0018\u00010P2\u0008\u0010R\u001a\u0004\u0018\u00010PH&\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008S\u0010TJ\u0008\u0010V\u001a\u00020\u0006H&J\u0008\u0010W\u001a\u00020\u0006H&J\u0018\u0010X\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\nH&J\u0010\u0010Z\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020YH&J\u0010\u0010[\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020YH&J%\u0010_\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\\\u001a\u00020\u0002H&\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008]\u0010^J3\u0010c\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\u0008\u0002\u0010`\u001a\u0004\u0018\u00010PH&\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008a\u0010bJ\u0018\u0010f\u001a\u00020\u00062\u0006\u0010d\u001a\u00020\n2\u0006\u0010e\u001a\u00020\nH&J\u0008\u0010g\u001a\u00020\u0006H&J(\u0010i\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\n2\u0006\u00106\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010h\u001a\u00020\nH&J/\u0010n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010+\u001a\u00020*2\u0006\u0010k\u001a\u00020jH&\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008l\u0010mJ\u0010\u0010p\u001a\u00020\u00062\u0006\u0010o\u001a\u00020\nH&J\u001d\u0010s\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008q\u0010rJ\u001d\u0010u\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008t\u0010rJ\u0010\u0010w\u001a\u00020\u00062\u0006\u0010v\u001a\u00020\nH&J\u0018\u0010z\u001a\u00020\u00062\u0006\u0010x\u001a\u00020\n2\u0006\u0010y\u001a\u00020\nH&J%\u0010|\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H&\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008{\u0010\u0013J%\u0010~\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0003\u001a\u00020\u0002H&\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008}\u0010$J\u001e\u0010\u0080\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u007f\u0010rJ\u001f\u0010\u0082\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0005\u0008\u0081\u0001\u0010rJ\u0013\u0010\u0085\u0001\u001a\u00020\u00062\u0008\u0010\u0084\u0001\u001a\u00030\u0083\u0001H&J\'\u0010\u0087\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H&\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0005\u0008\u0086\u0001\u0010\u0013J)\u0010\u008b\u0001\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0007\u00106\u001a\u00030\u0088\u0001H&\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0006\u0008\u0089\u0001\u0010\u008a\u0001J\'\u0010\u008d\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H&\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0005\u0008\u008c\u0001\u0010\u0013J\'\u0010\u008f\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H&\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0005\u0008\u008e\u0001\u0010\u0013J\'\u0010\u0091\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H&\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0005\u0008\u0090\u0001\u0010\u0013J\t\u0010\u0092\u0001\u001a\u00020\u0006H&J\u001f\u0010\u0094\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0005\u0008\u0093\u0001\u0010rJ\u0012\u0010\u0096\u0001\u001a\u00020\u00062\u0007\u0010\u0095\u0001\u001a\u00020\nH&J\'\u0010\u0098\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H&\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0005\u0008\u0097\u0001\u0010\u0013J=\u0010\u009f\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u009a\u0001\u001a\u00030\u0099\u00012\u0008\u0010\u009b\u0001\u001a\u00030\u0099\u00012\u0007\u0010\u009c\u0001\u001a\u00020\u0010H&\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0006\u0008\u009d\u0001\u0010\u009e\u0001J=\u0010\u00a2\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u009a\u0001\u001a\u00030\u0099\u00012\u0008\u0010\u00a0\u0001\u001a\u00030\u0099\u00012\u0007\u0010\u009c\u0001\u001a\u00020\u0010H&\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0006\u0008\u00a1\u0001\u0010\u009e\u0001J+\u0010\u00a6\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\t\u0010\u00a3\u0001\u001a\u0004\u0018\u00010\nH&\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0006\u0008\u00a4\u0001\u0010\u00a5\u0001J\u0012\u0010\u00a8\u0001\u001a\u00020\u00062\u0007\u0010\u00a7\u0001\u001a\u00020\nH&J\u0012\u0010\u00a9\u0001\u001a\u00020\u00062\u0007\u0010\u00a7\u0001\u001a\u00020\nH&J(\u0010\u00ab\u0001\u001a\u00020\u00062\u0006\u0010.\u001a\u00020-2\u0006\u0010\u0016\u001a\u00020\u0015H&\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0006\u0008\u00aa\u0001\u0010\u008a\u0001J1\u0010\u00af\u0001\u001a\u00020\u00062\u0007\u0010\u00ac\u0001\u001a\u00020\n2\u0007\u0010\u00ad\u0001\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H&\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0005\u0008\u00ae\u0001\u0010\u000eRG\u0010\u00b5\u0001\u001a/\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010@\u0012\u0007\u0012\u0005\u0018\u00010\u00b1\u0001\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00b0\u0001j\u0005\u0018\u0001`\u00b2\u00018&X\u00a6\u0004\u00f8\u0001\u0001\u00a2\u0006\u0008\u001a\u0006\u0008\u00b3\u0001\u0010\u00b4\u0001R6\u0010\u00ba\u0001\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00b6\u0001j\u0005\u0018\u0001`\u00b7\u00018&X\u00a6\u0004\u00f8\u0001\u0001\u00a2\u0006\u0008\u001a\u0006\u0008\u00b8\u0001\u0010\u00b9\u0001\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\u00bc\u0001"
    }
    d2 = {
        "Lcom/discord/chat/presentation/events/ChatEventHandler;",
        "",
        "Lcom/discord/primitives/MessageId;",
        "messageId",
        "Lcom/discord/chat/bridge/contentnode/LinkContentNode;",
        "node",
        "",
        "onLinkClicked-ntcYbpo",
        "(Ljava/lang/String;Lcom/discord/chat/bridge/contentnode/LinkContentNode;)V",
        "onLinkClicked",
        "",
        "url",
        "title",
        "onLinkClicked-u7_MRrM",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "onLinkLongClicked",
        "Lcom/discord/primitives/UserId;",
        "userId",
        "onLongPressAvatar-x5gers8",
        "(Ljava/lang/String;J)V",
        "onLongPressAvatar",
        "Lcom/discord/primitives/ChannelId;",
        "channelId",
        "Lcom/discord/reactions/ReactionView$Reaction;",
        "reaction",
        "onLongPressReaction-Eqy5D80",
        "(Ljava/lang/String;JLcom/discord/reactions/ReactionView$Reaction;)V",
        "onLongPressReaction",
        "onLongPressUsername-x5gers8",
        "onLongPressUsername",
        "Lcom/discord/chat/presentation/list/ScrollState;",
        "scrollState",
        "onScrollStateChanged",
        "Lcom/discord/chat/bridge/sticker/Sticker;",
        "sticker",
        "onStickerClicked-Ayv7vGE",
        "(Lcom/discord/chat/bridge/sticker/Sticker;Ljava/lang/String;)V",
        "onStickerClicked",
        "onStickerLongClicked-Ayv7vGE",
        "onStickerLongClicked",
        "onTapAvatar-x5gers8",
        "onTapAvatar",
        "",
        "messageFlags",
        "customId",
        "Lcom/discord/primitives/ApplicationId;",
        "applicationId",
        "",
        "indices",
        "onTapButtonActionComponent-NkFJqEg",
        "(Ljava/lang/String;JLjava/lang/String;J[I)V",
        "onTapButtonActionComponent",
        "onTapCall-pfaIj0E",
        "onTapCall",
        "guildId",
        "onTapChannel",
        "originalLink",
        "onLongPressChannel",
        "",
        "text",
        "onTapCopyText",
        "giftCode",
        "onTapGiftCodeAccept",
        "onTapGiftCodeEmbed",
        "",
        "attachmentIndex",
        "type",
        "viewWidth",
        "viewHeight",
        "viewX",
        "viewY",
        "Lcom/discord/chat/reactevents/ViewResizeMode;",
        "viewResizeMode",
        "",
        "portal",
        "embedIndex",
        "onTapImage-a6FnO-k",
        "(Ljava/lang/String;ILjava/lang/String;IIIILcom/discord/chat/reactevents/ViewResizeMode;Ljava/lang/Double;Ljava/lang/Integer;)V",
        "onTapImage",
        "index",
        "",
        "primary",
        "secondary",
        "onTapInviteEmbed-AFFcxXc",
        "(Ljava/lang/String;ILjava/lang/Boolean;Ljava/lang/Boolean;)V",
        "onTapInviteEmbed",
        "onTapLoadMessagesAfter",
        "onTapLoadMessagesBefore",
        "onTapMention",
        "Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;",
        "onTapCommand",
        "onLongPressCommand",
        "originId",
        "onTapMessageReply-0eiqbug",
        "(JLjava/lang/String;)V",
        "onTapMessageReply",
        "isBurst",
        "onTapReaction-u7_MRrM",
        "(Ljava/lang/String;Lcom/discord/reactions/ReactionView$Reaction;Ljava/lang/Boolean;)V",
        "onTapReaction",
        "roleName",
        "roleIconSource",
        "onTapRoleIcon",
        "onTapSuppressNotificationsIcon",
        "roleId",
        "onTapConnectionsRoleTag",
        "Lcom/discord/chat/bridge/botuikit/SelectComponent;",
        "selectComponent",
        "onTapSelectActionComponent-u7_MRrM",
        "(Ljava/lang/String;JLcom/discord/chat/bridge/botuikit/SelectComponent;)V",
        "onTapSelectActionComponent",
        "timestamp",
        "onTapTimestamp",
        "onTapThreadEmbed-1xi1bu0",
        "(Ljava/lang/String;)V",
        "onTapThreadEmbed",
        "onTapToggleBlockedMessages-1xi1bu0",
        "onTapToggleBlockedMessages",
        "fileId",
        "onTapUploadProgressClose",
        "uploaderId",
        "itemId",
        "onTapCancelUploadItem",
        "onTapUsername-x5gers8",
        "onTapUsername",
        "onWelcomeReplyClicked-Ayv7vGE",
        "onWelcomeReplyClicked",
        "onTapInviteToSpeak-1xi1bu0",
        "onTapInviteToSpeak",
        "onTapJoinActivity-1xi1bu0",
        "onTapJoinActivity",
        "Lcom/discord/chat/bridge/contentnode/EmojiContentNode;",
        "emoji",
        "onTapEmoji",
        "onTapFollowForumPost-pfaIj0E",
        "onTapFollowForumPost",
        "Lcom/discord/primitives/GuildId;",
        "onTapShareForumPost-mgk6anA",
        "(JJ)V",
        "onTapShareForumPost",
        "onTapReactionOverflow-pfaIj0E",
        "onTapReactionOverflow",
        "onTapAutoModerationActions-pfaIj0E",
        "onTapAutoModerationActions",
        "onTapAutoModerationFeedback-pfaIj0E",
        "onTapAutoModerationFeedback",
        "onTapOpTag",
        "onTapSeeMore-1xi1bu0",
        "onTapSeeMore",
        "description",
        "onTapShowAltText",
        "onInitiateReply-pfaIj0E",
        "onInitiateReply",
        "",
        "totalDurationSecs",
        "startDurationSecs",
        "senderUserId",
        "voiceMessagePlaybackStarted-OuNwOLg",
        "(Ljava/lang/String;FFJ)V",
        "voiceMessagePlaybackStarted",
        "endDurationSecs",
        "voiceMessagePlaybackEnded-OuNwOLg",
        "voiceMessagePlaybackEnded",
        "errorMessage",
        "voiceMessagePlaybackFailed-ntcYbpo",
        "(Ljava/lang/String;Ljava/lang/String;)V",
        "voiceMessagePlaybackFailed",
        "embeddedActivityKey",
        "onTapJoinEmbeddedActivity",
        "onTapDismissEmbeddedActivity",
        "onTapActivityLauncherEmbed-uU1mFKc",
        "onTapActivityLauncherEmbed",
        "parentChannelId",
        "threadId",
        "onTapPostPreviewEmbed-JPrav84",
        "onTapPostPreviewEmbed",
        "Lkotlin/Function4;",
        "Lcom/discord/chat/bridge/MediaType;",
        "Lcom/discord/chat/presentation/events/MessageLongPress;",
        "getOnMessageLongPressed",
        "()Lkotlin/jvm/functions/Function4;",
        "onMessageLongPressed",
        "Lkotlin/Function2;",
        "Lcom/discord/chat/presentation/events/MessageTapped;",
        "getOnMessageTapped",
        "()Lkotlin/jvm/functions/Function2;",
        "onMessageTapped",
        "Empty",
        "chat_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# virtual methods
.method public abstract getOnMessageLongPressed()Lkotlin/jvm/functions/Function4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function4<",
            "Lcom/discord/primitives/MessageId;",
            "Lcom/discord/primitives/ChannelId;",
            "Ljava/lang/Integer;",
            "Lcom/discord/chat/bridge/MediaType;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getOnMessageTapped()Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function2<",
            "Lcom/discord/primitives/MessageId;",
            "Lcom/discord/primitives/ChannelId;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end method

.method public abstract onInitiateReply-pfaIj0E(Ljava/lang/String;J)V
.end method

.method public abstract onLinkClicked-ntcYbpo(Ljava/lang/String;Lcom/discord/chat/bridge/contentnode/LinkContentNode;)V
.end method

.method public abstract onLinkClicked-u7_MRrM(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public abstract onLinkLongClicked(Lcom/discord/chat/bridge/contentnode/LinkContentNode;)V
.end method

.method public abstract onLongPressAvatar-x5gers8(Ljava/lang/String;J)V
.end method

.method public abstract onLongPressChannel(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public abstract onLongPressCommand(Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;)V
.end method

.method public abstract onLongPressReaction-Eqy5D80(Ljava/lang/String;JLcom/discord/reactions/ReactionView$Reaction;)V
.end method

.method public abstract onLongPressUsername-x5gers8(Ljava/lang/String;J)V
.end method

.method public abstract onScrollStateChanged(Lcom/discord/chat/presentation/list/ScrollState;)V
.end method

.method public abstract onStickerClicked-Ayv7vGE(Lcom/discord/chat/bridge/sticker/Sticker;Ljava/lang/String;)V
.end method

.method public abstract onStickerLongClicked-Ayv7vGE(Lcom/discord/chat/bridge/sticker/Sticker;Ljava/lang/String;)V
.end method

.method public abstract onTapActivityLauncherEmbed-uU1mFKc(JJ)V
.end method

.method public abstract onTapAutoModerationActions-pfaIj0E(Ljava/lang/String;J)V
.end method

.method public abstract onTapAutoModerationFeedback-pfaIj0E(Ljava/lang/String;J)V
.end method

.method public abstract onTapAvatar-x5gers8(Ljava/lang/String;J)V
.end method

.method public abstract onTapButtonActionComponent-NkFJqEg(Ljava/lang/String;JLjava/lang/String;J[I)V
.end method

.method public abstract onTapCall-pfaIj0E(Ljava/lang/String;J)V
.end method

.method public abstract onTapCancelUploadItem(Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public abstract onTapChannel(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public abstract onTapCommand(Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;)V
.end method

.method public abstract onTapConnectionsRoleTag(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public abstract onTapCopyText(Ljava/lang/CharSequence;)V
.end method

.method public abstract onTapDismissEmbeddedActivity(Ljava/lang/String;)V
.end method

.method public abstract onTapEmoji(Lcom/discord/chat/bridge/contentnode/EmojiContentNode;)V
.end method

.method public abstract onTapFollowForumPost-pfaIj0E(Ljava/lang/String;J)V
.end method

.method public abstract onTapGiftCodeAccept(Ljava/lang/String;)V
.end method

.method public abstract onTapGiftCodeEmbed(Ljava/lang/String;)V
.end method

.method public abstract onTapImage-a6FnO-k(Ljava/lang/String;ILjava/lang/String;IIIILcom/discord/chat/reactevents/ViewResizeMode;Ljava/lang/Double;Ljava/lang/Integer;)V
.end method

.method public abstract onTapInviteEmbed-AFFcxXc(Ljava/lang/String;ILjava/lang/Boolean;Ljava/lang/Boolean;)V
.end method

.method public abstract onTapInviteToSpeak-1xi1bu0(Ljava/lang/String;)V
.end method

.method public abstract onTapJoinActivity-1xi1bu0(Ljava/lang/String;)V
.end method

.method public abstract onTapJoinEmbeddedActivity(Ljava/lang/String;)V
.end method

.method public abstract onTapLoadMessagesAfter()V
.end method

.method public abstract onTapLoadMessagesBefore()V
.end method

.method public abstract onTapMention(Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public abstract onTapMessageReply-0eiqbug(JLjava/lang/String;)V
.end method

.method public abstract onTapOpTag()V
.end method

.method public abstract onTapPostPreviewEmbed-JPrav84(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public abstract onTapReaction-u7_MRrM(Ljava/lang/String;Lcom/discord/reactions/ReactionView$Reaction;Ljava/lang/Boolean;)V
.end method

.method public abstract onTapReactionOverflow-pfaIj0E(Ljava/lang/String;J)V
.end method

.method public abstract onTapRoleIcon(Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public abstract onTapSeeMore-1xi1bu0(Ljava/lang/String;)V
.end method

.method public abstract onTapSelectActionComponent-u7_MRrM(Ljava/lang/String;JLcom/discord/chat/bridge/botuikit/SelectComponent;)V
.end method

.method public abstract onTapShareForumPost-mgk6anA(JJ)V
.end method

.method public abstract onTapShowAltText(Ljava/lang/String;)V
.end method

.method public abstract onTapSuppressNotificationsIcon()V
.end method

.method public abstract onTapThreadEmbed-1xi1bu0(Ljava/lang/String;)V
.end method

.method public abstract onTapTimestamp(Ljava/lang/String;)V
.end method

.method public abstract onTapToggleBlockedMessages-1xi1bu0(Ljava/lang/String;)V
.end method

.method public abstract onTapUploadProgressClose(Ljava/lang/String;)V
.end method

.method public abstract onTapUsername-x5gers8(Ljava/lang/String;J)V
.end method

.method public abstract onWelcomeReplyClicked-Ayv7vGE(Lcom/discord/chat/bridge/sticker/Sticker;Ljava/lang/String;)V
.end method

.method public abstract voiceMessagePlaybackEnded-OuNwOLg(Ljava/lang/String;FFJ)V
.end method

.method public abstract voiceMessagePlaybackFailed-ntcYbpo(Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public abstract voiceMessagePlaybackStarted-OuNwOLg(Ljava/lang/String;FFJ)V
.end method
