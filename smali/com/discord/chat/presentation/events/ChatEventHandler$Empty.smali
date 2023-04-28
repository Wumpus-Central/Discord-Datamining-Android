.class public final Lcom/discord/chat/presentation/events/ChatEventHandler$Empty;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/discord/chat/presentation/events/ChatEventHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/discord/chat/presentation/events/ChatEventHandler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Empty"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00be\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0001\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u0015\n\u0002\u0008\r\n\u0002\u0010\r\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0012\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0015\n\u0002\u0010\u0007\n\u0002\u0008\u000c\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J%\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000eH\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J%\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J/\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\u0016\u001a\u00020\u00172\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J%\u0010\u001c\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u001f\u0010\u0010J.\u0010 \u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00172\u0008\u0010!\u001a\u0004\u0018\u00010\u00172\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u00172\u0008\u0010\"\u001a\u0004\u0018\u00010\u0017H\u0016J\u0010\u0010#\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020$H\u0016J/\u0010%\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000e2\u0008\u0010&\u001a\u0004\u0018\u00010\'H\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008(\u0010)J%\u0010*\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008+\u0010\u0010J\u0010\u0010,\u001a\u00020\n2\u0006\u0010-\u001a\u00020.H\u0016J%\u0010/\u001a\u00020\n2\u0006\u00100\u001a\u0002012\u0006\u0010\u000b\u001a\u00020\u000cH\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u00082\u00103J%\u00104\u001a\u00020\n2\u0006\u00100\u001a\u0002012\u0006\u0010\u000b\u001a\u00020\u000cH\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u00085\u00103J%\u00106\u001a\u00020\n2\u0006\u00107\u001a\u0002082\u0006\u0010\r\u001a\u00020\u000eH\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u00089\u0010:J%\u0010;\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000eH\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008<\u0010\u0010J%\u0010=\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000eH\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008>\u0010\u0010J%\u0010?\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008@\u0010\u0010J?\u0010A\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010B\u001a\u00020C2\u0008\u0010D\u001a\u0004\u0018\u00010\u00172\u0006\u00107\u001a\u0002082\u0006\u0010E\u001a\u00020FH\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008G\u0010HJ%\u0010I\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000eH\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008J\u0010\u0010J\u0018\u0010K\u001a\u00020\n2\u0006\u0010L\u001a\u00020\u00172\u0006\u0010M\u001a\u00020\u0017H\u0016J$\u0010N\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00172\u0008\u0010!\u001a\u0004\u0018\u00010\u00172\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0017H\u0016J\u0010\u0010O\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020$H\u0016J(\u0010P\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\u00172\u0006\u0010Q\u001a\u00020\u0017H\u0016J\u0010\u0010R\u001a\u00020\n2\u0006\u0010S\u001a\u00020TH\u0016J\u0010\u0010U\u001a\u00020\n2\u0006\u0010V\u001a\u00020\u0017H\u0016J\u0010\u0010W\u001a\u00020\n2\u0006\u0010X\u001a\u00020YH\u0016J%\u0010Z\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000eH\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008[\u0010\u0010J\u0010\u0010\\\u001a\u00020\n2\u0006\u0010]\u001a\u00020\u0017H\u0016J\u0010\u0010^\u001a\u00020\n2\u0006\u0010]\u001a\u00020\u0017H\u0016Ji\u0010_\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010`\u001a\u00020a2\u0006\u0010b\u001a\u00020\u00172\u0006\u0010c\u001a\u00020a2\u0006\u0010d\u001a\u00020a2\u0006\u0010e\u001a\u00020a2\u0006\u0010f\u001a\u00020a2\u0006\u0010g\u001a\u00020h2\u0008\u0010i\u001a\u0004\u0018\u00010j2\u0008\u0010k\u001a\u0004\u0018\u00010aH\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008l\u0010mJ9\u0010n\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010o\u001a\u00020a2\u0008\u0010p\u001a\u0004\u0018\u00010q2\u0008\u0010r\u001a\u0004\u0018\u00010qH\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008s\u0010tJ\u001d\u0010u\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000cH\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008v\u0010wJ\u001d\u0010x\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000cH\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008y\u0010wJ\u0010\u0010z\u001a\u00020\n2\u0006\u0010V\u001a\u00020\u0017H\u0016J\u0008\u0010{\u001a\u00020\nH\u0016J\u0008\u0010|\u001a\u00020\nH\u0016J\u0018\u0010}\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\u0017H\u0016J\'\u0010~\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u007f\u001a\u00020\u000cH\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0006\u0008\u0080\u0001\u0010\u0081\u0001J\t\u0010\u0082\u0001\u001a\u00020\nH\u0016J;\u0010\u0083\u0001\u001a\u00020\n2\u0007\u0010!\u001a\u00030\u0084\u00012\u0007\u0010\u0085\u0001\u001a\u00020\u000e2\u0007\u0010\u0086\u0001\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u000cH\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0006\u0008\u0087\u0001\u0010\u0088\u0001J5\u0010\u0089\u0001\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000c2\u0008\u0010&\u001a\u0004\u0018\u00010\'2\t\u0010\u008a\u0001\u001a\u0004\u0018\u00010qH\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0006\u0008\u008b\u0001\u0010\u008c\u0001J\'\u0010\u008d\u0001\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000eH\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0005\u0008\u008e\u0001\u0010\u0010J\u001b\u0010\u008f\u0001\u001a\u00020\n2\u0007\u0010\u0090\u0001\u001a\u00020\u00172\u0007\u0010\u0091\u0001\u001a\u00020\u0017H\u0016J\u001f\u0010\u0092\u0001\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000cH\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0005\u0008\u0093\u0001\u0010wJ2\u0010\u0094\u0001\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010B\u001a\u00020C2\u0008\u0010\u0095\u0001\u001a\u00030\u0096\u0001H\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0006\u0008\u0097\u0001\u0010\u0098\u0001J(\u0010\u0099\u0001\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0007\u0010!\u001a\u00030\u0084\u0001H\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0005\u0008\u009a\u0001\u0010:J\u0012\u0010\u009b\u0001\u001a\u00020\n2\u0007\u0010\u009c\u0001\u001a\u00020\u0017H\u0016J\t\u0010\u009d\u0001\u001a\u00020\nH\u0016J\u001f\u0010\u009e\u0001\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000cH\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0005\u0008\u009f\u0001\u0010wJ\u0012\u0010\u00a0\u0001\u001a\u00020\n2\u0007\u0010\u00a1\u0001\u001a\u00020\u0017H\u0016J\u001f\u0010\u00a2\u0001\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000cH\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0005\u0008\u00a3\u0001\u0010wJ\u0012\u0010\u00a4\u0001\u001a\u00020\n2\u0007\u0010\u00a5\u0001\u001a\u00020\u0017H\u0016J\'\u0010\u00a6\u0001\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0005\u0008\u00a7\u0001\u0010\u0010J\'\u0010\u00a8\u0001\u001a\u00020\n2\u0006\u00100\u001a\u0002012\u0006\u0010\u000b\u001a\u00020\u000cH\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0005\u0008\u00a9\u0001\u00103J=\u0010\u00aa\u0001\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000c2\u0008\u0010\u00ab\u0001\u001a\u00030\u00ac\u00012\u0008\u0010\u00ad\u0001\u001a\u00030\u00ac\u00012\u0007\u0010\u00ae\u0001\u001a\u00020\u001eH\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0006\u0008\u00af\u0001\u0010\u00b0\u0001J+\u0010\u00b1\u0001\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000c2\t\u0010\u00b2\u0001\u001a\u0004\u0018\u00010\u0017H\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0006\u0008\u00b3\u0001\u0010\u00b4\u0001J=\u0010\u00b5\u0001\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000c2\u0008\u0010\u00ab\u0001\u001a\u00030\u00ac\u00012\u0008\u0010\u00b6\u0001\u001a\u00030\u00ac\u00012\u0007\u0010\u00ae\u0001\u001a\u00020\u001eH\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0006\u0008\u00b7\u0001\u0010\u00b0\u0001R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\u0006\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\u00b8\u0001"
    }
    d2 = {
        "Lcom/discord/chat/presentation/events/ChatEventHandler$Empty;",
        "Lcom/discord/chat/presentation/events/ChatEventHandler;",
        "()V",
        "onMessageLongPressed",
        "",
        "getOnMessageLongPressed",
        "()Ljava/lang/Void;",
        "onMessageTapped",
        "getOnMessageTapped",
        "onInitiateReply",
        "",
        "messageId",
        "Lcom/discord/primitives/MessageId;",
        "channelId",
        "Lcom/discord/primitives/ChannelId;",
        "onInitiateReply-pfaIj0E",
        "(Ljava/lang/String;J)V",
        "onLinkClicked",
        "node",
        "Lcom/discord/chat/bridge/contentnode/LinkContentNode;",
        "onLinkClicked-ntcYbpo",
        "(Ljava/lang/String;Lcom/discord/chat/bridge/contentnode/LinkContentNode;)V",
        "url",
        "",
        "title",
        "onLinkClicked-u7_MRrM",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "onLinkLongClicked",
        "onLongPressAvatar",
        "userId",
        "Lcom/discord/primitives/UserId;",
        "onLongPressAvatar-x5gers8",
        "onLongPressChannel",
        "guildId",
        "originalLink",
        "onLongPressCommand",
        "Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;",
        "onLongPressReaction",
        "reaction",
        "Lcom/discord/reactions/ReactionView$Reaction;",
        "onLongPressReaction-Eqy5D80",
        "(Ljava/lang/String;JLcom/discord/reactions/ReactionView$Reaction;)V",
        "onLongPressUsername",
        "onLongPressUsername-x5gers8",
        "onScrollStateChanged",
        "scrollState",
        "Lcom/discord/chat/presentation/list/ScrollState;",
        "onStickerClicked",
        "sticker",
        "Lcom/discord/chat/bridge/sticker/Sticker;",
        "onStickerClicked-Ayv7vGE",
        "(Lcom/discord/chat/bridge/sticker/Sticker;Ljava/lang/String;)V",
        "onStickerLongClicked",
        "onStickerLongClicked-Ayv7vGE",
        "onTapActivityLauncherEmbed",
        "applicationId",
        "Lcom/discord/primitives/ApplicationId;",
        "onTapActivityLauncherEmbed-uU1mFKc",
        "(JJ)V",
        "onTapAutoModerationActions",
        "onTapAutoModerationActions-pfaIj0E",
        "onTapAutoModerationFeedback",
        "onTapAutoModerationFeedback-pfaIj0E",
        "onTapAvatar",
        "onTapAvatar-x5gers8",
        "onTapButtonActionComponent",
        "messageFlags",
        "",
        "customId",
        "indices",
        "",
        "onTapButtonActionComponent-NkFJqEg",
        "(Ljava/lang/String;JLjava/lang/String;J[I)V",
        "onTapCall",
        "onTapCall-pfaIj0E",
        "onTapCancelUploadItem",
        "uploaderId",
        "itemId",
        "onTapChannel",
        "onTapCommand",
        "onTapConnectionsRoleTag",
        "roleId",
        "onTapCopyText",
        "text",
        "",
        "onTapDismissEmbeddedActivity",
        "embeddedActivityKey",
        "onTapEmoji",
        "emoji",
        "Lcom/discord/chat/bridge/contentnode/EmojiContentNode;",
        "onTapFollowForumPost",
        "onTapFollowForumPost-pfaIj0E",
        "onTapGiftCodeAccept",
        "giftCode",
        "onTapGiftCodeEmbed",
        "onTapImage",
        "attachmentIndex",
        "",
        "type",
        "viewWidth",
        "viewHeight",
        "viewX",
        "viewY",
        "viewResizeMode",
        "Lcom/discord/chat/reactevents/ViewResizeMode;",
        "portal",
        "",
        "embedIndex",
        "onTapImage-a6FnO-k",
        "(Ljava/lang/String;ILjava/lang/String;IIIILcom/discord/chat/reactevents/ViewResizeMode;Ljava/lang/Double;Ljava/lang/Integer;)V",
        "onTapInviteEmbed",
        "index",
        "primary",
        "",
        "secondary",
        "onTapInviteEmbed-AFFcxXc",
        "(Ljava/lang/String;ILjava/lang/Boolean;Ljava/lang/Boolean;)V",
        "onTapInviteToSpeak",
        "onTapInviteToSpeak-1xi1bu0",
        "(Ljava/lang/String;)V",
        "onTapJoinActivity",
        "onTapJoinActivity-1xi1bu0",
        "onTapJoinEmbeddedActivity",
        "onTapLoadMessagesAfter",
        "onTapLoadMessagesBefore",
        "onTapMention",
        "onTapMessageReply",
        "originId",
        "onTapMessageReply-0eiqbug",
        "(JLjava/lang/String;)V",
        "onTapOpTag",
        "onTapPostPreviewEmbed",
        "Lcom/discord/primitives/GuildId;",
        "parentChannelId",
        "threadId",
        "onTapPostPreviewEmbed-kUTrp-s",
        "(JJJLjava/lang/String;)V",
        "onTapReaction",
        "isBurst",
        "onTapReaction-u7_MRrM",
        "(Ljava/lang/String;Lcom/discord/reactions/ReactionView$Reaction;Ljava/lang/Boolean;)V",
        "onTapReactionOverflow",
        "onTapReactionOverflow-pfaIj0E",
        "onTapRoleIcon",
        "roleName",
        "roleIconSource",
        "onTapSeeMore",
        "onTapSeeMore-1xi1bu0",
        "onTapSelectActionComponent",
        "selectComponent",
        "Lcom/discord/chat/bridge/botuikit/SelectComponent;",
        "onTapSelectActionComponent-u7_MRrM",
        "(Ljava/lang/String;JLcom/discord/chat/bridge/botuikit/SelectComponent;)V",
        "onTapShareForumPost",
        "onTapShareForumPost-mgk6anA",
        "onTapShowAltText",
        "description",
        "onTapSuppressNotificationsIcon",
        "onTapThreadEmbed",
        "onTapThreadEmbed-1xi1bu0",
        "onTapTimestamp",
        "timestamp",
        "onTapToggleBlockedMessages",
        "onTapToggleBlockedMessages-1xi1bu0",
        "onTapUploadProgressClose",
        "fileId",
        "onTapUsername",
        "onTapUsername-x5gers8",
        "onWelcomeReplyClicked",
        "onWelcomeReplyClicked-Ayv7vGE",
        "voiceMessagePlaybackEnded",
        "totalDurationSecs",
        "",
        "endDurationSecs",
        "senderUserId",
        "voiceMessagePlaybackEnded-OuNwOLg",
        "(Ljava/lang/String;FFJ)V",
        "voiceMessagePlaybackFailed",
        "errorMessage",
        "voiceMessagePlaybackFailed-ntcYbpo",
        "(Ljava/lang/String;Ljava/lang/String;)V",
        "voiceMessagePlaybackStarted",
        "startDurationSecs",
        "voiceMessagePlaybackStarted-OuNwOLg",
        "chat_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lcom/discord/chat/presentation/events/ChatEventHandler$Empty;

.field private static final onMessageLongPressed:Ljava/lang/Void;

.field private static final onMessageTapped:Ljava/lang/Void;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/discord/chat/presentation/events/ChatEventHandler$Empty;

    invoke-direct {v0}, Lcom/discord/chat/presentation/events/ChatEventHandler$Empty;-><init>()V

    sput-object v0, Lcom/discord/chat/presentation/events/ChatEventHandler$Empty;->INSTANCE:Lcom/discord/chat/presentation/events/ChatEventHandler$Empty;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getOnMessageLongPressed()Ljava/lang/Void;
    .locals 1

    .line 2
    sget-object v0, Lcom/discord/chat/presentation/events/ChatEventHandler$Empty;->onMessageLongPressed:Ljava/lang/Void;

    return-object v0
.end method

.method public bridge synthetic getOnMessageLongPressed()Lkotlin/jvm/functions/Function4;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/discord/chat/presentation/events/ChatEventHandler$Empty;->getOnMessageLongPressed()Ljava/lang/Void;

    move-result-object v0

    check-cast v0, Lkotlin/jvm/functions/Function4;

    return-object v0
.end method

.method public getOnMessageTapped()Ljava/lang/Void;
    .locals 1

    .line 2
    sget-object v0, Lcom/discord/chat/presentation/events/ChatEventHandler$Empty;->onMessageTapped:Ljava/lang/Void;

    return-object v0
.end method

.method public bridge synthetic getOnMessageTapped()Lkotlin/jvm/functions/Function2;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/discord/chat/presentation/events/ChatEventHandler$Empty;->getOnMessageTapped()Ljava/lang/Void;

    move-result-object v0

    check-cast v0, Lkotlin/jvm/functions/Function2;

    return-object v0
.end method

.method public onInitiateReply-pfaIj0E(Ljava/lang/String;J)V
    .locals 0

    const-string p2, "messageId"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onLinkClicked-ntcYbpo(Ljava/lang/String;Lcom/discord/chat/bridge/contentnode/LinkContentNode;)V
    .locals 1

    const-string v0, "messageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "node"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onLinkClicked-u7_MRrM(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    const-string p3, "messageId"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "url"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onLinkLongClicked(Lcom/discord/chat/bridge/contentnode/LinkContentNode;)V
    .locals 1

    const-string v0, "node"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onLongPressAvatar-x5gers8(Ljava/lang/String;J)V
    .locals 0

    const-string p2, "messageId"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onLongPressChannel(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    const-string p2, "channelId"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onLongPressCommand(Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;)V
    .locals 1

    const-string v0, "node"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onLongPressReaction-Eqy5D80(Ljava/lang/String;JLcom/discord/reactions/ReactionView$Reaction;)V
    .locals 0

    const-string p2, "messageId"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onLongPressUsername-x5gers8(Ljava/lang/String;J)V
    .locals 0

    const-string p2, "messageId"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onScrollStateChanged(Lcom/discord/chat/presentation/list/ScrollState;)V
    .locals 1

    const-string v0, "scrollState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onStickerClicked-Ayv7vGE(Lcom/discord/chat/bridge/sticker/Sticker;Ljava/lang/String;)V
    .locals 1

    const-string v0, "sticker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "messageId"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onStickerLongClicked-Ayv7vGE(Lcom/discord/chat/bridge/sticker/Sticker;Ljava/lang/String;)V
    .locals 1

    const-string v0, "sticker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "messageId"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onTapActivityLauncherEmbed-uU1mFKc(JJ)V
    .locals 0

    return-void
.end method

.method public onTapAutoModerationActions-pfaIj0E(Ljava/lang/String;J)V
    .locals 0

    const-string p2, "messageId"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onTapAutoModerationFeedback-pfaIj0E(Ljava/lang/String;J)V
    .locals 0

    const-string p2, "messageId"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onTapAvatar-x5gers8(Ljava/lang/String;J)V
    .locals 0

    const-string p2, "messageId"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onTapButtonActionComponent-NkFJqEg(Ljava/lang/String;JLjava/lang/String;J[I)V
    .locals 0

    const-string p2, "messageId"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "indices"

    invoke-static {p7, p1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onTapCall-pfaIj0E(Ljava/lang/String;J)V
    .locals 0

    const-string p2, "messageId"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onTapCancelUploadItem(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "uploaderId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "itemId"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onTapChannel(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    const-string p2, "channelId"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onTapCommand(Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;)V
    .locals 1

    const-string v0, "node"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onTapConnectionsRoleTag(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "userId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "guildId"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "channelId"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "roleId"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onTapCopyText(Ljava/lang/CharSequence;)V
    .locals 1

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onTapDismissEmbeddedActivity(Ljava/lang/String;)V
    .locals 1

    const-string v0, "embeddedActivityKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onTapEmoji(Lcom/discord/chat/bridge/contentnode/EmojiContentNode;)V
    .locals 1

    const-string v0, "emoji"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onTapFollowForumPost-pfaIj0E(Ljava/lang/String;J)V
    .locals 0

    const-string p2, "messageId"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onTapGiftCodeAccept(Ljava/lang/String;)V
    .locals 1

    const-string v0, "giftCode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onTapGiftCodeEmbed(Ljava/lang/String;)V
    .locals 1

    const-string v0, "giftCode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onTapImage-a6FnO-k(Ljava/lang/String;ILjava/lang/String;IIIILcom/discord/chat/reactevents/ViewResizeMode;Ljava/lang/Double;Ljava/lang/Integer;)V
    .locals 0

    const-string p2, "messageId"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "type"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "viewResizeMode"

    invoke-static {p8, p1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onTapInviteEmbed-AFFcxXc(Ljava/lang/String;ILjava/lang/Boolean;Ljava/lang/Boolean;)V
    .locals 0

    const-string p2, "messageId"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onTapInviteToSpeak-1xi1bu0(Ljava/lang/String;)V
    .locals 1

    const-string v0, "messageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onTapJoinActivity-1xi1bu0(Ljava/lang/String;)V
    .locals 1

    const-string v0, "messageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onTapJoinEmbeddedActivity(Ljava/lang/String;)V
    .locals 1

    const-string v0, "embeddedActivityKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onTapLoadMessagesAfter()V
    .locals 0

    return-void
.end method

.method public onTapLoadMessagesBefore()V
    .locals 0

    return-void
.end method

.method public onTapMention(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "userId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "channelId"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onTapMessageReply-0eiqbug(JLjava/lang/String;)V
    .locals 0

    const-string p1, "originId"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onTapOpTag()V
    .locals 0

    return-void
.end method

.method public onTapPostPreviewEmbed-kUTrp-s(JJJLjava/lang/String;)V
    .locals 0

    const-string p1, "messageId"

    invoke-static {p7, p1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onTapReaction-u7_MRrM(Ljava/lang/String;Lcom/discord/reactions/ReactionView$Reaction;Ljava/lang/Boolean;)V
    .locals 0

    const-string p2, "messageId"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onTapReactionOverflow-pfaIj0E(Ljava/lang/String;J)V
    .locals 0

    const-string p2, "messageId"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onTapRoleIcon(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "roleName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "roleIconSource"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onTapSeeMore-1xi1bu0(Ljava/lang/String;)V
    .locals 1

    const-string v0, "messageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onTapSelectActionComponent-u7_MRrM(Ljava/lang/String;JLcom/discord/chat/bridge/botuikit/SelectComponent;)V
    .locals 0

    const-string p2, "messageId"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "selectComponent"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onTapShareForumPost-mgk6anA(JJ)V
    .locals 0

    return-void
.end method

.method public onTapShowAltText(Ljava/lang/String;)V
    .locals 1

    const-string v0, "description"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onTapSuppressNotificationsIcon()V
    .locals 0

    return-void
.end method

.method public onTapThreadEmbed-1xi1bu0(Ljava/lang/String;)V
    .locals 1

    const-string v0, "messageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onTapTimestamp(Ljava/lang/String;)V
    .locals 1

    const-string v0, "timestamp"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onTapToggleBlockedMessages-1xi1bu0(Ljava/lang/String;)V
    .locals 1

    const-string v0, "messageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onTapUploadProgressClose(Ljava/lang/String;)V
    .locals 1

    const-string v0, "fileId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onTapUsername-x5gers8(Ljava/lang/String;J)V
    .locals 0

    const-string p2, "messageId"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onWelcomeReplyClicked-Ayv7vGE(Lcom/discord/chat/bridge/sticker/Sticker;Ljava/lang/String;)V
    .locals 1

    const-string v0, "sticker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "messageId"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public voiceMessagePlaybackEnded-OuNwOLg(Ljava/lang/String;FFJ)V
    .locals 0

    const-string p2, "messageId"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public voiceMessagePlaybackFailed-ntcYbpo(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    const-string p2, "messageId"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public voiceMessagePlaybackStarted-OuNwOLg(Ljava/lang/String;FFJ)V
    .locals 0

    const-string p2, "messageId"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
