.class public final Lio/sentry/u1;
.super Lio/sentry/k;
.source "SourceFile"

# interfaces
.implements Lio/sentry/d0;


# static fields
.field private static final g:Ljava/nio/charset/Charset;


# instance fields
.field private final c:Lio/sentry/f0;

.field private final d:Lio/sentry/c0;

.field private final e:Lio/sentry/l0;

.field private final f:Lio/sentry/g0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "UTF-8"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lio/sentry/u1;->g:Ljava/nio/charset/Charset;

    .line 8
    .line 9
    return-void
    .line 10
    .line 11
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
.end method

.method public constructor <init>(Lio/sentry/f0;Lio/sentry/c0;Lio/sentry/l0;Lio/sentry/g0;J)V
    .locals 0

    .line 1
    invoke-direct {p0, p4, p5, p6}, Lio/sentry/k;-><init>(Lio/sentry/g0;J)V

    .line 2
    .line 3
    .line 4
    const-string p5, "Hub is required."

    .line 5
    .line 6
    invoke-static {p1, p5}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, Lio/sentry/f0;

    .line 11
    .line 12
    iput-object p1, p0, Lio/sentry/u1;->c:Lio/sentry/f0;

    .line 13
    .line 14
    const-string p1, "Envelope reader is required."

    .line 15
    .line 16
    invoke-static {p2, p1}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, Lio/sentry/c0;

    .line 21
    .line 22
    iput-object p1, p0, Lio/sentry/u1;->d:Lio/sentry/c0;

    .line 23
    .line 24
    const-string p1, "Serializer is required."

    .line 25
    .line 26
    invoke-static {p3, p1}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    check-cast p1, Lio/sentry/l0;

    .line 31
    .line 32
    iput-object p1, p0, Lio/sentry/u1;->e:Lio/sentry/l0;

    .line 33
    .line 34
    const-string p1, "Logger is required."

    .line 35
    .line 36
    invoke-static {p4, p1}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    check-cast p1, Lio/sentry/g0;

    .line 41
    .line 42
    iput-object p1, p0, Lio/sentry/u1;->f:Lio/sentry/g0;

    .line 43
    .line 44
    return-void
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

