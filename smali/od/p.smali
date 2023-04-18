.class public abstract Lod/p;
.super Lod/k;
.source "SourceFile"


# static fields
.field static final d:[I

.field static final e:[I

.field static final f:[I

.field static final g:[[I

.field static final h:[[I


# instance fields
.field private final a:Ljava/lang/StringBuilder;

.field private final b:Lod/o;

.field private final c:Lod/g;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    const/4 v0, 0x3

    .line 2
    new-array v1, v0, [I

    .line 3
    .line 4
    fill-array-data v1, :array_0

    .line 5
    .line 6
    .line 7
    sput-object v1, Lod/p;->d:[I

    .line 8
    .line 9
    const/4 v1, 0x5

    .line 10
    new-array v2, v1, [I

    .line 11
    .line 12
    fill-array-data v2, :array_1

    .line 13
    .line 14
    .line 15
    sput-object v2, Lod/p;->e:[I

    .line 16
    .line 17
    const/4 v2, 0x6

    .line 18
    new-array v3, v2, [I

    .line 19
    .line 20
    fill-array-data v3, :array_2

    .line 21
    .line 22
    .line 23
    sput-object v3, Lod/p;->f:[I

    .line 24
    .line 25
    const/16 v3, 0xa

    .line 26
    .line 27
    new-array v4, v3, [[I

    .line 28
    .line 29
    const/4 v5, 0x4

    .line 30
    new-array v6, v5, [I

    .line 31
    .line 32
    fill-array-data v6, :array_3

    .line 33
    .line 34
    .line 35
    const/4 v7, 0x0

    .line 36
    aput-object v6, v4, v7

    .line 37
    .line 38
    new-array v6, v5, [I

    .line 39
    .line 40
    fill-array-data v6, :array_4

    .line 41
    .line 42
    .line 43
    const/4 v8, 0x1

    .line 44
    aput-object v6, v4, v8

    .line 45
    .line 46
    new-array v6, v5, [I

    .line 47
    .line 48
    fill-array-data v6, :array_5

    .line 49
    .line 50
    .line 51
    const/4 v9, 0x2

    .line 52
    aput-object v6, v4, v9

    .line 53
    .line 54
    new-array v6, v5, [I

    .line 55
    .line 56
    fill-array-data v6, :array_6

    .line 57
    .line 58
    .line 59
    aput-object v6, v4, v0

    .line 60
    .line 61
    new-array v0, v5, [I

    .line 62
    .line 63
    fill-array-data v0, :array_7

    .line 64
    .line 65
    .line 66
    aput-object v0, v4, v5

    .line 67
    .line 68
    new-array v0, v5, [I

    .line 69
    .line 70
    fill-array-data v0, :array_8

    .line 71
    .line 72
    .line 73
    aput-object v0, v4, v1

    .line 74
    .line 75
    new-array v0, v5, [I

    .line 76
    .line 77
    fill-array-data v0, :array_9

    .line 78
    .line 79
    .line 80
    aput-object v0, v4, v2

    .line 81
    .line 82
    new-array v0, v5, [I

    .line 83
    .line 84
    fill-array-data v0, :array_a

    .line 85
    .line 86
    .line 87
    const/4 v1, 0x7

    .line 88
    aput-object v0, v4, v1

    .line 89
    .line 90
    new-array v0, v5, [I

    .line 91
    .line 92
    fill-array-data v0, :array_b

    .line 93
    .line 94
    .line 95
    const/16 v1, 0x8

    .line 96
    .line 97
    aput-object v0, v4, v1

    .line 98
    .line 99
    new-array v0, v5, [I

    .line 100
    .line 101
    fill-array-data v0, :array_c

    .line 102
    .line 103
    .line 104
    const/16 v1, 0x9

    .line 105
    .line 106
    aput-object v0, v4, v1

    .line 107
    .line 108
    sput-object v4, Lod/p;->g:[[I

    .line 109
    .line 110
    const/16 v0, 0x14

    .line 111
    .line 112
    new-array v1, v0, [[I

    .line 113
    .line 114
    sput-object v1, Lod/p;->h:[[I

    .line 115
    .line 116
    invoke-static {v4, v7, v1, v7, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 117
    .line 118
    .line 119
    :goto_0
    if-ge v3, v0, :cond_1

    .line 120
    .line 121
    sget-object v1, Lod/p;->g:[[I

    .line 122
    .line 123
    add-int/lit8 v2, v3, -0xa

    .line 124
    .line 125
    aget-object v1, v1, v2

    .line 126
    .line 127
    array-length v2, v1

    .line 128
    new-array v2, v2, [I

    .line 129
    .line 130
    move v4, v7

    .line 131
    :goto_1
    array-length v5, v1

    .line 132
    if-ge v4, v5, :cond_0

    .line 133
    .line 134
    array-length v5, v1

    .line 135
    sub-int/2addr v5, v4

    .line 136
    sub-int/2addr v5, v8

    .line 137
    aget v5, v1, v5

    .line 138
    .line 139
    aput v5, v2, v4

    .line 140
    .line 141
    add-int/lit8 v4, v4, 0x1

    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_0
    sget-object v1, Lod/p;->h:[[I

    .line 145
    .line 146
    aput-object v2, v1, v3

    .line 147
    .line 148
    add-int/lit8 v3, v3, 0x1

    .line 149
    .line 150
    goto :goto_0

    .line 151
    :cond_1
    return-void

    .line 152
    nop

    .line 153
    :array_0
    .array-data 4
        0x1
        0x1
        0x1
    .end array-data

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
    :array_1
    .array-data 4
        0x1
        0x1
        0x1
        0x1
        0x1
    .end array-data

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
    :array_2
    .array-data 4
        0x1
        0x1
        0x1
        0x1
        0x1
        0x1
    .end array-data

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
    :array_3
    .array-data 4
        0x3
        0x2
        0x1
        0x1
    .end array-data

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
    :array_4
    .array-data 4
        0x2
        0x2
        0x2
        0x1
    .end array-data

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
    :array_5
    .array-data 4
        0x2
        0x1
        0x2
        0x2
    .end array-data

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
    :array_6
    .array-data 4
        0x1
        0x4
        0x1
        0x1
    .end array-data

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
    :array_7
    .array-data 4
        0x1
        0x1
        0x3
        0x2
    .end array-data

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
    :array_8
    .array-data 4
        0x1
        0x2
        0x3
        0x1
    .end array-data

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
    :array_9
    .array-data 4
        0x1
        0x1
        0x1
        0x4
    .end array-data

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
    :array_a
    .array-data 4
        0x1
        0x3
        0x1
        0x2
    .end array-data

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
    :array_b
    .array-data 4
        0x1
        0x2
        0x1
        0x3
    .end array-data

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
    :array_c
    .array-data 4
        0x3
        0x1
        0x1
        0x2
    .end array-data
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

.method protected constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lod/k;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    const/16 v1, 0x14

    .line 7
    .line 8
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lod/p;->a:Ljava/lang/StringBuilder;

    .line 12
    .line 13
    new-instance v0, Lod/o;

    .line 14
    .line 15
    invoke-direct {v0}, Lod/o;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lod/p;->b:Lod/o;

    .line 19
    .line 20
    new-instance v0, Lod/g;

    .line 21
    .line 22
    invoke-direct {v0}, Lod/g;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Lod/p;->c:Lod/g;

    .line 26
    .line 27
    return-void
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
.end method

.method static h(Ljava/lang/CharSequence;)Z
    .locals 5

    .line 1
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    const/4 v2, 0x1

    .line 10
    sub-int/2addr v0, v2

    .line 11
    invoke-interface {p0, v0}, Ljava/lang/CharSequence;->charAt(I)C

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    const/16 v4, 0xa

    .line 16
    .line 17
    invoke-static {v3, v4}, Ljava/lang/Character;->digit(CI)I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    invoke-interface {p0, v1, v0}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-static {p0}, Lod/p;->q(Ljava/lang/CharSequence;)I

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    if-ne p0, v3, :cond_1

    .line 30
    .line 31
    return v2

    .line 32
    :cond_1
    return v1
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
.end method

.method static i(Lgd/a;[II[[I)I
    .locals 4

    .line 1
    invoke-static {p0, p2, p1}, Lod/k;->e(Lgd/a;I[I)V

    .line 2
    .line 3
    .line 4
    array-length p0, p3

    .line 5
    const p2, 0x3ef5c28f    # 0.48f

    .line 6
    .line 7
    .line 8
    const/4 v0, -0x1

    .line 9
    const/4 v1, 0x0

    .line 10
    :goto_0
    if-ge v1, p0, :cond_1

    .line 11
    .line 12
    aget-object v2, p3, v1

    .line 13
    .line 14
    const v3, 0x3f333333    # 0.7f

    .line 15
    .line 16
    .line 17
    invoke-static {p1, v2, v3}, Lod/k;->d([I[IF)F

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    cmpg-float v3, v2, p2

    .line 22
    .line 23
    if-gez v3, :cond_0

    .line 24
    .line 25
    move v0, v1

    .line 26
    move p2, v2

    .line 27
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    if-ltz v0, :cond_2

    .line 31
    .line 32
    return v0

    .line 33
    :cond_2
    invoke-static {}, Lcd/j;->a()Lcd/j;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    throw p0
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
.end method

.method static m(Lgd/a;IZ[I)[I
    .locals 1

    array-length v0, p3

    new-array v0, v0, [I

    invoke-static {p0, p1, p2, p3, v0}, Lod/p;->n(Lgd/a;IZ[I[I)[I

    move-result-object p0

    return-object p0
.end method

.method private static n(Lgd/a;IZ[I[I)[I
    .locals 9

    .line 1
    invoke-virtual {p0}, Lgd/a;->j()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lgd/a;->h(I)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {p0, p1}, Lgd/a;->g(I)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    :goto_0
    array-length v1, p3

    .line 17
    const/4 v2, 0x0

    .line 18
    move v3, p2

    .line 19
    move v4, v2

    .line 20
    move p2, p1

    .line 21
    :goto_1
    if-ge p1, v0, :cond_4

    .line 22
    .line 23
    invoke-virtual {p0, p1}, Lgd/a;->d(I)Z

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    const/4 v6, 0x1

    .line 28
    if-eq v5, v3, :cond_1

    .line 29
    .line 30
    aget v5, p4, v4

    .line 31
    .line 32
    add-int/2addr v5, v6

    .line 33
    aput v5, p4, v4

    .line 34
    .line 35
    goto :goto_3

    .line 36
    :cond_1
    add-int/lit8 v5, v1, -0x1

    .line 37
    .line 38
    if-ne v4, v5, :cond_3

    .line 39
    .line 40
    const v5, 0x3f333333    # 0.7f

    .line 41
    .line 42
    .line 43
    invoke-static {p4, p3, v5}, Lod/k;->d([I[IF)F

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    const v7, 0x3ef5c28f    # 0.48f

    .line 48
    .line 49
    .line 50
    cmpg-float v5, v5, v7

    .line 51
    .line 52
    const/4 v7, 0x2

    .line 53
    if-gez v5, :cond_2

    .line 54
    .line 55
    new-array p0, v7, [I

    .line 56
    .line 57
    aput p2, p0, v2

    .line 58
    .line 59
    aput p1, p0, v6

    .line 60
    .line 61
    return-object p0

    .line 62
    :cond_2
    aget v5, p4, v2

    .line 63
    .line 64
    aget v8, p4, v6

    .line 65
    .line 66
    add-int/2addr v5, v8

    .line 67
    add-int/2addr p2, v5

    .line 68
    add-int/lit8 v5, v4, -0x1

    .line 69
    .line 70
    invoke-static {p4, v7, p4, v2, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 71
    .line 72
    .line 73
    aput v2, p4, v5

    .line 74
    .line 75
    aput v2, p4, v4

    .line 76
    .line 77
    add-int/lit8 v4, v4, -0x1

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_3
    add-int/lit8 v4, v4, 0x1

    .line 81
    .line 82
    :goto_2
    aput v6, p4, v4

    .line 83
    .line 84
    xor-int/lit8 v3, v3, 0x1

    .line 85
    .line 86
    :goto_3
    add-int/lit8 p1, p1, 0x1

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_4
    invoke-static {}, Lcd/j;->a()Lcd/j;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    throw p0
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

.method static o(Lgd/a;)[I
    .locals 7

    .line 1
    sget-object v0, Lod/p;->d:[I

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    new-array v0, v0, [I

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x0

    .line 8
    move v3, v1

    .line 9
    move v4, v3

    .line 10
    :goto_0
    if-nez v3, :cond_1

    .line 11
    .line 12
    sget-object v2, Lod/p;->d:[I

    .line 13
    .line 14
    array-length v5, v2

    .line 15
    invoke-static {v0, v1, v5, v1}, Ljava/util/Arrays;->fill([IIII)V

    .line 16
    .line 17
    .line 18
    invoke-static {p0, v4, v1, v2, v0}, Lod/p;->n(Lgd/a;IZ[I[I)[I

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    aget v4, v2, v1

    .line 23
    .line 24
    const/4 v5, 0x1

    .line 25
    aget v5, v2, v5

    .line 26
    .line 27
    sub-int v6, v5, v4

    .line 28
    .line 29
    sub-int v6, v4, v6

    .line 30
    .line 31
    if-ltz v6, :cond_0

    .line 32
    .line 33
    invoke-virtual {p0, v6, v4, v1}, Lgd/a;->k(IIZ)Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    :cond_0
    move v4, v5

    .line 38
    goto :goto_0

    .line 39
    :cond_1
    return-object v2
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
.end method

.method static q(Ljava/lang/CharSequence;)I
    .locals 5

    .line 1
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/lit8 v1, v0, -0x1

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    :goto_0
    const/16 v3, 0x9

    .line 9
    .line 10
    if-ltz v1, :cond_1

    .line 11
    .line 12
    invoke-interface {p0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 13
    .line 14
    .line 15
    move-result v4

    .line 16
    add-int/lit8 v4, v4, -0x30

    .line 17
    .line 18
    if-ltz v4, :cond_0

    .line 19
    .line 20
    if-gt v4, v3, :cond_0

    .line 21
    .line 22
    add-int/2addr v2, v4

    .line 23
    add-int/lit8 v1, v1, -0x2

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-static {}, Lcd/f;->a()Lcd/f;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    throw p0

    .line 31
    :cond_1
    mul-int/lit8 v2, v2, 0x3

    .line 32
    .line 33
    add-int/lit8 v0, v0, -0x2

    .line 34
    .line 35
    :goto_1
    if-ltz v0, :cond_3

    .line 36
    .line 37
    invoke-interface {p0, v0}, Ljava/lang/CharSequence;->charAt(I)C

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    add-int/lit8 v1, v1, -0x30

    .line 42
    .line 43
    if-ltz v1, :cond_2

    .line 44
    .line 45
    if-gt v1, v3, :cond_2

    .line 46
    .line 47
    add-int/2addr v2, v1

    .line 48
    add-int/lit8 v0, v0, -0x2

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_2
    invoke-static {}, Lcd/f;->a()Lcd/f;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    throw p0

    .line 56
    :cond_3
    rsub-int p0, v2, 0x3e8

    .line 57
    .line 58
    rem-int/lit8 p0, p0, 0xa

    .line 59
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
.end method


# virtual methods
.method public b(ILgd/a;Ljava/util/Map;)Lcom/google/zxing/Result;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lgd/a;",
            "Ljava/util/Map<",
            "Lcd/e;",
            "*>;)",
            "Lcom/google/zxing/Result;"
        }
    .end annotation

    invoke-static {p2}, Lod/p;->o(Lgd/a;)[I

    move-result-object v0

    invoke-virtual {p0, p1, p2, v0, p3}, Lod/p;->l(ILgd/a;[ILjava/util/Map;)Lcom/google/zxing/Result;

    move-result-object p1

    return-object p1
.end method

.method g(Ljava/lang/String;)Z
    .locals 0

    invoke-static {p1}, Lod/p;->h(Ljava/lang/CharSequence;)Z

    move-result p1

    return p1
.end method

.method j(Lgd/a;I)[I
    .locals 2

    const/4 v0, 0x0

    sget-object v1, Lod/p;->d:[I

    invoke-static {p1, p2, v0, v1}, Lod/p;->m(Lgd/a;IZ[I)[I

    move-result-object p1

    return-object p1
.end method

.method protected abstract k(Lgd/a;[ILjava/lang/StringBuilder;)I
.end method

.method public l(ILgd/a;[ILjava/util/Map;)Lcom/google/zxing/Result;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lgd/a;",
            "[I",
            "Ljava/util/Map<",
            "Lcd/e;",
            "*>;)",
            "Lcom/google/zxing/Result;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p4, :cond_0

    .line 3
    .line 4
    move-object v1, v0

    .line 5
    goto :goto_0

    .line 6
    :cond_0
    sget-object v1, Lcd/e;->u:Lcd/e;

    .line 7
    .line 8
    invoke-interface {p4, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Lcd/p;

    .line 13
    .line 14
    :goto_0
    const/high16 v2, 0x40000000    # 2.0f

    .line 15
    .line 16
    const/4 v3, 0x1

    .line 17
    const/4 v4, 0x0

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    new-instance v5, Lcd/o;

    .line 21
    .line 22
    aget v6, p3, v4

    .line 23
    .line 24
    aget v7, p3, v3

    .line 25
    .line 26
    add-int/2addr v6, v7

    .line 27
    int-to-float v6, v6

    .line 28
    div-float/2addr v6, v2

    .line 29
    int-to-float v7, p1

    .line 30
    invoke-direct {v5, v6, v7}, Lcd/o;-><init>(FF)V

    .line 31
    .line 32
    .line 33
    invoke-interface {v1, v5}, Lcd/p;->a(Lcd/o;)V

    .line 34
    .line 35
    .line 36
    :cond_1
    iget-object v5, p0, Lod/p;->a:Ljava/lang/StringBuilder;

    .line 37
    .line 38
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, p2, p3, v5}, Lod/p;->k(Lgd/a;[ILjava/lang/StringBuilder;)I

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    if-eqz v1, :cond_2

    .line 46
    .line 47
    new-instance v7, Lcd/o;

    .line 48
    .line 49
    int-to-float v8, v6

    .line 50
    int-to-float v9, p1

    .line 51
    invoke-direct {v7, v8, v9}, Lcd/o;-><init>(FF)V

    .line 52
    .line 53
    .line 54
    invoke-interface {v1, v7}, Lcd/p;->a(Lcd/o;)V

    .line 55
    .line 56
    .line 57
    :cond_2
    invoke-virtual {p0, p2, v6}, Lod/p;->j(Lgd/a;I)[I

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    if-eqz v1, :cond_3

    .line 62
    .line 63
    new-instance v7, Lcd/o;

    .line 64
    .line 65
    aget v8, v6, v4

    .line 66
    .line 67
    aget v9, v6, v3

    .line 68
    .line 69
    add-int/2addr v8, v9

    .line 70
    int-to-float v8, v8

    .line 71
    div-float/2addr v8, v2

    .line 72
    int-to-float v9, p1

    .line 73
    invoke-direct {v7, v8, v9}, Lcd/o;-><init>(FF)V

    .line 74
    .line 75
    .line 76
    invoke-interface {v1, v7}, Lcd/p;->a(Lcd/o;)V

    .line 77
    .line 78
    .line 79
    :cond_3
    aget v1, v6, v3

    .line 80
    .line 81
    aget v7, v6, v4

    .line 82
    .line 83
    sub-int v7, v1, v7

    .line 84
    .line 85
    add-int/2addr v7, v1

    .line 86
    invoke-virtual {p2}, Lgd/a;->j()I

    .line 87
    .line 88
    .line 89
    move-result v8

    .line 90
    if-ge v7, v8, :cond_d

    .line 91
    .line 92
    invoke-virtual {p2, v1, v7, v4}, Lgd/a;->k(IIZ)Z

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    if-eqz v1, :cond_d

    .line 97
    .line 98
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 103
    .line 104
    .line 105
    move-result v5

    .line 106
    const/16 v7, 0x8

    .line 107
    .line 108
    if-lt v5, v7, :cond_c

    .line 109
    .line 110
    invoke-virtual {p0, v1}, Lod/p;->g(Ljava/lang/String;)Z

    .line 111
    .line 112
    .line 113
    move-result v5

    .line 114
    if-eqz v5, :cond_b

    .line 115
    .line 116
    aget v5, p3, v3

    .line 117
    .line 118
    aget p3, p3, v4

    .line 119
    .line 120
    add-int/2addr v5, p3

    .line 121
    int-to-float p3, v5

    .line 122
    div-float/2addr p3, v2

    .line 123
    aget v5, v6, v3

    .line 124
    .line 125
    aget v7, v6, v4

    .line 126
    .line 127
    add-int/2addr v5, v7

    .line 128
    int-to-float v5, v5

    .line 129
    div-float/2addr v5, v2

    .line 130
    invoke-virtual {p0}, Lod/p;->p()Lcd/a;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    new-instance v7, Lcom/google/zxing/Result;

    .line 135
    .line 136
    const/4 v8, 0x2

    .line 137
    new-array v8, v8, [Lcd/o;

    .line 138
    .line 139
    new-instance v9, Lcd/o;

    .line 140
    .line 141
    int-to-float v10, p1

    .line 142
    invoke-direct {v9, p3, v10}, Lcd/o;-><init>(FF)V

    .line 143
    .line 144
    .line 145
    aput-object v9, v8, v4

    .line 146
    .line 147
    new-instance p3, Lcd/o;

    .line 148
    .line 149
    invoke-direct {p3, v5, v10}, Lcd/o;-><init>(FF)V

    .line 150
    .line 151
    .line 152
    aput-object p3, v8, v3

    .line 153
    .line 154
    invoke-direct {v7, v1, v0, v8, v2}, Lcom/google/zxing/Result;-><init>(Ljava/lang/String;[B[Lcd/o;Lcd/a;)V

    .line 155
    .line 156
    .line 157
    :try_start_0
    iget-object p3, p0, Lod/p;->b:Lod/o;

    .line 158
    .line 159
    aget v5, v6, v3

    .line 160
    .line 161
    invoke-virtual {p3, p1, p2, v5}, Lod/o;->a(ILgd/a;I)Lcom/google/zxing/Result;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    sget-object p2, Lcd/n;->r:Lcd/n;

    .line 166
    .line 167
    invoke-virtual {p1}, Lcom/google/zxing/Result;->f()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object p3

    .line 171
    invoke-virtual {v7, p2, p3}, Lcom/google/zxing/Result;->h(Lcd/n;Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {p1}, Lcom/google/zxing/Result;->d()Ljava/util/Map;

    .line 175
    .line 176
    .line 177
    move-result-object p2

    .line 178
    invoke-virtual {v7, p2}, Lcom/google/zxing/Result;->g(Ljava/util/Map;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {p1}, Lcom/google/zxing/Result;->e()[Lcd/o;

    .line 182
    .line 183
    .line 184
    move-result-object p2

    .line 185
    invoke-virtual {v7, p2}, Lcom/google/zxing/Result;->a([Lcd/o;)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {p1}, Lcom/google/zxing/Result;->f()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 193
    .line 194
    .line 195
    move-result p1
    :try_end_0
    .catch Lcd/m; {:try_start_0 .. :try_end_0} :catch_0

    .line 196
    goto :goto_1

    .line 197
    :catch_0
    move p1, v4

    .line 198
    :goto_1
    if-nez p4, :cond_4

    .line 199
    .line 200
    goto :goto_2

    .line 201
    :cond_4
    sget-object p2, Lcd/e;->v:Lcd/e;

    .line 202
    .line 203
    invoke-interface {p4, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object p2

    .line 207
    move-object v0, p2

    .line 208
    check-cast v0, [I

    .line 209
    .line 210
    :goto_2
    if-eqz v0, :cond_8

    .line 211
    .line 212
    array-length p2, v0

    .line 213
    move p3, v4

    .line 214
    :goto_3
    if-ge p3, p2, :cond_6

    .line 215
    .line 216
    aget p4, v0, p3

    .line 217
    .line 218
    if-ne p1, p4, :cond_5

    .line 219
    .line 220
    goto :goto_4

    .line 221
    :cond_5
    add-int/lit8 p3, p3, 0x1

    .line 222
    .line 223
    goto :goto_3

    .line 224
    :cond_6
    move v3, v4

    .line 225
    :goto_4
    if-eqz v3, :cond_7

    .line 226
    .line 227
    goto :goto_5

    .line 228
    :cond_7
    invoke-static {}, Lcd/j;->a()Lcd/j;

    .line 229
    .line 230
    .line 231
    move-result-object p1

    .line 232
    throw p1

    .line 233
    :cond_8
    :goto_5
    sget-object p1, Lcd/a;->r:Lcd/a;

    .line 234
    .line 235
    if-eq v2, p1, :cond_9

    .line 236
    .line 237
    sget-object p1, Lcd/a;->y:Lcd/a;

    .line 238
    .line 239
    if-ne v2, p1, :cond_a

    .line 240
    .line 241
    :cond_9
    iget-object p1, p0, Lod/p;->c:Lod/g;

    .line 242
    .line 243
    invoke-virtual {p1, v1}, Lod/g;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object p1

    .line 247
    if-eqz p1, :cond_a

    .line 248
    .line 249
    sget-object p2, Lcd/n;->q:Lcd/n;

    .line 250
    .line 251
    invoke-virtual {v7, p2, p1}, Lcom/google/zxing/Result;->h(Lcd/n;Ljava/lang/Object;)V

    .line 252
    .line 253
    .line 254
    :cond_a
    return-object v7

    .line 255
    :cond_b
    invoke-static {}, Lcd/d;->a()Lcd/d;

    .line 256
    .line 257
    .line 258
    move-result-object p1

    .line 259
    throw p1

    .line 260
    :cond_c
    invoke-static {}, Lcd/f;->a()Lcd/f;

    .line 261
    .line 262
    .line 263
    move-result-object p1

    .line 264
    throw p1

    .line 265
    :cond_d
    invoke-static {}, Lcd/j;->a()Lcd/j;

    .line 266
    .line 267
    .line 268
    move-result-object p1

    .line 269
    throw p1
.end method

.method abstract p()Lcd/a;
.end method
