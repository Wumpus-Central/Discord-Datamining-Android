.class public final enum Lcom/discord/primitives/MessageFlag;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/discord/primitives/MessageFlag;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0010\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/discord/primitives/MessageFlag;",
        "",
        "value",
        "",
        "(Ljava/lang/String;IJ)V",
        "getValue",
        "()J",
        "CROSSPOSTED",
        "IS_CROSSPOST",
        "SUPPRESS_EMBEDS",
        "SOURCE_MESSAGE_DELETED",
        "URGENT",
        "HAS_THREAD",
        "EPHEMERAL",
        "LOADING",
        "FAILED_TO_MENTION_SOME_ROLES_IN_THREAD",
        "SHOULD_SHOW_LINK_NOT_DISCORD_WARNING",
        "SUPPRESS_NOTIFICATIONS",
        "IS_VOICE_MESSAGE",
        "primitives_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/discord/primitives/MessageFlag;

.field public static final enum CROSSPOSTED:Lcom/discord/primitives/MessageFlag;

.field public static final enum EPHEMERAL:Lcom/discord/primitives/MessageFlag;

.field public static final enum FAILED_TO_MENTION_SOME_ROLES_IN_THREAD:Lcom/discord/primitives/MessageFlag;

.field public static final enum HAS_THREAD:Lcom/discord/primitives/MessageFlag;

.field public static final enum IS_CROSSPOST:Lcom/discord/primitives/MessageFlag;

.field public static final enum IS_VOICE_MESSAGE:Lcom/discord/primitives/MessageFlag;

.field public static final enum LOADING:Lcom/discord/primitives/MessageFlag;

.field public static final enum SHOULD_SHOW_LINK_NOT_DISCORD_WARNING:Lcom/discord/primitives/MessageFlag;

.field public static final enum SOURCE_MESSAGE_DELETED:Lcom/discord/primitives/MessageFlag;

.field public static final enum SUPPRESS_EMBEDS:Lcom/discord/primitives/MessageFlag;

.field public static final enum SUPPRESS_NOTIFICATIONS:Lcom/discord/primitives/MessageFlag;

.field public static final enum URGENT:Lcom/discord/primitives/MessageFlag;


# instance fields
.field private final value:J


