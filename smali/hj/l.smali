.class public Lhj/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhj/l$d;,
        Lhj/l$c;
    }
.end annotation


# static fields
.field private static final a:C

.field private static final b:Lhj/l$c;

.field private static final c:Lhj/l$c;

.field private static final d:Lfj/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfj/n<",
            "Lfj/o;",
            ">;"
        }
    .end annotation
.end field

.field private static final e:Lfj/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfj/n<",
            "Ljava/lang/Character;",
            ">;"
        }
    .end annotation
.end field

.field public static final f:Lhj/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhj/c<",
            "Lnet/time4j/f0;",
            ">;"
        }
    .end annotation
.end field

.field public static final g:Lhj/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhj/c<",
            "Lnet/time4j/f0;",
            ">;"
        }
    .end annotation
.end field

.field public static final h:Lhj/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhj/c<",
            "Lnet/time4j/f0;",
            ">;"
        }
    .end annotation
.end field

.field public static final i:Lhj/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhj/c<",
            "Lnet/time4j/f0;",
            ">;"
        }
    .end annotation
.end field

.field public static final j:Lhj/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhj/c<",
            "Lnet/time4j/f0;",
            ">;"
        }
    .end annotation
.end field

.field public static final k:Lhj/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhj/c<",
            "Lnet/time4j/f0;",
            ">;"
        }
    .end annotation
.end field

.field public static final l:Lhj/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhj/c<",
            "Lnet/time4j/f0;",
            ">;"
        }
    .end annotation
.end field

.field public static final m:Lhj/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhj/c<",
            "Lnet/time4j/f0;",
            ">;"
        }
    .end annotation
.end field

.field public static final n:Lhj/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhj/c<",
            "Lnet/time4j/g0;",
            ">;"
        }
    .end annotation
.end field

.field public static final o:Lhj/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhj/c<",
            "Lnet/time4j/g0;",
            ">;"
        }
    .end annotation
.end field

.field public static final p:Lhj/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhj/c<",
            "Lnet/time4j/h0;",
            ">;"
        }
    .end annotation
.end field

.field public static final q:Lhj/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhj/c<",
            "Lnet/time4j/h0;",
            ">;"
        }
    .end annotation
.end field

.field public static final r:Lhj/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhj/c<",
            "Lnet/time4j/a0;",
            ">;"
        }
    .end annotation
.end field

