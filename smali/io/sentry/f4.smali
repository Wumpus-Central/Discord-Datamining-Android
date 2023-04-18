.class public final enum Lio/sentry/f4;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lio/sentry/b1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/sentry/f4$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/sentry/f4;",
        ">;",
        "Lio/sentry/b1;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lio/sentry/f4;

.field public static final enum ABORTED:Lio/sentry/f4;

.field public static final enum ALREADY_EXISTS:Lio/sentry/f4;

.field public static final enum CANCELLED:Lio/sentry/f4;

.field public static final enum DATA_LOSS:Lio/sentry/f4;

.field public static final enum DEADLINE_EXCEEDED:Lio/sentry/f4;

.field public static final enum FAILED_PRECONDITION:Lio/sentry/f4;

.field public static final enum INTERNAL_ERROR:Lio/sentry/f4;

.field public static final enum INVALID_ARGUMENT:Lio/sentry/f4;

.field public static final enum NOT_FOUND:Lio/sentry/f4;

.field public static final enum OK:Lio/sentry/f4;

.field public static final enum OUT_OF_RANGE:Lio/sentry/f4;

.field public static final enum PERMISSION_DENIED:Lio/sentry/f4;

.field public static final enum RESOURCE_EXHAUSTED:Lio/sentry/f4;

.field public static final enum UNAUTHENTICATED:Lio/sentry/f4;

.field public static final enum UNAVAILABLE:Lio/sentry/f4;

.field public static final enum UNIMPLEMENTED:Lio/sentry/f4;

.field public static final enum UNKNOWN:Lio/sentry/f4;

.field public static final enum UNKNOWN_ERROR:Lio/sentry/f4;


# instance fields
.field private final maxHttpStatusCode:I

.field private final minHttpStatusCode:I


