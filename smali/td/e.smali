.class final Ltd/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltd/e$b;
    }
.end annotation


# static fields
.field private static final a:[C

.field private static final b:[C

.field private static final c:[Ljava/math/BigInteger;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const-string v0, ";<>@[\\]_`~!\r\t,:\n-.$/\"|*()?{}\'"

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Ltd/e;->a:[C

    .line 8
    .line 9
    const-string v0, "0123456789&\r\t,:#-.$/+%*=^"

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Ltd/e;->b:[C

    .line 16
    .line 17
    const/16 v0, 0x10

    .line 18
    .line 19
    new-array v0, v0, [Ljava/math/BigInteger;

    .line 20
    .line 21
    sput-object v0, Ltd/e;->c:[Ljava/math/BigInteger;

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    sget-object v2, Ljava/math/BigInteger;->ONE:Ljava/math/BigInteger;

    .line 25
    .line 26
    aput-object v2, v0, v1

    .line 27
    .line 28
    const-wide/16 v1, 0x384

    .line 29
    .line 30
    invoke-static {v1, v2}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    const/4 v2, 0x1

    .line 35
    aput-object v1, v0, v2

    .line 36
    .line 37
    const/4 v0, 0x2

    .line 38
    :goto_0
    sget-object v2, Ltd/e;->c:[Ljava/math/BigInteger;

    .line 39
    .line 40
    array-length v3, v2

    .line 41
    if-ge v0, v3, :cond_0

    .line 42
    .line 43
    add-int/lit8 v3, v0, -0x1

    .line 44
    .line 45
    aget-object v3, v2, v3

    .line 46
    .line 47
    invoke-virtual {v3, v1}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    aput-object v3, v2, v0

    .line 52
    .line 53
    add-int/lit8 v0, v0, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    return-void
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

.method private static a(I[ILjava/nio/charset/Charset;ILjava/lang/StringBuilder;)I
    .locals 16

    .line 1
    move/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 6
    .line 7
    .line 8
    const/16 v2, 0x385

    .line 9
    .line 10
    const-wide/16 v3, 0x384

    .line 11
    .line 12
    const/16 v5, 0x3a0

    .line 13
    .line 14
    const/16 v6, 0x384

    .line 15
    .line 16
    const/4 v7, 0x6

    .line 17
    const/4 v9, 0x0

    .line 18
    if-eq v0, v2, :cond_5

    .line 19
    .line 20
    const/16 v2, 0x39c

    .line 21
    .line 22
    if-eq v0, v2, :cond_0

    .line 23
    .line 24
    move/from16 v0, p3

    .line 25
    .line 26
    goto/16 :goto_8

    .line 27
    .line 28
    :cond_0
    move/from16 v0, p3

    .line 29
    .line 30
    move v2, v9

    .line 31
    move v12, v2

    .line 32
    :goto_0
    const-wide/16 v13, 0x0

    .line 33
    .line 34
    :cond_1
    aget v15, p1, v9

    .line 35
    .line 36
    if-ge v0, v15, :cond_c

    .line 37
    .line 38
    if-nez v2, :cond_c

    .line 39
    .line 40
    add-int/lit8 v15, v0, 0x1

    .line 41
    .line 42
    aget v0, p1, v0

    .line 43
    .line 44
    if-ge v0, v6, :cond_2

    .line 45
    .line 46
    add-int/lit8 v12, v12, 0x1

    .line 47
    .line 48
    mul-long/2addr v13, v3

    .line 49
    int-to-long v10, v0

    .line 50
    add-long/2addr v13, v10

    .line 51
    goto :goto_1

    .line 52
    :cond_2
    if-eq v0, v5, :cond_3

    .line 53
    .line 54
    packed-switch v0, :pswitch_data_0

    .line 55
    .line 56
    .line 57
    packed-switch v0, :pswitch_data_1

    .line 58
    .line 59
    .line 60
    :goto_1
    move v0, v15

    .line 61
    goto :goto_2

    .line 62
    :cond_3
    :pswitch_0
    add-int/lit8 v15, v15, -0x1

    .line 63
    .line 64
    move v0, v15

    .line 65
    const/4 v2, 0x1

    .line 66
    :goto_2
    rem-int/lit8 v10, v12, 0x5

    .line 67
    .line 68
    if-nez v10, :cond_1

    .line 69
    .line 70
    if-lez v12, :cond_1

    .line 71
    .line 72
    move v10, v9

    .line 73
    :goto_3
    if-ge v10, v7, :cond_4

    .line 74
    .line 75
    rsub-int/lit8 v11, v10, 0x5

    .line 76
    .line 77
    mul-int/lit8 v11, v11, 0x8

    .line 78
    .line 79
    shr-long v11, v13, v11

    .line 80
    .line 81
    long-to-int v11, v11

    .line 82
    int-to-byte v11, v11

    .line 83
    invoke-virtual {v1, v11}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 84
    .line 85
    .line 86
    add-int/lit8 v10, v10, 0x1

    .line 87
    .line 88
    goto :goto_3

    .line 89
    :cond_4
    move v12, v9

    .line 90
    goto :goto_0

    .line 91
    :cond_5
    new-array v0, v7, [I

    .line 92
    .line 93
    add-int/lit8 v2, p3, 0x1

    .line 94
    .line 95
    aget v10, p1, p3

    .line 96
    .line 97
    move v11, v9

    .line 98
    move v12, v11

    .line 99
    :goto_4
    const-wide/16 v13, 0x0

    .line 100
    .line 101
    :goto_5
    aget v15, p1, v9

    .line 102
    .line 103
    if-ge v2, v15, :cond_9

    .line 104
    .line 105
    if-nez v11, :cond_9

    .line 106
    .line 107
    add-int/lit8 v15, v12, 0x1

    .line 108
    .line 109
    aput v10, v0, v12

    .line 110
    .line 111
    mul-long/2addr v13, v3

    .line 112
    int-to-long v3, v10

    .line 113
    add-long/2addr v13, v3

    .line 114
    add-int/lit8 v3, v2, 0x1

    .line 115
    .line 116
    aget v10, p1, v2

    .line 117
    .line 118
    if-eq v10, v5, :cond_8

    .line 119
    .line 120
    packed-switch v10, :pswitch_data_2

    .line 121
    .line 122
    .line 123
    packed-switch v10, :pswitch_data_3

    .line 124
    .line 125
    .line 126
    rem-int/lit8 v2, v15, 0x5

    .line 127
    .line 128
    if-nez v2, :cond_7

    .line 129
    .line 130
    if-lez v15, :cond_7

    .line 131
    .line 132
    move v2, v9

    .line 133
    :goto_6
    if-ge v2, v7, :cond_6

    .line 134
    .line 135
    rsub-int/lit8 v4, v2, 0x5

    .line 136
    .line 137
    mul-int/lit8 v4, v4, 0x8

    .line 138
    .line 139
    shr-long v7, v13, v4

    .line 140
    .line 141
    long-to-int v4, v7

    .line 142
    int-to-byte v4, v4

    .line 143
    invoke-virtual {v1, v4}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 144
    .line 145
    .line 146
    add-int/lit8 v2, v2, 0x1

    .line 147
    .line 148
    const/4 v7, 0x6

    .line 149
    goto :goto_6

    .line 150
    :cond_6
    move v2, v3

    .line 151
    move v12, v9

    .line 152
    const-wide/16 v3, 0x384

    .line 153
    .line 154
    goto :goto_4

    .line 155
    :cond_7
    move v2, v3

    .line 156
    move v12, v15

    .line 157
    const-wide/16 v3, 0x384

    .line 158
    .line 159
    const/4 v7, 0x6

    .line 160
    goto :goto_5

    .line 161
    :cond_8
    :pswitch_1
    add-int/lit8 v2, v3, -0x1

    .line 162
    .line 163
    move v12, v15

    .line 164
    const-wide/16 v3, 0x384

    .line 165
    .line 166
    const/4 v7, 0x6

    .line 167
    const/4 v11, 0x1

    .line 168
    goto :goto_5

    .line 169
    :cond_9
    if-ne v2, v15, :cond_a

    .line 170
    .line 171
    if-ge v10, v6, :cond_a

    .line 172
    .line 173
    add-int/lit8 v3, v12, 0x1

    .line 174
    .line 175
    aput v10, v0, v12

    .line 176
    .line 177
    move v12, v3

    .line 178
    :cond_a
    :goto_7
    if-ge v9, v12, :cond_b

    .line 179
    .line 180
    aget v3, v0, v9

    .line 181
    .line 182
    int-to-byte v3, v3

    .line 183
    invoke-virtual {v1, v3}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 184
    .line 185
    .line 186
    add-int/lit8 v9, v9, 0x1

    .line 187
    .line 188
    goto :goto_7

    .line 189
    :cond_b
    move v0, v2

    .line 190
    :cond_c
    :goto_8
    new-instance v2, Ljava/lang/String;

    .line 191
    .line 192
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    move-object/from16 v3, p2

    .line 197
    .line 198
    invoke-direct {v2, v1, v3}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 199
    .line 200
    .line 201
    move-object/from16 v1, p4

    .line 202
    .line 203
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    return v0

    .line 207
    :pswitch_data_0
    .packed-switch 0x384
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

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
    :pswitch_data_1
    .packed-switch 0x39a
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

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
    :pswitch_data_2
    .packed-switch 0x384
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch

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
    :pswitch_data_3
    .packed-switch 0x39a
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
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

.method static b([ILjava/lang/String;)Lgd/e;
    .locals 6

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    array-length v1, p0

    .line 4
    const/4 v2, 0x1

    .line 5
    shl-int/2addr v1, v2

    .line 6
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 7
    .line 8
    .line 9
    sget-object v1, Ljava/nio/charset/StandardCharsets;->ISO_8859_1:Ljava/nio/charset/Charset;

    .line 10
    .line 11
    aget v2, p0, v2

    .line 12
    .line 13
    new-instance v3, Lsd/c;

    .line 14
    .line 15
    invoke-direct {v3}, Lsd/c;-><init>()V

    .line 16
    .line 17
    .line 18
    const/4 v4, 0x2

    .line 19
    :goto_0
    const/4 v5, 0x0

    .line 20
    aget v5, p0, v5

    .line 21
    .line 22
    if-ge v4, v5, :cond_2

    .line 23
    .line 24
    const/16 v5, 0x391

    .line 25
    .line 26
    if-eq v2, v5, :cond_0

    .line 27
    .line 28
    packed-switch v2, :pswitch_data_0

    .line 29
    .line 30
    .line 31
    packed-switch v2, :pswitch_data_1

    .line 32
    .line 33
    .line 34
    add-int/lit8 v4, v4, -0x1

    .line 35
    .line 36
    invoke-static {p0, v4, v0}, Ltd/e;->g([IILjava/lang/StringBuilder;)I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    goto :goto_1

    .line 41
    :pswitch_0
    invoke-static {p0, v4, v3}, Ltd/e;->d([IILsd/c;)I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    goto :goto_1

    .line 46
    :pswitch_1
    add-int/lit8 v2, v4, 0x1

    .line 47
    .line 48
    aget v1, p0, v4

    .line 49
    .line 50
    invoke-static {v1}, Lgd/d;->a(I)Lgd/d;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-static {v1}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    goto :goto_1

    .line 63
    :pswitch_2
    add-int/lit8 v2, v4, 0x2

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :pswitch_3
    add-int/lit8 v2, v4, 0x1

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :pswitch_4
    invoke-static {}, Lcd/f;->a()Lcd/f;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    throw p0

    .line 74
    :pswitch_5
    invoke-static {p0, v4, v0}, Ltd/e;->f([IILjava/lang/StringBuilder;)I

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    goto :goto_1

    .line 79
    :pswitch_6
    invoke-static {v2, p0, v1, v4, v0}, Ltd/e;->a(I[ILjava/nio/charset/Charset;ILjava/lang/StringBuilder;)I

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    goto :goto_1

    .line 84
    :pswitch_7
    invoke-static {p0, v4, v0}, Ltd/e;->g([IILjava/lang/StringBuilder;)I

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    goto :goto_1

    .line 89
    :cond_0
    add-int/lit8 v2, v4, 0x1

    .line 90
    .line 91
    aget v4, p0, v4

    .line 92
    .line 93
    int-to-char v4, v4

    .line 94
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    :goto_1
    array-length v4, p0

    .line 98
    if-ge v2, v4, :cond_1

    .line 99
    .line 100
    add-int/lit8 v4, v2, 0x1

    .line 101
    .line 102
    aget v2, p0, v2

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_1
    invoke-static {}, Lcd/f;->a()Lcd/f;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    throw p0

    .line 110
    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 111
    .line 112
    .line 113
    move-result p0

    .line 114
    if-eqz p0, :cond_3

    .line 115
    .line 116
    new-instance p0, Lgd/e;

    .line 117
    .line 118
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    const/4 v1, 0x0

    .line 123
    invoke-direct {p0, v1, v0, v1, p1}, Lgd/e;-><init>([BLjava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p0, v3}, Lgd/e;->m(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    return-object p0

    .line 130
    :cond_3
    invoke-static {}, Lcd/f;->a()Lcd/f;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    throw p0

    .line 135
    :pswitch_data_0
    .packed-switch 0x384
        :pswitch_7
        :pswitch_6
        :pswitch_5
    .end packed-switch

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
    :pswitch_data_1
    .packed-switch 0x39a
        :pswitch_4
        :pswitch_4
        :pswitch_6
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method private static c([II)Ljava/lang/String;
    .locals 6

    .line 1
    sget-object v0, Ljava/math/BigInteger;->ZERO:Ljava/math/BigInteger;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    move v2, v1

    .line 5
    :goto_0
    const/4 v3, 0x1

    .line 6
    if-ge v2, p1, :cond_0

    .line 7
    .line 8
    sget-object v4, Ltd/e;->c:[Ljava/math/BigInteger;

    .line 9
    .line 10
    sub-int v5, p1, v2

    .line 11
    .line 12
    sub-int/2addr v5, v3

    .line 13
    aget-object v3, v4, v5

    .line 14
    .line 15
    aget v4, p0, v2

    .line 16
    .line 17
    int-to-long v4, v4

    .line 18
    invoke-static {v4, v5}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    invoke-virtual {v3, v4}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {v0, v3}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    add-int/lit8 v2, v2, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-virtual {v0}, Ljava/math/BigInteger;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    const/16 v0, 0x31

    .line 42
    .line 43
    if-ne p1, v0, :cond_1

    .line 44
    .line 45
    invoke-virtual {p0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    return-object p0

    .line 50
    :cond_1
    invoke-static {}, Lcd/f;->a()Lcd/f;

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

.method static d([IILsd/c;)I
    .locals 6

    .line 1
    add-int/lit8 v0, p1, 0x2

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget v2, p0, v1

    .line 5
    .line 6
    if-gt v0, v2, :cond_7

    .line 7
    .line 8
    const/4 v0, 0x2

    .line 9
    new-array v2, v0, [I

    .line 10
    .line 11
    move v3, v1

    .line 12
    :goto_0
    if-ge v3, v0, :cond_0

    .line 13
    .line 14
    aget v4, p0, p1

    .line 15
    .line 16
    aput v4, v2, v3

    .line 17
    .line 18
    add-int/lit8 v3, v3, 0x1

    .line 19
    .line 20
    add-int/lit8 p1, p1, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-static {v2, v0}, Ltd/e;->c([II)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    invoke-virtual {p2, v0}, Lsd/c;->j(I)V

    .line 32
    .line 33
    .line 34
    new-instance v0, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 37
    .line 38
    .line 39
    invoke-static {p0, p1, v0}, Ltd/e;->g([IILjava/lang/StringBuilder;)I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {p2, v0}, Lsd/c;->d(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    aget v0, p0, p1

    .line 51
    .line 52
    const/16 v2, 0x39b

    .line 53
    .line 54
    const/4 v3, -0x1

    .line 55
    if-ne v0, v2, :cond_1

    .line 56
    .line 57
    add-int/lit8 v0, p1, 0x1

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    move v0, v3

    .line 61
    :goto_1
    aget v4, p0, v1

    .line 62
    .line 63
    if-ge p1, v4, :cond_4

    .line 64
    .line 65
    aget v4, p0, p1

    .line 66
    .line 67
    const/16 v5, 0x39a

    .line 68
    .line 69
    if-eq v4, v5, :cond_3

    .line 70
    .line 71
    if-ne v4, v2, :cond_2

    .line 72
    .line 73
    add-int/lit8 p1, p1, 0x1

    .line 74
    .line 75
    aget v4, p0, p1

    .line 76
    .line 77
    packed-switch v4, :pswitch_data_0

    .line 78
    .line 79
    .line 80
    invoke-static {}, Lcd/f;->a()Lcd/f;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    throw p0

    .line 85
    :pswitch_0
    new-instance v4, Ljava/lang/StringBuilder;

    .line 86
    .line 87
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 88
    .line 89
    .line 90
    add-int/lit8 p1, p1, 0x1

    .line 91
    .line 92
    invoke-static {p0, p1, v4}, Ltd/e;->f([IILjava/lang/StringBuilder;)I

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 101
    .line 102
    .line 103
    move-result v4

    .line 104
    invoke-virtual {p2, v4}, Lsd/c;->c(I)V

    .line 105
    .line 106
    .line 107
    goto :goto_1

    .line 108
    :pswitch_1
    new-instance v4, Ljava/lang/StringBuilder;

    .line 109
    .line 110
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 111
    .line 112
    .line 113
    add-int/lit8 p1, p1, 0x1

    .line 114
    .line 115
    invoke-static {p0, p1, v4}, Ltd/e;->f([IILjava/lang/StringBuilder;)I

    .line 116
    .line 117
    .line 118
    move-result p1

    .line 119
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v4

    .line 123
    invoke-static {v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 124
    .line 125
    .line 126
    move-result-wide v4

    .line 127
    invoke-virtual {p2, v4, v5}, Lsd/c;->f(J)V

    .line 128
    .line 129
    .line 130
    goto :goto_1

    .line 131
    :pswitch_2
    new-instance v4, Ljava/lang/StringBuilder;

    .line 132
    .line 133
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 134
    .line 135
    .line 136
    add-int/lit8 p1, p1, 0x1

    .line 137
    .line 138
    invoke-static {p0, p1, v4}, Ltd/e;->g([IILjava/lang/StringBuilder;)I

    .line 139
    .line 140
    .line 141
    move-result p1

    .line 142
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v4

    .line 146
    invoke-virtual {p2, v4}, Lsd/c;->b(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    goto :goto_1

    .line 150
    :pswitch_3
    new-instance v4, Ljava/lang/StringBuilder;

    .line 151
    .line 152
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 153
    .line 154
    .line 155
    add-int/lit8 p1, p1, 0x1

    .line 156
    .line 157
    invoke-static {p0, p1, v4}, Ltd/e;->g([IILjava/lang/StringBuilder;)I

    .line 158
    .line 159
    .line 160
    move-result p1

    .line 161
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v4

    .line 165
    invoke-virtual {p2, v4}, Lsd/c;->k(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    goto :goto_1

    .line 169
    :pswitch_4
    new-instance v4, Ljava/lang/StringBuilder;

    .line 170
    .line 171
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 172
    .line 173
    .line 174
    add-int/lit8 p1, p1, 0x1

    .line 175
    .line 176
    invoke-static {p0, p1, v4}, Ltd/e;->f([IILjava/lang/StringBuilder;)I

    .line 177
    .line 178
    .line 179
    move-result p1

    .line 180
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v4

    .line 184
    invoke-static {v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 185
    .line 186
    .line 187
    move-result-wide v4

    .line 188
    invoke-virtual {p2, v4, v5}, Lsd/c;->l(J)V

    .line 189
    .line 190
    .line 191
    goto/16 :goto_1

    .line 192
    .line 193
    :pswitch_5
    new-instance v4, Ljava/lang/StringBuilder;

    .line 194
    .line 195
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 196
    .line 197
    .line 198
    add-int/lit8 p1, p1, 0x1

    .line 199
    .line 200
    invoke-static {p0, p1, v4}, Ltd/e;->f([IILjava/lang/StringBuilder;)I

    .line 201
    .line 202
    .line 203
    move-result p1

    .line 204
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v4

    .line 208
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 209
    .line 210
    .line 211
    move-result v4

    .line 212
    invoke-virtual {p2, v4}, Lsd/c;->i(I)V

    .line 213
    .line 214
    .line 215
    goto/16 :goto_1

    .line 216
    .line 217
    :pswitch_6
    new-instance v4, Ljava/lang/StringBuilder;

    .line 218
    .line 219
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 220
    .line 221
    .line 222
    add-int/lit8 p1, p1, 0x1

    .line 223
    .line 224
    invoke-static {p0, p1, v4}, Ltd/e;->g([IILjava/lang/StringBuilder;)I

    .line 225
    .line 226
    .line 227
    move-result p1

    .line 228
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v4

    .line 232
    invoke-virtual {p2, v4}, Lsd/c;->e(Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    goto/16 :goto_1

    .line 236
    .line 237
    :cond_2
    invoke-static {}, Lcd/f;->a()Lcd/f;

    .line 238
    .line 239
    .line 240
    move-result-object p0

    .line 241
    throw p0

    .line 242
    :cond_3
    add-int/lit8 p1, p1, 0x1

    .line 243
    .line 244
    const/4 v4, 0x1

    .line 245
    invoke-virtual {p2, v4}, Lsd/c;->g(Z)V

    .line 246
    .line 247
    .line 248
    goto/16 :goto_1

    .line 249
    .line 250
    :cond_4
    if-eq v0, v3, :cond_6

    .line 251
    .line 252
    sub-int v1, p1, v0

    .line 253
    .line 254
    invoke-virtual {p2}, Lsd/c;->a()Z

    .line 255
    .line 256
    .line 257
    move-result v2

    .line 258
    if-eqz v2, :cond_5

    .line 259
    .line 260
    add-int/lit8 v1, v1, -0x1

    .line 261
    .line 262
    :cond_5
    add-int/2addr v1, v0

    .line 263
    invoke-static {p0, v0, v1}, Ljava/util/Arrays;->copyOfRange([III)[I

    .line 264
    .line 265
    .line 266
    move-result-object p0

    .line 267
    invoke-virtual {p2, p0}, Lsd/c;->h([I)V

    .line 268
    .line 269
    .line 270
    :cond_6
    return p1

    .line 271
    :cond_7
    invoke-static {}, Lcd/f;->a()Lcd/f;

    .line 272
    .line 273
    .line 274
    move-result-object p0

    .line 275
    throw p0

    .line 276
    nop

    .line 277
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method private static e([I[IILjava/lang/StringBuilder;)V
    .locals 12

    .line 1
    sget-object v0, Ltd/e$b;->k:Ltd/e$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    move-object v2, v0

    .line 5
    move v3, v1

    .line 6
    :goto_0
    if-ge v3, p2, :cond_15

    .line 7
    .line 8
    aget v4, p0, v3

    .line 9
    .line 10
    sget-object v5, Ltd/e$a;->a:[I

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 13
    .line 14
    .line 15
    move-result v6

    .line 16
    aget v5, v5, v6

    .line 17
    .line 18
    const/16 v6, 0x20

    .line 19
    .line 20
    const/16 v7, 0x1d

    .line 21
    .line 22
    const/16 v8, 0x1a

    .line 23
    .line 24
    const/16 v9, 0x391

    .line 25
    .line 26
    const/16 v10, 0x384

    .line 27
    .line 28
    packed-switch v5, :pswitch_data_0

    .line 29
    .line 30
    .line 31
    goto/16 :goto_5

    .line 32
    .line 33
    :pswitch_0
    if-ge v4, v7, :cond_0

    .line 34
    .line 35
    sget-object v0, Ltd/e;->a:[C

    .line 36
    .line 37
    aget-char v6, v0, v4

    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_0
    if-eq v4, v7, :cond_3

    .line 41
    .line 42
    if-eq v4, v10, :cond_2

    .line 43
    .line 44
    if-eq v4, v9, :cond_1

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    aget v0, p1, v3

    .line 48
    .line 49
    int-to-char v0, v0

    .line 50
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    :goto_1
    move v6, v1

    .line 54
    goto :goto_2

    .line 55
    :cond_2
    sget-object v0, Ltd/e$b;->k:Ltd/e$b;

    .line 56
    .line 57
    goto/16 :goto_5

    .line 58
    .line 59
    :cond_3
    sget-object v0, Ltd/e$b;->k:Ltd/e$b;

    .line 60
    .line 61
    goto/16 :goto_5

    .line 62
    .line 63
    :pswitch_1
    if-ge v4, v8, :cond_5

    .line 64
    .line 65
    add-int/lit8 v4, v4, 0x41

    .line 66
    .line 67
    int-to-char v6, v4

    .line 68
    :cond_4
    :goto_2
    move-object v0, v2

    .line 69
    goto/16 :goto_6

    .line 70
    .line 71
    :cond_5
    if-eq v4, v8, :cond_4

    .line 72
    .line 73
    if-eq v4, v10, :cond_6

    .line 74
    .line 75
    move-object v0, v2

    .line 76
    goto/16 :goto_5

    .line 77
    .line 78
    :cond_6
    sget-object v0, Ltd/e$b;->k:Ltd/e$b;

    .line 79
    .line 80
    goto/16 :goto_5

    .line 81
    .line 82
    :pswitch_2
    if-ge v4, v7, :cond_7

    .line 83
    .line 84
    sget-object v5, Ltd/e;->a:[C

    .line 85
    .line 86
    aget-char v6, v5, v4

    .line 87
    .line 88
    goto/16 :goto_6

    .line 89
    .line 90
    :cond_7
    if-eq v4, v7, :cond_a

    .line 91
    .line 92
    if-eq v4, v10, :cond_9

    .line 93
    .line 94
    if-eq v4, v9, :cond_8

    .line 95
    .line 96
    goto/16 :goto_5

    .line 97
    .line 98
    :cond_8
    aget v4, p1, v3

    .line 99
    .line 100
    int-to-char v4, v4

    .line 101
    invoke-virtual {p3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    goto/16 :goto_5

    .line 105
    .line 106
    :cond_9
    sget-object v0, Ltd/e$b;->k:Ltd/e$b;

    .line 107
    .line 108
    goto/16 :goto_5

    .line 109
    .line 110
    :cond_a
    sget-object v0, Ltd/e$b;->k:Ltd/e$b;

    .line 111
    .line 112
    goto/16 :goto_5

    .line 113
    .line 114
    :pswitch_3
    const/16 v5, 0x19

    .line 115
    .line 116
    if-ge v4, v5, :cond_b

    .line 117
    .line 118
    sget-object v5, Ltd/e;->b:[C

    .line 119
    .line 120
    aget-char v6, v5, v4

    .line 121
    .line 122
    goto/16 :goto_6

    .line 123
    .line 124
    :cond_b
    if-eq v4, v10, :cond_d

    .line 125
    .line 126
    if-eq v4, v9, :cond_c

    .line 127
    .line 128
    packed-switch v4, :pswitch_data_1

    .line 129
    .line 130
    .line 131
    goto/16 :goto_5

    .line 132
    .line 133
    :pswitch_4
    sget-object v2, Ltd/e$b;->p:Ltd/e$b;

    .line 134
    .line 135
    goto :goto_4

    .line 136
    :pswitch_5
    sget-object v0, Ltd/e$b;->k:Ltd/e$b;

    .line 137
    .line 138
    goto/16 :goto_5

    .line 139
    .line 140
    :pswitch_6
    sget-object v0, Ltd/e$b;->l:Ltd/e$b;

    .line 141
    .line 142
    goto/16 :goto_5

    .line 143
    .line 144
    :pswitch_7
    sget-object v0, Ltd/e$b;->n:Ltd/e$b;

    .line 145
    .line 146
    goto :goto_5

    .line 147
    :cond_c
    aget v4, p1, v3

    .line 148
    .line 149
    int-to-char v4, v4

    .line 150
    invoke-virtual {p3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    goto :goto_5

    .line 154
    :cond_d
    sget-object v0, Ltd/e$b;->k:Ltd/e$b;

    .line 155
    .line 156
    goto :goto_5

    .line 157
    :pswitch_8
    if-ge v4, v8, :cond_e

    .line 158
    .line 159
    add-int/lit8 v4, v4, 0x61

    .line 160
    .line 161
    goto :goto_3

    .line 162
    :cond_e
    if-eq v4, v10, :cond_10

    .line 163
    .line 164
    if-eq v4, v9, :cond_f

    .line 165
    .line 166
    packed-switch v4, :pswitch_data_2

    .line 167
    .line 168
    .line 169
    goto :goto_5

    .line 170
    :pswitch_9
    sget-object v2, Ltd/e$b;->p:Ltd/e$b;

    .line 171
    .line 172
    goto :goto_4

    .line 173
    :pswitch_a
    sget-object v0, Ltd/e$b;->m:Ltd/e$b;

    .line 174
    .line 175
    goto :goto_5

    .line 176
    :pswitch_b
    sget-object v2, Ltd/e$b;->o:Ltd/e$b;

    .line 177
    .line 178
    goto :goto_4

    .line 179
    :cond_f
    aget v4, p1, v3

    .line 180
    .line 181
    int-to-char v4, v4

    .line 182
    invoke-virtual {p3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    goto :goto_5

    .line 186
    :cond_10
    sget-object v0, Ltd/e$b;->k:Ltd/e$b;

    .line 187
    .line 188
    goto :goto_5

    .line 189
    :pswitch_c
    if-ge v4, v8, :cond_11

    .line 190
    .line 191
    add-int/lit8 v4, v4, 0x41

    .line 192
    .line 193
    :goto_3
    int-to-char v6, v4

    .line 194
    goto :goto_6

    .line 195
    :cond_11
    if-eq v4, v10, :cond_13

    .line 196
    .line 197
    if-eq v4, v9, :cond_12

    .line 198
    .line 199
    packed-switch v4, :pswitch_data_3

    .line 200
    .line 201
    .line 202
    goto :goto_5

    .line 203
    :pswitch_d
    sget-object v2, Ltd/e$b;->p:Ltd/e$b;

    .line 204
    .line 205
    :goto_4
    move v6, v1

    .line 206
    move-object v11, v2

    .line 207
    move-object v2, v0

    .line 208
    move-object v0, v11

    .line 209
    goto :goto_6

    .line 210
    :pswitch_e
    sget-object v0, Ltd/e$b;->m:Ltd/e$b;

    .line 211
    .line 212
    goto :goto_5

    .line 213
    :pswitch_f
    sget-object v0, Ltd/e$b;->l:Ltd/e$b;

    .line 214
    .line 215
    goto :goto_5

    .line 216
    :cond_12
    aget v4, p1, v3

    .line 217
    .line 218
    int-to-char v4, v4

    .line 219
    invoke-virtual {p3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    goto :goto_5

    .line 223
    :cond_13
    sget-object v0, Ltd/e$b;->k:Ltd/e$b;

    .line 224
    .line 225
    :goto_5
    move v6, v1

    .line 226
    :goto_6
    :pswitch_10
    if-eqz v6, :cond_14

    .line 227
    .line 228
    invoke-virtual {p3, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    :cond_14
    add-int/lit8 v3, v3, 0x1

    .line 232
    .line 233
    goto/16 :goto_0

    .line 234
    .line 235
    :cond_15
    return-void

    .line 236
    nop

    .line 237
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_c
        :pswitch_8
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

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
    :pswitch_data_1
    .packed-switch 0x19
        :pswitch_7
        :pswitch_10
        :pswitch_6
        :pswitch_5
        :pswitch_4
    .end packed-switch

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
    :pswitch_data_2
    .packed-switch 0x1a
        :pswitch_10
        :pswitch_b
        :pswitch_a
        :pswitch_9
    .end packed-switch

    .line 268
    .line 269
    :pswitch_data_3
    .packed-switch 0x1a
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
    .end packed-switch
.end method

.method private static f([IILjava/lang/StringBuilder;)I
    .locals 7

    .line 1
    const/16 v0, 0xf

    .line 2
    .line 3
    new-array v0, v0, [I

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    move v2, v1

    .line 7
    move v3, v2

    .line 8
    :goto_0
    aget v4, p0, v1

    .line 9
    .line 10
    if-ge p1, v4, :cond_5

    .line 11
    .line 12
    if-nez v2, :cond_5

    .line 13
    .line 14
    add-int/lit8 v5, p1, 0x1

    .line 15
    .line 16
    aget p1, p0, p1

    .line 17
    .line 18
    const/4 v6, 0x1

    .line 19
    if-ne v5, v4, :cond_0

    .line 20
    .line 21
    move v2, v6

    .line 22
    :cond_0
    const/16 v4, 0x384

    .line 23
    .line 24
    if-ge p1, v4, :cond_1

    .line 25
    .line 26
    aput p1, v0, v3

    .line 27
    .line 28
    add-int/lit8 v3, v3, 0x1

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    if-eq p1, v4, :cond_2

    .line 32
    .line 33
    const/16 v4, 0x385

    .line 34
    .line 35
    if-eq p1, v4, :cond_2

    .line 36
    .line 37
    const/16 v4, 0x3a0

    .line 38
    .line 39
    if-eq p1, v4, :cond_2

    .line 40
    .line 41
    packed-switch p1, :pswitch_data_0

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_2
    :pswitch_0
    add-int/lit8 v5, v5, -0x1

    .line 46
    .line 47
    move v2, v6

    .line 48
    :goto_1
    rem-int/lit8 v4, v3, 0xf

    .line 49
    .line 50
    if-eqz v4, :cond_3

    .line 51
    .line 52
    const/16 v4, 0x386

    .line 53
    .line 54
    if-eq p1, v4, :cond_3

    .line 55
    .line 56
    if-eqz v2, :cond_4

    .line 57
    .line 58
    :cond_3
    if-lez v3, :cond_4

    .line 59
    .line 60
    invoke-static {v0, v3}, Ltd/e;->c([II)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    move v3, v1

    .line 68
    :cond_4
    move p1, v5

    .line 69
    goto :goto_0

    .line 70
    :cond_5
    return p1

    .line 71
    :pswitch_data_0
    .packed-switch 0x39a
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
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
.end method

.method private static g([IILjava/lang/StringBuilder;)I
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    aget v1, p0, v0

    .line 3
    .line 4
    sub-int v2, v1, p1

    .line 5
    .line 6
    const/4 v3, 0x1

    .line 7
    shl-int/2addr v2, v3

    .line 8
    new-array v2, v2, [I

    .line 9
    .line 10
    sub-int/2addr v1, p1

    .line 11
    shl-int/2addr v1, v3

    .line 12
    new-array v1, v1, [I

    .line 13
    .line 14
    move v4, v0

    .line 15
    move v5, v4

    .line 16
    :goto_0
    aget v6, p0, v0

    .line 17
    .line 18
    if-ge p1, v6, :cond_3

    .line 19
    .line 20
    if-nez v4, :cond_3

    .line 21
    .line 22
    add-int/lit8 v6, p1, 0x1

    .line 23
    .line 24
    aget p1, p0, p1

    .line 25
    .line 26
    const/16 v7, 0x384

    .line 27
    .line 28
    if-ge p1, v7, :cond_0

    .line 29
    .line 30
    div-int/lit8 v7, p1, 0x1e

    .line 31
    .line 32
    aput v7, v2, v5

    .line 33
    .line 34
    add-int/lit8 v7, v5, 0x1

    .line 35
    .line 36
    rem-int/lit8 p1, p1, 0x1e

    .line 37
    .line 38
    aput p1, v2, v7

    .line 39
    .line 40
    add-int/lit8 v5, v5, 0x2

    .line 41
    .line 42
    :goto_1
    move p1, v6

    .line 43
    goto :goto_0

    .line 44
    :cond_0
    const/16 v8, 0x391

    .line 45
    .line 46
    if-eq p1, v8, :cond_2

    .line 47
    .line 48
    const/16 v8, 0x3a0

    .line 49
    .line 50
    if-eq p1, v8, :cond_1

    .line 51
    .line 52
    packed-switch p1, :pswitch_data_0

    .line 53
    .line 54
    .line 55
    packed-switch p1, :pswitch_data_1

    .line 56
    .line 57
    .line 58
    goto :goto_1

    .line 59
    :pswitch_0
    add-int/lit8 p1, v5, 0x1

    .line 60
    .line 61
    aput v7, v2, v5

    .line 62
    .line 63
    move v5, p1

    .line 64
    goto :goto_1

    .line 65
    :cond_1
    :pswitch_1
    add-int/lit8 p1, v6, -0x1

    .line 66
    .line 67
    move v4, v3

    .line 68
    goto :goto_0

    .line 69
    :cond_2
    aput v8, v2, v5

    .line 70
    .line 71
    add-int/lit8 p1, v6, 0x1

    .line 72
    .line 73
    aget v6, p0, v6

    .line 74
    .line 75
    aput v6, v1, v5

    .line 76
    .line 77
    add-int/lit8 v5, v5, 0x1

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_3
    invoke-static {v2, v1, v5, p2}, Ltd/e;->e([I[IILjava/lang/StringBuilder;)V

    .line 81
    .line 82
    .line 83
    return p1

    .line 84
    nop

    .line 85
    :pswitch_data_0
    .packed-switch 0x384
        :pswitch_0
        :pswitch_1
        :pswitch_1
    .end packed-switch

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
    :pswitch_data_1
    .packed-switch 0x39a
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
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
