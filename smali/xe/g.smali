.class public Lxe/g;
.super Lxe/b;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x18
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxe/g$b;
    }
.end annotation


# instance fields
.field private final j:Lxe/g$b;

.field private k:Landroid/net/Network;

.field private l:Landroid/net/NetworkCapabilities;


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lxe/b;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-object p1, p0, Lxe/g;->k:Landroid/net/Network;

    .line 6
    .line 7
    iput-object p1, p0, Lxe/g;->l:Landroid/net/NetworkCapabilities;

    .line 8
    .line 9
    new-instance v0, Lxe/g$b;

    .line 10
    .line 11
    invoke-direct {v0, p0, p1}, Lxe/g$b;-><init>(Lxe/g;Lxe/g$a;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lxe/g;->j:Lxe/g$b;

    .line 15
    .line 16
    return-void
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
.end method

.method public static synthetic l(Lxe/g;)V
    .locals 0

    invoke-direct {p0}, Lxe/g;->r()V

    return-void
.end method

.method static synthetic m(Lxe/g;)Landroid/net/Network;
    .locals 0

    iget-object p0, p0, Lxe/g;->k:Landroid/net/Network;

    return-object p0
.end method

.method static synthetic n(Lxe/g;Landroid/net/Network;)Landroid/net/Network;
    .locals 0

    iput-object p1, p0, Lxe/g;->k:Landroid/net/Network;

    return-object p1
.end method

.method static synthetic o(Lxe/g;I)V
    .locals 0

    invoke-direct {p0, p1}, Lxe/g;->q(I)V

    return-void
.end method

.method static synthetic p(Lxe/g;Landroid/net/NetworkCapabilities;)Landroid/net/NetworkCapabilities;
    .locals 0

    iput-object p1, p0, Lxe/g;->l:Landroid/net/NetworkCapabilities;

    return-object p1
.end method

.method private q(I)V
    .locals 4

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lxe/f;

    invoke-direct {v1, p0}, Lxe/f;-><init>(Lxe/g;)V

    int-to-long v2, p1

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method private synthetic r()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lxe/b;->c()Landroid/net/ConnectivityManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lxe/g;->k:Landroid/net/Network;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/net/ConnectivityManager;->getNetworkCapabilities(Landroid/net/Network;)Landroid/net/NetworkCapabilities;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Lxe/g;->l:Landroid/net/NetworkCapabilities;

    .line 12
    .line 13
    invoke-virtual {p0}, Lxe/g;->s()V

    .line 14
    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method


# virtual methods
.method public g()V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lxe/b;->c()Landroid/net/ConnectivityManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetwork()Landroid/net/Network;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lxe/g;->k:Landroid/net/Network;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-direct {p0, v0}, Lxe/g;->q(I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lxe/b;->c()Landroid/net/ConnectivityManager;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v1, p0, Lxe/g;->j:Lxe/g$b;

    .line 20
    .line 21
    invoke-static {v0, v1}, Lxe/e;->a(Landroid/net/ConnectivityManager;Landroid/net/ConnectivityManager$NetworkCallback;)V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    .line 23
    .line 24
    :catch_0
    return-void
.end method

.method public j()V
    .locals 2

    :try_start_0
    invoke-virtual {p0}, Lxe/b;->c()Landroid/net/ConnectivityManager;

    move-result-object v0

    iget-object v1, p0, Lxe/g;->j:Lxe/g$b;

    invoke-virtual {v0, v1}, Landroid/net/ConnectivityManager;->unregisterNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method s()V
    .locals 9
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    .line 1
    sget-object v0, Lye/b;->p:Lye/b;

    .line 2
    .line 3
    iget-object v1, p0, Lxe/g;->k:Landroid/net/Network;

    .line 4
    .line 5
    iget-object v2, p0, Lxe/g;->l:Landroid/net/NetworkCapabilities;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x0

    .line 9
    if-eqz v2, :cond_9

    .line 10
    .line 11
    const/4 v5, 0x2

    .line 12
    invoke-virtual {v2, v5}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    .line 13
    .line 14
    .line 15
    move-result v5

    .line 16
    const/4 v6, 0x1

    .line 17
    if-eqz v5, :cond_0

    .line 18
    .line 19
    sget-object v0, Lye/b;->l:Lye/b;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {v2, v4}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    if-eqz v5, :cond_1

    .line 27
    .line 28
    sget-object v0, Lye/b;->m:Lye/b;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    const/4 v5, 0x3

    .line 32
    invoke-virtual {v2, v5}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    if-eqz v5, :cond_2

    .line 37
    .line 38
    sget-object v0, Lye/b;->n:Lye/b;

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    invoke-virtual {v2, v6}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    if-eqz v5, :cond_3

    .line 46
    .line 47
    sget-object v0, Lye/b;->q:Lye/b;

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_3
    const/4 v5, 0x4

    .line 51
    invoke-virtual {v2, v5}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    .line 52
    .line 53
    .line 54
    move-result v5

    .line 55
    if-eqz v5, :cond_4

    .line 56
    .line 57
    sget-object v0, Lye/b;->s:Lye/b;

    .line 58
    .line 59
    :cond_4
    :goto_0
    if-eqz v1, :cond_5

    .line 60
    .line 61
    invoke-virtual {p0}, Lxe/b;->c()Landroid/net/ConnectivityManager;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    invoke-virtual {v5, v1}, Landroid/net/ConnectivityManager;->getNetworkInfo(Landroid/net/Network;)Landroid/net/NetworkInfo;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    goto :goto_1

    .line 70
    :cond_5
    move-object v5, v3

    .line 71
    :goto_1
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 72
    .line 73
    const/16 v8, 0x1c

    .line 74
    .line 75
    if-lt v7, v8, :cond_6

    .line 76
    .line 77
    const/16 v7, 0x15

    .line 78
    .line 79
    invoke-virtual {v2, v7}, Landroid/net/NetworkCapabilities;->hasCapability(I)Z

    .line 80
    .line 81
    .line 82
    move-result v7

    .line 83
    xor-int/2addr v7, v6

    .line 84
    goto :goto_2

    .line 85
    :cond_6
    if-eqz v1, :cond_7

    .line 86
    .line 87
    if-eqz v5, :cond_7

    .line 88
    .line 89
    invoke-virtual {v5}, Landroid/net/NetworkInfo;->getDetailedState()Landroid/net/NetworkInfo$DetailedState;

    .line 90
    .line 91
    .line 92
    move-result-object v7

    .line 93
    sget-object v8, Landroid/net/NetworkInfo$DetailedState;->CONNECTED:Landroid/net/NetworkInfo$DetailedState;

    .line 94
    .line 95
    invoke-virtual {v7, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v7

    .line 99
    if-nez v7, :cond_7

    .line 100
    .line 101
    move v7, v6

    .line 102
    goto :goto_2

    .line 103
    :cond_7
    move v7, v4

    .line 104
    :goto_2
    const/16 v8, 0xc

    .line 105
    .line 106
    invoke-virtual {v2, v8}, Landroid/net/NetworkCapabilities;->hasCapability(I)Z

    .line 107
    .line 108
    .line 109
    move-result v8

    .line 110
    if-eqz v8, :cond_8

    .line 111
    .line 112
    const/16 v8, 0x10

    .line 113
    .line 114
    invoke-virtual {v2, v8}, Landroid/net/NetworkCapabilities;->hasCapability(I)Z

    .line 115
    .line 116
    .line 117
    move-result v2

    .line 118
    if-eqz v2, :cond_8

    .line 119
    .line 120
    if-nez v7, :cond_8

    .line 121
    .line 122
    move v4, v6

    .line 123
    :cond_8
    if-eqz v1, :cond_a

    .line 124
    .line 125
    sget-object v1, Lye/b;->m:Lye/b;

    .line 126
    .line 127
    if-ne v0, v1, :cond_a

    .line 128
    .line 129
    if-eqz v4, :cond_a

    .line 130
    .line 131
    invoke-static {v5}, Lye/a;->a(Landroid/net/NetworkInfo;)Lye/a;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    goto :goto_3

    .line 136
    :cond_9
    sget-object v0, Lye/b;->o:Lye/b;

    .line 137
    .line 138
    :cond_a
    :goto_3
    invoke-virtual {p0, v0, v3, v4}, Lxe/b;->k(Lye/b;Lye/a;Z)V

    .line 139
    .line 140
    .line 141
    return-void
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
