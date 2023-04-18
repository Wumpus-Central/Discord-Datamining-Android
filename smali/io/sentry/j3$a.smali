.class public final Lio/sentry/j3$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/r0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/sentry/j3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/sentry/r0<",
        "Lio/sentry/j3;",
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

    invoke-virtual {p0, p1, p2}, Lio/sentry/j3$a;->b(Lio/sentry/x0;Lio/sentry/g0;)Lio/sentry/j3;

    move-result-object p1

    return-object p1
.end method

.method public b(Lio/sentry/x0;Lio/sentry/g0;)Lio/sentry/j3;
    .locals 6

    .line 1
    invoke-virtual {p1}, Lio/sentry/vendor/gson/stream/a;->f()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lio/sentry/j3;

    .line 5
    .line 6
    invoke-direct {v0}, Lio/sentry/j3;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v1, Lio/sentry/l2$a;

    .line 10
    .line 11
    invoke-direct {v1}, Lio/sentry/l2$a;-><init>()V

    .line 12
    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    :cond_0
    :goto_0
    invoke-virtual {p1}, Lio/sentry/vendor/gson/stream/a;->z0()Lio/sentry/vendor/gson/stream/b;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    sget-object v4, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    .line 20
    .line 21
    if-ne v3, v4, :cond_c

    .line 22
    .line 23
    invoke-virtual {p1}, Lio/sentry/vendor/gson/stream/a;->g0()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 28
    .line 29
    .line 30
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    const/4 v5, -0x1

    .line 35
    sparse-switch v4, :sswitch_data_0

    .line 36
    .line 37
    .line 38
    goto/16 :goto_1

    .line 39
    .line 40
    :sswitch_0
    const-string v4, "transaction"

    .line 41
    .line 42
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    if-nez v4, :cond_1

    .line 47
    .line 48
    goto/16 :goto_1

    .line 49
    .line 50
    :cond_1
    const/16 v5, 0x9

    .line 51
    .line 52
    goto/16 :goto_1

    .line 53
    .line 54
    :sswitch_1
    const-string v4, "exception"

    .line 55
    .line 56
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    if-nez v4, :cond_2

    .line 61
    .line 62
    goto/16 :goto_1

    .line 63
    .line 64
    :cond_2
    const/16 v5, 0x8

    .line 65
    .line 66
    goto/16 :goto_1

    .line 67
    .line 68
    :sswitch_2
    const-string v4, "modules"

    .line 69
    .line 70
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    if-nez v4, :cond_3

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_3
    const/4 v5, 0x7

    .line 78
    goto :goto_1

    .line 79
    :sswitch_3
    const-string v4, "message"

    .line 80
    .line 81
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v4

    .line 85
    if-nez v4, :cond_4

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_4
    const/4 v5, 0x6

    .line 89
    goto :goto_1

    .line 90
    :sswitch_4
    const-string v4, "level"

    .line 91
    .line 92
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v4

    .line 96
    if-nez v4, :cond_5

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_5
    const/4 v5, 0x5

    .line 100
    goto :goto_1

    .line 101
    :sswitch_5
    const-string v4, "timestamp"

    .line 102
    .line 103
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v4

    .line 107
    if-nez v4, :cond_6

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_6
    const/4 v5, 0x4

    .line 111
    goto :goto_1

    .line 112
    :sswitch_6
    const-string v4, "logger"

    .line 113
    .line 114
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v4

    .line 118
    if-nez v4, :cond_7

    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_7
    const/4 v5, 0x3

    .line 122
    goto :goto_1

    .line 123
    :sswitch_7
    const-string v4, "threads"

    .line 124
    .line 125
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v4

    .line 129
    if-nez v4, :cond_8

    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_8
    const/4 v5, 0x2

    .line 133
    goto :goto_1

    .line 134
    :sswitch_8
    const-string v4, "fingerprint"

    .line 135
    .line 136
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result v4

    .line 140
    if-nez v4, :cond_9

    .line 141
    .line 142
    goto :goto_1

    .line 143
    :cond_9
    const/4 v5, 0x1

    .line 144
    goto :goto_1

    .line 145
    :sswitch_9
    const-string v4, "debug_meta"

    .line 146
    .line 147
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result v4

    .line 151
    if-nez v4, :cond_a

    .line 152
    .line 153
    goto :goto_1

    .line 154
    :cond_a
    const/4 v5, 0x0

    .line 155
    :goto_1
    packed-switch v5, :pswitch_data_0

    .line 156
    .line 157
    .line 158
    invoke-virtual {v1, v0, v3, p1, p2}, Lio/sentry/l2$a;->a(Lio/sentry/l2;Ljava/lang/String;Lio/sentry/x0;Lio/sentry/g0;)Z

    .line 159
    .line 160
    .line 161
    move-result v4

    .line 162
    if-nez v4, :cond_0

    .line 163
    .line 164
    if-nez v2, :cond_b

    .line 165
    .line 166
    new-instance v2, Lj$/util/concurrent/ConcurrentHashMap;

    .line 167
    .line 168
    invoke-direct {v2}, Lj$/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 169
    .line 170
    .line 171
    :cond_b
    invoke-virtual {p1, p2, v2, v3}, Lio/sentry/x0;->b1(Lio/sentry/g0;Ljava/util/Map;Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    goto/16 :goto_0

    .line 175
    .line 176
    :pswitch_0
    invoke-virtual {p1}, Lio/sentry/x0;->Z0()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v3

    .line 180
    invoke-static {v0, v3}, Lio/sentry/j3;->i0(Lio/sentry/j3;Ljava/lang/String;)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    goto/16 :goto_0

    .line 184
    .line 185
    :pswitch_1
    invoke-virtual {p1}, Lio/sentry/vendor/gson/stream/a;->f()V

    .line 186
    .line 187
    .line 188
    invoke-virtual {p1}, Lio/sentry/vendor/gson/stream/a;->g0()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    new-instance v3, Lio/sentry/x3;

    .line 192
    .line 193
    new-instance v4, Lio/sentry/protocol/o$a;

    .line 194
    .line 195
    invoke-direct {v4}, Lio/sentry/protocol/o$a;-><init>()V

    .line 196
    .line 197
    .line 198
    invoke-virtual {p1, p2, v4}, Lio/sentry/x0;->U0(Lio/sentry/g0;Lio/sentry/r0;)Ljava/util/List;

    .line 199
    .line 200
    .line 201
    move-result-object v4

    .line 202
    invoke-direct {v3, v4}, Lio/sentry/x3;-><init>(Ljava/util/List;)V

    .line 203
    .line 204
    .line 205
    invoke-static {v0, v3}, Lio/sentry/j3;->g0(Lio/sentry/j3;Lio/sentry/x3;)Lio/sentry/x3;

    .line 206
    .line 207
    .line 208
    invoke-virtual {p1}, Lio/sentry/vendor/gson/stream/a;->s()V

    .line 209
    .line 210
    .line 211
    goto/16 :goto_0

    .line 212
    .line 213
    :pswitch_2
    invoke-virtual {p1}, Lio/sentry/x0;->X0()Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v3

    .line 217
    check-cast v3, Ljava/util/Map;

    .line 218
    .line 219
    invoke-static {v3}, Lio/sentry/util/a;->b(Ljava/util/Map;)Ljava/util/Map;

    .line 220
    .line 221
    .line 222
    move-result-object v3

    .line 223
    invoke-static {v0, v3}, Lio/sentry/j3;->k0(Lio/sentry/j3;Ljava/util/Map;)Ljava/util/Map;

    .line 224
    .line 225
    .line 226
    goto/16 :goto_0

    .line 227
    .line 228
    :pswitch_3
    new-instance v3, Lio/sentry/protocol/i$a;

    .line 229
    .line 230
    invoke-direct {v3}, Lio/sentry/protocol/i$a;-><init>()V

    .line 231
    .line 232
    .line 233
    invoke-virtual {p1, p2, v3}, Lio/sentry/x0;->Y0(Lio/sentry/g0;Lio/sentry/r0;)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v3

    .line 237
    check-cast v3, Lio/sentry/protocol/i;

    .line 238
    .line 239
    invoke-static {v0, v3}, Lio/sentry/j3;->d0(Lio/sentry/j3;Lio/sentry/protocol/i;)Lio/sentry/protocol/i;

    .line 240
    .line 241
    .line 242
    goto/16 :goto_0

    .line 243
    .line 244
    :pswitch_4
    new-instance v3, Lio/sentry/n3$a;

    .line 245
    .line 246
    invoke-direct {v3}, Lio/sentry/n3$a;-><init>()V

    .line 247
    .line 248
    .line 249
    invoke-virtual {p1, p2, v3}, Lio/sentry/x0;->Y0(Lio/sentry/g0;Lio/sentry/r0;)Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v3

    .line 253
    check-cast v3, Lio/sentry/n3;

    .line 254
    .line 255
    invoke-static {v0, v3}, Lio/sentry/j3;->h0(Lio/sentry/j3;Lio/sentry/n3;)Lio/sentry/n3;

    .line 256
    .line 257
    .line 258
    goto/16 :goto_0

    .line 259
    .line 260
    :pswitch_5
    invoke-virtual {p1, p2}, Lio/sentry/x0;->P0(Lio/sentry/g0;)Ljava/util/Date;

    .line 261
    .line 262
    .line 263
    move-result-object v3

    .line 264
    if-eqz v3, :cond_0

    .line 265
    .line 266
    invoke-static {v0, v3}, Lio/sentry/j3;->c0(Lio/sentry/j3;Ljava/util/Date;)Ljava/util/Date;

    .line 267
    .line 268
    .line 269
    goto/16 :goto_0

    .line 270
    .line 271
    :pswitch_6
    invoke-virtual {p1}, Lio/sentry/x0;->Z0()Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object v3

    .line 275
    invoke-static {v0, v3}, Lio/sentry/j3;->e0(Lio/sentry/j3;Ljava/lang/String;)Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    goto/16 :goto_0

    .line 279
    .line 280
    :pswitch_7
    invoke-virtual {p1}, Lio/sentry/vendor/gson/stream/a;->f()V

    .line 281
    .line 282
    .line 283
    invoke-virtual {p1}, Lio/sentry/vendor/gson/stream/a;->g0()Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    new-instance v3, Lio/sentry/x3;

    .line 287
    .line 288
    new-instance v4, Lio/sentry/protocol/v$a;

    .line 289
    .line 290
    invoke-direct {v4}, Lio/sentry/protocol/v$a;-><init>()V

    .line 291
    .line 292
    .line 293
    invoke-virtual {p1, p2, v4}, Lio/sentry/x0;->U0(Lio/sentry/g0;Lio/sentry/r0;)Ljava/util/List;

    .line 294
    .line 295
    .line 296
    move-result-object v4

    .line 297
    invoke-direct {v3, v4}, Lio/sentry/x3;-><init>(Ljava/util/List;)V

    .line 298
    .line 299
    .line 300
    invoke-static {v0, v3}, Lio/sentry/j3;->f0(Lio/sentry/j3;Lio/sentry/x3;)Lio/sentry/x3;

    .line 301
    .line 302
    .line 303
    invoke-virtual {p1}, Lio/sentry/vendor/gson/stream/a;->s()V

    .line 304
    .line 305
    .line 306
    goto/16 :goto_0

    .line 307
    .line 308
    :pswitch_8
    invoke-virtual {p1}, Lio/sentry/x0;->X0()Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object v3

    .line 312
    check-cast v3, Ljava/util/List;

    .line 313
    .line 314
    if-eqz v3, :cond_0

    .line 315
    .line 316
    invoke-static {v0, v3}, Lio/sentry/j3;->j0(Lio/sentry/j3;Ljava/util/List;)Ljava/util/List;

    .line 317
    .line 318
    .line 319
    goto/16 :goto_0

    .line 320
    .line 321
    :pswitch_9
    new-instance v3, Lio/sentry/protocol/d$a;

    .line 322
    .line 323
    invoke-direct {v3}, Lio/sentry/protocol/d$a;-><init>()V

    .line 324
    .line 325
    .line 326
    invoke-virtual {p1, p2, v3}, Lio/sentry/x0;->Y0(Lio/sentry/g0;Lio/sentry/r0;)Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object v3

    .line 330
    check-cast v3, Lio/sentry/protocol/d;

    .line 331
    .line 332
    invoke-static {v0, v3}, Lio/sentry/j3;->l0(Lio/sentry/j3;Lio/sentry/protocol/d;)Lio/sentry/protocol/d;

    .line 333
    .line 334
    .line 335
    goto/16 :goto_0

    .line 336
    .line 337
    :cond_c
    invoke-virtual {v0, v2}, Lio/sentry/j3;->C0(Ljava/util/Map;)V

    .line 338
    .line 339
    .line 340
    invoke-virtual {p1}, Lio/sentry/vendor/gson/stream/a;->s()V

    .line 341
    .line 342
    .line 343
    return-object v0

    .line 344
    nop

    .line 345
    :sswitch_data_0
    .sparse-switch
        -0x6db2cb8f -> :sswitch_9
        -0x5203171c -> :sswitch_8
        -0x4fbf4c57 -> :sswitch_7
        -0x41680a70 -> :sswitch_6
        0x3492916 -> :sswitch_5
        0x6219b84 -> :sswitch_4
        0x38eb0007 -> :sswitch_3
        0x49292787 -> :sswitch_2
        0x584fd04f -> :sswitch_1
        0x7fa0d2de -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
