.class public final enum Ljg/i;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ljg/i$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ljg/i;",
        ">;"
    }
.end annotation


# static fields
.field public static final o:Ljg/i$a;

.field public static final p:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljg/i;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum q:Ljg/i;

.field public static final enum r:Ljg/i;

.field public static final enum s:Ljg/i;

.field public static final enum t:Ljg/i;

.field public static final enum u:Ljg/i;

.field public static final enum v:Ljg/i;

.field public static final enum w:Ljg/i;

.field public static final enum x:Ljg/i;

.field private static final synthetic y:[Ljg/i;


# instance fields
.field private final k:Llh/f;

.field private final l:Llh/f;

.field private final m:Lkotlin/Lazy;

.field private final n:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    .line 1
    new-instance v0, Ljg/i;

    .line 2
    .line 3
    const-string v1, "Boolean"

    .line 4
    .line 5
    const-string v2, "BOOLEAN"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v0, v2, v3, v1}, Ljg/i;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Ljg/i;->q:Ljg/i;

    .line 12
    .line 13
    new-instance v0, Ljg/i;

    .line 14
    .line 15
    const-string v1, "Char"

    .line 16
    .line 17
    const-string v2, "CHAR"

    .line 18
    .line 19
    const/4 v4, 0x1

    .line 20
    invoke-direct {v0, v2, v4, v1}, Ljg/i;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Ljg/i;->r:Ljg/i;

    .line 24
    .line 25
    new-instance v1, Ljg/i;

    .line 26
    .line 27
    const-string v2, "Byte"

    .line 28
    .line 29
    const-string v5, "BYTE"

    .line 30
    .line 31
    const/4 v6, 0x2

    .line 32
    invoke-direct {v1, v5, v6, v2}, Ljg/i;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sput-object v1, Ljg/i;->s:Ljg/i;

    .line 36
    .line 37
    new-instance v2, Ljg/i;

    .line 38
    .line 39
    const-string v5, "Short"

    .line 40
    .line 41
    const-string v7, "SHORT"

    .line 42
    .line 43
    const/4 v8, 0x3

    .line 44
    invoke-direct {v2, v7, v8, v5}, Ljg/i;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 45
    .line 46
    .line 47
    sput-object v2, Ljg/i;->t:Ljg/i;

    .line 48
    .line 49
    new-instance v5, Ljg/i;

    .line 50
    .line 51
    const-string v7, "Int"

    .line 52
    .line 53
    const-string v9, "INT"

    .line 54
    .line 55
    const/4 v10, 0x4

    .line 56
    invoke-direct {v5, v9, v10, v7}, Ljg/i;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 57
    .line 58
    .line 59
    sput-object v5, Ljg/i;->u:Ljg/i;

    .line 60
    .line 61
    new-instance v7, Ljg/i;

    .line 62
    .line 63
    const-string v9, "Float"

    .line 64
    .line 65
    const-string v11, "FLOAT"

    .line 66
    .line 67
    const/4 v12, 0x5

    .line 68
    invoke-direct {v7, v11, v12, v9}, Ljg/i;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 69
    .line 70
    .line 71
    sput-object v7, Ljg/i;->v:Ljg/i;

    .line 72
    .line 73
    new-instance v9, Ljg/i;

    .line 74
    .line 75
    const-string v11, "Long"

    .line 76
    .line 77
    const-string v13, "LONG"

    .line 78
    .line 79
    const/4 v14, 0x6

    .line 80
    invoke-direct {v9, v13, v14, v11}, Ljg/i;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 81
    .line 82
    .line 83
    sput-object v9, Ljg/i;->w:Ljg/i;

    .line 84
    .line 85
    new-instance v11, Ljg/i;

    .line 86
    .line 87
    const-string v13, "Double"

    .line 88
    .line 89
    const-string v15, "DOUBLE"

    .line 90
    .line 91
    const/4 v14, 0x7

    .line 92
    invoke-direct {v11, v15, v14, v13}, Ljg/i;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 93
    .line 94
    .line 95
    sput-object v11, Ljg/i;->x:Ljg/i;

    .line 96
    .line 97
    invoke-static {}, Ljg/i;->a()[Ljg/i;

    .line 98
    .line 99
    .line 100
    move-result-object v13

    .line 101
    sput-object v13, Ljg/i;->y:[Ljg/i;

    .line 102
    .line 103
    new-instance v13, Ljg/i$a;

    .line 104
    .line 105
    const/4 v15, 0x0

    .line 106
    invoke-direct {v13, v15}, Ljg/i$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 107
    .line 108
    .line 109
    sput-object v13, Ljg/i;->o:Ljg/i$a;

    .line 110
    .line 111
    new-array v13, v14, [Ljg/i;

    .line 112
    .line 113
    aput-object v0, v13, v3

    .line 114
    .line 115
    aput-object v1, v13, v4

    .line 116
    .line 117
    aput-object v2, v13, v6

    .line 118
    .line 119
    aput-object v5, v13, v8

    .line 120
    .line 121
    aput-object v7, v13, v10

    .line 122
    .line 123
    aput-object v9, v13, v12

    .line 124
    .line 125
    const/4 v0, 0x6

    .line 126
    aput-object v11, v13, v0

    .line 127
    .line 128
    invoke-static {v13}, Lkotlin/collections/u;->i([Ljava/lang/Object;)Ljava/util/Set;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    sput-object v0, Ljg/i;->p:Ljava/util/Set;

    .line 133
    .line 134
    return-void
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

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    invoke-static {p3}, Llh/f;->h(Ljava/lang/String;)Llh/f;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    const-string p2, "identifier(typeName)"

    .line 9
    .line 10
    invoke-static {p1, p2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Ljg/i;->k:Llh/f;

    .line 14
    .line 15
    new-instance p1, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string p2, "Array"

    .line 24
    .line 25
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-static {p1}, Llh/f;->h(Ljava/lang/String;)Llh/f;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    const-string p2, "identifier(\"${typeName}Array\")"

    .line 37
    .line 38
    invoke-static {p1, p2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    iput-object p1, p0, Ljg/i;->l:Llh/f;

    .line 42
    .line 43
    sget-object p1, Llf/p;->l:Llf/p;

    .line 44
    .line 45
    new-instance p2, Ljg/i$c;

    .line 46
    .line 47
    invoke-direct {p2, p0}, Ljg/i$c;-><init>(Ljg/i;)V

    .line 48
    .line 49
    .line 50
    invoke-static {p1, p2}, Llf/m;->b(Llf/p;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    iput-object p2, p0, Ljg/i;->m:Lkotlin/Lazy;

    .line 55
    .line 56
    new-instance p2, Ljg/i$b;

    .line 57
    .line 58
    invoke-direct {p2, p0}, Ljg/i$b;-><init>(Ljg/i;)V

    .line 59
    .line 60
    .line 61
    invoke-static {p1, p2}, Llf/m;->b(Llf/p;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    iput-object p1, p0, Ljg/i;->n:Lkotlin/Lazy;

    .line 66
    .line 67
    return-void
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

.method private static final synthetic a()[Ljg/i;
    .locals 3

    const/16 v0, 0x8

    new-array v0, v0, [Ljg/i;

    const/4 v1, 0x0

    sget-object v2, Ljg/i;->q:Ljg/i;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Ljg/i;->r:Ljg/i;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Ljg/i;->s:Ljg/i;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Ljg/i;->t:Ljg/i;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Ljg/i;->u:Ljg/i;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Ljg/i;->v:Ljg/i;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Ljg/i;->w:Ljg/i;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Ljg/i;->x:Ljg/i;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ljg/i;
    .locals 1

    const-class v0, Ljg/i;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ljg/i;

    return-object p0
.end method

.method public static values()[Ljg/i;
    .locals 1

    sget-object v0, Ljg/i;->y:[Ljg/i;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljg/i;

    return-object v0
.end method


# virtual methods
.method public final b()Llh/c;
    .locals 1

    iget-object v0, p0, Ljg/i;->n:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llh/c;

    return-object v0
.end method

.method public final c()Llh/f;
    .locals 1

    iget-object v0, p0, Ljg/i;->l:Llh/f;

    return-object v0
.end method

.method public final e()Llh/c;
    .locals 1

    iget-object v0, p0, Ljg/i;->m:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llh/c;

    return-object v0
.end method

.method public final f()Llh/f;
    .locals 1

    iget-object v0, p0, Ljg/i;->k:Llh/f;

    return-object v0
.end method
