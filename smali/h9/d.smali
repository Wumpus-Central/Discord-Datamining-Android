.class public final Lh9/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh9/d$a;,
        Lh9/d$b;
    }
.end annotation


# instance fields
.field public final a:Lh9/d$a;

.field public final b:Lh9/d$a;

.field public final c:I

.field public final d:Z


# direct methods
.method public constructor <init>(Lh9/d$a;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p1, p2}, Lh9/d;-><init>(Lh9/d$a;Lh9/d$a;I)V

    return-void
.end method

.method public constructor <init>(Lh9/d$a;Lh9/d$a;I)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lh9/d;->a:Lh9/d$a;

    .line 4
    iput-object p2, p0, Lh9/d;->b:Lh9/d$a;

    .line 5
    iput p3, p0, Lh9/d;->c:I

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 6
    :goto_0
    iput-boolean p1, p0, Lh9/d;->d:Z

    return-void
.end method

.method public static a(FIIFFI)Lh9/d;
    .locals 31

    .line 1
    move/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    move/from16 v3, p3

    .line 8
    .line 9
    move/from16 v4, p4

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    cmpl-float v6, v0, v5

    .line 13
    .line 14
    const/4 v8, 0x1

    .line 15
    if-lez v6, :cond_0

    .line 16
    .line 17
    move v6, v8

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v6, 0x0

    .line 20
    :goto_0
    invoke-static {v6}, Lf9/a;->a(Z)V

    .line 21
    .line 22
    .line 23
    if-lt v1, v8, :cond_1

    .line 24
    .line 25
    move v6, v8

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    const/4 v6, 0x0

    .line 28
    :goto_1
    invoke-static {v6}, Lf9/a;->a(Z)V

    .line 29
    .line 30
    .line 31
    if-lt v2, v8, :cond_2

    .line 32
    .line 33
    move v6, v8

    .line 34
    goto :goto_2

    .line 35
    :cond_2
    const/4 v6, 0x0

    .line 36
    :goto_2
    invoke-static {v6}, Lf9/a;->a(Z)V

    .line 37
    .line 38
    .line 39
    cmpl-float v6, v3, v5

    .line 40
    .line 41
    if-lez v6, :cond_3

    .line 42
    .line 43
    const/high16 v6, 0x43340000    # 180.0f

    .line 44
    .line 45
    cmpg-float v6, v3, v6

    .line 46
    .line 47
    if-gtz v6, :cond_3

    .line 48
    .line 49
    move v6, v8

    .line 50
    goto :goto_3

    .line 51
    :cond_3
    const/4 v6, 0x0

    .line 52
    :goto_3
    invoke-static {v6}, Lf9/a;->a(Z)V

    .line 53
    .line 54
    .line 55
    cmpl-float v5, v4, v5

    .line 56
    .line 57
    if-lez v5, :cond_4

    .line 58
    .line 59
    const/high16 v5, 0x43b40000    # 360.0f

    .line 60
    .line 61
    cmpg-float v5, v4, v5

    .line 62
    .line 63
    if-gtz v5, :cond_4

    .line 64
    .line 65
    move v5, v8

    .line 66
    goto :goto_4

    .line 67
    :cond_4
    const/4 v5, 0x0

    .line 68
    :goto_4
    invoke-static {v5}, Lf9/a;->a(Z)V

    .line 69
    .line 70
    .line 71
    float-to-double v5, v3

    .line 72
    invoke-static {v5, v6}, Ljava/lang/Math;->toRadians(D)D

    .line 73
    .line 74
    .line 75
    move-result-wide v5

    .line 76
    double-to-float v3, v5

    .line 77
    float-to-double v4, v4

    .line 78
    invoke-static {v4, v5}, Ljava/lang/Math;->toRadians(D)D

    .line 79
    .line 80
    .line 81
    move-result-wide v4

    .line 82
    double-to-float v4, v4

    .line 83
    int-to-float v5, v1

    .line 84
    div-float v5, v3, v5

    .line 85
    .line 86
    int-to-float v6, v2

    .line 87
    div-float v6, v4, v6

    .line 88
    .line 89
    add-int/lit8 v9, v2, 0x1

    .line 90
    .line 91
    mul-int/lit8 v10, v9, 0x2

    .line 92
    .line 93
    const/4 v11, 0x2

    .line 94
    add-int/2addr v10, v11

    .line 95
    mul-int/2addr v10, v1

    .line 96
    mul-int/lit8 v12, v10, 0x3

    .line 97
    .line 98
    new-array v12, v12, [F

    .line 99
    .line 100
    mul-int/2addr v10, v11

    .line 101
    new-array v10, v10, [F

    .line 102
    .line 103
    const/4 v13, 0x0

    .line 104
    const/4 v14, 0x0

    .line 105
    const/4 v15, 0x0

    .line 106
    :goto_5
    if-ge v13, v1, :cond_b

    .line 107
    .line 108
    int-to-float v7, v13

    .line 109
    mul-float/2addr v7, v5

    .line 110
    const/high16 v16, 0x40000000    # 2.0f

    .line 111
    .line 112
    div-float v17, v3, v16

    .line 113
    .line 114
    sub-float v7, v7, v17

    .line 115
    .line 116
    add-int/lit8 v8, v13, 0x1

    .line 117
    .line 118
    int-to-float v11, v8

    .line 119
    mul-float/2addr v11, v5

    .line 120
    sub-float v11, v11, v17

    .line 121
    .line 122
    const/4 v1, 0x0

    .line 123
    :goto_6
    if-ge v1, v9, :cond_a

    .line 124
    .line 125
    move/from16 p4, v7

    .line 126
    .line 127
    move/from16 v17, v8

    .line 128
    .line 129
    const/4 v7, 0x0

    .line 130
    const/4 v8, 0x2

    .line 131
    :goto_7
    if-ge v7, v8, :cond_9

    .line 132
    .line 133
    if-nez v7, :cond_5

    .line 134
    .line 135
    move/from16 v8, p4

    .line 136
    .line 137
    move/from16 v18, v9

    .line 138
    .line 139
    goto :goto_8

    .line 140
    :cond_5
    move/from16 v18, v9

    .line 141
    .line 142
    move v8, v11

    .line 143
    :goto_8
    int-to-float v9, v1

    .line 144
    mul-float/2addr v9, v6

    .line 145
    const v19, 0x40490fdb    # (float)Math.PI

    .line 146
    .line 147
    .line 148
    add-float v19, v9, v19

    .line 149
    .line 150
    div-float v20, v4, v16

    .line 151
    .line 152
    move/from16 v21, v6

    .line 153
    .line 154
    sub-float v6, v19, v20

    .line 155
    .line 156
    add-int/lit8 v19, v14, 0x1

    .line 157
    .line 158
    move/from16 v20, v1

    .line 159
    .line 160
    float-to-double v1, v0

    .line 161
    move/from16 v22, v5

    .line 162
    .line 163
    float-to-double v5, v6

    .line 164
    invoke-static {v5, v6}, Ljava/lang/Math;->sin(D)D

    .line 165
    .line 166
    .line 167
    move-result-wide v23

    .line 168
    mul-double v23, v23, v1

    .line 169
    .line 170
    move/from16 v25, v7

    .line 171
    .line 172
    float-to-double v7, v8

    .line 173
    invoke-static {v7, v8}, Ljava/lang/Math;->cos(D)D

    .line 174
    .line 175
    .line 176
    move-result-wide v26

    .line 177
    move-object/from16 v28, v10

    .line 178
    .line 179
    move/from16 v29, v11

    .line 180
    .line 181
    mul-double v10, v23, v26

    .line 182
    .line 183
    double-to-float v10, v10

    .line 184
    neg-float v10, v10

    .line 185
    aput v10, v12, v14

    .line 186
    .line 187
    add-int/lit8 v10, v19, 0x1

    .line 188
    .line 189
    invoke-static {v7, v8}, Ljava/lang/Math;->sin(D)D

    .line 190
    .line 191
    .line 192
    move-result-wide v23

    .line 193
    move v11, v13

    .line 194
    mul-double v13, v1, v23

    .line 195
    .line 196
    double-to-float v13, v13

    .line 197
    aput v13, v12, v19

    .line 198
    .line 199
    add-int/lit8 v13, v10, 0x1

    .line 200
    .line 201
    invoke-static {v5, v6}, Ljava/lang/Math;->cos(D)D

    .line 202
    .line 203
    .line 204
    move-result-wide v5

    .line 205
    mul-double/2addr v1, v5

    .line 206
    invoke-static {v7, v8}, Ljava/lang/Math;->cos(D)D

    .line 207
    .line 208
    .line 209
    move-result-wide v5

    .line 210
    mul-double/2addr v1, v5

    .line 211
    double-to-float v1, v1

    .line 212
    aput v1, v12, v10

    .line 213
    .line 214
    add-int/lit8 v1, v15, 0x1

    .line 215
    .line 216
    div-float/2addr v9, v4

    .line 217
    aput v9, v28, v15

    .line 218
    .line 219
    add-int/lit8 v2, v1, 0x1

    .line 220
    .line 221
    add-int v5, v11, v25

    .line 222
    .line 223
    int-to-float v5, v5

    .line 224
    mul-float v5, v5, v22

    .line 225
    .line 226
    div-float/2addr v5, v3

    .line 227
    aput v5, v28, v1

    .line 228
    .line 229
    if-nez v20, :cond_7

    .line 230
    .line 231
    if-eqz v25, :cond_6

    .line 232
    .line 233
    goto :goto_9

    .line 234
    :cond_6
    move/from16 v1, p2

    .line 235
    .line 236
    move/from16 v5, v20

    .line 237
    .line 238
    move/from16 v6, v25

    .line 239
    .line 240
    goto :goto_a

    .line 241
    :cond_7
    :goto_9
    move/from16 v1, p2

    .line 242
    .line 243
    move/from16 v5, v20

    .line 244
    .line 245
    move/from16 v6, v25

    .line 246
    .line 247
    if-ne v5, v1, :cond_8

    .line 248
    .line 249
    const/4 v7, 0x1

    .line 250
    if-ne v6, v7, :cond_8

    .line 251
    .line 252
    :goto_a
    add-int/lit8 v7, v13, -0x3

    .line 253
    .line 254
    const/4 v8, 0x3

    .line 255
    invoke-static {v12, v7, v12, v13, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 256
    .line 257
    .line 258
    add-int/lit8 v13, v13, 0x3

    .line 259
    .line 260
    add-int/lit8 v7, v2, -0x2

    .line 261
    .line 262
    move-object/from16 v8, v28

    .line 263
    .line 264
    const/4 v9, 0x2

    .line 265
    invoke-static {v8, v7, v8, v2, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 266
    .line 267
    .line 268
    add-int/lit8 v2, v2, 0x2

    .line 269
    .line 270
    goto :goto_b

    .line 271
    :cond_8
    move-object/from16 v8, v28

    .line 272
    .line 273
    const/4 v9, 0x2

    .line 274
    :goto_b
    move v15, v2

    .line 275
    move v14, v13

    .line 276
    add-int/lit8 v7, v6, 0x1

    .line 277
    .line 278
    move v2, v1

    .line 279
    move v1, v5

    .line 280
    move-object v10, v8

    .line 281
    move v8, v9

    .line 282
    move v13, v11

    .line 283
    move/from16 v9, v18

    .line 284
    .line 285
    move/from16 v6, v21

    .line 286
    .line 287
    move/from16 v5, v22

    .line 288
    .line 289
    move/from16 v11, v29

    .line 290
    .line 291
    goto/16 :goto_7

    .line 292
    .line 293
    :cond_9
    move/from16 v22, v5

    .line 294
    .line 295
    move/from16 v21, v6

    .line 296
    .line 297
    move/from16 v18, v9

    .line 298
    .line 299
    move/from16 v29, v11

    .line 300
    .line 301
    move v11, v13

    .line 302
    move v5, v1

    .line 303
    move v1, v2

    .line 304
    move v9, v8

    .line 305
    move-object v8, v10

    .line 306
    add-int/lit8 v2, v5, 0x1

    .line 307
    .line 308
    move/from16 v7, p4

    .line 309
    .line 310
    move/from16 v8, v17

    .line 311
    .line 312
    move/from16 v9, v18

    .line 313
    .line 314
    move/from16 v5, v22

    .line 315
    .line 316
    move/from16 v11, v29

    .line 317
    .line 318
    move/from16 v30, v2

    .line 319
    .line 320
    move v2, v1

    .line 321
    move/from16 v1, v30

    .line 322
    .line 323
    goto/16 :goto_6

    .line 324
    .line 325
    :cond_a
    move/from16 v17, v8

    .line 326
    .line 327
    move/from16 v1, p1

    .line 328
    .line 329
    move/from16 v13, v17

    .line 330
    .line 331
    const/4 v8, 0x1

    .line 332
    const/4 v11, 0x2

    .line 333
    goto/16 :goto_5

    .line 334
    .line 335
    :cond_b
    move-object v8, v10

    .line 336
    new-instance v0, Lh9/d$b;

    .line 337
    .line 338
    const/4 v1, 0x0

    .line 339
    const/4 v2, 0x1

    .line 340
    invoke-direct {v0, v1, v12, v8, v2}, Lh9/d$b;-><init>(I[F[FI)V

    .line 341
    .line 342
    .line 343
    new-instance v3, Lh9/d;

    .line 344
    .line 345
    new-instance v4, Lh9/d$a;

    .line 346
    .line 347
    new-array v2, v2, [Lh9/d$b;

    .line 348
    .line 349
    aput-object v0, v2, v1

    .line 350
    .line 351
    invoke-direct {v4, v2}, Lh9/d$a;-><init>([Lh9/d$b;)V

    .line 352
    .line 353
    .line 354
    move/from16 v0, p5

    .line 355
    .line 356
    invoke-direct {v3, v4, v0}, Lh9/d;-><init>(Lh9/d$a;I)V

    .line 357
    .line 358
    .line 359
    return-object v3
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
.end method

.method public static b(I)Lh9/d;
    .locals 6

    const/high16 v0, 0x42480000    # 50.0f

    const/16 v1, 0x24

    const/16 v2, 0x48

    const/high16 v3, 0x43340000    # 180.0f

    const/high16 v4, 0x43b40000    # 360.0f

    move v5, p0

    invoke-static/range {v0 .. v5}, Lh9/d;->a(FIIFFI)Lh9/d;

    move-result-object p0

    return-object p0
.end method
