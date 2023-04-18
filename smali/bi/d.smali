.class public final Lbi/d;
.super Lpg/a;
.source "SourceFile"

# interfaces
.implements Lmg/m;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbi/d$b;,
        Lbi/d$c;,
        Lbi/d$a;
    }
.end annotation


# instance fields
.field private final A:Lbi/d$c;

.field private final B:Lmg/m;

.field private final C:Lci/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lci/j<",
            "Lmg/d;",
            ">;"
        }
    .end annotation
.end field

.field private final D:Lci/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lci/i<",
            "Ljava/util/Collection<",
            "Lmg/d;",
            ">;>;"
        }
    .end annotation
.end field

.field private final E:Lci/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lci/j<",
            "Lmg/e;",
            ">;"
        }
    .end annotation
.end field

.field private final F:Lci/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lci/i<",
            "Ljava/util/Collection<",
            "Lmg/e;",
            ">;>;"
        }
    .end annotation
.end field

.field private final G:Lci/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lci/j<",
            "Lmg/h1<",
            "Ldi/o0;",
            ">;>;"
        }
    .end annotation
.end field

.field private final H:Lzh/z$a;

.field private final I:Lng/g;

.field private final p:Lgh/c;

.field private final q:Lih/a;

.field private final r:Lmg/a1;

.field private final s:Llh/b;

.field private final t:Lmg/e0;

.field private final u:Lmg/u;

.field private final v:Lmg/f;

.field private final w:Lzh/m;

.field private final x:Lwh/i;

.field private final y:Lbi/d$b;

