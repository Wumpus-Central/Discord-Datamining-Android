.class final Lt7/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt7/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt7/a$b;
    }
.end annotation


# instance fields
.field private final a:Lt7/f;

.field private final b:J

.field private final c:J

.field private final d:Lt7/i;

.field private e:I

.field private f:J

.field private g:J

.field private h:J

.field private i:J

.field private j:J

.field private k:J

.field private l:J


# direct methods
.method public constructor <init>(Lt7/i;JJJJZ)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    cmp-long v0, p2, v0

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-ltz v0, :cond_0

    .line 10
    .line 11
    cmp-long v0, p4, p2

    .line 12
    .line 13
    if-lez v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move v0, v1

    .line 18
    :goto_0
    invoke-static {v0}, Lf9/a;->a(Z)V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Lt7/a;->d:Lt7/i;

    .line 22
    .line 23
    iput-wide p2, p0, Lt7/a;->b:J

    .line 24
    .line 25
    iput-wide p4, p0, Lt7/a;->c:J

    .line 26
    .line 27
    sub-long/2addr p4, p2

    .line 28
    cmp-long p1, p6, p4

    .line 29
    .line 30
    if-eqz p1, :cond_2

    .line 31
    .line 32
    if-eqz p10, :cond_1

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    iput v1, p0, Lt7/a;->e:I

    .line 36
    .line 37
    goto :goto_2

    .line 38
    :cond_2
    :goto_1
    iput-wide p8, p0, Lt7/a;->f:J

    .line 39
    .line 40
    const/4 p1, 0x4

    .line 41
    iput p1, p0, Lt7/a;->e:I

    .line 42
    .line 43
    :goto_2
    new-instance p1, Lt7/f;

    .line 44
    .line 45
    invoke-direct {p1}, Lt7/f;-><init>()V

    .line 46
    .line 47
    .line 48
    iput-object p1, p0, Lt7/a;->a:Lt7/f;

    .line 49
    .line 50
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
.end method

.method static synthetic d(Lt7/a;)Lt7/i;
    .locals 0

    iget-object p0, p0, Lt7/a;->d:Lt7/i;

    return-object p0
.end method

.method static synthetic e(Lt7/a;)J
    .locals 2

    iget-wide v0, p0, Lt7/a;->b:J

    return-wide v0
.end method

.method static synthetic f(Lt7/a;)J
    .locals 2

    iget-wide v0, p0, Lt7/a;->c:J

    return-wide v0
.end method

.method static synthetic g(Lt7/a;)J
    .locals 2

    iget-wide v0, p0, Lt7/a;->f:J

    return-wide v0
.end method

