.class public final Lah/g;
.super Ldi/n1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lah/g$a;
    }
.end annotation


# static fields
.field public static final e:Lah/g$a;

.field private static final f:Lah/a;

.field private static final g:Lah/a;


# instance fields
.field private final c:Lah/f;

.field private final d:Ldi/j1;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Lah/g$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lah/g$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lah/g;->e:Lah/g$a;

    .line 8
    .line 9
    sget-object v0, Ldi/r1;->l:Ldi/r1;

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    const/4 v4, 0x1

    .line 13
    const/4 v5, 0x0

    .line 14
    const/4 v6, 0x5

    .line 15
    const/4 v7, 0x0

    .line 16
    move-object v2, v0

    .line 17
    invoke-static/range {v2 .. v7}, Lah/b;->b(Ldi/r1;ZZLmg/f1;ILjava/lang/Object;)Lah/a;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    sget-object v2, Lah/c;->m:Lah/c;

    .line 22
    .line 23
    invoke-virtual {v1, v2}, Lah/a;->l(Lah/c;)Lah/a;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    sput-object v1, Lah/g;->f:Lah/a;

    .line 28
    .line 29
    move-object v2, v0

    .line 30
    invoke-static/range {v2 .. v7}, Lah/b;->b(Ldi/r1;ZZLmg/f1;ILjava/lang/Object;)Lah/a;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    sget-object v1, Lah/c;->l:Lah/c;

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Lah/a;->l(Lah/c;)Lah/a;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    sput-object v0, Lah/g;->g:Lah/a;

    .line 41
    .line 42
    return-void
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

