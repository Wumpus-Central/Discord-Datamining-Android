.class public Lcom/th3rdwave/safeareacontext/h;
.super Lcom/facebook/react/uimanager/LayoutShadowNode;
.source "SourceFile"


# instance fields
.field private a:Lcom/th3rdwave/safeareacontext/f;

.field private b:[F

.field private c:[F

.field private d:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/uimanager/LayoutShadowNode;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/th3rdwave/safeareacontext/h;->d:Z

    .line 6
    .line 7
    sget-object v1, Lcom/facebook/react/uimanager/ViewProps;->PADDING_MARGIN_SPACING_TYPES:[I

    .line 8
    .line 9
    array-length v2, v1

    .line 10
    new-array v2, v2, [F

    .line 11
    .line 12
    iput-object v2, p0, Lcom/th3rdwave/safeareacontext/h;->b:[F

    .line 13
    .line 14
    array-length v1, v1

    .line 15
    new-array v1, v1, [F

    .line 16
    .line 17
    iput-object v1, p0, Lcom/th3rdwave/safeareacontext/h;->c:[F

    .line 18
    .line 19
    :goto_0
    sget-object v1, Lcom/facebook/react/uimanager/ViewProps;->PADDING_MARGIN_SPACING_TYPES:[I

    .line 20
    .line 21
    array-length v1, v1

    .line 22
    if-ge v0, v1, :cond_0

    .line 23
    .line 24
    iget-object v1, p0, Lcom/th3rdwave/safeareacontext/h;->b:[F

    .line 25
    .line 26
    const/high16 v2, 0x7fc00000    # Float.NaN

    .line 27
    .line 28
    aput v2, v1, v0

    .line 29
    .line 30
    iget-object v1, p0, Lcom/th3rdwave/safeareacontext/h;->c:[F

    .line 31
    .line 32
    aput v2, v1, v0

    .line 33
    .line 34
    add-int/lit8 v0, v0, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
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
    .line 91
    .line 92
    .line 93
    .line 94
.end method

.method private a(Lcom/th3rdwave/safeareacontext/g;)V
    .locals 5

    .line 1
    sget-object v0, Lcom/th3rdwave/safeareacontext/g;->k:Lcom/th3rdwave/safeareacontext/g;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x3

    .line 6
    const/4 v4, 0x1

    .line 7
    if-ne p1, v0, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Lcom/th3rdwave/safeareacontext/h;->b:[F

    .line 10
    .line 11
    aget p1, p1, v4

    .line 12
    .line 13
    invoke-super {p0, v4, p1}, Lcom/facebook/react/uimanager/ReactShadowNodeImpl;->setPadding(IF)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lcom/th3rdwave/safeareacontext/h;->b:[F

    .line 17
    .line 18
    aget p1, p1, v4

    .line 19
    .line 20
    invoke-super {p0, v1, p1}, Lcom/facebook/react/uimanager/ReactShadowNodeImpl;->setPadding(IF)V

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, Lcom/th3rdwave/safeareacontext/h;->b:[F

    .line 24
    .line 25
    aget p1, p1, v3

    .line 26
    .line 27
    invoke-super {p0, v3, p1}, Lcom/facebook/react/uimanager/ReactShadowNodeImpl;->setPadding(IF)V

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Lcom/th3rdwave/safeareacontext/h;->b:[F

    .line 31
    .line 32
    aget p1, p1, v2

    .line 33
    .line 34
    invoke-super {p0, v2, p1}, Lcom/facebook/react/uimanager/ReactShadowNodeImpl;->setPadding(IF)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    iget-object p1, p0, Lcom/th3rdwave/safeareacontext/h;->c:[F

    .line 39
    .line 40
    aget p1, p1, v4

    .line 41
    .line 42
    invoke-super {p0, v4, p1}, Lcom/facebook/react/uimanager/ReactShadowNodeImpl;->setMargin(IF)V

    .line 43
    .line 44
    .line 45
    iget-object p1, p0, Lcom/th3rdwave/safeareacontext/h;->c:[F

    .line 46
    .line 47
    aget p1, p1, v4

    .line 48
    .line 49
    invoke-super {p0, v1, p1}, Lcom/facebook/react/uimanager/ReactShadowNodeImpl;->setMargin(IF)V

    .line 50
    .line 51
    .line 52
    iget-object p1, p0, Lcom/th3rdwave/safeareacontext/h;->c:[F

    .line 53
    .line 54
    aget p1, p1, v3

    .line 55
    .line 56
    invoke-super {p0, v3, p1}, Lcom/facebook/react/uimanager/ReactShadowNodeImpl;->setMargin(IF)V

    .line 57
    .line 58
    .line 59
    iget-object p1, p0, Lcom/th3rdwave/safeareacontext/h;->c:[F

    .line 60
    .line 61
    aget p1, p1, v2

    .line 62
    .line 63
    invoke-super {p0, v2, p1}, Lcom/facebook/react/uimanager/ReactShadowNodeImpl;->setMargin(IF)V

    .line 64
    .line 65
    .line 66
    :goto_0
    return-void
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
.end method

.method private b()V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/th3rdwave/safeareacontext/h;->a:Lcom/th3rdwave/safeareacontext/f;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {v1}, Lcom/th3rdwave/safeareacontext/f;->c()Lcom/th3rdwave/safeareacontext/g;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    sget-object v2, Lcom/th3rdwave/safeareacontext/g;->k:Lcom/th3rdwave/safeareacontext/g;

    .line 13
    .line 14
    if-ne v1, v2, :cond_1

    .line 15
    .line 16
    iget-object v1, v0, Lcom/th3rdwave/safeareacontext/h;->b:[F

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    iget-object v1, v0, Lcom/th3rdwave/safeareacontext/h;->c:[F

    .line 20
    .line 21
    :goto_0
    const/16 v3, 0x8

    .line 22
    .line 23
    aget v3, v1, v3

    .line 24
    .line 25
    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-nez v4, :cond_2

    .line 30
    .line 31
    move v4, v3

    .line 32
    move v6, v4

    .line 33
    move v7, v6

    .line 34
    goto :goto_1

    .line 35
    :cond_2
    const/4 v3, 0x0

    .line 36
    const/4 v4, 0x0

    .line 37
    const/4 v6, 0x0

    .line 38
    const/4 v7, 0x0

    .line 39
    :goto_1
    const/4 v8, 0x7

    .line 40
    aget v8, v1, v8

    .line 41
    .line 42
    invoke-static {v8}, Ljava/lang/Float;->isNaN(F)Z

    .line 43
    .line 44
    .line 45
    move-result v9

    .line 46
    if-nez v9, :cond_3

    .line 47
    .line 48
    move v3, v8

    .line 49
    move v6, v3

    .line 50
    :cond_3
    const/4 v8, 0x6

    .line 51
    aget v8, v1, v8

    .line 52
    .line 53
    invoke-static {v8}, Ljava/lang/Float;->isNaN(F)Z

    .line 54
    .line 55
    .line 56
    move-result v9

    .line 57
    if-nez v9, :cond_4

    .line 58
    .line 59
    move v4, v8

    .line 60
    move v7, v4

    .line 61
    :cond_4
    const/4 v8, 0x1

    .line 62
    aget v9, v1, v8

    .line 63
    .line 64
    invoke-static {v9}, Ljava/lang/Float;->isNaN(F)Z

    .line 65
    .line 66
    .line 67
    move-result v10

    .line 68
    if-nez v10, :cond_5

    .line 69
    .line 70
    move v3, v9

    .line 71
    :cond_5
    const/4 v9, 0x2

    .line 72
    aget v10, v1, v9

    .line 73
    .line 74
    invoke-static {v10}, Ljava/lang/Float;->isNaN(F)Z

    .line 75
    .line 76
    .line 77
    move-result v11

    .line 78
    if-nez v11, :cond_6

    .line 79
    .line 80
    move v4, v10

    .line 81
    :cond_6
    const/4 v10, 0x3

    .line 82
    aget v11, v1, v10

    .line 83
    .line 84
    invoke-static {v11}, Ljava/lang/Float;->isNaN(F)Z

    .line 85
    .line 86
    .line 87
    move-result v12

    .line 88
    if-nez v12, :cond_7

    .line 89
    .line 90
    move v6, v11

    .line 91
    :cond_7
    const/4 v11, 0x0

    .line 92
    aget v1, v1, v11

    .line 93
    .line 94
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 95
    .line 96
    .line 97
    move-result v12

    .line 98
    if-nez v12, :cond_8

    .line 99
    .line 100
    move v7, v1

    .line 101
    :cond_8
    invoke-static {v3}, Lcom/facebook/react/uimanager/PixelUtil;->toPixelFromDIP(F)F

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    invoke-static {v4}, Lcom/facebook/react/uimanager/PixelUtil;->toPixelFromDIP(F)F

    .line 106
    .line 107
    .line 108
    move-result v3

    .line 109
    invoke-static {v6}, Lcom/facebook/react/uimanager/PixelUtil;->toPixelFromDIP(F)F

    .line 110
    .line 111
    .line 112
    move-result v4

    .line 113
    invoke-static {v7}, Lcom/facebook/react/uimanager/PixelUtil;->toPixelFromDIP(F)F

    .line 114
    .line 115
    .line 116
    move-result v6

    .line 117
    iget-object v7, v0, Lcom/th3rdwave/safeareacontext/h;->a:Lcom/th3rdwave/safeareacontext/f;

    .line 118
    .line 119
    invoke-virtual {v7}, Lcom/th3rdwave/safeareacontext/f;->a()Ljava/util/EnumSet;

    .line 120
    .line 121
    .line 122
    move-result-object v7

    .line 123
    iget-object v12, v0, Lcom/th3rdwave/safeareacontext/h;->a:Lcom/th3rdwave/safeareacontext/f;

    .line 124
    .line 125
    invoke-virtual {v12}, Lcom/th3rdwave/safeareacontext/f;->b()Lcom/th3rdwave/safeareacontext/EdgeInsets;

    .line 126
    .line 127
    .line 128
    move-result-object v12

    .line 129
    sget-object v13, Lcom/th3rdwave/safeareacontext/e;->k:Lcom/th3rdwave/safeareacontext/e;

    .line 130
    .line 131
    invoke-virtual {v7, v13}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v13

    .line 135
    if-eqz v13, :cond_9

    .line 136
    .line 137
    iget v13, v12, Lcom/th3rdwave/safeareacontext/EdgeInsets;->a:F

    .line 138
    .line 139
    goto :goto_2

    .line 140
    :cond_9
    const/4 v13, 0x0

    .line 141
    :goto_2
    sget-object v14, Lcom/th3rdwave/safeareacontext/e;->l:Lcom/th3rdwave/safeareacontext/e;

    .line 142
    .line 143
    invoke-virtual {v7, v14}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result v14

    .line 147
    if-eqz v14, :cond_a

    .line 148
    .line 149
    iget v14, v12, Lcom/th3rdwave/safeareacontext/EdgeInsets;->b:F

    .line 150
    .line 151
    goto :goto_3

    .line 152
    :cond_a
    const/4 v14, 0x0

    .line 153
    :goto_3
    sget-object v15, Lcom/th3rdwave/safeareacontext/e;->m:Lcom/th3rdwave/safeareacontext/e;

    .line 154
    .line 155
    invoke-virtual {v7, v15}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v15

    .line 159
    if-eqz v15, :cond_b

    .line 160
    .line 161
    iget v15, v12, Lcom/th3rdwave/safeareacontext/EdgeInsets;->c:F

    .line 162
    .line 163
    goto :goto_4

    .line 164
    :cond_b
    const/4 v15, 0x0

    .line 165
    :goto_4
    sget-object v5, Lcom/th3rdwave/safeareacontext/e;->n:Lcom/th3rdwave/safeareacontext/e;

    .line 166
    .line 167
    invoke-virtual {v7, v5}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result v5

    .line 171
    if-eqz v5, :cond_c

    .line 172
    .line 173
    iget v5, v12, Lcom/th3rdwave/safeareacontext/EdgeInsets;->d:F

    .line 174
    .line 175
    goto :goto_5

    .line 176
    :cond_c
    const/4 v5, 0x0

    .line 177
    :goto_5
    iget-object v7, v0, Lcom/th3rdwave/safeareacontext/h;->a:Lcom/th3rdwave/safeareacontext/f;

    .line 178
    .line 179
    invoke-virtual {v7}, Lcom/th3rdwave/safeareacontext/f;->c()Lcom/th3rdwave/safeareacontext/g;

    .line 180
    .line 181
    .line 182
    move-result-object v7

    .line 183
    if-ne v7, v2, :cond_d

    .line 184
    .line 185
    add-float/2addr v13, v1

    .line 186
    invoke-super {v0, v8, v13}, Lcom/facebook/react/uimanager/ReactShadowNodeImpl;->setPadding(IF)V

    .line 187
    .line 188
    .line 189
    add-float/2addr v14, v3

    .line 190
    invoke-super {v0, v9, v14}, Lcom/facebook/react/uimanager/ReactShadowNodeImpl;->setPadding(IF)V

    .line 191
    .line 192
    .line 193
    add-float/2addr v15, v4

    .line 194
    invoke-super {v0, v10, v15}, Lcom/facebook/react/uimanager/ReactShadowNodeImpl;->setPadding(IF)V

    .line 195
    .line 196
    .line 197
    add-float/2addr v5, v6

    .line 198
    invoke-super {v0, v11, v5}, Lcom/facebook/react/uimanager/ReactShadowNodeImpl;->setPadding(IF)V

    .line 199
    .line 200
    .line 201
    goto :goto_6

    .line 202
    :cond_d
    add-float/2addr v13, v1

    .line 203
    invoke-super {v0, v8, v13}, Lcom/facebook/react/uimanager/ReactShadowNodeImpl;->setMargin(IF)V

    .line 204
    .line 205
    .line 206
    add-float/2addr v14, v3

    .line 207
    invoke-super {v0, v9, v14}, Lcom/facebook/react/uimanager/ReactShadowNodeImpl;->setMargin(IF)V

    .line 208
    .line 209
    .line 210
    add-float/2addr v15, v4

    .line 211
    invoke-super {v0, v10, v15}, Lcom/facebook/react/uimanager/ReactShadowNodeImpl;->setMargin(IF)V

    .line 212
    .line 213
    .line 214
    add-float/2addr v5, v6

    .line 215
    invoke-super {v0, v11, v5}, Lcom/facebook/react/uimanager/ReactShadowNodeImpl;->setMargin(IF)V

    .line 216
    .line 217
    .line 218
    :goto_6
    return-void
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
.end method


# virtual methods
.method public onBeforeLayout(Lcom/facebook/react/uimanager/NativeViewHierarchyOptimizer;)V
    .locals 0

    .line 1
    iget-boolean p1, p0, Lcom/th3rdwave/safeareacontext/h;->d:Z

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    iput-boolean p1, p0, Lcom/th3rdwave/safeareacontext/h;->d:Z

    .line 7
    .line 8
    invoke-direct {p0}, Lcom/th3rdwave/safeareacontext/h;->b()V

    .line 9
    .line 10
    .line 11
    :cond_0
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
    .line 25
    .line 26
.end method

.method public setLocalData(Ljava/lang/Object;)V
    .locals 2

    .line 1
    instance-of v0, p1, Lcom/th3rdwave/safeareacontext/f;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    check-cast p1, Lcom/th3rdwave/safeareacontext/f;

    .line 7
    .line 8
    iget-object v0, p0, Lcom/th3rdwave/safeareacontext/h;->a:Lcom/th3rdwave/safeareacontext/f;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/th3rdwave/safeareacontext/f;->c()Lcom/th3rdwave/safeareacontext/g;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {p1}, Lcom/th3rdwave/safeareacontext/f;->c()Lcom/th3rdwave/safeareacontext/g;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    if-eq v0, v1, :cond_1

    .line 21
    .line 22
    iget-object v0, p0, Lcom/th3rdwave/safeareacontext/h;->a:Lcom/th3rdwave/safeareacontext/f;

    .line 23
    .line 24
    invoke-virtual {v0}, Lcom/th3rdwave/safeareacontext/f;->c()Lcom/th3rdwave/safeareacontext/g;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-direct {p0, v0}, Lcom/th3rdwave/safeareacontext/h;->a(Lcom/th3rdwave/safeareacontext/g;)V

    .line 29
    .line 30
    .line 31
    :cond_1
    iput-object p1, p0, Lcom/th3rdwave/safeareacontext/h;->a:Lcom/th3rdwave/safeareacontext/f;

    .line 32
    .line 33
    const/4 p1, 0x0

    .line 34
    iput-boolean p1, p0, Lcom/th3rdwave/safeareacontext/h;->d:Z

    .line 35
    .line 36
    invoke-direct {p0}, Lcom/th3rdwave/safeareacontext/h;->b()V

    .line 37
    .line 38
    .line 39
    return-void
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
.end method

.method public setMargins(ILcom/facebook/react/bridge/Dynamic;)V
    .locals 4
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactPropGroup;
        names = {
            "margin",
            "marginVertical",
            "marginHorizontal",
            "marginStart",
            "marginEnd",
            "marginTop",
            "marginBottom",
            "marginLeft",
            "marginRight"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/facebook/react/uimanager/ViewProps;->PADDING_MARGIN_SPACING_TYPES:[I

    .line 2
    .line 3
    aget v0, v0, p1

    .line 4
    .line 5
    iget-object v1, p0, Lcom/th3rdwave/safeareacontext/h;->c:[F

    .line 6
    .line 7
    invoke-interface {p2}, Lcom/facebook/react/bridge/Dynamic;->getType()Lcom/facebook/react/bridge/ReadableType;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    sget-object v3, Lcom/facebook/react/bridge/ReadableType;->Number:Lcom/facebook/react/bridge/ReadableType;

    .line 12
    .line 13
    if-ne v2, v3, :cond_0

    .line 14
    .line 15
    invoke-interface {p2}, Lcom/facebook/react/bridge/Dynamic;->asDouble()D

    .line 16
    .line 17
    .line 18
    move-result-wide v2

    .line 19
    double-to-float v2, v2

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/high16 v2, 0x7fc00000    # Float.NaN

    .line 22
    .line 23
    :goto_0
    aput v2, v1, v0

    .line 24
    .line 25
    invoke-super {p0, p1, p2}, Lcom/facebook/react/uimanager/LayoutShadowNode;->setMargins(ILcom/facebook/react/bridge/Dynamic;)V

    .line 26
    .line 27
    .line 28
    const/4 p1, 0x1

    .line 29
    iput-boolean p1, p0, Lcom/th3rdwave/safeareacontext/h;->d:Z

    .line 30
    .line 31
    return-void
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
.end method

.method public setPaddings(ILcom/facebook/react/bridge/Dynamic;)V
    .locals 4
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactPropGroup;
        names = {
            "padding",
            "paddingVertical",
            "paddingHorizontal",
            "paddingStart",
            "paddingEnd",
            "paddingTop",
            "paddingBottom",
            "paddingLeft",
            "paddingRight"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/facebook/react/uimanager/ViewProps;->PADDING_MARGIN_SPACING_TYPES:[I

    .line 2
    .line 3
    aget v0, v0, p1

    .line 4
    .line 5
    iget-object v1, p0, Lcom/th3rdwave/safeareacontext/h;->b:[F

    .line 6
    .line 7
    invoke-interface {p2}, Lcom/facebook/react/bridge/Dynamic;->getType()Lcom/facebook/react/bridge/ReadableType;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    sget-object v3, Lcom/facebook/react/bridge/ReadableType;->Number:Lcom/facebook/react/bridge/ReadableType;

    .line 12
    .line 13
    if-ne v2, v3, :cond_0

    .line 14
    .line 15
    invoke-interface {p2}, Lcom/facebook/react/bridge/Dynamic;->asDouble()D

    .line 16
    .line 17
    .line 18
    move-result-wide v2

    .line 19
    double-to-float v2, v2

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/high16 v2, 0x7fc00000    # Float.NaN

    .line 22
    .line 23
    :goto_0
    aput v2, v1, v0

    .line 24
    .line 25
    invoke-super {p0, p1, p2}, Lcom/facebook/react/uimanager/LayoutShadowNode;->setPaddings(ILcom/facebook/react/bridge/Dynamic;)V

    .line 26
    .line 27
    .line 28
    const/4 p1, 0x1

    .line 29
    iput-boolean p1, p0, Lcom/th3rdwave/safeareacontext/h;->d:Z

    .line 30
    .line 31
    return-void
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
.end method
