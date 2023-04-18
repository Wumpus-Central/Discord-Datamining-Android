.class public final Lcom/discord/chat/presentation/message/CreateAttachmentAccessoryKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/chat/presentation/message/CreateAttachmentAccessoryKt$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\u001a6\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\nH\u0000\u00a8\u0006\u000b"
    }
    d2 = {
        "createAttachmentAccessory",
        "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;",
        "Lcom/discord/chat/bridge/attachment/Attachment;",
        "message",
        "Lcom/discord/chat/bridge/Message;",
        "index",
        "",
        "constrainedWidth",
        "radiusPx",
        "onLongClick",
        "Landroid/view/View$OnLongClickListener;",
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
.method public static final createAttachmentAccessory(Lcom/discord/chat/bridge/attachment/Attachment;Lcom/discord/chat/bridge/Message;IIILandroid/view/View$OnLongClickListener;)Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;
    .locals 13

    .line 1
    move-object v4, p0

    .line 2
    move-object v0, p1

    .line 3
    const-string v1, "<this>"

    .line 4
    .line 5
    invoke-static {p0, v1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v1, "message"

    .line 9
    .line 10
    invoke-static {p1, v1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    sget-object v1, Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;->Companion:Lcom/discord/chat/bridge/spoiler/SpoilerAttributes$Companion;

    .line 14
    .line 15
    move v3, p2

    .line 16
    invoke-virtual {v1, p0, p1, p2}, Lcom/discord/chat/bridge/spoiler/SpoilerAttributes$Companion;->forAttachment(Lcom/discord/chat/bridge/attachment/Attachment;Lcom/discord/chat/bridge/Message;I)Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;

    .line 17
    .line 18
    .line 19
    move-result-object v6

    .line 20
    invoke-virtual {p1}, Lcom/discord/chat/bridge/Message;->isCurrentUserMessageAuthor()Ljava/lang/Boolean;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 25
    .line 26
    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    invoke-virtual {p1}, Lcom/discord/chat/bridge/Message;->getNonce-N_6c4I0()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    if-nez v1, :cond_1

    .line 37
    .line 38
    :cond_0
    invoke-virtual {p1}, Lcom/discord/chat/bridge/Message;->getId-3Eiw7ao()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    :cond_1
    invoke-virtual {p0}, Lcom/discord/chat/bridge/attachment/Attachment;->type()Lcom/discord/chat/bridge/attachment/AttachmentType;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    sget-object v5, Lcom/discord/chat/presentation/message/CreateAttachmentAccessoryKt$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 47
    .line 48
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    aget v2, v5, v2

    .line 53
    .line 54
    const/4 v5, 0x1

    .line 55
    const/4 v7, 0x0

    .line 56
    if-eq v2, v5, :cond_9

    .line 57
    .line 58
    const/4 v8, 0x2

    .line 59
    if-eq v2, v8, :cond_5

    .line 60
    .line 61
    const/4 v5, 0x3

    .line 62
    if-eq v2, v5, :cond_4

    .line 63
    .line 64
    const/4 v5, 0x4

    .line 65
    if-ne v2, v5, :cond_3

    .line 66
    .line 67
    invoke-virtual {p1}, Lcom/discord/chat/bridge/Message;->getFlags()J

    .line 68
    .line 69
    .line 70
    move-result-wide v7

    .line 71
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    sget-object v5, Lcom/discord/primitives/MessageFlag;->IS_VOICE_MESSAGE:Lcom/discord/primitives/MessageFlag;

    .line 76
    .line 77
    invoke-static {v2, v5}, Lcom/discord/primitives/MessageFlagKt;->hasMessageFlag(Ljava/lang/Long;Lcom/discord/primitives/MessageFlag;)Z

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    if-eqz v2, :cond_2

    .line 82
    .line 83
    invoke-virtual {p1}, Lcom/discord/chat/bridge/Message;->getAuthorId-wUX8bhU()Lcom/discord/primitives/UserId;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    invoke-virtual {p1}, Lcom/discord/chat/bridge/Message;->getAttachmentsOpacity()Ljava/lang/Float;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    new-instance v7, Lcom/discord/chat/presentation/message/messagepart/AudioAttachmentMessageAccessory;

    .line 92
    .line 93
    const/4 v6, 0x0

    .line 94
    move-object v0, v7

    .line 95
    move v3, p2

    .line 96
    move-object v4, p0

    .line 97
    invoke-direct/range {v0 .. v6}, Lcom/discord/chat/presentation/message/messagepart/AudioAttachmentMessageAccessory;-><init>(Ljava/lang/String;Lcom/discord/primitives/UserId;ILcom/discord/chat/bridge/attachment/Attachment;Ljava/lang/Float;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 98
    .line 99
    .line 100
    goto/16 :goto_5

    .line 101
    .line 102
    :cond_2
    new-instance v9, Lcom/discord/chat/presentation/message/messagepart/FileAttachmentMessageAccessory;

    .line 103
    .line 104
    invoke-virtual {p0}, Lcom/discord/chat/bridge/attachment/Attachment;->getUploaderId()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v5

    .line 108
    invoke-virtual {p0}, Lcom/discord/chat/bridge/attachment/Attachment;->getUploaderItemId()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v7

    .line 112
    invoke-virtual {p1}, Lcom/discord/chat/bridge/Message;->getAttachmentsOpacity()Ljava/lang/Float;

    .line 113
    .line 114
    .line 115
    move-result-object v8

    .line 116
    const/4 v10, 0x0

    .line 117
    move-object v0, v9

    .line 118
    move v2, p2

    .line 119
    move-object v3, p0

    .line 120
    move-object v4, v6

    .line 121
    move-object v6, v7

    .line 122
    move-object v7, v8

    .line 123
    move-object v8, v10

    .line 124
    invoke-direct/range {v0 .. v8}, Lcom/discord/chat/presentation/message/messagepart/FileAttachmentMessageAccessory;-><init>(Ljava/lang/String;ILcom/discord/chat/bridge/attachment/Attachment;Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 125
    .line 126
    .line 127
    goto :goto_0

    .line 128
    :cond_3
    new-instance v0, Llf/q;

    .line 129
    .line 130
    invoke-direct {v0}, Llf/q;-><init>()V

    .line 131
    .line 132
    .line 133
    throw v0

    .line 134
    :cond_4
    new-instance v9, Lcom/discord/chat/presentation/message/messagepart/FileAttachmentMessageAccessory;

    .line 135
    .line 136
    invoke-virtual {p0}, Lcom/discord/chat/bridge/attachment/Attachment;->getUploaderId()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v5

    .line 140
    invoke-virtual {p0}, Lcom/discord/chat/bridge/attachment/Attachment;->getUploaderItemId()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v7

    .line 144
    invoke-virtual {p1}, Lcom/discord/chat/bridge/Message;->getAttachmentsOpacity()Ljava/lang/Float;

    .line 145
    .line 146
    .line 147
    move-result-object v8

    .line 148
    const/4 v10, 0x0

    .line 149
    move-object v0, v9

    .line 150
    move v2, p2

    .line 151
    move-object v3, p0

    .line 152
    move-object v4, v6

    .line 153
    move-object v6, v7

    .line 154
    move-object v7, v8

    .line 155
    move-object v8, v10

    .line 156
    invoke-direct/range {v0 .. v8}, Lcom/discord/chat/presentation/message/messagepart/FileAttachmentMessageAccessory;-><init>(Ljava/lang/String;ILcom/discord/chat/bridge/attachment/Attachment;Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 157
    .line 158
    .line 159
    :goto_0
    move-object v7, v9

    .line 160
    goto/16 :goto_5

    .line 161
    .line 162
    :cond_5
    new-instance v12, Lcom/discord/chat/presentation/message/messagepart/VideoAttachmentMessageAccessory;

    .line 163
    .line 164
    invoke-virtual {p1}, Lcom/discord/chat/bridge/Message;->getUseAttachmentGridLayout()Ljava/lang/Boolean;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    if-eqz v2, :cond_6

    .line 169
    .line 170
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 171
    .line 172
    .line 173
    move-result v2

    .line 174
    move v8, v2

    .line 175
    goto :goto_1

    .line 176
    :cond_6
    move v8, v7

    .line 177
    :goto_1
    invoke-virtual {p1}, Lcom/discord/chat/bridge/Message;->getUseAttachmentUploadPreview()Ljava/lang/Boolean;

    .line 178
    .line 179
    .line 180
    move-result-object v2

    .line 181
    if-eqz v2, :cond_7

    .line 182
    .line 183
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 184
    .line 185
    .line 186
    move-result v2

    .line 187
    goto :goto_2

    .line 188
    :cond_7
    move v2, v7

    .line 189
    :goto_2
    if-eqz v2, :cond_8

    .line 190
    .line 191
    invoke-virtual {p0}, Lcom/discord/chat/bridge/attachment/Attachment;->getProgress()Ljava/lang/Integer;

    .line 192
    .line 193
    .line 194
    move-result-object v2

    .line 195
    if-eqz v2, :cond_8

    .line 196
    .line 197
    move v9, v5

    .line 198
    goto :goto_3

    .line 199
    :cond_8
    move v9, v7

    .line 200
    :goto_3
    invoke-virtual {p1}, Lcom/discord/chat/bridge/Message;->getAttachmentsOpacity()Ljava/lang/Float;

    .line 201
    .line 202
    .line 203
    move-result-object v10

    .line 204
    const/4 v11, 0x0

    .line 205
    move-object v0, v12

    .line 206
    move v2, p2

    .line 207
    move-object v3, p0

    .line 208
    move/from16 v4, p3

    .line 209
    .line 210
    move/from16 v5, p4

    .line 211
    .line 212
    move-object/from16 v7, p5

    .line 213
    .line 214
    invoke-direct/range {v0 .. v11}, Lcom/discord/chat/presentation/message/messagepart/VideoAttachmentMessageAccessory;-><init>(Ljava/lang/String;ILcom/discord/chat/bridge/attachment/Attachment;IILcom/discord/chat/bridge/spoiler/SpoilerAttributes;Landroid/view/View$OnLongClickListener;ZZLjava/lang/Float;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 215
    .line 216
    .line 217
    move-object v7, v12

    .line 218
    goto :goto_5

    .line 219
    :cond_9
    new-instance v11, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;

    .line 220
    .line 221
    invoke-virtual {p1}, Lcom/discord/chat/bridge/Message;->getUseAttachmentGridLayout()Ljava/lang/Boolean;

    .line 222
    .line 223
    .line 224
    move-result-object v2

    .line 225
    if-eqz v2, :cond_a

    .line 226
    .line 227
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 228
    .line 229
    .line 230
    move-result v2

    .line 231
    move v8, v2

    .line 232
    goto :goto_4

    .line 233
    :cond_a
    move v8, v7

    .line 234
    :goto_4
    invoke-virtual {p1}, Lcom/discord/chat/bridge/Message;->getAttachmentsOpacity()Ljava/lang/Float;

    .line 235
    .line 236
    .line 237
    move-result-object v9

    .line 238
    const/4 v10, 0x0

    .line 239
    move-object v0, v11

    .line 240
    move v2, p2

    .line 241
    move-object v3, p0

    .line 242
    move/from16 v4, p3

    .line 243
    .line 244
    move/from16 v5, p4

    .line 245
    .line 246
    move-object/from16 v7, p5

    .line 247
    .line 248
    invoke-direct/range {v0 .. v10}, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;-><init>(Ljava/lang/String;ILcom/discord/chat/bridge/attachment/Attachment;IILcom/discord/chat/bridge/spoiler/SpoilerAttributes;Landroid/view/View$OnLongClickListener;ZLjava/lang/Float;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 249
    .line 250
    .line 251
    move-object v7, v11

    .line 252
    :goto_5
    return-object v7
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
.end method
