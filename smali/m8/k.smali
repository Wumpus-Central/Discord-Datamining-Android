.class public final Lm8/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh8/r;
.implements Lm8/q$b;
.implements Ln8/k$b;


# instance fields
.field private A:I

.field private B:Lcom/google/android/exoplayer2/source/TrackGroupArray;

.field private C:[Lm8/q;

.field private D:[Lm8/q;

.field private E:[[I

.field private F:I

.field private G:Lh8/p0;

.field private final k:Lm8/h;

.field private final l:Ln8/k;

.field private final m:Lm8/g;

.field private final n:Ld9/x;

.field private final o:Lj7/x;

.field private final p:Lj7/v$a;

.field private final q:Lcom/google/android/exoplayer2/upstream/g;

.field private final r:Lh8/b0$a;

.field private final s:Ld9/b;

.field private final t:Ljava/util/IdentityHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/IdentityHashMap<",
            "Lh8/o0;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final u:Lm8/t;

.field private final v:Lh8/h;

.field private final w:Z

.field private final x:I

.field private final y:Z

.field private z:Lh8/r$a;


# direct methods
.method public constructor <init>(Lm8/h;Ln8/k;Lm8/g;Ld9/x;Lj7/x;Lj7/v$a;Lcom/google/android/exoplayer2/upstream/g;Lh8/b0$a;Ld9/b;Lh8/h;ZIZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lm8/k;->k:Lm8/h;

    .line 5
    .line 6
    iput-object p2, p0, Lm8/k;->l:Ln8/k;

    .line 7
    .line 8
    iput-object p3, p0, Lm8/k;->m:Lm8/g;

    .line 9
    .line 10
    iput-object p4, p0, Lm8/k;->n:Ld9/x;

    .line 11
    .line 12
    iput-object p5, p0, Lm8/k;->o:Lj7/x;

    .line 13
    .line 14
    iput-object p6, p0, Lm8/k;->p:Lj7/v$a;

    .line 15
    .line 16
    iput-object p7, p0, Lm8/k;->q:Lcom/google/android/exoplayer2/upstream/g;

    .line 17
    .line 18
    iput-object p8, p0, Lm8/k;->r:Lh8/b0$a;

    .line 19
    .line 20
    iput-object p9, p0, Lm8/k;->s:Ld9/b;

    .line 21
    .line 22
    iput-object p10, p0, Lm8/k;->v:Lh8/h;

    .line 23
    .line 24
    iput-boolean p11, p0, Lm8/k;->w:Z

    .line 25
    .line 26
    iput p12, p0, Lm8/k;->x:I

    .line 27
    .line 28
    iput-boolean p13, p0, Lm8/k;->y:Z

    .line 29
    .line 30
    const/4 p1, 0x0

    .line 31
    new-array p2, p1, [Lh8/p0;

    .line 32
    .line 33
    invoke-interface {p10, p2}, Lh8/h;->a([Lh8/p0;)Lh8/p0;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    iput-object p2, p0, Lm8/k;->G:Lh8/p0;

    .line 38
    .line 39
    new-instance p2, Ljava/util/IdentityHashMap;

    .line 40
    .line 41
    invoke-direct {p2}, Ljava/util/IdentityHashMap;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object p2, p0, Lm8/k;->t:Ljava/util/IdentityHashMap;

    .line 45
    .line 46
    new-instance p2, Lm8/t;

    .line 47
    .line 48
    invoke-direct {p2}, Lm8/t;-><init>()V

    .line 49
    .line 50
    .line 51
    iput-object p2, p0, Lm8/k;->u:Lm8/t;

    .line 52
    .line 53
    new-array p2, p1, [Lm8/q;

    .line 54
    .line 55
    iput-object p2, p0, Lm8/k;->C:[Lm8/q;

    .line 56
    .line 57
    new-array p2, p1, [Lm8/q;

    .line 58
    .line 59
    iput-object p2, p0, Lm8/k;->D:[Lm8/q;

    .line 60
    .line 61
    new-array p1, p1, [[I

    .line 62
    .line 63
    iput-object p1, p0, Lm8/k;->E:[[I

    .line 64
    .line 65
    return-void
.end method

.method private q(JLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Map;)V
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/List<",
            "Ln8/f$a;",
            ">;",
            "Ljava/util/List<",
            "Lm8/q;",
            ">;",
            "Ljava/util/List<",
            "[I>;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lj7/l;",
            ">;)V"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p3

    .line 2
    .line 3
    new-instance v1, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-interface/range {p3 .. p3}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 10
    .line 11
    .line 12
    new-instance v2, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-interface/range {p3 .. p3}, Ljava/util/List;->size()I

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 19
    .line 20
    .line 21
    new-instance v3, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-interface/range {p3 .. p3}, Ljava/util/List;->size()I

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 28
    .line 29
    .line 30
    new-instance v4, Ljava/util/HashSet;

    .line 31
    .line 32
    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 33
    .line 34
    .line 35
    const/4 v5, 0x0

    .line 36
    move v6, v5

    .line 37
    :goto_0
    invoke-interface/range {p3 .. p3}, Ljava/util/List;->size()I

    .line 38
    .line 39
    .line 40
    move-result v7

    .line 41
    if-ge v6, v7, :cond_5

    .line 42
    .line 43
    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v7

    .line 47
    check-cast v7, Ln8/f$a;

    .line 48
    .line 49
    iget-object v7, v7, Ln8/f$a;->d:Ljava/lang/String;

    .line 50
    .line 51
    invoke-virtual {v4, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v8

    .line 55
    if-nez v8, :cond_0

    .line 56
    .line 57
    move-object/from16 v12, p0

    .line 58
    .line 59
    move-object/from16 v9, p4

    .line 60
    .line 61
    move-object/from16 v11, p5

    .line 62
    .line 63
    goto/16 :goto_3

    .line 64
    .line 65
    :cond_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 72
    .line 73
    .line 74
    const/4 v8, 0x1

    .line 75
    move v9, v5

    .line 76
    move v10, v8

    .line 77
    :goto_1
    invoke-interface/range {p3 .. p3}, Ljava/util/List;->size()I

    .line 78
    .line 79
    .line 80
    move-result v11

    .line 81
    if-ge v9, v11, :cond_3

    .line 82
    .line 83
    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v11

    .line 87
    check-cast v11, Ln8/f$a;

    .line 88
    .line 89
    iget-object v11, v11, Ln8/f$a;->d:Ljava/lang/String;

    .line 90
    .line 91
    invoke-static {v7, v11}, Lf9/q0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v11

    .line 95
    if-eqz v11, :cond_2

    .line 96
    .line 97
    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v11

    .line 101
    check-cast v11, Ln8/f$a;

    .line 102
    .line 103
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 104
    .line 105
    .line 106
    move-result-object v12

    .line 107
    invoke-virtual {v3, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    iget-object v12, v11, Ln8/f$a;->a:Landroid/net/Uri;

    .line 111
    .line 112
    invoke-virtual {v1, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    iget-object v12, v11, Ln8/f$a;->b:Ld7/k;

    .line 116
    .line 117
    invoke-virtual {v2, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    iget-object v11, v11, Ln8/f$a;->b:Ld7/k;

    .line 121
    .line 122
    iget-object v11, v11, Ld7/k;->s:Ljava/lang/String;

    .line 123
    .line 124
    invoke-static {v11, v8}, Lf9/q0;->J(Ljava/lang/String;I)I

    .line 125
    .line 126
    .line 127
    move-result v11

    .line 128
    if-ne v11, v8, :cond_1

    .line 129
    .line 130
    move v11, v8

    .line 131
    goto :goto_2

    .line 132
    :cond_1
    move v11, v5

    .line 133
    :goto_2
    and-int/2addr v10, v11

    .line 134
    :cond_2
    add-int/lit8 v9, v9, 0x1

    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_3
    const/4 v12, 0x1

    .line 138
    new-array v7, v5, [Landroid/net/Uri;

    .line 139
    .line 140
    invoke-static {v7}, Lf9/q0;->k([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v7

    .line 144
    check-cast v7, [Landroid/net/Uri;

    .line 145
    .line 146
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v7

    .line 150
    move-object v13, v7

    .line 151
    check-cast v13, [Landroid/net/Uri;

    .line 152
    .line 153
    new-array v7, v5, [Ld7/k;

    .line 154
    .line 155
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v7

    .line 159
    move-object v14, v7

    .line 160
    check-cast v14, [Ld7/k;

    .line 161
    .line 162
    const/4 v15, 0x0

    .line 163
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 164
    .line 165
    .line 166
    move-result-object v16

    .line 167
    move-object/from16 v11, p0

    .line 168
    .line 169
    move-object/from16 v17, p6

    .line 170
    .line 171
    move-wide/from16 v18, p1

    .line 172
    .line 173
    invoke-direct/range {v11 .. v19}, Lm8/k;->w(I[Landroid/net/Uri;[Ld7/k;Ld7/k;Ljava/util/List;Ljava/util/Map;J)Lm8/q;

    .line 174
    .line 175
    .line 176
    move-result-object v7

    .line 177
    invoke-static {v3}, Lec/d;->j(Ljava/util/Collection;)[I

    .line 178
    .line 179
    .line 180
    move-result-object v9

    .line 181
    move-object/from16 v11, p5

    .line 182
    .line 183
    invoke-interface {v11, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    move-object/from16 v9, p4

    .line 187
    .line 188
    invoke-interface {v9, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    move-object/from16 v12, p0

    .line 192
    .line 193
    iget-boolean v13, v12, Lm8/k;->w:Z

    .line 194
    .line 195
    if-eqz v13, :cond_4

    .line 196
    .line 197
    if-eqz v10, :cond_4

    .line 198
    .line 199
    new-array v10, v5, [Ld7/k;

    .line 200
    .line 201
    invoke-virtual {v2, v10}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v10

    .line 205
    check-cast v10, [Ld7/k;

    .line 206
    .line 207
    new-array v8, v8, [Lh8/u0;

    .line 208
    .line 209
    new-instance v13, Lh8/u0;

    .line 210
    .line 211
    invoke-direct {v13, v10}, Lh8/u0;-><init>([Ld7/k;)V

    .line 212
    .line 213
    .line 214
    aput-object v13, v8, v5

    .line 215
    .line 216
    new-array v10, v5, [I

    .line 217
    .line 218
    invoke-virtual {v7, v8, v5, v10}, Lm8/q;->c0([Lh8/u0;I[I)V

    .line 219
    .line 220
    .line 221
    :cond_4
    :goto_3
    add-int/lit8 v6, v6, 0x1

    .line 222
    .line 223
    goto/16 :goto_0

    .line 224
    .line 225
    :cond_5
    move-object/from16 v12, p0

    .line 226
    .line 227
    return-void
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

.method private t(Ln8/f;JLjava/util/List;Ljava/util/List;Ljava/util/Map;)V
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln8/f;",
            "J",
            "Ljava/util/List<",
            "Lm8/q;",
            ">;",
            "Ljava/util/List<",
            "[I>;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lj7/l;",
            ">;)V"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    iget-object v1, v0, Ln8/f;->e:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    new-array v2, v1, [I

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    move v4, v3

    .line 13
    move v5, v4

    .line 14
    move v6, v5

    .line 15
    :goto_0
    iget-object v7, v0, Ln8/f;->e:Ljava/util/List;

    .line 16
    .line 17
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 18
    .line 19
    .line 20
    move-result v7

    .line 21
    const/4 v8, 0x2

    .line 22
    const/4 v9, 0x1

    .line 23
    if-ge v4, v7, :cond_3

    .line 24
    .line 25
    iget-object v7, v0, Ln8/f;->e:Ljava/util/List;

    .line 26
    .line 27
    invoke-interface {v7, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v7

    .line 31
    check-cast v7, Ln8/f$b;

    .line 32
    .line 33
    iget-object v7, v7, Ln8/f$b;->b:Ld7/k;

    .line 34
    .line 35
    iget v10, v7, Ld7/k;->B:I

    .line 36
    .line 37
    if-gtz v10, :cond_2

    .line 38
    .line 39
    iget-object v10, v7, Ld7/k;->s:Ljava/lang/String;

    .line 40
    .line 41
    invoke-static {v10, v8}, Lf9/q0;->K(Ljava/lang/String;I)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v10

    .line 45
    if-eqz v10, :cond_0

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_0
    iget-object v7, v7, Ld7/k;->s:Ljava/lang/String;

    .line 49
    .line 50
    invoke-static {v7, v9}, Lf9/q0;->K(Ljava/lang/String;I)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v7

    .line 54
    if-eqz v7, :cond_1

    .line 55
    .line 56
    aput v9, v2, v4

    .line 57
    .line 58
    add-int/lit8 v6, v6, 0x1

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_1
    const/4 v7, -0x1

    .line 62
    aput v7, v2, v4

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_2
    :goto_1
    aput v8, v2, v4

    .line 66
    .line 67
    add-int/lit8 v5, v5, 0x1

    .line 68
    .line 69
    :goto_2
    add-int/lit8 v4, v4, 0x1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_3
    if-lez v5, :cond_4

    .line 73
    .line 74
    move v1, v5

    .line 75
    move v4, v9

    .line 76
    move v5, v3

    .line 77
    goto :goto_3

    .line 78
    :cond_4
    if-ge v6, v1, :cond_5

    .line 79
    .line 80
    sub-int/2addr v1, v6

    .line 81
    move v4, v3

    .line 82
    move v5, v9

    .line 83
    goto :goto_3

    .line 84
    :cond_5
    move v4, v3

    .line 85
    move v5, v4

    .line 86
    :goto_3
    new-array v12, v1, [Landroid/net/Uri;

    .line 87
    .line 88
    new-array v6, v1, [Ld7/k;

    .line 89
    .line 90
    new-array v7, v1, [I

    .line 91
    .line 92
    move v10, v3

    .line 93
    move v11, v10

    .line 94
    :goto_4
    iget-object v13, v0, Ln8/f;->e:Ljava/util/List;

    .line 95
    .line 96
    invoke-interface {v13}, Ljava/util/List;->size()I

    .line 97
    .line 98
    .line 99
    move-result v13

    .line 100
    if-ge v10, v13, :cond_9

    .line 101
    .line 102
    if-eqz v4, :cond_6

    .line 103
    .line 104
    aget v13, v2, v10

    .line 105
    .line 106
    if-ne v13, v8, :cond_8

    .line 107
    .line 108
    :cond_6
    if-eqz v5, :cond_7

    .line 109
    .line 110
    aget v13, v2, v10

    .line 111
    .line 112
    if-eq v13, v9, :cond_8

    .line 113
    .line 114
    :cond_7
    iget-object v13, v0, Ln8/f;->e:Ljava/util/List;

    .line 115
    .line 116
    invoke-interface {v13, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v13

    .line 120
    check-cast v13, Ln8/f$b;

    .line 121
    .line 122
    iget-object v14, v13, Ln8/f$b;->a:Landroid/net/Uri;

    .line 123
    .line 124
    aput-object v14, v12, v11

    .line 125
    .line 126
    iget-object v13, v13, Ln8/f$b;->b:Ld7/k;

    .line 127
    .line 128
    aput-object v13, v6, v11

    .line 129
    .line 130
    add-int/lit8 v13, v11, 0x1

    .line 131
    .line 132
    aput v10, v7, v11

    .line 133
    .line 134
    move v11, v13

    .line 135
    :cond_8
    add-int/lit8 v10, v10, 0x1

    .line 136
    .line 137
    goto :goto_4

    .line 138
    :cond_9
    aget-object v2, v6, v3

    .line 139
    .line 140
    iget-object v2, v2, Ld7/k;->s:Ljava/lang/String;

    .line 141
    .line 142
    invoke-static {v2, v8}, Lf9/q0;->J(Ljava/lang/String;I)I

    .line 143
    .line 144
    .line 145
    move-result v4

    .line 146
    invoke-static {v2, v9}, Lf9/q0;->J(Ljava/lang/String;I)I

    .line 147
    .line 148
    .line 149
    move-result v2

    .line 150
    if-gt v2, v9, :cond_a

    .line 151
    .line 152
    if-gt v4, v9, :cond_a

    .line 153
    .line 154
    add-int v5, v2, v4

    .line 155
    .line 156
    if-lez v5, :cond_a

    .line 157
    .line 158
    move v5, v9

    .line 159
    goto :goto_5

    .line 160
    :cond_a
    move v5, v3

    .line 161
    :goto_5
    const/4 v11, 0x0

    .line 162
    iget-object v14, v0, Ln8/f;->j:Ld7/k;

    .line 163
    .line 164
    iget-object v15, v0, Ln8/f;->k:Ljava/util/List;

    .line 165
    .line 166
    move-object/from16 v10, p0

    .line 167
    .line 168
    move-object v13, v6

    .line 169
    move-object/from16 v16, p6

    .line 170
    .line 171
    move-wide/from16 v17, p2

    .line 172
    .line 173
    invoke-direct/range {v10 .. v18}, Lm8/k;->w(I[Landroid/net/Uri;[Ld7/k;Ld7/k;Ljava/util/List;Ljava/util/Map;J)Lm8/q;

    .line 174
    .line 175
    .line 176
    move-result-object v8

    .line 177
    move-object/from16 v10, p4

    .line 178
    .line 179
    invoke-interface {v10, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    move-object/from16 v10, p5

    .line 183
    .line 184
    invoke-interface {v10, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    move-object/from16 v7, p0

    .line 188
    .line 189
    iget-boolean v10, v7, Lm8/k;->w:Z

    .line 190
    .line 191
    if-eqz v10, :cond_11

    .line 192
    .line 193
    if-eqz v5, :cond_11

    .line 194
    .line 195
    new-instance v5, Ljava/util/ArrayList;

    .line 196
    .line 197
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 198
    .line 199
    .line 200
    if-lez v4, :cond_e

    .line 201
    .line 202
    new-array v4, v1, [Ld7/k;

    .line 203
    .line 204
    move v10, v3

    .line 205
    :goto_6
    if-ge v10, v1, :cond_b

    .line 206
    .line 207
    aget-object v11, v6, v10

    .line 208
    .line 209
    invoke-static {v11}, Lm8/k;->z(Ld7/k;)Ld7/k;

    .line 210
    .line 211
    .line 212
    move-result-object v11

    .line 213
    aput-object v11, v4, v10

    .line 214
    .line 215
    add-int/lit8 v10, v10, 0x1

    .line 216
    .line 217
    goto :goto_6

    .line 218
    :cond_b
    new-instance v1, Lh8/u0;

    .line 219
    .line 220
    invoke-direct {v1, v4}, Lh8/u0;-><init>([Ld7/k;)V

    .line 221
    .line 222
    .line 223
    invoke-interface {v5, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    if-lez v2, :cond_d

    .line 227
    .line 228
    iget-object v1, v0, Ln8/f;->j:Ld7/k;

    .line 229
    .line 230
    if-nez v1, :cond_c

    .line 231
    .line 232
    iget-object v1, v0, Ln8/f;->g:Ljava/util/List;

    .line 233
    .line 234
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 235
    .line 236
    .line 237
    move-result v1

    .line 238
    if-eqz v1, :cond_d

    .line 239
    .line 240
    :cond_c
    new-instance v1, Lh8/u0;

    .line 241
    .line 242
    new-array v2, v9, [Ld7/k;

    .line 243
    .line 244
    aget-object v4, v6, v3

    .line 245
    .line 246
    iget-object v6, v0, Ln8/f;->j:Ld7/k;

    .line 247
    .line 248
    invoke-static {v4, v6, v3}, Lm8/k;->x(Ld7/k;Ld7/k;Z)Ld7/k;

    .line 249
    .line 250
    .line 251
    move-result-object v4

    .line 252
    aput-object v4, v2, v3

    .line 253
    .line 254
    invoke-direct {v1, v2}, Lh8/u0;-><init>([Ld7/k;)V

    .line 255
    .line 256
    .line 257
    invoke-interface {v5, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 258
    .line 259
    .line 260
    :cond_d
    iget-object v0, v0, Ln8/f;->k:Ljava/util/List;

    .line 261
    .line 262
    if-eqz v0, :cond_10

    .line 263
    .line 264
    move v1, v3

    .line 265
    :goto_7
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 266
    .line 267
    .line 268
    move-result v2

    .line 269
    if-ge v1, v2, :cond_10

    .line 270
    .line 271
    new-instance v2, Lh8/u0;

    .line 272
    .line 273
    new-array v4, v9, [Ld7/k;

    .line 274
    .line 275
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v6

    .line 279
    check-cast v6, Ld7/k;

    .line 280
    .line 281
    aput-object v6, v4, v3

    .line 282
    .line 283
    invoke-direct {v2, v4}, Lh8/u0;-><init>([Ld7/k;)V

    .line 284
    .line 285
    .line 286
    invoke-interface {v5, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 287
    .line 288
    .line 289
    add-int/lit8 v1, v1, 0x1

    .line 290
    .line 291
    goto :goto_7

    .line 292
    :cond_e
    new-array v2, v1, [Ld7/k;

    .line 293
    .line 294
    move v4, v3

    .line 295
    :goto_8
    if-ge v4, v1, :cond_f

    .line 296
    .line 297
    aget-object v10, v6, v4

    .line 298
    .line 299
    iget-object v11, v0, Ln8/f;->j:Ld7/k;

    .line 300
    .line 301
    invoke-static {v10, v11, v9}, Lm8/k;->x(Ld7/k;Ld7/k;Z)Ld7/k;

    .line 302
    .line 303
    .line 304
    move-result-object v10

    .line 305
    aput-object v10, v2, v4

    .line 306
    .line 307
    add-int/lit8 v4, v4, 0x1

    .line 308
    .line 309
    goto :goto_8

    .line 310
    :cond_f
    new-instance v0, Lh8/u0;

    .line 311
    .line 312
    invoke-direct {v0, v2}, Lh8/u0;-><init>([Ld7/k;)V

    .line 313
    .line 314
    .line 315
    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 316
    .line 317
    .line 318
    :cond_10
    new-instance v0, Lh8/u0;

    .line 319
    .line 320
    new-array v1, v9, [Ld7/k;

    .line 321
    .line 322
    new-instance v2, Ld7/k$b;

    .line 323
    .line 324
    invoke-direct {v2}, Ld7/k$b;-><init>()V

    .line 325
    .line 326
    .line 327
    const-string v4, "ID3"

    .line 328
    .line 329
    invoke-virtual {v2, v4}, Ld7/k$b;->S(Ljava/lang/String;)Ld7/k$b;

    .line 330
    .line 331
    .line 332
    move-result-object v2

    .line 333
    const-string v4, "application/id3"

    .line 334
    .line 335
    invoke-virtual {v2, v4}, Ld7/k$b;->e0(Ljava/lang/String;)Ld7/k$b;

    .line 336
    .line 337
    .line 338
    move-result-object v2

    .line 339
    invoke-virtual {v2}, Ld7/k$b;->E()Ld7/k;

    .line 340
    .line 341
    .line 342
    move-result-object v2

    .line 343
    aput-object v2, v1, v3

    .line 344
    .line 345
    invoke-direct {v0, v1}, Lh8/u0;-><init>([Ld7/k;)V

    .line 346
    .line 347
    .line 348
    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 349
    .line 350
    .line 351
    new-array v1, v3, [Lh8/u0;

    .line 352
    .line 353
    invoke-interface {v5, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    move-result-object v1

    .line 357
    check-cast v1, [Lh8/u0;

    .line 358
    .line 359
    new-array v2, v9, [I

    .line 360
    .line 361
    invoke-interface {v5, v0}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 362
    .line 363
    .line 364
    move-result v0

    .line 365
    aput v0, v2, v3

    .line 366
    .line 367
    invoke-virtual {v8, v1, v3, v2}, Lm8/q;->c0([Lh8/u0;I[I)V

    .line 368
    .line 369
    .line 370
    :cond_11
    return-void
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

.method private v(J)V
    .locals 18

    .line 1
    move-object/from16 v9, p0

    .line 2
    .line 3
    iget-object v0, v9, Lm8/k;->l:Ln8/k;

    .line 4
    .line 5
    invoke-interface {v0}, Ln8/k;->g()Ln8/f;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lf9/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    move-object v1, v0

    .line 14
    check-cast v1, Ln8/f;

    .line 15
    .line 16
    iget-boolean v0, v9, Lm8/k;->y:Z

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    iget-object v0, v1, Ln8/f;->m:Ljava/util/List;

    .line 21
    .line 22
    invoke-static {v0}, Lm8/k;->y(Ljava/util/List;)Ljava/util/Map;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    :goto_0
    move-object v10, v0

    .line 32
    iget-object v0, v1, Ln8/f;->e:Ljava/util/List;

    .line 33
    .line 34
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    const/4 v11, 0x1

    .line 39
    xor-int/2addr v0, v11

    .line 40
    iget-object v7, v1, Ln8/f;->g:Ljava/util/List;

    .line 41
    .line 42
    iget-object v12, v1, Ln8/f;->h:Ljava/util/List;

    .line 43
    .line 44
    const/4 v13, 0x0

    .line 45
    iput v13, v9, Lm8/k;->A:I

    .line 46
    .line 47
    new-instance v14, Ljava/util/ArrayList;

    .line 48
    .line 49
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 50
    .line 51
    .line 52
    new-instance v15, Ljava/util/ArrayList;

    .line 53
    .line 54
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 55
    .line 56
    .line 57
    if-eqz v0, :cond_1

    .line 58
    .line 59
    move-object/from16 v0, p0

    .line 60
    .line 61
    move-wide/from16 v2, p1

    .line 62
    .line 63
    move-object v4, v14

    .line 64
    move-object v5, v15

    .line 65
    move-object v6, v10

    .line 66
    invoke-direct/range {v0 .. v6}, Lm8/k;->t(Ln8/f;JLjava/util/List;Ljava/util/List;Ljava/util/Map;)V

    .line 67
    .line 68
    .line 69
    :cond_1
    move-object/from16 v0, p0

    .line 70
    .line 71
    move-wide/from16 v1, p1

    .line 72
    .line 73
    move-object v3, v7

    .line 74
    move-object v4, v14

    .line 75
    move-object v5, v15

    .line 76
    move-object v6, v10

    .line 77
    invoke-direct/range {v0 .. v6}, Lm8/k;->q(JLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Map;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    iput v0, v9, Lm8/k;->F:I

    .line 85
    .line 86
    move v7, v13

    .line 87
    :goto_1
    invoke-interface {v12}, Ljava/util/List;->size()I

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    if-ge v7, v0, :cond_2

    .line 92
    .line 93
    invoke-interface {v12, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    move-object v8, v0

    .line 98
    check-cast v8, Ln8/f$a;

    .line 99
    .line 100
    const/4 v1, 0x3

    .line 101
    new-array v2, v11, [Landroid/net/Uri;

    .line 102
    .line 103
    iget-object v0, v8, Ln8/f$a;->a:Landroid/net/Uri;

    .line 104
    .line 105
    aput-object v0, v2, v13

    .line 106
    .line 107
    new-array v3, v11, [Ld7/k;

    .line 108
    .line 109
    iget-object v0, v8, Ln8/f$a;->b:Ld7/k;

    .line 110
    .line 111
    aput-object v0, v3, v13

    .line 112
    .line 113
    const/4 v4, 0x0

    .line 114
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 115
    .line 116
    .line 117
    move-result-object v5

    .line 118
    move-object/from16 v0, p0

    .line 119
    .line 120
    move-object v6, v10

    .line 121
    move/from16 v16, v7

    .line 122
    .line 123
    move-object/from16 v17, v8

    .line 124
    .line 125
    move-wide/from16 v7, p1

    .line 126
    .line 127
    invoke-direct/range {v0 .. v8}, Lm8/k;->w(I[Landroid/net/Uri;[Ld7/k;Ld7/k;Ljava/util/List;Ljava/util/Map;J)Lm8/q;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    new-array v1, v11, [I

    .line 132
    .line 133
    aput v16, v1, v13

    .line 134
    .line 135
    invoke-virtual {v15, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    invoke-virtual {v14, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    new-array v1, v11, [Lh8/u0;

    .line 142
    .line 143
    new-instance v2, Lh8/u0;

    .line 144
    .line 145
    new-array v3, v11, [Ld7/k;

    .line 146
    .line 147
    move-object/from16 v4, v17

    .line 148
    .line 149
    iget-object v4, v4, Ln8/f$a;->b:Ld7/k;

    .line 150
    .line 151
    aput-object v4, v3, v13

    .line 152
    .line 153
    invoke-direct {v2, v3}, Lh8/u0;-><init>([Ld7/k;)V

    .line 154
    .line 155
    .line 156
    aput-object v2, v1, v13

    .line 157
    .line 158
    new-array v2, v13, [I

    .line 159
    .line 160
    invoke-virtual {v0, v1, v13, v2}, Lm8/q;->c0([Lh8/u0;I[I)V

    .line 161
    .line 162
    .line 163
    add-int/lit8 v7, v16, 0x1

    .line 164
    .line 165
    goto :goto_1

    .line 166
    :cond_2
    new-array v0, v13, [Lm8/q;

    .line 167
    .line 168
    invoke-virtual {v14, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    check-cast v0, [Lm8/q;

    .line 173
    .line 174
    iput-object v0, v9, Lm8/k;->C:[Lm8/q;

    .line 175
    .line 176
    new-array v0, v13, [[I

    .line 177
    .line 178
    invoke-virtual {v15, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    check-cast v0, [[I

    .line 183
    .line 184
    iput-object v0, v9, Lm8/k;->E:[[I

    .line 185
    .line 186
    iget-object v0, v9, Lm8/k;->C:[Lm8/q;

    .line 187
    .line 188
    array-length v1, v0

    .line 189
    iput v1, v9, Lm8/k;->A:I

    .line 190
    .line 191
    aget-object v0, v0, v13

    .line 192
    .line 193
    invoke-virtual {v0, v11}, Lm8/q;->l0(Z)V

    .line 194
    .line 195
    .line 196
    iget-object v0, v9, Lm8/k;->C:[Lm8/q;

    .line 197
    .line 198
    array-length v1, v0

    .line 199
    :goto_2
    if-ge v13, v1, :cond_3

    .line 200
    .line 201
    aget-object v2, v0, v13

    .line 202
    .line 203
    invoke-virtual {v2}, Lm8/q;->B()V

    .line 204
    .line 205
    .line 206
    add-int/lit8 v13, v13, 0x1

    .line 207
    .line 208
    goto :goto_2

    .line 209
    :cond_3
    iget-object v0, v9, Lm8/k;->C:[Lm8/q;

    .line 210
    .line 211
    iput-object v0, v9, Lm8/k;->D:[Lm8/q;

    .line 212
    .line 213
    return-void
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
.end method

.method private w(I[Landroid/net/Uri;[Ld7/k;Ld7/k;Ljava/util/List;Ljava/util/Map;J)Lm8/q;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I[",
            "Landroid/net/Uri;",
            "[",
            "Ld7/k;",
            "Ld7/k;",
            "Ljava/util/List<",
            "Ld7/k;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lj7/l;",
            ">;J)",
            "Lm8/q;"
        }
    .end annotation

    .line 1
    move-object/from16 v14, p0

    .line 2
    .line 3
    new-instance v9, Lm8/f;

    .line 4
    .line 5
    iget-object v1, v14, Lm8/k;->k:Lm8/h;

    .line 6
    .line 7
    iget-object v2, v14, Lm8/k;->l:Ln8/k;

    .line 8
    .line 9
    iget-object v5, v14, Lm8/k;->m:Lm8/g;

    .line 10
    .line 11
    iget-object v6, v14, Lm8/k;->n:Ld9/x;

    .line 12
    .line 13
    iget-object v7, v14, Lm8/k;->u:Lm8/t;

    .line 14
    .line 15
    move-object v0, v9

    .line 16
    move-object/from16 v3, p2

    .line 17
    .line 18
    move-object/from16 v4, p3

    .line 19
    .line 20
    move-object/from16 v8, p5

    .line 21
    .line 22
    invoke-direct/range {v0 .. v8}, Lm8/f;-><init>(Lm8/h;Ln8/k;[Landroid/net/Uri;[Ld7/k;Lm8/g;Ld9/x;Lm8/t;Ljava/util/List;)V

    .line 23
    .line 24
    .line 25
    new-instance v15, Lm8/q;

    .line 26
    .line 27
    iget-object v5, v14, Lm8/k;->s:Ld9/b;

    .line 28
    .line 29
    iget-object v10, v14, Lm8/k;->o:Lj7/x;

    .line 30
    .line 31
    iget-object v11, v14, Lm8/k;->p:Lj7/v$a;

    .line 32
    .line 33
    iget-object v12, v14, Lm8/k;->q:Lcom/google/android/exoplayer2/upstream/g;

    .line 34
    .line 35
    iget-object v13, v14, Lm8/k;->r:Lh8/b0$a;

    .line 36
    .line 37
    iget v8, v14, Lm8/k;->x:I

    .line 38
    .line 39
    move-object v0, v15

    .line 40
    move/from16 v1, p1

    .line 41
    .line 42
    move-object/from16 v2, p0

    .line 43
    .line 44
    move-object v3, v9

    .line 45
    move-object/from16 v4, p6

    .line 46
    .line 47
    move-wide/from16 v6, p7

    .line 48
    .line 49
    move/from16 v16, v8

    .line 50
    .line 51
    move-object/from16 v8, p4

    .line 52
    .line 53
    move-object v9, v10

    .line 54
    move-object v10, v11

    .line 55
    move-object v11, v12

    .line 56
    move-object v12, v13

    .line 57
    move/from16 v13, v16

    .line 58
    .line 59
    invoke-direct/range {v0 .. v13}, Lm8/q;-><init>(ILm8/q$b;Lm8/f;Ljava/util/Map;Ld9/b;JLd7/k;Lj7/x;Lj7/v$a;Lcom/google/android/exoplayer2/upstream/g;Lh8/b0$a;I)V

    .line 60
    .line 61
    .line 62
    return-object v15
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
.end method

.method private static x(Ld7/k;Ld7/k;Z)Ld7/k;
    .locals 10

    .line 1
    const/4 v0, -0x1

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    iget-object v1, p1, Ld7/k;->s:Ljava/lang/String;

    .line 5
    .line 6
    iget-object v2, p1, Ld7/k;->t:Ly7/a;

    .line 7
    .line 8
    iget v3, p1, Ld7/k;->I:I

    .line 9
    .line 10
    iget v4, p1, Ld7/k;->n:I

    .line 11
    .line 12
    iget v5, p1, Ld7/k;->o:I

    .line 13
    .line 14
    iget-object v6, p1, Ld7/k;->m:Ljava/lang/String;

    .line 15
    .line 16
    iget-object p1, p1, Ld7/k;->l:Ljava/lang/String;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-object p1, p0, Ld7/k;->s:Ljava/lang/String;

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    invoke-static {p1, v1}, Lf9/q0;->K(Ljava/lang/String;I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    iget-object v2, p0, Ld7/k;->t:Ly7/a;

    .line 27
    .line 28
    if-eqz p2, :cond_1

    .line 29
    .line 30
    iget v3, p0, Ld7/k;->I:I

    .line 31
    .line 32
    iget v4, p0, Ld7/k;->n:I

    .line 33
    .line 34
    iget v5, p0, Ld7/k;->o:I

    .line 35
    .line 36
    iget-object v6, p0, Ld7/k;->m:Ljava/lang/String;

    .line 37
    .line 38
    iget-object p1, p0, Ld7/k;->l:Ljava/lang/String;

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    const/4 v4, 0x0

    .line 42
    const/4 v6, 0x0

    .line 43
    move v3, v0

    .line 44
    move v5, v4

    .line 45
    move-object p1, v6

    .line 46
    :goto_0
    invoke-static {v1}, Lf9/u;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v7

    .line 50
    if-eqz p2, :cond_2

    .line 51
    .line 52
    iget v8, p0, Ld7/k;->p:I

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_2
    move v8, v0

    .line 56
    :goto_1
    if-eqz p2, :cond_3

    .line 57
    .line 58
    iget v0, p0, Ld7/k;->q:I

    .line 59
    .line 60
    :cond_3
    new-instance p2, Ld7/k$b;

    .line 61
    .line 62
    invoke-direct {p2}, Ld7/k$b;-><init>()V

    .line 63
    .line 64
    .line 65
    iget-object v9, p0, Ld7/k;->k:Ljava/lang/String;

    .line 66
    .line 67
    invoke-virtual {p2, v9}, Ld7/k$b;->S(Ljava/lang/String;)Ld7/k$b;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    invoke-virtual {p2, p1}, Ld7/k$b;->U(Ljava/lang/String;)Ld7/k$b;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    iget-object p0, p0, Ld7/k;->u:Ljava/lang/String;

    .line 76
    .line 77
    invoke-virtual {p1, p0}, Ld7/k$b;->K(Ljava/lang/String;)Ld7/k$b;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    invoke-virtual {p0, v7}, Ld7/k$b;->e0(Ljava/lang/String;)Ld7/k$b;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-virtual {p0, v1}, Ld7/k$b;->I(Ljava/lang/String;)Ld7/k$b;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    invoke-virtual {p0, v2}, Ld7/k$b;->X(Ly7/a;)Ld7/k$b;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    invoke-virtual {p0, v8}, Ld7/k$b;->G(I)Ld7/k$b;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    invoke-virtual {p0, v0}, Ld7/k$b;->Z(I)Ld7/k$b;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    invoke-virtual {p0, v3}, Ld7/k$b;->H(I)Ld7/k$b;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    invoke-virtual {p0, v4}, Ld7/k$b;->g0(I)Ld7/k$b;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    invoke-virtual {p0, v5}, Ld7/k$b;->c0(I)Ld7/k$b;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    invoke-virtual {p0, v6}, Ld7/k$b;->V(Ljava/lang/String;)Ld7/k$b;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    invoke-virtual {p0}, Ld7/k$b;->E()Ld7/k;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    return-object p0
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
.end method

.method private static y(Ljava/util/List;)Ljava/util/Map;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lj7/l;",
            ">;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lj7/l;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/util/HashMap;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 9
    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    if-ge v2, v3, :cond_2

    .line 17
    .line 18
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    check-cast v3, Lj7/l;

    .line 23
    .line 24
    iget-object v4, v3, Lj7/l;->m:Ljava/lang/String;

    .line 25
    .line 26
    add-int/lit8 v2, v2, 0x1

    .line 27
    .line 28
    move v5, v2

    .line 29
    :goto_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 30
    .line 31
    .line 32
    move-result v6

    .line 33
    if-ge v5, v6, :cond_1

    .line 34
    .line 35
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    check-cast v6, Lj7/l;

    .line 40
    .line 41
    iget-object v7, v6, Lj7/l;->m:Ljava/lang/String;

    .line 42
    .line 43
    invoke-static {v7, v4}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 44
    .line 45
    .line 46
    move-result v7

    .line 47
    if-eqz v7, :cond_0

    .line 48
    .line 49
    invoke-virtual {v3, v6}, Lj7/l;->P(Lj7/l;)Lj7/l;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_0
    add-int/lit8 v5, v5, 0x1

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    invoke-virtual {v1, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    return-object v1
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
.end method

.method private static z(Ld7/k;)Ld7/k;
    .locals 4

    .line 1
    iget-object v0, p0, Ld7/k;->s:Ljava/lang/String;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-static {v0, v1}, Lf9/q0;->K(Ljava/lang/String;I)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-static {v0}, Lf9/u;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    new-instance v2, Ld7/k$b;

    .line 13
    .line 14
    invoke-direct {v2}, Ld7/k$b;-><init>()V

    .line 15
    .line 16
    .line 17
    iget-object v3, p0, Ld7/k;->k:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {v2, v3}, Ld7/k$b;->S(Ljava/lang/String;)Ld7/k$b;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    iget-object v3, p0, Ld7/k;->l:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {v2, v3}, Ld7/k$b;->U(Ljava/lang/String;)Ld7/k$b;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    iget-object v3, p0, Ld7/k;->u:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {v2, v3}, Ld7/k$b;->K(Ljava/lang/String;)Ld7/k$b;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {v2, v1}, Ld7/k$b;->e0(Ljava/lang/String;)Ld7/k$b;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v1, v0}, Ld7/k$b;->I(Ljava/lang/String;)Ld7/k$b;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iget-object v1, p0, Ld7/k;->t:Ly7/a;

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ld7/k$b;->X(Ly7/a;)Ld7/k$b;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    iget v1, p0, Ld7/k;->p:I

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Ld7/k$b;->G(I)Ld7/k$b;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    iget v1, p0, Ld7/k;->q:I

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ld7/k$b;->Z(I)Ld7/k$b;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    iget v1, p0, Ld7/k;->A:I

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Ld7/k$b;->j0(I)Ld7/k$b;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    iget v1, p0, Ld7/k;->B:I

    .line 68
    .line 69
    invoke-virtual {v0, v1}, Ld7/k$b;->Q(I)Ld7/k$b;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    iget v1, p0, Ld7/k;->C:F

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ld7/k$b;->P(F)Ld7/k$b;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    iget v1, p0, Ld7/k;->n:I

    .line 80
    .line 81
    invoke-virtual {v0, v1}, Ld7/k$b;->g0(I)Ld7/k$b;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    iget p0, p0, Ld7/k;->o:I

    .line 86
    .line 87
    invoke-virtual {v0, p0}, Ld7/k$b;->c0(I)Ld7/k$b;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-virtual {p0}, Ld7/k$b;->E()Ld7/k;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    return-object p0
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
.end method


# virtual methods
.method public A(Lm8/q;)V
    .locals 0

    iget-object p1, p0, Lm8/k;->z:Lh8/r$a;

    invoke-interface {p1, p0}, Lh8/p0$a;->i(Lh8/p0;)V

    return-void
.end method

.method public B()V
    .locals 4

    .line 1
    iget-object v0, p0, Lm8/k;->l:Ln8/k;

    .line 2
    .line 3
    invoke-interface {v0, p0}, Ln8/k;->j(Ln8/k$b;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lm8/k;->C:[Lm8/q;

    .line 7
    .line 8
    array-length v1, v0

    .line 9
    const/4 v2, 0x0

    .line 10
    :goto_0
    if-ge v2, v1, :cond_0

    .line 11
    .line 12
    aget-object v3, v0, v2

    .line 13
    .line 14
    invoke-virtual {v3}, Lm8/q;->e0()V

    .line 15
    .line 16
    .line 17
    add-int/lit8 v2, v2, 0x1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    iput-object v0, p0, Lm8/k;->z:Lh8/r$a;

    .line 22
    .line 23
    return-void
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
.end method

.method public a()V
    .locals 11

    .line 1
    iget v0, p0, Lm8/k;->A:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, -0x1

    .line 4
    .line 5
    iput v0, p0, Lm8/k;->A:I

    .line 6
    .line 7
    if-lez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object v0, p0, Lm8/k;->C:[Lm8/q;

    .line 11
    .line 12
    array-length v1, v0

    .line 13
    const/4 v2, 0x0

    .line 14
    move v3, v2

    .line 15
    move v4, v3

    .line 16
    :goto_0
    if-ge v3, v1, :cond_1

    .line 17
    .line 18
    aget-object v5, v0, v3

    .line 19
    .line 20
    invoke-virtual {v5}, Lm8/q;->s()Lcom/google/android/exoplayer2/source/TrackGroupArray;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    iget v5, v5, Lcom/google/android/exoplayer2/source/TrackGroupArray;->k:I

    .line 25
    .line 26
    add-int/2addr v4, v5

    .line 27
    add-int/lit8 v3, v3, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    new-array v0, v4, [Lh8/u0;

    .line 31
    .line 32
    iget-object v1, p0, Lm8/k;->C:[Lm8/q;

    .line 33
    .line 34
    array-length v3, v1

    .line 35
    move v4, v2

    .line 36
    move v5, v4

    .line 37
    :goto_1
    if-ge v4, v3, :cond_3

    .line 38
    .line 39
    aget-object v6, v1, v4

    .line 40
    .line 41
    invoke-virtual {v6}, Lm8/q;->s()Lcom/google/android/exoplayer2/source/TrackGroupArray;

    .line 42
    .line 43
    .line 44
    move-result-object v7

    .line 45
    iget v7, v7, Lcom/google/android/exoplayer2/source/TrackGroupArray;->k:I

    .line 46
    .line 47
    move v8, v2

    .line 48
    :goto_2
    if-ge v8, v7, :cond_2

    .line 49
    .line 50
    add-int/lit8 v9, v5, 0x1

    .line 51
    .line 52
    invoke-virtual {v6}, Lm8/q;->s()Lcom/google/android/exoplayer2/source/TrackGroupArray;

    .line 53
    .line 54
    .line 55
    move-result-object v10

    .line 56
    invoke-virtual {v10, v8}, Lcom/google/android/exoplayer2/source/TrackGroupArray;->b(I)Lh8/u0;

    .line 57
    .line 58
    .line 59
    move-result-object v10

    .line 60
    aput-object v10, v0, v5

    .line 61
    .line 62
    add-int/lit8 v8, v8, 0x1

    .line 63
    .line 64
    move v5, v9

    .line 65
    goto :goto_2

    .line 66
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_3
    new-instance v1, Lcom/google/android/exoplayer2/source/TrackGroupArray;

    .line 70
    .line 71
    invoke-direct {v1, v0}, Lcom/google/android/exoplayer2/source/TrackGroupArray;-><init>([Lh8/u0;)V

    .line 72
    .line 73
    .line 74
    iput-object v1, p0, Lm8/k;->B:Lcom/google/android/exoplayer2/source/TrackGroupArray;

    .line 75
    .line 76
    iget-object v0, p0, Lm8/k;->z:Lh8/r$a;

    .line 77
    .line 78
    invoke-interface {v0, p0}, Lh8/r$a;->l(Lh8/r;)V

    .line 79
    .line 80
    .line 81
    return-void
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
.end method

.method public b()J
    .locals 2

    iget-object v0, p0, Lm8/k;->G:Lh8/p0;

    invoke-interface {v0}, Lh8/p0;->b()J

    move-result-wide v0

    return-wide v0
.end method

.method public c(JLd7/w;)J
    .locals 0

    return-wide p1
.end method

.method public d()V
    .locals 4

    .line 1
    iget-object v0, p0, Lm8/k;->C:[Lm8/q;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    if-ge v2, v1, :cond_0

    .line 6
    .line 7
    aget-object v3, v0, v2

    .line 8
    .line 9
    invoke-virtual {v3}, Lm8/q;->a0()V

    .line 10
    .line 11
    .line 12
    add-int/lit8 v2, v2, 0x1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-object v0, p0, Lm8/k;->z:Lh8/r$a;

    .line 16
    .line 17
    invoke-interface {v0, p0}, Lh8/p0$a;->i(Lh8/p0;)V

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
.end method

.method public e(J)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lm8/k;->B:Lcom/google/android/exoplayer2/source/TrackGroupArray;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object p1, p0, Lm8/k;->C:[Lm8/q;

    .line 6
    .line 7
    array-length p2, p1

    .line 8
    const/4 v0, 0x0

    .line 9
    move v1, v0

    .line 10
    :goto_0
    if-ge v1, p2, :cond_0

    .line 11
    .line 12
    aget-object v2, p1, v1

    .line 13
    .line 14
    invoke-virtual {v2}, Lm8/q;->B()V

    .line 15
    .line 16
    .line 17
    add-int/lit8 v1, v1, 0x1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    return v0

    .line 21
    :cond_1
    iget-object v0, p0, Lm8/k;->G:Lh8/p0;

    .line 22
    .line 23
    invoke-interface {v0, p1, p2}, Lh8/p0;->e(J)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    return p1
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
.end method

.method public f()Z
    .locals 1

    iget-object v0, p0, Lm8/k;->G:Lh8/p0;

    invoke-interface {v0}, Lh8/p0;->f()Z

    move-result v0

    return v0
.end method

.method public g()J
    .locals 2

    iget-object v0, p0, Lm8/k;->G:Lh8/p0;

    invoke-interface {v0}, Lh8/p0;->g()J

    move-result-wide v0

    return-wide v0
.end method

.method public h(J)V
    .locals 1

    iget-object v0, p0, Lm8/k;->G:Lh8/p0;

    invoke-interface {v0, p1, p2}, Lh8/p0;->h(J)V

    return-void
.end method

.method public bridge synthetic i(Lh8/p0;)V
    .locals 0

    check-cast p1, Lm8/q;

    invoke-virtual {p0, p1}, Lm8/k;->A(Lm8/q;)V

    return-void
.end method

.method public j(Landroid/net/Uri;J)Z
    .locals 5

    .line 1
    iget-object v0, p0, Lm8/k;->C:[Lm8/q;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    :goto_0
    if-ge v3, v1, :cond_0

    .line 7
    .line 8
    aget-object v4, v0, v3

    .line 9
    .line 10
    invoke-virtual {v4, p1, p2, p3}, Lm8/q;->Z(Landroid/net/Uri;J)Z

    .line 11
    .line 12
    .line 13
    move-result v4

    .line 14
    and-int/2addr v2, v4

    .line 15
    add-int/lit8 v3, v3, 0x1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget-object p1, p0, Lm8/k;->z:Lh8/r$a;

    .line 19
    .line 20
    invoke-interface {p1, p0}, Lh8/p0$a;->i(Lh8/p0;)V

    .line 21
    .line 22
    .line 23
    return v2
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
.end method

.method public k(Lh8/r$a;J)V
    .locals 0

    .line 1
    iput-object p1, p0, Lm8/k;->z:Lh8/r$a;

    .line 2
    .line 3
    iget-object p1, p0, Lm8/k;->l:Ln8/k;

    .line 4
    .line 5
    invoke-interface {p1, p0}, Ln8/k;->b(Ln8/k$b;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, p2, p3}, Lm8/k;->v(J)V

    .line 9
    .line 10
    .line 11
    return-void
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
.end method

.method public m(Landroid/net/Uri;)V
    .locals 1

    iget-object v0, p0, Lm8/k;->l:Ln8/k;

    invoke-interface {v0, p1}, Ln8/k;->i(Landroid/net/Uri;)V

    return-void
.end method

.method public n()V
    .locals 4

    .line 1
    iget-object v0, p0, Lm8/k;->C:[Lm8/q;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    if-ge v2, v1, :cond_0

    .line 6
    .line 7
    aget-object v3, v0, v2

    .line 8
    .line 9
    invoke-virtual {v3}, Lm8/q;->n()V

    .line 10
    .line 11
    .line 12
    add-int/lit8 v2, v2, 0x1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    return-void
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
.end method

.method public o([La9/h;[Z[Lh8/o0;[ZJ)J
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    array-length v3, v1

    .line 8
    new-array v3, v3, [I

    .line 9
    .line 10
    array-length v4, v1

    .line 11
    new-array v4, v4, [I

    .line 12
    .line 13
    const/4 v6, 0x0

    .line 14
    :goto_0
    array-length v7, v1

    .line 15
    if-ge v6, v7, :cond_3

    .line 16
    .line 17
    aget-object v7, v2, v6

    .line 18
    .line 19
    const/4 v8, -0x1

    .line 20
    if-nez v7, :cond_0

    .line 21
    .line 22
    move v7, v8

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    iget-object v9, v0, Lm8/k;->t:Ljava/util/IdentityHashMap;

    .line 25
    .line 26
    invoke-virtual {v9, v7}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v7

    .line 30
    check-cast v7, Ljava/lang/Integer;

    .line 31
    .line 32
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 33
    .line 34
    .line 35
    move-result v7

    .line 36
    :goto_1
    aput v7, v3, v6

    .line 37
    .line 38
    aput v8, v4, v6

    .line 39
    .line 40
    aget-object v7, v1, v6

    .line 41
    .line 42
    if-eqz v7, :cond_2

    .line 43
    .line 44
    invoke-interface {v7}, La9/k;->c()Lh8/u0;

    .line 45
    .line 46
    .line 47
    move-result-object v7

    .line 48
    const/4 v9, 0x0

    .line 49
    :goto_2
    iget-object v10, v0, Lm8/k;->C:[Lm8/q;

    .line 50
    .line 51
    array-length v11, v10

    .line 52
    if-ge v9, v11, :cond_2

    .line 53
    .line 54
    aget-object v10, v10, v9

    .line 55
    .line 56
    invoke-virtual {v10}, Lm8/q;->s()Lcom/google/android/exoplayer2/source/TrackGroupArray;

    .line 57
    .line 58
    .line 59
    move-result-object v10

    .line 60
    invoke-virtual {v10, v7}, Lcom/google/android/exoplayer2/source/TrackGroupArray;->d(Lh8/u0;)I

    .line 61
    .line 62
    .line 63
    move-result v10

    .line 64
    if-eq v10, v8, :cond_1

    .line 65
    .line 66
    aput v9, v4, v6

    .line 67
    .line 68
    goto :goto_3

    .line 69
    :cond_1
    add-int/lit8 v9, v9, 0x1

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_2
    :goto_3
    add-int/lit8 v6, v6, 0x1

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_3
    iget-object v6, v0, Lm8/k;->t:Ljava/util/IdentityHashMap;

    .line 76
    .line 77
    invoke-virtual {v6}, Ljava/util/IdentityHashMap;->clear()V

    .line 78
    .line 79
    .line 80
    array-length v6, v1

    .line 81
    new-array v7, v6, [Lh8/o0;

    .line 82
    .line 83
    array-length v8, v1

    .line 84
    new-array v8, v8, [Lh8/o0;

    .line 85
    .line 86
    array-length v9, v1

    .line 87
    new-array v14, v9, [La9/h;

    .line 88
    .line 89
    iget-object v9, v0, Lm8/k;->C:[Lm8/q;

    .line 90
    .line 91
    array-length v9, v9

    .line 92
    new-array v15, v9, [Lm8/q;

    .line 93
    .line 94
    const/4 v12, 0x0

    .line 95
    const/4 v13, 0x0

    .line 96
    const/16 v17, 0x0

    .line 97
    .line 98
    :goto_4
    iget-object v9, v0, Lm8/k;->C:[Lm8/q;

    .line 99
    .line 100
    array-length v9, v9

    .line 101
    if-ge v13, v9, :cond_10

    .line 102
    .line 103
    const/4 v9, 0x0

    .line 104
    :goto_5
    array-length v10, v1

    .line 105
    if-ge v9, v10, :cond_6

    .line 106
    .line 107
    aget v10, v3, v9

    .line 108
    .line 109
    const/4 v11, 0x0

    .line 110
    if-ne v10, v13, :cond_4

    .line 111
    .line 112
    aget-object v10, v2, v9

    .line 113
    .line 114
    goto :goto_6

    .line 115
    :cond_4
    move-object v10, v11

    .line 116
    :goto_6
    aput-object v10, v8, v9

    .line 117
    .line 118
    aget v10, v4, v9

    .line 119
    .line 120
    if-ne v10, v13, :cond_5

    .line 121
    .line 122
    aget-object v11, v1, v9

    .line 123
    .line 124
    :cond_5
    aput-object v11, v14, v9

    .line 125
    .line 126
    add-int/lit8 v9, v9, 0x1

    .line 127
    .line 128
    goto :goto_5

    .line 129
    :cond_6
    iget-object v9, v0, Lm8/k;->C:[Lm8/q;

    .line 130
    .line 131
    aget-object v11, v9, v13

    .line 132
    .line 133
    move-object v9, v11

    .line 134
    move-object v10, v14

    .line 135
    move-object v5, v11

    .line 136
    move-object/from16 v11, p2

    .line 137
    .line 138
    move v2, v12

    .line 139
    move-object v12, v8

    .line 140
    move/from16 v18, v6

    .line 141
    .line 142
    move v6, v13

    .line 143
    move-object/from16 v13, p4

    .line 144
    .line 145
    move-object/from16 v19, v14

    .line 146
    .line 147
    move-object/from16 v20, v15

    .line 148
    .line 149
    move-wide/from16 v14, p5

    .line 150
    .line 151
    move/from16 v16, v17

    .line 152
    .line 153
    invoke-virtual/range {v9 .. v16}, Lm8/q;->i0([La9/h;[Z[Lh8/o0;[ZJZ)Z

    .line 154
    .line 155
    .line 156
    move-result v9

    .line 157
    const/4 v10, 0x0

    .line 158
    const/4 v11, 0x0

    .line 159
    :goto_7
    array-length v12, v1

    .line 160
    const/4 v13, 0x1

    .line 161
    if-ge v10, v12, :cond_a

    .line 162
    .line 163
    aget-object v12, v8, v10

    .line 164
    .line 165
    aget v14, v4, v10

    .line 166
    .line 167
    if-ne v14, v6, :cond_7

    .line 168
    .line 169
    invoke-static {v12}, Lf9/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    aput-object v12, v7, v10

    .line 173
    .line 174
    iget-object v11, v0, Lm8/k;->t:Ljava/util/IdentityHashMap;

    .line 175
    .line 176
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 177
    .line 178
    .line 179
    move-result-object v14

    .line 180
    invoke-virtual {v11, v12, v14}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move v11, v13

    .line 184
    goto :goto_9

    .line 185
    :cond_7
    aget v14, v3, v10

    .line 186
    .line 187
    if-ne v14, v6, :cond_9

    .line 188
    .line 189
    if-nez v12, :cond_8

    .line 190
    .line 191
    goto :goto_8

    .line 192
    :cond_8
    const/4 v13, 0x0

    .line 193
    :goto_8
    invoke-static {v13}, Lf9/a;->f(Z)V

    .line 194
    .line 195
    .line 196
    :cond_9
    :goto_9
    add-int/lit8 v10, v10, 0x1

    .line 197
    .line 198
    goto :goto_7

    .line 199
    :cond_a
    move-object/from16 v10, v20

    .line 200
    .line 201
    if-eqz v11, :cond_e

    .line 202
    .line 203
    aput-object v5, v10, v2

    .line 204
    .line 205
    add-int/lit8 v12, v2, 0x1

    .line 206
    .line 207
    if-nez v2, :cond_c

    .line 208
    .line 209
    invoke-virtual {v5, v13}, Lm8/q;->l0(Z)V

    .line 210
    .line 211
    .line 212
    if-nez v9, :cond_b

    .line 213
    .line 214
    iget-object v2, v0, Lm8/k;->D:[Lm8/q;

    .line 215
    .line 216
    array-length v9, v2

    .line 217
    if-eqz v9, :cond_b

    .line 218
    .line 219
    const/4 v9, 0x0

    .line 220
    aget-object v2, v2, v9

    .line 221
    .line 222
    if-eq v5, v2, :cond_f

    .line 223
    .line 224
    :cond_b
    iget-object v2, v0, Lm8/k;->u:Lm8/t;

    .line 225
    .line 226
    invoke-virtual {v2}, Lm8/t;->b()V

    .line 227
    .line 228
    .line 229
    move/from16 v17, v13

    .line 230
    .line 231
    goto :goto_b

    .line 232
    :cond_c
    iget v2, v0, Lm8/k;->F:I

    .line 233
    .line 234
    if-ge v6, v2, :cond_d

    .line 235
    .line 236
    goto :goto_a

    .line 237
    :cond_d
    const/4 v13, 0x0

    .line 238
    :goto_a
    invoke-virtual {v5, v13}, Lm8/q;->l0(Z)V

    .line 239
    .line 240
    .line 241
    goto :goto_b

    .line 242
    :cond_e
    move v12, v2

    .line 243
    :cond_f
    :goto_b
    add-int/lit8 v13, v6, 0x1

    .line 244
    .line 245
    move-object/from16 v2, p3

    .line 246
    .line 247
    move-object v15, v10

    .line 248
    move/from16 v6, v18

    .line 249
    .line 250
    move-object/from16 v14, v19

    .line 251
    .line 252
    goto/16 :goto_4

    .line 253
    .line 254
    :cond_10
    move v5, v6

    .line 255
    move-object v10, v15

    .line 256
    const/4 v6, 0x0

    .line 257
    invoke-static {v7, v6, v2, v6, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 258
    .line 259
    .line 260
    invoke-static {v10, v12}, Lf9/q0;->B0([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v1

    .line 264
    check-cast v1, [Lm8/q;

    .line 265
    .line 266
    iput-object v1, v0, Lm8/k;->D:[Lm8/q;

    .line 267
    .line 268
    iget-object v2, v0, Lm8/k;->v:Lh8/h;

    .line 269
    .line 270
    invoke-interface {v2, v1}, Lh8/h;->a([Lh8/p0;)Lh8/p0;

    .line 271
    .line 272
    .line 273
    move-result-object v1

    .line 274
    iput-object v1, v0, Lm8/k;->G:Lh8/p0;

    .line 275
    .line 276
    return-wide p5
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

.method public p(J)J
    .locals 4

    .line 1
    iget-object v0, p0, Lm8/k;->D:[Lm8/q;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    if-lez v1, :cond_1

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    aget-object v0, v0, v1

    .line 8
    .line 9
    invoke-virtual {v0, p1, p2, v1}, Lm8/q;->h0(JZ)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x1

    .line 14
    :goto_0
    iget-object v2, p0, Lm8/k;->D:[Lm8/q;

    .line 15
    .line 16
    array-length v3, v2

    .line 17
    if-ge v1, v3, :cond_0

    .line 18
    .line 19
    aget-object v2, v2, v1

    .line 20
    .line 21
    invoke-virtual {v2, p1, p2, v0}, Lm8/q;->h0(JZ)Z

    .line 22
    .line 23
    .line 24
    add-int/lit8 v1, v1, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    if-eqz v0, :cond_1

    .line 28
    .line 29
    iget-object v0, p0, Lm8/k;->u:Lm8/t;

    .line 30
    .line 31
    invoke-virtual {v0}, Lm8/t;->b()V

    .line 32
    .line 33
    .line 34
    :cond_1
    return-wide p1
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
.end method

.method public r()J
    .locals 2

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    return-wide v0
.end method

.method public s()Lcom/google/android/exoplayer2/source/TrackGroupArray;
    .locals 1

    iget-object v0, p0, Lm8/k;->B:Lcom/google/android/exoplayer2/source/TrackGroupArray;

    invoke-static {v0}, Lf9/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/exoplayer2/source/TrackGroupArray;

    return-object v0
.end method

.method public u(JZ)V
    .locals 4

    .line 1
    iget-object v0, p0, Lm8/k;->D:[Lm8/q;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    if-ge v2, v1, :cond_0

    .line 6
    .line 7
    aget-object v3, v0, v2

    .line 8
    .line 9
    invoke-virtual {v3, p1, p2, p3}, Lm8/q;->u(JZ)V

    .line 10
    .line 11
    .line 12
    add-int/lit8 v2, v2, 0x1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    return-void
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
.end method
