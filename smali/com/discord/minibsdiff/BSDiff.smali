.class public final Lcom/discord/minibsdiff/BSDiff;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/minibsdiff/BSDiff$BsPatchError;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0008\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u001bB\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000c\u001a\u00020\nJ8\u0010\r\u001a\u00020\u00082\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0016\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001a\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/discord/minibsdiff/BSDiff;",
        "",
        "()V",
        "BSDIFF_CONFIG_MAGIC",
        "",
        "BUFFER_SIZE_BYTES",
        "",
        "bspatchStreaming",
        "",
        "oldPath",
        "Ljava/io/File;",
        "patchPath",
        "newPath",
        "bspatchStreamingInner",
        "oldRandomAccessFile",
        "Ljava/io/RandomAccessFile;",
        "oldInputStream",
        "Ljava/io/InputStream;",
        "ctrlInputStream",
        "diffInputStream",
        "extraInputStream",
        "newOutputStream",
        "Ljava/io/OutputStream;",
        "chunkRange",
        "Lkotlin/sequences/Sequence;",
        "",
        "total",
        "BsPatchError",
        "minibsdiff_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final BSDIFF_CONFIG_MAGIC:[B

.field private static final BUFFER_SIZE_BYTES:J = 0xf4240L

.field public static final INSTANCE:Lcom/discord/minibsdiff/BSDiff;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/discord/minibsdiff/BSDiff;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/discord/minibsdiff/BSDiff;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/discord/minibsdiff/BSDiff;->INSTANCE:Lcom/discord/minibsdiff/BSDiff;

    .line 7
    .line 8
    const-string v0, "MBSDIF43"

    .line 9
    .line 10
    sget-object v1, Lpi/d;->b:Ljava/nio/charset/Charset;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-string v1, "this as java.lang.String).getBytes(charset)"

    .line 17
    .line 18
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    sput-object v0, Lcom/discord/minibsdiff/BSDiff;->BSDIFF_CONFIG_MAGIC:[B

    .line 22
    .line 23
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
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final bspatchStreamingInner(Ljava/io/RandomAccessFile;Ljava/io/InputStream;Ljava/io/InputStream;Ljava/io/InputStream;Ljava/io/InputStream;Ljava/io/OutputStream;)V
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p4

    .line 4
    .line 5
    move-object/from16 v2, p5

    .line 6
    .line 7
    move-object/from16 v3, p6

    .line 8
    .line 9
    const v4, 0xf4240

    .line 10
    .line 11
    .line 12
    new-array v5, v4, [B

    .line 13
    .line 14
    new-array v4, v4, [B

    .line 15
    .line 16
    const/16 v6, 0x8

    .line 17
    .line 18
    move-object/from16 v7, p3

    .line 19
    .line 20
    invoke-static {v7, v6}, Lcom/discord/minibsdiff/InputStreamUtilsKt;->readNBytes(Ljava/io/InputStream;I)[B

    .line 21
    .line 22
    .line 23
    move-result-object v6

    .line 24
    sget-object v8, Lcom/discord/minibsdiff/BSDiff;->BSDIFF_CONFIG_MAGIC:[B

    .line 25
    .line 26
    invoke-static {v6, v8}, Ljava/util/Arrays;->equals([B[B)Z

    .line 27
    .line 28
    .line 29
    move-result v6

    .line 30
    if-eqz v6, :cond_5

    .line 31
    .line 32
    invoke-static/range {p3 .. p3}, Lcom/discord/minibsdiff/InputStreamUtilsKt;->readOffset(Ljava/io/InputStream;)J

    .line 33
    .line 34
    .line 35
    move-result-wide v8

    .line 36
    invoke-static/range {p3 .. p3}, Lcom/discord/minibsdiff/InputStreamUtilsKt;->readOffset(Ljava/io/InputStream;)J

    .line 37
    .line 38
    .line 39
    move-result-wide v10

    .line 40
    invoke-static/range {p3 .. p3}, Lcom/discord/minibsdiff/InputStreamUtilsKt;->readOffset(Ljava/io/InputStream;)J

    .line 41
    .line 42
    .line 43
    move-result-wide v12

    .line 44
    const/16 v6, 0x20

    .line 45
    .line 46
    int-to-long v14, v6

    .line 47
    add-long/2addr v14, v8

    .line 48
    invoke-static {v1, v14, v15}, Lcom/discord/minibsdiff/InputStreamUtilsKt;->skipNBytes(Ljava/io/InputStream;J)V

    .line 49
    .line 50
    .line 51
    add-long/2addr v14, v10

    .line 52
    invoke-static {v2, v14, v15}, Lcom/discord/minibsdiff/InputStreamUtilsKt;->skipNBytes(Ljava/io/InputStream;J)V

    .line 53
    .line 54
    .line 55
    const-wide/16 v8, 0x0

    .line 56
    .line 57
    :goto_0
    cmp-long v6, v8, v12

    .line 58
    .line 59
    if-gez v6, :cond_4

    .line 60
    .line 61
    invoke-static/range {p3 .. p3}, Lcom/discord/minibsdiff/InputStreamUtilsKt;->readOffset(Ljava/io/InputStream;)J

    .line 62
    .line 63
    .line 64
    move-result-wide v10

    .line 65
    invoke-static/range {p3 .. p3}, Lcom/discord/minibsdiff/InputStreamUtilsKt;->readOffset(Ljava/io/InputStream;)J

    .line 66
    .line 67
    .line 68
    move-result-wide v14

    .line 69
    invoke-static/range {p3 .. p3}, Lcom/discord/minibsdiff/InputStreamUtilsKt;->readOffset(Ljava/io/InputStream;)J

    .line 70
    .line 71
    .line 72
    move-result-wide v16

    .line 73
    add-long v18, v8, v10

    .line 74
    .line 75
    add-long v18, v18, v14

    .line 76
    .line 77
    cmp-long v6, v18, v12

    .line 78
    .line 79
    if-gtz v6, :cond_3

    .line 80
    .line 81
    invoke-direct {v0, v10, v11}, Lcom/discord/minibsdiff/BSDiff;->chunkRange(J)Lkotlin/sequences/Sequence;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    invoke-interface {v6}, Lkotlin/sequences/Sequence;->iterator()Ljava/util/Iterator;

    .line 86
    .line 87
    .line 88
    move-result-object v6

    .line 89
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 90
    .line 91
    .line 92
    move-result v18

    .line 93
    const/4 v7, 0x0

    .line 94
    if-eqz v18, :cond_1

    .line 95
    .line 96
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v18

    .line 100
    check-cast v18, Ljava/lang/Number;

    .line 101
    .line 102
    move-object/from16 v19, v6

    .line 103
    .line 104
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Number;->intValue()I

    .line 105
    .line 106
    .line 107
    move-result v6

    .line 108
    move-wide/from16 v20, v12

    .line 109
    .line 110
    move-object/from16 v12, p2

    .line 111
    .line 112
    invoke-static {v12, v5, v7, v6}, Lcom/discord/minibsdiff/InputStreamUtilsKt;->readNBytes(Ljava/io/InputStream;[BII)I

    .line 113
    .line 114
    .line 115
    invoke-static {v1, v4, v7, v6}, Lcom/discord/minibsdiff/InputStreamUtilsKt;->readNBytes(Ljava/io/InputStream;[BII)I

    .line 116
    .line 117
    .line 118
    move v13, v7

    .line 119
    :goto_2
    if-ge v13, v6, :cond_0

    .line 120
    .line 121
    aget-byte v18, v5, v13

    .line 122
    .line 123
    aget-byte v22, v4, v13

    .line 124
    .line 125
    add-int v7, v18, v22

    .line 126
    .line 127
    int-to-byte v7, v7

    .line 128
    aput-byte v7, v5, v13

    .line 129
    .line 130
    add-int/lit8 v13, v13, 0x1

    .line 131
    .line 132
    const/4 v7, 0x0

    .line 133
    goto :goto_2

    .line 134
    :cond_0
    invoke-virtual {v3, v5, v7, v6}, Ljava/io/OutputStream;->write([BII)V

    .line 135
    .line 136
    .line 137
    move-object/from16 v7, p3

    .line 138
    .line 139
    move-object/from16 v6, v19

    .line 140
    .line 141
    move-wide/from16 v12, v20

    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_1
    move-wide/from16 v20, v12

    .line 145
    .line 146
    move-object/from16 v12, p2

    .line 147
    .line 148
    invoke-direct {v0, v14, v15}, Lcom/discord/minibsdiff/BSDiff;->chunkRange(J)Lkotlin/sequences/Sequence;

    .line 149
    .line 150
    .line 151
    move-result-object v6

    .line 152
    invoke-interface {v6}, Lkotlin/sequences/Sequence;->iterator()Ljava/util/Iterator;

    .line 153
    .line 154
    .line 155
    move-result-object v6

    .line 156
    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 157
    .line 158
    .line 159
    move-result v13

    .line 160
    if-eqz v13, :cond_2

    .line 161
    .line 162
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v13

    .line 166
    check-cast v13, Ljava/lang/Number;

    .line 167
    .line 168
    invoke-virtual {v13}, Ljava/lang/Number;->intValue()I

    .line 169
    .line 170
    .line 171
    move-result v13

    .line 172
    invoke-static {v2, v5, v7, v13}, Lcom/discord/minibsdiff/InputStreamUtilsKt;->readNBytes(Ljava/io/InputStream;[BII)I

    .line 173
    .line 174
    .line 175
    invoke-virtual {v3, v5, v7, v13}, Ljava/io/OutputStream;->write([BII)V

    .line 176
    .line 177
    .line 178
    goto :goto_3

    .line 179
    :cond_2
    invoke-virtual/range {p1 .. p1}, Ljava/io/RandomAccessFile;->getFilePointer()J

    .line 180
    .line 181
    .line 182
    move-result-wide v6

    .line 183
    add-long v6, v6, v16

    .line 184
    .line 185
    move-object/from16 v13, p1

    .line 186
    .line 187
    invoke-virtual {v13, v6, v7}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 188
    .line 189
    .line 190
    add-long/2addr v10, v14

    .line 191
    add-long/2addr v8, v10

    .line 192
    move-object/from16 v7, p3

    .line 193
    .line 194
    move-wide/from16 v12, v20

    .line 195
    .line 196
    goto/16 :goto_0

    .line 197
    .line 198
    :cond_3
    new-instance v1, Lcom/discord/minibsdiff/BSDiff$BsPatchError;

    .line 199
    .line 200
    const-string v2, "Corrupted patch, attempting to make new file that\'s too big"

    .line 201
    .line 202
    invoke-direct {v1, v2}, Lcom/discord/minibsdiff/BSDiff$BsPatchError;-><init>(Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    throw v1

    .line 206
    :cond_4
    invoke-virtual/range {p6 .. p6}, Ljava/io/OutputStream;->close()V

    .line 207
    .line 208
    .line 209
    return-void

    .line 210
    :cond_5
    new-instance v1, Lcom/discord/minibsdiff/BSDiff$BsPatchError;

    .line 211
    .line 212
    const-string v2, "Bad magic config header for patch file!"

    .line 213
    .line 214
    invoke-direct {v1, v2}, Lcom/discord/minibsdiff/BSDiff$BsPatchError;-><init>(Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    throw v1
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

.method private final chunkRange(J)Lkotlin/sequences/Sequence;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Lkotlin/sequences/Sequence<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0, p1, p2}, Lcg/h;->p(IJ)Lcg/g;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    const-wide/32 v1, 0xf4240

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1, v2}, Lcg/h;->n(Lcg/e;J)Lcg/e;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0}, Lkotlin/collections/h;->K(Ljava/lang/Iterable;)Lkotlin/sequences/Sequence;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    new-instance v1, Lcom/discord/minibsdiff/BSDiff$chunkRange$1;

    .line 18
    .line 19
    invoke-direct {v1, p1, p2}, Lcom/discord/minibsdiff/BSDiff$chunkRange$1;-><init>(J)V

    .line 20
    .line 21
    .line 22
    invoke-static {v0, v1}, Loi/j;->y(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1
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


# virtual methods
.method public final bspatchStreaming(Ljava/io/File;Ljava/io/File;Ljava/io/File;)V
    .locals 9

    .line 1
    const-string v0, "oldPath"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "patchPath"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "newPath"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v2, Ljava/io/RandomAccessFile;

    .line 17
    .line 18
    const-string v0, "r"

    .line 19
    .line 20
    invoke-direct {v2, p1, v0}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-static {v2}, Lcom/discord/minibsdiff/RandomFileAccessInputStreamKt;->inputStream(Ljava/io/RandomAccessFile;)Ljava/io/InputStream;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    new-instance v0, Ljava/io/FileInputStream;

    .line 28
    .line 29
    invoke-direct {v0, p2}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 30
    .line 31
    .line 32
    instance-of v1, v0, Ljava/io/BufferedInputStream;

    .line 33
    .line 34
    const/16 v3, 0x2000

    .line 35
    .line 36
    if-eqz v1, :cond_0

    .line 37
    .line 38
    check-cast v0, Ljava/io/BufferedInputStream;

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    new-instance v1, Ljava/io/BufferedInputStream;

    .line 42
    .line 43
    invoke-direct {v1, v0, v3}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V

    .line 44
    .line 45
    .line 46
    move-object v0, v1

    .line 47
    :goto_0
    new-instance v1, Ljava/io/FileInputStream;

    .line 48
    .line 49
    invoke-direct {v1, p2}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 50
    .line 51
    .line 52
    instance-of v4, v1, Ljava/io/BufferedInputStream;

    .line 53
    .line 54
    if-eqz v4, :cond_1

    .line 55
    .line 56
    check-cast v1, Ljava/io/BufferedInputStream;

    .line 57
    .line 58
    move-object v8, v1

    .line 59
    goto :goto_1

    .line 60
    :cond_1
    new-instance v4, Ljava/io/BufferedInputStream;

    .line 61
    .line 62
    invoke-direct {v4, v1, v3}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V

    .line 63
    .line 64
    .line 65
    move-object v8, v4

    .line 66
    :goto_1
    new-instance v1, Ljava/io/FileInputStream;

    .line 67
    .line 68
    invoke-direct {v1, p2}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 69
    .line 70
    .line 71
    instance-of p2, v1, Ljava/io/BufferedInputStream;

    .line 72
    .line 73
    if-eqz p2, :cond_2

    .line 74
    .line 75
    check-cast v1, Ljava/io/BufferedInputStream;

    .line 76
    .line 77
    move-object p2, v1

    .line 78
    goto :goto_2

    .line 79
    :cond_2
    new-instance p2, Ljava/io/BufferedInputStream;

    .line 80
    .line 81
    invoke-direct {p2, v1, v3}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V

    .line 82
    .line 83
    .line 84
    :goto_2
    new-instance v1, Ljava/io/FileOutputStream;

    .line 85
    .line 86
    invoke-direct {v1, p3}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 87
    .line 88
    .line 89
    instance-of p3, v1, Ljava/io/BufferedOutputStream;

    .line 90
    .line 91
    if-eqz p3, :cond_3

    .line 92
    .line 93
    check-cast v1, Ljava/io/BufferedOutputStream;

    .line 94
    .line 95
    move-object p3, v1

    .line 96
    goto :goto_3

    .line 97
    :cond_3
    new-instance p3, Ljava/io/BufferedOutputStream;

    .line 98
    .line 99
    invoke-direct {p3, v1, v3}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;I)V

    .line 100
    .line 101
    .line 102
    :goto_3
    :try_start_0
    sget-object v1, Lcom/discord/minibsdiff/BSDiff;->INSTANCE:Lcom/discord/minibsdiff/BSDiff;

    .line 103
    .line 104
    move-object v3, p1

    .line 105
    move-object v4, v0

    .line 106
    move-object v5, v8

    .line 107
    move-object v6, p2

    .line 108
    move-object v7, p3

    .line 109
    invoke-direct/range {v1 .. v7}, Lcom/discord/minibsdiff/BSDiff;->bspatchStreamingInner(Ljava/io/RandomAccessFile;Ljava/io/InputStream;Ljava/io/InputStream;Ljava/io/InputStream;Ljava/io/InputStream;Ljava/io/OutputStream;)V

    .line 110
    .line 111
    .line 112
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 113
    .line 114
    const/4 v1, 0x0

    .line 115
    :try_start_1
    invoke-static {p3, v1}, Lvf/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 116
    .line 117
    .line 118
    :try_start_2
    invoke-static {p2, v1}, Lvf/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    .line 119
    .line 120
    .line 121
    :try_start_3
    invoke-static {v8, v1}, Lvf/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_6

    .line 122
    .line 123
    .line 124
    :try_start_4
    invoke-static {v0, v1}, Lvf/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_8

    .line 125
    .line 126
    .line 127
    invoke-static {p1, v1}, Lvf/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 128
    .line 129
    .line 130
    return-void

    .line 131
    :catchall_0
    move-exception v1

    .line 132
    :try_start_5
    throw v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 133
    :catchall_1
    move-exception v2

    .line 134
    :try_start_6
    invoke-static {p3, v1}, Lvf/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 135
    .line 136
    .line 137
    throw v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 138
    :catchall_2
    move-exception p3

    .line 139
    :try_start_7
    throw p3
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 140
    :catchall_3
    move-exception v1

    .line 141
    :try_start_8
    invoke-static {p2, p3}, Lvf/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 142
    .line 143
    .line 144
    throw v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 145
    :catchall_4
    move-exception p2

    .line 146
    :try_start_9
    throw p2
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    .line 147
    :catchall_5
    move-exception p3

    .line 148
    :try_start_a
    invoke-static {v8, p2}, Lvf/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 149
    .line 150
    .line 151
    throw p3
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    .line 152
    :catchall_6
    move-exception p2

    .line 153
    :try_start_b
    throw p2
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_7

    .line 154
    :catchall_7
    move-exception p3

    .line 155
    :try_start_c
    invoke-static {v0, p2}, Lvf/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 156
    .line 157
    .line 158
    throw p3
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_8

    .line 159
    :catchall_8
    move-exception p2

    .line 160
    :try_start_d
    throw p2
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_9

    .line 161
    :catchall_9
    move-exception p3

    .line 162
    invoke-static {p1, p2}, Lvf/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 163
    .line 164
    .line 165
    throw p3
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
