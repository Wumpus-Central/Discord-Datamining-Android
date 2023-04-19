.class final Lhj/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfj/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhj/b$a;
    }
.end annotation


# static fields
.field static final g:Lfj/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfj/c<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field static final h:Lfj/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfj/c<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final i:Lgj/i;

.field private static final j:C

.field private static final k:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap<",
            "Ljava/lang/String;",
            "Lhj/b$a;",
            ">;"
        }
    .end annotation
.end field

.field private static final l:Lhj/b$a;


# instance fields
.field private final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lgj/a;

.field private final c:Ljava/util/Locale;

.field private final d:I

.field private final e:I

.field private final f:Lfj/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfj/n<",
            "Lfj/o;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    const-string v0, "PLUS_SIGN"

    .line 2
    .line 3
    const-class v1, Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lgj/a;->e(Ljava/lang/String;Ljava/lang/Class;)Lfj/c;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Lhj/b;->g:Lfj/c;

    .line 10
    .line 11
    const-string v0, "MINUS_SIGN"

    .line 12
    .line 13
    invoke-static {v0, v1}, Lgj/a;->e(Ljava/lang/String;Ljava/lang/Class;)Lfj/c;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, Lhj/b;->h:Lfj/c;

    .line 18
    .line 19
    invoke-static {}, Lnet/time4j/base/d;->c()Lnet/time4j/base/d;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const-class v1, Lgj/i;

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Lnet/time4j/base/d;->g(Ljava/lang/Class;)Ljava/lang/Iterable;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    const/4 v1, 0x0

    .line 34
    const/4 v2, 0x0

    .line 35
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-eqz v3, :cond_1

    .line 40
    .line 41
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    check-cast v3, Lgj/i;

    .line 46
    .line 47
    invoke-interface {v3}, Lgj/i;->c()[Ljava/util/Locale;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    array-length v4, v4

    .line 52
    if-le v4, v2, :cond_0

    .line 53
    .line 54
    move-object v1, v3

    .line 55
    move v2, v4

    .line 56
    goto :goto_0

    .line 57
    :cond_1
    if-nez v1, :cond_2

    .line 58
    .line 59
    sget-object v1, Llj/f;->d:Llj/f;

    .line 60
    .line 61
    :cond_2
    sput-object v1, Lhj/b;->i:Lgj/i;

    .line 62
    .line 63
    const-string v0, "net.time4j.format.iso.decimal.dot"

    .line 64
    .line 65
    invoke-static {v0}, Ljava/lang/Boolean;->getBoolean(Ljava/lang/String;)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-eqz v0, :cond_3

    .line 70
    .line 71
    const/16 v0, 0x2e

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_3
    const/16 v0, 0x2c

    .line 75
    .line 76
    :goto_1
    move v4, v0

    .line 77
    sput-char v4, Lhj/b;->j:C

    .line 78
    .line 79
    new-instance v0, Lj$/util/concurrent/ConcurrentHashMap;

    .line 80
    .line 81
    invoke-direct {v0}, Lj$/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 82
    .line 83
    .line 84
    sput-object v0, Lhj/b;->k:Ljava/util/concurrent/ConcurrentMap;

    .line 85
    .line 86
    new-instance v0, Lhj/b$a;

    .line 87
    .line 88
    sget-object v2, Lgj/j;->k:Lgj/j;

    .line 89
    .line 90
    const/16 v3, 0x30

    .line 91
    .line 92
    const-string v5, "+"

    .line 93
    .line 94
    const-string v6, "-"

    .line 95
    .line 96
    move-object v1, v0

    .line 97
    invoke-direct/range {v1 .. v6}, Lhj/b$a;-><init>(Lgj/j;CCLjava/lang/String;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    sput-object v0, Lhj/b;->l:Lhj/b$a;

    .line 101
    .line 102
    return-void
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
.end method

.method constructor <init>(Lgj/a;Ljava/util/Locale;)V
    .locals 6

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    .line 1
    invoke-direct/range {v0 .. v5}, Lhj/b;-><init>(Lgj/a;Ljava/util/Locale;IILfj/n;)V

    return-void
.end method

.method constructor <init>(Lgj/a;Ljava/util/Locale;IILfj/n;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgj/a;",
            "Ljava/util/Locale;",
            "II",
            "Lfj/n<",
            "Lfj/o;",
            ">;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_1

    .line 3
    iput-object p1, p0, Lhj/b;->b:Lgj/a;

    if-nez p2, :cond_0

    .line 4
    sget-object p2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    :cond_0
    iput-object p2, p0, Lhj/b;->c:Ljava/util/Locale;

    .line 5
    iput p3, p0, Lhj/b;->d:I

    .line 6
    iput p4, p0, Lhj/b;->e:I

    .line 7
    iput-object p5, p0, Lhj/b;->f:Lfj/n;

    .line 8
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lhj/b;->a:Ljava/util/Map;

    return-void

    .line 9
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Missing format attributes."

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private constructor <init>(Lgj/a;Ljava/util/Locale;IILfj/n;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgj/a;",
            "Ljava/util/Locale;",
            "II",
            "Lfj/n<",
            "Lfj/o;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_1

    .line 11
    iput-object p1, p0, Lhj/b;->b:Lgj/a;

    if-nez p2, :cond_0

    .line 12
    sget-object p2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    :cond_0
    iput-object p2, p0, Lhj/b;->c:Ljava/util/Locale;

    .line 13
    iput p3, p0, Lhj/b;->d:I

    .line 14
    iput p4, p0, Lhj/b;->e:I

    .line 15
    iput-object p5, p0, Lhj/b;->f:Lfj/n;

    .line 16
    invoke-static {p6}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lhj/b;->a:Ljava/util/Map;

    return-void

    .line 17
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Missing format attributes."

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method static d(Lfj/x;Lgj/a;Ljava/util/Locale;)Lhj/b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/x<",
            "*>;",
            "Lgj/a;",
            "Ljava/util/Locale;",
            ")",
            "Lhj/b;"
        }
    .end annotation

    .line 1
    new-instance v0, Lgj/a$b;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lgj/a$b;-><init>(Lfj/x;)V

    .line 4
    .line 5
    .line 6
    sget-object p0, Lgj/a;->f:Lfj/c;

    .line 7
    .line 8
    sget-object v1, Lgj/g;->l:Lgj/g;

    .line 9
    .line 10
    invoke-virtual {v0, p0, v1}, Lgj/a$b;->d(Lfj/c;Ljava/lang/Enum;)Lgj/a$b;

    .line 11
    .line 12
    .line 13
    sget-object p0, Lgj/a;->g:Lfj/c;

    .line 14
    .line 15
    sget-object v1, Lgj/v;->k:Lgj/v;

    .line 16
    .line 17
    invoke-virtual {v0, p0, v1}, Lgj/a$b;->d(Lfj/c;Ljava/lang/Enum;)Lgj/a$b;

    .line 18
    .line 19
    .line 20
    sget-object p0, Lgj/a;->h:Lfj/c;

    .line 21
    .line 22
    sget-object v1, Lgj/m;->k:Lgj/m;

    .line 23
    .line 24
    invoke-virtual {v0, p0, v1}, Lgj/a$b;->d(Lfj/c;Ljava/lang/Enum;)Lgj/a$b;

    .line 25
    .line 26
    .line 27
    sget-object p0, Lgj/a;->p:Lfj/c;

    .line 28
    .line 29
    const/16 v1, 0x20

    .line 30
    .line 31
    invoke-virtual {v0, p0, v1}, Lgj/a$b;->b(Lfj/c;C)Lgj/a$b;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, p1}, Lgj/a$b;->f(Lgj/a;)Lgj/a$b;

    .line 35
    .line 36
    .line 37
    new-instance p0, Lhj/b;

    .line 38
    .line 39
    invoke-virtual {v0}, Lgj/a$b;->a()Lgj/a;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-direct {p0, p1, p2}, Lhj/b;-><init>(Lgj/a;Ljava/util/Locale;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, p2}, Lhj/b;->n(Ljava/util/Locale;)Lhj/b;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0
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

.method private static j(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    if-nez p0, :cond_1

    if-nez p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    :goto_0
    return p0
.end method

.method static k(Lhj/b;Lhj/b;)Lhj/b;
    .locals 7

    .line 1
    new-instance v6, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p1, Lhj/b;->a:Ljava/util/Map;

    .line 7
    .line 8
    invoke-interface {v6, v0}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lhj/b;->a:Ljava/util/Map;

    .line 12
    .line 13
    invoke-interface {v6, v0}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Lgj/a$b;

    .line 17
    .line 18
    invoke-direct {v0}, Lgj/a$b;-><init>()V

    .line 19
    .line 20
    .line 21
    iget-object p1, p1, Lhj/b;->b:Lgj/a;

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Lgj/a$b;->f(Lgj/a;)Lgj/a$b;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iget-object v0, p0, Lhj/b;->b:Lgj/a;

    .line 28
    .line 29
    invoke-virtual {p1, v0}, Lgj/a$b;->f(Lgj/a;)Lgj/a$b;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p1}, Lgj/a$b;->a()Lgj/a;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    new-instance p1, Lhj/b;

    .line 38
    .line 39
    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 40
    .line 41
    const/4 v3, 0x0

    .line 42
    const/4 v4, 0x0

    .line 43
    const/4 v5, 0x0

    .line 44
    move-object v0, p1

    .line 45
    invoke-direct/range {v0 .. v6}, Lhj/b;-><init>(Lgj/a;Ljava/util/Locale;IILfj/n;Ljava/util/Map;)V

    .line 46
    .line 47
    .line 48
    iget-object p0, p0, Lhj/b;->c:Ljava/util/Locale;

    .line 49
    .line 50
    invoke-virtual {p1, p0}, Lhj/b;->n(Ljava/util/Locale;)Lhj/b;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    return-object p0
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
.end method


# virtual methods
.method public a(Lfj/c;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A:",
            "Ljava/lang/Object;",
            ">(",
            "Lfj/c<",
            "TA;>;TA;)TA;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lhj/b;->a:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {p1}, Lfj/c;->name()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-interface {p1}, Lfj/c;->type()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    iget-object v0, p0, Lhj/b;->a:Ljava/util/Map;

    .line 18
    .line 19
    invoke-interface {p1}, Lfj/c;->name()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p2, p1}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    return-object p1

    .line 32
    :cond_0
    iget-object v0, p0, Lhj/b;->b:Lgj/a;

    .line 33
    .line 34
    invoke-virtual {v0, p1, p2}, Lgj/a;->a(Lfj/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    return-object p1
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
.end method

.method public b(Lfj/c;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/c<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lhj/b;->a:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {p1}, Lfj/c;->name()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    return p1

    .line 15
    :cond_0
    iget-object v0, p0, Lhj/b;->b:Lgj/a;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Lgj/a;->b(Lfj/c;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public c(Lfj/c;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A:",
            "Ljava/lang/Object;",
            ">(",
            "Lfj/c<",
            "TA;>;)TA;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lhj/b;->a:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {p1}, Lfj/c;->name()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-interface {p1}, Lfj/c;->type()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v1, p0, Lhj/b;->a:Ljava/util/Map;

    .line 18
    .line 19
    invoke-interface {p1}, Lfj/c;->name()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {v0, p1}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    return-object p1

    .line 32
    :cond_0
    iget-object v0, p0, Lhj/b;->b:Lgj/a;

    .line 33
    .line 34
    invoke-virtual {v0, p1}, Lgj/a;->c(Lfj/c;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    return-object p1
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

.method e()Lgj/a;
    .locals 1

    iget-object v0, p0, Lhj/b;->b:Lgj/a;

    return-object v0
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
    instance-of v1, p1, Lhj/b;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_2

    .line 9
    .line 10
    check-cast p1, Lhj/b;

    .line 11
    .line 12
    iget-object v1, p0, Lhj/b;->b:Lgj/a;

    .line 13
    .line 14
    iget-object v3, p1, Lhj/b;->b:Lgj/a;

    .line 15
    .line 16
    invoke-virtual {v1, v3}, Lgj/a;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    iget-object v1, p0, Lhj/b;->c:Ljava/util/Locale;

    .line 23
    .line 24
    iget-object v3, p1, Lhj/b;->c:Ljava/util/Locale;

    .line 25
    .line 26
    invoke-virtual {v1, v3}, Ljava/util/Locale;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    iget v1, p0, Lhj/b;->d:I

    .line 33
    .line 34
    iget v3, p1, Lhj/b;->d:I

    .line 35
    .line 36
    if-ne v1, v3, :cond_1

    .line 37
    .line 38
    iget v1, p0, Lhj/b;->e:I

    .line 39
    .line 40
    iget v3, p1, Lhj/b;->e:I

    .line 41
    .line 42
    if-ne v1, v3, :cond_1

    .line 43
    .line 44
    iget-object v1, p0, Lhj/b;->f:Lfj/n;

    .line 45
    .line 46
    iget-object v3, p1, Lhj/b;->f:Lfj/n;

    .line 47
    .line 48
    invoke-static {v1, v3}, Lhj/b;->j(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_1

    .line 53
    .line 54
    iget-object v1, p0, Lhj/b;->a:Ljava/util/Map;

    .line 55
    .line 56
    iget-object p1, p1, Lhj/b;->a:Ljava/util/Map;

    .line 57
    .line 58
    invoke-interface {v1, p1}, Ljava/util/Map;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    if-eqz p1, :cond_1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    move v0, v2

    .line 66
    :goto_0
    return v0

    .line 67
    :cond_2
    return v2
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

.method f()Lfj/n;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lfj/n<",
            "Lfj/o;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lhj/b;->f:Lfj/n;

    return-object v0
.end method

.method g()I
    .locals 1

    iget v0, p0, Lhj/b;->d:I

    return v0
.end method

.method h()Ljava/util/Locale;
    .locals 1

    iget-object v0, p0, Lhj/b;->c:Ljava/util/Locale;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lhj/b;->b:Lgj/a;

    invoke-virtual {v0}, Lgj/a;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x7

    iget-object v1, p0, Lhj/b;->a:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->hashCode()I

    move-result v1

    mul-int/lit8 v1, v1, 0x25

    add-int/2addr v0, v1

    return v0
.end method

.method i()I
    .locals 1

    iget v0, p0, Lhj/b;->e:I

    return v0
.end method

.method l(Lgj/a;)Lhj/b;
    .locals 8

    new-instance v7, Lhj/b;

    iget-object v2, p0, Lhj/b;->c:Ljava/util/Locale;

    iget v3, p0, Lhj/b;->d:I

    iget v4, p0, Lhj/b;->e:I

    iget-object v5, p0, Lhj/b;->f:Lfj/n;

    iget-object v6, p0, Lhj/b;->a:Ljava/util/Map;

    move-object v0, v7

    move-object v1, p1

    invoke-direct/range {v0 .. v6}, Lhj/b;-><init>(Lgj/a;Ljava/util/Locale;IILfj/n;Ljava/util/Map;)V

    return-object v7
.end method

.method m(Lfj/c;Ljava/lang/Object;)Lhj/b;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A:",
            "Ljava/lang/Object;",
            ">(",
            "Lfj/c<",
            "TA;>;TA;)",
            "Lhj/b;"
        }
    .end annotation

    .line 1
    new-instance v6, Ljava/util/HashMap;

    .line 2
    .line 3
    iget-object v0, p0, Lhj/b;->a:Ljava/util/Map;

    .line 4
    .line 5
    invoke-direct {v6, v0}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 6
    .line 7
    .line 8
    if-nez p2, :cond_0

    .line 9
    .line 10
    invoke-interface {p1}, Lfj/c;->name()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-interface {v6, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-interface {p1}, Lfj/c;->name()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-interface {v6, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    :goto_0
    new-instance p1, Lhj/b;

    .line 26
    .line 27
    iget-object v1, p0, Lhj/b;->b:Lgj/a;

    .line 28
    .line 29
    iget-object v2, p0, Lhj/b;->c:Ljava/util/Locale;

    .line 30
    .line 31
    iget v3, p0, Lhj/b;->d:I

    .line 32
    .line 33
    iget v4, p0, Lhj/b;->e:I

    .line 34
    .line 35
    iget-object v5, p0, Lhj/b;->f:Lfj/n;

    .line 36
    .line 37
    move-object v0, p1

    .line 38
    invoke-direct/range {v0 .. v6}, Lhj/b;-><init>(Lgj/a;Ljava/util/Locale;IILfj/n;Ljava/util/Map;)V

    .line 39
    .line 40
    .line 41
    return-object p1
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
.end method

.method n(Ljava/util/Locale;)Lhj/b;
    .locals 10

    .line 1
    new-instance v0, Lgj/a$b;

    .line 2
    .line 3
    invoke-direct {v0}, Lgj/a$b;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lhj/b;->b:Lgj/a;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lgj/a$b;->f(Lgj/a;)Lgj/a$b;

    .line 9
    .line 10
    .line 11
    invoke-static {p1}, Llj/d;->a(Ljava/util/Locale;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {p1}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-eqz v3, :cond_0

    .line 24
    .line 25
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_0

    .line 30
    .line 31
    sget-object p1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 32
    .line 33
    sget-object v1, Lgj/a;->l:Lfj/c;

    .line 34
    .line 35
    sget-object v2, Lgj/j;->k:Lgj/j;

    .line 36
    .line 37
    invoke-virtual {v0, v1, v2}, Lgj/a$b;->d(Lfj/c;Ljava/lang/Enum;)Lgj/a$b;

    .line 38
    .line 39
    .line 40
    sget-object v1, Lgj/a;->o:Lfj/c;

    .line 41
    .line 42
    sget-char v2, Lhj/b;->j:C

    .line 43
    .line 44
    invoke-virtual {v0, v1, v2}, Lgj/a$b;->b(Lfj/c;C)Lgj/a$b;

    .line 45
    .line 46
    .line 47
    const-string v1, "+"

    .line 48
    .line 49
    const-string v2, "-"

    .line 50
    .line 51
    :goto_0
    move-object v5, p1

    .line 52
    goto/16 :goto_2

    .line 53
    .line 54
    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    if-nez v3, :cond_1

    .line 59
    .line 60
    new-instance v3, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    const-string v1, "_"

    .line 69
    .line 70
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    :cond_1
    sget-object v2, Lhj/b;->k:Ljava/util/concurrent/ConcurrentMap;

    .line 81
    .line 82
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    check-cast v2, Lhj/b$a;

    .line 87
    .line 88
    if-nez v2, :cond_2

    .line 89
    .line 90
    :try_start_0
    new-instance v2, Lhj/b$a;

    .line 91
    .line 92
    sget-object v3, Lhj/b;->i:Lgj/i;

    .line 93
    .line 94
    invoke-interface {v3, p1}, Lgj/i;->a(Ljava/util/Locale;)Lgj/j;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    invoke-interface {v3, p1}, Lgj/i;->f(Ljava/util/Locale;)C

    .line 99
    .line 100
    .line 101
    move-result v5

    .line 102
    invoke-interface {v3, p1}, Lgj/i;->d(Ljava/util/Locale;)C

    .line 103
    .line 104
    .line 105
    move-result v6

    .line 106
    invoke-interface {v3, p1}, Lgj/i;->e(Ljava/util/Locale;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v7

    .line 110
    invoke-interface {v3, p1}, Lgj/i;->b(Ljava/util/Locale;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v8

    .line 114
    move-object v3, v2

    .line 115
    invoke-direct/range {v3 .. v8}, Lhj/b$a;-><init>(Lgj/j;CCLjava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 116
    .line 117
    .line 118
    goto :goto_1

    .line 119
    :catch_0
    sget-object v2, Lhj/b;->l:Lhj/b$a;

    .line 120
    .line 121
    :goto_1
    sget-object v3, Lhj/b;->k:Ljava/util/concurrent/ConcurrentMap;

    .line 122
    .line 123
    invoke-interface {v3, v1, v2}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    check-cast v1, Lhj/b$a;

    .line 128
    .line 129
    if-eqz v1, :cond_2

    .line 130
    .line 131
    move-object v2, v1

    .line 132
    :cond_2
    sget-object v1, Lgj/a;->l:Lfj/c;

    .line 133
    .line 134
    invoke-static {v2}, Lhj/b$a;->a(Lhj/b$a;)Lgj/j;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    invoke-virtual {v0, v1, v3}, Lgj/a$b;->d(Lfj/c;Ljava/lang/Enum;)Lgj/a$b;

    .line 139
    .line 140
    .line 141
    sget-object v1, Lgj/a;->m:Lfj/c;

    .line 142
    .line 143
    invoke-static {v2}, Lhj/b$a;->b(Lhj/b$a;)C

    .line 144
    .line 145
    .line 146
    move-result v3

    .line 147
    invoke-virtual {v0, v1, v3}, Lgj/a$b;->b(Lfj/c;C)Lgj/a$b;

    .line 148
    .line 149
    .line 150
    sget-object v1, Lgj/a;->o:Lfj/c;

    .line 151
    .line 152
    invoke-static {v2}, Lhj/b$a;->c(Lhj/b$a;)C

    .line 153
    .line 154
    .line 155
    move-result v3

    .line 156
    invoke-virtual {v0, v1, v3}, Lgj/a$b;->b(Lfj/c;C)Lgj/a$b;

    .line 157
    .line 158
    .line 159
    invoke-static {v2}, Lhj/b$a;->d(Lhj/b$a;)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    invoke-static {v2}, Lhj/b$a;->e(Lhj/b$a;)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    goto :goto_0

    .line 168
    :goto_2
    invoke-virtual {v0, v5}, Lgj/a$b;->h(Ljava/util/Locale;)Lgj/a$b;

    .line 169
    .line 170
    .line 171
    new-instance v9, Ljava/util/HashMap;

    .line 172
    .line 173
    iget-object p1, p0, Lhj/b;->a:Ljava/util/Map;

    .line 174
    .line 175
    invoke-direct {v9, p1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 176
    .line 177
    .line 178
    sget-object p1, Lhj/b;->g:Lfj/c;

    .line 179
    .line 180
    invoke-interface {p1}, Lfj/c;->name()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    invoke-interface {v9, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    sget-object p1, Lhj/b;->h:Lfj/c;

    .line 188
    .line 189
    invoke-interface {p1}, Lfj/c;->name()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    invoke-interface {v9, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    new-instance p1, Lhj/b;

    .line 197
    .line 198
    invoke-virtual {v0}, Lgj/a$b;->a()Lgj/a;

    .line 199
    .line 200
    .line 201
    move-result-object v4

    .line 202
    iget v6, p0, Lhj/b;->d:I

    .line 203
    .line 204
    iget v7, p0, Lhj/b;->e:I

    .line 205
    .line 206
    iget-object v8, p0, Lhj/b;->f:Lfj/n;

    .line 207
    .line 208
    move-object v3, p1

    .line 209
    invoke-direct/range {v3 .. v9}, Lhj/b;-><init>(Lgj/a;Ljava/util/Locale;IILfj/n;Ljava/util/Map;)V

    .line 210
    .line 211
    .line 212
    return-object p1
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
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-class v1, Lhj/b;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v1, "[attributes="

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Lhj/b;->b:Lgj/a;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v1, ",locale="

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    iget-object v1, p0, Lhj/b;->c:Ljava/util/Locale;

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v1, ",level="

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    iget v1, p0, Lhj/b;->d:I

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string v1, ",section="

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    iget v1, p0, Lhj/b;->e:I

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string v1, ",print-condition="

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    iget-object v1, p0, Lhj/b;->f:Lfj/n;

    .line 61
    .line 62
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const-string v1, ",other="

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    iget-object v1, p0, Lhj/b;->a:Ljava/util/Map;

    .line 71
    .line 72
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    const/16 v1, 0x5d

    .line 76
    .line 77
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    return-object v0
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
