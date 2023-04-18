.class Lnet/time4j/history/l$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfj/z;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/time4j/history/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<C:",
        "Lfj/q<",
        "TC;>;>",
        "Ljava/lang/Object;",
        "Lfj/z<",
        "TC;",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# instance fields
.field private final k:I

.field private final l:Lnet/time4j/history/d;


# direct methods
.method constructor <init>(ILnet/time4j/history/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lnet/time4j/history/l$a;->k:I

    .line 5
    .line 6
    iput-object p2, p0, Lnet/time4j/history/l$a;->l:Lnet/time4j/history/d;

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

.method private b(Lfj/q;I)Lnet/time4j/history/h;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TC;I)",
            "Lnet/time4j/history/h;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lnet/time4j/history/l$a;->l:Lnet/time4j/history/d;

    .line 2
    .line 3
    sget-object v1, Lnet/time4j/f0;->y:Lnet/time4j/e;

    .line 4
    .line 5
    invoke-virtual {p1, v1}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lnet/time4j/f0;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lnet/time4j/history/d;->e(Lnet/time4j/f0;)Lnet/time4j/history/h;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    sget-object v4, Ljj/a;->k:Ljj/a;

    .line 16
    .line 17
    iget-object v0, p0, Lnet/time4j/history/l$a;->l:Lnet/time4j/history/d;

    .line 18
    .line 19
    invoke-virtual {v0}, Lnet/time4j/history/d;->w()Lnet/time4j/history/o;

    .line 20
    .line 21
    .line 22
    move-result-object v10

    .line 23
    iget v0, p0, Lnet/time4j/history/l$a;->k:I

    .line 24
    .line 25
    const/4 v1, 0x1

    .line 26
    packed-switch v0, :pswitch_data_0

    .line 27
    .line 28
    .line 29
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 30
    .line 31
    new-instance p2, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 34
    .line 35
    .line 36
    const-string v0, "Unknown element index: "

    .line 37
    .line 38
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    iget v0, p0, Lnet/time4j/history/l$a;->k:I

    .line 42
    .line 43
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p1

    .line 54
    :pswitch_0
    invoke-virtual {p1}, Lnet/time4j/history/h;->f()I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    const/16 v2, 0x64

    .line 59
    .line 60
    rem-int/2addr v0, v2

    .line 61
    sub-int/2addr p2, v1

    .line 62
    mul-int/2addr p2, v2

    .line 63
    if-nez v0, :cond_0

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_0
    move v2, v0

    .line 67
    :goto_0
    add-int v1, p2, v2

    .line 68
    .line 69
    invoke-virtual {p1}, Lnet/time4j/history/h;->c()Lnet/time4j/history/j;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-virtual {p1}, Lnet/time4j/history/h;->e()I

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    invoke-virtual {p1}, Lnet/time4j/history/h;->b()I

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    move-object v5, v10

    .line 82
    invoke-static/range {v0 .. v5}, Lnet/time4j/history/h;->j(Lnet/time4j/history/j;IIILjj/a;Lnet/time4j/history/o;)Lnet/time4j/history/h;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    iget-object p2, p0, Lnet/time4j/history/l$a;->l:Lnet/time4j/history/d;

    .line 87
    .line 88
    invoke-virtual {p2, p1}, Lnet/time4j/history/d;->a(Lnet/time4j/history/h;)Lnet/time4j/history/h;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    goto/16 :goto_3

    .line 93
    .line 94
    :pswitch_1
    const/4 v1, 0x6

    .line 95
    if-ne v0, v1, :cond_1

    .line 96
    .line 97
    sget-object v0, Ljj/a;->l:Ljj/a;

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_1
    sget-object v0, Ljj/a;->m:Ljj/a;

    .line 101
    .line 102
    :goto_1
    move-object v4, v0

    .line 103
    goto/16 :goto_2

    .line 104
    .line 105
    :pswitch_2
    iget-object v0, p0, Lnet/time4j/history/l$a;->l:Lnet/time4j/history/d;

    .line 106
    .line 107
    invoke-virtual {v0}, Lnet/time4j/history/d;->w()Lnet/time4j/history/o;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-virtual {p1, v0}, Lnet/time4j/history/h;->h(Lnet/time4j/history/o;)I

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    iget-object v2, p0, Lnet/time4j/history/l$a;->l:Lnet/time4j/history/d;

    .line 116
    .line 117
    invoke-virtual {p1}, Lnet/time4j/history/h;->c()Lnet/time4j/history/j;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    invoke-virtual {v2, v3, v0}, Lnet/time4j/history/d;->n(Lnet/time4j/history/j;I)Lnet/time4j/history/h;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    iget-object v3, p0, Lnet/time4j/history/l$a;->l:Lnet/time4j/history/d;

    .line 126
    .line 127
    invoke-virtual {p1}, Lnet/time4j/history/h;->c()Lnet/time4j/history/j;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    invoke-virtual {v3, p1, v0}, Lnet/time4j/history/d;->v(Lnet/time4j/history/j;I)I

    .line 132
    .line 133
    .line 134
    move-result p1

    .line 135
    if-ne p2, v1, :cond_2

    .line 136
    .line 137
    move-object p1, v2

    .line 138
    goto/16 :goto_3

    .line 139
    .line 140
    :cond_2
    if-le p2, v1, :cond_3

    .line 141
    .line 142
    if-gt p2, p1, :cond_3

    .line 143
    .line 144
    iget-object p1, p0, Lnet/time4j/history/l$a;->l:Lnet/time4j/history/d;

    .line 145
    .line 146
    invoke-virtual {p1, v2}, Lnet/time4j/history/d;->d(Lnet/time4j/history/h;)Lnet/time4j/f0;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    sub-int/2addr p2, v1

    .line 151
    int-to-long v0, p2

    .line 152
    invoke-static {v0, v1}, Lfj/h;->c(J)Lfj/h;

    .line 153
    .line 154
    .line 155
    move-result-object p2

    .line 156
    invoke-virtual {p1, p2}, Lfj/m;->U(Lfj/h;)Lfj/m;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    check-cast p1, Lnet/time4j/f0;

    .line 161
    .line 162
    iget-object p2, p0, Lnet/time4j/history/l$a;->l:Lnet/time4j/history/d;

    .line 163
    .line 164
    invoke-virtual {p2, p1}, Lnet/time4j/history/d;->e(Lnet/time4j/f0;)Lnet/time4j/history/h;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    goto :goto_3

    .line 169
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 170
    .line 171
    new-instance v0, Ljava/lang/StringBuilder;

    .line 172
    .line 173
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 174
    .line 175
    .line 176
    const-string v1, "Out of range: "

    .line 177
    .line 178
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object p2

    .line 188
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    throw p1

    .line 192
    :pswitch_3
    invoke-virtual {p1}, Lnet/time4j/history/h;->c()Lnet/time4j/history/j;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    invoke-virtual {p1}, Lnet/time4j/history/h;->f()I

    .line 197
    .line 198
    .line 199
    move-result v1

    .line 200
    invoke-virtual {p1}, Lnet/time4j/history/h;->e()I

    .line 201
    .line 202
    .line 203
    move-result p1

    .line 204
    invoke-static {v0, v1, p1, p2}, Lnet/time4j/history/h;->i(Lnet/time4j/history/j;III)Lnet/time4j/history/h;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    goto :goto_3

    .line 209
    :pswitch_4
    invoke-virtual {p1}, Lnet/time4j/history/h;->c()Lnet/time4j/history/j;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    invoke-virtual {p1}, Lnet/time4j/history/h;->f()I

    .line 214
    .line 215
    .line 216
    move-result v1

    .line 217
    invoke-virtual {p1}, Lnet/time4j/history/h;->b()I

    .line 218
    .line 219
    .line 220
    move-result p1

    .line 221
    invoke-static {v0, v1, p2, p1}, Lnet/time4j/history/h;->i(Lnet/time4j/history/j;III)Lnet/time4j/history/h;

    .line 222
    .line 223
    .line 224
    move-result-object p1

    .line 225
    iget-object p2, p0, Lnet/time4j/history/l$a;->l:Lnet/time4j/history/d;

    .line 226
    .line 227
    invoke-virtual {p2, p1}, Lnet/time4j/history/d;->a(Lnet/time4j/history/h;)Lnet/time4j/history/h;

    .line 228
    .line 229
    .line 230
    move-result-object p1

    .line 231
    goto :goto_3

    .line 232
    :goto_2
    :pswitch_5
    move-object v9, v4

    .line 233
    invoke-virtual {p1}, Lnet/time4j/history/h;->c()Lnet/time4j/history/j;

    .line 234
    .line 235
    .line 236
    move-result-object v5

    .line 237
    invoke-virtual {p1}, Lnet/time4j/history/h;->e()I

    .line 238
    .line 239
    .line 240
    move-result v7

    .line 241
    invoke-virtual {p1}, Lnet/time4j/history/h;->b()I

    .line 242
    .line 243
    .line 244
    move-result v8

    .line 245
    move v6, p2

    .line 246
    invoke-static/range {v5 .. v10}, Lnet/time4j/history/h;->j(Lnet/time4j/history/j;IIILjj/a;Lnet/time4j/history/o;)Lnet/time4j/history/h;

    .line 247
    .line 248
    .line 249
    move-result-object p1

    .line 250
    iget-object p2, p0, Lnet/time4j/history/l$a;->l:Lnet/time4j/history/d;

    .line 251
    .line 252
    invoke-virtual {p2, p1}, Lnet/time4j/history/d;->a(Lnet/time4j/history/h;)Lnet/time4j/history/h;

    .line 253
    .line 254
    .line 255
    move-result-object p1

    .line 256
    :goto_3
    return-object p1

    .line 257
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
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


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Lfj/p;
    .locals 0

    check-cast p1, Lfj/q;

    invoke-virtual {p0, p1}, Lnet/time4j/history/l$a;->d(Lfj/q;)Lfj/p;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic c(Ljava/lang/Object;)Lfj/p;
    .locals 0

    check-cast p1, Lfj/q;

    invoke-virtual {p0, p1}, Lnet/time4j/history/l$a;->e(Lfj/q;)Lfj/p;

    move-result-object p1

    return-object p1
