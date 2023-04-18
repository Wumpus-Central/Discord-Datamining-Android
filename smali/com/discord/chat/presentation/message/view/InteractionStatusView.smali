.class public final Lcom/discord/chat/presentation/message/view/InteractionStatusView;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u001b\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J#\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000e\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/discord/chat/presentation/message/view/InteractionStatusView;",
        "Landroidx/constraintlayout/widget/ConstraintLayout;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "binding",
        "Lcom/discord/chat/databinding/InteractionStatusViewBinding;",
        "setInteractionStatus",
        "",
        "messageId",
        "Lcom/discord/primitives/MessageId;",
        "interactionStatus",
        "Lcom/discord/chat/bridge/interaction/InteractionStatus;",
        "setInteractionStatus-ntcYbpo",
        "(Ljava/lang/String;Lcom/discord/chat/bridge/interaction/InteractionStatus;)V",
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
.field private binding:Lcom/discord/chat/databinding/InteractionStatusViewBinding;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-direct {p0, p1, v0, v1, v0}, Lcom/discord/chat/presentation/message/view/InteractionStatusView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1, p2}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 3
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-static {p1, p0}, Lcom/discord/chat/databinding/InteractionStatusViewBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lcom/discord/chat/databinding/InteractionStatusViewBinding;

    move-result-object p1

    const-string p2, "inflate(LayoutInflater.from(context), this)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/discord/chat/presentation/message/view/InteractionStatusView;->binding:Lcom/discord/chat/databinding/InteractionStatusViewBinding;

    .line 4
    iget-object p1, p1, Lcom/discord/chat/databinding/InteractionStatusViewBinding;->viewInteractionStatusDangerIcon:Lcom/facebook/drawee/view/SimpleDraweeView;

    const-string p2, "_init_$lambda$0"

    .line 5
    invoke-static {p1, p2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, Lcom/discord/react_asset_fetcher/ReactAsset;->Warning:Lcom/discord/react_asset_fetcher/ReactAsset;

    invoke-static {p1, p2}, Lcom/discord/react_asset_fetcher/ReactAssetUtilsKt;->setReactAsset(Lcom/facebook/drawee/view/SimpleDraweeView;Lcom/discord/react_asset_fetcher/ReactAsset;)V

    .line 6
    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object p2

    invoke-virtual {p2}, Lcom/discord/theme/DiscordTheme;->getTextDanger()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/discord/theme/utils/ColorUtilsKt;->setTintColor(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/Integer;)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 1
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/discord/chat/presentation/message/view/InteractionStatusView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method


# virtual methods
.method public final setInteractionStatus-ntcYbpo(Ljava/lang/String;Lcom/discord/chat/bridge/interaction/InteractionStatus;)V
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "messageId"

    .line 4
    .line 5
    move-object/from16 v4, p1

    .line 6
    .line 7
    invoke-static {v4, v1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string v1, "interactionStatus"

    .line 11
    .line 12
    move-object/from16 v15, p2

    .line 13
    .line 14
    invoke-static {v15, v1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget-object v1, v0, Lcom/discord/chat/presentation/message/view/InteractionStatusView;->binding:Lcom/discord/chat/databinding/InteractionStatusViewBinding;

    .line 18
    .line 19
    iget-object v1, v1, Lcom/discord/chat/databinding/InteractionStatusViewBinding;->viewInteractionStatusLoadingDots:Lcom/discord/progress_dots/ProgressDots;

    .line 20
    .line 21
    const-string v2, "binding.viewInteractionStatusLoadingDots"

    .line 22
    .line 23
    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual/range {p2 .. p2}, Lcom/discord/chat/bridge/interaction/InteractionStatus;->isLoading()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    const/4 v3, 0x0

    .line 31
    const/16 v5, 0x8

    .line 32
    .line 33
    if-eqz v2, :cond_0

    .line 34
    .line 35
    move v2, v3

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    move v2, v5

    .line 38
    :goto_0
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 39
    .line 40
    .line 41
    iget-object v1, v0, Lcom/discord/chat/presentation/message/view/InteractionStatusView;->binding:Lcom/discord/chat/databinding/InteractionStatusViewBinding;

    .line 42
    .line 43
    iget-object v1, v1, Lcom/discord/chat/databinding/InteractionStatusViewBinding;->viewInteractionStatusDangerIcon:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 44
    .line 45
    const-string v2, "binding.viewInteractionStatusDangerIcon"

    .line 46
    .line 47
    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual/range {p2 .. p2}, Lcom/discord/chat/bridge/interaction/InteractionStatus;->isFailed()Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-eqz v2, :cond_1

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_1
    move v3, v5

    .line 58
    :goto_1
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 59
    .line 60
    .line 61
    iget-object v1, v0, Lcom/discord/chat/presentation/message/view/InteractionStatusView;->binding:Lcom/discord/chat/databinding/InteractionStatusViewBinding;

    .line 62
    .line 63
    iget-object v1, v1, Lcom/discord/chat/databinding/InteractionStatusViewBinding;->viewInteractionStatusLabelMessage:Landroid/widget/TextView;

    .line 64
    .line 65
    const-string v2, "setInteractionStatus_ntcYbpo$lambda$2"

    .line 66
    .line 67
    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual/range {p2 .. p2}, Lcom/discord/chat/bridge/interaction/InteractionStatus;->getText()Lcom/discord/chat/bridge/structurabletext/StructurableText;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    move-object v3, v5

    .line 79
    const-string v6, "context"

    .line 80
    .line 81
    invoke-static {v5, v6}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    const/4 v5, 0x0

    .line 85
    const/4 v6, 0x0

    .line 86
    const/4 v7, 0x0

    .line 87
    const/4 v8, 0x0

    .line 88
    const/4 v9, 0x0

    .line 89
    const/4 v10, 0x0

    .line 90
    const/4 v11, 0x0

    .line 91
    const/4 v12, 0x0

    .line 92
    const/4 v13, 0x0

    .line 93
    const/4 v14, 0x0

    .line 94
    const/16 v16, 0x0

    .line 95
    .line 96
    move-object/from16 v15, v16

    .line 97
    .line 98
    const/16 v17, 0x0

    .line 99
    .line 100
    const/16 v18, 0x0

    .line 101
    .line 102
    const/16 v19, 0x0

    .line 103
    .line 104
    const/16 v20, 0x0

    .line 105
    .line 106
    invoke-virtual {v1}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 107
    .line 108
    .line 109
    move-result-object v21

    .line 110
    invoke-virtual/range {v21 .. v21}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    .line 111
    .line 112
    .line 113
    move-result-object v5

    .line 114
    const-string v6, "paint.fontMetrics"

    .line 115
    .line 116
    invoke-static {v5, v6}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    invoke-static {v5}, Lcom/discord/chat/presentation/textutils/TextUtilsKt;->getBaselineHeight(Landroid/graphics/Paint$FontMetrics;)F

    .line 120
    .line 121
    .line 122
    move-result v21

    .line 123
    const v22, 0x3ffe0

    .line 124
    .line 125
    .line 126
    const/16 v23, 0x0

    .line 127
    .line 128
    move-object/from16 v4, p1

    .line 129
    .line 130
    const/4 v5, 0x0

    .line 131
    const/4 v6, 0x0

    .line 132
    invoke-static/range {v2 .. v23}, Lcom/discord/chat/presentation/textutils/TextUtilsKt;->toSpannable$default(Lcom/discord/chat/bridge/structurabletext/StructurableText;Landroid/content/Context;Ljava/lang/String;ZZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ZLcom/discord/theme/DiscordTheme;FILjava/lang/Object;)Lcom/facebook/drawee/span/DraweeSpanStringBuilder;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    new-instance v3, Lcom/discord/span/utilities/BackgroundSpanDrawer;

    .line 137
    .line 138
    invoke-direct {v3, v1}, Lcom/discord/span/utilities/BackgroundSpanDrawer;-><init>(Landroid/widget/TextView;)V

    .line 139
    .line 140
    .line 141
    invoke-static {v2, v3}, Lcom/discord/span/utilities/SpannableExtensionsKt;->coverWithSpan(Landroid/text/Spannable;Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    invoke-static {v1, v2}, Lcom/discord/misc/utilities/view/ViewUtilsKt;->setOptionalText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual/range {p2 .. p2}, Lcom/discord/chat/bridge/interaction/InteractionStatus;->isFailed()Z

    .line 148
    .line 149
    .line 150
    move-result v2

    .line 151
    if-eqz v2, :cond_2

    .line 152
    .line 153
    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    invoke-virtual {v2}, Lcom/discord/theme/DiscordTheme;->getTextDanger()I

    .line 158
    .line 159
    .line 160
    move-result v2

    .line 161
    goto :goto_2

    .line 162
    :cond_2
    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    .line 163
    .line 164
    .line 165
    move-result-object v2

    .line 166
    invoke-virtual {v2}, Lcom/discord/theme/DiscordTheme;->getTextMuted()I

    .line 167
    .line 168
    .line 169
    move-result v2

    .line 170
    :goto_2
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 171
    .line 172
    .line 173
    return-void
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
