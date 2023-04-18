.class final Lxd/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:I

.field private final b:[B


# direct methods
.method private constructor <init>(I[B)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lxd/b;->a:I

    .line 5
    .line 6
    iput-object p2, p0, Lxd/b;->b:[B

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
.end method

.method static b([BLxd/j;Lxd/f;)[Lxd/b;
    .locals 12

    .line 1
    array-length v0, p0

    .line 2
    invoke-virtual {p1}, Lxd/j;->h()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-ne v0, v1, :cond_a

    .line 7
    .line 8
    invoke-virtual {p1, p2}, Lxd/j;->f(Lxd/f;)Lxd/j$b;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Lxd/j$b;->a()[Lxd/j$a;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    array-length v0, p2

    .line 17
    const/4 v1, 0x0

    .line 18
    move v2, v1

    .line 19
    move v3, v2

    .line 20
    :goto_0
    if-ge v2, v0, :cond_0

    .line 21
    .line 22
    aget-object v4, p2, v2

    .line 23
    .line 24
    invoke-virtual {v4}, Lxd/j$a;->a()I

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    add-int/2addr v3, v4

    .line 29
    add-int/lit8 v2, v2, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    new-array v0, v3, [Lxd/b;

    .line 33
    .line 34
    array-length v2, p2

    .line 35
    move v4, v1

    .line 36
    move v5, v4

    .line 37
    :goto_1
    if-ge v4, v2, :cond_2

    .line 38
    .line 39
    aget-object v6, p2, v4

    .line 40
    .line 41
    move v7, v1

    .line 42
    :goto_2
    invoke-virtual {v6}, Lxd/j$a;->a()I

    .line 43
    .line 44
    .line 45
    move-result v8

    .line 46
    if-ge v7, v8, :cond_1

    .line 47
    .line 48
    invoke-virtual {v6}, Lxd/j$a;->b()I

    .line 49
    .line 50
    .line 51
    move-result v8

    .line 52
    invoke-virtual {p1}, Lxd/j$b;->b()I

    .line 53
    .line 54
    .line 55
    move-result v9

    .line 56
    add-int/2addr v9, v8

    .line 57
    add-int/lit8 v10, v5, 0x1

    .line 58
    .line 59
    new-instance v11, Lxd/b;

    .line 60
    .line 61
    new-array v9, v9, [B

    .line 62
    .line 63
    invoke-direct {v11, v8, v9}, Lxd/b;-><init>(I[B)V

    .line 64
    .line 65
    .line 66
    aput-object v11, v0, v5

    .line 67
    .line 68
    add-int/lit8 v7, v7, 0x1

    .line 69
    .line 70
    move v5, v10

    .line 71
    goto :goto_2

    .line 72
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_2
    aget-object p2, v0, v1

    .line 76
    .line 77
    iget-object p2, p2, Lxd/b;->b:[B

    .line 78
    .line 79
    array-length p2, p2

    .line 80
    add-int/lit8 v3, v3, -0x1

    .line 81
    .line 82
    :goto_3
    if-ltz v3, :cond_3

    .line 83
    .line 84
    aget-object v2, v0, v3

    .line 85
    .line 86
    iget-object v2, v2, Lxd/b;->b:[B

    .line 87
    .line 88
    array-length v2, v2

    .line 89
    if-eq v2, p2, :cond_3

    .line 90
    .line 91
    add-int/lit8 v3, v3, -0x1

    .line 92
    .line 93
    goto :goto_3

    .line 94
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 95
    .line 96
    invoke-virtual {p1}, Lxd/j$b;->b()I

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    sub-int/2addr p2, p1

    .line 101
    move p1, v1

    .line 102
    move v2, p1

    .line 103
    :goto_4
    if-ge p1, p2, :cond_5

    .line 104
    .line 105
    move v4, v1

    .line 106
    :goto_5
    if-ge v4, v5, :cond_4

    .line 107
    .line 108
    aget-object v6, v0, v4

    .line 109
    .line 110
    iget-object v6, v6, Lxd/b;->b:[B

    .line 111
    .line 112
    add-int/lit8 v7, v2, 0x1

    .line 113
    .line 114
    aget-byte v2, p0, v2

    .line 115
    .line 116
    aput-byte v2, v6, p1

    .line 117
    .line 118
    add-int/lit8 v4, v4, 0x1

    .line 119
    .line 120
    move v2, v7

    .line 121
    goto :goto_5

    .line 122
    :cond_4
    add-int/lit8 p1, p1, 0x1

    .line 123
    .line 124
    goto :goto_4

    .line 125
    :cond_5
    move p1, v3

    .line 126
    :goto_6
    if-ge p1, v5, :cond_6

    .line 127
    .line 128
    aget-object v4, v0, p1

    .line 129
    .line 130
    iget-object v4, v4, Lxd/b;->b:[B

    .line 131
    .line 132
    add-int/lit8 v6, v2, 0x1

    .line 133
    .line 134
    aget-byte v2, p0, v2

    .line 135
    .line 136
    aput-byte v2, v4, p2

    .line 137
    .line 138
    add-int/lit8 p1, p1, 0x1

    .line 139
    .line 140
    move v2, v6

    .line 141
    goto :goto_6

    .line 142
    :cond_6
    aget-object p1, v0, v1

    .line 143
    .line 144
    iget-object p1, p1, Lxd/b;->b:[B

    .line 145
    .line 146
    array-length p1, p1

    .line 147
    :goto_7
    if-ge p2, p1, :cond_9

    .line 148
    .line 149
    move v4, v1

    .line 150
    :goto_8
    if-ge v4, v5, :cond_8

    .line 151
    .line 152
    if-ge v4, v3, :cond_7

    .line 153
    .line 154
    move v6, p2

    .line 155
    goto :goto_9

    .line 156
    :cond_7
    add-int/lit8 v6, p2, 0x1

    .line 157
    .line 158
    :goto_9
    aget-object v7, v0, v4

    .line 159
    .line 160
    iget-object v7, v7, Lxd/b;->b:[B

    .line 161
    .line 162
    add-int/lit8 v8, v2, 0x1

    .line 163
    .line 164
    aget-byte v2, p0, v2

    .line 165
    .line 166
    aput-byte v2, v7, v6

    .line 167
    .line 168
    add-int/lit8 v4, v4, 0x1

    .line 169
    .line 170
    move v2, v8

    .line 171
    goto :goto_8

    .line 172
    :cond_8
    add-int/lit8 p2, p2, 0x1

    .line 173
    .line 174
    goto :goto_7

    .line 175
    :cond_9
    return-object v0

    .line 176
    :cond_a
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 177
    .line 178
    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 179
    .line 180
    .line 181
    throw p0
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
.end method


# virtual methods
.method a()[B
    .locals 1

    iget-object v0, p0, Lxd/b;->b:[B

    return-object v0
.end method

.method c()I
    .locals 1

    iget v0, p0, Lxd/b;->a:I

    return v0
.end method
