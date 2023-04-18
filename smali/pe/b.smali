.class public Lpe/b;
.super Lpe/c;
.source "SourceFile"


# static fields
.field private static final p:Ljava/lang/String; = "b"


# instance fields
.field m:Ljava/nio/ByteBuffer;

.field n:Landroid/media/MediaCodec$BufferInfo;

.field o:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method constructor <init>(Lne/c;ILne/d;I)V
    .locals 9

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move v4, p4

    invoke-direct/range {v0 .. v8}, Lpe/c;-><init>(Lne/c;ILne/d;ILandroid/media/MediaFormat;Loe/i;Lhe/a;Lhe/b;)V

    return-void
.end method


# virtual methods
.method public c()Ljava/lang/String;
    .locals 1

    const-string v0, "passthrough"

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    const-string v0, "passthrough"

    return-object v0
.end method

.method public g()I
    .locals 15

    .line 1
    iget v0, p0, Lpe/b;->o:I

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v2, 0x5

    .line 8
    if-ne v0, v2, :cond_1

    .line 9
    .line 10
    invoke-virtual {p0}, Lpe/c;->b()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iput v0, p0, Lpe/b;->o:I

    .line 15
    .line 16
    return v1

    .line 17
    :cond_1
    iget-boolean v0, p0, Lpe/c;->i:Z

    .line 18
    .line 19
    const-wide/16 v2, 0x0

    .line 20
    .line 21
    const/4 v4, 0x1

    .line 22
    if-nez v0, :cond_4

    .line 23
    .line 24
    iget-object v0, p0, Lpe/c;->a:Lne/c;

    .line 25
    .line 26
    iget v1, p0, Lpe/c;->g:I

    .line 27
    .line 28
    invoke-interface {v0, v1}, Lne/c;->getTrackFormat(I)Landroid/media/MediaFormat;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iput-object v0, p0, Lpe/c;->j:Landroid/media/MediaFormat;

    .line 33
    .line 34
    iget-wide v5, p0, Lpe/c;->k:J

    .line 35
    .line 36
    cmp-long v1, v5, v2

    .line 37
    .line 38
    if-lez v1, :cond_2

    .line 39
    .line 40
    const-string v1, "durationUs"

    .line 41
    .line 42
    invoke-virtual {v0, v1, v5, v6}, Landroid/media/MediaFormat;->setLong(Ljava/lang/String;J)V

    .line 43
    .line 44
    .line 45
    :cond_2
    iget-object v0, p0, Lpe/c;->b:Lne/d;

    .line 46
    .line 47
    iget-object v1, p0, Lpe/c;->j:Landroid/media/MediaFormat;

    .line 48
    .line 49
    iget v2, p0, Lpe/c;->h:I

    .line 50
    .line 51
    invoke-interface {v0, v1, v2}, Lne/d;->c(Landroid/media/MediaFormat;I)I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    iput v0, p0, Lpe/c;->h:I

    .line 56
    .line 57
    iput-boolean v4, p0, Lpe/c;->i:Z

    .line 58
    .line 59
    iget-object v0, p0, Lpe/c;->j:Landroid/media/MediaFormat;

    .line 60
    .line 61
    const-string v1, "max-input-size"

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-eqz v0, :cond_3

    .line 68
    .line 69
    iget-object v0, p0, Lpe/c;->j:Landroid/media/MediaFormat;

    .line 70
    .line 71
    invoke-virtual {v0, v1}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    goto :goto_0

    .line 76
    :cond_3
    const/high16 v0, 0x100000

    .line 77
    .line 78
    :goto_0
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    iput-object v0, p0, Lpe/b;->m:Ljava/nio/ByteBuffer;

    .line 83
    .line 84
    iput v4, p0, Lpe/b;->o:I

    .line 85
    .line 86
    return v4

    .line 87
    :cond_4
    iget-object v0, p0, Lpe/c;->a:Lne/c;

    .line 88
    .line 89
    invoke-interface {v0}, Lne/c;->getSampleTrackIndex()I

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    const/4 v5, -0x1

    .line 94
    const/4 v6, 0x2

    .line 95
    if-eq v0, v5, :cond_5

    .line 96
    .line 97
    iget v5, p0, Lpe/c;->g:I

    .line 98
    .line 99
    if-eq v0, v5, :cond_5

    .line 100
    .line 101
    iput v6, p0, Lpe/b;->o:I

    .line 102
    .line 103
    return v6

    .line 104
    :cond_5
    iput v6, p0, Lpe/b;->o:I

    .line 105
    .line 106
    iget-object v0, p0, Lpe/c;->a:Lne/c;

    .line 107
    .line 108
    iget-object v5, p0, Lpe/b;->m:Ljava/nio/ByteBuffer;

    .line 109
    .line 110
    const/4 v6, 0x0

    .line 111
    invoke-interface {v0, v5, v6}, Lne/c;->readSampleData(Ljava/nio/ByteBuffer;I)I

    .line 112
    .line 113
    .line 114
    move-result v9

    .line 115
    iget-object v0, p0, Lpe/c;->a:Lne/c;

    .line 116
    .line 117
    invoke-interface {v0}, Lne/c;->getSampleTime()J

    .line 118
    .line 119
    .line 120
    move-result-wide v7

    .line 121
    iget-object v0, p0, Lpe/c;->a:Lne/c;

    .line 122
    .line 123
    invoke-interface {v0}, Lne/c;->getSampleFlags()I

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    const/high16 v5, 0x3f800000    # 1.0f

    .line 128
    .line 129
    if-ltz v9, :cond_b

    .line 130
    .line 131
    and-int/lit8 v10, v0, 0x4

    .line 132
    .line 133
    if-eqz v10, :cond_6

    .line 134
    .line 135
    goto/16 :goto_2

    .line 136
    .line 137
    :cond_6
    iget-object v10, p0, Lpe/c;->f:Lcom/linkedin/android/litr/io/MediaRange;

    .line 138
    .line 139
    invoke-virtual {v10}, Lcom/linkedin/android/litr/io/MediaRange;->a()J

    .line 140
    .line 141
    .line 142
    move-result-wide v10

    .line 143
    cmp-long v10, v7, v10

    .line 144
    .line 145
    if-ltz v10, :cond_7

    .line 146
    .line 147
    iget-object v0, p0, Lpe/b;->m:Ljava/nio/ByteBuffer;

    .line 148
    .line 149
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 150
    .line 151
    .line 152
    iput v5, p0, Lpe/c;->l:F

    .line 153
    .line 154
    iget-object v9, p0, Lpe/b;->n:Landroid/media/MediaCodec$BufferInfo;

    .line 155
    .line 156
    const/4 v10, 0x0

    .line 157
    const/4 v11, 0x0

    .line 158
    iget-object v0, p0, Lpe/c;->f:Lcom/linkedin/android/litr/io/MediaRange;

    .line 159
    .line 160
    invoke-virtual {v0}, Lcom/linkedin/android/litr/io/MediaRange;->b()J

    .line 161
    .line 162
    .line 163
    move-result-wide v2

    .line 164
    sub-long v12, v7, v2

    .line 165
    .line 166
    iget-object v0, p0, Lpe/b;->n:Landroid/media/MediaCodec$BufferInfo;

    .line 167
    .line 168
    iget v0, v0, Landroid/media/MediaCodec$BufferInfo;->flags:I

    .line 169
    .line 170
    or-int/lit8 v14, v0, 0x4

    .line 171
    .line 172
    invoke-virtual/range {v9 .. v14}, Landroid/media/MediaCodec$BufferInfo;->set(IIJI)V

    .line 173
    .line 174
    .line 175
    iget-object v0, p0, Lpe/c;->b:Lne/d;

    .line 176
    .line 177
    iget v1, p0, Lpe/c;->h:I

    .line 178
    .line 179
    iget-object v2, p0, Lpe/b;->m:Ljava/nio/ByteBuffer;

    .line 180
    .line 181
    iget-object v3, p0, Lpe/b;->n:Landroid/media/MediaCodec$BufferInfo;

    .line 182
    .line 183
    invoke-interface {v0, v1, v2, v3}, Lne/d;->a(ILjava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {p0}, Lpe/c;->b()I

    .line 187
    .line 188
    .line 189
    move-result v0

    .line 190
    iput v0, p0, Lpe/b;->o:I

    .line 191
    .line 192
    sget-object v0, Lpe/b;->p:Ljava/lang/String;

    .line 193
    .line 194
    const-string v1, "Reach selection end on input stream"

    .line 195
    .line 196
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 197
    .line 198
    .line 199
    goto :goto_3

    .line 200
    :cond_7
    iget-object v1, p0, Lpe/c;->f:Lcom/linkedin/android/litr/io/MediaRange;

    .line 201
    .line 202
    invoke-virtual {v1}, Lcom/linkedin/android/litr/io/MediaRange;->b()J

    .line 203
    .line 204
    .line 205
    move-result-wide v10

    .line 206
    cmp-long v1, v7, v10

    .line 207
    .line 208
    if-ltz v1, :cond_a

    .line 209
    .line 210
    and-int/2addr v0, v4

    .line 211
    if-eqz v0, :cond_8

    .line 212
    .line 213
    move v12, v4

    .line 214
    goto :goto_1

    .line 215
    :cond_8
    move v12, v6

    .line 216
    :goto_1
    iget-object v0, p0, Lpe/c;->f:Lcom/linkedin/android/litr/io/MediaRange;

    .line 217
    .line 218
    invoke-virtual {v0}, Lcom/linkedin/android/litr/io/MediaRange;->b()J

    .line 219
    .line 220
    .line 221
    move-result-wide v0

    .line 222
    sub-long v10, v7, v0

    .line 223
    .line 224
    iget-wide v0, p0, Lpe/c;->k:J

    .line 225
    .line 226
    cmp-long v2, v0, v2

    .line 227
    .line 228
    if-lez v2, :cond_9

    .line 229
    .line 230
    long-to-float v2, v10

    .line 231
    long-to-float v0, v0

    .line 232
    div-float/2addr v2, v0

    .line 233
    iput v2, p0, Lpe/c;->l:F

    .line 234
    .line 235
    :cond_9
    iget-object v7, p0, Lpe/b;->n:Landroid/media/MediaCodec$BufferInfo;

    .line 236
    .line 237
    const/4 v8, 0x0

    .line 238
    invoke-virtual/range {v7 .. v12}, Landroid/media/MediaCodec$BufferInfo;->set(IIJI)V

    .line 239
    .line 240
    .line 241
    iget-object v0, p0, Lpe/c;->b:Lne/d;

    .line 242
    .line 243
    iget v1, p0, Lpe/c;->h:I

    .line 244
    .line 245
    iget-object v2, p0, Lpe/b;->m:Ljava/nio/ByteBuffer;

    .line 246
    .line 247
    iget-object v3, p0, Lpe/b;->n:Landroid/media/MediaCodec$BufferInfo;

    .line 248
    .line 249
    invoke-interface {v0, v1, v2, v3}, Lne/d;->a(ILjava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;)V

    .line 250
    .line 251
    .line 252
    :cond_a
    iget-object v0, p0, Lpe/c;->a:Lne/c;

    .line 253
    .line 254
    invoke-interface {v0}, Lne/c;->advance()V

    .line 255
    .line 256
    .line 257
    goto :goto_3

    .line 258
    :cond_b
    :goto_2
    iget-object v0, p0, Lpe/b;->m:Ljava/nio/ByteBuffer;

    .line 259
    .line 260
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 261
    .line 262
    .line 263
    iput v5, p0, Lpe/c;->l:F

    .line 264
    .line 265
    iput v1, p0, Lpe/b;->o:I

    .line 266
    .line 267
    sget-object v0, Lpe/b;->p:Ljava/lang/String;

    .line 268
    .line 269
    const-string v1, "Reach EoS on input stream"

    .line 270
    .line 271
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 272
    .line 273
    .line 274
    :goto_3
    iget v0, p0, Lpe/b;->o:I

    .line 275
    .line 276
    return v0
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

.method public h()V
    .locals 2

    .line 1
    iget-object v0, p0, Lpe/c;->a:Lne/c;

    .line 2
    .line 3
    iget v1, p0, Lpe/c;->g:I

    .line 4
    .line 5
    invoke-interface {v0, v1}, Lne/c;->selectTrack(I)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Landroid/media/MediaCodec$BufferInfo;

    .line 9
    .line 10
    invoke-direct {v0}, Landroid/media/MediaCodec$BufferInfo;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lpe/b;->n:Landroid/media/MediaCodec$BufferInfo;

    .line 14
    .line 15
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
.end method

.method public i()V
    .locals 1

    .line 1
    iget-object v0, p0, Lpe/b;->m:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lpe/b;->m:Ljava/nio/ByteBuffer;

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
.end method
