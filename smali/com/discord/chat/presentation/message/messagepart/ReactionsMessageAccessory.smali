.class public final Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;
.super Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001Bd\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0008\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u0019\u0010$\u001a\u00020\u0003H\u00c6\u0003\u00f8\u0001\u0002\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008%\u0010\u0015J\t\u0010&\u001a\u00020\u0008H\u00c6\u0003J\u000f\u0010\'\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\t\u0010(\u001a\u00020\u0008H\u00c6\u0003J\t\u0010)\u001a\u00020\u0008H\u00c6\u0003J\t\u0010*\u001a\u00020\u000bH\u00c6\u0003J\t\u0010+\u001a\u00020\u000bH\u00c6\u0003J\t\u0010,\u001a\u00020\u000bH\u00c6\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003J\u0084\u0001\u0010/\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000b2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u0008H\u00c6\u0001\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u00080\u00101J\u0013\u00102\u001a\u00020\u00082\u0008\u00103\u001a\u0004\u0018\u000104H\u00d6\u0003J\t\u00105\u001a\u000206H\u00d6\u0001J\t\u00107\u001a\u00020\u000bH\u00d6\u0001R\u0011\u0010\r\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R\u0011\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u0019R\u001f\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\n\n\u0002\u0010\u001c\u001a\u0004\u0008\u001b\u0010\u0015R\u0017\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001eR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010 R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\"R\u0011\u0010\u0012\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010\u0019\u0082\u0002\u000f\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u00068"
    }
    d2 = {
        "Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;",
        "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;",
        "messageId",
        "Lcom/discord/primitives/MessageId;",
        "reactions",
        "",
        "Lcom/discord/chat/bridge/reaction/MessageReaction;",
        "canAddNewReactions",
        "",
        "canAddNewBurstReactions",
        "addReactionLabel",
        "",
        "addNewReactionAccessibilityLabel",
        "addNewBurstReactionAccessibilityLabel",
        "reactionsTheme",
        "Lcom/discord/chat/bridge/reaction/ReactionsTheme;",
        "theme",
        "Lcom/discord/theme/DiscordTheme;",
        "useSortedReactions",
        "(Ljava/lang/String;Ljava/util/List;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/reaction/ReactionsTheme;Lcom/discord/theme/DiscordTheme;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "getAddNewBurstReactionAccessibilityLabel",
        "()Ljava/lang/String;",
        "getAddNewReactionAccessibilityLabel",
        "getAddReactionLabel",
        "getCanAddNewBurstReactions",
        "()Z",
        "getCanAddNewReactions",
        "getMessageId-3Eiw7ao",
        "Ljava/lang/String;",
        "getReactions",
        "()Ljava/util/List;",
        "getReactionsTheme",
        "()Lcom/discord/chat/bridge/reaction/ReactionsTheme;",
        "getTheme",
        "()Lcom/discord/theme/DiscordTheme;",
        "getUseSortedReactions",
        "component1",
        "component1-3Eiw7ao",
        "component10",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
        "copy-a6FnO-k",
        "(Ljava/lang/String;Ljava/util/List;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/reaction/ReactionsTheme;Lcom/discord/theme/DiscordTheme;Z)Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;",
        "equals",
        "other",
        "",
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

.field private final canAddNewBurstReactions:Z

.field private final canAddNewReactions:Z

.field private final messageId:Ljava/lang/String;

.field private final reactions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/discord/chat/bridge/reaction/MessageReaction;",
            ">;"
        }
    .end annotation
.end field

.field private final reactionsTheme:Lcom/discord/chat/bridge/reaction/ReactionsTheme;

.field private final theme:Lcom/discord/theme/DiscordTheme;

.field private final useSortedReactions:Z


