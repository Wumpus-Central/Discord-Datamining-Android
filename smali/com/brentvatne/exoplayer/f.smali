.class Lcom/brentvatne/exoplayer/f;
.super Landroid/widget/FrameLayout;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/bridge/LifecycleEventListener;
.implements Lcom/google/android/exoplayer2/Player$a;
.implements Le9/e$a;
.implements La3/b;
.implements Landroid/media/AudioManager$OnAudioFocusChangeListener;
.implements Lz7/f;
.implements Lk7/v;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ViewConstructor"
    }
.end annotation


# static fields
.field private static final p0:Ljava/net/CookieManager;


# instance fields
.field private A:Z

.field private B:Z

.field private C:Z

.field private D:Z

.field private E:F

.field private F:F

.field private G:I

.field private H:I

.field private I:J

.field private J:I

.field private K:I

.field private L:I

.field private M:I

.field private N:Landroid/os/Handler;

.field private O:Landroid/net/Uri;

.field private P:Ljava/lang/String;

.field private Q:Z

.field private R:Ljava/lang/String;

.field private S:Lcom/facebook/react/bridge/Dynamic;

.field private T:Ljava/lang/String;

.field private U:Lcom/facebook/react/bridge/Dynamic;

.field private V:Ljava/lang/String;

.field private W:Lcom/facebook/react/bridge/Dynamic;

.field private a0:Lcom/facebook/react/bridge/ReadableArray;

.field private b0:Z

.field private c0:Z

.field private d0:F

.field private e0:Z

.field private f0:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private g0:Z

.field private h0:Ljava/util/UUID;

.field private i0:Ljava/lang/String;

