.class public final enum Lie/e$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lie/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lie/e$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum l:Lie/e$a;

.field public static final enum m:Lie/e$a;

.field public static final enum n:Lie/e$a;

.field public static final enum o:Lie/e$a;

.field public static final enum p:Lie/e$a;

.field public static final enum q:Lie/e$a;

.field public static final enum r:Lie/e$a;

.field public static final enum s:Lie/e$a;

.field public static final enum t:Lie/e$a;

.field public static final enum u:Lie/e$a;

.field public static final enum v:Lie/e$a;

.field public static final enum w:Lie/e$a;

.field public static final enum x:Lie/e$a;

.field public static final enum y:Lie/e$a;

.field private static final synthetic z:[Lie/e$a;


# instance fields
.field private final k:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 17

    .line 1
    new-instance v0, Lie/e$a;

    .line 2
    .line 3
    const-string v1, "Failed to create decoder codec."

    .line 4
    .line 5
    const-string v2, "DECODER_FORMAT_NOT_FOUND"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v0, v2, v3, v1}, Lie/e$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lie/e$a;->l:Lie/e$a;

    .line 12
    .line 13
    new-instance v1, Lie/e$a;

    .line 14
    .line 15
    const-string v2, "Failed to configure decoder codec."

    .line 16
    .line 17
    const-string v4, "DECODER_CONFIGURATION_ERROR"

    .line 18
    .line 19
    const/4 v5, 0x1

    .line 20
    invoke-direct {v1, v4, v5, v2}, Lie/e$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v1, Lie/e$a;->m:Lie/e$a;

    .line 24
    .line 25
    new-instance v2, Lie/e$a;

    .line 26
    .line 27
    const-string v4, "Failed to create encoder codec."

    .line 28
    .line 29
    const-string v6, "ENCODER_FORMAT_NOT_FOUND"

    .line 30
    .line 31
    const/4 v7, 0x2

    .line 32
    invoke-direct {v2, v6, v7, v4}, Lie/e$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sput-object v2, Lie/e$a;->n:Lie/e$a;

    .line 36
    .line 37
    new-instance v4, Lie/e$a;

    .line 38
    .line 39
    const-string v6, "Failed to configure encoder codec."

    .line 40
    .line 41
    const-string v8, "ENCODER_CONFIGURATION_ERROR"

    .line 42
    .line 43
    const/4 v9, 0x3

    .line 44
    invoke-direct {v4, v8, v9, v6}, Lie/e$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 45
    .line 46
    .line 47
    sput-object v4, Lie/e$a;->o:Lie/e$a;

    .line 48
    .line 49
    new-instance v6, Lie/e$a;

    .line 50
    .line 51
    const-string v8, "No decoder found."

    .line 52
    .line 53
    const-string v10, "DECODER_NOT_FOUND"

    .line 54
    .line 55
    const/4 v11, 0x4

    .line 56
    invoke-direct {v6, v10, v11, v8}, Lie/e$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 57
    .line 58
    .line 59
    sput-object v6, Lie/e$a;->p:Lie/e$a;

    .line 60
    .line 61
    new-instance v8, Lie/e$a;

    .line 62
    .line 63
    const-string v10, "No encoder found."

    .line 64
    .line 65
    const-string v12, "ENCODER_NOT_FOUND"

    .line 66
    .line 67
    const/4 v13, 0x5

    .line 68
    invoke-direct {v8, v12, v13, v10}, Lie/e$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 69
    .line 70
    .line 71
    sput-object v8, Lie/e$a;->q:Lie/e$a;

    .line 72
    .line 73
    new-instance v10, Lie/e$a;

    .line 74
    .line 75
    const-string v12, "Codecs are in released state."

    .line 76
    .line 77
    const-string v14, "CODEC_IN_RELEASED_STATE"

    .line 78
    .line 79
    const/4 v15, 0x6

    .line 80
    invoke-direct {v10, v14, v15, v12}, Lie/e$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 81
    .line 82
    .line 83
    sput-object v10, Lie/e$a;->r:Lie/e$a;

    .line 84
    .line 85
    new-instance v12, Lie/e$a;

    .line 86
    .line 87
    const-string v14, "Mime type not found for the source track."

    .line 88
    .line 89
    const-string v15, "SOURCE_TRACK_MIME_TYPE_NOT_FOUND"

    .line 90
    .line 91
    const/4 v13, 0x7

    .line 92
    invoke-direct {v12, v15, v13, v14}, Lie/e$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 93
    .line 94
    .line 95
    sput-object v12, Lie/e$a;->s:Lie/e$a;

    .line 96
    .line 97
    new-instance v14, Lie/e$a;

    .line 98
    .line 99
    const-string v15, "No tracks found."

    .line 100
    .line 101
    const-string v13, "NO_TRACKS_FOUND"

    .line 102
    .line 103
    const/16 v11, 0x8

    .line 104
    .line 105
    invoke-direct {v14, v13, v11, v15}, Lie/e$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 106
    .line 107
    .line 108
    sput-object v14, Lie/e$a;->t:Lie/e$a;

    .line 109
    .line 110
    new-instance v13, Lie/e$a;

    .line 111
    .line 112
    const-string v15, "Internal codec error occurred."

    .line 113
    .line 114
    const-string v11, "INTERNAL_CODEC_ERROR"

    .line 115
    .line 116
    const/16 v9, 0x9

    .line 117
    .line 118
    invoke-direct {v13, v11, v9, v15}, Lie/e$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 119
    .line 120
    .line 121
    sput-object v13, Lie/e$a;->u:Lie/e$a;

    .line 122
    .line 123
    new-instance v11, Lie/e$a;

    .line 124
    .line 125
    const-string v15, "No frame available for specified tag"

    .line 126
    .line 127
    const-string v9, "NO_FRAME_AVAILABLE"

    .line 128
    .line 129
    const/16 v7, 0xa

    .line 130
    .line 131
    invoke-direct {v11, v9, v7, v15}, Lie/e$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 132
    .line 133
    .line 134
    sput-object v11, Lie/e$a;->v:Lie/e$a;

    .line 135
    .line 136
    new-instance v9, Lie/e$a;

    .line 137
    .line 138
    const-string v15, "Decoder is not provided"

    .line 139
    .line 140
    const-string v7, "DECODER_NOT_PROVIDED"

    .line 141
    .line 142
    const/16 v5, 0xb

    .line 143
    .line 144
    invoke-direct {v9, v7, v5, v15}, Lie/e$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 145
    .line 146
    .line 147
    sput-object v9, Lie/e$a;->w:Lie/e$a;

    .line 148
    .line 149
    new-instance v7, Lie/e$a;

    .line 150
    .line 151
    const-string v15, "Encoder is not provided"

    .line 152
    .line 153
    const-string v5, "ENCODER_NOT_PROVIDED"

    .line 154
    .line 155
    const/16 v3, 0xc

    .line 156
    .line 157
    invoke-direct {v7, v5, v3, v15}, Lie/e$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 158
    .line 159
    .line 160
    sput-object v7, Lie/e$a;->x:Lie/e$a;

    .line 161
    .line 162
    new-instance v5, Lie/e$a;

    .line 163
    .line 164
    const-string v15, "Renderer is not provided"

    .line 165
    .line 166
    const-string v3, "RENDERER_NOT_PROVIDED"

    .line 167
    .line 168
    move-object/from16 v16, v7

    .line 169
    .line 170
    const/16 v7, 0xd

    .line 171
    .line 172
    invoke-direct {v5, v3, v7, v15}, Lie/e$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 173
    .line 174
    .line 175
    sput-object v5, Lie/e$a;->y:Lie/e$a;

    .line 176
    .line 177
    const/16 v3, 0xe

    .line 178
    .line 179
    new-array v3, v3, [Lie/e$a;

    .line 180
    .line 181
    const/4 v15, 0x0

    .line 182
    aput-object v0, v3, v15

    .line 183
    .line 184
    const/4 v0, 0x1

    .line 185
    aput-object v1, v3, v0

    .line 186
    .line 187
    const/4 v0, 0x2

    .line 188
    aput-object v2, v3, v0

    .line 189
    .line 190
    const/4 v0, 0x3

    .line 191
    aput-object v4, v3, v0

    .line 192
    .line 193
    const/4 v0, 0x4

    .line 194
    aput-object v6, v3, v0

    .line 195
    .line 196
    const/4 v0, 0x5

    .line 197
    aput-object v8, v3, v0

    .line 198
    .line 199
    const/4 v0, 0x6

    .line 200
    aput-object v10, v3, v0

    .line 201
    .line 202
    const/4 v0, 0x7

    .line 203
    aput-object v12, v3, v0

    .line 204
    .line 205
    const/16 v0, 0x8

    .line 206
    .line 207
    aput-object v14, v3, v0

    .line 208
    .line 209
    const/16 v0, 0x9

    .line 210
    .line 211
    aput-object v13, v3, v0

    .line 212
    .line 213
    const/16 v0, 0xa

    .line 214
    .line 215
    aput-object v11, v3, v0

    .line 216
    .line 217
    const/16 v0, 0xb

    .line 218
    .line 219
    aput-object v9, v3, v0

    .line 220
    .line 221
    const/16 v0, 0xc

    .line 222
    .line 223
    aput-object v16, v3, v0

    .line 224
    .line 225
    aput-object v5, v3, v7

    .line 226
    .line 227
    sput-object v3, Lie/e$a;->z:[Lie/e$a;

    .line 228
    .line 229
    return-void
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

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lie/e$a;->k:Ljava/lang/String;

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
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

.method static synthetic a(Lie/e$a;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lie/e$a;->k:Ljava/lang/String;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lie/e$a;
    .locals 1

    const-class v0, Lie/e$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lie/e$a;

    return-object p0
.end method

.method public static values()[Lie/e$a;
    .locals 1

    sget-object v0, Lie/e$a;->z:[Lie/e$a;

    invoke-virtual {v0}, [Lie/e$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lie/e$a;

    return-object v0
.end method
