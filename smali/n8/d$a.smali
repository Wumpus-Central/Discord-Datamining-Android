.class final Ln8/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/exoplayer2/upstream/h$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln8/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/exoplayer2/upstream/h$b<",
        "Lcom/google/android/exoplayer2/upstream/i<",
        "Ln8/h;",
        ">;>;"
    }
.end annotation


# instance fields
.field private final k:Landroid/net/Uri;

.field private final l:Lcom/google/android/exoplayer2/upstream/h;

.field private final m:Lcom/google/android/exoplayer2/upstream/DataSource;

.field private n:Ln8/g;

.field private o:J

.field private p:J

.field private q:J

.field private r:J

.field private s:Z

.field private t:Ljava/io/IOException;

.field final synthetic u:Ln8/d;


# direct methods
.method public constructor <init>(Ln8/d;Landroid/net/Uri;)V
    .locals 1

    .line 1
    iput-object p1, p0, Ln8/d$a;->u:Ln8/d;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Ln8/d$a;->k:Landroid/net/Uri;

    .line 7
    .line 8
    new-instance p2, Lcom/google/android/exoplayer2/upstream/h;

    .line 9
    .line 10
    const-string v0, "DefaultHlsPlaylistTracker:MediaPlaylist"

    .line 11
    .line 12
    invoke-direct {p2, v0}, Lcom/google/android/exoplayer2/upstream/h;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iput-object p2, p0, Ln8/d$a;->l:Lcom/google/android/exoplayer2/upstream/h;

    .line 16
    .line 17
    invoke-static {p1}, Ln8/d;->u(Ln8/d;)Lm8/g;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const/4 p2, 0x4

    .line 22
    invoke-interface {p1, p2}, Lm8/g;->a(I)Lcom/google/android/exoplayer2/upstream/DataSource;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iput-object p1, p0, Ln8/d$a;->m:Lcom/google/android/exoplayer2/upstream/DataSource;

    .line 27
    .line 28
    return-void
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

.method public static synthetic a(Ln8/d$a;Landroid/net/Uri;)V
    .locals 0

    invoke-direct {p0, p1}, Ln8/d$a;->j(Landroid/net/Uri;)V

    return-void
.end method