# direct methods
.method private static final synthetic $values()[Lcom/discord/primitives/MessageFlag;
    .locals 3

    const/16 v0, 0xc

    new-array v0, v0, [Lcom/discord/primitives/MessageFlag;

    const/4 v1, 0x0

    sget-object v2, Lcom/discord/primitives/MessageFlag;->CROSSPOSTED:Lcom/discord/primitives/MessageFlag;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/discord/primitives/MessageFlag;->IS_CROSSPOST:Lcom/discord/primitives/MessageFlag;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lcom/discord/primitives/MessageFlag;->SUPPRESS_EMBEDS:Lcom/discord/primitives/MessageFlag;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lcom/discord/primitives/MessageFlag;->SOURCE_MESSAGE_DELETED:Lcom/discord/primitives/MessageFlag;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lcom/discord/primitives/MessageFlag;->URGENT:Lcom/discord/primitives/MessageFlag;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lcom/discord/primitives/MessageFlag;->HAS_THREAD:Lcom/discord/primitives/MessageFlag;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lcom/discord/primitives/MessageFlag;->EPHEMERAL:Lcom/discord/primitives/MessageFlag;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lcom/discord/primitives/MessageFlag;->LOADING:Lcom/discord/primitives/MessageFlag;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lcom/discord/primitives/MessageFlag;->FAILED_TO_MENTION_SOME_ROLES_IN_THREAD:Lcom/discord/primitives/MessageFlag;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    sget-object v2, Lcom/discord/primitives/MessageFlag;->SHOULD_SHOW_LINK_NOT_DISCORD_WARNING:Lcom/discord/primitives/MessageFlag;

    aput-object v2, v0, v1

    const/16 v1, 0xa

    sget-object v2, Lcom/discord/primitives/MessageFlag;->SUPPRESS_NOTIFICATIONS:Lcom/discord/primitives/MessageFlag;

    aput-object v2, v0, v1

    const/16 v1, 0xb

    sget-object v2, Lcom/discord/primitives/MessageFlag;->IS_VOICE_MESSAGE:Lcom/discord/primitives/MessageFlag;

    aput-object v2, v0, v1

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lcom/discord/primitives/MessageFlag;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-wide/16 v2, 0x1

    .line 5
    .line 6
    const-string v4, "CROSSPOSTED"

    .line 7
    .line 8
    invoke-direct {v0, v4, v1, v2, v3}, Lcom/discord/primitives/MessageFlag;-><init>(Ljava/lang/String;IJ)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lcom/discord/primitives/MessageFlag;->CROSSPOSTED:Lcom/discord/primitives/MessageFlag;

    .line 12
    .line 13
    new-instance v0, Lcom/discord/primitives/MessageFlag;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    const-wide/16 v2, 0x2

    .line 17
    .line 18
    const-string v4, "IS_CROSSPOST"

    .line 19
    .line 20
    invoke-direct {v0, v4, v1, v2, v3}, Lcom/discord/primitives/MessageFlag;-><init>(Ljava/lang/String;IJ)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lcom/discord/primitives/MessageFlag;->IS_CROSSPOST:Lcom/discord/primitives/MessageFlag;

    .line 24
    .line 25
    new-instance v0, Lcom/discord/primitives/MessageFlag;

    .line 26
    .line 27
    const/4 v1, 0x2

    .line 28
    const-wide/16 v2, 0x4

    .line 29
    .line 30
    const-string v4, "SUPPRESS_EMBEDS"

    .line 31
    .line 32
    invoke-direct {v0, v4, v1, v2, v3}, Lcom/discord/primitives/MessageFlag;-><init>(Ljava/lang/String;IJ)V

    .line 33
    .line 34
    .line 35
    sput-object v0, Lcom/discord/primitives/MessageFlag;->SUPPRESS_EMBEDS:Lcom/discord/primitives/MessageFlag;

    .line 36
    .line 37
    new-instance v0, Lcom/discord/primitives/MessageFlag;

    .line 38
    .line 39
    const/4 v1, 0x3

    .line 40
    const-wide/16 v2, 0x8

    .line 41
    .line 42
    const-string v4, "SOURCE_MESSAGE_DELETED"

    .line 43
    .line 44
    invoke-direct {v0, v4, v1, v2, v3}, Lcom/discord/primitives/MessageFlag;-><init>(Ljava/lang/String;IJ)V

    .line 45
    .line 46
    .line 47
    sput-object v0, Lcom/discord/primitives/MessageFlag;->SOURCE_MESSAGE_DELETED:Lcom/discord/primitives/MessageFlag;

    .line 48
    .line 49
    new-instance v0, Lcom/discord/primitives/MessageFlag;

    .line 50
    .line 51
    const/4 v1, 0x4

    .line 52
    const-wide/16 v2, 0x10

    .line 53
    .line 54
    const-string v4, "URGENT"

    .line 55
    .line 56
    invoke-direct {v0, v4, v1, v2, v3}, Lcom/discord/primitives/MessageFlag;-><init>(Ljava/lang/String;IJ)V

    .line 57
    .line 58
    .line 59
    sput-object v0, Lcom/discord/primitives/MessageFlag;->URGENT:Lcom/discord/primitives/MessageFlag;

    .line 60
    .line 61
    new-instance v0, Lcom/discord/primitives/MessageFlag;

    .line 62
    .line 63
    const/4 v1, 0x5

    .line 64
    const-wide/16 v2, 0x20

    .line 65
    .line 66
    const-string v4, "HAS_THREAD"

    .line 67
    .line 68
    invoke-direct {v0, v4, v1, v2, v3}, Lcom/discord/primitives/MessageFlag;-><init>(Ljava/lang/String;IJ)V

    .line 69
    .line 70
    .line 71
    sput-object v0, Lcom/discord/primitives/MessageFlag;->HAS_THREAD:Lcom/discord/primitives/MessageFlag;

    .line 72
    .line 73
    new-instance v0, Lcom/discord/primitives/MessageFlag;

    .line 74
    .line 75
    const/4 v1, 0x6

    .line 76
    const-wide/16 v2, 0x40

    .line 77
    .line 78
    const-string v4, "EPHEMERAL"

    .line 79
    .line 80
    invoke-direct {v0, v4, v1, v2, v3}, Lcom/discord/primitives/MessageFlag;-><init>(Ljava/lang/String;IJ)V

    .line 81
    .line 82
    .line 83
    sput-object v0, Lcom/discord/primitives/MessageFlag;->EPHEMERAL:Lcom/discord/primitives/MessageFlag;

    .line 84
    .line 85
    new-instance v0, Lcom/discord/primitives/MessageFlag;

    .line 86
    .line 87
    const/4 v1, 0x7

    .line 88
    const-wide/16 v2, 0x80

    .line 89
    .line 90
    const-string v4, "LOADING"

    .line 91
    .line 92
    invoke-direct {v0, v4, v1, v2, v3}, Lcom/discord/primitives/MessageFlag;-><init>(Ljava/lang/String;IJ)V

    .line 93
    .line 94
    .line 95
    sput-object v0, Lcom/discord/primitives/MessageFlag;->LOADING:Lcom/discord/primitives/MessageFlag;

    .line 96
    .line 97
    new-instance v0, Lcom/discord/primitives/MessageFlag;

    .line 98
    .line 99
    const/16 v1, 0x8

    .line 100
    .line 101
    const-wide/16 v2, 0x100

    .line 102
    .line 103
    const-string v4, "FAILED_TO_MENTION_SOME_ROLES_IN_THREAD"

    .line 104
    .line 105
    invoke-direct {v0, v4, v1, v2, v3}, Lcom/discord/primitives/MessageFlag;-><init>(Ljava/lang/String;IJ)V

    .line 106
    .line 107
    .line 108
    sput-object v0, Lcom/discord/primitives/MessageFlag;->FAILED_TO_MENTION_SOME_ROLES_IN_THREAD:Lcom/discord/primitives/MessageFlag;

    .line 109
    .line 110
    new-instance v0, Lcom/discord/primitives/MessageFlag;

    .line 111
    .line 112
    const/16 v1, 0x9

    .line 113
    .line 114
    const-wide/16 v2, 0x400

    .line 115
    .line 116
    const-string v4, "SHOULD_SHOW_LINK_NOT_DISCORD_WARNING"

    .line 117
    .line 118
    invoke-direct {v0, v4, v1, v2, v3}, Lcom/discord/primitives/MessageFlag;-><init>(Ljava/lang/String;IJ)V

    .line 119
    .line 120
    .line 121
    sput-object v0, Lcom/discord/primitives/MessageFlag;->SHOULD_SHOW_LINK_NOT_DISCORD_WARNING:Lcom/discord/primitives/MessageFlag;

    .line 122
    .line 123
    new-instance v0, Lcom/discord/primitives/MessageFlag;

    .line 124
    .line 125
    const/16 v1, 0xa

    .line 126
    .line 127
    const-wide/16 v2, 0x1000

    .line 128
    .line 129
    const-string v4, "SUPPRESS_NOTIFICATIONS"

    .line 130
    .line 131
    invoke-direct {v0, v4, v1, v2, v3}, Lcom/discord/primitives/MessageFlag;-><init>(Ljava/lang/String;IJ)V

    .line 132
    .line 133
    .line 134
    sput-object v0, Lcom/discord/primitives/MessageFlag;->SUPPRESS_NOTIFICATIONS:Lcom/discord/primitives/MessageFlag;

    .line 135
    .line 136
    new-instance v0, Lcom/discord/primitives/MessageFlag;

    .line 137
    .line 138
    const/16 v1, 0xb

    .line 139
    .line 140
    const-wide/16 v2, 0x2000

    .line 141
    .line 142
    const-string v4, "IS_VOICE_MESSAGE"

    .line 143
    .line 144
    invoke-direct {v0, v4, v1, v2, v3}, Lcom/discord/primitives/MessageFlag;-><init>(Ljava/lang/String;IJ)V

    .line 145
    .line 146
    .line 147
    sput-object v0, Lcom/discord/primitives/MessageFlag;->IS_VOICE_MESSAGE:Lcom/discord/primitives/MessageFlag;

    .line 148
    .line 149
    invoke-static {}, Lcom/discord/primitives/MessageFlag;->$values()[Lcom/discord/primitives/MessageFlag;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    sput-object v0, Lcom/discord/primitives/MessageFlag;->$VALUES:[Lcom/discord/primitives/MessageFlag;

    .line 154
    .line 155
    return-void
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
.end method

.method private constructor <init>(Ljava/lang/String;IJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-wide p3, p0, Lcom/discord/primitives/MessageFlag;->value:J

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/discord/primitives/MessageFlag;
    .locals 1

    const-class v0, Lcom/discord/primitives/MessageFlag;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/discord/primitives/MessageFlag;

    return-object p0
.end method

.method public static values()[Lcom/discord/primitives/MessageFlag;
    .locals 1

    sget-object v0, Lcom/discord/primitives/MessageFlag;->$VALUES:[Lcom/discord/primitives/MessageFlag;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/discord/primitives/MessageFlag;

    return-object v0
.end method


# virtual methods
.method public final getValue()J
    .locals 2

    iget-wide v0, p0, Lcom/discord/primitives/MessageFlag;->value:J

    return-wide v0
.end method
