.class public Lcom/google/android/exoplayer2/source/dash/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/exoplayer2/source/dash/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/exoplayer2/source/dash/c$b;,
        Lcom/google/android/exoplayer2/source/dash/c$c;,
        Lcom/google/android/exoplayer2/source/dash/c$a;
    }
.end annotation


# instance fields
.field private final a:Le9/t;

.field private final b:[I

.field private final c:I

.field private final d:Lcom/google/android/exoplayer2/upstream/DataSource;

.field private final e:J

.field private final f:I

.field private final g:Lcom/google/android/exoplayer2/source/dash/e$c;

.field protected final h:[Lcom/google/android/exoplayer2/source/dash/c$b;

.field private i:Lb9/h;

.field private j:Lm8/b;

.field private k:I

.field private l:Ljava/io/IOException;

.field private m:Z


# direct methods
.method public constructor <init>(Le9/t;Lm8/b;I[ILb9/h;ILcom/google/android/exoplayer2/upstream/DataSource;JIZLjava/util/List;Lcom/google/android/exoplayer2/source/dash/e$c;)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le9/t;",
            "Lm8/b;",
            "I[I",
            "Lb9/h;",
            "I",
            "Lcom/google/android/exoplayer2/upstream/DataSource;",
            "JIZ",
            "Ljava/util/List<",
            "Le7/k;",
            ">;",
            "Lcom/google/android/exoplayer2/source/dash/e$c;",
            ")V"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p5

    .line 4
    .line 5
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    move-object/from16 v2, p1

    .line 9
    .line 10
    iput-object v2, v0, Lcom/google/android/exoplayer2/source/dash/c;->a:Le9/t;

    .line 11
    .line 12
    move-object/from16 v2, p2

    .line 13
    .line 14
    iput-object v2, v0, Lcom/google/android/exoplayer2/source/dash/c;->j:Lm8/b;

    .line 15
    .line 16
    move-object/from16 v3, p4

    .line 17
    .line 18
    iput-object v3, v0, Lcom/google/android/exoplayer2/source/dash/c;->b:[I

    .line 19
    .line 20
    iput-object v1, v0, Lcom/google/android/exoplayer2/source/dash/c;->i:Lb9/h;

    .line 21
    .line 22
    move/from16 v10, p6

    .line 23
    .line 24
    iput v10, v0, Lcom/google/android/exoplayer2/source/dash/c;->c:I

    .line 25
    .line 26
    move-object/from16 v3, p7

    .line 27
    .line 28
    iput-object v3, v0, Lcom/google/android/exoplayer2/source/dash/c;->d:Lcom/google/android/exoplayer2/upstream/DataSource;

    .line 29
    .line 30
    move/from16 v3, p3

    .line 31
    .line 32
    iput v3, v0, Lcom/google/android/exoplayer2/source/dash/c;->k:I

    .line 33
    .line 34
    move-wide/from16 v4, p8

    .line 35
    .line 36
    iput-wide v4, v0, Lcom/google/android/exoplayer2/source/dash/c;->e:J

    .line 37
    .line 38
    move/from16 v4, p10

    .line 39
    .line 40
    iput v4, v0, Lcom/google/android/exoplayer2/source/dash/c;->f:I

    .line 41
    .line 42
    move-object/from16 v11, p13

    .line 43
    .line 44
    iput-object v11, v0, Lcom/google/android/exoplayer2/source/dash/c;->g:Lcom/google/android/exoplayer2/source/dash/e$c;

    .line 45
    .line 46
    invoke-virtual/range {p2 .. p3}, Lm8/b;->g(I)J

    .line 47
    .line 48
    .line 49
    move-result-wide v12

    .line 50
    invoke-direct/range {p0 .. p0}, Lcom/google/android/exoplayer2/source/dash/c;->m()Ljava/util/ArrayList;

    .line 51
    .line 52
    .line 53
    move-result-object v14

    .line 54
    invoke-interface/range {p5 .. p5}, Lb9/k;->length()I

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    new-array v2, v2, [Lcom/google/android/exoplayer2/source/dash/c$b;

    .line 59
    .line 60
    iput-object v2, v0, Lcom/google/android/exoplayer2/source/dash/c;->h:[Lcom/google/android/exoplayer2/source/dash/c$b;

    .line 61
    .line 62
    const/4 v2, 0x0

    .line 63
    move v15, v2

    .line 64
    :goto_0
    iget-object v2, v0, Lcom/google/android/exoplayer2/source/dash/c;->h:[Lcom/google/android/exoplayer2/source/dash/c$b;

    .line 65
    .line 66
    array-length v2, v2

    .line 67
    if-ge v15, v2, :cond_0

    .line 68
    .line 69
    invoke-interface {v1, v15}, Lb9/k;->d(I)I

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    invoke-interface {v14, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    move-object v6, v2

    .line 78
    check-cast v6, Lm8/i;

    .line 79
    .line 80
    iget-object v9, v0, Lcom/google/android/exoplayer2/source/dash/c;->h:[Lcom/google/android/exoplayer2/source/dash/c$b;

    .line 81
    .line 82
    new-instance v16, Lcom/google/android/exoplayer2/source/dash/c$b;

    .line 83
    .line 84
    move-object/from16 v2, v16

    .line 85
    .line 86
    move-wide v3, v12

    .line 87
    move/from16 v5, p6

    .line 88
    .line 89
    move/from16 v7, p11

    .line 90
    .line 91
    move-object/from16 v8, p12

    .line 92
    .line 93
    move-object/from16 v17, v9

    .line 94
    .line 95
    move-object/from16 v9, p13

    .line 96
    .line 97
    invoke-direct/range {v2 .. v9}, Lcom/google/android/exoplayer2/source/dash/c$b;-><init>(JILm8/i;ZLjava/util/List;Lm7/b0;)V

    .line 98
    .line 99
    .line 100
    aput-object v16, v17, v15

    .line 101
    .line 102
    add-int/lit8 v15, v15, 0x1

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_0
    return-void
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
.end method

.method private k(JJ)J
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/c;->j:Lm8/b;

    .line 2
    .line 3
    iget-boolean v0, v0, Lm8/b;->d:Z

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    return-wide p1

    .line 13
    :cond_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/c;->h:[Lcom/google/android/exoplayer2/source/dash/c$b;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    aget-object v0, v0, v1

    .line 17
    .line 18
    invoke-virtual {v0, p1, p2}, Lcom/google/android/exoplayer2/source/dash/c$b;->g(J)J

    .line 19
    .line 20
    .line 21
    move-result-wide v2

    .line 22
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/c;->h:[Lcom/google/android/exoplayer2/source/dash/c$b;

    .line 23
    .line 24
    aget-object v0, v0, v1

    .line 25
    .line 26
    invoke-virtual {v0, v2, v3}, Lcom/google/android/exoplayer2/source/dash/c$b;->i(J)J

    .line 27
    .line 28
    .line 29
    move-result-wide v0

    .line 30
    invoke-direct {p0, p1, p2}, Lcom/google/android/exoplayer2/source/dash/c;->l(J)J

    .line 31
    .line 32
    .line 33
    move-result-wide p1

    .line 34
    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->min(JJ)J

    .line 35
    .line 36
    .line 37
    move-result-wide p1

    .line 38
    const-wide/16 v0, 0x0

    .line 39
    .line 40
    sub-long/2addr p1, p3

    .line 41
    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->max(JJ)J

    .line 42
    .line 43
    .line 44
    move-result-wide p1

    .line 45
    return-wide p1
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
.end method

.method private l(J)J
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/c;->j:Lm8/b;

    .line 2
    .line 3
    iget-wide v1, v0, Lm8/b;->a:J

    .line 4
    .line 5
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    cmp-long v5, v1, v3

    .line 11
    .line 12
    if-nez v5, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget v3, p0, Lcom/google/android/exoplayer2/source/dash/c;->k:I

    .line 16
    .line 17
    invoke-virtual {v0, v3}, Lm8/b;->d(I)Lm8/f;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget-wide v3, v0, Lm8/f;->b:J

    .line 22
    .line 23
    add-long/2addr v1, v3

    .line 24
    invoke-static {v1, v2}, Le7/c;->c(J)J

    .line 25
    .line 26
    .line 27
    move-result-wide v0

    .line 28
    sub-long v3, p1, v0

    .line 29
    .line 30
    :goto_0
    return-wide v3
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
.end method

.method private m()Ljava/util/ArrayList;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lm8/i;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/c;->j:Lm8/b;

    .line 2
    .line 3
    iget v1, p0, Lcom/google/android/exoplayer2/source/dash/c;->k:I

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lm8/b;->d(I)Lm8/f;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v0, v0, Lm8/f;->c:Ljava/util/List;

    .line 10
    .line 11
    new-instance v1, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iget-object v2, p0, Lcom/google/android/exoplayer2/source/dash/c;->b:[I

    .line 17
    .line 18
    array-length v3, v2

    .line 19
    const/4 v4, 0x0

    .line 20
    :goto_0
    if-ge v4, v3, :cond_0

    .line 21
    .line 22
    aget v5, v2, v4

    .line 23
    .line 24
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    check-cast v5, Lm8/a;

    .line 29
    .line 30
    iget-object v5, v5, Lm8/a;->c:Ljava/util/List;

    .line 31
    .line 32
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 33
    .line 34
    .line 35
    add-int/lit8 v4, v4, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    return-object v1
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
.end method

.method private n(Lcom/google/android/exoplayer2/source/dash/c$b;Lk8/m;JJJ)J
    .locals 6

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p2}, Lk8/m;->g()J

    .line 4
    .line 5
    .line 6
    move-result-wide p1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {p1, p3, p4}, Lcom/google/android/exoplayer2/source/dash/c$b;->j(J)J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    move-wide v2, p5

    .line 13
    move-wide v4, p7

    .line 14
    invoke-static/range {v0 .. v5}, Lg9/q0;->s(JJJ)J

    .line 15
    .line 16
    .line 17
    move-result-wide p1

    .line 18
    :goto_0
    return-wide p1
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


# virtual methods
.method public a()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/c;->l:Ljava/io/IOException;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/c;->a:Le9/t;

    .line 6
    .line 7
    invoke-interface {v0}, Le9/t;->a()V

    .line 8
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
.end method

.method public b(Lb9/h;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/dash/c;->i:Lb9/h;

    return-void
.end method

.method public c(Lk8/e;ZLjava/lang/Exception;J)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p2, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    iget-object p2, p0, Lcom/google/android/exoplayer2/source/dash/c;->g:Lcom/google/android/exoplayer2/source/dash/e$c;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz p2, :cond_1

    .line 9
    .line 10
    invoke-virtual {p2, p1}, Lcom/google/android/exoplayer2/source/dash/e$c;->j(Lk8/e;)Z

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    if-eqz p2, :cond_1

    .line 15
    .line 16
    return v1

    .line 17
    :cond_1
    iget-object p2, p0, Lcom/google/android/exoplayer2/source/dash/c;->j:Lm8/b;

    .line 18
    .line 19
    iget-boolean p2, p2, Lm8/b;->d:Z

    .line 20
    .line 21
    if-nez p2, :cond_2

    .line 22
    .line 23
    instance-of p2, p1, Lk8/m;

    .line 24
    .line 25
    if-eqz p2, :cond_2

    .line 26
    .line 27
    instance-of p2, p3, Lcom/google/android/exoplayer2/upstream/f$f;

    .line 28
    .line 29
    if-eqz p2, :cond_2

    .line 30
    .line 31
    check-cast p3, Lcom/google/android/exoplayer2/upstream/f$f;

    .line 32
    .line 33
    iget p2, p3, Lcom/google/android/exoplayer2/upstream/f$f;->m:I

    .line 34
    .line 35
    const/16 p3, 0x194

    .line 36
    .line 37
    if-ne p2, p3, :cond_2

    .line 38
    .line 39
    iget-object p2, p0, Lcom/google/android/exoplayer2/source/dash/c;->h:[Lcom/google/android/exoplayer2/source/dash/c$b;

    .line 40
    .line 41
    iget-object p3, p0, Lcom/google/android/exoplayer2/source/dash/c;->i:Lb9/h;

    .line 42
    .line 43
    iget-object v2, p1, Lk8/e;->d:Le7/k;

    .line 44
    .line 45
    invoke-interface {p3, v2}, Lb9/k;->l(Le7/k;)I

    .line 46
    .line 47
    .line 48
    move-result p3

    .line 49
    aget-object p2, p2, p3

    .line 50
    .line 51
    invoke-virtual {p2}, Lcom/google/android/exoplayer2/source/dash/c$b;->h()I

    .line 52
    .line 53
    .line 54
    move-result p3

    .line 55
    const/4 v2, -0x1

    .line 56
    if-eq p3, v2, :cond_2

    .line 57
    .line 58
    if-eqz p3, :cond_2

    .line 59
    .line 60
    invoke-virtual {p2}, Lcom/google/android/exoplayer2/source/dash/c$b;->f()J

    .line 61
    .line 62
    .line 63
    move-result-wide v2

    .line 64
    int-to-long p2, p3

    .line 65
    add-long/2addr v2, p2

    .line 66
    const-wide/16 p2, 0x1

    .line 67
    .line 68
    sub-long/2addr v2, p2

    .line 69
    move-object p2, p1

    .line 70
    check-cast p2, Lk8/m;

    .line 71
    .line 72
    invoke-virtual {p2}, Lk8/m;->g()J

    .line 73
    .line 74
    .line 75
    move-result-wide p2

    .line 76
    cmp-long p2, p2, v2

    .line 77
    .line 78
    if-lez p2, :cond_2

    .line 79
    .line 80
    iput-boolean v1, p0, Lcom/google/android/exoplayer2/source/dash/c;->m:Z

    .line 81
    .line 82
    return v1

    .line 83
    :cond_2
    const-wide p2, -0x7fffffffffffffffL    # -4.9E-324

    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    cmp-long p2, p4, p2

    .line 89
    .line 90
    if-eqz p2, :cond_3

    .line 91
    .line 92
    iget-object p2, p0, Lcom/google/android/exoplayer2/source/dash/c;->i:Lb9/h;

    .line 93
    .line 94
    iget-object p1, p1, Lk8/e;->d:Le7/k;

    .line 95
    .line 96
    invoke-interface {p2, p1}, Lb9/k;->l(Le7/k;)I

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    invoke-interface {p2, p1, p4, p5}, Lb9/h;->b(IJ)Z

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    if-eqz p1, :cond_3

    .line 105
    .line 106
    move v0, v1

    .line 107
    :cond_3
    return v0
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
.end method

.method public d(JLe7/w;)J
    .locals 16

    .line 1
    move-wide/from16 v1, p1

    .line 2
    .line 3
    move-object/from16 v7, p0

    .line 4
    .line 5
    iget-object v0, v7, Lcom/google/android/exoplayer2/source/dash/c;->h:[Lcom/google/android/exoplayer2/source/dash/c$b;

    .line 6
    .line 7
    array-length v3, v0

    .line 8
    const/4 v4, 0x0

    .line 9
    :goto_0
    if-ge v4, v3, :cond_3

    .line 10
    .line 11
    aget-object v5, v0, v4

    .line 12
    .line 13
    iget-object v6, v5, Lcom/google/android/exoplayer2/source/dash/c$b;->c:Ll8/e;

    .line 14
    .line 15
    if-eqz v6, :cond_2

    .line 16
    .line 17
    invoke-virtual {v5, v1, v2}, Lcom/google/android/exoplayer2/source/dash/c$b;->j(J)J

    .line 18
    .line 19
    .line 20
    move-result-wide v3

    .line 21
    invoke-virtual {v5, v3, v4}, Lcom/google/android/exoplayer2/source/dash/c$b;->k(J)J

    .line 22
    .line 23
    .line 24
    move-result-wide v8

    .line 25
    invoke-virtual {v5}, Lcom/google/android/exoplayer2/source/dash/c$b;->h()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    cmp-long v6, v8, v1

    .line 30
    .line 31
    if-gez v6, :cond_1

    .line 32
    .line 33
    const/4 v6, -0x1

    .line 34
    const-wide/16 v10, 0x1

    .line 35
    .line 36
    if-eq v0, v6, :cond_0

    .line 37
    .line 38
    invoke-virtual {v5}, Lcom/google/android/exoplayer2/source/dash/c$b;->f()J

    .line 39
    .line 40
    .line 41
    move-result-wide v12

    .line 42
    int-to-long v14, v0

    .line 43
    add-long/2addr v12, v14

    .line 44
    sub-long/2addr v12, v10

    .line 45
    cmp-long v0, v3, v12

    .line 46
    .line 47
    if-gez v0, :cond_1

    .line 48
    .line 49
    :cond_0
    add-long/2addr v3, v10

    .line 50
    invoke-virtual {v5, v3, v4}, Lcom/google/android/exoplayer2/source/dash/c$b;->k(J)J

    .line 51
    .line 52
    .line 53
    move-result-wide v3

    .line 54
    move-wide v5, v3

    .line 55
    goto :goto_1

    .line 56
    :cond_1
    move-wide v5, v8

    .line 57
    :goto_1
    move-object/from16 v0, p3

    .line 58
    .line 59
    move-wide/from16 v1, p1

    .line 60
    .line 61
    move-wide v3, v8

    .line 62
    invoke-virtual/range {v0 .. v6}, Le7/w;->a(JJJ)J

    .line 63
    .line 64
    .line 65
    move-result-wide v0

    .line 66
    return-wide v0

    .line 67
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_3
    return-wide v1
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
.end method

.method public e(JLk8/e;Ljava/util/List;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lk8/e;",
            "Ljava/util/List<",
            "+",
            "Lk8/m;",
            ">;)Z"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/c;->l:Ljava/io/IOException;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    return p1

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/c;->i:Lb9/h;

    .line 8
    .line 9
    invoke-interface {v0, p1, p2, p3, p4}, Lb9/h;->j(JLk8/e;Ljava/util/List;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1
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
.end method

.method public f(Lk8/e;)V
    .locals 7

    .line 1
    instance-of v0, p1, Lk8/l;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lk8/l;

    .line 7
    .line 8
    iget-object v1, p0, Lcom/google/android/exoplayer2/source/dash/c;->i:Lb9/h;

    .line 9
    .line 10
    iget-object v0, v0, Lk8/e;->d:Le7/k;

    .line 11
    .line 12
    invoke-interface {v1, v0}, Lb9/k;->l(Le7/k;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v1, p0, Lcom/google/android/exoplayer2/source/dash/c;->h:[Lcom/google/android/exoplayer2/source/dash/c$b;

    .line 17
    .line 18
    aget-object v1, v1, v0

    .line 19
    .line 20
    iget-object v2, v1, Lcom/google/android/exoplayer2/source/dash/c$b;->c:Ll8/e;

    .line 21
    .line 22
    if-nez v2, :cond_0

    .line 23
    .line 24
    iget-object v2, v1, Lcom/google/android/exoplayer2/source/dash/c$b;->a:Lk8/f;

    .line 25
    .line 26
    invoke-interface {v2}, Lk8/f;->c()Lm7/d;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    if-eqz v2, :cond_0

    .line 31
    .line 32
    iget-object v3, p0, Lcom/google/android/exoplayer2/source/dash/c;->h:[Lcom/google/android/exoplayer2/source/dash/c$b;

    .line 33
    .line 34
    new-instance v4, Ll8/g;

    .line 35
    .line 36
    iget-object v5, v1, Lcom/google/android/exoplayer2/source/dash/c$b;->b:Lm8/i;

    .line 37
    .line 38
    iget-wide v5, v5, Lm8/i;->d:J

    .line 39
    .line 40
    invoke-direct {v4, v2, v5, v6}, Ll8/g;-><init>(Lm7/d;J)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, v4}, Lcom/google/android/exoplayer2/source/dash/c$b;->c(Ll8/e;)Lcom/google/android/exoplayer2/source/dash/c$b;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    aput-object v1, v3, v0

    .line 48
    .line 49
    :cond_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/c;->g:Lcom/google/android/exoplayer2/source/dash/e$c;

    .line 50
    .line 51
    if-eqz v0, :cond_1

    .line 52
    .line 53
    invoke-virtual {v0, p1}, Lcom/google/android/exoplayer2/source/dash/e$c;->i(Lk8/e;)V

    .line 54
    .line 55
    .line 56
    :cond_1
    return-void
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
.end method

.method public h(JJLjava/util/List;Lk8/g;)V
    .locals 33
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ",
            "Ljava/util/List<",
            "+",
            "Lk8/m;",
            ">;",
            "Lk8/g;",
            ")V"
        }
    .end annotation

    move-object/from16 v14, p0

    move-wide/from16 v9, p1

    move-object/from16 v15, p6

    .line 1
    iget-object v0, v14, Lcom/google/android/exoplayer2/source/dash/c;->l:Ljava/io/IOException;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    sub-long v11, p3, v9

    .line 2
    iget-object v0, v14, Lcom/google/android/exoplayer2/source/dash/c;->j:Lm8/b;

    iget-wide v0, v0, Lm8/b;->a:J

    .line 3
    invoke-static {v0, v1}, Le7/c;->c(J)J

    move-result-wide v0

    iget-object v2, v14, Lcom/google/android/exoplayer2/source/dash/c;->j:Lm8/b;

    iget v3, v14, Lcom/google/android/exoplayer2/source/dash/c;->k:I

    .line 4
    invoke-virtual {v2, v3}, Lm8/b;->d(I)Lm8/f;

    move-result-object v2

    iget-wide v2, v2, Lm8/f;->b:J

    invoke-static {v2, v3}, Le7/c;->c(J)J

    move-result-wide v2

    add-long/2addr v0, v2

    add-long v0, v0, p3

    .line 5
    iget-object v2, v14, Lcom/google/android/exoplayer2/source/dash/c;->g:Lcom/google/android/exoplayer2/source/dash/e$c;

    if-eqz v2, :cond_1

    .line 6
    invoke-virtual {v2, v0, v1}, Lcom/google/android/exoplayer2/source/dash/e$c;->h(J)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    .line 7
    :cond_1
    iget-wide v0, v14, Lcom/google/android/exoplayer2/source/dash/c;->e:J

    invoke-static {v0, v1}, Lg9/q0;->Z(J)J

    move-result-wide v0

    invoke-static {v0, v1}, Le7/c;->c(J)J

    move-result-wide v7

    .line 8
    invoke-direct {v14, v7, v8}, Lcom/google/android/exoplayer2/source/dash/c;->l(J)J

    move-result-wide v24

    .line 9
    invoke-interface/range {p5 .. p5}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v5, 0x1

    if-eqz v0, :cond_2

    move-object/from16 v6, p5

    const/16 v26, 0x0

    goto :goto_0

    :cond_2
    invoke-interface/range {p5 .. p5}, Ljava/util/List;->size()I

    move-result v0

    sub-int/2addr v0, v5

    move-object/from16 v6, p5

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk8/m;

    move-object/from16 v26, v0

    .line 10
    :goto_0
    iget-object v0, v14, Lcom/google/android/exoplayer2/source/dash/c;->i:Lb9/h;

    invoke-interface {v0}, Lb9/k;->length()I

    move-result v3

    new-array v4, v3, [Lk8/n;

    const/16 v27, 0x0

    move/from16 v2, v27

    :goto_1
    if-ge v2, v3, :cond_5

    .line 11
    iget-object v0, v14, Lcom/google/android/exoplayer2/source/dash/c;->h:[Lcom/google/android/exoplayer2/source/dash/c$b;

    aget-object v1, v0, v2

    .line 12
    iget-object v0, v1, Lcom/google/android/exoplayer2/source/dash/c$b;->c:Ll8/e;

    if-nez v0, :cond_3

    .line 13
    sget-object v0, Lk8/n;->a:Lk8/n;

    aput-object v0, v4, v2

    move/from16 v28, v2

    move/from16 v30, v3

    move-object/from16 v29, v4

    move v13, v5

    move-wide/from16 v31, v11

    move-wide v11, v7

    goto :goto_2

    .line 14
    :cond_3
    invoke-virtual {v1, v7, v8}, Lcom/google/android/exoplayer2/source/dash/c$b;->e(J)J

    move-result-wide v16

    .line 15
    invoke-virtual {v1, v7, v8}, Lcom/google/android/exoplayer2/source/dash/c$b;->g(J)J

    move-result-wide v20

    move-object/from16 v0, p0

    move-object/from16 v18, v1

    move/from16 v28, v2

    move-object/from16 v2, v26

    move/from16 v30, v3

    move-object/from16 v29, v4

    move-wide/from16 v3, p3

    move v13, v5

    move-wide/from16 v5, v16

    move-wide/from16 v31, v11

    move-wide v11, v7

    move-wide/from16 v7, v20

    .line 16
    invoke-direct/range {v0 .. v8}, Lcom/google/android/exoplayer2/source/dash/c;->n(Lcom/google/android/exoplayer2/source/dash/c$b;Lk8/m;JJJ)J

    move-result-wide v0

    cmp-long v2, v0, v16

    if-gez v2, :cond_4

    .line 17
    sget-object v0, Lk8/n;->a:Lk8/n;

    aput-object v0, v29, v28

    goto :goto_2

    .line 18
    :cond_4
    new-instance v2, Lcom/google/android/exoplayer2/source/dash/c$c;

    move-object/from16 v16, v2

    move-object/from16 v17, v18

    move-wide/from16 v18, v0

    move-wide/from16 v22, v24

    invoke-direct/range {v16 .. v23}, Lcom/google/android/exoplayer2/source/dash/c$c;-><init>(Lcom/google/android/exoplayer2/source/dash/c$b;JJJ)V

    aput-object v2, v29, v28

    :goto_2
    add-int/lit8 v2, v28, 0x1

    move-object/from16 v6, p5

    move-wide v7, v11

    move v5, v13

    move-object/from16 v4, v29

    move/from16 v3, v30

    move-wide/from16 v11, v31

    goto :goto_1

    :cond_5
    move-object/from16 v29, v4

    move v13, v5

    move-wide/from16 v31, v11

    move-wide v11, v7

    .line 19
    invoke-direct {v14, v11, v12, v9, v10}, Lcom/google/android/exoplayer2/source/dash/c;->k(JJ)J

    move-result-wide v5

    .line 20
    iget-object v0, v14, Lcom/google/android/exoplayer2/source/dash/c;->i:Lb9/h;

    move-wide/from16 v1, p1

    move-wide/from16 v3, v31

    move-object/from16 v7, p5

    move-object/from16 v8, v29

    invoke-interface/range {v0 .. v8}, Lb9/h;->e(JJJLjava/util/List;[Lk8/n;)V

    .line 21
    iget-object v0, v14, Lcom/google/android/exoplayer2/source/dash/c;->h:[Lcom/google/android/exoplayer2/source/dash/c$b;

    iget-object v1, v14, Lcom/google/android/exoplayer2/source/dash/c;->i:Lb9/h;

    .line 22
    invoke-interface {v1}, Lb9/h;->a()I

    move-result v1

    aget-object v9, v0, v1

    .line 23
    iget-object v0, v9, Lcom/google/android/exoplayer2/source/dash/c$b;->a:Lk8/f;

    if-eqz v0, :cond_9

    .line 24
    iget-object v1, v9, Lcom/google/android/exoplayer2/source/dash/c$b;->b:Lm8/i;

    .line 25
    invoke-interface {v0}, Lk8/f;->d()[Le7/k;

    move-result-object v0

    if-nez v0, :cond_6

    .line 26
    invoke-virtual {v1}, Lm8/i;->n()Lm8/h;

    move-result-object v0

    move-object v6, v0

    goto :goto_3

    :cond_6
    const/4 v6, 0x0

    .line 27
    :goto_3
    iget-object v0, v9, Lcom/google/android/exoplayer2/source/dash/c$b;->c:Ll8/e;

    if-nez v0, :cond_7

    .line 28
    invoke-virtual {v1}, Lm8/i;->m()Lm8/h;

    move-result-object v0

    move-object v7, v0

    goto :goto_4

    :cond_7
    const/4 v7, 0x0

    :goto_4
    if-nez v6, :cond_8

    if-eqz v7, :cond_9

    .line 29
    :cond_8
    iget-object v2, v14, Lcom/google/android/exoplayer2/source/dash/c;->d:Lcom/google/android/exoplayer2/upstream/DataSource;

    iget-object v0, v14, Lcom/google/android/exoplayer2/source/dash/c;->i:Lb9/h;

    .line 30
    invoke-interface {v0}, Lb9/h;->p()Le7/k;

    move-result-object v3

    iget-object v0, v14, Lcom/google/android/exoplayer2/source/dash/c;->i:Lb9/h;

    invoke-interface {v0}, Lb9/h;->q()I

    move-result v4

    iget-object v0, v14, Lcom/google/android/exoplayer2/source/dash/c;->i:Lb9/h;

    .line 31
    invoke-interface {v0}, Lb9/h;->g()Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v0, p0

    move-object v1, v9

    .line 32
    invoke-virtual/range {v0 .. v7}, Lcom/google/android/exoplayer2/source/dash/c;->o(Lcom/google/android/exoplayer2/source/dash/c$b;Lcom/google/android/exoplayer2/upstream/DataSource;Le7/k;ILjava/lang/Object;Lm8/h;Lm8/h;)Lk8/e;

    move-result-object v0

    iput-object v0, v15, Lk8/g;->a:Lk8/e;

    return-void

    .line 33
    :cond_9
    invoke-static {v9}, Lcom/google/android/exoplayer2/source/dash/c$b;->a(Lcom/google/android/exoplayer2/source/dash/c$b;)J

    move-result-wide v16

    const-wide v18, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v10, v16, v18

    if-eqz v10, :cond_a

    move v7, v13

    goto :goto_5

    :cond_a
    move/from16 v7, v27

    .line 34
    :goto_5
    invoke-virtual {v9}, Lcom/google/android/exoplayer2/source/dash/c$b;->h()I

    move-result v0

    if-nez v0, :cond_b

    .line 35
    iput-boolean v7, v15, Lk8/g;->b:Z

    return-void

    .line 36
    :cond_b
    invoke-virtual {v9, v11, v12}, Lcom/google/android/exoplayer2/source/dash/c$b;->e(J)J

    move-result-wide v20

    .line 37
    invoke-virtual {v9, v11, v12}, Lcom/google/android/exoplayer2/source/dash/c$b;->g(J)J

    move-result-wide v11

    move-object/from16 v0, p0

    move-object v1, v9

    move-object/from16 v2, v26

    move-wide/from16 v3, p3

    move-wide/from16 v5, v20

    move v13, v7

    move-wide v7, v11

    .line 38
    invoke-direct/range {v0 .. v8}, Lcom/google/android/exoplayer2/source/dash/c;->n(Lcom/google/android/exoplayer2/source/dash/c$b;Lk8/m;JJJ)J

    move-result-wide v7

    cmp-long v0, v7, v20

    if-gez v0, :cond_c

    .line 39
    new-instance v0, Li8/b;

    invoke-direct {v0}, Li8/b;-><init>()V

    iput-object v0, v14, Lcom/google/android/exoplayer2/source/dash/c;->l:Ljava/io/IOException;

    return-void

    :cond_c
    cmp-long v0, v7, v11

    if-gtz v0, :cond_11

    .line 40
    iget-boolean v1, v14, Lcom/google/android/exoplayer2/source/dash/c;->m:Z

    if-eqz v1, :cond_d

    if-ltz v0, :cond_d

    goto :goto_7

    :cond_d
    if-eqz v13, :cond_e

    .line 41
    invoke-virtual {v9, v7, v8}, Lcom/google/android/exoplayer2/source/dash/c$b;->k(J)J

    move-result-wide v0

    cmp-long v0, v0, v16

    if-ltz v0, :cond_e

    const/4 v0, 0x1

    .line 42
    iput-boolean v0, v15, Lk8/g;->b:Z

    return-void

    .line 43
    :cond_e
    iget v0, v14, Lcom/google/android/exoplayer2/source/dash/c;->f:I

    int-to-long v0, v0

    sub-long/2addr v11, v7

    const-wide/16 v2, 0x1

    add-long/2addr v11, v2

    invoke-static {v0, v1, v11, v12}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    long-to-int v0, v0

    if-eqz v10, :cond_f

    const/4 v1, 0x1

    :goto_6
    if-le v0, v1, :cond_f

    int-to-long v4, v0

    add-long/2addr v4, v7

    sub-long/2addr v4, v2

    .line 44
    invoke-virtual {v9, v4, v5}, Lcom/google/android/exoplayer2/source/dash/c$b;->k(J)J

    move-result-wide v4

    cmp-long v4, v4, v16

    if-ltz v4, :cond_f

    add-int/lit8 v0, v0, -0x1

    goto :goto_6

    :cond_f
    move v10, v0

    .line 45
    invoke-interface/range {p5 .. p5}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_10

    move-wide/from16 v18, p3

    .line 46
    :cond_10
    iget-object v2, v14, Lcom/google/android/exoplayer2/source/dash/c;->d:Lcom/google/android/exoplayer2/upstream/DataSource;

    iget v3, v14, Lcom/google/android/exoplayer2/source/dash/c;->c:I

    iget-object v0, v14, Lcom/google/android/exoplayer2/source/dash/c;->i:Lb9/h;

    .line 47
    invoke-interface {v0}, Lb9/h;->p()Le7/k;

    move-result-object v4

    iget-object v0, v14, Lcom/google/android/exoplayer2/source/dash/c;->i:Lb9/h;

    .line 48
    invoke-interface {v0}, Lb9/h;->q()I

    move-result v5

    iget-object v0, v14, Lcom/google/android/exoplayer2/source/dash/c;->i:Lb9/h;

    .line 49
    invoke-interface {v0}, Lb9/h;->g()Ljava/lang/Object;

    move-result-object v6

    move-object/from16 v0, p0

    move-object v1, v9

    move v9, v10

    move-wide/from16 v10, v18

    move-wide/from16 v12, v24

    .line 50
    invoke-virtual/range {v0 .. v13}, Lcom/google/android/exoplayer2/source/dash/c;->p(Lcom/google/android/exoplayer2/source/dash/c$b;Lcom/google/android/exoplayer2/upstream/DataSource;ILe7/k;ILjava/lang/Object;JIJJ)Lk8/e;

    move-result-object v0

    iput-object v0, v15, Lk8/g;->a:Lk8/e;

    return-void

    .line 51
    :cond_11
    :goto_7
    iput-boolean v13, v15, Lk8/g;->b:Z

    return-void
.end method

.method public i(Lm8/b;I)V
    .locals 5

    .line 1
    :try_start_0
    iput-object p1, p0, Lcom/google/android/exoplayer2/source/dash/c;->j:Lm8/b;

    .line 2
    .line 3
    iput p2, p0, Lcom/google/android/exoplayer2/source/dash/c;->k:I

    .line 4
    .line 5
    invoke-virtual {p1, p2}, Lm8/b;->g(I)J

    .line 6
    .line 7
    .line 8
    move-result-wide p1

    .line 9
    invoke-direct {p0}, Lcom/google/android/exoplayer2/source/dash/c;->m()Ljava/util/ArrayList;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v1, 0x0

    .line 14
    :goto_0
    iget-object v2, p0, Lcom/google/android/exoplayer2/source/dash/c;->h:[Lcom/google/android/exoplayer2/source/dash/c$b;

    .line 15
    .line 16
    array-length v2, v2

    .line 17
    if-ge v1, v2, :cond_0

    .line 18
    .line 19
    iget-object v2, p0, Lcom/google/android/exoplayer2/source/dash/c;->i:Lb9/h;

    .line 20
    .line 21
    invoke-interface {v2, v1}, Lb9/k;->d(I)I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    check-cast v2, Lm8/i;

    .line 30
    .line 31
    iget-object v3, p0, Lcom/google/android/exoplayer2/source/dash/c;->h:[Lcom/google/android/exoplayer2/source/dash/c$b;

    .line 32
    .line 33
    aget-object v4, v3, v1

    .line 34
    .line 35
    invoke-virtual {v4, p1, p2, v2}, Lcom/google/android/exoplayer2/source/dash/c$b;->b(JLm8/i;)Lcom/google/android/exoplayer2/source/dash/c$b;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    aput-object v2, v3, v1
    :try_end_0
    .catch Li8/b; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    .line 41
    add-int/lit8 v1, v1, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :catch_0
    move-exception p1

    .line 45
    iput-object p1, p0, Lcom/google/android/exoplayer2/source/dash/c;->l:Ljava/io/IOException;

    .line 46
    .line 47
    :cond_0
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
.end method

.method public j(JLjava/util/List;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/List<",
            "+",
            "Lk8/m;",
            ">;)I"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/c;->l:Ljava/io/IOException;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/c;->i:Lb9/h;

    .line 6
    .line 7
    invoke-interface {v0}, Lb9/k;->length()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x2

    .line 12
    if-ge v0, v1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/c;->i:Lb9/h;

    .line 16
    .line 17
    invoke-interface {v0, p1, p2, p3}, Lb9/h;->n(JLjava/util/List;)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1

    .line 22
    :cond_1
    :goto_0
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    return p1
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
.end method

.method protected o(Lcom/google/android/exoplayer2/source/dash/c$b;Lcom/google/android/exoplayer2/upstream/DataSource;Le7/k;ILjava/lang/Object;Lm8/h;Lm8/h;)Lk8/e;
    .locals 8

    .line 1
    iget-object v0, p1, Lcom/google/android/exoplayer2/source/dash/c$b;->b:Lm8/i;

    .line 2
    .line 3
    if-eqz p6, :cond_0

    .line 4
    .line 5
    iget-object v1, v0, Lm8/i;->c:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {p6, p7, v1}, Lm8/h;->a(Lm8/h;Ljava/lang/String;)Lm8/h;

    .line 8
    .line 9
    .line 10
    move-result-object p7

    .line 11
    if-nez p7, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-object p6, p7

    .line 15
    :goto_0
    const/4 p7, 0x0

    .line 16
    invoke-static {v0, p6, p7}, Ll8/f;->a(Lm8/i;Lm8/h;I)Lcom/google/android/exoplayer2/upstream/a;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    new-instance p6, Lk8/l;

    .line 21
    .line 22
    iget-object v7, p1, Lcom/google/android/exoplayer2/source/dash/c$b;->a:Lk8/f;

    .line 23
    .line 24
    move-object v1, p6

    .line 25
    move-object v2, p2

    .line 26
    move-object v4, p3

    .line 27
    move v5, p4

    .line 28
    move-object v6, p5

    .line 29
    invoke-direct/range {v1 .. v7}, Lk8/l;-><init>(Lcom/google/android/exoplayer2/upstream/DataSource;Lcom/google/android/exoplayer2/upstream/a;Le7/k;ILjava/lang/Object;Lk8/f;)V

    .line 30
    .line 31
    .line 32
    return-object p6
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
.end method

.method protected p(Lcom/google/android/exoplayer2/source/dash/c$b;Lcom/google/android/exoplayer2/upstream/DataSource;ILe7/k;ILjava/lang/Object;JIJJ)Lk8/e;
    .locals 24

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-wide/from16 v13, p7

    .line 4
    .line 5
    move-wide/from16 v1, p12

    .line 6
    .line 7
    iget-object v4, v0, Lcom/google/android/exoplayer2/source/dash/c$b;->b:Lm8/i;

    .line 8
    .line 9
    invoke-virtual {v0, v13, v14}, Lcom/google/android/exoplayer2/source/dash/c$b;->k(J)J

    .line 10
    .line 11
    .line 12
    move-result-wide v7

    .line 13
    invoke-virtual {v0, v13, v14}, Lcom/google/android/exoplayer2/source/dash/c$b;->l(J)Lm8/h;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    iget-object v5, v4, Lm8/i;->c:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v6, v0, Lcom/google/android/exoplayer2/source/dash/c$b;->a:Lk8/f;

    .line 20
    .line 21
    if-nez v6, :cond_1

    .line 22
    .line 23
    invoke-virtual {v0, v13, v14}, Lcom/google/android/exoplayer2/source/dash/c$b;->i(J)J

    .line 24
    .line 25
    .line 26
    move-result-wide v11

    .line 27
    invoke-virtual {v0, v13, v14, v1, v2}, Lcom/google/android/exoplayer2/source/dash/c$b;->m(JJ)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    const/4 v9, 0x0

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    const/16 v9, 0x8

    .line 36
    .line 37
    :goto_0
    invoke-static {v4, v3, v9}, Ll8/f;->a(Lm8/i;Lm8/h;I)Lcom/google/android/exoplayer2/upstream/a;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    new-instance v15, Lk8/o;

    .line 42
    .line 43
    move-object v0, v15

    .line 44
    move-object/from16 v1, p2

    .line 45
    .line 46
    move-object/from16 v3, p4

    .line 47
    .line 48
    move/from16 v4, p5

    .line 49
    .line 50
    move-object/from16 v5, p6

    .line 51
    .line 52
    move-wide v6, v7

    .line 53
    move-wide v8, v11

    .line 54
    move-wide/from16 v10, p7

    .line 55
    .line 56
    move/from16 v12, p3

    .line 57
    .line 58
    move-object/from16 v13, p4

    .line 59
    .line 60
    invoke-direct/range {v0 .. v13}, Lk8/o;-><init>(Lcom/google/android/exoplayer2/upstream/DataSource;Lcom/google/android/exoplayer2/upstream/a;Le7/k;ILjava/lang/Object;JJJILe7/k;)V

    .line 61
    .line 62
    .line 63
    return-object v15

    .line 64
    :cond_1
    const/4 v6, 0x1

    .line 65
    move/from16 v11, p9

    .line 66
    .line 67
    move v15, v6

    .line 68
    :goto_1
    if-ge v6, v11, :cond_3

    .line 69
    .line 70
    int-to-long v9, v6

    .line 71
    add-long/2addr v9, v13

    .line 72
    invoke-virtual {v0, v9, v10}, Lcom/google/android/exoplayer2/source/dash/c$b;->l(J)Lm8/h;

    .line 73
    .line 74
    .line 75
    move-result-object v9

    .line 76
    invoke-virtual {v3, v9, v5}, Lm8/h;->a(Lm8/h;Ljava/lang/String;)Lm8/h;

    .line 77
    .line 78
    .line 79
    move-result-object v9

    .line 80
    if-nez v9, :cond_2

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_2
    add-int/lit8 v15, v15, 0x1

    .line 84
    .line 85
    add-int/lit8 v6, v6, 0x1

    .line 86
    .line 87
    move-object v3, v9

    .line 88
    goto :goto_1

    .line 89
    :cond_3
    :goto_2
    int-to-long v5, v15

    .line 90
    add-long/2addr v5, v13

    .line 91
    const-wide/16 v9, 0x1

    .line 92
    .line 93
    sub-long/2addr v5, v9

    .line 94
    invoke-virtual {v0, v5, v6}, Lcom/google/android/exoplayer2/source/dash/c$b;->i(J)J

    .line 95
    .line 96
    .line 97
    move-result-wide v9

    .line 98
    invoke-static/range {p1 .. p1}, Lcom/google/android/exoplayer2/source/dash/c$b;->a(Lcom/google/android/exoplayer2/source/dash/c$b;)J

    .line 99
    .line 100
    .line 101
    move-result-wide v17

    .line 102
    const-wide v19, -0x7fffffffffffffffL    # -4.9E-324

    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    cmp-long v11, v17, v19

    .line 108
    .line 109
    if-eqz v11, :cond_4

    .line 110
    .line 111
    cmp-long v11, v17, v9

    .line 112
    .line 113
    if-gtz v11, :cond_4

    .line 114
    .line 115
    move-wide/from16 v21, v17

    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_4
    move-wide/from16 v21, v19

    .line 119
    .line 120
    :goto_3
    invoke-virtual {v0, v5, v6, v1, v2}, Lcom/google/android/exoplayer2/source/dash/c$b;->m(JJ)Z

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    if-eqz v1, :cond_5

    .line 125
    .line 126
    const/4 v12, 0x0

    .line 127
    goto :goto_4

    .line 128
    :cond_5
    const/16 v12, 0x8

    .line 129
    .line 130
    :goto_4
    invoke-static {v4, v3, v12}, Ll8/f;->a(Lm8/i;Lm8/h;I)Lcom/google/android/exoplayer2/upstream/a;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    iget-wide v1, v4, Lm8/i;->d:J

    .line 135
    .line 136
    neg-long v1, v1

    .line 137
    move-wide/from16 v18, v1

    .line 138
    .line 139
    new-instance v23, Lk8/j;

    .line 140
    .line 141
    move-object/from16 v1, v23

    .line 142
    .line 143
    iget-object v0, v0, Lcom/google/android/exoplayer2/source/dash/c$b;->a:Lk8/f;

    .line 144
    .line 145
    move-object/from16 v20, v0

    .line 146
    .line 147
    move-object/from16 v2, p2

    .line 148
    .line 149
    move-object/from16 v4, p4

    .line 150
    .line 151
    move/from16 v5, p5

    .line 152
    .line 153
    move-object/from16 v6, p6

    .line 154
    .line 155
    move-wide/from16 v11, p10

    .line 156
    .line 157
    move-wide/from16 v13, v21

    .line 158
    .line 159
    move v0, v15

    .line 160
    move-wide/from16 v15, p7

    .line 161
    .line 162
    move/from16 v17, v0

    .line 163
    .line 164
    invoke-direct/range {v1 .. v20}, Lk8/j;-><init>(Lcom/google/android/exoplayer2/upstream/DataSource;Lcom/google/android/exoplayer2/upstream/a;Le7/k;ILjava/lang/Object;JJJJJIJLk8/f;)V

    .line 165
    .line 166
    .line 167
    return-object v23
.end method

.method public release()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/c;->h:[Lcom/google/android/exoplayer2/source/dash/c$b;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    if-ge v2, v1, :cond_1

    .line 6
    .line 7
    aget-object v3, v0, v2

    .line 8
    .line 9
    iget-object v3, v3, Lcom/google/android/exoplayer2/source/dash/c$b;->a:Lk8/f;

    .line 10
    .line 11
    if-eqz v3, :cond_0

    .line 12
    .line 13
    invoke-interface {v3}, Lk8/f;->release()V

    .line 14
    .line 15
    .line 16
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    return-void
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
.end method
