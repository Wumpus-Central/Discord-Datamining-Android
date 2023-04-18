.class public final Lio/sentry/o2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/j0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/sentry/o2$b;
    }
.end annotation


# instance fields
.field private a:Z

.field private final b:Lio/sentry/o3;

.field private final c:Lio/sentry/transport/p;

.field private final d:Ljava/security/SecureRandom;

.field private final e:Lio/sentry/o2$b;


# direct methods
.method constructor <init>(Lio/sentry/o3;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lio/sentry/o2$b;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1}, Lio/sentry/o2$b;-><init>(Lio/sentry/o2$a;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lio/sentry/o2;->e:Lio/sentry/o2$b;

    .line 11
    .line 12
    const-string v0, "SentryOptions is required."

    .line 13
    .line 14
    invoke-static {p1, v0}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Lio/sentry/o3;

    .line 19
    .line 20
    iput-object v0, p0, Lio/sentry/o2;->b:Lio/sentry/o3;

    .line 21
    .line 22
    const/4 v0, 0x1

    .line 23
    iput-boolean v0, p0, Lio/sentry/o2;->a:Z

    .line 24
    .line 25
    invoke-virtual {p1}, Lio/sentry/o3;->getTransportFactory()Lio/sentry/o0;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    instance-of v2, v0, Lio/sentry/q1;

    .line 30
    .line 31
    if-eqz v2, :cond_0

    .line 32
    .line 33
    new-instance v0, Lio/sentry/a;

    .line 34
    .line 35
    invoke-direct {v0}, Lio/sentry/a;-><init>()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1, v0}, Lio/sentry/o3;->setTransportFactory(Lio/sentry/o0;)V

    .line 39
    .line 40
    .line 41
    :cond_0
    new-instance v2, Lio/sentry/z1;

    .line 42
    .line 43
    invoke-direct {v2, p1}, Lio/sentry/z1;-><init>(Lio/sentry/o3;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2}, Lio/sentry/z1;->a()Lio/sentry/y1;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-interface {v0, p1, v2}, Lio/sentry/o0;->a(Lio/sentry/o3;Lio/sentry/y1;)Lio/sentry/transport/p;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iput-object v0, p0, Lio/sentry/o2;->c:Lio/sentry/transport/p;

    .line 55
    .line 56
    invoke-virtual {p1}, Lio/sentry/o3;->getSampleRate()Ljava/lang/Double;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    if-nez p1, :cond_1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    new-instance v1, Ljava/security/SecureRandom;

    .line 64
    .line 65
    invoke-direct {v1}, Ljava/security/SecureRandom;-><init>()V

    .line 66
    .line 67
    .line 68
    :goto_0
    iput-object v1, p0, Lio/sentry/o2;->d:Ljava/security/SecureRandom;

    .line 69
    .line 70
    return-void
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
.end method

.method public static synthetic h(Lio/sentry/y3;)V
    .locals 0

    invoke-static {p0}, Lio/sentry/o2;->r(Lio/sentry/y3;)V

    return-void
.end method

