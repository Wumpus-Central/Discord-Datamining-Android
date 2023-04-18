.class Landroidx/vectordrawable/graphics/drawable/h$g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/vectordrawable/graphics/drawable/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "g"
.end annotation


# static fields
.field private static final q:Landroid/graphics/Matrix;


# instance fields
.field private final a:Landroid/graphics/Path;

.field private final b:Landroid/graphics/Path;

.field private final c:Landroid/graphics/Matrix;

.field d:Landroid/graphics/Paint;

.field e:Landroid/graphics/Paint;

.field private f:Landroid/graphics/PathMeasure;

.field private g:I

.field final h:Landroidx/vectordrawable/graphics/drawable/h$d;

.field i:F

.field j:F

.field k:F

.field l:F

.field m:I

.field n:Ljava/lang/String;

.field o:Ljava/lang/Boolean;

.field final p:Landroidx/collection/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/a<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    sput-object v0, Landroidx/vectordrawable/graphics/drawable/h$g;->q:Landroid/graphics/Matrix;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Landroidx/vectordrawable/graphics/drawable/h$g;->c:Landroid/graphics/Matrix;

    const/4 v0, 0x0

    .line 3
    iput v0, p0, Landroidx/vectordrawable/graphics/drawable/h$g;->i:F

    .line 4
    iput v0, p0, Landroidx/vectordrawable/graphics/drawable/h$g;->j:F

    .line 5
    iput v0, p0, Landroidx/vectordrawable/graphics/drawable/h$g;->k:F

    .line 6
    iput v0, p0, Landroidx/vectordrawable/graphics/drawable/h$g;->l:F

    const/16 v0, 0xff

    .line 7
    iput v0, p0, Landroidx/vectordrawable/graphics/drawable/h$g;->m:I

    const/4 v0, 0x0

    .line 8
    iput-object v0, p0, Landroidx/vectordrawable/graphics/drawable/h$g;->n:Ljava/lang/String;

    .line 9
    iput-object v0, p0, Landroidx/vectordrawable/graphics/drawable/h$g;->o:Ljava/lang/Boolean;

    .line 10
    new-instance v0, Landroidx/collection/a;

    invoke-direct {v0}, Landroidx/collection/a;-><init>()V

    iput-object v0, p0, Landroidx/vectordrawable/graphics/drawable/h$g;->p:Landroidx/collection/a;

    .line 11
    new-instance v0, Landroidx/vectordrawable/graphics/drawable/h$d;

    invoke-direct {v0}, Landroidx/vectordrawable/graphics/drawable/h$d;-><init>()V

    iput-object v0, p0, Landroidx/vectordrawable/graphics/drawable/h$g;->h:Landroidx/vectordrawable/graphics/drawable/h$d;

    .line 12
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Landroidx/vectordrawable/graphics/drawable/h$g;->a:Landroid/graphics/Path;

    .line 13
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Landroidx/vectordrawable/graphics/drawable/h$g;->b:Landroid/graphics/Path;

    return-void
.end method