.field private final z:Lmg/y0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmg/y0<",
            "Lbi/d$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lzh/m;Lgh/c;Lih/c;Lih/a;Lmg/a1;)V
    .locals 8

    .line 1
    const-string v0, "outerContext"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "classProto"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "nameResolver"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "metadataVersion"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "sourceElement"

    .line 22
    .line 23
    invoke-static {p5, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Lzh/m;->h()Lci/n;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {p2}, Lgh/c;->F0()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    invoke-static {p3, v1}, Lzh/x;->a(Lih/c;I)Llh/b;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v1}, Llh/b;->j()Llh/f;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-direct {p0, v0, v1}, Lpg/a;-><init>(Lci/n;Llh/f;)V

    .line 43
    .line 44
    .line 45
    iput-object p2, p0, Lbi/d;->p:Lgh/c;

    .line 46
    .line 47
    iput-object p4, p0, Lbi/d;->q:Lih/a;

    .line 48
    .line 49
    iput-object p5, p0, Lbi/d;->r:Lmg/a1;

    .line 50
    .line 51
    invoke-virtual {p2}, Lgh/c;->F0()I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    invoke-static {p3, v0}, Lzh/x;->a(Lih/c;I)Llh/b;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iput-object v0, p0, Lbi/d;->s:Llh/b;

    .line 60
    .line 61
    sget-object v0, Lzh/a0;->a:Lzh/a0;

    .line 62
    .line 63
    sget-object v1, Lih/b;->e:Lih/b$d;

    .line 64
    .line 65
    invoke-virtual {p2}, Lgh/c;->E0()I

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    invoke-virtual {v1, v2}, Lih/b$d;->d(I)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    check-cast v1, Lgh/k;

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Lzh/a0;->b(Lgh/k;)Lmg/e0;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    iput-object v1, p0, Lbi/d;->t:Lmg/e0;

    .line 80
    .line 81
    sget-object v1, Lih/b;->d:Lih/b$d;

    .line 82
    .line 83
    invoke-virtual {p2}, Lgh/c;->E0()I

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    invoke-virtual {v1, v2}, Lih/b$d;->d(I)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    check-cast v1, Lgh/x;

    .line 92
    .line 93
    invoke-static {v0, v1}, Lzh/b0;->a(Lzh/a0;Lgh/x;)Lmg/u;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    iput-object v1, p0, Lbi/d;->u:Lmg/u;

    .line 98
    .line 99
    sget-object v1, Lih/b;->f:Lih/b$d;

    .line 100
    .line 101
    invoke-virtual {p2}, Lgh/c;->E0()I

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    invoke-virtual {v1, v2}, Lih/b$d;->d(I)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    check-cast v1, Lgh/c$c;

    .line 110
    .line 111
    invoke-virtual {v0, v1}, Lzh/a0;->a(Lgh/c$c;)Lmg/f;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    iput-object v0, p0, Lbi/d;->v:Lmg/f;

    .line 116
    .line 117
    invoke-virtual {p2}, Lgh/c;->h1()Ljava/util/List;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    const-string v1, "classProto.typeParameterList"

    .line 122
    .line 123
    invoke-static {v3, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    new-instance v5, Lih/g;

    .line 127
    .line 128
    invoke-virtual {p2}, Lgh/c;->i1()Lgh/t;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    const-string v2, "classProto.typeTable"

    .line 133
    .line 134
    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    invoke-direct {v5, v1}, Lih/g;-><init>(Lgh/t;)V

    .line 138
    .line 139
    .line 140
    sget-object v1, Lih/h;->b:Lih/h$a;

    .line 141
    .line 142
    invoke-virtual {p2}, Lgh/c;->k1()Lgh/w;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    const-string v4, "classProto.versionRequirementTable"

    .line 147
    .line 148
    invoke-static {v2, v4}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v1, v2}, Lih/h$a;->a(Lgh/w;)Lih/h;

    .line 152
    .line 153
    .line 154
    move-result-object v6

    .line 155
    move-object v1, p1

    .line 156
    move-object v2, p0

    .line 157
    move-object v4, p3

    .line 158
    move-object v7, p4

    .line 159
    invoke-virtual/range {v1 .. v7}, Lzh/m;->a(Lmg/m;Ljava/util/List;Lih/c;Lih/g;Lih/h;Lih/a;)Lzh/m;

    .line 160
    .line 161
    .line 162
    move-result-object p3

    .line 163
    iput-object p3, p0, Lbi/d;->w:Lzh/m;

    .line 164
    .line 165
    sget-object p4, Lmg/f;->n:Lmg/f;

    .line 166
    .line 167
    if-ne v0, p4, :cond_0

    .line 168
    .line 169
    new-instance v1, Lwh/l;

    .line 170
    .line 171
    invoke-virtual {p3}, Lzh/m;->h()Lci/n;

    .line 172
    .line 173
    .line 174
    move-result-object v2

    .line 175
    invoke-direct {v1, v2, p0}, Lwh/l;-><init>(Lci/n;Lmg/e;)V

    .line 176
    .line 177
    .line 178
    goto :goto_0

    .line 179
    :cond_0
    sget-object v1, Lwh/h$b;->b:Lwh/h$b;

    .line 180
    .line 181
    :goto_0
    iput-object v1, p0, Lbi/d;->x:Lwh/i;

    .line 182
    .line 183
    new-instance v1, Lbi/d$b;

    .line 184
    .line 185
    invoke-direct {v1, p0}, Lbi/d$b;-><init>(Lbi/d;)V

    .line 186
    .line 187
    .line 188
    iput-object v1, p0, Lbi/d;->y:Lbi/d$b;

    .line 189
    .line 190
    sget-object v1, Lmg/y0;->e:Lmg/y0$a;

    .line 191
    .line 192
    invoke-virtual {p3}, Lzh/m;->h()Lci/n;

    .line 193
    .line 194
    .line 195
    move-result-object v2

    .line 196
    invoke-virtual {p3}, Lzh/m;->c()Lzh/k;

    .line 197
    .line 198
    .line 199
    move-result-object v3

    .line 200
    invoke-virtual {v3}, Lzh/k;->m()Lei/l;

    .line 201
    .line 202
    .line 203
    move-result-object v3

    .line 204
    invoke-interface {v3}, Lei/l;->d()Lei/g;

    .line 205
    .line 206
    .line 207
    move-result-object v3

    .line 208
    new-instance v4, Lbi/d$g;

    .line 209
    .line 210
    invoke-direct {v4, p0}, Lbi/d$g;-><init>(Ljava/lang/Object;)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v1, p0, v2, v3, v4}, Lmg/y0$a;->a(Lmg/e;Lci/n;Lei/g;Lkotlin/jvm/functions/Function1;)Lmg/y0;

    .line 214
    .line 215
    .line 216
    move-result-object v1

    .line 217
    iput-object v1, p0, Lbi/d;->z:Lmg/y0;

    .line 218
    .line 219
    const/4 v1, 0x0

    .line 220
    if-ne v0, p4, :cond_1

    .line 221
    .line 222
    new-instance p4, Lbi/d$c;

    .line 223
    .line 224
    invoke-direct {p4, p0}, Lbi/d$c;-><init>(Lbi/d;)V

    .line 225
    .line 226
    .line 227
    goto :goto_1

    .line 228
    :cond_1
    move-object p4, v1

    .line 229
    :goto_1
    iput-object p4, p0, Lbi/d;->A:Lbi/d$c;

    .line 230
    .line 231
    invoke-virtual {p1}, Lzh/m;->e()Lmg/m;

    .line 232
    .line 233
    .line 234
    move-result-object p1

    .line 235
    iput-object p1, p0, Lbi/d;->B:Lmg/m;

    .line 236
    .line 237
    invoke-virtual {p3}, Lzh/m;->h()Lci/n;

    .line 238
    .line 239
    .line 240
    move-result-object p4

    .line 241
    new-instance v0, Lbi/d$h;

    .line 242
    .line 243
    invoke-direct {v0, p0}, Lbi/d$h;-><init>(Lbi/d;)V

    .line 244
    .line 245
    .line 246
    invoke-interface {p4, v0}, Lci/n;->f(Lkotlin/jvm/functions/Function0;)Lci/j;

    .line 247
    .line 248
    .line 249
    move-result-object p4

    .line 250
    iput-object p4, p0, Lbi/d;->C:Lci/j;

    .line 251
    .line 252
    invoke-virtual {p3}, Lzh/m;->h()Lci/n;

    .line 253
    .line 254
    .line 255
    move-result-object p4

    .line 256
    new-instance v0, Lbi/d$f;

    .line 257
    .line 258
    invoke-direct {v0, p0}, Lbi/d$f;-><init>(Lbi/d;)V

    .line 259
    .line 260
    .line 261
    invoke-interface {p4, v0}, Lci/n;->d(Lkotlin/jvm/functions/Function0;)Lci/i;

    .line 262
    .line 263
    .line 264
    move-result-object p4

    .line 265
    iput-object p4, p0, Lbi/d;->D:Lci/i;

    .line 266
    .line 267
    invoke-virtual {p3}, Lzh/m;->h()Lci/n;

    .line 268
    .line 269
    .line 270
    move-result-object p4

    .line 271
    new-instance v0, Lbi/d$e;

    .line 272
    .line 273
    invoke-direct {v0, p0}, Lbi/d$e;-><init>(Lbi/d;)V

    .line 274
    .line 275
    .line 276
    invoke-interface {p4, v0}, Lci/n;->f(Lkotlin/jvm/functions/Function0;)Lci/j;

    .line 277
    .line 278
    .line 279
    move-result-object p4

    .line 280
    iput-object p4, p0, Lbi/d;->E:Lci/j;

    .line 281
    .line 282
    invoke-virtual {p3}, Lzh/m;->h()Lci/n;

    .line 283
    .line 284
    .line 285
    move-result-object p4

    .line 286
    new-instance v0, Lbi/d$i;

    .line 287
    .line 288
    invoke-direct {v0, p0}, Lbi/d$i;-><init>(Lbi/d;)V

    .line 289
    .line 290
    .line 291
    invoke-interface {p4, v0}, Lci/n;->d(Lkotlin/jvm/functions/Function0;)Lci/i;

    .line 292
    .line 293
    .line 294
    move-result-object p4

    .line 295
    iput-object p4, p0, Lbi/d;->F:Lci/i;

    .line 296
    .line 297
    invoke-virtual {p3}, Lzh/m;->h()Lci/n;

    .line 298
    .line 299
    .line 300
    move-result-object p4

    .line 301
    new-instance v0, Lbi/d$j;

    .line 302
    .line 303
    invoke-direct {v0, p0}, Lbi/d$j;-><init>(Lbi/d;)V

    .line 304
    .line 305
    .line 306
    invoke-interface {p4, v0}, Lci/n;->f(Lkotlin/jvm/functions/Function0;)Lci/j;

    .line 307
    .line 308
    .line 309
    move-result-object p4

    .line 310
    iput-object p4, p0, Lbi/d;->G:Lci/j;

    .line 311
    .line 312
    new-instance p4, Lzh/z$a;

    .line 313
    .line 314
    invoke-virtual {p3}, Lzh/m;->g()Lih/c;

    .line 315
    .line 316
    .line 317
    move-result-object v4

    .line 318
    invoke-virtual {p3}, Lzh/m;->j()Lih/g;

    .line 319
    .line 320
    .line 321
    move-result-object v5

    .line 322
    instance-of v0, p1, Lbi/d;

    .line 323
    .line 324
    if-eqz v0, :cond_2

    .line 325
    .line 326
    check-cast p1, Lbi/d;

    .line 327
    .line 328
    goto :goto_2

    .line 329
    :cond_2
    move-object p1, v1

    .line 330
    :goto_2
    if-eqz p1, :cond_3

    .line 331
    .line 332
    iget-object v1, p1, Lbi/d;->H:Lzh/z$a;

    .line 333
    .line 334
    :cond_3
    move-object v7, v1

    .line 335
    move-object v2, p4

    .line 336
    move-object v3, p2

    .line 337
    move-object v6, p5

    .line 338
    invoke-direct/range {v2 .. v7}, Lzh/z$a;-><init>(Lgh/c;Lih/c;Lih/g;Lmg/a1;Lzh/z$a;)V

    .line 339
    .line 340
    .line 341
    iput-object p4, p0, Lbi/d;->H:Lzh/z$a;

    .line 342
    .line 343
    sget-object p1, Lih/b;->c:Lih/b$b;

    .line 344
    .line 345
    invoke-virtual {p2}, Lgh/c;->E0()I

    .line 346
    .line 347
    .line 348
    move-result p2

    .line 349
    invoke-virtual {p1, p2}, Lih/b$b;->g(I)Ljava/lang/Boolean;

    .line 350
    .line 351
    .line 352
    move-result-object p1

    .line 353
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 354
    .line 355
    .line 356
    move-result p1

    .line 357
    if-nez p1, :cond_4

    .line 358
    .line 359
    sget-object p1, Lng/g;->f:Lng/g$a;

    .line 360
    .line 361
    invoke-virtual {p1}, Lng/g$a;->b()Lng/g;

    .line 362
    .line 363
    .line 364
    move-result-object p1

    .line 365
    goto :goto_3

    .line 366
    :cond_4
    new-instance p1, Lbi/n;

    .line 367
    .line 368
    invoke-virtual {p3}, Lzh/m;->h()Lci/n;

    .line 369
    .line 370
    .line 371
    move-result-object p2

    .line 372
    new-instance p3, Lbi/d$d;

    .line 373
    .line 374
    invoke-direct {p3, p0}, Lbi/d$d;-><init>(Lbi/d;)V

    .line 375
    .line 376
    .line 377
    invoke-direct {p1, p2, p3}, Lbi/n;-><init>(Lci/n;Lkotlin/jvm/functions/Function0;)V

    .line 378
    .line 379
    .line 380
    :goto_3
    iput-object p1, p0, Lbi/d;->I:Lng/g;

    .line 381
    .line 382
    return-void
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

