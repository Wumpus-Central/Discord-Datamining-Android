.class final Lnet/time4j/tz/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnet/time4j/tz/o;
.implements Ljava/io/Serializable;


# static fields
.field private static final m:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lnet/time4j/tz/n;",
            ">;"
        }
    .end annotation
.end field

.field private static final serialVersionUID:J = 0x18d8e68000b7a496L


# instance fields
.field private final transient k:Lnet/time4j/tz/b;

.field private final transient l:Lnet/time4j/tz/g;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lnet/time4j/tz/n;->m:Ljava/util/Map;

    .line 7
    .line 8
    invoke-static {}, Lnet/time4j/tz/b;->values()[Lnet/time4j/tz/b;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    array-length v1, v0

    .line 13
    const/4 v2, 0x0

    .line 14
    move v3, v2

    .line 15
    :goto_0
    if-ge v3, v1, :cond_1

    .line 16
    .line 17
    aget-object v4, v0, v3

    .line 18
    .line 19
    invoke-static {}, Lnet/time4j/tz/g;->values()[Lnet/time4j/tz/g;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    array-length v6, v5

    .line 24
    move v7, v2

    .line 25
    :goto_1
    if-ge v7, v6, :cond_0

    .line 26
    .line 27
    aget-object v8, v5, v7

    .line 28
    .line 29
    new-instance v9, Lnet/time4j/tz/n;

    .line 30
    .line 31
    invoke-direct {v9, v4, v8}, Lnet/time4j/tz/n;-><init>(Lnet/time4j/tz/b;Lnet/time4j/tz/g;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 35
    .line 36
    .line 37
    move-result v10

    .line 38
    mul-int/lit8 v10, v10, 0x2

    .line 39
    .line 40
    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    .line 41
    .line 42
    .line 43
    move-result v8

    .line 44
    add-int/2addr v10, v8

    .line 45
    sget-object v8, Lnet/time4j/tz/n;->m:Ljava/util/Map;

    .line 46
    .line 47
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    .line 49
    .line 50
    move-result-object v10

    .line 51
    invoke-interface {v8, v10, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    add-int/lit8 v7, v7, 0x1

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    return-void
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

.method private constructor <init>(Lnet/time4j/tz/b;Lnet/time4j/tz/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/time4j/tz/n;->k:Lnet/time4j/tz/b;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/time4j/tz/n;->l:Lnet/time4j/tz/g;

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
.end method

.method static d(Lnet/time4j/tz/b;Lnet/time4j/tz/g;)Lnet/time4j/tz/n;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    mul-int/lit8 p0, p0, 0x2

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    add-int/2addr p0, p1

    .line 12
    sget-object p1, Lnet/time4j/tz/n;->m:Ljava/util/Map;

    .line 13
    .line 14
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-interface {p1, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    check-cast p0, Lnet/time4j/tz/n;

    .line 23
    .line 24
    return-object p0
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
.end method

.method private static e(Lnet/time4j/base/a;Lnet/time4j/base/g;Lnet/time4j/tz/l;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string v2, "Invalid local timestamp due to timezone transition: local-date="

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string p0, ", local-time="

    .line 17
    .line 18
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string p0, " ["

    .line 25
    .line 26
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p2}, Lnet/time4j/tz/l;->z()Lnet/time4j/tz/k;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-interface {p0}, Lnet/time4j/tz/k;->a()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string p0, "]"

    .line 41
    .line 42
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw v0
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

.method private static f(IIIIII)J
    .locals 2

    .line 1
    invoke-static {p0, p1, p2}, Lnet/time4j/base/b;->j(III)J

    .line 2
    .line 3
    .line 4
    move-result-wide p0

    .line 5
    const-wide/32 v0, 0x9e8b

    .line 6
    .line 7
    .line 8
    invoke-static {p0, p1, v0, v1}, Lnet/time4j/base/c;->m(JJ)J

    .line 9
    .line 10
    .line 11
    move-result-wide p0

    .line 12
    const-wide/32 v0, 0x15180

    .line 13
    .line 14
    .line 15
    invoke-static {p0, p1, v0, v1}, Lnet/time4j/base/c;->i(JJ)J

    .line 16
    .line 17
    .line 18
    move-result-wide p0

    .line 19
    mul-int/lit16 p3, p3, 0xe10

    .line 20
    .line 21
    mul-int/lit8 p4, p4, 0x3c

    .line 22
    .line 23
    add-int/2addr p3, p4

    .line 24
    add-int/2addr p3, p5

    .line 25
    int-to-long p2, p3

    .line 26
    add-long/2addr p0, p2

    .line 27
    return-wide p0
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
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 1

    new-instance p1, Ljava/io/InvalidObjectException;

    const-string v0, "Serialization proxy required."

    invoke-direct {p1, v0}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private writeReplace()Ljava/lang/Object;
    .locals 2

    new-instance v0, Lnet/time4j/tz/SPX;

    const/16 v1, 0xd

    invoke-direct {v0, p0, v1}, Lnet/time4j/tz/SPX;-><init>(Ljava/lang/Object;I)V

    return-object v0
.end method


# virtual methods
.method public a(Lnet/time4j/tz/g;)Lnet/time4j/tz/o;
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/time4j/tz/n;->l:Lnet/time4j/tz/g;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    iget-object v0, p0, Lnet/time4j/tz/n;->k:Lnet/time4j/tz/b;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lnet/time4j/tz/b;->a(Lnet/time4j/tz/g;)Lnet/time4j/tz/o;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
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

.method public b(Lnet/time4j/base/a;Lnet/time4j/base/g;Lnet/time4j/tz/l;)J
    .locals 23

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
    invoke-interface/range {p1 .. p1}, Lnet/time4j/base/a;->i()I

    .line 8
    .line 9
    .line 10
    move-result v10

    .line 11
    invoke-interface/range {p1 .. p1}, Lnet/time4j/base/a;->j()I

    .line 12
    .line 13
    .line 14
    move-result v11

    .line 15
    invoke-interface/range {p1 .. p1}, Lnet/time4j/base/a;->p()I

    .line 16
    .line 17
    .line 18
    move-result v12

    .line 19
    invoke-interface/range {p2 .. p2}, Lnet/time4j/base/g;->q()I

    .line 20
    .line 21
    .line 22
    move-result v13

    .line 23
    invoke-interface/range {p2 .. p2}, Lnet/time4j/base/g;->e()I

    .line 24
    .line 25
    .line 26
    move-result v14

    .line 27
    invoke-interface/range {p2 .. p2}, Lnet/time4j/base/g;->s()I

    .line 28
    .line 29
    .line 30
    move-result v15

    .line 31
    invoke-virtual/range {p3 .. p3}, Lnet/time4j/tz/l;->y()Lnet/time4j/tz/m;

    .line 32
    .line 33
    .line 34
    move-result-object v9

    .line 35
    const/4 v8, 0x2

    .line 36
    const/4 v7, 0x0

    .line 37
    const/4 v6, 0x1

    .line 38
    if-nez v9, :cond_4

    .line 39
    .line 40
    iget-object v3, v0, Lnet/time4j/tz/n;->l:Lnet/time4j/tz/g;

    .line 41
    .line 42
    sget-object v4, Lnet/time4j/tz/g;->l:Lnet/time4j/tz/g;

    .line 43
    .line 44
    if-ne v3, v4, :cond_4

    .line 45
    .line 46
    iget-object v3, v0, Lnet/time4j/tz/n;->k:Lnet/time4j/tz/b;

    .line 47
    .line 48
    sget-object v4, Lnet/time4j/tz/b;->k:Lnet/time4j/tz/b;

    .line 49
    .line 50
    if-eq v3, v4, :cond_0

    .line 51
    .line 52
    sget-object v4, Lnet/time4j/tz/b;->m:Lnet/time4j/tz/b;

    .line 53
    .line 54
    if-ne v3, v4, :cond_4

    .line 55
    .line 56
    :cond_0
    invoke-virtual/range {p3 .. p3}, Lnet/time4j/tz/l;->z()Lnet/time4j/tz/k;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-interface {v3}, Lnet/time4j/tz/k;->a()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    invoke-static {v3}, Lj$/util/DesugarTimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    new-instance v9, Ljava/util/GregorianCalendar;

    .line 69
    .line 70
    invoke-direct {v9, v3}, Ljava/util/GregorianCalendar;-><init>(Ljava/util/TimeZone;)V

    .line 71
    .line 72
    .line 73
    new-instance v3, Ljava/util/Date;

    .line 74
    .line 75
    const-wide/high16 v4, -0x8000000000000000L

    .line 76
    .line 77
    invoke-direct {v3, v4, v5}, Ljava/util/Date;-><init>(J)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v9, v3}, Ljava/util/GregorianCalendar;->setGregorianChange(Ljava/util/Date;)V

    .line 81
    .line 82
    .line 83
    const/16 v3, 0xe

    .line 84
    .line 85
    invoke-virtual {v9, v3, v7}, Ljava/util/Calendar;->set(II)V

    .line 86
    .line 87
    .line 88
    add-int/lit8 v5, v11, -0x1

    .line 89
    .line 90
    move-object v3, v9

    .line 91
    move v4, v10

    .line 92
    move v7, v6

    .line 93
    move v6, v12

    .line 94
    move v1, v7

    .line 95
    move v7, v13

    .line 96
    move v8, v14

    .line 97
    move-object v2, v9

    .line 98
    move v9, v15

    .line 99
    invoke-virtual/range {v3 .. v9}, Ljava/util/Calendar;->set(IIIIII)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v2, v1}, Ljava/util/Calendar;->get(I)I

    .line 103
    .line 104
    .line 105
    move-result v3

    .line 106
    const/4 v4, 0x2

    .line 107
    invoke-virtual {v2, v4}, Ljava/util/Calendar;->get(I)I

    .line 108
    .line 109
    .line 110
    move-result v4

    .line 111
    add-int/2addr v1, v4

    .line 112
    const/4 v4, 0x5

    .line 113
    invoke-virtual {v2, v4}, Ljava/util/Calendar;->get(I)I

    .line 114
    .line 115
    .line 116
    move-result v4

    .line 117
    const/16 v5, 0xb

    .line 118
    .line 119
    invoke-virtual {v2, v5}, Ljava/util/Calendar;->get(I)I

    .line 120
    .line 121
    .line 122
    move-result v5

    .line 123
    const/16 v6, 0xc

    .line 124
    .line 125
    invoke-virtual {v2, v6}, Ljava/util/Calendar;->get(I)I

    .line 126
    .line 127
    .line 128
    move-result v6

    .line 129
    const/16 v7, 0xd

    .line 130
    .line 131
    invoke-virtual {v2, v7}, Ljava/util/Calendar;->get(I)I

    .line 132
    .line 133
    .line 134
    move-result v2

    .line 135
    iget-object v7, v0, Lnet/time4j/tz/n;->k:Lnet/time4j/tz/b;

    .line 136
    .line 137
    sget-object v8, Lnet/time4j/tz/b;->m:Lnet/time4j/tz/b;

    .line 138
    .line 139
    if-ne v7, v8, :cond_2

    .line 140
    .line 141
    if-ne v10, v3, :cond_1

    .line 142
    .line 143
    if-ne v11, v1, :cond_1

    .line 144
    .line 145
    if-ne v12, v4, :cond_1

    .line 146
    .line 147
    if-ne v13, v5, :cond_1

    .line 148
    .line 149
    if-ne v14, v6, :cond_1

    .line 150
    .line 151
    if-eq v15, v2, :cond_2

    .line 152
    .line 153
    :cond_1
    invoke-static/range {p1 .. p3}, Lnet/time4j/tz/n;->e(Lnet/time4j/base/a;Lnet/time4j/base/g;Lnet/time4j/tz/l;)V

    .line 154
    .line 155
    .line 156
    :cond_2
    move/from16 v17, v3

    .line 157
    .line 158
    move/from16 v18, v1

    .line 159
    .line 160
    move/from16 v19, v4

    .line 161
    .line 162
    move/from16 v20, v5

    .line 163
    .line 164
    move/from16 v21, v6

    .line 165
    .line 166
    move/from16 v22, v2

    .line 167
    .line 168
    invoke-static/range {v17 .. v22}, Lnet/time4j/tz/n;->f(IIIIII)J

    .line 169
    .line 170
    .line 171
    move-result-wide v1

    .line 172
    move-object/from16 v8, p1

    .line 173
    .line 174
    move-object/from16 v6, p2

    .line 175
    .line 176
    move-object/from16 v3, p3

    .line 177
    .line 178
    invoke-virtual {v3, v8, v6}, Lnet/time4j/tz/l;->A(Lnet/time4j/base/a;Lnet/time4j/base/g;)Lnet/time4j/tz/p;

    .line 179
    .line 180
    .line 181
    move-result-object v3

    .line 182
    invoke-virtual {v3}, Lnet/time4j/tz/p;->l()I

    .line 183
    .line 184
    .line 185
    move-result v3

    .line 186
    :cond_3
    :goto_0
    int-to-long v3, v3

    .line 187
    sub-long/2addr v1, v3

    .line 188
    return-wide v1

    .line 189
    :cond_4
    move-object/from16 v3, p3

    .line 190
    .line 191
    move v4, v8

    .line 192
    move-object v8, v1

    .line 193
    move v1, v6

    .line 194
    move-object v6, v2

    .line 195
    if-eqz v9, :cond_a

    .line 196
    .line 197
    invoke-interface {v9, v8, v6}, Lnet/time4j/tz/m;->a(Lnet/time4j/base/a;Lnet/time4j/base/g;)Lnet/time4j/tz/q;

    .line 198
    .line 199
    .line 200
    move-result-object v16

    .line 201
    if-eqz v16, :cond_9

    .line 202
    .line 203
    invoke-virtual/range {v16 .. v16}, Lnet/time4j/tz/q;->l()Z

    .line 204
    .line 205
    .line 206
    move-result v2

    .line 207
    if-eqz v2, :cond_8

    .line 208
    .line 209
    sget-object v2, Lnet/time4j/tz/n$a;->a:[I

    .line 210
    .line 211
    iget-object v5, v0, Lnet/time4j/tz/n;->k:Lnet/time4j/tz/b;

    .line 212
    .line 213
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 214
    .line 215
    .line 216
    move-result v5

    .line 217
    aget v2, v2, v5

    .line 218
    .line 219
    if-eq v2, v1, :cond_7

    .line 220
    .line 221
    if-eq v2, v4, :cond_6

    .line 222
    .line 223
    const/4 v1, 0x3

    .line 224
    if-ne v2, v1, :cond_5

    .line 225
    .line 226
    invoke-static/range {p1 .. p3}, Lnet/time4j/tz/n;->e(Lnet/time4j/base/a;Lnet/time4j/base/g;Lnet/time4j/tz/l;)V

    .line 227
    .line 228
    .line 229
    goto :goto_1

    .line 230
    :cond_5
    iget-object v1, v0, Lnet/time4j/tz/n;->k:Lnet/time4j/tz/b;

    .line 231
    .line 232
    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v1

    .line 236
    new-instance v2, Ljava/lang/UnsupportedOperationException;

    .line 237
    .line 238
    invoke-direct {v2, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    throw v2

    .line 242
    :cond_6
    invoke-virtual/range {v16 .. v16}, Lnet/time4j/tz/q;->f()J

    .line 243
    .line 244
    .line 245
    move-result-wide v1

    .line 246
    return-wide v1

    .line 247
    :cond_7
    move v1, v10

    .line 248
    move v2, v11

    .line 249
    move v3, v12

    .line 250
    move v4, v13

    .line 251
    move v5, v14

    .line 252
    move v6, v15

    .line 253
    invoke-static/range {v1 .. v6}, Lnet/time4j/tz/n;->f(IIIIII)J

    .line 254
    .line 255
    .line 256
    move-result-wide v1

    .line 257
    invoke-virtual/range {v16 .. v16}, Lnet/time4j/tz/q;->i()I

    .line 258
    .line 259
    .line 260
    move-result v3

    .line 261
    int-to-long v3, v3

    .line 262
    add-long/2addr v1, v3

    .line 263
    invoke-virtual/range {v16 .. v16}, Lnet/time4j/tz/q;->k()I

    .line 264
    .line 265
    .line 266
    move-result v3

    .line 267
    goto :goto_0

    .line 268
    :cond_8
    invoke-virtual/range {v16 .. v16}, Lnet/time4j/tz/q;->m()Z

    .line 269
    .line 270
    .line 271
    move-result v1

    .line 272
    if-eqz v1, :cond_9

    .line 273
    .line 274
    move v1, v10

    .line 275
    move v2, v11

    .line 276
    move v3, v12

    .line 277
    move v4, v13

    .line 278
    move v5, v14

    .line 279
    move v6, v15

    .line 280
    invoke-static/range {v1 .. v6}, Lnet/time4j/tz/n;->f(IIIIII)J

    .line 281
    .line 282
    .line 283
    move-result-wide v1

    .line 284
    invoke-virtual/range {v16 .. v16}, Lnet/time4j/tz/q;->k()I

    .line 285
    .line 286
    .line 287
    move-result v3

    .line 288
    iget-object v4, v0, Lnet/time4j/tz/n;->l:Lnet/time4j/tz/g;

    .line 289
    .line 290
    sget-object v5, Lnet/time4j/tz/g;->k:Lnet/time4j/tz/g;

    .line 291
    .line 292
    if-ne v4, v5, :cond_3

    .line 293
    .line 294
    invoke-virtual/range {v16 .. v16}, Lnet/time4j/tz/q;->h()I

    .line 295
    .line 296
    .line 297
    move-result v3

    .line 298
    goto :goto_0

    .line 299
    :cond_9
    :goto_1
    move v3, v10

    .line 300
    move v4, v11

    .line 301
    move v5, v12

    .line 302
    move-object v1, v6

    .line 303
    move v6, v13

    .line 304
    move v2, v7

    .line 305
    move v7, v14

    .line 306
    move-object v10, v8

    .line 307
    move v8, v15

    .line 308
    invoke-static/range {v3 .. v8}, Lnet/time4j/tz/n;->f(IIIIII)J

    .line 309
    .line 310
    .line 311
    move-result-wide v3

    .line 312
    invoke-interface {v9, v10, v1}, Lnet/time4j/tz/m;->c(Lnet/time4j/base/a;Lnet/time4j/base/g;)Ljava/util/List;

    .line 313
    .line 314
    .line 315
    move-result-object v1

    .line 316
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object v1

    .line 320
    check-cast v1, Lnet/time4j/tz/p;

    .line 321
    .line 322
    invoke-virtual {v1}, Lnet/time4j/tz/p;->l()I

    .line 323
    .line 324
    .line 325
    move-result v1

    .line 326
    int-to-long v1, v1

    .line 327
    sub-long/2addr v3, v1

    .line 328
    return-wide v3

    .line 329
    :cond_a
    new-instance v1, Ljava/lang/UnsupportedOperationException;

    .line 330
    .line 331
    const-string v2, "Timezone provider does not expose its transition history."

    .line 332
    .line 333
    invoke-direct {v1, v2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 334
    .line 335
    .line 336
    throw v1
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
.end method

.method c()I
    .locals 2

    iget-object v0, p0, Lnet/time4j/tz/n;->k:Lnet/time4j/tz/b;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    iget-object v1, p0, Lnet/time4j/tz/n;->l:Lnet/time4j/tz/g;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const/16 v1, 0x20

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 6
    .line 7
    .line 8
    const-class v1, Lnet/time4j/tz/n;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v1, ":[gap="

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Lnet/time4j/tz/n;->k:Lnet/time4j/tz/b;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v1, ",overlap="

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    iget-object v1, p0, Lnet/time4j/tz/n;->l:Lnet/time4j/tz/g;

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const/16 v1, 0x5d

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    return-object v0
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
