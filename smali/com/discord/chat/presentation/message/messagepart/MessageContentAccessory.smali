.class public final Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;
.super Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008-\n\u0002\u0010\u0000\n\u0002\u0008\u0003\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u008a\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0008\u0008\u0001\u0010\u000c\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u000b\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u0018\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J\u0019\u00101\u001a\u00020\u0003H\u00c6\u0003\u00f8\u0001\u0002\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u00082\u0010 J\t\u00103\u001a\u00020\u000bH\u00c6\u0003J\t\u00104\u001a\u00020\u0007H\u00c6\u0003J\t\u00105\u001a\u00020\u000bH\u00c6\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0016H\u00c6\u0003J\t\u00108\u001a\u00020\u0018H\u00c6\u0003J\t\u00109\u001a\u00020\u0005H\u00c6\u0003J\t\u0010:\u001a\u00020\u0007H\u00c6\u0003J\t\u0010;\u001a\u00020\u0007H\u00c6\u0003J\t\u0010<\u001a\u00020\u0007H\u00c6\u0003J\t\u0010=\u001a\u00020\u000bH\u00c6\u0003J\t\u0010>\u001a\u00020\u000bH\u00c6\u0003J\t\u0010?\u001a\u00020\u000bH\u00c6\u0003J\t\u0010@\u001a\u00020\u000fH\u00c6\u0003J\u00b0\u0001\u0010A\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\u00072\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b2\u0008\u0008\u0003\u0010\u000c\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u000b2\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u0018H\u00c6\u0001\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008B\u0010CJ\u0013\u0010D\u001a\u00020\u00072\u0008\u0010E\u001a\u0004\u0018\u00010FH\u00d6\u0003J\t\u0010G\u001a\u00020\u000bH\u00d6\u0001J\t\u0010H\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0011\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u001bR\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001dR\u0011\u0010\u0012\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u001dR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010 R\u0011\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\u001dR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010#R\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010%R\u001f\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\n\n\u0002\u0010\'\u001a\u0004\u0008&\u0010 R\u0011\u0010\r\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008(\u0010\u001dR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008)\u0010\u001bR\u0011\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008*\u0010\u001bR\u0011\u0010\t\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008+\u0010\u001bR\u0011\u0010\u0010\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008,\u0010\u001dR\u0011\u0010\u0017\u001a\u00020\u0018\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008-\u0010.R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008/\u00100\u0082\u0002\u000f\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006I"
    }
    d2 = {
        "Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;",
        "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;",
        "messageId",
        "Lcom/discord/primitives/MessageId;",
        "messageContent",
        "Lcom/discord/chat/bridge/structurabletext/StructurableText;",
        "shouldAnimateEmoji",
        "",
        "shouldShowRoleDot",
        "shouldShowRoleOnName",
        "bottomSpacingPx",
        "",
        "linkColor",
        "messageTextColor",
        "messageFont",
        "Lcom/discord/fonts/DiscordFont;",
        "textSizeSp",
        "boldLinkText",
        "constrainedWidth",
        "editedLabel",
        "",
        "truncation",
        "Lcom/discord/chat/bridge/truncation/Truncation;",
        "theme",
        "Lcom/discord/theme/DiscordTheme;",
        "(Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;ZZZIIILcom/discord/fonts/DiscordFont;IZILjava/lang/String;Lcom/discord/chat/bridge/truncation/Truncation;Lcom/discord/theme/DiscordTheme;Lkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "getBoldLinkText",
        "()Z",
        "getBottomSpacingPx",
        "()I",
        "getConstrainedWidth",
        "getEditedLabel",
        "()Ljava/lang/String;",
        "getLinkColor",
        "getMessageContent",
        "()Lcom/discord/chat/bridge/structurabletext/StructurableText;",
        "getMessageFont",
        "()Lcom/discord/fonts/DiscordFont;",
        "getMessageId-3Eiw7ao",
        "Ljava/lang/String;",
        "getMessageTextColor",
        "getShouldAnimateEmoji",
        "getShouldShowRoleDot",
        "getShouldShowRoleOnName",
        "getTextSizeSp",
        "getTheme",
        "()Lcom/discord/theme/DiscordTheme;",
        "getTruncation",
        "()Lcom/discord/chat/bridge/truncation/Truncation;",
        "component1",
        "component1-3Eiw7ao",
        "component10",
        "component11",
        "component12",
        "component13",
        "component14",
        "component15",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
        "copy-UwkiYZs",
        "(Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;ZZZIIILcom/discord/fonts/DiscordFont;IZILjava/lang/String;Lcom/discord/chat/bridge/truncation/Truncation;Lcom/discord/theme/DiscordTheme;)Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;",
        "equals",
        "other",
        "",
        "hashCode",
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
.field private final boldLinkText:Z

.field private final bottomSpacingPx:I

.field private final constrainedWidth:I

.field private final editedLabel:Ljava/lang/String;

.field private final linkColor:I

.field private final messageContent:Lcom/discord/chat/bridge/structurabletext/StructurableText;

.field private final messageFont:Lcom/discord/fonts/DiscordFont;

.field private final messageId:Ljava/lang/String;

.field private final messageTextColor:I

.field private final shouldAnimateEmoji:Z

.field private final shouldShowRoleDot:Z

.field private final shouldShowRoleOnName:Z

.field private final textSizeSp:I

.field private final theme:Lcom/discord/theme/DiscordTheme;

.field private final truncation:Lcom/discord/chat/bridge/truncation/Truncation;


# direct methods
.method private constructor <init>(Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;ZZZIIILcom/discord/fonts/DiscordFont;IZILjava/lang/String;Lcom/discord/chat/bridge/truncation/Truncation;Lcom/discord/theme/DiscordTheme;)V
    .locals 4

    move-object v0, p0

    move-object v1, p1

    const-string v2, "message content"

    const/4 v3, 0x0

    .line 3
    invoke-direct {p0, p1, v2, v3}, Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;-><init>(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 4
    iput-object v1, v0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->messageId:Ljava/lang/String;

    move-object v1, p2

    .line 5
    iput-object v1, v0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->messageContent:Lcom/discord/chat/bridge/structurabletext/StructurableText;

    move v1, p3

    .line 6
    iput-boolean v1, v0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->shouldAnimateEmoji:Z

    move v1, p4

    .line 7
    iput-boolean v1, v0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->shouldShowRoleDot:Z

    move v1, p5

    .line 8
    iput-boolean v1, v0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->shouldShowRoleOnName:Z

    move v1, p6

    .line 9
    iput v1, v0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->bottomSpacingPx:I

    move v1, p7

    .line 10
    iput v1, v0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->linkColor:I

    move v1, p8

    .line 11
    iput v1, v0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->messageTextColor:I

    move-object v1, p9

    .line 12
    iput-object v1, v0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->messageFont:Lcom/discord/fonts/DiscordFont;

    move v1, p10

    .line 13
    iput v1, v0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->textSizeSp:I

    move v1, p11

    .line 14
    iput-boolean v1, v0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->boldLinkText:Z

    move/from16 v1, p12

    .line 15
    iput v1, v0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->constrainedWidth:I

    move-object/from16 v1, p13

    .line 16
    iput-object v1, v0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->editedLabel:Ljava/lang/String;

    move-object/from16 v1, p14

    .line 17
    iput-object v1, v0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->truncation:Lcom/discord/chat/bridge/truncation/Truncation;

    move-object/from16 v1, p15

    .line 18
    iput-object v1, v0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->theme:Lcom/discord/theme/DiscordTheme;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;ZZZIIILcom/discord/fonts/DiscordFont;IZILjava/lang/String;Lcom/discord/chat/bridge/truncation/Truncation;Lcom/discord/theme/DiscordTheme;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 19

    move/from16 v0, p16

    and-int/lit16 v1, v0, 0x2000

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    move-object/from16 v16, v1

    goto :goto_0

    :cond_0
    move-object/from16 v16, p14

    :goto_0
    and-int/lit16 v0, v0, 0x4000

    if-eqz v0, :cond_1

    .line 1
    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object v0

    move-object/from16 v17, v0

    goto :goto_1

    :cond_1
    move-object/from16 v17, p15

    :goto_1
    const/16 v18, 0x0

    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move/from16 v5, p3

    move/from16 v6, p4

    move/from16 v7, p5

    move/from16 v8, p6

    move/from16 v9, p7

    move/from16 v10, p8

    move-object/from16 v11, p9

    move/from16 v12, p10

    move/from16 v13, p11

    move/from16 v14, p12

    move-object/from16 v15, p13

    .line 2
    invoke-direct/range {v2 .. v18}, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;-><init>(Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;ZZZIIILcom/discord/fonts/DiscordFont;IZILjava/lang/String;Lcom/discord/chat/bridge/truncation/Truncation;Lcom/discord/theme/DiscordTheme;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;ZZZIIILcom/discord/fonts/DiscordFont;IZILjava/lang/String;Lcom/discord/chat/bridge/truncation/Truncation;Lcom/discord/theme/DiscordTheme;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct/range {p0 .. p15}, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;-><init>(Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;ZZZIIILcom/discord/fonts/DiscordFont;IZILjava/lang/String;Lcom/discord/chat/bridge/truncation/Truncation;Lcom/discord/theme/DiscordTheme;)V

    return-void
.end method

.method public static synthetic copy-UwkiYZs$default(Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;ZZZIIILcom/discord/fonts/DiscordFont;IZILjava/lang/String;Lcom/discord/chat/bridge/truncation/Truncation;Lcom/discord/theme/DiscordTheme;ILjava/lang/Object;)Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;
    .locals 16

    move-object/from16 v0, p0

    move/from16 v1, p16

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->getMessageId-3Eiw7ao()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->messageContent:Lcom/discord/chat/bridge/structurabletext/StructurableText;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-boolean v4, v0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->shouldAnimateEmoji:Z

    goto :goto_2

    :cond_2
    move/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-boolean v5, v0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->shouldShowRoleDot:Z

    goto :goto_3

    :cond_3
    move/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-boolean v6, v0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->shouldShowRoleOnName:Z

    goto :goto_4

    :cond_4
    move/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget v7, v0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->bottomSpacingPx:I

    goto :goto_5

    :cond_5
    move/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget v8, v0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->linkColor:I

    goto :goto_6

    :cond_6
    move/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget v9, v0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->messageTextColor:I

    goto :goto_7

    :cond_7
    move/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->messageFont:Lcom/discord/fonts/DiscordFont;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget v11, v0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->textSizeSp:I

    goto :goto_9

    :cond_9
    move/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-boolean v12, v0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->boldLinkText:Z

    goto :goto_a

    :cond_a
    move/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget v13, v0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->constrainedWidth:I

    goto :goto_b

    :cond_b
    move/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->editedLabel:Ljava/lang/String;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->truncation:Lcom/discord/chat/bridge/truncation/Truncation;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    and-int/lit16 v1, v1, 0x4000

    if-eqz v1, :cond_e

    iget-object v1, v0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->theme:Lcom/discord/theme/DiscordTheme;

    goto :goto_e

    :cond_e
    move-object/from16 v1, p15

    :goto_e
    move-object/from16 p1, v2

    move-object/from16 p2, v3

    move/from16 p3, v4

    move/from16 p4, v5

    move/from16 p5, v6

    move/from16 p6, v7

    move/from16 p7, v8

    move/from16 p8, v9

    move-object/from16 p9, v10

    move/from16 p10, v11

    move/from16 p11, v12

    move/from16 p12, v13

    move-object/from16 p13, v14

    move-object/from16 p14, v15

    move-object/from16 p15, v1

    invoke-virtual/range {p0 .. p15}, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->copy-UwkiYZs(Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;ZZZIIILcom/discord/fonts/DiscordFont;IZILjava/lang/String;Lcom/discord/chat/bridge/truncation/Truncation;Lcom/discord/theme/DiscordTheme;)Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1-3Eiw7ao()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->getMessageId-3Eiw7ao()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final component10()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->textSizeSp:I

    return v0
.end method

.method public final component11()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->boldLinkText:Z

    return v0
.end method

.method public final component12()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->constrainedWidth:I

    return v0
.end method

.method public final component13()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->editedLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component14()Lcom/discord/chat/bridge/truncation/Truncation;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->truncation:Lcom/discord/chat/bridge/truncation/Truncation;

    return-object v0
.end method

.method public final component15()Lcom/discord/theme/DiscordTheme;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->theme:Lcom/discord/theme/DiscordTheme;

    return-object v0
.end method

.method public final component2()Lcom/discord/chat/bridge/structurabletext/StructurableText;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->messageContent:Lcom/discord/chat/bridge/structurabletext/StructurableText;

    return-object v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->shouldAnimateEmoji:Z

    return v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->shouldShowRoleDot:Z

    return v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->shouldShowRoleOnName:Z

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->bottomSpacingPx:I

    return v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->linkColor:I

    return v0
.end method

.method public final component8()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->messageTextColor:I

    return v0
.end method

.method public final component9()Lcom/discord/fonts/DiscordFont;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->messageFont:Lcom/discord/fonts/DiscordFont;

    return-object v0
.end method

.method public final copy-UwkiYZs(Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;ZZZIIILcom/discord/fonts/DiscordFont;IZILjava/lang/String;Lcom/discord/chat/bridge/truncation/Truncation;Lcom/discord/theme/DiscordTheme;)Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;
    .locals 19

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

    move/from16 v5, p5

    move/from16 v6, p6

    move/from16 v7, p7

    move/from16 v8, p8

    move-object/from16 v9, p9

    move/from16 v10, p10

    move/from16 v11, p11

    move/from16 v12, p12

    move-object/from16 v13, p13

    move-object/from16 v14, p14

    move-object/from16 v15, p15

    const-string v0, "messageId"

    move-object/from16 v17, v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageContent"

    move-object/from16 v1, p2

    invoke-static {v1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageFont"

    move-object/from16 v1, p9

    invoke-static {v1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "theme"

    move-object/from16 v1, p15

    invoke-static {v1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v18, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;

    move-object/from16 v0, v18

    const/16 v16, 0x0

    move-object/from16 v1, v17

    invoke-direct/range {v0 .. v16}, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;-><init>(Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;ZZZIIILcom/discord/fonts/DiscordFont;IZILjava/lang/String;Lcom/discord/chat/bridge/truncation/Truncation;Lcom/discord/theme/DiscordTheme;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v18
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;

    invoke-virtual {p0}, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->getMessageId-3Eiw7ao()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->getMessageId-3Eiw7ao()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lcom/discord/primitives/MessageId;->equals-impl0(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->messageContent:Lcom/discord/chat/bridge/structurabletext/StructurableText;

    iget-object v3, p1, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->messageContent:Lcom/discord/chat/bridge/structurabletext/StructurableText;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->shouldAnimateEmoji:Z

    iget-boolean v3, p1, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->shouldAnimateEmoji:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->shouldShowRoleDot:Z

    iget-boolean v3, p1, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->shouldShowRoleDot:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->shouldShowRoleOnName:Z

    iget-boolean v3, p1, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->shouldShowRoleOnName:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->bottomSpacingPx:I

    iget v3, p1, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->bottomSpacingPx:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->linkColor:I

    iget v3, p1, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->linkColor:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->messageTextColor:I

    iget v3, p1, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->messageTextColor:I

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->messageFont:Lcom/discord/fonts/DiscordFont;

    iget-object v3, p1, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->messageFont:Lcom/discord/fonts/DiscordFont;

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget v1, p0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->textSizeSp:I

    iget v3, p1, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->textSizeSp:I

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget-boolean v1, p0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->boldLinkText:Z

    iget-boolean v3, p1, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->boldLinkText:Z

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget v1, p0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->constrainedWidth:I

    iget v3, p1, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->constrainedWidth:I

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->editedLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->editedLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->truncation:Lcom/discord/chat/bridge/truncation/Truncation;

    iget-object v3, p1, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->truncation:Lcom/discord/chat/bridge/truncation/Truncation;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->theme:Lcom/discord/theme/DiscordTheme;

    iget-object p1, p1, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->theme:Lcom/discord/theme/DiscordTheme;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_10

    return v2

    :cond_10
    return v0
.end method

.method public final getBoldLinkText()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->boldLinkText:Z

    return v0
.end method

.method public final getBottomSpacingPx()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->bottomSpacingPx:I

    return v0
.end method

.method public final getConstrainedWidth()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->constrainedWidth:I

    return v0
.end method

.method public final getEditedLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->editedLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getLinkColor()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->linkColor:I

    return v0
.end method

.method public final getMessageContent()Lcom/discord/chat/bridge/structurabletext/StructurableText;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->messageContent:Lcom/discord/chat/bridge/structurabletext/StructurableText;

    return-object v0
.end method

.method public final getMessageFont()Lcom/discord/fonts/DiscordFont;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->messageFont:Lcom/discord/fonts/DiscordFont;

    return-object v0
.end method

.method public getMessageId-3Eiw7ao()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->messageId:Ljava/lang/String;

    return-object v0
.end method

.method public final getMessageTextColor()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->messageTextColor:I

    return v0
.end method

.method public final getShouldAnimateEmoji()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->shouldAnimateEmoji:Z

    return v0
.end method

.method public final getShouldShowRoleDot()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->shouldShowRoleDot:Z

    return v0
.end method

.method public final getShouldShowRoleOnName()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->shouldShowRoleOnName:Z

    return v0
.end method

.method public final getTextSizeSp()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->textSizeSp:I

    return v0
.end method

.method public final getTheme()Lcom/discord/theme/DiscordTheme;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->theme:Lcom/discord/theme/DiscordTheme;

    return-object v0
.end method

.method public final getTruncation()Lcom/discord/chat/bridge/truncation/Truncation;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->truncation:Lcom/discord/chat/bridge/truncation/Truncation;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    invoke-virtual {p0}, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->getMessageId-3Eiw7ao()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/discord/primitives/MessageId;->hashCode-impl(Ljava/lang/String;)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->messageContent:Lcom/discord/chat/bridge/structurabletext/StructurableText;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->shouldAnimateEmoji:Z

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    move v1, v2

    :cond_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->shouldShowRoleDot:Z

    if-eqz v1, :cond_1

    move v1, v2

    :cond_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->shouldShowRoleOnName:Z

    if-eqz v1, :cond_2

    move v1, v2

    :cond_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->bottomSpacingPx:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->linkColor:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->messageTextColor:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->messageFont:Lcom/discord/fonts/DiscordFont;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->textSizeSp:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->boldLinkText:Z

    if-eqz v1, :cond_3

    goto :goto_0

    :cond_3
    move v2, v1

    :goto_0
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->constrainedWidth:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->editedLabel:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_4

    move v1, v2

    goto :goto_1

    :cond_4
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->truncation:Lcom/discord/chat/bridge/truncation/Truncation;

    if-nez v1, :cond_5

    goto :goto_2

    :cond_5
    invoke-virtual {v1}, Lcom/discord/chat/bridge/truncation/Truncation;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->theme:Lcom/discord/theme/DiscordTheme;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 17

    move-object/from16 v0, p0

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->getMessageId-3Eiw7ao()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/discord/primitives/MessageId;->toString-impl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, v0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->messageContent:Lcom/discord/chat/bridge/structurabletext/StructurableText;

    iget-boolean v3, v0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->shouldAnimateEmoji:Z

    iget-boolean v4, v0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->shouldShowRoleDot:Z

    iget-boolean v5, v0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->shouldShowRoleOnName:Z

    iget v6, v0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->bottomSpacingPx:I

    iget v7, v0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->linkColor:I

    iget v8, v0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->messageTextColor:I

    iget-object v9, v0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->messageFont:Lcom/discord/fonts/DiscordFont;

    iget v10, v0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->textSizeSp:I

    iget-boolean v11, v0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->boldLinkText:Z

    iget v12, v0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->constrainedWidth:I

    iget-object v13, v0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->editedLabel:Ljava/lang/String;

    iget-object v14, v0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->truncation:Lcom/discord/chat/bridge/truncation/Truncation;

    iget-object v15, v0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->theme:Lcom/discord/theme/DiscordTheme;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v16, v15

    const-string v15, "MessageContentAccessory(messageId="

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", messageContent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", shouldAnimateEmoji="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", shouldShowRoleDot="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", shouldShowRoleOnName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", bottomSpacingPx="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", linkColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", messageTextColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", messageFont="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", textSizeSp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", boldLinkText="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", constrainedWidth="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", editedLabel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", truncation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", theme="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
