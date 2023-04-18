.class public final Lnet/time4j/j0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final k:Lgj/i;

.field private static final l:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap<",
            "Ljava/util/Locale;",
            "Lnet/time4j/j0;",
            ">;"
        }
    .end annotation
.end field

.field private static final m:[Lnet/time4j/w;

.field private static final n:[Lnet/time4j/w;

.field private static final o:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lnet/time4j/w;",
            ">;"
        }
    .end annotation
.end field

.field private static final p:J


# instance fields
.field private final a:Lgj/p;

.field private final b:Ljava/util/Locale;

.field private final c:Lnet/time4j/base/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnet/time4j/base/e<",
            "*>;"
        }
    .end annotation
.end field

.field private final d:C

.field private final e:Ljava/lang/String;

.field private final f:Lnet/time4j/w;

.field private final g:Z

.field private final h:Z

.field private final i:Ljava/lang/String;

.field private final j:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 14

    .line 1
    invoke-static {}, Lnet/time4j/base/d;->c()Lnet/time4j/base/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Lgj/i;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lnet/time4j/base/d;->g(Ljava/lang/Class;)Ljava/lang/Iterable;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const/4 v1, 0x0

    .line 16
    const/4 v2, 0x0

    .line 17
    move v3, v1

    .line 18
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    if-eqz v4, :cond_1

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    check-cast v4, Lgj/i;

    .line 29
    .line 30
    invoke-interface {v4}, Lgj/i;->c()[Ljava/util/Locale;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    array-length v5, v5

    .line 35
    if-lt v5, v3, :cond_0

    .line 36
    .line 37
    move-object v2, v4

    .line 38
    move v3, v5

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    if-nez v2, :cond_2

    .line 41
    .line 42
    sget-object v2, Lgj/i;->a:Lgj/i;

    .line 43
    .line 44
    :cond_2
    sput-object v2, Lnet/time4j/j0;->k:Lgj/i;

    .line 45
    .line 46
    new-instance v0, Lj$/util/concurrent/ConcurrentHashMap;

    .line 47
    .line 48
    invoke-direct {v0}, Lj$/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 49
    .line 50
    .line 51
    sput-object v0, Lnet/time4j/j0;->l:Ljava/util/concurrent/ConcurrentMap;

    .line 52
    .line 53
    const/4 v0, 0x7

    .line 54
    new-array v0, v0, [Lnet/time4j/w;

    .line 55
    .line 56
    sget-object v2, Lnet/time4j/f;->n:Lnet/time4j/f;

    .line 57
    .line 58
    aput-object v2, v0, v1

    .line 59
    .line 60
    sget-object v3, Lnet/time4j/f;->p:Lnet/time4j/f;

    .line 61
    .line 62
    const/4 v4, 0x1

    .line 63
    aput-object v3, v0, v4

    .line 64
    .line 65
    sget-object v5, Lnet/time4j/f;->q:Lnet/time4j/f;

    .line 66
    .line 67
    const/4 v6, 0x2

    .line 68
    aput-object v5, v0, v6

    .line 69
    .line 70
    sget-object v5, Lnet/time4j/f;->r:Lnet/time4j/f;

    .line 71
    .line 72
    const/4 v7, 0x3

    .line 73
    aput-object v5, v0, v7

    .line 74
    .line 75
    sget-object v8, Lnet/time4j/g;->k:Lnet/time4j/g;

    .line 76
    .line 77
    const/4 v9, 0x4

    .line 78
    aput-object v8, v0, v9

    .line 79
    .line 80
    sget-object v10, Lnet/time4j/g;->l:Lnet/time4j/g;

    .line 81
    .line 82
    const/4 v11, 0x5

    .line 83
    aput-object v10, v0, v11

    .line 84
    .line 85
    sget-object v12, Lnet/time4j/g;->m:Lnet/time4j/g;

    .line 86
    .line 87
    const/4 v13, 0x6

    .line 88
    aput-object v12, v0, v13

    .line 89
    .line 90
    sput-object v0, Lnet/time4j/j0;->m:[Lnet/time4j/w;

    .line 91
    .line 92
    new-array v13, v13, [Lnet/time4j/w;

    .line 93
    .line 94
    aput-object v2, v13, v1

    .line 95
    .line 96
    aput-object v3, v13, v4

    .line 97
    .line 98
    aput-object v5, v13, v6

    .line 99
    .line 100
    aput-object v8, v13, v7

    .line 101
    .line 102
    aput-object v10, v13, v9

    .line 103
    .line 104
    aput-object v12, v13, v11

    .line 105
    .line 106
    sput-object v13, Lnet/time4j/j0;->n:[Lnet/time4j/w;

    .line 107
    .line 108
    new-instance v1, Ljava/util/HashSet;

    .line 109
    .line 110
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 111
    .line 112
    .line 113
    invoke-static {v1, v0}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    sget-object v0, Lnet/time4j/g;->p:Lnet/time4j/g;

    .line 117
    .line 118
    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    sput-object v0, Lnet/time4j/j0;->o:Ljava/util/Set;

    .line 126
    .line 127
    const-wide/32 v0, 0x3c26700

    .line 128
    .line 129
    .line 130
    sput-wide v0, Lnet/time4j/j0;->p:J

    .line 131
    .line 132
    return-void
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
.end method

.method private constructor <init>(Ljava/util/Locale;Lnet/time4j/base/e;CLjava/lang/String;Lnet/time4j/w;ZZLjava/lang/String;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Locale;",
            "Lnet/time4j/base/e<",
            "*>;C",
            "Ljava/lang/String;",
            "Lnet/time4j/w;",
            "ZZ",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-eqz p5, :cond_1

    .line 5
    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    sget-object v0, Lgj/k;->k:Lgj/k;

    .line 9
    .line 10
    invoke-static {p1, v0}, Lgj/p;->f(Ljava/util/Locale;Lgj/k;)Lgj/p;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, Lnet/time4j/j0;->a:Lgj/p;

    .line 15
    .line 16
    iput-object p1, p0, Lnet/time4j/j0;->b:Ljava/util/Locale;

    .line 17
    .line 18
    iput-object p2, p0, Lnet/time4j/j0;->c:Lnet/time4j/base/e;

    .line 19
    .line 20
    iput-char p3, p0, Lnet/time4j/j0;->d:C

    .line 21
    .line 22
    iput-object p5, p0, Lnet/time4j/j0;->f:Lnet/time4j/w;

    .line 23
    .line 24
    iput-object p4, p0, Lnet/time4j/j0;->e:Ljava/lang/String;

    .line 25
    .line 26
    iput-boolean p6, p0, Lnet/time4j/j0;->g:Z

    .line 27
    .line 28
    iput-boolean p7, p0, Lnet/time4j/j0;->h:Z

    .line 29
    .line 30
    iput-object p8, p0, Lnet/time4j/j0;->i:Ljava/lang/String;

    .line 31
    .line 32
    iput-object p9, p0, Lnet/time4j/j0;->j:Ljava/lang/String;

    .line 33
    .line 34
    return-void

    .line 35
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 36
    .line 37
    const-string p2, "Missing reference clock."

    .line 38
    .line 39
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw p1

    .line 43
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    .line 44
    .line 45
    const-string p2, "Missing zero time unit."

    .line 46
    .line 47
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw p1
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
.end method

.method public static b(Ljava/util/Locale;)Lnet/time4j/j0;
    .locals 12

    .line 1
    sget-object v0, Lnet/time4j/j0;->l:Ljava/util/concurrent/ConcurrentMap;

    .line 2
    .line 3
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Lnet/time4j/j0;

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    new-instance v1, Lnet/time4j/j0;

    .line 12
    .line 13
    sget-object v4, Lnet/time4j/p0;->e:Lnet/time4j/p0;

    .line 14
    .line 15
    sget-object v2, Lnet/time4j/j0;->k:Lgj/i;

    .line 16
    .line 17
    invoke-interface {v2, p0}, Lgj/i;->f(Ljava/util/Locale;)C

    .line 18
    .line 19
    .line 20
    move-result v5

    .line 21
    invoke-interface {v2, p0}, Lgj/i;->b(Ljava/util/Locale;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v6

    .line 25
    sget-object v7, Lnet/time4j/g;->m:Lnet/time4j/g;

    .line 26
    .line 27
    const/4 v8, 0x0

    .line 28
    const/4 v9, 0x0

    .line 29
    const/4 v10, 0x0

    .line 30
    const/4 v11, 0x0

    .line 31
    move-object v2, v1

    .line 32
    move-object v3, p0

    .line 33
    invoke-direct/range {v2 .. v11}, Lnet/time4j/j0;-><init>(Ljava/util/Locale;Lnet/time4j/base/e;CLjava/lang/String;Lnet/time4j/w;ZZLjava/lang/String;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-interface {v0, p0, v1}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, Lnet/time4j/j0;

    .line 41
    .line 42
    if-eqz p0, :cond_0

    .line 43
    .line 44
    move-object v1, p0

    .line 45
    :cond_0
    return-object v1
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


# virtual methods
.method public a()Ljava/util/Locale;
    .locals 1

    iget-object v0, p0, Lnet/time4j/j0;->b:Ljava/util/Locale;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lnet/time4j/j0;->a()Ljava/util/Locale;

    move-result-object v0

    invoke-static {v0}, Lnet/time4j/s0;->h(Ljava/util/Locale;)Lnet/time4j/s0;

    move-result-object v0

    invoke-virtual {v0}, Lnet/time4j/s0;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
