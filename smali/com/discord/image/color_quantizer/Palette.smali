.class final Lcom/discord/image/color_quantizer/Palette;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final CALCULATE_BITMAP_MIN_DIMENSION:I = 0x64

.field private static final DEFAULT_CALCULATE_NUMBER_COLORS:I = 0x10

.field private static final MAX_DARK_LUMA:F = 0.45f

.field private static final MAX_MUTED_SATURATION:F = 0.4f

.field private static final MAX_NORMAL_LUMA:F = 0.7f

.field private static final MIN_LIGHT_LUMA:F = 0.55f

.field private static final MIN_NORMAL_LUMA:F = 0.3f

.field private static final MIN_VIBRANT_SATURATION:F = 0.35f

.field private static final TARGET_DARK_LUMA:F = 0.26f

.field private static final TARGET_LIGHT_LUMA:F = 0.74f

.field private static final TARGET_MUTED_SATURATION:F = 0.3f

.field private static final TARGET_NORMAL_LUMA:F = 0.5f

.field private static final TARGET_VIBRANT_SATURATION:F = 1.0f


# instance fields
.field private mDarkMutedSwatch:Lcom/discord/image/color_quantizer/Swatch;

.field private mDarkVibrantSwatch:Lcom/discord/image/color_quantizer/Swatch;

.field private final mHighestPopulation:I

.field private mLightMutedColor:Lcom/discord/image/color_quantizer/Swatch;

.field private mLightVibrantSwatch:Lcom/discord/image/color_quantizer/Swatch;

.field private mMutedSwatch:Lcom/discord/image/color_quantizer/Swatch;

.field private final mSwatches:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/discord/image/color_quantizer/Swatch;",
            ">;"
        }
    .end annotation
.end field

.field private mVibrantSwatch:Lcom/discord/image/color_quantizer/Swatch;


