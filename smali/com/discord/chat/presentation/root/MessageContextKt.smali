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
    .locals 14

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/discord/chat/presentation/root/MessageContext;

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/discord/chat/bridge/row/MessageRow;->getMessageFrame()Lcom/discord/chat/bridge/messageframe/MessageFrame;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {v1}, Lcom/discord/chat/bridge/messageframe/MessageFrame;->getType()Lcom/discord/chat/bridge/messageframe/MessageFrameType;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v1, 0x0

    .line 20
    :goto_0
    sget-object v2, Lcom/discord/chat/bridge/messageframe/MessageFrameType;->JUMP_MESSAGE_FRAME:Lcom/discord/chat/bridge/messageframe/MessageFrameType;

    .line 21
    .line 22
    const/4 v3, 0x1

    .line 23
    const/4 v4, 0x0

    .line 24
    if-ne v1, v2, :cond_1

    .line 25
    .line 26
    move v2, v3

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    move v2, v4

    .line 29
    :goto_1
    invoke-virtual {p0}, Lcom/discord/chat/bridge/row/MessageRow;->getCanAddNewReactions()Ljava/lang/Boolean;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 34
    .line 35
    invoke-static {v1, v5}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    invoke-virtual {p0}, Lcom/discord/chat/bridge/row/MessageRow;->getAddReactionLabel()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    const-string v7, ""

    .line 44
    .line 45
    if-nez v1, :cond_2

    .line 46
    .line 47
    move-object v8, v7

    .line 48
    goto :goto_2

    .line 49
    :cond_2
    move-object v8, v1

    .line 50
    :goto_2
    invoke-virtual {p0}, Lcom/discord/chat/bridge/row/MessageRow;->getAddNewReactionAccessibilityLabel()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    if-nez v1, :cond_3

    .line 55
    .line 56
    goto :goto_3

    .line 57
    :cond_3
    move-object v7, v1

    .line 58
    :goto_3
    invoke-virtual {p0}, Lcom/discord/chat/bridge/row/MessageRow;->getReactionsTheme()Lcom/discord/chat/bridge/reaction/ReactionsTheme;

    .line 59
    .line 60
    .line 61
    move-result-object v9

    .line 62
    invoke-virtual {p0}, Lcom/discord/chat/bridge/row/MessageRow;->getTruncation()Lcom/discord/chat/bridge/truncation/Truncation;

    .line 63
    .line 64
    .line 65
    move-result-object v10

    .line 66
    invoke-virtual {p0}, Lcom/discord/chat/bridge/row/MessageRow;->getMessage()Lcom/discord/chat/bridge/MessageBase;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    instance-of v1, v1, Lcom/discord/chat/bridge/Message;

    .line 71
    .line 72
    if-eqz v1, :cond_4

    .line 73
    .line 74
    invoke-virtual {p0}, Lcom/discord/chat/bridge/row/MessageRow;->getMessage()Lcom/discord/chat/bridge/MessageBase;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    check-cast v1, Lcom/discord/chat/bridge/Message;

    .line 79
    .line 80
    invoke-virtual {v1}, Lcom/discord/chat/bridge/Message;->getUseAttachmentGridLayout()Ljava/lang/Boolean;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-static {v1, v5}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    if-eqz v1, :cond_4

    .line 89
    .line 90
    move v11, v3

    .line 91
    goto :goto_4

    .line 92
    :cond_4
    move v11, v4

    .line 93
    :goto_4
    invoke-virtual {p0}, Lcom/discord/chat/bridge/row/MessageRow;->getMessage()Lcom/discord/chat/bridge/MessageBase;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    instance-of v1, v1, Lcom/discord/chat/bridge/Message;

    .line 98
    .line 99
    if-eqz v1, :cond_5

    .line 100
    .line 101
    invoke-virtual {p0}, Lcom/discord/chat/bridge/row/MessageRow;->getMessage()Lcom/discord/chat/bridge/MessageBase;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    check-cast v1, Lcom/discord/chat/bridge/Message;

    .line 106
    .line 107
    invoke-virtual {v1}, Lcom/discord/chat/bridge/Message;->getUseAttachmentUploadPreview()Ljava/lang/Boolean;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    invoke-static {v1, v5}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    if-eqz v1, :cond_5

    .line 116
    .line 117
    move v12, v3

    .line 118
    goto :goto_5

    .line 119
    :cond_5
    move v12, v4

    .line 120
    :goto_5
    invoke-virtual {p0}, Lcom/discord/chat/bridge/row/MessageRow;->getEnableSwipeToReply()Z

    .line 121
    .line 122
    .line 123
    move-result v13

    .line 124
    invoke-virtual {p0}, Lcom/discord/chat/bridge/row/MessageRow;->getMessage()Lcom/discord/chat/bridge/MessageBase;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    instance-of v1, v1, Lcom/discord/chat/bridge/Message;

    .line 129
    .line 130
    if-eqz v1, :cond_6

    .line 131
    .line 132
    invoke-virtual {p0}, Lcom/discord/chat/bridge/row/MessageRow;->getMessage()Lcom/discord/chat/bridge/MessageBase;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    check-cast p0, Lcom/discord/chat/bridge/Message;

    .line 137
    .line 138
    invoke-virtual {p0}, Lcom/discord/chat/bridge/Message;->getUseSortedReactions()Ljava/lang/Boolean;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    invoke-static {p0, v5}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result p0

    .line 146
    if-eqz p0, :cond_6

    .line 147
    .line 148
    move p0, v3

    .line 149
    goto :goto_6

    .line 150
    :cond_6
    move p0, v4

    .line 151
    :goto_6
    move-object v1, v0

    .line 152
    move v3, v6

    .line 153
    move-object v4, v8

    .line 154
    move-object v5, v7

    .line 155
    move-object v6, v9

    .line 156
    move-object v7, v10

    .line 157
    move v8, v11

    .line 158
    move v9, v12

    .line 159
    move v10, v13

    .line 160
    move v11, p0

    .line 161
    invoke-direct/range {v1 .. v11}, Lcom/discord/chat/presentation/root/MessageContext;-><init>(ZZLjava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/reaction/ReactionsTheme;Lcom/discord/chat/bridge/truncation/Truncation;ZZZZ)V

    .line 162
    .line 163
    .line 164
    return-object v0
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
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
