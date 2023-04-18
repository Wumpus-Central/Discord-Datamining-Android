.class final Ls7/n;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:[I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x1d

    .line 2
    .line 3
    new-array v0, v0, [I

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, Ls7/n;->a:[I

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 4
        0x69736f6d
        0x69736f32
        0x69736f33
        0x69736f34
        0x69736f35
        0x69736f36
        0x69736f39
        0x61766331
        0x68766331
        0x68657631
        0x61763031
        0x6d703431
        0x6d703432
        0x33673261
        0x33673262
        0x33677236
        0x33677336
        0x33676536
        0x33676736
        0x4d345620    # 1.89096448E8f
        0x4d344120    # 1.89010432E8f
        0x66347620
        0x6b646469
        0x4d345650
        0x71742020
        0x4d534e56    # 2.215704E8f
        0x64627931
        0x69736d6c
        0x70696666
    .end array-data
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

.method private static a(IZ)Z
    .locals 5

    ushr-int/lit8 v0, p0, 0x8

    const v1, 0x336770

    const/4 v2, 0x1

    if-ne v0, v1, :cond_0

    return v2

    :cond_0
    const v0, 0x68656963

    if-ne p0, v0, :cond_1

    if-eqz p1, :cond_1

    return v2

    :cond_1
    sget-object p1, Ls7/n;->a:[I

    array-length v0, p1

    const/4 v1, 0x0

    move v3, v1

    :goto_0
    if-ge v3, v0, :cond_3

    aget v4, p1, v3

    if-ne v4, p0, :cond_2

    return v2

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    return v1
.end method

.method public static b(Ll7/j;)Z
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Ls7/n;->c(Ll7/j;ZZ)Z

    move-result p0

    return p0
.end method

.method private static c(Ll7/j;ZZ)Z
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-interface/range {p0 .. p0}, Ll7/j;->getLength()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    const-wide/16 v3, -0x1

    .line 8
    .line 9
    cmp-long v5, v1, v3

    .line 10
    .line 11
    const-wide/16 v6, 0x1000

    .line 12
    .line 13
    if-eqz v5, :cond_1

    .line 14
    .line 15
    cmp-long v8, v1, v6

    .line 16
    .line 17
    if-lez v8, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move-wide v6, v1

    .line 21
    :cond_1
    :goto_0
    long-to-int v6, v6

    .line 22
    new-instance v7, Lf9/y;

    .line 23
    .line 24
    const/16 v8, 0x40

    .line 25
    .line 26
    invoke-direct {v7, v8}, Lf9/y;-><init>(I)V

    .line 27
    .line 28
    .line 29
    const/4 v8, 0x0

    .line 30
    move v9, v8

    .line 31
    move v10, v9

    .line 32
    :goto_1
    const/4 v11, 0x1

    .line 33
    if-ge v9, v6, :cond_12

    .line 34
    .line 35
    const/16 v12, 0x8

    .line 36
    .line 37
    invoke-virtual {v7, v12}, Lf9/y;->L(I)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v7}, Lf9/y;->d()[B

    .line 41
    .line 42
    .line 43
    move-result-object v13

    .line 44
    invoke-interface {v0, v13, v8, v12, v11}, Ll7/j;->d([BIIZ)Z

    .line 45
    .line 46
    .line 47
    move-result v13

    .line 48
    if-nez v13, :cond_2

    .line 49
    .line 50
    goto/16 :goto_9

    .line 51
    .line 52
    :cond_2
    invoke-virtual {v7}, Lf9/y;->F()J

    .line 53
    .line 54
    .line 55
    move-result-wide v13

    .line 56
    invoke-virtual {v7}, Lf9/y;->n()I

    .line 57
    .line 58
    .line 59
    move-result v15

    .line 60
    const-wide/16 v16, 0x1

    .line 61
    .line 62
    cmp-long v16, v13, v16

    .line 63
    .line 64
    if-nez v16, :cond_3

    .line 65
    .line 66
    invoke-virtual {v7}, Lf9/y;->d()[B

    .line 67
    .line 68
    .line 69
    move-result-object v13

    .line 70
    invoke-interface {v0, v13, v12, v12}, Ll7/j;->n([BII)V

    .line 71
    .line 72
    .line 73
    const/16 v13, 0x10

    .line 74
    .line 75
    invoke-virtual {v7, v13}, Lf9/y;->O(I)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v7}, Lf9/y;->w()J

    .line 79
    .line 80
    .line 81
    move-result-wide v16

    .line 82
    move v3, v13

    .line 83
    move-wide/from16 v13, v16

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_3
    const-wide/16 v16, 0x0

    .line 87
    .line 88
    cmp-long v16, v13, v16

    .line 89
    .line 90
    if-nez v16, :cond_4

    .line 91
    .line 92
    invoke-interface/range {p0 .. p0}, Ll7/j;->getLength()J

    .line 93
    .line 94
    .line 95
    move-result-wide v16

    .line 96
    cmp-long v18, v16, v3

    .line 97
    .line 98
    if-eqz v18, :cond_4

    .line 99
    .line 100
    invoke-interface/range {p0 .. p0}, Ll7/j;->e()J

    .line 101
    .line 102
    .line 103
    move-result-wide v13

    .line 104
    sub-long v16, v16, v13

    .line 105
    .line 106
    int-to-long v13, v12

    .line 107
    add-long v13, v16, v13

    .line 108
    .line 109
    :cond_4
    move v3, v12

    .line 110
    :goto_2
    int-to-long v11, v3

    .line 111
    cmp-long v19, v13, v11

    .line 112
    .line 113
    if-gez v19, :cond_5

    .line 114
    .line 115
    return v8

    .line 116
    :cond_5
    add-int/2addr v9, v3

    .line 117
    const v3, 0x6d6f6f76

    .line 118
    .line 119
    .line 120
    if-ne v15, v3, :cond_7

    .line 121
    .line 122
    long-to-int v3, v13

    .line 123
    add-int/2addr v6, v3

    .line 124
    if-eqz v5, :cond_6

    .line 125
    .line 126
    int-to-long v3, v6

    .line 127
    cmp-long v3, v3, v1

    .line 128
    .line 129
    if-lez v3, :cond_6

    .line 130
    .line 131
    long-to-int v6, v1

    .line 132
    :cond_6
    :goto_3
    const-wide/16 v3, -0x1

    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_7
    const v3, 0x6d6f6f66

    .line 136
    .line 137
    .line 138
    if-eq v15, v3, :cond_11

    .line 139
    .line 140
    const v3, 0x6d766578

    .line 141
    .line 142
    .line 143
    if-ne v15, v3, :cond_8

    .line 144
    .line 145
    goto :goto_8

    .line 146
    :cond_8
    move v3, v5

    .line 147
    int-to-long v4, v9

    .line 148
    add-long/2addr v4, v13

    .line 149
    sub-long/2addr v4, v11

    .line 150
    move/from16 v20, v9

    .line 151
    .line 152
    int-to-long v8, v6

    .line 153
    cmp-long v4, v4, v8

    .line 154
    .line 155
    if-ltz v4, :cond_9

    .line 156
    .line 157
    const/4 v5, 0x0

    .line 158
    const/4 v8, 0x1

    .line 159
    goto :goto_a

    .line 160
    :cond_9
    sub-long/2addr v13, v11

    .line 161
    long-to-int v4, v13

    .line 162
    add-int v9, v20, v4

    .line 163
    .line 164
    const v5, 0x66747970

    .line 165
    .line 166
    .line 167
    if-ne v15, v5, :cond_f

    .line 168
    .line 169
    const/16 v5, 0x8

    .line 170
    .line 171
    if-ge v4, v5, :cond_a

    .line 172
    .line 173
    const/4 v5, 0x0

    .line 174
    return v5

    .line 175
    :cond_a
    const/4 v5, 0x0

    .line 176
    invoke-virtual {v7, v4}, Lf9/y;->L(I)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v7}, Lf9/y;->d()[B

    .line 180
    .line 181
    .line 182
    move-result-object v8

    .line 183
    invoke-interface {v0, v8, v5, v4}, Ll7/j;->n([BII)V

    .line 184
    .line 185
    .line 186
    div-int/lit8 v4, v4, 0x4

    .line 187
    .line 188
    const/4 v5, 0x0

    .line 189
    :goto_4
    if-ge v5, v4, :cond_d

    .line 190
    .line 191
    const/4 v8, 0x1

    .line 192
    if-ne v5, v8, :cond_b

    .line 193
    .line 194
    const/4 v11, 0x4

    .line 195
    invoke-virtual {v7, v11}, Lf9/y;->Q(I)V

    .line 196
    .line 197
    .line 198
    move/from16 v12, p2

    .line 199
    .line 200
    goto :goto_5

    .line 201
    :cond_b
    invoke-virtual {v7}, Lf9/y;->n()I

    .line 202
    .line 203
    .line 204
    move-result v11

    .line 205
    move/from16 v12, p2

    .line 206
    .line 207
    invoke-static {v11, v12}, Ls7/n;->a(IZ)Z

    .line 208
    .line 209
    .line 210
    move-result v11

    .line 211
    if-eqz v11, :cond_c

    .line 212
    .line 213
    move v10, v8

    .line 214
    goto :goto_6

    .line 215
    :cond_c
    :goto_5
    add-int/lit8 v5, v5, 0x1

    .line 216
    .line 217
    goto :goto_4

    .line 218
    :cond_d
    move/from16 v12, p2

    .line 219
    .line 220
    :goto_6
    if-nez v10, :cond_e

    .line 221
    .line 222
    const/4 v5, 0x0

    .line 223
    return v5

    .line 224
    :cond_e
    const/4 v5, 0x0

    .line 225
    goto :goto_7

    .line 226
    :cond_f
    move/from16 v12, p2

    .line 227
    .line 228
    const/4 v5, 0x0

    .line 229
    if-eqz v4, :cond_10

    .line 230
    .line 231
    invoke-interface {v0, v4}, Ll7/j;->g(I)V

    .line 232
    .line 233
    .line 234
    :cond_10
    :goto_7
    move v8, v5

    .line 235
    move v5, v3

    .line 236
    goto :goto_3

    .line 237
    :cond_11
    :goto_8
    move v5, v8

    .line 238
    const/4 v8, 0x1

    .line 239
    move v0, v8

    .line 240
    goto :goto_b

    .line 241
    :cond_12
    :goto_9
    move v5, v8

    .line 242
    move v8, v11

    .line 243
    :goto_a
    move v0, v5

    .line 244
    :goto_b
    if-eqz v10, :cond_13

    .line 245
    .line 246
    move/from16 v1, p1

    .line 247
    .line 248
    if-ne v1, v0, :cond_13

    .line 249
    .line 250
    goto :goto_c

    .line 251
    :cond_13
    move v8, v5

    .line 252
    :goto_c
    return v8
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

.method public static d(Ll7/j;Z)Z
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0, p1}, Ls7/n;->c(Ll7/j;ZZ)Z

    move-result p0

    return p0
.end method
