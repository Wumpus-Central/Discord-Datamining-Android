.class public final Lgd/l;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/String;

.field private static final b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Lgd/l;->a:Ljava/lang/String;

    .line 10
    .line 11
    const-string v1, "SJIS"

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-nez v1, :cond_1

    .line 18
    .line 19
    const-string v1, "EUC_JP"

    .line 20
    .line 21
    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v0, 0x0

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 31
    :goto_1
    sput-boolean v0, Lgd/l;->b:Z

    .line 32
    .line 33
    return-void
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

.method public static a([BLjava/util/Map;)Ljava/lang/String;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B",
            "Ljava/util/Map<",
            "Lcd/e;",
            "*>;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    sget-object v2, Lcd/e;->p:Lcd/e;

    .line 8
    .line 9
    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    if-eqz v3, :cond_0

    .line 14
    .line 15
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    return-object v0

    .line 24
    :cond_0
    array-length v1, v0

    .line 25
    array-length v2, v0

    .line 26
    const/4 v3, 0x2

    .line 27
    const/4 v4, 0x3

    .line 28
    const/4 v5, 0x1

    .line 29
    const/4 v6, 0x0

    .line 30
    if-le v2, v4, :cond_1

    .line 31
    .line 32
    aget-byte v2, v0, v6

    .line 33
    .line 34
    const/16 v7, -0x11

    .line 35
    .line 36
    if-ne v2, v7, :cond_1

    .line 37
    .line 38
    aget-byte v2, v0, v5

    .line 39
    .line 40
    const/16 v7, -0x45

    .line 41
    .line 42
    if-ne v2, v7, :cond_1

    .line 43
    .line 44
    aget-byte v2, v0, v3

    .line 45
    .line 46
    const/16 v7, -0x41

    .line 47
    .line 48
    if-ne v2, v7, :cond_1

    .line 49
    .line 50
    move v2, v5

    .line 51
    goto :goto_0

    .line 52
    :cond_1
    move v2, v6

    .line 53
    :goto_0
    move v7, v5

    .line 54
    move v8, v7

    .line 55
    move v3, v6

    .line 56
    move v9, v3

    .line 57
    move v10, v9

    .line 58
    move v11, v10

    .line 59
    move v12, v11

    .line 60
    move v13, v12

    .line 61
    move v14, v13

    .line 62
    move v15, v14

    .line 63
    move/from16 v16, v15

    .line 64
    .line 65
    move/from16 v17, v16

    .line 66
    .line 67
    move/from16 v18, v17

    .line 68
    .line 69
    :goto_1
    if-ge v9, v1, :cond_14

    .line 70
    .line 71
    if-nez v5, :cond_2

    .line 72
    .line 73
    if-nez v7, :cond_2

    .line 74
    .line 75
    if-eqz v8, :cond_14

    .line 76
    .line 77
    :cond_2
    aget-byte v4, v0, v9

    .line 78
    .line 79
    and-int/lit16 v4, v4, 0xff

    .line 80
    .line 81
    if-eqz v8, :cond_7

    .line 82
    .line 83
    if-lez v10, :cond_3

    .line 84
    .line 85
    and-int/lit16 v0, v4, 0x80

    .line 86
    .line 87
    if-eqz v0, :cond_6

    .line 88
    .line 89
    add-int/lit8 v10, v10, -0x1

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_3
    and-int/lit16 v0, v4, 0x80

    .line 93
    .line 94
    if-eqz v0, :cond_7

    .line 95
    .line 96
    and-int/lit8 v0, v4, 0x40

    .line 97
    .line 98
    if-eqz v0, :cond_6

    .line 99
    .line 100
    add-int/lit8 v10, v10, 0x1

    .line 101
    .line 102
    and-int/lit8 v0, v4, 0x20

    .line 103
    .line 104
    if-nez v0, :cond_4

    .line 105
    .line 106
    add-int/lit8 v12, v12, 0x1

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_4
    add-int/lit8 v10, v10, 0x1

    .line 110
    .line 111
    and-int/lit8 v0, v4, 0x10

    .line 112
    .line 113
    if-nez v0, :cond_5

    .line 114
    .line 115
    add-int/lit8 v13, v13, 0x1

    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_5
    add-int/lit8 v10, v10, 0x1

    .line 119
    .line 120
    and-int/lit8 v0, v4, 0x8

    .line 121
    .line 122
    if-nez v0, :cond_6

    .line 123
    .line 124
    add-int/lit8 v14, v14, 0x1

    .line 125
    .line 126
    goto :goto_2

    .line 127
    :cond_6
    const/4 v8, 0x0

    .line 128
    :cond_7
    :goto_2
    const/16 v0, 0x7f

    .line 129
    .line 130
    if-eqz v5, :cond_a

    .line 131
    .line 132
    if-le v4, v0, :cond_8

    .line 133
    .line 134
    const/16 v0, 0xa0

    .line 135
    .line 136
    if-ge v4, v0, :cond_8

    .line 137
    .line 138
    const/4 v5, 0x0

    .line 139
    goto :goto_3

    .line 140
    :cond_8
    const/16 v0, 0x9f

    .line 141
    .line 142
    if-le v4, v0, :cond_a

    .line 143
    .line 144
    const/16 v0, 0xc0

    .line 145
    .line 146
    if-lt v4, v0, :cond_9

    .line 147
    .line 148
    const/16 v0, 0xd7

    .line 149
    .line 150
    if-eq v4, v0, :cond_9

    .line 151
    .line 152
    const/16 v0, 0xf7

    .line 153
    .line 154
    if-ne v4, v0, :cond_a

    .line 155
    .line 156
    :cond_9
    add-int/lit8 v16, v16, 0x1

    .line 157
    .line 158
    :cond_a
    :goto_3
    if-eqz v7, :cond_13

    .line 159
    .line 160
    if-lez v11, :cond_c

    .line 161
    .line 162
    const/16 v0, 0x40

    .line 163
    .line 164
    if-lt v4, v0, :cond_12

    .line 165
    .line 166
    const/16 v0, 0x7f

    .line 167
    .line 168
    if-eq v4, v0, :cond_12

    .line 169
    .line 170
    const/16 v0, 0xfc

    .line 171
    .line 172
    if-le v4, v0, :cond_b

    .line 173
    .line 174
    goto :goto_6

    .line 175
    :cond_b
    add-int/lit8 v11, v11, -0x1

    .line 176
    .line 177
    goto :goto_7

    .line 178
    :cond_c
    const/16 v0, 0x80

    .line 179
    .line 180
    if-eq v4, v0, :cond_12

    .line 181
    .line 182
    const/16 v0, 0xa0

    .line 183
    .line 184
    if-eq v4, v0, :cond_12

    .line 185
    .line 186
    const/16 v0, 0xef

    .line 187
    .line 188
    if-le v4, v0, :cond_d

    .line 189
    .line 190
    goto :goto_6

    .line 191
    :cond_d
    const/16 v0, 0xa0

    .line 192
    .line 193
    if-le v4, v0, :cond_f

    .line 194
    .line 195
    const/16 v0, 0xe0

    .line 196
    .line 197
    if-ge v4, v0, :cond_f

    .line 198
    .line 199
    add-int/lit8 v3, v3, 0x1

    .line 200
    .line 201
    add-int/lit8 v0, v18, 0x1

    .line 202
    .line 203
    if-le v0, v15, :cond_e

    .line 204
    .line 205
    move v15, v0

    .line 206
    move/from16 v18, v15

    .line 207
    .line 208
    goto :goto_4

    .line 209
    :cond_e
    move/from16 v18, v0

    .line 210
    .line 211
    :goto_4
    const/16 v17, 0x0

    .line 212
    .line 213
    goto :goto_7

    .line 214
    :cond_f
    const/16 v0, 0x7f

    .line 215
    .line 216
    if-le v4, v0, :cond_11

    .line 217
    .line 218
    add-int/lit8 v11, v11, 0x1

    .line 219
    .line 220
    add-int/lit8 v0, v17, 0x1

    .line 221
    .line 222
    if-le v0, v6, :cond_10

    .line 223
    .line 224
    move v6, v0

    .line 225
    move/from16 v17, v6

    .line 226
    .line 227
    goto :goto_5

    .line 228
    :cond_10
    move/from16 v17, v0

    .line 229
    .line 230
    goto :goto_5

    .line 231
    :cond_11
    const/16 v17, 0x0

    .line 232
    .line 233
    :goto_5
    const/16 v18, 0x0

    .line 234
    .line 235
    goto :goto_7

    .line 236
    :cond_12
    :goto_6
    const/4 v7, 0x0

    .line 237
    :cond_13
    :goto_7
    add-int/lit8 v9, v9, 0x1

    .line 238
    .line 239
    move-object/from16 v0, p0

    .line 240
    .line 241
    const/4 v4, 0x3

    .line 242
    goto/16 :goto_1

    .line 243
    .line 244
    :cond_14
    if-eqz v8, :cond_15

    .line 245
    .line 246
    if-lez v10, :cond_15

    .line 247
    .line 248
    const/4 v8, 0x0

    .line 249
    :cond_15
    if-eqz v7, :cond_16

    .line 250
    .line 251
    if-lez v11, :cond_16

    .line 252
    .line 253
    const/4 v7, 0x0

    .line 254
    :cond_16
    const-string v0, "UTF8"

    .line 255
    .line 256
    if-eqz v8, :cond_18

    .line 257
    .line 258
    if-nez v2, :cond_17

    .line 259
    .line 260
    add-int/2addr v12, v13

    .line 261
    add-int/2addr v12, v14

    .line 262
    if-lez v12, :cond_18

    .line 263
    .line 264
    :cond_17
    return-object v0

    .line 265
    :cond_18
    const-string v2, "SJIS"

    .line 266
    .line 267
    if-eqz v7, :cond_1a

    .line 268
    .line 269
    sget-boolean v4, Lgd/l;->b:Z

    .line 270
    .line 271
    if-nez v4, :cond_19

    .line 272
    .line 273
    const/4 v4, 0x3

    .line 274
    if-ge v15, v4, :cond_19

    .line 275
    .line 276
    if-lt v6, v4, :cond_1a

    .line 277
    .line 278
    :cond_19
    return-object v2

    .line 279
    :cond_1a
    const-string v4, "ISO8859_1"

    .line 280
    .line 281
    if-eqz v5, :cond_1e

    .line 282
    .line 283
    if-eqz v7, :cond_1e

    .line 284
    .line 285
    const/4 v6, 0x2

    .line 286
    if-ne v15, v6, :cond_1b

    .line 287
    .line 288
    if-eq v3, v6, :cond_1c

    .line 289
    .line 290
    :cond_1b
    mul-int/lit8 v0, v16, 0xa

    .line 291
    .line 292
    if-lt v0, v1, :cond_1d

    .line 293
    .line 294
    :cond_1c
    return-object v2

    .line 295
    :cond_1d
    return-object v4

    .line 296
    :cond_1e
    if-eqz v5, :cond_1f

    .line 297
    .line 298
    return-object v4

    .line 299
    :cond_1f
    if-eqz v7, :cond_20

    .line 300
    .line 301
    return-object v2

    .line 302
    :cond_20
    if-eqz v8, :cond_21

    .line 303
    .line 304
    return-object v0

    .line 305
    :cond_21
    sget-object v0, Lgd/l;->a:Ljava/lang/String;

    .line 306
    .line 307
    return-object v0
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
.end method
