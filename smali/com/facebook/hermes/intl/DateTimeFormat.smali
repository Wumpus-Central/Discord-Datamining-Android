.class public Lcom/facebook/hermes/intl/DateTimeFormat;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Ld6/a;
.end annotation


# instance fields
.field a:Lcom/facebook/hermes/intl/b;

.field private b:Lg5/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lg5/b<",
            "*>;"
        }
    .end annotation
.end field

.field private c:Lg5/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lg5/b<",
            "*>;"
        }
    .end annotation
.end field

.field private d:Z

.field private e:Ljava/lang/String;

.field private f:Z

.field private g:Ljava/lang/String;

.field private h:Lcom/facebook/hermes/intl/b$f;

.field private i:Lcom/facebook/hermes/intl/b$d;

.field private j:Lcom/facebook/hermes/intl/b$k;

.field private k:Lcom/facebook/hermes/intl/b$c;

.field private l:Lcom/facebook/hermes/intl/b$l;

.field private m:Lcom/facebook/hermes/intl/b$h;

.field private n:Lcom/facebook/hermes/intl/b$b;

.field private o:Lcom/facebook/hermes/intl/b$e;

.field private p:Lcom/facebook/hermes/intl/b$g;

.field private q:Lcom/facebook/hermes/intl/b$i;

.field private r:Lcom/facebook/hermes/intl/b$j;

