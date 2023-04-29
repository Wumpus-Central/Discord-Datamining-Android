.class public final Lcom/discord/chat/presentation/root/MessageContext;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008&\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0006\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0012J\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0003H\u00c6\u0003J\t\u0010(\u001a\u00020\u0006H\u00c6\u0003J\t\u0010)\u001a\u00020\u0006H\u00c6\u0003J\t\u0010*\u001a\u00020\u0006H\u00c6\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003J\t\u0010-\u001a\u00020\u0003H\u00c6\u0003J\t\u0010.\u001a\u00020\u0003H\u00c6\u0003J\u0085\u0001\u0010/\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00062\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0003H\u00c6\u0001J\u0013\u00100\u001a\u00020\u00032\u0008\u00101\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00102\u001a\u000203H\u00d6\u0001J\t\u00104\u001a\u00020\u0006H\u00d6\u0001R\u0011\u0010\u0008\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0011\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u0018R\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u001bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001eR\u0011\u0010\u0011\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010\u0018R\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010\u0018R\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\u0018R\u0011\u0010\u0010\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010\u0018\u00a8\u00065"
    }
    d2 = {
        "Lcom/discord/chat/presentation/root/MessageContext;",
        "",
        "showDivider",
        "",
        "canAddNewReactions",
        "addReactionLabel",
        "",
        "addNewReactionAccessibilityLabel",
        "addNewBurstReactionAccessibilityLabel",
        "reactionsTheme",
        "Lcom/discord/chat/bridge/reaction/ReactionsTheme;",
        "truncation",
        "Lcom/discord/chat/bridge/truncation/Truncation;",
        "useAttachmentGridLayout",
        "useAttachmentUploadPreview",
        "enableSwipeToReply",
        "useSortedReactions",
        "useAddBurstReaction",
        "(ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/reaction/ReactionsTheme;Lcom/discord/chat/bridge/truncation/Truncation;ZZZZZ)V",
        "getAddNewBurstReactionAccessibilityLabel",
        "()Ljava/lang/String;",
        "getAddNewReactionAccessibilityLabel",
        "getAddReactionLabel",
        "getCanAddNewReactions",
        "()Z",
        "getEnableSwipeToReply",
        "getReactionsTheme",
        "()Lcom/discord/chat/bridge/reaction/ReactionsTheme;",
        "getShowDivider",
        "getTruncation",
        "()Lcom/discord/chat/bridge/truncation/Truncation;",
        "getUseAddBurstReaction",
        "getUseAttachmentGridLayout",
        "getUseAttachmentUploadPreview",
        "getUseSortedReactions",
        "component1",
        "component10",
        "component11",
        "component12",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
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
.field private final addNewBurstReactionAccessibilityLabel:Ljava/lang/String;

.field private final addNewReactionAccessibilityLabel:Ljava/lang/String;

.field private final addReactionLabel:Ljava/lang/String;

.field private final canAddNewReactions:Z

.field private final enableSwipeToReply:Z

.field private final reactionsTheme:Lcom/discord/chat/bridge/reaction/ReactionsTheme;

.field private final showDivider:Z

.field private final truncation:Lcom/discord/chat/bridge/truncation/Truncation;

.field private final useAddBurstReaction:Z

.field private final useAttachmentGridLayout:Z

.field private final useAttachmentUploadPreview:Z

.field private final useSortedReactions:Z


# direct methods
.method public constructor <init>()V
    .locals 15

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/16 v13, 0xfff

    const/4 v14, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v14}, Lcom/discord/chat/presentation/root/MessageContext;-><init>(ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/reaction/ReactionsTheme;Lcom/discord/chat/bridge/truncation/Truncation;ZZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/reaction/ReactionsTheme;Lcom/discord/chat/bridge/truncation/Truncation;ZZZZZ)V
    .locals 1

    const-string v0, "addReactionLabel"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "addNewReactionAccessibilityLabel"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "addNewBurstReactionAccessibilityLabel"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-boolean p1, p0, Lcom/discord/chat/presentation/root/MessageContext;->showDivider:Z

    .line 3
    iput-boolean p2, p0, Lcom/discord/chat/presentation/root/MessageContext;->canAddNewReactions:Z

    .line 4
    iput-object p3, p0, Lcom/discord/chat/presentation/root/MessageContext;->addReactionLabel:Ljava/lang/String;

    .line 5
    iput-object p4, p0, Lcom/discord/chat/presentation/root/MessageContext;->addNewReactionAccessibilityLabel:Ljava/lang/String;

    .line 6
    iput-object p5, p0, Lcom/discord/chat/presentation/root/MessageContext;->addNewBurstReactionAccessibilityLabel:Ljava/lang/String;

    .line 7
    iput-object p6, p0, Lcom/discord/chat/presentation/root/MessageContext;->reactionsTheme:Lcom/discord/chat/bridge/reaction/ReactionsTheme;

    .line 8
    iput-object p7, p0, Lcom/discord/chat/presentation/root/MessageContext;->truncation:Lcom/discord/chat/bridge/truncation/Truncation;

    .line 9
    iput-boolean p8, p0, Lcom/discord/chat/presentation/root/MessageContext;->useAttachmentGridLayout:Z

    .line 10
    iput-boolean p9, p0, Lcom/discord/chat/presentation/root/MessageContext;->useAttachmentUploadPreview:Z

    .line 11
    iput-boolean p10, p0, Lcom/discord/chat/presentation/root/MessageContext;->enableSwipeToReply:Z

    .line 12
    iput-boolean p11, p0, Lcom/discord/chat/presentation/root/MessageContext;->useSortedReactions:Z

    .line 13
    iput-boolean p12, p0, Lcom/discord/chat/presentation/root/MessageContext;->useAddBurstReaction:Z

    return-void