.field public static final s:Lhj/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhj/c<",
            "Lnet/time4j/a0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-string v0, "net.time4j.format.iso.decimal.dot"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Boolean;->getBoolean(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/16 v0, 0x2e

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/16 v0, 0x2c

    .line 13
    .line 14
    :goto_0
    sput-char v0, Lhj/l;->a:C

    .line 15
    .line 16
    new-instance v0, Lhj/l$c;

    .line 17
    .line 18
    sget-object v1, Lnet/time4j/g0;->I:Lnet/time4j/k0;

    .line 19
    .line 20
    invoke-direct {v0, v1}, Lhj/l$c;-><init>(Lfj/p;)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lhj/l;->b:Lhj/l$c;

    .line 24
    .line 25
    new-instance v1, Lhj/l$c;

    .line 26
    .line 27
    sget-object v2, Lnet/time4j/g0;->M:Lnet/time4j/k0;

    .line 28
    .line 29
    invoke-direct {v1, v2}, Lhj/l$c;-><init>(Lfj/p;)V

    .line 30
    .line 31
    .line 32
    sput-object v1, Lhj/l;->c:Lhj/l$c;

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Lhj/l$c;->a(Lhj/l$c;)Lfj/n;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    sput-object v0, Lhj/l;->d:Lfj/n;

    .line 39
    .line 40
    new-instance v0, Lhj/l$d;

    .line 41
    .line 42
    const/4 v1, 0x0

    .line 43
    invoke-direct {v0, v1}, Lhj/l$d;-><init>(Lhj/l$a;)V

    .line 44
    .line 45
    .line 46
    sput-object v0, Lhj/l;->e:Lfj/n;

    .line 47
    .line 48
    const/4 v0, 0x0

    .line 49
    invoke-static {v0}, Lhj/l;->b(Z)Lhj/c;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    sput-object v1, Lhj/l;->f:Lhj/c;

    .line 54
    .line 55
    const/4 v1, 0x1

    .line 56
    invoke-static {v1}, Lhj/l;->b(Z)Lhj/c;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    sput-object v2, Lhj/l;->g:Lhj/c;

    .line 61
    .line 62
    invoke-static {v0}, Lhj/l;->h(Z)Lhj/c;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    sput-object v2, Lhj/l;->h:Lhj/c;

    .line 67
    .line 68
    invoke-static {v1}, Lhj/l;->h(Z)Lhj/c;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    sput-object v2, Lhj/l;->i:Lhj/c;

    .line 73
    .line 74
    invoke-static {v0}, Lhj/l;->m(Z)Lhj/c;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    sput-object v2, Lhj/l;->j:Lhj/c;

    .line 79
    .line 80
    invoke-static {v1}, Lhj/l;->m(Z)Lhj/c;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    sput-object v2, Lhj/l;->k:Lhj/c;

    .line 85
    .line 86
    invoke-static {v0}, Lhj/l;->c(Z)Lhj/c;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    sput-object v2, Lhj/l;->l:Lhj/c;

    .line 91
    .line 92
    invoke-static {v1}, Lhj/l;->c(Z)Lhj/c;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    sput-object v2, Lhj/l;->m:Lhj/c;

    .line 97
    .line 98
    invoke-static {v0}, Lhj/l;->k(Z)Lhj/c;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    sput-object v2, Lhj/l;->n:Lhj/c;

    .line 103
    .line 104
    invoke-static {v1}, Lhj/l;->k(Z)Lhj/c;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    sput-object v2, Lhj/l;->o:Lhj/c;

    .line 109
    .line 110
    invoke-static {v0}, Lhj/l;->l(Z)Lhj/c;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    sput-object v2, Lhj/l;->p:Lhj/c;

    .line 115
    .line 116
    invoke-static {v1}, Lhj/l;->l(Z)Lhj/c;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    sput-object v2, Lhj/l;->q:Lhj/c;

    .line 121
    .line 122
    invoke-static {v0}, Lhj/l;->g(Z)Lhj/c;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    sput-object v0, Lhj/l;->r:Lhj/c;

    .line 127
    .line 128
    invoke-static {v1}, Lhj/l;->g(Z)Lhj/c;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    sput-object v0, Lhj/l;->s:Lhj/c;

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

