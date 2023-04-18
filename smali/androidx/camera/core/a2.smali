.class public final Landroidx/camera/core/a2;
.super Landroidx/camera/core/w2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/core/a2$b;,
        Landroidx/camera/core/a2$c;,
        Landroidx/camera/core/a2$d;
    }
.end annotation


# static fields
.field public static final r:Landroidx/camera/core/a2$c;

.field private static final s:Ljava/util/concurrent/Executor;


# instance fields
.field private l:Landroidx/camera/core/a2$d;

.field private m:Ljava/util/concurrent/Executor;

.field private n:Lw/w0;

.field o:Landroidx/camera/core/v2;

.field private p:Z

.field private q:Landroid/util/Size;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Landroidx/camera/core/a2$c;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/camera/core/a2$c;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Landroidx/camera/core/a2;->r:Landroidx/camera/core/a2$c;

    .line 7
    .line 8
    invoke-static {}, Lx/a;->d()Ljava/util/concurrent/ScheduledExecutorService;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sput-object v0, Landroidx/camera/core/a2;->s:Ljava/util/concurrent/Executor;

    .line 13
    .line 14
    return-void
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

.method constructor <init>(Lw/e2;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/camera/core/w2;-><init>(Lw/x2;)V

    .line 2
    .line 3
    .line 4
    sget-object p1, Landroidx/camera/core/a2;->s:Ljava/util/concurrent/Executor;

    .line 5
    .line 6
    iput-object p1, p0, Landroidx/camera/core/a2;->m:Ljava/util/concurrent/Executor;

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    iput-boolean p1, p0, Landroidx/camera/core/a2;->p:Z

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

.method public static synthetic K(Landroidx/camera/core/a2;Ljava/lang/String;Lw/e2;Landroid/util/Size;Lw/k2;Lw/k2$e;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Landroidx/camera/core/a2;->P(Ljava/lang/String;Lw/e2;Landroid/util/Size;Lw/k2;Lw/k2$e;)V

    return-void
.end method

.method public static synthetic L(Landroidx/camera/core/a2$d;Landroidx/camera/core/v2;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/camera/core/a2;->Q(Landroidx/camera/core/a2$d;Landroidx/camera/core/v2;)V

    return-void
.end method

.method private N(Landroid/util/Size;)Landroid/graphics/Rect;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/camera/core/w2;->n()Landroid/graphics/Rect;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/camera/core/w2;->n()Landroid/graphics/Rect;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1

    .line 12
    :cond_0
    if-eqz p1, :cond_1

    .line 13
    .line 14
    new-instance v0, Landroid/graphics/Rect;

    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    const/4 v2, 0x0

    .line 25
    invoke-direct {v0, v2, v2, v1, p1}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 26
    .line 27
    .line 28
    return-object v0

    .line 29
    :cond_1
    const/4 p1, 0x0

    .line 30
    return-object p1
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

.method private synthetic P(Ljava/lang/String;Lw/e2;Landroid/util/Size;Lw/k2;Lw/k2$e;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/camera/core/w2;->o(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result p4

    .line 5
    if-eqz p4, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1, p2, p3}, Landroidx/camera/core/a2;->M(Ljava/lang/String;Lw/e2;Landroid/util/Size;)Lw/k2$b;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Lw/k2$b;->m()Lw/k2;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p0, p1}, Landroidx/camera/core/w2;->I(Lw/k2;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Landroidx/camera/core/w2;->s()V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
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
.end method

.method private static synthetic Q(Landroidx/camera/core/a2$d;Landroidx/camera/core/v2;)V
    .locals 0

    invoke-interface {p0, p1}, Landroidx/camera/core/a2$d;->a(Landroidx/camera/core/v2;)V

    return-void
.end method

.method private R()Z
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/camera/core/a2;->o:Landroidx/camera/core/v2;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/camera/core/a2;->l:Landroidx/camera/core/a2$d;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v2, p0, Landroidx/camera/core/a2;->m:Ljava/util/concurrent/Executor;

    .line 10
    .line 11
    new-instance v3, Landroidx/camera/core/z1;

    .line 12
    .line 13
    invoke-direct {v3, v1, v0}, Landroidx/camera/core/z1;-><init>(Landroidx/camera/core/a2$d;Landroidx/camera/core/v2;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 17
    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    return v0

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    return v0
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

.method private S()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/camera/core/w2;->c()Lw/g0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Landroidx/camera/core/a2;->l:Landroidx/camera/core/a2$d;

    .line 6
    .line 7
    iget-object v2, p0, Landroidx/camera/core/a2;->q:Landroid/util/Size;

    .line 8
    .line 9
    invoke-direct {p0, v2}, Landroidx/camera/core/a2;->N(Landroid/util/Size;)Landroid/graphics/Rect;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    iget-object v3, p0, Landroidx/camera/core/a2;->o:Landroidx/camera/core/v2;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Landroidx/camera/core/w2;->j(Lw/g0;)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    invoke-virtual {p0}, Landroidx/camera/core/a2;->O()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    invoke-static {v2, v0, v1}, Landroidx/camera/core/v2$g;->d(Landroid/graphics/Rect;II)Landroidx/camera/core/v2$g;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v3, v0}, Landroidx/camera/core/v2;->x(Landroidx/camera/core/v2$g;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    return-void
    .line 37
    .line 38
    .line 39
    .line 40
.end method

.method private W(Ljava/lang/String;Lw/e2;Landroid/util/Size;)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Landroidx/camera/core/a2;->M(Ljava/lang/String;Lw/e2;Landroid/util/Size;)Lw/k2$b;

    move-result-object p1

    invoke-virtual {p1}, Lw/k2$b;->m()Lw/k2;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/camera/core/w2;->I(Lw/k2;)V

    return-void
.end method


# virtual methods
.method protected A(Lw/e0;Lw/x2$a;)Lw/x2;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw/e0;",
            "Lw/x2$a<",
            "***>;)",
            "Lw/x2<",
            "*>;"
        }
    .end annotation

    .line 1
    invoke-interface {p2}, Landroidx/camera/core/f0;->b()Lw/w1;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    sget-object v0, Lw/e2;->y:Lw/r0$a;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-interface {p1, v0, v1}, Lw/r0;->a(Lw/r0$a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    invoke-interface {p2}, Landroidx/camera/core/f0;->b()Lw/w1;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    sget-object v0, Lw/i1;->e:Lw/r0$a;

    .line 19
    .line 20
    const/16 v1, 0x23

    .line 21
    .line 22
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-interface {p1, v0, v1}, Lw/w1;->g(Lw/r0$a;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-interface {p2}, Landroidx/camera/core/f0;->b()Lw/w1;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    sget-object v0, Lw/i1;->e:Lw/r0$a;

    .line 35
    .line 36
    const/16 v1, 0x22

    .line 37
    .line 38
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-interface {p1, v0, v1}, Lw/w1;->g(Lw/r0$a;Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    :goto_0
    invoke-interface {p2}, Lw/x2$a;->c()Lw/x2;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    return-object p1
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
.end method

.method protected D(Landroid/util/Size;)Landroid/util/Size;
    .locals 3

    .line 1
    iput-object p1, p0, Landroidx/camera/core/a2;->q:Landroid/util/Size;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/camera/core/w2;->e()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p0}, Landroidx/camera/core/w2;->f()Lw/x2;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, Lw/e2;

    .line 12
    .line 13
    iget-object v2, p0, Landroidx/camera/core/a2;->q:Landroid/util/Size;

    .line 14
    .line 15
    invoke-direct {p0, v0, v1, v2}, Landroidx/camera/core/a2;->W(Ljava/lang/String;Lw/e2;Landroid/util/Size;)V

    .line 16
    .line 17
    .line 18
    return-object p1
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

.method public H(Landroid/graphics/Rect;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/camera/core/w2;->H(Landroid/graphics/Rect;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Landroidx/camera/core/a2;->S()V

    .line 5
    .line 6
    .line 7
    return-void
    .line 8
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
.end method

.method M(Ljava/lang/String;Lw/e2;Landroid/util/Size;)Lw/k2$b;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    invoke-static {}, Landroidx/camera/core/impl/utils/r;->a()V

    .line 8
    .line 9
    .line 10
    invoke-static/range {p2 .. p2}, Lw/k2$b;->o(Lw/x2;)Lw/k2$b;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    const/4 v4, 0x0

    .line 15
    invoke-virtual {v1, v4}, Lw/e2;->F(Lw/o0;)Lw/o0;

    .line 16
    .line 17
    .line 18
    move-result-object v11

    .line 19
    iget-object v5, v0, Landroidx/camera/core/a2;->n:Lw/w0;

    .line 20
    .line 21
    if-eqz v5, :cond_0

    .line 22
    .line 23
    invoke-virtual {v5}, Lw/w0;->c()V

    .line 24
    .line 25
    .line 26
    :cond_0
    new-instance v5, Landroidx/camera/core/v2;

    .line 27
    .line 28
    invoke-virtual/range {p0 .. p0}, Landroidx/camera/core/w2;->c()Lw/g0;

    .line 29
    .line 30
    .line 31
    move-result-object v6

    .line 32
    const/4 v7, 0x1

    .line 33
    if-eqz v11, :cond_1

    .line 34
    .line 35
    move v8, v7

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const/4 v8, 0x0

    .line 38
    :goto_0
    invoke-direct {v5, v2, v6, v8}, Landroidx/camera/core/v2;-><init>(Landroid/util/Size;Lw/g0;Z)V

    .line 39
    .line 40
    .line 41
    iput-object v5, v0, Landroidx/camera/core/a2;->o:Landroidx/camera/core/v2;

    .line 42
    .line 43
    invoke-direct/range {p0 .. p0}, Landroidx/camera/core/a2;->R()Z

    .line 44
    .line 45
    .line 46
    move-result v6

    .line 47
    if-eqz v6, :cond_2

    .line 48
    .line 49
    invoke-direct/range {p0 .. p0}, Landroidx/camera/core/a2;->S()V

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_2
    iput-boolean v7, v0, Landroidx/camera/core/a2;->p:Z

    .line 54
    .line 55
    :goto_1
    if-eqz v11, :cond_3

    .line 56
    .line 57
    new-instance v4, Lw/p0$a;

    .line 58
    .line 59
    invoke-direct {v4}, Lw/p0$a;-><init>()V

    .line 60
    .line 61
    .line 62
    new-instance v14, Landroid/os/HandlerThread;

    .line 63
    .line 64
    const-string v6, "CameraX-preview_processing"

    .line 65
    .line 66
    invoke-direct {v14, v6}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v14}, Ljava/lang/Thread;->start()V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    .line 73
    .line 74
    .line 75
    move-result v6

    .line 76
    invoke-static {v6}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v15

    .line 80
    new-instance v13, Landroidx/camera/core/g2;

    .line 81
    .line 82
    invoke-virtual/range {p3 .. p3}, Landroid/util/Size;->getWidth()I

    .line 83
    .line 84
    .line 85
    move-result v6

    .line 86
    invoke-virtual/range {p3 .. p3}, Landroid/util/Size;->getHeight()I

    .line 87
    .line 88
    .line 89
    move-result v7

    .line 90
    invoke-virtual/range {p2 .. p2}, Lw/e2;->l()I

    .line 91
    .line 92
    .line 93
    move-result v8

    .line 94
    new-instance v9, Landroid/os/Handler;

    .line 95
    .line 96
    invoke-virtual {v14}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 97
    .line 98
    .line 99
    move-result-object v10

    .line 100
    invoke-direct {v9, v10}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v5}, Landroidx/camera/core/v2;->k()Lw/w0;

    .line 104
    .line 105
    .line 106
    move-result-object v12

    .line 107
    move-object v5, v13

    .line 108
    move-object v10, v4

    .line 109
    move-object/from16 v16, v13

    .line 110
    .line 111
    move-object v13, v15

    .line 112
    invoke-direct/range {v5 .. v13}, Landroidx/camera/core/g2;-><init>(IIILandroid/os/Handler;Lw/p0;Lw/o0;Lw/w0;Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual/range {v16 .. v16}, Landroidx/camera/core/g2;->r()Lw/k;

    .line 116
    .line 117
    .line 118
    move-result-object v5

    .line 119
    invoke-virtual {v3, v5}, Lw/k2$b;->d(Lw/k;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual/range {v16 .. v16}, Lw/w0;->i()Lfc/b;

    .line 123
    .line 124
    .line 125
    move-result-object v5

    .line 126
    new-instance v6, Landroidx/camera/core/x1;

    .line 127
    .line 128
    invoke-direct {v6, v14}, Landroidx/camera/core/x1;-><init>(Landroid/os/HandlerThread;)V

    .line 129
    .line 130
    .line 131
    invoke-static {}, Lx/a;->a()Ljava/util/concurrent/Executor;

    .line 132
    .line 133
    .line 134
    move-result-object v7

    .line 135
    invoke-interface {v5, v6, v7}, Lfc/b;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 136
    .line 137
    .line 138
    move-object/from16 v5, v16

    .line 139
    .line 140
    iput-object v5, v0, Landroidx/camera/core/a2;->n:Lw/w0;

    .line 141
    .line 142
    invoke-interface {v4}, Lw/p0;->getId()I

    .line 143
    .line 144
    .line 145
    move-result v4

    .line 146
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 147
    .line 148
    .line 149
    move-result-object v4

    .line 150
    invoke-virtual {v3, v15, v4}, Lw/k2$b;->l(Ljava/lang/String;Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    goto :goto_2

    .line 154
    :cond_3
    invoke-virtual {v1, v4}, Lw/e2;->G(Lw/g1;)Lw/g1;

    .line 155
    .line 156
    .line 157
    move-result-object v4

    .line 158
    if-eqz v4, :cond_4

    .line 159
    .line 160
    new-instance v6, Landroidx/camera/core/a2$a;

    .line 161
    .line 162
    invoke-direct {v6, v0, v4}, Landroidx/camera/core/a2$a;-><init>(Landroidx/camera/core/a2;Lw/g1;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v3, v6}, Lw/k2$b;->d(Lw/k;)V

    .line 166
    .line 167
    .line 168
    :cond_4
    invoke-virtual {v5}, Landroidx/camera/core/v2;->k()Lw/w0;

    .line 169
    .line 170
    .line 171
    move-result-object v4

    .line 172
    iput-object v4, v0, Landroidx/camera/core/a2;->n:Lw/w0;

    .line 173
    .line 174
    :goto_2
    iget-object v4, v0, Landroidx/camera/core/a2;->n:Lw/w0;

    .line 175
    .line 176
    invoke-virtual {v3, v4}, Lw/k2$b;->k(Lw/w0;)V

    .line 177
    .line 178
    .line 179
    new-instance v4, Landroidx/camera/core/y1;

    .line 180
    .line 181
    move-object/from16 v5, p1

    .line 182
    .line 183
    invoke-direct {v4, v0, v5, v1, v2}, Landroidx/camera/core/y1;-><init>(Landroidx/camera/core/a2;Ljava/lang/String;Lw/e2;Landroid/util/Size;)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v3, v4}, Lw/k2$b;->f(Lw/k2$c;)V

    .line 187
    .line 188
    .line 189
    return-object v3
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
.end method

.method public O()I
    .locals 1

    invoke-virtual {p0}, Landroidx/camera/core/w2;->l()I

    move-result v0

    return v0
.end method

.method public T(Landroidx/camera/core/a2$d;)V
    .locals 1

    sget-object v0, Landroidx/camera/core/a2;->s:Ljava/util/concurrent/Executor;

    invoke-virtual {p0, v0, p1}, Landroidx/camera/core/a2;->U(Ljava/util/concurrent/Executor;Landroidx/camera/core/a2$d;)V

    return-void
.end method

.method public U(Ljava/util/concurrent/Executor;Landroidx/camera/core/a2$d;)V
    .locals 1

    .line 1
    invoke-static {}, Landroidx/camera/core/impl/utils/r;->a()V

    .line 2
    .line 3
    .line 4
    if-nez p2, :cond_0

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-object p1, p0, Landroidx/camera/core/a2;->l:Landroidx/camera/core/a2$d;

    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/camera/core/w2;->r()V

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iput-object p2, p0, Landroidx/camera/core/a2;->l:Landroidx/camera/core/a2$d;

    .line 14
    .line 15
    iput-object p1, p0, Landroidx/camera/core/a2;->m:Ljava/util/concurrent/Executor;

    .line 16
    .line 17
    invoke-virtual {p0}, Landroidx/camera/core/w2;->q()V

    .line 18
    .line 19
    .line 20
    iget-boolean p1, p0, Landroidx/camera/core/a2;->p:Z

    .line 21
    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    invoke-direct {p0}, Landroidx/camera/core/a2;->R()Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-eqz p1, :cond_2

    .line 29
    .line 30
    invoke-direct {p0}, Landroidx/camera/core/a2;->S()V

    .line 31
    .line 32
    .line 33
    const/4 p1, 0x0

    .line 34
    iput-boolean p1, p0, Landroidx/camera/core/a2;->p:Z

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    invoke-virtual {p0}, Landroidx/camera/core/w2;->b()Landroid/util/Size;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    if-eqz p1, :cond_2

    .line 42
    .line 43
    invoke-virtual {p0}, Landroidx/camera/core/w2;->e()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {p0}, Landroidx/camera/core/w2;->f()Lw/x2;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    check-cast p2, Lw/e2;

    .line 52
    .line 53
    invoke-virtual {p0}, Landroidx/camera/core/w2;->b()Landroid/util/Size;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-direct {p0, p1, p2, v0}, Landroidx/camera/core/a2;->W(Ljava/lang/String;Lw/e2;Landroid/util/Size;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, Landroidx/camera/core/w2;->s()V

    .line 61
    .line 62
    .line 63
    :cond_2
    :goto_0
    return-void
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
.end method

.method public V(I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/camera/core/w2;->G(I)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-direct {p0}, Landroidx/camera/core/a2;->S()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
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
.end method

.method public g(ZLw/y2;)Lw/x2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lw/y2;",
            ")",
            "Lw/x2<",
            "*>;"
        }
    .end annotation

    .line 1
    sget-object v0, Lw/y2$b;->l:Lw/y2$b;

    .line 2
    .line 3
    invoke-interface {p2, v0}, Lw/y2;->a(Lw/y2$b;)Lw/r0;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    sget-object p1, Landroidx/camera/core/a2;->r:Landroidx/camera/core/a2$c;

    .line 10
    .line 11
    invoke-virtual {p1}, Landroidx/camera/core/a2$c;->a()Lw/e2;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {p2, p1}, Lw/q0;->b(Lw/r0;Lw/r0;)Lw/r0;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    :cond_0
    if-nez p2, :cond_1

    .line 20
    .line 21
    const/4 p1, 0x0

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    invoke-virtual {p0, p2}, Landroidx/camera/core/a2;->m(Lw/r0;)Lw/x2$a;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-interface {p1}, Lw/x2$a;->c()Lw/x2;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    :goto_0
    return-object p1
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
.end method

.method public m(Lw/r0;)Lw/x2$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw/r0;",
            ")",
            "Lw/x2$a<",
            "***>;"
        }
    .end annotation

    invoke-static {p1}, Landroidx/camera/core/a2$b;->f(Lw/r0;)Landroidx/camera/core/a2$b;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Preview:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroidx/camera/core/w2;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public z()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/camera/core/a2;->n:Lw/w0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lw/w0;->c()V

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Landroidx/camera/core/a2;->o:Landroidx/camera/core/v2;

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
