.class public Lgk/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgk/a$a;
    }
.end annotation


# static fields
.field private static final a:[[I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    new-array v0, v0, [[I

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    new-array v2, v1, [I

    .line 7
    .line 8
    const/16 v3, 0xe

    .line 9
    .line 10
    const/4 v4, 0x0

    .line 11
    aput v3, v2, v4

    .line 12
    .line 13
    aput-object v2, v0, v4

    .line 14
    .line 15
    new-array v2, v1, [I

    .line 16
    .line 17
    const/16 v3, 0xd

    .line 18
    .line 19
    aput v3, v2, v4

    .line 20
    .line 21
    aput-object v2, v0, v1

    .line 22
    .line 23
    new-array v2, v1, [I

    .line 24
    .line 25
    const/16 v3, 0xc

    .line 26
    .line 27
    aput v3, v2, v4

    .line 28
    .line 29
    const/4 v3, 0x2

    .line 30
    aput-object v2, v0, v3

    .line 31
    .line 32
    new-array v2, v3, [I

    .line 33
    .line 34
    fill-array-data v2, :array_0

    .line 35
    .line 36
    .line 37
    const/4 v5, 0x3

    .line 38
    aput-object v2, v0, v5

    .line 39
    .line 40
    new-array v2, v5, [I

    .line 41
    .line 42
    fill-array-data v2, :array_1

    .line 43
    .line 44
    .line 45
    const/4 v5, 0x4

    .line 46
    aput-object v2, v0, v5

    .line 47
    .line 48
    new-array v2, v3, [I

    .line 49
    .line 50
    fill-array-data v2, :array_2

    .line 51
    .line 52
    .line 53
    const/4 v3, 0x5

    .line 54
    aput-object v2, v0, v3

    .line 55
    .line 56
    new-array v2, v1, [I

    .line 57
    .line 58
    aput v1, v2, v4

    .line 59
    .line 60
    const/4 v3, 0x6

    .line 61
    aput-object v2, v0, v3

    .line 62
    .line 63
    new-array v1, v1, [I

    .line 64
    .line 65
    aput v4, v1, v4

    .line 66
    .line 67
    const/4 v2, 0x7

    .line 68
    aput-object v1, v0, v2

    .line 69
    .line 70
    sput-object v0, Lgk/a;->a:[[I

    .line 71
    .line 72
    return-void

    .line 73
    :array_0
    .array-data 4
        0xb
        0xa
    .end array-data

    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    :array_1
    .array-data 4
        0x5
        0x5
        0x9
    .end array-data

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
    :array_2
    .array-data 4
        0x2
        0x3e9
    .end array-data
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
.end method

.method private static a(Ljava/util/Calendar;ILgk/a$a;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    invoke-virtual {v0, v3}, Ljava/util/Calendar;->get(I)I

    .line 9
    .line 10
    .line 11
    move-result v4

    .line 12
    const v5, 0x10b07600

    .line 13
    .line 14
    .line 15
    if-gt v4, v5, :cond_1d

    .line 16
    .line 17
    const/16 v4, 0xe

    .line 18
    .line 19
    if-ne v1, v4, :cond_0

    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    invoke-virtual/range {p0 .. p0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    invoke-virtual {v5}, Ljava/util/Date;->getTime()J

    .line 27
    .line 28
    .line 29
    move-result-wide v6

    .line 30
    invoke-virtual {v0, v4}, Ljava/util/Calendar;->get(I)I

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    sget-object v8, Lgk/a$a;->k:Lgk/a$a;

    .line 35
    .line 36
    if-eq v8, v2, :cond_1

    .line 37
    .line 38
    const/16 v9, 0x1f4

    .line 39
    .line 40
    if-ge v4, v9, :cond_2

    .line 41
    .line 42
    :cond_1
    int-to-long v9, v4

    .line 43
    sub-long/2addr v6, v9

    .line 44
    :cond_2
    const/16 v4, 0xd

    .line 45
    .line 46
    if-ne v1, v4, :cond_3

    .line 47
    .line 48
    move v10, v3

    .line 49
    goto :goto_0

    .line 50
    :cond_3
    const/4 v10, 0x0

    .line 51
    :goto_0
    invoke-virtual {v0, v4}, Ljava/util/Calendar;->get(I)I

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    const/16 v11, 0x1e

    .line 56
    .line 57
    if-nez v10, :cond_5

    .line 58
    .line 59
    if-eq v8, v2, :cond_4

    .line 60
    .line 61
    if-ge v4, v11, :cond_5

    .line 62
    .line 63
    :cond_4
    int-to-long v12, v4

    .line 64
    const-wide/16 v14, 0x3e8

    .line 65
    .line 66
    mul-long/2addr v12, v14

    .line 67
    sub-long/2addr v6, v12

    .line 68
    :cond_5
    const/16 v4, 0xc

    .line 69
    .line 70
    if-ne v1, v4, :cond_6

    .line 71
    .line 72
    move v10, v3

    .line 73
    :cond_6
    invoke-virtual {v0, v4}, Ljava/util/Calendar;->get(I)I

    .line 74
    .line 75
    .line 76
    move-result v12

    .line 77
    if-nez v10, :cond_8

    .line 78
    .line 79
    if-eq v8, v2, :cond_7

    .line 80
    .line 81
    if-ge v12, v11, :cond_8

    .line 82
    .line 83
    :cond_7
    int-to-long v10, v12

    .line 84
    const-wide/32 v12, 0xea60

    .line 85
    .line 86
    .line 87
    mul-long/2addr v10, v12

    .line 88
    sub-long/2addr v6, v10

    .line 89
    :cond_8
    invoke-virtual {v5}, Ljava/util/Date;->getTime()J

    .line 90
    .line 91
    .line 92
    move-result-wide v10

    .line 93
    cmp-long v8, v10, v6

    .line 94
    .line 95
    if-eqz v8, :cond_9

    .line 96
    .line 97
    invoke-virtual {v5, v6, v7}, Ljava/util/Date;->setTime(J)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0, v5}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 101
    .line 102
    .line 103
    :cond_9
    sget-object v5, Lgk/a;->a:[[I

    .line 104
    .line 105
    array-length v6, v5

    .line 106
    const/4 v7, 0x0

    .line 107
    const/4 v8, 0x0

    .line 108
    :goto_1
    if-ge v7, v6, :cond_1c

    .line 109
    .line 110
    aget-object v10, v5, v7

    .line 111
    .line 112
    array-length v11, v10

    .line 113
    const/4 v12, 0x0

    .line 114
    :goto_2
    const/16 v13, 0xf

    .line 115
    .line 116
    const/4 v14, 0x2

    .line 117
    const/16 v15, 0x3e9

    .line 118
    .line 119
    const/4 v4, 0x5

    .line 120
    if-ge v12, v11, :cond_11

    .line 121
    .line 122
    aget v9, v10, v12

    .line 123
    .line 124
    if-ne v9, v1, :cond_10

    .line 125
    .line 126
    sget-object v5, Lgk/a$a;->m:Lgk/a$a;

    .line 127
    .line 128
    if-eq v2, v5, :cond_a

    .line 129
    .line 130
    sget-object v5, Lgk/a$a;->l:Lgk/a$a;

    .line 131
    .line 132
    if-ne v2, v5, :cond_f

    .line 133
    .line 134
    if-eqz v8, :cond_f

    .line 135
    .line 136
    :cond_a
    if-ne v1, v15, :cond_c

    .line 137
    .line 138
    invoke-virtual {v0, v4}, Ljava/util/Calendar;->get(I)I

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    if-ne v1, v3, :cond_b

    .line 143
    .line 144
    invoke-virtual {v0, v4, v13}, Ljava/util/Calendar;->add(II)V

    .line 145
    .line 146
    .line 147
    goto :goto_3

    .line 148
    :cond_b
    const/16 v1, -0xf

    .line 149
    .line 150
    invoke-virtual {v0, v4, v1}, Ljava/util/Calendar;->add(II)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v0, v14, v3}, Ljava/util/Calendar;->add(II)V

    .line 154
    .line 155
    .line 156
    goto :goto_3

    .line 157
    :cond_c
    const/16 v2, 0x9

    .line 158
    .line 159
    if-ne v1, v2, :cond_e

    .line 160
    .line 161
    const/16 v1, 0xb

    .line 162
    .line 163
    invoke-virtual {v0, v1}, Ljava/util/Calendar;->get(I)I

    .line 164
    .line 165
    .line 166
    move-result v2

    .line 167
    if-nez v2, :cond_d

    .line 168
    .line 169
    const/16 v2, 0xc

    .line 170
    .line 171
    invoke-virtual {v0, v1, v2}, Ljava/util/Calendar;->add(II)V

    .line 172
    .line 173
    .line 174
    goto :goto_3

    .line 175
    :cond_d
    const/16 v2, -0xc

    .line 176
    .line 177
    invoke-virtual {v0, v1, v2}, Ljava/util/Calendar;->add(II)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v0, v4, v3}, Ljava/util/Calendar;->add(II)V

    .line 181
    .line 182
    .line 183
    goto :goto_3

    .line 184
    :cond_e
    const/4 v9, 0x0

    .line 185
    aget v1, v10, v9

    .line 186
    .line 187
    invoke-virtual {v0, v1, v3}, Ljava/util/Calendar;->add(II)V

    .line 188
    .line 189
    .line 190
    :cond_f
    :goto_3
    return-void

    .line 191
    :cond_10
    const/4 v9, 0x0

    .line 192
    add-int/lit8 v12, v12, 0x1

    .line 193
    .line 194
    const/16 v4, 0xc

    .line 195
    .line 196
    goto :goto_2

    .line 197
    :cond_11
    const/4 v9, 0x0

    .line 198
    const/16 v11, 0x9

    .line 199
    .line 200
    if-eq v1, v11, :cond_16

    .line 201
    .line 202
    if-eq v1, v15, :cond_13

    .line 203
    .line 204
    :cond_12
    const/16 v9, 0xc

    .line 205
    .line 206
    goto :goto_7

    .line 207
    :cond_13
    aget v11, v10, v9

    .line 208
    .line 209
    if-ne v11, v4, :cond_12

    .line 210
    .line 211
    invoke-virtual {v0, v4}, Ljava/util/Calendar;->get(I)I

    .line 212
    .line 213
    .line 214
    move-result v4

    .line 215
    sub-int/2addr v4, v3

    .line 216
    if-lt v4, v13, :cond_14

    .line 217
    .line 218
    add-int/lit8 v4, v4, -0xf

    .line 219
    .line 220
    :cond_14
    const/4 v8, 0x7

    .line 221
    if-le v4, v8, :cond_15

    .line 222
    .line 223
    move v8, v3

    .line 224
    goto :goto_4

    .line 225
    :cond_15
    const/4 v8, 0x0

    .line 226
    :goto_4
    move v11, v4

    .line 227
    const/16 v9, 0xc

    .line 228
    .line 229
    goto :goto_6

    .line 230
    :cond_16
    move v4, v9

    .line 231
    aget v9, v10, v4

    .line 232
    .line 233
    const/16 v4, 0xb

    .line 234
    .line 235
    if-ne v9, v4, :cond_12

    .line 236
    .line 237
    invoke-virtual {v0, v4}, Ljava/util/Calendar;->get(I)I

    .line 238
    .line 239
    .line 240
    move-result v4

    .line 241
    const/16 v9, 0xc

    .line 242
    .line 243
    if-lt v4, v9, :cond_17

    .line 244
    .line 245
    add-int/lit8 v4, v4, -0xc

    .line 246
    .line 247
    :cond_17
    const/4 v8, 0x6

    .line 248
    if-lt v4, v8, :cond_18

    .line 249
    .line 250
    move v8, v3

    .line 251
    goto :goto_5

    .line 252
    :cond_18
    const/4 v8, 0x0

    .line 253
    :goto_5
    move v11, v4

    .line 254
    :goto_6
    move v4, v3

    .line 255
    goto :goto_8

    .line 256
    :goto_7
    const/4 v4, 0x0

    .line 257
    const/4 v11, 0x0

    .line 258
    :goto_8
    if-nez v4, :cond_1a

    .line 259
    .line 260
    const/4 v4, 0x0

    .line 261
    aget v8, v10, v4

    .line 262
    .line 263
    invoke-virtual {v0, v8}, Ljava/util/Calendar;->getActualMinimum(I)I

    .line 264
    .line 265
    .line 266
    move-result v8

    .line 267
    aget v11, v10, v4

    .line 268
    .line 269
    invoke-virtual {v0, v11}, Ljava/util/Calendar;->getActualMaximum(I)I

    .line 270
    .line 271
    .line 272
    move-result v11

    .line 273
    aget v12, v10, v4

    .line 274
    .line 275
    invoke-virtual {v0, v12}, Ljava/util/Calendar;->get(I)I

    .line 276
    .line 277
    .line 278
    move-result v12

    .line 279
    sub-int/2addr v12, v8

    .line 280
    sub-int/2addr v11, v8

    .line 281
    div-int/2addr v11, v14

    .line 282
    if-le v12, v11, :cond_19

    .line 283
    .line 284
    move v8, v3

    .line 285
    goto :goto_9

    .line 286
    :cond_19
    move v8, v4

    .line 287
    :goto_9
    move v11, v12

    .line 288
    goto :goto_a

    .line 289
    :cond_1a
    const/4 v4, 0x0

    .line 290
    :goto_a
    if-eqz v11, :cond_1b

    .line 291
    .line 292
    aget v10, v10, v4

    .line 293
    .line 294
    invoke-virtual {v0, v10}, Ljava/util/Calendar;->get(I)I

    .line 295
    .line 296
    .line 297
    move-result v12

    .line 298
    sub-int/2addr v12, v11

    .line 299
    invoke-virtual {v0, v10, v12}, Ljava/util/Calendar;->set(II)V

    .line 300
    .line 301
    .line 302
    :cond_1b
    add-int/lit8 v7, v7, 0x1

    .line 303
    .line 304
    move v4, v9

    .line 305
    goto/16 :goto_1

    .line 306
    .line 307
    :cond_1c
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 308
    .line 309
    new-instance v2, Ljava/lang/StringBuilder;

    .line 310
    .line 311
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 312
    .line 313
    .line 314
    const-string v3, "The field "

    .line 315
    .line 316
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 317
    .line 318
    .line 319
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 320
    .line 321
    .line 322
    const-string v1, " is not supported"

    .line 323
    .line 324
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 325
    .line 326
    .line 327
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 328
    .line 329
    .line 330
    move-result-object v1

    .line 331
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 332
    .line 333
    .line 334
    throw v0

    .line 335
    :cond_1d
    new-instance v0, Ljava/lang/ArithmeticException;

    .line 336
    .line 337
    const-string v1, "Calendar value too large for accurate calculations"

    .line 338
    .line 339
    invoke-direct {v0, v1}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    .line 340
    .line 341
    .line 342
    throw v0
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

.method public static b(Ljava/util/Calendar;I)Ljava/util/Calendar;
    .locals 1

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/Calendar;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/util/Calendar;

    .line 8
    .line 9
    sget-object v0, Lgk/a$a;->k:Lgk/a$a;

    .line 10
    .line 11
    invoke-static {p0, p1, v0}, Lgk/a;->a(Ljava/util/Calendar;ILgk/a$a;)V

    .line 12
    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 16
    .line 17
    const-string p1, "The date must not be null"

    .line 18
    .line 19
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw p0
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
.end method
