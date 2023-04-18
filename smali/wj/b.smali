.class public final enum Lwj/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lwj/b$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lwj/b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0008\n\u0002\u0008\u0017\u0008\u0086\u0001\u0018\u0000 \n2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\u0011\u0008\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0005\u0010\u0006j\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014j\u0002\u0008\u0015j\u0002\u0008\u0016j\u0002\u0008\u0017j\u0002\u0008\u0018\u00a8\u0006\u0019"
    }
    d2 = {
        "Lwj/b;",
        "",
        "",
        "k",
        "I",
        "a",
        "()I",
        "httpCode",
        "<init>",
        "(Ljava/lang/String;II)V",
        "A",
        "l",
        "m",
        "n",
        "o",
        "p",
        "q",
        "r",
        "s",
        "t",
        "u",
        "v",
        "w",
        "x",
        "y",
        "okhttp"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# static fields
.field public static final A:Lwj/b$a;

.field public static final enum l:Lwj/b;

.field public static final enum m:Lwj/b;

.field public static final enum n:Lwj/b;

.field public static final enum o:Lwj/b;

.field public static final enum p:Lwj/b;

.field public static final enum q:Lwj/b;

.field public static final enum r:Lwj/b;

.field public static final enum s:Lwj/b;

.field public static final enum t:Lwj/b;

.field public static final enum u:Lwj/b;

.field public static final enum v:Lwj/b;

.field public static final enum w:Lwj/b;

.field public static final enum x:Lwj/b;

.field public static final enum y:Lwj/b;

.field private static final synthetic z:[Lwj/b;


# instance fields
.field private final k:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const/16 v0, 0xe

    .line 2
    .line 3
    new-array v0, v0, [Lwj/b;

    .line 4
    .line 5
    new-instance v1, Lwj/b;

    .line 6
    .line 7
    const-string v2, "NO_ERROR"

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-direct {v1, v2, v3, v3}, Lwj/b;-><init>(Ljava/lang/String;II)V

    .line 11
    .line 12
    .line 13
    sput-object v1, Lwj/b;->l:Lwj/b;

    .line 14
    .line 15
    aput-object v1, v0, v3

    .line 16
    .line 17
    new-instance v1, Lwj/b;

    .line 18
    .line 19
    const-string v2, "PROTOCOL_ERROR"

    .line 20
    .line 21
    const/4 v3, 0x1

    .line 22
    invoke-direct {v1, v2, v3, v3}, Lwj/b;-><init>(Ljava/lang/String;II)V

    .line 23
    .line 24
    .line 25
    sput-object v1, Lwj/b;->m:Lwj/b;

    .line 26
    .line 27
    aput-object v1, v0, v3

    .line 28
    .line 29
    new-instance v1, Lwj/b;

    .line 30
    .line 31
    const-string v2, "INTERNAL_ERROR"

    .line 32
    .line 33
    const/4 v3, 0x2

    .line 34
    invoke-direct {v1, v2, v3, v3}, Lwj/b;-><init>(Ljava/lang/String;II)V

    .line 35
    .line 36
    .line 37
    sput-object v1, Lwj/b;->n:Lwj/b;

    .line 38
    .line 39
    aput-object v1, v0, v3

    .line 40
    .line 41
    new-instance v1, Lwj/b;

    .line 42
    .line 43
    const-string v2, "FLOW_CONTROL_ERROR"

    .line 44
    .line 45
    const/4 v3, 0x3

    .line 46
    invoke-direct {v1, v2, v3, v3}, Lwj/b;-><init>(Ljava/lang/String;II)V

    .line 47
    .line 48
    .line 49
    sput-object v1, Lwj/b;->o:Lwj/b;

    .line 50
    .line 51
    aput-object v1, v0, v3

    .line 52
    .line 53
    new-instance v1, Lwj/b;

    .line 54
    .line 55
    const-string v2, "SETTINGS_TIMEOUT"

    .line 56
    .line 57
    const/4 v3, 0x4

    .line 58
    invoke-direct {v1, v2, v3, v3}, Lwj/b;-><init>(Ljava/lang/String;II)V

    .line 59
    .line 60
    .line 61
    sput-object v1, Lwj/b;->p:Lwj/b;

    .line 62
    .line 63
    aput-object v1, v0, v3

    .line 64
    .line 65
    new-instance v1, Lwj/b;

    .line 66
    .line 67
    const-string v2, "STREAM_CLOSED"

    .line 68
    .line 69
    const/4 v3, 0x5

    .line 70
    invoke-direct {v1, v2, v3, v3}, Lwj/b;-><init>(Ljava/lang/String;II)V

    .line 71
    .line 72
    .line 73
    sput-object v1, Lwj/b;->q:Lwj/b;

    .line 74
    .line 75
    aput-object v1, v0, v3

    .line 76
    .line 77
    new-instance v1, Lwj/b;

    .line 78
    .line 79
    const-string v2, "FRAME_SIZE_ERROR"

    .line 80
    .line 81
    const/4 v3, 0x6

    .line 82
    invoke-direct {v1, v2, v3, v3}, Lwj/b;-><init>(Ljava/lang/String;II)V

    .line 83
    .line 84
    .line 85
    sput-object v1, Lwj/b;->r:Lwj/b;

    .line 86
    .line 87
    aput-object v1, v0, v3

    .line 88
    .line 89
    new-instance v1, Lwj/b;

    .line 90
    .line 91
    const-string v2, "REFUSED_STREAM"

    .line 92
    .line 93
    const/4 v3, 0x7

    .line 94
    invoke-direct {v1, v2, v3, v3}, Lwj/b;-><init>(Ljava/lang/String;II)V

    .line 95
    .line 96
    .line 97
    sput-object v1, Lwj/b;->s:Lwj/b;

    .line 98
    .line 99
    aput-object v1, v0, v3

    .line 100
    .line 101
    new-instance v1, Lwj/b;

    .line 102
    .line 103
    const-string v2, "CANCEL"

    .line 104
    .line 105
    const/16 v3, 0x8

    .line 106
    .line 107
    invoke-direct {v1, v2, v3, v3}, Lwj/b;-><init>(Ljava/lang/String;II)V

    .line 108
    .line 109
    .line 110
    sput-object v1, Lwj/b;->t:Lwj/b;

    .line 111
    .line 112
    aput-object v1, v0, v3

    .line 113
    .line 114
    new-instance v1, Lwj/b;

    .line 115
    .line 116
    const-string v2, "COMPRESSION_ERROR"

    .line 117
    .line 118
    const/16 v3, 0x9

    .line 119
    .line 120
    invoke-direct {v1, v2, v3, v3}, Lwj/b;-><init>(Ljava/lang/String;II)V

    .line 121
    .line 122
    .line 123
    sput-object v1, Lwj/b;->u:Lwj/b;

    .line 124
    .line 125
    aput-object v1, v0, v3

    .line 126
    .line 127
    new-instance v1, Lwj/b;

    .line 128
    .line 129
    const-string v2, "CONNECT_ERROR"

    .line 130
    .line 131
    const/16 v3, 0xa

    .line 132
    .line 133
    invoke-direct {v1, v2, v3, v3}, Lwj/b;-><init>(Ljava/lang/String;II)V

    .line 134
    .line 135
    .line 136
    sput-object v1, Lwj/b;->v:Lwj/b;

    .line 137
    .line 138
    aput-object v1, v0, v3

    .line 139
    .line 140
    new-instance v1, Lwj/b;

    .line 141
    .line 142
    const-string v2, "ENHANCE_YOUR_CALM"

    .line 143
    .line 144
    const/16 v3, 0xb

    .line 145
    .line 146
    invoke-direct {v1, v2, v3, v3}, Lwj/b;-><init>(Ljava/lang/String;II)V

    .line 147
    .line 148
    .line 149
    sput-object v1, Lwj/b;->w:Lwj/b;

    .line 150
    .line 151
    aput-object v1, v0, v3

    .line 152
    .line 153
    new-instance v1, Lwj/b;

    .line 154
    .line 155
    const-string v2, "INADEQUATE_SECURITY"

    .line 156
    .line 157
    const/16 v3, 0xc

    .line 158
    .line 159
    invoke-direct {v1, v2, v3, v3}, Lwj/b;-><init>(Ljava/lang/String;II)V

    .line 160
    .line 161
    .line 162
    sput-object v1, Lwj/b;->x:Lwj/b;

    .line 163
    .line 164
    aput-object v1, v0, v3

    .line 165
    .line 166
    new-instance v1, Lwj/b;

    .line 167
    .line 168
    const-string v2, "HTTP_1_1_REQUIRED"

    .line 169
    .line 170
    const/16 v3, 0xd

    .line 171
    .line 172
    invoke-direct {v1, v2, v3, v3}, Lwj/b;-><init>(Ljava/lang/String;II)V

    .line 173
    .line 174
    .line 175
    sput-object v1, Lwj/b;->y:Lwj/b;

    .line 176
    .line 177
    aput-object v1, v0, v3

    .line 178
    .line 179
    sput-object v0, Lwj/b;->z:[Lwj/b;

    .line 180
    .line 181
    new-instance v0, Lwj/b$a;

    .line 182
    .line 183
    const/4 v1, 0x0

    .line 184
    invoke-direct {v0, v1}, Lwj/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 185
    .line 186
    .line 187
    sput-object v0, Lwj/b;->A:Lwj/b$a;

    .line 188
    .line 189
    return-void
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

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lwj/b;->k:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lwj/b;
    .locals 1

    const-class v0, Lwj/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lwj/b;

    return-object p0
.end method

.method public static values()[Lwj/b;
    .locals 1

    sget-object v0, Lwj/b;->z:[Lwj/b;

    invoke-virtual {v0}, [Lwj/b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lwj/b;

    return-object v0
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lwj/b;->k:I

    return v0
.end method
