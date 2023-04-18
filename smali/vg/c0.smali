.class public final Lvg/c0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Llh/c;

.field private static final b:Llh/c;

.field private static final c:Llh/c;

.field private static final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Llh/c;",
            ">;"
        }
    .end annotation
.end field

.field private static final e:Llh/c;

.field private static final f:Llh/c;

.field private static final g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Llh/c;",
            ">;"
        }
    .end annotation
.end field

.field private static final h:Llh/c;

.field private static final i:Llh/c;

.field private static final j:Llh/c;

.field private static final k:Llh/c;

.field private static final l:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Llh/c;",
            ">;"
        }
    .end annotation
.end field

.field private static final m:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Llh/c;",
            ">;"
        }
    .end annotation
.end field

.field private static final n:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Llh/c;",
            ">;"
        }
    .end annotation
.end field

.field private static final o:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Llh/c;",
            "Llh/c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 16

    .line 1
    new-instance v0, Llh/c;

    .line 2
    .line 3
    const-string v1, "org.jspecify.nullness.Nullable"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Llh/c;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lvg/c0;->a:Llh/c;

    .line 9
    .line 10
    new-instance v1, Llh/c;

    .line 11
    .line 12
    const-string v2, "org.jspecify.nullness.NullnessUnspecified"

    .line 13
    .line 14
    invoke-direct {v1, v2}, Llh/c;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    sput-object v1, Lvg/c0;->b:Llh/c;

    .line 18
    .line 19
    new-instance v2, Llh/c;

    .line 20
    .line 21
    const-string v3, "org.jspecify.nullness.NullMarked"

    .line 22
    .line 23
    invoke-direct {v2, v3}, Llh/c;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    sput-object v2, Lvg/c0;->c:Llh/c;

    .line 27
    .line 28
    const/16 v3, 0xe

    .line 29
    .line 30
    new-array v3, v3, [Llh/c;

    .line 31
    .line 32
    sget-object v4, Lvg/b0;->l:Llh/c;

    .line 33
    .line 34
    const/4 v5, 0x0

    .line 35
    aput-object v4, v3, v5

    .line 36
    .line 37
    new-instance v4, Llh/c;

    .line 38
    .line 39
    const-string v6, "androidx.annotation.Nullable"

    .line 40
    .line 41
    invoke-direct {v4, v6}, Llh/c;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    const/4 v6, 0x1

    .line 45
    aput-object v4, v3, v6

    .line 46
    .line 47
    new-instance v4, Llh/c;

    .line 48
    .line 49
    const-string v7, "android.support.annotation.Nullable"

    .line 50
    .line 51
    invoke-direct {v4, v7}, Llh/c;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    const/4 v7, 0x2

    .line 55
    aput-object v4, v3, v7

    .line 56
    .line 57
    new-instance v4, Llh/c;

    .line 58
    .line 59
    const-string v8, "android.annotation.Nullable"

    .line 60
    .line 61
    invoke-direct {v4, v8}, Llh/c;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    const/4 v8, 0x3

    .line 65
    aput-object v4, v3, v8

    .line 66
    .line 67
    new-instance v4, Llh/c;

    .line 68
    .line 69
    const-string v9, "com.android.annotations.Nullable"

    .line 70
    .line 71
    invoke-direct {v4, v9}, Llh/c;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    const/4 v9, 0x4

    .line 75
    aput-object v4, v3, v9

    .line 76
    .line 77
    new-instance v4, Llh/c;

    .line 78
    .line 79
    const-string v10, "org.eclipse.jdt.annotation.Nullable"

    .line 80
    .line 81
    invoke-direct {v4, v10}, Llh/c;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    const/4 v10, 0x5

    .line 85
    aput-object v4, v3, v10

    .line 86
    .line 87
    new-instance v4, Llh/c;

    .line 88
    .line 89
    const-string v11, "org.checkerframework.checker.nullness.qual.Nullable"

    .line 90
    .line 91
    invoke-direct {v4, v11}, Llh/c;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    const/4 v11, 0x6

    .line 95
    aput-object v4, v3, v11

    .line 96
    .line 97
    new-instance v4, Llh/c;

    .line 98
    .line 99
    const-string v12, "javax.annotation.Nullable"

    .line 100
    .line 101
    invoke-direct {v4, v12}, Llh/c;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    const/4 v12, 0x7

    .line 105
    aput-object v4, v3, v12

    .line 106
    .line 107
    new-instance v4, Llh/c;

    .line 108
    .line 109
    const-string v13, "javax.annotation.CheckForNull"

    .line 110
    .line 111
    invoke-direct {v4, v13}, Llh/c;-><init>(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    const/16 v14, 0x8

    .line 115
    .line 116
    aput-object v4, v3, v14

    .line 117
    .line 118
    new-instance v4, Llh/c;

    .line 119
    .line 120
    const-string v15, "edu.umd.cs.findbugs.annotations.CheckForNull"

    .line 121
    .line 122
    invoke-direct {v4, v15}, Llh/c;-><init>(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    const/16 v15, 0x9

    .line 126
    .line 127
    aput-object v4, v3, v15

    .line 128
    .line 129
    new-instance v4, Llh/c;

    .line 130
    .line 131
    const-string v15, "edu.umd.cs.findbugs.annotations.Nullable"

    .line 132
    .line 133
    invoke-direct {v4, v15}, Llh/c;-><init>(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    const/16 v15, 0xa

    .line 137
    .line 138
    aput-object v4, v3, v15

    .line 139
    .line 140
    new-instance v4, Llh/c;

    .line 141
    .line 142
    const-string v15, "edu.umd.cs.findbugs.annotations.PossiblyNull"

    .line 143
    .line 144
    invoke-direct {v4, v15}, Llh/c;-><init>(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    const/16 v15, 0xb

    .line 148
    .line 149
    aput-object v4, v3, v15

    .line 150
    .line 151
    new-instance v4, Llh/c;

    .line 152
    .line 153
    const-string v14, "io.reactivex.annotations.Nullable"

    .line 154
    .line 155
    invoke-direct {v4, v14}, Llh/c;-><init>(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    const/16 v14, 0xc

    .line 159
    .line 160
    aput-object v4, v3, v14

    .line 161
    .line 162
    new-instance v4, Llh/c;

    .line 163
    .line 164
    const-string v14, "io.reactivex.rxjava3.annotations.Nullable"

    .line 165
    .line 166
    invoke-direct {v4, v14}, Llh/c;-><init>(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    const/16 v14, 0xd

    .line 170
    .line 171
    aput-object v4, v3, v14

    .line 172
    .line 173
    invoke-static {v3}, Lkotlin/collections/h;->l([Ljava/lang/Object;)Ljava/util/List;

    .line 174
    .line 175
    .line 176
    move-result-object v3

    .line 177
    sput-object v3, Lvg/c0;->d:Ljava/util/List;

    .line 178
    .line 179
    new-instance v4, Llh/c;

    .line 180
    .line 181
    const-string v14, "javax.annotation.Nonnull"

    .line 182
    .line 183
    invoke-direct {v4, v14}, Llh/c;-><init>(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    sput-object v4, Lvg/c0;->e:Llh/c;

    .line 187
    .line 188
    new-instance v14, Llh/c;

    .line 189
    .line 190
    invoke-direct {v14, v13}, Llh/c;-><init>(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    sput-object v14, Lvg/c0;->f:Llh/c;

    .line 194
    .line 195
    new-array v13, v15, [Llh/c;

    .line 196
    .line 197
    sget-object v14, Lvg/b0;->k:Llh/c;

    .line 198
    .line 199
    aput-object v14, v13, v5

    .line 200
    .line 201
    new-instance v14, Llh/c;

    .line 202
    .line 203
    const-string v15, "edu.umd.cs.findbugs.annotations.NonNull"

    .line 204
    .line 205
    invoke-direct {v14, v15}, Llh/c;-><init>(Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    aput-object v14, v13, v6

    .line 209
    .line 210
    new-instance v14, Llh/c;

    .line 211
    .line 212
    const-string v15, "androidx.annotation.NonNull"

    .line 213
    .line 214
    invoke-direct {v14, v15}, Llh/c;-><init>(Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    aput-object v14, v13, v7

    .line 218
    .line 219
    new-instance v14, Llh/c;

    .line 220
    .line 221
    const-string v15, "android.support.annotation.NonNull"

    .line 222
    .line 223
    invoke-direct {v14, v15}, Llh/c;-><init>(Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    aput-object v14, v13, v8

    .line 227
    .line 228
    new-instance v14, Llh/c;

    .line 229
    .line 230
    const-string v15, "android.annotation.NonNull"

    .line 231
    .line 232
    invoke-direct {v14, v15}, Llh/c;-><init>(Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    aput-object v14, v13, v9

    .line 236
    .line 237
    new-instance v14, Llh/c;

    .line 238
    .line 239
    const-string v15, "com.android.annotations.NonNull"

    .line 240
    .line 241
    invoke-direct {v14, v15}, Llh/c;-><init>(Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    aput-object v14, v13, v10

    .line 245
    .line 246
    new-instance v10, Llh/c;

    .line 247
    .line 248
    const-string v14, "org.eclipse.jdt.annotation.NonNull"

    .line 249
    .line 250
    invoke-direct {v10, v14}, Llh/c;-><init>(Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    aput-object v10, v13, v11

    .line 254
    .line 255
    new-instance v10, Llh/c;

    .line 256
    .line 257
    const-string v11, "org.checkerframework.checker.nullness.qual.NonNull"

    .line 258
    .line 259
    invoke-direct {v10, v11}, Llh/c;-><init>(Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    aput-object v10, v13, v12

    .line 263
    .line 264
    new-instance v10, Llh/c;

    .line 265
    .line 266
    const-string v11, "lombok.NonNull"

    .line 267
    .line 268
    invoke-direct {v10, v11}, Llh/c;-><init>(Ljava/lang/String;)V

    .line 269
    .line 270
    .line 271
    const/16 v11, 0x8

    .line 272
    .line 273
    aput-object v10, v13, v11

    .line 274
    .line 275
    new-instance v10, Llh/c;

    .line 276
    .line 277
    const-string v11, "io.reactivex.annotations.NonNull"

    .line 278
    .line 279
    invoke-direct {v10, v11}, Llh/c;-><init>(Ljava/lang/String;)V

    .line 280
    .line 281
    .line 282
    const/16 v11, 0x9

    .line 283
    .line 284
    aput-object v10, v13, v11

    .line 285
    .line 286
    new-instance v10, Llh/c;

    .line 287
    .line 288
    const-string v11, "io.reactivex.rxjava3.annotations.NonNull"

    .line 289
    .line 290
    invoke-direct {v10, v11}, Llh/c;-><init>(Ljava/lang/String;)V

    .line 291
    .line 292
    .line 293
    const/16 v11, 0xa

    .line 294
    .line 295
    aput-object v10, v13, v11

    .line 296
    .line 297
    invoke-static {v13}, Lkotlin/collections/h;->l([Ljava/lang/Object;)Ljava/util/List;

    .line 298
    .line 299
    .line 300
    move-result-object v10

    .line 301
    sput-object v10, Lvg/c0;->g:Ljava/util/List;

    .line 302
    .line 303
    new-instance v11, Llh/c;

    .line 304
    .line 305
    const-string v12, "org.checkerframework.checker.nullness.compatqual.NullableDecl"

    .line 306
    .line 307
    invoke-direct {v11, v12}, Llh/c;-><init>(Ljava/lang/String;)V

    .line 308
    .line 309
    .line 310
    sput-object v11, Lvg/c0;->h:Llh/c;

    .line 311
    .line 312
    new-instance v12, Llh/c;

    .line 313
    .line 314
    const-string v13, "org.checkerframework.checker.nullness.compatqual.NonNullDecl"

    .line 315
    .line 316
    invoke-direct {v12, v13}, Llh/c;-><init>(Ljava/lang/String;)V

    .line 317
    .line 318
    .line 319
    sput-object v12, Lvg/c0;->i:Llh/c;

    .line 320
    .line 321
    new-instance v13, Llh/c;

    .line 322
    .line 323
    const-string v14, "androidx.annotation.RecentlyNullable"

    .line 324
    .line 325
    invoke-direct {v13, v14}, Llh/c;-><init>(Ljava/lang/String;)V

    .line 326
    .line 327
    .line 328
    sput-object v13, Lvg/c0;->j:Llh/c;

    .line 329
    .line 330
    new-instance v14, Llh/c;

    .line 331
    .line 332
    const-string v15, "androidx.annotation.RecentlyNonNull"

    .line 333
    .line 334
    invoke-direct {v14, v15}, Llh/c;-><init>(Ljava/lang/String;)V

    .line 335
    .line 336
    .line 337
    sput-object v14, Lvg/c0;->k:Llh/c;

    .line 338
    .line 339
    new-instance v15, Ljava/util/LinkedHashSet;

    .line 340
    .line 341
    invoke-direct {v15}, Ljava/util/LinkedHashSet;-><init>()V

    .line 342
    .line 343
    .line 344
    invoke-static {v15, v3}, Lkotlin/collections/u;->l(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    .line 345
    .line 346
    .line 347
    move-result-object v3

    .line 348
    invoke-static {v3, v4}, Lkotlin/collections/u;->m(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/Set;

    .line 349
    .line 350
    .line 351
    move-result-object v3

    .line 352
    invoke-static {v3, v10}, Lkotlin/collections/u;->l(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    .line 353
    .line 354
    .line 355
    move-result-object v3

    .line 356
    invoke-static {v3, v11}, Lkotlin/collections/u;->m(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/Set;

    .line 357
    .line 358
    .line 359
    move-result-object v3

    .line 360
    invoke-static {v3, v12}, Lkotlin/collections/u;->m(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/Set;

    .line 361
    .line 362
    .line 363
    move-result-object v3

    .line 364
    invoke-static {v3, v13}, Lkotlin/collections/u;->m(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/Set;

    .line 365
    .line 366
    .line 367
    move-result-object v3

    .line 368
    invoke-static {v3, v14}, Lkotlin/collections/u;->m(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/Set;

    .line 369
    .line 370
    .line 371
    move-result-object v3

    .line 372
    invoke-static {v3, v0}, Lkotlin/collections/u;->m(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/Set;

    .line 373
    .line 374
    .line 375
    move-result-object v0

    .line 376
    invoke-static {v0, v1}, Lkotlin/collections/u;->m(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/Set;

    .line 377
    .line 378
    .line 379
    move-result-object v0

    .line 380
    invoke-static {v0, v2}, Lkotlin/collections/u;->m(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/Set;

    .line 381
    .line 382
    .line 383
    move-result-object v0

    .line 384
    sput-object v0, Lvg/c0;->l:Ljava/util/Set;

    .line 385
    .line 386
    new-array v0, v7, [Llh/c;

    .line 387
    .line 388
    sget-object v1, Lvg/b0;->n:Llh/c;

    .line 389
    .line 390
    aput-object v1, v0, v5

    .line 391
    .line 392
    sget-object v1, Lvg/b0;->o:Llh/c;

    .line 393
    .line 394
    aput-object v1, v0, v6

    .line 395
    .line 396
    invoke-static {v0}, Lkotlin/collections/u;->i([Ljava/lang/Object;)Ljava/util/Set;

    .line 397
    .line 398
    .line 399
    move-result-object v0

    .line 400
    sput-object v0, Lvg/c0;->m:Ljava/util/Set;

    .line 401
    .line 402
    new-array v0, v7, [Llh/c;

    .line 403
    .line 404
    sget-object v1, Lvg/b0;->m:Llh/c;

    .line 405
    .line 406
    aput-object v1, v0, v5

    .line 407
    .line 408
    sget-object v1, Lvg/b0;->p:Llh/c;

    .line 409
    .line 410
    aput-object v1, v0, v6

    .line 411
    .line 412
    invoke-static {v0}, Lkotlin/collections/u;->i([Ljava/lang/Object;)Ljava/util/Set;

    .line 413
    .line 414
    .line 415
    move-result-object v0

    .line 416
    sput-object v0, Lvg/c0;->n:Ljava/util/Set;

    .line 417
    .line 418
    new-array v0, v9, [Lkotlin/Pair;

    .line 419
    .line 420
    sget-object v1, Lvg/b0;->d:Llh/c;

    .line 421
    .line 422
    sget-object v2, Ljg/k$a;->H:Llh/c;

    .line 423
    .line 424
    invoke-static {v1, v2}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 425
    .line 426
    .line 427
    move-result-object v1

    .line 428
    aput-object v1, v0, v5

    .line 429
    .line 430
    sget-object v1, Lvg/b0;->f:Llh/c;

    .line 431
    .line 432
    sget-object v2, Ljg/k$a;->L:Llh/c;

    .line 433
    .line 434
    invoke-static {v1, v2}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 435
    .line 436
    .line 437
    move-result-object v1

    .line 438
    aput-object v1, v0, v6

    .line 439
    .line 440
    sget-object v1, Lvg/b0;->h:Llh/c;

    .line 441
    .line 442
    sget-object v2, Ljg/k$a;->y:Llh/c;

    .line 443
    .line 444
    invoke-static {v1, v2}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 445
    .line 446
    .line 447
    move-result-object v1

    .line 448
    aput-object v1, v0, v7

    .line 449
    .line 450
    sget-object v1, Lvg/b0;->i:Llh/c;

    .line 451
    .line 452
    sget-object v2, Ljg/k$a;->P:Llh/c;

    .line 453
    .line 454
    invoke-static {v1, v2}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 455
    .line 456
    .line 457
    move-result-object v1

    .line 458
    aput-object v1, v0, v8

    .line 459
    .line 460
    invoke-static {v0}, Lmf/s;->k([Lkotlin/Pair;)Ljava/util/Map;

    .line 461
    .line 462
    .line 463
    move-result-object v0

    .line 464
    sput-object v0, Lvg/c0;->o:Ljava/util/Map;

    .line 465
    .line 466
    return-void
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

.method public static final a()Llh/c;
    .locals 1

    sget-object v0, Lvg/c0;->k:Llh/c;

    return-object v0
.end method

.method public static final b()Llh/c;
    .locals 1

    sget-object v0, Lvg/c0;->j:Llh/c;

    return-object v0
.end method

.method public static final c()Llh/c;
    .locals 1

    sget-object v0, Lvg/c0;->i:Llh/c;

    return-object v0
.end method

.method public static final d()Llh/c;
    .locals 1

    sget-object v0, Lvg/c0;->h:Llh/c;

    return-object v0
.end method

.method public static final e()Llh/c;
    .locals 1

    sget-object v0, Lvg/c0;->f:Llh/c;

    return-object v0
.end method

.method public static final f()Llh/c;
    .locals 1

    sget-object v0, Lvg/c0;->e:Llh/c;

    return-object v0
.end method

.method public static final g()Llh/c;
    .locals 1

    sget-object v0, Lvg/c0;->a:Llh/c;

    return-object v0
.end method

.method public static final h()Llh/c;
    .locals 1

    sget-object v0, Lvg/c0;->b:Llh/c;

    return-object v0
.end method

.method public static final i()Llh/c;
    .locals 1

    sget-object v0, Lvg/c0;->c:Llh/c;

    return-object v0
.end method

.method public static final j()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Llh/c;",
            ">;"
        }
    .end annotation

    sget-object v0, Lvg/c0;->n:Ljava/util/Set;

    return-object v0
.end method

.method public static final k()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Llh/c;",
            ">;"
        }
    .end annotation

    sget-object v0, Lvg/c0;->g:Ljava/util/List;

    return-object v0
.end method

.method public static final l()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Llh/c;",
            ">;"
        }
    .end annotation

    sget-object v0, Lvg/c0;->d:Ljava/util/List;

    return-object v0
.end method

.method public static final m()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Llh/c;",
            ">;"
        }
    .end annotation

    sget-object v0, Lvg/c0;->m:Ljava/util/Set;

    return-object v0
.end method
