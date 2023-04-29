.class public final Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;
.super Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\"\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001BV\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0019\u0010%\u001a\u00020\u0003H\u00c6\u0003\u00f8\u0001\u0002\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008&\u0010\u001cJ\t\u0010\'\u001a\u00020\u0005H\u00c6\u0003J\t\u0010(\u001a\u00020\u0007H\u00c6\u0003J\t\u0010)\u001a\u00020\u0005H\u00c6\u0003J\t\u0010*\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\t\u0010-\u001a\u00020\u000fH\u00c6\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0018Jv\u0010/\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00052\u0008\u0008\u0002\u0010\t\u001a\u00020\u00052\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\r2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000f2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00c6\u0001\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u00080\u00101J\u0013\u00102\u001a\u00020\u000f2\u0008\u00103\u001a\u0004\u0018\u000104H\u00d6\u0003J\t\u00105\u001a\u00020\u0005H\u00d6\u0001J\t\u00106\u001a\u000207H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\n\n\u0002\u0010\u0019\u001a\u0004\u0008\u0017\u0010\u0018R\u0011\u0010\u0008\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u0016R\u001f\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\n\n\u0002\u0010\u001d\u001a\u0004\u0008\u001b\u0010\u001cR\u0013\u0010\u000c\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u001fR\u0011\u0010\t\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\"R\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010$\u0082\u0002\u000f\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u00068"
    }
    d2 = {
        "Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;",
        "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;",
        "messageId",
        "Lcom/discord/primitives/MessageId;",
        "attachmentIndex",
        "",
        "attachment",
        "Lcom/discord/chat/bridge/attachment/Attachment;",
        "constrainedWidth",
        "radiusPx",
        "spoilerAttributes",
        "Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;",
        "onLongClick",
        "Landroid/view/View$OnLongClickListener;",
        "useNewAltTextButton",
        "",
        "attachmentsOpacity",
        "",
        "(Ljava/lang/String;ILcom/discord/chat/bridge/attachment/Attachment;IILcom/discord/chat/bridge/spoiler/SpoilerAttributes;Landroid/view/View$OnLongClickListener;ZLjava/lang/Float;Lkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "getAttachment",
        "()Lcom/discord/chat/bridge/attachment/Attachment;",
        "getAttachmentIndex",
        "()I",
        "getAttachmentsOpacity",
        "()Ljava/lang/Float;",
        "Ljava/lang/Float;",
        "getConstrainedWidth",
        "getMessageId-3Eiw7ao",
        "()Ljava/lang/String;",
        "Ljava/lang/String;",
        "getOnLongClick",
        "()Landroid/view/View$OnLongClickListener;",
        "getRadiusPx",
        "getSpoilerAttributes",
        "()Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;",
        "getUseNewAltTextButton",
        "()Z",
        "component1",
        "component1-3Eiw7ao",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
        "copy-IwdeaXA",
        "(Ljava/lang/String;ILcom/discord/chat/bridge/attachment/Attachment;IILcom/discord/chat/bridge/spoiler/SpoilerAttributes;Landroid/view/View$OnLongClickListener;ZLjava/lang/Float;)Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;",
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
.field private final attachment:Lcom/discord/chat/bridge/attachment/Attachment;

.field private final attachmentIndex:I

.field private final attachmentsOpacity:Ljava/lang/Float;

.field private final constrainedWidth:I

.field private final messageId:Ljava/lang/String;

.field private final onLongClick:Landroid/view/View$OnLongClickListener;

.field private final radiusPx:I

.field private final spoilerAttributes:Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;

.field private final useNewAltTextButton:Z


# direct methods
.method private constructor <init>(Ljava/lang/String;ILcom/discord/chat/bridge/attachment/Attachment;IILcom/discord/chat/bridge/spoiler/SpoilerAttributes;Landroid/view/View$OnLongClickListener;ZLjava/lang/Float;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "image attachment "

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
    iput-object p1, p0, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;->messageId:Ljava/lang/String;

    .line 23
    .line 24
    iput p2, p0, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;->attachmentIndex:I

    .line 25
    .line 26
    iput-object p3, p0, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;->attachment:Lcom/discord/chat/bridge/attachment/Attachment;

    .line 27
    .line 28
    iput p4, p0, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;->constrainedWidth:I

    .line 29
    .line 30
    iput p5, p0, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;->radiusPx:I

    .line 31
    .line 32
    iput-object p6, p0, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;->spoilerAttributes:Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;

    .line 33
    .line 34
    iput-object p7, p0, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;->onLongClick:Landroid/view/View$OnLongClickListener;

    .line 35
    .line 36
    iput-boolean p8, p0, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;->useNewAltTextButton:Z

    .line 37
    .line 38
    iput-object p9, p0, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;->attachmentsOpacity:Ljava/lang/Float;

    .line 39
    .line 40
    return-void
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILcom/discord/chat/bridge/attachment/Attachment;IILcom/discord/chat/bridge/spoiler/SpoilerAttributes;Landroid/view/View$OnLongClickListener;ZLjava/lang/Float;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct/range {p0 .. p9}, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;-><init>(Ljava/lang/String;ILcom/discord/chat/bridge/attachment/Attachment;IILcom/discord/chat/bridge/spoiler/SpoilerAttributes;Landroid/view/View$OnLongClickListener;ZLjava/lang/Float;)V

    return-void
.end method

.method public static synthetic copy-IwdeaXA$default(Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;Ljava/lang/String;ILcom/discord/chat/bridge/attachment/Attachment;IILcom/discord/chat/bridge/spoiler/SpoilerAttributes;Landroid/view/View$OnLongClickListener;ZLjava/lang/Float;ILjava/lang/Object;)Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;
    .locals 10

    move-object v0, p0

    move/from16 v1, p10

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;->getMessageId-3Eiw7ao()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget v3, v0, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;->attachmentIndex:I

    goto :goto_1

    :cond_1
    move v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;->attachment:Lcom/discord/chat/bridge/attachment/Attachment;

    goto :goto_2

    :cond_2
    move-object v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget v5, v0, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;->constrainedWidth:I

    goto :goto_3

    :cond_3
    move v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget v6, v0, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;->radiusPx:I

    goto :goto_4

    :cond_4
    move v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;->spoilerAttributes:Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;->onLongClick:Landroid/view/View$OnLongClickListener;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-boolean v9, v0, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;->useNewAltTextButton:Z

    goto :goto_7

    :cond_7
    move/from16 v9, p8

    :goto_7
    and-int/lit16 v1, v1, 0x100

    if-eqz v1, :cond_8

    iget-object v1, v0, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;->attachmentsOpacity:Ljava/lang/Float;

    goto :goto_8

    :cond_8
    move-object/from16 v1, p9

    :goto_8
    move-object p1, v2

    move p2, v3

    move-object p3, v4

    move p4, v5

    move p5, v6

    move-object/from16 p6, v7

    move-object/from16 p7, v8

    move/from16 p8, v9

    move-object/from16 p9, v1

    invoke-virtual/range {p0 .. p9}, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;->copy-IwdeaXA(Ljava/lang/String;ILcom/discord/chat/bridge/attachment/Attachment;IILcom/discord/chat/bridge/spoiler/SpoilerAttributes;Landroid/view/View$OnLongClickListener;ZLjava/lang/Float;)Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1-3Eiw7ao()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;->getMessageId-3Eiw7ao()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;->attachmentIndex:I

    return v0
.end method

.method public final component3()Lcom/discord/chat/bridge/attachment/Attachment;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;->attachment:Lcom/discord/chat/bridge/attachment/Attachment;

    return-object v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;->constrainedWidth:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;->radiusPx:I

    return v0
.end method

.method public final component6()Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;->spoilerAttributes:Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;

    return-object v0
.end method

.method public final component7()Landroid/view/View$OnLongClickListener;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;->onLongClick:Landroid/view/View$OnLongClickListener;

    return-object v0
.end method

.method public final component8()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;->useNewAltTextButton:Z

    return v0
.end method

.method public final component9()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;->attachmentsOpacity:Ljava/lang/Float;

    return-object v0
.end method

.method public final copy-IwdeaXA(Ljava/lang/String;ILcom/discord/chat/bridge/attachment/Attachment;IILcom/discord/chat/bridge/spoiler/SpoilerAttributes;Landroid/view/View$OnLongClickListener;ZLjava/lang/Float;)Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;
    .locals 12

    const-string v0, "messageId"

    move-object v2, p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attachment"

    move-object v4, p3

    invoke-static {p3, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;

    const/4 v11, 0x0

    move-object v1, v0

    move v3, p2

    move/from16 v5, p4

    move/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v9, p8

    move-object/from16 v10, p9

    invoke-direct/range {v1 .. v11}, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;-><init>(Ljava/lang/String;ILcom/discord/chat/bridge/attachment/Attachment;IILcom/discord/chat/bridge/spoiler/SpoilerAttributes;Landroid/view/View$OnLongClickListener;ZLjava/lang/Float;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;

    invoke-virtual {p0}, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;->getMessageId-3Eiw7ao()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;->getMessageId-3Eiw7ao()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lcom/discord/primitives/MessageId;->equals-impl0(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;->attachmentIndex:I

    iget v3, p1, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;->attachmentIndex:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;->attachment:Lcom/discord/chat/bridge/attachment/Attachment;

    iget-object v3, p1, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;->attachment:Lcom/discord/chat/bridge/attachment/Attachment;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;->constrainedWidth:I

    iget v3, p1, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;->constrainedWidth:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;->radiusPx:I

    iget v3, p1, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;->radiusPx:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;->spoilerAttributes:Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;

    iget-object v3, p1, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;->spoilerAttributes:Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;->onLongClick:Landroid/view/View$OnLongClickListener;

    iget-object v3, p1, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;->onLongClick:Landroid/view/View$OnLongClickListener;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;->useNewAltTextButton:Z

    iget-boolean v3, p1, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;->useNewAltTextButton:Z

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;->attachmentsOpacity:Ljava/lang/Float;

    iget-object p1, p1, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;->attachmentsOpacity:Ljava/lang/Float;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final getAttachment()Lcom/discord/chat/bridge/attachment/Attachment;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;->attachment:Lcom/discord/chat/bridge/attachment/Attachment;

    return-object v0
.end method

.method public final getAttachmentIndex()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;->attachmentIndex:I

    return v0
.end method

.method public final getAttachmentsOpacity()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;->attachmentsOpacity:Ljava/lang/Float;

    return-object v0
.end method

.method public final getConstrainedWidth()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;->constrainedWidth:I

    return v0
.end method

.method public getMessageId-3Eiw7ao()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;->messageId:Ljava/lang/String;

    return-object v0
.end method

.method public final getOnLongClick()Landroid/view/View$OnLongClickListener;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;->onLongClick:Landroid/view/View$OnLongClickListener;

    return-object v0
.end method

.method public final getRadiusPx()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;->radiusPx:I

    return v0
.end method

.method public final getSpoilerAttributes()Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;->spoilerAttributes:Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;

    return-object v0
.end method

.method public final getUseNewAltTextButton()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;->useNewAltTextButton:Z

    return v0
.end method

.method public hashCode()I
    .locals 3

    invoke-virtual {p0}, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;->getMessageId-3Eiw7ao()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/discord/primitives/MessageId;->hashCode-impl(Ljava/lang/String;)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;->attachmentIndex:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;->attachment:Lcom/discord/chat/bridge/attachment/Attachment;

    invoke-virtual {v1}, Lcom/discord/chat/bridge/attachment/Attachment;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;->constrainedWidth:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;->radiusPx:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;->spoilerAttributes:Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;->onLongClick:Landroid/view/View$OnLongClickListener;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;->useNewAltTextButton:Z

    if-eqz v1, :cond_2

    const/4 v1, 0x1

    :cond_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;->attachmentsOpacity:Ljava/lang/Float;

    if-nez v1, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    invoke-virtual {p0}, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;->getMessageId-3Eiw7ao()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/discord/primitives/MessageId;->toString-impl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget v1, p0, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;->attachmentIndex:I

    iget-object v2, p0, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;->attachment:Lcom/discord/chat/bridge/attachment/Attachment;

    iget v3, p0, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;->constrainedWidth:I

    iget v4, p0, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;->radiusPx:I

    iget-object v5, p0, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;->spoilerAttributes:Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;

    iget-object v6, p0, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;->onLongClick:Landroid/view/View$OnLongClickListener;

    iget-boolean v7, p0, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;->useNewAltTextButton:Z

    iget-object v8, p0, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;->attachmentsOpacity:Ljava/lang/Float;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "ImageAttachmentMessageAccessory(messageId="

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", attachmentIndex="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", attachment="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", constrainedWidth="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", radiusPx="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", spoilerAttributes="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", onLongClick="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", useNewAltTextButton="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", attachmentsOpacity="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