# direct methods
.method private static synthetic $values()[Lio/sentry/f4;
    .locals 3

    .line 1
    const/16 v0, 0x12

    .line 2
    .line 3
    new-array v0, v0, [Lio/sentry/f4;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    sget-object v2, Lio/sentry/f4;->OK:Lio/sentry/f4;

    .line 7
    .line 8
    aput-object v2, v0, v1

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    sget-object v2, Lio/sentry/f4;->CANCELLED:Lio/sentry/f4;

    .line 12
    .line 13
    aput-object v2, v0, v1

    .line 14
    .line 15
    const/4 v1, 0x2

    .line 16
    sget-object v2, Lio/sentry/f4;->INTERNAL_ERROR:Lio/sentry/f4;

    .line 17
    .line 18
    aput-object v2, v0, v1

    .line 19
    .line 20
    const/4 v1, 0x3

    .line 21
    sget-object v2, Lio/sentry/f4;->UNKNOWN:Lio/sentry/f4;

    .line 22
    .line 23
    aput-object v2, v0, v1

    .line 24
    .line 25
    const/4 v1, 0x4

    .line 26
    sget-object v2, Lio/sentry/f4;->UNKNOWN_ERROR:Lio/sentry/f4;

    .line 27
    .line 28
    aput-object v2, v0, v1

    .line 29
    .line 30
    const/4 v1, 0x5

    .line 31
    sget-object v2, Lio/sentry/f4;->INVALID_ARGUMENT:Lio/sentry/f4;

    .line 32
    .line 33
    aput-object v2, v0, v1

    .line 34
    .line 35
    const/4 v1, 0x6

    .line 36
    sget-object v2, Lio/sentry/f4;->DEADLINE_EXCEEDED:Lio/sentry/f4;

    .line 37
    .line 38
    aput-object v2, v0, v1

    .line 39
    .line 40
    const/4 v1, 0x7

    .line 41
    sget-object v2, Lio/sentry/f4;->NOT_FOUND:Lio/sentry/f4;

    .line 42
    .line 43
    aput-object v2, v0, v1

    .line 44
    .line 45
    const/16 v1, 0x8

    .line 46
    .line 47
    sget-object v2, Lio/sentry/f4;->ALREADY_EXISTS:Lio/sentry/f4;

    .line 48
    .line 49
    aput-object v2, v0, v1

    .line 50
    .line 51
    const/16 v1, 0x9

    .line 52
    .line 53
    sget-object v2, Lio/sentry/f4;->PERMISSION_DENIED:Lio/sentry/f4;

    .line 54
    .line 55
    aput-object v2, v0, v1

    .line 56
    .line 57
    const/16 v1, 0xa

    .line 58
    .line 59
    sget-object v2, Lio/sentry/f4;->RESOURCE_EXHAUSTED:Lio/sentry/f4;

    .line 60
    .line 61
    aput-object v2, v0, v1

    .line 62
    .line 63
    const/16 v1, 0xb

    .line 64
    .line 65
    sget-object v2, Lio/sentry/f4;->FAILED_PRECONDITION:Lio/sentry/f4;

    .line 66
    .line 67
    aput-object v2, v0, v1

    .line 68
    .line 69
    const/16 v1, 0xc

    .line 70
    .line 71
    sget-object v2, Lio/sentry/f4;->ABORTED:Lio/sentry/f4;

    .line 72
    .line 73
    aput-object v2, v0, v1

    .line 74
    .line 75
    const/16 v1, 0xd

    .line 76
    .line 77
    sget-object v2, Lio/sentry/f4;->OUT_OF_RANGE:Lio/sentry/f4;

    .line 78
    .line 79
    aput-object v2, v0, v1

    .line 80
    .line 81
    const/16 v1, 0xe

    .line 82
    .line 83
    sget-object v2, Lio/sentry/f4;->UNIMPLEMENTED:Lio/sentry/f4;

    .line 84
    .line 85
    aput-object v2, v0, v1

    .line 86
    .line 87
    const/16 v1, 0xf

    .line 88
    .line 89
    sget-object v2, Lio/sentry/f4;->UNAVAILABLE:Lio/sentry/f4;

    .line 90
    .line 91
    aput-object v2, v0, v1

    .line 92
    .line 93
    const/16 v1, 0x10

    .line 94
    .line 95
    sget-object v2, Lio/sentry/f4;->DATA_LOSS:Lio/sentry/f4;

    .line 96
    .line 97
    aput-object v2, v0, v1

    .line 98
    .line 99
    const/16 v1, 0x11

    .line 100
    .line 101
    sget-object v2, Lio/sentry/f4;->UNAUTHENTICATED:Lio/sentry/f4;

    .line 102
    .line 103
    aput-object v2, v0, v1

    .line 104
    .line 105
    return-object v0
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

.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lio/sentry/f4;

    .line 2
    .line 3
    const/16 v1, 0xc8

    .line 4
    .line 5
    const/16 v2, 0x12b

    .line 6
    .line 7
    const-string v3, "OK"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v3, v4, v1, v2}, Lio/sentry/f4;-><init>(Ljava/lang/String;III)V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lio/sentry/f4;->OK:Lio/sentry/f4;

    .line 14
    .line 15
    new-instance v0, Lio/sentry/f4;

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    const/16 v2, 0x1f3

    .line 19
    .line 20
    const-string v3, "CANCELLED"

    .line 21
    .line 22
    invoke-direct {v0, v3, v1, v2}, Lio/sentry/f4;-><init>(Ljava/lang/String;II)V

    .line 23
    .line 24
    .line 25
    sput-object v0, Lio/sentry/f4;->CANCELLED:Lio/sentry/f4;

    .line 26
    .line 27
    new-instance v0, Lio/sentry/f4;

    .line 28
    .line 29
    const-string v1, "INTERNAL_ERROR"

    .line 30
    .line 31
    const/4 v2, 0x2

    .line 32
    const/16 v3, 0x1f4

    .line 33
    .line 34
    invoke-direct {v0, v1, v2, v3}, Lio/sentry/f4;-><init>(Ljava/lang/String;II)V

    .line 35
    .line 36
    .line 37
    sput-object v0, Lio/sentry/f4;->INTERNAL_ERROR:Lio/sentry/f4;

    .line 38
    .line 39
    new-instance v0, Lio/sentry/f4;

    .line 40
    .line 41
    const-string v1, "UNKNOWN"

    .line 42
    .line 43
    const/4 v2, 0x3

    .line 44
    invoke-direct {v0, v1, v2, v3}, Lio/sentry/f4;-><init>(Ljava/lang/String;II)V

    .line 45
    .line 46
    .line 47
    sput-object v0, Lio/sentry/f4;->UNKNOWN:Lio/sentry/f4;

    .line 48
    .line 49
    new-instance v0, Lio/sentry/f4;

    .line 50
    .line 51
    const-string v1, "UNKNOWN_ERROR"

    .line 52
    .line 53
    const/4 v2, 0x4

    .line 54
    invoke-direct {v0, v1, v2, v3}, Lio/sentry/f4;-><init>(Ljava/lang/String;II)V

    .line 55
    .line 56
    .line 57
    sput-object v0, Lio/sentry/f4;->UNKNOWN_ERROR:Lio/sentry/f4;

    .line 58
    .line 59
    new-instance v0, Lio/sentry/f4;

    .line 60
    .line 61
    const-string v1, "INVALID_ARGUMENT"

    .line 62
    .line 63
    const/4 v2, 0x5

    .line 64
    const/16 v4, 0x190

    .line 65
    .line 66
    invoke-direct {v0, v1, v2, v4}, Lio/sentry/f4;-><init>(Ljava/lang/String;II)V

    .line 67
    .line 68
    .line 69
    sput-object v0, Lio/sentry/f4;->INVALID_ARGUMENT:Lio/sentry/f4;

    .line 70
    .line 71
    new-instance v0, Lio/sentry/f4;

    .line 72
    .line 73
    const/4 v1, 0x6

    .line 74
    const/16 v2, 0x1f8

    .line 75
    .line 76
    const-string v5, "DEADLINE_EXCEEDED"

    .line 77
    .line 78
    invoke-direct {v0, v5, v1, v2}, Lio/sentry/f4;-><init>(Ljava/lang/String;II)V

    .line 79
    .line 80
    .line 81
    sput-object v0, Lio/sentry/f4;->DEADLINE_EXCEEDED:Lio/sentry/f4;

    .line 82
    .line 83
    new-instance v0, Lio/sentry/f4;

    .line 84
    .line 85
    const/4 v1, 0x7

    .line 86
    const/16 v2, 0x194

    .line 87
    .line 88
    const-string v5, "NOT_FOUND"

    .line 89
    .line 90
    invoke-direct {v0, v5, v1, v2}, Lio/sentry/f4;-><init>(Ljava/lang/String;II)V

    .line 91
    .line 92
    .line 93
    sput-object v0, Lio/sentry/f4;->NOT_FOUND:Lio/sentry/f4;

    .line 94
    .line 95
    new-instance v0, Lio/sentry/f4;

    .line 96
    .line 97
    const-string v1, "ALREADY_EXISTS"

    .line 98
    .line 99
    const/16 v2, 0x8

    .line 100
    .line 101
    const/16 v5, 0x199

    .line 102
    .line 103
    invoke-direct {v0, v1, v2, v5}, Lio/sentry/f4;-><init>(Ljava/lang/String;II)V

    .line 104
    .line 105
    .line 106
    sput-object v0, Lio/sentry/f4;->ALREADY_EXISTS:Lio/sentry/f4;

    .line 107
    .line 108
    new-instance v0, Lio/sentry/f4;

    .line 109
    .line 110
    const/16 v1, 0x9

    .line 111
    .line 112
    const/16 v2, 0x193

    .line 113
    .line 114
    const-string v6, "PERMISSION_DENIED"

    .line 115
    .line 116
    invoke-direct {v0, v6, v1, v2}, Lio/sentry/f4;-><init>(Ljava/lang/String;II)V

    .line 117
    .line 118
    .line 119
    sput-object v0, Lio/sentry/f4;->PERMISSION_DENIED:Lio/sentry/f4;

    .line 120
    .line 121
    new-instance v0, Lio/sentry/f4;

    .line 122
    .line 123
    const/16 v1, 0xa

    .line 124
    .line 125
    const/16 v2, 0x1ad

    .line 126
    .line 127
    const-string v6, "RESOURCE_EXHAUSTED"

    .line 128
    .line 129
    invoke-direct {v0, v6, v1, v2}, Lio/sentry/f4;-><init>(Ljava/lang/String;II)V

    .line 130
    .line 131
    .line 132
    sput-object v0, Lio/sentry/f4;->RESOURCE_EXHAUSTED:Lio/sentry/f4;

    .line 133
    .line 134
    new-instance v0, Lio/sentry/f4;

    .line 135
    .line 136
    const-string v1, "FAILED_PRECONDITION"

    .line 137
    .line 138
    const/16 v2, 0xb

    .line 139
    .line 140
    invoke-direct {v0, v1, v2, v4}, Lio/sentry/f4;-><init>(Ljava/lang/String;II)V

    .line 141
    .line 142
    .line 143
    sput-object v0, Lio/sentry/f4;->FAILED_PRECONDITION:Lio/sentry/f4;

    .line 144
    .line 145
    new-instance v0, Lio/sentry/f4;

    .line 146
    .line 147
    const-string v1, "ABORTED"

    .line 148
    .line 149
    const/16 v2, 0xc

    .line 150
    .line 151
    invoke-direct {v0, v1, v2, v5}, Lio/sentry/f4;-><init>(Ljava/lang/String;II)V

    .line 152
    .line 153
    .line 154
    sput-object v0, Lio/sentry/f4;->ABORTED:Lio/sentry/f4;

    .line 155
    .line 156
    new-instance v0, Lio/sentry/f4;

    .line 157
    .line 158
    const-string v1, "OUT_OF_RANGE"

    .line 159
    .line 160
    const/16 v2, 0xd

    .line 161
    .line 162
    invoke-direct {v0, v1, v2, v4}, Lio/sentry/f4;-><init>(Ljava/lang/String;II)V

    .line 163
    .line 164
    .line 165
    sput-object v0, Lio/sentry/f4;->OUT_OF_RANGE:Lio/sentry/f4;

    .line 166
    .line 167
    new-instance v0, Lio/sentry/f4;

    .line 168
    .line 169
    const/16 v1, 0xe

    .line 170
    .line 171
    const/16 v2, 0x1f5

    .line 172
    .line 173
    const-string v4, "UNIMPLEMENTED"

    .line 174
    .line 175
    invoke-direct {v0, v4, v1, v2}, Lio/sentry/f4;-><init>(Ljava/lang/String;II)V

    .line 176
    .line 177
    .line 178
    sput-object v0, Lio/sentry/f4;->UNIMPLEMENTED:Lio/sentry/f4;

    .line 179
    .line 180
    new-instance v0, Lio/sentry/f4;

    .line 181
    .line 182
    const/16 v1, 0xf

    .line 183
    .line 184
    const/16 v2, 0x1f7

    .line 185
    .line 186
    const-string v4, "UNAVAILABLE"

    .line 187
    .line 188
    invoke-direct {v0, v4, v1, v2}, Lio/sentry/f4;-><init>(Ljava/lang/String;II)V

    .line 189
    .line 190
    .line 191
    sput-object v0, Lio/sentry/f4;->UNAVAILABLE:Lio/sentry/f4;

    .line 192
    .line 193
    new-instance v0, Lio/sentry/f4;

    .line 194
    .line 195
    const-string v1, "DATA_LOSS"

    .line 196
    .line 197
    const/16 v2, 0x10

    .line 198
    .line 199
    invoke-direct {v0, v1, v2, v3}, Lio/sentry/f4;-><init>(Ljava/lang/String;II)V

    .line 200
    .line 201
    .line 202
    sput-object v0, Lio/sentry/f4;->DATA_LOSS:Lio/sentry/f4;

    .line 203
    .line 204
    new-instance v0, Lio/sentry/f4;

    .line 205
    .line 206
    const/16 v1, 0x11

    .line 207
    .line 208
    const/16 v2, 0x191

    .line 209
    .line 210
    const-string v3, "UNAUTHENTICATED"

    .line 211
    .line 212
    invoke-direct {v0, v3, v1, v2}, Lio/sentry/f4;-><init>(Ljava/lang/String;II)V

    .line 213
    .line 214
    .line 215
    sput-object v0, Lio/sentry/f4;->UNAUTHENTICATED:Lio/sentry/f4;

    .line 216
    .line 217
    invoke-static {}, Lio/sentry/f4;->$values()[Lio/sentry/f4;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    sput-object v0, Lio/sentry/f4;->$VALUES:[Lio/sentry/f4;

    .line 222
    .line 223
    return-void
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

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    iput p3, p0, Lio/sentry/f4;->minHttpStatusCode:I

    .line 3
    iput p3, p0, Lio/sentry/f4;->maxHttpStatusCode:I

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;III)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)V"
        }
    .end annotation

    .line 4
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 5
    iput p3, p0, Lio/sentry/f4;->minHttpStatusCode:I

    .line 6
    iput p4, p0, Lio/sentry/f4;->maxHttpStatusCode:I

    return-void