.method public constructor <init>(Landroidx/vectordrawable/graphics/drawable/h$g;)V
    .locals 3

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Landroidx/vectordrawable/graphics/drawable/h$g;->c:Landroid/graphics/Matrix;

    const/4 v0, 0x0

    .line 16
    iput v0, p0, Landroidx/vectordrawable/graphics/drawable/h$g;->i:F

    .line 17
    iput v0, p0, Landroidx/vectordrawable/graphics/drawable/h$g;->j:F

    .line 18
    iput v0, p0, Landroidx/vectordrawable/graphics/drawable/h$g;->k:F

    .line 19
    iput v0, p0, Landroidx/vectordrawable/graphics/drawable/h$g;->l:F

    const/16 v0, 0xff

    .line 20
    iput v0, p0, Landroidx/vectordrawable/graphics/drawable/h$g;->m:I

    const/4 v0, 0x0

    .line 21
    iput-object v0, p0, Landroidx/vectordrawable/graphics/drawable/h$g;->n:Ljava/lang/String;

    .line 22
    iput-object v0, p0, Landroidx/vectordrawable/graphics/drawable/h$g;->o:Ljava/lang/Boolean;

    .line 23
    new-instance v0, Landroidx/collection/a;

    invoke-direct {v0}, Landroidx/collection/a;-><init>()V

    iput-object v0, p0, Landroidx/vectordrawable/graphics/drawable/h$g;->p:Landroidx/collection/a;

    .line 24
    new-instance v1, Landroidx/vectordrawable/graphics/drawable/h$d;

    iget-object v2, p1, Landroidx/vectordrawable/graphics/drawable/h$g;->h:Landroidx/vectordrawable/graphics/drawable/h$d;

    invoke-direct {v1, v2, v0}, Landroidx/vectordrawable/graphics/drawable/h$d;-><init>(Landroidx/vectordrawable/graphics/drawable/h$d;Landroidx/collection/a;)V

    iput-object v1, p0, Landroidx/vectordrawable/graphics/drawable/h$g;->h:Landroidx/vectordrawable/graphics/drawable/h$d;

    .line 25
    new-instance v1, Landroid/graphics/Path;

    iget-object v2, p1, Landroidx/vectordrawable/graphics/drawable/h$g;->a:Landroid/graphics/Path;

    invoke-direct {v1, v2}, Landroid/graphics/Path;-><init>(Landroid/graphics/Path;)V

    iput-object v1, p0, Landroidx/vectordrawable/graphics/drawable/h$g;->a:Landroid/graphics/Path;

    .line 26
    new-instance v1, Landroid/graphics/Path;

    iget-object v2, p1, Landroidx/vectordrawable/graphics/drawable/h$g;->b:Landroid/graphics/Path;

    invoke-direct {v1, v2}, Landroid/graphics/Path;-><init>(Landroid/graphics/Path;)V

    iput-object v1, p0, Landroidx/vectordrawable/graphics/drawable/h$g;->b:Landroid/graphics/Path;

    .line 27
    iget v1, p1, Landroidx/vectordrawable/graphics/drawable/h$g;->i:F

    iput v1, p0, Landroidx/vectordrawable/graphics/drawable/h$g;->i:F

    .line 28
    iget v1, p1, Landroidx/vectordrawable/graphics/drawable/h$g;->j:F

    iput v1, p0, Landroidx/vectordrawable/graphics/drawable/h$g;->j:F

    .line 29
    iget v1, p1, Landroidx/vectordrawable/graphics/drawable/h$g;->k:F

    iput v1, p0, Landroidx/vectordrawable/graphics/drawable/h$g;->k:F

    .line 30
    iget v1, p1, Landroidx/vectordrawable/graphics/drawable/h$g;->l:F

    iput v1, p0, Landroidx/vectordrawable/graphics/drawable/h$g;->l:F

    .line 31
    iget v1, p1, Landroidx/vectordrawable/graphics/drawable/h$g;->g:I

    iput v1, p0, Landroidx/vectordrawable/graphics/drawable/h$g;->g:I

    .line 32
    iget v1, p1, Landroidx/vectordrawable/graphics/drawable/h$g;->m:I

    iput v1, p0, Landroidx/vectordrawable/graphics/drawable/h$g;->m:I

    .line 33
    iget-object v1, p1, Landroidx/vectordrawable/graphics/drawable/h$g;->n:Ljava/lang/String;

    iput-object v1, p0, Landroidx/vectordrawable/graphics/drawable/h$g;->n:Ljava/lang/String;

    .line 34
    iget-object v1, p1, Landroidx/vectordrawable/graphics/drawable/h$g;->n:Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 35
    invoke-virtual {v0, v1, p0}, Landroidx/collection/SimpleArrayMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    :cond_0
    iget-object p1, p1, Landroidx/vectordrawable/graphics/drawable/h$g;->o:Ljava/lang/Boolean;

    iput-object p1, p0, Landroidx/vectordrawable/graphics/drawable/h$g;->o:Ljava/lang/Boolean;

    return-void
.end method

.method private static a(FFFF)F
    .locals 0

    mul-float/2addr p0, p3

    mul-float/2addr p1, p2

    sub-float/2addr p0, p1

    return p0
.end method

