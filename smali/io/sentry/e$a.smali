.class Lio/sentry/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements Lj$/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/sentry/e;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "TE;>;",
        "Lj$/util/Iterator;"
    }
.end annotation


# instance fields
.field private k:I

.field private l:I

.field private m:Z

.field final synthetic n:Lio/sentry/e;


# direct methods
.method constructor <init>(Lio/sentry/e;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lio/sentry/e$a;->n:Lio/sentry/e;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lio/sentry/e;->b(Lio/sentry/e;)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iput v0, p0, Lio/sentry/e$a;->k:I

    .line 11
    .line 12
    const/4 v0, -0x1

    .line 13
    iput v0, p0, Lio/sentry/e$a;->l:I

    .line 14
    .line 15
    invoke-static {p1}, Lio/sentry/e;->e(Lio/sentry/e;)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    iput-boolean p1, p0, Lio/sentry/e$a;->m:Z

    .line 20
    .line 21
    return-void
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method


# virtual methods
.method public synthetic forEachRemaining(Lj$/util/function/Consumer;)V
    .locals 0

    invoke-static {p0, p1}, Lj$/util/Iterator$-CC;->$default$forEachRemaining(Ljava/util/Iterator;Lj$/util/function/Consumer;)V

    return-void
.end method

.method public synthetic forEachRemaining(Ljava/util/function/Consumer;)V
    .locals 0

    invoke-static {p1}, Lj$/util/function/Consumer$VivifiedWrapper;->convert(Ljava/util/function/Consumer;)Lj$/util/function/Consumer;

    move-result-object p1

    invoke-virtual {p0, p1}, Lio/sentry/e$a;->forEachRemaining(Lj$/util/function/Consumer;)V

    return-void
.end method

.method public hasNext()Z
    .locals 2

    iget-boolean v0, p0, Lio/sentry/e$a;->m:Z

    if-nez v0, :cond_1

    iget v0, p0, Lio/sentry/e$a;->k:I

    iget-object v1, p0, Lio/sentry/e$a;->n:Lio/sentry/e;

    invoke-static {v1}, Lio/sentry/e;->h(Lio/sentry/e;)I

    move-result v1

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public next()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lio/sentry/e$a;->hasNext()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Lio/sentry/e$a;->m:Z

    .line 9
    .line 10
    iget v0, p0, Lio/sentry/e$a;->k:I

    .line 11
    .line 12
    iput v0, p0, Lio/sentry/e$a;->l:I

    .line 13
    .line 14
    iget-object v1, p0, Lio/sentry/e$a;->n:Lio/sentry/e;

    .line 15
    .line 16
    invoke-static {v1, v0}, Lio/sentry/e;->l(Lio/sentry/e;I)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    iput v0, p0, Lio/sentry/e$a;->k:I

    .line 21
    .line 22
    iget-object v0, p0, Lio/sentry/e$a;->n:Lio/sentry/e;

    .line 23
    .line 24
    invoke-static {v0}, Lio/sentry/e;->n(Lio/sentry/e;)[Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iget v1, p0, Lio/sentry/e$a;->l:I

    .line 29
    .line 30
    aget-object v0, v0, v1

    .line 31
    .line 32
    return-object v0

    .line 33
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 34
    .line 35
    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 36
    .line 37
    .line 38
    throw v0
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

.method public remove()V
    .locals 7

    .line 1
    iget v0, p0, Lio/sentry/e$a;->l:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-eq v0, v1, :cond_4

    .line 5
    .line 6
    iget-object v2, p0, Lio/sentry/e$a;->n:Lio/sentry/e;

    .line 7
    .line 8
    invoke-static {v2}, Lio/sentry/e;->b(Lio/sentry/e;)I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-ne v0, v2, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lio/sentry/e$a;->n:Lio/sentry/e;

    .line 15
    .line 16
    invoke-virtual {v0}, Lio/sentry/e;->remove()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    iput v1, p0, Lio/sentry/e$a;->l:I

    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    iget v0, p0, Lio/sentry/e$a;->l:I

    .line 23
    .line 24
    add-int/lit8 v0, v0, 0x1

    .line 25
    .line 26
    iget-object v2, p0, Lio/sentry/e$a;->n:Lio/sentry/e;

    .line 27
    .line 28
    invoke-static {v2}, Lio/sentry/e;->b(Lio/sentry/e;)I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    iget v3, p0, Lio/sentry/e$a;->l:I

    .line 33
    .line 34
    const/4 v4, 0x0

    .line 35
    if-ge v2, v3, :cond_1

    .line 36
    .line 37
    iget-object v2, p0, Lio/sentry/e$a;->n:Lio/sentry/e;

    .line 38
    .line 39
    invoke-static {v2}, Lio/sentry/e;->h(Lio/sentry/e;)I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-ge v0, v2, :cond_1

    .line 44
    .line 45
    iget-object v2, p0, Lio/sentry/e$a;->n:Lio/sentry/e;

    .line 46
    .line 47
    invoke-static {v2}, Lio/sentry/e;->n(Lio/sentry/e;)[Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    iget-object v3, p0, Lio/sentry/e$a;->n:Lio/sentry/e;

    .line 52
    .line 53
    invoke-static {v3}, Lio/sentry/e;->n(Lio/sentry/e;)[Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    iget v5, p0, Lio/sentry/e$a;->l:I

    .line 58
    .line 59
    iget-object v6, p0, Lio/sentry/e$a;->n:Lio/sentry/e;

    .line 60
    .line 61
    invoke-static {v6}, Lio/sentry/e;->h(Lio/sentry/e;)I

    .line 62
    .line 63
    .line 64
    move-result v6

    .line 65
    sub-int/2addr v6, v0

    .line 66
    invoke-static {v2, v0, v3, v5, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_1
    :goto_0
    iget-object v2, p0, Lio/sentry/e$a;->n:Lio/sentry/e;

    .line 71
    .line 72
    invoke-static {v2}, Lio/sentry/e;->h(Lio/sentry/e;)I

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    if-eq v0, v2, :cond_3

    .line 77
    .line 78
    iget-object v2, p0, Lio/sentry/e$a;->n:Lio/sentry/e;

    .line 79
    .line 80
    invoke-static {v2}, Lio/sentry/e;->q(Lio/sentry/e;)I

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    if-lt v0, v2, :cond_2

    .line 85
    .line 86
    iget-object v2, p0, Lio/sentry/e$a;->n:Lio/sentry/e;

    .line 87
    .line 88
    invoke-static {v2}, Lio/sentry/e;->n(Lio/sentry/e;)[Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    add-int/lit8 v0, v0, -0x1

    .line 93
    .line 94
    iget-object v3, p0, Lio/sentry/e$a;->n:Lio/sentry/e;

    .line 95
    .line 96
    invoke-static {v3}, Lio/sentry/e;->n(Lio/sentry/e;)[Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    aget-object v3, v3, v4

    .line 101
    .line 102
    aput-object v3, v2, v0

    .line 103
    .line 104
    move v0, v4

    .line 105
    goto :goto_0

    .line 106
    :cond_2
    iget-object v2, p0, Lio/sentry/e$a;->n:Lio/sentry/e;

    .line 107
    .line 108
    invoke-static {v2}, Lio/sentry/e;->n(Lio/sentry/e;)[Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    iget-object v3, p0, Lio/sentry/e$a;->n:Lio/sentry/e;

    .line 113
    .line 114
    invoke-static {v3, v0}, Lio/sentry/e;->r(Lio/sentry/e;I)I

    .line 115
    .line 116
    .line 117
    move-result v3

    .line 118
    iget-object v5, p0, Lio/sentry/e$a;->n:Lio/sentry/e;

    .line 119
    .line 120
    invoke-static {v5}, Lio/sentry/e;->n(Lio/sentry/e;)[Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v5

    .line 124
    aget-object v5, v5, v0

    .line 125
    .line 126
    aput-object v5, v2, v3

    .line 127
    .line 128
    iget-object v2, p0, Lio/sentry/e$a;->n:Lio/sentry/e;

    .line 129
    .line 130
    invoke-static {v2, v0}, Lio/sentry/e;->l(Lio/sentry/e;I)I

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    goto :goto_0

    .line 135
    :cond_3
    :goto_1
    iput v1, p0, Lio/sentry/e$a;->l:I

    .line 136
    .line 137
    iget-object v0, p0, Lio/sentry/e$a;->n:Lio/sentry/e;

    .line 138
    .line 139
    invoke-static {v0}, Lio/sentry/e;->h(Lio/sentry/e;)I

    .line 140
    .line 141
    .line 142
    move-result v1

    .line 143
    invoke-static {v0, v1}, Lio/sentry/e;->r(Lio/sentry/e;I)I

    .line 144
    .line 145
    .line 146
    move-result v1

    .line 147
    invoke-static {v0, v1}, Lio/sentry/e;->i(Lio/sentry/e;I)I

    .line 148
    .line 149
    .line 150
    iget-object v0, p0, Lio/sentry/e$a;->n:Lio/sentry/e;

    .line 151
    .line 152
    invoke-static {v0}, Lio/sentry/e;->n(Lio/sentry/e;)[Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    iget-object v1, p0, Lio/sentry/e$a;->n:Lio/sentry/e;

    .line 157
    .line 158
    invoke-static {v1}, Lio/sentry/e;->h(Lio/sentry/e;)I

    .line 159
    .line 160
    .line 161
    move-result v1

    .line 162
    const/4 v2, 0x0

    .line 163
    aput-object v2, v0, v1

    .line 164
    .line 165
    iget-object v0, p0, Lio/sentry/e$a;->n:Lio/sentry/e;

    .line 166
    .line 167
    invoke-static {v0, v4}, Lio/sentry/e;->f(Lio/sentry/e;Z)Z

    .line 168
    .line 169
    .line 170
    iget-object v0, p0, Lio/sentry/e$a;->n:Lio/sentry/e;

    .line 171
    .line 172
    iget v1, p0, Lio/sentry/e$a;->k:I

    .line 173
    .line 174
    invoke-static {v0, v1}, Lio/sentry/e;->r(Lio/sentry/e;I)I

    .line 175
    .line 176
    .line 177
    move-result v0

    .line 178
    iput v0, p0, Lio/sentry/e$a;->k:I

    .line 179
    .line 180
    return-void

    .line 181
    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 182
    .line 183
    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 184
    .line 185
    .line 186
    throw v0
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
