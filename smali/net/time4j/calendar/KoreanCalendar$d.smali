.class Lnet/time4j/calendar/KoreanCalendar$d;
.super Lnet/time4j/calendar/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/time4j/calendar/KoreanCalendar;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lnet/time4j/calendar/d<",
        "Lnet/time4j/calendar/KoreanCalendar;",
        ">;"
    }
.end annotation


# static fields
.field private static final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lnet/time4j/tz/p;",
            ">;"
        }
    .end annotation
.end field

.field private static final e:J

.field private static final f:J

.field private static final g:J

.field private static final h:J


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v1, Lnet/time4j/tz/f;->l:Lnet/time4j/tz/f;

    .line 8
    .line 9
    const/16 v2, 0x3a

    .line 10
    .line 11
    const-wide/16 v3, 0x0

    .line 12
    .line 13
    const/16 v5, 0x7e

    .line 14
    .line 15
    invoke-static {v1, v5, v2, v3, v4}, Lnet/time4j/tz/p;->c(Lnet/time4j/tz/f;IID)Lnet/time4j/tz/p;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    const/16 v2, 0x8

    .line 23
    .line 24
    const/16 v3, 0x1e

    .line 25
    .line 26
    invoke-static {v1, v2, v3}, Lnet/time4j/tz/p;->q(Lnet/time4j/tz/f;II)Lnet/time4j/tz/p;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    const/16 v4, 0x9

    .line 34
    .line 35
    const/4 v5, 0x0

    .line 36
    invoke-static {v1, v4, v5}, Lnet/time4j/tz/p;->q(Lnet/time4j/tz/f;II)Lnet/time4j/tz/p;

    .line 37
    .line 38
    .line 39
    move-result-object v6

    .line 40
    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    invoke-static {v1, v2, v3}, Lnet/time4j/tz/p;->q(Lnet/time4j/tz/f;II)Lnet/time4j/tz/p;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    invoke-static {v1, v4, v5}, Lnet/time4j/tz/p;->q(Lnet/time4j/tz/f;II)Lnet/time4j/tz/p;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    sput-object v0, Lnet/time4j/calendar/KoreanCalendar$d;->d:Ljava/util/List;

    .line 62
    .line 63
    const/16 v0, 0x774

    .line 64
    .line 65
    const/4 v1, 0x4

    .line 66
    const/4 v3, 0x1

    .line 67
    invoke-static {v0, v1, v3}, Lnet/time4j/f0;->L0(III)Lnet/time4j/f0;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-virtual {v0}, Lfj/m;->b()J

    .line 72
    .line 73
    .line 74
    move-result-wide v0

    .line 75
    sput-wide v0, Lnet/time4j/calendar/KoreanCalendar$d;->e:J

    .line 76
    .line 77
    const/16 v0, 0x778

    .line 78
    .line 79
    invoke-static {v0, v3, v3}, Lnet/time4j/f0;->L0(III)Lnet/time4j/f0;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-virtual {v0}, Lfj/m;->b()J

    .line 84
    .line 85
    .line 86
    move-result-wide v0

    .line 87
    sput-wide v0, Lnet/time4j/calendar/KoreanCalendar$d;->f:J

    .line 88
    .line 89
    const/4 v0, 0x3

    .line 90
    const/16 v1, 0x15

    .line 91
    .line 92
    const/16 v3, 0x7a2

    .line 93
    .line 94
    invoke-static {v3, v0, v1}, Lnet/time4j/f0;->L0(III)Lnet/time4j/f0;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-virtual {v0}, Lfj/m;->b()J

    .line 99
    .line 100
    .line 101
    move-result-wide v0

    .line 102
    sput-wide v0, Lnet/time4j/calendar/KoreanCalendar$d;->g:J

    .line 103
    .line 104
    const/16 v0, 0x7a9

    .line 105
    .line 106
    const/16 v1, 0xa

    .line 107
    .line 108
    invoke-static {v0, v2, v1}, Lnet/time4j/f0;->L0(III)Lnet/time4j/f0;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-virtual {v0}, Lfj/m;->b()J

    .line 113
    .line 114
    .line 115
    move-result-wide v0

    .line 116
    sput-wide v0, Lnet/time4j/calendar/KoreanCalendar$d;->h:J

    .line 117
    .line 118
    return-void
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

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lnet/time4j/calendar/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lnet/time4j/calendar/KoreanCalendar$a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lnet/time4j/calendar/KoreanCalendar$d;-><init>()V

    return-void