.end method

.method public d(Lfj/q;)Lfj/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TC;)",
            "Lfj/p<",
            "*>;"
        }
    .end annotation

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Never called."

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public e(Lfj/q;)Lfj/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TC;)",
            "Lfj/p<",
            "*>;"
        }
    .end annotation

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Never called."

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public f(Lfj/q;)Ljava/lang/Integer;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TC;)",
            "Ljava/lang/Integer;"
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lnet/time4j/history/l$a;->l:Lnet/time4j/history/d;

    .line 2
    .line 3
    sget-object v1, Lnet/time4j/f0;->y:Lnet/time4j/e;

    .line 4
    .line 5
    invoke-virtual {p1, v1}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Lnet/time4j/f0;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lnet/time4j/history/d;->e(Lnet/time4j/f0;)Lnet/time4j/history/h;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget v1, p0, Lnet/time4j/history/l$a;->k:I

    .line 16
    .line 17
    const/16 v2, 0x8

    .line 18
    .line 19
    const v3, 0x3b9a8f4d

    .line 20
    .line 21
    .line 22
    packed-switch v1, :pswitch_data_0

    .line 23
    .line 24
    .line 25
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 26
    .line 27
    goto/16 :goto_7

    .line 28
    .line 29
    :pswitch_0
    iget-object p1, p0, Lnet/time4j/history/l$a;->l:Lnet/time4j/history/d;

    .line 30
    .line 31
    invoke-virtual {p1}, Lnet/time4j/history/d;->w()Lnet/time4j/history/o;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {v0, p1}, Lnet/time4j/history/h;->h(Lnet/time4j/history/o;)I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    iget-object v1, p0, Lnet/time4j/history/l$a;->l:Lnet/time4j/history/d;

    .line 40
    .line 41
    invoke-virtual {v0}, Lnet/time4j/history/h;->c()Lnet/time4j/history/j;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {v1, v0, p1}, Lnet/time4j/history/d;->v(Lnet/time4j/history/j;I)I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    const/4 v0, -0x1

    .line 50
    if-eq p1, v0, :cond_0

    .line 51
    .line 52
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    return-object p1

    .line 57
    :cond_0
    new-instance p1, Lfj/r;

    .line 58
    .line 59
    const-string v0, "Length of historic year undefined."

    .line 60
    .line 61
    invoke-direct {p1, v0}, Lfj/r;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw p1

    .line 65
    :pswitch_1
    iget-object v1, p0, Lnet/time4j/history/l$a;->l:Lnet/time4j/history/d;

    .line 66
    .line 67
    invoke-virtual {v1, v0}, Lnet/time4j/history/d;->l(Lnet/time4j/history/h;)Lnet/time4j/history/b;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-interface {v1, v0}, Lnet/time4j/history/b;->e(Lnet/time4j/history/h;)I

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    invoke-direct {p0, p1, v1}, Lnet/time4j/history/l$a;->b(Lfj/q;I)Lnet/time4j/history/h;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    goto :goto_1

    .line 80
    :pswitch_2
    invoke-virtual {v0}, Lnet/time4j/history/h;->c()Lnet/time4j/history/j;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    sget-object v4, Lnet/time4j/history/j;->n:Lnet/time4j/history/j;

    .line 85
    .line 86
    if-ne v1, v4, :cond_1

    .line 87
    .line 88
    invoke-virtual {v0}, Lnet/time4j/history/h;->f()I

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    if-ne v1, v3, :cond_1

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_1
    const/16 v2, 0xc

    .line 96
    .line 97
    :goto_0
    invoke-direct {p0, p1, v2}, Lnet/time4j/history/l$a;->b(Lfj/q;I)Lnet/time4j/history/h;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    move v1, v2

    .line 102
    :goto_1
    iget-object v2, p0, Lnet/time4j/history/l$a;->l:Lnet/time4j/history/d;

    .line 103
    .line 104
    invoke-virtual {v2, p1}, Lnet/time4j/history/d;->B(Lnet/time4j/history/h;)Z

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    if-eqz v2, :cond_2

    .line 109
    .line 110
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    return-object p1

    .line 115
    :cond_2
    iget-object v1, p0, Lnet/time4j/history/l$a;->l:Lnet/time4j/history/d;

    .line 116
    .line 117
    invoke-virtual {v1}, Lnet/time4j/history/d;->q()Ljava/util/List;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 122
    .line 123
    .line 124
    move-result v2

    .line 125
    add-int/lit8 v2, v2, -0x1

    .line 126
    .line 127
    :goto_2
    if-ltz v2, :cond_4

    .line 128
    .line 129
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    check-cast v3, Lnet/time4j/history/f;

    .line 134
    .line 135
    iget-object v4, v3, Lnet/time4j/history/f;->c:Lnet/time4j/history/h;

    .line 136
    .line 137
    invoke-virtual {v0, v4}, Lnet/time4j/history/h;->a(Lnet/time4j/history/h;)I

    .line 138
    .line 139
    .line 140
    move-result v4

    .line 141
    if-gez v4, :cond_3

    .line 142
    .line 143
    iget-object p1, v3, Lnet/time4j/history/f;->d:Lnet/time4j/history/h;

    .line 144
    .line 145
    goto :goto_3

    .line 146
    :cond_3
    add-int/lit8 v2, v2, -0x1

    .line 147
    .line 148
    goto :goto_2

    .line 149
    :cond_4
    :goto_3
    iget v0, p0, Lnet/time4j/history/l$a;->k:I

    .line 150
    .line 151
    const/4 v1, 0x3

    .line 152
    if-ne v0, v1, :cond_5

    .line 153
    .line 154
    invoke-virtual {p1}, Lnet/time4j/history/h;->e()I

    .line 155
    .line 156
    .line 157
    move-result p1

    .line 158
    goto :goto_4

    .line 159
    :cond_5
    invoke-virtual {p1}, Lnet/time4j/history/h;->b()I

    .line 160
    .line 161
    .line 162
    move-result p1

    .line 163
    :goto_4
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    return-object p1

    .line 168
    :pswitch_3
    iget-object p1, p0, Lnet/time4j/history/l$a;->l:Lnet/time4j/history/d;

    .line 169
    .line 170
    sget-object v1, Lnet/time4j/history/d;->C:Lnet/time4j/history/d;

    .line 171
    .line 172
    if-ne p1, v1, :cond_6

    .line 173
    .line 174
    goto :goto_6

    .line 175
    :cond_6
    sget-object v1, Lnet/time4j/history/d;->B:Lnet/time4j/history/d;

    .line 176
    .line 177
    if-ne p1, v1, :cond_8

    .line 178
    .line 179
    invoke-virtual {v0}, Lnet/time4j/history/h;->c()Lnet/time4j/history/j;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    sget-object v0, Lnet/time4j/history/j;->k:Lnet/time4j/history/j;

    .line 184
    .line 185
    if-ne p1, v0, :cond_7

    .line 186
    .line 187
    const v3, 0x3b9a79ca

    .line 188
    .line 189
    .line 190
    goto :goto_6

    .line 191
    :cond_7
    const v3, 0x3b9a79c9

    .line 192
    .line 193
    .line 194
    goto :goto_6

    .line 195
    :cond_8
    sget-object v1, Lnet/time4j/history/d;->A:Lnet/time4j/history/d;

    .line 196
    .line 197
    if-ne p1, v1, :cond_a

    .line 198
    .line 199
    invoke-virtual {v0}, Lnet/time4j/history/h;->c()Lnet/time4j/history/j;

    .line 200
    .line 201
    .line 202
    move-result-object p1

    .line 203
    sget-object v0, Lnet/time4j/history/j;->k:Lnet/time4j/history/j;

    .line 204
    .line 205
    if-ne p1, v0, :cond_9

    .line 206
    .line 207
    const v3, 0x3b9aca00

    .line 208
    .line 209
    .line 210
    goto :goto_6

    .line 211
    :cond_9
    const v3, 0x3b9ac9ff

    .line 212
    .line 213
    .line 214
    goto :goto_6

    .line 215
    :cond_a
    invoke-virtual {v0}, Lnet/time4j/history/h;->c()Lnet/time4j/history/j;

    .line 216
    .line 217
    .line 218
    move-result-object p1

    .line 219
    sget-object v0, Lnet/time4j/history/j;->k:Lnet/time4j/history/j;

    .line 220
    .line 221
    if-ne p1, v0, :cond_b

    .line 222
    .line 223
    const/16 p1, 0x2d

    .line 224
    .line 225
    goto :goto_5

    .line 226
    :cond_b
    const/16 p1, 0x270f

    .line 227
    .line 228
    :goto_5
    move v3, p1

    .line 229
    :goto_6
    iget p1, p0, Lnet/time4j/history/l$a;->k:I

    .line 230
    .line 231
    if-ne p1, v2, :cond_c

    .line 232
    .line 233
    add-int/lit8 v3, v3, -0x1

    .line 234
    .line 235
    div-int/lit8 v3, v3, 0x64

    .line 236
    .line 237
    add-int/lit8 v3, v3, 0x1

    .line 238
    .line 239
    :cond_c
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 240
    .line 241
    .line 242
    move-result-object p1

    .line 243
    return-object p1

    .line 244
    :goto_7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 245
    .line 246
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 247
    .line 248
    .line 249
    const-string v1, "Unknown element index: "

    .line 250
    .line 251
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 252
    .line 253
    .line 254
    iget v1, p0, Lnet/time4j/history/l$a;->k:I

    .line 255
    .line 256
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 257
    .line 258
    .line 259
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 264
    .line 265
    .line 266
    throw p1
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 267
    :catch_0
    move-exception p1

    .line 268
    new-instance v0, Lfj/r;

    .line 269
    .line 270
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object v1

    .line 274
    invoke-direct {v0, v1, p1}, Lfj/r;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 275
    .line 276
    .line 277
    throw v0

    .line 278
    nop

    .line 279
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_3
        :pswitch_3
        :pswitch_3
    .end packed-switch
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
.end method

