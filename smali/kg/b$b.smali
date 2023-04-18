.class final Lkg/b$b;
.super Ldi/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkg/b$b$a;
    }
.end annotation


# instance fields
.field final synthetic d:Lkg/b;


# direct methods
.method public constructor <init>(Lkg/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lkg/b$b;->d:Lkg/b;

    invoke-static {p1}, Lkg/b;->P0(Lkg/b;)Lci/n;

    move-result-object p1

    invoke-direct {p0, p1}, Ldi/b;-><init>(Lci/n;)V

    return-void
.end method


# virtual methods
.method public getParameters()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lmg/f1;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lkg/b$b;->d:Lkg/b;

    invoke-static {v0}, Lkg/b;->O0(Lkg/b;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method protected h()Ljava/util/Collection;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Ldi/g0;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lkg/b$b;->d:Lkg/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lkg/b;->U0()Lkg/c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lkg/b$b$a;->a:[I

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    aget v0, v1, v0

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    if-eq v0, v1, :cond_3

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    const/4 v3, 0x2

    .line 20
    if-eq v0, v3, :cond_2

    .line 21
    .line 22
    const/4 v4, 0x3

    .line 23
    if-eq v0, v4, :cond_1

    .line 24
    .line 25
    const/4 v4, 0x4

    .line 26
    if-ne v0, v4, :cond_0

    .line 27
    .line 28
    new-array v0, v3, [Llh/b;

    .line 29
    .line 30
    invoke-static {}, Lkg/b;->N0()Llh/b;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    aput-object v3, v0, v2

    .line 35
    .line 36
    new-instance v2, Llh/b;

    .line 37
    .line 38
    sget-object v3, Ljg/k;->m:Llh/c;

    .line 39
    .line 40
    sget-object v4, Lkg/c;->q:Lkg/c;

    .line 41
    .line 42
    iget-object v5, p0, Lkg/b$b;->d:Lkg/b;

    .line 43
    .line 44
    invoke-virtual {v5}, Lkg/b;->Q0()I

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    invoke-virtual {v4, v5}, Lkg/c;->e(I)Llh/f;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    invoke-direct {v2, v3, v4}, Llh/b;-><init>(Llh/c;Llh/f;)V

    .line 53
    .line 54
    .line 55
    aput-object v2, v0, v1

    .line 56
    .line 57
    invoke-static {v0}, Lkotlin/collections/h;->l([Ljava/lang/Object;)Ljava/util/List;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    goto :goto_0

    .line 62
    :cond_0
    new-instance v0, Llf/q;

    .line 63
    .line 64
    invoke-direct {v0}, Llf/q;-><init>()V

    .line 65
    .line 66
    .line 67
    throw v0

    .line 68
    :cond_1
    invoke-static {}, Lkg/b;->M0()Llh/b;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-static {v0}, Lkotlin/collections/h;->d(Ljava/lang/Object;)Ljava/util/List;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    goto :goto_0

    .line 77
    :cond_2
    new-array v0, v3, [Llh/b;

    .line 78
    .line 79
    invoke-static {}, Lkg/b;->N0()Llh/b;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    aput-object v3, v0, v2

    .line 84
    .line 85
    new-instance v2, Llh/b;

    .line 86
    .line 87
    sget-object v3, Ljg/k;->u:Llh/c;

    .line 88
    .line 89
    sget-object v4, Lkg/c;->p:Lkg/c;

    .line 90
    .line 91
    iget-object v5, p0, Lkg/b$b;->d:Lkg/b;

    .line 92
    .line 93
    invoke-virtual {v5}, Lkg/b;->Q0()I

    .line 94
    .line 95
    .line 96
    move-result v5

    .line 97
    invoke-virtual {v4, v5}, Lkg/c;->e(I)Llh/f;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    invoke-direct {v2, v3, v4}, Llh/b;-><init>(Llh/c;Llh/f;)V

    .line 102
    .line 103
    .line 104
    aput-object v2, v0, v1

    .line 105
    .line 106
    invoke-static {v0}, Lkotlin/collections/h;->l([Ljava/lang/Object;)Ljava/util/List;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    goto :goto_0

    .line 111
    :cond_3
    invoke-static {}, Lkg/b;->M0()Llh/b;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-static {v0}, Lkotlin/collections/h;->d(Ljava/lang/Object;)Ljava/util/List;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    :goto_0
    iget-object v1, p0, Lkg/b$b;->d:Lkg/b;

    .line 120
    .line 121
    invoke-static {v1}, Lkg/b;->L0(Lkg/b;)Lmg/l0;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    invoke-interface {v1}, Lmg/l0;->b()Lmg/h0;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    new-instance v2, Ljava/util/ArrayList;

    .line 130
    .line 131
    const/16 v3, 0xa

    .line 132
    .line 133
    invoke-static {v0, v3}, Lkotlin/collections/h;->t(Ljava/lang/Iterable;I)I

    .line 134
    .line 135
    .line 136
    move-result v4

    .line 137
    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 138
    .line 139
    .line 140
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 145
    .line 146
    .line 147
    move-result v4

    .line 148
    if-eqz v4, :cond_6

    .line 149
    .line 150
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v4

    .line 154
    check-cast v4, Llh/b;

    .line 155
    .line 156
    invoke-static {v1, v4}, Lmg/x;->a(Lmg/h0;Llh/b;)Lmg/e;

    .line 157
    .line 158
    .line 159
    move-result-object v5

    .line 160
    if-eqz v5, :cond_5

    .line 161
    .line 162
    invoke-virtual {p0}, Lkg/b$b;->getParameters()Ljava/util/List;

    .line 163
    .line 164
    .line 165
    move-result-object v4

    .line 166
    invoke-interface {v5}, Lmg/h;->k()Ldi/g1;

    .line 167
    .line 168
    .line 169
    move-result-object v6

    .line 170
    invoke-interface {v6}, Ldi/g1;->getParameters()Ljava/util/List;

    .line 171
    .line 172
    .line 173
    move-result-object v6

    .line 174
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 175
    .line 176
    .line 177
    move-result v6

    .line 178
    invoke-static {v4, v6}, Lkotlin/collections/h;->y0(Ljava/util/List;I)Ljava/util/List;

    .line 179
    .line 180
    .line 181
    move-result-object v4

    .line 182
    new-instance v6, Ljava/util/ArrayList;

    .line 183
    .line 184
    invoke-static {v4, v3}, Lkotlin/collections/h;->t(Ljava/lang/Iterable;I)I

    .line 185
    .line 186
    .line 187
    move-result v7

    .line 188
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 189
    .line 190
    .line 191
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 192
    .line 193
    .line 194
    move-result-object v4

    .line 195
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 196
    .line 197
    .line 198
    move-result v7

    .line 199
    if-eqz v7, :cond_4

    .line 200
    .line 201
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v7

    .line 205
    check-cast v7, Lmg/f1;

    .line 206
    .line 207
    new-instance v8, Ldi/m1;

    .line 208
    .line 209
    invoke-interface {v7}, Lmg/h;->s()Ldi/o0;

    .line 210
    .line 211
    .line 212
    move-result-object v7

    .line 213
    invoke-direct {v8, v7}, Ldi/m1;-><init>(Ldi/g0;)V

    .line 214
    .line 215
    .line 216
    invoke-interface {v6, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    goto :goto_2

    .line 220
    :cond_4
    sget-object v4, Ldi/c1;->l:Ldi/c1$a;

    .line 221
    .line 222
    invoke-virtual {v4}, Ldi/c1$a;->h()Ldi/c1;

    .line 223
    .line 224
    .line 225
    move-result-object v4

    .line 226
    invoke-static {v4, v5, v6}, Ldi/h0;->g(Ldi/c1;Lmg/e;Ljava/util/List;)Ldi/o0;

    .line 227
    .line 228
    .line 229
    move-result-object v4

    .line 230
    invoke-interface {v2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    goto :goto_1

    .line 234
    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 235
    .line 236
    new-instance v1, Ljava/lang/StringBuilder;

    .line 237
    .line 238
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 239
    .line 240
    .line 241
    const-string v2, "Built-in class "

    .line 242
    .line 243
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 244
    .line 245
    .line 246
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 247
    .line 248
    .line 249
    const-string v2, " not found"

    .line 250
    .line 251
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 252
    .line 253
    .line 254
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v1

    .line 258
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v1

    .line 262
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    throw v0

    .line 266
    :cond_6
    invoke-static {v2}, Lkotlin/collections/h;->D0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    return-object v0
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

.method protected l()Lmg/d1;
    .locals 1

    sget-object v0, Lmg/d1$a;->a:Lmg/d1$a;

    return-object v0
.end method

.method public bridge synthetic q()Lmg/h;
    .locals 1

    invoke-virtual {p0}, Lkg/b$b;->x()Lkg/b;

    move-result-object v0

    return-object v0
.end method

.method public r()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lkg/b$b;->x()Lkg/b;

    move-result-object v0

    invoke-virtual {v0}, Lkg/b;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic w()Lmg/e;
    .locals 1

    invoke-virtual {p0}, Lkg/b$b;->x()Lkg/b;

    move-result-object v0

    return-object v0
.end method

.method public x()Lkg/b;
    .locals 1

    iget-object v0, p0, Lkg/b$b;->d:Lkg/b;

    return-object v0
.end method
