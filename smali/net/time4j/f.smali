.class public abstract enum Lnet/time4j/f;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lnet/time4j/u;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/time4j/f$j;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/time4j/f;",
        ">;",
        "Lnet/time4j/u;"
    }
.end annotation


# static fields
.field public static final enum k:Lnet/time4j/f;

.field public static final enum l:Lnet/time4j/f;

.field public static final enum m:Lnet/time4j/f;

.field public static final enum n:Lnet/time4j/f;

.field public static final enum o:Lnet/time4j/f;

.field public static final enum p:Lnet/time4j/f;

.field public static final enum q:Lnet/time4j/f;

.field public static final enum r:Lnet/time4j/f;

.field private static final synthetic s:[Lnet/time4j/f;


# instance fields
.field private final co:Lnet/time4j/u;

.field private final eof:Lnet/time4j/u;

.field private final joda:Lnet/time4j/u;

.field private final kld:Lnet/time4j/u;

.field private final nvd:Lnet/time4j/u;

.field private final ui:Lnet/time4j/u;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    .line 1
    new-instance v0, Lnet/time4j/f$a;

    .line 2
    .line 3
    const-string v1, "MILLENNIA"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lnet/time4j/f$a;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lnet/time4j/f;->k:Lnet/time4j/f;

    .line 10
    .line 11
    new-instance v1, Lnet/time4j/f$b;

    .line 12
    .line 13
    const-string v3, "CENTURIES"

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    invoke-direct {v1, v3, v4}, Lnet/time4j/f$b;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lnet/time4j/f;->l:Lnet/time4j/f;

    .line 20
    .line 21
    new-instance v3, Lnet/time4j/f$c;

    .line 22
    .line 23
    const-string v5, "DECADES"

    .line 24
    .line 25
    const/4 v6, 0x2

    .line 26
    invoke-direct {v3, v5, v6}, Lnet/time4j/f$c;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v3, Lnet/time4j/f;->m:Lnet/time4j/f;

    .line 30
    .line 31
    new-instance v5, Lnet/time4j/f$d;

    .line 32
    .line 33
    const-string v7, "YEARS"

    .line 34
    .line 35
    const/4 v8, 0x3

    .line 36
    invoke-direct {v5, v7, v8}, Lnet/time4j/f$d;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v5, Lnet/time4j/f;->n:Lnet/time4j/f;

    .line 40
    .line 41
    new-instance v7, Lnet/time4j/f$e;

    .line 42
    .line 43
    const-string v9, "QUARTERS"

    .line 44
    .line 45
    const/4 v10, 0x4

    .line 46
    invoke-direct {v7, v9, v10}, Lnet/time4j/f$e;-><init>(Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    sput-object v7, Lnet/time4j/f;->o:Lnet/time4j/f;

    .line 50
    .line 51
    new-instance v9, Lnet/time4j/f$f;

    .line 52
    .line 53
    const-string v11, "MONTHS"

    .line 54
    .line 55
    const/4 v12, 0x5

    .line 56
    invoke-direct {v9, v11, v12}, Lnet/time4j/f$f;-><init>(Ljava/lang/String;I)V

    .line 57
    .line 58
    .line 59
    sput-object v9, Lnet/time4j/f;->p:Lnet/time4j/f;

    .line 60
    .line 61
    new-instance v11, Lnet/time4j/f$g;

    .line 62
    .line 63
    const-string v13, "WEEKS"

    .line 64
    .line 65
    const/4 v14, 0x6

    .line 66
    invoke-direct {v11, v13, v14}, Lnet/time4j/f$g;-><init>(Ljava/lang/String;I)V

    .line 67
    .line 68
    .line 69
    sput-object v11, Lnet/time4j/f;->q:Lnet/time4j/f;

    .line 70
    .line 71
    new-instance v13, Lnet/time4j/f$h;

    .line 72
    .line 73
    const-string v15, "DAYS"

    .line 74
    .line 75
    const/4 v14, 0x7

    .line 76
    invoke-direct {v13, v15, v14}, Lnet/time4j/f$h;-><init>(Ljava/lang/String;I)V

    .line 77
    .line 78
    .line 79
    sput-object v13, Lnet/time4j/f;->r:Lnet/time4j/f;

    .line 80
    .line 81
    const/16 v15, 0x8

    .line 82
    .line 83
    new-array v15, v15, [Lnet/time4j/f;

    .line 84
    .line 85
    aput-object v0, v15, v2

    .line 86
    .line 87
    aput-object v1, v15, v4

    .line 88
    .line 89
    aput-object v3, v15, v6

    .line 90
    .line 91
    aput-object v5, v15, v8

    .line 92
    .line 93
    aput-object v7, v15, v10

    .line 94
    .line 95
    aput-object v9, v15, v12

    .line 96
    .line 97
    const/4 v0, 0x6

    .line 98
    aput-object v11, v15, v0

    .line 99
    .line 100
    aput-object v13, v15, v14

    .line 101
    .line 102
    sput-object v15, Lnet/time4j/f;->s:[Lnet/time4j/f;

    .line 103
    .line 104
    return-void
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

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    new-instance p1, Lnet/time4j/e0;

    const/4 p2, 0x2

    invoke-direct {p1, p0, p2}, Lnet/time4j/e0;-><init>(Lnet/time4j/f;I)V

    iput-object p1, p0, Lnet/time4j/f;->eof:Lnet/time4j/u;

    .line 3
    new-instance p1, Lnet/time4j/e0;

    const/4 p2, 0x5

    invoke-direct {p1, p0, p2}, Lnet/time4j/e0;-><init>(Lnet/time4j/f;I)V

    iput-object p1, p0, Lnet/time4j/f;->kld:Lnet/time4j/u;

    .line 4
    new-instance p1, Lnet/time4j/e0;

    const/4 p2, 0x4

    invoke-direct {p1, p0, p2}, Lnet/time4j/e0;-><init>(Lnet/time4j/f;I)V

    iput-object p1, p0, Lnet/time4j/f;->ui:Lnet/time4j/u;

    .line 5
    new-instance p1, Lnet/time4j/e0;

    const/4 p2, 0x1

    invoke-direct {p1, p0, p2}, Lnet/time4j/e0;-><init>(Lnet/time4j/f;I)V

    iput-object p1, p0, Lnet/time4j/f;->nvd:Lnet/time4j/u;

    .line 6
    new-instance p1, Lnet/time4j/e0;

    const/4 p2, 0x3

    invoke-direct {p1, p0, p2}, Lnet/time4j/e0;-><init>(Lnet/time4j/f;I)V

    iput-object p1, p0, Lnet/time4j/f;->co:Lnet/time4j/u;

    .line 7
    new-instance p1, Lnet/time4j/e0;

    const/4 p2, 0x6

    invoke-direct {p1, p0, p2}, Lnet/time4j/e0;-><init>(Lnet/time4j/f;I)V

    iput-object p1, p0, Lnet/time4j/f;->joda:Lnet/time4j/u;

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;ILnet/time4j/f$a;)V
    .locals 0

    .line 8
    invoke-direct {p0, p1, p2}, Lnet/time4j/f;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static e()Lnet/time4j/u;
    .locals 1

    sget-object v0, Lnet/time4j/w0;->k:Lnet/time4j/w0;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/time4j/f;
    .locals 1

    const-class v0, Lnet/time4j/f;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lnet/time4j/f;

    return-object p0
.end method

.method public static values()[Lnet/time4j/f;
    .locals 1

    sget-object v0, Lnet/time4j/f;->s:[Lnet/time4j/f;

    invoke-virtual {v0}, [Lnet/time4j/f;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lnet/time4j/f;

    return-object v0
.end method


# virtual methods
.method public a()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public c(Lfj/k0;Lfj/k0;)J
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lfj/k0<",
            "-",
            "Lnet/time4j/f;",
            "TT;>;>(TT;TT;)J"
        }
    .end annotation

    invoke-virtual {p1, p2, p0}, Lfj/k0;->N(Lfj/k0;Ljava/lang/Object;)J

    move-result-wide p1

    return-wide p1
.end method
