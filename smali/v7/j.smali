.class public final Lv7/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv7/i0$c;


# instance fields
.field private final a:I

.field private final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ld7/k;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 1
    invoke-static {}, Lbc/i0;->x()Lbc/i0;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lv7/j;-><init>(ILjava/util/List;)V

    return-void
.end method

.method public constructor <init>(ILjava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ld7/k;",
            ">;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lv7/j;->a:I

    .line 4
    iput-object p2, p0, Lv7/j;->b:Ljava/util/List;

    return-void
.end method

.method private c(Lv7/i0$b;)Lv7/d0;
    .locals 1

    new-instance v0, Lv7/d0;

    invoke-direct {p0, p1}, Lv7/j;->e(Lv7/i0$b;)Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, p1}, Lv7/d0;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method private d(Lv7/i0$b;)Lv7/k0;
    .locals 1

    new-instance v0, Lv7/k0;

    invoke-direct {p0, p1}, Lv7/j;->e(Lv7/i0$b;)Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, p1}, Lv7/k0;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method private e(Lv7/i0$b;)Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv7/i0$b;",
            ")",
            "Ljava/util/List<",
            "Ld7/k;",
            ">;"
        }
    .end annotation

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lv7/j;->f(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Lv7/j;->b:Ljava/util/List;

    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_0
    new-instance v0, Lf9/y;

    .line 13
    .line 14
    iget-object p1, p1, Lv7/i0$b;->d:[B

    .line 15
    .line 16
    invoke-direct {v0, p1}, Lf9/y;-><init>([B)V

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, Lv7/j;->b:Ljava/util/List;

    .line 20
    .line 21
    :goto_0
    invoke-virtual {v0}, Lf9/y;->a()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-lez v1, :cond_6

    .line 26
    .line 27
    invoke-virtual {v0}, Lf9/y;->D()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    invoke-virtual {v0}, Lf9/y;->D()I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    invoke-virtual {v0}, Lf9/y;->e()I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    add-int/2addr v3, v2

    .line 40
    const/16 v2, 0x86

    .line 41
    .line 42
    if-ne v1, v2, :cond_5

    .line 43
    .line 44
    new-instance p1, Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Lf9/y;->D()I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    and-int/lit8 v1, v1, 0x1f

    .line 54
    .line 55
    const/4 v2, 0x0

    .line 56
    move v4, v2

    .line 57
    :goto_1
    if-ge v4, v1, :cond_5

    .line 58
    .line 59
    const/4 v5, 0x3

    .line 60
    invoke-virtual {v0, v5}, Lf9/y;->A(I)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    invoke-virtual {v0}, Lf9/y;->D()I

    .line 65
    .line 66
    .line 67
    move-result v6

    .line 68
    and-int/lit16 v7, v6, 0x80

    .line 69
    .line 70
    const/4 v8, 0x1

    .line 71
    if-eqz v7, :cond_1

    .line 72
    .line 73
    move v7, v8

    .line 74
    goto :goto_2

    .line 75
    :cond_1
    move v7, v2

    .line 76
    :goto_2
    if-eqz v7, :cond_2

    .line 77
    .line 78
    and-int/lit8 v6, v6, 0x3f

    .line 79
    .line 80
    const-string v9, "application/cea-708"

    .line 81
    .line 82
    goto :goto_3

    .line 83
    :cond_2
    const-string v9, "application/cea-608"

    .line 84
    .line 85
    move v6, v8

    .line 86
    :goto_3
    invoke-virtual {v0}, Lf9/y;->D()I

    .line 87
    .line 88
    .line 89
    move-result v10

    .line 90
    int-to-byte v10, v10

    .line 91
    invoke-virtual {v0, v8}, Lf9/y;->Q(I)V

    .line 92
    .line 93
    .line 94
    if-eqz v7, :cond_4

    .line 95
    .line 96
    and-int/lit8 v7, v10, 0x40

    .line 97
    .line 98
    if-eqz v7, :cond_3

    .line 99
    .line 100
    goto :goto_4

    .line 101
    :cond_3
    move v8, v2

    .line 102
    :goto_4
    invoke-static {v8}, Lf9/d;->b(Z)Ljava/util/List;

    .line 103
    .line 104
    .line 105
    move-result-object v7

    .line 106
    goto :goto_5

    .line 107
    :cond_4
    const/4 v7, 0x0

    .line 108
    :goto_5
    new-instance v8, Ld7/k$b;

    .line 109
    .line 110
    invoke-direct {v8}, Ld7/k$b;-><init>()V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v8, v9}, Ld7/k$b;->e0(Ljava/lang/String;)Ld7/k$b;

    .line 114
    .line 115
    .line 116
    move-result-object v8

    .line 117
    invoke-virtual {v8, v5}, Ld7/k$b;->V(Ljava/lang/String;)Ld7/k$b;

    .line 118
    .line 119
    .line 120
    move-result-object v5

    .line 121
    invoke-virtual {v5, v6}, Ld7/k$b;->F(I)Ld7/k$b;

    .line 122
    .line 123
    .line 124
    move-result-object v5

    .line 125
    invoke-virtual {v5, v7}, Ld7/k$b;->T(Ljava/util/List;)Ld7/k$b;

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    invoke-virtual {v5}, Ld7/k$b;->E()Ld7/k;

    .line 130
    .line 131
    .line 132
    move-result-object v5

    .line 133
    invoke-interface {p1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    add-int/lit8 v4, v4, 0x1

    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_5
    invoke-virtual {v0, v3}, Lf9/y;->P(I)V

    .line 140
    .line 141
    .line 142
    goto :goto_0

    .line 143
    :cond_6
    return-object p1
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
.end method

.method private f(I)Z
    .locals 1

    iget v0, p0, Lv7/j;->a:I

    and-int/2addr p1, v0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method


# virtual methods
.method public a()Landroid/util/SparseArray;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/util/SparseArray<",
            "Lv7/i0;",
            ">;"
        }
    .end annotation

    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    return-object v0
.end method

.method public b(ILv7/i0$b;)Lv7/i0;
    .locals 4

    const/4 v0, 0x2

    if-eq p1, v0, :cond_f

    const/4 v1, 0x3

    if-eq p1, v1, :cond_e

    const/4 v1, 0x4

    if-eq p1, v1, :cond_e

    const/16 v2, 0x15

    if-eq p1, v2, :cond_d

    const/16 v2, 0x1b

    const/4 v3, 0x0

    if-eq p1, v2, :cond_b

    const/16 v1, 0x24

    if-eq p1, v1, :cond_a

    const/16 v1, 0x59

    if-eq p1, v1, :cond_9

    const/16 v1, 0x8a

    if-eq p1, v1, :cond_8

    const/16 v1, 0xac

    if-eq p1, v1, :cond_7

    const/16 v1, 0x101

    if-eq p1, v1, :cond_6

    const/16 v1, 0x81

    if-eq p1, v1, :cond_5

    const/16 v1, 0x82

    if-eq p1, v1, :cond_4

    const/16 v1, 0x86

    if-eq p1, v1, :cond_2

    const/16 v1, 0x87

    if-eq p1, v1, :cond_5

    packed-switch p1, :pswitch_data_0

    return-object v3

    .line 1
    :pswitch_0
    invoke-direct {p0, v0}, Lv7/j;->f(I)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    new-instance v3, Lv7/w;

    new-instance p1, Lv7/s;

    iget-object p2, p2, Lv7/i0$b;->b:Ljava/lang/String;

    invoke-direct {p1, p2}, Lv7/s;-><init>(Ljava/lang/String;)V

    invoke-direct {v3, p1}, Lv7/w;-><init>(Lv7/m;)V

    :goto_0
    return-object v3

    .line 3
    :pswitch_1
    new-instance p1, Lv7/w;

    new-instance v0, Lv7/o;

    invoke-direct {p0, p2}, Lv7/j;->d(Lv7/i0$b;)Lv7/k0;

    move-result-object p2

    invoke-direct {v0, p2}, Lv7/o;-><init>(Lv7/k0;)V

    invoke-direct {p1, v0}, Lv7/w;-><init>(Lv7/m;)V

    return-object p1

    .line 4
    :pswitch_2
    invoke-direct {p0, v0}, Lv7/j;->f(I)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_1

    .line 5
    :cond_1
    new-instance v3, Lv7/w;

    new-instance p1, Lv7/i;

    const/4 v0, 0x0

    iget-object p2, p2, Lv7/i0$b;->b:Ljava/lang/String;

    invoke-direct {p1, v0, p2}, Lv7/i;-><init>(ZLjava/lang/String;)V

    invoke-direct {v3, p1}, Lv7/w;-><init>(Lv7/m;)V

    :goto_1
    return-object v3

    :cond_2
    const/16 p1, 0x10

    .line 6
    invoke-direct {p0, p1}, Lv7/j;->f(I)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_2

    .line 7
    :cond_3
    new-instance v3, Lv7/c0;

    new-instance p1, Lv7/v;

    const-string p2, "application/x-scte35"

    invoke-direct {p1, p2}, Lv7/v;-><init>(Ljava/lang/String;)V

    invoke-direct {v3, p1}, Lv7/c0;-><init>(Lv7/b0;)V

    :goto_2
    return-object v3

    :cond_4
    const/16 p1, 0x40

    .line 8
    invoke-direct {p0, p1}, Lv7/j;->f(I)Z

    move-result p1

    if-nez p1, :cond_8

    return-object v3

    .line 9
    :cond_5
    new-instance p1, Lv7/w;

    new-instance v0, Lv7/c;

    iget-object p2, p2, Lv7/i0$b;->b:Ljava/lang/String;

    invoke-direct {v0, p2}, Lv7/c;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, v0}, Lv7/w;-><init>(Lv7/m;)V

    return-object p1

    .line 10
    :cond_6
    new-instance p1, Lv7/c0;

    new-instance p2, Lv7/v;

    const-string v0, "application/vnd.dvb.ait"

    invoke-direct {p2, v0}, Lv7/v;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, p2}, Lv7/c0;-><init>(Lv7/b0;)V

    return-object p1

    .line 11
    :cond_7
    new-instance p1, Lv7/w;

    new-instance v0, Lv7/f;

    iget-object p2, p2, Lv7/i0$b;->b:Ljava/lang/String;

    invoke-direct {v0, p2}, Lv7/f;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, v0}, Lv7/w;-><init>(Lv7/m;)V

    return-object p1

    .line 12
    :cond_8
    new-instance p1, Lv7/w;

    new-instance v0, Lv7/k;

    iget-object p2, p2, Lv7/i0$b;->b:Ljava/lang/String;

    invoke-direct {v0, p2}, Lv7/k;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, v0}, Lv7/w;-><init>(Lv7/m;)V

    return-object p1

    .line 13
    :cond_9
    new-instance p1, Lv7/w;

    new-instance v0, Lv7/l;

    iget-object p2, p2, Lv7/i0$b;->c:Ljava/util/List;

    invoke-direct {v0, p2}, Lv7/l;-><init>(Ljava/util/List;)V

    invoke-direct {p1, v0}, Lv7/w;-><init>(Lv7/m;)V

    return-object p1

    .line 14
    :cond_a
    new-instance p1, Lv7/w;

    new-instance v0, Lv7/q;

    invoke-direct {p0, p2}, Lv7/j;->c(Lv7/i0$b;)Lv7/d0;

    move-result-object p2

    invoke-direct {v0, p2}, Lv7/q;-><init>(Lv7/d0;)V

    invoke-direct {p1, v0}, Lv7/w;-><init>(Lv7/m;)V

    return-object p1

    .line 15
    :cond_b
    invoke-direct {p0, v1}, Lv7/j;->f(I)Z

    move-result p1

    if-eqz p1, :cond_c

    goto :goto_3

    .line 16
    :cond_c
    new-instance v3, Lv7/w;

    new-instance p1, Lv7/p;

    invoke-direct {p0, p2}, Lv7/j;->c(Lv7/i0$b;)Lv7/d0;

    move-result-object p2

    const/4 v0, 0x1

    .line 17
    invoke-direct {p0, v0}, Lv7/j;->f(I)Z

    move-result v0

    const/16 v1, 0x8

    invoke-direct {p0, v1}, Lv7/j;->f(I)Z

    move-result v1

    invoke-direct {p1, p2, v0, v1}, Lv7/p;-><init>(Lv7/d0;ZZ)V

    invoke-direct {v3, p1}, Lv7/w;-><init>(Lv7/m;)V

    :goto_3
    return-object v3

    .line 18
    :cond_d
    new-instance p1, Lv7/w;

    new-instance p2, Lv7/r;

    invoke-direct {p2}, Lv7/r;-><init>()V

    invoke-direct {p1, p2}, Lv7/w;-><init>(Lv7/m;)V

    return-object p1

    .line 19
    :cond_e
    new-instance p1, Lv7/w;

    new-instance v0, Lv7/t;

    iget-object p2, p2, Lv7/i0$b;->b:Ljava/lang/String;

    invoke-direct {v0, p2}, Lv7/t;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, v0}, Lv7/w;-><init>(Lv7/m;)V

    return-object p1

    .line 20
    :cond_f
    new-instance p1, Lv7/w;

    new-instance v0, Lv7/n;

    invoke-direct {p0, p2}, Lv7/j;->d(Lv7/i0$b;)Lv7/k0;

    move-result-object p2

    invoke-direct {v0, p2}, Lv7/n;-><init>(Lv7/k0;)V

    invoke-direct {p1, v0}, Lv7/w;-><init>(Lv7/m;)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0xf
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
