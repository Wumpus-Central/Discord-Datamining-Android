.class Lnet/time4j/calendar/f$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfj/m0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/time4j/calendar/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<D:",
        "Lnet/time4j/calendar/f<",
        "*TD;>;>",
        "Ljava/lang/Object;",
        "Lfj/m0<",
        "TD;>;"
    }
.end annotation


# instance fields
.field private final a:I


# direct methods
.method constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lnet/time4j/calendar/f$c;->a:I

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
.end method

.method private static e(Lnet/time4j/calendar/f;Lnet/time4j/calendar/f;I)J
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<D:",
            "Lnet/time4j/calendar/f<",
            "*TD;>;>(TD;TD;I)J"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lnet/time4j/calendar/f;->Y()Lnet/time4j/calendar/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz p2, :cond_14

    .line 7
    .line 8
    const/16 v2, 0x3c

    .line 9
    .line 10
    if-eq p2, v1, :cond_f

    .line 11
    .line 12
    const/4 v3, 0x2

    .line 13
    if-eq p2, v3, :cond_2

    .line 14
    .line 15
    const/4 v0, 0x3

    .line 16
    if-eq p2, v0, :cond_1

    .line 17
    .line 18
    const/4 v0, 0x4

    .line 19
    if-ne p2, v0, :cond_0

    .line 20
    .line 21
    invoke-virtual {p1}, Lnet/time4j/calendar/f;->b()J

    .line 22
    .line 23
    .line 24
    move-result-wide p1

    .line 25
    invoke-virtual {p0}, Lnet/time4j/calendar/f;->b()J

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    sub-long/2addr p1, v0

    .line 30
    return-wide p1

    .line 31
    :cond_0
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 32
    .line 33
    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 34
    .line 35
    .line 36
    throw p0

    .line 37
    :cond_1
    invoke-virtual {p1}, Lnet/time4j/calendar/f;->b()J

    .line 38
    .line 39
    .line 40
    move-result-wide p1

    .line 41
    invoke-virtual {p0}, Lnet/time4j/calendar/f;->b()J

    .line 42
    .line 43
    .line 44
    move-result-wide v0

    .line 45
    sub-long/2addr p1, v0

    .line 46
    const-wide/16 v0, 0x7

    .line 47
    .line 48
    div-long/2addr p1, v0

    .line 49
    return-wide p1

    .line 50
    :cond_2
    invoke-virtual {p0, p1}, Lfj/m;->S(Lfj/g;)Z

    .line 51
    .line 52
    .line 53
    move-result p2

    .line 54
    if-eqz p2, :cond_3

    .line 55
    .line 56
    move-object v4, p0

    .line 57
    move-object v3, p1

    .line 58
    goto :goto_0

    .line 59
    :cond_3
    move-object v3, p0

    .line 60
    move-object v4, p1

    .line 61
    :goto_0
    invoke-virtual {v3}, Lnet/time4j/calendar/f;->Z()I

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    invoke-virtual {v3}, Lnet/time4j/calendar/f;->j0()Lnet/time4j/calendar/c;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-virtual {p1}, Lnet/time4j/calendar/o;->getNumber()I

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    invoke-virtual {v3}, Lnet/time4j/calendar/f;->f0()Lnet/time4j/calendar/h;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    invoke-virtual {v5}, Lnet/time4j/calendar/h;->getNumber()I

    .line 78
    .line 79
    .line 80
    move-result v6

    .line 81
    invoke-virtual {v5}, Lnet/time4j/calendar/h;->c()Z

    .line 82
    .line 83
    .line 84
    move-result v7

    .line 85
    invoke-virtual {v0, p0, p1}, Lnet/time4j/calendar/d;->g(II)I

    .line 86
    .line 87
    .line 88
    move-result v8

    .line 89
    const/4 v9, 0x0

    .line 90
    move v10, v9

    .line 91
    :goto_1
    invoke-virtual {v4}, Lnet/time4j/calendar/f;->Z()I

    .line 92
    .line 93
    .line 94
    move-result v11

    .line 95
    if-ne p0, v11, :cond_7

    .line 96
    .line 97
    invoke-virtual {v4}, Lnet/time4j/calendar/f;->j0()Lnet/time4j/calendar/c;

    .line 98
    .line 99
    .line 100
    move-result-object v11

    .line 101
    invoke-virtual {v11}, Lnet/time4j/calendar/o;->getNumber()I

    .line 102
    .line 103
    .line 104
    move-result v11

    .line 105
    if-ne p1, v11, :cond_7

    .line 106
    .line 107
    invoke-virtual {v4}, Lnet/time4j/calendar/f;->f0()Lnet/time4j/calendar/h;

    .line 108
    .line 109
    .line 110
    move-result-object v11

    .line 111
    invoke-virtual {v5, v11}, Lnet/time4j/calendar/h;->equals(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v5

    .line 115
    if-nez v5, :cond_4

    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_4
    if-lez v10, :cond_5

    .line 119
    .line 120
    invoke-virtual {v3}, Lnet/time4j/calendar/f;->p()I

    .line 121
    .line 122
    .line 123
    move-result p0

    .line 124
    invoke-virtual {v4}, Lnet/time4j/calendar/f;->p()I

    .line 125
    .line 126
    .line 127
    move-result p1

    .line 128
    if-le p0, p1, :cond_5

    .line 129
    .line 130
    add-int/lit8 v10, v10, -0x1

    .line 131
    .line 132
    :cond_5
    if-eqz p2, :cond_6

    .line 133
    .line 134
    neg-int v10, v10

    .line 135
    :cond_6
    int-to-long p0, v10

    .line 136
    return-wide p0

    .line 137
    :cond_7
    :goto_2
    if-eqz v7, :cond_8

    .line 138
    .line 139
    add-int/lit8 v6, v6, 0x1

    .line 140
    .line 141
    move v7, v9

    .line 142
    goto :goto_3

    .line 143
    :cond_8
    if-ne v8, v6, :cond_9

    .line 144
    .line 145
    move v7, v1

    .line 146
    goto :goto_3

    .line 147
    :cond_9
    add-int/lit8 v6, v6, 0x1

    .line 148
    .line 149
    :goto_3
    if-nez v7, :cond_d

    .line 150
    .line 151
    const/16 v5, 0xd

    .line 152
    .line 153
    if-ne v6, v5, :cond_b

    .line 154
    .line 155
    add-int/lit8 p1, p1, 0x1

    .line 156
    .line 157
    const/16 v5, 0x3d

    .line 158
    .line 159
    if-ne p1, v5, :cond_a

    .line 160
    .line 161
    add-int/lit8 p0, p0, 0x1

    .line 162
    .line 163
    move p1, v1

    .line 164
    :cond_a
    invoke-virtual {v0, p0, p1}, Lnet/time4j/calendar/d;->g(II)I

    .line 165
    .line 166
    .line 167
    move-result v5

    .line 168
    move v6, v1

    .line 169
    :goto_4
    move v8, v5

    .line 170
    goto :goto_5

    .line 171
    :cond_b
    if-nez v6, :cond_d

    .line 172
    .line 173
    add-int/lit8 p1, p1, -0x1

    .line 174
    .line 175
    if-nez p1, :cond_c

    .line 176
    .line 177
    add-int/lit8 p0, p0, -0x1

    .line 178
    .line 179
    move p1, v2

    .line 180
    :cond_c
    invoke-virtual {v0, p0, p1}, Lnet/time4j/calendar/d;->g(II)I

    .line 181
    .line 182
    .line 183
    move-result v5

    .line 184
    const/16 v6, 0xc

    .line 185
    .line 186
    goto :goto_4

    .line 187
    :cond_d
    :goto_5
    invoke-static {v6}, Lnet/time4j/calendar/h;->e(I)Lnet/time4j/calendar/h;

    .line 188
    .line 189
    .line 190
    move-result-object v5

    .line 191
    if-eqz v7, :cond_e

    .line 192
    .line 193
    invoke-virtual {v5}, Lnet/time4j/calendar/h;->f()Lnet/time4j/calendar/h;

    .line 194
    .line 195
    .line 196
    move-result-object v5

    .line 197
    :cond_e
    add-int/lit8 v10, v10, 0x1

    .line 198
    .line 199
    goto :goto_1

    .line 200
    :cond_f
    invoke-virtual {p1}, Lnet/time4j/calendar/f;->Z()I

    .line 201
    .line 202
    .line 203
    move-result p2

    .line 204
    mul-int/2addr p2, v2

    .line 205
    invoke-virtual {p1}, Lnet/time4j/calendar/f;->j0()Lnet/time4j/calendar/c;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    invoke-virtual {v0}, Lnet/time4j/calendar/o;->getNumber()I

    .line 210
    .line 211
    .line 212
    move-result v0

    .line 213
    add-int/2addr p2, v0

    .line 214
    invoke-virtual {p0}, Lnet/time4j/calendar/f;->Z()I

    .line 215
    .line 216
    .line 217
    move-result v0

    .line 218
    mul-int/2addr v0, v2

    .line 219
    sub-int/2addr p2, v0

    .line 220
    invoke-virtual {p0}, Lnet/time4j/calendar/f;->j0()Lnet/time4j/calendar/c;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    invoke-virtual {v0}, Lnet/time4j/calendar/o;->getNumber()I

    .line 225
    .line 226
    .line 227
    move-result v0

    .line 228
    sub-int/2addr p2, v0

    .line 229
    if-lez p2, :cond_11

    .line 230
    .line 231
    invoke-virtual {p0}, Lnet/time4j/calendar/f;->f0()Lnet/time4j/calendar/h;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    invoke-virtual {p1}, Lnet/time4j/calendar/f;->f0()Lnet/time4j/calendar/h;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    invoke-virtual {v0, v1}, Lnet/time4j/calendar/h;->a(Lnet/time4j/calendar/h;)I

    .line 240
    .line 241
    .line 242
    move-result v0

    .line 243
    if-gtz v0, :cond_10

    .line 244
    .line 245
    if-nez v0, :cond_13

    .line 246
    .line 247
    invoke-virtual {p0}, Lnet/time4j/calendar/f;->p()I

    .line 248
    .line 249
    .line 250
    move-result p0

    .line 251
    invoke-virtual {p1}, Lnet/time4j/calendar/f;->p()I

    .line 252
    .line 253
    .line 254
    move-result p1

    .line 255
    if-le p0, p1, :cond_13

    .line 256
    .line 257
    :cond_10
    add-int/lit8 p2, p2, -0x1

    .line 258
    .line 259
    goto :goto_6

    .line 260
    :cond_11
    if-gez p2, :cond_13

    .line 261
    .line 262
    invoke-virtual {p0}, Lnet/time4j/calendar/f;->f0()Lnet/time4j/calendar/h;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    invoke-virtual {p1}, Lnet/time4j/calendar/f;->f0()Lnet/time4j/calendar/h;

    .line 267
    .line 268
    .line 269
    move-result-object v1

    .line 270
    invoke-virtual {v0, v1}, Lnet/time4j/calendar/h;->a(Lnet/time4j/calendar/h;)I

    .line 271
    .line 272
    .line 273
    move-result v0

    .line 274
    if-ltz v0, :cond_12

    .line 275
    .line 276
    if-nez v0, :cond_13

    .line 277
    .line 278
    invoke-virtual {p0}, Lnet/time4j/calendar/f;->p()I

    .line 279
    .line 280
    .line 281
    move-result p0

    .line 282
    invoke-virtual {p1}, Lnet/time4j/calendar/f;->p()I

    .line 283
    .line 284
    .line 285
    move-result p1

    .line 286
    if-ge p0, p1, :cond_13

    .line 287
    .line 288
    :cond_12
    add-int/lit8 p2, p2, 0x1

    .line 289
    .line 290
    :cond_13
    :goto_6
    int-to-long p0, p2

    .line 291
    return-wide p0

    .line 292
    :cond_14
    invoke-static {p0, p1, v1}, Lnet/time4j/calendar/f$c;->e(Lnet/time4j/calendar/f;Lnet/time4j/calendar/f;I)J

    .line 293
    .line 294
    .line 295
    move-result-wide p0

    .line 296
    const-wide/16 v0, 0x3c

    .line 297
    .line 298
    div-long/2addr p0, v0

    .line 299
    return-wide p0
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

.method private static f(J)V
    .locals 2

    const-wide/16 v0, 0x4b0

    cmp-long v0, p0, v0

    if-gtz v0, :cond_0

    const-wide/16 v0, -0x4b0

    cmp-long p0, p0, v0

    if-ltz p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/lang/ArithmeticException;

    const-string p1, "Month arithmetic limited to delta not greater than 1200."

    invoke-direct {p0, p1}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static g(IILnet/time4j/calendar/h;ILnet/time4j/calendar/d;)Lnet/time4j/calendar/f;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<D:",
            "Lnet/time4j/calendar/f<",
            "*TD;>;>(II",
            "Lnet/time4j/calendar/h;",
            "I",
            "Lnet/time4j/calendar/d<",
            "TD;>;)TD;"
        }
    .end annotation

    .line 1
    const/16 v0, 0x1d

    .line 2
    .line 3
    if-gt p3, v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p4, p0, p1, p2, p3}, Lnet/time4j/calendar/d;->t(IILnet/time4j/calendar/h;I)J

    .line 6
    .line 7
    .line 8
    move-result-wide v6

    .line 9
    move-object v1, p4

    .line 10
    move v2, p0

    .line 11
    move v3, p1

    .line 12
    move-object v4, p2

    .line 13
    move v5, p3

    .line 14
    invoke-virtual/range {v1 .. v7}, Lnet/time4j/calendar/d;->e(IILnet/time4j/calendar/h;IJ)Lnet/time4j/calendar/f;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0

    .line 19
    :cond_0
    const/4 v0, 0x1

    .line 20
    invoke-virtual {p4, p0, p1, p2, v0}, Lnet/time4j/calendar/d;->t(IILnet/time4j/calendar/h;I)J

    .line 21
    .line 22
    .line 23
    move-result-wide v0

    .line 24
    invoke-virtual {p4, v0, v1}, Lnet/time4j/calendar/d;->v(J)Lnet/time4j/calendar/f;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v2}, Lnet/time4j/calendar/f;->lengthOfMonth()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    invoke-static {p3, v2}, Ljava/lang/Math;->min(II)I

    .line 33
    .line 34
    .line 35
    move-result v7

    .line 36
    int-to-long v2, v7

    .line 37
    add-long/2addr v0, v2

    .line 38
    const-wide/16 v2, 0x1

    .line 39
    .line 40
    sub-long v8, v0, v2

    .line 41
    .line 42
    move-object v3, p4

    .line 43
    move v4, p0

    .line 44
    move v5, p1

    .line 45
    move-object v6, p2

    .line 46
    invoke-virtual/range {v3 .. v9}, Lnet/time4j/calendar/d;->e(IILnet/time4j/calendar/h;IJ)Lnet/time4j/calendar/f;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0
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
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;)J
    .locals 0

    check-cast p1, Lnet/time4j/calendar/f;

    check-cast p2, Lnet/time4j/calendar/f;

    invoke-virtual {p0, p1, p2}, Lnet/time4j/calendar/f$c;->d(Lnet/time4j/calendar/f;Lnet/time4j/calendar/f;)J

    move-result-wide p1

    return-wide p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnet/time4j/calendar/f;

    invoke-virtual {p0, p1, p2, p3}, Lnet/time4j/calendar/f$c;->c(Lnet/time4j/calendar/f;J)Lnet/time4j/calendar/f;

    move-result-object p1

    return-object p1
