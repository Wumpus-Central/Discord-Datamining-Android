.class public final Lvg/v;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Llh/c;

.field private static final b:Llh/c;

.field private static final c:Llh/c;

.field private static final d:Ljava/lang/String;

.field private static final e:[Llh/c;

.field private static final f:Lvg/d0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lvg/d0<",
            "Lvg/w;",
            ">;"
        }
    .end annotation
.end field

.field private static final g:Lvg/w;


# direct methods
.method static constructor <clinit>()V
    .locals 18

    .line 1
    new-instance v0, Llh/c;

    .line 2
    .line 3
    const-string v1, "org.jspecify.nullness"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Llh/c;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lvg/v;->a:Llh/c;

    .line 9
    .line 10
    new-instance v1, Llh/c;

    .line 11
    .line 12
    const-string v2, "io.reactivex.rxjava3.annotations"

    .line 13
    .line 14
    invoke-direct {v1, v2}, Llh/c;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    sput-object v1, Lvg/v;->b:Llh/c;

    .line 18
    .line 19
    new-instance v2, Llh/c;

    .line 20
    .line 21
    const-string v3, "org.checkerframework.checker.nullness.compatqual"

    .line 22
    .line 23
    invoke-direct {v2, v3}, Llh/c;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    sput-object v2, Lvg/v;->c:Llh/c;

    .line 27
    .line 28
    invoke-virtual {v1}, Llh/c;->b()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    const-string v4, "RXJAVA3_ANNOTATIONS_PACKAGE.asString()"

    .line 33
    .line 34
    invoke-static {v3, v4}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    sput-object v3, Lvg/v;->d:Ljava/lang/String;

    .line 38
    .line 39
    const/4 v4, 0x2

    .line 40
    new-array v5, v4, [Llh/c;

    .line 41
    .line 42
    new-instance v6, Llh/c;

    .line 43
    .line 44
    new-instance v7, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string v8, ".Nullable"

    .line 53
    .line 54
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v7

    .line 61
    invoke-direct {v6, v7}, Llh/c;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    const/4 v7, 0x0

    .line 65
    aput-object v6, v5, v7

    .line 66
    .line 67
    new-instance v6, Llh/c;

    .line 68
    .line 69
    new-instance v8, Ljava/lang/StringBuilder;

    .line 70
    .line 71
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    const-string v3, ".NonNull"

    .line 78
    .line 79
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    invoke-direct {v6, v3}, Llh/c;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    const/4 v3, 0x1

    .line 90
    aput-object v6, v5, v3

    .line 91
    .line 92
    sput-object v5, Lvg/v;->e:[Llh/c;

    .line 93
    .line 94
    new-instance v5, Lvg/e0;

    .line 95
    .line 96
    const/16 v6, 0x10

    .line 97
    .line 98
    new-array v6, v6, [Lkotlin/Pair;

    .line 99
    .line 100
    new-instance v8, Llh/c;

    .line 101
    .line 102
    const-string v9, "org.jetbrains.annotations"

    .line 103
    .line 104
    invoke-direct {v8, v9}, Llh/c;-><init>(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    sget-object v9, Lvg/w;->d:Lvg/w$a;

    .line 108
    .line 109
    invoke-virtual {v9}, Lvg/w$a;->a()Lvg/w;

    .line 110
    .line 111
    .line 112
    move-result-object v10

    .line 113
    invoke-static {v8, v10}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 114
    .line 115
    .line 116
    move-result-object v8

    .line 117
    aput-object v8, v6, v7

    .line 118
    .line 119
    new-instance v7, Llh/c;

    .line 120
    .line 121
    const-string v8, "androidx.annotation"

    .line 122
    .line 123
    invoke-direct {v7, v8}, Llh/c;-><init>(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v9}, Lvg/w$a;->a()Lvg/w;

    .line 127
    .line 128
    .line 129
    move-result-object v8

    .line 130
    invoke-static {v7, v8}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 131
    .line 132
    .line 133
    move-result-object v7

    .line 134
    aput-object v7, v6, v3

    .line 135
    .line 136
    new-instance v7, Llh/c;

    .line 137
    .line 138
    const-string v8, "android.support.annotation"

    .line 139
    .line 140
    invoke-direct {v7, v8}, Llh/c;-><init>(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v9}, Lvg/w$a;->a()Lvg/w;

    .line 144
    .line 145
    .line 146
    move-result-object v8

    .line 147
    invoke-static {v7, v8}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 148
    .line 149
    .line 150
    move-result-object v7

    .line 151
    aput-object v7, v6, v4

    .line 152
    .line 153
    new-instance v4, Llh/c;

    .line 154
    .line 155
    const-string v7, "android.annotation"

    .line 156
    .line 157
    invoke-direct {v4, v7}, Llh/c;-><init>(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v9}, Lvg/w$a;->a()Lvg/w;

    .line 161
    .line 162
    .line 163
    move-result-object v7

    .line 164
    invoke-static {v4, v7}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 165
    .line 166
    .line 167
    move-result-object v4

    .line 168
    const/4 v7, 0x3

    .line 169
    aput-object v4, v6, v7

    .line 170
    .line 171
    new-instance v4, Llh/c;

    .line 172
    .line 173
    const-string v7, "com.android.annotations"

    .line 174
    .line 175
    invoke-direct {v4, v7}, Llh/c;-><init>(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v9}, Lvg/w$a;->a()Lvg/w;

    .line 179
    .line 180
    .line 181
    move-result-object v7

    .line 182
    invoke-static {v4, v7}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 183
    .line 184
    .line 185
    move-result-object v4

    .line 186
    const/4 v7, 0x4

    .line 187
    aput-object v4, v6, v7

    .line 188
    .line 189
    new-instance v4, Llh/c;

    .line 190
    .line 191
    const-string v7, "org.eclipse.jdt.annotation"

    .line 192
    .line 193
    invoke-direct {v4, v7}, Llh/c;-><init>(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v9}, Lvg/w$a;->a()Lvg/w;

    .line 197
    .line 198
    .line 199
    move-result-object v7

    .line 200
    invoke-static {v4, v7}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 201
    .line 202
    .line 203
    move-result-object v4

    .line 204
    const/4 v7, 0x5

    .line 205
    aput-object v4, v6, v7

    .line 206
    .line 207
    new-instance v4, Llh/c;

    .line 208
    .line 209
    const-string v7, "org.checkerframework.checker.nullness.qual"

    .line 210
    .line 211
    invoke-direct {v4, v7}, Llh/c;-><init>(Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {v9}, Lvg/w$a;->a()Lvg/w;

    .line 215
    .line 216
    .line 217
    move-result-object v7

    .line 218
    invoke-static {v4, v7}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 219
    .line 220
    .line 221
    move-result-object v4

    .line 222
    const/4 v7, 0x6

    .line 223
    aput-object v4, v6, v7

    .line 224
    .line 225
    invoke-virtual {v9}, Lvg/w$a;->a()Lvg/w;

    .line 226
    .line 227
    .line 228
    move-result-object v4

    .line 229
    invoke-static {v2, v4}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 230
    .line 231
    .line 232
    move-result-object v2

    .line 233
    const/4 v4, 0x7

    .line 234
    aput-object v2, v6, v4

    .line 235
    .line 236
    new-instance v2, Llh/c;

    .line 237
    .line 238
    const-string v4, "javax.annotation"

    .line 239
    .line 240
    invoke-direct {v2, v4}, Llh/c;-><init>(Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v9}, Lvg/w$a;->a()Lvg/w;

    .line 244
    .line 245
    .line 246
    move-result-object v4

    .line 247
    invoke-static {v2, v4}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 248
    .line 249
    .line 250
    move-result-object v2

    .line 251
    const/16 v4, 0x8

    .line 252
    .line 253
    aput-object v2, v6, v4

    .line 254
    .line 255
    new-instance v2, Llh/c;

    .line 256
    .line 257
    const-string v7, "edu.umd.cs.findbugs.annotations"

    .line 258
    .line 259
    invoke-direct {v2, v7}, Llh/c;-><init>(Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {v9}, Lvg/w$a;->a()Lvg/w;

    .line 263
    .line 264
    .line 265
    move-result-object v7

    .line 266
    invoke-static {v2, v7}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 267
    .line 268
    .line 269
    move-result-object v2

    .line 270
    const/16 v7, 0x9

    .line 271
    .line 272
    aput-object v2, v6, v7

    .line 273
    .line 274
    new-instance v2, Llh/c;

    .line 275
    .line 276
    const-string v8, "io.reactivex.annotations"

    .line 277
    .line 278
    invoke-direct {v2, v8}, Llh/c;-><init>(Ljava/lang/String;)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v9}, Lvg/w$a;->a()Lvg/w;

    .line 282
    .line 283
    .line 284
    move-result-object v8

    .line 285
    invoke-static {v2, v8}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 286
    .line 287
    .line 288
    move-result-object v2

    .line 289
    const/16 v8, 0xa

    .line 290
    .line 291
    aput-object v2, v6, v8

    .line 292
    .line 293
    new-instance v2, Llh/c;

    .line 294
    .line 295
    const-string v8, "androidx.annotation.RecentlyNullable"

    .line 296
    .line 297
    invoke-direct {v2, v8}, Llh/c;-><init>(Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    new-instance v8, Lvg/w;

    .line 301
    .line 302
    sget-object v15, Lvg/g0;->n:Lvg/g0;

    .line 303
    .line 304
    const/4 v12, 0x0

    .line 305
    const/4 v13, 0x0

    .line 306
    const/4 v14, 0x4

    .line 307
    const/16 v16, 0x0

    .line 308
    .line 309
    move-object v10, v8

    .line 310
    move-object v11, v15

    .line 311
    move-object/from16 v17, v15

    .line 312
    .line 313
    move-object/from16 v15, v16

    .line 314
    .line 315
    invoke-direct/range {v10 .. v15}, Lvg/w;-><init>(Lvg/g0;Llf/k;Lvg/g0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 316
    .line 317
    .line 318
    invoke-static {v2, v8}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 319
    .line 320
    .line 321
    move-result-object v2

    .line 322
    const/16 v8, 0xb

    .line 323
    .line 324
    aput-object v2, v6, v8

    .line 325
    .line 326
    new-instance v2, Llh/c;

    .line 327
    .line 328
    const-string v8, "androidx.annotation.RecentlyNonNull"

    .line 329
    .line 330
    invoke-direct {v2, v8}, Llh/c;-><init>(Ljava/lang/String;)V

    .line 331
    .line 332
    .line 333
    new-instance v8, Lvg/w;

    .line 334
    .line 335
    const/4 v15, 0x0

    .line 336
    move-object v10, v8

    .line 337
    move-object/from16 v11, v17

    .line 338
    .line 339
    invoke-direct/range {v10 .. v15}, Lvg/w;-><init>(Lvg/g0;Llf/k;Lvg/g0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 340
    .line 341
    .line 342
    invoke-static {v2, v8}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 343
    .line 344
    .line 345
    move-result-object v2

    .line 346
    const/16 v8, 0xc

    .line 347
    .line 348
    aput-object v2, v6, v8

    .line 349
    .line 350
    new-instance v2, Llh/c;

    .line 351
    .line 352
    const-string v8, "lombok"

    .line 353
    .line 354
    invoke-direct {v2, v8}, Llh/c;-><init>(Ljava/lang/String;)V

    .line 355
    .line 356
    .line 357
    invoke-virtual {v9}, Lvg/w$a;->a()Lvg/w;

    .line 358
    .line 359
    .line 360
    move-result-object v8

    .line 361
    invoke-static {v2, v8}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 362
    .line 363
    .line 364
    move-result-object v2

    .line 365
    const/16 v8, 0xd

    .line 366
    .line 367
    aput-object v2, v6, v8

    .line 368
    .line 369
    new-instance v2, Lvg/w;

    .line 370
    .line 371
    new-instance v8, Llf/k;

    .line 372
    .line 373
    invoke-direct {v8, v3, v7}, Llf/k;-><init>(II)V

    .line 374
    .line 375
    .line 376
    sget-object v7, Lvg/g0;->o:Lvg/g0;

    .line 377
    .line 378
    move-object/from16 v9, v17

    .line 379
    .line 380
    invoke-direct {v2, v9, v8, v7}, Lvg/w;-><init>(Lvg/g0;Llf/k;Lvg/g0;)V

    .line 381
    .line 382
    .line 383
    invoke-static {v0, v2}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 384
    .line 385
    .line 386
    move-result-object v0

    .line 387
    const/16 v2, 0xe

    .line 388
    .line 389
    aput-object v0, v6, v2

    .line 390
    .line 391
    new-instance v0, Lvg/w;

    .line 392
    .line 393
    new-instance v2, Llf/k;

    .line 394
    .line 395
    invoke-direct {v2, v3, v4}, Llf/k;-><init>(II)V

    .line 396
    .line 397
    .line 398
    invoke-direct {v0, v9, v2, v7}, Lvg/w;-><init>(Lvg/g0;Llf/k;Lvg/g0;)V

    .line 399
    .line 400
    .line 401
    invoke-static {v1, v0}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 402
    .line 403
    .line 404
    move-result-object v0

    .line 405
    const/16 v1, 0xf

    .line 406
    .line 407
    aput-object v0, v6, v1

    .line 408
    .line 409
    invoke-static {v6}, Lmf/s;->k([Lkotlin/Pair;)Ljava/util/Map;

    .line 410
    .line 411
    .line 412
    move-result-object v0

    .line 413
    invoke-direct {v5, v0}, Lvg/e0;-><init>(Ljava/util/Map;)V

    .line 414
    .line 415
    .line 416
    sput-object v5, Lvg/v;->f:Lvg/d0;

    .line 417
    .line 418
    new-instance v0, Lvg/w;

    .line 419
    .line 420
    move-object v10, v0

    .line 421
    move-object v11, v9

    .line 422
    invoke-direct/range {v10 .. v15}, Lvg/w;-><init>(Lvg/g0;Llf/k;Lvg/g0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 423
    .line 424
    .line 425
    sput-object v0, Lvg/v;->g:Lvg/w;

    .line 426
    .line 427
    return-void
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

.method public static final a(Llf/k;)Lvg/z;
    .locals 6

    .line 1
    const-string v0, "configuredKotlinVersion"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lvg/v;->g:Lvg/w;

    .line 7
    .line 8
    invoke-virtual {v0}, Lvg/w;->d()Llf/k;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0}, Lvg/w;->d()Llf/k;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v1, p0}, Llf/k;->a(Llf/k;)I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    if-gtz p0, :cond_0

    .line 23
    .line 24
    invoke-virtual {v0}, Lvg/w;->b()Lvg/g0;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-virtual {v0}, Lvg/w;->c()Lvg/g0;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    :goto_0
    move-object v1, p0

    .line 34
    invoke-static {v1}, Lvg/v;->c(Lvg/g0;)Lvg/g0;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    new-instance p0, Lvg/z;

    .line 39
    .line 40
    const/4 v3, 0x0

    .line 41
    const/4 v4, 0x4

    .line 42
    const/4 v5, 0x0

    .line 43
    move-object v0, p0

    .line 44
    invoke-direct/range {v0 .. v5}, Lvg/z;-><init>(Lvg/g0;Lvg/g0;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 45
    .line 46
    .line 47
    return-object p0
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

.method public static synthetic b(Llf/k;ILjava/lang/Object;)Lvg/z;
    .locals 0

    and-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_0

    sget-object p0, Llf/k;->p:Llf/k;

    :cond_0
    invoke-static {p0}, Lvg/v;->a(Llf/k;)Lvg/z;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lvg/g0;)Lvg/g0;
    .locals 1

    .line 1
    const-string v0, "globalReportLevel"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lvg/g0;->n:Lvg/g0;

    .line 7
    .line 8
    if-ne p0, v0, :cond_0

    .line 9
    .line 10
    const/4 p0, 0x0

    .line 11
    :cond_0
    return-object p0
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
.end method

.method public static final d(Llh/c;)Lvg/g0;
    .locals 3

    .line 1
    const-string v0, "annotationFqName"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lvg/d0;->a:Lvg/d0$a;

    .line 7
    .line 8
    invoke-virtual {v0}, Lvg/d0$a;->a()Lvg/d0;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x0

    .line 13
    const/4 v2, 0x4

    .line 14
    invoke-static {p0, v0, v1, v2, v1}, Lvg/v;->h(Llh/c;Lvg/d0;Llf/k;ILjava/lang/Object;)Lvg/g0;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
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

.method public static final e()Llh/c;
    .locals 1

    sget-object v0, Lvg/v;->a:Llh/c;

    return-object v0
.end method

.method public static final f()[Llh/c;
    .locals 1

    sget-object v0, Lvg/v;->e:[Llh/c;

    return-object v0
.end method

.method public static final g(Llh/c;Lvg/d0;Llf/k;)Lvg/g0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llh/c;",
            "Lvg/d0<",
            "+",
            "Lvg/g0;",
            ">;",
            "Llf/k;",
            ")",
            "Lvg/g0;"
        }
    .end annotation

    .line 1
    const-string v0, "annotation"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "configuredReportLevels"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "configuredKotlinVersion"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p1, p0}, Lvg/d0;->a(Llh/c;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, Lvg/g0;

    .line 21
    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    return-object p1

    .line 25
    :cond_0
    sget-object p1, Lvg/v;->f:Lvg/d0;

    .line 26
    .line 27
    invoke-interface {p1, p0}, Lvg/d0;->a(Llh/c;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, Lvg/w;

    .line 32
    .line 33
    if-nez p0, :cond_1

    .line 34
    .line 35
    sget-object p0, Lvg/g0;->m:Lvg/g0;

    .line 36
    .line 37
    return-object p0

    .line 38
    :cond_1
    invoke-virtual {p0}, Lvg/w;->d()Llf/k;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    if-eqz p1, :cond_2

    .line 43
    .line 44
    invoke-virtual {p0}, Lvg/w;->d()Llf/k;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-virtual {p1, p2}, Llf/k;->a(Llf/k;)I

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    if-gtz p1, :cond_2

    .line 53
    .line 54
    invoke-virtual {p0}, Lvg/w;->b()Lvg/g0;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    goto :goto_0

    .line 59
    :cond_2
    invoke-virtual {p0}, Lvg/w;->c()Lvg/g0;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    :goto_0
    return-object p0
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

.method public static synthetic h(Llh/c;Lvg/d0;Llf/k;ILjava/lang/Object;)Lvg/g0;
    .locals 1

    .line 1
    and-int/lit8 p3, p3, 0x4

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    new-instance p2, Llf/k;

    .line 6
    .line 7
    const/4 p3, 0x7

    .line 8
    const/16 p4, 0x14

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p2, v0, p3, p4}, Llf/k;-><init>(III)V

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-static {p0, p1, p2}, Lvg/v;->g(Llh/c;Lvg/d0;Llf/k;)Lvg/g0;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
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
