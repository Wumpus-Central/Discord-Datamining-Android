.class public final Lf7/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf7/s;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf7/d0$g;,
        Lf7/d0$c;,
        Lf7/d0$h;,
        Lf7/d0$f;,
        Lf7/d0$i;,
        Lf7/d0$d;,
        Lf7/d0$b;,
        Lf7/d0$e;
    }
.end annotation


# static fields
.field public static a0:Z = false


# instance fields
.field private A:J

.field private B:J

.field private C:J

.field private D:I

.field private E:Z

.field private F:Z

.field private G:J

.field private H:F

.field private I:[Lf7/h;

.field private J:[Ljava/nio/ByteBuffer;

.field private K:Ljava/nio/ByteBuffer;

.field private L:I

.field private M:Ljava/nio/ByteBuffer;

.field private N:[B

.field private O:I

.field private P:I

.field private Q:Z

.field private R:Z

.field private S:Z

.field private T:Z

.field private U:I

.field private V:Lf7/v;

.field private W:Z

.field private X:J

.field private Y:Z

.field private Z:Z

.field private final a:Lf7/f;

.field private final b:Lf7/d0$b;

.field private final c:Z

.field private final d:Lf7/x;

.field private final e:Lf7/r0;

.field private final f:[Lf7/h;

.field private final g:[Lf7/h;

.field private final h:Landroid/os/ConditionVariable;

.field private final i:Lf7/u;

.field private final j:Ljava/util/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "Lf7/d0$f;",
            ">;"
        }
    .end annotation
.end field

.field private final k:Z

.field private final l:Z

.field private m:Lf7/d0$i;

.field private final n:Lf7/d0$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf7/d0$g<",
            "Lf7/s$b;",
            ">;"
        }
    .end annotation
.end field

.field private final o:Lf7/d0$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf7/d0$g<",
            "Lf7/s$d;",
            ">;"
        }
    .end annotation
.end field

.field private p:Lf7/s$c;

.field private q:Lf7/d0$c;

.field private r:Lf7/d0$c;

.field private s:Landroid/media/AudioTrack;

.field private t:Lf7/e;

.field private u:Lf7/d0$f;

.field private v:Lf7/d0$f;

.field private w:Lcom/google/android/exoplayer2/PlaybackParameters;

.field private x:Ljava/nio/ByteBuffer;

.field private y:I

.field private z:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lf7/f;Lf7/d0$b;ZZZ)V
    .locals 13

    .line 1
    move-object v0, p0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    .line 4
    .line 5
    move-object v1, p1

    .line 6
    iput-object v1, v0, Lf7/d0;->a:Lf7/f;

    .line 7
    .line 8
    invoke-static {p2}, Lf9/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Lf7/d0$b;

    .line 13
    .line 14
    iput-object v1, v0, Lf7/d0;->b:Lf7/d0$b;

    .line 15
    .line 16
    sget v1, Lf9/q0;->a:I

    .line 17
    .line 18
    const/16 v2, 0x15

    .line 19
    .line 20
    const/4 v3, 0x1

    .line 21
    const/4 v4, 0x0

    .line 22
    if-lt v1, v2, :cond_0

    .line 23
    .line 24
    if-eqz p3, :cond_0

    .line 25
    .line 26
    move v2, v3

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move v2, v4

    .line 29
    :goto_0
    iput-boolean v2, v0, Lf7/d0;->c:Z

    .line 30
    .line 31
    const/16 v2, 0x17

    .line 32
    .line 33
    if-lt v1, v2, :cond_1

    .line 34
    .line 35
    if-eqz p4, :cond_1

    .line 36
    .line 37
    move v2, v3

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    move v2, v4

    .line 40
    :goto_1
    iput-boolean v2, v0, Lf7/d0;->k:Z

    .line 41
    .line 42
    const/16 v2, 0x1d

    .line 43
    .line 44
    if-lt v1, v2, :cond_2

    .line 45
    .line 46
    if-eqz p5, :cond_2

    .line 47
    .line 48
    move v1, v3

    .line 49
    goto :goto_2

    .line 50
    :cond_2
    move v1, v4

    .line 51
    :goto_2
    iput-boolean v1, v0, Lf7/d0;->l:Z

    .line 52
    .line 53
    new-instance v1, Landroid/os/ConditionVariable;

    .line 54
    .line 55
    invoke-direct {v1, v3}, Landroid/os/ConditionVariable;-><init>(Z)V

    .line 56
    .line 57
    .line 58
    iput-object v1, v0, Lf7/d0;->h:Landroid/os/ConditionVariable;

    .line 59
    .line 60
    new-instance v1, Lf7/u;

    .line 61
    .line 62
    new-instance v2, Lf7/d0$h;

    .line 63
    .line 64
    const/4 v5, 0x0

    .line 65
    invoke-direct {v2, p0, v5}, Lf7/d0$h;-><init>(Lf7/d0;Lf7/d0$a;)V

    .line 66
    .line 67
    .line 68
    invoke-direct {v1, v2}, Lf7/u;-><init>(Lf7/u$a;)V

    .line 69
    .line 70
    .line 71
    iput-object v1, v0, Lf7/d0;->i:Lf7/u;

    .line 72
    .line 73
    new-instance v1, Lf7/x;

    .line 74
    .line 75
    invoke-direct {v1}, Lf7/x;-><init>()V

    .line 76
    .line 77
    .line 78
    iput-object v1, v0, Lf7/d0;->d:Lf7/x;

    .line 79
    .line 80
    new-instance v2, Lf7/r0;

    .line 81
    .line 82
    invoke-direct {v2}, Lf7/r0;-><init>()V

    .line 83
    .line 84
    .line 85
    iput-object v2, v0, Lf7/d0;->e:Lf7/r0;

    .line 86
    .line 87
    new-instance v5, Ljava/util/ArrayList;

    .line 88
    .line 89
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 90
    .line 91
    .line 92
    const/4 v6, 0x3

    .line 93
    new-array v6, v6, [Lf7/w;

    .line 94
    .line 95
    new-instance v7, Lf7/n0;

    .line 96
    .line 97
    invoke-direct {v7}, Lf7/n0;-><init>()V

    .line 98
    .line 99
    .line 100
    aput-object v7, v6, v4

    .line 101
    .line 102
    aput-object v1, v6, v3

    .line 103
    .line 104
    const/4 v1, 0x2

    .line 105
    aput-object v2, v6, v1

    .line 106
    .line 107
    invoke-static {v5, v6}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    invoke-interface {p2}, Lf7/d0$b;->e()[Lf7/h;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    invoke-static {v5, v1}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    new-array v1, v4, [Lf7/h;

    .line 118
    .line 119
    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    check-cast v1, [Lf7/h;

    .line 124
    .line 125
    iput-object v1, v0, Lf7/d0;->f:[Lf7/h;

    .line 126
    .line 127
    new-array v1, v3, [Lf7/h;

    .line 128
    .line 129
    new-instance v2, Lf7/j0;

    .line 130
    .line 131
    invoke-direct {v2}, Lf7/j0;-><init>()V

    .line 132
    .line 133
    .line 134
    aput-object v2, v1, v4

    .line 135
    .line 136
    iput-object v1, v0, Lf7/d0;->g:[Lf7/h;

    .line 137
    .line 138
    const/high16 v1, 0x3f800000    # 1.0f

    .line 139
    .line 140
    iput v1, v0, Lf7/d0;->H:F

    .line 141
    .line 142
    sget-object v1, Lf7/e;->f:Lf7/e;

    .line 143
    .line 144
    iput-object v1, v0, Lf7/d0;->t:Lf7/e;

    .line 145
    .line 146
    iput v4, v0, Lf7/d0;->U:I

    .line 147
    .line 148
    new-instance v1, Lf7/v;

    .line 149
    .line 150
    const/4 v2, 0x0

    .line 151
    invoke-direct {v1, v4, v2}, Lf7/v;-><init>(IF)V

    .line 152
    .line 153
    .line 154
    iput-object v1, v0, Lf7/d0;->V:Lf7/v;

    .line 155
    .line 156
    new-instance v1, Lf7/d0$f;

    .line 157
    .line 158
    sget-object v2, Lcom/google/android/exoplayer2/PlaybackParameters;->d:Lcom/google/android/exoplayer2/PlaybackParameters;

    .line 159
    .line 160
    const/4 v7, 0x0

    .line 161
    const-wide/16 v8, 0x0

    .line 162
    .line 163
    const-wide/16 v10, 0x0

    .line 164
    .line 165
    const/4 v12, 0x0

    .line 166
    move-object v5, v1

    .line 167
    move-object v6, v2

    .line 168
    invoke-direct/range {v5 .. v12}, Lf7/d0$f;-><init>(Lcom/google/android/exoplayer2/PlaybackParameters;ZJJLf7/d0$a;)V

    .line 169
    .line 170
    .line 171
    iput-object v1, v0, Lf7/d0;->v:Lf7/d0$f;

    .line 172
    .line 173
    iput-object v2, v0, Lf7/d0;->w:Lcom/google/android/exoplayer2/PlaybackParameters;

    .line 174
    .line 175
    const/4 v1, -0x1

    .line 176
    iput v1, v0, Lf7/d0;->P:I

    .line 177
    .line 178
    new-array v1, v4, [Lf7/h;

    .line 179
    .line 180
    iput-object v1, v0, Lf7/d0;->I:[Lf7/h;

    .line 181
    .line 182
    new-array v1, v4, [Ljava/nio/ByteBuffer;

    .line 183
    .line 184
    iput-object v1, v0, Lf7/d0;->J:[Ljava/nio/ByteBuffer;

    .line 185
    .line 186
    new-instance v1, Ljava/util/ArrayDeque;

    .line 187
    .line 188
    invoke-direct {v1}, Ljava/util/ArrayDeque;-><init>()V

    .line 189
    .line 190
    .line 191
    iput-object v1, v0, Lf7/d0;->j:Ljava/util/ArrayDeque;

    .line 192
    .line 193
    new-instance v1, Lf7/d0$g;

    .line 194
    .line 195
    const-wide/16 v2, 0x64

    .line 196
    .line 197
    invoke-direct {v1, v2, v3}, Lf7/d0$g;-><init>(J)V

    .line 198
    .line 199
    .line 200
    iput-object v1, v0, Lf7/d0;->n:Lf7/d0$g;

    .line 201
    .line 202
    new-instance v1, Lf7/d0$g;

    .line 203
    .line 204
    invoke-direct {v1, v2, v3}, Lf7/d0$g;-><init>(J)V

    .line 205
    .line 206
    .line 207
    iput-object v1, v0, Lf7/d0;->o:Lf7/d0$g;

    .line 208
    .line 209
    return-void
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
.end method

.method static synthetic A(Lf7/d0;)Lf7/s$c;
    .locals 0

    iget-object p0, p0, Lf7/d0;->p:Lf7/s$c;

    return-object p0
.end method

.method static synthetic B(Lf7/d0;)Z
    .locals 0

    iget-boolean p0, p0, Lf7/d0;->S:Z

    return p0
.end method

.method static synthetic C(Lf7/d0;)J
    .locals 2

    invoke-direct {p0}, Lf7/d0;->U()J

    move-result-wide v0

    return-wide v0
.end method

.method static synthetic D(Lf7/d0;)J
    .locals 2

    invoke-direct {p0}, Lf7/d0;->V()J

    move-result-wide v0

    return-wide v0
.end method

.method static synthetic E(Lf7/d0;)J
    .locals 2

    iget-wide v0, p0, Lf7/d0;->X:J

    return-wide v0
.end method

.method private F(J)V
    .locals 11

    .line 1
    invoke-direct {p0}, Lf7/d0;->o0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lf7/d0;->b:Lf7/d0$b;

    .line 8
    .line 9
    invoke-direct {p0}, Lf7/d0;->M()Lcom/google/android/exoplayer2/PlaybackParameters;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-interface {v0, v1}, Lf7/d0$b;->a(Lcom/google/android/exoplayer2/PlaybackParameters;)Lcom/google/android/exoplayer2/PlaybackParameters;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    sget-object v0, Lcom/google/android/exoplayer2/PlaybackParameters;->d:Lcom/google/android/exoplayer2/PlaybackParameters;

    .line 19
    .line 20
    :goto_0
    move-object v2, v0

    .line 21
    invoke-direct {p0}, Lf7/d0;->o0()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    iget-object v0, p0, Lf7/d0;->b:Lf7/d0$b;

    .line 28
    .line 29
    invoke-virtual {p0}, Lf7/d0;->T()Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    invoke-interface {v0, v1}, Lf7/d0$b;->d(Z)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    const/4 v0, 0x0

    .line 39
    :goto_1
    iget-object v9, p0, Lf7/d0;->j:Ljava/util/ArrayDeque;

    .line 40
    .line 41
    new-instance v10, Lf7/d0$f;

    .line 42
    .line 43
    const-wide/16 v3, 0x0

    .line 44
    .line 45
    invoke-static {v3, v4, p1, p2}, Ljava/lang/Math;->max(JJ)J

    .line 46
    .line 47
    .line 48
    move-result-wide v4

    .line 49
    iget-object p1, p0, Lf7/d0;->r:Lf7/d0$c;

    .line 50
    .line 51
    invoke-direct {p0}, Lf7/d0;->V()J

    .line 52
    .line 53
    .line 54
    move-result-wide v6

    .line 55
    invoke-virtual {p1, v6, v7}, Lf7/d0$c;->i(J)J

    .line 56
    .line 57
    .line 58
    move-result-wide v6

    .line 59
    const/4 v8, 0x0

    .line 60
    move-object v1, v10

    .line 61
    move v3, v0

    .line 62
    invoke-direct/range {v1 .. v8}, Lf7/d0$f;-><init>(Lcom/google/android/exoplayer2/PlaybackParameters;ZJJLf7/d0$a;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v9, v10}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    invoke-direct {p0}, Lf7/d0;->n0()V

    .line 69
    .line 70
    .line 71
    iget-object p1, p0, Lf7/d0;->p:Lf7/s$c;

    .line 72
    .line 73
    if-eqz p1, :cond_2

    .line 74
    .line 75
    invoke-interface {p1, v0}, Lf7/s$c;->a(Z)V

    .line 76
    .line 77
    .line 78
    :cond_2
    return-void
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
.end method

.method private G(J)J
    .locals 4

    .line 1
    :goto_0
    iget-object v0, p0, Lf7/d0;->j:Ljava/util/ArrayDeque;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lf7/d0;->j:Ljava/util/ArrayDeque;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->getFirst()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lf7/d0$f;

    .line 16
    .line 17
    iget-wide v0, v0, Lf7/d0$f;->d:J

    .line 18
    .line 19
    cmp-long v0, p1, v0

    .line 20
    .line 21
    if-ltz v0, :cond_0

    .line 22
    .line 23
    iget-object v0, p0, Lf7/d0;->j:Ljava/util/ArrayDeque;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->remove()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Lf7/d0$f;

    .line 30
    .line 31
    iput-object v0, p0, Lf7/d0;->v:Lf7/d0$f;

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    iget-object v0, p0, Lf7/d0;->v:Lf7/d0$f;

    .line 35
    .line 36
    iget-wide v1, v0, Lf7/d0$f;->d:J

    .line 37
    .line 38
    sub-long v1, p1, v1

    .line 39
    .line 40
    iget-object v0, v0, Lf7/d0$f;->a:Lcom/google/android/exoplayer2/PlaybackParameters;

    .line 41
    .line 42
    sget-object v3, Lcom/google/android/exoplayer2/PlaybackParameters;->d:Lcom/google/android/exoplayer2/PlaybackParameters;

    .line 43
    .line 44
    invoke-virtual {v0, v3}, Lcom/google/android/exoplayer2/PlaybackParameters;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_1

    .line 49
    .line 50
    iget-object p1, p0, Lf7/d0;->v:Lf7/d0$f;

    .line 51
    .line 52
    iget-wide p1, p1, Lf7/d0$f;->c:J

    .line 53
    .line 54
    add-long/2addr p1, v1

    .line 55
    return-wide p1

    .line 56
    :cond_1
    iget-object v0, p0, Lf7/d0;->j:Ljava/util/ArrayDeque;

    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_2

    .line 63
    .line 64
    iget-object p1, p0, Lf7/d0;->b:Lf7/d0$b;

    .line 65
    .line 66
    invoke-interface {p1, v1, v2}, Lf7/d0$b;->b(J)J

    .line 67
    .line 68
    .line 69
    move-result-wide p1

    .line 70
    iget-object v0, p0, Lf7/d0;->v:Lf7/d0$f;

    .line 71
    .line 72
    iget-wide v0, v0, Lf7/d0$f;->c:J

    .line 73
    .line 74
    add-long/2addr v0, p1

    .line 75
    return-wide v0

    .line 76
    :cond_2
    iget-object v0, p0, Lf7/d0;->j:Ljava/util/ArrayDeque;

    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->getFirst()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    check-cast v0, Lf7/d0$f;

    .line 83
    .line 84
    iget-wide v1, v0, Lf7/d0$f;->d:J

    .line 85
    .line 86
    sub-long/2addr v1, p1

    .line 87
    iget-object p1, p0, Lf7/d0;->v:Lf7/d0$f;

    .line 88
    .line 89
    iget-object p1, p1, Lf7/d0$f;->a:Lcom/google/android/exoplayer2/PlaybackParameters;

    .line 90
    .line 91
    iget p1, p1, Lcom/google/android/exoplayer2/PlaybackParameters;->a:F

    .line 92
    .line 93
    invoke-static {v1, v2, p1}, Lf9/q0;->W(JF)J

    .line 94
    .line 95
    .line 96
    move-result-wide p1

    .line 97
    iget-wide v0, v0, Lf7/d0$f;->c:J

    .line 98
    .line 99
    sub-long/2addr v0, p1

    .line 100
    return-wide v0
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
.end method

.method private H(J)J
    .locals 3

    .line 1
    iget-object v0, p0, Lf7/d0;->r:Lf7/d0$c;

    .line 2
    .line 3
    iget-object v1, p0, Lf7/d0;->b:Lf7/d0$b;

    .line 4
    .line 5
    invoke-interface {v1}, Lf7/d0$b;->c()J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    invoke-virtual {v0, v1, v2}, Lf7/d0$c;->i(J)J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    add-long/2addr p1, v0

    .line 14
    return-wide p1
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
.end method

.method private I()Landroid/media/AudioTrack;
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p0, Lf7/d0;->r:Lf7/d0$c;

    .line 2
    .line 3
    invoke-static {v0}, Lf9/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lf7/d0$c;

    .line 8
    .line 9
    iget-boolean v1, p0, Lf7/d0;->W:Z

    .line 10
    .line 11
    iget-object v2, p0, Lf7/d0;->t:Lf7/e;

    .line 12
    .line 13
    iget v3, p0, Lf7/d0;->U:I

    .line 14
    .line 15
    invoke-virtual {v0, v1, v2, v3}, Lf7/d0$c;->a(ZLf7/e;I)Landroid/media/AudioTrack;

    .line 16
    .line 17
    .line 18
    move-result-object v0
    :try_end_0
    .catch Lf7/s$b; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    return-object v0

    .line 20
    :catch_0
    move-exception v0

    .line 21
    invoke-direct {p0}, Lf7/d0;->d0()V

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Lf7/d0;->p:Lf7/s$c;

    .line 25
    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    invoke-interface {v1, v0}, Lf7/s$c;->d(Ljava/lang/Exception;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    throw v0
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
.end method

.method private J()Z
    .locals 9

    .line 1
    iget v0, p0, Lf7/d0;->P:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, -0x1

    .line 6
    if-ne v0, v3, :cond_0

    .line 7
    .line 8
    iput v2, p0, Lf7/d0;->P:I

    .line 9
    .line 10
    :goto_0
    move v0, v1

    .line 11
    goto :goto_1

    .line 12
    :cond_0
    move v0, v2

    .line 13
    :goto_1
    iget v4, p0, Lf7/d0;->P:I

    .line 14
    .line 15
    iget-object v5, p0, Lf7/d0;->I:[Lf7/h;

    .line 16
    .line 17
    array-length v6, v5

    .line 18
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    if-ge v4, v6, :cond_3

    .line 24
    .line 25
    aget-object v4, v5, v4

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    invoke-interface {v4}, Lf7/h;->f()V

    .line 30
    .line 31
    .line 32
    :cond_1
    invoke-direct {p0, v7, v8}, Lf7/d0;->f0(J)V

    .line 33
    .line 34
    .line 35
    invoke-interface {v4}, Lf7/h;->c()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-nez v0, :cond_2

    .line 40
    .line 41
    return v2

    .line 42
    :cond_2
    iget v0, p0, Lf7/d0;->P:I

    .line 43
    .line 44
    add-int/2addr v0, v1

    .line 45
    iput v0, p0, Lf7/d0;->P:I

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_3
    iget-object v0, p0, Lf7/d0;->M:Ljava/nio/ByteBuffer;

    .line 49
    .line 50
    if-eqz v0, :cond_4

    .line 51
    .line 52
    invoke-direct {p0, v0, v7, v8}, Lf7/d0;->q0(Ljava/nio/ByteBuffer;J)V

    .line 53
    .line 54
    .line 55
    iget-object v0, p0, Lf7/d0;->M:Ljava/nio/ByteBuffer;

    .line 56
    .line 57
    if-eqz v0, :cond_4

    .line 58
    .line 59
    return v2

    .line 60
    :cond_4
    iput v3, p0, Lf7/d0;->P:I

    .line 61
    .line 62
    return v1
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
.end method

.method private K()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Lf7/d0;->I:[Lf7/h;

    .line 3
    .line 4
    array-length v2, v1

    .line 5
    if-ge v0, v2, :cond_0

    .line 6
    .line 7
    aget-object v1, v1, v0

    .line 8
    .line 9
    invoke-interface {v1}, Lf7/h;->flush()V

    .line 10
    .line 11
    .line 12
    iget-object v2, p0, Lf7/d0;->J:[Ljava/nio/ByteBuffer;

    .line 13
    .line 14
    invoke-interface {v1}, Lf7/h;->d()Ljava/nio/ByteBuffer;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    aput-object v1, v2, v0

    .line 19
    .line 20
    add-int/lit8 v0, v0, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
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
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
.end method

.method private static L(III)Landroid/media/AudioFormat;
    .locals 1

    .line 1
    new-instance v0, Landroid/media/AudioFormat$Builder;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/media/AudioFormat$Builder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Landroid/media/AudioFormat$Builder;->setSampleRate(I)Landroid/media/AudioFormat$Builder;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0, p1}, Landroid/media/AudioFormat$Builder;->setChannelMask(I)Landroid/media/AudioFormat$Builder;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {p0, p2}, Landroid/media/AudioFormat$Builder;->setEncoding(I)Landroid/media/AudioFormat$Builder;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {p0}, Landroid/media/AudioFormat$Builder;->build()Landroid/media/AudioFormat;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
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
.end method

.method private M()Lcom/google/android/exoplayer2/PlaybackParameters;
    .locals 1

    invoke-direct {p0}, Lf7/d0;->S()Lf7/d0$f;

    move-result-object v0

    iget-object v0, v0, Lf7/d0$f;->a:Lcom/google/android/exoplayer2/PlaybackParameters;

    return-object v0
.end method

.method private static N(I)I
    .locals 2

    .line 1
    sget v0, Lf9/q0;->a:I

    .line 2
    .line 3
    const/16 v1, 0x1c

    .line 4
    .line 5
    if-gt v0, v1, :cond_2

    .line 6
    .line 7
    const/4 v1, 0x7

    .line 8
    if-ne p0, v1, :cond_0

    .line 9
    .line 10
    const/16 p0, 0x8

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v1, 0x3

    .line 14
    if-eq p0, v1, :cond_1

    .line 15
    .line 16
    const/4 v1, 0x4

    .line 17
    if-eq p0, v1, :cond_1

    .line 18
    .line 19
    const/4 v1, 0x5

    .line 20
    if-ne p0, v1, :cond_2

    .line 21
    .line 22
    :cond_1
    const/4 p0, 0x6

    .line 23
    :cond_2
    :goto_0
    const/16 v1, 0x1a

    .line 24
    .line 25
    if-gt v0, v1, :cond_3

    .line 26
    .line 27
    const-string v0, "fugu"

    .line 28
    .line 29
    sget-object v1, Lf9/q0;->b:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_3

    .line 36
    .line 37
    const/4 v0, 0x1

    .line 38
    if-ne p0, v0, :cond_3

    .line 39
    .line 40
    const/4 p0, 0x2

    .line 41
    :cond_3
    invoke-static {p0}, Lf9/q0;->G(I)I

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    return p0
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
.end method

.method private static O(Ld7/k;Lf7/f;)Landroid/util/Pair;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld7/k;",
            "Lf7/f;",
            ")",
            "Landroid/util/Pair<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    iget-object v1, p0, Ld7/k;->v:Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {v1}, Lf9/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, Ljava/lang/String;

    .line 12
    .line 13
    iget-object v2, p0, Ld7/k;->s:Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {v1, v2}, Lf9/u;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/4 v2, 0x5

    .line 20
    const/4 v3, 0x7

    .line 21
    const/16 v4, 0x8

    .line 22
    .line 23
    const/4 v5, 0x6

    .line 24
    const/16 v6, 0x12

    .line 25
    .line 26
    if-eq v1, v2, :cond_2

    .line 27
    .line 28
    if-eq v1, v5, :cond_2

    .line 29
    .line 30
    if-eq v1, v6, :cond_2

    .line 31
    .line 32
    const/16 v2, 0x11

    .line 33
    .line 34
    if-eq v1, v2, :cond_2

    .line 35
    .line 36
    if-eq v1, v3, :cond_2

    .line 37
    .line 38
    if-eq v1, v4, :cond_2

    .line 39
    .line 40
    const/16 v2, 0xe

    .line 41
    .line 42
    if-ne v1, v2, :cond_1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    const/4 v2, 0x0

    .line 46
    goto :goto_1

    .line 47
    :cond_2
    :goto_0
    const/4 v2, 0x1

    .line 48
    :goto_1
    if-nez v2, :cond_3

    .line 49
    .line 50
    return-object v0

    .line 51
    :cond_3
    if-ne v1, v6, :cond_4

    .line 52
    .line 53
    invoke-virtual {p1, v6}, Lf7/f;->e(I)Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-nez v2, :cond_4

    .line 58
    .line 59
    move v1, v5

    .line 60
    goto :goto_2

    .line 61
    :cond_4
    if-ne v1, v4, :cond_5

    .line 62
    .line 63
    invoke-virtual {p1, v4}, Lf7/f;->e(I)Z

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    if-nez v2, :cond_5

    .line 68
    .line 69
    move v1, v3

    .line 70
    :cond_5
    :goto_2
    invoke-virtual {p1, v1}, Lf7/f;->e(I)Z

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    if-nez v2, :cond_6

    .line 75
    .line 76
    return-object v0

    .line 77
    :cond_6
    if-ne v1, v6, :cond_7

    .line 78
    .line 79
    sget p1, Lf9/q0;->a:I

    .line 80
    .line 81
    const/16 v2, 0x1d

    .line 82
    .line 83
    if-lt p1, v2, :cond_8

    .line 84
    .line 85
    iget p0, p0, Ld7/k;->J:I

    .line 86
    .line 87
    invoke-static {v6, p0}, Lf7/d0;->Q(II)I

    .line 88
    .line 89
    .line 90
    move-result v5

    .line 91
    if-nez v5, :cond_8

    .line 92
    .line 93
    const-string p0, "DefaultAudioSink"

    .line 94
    .line 95
    const-string p1, "E-AC3 JOC encoding supported but no channel count supported"

    .line 96
    .line 97
    invoke-static {p0, p1}, Lf9/r;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    return-object v0

    .line 101
    :cond_7
    iget v5, p0, Ld7/k;->I:I

    .line 102
    .line 103
    invoke-virtual {p1}, Lf7/f;->d()I

    .line 104
    .line 105
    .line 106
    move-result p0

    .line 107
    if-le v5, p0, :cond_8

    .line 108
    .line 109
    return-object v0

    .line 110
    :cond_8
    invoke-static {v5}, Lf7/d0;->N(I)I

    .line 111
    .line 112
    .line 113
    move-result p0

    .line 114
    if-nez p0, :cond_9

    .line 115
    .line 116
    return-object v0

    .line 117
    :cond_9
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    invoke-static {p1, p0}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    return-object p0
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
.end method

.method private static P(ILjava/nio/ByteBuffer;)I
    .locals 2

    .line 1
    const/16 v0, 0x400

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    packed-switch p0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    :pswitch_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 8
    .line 9
    new-instance v0, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v1, "Unexpected audio encoding: "

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw p1

    .line 30
    :pswitch_1
    invoke-static {p1}, Lf7/c;->c(Ljava/nio/ByteBuffer;)I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    return p0

    .line 35
    :pswitch_2
    return v0

    .line 36
    :pswitch_3
    const/16 p0, 0x200

    .line 37
    .line 38
    return p0

    .line 39
    :pswitch_4
    invoke-static {p1}, Lf7/b;->a(Ljava/nio/ByteBuffer;)I

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    if-ne p0, v1, :cond_0

    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    invoke-static {p1, p0}, Lf7/b;->h(Ljava/nio/ByteBuffer;I)I

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    mul-int/lit8 p0, p0, 0x10

    .line 52
    .line 53
    :goto_0
    return p0

    .line 54
    :pswitch_5
    const/16 p0, 0x800

    .line 55
    .line 56
    return p0

    .line 57
    :pswitch_6
    return v0

    .line 58
    :pswitch_7
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    invoke-static {p1, p0}, Lf9/q0;->H(Ljava/nio/ByteBuffer;I)I

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    invoke-static {p0}, Lf7/l0;->m(I)I

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    if-eq p0, v1, :cond_1

    .line 71
    .line 72
    return p0

    .line 73
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 74
    .line 75
    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 76
    .line 77
    .line 78
    throw p0

    .line 79
    :pswitch_8
    invoke-static {p1}, Lf7/i0;->e(Ljava/nio/ByteBuffer;)I

    .line 80
    .line 81
    .line 82
    move-result p0

    .line 83
    return p0

    .line 84
    :pswitch_9
    invoke-static {p1}, Lf7/b;->d(Ljava/nio/ByteBuffer;)I

    .line 85
    .line 86
    .line 87
    move-result p0

    .line 88
    return p0

    .line 89
    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_9
        :pswitch_9
        :pswitch_8
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_5
        :pswitch_0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_9
    .end packed-switch
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
.end method

.method private static Q(II)I
    .locals 4

    .line 1
    new-instance v0, Landroid/media/AudioAttributes$Builder;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/media/AudioAttributes$Builder;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-virtual {v0, v1}, Landroid/media/AudioAttributes$Builder;->setUsage(I)Landroid/media/AudioAttributes$Builder;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x3

    .line 12
    invoke-virtual {v0, v1}, Landroid/media/AudioAttributes$Builder;->setContentType(I)Landroid/media/AudioAttributes$Builder;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Landroid/media/AudioAttributes$Builder;->build()Landroid/media/AudioAttributes;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const/16 v1, 0x8

    .line 21
    .line 22
    :goto_0
    if-lez v1, :cond_1

    .line 23
    .line 24
    new-instance v2, Landroid/media/AudioFormat$Builder;

    .line 25
    .line 26
    invoke-direct {v2}, Landroid/media/AudioFormat$Builder;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2, p0}, Landroid/media/AudioFormat$Builder;->setEncoding(I)Landroid/media/AudioFormat$Builder;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {v2, p1}, Landroid/media/AudioFormat$Builder;->setSampleRate(I)Landroid/media/AudioFormat$Builder;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-static {v1}, Lf9/q0;->G(I)I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    invoke-virtual {v2, v3}, Landroid/media/AudioFormat$Builder;->setChannelMask(I)Landroid/media/AudioFormat$Builder;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-virtual {v2}, Landroid/media/AudioFormat$Builder;->build()Landroid/media/AudioFormat;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-static {v2, v0}, Lf7/y;->a(Landroid/media/AudioFormat;Landroid/media/AudioAttributes;)Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-eqz v2, :cond_0

    .line 54
    .line 55
    return v1

    .line 56
    :cond_0
    add-int/lit8 v1, v1, -0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    const/4 p0, 0x0

    .line 60
    return p0
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
.end method

.method private static R(I)I
    .locals 0

    packed-switch p0, :pswitch_data_0

    :pswitch_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0

    :pswitch_1
    const p0, 0x52080

    return p0

    :pswitch_2
    const p0, 0x3e800

    return p0

    :pswitch_3
    const/16 p0, 0x1f40

    return p0

    :pswitch_4
    const p0, 0x2ebae4

    return p0

    :pswitch_5
    const/16 p0, 0x1b58

    return p0

    :pswitch_6
    const/16 p0, 0x3e80

    return p0

    :pswitch_7
    const p0, 0x186a0

    return p0

    :pswitch_8
    const p0, 0x9c40

    return p0

    :pswitch_9
    const p0, 0x225510

    return p0

    :pswitch_a
    const p0, 0x2ee00

    return p0

    :pswitch_b
    const p0, 0xbb800

    return p0

    :pswitch_c
    const p0, 0x13880

    return p0

    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_b
    .end packed-switch
.end method

.method private S()Lf7/d0$f;
    .locals 1

    .line 1
    iget-object v0, p0, Lf7/d0;->u:Lf7/d0$f;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, Lf7/d0;->j:Ljava/util/ArrayDeque;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    iget-object v0, p0, Lf7/d0;->j:Ljava/util/ArrayDeque;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->getLast()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Lf7/d0$f;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    iget-object v0, p0, Lf7/d0;->v:Lf7/d0$f;

    .line 24
    .line 25
    :goto_0
    return-object v0
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
.end method

.method private U()J
    .locals 5

    .line 1
    iget-object v0, p0, Lf7/d0;->r:Lf7/d0$c;

    .line 2
    .line 3
    iget v1, v0, Lf7/d0$c;->c:I

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    iget-wide v1, p0, Lf7/d0;->z:J

    .line 8
    .line 9
    iget v0, v0, Lf7/d0$c;->b:I

    .line 10
    .line 11
    int-to-long v3, v0

    .line 12
    div-long/2addr v1, v3

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-wide v1, p0, Lf7/d0;->A:J

    .line 15
    .line 16
    :goto_0
    return-wide v1
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
.end method

.method private V()J
    .locals 5

    .line 1
    iget-object v0, p0, Lf7/d0;->r:Lf7/d0$c;

    .line 2
    .line 3
    iget v1, v0, Lf7/d0$c;->c:I

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    iget-wide v1, p0, Lf7/d0;->B:J

    .line 8
    .line 9
    iget v0, v0, Lf7/d0$c;->d:I

    .line 10
    .line 11
    int-to-long v3, v0

    .line 12
    div-long/2addr v1, v3

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-wide v1, p0, Lf7/d0;->C:J

    .line 15
    .line 16
    :goto_0
    return-wide v1
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
.end method

.method private W()V
    .locals 8

    .line 1
    iget-object v0, p0, Lf7/d0;->h:Landroid/os/ConditionVariable;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/os/ConditionVariable;->block()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lf7/d0;->I()Landroid/media/AudioTrack;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, Lf7/d0;->s:Landroid/media/AudioTrack;

    .line 11
    .line 12
    invoke-static {v0}, Lf7/d0;->a0(Landroid/media/AudioTrack;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    iget-object v0, p0, Lf7/d0;->s:Landroid/media/AudioTrack;

    .line 19
    .line 20
    invoke-direct {p0, v0}, Lf7/d0;->g0(Landroid/media/AudioTrack;)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lf7/d0;->s:Landroid/media/AudioTrack;

    .line 24
    .line 25
    iget-object v1, p0, Lf7/d0;->r:Lf7/d0$c;

    .line 26
    .line 27
    iget-object v1, v1, Lf7/d0$c;->a:Ld7/k;

    .line 28
    .line 29
    iget v2, v1, Ld7/k;->L:I

    .line 30
    .line 31
    iget v1, v1, Ld7/k;->M:I

    .line 32
    .line 33
    invoke-static {v0, v2, v1}, Lf7/c0;->a(Landroid/media/AudioTrack;II)V

    .line 34
    .line 35
    .line 36
    :cond_0
    iget-object v0, p0, Lf7/d0;->s:Landroid/media/AudioTrack;

    .line 37
    .line 38
    invoke-virtual {v0}, Landroid/media/AudioTrack;->getAudioSessionId()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    iput v0, p0, Lf7/d0;->U:I

    .line 43
    .line 44
    iget-object v1, p0, Lf7/d0;->i:Lf7/u;

    .line 45
    .line 46
    iget-object v2, p0, Lf7/d0;->s:Landroid/media/AudioTrack;

    .line 47
    .line 48
    iget-object v0, p0, Lf7/d0;->r:Lf7/d0$c;

    .line 49
    .line 50
    iget v3, v0, Lf7/d0$c;->c:I

    .line 51
    .line 52
    const/4 v4, 0x2

    .line 53
    const/4 v7, 0x1

    .line 54
    if-ne v3, v4, :cond_1

    .line 55
    .line 56
    move v3, v7

    .line 57
    goto :goto_0

    .line 58
    :cond_1
    const/4 v3, 0x0

    .line 59
    :goto_0
    iget v4, v0, Lf7/d0$c;->g:I

    .line 60
    .line 61
    iget v5, v0, Lf7/d0$c;->d:I

    .line 62
    .line 63
    iget v6, v0, Lf7/d0$c;->h:I

    .line 64
    .line 65
    invoke-virtual/range {v1 .. v6}, Lf7/u;->t(Landroid/media/AudioTrack;ZIII)V

    .line 66
    .line 67
    .line 68
    invoke-direct {p0}, Lf7/d0;->k0()V

    .line 69
    .line 70
    .line 71
    iget-object v0, p0, Lf7/d0;->V:Lf7/v;

    .line 72
    .line 73
    iget v0, v0, Lf7/v;->a:I

    .line 74
    .line 75
    if-eqz v0, :cond_2

    .line 76
    .line 77
    iget-object v1, p0, Lf7/d0;->s:Landroid/media/AudioTrack;

    .line 78
    .line 79
    invoke-virtual {v1, v0}, Landroid/media/AudioTrack;->attachAuxEffect(I)I

    .line 80
    .line 81
    .line 82
    iget-object v0, p0, Lf7/d0;->s:Landroid/media/AudioTrack;

    .line 83
    .line 84
    iget-object v1, p0, Lf7/d0;->V:Lf7/v;

    .line 85
    .line 86
    iget v1, v1, Lf7/v;->b:F

    .line 87
    .line 88
    invoke-virtual {v0, v1}, Landroid/media/AudioTrack;->setAuxEffectSendLevel(F)I

    .line 89
    .line 90
    .line 91
    :cond_2
    iput-boolean v7, p0, Lf7/d0;->F:Z

    .line 92
    .line 93
    return-void
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
.end method

.method private static X(I)Z
    .locals 2

    sget v0, Lf9/q0;->a:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_0

    const/4 v0, -0x6

    if-eq p0, v0, :cond_1

    :cond_0
    const/16 v0, -0x20

    if-ne p0, v0, :cond_2

    :cond_1
    const/4 p0, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private Y()Z
    .locals 1

    iget-object v0, p0, Lf7/d0;->s:Landroid/media/AudioTrack;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private static Z()Z
    .locals 2

    sget v0, Lf9/q0;->a:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    sget-object v0, Lf9/q0;->d:Ljava/lang/String;

    const-string v1, "Pixel"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private static a0(Landroid/media/AudioTrack;)Z
    .locals 2

    sget v0, Lf9/q0;->a:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    invoke-static {p0}, Lf7/a0;->a(Landroid/media/AudioTrack;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static b0(Ld7/k;Lf7/e;)Z
    .locals 4

    .line 1
    sget v0, Lf9/q0;->a:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-ge v0, v1, :cond_0

    .line 7
    .line 8
    return v2

    .line 9
    :cond_0
    iget-object v0, p0, Ld7/k;->v:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v0}, Lf9/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Ljava/lang/String;

    .line 16
    .line 17
    iget-object v1, p0, Ld7/k;->s:Ljava/lang/String;

    .line 18
    .line 19
    invoke-static {v0, v1}, Lf9/u;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    return v2

    .line 26
    :cond_1
    iget v1, p0, Ld7/k;->I:I

    .line 27
    .line 28
    invoke-static {v1}, Lf9/q0;->G(I)I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_2

    .line 33
    .line 34
    return v2

    .line 35
    :cond_2
    iget v3, p0, Ld7/k;->J:I

    .line 36
    .line 37
    invoke-static {v3, v1, v0}, Lf7/d0;->L(III)Landroid/media/AudioFormat;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {p1}, Lf7/e;->a()Landroid/media/AudioAttributes;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-static {v0, p1}, Lf7/z;->a(Landroid/media/AudioFormat;Landroid/media/AudioAttributes;)Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-nez p1, :cond_3

    .line 50
    .line 51
    return v2

    .line 52
    :cond_3
    iget p1, p0, Ld7/k;->L:I

    .line 53
    .line 54
    const/4 v0, 0x1

    .line 55
    if-nez p1, :cond_4

    .line 56
    .line 57
    iget p0, p0, Ld7/k;->M:I

    .line 58
    .line 59
    if-nez p0, :cond_4

    .line 60
    .line 61
    move p0, v0

    .line 62
    goto :goto_0

    .line 63
    :cond_4
    move p0, v2

    .line 64
    :goto_0
    if-nez p0, :cond_5

    .line 65
    .line 66
    invoke-static {}, Lf7/d0;->Z()Z

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    if-eqz p0, :cond_6

    .line 71
    .line 72
    :cond_5
    move v2, v0

    .line 73
    :cond_6
    return v2
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
.end method

.method private static c0(Ld7/k;Lf7/f;)Z
    .locals 0

    invoke-static {p0, p1}, Lf7/d0;->O(Ld7/k;Lf7/f;)Landroid/util/Pair;

    move-result-object p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method static synthetic d(III)Landroid/media/AudioFormat;
    .locals 0

    invoke-static {p0, p1, p2}, Lf7/d0;->L(III)Landroid/media/AudioFormat;

    move-result-object p0

    return-object p0
.end method

.method private d0()V
    .locals 1

    .line 1
    iget-object v0, p0, Lf7/d0;->r:Lf7/d0$c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lf7/d0$c;->o()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p0, Lf7/d0;->Y:Z

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
.end method

.method private e0()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lf7/d0;->R:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lf7/d0;->R:Z

    .line 7
    .line 8
    iget-object v0, p0, Lf7/d0;->i:Lf7/u;

    .line 9
    .line 10
    invoke-direct {p0}, Lf7/d0;->V()J

    .line 11
    .line 12
    .line 13
    move-result-wide v1

    .line 14
    invoke-virtual {v0, v1, v2}, Lf7/u;->h(J)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lf7/d0;->s:Landroid/media/AudioTrack;

    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/media/AudioTrack;->stop()V

    .line 20
    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    iput v0, p0, Lf7/d0;->y:I

    .line 24
    .line 25
    :cond_0
    return-void
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
.end method

.method private f0(J)V
    .locals 5

    .line 1
    iget-object v0, p0, Lf7/d0;->I:[Lf7/h;

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    move v1, v0

    .line 5
    :goto_0
    if-ltz v1, :cond_6

    .line 6
    .line 7
    if-lez v1, :cond_0

    .line 8
    .line 9
    iget-object v2, p0, Lf7/d0;->J:[Ljava/nio/ByteBuffer;

    .line 10
    .line 11
    add-int/lit8 v3, v1, -0x1

    .line 12
    .line 13
    aget-object v2, v2, v3

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    iget-object v2, p0, Lf7/d0;->K:Ljava/nio/ByteBuffer;

    .line 17
    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    sget-object v2, Lf7/h;->a:Ljava/nio/ByteBuffer;

    .line 22
    .line 23
    :goto_1
    if-ne v1, v0, :cond_2

    .line 24
    .line 25
    invoke-direct {p0, v2, p1, p2}, Lf7/d0;->q0(Ljava/nio/ByteBuffer;J)V

    .line 26
    .line 27
    .line 28
    goto :goto_2

    .line 29
    :cond_2
    iget-object v3, p0, Lf7/d0;->I:[Lf7/h;

    .line 30
    .line 31
    aget-object v3, v3, v1

    .line 32
    .line 33
    iget v4, p0, Lf7/d0;->P:I

    .line 34
    .line 35
    if-le v1, v4, :cond_3

    .line 36
    .line 37
    invoke-interface {v3, v2}, Lf7/h;->e(Ljava/nio/ByteBuffer;)V

    .line 38
    .line 39
    .line 40
    :cond_3
    invoke-interface {v3}, Lf7/h;->d()Ljava/nio/ByteBuffer;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    iget-object v4, p0, Lf7/d0;->J:[Ljava/nio/ByteBuffer;

    .line 45
    .line 46
    aput-object v3, v4, v1

    .line 47
    .line 48
    invoke-virtual {v3}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    if-eqz v3, :cond_4

    .line 53
    .line 54
    add-int/lit8 v1, v1, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_4
    :goto_2
    invoke-virtual {v2}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    if-eqz v2, :cond_5

    .line 62
    .line 63
    return-void

    .line 64
    :cond_5
    add-int/lit8 v1, v1, -0x1

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_6
    return-void
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
.end method

.method private g0(Landroid/media/AudioTrack;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lf7/d0;->m:Lf7/d0$i;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lf7/d0$i;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Lf7/d0$i;-><init>(Lf7/d0;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lf7/d0;->m:Lf7/d0$i;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lf7/d0;->m:Lf7/d0$i;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lf7/d0$i;->a(Landroid/media/AudioTrack;)V

    .line 15
    .line 16
    .line 17
    return-void
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
.end method

.method private h0()V
    .locals 12

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    iput-wide v0, p0, Lf7/d0;->z:J

    .line 4
    .line 5
    iput-wide v0, p0, Lf7/d0;->A:J

    .line 6
    .line 7
    iput-wide v0, p0, Lf7/d0;->B:J

    .line 8
    .line 9
    iput-wide v0, p0, Lf7/d0;->C:J

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    iput-boolean v2, p0, Lf7/d0;->Z:Z

    .line 13
    .line 14
    iput v2, p0, Lf7/d0;->D:I

    .line 15
    .line 16
    new-instance v11, Lf7/d0$f;

    .line 17
    .line 18
    invoke-direct {p0}, Lf7/d0;->M()Lcom/google/android/exoplayer2/PlaybackParameters;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    invoke-virtual {p0}, Lf7/d0;->T()Z

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    const-wide/16 v6, 0x0

    .line 27
    .line 28
    const-wide/16 v8, 0x0

    .line 29
    .line 30
    const/4 v10, 0x0

    .line 31
    move-object v3, v11

    .line 32
    invoke-direct/range {v3 .. v10}, Lf7/d0$f;-><init>(Lcom/google/android/exoplayer2/PlaybackParameters;ZJJLf7/d0$a;)V

    .line 33
    .line 34
    .line 35
    iput-object v11, p0, Lf7/d0;->v:Lf7/d0$f;

    .line 36
    .line 37
    iput-wide v0, p0, Lf7/d0;->G:J

    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    iput-object v0, p0, Lf7/d0;->u:Lf7/d0$f;

    .line 41
    .line 42
    iget-object v1, p0, Lf7/d0;->j:Ljava/util/ArrayDeque;

    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->clear()V

    .line 45
    .line 46
    .line 47
    iput-object v0, p0, Lf7/d0;->K:Ljava/nio/ByteBuffer;

    .line 48
    .line 49
    iput v2, p0, Lf7/d0;->L:I

    .line 50
    .line 51
    iput-object v0, p0, Lf7/d0;->M:Ljava/nio/ByteBuffer;

    .line 52
    .line 53
    iput-boolean v2, p0, Lf7/d0;->R:Z

    .line 54
    .line 55
    iput-boolean v2, p0, Lf7/d0;->Q:Z

    .line 56
    .line 57
    const/4 v1, -0x1

    .line 58
    iput v1, p0, Lf7/d0;->P:I

    .line 59
    .line 60
    iput-object v0, p0, Lf7/d0;->x:Ljava/nio/ByteBuffer;

    .line 61
    .line 62
    iput v2, p0, Lf7/d0;->y:I

    .line 63
    .line 64
    iget-object v0, p0, Lf7/d0;->e:Lf7/r0;

    .line 65
    .line 66
    invoke-virtual {v0}, Lf7/r0;->n()V

    .line 67
    .line 68
    .line 69
    invoke-direct {p0}, Lf7/d0;->K()V

    .line 70
    .line 71
    .line 72
    return-void
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
.end method

.method private i0(Lcom/google/android/exoplayer2/PlaybackParameters;Z)V
    .locals 9

    .line 1
    invoke-direct {p0}, Lf7/d0;->S()Lf7/d0$f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, v0, Lf7/d0$f;->a:Lcom/google/android/exoplayer2/PlaybackParameters;

    .line 6
    .line 7
    invoke-virtual {p1, v1}, Lcom/google/android/exoplayer2/PlaybackParameters;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    iget-boolean v0, v0, Lf7/d0$f;->b:Z

    .line 14
    .line 15
    if-eq p2, v0, :cond_2

    .line 16
    .line 17
    :cond_0
    new-instance v0, Lf7/d0$f;

    .line 18
    .line 19
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    const/4 v8, 0x0

    .line 30
    move-object v1, v0

    .line 31
    move-object v2, p1

    .line 32
    move v3, p2

    .line 33
    invoke-direct/range {v1 .. v8}, Lf7/d0$f;-><init>(Lcom/google/android/exoplayer2/PlaybackParameters;ZJJLf7/d0$a;)V

    .line 34
    .line 35
    .line 36
    invoke-direct {p0}, Lf7/d0;->Y()Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-eqz p1, :cond_1

    .line 41
    .line 42
    iput-object v0, p0, Lf7/d0;->u:Lf7/d0$f;

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    iput-object v0, p0, Lf7/d0;->v:Lf7/d0$f;

    .line 46
    .line 47
    :cond_2
    :goto_0
    return-void
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
.end method

.method private j0(Lcom/google/android/exoplayer2/PlaybackParameters;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lf7/d0;->Y()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Landroid/media/PlaybackParams;

    .line 8
    .line 9
    invoke-direct {v0}, Landroid/media/PlaybackParams;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/media/PlaybackParams;->allowDefaults()Landroid/media/PlaybackParams;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget v1, p1, Lcom/google/android/exoplayer2/PlaybackParameters;->a:F

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/media/PlaybackParams;->setSpeed(F)Landroid/media/PlaybackParams;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget p1, p1, Lcom/google/android/exoplayer2/PlaybackParameters;->b:F

    .line 23
    .line 24
    invoke-virtual {v0, p1}, Landroid/media/PlaybackParams;->setPitch(F)Landroid/media/PlaybackParams;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const/4 v0, 0x2

    .line 29
    invoke-virtual {p1, v0}, Landroid/media/PlaybackParams;->setAudioFallbackMode(I)Landroid/media/PlaybackParams;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    :try_start_0
    iget-object v0, p0, Lf7/d0;->s:Landroid/media/AudioTrack;

    .line 34
    .line 35
    invoke-virtual {v0, p1}, Landroid/media/AudioTrack;->setPlaybackParams(Landroid/media/PlaybackParams;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :catch_0
    move-exception p1

    .line 40
    const-string v0, "DefaultAudioSink"

    .line 41
    .line 42
    const-string v1, "Failed to set playback params"

    .line 43
    .line 44
    invoke-static {v0, v1, p1}, Lf9/r;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 45
    .line 46
    .line 47
    :goto_0
    new-instance p1, Lcom/google/android/exoplayer2/PlaybackParameters;

    .line 48
    .line 49
    iget-object v0, p0, Lf7/d0;->s:Landroid/media/AudioTrack;

    .line 50
    .line 51
    invoke-virtual {v0}, Landroid/media/AudioTrack;->getPlaybackParams()Landroid/media/PlaybackParams;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v0}, Landroid/media/PlaybackParams;->getSpeed()F

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    iget-object v1, p0, Lf7/d0;->s:Landroid/media/AudioTrack;

    .line 60
    .line 61
    invoke-virtual {v1}, Landroid/media/AudioTrack;->getPlaybackParams()Landroid/media/PlaybackParams;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-virtual {v1}, Landroid/media/PlaybackParams;->getPitch()F

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    invoke-direct {p1, v0, v1}, Lcom/google/android/exoplayer2/PlaybackParameters;-><init>(FF)V

    .line 70
    .line 71
    .line 72
    iget-object v0, p0, Lf7/d0;->i:Lf7/u;

    .line 73
    .line 74
    iget v1, p1, Lcom/google/android/exoplayer2/PlaybackParameters;->a:F

    .line 75
    .line 76
    invoke-virtual {v0, v1}, Lf7/u;->u(F)V

    .line 77
    .line 78
    .line 79
    :cond_0
    iput-object p1, p0, Lf7/d0;->w:Lcom/google/android/exoplayer2/PlaybackParameters;

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
.end method

.method private k0()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lf7/d0;->Y()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    sget v0, Lf9/q0;->a:I

    .line 9
    .line 10
    const/16 v1, 0x15

    .line 11
    .line 12
    if-lt v0, v1, :cond_1

    .line 13
    .line 14
    iget-object v0, p0, Lf7/d0;->s:Landroid/media/AudioTrack;

    .line 15
    .line 16
    iget v1, p0, Lf7/d0;->H:F

    .line 17
    .line 18
    invoke-static {v0, v1}, Lf7/d0;->l0(Landroid/media/AudioTrack;F)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    iget-object v0, p0, Lf7/d0;->s:Landroid/media/AudioTrack;

    .line 23
    .line 24
    iget v1, p0, Lf7/d0;->H:F

    .line 25
    .line 26
    invoke-static {v0, v1}, Lf7/d0;->m0(Landroid/media/AudioTrack;F)V

    .line 27
    .line 28
    .line 29
    :goto_0
    return-void
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
.end method

.method private static l0(Landroid/media/AudioTrack;F)V
    .locals 0

    invoke-virtual {p0, p1}, Landroid/media/AudioTrack;->setVolume(F)I

    return-void
.end method

.method private static m0(Landroid/media/AudioTrack;F)V
    .locals 0

    invoke-virtual {p0, p1, p1}, Landroid/media/AudioTrack;->setStereoVolume(FF)I

    return-void
.end method

.method private n0()V
    .locals 6

    .line 1
    iget-object v0, p0, Lf7/d0;->r:Lf7/d0$c;

    .line 2
    .line 3
    iget-object v0, v0, Lf7/d0$c;->i:[Lf7/h;

    .line 4
    .line 5
    new-instance v1, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    array-length v2, v0

    .line 11
    const/4 v3, 0x0

    .line 12
    :goto_0
    if-ge v3, v2, :cond_1

    .line 13
    .line 14
    aget-object v4, v0, v3

    .line 15
    .line 16
    invoke-interface {v4}, Lf7/h;->b()Z

    .line 17
    .line 18
    .line 19
    move-result v5

    .line 20
    if-eqz v5, :cond_0

    .line 21
    .line 22
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_0
    invoke-interface {v4}, Lf7/h;->flush()V

    .line 27
    .line 28
    .line 29
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    new-array v2, v0, [Lf7/h;

    .line 37
    .line 38
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    check-cast v1, [Lf7/h;

    .line 43
    .line 44
    iput-object v1, p0, Lf7/d0;->I:[Lf7/h;

    .line 45
    .line 46
    new-array v0, v0, [Ljava/nio/ByteBuffer;

    .line 47
    .line 48
    iput-object v0, p0, Lf7/d0;->J:[Ljava/nio/ByteBuffer;

    .line 49
    .line 50
    invoke-direct {p0}, Lf7/d0;->K()V

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
    .line 130
    .line 131
    .line 132
    .line 133
.end method

.method private o0()Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Lf7/d0;->W:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lf7/d0;->r:Lf7/d0$c;

    .line 6
    .line 7
    iget-object v0, v0, Lf7/d0$c;->a:Ld7/k;

    .line 8
    .line 9
    iget-object v0, v0, Ld7/k;->v:Ljava/lang/String;

    .line 10
    .line 11
    const-string v1, "audio/raw"

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Lf7/d0;->r:Lf7/d0$c;

    .line 20
    .line 21
    iget-object v0, v0, Lf7/d0$c;->a:Ld7/k;

    .line 22
    .line 23
    iget v0, v0, Ld7/k;->K:I

    .line 24
    .line 25
    invoke-direct {p0, v0}, Lf7/d0;->p0(I)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_0

    .line 30
    .line 31
    const/4 v0, 0x1

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 v0, 0x0

    .line 34
    :goto_0
    return v0
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
.end method

.method private p0(I)Z
    .locals 1

    iget-boolean v0, p0, Lf7/d0;->c:Z

    if-eqz v0, :cond_0

    invoke-static {p1}, Lf9/q0;->o0(I)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private q0(Ljava/nio/ByteBuffer;J)V
    .locals 12

    .line 1
    invoke-virtual {p1}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v0, p0, Lf7/d0;->M:Ljava/nio/ByteBuffer;

    .line 9
    .line 10
    const/16 v1, 0x15

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    const/4 v3, 0x0

    .line 14
    if-eqz v0, :cond_2

    .line 15
    .line 16
    if-ne v0, p1, :cond_1

    .line 17
    .line 18
    move v0, v2

    .line 19
    goto :goto_0

    .line 20
    :cond_1
    move v0, v3

    .line 21
    :goto_0
    invoke-static {v0}, Lf9/a;->a(Z)V

    .line 22
    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_2
    iput-object p1, p0, Lf7/d0;->M:Ljava/nio/ByteBuffer;

    .line 26
    .line 27
    sget v0, Lf9/q0;->a:I

    .line 28
    .line 29
    if-ge v0, v1, :cond_5

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    iget-object v4, p0, Lf7/d0;->N:[B

    .line 36
    .line 37
    if-eqz v4, :cond_3

    .line 38
    .line 39
    array-length v4, v4

    .line 40
    if-ge v4, v0, :cond_4

    .line 41
    .line 42
    :cond_3
    new-array v4, v0, [B

    .line 43
    .line 44
    iput-object v4, p0, Lf7/d0;->N:[B

    .line 45
    .line 46
    :cond_4
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    iget-object v5, p0, Lf7/d0;->N:[B

    .line 51
    .line 52
    invoke-virtual {p1, v5, v3, v0}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, v4}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 56
    .line 57
    .line 58
    iput v3, p0, Lf7/d0;->O:I

    .line 59
    .line 60
    :cond_5
    :goto_1
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    sget v4, Lf9/q0;->a:I

    .line 65
    .line 66
    if-ge v4, v1, :cond_7

    .line 67
    .line 68
    iget-object p2, p0, Lf7/d0;->i:Lf7/u;

    .line 69
    .line 70
    iget-wide v4, p0, Lf7/d0;->B:J

    .line 71
    .line 72
    invoke-virtual {p2, v4, v5}, Lf7/u;->c(J)I

    .line 73
    .line 74
    .line 75
    move-result p2

    .line 76
    if-lez p2, :cond_6

    .line 77
    .line 78
    invoke-static {v0, p2}, Ljava/lang/Math;->min(II)I

    .line 79
    .line 80
    .line 81
    move-result p2

    .line 82
    iget-object p3, p0, Lf7/d0;->s:Landroid/media/AudioTrack;

    .line 83
    .line 84
    iget-object v1, p0, Lf7/d0;->N:[B

    .line 85
    .line 86
    iget v4, p0, Lf7/d0;->O:I

    .line 87
    .line 88
    invoke-virtual {p3, v1, v4, p2}, Landroid/media/AudioTrack;->write([BII)I

    .line 89
    .line 90
    .line 91
    move-result p2

    .line 92
    if-lez p2, :cond_a

    .line 93
    .line 94
    iget p3, p0, Lf7/d0;->O:I

    .line 95
    .line 96
    add-int/2addr p3, p2

    .line 97
    iput p3, p0, Lf7/d0;->O:I

    .line 98
    .line 99
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 100
    .line 101
    .line 102
    move-result p3

    .line 103
    add-int/2addr p3, p2

    .line 104
    invoke-virtual {p1, p3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 105
    .line 106
    .line 107
    goto :goto_3

    .line 108
    :cond_6
    move p2, v3

    .line 109
    goto :goto_3

    .line 110
    :cond_7
    iget-boolean v1, p0, Lf7/d0;->W:Z

    .line 111
    .line 112
    if-eqz v1, :cond_9

    .line 113
    .line 114
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    cmp-long v1, p2, v4

    .line 120
    .line 121
    if-eqz v1, :cond_8

    .line 122
    .line 123
    move v1, v2

    .line 124
    goto :goto_2

    .line 125
    :cond_8
    move v1, v3

    .line 126
    :goto_2
    invoke-static {v1}, Lf9/a;->f(Z)V

    .line 127
    .line 128
    .line 129
    iget-object v7, p0, Lf7/d0;->s:Landroid/media/AudioTrack;

    .line 130
    .line 131
    move-object v6, p0

    .line 132
    move-object v8, p1

    .line 133
    move v9, v0

    .line 134
    move-wide v10, p2

    .line 135
    invoke-direct/range {v6 .. v11}, Lf7/d0;->s0(Landroid/media/AudioTrack;Ljava/nio/ByteBuffer;IJ)I

    .line 136
    .line 137
    .line 138
    move-result p2

    .line 139
    goto :goto_3

    .line 140
    :cond_9
    iget-object p2, p0, Lf7/d0;->s:Landroid/media/AudioTrack;

    .line 141
    .line 142
    invoke-static {p2, p1, v0}, Lf7/d0;->r0(Landroid/media/AudioTrack;Ljava/nio/ByteBuffer;I)I

    .line 143
    .line 144
    .line 145
    move-result p2

    .line 146
    :cond_a
    :goto_3
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 147
    .line 148
    .line 149
    move-result-wide v4

    .line 150
    iput-wide v4, p0, Lf7/d0;->X:J

    .line 151
    .line 152
    if-gez p2, :cond_e

    .line 153
    .line 154
    invoke-static {p2}, Lf7/d0;->X(I)Z

    .line 155
    .line 156
    .line 157
    move-result p1

    .line 158
    if-eqz p1, :cond_b

    .line 159
    .line 160
    invoke-direct {p0}, Lf7/d0;->d0()V

    .line 161
    .line 162
    .line 163
    :cond_b
    new-instance p3, Lf7/s$d;

    .line 164
    .line 165
    iget-object v0, p0, Lf7/d0;->r:Lf7/d0$c;

    .line 166
    .line 167
    iget-object v0, v0, Lf7/d0$c;->a:Ld7/k;

    .line 168
    .line 169
    invoke-direct {p3, p2, v0, p1}, Lf7/s$d;-><init>(ILd7/k;Z)V

    .line 170
    .line 171
    .line 172
    iget-object p1, p0, Lf7/d0;->p:Lf7/s$c;

    .line 173
    .line 174
    if-eqz p1, :cond_c

    .line 175
    .line 176
    invoke-interface {p1, p3}, Lf7/s$c;->d(Ljava/lang/Exception;)V

    .line 177
    .line 178
    .line 179
    :cond_c
    iget-boolean p1, p3, Lf7/s$d;->l:Z

    .line 180
    .line 181
    if-nez p1, :cond_d

    .line 182
    .line 183
    iget-object p1, p0, Lf7/d0;->o:Lf7/d0$g;

    .line 184
    .line 185
    invoke-virtual {p1, p3}, Lf7/d0$g;->b(Ljava/lang/Exception;)V

    .line 186
    .line 187
    .line 188
    return-void

    .line 189
    :cond_d
    throw p3

    .line 190
    :cond_e
    iget-object p3, p0, Lf7/d0;->o:Lf7/d0$g;

    .line 191
    .line 192
    invoke-virtual {p3}, Lf7/d0$g;->a()V

    .line 193
    .line 194
    .line 195
    iget-object p3, p0, Lf7/d0;->s:Landroid/media/AudioTrack;

    .line 196
    .line 197
    invoke-static {p3}, Lf7/d0;->a0(Landroid/media/AudioTrack;)Z

    .line 198
    .line 199
    .line 200
    move-result p3

    .line 201
    if-eqz p3, :cond_10

    .line 202
    .line 203
    iget-wide v4, p0, Lf7/d0;->C:J

    .line 204
    .line 205
    const-wide/16 v6, 0x0

    .line 206
    .line 207
    cmp-long p3, v4, v6

    .line 208
    .line 209
    if-lez p3, :cond_f

    .line 210
    .line 211
    iput-boolean v3, p0, Lf7/d0;->Z:Z

    .line 212
    .line 213
    :cond_f
    iget-boolean p3, p0, Lf7/d0;->S:Z

    .line 214
    .line 215
    if-eqz p3, :cond_10

    .line 216
    .line 217
    iget-object p3, p0, Lf7/d0;->p:Lf7/s$c;

    .line 218
    .line 219
    if-eqz p3, :cond_10

    .line 220
    .line 221
    if-ge p2, v0, :cond_10

    .line 222
    .line 223
    iget-boolean p3, p0, Lf7/d0;->Z:Z

    .line 224
    .line 225
    if-nez p3, :cond_10

    .line 226
    .line 227
    iget-object p3, p0, Lf7/d0;->i:Lf7/u;

    .line 228
    .line 229
    invoke-virtual {p3, v4, v5}, Lf7/u;->e(J)J

    .line 230
    .line 231
    .line 232
    move-result-wide v4

    .line 233
    iget-object p3, p0, Lf7/d0;->p:Lf7/s$c;

    .line 234
    .line 235
    invoke-interface {p3, v4, v5}, Lf7/s$c;->e(J)V

    .line 236
    .line 237
    .line 238
    :cond_10
    iget-object p3, p0, Lf7/d0;->r:Lf7/d0$c;

    .line 239
    .line 240
    iget p3, p3, Lf7/d0$c;->c:I

    .line 241
    .line 242
    if-nez p3, :cond_11

    .line 243
    .line 244
    iget-wide v4, p0, Lf7/d0;->B:J

    .line 245
    .line 246
    int-to-long v6, p2

    .line 247
    add-long/2addr v4, v6

    .line 248
    iput-wide v4, p0, Lf7/d0;->B:J

    .line 249
    .line 250
    :cond_11
    if-ne p2, v0, :cond_14

    .line 251
    .line 252
    if-eqz p3, :cond_13

    .line 253
    .line 254
    iget-object p2, p0, Lf7/d0;->K:Ljava/nio/ByteBuffer;

    .line 255
    .line 256
    if-ne p1, p2, :cond_12

    .line 257
    .line 258
    goto :goto_4

    .line 259
    :cond_12
    move v2, v3

    .line 260
    :goto_4
    invoke-static {v2}, Lf9/a;->f(Z)V

    .line 261
    .line 262
    .line 263
    iget-wide p1, p0, Lf7/d0;->C:J

    .line 264
    .line 265
    iget p3, p0, Lf7/d0;->D:I

    .line 266
    .line 267
    iget v0, p0, Lf7/d0;->L:I

    .line 268
    .line 269
    mul-int/2addr p3, v0

    .line 270
    int-to-long v0, p3

    .line 271
    add-long/2addr p1, v0

    .line 272
    iput-wide p1, p0, Lf7/d0;->C:J

    .line 273
    .line 274
    :cond_13
    const/4 p1, 0x0

    .line 275
    iput-object p1, p0, Lf7/d0;->M:Ljava/nio/ByteBuffer;

    .line 276
    .line 277
    :cond_14
    return-void
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
.end method

.method private static r0(Landroid/media/AudioTrack;Ljava/nio/ByteBuffer;I)I
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, p2, v0}, Landroid/media/AudioTrack;->write(Ljava/nio/ByteBuffer;II)I

    move-result p0

    return p0
.end method

.method private s0(Landroid/media/AudioTrack;Ljava/nio/ByteBuffer;IJ)I
    .locals 10

    .line 1
    sget v0, Lf9/q0;->a:I

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    const-wide/16 v2, 0x3e8

    .line 6
    .line 7
    if-lt v0, v1, :cond_0

    .line 8
    .line 9
    const/4 v7, 0x1

    .line 10
    mul-long v8, p4, v2

    .line 11
    .line 12
    move-object v4, p1

    .line 13
    move-object v5, p2

    .line 14
    move v6, p3

    .line 15
    invoke-virtual/range {v4 .. v9}, Landroid/media/AudioTrack;->write(Ljava/nio/ByteBuffer;IIJ)I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    return p1

    .line 20
    :cond_0
    iget-object v0, p0, Lf7/d0;->x:Ljava/nio/ByteBuffer;

    .line 21
    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    const/16 v0, 0x10

    .line 25
    .line 26
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iput-object v0, p0, Lf7/d0;->x:Ljava/nio/ByteBuffer;

    .line 31
    .line 32
    sget-object v1, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Lf7/d0;->x:Ljava/nio/ByteBuffer;

    .line 38
    .line 39
    const v1, 0x55550001

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 43
    .line 44
    .line 45
    :cond_1
    iget v0, p0, Lf7/d0;->y:I

    .line 46
    .line 47
    const/4 v1, 0x0

    .line 48
    if-nez v0, :cond_2

    .line 49
    .line 50
    iget-object v0, p0, Lf7/d0;->x:Ljava/nio/ByteBuffer;

    .line 51
    .line 52
    const/4 v4, 0x4

    .line 53
    invoke-virtual {v0, v4, p3}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 54
    .line 55
    .line 56
    iget-object v0, p0, Lf7/d0;->x:Ljava/nio/ByteBuffer;

    .line 57
    .line 58
    const/16 v4, 0x8

    .line 59
    .line 60
    mul-long/2addr p4, v2

    .line 61
    invoke-virtual {v0, v4, p4, p5}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    .line 62
    .line 63
    .line 64
    iget-object p4, p0, Lf7/d0;->x:Ljava/nio/ByteBuffer;

    .line 65
    .line 66
    invoke-virtual {p4, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 67
    .line 68
    .line 69
    iput p3, p0, Lf7/d0;->y:I

    .line 70
    .line 71
    :cond_2
    iget-object p4, p0, Lf7/d0;->x:Ljava/nio/ByteBuffer;

    .line 72
    .line 73
    invoke-virtual {p4}, Ljava/nio/Buffer;->remaining()I

    .line 74
    .line 75
    .line 76
    move-result p4

    .line 77
    if-lez p4, :cond_4

    .line 78
    .line 79
    iget-object p5, p0, Lf7/d0;->x:Ljava/nio/ByteBuffer;

    .line 80
    .line 81
    const/4 v0, 0x1

    .line 82
    invoke-virtual {p1, p5, p4, v0}, Landroid/media/AudioTrack;->write(Ljava/nio/ByteBuffer;II)I

    .line 83
    .line 84
    .line 85
    move-result p5

    .line 86
    if-gez p5, :cond_3

    .line 87
    .line 88
    iput v1, p0, Lf7/d0;->y:I

    .line 89
    .line 90
    return p5

    .line 91
    :cond_3
    if-ge p5, p4, :cond_4

    .line 92
    .line 93
    return v1

    .line 94
    :cond_4
    invoke-static {p1, p2, p3}, Lf7/d0;->r0(Landroid/media/AudioTrack;Ljava/nio/ByteBuffer;I)I

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    if-gez p1, :cond_5

    .line 99
    .line 100
    iput v1, p0, Lf7/d0;->y:I

    .line 101
    .line 102
    return p1

    .line 103
    :cond_5
    iget p2, p0, Lf7/d0;->y:I

    .line 104
    .line 105
    sub-int/2addr p2, p1

    .line 106
    iput p2, p0, Lf7/d0;->y:I

    .line 107
    .line 108
    return p1
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
.end method

.method static synthetic x(I)I
    .locals 0

    invoke-static {p0}, Lf7/d0;->R(I)I

    move-result p0

    return p0
.end method

.method static synthetic y(Lf7/d0;)Landroid/os/ConditionVariable;
    .locals 0

    iget-object p0, p0, Lf7/d0;->h:Landroid/os/ConditionVariable;

    return-object p0
.end method

.method static synthetic z(Lf7/d0;)Landroid/media/AudioTrack;
    .locals 0

    iget-object p0, p0, Lf7/d0;->s:Landroid/media/AudioTrack;

    return-object p0
.end method


# virtual methods
.method public T()Z
    .locals 1

    invoke-direct {p0}, Lf7/d0;->S()Lf7/d0$f;

    move-result-object v0

    iget-boolean v0, v0, Lf7/d0$f;->b:Z

    return v0
.end method

.method public a(Ld7/k;)Z
    .locals 0

    invoke-virtual {p0, p1}, Lf7/d0;->m(Ld7/k;)I

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public b()Lcom/google/android/exoplayer2/PlaybackParameters;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lf7/d0;->k:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lf7/d0;->w:Lcom/google/android/exoplayer2/PlaybackParameters;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-direct {p0}, Lf7/d0;->M()Lcom/google/android/exoplayer2/PlaybackParameters;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    :goto_0
    return-object v0
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
.end method

.method public c()Z
    .locals 1

    invoke-direct {p0}, Lf7/d0;->Y()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lf7/d0;->Q:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lf7/d0;->g()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public e(Lcom/google/android/exoplayer2/PlaybackParameters;)V
    .locals 4

    .line 1
    new-instance v0, Lcom/google/android/exoplayer2/PlaybackParameters;

    .line 2
    .line 3
    iget v1, p1, Lcom/google/android/exoplayer2/PlaybackParameters;->a:F

    .line 4
    .line 5
    const v2, 0x3dcccccd    # 0.1f

    .line 6
    .line 7
    .line 8
    const/high16 v3, 0x41000000    # 8.0f

    .line 9
    .line 10
    invoke-static {v1, v2, v3}, Lf9/q0;->q(FFF)F

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    iget p1, p1, Lcom/google/android/exoplayer2/PlaybackParameters;->b:F

    .line 15
    .line 16
    invoke-static {p1, v2, v3}, Lf9/q0;->q(FFF)F

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    invoke-direct {v0, v1, p1}, Lcom/google/android/exoplayer2/PlaybackParameters;-><init>(FF)V

    .line 21
    .line 22
    .line 23
    iget-boolean p1, p0, Lf7/d0;->k:Z

    .line 24
    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    sget p1, Lf9/q0;->a:I

    .line 28
    .line 29
    const/16 v1, 0x17

    .line 30
    .line 31
    if-lt p1, v1, :cond_0

    .line 32
    .line 33
    invoke-direct {p0, v0}, Lf7/d0;->j0(Lcom/google/android/exoplayer2/PlaybackParameters;)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    invoke-virtual {p0}, Lf7/d0;->T()Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    invoke-direct {p0, v0, p1}, Lf7/d0;->i0(Lcom/google/android/exoplayer2/PlaybackParameters;Z)V

    .line 42
    .line 43
    .line 44
    :goto_0
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
.end method

.method public f()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lf7/d0;->Q:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lf7/d0;->Y()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-direct {p0}, Lf7/d0;->J()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-direct {p0}, Lf7/d0;->e0()V

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    iput-boolean v0, p0, Lf7/d0;->Q:Z

    .line 22
    .line 23
    :cond_0
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
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
.end method

.method public flush()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lf7/d0;->Y()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_4

    .line 6
    .line 7
    invoke-direct {p0}, Lf7/d0;->h0()V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lf7/d0;->i:Lf7/u;

    .line 11
    .line 12
    invoke-virtual {v0}, Lf7/u;->j()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    iget-object v0, p0, Lf7/d0;->s:Landroid/media/AudioTrack;

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/media/AudioTrack;->pause()V

    .line 21
    .line 22
    .line 23
    :cond_0
    iget-object v0, p0, Lf7/d0;->s:Landroid/media/AudioTrack;

    .line 24
    .line 25
    invoke-static {v0}, Lf7/d0;->a0(Landroid/media/AudioTrack;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    iget-object v0, p0, Lf7/d0;->m:Lf7/d0$i;

    .line 32
    .line 33
    invoke-static {v0}, Lf9/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    check-cast v0, Lf7/d0$i;

    .line 38
    .line 39
    iget-object v1, p0, Lf7/d0;->s:Landroid/media/AudioTrack;

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Lf7/d0$i;->b(Landroid/media/AudioTrack;)V

    .line 42
    .line 43
    .line 44
    :cond_1
    iget-object v0, p0, Lf7/d0;->s:Landroid/media/AudioTrack;

    .line 45
    .line 46
    const/4 v1, 0x0

    .line 47
    iput-object v1, p0, Lf7/d0;->s:Landroid/media/AudioTrack;

    .line 48
    .line 49
    sget v2, Lf9/q0;->a:I

    .line 50
    .line 51
    const/16 v3, 0x15

    .line 52
    .line 53
    if-ge v2, v3, :cond_2

    .line 54
    .line 55
    iget-boolean v2, p0, Lf7/d0;->T:Z

    .line 56
    .line 57
    if-nez v2, :cond_2

    .line 58
    .line 59
    const/4 v2, 0x0

    .line 60
    iput v2, p0, Lf7/d0;->U:I

    .line 61
    .line 62
    :cond_2
    iget-object v2, p0, Lf7/d0;->q:Lf7/d0$c;

    .line 63
    .line 64
    if-eqz v2, :cond_3

    .line 65
    .line 66
    iput-object v2, p0, Lf7/d0;->r:Lf7/d0$c;

    .line 67
    .line 68
    iput-object v1, p0, Lf7/d0;->q:Lf7/d0$c;

    .line 69
    .line 70
    :cond_3
    iget-object v1, p0, Lf7/d0;->i:Lf7/u;

    .line 71
    .line 72
    invoke-virtual {v1}, Lf7/u;->r()V

    .line 73
    .line 74
    .line 75
    iget-object v1, p0, Lf7/d0;->h:Landroid/os/ConditionVariable;

    .line 76
    .line 77
    invoke-virtual {v1}, Landroid/os/ConditionVariable;->close()V

    .line 78
    .line 79
    .line 80
    new-instance v1, Lf7/d0$a;

    .line 81
    .line 82
    const-string v2, "ExoPlayer:AudioTrackReleaseThread"

    .line 83
    .line 84
    invoke-direct {v1, p0, v2, v0}, Lf7/d0$a;-><init>(Lf7/d0;Ljava/lang/String;Landroid/media/AudioTrack;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    .line 88
    .line 89
    .line 90
    :cond_4
    iget-object v0, p0, Lf7/d0;->o:Lf7/d0$g;

    .line 91
    .line 92
    invoke-virtual {v0}, Lf7/d0$g;->a()V

    .line 93
    .line 94
    .line 95
    iget-object v0, p0, Lf7/d0;->n:Lf7/d0$g;

    .line 96
    .line 97
    invoke-virtual {v0}, Lf7/d0$g;->a()V

    .line 98
    .line 99
    .line 100
    return-void
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
.end method

.method public g()Z
    .locals 3

    .line 1
    invoke-direct {p0}, Lf7/d0;->Y()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lf7/d0;->i:Lf7/u;

    .line 8
    .line 9
    invoke-direct {p0}, Lf7/d0;->V()J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    invoke-virtual {v0, v1, v2}, Lf7/u;->i(J)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    :goto_0
    return v0
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
.end method

.method public h(Lf7/v;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lf7/d0;->V:Lf7/v;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lf7/v;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget v0, p1, Lf7/v;->a:I

    .line 11
    .line 12
    iget v1, p1, Lf7/v;->b:F

    .line 13
    .line 14
    iget-object v2, p0, Lf7/d0;->s:Landroid/media/AudioTrack;

    .line 15
    .line 16
    if-eqz v2, :cond_2

    .line 17
    .line 18
    iget-object v3, p0, Lf7/d0;->V:Lf7/v;

    .line 19
    .line 20
    iget v3, v3, Lf7/v;->a:I

    .line 21
    .line 22
    if-eq v3, v0, :cond_1

    .line 23
    .line 24
    invoke-virtual {v2, v0}, Landroid/media/AudioTrack;->attachAuxEffect(I)I

    .line 25
    .line 26
    .line 27
    :cond_1
    if-eqz v0, :cond_2

    .line 28
    .line 29
    iget-object v0, p0, Lf7/d0;->s:Landroid/media/AudioTrack;

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Landroid/media/AudioTrack;->setAuxEffectSendLevel(F)I

    .line 32
    .line 33
    .line 34
    :cond_2
    iput-object p1, p0, Lf7/d0;->V:Lf7/v;

    .line 35
    .line 36
    return-void
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
.end method

.method public i(I)V
    .locals 1

    .line 1
    iget v0, p0, Lf7/d0;->U:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_1

    .line 4
    .line 5
    iput p1, p0, Lf7/d0;->U:I

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 p1, 0x0

    .line 12
    :goto_0
    iput-boolean p1, p0, Lf7/d0;->T:Z

    .line 13
    .line 14
    invoke-virtual {p0}, Lf7/d0;->flush()V

    .line 15
    .line 16
    .line 17
    :cond_1
    return-void
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
.end method

.method public j()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lf7/d0;->S:Z

    .line 3
    .line 4
    invoke-direct {p0}, Lf7/d0;->Y()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lf7/d0;->i:Lf7/u;

    .line 11
    .line 12
    invoke-virtual {v0}, Lf7/u;->q()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    iget-object v0, p0, Lf7/d0;->s:Landroid/media/AudioTrack;

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/media/AudioTrack;->pause()V

    .line 21
    .line 22
    .line 23
    :cond_0
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
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
.end method

.method public k(Z)J
    .locals 4

    .line 1
    invoke-direct {p0}, Lf7/d0;->Y()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget-boolean v0, p0, Lf7/d0;->F:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v0, p0, Lf7/d0;->i:Lf7/u;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lf7/u;->d(Z)J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    iget-object p1, p0, Lf7/d0;->r:Lf7/d0$c;

    .line 19
    .line 20
    invoke-direct {p0}, Lf7/d0;->V()J

    .line 21
    .line 22
    .line 23
    move-result-wide v2

    .line 24
    invoke-virtual {p1, v2, v3}, Lf7/d0$c;->i(J)J

    .line 25
    .line 26
    .line 27
    move-result-wide v2

    .line 28
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    .line 29
    .line 30
    .line 31
    move-result-wide v0

    .line 32
    invoke-direct {p0, v0, v1}, Lf7/d0;->G(J)J

    .line 33
    .line 34
    .line 35
    move-result-wide v0

    .line 36
    invoke-direct {p0, v0, v1}, Lf7/d0;->H(J)J

    .line 37
    .line 38
    .line 39
    move-result-wide v0

    .line 40
    return-wide v0

    .line 41
    :cond_1
    :goto_0
    const-wide/high16 v0, -0x8000000000000000L

    .line 42
    .line 43
    return-wide v0
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
.end method

.method public l()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lf7/d0;->W:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Lf7/d0;->W:Z

    .line 7
    .line 8
    invoke-virtual {p0}, Lf7/d0;->flush()V

    .line 9
    .line 10
    .line 11
    :cond_0
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
.end method

.method public m(Ld7/k;)I
    .locals 3

    .line 1
    iget-object v0, p1, Ld7/k;->v:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "audio/raw"

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    const/4 v2, 0x2

    .line 11
    if-eqz v0, :cond_3

    .line 12
    .line 13
    iget v0, p1, Ld7/k;->K:I

    .line 14
    .line 15
    invoke-static {v0}, Lf9/q0;->p0(I)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    new-instance v0, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 24
    .line 25
    .line 26
    const-string v2, "Invalid PCM encoding: "

    .line 27
    .line 28
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    iget p1, p1, Ld7/k;->K:I

    .line 32
    .line 33
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    const-string v0, "DefaultAudioSink"

    .line 41
    .line 42
    invoke-static {v0, p1}, Lf9/r;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    return v1

    .line 46
    :cond_0
    iget p1, p1, Ld7/k;->K:I

    .line 47
    .line 48
    if-eq p1, v2, :cond_2

    .line 49
    .line 50
    iget-boolean v0, p0, Lf7/d0;->c:Z

    .line 51
    .line 52
    if-eqz v0, :cond_1

    .line 53
    .line 54
    const/4 v0, 0x4

    .line 55
    if-ne p1, v0, :cond_1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    const/4 p1, 0x1

    .line 59
    return p1

    .line 60
    :cond_2
    :goto_0
    return v2

    .line 61
    :cond_3
    iget-boolean v0, p0, Lf7/d0;->l:Z

    .line 62
    .line 63
    if-eqz v0, :cond_4

    .line 64
    .line 65
    iget-boolean v0, p0, Lf7/d0;->Y:Z

    .line 66
    .line 67
    if-nez v0, :cond_4

    .line 68
    .line 69
    iget-object v0, p0, Lf7/d0;->t:Lf7/e;

    .line 70
    .line 71
    invoke-static {p1, v0}, Lf7/d0;->b0(Ld7/k;Lf7/e;)Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-eqz v0, :cond_4

    .line 76
    .line 77
    return v2

    .line 78
    :cond_4
    iget-object v0, p0, Lf7/d0;->a:Lf7/f;

    .line 79
    .line 80
    invoke-static {p1, v0}, Lf7/d0;->c0(Ld7/k;Lf7/f;)Z

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    if-eqz p1, :cond_5

    .line 85
    .line 86
    return v2

    .line 87
    :cond_5
    return v1
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
.end method

.method public n()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lf7/d0;->E:Z

    return-void
.end method

.method public o(F)V
    .locals 1

    .line 1
    iget v0, p0, Lf7/d0;->H:F

    .line 2
    .line 3
    cmpl-float v0, v0, p1

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iput p1, p0, Lf7/d0;->H:F

    .line 8
    .line 9
    invoke-direct {p0}, Lf7/d0;->k0()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
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
.end method

.method public p()V
    .locals 3

    .line 1
    sget v0, Lf9/q0;->a:I

    .line 2
    .line 3
    const/16 v1, 0x15

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-lt v0, v1, :cond_0

    .line 7
    .line 8
    move v0, v2

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    invoke-static {v0}, Lf9/a;->f(Z)V

    .line 12
    .line 13
    .line 14
    iget-boolean v0, p0, Lf7/d0;->T:Z

    .line 15
    .line 16
    invoke-static {v0}, Lf9/a;->f(Z)V

    .line 17
    .line 18
    .line 19
    iget-boolean v0, p0, Lf7/d0;->W:Z

    .line 20
    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    iput-boolean v2, p0, Lf7/d0;->W:Z

    .line 24
    .line 25
    invoke-virtual {p0}, Lf7/d0;->flush()V

    .line 26
    .line 27
    .line 28
    :cond_1
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
.end method

.method public q()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lf7/d0;->S:Z

    .line 3
    .line 4
    invoke-direct {p0}, Lf7/d0;->Y()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lf7/d0;->i:Lf7/u;

    .line 11
    .line 12
    invoke-virtual {v0}, Lf7/u;->v()V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lf7/d0;->s:Landroid/media/AudioTrack;

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/media/AudioTrack;->play()V

    .line 18
    .line 19
    .line 20
    :cond_0
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
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
.end method

.method public r(Ljava/nio/ByteBuffer;JI)Z
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-wide/from16 v2, p2

    .line 6
    .line 7
    move/from16 v4, p4

    .line 8
    .line 9
    iget-object v5, v1, Lf7/d0;->K:Ljava/nio/ByteBuffer;

    .line 10
    .line 11
    const/4 v6, 0x1

    .line 12
    const/4 v7, 0x0

    .line 13
    if-eqz v5, :cond_1

    .line 14
    .line 15
    if-ne v0, v5, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v5, v7

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    :goto_0
    move v5, v6

    .line 21
    :goto_1
    invoke-static {v5}, Lf9/a;->a(Z)V

    .line 22
    .line 23
    .line 24
    iget-object v5, v1, Lf7/d0;->q:Lf7/d0$c;

    .line 25
    .line 26
    const/4 v8, 0x0

    .line 27
    if-eqz v5, :cond_6

    .line 28
    .line 29
    invoke-direct/range {p0 .. p0}, Lf7/d0;->J()Z

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    if-nez v5, :cond_2

    .line 34
    .line 35
    return v7

    .line 36
    :cond_2
    iget-object v5, v1, Lf7/d0;->q:Lf7/d0$c;

    .line 37
    .line 38
    iget-object v9, v1, Lf7/d0;->r:Lf7/d0$c;

    .line 39
    .line 40
    invoke-virtual {v5, v9}, Lf7/d0$c;->b(Lf7/d0$c;)Z

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    if-nez v5, :cond_4

    .line 45
    .line 46
    invoke-direct/range {p0 .. p0}, Lf7/d0;->e0()V

    .line 47
    .line 48
    .line 49
    invoke-virtual/range {p0 .. p0}, Lf7/d0;->g()Z

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    if-eqz v5, :cond_3

    .line 54
    .line 55
    return v7

    .line 56
    :cond_3
    invoke-virtual/range {p0 .. p0}, Lf7/d0;->flush()V

    .line 57
    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_4
    iget-object v5, v1, Lf7/d0;->q:Lf7/d0$c;

    .line 61
    .line 62
    iput-object v5, v1, Lf7/d0;->r:Lf7/d0$c;

    .line 63
    .line 64
    iput-object v8, v1, Lf7/d0;->q:Lf7/d0$c;

    .line 65
    .line 66
    iget-object v5, v1, Lf7/d0;->s:Landroid/media/AudioTrack;

    .line 67
    .line 68
    invoke-static {v5}, Lf7/d0;->a0(Landroid/media/AudioTrack;)Z

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    if-eqz v5, :cond_5

    .line 73
    .line 74
    iget-object v5, v1, Lf7/d0;->s:Landroid/media/AudioTrack;

    .line 75
    .line 76
    invoke-static {v5}, Lf7/b0;->a(Landroid/media/AudioTrack;)V

    .line 77
    .line 78
    .line 79
    iget-object v5, v1, Lf7/d0;->s:Landroid/media/AudioTrack;

    .line 80
    .line 81
    iget-object v9, v1, Lf7/d0;->r:Lf7/d0$c;

    .line 82
    .line 83
    iget-object v9, v9, Lf7/d0$c;->a:Ld7/k;

    .line 84
    .line 85
    iget v10, v9, Ld7/k;->L:I

    .line 86
    .line 87
    iget v9, v9, Ld7/k;->M:I

    .line 88
    .line 89
    invoke-static {v5, v10, v9}, Lf7/c0;->a(Landroid/media/AudioTrack;II)V

    .line 90
    .line 91
    .line 92
    iput-boolean v6, v1, Lf7/d0;->Z:Z

    .line 93
    .line 94
    :cond_5
    :goto_2
    invoke-direct {v1, v2, v3}, Lf7/d0;->F(J)V

    .line 95
    .line 96
    .line 97
    :cond_6
    invoke-direct/range {p0 .. p0}, Lf7/d0;->Y()Z

    .line 98
    .line 99
    .line 100
    move-result v5

    .line 101
    if-nez v5, :cond_8

    .line 102
    .line 103
    :try_start_0
    invoke-direct/range {p0 .. p0}, Lf7/d0;->W()V
    :try_end_0
    .catch Lf7/s$b; {:try_start_0 .. :try_end_0} :catch_0

    .line 104
    .line 105
    .line 106
    goto :goto_3

    .line 107
    :catch_0
    move-exception v0

    .line 108
    move-object v2, v0

    .line 109
    iget-boolean v0, v2, Lf7/s$b;->l:Z

    .line 110
    .line 111
    if-nez v0, :cond_7

    .line 112
    .line 113
    iget-object v0, v1, Lf7/d0;->n:Lf7/d0$g;

    .line 114
    .line 115
    invoke-virtual {v0, v2}, Lf7/d0$g;->b(Ljava/lang/Exception;)V

    .line 116
    .line 117
    .line 118
    return v7

    .line 119
    :cond_7
    throw v2

    .line 120
    :cond_8
    :goto_3
    iget-object v5, v1, Lf7/d0;->n:Lf7/d0$g;

    .line 121
    .line 122
    invoke-virtual {v5}, Lf7/d0$g;->a()V

    .line 123
    .line 124
    .line 125
    iget-boolean v5, v1, Lf7/d0;->F:Z

    .line 126
    .line 127
    const-wide/16 v9, 0x0

    .line 128
    .line 129
    if-eqz v5, :cond_a

    .line 130
    .line 131
    invoke-static {v9, v10, v2, v3}, Ljava/lang/Math;->max(JJ)J

    .line 132
    .line 133
    .line 134
    move-result-wide v11

    .line 135
    iput-wide v11, v1, Lf7/d0;->G:J

    .line 136
    .line 137
    iput-boolean v7, v1, Lf7/d0;->E:Z

    .line 138
    .line 139
    iput-boolean v7, v1, Lf7/d0;->F:Z

    .line 140
    .line 141
    iget-boolean v5, v1, Lf7/d0;->k:Z

    .line 142
    .line 143
    if-eqz v5, :cond_9

    .line 144
    .line 145
    sget v5, Lf9/q0;->a:I

    .line 146
    .line 147
    const/16 v11, 0x17

    .line 148
    .line 149
    if-lt v5, v11, :cond_9

    .line 150
    .line 151
    iget-object v5, v1, Lf7/d0;->w:Lcom/google/android/exoplayer2/PlaybackParameters;

    .line 152
    .line 153
    invoke-direct {v1, v5}, Lf7/d0;->j0(Lcom/google/android/exoplayer2/PlaybackParameters;)V

    .line 154
    .line 155
    .line 156
    :cond_9
    invoke-direct {v1, v2, v3}, Lf7/d0;->F(J)V

    .line 157
    .line 158
    .line 159
    iget-boolean v5, v1, Lf7/d0;->S:Z

    .line 160
    .line 161
    if-eqz v5, :cond_a

    .line 162
    .line 163
    invoke-virtual/range {p0 .. p0}, Lf7/d0;->q()V

    .line 164
    .line 165
    .line 166
    :cond_a
    iget-object v5, v1, Lf7/d0;->i:Lf7/u;

    .line 167
    .line 168
    invoke-direct/range {p0 .. p0}, Lf7/d0;->V()J

    .line 169
    .line 170
    .line 171
    move-result-wide v11

    .line 172
    invoke-virtual {v5, v11, v12}, Lf7/u;->l(J)Z

    .line 173
    .line 174
    .line 175
    move-result v5

    .line 176
    if-nez v5, :cond_b

    .line 177
    .line 178
    return v7

    .line 179
    :cond_b
    iget-object v5, v1, Lf7/d0;->K:Ljava/nio/ByteBuffer;

    .line 180
    .line 181
    const-string v11, "DefaultAudioSink"

    .line 182
    .line 183
    if-nez v5, :cond_15

    .line 184
    .line 185
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->order()Ljava/nio/ByteOrder;

    .line 186
    .line 187
    .line 188
    move-result-object v5

    .line 189
    sget-object v12, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 190
    .line 191
    if-ne v5, v12, :cond_c

    .line 192
    .line 193
    move v5, v6

    .line 194
    goto :goto_4

    .line 195
    :cond_c
    move v5, v7

    .line 196
    :goto_4
    invoke-static {v5}, Lf9/a;->a(Z)V

    .line 197
    .line 198
    .line 199
    invoke-virtual/range {p1 .. p1}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 200
    .line 201
    .line 202
    move-result v5

    .line 203
    if-nez v5, :cond_d

    .line 204
    .line 205
    return v6

    .line 206
    :cond_d
    iget-object v5, v1, Lf7/d0;->r:Lf7/d0$c;

    .line 207
    .line 208
    iget v12, v5, Lf7/d0$c;->c:I

    .line 209
    .line 210
    if-eqz v12, :cond_e

    .line 211
    .line 212
    iget v12, v1, Lf7/d0;->D:I

    .line 213
    .line 214
    if-nez v12, :cond_e

    .line 215
    .line 216
    iget v5, v5, Lf7/d0$c;->g:I

    .line 217
    .line 218
    invoke-static {v5, v0}, Lf7/d0;->P(ILjava/nio/ByteBuffer;)I

    .line 219
    .line 220
    .line 221
    move-result v5

    .line 222
    iput v5, v1, Lf7/d0;->D:I

    .line 223
    .line 224
    if-nez v5, :cond_e

    .line 225
    .line 226
    return v6

    .line 227
    :cond_e
    iget-object v5, v1, Lf7/d0;->u:Lf7/d0$f;

    .line 228
    .line 229
    if-eqz v5, :cond_10

    .line 230
    .line 231
    invoke-direct/range {p0 .. p0}, Lf7/d0;->J()Z

    .line 232
    .line 233
    .line 234
    move-result v5

    .line 235
    if-nez v5, :cond_f

    .line 236
    .line 237
    return v7

    .line 238
    :cond_f
    invoke-direct {v1, v2, v3}, Lf7/d0;->F(J)V

    .line 239
    .line 240
    .line 241
    iput-object v8, v1, Lf7/d0;->u:Lf7/d0$f;

    .line 242
    .line 243
    :cond_10
    iget-wide v12, v1, Lf7/d0;->G:J

    .line 244
    .line 245
    iget-object v5, v1, Lf7/d0;->r:Lf7/d0$c;

    .line 246
    .line 247
    invoke-direct/range {p0 .. p0}, Lf7/d0;->U()J

    .line 248
    .line 249
    .line 250
    move-result-wide v14

    .line 251
    iget-object v8, v1, Lf7/d0;->e:Lf7/r0;

    .line 252
    .line 253
    invoke-virtual {v8}, Lf7/r0;->m()J

    .line 254
    .line 255
    .line 256
    move-result-wide v16

    .line 257
    sub-long v14, v14, v16

    .line 258
    .line 259
    invoke-virtual {v5, v14, v15}, Lf7/d0$c;->n(J)J

    .line 260
    .line 261
    .line 262
    move-result-wide v14

    .line 263
    add-long/2addr v12, v14

    .line 264
    iget-boolean v5, v1, Lf7/d0;->E:Z

    .line 265
    .line 266
    if-nez v5, :cond_11

    .line 267
    .line 268
    sub-long v14, v12, v2

    .line 269
    .line 270
    invoke-static {v14, v15}, Ljava/lang/Math;->abs(J)J

    .line 271
    .line 272
    .line 273
    move-result-wide v14

    .line 274
    const-wide/32 v16, 0x30d40

    .line 275
    .line 276
    .line 277
    cmp-long v5, v14, v16

    .line 278
    .line 279
    if-lez v5, :cond_11

    .line 280
    .line 281
    new-instance v5, Ljava/lang/StringBuilder;

    .line 282
    .line 283
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 284
    .line 285
    .line 286
    const-string v8, "Discontinuity detected [expected "

    .line 287
    .line 288
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 289
    .line 290
    .line 291
    invoke-virtual {v5, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 292
    .line 293
    .line 294
    const-string v8, ", got "

    .line 295
    .line 296
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 297
    .line 298
    .line 299
    invoke-virtual {v5, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 300
    .line 301
    .line 302
    const-string v8, "]"

    .line 303
    .line 304
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 305
    .line 306
    .line 307
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object v5

    .line 311
    invoke-static {v11, v5}, Lf9/r;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 312
    .line 313
    .line 314
    iput-boolean v6, v1, Lf7/d0;->E:Z

    .line 315
    .line 316
    :cond_11
    iget-boolean v5, v1, Lf7/d0;->E:Z

    .line 317
    .line 318
    if-eqz v5, :cond_13

    .line 319
    .line 320
    invoke-direct/range {p0 .. p0}, Lf7/d0;->J()Z

    .line 321
    .line 322
    .line 323
    move-result v5

    .line 324
    if-nez v5, :cond_12

    .line 325
    .line 326
    return v7

    .line 327
    :cond_12
    sub-long v12, v2, v12

    .line 328
    .line 329
    iget-wide v14, v1, Lf7/d0;->G:J

    .line 330
    .line 331
    add-long/2addr v14, v12

    .line 332
    iput-wide v14, v1, Lf7/d0;->G:J

    .line 333
    .line 334
    iput-boolean v7, v1, Lf7/d0;->E:Z

    .line 335
    .line 336
    invoke-direct {v1, v2, v3}, Lf7/d0;->F(J)V

    .line 337
    .line 338
    .line 339
    iget-object v5, v1, Lf7/d0;->p:Lf7/s$c;

    .line 340
    .line 341
    if-eqz v5, :cond_13

    .line 342
    .line 343
    cmp-long v8, v12, v9

    .line 344
    .line 345
    if-eqz v8, :cond_13

    .line 346
    .line 347
    invoke-interface {v5}, Lf7/s$c;->f()V

    .line 348
    .line 349
    .line 350
    :cond_13
    iget-object v5, v1, Lf7/d0;->r:Lf7/d0$c;

    .line 351
    .line 352
    iget v5, v5, Lf7/d0$c;->c:I

    .line 353
    .line 354
    if-nez v5, :cond_14

    .line 355
    .line 356
    iget-wide v8, v1, Lf7/d0;->z:J

    .line 357
    .line 358
    invoke-virtual/range {p1 .. p1}, Ljava/nio/Buffer;->remaining()I

    .line 359
    .line 360
    .line 361
    move-result v5

    .line 362
    int-to-long v12, v5

    .line 363
    add-long/2addr v8, v12

    .line 364
    iput-wide v8, v1, Lf7/d0;->z:J

    .line 365
    .line 366
    goto :goto_5

    .line 367
    :cond_14
    iget-wide v8, v1, Lf7/d0;->A:J

    .line 368
    .line 369
    iget v5, v1, Lf7/d0;->D:I

    .line 370
    .line 371
    mul-int/2addr v5, v4

    .line 372
    int-to-long v12, v5

    .line 373
    add-long/2addr v8, v12

    .line 374
    iput-wide v8, v1, Lf7/d0;->A:J

    .line 375
    .line 376
    :goto_5
    iput-object v0, v1, Lf7/d0;->K:Ljava/nio/ByteBuffer;

    .line 377
    .line 378
    iput v4, v1, Lf7/d0;->L:I

    .line 379
    .line 380
    :cond_15
    invoke-direct {v1, v2, v3}, Lf7/d0;->f0(J)V

    .line 381
    .line 382
    .line 383
    iget-object v0, v1, Lf7/d0;->K:Ljava/nio/ByteBuffer;

    .line 384
    .line 385
    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 386
    .line 387
    .line 388
    move-result v0

    .line 389
    if-nez v0, :cond_16

    .line 390
    .line 391
    const/4 v0, 0x0

    .line 392
    iput-object v0, v1, Lf7/d0;->K:Ljava/nio/ByteBuffer;

    .line 393
    .line 394
    iput v7, v1, Lf7/d0;->L:I

    .line 395
    .line 396
    return v6

    .line 397
    :cond_16
    iget-object v0, v1, Lf7/d0;->i:Lf7/u;

    .line 398
    .line 399
    invoke-direct/range {p0 .. p0}, Lf7/d0;->V()J

    .line 400
    .line 401
    .line 402
    move-result-wide v2

    .line 403
    invoke-virtual {v0, v2, v3}, Lf7/u;->k(J)Z

    .line 404
    .line 405
    .line 406
    move-result v0

    .line 407
    if-eqz v0, :cond_17

    .line 408
    .line 409
    const-string v0, "Resetting stalled audio track"

    .line 410
    .line 411
    invoke-static {v11, v0}, Lf9/r;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 412
    .line 413
    .line 414
    invoke-virtual/range {p0 .. p0}, Lf7/d0;->flush()V

    .line 415
    .line 416
    .line 417
    return v6

    .line 418
    :cond_17
    return v7
.end method

.method public reset()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lf7/d0;->flush()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lf7/d0;->f:[Lf7/h;

    .line 5
    .line 6
    array-length v1, v0

    .line 7
    const/4 v2, 0x0

    .line 8
    move v3, v2

    .line 9
    :goto_0
    if-ge v3, v1, :cond_0

    .line 10
    .line 11
    aget-object v4, v0, v3

    .line 12
    .line 13
    invoke-interface {v4}, Lf7/h;->reset()V

    .line 14
    .line 15
    .line 16
    add-int/lit8 v3, v3, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-object v0, p0, Lf7/d0;->g:[Lf7/h;

    .line 20
    .line 21
    array-length v1, v0

    .line 22
    move v3, v2

    .line 23
    :goto_1
    if-ge v3, v1, :cond_1

    .line 24
    .line 25
    aget-object v4, v0, v3

    .line 26
    .line 27
    invoke-interface {v4}, Lf7/h;->reset()V

    .line 28
    .line 29
    .line 30
    add-int/lit8 v3, v3, 0x1

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    iput-boolean v2, p0, Lf7/d0;->S:Z

    .line 34
    .line 35
    iput-boolean v2, p0, Lf7/d0;->Y:Z

    .line 36
    .line 37
    return-void
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
.end method

.method public s(Lf7/s$c;)V
    .locals 0

    iput-object p1, p0, Lf7/d0;->p:Lf7/s$c;

    return-void
.end method

.method public t(Ld7/k;I[I)V
    .locals 14

    .line 1
    move-object v1, p0

    .line 2
    move-object v3, p1

    .line 3
    iget-object v0, v3, Ld7/k;->v:Ljava/lang/String;

    .line 4
    .line 5
    const-string v2, "audio/raw"

    .line 6
    .line 7
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v2, 0x0

    .line 12
    if-eqz v0, :cond_5

    .line 13
    .line 14
    iget v0, v3, Ld7/k;->K:I

    .line 15
    .line 16
    invoke-static {v0}, Lf9/q0;->p0(I)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    invoke-static {v0}, Lf9/a;->a(Z)V

    .line 21
    .line 22
    .line 23
    iget v0, v3, Ld7/k;->K:I

    .line 24
    .line 25
    iget v4, v3, Ld7/k;->I:I

    .line 26
    .line 27
    invoke-static {v0, v4}, Lf9/q0;->c0(II)I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    iget v4, v3, Ld7/k;->K:I

    .line 32
    .line 33
    invoke-direct {p0, v4}, Lf7/d0;->p0(I)Z

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    if-eqz v4, :cond_0

    .line 38
    .line 39
    iget-object v4, v1, Lf7/d0;->g:[Lf7/h;

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    iget-object v4, v1, Lf7/d0;->f:[Lf7/h;

    .line 43
    .line 44
    :goto_0
    iget-object v5, v1, Lf7/d0;->e:Lf7/r0;

    .line 45
    .line 46
    iget v6, v3, Ld7/k;->L:I

    .line 47
    .line 48
    iget v7, v3, Ld7/k;->M:I

    .line 49
    .line 50
    invoke-virtual {v5, v6, v7}, Lf7/r0;->o(II)V

    .line 51
    .line 52
    .line 53
    sget v5, Lf9/q0;->a:I

    .line 54
    .line 55
    const/16 v6, 0x15

    .line 56
    .line 57
    if-ge v5, v6, :cond_1

    .line 58
    .line 59
    iget v5, v3, Ld7/k;->I:I

    .line 60
    .line 61
    const/16 v6, 0x8

    .line 62
    .line 63
    if-ne v5, v6, :cond_1

    .line 64
    .line 65
    if-nez p3, :cond_1

    .line 66
    .line 67
    const/4 v5, 0x6

    .line 68
    new-array v6, v5, [I

    .line 69
    .line 70
    move v7, v2

    .line 71
    :goto_1
    if-ge v7, v5, :cond_2

    .line 72
    .line 73
    aput v7, v6, v7

    .line 74
    .line 75
    add-int/lit8 v7, v7, 0x1

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_1
    move-object/from16 v6, p3

    .line 79
    .line 80
    :cond_2
    iget-object v5, v1, Lf7/d0;->d:Lf7/x;

    .line 81
    .line 82
    invoke-virtual {v5, v6}, Lf7/x;->m([I)V

    .line 83
    .line 84
    .line 85
    new-instance v5, Lf7/h$a;

    .line 86
    .line 87
    iget v6, v3, Ld7/k;->J:I

    .line 88
    .line 89
    iget v7, v3, Ld7/k;->I:I

    .line 90
    .line 91
    iget v8, v3, Ld7/k;->K:I

    .line 92
    .line 93
    invoke-direct {v5, v6, v7, v8}, Lf7/h$a;-><init>(III)V

    .line 94
    .line 95
    .line 96
    array-length v6, v4

    .line 97
    move v7, v2

    .line 98
    :goto_2
    if-ge v7, v6, :cond_4

    .line 99
    .line 100
    aget-object v8, v4, v7

    .line 101
    .line 102
    :try_start_0
    invoke-interface {v8, v5}, Lf7/h;->g(Lf7/h$a;)Lf7/h$a;

    .line 103
    .line 104
    .line 105
    move-result-object v9

    .line 106
    invoke-interface {v8}, Lf7/h;->b()Z

    .line 107
    .line 108
    .line 109
    move-result v8
    :try_end_0
    .catch Lf7/h$b; {:try_start_0 .. :try_end_0} :catch_0

    .line 110
    if-eqz v8, :cond_3

    .line 111
    .line 112
    move-object v5, v9

    .line 113
    :cond_3
    add-int/lit8 v7, v7, 0x1

    .line 114
    .line 115
    goto :goto_2

    .line 116
    :catch_0
    move-exception v0

    .line 117
    new-instance v2, Lf7/s$a;

    .line 118
    .line 119
    invoke-direct {v2, v0, p1}, Lf7/s$a;-><init>(Ljava/lang/Throwable;Ld7/k;)V

    .line 120
    .line 121
    .line 122
    throw v2

    .line 123
    :cond_4
    iget v6, v5, Lf7/h$a;->c:I

    .line 124
    .line 125
    iget v7, v5, Lf7/h$a;->a:I

    .line 126
    .line 127
    iget v8, v5, Lf7/h$a;->b:I

    .line 128
    .line 129
    invoke-static {v8}, Lf9/q0;->G(I)I

    .line 130
    .line 131
    .line 132
    move-result v8

    .line 133
    iget v5, v5, Lf7/h$a;->b:I

    .line 134
    .line 135
    invoke-static {v6, v5}, Lf9/q0;->c0(II)I

    .line 136
    .line 137
    .line 138
    move-result v5

    .line 139
    move-object v12, v4

    .line 140
    move v9, v6

    .line 141
    move v4, v0

    .line 142
    move v6, v5

    .line 143
    move v5, v2

    .line 144
    goto :goto_3

    .line 145
    :cond_5
    new-array v0, v2, [Lf7/h;

    .line 146
    .line 147
    iget v4, v3, Ld7/k;->J:I

    .line 148
    .line 149
    iget-boolean v5, v1, Lf7/d0;->l:Z

    .line 150
    .line 151
    const/4 v6, -0x1

    .line 152
    if-eqz v5, :cond_6

    .line 153
    .line 154
    iget-object v5, v1, Lf7/d0;->t:Lf7/e;

    .line 155
    .line 156
    invoke-static {p1, v5}, Lf7/d0;->b0(Ld7/k;Lf7/e;)Z

    .line 157
    .line 158
    .line 159
    move-result v5

    .line 160
    if-eqz v5, :cond_6

    .line 161
    .line 162
    iget-object v5, v3, Ld7/k;->v:Ljava/lang/String;

    .line 163
    .line 164
    invoke-static {v5}, Lf9/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v5

    .line 168
    check-cast v5, Ljava/lang/String;

    .line 169
    .line 170
    iget-object v7, v3, Ld7/k;->s:Ljava/lang/String;

    .line 171
    .line 172
    invoke-static {v5, v7}, Lf9/u;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 173
    .line 174
    .line 175
    move-result v5

    .line 176
    iget v7, v3, Ld7/k;->I:I

    .line 177
    .line 178
    invoke-static {v7}, Lf9/q0;->G(I)I

    .line 179
    .line 180
    .line 181
    move-result v7

    .line 182
    const/4 v8, 0x1

    .line 183
    move-object v12, v0

    .line 184
    move v9, v5

    .line 185
    move v5, v8

    .line 186
    move v8, v7

    .line 187
    move v7, v4

    .line 188
    move v4, v6

    .line 189
    goto :goto_3

    .line 190
    :cond_6
    iget-object v5, v1, Lf7/d0;->a:Lf7/f;

    .line 191
    .line 192
    invoke-static {p1, v5}, Lf7/d0;->O(Ld7/k;Lf7/f;)Landroid/util/Pair;

    .line 193
    .line 194
    .line 195
    move-result-object v5

    .line 196
    if-eqz v5, :cond_a

    .line 197
    .line 198
    iget-object v7, v5, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 199
    .line 200
    check-cast v7, Ljava/lang/Integer;

    .line 201
    .line 202
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 203
    .line 204
    .line 205
    move-result v7

    .line 206
    iget-object v5, v5, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 207
    .line 208
    check-cast v5, Ljava/lang/Integer;

    .line 209
    .line 210
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 211
    .line 212
    .line 213
    move-result v5

    .line 214
    const/4 v8, 0x2

    .line 215
    move-object v12, v0

    .line 216
    move v9, v7

    .line 217
    move v7, v4

    .line 218
    move v4, v6

    .line 219
    move v13, v8

    .line 220
    move v8, v5

    .line 221
    move v5, v13

    .line 222
    :goto_3
    const-string v0, ") for: "

    .line 223
    .line 224
    if-eqz v9, :cond_9

    .line 225
    .line 226
    if-eqz v8, :cond_8

    .line 227
    .line 228
    iput-boolean v2, v1, Lf7/d0;->Y:Z

    .line 229
    .line 230
    new-instance v0, Lf7/d0$c;

    .line 231
    .line 232
    iget-boolean v11, v1, Lf7/d0;->k:Z

    .line 233
    .line 234
    move-object v2, v0

    .line 235
    move-object v3, p1

    .line 236
    move/from16 v10, p2

    .line 237
    .line 238
    invoke-direct/range {v2 .. v12}, Lf7/d0$c;-><init>(Ld7/k;IIIIIIIZ[Lf7/h;)V

    .line 239
    .line 240
    .line 241
    invoke-direct {p0}, Lf7/d0;->Y()Z

    .line 242
    .line 243
    .line 244
    move-result v2

    .line 245
    if-eqz v2, :cond_7

    .line 246
    .line 247
    iput-object v0, v1, Lf7/d0;->q:Lf7/d0$c;

    .line 248
    .line 249
    goto :goto_4

    .line 250
    :cond_7
    iput-object v0, v1, Lf7/d0;->r:Lf7/d0$c;

    .line 251
    .line 252
    :goto_4
    return-void

    .line 253
    :cond_8
    new-instance v2, Lf7/s$a;

    .line 254
    .line 255
    new-instance v4, Ljava/lang/StringBuilder;

    .line 256
    .line 257
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 258
    .line 259
    .line 260
    const-string v6, "Invalid output channel config (mode="

    .line 261
    .line 262
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 263
    .line 264
    .line 265
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 266
    .line 267
    .line 268
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 269
    .line 270
    .line 271
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 272
    .line 273
    .line 274
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    invoke-direct {v2, v0, p1}, Lf7/s$a;-><init>(Ljava/lang/String;Ld7/k;)V

    .line 279
    .line 280
    .line 281
    throw v2

    .line 282
    :cond_9
    new-instance v2, Lf7/s$a;

    .line 283
    .line 284
    new-instance v4, Ljava/lang/StringBuilder;

    .line 285
    .line 286
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 287
    .line 288
    .line 289
    const-string v6, "Invalid output encoding (mode="

    .line 290
    .line 291
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 292
    .line 293
    .line 294
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 295
    .line 296
    .line 297
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 298
    .line 299
    .line 300
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 301
    .line 302
    .line 303
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    invoke-direct {v2, v0, p1}, Lf7/s$a;-><init>(Ljava/lang/String;Ld7/k;)V

    .line 308
    .line 309
    .line 310
    throw v2

    .line 311
    :cond_a
    new-instance v0, Lf7/s$a;

    .line 312
    .line 313
    new-instance v2, Ljava/lang/StringBuilder;

    .line 314
    .line 315
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 316
    .line 317
    .line 318
    const-string v4, "Unable to configure passthrough for: "

    .line 319
    .line 320
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 321
    .line 322
    .line 323
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 324
    .line 325
    .line 326
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 327
    .line 328
    .line 329
    move-result-object v2

    .line 330
    invoke-direct {v0, v2, p1}, Lf7/s$a;-><init>(Ljava/lang/String;Ld7/k;)V

    .line 331
    .line 332
    .line 333
    throw v0
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
.end method

.method public u()V
    .locals 8

    .line 1
    sget v0, Lf9/q0;->a:I

    .line 2
    .line 3
    const/16 v1, 0x19

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lf7/d0;->flush()V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    iget-object v0, p0, Lf7/d0;->o:Lf7/d0$g;

    .line 12
    .line 13
    invoke-virtual {v0}, Lf7/d0$g;->a()V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lf7/d0;->n:Lf7/d0$g;

    .line 17
    .line 18
    invoke-virtual {v0}, Lf7/d0$g;->a()V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Lf7/d0;->Y()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    invoke-direct {p0}, Lf7/d0;->h0()V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lf7/d0;->i:Lf7/u;

    .line 32
    .line 33
    invoke-virtual {v0}, Lf7/u;->j()Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    iget-object v0, p0, Lf7/d0;->s:Landroid/media/AudioTrack;

    .line 40
    .line 41
    invoke-virtual {v0}, Landroid/media/AudioTrack;->pause()V

    .line 42
    .line 43
    .line 44
    :cond_2
    iget-object v0, p0, Lf7/d0;->s:Landroid/media/AudioTrack;

    .line 45
    .line 46
    invoke-virtual {v0}, Landroid/media/AudioTrack;->flush()V

    .line 47
    .line 48
    .line 49
    iget-object v0, p0, Lf7/d0;->i:Lf7/u;

    .line 50
    .line 51
    invoke-virtual {v0}, Lf7/u;->r()V

    .line 52
    .line 53
    .line 54
    iget-object v1, p0, Lf7/d0;->i:Lf7/u;

    .line 55
    .line 56
    iget-object v2, p0, Lf7/d0;->s:Landroid/media/AudioTrack;

    .line 57
    .line 58
    iget-object v0, p0, Lf7/d0;->r:Lf7/d0$c;

    .line 59
    .line 60
    iget v3, v0, Lf7/d0$c;->c:I

    .line 61
    .line 62
    const/4 v4, 0x2

    .line 63
    const/4 v7, 0x1

    .line 64
    if-ne v3, v4, :cond_3

    .line 65
    .line 66
    move v3, v7

    .line 67
    goto :goto_0

    .line 68
    :cond_3
    const/4 v3, 0x0

    .line 69
    :goto_0
    iget v4, v0, Lf7/d0$c;->g:I

    .line 70
    .line 71
    iget v5, v0, Lf7/d0$c;->d:I

    .line 72
    .line 73
    iget v6, v0, Lf7/d0$c;->h:I

    .line 74
    .line 75
    invoke-virtual/range {v1 .. v6}, Lf7/u;->t(Landroid/media/AudioTrack;ZIII)V

    .line 76
    .line 77
    .line 78
    iput-boolean v7, p0, Lf7/d0;->F:Z

    .line 79
    .line 80
    return-void
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
.end method

.method public v(Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lf7/d0;->M()Lcom/google/android/exoplayer2/PlaybackParameters;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0, v0, p1}, Lf7/d0;->i0(Lcom/google/android/exoplayer2/PlaybackParameters;Z)V

    .line 6
    .line 7
    .line 8
    return-void
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
.end method

.method public w(Lf7/e;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lf7/d0;->t:Lf7/e;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lf7/e;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iput-object p1, p0, Lf7/d0;->t:Lf7/e;

    .line 11
    .line 12
    iget-boolean p1, p0, Lf7/d0;->W:Z

    .line 13
    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    return-void

    .line 17
    :cond_1
    invoke-virtual {p0}, Lf7/d0;->flush()V

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
.end method