.method private i(Ll7/j;)J
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-wide v2, v0, Lt7/a;->i:J

    .line 6
    .line 7
    iget-wide v4, v0, Lt7/a;->j:J

    .line 8
    .line 9
    cmp-long v2, v2, v4

    .line 10
    .line 11
    const-wide/16 v3, -0x1

    .line 12
    .line 13
    if-nez v2, :cond_0

    .line 14
    .line 15
    return-wide v3

    .line 16
    :cond_0
    invoke-interface/range {p1 .. p1}, Ll7/j;->getPosition()J

    .line 17
    .line 18
    .line 19
    move-result-wide v5

    .line 20
    iget-object v2, v0, Lt7/a;->a:Lt7/f;

    .line 21
    .line 22
    iget-wide v7, v0, Lt7/a;->j:J

    .line 23
    .line 24
    invoke-virtual {v2, v1, v7, v8}, Lt7/f;->e(Ll7/j;J)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-nez v2, :cond_2

    .line 29
    .line 30
    iget-wide v1, v0, Lt7/a;->i:J

    .line 31
    .line 32
    cmp-long v3, v1, v5

    .line 33
    .line 34
    if-eqz v3, :cond_1

    .line 35
    .line 36
    return-wide v1

    .line 37
    :cond_1
    new-instance v1, Ljava/io/IOException;

    .line 38
    .line 39
    const-string v2, "No ogg page can be found."

    .line 40
    .line 41
    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw v1

    .line 45
    :cond_2
    iget-object v2, v0, Lt7/a;->a:Lt7/f;

    .line 46
    .line 47
    const/4 v7, 0x0

    .line 48
    invoke-virtual {v2, v1, v7}, Lt7/f;->b(Ll7/j;Z)Z

    .line 49
    .line 50
    .line 51
    invoke-interface/range {p1 .. p1}, Ll7/j;->j()V

    .line 52
    .line 53
    .line 54
    iget-wide v7, v0, Lt7/a;->h:J

    .line 55
    .line 56
    iget-object v2, v0, Lt7/a;->a:Lt7/f;

    .line 57
    .line 58
    iget-wide v9, v2, Lt7/f;->c:J

    .line 59
    .line 60
    sub-long/2addr v7, v9

    .line 61
    iget v11, v2, Lt7/f;->h:I

    .line 62
    .line 63
    iget v2, v2, Lt7/f;->i:I

    .line 64
    .line 65
    add-int/2addr v11, v2

    .line 66
    const-wide/16 v12, 0x0

    .line 67
    .line 68
    cmp-long v2, v12, v7

    .line 69
    .line 70
    if-gtz v2, :cond_3

    .line 71
    .line 72
    const-wide/32 v14, 0x11940

    .line 73
    .line 74
    .line 75
    cmp-long v2, v7, v14

    .line 76
    .line 77
    if-gez v2, :cond_3

    .line 78
    .line 79
    return-wide v3

    .line 80
    :cond_3
    cmp-long v2, v7, v12

    .line 81
    .line 82
    if-gez v2, :cond_4

    .line 83
    .line 84
    iput-wide v5, v0, Lt7/a;->j:J

    .line 85
    .line 86
    iput-wide v9, v0, Lt7/a;->l:J

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_4
    invoke-interface/range {p1 .. p1}, Ll7/j;->getPosition()J

    .line 90
    .line 91
    .line 92
    move-result-wide v3

    .line 93
    int-to-long v5, v11

    .line 94
    add-long/2addr v3, v5

    .line 95
    iput-wide v3, v0, Lt7/a;->i:J

    .line 96
    .line 97
    iget-object v3, v0, Lt7/a;->a:Lt7/f;

    .line 98
    .line 99
    iget-wide v3, v3, Lt7/f;->c:J

    .line 100
    .line 101
    iput-wide v3, v0, Lt7/a;->k:J

    .line 102
    .line 103
    :goto_0
    iget-wide v3, v0, Lt7/a;->j:J

    .line 104
    .line 105
    iget-wide v5, v0, Lt7/a;->i:J

    .line 106
    .line 107
    sub-long/2addr v3, v5

    .line 108
    const-wide/32 v9, 0x186a0

    .line 109
    .line 110
    .line 111
    cmp-long v3, v3, v9

    .line 112
    .line 113
    if-gez v3, :cond_5

    .line 114
    .line 115
    iput-wide v5, v0, Lt7/a;->j:J

    .line 116
    .line 117
    return-wide v5

    .line 118
    :cond_5
    int-to-long v3, v11

    .line 119
    const-wide/16 v5, 0x1

    .line 120
    .line 121
    if-gtz v2, :cond_6

    .line 122
    .line 123
    const-wide/16 v9, 0x2

    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_6
    move-wide v9, v5

    .line 127
    :goto_1
    mul-long/2addr v3, v9

    .line 128
    invoke-interface/range {p1 .. p1}, Ll7/j;->getPosition()J

    .line 129
    .line 130
    .line 131
    move-result-wide v1

    .line 132
    sub-long/2addr v1, v3

    .line 133
    iget-wide v3, v0, Lt7/a;->j:J

    .line 134
    .line 135
    iget-wide v11, v0, Lt7/a;->i:J

    .line 136
    .line 137
    sub-long v9, v3, v11

    .line 138
    .line 139
    mul-long/2addr v7, v9

    .line 140
    iget-wide v9, v0, Lt7/a;->l:J

    .line 141
    .line 142
    iget-wide v13, v0, Lt7/a;->k:J

    .line 143
    .line 144
    sub-long/2addr v9, v13

    .line 145
    div-long/2addr v7, v9

    .line 146
    add-long v9, v1, v7

    .line 147
    .line 148
    sub-long v13, v3, v5

    .line 149
    .line 150
    invoke-static/range {v9 .. v14}, Lf9/q0;->s(JJJ)J

    .line 151
    .line 152
    .line 153
    move-result-wide v1

    .line 154
    return-wide v1
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
.end method

