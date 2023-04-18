.class final Lh8/j0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/exoplayer2/upstream/h$e;
.implements Lh8/m$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh8/j0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "a"
.end annotation


# instance fields
.field private final a:J

.field private final b:Landroid/net/Uri;

.field private final c:Ld9/v;

.field private final d:Lh8/f0;

.field private final e:Ll7/k;

.field private final f:Lf9/f;

.field private final g:Ll7/x;

.field private volatile h:Z

.field private i:Z

.field private j:J

.field private k:Lcom/google/android/exoplayer2/upstream/a;

.field private l:J

.field private m:Ll7/b0;

.field private n:Z

.field final synthetic o:Lh8/j0;


# direct methods
.method public constructor <init>(Lh8/j0;Landroid/net/Uri;Lcom/google/android/exoplayer2/upstream/DataSource;Lh8/f0;Ll7/k;Lf9/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lh8/j0$a;->o:Lh8/j0;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lh8/j0$a;->b:Landroid/net/Uri;

    .line 7
    .line 8
    new-instance p1, Ld9/v;

    .line 9
    .line 10
    invoke-direct {p1, p3}, Ld9/v;-><init>(Lcom/google/android/exoplayer2/upstream/DataSource;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lh8/j0$a;->c:Ld9/v;

    .line 14
    .line 15
    iput-object p4, p0, Lh8/j0$a;->d:Lh8/f0;

    .line 16
    .line 17
    iput-object p5, p0, Lh8/j0$a;->e:Ll7/k;

    .line 18
    .line 19
    iput-object p6, p0, Lh8/j0$a;->f:Lf9/f;

    .line 20
    .line 21
    new-instance p1, Ll7/x;

    .line 22
    .line 23
    invoke-direct {p1}, Ll7/x;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object p1, p0, Lh8/j0$a;->g:Ll7/x;

    .line 27
    .line 28
    const/4 p1, 0x1

    .line 29
    iput-boolean p1, p0, Lh8/j0$a;->i:Z

    .line 30
    .line 31
    const-wide/16 p1, -0x1

    .line 32
    .line 33
    iput-wide p1, p0, Lh8/j0$a;->l:J

    .line 34
    .line 35
    invoke-static {}, Lh8/n;->a()J

    .line 36
    .line 37
    .line 38
    move-result-wide p1

    .line 39
    iput-wide p1, p0, Lh8/j0$a;->a:J

    .line 40
    .line 41
    const-wide/16 p1, 0x0

    .line 42
    .line 43
    invoke-direct {p0, p1, p2}, Lh8/j0$a;->j(J)Lcom/google/android/exoplayer2/upstream/a;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    iput-object p1, p0, Lh8/j0$a;->k:Lcom/google/android/exoplayer2/upstream/a;

    .line 48
    .line 49
    return-void
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
.end method

.method static synthetic d(Lh8/j0$a;)Ld9/v;
    .locals 0

    iget-object p0, p0, Lh8/j0$a;->c:Ld9/v;

    return-object p0
.end method

.method static synthetic e(Lh8/j0$a;)J
    .locals 2

    iget-wide v0, p0, Lh8/j0$a;->a:J

    return-wide v0
.end method

.method static synthetic f(Lh8/j0$a;)Lcom/google/android/exoplayer2/upstream/a;
    .locals 0

    iget-object p0, p0, Lh8/j0$a;->k:Lcom/google/android/exoplayer2/upstream/a;

    return-object p0
.end method

.method static synthetic g(Lh8/j0$a;)J
    .locals 2

    iget-wide v0, p0, Lh8/j0$a;->j:J

    return-wide v0
.end method

.method static synthetic h(Lh8/j0$a;)J
    .locals 2

    iget-wide v0, p0, Lh8/j0$a;->l:J

    return-wide v0
.end method

.method static synthetic i(Lh8/j0$a;JJ)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lh8/j0$a;->k(JJ)V

    return-void
.end method

.method private j(J)Lcom/google/android/exoplayer2/upstream/a;
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/exoplayer2/upstream/a$b;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/exoplayer2/upstream/a$b;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lh8/j0$a;->b:Landroid/net/Uri;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lcom/google/android/exoplayer2/upstream/a$b;->i(Landroid/net/Uri;)Lcom/google/android/exoplayer2/upstream/a$b;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0, p1, p2}, Lcom/google/android/exoplayer2/upstream/a$b;->h(J)Lcom/google/android/exoplayer2/upstream/a$b;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iget-object p2, p0, Lh8/j0$a;->o:Lh8/j0;

    .line 17
    .line 18
    invoke-static {p2}, Lh8/j0;->C(Lh8/j0;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    invoke-virtual {p1, p2}, Lcom/google/android/exoplayer2/upstream/a$b;->f(Ljava/lang/String;)Lcom/google/android/exoplayer2/upstream/a$b;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    const/4 p2, 0x6

    .line 27
    invoke-virtual {p1, p2}, Lcom/google/android/exoplayer2/upstream/a$b;->b(I)Lcom/google/android/exoplayer2/upstream/a$b;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-static {}, Lh8/j0;->B()Ljava/util/Map;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    invoke-virtual {p1, p2}, Lcom/google/android/exoplayer2/upstream/a$b;->e(Ljava/util/Map;)Lcom/google/android/exoplayer2/upstream/a$b;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {p1}, Lcom/google/android/exoplayer2/upstream/a$b;->a()Lcom/google/android/exoplayer2/upstream/a;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    return-object p1
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

.method private k(JJ)V
    .locals 1

    .line 1
    iget-object v0, p0, Lh8/j0$a;->g:Ll7/x;

    .line 2
    .line 3
    iput-wide p1, v0, Ll7/x;->a:J

    .line 4
    .line 5
    iput-wide p3, p0, Lh8/j0$a;->j:J

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    iput-boolean p1, p0, Lh8/j0$a;->i:Z

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    iput-boolean p1, p0, Lh8/j0$a;->n:Z

    .line 12
    .line 13
    return-void
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


# virtual methods
.method public a()V
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    move v2, v0

    .line 5
    :goto_0
    if-nez v2, :cond_9

    .line 6
    .line 7
    iget-boolean v3, v1, Lh8/j0$a;->h:Z

    .line 8
    .line 9
    if-nez v3, :cond_9

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    const-wide/16 v4, -0x1

    .line 13
    .line 14
    :try_start_0
    iget-object v6, v1, Lh8/j0$a;->g:Ll7/x;

    .line 15
    .line 16
    iget-wide v13, v6, Ll7/x;->a:J

    .line 17
    .line 18
    invoke-direct {v1, v13, v14}, Lh8/j0$a;->j(J)Lcom/google/android/exoplayer2/upstream/a;

    .line 19
    .line 20
    .line 21
    move-result-object v6

    .line 22
    iput-object v6, v1, Lh8/j0$a;->k:Lcom/google/android/exoplayer2/upstream/a;

    .line 23
    .line 24
    iget-object v7, v1, Lh8/j0$a;->c:Ld9/v;

    .line 25
    .line 26
    invoke-virtual {v7, v6}, Ld9/v;->b(Lcom/google/android/exoplayer2/upstream/a;)J

    .line 27
    .line 28
    .line 29
    move-result-wide v6

    .line 30
    iput-wide v6, v1, Lh8/j0$a;->l:J

    .line 31
    .line 32
    cmp-long v8, v6, v4

    .line 33
    .line 34
    if-eqz v8, :cond_0

    .line 35
    .line 36
    add-long/2addr v6, v13

    .line 37
    iput-wide v6, v1, Lh8/j0$a;->l:J

    .line 38
    .line 39
    :cond_0
    iget-object v6, v1, Lh8/j0$a;->o:Lh8/j0;

    .line 40
    .line 41
    iget-object v7, v1, Lh8/j0$a;->c:Ld9/v;

    .line 42
    .line 43
    invoke-virtual {v7}, Ld9/v;->i()Ljava/util/Map;

    .line 44
    .line 45
    .line 46
    move-result-object v7

    .line 47
    invoke-static {v7}, Lc8/b;->b(Ljava/util/Map;)Lc8/b;

    .line 48
    .line 49
    .line 50
    move-result-object v7

    .line 51
    invoke-static {v6, v7}, Lh8/j0;->E(Lh8/j0;Lc8/b;)Lc8/b;

    .line 52
    .line 53
    .line 54
    iget-object v6, v1, Lh8/j0$a;->c:Ld9/v;

    .line 55
    .line 56
    iget-object v7, v1, Lh8/j0$a;->o:Lh8/j0;

    .line 57
    .line 58
    invoke-static {v7}, Lh8/j0;->D(Lh8/j0;)Lc8/b;

    .line 59
    .line 60
    .line 61
    move-result-object v7

    .line 62
    if-eqz v7, :cond_1

    .line 63
    .line 64
    iget-object v7, v1, Lh8/j0$a;->o:Lh8/j0;

    .line 65
    .line 66
    invoke-static {v7}, Lh8/j0;->D(Lh8/j0;)Lc8/b;

    .line 67
    .line 68
    .line 69
    move-result-object v7

    .line 70
    iget v7, v7, Lc8/b;->p:I

    .line 71
    .line 72
    const/4 v8, -0x1

    .line 73
    if-eq v7, v8, :cond_1

    .line 74
    .line 75
    new-instance v6, Lh8/m;

    .line 76
    .line 77
    iget-object v7, v1, Lh8/j0$a;->c:Ld9/v;

    .line 78
    .line 79
    iget-object v8, v1, Lh8/j0$a;->o:Lh8/j0;

    .line 80
    .line 81
    invoke-static {v8}, Lh8/j0;->D(Lh8/j0;)Lc8/b;

    .line 82
    .line 83
    .line 84
    move-result-object v8

    .line 85
    iget v8, v8, Lc8/b;->p:I

    .line 86
    .line 87
    invoke-direct {v6, v7, v8, v1}, Lh8/m;-><init>(Lcom/google/android/exoplayer2/upstream/DataSource;ILh8/m$a;)V

    .line 88
    .line 89
    .line 90
    iget-object v7, v1, Lh8/j0$a;->o:Lh8/j0;

    .line 91
    .line 92
    invoke-virtual {v7}, Lh8/j0;->N()Ll7/b0;

    .line 93
    .line 94
    .line 95
    move-result-object v7

    .line 96
    iput-object v7, v1, Lh8/j0$a;->m:Ll7/b0;

    .line 97
    .line 98
    invoke-static {}, Lh8/j0;->F()Ld7/k;

    .line 99
    .line 100
    .line 101
    move-result-object v8

    .line 102
    invoke-interface {v7, v8}, Ll7/b0;->a(Ld7/k;)V

    .line 103
    .line 104
    .line 105
    :cond_1
    move-object v8, v6

    .line 106
    iget-object v7, v1, Lh8/j0$a;->d:Lh8/f0;

    .line 107
    .line 108
    iget-object v9, v1, Lh8/j0$a;->b:Landroid/net/Uri;

    .line 109
    .line 110
    iget-object v6, v1, Lh8/j0$a;->c:Ld9/v;

    .line 111
    .line 112
    invoke-virtual {v6}, Ld9/v;->i()Ljava/util/Map;

    .line 113
    .line 114
    .line 115
    move-result-object v10

    .line 116
    iget-wide v11, v1, Lh8/j0$a;->l:J

    .line 117
    .line 118
    iget-object v15, v1, Lh8/j0$a;->e:Ll7/k;

    .line 119
    .line 120
    move-wide/from16 v16, v11

    .line 121
    .line 122
    move-wide v11, v13

    .line 123
    move-wide v4, v13

    .line 124
    move-wide/from16 v13, v16

    .line 125
    .line 126
    invoke-interface/range {v7 .. v15}, Lh8/f0;->d(Ld9/h;Landroid/net/Uri;Ljava/util/Map;JJLl7/k;)V

    .line 127
    .line 128
    .line 129
    iget-object v6, v1, Lh8/j0$a;->o:Lh8/j0;

    .line 130
    .line 131
    invoke-static {v6}, Lh8/j0;->D(Lh8/j0;)Lc8/b;

    .line 132
    .line 133
    .line 134
    move-result-object v6

    .line 135
    if-eqz v6, :cond_2

    .line 136
    .line 137
    iget-object v6, v1, Lh8/j0$a;->d:Lh8/f0;

    .line 138
    .line 139
    invoke-interface {v6}, Lh8/f0;->f()V

    .line 140
    .line 141
    .line 142
    :cond_2
    iget-boolean v6, v1, Lh8/j0$a;->i:Z

    .line 143
    .line 144
    if-eqz v6, :cond_3

    .line 145
    .line 146
    iget-object v6, v1, Lh8/j0$a;->d:Lh8/f0;

    .line 147
    .line 148
    iget-wide v7, v1, Lh8/j0$a;->j:J

    .line 149
    .line 150
    invoke-interface {v6, v4, v5, v7, v8}, Lh8/f0;->c(JJ)V

    .line 151
    .line 152
    .line 153
    iput-boolean v0, v1, Lh8/j0$a;->i:Z

    .line 154
    .line 155
    :cond_3
    :goto_1
    move-wide v13, v4

    .line 156
    :cond_4
    if-nez v2, :cond_5

    .line 157
    .line 158
    iget-boolean v4, v1, Lh8/j0$a;->h:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 159
    .line 160
    if-nez v4, :cond_5

    .line 161
    .line 162
    :try_start_1
    iget-object v4, v1, Lh8/j0$a;->f:Lf9/f;

    .line 163
    .line 164
    invoke-virtual {v4}, Lf9/f;->a()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 165
    .line 166
    .line 167
    :try_start_2
    iget-object v4, v1, Lh8/j0$a;->d:Lh8/f0;

    .line 168
    .line 169
    iget-object v5, v1, Lh8/j0$a;->g:Ll7/x;

    .line 170
    .line 171
    invoke-interface {v4, v5}, Lh8/f0;->g(Ll7/x;)I

    .line 172
    .line 173
    .line 174
    move-result v2

    .line 175
    iget-object v4, v1, Lh8/j0$a;->d:Lh8/f0;

    .line 176
    .line 177
    invoke-interface {v4}, Lh8/f0;->e()J

    .line 178
    .line 179
    .line 180
    move-result-wide v4

    .line 181
    iget-object v6, v1, Lh8/j0$a;->o:Lh8/j0;

    .line 182
    .line 183
    invoke-static {v6}, Lh8/j0;->G(Lh8/j0;)J

    .line 184
    .line 185
    .line 186
    move-result-wide v6

    .line 187
    add-long/2addr v6, v13

    .line 188
    cmp-long v6, v4, v6

    .line 189
    .line 190
    if-lez v6, :cond_4

    .line 191
    .line 192
    iget-object v6, v1, Lh8/j0$a;->f:Lf9/f;

    .line 193
    .line 194
    invoke-virtual {v6}, Lf9/f;->b()Z

    .line 195
    .line 196
    .line 197
    iget-object v6, v1, Lh8/j0$a;->o:Lh8/j0;

    .line 198
    .line 199
    invoke-static {v6}, Lh8/j0;->z(Lh8/j0;)Landroid/os/Handler;

    .line 200
    .line 201
    .line 202
    move-result-object v6

    .line 203
    iget-object v7, v1, Lh8/j0$a;->o:Lh8/j0;

    .line 204
    .line 205
    invoke-static {v7}, Lh8/j0;->y(Lh8/j0;)Ljava/lang/Runnable;

    .line 206
    .line 207
    .line 208
    move-result-object v7

    .line 209
    invoke-virtual {v6, v7}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 210
    .line 211
    .line 212
    goto :goto_1

    .line 213
    :catch_0
    new-instance v0, Ljava/io/InterruptedIOException;

    .line 214
    .line 215
    invoke-direct {v0}, Ljava/io/InterruptedIOException;-><init>()V

    .line 216
    .line 217
    .line 218
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 219
    :cond_5
    if-ne v2, v3, :cond_6

    .line 220
    .line 221
    move v2, v0

    .line 222
    goto :goto_2

    .line 223
    :cond_6
    iget-object v3, v1, Lh8/j0$a;->d:Lh8/f0;

    .line 224
    .line 225
    invoke-interface {v3}, Lh8/f0;->e()J

    .line 226
    .line 227
    .line 228
    move-result-wide v3

    .line 229
    const-wide/16 v5, -0x1

    .line 230
    .line 231
    cmp-long v3, v3, v5

    .line 232
    .line 233
    if-eqz v3, :cond_7

    .line 234
    .line 235
    iget-object v3, v1, Lh8/j0$a;->g:Ll7/x;

    .line 236
    .line 237
    iget-object v4, v1, Lh8/j0$a;->d:Lh8/f0;

    .line 238
    .line 239
    invoke-interface {v4}, Lh8/f0;->e()J

    .line 240
    .line 241
    .line 242
    move-result-wide v4

    .line 243
    iput-wide v4, v3, Ll7/x;->a:J

    .line 244
    .line 245
    :cond_7
    :goto_2
    iget-object v3, v1, Lh8/j0$a;->c:Ld9/v;

    .line 246
    .line 247
    invoke-static {v3}, Lf9/q0;->n(Lcom/google/android/exoplayer2/upstream/DataSource;)V

    .line 248
    .line 249
    .line 250
    goto/16 :goto_0

    .line 251
    .line 252
    :catchall_0
    move-exception v0

    .line 253
    if-eq v2, v3, :cond_8

    .line 254
    .line 255
    iget-object v2, v1, Lh8/j0$a;->d:Lh8/f0;

    .line 256
    .line 257
    invoke-interface {v2}, Lh8/f0;->e()J

    .line 258
    .line 259
    .line 260
    move-result-wide v2

    .line 261
    const-wide/16 v4, -0x1

    .line 262
    .line 263
    cmp-long v2, v2, v4

    .line 264
    .line 265
    if-eqz v2, :cond_8

    .line 266
    .line 267
    iget-object v2, v1, Lh8/j0$a;->g:Ll7/x;

    .line 268
    .line 269
    iget-object v3, v1, Lh8/j0$a;->d:Lh8/f0;

    .line 270
    .line 271
    invoke-interface {v3}, Lh8/f0;->e()J

    .line 272
    .line 273
    .line 274
    move-result-wide v3

    .line 275
    iput-wide v3, v2, Ll7/x;->a:J

    .line 276
    .line 277
    :cond_8
    iget-object v2, v1, Lh8/j0$a;->c:Ld9/v;

    .line 278
    .line 279
    invoke-static {v2}, Lf9/q0;->n(Lcom/google/android/exoplayer2/upstream/DataSource;)V

    .line 280
    .line 281
    .line 282
    throw v0

    .line 283
    :cond_9
    return-void
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

.method public b()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lh8/j0$a;->h:Z

    return-void
.end method

.method public c(Lf9/y;)V
    .locals 9

    .line 1
    iget-boolean v0, p0, Lh8/j0$a;->n:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-wide v0, p0, Lh8/j0$a;->j:J

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget-object v0, p0, Lh8/j0$a;->o:Lh8/j0;

    .line 9
    .line 10
    invoke-static {v0}, Lh8/j0;->A(Lh8/j0;)J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    iget-wide v2, p0, Lh8/j0$a;->j:J

    .line 15
    .line 16
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    :goto_0
    move-wide v3, v0

    .line 21
    invoke-virtual {p1}, Lf9/y;->a()I

    .line 22
    .line 23
    .line 24
    move-result v6

    .line 25
    iget-object v0, p0, Lh8/j0$a;->m:Ll7/b0;

    .line 26
    .line 27
    invoke-static {v0}, Lf9/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    move-object v2, v0

    .line 32
    check-cast v2, Ll7/b0;

    .line 33
    .line 34
    invoke-interface {v2, p1, v6}, Ll7/b0;->e(Lf9/y;I)V

    .line 35
    .line 36
    .line 37
    const/4 v5, 0x1

    .line 38
    const/4 v7, 0x0

    .line 39
    const/4 v8, 0x0

    .line 40
    invoke-interface/range {v2 .. v8}, Ll7/b0;->d(JIIILl7/b0$a;)V

    .line 41
    .line 42
    .line 43
    const/4 p1, 0x1

    .line 44
    iput-boolean p1, p0, Lh8/j0$a;->n:Z

    .line 45
    .line 46
    return-void
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
