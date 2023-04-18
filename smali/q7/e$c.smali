.class final Lq7/e$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq7/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "c"
.end annotation


# instance fields
.field public A:I

.field public B:I

.field public C:I

.field public D:F

.field public E:F

.field public F:F

.field public G:F

.field public H:F

.field public I:F

.field public J:F

.field public K:F

.field public L:F

.field public M:F

.field public N:[B

.field public O:I

.field public P:I

.field public Q:I

.field public R:J

.field public S:J

.field public T:Lq7/e$d;

.field public U:Z

.field public V:Z

.field private W:Ljava/lang/String;

.field public X:Ll7/b0;

.field public Y:I

.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field private g:I

.field public h:Z

.field public i:[B

.field public j:Ll7/b0$a;

.field public k:[B

.field public l:Lj7/l;

.field public m:I

.field public n:I

.field public o:I

.field public p:I

.field public q:I

.field public r:I

.field public s:F

.field public t:F

.field public u:F

.field public v:[B

.field public w:I

.field public x:Z

.field public y:I

.field public z:I


# direct methods
.method private constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 2
    iput v0, p0, Lq7/e$c;->m:I

    .line 3
    iput v0, p0, Lq7/e$c;->n:I

    .line 4
    iput v0, p0, Lq7/e$c;->o:I

    .line 5
    iput v0, p0, Lq7/e$c;->p:I

    const/4 v1, 0x0

    .line 6
    iput v1, p0, Lq7/e$c;->q:I

    .line 7
    iput v0, p0, Lq7/e$c;->r:I

    const/4 v2, 0x0

    .line 8
    iput v2, p0, Lq7/e$c;->s:F

    .line 9
    iput v2, p0, Lq7/e$c;->t:F

    .line 10
    iput v2, p0, Lq7/e$c;->u:F

    const/4 v2, 0x0

    .line 11
    iput-object v2, p0, Lq7/e$c;->v:[B

    .line 12
    iput v0, p0, Lq7/e$c;->w:I

    .line 13
    iput-boolean v1, p0, Lq7/e$c;->x:Z

    .line 14
    iput v0, p0, Lq7/e$c;->y:I

    .line 15
    iput v0, p0, Lq7/e$c;->z:I

    .line 16
    iput v0, p0, Lq7/e$c;->A:I

    const/16 v1, 0x3e8

    .line 17
    iput v1, p0, Lq7/e$c;->B:I

    const/16 v1, 0xc8

    .line 18
    iput v1, p0, Lq7/e$c;->C:I

    const/high16 v1, -0x40800000    # -1.0f

    .line 19
    iput v1, p0, Lq7/e$c;->D:F

    .line 20
    iput v1, p0, Lq7/e$c;->E:F

    .line 21
    iput v1, p0, Lq7/e$c;->F:F

    .line 22
    iput v1, p0, Lq7/e$c;->G:F

    .line 23
    iput v1, p0, Lq7/e$c;->H:F

    .line 24
    iput v1, p0, Lq7/e$c;->I:F

    .line 25
    iput v1, p0, Lq7/e$c;->J:F

    .line 26
    iput v1, p0, Lq7/e$c;->K:F

    .line 27
    iput v1, p0, Lq7/e$c;->L:F

    .line 28
    iput v1, p0, Lq7/e$c;->M:F

    const/4 v1, 0x1

    .line 29
    iput v1, p0, Lq7/e$c;->O:I

    .line 30
    iput v0, p0, Lq7/e$c;->P:I

    const/16 v0, 0x1f40

    .line 31
    iput v0, p0, Lq7/e$c;->Q:I

    const-wide/16 v2, 0x0

    .line 32
    iput-wide v2, p0, Lq7/e$c;->R:J

    .line 33
    iput-wide v2, p0, Lq7/e$c;->S:J

    .line 34
    iput-boolean v1, p0, Lq7/e$c;->V:Z

    const-string v0, "eng"

    .line 35
    iput-object v0, p0, Lq7/e$c;->W:Ljava/lang/String;

    return-void
.end method

.method synthetic constructor <init>(Lq7/e$a;)V
    .locals 0

    .line 36
    invoke-direct {p0}, Lq7/e$c;-><init>()V

    return-void
.end method

.method static synthetic a(Lq7/e$c;)V
    .locals 0

    invoke-direct {p0}, Lq7/e$c;->e()V

    return-void
.end method

.method static synthetic b(Lq7/e$c;)I
    .locals 0

    iget p0, p0, Lq7/e$c;->g:I

    return p0
.end method

.method static synthetic c(Lq7/e$c;I)I
    .locals 0

    iput p1, p0, Lq7/e$c;->g:I

    return p1
.end method

.method static synthetic d(Lq7/e$c;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lq7/e$c;->W:Ljava/lang/String;

    return-object p1
.end method

.method private e()V
    .locals 1

    iget-object v0, p0, Lq7/e$c;->X:Ll7/b0;

    invoke-static {v0}, Lf9/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private f(Ljava/lang/String;)[B
    .locals 3

    .line 1
    iget-object v0, p0, Lq7/e$c;->k:[B

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    new-instance v0, Ld7/o;

    .line 7
    .line 8
    new-instance v1, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 11
    .line 12
    .line 13
    const-string v2, "Missing CodecPrivate for codec "

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-direct {v0, p1}, Ld7/o;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw v0
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

.method private g()[B
    .locals 5

    .line 1
    iget v0, p0, Lq7/e$c;->D:F

    .line 2
    .line 3
    const/high16 v1, -0x40800000    # -1.0f

    .line 4
    .line 5
    cmpl-float v0, v0, v1

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget v0, p0, Lq7/e$c;->E:F

    .line 10
    .line 11
    cmpl-float v0, v0, v1

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget v0, p0, Lq7/e$c;->F:F

    .line 16
    .line 17
    cmpl-float v0, v0, v1

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    iget v0, p0, Lq7/e$c;->G:F

    .line 22
    .line 23
    cmpl-float v0, v0, v1

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    iget v0, p0, Lq7/e$c;->H:F

    .line 28
    .line 29
    cmpl-float v0, v0, v1

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    iget v0, p0, Lq7/e$c;->I:F

    .line 34
    .line 35
    cmpl-float v0, v0, v1

    .line 36
    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    iget v0, p0, Lq7/e$c;->J:F

    .line 40
    .line 41
    cmpl-float v0, v0, v1

    .line 42
    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    iget v0, p0, Lq7/e$c;->K:F

    .line 46
    .line 47
    cmpl-float v0, v0, v1

    .line 48
    .line 49
    if-eqz v0, :cond_1

    .line 50
    .line 51
    iget v0, p0, Lq7/e$c;->L:F

    .line 52
    .line 53
    cmpl-float v0, v0, v1

    .line 54
    .line 55
    if-eqz v0, :cond_1

    .line 56
    .line 57
    iget v0, p0, Lq7/e$c;->M:F

    .line 58
    .line 59
    cmpl-float v0, v0, v1

    .line 60
    .line 61
    if-nez v0, :cond_0

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_0
    const/16 v0, 0x19

    .line 65
    .line 66
    new-array v0, v0, [B

    .line 67
    .line 68
    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    sget-object v2, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 73
    .line 74
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    const/4 v2, 0x0

    .line 79
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 80
    .line 81
    .line 82
    iget v2, p0, Lq7/e$c;->D:F

    .line 83
    .line 84
    const v3, 0x47435000    # 50000.0f

    .line 85
    .line 86
    .line 87
    mul-float/2addr v2, v3

    .line 88
    const/high16 v4, 0x3f000000    # 0.5f

    .line 89
    .line 90
    add-float/2addr v2, v4

    .line 91
    float-to-int v2, v2

    .line 92
    int-to-short v2, v2

    .line 93
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 94
    .line 95
    .line 96
    iget v2, p0, Lq7/e$c;->E:F

    .line 97
    .line 98
    mul-float/2addr v2, v3

    .line 99
    add-float/2addr v2, v4

    .line 100
    float-to-int v2, v2

    .line 101
    int-to-short v2, v2

    .line 102
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 103
    .line 104
    .line 105
    iget v2, p0, Lq7/e$c;->F:F

    .line 106
    .line 107
    mul-float/2addr v2, v3

    .line 108
    add-float/2addr v2, v4

    .line 109
    float-to-int v2, v2

    .line 110
    int-to-short v2, v2

    .line 111
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 112
    .line 113
    .line 114
    iget v2, p0, Lq7/e$c;->G:F

    .line 115
    .line 116
    mul-float/2addr v2, v3

    .line 117
    add-float/2addr v2, v4

    .line 118
    float-to-int v2, v2

    .line 119
    int-to-short v2, v2

    .line 120
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 121
    .line 122
    .line 123
    iget v2, p0, Lq7/e$c;->H:F

    .line 124
    .line 125
    mul-float/2addr v2, v3

    .line 126
    add-float/2addr v2, v4

    .line 127
    float-to-int v2, v2

    .line 128
    int-to-short v2, v2

    .line 129
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 130
    .line 131
    .line 132
    iget v2, p0, Lq7/e$c;->I:F

    .line 133
    .line 134
    mul-float/2addr v2, v3

    .line 135
    add-float/2addr v2, v4

    .line 136
    float-to-int v2, v2

    .line 137
    int-to-short v2, v2

    .line 138
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 139
    .line 140
    .line 141
    iget v2, p0, Lq7/e$c;->J:F

    .line 142
    .line 143
    mul-float/2addr v2, v3

    .line 144
    add-float/2addr v2, v4

    .line 145
    float-to-int v2, v2

    .line 146
    int-to-short v2, v2

    .line 147
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 148
    .line 149
    .line 150
    iget v2, p0, Lq7/e$c;->K:F

    .line 151
    .line 152
    mul-float/2addr v2, v3

    .line 153
    add-float/2addr v2, v4

    .line 154
    float-to-int v2, v2

    .line 155
    int-to-short v2, v2

    .line 156
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 157
    .line 158
    .line 159
    iget v2, p0, Lq7/e$c;->L:F

    .line 160
    .line 161
    add-float/2addr v2, v4

    .line 162
    float-to-int v2, v2

    .line 163
    int-to-short v2, v2

    .line 164
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 165
    .line 166
    .line 167
    iget v2, p0, Lq7/e$c;->M:F

    .line 168
    .line 169
    add-float/2addr v2, v4

    .line 170
    float-to-int v2, v2

    .line 171
    int-to-short v2, v2

    .line 172
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 173
    .line 174
    .line 175
    iget v2, p0, Lq7/e$c;->B:I

    .line 176
    .line 177
    int-to-short v2, v2

    .line 178
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 179
    .line 180
    .line 181
    iget v2, p0, Lq7/e$c;->C:I

    .line 182
    .line 183
    int-to-short v2, v2

    .line 184
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 185
    .line 186
    .line 187
    return-object v0

    .line 188
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 189
    return-object v0
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
.end method

.method private static j(Lf9/y;)Landroid/util/Pair;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf9/y;",
            ")",
            "Landroid/util/Pair<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "[B>;>;"
        }
    .end annotation

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    :try_start_0
    invoke-virtual {p0, v0}, Lf9/y;->Q(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lf9/y;->t()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    const-wide/32 v2, 0x58564944

    .line 11
    .line 12
    .line 13
    cmp-long v2, v0, v2

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    if-nez v2, :cond_0

    .line 17
    .line 18
    new-instance p0, Landroid/util/Pair;

    .line 19
    .line 20
    const-string v0, "video/divx"

    .line 21
    .line 22
    invoke-direct {p0, v0, v3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    return-object p0

    .line 26
    :cond_0
    const-wide/32 v4, 0x33363248

    .line 27
    .line 28
    .line 29
    cmp-long v2, v0, v4

    .line 30
    .line 31
    if-nez v2, :cond_1

    .line 32
    .line 33
    new-instance p0, Landroid/util/Pair;

    .line 34
    .line 35
    const-string v0, "video/3gpp"

    .line 36
    .line 37
    invoke-direct {p0, v0, v3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    return-object p0

    .line 41
    :cond_1
    const-wide/32 v4, 0x31435657

    .line 42
    .line 43
    .line 44
    cmp-long v0, v0, v4

    .line 45
    .line 46
    if-nez v0, :cond_4

    .line 47
    .line 48
    invoke-virtual {p0}, Lf9/y;->e()I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    add-int/lit8 v0, v0, 0x14

    .line 53
    .line 54
    invoke-virtual {p0}, Lf9/y;->d()[B

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    :goto_0
    array-length v1, p0

    .line 59
    add-int/lit8 v1, v1, -0x4

    .line 60
    .line 61
    if-ge v0, v1, :cond_3

    .line 62
    .line 63
    aget-byte v1, p0, v0

    .line 64
    .line 65
    if-nez v1, :cond_2

    .line 66
    .line 67
    add-int/lit8 v1, v0, 0x1

    .line 68
    .line 69
    aget-byte v1, p0, v1

    .line 70
    .line 71
    if-nez v1, :cond_2

    .line 72
    .line 73
    add-int/lit8 v1, v0, 0x2

    .line 74
    .line 75
    aget-byte v1, p0, v1

    .line 76
    .line 77
    const/4 v2, 0x1

    .line 78
    if-ne v1, v2, :cond_2

    .line 79
    .line 80
    add-int/lit8 v1, v0, 0x3

    .line 81
    .line 82
    aget-byte v1, p0, v1

    .line 83
    .line 84
    const/16 v2, 0xf

    .line 85
    .line 86
    if-ne v1, v2, :cond_2

    .line 87
    .line 88
    array-length v1, p0

    .line 89
    invoke-static {p0, v0, v1}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    new-instance v0, Landroid/util/Pair;

    .line 94
    .line 95
    const-string v1, "video/wvc1"

    .line 96
    .line 97
    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    invoke-direct {v0, v1, p0}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    return-object v0

    .line 105
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_3
    new-instance p0, Ld7/o;

    .line 109
    .line 110
    const-string v0, "Failed to find FourCC VC1 initialization data"

    .line 111
    .line 112
    invoke-direct {p0, v0}, Ld7/o;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    throw p0
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 116
    :cond_4
    const-string p0, "MatroskaExtractor"

    .line 117
    .line 118
    const-string v0, "Unknown FourCC. Setting mimeType to video/x-unknown"

    .line 119
    .line 120
    invoke-static {p0, v0}, Lf9/r;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    new-instance p0, Landroid/util/Pair;

    .line 124
    .line 125
    const-string v0, "video/x-unknown"

    .line 126
    .line 127
    invoke-direct {p0, v0, v3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    return-object p0

    .line 131
    :catch_0
    new-instance p0, Ld7/o;

    .line 132
    .line 133
    const-string v0, "Error parsing FourCC private data"

    .line 134
    .line 135
    invoke-direct {p0, v0}, Ld7/o;-><init>(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    throw p0
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
.end method

.method private static k(Lf9/y;)Z
    .locals 8

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lf9/y;->v()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    const v2, 0xfffe

    .line 10
    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    if-ne v0, v2, :cond_2

    .line 14
    .line 15
    const/16 v0, 0x18

    .line 16
    .line 17
    invoke-virtual {p0, v0}, Lf9/y;->P(I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lf9/y;->w()J

    .line 21
    .line 22
    .line 23
    move-result-wide v4

    .line 24
    invoke-static {}, Lq7/e;->g()Ljava/util/UUID;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0}, Ljava/util/UUID;->getMostSignificantBits()J

    .line 29
    .line 30
    .line 31
    move-result-wide v6

    .line 32
    cmp-long v0, v4, v6

    .line 33
    .line 34
    if-nez v0, :cond_1

    .line 35
    .line 36
    invoke-virtual {p0}, Lf9/y;->w()J

    .line 37
    .line 38
    .line 39
    move-result-wide v4

    .line 40
    invoke-static {}, Lq7/e;->g()Ljava/util/UUID;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-virtual {p0}, Ljava/util/UUID;->getLeastSignificantBits()J

    .line 45
    .line 46
    .line 47
    move-result-wide v6
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 48
    cmp-long p0, v4, v6

    .line 49
    .line 50
    if-nez p0, :cond_1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    move v1, v3

    .line 54
    :goto_0
    return v1

    .line 55
    :cond_2
    return v3

    .line 56
    :catch_0
    new-instance p0, Ld7/o;

    .line 57
    .line 58
    const-string v0, "Error parsing MS/ACM codec private"

    .line 59
    .line 60
    invoke-direct {p0, v0}, Ld7/o;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw p0
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

.method private static l([B)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B)",
            "Ljava/util/List<",
            "[B>;"
        }
    .end annotation

    .line 1
    const-string v0, "Error parsing vorbis codec private"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    aget-byte v2, p0, v1

    .line 5
    .line 6
    const/4 v3, 0x2

    .line 7
    if-ne v2, v3, :cond_5

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    move v5, v1

    .line 11
    move v4, v2

    .line 12
    :goto_0
    aget-byte v6, p0, v4

    .line 13
    .line 14
    and-int/lit16 v7, v6, 0xff

    .line 15
    .line 16
    const/16 v8, 0xff

    .line 17
    .line 18
    if-ne v7, v8, :cond_0

    .line 19
    .line 20
    add-int/lit16 v5, v5, 0xff

    .line 21
    .line 22
    add-int/lit8 v4, v4, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    add-int/2addr v4, v2

    .line 26
    and-int/2addr v6, v8

    .line 27
    add-int/2addr v5, v6

    .line 28
    move v6, v1

    .line 29
    :goto_1
    aget-byte v7, p0, v4

    .line 30
    .line 31
    and-int/lit16 v9, v7, 0xff

    .line 32
    .line 33
    if-ne v9, v8, :cond_1

    .line 34
    .line 35
    add-int/lit16 v6, v6, 0xff

    .line 36
    .line 37
    add-int/lit8 v4, v4, 0x1

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    add-int/2addr v4, v2

    .line 41
    and-int/2addr v7, v8

    .line 42
    add-int/2addr v6, v7

    .line 43
    aget-byte v7, p0, v4

    .line 44
    .line 45
    if-ne v7, v2, :cond_4

    .line 46
    .line 47
    new-array v2, v5, [B

    .line 48
    .line 49
    invoke-static {p0, v4, v2, v1, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 50
    .line 51
    .line 52
    add-int/2addr v4, v5

    .line 53
    aget-byte v5, p0, v4

    .line 54
    .line 55
    const/4 v7, 0x3

    .line 56
    if-ne v5, v7, :cond_3

    .line 57
    .line 58
    add-int/2addr v4, v6

    .line 59
    aget-byte v5, p0, v4

    .line 60
    .line 61
    const/4 v6, 0x5

    .line 62
    if-ne v5, v6, :cond_2

    .line 63
    .line 64
    array-length v5, p0

    .line 65
    sub-int/2addr v5, v4

    .line 66
    new-array v5, v5, [B

    .line 67
    .line 68
    array-length v6, p0

    .line 69
    sub-int/2addr v6, v4

    .line 70
    invoke-static {p0, v4, v5, v1, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 71
    .line 72
    .line 73
    new-instance p0, Ljava/util/ArrayList;

    .line 74
    .line 75
    invoke-direct {p0, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 76
    .line 77
    .line 78
    invoke-interface {p0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    invoke-interface {p0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    return-object p0

    .line 85
    :cond_2
    new-instance p0, Ld7/o;

    .line 86
    .line 87
    invoke-direct {p0, v0}, Ld7/o;-><init>(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    throw p0

    .line 91
    :cond_3
    new-instance p0, Ld7/o;

    .line 92
    .line 93
    invoke-direct {p0, v0}, Ld7/o;-><init>(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    throw p0

    .line 97
    :cond_4
    new-instance p0, Ld7/o;

    .line 98
    .line 99
    invoke-direct {p0, v0}, Ld7/o;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    throw p0

    .line 103
    :cond_5
    new-instance p0, Ld7/o;

    .line 104
    .line 105
    invoke-direct {p0, v0}, Ld7/o;-><init>(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    throw p0
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 109
    :catch_0
    new-instance p0, Ld7/o;

    .line 110
    .line 111
    invoke-direct {p0, v0}, Ld7/o;-><init>(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    throw p0
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


# virtual methods
.method public h(Ll7/k;I)V
    .locals 20

    move-object/from16 v0, p0

    .line 1
    iget-object v1, v0, Lq7/e$c;->b:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    const/16 v3, 0x10

    const/16 v6, 0x8

    const/4 v7, 0x4

    const/4 v8, 0x3

    const/4 v9, 0x0

    sparse-switch v2, :sswitch_data_0

    :goto_0
    const/4 v1, -0x1

    goto/16 :goto_1

    :sswitch_0
    const-string v2, "A_OPUS"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/16 v1, 0x1f

    goto/16 :goto_1

    :sswitch_1
    const-string v2, "A_FLAC"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    const/16 v1, 0x1e

    goto/16 :goto_1

    :sswitch_2
    const-string v2, "A_EAC3"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    const/16 v1, 0x1d

    goto/16 :goto_1

    :sswitch_3
    const-string v2, "V_MPEG2"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_0

    :cond_3
    const/16 v1, 0x1c

    goto/16 :goto_1

    :sswitch_4
    const-string v2, "S_TEXT/UTF8"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_0

    :cond_4
    const/16 v1, 0x1b

    goto/16 :goto_1

    :sswitch_5
    const-string v2, "V_MPEGH/ISO/HEVC"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    goto :goto_0

    :cond_5
    const/16 v1, 0x1a

    goto/16 :goto_1

    :sswitch_6
    const-string v2, "S_TEXT/ASS"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    goto :goto_0

    :cond_6
    const/16 v1, 0x19

    goto/16 :goto_1

    :sswitch_7
    const-string v2, "A_PCM/INT/LIT"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    goto :goto_0

    :cond_7
    const/16 v1, 0x18

    goto/16 :goto_1

    :sswitch_8
    const-string v2, "A_PCM/INT/BIG"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    goto :goto_0

    :cond_8
    const/16 v1, 0x17

    goto/16 :goto_1

    :sswitch_9
    const-string v2, "A_PCM/FLOAT/IEEE"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    goto/16 :goto_0

    :cond_9
    const/16 v1, 0x16

    goto/16 :goto_1

    :sswitch_a
    const-string v2, "A_DTS/EXPRESS"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    goto/16 :goto_0

    :cond_a
    const/16 v1, 0x15

    goto/16 :goto_1

    :sswitch_b
    const-string v2, "V_THEORA"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    goto/16 :goto_0

    :cond_b
    const/16 v1, 0x14

    goto/16 :goto_1

    :sswitch_c
    const-string v2, "S_HDMV/PGS"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    goto/16 :goto_0

    :cond_c
    const/16 v1, 0x13

    goto/16 :goto_1

    :sswitch_d
    const-string v2, "V_VP9"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    goto/16 :goto_0

    :cond_d
    const/16 v1, 0x12

    goto/16 :goto_1

    :sswitch_e
    const-string v2, "V_VP8"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    goto/16 :goto_0

    :cond_e
    const/16 v1, 0x11

    goto/16 :goto_1

    :sswitch_f
    const-string v2, "V_AV1"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    goto/16 :goto_0

    :cond_f
    move v1, v3

    goto/16 :goto_1

    :sswitch_10
    const-string v2, "A_DTS"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    goto/16 :goto_0

    :cond_10
    const/16 v1, 0xf

    goto/16 :goto_1

    :sswitch_11
    const-string v2, "A_AC3"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    goto/16 :goto_0

    :cond_11
    const/16 v1, 0xe

    goto/16 :goto_1

    :sswitch_12
    const-string v2, "A_AAC"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    goto/16 :goto_0

    :cond_12
    const/16 v1, 0xd

    goto/16 :goto_1

    :sswitch_13
    const-string v2, "A_DTS/LOSSLESS"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    goto/16 :goto_0

    :cond_13
    const/16 v1, 0xc

    goto/16 :goto_1

    :sswitch_14
    const-string v2, "S_VOBSUB"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_14

    goto/16 :goto_0

    :cond_14
    const/16 v1, 0xb

    goto/16 :goto_1

    :sswitch_15
    const-string v2, "V_MPEG4/ISO/AVC"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    goto/16 :goto_0

    :cond_15
    const/16 v1, 0xa

    goto/16 :goto_1

    :sswitch_16
    const-string v2, "V_MPEG4/ISO/ASP"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_16

    goto/16 :goto_0

    :cond_16
    const/16 v1, 0x9

    goto/16 :goto_1

    :sswitch_17
    const-string v2, "S_DVBSUB"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    goto/16 :goto_0

    :cond_17
    move v1, v6

    goto/16 :goto_1

    :sswitch_18
    const-string v2, "V_MS/VFW/FOURCC"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_18

    goto/16 :goto_0

    :cond_18
    const/4 v1, 0x7

    goto :goto_1

    :sswitch_19
    const-string v2, "A_MPEG/L3"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_19

    goto/16 :goto_0

    :cond_19
    const/4 v1, 0x6

    goto :goto_1

    :sswitch_1a
    const-string v2, "A_MPEG/L2"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1a

    goto/16 :goto_0

    :cond_1a
    const/4 v1, 0x5

    goto :goto_1

    :sswitch_1b
    const-string v2, "A_VORBIS"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1b

    goto/16 :goto_0

    :cond_1b
    move v1, v7

    goto :goto_1

    :sswitch_1c
    const-string v2, "A_TRUEHD"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1c

    goto/16 :goto_0

    :cond_1c
    move v1, v8

    goto :goto_1

    :sswitch_1d
    const-string v2, "A_MS/ACM"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1d

    goto/16 :goto_0

    :cond_1d
    const/4 v1, 0x2

    goto :goto_1

    :sswitch_1e
    const-string v2, "V_MPEG4/ISO/SP"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1e

    goto/16 :goto_0

    :cond_1e
    const/4 v1, 0x1

    goto :goto_1

    :sswitch_1f
    const-string v2, "V_MPEG4/ISO/AP"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1f

    goto/16 :goto_0

    :cond_1f
    move v1, v9

    :goto_1
    const-string v2, "application/dvbsubs"

    const-string v11, "application/pgs"

    const-string v12, "application/vobsub"

    const-string v13, "text/x-ssa"

    const-string v14, "application/x-subrip"

    const-string v4, ". Setting mimeType to "

    const-string v16, "audio/raw"

    const-string v5, "MatroskaExtractor"

    const-string v15, "audio/x-unknown"

    const/16 v17, 0x0

    packed-switch v1, :pswitch_data_0

    .line 2
    new-instance v1, Ld7/o;

    const-string v2, "Unrecognized codec identifier."

    invoke-direct {v1, v2}, Ld7/o;-><init>(Ljava/lang/String;)V

    throw v1

    .line 3
    :pswitch_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 4
    iget-object v3, v0, Lq7/e$c;->b:Ljava/lang/String;

    invoke-direct {v0, v3}, Lq7/e$c;->f(Ljava/lang/String;)[B

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 5
    invoke-static {v6}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v3

    sget-object v4, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v3, v4}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v3

    move-object/from16 v18, v11

    iget-wide v10, v0, Lq7/e$c;->R:J

    invoke-virtual {v3, v10, v11}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v3

    .line 6
    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 7
    invoke-static {v6}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v3

    invoke-virtual {v3, v4}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v3

    iget-wide v4, v0, Lq7/e$c;->S:J

    invoke-virtual {v3, v4, v5}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v3

    .line 8
    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string v16, "audio/opus"

    const/16 v15, 0x1680

    goto/16 :goto_9

    :pswitch_1
    move-object/from16 v18, v11

    .line 9
    iget-object v1, v0, Lq7/e$c;->b:Ljava/lang/String;

    invoke-direct {v0, v1}, Lq7/e$c;->f(Ljava/lang/String;)[B

    move-result-object v1

    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const-string v16, "audio/flac"

    goto/16 :goto_7

    :pswitch_2
    move-object/from16 v18, v11

    const-string v16, "audio/eac3"

    goto/16 :goto_3

    :pswitch_3
    move-object/from16 v18, v11

    const-string v16, "video/mpeg2"

    goto/16 :goto_3

    :pswitch_4
    move-object/from16 v18, v11

    move-object/from16 v16, v14

    goto/16 :goto_3

    :pswitch_5
    move-object/from16 v18, v11

    .line 10
    new-instance v1, Lf9/y;

    iget-object v3, v0, Lq7/e$c;->b:Ljava/lang/String;

    invoke-direct {v0, v3}, Lq7/e$c;->f(Ljava/lang/String;)[B

    move-result-object v3

    invoke-direct {v1, v3}, Lf9/y;-><init>([B)V

    invoke-static {v1}, Lg9/f;->a(Lf9/y;)Lg9/f;

    move-result-object v1

    .line 11
    iget-object v3, v1, Lg9/f;->a:Ljava/util/List;

    .line 12
    iget v4, v1, Lg9/f;->b:I

    iput v4, v0, Lq7/e$c;->Y:I

    .line 13
    iget-object v1, v1, Lg9/f;->c:Ljava/lang/String;

    const-string v16, "video/hevc"

    goto/16 :goto_6

    :pswitch_6
    move-object/from16 v18, v11

    .line 14
    invoke-static {}, Lq7/e;->d()[B

    move-result-object v1

    iget-object v3, v0, Lq7/e$c;->b:Ljava/lang/String;

    invoke-direct {v0, v3}, Lq7/e$c;->f(Ljava/lang/String;)[B

    move-result-object v3

    invoke-static {v1, v3}, Lbc/i0;->z(Ljava/lang/Object;Ljava/lang/Object;)Lbc/i0;

    move-result-object v1

    move-object/from16 v16, v13

    goto/16 :goto_7

    :pswitch_7
    move-object/from16 v18, v11

    .line 15
    iget v1, v0, Lq7/e$c;->P:I

    invoke-static {v1}, Lf9/q0;->a0(I)I

    move-result v7

    if-nez v7, :cond_20

    .line 16
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unsupported little endian PCM bit depth: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, v0, Lq7/e$c;->P:I

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v5, v1}, Lf9/r;->h(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_a

    :cond_20
    :goto_2
    move-object/from16 v1, v17

    move-object v3, v1

    goto/16 :goto_5

    :pswitch_8
    move-object/from16 v18, v11

    .line 17
    iget v1, v0, Lq7/e$c;->P:I

    if-ne v1, v6, :cond_21

    move v7, v8

    goto :goto_2

    :cond_21
    if-ne v1, v3, :cond_22

    const/high16 v7, 0x10000000

    goto :goto_2

    .line 18
    :cond_22
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unsupported big endian PCM bit depth: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, v0, Lq7/e$c;->P:I

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v5, v1}, Lf9/r;->h(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_a

    :pswitch_9
    move-object/from16 v18, v11

    .line 19
    iget v1, v0, Lq7/e$c;->P:I

    const/16 v3, 0x20

    if-ne v1, v3, :cond_23

    goto :goto_2

    .line 20
    :cond_23
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unsupported floating point PCM bit depth: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, v0, Lq7/e$c;->P:I

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v5, v1}, Lf9/r;->h(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_a

    :pswitch_a
    move-object/from16 v18, v11

    const-string v16, "video/x-unknown"

    goto :goto_3

    :pswitch_b
    move-object/from16 v18, v11

    move-object/from16 v1, v17

    move-object v3, v1

    move-object/from16 v16, v18

    goto :goto_4

    :pswitch_c
    move-object/from16 v18, v11

    const-string v16, "video/x-vnd.on2.vp9"

    goto :goto_3

    :pswitch_d
    move-object/from16 v18, v11

    const-string v16, "video/x-vnd.on2.vp8"

    :goto_3
    move-object/from16 v1, v17

    move-object v3, v1

    :goto_4
    const/4 v7, -0x1

    :goto_5
    const/4 v15, -0x1

    goto/16 :goto_c

    :pswitch_e
    move-object/from16 v18, v11

    const-string v16, "video/av01"

    goto :goto_3

    :pswitch_f
    move-object/from16 v18, v11

    const-string v16, "audio/vnd.dts"

    goto :goto_3

    :pswitch_10
    move-object/from16 v18, v11

    const-string v16, "audio/ac3"

    goto :goto_3

    :pswitch_11
    move-object/from16 v18, v11

    .line 21
    iget-object v1, v0, Lq7/e$c;->b:Ljava/lang/String;

    invoke-direct {v0, v1}, Lq7/e$c;->f(Ljava/lang/String;)[B

    move-result-object v1

    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 22
    iget-object v3, v0, Lq7/e$c;->k:[B

    invoke-static {v3}, Lf7/a;->g([B)Lf7/a$b;

    move-result-object v3

    .line 23
    iget v4, v3, Lf7/a$b;->a:I

    iput v4, v0, Lq7/e$c;->Q:I

    .line 24
    iget v4, v3, Lf7/a$b;->b:I

    iput v4, v0, Lq7/e$c;->O:I

    .line 25
    iget-object v3, v3, Lf7/a$b;->c:Ljava/lang/String;

    const-string v16, "audio/mp4a-latm"

    goto :goto_4

    :pswitch_12
    move-object/from16 v18, v11

    const-string v16, "audio/vnd.dts.hd"

    goto :goto_3

    :pswitch_13
    move-object/from16 v18, v11

    .line 26
    iget-object v1, v0, Lq7/e$c;->b:Ljava/lang/String;

    invoke-direct {v0, v1}, Lq7/e$c;->f(Ljava/lang/String;)[B

    move-result-object v1

    invoke-static {v1}, Lbc/i0;->y(Ljava/lang/Object;)Lbc/i0;

    move-result-object v1

    move-object/from16 v16, v12

    goto :goto_7

    :pswitch_14
    move-object/from16 v18, v11

    .line 27
    new-instance v1, Lf9/y;

    iget-object v3, v0, Lq7/e$c;->b:Ljava/lang/String;

    invoke-direct {v0, v3}, Lq7/e$c;->f(Ljava/lang/String;)[B

    move-result-object v3

    invoke-direct {v1, v3}, Lf9/y;-><init>([B)V

    invoke-static {v1}, Lg9/a;->b(Lf9/y;)Lg9/a;

    move-result-object v1

    .line 28
    iget-object v3, v1, Lg9/a;->a:Ljava/util/List;

    .line 29
    iget v4, v1, Lg9/a;->b:I

    iput v4, v0, Lq7/e$c;->Y:I

    .line 30
    iget-object v1, v1, Lg9/a;->f:Ljava/lang/String;

    const-string v16, "video/avc"

    :goto_6
    const/4 v7, -0x1

    const/4 v15, -0x1

    move-object/from16 v19, v3

    move-object v3, v1

    move-object/from16 v1, v19

    goto/16 :goto_c

    :pswitch_15
    move-object/from16 v18, v11

    new-array v1, v7, [B

    .line 31
    iget-object v3, v0, Lq7/e$c;->b:Ljava/lang/String;

    invoke-direct {v0, v3}, Lq7/e$c;->f(Ljava/lang/String;)[B

    move-result-object v3

    invoke-static {v3, v9, v1, v9, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 32
    invoke-static {v1}, Lbc/i0;->y(Ljava/lang/Object;)Lbc/i0;

    move-result-object v1

    move-object/from16 v16, v2

    goto :goto_7

    :pswitch_16
    move-object/from16 v18, v11

    .line 33
    new-instance v1, Lf9/y;

    iget-object v3, v0, Lq7/e$c;->b:Ljava/lang/String;

    .line 34
    invoke-direct {v0, v3}, Lq7/e$c;->f(Ljava/lang/String;)[B

    move-result-object v3

    invoke-direct {v1, v3}, Lf9/y;-><init>([B)V

    invoke-static {v1}, Lq7/e$c;->j(Lf9/y;)Landroid/util/Pair;

    move-result-object v1

    .line 35
    iget-object v3, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    move-object/from16 v16, v3

    check-cast v16, Ljava/lang/String;

    .line 36
    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    :goto_7
    move-object/from16 v3, v17

    goto/16 :goto_4

    :pswitch_17
    move-object/from16 v18, v11

    const-string v16, "audio/mpeg"

    goto :goto_8

    :pswitch_18
    move-object/from16 v18, v11

    const-string v16, "audio/mpeg-L2"

    :goto_8
    move-object/from16 v1, v17

    move-object v3, v1

    const/4 v7, -0x1

    const/16 v15, 0x1000

    goto/16 :goto_c

    :pswitch_19
    move-object/from16 v18, v11

    .line 37
    iget-object v1, v0, Lq7/e$c;->b:Ljava/lang/String;

    invoke-direct {v0, v1}, Lq7/e$c;->f(Ljava/lang/String;)[B

    move-result-object v1

    invoke-static {v1}, Lq7/e$c;->l([B)Ljava/util/List;

    move-result-object v1

    const-string v16, "audio/vorbis"

    const/16 v15, 0x2000

    :goto_9
    move-object/from16 v3, v17

    const/4 v7, -0x1

    goto/16 :goto_c

    :pswitch_1a
    move-object/from16 v18, v11

    .line 38
    new-instance v1, Lq7/e$d;

    invoke-direct {v1}, Lq7/e$d;-><init>()V

    iput-object v1, v0, Lq7/e$c;->T:Lq7/e$d;

    const-string v16, "audio/true-hd"

    goto/16 :goto_3

    :pswitch_1b
    move-object/from16 v18, v11

    .line 39
    new-instance v1, Lf9/y;

    iget-object v3, v0, Lq7/e$c;->b:Ljava/lang/String;

    invoke-direct {v0, v3}, Lq7/e$c;->f(Ljava/lang/String;)[B

    move-result-object v3

    invoke-direct {v1, v3}, Lf9/y;-><init>([B)V

    invoke-static {v1}, Lq7/e$c;->k(Lf9/y;)Z

    move-result v1

    if-eqz v1, :cond_24

    .line 40
    iget v1, v0, Lq7/e$c;->P:I

    invoke-static {v1}, Lf9/q0;->a0(I)I

    move-result v7

    if-nez v7, :cond_20

    .line 41
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unsupported PCM bit depth: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, v0, Lq7/e$c;->P:I

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v5, v1}, Lf9/r;->h(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_a

    .line 42
    :cond_24
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Non-PCM MS/ACM is unsupported. Setting mimeType to "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v5, v1}, Lf9/r;->h(Ljava/lang/String;Ljava/lang/String;)V

    :goto_a
    move-object/from16 v16, v15

    goto/16 :goto_3

    :pswitch_1c
    move-object/from16 v18, v11

    .line 43
    iget-object v1, v0, Lq7/e$c;->k:[B

    if-nez v1, :cond_25

    move-object/from16 v1, v17

    goto :goto_b

    :cond_25
    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    :goto_b
    const-string v16, "video/mp4v-es"

    goto/16 :goto_7

    .line 44
    :goto_c
    iget-object v4, v0, Lq7/e$c;->N:[B

    if-eqz v4, :cond_26

    .line 45
    new-instance v5, Lf9/y;

    invoke-direct {v5, v4}, Lf9/y;-><init>([B)V

    .line 46
    invoke-static {v5}, Lg9/c;->a(Lf9/y;)Lg9/c;

    move-result-object v4

    if-eqz v4, :cond_26

    .line 47
    iget-object v3, v4, Lg9/c;->c:Ljava/lang/String;

    const-string v16, "video/dolby-vision"

    :cond_26
    move-object/from16 v4, v16

    .line 48
    iget-boolean v5, v0, Lq7/e$c;->V:Z

    or-int/2addr v5, v9

    .line 49
    iget-boolean v6, v0, Lq7/e$c;->U:Z

    if-eqz v6, :cond_27

    const/4 v6, 0x2

    goto :goto_d

    :cond_27
    move v6, v9

    :goto_d
    or-int/2addr v5, v6

    .line 50
    new-instance v6, Ld7/k$b;

    invoke-direct {v6}, Ld7/k$b;-><init>()V

    .line 51
    invoke-static {v4}, Lf9/u;->p(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_28

    .line 52
    iget v2, v0, Lq7/e$c;->O:I

    .line 53
    invoke-virtual {v6, v2}, Ld7/k$b;->H(I)Ld7/k$b;

    move-result-object v2

    iget v8, v0, Lq7/e$c;->Q:I

    .line 54
    invoke-virtual {v2, v8}, Ld7/k$b;->f0(I)Ld7/k$b;

    move-result-object v2

    .line 55
    invoke-virtual {v2, v7}, Ld7/k$b;->Y(I)Ld7/k$b;

    const/4 v8, 0x1

    goto/16 :goto_13

    .line 56
    :cond_28
    invoke-static {v4}, Lf9/u;->s(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_34

    .line 57
    iget v2, v0, Lq7/e$c;->q:I

    if-nez v2, :cond_2b

    .line 58
    iget v2, v0, Lq7/e$c;->o:I

    const/4 v7, -0x1

    if-ne v2, v7, :cond_29

    iget v2, v0, Lq7/e$c;->m:I

    :cond_29
    iput v2, v0, Lq7/e$c;->o:I

    .line 59
    iget v2, v0, Lq7/e$c;->p:I

    if-ne v2, v7, :cond_2a

    iget v2, v0, Lq7/e$c;->n:I

    :cond_2a
    iput v2, v0, Lq7/e$c;->p:I

    goto :goto_e

    :cond_2b
    const/4 v7, -0x1

    .line 60
    :goto_e
    iget v2, v0, Lq7/e$c;->o:I

    if-eq v2, v7, :cond_2c

    iget v8, v0, Lq7/e$c;->p:I

    if-eq v8, v7, :cond_2c

    .line 61
    iget v10, v0, Lq7/e$c;->n:I

    mul-int/2addr v10, v2

    int-to-float v2, v10

    iget v10, v0, Lq7/e$c;->m:I

    mul-int/2addr v10, v8

    int-to-float v8, v10

    div-float/2addr v2, v8

    goto :goto_f

    :cond_2c
    const/high16 v2, -0x40800000    # -1.0f

    .line 62
    :goto_f
    iget-boolean v8, v0, Lq7/e$c;->x:Z

    if-eqz v8, :cond_2d

    .line 63
    invoke-direct/range {p0 .. p0}, Lq7/e$c;->g()[B

    move-result-object v8

    .line 64
    new-instance v10, Lg9/b;

    iget v11, v0, Lq7/e$c;->y:I

    iget v12, v0, Lq7/e$c;->A:I

    iget v13, v0, Lq7/e$c;->z:I

    invoke-direct {v10, v11, v12, v13, v8}, Lg9/b;-><init>(III[B)V

    goto :goto_10

    :cond_2d
    move-object/from16 v10, v17

    .line 65
    :goto_10
    iget-object v8, v0, Lq7/e$c;->a:Ljava/lang/String;

    if-eqz v8, :cond_2e

    invoke-static {}, Lq7/e;->e()Ljava/util/Map;

    move-result-object v8

    iget-object v11, v0, Lq7/e$c;->a:Ljava/lang/String;

    invoke-interface {v8, v11}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2e

    .line 66
    invoke-static {}, Lq7/e;->e()Ljava/util/Map;

    move-result-object v7

    iget-object v8, v0, Lq7/e$c;->a:Ljava/lang/String;

    invoke-interface {v7, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    .line 67
    :cond_2e
    iget v8, v0, Lq7/e$c;->r:I

    if-nez v8, :cond_33

    iget v8, v0, Lq7/e$c;->s:F

    const/4 v11, 0x0

    .line 68
    invoke-static {v8, v11}, Ljava/lang/Float;->compare(FF)I

    move-result v8

    if-nez v8, :cond_33

    iget v8, v0, Lq7/e$c;->t:F

    .line 69
    invoke-static {v8, v11}, Ljava/lang/Float;->compare(FF)I

    move-result v8

    if-nez v8, :cond_33

    .line 70
    iget v8, v0, Lq7/e$c;->u:F

    invoke-static {v8, v11}, Ljava/lang/Float;->compare(FF)I

    move-result v8

    if-nez v8, :cond_2f

    goto :goto_12

    .line 71
    :cond_2f
    iget v8, v0, Lq7/e$c;->t:F

    const/high16 v9, 0x42b40000    # 90.0f

    invoke-static {v8, v9}, Ljava/lang/Float;->compare(FF)I

    move-result v8

    if-nez v8, :cond_30

    const/16 v9, 0x5a

    goto :goto_12

    .line 72
    :cond_30
    iget v8, v0, Lq7/e$c;->t:F

    const/high16 v9, -0x3ccc0000    # -180.0f

    invoke-static {v8, v9}, Ljava/lang/Float;->compare(FF)I

    move-result v8

    if-eqz v8, :cond_32

    iget v8, v0, Lq7/e$c;->t:F

    const/high16 v9, 0x43340000    # 180.0f

    .line 73
    invoke-static {v8, v9}, Ljava/lang/Float;->compare(FF)I

    move-result v8

    if-nez v8, :cond_31

    goto :goto_11

    .line 74
    :cond_31
    iget v8, v0, Lq7/e$c;->t:F

    const/high16 v9, -0x3d4c0000    # -90.0f

    invoke-static {v8, v9}, Ljava/lang/Float;->compare(FF)I

    move-result v8

    if-nez v8, :cond_33

    const/16 v9, 0x10e

    goto :goto_12

    :cond_32
    :goto_11
    const/16 v9, 0xb4

    goto :goto_12

    :cond_33
    move v9, v7

    .line 75
    :goto_12
    iget v7, v0, Lq7/e$c;->m:I

    .line 76
    invoke-virtual {v6, v7}, Ld7/k$b;->j0(I)Ld7/k$b;

    move-result-object v7

    iget v8, v0, Lq7/e$c;->n:I

    .line 77
    invoke-virtual {v7, v8}, Ld7/k$b;->Q(I)Ld7/k$b;

    move-result-object v7

    .line 78
    invoke-virtual {v7, v2}, Ld7/k$b;->a0(F)Ld7/k$b;

    move-result-object v2

    .line 79
    invoke-virtual {v2, v9}, Ld7/k$b;->d0(I)Ld7/k$b;

    move-result-object v2

    iget-object v7, v0, Lq7/e$c;->v:[B

    .line 80
    invoke-virtual {v2, v7}, Ld7/k$b;->b0([B)Ld7/k$b;

    move-result-object v2

    iget v7, v0, Lq7/e$c;->w:I

    .line 81
    invoke-virtual {v2, v7}, Ld7/k$b;->h0(I)Ld7/k$b;

    move-result-object v2

    .line 82
    invoke-virtual {v2, v10}, Ld7/k$b;->J(Lg9/b;)Ld7/k$b;

    const/4 v8, 0x2

    goto :goto_13

    .line 83
    :cond_34
    invoke-virtual {v14, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_36

    .line 84
    invoke-virtual {v13, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_36

    .line 85
    invoke-virtual {v12, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_36

    move-object/from16 v7, v18

    .line 86
    invoke-virtual {v7, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_36

    .line 87
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_35

    goto :goto_13

    .line 88
    :cond_35
    new-instance v1, Ld7/o;

    const-string v2, "Unexpected MIME type."

    invoke-direct {v1, v2}, Ld7/o;-><init>(Ljava/lang/String;)V

    throw v1

    .line 89
    :cond_36
    :goto_13
    iget-object v2, v0, Lq7/e$c;->a:Ljava/lang/String;

    if-eqz v2, :cond_37

    invoke-static {}, Lq7/e;->e()Ljava/util/Map;

    move-result-object v2

    iget-object v7, v0, Lq7/e$c;->a:Ljava/lang/String;

    invoke-interface {v2, v7}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_37

    .line 90
    iget-object v2, v0, Lq7/e$c;->a:Ljava/lang/String;

    invoke-virtual {v6, v2}, Ld7/k$b;->U(Ljava/lang/String;)Ld7/k$b;

    :cond_37
    move/from16 v2, p2

    .line 91
    invoke-virtual {v6, v2}, Ld7/k$b;->R(I)Ld7/k$b;

    move-result-object v2

    .line 92
    invoke-virtual {v2, v4}, Ld7/k$b;->e0(Ljava/lang/String;)Ld7/k$b;

    move-result-object v2

    .line 93
    invoke-virtual {v2, v15}, Ld7/k$b;->W(I)Ld7/k$b;

    move-result-object v2

    iget-object v4, v0, Lq7/e$c;->W:Ljava/lang/String;

    .line 94
    invoke-virtual {v2, v4}, Ld7/k$b;->V(Ljava/lang/String;)Ld7/k$b;

    move-result-object v2

    .line 95
    invoke-virtual {v2, v5}, Ld7/k$b;->g0(I)Ld7/k$b;

    move-result-object v2

    .line 96
    invoke-virtual {v2, v1}, Ld7/k$b;->T(Ljava/util/List;)Ld7/k$b;

    move-result-object v1

    .line 97
    invoke-virtual {v1, v3}, Ld7/k$b;->I(Ljava/lang/String;)Ld7/k$b;

    move-result-object v1

    iget-object v2, v0, Lq7/e$c;->l:Lj7/l;

    .line 98
    invoke-virtual {v1, v2}, Ld7/k$b;->L(Lj7/l;)Ld7/k$b;

    move-result-object v1

    .line 99
    invoke-virtual {v1}, Ld7/k$b;->E()Ld7/k;

    move-result-object v1

    .line 100
    iget v2, v0, Lq7/e$c;->c:I

    move-object/from16 v3, p1

    invoke-interface {v3, v2, v8}, Ll7/k;->d(II)Ll7/b0;

    move-result-object v2

    iput-object v2, v0, Lq7/e$c;->X:Ll7/b0;

    .line 101
    invoke-interface {v2, v1}, Ll7/b0;->a(Ld7/k;)V

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7ce7f5de -> :sswitch_1f
        -0x7ce7f3b0 -> :sswitch_1e
        -0x76567dc0 -> :sswitch_1d
        -0x6a615338 -> :sswitch_1c
        -0x672350af -> :sswitch_1b
        -0x585f4fce -> :sswitch_1a
        -0x585f4fcd -> :sswitch_19
        -0x51dc40b2 -> :sswitch_18
        -0x37a9c464 -> :sswitch_17
        -0x2016c535 -> :sswitch_16
        -0x2016c4e5 -> :sswitch_15
        -0x19552dbd -> :sswitch_14
        -0x1538b2ba -> :sswitch_13
        0x3c02325 -> :sswitch_12
        0x3c02353 -> :sswitch_11
        0x3c030c5 -> :sswitch_10
        0x4e81333 -> :sswitch_f
        0x4e86155 -> :sswitch_e
        0x4e86156 -> :sswitch_d
        0x5e8da3e -> :sswitch_c
        0x1a8350d6 -> :sswitch_b
        0x2056f406 -> :sswitch_a
        0x25e26ee2 -> :sswitch_9
        0x2b45174d -> :sswitch_8
        0x2b453ce4 -> :sswitch_7
        0x2c0618eb -> :sswitch_6
        0x32fdf009 -> :sswitch_5
        0x54c61e47 -> :sswitch_4
        0x6bd6c624 -> :sswitch_3
        0x7446132a -> :sswitch_2
        0x7446b0a6 -> :sswitch_1
        0x744ad97d -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_1c
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_f
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public i()V
    .locals 1

    .line 1
    iget-object v0, p0, Lq7/e$c;->T:Lq7/e$d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p0}, Lq7/e$d;->a(Lq7/e$c;)V

    .line 6
    .line 7
    .line 8
    :cond_0
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
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
.end method

.method public m()V
    .locals 1

    .line 1
    iget-object v0, p0, Lq7/e$c;->T:Lq7/e$d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lq7/e$d;->b()V

    .line 6
    .line 7
    .line 8
    :cond_0
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
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
.end method