# direct methods
.method private constructor <init>(Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/discord/image/color_quantizer/Swatch;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/discord/image/color_quantizer/Palette;->mSwatches:Ljava/util/List;

    .line 5
    .line 6
    invoke-direct {p0}, Lcom/discord/image/color_quantizer/Palette;->findMaxPopulation()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    iput p1, p0, Lcom/discord/image/color_quantizer/Palette;->mHighestPopulation:I

    .line 11
    .line 12
    const/high16 v1, 0x3f000000    # 0.5f

    .line 13
    .line 14
    const v2, 0x3e99999a    # 0.3f

    .line 15
    .line 16
    .line 17
    const v3, 0x3f333333    # 0.7f

    .line 18
    .line 19
    .line 20
    const/high16 v4, 0x3f800000    # 1.0f

    .line 21
    .line 22
    const v5, 0x3eb33333    # 0.35f

    .line 23
    .line 24
    .line 25
    const/high16 v6, 0x3f800000    # 1.0f

    .line 26
    .line 27
    move-object v0, p0

    .line 28
    invoke-direct/range {v0 .. v6}, Lcom/discord/image/color_quantizer/Palette;->findColor(FFFFFF)Lcom/discord/image/color_quantizer/Swatch;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iput-object p1, p0, Lcom/discord/image/color_quantizer/Palette;->mVibrantSwatch:Lcom/discord/image/color_quantizer/Swatch;

    .line 33
    .line 34
    const v1, 0x3f3d70a4    # 0.74f

    .line 35
    .line 36
    .line 37
    const v2, 0x3f0ccccd    # 0.55f

    .line 38
    .line 39
    .line 40
    const/high16 v3, 0x3f800000    # 1.0f

    .line 41
    .line 42
    invoke-direct/range {v0 .. v6}, Lcom/discord/image/color_quantizer/Palette;->findColor(FFFFFF)Lcom/discord/image/color_quantizer/Swatch;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    iput-object p1, p0, Lcom/discord/image/color_quantizer/Palette;->mLightVibrantSwatch:Lcom/discord/image/color_quantizer/Swatch;

    .line 47
    .line 48
    const v1, 0x3e851eb8    # 0.26f

    .line 49
    .line 50
    .line 51
    const/4 v2, 0x0

    .line 52
    const v3, 0x3ee66666    # 0.45f

    .line 53
    .line 54
    .line 55
    invoke-direct/range {v0 .. v6}, Lcom/discord/image/color_quantizer/Palette;->findColor(FFFFFF)Lcom/discord/image/color_quantizer/Swatch;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    iput-object p1, p0, Lcom/discord/image/color_quantizer/Palette;->mDarkVibrantSwatch:Lcom/discord/image/color_quantizer/Swatch;

    .line 60
    .line 61
    const/high16 v1, 0x3f000000    # 0.5f

    .line 62
    .line 63
    const v2, 0x3e99999a    # 0.3f

    .line 64
    .line 65
    .line 66
    const v3, 0x3f333333    # 0.7f

    .line 67
    .line 68
    .line 69
    const v4, 0x3e99999a    # 0.3f

    .line 70
    .line 71
    .line 72
    const/4 v5, 0x0

    .line 73
    const v6, 0x3ecccccd    # 0.4f

    .line 74
    .line 75
    .line 76
    invoke-direct/range {v0 .. v6}, Lcom/discord/image/color_quantizer/Palette;->findColor(FFFFFF)Lcom/discord/image/color_quantizer/Swatch;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    iput-object p1, p0, Lcom/discord/image/color_quantizer/Palette;->mMutedSwatch:Lcom/discord/image/color_quantizer/Swatch;

    .line 81
    .line 82
    const v1, 0x3f3d70a4    # 0.74f

    .line 83
    .line 84
    .line 85
    const v2, 0x3f0ccccd    # 0.55f

    .line 86
    .line 87
    .line 88
    const/high16 v3, 0x3f800000    # 1.0f

    .line 89
    .line 90
    invoke-direct/range {v0 .. v6}, Lcom/discord/image/color_quantizer/Palette;->findColor(FFFFFF)Lcom/discord/image/color_quantizer/Swatch;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    iput-object p1, p0, Lcom/discord/image/color_quantizer/Palette;->mLightMutedColor:Lcom/discord/image/color_quantizer/Swatch;

    .line 95
    .line 96
    const v1, 0x3e851eb8    # 0.26f

    .line 97
    .line 98
    .line 99
    const/4 v2, 0x0

    .line 100
    const v3, 0x3ee66666    # 0.45f

    .line 101
    .line 102
    .line 103
    invoke-direct/range {v0 .. v6}, Lcom/discord/image/color_quantizer/Palette;->findColor(FFFFFF)Lcom/discord/image/color_quantizer/Swatch;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    iput-object p1, p0, Lcom/discord/image/color_quantizer/Palette;->mDarkMutedSwatch:Lcom/discord/image/color_quantizer/Swatch;

    .line 108
    .line 109
    invoke-direct {p0}, Lcom/discord/image/color_quantizer/Palette;->generateEmptySwatches()V

    .line 110
    .line 111
    .line 112
    return-void
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

.method private static checkBitmapParam(Landroid/graphics/Bitmap;)V
    .locals 1

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 11
    .line 12
    const-string v0, "bitmap can not be recycled"

    .line 13
    .line 14
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    throw p0

    .line 18
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 19
    .line 20
    const-string v0, "bitmap can not be null"

    .line 21
    .line 22
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p0
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
.end method

.method private static checkNumberColorsParam(I)V
    .locals 1

    const/4 v0, 0x1

    if-lt p0, v0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "numColors must be 1 of greater"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static copyHslValues(Lcom/discord/image/color_quantizer/Swatch;)[F
    .locals 3

    .line 1
    const/4 v0, 0x3

    .line 2
    new-array v1, v0, [F

    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/discord/image/color_quantizer/Swatch;->getHsl()[F

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-static {p0, v2, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 10
    .line 11
    .line 12
    return-object v1
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
.end method

.method private static createComparisonValue(FFFFII)F
    .locals 2

    .line 1
    const/4 v0, 0x6

    .line 2
    new-array v0, v0, [F

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    invoke-static {p0, p1}, Lcom/discord/image/color_quantizer/Palette;->invertDiff(FF)F

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    aput p0, v0, v1

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    const/high16 p1, 0x40400000    # 3.0f

    .line 13
    .line 14
    aput p1, v0, p0

    .line 15
    .line 16
    const/4 p0, 0x2

    .line 17
    invoke-static {p2, p3}, Lcom/discord/image/color_quantizer/Palette;->invertDiff(FF)F

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    aput p1, v0, p0

    .line 22
    .line 23
    const/4 p0, 0x3

    .line 24
    const/high16 p1, 0x40d00000    # 6.5f

    .line 25
    .line 26
    aput p1, v0, p0

    .line 27
    .line 28
    int-to-float p0, p4

    .line 29
    int-to-float p1, p5

    .line 30
    div-float/2addr p0, p1

    .line 31
    const/4 p1, 0x4

    .line 32
    aput p0, v0, p1

    .line 33
    .line 34
    const/4 p0, 0x5

    .line 35
    const/high16 p1, 0x3f000000    # 0.5f

    .line 36
    .line 37
    aput p1, v0, p0

    .line 38
    .line 39
    invoke-static {v0}, Lcom/discord/image/color_quantizer/Palette;->weightedMean([F)F

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    return p0
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
.end method

.method private findColor(FFFFFF)Lcom/discord/image/color_quantizer/Swatch;
    .locals 13

    .line 1
    move-object v0, p0

    .line 2
    iget-object v1, v0, Lcom/discord/image/color_quantizer/Palette;->mSwatches:Ljava/util/List;

    .line 3
    .line 4
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v3, 0x0

    .line 10
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v4

    .line 14
    if-eqz v4, :cond_2

    .line 15
    .line 16
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    check-cast v4, Lcom/discord/image/color_quantizer/Swatch;

    .line 21
    .line 22
    invoke-virtual {v4}, Lcom/discord/image/color_quantizer/Swatch;->getHsl()[F

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    const/4 v6, 0x1

    .line 27
    aget v7, v5, v6

    .line 28
    .line 29
    invoke-virtual {v4}, Lcom/discord/image/color_quantizer/Swatch;->getHsl()[F

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    const/4 v6, 0x2

    .line 34
    aget v9, v5, v6

    .line 35
    .line 36
    cmpl-float v5, v7, p5

    .line 37
    .line 38
    if-ltz v5, :cond_0

    .line 39
    .line 40
    cmpg-float v5, v7, p6

    .line 41
    .line 42
    if-gtz v5, :cond_0

    .line 43
    .line 44
    cmpl-float v5, v9, p2

    .line 45
    .line 46
    if-ltz v5, :cond_0

    .line 47
    .line 48
    cmpg-float v5, v9, p3

    .line 49
    .line 50
    if-gtz v5, :cond_0

    .line 51
    .line 52
    invoke-direct {p0, v4}, Lcom/discord/image/color_quantizer/Palette;->isAlreadySelected(Lcom/discord/image/color_quantizer/Swatch;)Z

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    if-nez v5, :cond_0

    .line 57
    .line 58
    invoke-virtual {v4}, Lcom/discord/image/color_quantizer/Swatch;->getPopulation()I

    .line 59
    .line 60
    .line 61
    move-result v11

    .line 62
    iget v12, v0, Lcom/discord/image/color_quantizer/Palette;->mHighestPopulation:I

    .line 63
    .line 64
    move/from16 v8, p4

    .line 65
    .line 66
    move v10, p1

    .line 67
    invoke-static/range {v7 .. v12}, Lcom/discord/image/color_quantizer/Palette;->createComparisonValue(FFFFII)F

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    if-eqz v2, :cond_1

    .line 72
    .line 73
    cmpl-float v6, v5, v3

    .line 74
    .line 75
    if-lez v6, :cond_0

    .line 76
    .line 77
    :cond_1
    move-object v2, v4

    .line 78
    move v3, v5

    .line 79
    goto :goto_0

    .line 80
    :cond_2
    return-object v2
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
.end method

.method private findMaxPopulation()I
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/discord/image/color_quantizer/Palette;->mSwatches:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    check-cast v2, Lcom/discord/image/color_quantizer/Swatch;

    .line 19
    .line 20
    invoke-virtual {v2}, Lcom/discord/image/color_quantizer/Swatch;->getPopulation()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    return v1
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

.method public static generate(Landroid/graphics/Bitmap;)Lcom/discord/image/color_quantizer/Palette;
    .locals 1

    const/16 v0, 0x10

    .line 1
    invoke-static {p0, v0}, Lcom/discord/image/color_quantizer/Palette;->generate(Landroid/graphics/Bitmap;I)Lcom/discord/image/color_quantizer/Palette;

    move-result-object p0

    return-object p0
.end method

.method public static generate(Landroid/graphics/Bitmap;I)Lcom/discord/image/color_quantizer/Palette;
    .locals 1

    .line 2
    invoke-static {p0}, Lcom/discord/image/color_quantizer/Palette;->checkBitmapParam(Landroid/graphics/Bitmap;)V

    .line 3
    invoke-static {p1}, Lcom/discord/image/color_quantizer/Palette;->checkNumberColorsParam(I)V

    .line 4
    invoke-static {p0}, Lcom/discord/image/color_quantizer/Palette;->scaleBitmapDown(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 5
    invoke-static {v0, p1}, Lcom/discord/image/color_quantizer/ColorCutQuantizer;->fromBitmap(Landroid/graphics/Bitmap;I)Lcom/discord/image/color_quantizer/ColorCutQuantizer;

    move-result-object p1

    if-eq v0, p0, :cond_0

    .line 6
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 7
    :cond_0
    new-instance p0, Lcom/discord/image/color_quantizer/Palette;

    invoke-virtual {p1}, Lcom/discord/image/color_quantizer/ColorCutQuantizer;->getQuantizedColors()Ljava/util/List;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/discord/image/color_quantizer/Palette;-><init>(Ljava/util/List;)V

    return-object p0
.end method

.method private generateEmptySwatches()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/discord/image/color_quantizer/Palette;->mVibrantSwatch:Lcom/discord/image/color_quantizer/Swatch;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x2

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/discord/image/color_quantizer/Palette;->mDarkVibrantSwatch:Lcom/discord/image/color_quantizer/Swatch;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-static {v0}, Lcom/discord/image/color_quantizer/Palette;->copyHslValues(Lcom/discord/image/color_quantizer/Swatch;)[F

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const/high16 v3, 0x3f000000    # 0.5f

    .line 16
    .line 17
    aput v3, v0, v2

    .line 18
    .line 19
    new-instance v3, Lcom/discord/image/color_quantizer/Swatch;

    .line 20
    .line 21
    invoke-static {v0}, Lcom/discord/image/color_quantizer/ColorUtils;->HSLtoRGB([F)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    invoke-direct {v3, v0, v1}, Lcom/discord/image/color_quantizer/Swatch;-><init>(II)V

    .line 26
    .line 27
    .line 28
    iput-object v3, p0, Lcom/discord/image/color_quantizer/Palette;->mVibrantSwatch:Lcom/discord/image/color_quantizer/Swatch;

    .line 29
    .line 30
    :cond_0
    iget-object v0, p0, Lcom/discord/image/color_quantizer/Palette;->mDarkVibrantSwatch:Lcom/discord/image/color_quantizer/Swatch;

    .line 31
    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    iget-object v0, p0, Lcom/discord/image/color_quantizer/Palette;->mVibrantSwatch:Lcom/discord/image/color_quantizer/Swatch;

    .line 35
    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    invoke-static {v0}, Lcom/discord/image/color_quantizer/Palette;->copyHslValues(Lcom/discord/image/color_quantizer/Swatch;)[F

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    const v3, 0x3e851eb8    # 0.26f

    .line 43
    .line 44
    .line 45
    aput v3, v0, v2

    .line 46
    .line 47
    new-instance v2, Lcom/discord/image/color_quantizer/Swatch;

    .line 48
    .line 49
    invoke-static {v0}, Lcom/discord/image/color_quantizer/ColorUtils;->HSLtoRGB([F)I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    invoke-direct {v2, v0, v1}, Lcom/discord/image/color_quantizer/Swatch;-><init>(II)V

    .line 54
    .line 55
    .line 56
    iput-object v2, p0, Lcom/discord/image/color_quantizer/Palette;->mDarkVibrantSwatch:Lcom/discord/image/color_quantizer/Swatch;

    .line 57
    .line 58
    :cond_1
    return-void
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

.method private static invertDiff(FF)F
    .locals 0

    sub-float/2addr p0, p1

    invoke-static {p0}, Ljava/lang/Math;->abs(F)F

    move-result p0

    const/high16 p1, 0x3f800000    # 1.0f

    sub-float/2addr p1, p0

    return p1
.end method

.method private isAlreadySelected(Lcom/discord/image/color_quantizer/Swatch;)Z
    .locals 1

    iget-object v0, p0, Lcom/discord/image/color_quantizer/Palette;->mVibrantSwatch:Lcom/discord/image/color_quantizer/Swatch;

    if-eq v0, p1, :cond_1

    iget-object v0, p0, Lcom/discord/image/color_quantizer/Palette;->mDarkVibrantSwatch:Lcom/discord/image/color_quantizer/Swatch;

    if-eq v0, p1, :cond_1

    iget-object v0, p0, Lcom/discord/image/color_quantizer/Palette;->mLightVibrantSwatch:Lcom/discord/image/color_quantizer/Swatch;

    if-eq v0, p1, :cond_1

    iget-object v0, p0, Lcom/discord/image/color_quantizer/Palette;->mMutedSwatch:Lcom/discord/image/color_quantizer/Swatch;

    if-eq v0, p1, :cond_1

    iget-object v0, p0, Lcom/discord/image/color_quantizer/Palette;->mDarkMutedSwatch:Lcom/discord/image/color_quantizer/Swatch;

    if-eq v0, p1, :cond_1

    iget-object v0, p0, Lcom/discord/image/color_quantizer/Palette;->mLightMutedColor:Lcom/discord/image/color_quantizer/Swatch;

    if-ne v0, p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method private static scaleBitmapDown(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/16 v1, 0x64

    .line 14
    .line 15
    if-gt v0, v1, :cond_0

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    const/high16 v1, 0x42c80000    # 100.0f

    .line 19
    .line 20
    int-to-float v0, v0

    .line 21
    div-float/2addr v1, v0

    .line 22
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    int-to-float v0, v0

    .line 27
    mul-float/2addr v0, v1

    .line 28
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    int-to-float v2, v2

    .line 37
    mul-float/2addr v2, v1

    .line 38
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    const/4 v2, 0x0

    .line 43
    invoke-static {p0, v0, v1, v2}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0
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

.method private static varargs weightedMean([F)F
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    move v2, v1

    .line 4
    move v1, v0

    .line 5
    :goto_0
    array-length v3, p0

    .line 6
    if-ge v2, v3, :cond_0

    .line 7
    .line 8
    aget v3, p0, v2

    .line 9
    .line 10
    add-int/lit8 v4, v2, 0x1

    .line 11
    .line 12
    aget v4, p0, v4

    .line 13
    .line 14
    mul-float/2addr v3, v4

    .line 15
    add-float/2addr v0, v3

    .line 16
    add-float/2addr v1, v4

    .line 17
    add-int/lit8 v2, v2, 0x2

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    div-float/2addr v0, v1

    .line 21
    return v0
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
.end method


# virtual methods
.method public getDarkMutedColor(I)I
    .locals 1

    iget-object v0, p0, Lcom/discord/image/color_quantizer/Palette;->mDarkMutedSwatch:Lcom/discord/image/color_quantizer/Swatch;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/discord/image/color_quantizer/Swatch;->getRgb()I

    move-result p1

    :cond_0
    return p1
.end method

.method public getDarkMutedSwatch()Lcom/discord/image/color_quantizer/Swatch;
    .locals 1

    iget-object v0, p0, Lcom/discord/image/color_quantizer/Palette;->mDarkMutedSwatch:Lcom/discord/image/color_quantizer/Swatch;

    return-object v0
.end method

.method public getDarkVibrantColor(I)I
    .locals 1

    iget-object v0, p0, Lcom/discord/image/color_quantizer/Palette;->mDarkVibrantSwatch:Lcom/discord/image/color_quantizer/Swatch;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/discord/image/color_quantizer/Swatch;->getRgb()I

    move-result p1

    :cond_0
    return p1
.end method

.method public getDarkVibrantSwatch()Lcom/discord/image/color_quantizer/Swatch;
    .locals 1

    iget-object v0, p0, Lcom/discord/image/color_quantizer/Palette;->mDarkVibrantSwatch:Lcom/discord/image/color_quantizer/Swatch;

    return-object v0
.end method

.method public getLightMutedColor(I)I
    .locals 1

    iget-object v0, p0, Lcom/discord/image/color_quantizer/Palette;->mLightMutedColor:Lcom/discord/image/color_quantizer/Swatch;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/discord/image/color_quantizer/Swatch;->getRgb()I

    move-result p1

    :cond_0
    return p1
.end method

.method public getLightMutedSwatch()Lcom/discord/image/color_quantizer/Swatch;
    .locals 1

    iget-object v0, p0, Lcom/discord/image/color_quantizer/Palette;->mLightMutedColor:Lcom/discord/image/color_quantizer/Swatch;

    return-object v0
.end method

.method public getLightVibrantColor(I)I
    .locals 1

    iget-object v0, p0, Lcom/discord/image/color_quantizer/Palette;->mLightVibrantSwatch:Lcom/discord/image/color_quantizer/Swatch;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/discord/image/color_quantizer/Swatch;->getRgb()I

    move-result p1

    :cond_0
    return p1
.end method

.method public getLightVibrantSwatch()Lcom/discord/image/color_quantizer/Swatch;
    .locals 1

    iget-object v0, p0, Lcom/discord/image/color_quantizer/Palette;->mLightVibrantSwatch:Lcom/discord/image/color_quantizer/Swatch;

    return-object v0
.end method

.method public getMutedColor(I)I
    .locals 1

    iget-object v0, p0, Lcom/discord/image/color_quantizer/Palette;->mMutedSwatch:Lcom/discord/image/color_quantizer/Swatch;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/discord/image/color_quantizer/Swatch;->getRgb()I

    move-result p1

    :cond_0
    return p1
.end method

.method public getMutedSwatch()Lcom/discord/image/color_quantizer/Swatch;
    .locals 1

    iget-object v0, p0, Lcom/discord/image/color_quantizer/Palette;->mMutedSwatch:Lcom/discord/image/color_quantizer/Swatch;

    return-object v0
.end method

.method public getSwatches()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/discord/image/color_quantizer/Swatch;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/discord/image/color_quantizer/Palette;->mSwatches:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getVibrantColor(I)I
    .locals 1

    iget-object v0, p0, Lcom/discord/image/color_quantizer/Palette;->mVibrantSwatch:Lcom/discord/image/color_quantizer/Swatch;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/discord/image/color_quantizer/Swatch;->getRgb()I

    move-result p1

    :cond_0
    return p1
.end method

.method public getVibrantSwatch()Lcom/discord/image/color_quantizer/Swatch;
    .locals 1

    iget-object v0, p0, Lcom/discord/image/color_quantizer/Palette;->mVibrantSwatch:Lcom/discord/image/color_quantizer/Swatch;

    return-object v0
.end method
