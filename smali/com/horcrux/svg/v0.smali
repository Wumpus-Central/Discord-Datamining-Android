.class Lcom/horcrux/svg/v0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static a(Landroid/graphics/RectF;Landroid/graphics/RectF;Ljava/lang/String;I)Landroid/graphics/Matrix;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move/from16 v3, p3

    .line 8
    .line 9
    iget v4, v0, Landroid/graphics/RectF;->left:F

    .line 10
    .line 11
    float-to-double v4, v4

    .line 12
    iget v6, v0, Landroid/graphics/RectF;->top:F

    .line 13
    .line 14
    float-to-double v6, v6

    .line 15
    invoke-virtual/range {p0 .. p0}, Landroid/graphics/RectF;->width()F

    .line 16
    .line 17
    .line 18
    move-result v8

    .line 19
    float-to-double v8, v8

    .line 20
    invoke-virtual/range {p0 .. p0}, Landroid/graphics/RectF;->height()F

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    float-to-double v10, v0

    .line 25
    iget v0, v1, Landroid/graphics/RectF;->left:F

    .line 26
    .line 27
    float-to-double v12, v0

    .line 28
    iget v0, v1, Landroid/graphics/RectF;->top:F

    .line 29
    .line 30
    float-to-double v14, v0

    .line 31
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/RectF;->width()F

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    float-to-double v0, v0

    .line 36
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/RectF;->height()F

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    float-to-double v2, v2

    .line 41
    move-wide/from16 v16, v14

    .line 42
    .line 43
    div-double v14, v0, v8

    .line 44
    .line 45
    move-wide/from16 v18, v8

    .line 46
    .line 47
    div-double v8, v2, v10

    .line 48
    .line 49
    mul-double/2addr v4, v14

    .line 50
    sub-double/2addr v12, v4

    .line 51
    mul-double/2addr v6, v8

    .line 52
    sub-double v4, v16, v6

    .line 53
    .line 54
    const/4 v6, 0x2

    .line 55
    const-wide/high16 v16, 0x4000000000000000L    # 2.0

    .line 56
    .line 57
    move-wide/from16 v20, v2

    .line 58
    .line 59
    move/from16 v2, p3

    .line 60
    .line 61
    if-ne v2, v6, :cond_1

    .line 62
    .line 63
    invoke-static {v14, v15, v8, v9}, Ljava/lang/Math;->min(DD)D

    .line 64
    .line 65
    .line 66
    move-result-wide v2

    .line 67
    const-wide/high16 v6, 0x3ff0000000000000L    # 1.0

    .line 68
    .line 69
    cmpl-double v6, v2, v6

    .line 70
    .line 71
    if-lez v6, :cond_0

    .line 72
    .line 73
    div-double/2addr v0, v2

    .line 74
    sub-double v0, v0, v18

    .line 75
    .line 76
    div-double v0, v0, v16

    .line 77
    .line 78
    sub-double/2addr v12, v0

    .line 79
    div-double v0, v20, v2

    .line 80
    .line 81
    sub-double/2addr v0, v10

    .line 82
    goto :goto_0

    .line 83
    :cond_0
    mul-double v8, v18, v2

    .line 84
    .line 85
    sub-double/2addr v0, v8

    .line 86
    div-double v0, v0, v16

    .line 87
    .line 88
    sub-double/2addr v12, v0

    .line 89
    mul-double/2addr v10, v2

    .line 90
    sub-double v0, v20, v10

    .line 91
    .line 92
    :goto_0
    div-double v0, v0, v16

    .line 93
    .line 94
    sub-double/2addr v4, v0

    .line 95
    move-wide v8, v2

    .line 96
    goto :goto_3

    .line 97
    :cond_1
    const-string v3, "none"

    .line 98
    .line 99
    move-object/from16 v6, p2

    .line 100
    .line 101
    invoke-virtual {v6, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v7

    .line 105
    if-nez v7, :cond_2

    .line 106
    .line 107
    if-nez v2, :cond_2

    .line 108
    .line 109
    invoke-static {v14, v15, v8, v9}, Ljava/lang/Math;->min(DD)D

    .line 110
    .line 111
    .line 112
    move-result-wide v14

    .line 113
    :goto_1
    move-wide v8, v14

    .line 114
    goto :goto_2

    .line 115
    :cond_2
    invoke-virtual {v6, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v3

    .line 119
    if-nez v3, :cond_3

    .line 120
    .line 121
    const/4 v3, 0x1

    .line 122
    if-ne v2, v3, :cond_3

    .line 123
    .line 124
    invoke-static {v14, v15, v8, v9}, Ljava/lang/Math;->max(DD)D

    .line 125
    .line 126
    .line 127
    move-result-wide v14

    .line 128
    goto :goto_1

    .line 129
    :cond_3
    :goto_2
    const-string v2, "xMid"

    .line 130
    .line 131
    invoke-virtual {v6, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 132
    .line 133
    .line 134
    move-result v2

    .line 135
    if-eqz v2, :cond_4

    .line 136
    .line 137
    mul-double v2, v18, v14

    .line 138
    .line 139
    sub-double v2, v0, v2

    .line 140
    .line 141
    div-double v2, v2, v16

    .line 142
    .line 143
    add-double/2addr v12, v2

    .line 144
    :cond_4
    const-string v2, "xMax"

    .line 145
    .line 146
    invoke-virtual {v6, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 147
    .line 148
    .line 149
    move-result v2

    .line 150
    if-eqz v2, :cond_5

    .line 151
    .line 152
    mul-double v2, v18, v14

    .line 153
    .line 154
    sub-double/2addr v0, v2

    .line 155
    add-double/2addr v12, v0

    .line 156
    :cond_5
    const-string v0, "YMid"

    .line 157
    .line 158
    invoke-virtual {v6, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 159
    .line 160
    .line 161
    move-result v0

    .line 162
    if-eqz v0, :cond_6

    .line 163
    .line 164
    mul-double v0, v10, v8

    .line 165
    .line 166
    sub-double v2, v20, v0

    .line 167
    .line 168
    div-double v2, v2, v16

    .line 169
    .line 170
    add-double/2addr v4, v2

    .line 171
    :cond_6
    const-string v0, "YMax"

    .line 172
    .line 173
    invoke-virtual {v6, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 174
    .line 175
    .line 176
    move-result v0

    .line 177
    if-eqz v0, :cond_7

    .line 178
    .line 179
    mul-double/2addr v10, v8

    .line 180
    sub-double v2, v20, v10

    .line 181
    .line 182
    add-double/2addr v4, v2

    .line 183
    :cond_7
    move-wide v2, v14

    .line 184
    :goto_3
    new-instance v0, Landroid/graphics/Matrix;

    .line 185
    .line 186
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 187
    .line 188
    .line 189
    double-to-float v1, v12

    .line 190
    double-to-float v4, v4

    .line 191
    invoke-virtual {v0, v1, v4}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 192
    .line 193
    .line 194
    double-to-float v1, v2

    .line 195
    double-to-float v2, v8

    .line 196
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Matrix;->preScale(FF)Z

    .line 197
    .line 198
    .line 199
    return-object v0
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
.end method
