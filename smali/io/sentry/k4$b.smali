.class public final Lio/sentry/k4$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/r0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/sentry/k4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/sentry/r0<",
        "Lio/sentry/k4;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private c(Ljava/lang/String;Lio/sentry/g0;)Ljava/lang/Exception;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "Missing required field \""

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const-string p1, "\""

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 24
    .line 25
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    sget-object v1, Lio/sentry/n3;->ERROR:Lio/sentry/n3;

    .line 29
    .line 30
    invoke-interface {p2, v1, p1, v0}, Lio/sentry/g0;->b(Lio/sentry/n3;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 31
    .line 32
    .line 33
    return-object v0
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


# virtual methods
.method public bridge synthetic a(Lio/sentry/x0;Lio/sentry/g0;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lio/sentry/k4$b;->b(Lio/sentry/x0;Lio/sentry/g0;)Lio/sentry/k4;

    move-result-object p1

    return-object p1
.end method

.method public b(Lio/sentry/x0;Lio/sentry/g0;)Lio/sentry/k4;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    invoke-virtual/range {p1 .. p1}, Lio/sentry/vendor/gson/stream/a;->f()V

    .line 8
    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    move-object v4, v3

    .line 12
    move-object v5, v4

    .line 13
    move-object v6, v5

    .line 14
    move-object v7, v6

    .line 15
    move-object v8, v7

    .line 16
    move-object v9, v8

    .line 17
    move-object v11, v9

    .line 18
    move-object v12, v11

    .line 19
    move-object v13, v12

    .line 20
    :goto_0
    invoke-virtual/range {p1 .. p1}, Lio/sentry/vendor/gson/stream/a;->z0()Lio/sentry/vendor/gson/stream/b;

    .line 21
    .line 22
    .line 23
    move-result-object v10

    .line 24
    sget-object v14, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    .line 25
    .line 26
    const-string v15, "public_key"

    .line 27
    .line 28
    const-string v0, "trace_id"

    .line 29
    .line 30
    if-ne v10, v14, :cond_a

    .line 31
    .line 32
    invoke-virtual/range {p1 .. p1}, Lio/sentry/vendor/gson/stream/a;->g0()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v10

    .line 36
    invoke-virtual {v10}, Ljava/lang/String;->hashCode()I

    .line 37
    .line 38
    .line 39
    invoke-virtual {v10}, Ljava/lang/String;->hashCode()I

    .line 40
    .line 41
    .line 42
    move-result v14

    .line 43
    const/16 v16, -0x1

    .line 44
    .line 45
    sparse-switch v14, :sswitch_data_0

    .line 46
    .line 47
    .line 48
    goto/16 :goto_1

    .line 49
    .line 50
    :sswitch_0
    const-string v0, "transaction"

    .line 51
    .line 52
    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-nez v0, :cond_0

    .line 57
    .line 58
    goto/16 :goto_1

    .line 59
    .line 60
    :cond_0
    const/16 v16, 0x8

    .line 61
    .line 62
    goto/16 :goto_1

    .line 63
    .line 64
    :sswitch_1
    invoke-virtual {v10, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-nez v0, :cond_1

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_1
    const/16 v16, 0x7

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :sswitch_2
    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-nez v0, :cond_2

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_2
    const/16 v16, 0x6

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :sswitch_3
    const-string v0, "release"

    .line 85
    .line 86
    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-nez v0, :cond_3

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_3
    const/16 v16, 0x5

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :sswitch_4
    const-string v0, "sample_rate"

    .line 97
    .line 98
    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    if-nez v0, :cond_4

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_4
    const/16 v16, 0x4

    .line 106
    .line 107
    goto :goto_1

    .line 108
    :sswitch_5
    const-string v0, "user"

    .line 109
    .line 110
    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    if-nez v0, :cond_5

    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_5
    const/16 v16, 0x3

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :sswitch_6
    const-string v0, "environment"

    .line 121
    .line 122
    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    if-nez v0, :cond_6

    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_6
    const/16 v16, 0x2

    .line 130
    .line 131
    goto :goto_1

    .line 132
    :sswitch_7
    const-string v0, "user_id"

    .line 133
    .line 134
    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    if-nez v0, :cond_7

    .line 139
    .line 140
    goto :goto_1

    .line 141
    :cond_7
    const/16 v16, 0x1

    .line 142
    .line 143
    goto :goto_1

    .line 144
    :sswitch_8
    const-string v0, "user_segment"

    .line 145
    .line 146
    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result v0

    .line 150
    if-nez v0, :cond_8

    .line 151
    .line 152
    goto :goto_1

    .line 153
    :cond_8
    const/16 v16, 0x0

    .line 154
    .line 155
    :goto_1
    packed-switch v16, :pswitch_data_0

    .line 156
    .line 157
    .line 158
    if-nez v13, :cond_9

    .line 159
    .line 160
    new-instance v13, Lj$/util/concurrent/ConcurrentHashMap;

    .line 161
    .line 162
    invoke-direct {v13}, Lj$/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 163
    .line 164
    .line 165
    :cond_9
    invoke-virtual {v1, v2, v13, v10}, Lio/sentry/x0;->b1(Lio/sentry/g0;Ljava/util/Map;Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    goto :goto_2

    .line 169
    :pswitch_0
    invoke-virtual/range {p1 .. p1}, Lio/sentry/x0;->Z0()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    move-object v11, v0

    .line 174
    goto :goto_2

    .line 175
    :pswitch_1
    invoke-virtual/range {p1 .. p1}, Lio/sentry/vendor/gson/stream/a;->t0()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    move-object v7, v0

    .line 180
    goto :goto_2

    .line 181
    :pswitch_2
    new-instance v0, Lio/sentry/protocol/p$a;

    .line 182
    .line 183
    invoke-direct {v0}, Lio/sentry/protocol/p$a;-><init>()V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v0, v1, v2}, Lio/sentry/protocol/p$a;->b(Lio/sentry/x0;Lio/sentry/g0;)Lio/sentry/protocol/p;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    move-object v5, v0

    .line 191
    goto :goto_2

    .line 192
    :pswitch_3
    invoke-virtual/range {p1 .. p1}, Lio/sentry/x0;->Z0()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    move-object v8, v0

    .line 197
    goto :goto_2

    .line 198
    :pswitch_4
    invoke-virtual/range {p1 .. p1}, Lio/sentry/x0;->Z0()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    move-object v12, v0

    .line 203
    goto :goto_2

    .line 204
    :pswitch_5
    new-instance v0, Lio/sentry/k4$c$a;

    .line 205
    .line 206
    invoke-direct {v0}, Lio/sentry/k4$c$a;-><init>()V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v1, v2, v0}, Lio/sentry/x0;->Y0(Lio/sentry/g0;Lio/sentry/r0;)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    check-cast v0, Lio/sentry/k4$c;

    .line 214
    .line 215
    move-object v3, v0

    .line 216
    goto :goto_2

    .line 217
    :pswitch_6
    invoke-virtual/range {p1 .. p1}, Lio/sentry/x0;->Z0()Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    move-object v9, v0

    .line 222
    goto :goto_2

    .line 223
    :pswitch_7
    invoke-virtual/range {p1 .. p1}, Lio/sentry/x0;->Z0()Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    move-object v4, v0

    .line 228
    goto :goto_2

    .line 229
    :pswitch_8
    invoke-virtual/range {p1 .. p1}, Lio/sentry/x0;->Z0()Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    move-object v6, v0

    .line 234
    :goto_2
    move-object/from16 v0, p0

    .line 235
    .line 236
    goto/16 :goto_0

    .line 237
    .line 238
    :cond_a
    if-eqz v5, :cond_e

    .line 239
    .line 240
    if-eqz v7, :cond_d

    .line 241
    .line 242
    if-eqz v3, :cond_c

    .line 243
    .line 244
    if-nez v4, :cond_b

    .line 245
    .line 246
    invoke-virtual {v3}, Lio/sentry/k4$c;->a()Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v4

    .line 250
    :cond_b
    if-nez v6, :cond_c

    .line 251
    .line 252
    invoke-virtual {v3}, Lio/sentry/k4$c;->b()Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    move-object v10, v0

    .line 257
    move-object v0, v4

    .line 258
    goto :goto_3

    .line 259
    :cond_c
    move-object v0, v4

    .line 260
    move-object v10, v6

    .line 261
    :goto_3
    new-instance v2, Lio/sentry/k4;

    .line 262
    .line 263
    move-object v4, v2

    .line 264
    move-object v6, v7

    .line 265
    move-object v7, v8

    .line 266
    move-object v8, v9

    .line 267
    move-object v9, v0

    .line 268
    invoke-direct/range {v4 .. v12}, Lio/sentry/k4;-><init>(Lio/sentry/protocol/p;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 269
    .line 270
    .line 271
    invoke-virtual {v2, v13}, Lio/sentry/k4;->b(Ljava/util/Map;)V

    .line 272
    .line 273
    .line 274
    invoke-virtual/range {p1 .. p1}, Lio/sentry/vendor/gson/stream/a;->s()V

    .line 275
    .line 276
    .line 277
    return-object v2

    .line 278
    :cond_d
    move-object/from16 v0, p0

    .line 279
    .line 280
    invoke-direct {v0, v15, v2}, Lio/sentry/k4$b;->c(Ljava/lang/String;Lio/sentry/g0;)Ljava/lang/Exception;

    .line 281
    .line 282
    .line 283
    move-result-object v1

    .line 284
    throw v1

    .line 285
    :cond_e
    move-object v1, v0

    .line 286
    move-object/from16 v0, p0

    .line 287
    .line 288
    invoke-direct {v0, v1, v2}, Lio/sentry/k4$b;->c(Ljava/lang/String;Lio/sentry/g0;)Ljava/lang/Exception;

    .line 289
    .line 290
    .line 291
    move-result-object v1

    .line 292
    throw v1

    .line 293
    :sswitch_data_0
    .sparse-switch
        -0x2f6bc941 -> :sswitch_8
        -0x8c511f1 -> :sswitch_7
        -0x51ecded -> :sswitch_6
        0x36ebcb -> :sswitch_5
        0x9218a55 -> :sswitch_4
        0x41012807 -> :sswitch_3
        0x4bb73e55 -> :sswitch_2
        0x71892389 -> :sswitch_1
        0x7fa0d2de -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_0
    .packed-switch 0x0
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