.end method

.method public synthetic constructor <init>(ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/reaction/ReactionsTheme;Lcom/discord/chat/bridge/truncation/Truncation;ZZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 13

    move/from16 v0, p13

    and-int/lit8 v1, v0, 0x1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    move v1, p1

    :goto_0
    and-int/lit8 v3, v0, 0x2

    if-eqz v3, :cond_1

    move v3, v2

    goto :goto_1

    :cond_1
    move v3, p2

    :goto_1
    and-int/lit8 v4, v0, 0x4

    const-string v5, ""

    if-eqz v4, :cond_2

    move-object v4, v5

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v6, v0, 0x8

    if-eqz v6, :cond_3

    move-object v6, v5

    goto :goto_3

    :cond_3
    move-object/from16 v6, p4

    :goto_3
    and-int/lit8 v7, v0, 0x10

    if-eqz v7, :cond_4

    goto :goto_4

    :cond_4
    move-object/from16 v5, p5

    :goto_4
    and-int/lit8 v7, v0, 0x20

    const/4 v8, 0x0

    if-eqz v7, :cond_5

    move-object v7, v8

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v9, v0, 0x40

    if-eqz v9, :cond_6

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v0, 0x80

    if-eqz v9, :cond_7

    move v9, v2

    goto :goto_7

    :cond_7
    move/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v0, 0x100

    if-eqz v10, :cond_8

    move v10, v2

    goto :goto_8

    :cond_8
    move/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v0, 0x200

    if-eqz v11, :cond_9

    move v11, v2

    goto :goto_9

    :cond_9
    move/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v0, 0x400

    if-eqz v12, :cond_a

    const/4 v12, 0x1

    goto :goto_a

    :cond_a
    move/from16 v12, p11

    :goto_a
    and-int/lit16 v0, v0, 0x800

    if-eqz v0, :cond_b

    goto :goto_b

    :cond_b
    move/from16 v2, p12

    :goto_b
    move-object p1, p0

    move p2, v1

    move/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v6

    move-object/from16 p6, v5

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move/from16 p9, v9

    move/from16 p10, v10

    move/from16 p11, v11

    move/from16 p12, v12

    move/from16 p13, v2

    .line 14
    invoke-direct/range {p1 .. p13}, Lcom/discord/chat/presentation/root/MessageContext;-><init>(ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/reaction/ReactionsTheme;Lcom/discord/chat/bridge/truncation/Truncation;ZZZZZ)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/discord/chat/presentation/root/MessageContext;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/reaction/ReactionsTheme;Lcom/discord/chat/bridge/truncation/Truncation;ZZZZZILjava/lang/Object;)Lcom/discord/chat/presentation/root/MessageContext;
    .locals 13

    move-object v0, p0

    move/from16 v1, p13

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-boolean v2, v0, Lcom/discord/chat/presentation/root/MessageContext;->showDivider:Z

    goto :goto_0

    :cond_0
    move v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-boolean v3, v0, Lcom/discord/chat/presentation/root/MessageContext;->canAddNewReactions:Z

    goto :goto_1

    :cond_1
    move v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/discord/chat/presentation/root/MessageContext;->addReactionLabel:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/discord/chat/presentation/root/MessageContext;->addNewReactionAccessibilityLabel:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/discord/chat/presentation/root/MessageContext;->addNewBurstReactionAccessibilityLabel:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/discord/chat/presentation/root/MessageContext;->reactionsTheme:Lcom/discord/chat/bridge/reaction/ReactionsTheme;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/discord/chat/presentation/root/MessageContext;->truncation:Lcom/discord/chat/bridge/truncation/Truncation;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-boolean v9, v0, Lcom/discord/chat/presentation/root/MessageContext;->useAttachmentGridLayout:Z

    goto :goto_7

    :cond_7
    move/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-boolean v10, v0, Lcom/discord/chat/presentation/root/MessageContext;->useAttachmentUploadPreview:Z

    goto :goto_8

    :cond_8
    move/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-boolean v11, v0, Lcom/discord/chat/presentation/root/MessageContext;->enableSwipeToReply:Z

    goto :goto_9

    :cond_9
    move/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-boolean v12, v0, Lcom/discord/chat/presentation/root/MessageContext;->useSortedReactions:Z

    goto :goto_a

    :cond_a
    move/from16 v12, p11

    :goto_a
    and-int/lit16 v1, v1, 0x800

    if-eqz v1, :cond_b

    iget-boolean v1, v0, Lcom/discord/chat/presentation/root/MessageContext;->useAddBurstReaction:Z

    goto :goto_b

    :cond_b
    move/from16 v1, p12

    :goto_b
    move p1, v2

    move p2, v3

    move-object/from16 p3, v4

    move-object/from16 p4, v5

    move-object/from16 p5, v6

    move-object/from16 p6, v7

    move-object/from16 p7, v8

    move/from16 p8, v9

    move/from16 p9, v10

    move/from16 p10, v11

    move/from16 p11, v12

    move/from16 p12, v1

    invoke-virtual/range {p0 .. p12}, Lcom/discord/chat/presentation/root/MessageContext;->copy(ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/reaction/ReactionsTheme;Lcom/discord/chat/bridge/truncation/Truncation;ZZZZZ)Lcom/discord/chat/presentation/root/MessageContext;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/presentation/root/MessageContext;->showDivider:Z

    return v0
