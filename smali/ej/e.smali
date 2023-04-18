.class public abstract enum Lej/e;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lej/e;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum k:Lej/e;

.field public static final enum l:Lej/e;

.field public static final enum m:Lej/e;

.field public static final enum n:Lej/e;

.field private static final o:[I

.field private static final p:[D

.field private static final q:[D

.field private static final r:[[D

.field private static final synthetic s:[Lej/e;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    new-instance v0, Lej/e$a;

    .line 2
    .line 3
    const-string v1, "SIMPLE"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lej/e$a;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lej/e;->k:Lej/e;

    .line 10
    .line 11
    new-instance v1, Lej/e$b;

    .line 12
    .line 13
    const-string v3, "NOAA"

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    invoke-direct {v1, v3, v4}, Lej/e$b;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lej/e;->l:Lej/e;

    .line 20
    .line 21
    new-instance v3, Lej/e$c;

    .line 22
    .line 23
    const-string v5, "CC"

    .line 24
    .line 25
    const/4 v6, 0x2

    .line 26
    invoke-direct {v3, v5, v6}, Lej/e$c;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v3, Lej/e;->m:Lej/e;

    .line 30
    .line 31
    new-instance v5, Lej/e$d;

    .line 32
    .line 33
    const-string v7, "TIME4J"

    .line 34
    .line 35
    const/4 v8, 0x3

    .line 36
    invoke-direct {v5, v7, v8}, Lej/e$d;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v5, Lej/e;->n:Lej/e;

    .line 40
    .line 41
    const/4 v7, 0x4

    .line 42
    new-array v9, v7, [Lej/e;

    .line 43
    .line 44
    aput-object v0, v9, v2

    .line 45
    .line 46
    aput-object v1, v9, v4

    .line 47
    .line 48
    aput-object v3, v9, v6

    .line 49
    .line 50
    aput-object v5, v9, v8

    .line 51
    .line 52
    sput-object v9, Lej/e;->s:[Lej/e;

    .line 53
    .line 54
    const/16 v0, 0x31

    .line 55
    .line 56
    new-array v1, v0, [I

    .line 57
    .line 58
    fill-array-data v1, :array_0

    .line 59
    .line 60
    .line 61
    sput-object v1, Lej/e;->o:[I

    .line 62
    .line 63
    new-array v1, v0, [D

    .line 64
    .line 65
    fill-array-data v1, :array_1

    .line 66
    .line 67
    .line 68
    sput-object v1, Lej/e;->p:[D

    .line 69
    .line 70
    new-array v1, v0, [D

    .line 71
    .line 72
    fill-array-data v1, :array_2

    .line 73
    .line 74
    .line 75
    sput-object v1, Lej/e;->q:[D

    .line 76
    .line 77
    const/16 v1, 0x3f

    .line 78
    .line 79
    new-array v1, v1, [[D

    .line 80
    .line 81
    const/16 v3, 0x9

    .line 82
    .line 83
    new-array v5, v3, [D

    .line 84
    .line 85
    fill-array-data v5, :array_3

    .line 86
    .line 87
    .line 88
    aput-object v5, v1, v2

    .line 89
    .line 90
    new-array v2, v3, [D

    .line 91
    .line 92
    fill-array-data v2, :array_4

    .line 93
    .line 94
    .line 95
    aput-object v2, v1, v4

    .line 96
    .line 97
    new-array v2, v3, [D

    .line 98
    .line 99
    fill-array-data v2, :array_5

    .line 100
    .line 101
    .line 102
    aput-object v2, v1, v6

    .line 103
    .line 104
    new-array v2, v3, [D

    .line 105
    .line 106
    fill-array-data v2, :array_6

    .line 107
    .line 108
    .line 109
    aput-object v2, v1, v8

    .line 110
    .line 111
    new-array v2, v3, [D

    .line 112
    .line 113
    fill-array-data v2, :array_7

    .line 114
    .line 115
    .line 116
    aput-object v2, v1, v7

    .line 117
    .line 118
    new-array v2, v3, [D

    .line 119
    .line 120
    fill-array-data v2, :array_8

    .line 121
    .line 122
    .line 123
    const/4 v4, 0x5

    .line 124
    aput-object v2, v1, v4

    .line 125
    .line 126
    new-array v2, v3, [D

    .line 127
    .line 128
    fill-array-data v2, :array_9

    .line 129
    .line 130
    .line 131
    const/4 v4, 0x6

    .line 132
    aput-object v2, v1, v4

    .line 133
    .line 134
    new-array v2, v3, [D

    .line 135
    .line 136
    fill-array-data v2, :array_a

    .line 137
    .line 138
    .line 139
    const/4 v4, 0x7

    .line 140
    aput-object v2, v1, v4

    .line 141
    .line 142
    new-array v2, v3, [D

    .line 143
    .line 144
    fill-array-data v2, :array_b

    .line 145
    .line 146
    .line 147
    const/16 v4, 0x8

    .line 148
    .line 149
    aput-object v2, v1, v4

    .line 150
    .line 151
    new-array v2, v3, [D

    .line 152
    .line 153
    fill-array-data v2, :array_c

    .line 154
    .line 155
    .line 156
    aput-object v2, v1, v3

    .line 157
    .line 158
    new-array v2, v3, [D

    .line 159
    .line 160
    fill-array-data v2, :array_d

    .line 161
    .line 162
    .line 163
    const/16 v4, 0xa

    .line 164
    .line 165
    aput-object v2, v1, v4

    .line 166
    .line 167
    new-array v2, v3, [D

    .line 168
    .line 169
    fill-array-data v2, :array_e

    .line 170
    .line 171
    .line 172
    const/16 v4, 0xb

    .line 173
    .line 174
    aput-object v2, v1, v4

    .line 175
    .line 176
    new-array v2, v3, [D

    .line 177
    .line 178
    fill-array-data v2, :array_f

    .line 179
    .line 180
    .line 181
    const/16 v4, 0xc

    .line 182
    .line 183
    aput-object v2, v1, v4

    .line 184
    .line 185
    new-array v2, v3, [D

    .line 186
    .line 187
    fill-array-data v2, :array_10

    .line 188
    .line 189
    .line 190
    const/16 v4, 0xd

    .line 191
    .line 192
    aput-object v2, v1, v4

    .line 193
    .line 194
    new-array v2, v3, [D

    .line 195
    .line 196
    fill-array-data v2, :array_11

    .line 197
    .line 198
    .line 199
    const/16 v4, 0xe

    .line 200
    .line 201
    aput-object v2, v1, v4

    .line 202
    .line 203
    new-array v2, v3, [D

    .line 204
    .line 205
    fill-array-data v2, :array_12

    .line 206
    .line 207
    .line 208
    const/16 v4, 0xf

    .line 209
    .line 210
    aput-object v2, v1, v4

    .line 211
    .line 212
    new-array v2, v3, [D

    .line 213
    .line 214
    fill-array-data v2, :array_13

    .line 215
    .line 216
    .line 217
    const/16 v4, 0x10

    .line 218
    .line 219
    aput-object v2, v1, v4

    .line 220
    .line 221
    new-array v2, v3, [D

    .line 222
    .line 223
    fill-array-data v2, :array_14

    .line 224
    .line 225
    .line 226
    const/16 v4, 0x11

    .line 227
    .line 228
    aput-object v2, v1, v4

    .line 229
    .line 230
    new-array v2, v3, [D

    .line 231
    .line 232
    fill-array-data v2, :array_15

    .line 233
    .line 234
    .line 235
    const/16 v4, 0x12

    .line 236
    .line 237
    aput-object v2, v1, v4

    .line 238
    .line 239
    new-array v2, v3, [D

    .line 240
    .line 241
    fill-array-data v2, :array_16

    .line 242
    .line 243
    .line 244
    const/16 v4, 0x13

    .line 245
    .line 246
    aput-object v2, v1, v4

    .line 247
    .line 248
    new-array v2, v3, [D

    .line 249
    .line 250
    fill-array-data v2, :array_17

    .line 251
    .line 252
    .line 253
    const/16 v4, 0x14

    .line 254
    .line 255
    aput-object v2, v1, v4

    .line 256
    .line 257
    new-array v2, v3, [D

    .line 258
    .line 259
    fill-array-data v2, :array_18

    .line 260
    .line 261
    .line 262
    const/16 v4, 0x15

    .line 263
    .line 264
    aput-object v2, v1, v4

    .line 265
    .line 266
    new-array v2, v3, [D

    .line 267
    .line 268
    fill-array-data v2, :array_19

    .line 269
    .line 270
    .line 271
    const/16 v4, 0x16

    .line 272
    .line 273
    aput-object v2, v1, v4

    .line 274
    .line 275
    new-array v2, v3, [D

    .line 276
    .line 277
    fill-array-data v2, :array_1a

    .line 278
    .line 279
    .line 280
    const/16 v4, 0x17

    .line 281
    .line 282
    aput-object v2, v1, v4

    .line 283
    .line 284
    new-array v2, v3, [D

    .line 285
    .line 286
    fill-array-data v2, :array_1b

    .line 287
    .line 288
    .line 289
    const/16 v4, 0x18

    .line 290
    .line 291
    aput-object v2, v1, v4

    .line 292
    .line 293
    new-array v2, v3, [D

    .line 294
    .line 295
    fill-array-data v2, :array_1c

    .line 296
    .line 297
    .line 298
    const/16 v4, 0x19

    .line 299
    .line 300
    aput-object v2, v1, v4

    .line 301
    .line 302
    new-array v2, v3, [D

    .line 303
    .line 304
    fill-array-data v2, :array_1d

    .line 305
    .line 306
    .line 307
    const/16 v4, 0x1a

    .line 308
    .line 309
    aput-object v2, v1, v4

    .line 310
    .line 311
    new-array v2, v3, [D

    .line 312
    .line 313
    fill-array-data v2, :array_1e

    .line 314
    .line 315
    .line 316
    const/16 v4, 0x1b

    .line 317
    .line 318
    aput-object v2, v1, v4

    .line 319
    .line 320
    new-array v2, v3, [D

    .line 321
    .line 322
    fill-array-data v2, :array_1f

    .line 323
    .line 324
    .line 325
    const/16 v4, 0x1c

    .line 326
    .line 327
    aput-object v2, v1, v4

    .line 328
    .line 329
    new-array v2, v3, [D

    .line 330
    .line 331
    fill-array-data v2, :array_20

    .line 332
    .line 333
    .line 334
    const/16 v4, 0x1d

    .line 335
    .line 336
    aput-object v2, v1, v4

    .line 337
    .line 338
    new-array v2, v3, [D

    .line 339
    .line 340
    fill-array-data v2, :array_21

    .line 341
    .line 342
    .line 343
    const/16 v4, 0x1e

    .line 344
    .line 345
    aput-object v2, v1, v4

    .line 346
    .line 347
    new-array v2, v3, [D

    .line 348
    .line 349
    fill-array-data v2, :array_22

    .line 350
    .line 351
    .line 352
    const/16 v4, 0x1f

    .line 353
    .line 354
    aput-object v2, v1, v4

    .line 355
    .line 356
    new-array v2, v3, [D

    .line 357
    .line 358
    fill-array-data v2, :array_23

    .line 359
    .line 360
    .line 361
    const/16 v4, 0x20

    .line 362
    .line 363
    aput-object v2, v1, v4

    .line 364
    .line 365
    new-array v2, v3, [D

    .line 366
    .line 367
    fill-array-data v2, :array_24

    .line 368
    .line 369
    .line 370
    const/16 v4, 0x21

    .line 371
    .line 372
    aput-object v2, v1, v4

    .line 373
    .line 374
    new-array v2, v3, [D

    .line 375
    .line 376
    fill-array-data v2, :array_25

    .line 377
    .line 378
    .line 379
    const/16 v4, 0x22

    .line 380
    .line 381
    aput-object v2, v1, v4

    .line 382
    .line 383
    new-array v2, v3, [D

    .line 384
    .line 385
    fill-array-data v2, :array_26

    .line 386
    .line 387
    .line 388
    const/16 v4, 0x23

    .line 389
    .line 390
    aput-object v2, v1, v4

    .line 391
    .line 392
    new-array v2, v3, [D

    .line 393
    .line 394
    fill-array-data v2, :array_27

    .line 395
    .line 396
    .line 397
    const/16 v4, 0x24

    .line 398
    .line 399
    aput-object v2, v1, v4

    .line 400
    .line 401
    new-array v2, v3, [D

    .line 402
    .line 403
    fill-array-data v2, :array_28

    .line 404
    .line 405
    .line 406
    const/16 v4, 0x25

    .line 407
    .line 408
    aput-object v2, v1, v4

    .line 409
    .line 410
    new-array v2, v3, [D

    .line 411
    .line 412
    fill-array-data v2, :array_29

    .line 413
    .line 414
    .line 415
    const/16 v4, 0x26

    .line 416
    .line 417
    aput-object v2, v1, v4

    .line 418
    .line 419
    new-array v2, v3, [D

    .line 420
    .line 421
    fill-array-data v2, :array_2a

    .line 422
    .line 423
    .line 424
    const/16 v4, 0x27

    .line 425
    .line 426
    aput-object v2, v1, v4

    .line 427
    .line 428
    new-array v2, v3, [D

    .line 429
    .line 430
    fill-array-data v2, :array_2b

    .line 431
    .line 432
    .line 433
    const/16 v4, 0x28

    .line 434
    .line 435
    aput-object v2, v1, v4

    .line 436
    .line 437
    new-array v2, v3, [D

    .line 438
    .line 439
    fill-array-data v2, :array_2c

    .line 440
    .line 441
    .line 442
    const/16 v4, 0x29

    .line 443
    .line 444
    aput-object v2, v1, v4

    .line 445
    .line 446
    new-array v2, v3, [D

    .line 447
    .line 448
    fill-array-data v2, :array_2d

    .line 449
    .line 450
    .line 451
    const/16 v4, 0x2a

    .line 452
    .line 453
    aput-object v2, v1, v4

    .line 454
    .line 455
    new-array v2, v3, [D

    .line 456
    .line 457
    fill-array-data v2, :array_2e

    .line 458
    .line 459
    .line 460
    const/16 v4, 0x2b

    .line 461
    .line 462
    aput-object v2, v1, v4

    .line 463
    .line 464
    new-array v2, v3, [D

    .line 465
    .line 466
    fill-array-data v2, :array_2f

    .line 467
    .line 468
    .line 469
    const/16 v4, 0x2c

    .line 470
    .line 471
    aput-object v2, v1, v4

    .line 472
    .line 473
    new-array v2, v3, [D

    .line 474
    .line 475
    fill-array-data v2, :array_30

    .line 476
    .line 477
    .line 478
    const/16 v4, 0x2d

    .line 479
    .line 480
    aput-object v2, v1, v4

    .line 481
    .line 482
    new-array v2, v3, [D

    .line 483
    .line 484
    fill-array-data v2, :array_31

    .line 485
    .line 486
    .line 487
    const/16 v4, 0x2e

    .line 488
    .line 489
    aput-object v2, v1, v4

    .line 490
    .line 491
    new-array v2, v3, [D

    .line 492
    .line 493
    fill-array-data v2, :array_32

    .line 494
    .line 495
    .line 496
    const/16 v4, 0x2f

    .line 497
    .line 498
    aput-object v2, v1, v4

    .line 499
    .line 500
    new-array v2, v3, [D

    .line 501
    .line 502
    fill-array-data v2, :array_33

    .line 503
    .line 504
    .line 505
    const/16 v4, 0x30

    .line 506
    .line 507
    aput-object v2, v1, v4

    .line 508
    .line 509
    new-array v2, v3, [D

    .line 510
    .line 511
    fill-array-data v2, :array_34

    .line 512
    .line 513
    .line 514
    aput-object v2, v1, v0

    .line 515
    .line 516
    new-array v0, v3, [D

    .line 517
    .line 518
    fill-array-data v0, :array_35

    .line 519
    .line 520
    .line 521
    const/16 v2, 0x32

    .line 522
    .line 523
    aput-object v0, v1, v2

    .line 524
    .line 525
    new-array v0, v3, [D

    .line 526
    .line 527
    fill-array-data v0, :array_36

    .line 528
    .line 529
    .line 530
    const/16 v2, 0x33

    .line 531
    .line 532
    aput-object v0, v1, v2

    .line 533
    .line 534
    new-array v0, v3, [D

    .line 535
    .line 536
    fill-array-data v0, :array_37

    .line 537
    .line 538
    .line 539
    const/16 v2, 0x34

    .line 540
    .line 541
    aput-object v0, v1, v2

    .line 542
    .line 543
    new-array v0, v3, [D

    .line 544
    .line 545
    fill-array-data v0, :array_38

    .line 546
    .line 547
    .line 548
    const/16 v2, 0x35

    .line 549
    .line 550
    aput-object v0, v1, v2

    .line 551
    .line 552
    new-array v0, v3, [D

    .line 553
    .line 554
    fill-array-data v0, :array_39

    .line 555
    .line 556
    .line 557
    const/16 v2, 0x36

    .line 558
    .line 559
    aput-object v0, v1, v2

    .line 560
    .line 561
    new-array v0, v3, [D

    .line 562
    .line 563
    fill-array-data v0, :array_3a

    .line 564
    .line 565
    .line 566
    const/16 v2, 0x37

    .line 567
    .line 568
    aput-object v0, v1, v2

    .line 569
    .line 570
    new-array v0, v3, [D

    .line 571
    .line 572
    fill-array-data v0, :array_3b

    .line 573
    .line 574
    .line 575
    const/16 v2, 0x38

    .line 576
    .line 577
    aput-object v0, v1, v2

    .line 578
    .line 579
    new-array v0, v3, [D

    .line 580
    .line 581
    fill-array-data v0, :array_3c

    .line 582
    .line 583
    .line 584
    const/16 v2, 0x39

    .line 585
    .line 586
    aput-object v0, v1, v2

    .line 587
    .line 588
    new-array v0, v3, [D

    .line 589
    .line 590
    fill-array-data v0, :array_3d

    .line 591
    .line 592
    .line 593
    const/16 v2, 0x3a

    .line 594
    .line 595
    aput-object v0, v1, v2

    .line 596
    .line 597
    new-array v0, v3, [D

    .line 598
    .line 599
    fill-array-data v0, :array_3e

    .line 600
    .line 601
    .line 602
    const/16 v2, 0x3b

    .line 603
    .line 604
    aput-object v0, v1, v2

    .line 605
    .line 606
    new-array v0, v3, [D

    .line 607
    .line 608
    fill-array-data v0, :array_3f

    .line 609
    .line 610
    .line 611
    const/16 v2, 0x3c

    .line 612
    .line 613
    aput-object v0, v1, v2

    .line 614
    .line 615
    new-array v0, v3, [D

    .line 616
    .line 617
    fill-array-data v0, :array_40

    .line 618
    .line 619
    .line 620
    const/16 v2, 0x3d

    .line 621
    .line 622
    aput-object v0, v1, v2

    .line 623
    .line 624
    new-array v0, v3, [D

    .line 625
    .line 626
    fill-array-data v0, :array_41

    .line 627
    .line 628
    .line 629
    const/16 v2, 0x3e

    .line 630
    .line 631
    aput-object v0, v1, v2

    .line 632
    .line 633
    sput-object v1, Lej/e;->r:[[D

    .line 634
    .line 635
    return-void

    .line 636
    nop

    .line 637
    :array_0
    .array-data 4
        0x627ce
        0x2fa87
        0x1d289
        0x1b708
        0xf33
        0xb03
        0x6b9
        0x294
        0x15e
        0x14e
        0x13a
        0x10c
        0xf2
        0xea
        0x9e
        0x84
        0x81
        0x72
        0x63
        0x5d
        0x56
        0x4e
        0x48
        0x44
        0x40
        0x2e
        0x26
        0x25
        0x20
        0x1d
        0x1c
        0x1b
        0x1b
        0x19
        0x18
        0x15
        0x15
        0x14
        0x12
        0x11
        0xe
        0xd
        0xd
        0xd
        0xc
        0xa
        0xa
        0xa
        0xa
    .end array-data

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
    :array_1
    .array-data 8
        0x4070e8c71b478423L    # 270.54861
        0x4075430f7b9e0610L    # 340.19128
        0x404ff592b7fe08afL    # 63.91854
        0x4074b431f8a0902eL    # 331.2622
        0x4073dd7ced916873L    # 317.843
        0x4055a8624dd2f1aaL    # 86.631
        0x406e01a9fbe76c8bL    # 240.052
        0x40736428f5c28f5cL    # 310.26
        0x406ee75c28f5c28fL    # 247.23
        0x40704deb851eb852L    # 260.87
        0x40729d1eb851eb85L    # 297.82
        0x4075723d70a3d70aL    # 343.14
        0x4064d947ae147ae1L    # 166.79
        0x405461eb851eb852L    # 81.53
        0x400c000000000000L    # 3.5
        0x4060980000000000L    # 132.75
        0x4066de6666666666L    # 182.95
        0x406440f5c28f5c29L    # 162.03
        0x403dcccccccccccdL    # 29.8
        0x4070a66666666666L    # 266.4
        0x406f266666666666L    # 249.2
        0x4063b33333333333L    # 157.6
        0x40701ccccccccccdL    # 257.8
        0x4067233333333333L    # 185.1
        0x405179999999999aL    # 69.9
        0x4020000000000000L    # 8.0
        0x4068a33333333333L    # 197.1
        0x406f4ccccccccccdL    # 250.4
        0x4050533333333333L    # 65.3
        0x4064566666666666L    # 162.7
        0x4075580000000000L    # 341.5
        0x407239999999999aL    # 291.6
        0x4058a00000000000L    # 98.5
        0x4062566666666666L    # 146.7
        0x405b800000000000L    # 110.0
        0x4014cccccccccccdL    # 5.2
        0x407569999999999aL    # 342.6
        0x406cdccccccccccdL    # 230.9
        0x407001999999999aL    # 256.1
        0x4046a66666666666L    # 45.3
        0x406e5ccccccccccdL    # 242.9
        0x405ccccccccccccdL    # 115.2
        0x4062f9999999999aL    # 151.8
        0x4071d4cccccccccdL    # 285.3
        0x404aa66666666666L    # 53.3
        0x405fa66666666666L    # 126.6
        0x4069b66666666666L    # 205.7
        0x405579999999999aL    # 85.9
        0x4062433333333333L    # 146.1
    .end array-data

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
    :array_2
    .array-data 8
        0x3fedb8a420dc189aL    # 0.9287892
        0x40e193e4680105b9L    # 35999.1376958
        0x40e193ed16411f85L    # 35999.4089666
        0x40e193d751d3671bL    # 35998.7287385
        0x40f193e33de3fbbdL    # 71998.20261
        0x40f193e70b780347L    # 71998.4403
        0x40e1940b6eac8605L    # 36000.35726
        0x40f193d7b2fec56dL    # 71997.4812
        0x40e0188ef837b4a2L    # 32964.4678
        -0x3fcc8f1a9fbe76c9L    # -19.441
        0x411b2d4c72617c1cL    # 445267.1117
        0x40e5fd9c49ba5e35L    # 45036.884
        0x4008ce703afb7e91L    # 3.1008
        0x40d5fd9c60aa64c3L    # 22518.4434
        -0x3fcc06ae7d566cf4L    # -19.9739
        0x40f0188ef3b645a2L    # 65928.9345
        0x40c1a703c01a36e3L    # 9038.0293
        0x40a7b5896bb98c7eL    # 3034.7684
        0x40e076c4bc6a7efaL    # 33718.148
        0x40a7b4e560418937L    # 3034.448
        -0x3f5e2e7439581062L    # -2280.773
        0x40dd3a7f7ced9168L    # 29929.992
        0x40ded11f8d4fdf3bL    # 31556.493
        0x4062b2d0e5604189L    # 149.588
        0x40c1a6e000000000L    # 9037.75
        0x40fa5dd67ae147aeL    # 107997.405
        -0x3f4ea3d2f1a9fbe7L    # -4444.176
        0x4062f8ac083126e9L    # 151.771
        0x40f07e350e560419L    # 67555.316
        0x40ded1051eb851ecL    # 31556.08
        -0x3f4e2e75c28f5c29L    # -4561.54
        0x40fa5dcb4bc6a7f0L    # 107996.706
        0x4093169eb851eb85L    # 1221.655
        0x40eeb5c55810624eL    # 62894.167
        0x40deb3579db22d0eL    # 31437.369
        0x40cc792624dd2f1bL    # 14578.298
        -0x3f20d10f8d4fdf3bL    # -31931.757
        0x40e0fb27c6a7ef9eL    # 34777.243
        0x409317fef9db22d1L    # 1221.999
        0x40eeb5d05a1cac08L    # 62894.511
        -0x3f4ea5f604189375L    # -4442.039
        0x40fa5dde8b439581L    # 107997.909
        0x405dc4395810624eL    # 119.066
        0x40d076c48b439581L    # 16859.071
        -0x3fedb020c49ba5e3L    # -4.578
        0x40da43d2b020c49cL    # 26895.292
        -0x3fbc6fbe76c8b439L    # -39.127
        0x40c804c49ba5e354L    # 12297.536
        0x40f5fd9c72b020c5L    # 90073.778
    .end array-data

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
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    :array_3
    .array-data 8
        0x0
        0x0
        0x0
        0x0
        0x3ff0000000000000L    # 1.0
        -0x3efb012000000000L    # -171996.0
        -0x3f9a39999999999aL    # -174.2
        0x40f6779000000000L    # 92025.0
        0x4021cccccccccccdL    # 8.9
    .end array-data

    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    :array_4
    .array-data 8
        -0x4000000000000000L    # -2.0
        0x0
        0x0
        0x4000000000000000L    # 2.0
        0x4000000000000000L    # 2.0
        -0x3f363e8000000000L    # -13187.0
        -0x4006666666666666L    # -1.6
        0x40b6680000000000L    # 5736.0
        -0x3ff7333333333333L    # -3.1
    .end array-data

    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    :array_5
    .array-data 8
        0x0
        0x0
        0x0
        0x4000000000000000L    # 2.0
        0x4000000000000000L    # 2.0
        -0x3f5e3c0000000000L    # -2274.0
        -0x4036666666666666L    # -0.2
        0x408e880000000000L    # 977.0
        -0x4020000000000000L    # -0.5
    .end array-data

    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    :array_6
    .array-data 8
        0x0
        0x0
        0x0
        0x0
        0x4000000000000000L    # 2.0
        0x40a01c0000000000L    # 2062.0
        0x3fc999999999999aL    # 0.2
        -0x3f74080000000000L    # -895.0
        0x3fe0000000000000L    # 0.5
    .end array-data

    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    :array_7
    .array-data 8
        0x0
        0x3ff0000000000000L    # 1.0
        0x0
        0x0
        0x0
        0x4096480000000000L    # 1426.0
        -0x3ff4cccccccccccdL    # -3.4
        0x404b000000000000L    # 54.0
        -0x4046666666666666L    # -0.1
    .end array-data

    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    :array_8
    .array-data 8
        0x0
        0x0
        0x3ff0000000000000L    # 1.0
        0x0
        0x0
        0x4086400000000000L    # 712.0
        0x3fb999999999999aL    # 0.1
        -0x3fe4000000000000L    # -7.0
        0x0
    .end array-data

    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    :array_9
    .array-data 8
        -0x4000000000000000L    # -2.0
        0x3ff0000000000000L    # 1.0
        0x0
        0x4000000000000000L    # 2.0
        0x4000000000000000L    # 2.0
        -0x3f7fd80000000000L    # -517.0
        0x3ff3333333333333L    # 1.2
        0x406c000000000000L    # 224.0
        -0x401ccccccccccccdL    # -0.6
    .end array-data

    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    :array_a
    .array-data 8
        0x0
        0x0
        0x0
        0x4000000000000000L    # 2.0
        0x3ff0000000000000L    # 1.0
        -0x3f87e00000000000L    # -386.0
        -0x4026666666666666L    # -0.4
        0x4069000000000000L    # 200.0
        0x0
    .end array-data

    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    :array_b
    .array-data 8
        0x0
        0x0
        0x3ff0000000000000L    # 1.0
        0x4000000000000000L    # 2.0
        0x4000000000000000L    # 2.0
        -0x3f8d300000000000L    # -301.0
        0x0
        0x4060200000000000L    # 129.0
        -0x4046666666666666L    # -0.1
    .end array-data

    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    :array_c
    .array-data 8
        -0x4000000000000000L    # -2.0
        -0x4010000000000000L    # -1.0
        0x0
        0x4000000000000000L    # 2.0
        0x4000000000000000L    # 2.0
        0x406b200000000000L    # 217.0
        -0x4020000000000000L    # -0.5
        -0x3fa8400000000000L    # -95.0
        0x3fd3333333333333L    # 0.3
    .end array-data

    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    :array_d
    .array-data 8
        -0x4000000000000000L    # -2.0
        0x0
        0x3ff0000000000000L    # 1.0
        0x0
        0x0
        -0x3f9c400000000000L    # -158.0
        0x0
        0x0
        0x0
    .end array-data

    :array_e
    .array-data 8
        -0x4000000000000000L    # -2.0
        0x0
        0x0
        0x4000000000000000L    # 2.0
        0x3ff0000000000000L    # 1.0
        0x4060200000000000L    # 129.0
        0x3fb999999999999aL    # 0.1
        -0x3fae800000000000L    # -70.0
        0x0
    .end array-data

    :array_f
    .array-data 8
        0x0
        0x0
        -0x4010000000000000L    # -1.0
        0x4000000000000000L    # 2.0
        0x4000000000000000L    # 2.0
        0x405ec00000000000L    # 123.0
        0x0
        -0x3fb5800000000000L    # -53.0
        0x0
    .end array-data

    :array_10
    .array-data 8
        0x4000000000000000L    # 2.0
        0x0
        0x0
        0x0
        0x0
        0x404f800000000000L    # 63.0
        0x0
        0x0
        0x0
    .end array-data

    :array_11
    .array-data 8
        0x0
        0x0
        0x3ff0000000000000L    # 1.0
        0x0
        0x3ff0000000000000L    # 1.0
        0x404f800000000000L    # 63.0
        0x3fb999999999999aL    # 0.1
        -0x3fbf800000000000L    # -33.0
        0x0
    .end array-data

    :array_12
    .array-data 8
        0x4000000000000000L    # 2.0
        0x0
        -0x4010000000000000L    # -1.0
        0x4000000000000000L    # 2.0
        0x4000000000000000L    # 2.0
        -0x3fb2800000000000L    # -59.0
        0x0
        0x403a000000000000L    # 26.0
        0x0
    .end array-data

    :array_13
    .array-data 8
        0x0
        0x0
        -0x4010000000000000L    # -1.0
        0x0
        0x3ff0000000000000L    # 1.0
        -0x3fb3000000000000L    # -58.0
        -0x4046666666666666L    # -0.1
        0x4040000000000000L    # 32.0
        0x0
    .end array-data

    :array_14
    .array-data 8
        0x0
        0x0
        0x3ff0000000000000L    # 1.0
        0x4000000000000000L    # 2.0
        0x3ff0000000000000L    # 1.0
        -0x3fb6800000000000L    # -51.0
        0x0
        0x403b000000000000L    # 27.0
        0x0
    .end array-data

    :array_15
    .array-data 8
        -0x4000000000000000L    # -2.0
        0x0
        0x4000000000000000L    # 2.0
        0x0
        0x0
        0x4048000000000000L    # 48.0
        0x0
        0x0
        0x0
    .end array-data

    :array_16
    .array-data 8
        0x0
        0x0
        -0x4000000000000000L    # -2.0
        0x4000000000000000L    # 2.0
        0x3ff0000000000000L    # 1.0
        0x4047000000000000L    # 46.0
        0x0
        -0x3fc8000000000000L    # -24.0
        0x0
    .end array-data

    :array_17
    .array-data 8
        0x4000000000000000L    # 2.0
        0x0
        0x0
        0x4000000000000000L    # 2.0
        0x4000000000000000L    # 2.0
        -0x3fbd000000000000L    # -38.0
        0x0
        0x4030000000000000L    # 16.0
        0x0
    .end array-data

    :array_18
    .array-data 8
        0x0
        0x0
        0x4000000000000000L    # 2.0
        0x4000000000000000L    # 2.0
        0x4000000000000000L    # 2.0
        -0x3fc1000000000000L    # -31.0
        0x0
        0x402a000000000000L    # 13.0
        0x0
    .end array-data

    :array_19
    .array-data 8
        0x0
        0x0
        0x4000000000000000L    # 2.0
        0x0
        0x0
        0x403d000000000000L    # 29.0
        0x0
        0x0
        0x0
    .end array-data

    :array_1a
    .array-data 8
        -0x4000000000000000L    # -2.0
        0x0
        0x3ff0000000000000L    # 1.0
        0x4000000000000000L    # 2.0
        0x4000000000000000L    # 2.0
        0x403d000000000000L    # 29.0
        0x0
        -0x3fd8000000000000L    # -12.0
        0x0
    .end array-data

    :array_1b
    .array-data 8
        0x0
        0x0
        0x0
        0x4000000000000000L    # 2.0
        0x0
        0x403a000000000000L    # 26.0
        0x0
        0x0
        0x0
    .end array-data

    :array_1c
    .array-data 8
        -0x4000000000000000L    # -2.0
        0x0
        0x0
        0x4000000000000000L    # 2.0
        0x0
        -0x3fca000000000000L    # -22.0
        0x0
        0x0
        0x0
    .end array-data

    :array_1d
    .array-data 8
        0x0
        0x0
        -0x4010000000000000L    # -1.0
        0x4000000000000000L    # 2.0
        0x3ff0000000000000L    # 1.0
        0x4035000000000000L    # 21.0
        0x0
        -0x3fdc000000000000L    # -10.0
        0x0
    .end array-data

    :array_1e
    .array-data 8
        0x0
        0x4000000000000000L    # 2.0
        0x0
        0x0
        0x0
        0x4031000000000000L    # 17.0
        -0x4046666666666666L    # -0.1
        0x0
        0x0
    .end array-data

    :array_1f
    .array-data 8
        0x4000000000000000L    # 2.0
        0x0
        -0x4010000000000000L    # -1.0
        0x0
        0x3ff0000000000000L    # 1.0
        0x4030000000000000L    # 16.0
        0x0
        -0x3fe0000000000000L    # -8.0
        0x0
    .end array-data

    :array_20
    .array-data 8
        -0x4000000000000000L    # -2.0
        0x4000000000000000L    # 2.0
        0x0
        0x4000000000000000L    # 2.0
        0x4000000000000000L    # 2.0
        -0x3fd0000000000000L    # -16.0
        0x3fb999999999999aL    # 0.1
        0x401c000000000000L    # 7.0
        0x0
    .end array-data

    :array_21
    .array-data 8
        0x0
        0x3ff0000000000000L    # 1.0
        0x0
        0x0
        0x3ff0000000000000L    # 1.0
        -0x3fd2000000000000L    # -15.0
        0x0
        0x4022000000000000L    # 9.0
        0x0
    .end array-data

    :array_22
    .array-data 8
        -0x4000000000000000L    # -2.0
        0x0
        0x3ff0000000000000L    # 1.0
        0x0
        0x3ff0000000000000L    # 1.0
        -0x3fd6000000000000L    # -13.0
        0x0
        0x401c000000000000L    # 7.0
        0x0
    .end array-data

    :array_23
    .array-data 8
        0x0
        -0x4010000000000000L    # -1.0
        0x0
        0x0
        0x3ff0000000000000L    # 1.0
        -0x3fd8000000000000L    # -12.0
        0x0
        0x4018000000000000L    # 6.0
        0x0
    .end array-data

    :array_24
    .array-data 8
        0x0
        0x0
        0x4000000000000000L    # 2.0
        -0x4000000000000000L    # -2.0
        0x0
        0x4026000000000000L    # 11.0
        0x0
        0x0
        0x0
    .end array-data

    :array_25
    .array-data 8
        0x4000000000000000L    # 2.0
        0x0
        -0x4010000000000000L    # -1.0
        0x4000000000000000L    # 2.0
        0x3ff0000000000000L    # 1.0
        -0x3fdc000000000000L    # -10.0
        0x0
        0x4014000000000000L    # 5.0
        0x0
    .end array-data

    :array_26
    .array-data 8
        0x4000000000000000L    # 2.0
        0x0
        0x3ff0000000000000L    # 1.0
        0x4000000000000000L    # 2.0
        0x4000000000000000L    # 2.0
        -0x3fe0000000000000L    # -8.0
        0x0
        0x4008000000000000L    # 3.0
        0x0
    .end array-data

    :array_27
    .array-data 8
        0x0
        0x3ff0000000000000L    # 1.0
        0x0
        0x4000000000000000L    # 2.0
        0x4000000000000000L    # 2.0
        0x401c000000000000L    # 7.0
        0x0
        -0x3ff8000000000000L    # -3.0
        0x0
    .end array-data

    :array_28
    .array-data 8
        -0x4000000000000000L    # -2.0
        0x3ff0000000000000L    # 1.0
        0x3ff0000000000000L    # 1.0
        0x0
        0x0
        -0x3fe4000000000000L    # -7.0
        0x0
        0x0
        0x0
    .end array-data

    :array_29
    .array-data 8
        0x0
        -0x4010000000000000L    # -1.0
        0x0
        0x4000000000000000L    # 2.0
        0x4000000000000000L    # 2.0
        -0x3fe4000000000000L    # -7.0
        0x0
        0x4008000000000000L    # 3.0
        0x0
    .end array-data

    :array_2a
    .array-data 8
        0x4000000000000000L    # 2.0
        0x0
        0x0
        0x4000000000000000L    # 2.0
        0x3ff0000000000000L    # 1.0
        -0x3fe4000000000000L    # -7.0
        0x0
        0x4008000000000000L    # 3.0
        0x0
    .end array-data

    :array_2b
    .array-data 8
        0x4000000000000000L    # 2.0
        0x0
        0x3ff0000000000000L    # 1.0
        0x0
        0x0
        0x4018000000000000L    # 6.0
        0x0
        0x0
        0x0
    .end array-data

    :array_2c
    .array-data 8
        -0x4000000000000000L    # -2.0
        0x0
        0x4000000000000000L    # 2.0
        0x4000000000000000L    # 2.0
        0x4000000000000000L    # 2.0
        0x4018000000000000L    # 6.0
        0x0
        -0x3ff8000000000000L    # -3.0
        0x0
    .end array-data

    :array_2d
    .array-data 8
        -0x4000000000000000L    # -2.0
        0x0
        0x3ff0000000000000L    # 1.0
        0x4000000000000000L    # 2.0
        0x3ff0000000000000L    # 1.0
        0x4018000000000000L    # 6.0
        0x0
        -0x3ff8000000000000L    # -3.0
        0x0
    .end array-data

    :array_2e
    .array-data 8
        0x4000000000000000L    # 2.0
        0x0
        -0x4000000000000000L    # -2.0
        0x0
        0x3ff0000000000000L    # 1.0
        -0x3fe8000000000000L    # -6.0
        0x0
        0x4008000000000000L    # 3.0
        0x0
    .end array-data

    :array_2f
    .array-data 8
        0x4000000000000000L    # 2.0
        0x0
        0x0
        0x0
        0x3ff0000000000000L    # 1.0
        -0x3fe8000000000000L    # -6.0
        0x0
        0x4008000000000000L    # 3.0
        0x0
    .end array-data

    :array_30
    .array-data 8
        0x0
        -0x4010000000000000L    # -1.0
        0x3ff0000000000000L    # 1.0
        0x0
        0x0
        0x4014000000000000L    # 5.0
        0x0
        0x0
        0x0
    .end array-data

    :array_31
    .array-data 8
        -0x4000000000000000L    # -2.0
        -0x4010000000000000L    # -1.0
        0x0
        0x4000000000000000L    # 2.0
        0x3ff0000000000000L    # 1.0
        -0x3fec000000000000L    # -5.0
        0x0
        0x4008000000000000L    # 3.0
        0x0
    .end array-data

    :array_32
    .array-data 8
        -0x4000000000000000L    # -2.0
        0x0
        0x0
        0x0
        0x3ff0000000000000L    # 1.0
        -0x3fec000000000000L    # -5.0
        0x0
        0x4008000000000000L    # 3.0
        0x0
    .end array-data

    :array_33
    .array-data 8
        0x0
        0x0
        0x4000000000000000L    # 2.0
        0x4000000000000000L    # 2.0
        0x3ff0000000000000L    # 1.0
        -0x3fec000000000000L    # -5.0
        0x0
        0x4008000000000000L    # 3.0
        0x0
    .end array-data

    :array_34
    .array-data 8
        -0x4000000000000000L    # -2.0
        0x0
        0x4000000000000000L    # 2.0
        0x0
        0x3ff0000000000000L    # 1.0
        0x4010000000000000L    # 4.0
        0x0
        0x0
        0x0
    .end array-data

    :array_35
    .array-data 8
        -0x4000000000000000L    # -2.0
        0x3ff0000000000000L    # 1.0
        0x0
        0x4000000000000000L    # 2.0
        0x3ff0000000000000L    # 1.0
        0x4010000000000000L    # 4.0
        0x0
        0x0
        0x0
    .end array-data

    :array_36
    .array-data 8
        0x0
        0x0
        0x3ff0000000000000L    # 1.0
        -0x4000000000000000L    # -2.0
        0x0
        0x4010000000000000L    # 4.0
        0x0
        0x0
        0x0
    .end array-data

    :array_37
    .array-data 8
        -0x4010000000000000L    # -1.0
        0x0
        0x3ff0000000000000L    # 1.0
        0x0
        0x0
        -0x3ff0000000000000L    # -4.0
        0x0
        0x0
        0x0
    .end array-data

    :array_38
    .array-data 8
        -0x4000000000000000L    # -2.0
        0x3ff0000000000000L    # 1.0
        0x0
        0x0
        0x0
        -0x3ff0000000000000L    # -4.0
        0x0
        0x0
        0x0
    .end array-data

    :array_39
    .array-data 8
        0x3ff0000000000000L    # 1.0
        0x0
        0x0
        0x0
        0x0
        -0x3ff0000000000000L    # -4.0
        0x0
        0x0
        0x0
    .end array-data

    :array_3a
    .array-data 8
        0x0
        0x0
        0x3ff0000000000000L    # 1.0
        0x4000000000000000L    # 2.0
        0x0
        0x4008000000000000L    # 3.0
        0x0
        0x0
        0x0
    .end array-data

    :array_3b
    .array-data 8
        0x0
        0x0
        -0x4000000000000000L    # -2.0
        0x4000000000000000L    # 2.0
        0x4000000000000000L    # 2.0
        -0x3ff8000000000000L    # -3.0
        0x0
        0x0
        0x0
    .end array-data

    :array_3c
    .array-data 8
        -0x4010000000000000L    # -1.0
        -0x4010000000000000L    # -1.0
        0x3ff0000000000000L    # 1.0
        0x0
        0x0
        -0x3ff8000000000000L    # -3.0
        0x0
        0x0
        0x0
    .end array-data

    :array_3d
    .array-data 8
        0x0
        0x3ff0000000000000L    # 1.0
        0x3ff0000000000000L    # 1.0
        0x0
        0x0
        -0x3ff8000000000000L    # -3.0
        0x0
        0x0
        0x0
    .end array-data

    :array_3e
    .array-data 8
        0x0
        -0x4010000000000000L    # -1.0
        0x3ff0000000000000L    # 1.0
        0x4000000000000000L    # 2.0
        0x4000000000000000L    # 2.0
        -0x3ff8000000000000L    # -3.0
        0x0
        0x0
        0x0
    .end array-data

    :array_3f
    .array-data 8
        0x4000000000000000L    # 2.0
        -0x4010000000000000L    # -1.0
        -0x4010000000000000L    # -1.0
        0x4000000000000000L    # 2.0
        0x4000000000000000L    # 2.0
        -0x3ff8000000000000L    # -3.0
        0x0
        0x0
        0x0
    .end array-data

    :array_40
    .array-data 8
        0x0
        0x0
        0x4008000000000000L    # 3.0
        0x4000000000000000L    # 2.0
        0x4000000000000000L    # 2.0
        -0x3ff8000000000000L    # -3.0
        0x0
        0x0
        0x0
    .end array-data

    :array_41
    .array-data 8
        0x4000000000000000L    # 2.0
        -0x4010000000000000L    # -1.0
        0x0
        0x4000000000000000L    # 2.0
        0x4000000000000000L    # 2.0
        -0x3ff8000000000000L    # -3.0
        0x0
        0x0
        0x0
    .end array-data
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;ILej/e$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lej/e;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static a(D)D
    .locals 2

    const-wide v0, 0x40e193e097635e74L    # 35999.01848

    mul-double/2addr p0, v0

    const-wide v0, 0x40663428f5c28f5cL    # 177.63

    add-double/2addr p0, v0

    invoke-static {p0, p1}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide p0

    invoke-static {p0, p1}, Ljava/lang/Math;->cos(D)D

    move-result-wide p0

    const-wide v0, 0x3f198867422e78b9L    # 9.74E-5

    mul-double/2addr p0, v0

    const-wide v0, 0x3f76d5cfaacd9e84L    # 0.005575

    sub-double/2addr p0, v0

    return-wide p0
.end method

.method static synthetic b(D)D
    .locals 0

    invoke-static {p0, p1}, Lej/e;->l(D)D

    move-result-wide p0

    return-wide p0
.end method

.method static synthetic c(DD)D
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lej/e;->e(DD)D

    move-result-wide p0

    return-wide p0
.end method

.method private static e(DD)D
    .locals 10

    .line 1
    sget-object v0, Lej/e;->o:[I

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    add-int/lit8 v0, v0, -0x1

    .line 5
    .line 6
    const-wide/16 v1, 0x0

    .line 7
    .line 8
    :goto_0
    if-ltz v0, :cond_0

    .line 9
    .line 10
    sget-object v3, Lej/e;->o:[I

    .line 11
    .line 12
    aget v3, v3, v0

    .line 13
    .line 14
    int-to-double v3, v3

    .line 15
    sget-object v5, Lej/e;->p:[D

    .line 16
    .line 17
    aget-wide v6, v5, v0

    .line 18
    .line 19
    sget-object v5, Lej/e;->q:[D

    .line 20
    .line 21
    aget-wide v8, v5, v0

    .line 22
    .line 23
    mul-double/2addr v8, p0

    .line 24
    add-double/2addr v6, v8

    .line 25
    invoke-static {v6, v7}, Ljava/lang/Math;->toRadians(D)D

    .line 26
    .line 27
    .line 28
    move-result-wide v5

    .line 29
    invoke-static {v5, v6}, Ljava/lang/Math;->sin(D)D

    .line 30
    .line 31
    .line 32
    move-result-wide v5

    .line 33
    mul-double/2addr v3, v5

    .line 34
    add-double/2addr v1, v3

    .line 35
    add-int/lit8 v0, v0, -0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const-wide v3, 0x40e19418a00cfb3bL    # 36000.76953744

    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    mul-double/2addr v3, p0

    .line 44
    const-wide v5, 0x4071ac6f57dc5fe8L    # 282.7771834

    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    add-double/2addr v3, v5

    .line 50
    const-wide v5, 0x4016eb167b830193L    # 5.729577951308232

    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    mul-double/2addr v1, v5

    .line 56
    const-wide v5, 0x412e848000000000L    # 1000000.0

    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    div-double/2addr v1, v5

    .line 62
    add-double/2addr v3, v1

    .line 63
    invoke-static {p0, p1}, Lej/e;->a(D)D

    .line 64
    .line 65
    .line 66
    move-result-wide p0

    .line 67
    add-double/2addr v3, p0

    .line 68
    add-double/2addr v3, p2

    .line 69
    const-wide p0, 0x4076800000000000L    # 360.0

    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    div-double/2addr v3, p0

    .line 75
    invoke-static {v3, v4}, Ljava/lang/Math;->floor(D)D

    .line 76
    .line 77
    .line 78
    move-result-wide p2

    .line 79
    sub-double/2addr v3, p2

    .line 80
    mul-double/2addr v3, p0

    .line 81
    return-wide v3
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
.end method

.method static i(D)D
    .locals 4

    const-wide v0, 0x3f5db445ed4a1ad6L    # 0.001813

    mul-double/2addr v0, p0

    const-wide v2, -0x40bcaab8a5ce5b42L    # -5.9E-4

    add-double/2addr v0, v2

    mul-double/2addr v0, p0

    const-wide v2, -0x3fb897ae147ae148L    # -46.815

    add-double/2addr v0, v2

    mul-double/2addr v0, p0

    const-wide p0, 0x403572b020c49ba6L    # 21.448

    add-double/2addr v0, p0

    const-wide p0, 0x40ac200000000000L    # 3600.0

    div-double/2addr v0, p0

    const-wide p0, 0x40376eeeeeeeeeefL    # 23.433333333333334

    add-double/2addr v0, p0

    return-wide v0
.end method

.method static j(D[D)V
    .locals 26

    .line 1
    const-wide v0, 0x3ed622f61749a783L    # 5.277768981496142E-6

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    mul-double v0, v0, p0

    .line 7
    .line 8
    const-wide v2, -0x40a0a34366871d96L    # -0.0019142

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    add-double/2addr v0, v2

    .line 14
    mul-double v0, v0, p0

    .line 15
    .line 16
    const-wide v2, 0x411b2d4c7227d029L    # 445267.11148

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    add-double/2addr v0, v2

    .line 22
    mul-double v0, v0, p0

    .line 23
    .line 24
    const-wide v2, 0x40729d9b13165d3aL    # 297.85036

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    add-double/2addr v0, v2

    .line 30
    invoke-static {v0, v1}, Ljava/lang/Math;->toRadians(D)D

    .line 31
    .line 32
    .line 33
    move-result-wide v0

    .line 34
    const-wide v2, -0x413409b89ed0c96aL    # -3.3333333333333333E-6

    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    mul-double v2, v2, p0

    .line 40
    .line 41
    const-wide v4, -0x40dafd397c22904eL    # -1.603E-4

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    add-double/2addr v2, v4

    .line 47
    mul-double v2, v2, p0

    .line 48
    .line 49
    const-wide v4, 0x40e193e19c62a1b6L    # 35999.05034

    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    add-double/2addr v2, v4

    .line 55
    mul-double v2, v2, p0

    .line 56
    .line 57
    const-wide v4, 0x407658718a86d71fL    # 357.52772

    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    add-double/2addr v2, v4

    .line 63
    invoke-static {v2, v3}, Ljava/lang/Math;->toRadians(D)D

    .line 64
    .line 65
    .line 66
    move-result-wide v2

    .line 67
    const-wide v4, 0x3f274d3b7ba75828L    # 1.7777777777777779E-4

    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    mul-double v4, v4, p0

    .line 73
    .line 74
    const-wide v6, 0x3f81cfd66c88bf57L    # 0.0086972

    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    add-double/2addr v4, v6

    .line 80
    mul-double v4, v4, p0

    .line 81
    .line 82
    const-wide v6, 0x411d203b78372e6aL    # 477198.867398

    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    add-double/2addr v4, v6

    .line 88
    mul-double v4, v4, p0

    .line 89
    .line 90
    const-wide v6, 0x4060ded0bb6ed677L    # 134.96298

    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    add-double/2addr v4, v6

    .line 96
    invoke-static {v4, v5}, Ljava/lang/Math;->toRadians(D)D

    .line 97
    .line 98
    .line 99
    move-result-wide v4

    .line 100
    const-wide v6, 0x3ec9a1cf6e0ad913L    # 3.0555810187307116E-6

    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    mul-double v6, v6, p0

    .line 106
    .line 107
    const-wide v8, -0x4091d53cddd6e04cL    # -0.0036825

    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    add-double/2addr v6, v8

    .line 113
    mul-double v6, v6, p0

    .line 114
    .line 115
    const-wide v8, 0x411d7e0811f57b42L    # 483202.017538

    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    add-double/2addr v6, v8

    .line 121
    mul-double v6, v6, p0

    .line 122
    .line 123
    const-wide v8, 0x40575166f9335d25L    # 93.27191

    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    add-double/2addr v6, v8

    .line 129
    invoke-static {v6, v7}, Ljava/lang/Math;->toRadians(D)D

    .line 130
    .line 131
    .line 132
    move-result-wide v6

    .line 133
    const-wide v8, 0x3ec2a42f961f79b9L    # 2.222222222222222E-6

    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    mul-double v8, v8, p0

    .line 139
    .line 140
    const-wide v10, 0x3f60f6c848d98da5L    # 0.0020708

    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    add-double/2addr v8, v10

    .line 146
    mul-double v8, v8, p0

    .line 147
    .line 148
    const-wide v10, -0x3f61c77477ff151eL    # -1934.136261

    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    add-double/2addr v8, v10

    .line 154
    mul-double v8, v8, p0

    .line 155
    .line 156
    const-wide v10, 0x405f42d96a6a0126L    # 125.04452

    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    add-double/2addr v8, v10

    .line 162
    invoke-static {v8, v9}, Ljava/lang/Math;->toRadians(D)D

    .line 163
    .line 164
    .line 165
    move-result-wide v8

    .line 166
    sget-object v10, Lej/e;->r:[[D

    .line 167
    .line 168
    array-length v10, v10

    .line 169
    const/4 v11, 0x1

    .line 170
    sub-int/2addr v10, v11

    .line 171
    const-wide/16 v12, 0x0

    .line 172
    .line 173
    move-wide v14, v12

    .line 174
    :goto_0
    const/16 v16, 0x0

    .line 175
    .line 176
    if-ltz v10, :cond_0

    .line 177
    .line 178
    sget-object v17, Lej/e;->r:[[D

    .line 179
    .line 180
    aget-object v17, v17, v10

    .line 181
    .line 182
    aget-wide v18, v17, v16

    .line 183
    .line 184
    mul-double v18, v18, v0

    .line 185
    .line 186
    aget-wide v20, v17, v11

    .line 187
    .line 188
    mul-double v20, v20, v2

    .line 189
    .line 190
    add-double v18, v18, v20

    .line 191
    .line 192
    const/16 v16, 0x2

    .line 193
    .line 194
    aget-wide v20, v17, v16

    .line 195
    .line 196
    mul-double v20, v20, v4

    .line 197
    .line 198
    add-double v18, v18, v20

    .line 199
    .line 200
    const/16 v16, 0x3

    .line 201
    .line 202
    aget-wide v20, v17, v16

    .line 203
    .line 204
    mul-double v20, v20, v6

    .line 205
    .line 206
    add-double v18, v18, v20

    .line 207
    .line 208
    const/16 v16, 0x4

    .line 209
    .line 210
    aget-wide v20, v17, v16

    .line 211
    .line 212
    mul-double v20, v20, v8

    .line 213
    .line 214
    add-double v18, v18, v20

    .line 215
    .line 216
    invoke-static/range {v18 .. v19}, Ljava/lang/Math;->sin(D)D

    .line 217
    .line 218
    .line 219
    move-result-wide v20

    .line 220
    const/16 v16, 0x5

    .line 221
    .line 222
    aget-wide v22, v17, v16

    .line 223
    .line 224
    const/16 v16, 0x6

    .line 225
    .line 226
    aget-wide v24, v17, v16

    .line 227
    .line 228
    mul-double v24, v24, p0

    .line 229
    .line 230
    add-double v22, v22, v24

    .line 231
    .line 232
    mul-double v20, v20, v22

    .line 233
    .line 234
    add-double v12, v12, v20

    .line 235
    .line 236
    invoke-static/range {v18 .. v19}, Ljava/lang/Math;->cos(D)D

    .line 237
    .line 238
    .line 239
    move-result-wide v18

    .line 240
    const/16 v16, 0x7

    .line 241
    .line 242
    aget-wide v20, v17, v16

    .line 243
    .line 244
    const/16 v16, 0x8

    .line 245
    .line 246
    aget-wide v16, v17, v16

    .line 247
    .line 248
    mul-double v16, v16, p0

    .line 249
    .line 250
    add-double v20, v20, v16

    .line 251
    .line 252
    mul-double v18, v18, v20

    .line 253
    .line 254
    add-double v14, v14, v18

    .line 255
    .line 256
    add-int/lit8 v10, v10, -0x1

    .line 257
    .line 258
    goto :goto_0

    .line 259
    :cond_0
    const-wide v0, 0x3f1a36e2eb1c432dL    # 1.0E-4

    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    mul-double/2addr v12, v0

    .line 265
    const-wide v2, 0x40ac200000000000L    # 3600.0

    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    div-double/2addr v12, v2

    .line 271
    aput-wide v12, p2, v16

    .line 272
    .line 273
    mul-double/2addr v14, v0

    .line 274
    div-double/2addr v14, v2

    .line 275
    aput-wide v14, p2, v11

    .line 276
    .line 277
    return-void
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

.method private static l(D)D
    .locals 2

    const-wide v0, 0x4142b42c80000000L    # 2451545.0

    sub-double/2addr p0, v0

    const-wide v0, 0x40e1d5a000000000L    # 36525.0

    div-double/2addr p0, v0

    return-wide p0
.end method

.method public static valueOf(Ljava/lang/String;)Lej/e;
    .locals 1

    const-class v0, Lej/e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lej/e;

    return-object p0
.end method

.method public static values()[Lej/e;
    .locals 1

    sget-object v0, Lej/e;->s:[Lej/e;

    invoke-virtual {v0}, [Lej/e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lej/e;

    return-object v0
.end method


# virtual methods
.method public f(D)D
    .locals 0

    new-instance p1, Ljava/lang/AbstractMethodError;

    invoke-direct {p1}, Ljava/lang/AbstractMethodError;-><init>()V

    throw p1
.end method

.method public h(DLjava/lang/String;)D
    .locals 1

    .line 1
    const-string v0, "declination"

    .line 2
    .line 3
    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, p1, p2}, Lej/e;->f(D)D

    .line 10
    .line 11
    .line 12
    move-result-wide p1

    .line 13
    return-wide p1

    .line 14
    :cond_0
    const-string v0, "right-ascension"

    .line 15
    .line 16
    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p3

    .line 20
    if-eqz p3, :cond_1

    .line 21
    .line 22
    invoke-virtual {p0, p1, p2}, Lej/e;->k(D)D

    .line 23
    .line 24
    .line 25
    move-result-wide p1

    .line 26
    return-wide p1

    .line 27
    :cond_1
    const-wide/high16 p1, 0x7ff8000000000000L    # Double.NaN

    .line 28
    .line 29
    return-wide p1
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

.method public k(D)D
    .locals 0

    new-instance p1, Ljava/lang/AbstractMethodError;

    invoke-direct {p1}, Ljava/lang/AbstractMethodError;-><init>()V

    throw p1
.end method