.method public g(Lfj/q;)Ljava/lang/Integer;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TC;)",
            "Ljava/lang/Integer;"
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lnet/time4j/history/l$a;->l:Lnet/time4j/history/d;

    .line 2
    .line 3
    sget-object v1, Lnet/time4j/f0;->y:Lnet/time4j/e;

    .line 4
    .line 5
    invoke-virtual {p1, v1}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Lnet/time4j/f0;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lnet/time4j/history/d;->e(Lnet/time4j/f0;)Lnet/time4j/history/h;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget v1, p0, Lnet/time4j/history/l$a;->k:I

    .line 16
    .line 17
    const/4 v2, 0x2

    .line 18
    const/4 v3, 0x1

    .line 19
    if-eq v1, v2, :cond_6

    .line 20
    .line 21
    const/4 v2, 0x6

    .line 22
    if-eq v1, v2, :cond_6

    .line 23
    .line 24
    const/4 v2, 0x7

    .line 25
    if-eq v1, v2, :cond_6

    .line 26
    .line 27
    const/16 v2, 0x8

    .line 28
    .line 29
    if-ne v1, v2, :cond_0

    .line 30
    .line 31
    goto :goto_3

    .line 32
    :cond_0
    invoke-direct {p0, p1, v3}, Lnet/time4j/history/l$a;->b(Lfj/q;I)Lnet/time4j/history/h;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iget-object v1, p0, Lnet/time4j/history/l$a;->l:Lnet/time4j/history/d;

    .line 37
    .line 38
    invoke-virtual {v1, p1}, Lnet/time4j/history/d;->B(Lnet/time4j/history/h;)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_1

    .line 43
    .line 44
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    return-object p1

    .line 49
    :cond_1
    iget v1, p0, Lnet/time4j/history/l$a;->k:I

    .line 50
    .line 51
    const/4 v2, 0x5

    .line 52
    if-eq v1, v2, :cond_5

    .line 53
    .line 54
    iget-object v1, p0, Lnet/time4j/history/l$a;->l:Lnet/time4j/history/d;

    .line 55
    .line 56
    invoke-virtual {v1}, Lnet/time4j/history/d;->q()Ljava/util/List;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    sub-int/2addr v2, v3

    .line 65
    :goto_0
    if-ltz v2, :cond_3

    .line 66
    .line 67
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    check-cast v3, Lnet/time4j/history/f;

    .line 72
    .line 73
    iget-object v4, v3, Lnet/time4j/history/f;->c:Lnet/time4j/history/h;

    .line 74
    .line 75
    invoke-virtual {v0, v4}, Lnet/time4j/history/h;->a(Lnet/time4j/history/h;)I

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    if-ltz v4, :cond_2

    .line 80
    .line 81
    iget-object p1, v3, Lnet/time4j/history/f;->c:Lnet/time4j/history/h;

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_2
    add-int/lit8 v2, v2, -0x1

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_3
    :goto_1
    iget v0, p0, Lnet/time4j/history/l$a;->k:I

    .line 88
    .line 89
    const/4 v1, 0x3

    .line 90
    if-ne v0, v1, :cond_4

    .line 91
    .line 92
    invoke-virtual {p1}, Lnet/time4j/history/h;->e()I

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    goto :goto_2

    .line 97
    :cond_4
    invoke-virtual {p1}, Lnet/time4j/history/h;->b()I

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    :goto_2
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    return-object p1

    .line 106
    :cond_5
    new-instance p1, Lfj/r;

    .line 107
    .line 108
    const-string v0, "Historic New Year cannot be determined."

    .line 109
    .line 110
    invoke-direct {p1, v0}, Lfj/r;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    throw p1

    .line 114
    :cond_6
    :goto_3
    invoke-virtual {v0}, Lnet/time4j/history/h;->c()Lnet/time4j/history/j;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    sget-object v1, Lnet/time4j/history/j;->n:Lnet/time4j/history/j;

    .line 119
    .line 120
    if-ne p1, v1, :cond_7

    .line 121
    .line 122
    invoke-virtual {v0}, Lnet/time4j/history/h;->e()I

    .line 123
    .line 124
    .line 125
    move-result p1

    .line 126
    const/16 v0, 0x9

    .line 127
    .line 128
    if-lt p1, v0, :cond_7

    .line 129
    .line 130
    const/4 p1, 0x0

    .line 131
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    return-object p1

    .line 136
    :cond_7
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 137
    .line 138
    .line 139
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 140
    return-object p1

    .line 141
    :catch_0
    move-exception p1

    .line 142
    new-instance v0, Lfj/r;

    .line 143
    .line 144
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    invoke-direct {v0, v1, p1}, Lfj/r;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 149
    .line 150
    .line 151
    throw v0
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
.end method