.end method

.method public final component10()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/presentation/root/MessageContext;->enableSwipeToReply:Z

    return v0
.end method

.method public final component11()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/presentation/root/MessageContext;->useSortedReactions:Z

    return v0
.end method

.method public final component12()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/presentation/root/MessageContext;->useAddBurstReaction:Z

    return v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/presentation/root/MessageContext;->canAddNewReactions:Z

    return v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/root/MessageContext;->addReactionLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/root/MessageContext;->addNewReactionAccessibilityLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/root/MessageContext;->addNewBurstReactionAccessibilityLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Lcom/discord/chat/bridge/reaction/ReactionsTheme;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/root/MessageContext;->reactionsTheme:Lcom/discord/chat/bridge/reaction/ReactionsTheme;

    return-object v0
.end method

.method public final component7()Lcom/discord/chat/bridge/truncation/Truncation;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/root/MessageContext;->truncation:Lcom/discord/chat/bridge/truncation/Truncation;

    return-object v0
.end method

.method public final component8()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/presentation/root/MessageContext;->useAttachmentGridLayout:Z

    return v0
.end method

.method public final component9()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/presentation/root/MessageContext;->useAttachmentUploadPreview:Z

    return v0
.end method

.method public final copy(ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/reaction/ReactionsTheme;Lcom/discord/chat/bridge/truncation/Truncation;ZZZZZ)Lcom/discord/chat/presentation/root/MessageContext;
    .locals 14

    const-string v0, "addReactionLabel"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "addNewReactionAccessibilityLabel"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "addNewBurstReactionAccessibilityLabel"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/discord/chat/presentation/root/MessageContext;

    move-object v1, v0

    move v2, p1

    move/from16 v3, p2

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    move/from16 v11, p10

    move/from16 v12, p11

    move/from16 v13, p12

    invoke-direct/range {v1 .. v13}, Lcom/discord/chat/presentation/root/MessageContext;-><init>(ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/reaction/ReactionsTheme;Lcom/discord/chat/bridge/truncation/Truncation;ZZZZZ)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/discord/chat/presentation/root/MessageContext;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/discord/chat/presentation/root/MessageContext;

    iget-boolean v1, p0, Lcom/discord/chat/presentation/root/MessageContext;->showDivider:Z

    iget-boolean v3, p1, Lcom/discord/chat/presentation/root/MessageContext;->showDivider:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/discord/chat/presentation/root/MessageContext;->canAddNewReactions:Z

    iget-boolean v3, p1, Lcom/discord/chat/presentation/root/MessageContext;->canAddNewReactions:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/discord/chat/presentation/root/MessageContext;->addReactionLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/chat/presentation/root/MessageContext;->addReactionLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/discord/chat/presentation/root/MessageContext;->addNewReactionAccessibilityLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/chat/presentation/root/MessageContext;->addNewReactionAccessibilityLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/discord/chat/presentation/root/MessageContext;->addNewBurstReactionAccessibilityLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/chat/presentation/root/MessageContext;->addNewBurstReactionAccessibilityLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/discord/chat/presentation/root/MessageContext;->reactionsTheme:Lcom/discord/chat/bridge/reaction/ReactionsTheme;

    iget-object v3, p1, Lcom/discord/chat/presentation/root/MessageContext;->reactionsTheme:Lcom/discord/chat/bridge/reaction/ReactionsTheme;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/discord/chat/presentation/root/MessageContext;->truncation:Lcom/discord/chat/bridge/truncation/Truncation;

    iget-object v3, p1, Lcom/discord/chat/presentation/root/MessageContext;->truncation:Lcom/discord/chat/bridge/truncation/Truncation;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Lcom/discord/chat/presentation/root/MessageContext;->useAttachmentGridLayout:Z

    iget-boolean v3, p1, Lcom/discord/chat/presentation/root/MessageContext;->useAttachmentGridLayout:Z

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-boolean v1, p0, Lcom/discord/chat/presentation/root/MessageContext;->useAttachmentUploadPreview:Z

    iget-boolean v3, p1, Lcom/discord/chat/presentation/root/MessageContext;->useAttachmentUploadPreview:Z

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-boolean v1, p0, Lcom/discord/chat/presentation/root/MessageContext;->enableSwipeToReply:Z

    iget-boolean v3, p1, Lcom/discord/chat/presentation/root/MessageContext;->enableSwipeToReply:Z

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget-boolean v1, p0, Lcom/discord/chat/presentation/root/MessageContext;->useSortedReactions:Z

    iget-boolean v3, p1, Lcom/discord/chat/presentation/root/MessageContext;->useSortedReactions:Z

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget-boolean v1, p0, Lcom/discord/chat/presentation/root/MessageContext;->useAddBurstReaction:Z

    iget-boolean p1, p1, Lcom/discord/chat/presentation/root/MessageContext;->useAddBurstReaction:Z

    if-eq v1, p1, :cond_d

    return v2

    :cond_d
    return v0
