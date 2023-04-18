.class public final Lio/sentry/c4$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/r0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/sentry/c4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/sentry/r0<",
        "Lio/sentry/c4;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lio/sentry/x0;Lio/sentry/g0;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lio/sentry/c4$a;->b(Lio/sentry/x0;Lio/sentry/g0;)Lio/sentry/c4;

    move-result-object p1

    return-object p1
.end method

.method public b(Lio/sentry/x0;Lio/sentry/g0;)Lio/sentry/c4;
    .locals 11

    .line 1
    invoke-virtual {p1}, Lio/sentry/vendor/gson/stream/a;->f()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    move-object v2, v0

    .line 6
    move-object v3, v2

    .line 7
    move-object v4, v3

    .line 8
    move-object v5, v4

    .line 9
    move-object v7, v5

    .line 10
    move-object v8, v7

    .line 11
    move-object v9, v8

    .line 12
    :goto_0
    invoke-virtual {p1}, Lio/sentry/vendor/gson/stream/a;->z0()Lio/sentry/vendor/gson/stream/b;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    sget-object v6, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    .line 17
    .line 18
    if-ne v1, v6, :cond_8

    .line 19
    .line 20
    invoke-virtual {p1}, Lio/sentry/vendor/gson/stream/a;->g0()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 28
    .line 29
    .line 30
    move-result v6

    .line 31
    const/4 v10, -0x1

    .line 32
    sparse-switch v6, :sswitch_data_0

    .line 33
    .line 34
    .line 35
    goto :goto_1

    .line 36
    :sswitch_0
    const-string v6, "trace_id"

    .line 37
    .line 38
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    if-nez v6, :cond_0

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_0
    const/4 v10, 0x6

    .line 46
    goto :goto_1

    .line 47
    :sswitch_1
    const-string v6, "tags"

    .line 48
    .line 49
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v6

    .line 53
    if-nez v6, :cond_1

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    const/4 v10, 0x5

    .line 57
    goto :goto_1

    .line 58
    :sswitch_2
    const-string v6, "op"

    .line 59
    .line 60
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    if-nez v6, :cond_2

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_2
    const/4 v10, 0x4

    .line 68
    goto :goto_1

    .line 69
    :sswitch_3
    const-string v6, "status"

    .line 70
    .line 71
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v6

    .line 75
    if-nez v6, :cond_3

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_3
    const/4 v10, 0x3

    .line 79
    goto :goto_1

    .line 80
    :sswitch_4
    const-string v6, "description"

    .line 81
    .line 82
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v6

    .line 86
    if-nez v6, :cond_4

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_4
    const/4 v10, 0x2

    .line 90
    goto :goto_1

    .line 91
    :sswitch_5
    const-string v6, "parent_span_id"

    .line 92
    .line 93
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v6

    .line 97
    if-nez v6, :cond_5

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_5
    const/4 v10, 0x1

    .line 101
    goto :goto_1

    .line 102
    :sswitch_6
    const-string v6, "span_id"

    .line 103
    .line 104
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v6

    .line 108
    if-nez v6, :cond_6

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_6
    const/4 v10, 0x0

    .line 112
    :goto_1
    packed-switch v10, :pswitch_data_0

    .line 113
    .line 114
    .line 115
    if-nez v0, :cond_7

    .line 116
    .line 117
    new-instance v0, Lj$/util/concurrent/ConcurrentHashMap;

    .line 118
    .line 119
    invoke-direct {v0}, Lj$/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 120
    .line 121
    .line 122
    :cond_7
    invoke-virtual {p1, p2, v0, v1}, Lio/sentry/x0;->b1(Lio/sentry/g0;Ljava/util/Map;Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    goto :goto_0

    .line 126
    :pswitch_0
    new-instance v1, Lio/sentry/protocol/p$a;

    .line 127
    .line 128
    invoke-direct {v1}, Lio/sentry/protocol/p$a;-><init>()V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v1, p1, p2}, Lio/sentry/protocol/p$a;->b(Lio/sentry/x0;Lio/sentry/g0;)Lio/sentry/protocol/p;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    move-object v2, v1

    .line 136
    goto :goto_0

    .line 137
    :pswitch_1
    invoke-virtual {p1}, Lio/sentry/x0;->X0()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    check-cast v1, Ljava/util/Map;

    .line 142
    .line 143
    invoke-static {v1}, Lio/sentry/util/a;->b(Ljava/util/Map;)Ljava/util/Map;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    move-object v9, v1

    .line 148
    goto/16 :goto_0

    .line 149
    .line 150
    :pswitch_2
    invoke-virtual {p1}, Lio/sentry/vendor/gson/stream/a;->t0()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    move-object v4, v1

    .line 155
    goto/16 :goto_0

    .line 156
    .line 157
    :pswitch_3
    new-instance v1, Lio/sentry/f4$a;

    .line 158
    .line 159
    invoke-direct {v1}, Lio/sentry/f4$a;-><init>()V

    .line 160
    .line 161
    .line 162
    invoke-virtual {p1, p2, v1}, Lio/sentry/x0;->Y0(Lio/sentry/g0;Lio/sentry/r0;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    check-cast v1, Lio/sentry/f4;

    .line 167
    .line 168
    move-object v8, v1

    .line 169
    goto/16 :goto_0

    .line 170
    .line 171
    :pswitch_4
    invoke-virtual {p1}, Lio/sentry/vendor/gson/stream/a;->t0()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    move-object v7, v1

    .line 176
    goto/16 :goto_0

    .line 177
    .line 178
    :pswitch_5
    new-instance v1, Lio/sentry/e4$a;

    .line 179
    .line 180
    invoke-direct {v1}, Lio/sentry/e4$a;-><init>()V

    .line 181
    .line 182
    .line 183
    invoke-virtual {p1, p2, v1}, Lio/sentry/x0;->Y0(Lio/sentry/g0;Lio/sentry/r0;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    check-cast v1, Lio/sentry/e4;

    .line 188
    .line 189
    move-object v5, v1

    .line 190
    goto/16 :goto_0

    .line 191
    .line 192
    :pswitch_6
    new-instance v1, Lio/sentry/e4$a;

    .line 193
    .line 194
    invoke-direct {v1}, Lio/sentry/e4$a;-><init>()V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v1, p1, p2}, Lio/sentry/e4$a;->b(Lio/sentry/x0;Lio/sentry/g0;)Lio/sentry/e4;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    move-object v3, v1

    .line 202
    goto/16 :goto_0

    .line 203
    .line 204
    :cond_8
    if-eqz v2, :cond_c

    .line 205
    .line 206
    if-eqz v3, :cond_b

    .line 207
    .line 208
    if-eqz v4, :cond_a

    .line 209
    .line 210
    new-instance p2, Lio/sentry/c4;

    .line 211
    .line 212
    const/4 v6, 0x0

    .line 213
    move-object v1, p2

    .line 214
    invoke-direct/range {v1 .. v6}, Lio/sentry/c4;-><init>(Lio/sentry/protocol/p;Lio/sentry/e4;Ljava/lang/String;Lio/sentry/e4;Lio/sentry/m4;)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {p2, v7}, Lio/sentry/c4;->k(Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {p2, v8}, Lio/sentry/c4;->m(Lio/sentry/f4;)V

    .line 221
    .line 222
    .line 223
    if-eqz v9, :cond_9

    .line 224
    .line 225
    iput-object v9, p2, Lio/sentry/c4;->r:Ljava/util/Map;

    .line 226
    .line 227
    :cond_9
    invoke-virtual {p2, v0}, Lio/sentry/c4;->n(Ljava/util/Map;)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {p1}, Lio/sentry/vendor/gson/stream/a;->s()V

    .line 231
    .line 232
    .line 233
    return-object p2

    .line 234
    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 235
    .line 236
    const-string v0, "Missing required field \"op\""

    .line 237
    .line 238
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    sget-object v1, Lio/sentry/n3;->ERROR:Lio/sentry/n3;

    .line 242
    .line 243
    invoke-interface {p2, v1, v0, p1}, Lio/sentry/g0;->b(Lio/sentry/n3;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 244
    .line 245
    .line 246
    throw p1

    .line 247
    :cond_b
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 248
    .line 249
    const-string v0, "Missing required field \"span_id\""

    .line 250
    .line 251
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    sget-object v1, Lio/sentry/n3;->ERROR:Lio/sentry/n3;

    .line 255
    .line 256
    invoke-interface {p2, v1, v0, p1}, Lio/sentry/g0;->b(Lio/sentry/n3;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 257
    .line 258
    .line 259
    throw p1

    .line 260
    :cond_c
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 261
    .line 262
    const-string v0, "Missing required field \"trace_id\""

    .line 263
    .line 264
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    sget-object v1, Lio/sentry/n3;->ERROR:Lio/sentry/n3;

    .line 268
    .line 269
    invoke-interface {p2, v1, v0, p1}, Lio/sentry/g0;->b(Lio/sentry/n3;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 270
    .line 271
    .line 272
    throw p1

    .line 273
    :sswitch_data_0
    .sparse-switch
        -0x77ea41d0 -> :sswitch_6
        -0x68c5dc65 -> :sswitch_5
        -0x66ca7c04 -> :sswitch_4
        -0x3532300e -> :sswitch_3
        0xde1 -> :sswitch_2
        0x363419 -> :sswitch_1
        0x4bb73e55 -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
