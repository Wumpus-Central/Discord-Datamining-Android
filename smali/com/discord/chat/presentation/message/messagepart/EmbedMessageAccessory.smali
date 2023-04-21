.class public final Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;
.super Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;
.source "SourceFile"

# interfaces
.implements Lcom/discord/chat/presentation/media/PortalUiModel;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008$\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u00012\u00020\u0002Bd\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0006\u0010\u000e\u001a\u00020\u000c\u0012\u0006\u0010\u000f\u001a\u00020\u000c\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0019\u0010\'\u001a\u00020\u0004H\u00c6\u0003\u00f8\u0001\u0002\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008(\u0010\u001bJ\u000b\u0010)\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003J\t\u0010+\u001a\u00020\u0006H\u00c6\u0003J\t\u0010,\u001a\u00020\u0006H\u00c6\u0003J\t\u0010-\u001a\u00020\u0006H\u00c6\u0003J\t\u0010.\u001a\u00020\nH\u00c6\u0003J\t\u0010/\u001a\u00020\u000cH\u00c6\u0003J\t\u00100\u001a\u00020\u000cH\u00c6\u0003J\t\u00101\u001a\u00020\u000cH\u00c6\u0003J\t\u00102\u001a\u00020\u000cH\u00c6\u0003J\u0088\u0001\u00103\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000c2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00c6\u0001\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u00084\u00105J\u0013\u00106\u001a\u00020\u000c2\u0008\u00107\u001a\u0004\u0018\u000108H\u00d6\u0003J\t\u00109\u001a\u00020\u0006H\u00d6\u0001J\t\u0010:\u001a\u00020;H\u00d6\u0001R\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u0016R\u001f\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\n\n\u0002\u0010\u001c\u001a\u0004\u0008\u001a\u0010\u001bR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001eR\u0011\u0010\u0008\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010\u0016R\u0011\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010!R\u0011\u0010\u000b\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010!R\u0011\u0010\u000e\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010!R\u0011\u0010\u000f\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010!R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008%\u0010&\u0082\u0002\u000f\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006<"
    }
    d2 = {
        "Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;",
        "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;",
        "Lcom/discord/chat/presentation/media/PortalUiModel;",
        "messageId",
        "Lcom/discord/primitives/MessageId;",
        "index",
        "",
        "constrainedWidth",
        "radiusPx",
        "embed",
        "Lcom/discord/chat/bridge/embed/Embed;",
        "shouldAutoPlayGifs",
        "",
        "shouldAnimateEmoji",
        "shouldShowRoleDot",
        "shouldShowRoleOnName",
        "spoilerAttributes",
        "Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;",
        "onLongClick",
        "Landroid/view/View$OnLongClickListener;",
        "(Ljava/lang/String;IIILcom/discord/chat/bridge/embed/Embed;ZZZZLcom/discord/chat/bridge/spoiler/SpoilerAttributes;Landroid/view/View$OnLongClickListener;Lkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "getConstrainedWidth",
        "()I",
        "getEmbed",
        "()Lcom/discord/chat/bridge/embed/Embed;",
        "getIndex",
        "getMessageId-3Eiw7ao",
        "()Ljava/lang/String;",
        "Ljava/lang/String;",
        "getOnLongClick",
        "()Landroid/view/View$OnLongClickListener;",
        "getRadiusPx",
        "getShouldAnimateEmoji",
        "()Z",
        "getShouldAutoPlayGifs",
        "getShouldShowRoleDot",
        "getShouldShowRoleOnName",
        "getSpoilerAttributes",
        "()Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;",
        "component1",
        "component1-3Eiw7ao",
        "component10",
        "component11",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
        "copy-5odn8qk",
        "(Ljava/lang/String;IIILcom/discord/chat/bridge/embed/Embed;ZZZZLcom/discord/chat/bridge/spoiler/SpoilerAttributes;Landroid/view/View$OnLongClickListener;)Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;",
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
.field private final constrainedWidth:I

.field private final embed:Lcom/discord/chat/bridge/embed/Embed;

.field private final index:I

.field private final messageId:Ljava/lang/String;

.field private final onLongClick:Landroid/view/View$OnLongClickListener;

.field private final radiusPx:I

.field private final shouldAnimateEmoji:Z

.field private final shouldAutoPlayGifs:Z

.field private final shouldShowRoleDot:Z

.field private final shouldShowRoleOnName:Z

.field private final spoilerAttributes:Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;


# direct methods
.method private constructor <init>(Ljava/lang/String;IIILcom/discord/chat/bridge/embed/Embed;ZZZZLcom/discord/chat/bridge/spoiler/SpoilerAttributes;Landroid/view/View$OnLongClickListener;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "embed "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-direct {p0, p1, v0, v1}, Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;-><init>(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->messageId:Ljava/lang/String;

    .line 23
    .line 24
    iput p2, p0, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->index:I

    .line 25
    .line 26
    iput p3, p0, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->constrainedWidth:I

    .line 27
    .line 28
    iput p4, p0, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->radiusPx:I

    .line 29
    .line 30
    iput-object p5, p0, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->embed:Lcom/discord/chat/bridge/embed/Embed;

    .line 31
    .line 32
    iput-boolean p6, p0, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->shouldAutoPlayGifs:Z

    .line 33
    .line 34
    iput-boolean p7, p0, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->shouldAnimateEmoji:Z

    .line 35
    .line 36
    iput-boolean p8, p0, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->shouldShowRoleDot:Z

    .line 37
    .line 38
    iput-boolean p9, p0, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->shouldShowRoleOnName:Z

    .line 39
    .line 40
    iput-object p10, p0, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->spoilerAttributes:Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;

    .line 41
    .line 42
    iput-object p11, p0, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->onLongClick:Landroid/view/View$OnLongClickListener;

    .line 43
    .line 44
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;IIILcom/discord/chat/bridge/embed/Embed;ZZZZLcom/discord/chat/bridge/spoiler/SpoilerAttributes;Landroid/view/View$OnLongClickListener;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct/range {p0 .. p11}, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;-><init>(Ljava/lang/String;IIILcom/discord/chat/bridge/embed/Embed;ZZZZLcom/discord/chat/bridge/spoiler/SpoilerAttributes;Landroid/view/View$OnLongClickListener;)V

    return-void
.end method

.method public static synthetic copy-5odn8qk$default(Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;Ljava/lang/String;IIILcom/discord/chat/bridge/embed/Embed;ZZZZLcom/discord/chat/bridge/spoiler/SpoilerAttributes;Landroid/view/View$OnLongClickListener;ILjava/lang/Object;)Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;
    .locals 12

    move-object v0, p0

    move/from16 v1, p12

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->getMessageId-3Eiw7ao()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    invoke-virtual {p0}, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->getIndex()I

    move-result v3

    goto :goto_1

    :cond_1
    move v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget v4, v0, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->constrainedWidth:I

    goto :goto_2

    :cond_2
    move v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget v5, v0, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->radiusPx:I

    goto :goto_3

    :cond_3
    move/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->embed:Lcom/discord/chat/bridge/embed/Embed;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-boolean v7, v0, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->shouldAutoPlayGifs:Z

    goto :goto_5

    :cond_5
    move/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-boolean v8, v0, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->shouldAnimateEmoji:Z

    goto :goto_6

    :cond_6
    move/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-boolean v9, v0, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->shouldShowRoleDot:Z

    goto :goto_7

    :cond_7
    move/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-boolean v10, v0, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->shouldShowRoleOnName:Z

    goto :goto_8

    :cond_8
    move/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->spoilerAttributes:Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v1, v1, 0x400

    if-eqz v1, :cond_a

    iget-object v1, v0, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->onLongClick:Landroid/view/View$OnLongClickListener;

    goto :goto_a

    :cond_a
    move-object/from16 v1, p11

    :goto_a
    move-object p1, v2

    move p2, v3

    move p3, v4

    move/from16 p4, v5

    move-object/from16 p5, v6

    move/from16 p6, v7

    move/from16 p7, v8

    move/from16 p8, v9

    move/from16 p9, v10

    move-object/from16 p10, v11

    move-object/from16 p11, v1

    invoke-virtual/range {p0 .. p11}, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->copy-5odn8qk(Ljava/lang/String;IIILcom/discord/chat/bridge/embed/Embed;ZZZZLcom/discord/chat/bridge/spoiler/SpoilerAttributes;Landroid/view/View$OnLongClickListener;)Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1-3Eiw7ao()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->getMessageId-3Eiw7ao()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final component10()Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->spoilerAttributes:Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;

    return-object v0
.end method

.method public final component11()Landroid/view/View$OnLongClickListener;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->onLongClick:Landroid/view/View$OnLongClickListener;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->getIndex()I

    move-result v0

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->constrainedWidth:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->radiusPx:I

    return v0
.end method

.method public final component5()Lcom/discord/chat/bridge/embed/Embed;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->embed:Lcom/discord/chat/bridge/embed/Embed;

    return-object v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->shouldAutoPlayGifs:Z

    return v0
.end method

.method public final component7()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->shouldAnimateEmoji:Z

    return v0
.end method

.method public final component8()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->shouldShowRoleDot:Z

    return v0
.end method

.method public final component9()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->shouldShowRoleOnName:Z

    return v0
.end method

.method public final copy-5odn8qk(Ljava/lang/String;IIILcom/discord/chat/bridge/embed/Embed;ZZZZLcom/discord/chat/bridge/spoiler/SpoilerAttributes;Landroid/view/View$OnLongClickListener;)Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;
    .locals 14

    const-string v0, "messageId"

    move-object v2, p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "embed"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;

    const/4 v13, 0x0

    move-object v1, v0

    move/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    invoke-direct/range {v1 .. v13}, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;-><init>(Ljava/lang/String;IIILcom/discord/chat/bridge/embed/Embed;ZZZZLcom/discord/chat/bridge/spoiler/SpoilerAttributes;Landroid/view/View$OnLongClickListener;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;

    invoke-virtual {p0}, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->getMessageId-3Eiw7ao()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->getMessageId-3Eiw7ao()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lcom/discord/primitives/MessageId;->equals-impl0(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    invoke-virtual {p0}, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->getIndex()I

    move-result v1

    invoke-virtual {p1}, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->getIndex()I

    move-result v3

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->constrainedWidth:I

    iget v3, p1, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->constrainedWidth:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->radiusPx:I

    iget v3, p1, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->radiusPx:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->embed:Lcom/discord/chat/bridge/embed/Embed;

    iget-object v3, p1, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->embed:Lcom/discord/chat/bridge/embed/Embed;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->shouldAutoPlayGifs:Z

    iget-boolean v3, p1, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->shouldAutoPlayGifs:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->shouldAnimateEmoji:Z

    iget-boolean v3, p1, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->shouldAnimateEmoji:Z

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->shouldShowRoleDot:Z

    iget-boolean v3, p1, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->shouldShowRoleDot:Z

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-boolean v1, p0, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->shouldShowRoleOnName:Z

    iget-boolean v3, p1, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->shouldShowRoleOnName:Z

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->spoilerAttributes:Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;

    iget-object v3, p1, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->spoilerAttributes:Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->onLongClick:Landroid/view/View$OnLongClickListener;

    iget-object p1, p1, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->onLongClick:Landroid/view/View$OnLongClickListener;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    return v2

    :cond_c
    return v0
.end method

.method public final getConstrainedWidth()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->constrainedWidth:I

    return v0
.end method

.method public final getEmbed()Lcom/discord/chat/bridge/embed/Embed;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->embed:Lcom/discord/chat/bridge/embed/Embed;

    return-object v0
.end method

.method public getIndex()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->index:I

    return v0
.end method

.method public getMessageId-3Eiw7ao()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->messageId:Ljava/lang/String;

    return-object v0
.end method

.method public final getOnLongClick()Landroid/view/View$OnLongClickListener;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->onLongClick:Landroid/view/View$OnLongClickListener;

    return-object v0
.end method

.method public getPortal()D
    .locals 2

    invoke-static {p0}, Lcom/discord/chat/presentation/media/PortalUiModel$DefaultImpls;->getPortal(Lcom/discord/chat/presentation/media/PortalUiModel;)D

    move-result-wide v0

    return-wide v0
.end method

.method public final getRadiusPx()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->radiusPx:I

    return v0
.end method

.method public final getShouldAnimateEmoji()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->shouldAnimateEmoji:Z

    return v0
.end method

.method public final getShouldAutoPlayGifs()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->shouldAutoPlayGifs:Z

    return v0
.end method

.method public final getShouldShowRoleDot()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->shouldShowRoleDot:Z

    return v0
.end method

.method public final getShouldShowRoleOnName()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->shouldShowRoleOnName:Z

    return v0
.end method

.method public final getSpoilerAttributes()Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->spoilerAttributes:Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    invoke-virtual {p0}, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->getMessageId-3Eiw7ao()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/discord/primitives/MessageId;->hashCode-impl(Ljava/lang/String;)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->getIndex()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->constrainedWidth:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->radiusPx:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->embed:Lcom/discord/chat/bridge/embed/Embed;

    invoke-virtual {v1}, Lcom/discord/chat/bridge/embed/Embed;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->shouldAutoPlayGifs:Z

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    move v1, v2

    :cond_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->shouldAnimateEmoji:Z

    if-eqz v1, :cond_1

    move v1, v2

    :cond_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->shouldShowRoleDot:Z

    if-eqz v1, :cond_2

    move v1, v2

    :cond_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->shouldShowRoleOnName:Z

    if-eqz v1, :cond_3

    goto :goto_0

    :cond_3
    move v2, v1

    :goto_0
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->spoilerAttributes:Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;

    const/4 v2, 0x0

    if-nez v1, :cond_4

    move v1, v2

    goto :goto_1

    :cond_4
    invoke-virtual {v1}, Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->onLongClick:Landroid/view/View$OnLongClickListener;

    if-nez v1, :cond_5

    goto :goto_2

    :cond_5
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 13

    invoke-virtual {p0}, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->getMessageId-3Eiw7ao()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/discord/primitives/MessageId;->toString-impl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->getIndex()I

    move-result v1

    iget v2, p0, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->constrainedWidth:I

    iget v3, p0, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->radiusPx:I

    iget-object v4, p0, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->embed:Lcom/discord/chat/bridge/embed/Embed;

    iget-boolean v5, p0, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->shouldAutoPlayGifs:Z

    iget-boolean v6, p0, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->shouldAnimateEmoji:Z

    iget-boolean v7, p0, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->shouldShowRoleDot:Z

    iget-boolean v8, p0, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->shouldShowRoleOnName:Z

    iget-object v9, p0, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->spoilerAttributes:Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;

    iget-object v10, p0, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->onLongClick:Landroid/view/View$OnLongClickListener;

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "EmbedMessageAccessory(messageId="

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", index="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", constrainedWidth="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", radiusPx="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", embed="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", shouldAutoPlayGifs="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", shouldAnimateEmoji="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", shouldShowRoleDot="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", shouldShowRoleOnName="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", spoilerAttributes="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", onLongClick="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
