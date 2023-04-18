.class public final Ldi/j1$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldi/j1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Ldi/j1$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ldi/g0;Ldi/p1;Ljava/util/Set;Z)Ldi/g0;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldi/g0;",
            "Ldi/p1;",
            "Ljava/util/Set<",
            "+",
            "Lmg/f1;",
            ">;Z)",
            "Ldi/g0;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    const-string v2, "<this>"

    .line 6
    .line 7
    move-object/from16 v3, p1

    .line 8
    .line 9
    invoke-static {v3, v2}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v2, "substitutor"

    .line 13
    .line 14
    invoke-static {v0, v2}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual/range {p1 .. p1}, Ldi/g0;->Q0()Ldi/v1;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    instance-of v4, v2, Ldi/a0;

    .line 22
    .line 23
    const-string v5, "argument.type"

    .line 24
    .line 25
    const-string v6, "type"

    .line 26
    .line 27
    const/16 v8, 0xa

    .line 28
    .line 29
    const-string v9, "constructor.parameters"

    .line 30
    .line 31
    const/4 v11, 0x0

    .line 32
    if-eqz v4, :cond_10

    .line 33
    .line 34
    move-object v4, v2

    .line 35
    check-cast v4, Ldi/a0;

    .line 36
    .line 37
    invoke-virtual {v4}, Ldi/a0;->V0()Ldi/o0;

    .line 38
    .line 39
    .line 40
    move-result-object v13

    .line 41
    invoke-virtual {v13}, Ldi/g0;->N0()Ldi/g1;

    .line 42
    .line 43
    .line 44
    move-result-object v14

    .line 45
    invoke-interface {v14}, Ldi/g1;->getParameters()Ljava/util/List;

    .line 46
    .line 47
    .line 48
    move-result-object v14

    .line 49
    invoke-interface {v14}, Ljava/util/List;->isEmpty()Z

    .line 50
    .line 51
    .line 52
    move-result v14

    .line 53
    if-nez v14, :cond_7

    .line 54
    .line 55
    invoke-virtual {v13}, Ldi/g0;->N0()Ldi/g1;

    .line 56
    .line 57
    .line 58
    move-result-object v14

    .line 59
    invoke-interface {v14}, Ldi/g1;->q()Lmg/h;

    .line 60
    .line 61
    .line 62
    move-result-object v14

    .line 63
    if-nez v14, :cond_0

    .line 64
    .line 65
    goto/16 :goto_4

    .line 66
    .line 67
    :cond_0
    invoke-virtual {v13}, Ldi/g0;->N0()Ldi/g1;

    .line 68
    .line 69
    .line 70
    move-result-object v14

    .line 71
    invoke-interface {v14}, Ldi/g1;->getParameters()Ljava/util/List;

    .line 72
    .line 73
    .line 74
    move-result-object v14

    .line 75
    invoke-static {v14, v9}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    new-instance v15, Ljava/util/ArrayList;

    .line 79
    .line 80
    invoke-static {v14, v8}, Lkotlin/collections/h;->t(Ljava/lang/Iterable;I)I

    .line 81
    .line 82
    .line 83
    move-result v10

    .line 84
    invoke-direct {v15, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 85
    .line 86
    .line 87
    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 88
    .line 89
    .line 90
    move-result-object v10

    .line 91
    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 92
    .line 93
    .line 94
    move-result v14

    .line 95
    if-eqz v14, :cond_6

    .line 96
    .line 97
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v14

    .line 101
    check-cast v14, Lmg/f1;

    .line 102
    .line 103
    invoke-virtual/range {p1 .. p1}, Ldi/g0;->L0()Ljava/util/List;

    .line 104
    .line 105
    .line 106
    move-result-object v12

    .line 107
    invoke-interface {v14}, Lmg/f1;->getIndex()I

    .line 108
    .line 109
    .line 110
    move-result v8

    .line 111
    invoke-static {v12, v8}, Lkotlin/collections/h;->X(Ljava/util/List;I)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v8

    .line 115
    check-cast v8, Ldi/k1;

    .line 116
    .line 117
    if-eqz p4, :cond_2

    .line 118
    .line 119
    if-eqz v8, :cond_1

    .line 120
    .line 121
    invoke-interface {v8}, Ldi/k1;->getType()Ldi/g0;

    .line 122
    .line 123
    .line 124
    move-result-object v12

    .line 125
    if-eqz v12, :cond_1

    .line 126
    .line 127
    invoke-static {v12, v6}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    invoke-static {v12}, Lii/a;->e(Ldi/g0;)Z

    .line 131
    .line 132
    .line 133
    move-result v12

    .line 134
    if-nez v12, :cond_1

    .line 135
    .line 136
    const/4 v12, 0x1

    .line 137
    goto :goto_1

    .line 138
    :cond_1
    const/4 v12, 0x0

    .line 139
    :goto_1
    if-eqz v12, :cond_2

    .line 140
    .line 141
    goto :goto_3

    .line 142
    :cond_2
    if-eqz v1, :cond_3

    .line 143
    .line 144
    invoke-interface {v1, v14}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v12

    .line 148
    if-eqz v12, :cond_3

    .line 149
    .line 150
    const/4 v12, 0x1

    .line 151
    goto :goto_2

    .line 152
    :cond_3
    const/4 v12, 0x0

    .line 153
    :goto_2
    if-eqz v8, :cond_4

    .line 154
    .line 155
    if-nez v12, :cond_4

    .line 156
    .line 157
    invoke-virtual/range {p2 .. p2}, Ldi/p1;->j()Ldi/n1;

    .line 158
    .line 159
    .line 160
    move-result-object v12

    .line 161
    invoke-interface {v8}, Ldi/k1;->getType()Ldi/g0;

    .line 162
    .line 163
    .line 164
    move-result-object v7

    .line 165
    invoke-static {v7, v5}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v12, v7}, Ldi/n1;->e(Ldi/g0;)Ldi/k1;

    .line 169
    .line 170
    .line 171
    move-result-object v7

    .line 172
    if-nez v7, :cond_5

    .line 173
    .line 174
    :cond_4
    new-instance v7, Ldi/u0;

    .line 175
    .line 176
    invoke-direct {v7, v14}, Ldi/u0;-><init>(Lmg/f1;)V

    .line 177
    .line 178
    .line 179
    move-object v8, v7

    .line 180
    :cond_5
    :goto_3
    invoke-interface {v15, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    const/16 v8, 0xa

    .line 184
    .line 185
    goto :goto_0

    .line 186
    :cond_6
    const/4 v7, 0x2

    .line 187
    invoke-static {v13, v15, v11, v7, v11}, Ldi/o1;->f(Ldi/o0;Ljava/util/List;Ldi/c1;ILjava/lang/Object;)Ldi/o0;

    .line 188
    .line 189
    .line 190
    move-result-object v13

    .line 191
    :cond_7
    :goto_4
    invoke-virtual {v4}, Ldi/a0;->W0()Ldi/o0;

    .line 192
    .line 193
    .line 194
    move-result-object v4

    .line 195
    invoke-virtual {v4}, Ldi/g0;->N0()Ldi/g1;

    .line 196
    .line 197
    .line 198
    move-result-object v7

    .line 199
    invoke-interface {v7}, Ldi/g1;->getParameters()Ljava/util/List;

    .line 200
    .line 201
    .line 202
    move-result-object v7

    .line 203
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    .line 204
    .line 205
    .line 206
    move-result v7

    .line 207
    if-nez v7, :cond_f

    .line 208
    .line 209
    invoke-virtual {v4}, Ldi/g0;->N0()Ldi/g1;

    .line 210
    .line 211
    .line 212
    move-result-object v7

    .line 213
    invoke-interface {v7}, Ldi/g1;->q()Lmg/h;

    .line 214
    .line 215
    .line 216
    move-result-object v7

    .line 217
    if-nez v7, :cond_8

    .line 218
    .line 219
    goto/16 :goto_9

    .line 220
    .line 221
    :cond_8
    invoke-virtual {v4}, Ldi/g0;->N0()Ldi/g1;

    .line 222
    .line 223
    .line 224
    move-result-object v7

    .line 225
    invoke-interface {v7}, Ldi/g1;->getParameters()Ljava/util/List;

    .line 226
    .line 227
    .line 228
    move-result-object v7

    .line 229
    invoke-static {v7, v9}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    new-instance v8, Ljava/util/ArrayList;

    .line 233
    .line 234
    const/16 v9, 0xa

    .line 235
    .line 236
    invoke-static {v7, v9}, Lkotlin/collections/h;->t(Ljava/lang/Iterable;I)I

    .line 237
    .line 238
    .line 239
    move-result v9

    .line 240
    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 241
    .line 242
    .line 243
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 244
    .line 245
    .line 246
    move-result-object v7

    .line 247
    :goto_5
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 248
    .line 249
    .line 250
    move-result v9

    .line 251
    if-eqz v9, :cond_e

    .line 252
    .line 253
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v9

    .line 257
    check-cast v9, Lmg/f1;

    .line 258
    .line 259
    invoke-virtual/range {p1 .. p1}, Ldi/g0;->L0()Ljava/util/List;

    .line 260
    .line 261
    .line 262
    move-result-object v10

    .line 263
    invoke-interface {v9}, Lmg/f1;->getIndex()I

    .line 264
    .line 265
    .line 266
    move-result v12

    .line 267
    invoke-static {v10, v12}, Lkotlin/collections/h;->X(Ljava/util/List;I)Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v10

    .line 271
    check-cast v10, Ldi/k1;

    .line 272
    .line 273
    if-eqz p4, :cond_a

    .line 274
    .line 275
    if-eqz v10, :cond_9

    .line 276
    .line 277
    invoke-interface {v10}, Ldi/k1;->getType()Ldi/g0;

    .line 278
    .line 279
    .line 280
    move-result-object v12

    .line 281
    if-eqz v12, :cond_9

    .line 282
    .line 283
    invoke-static {v12, v6}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 284
    .line 285
    .line 286
    invoke-static {v12}, Lii/a;->e(Ldi/g0;)Z

    .line 287
    .line 288
    .line 289
    move-result v12

    .line 290
    if-nez v12, :cond_9

    .line 291
    .line 292
    const/4 v12, 0x1

    .line 293
    goto :goto_6

    .line 294
    :cond_9
    const/4 v12, 0x0

    .line 295
    :goto_6
    if-eqz v12, :cond_a

    .line 296
    .line 297
    goto :goto_8

    .line 298
    :cond_a
    if-eqz v1, :cond_b

    .line 299
    .line 300
    invoke-interface {v1, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 301
    .line 302
    .line 303
    move-result v12

    .line 304
    if-eqz v12, :cond_b

    .line 305
    .line 306
    const/4 v12, 0x1

    .line 307
    goto :goto_7

    .line 308
    :cond_b
    const/4 v12, 0x0

    .line 309
    :goto_7
    if-eqz v10, :cond_c

    .line 310
    .line 311
    if-nez v12, :cond_c

    .line 312
    .line 313
    invoke-virtual/range {p2 .. p2}, Ldi/p1;->j()Ldi/n1;

    .line 314
    .line 315
    .line 316
    move-result-object v12

    .line 317
    invoke-interface {v10}, Ldi/k1;->getType()Ldi/g0;

    .line 318
    .line 319
    .line 320
    move-result-object v14

    .line 321
    invoke-static {v14, v5}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 322
    .line 323
    .line 324
    invoke-virtual {v12, v14}, Ldi/n1;->e(Ldi/g0;)Ldi/k1;

    .line 325
    .line 326
    .line 327
    move-result-object v12

    .line 328
    if-nez v12, :cond_d

    .line 329
    .line 330
    :cond_c
    new-instance v10, Ldi/u0;

    .line 331
    .line 332
    invoke-direct {v10, v9}, Ldi/u0;-><init>(Lmg/f1;)V

    .line 333
    .line 334
    .line 335
    :cond_d
    :goto_8
    invoke-interface {v8, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 336
    .line 337
    .line 338
    goto :goto_5

    .line 339
    :cond_e
    const/4 v9, 0x2

    .line 340
    invoke-static {v4, v8, v11, v9, v11}, Ldi/o1;->f(Ldi/o0;Ljava/util/List;Ldi/c1;ILjava/lang/Object;)Ldi/o0;

    .line 341
    .line 342
    .line 343
    move-result-object v4

    .line 344
    :cond_f
    :goto_9
    invoke-static {v13, v4}, Ldi/h0;->d(Ldi/o0;Ldi/o0;)Ldi/v1;

    .line 345
    .line 346
    .line 347
    move-result-object v1

    .line 348
    goto/16 :goto_f

    .line 349
    .line 350
    :cond_10
    instance-of v4, v2, Ldi/o0;

    .line 351
    .line 352
    if-eqz v4, :cond_19

    .line 353
    .line 354
    move-object v4, v2

    .line 355
    check-cast v4, Ldi/o0;

    .line 356
    .line 357
    invoke-virtual {v4}, Ldi/g0;->N0()Ldi/g1;

    .line 358
    .line 359
    .line 360
    move-result-object v7

    .line 361
    invoke-interface {v7}, Ldi/g1;->getParameters()Ljava/util/List;

    .line 362
    .line 363
    .line 364
    move-result-object v7

    .line 365
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    .line 366
    .line 367
    .line 368
    move-result v7

    .line 369
    if-nez v7, :cond_18

    .line 370
    .line 371
    invoke-virtual {v4}, Ldi/g0;->N0()Ldi/g1;

    .line 372
    .line 373
    .line 374
    move-result-object v7

    .line 375
    invoke-interface {v7}, Ldi/g1;->q()Lmg/h;

    .line 376
    .line 377
    .line 378
    move-result-object v7

    .line 379
    if-nez v7, :cond_11

    .line 380
    .line 381
    goto/16 :goto_e

    .line 382
    .line 383
    :cond_11
    invoke-virtual {v4}, Ldi/g0;->N0()Ldi/g1;

    .line 384
    .line 385
    .line 386
    move-result-object v7

    .line 387
    invoke-interface {v7}, Ldi/g1;->getParameters()Ljava/util/List;

    .line 388
    .line 389
    .line 390
    move-result-object v7

    .line 391
    invoke-static {v7, v9}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 392
    .line 393
    .line 394
    new-instance v8, Ljava/util/ArrayList;

    .line 395
    .line 396
    const/16 v9, 0xa

    .line 397
    .line 398
    invoke-static {v7, v9}, Lkotlin/collections/h;->t(Ljava/lang/Iterable;I)I

    .line 399
    .line 400
    .line 401
    move-result v9

    .line 402
    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 403
    .line 404
    .line 405
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 406
    .line 407
    .line 408
    move-result-object v7

    .line 409
    :goto_a
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 410
    .line 411
    .line 412
    move-result v9

    .line 413
    if-eqz v9, :cond_17

    .line 414
    .line 415
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 416
    .line 417
    .line 418
    move-result-object v9

    .line 419
    check-cast v9, Lmg/f1;

    .line 420
    .line 421
    invoke-virtual/range {p1 .. p1}, Ldi/g0;->L0()Ljava/util/List;

    .line 422
    .line 423
    .line 424
    move-result-object v10

    .line 425
    invoke-interface {v9}, Lmg/f1;->getIndex()I

    .line 426
    .line 427
    .line 428
    move-result v12

    .line 429
    invoke-static {v10, v12}, Lkotlin/collections/h;->X(Ljava/util/List;I)Ljava/lang/Object;

    .line 430
    .line 431
    .line 432
    move-result-object v10

    .line 433
    check-cast v10, Ldi/k1;

    .line 434
    .line 435
    if-eqz p4, :cond_13

    .line 436
    .line 437
    if-eqz v10, :cond_12

    .line 438
    .line 439
    invoke-interface {v10}, Ldi/k1;->getType()Ldi/g0;

    .line 440
    .line 441
    .line 442
    move-result-object v12

    .line 443
    if-eqz v12, :cond_12

    .line 444
    .line 445
    invoke-static {v12, v6}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 446
    .line 447
    .line 448
    invoke-static {v12}, Lii/a;->e(Ldi/g0;)Z

    .line 449
    .line 450
    .line 451
    move-result v12

    .line 452
    if-nez v12, :cond_12

    .line 453
    .line 454
    const/4 v12, 0x1

    .line 455
    goto :goto_b

    .line 456
    :cond_12
    const/4 v12, 0x0

    .line 457
    :goto_b
    if-eqz v12, :cond_13

    .line 458
    .line 459
    goto :goto_d

    .line 460
    :cond_13
    if-eqz v1, :cond_14

    .line 461
    .line 462
    invoke-interface {v1, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 463
    .line 464
    .line 465
    move-result v12

    .line 466
    if-eqz v12, :cond_14

    .line 467
    .line 468
    const/4 v12, 0x1

    .line 469
    goto :goto_c

    .line 470
    :cond_14
    const/4 v12, 0x0

    .line 471
    :goto_c
    if-eqz v10, :cond_15

    .line 472
    .line 473
    if-nez v12, :cond_15

    .line 474
    .line 475
    invoke-virtual/range {p2 .. p2}, Ldi/p1;->j()Ldi/n1;

    .line 476
    .line 477
    .line 478
    move-result-object v12

    .line 479
    invoke-interface {v10}, Ldi/k1;->getType()Ldi/g0;

    .line 480
    .line 481
    .line 482
    move-result-object v13

    .line 483
    invoke-static {v13, v5}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 484
    .line 485
    .line 486
    invoke-virtual {v12, v13}, Ldi/n1;->e(Ldi/g0;)Ldi/k1;

    .line 487
    .line 488
    .line 489
    move-result-object v12

    .line 490
    if-nez v12, :cond_16

    .line 491
    .line 492
    :cond_15
    new-instance v10, Ldi/u0;

    .line 493
    .line 494
    invoke-direct {v10, v9}, Ldi/u0;-><init>(Lmg/f1;)V

    .line 495
    .line 496
    .line 497
    :cond_16
    :goto_d
    invoke-interface {v8, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 498
    .line 499
    .line 500
    goto :goto_a

    .line 501
    :cond_17
    const/4 v9, 0x2

    .line 502
    invoke-static {v4, v8, v11, v9, v11}, Ldi/o1;->f(Ldi/o0;Ljava/util/List;Ldi/c1;ILjava/lang/Object;)Ldi/o0;

    .line 503
    .line 504
    .line 505
    move-result-object v1

    .line 506
    goto :goto_f

    .line 507
    :cond_18
    :goto_e
    move-object v1, v4

    .line 508
    :goto_f
    invoke-static {v1, v2}, Ldi/u1;->b(Ldi/v1;Ldi/g0;)Ldi/v1;

    .line 509
    .line 510
    .line 511
    move-result-object v1

    .line 512
    sget-object v2, Ldi/w1;->q:Ldi/w1;

    .line 513
    .line 514
    invoke-virtual {v0, v1, v2}, Ldi/p1;->n(Ldi/g0;Ldi/w1;)Ldi/g0;

    .line 515
    .line 516
    .line 517
    move-result-object v0

    .line 518
    const-string v1, "substitutor.safeSubstitu\u2026s, Variance.OUT_VARIANCE)"

    .line 519
    .line 520
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 521
    .line 522
    .line 523
    return-object v0

    .line 524
    :cond_19
    new-instance v0, Llf/q;

    .line 525
    .line 526
    invoke-direct {v0}, Llf/q;-><init>()V

    .line 527
    .line 528
    .line 529
    throw v0
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
