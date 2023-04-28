.class public final Lcom/discord/chat/presentation/message/viewholder/MessageContentViewHolder;
.super Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u00a2\u0006\u0004\u0008 \u0010!J\u009b\u0002\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0018\u0010\u0008\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\t2\"\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u000c\u0012\u0004\u0012\u00020\u00070\u000b2*\u0010\u000f\u001a&\u0012\u0004\u0012\u00020\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u000c\u0012\u0004\u0012\u00020\u00070\u000e2\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u00070\u00042\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00070\t2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00070\t2\u000c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00142\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u00070\t2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00070\t2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\t\u00f8\u0001\u0000R\u0017\u0010\u001c\u001a\u00020\u001b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u001f\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\""
    }
    d2 = {
        "Lcom/discord/chat/presentation/message/viewholder/MessageContentViewHolder;",
        "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;",
        "Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;",
        "messageContentItem",
        "Lkotlin/Function2;",
        "Lcom/discord/primitives/MessageId;",
        "Lcom/discord/chat/bridge/contentnode/LinkContentNode;",
        "",
        "onLinkClicked",
        "Lkotlin/Function1;",
        "onLinkLongClicked",
        "Lkotlin/Function3;",
        "",
        "onTapChannel",
        "Lkotlin/Function4;",
        "onLongPressChannel",
        "onTapMention",
        "Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;",
        "onTapCommand",
        "onLongPressCommand",
        "Lkotlin/Function0;",
        "onTapSpoiler",
        "onTapTimestamp",
        "Lcom/discord/chat/bridge/contentnode/EmojiContentNode;",
        "onTapEmoji",
        "onTapSeeMore",
        "bind",
        "Lcom/discord/chat/presentation/message/view/MessageContentView;",
        "messageContentView",
        "Lcom/discord/chat/presentation/message/view/MessageContentView;",
        "getMessageContentView",
        "()Lcom/discord/chat/presentation/message/view/MessageContentView;",
        "<init>",
        "(Lcom/discord/chat/presentation/message/view/MessageContentView;)V",
        "chat_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final messageContentView:Lcom/discord/chat/presentation/message/view/MessageContentView;


# direct methods
.method public constructor <init>(Lcom/discord/chat/presentation/message/view/MessageContentView;)V
    .locals 1

    .line 1
    const-string v0, "messageContentView"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-direct {p0, p1, v0}, Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;-><init>(Landroid/view/View;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lcom/discord/chat/presentation/message/viewholder/MessageContentViewHolder;->messageContentView:Lcom/discord/chat/presentation/message/view/MessageContentView;

    .line 11
    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
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


# virtual methods
.method public final bind(Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Lcom/discord/primitives/MessageId;",
            "-",
            "Lcom/discord/chat/bridge/contentnode/LinkContentNode;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/discord/chat/bridge/contentnode/LinkContentNode;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Ljava/lang/String;",
            "-",
            "Ljava/lang/String;",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function4<",
            "-",
            "Ljava/lang/String;",
            "-",
            "Ljava/lang/String;",
            "-",
            "Ljava/lang/String;",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/String;",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/discord/chat/bridge/contentnode/EmojiContentNode;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/discord/primitives/MessageId;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v8, p2

    move-object/from16 v9, p3

    move-object/from16 v10, p4

    move-object/from16 v11, p5

    move-object/from16 v12, p6

    move-object/from16 v13, p7

    move-object/from16 v14, p8

    move-object/from16 v15, p9

    move-object/from16 v16, p10

    move-object/from16 v17, p11

    move-object/from16 v18, p12

    const-string v2, "messageContentItem"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "onLinkClicked"

    move-object/from16 v3, p2

    invoke-static {v3, v2}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "onLinkLongClicked"

    move-object/from16 v3, p3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "onTapChannel"

    move-object/from16 v3, p4

    invoke-static {v3, v2}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "onLongPressChannel"

    move-object/from16 v3, p5

    invoke-static {v3, v2}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "onTapMention"

    move-object/from16 v3, p6

    invoke-static {v3, v2}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "onTapCommand"

    move-object/from16 v3, p7

    invoke-static {v3, v2}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "onLongPressCommand"

    move-object/from16 v3, p8

    invoke-static {v3, v2}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "onTapSpoiler"

    move-object/from16 v3, p9

    invoke-static {v3, v2}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "onTapTimestamp"

    move-object/from16 v3, p10

    invoke-static {v3, v2}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "onTapEmoji"

    move-object/from16 v3, p11

    invoke-static {v3, v2}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "onTapSeeMore"

    move-object/from16 v3, p12

    invoke-static {v3, v2}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v2, v0, Lcom/discord/chat/presentation/message/viewholder/MessageContentViewHolder;->messageContentView:Lcom/discord/chat/presentation/message/view/MessageContentView;

    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->getMessageTextColor()I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 2
    iget-object v2, v0, Lcom/discord/chat/presentation/message/viewholder/MessageContentViewHolder;->messageContentView:Lcom/discord/chat/presentation/message/view/MessageContentView;

    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->getMessageFont()Lcom/discord/fonts/DiscordFont;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/discord/fonts/DiscordFontUtilsKt;->setDiscordFont(Landroid/widget/TextView;Lcom/discord/fonts/DiscordFont;)V

    .line 3
    iget-object v2, v0, Lcom/discord/chat/presentation/message/viewholder/MessageContentViewHolder;->messageContentView:Lcom/discord/chat/presentation/message/view/MessageContentView;

    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->getTextSizeSp()I

    move-result v3

    int-to-float v3, v3

    invoke-static {v2, v3}, Lcom/discord/SetTextSizeSpKt;->setTextSizeSp(Landroid/widget/TextView;F)V

    .line 4
    iget-object v2, v0, Lcom/discord/chat/presentation/message/viewholder/MessageContentViewHolder;->messageContentView:Lcom/discord/chat/presentation/message/view/MessageContentView;

    .line 5
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->getMessageContent()Lcom/discord/chat/bridge/structurabletext/StructurableText;

    move-result-object v3

    .line 6
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->getMessageId-3Eiw7ao()Ljava/lang/String;

    move-result-object v4

    .line 7
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->getShouldAnimateEmoji()Z

    move-result v5

    .line 8
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->getShouldShowRoleDot()Z

    move-result v6

    .line 9
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->getShouldShowRoleOnName()Z

    move-result v7

    .line 10
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->getBottomSpacingPx()I

    move-result v20

    .line 11
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->getEditedLabel()Ljava/lang/String;

    move-result-object v22

    .line 12
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->getTruncation()Lcom/discord/chat/bridge/truncation/Truncation;

    move-result-object v23

    .line 13
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->getConstrainedWidth()I

    move-result v21

    .line 14
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object v24

    .line 15
    new-instance v0, Lcom/discord/chat/presentation/message/viewholder/MessageContentViewHolder$bind$1;

    move-object/from16 v19, v0

    invoke-direct {v0, v1}, Lcom/discord/chat/presentation/message/viewholder/MessageContentViewHolder$bind$1;-><init>(Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;)V

    invoke-virtual/range {v2 .. v24}, Lcom/discord/chat/presentation/message/view/MessageContentView;->setMessageContent-2i9KL1s(Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;ZZZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILjava/lang/String;Lcom/discord/chat/bridge/truncation/Truncation;Lcom/discord/theme/DiscordTheme;)V

    return-void
.end method

.method public final getMessageContentView()Lcom/discord/chat/presentation/message/view/MessageContentView;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/message/viewholder/MessageContentViewHolder;->messageContentView:Lcom/discord/chat/presentation/message/view/MessageContentView;

    return-object v0
.end method