.method private k(Ll7/j;)V
    .locals 5

    .line 1
    :goto_0
    iget-object v0, p0, Lt7/a;->a:Lt7/f;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lt7/f;->d(Ll7/j;)Z

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lt7/a;->a:Lt7/f;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-virtual {v0, p1, v1}, Lt7/f;->b(Ll7/j;Z)Z

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lt7/a;->a:Lt7/f;

    .line 13
    .line 14
    iget-wide v1, v0, Lt7/f;->c:J

    .line 15
    .line 16
    iget-wide v3, p0, Lt7/a;->h:J

    .line 17
    .line 18
    cmp-long v1, v1, v3

    .line 19
    .line 20
    if-lez v1, :cond_0

    .line 21
    .line 22
    invoke-interface {p1}, Ll7/j;->j()V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    iget v1, v0, Lt7/f;->h:I

    .line 27
    .line 28
    iget v0, v0, Lt7/f;->i:I

    .line 29
    .line 30
    add-int/2addr v1, v0

    .line 31
    invoke-interface {p1, v1}, Ll7/j;->k(I)V

    .line 32
    .line 33
    .line 34
    invoke-interface {p1}, Ll7/j;->getPosition()J

    .line 35
    .line 36
    .line 37
    move-result-wide v0

    .line 38
    iput-wide v0, p0, Lt7/a;->i:J

    .line 39
    .line 40
    iget-object v0, p0, Lt7/a;->a:Lt7/f;

    .line 41
    .line 42
    iget-wide v0, v0, Lt7/f;->c:J

    .line 43
    .line 44
    iput-wide v0, p0, Lt7/a;->k:J

    .line 45
    .line 46
    goto :goto_0
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
.end method


# virtual methods
.method public a(Ll7/j;)J
    .locals 7

    .line 1
    iget v0, p0, Lt7/a;->e:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x4

    .line 5
    if-eqz v0, :cond_4

    .line 6
    .line 7
    if-eq v0, v1, :cond_5

    .line 8
    .line 9
    const/4 v1, 0x2

    .line 10
    const-wide/16 v3, -0x1

    .line 11
    .line 12
    const/4 v5, 0x3

    .line 13
    if-eq v0, v1, :cond_1

    .line 14
    .line 15
    if-eq v0, v5, :cond_3

    .line 16
    .line 17
    if-ne v0, v2, :cond_0

    .line 18
    .line 19
    return-wide v3

    .line 20
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 21
    .line 22
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 23
    .line 24
    .line 25
    throw p1

    .line 26
    :cond_1
    invoke-direct {p0, p1}, Lt7/a;->i(Ll7/j;)J

    .line 27
    .line 28
    .line 29
    move-result-wide v0

    .line 30
    cmp-long v3, v0, v3

    .line 31
    .line 32
    if-eqz v3, :cond_2

    .line 33
    .line 34
    return-wide v0

    .line 35
    :cond_2
    iput v5, p0, Lt7/a;->e:I

    .line 36
    .line 37
    :cond_3
    invoke-direct {p0, p1}, Lt7/a;->k(Ll7/j;)V

    .line 38
    .line 39
    .line 40
    iput v2, p0, Lt7/a;->e:I

    .line 41
    .line 42
    iget-wide v0, p0, Lt7/a;->k:J

    .line 43
    .line 44
    const-wide/16 v2, 0x2

    .line 45
    .line 46
    add-long/2addr v0, v2

    .line 47
    neg-long v0, v0

    .line 48
    return-wide v0

    .line 49
    :cond_4
    invoke-interface {p1}, Ll7/j;->getPosition()J

    .line 50
    .line 51
    .line 52
    move-result-wide v3

    .line 53
    iput-wide v3, p0, Lt7/a;->g:J

    .line 54
    .line 55
    iput v1, p0, Lt7/a;->e:I

    .line 56
    .line 57
    iget-wide v0, p0, Lt7/a;->c:J

    .line 58
    .line 59
    const-wide/32 v5, 0xff1b

    .line 60
    .line 61
    .line 62
    sub-long/2addr v0, v5

    .line 63
    cmp-long v3, v0, v3

    .line 64
    .line 65
    if-lez v3, :cond_5

    .line 66
    .line 67
    return-wide v0

    .line 68
    :cond_5
    invoke-virtual {p0, p1}, Lt7/a;->j(Ll7/j;)J

    .line 69
    .line 70
    .line 71
    move-result-wide v0

    .line 72
    iput-wide v0, p0, Lt7/a;->f:J

    .line 73
    .line 74
    iput v2, p0, Lt7/a;->e:I

    .line 75
    .line 76
    iget-wide v0, p0, Lt7/a;->g:J

    .line 77
    .line 78
    return-wide v0
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
.end method