.field private j0:[Ljava/lang/String;

.field private final k:Lcom/brentvatne/exoplayer/h;

.field private k0:Z

.field private final l:Lcom/brentvatne/exoplayer/e;

.field private final l0:Lcom/facebook/react/uimanager/ThemedReactContext;

.field private final m:Le9/o;

.field private final m0:Landroid/media/AudioManager;

.field private n:Lcom/google/android/exoplayer2/ui/PlayerControlView;

.field private final n0:La3/a;

.field private o:Landroid/view/View;

.field private final o0:Landroid/os/Handler;

.field private p:Lcom/google/android/exoplayer2/Player$a;

.field private q:Lcom/brentvatne/exoplayer/d;

.field private r:Lcom/google/android/exoplayer2/upstream/DataSource$Factory;

.field private s:Lcom/google/android/exoplayer2/SimpleExoPlayer;

.field private t:Lb9/f;

.field private u:Z

.field private v:I

.field private w:J

.field private x:Z

.field private y:Z

.field private z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/net/CookieManager;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/net/CookieManager;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/brentvatne/exoplayer/f;->p0:Ljava/net/CookieManager;

    .line 7
    .line 8
    sget-object v1, Ljava/net/CookiePolicy;->ACCEPT_ORIGINAL_SERVER:Ljava/net/CookiePolicy;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/net/CookieManager;->setCookiePolicy(Ljava/net/CookiePolicy;)V

    .line 11
    .line 12
    .line 13
    return-void
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
.end method

.method public constructor <init>(Lcom/facebook/react/uimanager/ThemedReactContext;Lcom/brentvatne/exoplayer/e;)V
    .locals 3

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/brentvatne/exoplayer/f;->C:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Lcom/brentvatne/exoplayer/f;->D:Z

    .line 8
    .line 9
    const/high16 v1, 0x3f800000    # 1.0f

    .line 10
    .line 11
    iput v1, p0, Lcom/brentvatne/exoplayer/f;->E:F

    .line 12
    .line 13
    iput v1, p0, Lcom/brentvatne/exoplayer/f;->F:F

    .line 14
    .line 15
    const/4 v1, 0x3

    .line 16
    iput v1, p0, Lcom/brentvatne/exoplayer/f;->G:I

    .line 17
    .line 18
    iput v0, p0, Lcom/brentvatne/exoplayer/f;->H:I

    .line 19
    .line 20
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    iput-wide v1, p0, Lcom/brentvatne/exoplayer/f;->I:J

    .line 26
    .line 27
    const v1, 0xc350

    .line 28
    .line 29
    .line 30
    iput v1, p0, Lcom/brentvatne/exoplayer/f;->J:I

    .line 31
    .line 32
    iput v1, p0, Lcom/brentvatne/exoplayer/f;->K:I

    .line 33
    .line 34
    const/16 v1, 0x9c4

    .line 35
    .line 36
    iput v1, p0, Lcom/brentvatne/exoplayer/f;->L:I

    .line 37
    .line 38
    const/16 v1, 0x1388

    .line 39
    .line 40
    iput v1, p0, Lcom/brentvatne/exoplayer/f;->M:I

    .line 41
    .line 42
    const/4 v1, 0x1

    .line 43
    iput-boolean v1, p0, Lcom/brentvatne/exoplayer/f;->c0:Z

    .line 44
    .line 45
    const/high16 v1, 0x437a0000    # 250.0f

    .line 46
    .line 47
    iput v1, p0, Lcom/brentvatne/exoplayer/f;->d0:F

    .line 48
    .line 49
    iput-boolean v0, p0, Lcom/brentvatne/exoplayer/f;->e0:Z

    .line 50
    .line 51
    iput-boolean v0, p0, Lcom/brentvatne/exoplayer/f;->g0:Z

    .line 52
    .line 53
    const/4 v0, 0x0

    .line 54
    iput-object v0, p0, Lcom/brentvatne/exoplayer/f;->h0:Ljava/util/UUID;

    .line 55
    .line 56
    iput-object v0, p0, Lcom/brentvatne/exoplayer/f;->i0:Ljava/lang/String;

    .line 57
    .line 58
    iput-object v0, p0, Lcom/brentvatne/exoplayer/f;->j0:[Ljava/lang/String;

    .line 59
    .line 60
    new-instance v0, Lcom/brentvatne/exoplayer/f$a;

    .line 61
    .line 62
    invoke-direct {v0, p0}, Lcom/brentvatne/exoplayer/f$a;-><init>(Lcom/brentvatne/exoplayer/f;)V

    .line 63
    .line 64
    .line 65
    iput-object v0, p0, Lcom/brentvatne/exoplayer/f;->o0:Landroid/os/Handler;

    .line 66
    .line 67
    iput-object p1, p0, Lcom/brentvatne/exoplayer/f;->l0:Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 68
    .line 69
    new-instance v0, Lcom/brentvatne/exoplayer/h;

    .line 70
    .line 71
    invoke-direct {v0, p1}, Lcom/brentvatne/exoplayer/h;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    .line 72
    .line 73
    .line 74
    iput-object v0, p0, Lcom/brentvatne/exoplayer/f;->k:Lcom/brentvatne/exoplayer/h;

    .line 75
    .line 76
    iput-object p2, p0, Lcom/brentvatne/exoplayer/f;->l:Lcom/brentvatne/exoplayer/e;

    .line 77
    .line 78
    invoke-interface {p2}, Lcom/brentvatne/exoplayer/e;->b()Le9/o;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    iput-object p2, p0, Lcom/brentvatne/exoplayer/f;->m:Le9/o;

    .line 83
    .line 84
    invoke-direct {p0}, Lcom/brentvatne/exoplayer/f;->g0()V

    .line 85
    .line 86
    .line 87
    const-string p2, "audio"

    .line 88
    .line 89
    invoke-virtual {p1, p2}, Lcom/facebook/react/bridge/ReactContext;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p2

    .line 93
    check-cast p2, Landroid/media/AudioManager;

    .line 94
    .line 95
    iput-object p2, p0, Lcom/brentvatne/exoplayer/f;->m0:Landroid/media/AudioManager;

    .line 96
    .line 97
    invoke-virtual {p1, p0}, Lcom/facebook/react/uimanager/ThemedReactContext;->addLifecycleEventListener(Lcom/facebook/react/bridge/LifecycleEventListener;)V

    .line 98
    .line 99
    .line 100
    new-instance p2, La3/a;

    .line 101
    .line 102
    invoke-direct {p2, p1}, La3/a;-><init>(Landroid/content/Context;)V

    .line 103
    .line 104
    .line 105
    iput-object p2, p0, Lcom/brentvatne/exoplayer/f;->n0:La3/a;

    .line 106
    .line 107
    return-void
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
.end method

.method static synthetic A(Lcom/brentvatne/exoplayer/f;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/brentvatne/exoplayer/f;->i0:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic B(Lcom/brentvatne/exoplayer/f;)[Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/brentvatne/exoplayer/f;->j0:[Ljava/lang/String;

    return-object p0
.end method

.method static synthetic C(Lcom/brentvatne/exoplayer/f;Ljava/util/UUID;Ljava/lang/String;[Ljava/lang/String;)Lk7/x;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/brentvatne/exoplayer/f;->X(Ljava/util/UUID;Ljava/lang/String;[Ljava/lang/String;)Lk7/x;

    move-result-object p0

    return-object p0
.end method

.method static synthetic D(Lcom/brentvatne/exoplayer/f;)Ljava/util/ArrayList;
    .locals 0

    invoke-direct {p0}, Lcom/brentvatne/exoplayer/f;->b0()Ljava/util/ArrayList;

    move-result-object p0

    return-object p0
.end method

.method static synthetic E(Lcom/brentvatne/exoplayer/f;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/brentvatne/exoplayer/f;->P:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic F(Lcom/brentvatne/exoplayer/f;Landroid/net/Uri;Ljava/lang/String;Lk7/x;)Li8/u;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/brentvatne/exoplayer/f;->Z(Landroid/net/Uri;Ljava/lang/String;Lk7/x;)Li8/u;

    move-result-object p0

    return-object p0
.end method

.method static synthetic G(Lcom/brentvatne/exoplayer/f;)I
    .locals 0

    iget p0, p0, Lcom/brentvatne/exoplayer/f;->v:I

    return p0
.end method

.method static synthetic H(Lcom/brentvatne/exoplayer/f;)J
    .locals 2

    iget-wide v0, p0, Lcom/brentvatne/exoplayer/f;->w:J

    return-wide v0
.end method

.method static synthetic I(Lcom/brentvatne/exoplayer/f;)V
    .locals 0

    invoke-direct {p0}, Lcom/brentvatne/exoplayer/f;->e1()V

    return-void
.end method

.method static synthetic J(Lcom/brentvatne/exoplayer/f;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/brentvatne/exoplayer/f;->x:Z

    return p1
.end method

.method static synthetic K(Lcom/brentvatne/exoplayer/f;)V
    .locals 0

    invoke-direct {p0}, Lcom/brentvatne/exoplayer/f;->o0()V

    return-void
.end method

.method static synthetic L(Lcom/brentvatne/exoplayer/f;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/brentvatne/exoplayer/f;->k0:Z

    return p0
.end method

.method private L0(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/brentvatne/exoplayer/f;->s:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    if-eqz p1, :cond_1

    .line 7
    .line 8
    invoke-direct {p0}, Lcom/brentvatne/exoplayer/f;->w0()Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    iput-boolean p1, p0, Lcom/brentvatne/exoplayer/f;->D:Z

    .line 13
    .line 14
    if-eqz p1, :cond_2

    .line 15
    .line 16
    iget-object p1, p0, Lcom/brentvatne/exoplayer/f;->s:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    invoke-virtual {p1, v0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->o(Z)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    const/4 p1, 0x0

    .line 24
    invoke-virtual {v0, p1}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->o(Z)V

    .line 25
    .line 26
    .line 27
    :cond_2
    :goto_0
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

.method static synthetic M(Lcom/brentvatne/exoplayer/f;)V
    .locals 0

    invoke-direct {p0}, Lcom/brentvatne/exoplayer/f;->V()V

    return-void
.end method

.method static synthetic N(Lcom/brentvatne/exoplayer/f;)Landroid/view/View;
    .locals 0

    iget-object p0, p0, Lcom/brentvatne/exoplayer/f;->o:Landroid/view/View;

    return-object p0
.end method

.method static synthetic O(Lcom/brentvatne/exoplayer/f;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/brentvatne/exoplayer/f;->t0(Landroid/view/View;)V

    return-void
.end method

.method static synthetic P(Lcom/brentvatne/exoplayer/f;)Lcom/google/android/exoplayer2/Player$a;
    .locals 0

    iget-object p0, p0, Lcom/brentvatne/exoplayer/f;->p:Lcom/google/android/exoplayer2/Player$a;

    return-object p0
.end method

.method static synthetic Q(Lcom/brentvatne/exoplayer/f;)Lb9/f;
    .locals 0

    iget-object p0, p0, Lcom/brentvatne/exoplayer/f;->t:Lb9/f;

    return-object p0
.end method

.method static synthetic R(Lcom/brentvatne/exoplayer/f;Lb9/f;)Lb9/f;
    .locals 0

    iput-object p1, p0, Lcom/brentvatne/exoplayer/f;->t:Lb9/f;

    return-object p1
.end method

.method static synthetic S(Lcom/brentvatne/exoplayer/f;)I
    .locals 0

    iget p0, p0, Lcom/brentvatne/exoplayer/f;->H:I

    return p0
.end method

.method static synthetic T(Lcom/brentvatne/exoplayer/f;)I
    .locals 0

    iget p0, p0, Lcom/brentvatne/exoplayer/f;->J:I

    return p0
.end method

.method private U()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/brentvatne/exoplayer/f;->s:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 7
    .line 8
    const/4 v1, -0x1

    .line 9
    invoke-direct {v0, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 10
    .line 11
    .line 12
    iget-object v2, p0, Lcom/brentvatne/exoplayer/f;->n:Lcom/google/android/exoplayer2/ui/PlayerControlView;

    .line 13
    .line 14
    invoke-virtual {v2, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 15
    .line 16
    .line 17
    iget-object v2, p0, Lcom/brentvatne/exoplayer/f;->n:Lcom/google/android/exoplayer2/ui/PlayerControlView;

    .line 18
    .line 19
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eq v2, v1, :cond_1

    .line 24
    .line 25
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->removeViewAt(I)V

    .line 26
    .line 27
    .line 28
    :cond_1
    iget-object v1, p0, Lcom/brentvatne/exoplayer/f;->n:Lcom/google/android/exoplayer2/ui/PlayerControlView;

    .line 29
    .line 30
    const/4 v2, 0x1

    .line 31
    invoke-virtual {p0, v1, v2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 32
    .line 33
    .line 34
    return-void
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
.end method

.method private V()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/brentvatne/exoplayer/f;->Q:Z

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/brentvatne/exoplayer/f;->Q0(Z)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lcom/brentvatne/exoplayer/f;->C:Z

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lcom/brentvatne/exoplayer/f;->I0(Z)V

    .line 9
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
.end method

.method private W(Z)Lcom/google/android/exoplayer2/upstream/DataSource$Factory;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/brentvatne/exoplayer/f;->l0:Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lcom/brentvatne/exoplayer/f;->m:Le9/o;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    :goto_0
    iget-object v1, p0, Lcom/brentvatne/exoplayer/f;->f0:Ljava/util/Map;

    .line 10
    .line 11
    invoke-static {v0, p1, v1}, Lcom/brentvatne/exoplayer/b;->c(Lcom/facebook/react/bridge/ReactContext;Le9/o;Ljava/util/Map;)Lcom/google/android/exoplayer2/upstream/DataSource$Factory;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
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

.method private X(Ljava/util/UUID;Ljava/lang/String;[Ljava/lang/String;)Lk7/x;
    .locals 7

    .line 1
    sget v0, Lg9/q0;->a:I

    .line 2
    .line 3
    const/16 v1, 0x12

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return-object p1

    .line 9
    :cond_0
    new-instance v3, Lk7/h0;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-direct {p0, v0}, Lcom/brentvatne/exoplayer/f;->Y(Z)Lcom/google/android/exoplayer2/upstream/f$c;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-direct {v3, p2, v1}, Lk7/h0;-><init>(Ljava/lang/String;Lcom/google/android/exoplayer2/upstream/f$c;)V

    .line 17
    .line 18
    .line 19
    if-eqz p3, :cond_1

    .line 20
    .line 21
    :goto_0
    array-length p2, p3

    .line 22
    add-int/lit8 p2, p2, -0x1

    .line 23
    .line 24
    if-ge v0, p2, :cond_1

    .line 25
    .line 26
    aget-object p2, p3, v0

    .line 27
    .line 28
    add-int/lit8 v1, v0, 0x1

    .line 29
    .line 30
    aget-object v1, p3, v1

    .line 31
    .line 32
    invoke-virtual {v3, p2, v1}, Lk7/h0;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    add-int/lit8 v0, v0, 0x2

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    new-instance p2, Lk7/i;

    .line 39
    .line 40
    invoke-static {p1}, Lk7/g0;->z(Ljava/util/UUID;)Lk7/g0;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    const/4 v4, 0x0

    .line 45
    const/4 v5, 0x0

    .line 46
    const/4 v6, 0x3

    .line 47
    move-object v0, p2

    .line 48
    move-object v1, p1

    .line 49
    invoke-direct/range {v0 .. v6}, Lk7/i;-><init>(Ljava/util/UUID;Lk7/c0;Lk7/j0;Ljava/util/HashMap;ZI)V

    .line 50
    .line 51
    .line 52
    return-object p2
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

.method private Y(Z)Lcom/google/android/exoplayer2/upstream/f$c;
    .locals 2

    iget-object v0, p0, Lcom/brentvatne/exoplayer/f;->l0:Lcom/facebook/react/uimanager/ThemedReactContext;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/brentvatne/exoplayer/f;->m:Le9/o;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iget-object v1, p0, Lcom/brentvatne/exoplayer/f;->f0:Ljava/util/Map;

    invoke-static {v0, p1, v1}, Lcom/brentvatne/exoplayer/b;->d(Lcom/facebook/react/bridge/ReactContext;Le9/o;Ljava/util/Map;)Lcom/google/android/exoplayer2/upstream/f$c;

    move-result-object p1

    return-object p1
.end method

.method private Z(Landroid/net/Uri;Ljava/lang/String;Lk7/x;)Li8/u;
    .locals 3

    .line 1
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    const-string v1, "."

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {p1}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    :goto_0
    invoke-static {p2}, Lg9/q0;->m0(Ljava/lang/String;)I

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    const/4 v0, 0x0

    .line 34
    if-eqz p2, :cond_4

    .line 35
    .line 36
    const/4 v1, 0x1

    .line 37
    if-eq p2, v1, :cond_3

    .line 38
    .line 39
    const/4 v0, 0x2

    .line 40
    if-eq p2, v0, :cond_2

    .line 41
    .line 42
    const/4 v0, 0x3

    .line 43
    if-ne p2, v0, :cond_1

    .line 44
    .line 45
    new-instance p2, Li8/k0$b;

    .line 46
    .line 47
    iget-object v0, p0, Lcom/brentvatne/exoplayer/f;->r:Lcom/google/android/exoplayer2/upstream/DataSource$Factory;

    .line 48
    .line 49
    invoke-direct {p2, v0}, Li8/k0$b;-><init>(Lcom/google/android/exoplayer2/upstream/DataSource$Factory;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p2, p3}, Li8/k0$b;->e(Lk7/x;)Li8/k0$b;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    iget-object p3, p0, Lcom/brentvatne/exoplayer/f;->l:Lcom/brentvatne/exoplayer/e;

    .line 57
    .line 58
    iget v0, p0, Lcom/brentvatne/exoplayer/f;->G:I

    .line 59
    .line 60
    invoke-interface {p3, v0}, Lcom/brentvatne/exoplayer/e;->a(I)Lcom/google/android/exoplayer2/upstream/g;

    .line 61
    .line 62
    .line 63
    move-result-object p3

    .line 64
    invoke-virtual {p2, p3}, Li8/k0$b;->g(Lcom/google/android/exoplayer2/upstream/g;)Li8/k0$b;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    invoke-virtual {p2, p1}, Li8/k0$b;->b(Landroid/net/Uri;)Li8/k0;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    return-object p1

    .line 73
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 74
    .line 75
    new-instance p3, Ljava/lang/StringBuilder;

    .line 76
    .line 77
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 78
    .line 79
    .line 80
    const-string v0, "Unsupported type: "

    .line 81
    .line 82
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p2

    .line 92
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    throw p1

    .line 96
    :cond_2
    new-instance p2, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;

    .line 97
    .line 98
    iget-object v0, p0, Lcom/brentvatne/exoplayer/f;->r:Lcom/google/android/exoplayer2/upstream/DataSource$Factory;

    .line 99
    .line 100
    invoke-direct {p2, v0}, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;-><init>(Lcom/google/android/exoplayer2/upstream/DataSource$Factory;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p2, p3}, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;->e(Lk7/x;)Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;

    .line 104
    .line 105
    .line 106
    move-result-object p2

    .line 107
    iget-object p3, p0, Lcom/brentvatne/exoplayer/f;->l:Lcom/brentvatne/exoplayer/e;

    .line 108
    .line 109
    iget v0, p0, Lcom/brentvatne/exoplayer/f;->G:I

    .line 110
    .line 111
    invoke-interface {p3, v0}, Lcom/brentvatne/exoplayer/e;->a(I)Lcom/google/android/exoplayer2/upstream/g;

    .line 112
    .line 113
    .line 114
    move-result-object p3

    .line 115
    invoke-virtual {p2, p3}, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;->g(Lcom/google/android/exoplayer2/upstream/g;)Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;

    .line 116
    .line 117
    .line 118
    move-result-object p2

    .line 119
    invoke-virtual {p2, p1}, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;->b(Landroid/net/Uri;)Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    return-object p1

    .line 124
    :cond_3
    new-instance p2, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource$Factory;

    .line 125
    .line 126
    new-instance v1, Lcom/google/android/exoplayer2/source/smoothstreaming/a$a;

    .line 127
    .line 128
    iget-object v2, p0, Lcom/brentvatne/exoplayer/f;->r:Lcom/google/android/exoplayer2/upstream/DataSource$Factory;

    .line 129
    .line 130
    invoke-direct {v1, v2}, Lcom/google/android/exoplayer2/source/smoothstreaming/a$a;-><init>(Lcom/google/android/exoplayer2/upstream/DataSource$Factory;)V

    .line 131
    .line 132
    .line 133
    invoke-direct {p0, v0}, Lcom/brentvatne/exoplayer/f;->W(Z)Lcom/google/android/exoplayer2/upstream/DataSource$Factory;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    invoke-direct {p2, v1, v0}, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource$Factory;-><init>(Lcom/google/android/exoplayer2/source/smoothstreaming/b$a;Lcom/google/android/exoplayer2/upstream/DataSource$Factory;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {p2, p3}, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource$Factory;->e(Lk7/x;)Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource$Factory;

    .line 141
    .line 142
    .line 143
    move-result-object p2

    .line 144
    iget-object p3, p0, Lcom/brentvatne/exoplayer/f;->l:Lcom/brentvatne/exoplayer/e;

    .line 145
    .line 146
    iget v0, p0, Lcom/brentvatne/exoplayer/f;->G:I

    .line 147
    .line 148
    invoke-interface {p3, v0}, Lcom/brentvatne/exoplayer/e;->a(I)Lcom/google/android/exoplayer2/upstream/g;

    .line 149
    .line 150
    .line 151
    move-result-object p3

    .line 152
    invoke-virtual {p2, p3}, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource$Factory;->g(Lcom/google/android/exoplayer2/upstream/g;)Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource$Factory;

    .line 153
    .line 154
    .line 155
    move-result-object p2

    .line 156
    invoke-virtual {p2, p1}, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource$Factory;->b(Landroid/net/Uri;)Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    return-object p1

    .line 161
    :cond_4
    new-instance p2, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$Factory;

    .line 162
    .line 163
    new-instance v1, Lcom/google/android/exoplayer2/source/dash/c$a;

    .line 164
    .line 165
    iget-object v2, p0, Lcom/brentvatne/exoplayer/f;->r:Lcom/google/android/exoplayer2/upstream/DataSource$Factory;

    .line 166
    .line 167
    invoke-direct {v1, v2}, Lcom/google/android/exoplayer2/source/dash/c$a;-><init>(Lcom/google/android/exoplayer2/upstream/DataSource$Factory;)V

    .line 168
    .line 169
    .line 170
    invoke-direct {p0, v0}, Lcom/brentvatne/exoplayer/f;->W(Z)Lcom/google/android/exoplayer2/upstream/DataSource$Factory;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    invoke-direct {p2, v1, v0}, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$Factory;-><init>(Lcom/google/android/exoplayer2/source/dash/a$a;Lcom/google/android/exoplayer2/upstream/DataSource$Factory;)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {p2, p3}, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$Factory;->e(Lk7/x;)Lcom/google/android/exoplayer2/source/dash/DashMediaSource$Factory;

    .line 178
    .line 179
    .line 180
    move-result-object p2

    .line 181
    iget-object p3, p0, Lcom/brentvatne/exoplayer/f;->l:Lcom/brentvatne/exoplayer/e;

    .line 182
    .line 183
    iget v0, p0, Lcom/brentvatne/exoplayer/f;->G:I

    .line 184
    .line 185
    invoke-interface {p3, v0}, Lcom/brentvatne/exoplayer/e;->a(I)Lcom/google/android/exoplayer2/upstream/g;

    .line 186
    .line 187
    .line 188
    move-result-object p3

    .line 189
    invoke-virtual {p2, p3}, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$Factory;->g(Lcom/google/android/exoplayer2/upstream/g;)Lcom/google/android/exoplayer2/source/dash/DashMediaSource$Factory;

    .line 190
    .line 191
    .line 192
    move-result-object p2

    .line 193
    invoke-virtual {p2, p1}, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$Factory;->b(Landroid/net/Uri;)Lcom/google/android/exoplayer2/source/dash/DashMediaSource;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    return-object p1
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
.end method

.method static synthetic a(Lcom/brentvatne/exoplayer/f;)Lcom/google/android/exoplayer2/SimpleExoPlayer;
    .locals 0

    iget-object p0, p0, Lcom/brentvatne/exoplayer/f;->s:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    return-object p0
.end method

.method private a0(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)Li8/u;
    .locals 2

    .line 1
    const/4 v0, -0x1

    .line 2
    invoke-static {p1, p3, v0, p4}, Le7/k;->e(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Le7/k;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    new-instance p3, Li8/t0$b;

    .line 7
    .line 8
    iget-object p4, p0, Lcom/brentvatne/exoplayer/f;->r:Lcom/google/android/exoplayer2/upstream/DataSource$Factory;

    .line 9
    .line 10
    invoke-direct {p3, p4}, Li8/t0$b;-><init>(Lcom/google/android/exoplayer2/upstream/DataSource$Factory;)V

    .line 11
    .line 12
    .line 13
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    invoke-virtual {p3, p2, p1, v0, v1}, Li8/t0$b;->a(Landroid/net/Uri;Le7/k;J)Li8/t0;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1
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
.end method

.method private b0()Ljava/util/ArrayList;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Li8/u;",
            ">;"
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
    iget-object v1, p0, Lcom/brentvatne/exoplayer/f;->a0:Lcom/facebook/react/bridge/ReadableArray;

    .line 7
    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    return-object v0

    .line 11
    :cond_0
    const/4 v1, 0x0

    .line 12
    :goto_0
    iget-object v2, p0, Lcom/brentvatne/exoplayer/f;->a0:Lcom/facebook/react/bridge/ReadableArray;

    .line 13
    .line 14
    invoke-interface {v2}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-ge v1, v2, :cond_3

    .line 19
    .line 20
    iget-object v2, p0, Lcom/brentvatne/exoplayer/f;->a0:Lcom/facebook/react/bridge/ReadableArray;

    .line 21
    .line 22
    invoke-interface {v2, v1}, Lcom/facebook/react/bridge/ReadableArray;->getMap(I)Lcom/facebook/react/bridge/ReadableMap;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    const-string v3, "language"

    .line 27
    .line 28
    invoke-interface {v2, v3}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    const-string v4, "title"

    .line 33
    .line 34
    invoke-interface {v2, v4}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    if-eqz v5, :cond_1

    .line 39
    .line 40
    invoke-interface {v2, v4}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    goto :goto_1

    .line 45
    :cond_1
    new-instance v4, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v5, " "

    .line 54
    .line 55
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    :goto_1
    const-string v5, "uri"

    .line 66
    .line 67
    invoke-interface {v2, v5}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    invoke-static {v5}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    const-string v6, "type"

    .line 76
    .line 77
    invoke-interface {v2, v6}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    invoke-direct {p0, v4, v5, v2, v3}, Lcom/brentvatne/exoplayer/f;->a0(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)Li8/u;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    if-eqz v2, :cond_2

    .line 86
    .line 87
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_3
    return-object v0
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
.end method

.method private b1()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/brentvatne/exoplayer/f;->s:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->P()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-eq v0, v1, :cond_1

    .line 11
    .line 12
    const/4 v2, 0x2

    .line 13
    if-eq v0, v2, :cond_0

    .line 14
    .line 15
    const/4 v2, 0x3

    .line 16
    if-eq v0, v2, :cond_0

    .line 17
    .line 18
    const/4 v1, 0x4

    .line 19
    if-eq v0, v1, :cond_1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-object v0, p0, Lcom/brentvatne/exoplayer/f;->s:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    .line 23
    .line 24
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->G()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_3

    .line 29
    .line 30
    invoke-direct {p0, v1}, Lcom/brentvatne/exoplayer/f;->L0(Z)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    invoke-direct {p0}, Lcom/brentvatne/exoplayer/f;->n0()V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    invoke-direct {p0}, Lcom/brentvatne/exoplayer/f;->n0()V

    .line 39
    .line 40
    .line 41
    :cond_3
    :goto_0
    iget-boolean v0, p0, Lcom/brentvatne/exoplayer/f;->b0:Z

    .line 42
    .line 43
    if-nez v0, :cond_4

    .line 44
    .line 45
    iget-boolean v0, p0, Lcom/brentvatne/exoplayer/f;->c0:Z

    .line 46
    .line 47
    invoke-virtual {p0, v0}, Landroid/view/View;->setKeepScreenOn(Z)V

    .line 48
    .line 49
    .line 50
    :cond_4
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
.end method

.method static synthetic c(Lcom/brentvatne/exoplayer/f;Lcom/google/android/exoplayer2/SimpleExoPlayer;)Lcom/google/android/exoplayer2/SimpleExoPlayer;
    .locals 0

    iput-object p1, p0, Lcom/brentvatne/exoplayer/f;->s:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    return-object p1
.end method

.method private c1()V
    .locals 2

    iget-object v0, p0, Lcom/brentvatne/exoplayer/f;->o0:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    return-void
.end method

.method static synthetic d(Lcom/brentvatne/exoplayer/f;)Lcom/brentvatne/exoplayer/h;
    .locals 0

    iget-object p0, p0, Lcom/brentvatne/exoplayer/f;->k:Lcom/brentvatne/exoplayer/h;

    return-object p0
.end method

.method private d0()V
    .locals 2

    iget-object v0, p0, Lcom/brentvatne/exoplayer/f;->o0:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    return-void
.end method

.method private d1()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/brentvatne/exoplayer/f;->r0()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/brentvatne/exoplayer/f;->u0()V

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
.end method

.method static synthetic e(Lcom/brentvatne/exoplayer/f;)I
    .locals 0

    iget p0, p0, Lcom/brentvatne/exoplayer/f;->K:I

    return p0
.end method

.method private e0()V
    .locals 2

    .line 1
    const/4 v0, -0x1

    .line 2
    iput v0, p0, Lcom/brentvatne/exoplayer/f;->v:I

    .line 3
    .line 4
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    iput-wide v0, p0, Lcom/brentvatne/exoplayer/f;->w:J

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
.end method

.method private e1()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/brentvatne/exoplayer/f;->s:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/brentvatne/exoplayer/f;->n:Lcom/google/android/exoplayer2/ui/PlayerControlView;

    .line 7
    .line 8
    invoke-direct {p0, v0}, Lcom/brentvatne/exoplayer/f;->t0(Landroid/view/View;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/brentvatne/exoplayer/f;->n:Lcom/google/android/exoplayer2/ui/PlayerControlView;

    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/ui/PlayerControlView;->J()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    iget-object v0, p0, Lcom/brentvatne/exoplayer/f;->n:Lcom/google/android/exoplayer2/ui/PlayerControlView;

    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/ui/PlayerControlView;->G()V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    iget-object v0, p0, Lcom/brentvatne/exoplayer/f;->n:Lcom/google/android/exoplayer2/ui/PlayerControlView;

    .line 26
    .line 27
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/ui/PlayerControlView;->P()V

    .line 28
    .line 29
    .line 30
    :goto_0
    return-void
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
.end method

.method static synthetic f(Lcom/brentvatne/exoplayer/f;)I
    .locals 0

    iget p0, p0, Lcom/brentvatne/exoplayer/f;->L:I

    return p0
.end method

.method private f1()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/brentvatne/exoplayer/f;->s:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->m()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iput v0, p0, Lcom/brentvatne/exoplayer/f;->v:I

    .line 8
    .line 9
    iget-object v0, p0, Lcom/brentvatne/exoplayer/f;->s:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/e;->h()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Lcom/brentvatne/exoplayer/f;->s:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->Y()J

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    const-wide/16 v2, 0x0

    .line 24
    .line 25
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    :goto_0
    iput-wide v0, p0, Lcom/brentvatne/exoplayer/f;->w:J

    .line 36
    .line 37
    return-void
    .line 38
    .line 39
.end method

.method static synthetic g(Lcom/brentvatne/exoplayer/f;)I
    .locals 0

    iget p0, p0, Lcom/brentvatne/exoplayer/f;->M:I

    return p0
.end method

.method private g0()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/brentvatne/exoplayer/f;->e0()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    invoke-direct {p0, v0}, Lcom/brentvatne/exoplayer/f;->W(Z)Lcom/google/android/exoplayer2/upstream/DataSource$Factory;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lcom/brentvatne/exoplayer/f;->r:Lcom/google/android/exoplayer2/upstream/DataSource$Factory;

    .line 10
    .line 11
    invoke-static {}, Ljava/net/CookieHandler;->getDefault()Ljava/net/CookieHandler;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sget-object v1, Lcom/brentvatne/exoplayer/f;->p0:Ljava/net/CookieManager;

    .line 16
    .line 17
    if-eq v0, v1, :cond_0

    .line 18
    .line 19
    invoke-static {v1}, Ljava/net/CookieHandler;->setDefault(Ljava/net/CookieHandler;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 23
    .line 24
    const/4 v1, -0x1

    .line 25
    invoke-direct {v0, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 26
    .line 27
    .line 28
    new-instance v1, Lcom/brentvatne/exoplayer/d;

    .line 29
    .line 30
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-direct {v1, v2}, Lcom/brentvatne/exoplayer/d;-><init>(Landroid/content/Context;)V

    .line 35
    .line 36
    .line 37
    iput-object v1, p0, Lcom/brentvatne/exoplayer/f;->q:Lcom/brentvatne/exoplayer/d;

    .line 38
    .line 39
    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 40
    .line 41
    .line 42
    iget-object v1, p0, Lcom/brentvatne/exoplayer/f;->q:Lcom/brentvatne/exoplayer/d;

    .line 43
    .line 44
    const/4 v2, 0x0

    .line 45
    invoke-virtual {p0, v1, v2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 46
    .line 47
    .line 48
    new-instance v0, Landroid/os/Handler;

    .line 49
    .line 50
    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    .line 51
    .line 52
    .line 53
    iput-object v0, p0, Lcom/brentvatne/exoplayer/f;->N:Landroid/os/Handler;

    .line 54
    .line 55
    return-void
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
.end method

.method private g1()V
    .locals 14

    .line 1
    iget-boolean v0, p0, Lcom/brentvatne/exoplayer/f;->x:Z

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Lcom/brentvatne/exoplayer/f;->x:Z

    .line 7
    .line 8
    iget-object v1, p0, Lcom/brentvatne/exoplayer/f;->R:Ljava/lang/String;

    .line 9
    .line 10
    iget-object v2, p0, Lcom/brentvatne/exoplayer/f;->S:Lcom/facebook/react/bridge/Dynamic;

    .line 11
    .line 12
    invoke-virtual {p0, v1, v2}, Lcom/brentvatne/exoplayer/f;->T0(Ljava/lang/String;Lcom/facebook/react/bridge/Dynamic;)V

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, Lcom/brentvatne/exoplayer/f;->T:Ljava/lang/String;

    .line 16
    .line 17
    iget-object v2, p0, Lcom/brentvatne/exoplayer/f;->U:Lcom/facebook/react/bridge/Dynamic;

    .line 18
    .line 19
    invoke-virtual {p0, v1, v2}, Lcom/brentvatne/exoplayer/f;->W0(Ljava/lang/String;Lcom/facebook/react/bridge/Dynamic;)V

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Lcom/brentvatne/exoplayer/f;->V:Ljava/lang/String;

    .line 23
    .line 24
    iget-object v2, p0, Lcom/brentvatne/exoplayer/f;->W:Lcom/facebook/react/bridge/Dynamic;

    .line 25
    .line 26
    invoke-virtual {p0, v1, v2}, Lcom/brentvatne/exoplayer/f;->U0(Ljava/lang/String;Lcom/facebook/react/bridge/Dynamic;)V

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, Lcom/brentvatne/exoplayer/f;->s:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    .line 30
    .line 31
    invoke-virtual {v1}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->L0()Le7/k;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    iget v2, v1, Le7/k;->A:I

    .line 38
    .line 39
    move v8, v2

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    move v8, v0

    .line 42
    :goto_0
    if-eqz v1, :cond_1

    .line 43
    .line 44
    iget v0, v1, Le7/k;->B:I

    .line 45
    .line 46
    :cond_1
    move v9, v0

    .line 47
    if-eqz v1, :cond_2

    .line 48
    .line 49
    iget-object v0, v1, Le7/k;->k:Ljava/lang/String;

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_2
    const-string v0, "-1"

    .line 53
    .line 54
    :goto_1
    move-object v13, v0

    .line 55
    iget-object v3, p0, Lcom/brentvatne/exoplayer/f;->k:Lcom/brentvatne/exoplayer/h;

    .line 56
    .line 57
    iget-object v0, p0, Lcom/brentvatne/exoplayer/f;->s:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    .line 58
    .line 59
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->getDuration()J

    .line 60
    .line 61
    .line 62
    move-result-wide v0

    .line 63
    long-to-double v4, v0

    .line 64
    iget-object v0, p0, Lcom/brentvatne/exoplayer/f;->s:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    .line 65
    .line 66
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->Y()J

    .line 67
    .line 68
    .line 69
    move-result-wide v0

    .line 70
    long-to-double v6, v0

    .line 71
    invoke-direct {p0}, Lcom/brentvatne/exoplayer/f;->h0()Lcom/facebook/react/bridge/WritableArray;

    .line 72
    .line 73
    .line 74
    move-result-object v10

    .line 75
    invoke-direct {p0}, Lcom/brentvatne/exoplayer/f;->k0()Lcom/facebook/react/bridge/WritableArray;

    .line 76
    .line 77
    .line 78
    move-result-object v11

    .line 79
    invoke-direct {p0}, Lcom/brentvatne/exoplayer/f;->m0()Lcom/facebook/react/bridge/WritableArray;

    .line 80
    .line 81
    .line 82
    move-result-object v12

    .line 83
    invoke-virtual/range {v3 .. v13}, Lcom/brentvatne/exoplayer/h;->l(DDIILcom/facebook/react/bridge/WritableArray;Lcom/facebook/react/bridge/WritableArray;Lcom/facebook/react/bridge/WritableArray;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    :cond_3
    return-void
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
.end method

.method static synthetic h(Lcom/brentvatne/exoplayer/f;)Le9/o;
    .locals 0

    iget-object p0, p0, Lcom/brentvatne/exoplayer/f;->m:Le9/o;

    return-object p0
.end method

.method private h0()Lcom/facebook/react/bridge/WritableArray;
    .locals 11

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createArray()Lcom/facebook/react/bridge/WritableArray;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/brentvatne/exoplayer/f;->t:Lb9/f;

    .line 6
    .line 7
    invoke-virtual {v1}, Lb9/j;->g()Lb9/j$a;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const/4 v2, 0x1

    .line 12
    invoke-virtual {p0, v2}, Lcom/brentvatne/exoplayer/f;->l0(I)I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    if-eqz v1, :cond_4

    .line 17
    .line 18
    const/4 v4, -0x1

    .line 19
    if-ne v3, v4, :cond_0

    .line 20
    .line 21
    goto :goto_4

    .line 22
    :cond_0
    invoke-virtual {v1, v3}, Lb9/j$a;->e(I)Lcom/google/android/exoplayer2/source/TrackGroupArray;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    const/4 v3, 0x0

    .line 27
    move v5, v3

    .line 28
    :goto_0
    iget v6, v1, Lcom/google/android/exoplayer2/source/TrackGroupArray;->k:I

    .line 29
    .line 30
    if-ge v5, v6, :cond_4

    .line 31
    .line 32
    invoke-virtual {v1, v5}, Lcom/google/android/exoplayer2/source/TrackGroupArray;->a(I)Li8/u0;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    invoke-virtual {v6, v3}, Li8/u0;->a(I)Le7/k;

    .line 37
    .line 38
    .line 39
    move-result-object v6

    .line 40
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 41
    .line 42
    .line 43
    move-result-object v7

    .line 44
    const-string v8, "index"

    .line 45
    .line 46
    invoke-interface {v7, v8, v5}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    iget-object v8, v6, Le7/k;->k:Ljava/lang/String;

    .line 50
    .line 51
    const-string v9, ""

    .line 52
    .line 53
    if-eqz v8, :cond_1

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    move-object v8, v9

    .line 57
    :goto_1
    const-string v10, "title"

    .line 58
    .line 59
    invoke-interface {v7, v10, v8}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    const-string v8, "type"

    .line 63
    .line 64
    iget-object v10, v6, Le7/k;->v:Ljava/lang/String;

    .line 65
    .line 66
    invoke-interface {v7, v8, v10}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    iget-object v8, v6, Le7/k;->m:Ljava/lang/String;

    .line 70
    .line 71
    if-eqz v8, :cond_2

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_2
    move-object v8, v9

    .line 75
    :goto_2
    const-string v10, "language"

    .line 76
    .line 77
    invoke-interface {v7, v10, v8}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    iget v6, v6, Le7/k;->r:I

    .line 81
    .line 82
    if-ne v6, v4, :cond_3

    .line 83
    .line 84
    goto :goto_3

    .line 85
    :cond_3
    sget-object v8, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 86
    .line 87
    new-array v9, v2, [Ljava/lang/Object;

    .line 88
    .line 89
    int-to-float v6, v6

    .line 90
    const v10, 0x49742400    # 1000000.0f

    .line 91
    .line 92
    .line 93
    div-float/2addr v6, v10

    .line 94
    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 95
    .line 96
    .line 97
    move-result-object v6

    .line 98
    aput-object v6, v9, v3

    .line 99
    .line 100
    const-string v6, "%.2fMbps"

    .line 101
    .line 102
    invoke-static {v8, v6, v9}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v9

    .line 106
    :goto_3
    const-string v6, "bitrate"

    .line 107
    .line 108
    invoke-interface {v7, v6, v9}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    invoke-interface {v0, v7}, Lcom/facebook/react/bridge/WritableArray;->pushMap(Lcom/facebook/react/bridge/ReadableMap;)V

    .line 112
    .line 113
    .line 114
    add-int/lit8 v5, v5, 0x1

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_4
    :goto_4
    return-object v0
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
.end method

.method private i0(Lcom/google/android/exoplayer2/source/TrackGroupArray;)I
    .locals 6

    .line 1
    iget v0, p1, Lcom/google/android/exoplayer2/source/TrackGroupArray;->k:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p1, -0x1

    .line 6
    return p1

    .line 7
    :cond_0
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v1}, Ljava/util/Locale;->getISO3Language()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const/4 v2, 0x0

    .line 24
    move v3, v2

    .line 25
    :goto_0
    iget v4, p1, Lcom/google/android/exoplayer2/source/TrackGroupArray;->k:I

    .line 26
    .line 27
    if-ge v3, v4, :cond_3

    .line 28
    .line 29
    invoke-virtual {p1, v3}, Lcom/google/android/exoplayer2/source/TrackGroupArray;->a(I)Li8/u0;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    invoke-virtual {v4, v2}, Li8/u0;->a(I)Le7/k;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    iget-object v4, v4, Le7/k;->m:Ljava/lang/String;

    .line 38
    .line 39
    if-eqz v4, :cond_2

    .line 40
    .line 41
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    if-nez v5, :cond_1

    .line 46
    .line 47
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    if-eqz v4, :cond_2

    .line 52
    .line 53
    :cond_1
    move v2, v3

    .line 54
    goto :goto_1

    .line 55
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_3
    :goto_1
    return v2
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
.end method

.method static synthetic j(Lcom/brentvatne/exoplayer/f;)Lcom/brentvatne/exoplayer/d;
    .locals 0

    iget-object p0, p0, Lcom/brentvatne/exoplayer/f;->q:Lcom/brentvatne/exoplayer/d;

    return-object p0
.end method

.method static synthetic k(Lcom/brentvatne/exoplayer/f;)La3/a;
    .locals 0

    iget-object p0, p0, Lcom/brentvatne/exoplayer/f;->n0:La3/a;

    return-object p0
.end method

.method private k0()Lcom/facebook/react/bridge/WritableArray;
    .locals 9

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createArray()Lcom/facebook/react/bridge/WritableArray;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/brentvatne/exoplayer/f;->t:Lb9/f;

    .line 6
    .line 7
    invoke-virtual {v1}, Lb9/j;->g()Lb9/j$a;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const/4 v2, 0x3

    .line 12
    invoke-virtual {p0, v2}, Lcom/brentvatne/exoplayer/f;->l0(I)I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v1, :cond_3

    .line 17
    .line 18
    const/4 v3, -0x1

    .line 19
    if-ne v2, v3, :cond_0

    .line 20
    .line 21
    goto :goto_2

    .line 22
    :cond_0
    invoke-virtual {v1, v2}, Lb9/j$a;->e(I)Lcom/google/android/exoplayer2/source/TrackGroupArray;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    const/4 v2, 0x0

    .line 27
    move v3, v2

    .line 28
    :goto_0
    iget v4, v1, Lcom/google/android/exoplayer2/source/TrackGroupArray;->k:I

    .line 29
    .line 30
    if-ge v3, v4, :cond_3

    .line 31
    .line 32
    invoke-virtual {v1, v3}, Lcom/google/android/exoplayer2/source/TrackGroupArray;->a(I)Li8/u0;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    invoke-virtual {v4, v2}, Li8/u0;->a(I)Le7/k;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    const-string v6, "index"

    .line 45
    .line 46
    invoke-interface {v5, v6, v3}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    iget-object v6, v4, Le7/k;->k:Ljava/lang/String;

    .line 50
    .line 51
    const-string v7, ""

    .line 52
    .line 53
    if-eqz v6, :cond_1

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    move-object v6, v7

    .line 57
    :goto_1
    const-string v8, "title"

    .line 58
    .line 59
    invoke-interface {v5, v8, v6}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    const-string v6, "type"

    .line 63
    .line 64
    iget-object v8, v4, Le7/k;->v:Ljava/lang/String;

    .line 65
    .line 66
    invoke-interface {v5, v6, v8}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    iget-object v4, v4, Le7/k;->m:Ljava/lang/String;

    .line 70
    .line 71
    if-eqz v4, :cond_2

    .line 72
    .line 73
    move-object v7, v4

    .line 74
    :cond_2
    const-string v4, "language"

    .line 75
    .line 76
    invoke-interface {v5, v4, v7}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    invoke-interface {v0, v5}, Lcom/facebook/react/bridge/WritableArray;->pushMap(Lcom/facebook/react/bridge/ReadableMap;)V

    .line 80
    .line 81
    .line 82
    add-int/lit8 v3, v3, 0x1

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_3
    :goto_2
    return-object v0
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
.end method

.method static synthetic l(Lcom/brentvatne/exoplayer/f;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/brentvatne/exoplayer/f;->A:Z

    return p0
.end method

.method private m0()Lcom/facebook/react/bridge/WritableArray;
    .locals 11

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createArray()Lcom/facebook/react/bridge/WritableArray;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/brentvatne/exoplayer/f;->t:Lb9/f;

    .line 6
    .line 7
    invoke-virtual {v1}, Lb9/j;->g()Lb9/j$a;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const/4 v2, 0x2

    .line 12
    invoke-virtual {p0, v2}, Lcom/brentvatne/exoplayer/f;->l0(I)I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v1, :cond_7

    .line 17
    .line 18
    const/4 v3, -0x1

    .line 19
    if-ne v2, v3, :cond_0

    .line 20
    .line 21
    goto :goto_3

    .line 22
    :cond_0
    invoke-virtual {v1, v2}, Lb9/j$a;->e(I)Lcom/google/android/exoplayer2/source/TrackGroupArray;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    const/4 v2, 0x0

    .line 27
    move v4, v2

    .line 28
    :goto_0
    iget v5, v1, Lcom/google/android/exoplayer2/source/TrackGroupArray;->k:I

    .line 29
    .line 30
    if-ge v4, v5, :cond_7

    .line 31
    .line 32
    invoke-virtual {v1, v4}, Lcom/google/android/exoplayer2/source/TrackGroupArray;->a(I)Li8/u0;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    move v6, v2

    .line 37
    :goto_1
    iget v7, v5, Li8/u0;->k:I

    .line 38
    .line 39
    if-ge v6, v7, :cond_6

    .line 40
    .line 41
    invoke-virtual {v5, v6}, Li8/u0;->a(I)Le7/k;

    .line 42
    .line 43
    .line 44
    move-result-object v7

    .line 45
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 46
    .line 47
    .line 48
    move-result-object v8

    .line 49
    iget v9, v7, Le7/k;->A:I

    .line 50
    .line 51
    if-ne v9, v3, :cond_1

    .line 52
    .line 53
    move v9, v2

    .line 54
    :cond_1
    const-string v10, "width"

    .line 55
    .line 56
    invoke-interface {v8, v10, v9}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    .line 57
    .line 58
    .line 59
    iget v9, v7, Le7/k;->B:I

    .line 60
    .line 61
    if-ne v9, v3, :cond_2

    .line 62
    .line 63
    move v9, v2

    .line 64
    :cond_2
    const-string v10, "height"

    .line 65
    .line 66
    invoke-interface {v8, v10, v9}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    .line 67
    .line 68
    .line 69
    iget v9, v7, Le7/k;->r:I

    .line 70
    .line 71
    if-ne v9, v3, :cond_3

    .line 72
    .line 73
    move v9, v2

    .line 74
    :cond_3
    const-string v10, "bitrate"

    .line 75
    .line 76
    invoke-interface {v8, v10, v9}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    .line 77
    .line 78
    .line 79
    iget-object v9, v7, Le7/k;->s:Ljava/lang/String;

    .line 80
    .line 81
    if-eqz v9, :cond_4

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_4
    const-string v9, ""

    .line 85
    .line 86
    :goto_2
    const-string v10, "codecs"

    .line 87
    .line 88
    invoke-interface {v8, v10, v9}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    iget-object v7, v7, Le7/k;->k:Ljava/lang/String;

    .line 92
    .line 93
    if-nez v7, :cond_5

    .line 94
    .line 95
    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v7

    .line 99
    :cond_5
    const-string v9, "trackId"

    .line 100
    .line 101
    invoke-interface {v8, v9, v7}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    invoke-interface {v0, v8}, Lcom/facebook/react/bridge/WritableArray;->pushMap(Lcom/facebook/react/bridge/ReadableMap;)V

    .line 105
    .line 106
    .line 107
    add-int/lit8 v6, v6, 0x1

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_6
    add-int/lit8 v4, v4, 0x1

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_7
    :goto_3
    return-object v0
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
.end method

.method private n0()V
    .locals 4

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v1, Lcom/brentvatne/exoplayer/f$f;

    invoke-direct {v1, p0, p0}, Lcom/brentvatne/exoplayer/f$f;-><init>(Lcom/brentvatne/exoplayer/f;Lcom/brentvatne/exoplayer/f;)V

    const-wide/16 v2, 0x1

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method static synthetic o(Lcom/brentvatne/exoplayer/f;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/brentvatne/exoplayer/f;->L0(Z)V

    return-void
.end method

.method private o0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/brentvatne/exoplayer/f;->n:Lcom/google/android/exoplayer2/ui/PlayerControlView;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/google/android/exoplayer2/ui/PlayerControlView;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, v1}, Lcom/google/android/exoplayer2/ui/PlayerControlView;-><init>(Landroid/content/Context;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lcom/brentvatne/exoplayer/f;->n:Lcom/google/android/exoplayer2/ui/PlayerControlView;

    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Lcom/brentvatne/exoplayer/f;->n:Lcom/google/android/exoplayer2/ui/PlayerControlView;

    .line 17
    .line 18
    iget-object v1, p0, Lcom/brentvatne/exoplayer/f;->s:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Lcom/google/android/exoplayer2/ui/PlayerControlView;->setPlayer(Lcom/google/android/exoplayer2/Player;)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lcom/brentvatne/exoplayer/f;->n:Lcom/google/android/exoplayer2/ui/PlayerControlView;

    .line 24
    .line 25
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/ui/PlayerControlView;->P()V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lcom/brentvatne/exoplayer/f;->n:Lcom/google/android/exoplayer2/ui/PlayerControlView;

    .line 29
    .line 30
    sget v1, Lz2/a;->c:I

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iput-object v0, p0, Lcom/brentvatne/exoplayer/f;->o:Landroid/view/View;

    .line 37
    .line 38
    iget-object v0, p0, Lcom/brentvatne/exoplayer/f;->q:Lcom/brentvatne/exoplayer/d;

    .line 39
    .line 40
    new-instance v1, Lcom/brentvatne/exoplayer/f$b;

    .line 41
    .line 42
    invoke-direct {v1, p0}, Lcom/brentvatne/exoplayer/f$b;-><init>(Lcom/brentvatne/exoplayer/f;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 46
    .line 47
    .line 48
    iget-object v0, p0, Lcom/brentvatne/exoplayer/f;->n:Lcom/google/android/exoplayer2/ui/PlayerControlView;

    .line 49
    .line 50
    sget v1, Lz2/a;->b:I

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    check-cast v0, Landroid/widget/ImageButton;

    .line 57
    .line 58
    new-instance v1, Lcom/brentvatne/exoplayer/f$c;

    .line 59
    .line 60
    invoke-direct {v1, p0}, Lcom/brentvatne/exoplayer/f$c;-><init>(Lcom/brentvatne/exoplayer/f;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 64
    .line 65
    .line 66
    iget-object v0, p0, Lcom/brentvatne/exoplayer/f;->n:Lcom/google/android/exoplayer2/ui/PlayerControlView;

    .line 67
    .line 68
    sget v1, Lz2/a;->a:I

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    check-cast v0, Landroid/widget/ImageButton;

    .line 75
    .line 76
    new-instance v1, Lcom/brentvatne/exoplayer/f$d;

    .line 77
    .line 78
    invoke-direct {v1, p0}, Lcom/brentvatne/exoplayer/f$d;-><init>(Lcom/brentvatne/exoplayer/f;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 82
    .line 83
    .line 84
    new-instance v0, Lcom/brentvatne/exoplayer/f$e;

    .line 85
    .line 86
    invoke-direct {v0, p0}, Lcom/brentvatne/exoplayer/f$e;-><init>(Lcom/brentvatne/exoplayer/f;)V

    .line 87
    .line 88
    .line 89
    iput-object v0, p0, Lcom/brentvatne/exoplayer/f;->p:Lcom/google/android/exoplayer2/Player$a;

    .line 90
    .line 91
    iget-object v1, p0, Lcom/brentvatne/exoplayer/f;->s:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    .line 92
    .line 93
    invoke-virtual {v1, v0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->K(Lcom/google/android/exoplayer2/Player$a;)V

    .line 94
    .line 95
    .line 96
    return-void
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
.end method

.method private static p0(Lcom/google/android/exoplayer2/ExoPlaybackException;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "ExoPlayer Exception"

    .line 6
    .line 7
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 8
    .line 9
    .line 10
    iget v0, p0, Lcom/google/android/exoplayer2/ExoPlaybackException;->k:I

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    return v1

    .line 16
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/ExoPlaybackException;->h()Ljava/io/IOException;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    :goto_0
    if-eqz p0, :cond_3

    .line 21
    .line 22
    instance-of v0, p0, Li8/b;

    .line 23
    .line 24
    if-nez v0, :cond_2

    .line 25
    .line 26
    instance-of v0, p0, Lcom/google/android/exoplayer2/upstream/f$d;

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    goto :goto_0

    .line 36
    :cond_2
    :goto_1
    const/4 p0, 0x1

    .line 37
    return p0

    .line 38
    :cond_3
    return v1
    .line 39
    .line 40
.end method

.method static synthetic q(Lcom/brentvatne/exoplayer/f;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/brentvatne/exoplayer/f;->u:Z

    return p0
.end method

.method private q0(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/brentvatne/exoplayer/f;->B:Z

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iput-boolean p1, p0, Lcom/brentvatne/exoplayer/f;->B:Z

    .line 7
    .line 8
    if-eqz p1, :cond_1

    .line 9
    .line 10
    iget-object p1, p0, Lcom/brentvatne/exoplayer/f;->k:Lcom/brentvatne/exoplayer/h;

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    invoke-virtual {p1, v0}, Lcom/brentvatne/exoplayer/h;->d(Z)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    iget-object p1, p0, Lcom/brentvatne/exoplayer/f;->k:Lcom/brentvatne/exoplayer/h;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    invoke-virtual {p1, v0}, Lcom/brentvatne/exoplayer/h;->d(Z)V

    .line 21
    .line 22
    .line 23
    :goto_0
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

.method static synthetic r(Lcom/brentvatne/exoplayer/f;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/brentvatne/exoplayer/f;->u:Z

    return p1
.end method

.method private r0()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/brentvatne/exoplayer/f;->y:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-virtual {p0, v0}, Lcom/brentvatne/exoplayer/f;->E0(Z)V

    .line 7
    .line 8
    .line 9
    :cond_0
    iget-object v0, p0, Lcom/brentvatne/exoplayer/f;->m0:Landroid/media/AudioManager;

    .line 10
    .line 11
    invoke-virtual {v0, p0}, Landroid/media/AudioManager;->abandonAudioFocus(Landroid/media/AudioManager$OnAudioFocusChangeListener;)I

    .line 12
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
.end method

.method private s0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/brentvatne/exoplayer/f;->s:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->G()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-direct {p0, v1}, Lcom/brentvatne/exoplayer/f;->L0(Z)V

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-virtual {p0, v1}, Landroid/view/View;->setKeepScreenOn(Z)V

    .line 16
    .line 17
    .line 18
    return-void
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
.end method

.method private t0(Landroid/view/View;)V
    .locals 4

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/high16 v1, 0x40000000    # 2.0f

    .line 9
    .line 10
    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    invoke-static {v2, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    invoke-virtual {p1, v0, v1}, Landroid/view/View;->measure(II)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/view/View;->layout(IIII)V

    .line 42
    .line 43
    .line 44
    return-void
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
.end method

.method static synthetic u(Lcom/brentvatne/exoplayer/f;)F
    .locals 0

    iget p0, p0, Lcom/brentvatne/exoplayer/f;->E:F

    return p0
.end method

.method private u0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/brentvatne/exoplayer/f;->s:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/brentvatne/exoplayer/f;->f1()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/brentvatne/exoplayer/f;->s:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->R0()V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lcom/brentvatne/exoplayer/f;->s:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    .line 14
    .line 15
    invoke-virtual {v0, p0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->S0(Lz7/f;)V

    .line 16
    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    iput-object v0, p0, Lcom/brentvatne/exoplayer/f;->t:Lb9/f;

    .line 20
    .line 21
    iput-object v0, p0, Lcom/brentvatne/exoplayer/f;->s:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    .line 22
    .line 23
    :cond_0
    iget-object v0, p0, Lcom/brentvatne/exoplayer/f;->o0:Landroid/os/Handler;

    .line 24
    .line 25
    const/4 v1, 0x1

    .line 26
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lcom/brentvatne/exoplayer/f;->l0:Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 30
    .line 31
    invoke-virtual {v0, p0}, Lcom/facebook/react/uimanager/ThemedReactContext;->removeLifecycleEventListener(Lcom/facebook/react/bridge/LifecycleEventListener;)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lcom/brentvatne/exoplayer/f;->n0:La3/a;

    .line 35
    .line 36
    invoke-virtual {v0}, La3/a;->a()V

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, Lcom/brentvatne/exoplayer/f;->m:Le9/o;

    .line 40
    .line 41
    invoke-virtual {v0, p0}, Le9/o;->a(Le9/e$a;)V

    .line 42
    .line 43
    .line 44
    return-void
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
.end method

.method private v0()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/brentvatne/exoplayer/f;->u:Z

    .line 3
    .line 4
    invoke-direct {p0}, Lcom/brentvatne/exoplayer/f;->n0()V

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
.end method

.method static synthetic w(Lcom/brentvatne/exoplayer/f;)F
    .locals 0

    iget p0, p0, Lcom/brentvatne/exoplayer/f;->d0:F

    return p0
.end method

.method private w0()Z
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/brentvatne/exoplayer/f;->b0:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez v0, :cond_2

    .line 5
    .line 6
    iget-object v0, p0, Lcom/brentvatne/exoplayer/f;->O:Landroid/net/Uri;

    .line 7
    .line 8
    if-eqz v0, :cond_2

    .line 9
    .line 10
    iget-boolean v0, p0, Lcom/brentvatne/exoplayer/f;->D:Z

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-object v0, p0, Lcom/brentvatne/exoplayer/f;->m0:Landroid/media/AudioManager;

    .line 16
    .line 17
    const/4 v2, 0x3

    .line 18
    invoke-virtual {v0, p0, v2, v1}, Landroid/media/AudioManager;->requestAudioFocus(Landroid/media/AudioManager$OnAudioFocusChangeListener;II)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-ne v0, v1, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    const/4 v1, 0x0

    .line 26
    :cond_2
    :goto_0
    return v1
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
.end method

.method static synthetic x(Lcom/brentvatne/exoplayer/f;)Landroid/net/Uri;
    .locals 0

    iget-object p0, p0, Lcom/brentvatne/exoplayer/f;->O:Landroid/net/Uri;

    return-object p0
.end method

.method static synthetic y(Lcom/brentvatne/exoplayer/f;)Ljava/util/UUID;
    .locals 0

    iget-object p0, p0, Lcom/brentvatne/exoplayer/f;->h0:Ljava/util/UUID;

    return-object p0
.end method


# virtual methods
.method public A0(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/brentvatne/exoplayer/f;->b0:Z

    return-void
.end method

.method public B0([Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/brentvatne/exoplayer/f;->j0:[Ljava/lang/String;

    return-void
.end method

.method public C0(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/brentvatne/exoplayer/f;->i0:Ljava/lang/String;

    return-void
.end method

.method public D0(Ljava/util/UUID;)V
    .locals 0

    iput-object p1, p0, Lcom/brentvatne/exoplayer/f;->h0:Ljava/util/UUID;

    return-void
.end method

.method public E0(Z)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/brentvatne/exoplayer/f;->y:Z

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iput-boolean p1, p0, Lcom/brentvatne/exoplayer/f;->y:Z

    .line 7
    .line 8
    iget-object p1, p0, Lcom/brentvatne/exoplayer/f;->l0:Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/facebook/react/uimanager/ThemedReactContext;->getCurrentActivity()Landroid/app/Activity;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    if-nez p1, :cond_1

    .line 15
    .line 16
    return-void

    .line 17
    :cond_1
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iget-boolean v0, p0, Lcom/brentvatne/exoplayer/f;->y:Z

    .line 26
    .line 27
    if-eqz v0, :cond_3

    .line 28
    .line 29
    sget v0, Lg9/q0;->a:I

    .line 30
    .line 31
    const/16 v1, 0x13

    .line 32
    .line 33
    if-lt v0, v1, :cond_2

    .line 34
    .line 35
    const/16 v0, 0x1006

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    const/4 v0, 0x6

    .line 39
    :goto_0
    iget-object v1, p0, Lcom/brentvatne/exoplayer/f;->k:Lcom/brentvatne/exoplayer/h;

    .line 40
    .line 41
    invoke-virtual {v1}, Lcom/brentvatne/exoplayer/h;->j()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, v0}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 45
    .line 46
    .line 47
    iget-object p1, p0, Lcom/brentvatne/exoplayer/f;->k:Lcom/brentvatne/exoplayer/h;

    .line 48
    .line 49
    invoke-virtual {p1}, Lcom/brentvatne/exoplayer/h;->h()V

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_3
    iget-object v0, p0, Lcom/brentvatne/exoplayer/f;->k:Lcom/brentvatne/exoplayer/h;

    .line 54
    .line 55
    invoke-virtual {v0}, Lcom/brentvatne/exoplayer/h;->i()V

    .line 56
    .line 57
    .line 58
    const/4 v0, 0x0

    .line 59
    invoke-virtual {p1, v0}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 60
    .line 61
    .line 62
    iget-object p1, p0, Lcom/brentvatne/exoplayer/f;->k:Lcom/brentvatne/exoplayer/h;

    .line 63
    .line 64
    invoke-virtual {p1}, Lcom/brentvatne/exoplayer/h;->g()V

    .line 65
    .line 66
    .line 67
    :goto_1
    return-void
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
.end method

.method public F0(Z)V
    .locals 1

    iget-object v0, p0, Lcom/brentvatne/exoplayer/f;->q:Lcom/brentvatne/exoplayer/d;

    invoke-virtual {v0, p1}, Lcom/brentvatne/exoplayer/d;->setHideShutterView(Z)V

    return-void
.end method

.method public G0(I)V
    .locals 2

    .line 1
    iput p1, p0, Lcom/brentvatne/exoplayer/f;->H:I

    .line 2
    .line 3
    iget-object p1, p0, Lcom/brentvatne/exoplayer/f;->s:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    .line 4
    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    iget-object p1, p0, Lcom/brentvatne/exoplayer/f;->t:Lb9/f;

    .line 8
    .line 9
    invoke-virtual {p1}, Lb9/f;->o()Lb9/f$e;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget v1, p0, Lcom/brentvatne/exoplayer/f;->H:I

    .line 14
    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    const v1, 0x7fffffff

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-virtual {v0, v1}, Lb9/f$e;->g(I)Lb9/f$e;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {p1, v0}, Lb9/f;->N(Lb9/f$e;)V

    .line 25
    .line 26
    .line 27
    :cond_1
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

.method public H0(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/brentvatne/exoplayer/f;->G:I

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/brentvatne/exoplayer/f;->u0()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/brentvatne/exoplayer/f;->n0()V

    .line 7
    .line 8
    .line 9
    return-void
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

.method public I0(Z)V
    .locals 1

    .line 1
    iput-boolean p1, p0, Lcom/brentvatne/exoplayer/f;->C:Z

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/high16 p1, 0x3f800000    # 1.0f

    .line 8
    .line 9
    :goto_0
    iput p1, p0, Lcom/brentvatne/exoplayer/f;->F:F

    .line 10
    .line 11
    iget-object v0, p0, Lcom/brentvatne/exoplayer/f;->s:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->d1(F)V

    .line 16
    .line 17
    .line 18
    :cond_1
    return-void
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

.method public J0(Z)V
    .locals 1

    .line 1
    iput-boolean p1, p0, Lcom/brentvatne/exoplayer/f;->A:Z

    .line 2
    .line 3
    iget-object v0, p0, Lcom/brentvatne/exoplayer/f;->s:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    invoke-direct {p0}, Lcom/brentvatne/exoplayer/f;->b1()V

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-direct {p0}, Lcom/brentvatne/exoplayer/f;->s0()V

    .line 14
    .line 15
    .line 16
    :cond_1
    :goto_0
    return-void
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

.method public K0(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/brentvatne/exoplayer/f;->e0:Z

    return-void
.end method

.method public M0(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/brentvatne/exoplayer/f;->c0:Z

    return-void
.end method

.method public N0(F)V
    .locals 0

    iput p1, p0, Lcom/brentvatne/exoplayer/f;->d0:F

    return-void
.end method

.method public O0(F)V
    .locals 2

    .line 1
    iput p1, p0, Lcom/brentvatne/exoplayer/f;->E:F

    .line 2
    .line 3
    iget-object p1, p0, Lcom/brentvatne/exoplayer/f;->s:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    new-instance p1, Lcom/google/android/exoplayer2/PlaybackParameters;

    .line 8
    .line 9
    iget v0, p0, Lcom/brentvatne/exoplayer/f;->E:F

    .line 10
    .line 11
    const/high16 v1, 0x3f800000    # 1.0f

    .line 12
    .line 13
    invoke-direct {p1, v0, v1}, Lcom/google/android/exoplayer2/PlaybackParameters;-><init>(FF)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/brentvatne/exoplayer/f;->s:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->Y0(Lcom/google/android/exoplayer2/PlaybackParameters;)V

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
.end method

.method public P0(Landroid/net/Uri;Ljava/lang/String;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lcom/brentvatne/exoplayer/f;->O:Landroid/net/Uri;

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iput-object p1, p0, Lcom/brentvatne/exoplayer/f;->O:Landroid/net/Uri;

    .line 10
    .line 11
    iput-object p2, p0, Lcom/brentvatne/exoplayer/f;->P:Ljava/lang/String;

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    invoke-direct {p0, p1}, Lcom/brentvatne/exoplayer/f;->W(Z)Lcom/google/android/exoplayer2/upstream/DataSource$Factory;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iput-object p1, p0, Lcom/brentvatne/exoplayer/f;->r:Lcom/google/android/exoplayer2/upstream/DataSource$Factory;

    .line 19
    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    invoke-direct {p0}, Lcom/brentvatne/exoplayer/f;->v0()V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
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
.end method

.method public Q0(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/brentvatne/exoplayer/f;->s:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-virtual {v0, v1}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->R(I)V

    .line 9
    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v1, 0x0

    .line 13
    invoke-virtual {v0, v1}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->R(I)V

    .line 14
    .line 15
    .line 16
    :cond_1
    :goto_0
    iput-boolean p1, p0, Lcom/brentvatne/exoplayer/f;->Q:Z

    .line 17
    .line 18
    return-void
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

.method public R0(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/brentvatne/exoplayer/f;->g0:Z

    return-void
.end method

.method public S0(I)V
    .locals 1

    iget-object v0, p0, Lcom/brentvatne/exoplayer/f;->q:Lcom/brentvatne/exoplayer/d;

    invoke-virtual {v0, p1}, Lcom/brentvatne/exoplayer/d;->setResizeMode(I)V

    return-void
.end method

.method public T0(Ljava/lang/String;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/brentvatne/exoplayer/f;->R:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/brentvatne/exoplayer/f;->S:Lcom/facebook/react/bridge/Dynamic;

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    invoke-virtual {p0, v0, p1, p2}, Lcom/brentvatne/exoplayer/f;->V0(ILjava/lang/String;Lcom/facebook/react/bridge/Dynamic;)V

    .line 7
    .line 8
    .line 9
    return-void
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

.method public U0(Ljava/lang/String;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/brentvatne/exoplayer/f;->V:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/brentvatne/exoplayer/f;->W:Lcom/facebook/react/bridge/Dynamic;

    .line 4
    .line 5
    const/4 v0, 0x3

    .line 6
    invoke-virtual {p0, v0, p1, p2}, Lcom/brentvatne/exoplayer/f;->V0(ILjava/lang/String;Lcom/facebook/react/bridge/Dynamic;)V

    .line 7
    .line 8
    .line 9
    return-void
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

.method public V0(ILjava/lang/String;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/brentvatne/exoplayer/f;->s:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {p0, p1}, Lcom/brentvatne/exoplayer/f;->l0(I)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, -0x1

    .line 11
    if-ne v0, v1, :cond_1

    .line 12
    .line 13
    return-void

    .line 14
    :cond_1
    iget-object v2, p0, Lcom/brentvatne/exoplayer/f;->t:Lb9/f;

    .line 15
    .line 16
    invoke-virtual {v2}, Lb9/j;->g()Lb9/j$a;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    if-nez v2, :cond_2

    .line 21
    .line 22
    return-void

    .line 23
    :cond_2
    invoke-virtual {v2, v0}, Lb9/j$a;->e(I)Lcom/google/android/exoplayer2/source/TrackGroupArray;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    const/4 v3, 0x1

    .line 28
    new-array v4, v3, [I

    .line 29
    .line 30
    const/4 v5, 0x0

    .line 31
    aput v5, v4, v5

    .line 32
    .line 33
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 34
    .line 35
    .line 36
    move-result v6

    .line 37
    if-eqz v6, :cond_3

    .line 38
    .line 39
    const-string p2, "default"

    .line 40
    .line 41
    :cond_3
    iget-object v6, p0, Lcom/brentvatne/exoplayer/f;->t:Lb9/f;

    .line 42
    .line 43
    invoke-virtual {v6}, Lb9/f;->v()Lb9/f$d;

    .line 44
    .line 45
    .line 46
    move-result-object v6

    .line 47
    invoke-virtual {v6}, Lb9/f$d;->j()Lb9/f$e;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    invoke-virtual {v6, v0, v3}, Lb9/f$e;->i(IZ)Lb9/f$e;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    invoke-virtual {v6}, Lb9/f$e;->d()Lb9/f$d;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    const-string v7, "disabled"

    .line 60
    .line 61
    invoke-virtual {p2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v7

    .line 65
    if-eqz v7, :cond_4

    .line 66
    .line 67
    iget-object p1, p0, Lcom/brentvatne/exoplayer/f;->t:Lb9/f;

    .line 68
    .line 69
    invoke-virtual {p1, v6}, Lb9/f;->M(Lb9/f$d;)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :cond_4
    const-string v7, "language"

    .line 74
    .line 75
    invoke-virtual {p2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v7

    .line 79
    if-eqz v7, :cond_6

    .line 80
    .line 81
    move p2, v5

    .line 82
    :goto_0
    iget v3, v2, Lcom/google/android/exoplayer2/source/TrackGroupArray;->k:I

    .line 83
    .line 84
    if-ge p2, v3, :cond_f

    .line 85
    .line 86
    invoke-virtual {v2, p2}, Lcom/google/android/exoplayer2/source/TrackGroupArray;->a(I)Li8/u0;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    invoke-virtual {v3, v5}, Li8/u0;->a(I)Le7/k;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    iget-object v3, v3, Le7/k;->m:Ljava/lang/String;

    .line 95
    .line 96
    if-eqz v3, :cond_5

    .line 97
    .line 98
    invoke-interface {p3}, Lcom/facebook/react/bridge/Dynamic;->asString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v7

    .line 102
    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v3

    .line 106
    if-eqz v3, :cond_5

    .line 107
    .line 108
    goto/16 :goto_5

    .line 109
    .line 110
    :cond_5
    add-int/lit8 p2, p2, 0x1

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_6
    const-string v7, "title"

    .line 114
    .line 115
    invoke-virtual {p2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v7

    .line 119
    if-eqz v7, :cond_8

    .line 120
    .line 121
    move p2, v5

    .line 122
    :goto_1
    iget v3, v2, Lcom/google/android/exoplayer2/source/TrackGroupArray;->k:I

    .line 123
    .line 124
    if-ge p2, v3, :cond_f

    .line 125
    .line 126
    invoke-virtual {v2, p2}, Lcom/google/android/exoplayer2/source/TrackGroupArray;->a(I)Li8/u0;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    invoke-virtual {v3, v5}, Li8/u0;->a(I)Le7/k;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    iget-object v3, v3, Le7/k;->k:Ljava/lang/String;

    .line 135
    .line 136
    if-eqz v3, :cond_7

    .line 137
    .line 138
    invoke-interface {p3}, Lcom/facebook/react/bridge/Dynamic;->asString()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v7

    .line 142
    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v3

    .line 146
    if-eqz v3, :cond_7

    .line 147
    .line 148
    goto/16 :goto_5

    .line 149
    .line 150
    :cond_7
    add-int/lit8 p2, p2, 0x1

    .line 151
    .line 152
    goto :goto_1

    .line 153
    :cond_8
    const-string v7, "index"

    .line 154
    .line 155
    invoke-virtual {p2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v7

    .line 159
    if-eqz v7, :cond_9

    .line 160
    .line 161
    invoke-interface {p3}, Lcom/facebook/react/bridge/Dynamic;->asInt()I

    .line 162
    .line 163
    .line 164
    move-result p2

    .line 165
    iget v3, v2, Lcom/google/android/exoplayer2/source/TrackGroupArray;->k:I

    .line 166
    .line 167
    if-ge p2, v3, :cond_f

    .line 168
    .line 169
    invoke-interface {p3}, Lcom/facebook/react/bridge/Dynamic;->asInt()I

    .line 170
    .line 171
    .line 172
    move-result p2

    .line 173
    goto :goto_5

    .line 174
    :cond_9
    const-string v7, "resolution"

    .line 175
    .line 176
    invoke-virtual {p2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    move-result p2

    .line 180
    if-eqz p2, :cond_d

    .line 181
    .line 182
    invoke-interface {p3}, Lcom/facebook/react/bridge/Dynamic;->asInt()I

    .line 183
    .line 184
    .line 185
    move-result p2

    .line 186
    move p3, v1

    .line 187
    move v3, v5

    .line 188
    :goto_2
    iget v7, v2, Lcom/google/android/exoplayer2/source/TrackGroupArray;->k:I

    .line 189
    .line 190
    if-ge v3, v7, :cond_c

    .line 191
    .line 192
    invoke-virtual {v2, v3}, Lcom/google/android/exoplayer2/source/TrackGroupArray;->a(I)Li8/u0;

    .line 193
    .line 194
    .line 195
    move-result-object v7

    .line 196
    move v8, v5

    .line 197
    :goto_3
    iget v9, v7, Li8/u0;->k:I

    .line 198
    .line 199
    if-ge v8, v9, :cond_b

    .line 200
    .line 201
    invoke-virtual {v7, v8}, Li8/u0;->a(I)Le7/k;

    .line 202
    .line 203
    .line 204
    move-result-object v9

    .line 205
    iget v9, v9, Le7/k;->B:I

    .line 206
    .line 207
    if-ne v9, p2, :cond_a

    .line 208
    .line 209
    aput v8, v4, v5

    .line 210
    .line 211
    move p3, v3

    .line 212
    goto :goto_4

    .line 213
    :cond_a
    add-int/lit8 v8, v8, 0x1

    .line 214
    .line 215
    goto :goto_3

    .line 216
    :cond_b
    :goto_4
    add-int/lit8 v3, v3, 0x1

    .line 217
    .line 218
    goto :goto_2

    .line 219
    :cond_c
    move p2, p3

    .line 220
    goto :goto_5

    .line 221
    :cond_d
    const/4 p2, 0x3

    .line 222
    if-ne v0, p2, :cond_e

    .line 223
    .line 224
    sget p2, Lg9/q0;->a:I

    .line 225
    .line 226
    const/16 p3, 0x12

    .line 227
    .line 228
    if-le p2, p3, :cond_e

    .line 229
    .line 230
    iget-object p2, p0, Lcom/brentvatne/exoplayer/f;->l0:Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 231
    .line 232
    const-string p3, "captioning"

    .line 233
    .line 234
    invoke-virtual {p2, p3}, Lcom/facebook/react/bridge/ReactContext;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object p2

    .line 238
    check-cast p2, Landroid/view/accessibility/CaptioningManager;

    .line 239
    .line 240
    if-eqz p2, :cond_f

    .line 241
    .line 242
    invoke-virtual {p2}, Landroid/view/accessibility/CaptioningManager;->isEnabled()Z

    .line 243
    .line 244
    .line 245
    move-result p2

    .line 246
    if-eqz p2, :cond_f

    .line 247
    .line 248
    invoke-direct {p0, v2}, Lcom/brentvatne/exoplayer/f;->i0(Lcom/google/android/exoplayer2/source/TrackGroupArray;)I

    .line 249
    .line 250
    .line 251
    move-result p2

    .line 252
    goto :goto_5

    .line 253
    :cond_e
    if-ne v0, v3, :cond_f

    .line 254
    .line 255
    invoke-direct {p0, v2}, Lcom/brentvatne/exoplayer/f;->i0(Lcom/google/android/exoplayer2/source/TrackGroupArray;)I

    .line 256
    .line 257
    .line 258
    move-result p2

    .line 259
    goto :goto_5

    .line 260
    :cond_f
    move p2, v1

    .line 261
    :goto_5
    if-ne p2, v1, :cond_11

    .line 262
    .line 263
    const/4 p3, 0x2

    .line 264
    if-ne p1, p3, :cond_11

    .line 265
    .line 266
    iget p1, v2, Lcom/google/android/exoplayer2/source/TrackGroupArray;->k:I

    .line 267
    .line 268
    if-eqz p1, :cond_11

    .line 269
    .line 270
    invoke-virtual {v2, v5}, Lcom/google/android/exoplayer2/source/TrackGroupArray;->a(I)Li8/u0;

    .line 271
    .line 272
    .line 273
    move-result-object p1

    .line 274
    iget p2, p1, Li8/u0;->k:I

    .line 275
    .line 276
    new-array v4, p2, [I

    .line 277
    .line 278
    move p2, v5

    .line 279
    :goto_6
    iget p3, p1, Li8/u0;->k:I

    .line 280
    .line 281
    if-ge p2, p3, :cond_10

    .line 282
    .line 283
    aput p2, v4, p2

    .line 284
    .line 285
    add-int/lit8 p2, p2, 0x1

    .line 286
    .line 287
    goto :goto_6

    .line 288
    :cond_10
    move p2, v5

    .line 289
    :cond_11
    if-ne p2, v1, :cond_12

    .line 290
    .line 291
    iget-object p1, p0, Lcom/brentvatne/exoplayer/f;->t:Lb9/f;

    .line 292
    .line 293
    invoke-virtual {p1, v6}, Lb9/f;->M(Lb9/f$d;)V

    .line 294
    .line 295
    .line 296
    return-void

    .line 297
    :cond_12
    iget-object p1, p0, Lcom/brentvatne/exoplayer/f;->t:Lb9/f;

    .line 298
    .line 299
    invoke-virtual {p1}, Lb9/f;->v()Lb9/f$d;

    .line 300
    .line 301
    .line 302
    move-result-object p1

    .line 303
    invoke-virtual {p1}, Lb9/f$d;->j()Lb9/f$e;

    .line 304
    .line 305
    .line 306
    move-result-object p1

    .line 307
    invoke-virtual {p1, v0, v5}, Lb9/f$e;->i(IZ)Lb9/f$e;

    .line 308
    .line 309
    .line 310
    move-result-object p1

    .line 311
    new-instance p3, Lb9/f$f;

    .line 312
    .line 313
    invoke-direct {p3, p2, v4}, Lb9/f$f;-><init>(I[I)V

    .line 314
    .line 315
    .line 316
    invoke-virtual {p1, v0, v2, p3}, Lb9/f$e;->j(ILcom/google/android/exoplayer2/source/TrackGroupArray;Lb9/f$f;)Lb9/f$e;

    .line 317
    .line 318
    .line 319
    move-result-object p1

    .line 320
    invoke-virtual {p1}, Lb9/f$e;->d()Lb9/f$d;

    .line 321
    .line 322
    .line 323
    move-result-object p1

    .line 324
    iget-object p2, p0, Lcom/brentvatne/exoplayer/f;->t:Lb9/f;

    .line 325
    .line 326
    invoke-virtual {p2, p1}, Lb9/f;->M(Lb9/f$d;)V

    .line 327
    .line 328
    .line 329
    return-void
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

.method public W0(Ljava/lang/String;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/brentvatne/exoplayer/f;->T:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/brentvatne/exoplayer/f;->U:Lcom/facebook/react/bridge/Dynamic;

    .line 4
    .line 5
    const/4 v0, 0x2

    .line 6
    invoke-virtual {p0, v0, p1, p2}, Lcom/brentvatne/exoplayer/f;->V0(ILjava/lang/String;Lcom/facebook/react/bridge/Dynamic;)V

    .line 7
    .line 8
    .line 9
    return-void
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

.method public X0(Landroid/net/Uri;Ljava/lang/String;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lcom/brentvatne/exoplayer/f;->O:Landroid/net/Uri;

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iput-object p1, p0, Lcom/brentvatne/exoplayer/f;->O:Landroid/net/Uri;

    .line 10
    .line 11
    iput-object p2, p0, Lcom/brentvatne/exoplayer/f;->P:Ljava/lang/String;

    .line 12
    .line 13
    iput-object p3, p0, Lcom/brentvatne/exoplayer/f;->f0:Ljava/util/Map;

    .line 14
    .line 15
    iget-object p1, p0, Lcom/brentvatne/exoplayer/f;->l0:Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 16
    .line 17
    iget-object p2, p0, Lcom/brentvatne/exoplayer/f;->m:Le9/o;

    .line 18
    .line 19
    invoke-static {p1, p2, p3}, Lcom/brentvatne/exoplayer/b;->c(Lcom/facebook/react/bridge/ReactContext;Le9/o;Ljava/util/Map;)Lcom/google/android/exoplayer2/upstream/DataSource$Factory;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iput-object p1, p0, Lcom/brentvatne/exoplayer/f;->r:Lcom/google/android/exoplayer2/upstream/DataSource$Factory;

    .line 24
    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    invoke-direct {p0}, Lcom/brentvatne/exoplayer/f;->v0()V

    .line 28
    .line 29
    .line 30
    :cond_0
    return-void
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

.method public Y0(Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/brentvatne/exoplayer/f;->a0:Lcom/facebook/react/bridge/ReadableArray;

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/brentvatne/exoplayer/f;->v0()V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
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

.method public Z0(Z)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, Lcom/brentvatne/exoplayer/f;->h0:Ljava/util/UUID;

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 p1, 0x0

    .line 10
    :goto_0
    iget-object v0, p0, Lcom/brentvatne/exoplayer/f;->q:Lcom/brentvatne/exoplayer/d;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Lcom/brentvatne/exoplayer/d;->setUseTextureView(Z)V

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

.method public a1(F)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/brentvatne/exoplayer/f;->F:F

    .line 2
    .line 3
    iget-object v0, p0, Lcom/brentvatne/exoplayer/f;->s:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->d1(F)V

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

.method public b()V
    .locals 1

    iget-object v0, p0, Lcom/brentvatne/exoplayer/f;->k:Lcom/brentvatne/exoplayer/h;

    invoke-virtual {v0}, Lcom/brentvatne/exoplayer/h;->a()V

    return-void
.end method

.method public c0()V
    .locals 0

    invoke-direct {p0}, Lcom/brentvatne/exoplayer/f;->d1()V

    return-void
.end method

.method public f0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/brentvatne/exoplayer/f;->O:Landroid/net/Uri;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/brentvatne/exoplayer/f;->s:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-virtual {v0, v1}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->e1(Z)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-object v0, p0, Lcom/brentvatne/exoplayer/f;->O:Landroid/net/Uri;

    .line 13
    .line 14
    iput-object v0, p0, Lcom/brentvatne/exoplayer/f;->P:Ljava/lang/String;

    .line 15
    .line 16
    iput-object v0, p0, Lcom/brentvatne/exoplayer/f;->f0:Ljava/util/Map;

    .line 17
    .line 18
    iput-object v0, p0, Lcom/brentvatne/exoplayer/f;->r:Lcom/google/android/exoplayer2/upstream/DataSource$Factory;

    .line 19
    .line 20
    invoke-direct {p0}, Lcom/brentvatne/exoplayer/f;->e0()V

    .line 21
    .line 22
    .line 23
    :cond_0
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
.end method

.method public i(IJJ)V
    .locals 6

    .line 1
    iget-boolean p1, p0, Lcom/brentvatne/exoplayer/f;->g0:Z

    .line 2
    .line 3
    if-eqz p1, :cond_4

    .line 4
    .line 5
    iget-object p1, p0, Lcom/brentvatne/exoplayer/f;->s:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/brentvatne/exoplayer/f;->k:Lcom/brentvatne/exoplayer/h;

    .line 10
    .line 11
    long-to-double v1, p4

    .line 12
    const/4 v3, 0x0

    .line 13
    const/4 v4, 0x0

    .line 14
    const-string v5, "-1"

    .line 15
    .line 16
    invoke-virtual/range {v0 .. v5}, Lcom/brentvatne/exoplayer/h;->c(DIILjava/lang/String;)V

    .line 17
    .line 18
    .line 19
    goto :goto_2

    .line 20
    :cond_0
    invoke-virtual {p1}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->L0()Le7/k;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    const/4 p2, 0x0

    .line 25
    if-eqz p1, :cond_1

    .line 26
    .line 27
    iget p3, p1, Le7/k;->A:I

    .line 28
    .line 29
    move v4, p3

    .line 30
    goto :goto_0

    .line 31
    :cond_1
    move v4, p2

    .line 32
    :goto_0
    if-eqz p1, :cond_2

    .line 33
    .line 34
    iget p2, p1, Le7/k;->B:I

    .line 35
    .line 36
    :cond_2
    move v3, p2

    .line 37
    if-eqz p1, :cond_3

    .line 38
    .line 39
    iget-object p1, p1, Le7/k;->k:Ljava/lang/String;

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_3
    const-string p1, "-1"

    .line 43
    .line 44
    :goto_1
    move-object v5, p1

    .line 45
    iget-object v0, p0, Lcom/brentvatne/exoplayer/f;->k:Lcom/brentvatne/exoplayer/h;

    .line 46
    .line 47
    long-to-double v1, p4

    .line 48
    invoke-virtual/range {v0 .. v5}, Lcom/brentvatne/exoplayer/h;->c(DIILjava/lang/String;)V

    .line 49
    .line 50
    .line 51
    :cond_4
    :goto_2
    return-void
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

.method public j0(J)D
    .locals 3

    .line 1
    new-instance v0, Lcom/google/android/exoplayer2/Timeline$c;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/exoplayer2/Timeline$c;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/brentvatne/exoplayer/f;->s:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    .line 7
    .line 8
    invoke-virtual {v1}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->w()Lcom/google/android/exoplayer2/Timeline;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Lcom/google/android/exoplayer2/Timeline;->q()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    iget-object v1, p0, Lcom/brentvatne/exoplayer/f;->s:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    .line 19
    .line 20
    invoke-virtual {v1}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->w()Lcom/google/android/exoplayer2/Timeline;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    iget-object v2, p0, Lcom/brentvatne/exoplayer/f;->s:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    .line 25
    .line 26
    invoke-virtual {v2}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->m()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    invoke-virtual {v1, v2, v0}, Lcom/google/android/exoplayer2/Timeline;->n(ILcom/google/android/exoplayer2/Timeline$c;)Lcom/google/android/exoplayer2/Timeline$c;

    .line 31
    .line 32
    .line 33
    :cond_0
    iget-wide v0, v0, Lcom/google/android/exoplayer2/Timeline$c;->f:J

    .line 34
    .line 35
    add-long/2addr v0, p1

    .line 36
    long-to-double p1, v0

    .line 37
    return-wide p1
    .line 38
    .line 39
    .line 40
.end method

.method public l0(I)I
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/brentvatne/exoplayer/f;->s:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->K0()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    :goto_0
    if-ge v1, v0, :cond_1

    .line 11
    .line 12
    iget-object v2, p0, Lcom/brentvatne/exoplayer/f;->s:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    .line 13
    .line 14
    invoke-virtual {v2, v1}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->D(I)I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-ne v2, p1, :cond_0

    .line 19
    .line 20
    return v1

    .line 21
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    const/4 p1, -0x1

    .line 25
    return p1
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

.method public synthetic m(ILi8/u$a;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lk7/o;->b(Lk7/v;ILi8/u$a;)V

    return-void
.end method

.method public n(ILi8/u$a;)V
    .locals 0

    .line 1
    const-string p1, "DRM Info"

    .line 2
    .line 3
    const-string p2, "onDrmKeysRestored"

    .line 4
    .line 5
    invoke-static {p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
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

.method protected onAttachedToWindow()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/widget/FrameLayout;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/brentvatne/exoplayer/f;->n0()V

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
.end method

.method public onAudioFocusChange(I)V
    .locals 3

    .line 1
    const/4 v0, -0x2

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x1

    .line 4
    if-eq p1, v0, :cond_2

    .line 5
    .line 6
    const/4 v0, -0x1

    .line 7
    if-eq p1, v0, :cond_1

    .line 8
    .line 9
    if-eq p1, v2, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iput-boolean v2, p0, Lcom/brentvatne/exoplayer/f;->D:Z

    .line 13
    .line 14
    iget-object v0, p0, Lcom/brentvatne/exoplayer/f;->k:Lcom/brentvatne/exoplayer/h;

    .line 15
    .line 16
    invoke-virtual {v0, v2}, Lcom/brentvatne/exoplayer/h;->b(Z)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    iput-boolean v1, p0, Lcom/brentvatne/exoplayer/f;->D:Z

    .line 21
    .line 22
    iget-object v0, p0, Lcom/brentvatne/exoplayer/f;->k:Lcom/brentvatne/exoplayer/h;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Lcom/brentvatne/exoplayer/h;->b(Z)V

    .line 25
    .line 26
    .line 27
    invoke-direct {p0}, Lcom/brentvatne/exoplayer/f;->s0()V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lcom/brentvatne/exoplayer/f;->m0:Landroid/media/AudioManager;

    .line 31
    .line 32
    invoke-virtual {v0, p0}, Landroid/media/AudioManager;->abandonAudioFocus(Landroid/media/AudioManager$OnAudioFocusChangeListener;)I

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    iget-object v0, p0, Lcom/brentvatne/exoplayer/f;->k:Lcom/brentvatne/exoplayer/h;

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Lcom/brentvatne/exoplayer/h;->b(Z)V

    .line 39
    .line 40
    .line 41
    :goto_0
    iget-object v0, p0, Lcom/brentvatne/exoplayer/f;->s:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    .line 42
    .line 43
    if-eqz v0, :cond_4

    .line 44
    .line 45
    const/4 v1, -0x3

    .line 46
    if-ne p1, v1, :cond_3

    .line 47
    .line 48
    iget-boolean p1, p0, Lcom/brentvatne/exoplayer/f;->C:Z

    .line 49
    .line 50
    if-nez p1, :cond_4

    .line 51
    .line 52
    iget p1, p0, Lcom/brentvatne/exoplayer/f;->F:F

    .line 53
    .line 54
    const v1, 0x3f4ccccd    # 0.8f

    .line 55
    .line 56
    .line 57
    mul-float/2addr p1, v1

    .line 58
    invoke-virtual {v0, p1}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->d1(F)V

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_3
    if-ne p1, v2, :cond_4

    .line 63
    .line 64
    iget-boolean p1, p0, Lcom/brentvatne/exoplayer/f;->C:Z

    .line 65
    .line 66
    if-nez p1, :cond_4

    .line 67
    .line 68
    iget p1, p0, Lcom/brentvatne/exoplayer/f;->F:F

    .line 69
    .line 70
    const/high16 v1, 0x3f800000    # 1.0f

    .line 71
    .line 72
    mul-float/2addr p1, v1

    .line 73
    invoke-virtual {v0, p1}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->d1(F)V

    .line 74
    .line 75
    .line 76
    :cond_4
    :goto_1
    return-void
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
.end method

.method protected onDetachedFromWindow()V
    .locals 0

    invoke-super {p0}, Landroid/widget/FrameLayout;->onDetachedFromWindow()V

    return-void
.end method

.method public synthetic onEvents(Lcom/google/android/exoplayer2/Player;Lcom/google/android/exoplayer2/Player$Events;)V
    .locals 0

    invoke-static {p0, p1, p2}, Le7/q;->a(Lcom/google/android/exoplayer2/Player$a;Lcom/google/android/exoplayer2/Player;Lcom/google/android/exoplayer2/Player$Events;)V

    return-void
.end method

.method public synthetic onExperimentalOffloadSchedulingEnabledChanged(Z)V
    .locals 0

    invoke-static {p0, p1}, Le7/q;->b(Lcom/google/android/exoplayer2/Player$a;Z)V

    return-void
.end method

.method public synthetic onExperimentalSleepingForOffloadChanged(Z)V
    .locals 0

    invoke-static {p0, p1}, Le7/q;->c(Lcom/google/android/exoplayer2/Player$a;Z)V

    return-void
.end method

.method public onHostDestroy()V
    .locals 0

    invoke-direct {p0}, Lcom/brentvatne/exoplayer/f;->d1()V

    return-void
.end method

.method public onHostPause()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/brentvatne/exoplayer/f;->z:Z

    .line 3
    .line 4
    iget-boolean v0, p0, Lcom/brentvatne/exoplayer/f;->e0:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    invoke-direct {p0, v0}, Lcom/brentvatne/exoplayer/f;->L0(Z)V

    .line 11
    .line 12
    .line 13
    return-void
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
.end method

.method public onHostResume()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/brentvatne/exoplayer/f;->e0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, Lcom/brentvatne/exoplayer/f;->z:Z

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    :cond_0
    iget-boolean v0, p0, Lcom/brentvatne/exoplayer/f;->A:Z

    .line 10
    .line 11
    xor-int/lit8 v0, v0, 0x1

    .line 12
    .line 13
    invoke-direct {p0, v0}, Lcom/brentvatne/exoplayer/f;->L0(Z)V

    .line 14
    .line 15
    .line 16
    :cond_1
    const/4 v0, 0x0

    .line 17
    iput-boolean v0, p0, Lcom/brentvatne/exoplayer/f;->z:Z

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
.end method

.method public synthetic onIsLoadingChanged(Z)V
    .locals 0

    invoke-static {p0, p1}, Le7/q;->d(Lcom/google/android/exoplayer2/Player$a;Z)V

    return-void
.end method

.method public synthetic onIsPlayingChanged(Z)V
    .locals 0

    invoke-static {p0, p1}, Le7/q;->e(Lcom/google/android/exoplayer2/Player$a;Z)V

    return-void
.end method

.method public onLoadingChanged(Z)V
    .locals 0

    return-void
.end method

.method public synthetic onMediaItemTransition(Lcom/google/android/exoplayer2/MediaItem;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Le7/q;->g(Lcom/google/android/exoplayer2/Player$a;Lcom/google/android/exoplayer2/MediaItem;I)V

    return-void
.end method

.method public synthetic onPlayWhenReadyChanged(ZI)V
    .locals 0

    invoke-static {p0, p1, p2}, Le7/q;->h(Lcom/google/android/exoplayer2/Player$a;ZI)V

    return-void
.end method

.method public onPlaybackParametersChanged(Lcom/google/android/exoplayer2/PlaybackParameters;)V
    .locals 1

    iget-object v0, p0, Lcom/brentvatne/exoplayer/f;->k:Lcom/brentvatne/exoplayer/h;

    iget p1, p1, Lcom/google/android/exoplayer2/PlaybackParameters;->a:F

    invoke-virtual {v0, p1}, Lcom/brentvatne/exoplayer/h;->n(F)V

    return-void
.end method

.method public synthetic onPlaybackStateChanged(I)V
    .locals 0

    invoke-static {p0, p1}, Le7/q;->j(Lcom/google/android/exoplayer2/Player$a;I)V

    return-void
.end method

.method public synthetic onPlaybackSuppressionReasonChanged(I)V
    .locals 0

    invoke-static {p0, p1}, Le7/q;->k(Lcom/google/android/exoplayer2/Player$a;I)V

    return-void
.end method

.method public onPlayerError(Lcom/google/android/exoplayer2/ExoPlaybackException;)V
    .locals 6

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "ExoPlaybackException type : "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget v1, p1, Lcom/google/android/exoplayer2/ExoPlaybackException;->k:I

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iget v1, p1, Lcom/google/android/exoplayer2/ExoPlaybackException;->k:I

    .line 21
    .line 22
    const/4 v2, 0x1

    .line 23
    if-ne v1, v2, :cond_3

    .line 24
    .line 25
    invoke-virtual {p1}, Lcom/google/android/exoplayer2/ExoPlaybackException;->g()Ljava/lang/Exception;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    instance-of v3, v1, Ly7/n$a;

    .line 30
    .line 31
    if-eqz v3, :cond_4

    .line 32
    .line 33
    check-cast v1, Ly7/n$a;

    .line 34
    .line 35
    iget-object v0, v1, Ly7/n$a;->m:Ly7/m;

    .line 36
    .line 37
    iget-object v0, v0, Ly7/m;->a:Ljava/lang/String;

    .line 38
    .line 39
    const/4 v3, 0x0

    .line 40
    if-nez v0, :cond_2

    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    instance-of v0, v0, Ly7/x$c;

    .line 47
    .line 48
    if-eqz v0, :cond_0

    .line 49
    .line 50
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    sget v1, Lz2/b;->g:I

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    goto :goto_0

    .line 61
    :cond_0
    iget-boolean v0, v1, Ly7/n$a;->l:Z

    .line 62
    .line 63
    if-eqz v0, :cond_1

    .line 64
    .line 65
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    sget v4, Lz2/b;->f:I

    .line 70
    .line 71
    new-array v5, v2, [Ljava/lang/Object;

    .line 72
    .line 73
    iget-object v1, v1, Ly7/n$a;->k:Ljava/lang/String;

    .line 74
    .line 75
    aput-object v1, v5, v3

    .line 76
    .line 77
    invoke-virtual {v0, v4, v5}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    goto :goto_0

    .line 82
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    sget v4, Lz2/b;->e:I

    .line 87
    .line 88
    new-array v5, v2, [Ljava/lang/Object;

    .line 89
    .line 90
    iget-object v1, v1, Ly7/n$a;->k:Ljava/lang/String;

    .line 91
    .line 92
    aput-object v1, v5, v3

    .line 93
    .line 94
    invoke-virtual {v0, v4, v5}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    goto :goto_0

    .line 99
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    sget v4, Lz2/b;->d:I

    .line 104
    .line 105
    new-array v5, v2, [Ljava/lang/Object;

    .line 106
    .line 107
    iget-object v1, v1, Ly7/n$a;->m:Ly7/m;

    .line 108
    .line 109
    iget-object v1, v1, Ly7/m;->a:Ljava/lang/String;

    .line 110
    .line 111
    aput-object v1, v5, v3

    .line 112
    .line 113
    invoke-virtual {v0, v4, v5}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    goto :goto_0

    .line 118
    :cond_3
    if-nez v1, :cond_4

    .line 119
    .line 120
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    sget v1, Lz2/b;->h:I

    .line 125
    .line 126
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    :cond_4
    :goto_0
    iget-object v1, p0, Lcom/brentvatne/exoplayer/f;->k:Lcom/brentvatne/exoplayer/h;

    .line 131
    .line 132
    invoke-virtual {v1, v0, p1}, Lcom/brentvatne/exoplayer/h;->f(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 133
    .line 134
    .line 135
    iput-boolean v2, p0, Lcom/brentvatne/exoplayer/f;->u:Z

    .line 136
    .line 137
    invoke-static {p1}, Lcom/brentvatne/exoplayer/f;->p0(Lcom/google/android/exoplayer2/ExoPlaybackException;)Z

    .line 138
    .line 139
    .line 140
    move-result p1

    .line 141
    if-eqz p1, :cond_5

    .line 142
    .line 143
    invoke-direct {p0}, Lcom/brentvatne/exoplayer/f;->e0()V

    .line 144
    .line 145
    .line 146
    invoke-direct {p0}, Lcom/brentvatne/exoplayer/f;->n0()V

    .line 147
    .line 148
    .line 149
    goto :goto_1

    .line 150
    :cond_5
    invoke-direct {p0}, Lcom/brentvatne/exoplayer/f;->f1()V

    .line 151
    .line 152
    .line 153
    :goto_1
    return-void
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
.end method

.method public onPlayerStateChanged(ZI)V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "onStateChanged: playWhenReady="

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const-string v1, ", playbackState="

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const/4 v1, 0x1

    .line 24
    const/4 v2, 0x0

    .line 25
    if-eq p2, v1, :cond_4

    .line 26
    .line 27
    const/4 p1, 0x2

    .line 28
    if-eq p2, p1, :cond_3

    .line 29
    .line 30
    const/4 p1, 0x3

    .line 31
    if-eq p2, p1, :cond_1

    .line 32
    .line 33
    const/4 p1, 0x4

    .line 34
    if-eq p2, p1, :cond_0

    .line 35
    .line 36
    new-instance p1, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string p2, "unknown"

    .line 45
    .line 46
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    goto/16 :goto_0

    .line 54
    .line 55
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string p2, "ended"

    .line 64
    .line 65
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    iget-object p2, p0, Lcom/brentvatne/exoplayer/f;->k:Lcom/brentvatne/exoplayer/h;

    .line 73
    .line 74
    invoke-virtual {p2}, Lcom/brentvatne/exoplayer/h;->e()V

    .line 75
    .line 76
    .line 77
    invoke-direct {p0}, Lcom/brentvatne/exoplayer/f;->r0()V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0, v2}, Landroid/view/View;->setKeepScreenOn(Z)V

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    .line 85
    .line 86
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    const-string p2, "ready"

    .line 93
    .line 94
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    iget-object p2, p0, Lcom/brentvatne/exoplayer/f;->k:Lcom/brentvatne/exoplayer/h;

    .line 102
    .line 103
    invoke-virtual {p2}, Lcom/brentvatne/exoplayer/h;->p()V

    .line 104
    .line 105
    .line 106
    invoke-direct {p0, v2}, Lcom/brentvatne/exoplayer/f;->q0(Z)V

    .line 107
    .line 108
    .line 109
    invoke-direct {p0}, Lcom/brentvatne/exoplayer/f;->c1()V

    .line 110
    .line 111
    .line 112
    invoke-direct {p0}, Lcom/brentvatne/exoplayer/f;->g1()V

    .line 113
    .line 114
    .line 115
    iget-object p2, p0, Lcom/brentvatne/exoplayer/f;->n:Lcom/google/android/exoplayer2/ui/PlayerControlView;

    .line 116
    .line 117
    if-eqz p2, :cond_2

    .line 118
    .line 119
    invoke-virtual {p2}, Lcom/google/android/exoplayer2/ui/PlayerControlView;->P()V

    .line 120
    .line 121
    .line 122
    :cond_2
    iget-boolean p2, p0, Lcom/brentvatne/exoplayer/f;->c0:Z

    .line 123
    .line 124
    invoke-virtual {p0, p2}, Landroid/view/View;->setKeepScreenOn(Z)V

    .line 125
    .line 126
    .line 127
    goto :goto_0

    .line 128
    :cond_3
    new-instance p1, Ljava/lang/StringBuilder;

    .line 129
    .line 130
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 131
    .line 132
    .line 133
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    const-string p2, "buffering"

    .line 137
    .line 138
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    invoke-direct {p0, v1}, Lcom/brentvatne/exoplayer/f;->q0(Z)V

    .line 146
    .line 147
    .line 148
    invoke-direct {p0}, Lcom/brentvatne/exoplayer/f;->d0()V

    .line 149
    .line 150
    .line 151
    iget-boolean p2, p0, Lcom/brentvatne/exoplayer/f;->c0:Z

    .line 152
    .line 153
    invoke-virtual {p0, p2}, Landroid/view/View;->setKeepScreenOn(Z)V

    .line 154
    .line 155
    .line 156
    goto :goto_0

    .line 157
    :cond_4
    new-instance p2, Ljava/lang/StringBuilder;

    .line 158
    .line 159
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 160
    .line 161
    .line 162
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    const-string v0, "idle"

    .line 166
    .line 167
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object p2

    .line 174
    iget-object v0, p0, Lcom/brentvatne/exoplayer/f;->k:Lcom/brentvatne/exoplayer/h;

    .line 175
    .line 176
    invoke-virtual {v0}, Lcom/brentvatne/exoplayer/h;->k()V

    .line 177
    .line 178
    .line 179
    invoke-direct {p0}, Lcom/brentvatne/exoplayer/f;->d0()V

    .line 180
    .line 181
    .line 182
    if-nez p1, :cond_5

    .line 183
    .line 184
    invoke-virtual {p0, v2}, Landroid/view/View;->setKeepScreenOn(Z)V

    .line 185
    .line 186
    .line 187
    :cond_5
    move-object p1, p2

    .line 188
    :goto_0
    const-string p2, "ReactExoplayerView"

    .line 189
    .line 190
    invoke-static {p2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 191
    .line 192
    .line 193
    return-void
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
.end method

.method public onPositionDiscontinuity(I)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/brentvatne/exoplayer/f;->u:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/brentvatne/exoplayer/f;->f1()V

    .line 6
    .line 7
    .line 8
    :cond_0
    if-nez p1, :cond_1

    .line 9
    .line 10
    iget-object p1, p0, Lcom/brentvatne/exoplayer/f;->s:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->U()I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    const/4 v0, 0x1

    .line 17
    if-ne p1, v0, :cond_1

    .line 18
    .line 19
    iget-object p1, p0, Lcom/brentvatne/exoplayer/f;->k:Lcom/brentvatne/exoplayer/h;

    .line 20
    .line 21
    invoke-virtual {p1}, Lcom/brentvatne/exoplayer/h;->e()V

    .line 22
    .line 23
    .line 24
    :cond_1
    return-void
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

.method public onRepeatModeChanged(I)V
    .locals 0

    return-void
.end method

.method public onSeekProcessed()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/brentvatne/exoplayer/f;->k:Lcom/brentvatne/exoplayer/h;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/brentvatne/exoplayer/f;->s:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    .line 4
    .line 5
    invoke-virtual {v1}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->Y()J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    iget-wide v3, p0, Lcom/brentvatne/exoplayer/f;->I:J

    .line 10
    .line 11
    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/brentvatne/exoplayer/h;->r(JJ)V

    .line 12
    .line 13
    .line 14
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    iput-wide v0, p0, Lcom/brentvatne/exoplayer/f;->I:J

    .line 20
    .line 21
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
.end method

.method public onShuffleModeEnabledChanged(Z)V
    .locals 0

    return-void
.end method

.method public synthetic onStaticMetadataChanged(Ljava/util/List;)V
    .locals 0

    invoke-static {p0, p1}, Le7/q;->r(Lcom/google/android/exoplayer2/Player$a;Ljava/util/List;)V

    return-void
.end method

.method public synthetic onTimelineChanged(Lcom/google/android/exoplayer2/Timeline;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Le7/q;->s(Lcom/google/android/exoplayer2/Player$a;Lcom/google/android/exoplayer2/Timeline;I)V

    return-void
.end method

.method public onTimelineChanged(Lcom/google/android/exoplayer2/Timeline;Ljava/lang/Object;I)V
    .locals 0

    return-void
.end method

.method public onTracksChanged(Lcom/google/android/exoplayer2/source/TrackGroupArray;Lcom/google/android/exoplayer2/trackselection/TrackSelectionArray;)V
    .locals 0

    return-void
.end method

.method public p(ILi8/u$a;)V
    .locals 0

    .line 1
    const-string p1, "DRM Info"

    .line 2
    .line 3
    const-string p2, "onDrmKeysLoaded"

    .line 4
    .line 5
    invoke-static {p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
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

.method public s(Lz7/a;)V
    .locals 1

    iget-object v0, p0, Lcom/brentvatne/exoplayer/f;->k:Lcom/brentvatne/exoplayer/h;

    invoke-virtual {v0, p1}, Lcom/brentvatne/exoplayer/h;->t(Lz7/a;)V

    return-void
.end method

.method public setId(I)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->setId(I)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/brentvatne/exoplayer/f;->k:Lcom/brentvatne/exoplayer/h;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lcom/brentvatne/exoplayer/h;->s(I)V

    .line 7
    .line 8
    .line 9
    return-void
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

.method public t(ILi8/u$a;Ljava/lang/Exception;)V
    .locals 0

    .line 1
    const-string p1, "DRM Info"

    .line 2
    .line 3
    const-string p2, "onDrmSessionManagerError"

    .line 4
    .line 5
    invoke-static {p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Lcom/brentvatne/exoplayer/f;->k:Lcom/brentvatne/exoplayer/h;

    .line 9
    .line 10
    invoke-virtual {p1, p2, p3}, Lcom/brentvatne/exoplayer/h;->f(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 11
    .line 12
    .line 13
    return-void
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

.method public v(ILi8/u$a;)V
    .locals 0

    .line 1
    const-string p1, "DRM Info"

    .line 2
    .line 3
    const-string p2, "onDrmKeysRemoved"

    .line 4
    .line 5
    invoke-static {p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
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

.method public x0(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/brentvatne/exoplayer/f;->s:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iput-wide p1, p0, Lcom/brentvatne/exoplayer/f;->I:J

    .line 6
    .line 7
    invoke-virtual {v0, p1, p2}, Lcom/google/android/exoplayer2/e;->c0(J)V

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

.method public y0(IIII)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/brentvatne/exoplayer/f;->J:I

    .line 2
    .line 3
    iput p2, p0, Lcom/brentvatne/exoplayer/f;->K:I

    .line 4
    .line 5
    iput p3, p0, Lcom/brentvatne/exoplayer/f;->L:I

    .line 6
    .line 7
    iput p4, p0, Lcom/brentvatne/exoplayer/f;->M:I

    .line 8
    .line 9
    invoke-direct {p0}, Lcom/brentvatne/exoplayer/f;->u0()V

    .line 10
    .line 11
    .line 12
    invoke-direct {p0}, Lcom/brentvatne/exoplayer/f;->n0()V

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
.end method

.method public synthetic z(ILi8/u$a;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lk7/o;->a(Lk7/v;ILi8/u$a;)V

    return-void
.end method

.method public z0(Z)V
    .locals 1

    .line 1
    iput-boolean p1, p0, Lcom/brentvatne/exoplayer/f;->k0:Z

    .line 2
    .line 3
    iget-object v0, p0, Lcom/brentvatne/exoplayer/f;->s:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    .line 4
    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    iget-object v0, p0, Lcom/brentvatne/exoplayer/f;->q:Lcom/brentvatne/exoplayer/d;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    if-eqz p1, :cond_1

    .line 13
    .line 14
    invoke-direct {p0}, Lcom/brentvatne/exoplayer/f;->U()V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    iget-object p1, p0, Lcom/brentvatne/exoplayer/f;->n:Lcom/google/android/exoplayer2/ui/PlayerControlView;

    .line 19
    .line 20
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    const/4 v0, -0x1

    .line 25
    if-eq p1, v0, :cond_2

    .line 26
    .line 27
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->removeViewAt(I)V

    .line 28
    .line 29
    .line 30
    :cond_2
    :goto_0
    return-void
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
