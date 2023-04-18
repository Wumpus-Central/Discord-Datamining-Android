.class final Lgg/q$a;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgg/q;-><init>(Lgg/p;Ljava/lang/String;Ljava/lang/String;Lmg/y;Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function0<",
        "Lhg/e<",
        "+",
        "Ljava/lang/reflect/Executable;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0001 \u0002*\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lhg/e;",
        "Ljava/lang/reflect/Executable;",
        "kotlin.jvm.PlatformType",
        "a",
        "()Lhg/e;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field final synthetic k:Lgg/q;


# direct methods
.method constructor <init>(Lgg/q;)V
    .locals 0

    iput-object p1, p0, Lgg/q$a;->k:Lgg/q;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lhg/e;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhg/e<",
            "Ljava/lang/reflect/Executable;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lgg/m0;->a:Lgg/m0;

    .line 2
    .line 3
    iget-object v1, p0, Lgg/q$a;->k:Lgg/q;

    .line 4
    .line 5
    invoke-virtual {v1}, Lgg/q;->K()Lmg/y;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Lgg/m0;->g(Lmg/y;)Lgg/j;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    instance-of v1, v0, Lgg/j$d;

    .line 14
    .line 15
    const/16 v2, 0xa

    .line 16
    .line 17
    if-eqz v1, :cond_2

    .line 18
    .line 19
    iget-object v1, p0, Lgg/q$a;->k:Lgg/q;

    .line 20
    .line 21
    invoke-virtual {v1}, Lgg/l;->y()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    iget-object v0, p0, Lgg/q$a;->k:Lgg/q;

    .line 28
    .line 29
    invoke-virtual {v0}, Lgg/q;->v()Lgg/p;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-interface {v0}, Lkotlin/jvm/internal/g;->c()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    iget-object v0, p0, Lgg/q$a;->k:Lgg/q;

    .line 38
    .line 39
    invoke-virtual {v0}, Lgg/l;->getParameters()Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    new-instance v5, Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-static {v0, v2}, Lkotlin/collections/h;->t(Ljava/lang/Iterable;I)I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    invoke-direct {v5, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 50
    .line 51
    .line 52
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-eqz v1, :cond_0

    .line 61
    .line 62
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    check-cast v1, Ldg/f;

    .line 67
    .line 68
    invoke-interface {v1}, Ldg/f;->getName()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-static {v1}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    invoke-interface {v5, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_0
    sget-object v6, Lhg/a$a;->l:Lhg/a$a;

    .line 80
    .line 81
    sget-object v7, Lhg/a$b;->l:Lhg/a$b;

    .line 82
    .line 83
    const/4 v8, 0x0

    .line 84
    const/16 v9, 0x10

    .line 85
    .line 86
    const/4 v10, 0x0

    .line 87
    new-instance v0, Lhg/a;

    .line 88
    .line 89
    move-object v3, v0

    .line 90
    invoke-direct/range {v3 .. v10}, Lhg/a;-><init>(Ljava/lang/Class;Ljava/util/List;Lhg/a$a;Lhg/a$b;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 91
    .line 92
    .line 93
    return-object v0

    .line 94
    :cond_1
    iget-object v1, p0, Lgg/q$a;->k:Lgg/q;

    .line 95
    .line 96
    invoke-virtual {v1}, Lgg/q;->v()Lgg/p;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    check-cast v0, Lgg/j$d;

    .line 101
    .line 102
    invoke-virtual {v0}, Lgg/j$d;->b()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    invoke-virtual {v1, v0}, Lgg/p;->r(Ljava/lang/String;)Ljava/lang/reflect/Constructor;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    goto :goto_1

    .line 111
    :cond_2
    instance-of v1, v0, Lgg/j$e;

    .line 112
    .line 113
    if-eqz v1, :cond_3

    .line 114
    .line 115
    iget-object v1, p0, Lgg/q$a;->k:Lgg/q;

    .line 116
    .line 117
    invoke-virtual {v1}, Lgg/q;->v()Lgg/p;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    check-cast v0, Lgg/j$e;

    .line 122
    .line 123
    invoke-virtual {v0}, Lgg/j$e;->c()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    invoke-virtual {v0}, Lgg/j$e;->b()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-virtual {v1, v2, v0}, Lgg/p;->v(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    goto :goto_1

    .line 136
    :cond_3
    instance-of v1, v0, Lgg/j$c;

    .line 137
    .line 138
    if-eqz v1, :cond_4

    .line 139
    .line 140
    check-cast v0, Lgg/j$c;

    .line 141
    .line 142
    invoke-virtual {v0}, Lgg/j$c;->b()Ljava/lang/reflect/Method;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    goto :goto_1

    .line 147
    :cond_4
    instance-of v1, v0, Lgg/j$b;

    .line 148
    .line 149
    if-eqz v1, :cond_9

    .line 150
    .line 151
    check-cast v0, Lgg/j$b;

    .line 152
    .line 153
    invoke-virtual {v0}, Lgg/j$b;->b()Ljava/lang/reflect/Constructor;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    :goto_1
    instance-of v1, v0, Ljava/lang/reflect/Constructor;

    .line 158
    .line 159
    const/4 v2, 0x0

    .line 160
    if-eqz v1, :cond_5

    .line 161
    .line 162
    iget-object v1, p0, Lgg/q$a;->k:Lgg/q;

    .line 163
    .line 164
    check-cast v0, Ljava/lang/reflect/Constructor;

    .line 165
    .line 166
    invoke-virtual {v1}, Lgg/q;->K()Lmg/y;

    .line 167
    .line 168
    .line 169
    move-result-object v3

    .line 170
    invoke-static {v1, v0, v3, v2}, Lgg/q;->A(Lgg/q;Ljava/lang/reflect/Constructor;Lmg/y;Z)Lhg/f;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    goto :goto_2

    .line 175
    :cond_5
    instance-of v1, v0, Ljava/lang/reflect/Method;

    .line 176
    .line 177
    if-eqz v1, :cond_8

    .line 178
    .line 179
    check-cast v0, Ljava/lang/reflect/Method;

    .line 180
    .line 181
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 182
    .line 183
    .line 184
    move-result v1

    .line 185
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 186
    .line 187
    .line 188
    move-result v1

    .line 189
    if-nez v1, :cond_6

    .line 190
    .line 191
    iget-object v1, p0, Lgg/q$a;->k:Lgg/q;

    .line 192
    .line 193
    invoke-static {v1, v0}, Lgg/q;->B(Lgg/q;Ljava/lang/reflect/Method;)Lhg/f$h;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    goto :goto_2

    .line 198
    :cond_6
    iget-object v1, p0, Lgg/q$a;->k:Lgg/q;

    .line 199
    .line 200
    invoke-virtual {v1}, Lgg/q;->K()Lmg/y;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    invoke-interface {v1}, Lng/a;->getAnnotations()Lng/g;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    invoke-static {}, Lgg/p0;->j()Llh/c;

    .line 209
    .line 210
    .line 211
    move-result-object v3

    .line 212
    invoke-interface {v1, v3}, Lng/g;->a(Llh/c;)Lng/c;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    if-eqz v1, :cond_7

    .line 217
    .line 218
    iget-object v1, p0, Lgg/q$a;->k:Lgg/q;

    .line 219
    .line 220
    invoke-static {v1, v0}, Lgg/q;->C(Lgg/q;Ljava/lang/reflect/Method;)Lhg/f$h;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    goto :goto_2

    .line 225
    :cond_7
    iget-object v1, p0, Lgg/q$a;->k:Lgg/q;

    .line 226
    .line 227
    invoke-static {v1, v0}, Lgg/q;->D(Lgg/q;Ljava/lang/reflect/Method;)Lhg/f$h;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    :goto_2
    iget-object v1, p0, Lgg/q$a;->k:Lgg/q;

    .line 232
    .line 233
    invoke-virtual {v1}, Lgg/q;->K()Lmg/y;

    .line 234
    .line 235
    .line 236
    move-result-object v1

    .line 237
    const/4 v3, 0x2

    .line 238
    const/4 v4, 0x0

    .line 239
    invoke-static {v0, v1, v2, v3, v4}, Lhg/i;->c(Lhg/e;Lmg/b;ZILjava/lang/Object;)Lhg/e;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    return-object v0

    .line 244
    :cond_8
    new-instance v1, Lgg/h0;

    .line 245
    .line 246
    new-instance v2, Ljava/lang/StringBuilder;

    .line 247
    .line 248
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 249
    .line 250
    .line 251
    const-string v3, "Could not compute caller for function: "

    .line 252
    .line 253
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 254
    .line 255
    .line 256
    iget-object v3, p0, Lgg/q$a;->k:Lgg/q;

    .line 257
    .line 258
    invoke-virtual {v3}, Lgg/q;->K()Lmg/y;

    .line 259
    .line 260
    .line 261
    move-result-object v3

    .line 262
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 263
    .line 264
    .line 265
    const-string v3, " (member = "

    .line 266
    .line 267
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 268
    .line 269
    .line 270
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 271
    .line 272
    .line 273
    const/16 v0, 0x29

    .line 274
    .line 275
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 276
    .line 277
    .line 278
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    invoke-direct {v1, v0}, Lgg/h0;-><init>(Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    throw v1

    .line 286
    :cond_9
    instance-of v1, v0, Lgg/j$a;

    .line 287
    .line 288
    if-eqz v1, :cond_b

    .line 289
    .line 290
    check-cast v0, Lgg/j$a;

    .line 291
    .line 292
    invoke-virtual {v0}, Lgg/j$a;->b()Ljava/util/List;

    .line 293
    .line 294
    .line 295
    move-result-object v8

    .line 296
    iget-object v0, p0, Lgg/q$a;->k:Lgg/q;

    .line 297
    .line 298
    invoke-virtual {v0}, Lgg/q;->v()Lgg/p;

    .line 299
    .line 300
    .line 301
    move-result-object v0

    .line 302
    invoke-interface {v0}, Lkotlin/jvm/internal/g;->c()Ljava/lang/Class;

    .line 303
    .line 304
    .line 305
    move-result-object v4

    .line 306
    new-instance v5, Ljava/util/ArrayList;

    .line 307
    .line 308
    invoke-static {v8, v2}, Lkotlin/collections/h;->t(Ljava/lang/Iterable;I)I

    .line 309
    .line 310
    .line 311
    move-result v0

    .line 312
    invoke-direct {v5, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 313
    .line 314
    .line 315
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 320
    .line 321
    .line 322
    move-result v1

    .line 323
    if-eqz v1, :cond_a

    .line 324
    .line 325
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    move-result-object v1

    .line 329
    check-cast v1, Ljava/lang/reflect/Method;

    .line 330
    .line 331
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object v1

    .line 335
    invoke-interface {v5, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 336
    .line 337
    .line 338
    goto :goto_3

    .line 339
    :cond_a
    sget-object v6, Lhg/a$a;->l:Lhg/a$a;

    .line 340
    .line 341
    sget-object v7, Lhg/a$b;->k:Lhg/a$b;

    .line 342
    .line 343
    new-instance v0, Lhg/a;

    .line 344
    .line 345
    move-object v3, v0

    .line 346
    invoke-direct/range {v3 .. v8}, Lhg/a;-><init>(Ljava/lang/Class;Ljava/util/List;Lhg/a$a;Lhg/a$b;Ljava/util/List;)V

    .line 347
    .line 348
    .line 349
    return-object v0

    .line 350
    :cond_b
    new-instance v0, Llf/q;

    .line 351
    .line 352
    invoke-direct {v0}, Llf/q;-><init>()V

    .line 353
    .line 354
    .line 355
    throw v0
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

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lgg/q$a;->a()Lhg/e;

    move-result-object v0

    return-object v0
.end method
