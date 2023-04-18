.class public final Lh9/e;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a([BI)Lh9/d;
    .locals 5

    .line 1
    new-instance v0, Lf9/y;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lf9/y;-><init>([B)V

    .line 4
    .line 5
    .line 6
    const/4 p0, 0x0

    .line 7
    :try_start_0
    invoke-static {v0}, Lh9/e;->c(Lf9/y;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-static {v0}, Lh9/e;->f(Lf9/y;)Ljava/util/ArrayList;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-static {v0}, Lh9/e;->e(Lf9/y;)Ljava/util/ArrayList;

    .line 19
    .line 20
    .line 21
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    goto :goto_0

    .line 23
    :catch_0
    move-object v0, p0

    .line 24
    :goto_0
    if-nez v0, :cond_1

    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    const/4 v2, 0x0

    .line 32
    const/4 v3, 0x1

    .line 33
    if-eq v1, v3, :cond_3

    .line 34
    .line 35
    const/4 v4, 0x2

    .line 36
    if-eq v1, v4, :cond_2

    .line 37
    .line 38
    return-object p0

    .line 39
    :cond_2
    new-instance p0, Lh9/d;

    .line 40
    .line 41
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    check-cast v1, Lh9/d$a;

    .line 46
    .line 47
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    check-cast v0, Lh9/d$a;

    .line 52
    .line 53
    invoke-direct {p0, v1, v0, p1}, Lh9/d;-><init>(Lh9/d$a;Lh9/d$a;I)V

    .line 54
    .line 55
    .line 56
    return-object p0

    .line 57
    :cond_3
    new-instance p0, Lh9/d;

    .line 58
    .line 59
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    check-cast v0, Lh9/d$a;

    .line 64
    .line 65
    invoke-direct {p0, v0, p1}, Lh9/d;-><init>(Lh9/d$a;I)V

    .line 66
    .line 67
    .line 68
    return-object p0
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

.method private static b(I)I
    .locals 1

    shr-int/lit8 v0, p0, 0x1

    and-int/lit8 p0, p0, 0x1

    neg-int p0, p0

    xor-int/2addr p0, v0

    return p0
.end method

.method private static c(Lf9/y;)Z
    .locals 2

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-virtual {p0, v0}, Lf9/y;->Q(I)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lf9/y;->n()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-virtual {p0, v1}, Lf9/y;->P(I)V

    .line 11
    .line 12
    .line 13
    const p0, 0x70726f6a

    .line 14
    .line 15
    .line 16
    if-ne v0, p0, :cond_0

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    :cond_0
    return v1
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

.method private static d(Lf9/y;)Lh9/d$a;
    .locals 23

    .line 1
    invoke-virtual/range {p0 .. p0}, Lf9/y;->n()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x2710

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-le v0, v1, :cond_0

    .line 9
    .line 10
    return-object v2

    .line 11
    :cond_0
    new-array v1, v0, [F

    .line 12
    .line 13
    const/4 v4, 0x0

    .line 14
    :goto_0
    if-ge v4, v0, :cond_1

    .line 15
    .line 16
    invoke-virtual/range {p0 .. p0}, Lf9/y;->m()F

    .line 17
    .line 18
    .line 19
    move-result v5

    .line 20
    aput v5, v1, v4

    .line 21
    .line 22
    add-int/lit8 v4, v4, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    invoke-virtual/range {p0 .. p0}, Lf9/y;->n()I

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    const/16 v5, 0x7d00

    .line 30
    .line 31
    if-le v4, v5, :cond_2

    .line 32
    .line 33
    return-object v2

    .line 34
    :cond_2
    const-wide/high16 v5, 0x4000000000000000L    # 2.0

    .line 35
    .line 36
    invoke-static {v5, v6}, Ljava/lang/Math;->log(D)D

    .line 37
    .line 38
    .line 39
    move-result-wide v7

    .line 40
    int-to-double v9, v0

    .line 41
    mul-double/2addr v9, v5

    .line 42
    invoke-static {v9, v10}, Ljava/lang/Math;->log(D)D

    .line 43
    .line 44
    .line 45
    move-result-wide v9

    .line 46
    div-double/2addr v9, v7

    .line 47
    invoke-static {v9, v10}, Ljava/lang/Math;->ceil(D)D

    .line 48
    .line 49
    .line 50
    move-result-wide v9

    .line 51
    double-to-int v9, v9

    .line 52
    new-instance v10, Lf9/x;

    .line 53
    .line 54
    invoke-virtual/range {p0 .. p0}, Lf9/y;->d()[B

    .line 55
    .line 56
    .line 57
    move-result-object v11

    .line 58
    invoke-direct {v10, v11}, Lf9/x;-><init>([B)V

    .line 59
    .line 60
    .line 61
    invoke-virtual/range {p0 .. p0}, Lf9/y;->e()I

    .line 62
    .line 63
    .line 64
    move-result v11

    .line 65
    const/16 v12, 0x8

    .line 66
    .line 67
    mul-int/2addr v11, v12

    .line 68
    invoke-virtual {v10, v11}, Lf9/x;->p(I)V

    .line 69
    .line 70
    .line 71
    mul-int/lit8 v11, v4, 0x5

    .line 72
    .line 73
    new-array v11, v11, [F

    .line 74
    .line 75
    const/4 v13, 0x5

    .line 76
    new-array v14, v13, [I

    .line 77
    .line 78
    const/4 v15, 0x0

    .line 79
    const/16 v16, 0x0

    .line 80
    .line 81
    :goto_1
    if-ge v15, v4, :cond_6

    .line 82
    .line 83
    const/4 v3, 0x0

    .line 84
    :goto_2
    if-ge v3, v13, :cond_5

    .line 85
    .line 86
    aget v17, v14, v3

    .line 87
    .line 88
    invoke-virtual {v10, v9}, Lf9/x;->h(I)I

    .line 89
    .line 90
    .line 91
    move-result v18

    .line 92
    invoke-static/range {v18 .. v18}, Lh9/e;->b(I)I

    .line 93
    .line 94
    .line 95
    move-result v18

    .line 96
    add-int v13, v17, v18

    .line 97
    .line 98
    if-ge v13, v0, :cond_4

    .line 99
    .line 100
    if-gez v13, :cond_3

    .line 101
    .line 102
    goto :goto_3

    .line 103
    :cond_3
    add-int/lit8 v17, v16, 0x1

    .line 104
    .line 105
    aget v18, v1, v13

    .line 106
    .line 107
    aput v18, v11, v16

    .line 108
    .line 109
    aput v13, v14, v3

    .line 110
    .line 111
    add-int/lit8 v3, v3, 0x1

    .line 112
    .line 113
    move/from16 v16, v17

    .line 114
    .line 115
    const/4 v13, 0x5

    .line 116
    goto :goto_2

    .line 117
    :cond_4
    :goto_3
    return-object v2

    .line 118
    :cond_5
    add-int/lit8 v15, v15, 0x1

    .line 119
    .line 120
    const/4 v13, 0x5

    .line 121
    goto :goto_1

    .line 122
    :cond_6
    invoke-virtual {v10}, Lf9/x;->e()I

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    add-int/lit8 v0, v0, 0x7

    .line 127
    .line 128
    and-int/lit8 v0, v0, -0x8

    .line 129
    .line 130
    invoke-virtual {v10, v0}, Lf9/x;->p(I)V

    .line 131
    .line 132
    .line 133
    const/16 v0, 0x20

    .line 134
    .line 135
    invoke-virtual {v10, v0}, Lf9/x;->h(I)I

    .line 136
    .line 137
    .line 138
    move-result v1

    .line 139
    new-array v3, v1, [Lh9/d$b;

    .line 140
    .line 141
    const/4 v9, 0x0

    .line 142
    :goto_4
    if-ge v9, v1, :cond_b

    .line 143
    .line 144
    invoke-virtual {v10, v12}, Lf9/x;->h(I)I

    .line 145
    .line 146
    .line 147
    move-result v13

    .line 148
    invoke-virtual {v10, v12}, Lf9/x;->h(I)I

    .line 149
    .line 150
    .line 151
    move-result v14

    .line 152
    invoke-virtual {v10, v0}, Lf9/x;->h(I)I

    .line 153
    .line 154
    .line 155
    move-result v15

    .line 156
    const v0, 0x1f400

    .line 157
    .line 158
    .line 159
    if-le v15, v0, :cond_7

    .line 160
    .line 161
    return-object v2

    .line 162
    :cond_7
    move/from16 v16, v13

    .line 163
    .line 164
    int-to-double v12, v4

    .line 165
    mul-double/2addr v12, v5

    .line 166
    invoke-static {v12, v13}, Ljava/lang/Math;->log(D)D

    .line 167
    .line 168
    .line 169
    move-result-wide v12

    .line 170
    div-double/2addr v12, v7

    .line 171
    invoke-static {v12, v13}, Ljava/lang/Math;->ceil(D)D

    .line 172
    .line 173
    .line 174
    move-result-wide v12

    .line 175
    double-to-int v12, v12

    .line 176
    mul-int/lit8 v13, v15, 0x3

    .line 177
    .line 178
    new-array v13, v13, [F

    .line 179
    .line 180
    mul-int/lit8 v0, v15, 0x2

    .line 181
    .line 182
    new-array v0, v0, [F

    .line 183
    .line 184
    const/4 v5, 0x0

    .line 185
    const/4 v6, 0x0

    .line 186
    :goto_5
    if-ge v5, v15, :cond_a

    .line 187
    .line 188
    invoke-virtual {v10, v12}, Lf9/x;->h(I)I

    .line 189
    .line 190
    .line 191
    move-result v19

    .line 192
    invoke-static/range {v19 .. v19}, Lh9/e;->b(I)I

    .line 193
    .line 194
    .line 195
    move-result v19

    .line 196
    add-int v6, v6, v19

    .line 197
    .line 198
    if-ltz v6, :cond_9

    .line 199
    .line 200
    if-lt v6, v4, :cond_8

    .line 201
    .line 202
    goto :goto_6

    .line 203
    :cond_8
    mul-int/lit8 v19, v5, 0x3

    .line 204
    .line 205
    mul-int/lit8 v20, v6, 0x5

    .line 206
    .line 207
    aget v21, v11, v20

    .line 208
    .line 209
    aput v21, v13, v19

    .line 210
    .line 211
    add-int/lit8 v21, v19, 0x1

    .line 212
    .line 213
    add-int/lit8 v22, v20, 0x1

    .line 214
    .line 215
    aget v22, v11, v22

    .line 216
    .line 217
    aput v22, v13, v21

    .line 218
    .line 219
    add-int/lit8 v19, v19, 0x2

    .line 220
    .line 221
    add-int/lit8 v21, v20, 0x2

    .line 222
    .line 223
    aget v21, v11, v21

    .line 224
    .line 225
    aput v21, v13, v19

    .line 226
    .line 227
    mul-int/lit8 v19, v5, 0x2

    .line 228
    .line 229
    add-int/lit8 v21, v20, 0x3

    .line 230
    .line 231
    aget v21, v11, v21

    .line 232
    .line 233
    aput v21, v0, v19

    .line 234
    .line 235
    add-int/lit8 v19, v19, 0x1

    .line 236
    .line 237
    add-int/lit8 v20, v20, 0x4

    .line 238
    .line 239
    aget v20, v11, v20

    .line 240
    .line 241
    aput v20, v0, v19

    .line 242
    .line 243
    add-int/lit8 v5, v5, 0x1

    .line 244
    .line 245
    goto :goto_5

    .line 246
    :cond_9
    :goto_6
    return-object v2

    .line 247
    :cond_a
    new-instance v5, Lh9/d$b;

    .line 248
    .line 249
    move/from16 v6, v16

    .line 250
    .line 251
    invoke-direct {v5, v6, v13, v0, v14}, Lh9/d$b;-><init>(I[F[FI)V

    .line 252
    .line 253
    .line 254
    aput-object v5, v3, v9

    .line 255
    .line 256
    add-int/lit8 v9, v9, 0x1

    .line 257
    .line 258
    const/16 v0, 0x20

    .line 259
    .line 260
    const-wide/high16 v5, 0x4000000000000000L    # 2.0

    .line 261
    .line 262
    const/16 v12, 0x8

    .line 263
    .line 264
    goto :goto_4

    .line 265
    :cond_b
    new-instance v0, Lh9/d$a;

    .line 266
    .line 267
    invoke-direct {v0, v3}, Lh9/d$a;-><init>([Lh9/d$b;)V

    .line 268
    .line 269
    .line 270
    return-object v0
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
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
.end method

.method private static e(Lf9/y;)Ljava/util/ArrayList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf9/y;",
            ")",
            "Ljava/util/ArrayList<",
            "Lh9/d$a;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lf9/y;->D()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return-object v1

    .line 9
    :cond_0
    const/4 v0, 0x7

    .line 10
    invoke-virtual {p0, v0}, Lf9/y;->Q(I)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lf9/y;->n()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const v2, 0x64666c38

    .line 18
    .line 19
    .line 20
    if-ne v0, v2, :cond_2

    .line 21
    .line 22
    new-instance v0, Lf9/y;

    .line 23
    .line 24
    invoke-direct {v0}, Lf9/y;-><init>()V

    .line 25
    .line 26
    .line 27
    new-instance v2, Ljava/util/zip/Inflater;

    .line 28
    .line 29
    const/4 v3, 0x1

    .line 30
    invoke-direct {v2, v3}, Ljava/util/zip/Inflater;-><init>(Z)V

    .line 31
    .line 32
    .line 33
    :try_start_0
    invoke-static {p0, v0, v2}, Lf9/q0;->n0(Lf9/y;Lf9/y;Ljava/util/zip/Inflater;)Z

    .line 34
    .line 35
    .line 36
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    if-nez p0, :cond_1

    .line 38
    .line 39
    invoke-virtual {v2}, Ljava/util/zip/Inflater;->end()V

    .line 40
    .line 41
    .line 42
    return-object v1

    .line 43
    :cond_1
    invoke-virtual {v2}, Ljava/util/zip/Inflater;->end()V

    .line 44
    .line 45
    .line 46
    move-object p0, v0

    .line 47
    goto :goto_0

    .line 48
    :catchall_0
    move-exception p0

    .line 49
    invoke-virtual {v2}, Ljava/util/zip/Inflater;->end()V

    .line 50
    .line 51
    .line 52
    throw p0

    .line 53
    :cond_2
    const v2, 0x72617720

    .line 54
    .line 55
    .line 56
    if-eq v0, v2, :cond_3

    .line 57
    .line 58
    return-object v1

    .line 59
    :cond_3
    :goto_0
    invoke-static {p0}, Lh9/e;->g(Lf9/y;)Ljava/util/ArrayList;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    return-object p0
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

.method private static f(Lf9/y;)Ljava/util/ArrayList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf9/y;",
            ")",
            "Ljava/util/ArrayList<",
            "Lh9/d$a;",
            ">;"
        }
    .end annotation

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lf9/y;->Q(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lf9/y;->e()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-virtual {p0}, Lf9/y;->f()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    :goto_0
    const/4 v2, 0x0

    .line 15
    if-ge v0, v1, :cond_3

    .line 16
    .line 17
    invoke-virtual {p0}, Lf9/y;->n()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    add-int/2addr v3, v0

    .line 22
    if-le v3, v0, :cond_3

    .line 23
    .line 24
    if-le v3, v1, :cond_0

    .line 25
    .line 26
    goto :goto_2

    .line 27
    :cond_0
    invoke-virtual {p0}, Lf9/y;->n()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    const v2, 0x79746d70

    .line 32
    .line 33
    .line 34
    if-eq v0, v2, :cond_2

    .line 35
    .line 36
    const v2, 0x6d736870

    .line 37
    .line 38
    .line 39
    if-ne v0, v2, :cond_1

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    invoke-virtual {p0, v3}, Lf9/y;->P(I)V

    .line 43
    .line 44
    .line 45
    move v0, v3

    .line 46
    goto :goto_0

    .line 47
    :cond_2
    :goto_1
    invoke-virtual {p0, v3}, Lf9/y;->O(I)V

    .line 48
    .line 49
    .line 50
    invoke-static {p0}, Lh9/e;->e(Lf9/y;)Ljava/util/ArrayList;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    return-object p0

    .line 55
    :cond_3
    :goto_2
    return-object v2
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

.method private static g(Lf9/y;)Ljava/util/ArrayList;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf9/y;",
            ")",
            "Ljava/util/ArrayList<",
            "Lh9/d$a;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lf9/y;->e()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-virtual {p0}, Lf9/y;->f()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    :goto_0
    if-ge v1, v2, :cond_4

    .line 15
    .line 16
    invoke-virtual {p0}, Lf9/y;->n()I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    add-int/2addr v3, v1

    .line 21
    const/4 v4, 0x0

    .line 22
    if-le v3, v1, :cond_3

    .line 23
    .line 24
    if-le v3, v2, :cond_0

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_0
    invoke-virtual {p0}, Lf9/y;->n()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    const v5, 0x6d657368

    .line 32
    .line 33
    .line 34
    if-ne v1, v5, :cond_2

    .line 35
    .line 36
    invoke-static {p0}, Lh9/e;->d(Lf9/y;)Lh9/d$a;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    if-nez v1, :cond_1

    .line 41
    .line 42
    return-object v4

    .line 43
    :cond_1
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    :cond_2
    invoke-virtual {p0, v3}, Lf9/y;->P(I)V

    .line 47
    .line 48
    .line 49
    move v1, v3

    .line 50
    goto :goto_0

    .line 51
    :cond_3
    :goto_1
    return-object v4

    .line 52
    :cond_4
    return-object v0
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
