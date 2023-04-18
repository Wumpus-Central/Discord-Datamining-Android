.class public abstract Lod/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcd/l;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private c(Lcd/c;Ljava/util/Map;)Lcom/google/zxing/Result;
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcd/c;",
            "Ljava/util/Map<",
            "Lcd/e;",
            "*>;)",
            "Lcom/google/zxing/Result;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    invoke-virtual/range {p1 .. p1}, Lcd/c;->d()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual/range {p1 .. p1}, Lcd/c;->c()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    new-instance v3, Lgd/a;

    .line 12
    .line 13
    invoke-direct {v3, v1}, Lgd/a;-><init>(I)V

    .line 14
    .line 15
    .line 16
    const/4 v4, 0x0

    .line 17
    const/4 v5, 0x1

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    sget-object v6, Lcd/e;->o:Lcd/e;

    .line 21
    .line 22
    invoke-interface {v0, v6}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v6

    .line 26
    if-eqz v6, :cond_0

    .line 27
    .line 28
    move v6, v5

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move v6, v4

    .line 31
    :goto_0
    if-eqz v6, :cond_1

    .line 32
    .line 33
    const/16 v7, 0x8

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    const/4 v7, 0x5

    .line 37
    :goto_1
    shr-int v7, v2, v7

    .line 38
    .line 39
    invoke-static {v5, v7}, Ljava/lang/Math;->max(II)I

    .line 40
    .line 41
    .line 42
    move-result v7

    .line 43
    if-eqz v6, :cond_2

    .line 44
    .line 45
    move v6, v2

    .line 46
    goto :goto_2

    .line 47
    :cond_2
    const/16 v6, 0xf

    .line 48
    .line 49
    :goto_2
    div-int/lit8 v8, v2, 0x2

    .line 50
    .line 51
    move v9, v4

    .line 52
    :goto_3
    if-ge v9, v6, :cond_8

    .line 53
    .line 54
    add-int/lit8 v10, v9, 0x1

    .line 55
    .line 56
    div-int/lit8 v11, v10, 0x2

    .line 57
    .line 58
    and-int/lit8 v9, v9, 0x1

    .line 59
    .line 60
    if-nez v9, :cond_3

    .line 61
    .line 62
    move v9, v5

    .line 63
    goto :goto_4

    .line 64
    :cond_3
    move v9, v4

    .line 65
    :goto_4
    if-eqz v9, :cond_4

    .line 66
    .line 67
    goto :goto_5

    .line 68
    :cond_4
    neg-int v11, v11

    .line 69
    :goto_5
    mul-int/2addr v11, v7

    .line 70
    add-int/2addr v11, v8

    .line 71
    if-ltz v11, :cond_8

    .line 72
    .line 73
    if-ge v11, v2, :cond_8

    .line 74
    .line 75
    move-object/from16 v9, p1

    .line 76
    .line 77
    :try_start_0
    invoke-virtual {v9, v11, v3}, Lcd/c;->b(ILgd/a;)Lgd/a;

    .line 78
    .line 79
    .line 80
    move-result-object v3
    :try_end_0
    .catch Lcd/j; {:try_start_0 .. :try_end_0} :catch_5

    .line 81
    move v12, v4

    .line 82
    :goto_6
    const/4 v13, 0x2

    .line 83
    if-ge v12, v13, :cond_7

    .line 84
    .line 85
    if-ne v12, v5, :cond_5

    .line 86
    .line 87
    invoke-virtual {v3}, Lgd/a;->n()V

    .line 88
    .line 89
    .line 90
    if-eqz v0, :cond_5

    .line 91
    .line 92
    sget-object v13, Lcd/e;->u:Lcd/e;

    .line 93
    .line 94
    invoke-interface {v0, v13}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v14

    .line 98
    if-eqz v14, :cond_5

    .line 99
    .line 100
    new-instance v14, Ljava/util/EnumMap;

    .line 101
    .line 102
    const-class v15, Lcd/e;

    .line 103
    .line 104
    invoke-direct {v14, v15}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    .line 105
    .line 106
    .line 107
    invoke-interface {v14, v0}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 108
    .line 109
    .line 110
    invoke-interface {v14, v13}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-object/from16 v13, p0

    .line 114
    .line 115
    move-object v0, v14

    .line 116
    goto :goto_7

    .line 117
    :cond_5
    move-object/from16 v13, p0

    .line 118
    .line 119
    :goto_7
    :try_start_1
    invoke-virtual {v13, v11, v3, v0}, Lod/k;->b(ILgd/a;Ljava/util/Map;)Lcom/google/zxing/Result;

    .line 120
    .line 121
    .line 122
    move-result-object v14

    .line 123
    if-ne v12, v5, :cond_6

    .line 124
    .line 125
    sget-object v15, Lcd/n;->l:Lcd/n;
    :try_end_1
    .catch Lcd/m; {:try_start_1 .. :try_end_1} :catch_3

    .line 126
    .line 127
    const/16 v16, 0xb4

    .line 128
    .line 129
    :try_start_2
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 130
    .line 131
    .line 132
    move-result-object v5

    .line 133
    invoke-virtual {v14, v15, v5}, Lcom/google/zxing/Result;->h(Lcd/n;Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v14}, Lcom/google/zxing/Result;->e()[Lcd/o;

    .line 137
    .line 138
    .line 139
    move-result-object v5

    .line 140
    if-eqz v5, :cond_6

    .line 141
    .line 142
    new-instance v15, Lcd/o;
    :try_end_2
    .catch Lcd/m; {:try_start_2 .. :try_end_2} :catch_0

    .line 143
    .line 144
    move-object/from16 v16, v0

    .line 145
    .line 146
    int-to-float v0, v1

    .line 147
    :try_start_3
    aget-object v18, v5, v4

    .line 148
    .line 149
    invoke-virtual/range {v18 .. v18}, Lcd/o;->c()F

    .line 150
    .line 151
    .line 152
    move-result v18
    :try_end_3
    .catch Lcd/m; {:try_start_3 .. :try_end_3} :catch_1

    .line 153
    sub-float v18, v0, v18

    .line 154
    .line 155
    const/high16 v19, 0x3f800000    # 1.0f

    .line 156
    .line 157
    move/from16 v20, v1

    .line 158
    .line 159
    sub-float v1, v18, v19

    .line 160
    .line 161
    :try_start_4
    aget-object v18, v5, v4

    .line 162
    .line 163
    invoke-virtual/range {v18 .. v18}, Lcd/o;->d()F

    .line 164
    .line 165
    .line 166
    move-result v4

    .line 167
    invoke-direct {v15, v1, v4}, Lcd/o;-><init>(FF)V

    .line 168
    .line 169
    .line 170
    const/4 v1, 0x0

    .line 171
    aput-object v15, v5, v1

    .line 172
    .line 173
    new-instance v4, Lcd/o;
    :try_end_4
    .catch Lcd/m; {:try_start_4 .. :try_end_4} :catch_2

    .line 174
    .line 175
    const/4 v15, 0x1

    .line 176
    :try_start_5
    aget-object v17, v5, v15

    .line 177
    .line 178
    invoke-virtual/range {v17 .. v17}, Lcd/o;->c()F

    .line 179
    .line 180
    .line 181
    move-result v17

    .line 182
    sub-float v0, v0, v17

    .line 183
    .line 184
    sub-float v0, v0, v19

    .line 185
    .line 186
    aget-object v17, v5, v15

    .line 187
    .line 188
    invoke-virtual/range {v17 .. v17}, Lcd/o;->d()F

    .line 189
    .line 190
    .line 191
    move-result v1

    .line 192
    invoke-direct {v4, v0, v1}, Lcd/o;-><init>(FF)V

    .line 193
    .line 194
    .line 195
    aput-object v4, v5, v15
    :try_end_5
    .catch Lcd/m; {:try_start_5 .. :try_end_5} :catch_4

    .line 196
    .line 197
    goto :goto_8

    .line 198
    :catch_0
    move-object/from16 v16, v0

    .line 199
    .line 200
    :catch_1
    move/from16 v20, v1

    .line 201
    .line 202
    :catch_2
    const/4 v15, 0x1

    .line 203
    goto :goto_9

    .line 204
    :cond_6
    :goto_8
    return-object v14

    .line 205
    :catch_3
    move-object/from16 v16, v0

    .line 206
    .line 207
    move/from16 v20, v1

    .line 208
    .line 209
    move v15, v5

    .line 210
    :catch_4
    :goto_9
    add-int/lit8 v12, v12, 0x1

    .line 211
    .line 212
    move v5, v15

    .line 213
    move-object/from16 v0, v16

    .line 214
    .line 215
    move/from16 v1, v20

    .line 216
    .line 217
    const/4 v4, 0x0

    .line 218
    goto/16 :goto_6

    .line 219
    .line 220
    :catch_5
    :cond_7
    move-object/from16 v13, p0

    .line 221
    .line 222
    move/from16 v20, v1

    .line 223
    .line 224
    move v15, v5

    .line 225
    move v9, v10

    .line 226
    move v5, v15

    .line 227
    move/from16 v1, v20

    .line 228
    .line 229
    const/4 v4, 0x0

    .line 230
    goto/16 :goto_3

    .line 231
    .line 232
    :cond_8
    move-object/from16 v13, p0

    .line 233
    .line 234
    invoke-static {}, Lcd/j;->a()Lcd/j;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    throw v0
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
.end method

.method protected static d([I[IF)F
    .locals 9

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, 0x0

    .line 3
    move v2, v1

    .line 4
    move v3, v2

    .line 5
    move v4, v3

    .line 6
    :goto_0
    if-ge v2, v0, :cond_0

    .line 7
    .line 8
    aget v5, p0, v2

    .line 9
    .line 10
    add-int/2addr v3, v5

    .line 11
    aget v5, p1, v2

    .line 12
    .line 13
    add-int/2addr v4, v5

    .line 14
    add-int/lit8 v2, v2, 0x1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/high16 v2, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 18
    .line 19
    if-ge v3, v4, :cond_1

    .line 20
    .line 21
    return v2

    .line 22
    :cond_1
    int-to-float v3, v3

    .line 23
    int-to-float v4, v4

    .line 24
    div-float v4, v3, v4

    .line 25
    .line 26
    mul-float/2addr p2, v4

    .line 27
    const/4 v5, 0x0

    .line 28
    :goto_1
    if-ge v1, v0, :cond_4

    .line 29
    .line 30
    aget v6, p0, v1

    .line 31
    .line 32
    aget v7, p1, v1

    .line 33
    .line 34
    int-to-float v7, v7

    .line 35
    mul-float/2addr v7, v4

    .line 36
    int-to-float v6, v6

    .line 37
    cmpl-float v8, v6, v7

    .line 38
    .line 39
    if-lez v8, :cond_2

    .line 40
    .line 41
    sub-float/2addr v6, v7

    .line 42
    goto :goto_2

    .line 43
    :cond_2
    sub-float v6, v7, v6

    .line 44
    .line 45
    :goto_2
    cmpl-float v7, v6, p2

    .line 46
    .line 47
    if-lez v7, :cond_3

    .line 48
    .line 49
    return v2

    .line 50
    :cond_3
    add-float/2addr v5, v6

    .line 51
    add-int/lit8 v1, v1, 0x1

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_4
    div-float/2addr v5, v3

    .line 55
    return v5
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

.method protected static e(Lgd/a;I[I)V
    .locals 6

    .line 1
    array-length v0, p2

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-static {p2, v1, v0, v1}, Ljava/util/Arrays;->fill([IIII)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lgd/a;->j()I

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    if-ge p1, v2, :cond_4

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Lgd/a;->d(I)Z

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    const/4 v4, 0x1

    .line 17
    xor-int/2addr v3, v4

    .line 18
    :goto_0
    if-ge p1, v2, :cond_1

    .line 19
    .line 20
    invoke-virtual {p0, p1}, Lgd/a;->d(I)Z

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    if-eq v5, v3, :cond_0

    .line 25
    .line 26
    aget v5, p2, v1

    .line 27
    .line 28
    add-int/2addr v5, v4

    .line 29
    aput v5, p2, v1

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 33
    .line 34
    if-eq v1, v0, :cond_1

    .line 35
    .line 36
    aput v4, p2, v1

    .line 37
    .line 38
    xor-int/lit8 v3, v3, 0x1

    .line 39
    .line 40
    :goto_1
    add-int/lit8 p1, p1, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    if-eq v1, v0, :cond_3

    .line 44
    .line 45
    sub-int/2addr v0, v4

    .line 46
    if-ne v1, v0, :cond_2

    .line 47
    .line 48
    if-ne p1, v2, :cond_2

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_2
    invoke-static {}, Lcd/j;->a()Lcd/j;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    throw p0

    .line 56
    :cond_3
    :goto_2
    return-void

    .line 57
    :cond_4
    invoke-static {}, Lcd/j;->a()Lcd/j;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    throw p0
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

.method protected static f(Lgd/a;I[I)V
    .locals 3

    .line 1
    array-length v0, p2

    .line 2
    invoke-virtual {p0, p1}, Lgd/a;->d(I)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    :cond_0
    :goto_0
    if-lez p1, :cond_1

    .line 7
    .line 8
    if-ltz v0, :cond_1

    .line 9
    .line 10
    add-int/lit8 p1, p1, -0x1

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Lgd/a;->d(I)Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eq v2, v1, :cond_0

    .line 17
    .line 18
    add-int/lit8 v0, v0, -0x1

    .line 19
    .line 20
    xor-int/lit8 v1, v1, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    if-gez v0, :cond_2

    .line 24
    .line 25
    add-int/lit8 p1, p1, 0x1

    .line 26
    .line 27
    invoke-static {p0, p1, p2}, Lod/k;->e(Lgd/a;I[I)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_2
    invoke-static {}, Lcd/j;->a()Lcd/j;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    throw p0
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


# virtual methods
.method public a(Lcd/c;Ljava/util/Map;)Lcom/google/zxing/Result;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcd/c;",
            "Ljava/util/Map<",
            "Lcd/e;",
            "*>;)",
            "Lcom/google/zxing/Result;"
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-direct {p0, p1, p2}, Lod/k;->c(Lcd/c;Ljava/util/Map;)Lcom/google/zxing/Result;

    .line 2
    .line 3
    .line 4
    move-result-object p1
    :try_end_0
    .catch Lcd/j; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    return-object p1

    .line 6
    :catch_0
    move-exception v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz p2, :cond_0

    .line 9
    .line 10
    sget-object v2, Lcd/e;->o:Lcd/e;

    .line 11
    .line 12
    invoke-interface {p2, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move v2, v1

    .line 21
    :goto_0
    if-eqz v2, :cond_3

    .line 22
    .line 23
    invoke-virtual {p1}, Lcd/c;->e()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_3

    .line 28
    .line 29
    invoke-virtual {p1}, Lcd/c;->f()Lcd/c;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-direct {p0, p1, p2}, Lod/k;->c(Lcd/c;Ljava/util/Map;)Lcom/google/zxing/Result;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    invoke-virtual {p2}, Lcom/google/zxing/Result;->d()Ljava/util/Map;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    const/16 v2, 0x10e

    .line 42
    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    sget-object v3, Lcd/n;->l:Lcd/n;

    .line 46
    .line 47
    invoke-interface {v0, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    if-eqz v4, :cond_1

    .line 52
    .line 53
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    check-cast v0, Ljava/lang/Integer;

    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    add-int/2addr v0, v2

    .line 64
    rem-int/lit16 v2, v0, 0x168

    .line 65
    .line 66
    :cond_1
    sget-object v0, Lcd/n;->l:Lcd/n;

    .line 67
    .line 68
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    invoke-virtual {p2, v0, v2}, Lcom/google/zxing/Result;->h(Lcd/n;Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p2}, Lcom/google/zxing/Result;->e()[Lcd/o;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    if-eqz v0, :cond_2

    .line 80
    .line 81
    invoke-virtual {p1}, Lcd/c;->c()I

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    :goto_1
    array-length v2, v0

    .line 86
    if-ge v1, v2, :cond_2

    .line 87
    .line 88
    new-instance v2, Lcd/o;

    .line 89
    .line 90
    int-to-float v3, p1

    .line 91
    aget-object v4, v0, v1

    .line 92
    .line 93
    invoke-virtual {v4}, Lcd/o;->d()F

    .line 94
    .line 95
    .line 96
    move-result v4

    .line 97
    sub-float/2addr v3, v4

    .line 98
    const/high16 v4, 0x3f800000    # 1.0f

    .line 99
    .line 100
    sub-float/2addr v3, v4

    .line 101
    aget-object v4, v0, v1

    .line 102
    .line 103
    invoke-virtual {v4}, Lcd/o;->c()F

    .line 104
    .line 105
    .line 106
    move-result v4

    .line 107
    invoke-direct {v2, v3, v4}, Lcd/o;-><init>(FF)V

    .line 108
    .line 109
    .line 110
    aput-object v2, v0, v1

    .line 111
    .line 112
    add-int/lit8 v1, v1, 0x1

    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_2
    return-object p2

    .line 116
    :cond_3
    throw v0
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

.method public abstract b(ILgd/a;Ljava/util/Map;)Lcom/google/zxing/Result;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lgd/a;",
            "Ljava/util/Map<",
            "Lcd/e;",
            "*>;)",
            "Lcom/google/zxing/Result;"
        }
    .end annotation
.end method

.method public reset()V
    .locals 0

    return-void
.end method
