.class public Lcom/mkuczera/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/mkuczera/b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/mkuczera/c;->a:Ljava/util/Map;

    .line 7
    .line 8
    new-instance v1, Lcom/mkuczera/f;

    .line 9
    .line 10
    const/4 v2, 0x2

    .line 11
    new-array v3, v2, [J

    .line 12
    .line 13
    fill-array-data v3, :array_0

    .line 14
    .line 15
    .line 16
    invoke-direct {v1, v3}, Lcom/mkuczera/f;-><init>([J)V

    .line 17
    .line 18
    .line 19
    const-string v3, "impactLight"

    .line 20
    .line 21
    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    sget-object v0, Lcom/mkuczera/c;->a:Ljava/util/Map;

    .line 25
    .line 26
    new-instance v1, Lcom/mkuczera/f;

    .line 27
    .line 28
    new-array v3, v2, [J

    .line 29
    .line 30
    fill-array-data v3, :array_1

    .line 31
    .line 32
    .line 33
    invoke-direct {v1, v3}, Lcom/mkuczera/f;-><init>([J)V

    .line 34
    .line 35
    .line 36
    const-string v3, "impactMedium"

    .line 37
    .line 38
    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    sget-object v0, Lcom/mkuczera/c;->a:Ljava/util/Map;

    .line 42
    .line 43
    new-instance v1, Lcom/mkuczera/f;

    .line 44
    .line 45
    new-array v3, v2, [J

    .line 46
    .line 47
    fill-array-data v3, :array_2

    .line 48
    .line 49
    .line 50
    invoke-direct {v1, v3}, Lcom/mkuczera/f;-><init>([J)V

    .line 51
    .line 52
    .line 53
    const-string v3, "impactHeavy"

    .line 54
    .line 55
    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    sget-object v0, Lcom/mkuczera/c;->a:Ljava/util/Map;

    .line 59
    .line 60
    new-instance v1, Lcom/mkuczera/f;

    .line 61
    .line 62
    const/4 v3, 0x4

    .line 63
    new-array v4, v3, [J

    .line 64
    .line 65
    fill-array-data v4, :array_3

    .line 66
    .line 67
    .line 68
    invoke-direct {v1, v4}, Lcom/mkuczera/f;-><init>([J)V

    .line 69
    .line 70
    .line 71
    const-string v4, "notificationSuccess"

    .line 72
    .line 73
    invoke-interface {v0, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    sget-object v0, Lcom/mkuczera/c;->a:Ljava/util/Map;

    .line 77
    .line 78
    new-instance v1, Lcom/mkuczera/f;

    .line 79
    .line 80
    new-array v4, v3, [J

    .line 81
    .line 82
    fill-array-data v4, :array_4

    .line 83
    .line 84
    .line 85
    invoke-direct {v1, v4}, Lcom/mkuczera/f;-><init>([J)V

    .line 86
    .line 87
    .line 88
    const-string v4, "notificationWarning"

    .line 89
    .line 90
    invoke-interface {v0, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    sget-object v0, Lcom/mkuczera/c;->a:Ljava/util/Map;

    .line 94
    .line 95
    new-instance v1, Lcom/mkuczera/f;

    .line 96
    .line 97
    const/4 v4, 0x6

    .line 98
    new-array v5, v4, [J

    .line 99
    .line 100
    fill-array-data v5, :array_5

    .line 101
    .line 102
    .line 103
    invoke-direct {v1, v5}, Lcom/mkuczera/f;-><init>([J)V

    .line 104
    .line 105
    .line 106
    const-string v5, "notificationError"

    .line 107
    .line 108
    invoke-interface {v0, v5, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    sget-object v0, Lcom/mkuczera/c;->a:Ljava/util/Map;

    .line 112
    .line 113
    new-instance v1, Lcom/mkuczera/f;

    .line 114
    .line 115
    new-array v5, v2, [J

    .line 116
    .line 117
    fill-array-data v5, :array_6

    .line 118
    .line 119
    .line 120
    invoke-direct {v1, v5}, Lcom/mkuczera/f;-><init>([J)V

    .line 121
    .line 122
    .line 123
    const-string v5, "rigid"

    .line 124
    .line 125
    invoke-interface {v0, v5, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    sget-object v0, Lcom/mkuczera/c;->a:Ljava/util/Map;

    .line 129
    .line 130
    new-instance v1, Lcom/mkuczera/f;

    .line 131
    .line 132
    new-array v5, v2, [J

    .line 133
    .line 134
    fill-array-data v5, :array_7

    .line 135
    .line 136
    .line 137
    invoke-direct {v1, v5}, Lcom/mkuczera/f;-><init>([J)V

    .line 138
    .line 139
    .line 140
    const-string v5, "soft"

    .line 141
    .line 142
    invoke-interface {v0, v5, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    sget-object v0, Lcom/mkuczera/c;->a:Ljava/util/Map;

    .line 146
    .line 147
    new-instance v1, Lcom/mkuczera/g;

    .line 148
    .line 149
    invoke-direct {v1, v3}, Lcom/mkuczera/g;-><init>(I)V

    .line 150
    .line 151
    .line 152
    const-string v3, "clockTick"

    .line 153
    .line 154
    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    sget-object v0, Lcom/mkuczera/c;->a:Ljava/util/Map;

    .line 158
    .line 159
    new-instance v1, Lcom/mkuczera/g;

    .line 160
    .line 161
    invoke-direct {v1, v4}, Lcom/mkuczera/g;-><init>(I)V

    .line 162
    .line 163
    .line 164
    const-string v3, "contextClick"

    .line 165
    .line 166
    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    sget-object v0, Lcom/mkuczera/c;->a:Ljava/util/Map;

    .line 170
    .line 171
    new-instance v1, Lcom/mkuczera/g;

    .line 172
    .line 173
    const/4 v3, 0x3

    .line 174
    invoke-direct {v1, v3}, Lcom/mkuczera/g;-><init>(I)V

    .line 175
    .line 176
    .line 177
    const-string v4, "keyboardPress"

    .line 178
    .line 179
    invoke-interface {v0, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    sget-object v0, Lcom/mkuczera/c;->a:Ljava/util/Map;

    .line 183
    .line 184
    new-instance v1, Lcom/mkuczera/g;

    .line 185
    .line 186
    const/4 v4, 0x7

    .line 187
    invoke-direct {v1, v4}, Lcom/mkuczera/g;-><init>(I)V

    .line 188
    .line 189
    .line 190
    const-string v4, "keyboardRelease"

    .line 191
    .line 192
    invoke-interface {v0, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    sget-object v0, Lcom/mkuczera/c;->a:Ljava/util/Map;

    .line 196
    .line 197
    new-instance v1, Lcom/mkuczera/g;

    .line 198
    .line 199
    invoke-direct {v1, v3}, Lcom/mkuczera/g;-><init>(I)V

    .line 200
    .line 201
    .line 202
    const-string v3, "keyboardTap"

    .line 203
    .line 204
    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    sget-object v0, Lcom/mkuczera/c;->a:Ljava/util/Map;

    .line 208
    .line 209
    new-instance v1, Lcom/mkuczera/g;

    .line 210
    .line 211
    const/4 v3, 0x0

    .line 212
    invoke-direct {v1, v3}, Lcom/mkuczera/g;-><init>(I)V

    .line 213
    .line 214
    .line 215
    const-string v4, "longPress"

    .line 216
    .line 217
    invoke-interface {v0, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    sget-object v0, Lcom/mkuczera/c;->a:Ljava/util/Map;

    .line 221
    .line 222
    new-instance v1, Lcom/mkuczera/g;

    .line 223
    .line 224
    const/16 v4, 0x9

    .line 225
    .line 226
    invoke-direct {v1, v4}, Lcom/mkuczera/g;-><init>(I)V

    .line 227
    .line 228
    .line 229
    const-string v4, "textHandleMove"

    .line 230
    .line 231
    invoke-interface {v0, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    sget-object v0, Lcom/mkuczera/c;->a:Ljava/util/Map;

    .line 235
    .line 236
    new-instance v1, Lcom/mkuczera/g;

    .line 237
    .line 238
    const/4 v4, 0x1

    .line 239
    invoke-direct {v1, v4}, Lcom/mkuczera/g;-><init>(I)V

    .line 240
    .line 241
    .line 242
    const-string v5, "virtualKey"

    .line 243
    .line 244
    invoke-interface {v0, v5, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    sget-object v0, Lcom/mkuczera/c;->a:Ljava/util/Map;

    .line 248
    .line 249
    new-instance v1, Lcom/mkuczera/g;

    .line 250
    .line 251
    const/16 v5, 0x8

    .line 252
    .line 253
    invoke-direct {v1, v5}, Lcom/mkuczera/g;-><init>(I)V

    .line 254
    .line 255
    .line 256
    const-string v5, "virtualKeyRelease"

    .line 257
    .line 258
    invoke-interface {v0, v5, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    sget-object v0, Lcom/mkuczera/c;->a:Ljava/util/Map;

    .line 262
    .line 263
    new-instance v1, Lcom/mkuczera/e;

    .line 264
    .line 265
    invoke-direct {v1, v3}, Lcom/mkuczera/e;-><init>(I)V

    .line 266
    .line 267
    .line 268
    const-string v3, "effectClick"

    .line 269
    .line 270
    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    sget-object v0, Lcom/mkuczera/c;->a:Ljava/util/Map;

    .line 274
    .line 275
    new-instance v1, Lcom/mkuczera/e;

    .line 276
    .line 277
    invoke-direct {v1, v4}, Lcom/mkuczera/e;-><init>(I)V

    .line 278
    .line 279
    .line 280
    const-string v3, "effectDoubleClick"

    .line 281
    .line 282
    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    sget-object v0, Lcom/mkuczera/c;->a:Ljava/util/Map;

    .line 286
    .line 287
    new-instance v1, Lcom/mkuczera/e;

    .line 288
    .line 289
    const/4 v3, 0x5

    .line 290
    invoke-direct {v1, v3}, Lcom/mkuczera/e;-><init>(I)V

    .line 291
    .line 292
    .line 293
    const-string v3, "effectHeavyClick"

    .line 294
    .line 295
    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    sget-object v0, Lcom/mkuczera/c;->a:Ljava/util/Map;

    .line 299
    .line 300
    new-instance v1, Lcom/mkuczera/e;

    .line 301
    .line 302
    invoke-direct {v1, v2}, Lcom/mkuczera/e;-><init>(I)V

    .line 303
    .line 304
    .line 305
    const-string v2, "effectTick"

    .line 306
    .line 307
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    return-void

    .line 311
    :array_0
    .array-data 8
        0x0
        0x14
    .end array-data

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
    :array_1
    .array-data 8
        0x0
        0x28
    .end array-data

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
    :array_2
    .array-data 8
        0x0
        0x3c
    .end array-data

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
    :array_3
    .array-data 8
        0x0
        0x28
        0x3c
        0x14
    .end array-data

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
    :array_4
    .array-data 8
        0x0
        0x14
        0x3c
        0x28
    .end array-data

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
    :array_5
    .array-data 8
        0x0
        0x14
        0x28
        0x1e
        0x28
        0x28
    .end array-data

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
    :array_6
    .array-data 8
        0x0
        0x1e
    .end array-data

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
    :array_7
    .array-data 8
        0x0
        0xa
    .end array-data
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

.method public static a(Ljava/lang/String;)Lcom/mkuczera/b;
    .locals 1

    sget-object v0, Lcom/mkuczera/c;->a:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/mkuczera/b;

    return-object p0
.end method
