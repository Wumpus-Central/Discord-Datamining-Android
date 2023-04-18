.class public final Lj6/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:[C

.field private static final b:[B

.field private static final c:[I

.field private static final d:[I

.field private static final e:[I

.field private static final f:[I

.field private static final g:[I

.field private static final h:[I

.field private static final i:[I

.field private static final j:[I


# direct methods
.method static constructor <clinit>()V
    .locals 15

    .line 1
    const-string v0, "0123456789ABCDEF"

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lj6/a;->a:[C

    .line 8
    .line 9
    array-length v0, v0

    .line 10
    new-array v1, v0, [B

    .line 11
    .line 12
    sput-object v1, Lj6/a;->b:[B

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    move v2, v1

    .line 16
    :goto_0
    if-ge v2, v0, :cond_0

    .line 17
    .line 18
    sget-object v3, Lj6/a;->b:[B

    .line 19
    .line 20
    sget-object v4, Lj6/a;->a:[C

    .line 21
    .line 22
    aget-char v4, v4, v2

    .line 23
    .line 24
    int-to-byte v4, v4

    .line 25
    aput-byte v4, v3, v2

    .line 26
    .line 27
    add-int/lit8 v2, v2, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/16 v0, 0x100

    .line 31
    .line 32
    new-array v2, v0, [I

    .line 33
    .line 34
    move v3, v1

    .line 35
    :goto_1
    const/16 v4, 0x20

    .line 36
    .line 37
    const/4 v5, -0x1

    .line 38
    if-ge v3, v4, :cond_1

    .line 39
    .line 40
    aput v5, v2, v3

    .line 41
    .line 42
    add-int/lit8 v3, v3, 0x1

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    const/16 v3, 0x22

    .line 46
    .line 47
    const/4 v6, 0x1

    .line 48
    aput v6, v2, v3

    .line 49
    .line 50
    const/16 v7, 0x5c

    .line 51
    .line 52
    aput v6, v2, v7

    .line 53
    .line 54
    sput-object v2, Lj6/a;->c:[I

    .line 55
    .line 56
    array-length v8, v2

    .line 57
    new-array v9, v8, [I

    .line 58
    .line 59
    invoke-static {v2, v1, v9, v1, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 60
    .line 61
    .line 62
    const/16 v2, 0x80

    .line 63
    .line 64
    move v8, v2

    .line 65
    :goto_2
    if-ge v8, v0, :cond_5

    .line 66
    .line 67
    and-int/lit16 v10, v8, 0xe0

    .line 68
    .line 69
    const/16 v11, 0xc0

    .line 70
    .line 71
    if-ne v10, v11, :cond_2

    .line 72
    .line 73
    const/4 v10, 0x2

    .line 74
    goto :goto_3

    .line 75
    :cond_2
    and-int/lit16 v10, v8, 0xf0

    .line 76
    .line 77
    const/16 v11, 0xe0

    .line 78
    .line 79
    if-ne v10, v11, :cond_3

    .line 80
    .line 81
    const/4 v10, 0x3

    .line 82
    goto :goto_3

    .line 83
    :cond_3
    and-int/lit16 v10, v8, 0xf8

    .line 84
    .line 85
    const/16 v11, 0xf0

    .line 86
    .line 87
    if-ne v10, v11, :cond_4

    .line 88
    .line 89
    const/4 v10, 0x4

    .line 90
    goto :goto_3

    .line 91
    :cond_4
    move v10, v5

    .line 92
    :goto_3
    aput v10, v9, v8

    .line 93
    .line 94
    add-int/lit8 v8, v8, 0x1

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_5
    sput-object v9, Lj6/a;->d:[I

    .line 98
    .line 99
    new-array v8, v0, [I

    .line 100
    .line 101
    invoke-static {v8, v5}, Ljava/util/Arrays;->fill([II)V

    .line 102
    .line 103
    .line 104
    const/16 v9, 0x21

    .line 105
    .line 106
    :goto_4
    if-ge v9, v0, :cond_7

    .line 107
    .line 108
    int-to-char v10, v9

    .line 109
    invoke-static {v10}, Ljava/lang/Character;->isJavaIdentifierPart(C)Z

    .line 110
    .line 111
    .line 112
    move-result v10

    .line 113
    if-eqz v10, :cond_6

    .line 114
    .line 115
    aput v1, v8, v9

    .line 116
    .line 117
    :cond_6
    add-int/lit8 v9, v9, 0x1

    .line 118
    .line 119
    goto :goto_4

    .line 120
    :cond_7
    const/16 v9, 0x40

    .line 121
    .line 122
    aput v1, v8, v9

    .line 123
    .line 124
    const/16 v9, 0x23

    .line 125
    .line 126
    aput v1, v8, v9

    .line 127
    .line 128
    const/16 v10, 0x2a

    .line 129
    .line 130
    aput v1, v8, v10

    .line 131
    .line 132
    const/16 v11, 0x2d

    .line 133
    .line 134
    aput v1, v8, v11

    .line 135
    .line 136
    const/16 v11, 0x2b

    .line 137
    .line 138
    aput v1, v8, v11

    .line 139
    .line 140
    sput-object v8, Lj6/a;->e:[I

    .line 141
    .line 142
    new-array v11, v0, [I

    .line 143
    .line 144
    invoke-static {v8, v1, v11, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 145
    .line 146
    .line 147
    invoke-static {v11, v2, v2, v1}, Ljava/util/Arrays;->fill([IIII)V

    .line 148
    .line 149
    .line 150
    sput-object v11, Lj6/a;->f:[I

    .line 151
    .line 152
    new-array v8, v0, [I

    .line 153
    .line 154
    sget-object v11, Lj6/a;->d:[I

    .line 155
    .line 156
    invoke-static {v11, v2, v8, v2, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 157
    .line 158
    .line 159
    invoke-static {v8, v1, v4, v5}, Ljava/util/Arrays;->fill([IIII)V

    .line 160
    .line 161
    .line 162
    const/16 v12, 0x9

    .line 163
    .line 164
    aput v1, v8, v12

    .line 165
    .line 166
    const/16 v13, 0xa

    .line 167
    .line 168
    aput v13, v8, v13

    .line 169
    .line 170
    const/16 v14, 0xd

    .line 171
    .line 172
    aput v14, v8, v14

    .line 173
    .line 174
    aput v10, v8, v10

    .line 175
    .line 176
    sput-object v8, Lj6/a;->g:[I

    .line 177
    .line 178
    new-array v8, v0, [I

    .line 179
    .line 180
    invoke-static {v11, v2, v8, v2, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 181
    .line 182
    .line 183
    invoke-static {v8, v1, v4, v5}, Ljava/util/Arrays;->fill([IIII)V

    .line 184
    .line 185
    .line 186
    aput v6, v8, v4

    .line 187
    .line 188
    aput v6, v8, v12

    .line 189
    .line 190
    aput v13, v8, v13

    .line 191
    .line 192
    aput v14, v8, v14

    .line 193
    .line 194
    const/16 v6, 0x2f

    .line 195
    .line 196
    aput v6, v8, v6

    .line 197
    .line 198
    aput v9, v8, v9

    .line 199
    .line 200
    sput-object v8, Lj6/a;->h:[I

    .line 201
    .line 202
    new-array v2, v2, [I

    .line 203
    .line 204
    move v6, v1

    .line 205
    :goto_5
    if-ge v6, v4, :cond_8

    .line 206
    .line 207
    aput v5, v2, v6

    .line 208
    .line 209
    add-int/lit8 v6, v6, 0x1

    .line 210
    .line 211
    goto :goto_5

    .line 212
    :cond_8
    aput v3, v2, v3

    .line 213
    .line 214
    aput v7, v2, v7

    .line 215
    .line 216
    const/16 v3, 0x8

    .line 217
    .line 218
    const/16 v4, 0x62

    .line 219
    .line 220
    aput v4, v2, v3

    .line 221
    .line 222
    const/16 v3, 0x74

    .line 223
    .line 224
    aput v3, v2, v12

    .line 225
    .line 226
    const/16 v3, 0xc

    .line 227
    .line 228
    const/16 v4, 0x66

    .line 229
    .line 230
    aput v4, v2, v3

    .line 231
    .line 232
    const/16 v3, 0x6e

    .line 233
    .line 234
    aput v3, v2, v13

    .line 235
    .line 236
    const/16 v3, 0x72

    .line 237
    .line 238
    aput v3, v2, v14

    .line 239
    .line 240
    sput-object v2, Lj6/a;->i:[I

    .line 241
    .line 242
    new-array v0, v0, [I

    .line 243
    .line 244
    sput-object v0, Lj6/a;->j:[I

    .line 245
    .line 246
    invoke-static {v0, v5}, Ljava/util/Arrays;->fill([II)V

    .line 247
    .line 248
    .line 249
    move v0, v1

    .line 250
    :goto_6
    if-ge v0, v13, :cond_9

    .line 251
    .line 252
    sget-object v2, Lj6/a;->j:[I

    .line 253
    .line 254
    add-int/lit8 v3, v0, 0x30

    .line 255
    .line 256
    aput v0, v2, v3

    .line 257
    .line 258
    add-int/lit8 v0, v0, 0x1

    .line 259
    .line 260
    goto :goto_6

    .line 261
    :cond_9
    :goto_7
    const/4 v0, 0x6

    .line 262
    if-ge v1, v0, :cond_a

    .line 263
    .line 264
    sget-object v0, Lj6/a;->j:[I

    .line 265
    .line 266
    add-int/lit8 v2, v1, 0x61

    .line 267
    .line 268
    add-int/lit8 v3, v1, 0xa

    .line 269
    .line 270
    aput v3, v0, v2

    .line 271
    .line 272
    add-int/lit8 v2, v1, 0x41

    .line 273
    .line 274
    aput v3, v0, v2

    .line 275
    .line 276
    add-int/lit8 v1, v1, 0x1

    .line 277
    .line 278
    goto :goto_7

    .line 279
    :cond_a
    return-void
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

.method public static a()[B
    .locals 1

    sget-object v0, Lj6/a;->b:[B

    invoke-virtual {v0}, [B->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    return-object v0
.end method

.method public static b()[C
    .locals 1

    sget-object v0, Lj6/a;->a:[C

    invoke-virtual {v0}, [C->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [C

    return-object v0
.end method
