.class final Lhj/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lhj/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhj/h<",
            "*>;"
        }
    .end annotation
.end field

.field private final b:I

.field private final c:I

.field private final d:Lhj/b;

.field private final e:Lfj/d;

.field private final f:I

.field private final g:I

.field private final h:I

.field private final i:Z

.field private final j:I


# direct methods
.method constructor <init>(Lhj/h;IILhj/b;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhj/h<",
            "*>;II",
            "Lhj/b;",
            ")V"
        }
    .end annotation

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, -0x1

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    .line 1
    invoke-direct/range {v0 .. v10}, Lhj/i;-><init>(Lhj/h;IILhj/b;Lfj/d;IIIZI)V

    return-void
.end method

.method private constructor <init>(Lhj/h;IILhj/b;Lfj/d;IIIZI)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhj/h<",
            "*>;II",
            "Lhj/b;",
            "Lfj/d;",
            "IIIZI)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_5

    if-ltz p2, :cond_4

    if-ltz p3, :cond_3

    if-ltz p6, :cond_2

    const-string v0, "Invalid pad-width: "

    if-ltz p7, :cond_1

    if-ltz p8, :cond_0

    .line 3
    iput-object p1, p0, Lhj/i;->a:Lhj/h;

    .line 4
    iput p2, p0, Lhj/i;->b:I

    .line 5
    iput p3, p0, Lhj/i;->c:I

    .line 6
    iput-object p4, p0, Lhj/i;->d:Lhj/b;

    .line 7
    iput-object p5, p0, Lhj/i;->e:Lfj/d;

    .line 8
    iput p6, p0, Lhj/i;->f:I

    .line 9
    iput p7, p0, Lhj/i;->g:I

    .line 10
    iput p8, p0, Lhj/i;->h:I

    .line 11
    iput-boolean p9, p0, Lhj/i;->i:Z

    .line 12
    iput p10, p0, Lhj/i;->j:I

    return-void

    .line 13
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 14
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 15
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Reserved chars must not be negative: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 16
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "Invalid section: "

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 17
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "Invalid level: "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 18
    :cond_5
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Missing format processor."

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private a(Ljava/lang/CharSequence;Lhj/s;Lfj/d;Lhj/t;Z)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/CharSequence;",
            "Lhj/s;",
            "Lfj/d;",
            "Lhj/t<",
            "*>;Z)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p2}, Lhj/s;->f()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    :try_start_0
    iget-object v1, p0, Lhj/i;->a:Lhj/h;

    .line 6
    .line 7
    move-object v2, p1

    .line 8
    move-object v3, p2

    .line 9
    move-object v4, p3

    .line 10
    move-object v5, p4

    .line 11
    move v6, p5

    .line 12
    invoke-interface/range {v1 .. v6}, Lhj/h;->i(Ljava/lang/CharSequence;Lhj/s;Lfj/d;Lhj/t;Z)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catch_0
    move-exception p1

    .line 17
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p2, v0, p1}, Lhj/s;->k(ILjava/lang/String;)V

    .line 22
    .line 23
    .line 24
    :goto_0
    return-void
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
.end method