.end method


# virtual methods
.method bridge synthetic e(IILnet/time4j/calendar/h;IJ)Lnet/time4j/calendar/f;
    .locals 0

    invoke-virtual/range {p0 .. p6}, Lnet/time4j/calendar/KoreanCalendar$d;->x(IILnet/time4j/calendar/h;IJ)Lnet/time4j/calendar/KoreanCalendar;

    move-result-object p1

    return-object p1
.end method

.method h()[I
    .locals 1

    invoke-static {}, Lnet/time4j/calendar/KoreanCalendar;->m0()[I

    move-result-object v0

    return-object v0
.end method

.method i(J)Lnet/time4j/tz/p;
    .locals 2

    .line 1
    sget-wide v0, Lnet/time4j/calendar/KoreanCalendar$d;->e:J

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-gez v0, :cond_0

    .line 6
    .line 7
    sget-object p1, Lnet/time4j/calendar/KoreanCalendar$d;->d:Ljava/util/List;

    .line 8
    .line 9
    const/4 p2, 0x0

    .line 10
    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lnet/time4j/tz/p;

    .line 15
    .line 16
    return-object p1

    .line 17
    :cond_0
    sget-wide v0, Lnet/time4j/calendar/KoreanCalendar$d;->f:J

    .line 18
    .line 19
    cmp-long v0, p1, v0

    .line 20
    .line 21
    if-gez v0, :cond_1

    .line 22
    .line 23
    sget-object p1, Lnet/time4j/calendar/KoreanCalendar$d;->d:Ljava/util/List;

    .line 24
    .line 25
    const/4 p2, 0x1

    .line 26
    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    check-cast p1, Lnet/time4j/tz/p;

    .line 31
    .line 32
    return-object p1

    .line 33
    :cond_1
    sget-wide v0, Lnet/time4j/calendar/KoreanCalendar$d;->g:J

    .line 34
    .line 35
    cmp-long v0, p1, v0

    .line 36
    .line 37
    if-gez v0, :cond_2

    .line 38
    .line 39
    sget-object p1, Lnet/time4j/calendar/KoreanCalendar$d;->d:Ljava/util/List;

    .line 40
    .line 41
    const/4 p2, 0x2

    .line 42
    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    check-cast p1, Lnet/time4j/tz/p;

    .line 47
    .line 48
    return-object p1

    .line 49
    :cond_2
    sget-wide v0, Lnet/time4j/calendar/KoreanCalendar$d;->h:J

    .line 50
    .line 51
    cmp-long p1, p1, v0

    .line 52
    .line 53
    if-gez p1, :cond_3

    .line 54
    .line 55
    sget-object p1, Lnet/time4j/calendar/KoreanCalendar$d;->d:Ljava/util/List;

    .line 56
    .line 57
    const/4 p2, 0x3

    .line 58
    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    check-cast p1, Lnet/time4j/tz/p;

    .line 63
    .line 64
    return-object p1

    .line 65
    :cond_3
    sget-object p1, Lnet/time4j/calendar/KoreanCalendar$d;->d:Ljava/util/List;

    .line 66
    .line 67
    const/4 p2, 0x4

    .line 68
    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    check-cast p1, Lnet/time4j/tz/p;

    .line 73
    .line 74
    return-object p1
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

.method x(IILnet/time4j/calendar/h;IJ)Lnet/time4j/calendar/KoreanCalendar;
    .locals 9

    new-instance v8, Lnet/time4j/calendar/KoreanCalendar;

    const/4 v7, 0x0

    move-object v0, v8

    move v1, p1

    move v2, p2

    move-object v3, p3

    move v4, p4

    move-wide v5, p5

    invoke-direct/range {v0 .. v7}, Lnet/time4j/calendar/KoreanCalendar;-><init>(IILnet/time4j/calendar/h;IJLnet/time4j/calendar/KoreanCalendar$a;)V

    return-object v8
.end method
