.class final Lra/g;
.super Lra/e0;
.source "SourceFile"


# static fields
.field static final q:Lra/e0;


# instance fields
.field private final transient n:Ljava/lang/Object;

.field final transient o:[Ljava/lang/Object;

.field private final transient p:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lra/g;

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-direct {v0, v3, v2, v1}, Lra/g;-><init>(Ljava/lang/Object;[Ljava/lang/Object;I)V

    sput-object v0, Lra/g;->q:Lra/e0;

    return-void
.end method

.method private constructor <init>(Ljava/lang/Object;[Ljava/lang/Object;I)V
    .locals 0

    invoke-direct {p0}, Lra/e0;-><init>()V

    iput-object p1, p0, Lra/g;->n:Ljava/lang/Object;

    iput-object p2, p0, Lra/g;->o:[Ljava/lang/Object;

    iput p3, p0, Lra/g;->p:I

    return-void
.end method

.method static g(I[Ljava/lang/Object;Lra/d0;)Lra/g;
    .locals 17

    .line 1
    move/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    sget-object v0, Lra/g;->q:Lra/e0;

    .line 8
    .line 9
    check-cast v0, Lra/g;

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x1

    .line 15
    if-ne v0, v4, :cond_1

    .line 16
    .line 17
    aget-object v0, v1, v3

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    aget-object v3, v1, v4

    .line 23
    .line 24
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-static {v0, v3}, Lra/w;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    new-instance v0, Lra/g;

    .line 31
    .line 32
    invoke-direct {v0, v2, v1, v4}, Lra/g;-><init>(Ljava/lang/Object;[Ljava/lang/Object;I)V

    .line 33
    .line 34
    .line 35
    return-object v0

    .line 36
    :cond_1
    array-length v5, v1

    .line 37
    shr-int/2addr v5, v4

    .line 38
    const-string v6, "index"

    .line 39
    .line 40
    invoke-static {v0, v5, v6}, Lra/t;->b(IILjava/lang/String;)I

    .line 41
    .line 42
    .line 43
    const/4 v5, 0x2

    .line 44
    invoke-static {v0, v5}, Ljava/lang/Math;->max(II)I

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    const v7, 0x2ccccccc

    .line 49
    .line 50
    .line 51
    if-ge v6, v7, :cond_2

    .line 52
    .line 53
    add-int/lit8 v7, v6, -0x1

    .line 54
    .line 55
    invoke-static {v7}, Ljava/lang/Integer;->highestOneBit(I)I

    .line 56
    .line 57
    .line 58
    move-result v7

    .line 59
    :goto_0
    add-int/2addr v7, v7

    .line 60
    int-to-double v8, v7

    .line 61
    const-wide v10, 0x3fe6666666666666L    # 0.7

    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    mul-double/2addr v8, v10

    .line 67
    int-to-double v10, v6

    .line 68
    cmpg-double v8, v8, v10

    .line 69
    .line 70
    if-gez v8, :cond_3

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_2
    const/high16 v7, 0x40000000    # 2.0f

    .line 74
    .line 75
    if-ge v6, v7, :cond_17

    .line 76
    .line 77
    :cond_3
    if-ne v0, v4, :cond_4

    .line 78
    .line 79
    aget-object v6, v1, v3

    .line 80
    .line 81
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    aget-object v7, v1, v4

    .line 85
    .line 86
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    invoke-static {v6, v7}, Lra/w;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    goto/16 :goto_d

    .line 93
    .line 94
    :cond_4
    add-int/lit8 v6, v7, -0x1

    .line 95
    .line 96
    const/16 v8, 0x80

    .line 97
    .line 98
    const/4 v9, 0x3

    .line 99
    const/4 v10, -0x1

    .line 100
    if-gt v7, v8, :cond_a

    .line 101
    .line 102
    new-array v7, v7, [B

    .line 103
    .line 104
    invoke-static {v7, v10}, Ljava/util/Arrays;->fill([BB)V

    .line 105
    .line 106
    .line 107
    move v8, v3

    .line 108
    move v10, v8

    .line 109
    :goto_1
    if-ge v8, v0, :cond_8

    .line 110
    .line 111
    add-int v11, v10, v10

    .line 112
    .line 113
    add-int v12, v8, v8

    .line 114
    .line 115
    aget-object v13, v1, v12

    .line 116
    .line 117
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    xor-int/2addr v12, v4

    .line 121
    aget-object v12, v1, v12

    .line 122
    .line 123
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    invoke-static {v13, v12}, Lra/w;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v13}, Ljava/lang/Object;->hashCode()I

    .line 130
    .line 131
    .line 132
    move-result v14

    .line 133
    invoke-static {v14}, Lra/x;->a(I)I

    .line 134
    .line 135
    .line 136
    move-result v14

    .line 137
    :goto_2
    and-int/2addr v14, v6

    .line 138
    aget-byte v15, v7, v14

    .line 139
    .line 140
    const/16 v5, 0xff

    .line 141
    .line 142
    and-int/2addr v15, v5

    .line 143
    if-ne v15, v5, :cond_6

    .line 144
    .line 145
    int-to-byte v5, v11

    .line 146
    aput-byte v5, v7, v14

    .line 147
    .line 148
    if-ge v10, v8, :cond_5

    .line 149
    .line 150
    aput-object v13, v1, v11

    .line 151
    .line 152
    xor-int/lit8 v5, v11, 0x1

    .line 153
    .line 154
    aput-object v12, v1, v5

    .line 155
    .line 156
    :cond_5
    add-int/lit8 v10, v10, 0x1

    .line 157
    .line 158
    goto :goto_3

    .line 159
    :cond_6
    aget-object v5, v1, v15

    .line 160
    .line 161
    invoke-virtual {v13, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result v5

    .line 165
    if-eqz v5, :cond_7

    .line 166
    .line 167
    xor-int/lit8 v2, v15, 0x1

    .line 168
    .line 169
    new-instance v5, Lra/c0;

    .line 170
    .line 171
    aget-object v11, v1, v2

    .line 172
    .line 173
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    invoke-direct {v5, v13, v12, v11}, Lra/c0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    aput-object v12, v1, v2

    .line 180
    .line 181
    move-object v2, v5

    .line 182
    :goto_3
    add-int/lit8 v8, v8, 0x1

    .line 183
    .line 184
    const/4 v5, 0x2

    .line 185
    goto :goto_1

    .line 186
    :cond_7
    add-int/lit8 v14, v14, 0x1

    .line 187
    .line 188
    const/4 v5, 0x2

    .line 189
    goto :goto_2

    .line 190
    :cond_8
    if-ne v10, v0, :cond_9

    .line 191
    .line 192
    move-object v2, v7

    .line 193
    :goto_4
    const/4 v5, 0x2

    .line 194
    goto/16 :goto_d

    .line 195
    .line 196
    :cond_9
    new-array v5, v9, [Ljava/lang/Object;

    .line 197
    .line 198
    aput-object v7, v5, v3

    .line 199
    .line 200
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 201
    .line 202
    .line 203
    move-result-object v6

    .line 204
    aput-object v6, v5, v4

    .line 205
    .line 206
    const/4 v6, 0x2

    .line 207
    aput-object v2, v5, v6

    .line 208
    .line 209
    move-object v2, v5

    .line 210
    move v5, v6

    .line 211
    goto/16 :goto_d

    .line 212
    .line 213
    :cond_a
    const v5, 0x8000

    .line 214
    .line 215
    .line 216
    if-gt v7, v5, :cond_10

    .line 217
    .line 218
    new-array v5, v7, [S

    .line 219
    .line 220
    invoke-static {v5, v10}, Ljava/util/Arrays;->fill([SS)V

    .line 221
    .line 222
    .line 223
    move v7, v3

    .line 224
    move v8, v7

    .line 225
    :goto_5
    if-ge v7, v0, :cond_e

    .line 226
    .line 227
    add-int v10, v8, v8

    .line 228
    .line 229
    add-int v11, v7, v7

    .line 230
    .line 231
    aget-object v12, v1, v11

    .line 232
    .line 233
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 234
    .line 235
    .line 236
    xor-int/2addr v11, v4

    .line 237
    aget-object v11, v1, v11

    .line 238
    .line 239
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 240
    .line 241
    .line 242
    invoke-static {v12, v11}, Lra/w;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v12}, Ljava/lang/Object;->hashCode()I

    .line 246
    .line 247
    .line 248
    move-result v13

    .line 249
    invoke-static {v13}, Lra/x;->a(I)I

    .line 250
    .line 251
    .line 252
    move-result v13

    .line 253
    :goto_6
    and-int/2addr v13, v6

    .line 254
    aget-short v14, v5, v13

    .line 255
    .line 256
    int-to-char v14, v14

    .line 257
    const v15, 0xffff

    .line 258
    .line 259
    .line 260
    if-ne v14, v15, :cond_c

    .line 261
    .line 262
    int-to-short v14, v10

    .line 263
    aput-short v14, v5, v13

    .line 264
    .line 265
    if-ge v8, v7, :cond_b

    .line 266
    .line 267
    aput-object v12, v1, v10

    .line 268
    .line 269
    xor-int/lit8 v10, v10, 0x1

    .line 270
    .line 271
    aput-object v11, v1, v10

    .line 272
    .line 273
    :cond_b
    add-int/lit8 v8, v8, 0x1

    .line 274
    .line 275
    goto :goto_7

    .line 276
    :cond_c
    aget-object v15, v1, v14

    .line 277
    .line 278
    invoke-virtual {v12, v15}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 279
    .line 280
    .line 281
    move-result v15

    .line 282
    if-eqz v15, :cond_d

    .line 283
    .line 284
    xor-int/lit8 v2, v14, 0x1

    .line 285
    .line 286
    new-instance v10, Lra/c0;

    .line 287
    .line 288
    aget-object v13, v1, v2

    .line 289
    .line 290
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 291
    .line 292
    .line 293
    invoke-direct {v10, v12, v11, v13}, Lra/c0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 294
    .line 295
    .line 296
    aput-object v11, v1, v2

    .line 297
    .line 298
    move-object v2, v10

    .line 299
    :goto_7
    add-int/lit8 v7, v7, 0x1

    .line 300
    .line 301
    goto :goto_5

    .line 302
    :cond_d
    add-int/lit8 v13, v13, 0x1

    .line 303
    .line 304
    goto :goto_6

    .line 305
    :cond_e
    if-ne v8, v0, :cond_f

    .line 306
    .line 307
    goto :goto_b

    .line 308
    :cond_f
    new-array v6, v9, [Ljava/lang/Object;

    .line 309
    .line 310
    aput-object v5, v6, v3

    .line 311
    .line 312
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 313
    .line 314
    .line 315
    move-result-object v5

    .line 316
    aput-object v5, v6, v4

    .line 317
    .line 318
    const/4 v5, 0x2

    .line 319
    aput-object v2, v6, v5

    .line 320
    .line 321
    goto :goto_c

    .line 322
    :cond_10
    new-array v5, v7, [I

    .line 323
    .line 324
    invoke-static {v5, v10}, Ljava/util/Arrays;->fill([II)V

    .line 325
    .line 326
    .line 327
    move v7, v3

    .line 328
    move v8, v7

    .line 329
    :goto_8
    if-ge v7, v0, :cond_14

    .line 330
    .line 331
    add-int v11, v8, v8

    .line 332
    .line 333
    add-int v12, v7, v7

    .line 334
    .line 335
    aget-object v13, v1, v12

    .line 336
    .line 337
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 338
    .line 339
    .line 340
    xor-int/2addr v12, v4

    .line 341
    aget-object v12, v1, v12

    .line 342
    .line 343
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 344
    .line 345
    .line 346
    invoke-static {v13, v12}, Lra/w;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 347
    .line 348
    .line 349
    invoke-virtual {v13}, Ljava/lang/Object;->hashCode()I

    .line 350
    .line 351
    .line 352
    move-result v14

    .line 353
    invoke-static {v14}, Lra/x;->a(I)I

    .line 354
    .line 355
    .line 356
    move-result v14

    .line 357
    :goto_9
    and-int/2addr v14, v6

    .line 358
    aget v15, v5, v14

    .line 359
    .line 360
    if-ne v15, v10, :cond_12

    .line 361
    .line 362
    aput v11, v5, v14

    .line 363
    .line 364
    if-ge v8, v7, :cond_11

    .line 365
    .line 366
    aput-object v13, v1, v11

    .line 367
    .line 368
    xor-int/lit8 v11, v11, 0x1

    .line 369
    .line 370
    aput-object v12, v1, v11

    .line 371
    .line 372
    :cond_11
    add-int/lit8 v8, v8, 0x1

    .line 373
    .line 374
    goto :goto_a

    .line 375
    :cond_12
    aget-object v10, v1, v15

    .line 376
    .line 377
    invoke-virtual {v13, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 378
    .line 379
    .line 380
    move-result v10

    .line 381
    if-eqz v10, :cond_13

    .line 382
    .line 383
    xor-int/lit8 v2, v15, 0x1

    .line 384
    .line 385
    new-instance v10, Lra/c0;

    .line 386
    .line 387
    aget-object v11, v1, v2

    .line 388
    .line 389
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 390
    .line 391
    .line 392
    invoke-direct {v10, v13, v12, v11}, Lra/c0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 393
    .line 394
    .line 395
    aput-object v12, v1, v2

    .line 396
    .line 397
    move-object v2, v10

    .line 398
    :goto_a
    add-int/lit8 v7, v7, 0x1

    .line 399
    .line 400
    const/4 v10, -0x1

    .line 401
    goto :goto_8

    .line 402
    :cond_13
    add-int/lit8 v14, v14, 0x1

    .line 403
    .line 404
    const/4 v10, -0x1

    .line 405
    goto :goto_9

    .line 406
    :cond_14
    if-ne v8, v0, :cond_15

    .line 407
    .line 408
    :goto_b
    move-object v2, v5

    .line 409
    goto/16 :goto_4

    .line 410
    .line 411
    :cond_15
    new-array v6, v9, [Ljava/lang/Object;

    .line 412
    .line 413
    aput-object v5, v6, v3

    .line 414
    .line 415
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 416
    .line 417
    .line 418
    move-result-object v5

    .line 419
    aput-object v5, v6, v4

    .line 420
    .line 421
    const/4 v5, 0x2

    .line 422
    aput-object v2, v6, v5

    .line 423
    .line 424
    :goto_c
    move-object v2, v6

    .line 425
    :goto_d
    nop

    .line 426
    instance-of v6, v2, [Ljava/lang/Object;

    .line 427
    .line 428
    if-eqz v6, :cond_16

    .line 429
    .line 430
    check-cast v2, [Ljava/lang/Object;

    .line 431
    .line 432
    aget-object v0, v2, v5

    .line 433
    .line 434
    check-cast v0, Lra/c0;

    .line 435
    .line 436
    move-object/from16 v5, p2

    .line 437
    .line 438
    iput-object v0, v5, Lra/d0;->c:Lra/c0;

    .line 439
    .line 440
    aget-object v0, v2, v3

    .line 441
    .line 442
    aget-object v2, v2, v4

    .line 443
    .line 444
    check-cast v2, Ljava/lang/Integer;

    .line 445
    .line 446
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 447
    .line 448
    .line 449
    move-result v2

    .line 450
    add-int v3, v2, v2

    .line 451
    .line 452
    invoke-static {v1, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 453
    .line 454
    .line 455
    move-result-object v1

    .line 456
    move/from16 v16, v2

    .line 457
    .line 458
    move-object v2, v0

    .line 459
    move/from16 v0, v16

    .line 460
    .line 461
    :cond_16
    new-instance v3, Lra/g;

    .line 462
    .line 463
    invoke-direct {v3, v2, v1, v0}, Lra/g;-><init>(Ljava/lang/Object;[Ljava/lang/Object;I)V

    .line 464
    .line 465
    .line 466
    return-object v3

    .line 467
    :cond_17
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 468
    .line 469
    const-string v1, "collection too large"

    .line 470
    .line 471
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 472
    .line 473
    .line 474
    throw v0
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


# virtual methods
.method final a()Lra/y;
    .locals 4

    new-instance v0, Lra/f;

    iget-object v1, p0, Lra/g;->o:[Ljava/lang/Object;

    const/4 v2, 0x1

    iget v3, p0, Lra/g;->p:I

    invoke-direct {v0, v1, v2, v3}, Lra/f;-><init>([Ljava/lang/Object;II)V

    return-object v0
.end method

.method final c()Lra/f0;
    .locals 4

    new-instance v0, Lra/d;

    iget-object v1, p0, Lra/g;->o:[Ljava/lang/Object;

    const/4 v2, 0x0

    iget v3, p0, Lra/g;->p:I

    invoke-direct {v0, p0, v1, v2, v3}, Lra/d;-><init>(Lra/e0;[Ljava/lang/Object;II)V

    return-object v0
.end method

.method final d()Lra/f0;
    .locals 4

    .line 1
    new-instance v0, Lra/f;

    .line 2
    .line 3
    iget-object v1, p0, Lra/g;->o:[Ljava/lang/Object;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget v3, p0, Lra/g;->p:I

    .line 7
    .line 8
    invoke-direct {v0, v1, v2, v3}, Lra/f;-><init>([Ljava/lang/Object;II)V

    .line 9
    .line 10
    .line 11
    new-instance v1, Lra/e;

    .line 12
    .line 13
    invoke-direct {v1, p0, v0}, Lra/e;-><init>(Lra/e0;Lra/b0;)V

    .line 14
    .line 15
    .line 16
    return-object v1
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object v0, p0, Lra/g;->n:Ljava/lang/Object;

    .line 2
    .line 3
    iget-object v1, p0, Lra/g;->o:[Ljava/lang/Object;

    .line 4
    .line 5
    iget v2, p0, Lra/g;->p:I

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-nez p1, :cond_1

    .line 9
    .line 10
    :cond_0
    :goto_0
    move-object p1, v3

    .line 11
    goto/16 :goto_4

    .line 12
    .line 13
    :cond_1
    const/4 v4, 0x1

    .line 14
    if-ne v2, v4, :cond_2

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    aget-object v0, v1, v0

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    aget-object p1, v1, v4

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    goto/16 :goto_4

    .line 34
    .line 35
    :cond_2
    if-nez v0, :cond_3

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_3
    instance-of v2, v0, [B

    .line 39
    .line 40
    const/4 v5, -0x1

    .line 41
    if-eqz v2, :cond_6

    .line 42
    .line 43
    move-object v2, v0

    .line 44
    check-cast v2, [B

    .line 45
    .line 46
    array-length v0, v2

    .line 47
    add-int/lit8 v6, v0, -0x1

    .line 48
    .line 49
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    invoke-static {v0}, Lra/x;->a(I)I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    :goto_1
    and-int/2addr v0, v6

    .line 58
    aget-byte v5, v2, v0

    .line 59
    .line 60
    const/16 v7, 0xff

    .line 61
    .line 62
    and-int/2addr v5, v7

    .line 63
    if-ne v5, v7, :cond_4

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_4
    aget-object v7, v1, v5

    .line 67
    .line 68
    invoke-virtual {p1, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v7

    .line 72
    if-eqz v7, :cond_5

    .line 73
    .line 74
    xor-int/lit8 p1, v5, 0x1

    .line 75
    .line 76
    aget-object p1, v1, p1

    .line 77
    .line 78
    goto :goto_4

    .line 79
    :cond_5
    add-int/lit8 v0, v0, 0x1

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_6
    instance-of v2, v0, [S

    .line 83
    .line 84
    if-eqz v2, :cond_9

    .line 85
    .line 86
    move-object v2, v0

    .line 87
    check-cast v2, [S

    .line 88
    .line 89
    array-length v0, v2

    .line 90
    add-int/lit8 v6, v0, -0x1

    .line 91
    .line 92
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    invoke-static {v0}, Lra/x;->a(I)I

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    :goto_2
    and-int/2addr v0, v6

    .line 101
    aget-short v5, v2, v0

    .line 102
    .line 103
    int-to-char v5, v5

    .line 104
    const v7, 0xffff

    .line 105
    .line 106
    .line 107
    if-ne v5, v7, :cond_7

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_7
    aget-object v7, v1, v5

    .line 111
    .line 112
    invoke-virtual {p1, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v7

    .line 116
    if-eqz v7, :cond_8

    .line 117
    .line 118
    xor-int/lit8 p1, v5, 0x1

    .line 119
    .line 120
    aget-object p1, v1, p1

    .line 121
    .line 122
    goto :goto_4

    .line 123
    :cond_8
    add-int/lit8 v0, v0, 0x1

    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_9
    check-cast v0, [I

    .line 127
    .line 128
    array-length v2, v0

    .line 129
    add-int/2addr v2, v5

    .line 130
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 131
    .line 132
    .line 133
    move-result v6

    .line 134
    invoke-static {v6}, Lra/x;->a(I)I

    .line 135
    .line 136
    .line 137
    move-result v6

    .line 138
    :goto_3
    and-int/2addr v6, v2

    .line 139
    aget v7, v0, v6

    .line 140
    .line 141
    if-ne v7, v5, :cond_a

    .line 142
    .line 143
    goto/16 :goto_0

    .line 144
    .line 145
    :cond_a
    aget-object v8, v1, v7

    .line 146
    .line 147
    invoke-virtual {p1, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result v8

    .line 151
    if-eqz v8, :cond_c

    .line 152
    .line 153
    xor-int/lit8 p1, v7, 0x1

    .line 154
    .line 155
    aget-object p1, v1, p1

    .line 156
    .line 157
    :goto_4
    if-nez p1, :cond_b

    .line 158
    .line 159
    return-object v3

    .line 160
    :cond_b
    return-object p1

    .line 161
    :cond_c
    add-int/lit8 v6, v6, 0x1

    .line 162
    .line 163
    goto :goto_3
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
.end method

.method public final size()I
    .locals 1

    iget v0, p0, Lra/g;->p:I

    return v0
.end method
