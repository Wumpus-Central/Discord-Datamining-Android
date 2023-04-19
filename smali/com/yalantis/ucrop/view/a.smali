.class public Lcom/yalantis/ucrop/view/a;
.super Lcom/yalantis/ucrop/view/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yalantis/ucrop/view/a$b;,
        Lcom/yalantis/ucrop/view/a$a;
    }
.end annotation


# instance fields
.field private final A:Landroid/graphics/Matrix;

.field private B:F

.field private C:F

.field private D:Lff/c;

.field private E:Ljava/lang/Runnable;

.field private F:Ljava/lang/Runnable;

.field private G:F

.field private H:F

.field private I:I

.field private J:I

.field private K:J

.field private final z:Landroid/graphics/RectF;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, p2, v0}, Lcom/yalantis/ucrop/view/a;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2, p3}, Lcom/yalantis/ucrop/view/b;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 3
    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Lcom/yalantis/ucrop/view/a;->z:Landroid/graphics/RectF;

    .line 4
    new-instance p1, Landroid/graphics/Matrix;

    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    iput-object p1, p0, Lcom/yalantis/ucrop/view/a;->A:Landroid/graphics/Matrix;

    const/high16 p1, 0x41200000    # 10.0f

    .line 5
    iput p1, p0, Lcom/yalantis/ucrop/view/a;->C:F

    const/4 p1, 0x0

    .line 6
    iput-object p1, p0, Lcom/yalantis/ucrop/view/a;->F:Ljava/lang/Runnable;

    const/4 p1, 0x0

    .line 7
    iput p1, p0, Lcom/yalantis/ucrop/view/a;->I:I

    iput p1, p0, Lcom/yalantis/ucrop/view/a;->J:I

    const-wide/16 p1, 0x1f4

    .line 8
    iput-wide p1, p0, Lcom/yalantis/ucrop/view/a;->K:J

    return-void
.end method

.method private A(FF)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/yalantis/ucrop/view/a;->z:Landroid/graphics/RectF;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lcom/yalantis/ucrop/view/a;->z:Landroid/graphics/RectF;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroid/graphics/RectF;->height()F

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    iget-object v2, p0, Lcom/yalantis/ucrop/view/a;->z:Landroid/graphics/RectF;

    .line 14
    .line 15
    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    div-float/2addr v2, p1

    .line 20
    iget-object v3, p0, Lcom/yalantis/ucrop/view/a;->z:Landroid/graphics/RectF;

    .line 21
    .line 22
    invoke-virtual {v3}, Landroid/graphics/RectF;->height()F

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    div-float/2addr v3, p2

    .line 27
    invoke-static {v2, v3}, Ljava/lang/Math;->max(FF)F

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    mul-float/2addr p1, v2

    .line 32
    sub-float/2addr v0, p1

    .line 33
    const/high16 p1, 0x40000000    # 2.0f

    .line 34
    .line 35
    div-float/2addr v0, p1

    .line 36
    iget-object v3, p0, Lcom/yalantis/ucrop/view/a;->z:Landroid/graphics/RectF;

    .line 37
    .line 38
    iget v4, v3, Landroid/graphics/RectF;->left:F

    .line 39
    .line 40
    add-float/2addr v0, v4

    .line 41
    mul-float/2addr p2, v2

    .line 42
    sub-float/2addr v1, p2

    .line 43
    div-float/2addr v1, p1

    .line 44
    iget p1, v3, Landroid/graphics/RectF;->top:F

    .line 45
    .line 46
    add-float/2addr v1, p1

    .line 47
    iget-object p1, p0, Lcom/yalantis/ucrop/view/b;->n:Landroid/graphics/Matrix;

    .line 48
    .line 49
    invoke-virtual {p1}, Landroid/graphics/Matrix;->reset()V

    .line 50
    .line 51
    .line 52
    iget-object p1, p0, Lcom/yalantis/ucrop/view/b;->n:Landroid/graphics/Matrix;

    .line 53
    .line 54
    invoke-virtual {p1, v2, v2}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 55
    .line 56
    .line 57
    iget-object p1, p0, Lcom/yalantis/ucrop/view/b;->n:Landroid/graphics/Matrix;

    .line 58
    .line 59
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 60
    .line 61
    .line 62
    iget-object p1, p0, Lcom/yalantis/ucrop/view/b;->n:Landroid/graphics/Matrix;

    .line 63
    .line 64
    invoke-virtual {p0, p1}, Lcom/yalantis/ucrop/view/b;->setImageMatrix(Landroid/graphics/Matrix;)V

    .line 65
    .line 66
    .line 67
    return-void
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

.method static synthetic p(Lcom/yalantis/ucrop/view/a;)Landroid/graphics/RectF;
    .locals 0

    iget-object p0, p0, Lcom/yalantis/ucrop/view/a;->z:Landroid/graphics/RectF;

    return-object p0
