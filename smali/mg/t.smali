.class public Lmg/t;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lmg/u;

.field public static final b:Lmg/u;

.field public static final c:Lmg/u;

.field public static final d:Lmg/u;

.field public static final e:Lmg/u;

.field public static final f:Lmg/u;

.field public static final g:Lmg/u;

.field public static final h:Lmg/u;

.field public static final i:Lmg/u;

.field public static final j:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lmg/u;",
            ">;"
        }
    .end annotation
.end field

.field private static final k:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lmg/u;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final l:Lmg/u;

.field private static final m:Lxh/g;

.field public static final n:Lxh/g;

.field public static final o:Lxh/g;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private static final p:Lki/l;

.field private static final q:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lmg/n1;",
            "Lmg/u;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 15

    .line 1
    new-instance v0, Lmg/t$d;

    .line 2
    .line 3
    sget-object v1, Lmg/m1$e;->c:Lmg/m1$e;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lmg/t$d;-><init>(Lmg/n1;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lmg/t;->a:Lmg/u;

    .line 9
    .line 10
    new-instance v1, Lmg/t$e;

    .line 11
    .line 12
    sget-object v2, Lmg/m1$f;->c:Lmg/m1$f;

    .line 13
    .line 14
    invoke-direct {v1, v2}, Lmg/t$e;-><init>(Lmg/n1;)V

    .line 15
    .line 16
    .line 17
    sput-object v1, Lmg/t;->b:Lmg/u;

    .line 18
    .line 19
    new-instance v2, Lmg/t$f;

    .line 20
    .line 21
    sget-object v3, Lmg/m1$g;->c:Lmg/m1$g;

    .line 22
    .line 23
    invoke-direct {v2, v3}, Lmg/t$f;-><init>(Lmg/n1;)V

    .line 24
    .line 25
    .line 26
    sput-object v2, Lmg/t;->c:Lmg/u;

    .line 27
    .line 28
    new-instance v3, Lmg/t$g;

    .line 29
    .line 30
    sget-object v4, Lmg/m1$b;->c:Lmg/m1$b;

    .line 31
    .line 32
    invoke-direct {v3, v4}, Lmg/t$g;-><init>(Lmg/n1;)V

    .line 33
    .line 34
    .line 35
    sput-object v3, Lmg/t;->d:Lmg/u;

    .line 36
    .line 37
    new-instance v4, Lmg/t$h;

    .line 38
    .line 39
    sget-object v5, Lmg/m1$h;->c:Lmg/m1$h;

    .line 40
    .line 41
    invoke-direct {v4, v5}, Lmg/t$h;-><init>(Lmg/n1;)V

    .line 42
    .line 43
    .line 44
    sput-object v4, Lmg/t;->e:Lmg/u;

    .line 45
    .line 46
    new-instance v5, Lmg/t$i;

    .line 47
    .line 48
    sget-object v6, Lmg/m1$d;->c:Lmg/m1$d;

    .line 49
    .line 50
    invoke-direct {v5, v6}, Lmg/t$i;-><init>(Lmg/n1;)V

    .line 51
    .line 52
    .line 53
    sput-object v5, Lmg/t;->f:Lmg/u;

    .line 54
    .line 55
    new-instance v6, Lmg/t$j;

    .line 56
    .line 57
    sget-object v7, Lmg/m1$a;->c:Lmg/m1$a;

    .line 58
    .line 59
    invoke-direct {v6, v7}, Lmg/t$j;-><init>(Lmg/n1;)V

    .line 60
    .line 61
    .line 62
    sput-object v6, Lmg/t;->g:Lmg/u;

    .line 63
    .line 64
    new-instance v7, Lmg/t$k;

    .line 65
    .line 66
    sget-object v8, Lmg/m1$c;->c:Lmg/m1$c;

    .line 67
    .line 68
    invoke-direct {v7, v8}, Lmg/t$k;-><init>(Lmg/n1;)V

    .line 69
    .line 70
    .line 71
    sput-object v7, Lmg/t;->h:Lmg/u;

    .line 72
    .line 73
    new-instance v8, Lmg/t$l;

    .line 74
    .line 75
    sget-object v9, Lmg/m1$i;->c:Lmg/m1$i;

    .line 76
    .line 77
    invoke-direct {v8, v9}, Lmg/t$l;-><init>(Lmg/n1;)V

    .line 78
    .line 79
    .line 80
    sput-object v8, Lmg/t;->i:Lmg/u;

    .line 81
    .line 82
    const/4 v9, 0x4

    .line 83
    new-array v10, v9, [Lmg/u;

    .line 84
    .line 85
    const/4 v11, 0x0

    .line 86
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 87
    .line 88
    .line 89
    move-result-object v12

    .line 90
    aput-object v0, v10, v11

    .line 91
    .line 92
    const/4 v11, 0x1

    .line 93
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 94
    .line 95
    .line 96
    move-result-object v13

    .line 97
    aput-object v1, v10, v11

    .line 98
    .line 99
    const/4 v11, 0x2

    .line 100
    aput-object v3, v10, v11

    .line 101
    .line 102
    const/4 v14, 0x3

    .line 103
    aput-object v5, v10, v14

    .line 104
    .line 105
    invoke-static {v10}, Lkotlin/collections/u;->i([Ljava/lang/Object;)Ljava/util/Set;

    .line 106
    .line 107
    .line 108
    move-result-object v10

    .line 109
    invoke-static {v10}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 110
    .line 111
    .line 112
    move-result-object v10

    .line 113
    sput-object v10, Lmg/t;->j:Ljava/util/Set;

    .line 114
    .line 115
    invoke-static {v9}, Lni/a;->e(I)Ljava/util/HashMap;

    .line 116
    .line 117
    .line 118
    move-result-object v9

    .line 119
    invoke-interface {v9, v1, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    invoke-interface {v9, v0, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    invoke-interface {v9, v3, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    invoke-interface {v9, v2, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 132
    .line 133
    .line 134
    move-result-object v10

    .line 135
    invoke-interface {v9, v4, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    invoke-static {v9}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 139
    .line 140
    .line 141
    move-result-object v9

    .line 142
    sput-object v9, Lmg/t;->k:Ljava/util/Map;

    .line 143
    .line 144
    sput-object v4, Lmg/t;->l:Lmg/u;

    .line 145
    .line 146
    new-instance v9, Lmg/t$a;

    .line 147
    .line 148
    invoke-direct {v9}, Lmg/t$a;-><init>()V

    .line 149
    .line 150
    .line 151
    sput-object v9, Lmg/t;->m:Lxh/g;

    .line 152
    .line 153
    new-instance v9, Lmg/t$b;

    .line 154
    .line 155
    invoke-direct {v9}, Lmg/t$b;-><init>()V

    .line 156
    .line 157
    .line 158
    sput-object v9, Lmg/t;->n:Lxh/g;

    .line 159
    .line 160
    new-instance v9, Lmg/t$c;

    .line 161
    .line 162
    invoke-direct {v9}, Lmg/t$c;-><init>()V

    .line 163
    .line 164
    .line 165
    sput-object v9, Lmg/t;->o:Lxh/g;

    .line 166
    .line 167
    const-class v9, Lki/l;

    .line 168
    .line 169
    invoke-virtual {v9}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 170
    .line 171
    .line 172
    move-result-object v10

    .line 173
    invoke-static {v9, v10}, Ljava/util/ServiceLoader;->load(Ljava/lang/Class;Ljava/lang/ClassLoader;)Ljava/util/ServiceLoader;

    .line 174
    .line 175
    .line 176
    move-result-object v9

    .line 177
    invoke-virtual {v9}, Ljava/util/ServiceLoader;->iterator()Ljava/util/Iterator;

    .line 178
    .line 179
    .line 180
    move-result-object v9

    .line 181
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 182
    .line 183
    .line 184
    move-result v10

    .line 185
    if-eqz v10, :cond_0

    .line 186
    .line 187
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v9

    .line 191
    check-cast v9, Lki/l;

    .line 192
    .line 193
    goto :goto_0

    .line 194
    :cond_0
    sget-object v9, Lki/l$a;->a:Lki/l$a;

    .line 195
    .line 196
    :goto_0
    sput-object v9, Lmg/t;->p:Lki/l;

    .line 197
    .line 198
    new-instance v9, Ljava/util/HashMap;

    .line 199
    .line 200
    invoke-direct {v9}, Ljava/util/HashMap;-><init>()V

    .line 201
    .line 202
    .line 203
    sput-object v9, Lmg/t;->q:Ljava/util/Map;

    .line 204
    .line 205
    invoke-static {v0}, Lmg/t;->i(Lmg/u;)V

    .line 206
    .line 207
    .line 208
    invoke-static {v1}, Lmg/t;->i(Lmg/u;)V

    .line 209
    .line 210
    .line 211
    invoke-static {v2}, Lmg/t;->i(Lmg/u;)V

    .line 212
    .line 213
    .line 214
    invoke-static {v3}, Lmg/t;->i(Lmg/u;)V

    .line 215
    .line 216
    .line 217
    invoke-static {v4}, Lmg/t;->i(Lmg/u;)V

    .line 218
    .line 219
    .line 220
    invoke-static {v5}, Lmg/t;->i(Lmg/u;)V

    .line 221
    .line 222
    .line 223
    invoke-static {v6}, Lmg/t;->i(Lmg/u;)V

    .line 224
    .line 225
    .line 226
    invoke-static {v7}, Lmg/t;->i(Lmg/u;)V

    .line 227
    .line 228
    .line 229
    invoke-static {v8}, Lmg/t;->i(Lmg/u;)V

    .line 230
    .line 231
    .line 232
    return-void
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

.method private static synthetic a(I)V
    .locals 8

    const/16 v0, 0x10

    if-eq p0, v0, :cond_0

    const-string v1, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    goto :goto_0

    :cond_0
    const-string v1, "@NotNull method %s.%s must not return null"

    :goto_0
    const/4 v2, 0x3

    const/4 v3, 0x2

    if-eq p0, v0, :cond_1

    move v4, v2

    goto :goto_1

    :cond_1
    move v4, v3

    :goto_1
    new-array v4, v4, [Ljava/lang/Object;

    const-string v5, "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities"

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eq p0, v6, :cond_2

    if-eq p0, v2, :cond_2

    const/4 v2, 0x5

    if-eq p0, v2, :cond_2

    const/4 v2, 0x7

    if-eq p0, v2, :cond_2

    packed-switch p0, :pswitch_data_0

    const-string v2, "what"

    aput-object v2, v4, v7

    goto :goto_2

    :pswitch_0
    aput-object v5, v4, v7

    goto :goto_2

    :pswitch_1
    const-string v2, "visibility"

    aput-object v2, v4, v7

    goto :goto_2

    :pswitch_2
    const-string v2, "second"

    aput-object v2, v4, v7

    goto :goto_2

    :pswitch_3
    const-string v2, "first"

    aput-object v2, v4, v7

    goto :goto_2

    :cond_2
    :pswitch_4
    const-string v2, "from"

    aput-object v2, v4, v7

    :goto_2
    const-string v2, "toDescriptorVisibility"

    if-eq p0, v0, :cond_3

    aput-object v5, v4, v6

    goto :goto_3

    :cond_3
    aput-object v2, v4, v6

    :goto_3
    packed-switch p0, :pswitch_data_1

    const-string v2, "isVisible"

    aput-object v2, v4, v3

    goto :goto_4

    :pswitch_5
    aput-object v2, v4, v3

    goto :goto_4

    :pswitch_6
    const-string v2, "isPrivate"

    aput-object v2, v4, v3

    goto :goto_4

    :pswitch_7
    const-string v2, "compare"

    aput-object v2, v4, v3

    goto :goto_4

    :pswitch_8
    const-string v2, "compareLocal"

    aput-object v2, v4, v3

    goto :goto_4

    :pswitch_9
    const-string v2, "findInvisibleMember"

    aput-object v2, v4, v3

    goto :goto_4

    :pswitch_a
    const-string v2, "inSameFile"

    aput-object v2, v4, v3

    goto :goto_4

    :pswitch_b
    const-string v2, "isVisibleWithAnyReceiver"

    aput-object v2, v4, v3

    goto :goto_4

    :pswitch_c
    const-string v2, "isVisibleIgnoringReceiver"

    aput-object v2, v4, v3

    :goto_4
    :pswitch_d
    invoke-static {v1, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    if-eq p0, v0, :cond_4

    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_5

    :cond_4
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    :goto_5
    throw p0

    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x2
        :pswitch_c
        :pswitch_c
        :pswitch_b
        :pswitch_b
        :pswitch_a
        :pswitch_a
        :pswitch_9
        :pswitch_9
        :pswitch_8
        :pswitch_8
        :pswitch_7
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_d
    .end packed-switch
.end method

.method static synthetic b()Lxh/g;
    .locals 1

    sget-object v0, Lmg/t;->m:Lxh/g;

    return-object v0
.end method

.method static synthetic c()Lki/l;
    .locals 1

    sget-object v0, Lmg/t;->p:Lki/l;

    return-object v0
.end method

.method public static d(Lmg/u;Lmg/u;)Ljava/lang/Integer;
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/16 v0, 0xc

    .line 4
    .line 5
    invoke-static {v0}, Lmg/t;->a(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    if-nez p1, :cond_1

    .line 9
    .line 10
    const/16 v0, 0xd

    .line 11
    .line 12
    invoke-static {v0}, Lmg/t;->a(I)V

    .line 13
    .line 14
    .line 15
    :cond_1
    invoke-virtual {p0, p1}, Lmg/u;->a(Lmg/u;)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    return-object v0

    .line 22
    :cond_2
    invoke-virtual {p1, p0}, Lmg/u;->a(Lmg/u;)Ljava/lang/Integer;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    if-eqz p0, :cond_3

    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    neg-int p0, p0

    .line 33
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0

    .line 38
    :cond_3
    const/4 p0, 0x0

    .line 39
    return-object p0
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

.method public static e(Lxh/g;Lmg/q;Lmg/m;Z)Lmg/q;
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/16 v0, 0x8

    .line 4
    .line 5
    invoke-static {v0}, Lmg/t;->a(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    if-nez p2, :cond_1

    .line 9
    .line 10
    const/16 v0, 0x9

    .line 11
    .line 12
    invoke-static {v0}, Lmg/t;->a(I)V

    .line 13
    .line 14
    .line 15
    :cond_1
    invoke-interface {p1}, Lmg/m;->a()Lmg/m;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Lmg/q;

    .line 20
    .line 21
    :goto_0
    if-eqz v0, :cond_3

    .line 22
    .line 23
    invoke-interface {v0}, Lmg/q;->getVisibility()Lmg/u;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    sget-object v2, Lmg/t;->f:Lmg/u;

    .line 28
    .line 29
    if-eq v1, v2, :cond_3

    .line 30
    .line 31
    invoke-interface {v0}, Lmg/q;->getVisibility()Lmg/u;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v1, p0, v0, p2, p3}, Lmg/u;->e(Lxh/g;Lmg/q;Lmg/m;Z)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-nez v1, :cond_2

    .line 40
    .line 41
    return-object v0

    .line 42
    :cond_2
    const-class v1, Lmg/q;

    .line 43
    .line 44
    invoke-static {v0, v1}, Lph/e;->q(Lmg/m;Ljava/lang/Class;)Lmg/m;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    check-cast v0, Lmg/q;

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_3
    instance-of v0, p1, Lpg/i0;

    .line 52
    .line 53
    if-eqz v0, :cond_4

    .line 54
    .line 55
    check-cast p1, Lpg/i0;

    .line 56
    .line 57
    invoke-interface {p1}, Lpg/i0;->n0()Lmg/d;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-static {p0, p1, p2, p3}, Lmg/t;->e(Lxh/g;Lmg/q;Lmg/m;Z)Lmg/q;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    if-eqz p0, :cond_4

    .line 66
    .line 67
    return-object p0

    .line 68
    :cond_4
    const/4 p0, 0x0

    .line 69
    return-object p0
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

.method public static f(Lmg/m;Lmg/m;)Z
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x6

    .line 4
    invoke-static {v0}, Lmg/t;->a(I)V

    .line 5
    .line 6
    .line 7
    :cond_0
    if-nez p1, :cond_1

    .line 8
    .line 9
    const/4 v0, 0x7

    .line 10
    invoke-static {v0}, Lmg/t;->a(I)V

    .line 11
    .line 12
    .line 13
    :cond_1
    invoke-static {p1}, Lph/e;->j(Lmg/m;)Lmg/b1;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    sget-object v0, Lmg/b1;->a:Lmg/b1;

    .line 18
    .line 19
    if-eq p1, v0, :cond_2

    .line 20
    .line 21
    invoke-static {p0}, Lph/e;->j(Lmg/m;)Lmg/b1;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    return p0

    .line 30
    :cond_2
    const/4 p0, 0x0

    .line 31
    return p0
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

.method public static g(Lmg/u;)Z
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/16 v0, 0xe

    .line 4
    .line 5
    invoke-static {v0}, Lmg/t;->a(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    sget-object v0, Lmg/t;->a:Lmg/u;

    .line 9
    .line 10
    if-eq p0, v0, :cond_2

    .line 11
    .line 12
    sget-object v0, Lmg/t;->b:Lmg/u;

    .line 13
    .line 14
    if-ne p0, v0, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    const/4 p0, 0x0

    .line 18
    goto :goto_1

    .line 19
    :cond_2
    :goto_0
    const/4 p0, 0x1

    .line 20
    :goto_1
    return p0
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public static h(Lmg/q;Lmg/m;Z)Z
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    invoke-static {v0}, Lmg/t;->a(I)V

    .line 5
    .line 6
    .line 7
    :cond_0
    if-nez p1, :cond_1

    .line 8
    .line 9
    const/4 v0, 0x3

    .line 10
    invoke-static {v0}, Lmg/t;->a(I)V

    .line 11
    .line 12
    .line 13
    :cond_1
    sget-object v0, Lmg/t;->n:Lxh/g;

    .line 14
    .line 15
    invoke-static {v0, p0, p1, p2}, Lmg/t;->e(Lxh/g;Lmg/q;Lmg/m;Z)Lmg/q;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    if-nez p0, :cond_2

    .line 20
    .line 21
    const/4 p0, 0x1

    .line 22
    goto :goto_0

    .line 23
    :cond_2
    const/4 p0, 0x0

    .line 24
    :goto_0
    return p0
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

.method private static i(Lmg/u;)V
    .locals 2

    sget-object v0, Lmg/t;->q:Ljava/util/Map;

    invoke-virtual {p0}, Lmg/u;->b()Lmg/n1;

    move-result-object v1

    invoke-interface {v0, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static j(Lmg/n1;)Lmg/u;
    .locals 3

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/16 v0, 0xf

    .line 4
    .line 5
    invoke-static {v0}, Lmg/t;->a(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    sget-object v0, Lmg/t;->q:Ljava/util/Map;

    .line 9
    .line 10
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Lmg/u;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    return-object v0

    .line 19
    :cond_1
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
    const-string v2, "Inapplicable visibility: "

    .line 27
    .line 28
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

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
