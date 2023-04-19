.class public final Lcom/discord/chat/presentation/message/view/GiftView;
.super Landroidx/cardview/widget/CardView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/chat/presentation/message/view/GiftView$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u0000 #2\u00020\u0001:\u0001#B\u001d\u0008\u0007\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\n\u0008\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u00a2\u0006\u0004\u0008!\u0010\"J\u0008\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J6\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00020\r2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00020\rR\u0017\u0010\u0013\u001a\u00020\u00128\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001c\u00a8\u0006$"
    }
    d2 = {
        "Lcom/discord/chat/presentation/message/view/GiftView;",
        "Landroidx/cardview/widget/CardView;",
        "",
        "initTextStyling",
        "",
        "accessoryId",
        "",
        "didResolve",
        "Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;",
        "gift",
        "bindSplash",
        "Lcom/discord/chat/presentation/message/messagepart/GiftMessageAccessory;",
        "accessory",
        "Lkotlin/Function1;",
        "",
        "onTapEmbed",
        "onTapAccept",
        "bind",
        "Lcom/discord/chat/databinding/GiftViewBinding;",
        "binding",
        "Lcom/discord/chat/databinding/GiftViewBinding;",
        "getBinding",
        "()Lcom/discord/chat/databinding/GiftViewBinding;",
        "Lcom/discord/chat/presentation/message/view/GiftView$Companion$State;",
        "lastState",
        "Lcom/discord/chat/presentation/message/view/GiftView$Companion$State;",
        "Landroid/animation/LayoutTransition;",
        "resolvedTransition",
        "Landroid/animation/LayoutTransition;",
        "Landroid/content/Context;",
        "context",
        "Landroid/util/AttributeSet;",
        "attrs",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "Companion",
        "chat_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final Companion:Lcom/discord/chat/presentation/message/view/GiftView$Companion;


# instance fields
.field private final binding:Lcom/discord/chat/databinding/GiftViewBinding;

.field private lastState:Lcom/discord/chat/presentation/message/view/GiftView$Companion$State;

.field private final resolvedTransition:Landroid/animation/LayoutTransition;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/discord/chat/presentation/message/view/GiftView$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/discord/chat/presentation/message/view/GiftView$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/discord/chat/presentation/message/view/GiftView;->Companion:Lcom/discord/chat/presentation/message/view/GiftView$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-direct {p0, p1, v0, v1, v0}, Lcom/discord/chat/presentation/message/view/GiftView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1, p2}, Landroidx/cardview/widget/CardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 3
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    const/4 p2, 0x1

    invoke-static {p1, p0, p2}, Lcom/discord/chat/databinding/GiftViewBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/discord/chat/databinding/GiftViewBinding;

    move-result-object p1

    const-string v0, "inflate(LayoutInflater.from(context), this, true)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/discord/chat/presentation/message/view/GiftView;->binding:Lcom/discord/chat/databinding/GiftViewBinding;

    .line 4
    new-instance p1, Landroid/animation/LayoutTransition;

    invoke-direct {p1}, Landroid/animation/LayoutTransition;-><init>()V

    const/4 v0, 0x0

    .line 5
    invoke-virtual {p1, v0}, Landroid/animation/LayoutTransition;->disableTransitionType(I)V

    .line 6
    invoke-virtual {p1, p2}, Landroid/animation/LayoutTransition;->disableTransitionType(I)V

    .line 7
    iput-object p1, p0, Lcom/discord/chat/presentation/message/view/GiftView;->resolvedTransition:Landroid/animation/LayoutTransition;

    .line 8
    invoke-virtual {p0, p2}, Landroidx/cardview/widget/CardView;->setUseCompatPadding(Z)V

    .line 9
    invoke-virtual {p0, p2}, Landroid/view/View;->setClickable(Z)V

    const/4 p1, 0x4

    .line 10
    invoke-static {p1}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getDpToPx(I)I

    move-result p1

    int-to-float p1, p1

    invoke-virtual {p0, p1}, Landroidx/cardview/widget/CardView;->setRadius(F)V

    .line 11
    invoke-static {p2}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getDpToPx(I)I

    move-result p1

    int-to-float p1, p1

    invoke-virtual {p0, p1}, Landroidx/cardview/widget/CardView;->setCardElevation(F)V

    .line 12
    invoke-direct {p0}, Lcom/discord/chat/presentation/message/view/GiftView;->initTextStyling()V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 1
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/discord/chat/presentation/message/view/GiftView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method private static final bind$lambda$14(Lkotlin/jvm/functions/Function1;Lcom/discord/chat/bridge/gift/GiftEmbed;Landroid/view/View;)V
    .locals 0

    .line 1
    const-string p2, "$onTapEmbed"

    .line 2
    .line 3
    invoke-static {p0, p2}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p2, "$gift"

    .line 7
    .line 8
    invoke-static {p1, p2}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    check-cast p1, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->getGiftCode()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    return-void
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

