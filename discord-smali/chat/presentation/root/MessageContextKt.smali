.class public final Lcom/discord/chat/presentation/root/MessageContextKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "getMessageContext",
        "Lcom/discord/chat/presentation/root/MessageContext;",
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
.method public static final getMessageContext(Lcom/discord/chat/bridge/row/MessageRow;)Lcom/discord/chat/presentation/root/MessageContext;
    .locals 17

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    invoke-static {v1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Lcom/discord/chat/presentation/root/MessageContext;

    .line 9
    .line 10
    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/row/MessageRow;->getMessageFrame()Lcom/discord/chat/bridge/messageframe/MessageFrame;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    invoke-virtual {v2}, Lcom/discord/chat/bridge/messageframe/MessageFrame;->getType()Lcom/discord/chat/bridge/messageframe/MessageFrameType;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v2, 0x0

    .line 22
    :goto_0
    sget-object v3, Lcom/discord/chat/bridge/messageframe/MessageFrameType;->JUMP_MESSAGE_FRAME:Lcom/discord/chat/bridge/messageframe/MessageFrameType;

    .line 23
    .line 24
    const/4 v5, 0x0

    .line 25
    if-ne v2, v3, :cond_1

    .line 26
    .line 27
    const/4 v2, 0x1

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    move v2, v5

    .line 30
    :goto_1
    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/row/MessageRow;->getCanAddNewReactions()Ljava/lang/Boolean;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 35
    .line 36
    invoke-static {v3, v6}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/row/MessageRow;->getAddReactionLabel()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v7

    .line 44
    const-string v8, ""

    .line 45
    .line 46
    if-nez v7, :cond_2

    .line 47
    .line 48
    move-object v7, v8

    .line 49
    :cond_2
    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/row/MessageRow;->getAddNewReactionAccessibilityLabel()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v9

    .line 53
    if-nez v9, :cond_3

    .line 54
    .line 55
    move-object v9, v8

    .line 56
    :cond_3
    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/row/MessageRow;->getAddNewBurstReactionAccessibilityLabel()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v10

    .line 60
    if-nez v10, :cond_4

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_4
    move-object v8, v10

    .line 64
    :goto_2
    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/row/MessageRow;->getReactionsTheme()Lcom/discord/chat/bridge/reaction/ReactionsTheme;

    .line 65
    .line 66
    .line 67
    move-result-object v10

    .line 68
    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/row/MessageRow;->getTruncation()Lcom/discord/chat/bridge/truncation/Truncation;

    .line 69
    .line 70
    .line 71
    move-result-object v11

    .line 72
    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/row/MessageRow;->getMessage()Lcom/discord/chat/bridge/MessageBase;

    .line 73
    .line 74
    .line 75
    move-result-object v12

    .line 76
    instance-of v12, v12, Lcom/discord/chat/bridge/Message;

    .line 77
    .line 78
    if-eqz v12, :cond_5

    .line 79
    .line 80
    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/row/MessageRow;->getMessage()Lcom/discord/chat/bridge/MessageBase;

    .line 81
    .line 82
    .line 83
    move-result-object v12

    .line 84
    check-cast v12, Lcom/discord/chat/bridge/Message;

    .line 85
    .line 86
    invoke-virtual {v12}, Lcom/discord/chat/bridge/Message;->getUseAttachmentGridLayout()Ljava/lang/Boolean;

    .line 87
    .line 88
    .line 89
    move-result-object v12

    .line 90
    invoke-static {v12, v6}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v12

    .line 94
    if-eqz v12, :cond_5

    .line 95
    .line 96
    const/4 v12, 0x1

    .line 97
    goto :goto_3

    .line 98
    :cond_5
    move v12, v5

    .line 99
    :goto_3
    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/row/MessageRow;->getMessage()Lcom/discord/chat/bridge/MessageBase;

    .line 100
    .line 101
    .line 102
    move-result-object v13

    .line 103
    instance-of v13, v13, Lcom/discord/chat/bridge/Message;

    .line 104
    .line 105
    if-eqz v13, :cond_6

    .line 106
    .line 107
    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/row/MessageRow;->getMessage()Lcom/discord/chat/bridge/MessageBase;

    .line 108
    .line 109
    .line 110
    move-result-object v13

    .line 111
    check-cast v13, Lcom/discord/chat/bridge/Message;

    .line 112
    .line 113
    invoke-virtual {v13}, Lcom/discord/chat/bridge/Message;->getUseAttachmentUploadPreview()Ljava/lang/Boolean;

    .line 114
    .line 115
    .line 116
    move-result-object v13

    .line 117
    invoke-static {v13, v6}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v13

    .line 121
    if-eqz v13, :cond_6

    .line 122
    .line 123
    const/4 v13, 0x1

    .line 124
    goto :goto_4

    .line 125
    :cond_6
    move v13, v5

    .line 126
    :goto_4
    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/row/MessageRow;->getEnableSwipeToReply()Z

    .line 127
    .line 128
    .line 129
    move-result v14

    .line 130
    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/row/MessageRow;->getMessage()Lcom/discord/chat/bridge/MessageBase;

    .line 131
    .line 132
    .line 133
    move-result-object v15

    .line 134
    instance-of v15, v15, Lcom/discord/chat/bridge/Message;

    .line 135
    .line 136
    if-eqz v15, :cond_7

    .line 137
    .line 138
    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/row/MessageRow;->getMessage()Lcom/discord/chat/bridge/MessageBase;

    .line 139
    .line 140
    .line 141
    move-result-object v15

    .line 142
    check-cast v15, Lcom/discord/chat/bridge/Message;

    .line 143
    .line 144
    invoke-virtual {v15}, Lcom/discord/chat/bridge/Message;->getUseSortedReactions()Ljava/lang/Boolean;

    .line 145
    .line 146
    .line 147
    move-result-object v15

    .line 148
    invoke-static {v15, v6}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v15

    .line 152
    if-eqz v15, :cond_7

    .line 153
    .line 154
    const/4 v15, 0x1

    .line 155
    goto :goto_5

    .line 156
    :cond_7
    move v15, v5

    .line 157
    :goto_5
    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/row/MessageRow;->getMessage()Lcom/discord/chat/bridge/MessageBase;

    .line 158
    .line 159
    .line 160
    move-result-object v4

    .line 161
    instance-of v4, v4, Lcom/discord/chat/bridge/Message;

    .line 162
    .line 163
    if-eqz v4, :cond_8

    .line 164
    .line 165
    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/row/MessageRow;->getMessage()Lcom/discord/chat/bridge/MessageBase;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    check-cast v1, Lcom/discord/chat/bridge/Message;

    .line 170
    .line 171
    invoke-virtual {v1}, Lcom/discord/chat/bridge/Message;->getUseAddBurstReaction()Ljava/lang/Boolean;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    invoke-static {v1, v6}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result v1

    .line 179
    if-eqz v1, :cond_8

    .line 180
    .line 181
    const/16 v16, 0x1

    .line 182
    .line 183
    goto :goto_6

    .line 184
    :cond_8
    move/from16 v16, v5

    .line 185
    .line 186
    :goto_6
    move-object v1, v0

    .line 187
    move-object v4, v7

    .line 188
    move-object v5, v9

    .line 189
    move-object v6, v8

    .line 190
    move-object v7, v10

    .line 191
    move-object v8, v11

    .line 192
    move v9, v12

    .line 193
    move v10, v13

    .line 194
    move v11, v14

    .line 195
    move v12, v15

    .line 196
    move/from16 v13, v16

    .line 197
    .line 198
    invoke-direct/range {v1 .. v13}, Lcom/discord/chat/presentation/root/MessageContext;-><init>(ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/reaction/ReactionsTheme;Lcom/discord/chat/bridge/truncation/Truncation;ZZZZZ)V

    .line 199
    .line 200
    .line 201
    return-object v0
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
.end method