.end method

.method public final getAddNewBurstReactionAccessibilityLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/root/MessageContext;->addNewBurstReactionAccessibilityLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getAddNewReactionAccessibilityLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/root/MessageContext;->addNewReactionAccessibilityLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getAddReactionLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/root/MessageContext;->addReactionLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getCanAddNewReactions()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/presentation/root/MessageContext;->canAddNewReactions:Z

    return v0
.end method

.method public final getEnableSwipeToReply()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/presentation/root/MessageContext;->enableSwipeToReply:Z

    return v0
.end method

.method public final getReactionsTheme()Lcom/discord/chat/bridge/reaction/ReactionsTheme;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/root/MessageContext;->reactionsTheme:Lcom/discord/chat/bridge/reaction/ReactionsTheme;

    return-object v0
.end method

.method public final getShowDivider()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/presentation/root/MessageContext;->showDivider:Z

    return v0
.end method

.method public final getTruncation()Lcom/discord/chat/bridge/truncation/Truncation;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/root/MessageContext;->truncation:Lcom/discord/chat/bridge/truncation/Truncation;

    return-object v0
.end method

.method public final getUseAddBurstReaction()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/presentation/root/MessageContext;->useAddBurstReaction:Z

    return v0
.end method

.method public final getUseAttachmentGridLayout()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/presentation/root/MessageContext;->useAttachmentGridLayout:Z

    return v0
