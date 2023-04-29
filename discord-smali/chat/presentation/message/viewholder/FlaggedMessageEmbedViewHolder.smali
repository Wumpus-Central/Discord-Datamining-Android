.class public final Lcom/discord/chat/presentation/message/viewholder/FlaggedMessageEmbedViewHolder;
.super Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/discord/chat/presentation/message/viewholder/FlaggedMessageEmbedViewHolder;",
        "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;",
        "embeddedMessageView",
        "Lcom/discord/chat/presentation/message/view/FlaggedMessageEmbedView;",
        "eventHandler",
        "Lcom/discord/chat/presentation/events/ChatEventHandler;",
        "(Lcom/discord/chat/presentation/message/view/FlaggedMessageEmbedView;Lcom/discord/chat/presentation/events/ChatEventHandler;)V",
        "bind",
        "",
        "messageEmbedAccessory",
        "Lcom/discord/chat/presentation/message/messagepart/FlaggedMessageEmbedAccessory;",
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
.field private final embeddedMessageView:Lcom/discord/chat/presentation/message/view/FlaggedMessageEmbedView;

.field private final eventHandler:Lcom/discord/chat/presentation/events/ChatEventHandler;


# direct methods
.method public constructor <init>(Lcom/discord/chat/presentation/message/view/FlaggedMessageEmbedView;Lcom/discord/chat/presentation/events/ChatEventHandler;)V
    .locals 1

    const-string v0, "embeddedMessageView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0}, Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;-><init>(Landroid/view/View;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 3
    iput-object p1, p0, Lcom/discord/chat/presentation/message/viewholder/FlaggedMessageEmbedViewHolder;->embeddedMessageView:Lcom/discord/chat/presentation/message/view/FlaggedMessageEmbedView;

    .line 4
    iput-object p2, p0, Lcom/discord/chat/presentation/message/viewholder/FlaggedMessageEmbedViewHolder;->eventHandler:Lcom/discord/chat/presentation/events/ChatEventHandler;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/discord/chat/presentation/message/view/FlaggedMessageEmbedView;Lcom/discord/chat/presentation/events/ChatEventHandler;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 1
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/discord/chat/presentation/message/viewholder/FlaggedMessageEmbedViewHolder;-><init>(Lcom/discord/chat/presentation/message/view/FlaggedMessageEmbedView;Lcom/discord/chat/presentation/events/ChatEventHandler;)V

    return-void
.end method


# virtual methods
.method public final bind(Lcom/discord/chat/presentation/message/messagepart/FlaggedMessageEmbedAccessory;)V
    .locals 7

    .line 1
    const-string v0, "messageEmbedAccessory"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/discord/chat/presentation/message/viewholder/FlaggedMessageEmbedViewHolder;->embeddedMessageView:Lcom/discord/chat/presentation/message/view/FlaggedMessageEmbedView;

    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/discord/chat/presentation/message/messagepart/FlaggedMessageEmbedAccessory;->getMessage()Lcom/discord/chat/bridge/Message;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    iget-object p1, p0, Lcom/discord/chat/presentation/message/viewholder/FlaggedMessageEmbedViewHolder;->eventHandler:Lcom/discord/chat/presentation/events/ChatEventHandler;

    .line 13
    .line 14
    if-nez p1, :cond_0

    .line 15
    .line 16
    sget-object p1, Lcom/discord/chat/presentation/events/ChatEventHandler$Empty;->INSTANCE:Lcom/discord/chat/presentation/events/ChatEventHandler$Empty;

    .line 17
    .line 18
    :cond_0
    move-object v3, p1

    .line 19
    const/4 v4, 0x0

    .line 20
    const/4 v5, 0x4

    .line 21
    const/4 v6, 0x0

    .line 22
    invoke-static/range {v1 .. v6}, Lcom/discord/chat/presentation/message/view/FlaggedMessageEmbedView;->setMessage$default(Lcom/discord/chat/presentation/message/view/FlaggedMessageEmbedView;Lcom/discord/chat/bridge/Message;Lcom/discord/chat/presentation/events/ChatEventHandler;ZILjava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    return-void
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
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
    .line 161
    .line 162
    .line 163
    .line 164
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