.method private c(Lfj/d;)C
    .locals 2

    sget-object v0, Lgj/a;->p:Lfj/c;

    const/16 v1, 0x20

    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lfj/d;->a(Lfj/c;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Character;

    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    move-result p1

    return p1
.end method

.method private e(Lfj/d;)Lfj/d;
    .locals 2

    .line 1
    iget-object v0, p0, Lhj/i;->d:Lhj/b;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-object p1

    .line 6
    :cond_0
    new-instance v1, Lhj/p;

    .line 7
    .line 8
    invoke-direct {v1, v0, p1}, Lhj/p;-><init>(Lfj/d;Lfj/d;)V

    .line 9
    .line 10
    .line 11
    return-object v1
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

.method private static h(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    if-nez p0, :cond_1

    if-nez p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    :goto_0
    return p0
.end method

.method private k(Lfj/o;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lhj/i;->d:Lhj/b;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    invoke-virtual {v0}, Lhj/b;->f()Lfj/n;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    invoke-interface {v0, p1}, Lfj/n;->test(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    const/4 v1, 0x0

    .line 21
    :cond_2
    :goto_0
    return v1
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method private l(Lfj/d;)Z
    .locals 2

    sget-object v0, Lgj/a;->f:Lfj/c;

    sget-object v1, Lgj/g;->l:Lgj/g;

    invoke-interface {p1, v0, v1}, Lfj/d;->a(Lfj/c;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lgj/g;

    invoke-virtual {p1}, Lgj/g;->c()Z

    move-result p1

    return p1
.end method

.method private o()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Pad width exceeded: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lhj/i;->a:Lhj/h;

    invoke-interface {v1}, Lhj/h;->c()Lfj/p;

    move-result-object v1

    invoke-interface {v1}, Lfj/p;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private p()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Pad width mismatched: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lhj/i;->a:Lhj/h;

    invoke-interface {v1}, Lhj/h;->c()Lfj/p;

    move-result-object v1

    invoke-interface {v1}, Lfj/p;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static w(Lhj/h;Lfj/p;)Lhj/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Lhj/h<",
            "TV;>;",
            "Lfj/p<",
            "*>;)",
            "Lhj/h<",
            "TV;>;"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Lhj/h;->c()Lfj/p;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    invoke-interface {p0}, Lhj/h;->c()Lfj/p;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0}, Lfj/p;->getType()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-interface {p1}, Lfj/p;->getType()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    if-eq v0, v1, :cond_2

    .line 21
    .line 22
    instance-of v0, p1, Lij/a;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 28
    .line 29
    new-instance v0, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 32
    .line 33
    .line 34
    const-string v1, "Cannot change element value type: "

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-interface {p1}, Lfj/p;->name()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p0

    .line 54
    :cond_2
    :goto_0
    invoke-interface {p0, p1}, Lhj/h;->f(Lfj/p;)Lhj/h;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    return-object p0
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


# virtual methods
.method b()I
    .locals 1

    iget v0, p0, Lhj/i;->b:I

    return v0
.end method

.method d()Lhj/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhj/h<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Lhj/i;->a:Lhj/h;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lhj/i;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_2

    .line 9
    .line 10
    check-cast p1, Lhj/i;

    .line 11
    .line 12
    iget-object v1, p0, Lhj/i;->a:Lhj/h;

    .line 13
    .line 14
    iget-object v3, p1, Lhj/i;->a:Lhj/h;

    .line 15
    .line 16
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    iget v1, p0, Lhj/i;->b:I

    .line 23
    .line 24
    iget v3, p1, Lhj/i;->b:I

    .line 25
    .line 26
    if-ne v1, v3, :cond_1

    .line 27
    .line 28
    iget v1, p0, Lhj/i;->c:I

    .line 29
    .line 30
    iget v3, p1, Lhj/i;->c:I

    .line 31
    .line 32
    if-ne v1, v3, :cond_1

    .line 33
    .line 34
    iget-object v1, p0, Lhj/i;->d:Lhj/b;

    .line 35
    .line 36
    iget-object v3, p1, Lhj/i;->d:Lhj/b;

    .line 37
    .line 38
    invoke-static {v1, v3}, Lhj/i;->h(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_1

    .line 43
    .line 44
    iget-object v1, p0, Lhj/i;->e:Lfj/d;

    .line 45
    .line 46
    iget-object v3, p1, Lhj/i;->e:Lfj/d;

    .line 47
    .line 48
    invoke-static {v1, v3}, Lhj/i;->h(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_1

    .line 53
    .line 54
    iget v1, p0, Lhj/i;->f:I

    .line 55
    .line 56
    iget v3, p1, Lhj/i;->f:I

    .line 57
    .line 58
    if-ne v1, v3, :cond_1

    .line 59
    .line 60
    iget v1, p0, Lhj/i;->g:I

    .line 61
    .line 62
    iget v3, p1, Lhj/i;->g:I

    .line 63
    .line 64
    if-ne v1, v3, :cond_1

    .line 65
    .line 66
    iget v1, p0, Lhj/i;->h:I

    .line 67
    .line 68
    iget v3, p1, Lhj/i;->h:I

    .line 69
    .line 70
    if-ne v1, v3, :cond_1

    .line 71
    .line 72
    iget-boolean v1, p0, Lhj/i;->i:Z

    .line 73
    .line 74
    iget-boolean v3, p1, Lhj/i;->i:Z

    .line 75
    .line 76
    if-ne v1, v3, :cond_1

    .line 77
    .line 78
    iget v1, p0, Lhj/i;->j:I

    .line 79
    .line 80
    iget p1, p1, Lhj/i;->j:I

    .line 81
    .line 82
    if-ne v1, p1, :cond_1

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_1
    move v0, v2

    .line 86
    :goto_0
    return v0

    .line 87
    :cond_2
    return v2
    .line 88
    .line 89
    .line 90
.end method

.method f()I
    .locals 1

    iget v0, p0, Lhj/i;->c:I

    return v0
.end method

.method g()Z
    .locals 1

    iget-object v0, p0, Lhj/i;->a:Lhj/h;

    instance-of v0, v0, Lhj/j;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lhj/i;->a:Lhj/h;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x7

    .line 8
    .line 9
    iget-object v1, p0, Lhj/i;->d:Lhj/b;

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {v1}, Lhj/b;->hashCode()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    :goto_0
    mul-int/lit8 v1, v1, 0x1f

    .line 20
    .line 21
    add-int/2addr v0, v1

    .line 22
    return v0
    .line 23
    .line 24
.end method

.method i()Z
    .locals 1

    iget-boolean v0, p0, Lhj/i;->i:Z

    return v0
.end method

.method j()Z
    .locals 1

    iget-object v0, p0, Lhj/i;->a:Lhj/h;

    invoke-interface {v0}, Lhj/h;->h()Z

    move-result v0

    return v0
.end method

.method m(I)Lhj/i;
    .locals 12

    .line 1
    iget-boolean v0, p0, Lhj/i;->i:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lhj/i;

    .line 6
    .line 7
    iget-object v2, p0, Lhj/i;->a:Lhj/h;

    .line 8
    .line 9
    iget v3, p0, Lhj/i;->b:I

    .line 10
    .line 11
    iget v4, p0, Lhj/i;->c:I

    .line 12
    .line 13
    iget-object v5, p0, Lhj/i;->d:Lhj/b;

    .line 14
    .line 15
    iget-object v6, p0, Lhj/i;->e:Lfj/d;

    .line 16
    .line 17
    iget v7, p0, Lhj/i;->f:I

    .line 18
    .line 19
    iget v8, p0, Lhj/i;->g:I

    .line 20
    .line 21
    iget v9, p0, Lhj/i;->h:I

    .line 22
    .line 23
    const/4 v10, 0x1

    .line 24
    move-object v1, v0

    .line 25
    move v11, p1

    .line 26
    invoke-direct/range {v1 .. v11}, Lhj/i;-><init>(Lhj/h;IILhj/b;Lfj/d;IIIZI)V

    .line 27
    .line 28
    .line 29
    return-object v0

    .line 30
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 31
    .line 32
    const-string v0, "This step is not starting an or-block."

    .line 33
    .line 34
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw p1
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
.end method

.method n(II)Lhj/i;
    .locals 12

    new-instance v11, Lhj/i;

    iget-object v1, p0, Lhj/i;->a:Lhj/h;

    iget v2, p0, Lhj/i;->b:I

    iget v3, p0, Lhj/i;->c:I

    iget-object v4, p0, Lhj/i;->d:Lhj/b;

    const/4 v5, 0x0

    iget v6, p0, Lhj/i;->f:I

    iget v0, p0, Lhj/i;->g:I

    add-int v7, v0, p1

    iget p1, p0, Lhj/i;->h:I

    add-int v8, p1, p2

    iget-boolean v9, p0, Lhj/i;->i:Z

    iget v10, p0, Lhj/i;->j:I

    move-object v0, v11

    invoke-direct/range {v0 .. v10}, Lhj/i;-><init>(Lhj/h;IILhj/b;Lfj/d;IIIZI)V

    return-object v11
.end method

.method q(Ljava/lang/CharSequence;Lhj/s;Lfj/d;Lhj/t;Z)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/CharSequence;",
            "Lhj/s;",
            "Lfj/d;",
            "Lhj/t<",
            "*>;Z)V"
        }
    .end annotation

    .line 1
    if-eqz p5, :cond_0

    .line 2
    .line 3
    iget-object p3, p0, Lhj/i;->e:Lfj/d;

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-direct {p0, p3}, Lhj/i;->e(Lfj/d;)Lfj/d;

    .line 7
    .line 8
    .line 9
    move-result-object p3

    .line 10
    :goto_0
    move-object v3, p3

    .line 11
    iget p3, p0, Lhj/i;->g:I

    .line 12
    .line 13
    if-nez p3, :cond_1

    .line 14
    .line 15
    iget p3, p0, Lhj/i;->h:I

    .line 16
    .line 17
    if-nez p3, :cond_1

    .line 18
    .line 19
    move-object v0, p0

    .line 20
    move-object v1, p1

    .line 21
    move-object v2, p2

    .line 22
    move-object v4, p4

    .line 23
    move v5, p5

    .line 24
    invoke-direct/range {v0 .. v5}, Lhj/i;->a(Ljava/lang/CharSequence;Lhj/s;Lfj/d;Lhj/t;Z)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    invoke-direct {p0, v3}, Lhj/i;->l(Lfj/d;)Z

    .line 29
    .line 30
    .line 31
    move-result p3

    .line 32
    invoke-direct {p0, v3}, Lhj/i;->c(Lfj/d;)C

    .line 33
    .line 34
    .line 35
    move-result v6

    .line 36
    invoke-virtual {p2}, Lhj/s;->f()I

    .line 37
    .line 38
    .line 39
    move-result v7

    .line 40
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 41
    .line 42
    .line 43
    move-result v8

    .line 44
    move v0, v7

    .line 45
    :goto_1
    if-ge v0, v8, :cond_2

    .line 46
    .line 47
    invoke-interface {p1, v0}, Ljava/lang/CharSequence;->charAt(I)C

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-ne v1, v6, :cond_2

    .line 52
    .line 53
    add-int/lit8 v0, v0, 0x1

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_2
    sub-int v9, v0, v7

    .line 57
    .line 58
    if-eqz p3, :cond_3

    .line 59
    .line 60
    iget v1, p0, Lhj/i;->g:I

    .line 61
    .line 62
    if-le v9, v1, :cond_3

    .line 63
    .line 64
    invoke-direct {p0}, Lhj/i;->o()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-virtual {p2, v7, p1}, Lhj/s;->k(ILjava/lang/String;)V

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :cond_3
    invoke-virtual {p2, v0}, Lhj/s;->l(I)V

    .line 73
    .line 74
    .line 75
    move-object v0, p0

    .line 76
    move-object v1, p1

    .line 77
    move-object v2, p2

    .line 78
    move-object v4, p4

    .line 79
    move v5, p5

    .line 80
    invoke-direct/range {v0 .. v5}, Lhj/i;->a(Ljava/lang/CharSequence;Lhj/s;Lfj/d;Lhj/t;Z)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p2}, Lhj/s;->i()Z

    .line 84
    .line 85
    .line 86
    move-result p4

    .line 87
    if-eqz p4, :cond_4

    .line 88
    .line 89
    return-void

    .line 90
    :cond_4
    invoke-virtual {p2}, Lhj/s;->f()I

    .line 91
    .line 92
    .line 93
    move-result p4

    .line 94
    sub-int p5, p4, v7

    .line 95
    .line 96
    sub-int/2addr p5, v9

    .line 97
    if-eqz p3, :cond_5

    .line 98
    .line 99
    iget v0, p0, Lhj/i;->g:I

    .line 100
    .line 101
    if-lez v0, :cond_5

    .line 102
    .line 103
    add-int/2addr v9, p5

    .line 104
    if-eq v9, v0, :cond_5

    .line 105
    .line 106
    invoke-direct {p0}, Lhj/i;->p()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-virtual {p2, v7, p1}, Lhj/s;->k(ILjava/lang/String;)V

    .line 111
    .line 112
    .line 113
    return-void

    .line 114
    :cond_5
    const/4 v0, 0x0

    .line 115
    :goto_2
    if-ge p4, v8, :cond_7

    .line 116
    .line 117
    if-eqz p3, :cond_6

    .line 118
    .line 119
    add-int v1, p5, v0

    .line 120
    .line 121
    iget v2, p0, Lhj/i;->h:I

    .line 122
    .line 123
    if-ge v1, v2, :cond_7

    .line 124
    .line 125
    :cond_6
    invoke-interface {p1, p4}, Ljava/lang/CharSequence;->charAt(I)C

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    if-ne v1, v6, :cond_7

    .line 130
    .line 131
    add-int/lit8 p4, p4, 0x1

    .line 132
    .line 133
    add-int/lit8 v0, v0, 0x1

    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_7
    if-eqz p3, :cond_8

    .line 137
    .line 138
    iget p1, p0, Lhj/i;->h:I

    .line 139
    .line 140
    if-lez p1, :cond_8

    .line 141
    .line 142
    add-int/2addr p5, v0

    .line 143
    if-eq p5, p1, :cond_8

    .line 144
    .line 145
    sub-int/2addr p4, v0

    .line 146
    invoke-direct {p0}, Lhj/i;->p()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    invoke-virtual {p2, p4, p1}, Lhj/s;->k(ILjava/lang/String;)V

    .line 151
    .line 152
    .line 153
    return-void

    .line 154
    :cond_8
    invoke-virtual {p2, p4}, Lhj/s;->l(I)V

    .line 155
    .line 156
    .line 157
    return-void
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
.end method

.method r(Lfj/o;Ljava/lang/Appendable;Lfj/d;Ljava/util/Set;Z)I
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/o;",
            "Ljava/lang/Appendable;",
            "Lfj/d;",
            "Ljava/util/Set<",
            "Lhj/g;",
            ">;Z)I"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v3, p2

    .line 4
    .line 5
    move-object/from16 v5, p4

    .line 6
    .line 7
    invoke-direct/range {p0 .. p1}, Lhj/i;->k(Lfj/o;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x0

    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    return v2

    .line 15
    :cond_0
    if-eqz p5, :cond_1

    .line 16
    .line 17
    iget-object v1, v0, Lhj/i;->e:Lfj/d;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    move-object/from16 v1, p3

    .line 21
    .line 22
    invoke-direct {v0, v1}, Lhj/i;->e(Lfj/d;)Lfj/d;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    :goto_0
    move-object v9, v1

    .line 27
    iget v1, v0, Lhj/i;->g:I

    .line 28
    .line 29
    if-nez v1, :cond_2

    .line 30
    .line 31
    iget v1, v0, Lhj/i;->h:I

    .line 32
    .line 33
    if-nez v1, :cond_2

    .line 34
    .line 35
    iget-object v1, v0, Lhj/i;->a:Lhj/h;

    .line 36
    .line 37
    move-object/from16 v2, p1

    .line 38
    .line 39
    move-object/from16 v3, p2

    .line 40
    .line 41
    move-object v4, v9

    .line 42
    move-object/from16 v5, p4

    .line 43
    .line 44
    move/from16 v6, p5

    .line 45
    .line 46
    invoke-interface/range {v1 .. v6}, Lhj/h;->e(Lfj/o;Ljava/lang/Appendable;Lfj/d;Ljava/util/Set;Z)I

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    return v1

    .line 51
    :cond_2
    instance-of v1, v3, Ljava/lang/StringBuilder;

    .line 52
    .line 53
    const/4 v4, -0x1

    .line 54
    if-eqz v1, :cond_3

    .line 55
    .line 56
    move-object v1, v3

    .line 57
    check-cast v1, Ljava/lang/StringBuilder;

    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    .line 60
    .line 61
    .line 62
    move-result v6

    .line 63
    move v12, v6

    .line 64
    goto :goto_1

    .line 65
    :cond_3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 66
    .line 67
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    move v12, v4

    .line 71
    :goto_1
    instance-of v6, v3, Ljava/lang/CharSequence;

    .line 72
    .line 73
    if-eqz v6, :cond_6

    .line 74
    .line 75
    if-eqz v5, :cond_6

    .line 76
    .line 77
    if-ne v1, v3, :cond_5

    .line 78
    .line 79
    iget-object v6, v0, Lhj/i;->a:Lhj/h;

    .line 80
    .line 81
    instance-of v7, v6, Lhj/f;

    .line 82
    .line 83
    if-nez v7, :cond_4

    .line 84
    .line 85
    instance-of v6, v6, Lhj/z;

    .line 86
    .line 87
    if-eqz v6, :cond_5

    .line 88
    .line 89
    :cond_4
    move v6, v2

    .line 90
    goto :goto_2

    .line 91
    :cond_5
    move-object v6, v3

    .line 92
    check-cast v6, Ljava/lang/CharSequence;

    .line 93
    .line 94
    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    .line 95
    .line 96
    .line 97
    move-result v6

    .line 98
    :goto_2
    new-instance v7, Ljava/util/LinkedHashSet;

    .line 99
    .line 100
    invoke-direct {v7}, Ljava/util/LinkedHashSet;-><init>()V

    .line 101
    .line 102
    .line 103
    move v13, v6

    .line 104
    goto :goto_3

    .line 105
    :cond_6
    const/4 v7, 0x0

    .line 106
    move v13, v4

    .line 107
    :goto_3
    move-object v14, v7

    .line 108
    invoke-direct {v0, v9}, Lhj/i;->l(Lfj/d;)Z

    .line 109
    .line 110
    .line 111
    move-result v15

    .line 112
    invoke-direct {v0, v9}, Lhj/i;->c(Lfj/d;)C

    .line 113
    .line 114
    .line 115
    move-result v11

    .line 116
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    .line 117
    .line 118
    .line 119
    move-result v16

    .line 120
    iget-object v6, v0, Lhj/i;->a:Lhj/h;

    .line 121
    .line 122
    move-object/from16 v7, p1

    .line 123
    .line 124
    move-object v8, v1

    .line 125
    move-object v10, v14

    .line 126
    move v2, v11

    .line 127
    move/from16 v11, p5

    .line 128
    .line 129
    invoke-interface/range {v6 .. v11}, Lhj/h;->e(Lfj/o;Ljava/lang/Appendable;Lfj/d;Ljava/util/Set;Z)I

    .line 130
    .line 131
    .line 132
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    .line 133
    .line 134
    .line 135
    move-result v6

    .line 136
    sub-int v6, v6, v16

    .line 137
    .line 138
    iget v7, v0, Lhj/i;->g:I

    .line 139
    .line 140
    if-lez v7, :cond_f

    .line 141
    .line 142
    if-eqz v15, :cond_8

    .line 143
    .line 144
    if-gt v6, v7, :cond_7

    .line 145
    .line 146
    goto :goto_4

    .line 147
    :cond_7
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 148
    .line 149
    invoke-direct/range {p0 .. p0}, Lhj/i;->o()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    throw v1

    .line 157
    :cond_8
    :goto_4
    move v7, v6

    .line 158
    const/16 v17, 0x0

    .line 159
    .line 160
    :goto_5
    iget v8, v0, Lhj/i;->g:I

    .line 161
    .line 162
    if-ge v7, v8, :cond_a

    .line 163
    .line 164
    if-ne v12, v4, :cond_9

    .line 165
    .line 166
    invoke-interface {v3, v2}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    .line 167
    .line 168
    .line 169
    goto :goto_6

    .line 170
    :cond_9
    invoke-virtual {v1, v12, v2}, Ljava/lang/StringBuilder;->insert(IC)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    :goto_6
    add-int/lit8 v7, v7, 0x1

    .line 174
    .line 175
    add-int/lit8 v17, v17, 0x1

    .line 176
    .line 177
    goto :goto_5

    .line 178
    :cond_a
    if-ne v12, v4, :cond_b

    .line 179
    .line 180
    invoke-interface {v3, v1}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 181
    .line 182
    .line 183
    :cond_b
    if-eq v13, v4, :cond_c

    .line 184
    .line 185
    add-int v13, v13, v17

    .line 186
    .line 187
    invoke-interface {v14}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 192
    .line 193
    .line 194
    move-result v4

    .line 195
    if-eqz v4, :cond_c

    .line 196
    .line 197
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v4

    .line 201
    check-cast v4, Lhj/g;

    .line 202
    .line 203
    new-instance v8, Lhj/g;

    .line 204
    .line 205
    invoke-virtual {v4}, Lhj/g;->a()Lfj/p;

    .line 206
    .line 207
    .line 208
    move-result-object v9

    .line 209
    invoke-virtual {v4}, Lhj/g;->c()I

    .line 210
    .line 211
    .line 212
    move-result v10

    .line 213
    add-int/2addr v10, v13

    .line 214
    invoke-virtual {v4}, Lhj/g;->b()I

    .line 215
    .line 216
    .line 217
    move-result v4

    .line 218
    add-int/2addr v4, v13

    .line 219
    invoke-direct {v8, v9, v10, v4}, Lhj/g;-><init>(Lfj/p;II)V

    .line 220
    .line 221
    .line 222
    invoke-interface {v5, v8}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    goto :goto_7

    .line 226
    :cond_c
    iget v1, v0, Lhj/i;->h:I

    .line 227
    .line 228
    if-lez v1, :cond_15

    .line 229
    .line 230
    if-eqz v15, :cond_e

    .line 231
    .line 232
    if-gt v6, v1, :cond_d

    .line 233
    .line 234
    goto :goto_8

    .line 235
    :cond_d
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 236
    .line 237
    invoke-direct/range {p0 .. p0}, Lhj/i;->o()Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v2

    .line 241
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    throw v1

    .line 245
    :cond_e
    :goto_8
    iget v1, v0, Lhj/i;->h:I

    .line 246
    .line 247
    if-ge v6, v1, :cond_15

    .line 248
    .line 249
    invoke-interface {v3, v2}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    .line 250
    .line 251
    .line 252
    add-int/lit8 v6, v6, 0x1

    .line 253
    .line 254
    add-int/lit8 v7, v7, 0x1

    .line 255
    .line 256
    goto :goto_8

    .line 257
    :cond_f
    if-eqz v15, :cond_11

    .line 258
    .line 259
    iget v7, v0, Lhj/i;->h:I

    .line 260
    .line 261
    if-gt v6, v7, :cond_10

    .line 262
    .line 263
    goto :goto_9

    .line 264
    :cond_10
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 265
    .line 266
    invoke-direct/range {p0 .. p0}, Lhj/i;->o()Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v2

    .line 270
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    throw v1

    .line 274
    :cond_11
    :goto_9
    if-ne v12, v4, :cond_12

    .line 275
    .line 276
    invoke-interface {v3, v1}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 277
    .line 278
    .line 279
    :cond_12
    :goto_a
    iget v1, v0, Lhj/i;->h:I

    .line 280
    .line 281
    if-ge v6, v1, :cond_13

    .line 282
    .line 283
    invoke-interface {v3, v2}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    .line 284
    .line 285
    .line 286
    add-int/lit8 v6, v6, 0x1

    .line 287
    .line 288
    goto :goto_a

    .line 289
    :cond_13
    if-eq v13, v4, :cond_14

    .line 290
    .line 291
    invoke-interface {v14}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 292
    .line 293
    .line 294
    move-result-object v1

    .line 295
    :goto_b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 296
    .line 297
    .line 298
    move-result v2

    .line 299
    if-eqz v2, :cond_14

    .line 300
    .line 301
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object v2

    .line 305
    check-cast v2, Lhj/g;

    .line 306
    .line 307
    new-instance v3, Lhj/g;

    .line 308
    .line 309
    invoke-virtual {v2}, Lhj/g;->a()Lfj/p;

    .line 310
    .line 311
    .line 312
    move-result-object v4

    .line 313
    invoke-virtual {v2}, Lhj/g;->c()I

    .line 314
    .line 315
    .line 316
    move-result v7

    .line 317
    add-int/2addr v7, v13

    .line 318
    invoke-virtual {v2}, Lhj/g;->b()I

    .line 319
    .line 320
    .line 321
    move-result v2

    .line 322
    add-int/2addr v2, v13

    .line 323
    invoke-direct {v3, v4, v7, v2}, Lhj/g;-><init>(Lfj/p;II)V

    .line 324
    .line 325
    .line 326
    invoke-interface {v5, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 327
    .line 328
    .line 329
    goto :goto_b

    .line 330
    :cond_14
    move v7, v6

    .line 331
    :cond_15
    return v7
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

.method s(Lhj/c;)Lhj/i;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhj/c<",
            "*>;)",
            "Lhj/i;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lhj/c;->p()Lhj/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lhj/i;->d:Lhj/b;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    new-instance v1, Lgj/a$b;

    .line 10
    .line 11
    invoke-direct {v1}, Lgj/a$b;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Lhj/b;->e()Lgj/a;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {v1, v2}, Lgj/a$b;->f(Lgj/a;)Lgj/a$b;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    iget-object v2, p0, Lhj/i;->d:Lhj/b;

    .line 23
    .line 24
    invoke-virtual {v2}, Lhj/b;->e()Lgj/a;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v1, v2}, Lgj/a$b;->f(Lgj/a;)Lgj/a$b;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v1}, Lgj/a$b;->a()Lgj/a;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v0, v1}, Lhj/b;->l(Lgj/a;)Lhj/b;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    :cond_0
    move-object v6, v0

    .line 41
    new-instance v0, Lhj/i;

    .line 42
    .line 43
    iget-object v1, p0, Lhj/i;->a:Lhj/h;

    .line 44
    .line 45
    iget v2, p0, Lhj/i;->f:I

    .line 46
    .line 47
    invoke-interface {v1, p1, v6, v2}, Lhj/h;->j(Lhj/c;Lfj/d;I)Lhj/h;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    iget v3, p0, Lhj/i;->b:I

    .line 52
    .line 53
    iget v4, p0, Lhj/i;->c:I

    .line 54
    .line 55
    iget-object v5, p0, Lhj/i;->d:Lhj/b;

    .line 56
    .line 57
    iget v7, p0, Lhj/i;->f:I

    .line 58
    .line 59
    iget v8, p0, Lhj/i;->g:I

    .line 60
    .line 61
    iget v9, p0, Lhj/i;->h:I

    .line 62
    .line 63
    iget-boolean v10, p0, Lhj/i;->i:Z

    .line 64
    .line 65
    iget v11, p0, Lhj/i;->j:I

    .line 66
    .line 67
    move-object v1, v0

    .line 68
    invoke-direct/range {v1 .. v11}, Lhj/i;-><init>(Lhj/h;IILhj/b;Lfj/d;IIIZI)V

    .line 69
    .line 70
    .line 71
    return-object v0
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
.end method

.method t(I)Lhj/i;
    .locals 12

    new-instance v11, Lhj/i;

    iget-object v1, p0, Lhj/i;->a:Lhj/h;

    iget v2, p0, Lhj/i;->b:I

    iget v3, p0, Lhj/i;->c:I

    iget-object v4, p0, Lhj/i;->d:Lhj/b;

    const/4 v5, 0x0

    iget v0, p0, Lhj/i;->f:I

    add-int v6, v0, p1

    iget v7, p0, Lhj/i;->g:I

    iget v8, p0, Lhj/i;->h:I

    iget-boolean v9, p0, Lhj/i;->i:Z

    iget v10, p0, Lhj/i;->j:I

    move-object v0, v11

    invoke-direct/range {v0 .. v10}, Lhj/i;-><init>(Lhj/h;IILhj/b;Lfj/d;IIIZI)V

    return-object v11
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "[processor="

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lhj/i;->a:Lhj/h;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v1, ", level="

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    iget v1, p0, Lhj/i;->b:I

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v1, ", section="

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    iget v1, p0, Lhj/i;->c:I

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    iget-object v1, p0, Lhj/i;->d:Lhj/b;

    .line 37
    .line 38
    if-eqz v1, :cond_0

    .line 39
    .line 40
    const-string v1, ", attributes="

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    iget-object v1, p0, Lhj/i;->d:Lhj/b;

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    :cond_0
    const-string v1, ", reserved="

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    iget v1, p0, Lhj/i;->f:I

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string v1, ", pad-left="

    .line 61
    .line 62
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    iget v1, p0, Lhj/i;->g:I

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const-string v1, ", pad-right="

    .line 71
    .line 72
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    iget v1, p0, Lhj/i;->h:I

    .line 76
    .line 77
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    iget-boolean v1, p0, Lhj/i;->i:Z

    .line 81
    .line 82
    if-eqz v1, :cond_1

    .line 83
    .line 84
    const-string v1, ", or-block-started"

    .line 85
    .line 86
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    :cond_1
    const/16 v1, 0x5d

    .line 90
    .line 91
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    return-object v0
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
.end method

.method u()I
    .locals 1

    iget v0, p0, Lhj/i;->j:I

    return v0
.end method

.method v()Lhj/i;
    .locals 12

    .line 1
    iget-boolean v0, p0, Lhj/i;->i:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lhj/i;

    .line 6
    .line 7
    iget-object v2, p0, Lhj/i;->a:Lhj/h;

    .line 8
    .line 9
    iget v3, p0, Lhj/i;->b:I

    .line 10
    .line 11
    iget v4, p0, Lhj/i;->c:I

    .line 12
    .line 13
    iget-object v5, p0, Lhj/i;->d:Lhj/b;

    .line 14
    .line 15
    const/4 v6, 0x0

    .line 16
    iget v7, p0, Lhj/i;->f:I

    .line 17
    .line 18
    iget v8, p0, Lhj/i;->g:I

    .line 19
    .line 20
    iget v9, p0, Lhj/i;->h:I

    .line 21
    .line 22
    const/4 v10, 0x1

    .line 23
    const/4 v11, -0x1

    .line 24
    move-object v1, v0

    .line 25
    invoke-direct/range {v1 .. v11}, Lhj/i;-><init>(Lhj/h;IILhj/b;Lfj/d;IIIZI)V

    .line 26
    .line 27
    .line 28
    return-object v0

    .line 29
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 30
    .line 31
    const-string v1, "Cannot start or-block twice."

    .line 32
    .line 33
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw v0
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

.method x(Lfj/p;)Lhj/i;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/p<",
            "*>;)",
            "Lhj/i;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lhj/i;->a:Lhj/h;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lhj/i;->w(Lhj/h;Lfj/p;)Lhj/h;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    iget-object p1, p0, Lhj/i;->a:Lhj/h;

    .line 8
    .line 9
    if-ne p1, v2, :cond_0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    new-instance p1, Lhj/i;

    .line 13
    .line 14
    iget v3, p0, Lhj/i;->b:I

    .line 15
    .line 16
    iget v4, p0, Lhj/i;->c:I

    .line 17
    .line 18
    iget-object v5, p0, Lhj/i;->d:Lhj/b;

    .line 19
    .line 20
    iget-object v6, p0, Lhj/i;->e:Lfj/d;

    .line 21
    .line 22
    iget v7, p0, Lhj/i;->f:I

    .line 23
    .line 24
    iget v8, p0, Lhj/i;->g:I

    .line 25
    .line 26
    iget v9, p0, Lhj/i;->h:I

    .line 27
    .line 28
    iget-boolean v10, p0, Lhj/i;->i:Z

    .line 29
    .line 30
    iget v11, p0, Lhj/i;->j:I

    .line 31
    .line 32
    move-object v1, p1

    .line 33
    invoke-direct/range {v1 .. v11}, Lhj/i;-><init>(Lhj/h;IILhj/b;Lfj/d;IIIZI)V

    .line 34
    .line 35
    .line 36
    return-object p1
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
.end method