.field private s:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/util/Map;)V
    .locals 18
    .annotation build Ld6/a;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    iput-object v1, v0, Lcom/facebook/hermes/intl/DateTimeFormat;->b:Lg5/b;

    .line 8
    .line 9
    iput-object v1, v0, Lcom/facebook/hermes/intl/DateTimeFormat;->c:Lg5/b;

    .line 10
    .line 11
    iput-object v1, v0, Lcom/facebook/hermes/intl/DateTimeFormat;->s:Ljava/lang/Object;

    .line 12
    .line 13
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 14
    .line 15
    const/16 v2, 0x18

    .line 16
    .line 17
    if-lt v1, v2, :cond_0

    .line 18
    .line 19
    new-instance v1, Lcom/facebook/hermes/intl/o;

    .line 20
    .line 21
    invoke-direct {v1}, Lcom/facebook/hermes/intl/o;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object v1, v0, Lcom/facebook/hermes/intl/DateTimeFormat;->a:Lcom/facebook/hermes/intl/b;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    new-instance v1, Lcom/facebook/hermes/intl/n;

    .line 28
    .line 29
    invoke-direct {v1}, Lcom/facebook/hermes/intl/n;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object v1, v0, Lcom/facebook/hermes/intl/DateTimeFormat;->a:Lcom/facebook/hermes/intl/b;

    .line 33
    .line 34
    :goto_0
    invoke-direct/range {p0 .. p2}, Lcom/facebook/hermes/intl/DateTimeFormat;->c(Ljava/util/List;Ljava/util/Map;)V

    .line 35
    .line 36
    .line 37
    iget-object v2, v0, Lcom/facebook/hermes/intl/DateTimeFormat;->a:Lcom/facebook/hermes/intl/b;

    .line 38
    .line 39
    iget-object v3, v0, Lcom/facebook/hermes/intl/DateTimeFormat;->b:Lg5/b;

    .line 40
    .line 41
    iget-boolean v1, v0, Lcom/facebook/hermes/intl/DateTimeFormat;->d:Z

    .line 42
    .line 43
    const-string v4, ""

    .line 44
    .line 45
    if-eqz v1, :cond_1

    .line 46
    .line 47
    move-object v1, v4

    .line 48
    goto :goto_1

    .line 49
    :cond_1
    iget-object v1, v0, Lcom/facebook/hermes/intl/DateTimeFormat;->e:Ljava/lang/String;

    .line 50
    .line 51
    :goto_1
    iget-boolean v5, v0, Lcom/facebook/hermes/intl/DateTimeFormat;->f:Z

    .line 52
    .line 53
    if-eqz v5, :cond_2

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_2
    iget-object v4, v0, Lcom/facebook/hermes/intl/DateTimeFormat;->g:Ljava/lang/String;

    .line 57
    .line 58
    :goto_2
    move-object v5, v4

    .line 59
    iget-object v6, v0, Lcom/facebook/hermes/intl/DateTimeFormat;->i:Lcom/facebook/hermes/intl/b$d;

    .line 60
    .line 61
    iget-object v7, v0, Lcom/facebook/hermes/intl/DateTimeFormat;->j:Lcom/facebook/hermes/intl/b$k;

    .line 62
    .line 63
    iget-object v8, v0, Lcom/facebook/hermes/intl/DateTimeFormat;->k:Lcom/facebook/hermes/intl/b$c;

    .line 64
    .line 65
    iget-object v9, v0, Lcom/facebook/hermes/intl/DateTimeFormat;->l:Lcom/facebook/hermes/intl/b$l;

    .line 66
    .line 67
    iget-object v10, v0, Lcom/facebook/hermes/intl/DateTimeFormat;->m:Lcom/facebook/hermes/intl/b$h;

    .line 68
    .line 69
    iget-object v11, v0, Lcom/facebook/hermes/intl/DateTimeFormat;->n:Lcom/facebook/hermes/intl/b$b;

    .line 70
    .line 71
    iget-object v12, v0, Lcom/facebook/hermes/intl/DateTimeFormat;->o:Lcom/facebook/hermes/intl/b$e;

    .line 72
    .line 73
    iget-object v13, v0, Lcom/facebook/hermes/intl/DateTimeFormat;->p:Lcom/facebook/hermes/intl/b$g;

    .line 74
    .line 75
    iget-object v14, v0, Lcom/facebook/hermes/intl/DateTimeFormat;->q:Lcom/facebook/hermes/intl/b$i;

    .line 76
    .line 77
    iget-object v15, v0, Lcom/facebook/hermes/intl/DateTimeFormat;->r:Lcom/facebook/hermes/intl/b$j;

    .line 78
    .line 79
    iget-object v4, v0, Lcom/facebook/hermes/intl/DateTimeFormat;->h:Lcom/facebook/hermes/intl/b$f;

    .line 80
    .line 81
    move-object/from16 v16, v15

    .line 82
    .line 83
    iget-object v15, v0, Lcom/facebook/hermes/intl/DateTimeFormat;->s:Ljava/lang/Object;

    .line 84
    .line 85
    move-object/from16 v17, v4

    .line 86
    .line 87
    move-object v4, v1

    .line 88
    move-object v1, v15

    .line 89
    move-object/from16 v15, v16

    .line 90
    .line 91
    move-object/from16 v16, v17

    .line 92
    .line 93
    move-object/from16 v17, v1

    .line 94
    .line 95
    invoke-interface/range {v2 .. v17}, Lcom/facebook/hermes/intl/b;->h(Lg5/b;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/hermes/intl/b$d;Lcom/facebook/hermes/intl/b$k;Lcom/facebook/hermes/intl/b$c;Lcom/facebook/hermes/intl/b$l;Lcom/facebook/hermes/intl/b$h;Lcom/facebook/hermes/intl/b$b;Lcom/facebook/hermes/intl/b$e;Lcom/facebook/hermes/intl/b$g;Lcom/facebook/hermes/intl/b$i;Lcom/facebook/hermes/intl/b$j;Lcom/facebook/hermes/intl/b$f;Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    return-void
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
.end method

.method private a()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/facebook/hermes/intl/DateTimeFormat;->a:Lcom/facebook/hermes/intl/b;

    iget-object v1, p0, Lcom/facebook/hermes/intl/DateTimeFormat;->b:Lg5/b;

    invoke-interface {v0, v1}, Lcom/facebook/hermes/intl/b;->d(Lg5/b;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    invoke-static/range {p1 .. p1}, Lg5/i;->l(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    if-eqz v3, :cond_a

    .line 12
    .line 13
    const-string v3, "date"

    .line 14
    .line 15
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    const-string v5, "any"

    .line 20
    .line 21
    const-string v6, "day"

    .line 22
    .line 23
    const-string v7, "month"

    .line 24
    .line 25
    const-string v8, "year"

    .line 26
    .line 27
    const/4 v9, 0x1

    .line 28
    const/4 v10, 0x0

    .line 29
    if-nez v4, :cond_0

    .line 30
    .line 31
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-eqz v4, :cond_2

    .line 36
    .line 37
    :cond_0
    const-string v4, "weekday"

    .line 38
    .line 39
    filled-new-array {v4, v8, v7, v6}, [Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    move v11, v10

    .line 44
    :goto_0
    const/4 v12, 0x4

    .line 45
    if-ge v11, v12, :cond_2

    .line 46
    .line 47
    aget-object v12, v4, v11

    .line 48
    .line 49
    invoke-static {v0, v12}, Lg5/i;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v12

    .line 53
    invoke-static {v12}, Lg5/i;->n(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v12

    .line 57
    if-nez v12, :cond_1

    .line 58
    .line 59
    move v9, v10

    .line 60
    :cond_1
    add-int/lit8 v11, v11, 0x1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_2
    const-string v4, "time"

    .line 64
    .line 65
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v11

    .line 69
    const-string v12, "second"

    .line 70
    .line 71
    const-string v13, "minute"

    .line 72
    .line 73
    const-string v14, "hour"

    .line 74
    .line 75
    const/4 v15, 0x3

    .line 76
    if-nez v11, :cond_3

    .line 77
    .line 78
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    if-eqz v1, :cond_5

    .line 83
    .line 84
    :cond_3
    filled-new-array {v14, v13, v12}, [Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    move v5, v10

    .line 89
    :goto_1
    if-ge v5, v15, :cond_5

    .line 90
    .line 91
    aget-object v11, v1, v5

    .line 92
    .line 93
    invoke-static {v0, v11}, Lg5/i;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v11

    .line 97
    invoke-static {v11}, Lg5/i;->n(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v11

    .line 101
    if-nez v11, :cond_4

    .line 102
    .line 103
    move v9, v10

    .line 104
    :cond_4
    add-int/lit8 v5, v5, 0x1

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_5
    const-string v1, "numeric"

    .line 108
    .line 109
    const-string v5, "all"

    .line 110
    .line 111
    if-eqz v9, :cond_7

    .line 112
    .line 113
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v3

    .line 117
    if-nez v3, :cond_6

    .line 118
    .line 119
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v3

    .line 123
    if-eqz v3, :cond_7

    .line 124
    .line 125
    :cond_6
    filled-new-array {v8, v7, v6}, [Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    move v6, v10

    .line 130
    :goto_2
    if-ge v6, v15, :cond_7

    .line 131
    .line 132
    aget-object v7, v3, v6

    .line 133
    .line 134
    invoke-static {v0, v7, v1}, Lg5/i;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    add-int/lit8 v6, v6, 0x1

    .line 138
    .line 139
    goto :goto_2

    .line 140
    :cond_7
    if-eqz v9, :cond_9

    .line 141
    .line 142
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v3

    .line 146
    if-nez v3, :cond_8

    .line 147
    .line 148
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v2

    .line 152
    if-eqz v2, :cond_9

    .line 153
    .line 154
    :cond_8
    filled-new-array {v14, v13, v12}, [Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    :goto_3
    if-ge v10, v15, :cond_9

    .line 159
    .line 160
    aget-object v3, v2, v10

    .line 161
    .line 162
    invoke-static {v0, v3, v1}, Lg5/i;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    add-int/lit8 v10, v10, 0x1

    .line 166
    .line 167
    goto :goto_3

    .line 168
    :cond_9
    return-object v0

    .line 169
    :cond_a
    new-instance v0, Lg5/j;

    .line 170
    .line 171
    const-string v1, "Invalid options object !"

    .line 172
    .line 173
    invoke-direct {v0, v1}, Lg5/j;-><init>(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    throw v0
.end method

.method private c(Ljava/util/List;Ljava/util/Map;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "ca"

    .line 2
    .line 3
    const-string v1, "nu"

    .line 4
    .line 5
    const-string v2, "hc"

    .line 6
    .line 7
    filled-new-array {v0, v1, v2}, [Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    const-string v4, "any"

    .line 16
    .line 17
    const-string v5, "date"

    .line 18
    .line 19
    invoke-direct {p0, p2, v4, v5}, Lcom/facebook/hermes/intl/DateTimeFormat;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    invoke-static {}, Lg5/i;->q()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    sget-object v5, Lcom/facebook/hermes/intl/j$a;->l:Lcom/facebook/hermes/intl/j$a;

    .line 28
    .line 29
    sget-object v6, Lg5/a;->a:[Ljava/lang/String;

    .line 30
    .line 31
    const-string v7, "localeMatcher"

    .line 32
    .line 33
    const-string v8, "best fit"

    .line 34
    .line 35
    invoke-static {p2, v7, v5, v6, v8}, Lcom/facebook/hermes/intl/j;->c(Ljava/lang/Object;Ljava/lang/String;Lcom/facebook/hermes/intl/j$a;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    invoke-static {v4, v7, v6}, Lg5/i;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    invoke-static {}, Lg5/i;->d()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v6

    .line 46
    invoke-static {}, Lg5/i;->d()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v7

    .line 50
    const-string v9, "calendar"

    .line 51
    .line 52
    invoke-static {p2, v9, v5, v6, v7}, Lcom/facebook/hermes/intl/j;->c(Ljava/lang/Object;Ljava/lang/String;Lcom/facebook/hermes/intl/j$a;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v6

    .line 56
    invoke-static {v6}, Lg5/i;->n(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v7

    .line 60
    if-nez v7, :cond_1

    .line 61
    .line 62
    invoke-static {v6}, Lg5/i;->h(Ljava/lang/Object;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v7

    .line 66
    invoke-direct {p0, v7}, Lcom/facebook/hermes/intl/DateTimeFormat;->d(Ljava/lang/String;)Z

    .line 67
    .line 68
    .line 69
    move-result v7

    .line 70
    if-eqz v7, :cond_0

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_0
    new-instance p1, Lg5/j;

    .line 74
    .line 75
    const-string p2, "Invalid calendar option !"

    .line 76
    .line 77
    invoke-direct {p1, p2}, Lg5/j;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    throw p1

    .line 81
    :cond_1
    :goto_0
    invoke-static {v4, v0, v6}, Lg5/i;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    invoke-static {}, Lg5/i;->d()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v6

    .line 88
    invoke-static {}, Lg5/i;->d()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v7

    .line 92
    const-string v9, "numberingSystem"

    .line 93
    .line 94
    invoke-static {p2, v9, v5, v6, v7}, Lcom/facebook/hermes/intl/j;->c(Ljava/lang/Object;Ljava/lang/String;Lcom/facebook/hermes/intl/j$a;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v6

    .line 98
    invoke-static {v6}, Lg5/i;->n(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v7

    .line 102
    if-nez v7, :cond_3

    .line 103
    .line 104
    invoke-static {v6}, Lg5/i;->h(Ljava/lang/Object;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v7

    .line 108
    invoke-direct {p0, v7}, Lcom/facebook/hermes/intl/DateTimeFormat;->d(Ljava/lang/String;)Z

    .line 109
    .line 110
    .line 111
    move-result v7

    .line 112
    if-eqz v7, :cond_2

    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_2
    new-instance p1, Lg5/j;

    .line 116
    .line 117
    const-string p2, "Invalid numbering system !"

    .line 118
    .line 119
    invoke-direct {p1, p2}, Lg5/j;-><init>(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    throw p1

    .line 123
    :cond_3
    :goto_1
    invoke-static {v4, v1, v6}, Lg5/i;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    sget-object v6, Lcom/facebook/hermes/intl/j$a;->k:Lcom/facebook/hermes/intl/j$a;

    .line 127
    .line 128
    invoke-static {}, Lg5/i;->d()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v7

    .line 132
    invoke-static {}, Lg5/i;->d()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v9

    .line 136
    const-string v10, "hour12"

    .line 137
    .line 138
    invoke-static {p2, v10, v6, v7, v9}, Lcom/facebook/hermes/intl/j;->c(Ljava/lang/Object;Ljava/lang/String;Lcom/facebook/hermes/intl/j$a;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v6

    .line 142
    const-string v7, "h23"

    .line 143
    .line 144
    const-string v9, "h24"

    .line 145
    .line 146
    const-string v10, "h11"

    .line 147
    .line 148
    const-string v11, "h12"

    .line 149
    .line 150
    filled-new-array {v10, v11, v7, v9}, [Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v7

    .line 154
    invoke-static {}, Lg5/i;->d()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v9

    .line 158
    const-string v10, "hourCycle"

    .line 159
    .line 160
    invoke-static {p2, v10, v5, v7, v9}, Lcom/facebook/hermes/intl/j;->c(Ljava/lang/Object;Ljava/lang/String;Lcom/facebook/hermes/intl/j$a;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v7

    .line 164
    invoke-static {v6}, Lg5/i;->n(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result v9

    .line 168
    if-nez v9, :cond_4

    .line 169
    .line 170
    invoke-static {}, Lg5/i;->b()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v7

    .line 174
    :cond_4
    invoke-static {v4, v2, v7}, Lg5/i;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    invoke-static {p1, v4, v3}, Lcom/facebook/hermes/intl/i;->a(Ljava/util/List;Ljava/lang/Object;Ljava/util/List;)Ljava/util/HashMap;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    invoke-static {p1}, Lg5/i;->g(Ljava/lang/Object;)Ljava/util/Map;

    .line 182
    .line 183
    .line 184
    move-result-object v3

    .line 185
    const-string v4, "locale"

    .line 186
    .line 187
    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v3

    .line 191
    check-cast v3, Lg5/b;

    .line 192
    .line 193
    iput-object v3, p0, Lcom/facebook/hermes/intl/DateTimeFormat;->b:Lg5/b;

    .line 194
    .line 195
    invoke-interface {v3}, Lg5/b;->d()Lg5/b;

    .line 196
    .line 197
    .line 198
    move-result-object v3

    .line 199
    iput-object v3, p0, Lcom/facebook/hermes/intl/DateTimeFormat;->c:Lg5/b;

    .line 200
    .line 201
    invoke-static {p1, v0}, Lg5/i;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    invoke-static {v0}, Lg5/i;->j(Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    move-result v3

    .line 209
    const/4 v4, 0x0

    .line 210
    const/4 v7, 0x1

    .line 211
    if-nez v3, :cond_5

    .line 212
    .line 213
    iput-boolean v4, p0, Lcom/facebook/hermes/intl/DateTimeFormat;->d:Z

    .line 214
    .line 215
    invoke-static {v0}, Lg5/i;->h(Ljava/lang/Object;)Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    iput-object v0, p0, Lcom/facebook/hermes/intl/DateTimeFormat;->e:Ljava/lang/String;

    .line 220
    .line 221
    goto :goto_2

    .line 222
    :cond_5
    iput-boolean v7, p0, Lcom/facebook/hermes/intl/DateTimeFormat;->d:Z

    .line 223
    .line 224
    iget-object v0, p0, Lcom/facebook/hermes/intl/DateTimeFormat;->a:Lcom/facebook/hermes/intl/b;

    .line 225
    .line 226
    iget-object v3, p0, Lcom/facebook/hermes/intl/DateTimeFormat;->b:Lg5/b;

    .line 227
    .line 228
    invoke-interface {v0, v3}, Lcom/facebook/hermes/intl/b;->f(Lg5/b;)Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    iput-object v0, p0, Lcom/facebook/hermes/intl/DateTimeFormat;->e:Ljava/lang/String;

    .line 233
    .line 234
    :goto_2
    invoke-static {p1, v1}, Lg5/i;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    invoke-static {v0}, Lg5/i;->j(Ljava/lang/Object;)Z

    .line 239
    .line 240
    .line 241
    move-result v1

    .line 242
    if-nez v1, :cond_6

    .line 243
    .line 244
    iput-boolean v4, p0, Lcom/facebook/hermes/intl/DateTimeFormat;->f:Z

    .line 245
    .line 246
    invoke-static {v0}, Lg5/i;->h(Ljava/lang/Object;)Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    iput-object v0, p0, Lcom/facebook/hermes/intl/DateTimeFormat;->g:Ljava/lang/String;

    .line 251
    .line 252
    goto :goto_3

    .line 253
    :cond_6
    iput-boolean v7, p0, Lcom/facebook/hermes/intl/DateTimeFormat;->f:Z

    .line 254
    .line 255
    iget-object v0, p0, Lcom/facebook/hermes/intl/DateTimeFormat;->a:Lcom/facebook/hermes/intl/b;

    .line 256
    .line 257
    iget-object v1, p0, Lcom/facebook/hermes/intl/DateTimeFormat;->b:Lg5/b;

    .line 258
    .line 259
    invoke-interface {v0, v1}, Lcom/facebook/hermes/intl/b;->b(Lg5/b;)Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    iput-object v0, p0, Lcom/facebook/hermes/intl/DateTimeFormat;->g:Ljava/lang/String;

    .line 264
    .line 265
    :goto_3
    invoke-static {p1, v2}, Lg5/i;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object p1

    .line 269
    const-string v0, "timeZone"

    .line 270
    .line 271
    invoke-static {p2, v0}, Lg5/i;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    invoke-static {v0}, Lg5/i;->n(Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    move-result v1

    .line 279
    if-eqz v1, :cond_7

    .line 280
    .line 281
    invoke-direct {p0}, Lcom/facebook/hermes/intl/DateTimeFormat;->a()Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    goto :goto_4

    .line 286
    :cond_7
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    invoke-virtual {p0, v0}, Lcom/facebook/hermes/intl/DateTimeFormat;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    :goto_4
    iput-object v0, p0, Lcom/facebook/hermes/intl/DateTimeFormat;->s:Ljava/lang/Object;

    .line 295
    .line 296
    const-string v0, "basic"

    .line 297
    .line 298
    filled-new-array {v0, v8}, [Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object v0

    .line 302
    const-string v1, "formatMatcher"

    .line 303
    .line 304
    invoke-static {p2, v1, v5, v0, v8}, Lcom/facebook/hermes/intl/j;->c(Ljava/lang/Object;Ljava/lang/String;Lcom/facebook/hermes/intl/j$a;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    const-class v1, Lcom/facebook/hermes/intl/b$d;

    .line 309
    .line 310
    invoke-static {v0}, Lg5/i;->h(Ljava/lang/Object;)Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    invoke-static {v1, v0}, Lcom/facebook/hermes/intl/j;->d(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Enum;

    .line 315
    .line 316
    .line 317
    move-result-object v0

    .line 318
    check-cast v0, Lcom/facebook/hermes/intl/b$d;

    .line 319
    .line 320
    iput-object v0, p0, Lcom/facebook/hermes/intl/DateTimeFormat;->i:Lcom/facebook/hermes/intl/b$d;

    .line 321
    .line 322
    const-string v0, "long"

    .line 323
    .line 324
    const-string v1, "short"

    .line 325
    .line 326
    const-string v2, "narrow"

    .line 327
    .line 328
    filled-new-array {v0, v1, v2}, [Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    move-result-object v3

    .line 332
    invoke-static {}, Lg5/i;->d()Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    move-result-object v4

    .line 336
    const-string v7, "weekday"

    .line 337
    .line 338
    invoke-static {p2, v7, v5, v3, v4}, Lcom/facebook/hermes/intl/j;->c(Ljava/lang/Object;Ljava/lang/String;Lcom/facebook/hermes/intl/j$a;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    move-result-object v3

    .line 342
    const-class v4, Lcom/facebook/hermes/intl/b$k;

    .line 343
    .line 344
    invoke-static {v4, v3}, Lcom/facebook/hermes/intl/j;->d(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Enum;

    .line 345
    .line 346
    .line 347
    move-result-object v3

    .line 348
    check-cast v3, Lcom/facebook/hermes/intl/b$k;

    .line 349
    .line 350
    iput-object v3, p0, Lcom/facebook/hermes/intl/DateTimeFormat;->j:Lcom/facebook/hermes/intl/b$k;

    .line 351
    .line 352
    filled-new-array {v0, v1, v2}, [Ljava/lang/String;

    .line 353
    .line 354
    .line 355
    move-result-object v3

    .line 356
    invoke-static {}, Lg5/i;->d()Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    move-result-object v4

    .line 360
    const-string v7, "era"

    .line 361
    .line 362
    invoke-static {p2, v7, v5, v3, v4}, Lcom/facebook/hermes/intl/j;->c(Ljava/lang/Object;Ljava/lang/String;Lcom/facebook/hermes/intl/j$a;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    move-result-object v3

    .line 366
    const-class v4, Lcom/facebook/hermes/intl/b$c;

    .line 367
    .line 368
    invoke-static {v4, v3}, Lcom/facebook/hermes/intl/j;->d(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Enum;

    .line 369
    .line 370
    .line 371
    move-result-object v3

    .line 372
    check-cast v3, Lcom/facebook/hermes/intl/b$c;

    .line 373
    .line 374
    iput-object v3, p0, Lcom/facebook/hermes/intl/DateTimeFormat;->k:Lcom/facebook/hermes/intl/b$c;

    .line 375
    .line 376
    const-string v3, "numeric"

    .line 377
    .line 378
    const-string v4, "2-digit"

    .line 379
    .line 380
    filled-new-array {v3, v4}, [Ljava/lang/String;

    .line 381
    .line 382
    .line 383
    move-result-object v7

    .line 384
    invoke-static {}, Lg5/i;->d()Ljava/lang/Object;

    .line 385
    .line 386
    .line 387
    move-result-object v8

    .line 388
    const-string v9, "year"

    .line 389
    .line 390
    invoke-static {p2, v9, v5, v7, v8}, Lcom/facebook/hermes/intl/j;->c(Ljava/lang/Object;Ljava/lang/String;Lcom/facebook/hermes/intl/j$a;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 391
    .line 392
    .line 393
    move-result-object v7

    .line 394
    const-class v8, Lcom/facebook/hermes/intl/b$l;

    .line 395
    .line 396
    invoke-static {v8, v7}, Lcom/facebook/hermes/intl/j;->d(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Enum;

    .line 397
    .line 398
    .line 399
    move-result-object v7

    .line 400
    check-cast v7, Lcom/facebook/hermes/intl/b$l;

    .line 401
    .line 402
    iput-object v7, p0, Lcom/facebook/hermes/intl/DateTimeFormat;->l:Lcom/facebook/hermes/intl/b$l;

    .line 403
    .line 404
    filled-new-array {v3, v4, v0, v1, v2}, [Ljava/lang/String;

    .line 405
    .line 406
    .line 407
    move-result-object v2

    .line 408
    invoke-static {}, Lg5/i;->d()Ljava/lang/Object;

    .line 409
    .line 410
    .line 411
    move-result-object v7

    .line 412
    const-string v8, "month"

    .line 413
    .line 414
    invoke-static {p2, v8, v5, v2, v7}, Lcom/facebook/hermes/intl/j;->c(Ljava/lang/Object;Ljava/lang/String;Lcom/facebook/hermes/intl/j$a;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 415
    .line 416
    .line 417
    move-result-object v2

    .line 418
    const-class v7, Lcom/facebook/hermes/intl/b$h;

    .line 419
    .line 420
    invoke-static {v7, v2}, Lcom/facebook/hermes/intl/j;->d(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Enum;

    .line 421
    .line 422
    .line 423
    move-result-object v2

    .line 424
    check-cast v2, Lcom/facebook/hermes/intl/b$h;

    .line 425
    .line 426
    iput-object v2, p0, Lcom/facebook/hermes/intl/DateTimeFormat;->m:Lcom/facebook/hermes/intl/b$h;

    .line 427
    .line 428
    filled-new-array {v3, v4}, [Ljava/lang/String;

    .line 429
    .line 430
    .line 431
    move-result-object v2

    .line 432
    invoke-static {}, Lg5/i;->d()Ljava/lang/Object;

    .line 433
    .line 434
    .line 435
    move-result-object v7

    .line 436
    const-string v8, "day"

    .line 437
    .line 438
    invoke-static {p2, v8, v5, v2, v7}, Lcom/facebook/hermes/intl/j;->c(Ljava/lang/Object;Ljava/lang/String;Lcom/facebook/hermes/intl/j$a;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 439
    .line 440
    .line 441
    move-result-object v2

    .line 442
    const-class v7, Lcom/facebook/hermes/intl/b$b;

    .line 443
    .line 444
    invoke-static {v7, v2}, Lcom/facebook/hermes/intl/j;->d(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Enum;

    .line 445
    .line 446
    .line 447
    move-result-object v2

    .line 448
    check-cast v2, Lcom/facebook/hermes/intl/b$b;

    .line 449
    .line 450
    iput-object v2, p0, Lcom/facebook/hermes/intl/DateTimeFormat;->n:Lcom/facebook/hermes/intl/b$b;

    .line 451
    .line 452
    filled-new-array {v3, v4}, [Ljava/lang/String;

    .line 453
    .line 454
    .line 455
    move-result-object v2

    .line 456
    invoke-static {}, Lg5/i;->d()Ljava/lang/Object;

    .line 457
    .line 458
    .line 459
    move-result-object v7

    .line 460
    const-string v8, "hour"

    .line 461
    .line 462
    invoke-static {p2, v8, v5, v2, v7}, Lcom/facebook/hermes/intl/j;->c(Ljava/lang/Object;Ljava/lang/String;Lcom/facebook/hermes/intl/j$a;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 463
    .line 464
    .line 465
    move-result-object v2

    .line 466
    const-class v7, Lcom/facebook/hermes/intl/b$e;

    .line 467
    .line 468
    invoke-static {v7, v2}, Lcom/facebook/hermes/intl/j;->d(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Enum;

    .line 469
    .line 470
    .line 471
    move-result-object v7

    .line 472
    check-cast v7, Lcom/facebook/hermes/intl/b$e;

    .line 473
    .line 474
    iput-object v7, p0, Lcom/facebook/hermes/intl/DateTimeFormat;->o:Lcom/facebook/hermes/intl/b$e;

    .line 475
    .line 476
    filled-new-array {v3, v4}, [Ljava/lang/String;

    .line 477
    .line 478
    .line 479
    move-result-object v7

    .line 480
    invoke-static {}, Lg5/i;->d()Ljava/lang/Object;

    .line 481
    .line 482
    .line 483
    move-result-object v8

    .line 484
    const-string v9, "minute"

    .line 485
    .line 486
    invoke-static {p2, v9, v5, v7, v8}, Lcom/facebook/hermes/intl/j;->c(Ljava/lang/Object;Ljava/lang/String;Lcom/facebook/hermes/intl/j$a;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 487
    .line 488
    .line 489
    move-result-object v7

    .line 490
    const-class v8, Lcom/facebook/hermes/intl/b$g;

    .line 491
    .line 492
    invoke-static {v8, v7}, Lcom/facebook/hermes/intl/j;->d(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Enum;

    .line 493
    .line 494
    .line 495
    move-result-object v7

    .line 496
    check-cast v7, Lcom/facebook/hermes/intl/b$g;

    .line 497
    .line 498
    iput-object v7, p0, Lcom/facebook/hermes/intl/DateTimeFormat;->p:Lcom/facebook/hermes/intl/b$g;

    .line 499
    .line 500
    filled-new-array {v3, v4}, [Ljava/lang/String;

    .line 501
    .line 502
    .line 503
    move-result-object v3

    .line 504
    invoke-static {}, Lg5/i;->d()Ljava/lang/Object;

    .line 505
    .line 506
    .line 507
    move-result-object v4

    .line 508
    const-string v7, "second"

    .line 509
    .line 510
    invoke-static {p2, v7, v5, v3, v4}, Lcom/facebook/hermes/intl/j;->c(Ljava/lang/Object;Ljava/lang/String;Lcom/facebook/hermes/intl/j$a;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 511
    .line 512
    .line 513
    move-result-object v3

    .line 514
    const-class v4, Lcom/facebook/hermes/intl/b$i;

    .line 515
    .line 516
    invoke-static {v4, v3}, Lcom/facebook/hermes/intl/j;->d(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Enum;

    .line 517
    .line 518
    .line 519
    move-result-object v3

    .line 520
    check-cast v3, Lcom/facebook/hermes/intl/b$i;

    .line 521
    .line 522
    iput-object v3, p0, Lcom/facebook/hermes/intl/DateTimeFormat;->q:Lcom/facebook/hermes/intl/b$i;

    .line 523
    .line 524
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 525
    .line 526
    .line 527
    move-result-object v0

    .line 528
    invoke-static {}, Lg5/i;->d()Ljava/lang/Object;

    .line 529
    .line 530
    .line 531
    move-result-object v1

    .line 532
    const-string v3, "timeZoneName"

    .line 533
    .line 534
    invoke-static {p2, v3, v5, v0, v1}, Lcom/facebook/hermes/intl/j;->c(Ljava/lang/Object;Ljava/lang/String;Lcom/facebook/hermes/intl/j$a;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 535
    .line 536
    .line 537
    move-result-object p2

    .line 538
    const-class v0, Lcom/facebook/hermes/intl/b$j;

    .line 539
    .line 540
    invoke-static {v0, p2}, Lcom/facebook/hermes/intl/j;->d(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Enum;

    .line 541
    .line 542
    .line 543
    move-result-object p2

    .line 544
    check-cast p2, Lcom/facebook/hermes/intl/b$j;

    .line 545
    .line 546
    iput-object p2, p0, Lcom/facebook/hermes/intl/DateTimeFormat;->r:Lcom/facebook/hermes/intl/b$j;

    .line 547
    .line 548
    invoke-static {v2}, Lg5/i;->n(Ljava/lang/Object;)Z

    .line 549
    .line 550
    .line 551
    move-result p2

    .line 552
    if-eqz p2, :cond_8

    .line 553
    .line 554
    sget-object p1, Lcom/facebook/hermes/intl/b$f;->o:Lcom/facebook/hermes/intl/b$f;

    .line 555
    .line 556
    iput-object p1, p0, Lcom/facebook/hermes/intl/DateTimeFormat;->h:Lcom/facebook/hermes/intl/b$f;

    .line 557
    .line 558
    goto :goto_8

    .line 559
    :cond_8
    iget-object p2, p0, Lcom/facebook/hermes/intl/DateTimeFormat;->a:Lcom/facebook/hermes/intl/b;

    .line 560
    .line 561
    iget-object v0, p0, Lcom/facebook/hermes/intl/DateTimeFormat;->b:Lg5/b;

    .line 562
    .line 563
    invoke-interface {p2, v0}, Lcom/facebook/hermes/intl/b;->g(Lg5/b;)Lcom/facebook/hermes/intl/b$f;

    .line 564
    .line 565
    .line 566
    move-result-object p2

    .line 567
    invoke-static {p1}, Lg5/i;->j(Ljava/lang/Object;)Z

    .line 568
    .line 569
    .line 570
    move-result v0

    .line 571
    if-eqz v0, :cond_9

    .line 572
    .line 573
    move-object p1, p2

    .line 574
    goto :goto_5

    .line 575
    :cond_9
    const-class v0, Lcom/facebook/hermes/intl/b$f;

    .line 576
    .line 577
    invoke-static {v0, p1}, Lcom/facebook/hermes/intl/j;->d(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Enum;

    .line 578
    .line 579
    .line 580
    move-result-object p1

    .line 581
    check-cast p1, Lcom/facebook/hermes/intl/b$f;

    .line 582
    .line 583
    :goto_5
    invoke-static {v6}, Lg5/i;->n(Ljava/lang/Object;)Z

    .line 584
    .line 585
    .line 586
    move-result v0

    .line 587
    if-nez v0, :cond_e

    .line 588
    .line 589
    invoke-static {v6}, Lg5/i;->e(Ljava/lang/Object;)Z

    .line 590
    .line 591
    .line 592
    move-result p1

    .line 593
    if-eqz p1, :cond_b

    .line 594
    .line 595
    sget-object p1, Lcom/facebook/hermes/intl/b$f;->k:Lcom/facebook/hermes/intl/b$f;

    .line 596
    .line 597
    if-eq p2, p1, :cond_e

    .line 598
    .line 599
    sget-object v0, Lcom/facebook/hermes/intl/b$f;->m:Lcom/facebook/hermes/intl/b$f;

    .line 600
    .line 601
    if-ne p2, v0, :cond_a

    .line 602
    .line 603
    goto :goto_7

    .line 604
    :cond_a
    sget-object p1, Lcom/facebook/hermes/intl/b$f;->l:Lcom/facebook/hermes/intl/b$f;

    .line 605
    .line 606
    goto :goto_7

    .line 607
    :cond_b
    sget-object p1, Lcom/facebook/hermes/intl/b$f;->k:Lcom/facebook/hermes/intl/b$f;

    .line 608
    .line 609
    if-eq p2, p1, :cond_d

    .line 610
    .line 611
    sget-object p1, Lcom/facebook/hermes/intl/b$f;->m:Lcom/facebook/hermes/intl/b$f;

    .line 612
    .line 613
    if-ne p2, p1, :cond_c

    .line 614
    .line 615
    goto :goto_6

    .line 616
    :cond_c
    sget-object p1, Lcom/facebook/hermes/intl/b$f;->n:Lcom/facebook/hermes/intl/b$f;

    .line 617
    .line 618
    goto :goto_7

    .line 619
    :cond_d
    :goto_6
    sget-object p1, Lcom/facebook/hermes/intl/b$f;->m:Lcom/facebook/hermes/intl/b$f;

    .line 620
    .line 621
    :cond_e
    :goto_7
    iput-object p1, p0, Lcom/facebook/hermes/intl/DateTimeFormat;->h:Lcom/facebook/hermes/intl/b$f;

    .line 622
    .line 623
    :goto_8
    return-void
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
.end method

.method private d(Ljava/lang/String;)Z
    .locals 2

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x0

    invoke-static {p1, v1, v0}, Lg5/h;->o(Ljava/lang/CharSequence;II)Z

    move-result p1

    return p1
.end method

.method public static supportedLocalesOf(Ljava/util/List;Ljava/util/Map;)Ljava/util/List;
    .locals 4
    .annotation build Ld6/a;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/facebook/hermes/intl/j$a;->l:Lcom/facebook/hermes/intl/j$a;

    .line 2
    .line 3
    sget-object v1, Lg5/a;->a:[Ljava/lang/String;

    .line 4
    .line 5
    const-string v2, "localeMatcher"

    .line 6
    .line 7
    const-string v3, "best fit"

    .line 8
    .line 9
    invoke-static {p1, v2, v0, v1, v3}, Lcom/facebook/hermes/intl/j;->c(Ljava/lang/Object;Ljava/lang/String;Lcom/facebook/hermes/intl/j$a;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {p1}, Lg5/i;->h(Ljava/lang/Object;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    new-array v0, v0, [Ljava/lang/String;

    .line 22
    .line 23
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 24
    .line 25
    const/16 v2, 0x18

    .line 26
    .line 27
    if-lt v1, v2, :cond_0

    .line 28
    .line 29
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_0

    .line 34
    .line 35
    invoke-interface {p0, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    check-cast p0, [Ljava/lang/String;

    .line 40
    .line 41
    invoke-static {p0}, Lcom/facebook/hermes/intl/g;->d([Ljava/lang/String;)[Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    return-object p0

    .line 50
    :cond_0
    invoke-interface {p0, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    check-cast p0, [Ljava/lang/String;

    .line 55
    .line 56
    invoke-static {p0}, Lcom/facebook/hermes/intl/g;->h([Ljava/lang/String;)[Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0
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
.end method


# virtual methods
.method public e(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 1
    invoke-static {}, Ljava/util/TimeZone;->getAvailableIDs()[Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    array-length v1, v0

    .line 6
    const/4 v2, 0x0

    .line 7
    :goto_0
    if-ge v2, v1, :cond_1

    .line 8
    .line 9
    aget-object v3, v0, v2

    .line 10
    .line 11
    invoke-virtual {p0, v3}, Lcom/facebook/hermes/intl/DateTimeFormat;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    invoke-virtual {p0, p1}, Lcom/facebook/hermes/intl/DateTimeFormat;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v5

    .line 19
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    if-eqz v4, :cond_0

    .line 24
    .line 25
    return-object v3

    .line 26
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    new-instance p1, Lg5/j;

    .line 30
    .line 31
    const-string v0, "Invalid timezone name!"

    .line 32
    .line 33
    invoke-direct {p1, v0}, Lg5/j;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw p1
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
.end method

.method public f(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-ge v1, v2, :cond_1

    .line 16
    .line 17
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    const/16 v3, 0x41

    .line 22
    .line 23
    if-lt v2, v3, :cond_0

    .line 24
    .line 25
    const/16 v3, 0x5a

    .line 26
    .line 27
    if-gt v2, v3, :cond_0

    .line 28
    .line 29
    add-int/lit8 v2, v2, 0x20

    .line 30
    .line 31
    int-to-char v2, v2

    .line 32
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_0
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    return-object p1
.end method

.method public format(D)Ljava/lang/String;
    .locals 1
    .annotation build Ld6/a;
    .end annotation

    iget-object v0, p0, Lcom/facebook/hermes/intl/DateTimeFormat;->a:Lcom/facebook/hermes/intl/b;

    invoke-interface {v0, p1, p2}, Lcom/facebook/hermes/intl/b;->c(D)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public formatToParts(D)Ljava/util/List;
    .locals 5
    .annotation build Ld6/a;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(D)",
            "Ljava/util/List<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/facebook/hermes/intl/DateTimeFormat;->a:Lcom/facebook/hermes/intl/b;

    .line 7
    .line 8
    invoke-interface {v1, p1, p2}, Lcom/facebook/hermes/intl/b;->a(D)Ljava/text/AttributedCharacterIterator;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    new-instance p2, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-interface {p1}, Ljava/text/CharacterIterator;->first()C

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    :goto_0
    const v2, 0xffff

    .line 22
    .line 23
    .line 24
    if-eq v1, v2, :cond_2

    .line 25
    .line 26
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-interface {p1}, Ljava/text/CharacterIterator;->getIndex()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    add-int/lit8 v1, v1, 0x1

    .line 34
    .line 35
    invoke-interface {p1}, Ljava/text/AttributedCharacterIterator;->getRunLimit()I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-ne v1, v2, :cond_1

    .line 40
    .line 41
    invoke-interface {p1}, Ljava/text/AttributedCharacterIterator;->getAttributes()Ljava/util/Map;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-eqz v2, :cond_0

    .line 58
    .line 59
    iget-object v2, p0, Lcom/facebook/hermes/intl/DateTimeFormat;->a:Lcom/facebook/hermes/intl/b;

    .line 60
    .line 61
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    check-cast v1, Ljava/text/AttributedCharacterIterator$Attribute;

    .line 66
    .line 67
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    invoke-interface {v2, v1, v3}, Lcom/facebook/hermes/intl/b;->e(Ljava/text/AttributedCharacterIterator$Attribute;Ljava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    goto :goto_1

    .line 76
    :cond_0
    const-string v1, "literal"

    .line 77
    .line 78
    :goto_1
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    const/4 v3, 0x0

    .line 83
    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 84
    .line 85
    .line 86
    new-instance v3, Ljava/util/HashMap;

    .line 87
    .line 88
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 89
    .line 90
    .line 91
    const-string v4, "type"

    .line 92
    .line 93
    invoke-virtual {v3, v4, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    const-string v1, "value"

    .line 97
    .line 98
    invoke-virtual {v3, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    :cond_1
    invoke-interface {p1}, Ljava/text/CharacterIterator;->next()C

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    goto :goto_0

    .line 109
    :cond_2
    return-object v0
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
.end method

.method public resolvedOptions()Ljava/util/Map;
    .locals 4
    .annotation build Ld6/a;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/facebook/hermes/intl/DateTimeFormat;->c:Lg5/b;

    .line 7
    .line 8
    invoke-interface {v1}, Lg5/b;->g()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const-string v2, "locale"

    .line 13
    .line 14
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    const-string v1, "numberingSystem"

    .line 18
    .line 19
    iget-object v2, p0, Lcom/facebook/hermes/intl/DateTimeFormat;->g:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    const-string v1, "calendar"

    .line 25
    .line 26
    iget-object v2, p0, Lcom/facebook/hermes/intl/DateTimeFormat;->e:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    const-string v1, "timeZone"

    .line 32
    .line 33
    iget-object v2, p0, Lcom/facebook/hermes/intl/DateTimeFormat;->s:Ljava/lang/Object;

    .line 34
    .line 35
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, Lcom/facebook/hermes/intl/DateTimeFormat;->h:Lcom/facebook/hermes/intl/b$f;

    .line 39
    .line 40
    sget-object v2, Lcom/facebook/hermes/intl/b$f;->o:Lcom/facebook/hermes/intl/b$f;

    .line 41
    .line 42
    if-eq v1, v2, :cond_2

    .line 43
    .line 44
    const-string v2, "hourCycle"

    .line 45
    .line 46
    invoke-virtual {v1}, Lcom/facebook/hermes/intl/b$f;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    iget-object v1, p0, Lcom/facebook/hermes/intl/DateTimeFormat;->h:Lcom/facebook/hermes/intl/b$f;

    .line 54
    .line 55
    sget-object v2, Lcom/facebook/hermes/intl/b$f;->k:Lcom/facebook/hermes/intl/b$f;

    .line 56
    .line 57
    const-string v3, "hour12"

    .line 58
    .line 59
    if-eq v1, v2, :cond_1

    .line 60
    .line 61
    sget-object v2, Lcom/facebook/hermes/intl/b$f;->l:Lcom/facebook/hermes/intl/b$f;

    .line 62
    .line 63
    if-ne v1, v2, :cond_0

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_0
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 67
    .line 68
    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_1
    :goto_0
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 73
    .line 74
    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    :cond_2
    :goto_1
    iget-object v1, p0, Lcom/facebook/hermes/intl/DateTimeFormat;->j:Lcom/facebook/hermes/intl/b$k;

    .line 78
    .line 79
    sget-object v2, Lcom/facebook/hermes/intl/b$k;->n:Lcom/facebook/hermes/intl/b$k;

    .line 80
    .line 81
    if-eq v1, v2, :cond_3

    .line 82
    .line 83
    const-string v2, "weekday"

    .line 84
    .line 85
    invoke-virtual {v1}, Lcom/facebook/hermes/intl/b$k;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    :cond_3
    iget-object v1, p0, Lcom/facebook/hermes/intl/DateTimeFormat;->k:Lcom/facebook/hermes/intl/b$c;

    .line 93
    .line 94
    sget-object v2, Lcom/facebook/hermes/intl/b$c;->n:Lcom/facebook/hermes/intl/b$c;

    .line 95
    .line 96
    if-eq v1, v2, :cond_4

    .line 97
    .line 98
    const-string v2, "era"

    .line 99
    .line 100
    invoke-virtual {v1}, Lcom/facebook/hermes/intl/b$c;->toString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    :cond_4
    iget-object v1, p0, Lcom/facebook/hermes/intl/DateTimeFormat;->l:Lcom/facebook/hermes/intl/b$l;

    .line 108
    .line 109
    sget-object v2, Lcom/facebook/hermes/intl/b$l;->m:Lcom/facebook/hermes/intl/b$l;

    .line 110
    .line 111
    if-eq v1, v2, :cond_5

    .line 112
    .line 113
    const-string v2, "year"

    .line 114
    .line 115
    invoke-virtual {v1}, Lcom/facebook/hermes/intl/b$l;->toString()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    :cond_5
    iget-object v1, p0, Lcom/facebook/hermes/intl/DateTimeFormat;->m:Lcom/facebook/hermes/intl/b$h;

    .line 123
    .line 124
    sget-object v2, Lcom/facebook/hermes/intl/b$h;->p:Lcom/facebook/hermes/intl/b$h;

    .line 125
    .line 126
    if-eq v1, v2, :cond_6

    .line 127
    .line 128
    const-string v2, "month"

    .line 129
    .line 130
    invoke-virtual {v1}, Lcom/facebook/hermes/intl/b$h;->toString()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    :cond_6
    iget-object v1, p0, Lcom/facebook/hermes/intl/DateTimeFormat;->n:Lcom/facebook/hermes/intl/b$b;

    .line 138
    .line 139
    sget-object v2, Lcom/facebook/hermes/intl/b$b;->m:Lcom/facebook/hermes/intl/b$b;

    .line 140
    .line 141
    if-eq v1, v2, :cond_7

    .line 142
    .line 143
    const-string v2, "day"

    .line 144
    .line 145
    invoke-virtual {v1}, Lcom/facebook/hermes/intl/b$b;->toString()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    :cond_7
    iget-object v1, p0, Lcom/facebook/hermes/intl/DateTimeFormat;->o:Lcom/facebook/hermes/intl/b$e;

    .line 153
    .line 154
    sget-object v2, Lcom/facebook/hermes/intl/b$e;->m:Lcom/facebook/hermes/intl/b$e;

    .line 155
    .line 156
    if-eq v1, v2, :cond_8

    .line 157
    .line 158
    const-string v2, "hour"

    .line 159
    .line 160
    invoke-virtual {v1}, Lcom/facebook/hermes/intl/b$e;->toString()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    :cond_8
    iget-object v1, p0, Lcom/facebook/hermes/intl/DateTimeFormat;->p:Lcom/facebook/hermes/intl/b$g;

    .line 168
    .line 169
    sget-object v2, Lcom/facebook/hermes/intl/b$g;->m:Lcom/facebook/hermes/intl/b$g;

    .line 170
    .line 171
    if-eq v1, v2, :cond_9

    .line 172
    .line 173
    const-string v2, "minute"

    .line 174
    .line 175
    invoke-virtual {v1}, Lcom/facebook/hermes/intl/b$g;->toString()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    :cond_9
    iget-object v1, p0, Lcom/facebook/hermes/intl/DateTimeFormat;->q:Lcom/facebook/hermes/intl/b$i;

    .line 183
    .line 184
    sget-object v2, Lcom/facebook/hermes/intl/b$i;->m:Lcom/facebook/hermes/intl/b$i;

    .line 185
    .line 186
    if-eq v1, v2, :cond_a

    .line 187
    .line 188
    const-string v2, "second"

    .line 189
    .line 190
    invoke-virtual {v1}, Lcom/facebook/hermes/intl/b$i;->toString()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    :cond_a
    iget-object v1, p0, Lcom/facebook/hermes/intl/DateTimeFormat;->r:Lcom/facebook/hermes/intl/b$j;

    .line 198
    .line 199
    sget-object v2, Lcom/facebook/hermes/intl/b$j;->m:Lcom/facebook/hermes/intl/b$j;

    .line 200
    .line 201
    if-eq v1, v2, :cond_b

    .line 202
    .line 203
    const-string v2, "timeZoneName"

    .line 204
    .line 205
    invoke-virtual {v1}, Lcom/facebook/hermes/intl/b$j;->toString()Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    :cond_b
    return-object v0
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
.end method