.method public h(Lfj/q;)Ljava/lang/Integer;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TC;)",
            "Ljava/lang/Integer;"
        }
    .end annotation

    .line 1
    :try_start_0
    sget-object v0, Lnet/time4j/f0;->y:Lnet/time4j/e;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lnet/time4j/f0;

    .line 8
    .line 9
    iget-object v0, p0, Lnet/time4j/history/l$a;->l:Lnet/time4j/history/d;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lnet/time4j/history/d;->e(Lnet/time4j/f0;)Lnet/time4j/history/h;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget v1, p0, Lnet/time4j/history/l$a;->k:I

    .line 16
    .line 17
    packed-switch v1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :pswitch_0
    invoke-virtual {v0}, Lnet/time4j/history/h;->f()I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    add-int/lit8 p1, p1, -0x1

    .line 28
    .line 29
    div-int/lit8 p1, p1, 0x64

    .line 30
    .line 31
    add-int/lit8 p1, p1, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :pswitch_1
    iget-object p1, p0, Lnet/time4j/history/l$a;->l:Lnet/time4j/history/d;

    .line 35
    .line 36
    invoke-virtual {p1}, Lnet/time4j/history/d;->w()Lnet/time4j/history/o;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {v0, p1}, Lnet/time4j/history/h;->h(Lnet/time4j/history/o;)I

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    goto :goto_0

    .line 45
    :pswitch_2
    invoke-virtual {p1}, Lfj/m;->b()J

    .line 46
    .line 47
    .line 48
    move-result-wide v1

    .line 49
    iget-object p1, p0, Lnet/time4j/history/l$a;->l:Lnet/time4j/history/d;

    .line 50
    .line 51
    invoke-virtual {p1}, Lnet/time4j/history/d;->w()Lnet/time4j/history/o;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-virtual {v0, p1}, Lnet/time4j/history/h;->h(Lnet/time4j/history/o;)I

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    iget-object v3, p0, Lnet/time4j/history/l$a;->l:Lnet/time4j/history/d;

    .line 60
    .line 61
    invoke-virtual {v0}, Lnet/time4j/history/h;->c()Lnet/time4j/history/j;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-virtual {v3, v0, p1}, Lnet/time4j/history/d;->n(Lnet/time4j/history/j;I)Lnet/time4j/history/h;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    iget-object v0, p0, Lnet/time4j/history/l$a;->l:Lnet/time4j/history/d;

    .line 70
    .line 71
    invoke-virtual {v0, p1}, Lnet/time4j/history/d;->d(Lnet/time4j/history/h;)Lnet/time4j/f0;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-virtual {p1}, Lfj/m;->b()J

    .line 76
    .line 77
    .line 78
    move-result-wide v3

    .line 79
    sub-long/2addr v1, v3

    .line 80
    const-wide/16 v3, 0x1

    .line 81
    .line 82
    add-long/2addr v1, v3

    .line 83
    long-to-int p1, v1

    .line 84
    goto :goto_0

    .line 85
    :pswitch_3
    invoke-virtual {v0}, Lnet/time4j/history/h;->b()I

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    goto :goto_0

    .line 90
    :pswitch_4
    invoke-virtual {v0}, Lnet/time4j/history/h;->e()I

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    goto :goto_0

    .line 95
    :pswitch_5
    invoke-virtual {v0}, Lnet/time4j/history/h;->f()I

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    :goto_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    return-object p1

    .line 104
    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 105
    .line 106
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 107
    .line 108
    .line 109
    const-string v1, "Unknown element index: "

    .line 110
    .line 111
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    iget v1, p0, Lnet/time4j/history/l$a;->k:I

    .line 115
    .line 116
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    throw p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 127
    :catch_0
    move-exception p1

    .line 128
    new-instance v0, Lfj/r;

    .line 129
    .line 130
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    invoke-direct {v0, v1, p1}, Lfj/r;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 135
    .line 136
    .line 137
    throw v0

    .line 138
    nop

    .line 139
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method

