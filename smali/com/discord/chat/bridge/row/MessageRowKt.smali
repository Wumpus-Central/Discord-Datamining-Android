.class public final Lcom/discord/chat/bridge/row/MessageRowKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aY\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\n\u001a\u00020\u00082\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u000c2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0002\u0010\u000f\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "toChatListMessageItem",
        "Lcom/discord/chat/presentation/list/item/ChatListItem;",
        "Lcom/discord/chat/bridge/MessageBase;",
        "messageFrame",
        "Lcom/discord/chat/bridge/messageframe/MessageFrame;",
        "messageContext",
        "Lcom/discord/chat/presentation/root/MessageContext;",
        "allowChildGestures",
        "",
        "isHighlight",
        "renderContentOnly",
        "reactTag",
        "",
        "backgroundHighlight",
        "Lcom/discord/chat/bridge/BackgroundHighlight;",
        "(Lcom/discord/chat/bridge/MessageBase;Lcom/discord/chat/bridge/messageframe/MessageFrame;Lcom/discord/chat/presentation/root/MessageContext;ZZZLjava/lang/Integer;Lcom/discord/chat/bridge/BackgroundHighlight;)Lcom/discord/chat/presentation/list/item/ChatListItem;",
        "Lcom/discord/chat/bridge/row/MessageRow;",
        "chat_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final toChatListMessageItem(Lcom/discord/chat/bridge/MessageBase;Lcom/discord/chat/bridge/messageframe/MessageFrame;Lcom/discord/chat/presentation/root/MessageContext;ZZZLjava/lang/Integer;Lcom/discord/chat/bridge/BackgroundHighlight;)Lcom/discord/chat/presentation/list/item/ChatListItem;
    .locals 10

    move-object v0, p0

    move-object v3, p2

    const-string v1, "<this>"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "messageContext"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    instance-of v1, v0, Lcom/discord/chat/bridge/Message;

    if-eqz v1, :cond_3

    .line 11
    move-object v1, v0

    check-cast v1, Lcom/discord/chat/bridge/Message;

    invoke-static {v1}, Lcom/discord/chat/bridge/MessageKt;->isSystemMessage(Lcom/discord/chat/bridge/Message;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 12
    invoke-static {v1}, Lcom/discord/chat/bridge/MessageKt;->isCallMessage(Lcom/discord/chat/bridge/Message;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/discord/chat/presentation/list/item/CallSystemMessageItem;

    invoke-direct {v0, v1}, Lcom/discord/chat/presentation/list/item/CallSystemMessageItem;-><init>(Lcom/discord/chat/bridge/Message;)V

    goto :goto_0

    .line 13
    :cond_0
    new-instance v0, Lcom/discord/chat/presentation/list/item/SystemMessageItem;

    move-object/from16 v6, p7

    invoke-direct {v0, v1, p2, v6}, Lcom/discord/chat/presentation/list/item/SystemMessageItem;-><init>(Lcom/discord/chat/bridge/Message;Lcom/discord/chat/presentation/root/MessageContext;Lcom/discord/chat/bridge/BackgroundHighlight;)V

    goto :goto_0

    :cond_1
    move-object/from16 v6, p7

    .line 14
    invoke-static {v1}, Lcom/discord/chat/bridge/MessageKt;->isAutomodSystemMessage(Lcom/discord/chat/bridge/Message;)Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Lcom/discord/chat/presentation/list/item/AutomodSystemMessageItem;

    move v4, p3

    invoke-direct {v0, v1, p2, p3}, Lcom/discord/chat/presentation/list/item/AutomodSystemMessageItem;-><init>(Lcom/discord/chat/bridge/Message;Lcom/discord/chat/presentation/root/MessageContext;Z)V

    goto :goto_0

    :cond_2
    move v4, p3

    .line 15
    new-instance v9, Lcom/discord/chat/presentation/list/item/MessageItem;

    move-object v0, v9

    move-object v2, p1

    move-object v3, p2

    move v5, p4

    move-object/from16 v6, p7

    move-object/from16 v7, p6

    move v8, p5

    invoke-direct/range {v0 .. v8}, Lcom/discord/chat/presentation/list/item/MessageItem;-><init>(Lcom/discord/chat/bridge/Message;Lcom/discord/chat/bridge/messageframe/MessageFrame;Lcom/discord/chat/presentation/root/MessageContext;ZZLcom/discord/chat/bridge/BackgroundHighlight;Ljava/lang/Integer;Z)V

    goto :goto_0

    .line 16
    :cond_3
    instance-of v1, v0, Lcom/discord/chat/bridge/ErrorMessage;

    if-eqz v1, :cond_4

    new-instance v1, Lcom/discord/chat/presentation/list/item/DeserializationErrorMessageItem;

    check-cast v0, Lcom/discord/chat/bridge/ErrorMessage;

    invoke-direct {v1, v0}, Lcom/discord/chat/presentation/list/item/DeserializationErrorMessageItem;-><init>(Lcom/discord/chat/bridge/ErrorMessage;)V

    move-object v0, v1

    :goto_0
    return-object v0

    :cond_4
    new-instance v0, Llf/q;

    invoke-direct {v0}, Llf/q;-><init>()V

    throw v0
.end method

.method public static final toChatListMessageItem(Lcom/discord/chat/bridge/row/MessageRow;)Lcom/discord/chat/presentation/list/item/ChatListItem;
    .locals 9

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Lcom/discord/chat/bridge/row/MessageRow;->getMessage()Lcom/discord/chat/bridge/MessageBase;

    move-result-object v1

    .line 2
    invoke-virtual {p0}, Lcom/discord/chat/bridge/row/MessageRow;->getMessageFrame()Lcom/discord/chat/bridge/messageframe/MessageFrame;

    move-result-object v2

    .line 3
    invoke-virtual {p0}, Lcom/discord/chat/bridge/row/MessageRow;->getMessageFrame()Lcom/discord/chat/bridge/messageframe/MessageFrame;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/discord/chat/bridge/messageframe/MessageFrame;->getType()Lcom/discord/chat/bridge/messageframe/MessageFrameType;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sget-object v3, Lcom/discord/chat/bridge/messageframe/MessageFrameType;->JUMP_MESSAGE_FRAME:Lcom/discord/chat/bridge/messageframe/MessageFrameType;

    if-eq v0, v3, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    move v4, v0

    .line 4
    invoke-static {p0}, Lcom/discord/chat/presentation/root/MessageContextKt;->getMessageContext(Lcom/discord/chat/bridge/row/MessageRow;)Lcom/discord/chat/presentation/root/MessageContext;

    move-result-object v3

    .line 5
    invoke-virtual {p0}, Lcom/discord/chat/bridge/row/MessageRow;->isHighlight()Z

    move-result v5

    .line 6
    invoke-virtual {p0}, Lcom/discord/chat/bridge/row/MessageRow;->getRenderContentOnly()Z

    move-result v6

    .line 7
    invoke-virtual {p0}, Lcom/discord/chat/bridge/row/MessageRow;->getReactTag()Ljava/lang/Integer;

    move-result-object v7

    .line 8
    invoke-virtual {p0}, Lcom/discord/chat/bridge/row/MessageRow;->getBackgroundHighlight()Lcom/discord/chat/bridge/BackgroundHighlight;

    move-result-object v8

    .line 9
    invoke-static/range {v1 .. v8}, Lcom/discord/chat/bridge/row/MessageRowKt;->toChatListMessageItem(Lcom/discord/chat/bridge/MessageBase;Lcom/discord/chat/bridge/messageframe/MessageFrame;Lcom/discord/chat/presentation/root/MessageContext;ZZZLjava/lang/Integer;Lcom/discord/chat/bridge/BackgroundHighlight;)Lcom/discord/chat/presentation/list/item/ChatListItem;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic toChatListMessageItem$default(Lcom/discord/chat/bridge/MessageBase;Lcom/discord/chat/bridge/messageframe/MessageFrame;Lcom/discord/chat/presentation/root/MessageContext;ZZZLjava/lang/Integer;Lcom/discord/chat/bridge/BackgroundHighlight;ILjava/lang/Object;)Lcom/discord/chat/presentation/list/item/ChatListItem;
    .locals 10

    and-int/lit8 v0, p8, 0x1

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v3, v1

    goto :goto_0

    :cond_0
    move-object v3, p1

    :goto_0
    and-int/lit8 v0, p8, 0x4

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    move v5, v0

    goto :goto_1

    :cond_1
    move v5, p3

    :goto_1
    and-int/lit8 v0, p8, 0x8

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    move v6, v2

    goto :goto_2

    :cond_2
    move v6, p4

    :goto_2
    and-int/lit8 v0, p8, 0x10

    if-eqz v0, :cond_3

    move v7, v2

    goto :goto_3

    :cond_3
    move v7, p5

    :goto_3
    and-int/lit8 v0, p8, 0x20

    if-eqz v0, :cond_4

    move-object v8, v1

    goto :goto_4

    :cond_4
    move-object/from16 v8, p6

    :goto_4
    and-int/lit8 v0, p8, 0x40

    if-eqz v0, :cond_5

    move-object v9, v1

    goto :goto_5

    :cond_5
    move-object/from16 v9, p7

    :goto_5
    move-object v2, p0

    move-object v4, p2

    invoke-static/range {v2 .. v9}, Lcom/discord/chat/bridge/row/MessageRowKt;->toChatListMessageItem(Lcom/discord/chat/bridge/MessageBase;Lcom/discord/chat/bridge/messageframe/MessageFrame;Lcom/discord/chat/presentation/root/MessageContext;ZZZLjava/lang/Integer;Lcom/discord/chat/bridge/BackgroundHighlight;)Lcom/discord/chat/presentation/list/item/ChatListItem;

    move-result-object v0

    return-object v0
.end method
