.class Lnet/time4j/k$b;
.super Lfj/e;
.source "SourceFile"

# interfaces
.implements Lgj/t;
.implements Lfj/z;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/time4j/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lfj/e<",
        "Ljava/lang/String;",
        ">;",
        "Lgj/t<",
        "Ljava/lang/String;",
        ">;",
        "Lfj/z<",
        "Lfj/q<",
        "*>;",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x4d9395be98365580L


# instance fields
.field private final transient k:Z

.field private final transient l:Lnet/time4j/k;


# direct methods
.method constructor <init>(ZLjava/util/Locale;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p2, p3}, Lnet/time4j/k;->r(Ljava/util/Locale;Ljava/lang/String;)Lnet/time4j/k;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lnet/time4j/k$b;-><init>(ZLnet/time4j/k;)V

    return-void
.end method

.method constructor <init>(ZLnet/time4j/k;)V
    .locals 1

    if-eqz p1, :cond_0

    const-string v0, "FIXED_DAY_PERIOD"

    goto :goto_0

    :cond_0
    const-string v0, "APPROXIMATE_DAY_PERIOD"

    .line 2
    :goto_0
    invoke-direct {p0, v0}, Lfj/e;-><init>(Ljava/lang/String;)V

    .line 3
    iput-boolean p1, p0, Lnet/time4j/k$b;->k:Z

    .line 4
    iput-object p2, p0, Lnet/time4j/k$b;->l:Lnet/time4j/k;

    return-void
.end method