.end method

.method public c(Lnet/time4j/calendar/f;J)Lnet/time4j/calendar/f;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TD;J)TD;"
        }
    .end annotation

    .line 1
    move-wide/from16 v0, p2

    .line 2
    .line 3
    invoke-virtual/range {p1 .. p1}, Lnet/time4j/calendar/f;->Y()Lnet/time4j/calendar/d;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    invoke-virtual/range {p1 .. p1}, Lnet/time4j/calendar/f;->p()I

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    invoke-virtual/range {p1 .. p1}, Lnet/time4j/calendar/f;->Z()I

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    invoke-virtual/range {p1 .. p1}, Lnet/time4j/calendar/f;->j0()Lnet/time4j/calendar/c;

    .line 16
    .line 17
    .line 18
    move-result-object v5

    .line 19
    invoke-virtual {v5}, Lnet/time4j/calendar/o;->getNumber()I

    .line 20
    .line 21
    .line 22
    move-result v5

    .line 23
    invoke-virtual/range {p1 .. p1}, Lnet/time4j/calendar/f;->f0()Lnet/time4j/calendar/h;

    .line 24
    .line 25
    .line 26
    move-result-object v6

    .line 27
    move-object/from16 v7, p0

    .line 28
    .line 29
    iget v8, v7, Lnet/time4j/calendar/f$c;->a:I

    .line 30
    .line 31
    const/16 v9, 0x3c

    .line 32
    .line 33
    const/4 v10, 0x1

    .line 34
    if-eqz v8, :cond_e

    .line 35
    .line 36
    if-eq v8, v10, :cond_f

    .line 37
    .line 38
    const/4 v11, 0x2

    .line 39
    if-eq v8, v11, :cond_2

    .line 40
    .line 41
    const/4 v3, 0x3

    .line 42
    if-eq v8, v3, :cond_1

    .line 43
    .line 44
    const/4 v3, 0x4

    .line 45
    if-ne v8, v3, :cond_0

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 49
    .line 50
    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 51
    .line 52
    .line 53
    throw v0

    .line 54
    :cond_1
    const-wide/16 v3, 0x7

    .line 55
    .line 56
    invoke-static {v0, v1, v3, v4}, Lnet/time4j/base/c;->i(JJ)J

    .line 57
    .line 58
    .line 59
    move-result-wide v0

    .line 60
    :goto_0
    invoke-virtual/range {p1 .. p1}, Lnet/time4j/calendar/f;->b()J

    .line 61
    .line 62
    .line 63
    move-result-wide v3

    .line 64
    invoke-static {v3, v4, v0, v1}, Lnet/time4j/base/c;->f(JJ)J

    .line 65
    .line 66
    .line 67
    move-result-wide v0

    .line 68
    invoke-virtual {v2, v0, v1}, Lnet/time4j/calendar/d;->v(J)Lnet/time4j/calendar/f;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    return-object v0

    .line 73
    :cond_2
    invoke-static/range {p2 .. p3}, Lnet/time4j/calendar/f$c;->f(J)V

    .line 74
    .line 75
    .line 76
    const-wide/16 v11, 0x0

    .line 77
    .line 78
    cmp-long v8, v0, v11

    .line 79
    .line 80
    const/4 v13, -0x1

    .line 81
    if-lez v8, :cond_3

    .line 82
    .line 83
    move v8, v10

    .line 84
    goto :goto_1

    .line 85
    :cond_3
    move v8, v13

    .line 86
    :goto_1
    invoke-virtual {v6}, Lnet/time4j/calendar/h;->getNumber()I

    .line 87
    .line 88
    .line 89
    move-result v14

    .line 90
    invoke-virtual {v6}, Lnet/time4j/calendar/h;->c()Z

    .line 91
    .line 92
    .line 93
    move-result v6

    .line 94
    invoke-virtual {v2, v4, v5}, Lnet/time4j/calendar/d;->g(II)I

    .line 95
    .line 96
    .line 97
    move-result v15

    .line 98
    :goto_2
    cmp-long v16, v0, v11

    .line 99
    .line 100
    if-eqz v16, :cond_c

    .line 101
    .line 102
    if-eqz v6, :cond_4

    .line 103
    .line 104
    const/4 v6, 0x0

    .line 105
    if-ne v8, v10, :cond_7

    .line 106
    .line 107
    add-int/lit8 v14, v14, 0x1

    .line 108
    .line 109
    goto :goto_4

    .line 110
    :cond_4
    if-ne v8, v10, :cond_5

    .line 111
    .line 112
    if-ne v15, v14, :cond_5

    .line 113
    .line 114
    :goto_3
    move v6, v10

    .line 115
    goto :goto_4

    .line 116
    :cond_5
    if-ne v8, v13, :cond_6

    .line 117
    .line 118
    add-int/lit8 v11, v14, -0x1

    .line 119
    .line 120
    if-ne v15, v11, :cond_6

    .line 121
    .line 122
    add-int/lit8 v14, v14, -0x1

    .line 123
    .line 124
    goto :goto_3

    .line 125
    :cond_6
    add-int/2addr v14, v8

    .line 126
    :cond_7
    :goto_4
    if-nez v6, :cond_b

    .line 127
    .line 128
    const/16 v11, 0xd

    .line 129
    .line 130
    if-ne v14, v11, :cond_9

    .line 131
    .line 132
    add-int/lit8 v5, v5, 0x1

    .line 133
    .line 134
    const/16 v11, 0x3d

    .line 135
    .line 136
    if-ne v5, v11, :cond_8

    .line 137
    .line 138
    add-int/lit8 v4, v4, 0x1

    .line 139
    .line 140
    move v5, v10

    .line 141
    :cond_8
    invoke-virtual {v2, v4, v5}, Lnet/time4j/calendar/d;->g(II)I

    .line 142
    .line 143
    .line 144
    move-result v11

    .line 145
    move v14, v10

    .line 146
    move v15, v11

    .line 147
    goto :goto_5

    .line 148
    :cond_9
    if-nez v14, :cond_b

    .line 149
    .line 150
    add-int/lit8 v5, v5, -0x1

    .line 151
    .line 152
    if-nez v5, :cond_a

    .line 153
    .line 154
    add-int/lit8 v4, v4, -0x1

    .line 155
    .line 156
    move v5, v9

    .line 157
    :cond_a
    invoke-virtual {v2, v4, v5}, Lnet/time4j/calendar/d;->g(II)I

    .line 158
    .line 159
    .line 160
    move-result v11

    .line 161
    const/16 v12, 0xc

    .line 162
    .line 163
    move v15, v11

    .line 164
    move v14, v12

    .line 165
    :cond_b
    :goto_5
    int-to-long v11, v8

    .line 166
    sub-long/2addr v0, v11

    .line 167
    const-wide/16 v11, 0x0

    .line 168
    .line 169
    goto :goto_2

    .line 170
    :cond_c
    invoke-static {v14}, Lnet/time4j/calendar/h;->e(I)Lnet/time4j/calendar/h;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    if-eqz v6, :cond_d

    .line 175
    .line 176
    invoke-virtual {v0}, Lnet/time4j/calendar/h;->f()Lnet/time4j/calendar/h;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    :cond_d
    invoke-static {v4, v5, v0, v3, v2}, Lnet/time4j/calendar/f$c;->g(IILnet/time4j/calendar/h;ILnet/time4j/calendar/d;)Lnet/time4j/calendar/f;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    return-object v0

    .line 185
    :cond_e
    const-wide/16 v11, 0x3c

    .line 186
    .line 187
    invoke-static {v0, v1, v11, v12}, Lnet/time4j/base/c;->i(JJ)J

    .line 188
    .line 189
    .line 190
    move-result-wide v0

    .line 191
    :cond_f
    mul-int/2addr v4, v9

    .line 192
    add-int/2addr v4, v5

    .line 193
    sub-int/2addr v4, v10

    .line 194
    int-to-long v4, v4

    .line 195
    invoke-static {v4, v5, v0, v1}, Lnet/time4j/base/c;->f(JJ)J

    .line 196
    .line 197
    .line 198
    move-result-wide v0

    .line 199
    invoke-static {v0, v1, v9}, Lnet/time4j/base/c;->b(JI)J

    .line 200
    .line 201
    .line 202
    move-result-wide v4

    .line 203
    invoke-static {v4, v5}, Lnet/time4j/base/c;->g(J)I

    .line 204
    .line 205
    .line 206
    move-result v4

    .line 207
    invoke-static {v0, v1, v9}, Lnet/time4j/base/c;->d(JI)I

    .line 208
    .line 209
    .line 210
    move-result v0

    .line 211
    add-int/2addr v0, v10

    .line 212
    invoke-virtual {v6}, Lnet/time4j/calendar/h;->c()Z

    .line 213
    .line 214
    .line 215
    move-result v1

    .line 216
    if-eqz v1, :cond_10

    .line 217
    .line 218
    invoke-virtual {v2, v4, v0}, Lnet/time4j/calendar/d;->g(II)I

    .line 219
    .line 220
    .line 221
    move-result v1

    .line 222
    invoke-virtual {v6}, Lnet/time4j/calendar/h;->getNumber()I

    .line 223
    .line 224
    .line 225
    move-result v5

    .line 226
    if-eq v1, v5, :cond_10

    .line 227
    .line 228
    invoke-virtual {v6}, Lnet/time4j/calendar/h;->getNumber()I

    .line 229
    .line 230
    .line 231
    move-result v1

    .line 232
    invoke-static {v1}, Lnet/time4j/calendar/h;->e(I)Lnet/time4j/calendar/h;

    .line 233
    .line 234
    .line 235
    move-result-object v6

    .line 236
    :cond_10
    invoke-static {v4, v0, v6, v3, v2}, Lnet/time4j/calendar/f$c;->g(IILnet/time4j/calendar/h;ILnet/time4j/calendar/d;)Lnet/time4j/calendar/f;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    return-object v0
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

.method public d(Lnet/time4j/calendar/f;Lnet/time4j/calendar/f;)J
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TD;TD;)J"
        }
    .end annotation

    iget v0, p0, Lnet/time4j/calendar/f$c;->a:I

    invoke-static {p1, p2, v0}, Lnet/time4j/calendar/f$c;->e(Lnet/time4j/calendar/f;Lnet/time4j/calendar/f;I)J

    move-result-wide p1

    return-wide p1
.end method
