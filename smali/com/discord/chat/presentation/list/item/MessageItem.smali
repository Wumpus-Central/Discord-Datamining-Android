.class public final Lcom/discord/chat/presentation/list/item/MessageItem;
.super Lcom/discord/chat/presentation/list/item/ChatListItem;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u001c\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\t\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\t\u00a2\u0006\u0002\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010!\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\"\u001a\u00020\tH\u00c6\u0003J\t\u0010#\u001a\u00020\tH\u00c6\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001cJ\t\u0010&\u001a\u00020\tH\u00c6\u0003Jd\u0010\'\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u000c2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\tH\u00c6\u0001\u00a2\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020\t2\u0008\u0010*\u001a\u0004\u0018\u00010+H\u00d6\u0003J\t\u0010,\u001a\u00020\u000eH\u00d6\u0001J\t\u0010-\u001a\u00020.H\u00d6\u0001R\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u001aR\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\n\n\u0002\u0010\u001d\u001a\u0004\u0008\u001b\u0010\u001cR\u0011\u0010\u000f\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u0012\u00a8\u0006/"
    }
    d2 = {
        "Lcom/discord/chat/presentation/list/item/MessageItem;",
        "Lcom/discord/chat/presentation/list/item/ChatListItem;",
        "message",
        "Lcom/discord/chat/bridge/Message;",
        "messageFrame",
        "Lcom/discord/chat/bridge/messageframe/MessageFrame;",
        "messageContext",
        "Lcom/discord/chat/presentation/root/MessageContext;",
        "allowChildGestures",
        "",
        "isHighlight",
        "backgroundHighlight",
        "Lcom/discord/chat/bridge/BackgroundHighlight;",
        "reactTag",
        "",
        "renderContentOnly",
        "(Lcom/discord/chat/bridge/Message;Lcom/discord/chat/bridge/messageframe/MessageFrame;Lcom/discord/chat/presentation/root/MessageContext;ZZLcom/discord/chat/bridge/BackgroundHighlight;Ljava/lang/Integer;Z)V",
        "getAllowChildGestures",
        "()Z",
        "getBackgroundHighlight",
        "()Lcom/discord/chat/bridge/BackgroundHighlight;",
        "getMessage",
        "()Lcom/discord/chat/bridge/Message;",
        "getMessageContext",
        "()Lcom/discord/chat/presentation/root/MessageContext;",
        "getMessageFrame",
        "()Lcom/discord/chat/bridge/messageframe/MessageFrame;",
        "getReactTag",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "getRenderContentOnly",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "copy",
        "(Lcom/discord/chat/bridge/Message;Lcom/discord/chat/bridge/messageframe/MessageFrame;Lcom/discord/chat/presentation/root/MessageContext;ZZLcom/discord/chat/bridge/BackgroundHighlight;Ljava/lang/Integer;Z)Lcom/discord/chat/presentation/list/item/MessageItem;",
        "equals",
        "other",
        "",
        "hashCode",
        "toString",
        "",
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


# instance fields
.field private final allowChildGestures:Z

.field private final backgroundHighlight:Lcom/discord/chat/bridge/BackgroundHighlight;

.field private final isHighlight:Z

.field private final message:Lcom/discord/chat/bridge/Message;

.field private final messageContext:Lcom/discord/chat/presentation/root/MessageContext;

.field private final messageFrame:Lcom/discord/chat/bridge/messageframe/MessageFrame;

.field private final reactTag:Ljava/lang/Integer;

.field private final renderContentOnly:Z


# direct methods
.method public constructor <init>(Lcom/discord/chat/bridge/Message;Lcom/discord/chat/bridge/messageframe/MessageFrame;Lcom/discord/chat/presentation/root/MessageContext;ZZLcom/discord/chat/bridge/BackgroundHighlight;Ljava/lang/Integer;Z)V
    .locals 2

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageContext"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-virtual {p1}, Lcom/discord/chat/bridge/Message;->getId-3Eiw7ao()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/discord/primitives/MessageId;->toString-impl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/discord/chat/presentation/list/item/ChatListItem;-><init>(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 4
    iput-object p1, p0, Lcom/discord/chat/presentation/list/item/MessageItem;->message:Lcom/discord/chat/bridge/Message;

    .line 5
    iput-object p2, p0, Lcom/discord/chat/presentation/list/item/MessageItem;->messageFrame:Lcom/discord/chat/bridge/messageframe/MessageFrame;

    .line 6
    iput-object p3, p0, Lcom/discord/chat/presentation/list/item/MessageItem;->messageContext:Lcom/discord/chat/presentation/root/MessageContext;

    .line 7
    iput-boolean p4, p0, Lcom/discord/chat/presentation/list/item/MessageItem;->allowChildGestures:Z

    .line 8
    iput-boolean p5, p0, Lcom/discord/chat/presentation/list/item/MessageItem;->isHighlight:Z

    .line 9
    iput-object p6, p0, Lcom/discord/chat/presentation/list/item/MessageItem;->backgroundHighlight:Lcom/discord/chat/bridge/BackgroundHighlight;

    .line 10
    iput-object p7, p0, Lcom/discord/chat/presentation/list/item/MessageItem;->reactTag:Ljava/lang/Integer;

    .line 11
    iput-boolean p8, p0, Lcom/discord/chat/presentation/list/item/MessageItem;->renderContentOnly:Z

    return-void
.end method

.method public synthetic constructor <init>(Lcom/discord/chat/bridge/Message;Lcom/discord/chat/bridge/messageframe/MessageFrame;Lcom/discord/chat/presentation/root/MessageContext;ZZLcom/discord/chat/bridge/BackgroundHighlight;Ljava/lang/Integer;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 17

    move/from16 v0, p9

    and-int/lit8 v1, v0, 0x2

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v1, v2

    goto :goto_0

    :cond_0
    move-object/from16 v1, p2

    :goto_0
    and-int/lit8 v3, v0, 0x4

    if-eqz v3, :cond_1

    .line 1
    new-instance v3, Lcom/discord/chat/presentation/root/MessageContext;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v15, 0x3ff

    const/16 v16, 0x0

    move-object v4, v3

    invoke-direct/range {v4 .. v16}, Lcom/discord/chat/presentation/root/MessageContext;-><init>(ZZLjava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/reaction/ReactionsTheme;Lcom/discord/chat/bridge/truncation/Truncation;ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_1
    move-object/from16 v3, p3

    :goto_1
    and-int/lit8 v4, v0, 0x8

    if-eqz v4, :cond_2

    const/4 v4, 0x1

    goto :goto_2

    :cond_2
    move/from16 v4, p4

    :goto_2
    and-int/lit8 v5, v0, 0x10

    const/4 v6, 0x0

    if-eqz v5, :cond_3

    move v5, v6

    goto :goto_3

    :cond_3
    move/from16 v5, p5

    :goto_3
    and-int/lit8 v7, v0, 0x20

    if-eqz v7, :cond_4

    move-object v7, v2

    goto :goto_4

    :cond_4
    move-object/from16 v7, p6

    :goto_4
    and-int/lit8 v8, v0, 0x40

    if-eqz v8, :cond_5

    goto :goto_5

    :cond_5
    move-object/from16 v2, p7

    :goto_5
    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_6

    goto :goto_6

    :cond_6
    move/from16 v6, p8

    :goto_6
    move-object/from16 p2, p0

    move-object/from16 p3, p1

    move-object/from16 p4, v1

    move-object/from16 p5, v3

    move/from16 p6, v4

    move/from16 p7, v5

    move-object/from16 p8, v7

    move-object/from16 p9, v2

    move/from16 p10, v6

    .line 2
    invoke-direct/range {p2 .. p10}, Lcom/discord/chat/presentation/list/item/MessageItem;-><init>(Lcom/discord/chat/bridge/Message;Lcom/discord/chat/bridge/messageframe/MessageFrame;Lcom/discord/chat/presentation/root/MessageContext;ZZLcom/discord/chat/bridge/BackgroundHighlight;Ljava/lang/Integer;Z)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/discord/chat/presentation/list/item/MessageItem;Lcom/discord/chat/bridge/Message;Lcom/discord/chat/bridge/messageframe/MessageFrame;Lcom/discord/chat/presentation/root/MessageContext;ZZLcom/discord/chat/bridge/BackgroundHighlight;Ljava/lang/Integer;ZILjava/lang/Object;)Lcom/discord/chat/presentation/list/item/MessageItem;
    .locals 9

    move-object v0, p0

    move/from16 v1, p9

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/discord/chat/presentation/list/item/MessageItem;->message:Lcom/discord/chat/bridge/Message;

    goto :goto_0

    :cond_0
    move-object v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/discord/chat/presentation/list/item/MessageItem;->messageFrame:Lcom/discord/chat/bridge/messageframe/MessageFrame;

    goto :goto_1

    :cond_1
    move-object v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/discord/chat/presentation/list/item/MessageItem;->messageContext:Lcom/discord/chat/presentation/root/MessageContext;

    goto :goto_2

    :cond_2
    move-object v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-boolean v5, v0, Lcom/discord/chat/presentation/list/item/MessageItem;->allowChildGestures:Z

    goto :goto_3

    :cond_3
    move v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-boolean v6, v0, Lcom/discord/chat/presentation/list/item/MessageItem;->isHighlight:Z

    goto :goto_4

    :cond_4
    move v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/discord/chat/presentation/list/item/MessageItem;->backgroundHighlight:Lcom/discord/chat/bridge/BackgroundHighlight;

    goto :goto_5

    :cond_5
    move-object v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/discord/chat/presentation/list/item/MessageItem;->reactTag:Ljava/lang/Integer;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v1, v1, 0x80

    if-eqz v1, :cond_7

    iget-boolean v1, v0, Lcom/discord/chat/presentation/list/item/MessageItem;->renderContentOnly:Z

    goto :goto_7

    :cond_7
    move/from16 v1, p8

    :goto_7
    move-object p1, v2

    move-object p2, v3

    move-object p3, v4

    move p4, v5

    move p5, v6

    move-object p6, v7

    move-object/from16 p7, v8

    move/from16 p8, v1

    invoke-virtual/range {p0 .. p8}, Lcom/discord/chat/presentation/list/item/MessageItem;->copy(Lcom/discord/chat/bridge/Message;Lcom/discord/chat/bridge/messageframe/MessageFrame;Lcom/discord/chat/presentation/root/MessageContext;ZZLcom/discord/chat/bridge/BackgroundHighlight;Ljava/lang/Integer;Z)Lcom/discord/chat/presentation/list/item/MessageItem;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Lcom/discord/chat/bridge/Message;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/list/item/MessageItem;->message:Lcom/discord/chat/bridge/Message;

    return-object v0
.end method

.method public final component2()Lcom/discord/chat/bridge/messageframe/MessageFrame;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/list/item/MessageItem;->messageFrame:Lcom/discord/chat/bridge/messageframe/MessageFrame;

    return-object v0
.end method

.method public final component3()Lcom/discord/chat/presentation/root/MessageContext;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/list/item/MessageItem;->messageContext:Lcom/discord/chat/presentation/root/MessageContext;

    return-object v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/presentation/list/item/MessageItem;->allowChildGestures:Z

    return v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/presentation/list/item/MessageItem;->isHighlight:Z

    return v0
.end method

.method public final component6()Lcom/discord/chat/bridge/BackgroundHighlight;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/list/item/MessageItem;->backgroundHighlight:Lcom/discord/chat/bridge/BackgroundHighlight;

    return-object v0
.end method

.method public final component7()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/list/item/MessageItem;->reactTag:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component8()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/presentation/list/item/MessageItem;->renderContentOnly:Z

    return v0
.end method

.method public final copy(Lcom/discord/chat/bridge/Message;Lcom/discord/chat/bridge/messageframe/MessageFrame;Lcom/discord/chat/presentation/root/MessageContext;ZZLcom/discord/chat/bridge/BackgroundHighlight;Ljava/lang/Integer;Z)Lcom/discord/chat/presentation/list/item/MessageItem;
    .locals 10

    const-string v0, "message"

    move-object v2, p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageContext"

    move-object v4, p3

    invoke-static {p3, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/discord/chat/presentation/list/item/MessageItem;

    move-object v1, v0

    move-object v3, p2

    move v5, p4

    move v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v9, p8

    invoke-direct/range {v1 .. v9}, Lcom/discord/chat/presentation/list/item/MessageItem;-><init>(Lcom/discord/chat/bridge/Message;Lcom/discord/chat/bridge/messageframe/MessageFrame;Lcom/discord/chat/presentation/root/MessageContext;ZZLcom/discord/chat/bridge/BackgroundHighlight;Ljava/lang/Integer;Z)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/discord/chat/presentation/list/item/MessageItem;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/discord/chat/presentation/list/item/MessageItem;

    iget-object v1, p0, Lcom/discord/chat/presentation/list/item/MessageItem;->message:Lcom/discord/chat/bridge/Message;

    iget-object v3, p1, Lcom/discord/chat/presentation/list/item/MessageItem;->message:Lcom/discord/chat/bridge/Message;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/discord/chat/presentation/list/item/MessageItem;->messageFrame:Lcom/discord/chat/bridge/messageframe/MessageFrame;

    iget-object v3, p1, Lcom/discord/chat/presentation/list/item/MessageItem;->messageFrame:Lcom/discord/chat/bridge/messageframe/MessageFrame;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/discord/chat/presentation/list/item/MessageItem;->messageContext:Lcom/discord/chat/presentation/root/MessageContext;

    iget-object v3, p1, Lcom/discord/chat/presentation/list/item/MessageItem;->messageContext:Lcom/discord/chat/presentation/root/MessageContext;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/discord/chat/presentation/list/item/MessageItem;->allowChildGestures:Z

    iget-boolean v3, p1, Lcom/discord/chat/presentation/list/item/MessageItem;->allowChildGestures:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcom/discord/chat/presentation/list/item/MessageItem;->isHighlight:Z

    iget-boolean v3, p1, Lcom/discord/chat/presentation/list/item/MessageItem;->isHighlight:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/discord/chat/presentation/list/item/MessageItem;->backgroundHighlight:Lcom/discord/chat/bridge/BackgroundHighlight;

    iget-object v3, p1, Lcom/discord/chat/presentation/list/item/MessageItem;->backgroundHighlight:Lcom/discord/chat/bridge/BackgroundHighlight;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/discord/chat/presentation/list/item/MessageItem;->reactTag:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/discord/chat/presentation/list/item/MessageItem;->reactTag:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Lcom/discord/chat/presentation/list/item/MessageItem;->renderContentOnly:Z

    iget-boolean p1, p1, Lcom/discord/chat/presentation/list/item/MessageItem;->renderContentOnly:Z

    if-eq v1, p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getAllowChildGestures()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/presentation/list/item/MessageItem;->allowChildGestures:Z

    return v0
.end method

.method public final getBackgroundHighlight()Lcom/discord/chat/bridge/BackgroundHighlight;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/list/item/MessageItem;->backgroundHighlight:Lcom/discord/chat/bridge/BackgroundHighlight;

    return-object v0
.end method

.method public final getMessage()Lcom/discord/chat/bridge/Message;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/list/item/MessageItem;->message:Lcom/discord/chat/bridge/Message;

    return-object v0
.end method

.method public final getMessageContext()Lcom/discord/chat/presentation/root/MessageContext;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/list/item/MessageItem;->messageContext:Lcom/discord/chat/presentation/root/MessageContext;

    return-object v0
.end method

.method public final getMessageFrame()Lcom/discord/chat/bridge/messageframe/MessageFrame;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/list/item/MessageItem;->messageFrame:Lcom/discord/chat/bridge/messageframe/MessageFrame;

    return-object v0
.end method

.method public final getReactTag()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/list/item/MessageItem;->reactTag:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getRenderContentOnly()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/presentation/list/item/MessageItem;->renderContentOnly:Z

    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/discord/chat/presentation/list/item/MessageItem;->message:Lcom/discord/chat/bridge/Message;

    invoke-virtual {v0}, Lcom/discord/chat/bridge/Message;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/presentation/list/item/MessageItem;->messageFrame:Lcom/discord/chat/bridge/messageframe/MessageFrame;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/presentation/list/item/MessageItem;->messageContext:Lcom/discord/chat/presentation/root/MessageContext;

    invoke-virtual {v1}, Lcom/discord/chat/presentation/root/MessageContext;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/discord/chat/presentation/list/item/MessageItem;->allowChildGestures:Z

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    move v1, v3

    :cond_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/discord/chat/presentation/list/item/MessageItem;->isHighlight:Z

    if-eqz v1, :cond_2

    move v1, v3

    :cond_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/presentation/list/item/MessageItem;->backgroundHighlight:Lcom/discord/chat/bridge/BackgroundHighlight;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_1

    :cond_3
    invoke-virtual {v1}, Lcom/discord/chat/bridge/BackgroundHighlight;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/presentation/list/item/MessageItem;->reactTag:Ljava/lang/Integer;

    if-nez v1, :cond_4

    goto :goto_2

    :cond_4
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/discord/chat/presentation/list/item/MessageItem;->renderContentOnly:Z

    if-eqz v1, :cond_5

    goto :goto_3

    :cond_5
    move v3, v1

    :goto_3
    add-int/2addr v0, v3

    return v0
.end method

.method public final isHighlight()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/presentation/list/item/MessageItem;->isHighlight:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Lcom/discord/chat/presentation/list/item/MessageItem;->message:Lcom/discord/chat/bridge/Message;

    iget-object v1, p0, Lcom/discord/chat/presentation/list/item/MessageItem;->messageFrame:Lcom/discord/chat/bridge/messageframe/MessageFrame;

    iget-object v2, p0, Lcom/discord/chat/presentation/list/item/MessageItem;->messageContext:Lcom/discord/chat/presentation/root/MessageContext;

    iget-boolean v3, p0, Lcom/discord/chat/presentation/list/item/MessageItem;->allowChildGestures:Z

    iget-boolean v4, p0, Lcom/discord/chat/presentation/list/item/MessageItem;->isHighlight:Z

    iget-object v5, p0, Lcom/discord/chat/presentation/list/item/MessageItem;->backgroundHighlight:Lcom/discord/chat/bridge/BackgroundHighlight;

    iget-object v6, p0, Lcom/discord/chat/presentation/list/item/MessageItem;->reactTag:Ljava/lang/Integer;

    iget-boolean v7, p0, Lcom/discord/chat/presentation/list/item/MessageItem;->renderContentOnly:Z

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "MessageItem(message="

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", messageFrame="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", messageContext="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", allowChildGestures="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", isHighlight="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", backgroundHighlight="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", reactTag="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", renderContentOnly="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