.method public static final synthetic K0(Lbi/d;)Lmg/e;
    .locals 0

    invoke-direct {p0}, Lbi/d;->S0()Lmg/e;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic L0(Lbi/d;)Ljava/util/Collection;
    .locals 0

    invoke-direct {p0}, Lbi/d;->T0()Ljava/util/Collection;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic M0(Lbi/d;)Lmg/d;
    .locals 0

    invoke-direct {p0}, Lbi/d;->W0()Lmg/d;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic N0(Lbi/d;)Ljava/util/Collection;
    .locals 0

    invoke-direct {p0}, Lbi/d;->Y0()Ljava/util/Collection;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic O0(Lbi/d;)Lmg/h1;
    .locals 0

    invoke-direct {p0}, Lbi/d;->Z0()Lmg/h1;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic P0(Lbi/d;)Llh/b;
    .locals 0

    iget-object p0, p0, Lbi/d;->s:Llh/b;

    return-object p0
.end method

.method public static final synthetic Q0(Lbi/d;)Lbi/d$c;
    .locals 0

    iget-object p0, p0, Lbi/d;->A:Lbi/d$c;

    return-object p0
.end method

.method public static final synthetic R0(Lbi/d;)Lbi/d$b;
    .locals 0

    iget-object p0, p0, Lbi/d;->y:Lbi/d$b;

    return-object p0
.end method

.method private final S0()Lmg/e;
    .locals 4

    .line 1
    iget-object v0, p0, Lbi/d;->p:Lgh/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lgh/c;->l1()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    return-object v1

    .line 11
    :cond_0
    iget-object v0, p0, Lbi/d;->w:Lzh/m;

    .line 12
    .line 13
    invoke-virtual {v0}, Lzh/m;->g()Lih/c;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v2, p0, Lbi/d;->p:Lgh/c;

    .line 18
    .line 19
    invoke-virtual {v2}, Lgh/c;->r0()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    invoke-static {v0, v2}, Lzh/x;->b(Lih/c;I)Llh/f;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-direct {p0}, Lbi/d;->c1()Lbi/d$a;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    sget-object v3, Lug/d;->B:Lug/d;

    .line 32
    .line 33
    invoke-virtual {v2, v0, v3}, Lbi/d$a;->g(Llh/f;Lug/b;)Lmg/h;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    instance-of v2, v0, Lmg/e;

    .line 38
    .line 39
    if-eqz v2, :cond_1

    .line 40
    .line 41
    move-object v1, v0

    .line 42
    check-cast v1, Lmg/e;

    .line 43
    .line 44
    :cond_1
    return-object v1
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

.method private final T0()Ljava/util/Collection;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lmg/d;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lbi/d;->X0()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lbi/d;->R()Lmg/d;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v1}, Lkotlin/collections/h;->m(Ljava/lang/Object;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-static {v0, v1}, Lkotlin/collections/h;->o0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v1, p0, Lbi/d;->w:Lzh/m;

    .line 18
    .line 19
    invoke-virtual {v1}, Lzh/m;->c()Lzh/k;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v1}, Lzh/k;->c()Log/a;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-interface {v1, p0}, Log/a;->a(Lmg/e;)Ljava/util/Collection;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-static {v0, v1}, Lkotlin/collections/h;->o0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    return-object v0
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
.end method