.method public static synthetic i(Lio/sentry/o2;Lio/sentry/j3;Lio/sentry/v;Lio/sentry/y3;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lio/sentry/o2;->s(Lio/sentry/j3;Lio/sentry/v;Lio/sentry/y3;)V

    return-void
.end method

.method private j(Lio/sentry/Scope;Lio/sentry/v;)V
    .locals 0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lio/sentry/Scope;->g()Ljava/util/List;

    move-result-object p1

    invoke-virtual {p2, p1}, Lio/sentry/v;->a(Ljava/util/List;)V

    :cond_0
    return-void
.end method

.method private k(Lio/sentry/l2;Lio/sentry/Scope;)Lio/sentry/l2;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lio/sentry/l2;",
            ">(TT;",
            "Lio/sentry/Scope;",
            ")TT;"
        }
    .end annotation

    .line 1
    if-eqz p2, :cond_a

    .line 2
    .line 3
    invoke-virtual {p1}, Lio/sentry/l2;->I()Lio/sentry/protocol/k;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p2}, Lio/sentry/Scope;->n()Lio/sentry/protocol/k;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p1, v0}, Lio/sentry/l2;->W(Lio/sentry/protocol/k;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-virtual {p1}, Lio/sentry/l2;->O()Lio/sentry/protocol/z;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    invoke-virtual {p2}, Lio/sentry/Scope;->s()Lio/sentry/protocol/z;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {p1, v0}, Lio/sentry/l2;->b0(Lio/sentry/protocol/z;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    invoke-virtual {p1}, Lio/sentry/l2;->L()Ljava/util/Map;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    if-nez v0, :cond_2

    .line 34
    .line 35
    new-instance v0, Ljava/util/HashMap;

    .line 36
    .line 37
    invoke-virtual {p2}, Lio/sentry/Scope;->p()Ljava/util/Map;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, v0}, Lio/sentry/l2;->a0(Ljava/util/Map;)V

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_2
    invoke-virtual {p2}, Lio/sentry/Scope;->p()Ljava/util/Map;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    :cond_3
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-eqz v1, :cond_4

    .line 65
    .line 66
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    check-cast v1, Ljava/util/Map$Entry;

    .line 71
    .line 72
    invoke-virtual {p1}, Lio/sentry/l2;->L()Ljava/util/Map;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    invoke-interface {v2, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    if-nez v2, :cond_3

    .line 85
    .line 86
    invoke-virtual {p1}, Lio/sentry/l2;->L()Ljava/util/Map;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    check-cast v3, Ljava/lang/String;

    .line 95
    .line 96
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    check-cast v1, Ljava/lang/String;

    .line 101
    .line 102
    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_4
    :goto_1
    invoke-virtual {p1}, Lio/sentry/l2;->A()Ljava/util/List;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    if-nez v0, :cond_5

    .line 111
    .line 112
    new-instance v0, Ljava/util/ArrayList;

    .line 113
    .line 114
    invoke-virtual {p2}, Lio/sentry/Scope;->h()Ljava/util/Queue;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p1, v0}, Lio/sentry/l2;->P(Ljava/util/List;)V

    .line 122
    .line 123
    .line 124
    goto :goto_2

    .line 125
    :cond_5
    invoke-virtual {p2}, Lio/sentry/Scope;->h()Ljava/util/Queue;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-direct {p0, p1, v0}, Lio/sentry/o2;->y(Lio/sentry/l2;Ljava/util/Collection;)V

    .line 130
    .line 131
    .line 132
    :goto_2
    invoke-virtual {p1}, Lio/sentry/l2;->F()Ljava/util/Map;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    if-nez v0, :cond_6

    .line 137
    .line 138
    new-instance v0, Ljava/util/HashMap;

    .line 139
    .line 140
    invoke-virtual {p2}, Lio/sentry/Scope;->k()Ljava/util/Map;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {p1, v0}, Lio/sentry/l2;->T(Ljava/util/Map;)V

    .line 148
    .line 149
    .line 150
    goto :goto_4

    .line 151
    :cond_6
    invoke-virtual {p2}, Lio/sentry/Scope;->k()Ljava/util/Map;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    :cond_7
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 164
    .line 165
    .line 166
    move-result v1

    .line 167
    if-eqz v1, :cond_8

    .line 168
    .line 169
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    check-cast v1, Ljava/util/Map$Entry;

    .line 174
    .line 175
    invoke-virtual {p1}, Lio/sentry/l2;->F()Ljava/util/Map;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v3

    .line 183
    invoke-interface {v2, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    move-result v2

    .line 187
    if-nez v2, :cond_7

    .line 188
    .line 189
    invoke-virtual {p1}, Lio/sentry/l2;->F()Ljava/util/Map;

    .line 190
    .line 191
    .line 192
    move-result-object v2

    .line 193
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v3

    .line 197
    check-cast v3, Ljava/lang/String;

    .line 198
    .line 199
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    goto :goto_3

    .line 207
    :cond_8
    :goto_4
    invoke-virtual {p1}, Lio/sentry/l2;->B()Lio/sentry/protocol/c;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    new-instance v1, Lio/sentry/protocol/c;

    .line 212
    .line 213
    invoke-virtual {p2}, Lio/sentry/Scope;->i()Lio/sentry/protocol/c;

    .line 214
    .line 215
    .line 216
    move-result-object p2

    .line 217
    invoke-direct {v1, p2}, Lio/sentry/protocol/c;-><init>(Lio/sentry/protocol/c;)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v1}, Ljava/util/AbstractMap;->entrySet()Ljava/util/Set;

    .line 221
    .line 222
    .line 223
    move-result-object p2

    .line 224
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 225
    .line 226
    .line 227
    move-result-object p2

    .line 228
    :cond_9
    :goto_5
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 229
    .line 230
    .line 231
    move-result v1

    .line 232
    if-eqz v1, :cond_a

    .line 233
    .line 234
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v1

    .line 238
    check-cast v1, Ljava/util/Map$Entry;

    .line 239
    .line 240
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v2

    .line 244
    invoke-virtual {v0, v2}, Ljava/util/AbstractMap;->containsKey(Ljava/lang/Object;)Z

    .line 245
    .line 246
    .line 247
    move-result v2

    .line 248
    if-nez v2, :cond_9

    .line 249
    .line 250
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v2

    .line 254
    check-cast v2, Ljava/lang/String;

    .line 255
    .line 256
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v1

    .line 260
    invoke-virtual {v0, v2, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    goto :goto_5

    .line 264
    :cond_a
    return-object p1
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

.method private l(Lio/sentry/j3;Lio/sentry/Scope;Lio/sentry/v;)Lio/sentry/j3;
    .locals 2

    .line 1
    if-eqz p2, :cond_4

    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Lio/sentry/o2;->k(Lio/sentry/l2;Lio/sentry/Scope;)Lio/sentry/l2;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lio/sentry/j3;->r0()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p2}, Lio/sentry/Scope;->r()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {p1, v0}, Lio/sentry/j3;->B0(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-virtual {p1}, Lio/sentry/j3;->o0()Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    invoke-virtual {p2}, Lio/sentry/Scope;->l()Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {p1, v0}, Lio/sentry/j3;->w0(Ljava/util/List;)V

    .line 30
    .line 31
    .line 32
    :cond_1
    invoke-virtual {p2}, Lio/sentry/Scope;->m()Lio/sentry/n3;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    invoke-virtual {p2}, Lio/sentry/Scope;->m()Lio/sentry/n3;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {p1, v0}, Lio/sentry/j3;->x0(Lio/sentry/n3;)V

    .line 43
    .line 44
    .line 45
    :cond_2
    invoke-virtual {p2}, Lio/sentry/Scope;->o()Lio/sentry/ISpan;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {p1}, Lio/sentry/l2;->B()Lio/sentry/protocol/c;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-virtual {v1}, Lio/sentry/protocol/c;->f()Lio/sentry/c4;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    if-nez v1, :cond_3

    .line 58
    .line 59
    if-eqz v0, :cond_3

    .line 60
    .line 61
    invoke-virtual {p1}, Lio/sentry/l2;->B()Lio/sentry/protocol/c;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-interface {v0}, Lio/sentry/ISpan;->l()Lio/sentry/c4;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-virtual {v1, v0}, Lio/sentry/protocol/c;->n(Lio/sentry/c4;)V

    .line 70
    .line 71
    .line 72
    :cond_3
    invoke-virtual {p2}, Lio/sentry/Scope;->j()Ljava/util/List;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    invoke-direct {p0, p1, p3, p2}, Lio/sentry/o2;->t(Lio/sentry/j3;Lio/sentry/v;Ljava/util/List;)Lio/sentry/j3;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    :cond_4
    return-object p1
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

.method private m(Lio/sentry/l2;Ljava/util/List;Lio/sentry/y3;Lio/sentry/k4;Lio/sentry/w1;)Lio/sentry/q2;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/sentry/l2;",
            "Ljava/util/List<",
            "Lio/sentry/b;",
            ">;",
            "Lio/sentry/y3;",
            "Lio/sentry/k4;",
            "Lio/sentry/w1;",
            ")",
            "Lio/sentry/q2;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object v2, p0, Lio/sentry/o2;->b:Lio/sentry/o3;

    .line 10
    .line 11
    invoke-virtual {v2}, Lio/sentry/o3;->getSerializer()Lio/sentry/l0;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-static {v2, p1}, Lio/sentry/h3;->r(Lio/sentry/l0;Lio/sentry/l2;)Lio/sentry/h3;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Lio/sentry/l2;->E()Lio/sentry/protocol/p;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move-object p1, v1

    .line 28
    :goto_0
    if-eqz p3, :cond_1

    .line 29
    .line 30
    iget-object v2, p0, Lio/sentry/o2;->b:Lio/sentry/o3;

    .line 31
    .line 32
    invoke-virtual {v2}, Lio/sentry/o3;->getSerializer()Lio/sentry/l0;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-static {v2, p3}, Lio/sentry/h3;->t(Lio/sentry/l0;Lio/sentry/y3;)Lio/sentry/h3;

    .line 37
    .line 38
    .line 39
    move-result-object p3

    .line 40
    invoke-interface {v0, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    :cond_1
    if-eqz p5, :cond_2

    .line 44
    .line 45
    iget-object p3, p0, Lio/sentry/o2;->b:Lio/sentry/o3;

    .line 46
    .line 47
    invoke-virtual {p3}, Lio/sentry/o3;->getMaxTraceFileSize()J

    .line 48
    .line 49
    .line 50
    move-result-wide v2

    .line 51
    iget-object p3, p0, Lio/sentry/o2;->b:Lio/sentry/o3;

    .line 52
    .line 53
    invoke-virtual {p3}, Lio/sentry/o3;->getSerializer()Lio/sentry/l0;

    .line 54
    .line 55
    .line 56
    move-result-object p3

    .line 57
    invoke-static {p5, v2, v3, p3}, Lio/sentry/h3;->s(Lio/sentry/w1;JLio/sentry/l0;)Lio/sentry/h3;

    .line 58
    .line 59
    .line 60
    move-result-object p3

    .line 61
    invoke-interface {v0, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    if-nez p1, :cond_2

    .line 65
    .line 66
    new-instance p1, Lio/sentry/protocol/p;

    .line 67
    .line 68
    invoke-virtual {p5}, Lio/sentry/w1;->A()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p3

    .line 72
    invoke-direct {p1, p3}, Lio/sentry/protocol/p;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    :cond_2
    if-eqz p2, :cond_3

    .line 76
    .line 77
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 82
    .line 83
    .line 84
    move-result p3

    .line 85
    if-eqz p3, :cond_3

    .line 86
    .line 87
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p3

    .line 91
    check-cast p3, Lio/sentry/b;

    .line 92
    .line 93
    iget-object p5, p0, Lio/sentry/o2;->b:Lio/sentry/o3;

    .line 94
    .line 95
    invoke-virtual {p5}, Lio/sentry/o3;->getMaxAttachmentSize()J

    .line 96
    .line 97
    .line 98
    move-result-wide v2

    .line 99
    invoke-static {p3, v2, v3}, Lio/sentry/h3;->p(Lio/sentry/b;J)Lio/sentry/h3;

    .line 100
    .line 101
    .line 102
    move-result-object p3

    .line 103
    invoke-interface {v0, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_3
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 108
    .line 109
    .line 110
    move-result p2

    .line 111
    if-nez p2, :cond_4

    .line 112
    .line 113
    new-instance p2, Lio/sentry/r2;

    .line 114
    .line 115
    iget-object p3, p0, Lio/sentry/o2;->b:Lio/sentry/o3;

    .line 116
    .line 117
    invoke-virtual {p3}, Lio/sentry/o3;->getSdkVersion()Lio/sentry/protocol/n;

    .line 118
    .line 119
    .line 120
    move-result-object p3

    .line 121
    invoke-direct {p2, p1, p3, p4}, Lio/sentry/r2;-><init>(Lio/sentry/protocol/p;Lio/sentry/protocol/n;Lio/sentry/k4;)V

    .line 122
    .line 123
    .line 124
    new-instance p1, Lio/sentry/q2;

    .line 125
    .line 126
    invoke-direct {p1, p2, v0}, Lio/sentry/q2;-><init>(Lio/sentry/r2;Ljava/lang/Iterable;)V

    .line 127
    .line 128
    .line 129
    return-object p1

    .line 130
    :cond_4
    return-object v1
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

.method private n(Lio/sentry/j3;Lio/sentry/v;)Lio/sentry/j3;
    .locals 3

    .line 1
    iget-object v0, p0, Lio/sentry/o2;->b:Lio/sentry/o3;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/o3;->getBeforeSend()Lio/sentry/o3$b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    :try_start_0
    invoke-interface {v0, p1, p2}, Lio/sentry/o3$b;->a(Lio/sentry/j3;Lio/sentry/v;)Lio/sentry/j3;

    .line 10
    .line 11
    .line 12
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    goto :goto_0

    .line 14
    :catchall_0
    move-exception p2

    .line 15
    iget-object v0, p0, Lio/sentry/o2;->b:Lio/sentry/o3;

    .line 16
    .line 17
    invoke-virtual {v0}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sget-object v1, Lio/sentry/n3;->ERROR:Lio/sentry/n3;

    .line 22
    .line 23
    const-string v2, "The BeforeSend callback threw an exception. It will be added as breadcrumb and continue."

    .line 24
    .line 25
    invoke-interface {v0, v1, v2, p2}, Lio/sentry/g0;->b(Lio/sentry/n3;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 26
    .line 27
    .line 28
    new-instance v0, Lio/sentry/d;

    .line 29
    .line 30
    invoke-direct {v0}, Lio/sentry/d;-><init>()V

    .line 31
    .line 32
    .line 33
    const-string v1, "BeforeSend callback failed."

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Lio/sentry/d;->o(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const-string v1, "SentryClient"

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Lio/sentry/d;->l(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    sget-object v1, Lio/sentry/n3;->ERROR:Lio/sentry/n3;

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Lio/sentry/d;->n(Lio/sentry/n3;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    if-eqz v1, :cond_0

    .line 53
    .line 54
    const-string v1, "sentry:message"

    .line 55
    .line 56
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    invoke-virtual {v0, v1, p2}, Lio/sentry/d;->m(Ljava/lang/String;Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    :cond_0
    invoke-virtual {p1, v0}, Lio/sentry/l2;->z(Lio/sentry/d;)V

    .line 64
    .line 65
    .line 66
    :cond_1
    :goto_0
    return-object p1
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
.end method

.method private o(Lio/sentry/protocol/w;Lio/sentry/v;)Lio/sentry/protocol/w;
    .locals 0

    .line 1
    iget-object p2, p0, Lio/sentry/o2;->b:Lio/sentry/o3;

    .line 2
    .line 3
    invoke-virtual {p2}, Lio/sentry/o3;->getBeforeSendTransaction()Lio/sentry/o3$c;

    .line 4
    .line 5
    .line 6
    return-object p1
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

.method private p(Ljava/util/List;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/sentry/b;",
            ">;)",
            "Ljava/util/List<",
            "Lio/sentry/b;",
            ">;"
        }
    .end annotation

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return-object p1

    .line 5
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_2

    .line 19
    .line 20
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Lio/sentry/b;

    .line 25
    .line 26
    invoke-virtual {v1}, Lio/sentry/b;->g()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    return-object v0
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
.end method

.method private q(Lio/sentry/v;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/sentry/v;",
            ")",
            "Ljava/util/List<",
            "Lio/sentry/b;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lio/sentry/v;->e()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Lio/sentry/v;->f()Lio/sentry/b;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    :cond_0
    return-object v0
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

.method private static synthetic r(Lio/sentry/y3;)V
    .locals 0

    return-void
.end method

.method private synthetic s(Lio/sentry/j3;Lio/sentry/v;Lio/sentry/y3;)V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p3, :cond_4

    .line 3
    .line 4
    invoke-virtual {p1}, Lio/sentry/j3;->s0()Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    const/4 v2, 0x0

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    sget-object v1, Lio/sentry/y3$b;->Crashed:Lio/sentry/y3$b;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-object v1, v2

    .line 15
    :goto_0
    sget-object v3, Lio/sentry/y3$b;->Crashed:Lio/sentry/y3$b;

    .line 16
    .line 17
    if-eq v3, v1, :cond_1

    .line 18
    .line 19
    invoke-virtual {p1}, Lio/sentry/j3;->t0()Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-eqz v3, :cond_2

    .line 24
    .line 25
    :cond_1
    const/4 v0, 0x1

    .line 26
    :cond_2
    invoke-virtual {p1}, Lio/sentry/l2;->I()Lio/sentry/protocol/k;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    if-eqz v3, :cond_3

    .line 31
    .line 32
    invoke-virtual {p1}, Lio/sentry/l2;->I()Lio/sentry/protocol/k;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-virtual {v3}, Lio/sentry/protocol/k;->k()Ljava/util/Map;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    if-eqz v3, :cond_3

    .line 41
    .line 42
    invoke-virtual {p1}, Lio/sentry/l2;->I()Lio/sentry/protocol/k;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-virtual {v3}, Lio/sentry/protocol/k;->k()Ljava/util/Map;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    const-string v4, "user-agent"

    .line 51
    .line 52
    invoke-interface {v3, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    if-eqz v3, :cond_3

    .line 57
    .line 58
    invoke-virtual {p1}, Lio/sentry/l2;->I()Lio/sentry/protocol/k;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-virtual {p1}, Lio/sentry/protocol/k;->k()Ljava/util/Map;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-interface {p1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    move-object v2, p1

    .line 71
    check-cast v2, Ljava/lang/String;

    .line 72
    .line 73
    :cond_3
    invoke-virtual {p3, v1, v2, v0}, Lio/sentry/y3;->m(Lio/sentry/y3$b;Ljava/lang/String;Z)Z

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    if-eqz p1, :cond_5

    .line 78
    .line 79
    const-class p1, Lio/sentry/hints/c;

    .line 80
    .line 81
    invoke-static {p2, p1}, Lio/sentry/util/h;->g(Lio/sentry/v;Ljava/lang/Class;)Z

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    if-eqz p1, :cond_5

    .line 86
    .line 87
    invoke-virtual {p3}, Lio/sentry/y3;->c()V

    .line 88
    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_4
    iget-object p1, p0, Lio/sentry/o2;->b:Lio/sentry/o3;

    .line 92
    .line 93
    invoke-virtual {p1}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    sget-object p2, Lio/sentry/n3;->INFO:Lio/sentry/n3;

    .line 98
    .line 99
    const-string p3, "Session is null on scope.withSession"

    .line 100
    .line 101
    new-array v0, v0, [Ljava/lang/Object;

    .line 102
    .line 103
    invoke-interface {p1, p2, p3, v0}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    :cond_5
    :goto_1
    return-void
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

.method private t(Lio/sentry/j3;Lio/sentry/v;Ljava/util/List;)Lio/sentry/j3;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/sentry/j3;",
            "Lio/sentry/v;",
            "Ljava/util/List<",
            "Lio/sentry/t;",
            ">;)",
            "Lio/sentry/j3;"
        }
    .end annotation

    .line 1
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    :cond_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lio/sentry/t;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    const/4 v2, 0x1

    .line 19
    :try_start_0
    invoke-interface {v0, p1, p2}, Lio/sentry/t;->b(Lio/sentry/j3;Lio/sentry/v;)Lio/sentry/j3;

    .line 20
    .line 21
    .line 22
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception v3

    .line 25
    iget-object v4, p0, Lio/sentry/o2;->b:Lio/sentry/o3;

    .line 26
    .line 27
    invoke-virtual {v4}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    sget-object v5, Lio/sentry/n3;->ERROR:Lio/sentry/n3;

    .line 32
    .line 33
    new-array v6, v2, [Ljava/lang/Object;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-result-object v7

    .line 39
    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v7

    .line 43
    aput-object v7, v6, v1

    .line 44
    .line 45
    const-string v7, "An exception occurred while processing event by processor: %s"

    .line 46
    .line 47
    invoke-interface {v4, v5, v3, v7, v6}, Lio/sentry/g0;->a(Lio/sentry/n3;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    :goto_0
    if-nez p1, :cond_0

    .line 51
    .line 52
    iget-object p2, p0, Lio/sentry/o2;->b:Lio/sentry/o3;

    .line 53
    .line 54
    invoke-virtual {p2}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    sget-object p3, Lio/sentry/n3;->DEBUG:Lio/sentry/n3;

    .line 59
    .line 60
    new-array v2, v2, [Ljava/lang/Object;

    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    aput-object v0, v2, v1

    .line 71
    .line 72
    const-string v0, "Event was dropped by a processor: %s"

    .line 73
    .line 74
    invoke-interface {p2, p3, v0, v2}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    iget-object p2, p0, Lio/sentry/o2;->b:Lio/sentry/o3;

    .line 78
    .line 79
    invoke-virtual {p2}, Lio/sentry/o3;->getClientReportRecorder()Lio/sentry/clientreport/g;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    sget-object p3, Lio/sentry/clientreport/e;->EVENT_PROCESSOR:Lio/sentry/clientreport/e;

    .line 84
    .line 85
    sget-object v0, Lio/sentry/g;->Error:Lio/sentry/g;

    .line 86
    .line 87
    invoke-interface {p2, p3, v0}, Lio/sentry/clientreport/g;->a(Lio/sentry/clientreport/e;Lio/sentry/g;)V

    .line 88
    .line 89
    .line 90
    :cond_1
    return-object p1
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

.method private u(Lio/sentry/protocol/w;Lio/sentry/v;Ljava/util/List;)Lio/sentry/protocol/w;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/sentry/protocol/w;",
            "Lio/sentry/v;",
            "Ljava/util/List<",
            "Lio/sentry/t;",
            ">;)",
            "Lio/sentry/protocol/w;"
        }
    .end annotation

    .line 1
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    :cond_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lio/sentry/t;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    const/4 v2, 0x1

    .line 19
    :try_start_0
    invoke-interface {v0, p1, p2}, Lio/sentry/t;->f(Lio/sentry/protocol/w;Lio/sentry/v;)Lio/sentry/protocol/w;

    .line 20
    .line 21
    .line 22
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception v3

    .line 25
    iget-object v4, p0, Lio/sentry/o2;->b:Lio/sentry/o3;

    .line 26
    .line 27
    invoke-virtual {v4}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    sget-object v5, Lio/sentry/n3;->ERROR:Lio/sentry/n3;

    .line 32
    .line 33
    new-array v6, v2, [Ljava/lang/Object;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-result-object v7

    .line 39
    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v7

    .line 43
    aput-object v7, v6, v1

    .line 44
    .line 45
    const-string v7, "An exception occurred while processing transaction by processor: %s"

    .line 46
    .line 47
    invoke-interface {v4, v5, v3, v7, v6}, Lio/sentry/g0;->a(Lio/sentry/n3;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    :goto_0
    if-nez p1, :cond_0

    .line 51
    .line 52
    iget-object p2, p0, Lio/sentry/o2;->b:Lio/sentry/o3;

    .line 53
    .line 54
    invoke-virtual {p2}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    sget-object p3, Lio/sentry/n3;->DEBUG:Lio/sentry/n3;

    .line 59
    .line 60
    new-array v2, v2, [Ljava/lang/Object;

    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    aput-object v0, v2, v1

    .line 71
    .line 72
    const-string v0, "Transaction was dropped by a processor: %s"

    .line 73
    .line 74
    invoke-interface {p2, p3, v0, v2}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    iget-object p2, p0, Lio/sentry/o2;->b:Lio/sentry/o3;

    .line 78
    .line 79
    invoke-virtual {p2}, Lio/sentry/o3;->getClientReportRecorder()Lio/sentry/clientreport/g;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    sget-object p3, Lio/sentry/clientreport/e;->EVENT_PROCESSOR:Lio/sentry/clientreport/e;

    .line 84
    .line 85
    sget-object v0, Lio/sentry/g;->Transaction:Lio/sentry/g;

    .line 86
    .line 87
    invoke-interface {p2, p3, v0}, Lio/sentry/clientreport/g;->a(Lio/sentry/clientreport/e;Lio/sentry/g;)V

    .line 88
    .line 89
    .line 90
    :cond_1
    return-object p1
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

.method private v()Z
    .locals 6

    .line 1
    iget-object v0, p0, Lio/sentry/o2;->b:Lio/sentry/o3;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/o3;->getSampleRate()Ljava/lang/Double;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    iget-object v0, p0, Lio/sentry/o2;->d:Ljava/security/SecureRandom;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iget-object v0, p0, Lio/sentry/o2;->b:Lio/sentry/o3;

    .line 15
    .line 16
    invoke-virtual {v0}, Lio/sentry/o3;->getSampleRate()Ljava/lang/Double;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 21
    .line 22
    .line 23
    move-result-wide v2

    .line 24
    iget-object v0, p0, Lio/sentry/o2;->d:Ljava/security/SecureRandom;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/util/Random;->nextDouble()D

    .line 27
    .line 28
    .line 29
    move-result-wide v4

    .line 30
    cmpg-double v0, v2, v4

    .line 31
    .line 32
    if-ltz v0, :cond_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    const/4 v1, 0x0

    .line 36
    :cond_1
    :goto_0
    return v1
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
.end method

.method private w(Lio/sentry/l2;Lio/sentry/v;)Z
    .locals 3

    .line 1
    invoke-static {p2}, Lio/sentry/util/h;->s(Lio/sentry/v;)Z

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    const/4 v0, 0x1

    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    return v0

    .line 9
    :cond_0
    iget-object p2, p0, Lio/sentry/o2;->b:Lio/sentry/o3;

    .line 10
    .line 11
    invoke-virtual {p2}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    sget-object v1, Lio/sentry/n3;->DEBUG:Lio/sentry/n3;

    .line 16
    .line 17
    new-array v0, v0, [Ljava/lang/Object;

    .line 18
    .line 19
    invoke-virtual {p1}, Lio/sentry/l2;->E()Lio/sentry/protocol/p;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const/4 v2, 0x0

    .line 24
    aput-object p1, v0, v2

    .line 25
    .line 26
    const-string p1, "Event was cached so not applying scope: %s"

    .line 27
    .line 28
    invoke-interface {p2, v1, p1, v0}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    return v2
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

.method private x(Lio/sentry/y3;Lio/sentry/y3;)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p2, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x1

    .line 6
    if-nez p1, :cond_1

    .line 7
    .line 8
    return v1

    .line 9
    :cond_1
    invoke-virtual {p2}, Lio/sentry/y3;->j()Lio/sentry/y3$b;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    sget-object v3, Lio/sentry/y3$b;->Crashed:Lio/sentry/y3$b;

    .line 14
    .line 15
    if-ne v2, v3, :cond_2

    .line 16
    .line 17
    invoke-virtual {p1}, Lio/sentry/y3;->j()Lio/sentry/y3$b;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    if-eq v2, v3, :cond_2

    .line 22
    .line 23
    move v2, v1

    .line 24
    goto :goto_0

    .line 25
    :cond_2
    move v2, v0

    .line 26
    :goto_0
    if-eqz v2, :cond_3

    .line 27
    .line 28
    return v1

    .line 29
    :cond_3
    invoke-virtual {p2}, Lio/sentry/y3;->e()I

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    if-lez p2, :cond_4

    .line 34
    .line 35
    invoke-virtual {p1}, Lio/sentry/y3;->e()I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-gtz p1, :cond_4

    .line 40
    .line 41
    move p1, v1

    .line 42
    goto :goto_1

    .line 43
    :cond_4
    move p1, v0

    .line 44
    :goto_1
    if-eqz p1, :cond_5

    .line 45
    .line 46
    return v1

    .line 47
    :cond_5
    return v0
    .line 48
    .line 49
.end method

.method private y(Lio/sentry/l2;Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/sentry/l2;",
            "Ljava/util/Collection<",
            "Lio/sentry/d;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lio/sentry/l2;->A()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-interface {p1, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 14
    .line 15
    .line 16
    iget-object p2, p0, Lio/sentry/o2;->e:Lio/sentry/o2$b;

    .line 17
    .line 18
    invoke-static {p1, p2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
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


# virtual methods
.method public a(Lio/sentry/y3;Lio/sentry/v;)V
    .locals 2

    .line 1
    const-string v0, "Session is required."

    .line 2
    .line 3
    invoke-static {p1, v0}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lio/sentry/y3;->g()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {p1}, Lio/sentry/y3;->g()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    :try_start_0
    iget-object v0, p0, Lio/sentry/o2;->b:Lio/sentry/o3;

    .line 24
    .line 25
    invoke-virtual {v0}, Lio/sentry/o3;->getSerializer()Lio/sentry/l0;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iget-object v1, p0, Lio/sentry/o2;->b:Lio/sentry/o3;

    .line 30
    .line 31
    invoke-virtual {v1}, Lio/sentry/o3;->getSdkVersion()Lio/sentry/protocol/n;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-static {v0, p1, v1}, Lio/sentry/q2;->b(Lio/sentry/l0;Lio/sentry/y3;Lio/sentry/protocol/n;)Lio/sentry/q2;

    .line 36
    .line 37
    .line 38
    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 39
    invoke-virtual {p0, p1, p2}, Lio/sentry/o2;->f(Lio/sentry/q2;Lio/sentry/v;)Lio/sentry/protocol/p;

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :catch_0
    move-exception p1

    .line 44
    iget-object p2, p0, Lio/sentry/o2;->b:Lio/sentry/o3;

    .line 45
    .line 46
    invoke-virtual {p2}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    sget-object v0, Lio/sentry/n3;->ERROR:Lio/sentry/n3;

    .line 51
    .line 52
    const-string v1, "Failed to capture session."

    .line 53
    .line 54
    invoke-interface {p2, v0, v1, p1}, Lio/sentry/g0;->b(Lio/sentry/n3;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_1
    :goto_0
    iget-object p1, p0, Lio/sentry/o2;->b:Lio/sentry/o3;

    .line 59
    .line 60
    invoke-virtual {p1}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    sget-object p2, Lio/sentry/n3;->WARNING:Lio/sentry/n3;

    .line 65
    .line 66
    const/4 v0, 0x0

    .line 67
    new-array v0, v0, [Ljava/lang/Object;

    .line 68
    .line 69
    const-string v1, "Sessions can\'t be captured without setting a release."

    .line 70
    .line 71
    invoke-interface {p1, p2, v1, v0}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    return-void
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
.end method

.method public b(Lio/sentry/protocol/w;Lio/sentry/k4;Lio/sentry/Scope;Lio/sentry/v;)Lio/sentry/protocol/p;
    .locals 13

    .line 1
    move-object v7, p0

    .line 2
    move-object v0, p1

    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    const-string v2, "Transaction is required."

    .line 6
    .line 7
    invoke-static {p1, v2}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    if-nez p4, :cond_0

    .line 11
    .line 12
    new-instance v2, Lio/sentry/v;

    .line 13
    .line 14
    invoke-direct {v2}, Lio/sentry/v;-><init>()V

    .line 15
    .line 16
    .line 17
    move-object v8, v2

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move-object/from16 v8, p4

    .line 20
    .line 21
    :goto_0
    invoke-direct {p0, p1, v8}, Lio/sentry/o2;->w(Lio/sentry/l2;Lio/sentry/v;)Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    invoke-direct {p0, v1, v8}, Lio/sentry/o2;->j(Lio/sentry/Scope;Lio/sentry/v;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    iget-object v2, v7, Lio/sentry/o2;->b:Lio/sentry/o3;

    .line 31
    .line 32
    invoke-virtual {v2}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    sget-object v3, Lio/sentry/n3;->DEBUG:Lio/sentry/n3;

    .line 37
    .line 38
    const/4 v9, 0x1

    .line 39
    new-array v4, v9, [Ljava/lang/Object;

    .line 40
    .line 41
    invoke-virtual {p1}, Lio/sentry/l2;->E()Lio/sentry/protocol/p;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    const/4 v10, 0x0

    .line 46
    aput-object v5, v4, v10

    .line 47
    .line 48
    const-string v5, "Capturing transaction: %s"

    .line 49
    .line 50
    invoke-interface {v2, v3, v5, v4}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    sget-object v11, Lio/sentry/protocol/p;->l:Lio/sentry/protocol/p;

    .line 54
    .line 55
    invoke-virtual {p1}, Lio/sentry/l2;->E()Lio/sentry/protocol/p;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    if-eqz v2, :cond_2

    .line 60
    .line 61
    invoke-virtual {p1}, Lio/sentry/l2;->E()Lio/sentry/protocol/p;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    move-object v12, v2

    .line 66
    goto :goto_1

    .line 67
    :cond_2
    move-object v12, v11

    .line 68
    :goto_1
    invoke-direct {p0, p1, v8}, Lio/sentry/o2;->w(Lio/sentry/l2;Lio/sentry/v;)Z

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    if-eqz v2, :cond_4

    .line 73
    .line 74
    invoke-direct {p0, p1, v1}, Lio/sentry/o2;->k(Lio/sentry/l2;Lio/sentry/Scope;)Lio/sentry/l2;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    check-cast v0, Lio/sentry/protocol/w;

    .line 79
    .line 80
    if-eqz v0, :cond_3

    .line 81
    .line 82
    if-eqz v1, :cond_3

    .line 83
    .line 84
    invoke-virtual/range {p3 .. p3}, Lio/sentry/Scope;->j()Ljava/util/List;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    invoke-direct {p0, v0, v8, v1}, Lio/sentry/o2;->u(Lio/sentry/protocol/w;Lio/sentry/v;Ljava/util/List;)Lio/sentry/protocol/w;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    :cond_3
    if-nez v0, :cond_4

    .line 93
    .line 94
    iget-object v1, v7, Lio/sentry/o2;->b:Lio/sentry/o3;

    .line 95
    .line 96
    invoke-virtual {v1}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    const-string v2, "Transaction was dropped by applyScope"

    .line 101
    .line 102
    new-array v4, v10, [Ljava/lang/Object;

    .line 103
    .line 104
    invoke-interface {v1, v3, v2, v4}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    :cond_4
    if-eqz v0, :cond_5

    .line 108
    .line 109
    iget-object v1, v7, Lio/sentry/o2;->b:Lio/sentry/o3;

    .line 110
    .line 111
    invoke-virtual {v1}, Lio/sentry/o3;->getEventProcessors()Ljava/util/List;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    invoke-direct {p0, v0, v8, v1}, Lio/sentry/o2;->u(Lio/sentry/protocol/w;Lio/sentry/v;Ljava/util/List;)Lio/sentry/protocol/w;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    :cond_5
    if-nez v0, :cond_6

    .line 120
    .line 121
    iget-object v0, v7, Lio/sentry/o2;->b:Lio/sentry/o3;

    .line 122
    .line 123
    invoke-virtual {v0}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    const-string v1, "Transaction was dropped by Event processors."

    .line 128
    .line 129
    new-array v2, v10, [Ljava/lang/Object;

    .line 130
    .line 131
    invoke-interface {v0, v3, v1, v2}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    return-object v11

    .line 135
    :cond_6
    invoke-direct {p0, v0, v8}, Lio/sentry/o2;->o(Lio/sentry/protocol/w;Lio/sentry/v;)Lio/sentry/protocol/w;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    if-nez v2, :cond_7

    .line 140
    .line 141
    iget-object v0, v7, Lio/sentry/o2;->b:Lio/sentry/o3;

    .line 142
    .line 143
    invoke-virtual {v0}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    const-string v1, "Transaction was dropped by beforeSendTransaction."

    .line 148
    .line 149
    new-array v2, v10, [Ljava/lang/Object;

    .line 150
    .line 151
    invoke-interface {v0, v3, v1, v2}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    iget-object v0, v7, Lio/sentry/o2;->b:Lio/sentry/o3;

    .line 155
    .line 156
    invoke-virtual {v0}, Lio/sentry/o3;->getClientReportRecorder()Lio/sentry/clientreport/g;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    sget-object v1, Lio/sentry/clientreport/e;->BEFORE_SEND:Lio/sentry/clientreport/e;

    .line 161
    .line 162
    sget-object v2, Lio/sentry/g;->Transaction:Lio/sentry/g;

    .line 163
    .line 164
    invoke-interface {v0, v1, v2}, Lio/sentry/clientreport/g;->a(Lio/sentry/clientreport/e;Lio/sentry/g;)V

    .line 165
    .line 166
    .line 167
    return-object v11

    .line 168
    :cond_7
    :try_start_0
    invoke-direct {p0, v8}, Lio/sentry/o2;->q(Lio/sentry/v;)Ljava/util/List;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    invoke-direct {p0, v0}, Lio/sentry/o2;->p(Ljava/util/List;)Ljava/util/List;

    .line 173
    .line 174
    .line 175
    move-result-object v3

    .line 176
    const/4 v4, 0x0

    .line 177
    const/4 v6, 0x0

    .line 178
    move-object v1, p0

    .line 179
    move-object v5, p2

    .line 180
    invoke-direct/range {v1 .. v6}, Lio/sentry/o2;->m(Lio/sentry/l2;Ljava/util/List;Lio/sentry/y3;Lio/sentry/k4;Lio/sentry/w1;)Lio/sentry/q2;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    invoke-virtual {v8}, Lio/sentry/v;->b()V

    .line 185
    .line 186
    .line 187
    if-eqz v0, :cond_8

    .line 188
    .line 189
    iget-object v1, v7, Lio/sentry/o2;->c:Lio/sentry/transport/p;

    .line 190
    .line 191
    invoke-interface {v1, v0, v8}, Lio/sentry/transport/p;->D(Lio/sentry/q2;Lio/sentry/v;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lio/sentry/exception/b; {:try_start_0 .. :try_end_0} :catch_0

    .line 192
    .line 193
    .line 194
    move-object v11, v12

    .line 195
    goto :goto_3

    .line 196
    :catch_0
    move-exception v0

    .line 197
    goto :goto_2

    .line 198
    :catch_1
    move-exception v0

    .line 199
    :goto_2
    iget-object v1, v7, Lio/sentry/o2;->b:Lio/sentry/o3;

    .line 200
    .line 201
    invoke-virtual {v1}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    sget-object v2, Lio/sentry/n3;->WARNING:Lio/sentry/n3;

    .line 206
    .line 207
    new-array v3, v9, [Ljava/lang/Object;

    .line 208
    .line 209
    aput-object v12, v3, v10

    .line 210
    .line 211
    const-string v4, "Capturing transaction %s failed."

    .line 212
    .line 213
    invoke-interface {v1, v2, v0, v4, v3}, Lio/sentry/g0;->a(Lio/sentry/n3;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 214
    .line 215
    .line 216
    sget-object v11, Lio/sentry/protocol/p;->l:Lio/sentry/protocol/p;

    .line 217
    .line 218
    :cond_8
    :goto_3
    return-object v11
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
.end method

.method public synthetic c(Lio/sentry/j3;Lio/sentry/Scope;)Lio/sentry/protocol/p;
    .locals 0

    invoke-static {p0, p1, p2}, Lio/sentry/i0;->a(Lio/sentry/j0;Lio/sentry/j3;Lio/sentry/Scope;)Lio/sentry/protocol/p;

    move-result-object p1

    return-object p1
.end method

.method public close()V
    .locals 7

    .line 1
    iget-object v0, p0, Lio/sentry/o2;->b:Lio/sentry/o3;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lio/sentry/n3;->INFO:Lio/sentry/n3;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    new-array v3, v2, [Ljava/lang/Object;

    .line 11
    .line 12
    const-string v4, "Closing SentryClient."

    .line 13
    .line 14
    invoke-interface {v0, v1, v4, v3}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    :try_start_0
    iget-object v0, p0, Lio/sentry/o2;->b:Lio/sentry/o3;

    .line 18
    .line 19
    invoke-virtual {v0}, Lio/sentry/o3;->getShutdownTimeoutMillis()J

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    invoke-virtual {p0, v0, v1}, Lio/sentry/o2;->d(J)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lio/sentry/o2;->c:Lio/sentry/transport/p;

    .line 27
    .line 28
    invoke-interface {v0}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :catch_0
    move-exception v0

    .line 33
    iget-object v1, p0, Lio/sentry/o2;->b:Lio/sentry/o3;

    .line 34
    .line 35
    invoke-virtual {v1}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    sget-object v3, Lio/sentry/n3;->WARNING:Lio/sentry/n3;

    .line 40
    .line 41
    const-string v4, "Failed to close the connection to the Sentry Server."

    .line 42
    .line 43
    invoke-interface {v1, v3, v4, v0}, Lio/sentry/g0;->b(Lio/sentry/n3;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 44
    .line 45
    .line 46
    :goto_0
    iget-object v0, p0, Lio/sentry/o2;->b:Lio/sentry/o3;

    .line 47
    .line 48
    invoke-virtual {v0}, Lio/sentry/o3;->getEventProcessors()Ljava/util/List;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    :cond_0
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-eqz v1, :cond_1

    .line 61
    .line 62
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    check-cast v1, Lio/sentry/t;

    .line 67
    .line 68
    instance-of v3, v1, Ljava/io/Closeable;

    .line 69
    .line 70
    if-eqz v3, :cond_0

    .line 71
    .line 72
    :try_start_1
    move-object v3, v1

    .line 73
    check-cast v3, Ljava/io/Closeable;

    .line 74
    .line 75
    invoke-interface {v3}, Ljava/io/Closeable;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :catch_1
    move-exception v3

    .line 80
    iget-object v4, p0, Lio/sentry/o2;->b:Lio/sentry/o3;

    .line 81
    .line 82
    invoke-virtual {v4}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    sget-object v5, Lio/sentry/n3;->WARNING:Lio/sentry/n3;

    .line 87
    .line 88
    const/4 v6, 0x2

    .line 89
    new-array v6, v6, [Ljava/lang/Object;

    .line 90
    .line 91
    aput-object v1, v6, v2

    .line 92
    .line 93
    const/4 v1, 0x1

    .line 94
    aput-object v3, v6, v1

    .line 95
    .line 96
    const-string v1, "Failed to close the event processor {}."

    .line 97
    .line 98
    invoke-interface {v4, v5, v1, v6}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_1
    iput-boolean v2, p0, Lio/sentry/o2;->a:Z

    .line 103
    .line 104
    return-void
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
.end method

.method public d(J)V
    .locals 1

    iget-object v0, p0, Lio/sentry/o2;->c:Lio/sentry/transport/p;

    invoke-interface {v0, p1, p2}, Lio/sentry/transport/p;->d(J)V

    return-void
.end method

.method public e(Lio/sentry/j3;Lio/sentry/Scope;Lio/sentry/v;)Lio/sentry/protocol/p;
    .locals 12

    .line 1
    const-string v0, "SentryEvent is required."

    .line 2
    .line 3
    invoke-static {p1, v0}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    if-nez p3, :cond_0

    .line 7
    .line 8
    new-instance p3, Lio/sentry/v;

    .line 9
    .line 10
    invoke-direct {p3}, Lio/sentry/v;-><init>()V

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-direct {p0, p1, p3}, Lio/sentry/o2;->w(Lio/sentry/l2;Lio/sentry/v;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-direct {p0, p2, p3}, Lio/sentry/o2;->j(Lio/sentry/Scope;Lio/sentry/v;)V

    .line 20
    .line 21
    .line 22
    :cond_1
    iget-object v0, p0, Lio/sentry/o2;->b:Lio/sentry/o3;

    .line 23
    .line 24
    invoke-virtual {v0}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    sget-object v1, Lio/sentry/n3;->DEBUG:Lio/sentry/n3;

    .line 29
    .line 30
    const/4 v2, 0x1

    .line 31
    new-array v3, v2, [Ljava/lang/Object;

    .line 32
    .line 33
    invoke-virtual {p1}, Lio/sentry/l2;->E()Lio/sentry/protocol/p;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    const/4 v5, 0x0

    .line 38
    aput-object v4, v3, v5

    .line 39
    .line 40
    const-string v4, "Capturing event: %s"

    .line 41
    .line 42
    invoke-interface {v0, v1, v4, v3}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1}, Lio/sentry/l2;->M()Ljava/lang/Throwable;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    if-eqz v0, :cond_2

    .line 50
    .line 51
    iget-object v3, p0, Lio/sentry/o2;->b:Lio/sentry/o3;

    .line 52
    .line 53
    invoke-virtual {v3, v0}, Lio/sentry/o3;->containsIgnoredExceptionForType(Ljava/lang/Throwable;)Z

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-eqz v3, :cond_2

    .line 58
    .line 59
    iget-object p1, p0, Lio/sentry/o2;->b:Lio/sentry/o3;

    .line 60
    .line 61
    invoke-virtual {p1}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    new-array p2, v2, [Ljava/lang/Object;

    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    move-result-object p3

    .line 71
    aput-object p3, p2, v5

    .line 72
    .line 73
    const-string p3, "Event was dropped as the exception %s is ignored"

    .line 74
    .line 75
    invoke-interface {p1, v1, p3, p2}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    iget-object p1, p0, Lio/sentry/o2;->b:Lio/sentry/o3;

    .line 79
    .line 80
    invoke-virtual {p1}, Lio/sentry/o3;->getClientReportRecorder()Lio/sentry/clientreport/g;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    sget-object p2, Lio/sentry/clientreport/e;->EVENT_PROCESSOR:Lio/sentry/clientreport/e;

    .line 85
    .line 86
    sget-object p3, Lio/sentry/g;->Error:Lio/sentry/g;

    .line 87
    .line 88
    invoke-interface {p1, p2, p3}, Lio/sentry/clientreport/g;->a(Lio/sentry/clientreport/e;Lio/sentry/g;)V

    .line 89
    .line 90
    .line 91
    sget-object p1, Lio/sentry/protocol/p;->l:Lio/sentry/protocol/p;

    .line 92
    .line 93
    return-object p1

    .line 94
    :cond_2
    invoke-direct {p0, p1, p3}, Lio/sentry/o2;->w(Lio/sentry/l2;Lio/sentry/v;)Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-eqz v0, :cond_3

    .line 99
    .line 100
    invoke-direct {p0, p1, p2, p3}, Lio/sentry/o2;->l(Lio/sentry/j3;Lio/sentry/Scope;Lio/sentry/v;)Lio/sentry/j3;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    if-nez p1, :cond_3

    .line 105
    .line 106
    iget-object p1, p0, Lio/sentry/o2;->b:Lio/sentry/o3;

    .line 107
    .line 108
    invoke-virtual {p1}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    const-string p2, "Event was dropped by applyScope"

    .line 113
    .line 114
    new-array p3, v5, [Ljava/lang/Object;

    .line 115
    .line 116
    invoke-interface {p1, v1, p2, p3}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    sget-object p1, Lio/sentry/protocol/p;->l:Lio/sentry/protocol/p;

    .line 120
    .line 121
    return-object p1

    .line 122
    :cond_3
    iget-object v0, p0, Lio/sentry/o2;->b:Lio/sentry/o3;

    .line 123
    .line 124
    invoke-virtual {v0}, Lio/sentry/o3;->getEventProcessors()Ljava/util/List;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-direct {p0, p1, p3, v0}, Lio/sentry/o2;->t(Lio/sentry/j3;Lio/sentry/v;Ljava/util/List;)Lio/sentry/j3;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    if-eqz p1, :cond_4

    .line 133
    .line 134
    invoke-direct {p0, p1, p3}, Lio/sentry/o2;->n(Lio/sentry/j3;Lio/sentry/v;)Lio/sentry/j3;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    if-nez p1, :cond_4

    .line 139
    .line 140
    iget-object v0, p0, Lio/sentry/o2;->b:Lio/sentry/o3;

    .line 141
    .line 142
    invoke-virtual {v0}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    const-string v3, "Event was dropped by beforeSend"

    .line 147
    .line 148
    new-array v4, v5, [Ljava/lang/Object;

    .line 149
    .line 150
    invoke-interface {v0, v1, v3, v4}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    iget-object v0, p0, Lio/sentry/o2;->b:Lio/sentry/o3;

    .line 154
    .line 155
    invoke-virtual {v0}, Lio/sentry/o3;->getClientReportRecorder()Lio/sentry/clientreport/g;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    sget-object v3, Lio/sentry/clientreport/e;->BEFORE_SEND:Lio/sentry/clientreport/e;

    .line 160
    .line 161
    sget-object v4, Lio/sentry/g;->Error:Lio/sentry/g;

    .line 162
    .line 163
    invoke-interface {v0, v3, v4}, Lio/sentry/clientreport/g;->a(Lio/sentry/clientreport/e;Lio/sentry/g;)V

    .line 164
    .line 165
    .line 166
    :cond_4
    if-nez p1, :cond_5

    .line 167
    .line 168
    sget-object p1, Lio/sentry/protocol/p;->l:Lio/sentry/protocol/p;

    .line 169
    .line 170
    return-object p1

    .line 171
    :cond_5
    const/4 v0, 0x0

    .line 172
    if-eqz p2, :cond_6

    .line 173
    .line 174
    new-instance v3, Lio/sentry/m2;

    .line 175
    .line 176
    invoke-direct {v3}, Lio/sentry/m2;-><init>()V

    .line 177
    .line 178
    .line 179
    invoke-virtual {p2, v3}, Lio/sentry/Scope;->A(Lio/sentry/Scope$a;)Lio/sentry/y3;

    .line 180
    .line 181
    .line 182
    move-result-object v3

    .line 183
    goto :goto_0

    .line 184
    :cond_6
    move-object v3, v0

    .line 185
    :goto_0
    invoke-virtual {p0, p1, p3, p2}, Lio/sentry/o2;->z(Lio/sentry/j3;Lio/sentry/v;Lio/sentry/Scope;)Lio/sentry/y3;

    .line 186
    .line 187
    .line 188
    move-result-object v9

    .line 189
    invoke-direct {p0}, Lio/sentry/o2;->v()Z

    .line 190
    .line 191
    .line 192
    move-result v4

    .line 193
    if-nez v4, :cond_7

    .line 194
    .line 195
    iget-object v4, p0, Lio/sentry/o2;->b:Lio/sentry/o3;

    .line 196
    .line 197
    invoke-virtual {v4}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 198
    .line 199
    .line 200
    move-result-object v4

    .line 201
    new-array v6, v2, [Ljava/lang/Object;

    .line 202
    .line 203
    invoke-virtual {p1}, Lio/sentry/l2;->E()Lio/sentry/protocol/p;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    aput-object p1, v6, v5

    .line 208
    .line 209
    const-string p1, "Event %s was dropped due to sampling decision."

    .line 210
    .line 211
    invoke-interface {v4, v1, p1, v6}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 212
    .line 213
    .line 214
    iget-object p1, p0, Lio/sentry/o2;->b:Lio/sentry/o3;

    .line 215
    .line 216
    invoke-virtual {p1}, Lio/sentry/o3;->getClientReportRecorder()Lio/sentry/clientreport/g;

    .line 217
    .line 218
    .line 219
    move-result-object p1

    .line 220
    sget-object v4, Lio/sentry/clientreport/e;->SAMPLE_RATE:Lio/sentry/clientreport/e;

    .line 221
    .line 222
    sget-object v6, Lio/sentry/g;->Error:Lio/sentry/g;

    .line 223
    .line 224
    invoke-interface {p1, v4, v6}, Lio/sentry/clientreport/g;->a(Lio/sentry/clientreport/e;Lio/sentry/g;)V

    .line 225
    .line 226
    .line 227
    move-object v7, v0

    .line 228
    goto :goto_1

    .line 229
    :cond_7
    move-object v7, p1

    .line 230
    :goto_1
    invoke-direct {p0, v3, v9}, Lio/sentry/o2;->x(Lio/sentry/y3;Lio/sentry/y3;)Z

    .line 231
    .line 232
    .line 233
    move-result p1

    .line 234
    if-nez v7, :cond_8

    .line 235
    .line 236
    if-nez p1, :cond_8

    .line 237
    .line 238
    iget-object p1, p0, Lio/sentry/o2;->b:Lio/sentry/o3;

    .line 239
    .line 240
    invoke-virtual {p1}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 241
    .line 242
    .line 243
    move-result-object p1

    .line 244
    const-string p2, "Not sending session update for dropped event as it did not cause the session health to change."

    .line 245
    .line 246
    new-array p3, v5, [Ljava/lang/Object;

    .line 247
    .line 248
    invoke-interface {p1, v1, p2, p3}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 249
    .line 250
    .line 251
    sget-object p1, Lio/sentry/protocol/p;->l:Lio/sentry/protocol/p;

    .line 252
    .line 253
    return-object p1

    .line 254
    :cond_8
    sget-object p1, Lio/sentry/protocol/p;->l:Lio/sentry/protocol/p;

    .line 255
    .line 256
    if-eqz v7, :cond_9

    .line 257
    .line 258
    invoke-virtual {v7}, Lio/sentry/l2;->E()Lio/sentry/protocol/p;

    .line 259
    .line 260
    .line 261
    move-result-object v1

    .line 262
    if-eqz v1, :cond_9

    .line 263
    .line 264
    invoke-virtual {v7}, Lio/sentry/l2;->E()Lio/sentry/protocol/p;

    .line 265
    .line 266
    .line 267
    move-result-object p1

    .line 268
    :cond_9
    if-eqz p2, :cond_a

    .line 269
    .line 270
    :try_start_0
    invoke-virtual {p2}, Lio/sentry/Scope;->q()Lio/sentry/m0;

    .line 271
    .line 272
    .line 273
    move-result-object v1

    .line 274
    if-eqz v1, :cond_a

    .line 275
    .line 276
    invoke-virtual {p2}, Lio/sentry/Scope;->q()Lio/sentry/m0;

    .line 277
    .line 278
    .line 279
    move-result-object p2

    .line 280
    invoke-interface {p2}, Lio/sentry/ISpan;->c()Lio/sentry/k4;

    .line 281
    .line 282
    .line 283
    move-result-object p2

    .line 284
    move-object v10, p2

    .line 285
    goto :goto_2

    .line 286
    :catch_0
    move-exception p2

    .line 287
    goto :goto_4

    .line 288
    :catch_1
    move-exception p2

    .line 289
    goto :goto_4

    .line 290
    :cond_a
    move-object v10, v0

    .line 291
    :goto_2
    if-eqz v7, :cond_b

    .line 292
    .line 293
    move p2, v2

    .line 294
    goto :goto_3

    .line 295
    :cond_b
    move p2, v5

    .line 296
    :goto_3
    if-eqz p2, :cond_c

    .line 297
    .line 298
    invoke-direct {p0, p3}, Lio/sentry/o2;->q(Lio/sentry/v;)Ljava/util/List;

    .line 299
    .line 300
    .line 301
    move-result-object v0

    .line 302
    :cond_c
    move-object v8, v0

    .line 303
    const/4 v11, 0x0

    .line 304
    move-object v6, p0

    .line 305
    invoke-direct/range {v6 .. v11}, Lio/sentry/o2;->m(Lio/sentry/l2;Ljava/util/List;Lio/sentry/y3;Lio/sentry/k4;Lio/sentry/w1;)Lio/sentry/q2;

    .line 306
    .line 307
    .line 308
    move-result-object p2

    .line 309
    invoke-virtual {p3}, Lio/sentry/v;->b()V

    .line 310
    .line 311
    .line 312
    if-eqz p2, :cond_d

    .line 313
    .line 314
    iget-object v0, p0, Lio/sentry/o2;->c:Lio/sentry/transport/p;

    .line 315
    .line 316
    invoke-interface {v0, p2, p3}, Lio/sentry/transport/p;->D(Lio/sentry/q2;Lio/sentry/v;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lio/sentry/exception/b; {:try_start_0 .. :try_end_0} :catch_0

    .line 317
    .line 318
    .line 319
    goto :goto_5

    .line 320
    :goto_4
    iget-object p3, p0, Lio/sentry/o2;->b:Lio/sentry/o3;

    .line 321
    .line 322
    invoke-virtual {p3}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 323
    .line 324
    .line 325
    move-result-object p3

    .line 326
    sget-object v0, Lio/sentry/n3;->WARNING:Lio/sentry/n3;

    .line 327
    .line 328
    new-array v1, v2, [Ljava/lang/Object;

    .line 329
    .line 330
    aput-object p1, v1, v5

    .line 331
    .line 332
    const-string p1, "Capturing event %s failed."

    .line 333
    .line 334
    invoke-interface {p3, v0, p2, p1, v1}, Lio/sentry/g0;->a(Lio/sentry/n3;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 335
    .line 336
    .line 337
    sget-object p1, Lio/sentry/protocol/p;->l:Lio/sentry/protocol/p;

    .line 338
    .line 339
    :cond_d
    :goto_5
    return-object p1
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

.method public f(Lio/sentry/q2;Lio/sentry/v;)Lio/sentry/protocol/p;
    .locals 2

    .line 1
    const-string v0, "SentryEnvelope is required."

    .line 2
    .line 3
    invoke-static {p1, v0}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    if-nez p2, :cond_0

    .line 7
    .line 8
    new-instance p2, Lio/sentry/v;

    .line 9
    .line 10
    invoke-direct {p2}, Lio/sentry/v;-><init>()V

    .line 11
    .line 12
    .line 13
    :cond_0
    :try_start_0
    invoke-virtual {p2}, Lio/sentry/v;->b()V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lio/sentry/o2;->c:Lio/sentry/transport/p;

    .line 17
    .line 18
    invoke-interface {v0, p1, p2}, Lio/sentry/transport/p;->D(Lio/sentry/q2;Lio/sentry/v;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Lio/sentry/q2;->c()Lio/sentry/r2;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p1}, Lio/sentry/r2;->a()Lio/sentry/protocol/p;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    return-object p1

    .line 32
    :cond_1
    sget-object p1, Lio/sentry/protocol/p;->l:Lio/sentry/protocol/p;

    .line 33
    .line 34
    return-object p1

    .line 35
    :catch_0
    move-exception p1

    .line 36
    iget-object p2, p0, Lio/sentry/o2;->b:Lio/sentry/o3;

    .line 37
    .line 38
    invoke-virtual {p2}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    sget-object v0, Lio/sentry/n3;->ERROR:Lio/sentry/n3;

    .line 43
    .line 44
    const-string v1, "Failed to capture envelope."

    .line 45
    .line 46
    invoke-interface {p2, v0, v1, p1}, Lio/sentry/g0;->b(Lio/sentry/n3;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 47
    .line 48
    .line 49
    sget-object p1, Lio/sentry/protocol/p;->l:Lio/sentry/protocol/p;

    .line 50
    .line 51
    return-object p1
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
.end method

.method public synthetic g(Ljava/lang/String;Lio/sentry/n3;Lio/sentry/Scope;)Lio/sentry/protocol/p;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lio/sentry/i0;->b(Lio/sentry/j0;Ljava/lang/String;Lio/sentry/n3;Lio/sentry/Scope;)Lio/sentry/protocol/p;

    move-result-object p1

    return-object p1
.end method

.method z(Lio/sentry/j3;Lio/sentry/v;Lio/sentry/Scope;)Lio/sentry/y3;
    .locals 1

    .line 1
    invoke-static {p2}, Lio/sentry/util/h;->s(Lio/sentry/v;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    if-eqz p3, :cond_0

    .line 8
    .line 9
    new-instance v0, Lio/sentry/n2;

    .line 10
    .line 11
    invoke-direct {v0, p0, p1, p2}, Lio/sentry/n2;-><init>(Lio/sentry/o2;Lio/sentry/j3;Lio/sentry/v;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p3, v0}, Lio/sentry/Scope;->A(Lio/sentry/Scope$a;)Lio/sentry/y3;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-object p1, p0, Lio/sentry/o2;->b:Lio/sentry/o3;

    .line 20
    .line 21
    invoke-virtual {p1}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    sget-object p2, Lio/sentry/n3;->INFO:Lio/sentry/n3;

    .line 26
    .line 27
    const/4 p3, 0x0

    .line 28
    new-array p3, p3, [Ljava/lang/Object;

    .line 29
    .line 30
    const-string v0, "Scope is null on client.captureEvent"

    .line 31
    .line 32
    invoke-interface {p1, p2, v0, p3}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    :cond_1
    const/4 p1, 0x0

    .line 36
    :goto_0
    return-object p1
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