.method private c(Landroidx/vectordrawable/graphics/drawable/h$d;Landroid/graphics/Matrix;Landroid/graphics/Canvas;IILandroid/graphics/ColorFilter;)V
    .locals 9

    .line 1
    iget-object v0, p1, Landroidx/vectordrawable/graphics/drawable/h$d;->a:Landroid/graphics/Matrix;

    .line 2
    .line 3
    invoke-virtual {v0, p2}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 4
    .line 5
    .line 6
    iget-object p2, p1, Landroidx/vectordrawable/graphics/drawable/h$d;->a:Landroid/graphics/Matrix;

    .line 7
    .line 8
    iget-object v0, p1, Landroidx/vectordrawable/graphics/drawable/h$d;->j:Landroid/graphics/Matrix;

    .line 9
    .line 10
    invoke-virtual {p2, v0}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    .line 11
    .line 12
    .line 13
    invoke-virtual {p3}, Landroid/graphics/Canvas;->save()I

    .line 14
    .line 15
    .line 16
    const/4 p2, 0x0

    .line 17
    :goto_0
    iget-object v0, p1, Landroidx/vectordrawable/graphics/drawable/h$d;->b:Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-ge p2, v0, :cond_2

    .line 24
    .line 25
    iget-object v0, p1, Landroidx/vectordrawable/graphics/drawable/h$d;->b:Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Landroidx/vectordrawable/graphics/drawable/h$e;

    .line 32
    .line 33
    instance-of v1, v0, Landroidx/vectordrawable/graphics/drawable/h$d;

    .line 34
    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    move-object v3, v0

    .line 38
    check-cast v3, Landroidx/vectordrawable/graphics/drawable/h$d;

    .line 39
    .line 40
    iget-object v4, p1, Landroidx/vectordrawable/graphics/drawable/h$d;->a:Landroid/graphics/Matrix;

    .line 41
    .line 42
    move-object v2, p0

    .line 43
    move-object v5, p3

    .line 44
    move v6, p4

    .line 45
    move v7, p5

    .line 46
    move-object v8, p6

    .line 47
    invoke-direct/range {v2 .. v8}, Landroidx/vectordrawable/graphics/drawable/h$g;->c(Landroidx/vectordrawable/graphics/drawable/h$d;Landroid/graphics/Matrix;Landroid/graphics/Canvas;IILandroid/graphics/ColorFilter;)V

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_0
    instance-of v1, v0, Landroidx/vectordrawable/graphics/drawable/h$f;

    .line 52
    .line 53
    if-eqz v1, :cond_1

    .line 54
    .line 55
    move-object v4, v0

    .line 56
    check-cast v4, Landroidx/vectordrawable/graphics/drawable/h$f;

    .line 57
    .line 58
    move-object v2, p0

    .line 59
    move-object v3, p1

    .line 60
    move-object v5, p3

    .line 61
    move v6, p4

    .line 62
    move v7, p5

    .line 63
    move-object v8, p6

    .line 64
    invoke-direct/range {v2 .. v8}, Landroidx/vectordrawable/graphics/drawable/h$g;->d(Landroidx/vectordrawable/graphics/drawable/h$d;Landroidx/vectordrawable/graphics/drawable/h$f;Landroid/graphics/Canvas;IILandroid/graphics/ColorFilter;)V

    .line 65
    .line 66
    .line 67
    :cond_1
    :goto_1
    add-int/lit8 p2, p2, 0x1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    invoke-virtual {p3}, Landroid/graphics/Canvas;->restore()V

    .line 71
    .line 72
    .line 73
    return-void
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
.end method

