.class public final Lek/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000c\n\u0002\u0008\u0002\n\u0002\u0010\u0012\n\u0002\u0008\u0002\n\u0002\u0010\u0019\n\u0002\u0008\u0006\u001a\u0014\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\u0014\u0010\u0005\u001a\u00020\u0000*\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a$\u0010\u000c\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u0008H\u0000\u001a\u0010\u0010\u000f\u001a\u00020\u00082\u0006\u0010\u000e\u001a\u00020\rH\u0002\u001a\u0018\u0010\u000e\u001a\u00020\u00082\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0008H\u0002\"\u001a\u0010\u0018\u001a\u00020\u00138\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0019"
    }
    d2 = {
        "Lokio/ByteString;",
        "",
        "algorithm",
        "d",
        "Ldk/w;",
        "e",
        "Lokio/Buffer;",
        "buffer",
        "",
        "offset",
        "byteCount",
        "",
        "f",
        "",
        "c",
        "g",
        "",
        "s",
        "codePointCount",
        "",
        "a",
        "[C",
        "h",
        "()[C",
        "HEX_DIGIT_CHARS",
        "okio"
    }
    k = 0x2
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# static fields
.field private static final a:[C


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    new-array v0, v0, [C

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, Lek/b;->a:[C

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 2
        0x30s
        0x31s
        0x32s
        0x33s
        0x34s
        0x35s
        0x36s
        0x37s
        0x38s
        0x39s
        0x61s
        0x62s
        0x63s
        0x64s
        0x65s
        0x66s
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
.end method

.method public static final synthetic a([BI)I
    .locals 0

    invoke-static {p0, p1}, Lek/b;->c([BI)I

    move-result p0

    return p0
.end method

.method public static final synthetic b(C)I
    .locals 0

    invoke-static {p0}, Lek/b;->g(C)I

    move-result p0

    return p0
.end method

.method private static final c([BI)I
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    array-length v2, v0

    .line 6
    const/4 v4, 0x0

    .line 7
    const/4 v5, 0x0

    .line 8
    const/4 v6, 0x0

    .line 9
    :cond_0
    :goto_0
    if-ge v4, v2, :cond_59

    .line 10
    .line 11
    aget-byte v7, v0, v4

    .line 12
    .line 13
    const/16 v8, 0x7f

    .line 14
    .line 15
    const/16 v9, 0x9f

    .line 16
    .line 17
    const/16 v10, 0x1f

    .line 18
    .line 19
    const/16 v11, 0xd

    .line 20
    .line 21
    const v12, 0xfffd

    .line 22
    .line 23
    .line 24
    const/16 v13, 0xa

    .line 25
    .line 26
    const/high16 v14, 0x10000

    .line 27
    .line 28
    const/16 v16, -0x1

    .line 29
    .line 30
    const/16 v17, 0x1

    .line 31
    .line 32
    if-ltz v7, :cond_13

    .line 33
    .line 34
    add-int/lit8 v18, v6, 0x1

    .line 35
    .line 36
    if-ne v6, v1, :cond_1

    .line 37
    .line 38
    return v5

    .line 39
    :cond_1
    if-eq v7, v13, :cond_6

    .line 40
    .line 41
    if-eq v7, v11, :cond_6

    .line 42
    .line 43
    if-ltz v7, :cond_2

    .line 44
    .line 45
    if-ge v10, v7, :cond_4

    .line 46
    .line 47
    :cond_2
    if-le v8, v7, :cond_3

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_3
    if-lt v9, v7, :cond_5

    .line 51
    .line 52
    :cond_4
    move/from16 v6, v17

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_5
    :goto_1
    const/4 v6, 0x0

    .line 56
    :goto_2
    if-nez v6, :cond_7

    .line 57
    .line 58
    :cond_6
    if-ne v7, v12, :cond_8

    .line 59
    .line 60
    :cond_7
    return v16

    .line 61
    :cond_8
    if-ge v7, v14, :cond_9

    .line 62
    .line 63
    move/from16 v6, v17

    .line 64
    .line 65
    goto :goto_3

    .line 66
    :cond_9
    const/4 v6, 0x2

    .line 67
    :goto_3
    add-int/2addr v5, v6

    .line 68
    add-int/lit8 v4, v4, 0x1

    .line 69
    .line 70
    :goto_4
    move/from16 v6, v18

    .line 71
    .line 72
    if-ge v4, v2, :cond_0

    .line 73
    .line 74
    aget-byte v7, v0, v4

    .line 75
    .line 76
    if-ltz v7, :cond_0

    .line 77
    .line 78
    add-int/lit8 v4, v4, 0x1

    .line 79
    .line 80
    add-int/lit8 v18, v6, 0x1

    .line 81
    .line 82
    if-ne v6, v1, :cond_a

    .line 83
    .line 84
    return v5

    .line 85
    :cond_a
    if-eq v7, v13, :cond_f

    .line 86
    .line 87
    if-eq v7, v11, :cond_f

    .line 88
    .line 89
    if-ltz v7, :cond_b

    .line 90
    .line 91
    if-ge v10, v7, :cond_d

    .line 92
    .line 93
    :cond_b
    if-le v8, v7, :cond_c

    .line 94
    .line 95
    goto :goto_5

    .line 96
    :cond_c
    if-lt v9, v7, :cond_e

    .line 97
    .line 98
    :cond_d
    move/from16 v6, v17

    .line 99
    .line 100
    goto :goto_6

    .line 101
    :cond_e
    :goto_5
    const/4 v6, 0x0

    .line 102
    :goto_6
    if-nez v6, :cond_10

    .line 103
    .line 104
    :cond_f
    if-ne v7, v12, :cond_11

    .line 105
    .line 106
    :cond_10
    return v16

    .line 107
    :cond_11
    if-ge v7, v14, :cond_12

    .line 108
    .line 109
    move/from16 v6, v17

    .line 110
    .line 111
    goto :goto_7

    .line 112
    :cond_12
    const/4 v6, 0x2

    .line 113
    :goto_7
    add-int/2addr v5, v6

    .line 114
    goto :goto_4

    .line 115
    :cond_13
    shr-int/lit8 v3, v7, 0x5

    .line 116
    .line 117
    const/4 v15, -0x2

    .line 118
    const/16 v14, 0x80

    .line 119
    .line 120
    if-ne v3, v15, :cond_24

    .line 121
    .line 122
    add-int/lit8 v3, v4, 0x1

    .line 123
    .line 124
    if-gt v2, v3, :cond_15

    .line 125
    .line 126
    if-ne v6, v1, :cond_14

    .line 127
    .line 128
    return v5

    .line 129
    :cond_14
    return v16

    .line 130
    :cond_15
    aget-byte v3, v0, v3

    .line 131
    .line 132
    and-int/lit16 v15, v3, 0xc0

    .line 133
    .line 134
    if-ne v15, v14, :cond_16

    .line 135
    .line 136
    move/from16 v15, v17

    .line 137
    .line 138
    goto :goto_8

    .line 139
    :cond_16
    const/4 v15, 0x0

    .line 140
    :goto_8
    if-nez v15, :cond_18

    .line 141
    .line 142
    if-ne v6, v1, :cond_17

    .line 143
    .line 144
    return v5

    .line 145
    :cond_17
    return v16

    .line 146
    :cond_18
    xor-int/lit16 v3, v3, 0xf80

    .line 147
    .line 148
    shl-int/lit8 v7, v7, 0x6

    .line 149
    .line 150
    xor-int/2addr v3, v7

    .line 151
    if-ge v3, v14, :cond_1a

    .line 152
    .line 153
    if-ne v6, v1, :cond_19

    .line 154
    .line 155
    return v5

    .line 156
    :cond_19
    return v16

    .line 157
    :cond_1a
    add-int/lit8 v7, v6, 0x1

    .line 158
    .line 159
    if-ne v6, v1, :cond_1b

    .line 160
    .line 161
    return v5

    .line 162
    :cond_1b
    if-eq v3, v13, :cond_20

    .line 163
    .line 164
    if-eq v3, v11, :cond_20

    .line 165
    .line 166
    if-ltz v3, :cond_1c

    .line 167
    .line 168
    if-ge v10, v3, :cond_1e

    .line 169
    .line 170
    :cond_1c
    if-le v8, v3, :cond_1d

    .line 171
    .line 172
    goto :goto_9

    .line 173
    :cond_1d
    if-lt v9, v3, :cond_1f

    .line 174
    .line 175
    :cond_1e
    move/from16 v6, v17

    .line 176
    .line 177
    goto :goto_a

    .line 178
    :cond_1f
    :goto_9
    const/4 v6, 0x0

    .line 179
    :goto_a
    if-nez v6, :cond_21

    .line 180
    .line 181
    :cond_20
    if-ne v3, v12, :cond_22

    .line 182
    .line 183
    :cond_21
    return v16

    .line 184
    :cond_22
    const/high16 v6, 0x10000

    .line 185
    .line 186
    if-ge v3, v6, :cond_23

    .line 187
    .line 188
    move/from16 v15, v17

    .line 189
    .line 190
    goto :goto_b

    .line 191
    :cond_23
    const/4 v15, 0x2

    .line 192
    :goto_b
    add-int/2addr v5, v15

    .line 193
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 194
    .line 195
    add-int/lit8 v4, v4, 0x2

    .line 196
    .line 197
    :goto_c
    move v6, v7

    .line 198
    goto/16 :goto_0

    .line 199
    .line 200
    :cond_24
    shr-int/lit8 v3, v7, 0x4

    .line 201
    .line 202
    const v12, 0xd800

    .line 203
    .line 204
    .line 205
    const v9, 0xdfff

    .line 206
    .line 207
    .line 208
    if-ne v3, v15, :cond_3b

    .line 209
    .line 210
    add-int/lit8 v3, v4, 0x2

    .line 211
    .line 212
    if-gt v2, v3, :cond_26

    .line 213
    .line 214
    if-ne v6, v1, :cond_25

    .line 215
    .line 216
    return v5

    .line 217
    :cond_25
    return v16

    .line 218
    :cond_26
    add-int/lit8 v15, v4, 0x1

    .line 219
    .line 220
    aget-byte v15, v0, v15

    .line 221
    .line 222
    and-int/lit16 v8, v15, 0xc0

    .line 223
    .line 224
    if-ne v8, v14, :cond_27

    .line 225
    .line 226
    move/from16 v8, v17

    .line 227
    .line 228
    goto :goto_d

    .line 229
    :cond_27
    const/4 v8, 0x0

    .line 230
    :goto_d
    if-nez v8, :cond_29

    .line 231
    .line 232
    if-ne v6, v1, :cond_28

    .line 233
    .line 234
    return v5

    .line 235
    :cond_28
    return v16

    .line 236
    :cond_29
    aget-byte v3, v0, v3

    .line 237
    .line 238
    and-int/lit16 v8, v3, 0xc0

    .line 239
    .line 240
    if-ne v8, v14, :cond_2a

    .line 241
    .line 242
    move/from16 v8, v17

    .line 243
    .line 244
    goto :goto_e

    .line 245
    :cond_2a
    const/4 v8, 0x0

    .line 246
    :goto_e
    if-nez v8, :cond_2c

    .line 247
    .line 248
    if-ne v6, v1, :cond_2b

    .line 249
    .line 250
    return v5

    .line 251
    :cond_2b
    return v16

    .line 252
    :cond_2c
    const v8, -0x1e080

    .line 253
    .line 254
    .line 255
    xor-int/2addr v3, v8

    .line 256
    shl-int/lit8 v8, v15, 0x6

    .line 257
    .line 258
    xor-int/2addr v3, v8

    .line 259
    shl-int/lit8 v7, v7, 0xc

    .line 260
    .line 261
    xor-int/2addr v3, v7

    .line 262
    const/16 v7, 0x800

    .line 263
    .line 264
    if-ge v3, v7, :cond_2e

    .line 265
    .line 266
    if-ne v6, v1, :cond_2d

    .line 267
    .line 268
    return v5

    .line 269
    :cond_2d
    return v16

    .line 270
    :cond_2e
    if-le v12, v3, :cond_2f

    .line 271
    .line 272
    goto :goto_f

    .line 273
    :cond_2f
    if-lt v9, v3, :cond_31

    .line 274
    .line 275
    if-ne v6, v1, :cond_30

    .line 276
    .line 277
    return v5

    .line 278
    :cond_30
    return v16

    .line 279
    :cond_31
    :goto_f
    add-int/lit8 v7, v6, 0x1

    .line 280
    .line 281
    if-ne v6, v1, :cond_32

    .line 282
    .line 283
    return v5

    .line 284
    :cond_32
    if-eq v3, v13, :cond_37

    .line 285
    .line 286
    if-eq v3, v11, :cond_37

    .line 287
    .line 288
    if-ltz v3, :cond_33

    .line 289
    .line 290
    if-ge v10, v3, :cond_35

    .line 291
    .line 292
    :cond_33
    const/16 v6, 0x7f

    .line 293
    .line 294
    if-le v6, v3, :cond_34

    .line 295
    .line 296
    goto :goto_10

    .line 297
    :cond_34
    const/16 v6, 0x9f

    .line 298
    .line 299
    if-lt v6, v3, :cond_36

    .line 300
    .line 301
    :cond_35
    move/from16 v6, v17

    .line 302
    .line 303
    goto :goto_11

    .line 304
    :cond_36
    :goto_10
    const/4 v6, 0x0

    .line 305
    :goto_11
    if-nez v6, :cond_38

    .line 306
    .line 307
    :cond_37
    const v6, 0xfffd

    .line 308
    .line 309
    .line 310
    if-ne v3, v6, :cond_39

    .line 311
    .line 312
    :cond_38
    return v16

    .line 313
    :cond_39
    const/high16 v6, 0x10000

    .line 314
    .line 315
    if-ge v3, v6, :cond_3a

    .line 316
    .line 317
    move/from16 v15, v17

    .line 318
    .line 319
    goto :goto_12

    .line 320
    :cond_3a
    const/4 v15, 0x2

    .line 321
    :goto_12
    add-int/2addr v5, v15

    .line 322
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 323
    .line 324
    add-int/lit8 v4, v4, 0x3

    .line 325
    .line 326
    goto/16 :goto_c

    .line 327
    .line 328
    :cond_3b
    shr-int/lit8 v3, v7, 0x3

    .line 329
    .line 330
    if-ne v3, v15, :cond_57

    .line 331
    .line 332
    add-int/lit8 v3, v4, 0x3

    .line 333
    .line 334
    if-gt v2, v3, :cond_3d

    .line 335
    .line 336
    if-ne v6, v1, :cond_3c

    .line 337
    .line 338
    return v5

    .line 339
    :cond_3c
    return v16

    .line 340
    :cond_3d
    add-int/lit8 v8, v4, 0x1

    .line 341
    .line 342
    aget-byte v8, v0, v8

    .line 343
    .line 344
    and-int/lit16 v15, v8, 0xc0

    .line 345
    .line 346
    if-ne v15, v14, :cond_3e

    .line 347
    .line 348
    move/from16 v15, v17

    .line 349
    .line 350
    goto :goto_13

    .line 351
    :cond_3e
    const/4 v15, 0x0

    .line 352
    :goto_13
    if-nez v15, :cond_40

    .line 353
    .line 354
    if-ne v6, v1, :cond_3f

    .line 355
    .line 356
    return v5

    .line 357
    :cond_3f
    return v16

    .line 358
    :cond_40
    add-int/lit8 v15, v4, 0x2

    .line 359
    .line 360
    aget-byte v15, v0, v15

    .line 361
    .line 362
    and-int/lit16 v10, v15, 0xc0

    .line 363
    .line 364
    if-ne v10, v14, :cond_41

    .line 365
    .line 366
    move/from16 v10, v17

    .line 367
    .line 368
    goto :goto_14

    .line 369
    :cond_41
    const/4 v10, 0x0

    .line 370
    :goto_14
    if-nez v10, :cond_43

    .line 371
    .line 372
    if-ne v6, v1, :cond_42

    .line 373
    .line 374
    return v5

    .line 375
    :cond_42
    return v16

    .line 376
    :cond_43
    aget-byte v3, v0, v3

    .line 377
    .line 378
    and-int/lit16 v10, v3, 0xc0

    .line 379
    .line 380
    if-ne v10, v14, :cond_44

    .line 381
    .line 382
    move/from16 v10, v17

    .line 383
    .line 384
    goto :goto_15

    .line 385
    :cond_44
    const/4 v10, 0x0

    .line 386
    :goto_15
    if-nez v10, :cond_46

    .line 387
    .line 388
    if-ne v6, v1, :cond_45

    .line 389
    .line 390
    return v5

    .line 391
    :cond_45
    return v16

    .line 392
    :cond_46
    const v10, 0x381f80

    .line 393
    .line 394
    .line 395
    xor-int/2addr v3, v10

    .line 396
    shl-int/lit8 v10, v15, 0x6

    .line 397
    .line 398
    xor-int/2addr v3, v10

    .line 399
    shl-int/lit8 v8, v8, 0xc

    .line 400
    .line 401
    xor-int/2addr v3, v8

    .line 402
    shl-int/lit8 v7, v7, 0x12

    .line 403
    .line 404
    xor-int/2addr v3, v7

    .line 405
    const v7, 0x10ffff

    .line 406
    .line 407
    .line 408
    if-le v3, v7, :cond_48

    .line 409
    .line 410
    if-ne v6, v1, :cond_47

    .line 411
    .line 412
    return v5

    .line 413
    :cond_47
    return v16

    .line 414
    :cond_48
    if-le v12, v3, :cond_49

    .line 415
    .line 416
    goto :goto_16

    .line 417
    :cond_49
    if-lt v9, v3, :cond_4b

    .line 418
    .line 419
    if-ne v6, v1, :cond_4a

    .line 420
    .line 421
    return v5

    .line 422
    :cond_4a
    return v16

    .line 423
    :cond_4b
    :goto_16
    const/high16 v7, 0x10000

    .line 424
    .line 425
    if-ge v3, v7, :cond_4d

    .line 426
    .line 427
    if-ne v6, v1, :cond_4c

    .line 428
    .line 429
    return v5

    .line 430
    :cond_4c
    return v16

    .line 431
    :cond_4d
    add-int/lit8 v7, v6, 0x1

    .line 432
    .line 433
    if-ne v6, v1, :cond_4e

    .line 434
    .line 435
    return v5

    .line 436
    :cond_4e
    if-eq v3, v13, :cond_53

    .line 437
    .line 438
    if-eq v3, v11, :cond_53

    .line 439
    .line 440
    if-ltz v3, :cond_4f

    .line 441
    .line 442
    const/16 v6, 0x1f

    .line 443
    .line 444
    if-ge v6, v3, :cond_51

    .line 445
    .line 446
    :cond_4f
    const/16 v6, 0x7f

    .line 447
    .line 448
    if-le v6, v3, :cond_50

    .line 449
    .line 450
    goto :goto_17

    .line 451
    :cond_50
    const/16 v6, 0x9f

    .line 452
    .line 453
    if-lt v6, v3, :cond_52

    .line 454
    .line 455
    :cond_51
    move/from16 v6, v17

    .line 456
    .line 457
    goto :goto_18

    .line 458
    :cond_52
    :goto_17
    const/4 v6, 0x0

    .line 459
    :goto_18
    if-nez v6, :cond_54

    .line 460
    .line 461
    :cond_53
    const v6, 0xfffd

    .line 462
    .line 463
    .line 464
    if-ne v3, v6, :cond_55

    .line 465
    .line 466
    :cond_54
    return v16

    .line 467
    :cond_55
    const/high16 v6, 0x10000

    .line 468
    .line 469
    if-ge v3, v6, :cond_56

    .line 470
    .line 471
    move/from16 v15, v17

    .line 472
    .line 473
    goto :goto_19

    .line 474
    :cond_56
    const/4 v15, 0x2

    .line 475
    :goto_19
    add-int/2addr v5, v15

    .line 476
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 477
    .line 478
    add-int/lit8 v4, v4, 0x4

    .line 479
    .line 480
    goto/16 :goto_c

    .line 481
    .line 482
    :cond_57
    if-ne v6, v1, :cond_58

    .line 483
    .line 484
    return v5

    .line 485
    :cond_58
    return v16

    .line 486
    :cond_59
    return v5
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
.end method

.method public static final d(Lokio/ByteString;Ljava/lang/String;)Lokio/ByteString;
    .locals 2

    .line 1
    const-string v0, "$this$commonDigest"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "algorithm"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p1}, Lek/d;->a(Ljava/lang/String;)Lek/c;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p0}, Lokio/ByteString;->i()[B

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-virtual {p0}, Lokio/ByteString;->x()I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    invoke-interface {p1, v0, v1, p0}, Lek/c;->update([BII)V

    .line 25
    .line 26
    .line 27
    invoke-interface {p1}, Lek/c;->a()[B

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    new-instance p1, Lokio/ByteString;

    .line 32
    .line 33
    invoke-direct {p1, p0}, Lokio/ByteString;-><init>([B)V

    .line 34
    .line 35
    .line 36
    return-object p1
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
.end method

.method public static final e(Ldk/w;Ljava/lang/String;)Lokio/ByteString;
    .locals 6

    .line 1
    const-string v0, "$this$commonSegmentDigest"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "algorithm"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p1}, Lek/d;->a(Ljava/lang/String;)Lek/c;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p0}, Ldk/w;->G()[[B

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    array-length v0, v0

    .line 20
    const/4 v1, 0x0

    .line 21
    move v2, v1

    .line 22
    :goto_0
    if-ge v1, v0, :cond_0

    .line 23
    .line 24
    invoke-virtual {p0}, Ldk/w;->F()[I

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    add-int v4, v0, v1

    .line 29
    .line 30
    aget v3, v3, v4

    .line 31
    .line 32
    invoke-virtual {p0}, Ldk/w;->F()[I

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    aget v4, v4, v1

    .line 37
    .line 38
    invoke-virtual {p0}, Ldk/w;->G()[[B

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    aget-object v5, v5, v1

    .line 43
    .line 44
    sub-int v2, v4, v2

    .line 45
    .line 46
    invoke-interface {p1, v5, v3, v2}, Lek/c;->update([BII)V

    .line 47
    .line 48
    .line 49
    add-int/lit8 v1, v1, 0x1

    .line 50
    .line 51
    move v2, v4

    .line 52
    goto :goto_0

    .line 53
    :cond_0
    invoke-interface {p1}, Lek/c;->a()[B

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    new-instance p1, Lokio/ByteString;

    .line 58
    .line 59
    invoke-direct {p1, p0}, Lokio/ByteString;-><init>([B)V

    .line 60
    .line 61
    .line 62
    return-object p1
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
.end method

.method public static final f(Lokio/ByteString;Lokio/Buffer;II)V
    .locals 1

    .line 1
    const-string v0, "$this$commonWrite"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "buffer"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lokio/ByteString;->i()[B

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p1, p0, p2, p3}, Lokio/Buffer;->L0([BII)Lokio/Buffer;

    .line 16
    .line 17
    .line 18
    return-void
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
.end method

.method private static final g(C)I
    .locals 3

    const/16 v0, 0x30

    if-le v0, p0, :cond_0

    goto :goto_0

    :cond_0
    const/16 v1, 0x39

    if-lt v1, p0, :cond_1

    sub-int/2addr p0, v0

    goto :goto_3

    :cond_1
    :goto_0
    const/16 v0, 0x61

    if-le v0, p0, :cond_2

    goto :goto_2

    :cond_2
    const/16 v1, 0x66

    if-lt v1, p0, :cond_3

    :goto_1
    sub-int/2addr p0, v0

    add-int/lit8 p0, p0, 0xa

    goto :goto_3

    :cond_3
    :goto_2
    const/16 v0, 0x41

    if-gt v0, p0, :cond_4

    const/16 v1, 0x46

    if-lt v1, p0, :cond_4

    goto :goto_1

    :goto_3
    return p0

    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected hex digit: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final h()[C
    .locals 1

    sget-object v0, Lek/b;->a:[C

    return-object v0
.end method
