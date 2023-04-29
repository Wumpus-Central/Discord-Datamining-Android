.class final Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay$voiceBubbleProvider$1;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider<",
        "Lcom/discord/mobile_voice_overlay/views/OverlayVoiceBubble;",
        ">;",
        "Lcom/discord/mobile_voice_overlay/views/OverlayVoiceBubble;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "Lcom/discord/mobile_voice_overlay/views/OverlayVoiceBubble;",
        "it",
        "Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;


# direct methods
.method constructor <init>(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay$voiceBubbleProvider$1;->this$0:Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lcom/discord/mobile_voice_overlay/views/OverlayVoiceBubble;Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay$voiceBubbleProvider$1;->invoke$lambda$2(Lcom/discord/mobile_voice_overlay/views/OverlayVoiceBubble;Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;Landroid/view/View;)V

    return-void
.end method

.method private static final invoke$lambda$2(Lcom/discord/mobile_voice_overlay/views/OverlayVoiceBubble;Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;Landroid/view/View;)V
    .locals 7

    .line 1
    const-string p2, "$voiceBubble"

    .line 2
    .line 3
    invoke-static {p0, p2}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p2, "this$0"

    .line 7
    .line 8
    invoke-static {p1, p2}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/discord/mobile_voice_overlay/views/OverlayVoiceBubble;->getImageView$mobile_voice_overlay_release()Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    const-string v0, "null cannot be cast to non-null type android.view.View"

    .line 16
    .line 17
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    new-instance v0, Landroid/graphics/Rect;

    .line 21
    .line 22
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    instance-of v2, v1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 27
    .line 28
    const/4 v3, 0x0

    .line 29
    if-eqz v2, :cond_0

    .line 30
    .line 31
    check-cast v1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    move-object v1, v3

    .line 35
    :goto_0
    const/4 v2, 0x0

    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    iget v1, v1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    move v1, v2

    .line 42
    :goto_1
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    instance-of v5, v4, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 47
    .line 48
    if-eqz v5, :cond_2

    .line 49
    .line 50
    check-cast v4, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_2
    move-object v4, v3

    .line 54
    :goto_2
    if-eqz v4, :cond_3

    .line 55
    .line 56
    iget v4, v4, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 57
    .line 58
    goto :goto_3

    .line 59
    :cond_3
    move v4, v2

    .line 60
    :goto_3
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    instance-of v6, v5, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 65
    .line 66
    if-eqz v6, :cond_4

    .line 67
    .line 68
    check-cast v5, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 69
    .line 70
    goto :goto_4

    .line 71
    :cond_4
    move-object v5, v3

    .line 72
    :goto_4
    if-eqz v5, :cond_5

    .line 73
    .line 74
    iget v5, v5, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 75
    .line 76
    goto :goto_5

    .line 77
    :cond_5
    move v5, v2

    .line 78
    :goto_5
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    instance-of v6, p2, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 83
    .line 84
    if-eqz v6, :cond_6

    .line 85
    .line 86
    move-object v3, p2

    .line 87
    check-cast v3, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 88
    .line 89
    :cond_6
    if-eqz v3, :cond_7

    .line 90
    .line 91
    iget p2, v3, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 92
    .line 93
    goto :goto_6

    .line 94
    :cond_7
    move p2, v2

    .line 95
    :goto_6
    invoke-direct {v0, v1, v4, v5, p2}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 96
    .line 97
    .line 98
    invoke-static {p1}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;->access$getMenuDialogProvider$p(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;)Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    new-instance p2, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay$voiceBubbleProvider$1$1$1;

    .line 103
    .line 104
    invoke-direct {p2, p0, v0}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay$voiceBubbleProvider$1$1$1;-><init>(Lcom/discord/mobile_voice_overlay/views/OverlayVoiceBubble;Landroid/graphics/Rect;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p1, p2}, Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider;->withView(Lkotlin/jvm/functions/Function1;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0, v2}, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->setBubbleTouchable(Z)V

    .line 111
    .line 112
    .line 113
    return-void
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
.end method


# virtual methods
.method public final invoke(Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider;)Lcom/discord/mobile_voice_overlay/views/OverlayVoiceBubble;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider<",
            "Lcom/discord/mobile_voice_overlay/views/OverlayVoiceBubble;",
            ">;)",
            "Lcom/discord/mobile_voice_overlay/views/OverlayVoiceBubble;"
        }
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object p1, p0, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay$voiceBubbleProvider$1;->this$0:Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;

    invoke-static {p1}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;->access$getContext$p(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;)Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget v0, Lcom/discord/mobile_voice_overlay/R$dimen;->overlay_safe_margin:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result p1

    .line 3
    new-instance v0, Lcom/discord/mobile_voice_overlay/views/OverlayVoiceBubble;

    iget-object v1, p0, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay$voiceBubbleProvider$1;->this$0:Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;

    invoke-static {v1}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;->access$getContext$p(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;)Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/discord/mobile_voice_overlay/views/OverlayVoiceBubble;-><init>(Landroid/content/Context;)V

    .line 4
    invoke-virtual {v0}, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->getInsetMargins()Landroid/graphics/Rect;

    move-result-object v1

    neg-int v2, p1

    invoke-virtual {v1, v2, p1, v2, p1}, Landroid/graphics/Rect;->set(IIII)V

    .line 5
    iget-object p1, p0, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay$voiceBubbleProvider$1;->this$0:Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;

    new-instance v1, Lcom/discord/mobile_voice_overlay/a;

    invoke-direct {v1, v0, p1}, Lcom/discord/mobile_voice_overlay/a;-><init>(Lcom/discord/mobile_voice_overlay/views/OverlayVoiceBubble;Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 6
    new-instance p1, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay$voiceBubbleProvider$1$2;

    iget-object v1, p0, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay$voiceBubbleProvider$1;->this$0:Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;

    invoke-direct {p1, v1, v0}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay$voiceBubbleProvider$1$2;-><init>(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;Lcom/discord/mobile_voice_overlay/views/OverlayVoiceBubble;)V

    invoke-virtual {v0, p1}, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->setTouchDispatchSideEffectHandler$mobile_voice_overlay_release(Lkotlin/jvm/functions/Function1;)V

    .line 7
    new-instance p1, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay$voiceBubbleProvider$1$3;

    iget-object v1, p0, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay$voiceBubbleProvider$1;->this$0:Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;

    invoke-direct {p1, v1, v0}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay$voiceBubbleProvider$1$3;-><init>(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;Lcom/discord/mobile_voice_overlay/views/OverlayVoiceBubble;)V

    invoke-virtual {v0, p1}, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->setOnMovingStateChanged(Lkotlin/jvm/functions/Function1;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider;

    invoke-virtual {p0, p1}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay$voiceBubbleProvider$1;->invoke(Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider;)Lcom/discord/mobile_voice_overlay/views/OverlayVoiceBubble;

    move-result-object p1

    return-object p1
.end method