.method private d(Landroidx/vectordrawable/graphics/drawable/h$d;Landroidx/vectordrawable/graphics/drawable/h$f;Landroid/graphics/Canvas;IILandroid/graphics/ColorFilter;)V
    .locals 7

    .line 1
    int-to-float p4, p4

    .line 2
    iget v0, p0, Landroidx/vectordrawable/graphics/drawable/h$g;->k:F

    .line 3
    .line 4
    div-float/2addr p4, v0

    .line 5
    int-to-float p5, p5

    .line 6
    iget v0, p0, Landroidx/vectordrawable/graphics/drawable/h$g;->l:F

    .line 7
    .line 8
    div-float/2addr p5, v0

    .line 9
    invoke-static {p4, p5}, Ljava/lang/Math;->min(FF)F

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iget-object p1, p1, Landroidx/vectordrawable/graphics/drawable/h$d;->a:Landroid/graphics/Matrix;

    .line 14
    .line 15
    iget-object v1, p0, Landroidx/vectordrawable/graphics/drawable/h$g;->c:Landroid/graphics/Matrix;

    .line 16
    .line 17
    invoke-virtual {v1, p1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Landroidx/vectordrawable/graphics/drawable/h$g;->c:Landroid/graphics/Matrix;

    .line 21
    .line 22
    invoke-virtual {v1, p4, p5}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 23
    .line 24
    .line 25
    invoke-direct {p0, p1}, Landroidx/vectordrawable/graphics/drawable/h$g;->e(Landroid/graphics/Matrix;)F

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    const/4 p4, 0x0

    .line 30
    cmpl-float p5, p1, p4

    .line 31
    .line 32
    if-nez p5, :cond_0

    .line 33
    .line 34
    return-void

    .line 35
    :cond_0
    iget-object p5, p0, Landroidx/vectordrawable/graphics/drawable/h$g;->a:Landroid/graphics/Path;

    .line 36
    .line 37
    invoke-virtual {p2, p5}, Landroidx/vectordrawable/graphics/drawable/h$f;->d(Landroid/graphics/Path;)V

    .line 38
    .line 39
    .line 40
    iget-object p5, p0, Landroidx/vectordrawable/graphics/drawable/h$g;->a:Landroid/graphics/Path;

    .line 41
    .line 42
    iget-object v1, p0, Landroidx/vectordrawable/graphics/drawable/h$g;->b:Landroid/graphics/Path;

    .line 43
    .line 44
    invoke-virtual {v1}, Landroid/graphics/Path;->reset()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p2}, Landroidx/vectordrawable/graphics/drawable/h$f;->c()Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-eqz v1, :cond_2

    .line 52
    .line 53
    iget-object p1, p0, Landroidx/vectordrawable/graphics/drawable/h$g;->b:Landroid/graphics/Path;

    .line 54
    .line 55
    iget p2, p2, Landroidx/vectordrawable/graphics/drawable/h$f;->c:I

    .line 56
    .line 57
    if-nez p2, :cond_1

    .line 58
    .line 59
    sget-object p2, Landroid/graphics/Path$FillType;->WINDING:Landroid/graphics/Path$FillType;

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    sget-object p2, Landroid/graphics/Path$FillType;->EVEN_ODD:Landroid/graphics/Path$FillType;

    .line 63
    .line 64
    :goto_0
    invoke-virtual {p1, p2}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V

    .line 65
    .line 66
    .line 67
    iget-object p1, p0, Landroidx/vectordrawable/graphics/drawable/h$g;->b:Landroid/graphics/Path;

    .line 68
    .line 69
    iget-object p2, p0, Landroidx/vectordrawable/graphics/drawable/h$g;->c:Landroid/graphics/Matrix;

    .line 70
    .line 71
    invoke-virtual {p1, p5, p2}, Landroid/graphics/Path;->addPath(Landroid/graphics/Path;Landroid/graphics/Matrix;)V

    .line 72
    .line 73
    .line 74
    iget-object p1, p0, Landroidx/vectordrawable/graphics/drawable/h$g;->b:Landroid/graphics/Path;

    .line 75
    .line 76
    invoke-virtual {p3, p1}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    .line 77
    .line 78
    .line 79
    goto/16 :goto_5

    .line 80
    .line 81
    :cond_2
    check-cast p2, Landroidx/vectordrawable/graphics/drawable/h$c;

    .line 82
    .line 83
    iget v1, p2, Landroidx/vectordrawable/graphics/drawable/h$c;->k:F

    .line 84
    .line 85
    cmpl-float v2, v1, p4

    .line 86
    .line 87
    const/high16 v3, 0x3f800000    # 1.0f

    .line 88
    .line 89
    const/4 v4, 0x1

    .line 90
    if-nez v2, :cond_3

    .line 91
    .line 92
    iget v2, p2, Landroidx/vectordrawable/graphics/drawable/h$c;->l:F

    .line 93
    .line 94
    cmpl-float v2, v2, v3

    .line 95
    .line 96
    if-eqz v2, :cond_6

    .line 97
    .line 98
    :cond_3
    iget v2, p2, Landroidx/vectordrawable/graphics/drawable/h$c;->m:F

    .line 99
    .line 100
    add-float/2addr v1, v2

    .line 101
    rem-float/2addr v1, v3

    .line 102
    iget v5, p2, Landroidx/vectordrawable/graphics/drawable/h$c;->l:F

    .line 103
    .line 104
    add-float/2addr v5, v2

    .line 105
    rem-float/2addr v5, v3

    .line 106
    iget-object v2, p0, Landroidx/vectordrawable/graphics/drawable/h$g;->f:Landroid/graphics/PathMeasure;

    .line 107
    .line 108
    if-nez v2, :cond_4

    .line 109
    .line 110
    new-instance v2, Landroid/graphics/PathMeasure;

    .line 111
    .line 112
    invoke-direct {v2}, Landroid/graphics/PathMeasure;-><init>()V

    .line 113
    .line 114
    .line 115
    iput-object v2, p0, Landroidx/vectordrawable/graphics/drawable/h$g;->f:Landroid/graphics/PathMeasure;

    .line 116
    .line 117
    :cond_4
    iget-object v2, p0, Landroidx/vectordrawable/graphics/drawable/h$g;->f:Landroid/graphics/PathMeasure;

    .line 118
    .line 119
    iget-object v3, p0, Landroidx/vectordrawable/graphics/drawable/h$g;->a:Landroid/graphics/Path;

    .line 120
    .line 121
    const/4 v6, 0x0

    .line 122
    invoke-virtual {v2, v3, v6}, Landroid/graphics/PathMeasure;->setPath(Landroid/graphics/Path;Z)V

    .line 123
    .line 124
    .line 125
    iget-object v2, p0, Landroidx/vectordrawable/graphics/drawable/h$g;->f:Landroid/graphics/PathMeasure;

    .line 126
    .line 127
    invoke-virtual {v2}, Landroid/graphics/PathMeasure;->getLength()F

    .line 128
    .line 129
    .line 130
    move-result v2

    .line 131
    mul-float/2addr v1, v2

    .line 132
    mul-float/2addr v5, v2

    .line 133
    invoke-virtual {p5}, Landroid/graphics/Path;->reset()V

    .line 134
    .line 135
    .line 136
    cmpl-float v3, v1, v5

    .line 137
    .line 138
    if-lez v3, :cond_5

    .line 139
    .line 140
    iget-object v3, p0, Landroidx/vectordrawable/graphics/drawable/h$g;->f:Landroid/graphics/PathMeasure;

    .line 141
    .line 142
    invoke-virtual {v3, v1, v2, p5, v4}, Landroid/graphics/PathMeasure;->getSegment(FFLandroid/graphics/Path;Z)Z

    .line 143
    .line 144
    .line 145
    iget-object v1, p0, Landroidx/vectordrawable/graphics/drawable/h$g;->f:Landroid/graphics/PathMeasure;

    .line 146
    .line 147
    invoke-virtual {v1, p4, v5, p5, v4}, Landroid/graphics/PathMeasure;->getSegment(FFLandroid/graphics/Path;Z)Z

    .line 148
    .line 149
    .line 150
    goto :goto_1

    .line 151
    :cond_5
    iget-object v2, p0, Landroidx/vectordrawable/graphics/drawable/h$g;->f:Landroid/graphics/PathMeasure;

    .line 152
    .line 153
    invoke-virtual {v2, v1, v5, p5, v4}, Landroid/graphics/PathMeasure;->getSegment(FFLandroid/graphics/Path;Z)Z

    .line 154
    .line 155
    .line 156
    :goto_1
    invoke-virtual {p5, p4, p4}, Landroid/graphics/Path;->rLineTo(FF)V

    .line 157
    .line 158
    .line 159
    :cond_6
    iget-object p4, p0, Landroidx/vectordrawable/graphics/drawable/h$g;->b:Landroid/graphics/Path;

    .line 160
    .line 161
    iget-object v1, p0, Landroidx/vectordrawable/graphics/drawable/h$g;->c:Landroid/graphics/Matrix;

    .line 162
    .line 163
    invoke-virtual {p4, p5, v1}, Landroid/graphics/Path;->addPath(Landroid/graphics/Path;Landroid/graphics/Matrix;)V

    .line 164
    .line 165
    .line 166
    iget-object p4, p2, Landroidx/vectordrawable/graphics/drawable/h$c;->h:Landroidx/core/content/res/d;

    .line 167
    .line 168
    invoke-virtual {p4}, Landroidx/core/content/res/d;->l()Z

    .line 169
    .line 170
    .line 171
    move-result p4

    .line 172
    const/high16 p5, 0x437f0000    # 255.0f

    .line 173
    .line 174
    const/16 v1, 0xff

    .line 175
    .line 176
    const/4 v2, 0x0

    .line 177
    if-eqz p4, :cond_a

    .line 178
    .line 179
    iget-object p4, p2, Landroidx/vectordrawable/graphics/drawable/h$c;->h:Landroidx/core/content/res/d;

    .line 180
    .line 181
    iget-object v3, p0, Landroidx/vectordrawable/graphics/drawable/h$g;->e:Landroid/graphics/Paint;

    .line 182
    .line 183
    if-nez v3, :cond_7

    .line 184
    .line 185
    new-instance v3, Landroid/graphics/Paint;

    .line 186
    .line 187
    invoke-direct {v3, v4}, Landroid/graphics/Paint;-><init>(I)V

    .line 188
    .line 189
    .line 190
    iput-object v3, p0, Landroidx/vectordrawable/graphics/drawable/h$g;->e:Landroid/graphics/Paint;

    .line 191
    .line 192
    sget-object v5, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 193
    .line 194
    invoke-virtual {v3, v5}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 195
    .line 196
    .line 197
    :cond_7
    iget-object v3, p0, Landroidx/vectordrawable/graphics/drawable/h$g;->e:Landroid/graphics/Paint;

    .line 198
    .line 199
    invoke-virtual {p4}, Landroidx/core/content/res/d;->h()Z

    .line 200
    .line 201
    .line 202
    move-result v5

    .line 203
    if-eqz v5, :cond_8

    .line 204
    .line 205
    invoke-virtual {p4}, Landroidx/core/content/res/d;->f()Landroid/graphics/Shader;

    .line 206
    .line 207
    .line 208
    move-result-object p4

    .line 209
    iget-object v5, p0, Landroidx/vectordrawable/graphics/drawable/h$g;->c:Landroid/graphics/Matrix;

    .line 210
    .line 211
    invoke-virtual {p4, v5}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {v3, p4}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 215
    .line 216
    .line 217
    iget p4, p2, Landroidx/vectordrawable/graphics/drawable/h$c;->j:F

    .line 218
    .line 219
    mul-float/2addr p4, p5

    .line 220
    invoke-static {p4}, Ljava/lang/Math;->round(F)I

    .line 221
    .line 222
    .line 223
    move-result p4

    .line 224
    invoke-virtual {v3, p4}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 225
    .line 226
    .line 227
    goto :goto_2

    .line 228
    :cond_8
    invoke-virtual {v3, v2}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 229
    .line 230
    .line 231
    invoke-virtual {v3, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {p4}, Landroidx/core/content/res/d;->e()I

    .line 235
    .line 236
    .line 237
    move-result p4

    .line 238
    iget v5, p2, Landroidx/vectordrawable/graphics/drawable/h$c;->j:F

    .line 239
    .line 240
    invoke-static {p4, v5}, Landroidx/vectordrawable/graphics/drawable/h;->a(IF)I

    .line 241
    .line 242
    .line 243
    move-result p4

    .line 244
    invoke-virtual {v3, p4}, Landroid/graphics/Paint;->setColor(I)V

    .line 245
    .line 246
    .line 247
    :goto_2
    invoke-virtual {v3, p6}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 248
    .line 249
    .line 250
    iget-object p4, p0, Landroidx/vectordrawable/graphics/drawable/h$g;->b:Landroid/graphics/Path;

    .line 251
    .line 252
    iget v5, p2, Landroidx/vectordrawable/graphics/drawable/h$f;->c:I

    .line 253
    .line 254
    if-nez v5, :cond_9

    .line 255
    .line 256
    sget-object v5, Landroid/graphics/Path$FillType;->WINDING:Landroid/graphics/Path$FillType;

    .line 257
    .line 258
    goto :goto_3

    .line 259
    :cond_9
    sget-object v5, Landroid/graphics/Path$FillType;->EVEN_ODD:Landroid/graphics/Path$FillType;

    .line 260
    .line 261
    :goto_3
    invoke-virtual {p4, v5}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V

    .line 262
    .line 263
    .line 264
    iget-object p4, p0, Landroidx/vectordrawable/graphics/drawable/h$g;->b:Landroid/graphics/Path;

    .line 265
    .line 266
    invoke-virtual {p3, p4, v3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 267
    .line 268
    .line 269
    :cond_a
    iget-object p4, p2, Landroidx/vectordrawable/graphics/drawable/h$c;->f:Landroidx/core/content/res/d;

    .line 270
    .line 271
    invoke-virtual {p4}, Landroidx/core/content/res/d;->l()Z

    .line 272
    .line 273
    .line 274
    move-result p4

    .line 275
    if-eqz p4, :cond_f

    .line 276
    .line 277
    iget-object p4, p2, Landroidx/vectordrawable/graphics/drawable/h$c;->f:Landroidx/core/content/res/d;

    .line 278
    .line 279
    iget-object v3, p0, Landroidx/vectordrawable/graphics/drawable/h$g;->d:Landroid/graphics/Paint;

    .line 280
    .line 281
    if-nez v3, :cond_b

    .line 282
    .line 283
    new-instance v3, Landroid/graphics/Paint;

    .line 284
    .line 285
    invoke-direct {v3, v4}, Landroid/graphics/Paint;-><init>(I)V

    .line 286
    .line 287
    .line 288
    iput-object v3, p0, Landroidx/vectordrawable/graphics/drawable/h$g;->d:Landroid/graphics/Paint;

    .line 289
    .line 290
    sget-object v4, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 291
    .line 292
    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 293
    .line 294
    .line 295
    :cond_b
    iget-object v3, p0, Landroidx/vectordrawable/graphics/drawable/h$g;->d:Landroid/graphics/Paint;

    .line 296
    .line 297
    iget-object v4, p2, Landroidx/vectordrawable/graphics/drawable/h$c;->o:Landroid/graphics/Paint$Join;

    .line 298
    .line 299
    if-eqz v4, :cond_c

    .line 300
    .line 301
    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 302
    .line 303
    .line 304
    :cond_c
    iget-object v4, p2, Landroidx/vectordrawable/graphics/drawable/h$c;->n:Landroid/graphics/Paint$Cap;

    .line 305
    .line 306
    if-eqz v4, :cond_d

    .line 307
    .line 308
    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 309
    .line 310
    .line 311
    :cond_d
    iget v4, p2, Landroidx/vectordrawable/graphics/drawable/h$c;->p:F

    .line 312
    .line 313
    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setStrokeMiter(F)V

    .line 314
    .line 315
    .line 316
    invoke-virtual {p4}, Landroidx/core/content/res/d;->h()Z

    .line 317
    .line 318
    .line 319
    move-result v4

    .line 320
    if-eqz v4, :cond_e

    .line 321
    .line 322
    invoke-virtual {p4}, Landroidx/core/content/res/d;->f()Landroid/graphics/Shader;

    .line 323
    .line 324
    .line 325
    move-result-object p4

    .line 326
    iget-object v1, p0, Landroidx/vectordrawable/graphics/drawable/h$g;->c:Landroid/graphics/Matrix;

    .line 327
    .line 328
    invoke-virtual {p4, v1}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    .line 329
    .line 330
    .line 331
    invoke-virtual {v3, p4}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 332
    .line 333
    .line 334
    iget p4, p2, Landroidx/vectordrawable/graphics/drawable/h$c;->i:F

    .line 335
    .line 336
    mul-float/2addr p4, p5

    .line 337
    invoke-static {p4}, Ljava/lang/Math;->round(F)I

    .line 338
    .line 339
    .line 340
    move-result p4

    .line 341
    invoke-virtual {v3, p4}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 342
    .line 343
    .line 344
    goto :goto_4

    .line 345
    :cond_e
    invoke-virtual {v3, v2}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 346
    .line 347
    .line 348
    invoke-virtual {v3, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 349
    .line 350
    .line 351
    invoke-virtual {p4}, Landroidx/core/content/res/d;->e()I

    .line 352
    .line 353
    .line 354
    move-result p4

    .line 355
    iget p5, p2, Landroidx/vectordrawable/graphics/drawable/h$c;->i:F

    .line 356
    .line 357
    invoke-static {p4, p5}, Landroidx/vectordrawable/graphics/drawable/h;->a(IF)I

    .line 358
    .line 359
    .line 360
    move-result p4

    .line 361
    invoke-virtual {v3, p4}, Landroid/graphics/Paint;->setColor(I)V

    .line 362
    .line 363
    .line 364
    :goto_4
    invoke-virtual {v3, p6}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 365
    .line 366
    .line 367
    mul-float/2addr v0, p1

    .line 368
    iget p1, p2, Landroidx/vectordrawable/graphics/drawable/h$c;->g:F

    .line 369
    .line 370
    mul-float/2addr p1, v0

    .line 371
    invoke-virtual {v3, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 372
    .line 373
    .line 374
    iget-object p1, p0, Landroidx/vectordrawable/graphics/drawable/h$g;->b:Landroid/graphics/Path;

    .line 375
    .line 376
    invoke-virtual {p3, p1, v3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 377
    .line 378
    .line 379
    :cond_f
    :goto_5
    return-void
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
.end method

.method private e(Landroid/graphics/Matrix;)F
    .locals 9

    .line 1
    const/4 v0, 0x4

    .line 2
    new-array v0, v0, [F

    .line 3
    .line 4
    fill-array-data v0, :array_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->mapVectors([F)V

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    aget v1, v0, p1

    .line 12
    .line 13
    float-to-double v1, v1

    .line 14
    const/4 v3, 0x1

    .line 15
    aget v4, v0, v3

    .line 16
    .line 17
    float-to-double v4, v4

    .line 18
    invoke-static {v1, v2, v4, v5}, Ljava/lang/Math;->hypot(DD)D

    .line 19
    .line 20
    .line 21
    move-result-wide v1

    .line 22
    double-to-float v1, v1

    .line 23
    const/4 v2, 0x2

    .line 24
    aget v4, v0, v2

    .line 25
    .line 26
    float-to-double v4, v4

    .line 27
    const/4 v6, 0x3

    .line 28
    aget v7, v0, v6

    .line 29
    .line 30
    float-to-double v7, v7

    .line 31
    invoke-static {v4, v5, v7, v8}, Ljava/lang/Math;->hypot(DD)D

    .line 32
    .line 33
    .line 34
    move-result-wide v4

    .line 35
    double-to-float v4, v4

    .line 36
    aget p1, v0, p1

    .line 37
    .line 38
    aget v3, v0, v3

    .line 39
    .line 40
    aget v2, v0, v2

    .line 41
    .line 42
    aget v0, v0, v6

    .line 43
    .line 44
    invoke-static {p1, v3, v2, v0}, Landroidx/vectordrawable/graphics/drawable/h$g;->a(FFFF)F

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    invoke-static {v1, v4}, Ljava/lang/Math;->max(FF)F

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    const/4 v1, 0x0

    .line 53
    cmpl-float v2, v0, v1

    .line 54
    .line 55
    if-lez v2, :cond_0

    .line 56
    .line 57
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    div-float v1, p1, v0

    .line 62
    .line 63
    :cond_0
    return v1

    .line 64
    nop

    .line 65
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x0
    .end array-data
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
.end method


# virtual methods
.method public b(Landroid/graphics/Canvas;IILandroid/graphics/ColorFilter;)V
    .locals 7

    iget-object v1, p0, Landroidx/vectordrawable/graphics/drawable/h$g;->h:Landroidx/vectordrawable/graphics/drawable/h$d;

    sget-object v2, Landroidx/vectordrawable/graphics/drawable/h$g;->q:Landroid/graphics/Matrix;

    move-object v0, p0

    move-object v3, p1

    move v4, p2

    move v5, p3

    move-object v6, p4

    invoke-direct/range {v0 .. v6}, Landroidx/vectordrawable/graphics/drawable/h$g;->c(Landroidx/vectordrawable/graphics/drawable/h$d;Landroid/graphics/Matrix;Landroid/graphics/Canvas;IILandroid/graphics/ColorFilter;)V

    return-void
.end method

.method public f()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/vectordrawable/graphics/drawable/h$g;->o:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/vectordrawable/graphics/drawable/h$g;->h:Landroidx/vectordrawable/graphics/drawable/h$d;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroidx/vectordrawable/graphics/drawable/h$d;->a()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Landroidx/vectordrawable/graphics/drawable/h$g;->o:Ljava/lang/Boolean;

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Landroidx/vectordrawable/graphics/drawable/h$g;->o:Ljava/lang/Boolean;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    return v0
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
.end method

.method public g([I)Z
    .locals 1

    iget-object v0, p0, Landroidx/vectordrawable/graphics/drawable/h$g;->h:Landroidx/vectordrawable/graphics/drawable/h$d;

    invoke-virtual {v0, p1}, Landroidx/vectordrawable/graphics/drawable/h$d;->b([I)Z

    move-result p1

    return p1
.end method

.method public getAlpha()F
    .locals 2

    invoke-virtual {p0}, Landroidx/vectordrawable/graphics/drawable/h$g;->getRootAlpha()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x437f0000    # 255.0f

    div-float/2addr v0, v1

    return v0
.end method

.method public getRootAlpha()I
    .locals 1

    iget v0, p0, Landroidx/vectordrawable/graphics/drawable/h$g;->m:I

    return v0
.end method

.method public setAlpha(F)V
    .locals 1

    const/high16 v0, 0x437f0000    # 255.0f

    mul-float/2addr p1, v0

    float-to-int p1, p1

    invoke-virtual {p0, p1}, Landroidx/vectordrawable/graphics/drawable/h$g;->setRootAlpha(I)V

    return-void
.end method

.method public setRootAlpha(I)V
    .locals 0

    iput p1, p0, Landroidx/vectordrawable/graphics/drawable/h$g;->m:I

    return-void
.end method