.method private static final bind$lambda$17$lambda$16(Lkotlin/jvm/functions/Function1;Lcom/discord/chat/bridge/gift/GiftEmbed;Landroid/view/View;)V
    .locals 0

    .line 1
    const-string p2, "$onTapAccept"

    .line 2
    .line 3
    invoke-static {p0, p2}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p2, "$gift"

    .line 7
    .line 8
    invoke-static {p1, p2}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    check-cast p1, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->getGiftCode()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    return-void
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

.method private final bindSplash(Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;Z)V
    .locals 13

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p2, :cond_0

    .line 3
    .line 4
    const/16 p2, 0x12c

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    move p2, v0

    .line 8
    :goto_0
    iget-object v1, p0, Lcom/discord/chat/presentation/message/view/GiftView;->binding:Lcom/discord/chat/databinding/GiftViewBinding;

    .line 9
    .line 10
    iget-object v1, v1, Lcom/discord/chat/databinding/GiftViewBinding;->splash:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 11
    .line 12
    invoke-virtual {v1}, Lcom/facebook/drawee/view/a;->getHierarchy()Lcom/facebook/drawee/interfaces/DraweeHierarchy;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Lcom/facebook/drawee/generic/GenericDraweeHierarchy;

    .line 17
    .line 18
    invoke-virtual {v1, p2}, Lcom/facebook/drawee/generic/GenericDraweeHierarchy;->w(I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->getSplashOpacity()F

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    const/16 v1, 0xff

    .line 26
    .line 27
    int-to-float v1, v1

    .line 28
    mul-float/2addr p2, v1

    .line 29
    invoke-static {p2}, Lzf/a;->a(F)I

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    invoke-virtual {p1}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->getBackgroundColor()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    invoke-static {v1, p2}, Landroidx/core/graphics/a;->k(II)I

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    iget-object p2, p0, Lcom/discord/chat/presentation/message/view/GiftView;->binding:Lcom/discord/chat/databinding/GiftViewBinding;

    .line 42
    .line 43
    iget-object p2, p2, Lcom/discord/chat/databinding/GiftViewBinding;->splash:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 44
    .line 45
    invoke-virtual {p1}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->getSplashUrl()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-static {v1}, Lcom/facebook/imagepipeline/request/ImageRequest;->fromUri(Ljava/lang/String;)Lcom/facebook/imagepipeline/request/ImageRequest;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    if-eqz v1, :cond_1

    .line 54
    .line 55
    invoke-static {}, Lk4/c;->g()Lcom/facebook/drawee/backends/pipeline/PipelineDraweeControllerBuilder;

    .line 56
    .line 57
    .line 58
    move-result-object v10

    .line 59
    invoke-static {v1}, Lcom/facebook/imagepipeline/request/ImageRequestBuilder;->b(Lcom/facebook/imagepipeline/request/ImageRequest;)Lcom/facebook/imagepipeline/request/ImageRequestBuilder;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    new-instance v11, Lcom/discord/image/fresco/postprocessors/PostProcessor$Composite;

    .line 64
    .line 65
    const/4 v2, 0x2

    .line 66
    new-array v12, v2, [Lcom/discord/image/fresco/postprocessors/PostProcessor;

    .line 67
    .line 68
    sget-object v2, Lcom/discord/image/fresco/postprocessors/PostProcessor$Grayscale;->INSTANCE:Lcom/discord/image/fresco/postprocessors/PostProcessor$Grayscale;

    .line 69
    .line 70
    aput-object v2, v12, v0

    .line 71
    .line 72
    new-instance v0, Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient;

    .line 73
    .line 74
    sget-object v3, Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient$Direction;->TopToBottom:Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient$Direction;

    .line 75
    .line 76
    invoke-virtual {p1}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->getBackgroundColor()I

    .line 77
    .line 78
    .line 79
    move-result v5

    .line 80
    const/4 v6, 0x0

    .line 81
    const/high16 v7, 0x3f000000    # 0.5f

    .line 82
    .line 83
    const/16 v8, 0x8

    .line 84
    .line 85
    const/4 v9, 0x0

    .line 86
    move-object v2, v0

    .line 87
    invoke-direct/range {v2 .. v9}, Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient;-><init>(Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient$Direction;IIFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 88
    .line 89
    .line 90
    const/4 v2, 0x1

    .line 91
    aput-object v0, v12, v2

    .line 92
    .line 93
    invoke-direct {v11, v12}, Lcom/discord/image/fresco/postprocessors/PostProcessor$Composite;-><init>([Lcom/discord/image/fresco/postprocessors/PostProcessor;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v11}, Lcom/discord/image/fresco/postprocessors/PostProcessor$Composite;->create()Lcom/facebook/imagepipeline/request/BasePostprocessor;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-virtual {v1, v0}, Lcom/facebook/imagepipeline/request/ImageRequestBuilder;->A(Lcom/facebook/imagepipeline/request/Postprocessor;)Lcom/facebook/imagepipeline/request/ImageRequestBuilder;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-virtual {v0}, Lcom/facebook/imagepipeline/request/ImageRequestBuilder;->a()Lcom/facebook/imagepipeline/request/ImageRequest;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-virtual {v10, v0}, Lcom/facebook/drawee/controller/AbstractDraweeControllerBuilder;->D(Ljava/lang/Object;)Lcom/facebook/drawee/controller/AbstractDraweeControllerBuilder;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    check-cast v0, Lcom/facebook/drawee/backends/pipeline/PipelineDraweeControllerBuilder;

    .line 113
    .line 114
    invoke-virtual {p1}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->getGiftCode()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    invoke-virtual {p1}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->getSplashUrl()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    new-instance v2, Ljava/lang/StringBuilder;

    .line 123
    .line 124
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 125
    .line 126
    .line 127
    const-string v3, "splash-"

    .line 128
    .line 129
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    const-string v1, "-"

    .line 136
    .line 137
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    invoke-virtual {v0, p1}, Lcom/facebook/drawee/controller/AbstractDraweeControllerBuilder;->A(Ljava/lang/Object;)Lcom/facebook/drawee/controller/AbstractDraweeControllerBuilder;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    check-cast p1, Lcom/facebook/drawee/backends/pipeline/PipelineDraweeControllerBuilder;

    .line 152
    .line 153
    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/GiftView;->binding:Lcom/discord/chat/databinding/GiftViewBinding;

    .line 154
    .line 155
    iget-object v0, v0, Lcom/discord/chat/databinding/GiftViewBinding;->splash:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 156
    .line 157
    invoke-virtual {v0}, Lcom/facebook/drawee/view/a;->getController()Lcom/facebook/drawee/interfaces/DraweeController;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    invoke-virtual {p1, v0}, Lcom/facebook/drawee/controller/AbstractDraweeControllerBuilder;->F(Lcom/facebook/drawee/interfaces/DraweeController;)Lcom/facebook/drawee/controller/AbstractDraweeControllerBuilder;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    check-cast p1, Lcom/facebook/drawee/backends/pipeline/PipelineDraweeControllerBuilder;

    .line 166
    .line 167
    invoke-virtual {p1}, Lcom/facebook/drawee/controller/AbstractDraweeControllerBuilder;->c()Lcom/facebook/drawee/controller/a;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    goto :goto_1

    .line 172
    :cond_1
    const/4 p1, 0x0

    .line 173
    :goto_1
    invoke-virtual {p2, p1}, Lcom/facebook/drawee/view/a;->setController(Lcom/facebook/drawee/interfaces/DraweeController;)V

    .line 174
    .line 175
    .line 176
    return-void
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

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Lcom/discord/chat/bridge/gift/GiftEmbed;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/discord/chat/presentation/message/view/GiftView;->bind$lambda$14(Lkotlin/jvm/functions/Function1;Lcom/discord/chat/bridge/gift/GiftEmbed;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;Lcom/discord/chat/bridge/gift/GiftEmbed;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/discord/chat/presentation/message/view/GiftView;->bind$lambda$17$lambda$16(Lkotlin/jvm/functions/Function1;Lcom/discord/chat/bridge/gift/GiftEmbed;Landroid/view/View;)V

    return-void
.end method

.method private final didResolve(J)Z
    .locals 4

    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/GiftView;->lastState:Lcom/discord/chat/presentation/message/view/GiftView$Companion$State;

    instance-of v1, v0, Lcom/discord/chat/presentation/message/view/GiftView$Companion$State$Resolving;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/discord/chat/presentation/message/view/GiftView$Companion$State$Resolving;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/discord/chat/presentation/message/view/GiftView$Companion$State$Resolving;->getAccessoryId()J

    move-result-wide v2

    cmp-long p1, v2, p1

    if-nez p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method private final initTextStyling()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/GiftView;->binding:Lcom/discord/chat/databinding/GiftViewBinding;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/discord/chat/databinding/GiftViewBinding;->header:Landroid/widget/TextView;

    .line 4
    .line 5
    const-string v1, "initTextStyling$lambda$1"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/high16 v1, 0x41400000    # 12.0f

    .line 11
    .line 12
    invoke-static {v0, v1}, Lcom/discord/SetTextSizeSpKt;->setTextSizeSp(Landroid/widget/TextView;F)V

    .line 13
    .line 14
    .line 15
    sget-object v2, Lcom/discord/fonts/DiscordFont;->PrimaryBold:Lcom/discord/fonts/DiscordFont;

    .line 16
    .line 17
    invoke-static {v0, v2}, Lcom/discord/fonts/DiscordFontUtilsKt;->setDiscordFont(Landroid/widget/TextView;Lcom/discord/fonts/DiscordFont;)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/GiftView;->binding:Lcom/discord/chat/databinding/GiftViewBinding;

    .line 21
    .line 22
    iget-object v0, v0, Lcom/discord/chat/databinding/GiftViewBinding;->title:Landroid/widget/TextView;

    .line 23
    .line 24
    const-string v2, "initTextStyling$lambda$2"

    .line 25
    .line 26
    invoke-static {v0, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const/high16 v2, 0x41800000    # 16.0f

    .line 30
    .line 31
    invoke-static {v0, v2}, Lcom/discord/SetTextSizeSpKt;->setTextSizeSp(Landroid/widget/TextView;F)V

    .line 32
    .line 33
    .line 34
    sget-object v2, Lcom/discord/fonts/DiscordFont;->PrimarySemibold:Lcom/discord/fonts/DiscordFont;

    .line 35
    .line 36
    invoke-static {v0, v2}, Lcom/discord/fonts/DiscordFontUtilsKt;->setDiscordFont(Landroid/widget/TextView;Lcom/discord/fonts/DiscordFont;)V

    .line 37
    .line 38
    .line 39
    sget-object v3, Landroid/text/TextUtils$TruncateAt;->MARQUEE:Landroid/text/TextUtils$TruncateAt;

    .line 40
    .line 41
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 42
    .line 43
    .line 44
    const/4 v3, -0x1

    .line 45
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setMarqueeRepeatLimit(I)V

    .line 46
    .line 47
    .line 48
    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/GiftView;->binding:Lcom/discord/chat/databinding/GiftViewBinding;

    .line 49
    .line 50
    iget-object v0, v0, Lcom/discord/chat/databinding/GiftViewBinding;->subtitle:Landroid/widget/TextView;

    .line 51
    .line 52
    const-string v3, "initTextStyling$lambda$3"

    .line 53
    .line 54
    invoke-static {v0, v3}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-static {v0, v1}, Lcom/discord/SetTextSizeSpKt;->setTextSizeSp(Landroid/widget/TextView;F)V

    .line 58
    .line 59
    .line 60
    sget-object v3, Lcom/discord/fonts/DiscordFont;->PrimaryMedium:Lcom/discord/fonts/DiscordFont;

    .line 61
    .line 62
    invoke-static {v0, v3}, Lcom/discord/fonts/DiscordFontUtilsKt;->setDiscordFont(Landroid/widget/TextView;Lcom/discord/fonts/DiscordFont;)V

    .line 63
    .line 64
    .line 65
    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/GiftView;->binding:Lcom/discord/chat/databinding/GiftViewBinding;

    .line 66
    .line 67
    iget-object v0, v0, Lcom/discord/chat/databinding/GiftViewBinding;->body:Landroid/widget/TextView;

    .line 68
    .line 69
    const-string v4, "initTextStyling$lambda$4"

    .line 70
    .line 71
    invoke-static {v0, v4}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-static {v0, v1}, Lcom/discord/SetTextSizeSpKt;->setTextSizeSp(Landroid/widget/TextView;F)V

    .line 75
    .line 76
    .line 77
    invoke-static {v0, v3}, Lcom/discord/fonts/DiscordFontUtilsKt;->setDiscordFont(Landroid/widget/TextView;Lcom/discord/fonts/DiscordFont;)V

    .line 78
    .line 79
    .line 80
    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/GiftView;->binding:Lcom/discord/chat/databinding/GiftViewBinding;

    .line 81
    .line 82
    iget-object v0, v0, Lcom/discord/chat/databinding/GiftViewBinding;->acceptButton:Lcom/discord/core/DCDButton;

    .line 83
    .line 84
    const/high16 v1, 0x41600000    # 14.0f

    .line 85
    .line 86
    invoke-virtual {v0, v1}, Lcom/discord/core/DCDButton;->setTextSizeSp(F)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0, v2}, Lcom/discord/core/DCDButton;->setDiscordFont(Lcom/discord/fonts/DiscordFont;)V

    .line 90
    .line 91
    .line 92
    return-void
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
.end method


# virtual methods
.method public final bind(Lcom/discord/chat/presentation/message/messagepart/GiftMessageAccessory;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/discord/chat/presentation/message/messagepart/GiftMessageAccessory;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "accessory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onTapEmbed"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onTapAccept"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p1}, Lcom/discord/chat/presentation/message/messagepart/GiftMessageAccessory;->getGift()Lcom/discord/chat/bridge/gift/GiftEmbed;

    move-result-object v0

    invoke-interface {v0}, Lcom/discord/chat/bridge/gift/GiftEmbed;->getBackgroundColor()I

    move-result v0

    invoke-virtual {p0, v0}, Landroidx/cardview/widget/CardView;->setCardBackgroundColor(I)V

    .line 2
    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/GiftView;->binding:Lcom/discord/chat/databinding/GiftViewBinding;

    iget-object v0, v0, Lcom/discord/chat/databinding/GiftViewBinding;->content:Landroidx/constraintlayout/widget/ConstraintLayout;

    const-string v1, "binding.content"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-static {v0, v2, v3, v4, v3}, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchUtilsKt;->setOnClickListenerNested$default(Landroid/view/View;ZLandroid/view/View$OnClickListener;ILjava/lang/Object;)V

    .line 3
    invoke-virtual {p1}, Lcom/discord/chat/presentation/message/messagepart/GiftMessageAccessory;->getGift()Lcom/discord/chat/bridge/gift/GiftEmbed;

    move-result-object v0

    .line 4
    instance-of v5, v0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolving;

    if-eqz v5, :cond_2

    .line 5
    new-instance p2, Landroid/graphics/drawable/GradientDrawable;

    .line 6
    invoke-static {p0}, Lcom/discord/misc/utilities/view/ViewUtilsKt;->isLtr(Landroid/view/View;)Z

    move-result p3

    if-eqz p3, :cond_0

    sget-object p3, Landroid/graphics/drawable/GradientDrawable$Orientation;->LEFT_RIGHT:Landroid/graphics/drawable/GradientDrawable$Orientation;

    goto :goto_0

    :cond_0
    sget-object p3, Landroid/graphics/drawable/GradientDrawable$Orientation;->RIGHT_LEFT:Landroid/graphics/drawable/GradientDrawable$Orientation;

    :goto_0
    const/4 v1, 0x2

    new-array v1, v1, [I

    .line 7
    check-cast v0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolving;

    invoke-virtual {v0}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolving;->getResolvingGradientStart()I

    move-result v3

    aput v3, v1, v2

    invoke-virtual {v0}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolving;->getResolvingGradientEnd()I

    move-result v0

    aput v0, v1, v4

    .line 8
    invoke-direct {p2, p3, v1}, Landroid/graphics/drawable/GradientDrawable;-><init>(Landroid/graphics/drawable/GradientDrawable$Orientation;[I)V

    const/4 p3, 0x4

    .line 9
    invoke-static {p3}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getDpToPx(I)I

    move-result p3

    int-to-float p3, p3

    invoke-virtual {p2, p3}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 10
    iget-object p3, p0, Lcom/discord/chat/presentation/message/view/GiftView;->binding:Lcom/discord/chat/databinding/GiftViewBinding;

    iget-object p3, p3, Lcom/discord/chat/databinding/GiftViewBinding;->gradients:Landroidx/constraintlayout/widget/Group;

    invoke-virtual {p3}, Landroidx/constraintlayout/widget/b;->getReferencedIds()[I

    move-result-object p3

    const-string v0, "binding.gradients.referencedIds"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    array-length v0, p3

    move v1, v2

    :goto_1
    if-ge v1, v0, :cond_1

    aget v3, p3, v1

    .line 12
    iget-object v4, p0, Lcom/discord/chat/presentation/message/view/GiftView;->binding:Lcom/discord/chat/databinding/GiftViewBinding;

    invoke-virtual {v4}, Lcom/discord/chat/databinding/GiftViewBinding;->getRoot()Landroid/widget/FrameLayout;

    move-result-object v4

    invoke-virtual {v4, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, p2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 13
    :cond_1
    iget-object p2, p0, Lcom/discord/chat/presentation/message/view/GiftView;->binding:Lcom/discord/chat/databinding/GiftViewBinding;

    iget-object p2, p2, Lcom/discord/chat/databinding/GiftViewBinding;->gradients:Landroidx/constraintlayout/widget/Group;

    const-string p3, "bind$lambda$8"

    .line 14
    invoke-static {p2, p3}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    invoke-virtual {p2, v2}, Landroid/view/View;->setVisibility(I)V

    const/high16 p3, 0x3f000000    # 0.5f

    .line 16
    invoke-virtual {p2, p3}, Landroid/view/View;->setAlpha(F)V

    .line 17
    new-instance p2, Lcom/discord/chat/presentation/message/view/GiftView$Companion$State$Resolving;

    invoke-virtual {p1}, Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;->getItemId()Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-direct {p2, v0, v1}, Lcom/discord/chat/presentation/message/view/GiftView$Companion$State$Resolving;-><init>(J)V

    iput-object p2, p0, Lcom/discord/chat/presentation/message/view/GiftView;->lastState:Lcom/discord/chat/presentation/message/view/GiftView$Companion$State;

    goto/16 :goto_7

    .line 18
    :cond_2
    instance-of v5, v0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved;

    if-eqz v5, :cond_9

    .line 19
    invoke-virtual {p1}, Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;->getItemId()Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    invoke-direct {p0, v5, v6}, Lcom/discord/chat/presentation/message/view/GiftView;->didResolve(J)Z

    move-result v5

    .line 20
    iget-object v6, p0, Lcom/discord/chat/presentation/message/view/GiftView;->binding:Lcom/discord/chat/databinding/GiftViewBinding;

    iget-object v6, v6, Lcom/discord/chat/databinding/GiftViewBinding;->content:Landroidx/constraintlayout/widget/ConstraintLayout;

    iget-object v7, p0, Lcom/discord/chat/presentation/message/view/GiftView;->resolvedTransition:Landroid/animation/LayoutTransition;

    if-eqz v5, :cond_3

    goto :goto_2

    :cond_3
    move-object v7, v3

    :goto_2
    invoke-virtual {v6, v7}, Landroid/view/ViewGroup;->setLayoutTransition(Landroid/animation/LayoutTransition;)V

    .line 21
    iget-object v6, p0, Lcom/discord/chat/presentation/message/view/GiftView;->binding:Lcom/discord/chat/databinding/GiftViewBinding;

    iget-object v6, v6, Lcom/discord/chat/databinding/GiftViewBinding;->gradients:Landroidx/constraintlayout/widget/Group;

    const-string v7, "binding.gradients"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v7, 0x8

    .line 22
    invoke-virtual {v6, v7}, Landroid/view/View;->setVisibility(I)V

    .line 23
    iget-object v6, p0, Lcom/discord/chat/presentation/message/view/GiftView;->binding:Lcom/discord/chat/databinding/GiftViewBinding;

    iget-object v6, v6, Lcom/discord/chat/databinding/GiftViewBinding;->header:Landroid/widget/TextView;

    .line 24
    invoke-interface {v0}, Lcom/discord/chat/bridge/gift/GiftEmbed;->getHeaderText()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 25
    invoke-interface {v0}, Lcom/discord/chat/bridge/gift/GiftEmbed;->getHeaderColor()I

    move-result v8

    invoke-virtual {v6, v8}, Landroid/widget/TextView;->setTextColor(I)V

    .line 26
    iget-object v6, p0, Lcom/discord/chat/presentation/message/view/GiftView;->binding:Lcom/discord/chat/databinding/GiftViewBinding;

    iget-object v6, v6, Lcom/discord/chat/databinding/GiftViewBinding;->thumbnail:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 27
    move-object v8, v0

    check-cast v8, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved;

    invoke-interface {v8}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved;->getThumbnailUrl()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v6, v9}, Lcom/facebook/drawee/view/SimpleDraweeView;->setImageURI(Ljava/lang/String;)V

    .line 28
    invoke-virtual {v6}, Lcom/facebook/drawee/view/a;->getHierarchy()Lcom/facebook/drawee/interfaces/DraweeHierarchy;

    move-result-object v6

    check-cast v6, Lcom/facebook/drawee/generic/GenericDraweeHierarchy;

    .line 29
    invoke-interface {v0}, Lcom/discord/chat/bridge/gift/GiftEmbed;->getThumbnailCornerRadius()I

    move-result v9

    invoke-static {v9}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getDpToPx(I)I

    move-result v9

    int-to-float v9, v9

    .line 30
    invoke-static {v9}, Lcom/facebook/drawee/generic/a;->a(F)Lcom/facebook/drawee/generic/a;

    move-result-object v9

    invoke-virtual {v6, v9}, Lcom/facebook/drawee/generic/GenericDraweeHierarchy;->D(Lcom/facebook/drawee/generic/a;)V

    .line 31
    iget-object v6, p0, Lcom/discord/chat/presentation/message/view/GiftView;->binding:Lcom/discord/chat/databinding/GiftViewBinding;

    iget-object v6, v6, Lcom/discord/chat/databinding/GiftViewBinding;->title:Landroid/widget/TextView;

    .line 32
    invoke-interface {v8}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved;->getTitleText()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v6, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 33
    invoke-interface {v8}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved;->getTitleColor()I

    move-result v9

    invoke-virtual {v6, v9}, Landroid/widget/TextView;->setTextColor(I)V

    const-string v9, "bind$lambda$12"

    .line 34
    invoke-static {v6, v9}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v9

    const-string v10, "text"

    invoke-static {v9, v10}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v9}, Lpi/l;->w(Ljava/lang/CharSequence;)Z

    move-result v9

    xor-int/2addr v9, v4

    if-eqz v9, :cond_4

    move v9, v2

    goto :goto_3

    :cond_4
    move v9, v7

    .line 35
    :goto_3
    invoke-virtual {v6, v9}, Landroid/view/View;->setVisibility(I)V

    .line 36
    iget-object v6, p0, Lcom/discord/chat/presentation/message/view/GiftView;->binding:Lcom/discord/chat/databinding/GiftViewBinding;

    iget-object v6, v6, Lcom/discord/chat/databinding/GiftViewBinding;->subtitle:Landroid/widget/TextView;

    .line 37
    invoke-interface {v8}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved;->getSubtitle()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v6, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 38
    invoke-interface {v8}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved;->getSubtitleColor()I

    move-result v9

    invoke-virtual {v6, v9}, Landroid/widget/TextView;->setTextColor(I)V

    const-string v9, "bind$lambda$13"

    .line 39
    invoke-static {v6, v9}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v9

    invoke-static {v9, v10}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v9}, Lpi/l;->w(Ljava/lang/CharSequence;)Z

    move-result v9

    xor-int/2addr v9, v4

    if-eqz v9, :cond_5

    move v9, v2

    goto :goto_4

    :cond_5
    move v9, v7

    .line 40
    :goto_4
    invoke-virtual {v6, v9}, Landroid/view/View;->setVisibility(I)V

    .line 41
    instance-of v6, v8, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Invalid;

    if-eqz v6, :cond_6

    .line 42
    iget-object p2, p0, Lcom/discord/chat/presentation/message/view/GiftView;->binding:Lcom/discord/chat/databinding/GiftViewBinding;

    iget-object p2, p2, Lcom/discord/chat/databinding/GiftViewBinding;->thumbnail:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {p2}, Lcom/facebook/drawee/view/a;->getHierarchy()Lcom/facebook/drawee/interfaces/DraweeHierarchy;

    move-result-object p2

    check-cast p2, Lcom/facebook/drawee/generic/GenericDraweeHierarchy;

    new-instance p3, Landroid/graphics/drawable/ColorDrawable;

    check-cast v0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Invalid;

    invoke-virtual {v0}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Invalid;->getThumbnailBackgroundColor()I

    move-result v0

    invoke-direct {p3, v0}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {p2, p3}, Lcom/facebook/drawee/generic/GenericDraweeHierarchy;->u(Landroid/graphics/drawable/Drawable;)V

    .line 43
    iget-object p2, p0, Lcom/discord/chat/presentation/message/view/GiftView;->binding:Lcom/discord/chat/databinding/GiftViewBinding;

    iget-object p2, p2, Lcom/discord/chat/databinding/GiftViewBinding;->body:Landroid/widget/TextView;

    const-string p3, "binding.body"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    invoke-virtual {p2, v7}, Landroid/view/View;->setVisibility(I)V

    .line 45
    iget-object p2, p0, Lcom/discord/chat/presentation/message/view/GiftView;->binding:Lcom/discord/chat/databinding/GiftViewBinding;

    iget-object p2, p2, Lcom/discord/chat/databinding/GiftViewBinding;->acceptButton:Lcom/discord/core/DCDButton;

    const-string p3, "binding.acceptButton"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    invoke-virtual {p2, v7}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_6

    .line 47
    :cond_6
    instance-of v6, v8, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;

    if-eqz v6, :cond_8

    .line 48
    iget-object v6, p0, Lcom/discord/chat/presentation/message/view/GiftView;->binding:Lcom/discord/chat/databinding/GiftViewBinding;

    iget-object v6, v6, Lcom/discord/chat/databinding/GiftViewBinding;->content:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-static {v6, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/discord/chat/presentation/message/view/y;

    invoke-direct {v1, p2, v0}, Lcom/discord/chat/presentation/message/view/y;-><init>(Lkotlin/jvm/functions/Function1;Lcom/discord/chat/bridge/gift/GiftEmbed;)V

    invoke-static {v6, v2, v1, v4, v3}, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchUtilsKt;->setOnClickListenerNested$default(Landroid/view/View;ZLandroid/view/View$OnClickListener;ILjava/lang/Object;)V

    .line 49
    move-object p2, v0

    check-cast p2, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;

    invoke-direct {p0, p2, v5}, Lcom/discord/chat/presentation/message/view/GiftView;->bindSplash(Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;Z)V

    .line 50
    iget-object v1, p0, Lcom/discord/chat/presentation/message/view/GiftView;->binding:Lcom/discord/chat/databinding/GiftViewBinding;

    iget-object v1, v1, Lcom/discord/chat/databinding/GiftViewBinding;->thumbnail:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {v1}, Lcom/facebook/drawee/view/a;->getHierarchy()Lcom/facebook/drawee/interfaces/DraweeHierarchy;

    move-result-object v1

    check-cast v1, Lcom/facebook/drawee/generic/GenericDraweeHierarchy;

    invoke-virtual {v1, v3}, Lcom/facebook/drawee/generic/GenericDraweeHierarchy;->u(Landroid/graphics/drawable/Drawable;)V

    .line 51
    iget-object v1, p0, Lcom/discord/chat/presentation/message/view/GiftView;->binding:Lcom/discord/chat/databinding/GiftViewBinding;

    iget-object v1, v1, Lcom/discord/chat/databinding/GiftViewBinding;->body:Landroid/widget/TextView;

    .line 52
    invoke-virtual {p2}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->getBodyText()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 53
    invoke-virtual {p2}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->getBodyTextColor()I

    move-result v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setTextColor(I)V

    const-string v3, "bind$lambda$15"

    .line 54
    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v3

    invoke-static {v3, v10}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3}, Lpi/l;->w(Ljava/lang/CharSequence;)Z

    move-result v3

    xor-int/2addr v3, v4

    if-eqz v3, :cond_7

    goto :goto_5

    :cond_7
    move v2, v7

    .line 55
    :goto_5
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 56
    iget-object v1, p0, Lcom/discord/chat/presentation/message/view/GiftView;->binding:Lcom/discord/chat/databinding/GiftViewBinding;

    iget-object v1, v1, Lcom/discord/chat/databinding/GiftViewBinding;->acceptButton:Lcom/discord/core/DCDButton;

    .line 57
    invoke-virtual {p2}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->getAcceptLabelText()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/discord/core/DCDButton;->setText(Ljava/lang/CharSequence;)V

    .line 58
    invoke-virtual {p2}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->getAcceptLabelColor()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/discord/core/DCDButton;->setTextColor(Ljava/lang/Integer;)V

    .line 59
    invoke-virtual {p2}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->getAcceptLabelBackgroundColor()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/discord/core/DCDButton;->setBackgroundColor(I)V

    .line 60
    new-instance v2, Lcom/discord/chat/presentation/message/view/z;

    invoke-direct {v2, p3, v0}, Lcom/discord/chat/presentation/message/view/z;-><init>(Lkotlin/jvm/functions/Function1;Lcom/discord/chat/bridge/gift/GiftEmbed;)V

    invoke-virtual {v1, v2}, Lcom/discord/core/DCDButton;->setOnClickButtonListener(Landroid/view/View$OnClickListener;)V

    .line 61
    invoke-virtual {p2}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->getCanBeAccepted()Z

    move-result p2

    invoke-virtual {v1, p2}, Lcom/discord/core/DCDButton;->setEnabled(Z)V

    .line 62
    :cond_8
    :goto_6
    new-instance p2, Lcom/discord/chat/presentation/message/view/GiftView$Companion$State$Resolved;

    invoke-virtual {p1}, Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;->getItemId()Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-direct {p2, v0, v1}, Lcom/discord/chat/presentation/message/view/GiftView$Companion$State$Resolved;-><init>(J)V

    iput-object p2, p0, Lcom/discord/chat/presentation/message/view/GiftView;->lastState:Lcom/discord/chat/presentation/message/view/GiftView$Companion$State;

    :cond_9
    :goto_7
    return-void
.end method

.method public final getBinding()Lcom/discord/chat/databinding/GiftViewBinding;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/GiftView;->binding:Lcom/discord/chat/databinding/GiftViewBinding;

    return-object v0
.end method
