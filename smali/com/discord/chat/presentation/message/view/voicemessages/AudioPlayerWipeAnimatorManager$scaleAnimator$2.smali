.class final Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager$scaleAnimator$2;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager;-><init>(Landroid/content/Context;Lcom/discord/chat/databinding/AudioPlayerViewBinding;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function0<",
        "Landroid/animation/ValueAnimator;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n\u00a2\u0006\u0002\u0008\u0003"
    }
    d2 = {
        "<anonymous>",
        "Landroid/animation/ValueAnimator;",
        "kotlin.jvm.PlatformType",
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
.field final synthetic $binding:Lcom/discord/chat/databinding/AudioPlayerViewBinding;

.field final synthetic this$0:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager;


# direct methods
.method constructor <init>(Lcom/discord/chat/databinding/AudioPlayerViewBinding;Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager$scaleAnimator$2;->$binding:Lcom/discord/chat/databinding/AudioPlayerViewBinding;

    iput-object p2, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager$scaleAnimator$2;->this$0:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lcom/discord/chat/databinding/AudioPlayerViewBinding;Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager;Landroid/animation/ValueAnimator;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager$scaleAnimator$2;->invoke$lambda$1$lambda$0(Lcom/discord/chat/databinding/AudioPlayerViewBinding;Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager;Landroid/animation/ValueAnimator;)V

    return-void
.end method

.method private static final invoke$lambda$1$lambda$0(Lcom/discord/chat/databinding/AudioPlayerViewBinding;Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager;Landroid/animation/ValueAnimator;)V
    .locals 6

    .line 1
    const-string v0, "$binding"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "this$0"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p2}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    const-string v0, "null cannot be cast to non-null type kotlin.Float"

    .line 16
    .line 17
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    check-cast p2, Ljava/lang/Float;

    .line 21
    .line 22
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    iget-object v0, p0, Lcom/discord/chat/databinding/AudioPlayerViewBinding;->playerContainer:Landroid/widget/LinearLayout;

    .line 27
    .line 28
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    const/4 v1, 0x2

    .line 33
    if-lez v0, :cond_0

    .line 34
    .line 35
    iget-object v0, p0, Lcom/discord/chat/databinding/AudioPlayerViewBinding;->wipe:Landroid/view/View;

    .line 36
    .line 37
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-lez v0, :cond_0

    .line 42
    .line 43
    iget-object v0, p0, Lcom/discord/chat/databinding/AudioPlayerViewBinding;->playerContainer:Landroid/widget/LinearLayout;

    .line 44
    .line 45
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    int-to-float v0, v0

    .line 50
    iget-object v2, p0, Lcom/discord/chat/databinding/AudioPlayerViewBinding;->wipe:Landroid/view/View;

    .line 51
    .line 52
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    int-to-float v2, v2

    .line 57
    div-float/2addr v0, v2

    .line 58
    int-to-float v2, v1

    .line 59
    mul-float/2addr v0, v2

    .line 60
    goto :goto_0

    .line 61
    :cond_0
    const/4 v0, 0x0

    .line 62
    :goto_0
    iget-object v2, p0, Lcom/discord/chat/databinding/AudioPlayerViewBinding;->wipe:Landroid/view/View;

    .line 63
    .line 64
    const/4 v3, 0x1

    .line 65
    int-to-float v4, v3

    .line 66
    mul-float/2addr v0, p2

    .line 67
    add-float/2addr v0, v4

    .line 68
    invoke-virtual {v2, v0}, Landroid/view/View;->setScaleX(F)V

    .line 69
    .line 70
    .line 71
    iget-object v2, p0, Lcom/discord/chat/databinding/AudioPlayerViewBinding;->wipe:Landroid/view/View;

    .line 72
    .line 73
    invoke-virtual {v2, v0}, Landroid/view/View;->setScaleY(F)V

    .line 74
    .line 75
    .line 76
    invoke-static {p1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager;->access$getButtonContainerDefaultDrawable(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager;)Landroid/graphics/drawable/Drawable;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    const/16 v2, 0xff

    .line 81
    .line 82
    if-nez v0, :cond_1

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_1
    sub-float/2addr v4, p2

    .line 86
    int-to-float v5, v2

    .line 87
    mul-float/2addr v4, v5

    .line 88
    float-to-int v4, v4

    .line 89
    invoke-virtual {v0, v4}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 90
    .line 91
    .line 92
    :goto_1
    invoke-static {p1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager;->access$getButtonContainerActiveDrawable(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager;)Landroid/graphics/drawable/ColorDrawable;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    int-to-float v2, v2

    .line 97
    mul-float/2addr p2, v2

    .line 98
    float-to-int p2, p2

    .line 99
    invoke-virtual {v0, p2}, Landroid/graphics/drawable/ColorDrawable;->setAlpha(I)V

    .line 100
    .line 101
    .line 102
    iget-object p2, p0, Lcom/discord/chat/databinding/AudioPlayerViewBinding;->buttonContainer:Landroid/view/View;

    .line 103
    .line 104
    new-instance v0, Landroid/graphics/drawable/LayerDrawable;

    .line 105
    .line 106
    new-array v1, v1, [Landroid/graphics/drawable/Drawable;

    .line 107
    .line 108
    const/4 v2, 0x0

    .line 109
    invoke-static {p1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager;->access$getButtonContainerDefaultDrawable(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager;)Landroid/graphics/drawable/Drawable;

    .line 110
    .line 111
    .line 112
    move-result-object v4

    .line 113
    aput-object v4, v1, v2

    .line 114
    .line 115
    invoke-static {p1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager;->access$getButtonContainerActiveDrawable(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager;)Landroid/graphics/drawable/ColorDrawable;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    aput-object p1, v1, v3

    .line 120
    .line 121
    invoke-direct {v0, v1}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p2, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 125
    .line 126
    .line 127
    iget-object p0, p0, Lcom/discord/chat/databinding/AudioPlayerViewBinding;->buttonContainer:Landroid/view/View;

    .line 128
    .line 129
    const-string p1, "binding.buttonContainer"

    .line 130
    .line 131
    invoke-static {p0, p1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    invoke-static {p0}, Lcom/discord/misc/utilities/view/ViewClippingUtilsKt;->clipToCircle(Landroid/view/View;)V

    .line 135
    .line 136
    .line 137
    return-void
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
.end method


# virtual methods
.method public final invoke()Landroid/animation/ValueAnimator;
    .locals 4

    const/4 v0, 0x2

    new-array v0, v0, [F

    .line 2
    fill-array-data v0, :array_0

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    iget-object v1, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager$scaleAnimator$2;->$binding:Lcom/discord/chat/databinding/AudioPlayerViewBinding;

    iget-object v2, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager$scaleAnimator$2;->this$0:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager;

    .line 3
    new-instance v3, Lcom/discord/chat/presentation/message/view/voicemessages/k;

    invoke-direct {v3, v1, v2}, Lcom/discord/chat/presentation/message/view/voicemessages/k;-><init>(Lcom/discord/chat/databinding/AudioPlayerViewBinding;Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager;)V

    invoke-virtual {v0, v3}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    return-object v0

    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager$scaleAnimator$2;->invoke()Landroid/animation/ValueAnimator;

    move-result-object v0

    return-object v0
.end method