.method private static a(Lhj/c$d;Z)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lfj/q<",
            "TT;>;>(",
            "Lhj/c$d<",
            "TT;>;Z)V"
        }
    .end annotation

    .line 1
    sget-object v0, Lgj/a;->l:Lfj/c;

    .line 2
    .line 3
    sget-object v1, Lgj/j;->k:Lgj/j;

    .line 4
    .line 5
    invoke-virtual {p0, v0, v1}, Lhj/c$d;->b0(Lfj/c;Ljava/lang/Enum;)Lhj/c$d;

    .line 6
    .line 7
    .line 8
    sget-object v0, Lgj/a;->m:Lfj/c;

    .line 9
    .line 10
    const/16 v1, 0x30

    .line 11
    .line 12
    invoke-virtual {p0, v0, v1}, Lhj/c$d;->Z(Lfj/c;C)Lhj/c$d;

    .line 13
    .line 14
    .line 15
    sget-object v0, Lnet/time4j/g0;->F:Lnet/time4j/k0;

    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    invoke-virtual {p0, v0, v1}, Lhj/c$d;->g(Lfj/p;I)Lhj/c$d;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lhj/c$d;->X()Lhj/c$d;

    .line 22
    .line 23
    .line 24
    const/16 v0, 0x3a

    .line 25
    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    invoke-virtual {p0, v0}, Lhj/c$d;->l(C)Lhj/c$d;

    .line 29
    .line 30
    .line 31
    :cond_0
    sget-object v2, Lnet/time4j/g0;->G:Lnet/time4j/k0;

    .line 32
    .line 33
    invoke-virtual {p0, v2, v1}, Lhj/c$d;->g(Lfj/p;I)Lhj/c$d;

    .line 34
    .line 35
    .line 36
    sget-object v2, Lhj/l;->d:Lfj/n;

    .line 37
    .line 38
    invoke-virtual {p0, v2}, Lhj/c$d;->Y(Lfj/n;)Lhj/c$d;

    .line 39
    .line 40
    .line 41
    if-eqz p1, :cond_1

    .line 42
    .line 43
    invoke-virtual {p0, v0}, Lhj/c$d;->l(C)Lhj/c$d;

    .line 44
    .line 45
    .line 46
    :cond_1
    sget-object p1, Lnet/time4j/g0;->I:Lnet/time4j/k0;

    .line 47
    .line 48
    invoke-virtual {p0, p1, v1}, Lhj/c$d;->g(Lfj/p;I)Lhj/c$d;

    .line 49
    .line 50
    .line 51
    sget-object p1, Lhj/l;->c:Lhj/l$c;

    .line 52
    .line 53
    invoke-virtual {p0, p1}, Lhj/c$d;->Y(Lfj/n;)Lhj/c$d;

    .line 54
    .line 55
    .line 56
    sget-char p1, Lhj/l;->a:C

    .line 57
    .line 58
    const/16 v0, 0x2e

    .line 59
    .line 60
    const/16 v1, 0x2c

    .line 61
    .line 62
    if-ne p1, v1, :cond_2

    .line 63
    .line 64
    invoke-virtual {p0, v1, v0}, Lhj/c$d;->m(CC)Lhj/c$d;

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_2
    invoke-virtual {p0, v0, v1}, Lhj/c$d;->m(CC)Lhj/c$d;

    .line 69
    .line 70
    .line 71
    :goto_0
    sget-object p1, Lnet/time4j/g0;->M:Lnet/time4j/k0;

    .line 72
    .line 73
    const/16 v0, 0x9

    .line 74
    .line 75
    const/4 v1, 0x0

    .line 76
    invoke-virtual {p0, p1, v1, v0, v1}, Lhj/c$d;->i(Lfj/p;IIZ)Lhj/c$d;

    .line 77
    .line 78
    .line 79
    :goto_1
    const/4 p1, 0x5

    .line 80
    if-ge v1, p1, :cond_3

    .line 81
    .line 82
    invoke-virtual {p0}, Lhj/c$d;->L()Lhj/c$d;

    .line 83
    .line 84
    .line 85
    add-int/lit8 v1, v1, 0x1

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_3
    return-void
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