.method public i(Lfj/q;Ljava/lang/Integer;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TC;",
            "Ljava/lang/Integer;",
            ")Z"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p2, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    :try_start_0
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    invoke-direct {p0, p1, p2}, Lnet/time4j/history/l$a;->b(Lfj/q;I)Lnet/time4j/history/h;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iget-object p2, p0, Lnet/time4j/history/l$a;->l:Lnet/time4j/history/d;

    .line 14
    .line 15
    invoke-virtual {p2, p1}, Lnet/time4j/history/d;->B(Lnet/time4j/history/h;)Z

    .line 16
    .line 17
    .line 18
    move-result p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    return p1

    .line 20
    :catch_0
    return v0
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

.method public bridge synthetic j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lfj/q;

    invoke-virtual {p0, p1}, Lnet/time4j/history/l$a;->f(Lfj/q;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic m(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lfj/q;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p0, p1, p2}, Lnet/time4j/history/l$a;->i(Lfj/q;Ljava/lang/Integer;)Z

    move-result p1

    return p1
.end method

.method public n(Lfj/q;Ljava/lang/Integer;Z)Lfj/q;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TC;",
            "Ljava/lang/Integer;",
            "Z)TC;"
        }
    .end annotation

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    invoke-direct {p0, p1, p2}, Lnet/time4j/history/l$a;->b(Lfj/q;I)Lnet/time4j/history/h;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    sget-object p3, Lnet/time4j/f0;->y:Lnet/time4j/e;

    .line 12
    .line 13
    iget-object v0, p0, Lnet/time4j/history/l$a;->l:Lnet/time4j/history/d;

    .line 14
    .line 15
    invoke-virtual {v0, p2}, Lnet/time4j/history/d;->d(Lnet/time4j/history/h;)Lnet/time4j/f0;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    invoke-virtual {p1, p3, p2}, Lfj/q;->E(Lfj/p;Ljava/lang/Object;)Lfj/q;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1

    .line 24
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 25
    .line 26
    const-string p2, "Missing historic element value."

    .line 27
    .line 28
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw p1
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
.end method

.method public bridge synthetic o(Ljava/lang/Object;Ljava/lang/Object;Z)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lfj/q;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p0, p1, p2, p3}, Lnet/time4j/history/l$a;->n(Lfj/q;Ljava/lang/Integer;Z)Lfj/q;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic p(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lfj/q;

    invoke-virtual {p0, p1}, Lnet/time4j/history/l$a;->g(Lfj/q;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lfj/q;

    invoke-virtual {p0, p1}, Lnet/time4j/history/l$a;->h(Lfj/q;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method
