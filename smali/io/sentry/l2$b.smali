.class public final Lio/sentry/l2$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/sentry/l2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lio/sentry/l2;Lio/sentry/z0;Lio/sentry/g0;)V
    .locals 2

    .line 1
    invoke-static {p1}, Lio/sentry/l2;->a(Lio/sentry/l2;)Lio/sentry/protocol/p;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string v0, "event_id"

    .line 8
    .line 9
    invoke-virtual {p2, v0}, Lio/sentry/z0;->B0(Ljava/lang/String;)Lio/sentry/z0;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {p1}, Lio/sentry/l2;->a(Lio/sentry/l2;)Lio/sentry/protocol/p;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v0, p3, v1}, Lio/sentry/z0;->F0(Lio/sentry/g0;Ljava/lang/Object;)Lio/sentry/z0;

    .line 18
    .line 19
    .line 20
    :cond_0
    const-string v0, "contexts"

    .line 21
    .line 22
    invoke-virtual {p2, v0}, Lio/sentry/z0;->B0(Ljava/lang/String;)Lio/sentry/z0;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-static {p1}, Lio/sentry/l2;->c(Lio/sentry/l2;)Lio/sentry/protocol/c;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v0, p3, v1}, Lio/sentry/z0;->F0(Lio/sentry/g0;Ljava/lang/Object;)Lio/sentry/z0;

    .line 31
    .line 32
    .line 33
    invoke-static {p1}, Lio/sentry/l2;->j(Lio/sentry/l2;)Lio/sentry/protocol/n;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    const-string v0, "sdk"

    .line 40
    .line 41
    invoke-virtual {p2, v0}, Lio/sentry/z0;->B0(Ljava/lang/String;)Lio/sentry/z0;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-static {p1}, Lio/sentry/l2;->j(Lio/sentry/l2;)Lio/sentry/protocol/n;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v0, p3, v1}, Lio/sentry/z0;->F0(Lio/sentry/g0;Ljava/lang/Object;)Lio/sentry/z0;

    .line 50
    .line 51
    .line 52
    :cond_1
    invoke-static {p1}, Lio/sentry/l2;->l(Lio/sentry/l2;)Lio/sentry/protocol/k;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    if-eqz v0, :cond_2

    .line 57
    .line 58
    const-string v0, "request"

    .line 59
    .line 60
    invoke-virtual {p2, v0}, Lio/sentry/z0;->B0(Ljava/lang/String;)Lio/sentry/z0;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-static {p1}, Lio/sentry/l2;->l(Lio/sentry/l2;)Lio/sentry/protocol/k;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-virtual {v0, p3, v1}, Lio/sentry/z0;->F0(Lio/sentry/g0;Ljava/lang/Object;)Lio/sentry/z0;

    .line 69
    .line 70
    .line 71
    :cond_2
    invoke-static {p1}, Lio/sentry/l2;->n(Lio/sentry/l2;)Ljava/util/Map;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    if-eqz v0, :cond_3

    .line 76
    .line 77
    invoke-static {p1}, Lio/sentry/l2;->n(Lio/sentry/l2;)Ljava/util/Map;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-nez v0, :cond_3

    .line 86
    .line 87
    const-string v0, "tags"

    .line 88
    .line 89
    invoke-virtual {p2, v0}, Lio/sentry/z0;->B0(Ljava/lang/String;)Lio/sentry/z0;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-static {p1}, Lio/sentry/l2;->n(Lio/sentry/l2;)Ljava/util/Map;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-virtual {v0, p3, v1}, Lio/sentry/z0;->F0(Lio/sentry/g0;Ljava/lang/Object;)Lio/sentry/z0;

    .line 98
    .line 99
    .line 100
    :cond_3
    invoke-static {p1}, Lio/sentry/l2;->p(Lio/sentry/l2;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    if-eqz v0, :cond_4

    .line 105
    .line 106
    const-string v0, "release"

    .line 107
    .line 108
    invoke-virtual {p2, v0}, Lio/sentry/z0;->B0(Ljava/lang/String;)Lio/sentry/z0;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-static {p1}, Lio/sentry/l2;->p(Lio/sentry/l2;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    invoke-virtual {v0, v1}, Lio/sentry/vendor/gson/stream/c;->t0(Ljava/lang/String;)Lio/sentry/vendor/gson/stream/c;

    .line 117
    .line 118
    .line 119
    :cond_4
    invoke-static {p1}, Lio/sentry/l2;->r(Lio/sentry/l2;)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    if-eqz v0, :cond_5

    .line 124
    .line 125
    const-string v0, "environment"

    .line 126
    .line 127
    invoke-virtual {p2, v0}, Lio/sentry/z0;->B0(Ljava/lang/String;)Lio/sentry/z0;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-static {p1}, Lio/sentry/l2;->r(Lio/sentry/l2;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    invoke-virtual {v0, v1}, Lio/sentry/vendor/gson/stream/c;->t0(Ljava/lang/String;)Lio/sentry/vendor/gson/stream/c;

    .line 136
    .line 137
    .line 138
    :cond_5
    invoke-static {p1}, Lio/sentry/l2;->t(Lio/sentry/l2;)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    if-eqz v0, :cond_6

    .line 143
    .line 144
    const-string v0, "platform"

    .line 145
    .line 146
    invoke-virtual {p2, v0}, Lio/sentry/z0;->B0(Ljava/lang/String;)Lio/sentry/z0;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    invoke-static {p1}, Lio/sentry/l2;->t(Lio/sentry/l2;)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    invoke-virtual {v0, v1}, Lio/sentry/vendor/gson/stream/c;->t0(Ljava/lang/String;)Lio/sentry/vendor/gson/stream/c;

    .line 155
    .line 156
    .line 157
    :cond_6
    invoke-static {p1}, Lio/sentry/l2;->v(Lio/sentry/l2;)Lio/sentry/protocol/z;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    if-eqz v0, :cond_7

    .line 162
    .line 163
    const-string v0, "user"

    .line 164
    .line 165
    invoke-virtual {p2, v0}, Lio/sentry/z0;->B0(Ljava/lang/String;)Lio/sentry/z0;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    invoke-static {p1}, Lio/sentry/l2;->v(Lio/sentry/l2;)Lio/sentry/protocol/z;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    invoke-virtual {v0, p3, v1}, Lio/sentry/z0;->F0(Lio/sentry/g0;Ljava/lang/Object;)Lio/sentry/z0;

    .line 174
    .line 175
    .line 176
    :cond_7
    invoke-static {p1}, Lio/sentry/l2;->x(Lio/sentry/l2;)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    if-eqz v0, :cond_8

    .line 181
    .line 182
    const-string v0, "server_name"

    .line 183
    .line 184
    invoke-virtual {p2, v0}, Lio/sentry/z0;->B0(Ljava/lang/String;)Lio/sentry/z0;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    invoke-static {p1}, Lio/sentry/l2;->x(Lio/sentry/l2;)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    invoke-virtual {v0, v1}, Lio/sentry/vendor/gson/stream/c;->t0(Ljava/lang/String;)Lio/sentry/vendor/gson/stream/c;

    .line 193
    .line 194
    .line 195
    :cond_8
    invoke-static {p1}, Lio/sentry/l2;->d(Lio/sentry/l2;)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    if-eqz v0, :cond_9

    .line 200
    .line 201
    const-string v0, "dist"

    .line 202
    .line 203
    invoke-virtual {p2, v0}, Lio/sentry/z0;->B0(Ljava/lang/String;)Lio/sentry/z0;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    invoke-static {p1}, Lio/sentry/l2;->d(Lio/sentry/l2;)Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v1

    .line 211
    invoke-virtual {v0, v1}, Lio/sentry/vendor/gson/stream/c;->t0(Ljava/lang/String;)Lio/sentry/vendor/gson/stream/c;

    .line 212
    .line 213
    .line 214
    :cond_9
    invoke-static {p1}, Lio/sentry/l2;->f(Lio/sentry/l2;)Ljava/util/List;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    if-eqz v0, :cond_a

    .line 219
    .line 220
    invoke-static {p1}, Lio/sentry/l2;->f(Lio/sentry/l2;)Ljava/util/List;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 225
    .line 226
    .line 227
    move-result v0

    .line 228
    if-nez v0, :cond_a

    .line 229
    .line 230
    const-string v0, "breadcrumbs"

    .line 231
    .line 232
    invoke-virtual {p2, v0}, Lio/sentry/z0;->B0(Ljava/lang/String;)Lio/sentry/z0;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    invoke-static {p1}, Lio/sentry/l2;->f(Lio/sentry/l2;)Ljava/util/List;

    .line 237
    .line 238
    .line 239
    move-result-object v1

    .line 240
    invoke-virtual {v0, p3, v1}, Lio/sentry/z0;->F0(Lio/sentry/g0;Ljava/lang/Object;)Lio/sentry/z0;

    .line 241
    .line 242
    .line 243
    :cond_a
    invoke-static {p1}, Lio/sentry/l2;->h(Lio/sentry/l2;)Ljava/util/Map;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    if-eqz v0, :cond_b

    .line 248
    .line 249
    invoke-static {p1}, Lio/sentry/l2;->h(Lio/sentry/l2;)Ljava/util/Map;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 254
    .line 255
    .line 256
    move-result v0

    .line 257
    if-nez v0, :cond_b

    .line 258
    .line 259
    const-string v0, "extra"

    .line 260
    .line 261
    invoke-virtual {p2, v0}, Lio/sentry/z0;->B0(Ljava/lang/String;)Lio/sentry/z0;

    .line 262
    .line 263
    .line 264
    move-result-object p2

    .line 265
    invoke-static {p1}, Lio/sentry/l2;->h(Lio/sentry/l2;)Ljava/util/Map;

    .line 266
    .line 267
    .line 268
    move-result-object p1

    .line 269
    invoke-virtual {p2, p3, p1}, Lio/sentry/z0;->F0(Lio/sentry/g0;Ljava/lang/Object;)Lio/sentry/z0;

    .line 270
    .line 271
    .line 272
    :cond_b
    return-void
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