.method private static b(Z)Lhj/c;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lhj/c<",
            "Lnet/time4j/f0;",
            ">;"
        }
    .end annotation

    .line 1
    const-class v0, Lnet/time4j/f0;

    .line 2
    .line 3
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lhj/c;->N(Ljava/lang/Class;Ljava/util/Locale;)Lhj/c$d;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, Lgj/a;->l:Lfj/c;

    .line 10
    .line 11
    sget-object v2, Lgj/j;->k:Lgj/j;

    .line 12
    .line 13
    invoke-virtual {v0, v1, v2}, Lhj/c$d;->b0(Lfj/c;Ljava/lang/Enum;)Lhj/c$d;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sget-object v1, Lgj/a;->m:Lfj/c;

    .line 18
    .line 19
    const/16 v2, 0x30

    .line 20
    .line 21
    invoke-virtual {v0, v1, v2}, Lhj/c$d;->Z(Lfj/c;C)Lhj/c$d;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sget-object v1, Lnet/time4j/f0;->z:Lnet/time4j/c;

    .line 26
    .line 27
    const/16 v2, 0x9

    .line 28
    .line 29
    sget-object v3, Lhj/x;->m:Lhj/x;

    .line 30
    .line 31
    const/4 v4, 0x4

    .line 32
    invoke-virtual {v0, v1, v4, v2, v3}, Lhj/c$d;->k(Lfj/p;IILhj/x;)Lhj/c$d;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    const/16 v1, 0x2d

    .line 37
    .line 38
    if-eqz p0, :cond_0

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Lhj/c$d;->l(C)Lhj/c$d;

    .line 41
    .line 42
    .line 43
    :cond_0
    sget-object v2, Lnet/time4j/f0;->D:Lnet/time4j/k0;

    .line 44
    .line 45
    const/4 v3, 0x2

    .line 46
    invoke-virtual {v0, v2, v3}, Lhj/c$d;->g(Lfj/p;I)Lhj/c$d;

    .line 47
    .line 48
    .line 49
    if-eqz p0, :cond_1

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Lhj/c$d;->l(C)Lhj/c$d;

    .line 52
    .line 53
    .line 54
    :cond_1
    sget-object p0, Lnet/time4j/f0;->E:Lnet/time4j/k0;

    .line 55
    .line 56
    invoke-virtual {v0, p0, v3}, Lhj/c$d;->g(Lfj/p;I)Lhj/c$d;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-virtual {p0}, Lhj/c$d;->L()Lhj/c$d;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-virtual {p0}, Lhj/c$d;->L()Lhj/c$d;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-virtual {p0}, Lhj/c$d;->F()Lhj/c;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    sget-object v0, Lgj/g;->k:Lgj/g;

    .line 73
    .line 74
    invoke-virtual {p0, v0}, Lhj/c;->S(Lgj/g;)Lhj/c;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    return-object p0
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

.method private static c(Z)Lhj/c;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lhj/c<",
            "Lnet/time4j/f0;",
            ">;"
        }
    .end annotation

    .line 1
    const-class v0, Lnet/time4j/f0;

    .line 2
    .line 3
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lhj/c;->N(Ljava/lang/Class;Ljava/util/Locale;)Lhj/c$d;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, Lnet/time4j/f0;->y:Lnet/time4j/e;

    .line 10
    .line 11
    invoke-static {p0}, Lhj/l;->e(Z)Lhj/e;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-static {p0}, Lhj/l;->d(Z)Lhj/d;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {v0, v1, v2, p0}, Lhj/c$d;->d(Lfj/p;Lhj/e;Lhj/d;)Lhj/c$d;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Lhj/c$d;->F()Lhj/c;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    sget-object v0, Lgj/g;->k:Lgj/g;

    .line 27
    .line 28
    invoke-virtual {p0, v0}, Lhj/c;->S(Lgj/g;)Lhj/c;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0
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
.end method

.method private static d(Z)Lhj/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lhj/d<",
            "Lnet/time4j/f0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lhj/l$b;

    invoke-direct {v0, p0}, Lhj/l$b;-><init>(Z)V

    return-object v0
.end method

.method private static e(Z)Lhj/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lhj/e<",
            "Lnet/time4j/f0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lhj/l$a;

    invoke-direct {v0, p0}, Lhj/l$a;-><init>(Z)V

    return-object v0
.end method

.method private static f(Lgj/e;Z)Lhj/c;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgj/e;",
            "Z)",
            "Lhj/c<",
            "Lnet/time4j/a0;",
            ">;"
        }
    .end annotation

    .line 1
    const-class v0, Lnet/time4j/a0;

    .line 2
    .line 3
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lhj/c;->N(Ljava/lang/Class;Ljava/util/Locale;)Lhj/c$d;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, Lnet/time4j/f0;->y:Lnet/time4j/e;

    .line 10
    .line 11
    invoke-static {p1}, Lhj/l;->e(Z)Lhj/e;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-static {p1}, Lhj/l;->d(Z)Lhj/d;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-virtual {v0, v1, v2, v3}, Lhj/c$d;->d(Lfj/p;Lhj/e;Lhj/d;)Lhj/c$d;

    .line 20
    .line 21
    .line 22
    const/16 v1, 0x54

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Lhj/c$d;->l(C)Lhj/c$d;

    .line 25
    .line 26
    .line 27
    invoke-static {v0, p1}, Lhj/l;->a(Lhj/c$d;Z)V

    .line 28
    .line 29
    .line 30
    const-string v1, "Z"

    .line 31
    .line 32
    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v0, p0, p1, v1}, Lhj/c$d;->C(Lgj/e;ZLjava/util/List;)Lhj/c$d;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Lhj/c$d;->F()Lhj/c;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