.method static synthetic b(Ln8/d$a;Ln8/g;Lh8/n;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ln8/d$a;->u(Ln8/g;Lh8/n;)V

    return-void
.end method

.method static synthetic c(Ln8/d$a;)J
    .locals 2

    iget-wide v0, p0, Ln8/d$a;->r:J

    return-wide v0
.end method

.method static synthetic d(Ln8/d$a;)Landroid/net/Uri;
    .locals 0

    iget-object p0, p0, Ln8/d$a;->k:Landroid/net/Uri;

    return-object p0
.end method

.method static synthetic e(Ln8/d$a;Landroid/net/Uri;)V
    .locals 0

    invoke-direct {p0, p1}, Ln8/d$a;->o(Landroid/net/Uri;)V

    return-void
.end method

.method private f(J)Z
    .locals 2

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    add-long/2addr v0, p1

    .line 6
    iput-wide v0, p0, Ln8/d$a;->r:J

    .line 7
    .line 8
    iget-object p1, p0, Ln8/d$a;->k:Landroid/net/Uri;

    .line 9
    .line 10
    iget-object p2, p0, Ln8/d$a;->u:Ln8/d;

    .line 11
    .line 12
    invoke-static {p2}, Ln8/d;->r(Ln8/d;)Landroid/net/Uri;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    invoke-virtual {p1, p2}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    iget-object p1, p0, Ln8/d$a;->u:Ln8/d;

    .line 23
    .line 24
    invoke-static {p1}, Ln8/d;->s(Ln8/d;)Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-nez p1, :cond_0

    .line 29
    .line 30
    const/4 p1, 0x1

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/4 p1, 0x0

    .line 33
    :goto_0
    return p1
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

.method private g()Landroid/net/Uri;
    .locals 7

    .line 1
    iget-object v0, p0, Ln8/d$a;->n:Ln8/g;

    .line 2
    .line 3
    if-eqz v0, :cond_5

    .line 4
    .line 5
    iget-object v0, v0, Ln8/g;->t:Ln8/g$f;

    .line 6
    .line 7
    iget-wide v1, v0, Ln8/g$f;->a:J

    .line 8
    .line 9
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    cmp-long v1, v1, v3

    .line 15
    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    iget-boolean v0, v0, Ln8/g$f;->e:Z

    .line 19
    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    iget-object v0, p0, Ln8/d$a;->k:Landroid/net/Uri;

    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iget-object v1, p0, Ln8/d$a;->n:Ln8/g;

    .line 30
    .line 31
    iget-object v2, v1, Ln8/g;->t:Ln8/g$f;

    .line 32
    .line 33
    iget-boolean v2, v2, Ln8/g$f;->e:Z

    .line 34
    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    iget-wide v5, v1, Ln8/g;->i:J

    .line 38
    .line 39
    iget-object v1, v1, Ln8/g;->p:Ljava/util/List;

    .line 40
    .line 41
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    int-to-long v1, v1

    .line 46
    add-long/2addr v5, v1

    .line 47
    const-string v1, "_HLS_msn"

    .line 48
    .line 49
    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-virtual {v0, v1, v2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 54
    .line 55
    .line 56
    iget-object v1, p0, Ln8/d$a;->n:Ln8/g;

    .line 57
    .line 58
    iget-wide v5, v1, Ln8/g;->l:J

    .line 59
    .line 60
    cmp-long v2, v5, v3

    .line 61
    .line 62
    if-eqz v2, :cond_2

    .line 63
    .line 64
    iget-object v1, v1, Ln8/g;->q:Ljava/util/List;

    .line 65
    .line 66
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 71
    .line 72
    .line 73
    move-result v5

    .line 74
    if-nez v5, :cond_1

    .line 75
    .line 76
    invoke-static {v1}, Lbc/z0;->c(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    check-cast v1, Ln8/g$b;

    .line 81
    .line 82
    iget-boolean v1, v1, Ln8/g$b;->w:Z

    .line 83
    .line 84
    if-eqz v1, :cond_1

    .line 85
    .line 86
    add-int/lit8 v2, v2, -0x1

    .line 87
    .line 88
    :cond_1
    const-string v1, "_HLS_part"

    .line 89
    .line 90
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    invoke-virtual {v0, v1, v2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 95
    .line 96
    .line 97
    :cond_2
    iget-object v1, p0, Ln8/d$a;->n:Ln8/g;

    .line 98
    .line 99
    iget-object v1, v1, Ln8/g;->t:Ln8/g$f;

    .line 100
    .line 101
    iget-wide v5, v1, Ln8/g$f;->a:J

    .line 102
    .line 103
    cmp-long v2, v5, v3

    .line 104
    .line 105
    if-eqz v2, :cond_4

    .line 106
    .line 107
    iget-boolean v1, v1, Ln8/g$f;->b:Z

    .line 108
    .line 109
    if-eqz v1, :cond_3

    .line 110
    .line 111
    const-string v1, "v2"

    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_3
    const-string v1, "YES"

    .line 115
    .line 116
    :goto_0
    const-string v2, "_HLS_skip"

    .line 117
    .line 118
    invoke-virtual {v0, v2, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 119
    .line 120
    .line 121
    :cond_4
    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    return-object v0

    .line 126
    :cond_5
    :goto_1
    iget-object v0, p0, Ln8/d$a;->k:Landroid/net/Uri;

    .line 127
    .line 128
    return-object v0
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
.end method

.method private synthetic j(Landroid/net/Uri;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Ln8/d$a;->s:Z

    .line 3
    .line 4
    invoke-direct {p0, p1}, Ln8/d$a;->n(Landroid/net/Uri;)V

    .line 5
    .line 6
    .line 7
    return-void
    .line 8
    .line 9
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
.end method

.method private n(Landroid/net/Uri;)V
    .locals 8

    .line 1
    iget-object v0, p0, Ln8/d$a;->u:Ln8/d;

    .line 2
    .line 3
    invoke-static {v0}, Ln8/d;->n(Ln8/d;)Ln8/j;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Ln8/d$a;->u:Ln8/d;

    .line 8
    .line 9
    invoke-static {v1}, Ln8/d;->z(Ln8/d;)Ln8/f;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v2, p0, Ln8/d$a;->n:Ln8/g;

    .line 14
    .line 15
    invoke-interface {v0, v1, v2}, Ln8/j;->a(Ln8/f;Ln8/g;)Lcom/google/android/exoplayer2/upstream/i$a;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    new-instance v1, Lcom/google/android/exoplayer2/upstream/i;

    .line 20
    .line 21
    iget-object v2, p0, Ln8/d$a;->m:Lcom/google/android/exoplayer2/upstream/DataSource;

    .line 22
    .line 23
    const/4 v3, 0x4

    .line 24
    invoke-direct {v1, v2, p1, v3, v0}, Lcom/google/android/exoplayer2/upstream/i;-><init>(Lcom/google/android/exoplayer2/upstream/DataSource;Landroid/net/Uri;ILcom/google/android/exoplayer2/upstream/i$a;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Ln8/d$a;->l:Lcom/google/android/exoplayer2/upstream/h;

    .line 28
    .line 29
    iget-object v0, p0, Ln8/d$a;->u:Ln8/d;

    .line 30
    .line 31
    invoke-static {v0}, Ln8/d;->w(Ln8/d;)Lcom/google/android/exoplayer2/upstream/g;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iget v2, v1, Lcom/google/android/exoplayer2/upstream/i;->c:I

    .line 36
    .line 37
    invoke-interface {v0, v2}, Lcom/google/android/exoplayer2/upstream/g;->d(I)I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    invoke-virtual {p1, v1, p0, v0}, Lcom/google/android/exoplayer2/upstream/h;->n(Lcom/google/android/exoplayer2/upstream/h$e;Lcom/google/android/exoplayer2/upstream/h$b;I)J

    .line 42
    .line 43
    .line 44
    move-result-wide v6

    .line 45
    iget-object p1, p0, Ln8/d$a;->u:Ln8/d;

    .line 46
    .line 47
    invoke-static {p1}, Ln8/d;->v(Ln8/d;)Lh8/b0$a;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    new-instance v0, Lh8/n;

    .line 52
    .line 53
    iget-wide v3, v1, Lcom/google/android/exoplayer2/upstream/i;->a:J

    .line 54
    .line 55
    iget-object v5, v1, Lcom/google/android/exoplayer2/upstream/i;->b:Lcom/google/android/exoplayer2/upstream/a;

    .line 56
    .line 57
    move-object v2, v0

    .line 58
    invoke-direct/range {v2 .. v7}, Lh8/n;-><init>(JLcom/google/android/exoplayer2/upstream/a;J)V

    .line 59
    .line 60
    .line 61
    iget v1, v1, Lcom/google/android/exoplayer2/upstream/i;->c:I

    .line 62
    .line 63
    invoke-virtual {p1, v0, v1}, Lh8/b0$a;->z(Lh8/n;I)V

    .line 64
    .line 65
    .line 66
    return-void
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

.method private o(Landroid/net/Uri;)V
    .locals 6

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    iput-wide v0, p0, Ln8/d$a;->r:J

    .line 4
    .line 5
    iget-boolean v0, p0, Ln8/d$a;->s:Z

    .line 6
    .line 7
    if-nez v0, :cond_2

    .line 8
    .line 9
    iget-object v0, p0, Ln8/d$a;->l:Lcom/google/android/exoplayer2/upstream/h;

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/upstream/h;->j()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_2

    .line 16
    .line 17
    iget-object v0, p0, Ln8/d$a;->l:Lcom/google/android/exoplayer2/upstream/h;

    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/upstream/h;->i()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 27
    .line 28
    .line 29
    move-result-wide v0

    .line 30
    iget-wide v2, p0, Ln8/d$a;->q:J

    .line 31
    .line 32
    cmp-long v2, v0, v2

    .line 33
    .line 34
    if-gez v2, :cond_1

    .line 35
    .line 36
    const/4 v2, 0x1

    .line 37
    iput-boolean v2, p0, Ln8/d$a;->s:Z

    .line 38
    .line 39
    iget-object v2, p0, Ln8/d$a;->u:Ln8/d;

    .line 40
    .line 41
    invoke-static {v2}, Ln8/d;->y(Ln8/d;)Landroid/os/Handler;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    new-instance v3, Ln8/c;

    .line 46
    .line 47
    invoke-direct {v3, p0, p1}, Ln8/c;-><init>(Ln8/d$a;Landroid/net/Uri;)V

    .line 48
    .line 49
    .line 50
    iget-wide v4, p0, Ln8/d$a;->q:J

    .line 51
    .line 52
    sub-long/2addr v4, v0

    .line 53
    invoke-virtual {v2, v3, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    invoke-direct {p0, p1}, Ln8/d$a;->n(Landroid/net/Uri;)V

    .line 58
    .line 59
    .line 60
    :cond_2
    :goto_0
    return-void
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

.method private u(Ln8/g;Lh8/n;)V
    .locals 13

    .line 1
    iget-object v0, p0, Ln8/d$a;->n:Ln8/g;

    .line 2
    .line 3
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    iput-wide v1, p0, Ln8/d$a;->o:J

    .line 8
    .line 9
    iget-object v3, p0, Ln8/d$a;->u:Ln8/d;

    .line 10
    .line 11
    invoke-static {v3, v0, p1}, Ln8/d;->o(Ln8/d;Ln8/g;Ln8/g;)Ln8/g;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    iput-object v3, p0, Ln8/d$a;->n:Ln8/g;

    .line 16
    .line 17
    const/4 v4, 0x1

    .line 18
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    if-eq v3, v0, :cond_0

    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    iput-object p1, p0, Ln8/d$a;->t:Ljava/io/IOException;

    .line 27
    .line 28
    iput-wide v1, p0, Ln8/d$a;->p:J

    .line 29
    .line 30
    iget-object p1, p0, Ln8/d$a;->u:Ln8/d;

    .line 31
    .line 32
    iget-object p2, p0, Ln8/d$a;->k:Landroid/net/Uri;

    .line 33
    .line 34
    invoke-static {p1, p2, v3}, Ln8/d;->p(Ln8/d;Landroid/net/Uri;Ln8/g;)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    iget-boolean v3, v3, Ln8/g;->m:Z

    .line 39
    .line 40
    if-nez v3, :cond_2

    .line 41
    .line 42
    iget-wide v7, p1, Ln8/g;->i:J

    .line 43
    .line 44
    iget-object p1, p1, Ln8/g;->p:Ljava/util/List;

    .line 45
    .line 46
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    int-to-long v9, p1

    .line 51
    add-long/2addr v7, v9

    .line 52
    iget-object p1, p0, Ln8/d$a;->n:Ln8/g;

    .line 53
    .line 54
    iget-wide v9, p1, Ln8/g;->i:J

    .line 55
    .line 56
    cmp-long v3, v7, v9

    .line 57
    .line 58
    if-gez v3, :cond_1

    .line 59
    .line 60
    new-instance p1, Ln8/k$c;

    .line 61
    .line 62
    iget-object p2, p0, Ln8/d$a;->k:Landroid/net/Uri;

    .line 63
    .line 64
    invoke-direct {p1, p2}, Ln8/k$c;-><init>(Landroid/net/Uri;)V

    .line 65
    .line 66
    .line 67
    iput-object p1, p0, Ln8/d$a;->t:Ljava/io/IOException;

    .line 68
    .line 69
    iget-object p1, p0, Ln8/d$a;->u:Ln8/d;

    .line 70
    .line 71
    iget-object p2, p0, Ln8/d$a;->k:Landroid/net/Uri;

    .line 72
    .line 73
    invoke-static {p1, p2, v5, v6}, Ln8/d;->x(Ln8/d;Landroid/net/Uri;J)Z

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_1
    iget-wide v7, p0, Ln8/d$a;->p:J

    .line 78
    .line 79
    sub-long v7, v1, v7

    .line 80
    .line 81
    long-to-double v7, v7

    .line 82
    iget-wide v9, p1, Ln8/g;->k:J

    .line 83
    .line 84
    invoke-static {v9, v10}, Ld7/c;->d(J)J

    .line 85
    .line 86
    .line 87
    move-result-wide v9

    .line 88
    long-to-double v9, v9

    .line 89
    iget-object p1, p0, Ln8/d$a;->u:Ln8/d;

    .line 90
    .line 91
    invoke-static {p1}, Ln8/d;->q(Ln8/d;)D

    .line 92
    .line 93
    .line 94
    move-result-wide v11

    .line 95
    mul-double/2addr v9, v11

    .line 96
    cmpl-double p1, v7, v9

    .line 97
    .line 98
    if-lez p1, :cond_2

    .line 99
    .line 100
    new-instance p1, Ln8/k$d;

    .line 101
    .line 102
    iget-object v3, p0, Ln8/d$a;->k:Landroid/net/Uri;

    .line 103
    .line 104
    invoke-direct {p1, v3}, Ln8/k$d;-><init>(Landroid/net/Uri;)V

    .line 105
    .line 106
    .line 107
    iput-object p1, p0, Ln8/d$a;->t:Ljava/io/IOException;

    .line 108
    .line 109
    new-instance p1, Lcom/google/android/exoplayer2/upstream/g$a;

    .line 110
    .line 111
    new-instance v3, Lh8/q;

    .line 112
    .line 113
    const/4 v7, 0x4

    .line 114
    invoke-direct {v3, v7}, Lh8/q;-><init>(I)V

    .line 115
    .line 116
    .line 117
    iget-object v7, p0, Ln8/d$a;->t:Ljava/io/IOException;

    .line 118
    .line 119
    invoke-direct {p1, p2, v3, v7, v4}, Lcom/google/android/exoplayer2/upstream/g$a;-><init>(Lh8/n;Lh8/q;Ljava/io/IOException;I)V

    .line 120
    .line 121
    .line 122
    iget-object p2, p0, Ln8/d$a;->u:Ln8/d;

    .line 123
    .line 124
    invoke-static {p2}, Ln8/d;->w(Ln8/d;)Lcom/google/android/exoplayer2/upstream/g;

    .line 125
    .line 126
    .line 127
    move-result-object p2

    .line 128
    invoke-interface {p2, p1}, Lcom/google/android/exoplayer2/upstream/g;->c(Lcom/google/android/exoplayer2/upstream/g$a;)J

    .line 129
    .line 130
    .line 131
    move-result-wide p1

    .line 132
    iget-object v3, p0, Ln8/d$a;->u:Ln8/d;

    .line 133
    .line 134
    iget-object v7, p0, Ln8/d$a;->k:Landroid/net/Uri;

    .line 135
    .line 136
    invoke-static {v3, v7, p1, p2}, Ln8/d;->x(Ln8/d;Landroid/net/Uri;J)Z

    .line 137
    .line 138
    .line 139
    cmp-long v3, p1, v5

    .line 140
    .line 141
    if-eqz v3, :cond_2

    .line 142
    .line 143
    invoke-direct {p0, p1, p2}, Ln8/d$a;->f(J)Z

    .line 144
    .line 145
    .line 146
    :cond_2
    :goto_0
    iget-object p1, p0, Ln8/d$a;->n:Ln8/g;

    .line 147
    .line 148
    iget-object p2, p1, Ln8/g;->t:Ln8/g$f;

    .line 149
    .line 150
    iget-boolean p2, p2, Ln8/g$f;->e:Z

    .line 151
    .line 152
    if-nez p2, :cond_4

    .line 153
    .line 154
    if-eq p1, v0, :cond_3

    .line 155
    .line 156
    iget-wide p1, p1, Ln8/g;->k:J

    .line 157
    .line 158
    goto :goto_1

    .line 159
    :cond_3
    iget-wide p1, p1, Ln8/g;->k:J

    .line 160
    .line 161
    const-wide/16 v7, 0x2

    .line 162
    .line 163
    div-long/2addr p1, v7

    .line 164
    goto :goto_1

    .line 165
    :cond_4
    const-wide/16 p1, 0x0

    .line 166
    .line 167
    :goto_1
    invoke-static {p1, p2}, Ld7/c;->d(J)J

    .line 168
    .line 169
    .line 170
    move-result-wide p1

    .line 171
    add-long/2addr v1, p1

    .line 172
    iput-wide v1, p0, Ln8/d$a;->q:J

    .line 173
    .line 174
    iget-object p1, p0, Ln8/d$a;->n:Ln8/g;

    .line 175
    .line 176
    iget-wide p1, p1, Ln8/g;->l:J

    .line 177
    .line 178
    cmp-long p1, p1, v5

    .line 179
    .line 180
    if-nez p1, :cond_6

    .line 181
    .line 182
    iget-object p1, p0, Ln8/d$a;->k:Landroid/net/Uri;

    .line 183
    .line 184
    iget-object p2, p0, Ln8/d$a;->u:Ln8/d;

    .line 185
    .line 186
    invoke-static {p2}, Ln8/d;->r(Ln8/d;)Landroid/net/Uri;

    .line 187
    .line 188
    .line 189
    move-result-object p2

    .line 190
    invoke-virtual {p1, p2}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    move-result p1

    .line 194
    if-eqz p1, :cond_5

    .line 195
    .line 196
    goto :goto_2

    .line 197
    :cond_5
    const/4 v4, 0x0

    .line 198
    :cond_6
    :goto_2
    if-eqz v4, :cond_7

    .line 199
    .line 200
    iget-object p1, p0, Ln8/d$a;->n:Ln8/g;

    .line 201
    .line 202
    iget-boolean p1, p1, Ln8/g;->m:Z

    .line 203
    .line 204
    if-nez p1, :cond_7

    .line 205
    .line 206
    invoke-direct {p0}, Ln8/d$a;->g()Landroid/net/Uri;

    .line 207
    .line 208
    .line 209
    move-result-object p1

    .line 210
    invoke-direct {p0, p1}, Ln8/d$a;->o(Landroid/net/Uri;)V

    .line 211
    .line 212
    .line 213
    :cond_7
    return-void
.end method


# virtual methods
.method public h()Ln8/g;
    .locals 1

    iget-object v0, p0, Ln8/d$a;->n:Ln8/g;

    return-object v0
.end method

.method public i()Z
    .locals 10

    .line 1
    iget-object v0, p0, Ln8/d$a;->n:Ln8/g;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 8
    .line 9
    .line 10
    move-result-wide v2

    .line 11
    iget-object v0, p0, Ln8/d$a;->n:Ln8/g;

    .line 12
    .line 13
    iget-wide v4, v0, Ln8/g;->s:J

    .line 14
    .line 15
    invoke-static {v4, v5}, Ld7/c;->d(J)J

    .line 16
    .line 17
    .line 18
    move-result-wide v4

    .line 19
    const-wide/16 v6, 0x7530

    .line 20
    .line 21
    invoke-static {v6, v7, v4, v5}, Ljava/lang/Math;->max(JJ)J

    .line 22
    .line 23
    .line 24
    move-result-wide v4

    .line 25
    iget-object v0, p0, Ln8/d$a;->n:Ln8/g;

    .line 26
    .line 27
    iget-boolean v6, v0, Ln8/g;->m:Z

    .line 28
    .line 29
    const/4 v7, 0x1

    .line 30
    if-nez v6, :cond_1

    .line 31
    .line 32
    iget v0, v0, Ln8/g;->d:I

    .line 33
    .line 34
    const/4 v6, 0x2

    .line 35
    if-eq v0, v6, :cond_1

    .line 36
    .line 37
    if-eq v0, v7, :cond_1

    .line 38
    .line 39
    iget-wide v8, p0, Ln8/d$a;->o:J

    .line 40
    .line 41
    add-long/2addr v8, v4

    .line 42
    cmp-long v0, v8, v2

    .line 43
    .line 44
    if-lez v0, :cond_2

    .line 45
    .line 46
    :cond_1
    move v1, v7

    .line 47
    :cond_2
    return v1
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

.method public k()V
    .locals 1

    iget-object v0, p0, Ln8/d$a;->k:Landroid/net/Uri;

    invoke-direct {p0, v0}, Ln8/d$a;->o(Landroid/net/Uri;)V

    return-void
.end method

.method public bridge synthetic l(Lcom/google/android/exoplayer2/upstream/h$e;JJZ)V
    .locals 0

    check-cast p1, Lcom/google/android/exoplayer2/upstream/i;

    invoke-virtual/range {p0 .. p6}, Ln8/d$a;->q(Lcom/google/android/exoplayer2/upstream/i;JJZ)V

    return-void
.end method

.method public bridge synthetic m(Lcom/google/android/exoplayer2/upstream/h$e;JJ)V
    .locals 0

    check-cast p1, Lcom/google/android/exoplayer2/upstream/i;

    invoke-virtual/range {p0 .. p5}, Ln8/d$a;->r(Lcom/google/android/exoplayer2/upstream/i;JJ)V

    return-void
.end method

.method public p()V
    .locals 1

    .line 1
    iget-object v0, p0, Ln8/d$a;->l:Lcom/google/android/exoplayer2/upstream/h;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/upstream/h;->a()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ln8/d$a;->t:Ljava/io/IOException;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    throw v0
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
.end method

.method public q(Lcom/google/android/exoplayer2/upstream/i;JJZ)V
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/exoplayer2/upstream/i<",
            "Ln8/h;",
            ">;JJZ)V"
        }
    .end annotation

    .line 1
    move-object v0, p0

    .line 2
    move-object/from16 v1, p1

    .line 3
    .line 4
    new-instance v14, Lh8/n;

    .line 5
    .line 6
    iget-wide v3, v1, Lcom/google/android/exoplayer2/upstream/i;->a:J

    .line 7
    .line 8
    iget-object v5, v1, Lcom/google/android/exoplayer2/upstream/i;->b:Lcom/google/android/exoplayer2/upstream/a;

    .line 9
    .line 10
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/exoplayer2/upstream/i;->f()Landroid/net/Uri;

    .line 11
    .line 12
    .line 13
    move-result-object v6

    .line 14
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/exoplayer2/upstream/i;->d()Ljava/util/Map;

    .line 15
    .line 16
    .line 17
    move-result-object v7

    .line 18
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/exoplayer2/upstream/i;->c()J

    .line 19
    .line 20
    .line 21
    move-result-wide v12

    .line 22
    move-object v2, v14

    .line 23
    move-wide/from16 v8, p2

    .line 24
    .line 25
    move-wide/from16 v10, p4

    .line 26
    .line 27
    invoke-direct/range {v2 .. v13}, Lh8/n;-><init>(JLcom/google/android/exoplayer2/upstream/a;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    .line 28
    .line 29
    .line 30
    iget-object v2, v0, Ln8/d$a;->u:Ln8/d;

    .line 31
    .line 32
    invoke-static {v2}, Ln8/d;->w(Ln8/d;)Lcom/google/android/exoplayer2/upstream/g;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    iget-wide v3, v1, Lcom/google/android/exoplayer2/upstream/i;->a:J

    .line 37
    .line 38
    invoke-interface {v2, v3, v4}, Lcom/google/android/exoplayer2/upstream/g;->b(J)V

    .line 39
    .line 40
    .line 41
    iget-object v1, v0, Ln8/d$a;->u:Ln8/d;

    .line 42
    .line 43
    invoke-static {v1}, Ln8/d;->v(Ln8/d;)Lh8/b0$a;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    const/4 v2, 0x4

    .line 48
    invoke-virtual {v1, v14, v2}, Lh8/b0$a;->q(Lh8/n;I)V

    .line 49
    .line 50
    .line 51
    return-void
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
.end method

.method public r(Lcom/google/android/exoplayer2/upstream/i;JJ)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/exoplayer2/upstream/i<",
            "Ln8/h;",
            ">;JJ)V"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/exoplayer2/upstream/i;->e()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    check-cast v2, Ln8/h;

    .line 10
    .line 11
    new-instance v15, Lh8/n;

    .line 12
    .line 13
    iget-wide v4, v1, Lcom/google/android/exoplayer2/upstream/i;->a:J

    .line 14
    .line 15
    iget-object v6, v1, Lcom/google/android/exoplayer2/upstream/i;->b:Lcom/google/android/exoplayer2/upstream/a;

    .line 16
    .line 17
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/exoplayer2/upstream/i;->f()Landroid/net/Uri;

    .line 18
    .line 19
    .line 20
    move-result-object v7

    .line 21
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/exoplayer2/upstream/i;->d()Ljava/util/Map;

    .line 22
    .line 23
    .line 24
    move-result-object v8

    .line 25
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/exoplayer2/upstream/i;->c()J

    .line 26
    .line 27
    .line 28
    move-result-wide v13

    .line 29
    move-object v3, v15

    .line 30
    move-wide/from16 v9, p2

    .line 31
    .line 32
    move-wide/from16 v11, p4

    .line 33
    .line 34
    invoke-direct/range {v3 .. v14}, Lh8/n;-><init>(JLcom/google/android/exoplayer2/upstream/a;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    .line 35
    .line 36
    .line 37
    instance-of v3, v2, Ln8/g;

    .line 38
    .line 39
    const/4 v4, 0x4

    .line 40
    if-eqz v3, :cond_0

    .line 41
    .line 42
    check-cast v2, Ln8/g;

    .line 43
    .line 44
    invoke-direct {v0, v2, v15}, Ln8/d$a;->u(Ln8/g;Lh8/n;)V

    .line 45
    .line 46
    .line 47
    iget-object v2, v0, Ln8/d$a;->u:Ln8/d;

    .line 48
    .line 49
    invoke-static {v2}, Ln8/d;->v(Ln8/d;)Lh8/b0$a;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-virtual {v2, v15, v4}, Lh8/b0$a;->t(Lh8/n;I)V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    new-instance v2, Ld7/o;

    .line 58
    .line 59
    const-string v3, "Loaded playlist has unexpected type."

    .line 60
    .line 61
    invoke-direct {v2, v3}, Ld7/o;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    iput-object v2, v0, Ln8/d$a;->t:Ljava/io/IOException;

    .line 65
    .line 66
    iget-object v2, v0, Ln8/d$a;->u:Ln8/d;

    .line 67
    .line 68
    invoke-static {v2}, Ln8/d;->v(Ln8/d;)Lh8/b0$a;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    iget-object v3, v0, Ln8/d$a;->t:Ljava/io/IOException;

    .line 73
    .line 74
    const/4 v5, 0x1

    .line 75
    invoke-virtual {v2, v15, v4, v3, v5}, Lh8/b0$a;->x(Lh8/n;ILjava/io/IOException;Z)V

    .line 76
    .line 77
    .line 78
    :goto_0
    iget-object v2, v0, Ln8/d$a;->u:Ln8/d;

    .line 79
    .line 80
    invoke-static {v2}, Ln8/d;->w(Ln8/d;)Lcom/google/android/exoplayer2/upstream/g;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    iget-wide v3, v1, Lcom/google/android/exoplayer2/upstream/i;->a:J

    .line 85
    .line 86
    invoke-interface {v2, v3, v4}, Lcom/google/android/exoplayer2/upstream/g;->b(J)V

    .line 87
    .line 88
    .line 89
    return-void
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
.end method

.method public s(Lcom/google/android/exoplayer2/upstream/i;JJLjava/io/IOException;I)Lcom/google/android/exoplayer2/upstream/h$c;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/exoplayer2/upstream/i<",
            "Ln8/h;",
            ">;JJ",
            "Ljava/io/IOException;",
            "I)",
            "Lcom/google/android/exoplayer2/upstream/h$c;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p6

    .line 6
    .line 7
    new-instance v15, Lh8/n;

    .line 8
    .line 9
    iget-wide v4, v1, Lcom/google/android/exoplayer2/upstream/i;->a:J

    .line 10
    .line 11
    iget-object v6, v1, Lcom/google/android/exoplayer2/upstream/i;->b:Lcom/google/android/exoplayer2/upstream/a;

    .line 12
    .line 13
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/exoplayer2/upstream/i;->f()Landroid/net/Uri;

    .line 14
    .line 15
    .line 16
    move-result-object v7

    .line 17
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/exoplayer2/upstream/i;->d()Ljava/util/Map;

    .line 18
    .line 19
    .line 20
    move-result-object v8

    .line 21
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/exoplayer2/upstream/i;->c()J

    .line 22
    .line 23
    .line 24
    move-result-wide v13

    .line 25
    move-object v3, v15

    .line 26
    move-wide/from16 v9, p2

    .line 27
    .line 28
    move-wide/from16 v11, p4

    .line 29
    .line 30
    invoke-direct/range {v3 .. v14}, Lh8/n;-><init>(JLcom/google/android/exoplayer2/upstream/a;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    .line 31
    .line 32
    .line 33
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/exoplayer2/upstream/i;->f()Landroid/net/Uri;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    const-string v4, "_HLS_msn"

    .line 38
    .line 39
    invoke-virtual {v3, v4}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    const/4 v4, 0x0

    .line 44
    const/4 v5, 0x1

    .line 45
    if-eqz v3, :cond_0

    .line 46
    .line 47
    move v3, v5

    .line 48
    goto :goto_0

    .line 49
    :cond_0
    move v3, v4

    .line 50
    :goto_0
    instance-of v6, v2, Ln8/i$a;

    .line 51
    .line 52
    if-nez v3, :cond_1

    .line 53
    .line 54
    if-eqz v6, :cond_3

    .line 55
    .line 56
    :cond_1
    instance-of v3, v2, Lcom/google/android/exoplayer2/upstream/f$f;

    .line 57
    .line 58
    if-eqz v3, :cond_2

    .line 59
    .line 60
    move-object v3, v2

    .line 61
    check-cast v3, Lcom/google/android/exoplayer2/upstream/f$f;

    .line 62
    .line 63
    iget v3, v3, Lcom/google/android/exoplayer2/upstream/f$f;->m:I

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_2
    const v3, 0x7fffffff

    .line 67
    .line 68
    .line 69
    :goto_1
    if-nez v6, :cond_b

    .line 70
    .line 71
    const/16 v6, 0x190

    .line 72
    .line 73
    if-eq v3, v6, :cond_b

    .line 74
    .line 75
    const/16 v6, 0x1f7

    .line 76
    .line 77
    if-ne v3, v6, :cond_3

    .line 78
    .line 79
    goto/16 :goto_6

    .line 80
    .line 81
    :cond_3
    new-instance v3, Lh8/q;

    .line 82
    .line 83
    iget v6, v1, Lcom/google/android/exoplayer2/upstream/i;->c:I

    .line 84
    .line 85
    invoke-direct {v3, v6}, Lh8/q;-><init>(I)V

    .line 86
    .line 87
    .line 88
    new-instance v6, Lcom/google/android/exoplayer2/upstream/g$a;

    .line 89
    .line 90
    move/from16 v7, p7

    .line 91
    .line 92
    invoke-direct {v6, v15, v3, v2, v7}, Lcom/google/android/exoplayer2/upstream/g$a;-><init>(Lh8/n;Lh8/q;Ljava/io/IOException;I)V

    .line 93
    .line 94
    .line 95
    iget-object v3, v0, Ln8/d$a;->u:Ln8/d;

    .line 96
    .line 97
    invoke-static {v3}, Ln8/d;->w(Ln8/d;)Lcom/google/android/exoplayer2/upstream/g;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    invoke-interface {v3, v6}, Lcom/google/android/exoplayer2/upstream/g;->c(Lcom/google/android/exoplayer2/upstream/g$a;)J

    .line 102
    .line 103
    .line 104
    move-result-wide v7

    .line 105
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    cmp-long v3, v7, v9

    .line 111
    .line 112
    if-eqz v3, :cond_4

    .line 113
    .line 114
    move v3, v5

    .line 115
    goto :goto_2

    .line 116
    :cond_4
    move v3, v4

    .line 117
    :goto_2
    iget-object v11, v0, Ln8/d$a;->u:Ln8/d;

    .line 118
    .line 119
    iget-object v12, v0, Ln8/d$a;->k:Landroid/net/Uri;

    .line 120
    .line 121
    invoke-static {v11, v12, v7, v8}, Ln8/d;->x(Ln8/d;Landroid/net/Uri;J)Z

    .line 122
    .line 123
    .line 124
    move-result v11

    .line 125
    if-nez v11, :cond_6

    .line 126
    .line 127
    if-nez v3, :cond_5

    .line 128
    .line 129
    goto :goto_3

    .line 130
    :cond_5
    move v11, v4

    .line 131
    goto :goto_4

    .line 132
    :cond_6
    :goto_3
    move v11, v5

    .line 133
    :goto_4
    if-eqz v3, :cond_7

    .line 134
    .line 135
    invoke-direct {v0, v7, v8}, Ln8/d$a;->f(J)Z

    .line 136
    .line 137
    .line 138
    move-result v3

    .line 139
    or-int/2addr v11, v3

    .line 140
    :cond_7
    if-eqz v11, :cond_9

    .line 141
    .line 142
    iget-object v3, v0, Ln8/d$a;->u:Ln8/d;

    .line 143
    .line 144
    invoke-static {v3}, Ln8/d;->w(Ln8/d;)Lcom/google/android/exoplayer2/upstream/g;

    .line 145
    .line 146
    .line 147
    move-result-object v3

    .line 148
    invoke-interface {v3, v6}, Lcom/google/android/exoplayer2/upstream/g;->a(Lcom/google/android/exoplayer2/upstream/g$a;)J

    .line 149
    .line 150
    .line 151
    move-result-wide v6

    .line 152
    cmp-long v3, v6, v9

    .line 153
    .line 154
    if-eqz v3, :cond_8

    .line 155
    .line 156
    invoke-static {v4, v6, v7}, Lcom/google/android/exoplayer2/upstream/h;->h(ZJ)Lcom/google/android/exoplayer2/upstream/h$c;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    goto :goto_5

    .line 161
    :cond_8
    sget-object v3, Lcom/google/android/exoplayer2/upstream/h;->g:Lcom/google/android/exoplayer2/upstream/h$c;

    .line 162
    .line 163
    goto :goto_5

    .line 164
    :cond_9
    sget-object v3, Lcom/google/android/exoplayer2/upstream/h;->f:Lcom/google/android/exoplayer2/upstream/h$c;

    .line 165
    .line 166
    :goto_5
    invoke-virtual {v3}, Lcom/google/android/exoplayer2/upstream/h$c;->c()Z

    .line 167
    .line 168
    .line 169
    move-result v4

    .line 170
    xor-int/2addr v4, v5

    .line 171
    iget-object v5, v0, Ln8/d$a;->u:Ln8/d;

    .line 172
    .line 173
    invoke-static {v5}, Ln8/d;->v(Ln8/d;)Lh8/b0$a;

    .line 174
    .line 175
    .line 176
    move-result-object v5

    .line 177
    iget v6, v1, Lcom/google/android/exoplayer2/upstream/i;->c:I

    .line 178
    .line 179
    invoke-virtual {v5, v15, v6, v2, v4}, Lh8/b0$a;->x(Lh8/n;ILjava/io/IOException;Z)V

    .line 180
    .line 181
    .line 182
    if-eqz v4, :cond_a

    .line 183
    .line 184
    iget-object v2, v0, Ln8/d$a;->u:Ln8/d;

    .line 185
    .line 186
    invoke-static {v2}, Ln8/d;->w(Ln8/d;)Lcom/google/android/exoplayer2/upstream/g;

    .line 187
    .line 188
    .line 189
    move-result-object v2

    .line 190
    iget-wide v4, v1, Lcom/google/android/exoplayer2/upstream/i;->a:J

    .line 191
    .line 192
    invoke-interface {v2, v4, v5}, Lcom/google/android/exoplayer2/upstream/g;->b(J)V

    .line 193
    .line 194
    .line 195
    :cond_a
    return-object v3

    .line 196
    :cond_b
    :goto_6
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 197
    .line 198
    .line 199
    move-result-wide v3

    .line 200
    iput-wide v3, v0, Ln8/d$a;->q:J

    .line 201
    .line 202
    invoke-virtual/range {p0 .. p0}, Ln8/d$a;->k()V

    .line 203
    .line 204
    .line 205
    iget-object v3, v0, Ln8/d$a;->u:Ln8/d;

    .line 206
    .line 207
    invoke-static {v3}, Ln8/d;->v(Ln8/d;)Lh8/b0$a;

    .line 208
    .line 209
    .line 210
    move-result-object v3

    .line 211
    invoke-static {v3}, Lf9/q0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v3

    .line 215
    check-cast v3, Lh8/b0$a;

    .line 216
    .line 217
    iget v1, v1, Lcom/google/android/exoplayer2/upstream/i;->c:I

    .line 218
    .line 219
    invoke-virtual {v3, v15, v1, v2, v5}, Lh8/b0$a;->x(Lh8/n;ILjava/io/IOException;Z)V

    .line 220
    .line 221
    .line 222
    sget-object v1, Lcom/google/android/exoplayer2/upstream/h;->f:Lcom/google/android/exoplayer2/upstream/h$c;

    .line 223
    .line 224
    return-object v1
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
.end method

.method public bridge synthetic t(Lcom/google/android/exoplayer2/upstream/h$e;JJLjava/io/IOException;I)Lcom/google/android/exoplayer2/upstream/h$c;
    .locals 0

    check-cast p1, Lcom/google/android/exoplayer2/upstream/i;

    invoke-virtual/range {p0 .. p7}, Ln8/d$a;->s(Lcom/google/android/exoplayer2/upstream/i;JJLjava/io/IOException;I)Lcom/google/android/exoplayer2/upstream/h$c;

    move-result-object p1

    return-object p1
.end method

.method public v()V
    .locals 1

    iget-object v0, p0, Ln8/d$a;->l:Lcom/google/android/exoplayer2/upstream/h;

    invoke-virtual {v0}, Lcom/google/android/exoplayer2/upstream/h;->l()V

    return-void
.end method
