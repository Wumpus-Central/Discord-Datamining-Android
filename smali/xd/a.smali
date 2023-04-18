.class final Lxd/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lgd/b;

.field private b:Lxd/j;

.field private c:Lxd/g;

.field private d:Z


# direct methods
.method constructor <init>(Lgd/b;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lgd/b;->j()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/16 v1, 0x15

    .line 9
    .line 10
    if-lt v0, v1, :cond_0

    .line 11
    .line 12
    and-int/lit8 v0, v0, 0x3

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    if-ne v0, v1, :cond_0

    .line 16
    .line 17
    iput-object p1, p0, Lxd/a;->a:Lgd/b;

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    invoke-static {}, Lcd/f;->a()Lcd/f;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    throw p1
    .line 25
    .line 26
    .line 27
.end method

.method private a(III)I
    .locals 1

    iget-boolean v0, p0, Lxd/a;->d:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lxd/a;->a:Lgd/b;

    invoke-virtual {v0, p2, p1}, Lgd/b;->e(II)Z

    move-result p1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lxd/a;->a:Lgd/b;

    invoke-virtual {v0, p1, p2}, Lgd/b;->e(II)Z

    move-result p1

    :goto_0
    if-eqz p1, :cond_1

    shl-int/lit8 p1, p3, 0x1

    or-int/lit8 p1, p1, 0x1

    return p1

    :cond_1
    shl-int/lit8 p1, p3, 0x1

    return p1
.end method


# virtual methods
.method b()V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Lxd/a;->a:Lgd/b;

    .line 3
    .line 4
    invoke-virtual {v1}, Lgd/b;->n()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-ge v0, v1, :cond_2

    .line 9
    .line 10
    add-int/lit8 v1, v0, 0x1

    .line 11
    .line 12
    move v2, v1

    .line 13
    :goto_1
    iget-object v3, p0, Lxd/a;->a:Lgd/b;

    .line 14
    .line 15
    invoke-virtual {v3}, Lgd/b;->j()I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-ge v2, v3, :cond_1

    .line 20
    .line 21
    iget-object v3, p0, Lxd/a;->a:Lgd/b;

    .line 22
    .line 23
    invoke-virtual {v3, v0, v2}, Lgd/b;->e(II)Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    iget-object v4, p0, Lxd/a;->a:Lgd/b;

    .line 28
    .line 29
    invoke-virtual {v4, v2, v0}, Lgd/b;->e(II)Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-eq v3, v4, :cond_0

    .line 34
    .line 35
    iget-object v3, p0, Lxd/a;->a:Lgd/b;

    .line 36
    .line 37
    invoke-virtual {v3, v2, v0}, Lgd/b;->d(II)V

    .line 38
    .line 39
    .line 40
    iget-object v3, p0, Lxd/a;->a:Lgd/b;

    .line 41
    .line 42
    invoke-virtual {v3, v0, v2}, Lgd/b;->d(II)V

    .line 43
    .line 44
    .line 45
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    move v0, v1

    .line 49
    goto :goto_0

    .line 50
    :cond_2
    return-void
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

.method c()[B
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p0}, Lxd/a;->d()Lxd/g;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual/range {p0 .. p0}, Lxd/a;->e()Lxd/j;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-static {}, Lxd/c;->values()[Lxd/c;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    invoke-virtual {v1}, Lxd/g;->c()B

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    aget-object v1, v3, v1

    .line 20
    .line 21
    iget-object v3, v0, Lxd/a;->a:Lgd/b;

    .line 22
    .line 23
    invoke-virtual {v3}, Lgd/b;->j()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    iget-object v4, v0, Lxd/a;->a:Lgd/b;

    .line 28
    .line 29
    invoke-virtual {v1, v4, v3}, Lxd/c;->b(Lgd/b;I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2}, Lxd/j;->a()Lgd/b;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v2}, Lxd/j;->h()I

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    new-array v4, v4, [B

    .line 41
    .line 42
    add-int/lit8 v5, v3, -0x1

    .line 43
    .line 44
    const/4 v6, 0x1

    .line 45
    move v8, v5

    .line 46
    const/4 v9, 0x0

    .line 47
    const/4 v10, 0x0

    .line 48
    const/4 v11, 0x0

    .line 49
    :goto_0
    if-lez v8, :cond_6

    .line 50
    .line 51
    const/4 v12, 0x6

    .line 52
    if-ne v8, v12, :cond_0

    .line 53
    .line 54
    add-int/lit8 v8, v8, -0x1

    .line 55
    .line 56
    :cond_0
    const/4 v12, 0x0

    .line 57
    :goto_1
    if-ge v12, v3, :cond_5

    .line 58
    .line 59
    if-eqz v6, :cond_1

    .line 60
    .line 61
    sub-int v13, v5, v12

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_1
    move v13, v12

    .line 65
    :goto_2
    const/4 v14, 0x0

    .line 66
    :goto_3
    const/4 v15, 0x2

    .line 67
    if-ge v14, v15, :cond_4

    .line 68
    .line 69
    sub-int v15, v8, v14

    .line 70
    .line 71
    invoke-virtual {v1, v15, v13}, Lgd/b;->e(II)Z

    .line 72
    .line 73
    .line 74
    move-result v16

    .line 75
    if-nez v16, :cond_3

    .line 76
    .line 77
    add-int/lit8 v10, v10, 0x1

    .line 78
    .line 79
    shl-int/lit8 v11, v11, 0x1

    .line 80
    .line 81
    iget-object v7, v0, Lxd/a;->a:Lgd/b;

    .line 82
    .line 83
    invoke-virtual {v7, v15, v13}, Lgd/b;->e(II)Z

    .line 84
    .line 85
    .line 86
    move-result v7

    .line 87
    if-eqz v7, :cond_2

    .line 88
    .line 89
    or-int/lit8 v7, v11, 0x1

    .line 90
    .line 91
    move v11, v7

    .line 92
    :cond_2
    const/16 v7, 0x8

    .line 93
    .line 94
    if-ne v10, v7, :cond_3

    .line 95
    .line 96
    add-int/lit8 v7, v9, 0x1

    .line 97
    .line 98
    int-to-byte v10, v11

    .line 99
    aput-byte v10, v4, v9

    .line 100
    .line 101
    move v9, v7

    .line 102
    const/4 v10, 0x0

    .line 103
    const/4 v11, 0x0

    .line 104
    :cond_3
    add-int/lit8 v14, v14, 0x1

    .line 105
    .line 106
    goto :goto_3

    .line 107
    :cond_4
    add-int/lit8 v12, v12, 0x1

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_5
    xor-int/lit8 v6, v6, 0x1

    .line 111
    .line 112
    add-int/lit8 v8, v8, -0x2

    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_6
    invoke-virtual {v2}, Lxd/j;->h()I

    .line 116
    .line 117
    .line 118
    move-result v1

    .line 119
    if-ne v9, v1, :cond_7

    .line 120
    .line 121
    return-object v4

    .line 122
    :cond_7
    invoke-static {}, Lcd/f;->a()Lcd/f;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    throw v1
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
.end method

.method d()Lxd/g;
    .locals 6

    .line 1
    iget-object v0, p0, Lxd/a;->c:Lxd/g;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const/4 v0, 0x0

    .line 7
    move v1, v0

    .line 8
    move v2, v1

    .line 9
    :goto_0
    const/4 v3, 0x6

    .line 10
    const/16 v4, 0x8

    .line 11
    .line 12
    if-ge v1, v3, :cond_1

    .line 13
    .line 14
    invoke-direct {p0, v1, v4, v2}, Lxd/a;->a(III)I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    add-int/lit8 v1, v1, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    const/4 v1, 0x7

    .line 22
    invoke-direct {p0, v1, v4, v2}, Lxd/a;->a(III)I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    invoke-direct {p0, v4, v4, v2}, Lxd/a;->a(III)I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    invoke-direct {p0, v4, v1, v2}, Lxd/a;->a(III)I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    const/4 v2, 0x5

    .line 35
    :goto_1
    if-ltz v2, :cond_2

    .line 36
    .line 37
    invoke-direct {p0, v4, v2, v1}, Lxd/a;->a(III)I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    add-int/lit8 v2, v2, -0x1

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_2
    iget-object v2, p0, Lxd/a;->a:Lgd/b;

    .line 45
    .line 46
    invoke-virtual {v2}, Lgd/b;->j()I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    add-int/lit8 v3, v2, -0x7

    .line 51
    .line 52
    add-int/lit8 v5, v2, -0x1

    .line 53
    .line 54
    :goto_2
    if-lt v5, v3, :cond_3

    .line 55
    .line 56
    invoke-direct {p0, v4, v5, v0}, Lxd/a;->a(III)I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    add-int/lit8 v5, v5, -0x1

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_3
    add-int/lit8 v3, v2, -0x8

    .line 64
    .line 65
    :goto_3
    if-ge v3, v2, :cond_4

    .line 66
    .line 67
    invoke-direct {p0, v3, v4, v0}, Lxd/a;->a(III)I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    add-int/lit8 v3, v3, 0x1

    .line 72
    .line 73
    goto :goto_3

    .line 74
    :cond_4
    invoke-static {v1, v0}, Lxd/g;->a(II)Lxd/g;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    iput-object v0, p0, Lxd/a;->c:Lxd/g;

    .line 79
    .line 80
    if-eqz v0, :cond_5

    .line 81
    .line 82
    return-object v0

    .line 83
    :cond_5
    invoke-static {}, Lcd/f;->a()Lcd/f;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    throw v0
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

.method e()Lxd/j;
    .locals 7

    .line 1
    iget-object v0, p0, Lxd/a;->b:Lxd/j;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    iget-object v0, p0, Lxd/a;->a:Lgd/b;

    .line 7
    .line 8
    invoke-virtual {v0}, Lgd/b;->j()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    add-int/lit8 v1, v0, -0x11

    .line 13
    .line 14
    div-int/lit8 v1, v1, 0x4

    .line 15
    .line 16
    const/4 v2, 0x6

    .line 17
    if-gt v1, v2, :cond_1

    .line 18
    .line 19
    invoke-static {v1}, Lxd/j;->i(I)Lxd/j;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    return-object v0

    .line 24
    :cond_1
    add-int/lit8 v1, v0, -0xb

    .line 25
    .line 26
    const/4 v2, 0x5

    .line 27
    const/4 v3, 0x0

    .line 28
    move v4, v2

    .line 29
    move v5, v3

    .line 30
    :goto_0
    if-ltz v4, :cond_3

    .line 31
    .line 32
    add-int/lit8 v6, v0, -0x9

    .line 33
    .line 34
    :goto_1
    if-lt v6, v1, :cond_2

    .line 35
    .line 36
    invoke-direct {p0, v6, v4, v5}, Lxd/a;->a(III)I

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    add-int/lit8 v6, v6, -0x1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_2
    add-int/lit8 v4, v4, -0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_3
    invoke-static {v5}, Lxd/j;->c(I)Lxd/j;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    if-eqz v4, :cond_4

    .line 51
    .line 52
    invoke-virtual {v4}, Lxd/j;->e()I

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    if-ne v5, v0, :cond_4

    .line 57
    .line 58
    iput-object v4, p0, Lxd/a;->b:Lxd/j;

    .line 59
    .line 60
    return-object v4

    .line 61
    :cond_4
    :goto_2
    if-ltz v2, :cond_6

    .line 62
    .line 63
    add-int/lit8 v4, v0, -0x9

    .line 64
    .line 65
    :goto_3
    if-lt v4, v1, :cond_5

    .line 66
    .line 67
    invoke-direct {p0, v2, v4, v3}, Lxd/a;->a(III)I

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    add-int/lit8 v4, v4, -0x1

    .line 72
    .line 73
    goto :goto_3

    .line 74
    :cond_5
    add-int/lit8 v2, v2, -0x1

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_6
    invoke-static {v3}, Lxd/j;->c(I)Lxd/j;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    if-eqz v1, :cond_7

    .line 82
    .line 83
    invoke-virtual {v1}, Lxd/j;->e()I

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    if-ne v2, v0, :cond_7

    .line 88
    .line 89
    iput-object v1, p0, Lxd/a;->b:Lxd/j;

    .line 90
    .line 91
    return-object v1

    .line 92
    :cond_7
    invoke-static {}, Lcd/f;->a()Lcd/f;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    throw v0
    .line 97
.end method

.method f()V
    .locals 3

    .line 1
    iget-object v0, p0, Lxd/a;->c:Lxd/g;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-static {}, Lxd/c;->values()[Lxd/c;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v1, p0, Lxd/a;->c:Lxd/g;

    .line 11
    .line 12
    invoke-virtual {v1}, Lxd/g;->c()B

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    aget-object v0, v0, v1

    .line 17
    .line 18
    iget-object v1, p0, Lxd/a;->a:Lgd/b;

    .line 19
    .line 20
    invoke-virtual {v1}, Lgd/b;->j()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    iget-object v2, p0, Lxd/a;->a:Lgd/b;

    .line 25
    .line 26
    invoke-virtual {v0, v2, v1}, Lxd/c;->b(Lgd/b;I)V

    .line 27
    .line 28
    .line 29
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
.end method

.method g(Z)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lxd/a;->b:Lxd/j;

    .line 3
    .line 4
    iput-object v0, p0, Lxd/a;->c:Lxd/g;

    .line 5
    .line 6
    iput-boolean p1, p0, Lxd/a;->d:Z

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
.end method
