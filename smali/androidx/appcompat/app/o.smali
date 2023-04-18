.class Landroidx/appcompat/app/o;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static d:Landroidx/appcompat/app/o;


# instance fields
.field public a:J

.field public b:J

.field public c:I


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static b()Landroidx/appcompat/app/o;
    .locals 1

    .line 1
    sget-object v0, Landroidx/appcompat/app/o;->d:Landroidx/appcompat/app/o;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroidx/appcompat/app/o;

    .line 6
    .line 7
    invoke-direct {v0}, Landroidx/appcompat/app/o;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Landroidx/appcompat/app/o;->d:Landroidx/appcompat/app/o;

    .line 11
    .line 12
    :cond_0
    sget-object v0, Landroidx/appcompat/app/o;->d:Landroidx/appcompat/app/o;

    .line 13
    .line 14
    return-object v0
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
.end method


# virtual methods
.method public a(JDD)V
    .locals 15

    .line 1
    move-object v0, p0

    .line 2
    const-wide v1, 0xdc6d62da00L

    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    sub-long v3, p1, v1

    .line 8
    .line 9
    long-to-float v3, v3

    .line 10
    const v4, 0x4ca4cb80    # 8.64E7f

    .line 11
    .line 12
    .line 13
    div-float/2addr v3, v4

    .line 14
    const v4, 0x3c8ceb25

    .line 15
    .line 16
    .line 17
    mul-float/2addr v4, v3

    .line 18
    const v5, 0x40c7ae92

    .line 19
    .line 20
    .line 21
    add-float/2addr v4, v5

    .line 22
    float-to-double v5, v4

    .line 23
    const-wide v7, 0x3fa11c5fc0000000L    # 0.03341960161924362

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    invoke-static {v5, v6}, Ljava/lang/Math;->sin(D)D

    .line 29
    .line 30
    .line 31
    move-result-wide v9

    .line 32
    mul-double/2addr v9, v7

    .line 33
    add-double/2addr v9, v5

    .line 34
    const/high16 v7, 0x40000000    # 2.0f

    .line 35
    .line 36
    mul-float/2addr v7, v4

    .line 37
    float-to-double v7, v7

    .line 38
    invoke-static {v7, v8}, Ljava/lang/Math;->sin(D)D

    .line 39
    .line 40
    .line 41
    move-result-wide v7

    .line 42
    const-wide v11, 0x3f36e05b00000000L    # 3.4906598739326E-4

    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    mul-double/2addr v7, v11

    .line 48
    add-double/2addr v9, v7

    .line 49
    const/high16 v7, 0x40400000    # 3.0f

    .line 50
    .line 51
    mul-float/2addr v4, v7

    .line 52
    float-to-double v7, v4

    .line 53
    invoke-static {v7, v8}, Ljava/lang/Math;->sin(D)D

    .line 54
    .line 55
    .line 56
    move-result-wide v7

    .line 57
    const-wide v11, 0x3ed5f61cc0000000L    # 5.236000106378924E-6

    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    mul-double/2addr v7, v11

    .line 63
    add-double/2addr v9, v7

    .line 64
    const-wide v7, 0x3ffcbed85e1ce332L    # 1.796593063

    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    add-double/2addr v9, v7

    .line 70
    const-wide v7, 0x400921fb54442d18L    # Math.PI

    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    add-double/2addr v9, v7

    .line 76
    move-wide/from16 v7, p5

    .line 77
    .line 78
    neg-double v7, v7

    .line 79
    const-wide v11, 0x4076800000000000L    # 360.0

    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    div-double/2addr v7, v11

    .line 85
    const v4, 0x3a6bedfa    # 9.0E-4f

    .line 86
    .line 87
    .line 88
    sub-float/2addr v3, v4

    .line 89
    float-to-double v11, v3

    .line 90
    sub-double/2addr v11, v7

    .line 91
    invoke-static {v11, v12}, Ljava/lang/Math;->round(D)J

    .line 92
    .line 93
    .line 94
    move-result-wide v11

    .line 95
    long-to-float v3, v11

    .line 96
    add-float/2addr v3, v4

    .line 97
    float-to-double v3, v3

    .line 98
    add-double/2addr v3, v7

    .line 99
    const-wide v7, 0x3f75b573eab367a1L    # 0.0053

    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    invoke-static {v5, v6}, Ljava/lang/Math;->sin(D)D

    .line 105
    .line 106
    .line 107
    move-result-wide v5

    .line 108
    mul-double/2addr v5, v7

    .line 109
    add-double/2addr v3, v5

    .line 110
    const-wide/high16 v5, 0x4000000000000000L    # 2.0

    .line 111
    .line 112
    mul-double/2addr v5, v9

    .line 113
    invoke-static {v5, v6}, Ljava/lang/Math;->sin(D)D

    .line 114
    .line 115
    .line 116
    move-result-wide v5

    .line 117
    const-wide v7, -0x4083bcd35a858794L    # -0.0069

    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    mul-double/2addr v5, v7

    .line 123
    add-double/2addr v3, v5

    .line 124
    invoke-static {v9, v10}, Ljava/lang/Math;->sin(D)D

    .line 125
    .line 126
    .line 127
    move-result-wide v5

    .line 128
    const-wide v7, 0x3fda31a380000000L    # 0.4092797040939331

    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    invoke-static {v7, v8}, Ljava/lang/Math;->sin(D)D

    .line 134
    .line 135
    .line 136
    move-result-wide v7

    .line 137
    mul-double/2addr v5, v7

    .line 138
    invoke-static {v5, v6}, Ljava/lang/Math;->asin(D)D

    .line 139
    .line 140
    .line 141
    move-result-wide v5

    .line 142
    const-wide v7, 0x3f91df46a0000000L    # 0.01745329238474369

    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    mul-double v7, v7, p3

    .line 148
    .line 149
    const-wide v9, -0x4045311600000000L    # -0.10471975803375244

    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    invoke-static {v9, v10}, Ljava/lang/Math;->sin(D)D

    .line 155
    .line 156
    .line 157
    move-result-wide v9

    .line 158
    invoke-static {v7, v8}, Ljava/lang/Math;->sin(D)D

    .line 159
    .line 160
    .line 161
    move-result-wide v11

    .line 162
    invoke-static {v5, v6}, Ljava/lang/Math;->sin(D)D

    .line 163
    .line 164
    .line 165
    move-result-wide v13

    .line 166
    mul-double/2addr v11, v13

    .line 167
    sub-double/2addr v9, v11

    .line 168
    invoke-static {v7, v8}, Ljava/lang/Math;->cos(D)D

    .line 169
    .line 170
    .line 171
    move-result-wide v7

    .line 172
    invoke-static {v5, v6}, Ljava/lang/Math;->cos(D)D

    .line 173
    .line 174
    .line 175
    move-result-wide v5

    .line 176
    mul-double/2addr v7, v5

    .line 177
    div-double/2addr v9, v7

    .line 178
    const-wide/high16 v5, 0x3ff0000000000000L    # 1.0

    .line 179
    .line 180
    cmpl-double v5, v9, v5

    .line 181
    .line 182
    const/4 v6, 0x1

    .line 183
    const-wide/16 v7, -0x1

    .line 184
    .line 185
    if-ltz v5, :cond_0

    .line 186
    .line 187
    iput v6, v0, Landroidx/appcompat/app/o;->c:I

    .line 188
    .line 189
    iput-wide v7, v0, Landroidx/appcompat/app/o;->a:J

    .line 190
    .line 191
    iput-wide v7, v0, Landroidx/appcompat/app/o;->b:J

    .line 192
    .line 193
    return-void

    .line 194
    :cond_0
    const-wide/high16 v11, -0x4010000000000000L    # -1.0

    .line 195
    .line 196
    cmpg-double v5, v9, v11

    .line 197
    .line 198
    const/4 v11, 0x0

    .line 199
    if-gtz v5, :cond_1

    .line 200
    .line 201
    iput v11, v0, Landroidx/appcompat/app/o;->c:I

    .line 202
    .line 203
    iput-wide v7, v0, Landroidx/appcompat/app/o;->a:J

    .line 204
    .line 205
    iput-wide v7, v0, Landroidx/appcompat/app/o;->b:J

    .line 206
    .line 207
    return-void

    .line 208
    :cond_1
    invoke-static {v9, v10}, Ljava/lang/Math;->acos(D)D

    .line 209
    .line 210
    .line 211
    move-result-wide v7

    .line 212
    const-wide v9, 0x401921fb54442d18L    # 6.283185307179586

    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    div-double/2addr v7, v9

    .line 218
    double-to-float v5, v7

    .line 219
    float-to-double v7, v5

    .line 220
    add-double v9, v3, v7

    .line 221
    .line 222
    const-wide v12, 0x4194997000000000L    # 8.64E7

    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    mul-double/2addr v9, v12

    .line 228
    invoke-static {v9, v10}, Ljava/lang/Math;->round(D)J

    .line 229
    .line 230
    .line 231
    move-result-wide v9

    .line 232
    add-long/2addr v9, v1

    .line 233
    iput-wide v9, v0, Landroidx/appcompat/app/o;->a:J

    .line 234
    .line 235
    sub-double/2addr v3, v7

    .line 236
    mul-double/2addr v3, v12

    .line 237
    invoke-static {v3, v4}, Ljava/lang/Math;->round(D)J

    .line 238
    .line 239
    .line 240
    move-result-wide v3

    .line 241
    add-long/2addr v3, v1

    .line 242
    iput-wide v3, v0, Landroidx/appcompat/app/o;->b:J

    .line 243
    .line 244
    cmp-long v1, v3, p1

    .line 245
    .line 246
    if-gez v1, :cond_2

    .line 247
    .line 248
    iget-wide v1, v0, Landroidx/appcompat/app/o;->a:J

    .line 249
    .line 250
    cmp-long v1, v1, p1

    .line 251
    .line 252
    if-lez v1, :cond_2

    .line 253
    .line 254
    iput v11, v0, Landroidx/appcompat/app/o;->c:I

    .line 255
    .line 256
    goto :goto_0

    .line 257
    :cond_2
    iput v6, v0, Landroidx/appcompat/app/o;->c:I

    .line 258
    .line 259
    :goto_0
    return-void
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
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
.end method
