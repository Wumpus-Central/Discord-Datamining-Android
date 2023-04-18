.class public final Lvg/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Llh/c;

.field private static final b:Llh/c;

.field private static final c:Llh/c;

.field private static final d:Llh/c;

.field private static final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lvg/b;",
            ">;"
        }
    .end annotation
.end field

.field private static final f:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Llh/c;",
            "Lvg/r;",
            ">;"
        }
    .end annotation
.end field

.field private static final g:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Llh/c;",
            "Lvg/r;",
            ">;"
        }
    .end annotation
.end field

.field private static final h:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
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
    const-string v1, "javax.annotation.meta.TypeQualifierNickname"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Llh/c;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lvg/c;->a:Llh/c;

    .line 9
    .line 10
    new-instance v0, Llh/c;

    .line 11
    .line 12
    const-string v1, "javax.annotation.meta.TypeQualifier"

    .line 13
    .line 14
    invoke-direct {v0, v1}, Llh/c;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lvg/c;->b:Llh/c;

    .line 18
    .line 19
    new-instance v0, Llh/c;

    .line 20
    .line 21
    const-string v1, "javax.annotation.meta.TypeQualifierDefault"

    .line 22
    .line 23
    invoke-direct {v0, v1}, Llh/c;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    sput-object v0, Lvg/c;->c:Llh/c;

    .line 27
    .line 28
    new-instance v0, Llh/c;

    .line 29
    .line 30
    const-string v1, "kotlin.annotations.jvm.UnderMigration"

    .line 31
    .line 32
    invoke-direct {v0, v1}, Llh/c;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sput-object v0, Lvg/c;->d:Llh/c;

    .line 36
    .line 37
    const/4 v0, 0x5

    .line 38
    new-array v0, v0, [Lvg/b;

    .line 39
    .line 40
    sget-object v1, Lvg/b;->n:Lvg/b;

    .line 41
    .line 42
    const/4 v2, 0x0

    .line 43
    aput-object v1, v0, v2

    .line 44
    .line 45
    sget-object v1, Lvg/b;->l:Lvg/b;

    .line 46
    .line 47
    const/4 v3, 0x1

    .line 48
    aput-object v1, v0, v3

    .line 49
    .line 50
    sget-object v1, Lvg/b;->m:Lvg/b;

    .line 51
    .line 52
    const/4 v4, 0x2

    .line 53
    aput-object v1, v0, v4

    .line 54
    .line 55
    const/4 v5, 0x3

    .line 56
    sget-object v6, Lvg/b;->p:Lvg/b;

    .line 57
    .line 58
    aput-object v6, v0, v5

    .line 59
    .line 60
    const/4 v5, 0x4

    .line 61
    sget-object v6, Lvg/b;->o:Lvg/b;

    .line 62
    .line 63
    aput-object v6, v0, v5

    .line 64
    .line 65
    invoke-static {v0}, Lkotlin/collections/h;->l([Ljava/lang/Object;)Ljava/util/List;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    sput-object v0, Lvg/c;->e:Ljava/util/List;

    .line 70
    .line 71
    invoke-static {}, Lvg/c0;->i()Llh/c;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    new-instance v6, Lvg/r;

    .line 76
    .line 77
    new-instance v7, Ldh/i;

    .line 78
    .line 79
    sget-object v8, Ldh/h;->m:Ldh/h;

    .line 80
    .line 81
    const/4 v9, 0x0

    .line 82
    invoke-direct {v7, v8, v2, v4, v9}, Ldh/i;-><init>(Ldh/h;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 83
    .line 84
    .line 85
    invoke-direct {v6, v7, v0, v2}, Lvg/r;-><init>(Ldh/i;Ljava/util/Collection;Z)V

    .line 86
    .line 87
    .line 88
    invoke-static {v5, v6}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-static {v0}, Lmf/s;->e(Lkotlin/Pair;)Ljava/util/Map;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    sput-object v0, Lvg/c;->f:Ljava/util/Map;

    .line 97
    .line 98
    new-array v5, v4, [Lkotlin/Pair;

    .line 99
    .line 100
    new-instance v6, Llh/c;

    .line 101
    .line 102
    const-string v7, "javax.annotation.ParametersAreNullableByDefault"

    .line 103
    .line 104
    invoke-direct {v6, v7}, Llh/c;-><init>(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    new-instance v7, Lvg/r;

    .line 108
    .line 109
    new-instance v11, Ldh/i;

    .line 110
    .line 111
    sget-object v10, Ldh/h;->l:Ldh/h;

    .line 112
    .line 113
    invoke-direct {v11, v10, v2, v4, v9}, Ldh/i;-><init>(Ldh/h;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 114
    .line 115
    .line 116
    invoke-static {v1}, Lkotlin/collections/h;->d(Ljava/lang/Object;)Ljava/util/List;

    .line 117
    .line 118
    .line 119
    move-result-object v12

    .line 120
    const/4 v13, 0x0

    .line 121
    const/4 v14, 0x4

    .line 122
    const/4 v15, 0x0

    .line 123
    move-object v10, v7

    .line 124
    invoke-direct/range {v10 .. v15}, Lvg/r;-><init>(Ldh/i;Ljava/util/Collection;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 125
    .line 126
    .line 127
    invoke-static {v6, v7}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 128
    .line 129
    .line 130
    move-result-object v6

    .line 131
    aput-object v6, v5, v2

    .line 132
    .line 133
    new-instance v6, Llh/c;

    .line 134
    .line 135
    const-string v7, "javax.annotation.ParametersAreNonnullByDefault"

    .line 136
    .line 137
    invoke-direct {v6, v7}, Llh/c;-><init>(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    new-instance v7, Lvg/r;

    .line 141
    .line 142
    new-instance v11, Ldh/i;

    .line 143
    .line 144
    invoke-direct {v11, v8, v2, v4, v9}, Ldh/i;-><init>(Ldh/h;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 145
    .line 146
    .line 147
    invoke-static {v1}, Lkotlin/collections/h;->d(Ljava/lang/Object;)Ljava/util/List;

    .line 148
    .line 149
    .line 150
    move-result-object v12

    .line 151
    move-object v10, v7

    .line 152
    invoke-direct/range {v10 .. v15}, Lvg/r;-><init>(Ldh/i;Ljava/util/Collection;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 153
    .line 154
    .line 155
    invoke-static {v6, v7}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    aput-object v1, v5, v3

    .line 160
    .line 161
    invoke-static {v5}, Lmf/s;->k([Lkotlin/Pair;)Ljava/util/Map;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    invoke-static {v1, v0}, Lmf/s;->o(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    sput-object v0, Lvg/c;->g:Ljava/util/Map;

    .line 170
    .line 171
    new-array v0, v4, [Llh/c;

    .line 172
    .line 173
    invoke-static {}, Lvg/c0;->f()Llh/c;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    aput-object v1, v0, v2

    .line 178
    .line 179
    invoke-static {}, Lvg/c0;->e()Llh/c;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    aput-object v1, v0, v3

    .line 184
    .line 185
    invoke-static {v0}, Lkotlin/collections/u;->i([Ljava/lang/Object;)Ljava/util/Set;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    sput-object v0, Lvg/c;->h:Ljava/util/Set;

    .line 190
    .line 191
    return-void
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

.method public static final a()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Llh/c;",
            "Lvg/r;",
            ">;"
        }
    .end annotation

    sget-object v0, Lvg/c;->g:Ljava/util/Map;

    return-object v0
.end method

.method public static final b()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Llh/c;",
            ">;"
        }
    .end annotation

    sget-object v0, Lvg/c;->h:Ljava/util/Set;

    return-object v0
.end method

.method public static final c()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Llh/c;",
            "Lvg/r;",
            ">;"
        }
    .end annotation

    sget-object v0, Lvg/c;->f:Ljava/util/Map;

    return-object v0
.end method

.method public static final d()Llh/c;
    .locals 1

    sget-object v0, Lvg/c;->d:Llh/c;

    return-object v0
.end method

.method public static final e()Llh/c;
    .locals 1

    sget-object v0, Lvg/c;->c:Llh/c;

    return-object v0
.end method

.method public static final f()Llh/c;
    .locals 1

    sget-object v0, Lvg/c;->b:Llh/c;

    return-object v0
.end method

.method public static final g()Llh/c;
    .locals 1

    sget-object v0, Lvg/c;->a:Llh/c;

    return-object v0
.end method