.end method

.method private q()[F
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/yalantis/ucrop/view/a;->A:Landroid/graphics/Matrix;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/yalantis/ucrop/view/a;->A:Landroid/graphics/Matrix;

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/yalantis/ucrop/view/b;->getCurrentAngle()F

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    neg-float v1, v1

    .line 13
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->setRotate(F)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/yalantis/ucrop/view/b;->k:[F

    .line 17
    .line 18
    array-length v1, v0

    .line 19
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([FI)[F

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-object v1, p0, Lcom/yalantis/ucrop/view/a;->z:Landroid/graphics/RectF;

    .line 24
    .line 25
    invoke-static {v1}, Lif/g;->b(Landroid/graphics/RectF;)[F

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    iget-object v2, p0, Lcom/yalantis/ucrop/view/a;->A:Landroid/graphics/Matrix;

    .line 30
    .line 31
    invoke-virtual {v2, v0}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 32
    .line 33
    .line 34
    iget-object v2, p0, Lcom/yalantis/ucrop/view/a;->A:Landroid/graphics/Matrix;

    .line 35
    .line 36
    invoke-virtual {v2, v1}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 37
    .line 38
    .line 39
    invoke-static {v0}, Lif/g;->d([F)Landroid/graphics/RectF;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-static {v1}, Lif/g;->d([F)Landroid/graphics/RectF;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    iget v2, v0, Landroid/graphics/RectF;->left:F

    .line 48
    .line 49
    iget v3, v1, Landroid/graphics/RectF;->left:F

    .line 50
    .line 51
    sub-float/2addr v2, v3

    .line 52
    iget v3, v0, Landroid/graphics/RectF;->top:F

    .line 53
    .line 54
    iget v4, v1, Landroid/graphics/RectF;->top:F

    .line 55
    .line 56
    sub-float/2addr v3, v4

    .line 57
    iget v4, v0, Landroid/graphics/RectF;->right:F

    .line 58
    .line 59
    iget v5, v1, Landroid/graphics/RectF;->right:F

    .line 60
    .line 61
    sub-float/2addr v4, v5

    .line 62
    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    .line 63
    .line 64
    iget v1, v1, Landroid/graphics/RectF;->bottom:F

    .line 65
    .line 66
    sub-float/2addr v0, v1

    .line 67
    const/4 v1, 0x4

    .line 68
    new-array v1, v1, [F

    .line 69
    .line 70
    const/4 v5, 0x0

    .line 71
    cmpl-float v6, v2, v5

    .line 72
    .line 73
    if-lez v6, :cond_0

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_0
    move v2, v5

    .line 77
    :goto_0
    const/4 v6, 0x0

    .line 78
    aput v2, v1, v6

    .line 79
    .line 80
    cmpl-float v2, v3, v5

    .line 81
    .line 82
    if-lez v2, :cond_1

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_1
    move v3, v5

    .line 86
    :goto_1
    const/4 v2, 0x1

    .line 87
    aput v3, v1, v2

    .line 88
    .line 89
    cmpg-float v2, v4, v5

    .line 90
    .line 91
    if-gez v2, :cond_2

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_2
    move v4, v5

    .line 95
    :goto_2
    const/4 v2, 0x2

    .line 96
    aput v4, v1, v2

    .line 97
    .line 98
    cmpg-float v2, v0, v5

    .line 99
    .line 100
    if-gez v2, :cond_3

    .line 101
    .line 102
    goto :goto_3

    .line 103
    :cond_3
    move v0, v5

    .line 104
    :goto_3
    const/4 v2, 0x3

    .line 105
    aput v0, v1, v2

    .line 106
    .line 107
    iget-object v0, p0, Lcom/yalantis/ucrop/view/a;->A:Landroid/graphics/Matrix;

    .line 108
    .line 109
    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 110
    .line 111
    .line 112
    iget-object v0, p0, Lcom/yalantis/ucrop/view/a;->A:Landroid/graphics/Matrix;

    .line 113
    .line 114
    invoke-virtual {p0}, Lcom/yalantis/ucrop/view/b;->getCurrentAngle()F

    .line 115
    .line 116
    .line 117
    move-result v2

    .line 118
    invoke-virtual {v0, v2}, Landroid/graphics/Matrix;->setRotate(F)V

    .line 119
    .line 120
    .line 121
    iget-object v0, p0, Lcom/yalantis/ucrop/view/a;->A:Landroid/graphics/Matrix;

    .line 122
    .line 123
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 124
    .line 125
    .line 126
    return-object v1
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

.method private r()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    int-to-float v1, v1

    .line 13
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    int-to-float v0, v0

    .line 18
    invoke-direct {p0, v1, v0}, Lcom/yalantis/ucrop/view/a;->s(FF)V

    .line 19
    .line 20
    .line 21
    return-void
    .line 22
    .line 23
    .line 24
.end method

.method private s(FF)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/yalantis/ucrop/view/a;->z:Landroid/graphics/RectF;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    div-float/2addr v0, p1

    .line 8
    iget-object v1, p0, Lcom/yalantis/ucrop/view/a;->z:Landroid/graphics/RectF;

    .line 9
    .line 10
    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    div-float/2addr v1, p2

    .line 15
    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    iget-object v1, p0, Lcom/yalantis/ucrop/view/a;->z:Landroid/graphics/RectF;

    .line 20
    .line 21
    invoke-virtual {v1}, Landroid/graphics/RectF;->height()F

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    div-float/2addr v1, p2

    .line 26
    iget-object p2, p0, Lcom/yalantis/ucrop/view/a;->z:Landroid/graphics/RectF;

    .line 27
    .line 28
    invoke-virtual {p2}, Landroid/graphics/RectF;->height()F

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    div-float/2addr p2, p1

    .line 33
    invoke-static {v1, p2}, Ljava/lang/Math;->min(FF)F

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    invoke-static {v0, p1}, Ljava/lang/Math;->min(FF)F

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    iput p1, p0, Lcom/yalantis/ucrop/view/a;->H:F

    .line 42
    .line 43
    iget p2, p0, Lcom/yalantis/ucrop/view/a;->C:F

    .line 44
    .line 45
    mul-float/2addr p1, p2

    .line 46
    iput p1, p0, Lcom/yalantis/ucrop/view/a;->G:F

    .line 47
    .line 48
    return-void
    .line 49
.end method


# virtual methods
.method protected B(FFFJ)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Lcom/yalantis/ucrop/view/a;->getMaxScale()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    cmpl-float v0, p1, v0

    .line 6
    .line 7
    if-lez v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/yalantis/ucrop/view/a;->getMaxScale()F

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    :cond_0
    invoke-virtual {p0}, Lcom/yalantis/ucrop/view/b;->getCurrentScale()F

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    sub-float v5, p1, v4

    .line 18
    .line 19
    new-instance p1, Lcom/yalantis/ucrop/view/a$b;

    .line 20
    .line 21
    move-object v0, p1

    .line 22
    move-object v1, p0

    .line 23
    move-wide v2, p4

    .line 24
    move v6, p2

    .line 25
    move v7, p3

    .line 26
    invoke-direct/range {v0 .. v7}, Lcom/yalantis/ucrop/view/a$b;-><init>(Lcom/yalantis/ucrop/view/a;JFFFF)V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Lcom/yalantis/ucrop/view/a;->F:Ljava/lang/Runnable;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 32
    .line 33
    .line 34
    return-void
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

.method public C(F)V
    .locals 2

    iget-object v0, p0, Lcom/yalantis/ucrop/view/a;->z:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->centerX()F

    move-result v0

    iget-object v1, p0, Lcom/yalantis/ucrop/view/a;->z:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->centerY()F

    move-result v1

    invoke-virtual {p0, p1, v0, v1}, Lcom/yalantis/ucrop/view/a;->D(FFF)V

    return-void
.end method

.method public D(FFF)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/yalantis/ucrop/view/a;->getMaxScale()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    cmpg-float v0, p1, v0

    .line 6
    .line 7
    if-gtz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/yalantis/ucrop/view/b;->getCurrentScale()F

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    div-float/2addr p1, v0

    .line 14
    invoke-virtual {p0, p1, p2, p3}, Lcom/yalantis/ucrop/view/a;->l(FFF)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
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
.end method

.method public E(F)V
    .locals 2

    iget-object v0, p0, Lcom/yalantis/ucrop/view/a;->z:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->centerX()F

    move-result v0

    iget-object v1, p0, Lcom/yalantis/ucrop/view/a;->z:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->centerY()F

    move-result v1

    invoke-virtual {p0, p1, v0, v1}, Lcom/yalantis/ucrop/view/a;->F(FFF)V

    return-void
.end method

.method public F(FFF)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/yalantis/ucrop/view/a;->getMinScale()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    cmpl-float v0, p1, v0

    .line 6
    .line 7
    if-ltz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/yalantis/ucrop/view/b;->getCurrentScale()F

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    div-float/2addr p1, v0

    .line 14
    invoke-virtual {p0, p1, p2, p3}, Lcom/yalantis/ucrop/view/a;->l(FFF)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
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
.end method

.method public getCropBoundsChangeListener()Lff/c;
    .locals 1

    iget-object v0, p0, Lcom/yalantis/ucrop/view/a;->D:Lff/c;

    return-object v0
.end method

.method public getMaxScale()F
    .locals 1

    iget v0, p0, Lcom/yalantis/ucrop/view/a;->G:F

    return v0
.end method

.method public getMinScale()F
    .locals 1

    iget v0, p0, Lcom/yalantis/ucrop/view/a;->H:F

    return v0
.end method

.method public getTargetAspectRatio()F
    .locals 1

    iget v0, p0, Lcom/yalantis/ucrop/view/a;->B:F

    return v0
.end method

.method protected j()V
    .locals 8

    .line 1
    invoke-super {p0}, Lcom/yalantis/ucrop/view/b;->j()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    int-to-float v1, v1

    .line 16
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    int-to-float v0, v0

    .line 21
    iget v2, p0, Lcom/yalantis/ucrop/view/a;->B:F

    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    cmpl-float v2, v2, v3

    .line 25
    .line 26
    if-nez v2, :cond_1

    .line 27
    .line 28
    div-float v2, v1, v0

    .line 29
    .line 30
    iput v2, p0, Lcom/yalantis/ucrop/view/a;->B:F

    .line 31
    .line 32
    :cond_1
    iget v2, p0, Lcom/yalantis/ucrop/view/b;->o:I

    .line 33
    .line 34
    int-to-float v4, v2

    .line 35
    iget v5, p0, Lcom/yalantis/ucrop/view/a;->B:F

    .line 36
    .line 37
    div-float/2addr v4, v5

    .line 38
    float-to-int v4, v4

    .line 39
    iget v6, p0, Lcom/yalantis/ucrop/view/b;->p:I

    .line 40
    .line 41
    if-le v4, v6, :cond_2

    .line 42
    .line 43
    int-to-float v4, v6

    .line 44
    mul-float/2addr v4, v5

    .line 45
    float-to-int v4, v4

    .line 46
    sub-int/2addr v2, v4

    .line 47
    div-int/lit8 v2, v2, 0x2

    .line 48
    .line 49
    iget-object v5, p0, Lcom/yalantis/ucrop/view/a;->z:Landroid/graphics/RectF;

    .line 50
    .line 51
    int-to-float v7, v2

    .line 52
    add-int/2addr v4, v2

    .line 53
    int-to-float v2, v4

    .line 54
    int-to-float v4, v6

    .line 55
    invoke-virtual {v5, v7, v3, v2, v4}, Landroid/graphics/RectF;->set(FFFF)V

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_2
    sub-int/2addr v6, v4

    .line 60
    div-int/lit8 v6, v6, 0x2

    .line 61
    .line 62
    iget-object v5, p0, Lcom/yalantis/ucrop/view/a;->z:Landroid/graphics/RectF;

    .line 63
    .line 64
    int-to-float v7, v6

    .line 65
    int-to-float v2, v2

    .line 66
    add-int/2addr v4, v6

    .line 67
    int-to-float v4, v4

    .line 68
    invoke-virtual {v5, v3, v7, v2, v4}, Landroid/graphics/RectF;->set(FFFF)V

    .line 69
    .line 70
    .line 71
    :goto_0
    invoke-direct {p0, v1, v0}, Lcom/yalantis/ucrop/view/a;->s(FF)V

    .line 72
    .line 73
    .line 74
    invoke-direct {p0, v1, v0}, Lcom/yalantis/ucrop/view/a;->A(FF)V

    .line 75
    .line 76
    .line 77
    iget-object v0, p0, Lcom/yalantis/ucrop/view/a;->D:Lff/c;

    .line 78
    .line 79
    if-eqz v0, :cond_3

    .line 80
    .line 81
    iget v1, p0, Lcom/yalantis/ucrop/view/a;->B:F

    .line 82
    .line 83
    invoke-interface {v0, v1}, Lff/c;->a(F)V

    .line 84
    .line 85
    .line 86
    :cond_3
    iget-object v0, p0, Lcom/yalantis/ucrop/view/b;->q:Lcom/yalantis/ucrop/view/b$b;

    .line 87
    .line 88
    if-eqz v0, :cond_4

    .line 89
    .line 90
    invoke-virtual {p0}, Lcom/yalantis/ucrop/view/b;->getCurrentScale()F

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    invoke-interface {v0, v1}, Lcom/yalantis/ucrop/view/b$b;->d(F)V

    .line 95
    .line 96
    .line 97
    iget-object v0, p0, Lcom/yalantis/ucrop/view/b;->q:Lcom/yalantis/ucrop/view/b$b;

    .line 98
    .line 99
    invoke-virtual {p0}, Lcom/yalantis/ucrop/view/b;->getCurrentAngle()F

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    invoke-interface {v0, v1}, Lcom/yalantis/ucrop/view/b$b;->a(F)V

    .line 104
    .line 105
    .line 106
    :cond_4
    return-void
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
.end method

.method public l(FFF)V
    .locals 3

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    cmpl-float v1, p1, v0

    .line 4
    .line 5
    if-lez v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/yalantis/ucrop/view/b;->getCurrentScale()F

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    mul-float/2addr v1, p1

    .line 12
    invoke-virtual {p0}, Lcom/yalantis/ucrop/view/a;->getMaxScale()F

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    cmpg-float v1, v1, v2

    .line 17
    .line 18
    if-gtz v1, :cond_0

    .line 19
    .line 20
    invoke-super {p0, p1, p2, p3}, Lcom/yalantis/ucrop/view/b;->l(FFF)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    cmpg-float v0, p1, v0

    .line 25
    .line 26
    if-gez v0, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/yalantis/ucrop/view/b;->getCurrentScale()F

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    mul-float/2addr v0, p1

    .line 33
    invoke-virtual {p0}, Lcom/yalantis/ucrop/view/a;->getMinScale()F

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    cmpl-float v0, v0, v1

    .line 38
    .line 39
    if-ltz v0, :cond_1

    .line 40
    .line 41
    invoke-super {p0, p1, p2, p3}, Lcom/yalantis/ucrop/view/b;->l(FFF)V

    .line 42
    .line 43
    .line 44
    :cond_1
    :goto_0
    return-void
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
.end method

.method public setCropBoundsChangeListener(Lff/c;)V
    .locals 0

    iput-object p1, p0, Lcom/yalantis/ucrop/view/a;->D:Lff/c;

    return-void
.end method

.method public setCropRect(Landroid/graphics/RectF;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    div-float/2addr v0, v1

    .line 10
    iput v0, p0, Lcom/yalantis/ucrop/view/a;->B:F

    .line 11
    .line 12
    iget-object v0, p0, Lcom/yalantis/ucrop/view/a;->z:Landroid/graphics/RectF;

    .line 13
    .line 14
    iget v1, p1, Landroid/graphics/RectF;->left:F

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    int-to-float v2, v2

    .line 21
    sub-float/2addr v1, v2

    .line 22
    iget v2, p1, Landroid/graphics/RectF;->top:F

    .line 23
    .line 24
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    int-to-float v3, v3

    .line 29
    sub-float/2addr v2, v3

    .line 30
    iget v3, p1, Landroid/graphics/RectF;->right:F

    .line 31
    .line 32
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    int-to-float v4, v4

    .line 37
    sub-float/2addr v3, v4

    .line 38
    iget p1, p1, Landroid/graphics/RectF;->bottom:F

    .line 39
    .line 40
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    int-to-float v4, v4

    .line 45
    sub-float/2addr p1, v4

    .line 46
    invoke-virtual {v0, v1, v2, v3, p1}, Landroid/graphics/RectF;->set(FFFF)V

    .line 47
    .line 48
    .line 49
    invoke-direct {p0}, Lcom/yalantis/ucrop/view/a;->r()V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Lcom/yalantis/ucrop/view/a;->z()V

    .line 53
    .line 54
    .line 55
    return-void
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

.method public setImageToWrapCropBounds(Z)V
    .locals 13

    .line 1
    iget-boolean v0, p0, Lcom/yalantis/ucrop/view/b;->u:Z

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/yalantis/ucrop/view/a;->v()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_2

    .line 10
    .line 11
    iget-object v0, p0, Lcom/yalantis/ucrop/view/b;->l:[F

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    aget v6, v0, v1

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    aget v7, v0, v2

    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/yalantis/ucrop/view/b;->getCurrentScale()F

    .line 20
    .line 21
    .line 22
    move-result v10

    .line 23
    iget-object v0, p0, Lcom/yalantis/ucrop/view/a;->z:Landroid/graphics/RectF;

    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/graphics/RectF;->centerX()F

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    sub-float/2addr v0, v6

    .line 30
    iget-object v3, p0, Lcom/yalantis/ucrop/view/a;->z:Landroid/graphics/RectF;

    .line 31
    .line 32
    invoke-virtual {v3}, Landroid/graphics/RectF;->centerY()F

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    sub-float/2addr v3, v7

    .line 37
    iget-object v4, p0, Lcom/yalantis/ucrop/view/a;->A:Landroid/graphics/Matrix;

    .line 38
    .line 39
    invoke-virtual {v4}, Landroid/graphics/Matrix;->reset()V

    .line 40
    .line 41
    .line 42
    iget-object v4, p0, Lcom/yalantis/ucrop/view/a;->A:Landroid/graphics/Matrix;

    .line 43
    .line 44
    invoke-virtual {v4, v0, v3}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 45
    .line 46
    .line 47
    iget-object v4, p0, Lcom/yalantis/ucrop/view/b;->k:[F

    .line 48
    .line 49
    array-length v5, v4

    .line 50
    invoke-static {v4, v5}, Ljava/util/Arrays;->copyOf([FI)[F

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    iget-object v5, p0, Lcom/yalantis/ucrop/view/a;->A:Landroid/graphics/Matrix;

    .line 55
    .line 56
    invoke-virtual {v5, v4}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0, v4}, Lcom/yalantis/ucrop/view/a;->w([F)Z

    .line 60
    .line 61
    .line 62
    move-result v12

    .line 63
    if-eqz v12, :cond_0

    .line 64
    .line 65
    invoke-direct {p0}, Lcom/yalantis/ucrop/view/a;->q()[F

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    aget v1, v0, v1

    .line 70
    .line 71
    const/4 v3, 0x2

    .line 72
    aget v3, v0, v3

    .line 73
    .line 74
    add-float/2addr v1, v3

    .line 75
    neg-float v1, v1

    .line 76
    aget v2, v0, v2

    .line 77
    .line 78
    const/4 v3, 0x3

    .line 79
    aget v0, v0, v3

    .line 80
    .line 81
    add-float/2addr v2, v0

    .line 82
    neg-float v0, v2

    .line 83
    const/4 v2, 0x0

    .line 84
    move v9, v0

    .line 85
    move v8, v1

    .line 86
    move v11, v2

    .line 87
    goto :goto_0

    .line 88
    :cond_0
    new-instance v4, Landroid/graphics/RectF;

    .line 89
    .line 90
    iget-object v5, p0, Lcom/yalantis/ucrop/view/a;->z:Landroid/graphics/RectF;

    .line 91
    .line 92
    invoke-direct {v4, v5}, Landroid/graphics/RectF;-><init>(Landroid/graphics/RectF;)V

    .line 93
    .line 94
    .line 95
    iget-object v5, p0, Lcom/yalantis/ucrop/view/a;->A:Landroid/graphics/Matrix;

    .line 96
    .line 97
    invoke-virtual {v5}, Landroid/graphics/Matrix;->reset()V

    .line 98
    .line 99
    .line 100
    iget-object v5, p0, Lcom/yalantis/ucrop/view/a;->A:Landroid/graphics/Matrix;

    .line 101
    .line 102
    invoke-virtual {p0}, Lcom/yalantis/ucrop/view/b;->getCurrentAngle()F

    .line 103
    .line 104
    .line 105
    move-result v8

    .line 106
    invoke-virtual {v5, v8}, Landroid/graphics/Matrix;->setRotate(F)V

    .line 107
    .line 108
    .line 109
    iget-object v5, p0, Lcom/yalantis/ucrop/view/a;->A:Landroid/graphics/Matrix;

    .line 110
    .line 111
    invoke-virtual {v5, v4}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 112
    .line 113
    .line 114
    iget-object v5, p0, Lcom/yalantis/ucrop/view/b;->k:[F

    .line 115
    .line 116
    invoke-static {v5}, Lif/g;->c([F)[F

    .line 117
    .line 118
    .line 119
    move-result-object v5

    .line 120
    invoke-virtual {v4}, Landroid/graphics/RectF;->width()F

    .line 121
    .line 122
    .line 123
    move-result v8

    .line 124
    aget v1, v5, v1

    .line 125
    .line 126
    div-float/2addr v8, v1

    .line 127
    invoke-virtual {v4}, Landroid/graphics/RectF;->height()F

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    aget v2, v5, v2

    .line 132
    .line 133
    div-float/2addr v1, v2

    .line 134
    invoke-static {v8, v1}, Ljava/lang/Math;->max(FF)F

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    mul-float/2addr v1, v10

    .line 139
    sub-float/2addr v1, v10

    .line 140
    move v8, v0

    .line 141
    move v11, v1

    .line 142
    move v9, v3

    .line 143
    :goto_0
    if-eqz p1, :cond_1

    .line 144
    .line 145
    new-instance p1, Lcom/yalantis/ucrop/view/a$a;

    .line 146
    .line 147
    iget-wide v4, p0, Lcom/yalantis/ucrop/view/a;->K:J

    .line 148
    .line 149
    move-object v2, p1

    .line 150
    move-object v3, p0

    .line 151
    invoke-direct/range {v2 .. v12}, Lcom/yalantis/ucrop/view/a$a;-><init>(Lcom/yalantis/ucrop/view/a;JFFFFFFZ)V

    .line 152
    .line 153
    .line 154
    iput-object p1, p0, Lcom/yalantis/ucrop/view/a;->E:Ljava/lang/Runnable;

    .line 155
    .line 156
    invoke-virtual {p0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 157
    .line 158
    .line 159
    goto :goto_1

    .line 160
    :cond_1
    invoke-virtual {p0, v8, v9}, Lcom/yalantis/ucrop/view/b;->m(FF)V

    .line 161
    .line 162
    .line 163
    if-nez v12, :cond_2

    .line 164
    .line 165
    add-float/2addr v10, v11

    .line 166
    iget-object p1, p0, Lcom/yalantis/ucrop/view/a;->z:Landroid/graphics/RectF;

    .line 167
    .line 168
    invoke-virtual {p1}, Landroid/graphics/RectF;->centerX()F

    .line 169
    .line 170
    .line 171
    move-result p1

    .line 172
    iget-object v0, p0, Lcom/yalantis/ucrop/view/a;->z:Landroid/graphics/RectF;

    .line 173
    .line 174
    invoke-virtual {v0}, Landroid/graphics/RectF;->centerY()F

    .line 175
    .line 176
    .line 177
    move-result v0

    .line 178
    invoke-virtual {p0, v10, p1, v0}, Lcom/yalantis/ucrop/view/a;->D(FFF)V

    .line 179
    .line 180
    .line 181
    :cond_2
    :goto_1
    return-void
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
.end method

.method public setImageToWrapCropBoundsAnimDuration(J)V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-lez v0, :cond_0

    .line 6
    .line 7
    iput-wide p1, p0, Lcom/yalantis/ucrop/view/a;->K:J

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 11
    .line 12
    const-string p2, "Animation duration cannot be negative value."

    .line 13
    .line 14
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    throw p1
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

.method public setMaxResultImageSizeX(I)V
    .locals 0

    iput p1, p0, Lcom/yalantis/ucrop/view/a;->I:I

    return-void
.end method

.method public setMaxResultImageSizeY(I)V
    .locals 0

    iput p1, p0, Lcom/yalantis/ucrop/view/a;->J:I

    return-void
.end method

.method public setMaxScaleMultiplier(F)V
    .locals 0

    iput p1, p0, Lcom/yalantis/ucrop/view/a;->C:F

    return-void
.end method

.method public setTargetAspectRatio(F)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iput p1, p0, Lcom/yalantis/ucrop/view/a;->B:F

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    const/4 v1, 0x0

    .line 11
    cmpl-float v1, p1, v1

    .line 12
    .line 13
    if-nez v1, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    int-to-float p1, p1

    .line 20
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    int-to-float v0, v0

    .line 25
    div-float/2addr p1, v0

    .line 26
    iput p1, p0, Lcom/yalantis/ucrop/view/a;->B:F

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    iput p1, p0, Lcom/yalantis/ucrop/view/a;->B:F

    .line 30
    .line 31
    :goto_0
    iget-object p1, p0, Lcom/yalantis/ucrop/view/a;->D:Lff/c;

    .line 32
    .line 33
    if-eqz p1, :cond_2

    .line 34
    .line 35
    iget v0, p0, Lcom/yalantis/ucrop/view/a;->B:F

    .line 36
    .line 37
    invoke-interface {p1, v0}, Lff/c;->a(F)V

    .line 38
    .line 39
    .line 40
    :cond_2
    return-void
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

.method public t()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/yalantis/ucrop/view/a;->E:Ljava/lang/Runnable;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/yalantis/ucrop/view/a;->F:Ljava/lang/Runnable;

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 9
    .line 10
    .line 11
    return-void
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

.method public u(Landroid/graphics/Bitmap$CompressFormat;ILff/a;)V
    .locals 15

    .line 1
    move-object v0, p0

    .line 2
    invoke-virtual {p0}, Lcom/yalantis/ucrop/view/a;->t()V

    .line 3
    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {p0, v1}, Lcom/yalantis/ucrop/view/a;->setImageToWrapCropBounds(Z)V

    .line 7
    .line 8
    .line 9
    new-instance v2, Lgf/d;

    .line 10
    .line 11
    iget-object v3, v0, Lcom/yalantis/ucrop/view/a;->z:Landroid/graphics/RectF;

    .line 12
    .line 13
    iget-object v4, v0, Lcom/yalantis/ucrop/view/b;->k:[F

    .line 14
    .line 15
    invoke-static {v4}, Lif/g;->d([F)Landroid/graphics/RectF;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    invoke-virtual {p0}, Lcom/yalantis/ucrop/view/b;->getCurrentScale()F

    .line 20
    .line 21
    .line 22
    move-result v5

    .line 23
    invoke-virtual {p0}, Lcom/yalantis/ucrop/view/b;->getCurrentAngle()F

    .line 24
    .line 25
    .line 26
    move-result v6

    .line 27
    invoke-direct {v2, v3, v4, v5, v6}, Lgf/d;-><init>(Landroid/graphics/RectF;Landroid/graphics/RectF;FF)V

    .line 28
    .line 29
    .line 30
    new-instance v3, Lgf/b;

    .line 31
    .line 32
    iget v8, v0, Lcom/yalantis/ucrop/view/a;->I:I

    .line 33
    .line 34
    iget v9, v0, Lcom/yalantis/ucrop/view/a;->J:I

    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/yalantis/ucrop/view/b;->getImageInputPath()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v12

    .line 40
    invoke-virtual {p0}, Lcom/yalantis/ucrop/view/b;->getImageOutputPath()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v13

    .line 44
    invoke-virtual {p0}, Lcom/yalantis/ucrop/view/b;->getExifInfo()Lgf/c;

    .line 45
    .line 46
    .line 47
    move-result-object v14

    .line 48
    move-object v7, v3

    .line 49
    move-object/from16 v10, p1

    .line 50
    .line 51
    move/from16 v11, p2

    .line 52
    .line 53
    invoke-direct/range {v7 .. v14}, Lgf/b;-><init>(IILandroid/graphics/Bitmap$CompressFormat;ILjava/lang/String;Ljava/lang/String;Lgf/c;)V

    .line 54
    .line 55
    .line 56
    new-instance v4, Lcom/yalantis/ucrop/task/BitmapCropTask;

    .line 57
    .line 58
    invoke-virtual {p0}, Lcom/yalantis/ucrop/view/b;->getViewBitmap()Landroid/graphics/Bitmap;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    move-object/from16 v6, p3

    .line 63
    .line 64
    invoke-direct {v4, v5, v2, v3, v6}, Lcom/yalantis/ucrop/task/BitmapCropTask;-><init>(Landroid/graphics/Bitmap;Lgf/d;Lgf/b;Lff/a;)V

    .line 65
    .line 66
    .line 67
    sget-object v2, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    .line 68
    .line 69
    new-array v1, v1, [Ljava/lang/Void;

    .line 70
    .line 71
    invoke-virtual {v4, v2, v1}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 72
    .line 73
    .line 74
    return-void
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
.end method

.method protected v()Z
    .locals 1

    iget-object v0, p0, Lcom/yalantis/ucrop/view/b;->k:[F

    invoke-virtual {p0, v0}, Lcom/yalantis/ucrop/view/a;->w([F)Z

    move-result v0

    return v0
.end method

.method protected w([F)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/yalantis/ucrop/view/a;->A:Landroid/graphics/Matrix;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/yalantis/ucrop/view/a;->A:Landroid/graphics/Matrix;

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/yalantis/ucrop/view/b;->getCurrentAngle()F

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    neg-float v1, v1

    .line 13
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->setRotate(F)V

    .line 14
    .line 15
    .line 16
    array-length v0, p1

    .line 17
    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([FI)[F

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iget-object v0, p0, Lcom/yalantis/ucrop/view/a;->A:Landroid/graphics/Matrix;

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lcom/yalantis/ucrop/view/a;->z:Landroid/graphics/RectF;

    .line 27
    .line 28
    invoke-static {v0}, Lif/g;->b(Landroid/graphics/RectF;)[F

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iget-object v1, p0, Lcom/yalantis/ucrop/view/a;->A:Landroid/graphics/Matrix;

    .line 33
    .line 34
    invoke-virtual {v1, v0}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 35
    .line 36
    .line 37
    invoke-static {p1}, Lif/g;->d([F)Landroid/graphics/RectF;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-static {v0}, Lif/g;->d([F)Landroid/graphics/RectF;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {p1, v0}, Landroid/graphics/RectF;->contains(Landroid/graphics/RectF;)Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    return p1
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

.method public x(F)V
    .locals 2

    iget-object v0, p0, Lcom/yalantis/ucrop/view/a;->z:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->centerX()F

    move-result v0

    iget-object v1, p0, Lcom/yalantis/ucrop/view/a;->z:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->centerY()F

    move-result v1

    invoke-virtual {p0, p1, v0, v1}, Lcom/yalantis/ucrop/view/b;->k(FFF)V

    return-void
.end method

.method protected y(Landroid/content/res/TypedArray;)V
    .locals 3

    .line 1
    sget v0, Lef/h;->V:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    sget v2, Lef/h;->W:I

    .line 13
    .line 14
    invoke-virtual {p1, v2, v1}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    cmpl-float v2, v0, v1

    .line 23
    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    cmpl-float v2, p1, v1

    .line 27
    .line 28
    if-nez v2, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    div-float/2addr v0, p1

    .line 32
    iput v0, p0, Lcom/yalantis/ucrop/view/a;->B:F

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    :goto_0
    iput v1, p0, Lcom/yalantis/ucrop/view/a;->B:F

    .line 36
    .line 37
    :goto_1
    return-void
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

.method public z()V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/yalantis/ucrop/view/a;->setImageToWrapCropBounds(Z)V

    return-void
.end method
