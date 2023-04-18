.class public final enum Lhj/w;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lhj/w;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum k:Lhj/w;

.field public static final enum l:Lhj/w;

.field public static final enum m:Lhj/w;

.field public static final enum n:Lhj/w;

.field public static final enum o:Lhj/w;

.field private static final synthetic p:[Lhj/w;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    new-instance v0, Lhj/w;

    .line 2
    .line 3
    const-string v1, "CLDR"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lhj/w;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lhj/w;->k:Lhj/w;

    .line 10
    .line 11
    new-instance v1, Lhj/w;

    .line 12
    .line 13
    const-string v3, "SIMPLE_DATE_FORMAT"

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    invoke-direct {v1, v3, v4}, Lhj/w;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lhj/w;->l:Lhj/w;

    .line 20
    .line 21
    new-instance v3, Lhj/w;

    .line 22
    .line 23
    const-string v5, "CLDR_24"

    .line 24
    .line 25
    const/4 v6, 0x2

    .line 26
    invoke-direct {v3, v5, v6}, Lhj/w;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v3, Lhj/w;->m:Lhj/w;

    .line 30
    .line 31
    new-instance v5, Lhj/w;

    .line 32
    .line 33
    const-string v7, "CLDR_DATE"

    .line 34
    .line 35
    const/4 v8, 0x3

    .line 36
    invoke-direct {v5, v7, v8}, Lhj/w;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v5, Lhj/w;->n:Lhj/w;

    .line 40
    .line 41
    new-instance v7, Lhj/w;

    .line 42
    .line 43
    const-string v9, "DYNAMIC"

    .line 44
    .line 45
    const/4 v10, 0x4

    .line 46
    invoke-direct {v7, v9, v10}, Lhj/w;-><init>(Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    sput-object v7, Lhj/w;->o:Lhj/w;

    .line 50
    .line 51
    const/4 v9, 0x5

    .line 52
    new-array v9, v9, [Lhj/w;

    .line 53
    .line 54
    aput-object v0, v9, v2

    .line 55
    .line 56
    aput-object v1, v9, v4

    .line 57
    .line 58
    aput-object v3, v9, v6

    .line 59
    .line 60
    aput-object v5, v9, v8

    .line 61
    .line 62
    aput-object v7, v9, v10

    .line 63
    .line 64
    sput-object v9, Lhj/w;->p:[Lhj/w;

    .line 65
    .line 66
    return-void
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

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private B(Lhj/c$d;Lfj/x;Ljava/util/Locale;CI)Ljava/util/Map;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhj/c$d<",
            "*>;",
            "Lfj/x<",
            "*>;",
            "Ljava/util/Locale;",
            "CI)",
            "Ljava/util/Map<",
            "Lfj/p<",
            "*>;",
            "Lfj/p<",
            "*>;>;"
        }
    .end annotation

    .line 1
    const/16 v0, 0x42

    .line 2
    .line 3
    if-eq p4, v0, :cond_4

    .line 4
    .line 5
    const/16 v0, 0x4f

    .line 6
    .line 7
    if-eq p4, v0, :cond_4

    .line 8
    .line 9
    const/16 v0, 0x51

    .line 10
    .line 11
    if-eq p4, v0, :cond_4

    .line 12
    .line 13
    const/16 v0, 0x53

    .line 14
    .line 15
    if-eq p4, v0, :cond_3

    .line 16
    .line 17
    const/16 v0, 0x5a

    .line 18
    .line 19
    if-eq p4, v0, :cond_2

    .line 20
    .line 21
    const/16 v0, 0x65

    .line 22
    .line 23
    if-eq p4, v0, :cond_4

    .line 24
    .line 25
    const/16 v0, 0x67

    .line 26
    .line 27
    if-eq p4, v0, :cond_4

    .line 28
    .line 29
    const/16 v0, 0x75

    .line 30
    .line 31
    if-eq p4, v0, :cond_1

    .line 32
    .line 33
    const/16 v0, 0x78

    .line 34
    .line 35
    if-eq p4, v0, :cond_4

    .line 36
    .line 37
    const/16 v0, 0x62

    .line 38
    .line 39
    if-eq p4, v0, :cond_4

    .line 40
    .line 41
    const/16 v0, 0x63

    .line 42
    .line 43
    if-eq p4, v0, :cond_4

    .line 44
    .line 45
    const/16 v0, 0x71

    .line 46
    .line 47
    if-eq p4, v0, :cond_4

    .line 48
    .line 49
    const/16 v0, 0x72

    .line 50
    .line 51
    if-eq p4, v0, :cond_4

    .line 52
    .line 53
    packed-switch p4, :pswitch_data_0

    .line 54
    .line 55
    .line 56
    const/4 v7, 0x1

    .line 57
    move-object v1, p0

    .line 58
    move-object v2, p1

    .line 59
    move-object v3, p2

    .line 60
    move-object v4, p3

    .line 61
    move v5, p4

    .line 62
    move v6, p5

    .line 63
    invoke-direct/range {v1 .. v7}, Lhj/w;->n(Lhj/c$d;Lfj/x;Ljava/util/Locale;CIZ)Ljava/util/Map;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    return-object p1

    .line 68
    :pswitch_0
    const/4 p4, 0x4

    .line 69
    if-ge p5, p4, :cond_0

    .line 70
    .line 71
    const/16 v4, 0x58

    .line 72
    .line 73
    const/4 v6, 0x1

    .line 74
    move-object v0, p0

    .line 75
    move-object v1, p1

    .line 76
    move-object v2, p2

    .line 77
    move-object v3, p3

    .line 78
    move v5, p5

    .line 79
    invoke-direct/range {v0 .. v6}, Lhj/w;->n(Lhj/c$d;Lfj/x;Ljava/util/Locale;CIZ)Ljava/util/Map;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    return-object p1

    .line 84
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 85
    .line 86
    new-instance p2, Ljava/lang/StringBuilder;

    .line 87
    .line 88
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 89
    .line 90
    .line 91
    const-string p3, "Too many pattern letters (X): "

    .line 92
    .line 93
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {p2, p5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p2

    .line 103
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    throw p1

    .line 107
    :pswitch_1
    invoke-static {p3}, Lnet/time4j/z0;->j(Ljava/util/Locale;)Lnet/time4j/z0;

    .line 108
    .line 109
    .line 110
    move-result-object p2

    .line 111
    invoke-virtual {p2}, Lnet/time4j/z0;->a()Lnet/time4j/c;

    .line 112
    .line 113
    .line 114
    move-result-object p2

    .line 115
    invoke-virtual {p1, p2, p5}, Lhj/c$d;->g(Lfj/p;I)Lhj/c$d;

    .line 116
    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_1
    sget-object p2, Lnet/time4j/f0;->F:Lnet/time4j/c0;

    .line 120
    .line 121
    invoke-virtual {p1, p2, p5}, Lhj/c$d;->h(Lfj/p;I)Lhj/c$d;

    .line 122
    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_2
    const/4 p2, 0x2

    .line 126
    const/4 p3, 0x0

    .line 127
    invoke-static {p1, p4, p2, p3}, Lhj/w;->h(Lhj/c$d;CIZ)V

    .line 128
    .line 129
    .line 130
    goto :goto_0

    .line 131
    :cond_3
    sget-object p2, Lnet/time4j/g0;->K:Lnet/time4j/k0;

    .line 132
    .line 133
    invoke-virtual {p1, p2, p5}, Lhj/c$d;->g(Lfj/p;I)Lhj/c$d;

    .line 134
    .line 135
    .line 136
    :goto_0
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    return-object p1

    .line 141
    :cond_4
    :pswitch_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 142
    .line 143
    new-instance p2, Ljava/lang/StringBuilder;

    .line 144
    .line 145
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 146
    .line 147
    .line 148
    const-string p3, "CLDR pattern symbol not supported in SimpleDateFormat-style: "

    .line 149
    .line 150
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object p2

    .line 160
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    throw p1

    .line 164
    nop

    .line 165
    :pswitch_data_0
    .packed-switch 0x55
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method private static a(Lhj/c$d;Lfj/p;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhj/c$d<",
            "*>;",
            "Lfj/p<",
            "+",
            "Ljava/lang/Enum;",
            ">;I)V"
        }
    .end annotation

    const/16 v0, 0x9

    invoke-virtual {p0, p1, p2, v0}, Lhj/c$d;->u(Lfj/p;II)Lhj/c$d;

    return-void
.end method

.method private static b(Lhj/c$d;Lfj/p;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhj/c$d<",
            "*>;",
            "Lfj/p<",
            "+",
            "Ljava/lang/Enum;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lhj/c$d;->z(Lfj/p;)Lhj/c$d;

    return-void
.end method

.method private static c(Lhj/c$d;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhj/c$d<",
            "*>;I)V"
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x2

    .line 3
    if-eq p1, v0, :cond_4

    .line 4
    .line 5
    if-eq p1, v1, :cond_3

    .line 6
    .line 7
    const/4 v0, 0x3

    .line 8
    if-eq p1, v0, :cond_2

    .line 9
    .line 10
    const/4 v0, 0x4

    .line 11
    if-eq p1, v0, :cond_1

    .line 12
    .line 13
    const/4 v0, 0x5

    .line 14
    if-ne p1, v0, :cond_0

    .line 15
    .line 16
    sget-object p1, Lgj/a;->g:Lfj/c;

    .line 17
    .line 18
    sget-object v0, Lgj/v;->n:Lgj/v;

    .line 19
    .line 20
    invoke-virtual {p0, p1, v0}, Lhj/c$d;->b0(Lfj/c;Ljava/lang/Enum;)Lhj/c$d;

    .line 21
    .line 22
    .line 23
    sget-object p1, Lnet/time4j/f0;->C:Lnet/time4j/c0;

    .line 24
    .line 25
    invoke-virtual {p0, p1}, Lhj/c$d;->z(Lfj/p;)Lhj/c$d;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Lhj/c$d;->L()Lhj/c$d;

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 33
    .line 34
    new-instance v0, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 37
    .line 38
    .line 39
    const-string v1, "Too many pattern letters for month: "

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw p0

    .line 55
    :cond_1
    sget-object p1, Lgj/a;->g:Lfj/c;

    .line 56
    .line 57
    sget-object v0, Lgj/v;->k:Lgj/v;

    .line 58
    .line 59
    invoke-virtual {p0, p1, v0}, Lhj/c$d;->b0(Lfj/c;Ljava/lang/Enum;)Lhj/c$d;

    .line 60
    .line 61
    .line 62
    sget-object p1, Lnet/time4j/f0;->C:Lnet/time4j/c0;

    .line 63
    .line 64
    invoke-virtual {p0, p1}, Lhj/c$d;->z(Lfj/p;)Lhj/c$d;

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0}, Lhj/c$d;->L()Lhj/c$d;

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_2
    sget-object p1, Lgj/a;->g:Lfj/c;

    .line 72
    .line 73
    sget-object v0, Lgj/v;->l:Lgj/v;

    .line 74
    .line 75
    invoke-virtual {p0, p1, v0}, Lhj/c$d;->b0(Lfj/c;Ljava/lang/Enum;)Lhj/c$d;

    .line 76
    .line 77
    .line 78
    sget-object p1, Lnet/time4j/f0;->C:Lnet/time4j/c0;

    .line 79
    .line 80
    invoke-virtual {p0, p1}, Lhj/c$d;->z(Lfj/p;)Lhj/c$d;

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0}, Lhj/c$d;->L()Lhj/c$d;

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_3
    sget-object p1, Lnet/time4j/f0;->D:Lnet/time4j/k0;

    .line 88
    .line 89
    invoke-virtual {p0, p1, v1}, Lhj/c$d;->g(Lfj/p;I)Lhj/c$d;

    .line 90
    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_4
    sget-object p1, Lnet/time4j/f0;->D:Lnet/time4j/k0;

    .line 94
    .line 95
    invoke-virtual {p0, p1, v0, v1}, Lhj/c$d;->j(Lfj/p;II)Lhj/c$d;

    .line 96
    .line 97
    .line 98
    :goto_0
    return-void
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

.method private static e(Lhj/c$d;ILgj/t;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Enum<",
            "TV;>;>(",
            "Lhj/c$d<",
            "*>;I",
            "Lgj/t<",
            "*>;)V"
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x2

    .line 3
    if-eq p1, v0, :cond_3

    .line 4
    .line 5
    if-eq p1, v1, :cond_3

    .line 6
    .line 7
    const/4 v0, 0x3

    .line 8
    if-eq p1, v0, :cond_2

    .line 9
    .line 10
    const/4 v0, 0x4

    .line 11
    if-eq p1, v0, :cond_1

    .line 12
    .line 13
    const/4 v0, 0x5

    .line 14
    if-ne p1, v0, :cond_0

    .line 15
    .line 16
    sget-object p1, Lgj/a;->g:Lfj/c;

    .line 17
    .line 18
    sget-object v0, Lgj/v;->n:Lgj/v;

    .line 19
    .line 20
    invoke-virtual {p0, p1, v0}, Lhj/c$d;->b0(Lfj/c;Ljava/lang/Enum;)Lhj/c$d;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, p2}, Lhj/c$d;->A(Lgj/t;)Lhj/c$d;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lhj/c$d;->L()Lhj/c$d;

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 31
    .line 32
    new-instance p2, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 35
    .line 36
    .line 37
    const-string v0, "Too many pattern letters for month: "

    .line 38
    .line 39
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw p0

    .line 53
    :cond_1
    sget-object p1, Lgj/a;->g:Lfj/c;

    .line 54
    .line 55
    sget-object v0, Lgj/v;->k:Lgj/v;

    .line 56
    .line 57
    invoke-virtual {p0, p1, v0}, Lhj/c$d;->b0(Lfj/c;Ljava/lang/Enum;)Lhj/c$d;

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0, p2}, Lhj/c$d;->A(Lgj/t;)Lhj/c$d;

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0}, Lhj/c$d;->L()Lhj/c$d;

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_2
    sget-object p1, Lgj/a;->g:Lfj/c;

    .line 68
    .line 69
    sget-object v0, Lgj/v;->l:Lgj/v;

    .line 70
    .line 71
    invoke-virtual {p0, p1, v0}, Lhj/c$d;->b0(Lfj/c;Ljava/lang/Enum;)Lhj/c$d;

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0, p2}, Lhj/c$d;->A(Lgj/t;)Lhj/c$d;

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0}, Lhj/c$d;->L()Lhj/c$d;

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_3
    invoke-interface {p2}, Lfj/p;->getType()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    const-class v3, Ljava/lang/Enum;

    .line 86
    .line 87
    invoke-virtual {v3, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    if-eqz v2, :cond_5

    .line 92
    .line 93
    invoke-static {p2}, Lhj/w;->k(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    check-cast p2, Lfj/p;

    .line 98
    .line 99
    if-ne p1, v0, :cond_4

    .line 100
    .line 101
    invoke-virtual {p0, p2, v0, v1}, Lhj/c$d;->u(Lfj/p;II)Lhj/c$d;

    .line 102
    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_4
    if-ne p1, v1, :cond_6

    .line 106
    .line 107
    invoke-virtual {p0, p2, v1}, Lhj/c$d;->h(Lfj/p;I)Lhj/c$d;

    .line 108
    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_5
    sget-object v0, Lij/a;->b:Lfj/c;

    .line 112
    .line 113
    invoke-virtual {p0, v0, p1}, Lhj/c$d;->a0(Lfj/c;I)Lhj/c$d;

    .line 114
    .line 115
    .line 116
    invoke-virtual {p0, p2}, Lhj/c$d;->A(Lgj/t;)Lhj/c$d;

    .line 117
    .line 118
    .line 119
    invoke-virtual {p0}, Lhj/c$d;->L()Lhj/c$d;

    .line 120
    .line 121
    .line 122
    :cond_6
    :goto_0
    return-void
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
.end method

.method private static f(Lfj/p;CLhj/c$d;IZ)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/p<",
            "Ljava/lang/Integer;",
            ">;C",
            "Lhj/c$d<",
            "*>;IZ)V"
        }
    .end annotation

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x1

    .line 3
    if-ne p3, v1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p2, p0, v1, v0}, Lhj/c$d;->j(Lfj/p;II)Lhj/c$d;

    .line 6
    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_0
    if-eq p3, v0, :cond_2

    .line 10
    .line 11
    if-eqz p4, :cond_1

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 15
    .line 16
    new-instance p2, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    const-string p4, "Too many pattern letters ("

    .line 22
    .line 23
    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string p1, "): "

    .line 30
    .line 31
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw p0

    .line 45
    :cond_2
    :goto_0
    invoke-virtual {p2, p0, p3}, Lhj/c$d;->g(Lfj/p;I)Lhj/c$d;

    .line 46
    .line 47
    .line 48
    :goto_1
    return-void
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