.end method

.method public final getUseAttachmentUploadPreview()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/presentation/root/MessageContext;->useAttachmentUploadPreview:Z

    return v0
.end method

.method public final getUseSortedReactions()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/presentation/root/MessageContext;->useSortedReactions:Z

    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-boolean v0, p0, Lcom/discord/chat/presentation/root/MessageContext;->showDivider:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    move v0, v1

    :cond_0
    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lcom/discord/chat/presentation/root/MessageContext;->canAddNewReactions:Z

    if-eqz v2, :cond_1

    move v2, v1

    :cond_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/discord/chat/presentation/root/MessageContext;->addReactionLabel:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/discord/chat/presentation/root/MessageContext;->addNewReactionAccessibilityLabel:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/discord/chat/presentation/root/MessageContext;->addNewBurstReactionAccessibilityLabel:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/discord/chat/presentation/root/MessageContext;->reactionsTheme:Lcom/discord/chat/bridge/reaction/ReactionsTheme;

    const/4 v3, 0x0

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_0

    :cond_2
    invoke-virtual {v2}, Lcom/discord/chat/bridge/reaction/ReactionsTheme;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/discord/chat/presentation/root/MessageContext;->truncation:Lcom/discord/chat/bridge/truncation/Truncation;

    if-nez v2, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {v2}, Lcom/discord/chat/bridge/truncation/Truncation;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lcom/discord/chat/presentation/root/MessageContext;->useAttachmentGridLayout:Z

    if-eqz v2, :cond_4

    move v2, v1

    :cond_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lcom/discord/chat/presentation/root/MessageContext;->useAttachmentUploadPreview:Z

    if-eqz v2, :cond_5

    move v2, v1

    :cond_5
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lcom/discord/chat/presentation/root/MessageContext;->enableSwipeToReply:Z

    if-eqz v2, :cond_6

    move v2, v1

    :cond_6
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lcom/discord/chat/presentation/root/MessageContext;->useSortedReactions:Z

    if-eqz v2, :cond_7

    move v2, v1

    :cond_7
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lcom/discord/chat/presentation/root/MessageContext;->useAddBurstReaction:Z

    if-eqz v2, :cond_8

    goto :goto_2

    :cond_8
    move v1, v2

    :goto_2
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 14

    iget-boolean v0, p0, Lcom/discord/chat/presentation/root/MessageContext;->showDivider:Z

    iget-boolean v1, p0, Lcom/discord/chat/presentation/root/MessageContext;->canAddNewReactions:Z

    iget-object v2, p0, Lcom/discord/chat/presentation/root/MessageContext;->addReactionLabel:Ljava/lang/String;

    iget-object v3, p0, Lcom/discord/chat/presentation/root/MessageContext;->addNewReactionAccessibilityLabel:Ljava/lang/String;

    iget-object v4, p0, Lcom/discord/chat/presentation/root/MessageContext;->addNewBurstReactionAccessibilityLabel:Ljava/lang/String;

    iget-object v5, p0, Lcom/discord/chat/presentation/root/MessageContext;->reactionsTheme:Lcom/discord/chat/bridge/reaction/ReactionsTheme;

    iget-object v6, p0, Lcom/discord/chat/presentation/root/MessageContext;->truncation:Lcom/discord/chat/bridge/truncation/Truncation;

    iget-boolean v7, p0, Lcom/discord/chat/presentation/root/MessageContext;->useAttachmentGridLayout:Z

    iget-boolean v8, p0, Lcom/discord/chat/presentation/root/MessageContext;->useAttachmentUploadPreview:Z

    iget-boolean v9, p0, Lcom/discord/chat/presentation/root/MessageContext;->enableSwipeToReply:Z

    iget-boolean v10, p0, Lcom/discord/chat/presentation/root/MessageContext;->useSortedReactions:Z

    iget-boolean v11, p0, Lcom/discord/chat/presentation/root/MessageContext;->useAddBurstReaction:Z

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "MessageContext(showDivider="

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", canAddNewReactions="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", addReactionLabel="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", addNewReactionAccessibilityLabel="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", addNewBurstReactionAccessibilityLabel="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", reactionsTheme="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", truncation="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", useAttachmentGridLayout="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", useAttachmentUploadPreview="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", enableSwipeToReply="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", useSortedReactions="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", useAddBurstReaction="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
