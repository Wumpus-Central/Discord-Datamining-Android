.class Lcom/facebook/react/uimanager/events/EventDispatcherImpl$DispatchEventsRunnable;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/uimanager/events/EventDispatcherImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "DispatchEventsRunnable"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/react/uimanager/events/EventDispatcherImpl;


# direct methods
.method private constructor <init>(Lcom/facebook/react/uimanager/events/EventDispatcherImpl;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl$DispatchEventsRunnable;->this$0:Lcom/facebook/react/uimanager/events/EventDispatcherImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/react/uimanager/events/EventDispatcherImpl;Lcom/facebook/react/uimanager/events/EventDispatcherImpl$1;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/facebook/react/uimanager/events/EventDispatcherImpl$DispatchEventsRunnable;-><init>(Lcom/facebook/react/uimanager/events/EventDispatcherImpl;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 1
    const-string v0, "DispatchEventsRunnable"

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    invoke-static {v1, v2, v0}, Lg6/a;->c(JLjava/lang/String;)V

    .line 6
    .line 7
    .line 8
    :try_start_0
    const-string v0, "ScheduleDispatchFrameCallback"

    .line 9
    .line 10
    iget-object v3, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl$DispatchEventsRunnable;->this$0:Lcom/facebook/react/uimanager/events/EventDispatcherImpl;

    .line 11
    .line 12
    invoke-static {v3}, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->access$500(Lcom/facebook/react/uimanager/events/EventDispatcherImpl;)Ljava/util/concurrent/atomic/AtomicInteger;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    invoke-static {v1, v2, v0, v3}, Lg6/a;->d(JLjava/lang/String;I)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl$DispatchEventsRunnable;->this$0:Lcom/facebook/react/uimanager/events/EventDispatcherImpl;

    .line 24
    .line 25
    const/4 v3, 0x0

    .line 26
    invoke-static {v0, v3}, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->access$402(Lcom/facebook/react/uimanager/events/EventDispatcherImpl;Z)Z

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl$DispatchEventsRunnable;->this$0:Lcom/facebook/react/uimanager/events/EventDispatcherImpl;

    .line 30
    .line 31
    invoke-static {v0}, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->access$900(Lcom/facebook/react/uimanager/events/EventDispatcherImpl;)Lcom/facebook/react/uimanager/events/ReactEventEmitter;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-static {v0}, Lc6/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl$DispatchEventsRunnable;->this$0:Lcom/facebook/react/uimanager/events/EventDispatcherImpl;

    .line 39
    .line 40
    invoke-static {v0}, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->access$1000(Lcom/facebook/react/uimanager/events/EventDispatcherImpl;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 45
    :try_start_1
    iget-object v4, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl$DispatchEventsRunnable;->this$0:Lcom/facebook/react/uimanager/events/EventDispatcherImpl;

    .line 46
    .line 47
    invoke-static {v4}, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->access$1100(Lcom/facebook/react/uimanager/events/EventDispatcherImpl;)I

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    if-lez v4, :cond_3

    .line 52
    .line 53
    iget-object v4, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl$DispatchEventsRunnable;->this$0:Lcom/facebook/react/uimanager/events/EventDispatcherImpl;

    .line 54
    .line 55
    invoke-static {v4}, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->access$1100(Lcom/facebook/react/uimanager/events/EventDispatcherImpl;)I

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    const/4 v5, 0x1

    .line 60
    if-le v4, v5, :cond_0

    .line 61
    .line 62
    iget-object v4, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl$DispatchEventsRunnable;->this$0:Lcom/facebook/react/uimanager/events/EventDispatcherImpl;

    .line 63
    .line 64
    invoke-static {v4}, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->access$1200(Lcom/facebook/react/uimanager/events/EventDispatcherImpl;)[Lcom/facebook/react/uimanager/events/Event;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    iget-object v5, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl$DispatchEventsRunnable;->this$0:Lcom/facebook/react/uimanager/events/EventDispatcherImpl;

    .line 69
    .line 70
    invoke-static {v5}, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->access$1100(Lcom/facebook/react/uimanager/events/EventDispatcherImpl;)I

    .line 71
    .line 72
    .line 73
    move-result v5

    .line 74
    invoke-static {}, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->access$1300()Ljava/util/Comparator;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    invoke-static {v4, v3, v5, v6}, Ljava/util/Arrays;->sort([Ljava/lang/Object;IILjava/util/Comparator;)V

    .line 79
    .line 80
    .line 81
    :cond_0
    :goto_0
    iget-object v4, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl$DispatchEventsRunnable;->this$0:Lcom/facebook/react/uimanager/events/EventDispatcherImpl;

    .line 82
    .line 83
    invoke-static {v4}, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->access$1100(Lcom/facebook/react/uimanager/events/EventDispatcherImpl;)I

    .line 84
    .line 85
    .line 86
    move-result v4

    .line 87
    if-ge v3, v4, :cond_2

    .line 88
    .line 89
    iget-object v4, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl$DispatchEventsRunnable;->this$0:Lcom/facebook/react/uimanager/events/EventDispatcherImpl;

    .line 90
    .line 91
    invoke-static {v4}, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->access$1200(Lcom/facebook/react/uimanager/events/EventDispatcherImpl;)[Lcom/facebook/react/uimanager/events/Event;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    aget-object v4, v4, v3

    .line 96
    .line 97
    if-nez v4, :cond_1

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_1
    invoke-virtual {v4}, Lcom/facebook/react/uimanager/events/Event;->getEventName()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v5

    .line 104
    invoke-virtual {v4}, Lcom/facebook/react/uimanager/events/Event;->getUniqueID()I

    .line 105
    .line 106
    .line 107
    move-result v6

    .line 108
    invoke-static {v1, v2, v5, v6}, Lg6/a;->d(JLjava/lang/String;I)V

    .line 109
    .line 110
    .line 111
    iget-object v5, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl$DispatchEventsRunnable;->this$0:Lcom/facebook/react/uimanager/events/EventDispatcherImpl;

    .line 112
    .line 113
    invoke-static {v5}, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->access$900(Lcom/facebook/react/uimanager/events/EventDispatcherImpl;)Lcom/facebook/react/uimanager/events/ReactEventEmitter;

    .line 114
    .line 115
    .line 116
    move-result-object v5

    .line 117
    invoke-virtual {v4, v5}, Lcom/facebook/react/uimanager/events/Event;->dispatchModern(Lcom/facebook/react/uimanager/events/RCTModernEventEmitter;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v4}, Lcom/facebook/react/uimanager/events/Event;->dispose()V

    .line 121
    .line 122
    .line 123
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_2
    iget-object v3, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl$DispatchEventsRunnable;->this$0:Lcom/facebook/react/uimanager/events/EventDispatcherImpl;

    .line 127
    .line 128
    invoke-static {v3}, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->access$1400(Lcom/facebook/react/uimanager/events/EventDispatcherImpl;)V

    .line 129
    .line 130
    .line 131
    iget-object v3, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl$DispatchEventsRunnable;->this$0:Lcom/facebook/react/uimanager/events/EventDispatcherImpl;

    .line 132
    .line 133
    invoke-static {v3}, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->access$1500(Lcom/facebook/react/uimanager/events/EventDispatcherImpl;)Landroid/util/LongSparseArray;

    .line 134
    .line 135
    .line 136
    move-result-object v3

    .line 137
    invoke-virtual {v3}, Landroid/util/LongSparseArray;->clear()V

    .line 138
    .line 139
    .line 140
    :cond_3
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 141
    :try_start_2
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl$DispatchEventsRunnable;->this$0:Lcom/facebook/react/uimanager/events/EventDispatcherImpl;

    .line 142
    .line 143
    invoke-static {v0}, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->access$1600(Lcom/facebook/react/uimanager/events/EventDispatcherImpl;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 152
    .line 153
    .line 154
    move-result v3

    .line 155
    if-eqz v3, :cond_4

    .line 156
    .line 157
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v3

    .line 161
    check-cast v3, Lcom/facebook/react/uimanager/events/BatchEventDispatchedListener;

    .line 162
    .line 163
    invoke-interface {v3}, Lcom/facebook/react/uimanager/events/BatchEventDispatchedListener;->onBatchEventDispatched()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 164
    .line 165
    .line 166
    goto :goto_2

    .line 167
    :cond_4
    invoke-static {v1, v2}, Lg6/a;->g(J)V

    .line 168
    .line 169
    .line 170
    return-void

    .line 171
    :catchall_0
    move-exception v3

    .line 172
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 173
    :try_start_4
    throw v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 174
    :catchall_1
    move-exception v0

    .line 175
    invoke-static {v1, v2}, Lg6/a;->g(J)V

    .line 176
    .line 177
    .line 178
    throw v0
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
.end method
