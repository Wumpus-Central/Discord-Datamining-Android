.class public final Lpg/j0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpg/j0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lpg/j0$a;-><init>()V

    return-void
.end method

.method public static final synthetic a(Lpg/j0$a;Lmg/e1;)Ldi/p1;
    .locals 0

    invoke-direct {p0, p1}, Lpg/j0$a;->c(Lmg/e1;)Ldi/p1;

    move-result-object p0

    return-object p0
.end method

.method private final c(Lmg/e1;)Ldi/p1;
    .locals 1

    .line 1
    invoke-interface {p1}, Lmg/e1;->q()Lmg/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return-object p1

    .line 9
    :cond_0
    invoke-interface {p1}, Lmg/e1;->W()Ldi/o0;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {p1}, Ldi/p1;->f(Ldi/g0;)Ldi/p1;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
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


# virtual methods
.method public final b(Lci/n;Lmg/e1;Lmg/d;)Lpg/i0;
    .locals 16

    .line 1
    move-object/from16 v9, p2

    .line 2
    .line 3
    move-object/from16 v10, p3

    .line 4
    .line 5
    const-string v0, "storageManager"

    .line 6
    .line 7
    move-object/from16 v1, p1

    .line 8
    .line 9
    invoke-static {v1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v0, "typeAliasDescriptor"

    .line 13
    .line 14
    invoke-static {v9, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const-string v0, "constructor"

    .line 18
    .line 19
    invoke-static {v10, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    move-object/from16 v11, p0

    .line 23
    .line 24
    invoke-direct {v11, v9}, Lpg/j0$a;->c(Lmg/e1;)Ldi/p1;

    .line 25
    .line 26
    .line 27
    move-result-object v12

    .line 28
    const/4 v13, 0x0

    .line 29
    if-nez v12, :cond_0

    .line 30
    .line 31
    return-object v13

    .line 32
    :cond_0
    invoke-interface {v10, v12}, Lmg/d;->c(Ldi/p1;)Lmg/d;

    .line 33
    .line 34
    .line 35
    move-result-object v14

    .line 36
    if-nez v14, :cond_1

    .line 37
    .line 38
    return-object v13

    .line 39
    :cond_1
    new-instance v15, Lpg/j0;

    .line 40
    .line 41
    const/4 v4, 0x0

    .line 42
    invoke-interface/range {p3 .. p3}, Lng/a;->getAnnotations()Lng/g;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    invoke-interface/range {p3 .. p3}, Lmg/b;->g()Lmg/b$a;

    .line 47
    .line 48
    .line 49
    move-result-object v6

    .line 50
    const-string v0, "constructor.kind"

    .line 51
    .line 52
    invoke-static {v6, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-interface/range {p2 .. p2}, Lmg/p;->j()Lmg/a1;

    .line 56
    .line 57
    .line 58
    move-result-object v7

    .line 59
    const-string v0, "typeAliasDescriptor.source"

    .line 60
    .line 61
    invoke-static {v7, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    const/4 v8, 0x0

    .line 65
    move-object v0, v15

    .line 66
    move-object/from16 v1, p1

    .line 67
    .line 68
    move-object/from16 v2, p2

    .line 69
    .line 70
    move-object v3, v14

    .line 71
    invoke-direct/range {v0 .. v8}, Lpg/j0;-><init>(Lci/n;Lmg/e1;Lmg/d;Lpg/i0;Lng/g;Lmg/b$a;Lmg/a1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 72
    .line 73
    .line 74
    invoke-interface/range {p3 .. p3}, Lmg/a;->i()Ljava/util/List;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-static {v15, v0, v12}, Lpg/p;->O0(Lmg/y;Ljava/util/List;Ldi/p1;)Ljava/util/List;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    if-nez v5, :cond_2

    .line 83
    .line 84
    return-object v13

    .line 85
    :cond_2
    invoke-interface {v14}, Lmg/l;->getReturnType()Ldi/g0;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-virtual {v0}, Ldi/g0;->Q0()Ldi/v1;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-static {v0}, Ldi/d0;->c(Ldi/g0;)Ldi/o0;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-interface/range {p2 .. p2}, Lmg/h;->s()Ldi/o0;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    const-string v2, "typeAliasDescriptor.defaultType"

    .line 102
    .line 103
    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    invoke-static {v0, v1}, Ldi/s0;->j(Ldi/o0;Ldi/o0;)Ldi/o0;

    .line 107
    .line 108
    .line 109
    move-result-object v6

    .line 110
    invoke-interface/range {p3 .. p3}, Lmg/a;->f0()Lmg/x0;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    if-eqz v0, :cond_3

    .line 115
    .line 116
    invoke-interface {v0}, Lmg/i1;->getType()Ldi/g0;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    sget-object v1, Ldi/w1;->o:Ldi/w1;

    .line 121
    .line 122
    invoke-virtual {v12, v0, v1}, Ldi/p1;->n(Ldi/g0;Ldi/w1;)Ldi/g0;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    sget-object v1, Lng/g;->f:Lng/g$a;

    .line 127
    .line 128
    invoke-virtual {v1}, Lng/g$a;->b()Lng/g;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    invoke-static {v15, v0, v1}, Lph/d;->i(Lmg/a;Ldi/g0;Lng/g;)Lmg/x0;

    .line 133
    .line 134
    .line 135
    move-result-object v13

    .line 136
    :cond_3
    move-object v1, v13

    .line 137
    invoke-interface/range {p2 .. p2}, Lmg/e1;->q()Lmg/e;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    if-eqz v0, :cond_4

    .line 142
    .line 143
    invoke-interface/range {p3 .. p3}, Lmg/a;->p0()Ljava/util/List;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    const-string v3, "constructor.contextReceiverParameters"

    .line 148
    .line 149
    invoke-static {v2, v3}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    new-instance v3, Ljava/util/ArrayList;

    .line 153
    .line 154
    const/16 v4, 0xa

    .line 155
    .line 156
    invoke-static {v2, v4}, Lkotlin/collections/h;->t(Ljava/lang/Iterable;I)I

    .line 157
    .line 158
    .line 159
    move-result v4

    .line 160
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 161
    .line 162
    .line 163
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 168
    .line 169
    .line 170
    move-result v4

    .line 171
    if-eqz v4, :cond_5

    .line 172
    .line 173
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v4

    .line 177
    check-cast v4, Lmg/x0;

    .line 178
    .line 179
    invoke-interface {v4}, Lmg/i1;->getType()Ldi/g0;

    .line 180
    .line 181
    .line 182
    move-result-object v7

    .line 183
    sget-object v8, Ldi/w1;->o:Ldi/w1;

    .line 184
    .line 185
    invoke-virtual {v12, v7, v8}, Ldi/p1;->n(Ldi/g0;Ldi/w1;)Ldi/g0;

    .line 186
    .line 187
    .line 188
    move-result-object v7

    .line 189
    invoke-interface {v4}, Lmg/x0;->getValue()Lxh/g;

    .line 190
    .line 191
    .line 192
    move-result-object v4

    .line 193
    const-string v8, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.receivers.ImplicitContextReceiver"

    .line 194
    .line 195
    invoke-static {v4, v8}, Lkotlin/jvm/internal/q;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    check-cast v4, Lxh/f;

    .line 199
    .line 200
    invoke-interface {v4}, Lxh/f;->a()Llh/f;

    .line 201
    .line 202
    .line 203
    move-result-object v4

    .line 204
    sget-object v8, Lng/g;->f:Lng/g$a;

    .line 205
    .line 206
    invoke-virtual {v8}, Lng/g$a;->b()Lng/g;

    .line 207
    .line 208
    .line 209
    move-result-object v8

    .line 210
    invoke-static {v0, v7, v4, v8}, Lph/d;->c(Lmg/e;Ldi/g0;Llh/f;Lng/g;)Lmg/x0;

    .line 211
    .line 212
    .line 213
    move-result-object v4

    .line 214
    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    goto :goto_0

    .line 218
    :cond_4
    invoke-static {}, Lkotlin/collections/h;->i()Ljava/util/List;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    move-object v3, v0

    .line 223
    :cond_5
    const/4 v2, 0x0

    .line 224
    invoke-interface/range {p2 .. p2}, Lmg/i;->u()Ljava/util/List;

    .line 225
    .line 226
    .line 227
    move-result-object v4

    .line 228
    sget-object v7, Lmg/e0;->l:Lmg/e0;

    .line 229
    .line 230
    invoke-interface/range {p2 .. p2}, Lmg/d0;->getVisibility()Lmg/u;

    .line 231
    .line 232
    .line 233
    move-result-object v8

    .line 234
    move-object v0, v15

    .line 235
    invoke-virtual/range {v0 .. v8}, Lpg/p;->R0(Lmg/x0;Lmg/x0;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ldi/g0;Lmg/e0;Lmg/u;)Lpg/p;

    .line 236
    .line 237
    .line 238
    return-object v15
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
.end method