.method private final U0()Lmg/z;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lmg/z<",
            "Ldi/o0;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lbi/d;->isInline()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Lbi/d;->J()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    return-object v1

    .line 15
    :cond_0
    invoke-virtual {p0}, Lbi/d;->J()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    iget-object v0, p0, Lbi/d;->p:Lgh/c;

    .line 22
    .line 23
    invoke-virtual {v0}, Lgh/c;->o1()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    iget-object v0, p0, Lbi/d;->p:Lgh/c;

    .line 30
    .line 31
    invoke-virtual {v0}, Lgh/c;->p1()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-nez v0, :cond_1

    .line 36
    .line 37
    iget-object v0, p0, Lbi/d;->p:Lgh/c;

    .line 38
    .line 39
    invoke-virtual {v0}, Lgh/c;->q1()Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-nez v0, :cond_1

    .line 44
    .line 45
    iget-object v0, p0, Lbi/d;->p:Lgh/c;

    .line 46
    .line 47
    invoke-virtual {v0}, Lgh/c;->M0()I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-lez v0, :cond_1

    .line 52
    .line 53
    return-object v1

    .line 54
    :cond_1
    iget-object v0, p0, Lbi/d;->p:Lgh/c;

    .line 55
    .line 56
    invoke-virtual {v0}, Lgh/c;->o1()Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    const/4 v2, 0x1

    .line 61
    if-eqz v0, :cond_2

    .line 62
    .line 63
    iget-object v0, p0, Lbi/d;->w:Lzh/m;

    .line 64
    .line 65
    invoke-virtual {v0}, Lzh/m;->g()Lih/c;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    iget-object v3, p0, Lbi/d;->p:Lgh/c;

    .line 70
    .line 71
    invoke-virtual {v3}, Lgh/c;->J0()I

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    invoke-static {v0, v3}, Lzh/x;->b(Lih/c;I)Llh/f;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    goto :goto_0

    .line 80
    :cond_2
    iget-object v0, p0, Lbi/d;->q:Lih/a;

    .line 81
    .line 82
    const/4 v3, 0x5

    .line 83
    invoke-virtual {v0, v2, v3, v2}, Lih/a;->c(III)Z

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    if-nez v0, :cond_c

    .line 88
    .line 89
    invoke-virtual {p0}, Lbi/d;->R()Lmg/d;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    if-eqz v0, :cond_b

    .line 94
    .line 95
    invoke-interface {v0}, Lmg/a;->i()Ljava/util/List;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    const-string v3, "constructor.valueParameters"

    .line 100
    .line 101
    invoke-static {v0, v3}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    invoke-static {v0}, Lkotlin/collections/h;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    check-cast v0, Lmg/j1;

    .line 109
    .line 110
    invoke-interface {v0}, Lmg/j0;->getName()Llh/f;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    const-string v3, "{\n                // Bef\u2026irst().name\n            }"

    .line 115
    .line 116
    invoke-static {v0, v3}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    :goto_0
    iget-object v3, p0, Lbi/d;->p:Lgh/c;

    .line 120
    .line 121
    iget-object v4, p0, Lbi/d;->w:Lzh/m;

    .line 122
    .line 123
    invoke-virtual {v4}, Lzh/m;->j()Lih/g;

    .line 124
    .line 125
    .line 126
    move-result-object v4

    .line 127
    invoke-static {v3, v4}, Lih/f;->i(Lgh/c;Lih/g;)Lgh/q;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    const/4 v4, 0x0

    .line 132
    if-eqz v3, :cond_3

    .line 133
    .line 134
    iget-object v5, p0, Lbi/d;->w:Lzh/m;

    .line 135
    .line 136
    invoke-virtual {v5}, Lzh/m;->i()Lzh/d0;

    .line 137
    .line 138
    .line 139
    move-result-object v5

    .line 140
    const/4 v6, 0x2

    .line 141
    invoke-static {v5, v3, v4, v6, v1}, Lzh/d0;->n(Lzh/d0;Lgh/q;ZILjava/lang/Object;)Ldi/o0;

    .line 142
    .line 143
    .line 144
    move-result-object v3

    .line 145
    if-nez v3, :cond_9

    .line 146
    .line 147
    :cond_3
    invoke-direct {p0}, Lbi/d;->c1()Lbi/d$a;

    .line 148
    .line 149
    .line 150
    move-result-object v3

    .line 151
    sget-object v5, Lug/d;->B:Lug/d;

    .line 152
    .line 153
    invoke-virtual {v3, v0, v5}, Lbi/d$a;->d(Llh/f;Lug/b;)Ljava/util/Collection;

    .line 154
    .line 155
    .line 156
    move-result-object v3

    .line 157
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 158
    .line 159
    .line 160
    move-result-object v3

    .line 161
    move-object v6, v1

    .line 162
    move v5, v4

    .line 163
    :cond_4
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 164
    .line 165
    .line 166
    move-result v7

    .line 167
    if-eqz v7, :cond_7

    .line 168
    .line 169
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v7

    .line 173
    move-object v8, v7

    .line 174
    check-cast v8, Lmg/u0;

    .line 175
    .line 176
    invoke-interface {v8}, Lmg/a;->k0()Lmg/x0;

    .line 177
    .line 178
    .line 179
    move-result-object v8

    .line 180
    if-nez v8, :cond_5

    .line 181
    .line 182
    move v8, v2

    .line 183
    goto :goto_2

    .line 184
    :cond_5
    move v8, v4

    .line 185
    :goto_2
    if-eqz v8, :cond_4

    .line 186
    .line 187
    if-eqz v5, :cond_6

    .line 188
    .line 189
    goto :goto_3

    .line 190
    :cond_6
    move v5, v2

    .line 191
    move-object v6, v7

    .line 192
    goto :goto_1

    .line 193
    :cond_7
    if-nez v5, :cond_8

    .line 194
    .line 195
    goto :goto_3

    .line 196
    :cond_8
    move-object v1, v6

    .line 197
    :goto_3
    check-cast v1, Lmg/u0;

    .line 198
    .line 199
    if-eqz v1, :cond_a

    .line 200
    .line 201
    invoke-interface {v1}, Lmg/i1;->getType()Ldi/g0;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    const-string v2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType"

    .line 206
    .line 207
    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    move-object v3, v1

    .line 211
    check-cast v3, Ldi/o0;

    .line 212
    .line 213
    :cond_9
    new-instance v1, Lmg/z;

    .line 214
    .line 215
    invoke-direct {v1, v0, v3}, Lmg/z;-><init>(Llh/f;Lhi/k;)V

    .line 216
    .line 217
    .line 218
    return-object v1

    .line 219
    :cond_a
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 220
    .line 221
    new-instance v1, Ljava/lang/StringBuilder;

    .line 222
    .line 223
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 224
    .line 225
    .line 226
    const-string v2, "Value class has no underlying property: "

    .line 227
    .line 228
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 232
    .line 233
    .line 234
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v1

    .line 238
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v1

    .line 242
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    throw v0

    .line 246
    :cond_b
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 247
    .line 248
    new-instance v1, Ljava/lang/StringBuilder;

    .line 249
    .line 250
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 251
    .line 252
    .line 253
    const-string v2, "Inline class has no primary constructor: "

    .line 254
    .line 255
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 259
    .line 260
    .line 261
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v1

    .line 265
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v1

    .line 269
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 270
    .line 271
    .line 272
    throw v0

    .line 273
    :cond_c
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 274
    .line 275
    new-instance v1, Ljava/lang/StringBuilder;

    .line 276
    .line 277
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 278
    .line 279
    .line 280
    const-string v2, "Inline class has no underlying property name in metadata: "

    .line 281
    .line 282
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 283
    .line 284
    .line 285
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 286
    .line 287
    .line 288
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v1

    .line 292
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v1

    .line 296
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 297
    .line 298
    .line 299
    throw v0
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

