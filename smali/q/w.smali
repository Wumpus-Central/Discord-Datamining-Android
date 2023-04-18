.class public Lq/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/b0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lq/w$a;,
        Lq/w$b;,
        Lq/w$c;
    }
.end annotation


# instance fields
.field final b:Lq/w$b;

.field final c:Ljava/util/concurrent/Executor;

.field private final d:Ljava/lang/Object;

.field private final e:Lr/f0;

.field private final f:Lw/b0$c;

.field private final g:Lw/k2$b;

.field private final h:Lq/h2;

.field private final i:Lq/k3;

.field private final j:Lq/h3;

.field private final k:Lq/z1;

.field private final l:Lv/g;

.field private final m:Lq/r0;

.field private n:I

.field private volatile o:Z

.field private volatile p:I

.field private final q:Lu/a;

.field private final r:Lu/b;

.field private final s:Ljava/util/concurrent/atomic/AtomicLong;

.field private volatile t:Lfc/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfc/b<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field private u:I

.field private v:J

.field private final w:Lq/w$a;


# direct methods
.method constructor <init>(Lr/f0;Ljava/util/concurrent/ScheduledExecutorService;Ljava/util/concurrent/Executor;Lw/b0$c;Lw/g2;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lq/w;->d:Ljava/lang/Object;

    .line 10
    .line 11
    new-instance v0, Lw/k2$b;

    .line 12
    .line 13
    invoke-direct {v0}, Lw/k2$b;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lq/w;->g:Lw/k2$b;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    iput v1, p0, Lq/w;->n:I

    .line 20
    .line 21
    iput-boolean v1, p0, Lq/w;->o:Z

    .line 22
    .line 23
    const/4 v1, 0x2

    .line 24
    iput v1, p0, Lq/w;->p:I

    .line 25
    .line 26
    new-instance v1, Lu/b;

    .line 27
    .line 28
    invoke-direct {v1}, Lu/b;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object v1, p0, Lq/w;->r:Lu/b;

    .line 32
    .line 33
    new-instance v1, Ljava/util/concurrent/atomic/AtomicLong;

    .line 34
    .line 35
    const-wide/16 v2, 0x0

    .line 36
    .line 37
    invoke-direct {v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    .line 38
    .line 39
    .line 40
    iput-object v1, p0, Lq/w;->s:Ljava/util/concurrent/atomic/AtomicLong;

    .line 41
    .line 42
    const/4 v1, 0x0

    .line 43
    invoke-static {v1}, Ly/f;->h(Ljava/lang/Object;)Lfc/b;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    iput-object v1, p0, Lq/w;->t:Lfc/b;

    .line 48
    .line 49
    const/4 v1, 0x1

    .line 50
    iput v1, p0, Lq/w;->u:I

    .line 51
    .line 52
    iput-wide v2, p0, Lq/w;->v:J

    .line 53
    .line 54
    new-instance v1, Lq/w$a;

    .line 55
    .line 56
    invoke-direct {v1}, Lq/w$a;-><init>()V

    .line 57
    .line 58
    .line 59
    iput-object v1, p0, Lq/w;->w:Lq/w$a;

    .line 60
    .line 61
    iput-object p1, p0, Lq/w;->e:Lr/f0;

    .line 62
    .line 63
    iput-object p4, p0, Lq/w;->f:Lw/b0$c;

    .line 64
    .line 65
    iput-object p3, p0, Lq/w;->c:Ljava/util/concurrent/Executor;

    .line 66
    .line 67
    new-instance p4, Lq/w$b;

    .line 68
    .line 69
    invoke-direct {p4, p3}, Lq/w$b;-><init>(Ljava/util/concurrent/Executor;)V

    .line 70
    .line 71
    .line 72
    iput-object p4, p0, Lq/w;->b:Lq/w$b;

    .line 73
    .line 74
    iget v2, p0, Lq/w;->u:I

    .line 75
    .line 76
    invoke-virtual {v0, v2}, Lw/k2$b;->r(I)V

    .line 77
    .line 78
    .line 79
    invoke-static {p4}, Lq/o1;->d(Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)Lq/o1;

    .line 80
    .line 81
    .line 82
    move-result-object p4

    .line 83
    invoke-virtual {v0, p4}, Lw/k2$b;->i(Lw/k;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0, v1}, Lw/k2$b;->i(Lw/k;)V

    .line 87
    .line 88
    .line 89
    new-instance p4, Lq/z1;

    .line 90
    .line 91
    invoke-direct {p4, p0, p1, p3}, Lq/z1;-><init>(Lq/w;Lr/f0;Ljava/util/concurrent/Executor;)V

    .line 92
    .line 93
    .line 94
    iput-object p4, p0, Lq/w;->k:Lq/z1;

    .line 95
    .line 96
    new-instance p4, Lq/h2;

    .line 97
    .line 98
    invoke-direct {p4, p0, p2, p3, p5}, Lq/h2;-><init>(Lq/w;Ljava/util/concurrent/ScheduledExecutorService;Ljava/util/concurrent/Executor;Lw/g2;)V

    .line 99
    .line 100
    .line 101
    iput-object p4, p0, Lq/w;->h:Lq/h2;

    .line 102
    .line 103
    new-instance p2, Lq/k3;

    .line 104
    .line 105
    invoke-direct {p2, p0, p1, p3}, Lq/k3;-><init>(Lq/w;Lr/f0;Ljava/util/concurrent/Executor;)V

    .line 106
    .line 107
    .line 108
    iput-object p2, p0, Lq/w;->i:Lq/k3;

    .line 109
    .line 110
    new-instance p2, Lq/h3;

    .line 111
    .line 112
    invoke-direct {p2, p0, p1, p3}, Lq/h3;-><init>(Lq/w;Lr/f0;Ljava/util/concurrent/Executor;)V

    .line 113
    .line 114
    .line 115
    iput-object p2, p0, Lq/w;->j:Lq/h3;

    .line 116
    .line 117
    new-instance p2, Lu/a;

    .line 118
    .line 119
    invoke-direct {p2, p5}, Lu/a;-><init>(Lw/g2;)V

    .line 120
    .line 121
    .line 122
    iput-object p2, p0, Lq/w;->q:Lu/a;

    .line 123
    .line 124
    new-instance p2, Lv/g;

    .line 125
    .line 126
    invoke-direct {p2, p0, p3}, Lv/g;-><init>(Lq/w;Ljava/util/concurrent/Executor;)V

    .line 127
    .line 128
    .line 129
    iput-object p2, p0, Lq/w;->l:Lv/g;

    .line 130
    .line 131
    new-instance p2, Lq/r0;

    .line 132
    .line 133
    invoke-direct {p2, p0, p1, p5, p3}, Lq/r0;-><init>(Lq/w;Lr/f0;Lw/g2;Ljava/util/concurrent/Executor;)V

    .line 134
    .line 135
    .line 136
    iput-object p2, p0, Lq/w;->m:Lq/r0;

    .line 137
    .line 138
    new-instance p1, Lq/p;

    .line 139
    .line 140
    invoke-direct {p1, p0}, Lq/p;-><init>(Lq/w;)V

    .line 141
    .line 142
    .line 143
    invoke-interface {p3, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 144
    .line 145
    .line 146
    return-void
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

.method private H(I)I
    .locals 3

    .line 1
    iget-object v0, p0, Lq/w;->e:Lr/f0;

    .line 2
    .line 3
    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->CONTROL_AWB_AVAILABLE_MODES:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lr/f0;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, [I

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    return v1

    .line 15
    :cond_0
    invoke-direct {p0, p1, v0}, Lq/w;->N(I[I)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    return p1

    .line 22
    :cond_1
    const/4 p1, 0x1

    .line 23
    invoke-direct {p0, p1, v0}, Lq/w;->N(I[I)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    return p1

    .line 30
    :cond_2
    return v1
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

.method private M()Z
    .locals 1

    invoke-virtual {p0}, Lq/w;->J()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private N(I[I)Z
    .locals 4

    array-length v0, p2

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    aget v3, p2, v2

    if-ne p1, v3, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method static O(Landroid/hardware/camera2/TotalCaptureResult;J)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/hardware/camera2/CaptureResult;->getRequest()Landroid/hardware/camera2/CaptureRequest;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    invoke-virtual {p0}, Landroid/hardware/camera2/CaptureResult;->getRequest()Landroid/hardware/camera2/CaptureRequest;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Landroid/hardware/camera2/CaptureRequest;->getTag()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    instance-of v0, p0, Lw/s2;

    .line 18
    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    check-cast p0, Lw/s2;

    .line 22
    .line 23
    const-string v0, "CameraControlSessionUpdateId"

    .line 24
    .line 25
    invoke-virtual {p0, v0}, Lw/s2;->c(Ljava/lang/String;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    check-cast p0, Ljava/lang/Long;

    .line 30
    .line 31
    if-nez p0, :cond_1

    .line 32
    .line 33
    return v1

    .line 34
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 35
    .line 36
    .line 37
    move-result-wide v2

    .line 38
    cmp-long p0, v2, p1

    .line 39
    .line 40
    if-ltz p0, :cond_2

    .line 41
    .line 42
    const/4 p0, 0x1

    .line 43
    return p0

    .line 44
    :cond_2
    return v1
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

.method private static synthetic Q()V
    .locals 0

    return-void
.end method

.method private synthetic R(Ljava/util/concurrent/Executor;Lw/k;)V
    .locals 1

    iget-object v0, p0, Lq/w;->w:Lq/w$a;

    invoke-virtual {v0, p1, p2}, Lq/w$a;->g(Ljava/util/concurrent/Executor;Lw/k;)V

    return-void
.end method

.method private static synthetic S()V
    .locals 0

    return-void
.end method

.method private synthetic T()V
    .locals 1

    iget-object v0, p0, Lq/w;->l:Lv/g;

    invoke-virtual {v0}, Lv/g;->l()Lq/w$c;

    move-result-object v0

    invoke-virtual {p0, v0}, Lq/w;->t(Lq/w$c;)V

    return-void
.end method

.method private synthetic U(Lw/k;)V
    .locals 1

    iget-object v0, p0, Lq/w;->w:Lq/w$a;

    invoke-virtual {v0, p1}, Lq/w$a;->k(Lw/k;)V

    return-void
.end method

.method private synthetic V(Ljava/util/List;IIILjava/lang/Void;)Lfc/b;
    .locals 0

    iget-object p5, p0, Lq/w;->m:Lq/r0;

    invoke-virtual {p5, p1, p2, p3, p4}, Lq/r0;->d(Ljava/util/List;III)Lfc/b;

    move-result-object p1

    return-object p1
.end method

.method private synthetic W(Landroidx/concurrent/futures/c$a;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lq/w;->j0()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-direct {p0, v0, v1}, Lq/w;->k0(J)Lfc/b;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0, p1}, Ly/f;->k(Lfc/b;Landroidx/concurrent/futures/c$a;)V

    .line 10
    .line 11
    .line 12
    return-void
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

.method private synthetic X(Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lq/w;->c:Ljava/util/concurrent/Executor;

    new-instance v1, Lq/r;

    invoke-direct {v1, p0, p1}, Lq/r;-><init>(Lq/w;Landroidx/concurrent/futures/c$a;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    const-string p1, "updateSessionConfigAsync"

    return-object p1
.end method

.method private static synthetic Y(JLandroidx/concurrent/futures/c$a;Landroid/hardware/camera2/TotalCaptureResult;)Z
    .locals 0

    .line 1
    invoke-static {p3, p0, p1}, Lq/w;->O(Landroid/hardware/camera2/TotalCaptureResult;J)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    invoke-virtual {p2, p0}, Landroidx/concurrent/futures/c$a;->c(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return p0
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
.end method

.method private synthetic Z(JLandroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 1

    .line 1
    new-instance v0, Lq/i;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2, p3}, Lq/i;-><init>(JLandroidx/concurrent/futures/c$a;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lq/w;->t(Lq/w$c;)V

    .line 7
    .line 8
    .line 9
    new-instance p3, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v0, "waitForSessionUpdateId:"

    .line 15
    .line 16
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p3, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1
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
.end method

.method public static synthetic j(Lq/w;Landroidx/concurrent/futures/c$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lq/w;->W(Landroidx/concurrent/futures/c$a;)V

    return-void
.end method

.method public static synthetic k(Lq/w;Lw/k;)V
    .locals 0

    invoke-direct {p0, p1}, Lq/w;->U(Lw/k;)V

    return-void
.end method

.method private k0(J)Lfc/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Lfc/b<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Lq/j;

    invoke-direct {v0, p0, p1, p2}, Lq/j;-><init>(Lq/w;J)V

    invoke-static {v0}, Landroidx/concurrent/futures/c;->a(Landroidx/concurrent/futures/c$c;)Lfc/b;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic l(Lq/w;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lq/w;->X(Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(JLandroidx/concurrent/futures/c$a;Landroid/hardware/camera2/TotalCaptureResult;)Z
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lq/w;->Y(JLandroidx/concurrent/futures/c$a;Landroid/hardware/camera2/TotalCaptureResult;)Z

    move-result p0

    return p0
.end method

.method public static synthetic n(Lq/w;)V
    .locals 0

    invoke-direct {p0}, Lq/w;->T()V

    return-void
.end method

.method public static synthetic o(Lq/w;Ljava/util/concurrent/Executor;Lw/k;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lq/w;->R(Ljava/util/concurrent/Executor;Lw/k;)V

    return-void
.end method

.method public static synthetic p(Lq/w;Ljava/util/List;IIILjava/lang/Void;)Lfc/b;
    .locals 0

    invoke-direct/range {p0 .. p5}, Lq/w;->V(Ljava/util/List;IIILjava/lang/Void;)Lfc/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q(Lq/w;JLandroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lq/w;->Z(JLandroidx/concurrent/futures/c$a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r()V
    .locals 0

    invoke-static {}, Lq/w;->S()V

    return-void
.end method

.method public static synthetic s()V
    .locals 0

    invoke-static {}, Lq/w;->Q()V

    return-void
.end method


# virtual methods
.method A()I
    .locals 2

    .line 1
    iget-object v0, p0, Lq/w;->e:Lr/f0;

    .line 2
    .line 3
    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->CONTROL_MAX_REGIONS_AE:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lr/f0;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ljava/lang/Integer;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    :goto_0
    return v0
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

.method B()I
    .locals 2

    .line 1
    iget-object v0, p0, Lq/w;->e:Lr/f0;

    .line 2
    .line 3
    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->CONTROL_MAX_REGIONS_AF:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lr/f0;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ljava/lang/Integer;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    :goto_0
    return v0
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

.method C()I
    .locals 2

    .line 1
    iget-object v0, p0, Lq/w;->e:Lr/f0;

    .line 2
    .line 3
    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->CONTROL_MAX_REGIONS_AWB:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lr/f0;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ljava/lang/Integer;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    :goto_0
    return v0
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

.method public D()Lw/k2;
    .locals 3

    .line 1
    iget-object v0, p0, Lq/w;->g:Lw/k2$b;

    .line 2
    .line 3
    iget v1, p0, Lq/w;->u:I

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lw/k2$b;->r(I)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lq/w;->g:Lw/k2$b;

    .line 9
    .line 10
    invoke-virtual {p0}, Lq/w;->E()Lw/r0;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Lw/k2$b;->q(Lw/r0;)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lq/w;->l:Lv/g;

    .line 18
    .line 19
    invoke-virtual {v0}, Lv/g;->k()Lp/b;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const/4 v1, 0x0

    .line 24
    invoke-virtual {v0, v1}, Lp/b;->I(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    instance-of v1, v0, Ljava/lang/Integer;

    .line 31
    .line 32
    if-eqz v1, :cond_0

    .line 33
    .line 34
    iget-object v1, p0, Lq/w;->g:Lw/k2$b;

    .line 35
    .line 36
    const-string v2, "Camera2CameraControl"

    .line 37
    .line 38
    invoke-virtual {v1, v2, v0}, Lw/k2$b;->l(Ljava/lang/String;Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    :cond_0
    iget-object v0, p0, Lq/w;->g:Lw/k2$b;

    .line 42
    .line 43
    iget-wide v1, p0, Lq/w;->v:J

    .line 44
    .line 45
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    const-string v2, "CameraControlSessionUpdateId"

    .line 50
    .line 51
    invoke-virtual {v0, v2, v1}, Lw/k2$b;->l(Ljava/lang/String;Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    iget-object v0, p0, Lq/w;->g:Lw/k2$b;

    .line 55
    .line 56
    invoke-virtual {v0}, Lw/k2$b;->m()Lw/k2;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    return-object v0
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
.end method

.method E()Lw/r0;
    .locals 7

    .line 1
    new-instance v0, Lp/b$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lp/b$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->CONTROL_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    invoke-virtual {v0, v1, v3}, Lp/b$a;->e(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lp/b$a;

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, Lq/w;->h:Lq/h2;

    .line 17
    .line 18
    invoke-virtual {v1, v0}, Lq/h2;->g(Lp/b$a;)V

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Lq/w;->q:Lu/a;

    .line 22
    .line 23
    invoke-virtual {v1, v0}, Lu/a;->a(Lp/b$a;)V

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Lq/w;->i:Lq/k3;

    .line 27
    .line 28
    invoke-virtual {v1, v0}, Lq/k3;->c(Lp/b$a;)V

    .line 29
    .line 30
    .line 31
    iget-boolean v1, p0, Lq/w;->o:Z

    .line 32
    .line 33
    const/4 v3, 0x2

    .line 34
    if-eqz v1, :cond_0

    .line 35
    .line 36
    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->FLASH_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    .line 37
    .line 38
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-virtual {v0, v1, v3}, Lp/b$a;->e(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lp/b$a;

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    iget v1, p0, Lq/w;->p:I

    .line 47
    .line 48
    if-eqz v1, :cond_2

    .line 49
    .line 50
    if-eq v1, v2, :cond_1

    .line 51
    .line 52
    :goto_0
    move v1, v2

    .line 53
    goto :goto_1

    .line 54
    :cond_1
    const/4 v1, 0x3

    .line 55
    goto :goto_1

    .line 56
    :cond_2
    iget-object v1, p0, Lq/w;->r:Lu/b;

    .line 57
    .line 58
    invoke-virtual {v1, v3}, Lu/b;->a(I)I

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    :goto_1
    sget-object v3, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    .line 63
    .line 64
    invoke-virtual {p0, v1}, Lq/w;->F(I)I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-virtual {v0, v3, v1}, Lp/b$a;->e(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lp/b$a;

    .line 73
    .line 74
    .line 75
    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AWB_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    .line 76
    .line 77
    invoke-direct {p0, v2}, Lq/w;->H(I)I

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    invoke-virtual {v0, v1, v2}, Lp/b$a;->e(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lp/b$a;

    .line 86
    .line 87
    .line 88
    iget-object v1, p0, Lq/w;->k:Lq/z1;

    .line 89
    .line 90
    invoke-virtual {v1, v0}, Lq/z1;->c(Lp/b$a;)V

    .line 91
    .line 92
    .line 93
    iget-object v1, p0, Lq/w;->l:Lv/g;

    .line 94
    .line 95
    invoke-virtual {v1}, Lv/g;->k()Lp/b;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    invoke-interface {v1}, Lw/r0;->c()Ljava/util/Set;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 108
    .line 109
    .line 110
    move-result v3

    .line 111
    if-eqz v3, :cond_3

    .line 112
    .line 113
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    check-cast v3, Lw/r0$a;

    .line 118
    .line 119
    invoke-virtual {v0}, Lp/b$a;->b()Lw/w1;

    .line 120
    .line 121
    .line 122
    move-result-object v4

    .line 123
    sget-object v5, Lw/r0$c;->k:Lw/r0$c;

    .line 124
    .line 125
    invoke-interface {v1, v3}, Lw/r0;->b(Lw/r0$a;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v6

    .line 129
    invoke-interface {v4, v3, v5, v6}, Lw/w1;->E(Lw/r0$a;Lw/r0$c;Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_3
    invoke-virtual {v0}, Lp/b$a;->a()Lp/b;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    return-object v0
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
.end method

.method F(I)I
    .locals 3

    .line 1
    iget-object v0, p0, Lq/w;->e:Lr/f0;

    .line 2
    .line 3
    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->CONTROL_AE_AVAILABLE_MODES:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lr/f0;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, [I

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    return v1

    .line 15
    :cond_0
    invoke-direct {p0, p1, v0}, Lq/w;->N(I[I)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    return p1

    .line 22
    :cond_1
    const/4 p1, 0x1

    .line 23
    invoke-direct {p0, p1, v0}, Lq/w;->N(I[I)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    return p1

    .line 30
    :cond_2
    return v1
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

.method G(I)I
    .locals 3

    .line 1
    iget-object v0, p0, Lq/w;->e:Lr/f0;

    .line 2
    .line 3
    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->CONTROL_AF_AVAILABLE_MODES:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lr/f0;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, [I

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    return v1

    .line 15
    :cond_0
    invoke-direct {p0, p1, v0}, Lq/w;->N(I[I)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    return p1

    .line 22
    :cond_1
    const/4 p1, 0x4

    .line 23
    invoke-direct {p0, p1, v0}, Lq/w;->N(I[I)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_2

    .line 28
    .line 29
    return p1

    .line 30
    :cond_2
    const/4 p1, 0x1

    .line 31
    invoke-direct {p0, p1, v0}, Lq/w;->N(I[I)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_3

    .line 36
    .line 37
    return p1

    .line 38
    :cond_3
    return v1
    .line 39
    .line 40
.end method

.method public I()Lq/h3;
    .locals 1

    iget-object v0, p0, Lq/w;->j:Lq/h3;

    return-object v0
.end method

.method J()I
    .locals 2

    .line 1
    iget-object v0, p0, Lq/w;->d:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget v1, p0, Lq/w;->n:I

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    return v1

    .line 8
    :catchall_0
    move-exception v1

    .line 9
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    throw v1
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

.method public K()Lq/k3;
    .locals 1

    iget-object v0, p0, Lq/w;->i:Lq/k3;

    return-object v0
.end method

.method L()V
    .locals 2

    .line 1
    iget-object v0, p0, Lq/w;->d:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget v1, p0, Lq/w;->n:I

    .line 5
    .line 6
    add-int/lit8 v1, v1, 0x1

    .line 7
    .line 8
    iput v1, p0, Lq/w;->n:I

    .line 9
    .line 10
    monitor-exit v0

    .line 11
    return-void

    .line 12
    :catchall_0
    move-exception v1

    .line 13
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    throw v1
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

.method P()Z
    .locals 1

    iget-boolean v0, p0, Lq/w;->o:Z

    return v0
.end method

.method public a(Ljava/util/List;II)Lfc/b;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lw/n0;",
            ">;II)",
            "Lfc/b<",
            "Ljava/util/List<",
            "Ljava/lang/Void;",
            ">;>;"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lq/w;->M()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string p1, "Camera2CameraControlImp"

    .line 8
    .line 9
    const-string p2, "Camera is not active."

    .line 10
    .line 11
    invoke-static {p1, p2}, Landroidx/camera/core/r1;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    new-instance p1, Landroidx/camera/core/m$a;

    .line 15
    .line 16
    invoke-direct {p1, p2}, Landroidx/camera/core/m$a;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-static {p1}, Ly/f;->f(Ljava/lang/Throwable;)Lfc/b;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1

    .line 24
    :cond_0
    invoke-virtual {p0}, Lq/w;->y()I

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    iget-object v0, p0, Lq/w;->t:Lfc/b;

    .line 29
    .line 30
    invoke-static {v0}, Ly/d;->b(Lfc/b;)Ly/d;

    .line 31
    .line 32
    .line 33
    move-result-object v6

    .line 34
    new-instance v7, Lq/o;

    .line 35
    .line 36
    move-object v0, v7

    .line 37
    move-object v1, p0

    .line 38
    move-object v2, p1

    .line 39
    move v3, p2

    .line 40
    move v5, p3

    .line 41
    invoke-direct/range {v0 .. v5}, Lq/o;-><init>(Lq/w;Ljava/util/List;III)V

    .line 42
    .line 43
    .line 44
    iget-object p1, p0, Lq/w;->c:Ljava/util/concurrent/Executor;

    .line 45
    .line 46
    invoke-virtual {v6, v7, p1}, Ly/d;->f(Ly/a;Ljava/util/concurrent/Executor;)Ly/d;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    return-object p1
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
.end method

.method a0(Lq/w$c;)V
    .locals 1

    iget-object v0, p0, Lq/w;->b:Lq/w$b;

    invoke-virtual {v0, p1}, Lq/w$b;->d(Lq/w$c;)V

    return-void
.end method

.method public b(Lw/r0;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lq/w;->l:Lv/g;

    .line 2
    .line 3
    invoke-static {p1}, Lv/k$a;->e(Lw/r0;)Lv/k$a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Lv/k$a;->d()Lv/k;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {v0, p1}, Lv/g;->g(Lv/k;)Lfc/b;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    new-instance v0, Lq/q;

    .line 16
    .line 17
    invoke-direct {v0}, Lq/q;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-static {}, Lx/a;->a()Ljava/util/concurrent/Executor;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-interface {p1, v0, v1}, Lfc/b;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 25
    .line 26
    .line 27
    return-void
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

.method b0(Lw/k;)V
    .locals 2

    iget-object v0, p0, Lq/w;->c:Ljava/util/concurrent/Executor;

    new-instance v1, Lq/k;

    invoke-direct {v1, p0, p1}, Lq/k;-><init>(Lq/w;Lw/k;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public c(F)Lfc/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F)",
            "Lfc/b<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lq/w;->M()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance p1, Landroidx/camera/core/m$a;

    .line 8
    .line 9
    const-string v0, "Camera is not active."

    .line 10
    .line 11
    invoke-direct {p1, v0}, Landroidx/camera/core/m$a;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-static {p1}, Ly/f;->f(Ljava/lang/Throwable;)Lfc/b;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1

    .line 19
    :cond_0
    iget-object v0, p0, Lq/w;->i:Lq/k3;

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Lq/k3;->l(F)Lfc/b;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-static {p1}, Ly/f;->j(Lfc/b;)Lfc/b;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    return-object p1
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

.method c0()V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lq/w;->f0(I)V

    return-void
.end method

.method public d()Landroid/graphics/Rect;
    .locals 2

    .line 1
    iget-object v0, p0, Lq/w;->e:Lr/f0;

    .line 2
    .line 3
    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->SENSOR_INFO_ACTIVE_ARRAY_SIZE:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lr/f0;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Landroid/graphics/Rect;

    .line 10
    .line 11
    invoke-static {v0}, Landroidx/core/util/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Landroid/graphics/Rect;

    .line 16
    .line 17
    return-object v0
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

.method d0(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lq/w;->h:Lq/h2;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lq/h2;->E(Z)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lq/w;->i:Lq/k3;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lq/k3;->k(Z)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lq/w;->j:Lq/h3;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Lq/h3;->j(Z)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lq/w;->k:Lq/z1;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lq/z1;->b(Z)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lq/w;->l:Lv/g;

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Lv/g;->s(Z)V

    .line 24
    .line 25
    .line 26
    return-void
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

.method public e(I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lq/w;->M()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string p1, "Camera2CameraControlImp"

    .line 8
    .line 9
    const-string v0, "Camera is not active."

    .line 10
    .line 11
    invoke-static {p1, v0}, Landroidx/camera/core/r1;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    iput p1, p0, Lq/w;->p:I

    .line 16
    .line 17
    invoke-virtual {p0}, Lq/w;->i0()Lfc/b;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iput-object p1, p0, Lq/w;->t:Lfc/b;

    .line 22
    .line 23
    return-void
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

.method public e0(Landroid/util/Rational;)V
    .locals 1

    iget-object v0, p0, Lq/w;->h:Lq/h2;

    invoke-virtual {v0, p1}, Lq/h2;->F(Landroid/util/Rational;)V

    return-void
.end method

.method public f(Z)Lfc/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lfc/b<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lq/w;->M()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance p1, Landroidx/camera/core/m$a;

    .line 8
    .line 9
    const-string v0, "Camera is not active."

    .line 10
    .line 11
    invoke-direct {p1, v0}, Landroidx/camera/core/m$a;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-static {p1}, Ly/f;->f(Ljava/lang/Throwable;)Lfc/b;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1

    .line 19
    :cond_0
    iget-object v0, p0, Lq/w;->j:Lq/h3;

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Lq/h3;->d(Z)Lfc/b;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-static {p1}, Ly/f;->j(Lfc/b;)Lfc/b;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    return-object p1
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

.method f0(I)V
    .locals 1

    .line 1
    iput p1, p0, Lq/w;->u:I

    .line 2
    .line 3
    iget-object v0, p0, Lq/w;->h:Lq/h2;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lq/h2;->G(I)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Lq/w;->m:Lq/r0;

    .line 9
    .line 10
    iget v0, p0, Lq/w;->u:I

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Lq/r0;->c(I)V

    .line 13
    .line 14
    .line 15
    return-void
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

.method public g()Lw/r0;
    .locals 1

    iget-object v0, p0, Lq/w;->l:Lv/g;

    invoke-virtual {v0}, Lv/g;->k()Lp/b;

    move-result-object v0

    return-object v0
.end method

.method g0(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lw/n0;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lq/w;->f:Lw/b0$c;

    invoke-interface {v0, p1}, Lw/b0$c;->b(Ljava/util/List;)V

    return-void
.end method

.method public h()V
    .locals 3

    .line 1
    iget-object v0, p0, Lq/w;->l:Lv/g;

    .line 2
    .line 3
    invoke-virtual {v0}, Lv/g;->i()Lfc/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Lq/m;

    .line 8
    .line 9
    invoke-direct {v1}, Lq/m;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-static {}, Lx/a;->a()Ljava/util/concurrent/Executor;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-interface {v0, v1, v2}, Lfc/b;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 17
    .line 18
    .line 19
    return-void
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

.method public h0()V
    .locals 2

    iget-object v0, p0, Lq/w;->c:Ljava/util/concurrent/Executor;

    new-instance v1, Lq/s;

    invoke-direct {v1, p0}, Lq/s;-><init>(Lq/w;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public i(Landroidx/camera/core/g0;)Lfc/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/core/g0;",
            ")",
            "Lfc/b<",
            "Landroidx/camera/core/h0;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lq/w;->M()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance p1, Landroidx/camera/core/m$a;

    .line 8
    .line 9
    const-string v0, "Camera is not active."

    .line 10
    .line 11
    invoke-direct {p1, v0}, Landroidx/camera/core/m$a;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-static {p1}, Ly/f;->f(Ljava/lang/Throwable;)Lfc/b;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1

    .line 19
    :cond_0
    iget-object v0, p0, Lq/w;->h:Lq/h2;

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Lq/h2;->I(Landroidx/camera/core/g0;)Lfc/b;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-static {p1}, Ly/f;->j(Lfc/b;)Lfc/b;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    return-object p1
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

.method i0()Lfc/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lfc/b<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lq/l;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lq/l;-><init>(Lq/w;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Landroidx/concurrent/futures/c;->a(Landroidx/concurrent/futures/c$c;)Lfc/b;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {v0}, Ly/f;->j(Lfc/b;)Lfc/b;

    .line 11
    .line 12
    .line 13
    move-result-object v0

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

.method j0()J
    .locals 2

    .line 1
    iget-object v0, p0, Lq/w;->s:Ljava/util/concurrent/atomic/AtomicLong;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iput-wide v0, p0, Lq/w;->v:J

    .line 8
    .line 9
    iget-object v0, p0, Lq/w;->f:Lw/b0$c;

    .line 10
    .line 11
    invoke-interface {v0}, Lw/b0$c;->a()V

    .line 12
    .line 13
    .line 14
    iget-wide v0, p0, Lq/w;->v:J

    .line 15
    .line 16
    return-wide v0
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

.method t(Lq/w$c;)V
    .locals 1

    iget-object v0, p0, Lq/w;->b:Lq/w$b;

    invoke-virtual {v0, p1}, Lq/w$b;->b(Lq/w$c;)V

    return-void
.end method

.method u(Ljava/util/concurrent/Executor;Lw/k;)V
    .locals 2

    iget-object v0, p0, Lq/w;->c:Ljava/util/concurrent/Executor;

    new-instance v1, Lq/n;

    invoke-direct {v1, p0, p1, p2}, Lq/n;-><init>(Lq/w;Ljava/util/concurrent/Executor;Lw/k;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method v()V
    .locals 3

    .line 1
    iget-object v0, p0, Lq/w;->d:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget v1, p0, Lq/w;->n:I

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    add-int/lit8 v1, v1, -0x1

    .line 9
    .line 10
    iput v1, p0, Lq/w;->n:I

    .line 11
    .line 12
    monitor-exit v0

    .line 13
    return-void

    .line 14
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 15
    .line 16
    const-string v2, "Decrementing use count occurs more times than incrementing"

    .line 17
    .line 18
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw v1

    .line 22
    :catchall_0
    move-exception v1

    .line 23
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    throw v1
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

.method w(Z)V
    .locals 3

    .line 1
    iput-boolean p1, p0, Lq/w;->o:Z

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    new-instance p1, Lw/n0$a;

    .line 6
    .line 7
    invoke-direct {p1}, Lw/n0$a;-><init>()V

    .line 8
    .line 9
    .line 10
    iget v0, p0, Lq/w;->u:I

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Lw/n0$a;->o(I)V

    .line 13
    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    invoke-virtual {p1, v0}, Lw/n0$a;->p(Z)V

    .line 17
    .line 18
    .line 19
    new-instance v1, Lp/b$a;

    .line 20
    .line 21
    invoke-direct {v1}, Lp/b$a;-><init>()V

    .line 22
    .line 23
    .line 24
    sget-object v2, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    .line 25
    .line 26
    invoke-virtual {p0, v0}, Lq/w;->F(I)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {v1, v2, v0}, Lp/b$a;->e(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lp/b$a;

    .line 35
    .line 36
    .line 37
    sget-object v0, Landroid/hardware/camera2/CaptureRequest;->FLASH_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    .line 38
    .line 39
    const/4 v2, 0x0

    .line 40
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {v1, v0, v2}, Lp/b$a;->e(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lp/b$a;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1}, Lp/b$a;->a()Lp/b;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {p1, v0}, Lw/n0$a;->e(Lw/r0;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1}, Lw/n0$a;->h()Lw/n0;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-virtual {p0, p1}, Lq/w;->g0(Ljava/util/List;)V

    .line 63
    .line 64
    .line 65
    :cond_0
    invoke-virtual {p0}, Lq/w;->j0()J

    .line 66
    .line 67
    .line 68
    return-void
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
.end method

.method x()Landroid/graphics/Rect;
    .locals 1

    iget-object v0, p0, Lq/w;->i:Lq/k3;

    invoke-virtual {v0}, Lq/k3;->e()Landroid/graphics/Rect;

    move-result-object v0

    return-object v0
.end method

.method public y()I
    .locals 1

    iget v0, p0, Lq/w;->p:I

    return v0
.end method

.method public z()Lq/h2;
    .locals 1

    iget-object v0, p0, Lq/w;->h:Lq/h2;

    return-object v0
.end method
