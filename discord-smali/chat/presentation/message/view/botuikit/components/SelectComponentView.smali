.class public final Lcom/discord/chat/presentation/message/view/botuikit/components/SelectComponentView;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "SourceFile"

# interfaces
.implements Lcom/discord/chat/presentation/message/view/botuikit/ComponentView;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/chat/presentation/message/view/botuikit/components/SelectComponentView$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/constraintlayout/widget/ConstraintLayout;",
        "Lcom/discord/chat/presentation/message/view/botuikit/ComponentView<",
        "Lcom/discord/chat/bridge/botuikit/SelectComponent;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u0000 (2\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00030\u0002:\u0001(B%\u0008\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ \u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u000e\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0019H\u0016J/\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0008\u0010\u001f\u001a\u0004\u0018\u00010\t2\u0006\u0010 \u001a\u00020!H\u0002\u00a2\u0006\u0002\u0010\"J\u001a\u0010#\u001a\u00020\u0012*\u00020$2\u000c\u0010%\u001a\u0008\u0012\u0004\u0012\u00020\'0&H\u0002R\u001b\u0010\u000b\u001a\u00020\u000c8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006)"
    }
    d2 = {
        "Lcom/discord/chat/presentation/message/view/botuikit/components/SelectComponentView;",
        "Landroidx/constraintlayout/widget/ConstraintLayout;",
        "Lcom/discord/chat/presentation/message/view/botuikit/ComponentView;",
        "Lcom/discord/chat/bridge/botuikit/SelectComponent;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "defStyleAttr",
        "",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "postProcessor",
        "Lcom/facebook/imagepipeline/request/BasePostprocessor;",
        "getPostProcessor",
        "()Lcom/facebook/imagepipeline/request/BasePostprocessor;",
        "postProcessor$delegate",
        "Lkotlin/Lazy;",
        "configure",
        "",
        "component",
        "componentProvider",
        "Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;",
        "componentActionListener",
        "Lcom/discord/chat/presentation/message/view/botuikit/ComponentActionListener;",
        "getComponentType",
        "Lkotlin/reflect/KClass;",
        "setImage",
        "view",
        "Lcom/facebook/drawee/span/SimpleDraweeSpanTextView;",
        "imageUrl",
        "",
        "color",
        "asCircle",
        "",
        "(Lcom/facebook/drawee/span/SimpleDraweeSpanTextView;Ljava/lang/String;Ljava/lang/Integer;Z)V",
        "setSelectedOptions",
        "Lcom/google/android/flexbox/FlexboxLayout;",
        "selectedItems",
        "",
        "Lcom/discord/chat/bridge/botuikit/SelectItem;",
        "Companion",
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


# static fields
.field public static final Companion:Lcom/discord/chat/presentation/message/view/botuikit/components/SelectComponentView$Companion;


# instance fields
.field private final postProcessor$delegate:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/discord/chat/presentation/message/view/botuikit/components/SelectComponentView$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/discord/chat/presentation/message/view/botuikit/components/SelectComponentView$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/discord/chat/presentation/message/view/botuikit/components/SelectComponentView;->Companion:Lcom/discord/chat/presentation/message/view/botuikit/components/SelectComponentView$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 7

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lcom/discord/chat/presentation/message/view/botuikit/components/SelectComponentView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lcom/discord/chat/presentation/message/view/botuikit/components/SelectComponentView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1, p2, p3}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 3
    sget-object p1, Lcom/discord/chat/presentation/message/view/botuikit/components/SelectComponentView$postProcessor$2;->INSTANCE:Lcom/discord/chat/presentation/message/view/botuikit/components/SelectComponentView$postProcessor$2;

    invoke-static {p1}, Lnf/m;->a(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lcom/discord/chat/presentation/message/view/botuikit/components/SelectComponentView;->postProcessor$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    .line 1
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/discord/chat/presentation/message/view/botuikit/components/SelectComponentView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static synthetic b(Lcom/discord/chat/presentation/message/view/botuikit/ComponentActionListener;Lcom/discord/chat/bridge/botuikit/SelectComponent;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/discord/chat/presentation/message/view/botuikit/components/SelectComponentView;->configure$lambda$1(Lcom/discord/chat/presentation/message/view/botuikit/ComponentActionListener;Lcom/discord/chat/bridge/botuikit/SelectComponent;Landroid/view/View;)V

    return-void
.end method

.method private static final configure$lambda$1(Lcom/discord/chat/presentation/message/view/botuikit/ComponentActionListener;Lcom/discord/chat/bridge/botuikit/SelectComponent;Landroid/view/View;)V
    .locals 0

    .line 1
    const-string p2, "$componentActionListener"

    .line 2
    .line 3
    invoke-static {p0, p2}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p2, "$component"

    .line 7
    .line 8
    invoke-static {p1, p2}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p0, p1}, Lcom/discord/chat/presentation/message/view/botuikit/ComponentActionListener;->onTapSelectActionComponent(Lcom/discord/chat/bridge/botuikit/SelectComponent;)V

    .line 12
    .line 13
    .line 14
    return-void
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

.method private final getPostProcessor()Lcom/facebook/imagepipeline/request/BasePostprocessor;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/botuikit/components/SelectComponentView;->postProcessor$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/imagepipeline/request/BasePostprocessor;

    return-object v0
.end method

.method private final setImage(Lcom/facebook/drawee/span/SimpleDraweeSpanTextView;Ljava/lang/String;Ljava/lang/Integer;Z)V
    .locals 10

    .line 1
    new-instance v9, Lcom/facebook/drawee/span/DraweeSpanStringBuilder;

    .line 2
    .line 3
    invoke-direct {v9}, Lcom/facebook/drawee/span/DraweeSpanStringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const/16 v0, 0x14

    .line 7
    .line 8
    invoke-static {v0}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getDpToPx(I)I

    .line 9
    .line 10
    .line 11
    move-result v6

    .line 12
    const/16 v0, 0x200b

    .line 13
    .line 14
    invoke-virtual {v9, v0}, Landroid/text/SpannableStringBuilder;->append(C)Landroid/text/SpannableStringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    invoke-static {p2}, Lcom/facebook/imagepipeline/request/ImageRequestBuilder;->s(Landroid/net/Uri;)Lcom/facebook/imagepipeline/request/ImageRequestBuilder;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    new-instance v0, Lcom/facebook/imagepipeline/common/ResizeOptions;

    .line 26
    .line 27
    invoke-direct {v0, v6, v6}, Lcom/facebook/imagepipeline/common/ResizeOptions;-><init>(II)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p2, v0}, Lcom/facebook/imagepipeline/request/ImageRequestBuilder;->E(Lcom/facebook/imagepipeline/common/ResizeOptions;)Lcom/facebook/imagepipeline/request/ImageRequestBuilder;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    sget-object v0, Lcom/facebook/imagepipeline/request/ImageRequest$RequestLevel;->l:Lcom/facebook/imagepipeline/request/ImageRequest$RequestLevel;

    .line 35
    .line 36
    invoke-virtual {p2, v0}, Lcom/facebook/imagepipeline/request/ImageRequestBuilder;->z(Lcom/facebook/imagepipeline/request/ImageRequest$RequestLevel;)Lcom/facebook/imagepipeline/request/ImageRequestBuilder;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    if-eqz p4, :cond_0

    .line 41
    .line 42
    invoke-direct {p0}, Lcom/discord/chat/presentation/message/view/botuikit/components/SelectComponentView;->getPostProcessor()Lcom/facebook/imagepipeline/request/BasePostprocessor;

    .line 43
    .line 44
    .line 45
    move-result-object p4

    .line 46
    invoke-virtual {p2, p4}, Lcom/facebook/imagepipeline/request/ImageRequestBuilder;->A(Lcom/facebook/imagepipeline/request/Postprocessor;)Lcom/facebook/imagepipeline/request/ImageRequestBuilder;

    .line 47
    .line 48
    .line 49
    :cond_0
    invoke-static {}, Ll4/c;->g()Lcom/facebook/drawee/backends/pipeline/PipelineDraweeControllerBuilder;

    .line 50
    .line 51
    .line 52
    move-result-object p4

    .line 53
    invoke-virtual {p2}, Lcom/facebook/imagepipeline/request/ImageRequestBuilder;->a()Lcom/facebook/imagepipeline/request/ImageRequest;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    invoke-virtual {p4, p2}, Lcom/facebook/drawee/controller/AbstractDraweeControllerBuilder;->D(Ljava/lang/Object;)Lcom/facebook/drawee/controller/AbstractDraweeControllerBuilder;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    check-cast p2, Lcom/facebook/drawee/backends/pipeline/PipelineDraweeControllerBuilder;

    .line 62
    .line 63
    invoke-virtual {p2}, Lcom/facebook/drawee/controller/AbstractDraweeControllerBuilder;->c()Lcom/facebook/drawee/controller/a;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    const-string p2, "newDraweeControllerBuild\u2026d())\n            .build()"

    .line 68
    .line 69
    invoke-static {v3, p2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    invoke-static {p2}, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->u(Landroid/content/res/Resources;)Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    sget-object p4, Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;->e:Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;

    .line 85
    .line 86
    invoke-virtual {p2, p4}, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->w(Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;)Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;

    .line 87
    .line 88
    .line 89
    move-result-object p2

    .line 90
    const-string p4, "newInstance(context.reso\u2026ils.ScaleType.FIT_CENTER)"

    .line 91
    .line 92
    invoke-static {p2, p4}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    if-eqz p3, :cond_1

    .line 96
    .line 97
    new-instance p4, Landroid/graphics/PorterDuffColorFilter;

    .line 98
    .line 99
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 100
    .line 101
    .line 102
    move-result p3

    .line 103
    sget-object v0, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 104
    .line 105
    invoke-direct {p4, p3, v0}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p2, p4}, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->v(Landroid/graphics/ColorFilter;)Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;

    .line 109
    .line 110
    .line 111
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    invoke-virtual {p2}, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->a()Lcom/facebook/drawee/generic/GenericDraweeHierarchy;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    const/4 v4, 0x0

    .line 120
    const/4 v7, 0x0

    .line 121
    const/4 v8, 0x1

    .line 122
    move-object v0, v9

    .line 123
    move v5, v6

    .line 124
    invoke-virtual/range {v0 .. v8}, Lcom/facebook/drawee/span/DraweeSpanStringBuilder;->j(Landroid/content/Context;Lcom/facebook/drawee/interfaces/DraweeHierarchy;Lcom/facebook/drawee/interfaces/DraweeController;IIIZI)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p1, v9}, Lcom/facebook/drawee/span/SimpleDraweeSpanTextView;->setDraweeSpanStringBuilder(Lcom/facebook/drawee/span/DraweeSpanStringBuilder;)V

    .line 128
    .line 129
    .line 130
    return-void
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
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
.end method

