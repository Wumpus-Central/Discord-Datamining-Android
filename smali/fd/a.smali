.class public final Lfd/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lfd/a$a;
    }
.end annotation


# static fields
.field private static final g:[I


# instance fields
.field private final a:Lgd/b;

.field private b:Z

.field private c:I

.field private d:I

.field private e:I

.field private f:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    new-array v0, v0, [I

    .line 3
    .line 4
    fill-array-data v0, :array_0

    .line 5
    .line 6
    .line 7
    sput-object v0, Lfd/a;->g:[I

    .line 8
    .line 9
    return-void

    .line 10
    nop

    .line 11
    :array_0
    .array-data 4
        0xee0
        0x1dc
        0x83b
        0x707
    .end array-data
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
.end method

.method public constructor <init>(Lgd/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lfd/a;->a:Lgd/b;

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
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
.end method

.method private static b(Lcd/o;Lcd/o;)F
    .locals 2

    invoke-virtual {p0}, Lcd/o;->c()F

    move-result v0

    invoke-virtual {p0}, Lcd/o;->d()F

    move-result p0

    invoke-virtual {p1}, Lcd/o;->c()F

    move-result v1

    invoke-virtual {p1}, Lcd/o;->d()F

    move-result p1

    invoke-static {v0, p0, v1, p1}, Lhd/a;->a(FFFF)F

    move-result p0

    return p0
.end method

.method private static c(Lfd/a$a;Lfd/a$a;)F
    .locals 2

    invoke-virtual {p0}, Lfd/a$a;->a()I

    move-result v0

    invoke-virtual {p0}, Lfd/a$a;->b()I

    move-result p0

    invoke-virtual {p1}, Lfd/a$a;->a()I

    move-result v1

    invoke-virtual {p1}, Lfd/a$a;->b()I

    move-result p1

    invoke-static {v0, p0, v1, p1}, Lhd/a;->b(IIII)F

    move-result p0

    return p0
.end method

.method private static d([Lcd/o;II)[Lcd/o;
    .locals 10

    .line 1
    int-to-float p2, p2

    .line 2
    int-to-float p1, p1

    .line 3
    const/high16 v0, 0x40000000    # 2.0f

    .line 4
    .line 5
    mul-float/2addr p1, v0

    .line 6
    div-float/2addr p2, p1

    .line 7
    const/4 p1, 0x0

    .line 8
    aget-object v1, p0, p1

    .line 9
    .line 10
    invoke-virtual {v1}, Lcd/o;->c()F

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x2

    .line 15
    aget-object v3, p0, v2

    .line 16
    .line 17
    invoke-virtual {v3}, Lcd/o;->c()F

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    sub-float/2addr v1, v3

    .line 22
    aget-object v3, p0, p1

    .line 23
    .line 24
    invoke-virtual {v3}, Lcd/o;->d()F

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    aget-object v4, p0, v2

    .line 29
    .line 30
    invoke-virtual {v4}, Lcd/o;->d()F

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    sub-float/2addr v3, v4

    .line 35
    aget-object v4, p0, p1

    .line 36
    .line 37
    invoke-virtual {v4}, Lcd/o;->c()F

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    aget-object v5, p0, v2

    .line 42
    .line 43
    invoke-virtual {v5}, Lcd/o;->c()F

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    add-float/2addr v4, v5

    .line 48
    div-float/2addr v4, v0

    .line 49
    aget-object v5, p0, p1

    .line 50
    .line 51
    invoke-virtual {v5}, Lcd/o;->d()F

    .line 52
    .line 53
    .line 54
    move-result v5

    .line 55
    aget-object v6, p0, v2

    .line 56
    .line 57
    invoke-virtual {v6}, Lcd/o;->d()F

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    add-float/2addr v5, v6

    .line 62
    div-float/2addr v5, v0

    .line 63
    new-instance v6, Lcd/o;

    .line 64
    .line 65
    mul-float/2addr v1, p2

    .line 66
    add-float v7, v4, v1

    .line 67
    .line 68
    mul-float/2addr v3, p2

    .line 69
    add-float v8, v5, v3

    .line 70
    .line 71
    invoke-direct {v6, v7, v8}, Lcd/o;-><init>(FF)V

    .line 72
    .line 73
    .line 74
    new-instance v7, Lcd/o;

    .line 75
    .line 76
    sub-float/2addr v4, v1

    .line 77
    sub-float/2addr v5, v3

    .line 78
    invoke-direct {v7, v4, v5}, Lcd/o;-><init>(FF)V

    .line 79
    .line 80
    .line 81
    const/4 v1, 0x1

    .line 82
    aget-object v3, p0, v1

    .line 83
    .line 84
    invoke-virtual {v3}, Lcd/o;->c()F

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    const/4 v4, 0x3

    .line 89
    aget-object v5, p0, v4

    .line 90
    .line 91
    invoke-virtual {v5}, Lcd/o;->c()F

    .line 92
    .line 93
    .line 94
    move-result v5

    .line 95
    sub-float/2addr v3, v5

    .line 96
    aget-object v5, p0, v1

    .line 97
    .line 98
    invoke-virtual {v5}, Lcd/o;->d()F

    .line 99
    .line 100
    .line 101
    move-result v5

    .line 102
    aget-object v8, p0, v4

    .line 103
    .line 104
    invoke-virtual {v8}, Lcd/o;->d()F

    .line 105
    .line 106
    .line 107
    move-result v8

    .line 108
    sub-float/2addr v5, v8

    .line 109
    aget-object v8, p0, v1

    .line 110
    .line 111
    invoke-virtual {v8}, Lcd/o;->c()F

    .line 112
    .line 113
    .line 114
    move-result v8

    .line 115
    aget-object v9, p0, v4

    .line 116
    .line 117
    invoke-virtual {v9}, Lcd/o;->c()F

    .line 118
    .line 119
    .line 120
    move-result v9

    .line 121
    add-float/2addr v8, v9

    .line 122
    div-float/2addr v8, v0

    .line 123
    aget-object v9, p0, v1

    .line 124
    .line 125
    invoke-virtual {v9}, Lcd/o;->d()F

    .line 126
    .line 127
    .line 128
    move-result v9

    .line 129
    aget-object p0, p0, v4

    .line 130
    .line 131
    invoke-virtual {p0}, Lcd/o;->d()F

    .line 132
    .line 133
    .line 134
    move-result p0

    .line 135
    add-float/2addr v9, p0

    .line 136
    div-float/2addr v9, v0

    .line 137
    new-instance p0, Lcd/o;

    .line 138
    .line 139
    mul-float/2addr v3, p2

    .line 140
    add-float v0, v8, v3

    .line 141
    .line 142
    mul-float/2addr p2, v5

    .line 143
    add-float v5, v9, p2

    .line 144
    .line 145
    invoke-direct {p0, v0, v5}, Lcd/o;-><init>(FF)V

    .line 146
    .line 147
    .line 148
    new-instance v0, Lcd/o;

    .line 149
    .line 150
    sub-float/2addr v8, v3

    .line 151
    sub-float/2addr v9, p2

    .line 152
    invoke-direct {v0, v8, v9}, Lcd/o;-><init>(FF)V

    .line 153
    .line 154
    .line 155
    const/4 p2, 0x4

    .line 156
    new-array p2, p2, [Lcd/o;

    .line 157
    .line 158
    aput-object v6, p2, p1

    .line 159
    .line 160
    aput-object p0, p2, v1

    .line 161
    .line 162
    aput-object v7, p2, v2

    .line 163
    .line 164
    aput-object v0, p2, v4

    .line 165
    .line 166
    return-object p2
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
.end method

.method private e([Lcd/o;)V
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    aget-object v1, p1, v0

    .line 3
    .line 4
    invoke-direct {p0, v1}, Lfd/a;->o(Lcd/o;)Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_3

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    aget-object v2, p1, v1

    .line 12
    .line 13
    invoke-direct {p0, v2}, Lfd/a;->o(Lcd/o;)Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_3

    .line 18
    .line 19
    const/4 v2, 0x2

    .line 20
    aget-object v3, p1, v2

    .line 21
    .line 22
    invoke-direct {p0, v3}, Lfd/a;->o(Lcd/o;)Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-eqz v3, :cond_3

    .line 27
    .line 28
    const/4 v3, 0x3

    .line 29
    aget-object v4, p1, v3

    .line 30
    .line 31
    invoke-direct {p0, v4}, Lfd/a;->o(Lcd/o;)Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-eqz v4, :cond_3

    .line 36
    .line 37
    iget v4, p0, Lfd/a;->e:I

    .line 38
    .line 39
    mul-int/2addr v4, v2

    .line 40
    const/4 v5, 0x4

    .line 41
    new-array v6, v5, [I

    .line 42
    .line 43
    aget-object v7, p1, v0

    .line 44
    .line 45
    aget-object v8, p1, v1

    .line 46
    .line 47
    invoke-direct {p0, v7, v8, v4}, Lfd/a;->r(Lcd/o;Lcd/o;I)I

    .line 48
    .line 49
    .line 50
    move-result v7

    .line 51
    aput v7, v6, v0

    .line 52
    .line 53
    aget-object v7, p1, v1

    .line 54
    .line 55
    aget-object v8, p1, v2

    .line 56
    .line 57
    invoke-direct {p0, v7, v8, v4}, Lfd/a;->r(Lcd/o;Lcd/o;I)I

    .line 58
    .line 59
    .line 60
    move-result v7

    .line 61
    aput v7, v6, v1

    .line 62
    .line 63
    aget-object v7, p1, v2

    .line 64
    .line 65
    aget-object v8, p1, v3

    .line 66
    .line 67
    invoke-direct {p0, v7, v8, v4}, Lfd/a;->r(Lcd/o;Lcd/o;I)I

    .line 68
    .line 69
    .line 70
    move-result v7

    .line 71
    aput v7, v6, v2

    .line 72
    .line 73
    aget-object v2, p1, v3

    .line 74
    .line 75
    aget-object p1, p1, v0

    .line 76
    .line 77
    invoke-direct {p0, v2, p1, v4}, Lfd/a;->r(Lcd/o;Lcd/o;I)I

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    aput p1, v6, v3

    .line 82
    .line 83
    invoke-static {v6, v4}, Lfd/a;->m([II)I

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    iput p1, p0, Lfd/a;->f:I

    .line 88
    .line 89
    const-wide/16 v2, 0x0

    .line 90
    .line 91
    :goto_0
    if-ge v0, v5, :cond_1

    .line 92
    .line 93
    iget p1, p0, Lfd/a;->f:I

    .line 94
    .line 95
    add-int/2addr p1, v0

    .line 96
    rem-int/2addr p1, v5

    .line 97
    aget p1, v6, p1

    .line 98
    .line 99
    iget-boolean v4, p0, Lfd/a;->b:Z

    .line 100
    .line 101
    if-eqz v4, :cond_0

    .line 102
    .line 103
    const/4 v4, 0x7

    .line 104
    shl-long/2addr v2, v4

    .line 105
    shr-int/lit8 p1, p1, 0x1

    .line 106
    .line 107
    and-int/lit8 p1, p1, 0x7f

    .line 108
    .line 109
    int-to-long v7, p1

    .line 110
    goto :goto_1

    .line 111
    :cond_0
    const/16 v4, 0xa

    .line 112
    .line 113
    shl-long/2addr v2, v4

    .line 114
    shr-int/lit8 v4, p1, 0x2

    .line 115
    .line 116
    and-int/lit16 v4, v4, 0x3e0

    .line 117
    .line 118
    shr-int/lit8 p1, p1, 0x1

    .line 119
    .line 120
    and-int/lit8 p1, p1, 0x1f

    .line 121
    .line 122
    add-int/2addr v4, p1

    .line 123
    int-to-long v7, v4

    .line 124
    :goto_1
    add-long/2addr v2, v7

    .line 125
    add-int/lit8 v0, v0, 0x1

    .line 126
    .line 127
    goto :goto_0

    .line 128
    :cond_1
    iget-boolean p1, p0, Lfd/a;->b:Z

    .line 129
    .line 130
    invoke-static {v2, v3, p1}, Lfd/a;->h(JZ)I

    .line 131
    .line 132
    .line 133
    move-result p1

    .line 134
    iget-boolean v0, p0, Lfd/a;->b:Z

    .line 135
    .line 136
    if-eqz v0, :cond_2

    .line 137
    .line 138
    shr-int/lit8 v0, p1, 0x6

    .line 139
    .line 140
    add-int/2addr v0, v1

    .line 141
    iput v0, p0, Lfd/a;->c:I

    .line 142
    .line 143
    and-int/lit8 p1, p1, 0x3f

    .line 144
    .line 145
    add-int/2addr p1, v1

    .line 146
    iput p1, p0, Lfd/a;->d:I

    .line 147
    .line 148
    return-void

    .line 149
    :cond_2
    shr-int/lit8 v0, p1, 0xb

    .line 150
    .line 151
    add-int/2addr v0, v1

    .line 152
    iput v0, p0, Lfd/a;->c:I

    .line 153
    .line 154
    and-int/lit16 p1, p1, 0x7ff

    .line 155
    .line 156
    add-int/2addr p1, v1

    .line 157
    iput p1, p0, Lfd/a;->d:I

    .line 158
    .line 159
    return-void

    .line 160
    :cond_3
    invoke-static {}, Lcd/j;->a()Lcd/j;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    throw p1
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
.end method

.method private f(Lfd/a$a;)[Lcd/o;
    .locals 14

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lfd/a;->e:I

    .line 3
    .line 4
    move-object v1, p1

    .line 5
    move-object v2, v1

    .line 6
    move-object v3, v2

    .line 7
    move v4, v0

    .line 8
    :goto_0
    iget v5, p0, Lfd/a;->e:I

    .line 9
    .line 10
    const/16 v6, 0x9

    .line 11
    .line 12
    const/4 v7, 0x2

    .line 13
    if-ge v5, v6, :cond_1

    .line 14
    .line 15
    const/4 v5, -0x1

    .line 16
    invoke-direct {p0, p1, v4, v0, v5}, Lfd/a;->j(Lfd/a$a;ZII)Lfd/a$a;

    .line 17
    .line 18
    .line 19
    move-result-object v6

    .line 20
    invoke-direct {p0, v1, v4, v0, v0}, Lfd/a;->j(Lfd/a$a;ZII)Lfd/a$a;

    .line 21
    .line 22
    .line 23
    move-result-object v8

    .line 24
    invoke-direct {p0, v2, v4, v5, v0}, Lfd/a;->j(Lfd/a$a;ZII)Lfd/a$a;

    .line 25
    .line 26
    .line 27
    move-result-object v9

    .line 28
    invoke-direct {p0, v3, v4, v5, v5}, Lfd/a;->j(Lfd/a$a;ZII)Lfd/a$a;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    iget v10, p0, Lfd/a;->e:I

    .line 33
    .line 34
    if-le v10, v7, :cond_0

    .line 35
    .line 36
    invoke-static {v5, v6}, Lfd/a;->c(Lfd/a$a;Lfd/a$a;)F

    .line 37
    .line 38
    .line 39
    move-result v10

    .line 40
    iget v11, p0, Lfd/a;->e:I

    .line 41
    .line 42
    int-to-float v11, v11

    .line 43
    mul-float/2addr v10, v11

    .line 44
    invoke-static {v3, p1}, Lfd/a;->c(Lfd/a$a;Lfd/a$a;)F

    .line 45
    .line 46
    .line 47
    move-result v11

    .line 48
    iget v12, p0, Lfd/a;->e:I

    .line 49
    .line 50
    add-int/2addr v12, v7

    .line 51
    int-to-float v12, v12

    .line 52
    mul-float/2addr v11, v12

    .line 53
    div-float/2addr v10, v11

    .line 54
    float-to-double v10, v10

    .line 55
    const-wide/high16 v12, 0x3fe8000000000000L    # 0.75

    .line 56
    .line 57
    cmpg-double v12, v10, v12

    .line 58
    .line 59
    if-ltz v12, :cond_1

    .line 60
    .line 61
    const-wide/high16 v12, 0x3ff4000000000000L    # 1.25

    .line 62
    .line 63
    cmpl-double v10, v10, v12

    .line 64
    .line 65
    if-gtz v10, :cond_1

    .line 66
    .line 67
    invoke-direct {p0, v6, v8, v9, v5}, Lfd/a;->p(Lfd/a$a;Lfd/a$a;Lfd/a$a;Lfd/a$a;)Z

    .line 68
    .line 69
    .line 70
    move-result v10

    .line 71
    if-eqz v10, :cond_1

    .line 72
    .line 73
    :cond_0
    xor-int/lit8 v4, v4, 0x1

    .line 74
    .line 75
    iget p1, p0, Lfd/a;->e:I

    .line 76
    .line 77
    add-int/2addr p1, v0

    .line 78
    iput p1, p0, Lfd/a;->e:I

    .line 79
    .line 80
    move-object v3, v5

    .line 81
    move-object p1, v6

    .line 82
    move-object v1, v8

    .line 83
    move-object v2, v9

    .line 84
    goto :goto_0

    .line 85
    :cond_1
    iget v4, p0, Lfd/a;->e:I

    .line 86
    .line 87
    const/4 v5, 0x5

    .line 88
    if-eq v4, v5, :cond_3

    .line 89
    .line 90
    const/4 v6, 0x7

    .line 91
    if-ne v4, v6, :cond_2

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_2
    invoke-static {}, Lcd/j;->a()Lcd/j;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    throw p1

    .line 99
    :cond_3
    :goto_1
    const/4 v6, 0x0

    .line 100
    if-ne v4, v5, :cond_4

    .line 101
    .line 102
    move v4, v0

    .line 103
    goto :goto_2

    .line 104
    :cond_4
    move v4, v6

    .line 105
    :goto_2
    iput-boolean v4, p0, Lfd/a;->b:Z

    .line 106
    .line 107
    new-instance v4, Lcd/o;

    .line 108
    .line 109
    invoke-virtual {p1}, Lfd/a$a;->a()I

    .line 110
    .line 111
    .line 112
    move-result v5

    .line 113
    int-to-float v5, v5

    .line 114
    const/high16 v8, 0x3f000000    # 0.5f

    .line 115
    .line 116
    add-float/2addr v5, v8

    .line 117
    invoke-virtual {p1}, Lfd/a$a;->b()I

    .line 118
    .line 119
    .line 120
    move-result p1

    .line 121
    int-to-float p1, p1

    .line 122
    sub-float/2addr p1, v8

    .line 123
    invoke-direct {v4, v5, p1}, Lcd/o;-><init>(FF)V

    .line 124
    .line 125
    .line 126
    new-instance p1, Lcd/o;

    .line 127
    .line 128
    invoke-virtual {v1}, Lfd/a$a;->a()I

    .line 129
    .line 130
    .line 131
    move-result v5

    .line 132
    int-to-float v5, v5

    .line 133
    add-float/2addr v5, v8

    .line 134
    invoke-virtual {v1}, Lfd/a$a;->b()I

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    int-to-float v1, v1

    .line 139
    add-float/2addr v1, v8

    .line 140
    invoke-direct {p1, v5, v1}, Lcd/o;-><init>(FF)V

    .line 141
    .line 142
    .line 143
    new-instance v1, Lcd/o;

    .line 144
    .line 145
    invoke-virtual {v2}, Lfd/a$a;->a()I

    .line 146
    .line 147
    .line 148
    move-result v5

    .line 149
    int-to-float v5, v5

    .line 150
    sub-float/2addr v5, v8

    .line 151
    invoke-virtual {v2}, Lfd/a$a;->b()I

    .line 152
    .line 153
    .line 154
    move-result v2

    .line 155
    int-to-float v2, v2

    .line 156
    add-float/2addr v2, v8

    .line 157
    invoke-direct {v1, v5, v2}, Lcd/o;-><init>(FF)V

    .line 158
    .line 159
    .line 160
    new-instance v2, Lcd/o;

    .line 161
    .line 162
    invoke-virtual {v3}, Lfd/a$a;->a()I

    .line 163
    .line 164
    .line 165
    move-result v5

    .line 166
    int-to-float v5, v5

    .line 167
    sub-float/2addr v5, v8

    .line 168
    invoke-virtual {v3}, Lfd/a$a;->b()I

    .line 169
    .line 170
    .line 171
    move-result v3

    .line 172
    int-to-float v3, v3

    .line 173
    sub-float/2addr v3, v8

    .line 174
    invoke-direct {v2, v5, v3}, Lcd/o;-><init>(FF)V

    .line 175
    .line 176
    .line 177
    const/4 v3, 0x4

    .line 178
    new-array v3, v3, [Lcd/o;

    .line 179
    .line 180
    aput-object v4, v3, v6

    .line 181
    .line 182
    aput-object p1, v3, v0

    .line 183
    .line 184
    aput-object v1, v3, v7

    .line 185
    .line 186
    const/4 p1, 0x3

    .line 187
    aput-object v2, v3, p1

    .line 188
    .line 189
    iget v0, p0, Lfd/a;->e:I

    .line 190
    .line 191
    mul-int/lit8 v1, v0, 0x2

    .line 192
    .line 193
    sub-int/2addr v1, p1

    .line 194
    mul-int/2addr v0, v7

    .line 195
    invoke-static {v3, v1, v0}, Lfd/a;->d([Lcd/o;II)[Lcd/o;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    return-object p1
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
.end method

.method private g(Lfd/a$a;Lfd/a$a;)I
    .locals 11

    .line 1
    invoke-static {p1, p2}, Lfd/a;->c(Lfd/a$a;Lfd/a$a;)F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p2}, Lfd/a$a;->a()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {p1}, Lfd/a$a;->a()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    sub-int/2addr v1, v2

    .line 14
    int-to-float v1, v1

    .line 15
    div-float/2addr v1, v0

    .line 16
    invoke-virtual {p2}, Lfd/a$a;->b()I

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    invoke-virtual {p1}, Lfd/a$a;->b()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    sub-int/2addr p2, v2

    .line 25
    int-to-float p2, p2

    .line 26
    div-float/2addr p2, v0

    .line 27
    invoke-virtual {p1}, Lfd/a$a;->a()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    int-to-float v2, v2

    .line 32
    invoke-virtual {p1}, Lfd/a$a;->b()I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    int-to-float v3, v3

    .line 37
    iget-object v4, p0, Lfd/a;->a:Lgd/b;

    .line 38
    .line 39
    invoke-virtual {p1}, Lfd/a$a;->a()I

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    invoke-virtual {p1}, Lfd/a$a;->b()I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    invoke-virtual {v4, v5, p1}, Lgd/b;->e(II)Z

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    float-to-double v4, v0

    .line 52
    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    .line 53
    .line 54
    .line 55
    move-result-wide v4

    .line 56
    double-to-int v4, v4

    .line 57
    const/4 v5, 0x0

    .line 58
    move v6, v5

    .line 59
    move v7, v6

    .line 60
    :goto_0
    if-ge v6, v4, :cond_1

    .line 61
    .line 62
    add-float/2addr v2, v1

    .line 63
    add-float/2addr v3, p2

    .line 64
    iget-object v8, p0, Lfd/a;->a:Lgd/b;

    .line 65
    .line 66
    invoke-static {v2}, Lhd/a;->c(F)I

    .line 67
    .line 68
    .line 69
    move-result v9

    .line 70
    invoke-static {v3}, Lhd/a;->c(F)I

    .line 71
    .line 72
    .line 73
    move-result v10

    .line 74
    invoke-virtual {v8, v9, v10}, Lgd/b;->e(II)Z

    .line 75
    .line 76
    .line 77
    move-result v8

    .line 78
    if-eq v8, p1, :cond_0

    .line 79
    .line 80
    add-int/lit8 v7, v7, 0x1

    .line 81
    .line 82
    :cond_0
    add-int/lit8 v6, v6, 0x1

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_1
    int-to-float p2, v7

    .line 86
    div-float/2addr p2, v0

    .line 87
    const v0, 0x3dcccccd    # 0.1f

    .line 88
    .line 89
    .line 90
    cmpl-float v1, p2, v0

    .line 91
    .line 92
    if-lez v1, :cond_2

    .line 93
    .line 94
    const v1, 0x3f666666    # 0.9f

    .line 95
    .line 96
    .line 97
    cmpg-float v1, p2, v1

    .line 98
    .line 99
    if-gez v1, :cond_2

    .line 100
    .line 101
    return v5

    .line 102
    :cond_2
    cmpg-float p2, p2, v0

    .line 103
    .line 104
    const/4 v0, 0x1

    .line 105
    if-gtz p2, :cond_3

    .line 106
    .line 107
    move v5, v0

    .line 108
    :cond_3
    if-ne v5, p1, :cond_4

    .line 109
    .line 110
    return v0

    .line 111
    :cond_4
    const/4 p1, -0x1

    .line 112
    return p1
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
.end method

.method private static h(JZ)I
    .locals 5

    .line 1
    const/4 v0, 0x4

    .line 2
    if-eqz p2, :cond_0

    .line 3
    .line 4
    const/4 p2, 0x7

    .line 5
    const/4 v1, 0x2

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/16 p2, 0xa

    .line 8
    .line 9
    move v1, v0

    .line 10
    :goto_0
    sub-int v2, p2, v1

    .line 11
    .line 12
    new-array v3, p2, [I

    .line 13
    .line 14
    add-int/lit8 p2, p2, -0x1

    .line 15
    .line 16
    :goto_1
    if-ltz p2, :cond_1

    .line 17
    .line 18
    long-to-int v4, p0

    .line 19
    and-int/lit8 v4, v4, 0xf

    .line 20
    .line 21
    aput v4, v3, p2

    .line 22
    .line 23
    shr-long/2addr p0, v0

    .line 24
    add-int/lit8 p2, p2, -0x1

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_1
    :try_start_0
    new-instance p0, Lid/c;

    .line 28
    .line 29
    sget-object p1, Lid/a;->k:Lid/a;

    .line 30
    .line 31
    invoke-direct {p0, p1}, Lid/c;-><init>(Lid/a;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v3, v2}, Lid/c;->a([II)V
    :try_end_0
    .catch Lid/d; {:try_start_0 .. :try_end_0} :catch_0

    .line 35
    .line 36
    .line 37
    const/4 p0, 0x0

    .line 38
    move p1, p0

    .line 39
    :goto_2
    if-ge p0, v1, :cond_2

    .line 40
    .line 41
    shl-int/lit8 p1, p1, 0x4

    .line 42
    .line 43
    aget p2, v3, p0

    .line 44
    .line 45
    add-int/2addr p1, p2

    .line 46
    add-int/lit8 p0, p0, 0x1

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_2
    return p1

    .line 50
    :catch_0
    invoke-static {}, Lcd/j;->a()Lcd/j;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    throw p0
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
.end method

.method private i()I
    .locals 3

    .line 1
    iget-boolean v0, p0, Lfd/a;->b:Z

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget v0, p0, Lfd/a;->c:I

    .line 7
    .line 8
    mul-int/2addr v0, v1

    .line 9
    add-int/lit8 v0, v0, 0xb

    .line 10
    .line 11
    return v0

    .line 12
    :cond_0
    iget v0, p0, Lfd/a;->c:I

    .line 13
    .line 14
    if-gt v0, v1, :cond_1

    .line 15
    .line 16
    mul-int/2addr v0, v1

    .line 17
    add-int/lit8 v0, v0, 0xf

    .line 18
    .line 19
    return v0

    .line 20
    :cond_1
    mul-int/lit8 v2, v0, 0x4

    .line 21
    .line 22
    sub-int/2addr v0, v1

    .line 23
    div-int/lit8 v0, v0, 0x8

    .line 24
    .line 25
    add-int/lit8 v0, v0, 0x1

    .line 26
    .line 27
    mul-int/lit8 v0, v0, 0x2

    .line 28
    .line 29
    add-int/2addr v2, v0

    .line 30
    add-int/lit8 v2, v2, 0xf

    .line 31
    .line 32
    return v2
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
.end method

.method private j(Lfd/a$a;ZII)Lfd/a$a;
    .locals 2

    .line 1
    invoke-virtual {p1}, Lfd/a$a;->a()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/2addr v0, p3

    .line 6
    invoke-virtual {p1}, Lfd/a$a;->b()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    :goto_0
    add-int/2addr p1, p4

    .line 11
    invoke-direct {p0, v0, p1}, Lfd/a;->n(II)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    iget-object v1, p0, Lfd/a;->a:Lgd/b;

    .line 18
    .line 19
    invoke-virtual {v1, v0, p1}, Lgd/b;->e(II)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-ne v1, p2, :cond_0

    .line 24
    .line 25
    add-int/2addr v0, p3

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    sub-int/2addr v0, p3

    .line 28
    sub-int/2addr p1, p4

    .line 29
    :goto_1
    invoke-direct {p0, v0, p1}, Lfd/a;->n(II)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    iget-object v1, p0, Lfd/a;->a:Lgd/b;

    .line 36
    .line 37
    invoke-virtual {v1, v0, p1}, Lgd/b;->e(II)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-ne v1, p2, :cond_1

    .line 42
    .line 43
    add-int/2addr v0, p3

    .line 44
    goto :goto_1

    .line 45
    :cond_1
    sub-int/2addr v0, p3

    .line 46
    :goto_2
    invoke-direct {p0, v0, p1}, Lfd/a;->n(II)Z

    .line 47
    .line 48
    .line 49
    move-result p3

    .line 50
    if-eqz p3, :cond_2

    .line 51
    .line 52
    iget-object p3, p0, Lfd/a;->a:Lgd/b;

    .line 53
    .line 54
    invoke-virtual {p3, v0, p1}, Lgd/b;->e(II)Z

    .line 55
    .line 56
    .line 57
    move-result p3

    .line 58
    if-ne p3, p2, :cond_2

    .line 59
    .line 60
    add-int/2addr p1, p4

    .line 61
    goto :goto_2

    .line 62
    :cond_2
    sub-int/2addr p1, p4

    .line 63
    new-instance p2, Lfd/a$a;

    .line 64
    .line 65
    invoke-direct {p2, v0, p1}, Lfd/a$a;-><init>(II)V

    .line 66
    .line 67
    .line 68
    return-object p2
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
.end method

.method private k()Lfd/a$a;
    .locals 12

    .line 1
    const/4 v0, 0x3

    .line 2
    const/4 v1, 0x2

    .line 3
    const/4 v2, -0x1

    .line 4
    const/4 v3, 0x1

    .line 5
    const/4 v4, 0x0

    .line 6
    :try_start_0
    new-instance v5, Lhd/b;

    .line 7
    .line 8
    iget-object v6, p0, Lfd/a;->a:Lgd/b;

    .line 9
    .line 10
    invoke-direct {v5, v6}, Lhd/b;-><init>(Lgd/b;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v5}, Lhd/b;->c()[Lcd/o;

    .line 14
    .line 15
    .line 16
    move-result-object v5

    .line 17
    aget-object v6, v5, v4

    .line 18
    .line 19
    aget-object v7, v5, v3

    .line 20
    .line 21
    aget-object v8, v5, v1

    .line 22
    .line 23
    aget-object v5, v5, v0
    :try_end_0
    .catch Lcd/j; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :catch_0
    iget-object v5, p0, Lfd/a;->a:Lgd/b;

    .line 27
    .line 28
    invoke-virtual {v5}, Lgd/b;->n()I

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    div-int/2addr v5, v1

    .line 33
    iget-object v6, p0, Lfd/a;->a:Lgd/b;

    .line 34
    .line 35
    invoke-virtual {v6}, Lgd/b;->j()I

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    div-int/2addr v6, v1

    .line 40
    new-instance v7, Lfd/a$a;

    .line 41
    .line 42
    add-int/lit8 v8, v5, 0x7

    .line 43
    .line 44
    add-int/lit8 v9, v6, -0x7

    .line 45
    .line 46
    invoke-direct {v7, v8, v9}, Lfd/a$a;-><init>(II)V

    .line 47
    .line 48
    .line 49
    invoke-direct {p0, v7, v4, v3, v2}, Lfd/a;->j(Lfd/a$a;ZII)Lfd/a$a;

    .line 50
    .line 51
    .line 52
    move-result-object v7

    .line 53
    invoke-virtual {v7}, Lfd/a$a;->c()Lcd/o;

    .line 54
    .line 55
    .line 56
    move-result-object v7

    .line 57
    new-instance v10, Lfd/a$a;

    .line 58
    .line 59
    add-int/lit8 v6, v6, 0x7

    .line 60
    .line 61
    invoke-direct {v10, v8, v6}, Lfd/a$a;-><init>(II)V

    .line 62
    .line 63
    .line 64
    invoke-direct {p0, v10, v4, v3, v3}, Lfd/a;->j(Lfd/a$a;ZII)Lfd/a$a;

    .line 65
    .line 66
    .line 67
    move-result-object v8

    .line 68
    invoke-virtual {v8}, Lfd/a$a;->c()Lcd/o;

    .line 69
    .line 70
    .line 71
    move-result-object v8

    .line 72
    new-instance v10, Lfd/a$a;

    .line 73
    .line 74
    add-int/lit8 v5, v5, -0x7

    .line 75
    .line 76
    invoke-direct {v10, v5, v6}, Lfd/a$a;-><init>(II)V

    .line 77
    .line 78
    .line 79
    invoke-direct {p0, v10, v4, v2, v3}, Lfd/a;->j(Lfd/a$a;ZII)Lfd/a$a;

    .line 80
    .line 81
    .line 82
    move-result-object v6

    .line 83
    invoke-virtual {v6}, Lfd/a$a;->c()Lcd/o;

    .line 84
    .line 85
    .line 86
    move-result-object v6

    .line 87
    new-instance v10, Lfd/a$a;

    .line 88
    .line 89
    invoke-direct {v10, v5, v9}, Lfd/a$a;-><init>(II)V

    .line 90
    .line 91
    .line 92
    invoke-direct {p0, v10, v4, v2, v2}, Lfd/a;->j(Lfd/a$a;ZII)Lfd/a$a;

    .line 93
    .line 94
    .line 95
    move-result-object v5

    .line 96
    invoke-virtual {v5}, Lfd/a$a;->c()Lcd/o;

    .line 97
    .line 98
    .line 99
    move-result-object v5

    .line 100
    move-object v11, v8

    .line 101
    move-object v8, v6

    .line 102
    move-object v6, v7

    .line 103
    move-object v7, v11

    .line 104
    :goto_0
    invoke-virtual {v6}, Lcd/o;->c()F

    .line 105
    .line 106
    .line 107
    move-result v9

    .line 108
    invoke-virtual {v5}, Lcd/o;->c()F

    .line 109
    .line 110
    .line 111
    move-result v10

    .line 112
    add-float/2addr v9, v10

    .line 113
    invoke-virtual {v7}, Lcd/o;->c()F

    .line 114
    .line 115
    .line 116
    move-result v10

    .line 117
    add-float/2addr v9, v10

    .line 118
    invoke-virtual {v8}, Lcd/o;->c()F

    .line 119
    .line 120
    .line 121
    move-result v10

    .line 122
    add-float/2addr v9, v10

    .line 123
    const/high16 v10, 0x40800000    # 4.0f

    .line 124
    .line 125
    div-float/2addr v9, v10

    .line 126
    invoke-static {v9}, Lhd/a;->c(F)I

    .line 127
    .line 128
    .line 129
    move-result v9

    .line 130
    invoke-virtual {v6}, Lcd/o;->d()F

    .line 131
    .line 132
    .line 133
    move-result v6

    .line 134
    invoke-virtual {v5}, Lcd/o;->d()F

    .line 135
    .line 136
    .line 137
    move-result v5

    .line 138
    add-float/2addr v6, v5

    .line 139
    invoke-virtual {v7}, Lcd/o;->d()F

    .line 140
    .line 141
    .line 142
    move-result v5

    .line 143
    add-float/2addr v6, v5

    .line 144
    invoke-virtual {v8}, Lcd/o;->d()F

    .line 145
    .line 146
    .line 147
    move-result v5

    .line 148
    add-float/2addr v6, v5

    .line 149
    div-float/2addr v6, v10

    .line 150
    invoke-static {v6}, Lhd/a;->c(F)I

    .line 151
    .line 152
    .line 153
    move-result v5

    .line 154
    :try_start_1
    new-instance v6, Lhd/b;

    .line 155
    .line 156
    iget-object v7, p0, Lfd/a;->a:Lgd/b;

    .line 157
    .line 158
    const/16 v8, 0xf

    .line 159
    .line 160
    invoke-direct {v6, v7, v8, v9, v5}, Lhd/b;-><init>(Lgd/b;III)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v6}, Lhd/b;->c()[Lcd/o;

    .line 164
    .line 165
    .line 166
    move-result-object v6

    .line 167
    aget-object v7, v6, v4

    .line 168
    .line 169
    aget-object v8, v6, v3

    .line 170
    .line 171
    aget-object v1, v6, v1

    .line 172
    .line 173
    aget-object v0, v6, v0
    :try_end_1
    .catch Lcd/j; {:try_start_1 .. :try_end_1} :catch_1

    .line 174
    .line 175
    goto :goto_1

    .line 176
    :catch_1
    new-instance v0, Lfd/a$a;

    .line 177
    .line 178
    add-int/lit8 v1, v9, 0x7

    .line 179
    .line 180
    add-int/lit8 v6, v5, -0x7

    .line 181
    .line 182
    invoke-direct {v0, v1, v6}, Lfd/a$a;-><init>(II)V

    .line 183
    .line 184
    .line 185
    invoke-direct {p0, v0, v4, v3, v2}, Lfd/a;->j(Lfd/a$a;ZII)Lfd/a$a;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    invoke-virtual {v0}, Lfd/a$a;->c()Lcd/o;

    .line 190
    .line 191
    .line 192
    move-result-object v7

    .line 193
    new-instance v0, Lfd/a$a;

    .line 194
    .line 195
    add-int/lit8 v5, v5, 0x7

    .line 196
    .line 197
    invoke-direct {v0, v1, v5}, Lfd/a$a;-><init>(II)V

    .line 198
    .line 199
    .line 200
    invoke-direct {p0, v0, v4, v3, v3}, Lfd/a;->j(Lfd/a$a;ZII)Lfd/a$a;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    invoke-virtual {v0}, Lfd/a$a;->c()Lcd/o;

    .line 205
    .line 206
    .line 207
    move-result-object v8

    .line 208
    new-instance v0, Lfd/a$a;

    .line 209
    .line 210
    add-int/lit8 v9, v9, -0x7

    .line 211
    .line 212
    invoke-direct {v0, v9, v5}, Lfd/a$a;-><init>(II)V

    .line 213
    .line 214
    .line 215
    invoke-direct {p0, v0, v4, v2, v3}, Lfd/a;->j(Lfd/a$a;ZII)Lfd/a$a;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    invoke-virtual {v0}, Lfd/a$a;->c()Lcd/o;

    .line 220
    .line 221
    .line 222
    move-result-object v1

    .line 223
    new-instance v0, Lfd/a$a;

    .line 224
    .line 225
    invoke-direct {v0, v9, v6}, Lfd/a$a;-><init>(II)V

    .line 226
    .line 227
    .line 228
    invoke-direct {p0, v0, v4, v2, v2}, Lfd/a;->j(Lfd/a$a;ZII)Lfd/a$a;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    invoke-virtual {v0}, Lfd/a$a;->c()Lcd/o;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    :goto_1
    invoke-virtual {v7}, Lcd/o;->c()F

    .line 237
    .line 238
    .line 239
    move-result v2

    .line 240
    invoke-virtual {v0}, Lcd/o;->c()F

    .line 241
    .line 242
    .line 243
    move-result v3

    .line 244
    add-float/2addr v2, v3

    .line 245
    invoke-virtual {v8}, Lcd/o;->c()F

    .line 246
    .line 247
    .line 248
    move-result v3

    .line 249
    add-float/2addr v2, v3

    .line 250
    invoke-virtual {v1}, Lcd/o;->c()F

    .line 251
    .line 252
    .line 253
    move-result v3

    .line 254
    add-float/2addr v2, v3

    .line 255
    div-float/2addr v2, v10

    .line 256
    invoke-static {v2}, Lhd/a;->c(F)I

    .line 257
    .line 258
    .line 259
    move-result v2

    .line 260
    invoke-virtual {v7}, Lcd/o;->d()F

    .line 261
    .line 262
    .line 263
    move-result v3

    .line 264
    invoke-virtual {v0}, Lcd/o;->d()F

    .line 265
    .line 266
    .line 267
    move-result v0

    .line 268
    add-float/2addr v3, v0

    .line 269
    invoke-virtual {v8}, Lcd/o;->d()F

    .line 270
    .line 271
    .line 272
    move-result v0

    .line 273
    add-float/2addr v3, v0

    .line 274
    invoke-virtual {v1}, Lcd/o;->d()F

    .line 275
    .line 276
    .line 277
    move-result v0

    .line 278
    add-float/2addr v3, v0

    .line 279
    div-float/2addr v3, v10

    .line 280
    invoke-static {v3}, Lhd/a;->c(F)I

    .line 281
    .line 282
    .line 283
    move-result v0

    .line 284
    new-instance v1, Lfd/a$a;

    .line 285
    .line 286
    invoke-direct {v1, v2, v0}, Lfd/a$a;-><init>(II)V

    .line 287
    .line 288
    .line 289
    return-object v1
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
.end method

.method private l([Lcd/o;)[Lcd/o;
    .locals 2

    iget v0, p0, Lfd/a;->e:I

    mul-int/lit8 v0, v0, 0x2

    invoke-direct {p0}, Lfd/a;->i()I

    move-result v1

    invoke-static {p1, v0, v1}, Lfd/a;->d([Lcd/o;II)[Lcd/o;

    move-result-object p1

    return-object p1
.end method

.method private static m([II)I
    .locals 6

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, 0x0

    .line 3
    move v2, v1

    .line 4
    move v3, v2

    .line 5
    :goto_0
    const/4 v4, 0x2

    .line 6
    if-ge v2, v0, :cond_0

    .line 7
    .line 8
    aget v5, p0, v2

    .line 9
    .line 10
    add-int/lit8 v4, p1, -0x2

    .line 11
    .line 12
    shr-int v4, v5, v4

    .line 13
    .line 14
    shl-int/lit8 v4, v4, 0x1

    .line 15
    .line 16
    and-int/lit8 v5, v5, 0x1

    .line 17
    .line 18
    add-int/2addr v4, v5

    .line 19
    shl-int/lit8 v3, v3, 0x3

    .line 20
    .line 21
    add-int/2addr v3, v4

    .line 22
    add-int/lit8 v2, v2, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    and-int/lit8 p0, v3, 0x1

    .line 26
    .line 27
    shl-int/lit8 p0, p0, 0xb

    .line 28
    .line 29
    shr-int/lit8 p1, v3, 0x1

    .line 30
    .line 31
    add-int/2addr p0, p1

    .line 32
    :goto_1
    const/4 p1, 0x4

    .line 33
    if-ge v1, p1, :cond_2

    .line 34
    .line 35
    sget-object p1, Lfd/a;->g:[I

    .line 36
    .line 37
    aget p1, p1, v1

    .line 38
    .line 39
    xor-int/2addr p1, p0

    .line 40
    invoke-static {p1}, Ljava/lang/Integer;->bitCount(I)I

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-gt p1, v4, :cond_1

    .line 45
    .line 46
    return v1

    .line 47
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_2
    invoke-static {}, Lcd/j;->a()Lcd/j;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    throw p0
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
.end method

.method private n(II)Z
    .locals 1

    if-ltz p1, :cond_0

    iget-object v0, p0, Lfd/a;->a:Lgd/b;

    invoke-virtual {v0}, Lgd/b;->n()I

    move-result v0

    if-ge p1, v0, :cond_0

    if-lez p2, :cond_0

    iget-object p1, p0, Lfd/a;->a:Lgd/b;

    invoke-virtual {p1}, Lgd/b;->j()I

    move-result p1

    if-ge p2, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private o(Lcd/o;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcd/o;->c()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Lhd/a;->c(F)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-virtual {p1}, Lcd/o;->d()F

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-static {p1}, Lhd/a;->c(F)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    invoke-direct {p0, v0, p1}, Lfd/a;->n(II)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method private p(Lfd/a$a;Lfd/a$a;Lfd/a$a;Lfd/a$a;)Z
    .locals 2

    .line 1
    new-instance v0, Lfd/a$a;

    .line 2
    .line 3
    invoke-virtual {p1}, Lfd/a$a;->a()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    add-int/lit8 v1, v1, -0x3

    .line 8
    .line 9
    invoke-virtual {p1}, Lfd/a$a;->b()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    add-int/lit8 p1, p1, 0x3

    .line 14
    .line 15
    invoke-direct {v0, v1, p1}, Lfd/a$a;-><init>(II)V

    .line 16
    .line 17
    .line 18
    new-instance p1, Lfd/a$a;

    .line 19
    .line 20
    invoke-virtual {p2}, Lfd/a$a;->a()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    add-int/lit8 v1, v1, -0x3

    .line 25
    .line 26
    invoke-virtual {p2}, Lfd/a$a;->b()I

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    add-int/lit8 p2, p2, -0x3

    .line 31
    .line 32
    invoke-direct {p1, v1, p2}, Lfd/a$a;-><init>(II)V

    .line 33
    .line 34
    .line 35
    new-instance p2, Lfd/a$a;

    .line 36
    .line 37
    invoke-virtual {p3}, Lfd/a$a;->a()I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    add-int/lit8 v1, v1, 0x3

    .line 42
    .line 43
    invoke-virtual {p3}, Lfd/a$a;->b()I

    .line 44
    .line 45
    .line 46
    move-result p3

    .line 47
    add-int/lit8 p3, p3, -0x3

    .line 48
    .line 49
    invoke-direct {p2, v1, p3}, Lfd/a$a;-><init>(II)V

    .line 50
    .line 51
    .line 52
    new-instance p3, Lfd/a$a;

    .line 53
    .line 54
    invoke-virtual {p4}, Lfd/a$a;->a()I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    add-int/lit8 v1, v1, 0x3

    .line 59
    .line 60
    invoke-virtual {p4}, Lfd/a$a;->b()I

    .line 61
    .line 62
    .line 63
    move-result p4

    .line 64
    add-int/lit8 p4, p4, 0x3

    .line 65
    .line 66
    invoke-direct {p3, v1, p4}, Lfd/a$a;-><init>(II)V

    .line 67
    .line 68
    .line 69
    invoke-direct {p0, p3, v0}, Lfd/a;->g(Lfd/a$a;Lfd/a$a;)I

    .line 70
    .line 71
    .line 72
    move-result p4

    .line 73
    const/4 v1, 0x0

    .line 74
    if-nez p4, :cond_0

    .line 75
    .line 76
    return v1

    .line 77
    :cond_0
    invoke-direct {p0, v0, p1}, Lfd/a;->g(Lfd/a$a;Lfd/a$a;)I

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-eq v0, p4, :cond_1

    .line 82
    .line 83
    return v1

    .line 84
    :cond_1
    invoke-direct {p0, p1, p2}, Lfd/a;->g(Lfd/a$a;Lfd/a$a;)I

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    if-eq p1, p4, :cond_2

    .line 89
    .line 90
    return v1

    .line 91
    :cond_2
    invoke-direct {p0, p2, p3}, Lfd/a;->g(Lfd/a$a;Lfd/a$a;)I

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    if-ne p1, p4, :cond_3

    .line 96
    .line 97
    const/4 p1, 0x1

    .line 98
    return p1

    .line 99
    :cond_3
    return v1
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
.end method

.method private q(Lgd/b;Lcd/o;Lcd/o;Lcd/o;Lcd/o;)Lgd/b;
    .locals 20

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    invoke-static {}, Lgd/i;->b()Lgd/i;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-direct/range {p0 .. p0}, Lfd/a;->i()I

    .line 8
    .line 9
    .line 10
    move-result v4

    .line 11
    move v3, v4

    .line 12
    move v2, v4

    .line 13
    int-to-float v4, v4

    .line 14
    const/high16 v5, 0x40000000    # 2.0f

    .line 15
    .line 16
    div-float v6, v4, v5

    .line 17
    .line 18
    move-object/from16 v15, p0

    .line 19
    .line 20
    iget v8, v15, Lfd/a;->e:I

    .line 21
    .line 22
    int-to-float v4, v8

    .line 23
    sub-float v5, v6, v4

    .line 24
    .line 25
    move v7, v5

    .line 26
    move v4, v5

    .line 27
    move v10, v5

    .line 28
    int-to-float v8, v8

    .line 29
    add-float/2addr v6, v8

    .line 30
    move v8, v6

    .line 31
    move v9, v6

    .line 32
    move v11, v6

    .line 33
    invoke-virtual/range {p2 .. p2}, Lcd/o;->c()F

    .line 34
    .line 35
    .line 36
    move-result v12

    .line 37
    invoke-virtual/range {p2 .. p2}, Lcd/o;->d()F

    .line 38
    .line 39
    .line 40
    move-result v13

    .line 41
    invoke-virtual/range {p3 .. p3}, Lcd/o;->c()F

    .line 42
    .line 43
    .line 44
    move-result v14

    .line 45
    invoke-virtual/range {p3 .. p3}, Lcd/o;->d()F

    .line 46
    .line 47
    .line 48
    move-result v16

    .line 49
    move/from16 v15, v16

    .line 50
    .line 51
    invoke-virtual/range {p4 .. p4}, Lcd/o;->c()F

    .line 52
    .line 53
    .line 54
    move-result v16

    .line 55
    invoke-virtual/range {p4 .. p4}, Lcd/o;->d()F

    .line 56
    .line 57
    .line 58
    move-result v17

    .line 59
    invoke-virtual/range {p5 .. p5}, Lcd/o;->c()F

    .line 60
    .line 61
    .line 62
    move-result v18

    .line 63
    invoke-virtual/range {p5 .. p5}, Lcd/o;->d()F

    .line 64
    .line 65
    .line 66
    move-result v19

    .line 67
    invoke-virtual/range {v0 .. v19}, Lgd/i;->c(Lgd/b;IIFFFFFFFFFFFFFFFF)Lgd/b;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    return-object v0
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
.end method

.method private r(Lcd/o;Lcd/o;I)I
    .locals 7

    .line 1
    invoke-static {p1, p2}, Lfd/a;->b(Lcd/o;Lcd/o;)F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-float v1, p3

    .line 6
    div-float v1, v0, v1

    .line 7
    .line 8
    invoke-virtual {p1}, Lcd/o;->c()F

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    invoke-virtual {p1}, Lcd/o;->d()F

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    invoke-virtual {p2}, Lcd/o;->c()F

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    invoke-virtual {p1}, Lcd/o;->c()F

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    sub-float/2addr v4, v5

    .line 25
    mul-float/2addr v4, v1

    .line 26
    div-float/2addr v4, v0

    .line 27
    invoke-virtual {p2}, Lcd/o;->d()F

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    invoke-virtual {p1}, Lcd/o;->d()F

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    sub-float/2addr p2, p1

    .line 36
    mul-float/2addr v1, p2

    .line 37
    div-float/2addr v1, v0

    .line 38
    const/4 p1, 0x0

    .line 39
    move p2, p1

    .line 40
    :goto_0
    if-ge p1, p3, :cond_1

    .line 41
    .line 42
    iget-object v0, p0, Lfd/a;->a:Lgd/b;

    .line 43
    .line 44
    int-to-float v5, p1

    .line 45
    mul-float v6, v5, v4

    .line 46
    .line 47
    add-float/2addr v6, v2

    .line 48
    invoke-static {v6}, Lhd/a;->c(F)I

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    mul-float/2addr v5, v1

    .line 53
    add-float/2addr v5, v3

    .line 54
    invoke-static {v5}, Lhd/a;->c(F)I

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    invoke-virtual {v0, v6, v5}, Lgd/b;->e(II)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_0

    .line 63
    .line 64
    sub-int v0, p3, p1

    .line 65
    .line 66
    const/4 v5, 0x1

    .line 67
    sub-int/2addr v0, v5

    .line 68
    shl-int v0, v5, v0

    .line 69
    .line 70
    or-int/2addr p2, v0

    .line 71
    :cond_0
    add-int/lit8 p1, p1, 0x1

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_1
    return p2
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
.end method


# virtual methods
.method public a(Z)Ldd/a;
    .locals 13

    .line 1
    invoke-direct {p0}, Lfd/a;->k()Lfd/a$a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0, v0}, Lfd/a;->f(Lfd/a$a;)[Lcd/o;

    .line 6
    .line 7
    .line 8
    move-result-object v6

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    aget-object v1, v6, v0

    .line 13
    .line 14
    const/4 v2, 0x2

    .line 15
    aget-object v3, v6, v2

    .line 16
    .line 17
    aput-object v3, v6, v0

    .line 18
    .line 19
    aput-object v1, v6, v2

    .line 20
    .line 21
    :cond_0
    invoke-direct {p0, v6}, Lfd/a;->e([Lcd/o;)V

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Lfd/a;->a:Lgd/b;

    .line 25
    .line 26
    iget v0, p0, Lfd/a;->f:I

    .line 27
    .line 28
    rem-int/lit8 v2, v0, 0x4

    .line 29
    .line 30
    aget-object v2, v6, v2

    .line 31
    .line 32
    add-int/lit8 v3, v0, 0x1

    .line 33
    .line 34
    rem-int/lit8 v3, v3, 0x4

    .line 35
    .line 36
    aget-object v3, v6, v3

    .line 37
    .line 38
    add-int/lit8 v4, v0, 0x2

    .line 39
    .line 40
    rem-int/lit8 v4, v4, 0x4

    .line 41
    .line 42
    aget-object v4, v6, v4

    .line 43
    .line 44
    add-int/lit8 v0, v0, 0x3

    .line 45
    .line 46
    rem-int/lit8 v0, v0, 0x4

    .line 47
    .line 48
    aget-object v5, v6, v0

    .line 49
    .line 50
    move-object v0, p0

    .line 51
    invoke-direct/range {v0 .. v5}, Lfd/a;->q(Lgd/b;Lcd/o;Lcd/o;Lcd/o;Lcd/o;)Lgd/b;

    .line 52
    .line 53
    .line 54
    move-result-object v8

    .line 55
    invoke-direct {p0, v6}, Lfd/a;->l([Lcd/o;)[Lcd/o;

    .line 56
    .line 57
    .line 58
    move-result-object v9

    .line 59
    new-instance v0, Ldd/a;

    .line 60
    .line 61
    iget-boolean v10, p0, Lfd/a;->b:Z

    .line 62
    .line 63
    iget v11, p0, Lfd/a;->d:I

    .line 64
    .line 65
    iget v12, p0, Lfd/a;->c:I

    .line 66
    .line 67
    move-object v7, v0

    .line 68
    invoke-direct/range {v7 .. v12}, Ldd/a;-><init>(Lgd/b;[Lcd/o;ZII)V

    .line 69
    .line 70
    .line 71
    return-object v0
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
.end method
