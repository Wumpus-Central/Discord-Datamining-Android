.class public final Lwh/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lwh/d$a;
    }
.end annotation


# static fields
.field public static final c:Lwh/d$a;

.field private static d:I

.field private static final e:I

.field private static final f:I

.field private static final g:I

.field private static final h:I

.field private static final i:I

.field private static final j:I

.field private static final k:I

.field private static final l:I

.field private static final m:I

.field private static final n:I

.field public static final o:Lwh/d;

.field public static final p:Lwh/d;

.field public static final q:Lwh/d;

.field public static final r:Lwh/d;

.field public static final s:Lwh/d;

.field public static final t:Lwh/d;

.field public static final u:Lwh/d;

.field public static final v:Lwh/d;

.field public static final w:Lwh/d;

.field public static final x:Lwh/d;

.field private static final y:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lwh/d$a$a;",
            ">;"
        }
    .end annotation
.end field

.field private static final z:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lwh/d$a$a;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lwh/c;",
            ">;"
        }
    .end annotation
.end field

.field private final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 14

    .line 1
    new-instance v0, Lwh/d$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lwh/d$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lwh/d;->c:Lwh/d$a;

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    sput v2, Lwh/d;->d:I

    .line 11
    .line 12
    invoke-static {v0}, Lwh/d$a;->a(Lwh/d$a;)I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    sput v3, Lwh/d;->e:I

    .line 17
    .line 18
    invoke-static {v0}, Lwh/d$a;->a(Lwh/d$a;)I

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    sput v4, Lwh/d;->f:I

    .line 23
    .line 24
    invoke-static {v0}, Lwh/d$a;->a(Lwh/d$a;)I

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    sput v5, Lwh/d;->g:I

    .line 29
    .line 30
    invoke-static {v0}, Lwh/d$a;->a(Lwh/d$a;)I

    .line 31
    .line 32
    .line 33
    move-result v6

    .line 34
    sput v6, Lwh/d;->h:I

    .line 35
    .line 36
    invoke-static {v0}, Lwh/d$a;->a(Lwh/d$a;)I

    .line 37
    .line 38
    .line 39
    move-result v7

    .line 40
    sput v7, Lwh/d;->i:I

    .line 41
    .line 42
    invoke-static {v0}, Lwh/d$a;->a(Lwh/d$a;)I

    .line 43
    .line 44
    .line 45
    move-result v8

    .line 46
    sput v8, Lwh/d;->j:I

    .line 47
    .line 48
    invoke-static {v0}, Lwh/d$a;->a(Lwh/d$a;)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    sub-int/2addr v0, v2

    .line 53
    sput v0, Lwh/d;->k:I

    .line 54
    .line 55
    or-int v9, v3, v4

    .line 56
    .line 57
    or-int/2addr v9, v5

    .line 58
    sput v9, Lwh/d;->l:I

    .line 59
    .line 60
    or-int v10, v4, v7

    .line 61
    .line 62
    or-int/2addr v10, v8

    .line 63
    sput v10, Lwh/d;->m:I

    .line 64
    .line 65
    or-int v11, v7, v8

    .line 66
    .line 67
    sput v11, Lwh/d;->n:I

    .line 68
    .line 69
    new-instance v12, Lwh/d;

    .line 70
    .line 71
    const/4 v13, 0x2

    .line 72
    invoke-direct {v12, v0, v1, v13, v1}, Lwh/d;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 73
    .line 74
    .line 75
    sput-object v12, Lwh/d;->o:Lwh/d;

    .line 76
    .line 77
    new-instance v0, Lwh/d;

    .line 78
    .line 79
    invoke-direct {v0, v11, v1, v13, v1}, Lwh/d;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 80
    .line 81
    .line 82
    sput-object v0, Lwh/d;->p:Lwh/d;

    .line 83
    .line 84
    new-instance v0, Lwh/d;

    .line 85
    .line 86
    invoke-direct {v0, v3, v1, v13, v1}, Lwh/d;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 87
    .line 88
    .line 89
    sput-object v0, Lwh/d;->q:Lwh/d;

    .line 90
    .line 91
    new-instance v0, Lwh/d;

    .line 92
    .line 93
    invoke-direct {v0, v4, v1, v13, v1}, Lwh/d;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 94
    .line 95
    .line 96
    sput-object v0, Lwh/d;->r:Lwh/d;

    .line 97
    .line 98
    new-instance v0, Lwh/d;

    .line 99
    .line 100
    invoke-direct {v0, v5, v1, v13, v1}, Lwh/d;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 101
    .line 102
    .line 103
    sput-object v0, Lwh/d;->s:Lwh/d;

    .line 104
    .line 105
    new-instance v0, Lwh/d;

    .line 106
    .line 107
    invoke-direct {v0, v9, v1, v13, v1}, Lwh/d;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 108
    .line 109
    .line 110
    sput-object v0, Lwh/d;->t:Lwh/d;

    .line 111
    .line 112
    new-instance v0, Lwh/d;

    .line 113
    .line 114
    invoke-direct {v0, v6, v1, v13, v1}, Lwh/d;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 115
    .line 116
    .line 117
    sput-object v0, Lwh/d;->u:Lwh/d;

    .line 118
    .line 119
    new-instance v0, Lwh/d;

    .line 120
    .line 121
    invoke-direct {v0, v7, v1, v13, v1}, Lwh/d;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 122
    .line 123
    .line 124
    sput-object v0, Lwh/d;->v:Lwh/d;

    .line 125
    .line 126
    new-instance v0, Lwh/d;

    .line 127
    .line 128
    invoke-direct {v0, v8, v1, v13, v1}, Lwh/d;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 129
    .line 130
    .line 131
    sput-object v0, Lwh/d;->w:Lwh/d;

    .line 132
    .line 133
    new-instance v0, Lwh/d;

    .line 134
    .line 135
    invoke-direct {v0, v10, v1, v13, v1}, Lwh/d;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 136
    .line 137
    .line 138
    sput-object v0, Lwh/d;->x:Lwh/d;

    .line 139
    .line 140
    const-class v0, Lwh/d;

    .line 141
    .line 142
    invoke-virtual {v0}, Ljava/lang/Class;->getFields()[Ljava/lang/reflect/Field;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    const-string v4, "T::class.java.fields"

    .line 147
    .line 148
    invoke-static {v3, v4}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    new-instance v5, Ljava/util/ArrayList;

    .line 152
    .line 153
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 154
    .line 155
    .line 156
    array-length v6, v3

    .line 157
    const/4 v7, 0x0

    .line 158
    move v8, v7

    .line 159
    :goto_0
    if-ge v8, v6, :cond_1

    .line 160
    .line 161
    aget-object v9, v3, v8

    .line 162
    .line 163
    invoke-virtual {v9}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 164
    .line 165
    .line 166
    move-result v10

    .line 167
    invoke-static {v10}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 168
    .line 169
    .line 170
    move-result v10

    .line 171
    if-eqz v10, :cond_0

    .line 172
    .line 173
    invoke-interface {v5, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    :cond_0
    add-int/lit8 v8, v8, 0x1

    .line 177
    .line 178
    goto :goto_0

    .line 179
    :cond_1
    new-instance v3, Ljava/util/ArrayList;

    .line 180
    .line 181
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 182
    .line 183
    .line 184
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 185
    .line 186
    .line 187
    move-result-object v5

    .line 188
    :cond_2
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 189
    .line 190
    .line 191
    move-result v6

    .line 192
    const-string v8, "field.name"

    .line 193
    .line 194
    if-eqz v6, :cond_5

    .line 195
    .line 196
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v6

    .line 200
    check-cast v6, Ljava/lang/reflect/Field;

    .line 201
    .line 202
    invoke-virtual {v6, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v9

    .line 206
    instance-of v10, v9, Lwh/d;

    .line 207
    .line 208
    if-eqz v10, :cond_3

    .line 209
    .line 210
    check-cast v9, Lwh/d;

    .line 211
    .line 212
    goto :goto_2

    .line 213
    :cond_3
    move-object v9, v1

    .line 214
    :goto_2
    if-eqz v9, :cond_4

    .line 215
    .line 216
    new-instance v10, Lwh/d$a$a;

    .line 217
    .line 218
    iget v9, v9, Lwh/d;->b:I

    .line 219
    .line 220
    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v6

    .line 224
    invoke-static {v6, v8}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    invoke-direct {v10, v9, v6}, Lwh/d$a$a;-><init>(ILjava/lang/String;)V

    .line 228
    .line 229
    .line 230
    goto :goto_3

    .line 231
    :cond_4
    move-object v10, v1

    .line 232
    :goto_3
    if-eqz v10, :cond_2

    .line 233
    .line 234
    invoke-interface {v3, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    goto :goto_1

    .line 238
    :cond_5
    sput-object v3, Lwh/d;->y:Ljava/util/List;

    .line 239
    .line 240
    invoke-virtual {v0}, Ljava/lang/Class;->getFields()[Ljava/lang/reflect/Field;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    invoke-static {v0, v4}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    new-instance v3, Ljava/util/ArrayList;

    .line 248
    .line 249
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 250
    .line 251
    .line 252
    array-length v4, v0

    .line 253
    move v5, v7

    .line 254
    :goto_4
    if-ge v5, v4, :cond_7

    .line 255
    .line 256
    aget-object v6, v0, v5

    .line 257
    .line 258
    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 259
    .line 260
    .line 261
    move-result v9

    .line 262
    invoke-static {v9}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 263
    .line 264
    .line 265
    move-result v9

    .line 266
    if-eqz v9, :cond_6

    .line 267
    .line 268
    invoke-interface {v3, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    :cond_6
    add-int/lit8 v5, v5, 0x1

    .line 272
    .line 273
    goto :goto_4

    .line 274
    :cond_7
    new-instance v0, Ljava/util/ArrayList;

    .line 275
    .line 276
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 277
    .line 278
    .line 279
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 280
    .line 281
    .line 282
    move-result-object v3

    .line 283
    :cond_8
    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 284
    .line 285
    .line 286
    move-result v4

    .line 287
    if-eqz v4, :cond_9

    .line 288
    .line 289
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v4

    .line 293
    move-object v5, v4

    .line 294
    check-cast v5, Ljava/lang/reflect/Field;

    .line 295
    .line 296
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 297
    .line 298
    .line 299
    move-result-object v5

    .line 300
    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 301
    .line 302
    invoke-static {v5, v6}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 303
    .line 304
    .line 305
    move-result v5

    .line 306
    if-eqz v5, :cond_8

    .line 307
    .line 308
    invoke-interface {v0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 309
    .line 310
    .line 311
    goto :goto_5

    .line 312
    :cond_9
    new-instance v3, Ljava/util/ArrayList;

    .line 313
    .line 314
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 315
    .line 316
    .line 317
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 318
    .line 319
    .line 320
    move-result-object v0

    .line 321
    :cond_a
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 322
    .line 323
    .line 324
    move-result v4

    .line 325
    if-eqz v4, :cond_d

    .line 326
    .line 327
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    move-result-object v4

    .line 331
    check-cast v4, Ljava/lang/reflect/Field;

    .line 332
    .line 333
    invoke-virtual {v4, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object v5

    .line 337
    const-string v6, "null cannot be cast to non-null type kotlin.Int"

    .line 338
    .line 339
    invoke-static {v5, v6}, Lkotlin/jvm/internal/q;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 340
    .line 341
    .line 342
    check-cast v5, Ljava/lang/Integer;

    .line 343
    .line 344
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 345
    .line 346
    .line 347
    move-result v5

    .line 348
    neg-int v6, v5

    .line 349
    and-int/2addr v6, v5

    .line 350
    if-ne v5, v6, :cond_b

    .line 351
    .line 352
    move v6, v2

    .line 353
    goto :goto_7

    .line 354
    :cond_b
    move v6, v7

    .line 355
    :goto_7
    if-eqz v6, :cond_c

    .line 356
    .line 357
    new-instance v6, Lwh/d$a$a;

    .line 358
    .line 359
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 360
    .line 361
    .line 362
    move-result-object v4

    .line 363
    invoke-static {v4, v8}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 364
    .line 365
    .line 366
    invoke-direct {v6, v5, v4}, Lwh/d$a$a;-><init>(ILjava/lang/String;)V

    .line 367
    .line 368
    .line 369
    goto :goto_8

    .line 370
    :cond_c
    move-object v6, v1

    .line 371
    :goto_8
    if-eqz v6, :cond_a

    .line 372
    .line 373
    invoke-interface {v3, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 374
    .line 375
    .line 376
    goto :goto_6

    .line 377
    :cond_d
    sput-object v3, Lwh/d;->z:Ljava/util/List;

    .line 378
    .line 379
    return-void
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

.method public constructor <init>(ILjava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "+",
            "Lwh/c;",
            ">;)V"
        }
    .end annotation

    const-string v0, "excludes"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p2, p0, Lwh/d;->a:Ljava/util/List;

    .line 3
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwh/c;

    .line 4
    invoke-virtual {v0}, Lwh/c;->a()I

    move-result v0

    not-int v0, v0

    and-int/2addr p1, v0

    goto :goto_0

    .line 5
    :cond_0
    iput p1, p0, Lwh/d;->b:I

    return-void
.end method

.method public synthetic constructor <init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 6
    invoke-static {}, Lkotlin/collections/h;->i()Ljava/util/List;

    move-result-object p2

    .line 7
    :cond_0
    invoke-direct {p0, p1, p2}, Lwh/d;-><init>(ILjava/util/List;)V

    return-void
.end method

.method public static final synthetic b()I
    .locals 1

    sget v0, Lwh/d;->k:I

    return v0
.end method

.method public static final synthetic c()I
    .locals 1

    sget v0, Lwh/d;->l:I

    return v0
.end method

.method public static final synthetic d()I
    .locals 1

    sget v0, Lwh/d;->i:I

    return v0
.end method

.method public static final synthetic e()I
    .locals 1

    sget v0, Lwh/d;->e:I

    return v0
.end method

.method public static final synthetic f()I
    .locals 1

    sget v0, Lwh/d;->d:I

    return v0
.end method

.method public static final synthetic g()I
    .locals 1

    sget v0, Lwh/d;->h:I

    return v0
.end method

.method public static final synthetic h()I
    .locals 1

    sget v0, Lwh/d;->f:I

    return v0
.end method

.method public static final synthetic i()I
    .locals 1

    sget v0, Lwh/d;->g:I

    return v0
.end method

.method public static final synthetic j()I
    .locals 1

    sget v0, Lwh/d;->j:I

    return v0
.end method

.method public static final synthetic k(I)V
    .locals 0

    sput p0, Lwh/d;->d:I

    return-void
.end method


# virtual methods
.method public final a(I)Z
    .locals 1

    iget v0, p0, Lwh/d;->b:I

    and-int/2addr p1, v0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const-class v1, Lwh/d;

    .line 6
    .line 7
    if-eqz p1, :cond_1

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    goto :goto_0

    .line 14
    :cond_1
    const/4 v2, 0x0

    .line 15
    :goto_0
    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/4 v2, 0x0

    .line 20
    if-nez v1, :cond_2

    .line 21
    .line 22
    return v2

    .line 23
    :cond_2
    const-string v1, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter"

    .line 24
    .line 25
    invoke-static {p1, v1}, Lkotlin/jvm/internal/q;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    check-cast p1, Lwh/d;

    .line 29
    .line 30
    iget-object v1, p0, Lwh/d;->a:Ljava/util/List;

    .line 31
    .line 32
    iget-object v3, p1, Lwh/d;->a:Ljava/util/List;

    .line 33
    .line 34
    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-nez v1, :cond_3

    .line 39
    .line 40
    return v2

    .line 41
    :cond_3
    iget v1, p0, Lwh/d;->b:I

    .line 42
    .line 43
    iget p1, p1, Lwh/d;->b:I

    .line 44
    .line 45
    if-eq v1, p1, :cond_4

    .line 46
    .line 47
    return v2

    .line 48
    :cond_4
    return v0
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

.method public hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lwh/d;->a:Ljava/util/List;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget v1, p0, Lwh/d;->b:I

    .line 10
    .line 11
    add-int/2addr v0, v1

    .line 12
    return v0
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
.end method

.method public final l()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lwh/c;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lwh/d;->a:Ljava/util/List;

    return-object v0
.end method

.method public final m()I
    .locals 1

    iget v0, p0, Lwh/d;->b:I

    return v0
.end method

.method public final n(I)Lwh/d;
    .locals 2

    .line 1
    iget v0, p0, Lwh/d;->b:I

    .line 2
    .line 3
    and-int/2addr p1, v0

    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    return-object p1

    .line 8
    :cond_0
    new-instance v0, Lwh/d;

    .line 9
    .line 10
    iget-object v1, p0, Lwh/d;->a:Ljava/util/List;

    .line 11
    .line 12
    invoke-direct {v0, p1, v1}, Lwh/d;-><init>(ILjava/util/List;)V

    .line 13
    .line 14
    .line 15
    return-object v0
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

.method public toString()Ljava/lang/String;
    .locals 12

    .line 1
    sget-object v0, Lwh/d;->y:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x0

    .line 12
    if-eqz v1, :cond_2

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    move-object v3, v1

    .line 19
    check-cast v3, Lwh/d$a$a;

    .line 20
    .line 21
    invoke-virtual {v3}, Lwh/d$a$a;->a()I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    iget v4, p0, Lwh/d;->b:I

    .line 26
    .line 27
    if-ne v3, v4, :cond_1

    .line 28
    .line 29
    const/4 v3, 0x1

    .line 30
    goto :goto_0

    .line 31
    :cond_1
    const/4 v3, 0x0

    .line 32
    :goto_0
    if-eqz v3, :cond_0

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_2
    move-object v1, v2

    .line 36
    :goto_1
    check-cast v1, Lwh/d$a$a;

    .line 37
    .line 38
    if-eqz v1, :cond_3

    .line 39
    .line 40
    invoke-virtual {v1}, Lwh/d$a$a;->b()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    goto :goto_2

    .line 45
    :cond_3
    move-object v0, v2

    .line 46
    :goto_2
    if-nez v0, :cond_7

    .line 47
    .line 48
    sget-object v0, Lwh/d;->z:Ljava/util/List;

    .line 49
    .line 50
    new-instance v3, Ljava/util/ArrayList;

    .line 51
    .line 52
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 53
    .line 54
    .line 55
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    :cond_4
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-eqz v1, :cond_6

    .line 64
    .line 65
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    check-cast v1, Lwh/d$a$a;

    .line 70
    .line 71
    invoke-virtual {v1}, Lwh/d$a$a;->a()I

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    invoke-virtual {p0, v4}, Lwh/d;->a(I)Z

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    if-eqz v4, :cond_5

    .line 80
    .line 81
    invoke-virtual {v1}, Lwh/d$a$a;->b()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    goto :goto_4

    .line 86
    :cond_5
    move-object v1, v2

    .line 87
    :goto_4
    if-eqz v1, :cond_4

    .line 88
    .line 89
    invoke-interface {v3, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    goto :goto_3

    .line 93
    :cond_6
    const-string v4, " | "

    .line 94
    .line 95
    const/4 v5, 0x0

    .line 96
    const/4 v6, 0x0

    .line 97
    const/4 v7, 0x0

    .line 98
    const/4 v8, 0x0

    .line 99
    const/4 v9, 0x0

    .line 100
    const/16 v10, 0x3e

    .line 101
    .line 102
    const/4 v11, 0x0

    .line 103
    invoke-static/range {v3 .. v11}, Lkotlin/collections/h;->e0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    :cond_7
    new-instance v1, Ljava/lang/StringBuilder;

    .line 108
    .line 109
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 110
    .line 111
    .line 112
    const-string v2, "DescriptorKindFilter("

    .line 113
    .line 114
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    const-string v0, ", "

    .line 121
    .line 122
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    iget-object v0, p0, Lwh/d;->a:Ljava/util/List;

    .line 126
    .line 127
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    const/16 v0, 0x29

    .line 131
    .line 132
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    return-object v0
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