.method private final V0()Lmg/i0;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lmg/i0<",
            "Ldi/o0;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lbi/d;->p:Lgh/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lgh/c;->N0()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "classProto.multiFieldValueClassUnderlyingNameList"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    new-instance v1, Ljava/util/ArrayList;

    .line 13
    .line 14
    const/16 v2, 0xa

    .line 15
    .line 16
    invoke-static {v0, v2}, Lkotlin/collections/h;->t(Ljava/lang/Iterable;I)I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 21
    .line 22
    .line 23
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    const-string v4, "it"

    .line 32
    .line 33
    if-eqz v3, :cond_0

    .line 34
    .line 35
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    check-cast v3, Ljava/lang/Integer;

    .line 40
    .line 41
    iget-object v5, p0, Lbi/d;->w:Lzh/m;

    .line 42
    .line 43
    invoke-virtual {v5}, Lzh/m;->g()Lih/c;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    invoke-static {v3, v4}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    invoke-static {v5, v3}, Lzh/x;->b(Lih/c;I)Llh/f;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    xor-int/lit8 v0, v0, 0x1

    .line 67
    .line 68
    const/4 v3, 0x0

    .line 69
    if-eqz v0, :cond_1

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_1
    move-object v1, v3

    .line 73
    :goto_1
    if-nez v1, :cond_2

    .line 74
    .line 75
    return-object v3

    .line 76
    :cond_2
    invoke-virtual {p0}, Lbi/d;->J()Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-eqz v0, :cond_7

    .line 81
    .line 82
    iget-object v0, p0, Lbi/d;->p:Lgh/c;

    .line 83
    .line 84
    invoke-virtual {v0}, Lgh/c;->Q0()I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    iget-object v5, p0, Lbi/d;->p:Lgh/c;

    .line 89
    .line 90
    invoke-virtual {v5}, Lgh/c;->P0()I

    .line 91
    .line 92
    .line 93
    move-result v5

    .line 94
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 99
    .line 100
    .line 101
    move-result-object v5

    .line 102
    invoke-static {v0, v5}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 107
    .line 108
    .line 109
    move-result v5

    .line 110
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 111
    .line 112
    .line 113
    move-result-object v5

    .line 114
    const/4 v6, 0x0

    .line 115
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 116
    .line 117
    .line 118
    move-result-object v7

    .line 119
    invoke-static {v5, v7}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 120
    .line 121
    .line 122
    move-result-object v5

    .line 123
    invoke-static {v0, v5}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v5

    .line 127
    if-eqz v5, :cond_3

    .line 128
    .line 129
    iget-object v0, p0, Lbi/d;->p:Lgh/c;

    .line 130
    .line 131
    invoke-virtual {v0}, Lgh/c;->R0()Ljava/util/List;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    const-string v5, "classProto.multiFieldVal\u2026ClassUnderlyingTypeIdList"

    .line 136
    .line 137
    invoke-static {v0, v5}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    new-instance v5, Ljava/util/ArrayList;

    .line 141
    .line 142
    invoke-static {v0, v2}, Lkotlin/collections/h;->t(Ljava/lang/Iterable;I)I

    .line 143
    .line 144
    .line 145
    move-result v7

    .line 146
    invoke-direct {v5, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 147
    .line 148
    .line 149
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 154
    .line 155
    .line 156
    move-result v7

    .line 157
    if-eqz v7, :cond_4

    .line 158
    .line 159
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v7

    .line 163
    check-cast v7, Ljava/lang/Integer;

    .line 164
    .line 165
    iget-object v8, p0, Lbi/d;->w:Lzh/m;

    .line 166
    .line 167
    invoke-virtual {v8}, Lzh/m;->j()Lih/g;

    .line 168
    .line 169
    .line 170
    move-result-object v8

    .line 171
    invoke-static {v7, v4}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 175
    .line 176
    .line 177
    move-result v7

    .line 178
    invoke-virtual {v8, v7}, Lih/g;->a(I)Lgh/q;

    .line 179
    .line 180
    .line 181
    move-result-object v7

    .line 182
    invoke-interface {v5, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    goto :goto_2

    .line 186
    :cond_3
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 187
    .line 188
    .line 189
    move-result-object v5

    .line 190
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 191
    .line 192
    .line 193
    move-result v7

    .line 194
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 195
    .line 196
    .line 197
    move-result-object v7

    .line 198
    invoke-static {v5, v7}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 199
    .line 200
    .line 201
    move-result-object v5

    .line 202
    invoke-static {v0, v5}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    move-result v0

    .line 206
    if-eqz v0, :cond_6

    .line 207
    .line 208
    iget-object v0, p0, Lbi/d;->p:Lgh/c;

    .line 209
    .line 210
    invoke-virtual {v0}, Lgh/c;->S0()Ljava/util/List;

    .line 211
    .line 212
    .line 213
    move-result-object v5

    .line 214
    :cond_4
    const-string v0, "when (typeIdCount to typ\u2026tation: $this\")\n        }"

    .line 215
    .line 216
    invoke-static {v5, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    new-instance v0, Ljava/util/ArrayList;

    .line 220
    .line 221
    invoke-static {v5, v2}, Lkotlin/collections/h;->t(Ljava/lang/Iterable;I)I

    .line 222
    .line 223
    .line 224
    move-result v2

    .line 225
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 226
    .line 227
    .line 228
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 229
    .line 230
    .line 231
    move-result-object v2

    .line 232
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 233
    .line 234
    .line 235
    move-result v5

    .line 236
    if-eqz v5, :cond_5

    .line 237
    .line 238
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v5

    .line 242
    check-cast v5, Lgh/q;

    .line 243
    .line 244
    iget-object v7, p0, Lbi/d;->w:Lzh/m;

    .line 245
    .line 246
    invoke-virtual {v7}, Lzh/m;->i()Lzh/d0;

    .line 247
    .line 248
    .line 249
    move-result-object v7

    .line 250
    invoke-static {v5, v4}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    const/4 v8, 0x2

    .line 254
    invoke-static {v7, v5, v6, v8, v3}, Lzh/d0;->n(Lzh/d0;Lgh/q;ZILjava/lang/Object;)Ldi/o0;

    .line 255
    .line 256
    .line 257
    move-result-object v5

    .line 258
    invoke-interface {v0, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    goto :goto_3

    .line 262
    :cond_5
    new-instance v2, Lmg/i0;

    .line 263
    .line 264
    invoke-static {v1, v0}, Lkotlin/collections/h;->K0(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/List;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    invoke-direct {v2, v0}, Lmg/i0;-><init>(Ljava/util/List;)V

    .line 269
    .line 270
    .line 271
    return-object v2

    .line 272
    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 273
    .line 274
    new-instance v1, Ljava/lang/StringBuilder;

    .line 275
    .line 276
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 277
    .line 278
    .line 279
    const-string v2, "Illegal multi-field value class representation: "

    .line 280
    .line 281
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 282
    .line 283
    .line 284
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 285
    .line 286
    .line 287
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v1

    .line 291
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v1

    .line 295
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 296
    .line 297
    .line 298
    throw v0

    .line 299
    :cond_7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 300
    .line 301
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 302
    .line 303
    .line 304
    const-string v1, "Not a value class: "

    .line 305
    .line 306
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 307
    .line 308
    .line 309
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 310
    .line 311
    .line 312
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object v0

    .line 316
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 317
    .line 318
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 323
    .line 324
    .line 325
    throw v1
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

.method private final W0()Lmg/d;
    .locals 6

    .line 1
    iget-object v0, p0, Lbi/d;->v:Lmg/f;

    .line 2
    .line 3
    invoke-virtual {v0}, Lmg/f;->b()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Lmg/a1;->a:Lmg/a1;

    .line 10
    .line 11
    invoke-static {p0, v0}, Lph/d;->l(Lmg/e;Lmg/a1;)Lpg/f;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p0}, Lpg/a;->s()Ldi/o0;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v0, v1}, Lpg/p;->g1(Ldi/g0;)V

    .line 20
    .line 21
    .line 22
    return-object v0

    .line 23
    :cond_0
    iget-object v0, p0, Lbi/d;->p:Lgh/c;

    .line 24
    .line 25
    invoke-virtual {v0}, Lgh/c;->u0()Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const-string v1, "classProto.constructorList"

    .line 30
    .line 31
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    const/4 v2, 0x1

    .line 43
    const/4 v3, 0x0

    .line 44
    if-eqz v1, :cond_2

    .line 45
    .line 46
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    move-object v4, v1

    .line 51
    check-cast v4, Lgh/d;

    .line 52
    .line 53
    sget-object v5, Lih/b;->m:Lih/b$b;

    .line 54
    .line 55
    invoke-virtual {v4}, Lgh/d;->K()I

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    invoke-virtual {v5, v4}, Lih/b$b;->g(I)Ljava/lang/Boolean;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    xor-int/2addr v4, v2

    .line 68
    if-eqz v4, :cond_1

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_2
    move-object v1, v3

    .line 72
    :goto_0
    check-cast v1, Lgh/d;

    .line 73
    .line 74
    if-eqz v1, :cond_3

    .line 75
    .line 76
    iget-object v0, p0, Lbi/d;->w:Lzh/m;

    .line 77
    .line 78
    invoke-virtual {v0}, Lzh/m;->f()Lzh/w;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-virtual {v0, v1, v2}, Lzh/w;->i(Lgh/d;Z)Lmg/d;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    :cond_3
    return-object v3
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

.method private final X0()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lmg/d;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lbi/d;->p:Lgh/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lgh/c;->u0()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "classProto.constructorList"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    new-instance v1, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    move-object v3, v2

    .line 32
    check-cast v3, Lgh/d;

    .line 33
    .line 34
    sget-object v4, Lih/b;->m:Lih/b$b;

    .line 35
    .line 36
    invoke-virtual {v3}, Lgh/d;->K()I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    invoke-virtual {v4, v3}, Lih/b$b;->g(I)Ljava/lang/Boolean;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    const-string v4, "IS_SECONDARY.get(it.flags)"

    .line 45
    .line 46
    invoke-static {v3, v4}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-eqz v3, :cond_0

    .line 54
    .line 55
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    .line 60
    .line 61
    const/16 v2, 0xa

    .line 62
    .line 63
    invoke-static {v1, v2}, Lkotlin/collections/h;->t(Ljava/lang/Iterable;I)I

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 68
    .line 69
    .line 70
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-eqz v2, :cond_2

    .line 79
    .line 80
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    check-cast v2, Lgh/d;

    .line 85
    .line 86
    iget-object v3, p0, Lbi/d;->w:Lzh/m;

    .line 87
    .line 88
    invoke-virtual {v3}, Lzh/m;->f()Lzh/w;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    const-string v4, "it"

    .line 93
    .line 94
    invoke-static {v2, v4}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    const/4 v4, 0x0

    .line 98
    invoke-virtual {v3, v2, v4}, Lzh/w;->i(Lgh/d;Z)Lmg/d;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_2
    return-object v0
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

.method private final Y0()Ljava/util/Collection;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lmg/e;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lbi/d;->t:Lmg/e0;

    .line 2
    .line 3
    sget-object v1, Lmg/e0;->m:Lmg/e0;

    .line 4
    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    invoke-static {}, Lkotlin/collections/h;->i()Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0

    .line 12
    :cond_0
    iget-object v0, p0, Lbi/d;->p:Lgh/c;

    .line 13
    .line 14
    invoke-virtual {v0}, Lgh/c;->X0()Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v1, "fqNames"

    .line 19
    .line 20
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    xor-int/lit8 v1, v1, 0x1

    .line 28
    .line 29
    if-eqz v1, :cond_3

    .line 30
    .line 31
    new-instance v1, Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 34
    .line 35
    .line 36
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-eqz v2, :cond_2

    .line 45
    .line 46
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    check-cast v2, Ljava/lang/Integer;

    .line 51
    .line 52
    iget-object v3, p0, Lbi/d;->w:Lzh/m;

    .line 53
    .line 54
    invoke-virtual {v3}, Lzh/m;->c()Lzh/k;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    iget-object v4, p0, Lbi/d;->w:Lzh/m;

    .line 59
    .line 60
    invoke-virtual {v4}, Lzh/m;->g()Lih/c;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    const-string v5, "index"

    .line 65
    .line 66
    invoke-static {v2, v5}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    invoke-static {v4, v2}, Lzh/x;->a(Lih/c;I)Llh/b;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    invoke-virtual {v3, v2}, Lzh/k;->b(Llh/b;)Lmg/e;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    if-eqz v2, :cond_1

    .line 82
    .line 83
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_2
    return-object v1

    .line 88
    :cond_3
    sget-object v0, Lph/a;->a:Lph/a;

    .line 89
    .line 90
    const/4 v1, 0x0

    .line 91
    invoke-virtual {v0, p0, v1}, Lph/a;->a(Lmg/e;Z)Ljava/util/Collection;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    return-object v0
    .line 96
    .line 97
.end method

.method private final Z0()Lmg/h1;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lmg/h1<",
            "Ldi/o0;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lbi/d;->U0()Lmg/z;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0}, Lbi/d;->V0()Lmg/i0;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 15
    .line 16
    new-instance v1, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    const-string v2, "Class cannot have both inline class representation and multi field class representation: "

    .line 22
    .line 23
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw v0

    .line 37
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lbi/d;->J()Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-nez v2, :cond_2

    .line 42
    .line 43
    invoke-virtual {p0}, Lbi/d;->isInline()Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-eqz v2, :cond_4

    .line 48
    .line 49
    :cond_2
    if-nez v0, :cond_4

    .line 50
    .line 51
    if-eqz v1, :cond_3

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 55
    .line 56
    new-instance v1, Ljava/lang/StringBuilder;

    .line 57
    .line 58
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 59
    .line 60
    .line 61
    const-string v2, "Value class has no value class representation: "

    .line 62
    .line 63
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    throw v0

    .line 77
    :cond_4
    :goto_1
    if-eqz v0, :cond_5

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_5
    move-object v0, v1

    .line 81
    :goto_2
    return-object v0
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

.method private final c1()Lbi/d$a;
    .locals 2

    iget-object v0, p0, Lbi/d;->z:Lmg/y0;

    iget-object v1, p0, Lbi/d;->w:Lzh/m;

    invoke-virtual {v1}, Lzh/m;->c()Lzh/k;

    move-result-object v1

    invoke-virtual {v1}, Lzh/k;->m()Lei/l;

    move-result-object v1

    invoke-interface {v1}, Lei/l;->d()Lei/g;

    move-result-object v1

    invoke-virtual {v0, v1}, Lmg/y0;->c(Lei/g;)Lwh/h;

    move-result-object v0

    check-cast v0, Lbi/d$a;

    return-object v0
.end method


# virtual methods
.method public C()Z
    .locals 2

    sget-object v0, Lih/b;->l:Lih/b$b;

    iget-object v1, p0, Lbi/d;->p:Lgh/c;

    invoke-virtual {v1}, Lgh/c;->E0()I

    move-result v1

    invoke-virtual {v0, v1}, Lih/b$b;->g(I)Ljava/lang/Boolean;

    move-result-object v0

    const-string v1, "IS_FUN_INTERFACE.get(classProto.flags)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public E0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public H0()Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lmg/x0;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lbi/d;->p:Lgh/c;

    .line 2
    .line 3
    iget-object v1, p0, Lbi/d;->w:Lzh/m;

    .line 4
    .line 5
    invoke-virtual {v1}, Lzh/m;->j()Lih/g;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v0, v1}, Lih/f;->b(Lgh/c;Lih/g;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    new-instance v1, Ljava/util/ArrayList;

    .line 14
    .line 15
    const/16 v2, 0xa

    .line 16
    .line 17
    invoke-static {v0, v2}, Lkotlin/collections/h;->t(Ljava/lang/Iterable;I)I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 22
    .line 23
    .line 24
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_0

    .line 33
    .line 34
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    check-cast v2, Lgh/q;

    .line 39
    .line 40
    iget-object v3, p0, Lbi/d;->w:Lzh/m;

    .line 41
    .line 42
    invoke-virtual {v3}, Lzh/m;->i()Lzh/d0;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-virtual {v3, v2}, Lzh/d0;->q(Lgh/q;)Ldi/g0;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    new-instance v3, Lpg/f0;

    .line 51
    .line 52
    invoke-virtual {p0}, Lpg/a;->J0()Lmg/x0;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    new-instance v5, Lxh/b;

    .line 57
    .line 58
    const/4 v6, 0x0

    .line 59
    invoke-direct {v5, p0, v2, v6, v6}, Lxh/b;-><init>(Lmg/e;Ldi/g0;Llh/f;Lxh/g;)V

    .line 60
    .line 61
    .line 62
    sget-object v2, Lng/g;->f:Lng/g$a;

    .line 63
    .line 64
    invoke-virtual {v2}, Lng/g$a;->b()Lng/g;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-direct {v3, v4, v5, v2}, Lpg/f0;-><init>(Lmg/m;Lxh/g;Lng/g;)V

    .line 69
    .line 70
    .line 71
    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_0
    return-object v1
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

.method public I()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lmg/e;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lbi/d;->F:Lci/i;

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    return-object v0
.end method

.method public I0()Z
    .locals 2

    sget-object v0, Lih/b;->h:Lih/b$b;

    iget-object v1, p0, Lbi/d;->p:Lgh/c;

    invoke-virtual {v1}, Lgh/c;->E0()I

    move-result v1

    invoke-virtual {v0, v1}, Lih/b$b;->g(I)Ljava/lang/Boolean;

    move-result-object v0

    const-string v1, "IS_DATA.get(classProto.flags)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public J()Z
    .locals 4

    sget-object v0, Lih/b;->k:Lih/b$b;

    iget-object v1, p0, Lbi/d;->p:Lgh/c;

    invoke-virtual {v1}, Lgh/c;->E0()I

    move-result v1

    invoke-virtual {v0, v1}, Lih/b$b;->g(I)Ljava/lang/Boolean;

    move-result-object v0

    const-string v1, "IS_VALUE_CLASS.get(classProto.flags)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbi/d;->q:Lih/a;

    const/4 v1, 0x4

    const/4 v2, 0x2

    const/4 v3, 0x1

    invoke-virtual {v0, v3, v1, v2}, Lih/a;->c(III)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    return v3
.end method

.method public K()Z
    .locals 2

    sget-object v0, Lih/b;->j:Lih/b$b;

    iget-object v1, p0, Lbi/d;->p:Lgh/c;

    invoke-virtual {v1}, Lgh/c;->E0()I

    move-result v1

    invoke-virtual {v0, v1}, Lih/b$b;->g(I)Ljava/lang/Boolean;

    move-result-object v0

    const-string v1, "IS_EXPECT_CLASS.get(classProto.flags)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public L()Z
    .locals 2

    sget-object v0, Lih/b;->g:Lih/b$b;

    iget-object v1, p0, Lbi/d;->p:Lgh/c;

    invoke-virtual {v1}, Lgh/c;->E0()I

    move-result v1

    invoke-virtual {v0, v1}, Lih/b$b;->g(I)Ljava/lang/Boolean;

    move-result-object v0

    const-string v1, "IS_INNER.get(classProto.flags)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public R()Lmg/d;
    .locals 1

    iget-object v0, p0, Lbi/d;->C:Lci/j;

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lmg/d;

    return-object v0
.end method

.method public bridge synthetic S()Lwh/h;
    .locals 1

    invoke-virtual {p0}, Lbi/d;->e1()Lwh/i;

    move-result-object v0

    return-object v0
.end method

.method public U()Lmg/e;
    .locals 1

    iget-object v0, p0, Lbi/d;->E:Lci/j;

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lmg/e;

    return-object v0
.end method

.method public final a1()Lzh/m;
    .locals 1

    iget-object v0, p0, Lbi/d;->w:Lzh/m;

    return-object v0
.end method

.method public b()Lmg/m;
    .locals 1

    iget-object v0, p0, Lbi/d;->B:Lmg/m;

    return-object v0
.end method

.method public final b1()Lgh/c;
    .locals 1

    iget-object v0, p0, Lbi/d;->p:Lgh/c;

    return-object v0
.end method

.method protected c0(Lei/g;)Lwh/h;
    .locals 1

    .line 1
    const-string v0, "kotlinTypeRefiner"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lbi/d;->z:Lmg/y0;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lmg/y0;->c(Lei/g;)Lwh/h;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
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
.end method

.method public final d1()Lih/a;
    .locals 1

    iget-object v0, p0, Lbi/d;->q:Lih/a;

    return-object v0
.end method

.method public e1()Lwh/i;
    .locals 1

    iget-object v0, p0, Lbi/d;->x:Lwh/i;

    return-object v0
.end method

.method public final f1()Lzh/z$a;
    .locals 1

    iget-object v0, p0, Lbi/d;->H:Lzh/z$a;

    return-object v0
.end method

.method public g()Lmg/f;
    .locals 1

    iget-object v0, p0, Lbi/d;->v:Lmg/f;

    return-object v0
.end method

.method public final g1(Llh/f;)Z
    .locals 1

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lbi/d;->c1()Lbi/d$a;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lbi/h;->q()Ljava/util/Set;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    return p1
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

.method public getAnnotations()Lng/g;
    .locals 1

    iget-object v0, p0, Lbi/d;->I:Lng/g;

    return-object v0
.end method

.method public getVisibility()Lmg/u;
    .locals 1

    iget-object v0, p0, Lbi/d;->u:Lmg/u;

    return-object v0
.end method

.method public isExternal()Z
    .locals 2

    sget-object v0, Lih/b;->i:Lih/b$b;

    iget-object v1, p0, Lbi/d;->p:Lgh/c;

    invoke-virtual {v1}, Lgh/c;->E0()I

    move-result v1

    invoke-virtual {v0, v1}, Lih/b$b;->g(I)Ljava/lang/Boolean;

    move-result-object v0

    const-string v1, "IS_EXTERNAL_CLASS.get(classProto.flags)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isInline()Z
    .locals 3

    sget-object v0, Lih/b;->k:Lih/b$b;

    iget-object v1, p0, Lbi/d;->p:Lgh/c;

    invoke-virtual {v1}, Lgh/c;->E0()I

    move-result v1

    invoke-virtual {v0, v1}, Lih/b$b;->g(I)Ljava/lang/Boolean;

    move-result-object v0

    const-string v1, "IS_VALUE_CLASS.get(classProto.flags)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbi/d;->q:Lih/a;

    const/4 v1, 0x4

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1, v2}, Lih/a;->e(III)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    return v2
.end method

.method public j()Lmg/a1;
    .locals 1

    iget-object v0, p0, Lbi/d;->r:Lmg/a1;

    return-object v0
.end method

.method public k()Ldi/g1;
    .locals 1

    iget-object v0, p0, Lbi/d;->y:Lbi/d$b;

    return-object v0
.end method

.method public l()Lmg/e0;
    .locals 1

    iget-object v0, p0, Lbi/d;->t:Lmg/e0;

    return-object v0
.end method

.method public m()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lmg/d;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lbi/d;->D:Lci/i;

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "deserialized "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lbi/d;->K()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "expect "

    goto :goto_0

    :cond_0
    const-string v1, ""

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "class "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpg/a;->getName()Llh/f;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lmg/f1;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lbi/d;->w:Lzh/m;

    invoke-virtual {v0}, Lzh/m;->i()Lzh/d0;

    move-result-object v0

    invoke-virtual {v0}, Lzh/d0;->j()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public x()Z
    .locals 2

    sget-object v0, Lih/b;->f:Lih/b$d;

    iget-object v1, p0, Lbi/d;->p:Lgh/c;

    invoke-virtual {v1}, Lgh/c;->E0()I

    move-result v1

    invoke-virtual {v0, v1}, Lih/b$d;->d(I)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lgh/c$c;->r:Lgh/c$c;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public z0()Lmg/h1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lmg/h1<",
            "Ldi/o0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lbi/d;->G:Lci/j;

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lmg/h1;

    return-object v0
.end method
