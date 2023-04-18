.class Lnet/time4j/calendar/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgj/t;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lgj/t<",
        "Lnet/time4j/calendar/h;",
        ">;",
        "Ljava/io/Serializable;"
    }
.end annotation


# static fields
.field static final k:Lnet/time4j/calendar/g;

.field private static final serialVersionUID:J = -0x5185980e91d15c61L


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lnet/time4j/calendar/g;

    invoke-direct {v0}, Lnet/time4j/calendar/g;-><init>()V

    sput-object v0, Lnet/time4j/calendar/g;->k:Lnet/time4j/calendar/g;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public G()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic R(Ljava/lang/CharSequence;Ljava/text/ParsePosition;Lfj/d;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lnet/time4j/calendar/g;->g(Ljava/lang/CharSequence;Ljava/text/ParsePosition;Lfj/d;)Lnet/time4j/calendar/h;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic S()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lnet/time4j/calendar/g;->d()Lnet/time4j/calendar/h;

    move-result-object v0

    return-object v0
.end method

.method public T()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public a(Lfj/o;Lfj/o;)I
    .locals 0

    invoke-interface {p1, p0}, Lfj/o;->k(Lfj/p;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lnet/time4j/calendar/h;

    invoke-interface {p2, p0}, Lfj/o;->k(Lfj/p;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lnet/time4j/calendar/h;

    invoke-virtual {p1, p2}, Lnet/time4j/calendar/h;->a(Lnet/time4j/calendar/h;)I

    move-result p1

    return p1
.end method

.method public b()C
    .locals 1

    const/16 v0, 0x4d

    return v0
.end method

.method public c()Lnet/time4j/calendar/h;
    .locals 1

    const/16 v0, 0xc

    invoke-static {v0}, Lnet/time4j/calendar/h;->e(I)Lnet/time4j/calendar/h;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lfj/o;

    check-cast p2, Lfj/o;

    invoke-virtual {p0, p1, p2}, Lnet/time4j/calendar/g;->a(Lfj/o;Lfj/o;)I

    move-result p1

    return p1
.end method

.method public d()Lnet/time4j/calendar/h;
    .locals 1

    const/4 v0, 0x1

    invoke-static {v0}, Lnet/time4j/calendar/h;->e(I)Lnet/time4j/calendar/h;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic f()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lnet/time4j/calendar/g;->c()Lnet/time4j/calendar/h;

    move-result-object v0

    return-object v0
.end method

.method public g(Ljava/lang/CharSequence;Ljava/text/ParsePosition;Lfj/d;)Lnet/time4j/calendar/h;
    .locals 18

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    sget-object v3, Lgj/a;->c:Lfj/c;

    .line 8
    .line 9
    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 10
    .line 11
    invoke-interface {v2, v3, v4}, Lfj/d;->a(Lfj/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    check-cast v3, Ljava/util/Locale;

    .line 16
    .line 17
    invoke-interface/range {p1 .. p1}, Ljava/lang/CharSequence;->length()I

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    invoke-virtual/range {p2 .. p2}, Ljava/text/ParsePosition;->getIndex()I

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    const/4 v6, 0x0

    .line 26
    if-lt v5, v4, :cond_0

    .line 27
    .line 28
    invoke-virtual {v1, v4}, Ljava/text/ParsePosition;->setErrorIndex(I)V

    .line 29
    .line 30
    .line 31
    return-object v6

    .line 32
    :cond_0
    sget-object v7, Lij/a;->b:Lfj/c;

    .line 33
    .line 34
    invoke-interface {v2, v7}, Lfj/d;->b(Lfj/c;)Z

    .line 35
    .line 36
    .line 37
    move-result v7

    .line 38
    const/4 v8, 0x0

    .line 39
    const/4 v9, 0x1

    .line 40
    if-eqz v7, :cond_9

    .line 41
    .line 42
    const-string v7, "generic"

    .line 43
    .line 44
    invoke-static {v7, v3}, Lgj/b;->c(Ljava/lang/String;Ljava/util/Locale;)Lgj/b;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    invoke-virtual {v3}, Lgj/b;->o()Ljava/util/Map;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    sget-object v7, Lgj/a;->l:Lfj/c;

    .line 53
    .line 54
    sget-object v10, Lgj/j;->k:Lgj/j;

    .line 55
    .line 56
    invoke-interface {v2, v7, v10}, Lfj/d;->a(Lfj/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v7

    .line 60
    check-cast v7, Lgj/j;

    .line 61
    .line 62
    sget-object v10, Lgj/a;->m:Lfj/c;

    .line 63
    .line 64
    invoke-virtual {v7}, Lgj/j;->l()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v11

    .line 68
    invoke-virtual {v11, v8}, Ljava/lang/String;->charAt(I)C

    .line 69
    .line 70
    .line 71
    move-result v11

    .line 72
    invoke-static {v11}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 73
    .line 74
    .line 75
    move-result-object v11

    .line 76
    invoke-interface {v2, v10, v11}, Lfj/d;->a(Lfj/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v10

    .line 80
    check-cast v10, Ljava/lang/Character;

    .line 81
    .line 82
    invoke-virtual {v10}, Ljava/lang/Character;->charValue()C

    .line 83
    .line 84
    .line 85
    move-result v10

    .line 86
    sget-object v11, Lnet/time4j/calendar/h;->l:Lfj/c;

    .line 87
    .line 88
    const-string v12, "leap-alignment"

    .line 89
    .line 90
    invoke-interface {v3, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v12

    .line 94
    const-string v13, "R"

    .line 95
    .line 96
    invoke-virtual {v13, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v12

    .line 100
    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 101
    .line 102
    .line 103
    move-result-object v12

    .line 104
    invoke-interface {v2, v11, v12}, Lfj/d;->a(Lfj/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v11

    .line 108
    check-cast v11, Ljava/lang/Boolean;

    .line 109
    .line 110
    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    .line 111
    .line 112
    .line 113
    move-result v11

    .line 114
    sget-object v12, Lnet/time4j/calendar/h;->k:Lfj/c;

    .line 115
    .line 116
    const-string v13, "leap-indicator"

    .line 117
    .line 118
    invoke-interface {v3, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    check-cast v3, Ljava/lang/String;

    .line 123
    .line 124
    invoke-virtual {v3, v8}, Ljava/lang/String;->charAt(I)C

    .line 125
    .line 126
    .line 127
    move-result v3

    .line 128
    invoke-static {v3}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    invoke-interface {v2, v12, v3}, Lfj/d;->a(Lfj/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    check-cast v2, Ljava/lang/Character;

    .line 137
    .line 138
    invoke-virtual {v2}, Ljava/lang/Character;->charValue()C

    .line 139
    .line 140
    .line 141
    move-result v2

    .line 142
    if-nez v11, :cond_1

    .line 143
    .line 144
    invoke-interface {v0, v5}, Ljava/lang/CharSequence;->charAt(I)C

    .line 145
    .line 146
    .line 147
    move-result v3

    .line 148
    if-ne v3, v2, :cond_1

    .line 149
    .line 150
    add-int/lit8 v3, v5, 0x1

    .line 151
    .line 152
    move v12, v9

    .line 153
    goto :goto_0

    .line 154
    :cond_1
    move v3, v5

    .line 155
    move v12, v8

    .line 156
    :goto_0
    invoke-virtual {v7}, Lgj/j;->n()Z

    .line 157
    .line 158
    .line 159
    move-result v13

    .line 160
    if-eqz v13, :cond_2

    .line 161
    .line 162
    :goto_1
    if-ge v3, v4, :cond_2

    .line 163
    .line 164
    invoke-interface {v0, v3}, Ljava/lang/CharSequence;->charAt(I)C

    .line 165
    .line 166
    .line 167
    move-result v13

    .line 168
    if-ne v13, v10, :cond_2

    .line 169
    .line 170
    add-int/lit8 v3, v3, 0x1

    .line 171
    .line 172
    goto :goto_1

    .line 173
    :cond_2
    const/16 v13, 0xc

    .line 174
    .line 175
    move v14, v8

    .line 176
    :goto_2
    if-lt v13, v9, :cond_6

    .line 177
    .line 178
    if-nez v14, :cond_6

    .line 179
    .line 180
    invoke-static {v7, v10, v13}, Lij/b;->a(Lgj/j;CI)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v15

    .line 184
    invoke-virtual {v15}, Ljava/lang/String;->length()I

    .line 185
    .line 186
    .line 187
    move-result v8

    .line 188
    const/4 v9, 0x0

    .line 189
    :goto_3
    add-int v6, v3, v9

    .line 190
    .line 191
    if-le v4, v6, :cond_3

    .line 192
    .line 193
    invoke-interface {v0, v6}, Ljava/lang/CharSequence;->charAt(I)C

    .line 194
    .line 195
    .line 196
    move-result v6

    .line 197
    move-object/from16 v17, v7

    .line 198
    .line 199
    invoke-virtual {v15, v9}, Ljava/lang/String;->charAt(I)C

    .line 200
    .line 201
    .line 202
    move-result v7

    .line 203
    if-eq v6, v7, :cond_4

    .line 204
    .line 205
    goto :goto_4

    .line 206
    :cond_3
    move-object/from16 v17, v7

    .line 207
    .line 208
    :cond_4
    add-int/lit8 v9, v9, 0x1

    .line 209
    .line 210
    if-ne v9, v8, :cond_5

    .line 211
    .line 212
    add-int/2addr v3, v8

    .line 213
    move v14, v13

    .line 214
    :goto_4
    add-int/lit8 v13, v13, -0x1

    .line 215
    .line 216
    move-object/from16 v7, v17

    .line 217
    .line 218
    const/4 v6, 0x0

    .line 219
    const/4 v8, 0x0

    .line 220
    const/4 v9, 0x1

    .line 221
    goto :goto_2

    .line 222
    :cond_5
    move-object/from16 v7, v17

    .line 223
    .line 224
    goto :goto_3

    .line 225
    :cond_6
    if-nez v14, :cond_7

    .line 226
    .line 227
    invoke-virtual {v1, v5}, Ljava/text/ParsePosition;->setErrorIndex(I)V

    .line 228
    .line 229
    .line 230
    :goto_5
    const/4 v0, 0x0

    .line 231
    return-object v0

    .line 232
    :cond_7
    if-eqz v11, :cond_8

    .line 233
    .line 234
    if-le v4, v3, :cond_8

    .line 235
    .line 236
    invoke-interface {v0, v3}, Ljava/lang/CharSequence;->charAt(I)C

    .line 237
    .line 238
    .line 239
    move-result v0

    .line 240
    if-ne v0, v2, :cond_8

    .line 241
    .line 242
    add-int/lit8 v3, v3, 0x1

    .line 243
    .line 244
    const/4 v9, 0x1

    .line 245
    goto :goto_6

    .line 246
    :cond_8
    move v9, v12

    .line 247
    :goto_6
    invoke-static {v14}, Lnet/time4j/calendar/h;->e(I)Lnet/time4j/calendar/h;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    invoke-virtual {v1, v3}, Ljava/text/ParsePosition;->setIndex(I)V

    .line 252
    .line 253
    .line 254
    goto :goto_8

    .line 255
    :cond_9
    sget-object v4, Lgj/a;->g:Lfj/c;

    .line 256
    .line 257
    sget-object v6, Lgj/v;->k:Lgj/v;

    .line 258
    .line 259
    invoke-interface {v2, v4, v6}, Lfj/d;->a(Lfj/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v4

    .line 263
    check-cast v4, Lgj/v;

    .line 264
    .line 265
    sget-object v6, Lgj/a;->h:Lfj/c;

    .line 266
    .line 267
    sget-object v7, Lgj/m;->k:Lgj/m;

    .line 268
    .line 269
    invoke-interface {v2, v6, v7}, Lfj/d;->a(Lfj/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v6

    .line 273
    check-cast v6, Lgj/m;

    .line 274
    .line 275
    const-string v7, "chinese"

    .line 276
    .line 277
    invoke-static {v7, v3}, Lgj/b;->c(Ljava/lang/String;Ljava/util/Locale;)Lgj/b;

    .line 278
    .line 279
    .line 280
    move-result-object v8

    .line 281
    invoke-virtual {v8, v4, v6}, Lgj/b;->l(Lgj/v;Lgj/m;)Lgj/s;

    .line 282
    .line 283
    .line 284
    move-result-object v8

    .line 285
    const-class v9, Lnet/time4j/b0;

    .line 286
    .line 287
    invoke-virtual {v8, v0, v1, v9, v2}, Lgj/s;->c(Ljava/lang/CharSequence;Ljava/text/ParsePosition;Ljava/lang/Class;Lfj/d;)Ljava/lang/Enum;

    .line 288
    .line 289
    .line 290
    move-result-object v8

    .line 291
    check-cast v8, Lnet/time4j/b0;

    .line 292
    .line 293
    if-nez v8, :cond_a

    .line 294
    .line 295
    const/4 v8, -0x1

    .line 296
    invoke-virtual {v1, v8}, Ljava/text/ParsePosition;->setErrorIndex(I)V

    .line 297
    .line 298
    .line 299
    invoke-virtual {v1, v5}, Ljava/text/ParsePosition;->setIndex(I)V

    .line 300
    .line 301
    .line 302
    invoke-static {v7, v3}, Lgj/b;->c(Ljava/lang/String;Ljava/util/Locale;)Lgj/b;

    .line 303
    .line 304
    .line 305
    move-result-object v3

    .line 306
    invoke-virtual {v3, v4, v6}, Lgj/b;->g(Lgj/v;Lgj/m;)Lgj/s;

    .line 307
    .line 308
    .line 309
    move-result-object v3

    .line 310
    invoke-virtual {v3, v0, v1, v9, v2}, Lgj/s;->c(Ljava/lang/CharSequence;Ljava/text/ParsePosition;Ljava/lang/Class;Lfj/d;)Ljava/lang/Enum;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    move-object v8, v0

    .line 315
    check-cast v8, Lnet/time4j/b0;

    .line 316
    .line 317
    if-eqz v8, :cond_a

    .line 318
    .line 319
    const/16 v16, 0x1

    .line 320
    .line 321
    goto :goto_7

    .line 322
    :cond_a
    const/16 v16, 0x0

    .line 323
    .line 324
    :goto_7
    if-nez v8, :cond_b

    .line 325
    .line 326
    invoke-virtual {v1, v5}, Ljava/text/ParsePosition;->setErrorIndex(I)V

    .line 327
    .line 328
    .line 329
    goto :goto_5

    .line 330
    :cond_b
    invoke-virtual {v8}, Lnet/time4j/b0;->b()I

    .line 331
    .line 332
    .line 333
    move-result v0

    .line 334
    invoke-static {v0}, Lnet/time4j/calendar/h;->e(I)Lnet/time4j/calendar/h;

    .line 335
    .line 336
    .line 337
    move-result-object v0

    .line 338
    move/from16 v9, v16

    .line 339
    .line 340
    :goto_8
    if-eqz v9, :cond_c

    .line 341
    .line 342
    invoke-virtual {v0}, Lnet/time4j/calendar/h;->f()Lnet/time4j/calendar/h;

    .line 343
    .line 344
    .line 345
    move-result-object v0

    .line 346
    :cond_c
    return-object v0
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

.method public getType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lnet/time4j/calendar/h;",
            ">;"
        }
    .end annotation

    const-class v0, Lnet/time4j/calendar/h;

    return-object v0
.end method

.method public i(Lfj/o;Ljava/lang/Appendable;Lfj/d;)V
    .locals 4

    .line 1
    sget-object v0, Lgj/a;->c:Lfj/c;

    .line 2
    .line 3
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 4
    .line 5
    invoke-interface {p3, v0, v1}, Lfj/d;->a(Lfj/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ljava/util/Locale;

    .line 10
    .line 11
    invoke-interface {p1, p0}, Lfj/o;->k(Lfj/p;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Lnet/time4j/calendar/h;

    .line 16
    .line 17
    sget-object v1, Lij/a;->b:Lfj/c;

    .line 18
    .line 19
    invoke-interface {p3, v1}, Lfj/d;->b(Lfj/c;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    sget-object v1, Lgj/a;->l:Lfj/c;

    .line 26
    .line 27
    sget-object v2, Lgj/j;->k:Lgj/j;

    .line 28
    .line 29
    invoke-interface {p3, v1, v2}, Lfj/d;->a(Lfj/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    check-cast v1, Lgj/j;

    .line 34
    .line 35
    invoke-virtual {p1, v0, v1, p3}, Lnet/time4j/calendar/h;->b(Ljava/util/Locale;Lgj/j;Lfj/d;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-interface {p2, p1}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_0
    sget-object v1, Lgj/a;->g:Lfj/c;

    .line 44
    .line 45
    sget-object v2, Lgj/v;->k:Lgj/v;

    .line 46
    .line 47
    invoke-interface {p3, v1, v2}, Lfj/d;->a(Lfj/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    check-cast v1, Lgj/v;

    .line 52
    .line 53
    sget-object v2, Lgj/a;->h:Lfj/c;

    .line 54
    .line 55
    sget-object v3, Lgj/m;->k:Lgj/m;

    .line 56
    .line 57
    invoke-interface {p3, v2, v3}, Lfj/d;->a(Lfj/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p3

    .line 61
    check-cast p3, Lgj/m;

    .line 62
    .line 63
    invoke-virtual {p1}, Lnet/time4j/calendar/h;->c()Z

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    const-string v3, "chinese"

    .line 68
    .line 69
    if-eqz v2, :cond_1

    .line 70
    .line 71
    invoke-static {v3, v0}, Lgj/b;->c(Ljava/lang/String;Ljava/util/Locale;)Lgj/b;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-virtual {v0, v1, p3}, Lgj/b;->g(Lgj/v;Lgj/m;)Lgj/s;

    .line 76
    .line 77
    .line 78
    move-result-object p3

    .line 79
    goto :goto_0

    .line 80
    :cond_1
    invoke-static {v3, v0}, Lgj/b;->c(Ljava/lang/String;Ljava/util/Locale;)Lgj/b;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-virtual {v0, v1, p3}, Lgj/b;->l(Lgj/v;Lgj/m;)Lgj/s;

    .line 85
    .line 86
    .line 87
    move-result-object p3

    .line 88
    :goto_0
    invoke-virtual {p1}, Lnet/time4j/calendar/h;->getNumber()I

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    invoke-static {p1}, Lnet/time4j/b0;->e(I)Lnet/time4j/b0;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-virtual {p3, p1}, Lgj/s;->f(Ljava/lang/Enum;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-interface {p2, p1}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 101
    .line 102
    .line 103
    :goto_1
    return-void
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

.method public n()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public name()Ljava/lang/String;
    .locals 1

    const-string v0, "MONTH_OF_YEAR"

    return-object v0
.end method

.method protected readResolve()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lnet/time4j/calendar/g;->k:Lnet/time4j/calendar/g;

    return-object v0
.end method
