.class public final Lcom/discord/chat/presentation/message/MessageViewReplyPreview;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "SourceFile"

# interfaces
.implements Lcom/discord/chat/presentation/spine/SpineParentMessage;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\u0006\u0010\u0010\u001a\u00020\u0011JC\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001c\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ&\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020!2\u0008\u0008\u0002\u0010\"\u001a\u00020\u00182\u000c\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\u00110$R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000c\u001a\u00020\r8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\u000f\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006%"
    }
    d2 = {
        "Lcom/discord/chat/presentation/message/MessageViewReplyPreview;",
        "Landroidx/constraintlayout/widget/ConstraintLayout;",
        "Lcom/discord/chat/presentation/spine/SpineParentMessage;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "binding",
        "Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;",
        "replyTextLineBounds",
        "Landroid/graphics/Rect;",
        "spineOriginView",
        "Landroid/view/View;",
        "getSpineOriginView",
        "()Landroid/view/View;",
        "clear",
        "",
        "configureExecutedCommand",
        "messageId",
        "Lcom/discord/primitives/MessageId;",
        "executedCommand",
        "Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;",
        "shouldAnimateEmoji",
        "",
        "shouldShowRoleDot",
        "shouldShowRoleOnName",
        "eventHandler",
        "Lcom/discord/chat/presentation/events/ChatEventHandler;",
        "configureExecutedCommand-LdU2QRA",
        "(Ljava/lang/String;Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;ZZZLcom/discord/chat/presentation/events/ChatEventHandler;)V",
        "configureReply",
        "reply",
        "Lcom/discord/chat/bridge/referencedmessage/ReferencedMessage;",
        "showSpine",
        "onClick",
        "Lkotlin/Function0;",
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
.field private final binding:Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;

.field private final replyTextLineBounds:Landroid/graphics/Rect;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-direct {p0, p1, v0, v1, v0}, Lcom/discord/chat/presentation/message/MessageViewReplyPreview;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1, p2}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 3
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-static {p1, p0}, Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;

    move-result-object p1

    const-string p2, "inflate(LayoutInflater.from(context), this)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/discord/chat/presentation/message/MessageViewReplyPreview;->binding:Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;

    .line 4
    new-instance p2, Landroid/graphics/Rect;

    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    iput-object p2, p0, Lcom/discord/chat/presentation/message/MessageViewReplyPreview;->replyTextLineBounds:Landroid/graphics/Rect;

    .line 5
    iget-object p2, p1, Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;->replyIcon:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 6
    invoke-virtual {p2}, Landroid/view/View;->isInEditMode()Z

    move-result v0

    const/4 v1, 0x2

    if-nez v0, :cond_0

    const-string v0, "_init_$lambda$1"

    .line 7
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/discord/react_asset_fetcher/ReactAsset;->Reply:Lcom/discord/react_asset_fetcher/ReactAsset;

    invoke-static {p2, v0}, Lcom/discord/react_asset_fetcher/ReactAssetUtilsKt;->setReactAsset(Lcom/facebook/drawee/view/SimpleDraweeView;Lcom/discord/react_asset_fetcher/ReactAsset;)V

    .line 8
    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object v0

    invoke-virtual {v0}, Lcom/discord/theme/DiscordTheme;->getInteractiveNormal()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p2, v0}, Lcom/discord/theme/utils/ColorUtilsKt;->setTintColor(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/Integer;)V

    .line 9
    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object v0

    invoke-virtual {v0}, Lcom/discord/theme/DiscordTheme;->getBackgroundTertiary()I

    move-result v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {p2, v0, v2, v1, v3}, Lcom/discord/misc/utilities/view/ViewBackgroundUtilsKt;->setBackgroundOval$default(Landroid/view/View;IIILjava/lang/Object;)V

    .line 10
    :cond_0
    iget-object p2, p1, Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;->replyAuthorName:Landroid/widget/TextView;

    const-string v0, "binding.replyAuthorName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lcom/discord/fonts/DiscordFont;->PrimarySemibold:Lcom/discord/fonts/DiscordFont;

    invoke-static {p2, v2}, Lcom/discord/fonts/DiscordFontUtilsKt;->setDiscordFont(Landroid/widget/TextView;Lcom/discord/fonts/DiscordFont;)V

    .line 11
    iget-object p2, p1, Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;->replyAuthorName:Landroid/widget/TextView;

    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/high16 v0, 0x41400000    # 12.0f

    invoke-static {p2, v0}, Lcom/discord/SetTextSizeSpKt;->setTextSizeSp(Landroid/widget/TextView;F)V

    .line 12
    iget-object p2, p1, Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;->replyAuthorAvatar:Lcom/facebook/drawee/view/SimpleDraweeView;

    const-string v2, "binding.replyAuthorAvatar"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Lcom/discord/misc/utilities/view/ViewClippingUtilsKt;->clipToCircle(Landroid/view/View;)V

    .line 13
    iget-object p2, p1, Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;->replyText:Lcom/discord/chat/presentation/message/view/MessageContentView;

    const-string v2, "_init_$lambda$2"

    .line 14
    invoke-static {p2, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lcom/discord/fonts/DiscordFont;->PrimaryMedium:Lcom/discord/fonts/DiscordFont;

    invoke-static {p2, v2}, Lcom/discord/fonts/DiscordFontUtilsKt;->setDiscordFont(Landroid/widget/TextView;Lcom/discord/fonts/DiscordFont;)V

    .line 15
    invoke-static {p2, v0}, Lcom/discord/SetTextSizeSpKt;->setTextSizeSp(Landroid/widget/TextView;F)V

    .line 16
    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object v0

    invoke-virtual {v0}, Lcom/discord/theme/DiscordTheme;->getInteractiveNormal()I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 17
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    sget v0, Lcom/discord/chat/R$dimen;->message_start_guideline:I

    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p2

    int-to-float v0, v1

    div-float v1, p2, v0

    .line 18
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/discord/chat/R$dimen;->spine_width:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    div-float/2addr v2, v0

    sub-float/2addr v1, v2

    .line 19
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v2, Lcom/discord/chat/R$dimen;->message_reply_leading_views_margin_start:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    sub-float/2addr p2, v0

    sub-float/2addr p2, v1

    .line 20
    iget-object v0, p1, Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;->replySpline:Lcom/discord/channel_spine/ChannelSpineView;

    invoke-virtual {v0}, Lcom/discord/channel_spine/ChannelSpineView;->configureAsReplySpline()V

    .line 21
    iget-object p1, p1, Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;->replySpline:Lcom/discord/channel_spine/ChannelSpineView;

    const-string v0, "binding.replySpline"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    if-eqz v0, :cond_1

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    float-to-int p2, p2

    .line 23
    iput p2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    float-to-int p2, v1

    .line 24
    invoke-virtual {v0, p2}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 25
    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void

    .line 26
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 1
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/discord/chat/presentation/message/MessageViewReplyPreview;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public static final synthetic access$getBinding$p(Lcom/discord/chat/presentation/message/MessageViewReplyPreview;)Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;
    .locals 0

    iget-object p0, p0, Lcom/discord/chat/presentation/message/MessageViewReplyPreview;->binding:Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function0;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/discord/chat/presentation/message/MessageViewReplyPreview;->configureReply$lambda$4(Lkotlin/jvm/functions/Function0;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic c(Lcom/discord/chat/presentation/events/ChatEventHandler;Ljava/lang/String;Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/discord/chat/presentation/message/MessageViewReplyPreview;->configureExecutedCommand_LdU2QRA$lambda$7(Lcom/discord/chat/presentation/events/ChatEventHandler;Ljava/lang/String;Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;Landroid/view/View;)V

    return-void
.end method

.method private static final configureExecutedCommand_LdU2QRA$lambda$7(Lcom/discord/chat/presentation/events/ChatEventHandler;Ljava/lang/String;Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;Landroid/view/View;)V
    .locals 0

    .line 1
    const-string p3, "$eventHandler"

    .line 2
    .line 3
    invoke-static {p0, p3}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p3, "$messageId"

    .line 7
    .line 8
    invoke-static {p1, p3}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string p3, "$executedCommand"

    .line 12
    .line 13
    invoke-static {p2, p3}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p2}, Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;->getUserId-re6GcUE()J

    .line 17
    .line 18
    .line 19
    move-result-wide p2

    .line 20
    invoke-interface {p0, p1, p2, p3}, Lcom/discord/chat/presentation/events/ChatEventHandler;->onTapAvatar-x5gers8(Ljava/lang/String;J)V

    .line 21
    .line 22
    .line 23
    return-void
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
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
.end method

.method public static synthetic configureReply$default(Lcom/discord/chat/presentation/message/MessageViewReplyPreview;Lcom/discord/chat/bridge/referencedmessage/ReferencedMessage;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/4 p2, 0x1

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/discord/chat/presentation/message/MessageViewReplyPreview;->configureReply(Lcom/discord/chat/bridge/referencedmessage/ReferencedMessage;ZLkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method private static final configureReply$lambda$4(Lkotlin/jvm/functions/Function0;Landroid/view/View;)V
    .locals 0

    .line 1
    const-string p1, "$onClick"

    .line 2
    .line 3
    invoke-static {p0, p1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    return-void
    .line 10
    .line 11
    .line 12
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
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
.end method


# virtual methods
.method public final clear()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/discord/chat/presentation/message/MessageViewReplyPreview;->binding:Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;->replySpline:Lcom/discord/channel_spine/ChannelSpineView;

    .line 4
    .line 5
    const-string v1, "binding.replySpline"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/16 v1, 0x8

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lcom/discord/chat/presentation/message/MessageViewReplyPreview;->binding:Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;

    .line 16
    .line 17
    iget-object v0, v0, Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;->replyLeadingViews:Landroid/widget/LinearLayout;

    .line 18
    .line 19
    const-string v2, "binding.replyLeadingViews"

    .line 20
    .line 21
    invoke-static {v0, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lcom/discord/chat/presentation/message/MessageViewReplyPreview;->binding:Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;

    .line 28
    .line 29
    iget-object v0, v0, Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;->replyText:Lcom/discord/chat/presentation/message/view/MessageContentView;

    .line 30
    .line 31
    const-string v2, "binding.replyText"

    .line 32
    .line 33
    invoke-static {v0, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 37
    .line 38
    .line 39
    return-void
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
.end method

.method public final configureExecutedCommand-LdU2QRA(Ljava/lang/String;Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;ZZZLcom/discord/chat/presentation/events/ChatEventHandler;)V
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v8, p1

    .line 4
    .line 5
    move-object/from16 v15, p2

    .line 6
    .line 7
    move-object/from16 v14, p6

    .line 8
    .line 9
    move-object/from16 v3, p1

    .line 10
    .line 11
    move/from16 v4, p3

    .line 12
    .line 13
    move/from16 v5, p4

    .line 14
    .line 15
    move/from16 v6, p5

    .line 16
    .line 17
    const-string v1, "messageId"

    .line 18
    .line 19
    invoke-static {v8, v1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const-string v1, "executedCommand"

    .line 23
    .line 24
    invoke-static {v15, v1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const-string v1, "eventHandler"

    .line 28
    .line 29
    invoke-static {v14, v1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    iget-object v1, v0, Lcom/discord/chat/presentation/message/MessageViewReplyPreview;->binding:Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;

    .line 33
    .line 34
    iget-object v1, v1, Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;->replySpline:Lcom/discord/channel_spine/ChannelSpineView;

    .line 35
    .line 36
    const-string v2, "binding.replySpline"

    .line 37
    .line 38
    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    const/4 v2, 0x0

    .line 42
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 43
    .line 44
    .line 45
    iget-object v1, v0, Lcom/discord/chat/presentation/message/MessageViewReplyPreview;->binding:Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;

    .line 46
    .line 47
    iget-object v1, v1, Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;->replyText:Lcom/discord/chat/presentation/message/view/MessageContentView;

    .line 48
    .line 49
    const-string v13, "binding.replyText"

    .line 50
    .line 51
    invoke-static {v1, v13}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 55
    .line 56
    .line 57
    iget-object v1, v0, Lcom/discord/chat/presentation/message/MessageViewReplyPreview;->binding:Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;

    .line 58
    .line 59
    iget-object v1, v1, Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;->replyLeadingViews:Landroid/widget/LinearLayout;

    .line 60
    .line 61
    const-string v7, "binding.replyLeadingViews"

    .line 62
    .line 63
    invoke-static {v1, v7}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 67
    .line 68
    .line 69
    iget-object v1, v0, Lcom/discord/chat/presentation/message/MessageViewReplyPreview;->binding:Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;

    .line 70
    .line 71
    iget-object v1, v1, Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;->replyAuthorAvatar:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 72
    .line 73
    const-string v9, "binding.replyAuthorAvatar"

    .line 74
    .line 75
    invoke-static {v1, v9}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 79
    .line 80
    .line 81
    iget-object v1, v0, Lcom/discord/chat/presentation/message/MessageViewReplyPreview;->binding:Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;

    .line 82
    .line 83
    iget-object v1, v1, Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;->replyAuthorName:Landroid/widget/TextView;

    .line 84
    .line 85
    const-string v10, "binding.replyAuthorName"

    .line 86
    .line 87
    invoke-static {v1, v10}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    const/16 v10, 0x8

    .line 91
    .line 92
    invoke-virtual {v1, v10}, Landroid/view/View;->setVisibility(I)V

    .line 93
    .line 94
    .line 95
    iget-object v1, v0, Lcom/discord/chat/presentation/message/MessageViewReplyPreview;->binding:Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;

    .line 96
    .line 97
    iget-object v1, v1, Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;->replyAuthorAvatar:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 98
    .line 99
    invoke-static {v1, v9}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    new-instance v9, Lcom/discord/chat/presentation/message/r;

    .line 103
    .line 104
    invoke-direct {v9, v14, v8, v15}, Lcom/discord/chat/presentation/message/r;-><init>(Lcom/discord/chat/presentation/events/ChatEventHandler;Ljava/lang/String;Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;)V

    .line 105
    .line 106
    .line 107
    const/4 v11, 0x0

    .line 108
    const/4 v12, 0x1

    .line 109
    invoke-static {v1, v2, v9, v12, v11}, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchUtilsKt;->setOnClickListenerNested$default(Landroid/view/View;ZLandroid/view/View$OnClickListener;ILjava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    iget-object v1, v0, Lcom/discord/chat/presentation/message/MessageViewReplyPreview;->binding:Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;

    .line 113
    .line 114
    iget-object v1, v1, Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;->replyIcon:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 115
    .line 116
    const-string v2, "binding.replyIcon"

    .line 117
    .line 118
    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v1, v10}, Landroid/view/View;->setVisibility(I)V

    .line 122
    .line 123
    .line 124
    iget-object v1, v0, Lcom/discord/chat/presentation/message/MessageViewReplyPreview;->binding:Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;

    .line 125
    .line 126
    iget-object v11, v1, Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;->replyText:Lcom/discord/chat/presentation/message/view/MessageContentView;

    .line 127
    .line 128
    iget-object v10, v1, Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;->replyLeadingViews:Landroid/widget/LinearLayout;

    .line 129
    .line 130
    invoke-static {v10, v7}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual/range {p2 .. p2}, Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;->getContent()Lcom/discord/chat/bridge/structurabletext/AnnotatedStructurableText;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 138
    .line 139
    .line 140
    move-result-object v7

    .line 141
    move-object v2, v7

    .line 142
    iget-object v9, v0, Lcom/discord/chat/presentation/message/MessageViewReplyPreview;->binding:Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;

    .line 143
    .line 144
    iget-object v9, v9, Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;->replyText:Lcom/discord/chat/presentation/message/view/MessageContentView;

    .line 145
    .line 146
    invoke-virtual {v9}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 147
    .line 148
    .line 149
    move-result-object v9

    .line 150
    invoke-virtual {v9}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    .line 151
    .line 152
    .line 153
    move-result-object v9

    .line 154
    const-string v12, "binding.replyText.paint.fontMetrics"

    .line 155
    .line 156
    invoke-static {v9, v12}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    invoke-static {v9}, Lcom/discord/chat/presentation/textutils/TextUtilsKt;->getBaselineHeight(Landroid/graphics/Paint$FontMetrics;)F

    .line 160
    .line 161
    .line 162
    move-result v20

    .line 163
    const-string v9, "context"

    .line 164
    .line 165
    invoke-static {v7, v9}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    new-instance v9, Lcom/discord/chat/presentation/message/MessageViewReplyPreview$configureExecutedCommand$2;

    .line 169
    .line 170
    move-object v7, v9

    .line 171
    invoke-direct {v9, v14, v8}, Lcom/discord/chat/presentation/message/MessageViewReplyPreview$configureExecutedCommand$2;-><init>(Lcom/discord/chat/presentation/events/ChatEventHandler;Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    const/4 v8, 0x0

    .line 175
    const/4 v9, 0x0

    .line 176
    const/4 v12, 0x0

    .line 177
    move-object/from16 v23, v10

    .line 178
    .line 179
    move-object v10, v12

    .line 180
    move-object/from16 v24, v11

    .line 181
    .line 182
    move-object v11, v12

    .line 183
    new-instance v12, Lcom/discord/chat/presentation/message/MessageViewReplyPreview$configureExecutedCommand$3;

    .line 184
    .line 185
    move-object/from16 p1, v12

    .line 186
    .line 187
    move-object/from16 v8, p1

    .line 188
    .line 189
    invoke-direct {v8, v14}, Lcom/discord/chat/presentation/message/MessageViewReplyPreview$configureExecutedCommand$3;-><init>(Lcom/discord/chat/presentation/events/ChatEventHandler;)V

    .line 190
    .line 191
    .line 192
    new-instance v8, Lcom/discord/chat/presentation/message/MessageViewReplyPreview$configureExecutedCommand$4;

    .line 193
    .line 194
    move-object/from16 v25, v13

    .line 195
    .line 196
    move-object v13, v8

    .line 197
    invoke-direct {v8, v14}, Lcom/discord/chat/presentation/message/MessageViewReplyPreview$configureExecutedCommand$4;-><init>(Lcom/discord/chat/presentation/events/ChatEventHandler;)V

    .line 198
    .line 199
    .line 200
    const/4 v14, 0x0

    .line 201
    const/4 v8, 0x0

    .line 202
    move-object v9, v15

    .line 203
    move-object v15, v8

    .line 204
    new-instance v8, Lcom/discord/chat/presentation/message/MessageViewReplyPreview$configureExecutedCommand$5;

    .line 205
    .line 206
    move-object/from16 v16, v8

    .line 207
    .line 208
    invoke-direct {v8, v9}, Lcom/discord/chat/presentation/message/MessageViewReplyPreview$configureExecutedCommand$5;-><init>(Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;)V

    .line 209
    .line 210
    .line 211
    const/16 v17, 0x0

    .line 212
    .line 213
    const/16 v18, 0x0

    .line 214
    .line 215
    const/16 v19, 0x0

    .line 216
    .line 217
    const v21, 0x3b3c0

    .line 218
    .line 219
    .line 220
    const/16 v22, 0x0

    .line 221
    .line 222
    const/4 v8, 0x0

    .line 223
    const/4 v9, 0x0

    .line 224
    invoke-static/range {v1 .. v22}, Lcom/discord/chat/presentation/textutils/TextUtilsKt;->toSpannable$default(Lcom/discord/chat/bridge/structurabletext/StructurableText;Landroid/content/Context;Ljava/lang/String;ZZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ZLcom/discord/theme/DiscordTheme;FILjava/lang/Object;)Lcom/facebook/drawee/span/DraweeSpanStringBuilder;

    .line 225
    .line 226
    .line 227
    move-result-object v1

    .line 228
    new-instance v2, Lcom/discord/span/utilities/BackgroundSpanDrawer;

    .line 229
    .line 230
    iget-object v3, v0, Lcom/discord/chat/presentation/message/MessageViewReplyPreview;->binding:Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;

    .line 231
    .line 232
    iget-object v3, v3, Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;->replyText:Lcom/discord/chat/presentation/message/view/MessageContentView;

    .line 233
    .line 234
    move-object/from16 v4, v25

    .line 235
    .line 236
    invoke-static {v3, v4}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    invoke-direct {v2, v3}, Lcom/discord/span/utilities/BackgroundSpanDrawer;-><init>(Landroid/widget/TextView;)V

    .line 240
    .line 241
    .line 242
    invoke-static {v1, v2}, Lcom/discord/span/utilities/SpannableExtensionsKt;->coverWithSpan(Landroid/text/Spannable;Ljava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 246
    .line 247
    move-object/from16 v2, v23

    .line 248
    .line 249
    invoke-static {v2, v1}, Lcom/discord/chat/presentation/message/utils/ReplyUtilsKt;->createReplyContent(Landroid/view/View;Lcom/facebook/drawee/span/DraweeSpanStringBuilder;)Lcom/facebook/drawee/span/DraweeSpanStringBuilder;

    .line 250
    .line 251
    .line 252
    move-result-object v1

    .line 253
    move-object/from16 v2, v24

    .line 254
    .line 255
    invoke-virtual {v2, v1}, Lcom/facebook/drawee/span/SimpleDraweeSpanTextView;->setDraweeSpanStringBuilder(Lcom/facebook/drawee/span/DraweeSpanStringBuilder;)V

    .line 256
    .line 257
    .line 258
    iget-object v1, v0, Lcom/discord/chat/presentation/message/MessageViewReplyPreview;->binding:Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;

    .line 259
    .line 260
    iget-object v1, v1, Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;->replyText:Lcom/discord/chat/presentation/message/view/MessageContentView;

    .line 261
    .line 262
    invoke-static {v1, v4}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    const/4 v2, 0x1

    .line 266
    invoke-static {v1, v2}, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchUtilsKt;->enableNestedSpanClickListener(Landroid/widget/TextView;Z)V

    .line 267
    .line 268
    .line 269
    iget-object v1, v0, Lcom/discord/chat/presentation/message/MessageViewReplyPreview;->binding:Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;

    .line 270
    .line 271
    iget-object v1, v1, Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;->replyAuthorAvatar:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 272
    .line 273
    invoke-virtual/range {p2 .. p2}, Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;->getAvatarURL()Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v2

    .line 277
    invoke-virtual {v1, v2}, Lcom/facebook/drawee/view/SimpleDraweeView;->setImageURI(Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    return-void
.end method

.method public final configureReply(Lcom/discord/chat/bridge/referencedmessage/ReferencedMessage;ZLkotlin/jvm/functions/Function0;)V
    .locals 37
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/discord/chat/bridge/referencedmessage/ReferencedMessage;",
            "Z",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    const-string v3, "reply"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "onClick"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v3, Lcom/discord/chat/presentation/message/q;

    invoke-direct {v3, v2}, Lcom/discord/chat/presentation/message/q;-><init>(Lkotlin/jvm/functions/Function0;)V

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v0, v4, v3, v5, v6}, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchUtilsKt;->setOnClickListenerNested$default(Landroid/view/View;ZLandroid/view/View$OnClickListener;ILjava/lang/Object;)V

    .line 2
    instance-of v3, v1, Lcom/discord/chat/bridge/referencedmessage/LoadedReferencedMessage;

    const-string v7, "binding.replySpline"

    const-string v8, "binding.replyIcon"

    const-string v9, "binding.replyAuthorName"

    const-string v10, "binding.replyText"

    const-string v11, "binding.replyAuthorAvatar"

    const-string v12, "binding.replyLeadingViews"

    const/16 v13, 0x8

    if-eqz v3, :cond_5

    .line 3
    check-cast v1, Lcom/discord/chat/bridge/referencedmessage/LoadedReferencedMessage;

    invoke-virtual {v1}, Lcom/discord/chat/bridge/referencedmessage/LoadedReferencedMessage;->getMessage()Lcom/discord/chat/bridge/Message;

    move-result-object v3

    .line 4
    iget-object v14, v0, Lcom/discord/chat/presentation/message/MessageViewReplyPreview;->binding:Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;

    iget-object v14, v14, Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;->replySpline:Lcom/discord/channel_spine/ChannelSpineView;

    invoke-static {v14, v7}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    move v7, v4

    goto :goto_0

    :cond_0
    move v7, v13

    .line 5
    :goto_0
    invoke-virtual {v14, v7}, Landroid/view/View;->setVisibility(I)V

    .line 6
    iget-object v7, v0, Lcom/discord/chat/presentation/message/MessageViewReplyPreview;->binding:Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;

    iget-object v7, v7, Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;->replyLeadingViews:Landroid/widget/LinearLayout;

    invoke-static {v7, v12}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-virtual {v7, v4}, Landroid/view/View;->setVisibility(I)V

    .line 8
    iget-object v7, v0, Lcom/discord/chat/presentation/message/MessageViewReplyPreview;->binding:Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;

    iget-object v7, v7, Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;->replyText:Lcom/discord/chat/presentation/message/view/MessageContentView;

    invoke-static {v7, v10}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    invoke-virtual {v7, v4}, Landroid/view/View;->setVisibility(I)V

    .line 10
    invoke-virtual {v3}, Lcom/discord/chat/bridge/Message;->getShouldShowRoleDot()Z

    move-result v7

    const-string v14, "binding.replyRoleDot"

    if-eqz v7, :cond_1

    .line 11
    iget-object v7, v0, Lcom/discord/chat/presentation/message/MessageViewReplyPreview;->binding:Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;

    iget-object v7, v7, Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;->replyRoleDot:Lcom/discord/chat/presentation/message/RoleDotView;

    invoke-static {v7, v14}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-virtual {v7, v4}, Landroid/view/View;->setVisibility(I)V

    .line 13
    iget-object v7, v0, Lcom/discord/chat/presentation/message/MessageViewReplyPreview;->binding:Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;

    iget-object v7, v7, Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;->replyRoleDot:Lcom/discord/chat/presentation/message/RoleDotView;

    invoke-static {v3, v4, v5, v6}, Lcom/discord/chat/bridge/MessageKt;->roleDotColor$default(Lcom/discord/chat/bridge/Message;IILjava/lang/Object;)I

    move-result v14

    const/16 v15, 0x10

    invoke-virtual {v7, v14, v15}, Lcom/discord/chat/presentation/message/RoleDotView;->configure(II)V

    goto :goto_1

    .line 14
    :cond_1
    iget-object v7, v0, Lcom/discord/chat/presentation/message/MessageViewReplyPreview;->binding:Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;

    iget-object v7, v7, Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;->replyRoleDot:Lcom/discord/chat/presentation/message/RoleDotView;

    invoke-static {v7, v14}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    invoke-virtual {v7, v13}, Landroid/view/View;->setVisibility(I)V

    .line 16
    :goto_1
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v7

    const-string v14, "context"

    invoke-static {v7, v14}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3, v7}, Lcom/discord/chat/bridge/MessageKt;->avatarUrl(Lcom/discord/chat/bridge/Message;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_2

    .line 17
    invoke-virtual {v3}, Lcom/discord/chat/bridge/Message;->getUsername()Ljava/lang/String;

    move-result-object v15

    if-eqz v15, :cond_2

    invoke-virtual {v3}, Lcom/discord/chat/bridge/Message;->getAuthorId-wUX8bhU()Lcom/discord/primitives/UserId;

    move-result-object v15

    if-eqz v15, :cond_2

    .line 18
    iget-object v15, v0, Lcom/discord/chat/presentation/message/MessageViewReplyPreview;->binding:Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;

    iget-object v15, v15, Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;->replyAuthorAvatar:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-static {v15, v11}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    invoke-virtual {v15, v4}, Landroid/view/View;->setVisibility(I)V

    .line 20
    iget-object v11, v0, Lcom/discord/chat/presentation/message/MessageViewReplyPreview;->binding:Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;

    iget-object v11, v11, Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;->replyIcon:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-static {v11, v8}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    invoke-virtual {v11, v13}, Landroid/view/View;->setVisibility(I)V

    .line 22
    iget-object v8, v0, Lcom/discord/chat/presentation/message/MessageViewReplyPreview;->binding:Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;

    iget-object v8, v8, Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;->replyAuthorAvatar:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {v8, v7}, Lcom/facebook/drawee/view/SimpleDraweeView;->setImageURI(Ljava/lang/String;)V

    .line 23
    iget-object v7, v0, Lcom/discord/chat/presentation/message/MessageViewReplyPreview;->binding:Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;

    iget-object v7, v7, Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;->replyAuthorName:Landroid/widget/TextView;

    invoke-static {v7, v9}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    invoke-virtual {v7, v4}, Landroid/view/View;->setVisibility(I)V

    .line 25
    iget-object v7, v0, Lcom/discord/chat/presentation/message/MessageViewReplyPreview;->binding:Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;

    iget-object v7, v7, Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;->replyAuthorName:Landroid/widget/TextView;

    invoke-virtual {v3}, Lcom/discord/chat/bridge/Message;->getUsername()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 26
    iget-object v7, v0, Lcom/discord/chat/presentation/message/MessageViewReplyPreview;->binding:Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;

    iget-object v7, v7, Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;->replyAuthorName:Landroid/widget/TextView;

    invoke-static {v3, v4, v5, v6}, Lcom/discord/chat/bridge/MessageKt;->usernameColor$default(Lcom/discord/chat/bridge/Message;IILjava/lang/Object;)I

    move-result v8

    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_2

    .line 27
    :cond_2
    iget-object v7, v0, Lcom/discord/chat/presentation/message/MessageViewReplyPreview;->binding:Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;

    iget-object v7, v7, Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;->replyAuthorAvatar:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-static {v7, v11}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    invoke-virtual {v7, v13}, Landroid/view/View;->setVisibility(I)V

    .line 29
    iget-object v7, v0, Lcom/discord/chat/presentation/message/MessageViewReplyPreview;->binding:Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;

    iget-object v7, v7, Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;->replyAuthorName:Landroid/widget/TextView;

    invoke-static {v7, v9}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    invoke-virtual {v7, v13}, Landroid/view/View;->setVisibility(I)V

    .line 31
    iget-object v7, v0, Lcom/discord/chat/presentation/message/MessageViewReplyPreview;->binding:Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;

    iget-object v7, v7, Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;->replyIcon:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-static {v7, v8}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    invoke-virtual {v7, v4}, Landroid/view/View;->setVisibility(I)V

    .line 33
    :goto_2
    invoke-virtual {v1}, Lcom/discord/chat/bridge/referencedmessage/LoadedReferencedMessage;->getSystemContent()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_3

    iget-object v3, v0, Lcom/discord/chat/presentation/message/MessageViewReplyPreview;->binding:Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;

    iget-object v6, v3, Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;->replyText:Lcom/discord/chat/presentation/message/view/MessageContentView;

    .line 34
    iget-object v3, v3, Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;->replyLeadingViews:Landroid/widget/LinearLayout;

    invoke-static {v3, v12}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/discord/chat/bridge/referencedmessage/LoadedReferencedMessage;->getSystemContent()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Lcom/discord/chat/presentation/message/utils/ReplyUtilsKt;->createSystemReplyContent(Landroid/view/View;Ljava/lang/String;)Lcom/facebook/drawee/span/DraweeSpanStringBuilder;

    move-result-object v1

    .line 35
    invoke-virtual {v6, v1}, Lcom/facebook/drawee/span/SimpleDraweeSpanTextView;->setDraweeSpanStringBuilder(Lcom/facebook/drawee/span/DraweeSpanStringBuilder;)V

    goto/16 :goto_4

    .line 36
    :cond_3
    invoke-virtual {v3}, Lcom/discord/chat/bridge/Message;->getContent()Lcom/discord/chat/bridge/structurabletext/StructurableText;

    move-result-object v1

    if-eqz v1, :cond_4

    iget-object v1, v0, Lcom/discord/chat/presentation/message/MessageViewReplyPreview;->binding:Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;

    iget-object v6, v1, Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;->replyText:Lcom/discord/chat/presentation/message/view/MessageContentView;

    .line 37
    iget-object v1, v1, Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;->replyLeadingViews:Landroid/widget/LinearLayout;

    invoke-static {v1, v12}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    invoke-virtual {v3}, Lcom/discord/chat/bridge/Message;->getContent()Lcom/discord/chat/bridge/structurabletext/StructurableText;

    move-result-object v15

    .line 39
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v7

    move-object/from16 v16, v7

    invoke-static {v7, v14}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    invoke-virtual {v3}, Lcom/discord/chat/bridge/Message;->getId-3Eiw7ao()Ljava/lang/String;

    move-result-object v17

    .line 41
    invoke-static {v3}, Lcom/discord/chat/bridge/MessageKt;->shouldAnimateEmoji(Lcom/discord/chat/bridge/Message;)Z

    move-result v18

    .line 42
    invoke-virtual {v3}, Lcom/discord/chat/bridge/Message;->getShouldShowRoleDot()Z

    move-result v19

    .line 43
    invoke-virtual {v3}, Lcom/discord/chat/bridge/Message;->getShouldShowRoleOnName()Z

    move-result v20

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x1

    const/16 v33, 0x0

    .line 44
    iget-object v3, v0, Lcom/discord/chat/presentation/message/MessageViewReplyPreview;->binding:Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;

    iget-object v3, v3, Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;->replyText:Lcom/discord/chat/presentation/message/view/MessageContentView;

    invoke-virtual {v3}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v3

    invoke-virtual {v3}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    move-result-object v3

    const-string v7, "binding.replyText.paint.fontMetrics"

    invoke-static {v3, v7}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3}, Lcom/discord/chat/presentation/textutils/TextUtilsKt;->getBaselineHeight(Landroid/graphics/Paint$FontMetrics;)F

    move-result v34

    const v35, 0x2ffe0

    const/16 v36, 0x0

    .line 45
    invoke-static/range {v15 .. v36}, Lcom/discord/chat/presentation/textutils/TextUtilsKt;->toSpannable$default(Lcom/discord/chat/bridge/structurabletext/StructurableText;Landroid/content/Context;Ljava/lang/String;ZZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ZLcom/discord/theme/DiscordTheme;FILjava/lang/Object;)Lcom/facebook/drawee/span/DraweeSpanStringBuilder;

    move-result-object v3

    .line 46
    new-instance v7, Lcom/discord/span/utilities/BackgroundSpanDrawer;

    iget-object v8, v0, Lcom/discord/chat/presentation/message/MessageViewReplyPreview;->binding:Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;

    iget-object v8, v8, Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;->replyText:Lcom/discord/chat/presentation/message/view/MessageContentView;

    invoke-static {v8, v10}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v7, v8}, Lcom/discord/span/utilities/BackgroundSpanDrawer;-><init>(Landroid/widget/TextView;)V

    invoke-static {v3, v7}, Lcom/discord/span/utilities/SpannableExtensionsKt;->coverWithSpan(Landroid/text/Spannable;Ljava/lang/Object;)V

    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 47
    invoke-static {v1, v3}, Lcom/discord/chat/presentation/message/utils/ReplyUtilsKt;->createReplyContent(Landroid/view/View;Lcom/facebook/drawee/span/DraweeSpanStringBuilder;)Lcom/facebook/drawee/span/DraweeSpanStringBuilder;

    move-result-object v1

    .line 48
    invoke-virtual {v6, v1}, Lcom/facebook/drawee/span/SimpleDraweeSpanTextView;->setDraweeSpanStringBuilder(Lcom/facebook/drawee/span/DraweeSpanStringBuilder;)V

    goto/16 :goto_4

    .line 49
    :cond_4
    iget-object v1, v0, Lcom/discord/chat/presentation/message/MessageViewReplyPreview;->binding:Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;

    iget-object v1, v1, Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;->replyText:Lcom/discord/chat/presentation/message/view/MessageContentView;

    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_4

    .line 50
    :cond_5
    instance-of v3, v1, Lcom/discord/chat/bridge/referencedmessage/SystemReferencedMessage;

    if-eqz v3, :cond_7

    .line 51
    iget-object v3, v0, Lcom/discord/chat/presentation/message/MessageViewReplyPreview;->binding:Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;

    iget-object v3, v3, Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;->replySpline:Lcom/discord/channel_spine/ChannelSpineView;

    invoke-static {v3, v7}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_6

    move v6, v4

    goto :goto_3

    :cond_6
    move v6, v13

    .line 52
    :goto_3
    invoke-virtual {v3, v6}, Landroid/view/View;->setVisibility(I)V

    .line 53
    iget-object v3, v0, Lcom/discord/chat/presentation/message/MessageViewReplyPreview;->binding:Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;

    iget-object v3, v3, Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;->replyLeadingViews:Landroid/widget/LinearLayout;

    invoke-static {v3, v12}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    .line 55
    iget-object v3, v0, Lcom/discord/chat/presentation/message/MessageViewReplyPreview;->binding:Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;

    iget-object v3, v3, Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;->replyAuthorAvatar:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-static {v3, v11}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    .line 57
    iget-object v3, v0, Lcom/discord/chat/presentation/message/MessageViewReplyPreview;->binding:Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;

    iget-object v3, v3, Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;->replyAuthorAvatar:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-static {v3, v11}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v6, Lcom/discord/react_asset_fetcher/ReactAsset;->DefaultAvatar0:Lcom/discord/react_asset_fetcher/ReactAsset;

    invoke-static {v3, v6}, Lcom/discord/react_asset_fetcher/ReactAssetUtilsKt;->setReactAsset(Lcom/facebook/drawee/view/SimpleDraweeView;Lcom/discord/react_asset_fetcher/ReactAsset;)V

    .line 58
    iget-object v3, v0, Lcom/discord/chat/presentation/message/MessageViewReplyPreview;->binding:Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;

    iget-object v3, v3, Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;->replyAuthorName:Landroid/widget/TextView;

    invoke-static {v3, v9}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    invoke-virtual {v3, v13}, Landroid/view/View;->setVisibility(I)V

    .line 60
    iget-object v3, v0, Lcom/discord/chat/presentation/message/MessageViewReplyPreview;->binding:Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;

    iget-object v3, v3, Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;->replyIcon:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-static {v3, v8}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    invoke-virtual {v3, v13}, Landroid/view/View;->setVisibility(I)V

    .line 62
    iget-object v3, v0, Lcom/discord/chat/presentation/message/MessageViewReplyPreview;->binding:Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;

    iget-object v3, v3, Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;->replyIcon:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object v6

    invoke-virtual {v6}, Lcom/discord/theme/DiscordTheme;->getBackgroundTertiary()I

    move-result v6

    invoke-virtual {v3, v6}, Landroid/view/View;->setBackgroundColor(I)V

    .line 63
    iget-object v3, v0, Lcom/discord/chat/presentation/message/MessageViewReplyPreview;->binding:Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;

    iget-object v3, v3, Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;->replyText:Lcom/discord/chat/presentation/message/view/MessageContentView;

    invoke-static {v3, v10}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    .line 65
    iget-object v3, v0, Lcom/discord/chat/presentation/message/MessageViewReplyPreview;->binding:Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;

    iget-object v6, v3, Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;->replyText:Lcom/discord/chat/presentation/message/view/MessageContentView;

    .line 66
    iget-object v3, v3, Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;->replyLeadingViews:Landroid/widget/LinearLayout;

    invoke-static {v3, v12}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    check-cast v1, Lcom/discord/chat/bridge/referencedmessage/SystemReferencedMessage;

    invoke-virtual {v1}, Lcom/discord/chat/bridge/referencedmessage/SystemReferencedMessage;->getContent()Ljava/lang/String;

    move-result-object v1

    .line 68
    invoke-static {v3, v1}, Lcom/discord/chat/presentation/message/utils/ReplyUtilsKt;->createSystemReplyContent(Landroid/view/View;Ljava/lang/String;)Lcom/facebook/drawee/span/DraweeSpanStringBuilder;

    move-result-object v1

    .line 69
    invoke-virtual {v6, v1}, Lcom/facebook/drawee/span/SimpleDraweeSpanTextView;->setDraweeSpanStringBuilder(Lcom/facebook/drawee/span/DraweeSpanStringBuilder;)V

    .line 70
    :cond_7
    :goto_4
    iget-object v1, v0, Lcom/discord/chat/presentation/message/MessageViewReplyPreview;->binding:Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;

    iget-object v1, v1, Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;->replyText:Lcom/discord/chat/presentation/message/view/MessageContentView;

    invoke-virtual {v1}, Landroid/view/View;->isLaidOut()Z

    move-result v1

    if-eqz v1, :cond_9

    iget-object v1, v0, Lcom/discord/chat/presentation/message/MessageViewReplyPreview;->binding:Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;

    iget-object v1, v1, Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;->replyText:Lcom/discord/chat/presentation/message/view/MessageContentView;

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v1

    if-lez v1, :cond_9

    .line 71
    iget-object v1, v0, Lcom/discord/chat/presentation/message/MessageViewReplyPreview;->binding:Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;

    iget-object v1, v1, Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;->replyText:Lcom/discord/chat/presentation/message/view/MessageContentView;

    .line 72
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v3

    const/high16 v6, -0x80000000

    invoke-static {v3, v6}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v3

    .line 73
    invoke-static {v4, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v6

    .line 74
    invoke-virtual {v1, v3, v6}, Landroid/view/View;->measure(II)V

    .line 75
    iget-object v1, v0, Lcom/discord/chat/presentation/message/MessageViewReplyPreview;->binding:Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;

    iget-object v1, v1, Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;->replyText:Lcom/discord/chat/presentation/message/view/MessageContentView;

    iget-object v3, v0, Lcom/discord/chat/presentation/message/MessageViewReplyPreview;->replyTextLineBounds:Landroid/graphics/Rect;

    invoke-virtual {v1, v4, v3}, Landroid/widget/TextView;->getLineBounds(ILandroid/graphics/Rect;)I

    .line 76
    iget-object v1, v0, Lcom/discord/chat/presentation/message/MessageViewReplyPreview;->replyTextLineBounds:Landroid/graphics/Rect;

    iget v3, v1, Landroid/graphics/Rect;->bottom:I

    iget v1, v1, Landroid/graphics/Rect;->top:I

    sub-int/2addr v3, v1

    .line 77
    iget-object v1, v0, Lcom/discord/chat/presentation/message/MessageViewReplyPreview;->binding:Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;

    iget-object v1, v1, Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;->replyLeadingViews:Landroid/widget/LinearLayout;

    invoke-static {v1, v12}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    if-eqz v4, :cond_8

    .line 79
    iput v3, v4, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 80
    invoke-virtual {v1, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_5

    .line 81
    :cond_8
    new-instance v1, Ljava/lang/NullPointerException;

    const-string v2, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams"

    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 82
    :cond_9
    :goto_5
    invoke-virtual {v0, v5}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 83
    new-instance v1, Lcom/discord/chat/presentation/message/MessageViewReplyPreview$configureReply$4;

    invoke-direct {v1, v0, v2}, Lcom/discord/chat/presentation/message/MessageViewReplyPreview$configureReply$4;-><init>(Lcom/discord/chat/presentation/message/MessageViewReplyPreview;Lkotlin/jvm/functions/Function0;)V

    .line 84
    invoke-static {v0, v1}, Landroidx/core/view/w0;->q0(Landroid/view/View;Landroidx/core/view/a;)V

    return-void
.end method

.method public getSpineOriginView()Landroid/view/View;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/discord/chat/presentation/message/MessageViewReplyPreview;->binding:Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;->replyAuthorAvatar:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 4
    .line 5
    const-string v1, "it"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v1, 0x0

    .line 19
    :goto_0
    if-eqz v1, :cond_1

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_1
    const/4 v0, 0x0

    .line 23
    :goto_1
    if-nez v0, :cond_2

    .line 24
    .line 25
    iget-object v0, p0, Lcom/discord/chat/presentation/message/MessageViewReplyPreview;->binding:Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;

    .line 26
    .line 27
    iget-object v0, v0, Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;->replyIcon:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 28
    .line 29
    const-string v1, "binding.replyIcon"

    .line 30
    .line 31
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    :cond_2
    return-object v0
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
.end method