.end method

.method private static g(Z)Lhj/c;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lhj/c<",
            "Lnet/time4j/a0;",
            ">;"
        }
    .end annotation

    .line 1
    const-class v0, Lnet/time4j/a0;

    .line 2
    .line 3
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lhj/c;->N(Ljava/lang/Class;Ljava/util/Locale;)Lhj/c$d;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {}, Lnet/time4j/a0;->W()Lfj/h0;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, Lfj/h0;->J()Lfj/p;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    sget-object v2, Lgj/e;->n:Lgj/e;

    .line 18
    .line 19
    invoke-static {v2, p0}, Lhj/l;->f(Lgj/e;Z)Lhj/c;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    sget-object v3, Lgj/e;->o:Lgj/e;

    .line 24
    .line 25
    invoke-static {v3, p0}, Lhj/l;->f(Lgj/e;Z)Lhj/c;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {v0, v1, v2, p0}, Lhj/c$d;->d(Lfj/p;Lhj/e;Lhj/d;)Lhj/c$d;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Lhj/c$d;->F()Lhj/c;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    sget-object v0, Lgj/g;->k:Lgj/g;

    .line 37
    .line 38
    invoke-virtual {p0, v0}, Lhj/c;->S(Lgj/g;)Lhj/c;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    sget-object v0, Lnet/time4j/tz/p;->u:Lnet/time4j/tz/p;

    .line 43
    .line 44
    invoke-virtual {p0, v0}, Lhj/c;->V(Lnet/time4j/tz/k;)Lhj/c;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0
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

.method private static h(Z)Lhj/c;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lhj/c<",
            "Lnet/time4j/f0;",
            ">;"
        }
    .end annotation

    .line 1
    const-class v0, Lnet/time4j/f0;

    .line 2
    .line 3
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lhj/c;->N(Ljava/lang/Class;Ljava/util/Locale;)Lhj/c$d;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, Lgj/a;->l:Lfj/c;

    .line 10
    .line 11
    sget-object v2, Lgj/j;->k:Lgj/j;

    .line 12
    .line 13
    invoke-virtual {v0, v1, v2}, Lhj/c$d;->b0(Lfj/c;Ljava/lang/Enum;)Lhj/c$d;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sget-object v1, Lgj/a;->m:Lfj/c;

    .line 18
    .line 19
    const/16 v2, 0x30

    .line 20
    .line 21
    invoke-virtual {v0, v1, v2}, Lhj/c$d;->Z(Lfj/c;C)Lhj/c$d;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sget-object v1, Lnet/time4j/f0;->z:Lnet/time4j/c;

    .line 26
    .line 27
    const/16 v2, 0x9

    .line 28
    .line 29
    sget-object v3, Lhj/x;->m:Lhj/x;

    .line 30
    .line 31
    const/4 v4, 0x4

    .line 32
    invoke-virtual {v0, v1, v4, v2, v3}, Lhj/c$d;->k(Lfj/p;IILhj/x;)Lhj/c$d;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    if-eqz p0, :cond_0

    .line 37
    .line 38
    const/16 p0, 0x2d

    .line 39
    .line 40
    invoke-virtual {v0, p0}, Lhj/c$d;->l(C)Lhj/c$d;

    .line 41
    .line 42
    .line 43
    :cond_0
    sget-object p0, Lnet/time4j/f0;->G:Lnet/time4j/k0;

    .line 44
    .line 45
    const/4 v1, 0x3

    .line 46
    invoke-virtual {v0, p0, v1}, Lhj/c$d;->g(Lfj/p;I)Lhj/c$d;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-virtual {p0}, Lhj/c$d;->L()Lhj/c$d;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-virtual {p0}, Lhj/c$d;->L()Lhj/c$d;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-virtual {p0}, Lhj/c$d;->F()Lhj/c;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    sget-object v0, Lgj/g;->k:Lgj/g;

    .line 63
    .line 64
    invoke-virtual {p0, v0}, Lhj/c;->S(Lgj/g;)Lhj/c;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    return-object p0
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