# direct methods
.method private constructor <init>(Ljava/lang/String;Ljava/util/List;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/reaction/ReactionsTheme;Lcom/discord/theme/DiscordTheme;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/discord/chat/bridge/reaction/MessageReaction;",
            ">;ZZ",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/discord/chat/bridge/reaction/ReactionsTheme;",
            "Lcom/discord/theme/DiscordTheme;",
            "Z)V"
        }
    .end annotation

    const-string v0, "reactions"

    const/4 v1, 0x0

    .line 2
    invoke-direct {p0, p1, v0, v1}, Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;-><init>(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 3
    iput-object p1, p0, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->messageId:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->reactions:Ljava/util/List;

    .line 5
    iput-boolean p3, p0, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->canAddNewReactions:Z

    .line 6
    iput-boolean p4, p0, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->canAddNewBurstReactions:Z

    .line 7
    iput-object p5, p0, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->addReactionLabel:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->addNewReactionAccessibilityLabel:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->addNewBurstReactionAccessibilityLabel:Ljava/lang/String;

    .line 10
    iput-object p8, p0, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->reactionsTheme:Lcom/discord/chat/bridge/reaction/ReactionsTheme;

    .line 11
    iput-object p9, p0, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->theme:Lcom/discord/theme/DiscordTheme;

    .line 12
    iput-boolean p10, p0, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->useSortedReactions:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/util/List;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/reaction/ReactionsTheme;Lcom/discord/theme/DiscordTheme;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 13

    move/from16 v0, p11

    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    move-object v10, v0

    goto :goto_0

    :cond_0
    move-object/from16 v10, p9

    :goto_0
    const/4 v12, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v11, p10

    .line 1
    invoke-direct/range {v1 .. v12}, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;-><init>(Ljava/lang/String;Ljava/util/List;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/reaction/ReactionsTheme;Lcom/discord/theme/DiscordTheme;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/util/List;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/reaction/ReactionsTheme;Lcom/discord/theme/DiscordTheme;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct/range {p0 .. p10}, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;-><init>(Ljava/lang/String;Ljava/util/List;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/reaction/ReactionsTheme;Lcom/discord/theme/DiscordTheme;Z)V

    return-void
.end method

.method public static synthetic copy-a6FnO-k$default(Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;Ljava/lang/String;Ljava/util/List;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/reaction/ReactionsTheme;Lcom/discord/theme/DiscordTheme;ZILjava/lang/Object;)Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;
    .locals 11

    move-object v0, p0

    move/from16 v1, p11

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->getMessageId-3Eiw7ao()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->reactions:Ljava/util/List;

    goto :goto_1

    :cond_1
    move-object v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-boolean v4, v0, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->canAddNewReactions:Z

    goto :goto_2

    :cond_2
    move v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-boolean v5, v0, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->canAddNewBurstReactions:Z

    goto :goto_3

    :cond_3
    move v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->addReactionLabel:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->addNewReactionAccessibilityLabel:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->addNewBurstReactionAccessibilityLabel:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->reactionsTheme:Lcom/discord/chat/bridge/reaction/ReactionsTheme;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->theme:Lcom/discord/theme/DiscordTheme;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v1, v1, 0x200

    if-eqz v1, :cond_9

    iget-boolean v1, v0, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->useSortedReactions:Z

    goto :goto_9

    :cond_9
    move/from16 v1, p10

    :goto_9
    move-object p1, v2

    move-object p2, v3

    move p3, v4

    move p4, v5

    move-object/from16 p5, v6

    move-object/from16 p6, v7

    move-object/from16 p7, v8

    move-object/from16 p8, v9

    move-object/from16 p9, v10

    move/from16 p10, v1

    invoke-virtual/range {p0 .. p10}, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->copy-a6FnO-k(Ljava/lang/String;Ljava/util/List;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/reaction/ReactionsTheme;Lcom/discord/theme/DiscordTheme;Z)Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1-3Eiw7ao()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->getMessageId-3Eiw7ao()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final component10()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->useSortedReactions:Z

    return v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/discord/chat/bridge/reaction/MessageReaction;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->reactions:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->canAddNewReactions:Z

    return v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->canAddNewBurstReactions:Z

    return v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->addReactionLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->addNewReactionAccessibilityLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->addNewBurstReactionAccessibilityLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Lcom/discord/chat/bridge/reaction/ReactionsTheme;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->reactionsTheme:Lcom/discord/chat/bridge/reaction/ReactionsTheme;

    return-object v0
.end method

.method public final component9()Lcom/discord/theme/DiscordTheme;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->theme:Lcom/discord/theme/DiscordTheme;

    return-object v0
.end method

.method public final copy-a6FnO-k(Ljava/lang/String;Ljava/util/List;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/reaction/ReactionsTheme;Lcom/discord/theme/DiscordTheme;Z)Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/discord/chat/bridge/reaction/MessageReaction;",
            ">;ZZ",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/discord/chat/bridge/reaction/ReactionsTheme;",
            "Lcom/discord/theme/DiscordTheme;",
            "Z)",
            "Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;"
        }
    .end annotation

    const-string v0, "messageId"

    move-object v2, p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactions"

    move-object v3, p2

    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "addReactionLabel"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "addNewReactionAccessibilityLabel"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "addNewBurstReactionAccessibilityLabel"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;

    const/4 v12, 0x0

    move-object v1, v0

    move/from16 v4, p3

    move/from16 v5, p4

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move/from16 v11, p10

    invoke-direct/range {v1 .. v12}, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;-><init>(Ljava/lang/String;Ljava/util/List;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/reaction/ReactionsTheme;Lcom/discord/theme/DiscordTheme;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;

    invoke-virtual {p0}, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->getMessageId-3Eiw7ao()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->getMessageId-3Eiw7ao()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lcom/discord/primitives/MessageId;->equals-impl0(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->reactions:Ljava/util/List;

    iget-object v3, p1, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->reactions:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->canAddNewReactions:Z

    iget-boolean v3, p1, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->canAddNewReactions:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->canAddNewBurstReactions:Z

    iget-boolean v3, p1, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->canAddNewBurstReactions:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->addReactionLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->addReactionLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->addNewReactionAccessibilityLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->addNewReactionAccessibilityLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->addNewBurstReactionAccessibilityLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->addNewBurstReactionAccessibilityLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->reactionsTheme:Lcom/discord/chat/bridge/reaction/ReactionsTheme;

    iget-object v3, p1, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->reactionsTheme:Lcom/discord/chat/bridge/reaction/ReactionsTheme;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->theme:Lcom/discord/theme/DiscordTheme;

    iget-object v3, p1, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->theme:Lcom/discord/theme/DiscordTheme;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-boolean v1, p0, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->useSortedReactions:Z

    iget-boolean p1, p1, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->useSortedReactions:Z

    if-eq v1, p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public final getAddNewBurstReactionAccessibilityLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->addNewBurstReactionAccessibilityLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getAddNewReactionAccessibilityLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->addNewReactionAccessibilityLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getAddReactionLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->addReactionLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getCanAddNewBurstReactions()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->canAddNewBurstReactions:Z

    return v0
.end method

.method public final getCanAddNewReactions()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->canAddNewReactions:Z

    return v0
.end method

.method public getMessageId-3Eiw7ao()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->messageId:Ljava/lang/String;

    return-object v0
.end method

.method public final getReactions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/discord/chat/bridge/reaction/MessageReaction;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->reactions:Ljava/util/List;

    return-object v0
.end method

.method public final getReactionsTheme()Lcom/discord/chat/bridge/reaction/ReactionsTheme;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->reactionsTheme:Lcom/discord/chat/bridge/reaction/ReactionsTheme;

    return-object v0
.end method

.method public final getTheme()Lcom/discord/theme/DiscordTheme;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->theme:Lcom/discord/theme/DiscordTheme;

    return-object v0
.end method

.method public final getUseSortedReactions()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->useSortedReactions:Z

    return v0
.end method

.method public hashCode()I
    .locals 4

    invoke-virtual {p0}, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->getMessageId-3Eiw7ao()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/discord/primitives/MessageId;->hashCode-impl(Ljava/lang/String;)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->reactions:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->canAddNewReactions:Z

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    move v1, v2

    :cond_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->canAddNewBurstReactions:Z

    if-eqz v1, :cond_1

    move v1, v2

    :cond_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->addReactionLabel:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->addNewReactionAccessibilityLabel:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->addNewBurstReactionAccessibilityLabel:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->reactionsTheme:Lcom/discord/chat/bridge/reaction/ReactionsTheme;

    const/4 v3, 0x0

    if-nez v1, :cond_2

    move v1, v3

    goto :goto_0

    :cond_2
    invoke-virtual {v1}, Lcom/discord/chat/bridge/reaction/ReactionsTheme;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->theme:Lcom/discord/theme/DiscordTheme;

    if-nez v1, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->useSortedReactions:Z

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    move v2, v1

    :goto_2
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 12

    invoke-virtual {p0}, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->getMessageId-3Eiw7ao()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/discord/primitives/MessageId;->toString-impl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->reactions:Ljava/util/List;

    iget-boolean v2, p0, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->canAddNewReactions:Z

    iget-boolean v3, p0, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->canAddNewBurstReactions:Z

    iget-object v4, p0, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->addReactionLabel:Ljava/lang/String;

    iget-object v5, p0, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->addNewReactionAccessibilityLabel:Ljava/lang/String;

    iget-object v6, p0, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->addNewBurstReactionAccessibilityLabel:Ljava/lang/String;

    iget-object v7, p0, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->reactionsTheme:Lcom/discord/chat/bridge/reaction/ReactionsTheme;

    iget-object v8, p0, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->theme:Lcom/discord/theme/DiscordTheme;

    iget-boolean v9, p0, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->useSortedReactions:Z

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "ReactionsMessageAccessory(messageId="

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", reactions="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", canAddNewReactions="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", canAddNewBurstReactions="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", addReactionLabel="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", addNewReactionAccessibilityLabel="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", addNewBurstReactionAccessibilityLabel="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", reactionsTheme="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", theme="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", useSortedReactions="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