.method public bridge synthetic b()Ll7/y;
    .locals 1

    invoke-virtual {p0}, Lt7/a;->h()Lt7/a$b;

    move-result-object v0

    return-object v0
.end method

.method public c(J)V
    .locals 6

    .line 1
    const-wide/16 v2, 0x0

    .line 2
    .line 3
    iget-wide v0, p0, Lt7/a;->f:J

    .line 4
    .line 5
    const-wide/16 v4, 0x1

    .line 6
    .line 7
    sub-long v4, v0, v4

    .line 8
    .line 9
    move-wide v0, p1

    .line 10
    invoke-static/range {v0 .. v5}, Lf9/q0;->s(JJJ)J

    .line 11
    .line 12
    .line 13
    move-result-wide p1

    .line 14
    iput-wide p1, p0, Lt7/a;->h:J

    .line 15
    .line 16
    const/4 p1, 0x2

    .line 17
    iput p1, p0, Lt7/a;->e:I

    .line 18
    .line 19
    iget-wide p1, p0, Lt7/a;->b:J

    .line 20
    .line 21
    iput-wide p1, p0, Lt7/a;->i:J

    .line 22
    .line 23
    iget-wide p1, p0, Lt7/a;->c:J

    .line 24
    .line 25
    iput-wide p1, p0, Lt7/a;->j:J

    .line 26
    .line 27
    const-wide/16 p1, 0x0

    .line 28
    .line 29
    iput-wide p1, p0, Lt7/a;->k:J

    .line 30
    .line 31
    iget-wide p1, p0, Lt7/a;->f:J

    .line 32
    .line 33
    iput-wide p1, p0, Lt7/a;->l:J

    .line 34
    .line 35
    return-void
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
.end method

.method public h()Lt7/a$b;
    .locals 4

    iget-wide v0, p0, Lt7/a;->f:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    new-instance v0, Lt7/a$b;

    invoke-direct {v0, p0, v1}, Lt7/a$b;-><init>(Lt7/a;Lt7/a$a;)V

    move-object v1, v0

    :cond_0
    return-object v1
.end method

.method j(Ll7/j;)J
    .locals 4

    .line 1
    iget-object v0, p0, Lt7/a;->a:Lt7/f;

    .line 2
    .line 3
    invoke-virtual {v0}, Lt7/f;->c()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lt7/a;->a:Lt7/f;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lt7/f;->d(Ll7/j;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_2

    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Lt7/a;->a:Lt7/f;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-virtual {v0, p1, v1}, Lt7/f;->b(Ll7/j;Z)Z

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lt7/a;->a:Lt7/f;

    .line 21
    .line 22
    iget v1, v0, Lt7/f;->h:I

    .line 23
    .line 24
    iget v0, v0, Lt7/f;->i:I

    .line 25
    .line 26
    add-int/2addr v1, v0

    .line 27
    invoke-interface {p1, v1}, Ll7/j;->k(I)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lt7/a;->a:Lt7/f;

    .line 31
    .line 32
    iget v1, v0, Lt7/f;->b:I

    .line 33
    .line 34
    const/4 v2, 0x4

    .line 35
    and-int/2addr v1, v2

    .line 36
    if-eq v1, v2, :cond_1

    .line 37
    .line 38
    invoke-virtual {v0, p1}, Lt7/f;->d(Ll7/j;)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    invoke-interface {p1}, Ll7/j;->getPosition()J

    .line 45
    .line 46
    .line 47
    move-result-wide v0

    .line 48
    iget-wide v2, p0, Lt7/a;->c:J

    .line 49
    .line 50
    cmp-long v0, v0, v2

    .line 51
    .line 52
    if-ltz v0, :cond_0

    .line 53
    .line 54
    :cond_1
    iget-object p1, p0, Lt7/a;->a:Lt7/f;

    .line 55
    .line 56
    iget-wide v0, p1, Lt7/f;->c:J

    .line 57
    .line 58
    return-wide v0

    .line 59
    :cond_2
    new-instance p1, Ljava/io/EOFException;

    .line 60
    .line 61
    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    .line 62
    .line 63
    .line 64
    throw p1
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
.end method