.method public static i(Ljava/lang/CharSequence;)Lnet/time4j/f0;
    .locals 4

    .line 1
    new-instance v0, Lhj/s;

    .line 2
    .line 3
    invoke-direct {v0}, Lhj/s;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p0, v0}, Lhj/l;->j(Ljava/lang/CharSequence;Lhj/s;)Lnet/time4j/f0;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    invoke-virtual {v0}, Lhj/s;->i()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-nez v2, :cond_1

    .line 17
    .line 18
    invoke-virtual {v0}, Lhj/s;->f()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-lt v2, v3, :cond_0

    .line 27
    .line 28
    return-object v1

    .line 29
    :cond_0
    new-instance v1, Ljava/text/ParseException;

    .line 30
    .line 31
    new-instance v2, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 34
    .line 35
    .line 36
    const-string v3, "Trailing characters found: "

    .line 37
    .line 38
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-virtual {v0}, Lhj/s;->f()I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    invoke-direct {v1, p0, v0}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    .line 53
    .line 54
    .line 55
    throw v1

    .line 56
    :cond_1
    new-instance p0, Ljava/text/ParseException;

    .line 57
    .line 58
    invoke-virtual {v0}, Lhj/s;->d()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-virtual {v0}, Lhj/s;->c()I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    invoke-direct {p0, v1, v0}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    .line 67
    .line 68
    .line 69
    throw p0
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