.end method

.method public static fromHttpStatusCode(I)Lio/sentry/f4;
    .locals 5

    .line 1
    invoke-static {}, Lio/sentry/f4;->values()[Lio/sentry/f4;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 2
    invoke-direct {v3, p0}, Lio/sentry/f4;->matches(I)Z

    move-result v4

    if-eqz v4, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static fromHttpStatusCode(Ljava/lang/Integer;Lio/sentry/f4;)Lio/sentry/f4;
    .locals 0

    if-eqz p0, :cond_0

    .line 3
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-static {p0}, Lio/sentry/f4;->fromHttpStatusCode(I)Lio/sentry/f4;

    move-result-object p0

    goto :goto_0

    :cond_0
    move-object p0, p1

    :goto_0
    if-eqz p0, :cond_1

    move-object p1, p0

    :cond_1
    return-object p1
.end method

.method private matches(I)Z
    .locals 1

    iget v0, p0, Lio/sentry/f4;->minHttpStatusCode:I

    if-lt p1, v0, :cond_0

    iget v0, p0, Lio/sentry/f4;->maxHttpStatusCode:I

    if-gt p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public static valueOf(Ljava/lang/String;)Lio/sentry/f4;
    .locals 1

    const-class v0, Lio/sentry/f4;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/sentry/f4;

    return-object p0
.end method

.method public static values()[Lio/sentry/f4;
    .locals 1

    sget-object v0, Lio/sentry/f4;->$VALUES:[Lio/sentry/f4;

    invoke-virtual {v0}, [Lio/sentry/f4;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/sentry/f4;

    return-object v0
.end method


# virtual methods
.method public serialize(Lio/sentry/z0;Lio/sentry/g0;)V
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p2, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/sentry/vendor/gson/stream/c;->t0(Ljava/lang/String;)Lio/sentry/vendor/gson/stream/c;

    return-void
.end method
