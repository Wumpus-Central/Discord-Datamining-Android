.class Lnet/time4j/a0$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfj/u;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/time4j/a0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lfj/u<",
        "Lnet/time4j/a0;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lnet/time4j/a0$a;)V
    .locals 0

    invoke-direct {p0}, Lnet/time4j/a0$e;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lfj/f0;
    .locals 1

    sget-object v0, Lfj/f0;->a:Lfj/f0;

    return-object v0
.end method

.method public b(Lfj/q;Lfj/d;ZZ)Lnet/time4j/a0;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/q<",
            "*>;",
            "Lfj/d;",
            "ZZ)",
            "Lnet/time4j/a0;"
        }
    .end annotation

    .line 1
    sget-object v0, Lgj/a;->w:Lfj/c;

    .line 2
    .line 3
    sget-object v1, Lmj/f;->l:Lmj/f;

    .line 4
    .line 5
    invoke-interface {p2, v0, v1}, Lfj/d;->a(Lfj/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lmj/f;

    .line 10
    .line 11
    instance-of v1, p1, Lnet/time4j/base/f;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    const-class p2, Lnet/time4j/base/f;

    .line 16
    .line 17
    invoke-virtual {p2, p1}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, Lnet/time4j/base/f;

    .line 22
    .line 23
    invoke-static {p1}, Lnet/time4j/a0;->d0(Lnet/time4j/base/f;)Lnet/time4j/a0;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-static {p1, v0}, Lnet/time4j/a0;->R(Lnet/time4j/a0;Lmj/f;)Lnet/time4j/a0;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    return-object p1

    .line 32
    :cond_0
    sget-object v1, Lnet/time4j/a0$d;->k:Lnet/time4j/a0$d;

    .line 33
    .line 34
    invoke-virtual {p1, v1}, Lfj/q;->o(Lfj/p;)Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    const/4 v3, 0x0

    .line 39
    if-eqz v2, :cond_2

    .line 40
    .line 41
    invoke-virtual {p1, v1}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    check-cast p2, Ljava/lang/Long;

    .line 46
    .line 47
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 48
    .line 49
    .line 50
    move-result-wide p2

    .line 51
    sget-object p4, Lnet/time4j/a0$c;->k:Lnet/time4j/a0$c;

    .line 52
    .line 53
    invoke-virtual {p1, p4}, Lfj/q;->o(Lfj/p;)Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-eqz v1, :cond_1

    .line 58
    .line 59
    invoke-virtual {p1, p4}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    check-cast p1, Ljava/lang/Integer;

    .line 64
    .line 65
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    :cond_1
    sget-object p1, Lmj/f;->k:Lmj/f;

    .line 70
    .line 71
    invoke-static {p2, p3, v3, p1}, Lnet/time4j/a0;->o0(JILmj/f;)Lnet/time4j/a0;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-static {p1, v0}, Lnet/time4j/a0;->R(Lnet/time4j/a0;Lmj/f;)Lnet/time4j/a0;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    return-object p1

    .line 80
    :cond_2
    sget-object v1, Lfj/b0;->k:Lfj/b0;

    .line 81
    .line 82
    invoke-virtual {p1, v1}, Lfj/q;->o(Lfj/p;)Z

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    const/16 v2, 0x3c

    .line 87
    .line 88
    if-eqz v1, :cond_3

    .line 89
    .line 90
    sget-object v1, Lnet/time4j/g0;->I:Lnet/time4j/k0;

    .line 91
    .line 92
    invoke-virtual {p1, v1, v2}, Lfj/q;->B(Lfj/p;I)Lfj/q;

    .line 93
    .line 94
    .line 95
    const/4 v3, 0x1

    .line 96
    :cond_3
    invoke-static {}, Lnet/time4j/h0;->V()Lfj/h0;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-virtual {v1}, Lfj/h0;->J()Lfj/p;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-virtual {p1, v1}, Lfj/q;->o(Lfj/p;)Z

    .line 105
    .line 106
    .line 107
    move-result v4

    .line 108
    if-eqz v4, :cond_4

    .line 109
    .line 110
    invoke-virtual {p1, v1}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p4

    .line 114
    check-cast p4, Lnet/time4j/h0;

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_4
    invoke-static {}, Lnet/time4j/h0;->V()Lfj/h0;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    invoke-virtual {v1, p1, p2, p3, p4}, Lfj/h0;->F(Lfj/q;Lfj/d;ZZ)Lfj/k0;

    .line 122
    .line 123
    .line 124
    move-result-object p4

    .line 125
    check-cast p4, Lnet/time4j/h0;

    .line 126
    .line 127
    :goto_0
    const/4 v1, 0x0

    .line 128
    if-nez p4, :cond_5

    .line 129
    .line 130
    return-object v1

    .line 131
    :cond_5
    invoke-virtual {p1}, Lfj/q;->f()Z

    .line 132
    .line 133
    .line 134
    move-result v4

    .line 135
    if-eqz v4, :cond_6

    .line 136
    .line 137
    invoke-virtual {p1}, Lfj/q;->r()Lnet/time4j/tz/k;

    .line 138
    .line 139
    .line 140
    move-result-object v4

    .line 141
    goto :goto_1

    .line 142
    :cond_6
    sget-object v4, Lgj/a;->d:Lfj/c;

    .line 143
    .line 144
    invoke-interface {p2, v4}, Lfj/d;->b(Lfj/c;)Z

    .line 145
    .line 146
    .line 147
    move-result v5

    .line 148
    if-eqz v5, :cond_7

    .line 149
    .line 150
    invoke-interface {p2, v4}, Lfj/d;->c(Lfj/c;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v4

    .line 154
    check-cast v4, Lnet/time4j/tz/k;

    .line 155
    .line 156
    goto :goto_1

    .line 157
    :cond_7
    move-object v4, v1

    .line 158
    :goto_1
    if-eqz v4, :cond_b

    .line 159
    .line 160
    sget-object v5, Lfj/b0;->l:Lfj/b0;

    .line 161
    .line 162
    invoke-virtual {p1, v5}, Lfj/q;->o(Lfj/p;)Z

    .line 163
    .line 164
    .line 165
    move-result v6

    .line 166
    if-eqz v6, :cond_9

    .line 167
    .line 168
    invoke-virtual {p1, v5}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    check-cast p1, Ljava/lang/Boolean;

    .line 173
    .line 174
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 175
    .line 176
    .line 177
    move-result p1

    .line 178
    sget-object v5, Lgj/a;->e:Lfj/c;

    .line 179
    .line 180
    sget-object v6, Lnet/time4j/tz/l;->n:Lnet/time4j/tz/o;

    .line 181
    .line 182
    invoke-interface {p2, v5, v6}, Lfj/d;->a(Lfj/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object p2

    .line 186
    check-cast p2, Lnet/time4j/tz/o;

    .line 187
    .line 188
    if-eqz p1, :cond_8

    .line 189
    .line 190
    sget-object p1, Lnet/time4j/tz/g;->k:Lnet/time4j/tz/g;

    .line 191
    .line 192
    goto :goto_2

    .line 193
    :cond_8
    sget-object p1, Lnet/time4j/tz/g;->l:Lnet/time4j/tz/g;

    .line 194
    .line 195
    :goto_2
    invoke-interface {p2, p1}, Lnet/time4j/tz/o;->a(Lnet/time4j/tz/g;)Lnet/time4j/tz/o;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    invoke-static {v4}, Lnet/time4j/tz/l;->N(Lnet/time4j/tz/k;)Lnet/time4j/tz/l;

    .line 200
    .line 201
    .line 202
    move-result-object p2

    .line 203
    invoke-virtual {p2, p1}, Lnet/time4j/tz/l;->Q(Lnet/time4j/tz/o;)Lnet/time4j/tz/l;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    invoke-virtual {p4, p1}, Lnet/time4j/h0;->b0(Lnet/time4j/tz/l;)Lnet/time4j/a0;

    .line 208
    .line 209
    .line 210
    move-result-object p1

    .line 211
    goto :goto_3

    .line 212
    :cond_9
    sget-object p1, Lgj/a;->e:Lfj/c;

    .line 213
    .line 214
    invoke-interface {p2, p1}, Lfj/d;->b(Lfj/c;)Z

    .line 215
    .line 216
    .line 217
    move-result v5

    .line 218
    if-eqz v5, :cond_a

    .line 219
    .line 220
    invoke-interface {p2, p1}, Lfj/d;->c(Lfj/c;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object p1

    .line 224
    check-cast p1, Lnet/time4j/tz/o;

    .line 225
    .line 226
    invoke-static {v4}, Lnet/time4j/tz/l;->N(Lnet/time4j/tz/k;)Lnet/time4j/tz/l;

    .line 227
    .line 228
    .line 229
    move-result-object p2

    .line 230
    invoke-virtual {p2, p1}, Lnet/time4j/tz/l;->Q(Lnet/time4j/tz/o;)Lnet/time4j/tz/l;

    .line 231
    .line 232
    .line 233
    move-result-object p1

    .line 234
    invoke-virtual {p4, p1}, Lnet/time4j/h0;->b0(Lnet/time4j/tz/l;)Lnet/time4j/a0;

    .line 235
    .line 236
    .line 237
    move-result-object p1

    .line 238
    goto :goto_3

    .line 239
    :cond_a
    invoke-virtual {p4, v4}, Lnet/time4j/h0;->c0(Lnet/time4j/tz/k;)Lnet/time4j/a0;

    .line 240
    .line 241
    .line 242
    move-result-object p1

    .line 243
    goto :goto_3

    .line 244
    :cond_b
    move-object p1, v1

    .line 245
    :goto_3
    if-nez p1, :cond_c

    .line 246
    .line 247
    return-object v1

    .line 248
    :cond_c
    if-eqz v3, :cond_12

    .line 249
    .line 250
    instance-of p2, v4, Lnet/time4j/tz/p;

    .line 251
    .line 252
    if-eqz p2, :cond_d

    .line 253
    .line 254
    check-cast v4, Lnet/time4j/tz/p;

    .line 255
    .line 256
    goto :goto_4

    .line 257
    :cond_d
    invoke-static {v4}, Lnet/time4j/tz/l;->N(Lnet/time4j/tz/k;)Lnet/time4j/tz/l;

    .line 258
    .line 259
    .line 260
    move-result-object p2

    .line 261
    invoke-virtual {p2, p1}, Lnet/time4j/tz/l;->B(Lnet/time4j/base/f;)Lnet/time4j/tz/p;

    .line 262
    .line 263
    .line 264
    move-result-object v4

    .line 265
    :goto_4
    invoke-virtual {v4}, Lnet/time4j/tz/p;->k()I

    .line 266
    .line 267
    .line 268
    move-result p2

    .line 269
    if-nez p2, :cond_11

    .line 270
    .line 271
    invoke-virtual {v4}, Lnet/time4j/tz/p;->j()I

    .line 272
    .line 273
    .line 274
    move-result p2

    .line 275
    rem-int/2addr p2, v2

    .line 276
    if-nez p2, :cond_11

    .line 277
    .line 278
    invoke-static {p1}, Lnet/time4j/a0;->S(Lnet/time4j/a0;)Lnet/time4j/f0;

    .line 279
    .line 280
    .line 281
    move-result-object p2

    .line 282
    invoke-virtual {p2}, Lnet/time4j/f0;->i()I

    .line 283
    .line 284
    .line 285
    move-result p2

    .line 286
    const/16 p4, 0x7b4

    .line 287
    .line 288
    const-wide/16 v2, 0x1

    .line 289
    .line 290
    if-lt p2, p4, :cond_e

    .line 291
    .line 292
    sget-object p2, Lnet/time4j/n0;->k:Lnet/time4j/n0;

    .line 293
    .line 294
    invoke-virtual {p1, v2, v3, p2}, Lnet/time4j/a0;->q0(JLnet/time4j/n0;)Lnet/time4j/a0;

    .line 295
    .line 296
    .line 297
    move-result-object p2

    .line 298
    goto :goto_5

    .line 299
    :cond_e
    new-instance p2, Lnet/time4j/a0;

    .line 300
    .line 301
    invoke-virtual {p1}, Lnet/time4j/a0;->a()I

    .line 302
    .line 303
    .line 304
    move-result p4

    .line 305
    invoke-virtual {p1}, Lnet/time4j/a0;->u()J

    .line 306
    .line 307
    .line 308
    move-result-wide v4

    .line 309
    add-long/2addr v4, v2

    .line 310
    invoke-direct {p2, p4, v4, v5, v1}, Lnet/time4j/a0;-><init>(IJLnet/time4j/a0$a;)V

    .line 311
    .line 312
    .line 313
    :goto_5
    if-eqz p3, :cond_f

    .line 314
    .line 315
    goto :goto_6

    .line 316
    :cond_f
    invoke-static {}, Lmj/d;->x()Lmj/d;

    .line 317
    .line 318
    .line 319
    move-result-object p3

    .line 320
    invoke-virtual {p3}, Lmj/d;->C()Z

    .line 321
    .line 322
    .line 323
    move-result p3

    .line 324
    if-eqz p3, :cond_12

    .line 325
    .line 326
    invoke-static {p2}, Lnet/time4j/a0;->T(Lnet/time4j/a0;)Z

    .line 327
    .line 328
    .line 329
    move-result p1

    .line 330
    if-eqz p1, :cond_10

    .line 331
    .line 332
    :goto_6
    move-object p1, p2

    .line 333
    goto :goto_7

    .line 334
    :cond_10
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 335
    .line 336
    new-instance p3, Ljava/lang/StringBuilder;

    .line 337
    .line 338
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 339
    .line 340
    .line 341
    const-string p4, "SECOND_OF_MINUTE parsed as invalid leapsecond before "

    .line 342
    .line 343
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 344
    .line 345
    .line 346
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 347
    .line 348
    .line 349
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object p2

    .line 353
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 354
    .line 355
    .line 356
    throw p1

    .line 357
    :cond_11
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 358
    .line 359
    new-instance p2, Ljava/lang/StringBuilder;

    .line 360
    .line 361
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 362
    .line 363
    .line 364
    const-string p3, "Leap second is only allowed  with timezone-offset in full minutes: "

    .line 365
    .line 366
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 367
    .line 368
    .line 369
    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 370
    .line 371
    .line 372
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 373
    .line 374
    .line 375
    move-result-object p2

    .line 376
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 377
    .line 378
    .line 379
    throw p1

    .line 380
    :cond_12
    :goto_7
    invoke-static {p1, v0}, Lnet/time4j/a0;->R(Lnet/time4j/a0;Lmj/f;)Lnet/time4j/a0;

    .line 381
    .line 382
    .line 383
    move-result-object p1

    .line 384
    return-object p1
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
.end method

.method public bridge synthetic c(Lfj/q;Lfj/d;ZZ)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2, p3, p4}, Lnet/time4j/a0$e;->b(Lfj/q;Lfj/d;ZZ)Lnet/time4j/a0;

    move-result-object p1

    return-object p1
.end method

.method public d()Lfj/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lfj/x<",
            "*>;"
        }
    .end annotation

    invoke-static {}, Lnet/time4j/h0;->V()Lfj/h0;

    move-result-object v0

    return-object v0
.end method

.method public e(Lnet/time4j/a0;Lfj/d;)Lfj/o;
    .locals 3

    .line 1
    sget-object v0, Lgj/a;->d:Lfj/c;

    .line 2
    .line 3
    invoke-interface {p2, v0}, Lfj/d;->b(Lfj/c;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-interface {p2, v0}, Lfj/d;->c(Lfj/c;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lnet/time4j/tz/k;

    .line 14
    .line 15
    sget-object v1, Lgj/a;->w:Lfj/c;

    .line 16
    .line 17
    sget-object v2, Lmj/f;->l:Lmj/f;

    .line 18
    .line 19
    invoke-interface {p2, v1, v2}, Lfj/d;->a(Lfj/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    check-cast p2, Lmj/f;

    .line 24
    .line 25
    invoke-static {p1, p2}, Lnet/time4j/a0;->U(Lnet/time4j/a0;Lmj/f;)Lnet/time4j/a0;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {p1, v0}, Lnet/time4j/a0;->k0(Lnet/time4j/tz/k;)Lnet/time4j/b1;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    return-object p1

    .line 34
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 35
    .line 36
    const-string p2, "Cannot print moment without timezone."

    .line 37
    .line 38
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw p1
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
.end method

.method public g(Lfj/y;Ljava/util/Locale;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-interface {p1}, Lfj/y;->a()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-static {p1}, Lgj/e;->b(I)Lgj/e;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-static {p1, p1, p2}, Lgj/b;->s(Lgj/e;Lgj/e;Ljava/util/Locale;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
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

.method public j()I
    .locals 1

    invoke-static {}, Lnet/time4j/f0;->v0()Lfj/h0;

    move-result-object v0

    invoke-virtual {v0}, Lfj/x;->j()I

    move-result v0

    return v0
.end method

.method public bridge synthetic k(Ljava/lang/Object;Lfj/d;)Lfj/o;
    .locals 0

    check-cast p1, Lnet/time4j/a0;

    invoke-virtual {p0, p1, p2}, Lnet/time4j/a0$e;->e(Lnet/time4j/a0;Lfj/d;)Lfj/o;

    move-result-object p1

    return-object p1
.end method
