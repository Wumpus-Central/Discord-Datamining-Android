.class public final enum Lug/d;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lug/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lug/d;",
        ">;",
        "Lug/b;"
    }
.end annotation


# static fields
.field public static final enum A:Lug/d;

.field public static final enum B:Lug/d;

.field public static final enum C:Lug/d;

.field public static final enum D:Lug/d;

.field public static final enum E:Lug/d;

.field public static final enum F:Lug/d;

.field public static final enum G:Lug/d;

.field private static final synthetic H:[Lug/d;

.field public static final enum k:Lug/d;

.field public static final enum l:Lug/d;

.field public static final enum m:Lug/d;

.field public static final enum n:Lug/d;

.field public static final enum o:Lug/d;

.field public static final enum p:Lug/d;

.field public static final enum q:Lug/d;

.field public static final enum r:Lug/d;

.field public static final enum s:Lug/d;

.field public static final enum t:Lug/d;

.field public static final enum u:Lug/d;

.field public static final enum v:Lug/d;

.field public static final enum w:Lug/d;

.field public static final enum x:Lug/d;

.field public static final enum y:Lug/d;

.field public static final enum z:Lug/d;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lug/d;

    .line 2
    .line 3
    const-string v1, "FROM_IDE"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lug/d;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lug/d;->k:Lug/d;

    .line 10
    .line 11
    new-instance v0, Lug/d;

    .line 12
    .line 13
    const-string v1, "FROM_BACKEND"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, Lug/d;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lug/d;->l:Lug/d;

    .line 20
    .line 21
    new-instance v0, Lug/d;

    .line 22
    .line 23
    const-string v1, "FROM_TEST"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2}, Lug/d;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lug/d;->m:Lug/d;

    .line 30
    .line 31
    new-instance v0, Lug/d;

    .line 32
    .line 33
    const-string v1, "FROM_BUILTINS"

    .line 34
    .line 35
    const/4 v2, 0x3

    .line 36
    invoke-direct {v0, v1, v2}, Lug/d;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lug/d;->n:Lug/d;

    .line 40
    .line 41
    new-instance v0, Lug/d;

    .line 42
    .line 43
    const-string v1, "WHEN_CHECK_DECLARATION_CONFLICTS"

    .line 44
    .line 45
    const/4 v2, 0x4

    .line 46
    invoke-direct {v0, v1, v2}, Lug/d;-><init>(Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    sput-object v0, Lug/d;->o:Lug/d;

    .line 50
    .line 51
    new-instance v0, Lug/d;

    .line 52
    .line 53
    const-string v1, "WHEN_CHECK_OVERRIDES"

    .line 54
    .line 55
    const/4 v2, 0x5

    .line 56
    invoke-direct {v0, v1, v2}, Lug/d;-><init>(Ljava/lang/String;I)V

    .line 57
    .line 58
    .line 59
    sput-object v0, Lug/d;->p:Lug/d;

    .line 60
    .line 61
    new-instance v0, Lug/d;

    .line 62
    .line 63
    const-string v1, "FOR_SCRIPT"

    .line 64
    .line 65
    const/4 v2, 0x6

    .line 66
    invoke-direct {v0, v1, v2}, Lug/d;-><init>(Ljava/lang/String;I)V

    .line 67
    .line 68
    .line 69
    sput-object v0, Lug/d;->q:Lug/d;

    .line 70
    .line 71
    new-instance v0, Lug/d;

    .line 72
    .line 73
    const-string v1, "FROM_REFLECTION"

    .line 74
    .line 75
    const/4 v2, 0x7

    .line 76
    invoke-direct {v0, v1, v2}, Lug/d;-><init>(Ljava/lang/String;I)V

    .line 77
    .line 78
    .line 79
    sput-object v0, Lug/d;->r:Lug/d;

    .line 80
    .line 81
    new-instance v0, Lug/d;

    .line 82
    .line 83
    const-string v1, "WHEN_RESOLVE_DECLARATION"

    .line 84
    .line 85
    const/16 v2, 0x8

    .line 86
    .line 87
    invoke-direct {v0, v1, v2}, Lug/d;-><init>(Ljava/lang/String;I)V

    .line 88
    .line 89
    .line 90
    sput-object v0, Lug/d;->s:Lug/d;

    .line 91
    .line 92
    new-instance v0, Lug/d;

    .line 93
    .line 94
    const-string v1, "WHEN_GET_DECLARATION_SCOPE"

    .line 95
    .line 96
    const/16 v2, 0x9

    .line 97
    .line 98
    invoke-direct {v0, v1, v2}, Lug/d;-><init>(Ljava/lang/String;I)V

    .line 99
    .line 100
    .line 101
    sput-object v0, Lug/d;->t:Lug/d;

    .line 102
    .line 103
    new-instance v0, Lug/d;

    .line 104
    .line 105
    const-string v1, "WHEN_RESOLVING_DEFAULT_TYPE_ARGUMENTS"

    .line 106
    .line 107
    const/16 v2, 0xa

    .line 108
    .line 109
    invoke-direct {v0, v1, v2}, Lug/d;-><init>(Ljava/lang/String;I)V

    .line 110
    .line 111
    .line 112
    sput-object v0, Lug/d;->u:Lug/d;

    .line 113
    .line 114
    new-instance v0, Lug/d;

    .line 115
    .line 116
    const-string v1, "FOR_ALREADY_TRACKED"

    .line 117
    .line 118
    const/16 v2, 0xb

    .line 119
    .line 120
    invoke-direct {v0, v1, v2}, Lug/d;-><init>(Ljava/lang/String;I)V

    .line 121
    .line 122
    .line 123
    sput-object v0, Lug/d;->v:Lug/d;

    .line 124
    .line 125
    new-instance v0, Lug/d;

    .line 126
    .line 127
    const-string v1, "WHEN_GET_ALL_DESCRIPTORS"

    .line 128
    .line 129
    const/16 v2, 0xc

    .line 130
    .line 131
    invoke-direct {v0, v1, v2}, Lug/d;-><init>(Ljava/lang/String;I)V

    .line 132
    .line 133
    .line 134
    sput-object v0, Lug/d;->w:Lug/d;

    .line 135
    .line 136
    new-instance v0, Lug/d;

    .line 137
    .line 138
    const-string v1, "WHEN_TYPING"

    .line 139
    .line 140
    const/16 v2, 0xd

    .line 141
    .line 142
    invoke-direct {v0, v1, v2}, Lug/d;-><init>(Ljava/lang/String;I)V

    .line 143
    .line 144
    .line 145
    sput-object v0, Lug/d;->x:Lug/d;

    .line 146
    .line 147
    new-instance v0, Lug/d;

    .line 148
    .line 149
    const-string v1, "WHEN_GET_SUPER_MEMBERS"

    .line 150
    .line 151
    const/16 v2, 0xe

    .line 152
    .line 153
    invoke-direct {v0, v1, v2}, Lug/d;-><init>(Ljava/lang/String;I)V

    .line 154
    .line 155
    .line 156
    sput-object v0, Lug/d;->y:Lug/d;

    .line 157
    .line 158
    new-instance v0, Lug/d;

    .line 159
    .line 160
    const-string v1, "FOR_NON_TRACKED_SCOPE"

    .line 161
    .line 162
    const/16 v2, 0xf

    .line 163
    .line 164
    invoke-direct {v0, v1, v2}, Lug/d;-><init>(Ljava/lang/String;I)V

    .line 165
    .line 166
    .line 167
    sput-object v0, Lug/d;->z:Lug/d;

    .line 168
    .line 169
    new-instance v0, Lug/d;

    .line 170
    .line 171
    const-string v1, "FROM_SYNTHETIC_SCOPE"

    .line 172
    .line 173
    const/16 v2, 0x10

    .line 174
    .line 175
    invoke-direct {v0, v1, v2}, Lug/d;-><init>(Ljava/lang/String;I)V

    .line 176
    .line 177
    .line 178
    sput-object v0, Lug/d;->A:Lug/d;

    .line 179
    .line 180
    new-instance v0, Lug/d;

    .line 181
    .line 182
    const-string v1, "FROM_DESERIALIZATION"

    .line 183
    .line 184
    const/16 v2, 0x11

    .line 185
    .line 186
    invoke-direct {v0, v1, v2}, Lug/d;-><init>(Ljava/lang/String;I)V

    .line 187
    .line 188
    .line 189
    sput-object v0, Lug/d;->B:Lug/d;

    .line 190
    .line 191
    new-instance v0, Lug/d;

    .line 192
    .line 193
    const-string v1, "FROM_JAVA_LOADER"

    .line 194
    .line 195
    const/16 v2, 0x12

    .line 196
    .line 197
    invoke-direct {v0, v1, v2}, Lug/d;-><init>(Ljava/lang/String;I)V

    .line 198
    .line 199
    .line 200
    sput-object v0, Lug/d;->C:Lug/d;

    .line 201
    .line 202
    new-instance v0, Lug/d;

    .line 203
    .line 204
    const-string v1, "WHEN_GET_LOCAL_VARIABLE"

    .line 205
    .line 206
    const/16 v2, 0x13

    .line 207
    .line 208
    invoke-direct {v0, v1, v2}, Lug/d;-><init>(Ljava/lang/String;I)V

    .line 209
    .line 210
    .line 211
    sput-object v0, Lug/d;->D:Lug/d;

    .line 212
    .line 213
    new-instance v0, Lug/d;

    .line 214
    .line 215
    const-string v1, "WHEN_FIND_BY_FQNAME"

    .line 216
    .line 217
    const/16 v2, 0x14

    .line 218
    .line 219
    invoke-direct {v0, v1, v2}, Lug/d;-><init>(Ljava/lang/String;I)V

    .line 220
    .line 221
    .line 222
    sput-object v0, Lug/d;->E:Lug/d;

    .line 223
    .line 224
    new-instance v0, Lug/d;

    .line 225
    .line 226
    const-string v1, "WHEN_GET_COMPANION_OBJECT"

    .line 227
    .line 228
    const/16 v2, 0x15

    .line 229
    .line 230
    invoke-direct {v0, v1, v2}, Lug/d;-><init>(Ljava/lang/String;I)V

    .line 231
    .line 232
    .line 233
    sput-object v0, Lug/d;->F:Lug/d;

    .line 234
    .line 235
    new-instance v0, Lug/d;

    .line 236
    .line 237
    const-string v1, "FOR_DEFAULT_IMPORTS"

    .line 238
    .line 239
    const/16 v2, 0x16

    .line 240
    .line 241
    invoke-direct {v0, v1, v2}, Lug/d;-><init>(Ljava/lang/String;I)V

    .line 242
    .line 243
    .line 244
    sput-object v0, Lug/d;->G:Lug/d;

    .line 245
    .line 246
    invoke-static {}, Lug/d;->b()[Lug/d;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    sput-object v0, Lug/d;->H:[Lug/d;

    .line 251
    .line 252
    return-void
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

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic b()[Lug/d;
    .locals 3

    const/16 v0, 0x17

    new-array v0, v0, [Lug/d;

    const/4 v1, 0x0

    sget-object v2, Lug/d;->k:Lug/d;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lug/d;->l:Lug/d;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lug/d;->m:Lug/d;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lug/d;->n:Lug/d;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lug/d;->o:Lug/d;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lug/d;->p:Lug/d;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lug/d;->q:Lug/d;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lug/d;->r:Lug/d;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lug/d;->s:Lug/d;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    sget-object v2, Lug/d;->t:Lug/d;

    aput-object v2, v0, v1

    const/16 v1, 0xa

    sget-object v2, Lug/d;->u:Lug/d;

    aput-object v2, v0, v1

    const/16 v1, 0xb

    sget-object v2, Lug/d;->v:Lug/d;

    aput-object v2, v0, v1

    const/16 v1, 0xc

    sget-object v2, Lug/d;->w:Lug/d;

    aput-object v2, v0, v1

    const/16 v1, 0xd

    sget-object v2, Lug/d;->x:Lug/d;

    aput-object v2, v0, v1

    const/16 v1, 0xe

    sget-object v2, Lug/d;->y:Lug/d;

    aput-object v2, v0, v1

    const/16 v1, 0xf

    sget-object v2, Lug/d;->z:Lug/d;

    aput-object v2, v0, v1

    const/16 v1, 0x10

    sget-object v2, Lug/d;->A:Lug/d;

    aput-object v2, v0, v1

    const/16 v1, 0x11

    sget-object v2, Lug/d;->B:Lug/d;

    aput-object v2, v0, v1

    const/16 v1, 0x12

    sget-object v2, Lug/d;->C:Lug/d;

    aput-object v2, v0, v1

    const/16 v1, 0x13

    sget-object v2, Lug/d;->D:Lug/d;

    aput-object v2, v0, v1

    const/16 v1, 0x14

    sget-object v2, Lug/d;->E:Lug/d;

    aput-object v2, v0, v1

    const/16 v1, 0x15

    sget-object v2, Lug/d;->F:Lug/d;

    aput-object v2, v0, v1

    const/16 v1, 0x16

    sget-object v2, Lug/d;->G:Lug/d;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lug/d;
    .locals 1

    const-class v0, Lug/d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lug/d;

    return-object p0
.end method

.method public static values()[Lug/d;
    .locals 1

    sget-object v0, Lug/d;->H:[Lug/d;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lug/d;

    return-object v0
.end method


# virtual methods
.method public a()Lug/a;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