.method public static j(Ljava/lang/CharSequence;Lhj/s;)Lnet/time4j/f0;
    .locals 8

    .line 1
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Lhj/s;->f()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    sub-int v2, v0, v1

    .line 10
    .line 11
    const/4 v3, 0x7

    .line 12
    if-ge v2, v3, :cond_0

    .line 13
    .line 14
    new-instance v2, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 17
    .line 18
    .line 19
    const-string v3, "Too short to be compatible with ISO-8601: "

    .line 20
    .line 21
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-interface {p0, v1, v0}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-virtual {p1, v0, p0}, Lhj/s;->k(ILjava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const/4 p0, 0x0

    .line 39
    return-object p0

    .line 40
    :cond_0
    add-int/lit8 v3, v1, 0x1

    .line 41
    .line 42
    const/4 v4, 0x0

    .line 43
    :goto_0
    const/16 v5, 0x2d

    .line 44
    .line 45
    if-ge v3, v0, :cond_5

    .line 46
    .line 47
    invoke-interface {p0, v3}, Ljava/lang/CharSequence;->charAt(I)C

    .line 48
    .line 49
    .line 50
    move-result v6

    .line 51
    if-eq v6, v5, :cond_4

    .line 52
    .line 53
    const/16 v7, 0x2f

    .line 54
    .line 55
    if-eq v6, v7, :cond_3

    .line 56
    .line 57
    const/16 v7, 0x54

    .line 58
    .line 59
    if-eq v6, v7, :cond_3

    .line 60
    .line 61
    const/16 v5, 0x57

    .line 62
    .line 63
    if-eq v6, v5, :cond_1

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_1
    if-lez v4, :cond_2

    .line 67
    .line 68
    sget-object v0, Lhj/l;->k:Lhj/c;

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_2
    sget-object v0, Lhj/l;->j:Lhj/c;

    .line 72
    .line 73
    :goto_1
    invoke-virtual {v0, p0, p1}, Lhj/c;->G(Ljava/lang/CharSequence;Lhj/s;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    check-cast p0, Lnet/time4j/f0;

    .line 78
    .line 79
    return-object p0

    .line 80
    :cond_3
    sub-int v2, v3, v1

    .line 81
    .line 82
    goto :goto_3

    .line 83
    :cond_4
    add-int/lit8 v4, v4, 0x1

    .line 84
    .line 85
    :goto_2
    add-int/lit8 v3, v3, 0x1

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_5
    :goto_3
    if-nez v4, :cond_9

    .line 89
    .line 90
    add-int/lit8 v2, v2, -0x4

    .line 91
    .line 92
    invoke-interface {p0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    const/16 v1, 0x2b

    .line 97
    .line 98
    if-eq v0, v1, :cond_6

    .line 99
    .line 100
    if-ne v0, v5, :cond_7

    .line 101
    .line 102
    :cond_6
    add-int/lit8 v2, v2, -0x2

    .line 103
    .line 104
    :cond_7
    const/4 v0, 0x3

    .line 105
    if-ne v2, v0, :cond_8

    .line 106
    .line 107
    sget-object v0, Lhj/l;->h:Lhj/c;

    .line 108
    .line 109
    goto :goto_4

    .line 110
    :cond_8
    sget-object v0, Lhj/l;->f:Lhj/c;

    .line 111
    .line 112
    :goto_4
    invoke-virtual {v0, p0, p1}, Lhj/c;->G(Ljava/lang/CharSequence;Lhj/s;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    check-cast p0, Lnet/time4j/f0;

    .line 117
    .line 118
    return-object p0

    .line 119
    :cond_9
    const/4 v0, 0x1

    .line 120
    if-ne v4, v0, :cond_a

    .line 121
    .line 122
    sget-object v0, Lhj/l;->i:Lhj/c;

    .line 123
    .line 124
    invoke-virtual {v0, p0, p1}, Lhj/c;->G(Ljava/lang/CharSequence;Lhj/s;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    check-cast p0, Lnet/time4j/f0;

    .line 129
    .line 130
    return-object p0

    .line 131
    :cond_a
    sget-object v0, Lhj/l;->g:Lhj/c;

    .line 132
    .line 133
    invoke-virtual {v0, p0, p1}, Lhj/c;->G(Ljava/lang/CharSequence;Lhj/s;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    check-cast p0, Lnet/time4j/f0;

    .line 138
    .line 139
    return-object p0
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

.method private static k(Z)Lhj/c;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lhj/c<",
            "Lnet/time4j/g0;",
            ">;"
        }
    .end annotation

    .line 1
    const-class v0, Lnet/time4j/g0;

    .line 2
    .line 3
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lhj/c;->N(Ljava/lang/Class;Ljava/util/Locale;)Lhj/c$d;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, Lhj/l;->e:Lfj/n;

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    invoke-virtual {v0, v1, v2}, Lhj/c$d;->W(Lfj/n;I)Lhj/c$d;

    .line 13
    .line 14
    .line 15
    invoke-static {v0, p0}, Lhj/l;->a(Lhj/c$d;Z)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Lhj/c$d;->F()Lhj/c;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    sget-object v0, Lgj/g;->k:Lgj/g;

    .line 23
    .line 24
    invoke-virtual {p0, v0}, Lhj/c;->S(Lgj/g;)Lhj/c;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
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
.end method

.method private static l(Z)Lhj/c;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lhj/c<",
            "Lnet/time4j/h0;",
            ">;"
        }
    .end annotation

    .line 1
    const-class v0, Lnet/time4j/h0;

    .line 2
    .line 3
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lhj/c;->N(Ljava/lang/Class;Ljava/util/Locale;)Lhj/c$d;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, Lnet/time4j/f0;->y:Lnet/time4j/e;

    .line 10
    .line 11
    invoke-static {p0}, Lhj/l;->e(Z)Lhj/e;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-static {p0}, Lhj/l;->d(Z)Lhj/d;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-virtual {v0, v1, v2, v3}, Lhj/c$d;->d(Lfj/p;Lhj/e;Lhj/d;)Lhj/c$d;

    .line 20
    .line 21
    .line 22
    const/16 v1, 0x54

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Lhj/c$d;->l(C)Lhj/c$d;

    .line 25
    .line 26
    .line 27
    invoke-static {v0, p0}, Lhj/l;->a(Lhj/c$d;Z)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Lhj/c$d;->F()Lhj/c;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    sget-object v0, Lgj/g;->k:Lgj/g;

    .line 35
    .line 36
    invoke-virtual {p0, v0}, Lhj/c;->S(Lgj/g;)Lhj/c;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0
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

.method private static m(Z)Lhj/c;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lhj/c<",
            "Lnet/time4j/f0;",
            ">;"
        }
    .end annotation

    .line 1
    const-class v0, Lnet/time4j/f0;

    .line 2
    .line 3
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lhj/c;->N(Ljava/lang/Class;Ljava/util/Locale;)Lhj/c$d;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, Lgj/a;->l:Lfj/c;

    .line 10
    .line 11
    sget-object v2, Lgj/j;->k:Lgj/j;

    .line 12
    .line 13
    invoke-virtual {v0, v1, v2}, Lhj/c$d;->b0(Lfj/c;Ljava/lang/Enum;)Lhj/c$d;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sget-object v1, Lgj/a;->m:Lfj/c;

    .line 18
    .line 19
    const/16 v2, 0x30

    .line 20
    .line 21
    invoke-virtual {v0, v1, v2}, Lhj/c$d;->Z(Lfj/c;C)Lhj/c$d;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sget-object v1, Lnet/time4j/f0;->A:Lnet/time4j/c;

    .line 26
    .line 27
    const/16 v2, 0x9

    .line 28
    .line 29
    sget-object v3, Lhj/x;->m:Lhj/x;

    .line 30
    .line 31
    const/4 v4, 0x4

    .line 32
    invoke-virtual {v0, v1, v4, v2, v3}, Lhj/c$d;->k(Lfj/p;IILhj/x;)Lhj/c$d;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    const/16 v1, 0x2d

    .line 37
    .line 38
    if-eqz p0, :cond_0

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Lhj/c$d;->l(C)Lhj/c$d;

    .line 41
    .line 42
    .line 43
    :cond_0
    const/16 v2, 0x57

    .line 44
    .line 45
    invoke-virtual {v0, v2}, Lhj/c$d;->l(C)Lhj/c$d;

    .line 46
    .line 47
    .line 48
    sget-object v2, Lnet/time4j/z0;->w:Lnet/time4j/z0;

    .line 49
    .line 50
    invoke-virtual {v2}, Lnet/time4j/z0;->n()Lnet/time4j/c;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    const/4 v3, 0x2

    .line 55
    invoke-virtual {v0, v2, v3}, Lhj/c$d;->g(Lfj/p;I)Lhj/c$d;

    .line 56
    .line 57
    .line 58
    if-eqz p0, :cond_1

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Lhj/c$d;->l(C)Lhj/c$d;

    .line 61
    .line 62
    .line 63
    :cond_1
    sget-object p0, Lnet/time4j/f0;->F:Lnet/time4j/c0;

    .line 64
    .line 65
    const/4 v1, 0x1

    .line 66
    invoke-virtual {v0, p0, v1}, Lhj/c$d;->h(Lfj/p;I)Lhj/c$d;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-virtual {p0}, Lhj/c$d;->L()Lhj/c$d;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-virtual {p0}, Lhj/c$d;->L()Lhj/c$d;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    invoke-virtual {p0}, Lhj/c$d;->F()Lhj/c;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    sget-object v0, Lgj/g;->k:Lgj/g;

    .line 83
    .line 84
    invoke-virtual {p0, v0}, Lhj/c;->S(Lgj/g;)Lhj/c;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    return-object p0
    .line 89
    .line 90
.end method