.method public constructor <init>(Ldi/j1;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ldi/n1;-><init>()V

    .line 2
    new-instance v0, Lah/f;

    invoke-direct {v0}, Lah/f;-><init>()V

    iput-object v0, p0, Lah/g;->c:Lah/f;

    if-nez p1, :cond_0

    .line 3
    new-instance p1, Ldi/j1;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {p1, v0, v2, v1, v2}, Ldi/j1;-><init>(Ldi/x;Ldi/i1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_0
    iput-object p1, p0, Lah/g;->d:Ldi/j1;

    return-void
.end method

.method public synthetic constructor <init>(Ldi/j1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    .line 4
    :cond_0
    invoke-direct {p0, p1}, Lah/g;-><init>(Ldi/j1;)V

    return-void
.end method

.method public static final synthetic i(Lah/g;Ldi/o0;Lmg/e;Lah/a;)Lkotlin/Pair;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lah/g;->j(Ldi/o0;Lmg/e;Lah/a;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method private final j(Ldi/o0;Lmg/e;Lah/a;)Lkotlin/Pair;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldi/o0;",
            "Lmg/e;",
            "Lah/a;",
            ")",
            "Lkotlin/Pair<",
            "Ldi/o0;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v10, p3

    .line 8
    .line 9
    invoke-virtual/range {p1 .. p1}, Ldi/g0;->N0()Ldi/g1;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    invoke-interface {v3}, Ldi/g1;->getParameters()Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-eqz v3, :cond_0

    .line 22
    .line 23
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 24
    .line 25
    invoke-static {v1, v2}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    return-object v1

    .line 30
    :cond_0
    invoke-static/range {p1 .. p1}, Ljg/h;->c0(Ldi/g0;)Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    const/4 v4, 0x0

    .line 35
    if-eqz v3, :cond_1

    .line 36
    .line 37
    invoke-virtual/range {p1 .. p1}, Ldi/g0;->L0()Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    check-cast v2, Ldi/k1;

    .line 46
    .line 47
    new-instance v3, Ldi/m1;

    .line 48
    .line 49
    invoke-interface {v2}, Ldi/k1;->a()Ldi/w1;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    invoke-interface {v2}, Ldi/k1;->getType()Ldi/g0;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    const-string v5, "componentTypeProjection.type"

    .line 58
    .line 59
    invoke-static {v2, v5}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-direct {v0, v2, v10}, Lah/g;->k(Ldi/g0;Lah/a;)Ldi/g0;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-direct {v3, v4, v2}, Ldi/m1;-><init>(Ldi/w1;Ldi/g0;)V

    .line 67
    .line 68
    .line 69
    invoke-static {v3}, Lkotlin/collections/h;->d(Ljava/lang/Object;)Ljava/util/List;

    .line 70
    .line 71
    .line 72
    move-result-object v7

    .line 73
    invoke-virtual/range {p1 .. p1}, Ldi/g0;->M0()Ldi/c1;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    invoke-virtual/range {p1 .. p1}, Ldi/g0;->N0()Ldi/g1;

    .line 78
    .line 79
    .line 80
    move-result-object v6

    .line 81
    invoke-virtual/range {p1 .. p1}, Ldi/g0;->O0()Z

    .line 82
    .line 83
    .line 84
    move-result v8

    .line 85
    const/4 v9, 0x0

    .line 86
    const/16 v10, 0x10

    .line 87
    .line 88
    const/4 v11, 0x0

    .line 89
    invoke-static/range {v5 .. v11}, Ldi/h0;->j(Ldi/c1;Ldi/g1;Ljava/util/List;ZLei/g;ILjava/lang/Object;)Ldi/o0;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 94
    .line 95
    invoke-static {v1, v2}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    return-object v1

    .line 100
    :cond_1
    invoke-static/range {p1 .. p1}, Ldi/i0;->a(Ldi/g0;)Z

    .line 101
    .line 102
    .line 103
    move-result v3

    .line 104
    if-eqz v3, :cond_2

    .line 105
    .line 106
    sget-object v2, Lfi/j;->U:Lfi/j;

    .line 107
    .line 108
    const/4 v3, 0x1

    .line 109
    new-array v3, v3, [Ljava/lang/String;

    .line 110
    .line 111
    invoke-virtual/range {p1 .. p1}, Ldi/g0;->N0()Ldi/g1;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    aput-object v1, v3, v4

    .line 120
    .line 121
    invoke-static {v2, v3}, Lfi/k;->d(Lfi/j;[Ljava/lang/String;)Lfi/h;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 126
    .line 127
    invoke-static {v1, v2}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    return-object v1

    .line 132
    :cond_2
    invoke-interface {v2, v0}, Lmg/e;->O(Ldi/n1;)Lwh/h;

    .line 133
    .line 134
    .line 135
    move-result-object v11

    .line 136
    const-string v3, "declaration.getMemberScope(this)"

    .line 137
    .line 138
    invoke-static {v11, v3}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual/range {p1 .. p1}, Ldi/g0;->M0()Ldi/c1;

    .line 142
    .line 143
    .line 144
    move-result-object v12

    .line 145
    invoke-interface/range {p2 .. p2}, Lmg/h;->k()Ldi/g1;

    .line 146
    .line 147
    .line 148
    move-result-object v13

    .line 149
    const-string v3, "declaration.typeConstructor"

    .line 150
    .line 151
    invoke-static {v13, v3}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    invoke-interface/range {p2 .. p2}, Lmg/h;->k()Ldi/g1;

    .line 155
    .line 156
    .line 157
    move-result-object v3

    .line 158
    invoke-interface {v3}, Ldi/g1;->getParameters()Ljava/util/List;

    .line 159
    .line 160
    .line 161
    move-result-object v3

    .line 162
    const-string v4, "declaration.typeConstructor.parameters"

    .line 163
    .line 164
    invoke-static {v3, v4}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    new-instance v14, Ljava/util/ArrayList;

    .line 168
    .line 169
    const/16 v4, 0xa

    .line 170
    .line 171
    invoke-static {v3, v4}, Lkotlin/collections/h;->t(Ljava/lang/Iterable;I)I

    .line 172
    .line 173
    .line 174
    move-result v4

    .line 175
    invoke-direct {v14, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 176
    .line 177
    .line 178
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 179
    .line 180
    .line 181
    move-result-object v15

    .line 182
    :goto_0
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    .line 183
    .line 184
    .line 185
    move-result v3

    .line 186
    if-eqz v3, :cond_3

    .line 187
    .line 188
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v3

    .line 192
    move-object v4, v3

    .line 193
    check-cast v4, Lmg/f1;

    .line 194
    .line 195
    iget-object v3, v0, Lah/g;->c:Lah/f;

    .line 196
    .line 197
    const-string v5, "parameter"

    .line 198
    .line 199
    invoke-static {v4, v5}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    iget-object v6, v0, Lah/g;->d:Ldi/j1;

    .line 203
    .line 204
    const/4 v7, 0x0

    .line 205
    const/16 v8, 0x8

    .line 206
    .line 207
    const/4 v9, 0x0

    .line 208
    move-object/from16 v5, p3

    .line 209
    .line 210
    invoke-static/range {v3 .. v9}, Ldi/x;->b(Ldi/x;Lmg/f1;Ldi/y;Ldi/j1;Ldi/g0;ILjava/lang/Object;)Ldi/k1;

    .line 211
    .line 212
    .line 213
    move-result-object v3

    .line 214
    invoke-interface {v14, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    goto :goto_0

    .line 218
    :cond_3
    invoke-virtual/range {p1 .. p1}, Ldi/g0;->O0()Z

    .line 219
    .line 220
    .line 221
    move-result v5

    .line 222
    new-instance v7, Lah/g$b;

    .line 223
    .line 224
    invoke-direct {v7, v2, v0, v1, v10}, Lah/g$b;-><init>(Lmg/e;Lah/g;Ldi/o0;Lah/a;)V

    .line 225
    .line 226
    .line 227
    move-object v2, v12

    .line 228
    move-object v3, v13

    .line 229
    move-object v4, v14

    .line 230
    move-object v6, v11

    .line 231
    invoke-static/range {v2 .. v7}, Ldi/h0;->l(Ldi/c1;Ldi/g1;Ljava/util/List;ZLwh/h;Lkotlin/jvm/functions/Function1;)Ldi/o0;

    .line 232
    .line 233
    .line 234
    move-result-object v1

    .line 235
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 236
    .line 237
    invoke-static {v1, v2}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 238
    .line 239
    .line 240
    move-result-object v1

    .line 241
    return-object v1
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

.method private final k(Ldi/g0;Lah/a;)Ldi/g0;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ldi/g0;->N0()Ldi/g1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ldi/g1;->q()Lmg/h;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    instance-of v1, v0, Lmg/f1;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    iget-object p1, p0, Lah/g;->d:Ldi/j1;

    .line 14
    .line 15
    check-cast v0, Lmg/f1;

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    invoke-virtual {p2, v1}, Lah/a;->j(Z)Lah/a;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {p1, v0, v1}, Ldi/j1;->c(Lmg/f1;Ldi/y;)Ldi/g0;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-direct {p0, p1, p2}, Lah/g;->k(Ldi/g0;Lah/a;)Ldi/g0;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    goto :goto_1

    .line 31
    :cond_0
    instance-of p2, v0, Lmg/e;

    .line 32
    .line 33
    if-eqz p2, :cond_4

    .line 34
    .line 35
    invoke-static {p1}, Ldi/d0;->d(Ldi/g0;)Ldi/o0;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    invoke-virtual {p2}, Ldi/g0;->N0()Ldi/g1;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    invoke-interface {p2}, Ldi/g1;->q()Lmg/h;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    instance-of v1, p2, Lmg/e;

    .line 48
    .line 49
    if-eqz v1, :cond_3

    .line 50
    .line 51
    invoke-static {p1}, Ldi/d0;->c(Ldi/g0;)Ldi/o0;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    check-cast v0, Lmg/e;

    .line 56
    .line 57
    sget-object v2, Lah/g;->f:Lah/a;

    .line 58
    .line 59
    invoke-direct {p0, v1, v0, v2}, Lah/g;->j(Ldi/o0;Lmg/e;Lah/a;)Lkotlin/Pair;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {v0}, Lkotlin/Pair;->a()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    check-cast v1, Ldi/o0;

    .line 68
    .line 69
    invoke-virtual {v0}, Lkotlin/Pair;->b()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    check-cast v0, Ljava/lang/Boolean;

    .line 74
    .line 75
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    invoke-static {p1}, Ldi/d0;->d(Ldi/g0;)Ldi/o0;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    check-cast p2, Lmg/e;

    .line 84
    .line 85
    sget-object v2, Lah/g;->g:Lah/a;

    .line 86
    .line 87
    invoke-direct {p0, p1, p2, v2}, Lah/g;->j(Ldi/o0;Lmg/e;Lah/a;)Lkotlin/Pair;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-virtual {p1}, Lkotlin/Pair;->a()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p2

    .line 95
    check-cast p2, Ldi/o0;

    .line 96
    .line 97
    invoke-virtual {p1}, Lkotlin/Pair;->b()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    check-cast p1, Ljava/lang/Boolean;

    .line 102
    .line 103
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    if-nez v0, :cond_2

    .line 108
    .line 109
    if-eqz p1, :cond_1

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_1
    invoke-static {v1, p2}, Ldi/h0;->d(Ldi/o0;Ldi/o0;)Ldi/v1;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    goto :goto_1

    .line 117
    :cond_2
    :goto_0
    new-instance p1, Lah/h;

    .line 118
    .line 119
    invoke-direct {p1, v1, p2}, Lah/h;-><init>(Ldi/o0;Ldi/o0;)V

    .line 120
    .line 121
    .line 122
    :goto_1
    return-object p1

    .line 123
    :cond_3
    new-instance p1, Ljava/lang/StringBuilder;

    .line 124
    .line 125
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 126
    .line 127
    .line 128
    const-string v1, "For some reason declaration for upper bound is not a class but \""

    .line 129
    .line 130
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    const-string p2, "\" while for lower it\'s \""

    .line 137
    .line 138
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    const/16 p2, 0x22

    .line 145
    .line 146
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 154
    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    throw p2

    .line 163
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 164
    .line 165
    new-instance p2, Ljava/lang/StringBuilder;

    .line 166
    .line 167
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 168
    .line 169
    .line 170
    const-string v1, "Unexpected declaration kind: "

    .line 171
    .line 172
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object p2

    .line 182
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object p2

    .line 186
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    throw p1
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

.method static synthetic l(Lah/g;Ldi/g0;Lah/a;ILjava/lang/Object;)Ldi/g0;
    .locals 9

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    new-instance p2, Lah/a;

    sget-object v1, Ldi/r1;->l:Ldi/r1;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0x3e

    const/4 v8, 0x0

    move-object v0, p2

    invoke-direct/range {v0 .. v8}, Lah/a;-><init>(Ldi/r1;Lah/c;ZZLjava/util/Set;Ldi/o0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_0
    invoke-direct {p0, p1, p2}, Lah/g;->k(Ldi/g0;Lah/a;)Ldi/g0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic e(Ldi/g0;)Ldi/k1;
    .locals 0

    invoke-virtual {p0, p1}, Lah/g;->m(Ldi/g0;)Ldi/m1;

    move-result-object p1

    return-object p1
.end method

.method public f()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public m(Ldi/g0;)Ldi/m1;
    .locals 3

    .line 1
    const-string v0, "key"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ldi/m1;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x2

    .line 10
    invoke-static {p0, p1, v1, v2, v1}, Lah/g;->l(Lah/g;Ldi/g0;Lah/a;ILjava/lang/Object;)Ldi/g0;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-direct {v0, p1}, Ldi/m1;-><init>(Ldi/g0;)V

    .line 15
    .line 16
    .line 17
    return-object v0
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