.method private static h(Lhj/c$d;CIZ)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhj/c$d<",
            "*>;CIZ)V"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    const-string v2, "Z"

    .line 4
    .line 5
    if-eq p2, v1, :cond_8

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    const-string v4, "+0000"

    .line 9
    .line 10
    if-eq p2, v3, :cond_6

    .line 11
    .line 12
    const/4 v3, 0x3

    .line 13
    const-string v5, "+00:00"

    .line 14
    .line 15
    if-eq p2, v3, :cond_4

    .line 16
    .line 17
    const/4 v3, 0x4

    .line 18
    if-eq p2, v3, :cond_2

    .line 19
    .line 20
    const/4 v0, 0x5

    .line 21
    if-ne p2, v0, :cond_1

    .line 22
    .line 23
    sget-object p1, Lgj/e;->m:Lgj/e;

    .line 24
    .line 25
    if-eqz p3, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move-object v2, v5

    .line 29
    :goto_0
    invoke-static {v2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    invoke-virtual {p0, p1, v1, p2}, Lhj/c$d;->C(Lgj/e;ZLjava/util/List;)Lhj/c$d;

    .line 34
    .line 35
    .line 36
    goto :goto_5

    .line 37
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 38
    .line 39
    new-instance p3, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 42
    .line 43
    .line 44
    const-string v0, "Too many pattern letters ("

    .line 45
    .line 46
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string p1, "): "

    .line 53
    .line 54
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw p0

    .line 68
    :cond_2
    sget-object p1, Lgj/e;->m:Lgj/e;

    .line 69
    .line 70
    if-eqz p3, :cond_3

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_3
    move-object v2, v4

    .line 74
    :goto_1
    invoke-static {v2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    invoke-virtual {p0, p1, v0, p2}, Lhj/c$d;->C(Lgj/e;ZLjava/util/List;)Lhj/c$d;

    .line 79
    .line 80
    .line 81
    goto :goto_5

    .line 82
    :cond_4
    sget-object p1, Lgj/e;->n:Lgj/e;

    .line 83
    .line 84
    if-eqz p3, :cond_5

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_5
    move-object v2, v5

    .line 88
    :goto_2
    invoke-static {v2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 89
    .line 90
    .line 91
    move-result-object p2

    .line 92
    invoke-virtual {p0, p1, v1, p2}, Lhj/c$d;->C(Lgj/e;ZLjava/util/List;)Lhj/c$d;

    .line 93
    .line 94
    .line 95
    goto :goto_5

    .line 96
    :cond_6
    sget-object p1, Lgj/e;->n:Lgj/e;

    .line 97
    .line 98
    if-eqz p3, :cond_7

    .line 99
    .line 100
    goto :goto_3

    .line 101
    :cond_7
    move-object v2, v4

    .line 102
    :goto_3
    invoke-static {v2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 103
    .line 104
    .line 105
    move-result-object p2

    .line 106
    invoke-virtual {p0, p1, v0, p2}, Lhj/c$d;->C(Lgj/e;ZLjava/util/List;)Lhj/c$d;

    .line 107
    .line 108
    .line 109
    goto :goto_5

    .line 110
    :cond_8
    sget-object p1, Lgj/e;->o:Lgj/e;

    .line 111
    .line 112
    if-eqz p3, :cond_9

    .line 113
    .line 114
    goto :goto_4

    .line 115
    :cond_9
    const-string v2, "+00"

    .line 116
    .line 117
    :goto_4
    invoke-static {v2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 118
    .line 119
    .line 120
    move-result-object p2

    .line 121
    invoke-virtual {p0, p1, v0, p2}, Lhj/c$d;->C(Lgj/e;ZLjava/util/List;)Lhj/c$d;

    .line 122
    .line 123
    .line 124
    :goto_5
    return-void
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
.end method

.method private static i(Lhj/c$d;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhj/c$d<",
            "*>;I)V"
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eq p1, v0, :cond_3

    .line 3
    .line 4
    const/4 v0, 0x2

    .line 5
    if-eq p1, v0, :cond_3

    .line 6
    .line 7
    const/4 v0, 0x3

    .line 8
    if-eq p1, v0, :cond_2

    .line 9
    .line 10
    const/4 v0, 0x4

    .line 11
    if-eq p1, v0, :cond_1

    .line 12
    .line 13
    const/4 v0, 0x5

    .line 14
    if-ne p1, v0, :cond_0

    .line 15
    .line 16
    sget-object p1, Lgj/a;->g:Lfj/c;

    .line 17
    .line 18
    sget-object v0, Lgj/v;->n:Lgj/v;

    .line 19
    .line 20
    invoke-virtual {p0, p1, v0}, Lhj/c$d;->b0(Lfj/c;Ljava/lang/Enum;)Lhj/c$d;

    .line 21
    .line 22
    .line 23
    sget-object p1, Lnet/time4j/f0;->B:Lnet/time4j/c0;

    .line 24
    .line 25
    invoke-virtual {p0, p1}, Lhj/c$d;->z(Lfj/p;)Lhj/c$d;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Lhj/c$d;->L()Lhj/c$d;

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 33
    .line 34
    new-instance v0, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 37
    .line 38
    .line 39
    const-string v1, "Too many pattern letters for quarter-of-year: "

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw p0

    .line 55
    :cond_1
    sget-object p1, Lgj/a;->g:Lfj/c;

    .line 56
    .line 57
    sget-object v0, Lgj/v;->k:Lgj/v;

    .line 58
    .line 59
    invoke-virtual {p0, p1, v0}, Lhj/c$d;->b0(Lfj/c;Ljava/lang/Enum;)Lhj/c$d;

    .line 60
    .line 61
    .line 62
    sget-object p1, Lnet/time4j/f0;->B:Lnet/time4j/c0;

    .line 63
    .line 64
    invoke-virtual {p0, p1}, Lhj/c$d;->z(Lfj/p;)Lhj/c$d;

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0}, Lhj/c$d;->L()Lhj/c$d;

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_2
    sget-object p1, Lgj/a;->g:Lfj/c;

    .line 72
    .line 73
    sget-object v0, Lgj/v;->l:Lgj/v;

    .line 74
    .line 75
    invoke-virtual {p0, p1, v0}, Lhj/c$d;->b0(Lfj/c;Ljava/lang/Enum;)Lhj/c$d;

    .line 76
    .line 77
    .line 78
    sget-object p1, Lnet/time4j/f0;->B:Lnet/time4j/c0;

    .line 79
    .line 80
    invoke-virtual {p0, p1}, Lhj/c$d;->z(Lfj/p;)Lhj/c$d;

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0}, Lhj/c$d;->L()Lhj/c$d;

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_3
    sget-object v0, Lnet/time4j/f0;->B:Lnet/time4j/c0;

    .line 88
    .line 89
    invoke-virtual {p0, v0, p1}, Lhj/c$d;->h(Lfj/p;I)Lhj/c$d;

    .line 90
    .line 91
    .line 92
    :goto_0
    return-void
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

.method private static j(I)I
    .locals 2

    const/16 v0, 0x41

    if-lt p0, v0, :cond_0

    const/16 v1, 0x5a

    if-gt p0, v1, :cond_0

    return p0

    :cond_0
    add-int/2addr p0, v0

    add-int/lit8 p0, p0, -0x61

    return p0
.end method

.method private static k(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            ")TT;"
        }
    .end annotation

    return-object p0
.end method

.method private l(Lhj/c$d;Ljava/util/Locale;CI)Ljava/util/Map;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhj/c$d<",
            "*>;",
            "Ljava/util/Locale;",
            "CI)",
            "Ljava/util/Map<",
            "Lfj/p<",
            "*>;",
            "Lfj/p<",
            "*>;>;"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lhj/w;->v(Lhj/c$d;)Lfj/x;

    .line 2
    .line 3
    .line 4
    move-result-object v2

    .line 5
    invoke-static {p3}, Lhj/w;->y(C)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-static {v2}, Lhj/w;->z(Lfj/x;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    move-object v0, p0

    .line 18
    move-object v1, p1

    .line 19
    move v3, p3

    .line 20
    move v4, p4

    .line 21
    move-object v5, p2

    .line 22
    invoke-direct/range {v0 .. v5}, Lhj/w;->t(Lhj/c$d;Lfj/x;CILjava/util/Locale;)Ljava/util/Map;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1

    .line 27
    :cond_0
    const/16 v0, 0x68

    .line 28
    .line 29
    if-ne p3, v0, :cond_2

    .line 30
    .line 31
    invoke-static {v2}, Lhj/w;->u(Lfj/x;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const-string v1, "ethiopic"

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    invoke-static {v2}, Lhj/w;->s(Lfj/x;)Lfj/p;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    if-eqz p2, :cond_1

    .line 48
    .line 49
    const/4 v0, 0x0

    .line 50
    invoke-static {p2, p3, p1, p4, v0}, Lhj/w;->f(Lfj/p;CLhj/c$d;IZ)V

    .line 51
    .line 52
    .line 53
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    return-object p1

    .line 58
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 59
    .line 60
    const-string p2, "Ethiopian time not available."

    .line 61
    .line 62
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    throw p1

    .line 66
    :cond_2
    const/4 v6, 0x0

    .line 67
    move-object v0, p0

    .line 68
    move-object v1, p1

    .line 69
    move-object v3, p2

    .line 70
    move v4, p3

    .line 71
    move v5, p4

    .line 72
    invoke-direct/range {v0 .. v6}, Lhj/w;->n(Lhj/c$d;Lfj/x;Ljava/util/Locale;CIZ)Ljava/util/Map;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    return-object p1
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
.end method

.method private m(Lhj/c$d;Ljava/util/Locale;CI)Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhj/c$d<",
            "*>;",
            "Ljava/util/Locale;",
            "CI)",
            "Ljava/util/Map<",
            "Lfj/p<",
            "*>;",
            "Lfj/p<",
            "*>;>;"
        }
    .end annotation

    .line 1
    const/16 v0, 0x48

    .line 2
    .line 3
    if-ne p3, v0, :cond_0

    .line 4
    .line 5
    sget-object p2, Lnet/time4j/g0;->F:Lnet/time4j/k0;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-static {p2, p3, p1, p4, v0}, Lhj/w;->f(Lfj/p;CLhj/c$d;IZ)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1

    .line 16
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lhj/w;->l(Lhj/c$d;Ljava/util/Locale;CI)Ljava/util/Map;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
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
.end method

.method private n(Lhj/c$d;Lfj/x;Ljava/util/Locale;CIZ)Ljava/util/Map;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhj/c$d<",
            "*>;",
            "Lfj/x<",
            "*>;",
            "Ljava/util/Locale;",
            "CIZ)",
            "Ljava/util/Map<",
            "Lfj/p<",
            "*>;",
            "Lfj/p<",
            "*>;>;"
        }
    .end annotation

    .line 1
    move-object v0, p1

    .line 2
    move v1, p4

    .line 3
    move v6, p5

    .line 4
    move/from16 v7, p6

    .line 5
    .line 6
    const/4 v2, 0x5

    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x3

    .line 9
    const/4 v5, 0x2

    .line 10
    const/4 v8, 0x4

    .line 11
    const/4 v9, 0x1

    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    :pswitch_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 16
    .line 17
    new-instance v2, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    .line 22
    const-string v3, "Unsupported pattern symbol: "

    .line 23
    .line 24
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw v0

    .line 38
    :pswitch_1
    if-ge v6, v8, :cond_0

    .line 39
    .line 40
    :try_start_0
    invoke-virtual {p1}, Lhj/c$d;->y()Lhj/c$d;

    .line 41
    .line 42
    .line 43
    goto/16 :goto_c

    .line 44
    .line 45
    :catch_0
    move-exception v0

    .line 46
    goto :goto_1

    .line 47
    :cond_0
    if-eq v6, v8, :cond_2

    .line 48
    .line 49
    if-eqz v7, :cond_1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 53
    .line 54
    new-instance v1, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 57
    .line 58
    .line 59
    const-string v2, "Too many pattern letters (z): "

    .line 60
    .line 61
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1, p5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    throw v0

    .line 75
    :cond_2
    :goto_0
    invoke-virtual {p1}, Lhj/c$d;->r()Lhj/c$d;
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 76
    .line 77
    .line 78
    goto/16 :goto_c

    .line 79
    .line 80
    :goto_1
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 81
    .line 82
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    throw v1

    .line 90
    :pswitch_2
    if-ne v6, v5, :cond_3

    .line 91
    .line 92
    sget-object v1, Lnet/time4j/f0;->z:Lnet/time4j/c;

    .line 93
    .line 94
    invoke-virtual {p1, v1}, Lhj/c$d;->D(Lfj/p;)Lhj/c$d;

    .line 95
    .line 96
    .line 97
    goto/16 :goto_c

    .line 98
    .line 99
    :cond_3
    sget-object v1, Lnet/time4j/f0;->z:Lnet/time4j/c;

    .line 100
    .line 101
    invoke-virtual {p1, v1, p5, v3}, Lhj/c$d;->E(Lfj/p;IZ)Lhj/c$d;

    .line 102
    .line 103
    .line 104
    goto/16 :goto_c

    .line 105
    .line 106
    :pswitch_3
    invoke-static {p1, p4, p5, v3}, Lhj/w;->h(Lhj/c$d;CIZ)V

    .line 107
    .line 108
    .line 109
    goto/16 :goto_c

    .line 110
    .line 111
    :pswitch_4
    if-gt v6, v5, :cond_6

    .line 112
    .line 113
    invoke-static {p3}, Lnet/time4j/z0;->j(Ljava/util/Locale;)Lnet/time4j/z0;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    invoke-virtual {v2}, Lnet/time4j/z0;->n()Lnet/time4j/c;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    invoke-virtual {p2}, Lfj/x;->u()Ljava/util/Set;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    :cond_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 130
    .line 131
    .line 132
    move-result v4

    .line 133
    if-eqz v4, :cond_5

    .line 134
    .line 135
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v4

    .line 139
    check-cast v4, Lfj/p;

    .line 140
    .line 141
    invoke-interface {v4}, Lfj/p;->b()C

    .line 142
    .line 143
    .line 144
    move-result v5

    .line 145
    if-ne v5, v1, :cond_4

    .line 146
    .line 147
    sget-object v5, Lnet/time4j/z0;->w:Lnet/time4j/z0;

    .line 148
    .line 149
    invoke-virtual {v5}, Lnet/time4j/z0;->n()Lnet/time4j/c;

    .line 150
    .line 151
    .line 152
    move-result-object v8

    .line 153
    invoke-virtual {v4, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v4

    .line 157
    if-eqz v4, :cond_4

    .line 158
    .line 159
    invoke-virtual {v5}, Lnet/time4j/z0;->n()Lnet/time4j/c;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    :cond_5
    invoke-static {v2, p4, p1, p5, v7}, Lhj/w;->f(Lfj/p;CLhj/c$d;IZ)V

    .line 164
    .line 165
    .line 166
    goto/16 :goto_c

    .line 167
    .line 168
    :cond_6
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 169
    .line 170
    new-instance v1, Ljava/lang/StringBuilder;

    .line 171
    .line 172
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 173
    .line 174
    .line 175
    const-string v2, "Too many pattern letters (w): "

    .line 176
    .line 177
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v1, p5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    throw v0

    .line 191
    :pswitch_5
    sget-object v1, Lnet/time4j/f0;->z:Lnet/time4j/c;

    .line 192
    .line 193
    invoke-virtual {p1, v1, p5, v9}, Lhj/c$d;->E(Lfj/p;IZ)Lhj/c$d;

    .line 194
    .line 195
    .line 196
    goto/16 :goto_c

    .line 197
    .line 198
    :pswitch_6
    sget-object v2, Lnet/time4j/g0;->I:Lnet/time4j/k0;

    .line 199
    .line 200
    invoke-static {v2, p4, p1, p5, v7}, Lhj/w;->f(Lfj/p;CLhj/c$d;IZ)V

    .line 201
    .line 202
    .line 203
    goto/16 :goto_c

    .line 204
    .line 205
    :pswitch_7
    sget-object v1, Lgj/a;->l:Lfj/c;

    .line 206
    .line 207
    sget-object v2, Lgj/j;->k:Lgj/j;

    .line 208
    .line 209
    invoke-virtual {p1, v1, v2}, Lhj/c$d;->b0(Lfj/c;Ljava/lang/Enum;)Lhj/c$d;

    .line 210
    .line 211
    .line 212
    sget-object v1, Lgj/a;->m:Lfj/c;

    .line 213
    .line 214
    const/16 v2, 0x30

    .line 215
    .line 216
    invoke-virtual {p1, v1, v2}, Lhj/c$d;->Z(Lfj/c;C)Lhj/c$d;

    .line 217
    .line 218
    .line 219
    sget-object v1, Lnet/time4j/f0;->z:Lnet/time4j/c;

    .line 220
    .line 221
    invoke-virtual {p1, v1, p5, v9}, Lhj/c$d;->E(Lfj/p;IZ)Lhj/c$d;

    .line 222
    .line 223
    .line 224
    invoke-virtual {p1}, Lhj/c$d;->L()Lhj/c$d;

    .line 225
    .line 226
    .line 227
    invoke-virtual {p1}, Lhj/c$d;->L()Lhj/c$d;

    .line 228
    .line 229
    .line 230
    goto/16 :goto_c

    .line 231
    .line 232
    :pswitch_8
    sget-object v1, Lgj/a;->h:Lfj/c;

    .line 233
    .line 234
    sget-object v2, Lgj/m;->l:Lgj/m;

    .line 235
    .line 236
    invoke-virtual {p1, v1, v2}, Lhj/c$d;->b0(Lfj/c;Ljava/lang/Enum;)Lhj/c$d;

    .line 237
    .line 238
    .line 239
    invoke-static {p1, p5}, Lhj/w;->i(Lhj/c$d;I)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {p1}, Lhj/c$d;->L()Lhj/c$d;

    .line 243
    .line 244
    .line 245
    goto/16 :goto_c

    .line 246
    .line 247
    :pswitch_9
    sget-object v2, Lnet/time4j/g0;->G:Lnet/time4j/k0;

    .line 248
    .line 249
    invoke-static {v2, p4, p1, p5, v7}, Lhj/w;->f(Lfj/p;CLhj/c$d;IZ)V

    .line 250
    .line 251
    .line 252
    goto/16 :goto_c

    .line 253
    .line 254
    :pswitch_a
    sget-object v2, Lnet/time4j/g0;->C:Lnet/time4j/c;

    .line 255
    .line 256
    invoke-static {v2, p4, p1, p5, v7}, Lhj/w;->f(Lfj/p;CLhj/c$d;IZ)V

    .line 257
    .line 258
    .line 259
    goto/16 :goto_c

    .line 260
    .line 261
    :pswitch_b
    sget-object v2, Lnet/time4j/g0;->B:Lnet/time4j/c;

    .line 262
    .line 263
    invoke-static {v2, p4, p1, p5, v7}, Lhj/w;->f(Lfj/p;CLhj/c$d;IZ)V

    .line 264
    .line 265
    .line 266
    goto/16 :goto_c

    .line 267
    .line 268
    :pswitch_c
    sget-object v1, Lfj/a0;->m:Lfj/a0;

    .line 269
    .line 270
    const/16 v2, 0x12

    .line 271
    .line 272
    sget-object v3, Lhj/x;->l:Lhj/x;

    .line 273
    .line 274
    invoke-virtual {p1, v1, p5, v2, v3}, Lhj/c$d;->q(Lfj/p;IILhj/x;)Lhj/c$d;

    .line 275
    .line 276
    .line 277
    goto/16 :goto_c

    .line 278
    .line 279
    :pswitch_d
    if-gt v6, v5, :cond_7

    .line 280
    .line 281
    invoke-static {p3}, Lnet/time4j/z0;->j(Ljava/util/Locale;)Lnet/time4j/z0;

    .line 282
    .line 283
    .line 284
    move-result-object v1

    .line 285
    invoke-virtual {v1}, Lnet/time4j/z0;->i()Lnet/time4j/c0;

    .line 286
    .line 287
    .line 288
    move-result-object v1

    .line 289
    invoke-virtual {p1, v1, p5}, Lhj/c$d;->h(Lfj/p;I)Lhj/c$d;

    .line 290
    .line 291
    .line 292
    goto/16 :goto_c

    .line 293
    .line 294
    :cond_7
    const/16 v5, 0x45

    .line 295
    .line 296
    move-object v1, p0

    .line 297
    move-object v2, p1

    .line 298
    move-object v3, p2

    .line 299
    move-object v4, p3

    .line 300
    move v6, p5

    .line 301
    move/from16 v7, p6

    .line 302
    .line 303
    invoke-direct/range {v1 .. v7}, Lhj/w;->n(Lhj/c$d;Lfj/x;Ljava/util/Locale;CIZ)Ljava/util/Map;

    .line 304
    .line 305
    .line 306
    goto/16 :goto_c

    .line 307
    .line 308
    :pswitch_e
    sget-object v2, Lnet/time4j/f0;->E:Lnet/time4j/k0;

    .line 309
    .line 310
    invoke-static {v2, p4, p1, p5, v7}, Lhj/w;->f(Lfj/p;CLhj/c$d;IZ)V

    .line 311
    .line 312
    .line 313
    goto/16 :goto_c

    .line 314
    .line 315
    :pswitch_f
    if-eq v6, v5, :cond_9

    .line 316
    .line 317
    sget-object v1, Lgj/a;->h:Lfj/c;

    .line 318
    .line 319
    sget-object v2, Lgj/m;->l:Lgj/m;

    .line 320
    .line 321
    invoke-virtual {p1, v1, v2}, Lhj/c$d;->b0(Lfj/c;Ljava/lang/Enum;)Lhj/c$d;

    .line 322
    .line 323
    .line 324
    if-ne v6, v9, :cond_8

    .line 325
    .line 326
    invoke-static {p3}, Lnet/time4j/z0;->j(Ljava/util/Locale;)Lnet/time4j/z0;

    .line 327
    .line 328
    .line 329
    move-result-object v1

    .line 330
    invoke-virtual {v1}, Lnet/time4j/z0;->i()Lnet/time4j/c0;

    .line 331
    .line 332
    .line 333
    move-result-object v1

    .line 334
    invoke-virtual {p1, v1, v9}, Lhj/c$d;->h(Lfj/p;I)Lhj/c$d;

    .line 335
    .line 336
    .line 337
    goto :goto_2

    .line 338
    :cond_8
    const/16 v5, 0x45

    .line 339
    .line 340
    move-object v1, p0

    .line 341
    move-object v2, p1

    .line 342
    move-object v3, p2

    .line 343
    move-object v4, p3

    .line 344
    move v6, p5

    .line 345
    move/from16 v7, p6

    .line 346
    .line 347
    invoke-direct/range {v1 .. v7}, Lhj/w;->n(Lhj/c$d;Lfj/x;Ljava/util/Locale;CIZ)Ljava/util/Map;

    .line 348
    .line 349
    .line 350
    :goto_2
    invoke-virtual {p1}, Lhj/c$d;->L()Lhj/c$d;

    .line 351
    .line 352
    .line 353
    goto/16 :goto_c

    .line 354
    .line 355
    :cond_9
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 356
    .line 357
    const-string v1, "Invalid pattern count of 2 for symbol \'c\'."

    .line 358
    .line 359
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 360
    .line 361
    .line 362
    throw v0

    .line 363
    :pswitch_10
    invoke-static {p5}, Lhj/w;->x(I)Lgj/v;

    .line 364
    .line 365
    .line 366
    move-result-object v1

    .line 367
    sget-object v2, Lgj/a;->g:Lfj/c;

    .line 368
    .line 369
    invoke-virtual {p1, v2, v1}, Lhj/c$d;->b0(Lfj/c;Ljava/lang/Enum;)Lhj/c$d;

    .line 370
    .line 371
    .line 372
    invoke-virtual {p1}, Lhj/c$d;->f()Lhj/c$d;

    .line 373
    .line 374
    .line 375
    invoke-virtual {p1}, Lhj/c$d;->L()Lhj/c$d;

    .line 376
    .line 377
    .line 378
    goto/16 :goto_c

    .line 379
    .line 380
    :pswitch_11
    if-eqz v7, :cond_a

    .line 381
    .line 382
    sget-object v1, Lgj/v;->l:Lgj/v;

    .line 383
    .line 384
    goto :goto_3

    .line 385
    :cond_a
    invoke-static {p5}, Lhj/w;->x(I)Lgj/v;

    .line 386
    .line 387
    .line 388
    move-result-object v1

    .line 389
    :goto_3
    sget-object v2, Lgj/a;->g:Lfj/c;

    .line 390
    .line 391
    invoke-virtual {p1, v2, v1}, Lhj/c$d;->b0(Lfj/c;Ljava/lang/Enum;)Lhj/c$d;

    .line 392
    .line 393
    .line 394
    sget-object v1, Lnet/time4j/g0;->A:Lnet/time4j/c1;

    .line 395
    .line 396
    invoke-virtual {p1, v1}, Lhj/c$d;->z(Lfj/p;)Lhj/c$d;

    .line 397
    .line 398
    .line 399
    invoke-virtual {p1}, Lhj/c$d;->L()Lhj/c$d;

    .line 400
    .line 401
    .line 402
    invoke-static {p2}, Lhj/w;->u(Lfj/x;)Ljava/lang/String;

    .line 403
    .line 404
    .line 405
    move-result-object v0

    .line 406
    const-string v1, "ethiopic"

    .line 407
    .line 408
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 409
    .line 410
    .line 411
    move-result v0

    .line 412
    if-eqz v0, :cond_24

    .line 413
    .line 414
    invoke-static {p2}, Lhj/w;->s(Lfj/x;)Lfj/p;

    .line 415
    .line 416
    .line 417
    move-result-object v0

    .line 418
    if-eqz v0, :cond_b

    .line 419
    .line 420
    new-instance v1, Ljava/util/HashMap;

    .line 421
    .line 422
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 423
    .line 424
    .line 425
    sget-object v2, Lnet/time4j/g0;->B:Lnet/time4j/c;

    .line 426
    .line 427
    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 428
    .line 429
    .line 430
    return-object v1

    .line 431
    :cond_b
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 432
    .line 433
    const-string v1, "Ethiopian time not available."

    .line 434
    .line 435
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 436
    .line 437
    .line 438
    throw v0

    .line 439
    :pswitch_12
    if-ge v6, v8, :cond_c

    .line 440
    .line 441
    sget-object v1, Lgj/e;->m:Lgj/e;

    .line 442
    .line 443
    const-string v2, "+0000"

    .line 444
    .line 445
    invoke-static {v2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 446
    .line 447
    .line 448
    move-result-object v2

    .line 449
    invoke-virtual {p1, v1, v3, v2}, Lhj/c$d;->C(Lgj/e;ZLjava/util/List;)Lhj/c$d;

    .line 450
    .line 451
    .line 452
    goto/16 :goto_c

    .line 453
    .line 454
    :cond_c
    if-ne v6, v8, :cond_d

    .line 455
    .line 456
    invoke-virtual {p1}, Lhj/c$d;->p()Lhj/c$d;

    .line 457
    .line 458
    .line 459
    goto/16 :goto_c

    .line 460
    .line 461
    :cond_d
    if-ne v6, v2, :cond_e

    .line 462
    .line 463
    sget-object v1, Lgj/e;->m:Lgj/e;

    .line 464
    .line 465
    const-string v2, "Z"

    .line 466
    .line 467
    invoke-static {v2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 468
    .line 469
    .line 470
    move-result-object v2

    .line 471
    invoke-virtual {p1, v1, v9, v2}, Lhj/c$d;->C(Lgj/e;ZLjava/util/List;)Lhj/c$d;

    .line 472
    .line 473
    .line 474
    goto/16 :goto_c

    .line 475
    .line 476
    :cond_e
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 477
    .line 478
    new-instance v1, Ljava/lang/StringBuilder;

    .line 479
    .line 480
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 481
    .line 482
    .line 483
    const-string v2, "Too many pattern letters (Z): "

    .line 484
    .line 485
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 486
    .line 487
    .line 488
    invoke-virtual {v1, p5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 489
    .line 490
    .line 491
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 492
    .line 493
    .line 494
    move-result-object v1

    .line 495
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 496
    .line 497
    .line 498
    throw v0

    .line 499
    :pswitch_13
    if-ne v6, v5, :cond_f

    .line 500
    .line 501
    sget-object v1, Lnet/time4j/f0;->A:Lnet/time4j/c;

    .line 502
    .line 503
    invoke-virtual {p1, v1}, Lhj/c$d;->D(Lfj/p;)Lhj/c$d;

    .line 504
    .line 505
    .line 506
    goto/16 :goto_c

    .line 507
    .line 508
    :cond_f
    sget-object v1, Lnet/time4j/f0;->A:Lnet/time4j/c;

    .line 509
    .line 510
    invoke-virtual {p1, v1, p5, v3}, Lhj/c$d;->E(Lfj/p;IZ)Lhj/c$d;

    .line 511
    .line 512
    .line 513
    goto/16 :goto_c

    .line 514
    .line 515
    :pswitch_14
    invoke-static {p1, p4, p5, v9}, Lhj/w;->h(Lhj/c$d;CIZ)V

    .line 516
    .line 517
    .line 518
    goto/16 :goto_c

    .line 519
    .line 520
    :pswitch_15
    if-ne v6, v9, :cond_10

    .line 521
    .line 522
    invoke-static {p3}, Lnet/time4j/z0;->j(Ljava/util/Locale;)Lnet/time4j/z0;

    .line 523
    .line 524
    .line 525
    move-result-object v1

    .line 526
    invoke-virtual {v1}, Lnet/time4j/z0;->m()Lnet/time4j/c;

    .line 527
    .line 528
    .line 529
    move-result-object v1

    .line 530
    invoke-virtual {p1, v1, v9}, Lhj/c$d;->g(Lfj/p;I)Lhj/c$d;

    .line 531
    .line 532
    .line 533
    goto/16 :goto_c

    .line 534
    .line 535
    :cond_10
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 536
    .line 537
    new-instance v1, Ljava/lang/StringBuilder;

    .line 538
    .line 539
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 540
    .line 541
    .line 542
    const-string v2, "Too many pattern letters (W): "

    .line 543
    .line 544
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 545
    .line 546
    .line 547
    invoke-virtual {v1, p5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 548
    .line 549
    .line 550
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 551
    .line 552
    .line 553
    move-result-object v1

    .line 554
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 555
    .line 556
    .line 557
    throw v0

    .line 558
    :pswitch_16
    if-ne v6, v5, :cond_11

    .line 559
    .line 560
    :try_start_1
    invoke-virtual {p1}, Lhj/c$d;->B()Lhj/c$d;
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_1

    .line 561
    .line 562
    .line 563
    goto/16 :goto_c

    .line 564
    .line 565
    :catch_1
    move-exception v0

    .line 566
    move-object v1, v0

    .line 567
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 568
    .line 569
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 570
    .line 571
    .line 572
    move-result-object v1

    .line 573
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 574
    .line 575
    .line 576
    throw v0

    .line 577
    :cond_11
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 578
    .line 579
    new-instance v1, Ljava/lang/StringBuilder;

    .line 580
    .line 581
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 582
    .line 583
    .line 584
    const-string v2, "Count of pattern letters is not 2: "

    .line 585
    .line 586
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 587
    .line 588
    .line 589
    invoke-virtual {v1, p5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 590
    .line 591
    .line 592
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 593
    .line 594
    .line 595
    move-result-object v1

    .line 596
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 597
    .line 598
    .line 599
    throw v0

    .line 600
    :pswitch_17
    sget-object v1, Lnet/time4j/g0;->M:Lnet/time4j/k0;

    .line 601
    .line 602
    invoke-virtual {p1, v1, p5, p5, v3}, Lhj/c$d;->i(Lfj/p;IIZ)Lhj/c$d;

    .line 603
    .line 604
    .line 605
    goto/16 :goto_c

    .line 606
    .line 607
    :pswitch_18
    invoke-static {p1, p5}, Lhj/w;->i(Lhj/c$d;I)V

    .line 608
    .line 609
    .line 610
    goto/16 :goto_c

    .line 611
    .line 612
    :pswitch_19
    if-ne v6, v9, :cond_12

    .line 613
    .line 614
    invoke-virtual {p1}, Lhj/c$d;->x()Lhj/c$d;

    .line 615
    .line 616
    .line 617
    goto/16 :goto_c

    .line 618
    .line 619
    :cond_12
    if-ne v6, v8, :cond_13

    .line 620
    .line 621
    invoke-virtual {p1}, Lhj/c$d;->p()Lhj/c$d;

    .line 622
    .line 623
    .line 624
    goto/16 :goto_c

    .line 625
    .line 626
    :cond_13
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 627
    .line 628
    new-instance v1, Ljava/lang/StringBuilder;

    .line 629
    .line 630
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 631
    .line 632
    .line 633
    const-string v2, "Count of pattern letters is not 1 or 4: "

    .line 634
    .line 635
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 636
    .line 637
    .line 638
    invoke-virtual {v1, p5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 639
    .line 640
    .line 641
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 642
    .line 643
    .line 644
    move-result-object v1

    .line 645
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 646
    .line 647
    .line 648
    throw v0

    .line 649
    :pswitch_1a
    if-eqz v7, :cond_14

    .line 650
    .line 651
    goto :goto_4

    .line 652
    :cond_14
    move v8, v6

    .line 653
    :goto_4
    invoke-static {p5, v8}, Ljava/lang/Math;->min(II)I

    .line 654
    .line 655
    .line 656
    move-result v1

    .line 657
    invoke-static {p1, v1}, Lhj/w;->c(Lhj/c$d;I)V

    .line 658
    .line 659
    .line 660
    goto/16 :goto_c

    .line 661
    .line 662
    :pswitch_1b
    sget-object v1, Lgj/a;->h:Lfj/c;

    .line 663
    .line 664
    sget-object v2, Lgj/m;->l:Lgj/m;

    .line 665
    .line 666
    invoke-virtual {p1, v1, v2}, Lhj/c$d;->b0(Lfj/c;Ljava/lang/Enum;)Lhj/c$d;

    .line 667
    .line 668
    .line 669
    if-eqz v7, :cond_15

    .line 670
    .line 671
    goto :goto_5

    .line 672
    :cond_15
    move v8, v6

    .line 673
    :goto_5
    invoke-static {p5, v8}, Ljava/lang/Math;->min(II)I

    .line 674
    .line 675
    .line 676
    move-result v1

    .line 677
    invoke-static {p1, v1}, Lhj/w;->c(Lhj/c$d;I)V

    .line 678
    .line 679
    .line 680
    invoke-virtual {p1}, Lhj/c$d;->L()Lhj/c$d;

    .line 681
    .line 682
    .line 683
    goto/16 :goto_c

    .line 684
    .line 685
    :pswitch_1c
    sget-object v2, Lnet/time4j/g0;->D:Lnet/time4j/k0;

    .line 686
    .line 687
    invoke-static {v2, p4, p1, p5, v7}, Lhj/w;->f(Lfj/p;CLhj/c$d;IZ)V

    .line 688
    .line 689
    .line 690
    goto/16 :goto_c

    .line 691
    .line 692
    :pswitch_1d
    sget-object v2, Lnet/time4j/g0;->E:Lnet/time4j/k0;

    .line 693
    .line 694
    invoke-static {v2, p4, p1, p5, v7}, Lhj/w;->f(Lfj/p;CLhj/c$d;IZ)V

    .line 695
    .line 696
    .line 697
    goto/16 :goto_c

    .line 698
    .line 699
    :pswitch_1e
    if-gt v6, v4, :cond_16

    .line 700
    .line 701
    sget-object v1, Lgj/v;->l:Lgj/v;

    .line 702
    .line 703
    goto :goto_7

    .line 704
    :cond_16
    if-eq v6, v8, :cond_19

    .line 705
    .line 706
    if-eqz v7, :cond_17

    .line 707
    .line 708
    goto :goto_6

    .line 709
    :cond_17
    if-ne v6, v2, :cond_18

    .line 710
    .line 711
    sget-object v1, Lgj/v;->n:Lgj/v;

    .line 712
    .line 713
    goto :goto_7

    .line 714
    :cond_18
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 715
    .line 716
    new-instance v1, Ljava/lang/StringBuilder;

    .line 717
    .line 718
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 719
    .line 720
    .line 721
    const-string v2, "Too many pattern letters (G): "

    .line 722
    .line 723
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 724
    .line 725
    .line 726
    invoke-virtual {v1, p5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 727
    .line 728
    .line 729
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 730
    .line 731
    .line 732
    move-result-object v1

    .line 733
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 734
    .line 735
    .line 736
    throw v0

    .line 737
    :cond_19
    :goto_6
    sget-object v1, Lgj/v;->k:Lgj/v;

    .line 738
    .line 739
    :goto_7
    sget-object v2, Lgj/a;->g:Lfj/c;

    .line 740
    .line 741
    invoke-virtual {p1, v2, v1}, Lhj/c$d;->b0(Lfj/c;Ljava/lang/Enum;)Lhj/c$d;

    .line 742
    .line 743
    .line 744
    invoke-static {p3}, Lnet/time4j/history/d;->D(Ljava/util/Locale;)Lnet/time4j/history/d;

    .line 745
    .line 746
    .line 747
    move-result-object v1

    .line 748
    invoke-virtual {v1}, Lnet/time4j/history/d;->j()Lfj/p;

    .line 749
    .line 750
    .line 751
    move-result-object v2

    .line 752
    const-class v3, Lgj/t;

    .line 753
    .line 754
    invoke-virtual {v3, v2}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 755
    .line 756
    .line 757
    move-result-object v2

    .line 758
    check-cast v2, Lgj/t;

    .line 759
    .line 760
    invoke-virtual {p1, v2}, Lhj/c$d;->A(Lgj/t;)Lhj/c$d;

    .line 761
    .line 762
    .line 763
    invoke-virtual {p1}, Lhj/c$d;->L()Lhj/c$d;

    .line 764
    .line 765
    .line 766
    new-instance v0, Ljava/util/HashMap;

    .line 767
    .line 768
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 769
    .line 770
    .line 771
    sget-object v2, Lnet/time4j/f0;->z:Lnet/time4j/c;

    .line 772
    .line 773
    invoke-virtual {v1}, Lnet/time4j/history/d;->M()Lgj/t;

    .line 774
    .line 775
    .line 776
    move-result-object v3

    .line 777
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 778
    .line 779
    .line 780
    sget-object v2, Lnet/time4j/f0;->C:Lnet/time4j/c0;

    .line 781
    .line 782
    invoke-virtual {v1}, Lnet/time4j/history/d;->C()Lgj/t;

    .line 783
    .line 784
    .line 785
    move-result-object v3

    .line 786
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 787
    .line 788
    .line 789
    sget-object v2, Lnet/time4j/f0;->D:Lnet/time4j/k0;

    .line 790
    .line 791
    invoke-virtual {v1}, Lnet/time4j/history/d;->C()Lgj/t;

    .line 792
    .line 793
    .line 794
    move-result-object v3

    .line 795
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 796
    .line 797
    .line 798
    sget-object v2, Lnet/time4j/f0;->E:Lnet/time4j/k0;

    .line 799
    .line 800
    invoke-virtual {v1}, Lnet/time4j/history/d;->g()Lfj/p;

    .line 801
    .line 802
    .line 803
    move-result-object v3

    .line 804
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 805
    .line 806
    .line 807
    sget-object v2, Lnet/time4j/f0;->G:Lnet/time4j/k0;

    .line 808
    .line 809
    invoke-virtual {v1}, Lnet/time4j/history/d;->i()Lfj/p;

    .line 810
    .line 811
    .line 812
    move-result-object v1

    .line 813
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 814
    .line 815
    .line 816
    return-object v0

    .line 817
    :pswitch_1f
    if-eq v6, v9, :cond_1b

    .line 818
    .line 819
    if-eqz v7, :cond_1a

    .line 820
    .line 821
    goto :goto_8

    .line 822
    :cond_1a
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 823
    .line 824
    new-instance v1, Ljava/lang/StringBuilder;

    .line 825
    .line 826
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 827
    .line 828
    .line 829
    const-string v2, "Too many pattern letters (F): "

    .line 830
    .line 831
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 832
    .line 833
    .line 834
    invoke-virtual {v1, p5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 835
    .line 836
    .line 837
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 838
    .line 839
    .line 840
    move-result-object v1

    .line 841
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 842
    .line 843
    .line 844
    throw v0

    .line 845
    :cond_1b
    :goto_8
    sget-object v1, Lnet/time4j/f0;->I:Lnet/time4j/d0;

    .line 846
    .line 847
    invoke-virtual {p1, v1, p5}, Lhj/c$d;->g(Lfj/p;I)Lhj/c$d;

    .line 848
    .line 849
    .line 850
    goto/16 :goto_c

    .line 851
    .line 852
    :pswitch_20
    if-gt v6, v4, :cond_1c

    .line 853
    .line 854
    sget-object v1, Lgj/v;->l:Lgj/v;

    .line 855
    .line 856
    goto :goto_a

    .line 857
    :cond_1c
    if-eq v6, v8, :cond_20

    .line 858
    .line 859
    if-eqz v7, :cond_1d

    .line 860
    .line 861
    goto :goto_9

    .line 862
    :cond_1d
    if-ne v6, v2, :cond_1e

    .line 863
    .line 864
    sget-object v1, Lgj/v;->n:Lgj/v;

    .line 865
    .line 866
    goto :goto_a

    .line 867
    :cond_1e
    const/4 v1, 0x6

    .line 868
    if-ne v6, v1, :cond_1f

    .line 869
    .line 870
    sget-object v1, Lgj/v;->m:Lgj/v;

    .line 871
    .line 872
    goto :goto_a

    .line 873
    :cond_1f
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 874
    .line 875
    new-instance v1, Ljava/lang/StringBuilder;

    .line 876
    .line 877
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 878
    .line 879
    .line 880
    const-string v2, "Too many pattern letters (E): "

    .line 881
    .line 882
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 883
    .line 884
    .line 885
    invoke-virtual {v1, p5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 886
    .line 887
    .line 888
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 889
    .line 890
    .line 891
    move-result-object v1

    .line 892
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 893
    .line 894
    .line 895
    throw v0

    .line 896
    :cond_20
    :goto_9
    sget-object v1, Lgj/v;->k:Lgj/v;

    .line 897
    .line 898
    :goto_a
    sget-object v2, Lgj/a;->g:Lfj/c;

    .line 899
    .line 900
    invoke-virtual {p1, v2, v1}, Lhj/c$d;->b0(Lfj/c;Ljava/lang/Enum;)Lhj/c$d;

    .line 901
    .line 902
    .line 903
    sget-object v1, Lnet/time4j/f0;->F:Lnet/time4j/c0;

    .line 904
    .line 905
    invoke-virtual {p1, v1}, Lhj/c$d;->z(Lfj/p;)Lhj/c$d;

    .line 906
    .line 907
    .line 908
    invoke-virtual {p1}, Lhj/c$d;->L()Lhj/c$d;

    .line 909
    .line 910
    .line 911
    goto :goto_c

    .line 912
    :pswitch_21
    if-ge v6, v4, :cond_21

    .line 913
    .line 914
    sget-object v1, Lnet/time4j/f0;->G:Lnet/time4j/k0;

    .line 915
    .line 916
    invoke-virtual {p1, v1, p5, v4}, Lhj/c$d;->j(Lfj/p;II)Lhj/c$d;

    .line 917
    .line 918
    .line 919
    goto :goto_c

    .line 920
    :cond_21
    if-eq v6, v4, :cond_23

    .line 921
    .line 922
    if-eqz v7, :cond_22

    .line 923
    .line 924
    goto :goto_b

    .line 925
    :cond_22
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 926
    .line 927
    new-instance v1, Ljava/lang/StringBuilder;

    .line 928
    .line 929
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 930
    .line 931
    .line 932
    const-string v2, "Too many pattern letters (D): "

    .line 933
    .line 934
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 935
    .line 936
    .line 937
    invoke-virtual {v1, p5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 938
    .line 939
    .line 940
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 941
    .line 942
    .line 943
    move-result-object v1

    .line 944
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 945
    .line 946
    .line 947
    throw v0

    .line 948
    :cond_23
    :goto_b
    sget-object v1, Lnet/time4j/f0;->G:Lnet/time4j/k0;

    .line 949
    .line 950
    invoke-virtual {p1, v1, p5}, Lhj/c$d;->g(Lfj/p;I)Lhj/c$d;

    .line 951
    .line 952
    .line 953
    goto :goto_c

    .line 954
    :pswitch_22
    invoke-static {p5}, Lhj/w;->x(I)Lgj/v;

    .line 955
    .line 956
    .line 957
    move-result-object v1

    .line 958
    sget-object v2, Lgj/a;->g:Lfj/c;

    .line 959
    .line 960
    invoke-virtual {p1, v2, v1}, Lhj/c$d;->b0(Lfj/c;Ljava/lang/Enum;)Lhj/c$d;

    .line 961
    .line 962
    .line 963
    invoke-virtual {p1}, Lhj/c$d;->e()Lhj/c$d;

    .line 964
    .line 965
    .line 966
    invoke-virtual {p1}, Lhj/c$d;->L()Lhj/c$d;

    .line 967
    .line 968
    .line 969
    goto :goto_c

    .line 970
    :pswitch_23
    sget-object v1, Lnet/time4j/g0;->N:Lnet/time4j/k0;

    .line 971
    .line 972
    const/16 v2, 0x8

    .line 973
    .line 974
    invoke-virtual {p1, v1, p5, v2}, Lhj/c$d;->j(Lfj/p;II)Lhj/c$d;

    .line 975
    .line 976
    .line 977
    :cond_24
    :goto_c
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    .line 978
    .line 979
    .line 980
    move-result-object v0

    .line 981
    return-object v0

    .line 982
    nop

    :pswitch_data_0
    .packed-switch 0x41
        :pswitch_23
        :pswitch_22
        :pswitch_0
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_0
        :pswitch_0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_0
        :pswitch_19
        :pswitch_0
        :pswitch_18
        :pswitch_0
        :pswitch_17
        :pswitch_0
        :pswitch_0
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_0
        :pswitch_c
        :pswitch_b
        :pswitch_0
        :pswitch_0
        :pswitch_a
        :pswitch_0
        :pswitch_9
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_0
        :pswitch_5
        :pswitch_0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method private o(Lhj/c$d;CILjava/util/Locale;)Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhj/c$d<",
            "*>;CI",
            "Ljava/util/Locale;",
            ")",
            "Ljava/util/Map<",
            "Lfj/p<",
            "*>;",
            "Lfj/p<",
            "*>;>;"
        }
    .end annotation

    .line 1
    const/16 v0, 0x41

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-lt p2, v0, :cond_0

    .line 5
    .line 6
    const/16 v0, 0x5a

    .line 7
    .line 8
    if-gt p2, v0, :cond_0

    .line 9
    .line 10
    move v0, v1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    invoke-static {p1}, Lhj/w;->v(Lhj/c$d;)Lfj/x;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-static {v2, p4, p2}, Lhj/w;->q(Lfj/x;Ljava/util/Locale;I)Lfj/p;

    .line 18
    .line 19
    .line 20
    move-result-object p4

    .line 21
    if-eqz p4, :cond_a

    .line 22
    .line 23
    const-class v2, Ljava/lang/Enum;

    .line 24
    .line 25
    if-eqz v0, :cond_7

    .line 26
    .line 27
    instance-of v0, p4, Lgj/t;

    .line 28
    .line 29
    if-nez v0, :cond_1

    .line 30
    .line 31
    invoke-interface {p4}, Lfj/p;->getType()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-virtual {v2, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-eqz v3, :cond_7

    .line 40
    .line 41
    :cond_1
    if-eq p3, v1, :cond_5

    .line 42
    .line 43
    const/4 v1, 0x2

    .line 44
    if-eq p3, v1, :cond_4

    .line 45
    .line 46
    const/4 v1, 0x3

    .line 47
    if-eq p3, v1, :cond_3

    .line 48
    .line 49
    const/4 v1, 0x4

    .line 50
    if-ne p3, v1, :cond_2

    .line 51
    .line 52
    sget-object p2, Lgj/a;->g:Lfj/c;

    .line 53
    .line 54
    sget-object p3, Lgj/v;->k:Lgj/v;

    .line 55
    .line 56
    invoke-virtual {p1, p2, p3}, Lhj/c$d;->b0(Lfj/c;Ljava/lang/Enum;)Lhj/c$d;

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 61
    .line 62
    new-instance p3, Ljava/lang/StringBuilder;

    .line 63
    .line 64
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 65
    .line 66
    .line 67
    const-string p4, "Illegal count of symbols: "

    .line 68
    .line 69
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    throw p1

    .line 83
    :cond_3
    sget-object p2, Lgj/a;->g:Lfj/c;

    .line 84
    .line 85
    sget-object p3, Lgj/v;->l:Lgj/v;

    .line 86
    .line 87
    invoke-virtual {p1, p2, p3}, Lhj/c$d;->b0(Lfj/c;Ljava/lang/Enum;)Lhj/c$d;

    .line 88
    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_4
    sget-object p2, Lgj/a;->g:Lfj/c;

    .line 92
    .line 93
    sget-object p3, Lgj/v;->m:Lgj/v;

    .line 94
    .line 95
    invoke-virtual {p1, p2, p3}, Lhj/c$d;->b0(Lfj/c;Ljava/lang/Enum;)Lhj/c$d;

    .line 96
    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_5
    sget-object p2, Lgj/a;->g:Lfj/c;

    .line 100
    .line 101
    sget-object p3, Lgj/v;->n:Lgj/v;

    .line 102
    .line 103
    invoke-virtual {p1, p2, p3}, Lhj/c$d;->b0(Lfj/c;Ljava/lang/Enum;)Lhj/c$d;

    .line 104
    .line 105
    .line 106
    :goto_1
    if-eqz v0, :cond_6

    .line 107
    .line 108
    invoke-static {p4}, Lhj/w;->k(Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p2

    .line 112
    check-cast p2, Lgj/t;

    .line 113
    .line 114
    invoke-virtual {p1, p2}, Lhj/c$d;->A(Lgj/t;)Lhj/c$d;

    .line 115
    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_6
    invoke-static {p4}, Lhj/w;->k(Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object p2

    .line 122
    check-cast p2, Lfj/p;

    .line 123
    .line 124
    invoke-static {p1, p2}, Lhj/w;->b(Lhj/c$d;Lfj/p;)V

    .line 125
    .line 126
    .line 127
    :goto_2
    invoke-virtual {p1}, Lhj/c$d;->L()Lhj/c$d;

    .line 128
    .line 129
    .line 130
    goto :goto_3

    .line 131
    :cond_7
    invoke-interface {p4}, Lfj/p;->getType()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    move-result-object p2

    .line 135
    const-class v0, Ljava/lang/Integer;

    .line 136
    .line 137
    if-ne p2, v0, :cond_8

    .line 138
    .line 139
    invoke-static {p4}, Lhj/w;->k(Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object p2

    .line 143
    check-cast p2, Lfj/p;

    .line 144
    .line 145
    const/16 p4, 0x9

    .line 146
    .line 147
    invoke-virtual {p1, p2, p3, p4}, Lhj/c$d;->j(Lfj/p;II)Lhj/c$d;

    .line 148
    .line 149
    .line 150
    goto :goto_3

    .line 151
    :cond_8
    invoke-interface {p4}, Lfj/p;->getType()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    move-result-object p2

    .line 155
    invoke-virtual {v2, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 156
    .line 157
    .line 158
    move-result p2

    .line 159
    if-eqz p2, :cond_9

    .line 160
    .line 161
    invoke-static {p4}, Lhj/w;->k(Ljava/lang/Object;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object p2

    .line 165
    check-cast p2, Lfj/p;

    .line 166
    .line 167
    invoke-static {p1, p2, p3}, Lhj/w;->a(Lhj/c$d;Lfj/p;I)V

    .line 168
    .line 169
    .line 170
    :goto_3
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    return-object p1

    .line 175
    :cond_9
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 176
    .line 177
    new-instance p2, Ljava/lang/StringBuilder;

    .line 178
    .line 179
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 180
    .line 181
    .line 182
    const-string p3, "Can only handle enum or integer elements in a numerical way: "

    .line 183
    .line 184
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object p2

    .line 194
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    throw p1

    .line 198
    :cond_a
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 199
    .line 200
    new-instance p3, Ljava/lang/StringBuilder;

    .line 201
    .line 202
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 203
    .line 204
    .line 205
    const-string p4, "Cannot resolve symbol: "

    .line 206
    .line 207
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object p2

    .line 217
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    throw p1
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

.method private static p(Ljava/util/Set;CLjava/lang/String;)Lfj/p;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lfj/p<",
            "*>;>;C",
            "Ljava/lang/String;",
            ")",
            "Lfj/p<",
            "*>;"
        }
    .end annotation

    .line 1
    const/16 v0, 0x4c

    .line 2
    .line 3
    const/16 v1, 0x4d

    .line 4
    .line 5
    if-ne p1, v0, :cond_0

    .line 6
    .line 7
    move v0, v1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/16 v0, 0x63

    .line 10
    .line 11
    if-ne p1, v0, :cond_1

    .line 12
    .line 13
    const/16 v0, 0x65

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    move v0, p1

    .line 17
    :goto_0
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_4

    .line 26
    .line 27
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    check-cast v2, Lfj/p;

    .line 32
    .line 33
    invoke-interface {v2}, Lfj/p;->G()Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-eqz v3, :cond_2

    .line 38
    .line 39
    invoke-interface {v2}, Lfj/p;->b()C

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-ne v3, v0, :cond_2

    .line 44
    .line 45
    if-ne v0, v1, :cond_3

    .line 46
    .line 47
    invoke-interface {v2}, Lfj/p;->name()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    const-string v4, "MONTH_AS_NUMBER"

    .line 52
    .line 53
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-nez v3, :cond_2

    .line 58
    .line 59
    :cond_3
    return-object v2

    .line 60
    :cond_4
    const/16 p0, 0x79

    .line 61
    .line 62
    if-ne p1, p0, :cond_5

    .line 63
    .line 64
    const-string p0, "net.time4j.PlainDate"

    .line 65
    .line 66
    invoke-virtual {p2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    if-eqz p0, :cond_5

    .line 71
    .line 72
    sget-object p0, Lnet/time4j/f0;->z:Lnet/time4j/c;

    .line 73
    .line 74
    return-object p0

    .line 75
    :cond_5
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 76
    .line 77
    new-instance v0, Ljava/lang/StringBuilder;

    .line 78
    .line 79
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 80
    .line 81
    .line 82
    const-string v1, "Cannot find any chronological date element for symbol "

    .line 83
    .line 84
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    const-string p1, " in \""

    .line 91
    .line 92
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    const-string p1, "\"."

    .line 99
    .line 100
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    throw p0
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

.method private static q(Lfj/x;Ljava/util/Locale;I)Lfj/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/x<",
            "*>;",
            "Ljava/util/Locale;",
            "I)",
            "Lfj/p<",
            "*>;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p0, p1, p2, v0}, Lhj/w;->r(Lfj/x;Ljava/util/Locale;IZ)Lfj/p;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    invoke-static {p0, p1, p2, v0}, Lhj/w;->r(Lfj/x;Ljava/util/Locale;IZ)Lfj/p;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :cond_0
    return-object v0
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

.method private static r(Lfj/x;Ljava/util/Locale;IZ)Lfj/p;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/x<",
            "*>;",
            "Ljava/util/Locale;",
            "IZ)",
            "Lfj/p<",
            "*>;"
        }
    .end annotation

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    invoke-static {p2}, Lhj/w;->j(I)I

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    :cond_0
    invoke-virtual {p0}, Lfj/x;->u()Ljava/util/Set;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_3

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Lfj/p;

    .line 26
    .line 27
    invoke-interface {v1}, Lfj/p;->b()C

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz p3, :cond_2

    .line 32
    .line 33
    invoke-static {v2}, Lhj/w;->j(I)I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    :cond_2
    if-ne v2, p2, :cond_1

    .line 38
    .line 39
    return-object v1

    .line 40
    :cond_3
    invoke-virtual {p0}, Lfj/x;->s()Ljava/util/List;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    :cond_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-eqz v0, :cond_7

    .line 53
    .line 54
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    check-cast v0, Lfj/s;

    .line 59
    .line 60
    invoke-static {}, Lgj/a;->f()Lgj/a;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-interface {v0, p1, v1}, Lfj/s;->a(Ljava/util/Locale;Lfj/d;)Ljava/util/Set;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    :cond_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    if-eqz v1, :cond_4

    .line 77
    .line 78
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    check-cast v1, Lfj/p;

    .line 83
    .line 84
    invoke-interface {v1}, Lfj/p;->b()C

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    if-eqz p3, :cond_6

    .line 89
    .line 90
    invoke-static {v2}, Lhj/w;->j(I)I

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    :cond_6
    if-ne v2, p2, :cond_5

    .line 95
    .line 96
    return-object v1

    .line 97
    :cond_7
    const/4 p0, 0x0

    .line 98
    return-object p0
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
.end method

.method private static s(Lfj/x;)Lfj/p;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/x<",
            "*>;)",
            "Lfj/p<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lfj/x;->s()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Lfj/s;

    .line 20
    .line 21
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 22
    .line 23
    invoke-static {}, Lgj/a;->f()Lgj/a;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-interface {v0, v1, v2}, Lfj/s;->a(Ljava/util/Locale;Lfj/d;)Ljava/util/Set;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_0

    .line 40
    .line 41
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    check-cast v1, Lfj/p;

    .line 46
    .line 47
    invoke-interface {v1}, Lfj/p;->name()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    const-string v3, "ETHIOPIAN_HOUR"

    .line 52
    .line 53
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-eqz v2, :cond_1

    .line 58
    .line 59
    invoke-static {v1}, Lhj/w;->k(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    check-cast p0, Lfj/p;

    .line 64
    .line 65
    return-object p0

    .line 66
    :cond_2
    const/4 p0, 0x0

    .line 67
    return-object p0
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

.method private t(Lhj/c$d;Lfj/x;CILjava/util/Locale;)Ljava/util/Map;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhj/c$d<",
            "*>;",
            "Lfj/x<",
            "*>;CI",
            "Ljava/util/Locale;",
            ")",
            "Ljava/util/Map<",
            "Lfj/p<",
            "*>;",
            "Lfj/p<",
            "*>;>;"
        }
    .end annotation

    move-object/from16 v6, p1

    move-object/from16 v2, p2

    move/from16 v4, p3

    move/from16 v5, p4

    const/16 v0, 0x67

    if-ne v4, v0, :cond_0

    .line 1
    sget-object v0, Lfj/a0;->m:Lfj/a0;

    const/16 v1, 0x12

    sget-object v2, Lhj/x;->l:Lhj/x;

    invoke-virtual {v6, v0, v5, v1, v2}, Lhj/c$d;->q(Lfj/p;IILhj/x;)Lhj/c$d;

    .line 2
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    return-object v0

    :cond_0
    const/16 v0, 0x47

    if-ne v4, v0, :cond_1

    .line 3
    invoke-static {}, Lnet/time4j/f0;->v0()Lfj/h0;

    move-result-object v0

    if-ne v2, v0, :cond_1

    const/4 v7, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p5

    move/from16 v4, p3

    move/from16 v5, p4

    move v6, v7

    .line 4
    invoke-direct/range {v0 .. v6}, Lhj/w;->n(Lhj/c$d;Lfj/x;Ljava/util/Locale;CIZ)Ljava/util/Map;

    move-result-object v0

    return-object v0

    :cond_1
    move-object/from16 v7, p5

    .line 5
    invoke-static {v2, v4, v7}, Lhj/w;->w(Lfj/x;CLjava/util/Locale;)Ljava/util/Set;

    move-result-object v0

    .line 6
    invoke-virtual/range {p1 .. p1}, Lhj/c$d;->P()Lfj/x;

    move-result-object v1

    invoke-virtual {v1}, Lfj/x;->q()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    .line 7
    invoke-static {v0, v4, v1}, Lhj/w;->p(Ljava/util/Set;CLjava/lang/String;)Lfj/p;

    move-result-object v0

    .line 8
    invoke-interface {v0}, Lfj/p;->getType()Ljava/lang/Class;

    move-result-object v3

    const-class v8, Ljava/lang/Integer;

    invoke-virtual {v8, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v3

    const-string v8, "\""

    const-string v9, " in \""

    const-string v10, "Implementation error: "

    const/4 v11, 0x0

    if-eqz v3, :cond_3

    .line 9
    instance-of v3, v0, Lij/a;

    if-eqz v3, :cond_2

    .line 10
    invoke-static {v0}, Lhj/w;->k(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v11, v3

    check-cast v11, Lgj/t;

    .line 11
    :cond_2
    invoke-static {v0}, Lhj/w;->k(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lfj/p;

    goto :goto_0

    .line 12
    :cond_3
    instance-of v3, v0, Lgj/t;

    if-eqz v3, :cond_22

    .line 13
    invoke-static {v0}, Lhj/w;->k(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lgj/t;

    move-object/from16 v16, v11

    move-object v11, v3

    move-object/from16 v3, v16

    :goto_0
    const/16 v12, 0x4c

    if-eq v4, v12, :cond_20

    const/16 v12, 0x4d

    if-eq v4, v12, :cond_1f

    const/16 v12, 0x55

    const/4 v13, 0x5

    const/4 v14, 0x4

    const/4 v15, 0x3

    if-eq v4, v12, :cond_1a

    const/16 v1, 0x57

    const/4 v8, 0x1

    if-eq v4, v1, :cond_18

    const/16 v1, 0x72

    if-eq v4, v1, :cond_17

    const/16 v1, 0x77

    const/4 v9, 0x0

    if-eq v4, v1, :cond_16

    const/16 v1, 0x79

    const/4 v10, 0x2

    if-eq v4, v1, :cond_13

    packed-switch v4, :pswitch_data_0

    packed-switch v4, :pswitch_data_1

    .line 14
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unsupported pattern symbol: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    if-gt v5, v10, :cond_4

    .line 15
    invoke-static {v0}, Lhj/w;->k(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lfj/p;

    .line 16
    invoke-virtual {v6, v0, v5}, Lhj/c$d;->h(Lfj/p;I)Lhj/c$d;

    goto/16 :goto_7

    :cond_4
    const/16 v3, 0x45

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v4, p4

    move-object/from16 v5, p5

    .line 17
    invoke-direct/range {v0 .. v5}, Lhj/w;->t(Lhj/c$d;Lfj/x;CILjava/util/Locale;)Ljava/util/Map;

    goto/16 :goto_7

    :pswitch_1
    if-nez v3, :cond_6

    if-gt v5, v10, :cond_5

    .line 18
    sget-object v0, Lij/a;->b:Lfj/c;

    invoke-virtual {v6, v0, v5}, Lhj/c$d;->a0(Lfj/c;I)Lhj/c$d;

    .line 19
    invoke-virtual {v6, v11}, Lhj/c$d;->A(Lgj/t;)Lhj/c$d;

    .line 20
    invoke-virtual/range {p1 .. p1}, Lhj/c$d;->L()Lhj/c$d;

    goto/16 :goto_7

    .line 21
    :cond_5
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Too many pattern letters for day-of-month: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 22
    :cond_6
    invoke-static {v3, v4, v6, v5, v9}, Lhj/w;->f(Lfj/p;CLhj/c$d;IZ)V

    goto/16 :goto_7

    :pswitch_2
    if-eq v5, v10, :cond_8

    .line 23
    sget-object v1, Lgj/a;->h:Lfj/c;

    sget-object v3, Lgj/m;->l:Lgj/m;

    invoke-virtual {v6, v1, v3}, Lhj/c$d;->b0(Lfj/c;Ljava/lang/Enum;)Lhj/c$d;

    if-ne v5, v8, :cond_7

    .line 24
    invoke-static {v0}, Lhj/w;->k(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lfj/p;

    .line 25
    invoke-virtual {v6, v0, v8}, Lhj/c$d;->h(Lfj/p;I)Lhj/c$d;

    goto :goto_1

    :cond_7
    const/16 v3, 0x45

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v4, p4

    move-object/from16 v5, p5

    .line 26
    invoke-direct/range {v0 .. v5}, Lhj/w;->t(Lhj/c$d;Lfj/x;CILjava/util/Locale;)Ljava/util/Map;

    .line 27
    :goto_1
    invoke-virtual/range {p1 .. p1}, Lhj/c$d;->L()Lhj/c$d;

    goto/16 :goto_7

    .line 28
    :cond_8
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Invalid pattern count of 2 for symbol \'c\'."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_3
    if-gt v5, v15, :cond_9

    .line 29
    sget-object v0, Lgj/v;->l:Lgj/v;

    goto :goto_2

    :cond_9
    if-ne v5, v14, :cond_a

    .line 30
    sget-object v0, Lgj/v;->k:Lgj/v;

    goto :goto_2

    :cond_a
    if-ne v5, v13, :cond_b

    .line 31
    sget-object v0, Lgj/v;->n:Lgj/v;

    .line 32
    :goto_2
    sget-object v1, Lgj/a;->g:Lfj/c;

    invoke-virtual {v6, v1, v0}, Lhj/c$d;->b0(Lfj/c;Ljava/lang/Enum;)Lhj/c$d;

    .line 33
    invoke-virtual {v6, v11}, Lhj/c$d;->A(Lgj/t;)Lhj/c$d;

    .line 34
    invoke-virtual/range {p1 .. p1}, Lhj/c$d;->L()Lhj/c$d;

    goto/16 :goto_7

    .line 35
    :cond_b
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Too many pattern letters (G): "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_4
    if-ne v5, v8, :cond_c

    .line 36
    invoke-virtual {v6, v3, v5}, Lhj/c$d;->g(Lfj/p;I)Lhj/c$d;

    goto/16 :goto_7

    .line 37
    :cond_c
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Too many pattern letters (F): "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_5
    if-gt v5, v15, :cond_d

    .line 38
    sget-object v0, Lgj/v;->l:Lgj/v;

    goto :goto_3

    :cond_d
    if-ne v5, v14, :cond_e

    .line 39
    sget-object v0, Lgj/v;->k:Lgj/v;

    goto :goto_3

    :cond_e
    if-ne v5, v13, :cond_f

    .line 40
    sget-object v0, Lgj/v;->n:Lgj/v;

    goto :goto_3

    :cond_f
    const/4 v0, 0x6

    if-ne v5, v0, :cond_10

    .line 41
    sget-object v0, Lgj/v;->m:Lgj/v;

    .line 42
    :goto_3
    sget-object v1, Lgj/a;->g:Lfj/c;

    invoke-virtual {v6, v1, v0}, Lhj/c$d;->b0(Lfj/c;Ljava/lang/Enum;)Lhj/c$d;

    .line 43
    invoke-virtual {v6, v11}, Lhj/c$d;->A(Lgj/t;)Lhj/c$d;

    .line 44
    invoke-virtual/range {p1 .. p1}, Lhj/c$d;->L()Lhj/c$d;

    goto/16 :goto_7

    .line 45
    :cond_10
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Too many pattern letters (E): "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_6
    if-ge v5, v15, :cond_11

    .line 46
    invoke-virtual {v6, v3, v5, v15}, Lhj/c$d;->j(Lfj/p;II)Lhj/c$d;

    goto/16 :goto_7

    :cond_11
    if-ne v5, v15, :cond_12

    .line 47
    invoke-virtual {v6, v3, v5}, Lhj/c$d;->g(Lfj/p;I)Lhj/c$d;

    goto/16 :goto_7

    .line 48
    :cond_12
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Too many pattern letters (D): "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 49
    :cond_13
    invoke-virtual/range {p5 .. p5}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v0

    const-string v1, "am"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_14

    invoke-static/range {p2 .. p2}, Lhj/w;->u(Lfj/x;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "ethiopic"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_14

    .line 50
    sget-object v0, Lgj/a;->l:Lfj/c;

    sget-object v1, Lgj/j;->q:Lgj/j;

    invoke-virtual {v6, v0, v1}, Lhj/c$d;->b0(Lfj/c;Ljava/lang/Enum;)Lhj/c$d;

    goto :goto_4

    :cond_14
    move v8, v9

    :goto_4
    if-ne v5, v10, :cond_15

    .line 51
    invoke-virtual {v6, v3}, Lhj/c$d;->D(Lfj/p;)Lhj/c$d;

    goto :goto_5

    .line 52
    :cond_15
    invoke-virtual {v6, v3, v5, v9}, Lhj/c$d;->E(Lfj/p;IZ)Lhj/c$d;

    :goto_5
    if-eqz v8, :cond_21

    .line 53
    invoke-virtual/range {p1 .. p1}, Lhj/c$d;->L()Lhj/c$d;

    goto/16 :goto_7

    .line 54
    :cond_16
    invoke-static {v3, v4, v6, v5, v9}, Lhj/w;->f(Lfj/p;CLhj/c$d;IZ)V

    goto/16 :goto_7

    .line 55
    :cond_17
    sget-object v0, Lgj/a;->l:Lfj/c;

    sget-object v1, Lgj/j;->k:Lgj/j;

    invoke-virtual {v6, v0, v1}, Lhj/c$d;->b0(Lfj/c;Ljava/lang/Enum;)Lhj/c$d;

    .line 56
    sget-object v0, Lgj/a;->m:Lfj/c;

    const/16 v1, 0x30

    invoke-virtual {v6, v0, v1}, Lhj/c$d;->Z(Lfj/c;C)Lhj/c$d;

    .line 57
    invoke-virtual {v6, v3, v5, v8}, Lhj/c$d;->E(Lfj/p;IZ)Lhj/c$d;

    .line 58
    invoke-virtual/range {p1 .. p1}, Lhj/c$d;->L()Lhj/c$d;

    .line 59
    invoke-virtual/range {p1 .. p1}, Lhj/c$d;->L()Lhj/c$d;

    goto/16 :goto_7

    :cond_18
    if-ne v5, v8, :cond_19

    .line 60
    invoke-virtual {v6, v3, v8}, Lhj/c$d;->g(Lfj/p;I)Lhj/c$d;

    goto/16 :goto_7

    .line 61
    :cond_19
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Too many pattern letters (W): "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1a
    if-eqz v11, :cond_1e

    if-gt v5, v15, :cond_1b

    .line 62
    sget-object v0, Lgj/v;->l:Lgj/v;

    goto :goto_6

    :cond_1b
    if-ne v5, v14, :cond_1c

    .line 63
    sget-object v0, Lgj/v;->k:Lgj/v;

    goto :goto_6

    :cond_1c
    if-ne v5, v13, :cond_1d

    .line 64
    sget-object v0, Lgj/v;->n:Lgj/v;

    .line 65
    :goto_6
    sget-object v1, Lgj/a;->g:Lfj/c;

    invoke-virtual {v6, v1, v0}, Lhj/c$d;->b0(Lfj/c;Ljava/lang/Enum;)Lhj/c$d;

    .line 66
    invoke-virtual {v6, v11}, Lhj/c$d;->A(Lgj/t;)Lhj/c$d;

    .line 67
    invoke-virtual/range {p1 .. p1}, Lhj/c$d;->L()Lhj/c$d;

    goto :goto_7

    .line 68
    :cond_1d
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Too many pattern letters (U): "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 69
    :cond_1e
    new-instance v2, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 70
    :cond_1f
    invoke-static {v6, v5, v11}, Lhj/w;->e(Lhj/c$d;ILgj/t;)V

    goto :goto_7

    .line 71
    :cond_20
    sget-object v0, Lgj/a;->h:Lfj/c;

    sget-object v1, Lgj/m;->l:Lgj/m;

    invoke-virtual {v6, v0, v1}, Lhj/c$d;->b0(Lfj/c;Ljava/lang/Enum;)Lhj/c$d;

    .line 72
    invoke-static {v6, v5, v11}, Lhj/w;->e(Lhj/c$d;ILgj/t;)V

    .line 73
    invoke-virtual/range {p1 .. p1}, Lhj/c$d;->L()Lhj/c$d;

    .line 74
    :cond_21
    :goto_7
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    return-object v0

    .line 75
    :cond_22
    new-instance v2, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    nop

    :pswitch_data_0
    .packed-switch 0x44
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x63
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private static u(Lfj/x;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/x<",
            "*>;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lfj/x;->q()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-class v0, Lgj/c;

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Lgj/c;

    .line 12
    .line 13
    if-nez p0, :cond_0

    .line 14
    .line 15
    const-string p0, "iso8601"

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-interface {p0}, Lgj/c;->value()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    :goto_0
    return-object p0
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method private static v(Lhj/c$d;)Lfj/x;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhj/c$d<",
            "*>;)",
            "Lfj/x<",
            "*>;"
        }
    .end annotation

    invoke-virtual {p0}, Lhj/c$d;->P()Lfj/x;

    move-result-object p0

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lhj/w;
    .locals 1

    const-class v0, Lhj/w;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lhj/w;

    return-object p0
.end method

.method public static values()[Lhj/w;
    .locals 1

    sget-object v0, Lhj/w;->p:[Lhj/w;

    invoke-virtual {v0}, [Lhj/w;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lhj/w;

    return-object v0
.end method

.method private static w(Lfj/x;CLjava/util/Locale;)Ljava/util/Set;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/x<",
            "*>;C",
            "Ljava/util/Locale;",
            ")",
            "Ljava/util/Set<",
            "Lfj/p<",
            "*>;>;"
        }
    .end annotation

    .line 1
    const/16 v0, 0x63

    .line 2
    .line 3
    const/16 v1, 0x65

    .line 4
    .line 5
    const/16 v2, 0x57

    .line 6
    .line 7
    const/16 v3, 0x77

    .line 8
    .line 9
    if-eq p1, v3, :cond_1

    .line 10
    .line 11
    if-eq p1, v2, :cond_1

    .line 12
    .line 13
    if-eq p1, v1, :cond_1

    .line 14
    .line 15
    if-ne p1, v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p0}, Lfj/x;->u()Ljava/util/Set;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lfj/x;->s()Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-eqz v4, :cond_8

    .line 36
    .line 37
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    check-cast v4, Lfj/s;

    .line 42
    .line 43
    invoke-static {}, Lgj/a;->f()Lgj/a;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    invoke-interface {v4, p2, v5}, Lfj/s;->a(Ljava/util/Locale;Lfj/d;)Ljava/util/Set;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    :cond_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    if-eqz v5, :cond_2

    .line 60
    .line 61
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    check-cast v5, Lfj/p;

    .line 66
    .line 67
    if-eq p1, v1, :cond_4

    .line 68
    .line 69
    if-ne p1, v0, :cond_5

    .line 70
    .line 71
    :cond_4
    invoke-interface {v5}, Lfj/p;->name()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v6

    .line 75
    const-string v7, "LOCAL_DAY_OF_WEEK"

    .line 76
    .line 77
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v6

    .line 81
    if-nez v6, :cond_7

    .line 82
    .line 83
    :cond_5
    if-ne p1, v3, :cond_6

    .line 84
    .line 85
    invoke-interface {v5}, Lfj/p;->name()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v6

    .line 89
    const-string v7, "WEEK_OF_YEAR"

    .line 90
    .line 91
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v6

    .line 95
    if-nez v6, :cond_7

    .line 96
    .line 97
    :cond_6
    if-ne p1, v2, :cond_3

    .line 98
    .line 99
    invoke-interface {v5}, Lfj/p;->name()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v6

    .line 103
    const-string v7, "WEEK_OF_MONTH"

    .line 104
    .line 105
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v6

    .line 109
    if-eqz v6, :cond_3

    .line 110
    .line 111
    :cond_7
    new-instance p0, Ljava/util/HashSet;

    .line 112
    .line 113
    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    .line 114
    .line 115
    .line 116
    invoke-interface {p0, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    return-object p0

    .line 120
    :cond_8
    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    return-object p0
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
.end method

.method private static x(I)Lgj/v;
    .locals 3

    .line 1
    const/4 v0, 0x3

    .line 2
    if-gt p0, v0, :cond_0

    .line 3
    .line 4
    sget-object p0, Lgj/v;->l:Lgj/v;

    .line 5
    .line 6
    return-object p0

    .line 7
    :cond_0
    const/4 v0, 0x4

    .line 8
    if-ne p0, v0, :cond_1

    .line 9
    .line 10
    sget-object p0, Lgj/v;->k:Lgj/v;

    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_1
    const/4 v0, 0x5

    .line 14
    if-ne p0, v0, :cond_2

    .line 15
    .line 16
    sget-object p0, Lgj/v;->n:Lgj/v;

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 20
    .line 21
    new-instance v1, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 24
    .line 25
    .line 26
    const-string v2, "Too many pattern letters: "

    .line 27
    .line 28
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw v0
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

.method private static y(C)Z
    .locals 1

    const/16 v0, 0x4c

    if-eq p0, v0, :cond_0

    const/16 v0, 0x4d

    if-eq p0, v0, :cond_0

    const/16 v0, 0x55

    if-eq p0, v0, :cond_0

    const/16 v0, 0x57

    if-eq p0, v0, :cond_0

    const/16 v0, 0x67

    if-eq p0, v0, :cond_0

    const/16 v0, 0x72

    if-eq p0, v0, :cond_0

    const/16 v0, 0x77

    if-eq p0, v0, :cond_0

    const/16 v0, 0x79

    if-eq p0, v0, :cond_0

    packed-switch p0, :pswitch_data_0

    packed-switch p0, :pswitch_data_1

    const/4 p0, 0x0

    return p0

    :cond_0
    :pswitch_0
    const/4 p0, 0x1

    return p0

    :pswitch_data_0
    .packed-switch 0x44
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x63
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private static z(Lfj/x;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/x<",
            "*>;)Z"
        }
    .end annotation

    invoke-static {p0}, Lhj/w;->u(Lfj/x;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "iso8601"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method A(Lhj/c$d;Ljava/util/Locale;CI)Ljava/util/Map;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhj/c$d<",
            "*>;",
            "Ljava/util/Locale;",
            "CI)",
            "Ljava/util/Map<",
            "Lfj/p<",
            "*>;",
            "Lfj/p<",
            "*>;>;"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lhj/w;->v(Lhj/c$d;)Lfj/x;

    .line 2
    .line 3
    .line 4
    move-result-object v2

    .line 5
    sget-object v0, Lhj/w$a;->a:[I

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    aget v0, v0, v1

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    if-eq v0, v1, :cond_6

    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    if-eq v0, v1, :cond_5

    .line 18
    .line 19
    const/4 v1, 0x3

    .line 20
    if-eq v0, v1, :cond_4

    .line 21
    .line 22
    const/4 v1, 0x4

    .line 23
    if-eq v0, v1, :cond_1

    .line 24
    .line 25
    const/4 v1, 0x5

    .line 26
    if-ne v0, v1, :cond_0

    .line 27
    .line 28
    invoke-direct {p0, p1, p3, p4, p2}, Lhj/w;->o(Lhj/c$d;CILjava/util/Locale;)Ljava/util/Map;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    return-object p1

    .line 33
    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 34
    .line 35
    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw p1

    .line 43
    :cond_1
    invoke-virtual {v2}, Lfj/x;->q()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    const-class v1, Lfj/m;

    .line 48
    .line 49
    invoke-virtual {v1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-nez v1, :cond_3

    .line 54
    .line 55
    const-class v1, Lfj/l;

    .line 56
    .line 57
    invoke-virtual {v1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-eqz v0, :cond_2

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 65
    .line 66
    const-string p2, "No calendar chronology."

    .line 67
    .line 68
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    throw p1

    .line 72
    :cond_3
    :goto_0
    move-object v0, p0

    .line 73
    move-object v1, p1

    .line 74
    move v3, p3

    .line 75
    move v4, p4

    .line 76
    move-object v5, p2

    .line 77
    invoke-direct/range {v0 .. v5}, Lhj/w;->t(Lhj/c$d;Lfj/x;CILjava/util/Locale;)Ljava/util/Map;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    return-object p1

    .line 82
    :cond_4
    invoke-direct {p0, p1, p2, p3, p4}, Lhj/w;->m(Lhj/c$d;Ljava/util/Locale;CI)Ljava/util/Map;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    return-object p1

    .line 87
    :cond_5
    move-object v0, p0

    .line 88
    move-object v1, p1

    .line 89
    move-object v3, p2

    .line 90
    move v4, p3

    .line 91
    move v5, p4

    .line 92
    invoke-direct/range {v0 .. v5}, Lhj/w;->B(Lhj/c$d;Lfj/x;Ljava/util/Locale;CI)Ljava/util/Map;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    return-object p1

    .line 97
    :cond_6
    invoke-direct {p0, p1, p2, p3, p4}, Lhj/w;->l(Lhj/c$d;Ljava/util/Locale;CI)Ljava/util/Map;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    return-object p1
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
.end method
