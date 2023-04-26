.class public final enum Lcom/discord/media/utils/VideoCompressionQuality;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/media/utils/VideoCompressionQuality$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/discord/media/utils/VideoCompressionQuality;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0010\u0008\u0086\u0001\u0018\u0000 \u00142\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0014B\u001f\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/discord/media/utils/VideoCompressionQuality;",
        "",
        "value",
        "",
        "targetResolution",
        "",
        "targetBitrate",
        "(Ljava/lang/String;ILjava/lang/String;II)V",
        "getTargetBitrate",
        "()I",
        "getTargetResolution",
        "getValue",
        "()Ljava/lang/String;",
        "Original",
        "VeryHigh",
        "High",
        "Medium",
        "Low",
        "VeryLow",
        "None",
        "Companion",
        "media_release"
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
.field private static final synthetic $VALUES:[Lcom/discord/media/utils/VideoCompressionQuality;

.field public static final Companion:Lcom/discord/media/utils/VideoCompressionQuality$Companion;

.field public static final enum High:Lcom/discord/media/utils/VideoCompressionQuality;

.field public static final enum Low:Lcom/discord/media/utils/VideoCompressionQuality;

.field public static final enum Medium:Lcom/discord/media/utils/VideoCompressionQuality;

.field public static final enum None:Lcom/discord/media/utils/VideoCompressionQuality;

.field public static final enum Original:Lcom/discord/media/utils/VideoCompressionQuality;

.field public static final enum VeryHigh:Lcom/discord/media/utils/VideoCompressionQuality;

.field public static final enum VeryLow:Lcom/discord/media/utils/VideoCompressionQuality;


# instance fields
.field private final targetBitrate:I

.field private final targetResolution:I

.field private final value:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/discord/media/utils/VideoCompressionQuality;
    .locals 3

    const/4 v0, 0x7

    new-array v0, v0, [Lcom/discord/media/utils/VideoCompressionQuality;

    const/4 v1, 0x0

    sget-object v2, Lcom/discord/media/utils/VideoCompressionQuality;->Original:Lcom/discord/media/utils/VideoCompressionQuality;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/discord/media/utils/VideoCompressionQuality;->VeryHigh:Lcom/discord/media/utils/VideoCompressionQuality;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lcom/discord/media/utils/VideoCompressionQuality;->High:Lcom/discord/media/utils/VideoCompressionQuality;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lcom/discord/media/utils/VideoCompressionQuality;->Medium:Lcom/discord/media/utils/VideoCompressionQuality;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lcom/discord/media/utils/VideoCompressionQuality;->Low:Lcom/discord/media/utils/VideoCompressionQuality;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lcom/discord/media/utils/VideoCompressionQuality;->VeryLow:Lcom/discord/media/utils/VideoCompressionQuality;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lcom/discord/media/utils/VideoCompressionQuality;->None:Lcom/discord/media/utils/VideoCompressionQuality;

    aput-object v2, v0, v1

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 13

    .line 1
    new-instance v6, Lcom/discord/media/utils/VideoCompressionQuality;

    .line 2
    .line 3
    const-string v1, "Original"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "original"

    .line 7
    .line 8
    const v4, 0x7fffffff

    .line 9
    .line 10
    .line 11
    const v5, 0x7fffffff

    .line 12
    .line 13
    .line 14
    move-object v0, v6

    .line 15
    invoke-direct/range {v0 .. v5}, Lcom/discord/media/utils/VideoCompressionQuality;-><init>(Ljava/lang/String;ILjava/lang/String;II)V

    .line 16
    .line 17
    .line 18
    sput-object v6, Lcom/discord/media/utils/VideoCompressionQuality;->Original:Lcom/discord/media/utils/VideoCompressionQuality;

    .line 19
    .line 20
    new-instance v0, Lcom/discord/media/utils/VideoCompressionQuality;

    .line 21
    .line 22
    const-string v8, "VeryHigh"

    .line 23
    .line 24
    const/4 v9, 0x1

    .line 25
    const-string v10, "very_high"

    .line 26
    .line 27
    const/16 v11, 0x438

    .line 28
    .line 29
    const v12, 0x6acfc0

    .line 30
    .line 31
    .line 32
    move-object v7, v0

    .line 33
    invoke-direct/range {v7 .. v12}, Lcom/discord/media/utils/VideoCompressionQuality;-><init>(Ljava/lang/String;ILjava/lang/String;II)V

    .line 34
    .line 35
    .line 36
    sput-object v0, Lcom/discord/media/utils/VideoCompressionQuality;->VeryHigh:Lcom/discord/media/utils/VideoCompressionQuality;

    .line 37
    .line 38
    new-instance v0, Lcom/discord/media/utils/VideoCompressionQuality;

    .line 39
    .line 40
    const-string v2, "High"

    .line 41
    .line 42
    const/4 v3, 0x2

    .line 43
    const-string v4, "high"

    .line 44
    .line 45
    const/16 v5, 0x2d0

    .line 46
    .line 47
    const v6, 0x2625a0

    .line 48
    .line 49
    .line 50
    move-object v1, v0

    .line 51
    invoke-direct/range {v1 .. v6}, Lcom/discord/media/utils/VideoCompressionQuality;-><init>(Ljava/lang/String;ILjava/lang/String;II)V

    .line 52
    .line 53
    .line 54
    sput-object v0, Lcom/discord/media/utils/VideoCompressionQuality;->High:Lcom/discord/media/utils/VideoCompressionQuality;

    .line 55
    .line 56
    new-instance v0, Lcom/discord/media/utils/VideoCompressionQuality;

    .line 57
    .line 58
    const-string v8, "Medium"

    .line 59
    .line 60
    const/4 v9, 0x3

    .line 61
    const-string v10, "medium"

    .line 62
    .line 63
    const/16 v11, 0x1e0

    .line 64
    .line 65
    const v12, 0x1e8480

    .line 66
    .line 67
    .line 68
    move-object v7, v0

    .line 69
    invoke-direct/range {v7 .. v12}, Lcom/discord/media/utils/VideoCompressionQuality;-><init>(Ljava/lang/String;ILjava/lang/String;II)V

    .line 70
    .line 71
    .line 72
    sput-object v0, Lcom/discord/media/utils/VideoCompressionQuality;->Medium:Lcom/discord/media/utils/VideoCompressionQuality;

    .line 73
    .line 74
    new-instance v0, Lcom/discord/media/utils/VideoCompressionQuality;

    .line 75
    .line 76
    const-string v2, "Low"

    .line 77
    .line 78
    const/4 v3, 0x4

    .line 79
    const-string v4, "low"

    .line 80
    .line 81
    const/16 v5, 0x168

    .line 82
    .line 83
    const v6, 0x124f80

    .line 84
    .line 85
    .line 86
    move-object v1, v0

    .line 87
    invoke-direct/range {v1 .. v6}, Lcom/discord/media/utils/VideoCompressionQuality;-><init>(Ljava/lang/String;ILjava/lang/String;II)V

    .line 88
    .line 89
    .line 90
    sput-object v0, Lcom/discord/media/utils/VideoCompressionQuality;->Low:Lcom/discord/media/utils/VideoCompressionQuality;

    .line 91
    .line 92
    new-instance v0, Lcom/discord/media/utils/VideoCompressionQuality;

    .line 93
    .line 94
    const-string v8, "VeryLow"

    .line 95
    .line 96
    const/4 v9, 0x5

    .line 97
    const-string v10, "very_low"

    .line 98
    .line 99
    const/16 v11, 0x168

    .line 100
    .line 101
    const v12, 0xc3500

    .line 102
    .line 103
    .line 104
    move-object v7, v0

    .line 105
    invoke-direct/range {v7 .. v12}, Lcom/discord/media/utils/VideoCompressionQuality;-><init>(Ljava/lang/String;ILjava/lang/String;II)V

    .line 106
    .line 107
    .line 108
    sput-object v0, Lcom/discord/media/utils/VideoCompressionQuality;->VeryLow:Lcom/discord/media/utils/VideoCompressionQuality;

    .line 109
    .line 110
    new-instance v0, Lcom/discord/media/utils/VideoCompressionQuality;

    .line 111
    .line 112
    const-string v2, "None"

    .line 113
    .line 114
    const/4 v3, 0x6

    .line 115
    const-string v4, "none"

    .line 116
    .line 117
    const/16 v5, 0x1e0

    .line 118
    .line 119
    const v6, 0x2dc6c0

    .line 120
    .line 121
    .line 122
    move-object v1, v0

    .line 123
    invoke-direct/range {v1 .. v6}, Lcom/discord/media/utils/VideoCompressionQuality;-><init>(Ljava/lang/String;ILjava/lang/String;II)V

    .line 124
    .line 125
    .line 126
    sput-object v0, Lcom/discord/media/utils/VideoCompressionQuality;->None:Lcom/discord/media/utils/VideoCompressionQuality;

    .line 127
    .line 128
    invoke-static {}, Lcom/discord/media/utils/VideoCompressionQuality;->$values()[Lcom/discord/media/utils/VideoCompressionQuality;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    sput-object v0, Lcom/discord/media/utils/VideoCompressionQuality;->$VALUES:[Lcom/discord/media/utils/VideoCompressionQuality;

    .line 133
    .line 134
    new-instance v0, Lcom/discord/media/utils/VideoCompressionQuality$Companion;

    .line 135
    .line 136
    const/4 v1, 0x0

    .line 137
    invoke-direct {v0, v1}, Lcom/discord/media/utils/VideoCompressionQuality$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 138
    .line 139
    .line 140
    sput-object v0, Lcom/discord/media/utils/VideoCompressionQuality;->Companion:Lcom/discord/media/utils/VideoCompressionQuality$Companion;

    .line 141
    .line 142
    return-void
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
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "II)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lcom/discord/media/utils/VideoCompressionQuality;->value:Ljava/lang/String;

    .line 5
    .line 6
    iput p4, p0, Lcom/discord/media/utils/VideoCompressionQuality;->targetResolution:I

    .line 7
    .line 8
    iput p5, p0, Lcom/discord/media/utils/VideoCompressionQuality;->targetBitrate:I

    .line 9
    .line 10
    return-void
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
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/discord/media/utils/VideoCompressionQuality;
    .locals 1

    const-class v0, Lcom/discord/media/utils/VideoCompressionQuality;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/discord/media/utils/VideoCompressionQuality;

    return-object p0
.end method

.method public static values()[Lcom/discord/media/utils/VideoCompressionQuality;
    .locals 1

    sget-object v0, Lcom/discord/media/utils/VideoCompressionQuality;->$VALUES:[Lcom/discord/media/utils/VideoCompressionQuality;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/discord/media/utils/VideoCompressionQuality;

    return-object v0
.end method


# virtual methods
.method public final getTargetBitrate()I
    .locals 1

    iget v0, p0, Lcom/discord/media/utils/VideoCompressionQuality;->targetBitrate:I

    return v0
.end method

.method public final getTargetResolution()I
    .locals 1

    iget v0, p0, Lcom/discord/media/utils/VideoCompressionQuality;->targetResolution:I

    return v0
.end method

.method public final getValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/media/utils/VideoCompressionQuality;->value:Ljava/lang/String;

    return-object v0
.end method