.method public static synthetic g(Lio/sentry/u1;Ljava/io/File;Lio/sentry/hints/f;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/sentry/u1;->k(Ljava/io/File;Lio/sentry/hints/f;)V

    return-void
.end method

.method public static synthetic h(Lio/sentry/hints/e;)V
    .locals 0

    invoke-static {p0}, Lio/sentry/u1;->j(Lio/sentry/hints/e;)V

    return-void
.end method

.method private i(Lio/sentry/k4;)Lio/sentry/m4;
    .locals 6

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-virtual {p1}, Lio/sentry/k4;->a()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_1

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    const/4 v1, 0x0

    .line 11
    :try_start_0
    invoke-static {p1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 12
    .line 13
    .line 14
    move-result-wide v2

    .line 15
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-static {v2, v1}, Lio/sentry/util/n;->f(Ljava/lang/Double;Z)Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-nez v3, :cond_0

    .line 24
    .line 25
    iget-object v2, p0, Lio/sentry/u1;->f:Lio/sentry/g0;

    .line 26
    .line 27
    sget-object v3, Lio/sentry/n3;->ERROR:Lio/sentry/n3;

    .line 28
    .line 29
    const-string v4, "Invalid sample rate parsed from TraceContext: %s"

    .line 30
    .line 31
    new-array v5, v0, [Ljava/lang/Object;

    .line 32
    .line 33
    aput-object p1, v5, v1

    .line 34
    .line 35
    invoke-interface {v2, v3, v4, v5}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    new-instance v3, Lio/sentry/m4;

    .line 40
    .line 41
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 42
    .line 43
    invoke-direct {v3, v4, v2}, Lio/sentry/m4;-><init>(Ljava/lang/Boolean;Ljava/lang/Double;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 44
    .line 45
    .line 46
    return-object v3

    .line 47
    :catch_0
    iget-object v2, p0, Lio/sentry/u1;->f:Lio/sentry/g0;

    .line 48
    .line 49
    sget-object v3, Lio/sentry/n3;->ERROR:Lio/sentry/n3;

    .line 50
    .line 51
    new-array v0, v0, [Ljava/lang/Object;

    .line 52
    .line 53
    aput-object p1, v0, v1

    .line 54
    .line 55
    const-string p1, "Unable to parse sample rate from TraceContext: %s"

    .line 56
    .line 57
    invoke-interface {v2, v3, p1, v0}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    :cond_1
    :goto_0
    new-instance p1, Lio/sentry/m4;

    .line 61
    .line 62
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 63
    .line 64
    invoke-direct {p1, v0}, Lio/sentry/m4;-><init>(Ljava/lang/Boolean;)V

    .line 65
    .line 66
    .line 67
    return-object p1
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

.method private static synthetic j(Lio/sentry/hints/e;)V
    .locals 0

    invoke-interface {p0}, Lio/sentry/hints/e;->reset()V

    return-void
.end method

.method private synthetic k(Ljava/io/File;Lio/sentry/hints/f;)V
    .locals 6

    .line 1
    const-string v0, "Failed to delete: %s"

    .line 2
    .line 3
    invoke-interface {p2}, Lio/sentry/hints/f;->a()Z

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    if-nez p2, :cond_0

    .line 8
    .line 9
    const/4 p2, 0x0

    .line 10
    const/4 v1, 0x1

    .line 11
    :try_start_0
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    iget-object v2, p0, Lio/sentry/u1;->f:Lio/sentry/g0;

    .line 18
    .line 19
    sget-object v3, Lio/sentry/n3;->ERROR:Lio/sentry/n3;

    .line 20
    .line 21
    new-array v4, v1, [Ljava/lang/Object;

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    aput-object v5, v4, p2

    .line 28
    .line 29
    invoke-interface {v2, v3, v0, v4}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :catch_0
    move-exception v2

    .line 34
    iget-object v3, p0, Lio/sentry/u1;->f:Lio/sentry/g0;

    .line 35
    .line 36
    sget-object v4, Lio/sentry/n3;->ERROR:Lio/sentry/n3;

    .line 37
    .line 38
    new-array v1, v1, [Ljava/lang/Object;

    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    aput-object p1, v1, p2

    .line 45
    .line 46
    invoke-interface {v3, v4, v2, v0, v1}, Lio/sentry/g0;->a(Lio/sentry/n3;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    :cond_0
    :goto_0
    return-void
.end method

.method private l(Lio/sentry/h3;I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lio/sentry/u1;->f:Lio/sentry/g0;

    .line 2
    .line 3
    sget-object v1, Lio/sentry/n3;->ERROR:Lio/sentry/n3;

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    new-array v2, v2, [Ljava/lang/Object;

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    aput-object p2, v2, v3

    .line 14
    .line 15
    invoke-virtual {p1}, Lio/sentry/h3;->w()Lio/sentry/i3;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p1}, Lio/sentry/i3;->b()Lio/sentry/m3;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const/4 p2, 0x1

    .line 24
    aput-object p1, v2, p2

    .line 25
    .line 26
    const-string p1, "Item %d of type %s returned null by the parser."

    .line 27
    .line 28
    invoke-interface {v0, v1, p1, v2}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    return-void
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

.method private m(I)V
    .locals 4

    iget-object v0, p0, Lio/sentry/u1;->f:Lio/sentry/g0;

    sget-object v1, Lio/sentry/n3;->DEBUG:Lio/sentry/n3;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v2, v3

    const-string p1, "Item %d is being captured."

    invoke-interface {v0, v1, p1, v2}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method private n(Lio/sentry/protocol/p;)V
    .locals 4

    iget-object v0, p0, Lio/sentry/u1;->f:Lio/sentry/g0;

    sget-object v1, Lio/sentry/n3;->WARNING:Lio/sentry/n3;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const-string p1, "Timed out waiting for event id submission: %s"

    invoke-interface {v0, v1, p1, v2}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method private o(Lio/sentry/q2;Lio/sentry/protocol/p;I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lio/sentry/u1;->f:Lio/sentry/g0;

    .line 2
    .line 3
    sget-object v1, Lio/sentry/n3;->ERROR:Lio/sentry/n3;

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    new-array v2, v2, [Ljava/lang/Object;

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object p3

    .line 13
    aput-object p3, v2, v3

    .line 14
    .line 15
    invoke-virtual {p1}, Lio/sentry/q2;->c()Lio/sentry/r2;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p1}, Lio/sentry/r2;->a()Lio/sentry/protocol/p;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const/4 p3, 0x1

    .line 24
    aput-object p1, v2, p3

    .line 25
    .line 26
    const/4 p1, 0x2

    .line 27
    aput-object p2, v2, p1

    .line 28
    .line 29
    const-string p1, "Item %d of has a different event id (%s) to the envelope header (%s)"

    .line 30
    .line 31
    invoke-interface {v0, v1, p1, v2}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    return-void
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
.end method

.method private p(Lio/sentry/q2;Lio/sentry/v;)V
    .locals 10

    .line 1
    iget-object v0, p0, Lio/sentry/u1;->f:Lio/sentry/g0;

    .line 2
    .line 3
    sget-object v1, Lio/sentry/n3;->DEBUG:Lio/sentry/n3;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    new-array v3, v2, [Ljava/lang/Object;

    .line 7
    .line 8
    invoke-virtual {p1}, Lio/sentry/q2;->d()Ljava/lang/Iterable;

    .line 9
    .line 10
    .line 11
    move-result-object v4

    .line 12
    invoke-static {v4}, Lio/sentry/util/a;->d(Ljava/lang/Iterable;)I

    .line 13
    .line 14
    .line 15
    move-result v4

    .line 16
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    const/4 v5, 0x0

    .line 21
    aput-object v4, v3, v5

    .line 22
    .line 23
    const-string v4, "Processing Envelope with %d item(s)"

    .line 24
    .line 25
    invoke-interface {v0, v1, v4, v3}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Lio/sentry/q2;->d()Ljava/lang/Iterable;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    move v1, v5

    .line 37
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-eqz v3, :cond_d

    .line 42
    .line 43
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    check-cast v3, Lio/sentry/h3;

    .line 48
    .line 49
    add-int/2addr v1, v2

    .line 50
    invoke-virtual {v3}, Lio/sentry/h3;->w()Lio/sentry/i3;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    if-nez v4, :cond_0

    .line 55
    .line 56
    iget-object v3, p0, Lio/sentry/u1;->f:Lio/sentry/g0;

    .line 57
    .line 58
    sget-object v4, Lio/sentry/n3;->ERROR:Lio/sentry/n3;

    .line 59
    .line 60
    new-array v6, v2, [Ljava/lang/Object;

    .line 61
    .line 62
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 63
    .line 64
    .line 65
    move-result-object v7

    .line 66
    aput-object v7, v6, v5

    .line 67
    .line 68
    const-string v7, "Item %d has no header"

    .line 69
    .line 70
    invoke-interface {v3, v4, v7, v6}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_0
    sget-object v4, Lio/sentry/m3;->Event:Lio/sentry/m3;

    .line 75
    .line 76
    invoke-virtual {v3}, Lio/sentry/h3;->w()Lio/sentry/i3;

    .line 77
    .line 78
    .line 79
    move-result-object v6

    .line 80
    invoke-virtual {v6}, Lio/sentry/i3;->b()Lio/sentry/m3;

    .line 81
    .line 82
    .line 83
    move-result-object v6

    .line 84
    invoke-virtual {v4, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v4

    .line 88
    const-string v6, "Item failed to process."

    .line 89
    .line 90
    if-eqz v4, :cond_5

    .line 91
    .line 92
    :try_start_0
    new-instance v4, Ljava/io/BufferedReader;

    .line 93
    .line 94
    new-instance v7, Ljava/io/InputStreamReader;

    .line 95
    .line 96
    new-instance v8, Ljava/io/ByteArrayInputStream;

    .line 97
    .line 98
    invoke-virtual {v3}, Lio/sentry/h3;->v()[B

    .line 99
    .line 100
    .line 101
    move-result-object v9

    .line 102
    invoke-direct {v8, v9}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 103
    .line 104
    .line 105
    sget-object v9, Lio/sentry/u1;->g:Ljava/nio/charset/Charset;

    .line 106
    .line 107
    invoke-direct {v7, v8, v9}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    .line 108
    .line 109
    .line 110
    invoke-direct {v4, v7}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 111
    .line 112
    .line 113
    :try_start_1
    iget-object v7, p0, Lio/sentry/u1;->e:Lio/sentry/l0;

    .line 114
    .line 115
    const-class v8, Lio/sentry/j3;

    .line 116
    .line 117
    invoke-interface {v7, v4, v8}, Lio/sentry/l0;->c(Ljava/io/Reader;Ljava/lang/Class;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v7

    .line 121
    check-cast v7, Lio/sentry/j3;

    .line 122
    .line 123
    if-nez v7, :cond_1

    .line 124
    .line 125
    invoke-direct {p0, v3, v1}, Lio/sentry/u1;->l(Lio/sentry/h3;I)V

    .line 126
    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_1
    invoke-virtual {v7}, Lio/sentry/l2;->J()Lio/sentry/protocol/n;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    if-eqz v3, :cond_2

    .line 134
    .line 135
    invoke-virtual {v7}, Lio/sentry/l2;->J()Lio/sentry/protocol/n;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    invoke-virtual {v3}, Lio/sentry/protocol/n;->f()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    invoke-static {p2, v3}, Lio/sentry/util/h;->q(Lio/sentry/v;Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    :cond_2
    invoke-virtual {p1}, Lio/sentry/q2;->c()Lio/sentry/r2;

    .line 147
    .line 148
    .line 149
    move-result-object v3

    .line 150
    invoke-virtual {v3}, Lio/sentry/r2;->a()Lio/sentry/protocol/p;

    .line 151
    .line 152
    .line 153
    move-result-object v3

    .line 154
    if-eqz v3, :cond_3

    .line 155
    .line 156
    invoke-virtual {p1}, Lio/sentry/q2;->c()Lio/sentry/r2;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    invoke-virtual {v3}, Lio/sentry/r2;->a()Lio/sentry/protocol/p;

    .line 161
    .line 162
    .line 163
    move-result-object v3

    .line 164
    invoke-virtual {v7}, Lio/sentry/l2;->E()Lio/sentry/protocol/p;

    .line 165
    .line 166
    .line 167
    move-result-object v8

    .line 168
    invoke-virtual {v3, v8}, Lio/sentry/protocol/p;->equals(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    move-result v3

    .line 172
    if-nez v3, :cond_3

    .line 173
    .line 174
    invoke-virtual {v7}, Lio/sentry/l2;->E()Lio/sentry/protocol/p;

    .line 175
    .line 176
    .line 177
    move-result-object v3

    .line 178
    invoke-direct {p0, p1, v3, v1}, Lio/sentry/u1;->o(Lio/sentry/q2;Lio/sentry/protocol/p;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 179
    .line 180
    .line 181
    :try_start_2
    invoke-virtual {v4}, Ljava/io/Reader;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 182
    .line 183
    .line 184
    goto/16 :goto_0

    .line 185
    .line 186
    :cond_3
    :try_start_3
    iget-object v3, p0, Lio/sentry/u1;->c:Lio/sentry/f0;

    .line 187
    .line 188
    invoke-interface {v3, v7, p2}, Lio/sentry/f0;->y(Lio/sentry/j3;Lio/sentry/v;)Lio/sentry/protocol/p;

    .line 189
    .line 190
    .line 191
    invoke-direct {p0, v1}, Lio/sentry/u1;->m(I)V

    .line 192
    .line 193
    .line 194
    invoke-direct {p0, p2}, Lio/sentry/u1;->q(Lio/sentry/v;)Z

    .line 195
    .line 196
    .line 197
    move-result v3

    .line 198
    if-nez v3, :cond_4

    .line 199
    .line 200
    invoke-virtual {v7}, Lio/sentry/l2;->E()Lio/sentry/protocol/p;

    .line 201
    .line 202
    .line 203
    move-result-object v3

    .line 204
    invoke-direct {p0, v3}, Lio/sentry/u1;->n(Lio/sentry/protocol/p;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 205
    .line 206
    .line 207
    :try_start_4
    invoke-virtual {v4}, Ljava/io/Reader;->close()V

    .line 208
    .line 209
    .line 210
    goto/16 :goto_6

    .line 211
    .line 212
    :cond_4
    :goto_1
    invoke-virtual {v4}, Ljava/io/Reader;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 213
    .line 214
    .line 215
    goto/16 :goto_5

    .line 216
    .line 217
    :catchall_0
    move-exception v3

    .line 218
    :try_start_5
    invoke-virtual {v4}, Ljava/io/Reader;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 219
    .line 220
    .line 221
    goto :goto_2

    .line 222
    :catchall_1
    move-exception v4

    .line 223
    :try_start_6
    invoke-virtual {v3, v4}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 224
    .line 225
    .line 226
    :goto_2
    throw v3
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 227
    :catchall_2
    move-exception v3

    .line 228
    iget-object v4, p0, Lio/sentry/u1;->f:Lio/sentry/g0;

    .line 229
    .line 230
    sget-object v7, Lio/sentry/n3;->ERROR:Lio/sentry/n3;

    .line 231
    .line 232
    invoke-interface {v4, v7, v6, v3}, Lio/sentry/g0;->b(Lio/sentry/n3;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 233
    .line 234
    .line 235
    goto/16 :goto_5

    .line 236
    .line 237
    :cond_5
    sget-object v4, Lio/sentry/m3;->Transaction:Lio/sentry/m3;

    .line 238
    .line 239
    invoke-virtual {v3}, Lio/sentry/h3;->w()Lio/sentry/i3;

    .line 240
    .line 241
    .line 242
    move-result-object v7

    .line 243
    invoke-virtual {v7}, Lio/sentry/i3;->b()Lio/sentry/m3;

    .line 244
    .line 245
    .line 246
    move-result-object v7

    .line 247
    invoke-virtual {v4, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 248
    .line 249
    .line 250
    move-result v4

    .line 251
    if-eqz v4, :cond_a

    .line 252
    .line 253
    :try_start_7
    new-instance v4, Ljava/io/BufferedReader;

    .line 254
    .line 255
    new-instance v7, Ljava/io/InputStreamReader;

    .line 256
    .line 257
    new-instance v8, Ljava/io/ByteArrayInputStream;

    .line 258
    .line 259
    invoke-virtual {v3}, Lio/sentry/h3;->v()[B

    .line 260
    .line 261
    .line 262
    move-result-object v9

    .line 263
    invoke-direct {v8, v9}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 264
    .line 265
    .line 266
    sget-object v9, Lio/sentry/u1;->g:Ljava/nio/charset/Charset;

    .line 267
    .line 268
    invoke-direct {v7, v8, v9}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    .line 269
    .line 270
    .line 271
    invoke-direct {v4, v7}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 272
    .line 273
    .line 274
    :try_start_8
    iget-object v7, p0, Lio/sentry/u1;->e:Lio/sentry/l0;

    .line 275
    .line 276
    const-class v8, Lio/sentry/protocol/w;

    .line 277
    .line 278
    invoke-interface {v7, v4, v8}, Lio/sentry/l0;->c(Ljava/io/Reader;Ljava/lang/Class;)Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v7

    .line 282
    check-cast v7, Lio/sentry/protocol/w;

    .line 283
    .line 284
    if-nez v7, :cond_6

    .line 285
    .line 286
    invoke-direct {p0, v3, v1}, Lio/sentry/u1;->l(Lio/sentry/h3;I)V

    .line 287
    .line 288
    .line 289
    goto :goto_3

    .line 290
    :cond_6
    invoke-virtual {p1}, Lio/sentry/q2;->c()Lio/sentry/r2;

    .line 291
    .line 292
    .line 293
    move-result-object v3

    .line 294
    invoke-virtual {v3}, Lio/sentry/r2;->a()Lio/sentry/protocol/p;

    .line 295
    .line 296
    .line 297
    move-result-object v3

    .line 298
    if-eqz v3, :cond_7

    .line 299
    .line 300
    invoke-virtual {p1}, Lio/sentry/q2;->c()Lio/sentry/r2;

    .line 301
    .line 302
    .line 303
    move-result-object v3

    .line 304
    invoke-virtual {v3}, Lio/sentry/r2;->a()Lio/sentry/protocol/p;

    .line 305
    .line 306
    .line 307
    move-result-object v3

    .line 308
    invoke-virtual {v7}, Lio/sentry/l2;->E()Lio/sentry/protocol/p;

    .line 309
    .line 310
    .line 311
    move-result-object v8

    .line 312
    invoke-virtual {v3, v8}, Lio/sentry/protocol/p;->equals(Ljava/lang/Object;)Z

    .line 313
    .line 314
    .line 315
    move-result v3

    .line 316
    if-nez v3, :cond_7

    .line 317
    .line 318
    invoke-virtual {v7}, Lio/sentry/l2;->E()Lio/sentry/protocol/p;

    .line 319
    .line 320
    .line 321
    move-result-object v3

    .line 322
    invoke-direct {p0, p1, v3, v1}, Lio/sentry/u1;->o(Lio/sentry/q2;Lio/sentry/protocol/p;I)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 323
    .line 324
    .line 325
    :try_start_9
    invoke-virtual {v4}, Ljava/io/Reader;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    .line 326
    .line 327
    .line 328
    goto/16 :goto_0

    .line 329
    .line 330
    :cond_7
    :try_start_a
    invoke-virtual {p1}, Lio/sentry/q2;->c()Lio/sentry/r2;

    .line 331
    .line 332
    .line 333
    move-result-object v3

    .line 334
    invoke-virtual {v3}, Lio/sentry/r2;->c()Lio/sentry/k4;

    .line 335
    .line 336
    .line 337
    move-result-object v3

    .line 338
    invoke-virtual {v7}, Lio/sentry/l2;->B()Lio/sentry/protocol/c;

    .line 339
    .line 340
    .line 341
    move-result-object v8

    .line 342
    invoke-virtual {v8}, Lio/sentry/protocol/c;->f()Lio/sentry/c4;

    .line 343
    .line 344
    .line 345
    move-result-object v8

    .line 346
    if-eqz v8, :cond_8

    .line 347
    .line 348
    invoke-virtual {v7}, Lio/sentry/l2;->B()Lio/sentry/protocol/c;

    .line 349
    .line 350
    .line 351
    move-result-object v8

    .line 352
    invoke-virtual {v8}, Lio/sentry/protocol/c;->f()Lio/sentry/c4;

    .line 353
    .line 354
    .line 355
    move-result-object v8

    .line 356
    invoke-direct {p0, v3}, Lio/sentry/u1;->i(Lio/sentry/k4;)Lio/sentry/m4;

    .line 357
    .line 358
    .line 359
    move-result-object v9

    .line 360
    invoke-virtual {v8, v9}, Lio/sentry/c4;->l(Lio/sentry/m4;)V

    .line 361
    .line 362
    .line 363
    :cond_8
    iget-object v8, p0, Lio/sentry/u1;->c:Lio/sentry/f0;

    .line 364
    .line 365
    invoke-interface {v8, v7, v3, p2}, Lio/sentry/f0;->i(Lio/sentry/protocol/w;Lio/sentry/k4;Lio/sentry/v;)Lio/sentry/protocol/p;

    .line 366
    .line 367
    .line 368
    invoke-direct {p0, v1}, Lio/sentry/u1;->m(I)V

    .line 369
    .line 370
    .line 371
    invoke-direct {p0, p2}, Lio/sentry/u1;->q(Lio/sentry/v;)Z

    .line 372
    .line 373
    .line 374
    move-result v3

    .line 375
    if-nez v3, :cond_9

    .line 376
    .line 377
    invoke-virtual {v7}, Lio/sentry/l2;->E()Lio/sentry/protocol/p;

    .line 378
    .line 379
    .line 380
    move-result-object v3

    .line 381
    invoke-direct {p0, v3}, Lio/sentry/u1;->n(Lio/sentry/protocol/p;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 382
    .line 383
    .line 384
    :try_start_b
    invoke-virtual {v4}, Ljava/io/Reader;->close()V

    .line 385
    .line 386
    .line 387
    goto/16 :goto_6

    .line 388
    .line 389
    :cond_9
    :goto_3
    invoke-virtual {v4}, Ljava/io/Reader;->close()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_5

    .line 390
    .line 391
    .line 392
    goto :goto_5

    .line 393
    :catchall_3
    move-exception v3

    .line 394
    :try_start_c
    invoke-virtual {v4}, Ljava/io/Reader;->close()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_4

    .line 395
    .line 396
    .line 397
    goto :goto_4

    .line 398
    :catchall_4
    move-exception v4

    .line 399
    :try_start_d
    invoke-virtual {v3, v4}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 400
    .line 401
    .line 402
    :goto_4
    throw v3
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_5

    .line 403
    :catchall_5
    move-exception v3

    .line 404
    iget-object v4, p0, Lio/sentry/u1;->f:Lio/sentry/g0;

    .line 405
    .line 406
    sget-object v7, Lio/sentry/n3;->ERROR:Lio/sentry/n3;

    .line 407
    .line 408
    invoke-interface {v4, v7, v6, v3}, Lio/sentry/g0;->b(Lio/sentry/n3;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 409
    .line 410
    .line 411
    goto :goto_5

    .line 412
    :cond_a
    new-instance v4, Lio/sentry/q2;

    .line 413
    .line 414
    invoke-virtual {p1}, Lio/sentry/q2;->c()Lio/sentry/r2;

    .line 415
    .line 416
    .line 417
    move-result-object v6

    .line 418
    invoke-virtual {v6}, Lio/sentry/r2;->a()Lio/sentry/protocol/p;

    .line 419
    .line 420
    .line 421
    move-result-object v6

    .line 422
    invoke-virtual {p1}, Lio/sentry/q2;->c()Lio/sentry/r2;

    .line 423
    .line 424
    .line 425
    move-result-object v7

    .line 426
    invoke-virtual {v7}, Lio/sentry/r2;->b()Lio/sentry/protocol/n;

    .line 427
    .line 428
    .line 429
    move-result-object v7

    .line 430
    invoke-direct {v4, v6, v7, v3}, Lio/sentry/q2;-><init>(Lio/sentry/protocol/p;Lio/sentry/protocol/n;Lio/sentry/h3;)V

    .line 431
    .line 432
    .line 433
    iget-object v6, p0, Lio/sentry/u1;->c:Lio/sentry/f0;

    .line 434
    .line 435
    invoke-interface {v6, v4, p2}, Lio/sentry/f0;->f(Lio/sentry/q2;Lio/sentry/v;)Lio/sentry/protocol/p;

    .line 436
    .line 437
    .line 438
    iget-object v4, p0, Lio/sentry/u1;->f:Lio/sentry/g0;

    .line 439
    .line 440
    sget-object v6, Lio/sentry/n3;->DEBUG:Lio/sentry/n3;

    .line 441
    .line 442
    const/4 v7, 0x2

    .line 443
    new-array v7, v7, [Ljava/lang/Object;

    .line 444
    .line 445
    invoke-virtual {v3}, Lio/sentry/h3;->w()Lio/sentry/i3;

    .line 446
    .line 447
    .line 448
    move-result-object v8

    .line 449
    invoke-virtual {v8}, Lio/sentry/i3;->b()Lio/sentry/m3;

    .line 450
    .line 451
    .line 452
    move-result-object v8

    .line 453
    invoke-virtual {v8}, Lio/sentry/m3;->getItemType()Ljava/lang/String;

    .line 454
    .line 455
    .line 456
    move-result-object v8

    .line 457
    aput-object v8, v7, v5

    .line 458
    .line 459
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 460
    .line 461
    .line 462
    move-result-object v8

    .line 463
    aput-object v8, v7, v2

    .line 464
    .line 465
    const-string v8, "%s item %d is being captured."

    .line 466
    .line 467
    invoke-interface {v4, v6, v8, v7}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 468
    .line 469
    .line 470
    invoke-direct {p0, p2}, Lio/sentry/u1;->q(Lio/sentry/v;)Z

    .line 471
    .line 472
    .line 473
    move-result v4

    .line 474
    if-nez v4, :cond_b

    .line 475
    .line 476
    iget-object p1, p0, Lio/sentry/u1;->f:Lio/sentry/g0;

    .line 477
    .line 478
    sget-object p2, Lio/sentry/n3;->WARNING:Lio/sentry/n3;

    .line 479
    .line 480
    new-array v0, v2, [Ljava/lang/Object;

    .line 481
    .line 482
    invoke-virtual {v3}, Lio/sentry/h3;->w()Lio/sentry/i3;

    .line 483
    .line 484
    .line 485
    move-result-object v1

    .line 486
    invoke-virtual {v1}, Lio/sentry/i3;->b()Lio/sentry/m3;

    .line 487
    .line 488
    .line 489
    move-result-object v1

    .line 490
    invoke-virtual {v1}, Lio/sentry/m3;->getItemType()Ljava/lang/String;

    .line 491
    .line 492
    .line 493
    move-result-object v1

    .line 494
    aput-object v1, v0, v5

    .line 495
    .line 496
    const-string v1, "Timed out waiting for item type submission: %s"

    .line 497
    .line 498
    invoke-interface {p1, p2, v1, v0}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 499
    .line 500
    .line 501
    goto :goto_6

    .line 502
    :cond_b
    :goto_5
    invoke-static {p2}, Lio/sentry/util/h;->f(Lio/sentry/v;)Ljava/lang/Object;

    .line 503
    .line 504
    .line 505
    move-result-object v3

    .line 506
    instance-of v4, v3, Lio/sentry/hints/k;

    .line 507
    .line 508
    if-eqz v4, :cond_c

    .line 509
    .line 510
    check-cast v3, Lio/sentry/hints/k;

    .line 511
    .line 512
    invoke-interface {v3}, Lio/sentry/hints/k;->e()Z

    .line 513
    .line 514
    .line 515
    move-result v3

    .line 516
    if-nez v3, :cond_c

    .line 517
    .line 518
    iget-object p1, p0, Lio/sentry/u1;->f:Lio/sentry/g0;

    .line 519
    .line 520
    sget-object p2, Lio/sentry/n3;->WARNING:Lio/sentry/n3;

    .line 521
    .line 522
    new-array v0, v2, [Ljava/lang/Object;

    .line 523
    .line 524
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 525
    .line 526
    .line 527
    move-result-object v1

    .line 528
    aput-object v1, v0, v5

    .line 529
    .line 530
    const-string v1, "Envelope had a failed capture at item %d. No more items will be sent."

    .line 531
    .line 532
    invoke-interface {p1, p2, v1, v0}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 533
    .line 534
    .line 535
    goto :goto_6

    .line 536
    :cond_c
    new-instance v3, Lio/sentry/t1;

    .line 537
    .line 538
    invoke-direct {v3}, Lio/sentry/t1;-><init>()V

    .line 539
    .line 540
    .line 541
    const-class v4, Lio/sentry/hints/e;

    .line 542
    .line 543
    invoke-static {p2, v4, v3}, Lio/sentry/util/h;->n(Lio/sentry/v;Ljava/lang/Class;Lio/sentry/util/h$a;)V

    .line 544
    .line 545
    .line 546
    goto/16 :goto_0

    .line 547
    .line 548
    :cond_d
    :goto_6
    return-void
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
.end method

.method private q(Lio/sentry/v;)Z
    .locals 2

    .line 1
    invoke-static {p1}, Lio/sentry/util/h;->f(Lio/sentry/v;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    instance-of v0, p1, Lio/sentry/hints/d;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    check-cast p1, Lio/sentry/hints/d;

    .line 10
    .line 11
    invoke-interface {p1}, Lio/sentry/hints/d;->d()Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1

    .line 16
    :cond_0
    const-class v0, Lio/sentry/hints/d;

    .line 17
    .line 18
    iget-object v1, p0, Lio/sentry/u1;->f:Lio/sentry/g0;

    .line 19
    .line 20
    invoke-static {v0, p1, v1}, Lio/sentry/util/j;->a(Ljava/lang/Class;Ljava/lang/Object;Lio/sentry/g0;)V

    .line 21
    .line 22
    .line 23
    const/4 p1, 0x1

    .line 24
    return p1
    .line 25
    .line 26
    .line 27
.end method


# virtual methods
.method public a(Ljava/lang/String;Lio/sentry/v;)V
    .locals 1

    .line 1
    const-string v0, "Path is required."

    .line 2
    .line 3
    invoke-static {p1, v0}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/io/File;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0, p2}, Lio/sentry/u1;->f(Ljava/io/File;Lio/sentry/v;)V

    .line 12
    .line 13
    .line 14
    return-void
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
.end method

.method protected c(Ljava/lang/String;)Z
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const-string v0, "session"

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const-string v0, "startup_crash"

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 p1, 0x0

    .line 22
    :goto_0
    return p1
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public bridge synthetic e(Ljava/io/File;)V
    .locals 0

    invoke-super {p0, p1}, Lio/sentry/k;->e(Ljava/io/File;)V

    return-void
.end method

.method protected f(Ljava/io/File;Lio/sentry/v;)V
    .locals 8

    .line 1
    const-class v0, Lio/sentry/hints/f;

    .line 2
    .line 3
    const-string v1, "File is required."

    .line 4
    .line 5
    invoke-static {p1, v1}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {p0, v1}, Lio/sentry/u1;->c(Ljava/lang/String;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v3, 0x1

    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    iget-object p2, p0, Lio/sentry/u1;->f:Lio/sentry/g0;

    .line 21
    .line 22
    sget-object v0, Lio/sentry/n3;->DEBUG:Lio/sentry/n3;

    .line 23
    .line 24
    new-array v1, v3, [Ljava/lang/Object;

    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    aput-object p1, v1, v2

    .line 31
    .line 32
    const-string p1, "File \'%s\' should be ignored."

    .line 33
    .line 34
    invoke-interface {p2, v0, p1, v1}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_0
    :try_start_0
    new-instance v1, Ljava/io/BufferedInputStream;

    .line 39
    .line 40
    new-instance v4, Ljava/io/FileInputStream;

    .line 41
    .line 42
    invoke-direct {v4, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 43
    .line 44
    .line 45
    invoke-direct {v1, v4}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 46
    .line 47
    .line 48
    :try_start_1
    iget-object v4, p0, Lio/sentry/u1;->d:Lio/sentry/c0;

    .line 49
    .line 50
    invoke-interface {v4, v1}, Lio/sentry/c0;->a(Ljava/io/InputStream;)Lio/sentry/q2;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    if-nez v4, :cond_1

    .line 55
    .line 56
    iget-object v4, p0, Lio/sentry/u1;->f:Lio/sentry/g0;

    .line 57
    .line 58
    sget-object v5, Lio/sentry/n3;->ERROR:Lio/sentry/n3;

    .line 59
    .line 60
    const-string v6, "Stream from path %s resulted in a null envelope."

    .line 61
    .line 62
    new-array v3, v3, [Ljava/lang/Object;

    .line 63
    .line 64
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v7

    .line 68
    aput-object v7, v3, v2

    .line 69
    .line 70
    invoke-interface {v4, v5, v6, v3}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_1
    invoke-direct {p0, v4, p2}, Lio/sentry/u1;->p(Lio/sentry/q2;Lio/sentry/v;)V

    .line 75
    .line 76
    .line 77
    iget-object v4, p0, Lio/sentry/u1;->f:Lio/sentry/g0;

    .line 78
    .line 79
    sget-object v5, Lio/sentry/n3;->DEBUG:Lio/sentry/n3;

    .line 80
    .line 81
    const-string v6, "File \'%s\' is done."

    .line 82
    .line 83
    new-array v3, v3, [Ljava/lang/Object;

    .line 84
    .line 85
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v7

    .line 89
    aput-object v7, v3, v2

    .line 90
    .line 91
    invoke-interface {v4, v5, v6, v3}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 92
    .line 93
    .line 94
    :goto_0
    :try_start_2
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 95
    .line 96
    .line 97
    iget-object v1, p0, Lio/sentry/u1;->f:Lio/sentry/g0;

    .line 98
    .line 99
    new-instance v2, Lio/sentry/s1;

    .line 100
    .line 101
    invoke-direct {v2, p0, p1}, Lio/sentry/s1;-><init>(Lio/sentry/u1;Ljava/io/File;)V

    .line 102
    .line 103
    .line 104
    goto :goto_2

    .line 105
    :catchall_0
    move-exception v2

    .line 106
    :try_start_3
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 107
    .line 108
    .line 109
    goto :goto_1

    .line 110
    :catchall_1
    move-exception v1

    .line 111
    :try_start_4
    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 112
    .line 113
    .line 114
    :goto_1
    throw v2
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 115
    :catchall_2
    move-exception v1

    .line 116
    goto :goto_3

    .line 117
    :catch_0
    move-exception v1

    .line 118
    :try_start_5
    iget-object v2, p0, Lio/sentry/u1;->f:Lio/sentry/g0;

    .line 119
    .line 120
    sget-object v3, Lio/sentry/n3;->ERROR:Lio/sentry/n3;

    .line 121
    .line 122
    const-string v4, "Error processing envelope."

    .line 123
    .line 124
    invoke-interface {v2, v3, v4, v1}, Lio/sentry/g0;->b(Lio/sentry/n3;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 125
    .line 126
    .line 127
    iget-object v1, p0, Lio/sentry/u1;->f:Lio/sentry/g0;

    .line 128
    .line 129
    new-instance v2, Lio/sentry/s1;

    .line 130
    .line 131
    invoke-direct {v2, p0, p1}, Lio/sentry/s1;-><init>(Lio/sentry/u1;Ljava/io/File;)V

    .line 132
    .line 133
    .line 134
    :goto_2
    invoke-static {p2, v0, v1, v2}, Lio/sentry/util/h;->p(Lio/sentry/v;Ljava/lang/Class;Lio/sentry/g0;Lio/sentry/util/h$a;)V

    .line 135
    .line 136
    .line 137
    return-void

    .line 138
    :goto_3
    iget-object v2, p0, Lio/sentry/u1;->f:Lio/sentry/g0;

    .line 139
    .line 140
    new-instance v3, Lio/sentry/s1;

    .line 141
    .line 142
    invoke-direct {v3, p0, p1}, Lio/sentry/s1;-><init>(Lio/sentry/u1;Ljava/io/File;)V

    .line 143
    .line 144
    .line 145
    invoke-static {p2, v0, v2, v3}, Lio/sentry/util/h;->p(Lio/sentry/v;Ljava/lang/Class;Lio/sentry/g0;Lio/sentry/util/h$a;)V

    .line 146
    .line 147
    .line 148
    throw v1
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
