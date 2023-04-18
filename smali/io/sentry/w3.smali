.class public final Lio/sentry/w3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/m0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/sentry/w3$b;,
        Lio/sentry/w3$c;
    }
.end annotation


# instance fields
.field private final a:Lio/sentry/protocol/p;

.field private final b:Lio/sentry/b4;

.field private final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/sentry/b4;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lio/sentry/f0;

.field private e:Ljava/lang/String;

.field private final f:Z

.field private g:Lio/sentry/w3$b;

.field private final h:Lio/sentry/o4;

.field private final i:Z

.field private final j:Ljava/lang/Long;

.field private volatile k:Ljava/util/TimerTask;

.field private volatile l:Ljava/util/Timer;

.field private final m:Ljava/lang/Object;

.field private final n:Lio/sentry/w3$c;

.field private final o:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final p:Lio/sentry/c;

.field private q:Lio/sentry/protocol/y;

.field private final r:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/sentry/protocol/g;",
            ">;"
        }
    .end annotation
.end field

.field private final s:Lio/sentry/p0;

.field private final t:Lio/sentry/protocol/c;


# direct methods
.method constructor <init>(Lio/sentry/n4;Lio/sentry/f0;Ljava/util/Date;ZLjava/lang/Long;ZLio/sentry/o4;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lio/sentry/protocol/p;

    .line 5
    .line 6
    invoke-direct {v0}, Lio/sentry/protocol/p;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lio/sentry/w3;->a:Lio/sentry/protocol/p;

    .line 10
    .line 11
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lio/sentry/w3;->c:Ljava/util/List;

    .line 17
    .line 18
    sget-object v0, Lio/sentry/w3$b;->c:Lio/sentry/w3$b;

    .line 19
    .line 20
    iput-object v0, p0, Lio/sentry/w3;->g:Lio/sentry/w3$b;

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    iput-object v0, p0, Lio/sentry/w3;->l:Ljava/util/Timer;

    .line 24
    .line 25
    new-instance v1, Ljava/lang/Object;

    .line 26
    .line 27
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v1, p0, Lio/sentry/w3;->m:Ljava/lang/Object;

    .line 31
    .line 32
    new-instance v1, Lio/sentry/w3$c;

    .line 33
    .line 34
    invoke-direct {v1, v0}, Lio/sentry/w3$c;-><init>(Lio/sentry/w3$a;)V

    .line 35
    .line 36
    .line 37
    iput-object v1, p0, Lio/sentry/w3;->n:Lio/sentry/w3$c;

    .line 38
    .line 39
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 40
    .line 41
    const/4 v1, 0x0

    .line 42
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 43
    .line 44
    .line 45
    iput-object v0, p0, Lio/sentry/w3;->o:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 46
    .line 47
    new-instance v0, Lio/sentry/protocol/c;

    .line 48
    .line 49
    invoke-direct {v0}, Lio/sentry/protocol/c;-><init>()V

    .line 50
    .line 51
    .line 52
    iput-object v0, p0, Lio/sentry/w3;->t:Lio/sentry/protocol/c;

    .line 53
    .line 54
    const-string v0, "context is required"

    .line 55
    .line 56
    invoke-static {p1, v0}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    const-string v0, "hub is required"

    .line 60
    .line 61
    invoke-static {p2, v0}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    new-instance v0, Lj$/util/concurrent/ConcurrentHashMap;

    .line 65
    .line 66
    invoke-direct {v0}, Lj$/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 67
    .line 68
    .line 69
    iput-object v0, p0, Lio/sentry/w3;->r:Ljava/util/Map;

    .line 70
    .line 71
    new-instance v0, Lio/sentry/b4;

    .line 72
    .line 73
    invoke-direct {v0, p1, p0, p2, p3}, Lio/sentry/b4;-><init>(Lio/sentry/n4;Lio/sentry/w3;Lio/sentry/f0;Ljava/util/Date;)V

    .line 74
    .line 75
    .line 76
    iput-object v0, p0, Lio/sentry/w3;->b:Lio/sentry/b4;

    .line 77
    .line 78
    invoke-virtual {p1}, Lio/sentry/n4;->q()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p3

    .line 82
    iput-object p3, p0, Lio/sentry/w3;->e:Ljava/lang/String;

    .line 83
    .line 84
    invoke-virtual {p1}, Lio/sentry/n4;->p()Lio/sentry/p0;

    .line 85
    .line 86
    .line 87
    move-result-object p3

    .line 88
    iput-object p3, p0, Lio/sentry/w3;->s:Lio/sentry/p0;

    .line 89
    .line 90
    iput-object p2, p0, Lio/sentry/w3;->d:Lio/sentry/f0;

    .line 91
    .line 92
    iput-boolean p4, p0, Lio/sentry/w3;->f:Z

    .line 93
    .line 94
    iput-object p5, p0, Lio/sentry/w3;->j:Ljava/lang/Long;

    .line 95
    .line 96
    iput-boolean p6, p0, Lio/sentry/w3;->i:Z

    .line 97
    .line 98
    iput-object p7, p0, Lio/sentry/w3;->h:Lio/sentry/o4;

    .line 99
    .line 100
    invoke-virtual {p1}, Lio/sentry/n4;->s()Lio/sentry/protocol/y;

    .line 101
    .line 102
    .line 103
    move-result-object p3

    .line 104
    iput-object p3, p0, Lio/sentry/w3;->q:Lio/sentry/protocol/y;

    .line 105
    .line 106
    invoke-virtual {p1}, Lio/sentry/n4;->o()Lio/sentry/c;

    .line 107
    .line 108
    .line 109
    move-result-object p3

    .line 110
    if-eqz p3, :cond_0

    .line 111
    .line 112
    invoke-virtual {p1}, Lio/sentry/n4;->o()Lio/sentry/c;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    iput-object p1, p0, Lio/sentry/w3;->p:Lio/sentry/c;

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_0
    new-instance p1, Lio/sentry/c;

    .line 120
    .line 121
    invoke-interface {p2}, Lio/sentry/f0;->o()Lio/sentry/o3;

    .line 122
    .line 123
    .line 124
    move-result-object p2

    .line 125
    invoke-virtual {p2}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 126
    .line 127
    .line 128
    move-result-object p2

    .line 129
    invoke-direct {p1, p2}, Lio/sentry/c;-><init>(Lio/sentry/g0;)V

    .line 130
    .line 131
    .line 132
    iput-object p1, p0, Lio/sentry/w3;->p:Lio/sentry/c;

    .line 133
    .line 134
    :goto_0
    if-eqz p5, :cond_1

    .line 135
    .line 136
    new-instance p1, Ljava/util/Timer;

    .line 137
    .line 138
    const/4 p2, 0x1

    .line 139
    invoke-direct {p1, p2}, Ljava/util/Timer;-><init>(Z)V

    .line 140
    .line 141
    .line 142
    iput-object p1, p0, Lio/sentry/w3;->l:Ljava/util/Timer;

    .line 143
    .line 144
    invoke-virtual {p0}, Lio/sentry/w3;->k()V

    .line 145
    .line 146
    .line 147
    :cond_1
    return-void
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
.end method

.method private D()Z
    .locals 2

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    iget-object v1, p0, Lio/sentry/w3;->c:Ljava/util/List;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-nez v1, :cond_1

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Lio/sentry/b4;

    .line 29
    .line 30
    invoke-virtual {v1}, Lio/sentry/b4;->a()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-nez v1, :cond_0

    .line 35
    .line 36
    const/4 v0, 0x0

    .line 37
    return v0

    .line 38
    :cond_1
    const/4 v0, 0x1

    .line 39
    return v0
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

.method private synthetic G(Lio/sentry/b4;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lio/sentry/w3;->g:Lio/sentry/w3$b;

    .line 2
    .line 3
    iget-object v0, p0, Lio/sentry/w3;->j:Ljava/lang/Long;

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget-boolean p1, p0, Lio/sentry/w3;->f:Z

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-direct {p0}, Lio/sentry/w3;->D()Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_2

    .line 16
    .line 17
    :cond_0
    invoke-virtual {p0}, Lio/sentry/w3;->k()V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    invoke-static {p1}, Lio/sentry/w3$b;->b(Lio/sentry/w3$b;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    invoke-static {p1}, Lio/sentry/w3$b;->a(Lio/sentry/w3$b;)Lio/sentry/f4;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p0, p1}, Lio/sentry/w3;->d(Lio/sentry/f4;)V

    .line 32
    .line 33
    .line 34
    :cond_2
    :goto_0
    return-void
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
.end method

.method private synthetic H(Lio/sentry/Scope;Lio/sentry/m0;)V
    .locals 0

    if-ne p2, p0, :cond_0

    invoke-virtual {p1}, Lio/sentry/Scope;->d()V

    :cond_0
    return-void
.end method

.method private synthetic I(Lio/sentry/Scope;)V
    .locals 1

    new-instance v0, Lio/sentry/v3;

    invoke-direct {v0, p0, p1}, Lio/sentry/v3;-><init>(Lio/sentry/w3;Lio/sentry/Scope;)V

    invoke-virtual {p1, v0}, Lio/sentry/Scope;->B(Lio/sentry/Scope$b;)V

    return-void
.end method

.method private static synthetic J(Ljava/util/concurrent/atomic/AtomicReference;Lio/sentry/Scope;)V
    .locals 0

    invoke-virtual {p1}, Lio/sentry/Scope;->s()Lio/sentry/protocol/z;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    return-void
.end method

.method private N()V
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lio/sentry/w3;->p:Lio/sentry/c;

    .line 3
    .line 4
    invoke-virtual {v0}, Lio/sentry/c;->m()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, Lio/sentry/w3;->d:Lio/sentry/f0;

    .line 16
    .line 17
    new-instance v2, Lio/sentry/u3;

    .line 18
    .line 19
    invoke-direct {v2, v0}, Lio/sentry/u3;-><init>(Ljava/util/concurrent/atomic/AtomicReference;)V

    .line 20
    .line 21
    .line 22
    invoke-interface {v1, v2}, Lio/sentry/f0;->k(Lio/sentry/b2;)V

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Lio/sentry/w3;->p:Lio/sentry/c;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Lio/sentry/protocol/z;

    .line 32
    .line 33
    iget-object v2, p0, Lio/sentry/w3;->d:Lio/sentry/f0;

    .line 34
    .line 35
    invoke-interface {v2}, Lio/sentry/f0;->o()Lio/sentry/o3;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {p0}, Lio/sentry/w3;->B()Lio/sentry/m4;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-virtual {v1, p0, v0, v2, v3}, Lio/sentry/c;->x(Lio/sentry/m0;Lio/sentry/protocol/z;Lio/sentry/o3;Lio/sentry/m4;)V

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Lio/sentry/w3;->p:Lio/sentry/c;

    .line 47
    .line 48
    invoke-virtual {v0}, Lio/sentry/c;->a()V

    .line 49
    .line 50
    .line 51
    :cond_0
    monitor-exit p0

    .line 52
    return-void

    .line 53
    :catchall_0
    move-exception v0

    .line 54
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    throw v0
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

.method public static synthetic n(Lio/sentry/w3;Lio/sentry/Scope;Lio/sentry/m0;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/sentry/w3;->H(Lio/sentry/Scope;Lio/sentry/m0;)V

    return-void
.end method

.method public static synthetic o(Ljava/util/concurrent/atomic/AtomicReference;Lio/sentry/Scope;)V
    .locals 0

    invoke-static {p0, p1}, Lio/sentry/w3;->J(Ljava/util/concurrent/atomic/AtomicReference;Lio/sentry/Scope;)V

    return-void
.end method

.method public static synthetic p(Lio/sentry/w3;Lio/sentry/Scope;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/sentry/w3;->I(Lio/sentry/Scope;)V

    return-void
.end method

.method public static synthetic q(Lio/sentry/w3;Lio/sentry/b4;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/sentry/w3;->G(Lio/sentry/b4;)V

    return-void
.end method

.method static synthetic r(Lio/sentry/w3;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 0

    iget-object p0, p0, Lio/sentry/w3;->o:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object p0
.end method

.method private s()V
    .locals 3

    .line 1
    iget-object v0, p0, Lio/sentry/w3;->m:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lio/sentry/w3;->k:Ljava/util/TimerTask;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    iget-object v1, p0, Lio/sentry/w3;->k:Ljava/util/TimerTask;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/util/TimerTask;->cancel()Z

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lio/sentry/w3;->o:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 17
    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    iput-object v1, p0, Lio/sentry/w3;->k:Ljava/util/TimerTask;

    .line 21
    .line 22
    :cond_0
    monitor-exit v0

    .line 23
    return-void

    .line 24
    :catchall_0
    move-exception v1

    .line 25
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    throw v1
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
.end method

.method private t(Lio/sentry/e4;Ljava/lang/String;)Lio/sentry/ISpan;
    .locals 6

    const/4 v3, 0x0

    const/4 v4, 0x0

    sget-object v5, Lio/sentry/p0;->SENTRY:Lio/sentry/p0;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v5}, Lio/sentry/w3;->u(Lio/sentry/e4;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Lio/sentry/p0;)Lio/sentry/ISpan;

    move-result-object p1

    return-object p1
.end method

.method private u(Lio/sentry/e4;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Lio/sentry/p0;)Lio/sentry/ISpan;
    .locals 8

    .line 1
    iget-object v0, p0, Lio/sentry/w3;->b:Lio/sentry/b4;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/b4;->a()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {}, Lio/sentry/n1;->n()Lio/sentry/n1;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_0
    iget-object v0, p0, Lio/sentry/w3;->s:Lio/sentry/p0;

    .line 15
    .line 16
    invoke-virtual {v0, p5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p5

    .line 20
    if-nez p5, :cond_1

    .line 21
    .line 22
    invoke-static {}, Lio/sentry/n1;->n()Lio/sentry/n1;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1

    .line 27
    :cond_1
    const-string p5, "parentSpanId is required"

    .line 28
    .line 29
    invoke-static {p1, p5}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    const-string p5, "operation is required"

    .line 33
    .line 34
    invoke-static {p2, p5}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    invoke-direct {p0}, Lio/sentry/w3;->s()V

    .line 38
    .line 39
    .line 40
    new-instance p5, Lio/sentry/b4;

    .line 41
    .line 42
    iget-object v0, p0, Lio/sentry/w3;->b:Lio/sentry/b4;

    .line 43
    .line 44
    invoke-virtual {v0}, Lio/sentry/b4;->B()Lio/sentry/protocol/p;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    iget-object v5, p0, Lio/sentry/w3;->d:Lio/sentry/f0;

    .line 49
    .line 50
    new-instance v7, Lio/sentry/t3;

    .line 51
    .line 52
    invoke-direct {v7, p0}, Lio/sentry/t3;-><init>(Lio/sentry/w3;)V

    .line 53
    .line 54
    .line 55
    move-object v0, p5

    .line 56
    move-object v2, p1

    .line 57
    move-object v3, p0

    .line 58
    move-object v4, p2

    .line 59
    move-object v6, p4

    .line 60
    invoke-direct/range {v0 .. v7}, Lio/sentry/b4;-><init>(Lio/sentry/protocol/p;Lio/sentry/e4;Lio/sentry/w3;Ljava/lang/String;Lio/sentry/f0;Ljava/util/Date;Lio/sentry/d4;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p5, p3}, Lio/sentry/b4;->h(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    iget-object p1, p0, Lio/sentry/w3;->c:Ljava/util/List;

    .line 67
    .line 68
    invoke-interface {p1, p5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    return-object p5
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

.method private v(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Lio/sentry/p0;)Lio/sentry/ISpan;
    .locals 2

    .line 1
    iget-object v0, p0, Lio/sentry/w3;->b:Lio/sentry/b4;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/b4;->a()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {}, Lio/sentry/n1;->n()Lio/sentry/n1;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_0
    iget-object v0, p0, Lio/sentry/w3;->s:Lio/sentry/p0;

    .line 15
    .line 16
    invoke-virtual {v0, p4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    invoke-static {}, Lio/sentry/n1;->n()Lio/sentry/n1;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1

    .line 27
    :cond_1
    iget-object v0, p0, Lio/sentry/w3;->c:Ljava/util/List;

    .line 28
    .line 29
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    iget-object v1, p0, Lio/sentry/w3;->d:Lio/sentry/f0;

    .line 34
    .line 35
    invoke-interface {v1}, Lio/sentry/f0;->o()Lio/sentry/o3;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v1}, Lio/sentry/o3;->getMaxSpans()I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-ge v0, v1, :cond_2

    .line 44
    .line 45
    iget-object v0, p0, Lio/sentry/w3;->b:Lio/sentry/b4;

    .line 46
    .line 47
    invoke-virtual {v0, p1, p2, p3, p4}, Lio/sentry/b4;->e(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Lio/sentry/p0;)Lio/sentry/ISpan;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    return-object p1

    .line 52
    :cond_2
    iget-object p3, p0, Lio/sentry/w3;->d:Lio/sentry/f0;

    .line 53
    .line 54
    invoke-interface {p3}, Lio/sentry/f0;->o()Lio/sentry/o3;

    .line 55
    .line 56
    .line 57
    move-result-object p3

    .line 58
    invoke-virtual {p3}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 59
    .line 60
    .line 61
    move-result-object p3

    .line 62
    sget-object p4, Lio/sentry/n3;->WARNING:Lio/sentry/n3;

    .line 63
    .line 64
    const/4 v0, 0x2

    .line 65
    new-array v0, v0, [Ljava/lang/Object;

    .line 66
    .line 67
    const/4 v1, 0x0

    .line 68
    aput-object p1, v0, v1

    .line 69
    .line 70
    const/4 p1, 0x1

    .line 71
    aput-object p2, v0, p1

    .line 72
    .line 73
    const-string p1, "Span operation: %s, description: %s dropped due to limit reached. Returning NoOpSpan."

    .line 74
    .line 75
    invoke-interface {p3, p4, p1, v0}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    invoke-static {}, Lio/sentry/n1;->n()Lio/sentry/n1;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    return-object p1
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


# virtual methods
.method public A()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lio/sentry/w3;->b:Lio/sentry/b4;

    invoke-virtual {v0}, Lio/sentry/b4;->s()Ljava/lang/Double;

    move-result-object v0

    return-object v0
.end method

.method public B()Lio/sentry/m4;
    .locals 1

    iget-object v0, p0, Lio/sentry/w3;->b:Lio/sentry/b4;

    invoke-virtual {v0}, Lio/sentry/b4;->w()Lio/sentry/m4;

    move-result-object v0

    return-object v0
.end method

.method public C()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/sentry/w3;->b:Lio/sentry/b4;

    invoke-virtual {v0}, Lio/sentry/b4;->y()Ljava/util/Date;

    move-result-object v0

    return-object v0
.end method

.method public E()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/sentry/w3;->b:Lio/sentry/b4;

    invoke-virtual {v0}, Lio/sentry/b4;->C()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public F()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/sentry/w3;->b:Lio/sentry/b4;

    invoke-virtual {v0}, Lio/sentry/b4;->D()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method K(Lio/sentry/e4;Ljava/lang/String;Ljava/lang/String;)Lio/sentry/ISpan;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lio/sentry/w3;->t(Lio/sentry/e4;Ljava/lang/String;)Lio/sentry/ISpan;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p1, p3}, Lio/sentry/ISpan;->h(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-object p1
    .line 9
    .line 10
    .line 11
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

.method L(Lio/sentry/e4;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Lio/sentry/p0;)Lio/sentry/ISpan;
    .locals 0

    invoke-direct/range {p0 .. p5}, Lio/sentry/w3;->u(Lio/sentry/e4;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Lio/sentry/p0;)Lio/sentry/ISpan;

    move-result-object p1

    return-object p1
.end method

.method public M(Ljava/lang/String;Ljava/lang/String;)Lio/sentry/ISpan;
    .locals 2

    const/4 v0, 0x0

    sget-object v1, Lio/sentry/p0;->SENTRY:Lio/sentry/p0;

    invoke-direct {p0, p1, p2, v0, v1}, Lio/sentry/w3;->v(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Lio/sentry/p0;)Lio/sentry/ISpan;

    move-result-object p1

    return-object p1
.end method

.method public a()Z
    .locals 1

    iget-object v0, p0, Lio/sentry/w3;->b:Lio/sentry/b4;

    invoke-virtual {v0}, Lio/sentry/b4;->a()Z

    move-result v0

    return v0
.end method

.method public b()Lio/sentry/f4;
    .locals 1

    iget-object v0, p0, Lio/sentry/w3;->b:Lio/sentry/b4;

    invoke-virtual {v0}, Lio/sentry/b4;->b()Lio/sentry/f4;

    move-result-object v0

    return-object v0
.end method

.method public c()Lio/sentry/k4;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/w3;->d:Lio/sentry/f0;

    .line 2
    .line 3
    invoke-interface {v0}, Lio/sentry/f0;->o()Lio/sentry/o3;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lio/sentry/o3;->isTraceSampling()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-direct {p0}, Lio/sentry/w3;->N()V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lio/sentry/w3;->p:Lio/sentry/c;

    .line 17
    .line 18
    invoke-virtual {v0}, Lio/sentry/c;->y()Lio/sentry/k4;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    return-object v0

    .line 23
    :cond_0
    const/4 v0, 0x0

    .line 24
    return-object v0
.end method

.method public d(Lio/sentry/f4;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lio/sentry/w3;->w(Lio/sentry/f4;Ljava/util/Date;)V

    return-void
.end method

.method public e(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Lio/sentry/p0;)Lio/sentry/ISpan;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lio/sentry/w3;->v(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Lio/sentry/p0;)Lio/sentry/ISpan;

    move-result-object p1

    return-object p1
.end method

.method public f()V
    .locals 1

    invoke-virtual {p0}, Lio/sentry/w3;->b()Lio/sentry/f4;

    move-result-object v0

    invoke-virtual {p0, v0}, Lio/sentry/w3;->d(Lio/sentry/f4;)V

    return-void
.end method

.method public g()Lio/sentry/b4;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    iget-object v1, p0, Lio/sentry/w3;->c:Ljava/util/List;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-nez v1, :cond_1

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    add-int/lit8 v1, v1, -0x1

    .line 19
    .line 20
    :goto_0
    if-ltz v1, :cond_1

    .line 21
    .line 22
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Lio/sentry/b4;

    .line 27
    .line 28
    invoke-virtual {v2}, Lio/sentry/b4;->a()Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-nez v2, :cond_0

    .line 33
    .line 34
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    check-cast v0, Lio/sentry/b4;

    .line 39
    .line 40
    return-object v0

    .line 41
    :cond_0
    add-int/lit8 v1, v1, -0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    const/4 v0, 0x0

    .line 45
    return-object v0
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

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/sentry/w3;->e:Ljava/lang/String;

    return-object v0
.end method

.method public h(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/w3;->b:Lio/sentry/b4;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/b4;->a()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object v0, p0, Lio/sentry/w3;->b:Lio/sentry/b4;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Lio/sentry/b4;->h(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-void
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

.method public i()Lio/sentry/protocol/p;
    .locals 1

    iget-object v0, p0, Lio/sentry/w3;->a:Lio/sentry/protocol/p;

    return-object v0
.end method

.method public j(Ljava/lang/String;)Lio/sentry/ISpan;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lio/sentry/w3;->M(Ljava/lang/String;Ljava/lang/String;)Lio/sentry/ISpan;

    move-result-object p1

    return-object p1
.end method

.method public k()V
    .locals 5

    .line 1
    iget-object v0, p0, Lio/sentry/w3;->m:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-direct {p0}, Lio/sentry/w3;->s()V

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, Lio/sentry/w3;->l:Ljava/util/Timer;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Lio/sentry/w3;->o:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 15
    .line 16
    .line 17
    new-instance v1, Lio/sentry/w3$a;

    .line 18
    .line 19
    invoke-direct {v1, p0}, Lio/sentry/w3$a;-><init>(Lio/sentry/w3;)V

    .line 20
    .line 21
    .line 22
    iput-object v1, p0, Lio/sentry/w3;->k:Ljava/util/TimerTask;

    .line 23
    .line 24
    iget-object v1, p0, Lio/sentry/w3;->l:Ljava/util/Timer;

    .line 25
    .line 26
    iget-object v2, p0, Lio/sentry/w3;->k:Ljava/util/TimerTask;

    .line 27
    .line 28
    iget-object v3, p0, Lio/sentry/w3;->j:Ljava/lang/Long;

    .line 29
    .line 30
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 31
    .line 32
    .line 33
    move-result-wide v3

    .line 34
    invoke-virtual {v1, v2, v3, v4}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    .line 35
    .line 36
    .line 37
    :cond_0
    monitor-exit v0

    .line 38
    return-void

    .line 39
    :catchall_0
    move-exception v1

    .line 40
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    throw v1
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

.method public l()Lio/sentry/c4;
    .locals 1

    iget-object v0, p0, Lio/sentry/w3;->b:Lio/sentry/b4;

    invoke-virtual {v0}, Lio/sentry/b4;->l()Lio/sentry/c4;

    move-result-object v0

    return-object v0
.end method

.method public m()Lio/sentry/protocol/y;
    .locals 1

    iget-object v0, p0, Lio/sentry/w3;->q:Lio/sentry/protocol/y;

    return-object v0
.end method

.method public w(Lio/sentry/f4;Ljava/util/Date;)V
    .locals 7

    .line 1
    invoke-static {p1}, Lio/sentry/w3$b;->c(Lio/sentry/f4;)Lio/sentry/w3$b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lio/sentry/w3;->g:Lio/sentry/w3$b;

    .line 6
    .line 7
    iget-object p1, p0, Lio/sentry/w3;->b:Lio/sentry/b4;

    .line 8
    .line 9
    invoke-virtual {p1}, Lio/sentry/b4;->a()Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-nez p1, :cond_b

    .line 14
    .line 15
    iget-boolean p1, p0, Lio/sentry/w3;->f:Z

    .line 16
    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    invoke-direct {p0}, Lio/sentry/w3;->D()Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-eqz p1, :cond_b

    .line 24
    .line 25
    :cond_0
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 26
    .line 27
    invoke-virtual {p0}, Lio/sentry/w3;->F()Ljava/lang/Boolean;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {p1, v0}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    invoke-virtual {p0}, Lio/sentry/w3;->E()Ljava/lang/Boolean;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {p1, v0}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    if-eqz p1, :cond_1

    .line 46
    .line 47
    iget-object p1, p0, Lio/sentry/w3;->d:Lio/sentry/f0;

    .line 48
    .line 49
    invoke-interface {p1}, Lio/sentry/f0;->o()Lio/sentry/o3;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-virtual {p1}, Lio/sentry/o3;->getTransactionProfiler()Lio/sentry/n0;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-interface {p1, p0}, Lio/sentry/n0;->b(Lio/sentry/m0;)V

    .line 58
    .line 59
    .line 60
    :cond_1
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 61
    .line 62
    .line 63
    move-result-wide v0

    .line 64
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    iget-object v0, p0, Lio/sentry/w3;->b:Lio/sentry/b4;

    .line 69
    .line 70
    invoke-virtual {v0, p1}, Lio/sentry/b4;->t(Ljava/lang/Long;)Ljava/lang/Double;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    const/4 v1, 0x0

    .line 75
    if-eqz p2, :cond_2

    .line 76
    .line 77
    invoke-static {p2}, Lio/sentry/h;->a(Ljava/util/Date;)D

    .line 78
    .line 79
    .line 80
    move-result-wide p1

    .line 81
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    move-object p1, v1

    .line 86
    :cond_2
    if-nez v0, :cond_3

    .line 87
    .line 88
    invoke-static {}, Lio/sentry/h;->b()Ljava/util/Date;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-static {p1}, Lio/sentry/h;->a(Ljava/util/Date;)D

    .line 93
    .line 94
    .line 95
    move-result-wide p1

    .line 96
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    move-object p1, v1

    .line 101
    :cond_3
    iget-object p2, p0, Lio/sentry/w3;->c:Ljava/util/List;

    .line 102
    .line 103
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 104
    .line 105
    .line 106
    move-result-object p2

    .line 107
    :cond_4
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 108
    .line 109
    .line 110
    move-result v2

    .line 111
    if-eqz v2, :cond_5

    .line 112
    .line 113
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    check-cast v2, Lio/sentry/b4;

    .line 118
    .line 119
    invoke-virtual {v2}, Lio/sentry/b4;->a()Z

    .line 120
    .line 121
    .line 122
    move-result v3

    .line 123
    if-nez v3, :cond_4

    .line 124
    .line 125
    invoke-virtual {v2, v1}, Lio/sentry/b4;->E(Lio/sentry/d4;)V

    .line 126
    .line 127
    .line 128
    sget-object v3, Lio/sentry/f4;->DEADLINE_EXCEEDED:Lio/sentry/f4;

    .line 129
    .line 130
    invoke-virtual {v2, v3, v0, p1}, Lio/sentry/b4;->n(Lio/sentry/f4;Ljava/lang/Double;Ljava/lang/Long;)V

    .line 131
    .line 132
    .line 133
    goto :goto_0

    .line 134
    :cond_5
    iget-object p2, p0, Lio/sentry/w3;->c:Ljava/util/List;

    .line 135
    .line 136
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 137
    .line 138
    .line 139
    move-result p2

    .line 140
    if-nez p2, :cond_6

    .line 141
    .line 142
    iget-boolean p2, p0, Lio/sentry/w3;->i:Z

    .line 143
    .line 144
    if-eqz p2, :cond_6

    .line 145
    .line 146
    iget-object p2, p0, Lio/sentry/w3;->c:Ljava/util/List;

    .line 147
    .line 148
    iget-object v2, p0, Lio/sentry/w3;->n:Lio/sentry/w3$c;

    .line 149
    .line 150
    invoke-static {p2, v2}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object p2

    .line 154
    check-cast p2, Lio/sentry/b4;

    .line 155
    .line 156
    invoke-virtual {p2}, Lio/sentry/b4;->A()Ljava/lang/Double;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    if-eqz v2, :cond_6

    .line 161
    .line 162
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 163
    .line 164
    .line 165
    move-result-wide v3

    .line 166
    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    .line 167
    .line 168
    .line 169
    move-result-wide v5

    .line 170
    cmpl-double v3, v3, v5

    .line 171
    .line 172
    if-lez v3, :cond_6

    .line 173
    .line 174
    invoke-virtual {p2}, Lio/sentry/b4;->r()Ljava/lang/Long;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    move-object v0, v2

    .line 179
    :cond_6
    iget-object p2, p0, Lio/sentry/w3;->b:Lio/sentry/b4;

    .line 180
    .line 181
    iget-object v2, p0, Lio/sentry/w3;->g:Lio/sentry/w3$b;

    .line 182
    .line 183
    invoke-static {v2}, Lio/sentry/w3$b;->a(Lio/sentry/w3$b;)Lio/sentry/f4;

    .line 184
    .line 185
    .line 186
    move-result-object v2

    .line 187
    invoke-virtual {p2, v2, v0, p1}, Lio/sentry/b4;->n(Lio/sentry/f4;Ljava/lang/Double;Ljava/lang/Long;)V

    .line 188
    .line 189
    .line 190
    iget-object p1, p0, Lio/sentry/w3;->d:Lio/sentry/f0;

    .line 191
    .line 192
    new-instance p2, Lio/sentry/s3;

    .line 193
    .line 194
    invoke-direct {p2, p0}, Lio/sentry/s3;-><init>(Lio/sentry/w3;)V

    .line 195
    .line 196
    .line 197
    invoke-interface {p1, p2}, Lio/sentry/f0;->k(Lio/sentry/b2;)V

    .line 198
    .line 199
    .line 200
    new-instance p1, Lio/sentry/protocol/w;

    .line 201
    .line 202
    invoke-direct {p1, p0}, Lio/sentry/protocol/w;-><init>(Lio/sentry/w3;)V

    .line 203
    .line 204
    .line 205
    iget-object p2, p0, Lio/sentry/w3;->h:Lio/sentry/o4;

    .line 206
    .line 207
    if-eqz p2, :cond_7

    .line 208
    .line 209
    invoke-interface {p2, p0}, Lio/sentry/o4;->a(Lio/sentry/m0;)V

    .line 210
    .line 211
    .line 212
    :cond_7
    iget-object p2, p0, Lio/sentry/w3;->l:Ljava/util/Timer;

    .line 213
    .line 214
    if-eqz p2, :cond_9

    .line 215
    .line 216
    iget-object p2, p0, Lio/sentry/w3;->m:Ljava/lang/Object;

    .line 217
    .line 218
    monitor-enter p2

    .line 219
    :try_start_0
    iget-object v0, p0, Lio/sentry/w3;->l:Ljava/util/Timer;

    .line 220
    .line 221
    if-eqz v0, :cond_8

    .line 222
    .line 223
    iget-object v0, p0, Lio/sentry/w3;->l:Ljava/util/Timer;

    .line 224
    .line 225
    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    .line 226
    .line 227
    .line 228
    iput-object v1, p0, Lio/sentry/w3;->l:Ljava/util/Timer;

    .line 229
    .line 230
    :cond_8
    monitor-exit p2

    .line 231
    goto :goto_1

    .line 232
    :catchall_0
    move-exception p1

    .line 233
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 234
    throw p1

    .line 235
    :cond_9
    :goto_1
    iget-object p2, p0, Lio/sentry/w3;->c:Ljava/util/List;

    .line 236
    .line 237
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 238
    .line 239
    .line 240
    move-result p2

    .line 241
    if-eqz p2, :cond_a

    .line 242
    .line 243
    iget-object p2, p0, Lio/sentry/w3;->j:Ljava/lang/Long;

    .line 244
    .line 245
    if-eqz p2, :cond_a

    .line 246
    .line 247
    return-void

    .line 248
    :cond_a
    invoke-virtual {p1}, Lio/sentry/protocol/w;->j0()Ljava/util/Map;

    .line 249
    .line 250
    .line 251
    move-result-object p2

    .line 252
    iget-object v0, p0, Lio/sentry/w3;->r:Ljava/util/Map;

    .line 253
    .line 254
    invoke-interface {p2, v0}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 255
    .line 256
    .line 257
    iget-object p2, p0, Lio/sentry/w3;->d:Lio/sentry/f0;

    .line 258
    .line 259
    invoke-virtual {p0}, Lio/sentry/w3;->c()Lio/sentry/k4;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    invoke-interface {p2, p1, v0, v1}, Lio/sentry/f0;->i(Lio/sentry/protocol/w;Lio/sentry/k4;Lio/sentry/v;)Lio/sentry/protocol/p;

    .line 264
    .line 265
    .line 266
    :cond_b
    return-void
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
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
.end method

.method public x()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/sentry/b4;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/sentry/w3;->c:Ljava/util/List;

    return-object v0
.end method

.method public y()Lio/sentry/protocol/c;
    .locals 1

    iget-object v0, p0, Lio/sentry/w3;->t:Lio/sentry/protocol/c;

    return-object v0
.end method

.method public z()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/sentry/w3;->b:Lio/sentry/b4;

    invoke-virtual {v0}, Lio/sentry/b4;->o()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