.method private Q(Ljava/lang/CharSequence;Ljava/text/ParsePosition;Lfj/d;Lgj/m;)Ljava/lang/String;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    move-object/from16 v3, p4

    .line 8
    .line 9
    new-instance v4, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    iget-boolean v5, v0, Lnet/time4j/k$b;->k:Z

    .line 15
    .line 16
    const-string v6, "pm"

    .line 17
    .line 18
    const-string v7, "am"

    .line 19
    .line 20
    const-string v8, "noon"

    .line 21
    .line 22
    const-string v9, "midnight"

    .line 23
    .line 24
    if-eqz v5, :cond_0

    .line 25
    .line 26
    invoke-interface {v4, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    invoke-interface {v4, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    invoke-interface {v4, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    invoke-interface {v4, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    new-instance v5, Ljava/util/LinkedHashSet;

    .line 40
    .line 41
    iget-object v10, v0, Lnet/time4j/k$b;->l:Lnet/time4j/k;

    .line 42
    .line 43
    invoke-static {v10}, Lnet/time4j/k;->d(Lnet/time4j/k;)Ljava/util/SortedMap;

    .line 44
    .line 45
    .line 46
    move-result-object v10

    .line 47
    invoke-interface {v10}, Ljava/util/SortedMap;->values()Ljava/util/Collection;

    .line 48
    .line 49
    .line 50
    move-result-object v10

    .line 51
    invoke-direct {v5, v10}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    .line 52
    .line 53
    .line 54
    invoke-interface {v4, v5}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 55
    .line 56
    .line 57
    iget-object v5, v0, Lnet/time4j/k$b;->l:Lnet/time4j/k;

    .line 58
    .line 59
    invoke-static {v5}, Lnet/time4j/k;->c(Lnet/time4j/k;)Z

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    if-eqz v5, :cond_1

    .line 64
    .line 65
    invoke-interface {v4, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    invoke-interface {v4, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    :cond_1
    :goto_0
    iget-object v5, v0, Lnet/time4j/k$b;->l:Lnet/time4j/k;

    .line 72
    .line 73
    invoke-static {v5}, Lnet/time4j/k;->c(Lnet/time4j/k;)Z

    .line 74
    .line 75
    .line 76
    move-result v5

    .line 77
    if-eqz v5, :cond_2

    .line 78
    .line 79
    invoke-virtual/range {p0 .. p0}, Lnet/time4j/k$b;->F()Ljava/util/Locale;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    invoke-virtual/range {p0 .. p0}, Lnet/time4j/k$b;->y()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v11

    .line 87
    invoke-static {v5, v11}, Lnet/time4j/k;->f(Ljava/util/Locale;Ljava/lang/String;)Ljava/util/Map;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    goto :goto_1

    .line 92
    :cond_2
    const/4 v5, 0x0

    .line 93
    :goto_1
    sget-object v11, Lgj/a;->g:Lfj/c;

    .line 94
    .line 95
    sget-object v12, Lgj/v;->k:Lgj/v;

    .line 96
    .line 97
    invoke-interface {v2, v11, v12}, Lfj/d;->a(Lfj/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v11

    .line 101
    check-cast v11, Lgj/v;

    .line 102
    .line 103
    sget-object v12, Lgj/a;->i:Lfj/c;

    .line 104
    .line 105
    sget-object v13, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 106
    .line 107
    invoke-interface {v2, v12, v13}, Lfj/d;->a(Lfj/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v12

    .line 111
    check-cast v12, Ljava/lang/Boolean;

    .line 112
    .line 113
    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    .line 114
    .line 115
    .line 116
    move-result v12

    .line 117
    sget-object v13, Lgj/a;->j:Lfj/c;

    .line 118
    .line 119
    sget-object v14, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 120
    .line 121
    invoke-interface {v2, v13, v14}, Lfj/d;->a(Lfj/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    check-cast v2, Ljava/lang/Boolean;

    .line 126
    .line 127
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 128
    .line 129
    .line 130
    move-result v2

    .line 131
    invoke-virtual/range {p2 .. p2}, Ljava/text/ParsePosition;->getIndex()I

    .line 132
    .line 133
    .line 134
    move-result v13

    .line 135
    invoke-interface/range {p1 .. p1}, Ljava/lang/CharSequence;->length()I

    .line 136
    .line 137
    .line 138
    move-result v14

    .line 139
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 140
    .line 141
    .line 142
    move-result-object v4

    .line 143
    const/4 v10, 0x0

    .line 144
    const/4 v15, 0x0

    .line 145
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 146
    .line 147
    .line 148
    move-result v16

    .line 149
    if-eqz v16, :cond_15

    .line 150
    .line 151
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v16

    .line 155
    move-object/from16 v17, v4

    .line 156
    .line 157
    move-object/from16 v4, v16

    .line 158
    .line 159
    check-cast v4, Ljava/lang/String;

    .line 160
    .line 161
    iget-object v1, v0, Lnet/time4j/k$b;->l:Lnet/time4j/k;

    .line 162
    .line 163
    invoke-static {v1}, Lnet/time4j/k;->c(Lnet/time4j/k;)Z

    .line 164
    .line 165
    .line 166
    move-result v1

    .line 167
    if-eqz v1, :cond_7

    .line 168
    .line 169
    iget-boolean v1, v0, Lnet/time4j/k$b;->k:Z

    .line 170
    .line 171
    if-eqz v1, :cond_4

    .line 172
    .line 173
    invoke-static {v5, v11, v3, v4}, Lnet/time4j/k;->g(Ljava/util/Map;Lgj/v;Lgj/m;Ljava/lang/String;)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    invoke-interface {v5, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result v16

    .line 181
    if-nez v16, :cond_5

    .line 182
    .line 183
    invoke-virtual {v4, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    move-result v16

    .line 187
    if-eqz v16, :cond_3

    .line 188
    .line 189
    invoke-static {v5, v11, v3, v7}, Lnet/time4j/k;->g(Ljava/util/Map;Lgj/v;Lgj/m;Ljava/lang/String;)Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    goto :goto_3

    .line 194
    :cond_3
    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    move-result v16

    .line 198
    if-eqz v16, :cond_5

    .line 199
    .line 200
    invoke-static {v5, v11, v3, v6}, Lnet/time4j/k;->g(Ljava/util/Map;Lgj/v;Lgj/m;Ljava/lang/String;)Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    goto :goto_3

    .line 205
    :cond_4
    invoke-static {v5, v11, v3, v4}, Lnet/time4j/k;->g(Ljava/util/Map;Lgj/v;Lgj/m;Ljava/lang/String;)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    :cond_5
    :goto_3
    invoke-interface {v5, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    move-result v16

    .line 213
    if-eqz v16, :cond_6

    .line 214
    .line 215
    invoke-interface {v5, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v1

    .line 219
    check-cast v1, Ljava/lang/String;

    .line 220
    .line 221
    goto :goto_4

    .line 222
    :cond_6
    const/4 v1, 0x0

    .line 223
    goto :goto_4

    .line 224
    :cond_7
    move-object v1, v4

    .line 225
    :goto_4
    if-eqz v1, :cond_13

    .line 226
    .line 227
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 228
    .line 229
    .line 230
    move-result v3

    .line 231
    move-object/from16 v16, v5

    .line 232
    .line 233
    move/from16 v19, v13

    .line 234
    .line 235
    const/4 v5, 0x0

    .line 236
    const/16 v18, 0x1

    .line 237
    .line 238
    :goto_5
    if-eqz v18, :cond_c

    .line 239
    .line 240
    if-ge v5, v3, :cond_c

    .line 241
    .line 242
    move-object/from16 v20, v6

    .line 243
    .line 244
    add-int v6, v13, v5

    .line 245
    .line 246
    if-lt v6, v14, :cond_8

    .line 247
    .line 248
    move-object/from16 v21, v7

    .line 249
    .line 250
    const/16 v18, 0x0

    .line 251
    .line 252
    goto :goto_7

    .line 253
    :cond_8
    move-object/from16 v21, v7

    .line 254
    .line 255
    move-object/from16 v7, p1

    .line 256
    .line 257
    invoke-interface {v7, v6}, Ljava/lang/CharSequence;->charAt(I)C

    .line 258
    .line 259
    .line 260
    move-result v6

    .line 261
    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    .line 262
    .line 263
    .line 264
    move-result v7

    .line 265
    if-eqz v12, :cond_9

    .line 266
    .line 267
    invoke-direct {v0, v6, v7}, Lnet/time4j/k$b;->x(CC)Z

    .line 268
    .line 269
    .line 270
    move-result v6

    .line 271
    goto :goto_6

    .line 272
    :cond_9
    if-ne v6, v7, :cond_a

    .line 273
    .line 274
    const/4 v6, 0x1

    .line 275
    goto :goto_6

    .line 276
    :cond_a
    const/4 v6, 0x0

    .line 277
    :goto_6
    if-eqz v6, :cond_b

    .line 278
    .line 279
    add-int/lit8 v19, v19, 0x1

    .line 280
    .line 281
    :cond_b
    move/from16 v18, v6

    .line 282
    .line 283
    :goto_7
    add-int/lit8 v5, v5, 0x1

    .line 284
    .line 285
    move-object/from16 v6, v20

    .line 286
    .line 287
    move-object/from16 v7, v21

    .line 288
    .line 289
    goto :goto_5

    .line 290
    :cond_c
    move-object/from16 v20, v6

    .line 291
    .line 292
    move-object/from16 v21, v7

    .line 293
    .line 294
    const-string v1, "|"

    .line 295
    .line 296
    if-nez v2, :cond_10

    .line 297
    .line 298
    const/4 v5, 0x1

    .line 299
    if-ne v3, v5, :cond_d

    .line 300
    .line 301
    goto :goto_8

    .line 302
    :cond_d
    if-eqz v18, :cond_14

    .line 303
    .line 304
    if-nez v10, :cond_e

    .line 305
    .line 306
    goto :goto_9

    .line 307
    :cond_e
    iget-boolean v5, v0, Lnet/time4j/k$b;->k:Z

    .line 308
    .line 309
    if-eqz v5, :cond_f

    .line 310
    .line 311
    move v15, v3

    .line 312
    goto :goto_a

    .line 313
    :cond_f
    new-instance v5, Ljava/lang/StringBuilder;

    .line 314
    .line 315
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 316
    .line 317
    .line 318
    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 319
    .line 320
    .line 321
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 322
    .line 323
    .line 324
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 325
    .line 326
    .line 327
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 328
    .line 329
    .line 330
    move-result-object v10

    .line 331
    move v15, v3

    .line 332
    goto :goto_b

    .line 333
    :cond_10
    :goto_8
    sub-int v3, v19, v13

    .line 334
    .line 335
    if-ge v15, v3, :cond_11

    .line 336
    .line 337
    :goto_9
    move v15, v3

    .line 338
    move-object v10, v4

    .line 339
    goto :goto_b

    .line 340
    :cond_11
    if-eqz v10, :cond_14

    .line 341
    .line 342
    if-ne v15, v3, :cond_14

    .line 343
    .line 344
    iget-boolean v3, v0, Lnet/time4j/k$b;->k:Z

    .line 345
    .line 346
    if-eqz v3, :cond_12

    .line 347
    .line 348
    :goto_a
    const/4 v10, 0x0

    .line 349
    goto :goto_b

    .line 350
    :cond_12
    new-instance v3, Ljava/lang/StringBuilder;

    .line 351
    .line 352
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 353
    .line 354
    .line 355
    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 356
    .line 357
    .line 358
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 359
    .line 360
    .line 361
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 362
    .line 363
    .line 364
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 365
    .line 366
    .line 367
    move-result-object v10

    .line 368
    goto :goto_b

    .line 369
    :cond_13
    move-object/from16 v16, v5

    .line 370
    .line 371
    move-object/from16 v20, v6

    .line 372
    .line 373
    move-object/from16 v21, v7

    .line 374
    .line 375
    :cond_14
    :goto_b
    move-object/from16 v1, p2

    .line 376
    .line 377
    move-object/from16 v3, p4

    .line 378
    .line 379
    move-object/from16 v5, v16

    .line 380
    .line 381
    move-object/from16 v4, v17

    .line 382
    .line 383
    move-object/from16 v6, v20

    .line 384
    .line 385
    move-object/from16 v7, v21

    .line 386
    .line 387
    goto/16 :goto_2

    .line 388
    .line 389
    :cond_15
    if-nez v10, :cond_16

    .line 390
    .line 391
    move-object/from16 v1, p2

    .line 392
    .line 393
    invoke-virtual {v1, v13}, Ljava/text/ParsePosition;->setErrorIndex(I)V

    .line 394
    .line 395
    .line 396
    goto :goto_c

    .line 397
    :cond_16
    move-object/from16 v1, p2

    .line 398
    .line 399
    add-int/2addr v13, v15

    .line 400
    invoke-virtual {v1, v13}, Ljava/text/ParsePosition;->setIndex(I)V

    .line 401
    .line 402
    .line 403
    :goto_c
    return-object v10
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
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 1

    new-instance p1, Ljava/io/InvalidObjectException;

    const-string v0, "Serialization proxy required."

    invoke-direct {p1, v0}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private writeReplace()Ljava/lang/Object;
    .locals 2

    new-instance v0, Lnet/time4j/SPX;

    const/4 v1, 0x7

    invoke-direct {v0, p0, v1}, Lnet/time4j/SPX;-><init>(Ljava/lang/Object;I)V

    return-object v0
.end method

.method private x(CC)Z
    .locals 3

    .line 1
    const/16 v0, 0x7a

    .line 2
    .line 3
    const/16 v1, 0x41

    .line 4
    .line 5
    const/16 v2, 0x61

    .line 6
    .line 7
    if-lt p1, v2, :cond_0

    .line 8
    .line 9
    if-gt p1, v0, :cond_0

    .line 10
    .line 11
    add-int/lit8 p1, p1, -0x61

    .line 12
    .line 13
    add-int/2addr p1, v1

    .line 14
    int-to-char p1, p1

    .line 15
    :cond_0
    if-lt p2, v2, :cond_1

    .line 16
    .line 17
    if-gt p2, v0, :cond_1

    .line 18
    .line 19
    add-int/lit8 p2, p2, -0x61

    .line 20
    .line 21
    add-int/2addr p2, v1

    .line 22
    int-to-char p2, p2

    .line 23
    :cond_1
    if-lt p1, v1, :cond_3

    .line 24
    .line 25
    const/16 v0, 0x5a

    .line 26
    .line 27
    if-gt p1, v0, :cond_3

    .line 28
    .line 29
    if-ne p1, p2, :cond_2

    .line 30
    .line 31
    const/4 p1, 0x1

    .line 32
    goto :goto_0

    .line 33
    :cond_2
    const/4 p1, 0x0

    .line 34
    :goto_0
    return p1

    .line 35
    :cond_3
    invoke-virtual {p0}, Lnet/time4j/k$b;->F()Ljava/util/Locale;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-static {p1}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p1, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-static {p2}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    invoke-virtual {p2, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    return p1
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


# virtual methods
.method public A(Lfj/q;)Lfj/p;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/q<",
            "*>;)",
            "Lfj/p<",
            "*>;"
        }
    .end annotation

    const/4 p1, 0x0

    return-object p1
.end method

.method public B(Lfj/q;)Lfj/p;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/q<",
            "*>;)",
            "Lfj/p<",
            "*>;"
        }
    .end annotation

    const/4 p1, 0x0

    return-object p1
.end method

.method C()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lnet/time4j/k$b;->l:Lnet/time4j/k;

    invoke-static {v0}, Lnet/time4j/k;->d(Lnet/time4j/k;)Ljava/util/SortedMap;

    move-result-object v0

    return-object v0
.end method

.method public D()Ljava/lang/String;
    .locals 2

    .line 1
    iget-boolean v0, p0, Lnet/time4j/k$b;->k:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v0, "pm"

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    iget-object v0, p0, Lnet/time4j/k$b;->l:Lnet/time4j/k;

    .line 9
    .line 10
    invoke-static {v0}, Lnet/time4j/k;->d(Lnet/time4j/k;)Ljava/util/SortedMap;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0}, Ljava/util/SortedMap;->lastKey()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Lnet/time4j/g0;

    .line 19
    .line 20
    iget-object v1, p0, Lnet/time4j/k$b;->l:Lnet/time4j/k;

    .line 21
    .line 22
    invoke-static {v1}, Lnet/time4j/k;->d(Lnet/time4j/k;)Ljava/util/SortedMap;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Ljava/lang/String;

    .line 31
    .line 32
    return-object v0
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

.method public E()Ljava/lang/String;
    .locals 2

    .line 1
    iget-boolean v0, p0, Lnet/time4j/k$b;->k:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v0, "am"

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    iget-object v0, p0, Lnet/time4j/k$b;->l:Lnet/time4j/k;

    .line 9
    .line 10
    invoke-static {v0}, Lnet/time4j/k;->d(Lnet/time4j/k;)Ljava/util/SortedMap;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0}, Ljava/util/SortedMap;->firstKey()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Lnet/time4j/g0;

    .line 19
    .line 20
    iget-object v1, p0, Lnet/time4j/k$b;->l:Lnet/time4j/k;

    .line 21
    .line 22
    invoke-static {v1}, Lnet/time4j/k;->d(Lnet/time4j/k;)Ljava/util/SortedMap;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Ljava/lang/String;

    .line 31
    .line 32
    return-object v0
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

.method F()Ljava/util/Locale;
    .locals 1

    iget-object v0, p0, Lnet/time4j/k$b;->l:Lnet/time4j/k;

    invoke-static {v0}, Lnet/time4j/k;->h(Lnet/time4j/k;)Ljava/util/Locale;

    move-result-object v0

    return-object v0
.end method

.method public G()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public J(Lfj/q;)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/q<",
            "*>;)",
            "Ljava/lang/String;"
        }
    .end annotation

    invoke-virtual {p0}, Lnet/time4j/k$b;->D()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public L(Lfj/q;)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/q<",
            "*>;)",
            "Ljava/lang/String;"
        }
    .end annotation

    invoke-virtual {p0}, Lnet/time4j/k$b;->E()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public M(Lfj/q;)Ljava/lang/String;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/q<",
            "*>;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    sget-object v0, Lnet/time4j/g0;->z:Lnet/time4j/u0;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lnet/time4j/g0;

    .line 8
    .line 9
    iget-boolean v0, p0, Lnet/time4j/k$b;->k:Z

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-static {p1}, Lnet/time4j/k;->e(Lnet/time4j/g0;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1

    .line 18
    :cond_0
    iget-object v0, p0, Lnet/time4j/k$b;->l:Lnet/time4j/k;

    .line 19
    .line 20
    invoke-static {v0}, Lnet/time4j/k;->c(Lnet/time4j/k;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_3

    .line 25
    .line 26
    invoke-virtual {p0}, Lnet/time4j/k$b;->F()Ljava/util/Locale;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {p0}, Lnet/time4j/k$b;->y()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-static {v0, v1}, Lnet/time4j/k;->f(Ljava/util/Locale;Ljava/lang/String;)Ljava/util/Map;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {p1}, Lnet/time4j/g0;->E0()Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_1

    .line 43
    .line 44
    const-string v1, "midnight"

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    const/16 v1, 0xc

    .line 48
    .line 49
    invoke-static {v1}, Lnet/time4j/g0;->J0(I)Lnet/time4j/g0;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-virtual {p1, v1}, Lnet/time4j/g0;->F0(Lnet/time4j/g0;)Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-eqz v1, :cond_2

    .line 58
    .line 59
    const-string v1, "noon"

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    const/4 v1, 0x0

    .line 63
    :goto_0
    if-eqz v1, :cond_3

    .line 64
    .line 65
    sget-object v2, Lgj/v;->l:Lgj/v;

    .line 66
    .line 67
    sget-object v3, Lgj/m;->k:Lgj/m;

    .line 68
    .line 69
    invoke-static {v0, v2, v3, v1}, Lnet/time4j/k;->g(Ljava/util/Map;Lgj/v;Lgj/m;Ljava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-interface {v0, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-eqz v0, :cond_3

    .line 78
    .line 79
    return-object v1

    .line 80
    :cond_3
    iget-object v0, p0, Lnet/time4j/k$b;->l:Lnet/time4j/k;

    .line 81
    .line 82
    invoke-virtual {v0, p1}, Lnet/time4j/k;->o(Lnet/time4j/g0;)Lnet/time4j/g0;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    iget-object v0, p0, Lnet/time4j/k$b;->l:Lnet/time4j/k;

    .line 87
    .line 88
    invoke-static {v0}, Lnet/time4j/k;->d(Lnet/time4j/k;)Ljava/util/SortedMap;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    check-cast p1, Ljava/lang/String;

    .line 97
    .line 98
    return-object p1
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
.end method

.method N()Z
    .locals 1

    iget-boolean v0, p0, Lnet/time4j/k$b;->k:Z

    return v0
.end method

.method public O(Lfj/q;Ljava/lang/String;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/q<",
            "*>;",
            "Ljava/lang/String;",
            ")Z"
        }
    .end annotation

    const/4 p1, 0x0

    return p1
.end method

.method public P(Ljava/lang/CharSequence;Ljava/text/ParsePosition;Lfj/d;)Ljava/lang/String;
    .locals 6

    .line 1
    invoke-virtual {p2}, Ljava/text/ParsePosition;->getIndex()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sget-object v1, Lgj/a;->h:Lfj/c;

    .line 6
    .line 7
    sget-object v2, Lgj/m;->k:Lgj/m;

    .line 8
    .line 9
    invoke-interface {p3, v1, v2}, Lfj/d;->a(Lfj/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Lgj/m;

    .line 14
    .line 15
    invoke-direct {p0, p1, p2, p3, v1}, Lnet/time4j/k$b;->Q(Ljava/lang/CharSequence;Ljava/text/ParsePosition;Lfj/d;Lgj/m;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    if-nez v3, :cond_1

    .line 20
    .line 21
    sget-object v4, Lgj/a;->k:Lfj/c;

    .line 22
    .line 23
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 24
    .line 25
    invoke-interface {p3, v4, v5}, Lfj/d;->a(Lfj/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    check-cast v4, Ljava/lang/Boolean;

    .line 30
    .line 31
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-eqz v4, :cond_1

    .line 36
    .line 37
    const/4 v3, -0x1

    .line 38
    invoke-virtual {p2, v3}, Ljava/text/ParsePosition;->setErrorIndex(I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p2, v0}, Ljava/text/ParsePosition;->setIndex(I)V

    .line 42
    .line 43
    .line 44
    if-ne v1, v2, :cond_0

    .line 45
    .line 46
    sget-object v2, Lgj/m;->l:Lgj/m;

    .line 47
    .line 48
    :cond_0
    invoke-direct {p0, p1, p2, p3, v2}, Lnet/time4j/k$b;->Q(Ljava/lang/CharSequence;Ljava/text/ParsePosition;Lfj/d;Lgj/m;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    :cond_1
    return-object v3
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
.end method

.method public bridge synthetic R(Ljava/lang/CharSequence;Ljava/text/ParsePosition;Lfj/d;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lnet/time4j/k$b;->P(Ljava/lang/CharSequence;Ljava/text/ParsePosition;Lfj/d;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic S()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lnet/time4j/k$b;->E()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public T()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public U(Lfj/q;Ljava/lang/String;Z)Lfj/q;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/q<",
            "*>;",
            "Ljava/lang/String;",
            "Z)",
            "Lfj/q<",
            "*>;"
        }
    .end annotation

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Day period element cannot be set."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic a(Ljava/lang/Object;)Lfj/p;
    .locals 0

    check-cast p1, Lfj/q;

    invoke-virtual {p0, p1}, Lnet/time4j/k$b;->A(Lfj/q;)Lfj/p;

    move-result-object p1

    return-object p1
.end method

.method public b()C
    .locals 1

    iget-boolean v0, p0, Lnet/time4j/k$b;->k:Z

    if-eqz v0, :cond_0

    const/16 v0, 0x62

    goto :goto_0

    :cond_0
    const/16 v0, 0x42

    :goto_0
    return v0
.end method

.method public bridge synthetic c(Ljava/lang/Object;)Lfj/p;
    .locals 0

    check-cast p1, Lfj/q;

    invoke-virtual {p0, p1}, Lnet/time4j/k$b;->B(Lfj/q;)Lfj/p;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic f()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lnet/time4j/k$b;->D()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected g(Lfj/x;)Lfj/z;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lfj/q<",
            "TT;>;>(",
            "Lfj/x<",
            "TT;>;)",
            "Lfj/z<",
            "TT;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    sget-object v0, Lnet/time4j/g0;->z:Lnet/time4j/u0;

    invoke-virtual {p1, v0}, Lfj/x;->x(Lfj/p;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-object p0

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public getType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-class v0, Ljava/lang/String;

    return-object v0
.end method

.method public i(Lfj/o;Ljava/lang/Appendable;Lfj/d;)V
    .locals 3

    .line 1
    sget-object v0, Lgj/a;->g:Lfj/c;

    .line 2
    .line 3
    sget-object v1, Lgj/v;->k:Lgj/v;

    .line 4
    .line 5
    invoke-interface {p3, v0, v1}, Lfj/d;->a(Lfj/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lgj/v;

    .line 10
    .line 11
    sget-object v1, Lgj/a;->h:Lfj/c;

    .line 12
    .line 13
    sget-object v2, Lgj/m;->k:Lgj/m;

    .line 14
    .line 15
    invoke-interface {p3, v1, v2}, Lfj/d;->a(Lfj/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p3

    .line 19
    check-cast p3, Lgj/m;

    .line 20
    .line 21
    iget-boolean v1, p0, Lnet/time4j/k$b;->k:Z

    .line 22
    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    iget-object v1, p0, Lnet/time4j/k$b;->l:Lnet/time4j/k;

    .line 26
    .line 27
    invoke-virtual {v1, v0, p3}, Lnet/time4j/k;->l(Lgj/v;Lgj/m;)Lfj/t;

    .line 28
    .line 29
    .line 30
    move-result-object p3

    .line 31
    invoke-interface {p3, p1}, Lfj/t;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    check-cast p1, Ljava/lang/String;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    iget-object v1, p0, Lnet/time4j/k$b;->l:Lnet/time4j/k;

    .line 39
    .line 40
    invoke-virtual {v1, v0, p3}, Lnet/time4j/k;->j(Lgj/v;Lgj/m;)Lfj/t;

    .line 41
    .line 42
    .line 43
    move-result-object p3

    .line 44
    invoke-interface {p3, p1}, Lfj/t;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    check-cast p1, Ljava/lang/String;

    .line 49
    .line 50
    :goto_0
    invoke-interface {p2, p1}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 51
    .line 52
    .line 53
    return-void
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
.end method

.method public bridge synthetic j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lfj/q;

    invoke-virtual {p0, p1}, Lnet/time4j/k$b;->J(Lfj/q;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic m(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lfj/q;

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lnet/time4j/k$b;->O(Lfj/q;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic o(Ljava/lang/Object;Ljava/lang/Object;Z)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lfj/q;

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p0, p1, p2, p3}, Lnet/time4j/k$b;->U(Lfj/q;Ljava/lang/String;Z)Lfj/q;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic p(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lfj/q;

    invoke-virtual {p0, p1}, Lnet/time4j/k$b;->L(Lfj/q;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lfj/q;

    invoke-virtual {p0, p1}, Lnet/time4j/k$b;->M(Lfj/q;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected r(Lfj/e;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/e<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    check-cast p1, Lnet/time4j/k$b;

    .line 2
    .line 3
    iget-object v0, p0, Lnet/time4j/k$b;->l:Lnet/time4j/k;

    .line 4
    .line 5
    iget-object p1, p1, Lnet/time4j/k$b;->l:Lnet/time4j/k;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lnet/time4j/k;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
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

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const/16 v1, 0x20

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lfj/e;->name()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const/16 v1, 0x40

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Lnet/time4j/k$b;->l:Lnet/time4j/k;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    return-object v0
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
.end method

.method y()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lnet/time4j/k$b;->l:Lnet/time4j/k;

    invoke-static {v0}, Lnet/time4j/k;->i(Lnet/time4j/k;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
