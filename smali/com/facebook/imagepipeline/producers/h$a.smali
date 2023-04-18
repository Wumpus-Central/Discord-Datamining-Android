.class Lcom/facebook/imagepipeline/producers/h$a;
.super Lcom/facebook/imagepipeline/producers/o;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/imagepipeline/producers/h;->g(Lcom/facebook/imagepipeline/producers/Consumer;Lcom/facebook/cache/common/CacheKey;Z)Lcom/facebook/imagepipeline/producers/Consumer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/imagepipeline/producers/o<",
        "Lcom/facebook/common/references/CloseableReference<",
        "Lu5/c;",
        ">;",
        "Lcom/facebook/common/references/CloseableReference<",
        "Lu5/c;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic c:Lcom/facebook/cache/common/CacheKey;

.field final synthetic d:Z

.field final synthetic e:Lcom/facebook/imagepipeline/producers/h;


# direct methods
.method constructor <init>(Lcom/facebook/imagepipeline/producers/h;Lcom/facebook/imagepipeline/producers/Consumer;Lcom/facebook/cache/common/CacheKey;Z)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/h$a;->e:Lcom/facebook/imagepipeline/producers/h;

    iput-object p3, p0, Lcom/facebook/imagepipeline/producers/h$a;->c:Lcom/facebook/cache/common/CacheKey;

    iput-boolean p4, p0, Lcom/facebook/imagepipeline/producers/h$a;->d:Z

    invoke-direct {p0, p2}, Lcom/facebook/imagepipeline/producers/o;-><init>(Lcom/facebook/imagepipeline/producers/Consumer;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic h(Ljava/lang/Object;I)V
    .locals 0

    check-cast p1, Lcom/facebook/common/references/CloseableReference;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/imagepipeline/producers/h$a;->p(Lcom/facebook/common/references/CloseableReference;I)V

    return-void
.end method

.method public p(Lcom/facebook/common/references/CloseableReference;I)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/common/references/CloseableReference<",
            "Lu5/c;",
            ">;I)V"
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-static {}, Lz5/b;->d()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string v0, "BitmapMemoryCacheProducer#onNewResultImpl"

    .line 8
    .line 9
    invoke-static {v0}, Lz5/b;->a(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-static {p2}, Lcom/facebook/imagepipeline/producers/b;->d(I)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v1, 0x0

    .line 17
    if-nez p1, :cond_3

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/o;->o()Lcom/facebook/imagepipeline/producers/Consumer;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-interface {p1, v1, p2}, Lcom/facebook/imagepipeline/producers/Consumer;->c(Ljava/lang/Object;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 26
    .line 27
    .line 28
    :cond_1
    invoke-static {}, Lz5/b;->d()Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-eqz p1, :cond_2

    .line 33
    .line 34
    invoke-static {}, Lz5/b;->b()V

    .line 35
    .line 36
    .line 37
    :cond_2
    return-void

    .line 38
    :cond_3
    :try_start_1
    invoke-virtual {p1}, Lcom/facebook/common/references/CloseableReference;->F()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    check-cast v2, Lu5/c;

    .line 43
    .line 44
    invoke-virtual {v2}, Lu5/c;->i()Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-nez v2, :cond_d

    .line 49
    .line 50
    const/16 v2, 0x8

    .line 51
    .line 52
    invoke-static {p2, v2}, Lcom/facebook/imagepipeline/producers/b;->m(II)Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-eqz v2, :cond_4

    .line 57
    .line 58
    goto/16 :goto_2

    .line 59
    .line 60
    :cond_4
    if-nez v0, :cond_8

    .line 61
    .line 62
    iget-object v2, p0, Lcom/facebook/imagepipeline/producers/h$a;->e:Lcom/facebook/imagepipeline/producers/h;

    .line 63
    .line 64
    invoke-static {v2}, Lcom/facebook/imagepipeline/producers/h;->c(Lcom/facebook/imagepipeline/producers/h;)Lo5/s;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    iget-object v3, p0, Lcom/facebook/imagepipeline/producers/h$a;->c:Lcom/facebook/cache/common/CacheKey;

    .line 69
    .line 70
    invoke-interface {v2, v3}, Lo5/s;->get(Ljava/lang/Object;)Lcom/facebook/common/references/CloseableReference;

    .line 71
    .line 72
    .line 73
    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 74
    if-eqz v2, :cond_8

    .line 75
    .line 76
    :try_start_2
    invoke-virtual {p1}, Lcom/facebook/common/references/CloseableReference;->F()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    check-cast v3, Lu5/c;

    .line 81
    .line 82
    invoke-virtual {v3}, Lu5/c;->b()Lu5/i;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    invoke-virtual {v2}, Lcom/facebook/common/references/CloseableReference;->F()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    check-cast v4, Lu5/c;

    .line 91
    .line 92
    invoke-virtual {v4}, Lu5/c;->b()Lu5/i;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    invoke-interface {v4}, Lu5/i;->a()Z

    .line 97
    .line 98
    .line 99
    move-result v5

    .line 100
    if-nez v5, :cond_6

    .line 101
    .line 102
    invoke-interface {v4}, Lu5/i;->c()I

    .line 103
    .line 104
    .line 105
    move-result v4

    .line 106
    invoke-interface {v3}, Lu5/i;->c()I

    .line 107
    .line 108
    .line 109
    move-result v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 110
    if-lt v4, v3, :cond_5

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_5
    :try_start_3
    invoke-static {v2}, Lcom/facebook/common/references/CloseableReference;->x(Lcom/facebook/common/references/CloseableReference;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 114
    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_6
    :goto_0
    :try_start_4
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/o;->o()Lcom/facebook/imagepipeline/producers/Consumer;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    invoke-interface {p1, v2, p2}, Lcom/facebook/imagepipeline/producers/Consumer;->c(Ljava/lang/Object;I)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 122
    .line 123
    .line 124
    :try_start_5
    invoke-static {v2}, Lcom/facebook/common/references/CloseableReference;->x(Lcom/facebook/common/references/CloseableReference;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 125
    .line 126
    .line 127
    invoke-static {}, Lz5/b;->d()Z

    .line 128
    .line 129
    .line 130
    move-result p1

    .line 131
    if-eqz p1, :cond_7

    .line 132
    .line 133
    invoke-static {}, Lz5/b;->b()V

    .line 134
    .line 135
    .line 136
    :cond_7
    return-void

    .line 137
    :catchall_0
    move-exception p1

    .line 138
    :try_start_6
    invoke-static {v2}, Lcom/facebook/common/references/CloseableReference;->x(Lcom/facebook/common/references/CloseableReference;)V

    .line 139
    .line 140
    .line 141
    throw p1

    .line 142
    :cond_8
    :goto_1
    iget-boolean v2, p0, Lcom/facebook/imagepipeline/producers/h$a;->d:Z

    .line 143
    .line 144
    if-eqz v2, :cond_9

    .line 145
    .line 146
    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/h$a;->e:Lcom/facebook/imagepipeline/producers/h;

    .line 147
    .line 148
    invoke-static {v1}, Lcom/facebook/imagepipeline/producers/h;->c(Lcom/facebook/imagepipeline/producers/h;)Lo5/s;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    iget-object v2, p0, Lcom/facebook/imagepipeline/producers/h$a;->c:Lcom/facebook/cache/common/CacheKey;

    .line 153
    .line 154
    invoke-interface {v1, v2, p1}, Lo5/s;->d(Ljava/lang/Object;Lcom/facebook/common/references/CloseableReference;)Lcom/facebook/common/references/CloseableReference;

    .line 155
    .line 156
    .line 157
    move-result-object v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 158
    :cond_9
    if-eqz v0, :cond_a

    .line 159
    .line 160
    :try_start_7
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/o;->o()Lcom/facebook/imagepipeline/producers/Consumer;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    const/high16 v2, 0x3f800000    # 1.0f

    .line 165
    .line 166
    invoke-interface {v0, v2}, Lcom/facebook/imagepipeline/producers/Consumer;->b(F)V

    .line 167
    .line 168
    .line 169
    :cond_a
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/o;->o()Lcom/facebook/imagepipeline/producers/Consumer;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    if-eqz v1, :cond_b

    .line 174
    .line 175
    move-object p1, v1

    .line 176
    :cond_b
    invoke-interface {v0, p1, p2}, Lcom/facebook/imagepipeline/producers/Consumer;->c(Ljava/lang/Object;I)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 177
    .line 178
    .line 179
    :try_start_8
    invoke-static {v1}, Lcom/facebook/common/references/CloseableReference;->x(Lcom/facebook/common/references/CloseableReference;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 180
    .line 181
    .line 182
    invoke-static {}, Lz5/b;->d()Z

    .line 183
    .line 184
    .line 185
    move-result p1

    .line 186
    if-eqz p1, :cond_c

    .line 187
    .line 188
    invoke-static {}, Lz5/b;->b()V

    .line 189
    .line 190
    .line 191
    :cond_c
    return-void

    .line 192
    :catchall_1
    move-exception p1

    .line 193
    :try_start_9
    invoke-static {v1}, Lcom/facebook/common/references/CloseableReference;->x(Lcom/facebook/common/references/CloseableReference;)V

    .line 194
    .line 195
    .line 196
    throw p1

    .line 197
    :cond_d
    :goto_2
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/o;->o()Lcom/facebook/imagepipeline/producers/Consumer;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    invoke-interface {v0, p1, p2}, Lcom/facebook/imagepipeline/producers/Consumer;->c(Ljava/lang/Object;I)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 202
    .line 203
    .line 204
    invoke-static {}, Lz5/b;->d()Z

    .line 205
    .line 206
    .line 207
    move-result p1

    .line 208
    if-eqz p1, :cond_e

    .line 209
    .line 210
    invoke-static {}, Lz5/b;->b()V

    .line 211
    .line 212
    .line 213
    :cond_e
    return-void

    .line 214
    :catchall_2
    move-exception p1

    .line 215
    invoke-static {}, Lz5/b;->d()Z

    .line 216
    .line 217
    .line 218
    move-result p2

    .line 219
    if-eqz p2, :cond_f

    .line 220
    .line 221
    invoke-static {}, Lz5/b;->b()V

    .line 222
    .line 223
    .line 224
    :cond_f
    throw p1
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
.end method