.method private final setSelectedOptions(Lcom/google/android/flexbox/FlexboxLayout;Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/flexbox/FlexboxLayout;",
            "Ljava/util/List<",
            "+",
            "Lcom/discord/chat/bridge/botuikit/SelectItem;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    new-instance v2, Lcom/discord/chat/presentation/message/view/botuikit/components/SelectComponentView$setSelectedOptions$1;

    .line 14
    .line 15
    invoke-direct {v2, v0}, Lcom/discord/chat/presentation/message/view/botuikit/components/SelectComponentView$setSelectedOptions$1;-><init>(Landroid/view/LayoutInflater;)V

    .line 16
    .line 17
    .line 18
    invoke-static {p1, v1, v2}, Lcom/discord/misc/utilities/view/ViewGroupUtilsKt;->setUpLayoutForList(Landroid/view/ViewGroup;ILkotlin/jvm/functions/Function0;)V

    .line 19
    .line 20
    .line 21
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    const/4 v0, 0x0

    .line 26
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_3

    .line 31
    .line 32
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    add-int/lit8 v2, v0, 0x1

    .line 37
    .line 38
    if-gez v0, :cond_0

    .line 39
    .line 40
    invoke-static {}, Lkotlin/collections/h;->s()V

    .line 41
    .line 42
    .line 43
    :cond_0
    check-cast v1, Lcom/discord/chat/bridge/botuikit/SelectItem;

    .line 44
    .line 45
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    instance-of v3, v0, Landroid/widget/TextView;

    .line 50
    .line 51
    if-eqz v3, :cond_1

    .line 52
    .line 53
    check-cast v0, Landroid/widget/TextView;

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    const/4 v0, 0x0

    .line 57
    :goto_1
    if-nez v0, :cond_2

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_2
    invoke-virtual {v1}, Lcom/discord/chat/bridge/botuikit/SelectItem;->getLabel()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 65
    .line 66
    .line 67
    :goto_2
    move v0, v2

    .line 68
    goto :goto_0

    .line 69
    :cond_3
    return-void
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
.end method


# virtual methods
.method public bridge synthetic configure(Lcom/discord/chat/bridge/botuikit/Component;Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;Lcom/discord/chat/presentation/message/view/botuikit/ComponentActionListener;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/discord/chat/bridge/botuikit/SelectComponent;

    invoke-virtual {p0, p1, p2, p3}, Lcom/discord/chat/presentation/message/view/botuikit/components/SelectComponentView;->configure(Lcom/discord/chat/bridge/botuikit/SelectComponent;Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;Lcom/discord/chat/presentation/message/view/botuikit/ComponentActionListener;)V

    return-void
.end method

.method public configure(Lcom/discord/chat/bridge/botuikit/SelectComponent;Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;Lcom/discord/chat/presentation/message/view/botuikit/ComponentActionListener;)V
    .locals 11

    const-string v0, "component"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "componentProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "componentActionListener"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-static {p0}, Lcom/discord/chat/databinding/MessageComponentSelectViewBinding;->bind(Landroid/view/View;)Lcom/discord/chat/databinding/MessageComponentSelectViewBinding;

    move-result-object p2

    const-string v0, "bind(this)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-virtual {p1}, Lcom/discord/chat/bridge/botuikit/SelectComponent;->getPlaceholder()Ljava/lang/String;

    move-result-object v0

    .line 4
    invoke-virtual {p2}, Lcom/discord/chat/databinding/MessageComponentSelectViewBinding;->getRoot()Lcom/discord/chat/presentation/message/view/botuikit/components/SelectComponentView;

    move-result-object v1

    const-string v2, "binding.root"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x4

    invoke-static {v3}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getDpToPx(I)I

    move-result v4

    const/4 v5, 0x1

    invoke-static {v1, v5, v4}, Lcom/discord/ripple/RippleUtilsKt;->addRipple(Landroid/view/View;ZI)V

    .line 5
    invoke-virtual {p2}, Lcom/discord/chat/databinding/MessageComponentSelectViewBinding;->getRoot()Lcom/discord/chat/presentation/message/view/botuikit/components/SelectComponentView;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object v4

    invoke-virtual {v4}, Lcom/discord/theme/DiscordTheme;->getBackgroundSecondary()I

    move-result v4

    .line 7
    invoke-static {v3}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getDpToPx(I)I

    move-result v6

    .line 8
    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object v7

    invoke-virtual {v7}, Lcom/discord/theme/DiscordTheme;->getBackgroundTertiary()I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    .line 9
    invoke-static {v5}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getDpToPx(I)I

    move-result v8

    .line 10
    invoke-static {v1, v4, v6, v7, v8}, Lcom/discord/misc/utilities/view/ViewBackgroundUtilsKt;->setBackgroundRectangle(Landroid/view/View;IILjava/lang/Integer;I)V

    .line 11
    iget-object v1, p2, Lcom/discord/chat/databinding/MessageComponentSelectViewBinding;->selectComponentSelectionText:Lcom/google/android/material/textview/MaterialTextView;

    const-string v4, "binding.selectComponentSelectionText"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v6, Lcom/discord/fonts/DiscordFont;->PrimaryMedium:Lcom/discord/fonts/DiscordFont;

    invoke-static {v1, v6}, Lcom/discord/fonts/DiscordFontUtilsKt;->setDiscordFont(Landroid/widget/TextView;Lcom/discord/fonts/DiscordFont;)V

    .line 12
    iget-object v1, p2, Lcom/discord/chat/databinding/MessageComponentSelectViewBinding;->selectComponentChevron:Lcom/facebook/drawee/view/SimpleDraweeView;

    const-string v6, "binding.selectComponentChevron"

    invoke-static {v1, v6}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v7, Lcom/discord/react_asset_fetcher/ReactAsset;->ArrowRight:Lcom/discord/react_asset_fetcher/ReactAsset;

    invoke-static {v1, v7}, Lcom/discord/react_asset_fetcher/ReactAssetUtilsKt;->setReactAsset(Lcom/facebook/drawee/view/SimpleDraweeView;Lcom/discord/react_asset_fetcher/ReactAsset;)V

    .line 13
    invoke-virtual {p1}, Lcom/discord/chat/bridge/botuikit/SelectComponent;->getSelectedItems()Ljava/util/List;

    move-result-object v1

    .line 14
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v7

    xor-int/2addr v7, v5

    const-string v8, "binding.selectComponentSelectionsRoot"

    const/16 v9, 0x8

    const/4 v10, 0x0

    if-eqz v7, :cond_4

    .line 15
    invoke-virtual {p1}, Lcom/discord/chat/bridge/botuikit/SelectComponent;->getMaxValues()I

    move-result v0

    if-ne v0, v5, :cond_3

    .line 16
    iget-object v0, p2, Lcom/discord/chat/databinding/MessageComponentSelectViewBinding;->selectComponentSelectionText:Lcom/google/android/material/textview/MaterialTextView;

    invoke-static {v0, v4}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    invoke-virtual {v0, v10}, Landroid/view/View;->setVisibility(I)V

    .line 18
    iget-object v0, p2, Lcom/discord/chat/databinding/MessageComponentSelectViewBinding;->selectComponentSelectionsRoot:Lcom/google/android/flexbox/FlexboxLayout;

    invoke-static {v0, v8}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    invoke-virtual {v0, v9}, Landroid/view/View;->setVisibility(I)V

    .line 20
    iget-object v0, p2, Lcom/discord/chat/databinding/MessageComponentSelectViewBinding;->selectComponentSelectionText:Lcom/google/android/material/textview/MaterialTextView;

    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object v4

    invoke-virtual {v4}, Lcom/discord/theme/DiscordTheme;->getTextNormal()I

    move-result v4

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 21
    invoke-static {v1}, Lkotlin/collections/h;->W(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/discord/chat/bridge/botuikit/SelectItem;

    if-eqz v0, :cond_5

    .line 22
    iget-object v1, p2, Lcom/discord/chat/databinding/MessageComponentSelectViewBinding;->selectComponentSelectionText:Lcom/google/android/material/textview/MaterialTextView;

    invoke-virtual {v0}, Lcom/discord/chat/bridge/botuikit/SelectItem;->getLabel()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 23
    invoke-virtual {v0}, Lcom/discord/chat/bridge/botuikit/SelectItem;->getEmoji()Lcom/discord/chat/bridge/botuikit/ComponentEmoji;

    move-result-object v1

    const-string v4, "binding.selectComponentSelectionIcon"

    if-eqz v1, :cond_0

    .line 24
    iget-object v1, p2, Lcom/discord/chat/databinding/MessageComponentSelectViewBinding;->selectComponentSelectionIcon:Lcom/facebook/drawee/span/SimpleDraweeSpanTextView;

    invoke-static {v1, v4}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/discord/chat/bridge/botuikit/SelectItem;->getEmoji()Lcom/discord/chat/bridge/botuikit/ComponentEmoji;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/discord/chat/presentation/message/view/botuikit/ComponentViewKt;->setEmojiOrHide(Lcom/facebook/drawee/span/SimpleDraweeSpanTextView;Lcom/discord/chat/bridge/botuikit/ComponentEmoji;)V

    goto/16 :goto_1

    .line 25
    :cond_0
    instance-of v1, v0, Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;

    if-eqz v1, :cond_2

    check-cast v0, Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;

    invoke-virtual {v0}, Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;->getIconSrc()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 26
    iget-object v1, p2, Lcom/discord/chat/databinding/MessageComponentSelectViewBinding;->selectComponentSelectionIcon:Lcom/facebook/drawee/span/SimpleDraweeSpanTextView;

    invoke-static {v1, v4}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    invoke-virtual {v0}, Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;->getIconSrc()Ljava/lang/String;

    move-result-object v7

    .line 28
    invoke-virtual {v0}, Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;->getIconColor()Ljava/lang/Integer;

    move-result-object v8

    .line 29
    invoke-virtual {v0}, Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;->getType()I

    move-result v0

    sget-object v9, Lcom/discord/chat/bridge/botuikit/SelectOptionType;->USER:Lcom/discord/chat/bridge/botuikit/SelectOptionType;

    invoke-virtual {v9}, Lcom/discord/chat/bridge/botuikit/SelectOptionType;->getSerialNumber()I

    move-result v9

    if-ne v0, v9, :cond_1

    move v0, v5

    goto :goto_0

    :cond_1
    move v0, v10

    .line 30
    :goto_0
    invoke-direct {p0, v1, v7, v8, v0}, Lcom/discord/chat/presentation/message/view/botuikit/components/SelectComponentView;->setImage(Lcom/facebook/drawee/span/SimpleDraweeSpanTextView;Ljava/lang/String;Ljava/lang/Integer;Z)V

    .line 31
    iget-object v0, p2, Lcom/discord/chat/databinding/MessageComponentSelectViewBinding;->selectComponentSelectionIcon:Lcom/facebook/drawee/span/SimpleDraweeSpanTextView;

    invoke-static {v0, v4}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    invoke-virtual {v0, v10}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    .line 33
    :cond_2
    iget-object v0, p2, Lcom/discord/chat/databinding/MessageComponentSelectViewBinding;->selectComponentSelectionIcon:Lcom/facebook/drawee/span/SimpleDraweeSpanTextView;

    invoke-static {v0, v4}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    invoke-virtual {v0, v9}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    .line 35
    :cond_3
    iget-object v0, p2, Lcom/discord/chat/databinding/MessageComponentSelectViewBinding;->selectComponentSelectionsRoot:Lcom/google/android/flexbox/FlexboxLayout;

    invoke-static {v0, v8}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    iget-object v7, p2, Lcom/discord/chat/databinding/MessageComponentSelectViewBinding;->selectComponentSelectionText:Lcom/google/android/material/textview/MaterialTextView;

    invoke-static {v7, v4}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    invoke-virtual {v7, v9}, Landroid/view/View;->setVisibility(I)V

    .line 38
    invoke-virtual {v0, v10}, Landroid/view/View;->setVisibility(I)V

    .line 39
    invoke-direct {p0, v0, v1}, Lcom/discord/chat/presentation/message/view/botuikit/components/SelectComponentView;->setSelectedOptions(Lcom/google/android/flexbox/FlexboxLayout;Ljava/util/List;)V

    goto :goto_1

    .line 40
    :cond_4
    iget-object v1, p2, Lcom/discord/chat/databinding/MessageComponentSelectViewBinding;->selectComponentSelectionText:Lcom/google/android/material/textview/MaterialTextView;

    invoke-static {v1, v4}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    invoke-virtual {v1, v10}, Landroid/view/View;->setVisibility(I)V

    .line 42
    iget-object v1, p2, Lcom/discord/chat/databinding/MessageComponentSelectViewBinding;->selectComponentSelectionsRoot:Lcom/google/android/flexbox/FlexboxLayout;

    invoke-static {v1, v8}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    invoke-virtual {v1, v9}, Landroid/view/View;->setVisibility(I)V

    .line 44
    iget-object v1, p2, Lcom/discord/chat/databinding/MessageComponentSelectViewBinding;->selectComponentSelectionText:Lcom/google/android/material/textview/MaterialTextView;

    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object v4

    invoke-virtual {v4}, Lcom/discord/theme/DiscordTheme;->getTextNormal()I

    move-result v4

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 45
    iget-object v1, p2, Lcom/discord/chat/databinding/MessageComponentSelectViewBinding;->selectComponentSelectionText:Lcom/google/android/material/textview/MaterialTextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 46
    :cond_5
    :goto_1
    invoke-virtual {p1}, Lcom/discord/chat/bridge/botuikit/SelectComponent;->getState()Lcom/discord/chat/bridge/botuikit/ActionComponentState;

    move-result-object v0

    sget-object v1, Lcom/discord/chat/bridge/botuikit/ActionComponentState;->DISABLED:Lcom/discord/chat/bridge/botuikit/ActionComponentState;

    if-eq v0, v1, :cond_7

    invoke-virtual {p1}, Lcom/discord/chat/bridge/botuikit/SelectComponent;->getDisabled()Z

    move-result v0

    if-eqz v0, :cond_6

    goto :goto_2

    :cond_6
    move v0, v10

    goto :goto_3

    :cond_7
    :goto_2
    move v0, v5

    .line 47
    :goto_3
    invoke-virtual {p1}, Lcom/discord/chat/bridge/botuikit/SelectComponent;->getState()Lcom/discord/chat/bridge/botuikit/ActionComponentState;

    move-result-object v1

    sget-object v4, Lcom/discord/chat/bridge/botuikit/ActionComponentState;->LOADING:Lcom/discord/chat/bridge/botuikit/ActionComponentState;

    if-ne v1, v4, :cond_8

    move v1, v5

    goto :goto_4

    :cond_8
    move v1, v10

    .line 48
    :goto_4
    iget-object v4, p2, Lcom/discord/chat/databinding/MessageComponentSelectViewBinding;->selectComponentLoading:Landroid/widget/ProgressBar;

    const-string v7, "binding.selectComponentLoading"

    invoke-static {v4, v7}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    xor-int/lit8 v7, v1, 0x1

    if-eqz v7, :cond_9

    move v7, v3

    goto :goto_5

    :cond_9
    move v7, v10

    .line 49
    :goto_5
    invoke-virtual {v4, v7}, Landroid/view/View;->setVisibility(I)V

    .line 50
    iget-object v4, p2, Lcom/discord/chat/databinding/MessageComponentSelectViewBinding;->selectComponentChevron:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-static {v4, v6}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v1, :cond_a

    goto :goto_6

    :cond_a
    move v3, v10

    .line 51
    :goto_6
    invoke-virtual {v4, v3}, Landroid/view/View;->setVisibility(I)V

    .line 52
    invoke-virtual {p2}, Lcom/discord/chat/databinding/MessageComponentSelectViewBinding;->getRoot()Lcom/discord/chat/presentation/message/view/botuikit/components/SelectComponentView;

    move-result-object v3

    if-eqz v0, :cond_b

    const v4, 0x3e99999a    # 0.3f

    goto :goto_7

    :cond_b
    const/high16 v4, 0x3f800000    # 1.0f

    :goto_7
    invoke-virtual {v3, v4}, Landroid/view/View;->setAlpha(F)V

    .line 53
    invoke-virtual {p2}, Lcom/discord/chat/databinding/MessageComponentSelectViewBinding;->getRoot()Lcom/discord/chat/presentation/message/view/botuikit/components/SelectComponentView;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lcom/discord/chat/presentation/message/view/botuikit/components/c;

    invoke-direct {v2, p3, p1}, Lcom/discord/chat/presentation/message/view/botuikit/components/c;-><init>(Lcom/discord/chat/presentation/message/view/botuikit/ComponentActionListener;Lcom/discord/chat/bridge/botuikit/SelectComponent;)V

    const/4 p1, 0x0

    invoke-static {v3, v10, v2, v5, p1}, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchUtilsKt;->setOnClickListenerNested$default(Landroid/view/View;ZLandroid/view/View$OnClickListener;ILjava/lang/Object;)V

    .line 54
    invoke-virtual {p2}, Lcom/discord/chat/databinding/MessageComponentSelectViewBinding;->getRoot()Lcom/discord/chat/presentation/message/view/botuikit/components/SelectComponentView;

    move-result-object p1

    if-nez v1, :cond_c

    if-nez v0, :cond_c

    move v10, v5

    :cond_c
    invoke-virtual {p1, v10}, Landroid/view/View;->setClickable(Z)V

    .line 55
    invoke-virtual {p2}, Lcom/discord/chat/databinding/MessageComponentSelectViewBinding;->getRoot()Lcom/discord/chat/presentation/message/view/botuikit/components/SelectComponentView;

    move-result-object p1

    xor-int/lit8 p2, v0, 0x1

    invoke-virtual {p1, p2}, Landroid/view/View;->setEnabled(Z)V

    return-void
.end method

.method public getComponentType()Lkotlin/reflect/KClass;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/reflect/KClass<",
            "Lcom/discord/chat/bridge/botuikit/SelectComponent;",
            ">;"
        }
    .end annotation

    const-class v0, Lcom/discord/chat/bridge/botuikit/SelectComponent;

    invoke-static {v0}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v0

    return-object v0
.end method
