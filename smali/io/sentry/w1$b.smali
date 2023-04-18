.class public final Lio/sentry/w1$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/r0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/sentry/w1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/sentry/r0<",
        "Lio/sentry/w1;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lio/sentry/x0;Lio/sentry/g0;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lio/sentry/w1$b;->b(Lio/sentry/x0;Lio/sentry/g0;)Lio/sentry/w1;

    move-result-object p1

    return-object p1
.end method

.method public b(Lio/sentry/x0;Lio/sentry/g0;)Lio/sentry/w1;
    .locals 5

    .line 1
    invoke-virtual {p1}, Lio/sentry/vendor/gson/stream/a;->f()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lio/sentry/w1;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1}, Lio/sentry/w1;-><init>(Lio/sentry/w1$a;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    :goto_0
    invoke-virtual {p1}, Lio/sentry/vendor/gson/stream/a;->z0()Lio/sentry/vendor/gson/stream/b;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    sget-object v3, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    .line 15
    .line 16
    if-ne v2, v3, :cond_1b

    .line 17
    .line 18
    invoke-virtual {p1}, Lio/sentry/vendor/gson/stream/a;->g0()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    const/4 v4, -0x1

    .line 30
    sparse-switch v3, :sswitch_data_0

    .line 31
    .line 32
    .line 33
    goto/16 :goto_1

    .line 34
    .line 35
    :sswitch_0
    const-string v3, "transactions"

    .line 36
    .line 37
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-nez v3, :cond_1

    .line 42
    .line 43
    goto/16 :goto_1

    .line 44
    .line 45
    :cond_1
    const/16 v4, 0x18

    .line 46
    .line 47
    goto/16 :goto_1

    .line 48
    .line 49
    :sswitch_1
    const-string v3, "sampled_profile"

    .line 50
    .line 51
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    if-nez v3, :cond_2

    .line 56
    .line 57
    goto/16 :goto_1

    .line 58
    .line 59
    :cond_2
    const/16 v4, 0x17

    .line 60
    .line 61
    goto/16 :goto_1

    .line 62
    .line 63
    :sswitch_2
    const-string v3, "platform"

    .line 64
    .line 65
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    if-nez v3, :cond_3

    .line 70
    .line 71
    goto/16 :goto_1

    .line 72
    .line 73
    :cond_3
    const/16 v4, 0x16

    .line 74
    .line 75
    goto/16 :goto_1

    .line 76
    .line 77
    :sswitch_3
    const-string v3, "trace_id"

    .line 78
    .line 79
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    if-nez v3, :cond_4

    .line 84
    .line 85
    goto/16 :goto_1

    .line 86
    .line 87
    :cond_4
    const/16 v4, 0x15

    .line 88
    .line 89
    goto/16 :goto_1

    .line 90
    .line 91
    :sswitch_4
    const-string v3, "truncation_reason"

    .line 92
    .line 93
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v3

    .line 97
    if-nez v3, :cond_5

    .line 98
    .line 99
    goto/16 :goto_1

    .line 100
    .line 101
    :cond_5
    const/16 v4, 0x14

    .line 102
    .line 103
    goto/16 :goto_1

    .line 104
    .line 105
    :sswitch_5
    const-string v3, "device_os_version"

    .line 106
    .line 107
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v3

    .line 111
    if-nez v3, :cond_6

    .line 112
    .line 113
    goto/16 :goto_1

    .line 114
    .line 115
    :cond_6
    const/16 v4, 0x13

    .line 116
    .line 117
    goto/16 :goto_1

    .line 118
    .line 119
    :sswitch_6
    const-string v3, "transaction_id"

    .line 120
    .line 121
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v3

    .line 125
    if-nez v3, :cond_7

    .line 126
    .line 127
    goto/16 :goto_1

    .line 128
    .line 129
    :cond_7
    const/16 v4, 0x12

    .line 130
    .line 131
    goto/16 :goto_1

    .line 132
    .line 133
    :sswitch_7
    const-string v3, "architecture"

    .line 134
    .line 135
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v3

    .line 139
    if-nez v3, :cond_8

    .line 140
    .line 141
    goto/16 :goto_1

    .line 142
    .line 143
    :cond_8
    const/16 v4, 0x11

    .line 144
    .line 145
    goto/16 :goto_1

    .line 146
    .line 147
    :sswitch_8
    const-string v3, "device_os_name"

    .line 148
    .line 149
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v3

    .line 153
    if-nez v3, :cond_9

    .line 154
    .line 155
    goto/16 :goto_1

    .line 156
    .line 157
    :cond_9
    const/16 v4, 0x10

    .line 158
    .line 159
    goto/16 :goto_1

    .line 160
    .line 161
    :sswitch_9
    const-string v3, "transaction_name"

    .line 162
    .line 163
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result v3

    .line 167
    if-nez v3, :cond_a

    .line 168
    .line 169
    goto/16 :goto_1

    .line 170
    .line 171
    :cond_a
    const/16 v4, 0xf

    .line 172
    .line 173
    goto/16 :goto_1

    .line 174
    .line 175
    :sswitch_a
    const-string v3, "environment"

    .line 176
    .line 177
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result v3

    .line 181
    if-nez v3, :cond_b

    .line 182
    .line 183
    goto/16 :goto_1

    .line 184
    .line 185
    :cond_b
    const/16 v4, 0xe

    .line 186
    .line 187
    goto/16 :goto_1

    .line 188
    .line 189
    :sswitch_b
    const-string v3, "version_name"

    .line 190
    .line 191
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    move-result v3

    .line 195
    if-nez v3, :cond_c

    .line 196
    .line 197
    goto/16 :goto_1

    .line 198
    .line 199
    :cond_c
    const/16 v4, 0xd

    .line 200
    .line 201
    goto/16 :goto_1

    .line 202
    .line 203
    :sswitch_c
    const-string v3, "version_code"

    .line 204
    .line 205
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    move-result v3

    .line 209
    if-nez v3, :cond_d

    .line 210
    .line 211
    goto/16 :goto_1

    .line 212
    .line 213
    :cond_d
    const/16 v4, 0xc

    .line 214
    .line 215
    goto/16 :goto_1

    .line 216
    .line 217
    :sswitch_d
    const-string v3, "device_cpu_frequencies"

    .line 218
    .line 219
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    move-result v3

    .line 223
    if-nez v3, :cond_e

    .line 224
    .line 225
    goto/16 :goto_1

    .line 226
    .line 227
    :cond_e
    const/16 v4, 0xb

    .line 228
    .line 229
    goto/16 :goto_1

    .line 230
    .line 231
    :sswitch_e
    const-string v3, "device_physical_memory_bytes"

    .line 232
    .line 233
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    move-result v3

    .line 237
    if-nez v3, :cond_f

    .line 238
    .line 239
    goto/16 :goto_1

    .line 240
    .line 241
    :cond_f
    const/16 v4, 0xa

    .line 242
    .line 243
    goto/16 :goto_1

    .line 244
    .line 245
    :sswitch_f
    const-string v3, "measurements"

    .line 246
    .line 247
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 248
    .line 249
    .line 250
    move-result v3

    .line 251
    if-nez v3, :cond_10

    .line 252
    .line 253
    goto/16 :goto_1

    .line 254
    .line 255
    :cond_10
    const/16 v4, 0x9

    .line 256
    .line 257
    goto/16 :goto_1

    .line 258
    .line 259
    :sswitch_10
    const-string v3, "duration_ns"

    .line 260
    .line 261
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    move-result v3

    .line 265
    if-nez v3, :cond_11

    .line 266
    .line 267
    goto/16 :goto_1

    .line 268
    .line 269
    :cond_11
    const/16 v4, 0x8

    .line 270
    .line 271
    goto/16 :goto_1

    .line 272
    .line 273
    :sswitch_11
    const-string v3, "device_is_emulator"

    .line 274
    .line 275
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    move-result v3

    .line 279
    if-nez v3, :cond_12

    .line 280
    .line 281
    goto :goto_1

    .line 282
    :cond_12
    const/4 v4, 0x7

    .line 283
    goto :goto_1

    .line 284
    :sswitch_12
    const-string v3, "device_model"

    .line 285
    .line 286
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 287
    .line 288
    .line 289
    move-result v3

    .line 290
    if-nez v3, :cond_13

    .line 291
    .line 292
    goto :goto_1

    .line 293
    :cond_13
    const/4 v4, 0x6

    .line 294
    goto :goto_1

    .line 295
    :sswitch_13
    const-string v3, "device_os_build_number"

    .line 296
    .line 297
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 298
    .line 299
    .line 300
    move-result v3

    .line 301
    if-nez v3, :cond_14

    .line 302
    .line 303
    goto :goto_1

    .line 304
    :cond_14
    const/4 v4, 0x5

    .line 305
    goto :goto_1

    .line 306
    :sswitch_14
    const-string v3, "profile_id"

    .line 307
    .line 308
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 309
    .line 310
    .line 311
    move-result v3

    .line 312
    if-nez v3, :cond_15

    .line 313
    .line 314
    goto :goto_1

    .line 315
    :cond_15
    const/4 v4, 0x4

    .line 316
    goto :goto_1

    .line 317
    :sswitch_15
    const-string v3, "device_locale"

    .line 318
    .line 319
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 320
    .line 321
    .line 322
    move-result v3

    .line 323
    if-nez v3, :cond_16

    .line 324
    .line 325
    goto :goto_1

    .line 326
    :cond_16
    const/4 v4, 0x3

    .line 327
    goto :goto_1

    .line 328
    :sswitch_16
    const-string v3, "build_id"

    .line 329
    .line 330
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 331
    .line 332
    .line 333
    move-result v3

    .line 334
    if-nez v3, :cond_17

    .line 335
    .line 336
    goto :goto_1

    .line 337
    :cond_17
    const/4 v4, 0x2

    .line 338
    goto :goto_1

    .line 339
    :sswitch_17
    const-string v3, "android_api_level"

    .line 340
    .line 341
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 342
    .line 343
    .line 344
    move-result v3

    .line 345
    if-nez v3, :cond_18

    .line 346
    .line 347
    goto :goto_1

    .line 348
    :cond_18
    const/4 v4, 0x1

    .line 349
    goto :goto_1

    .line 350
    :sswitch_18
    const-string v3, "device_manufacturer"

    .line 351
    .line 352
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 353
    .line 354
    .line 355
    move-result v3

    .line 356
    if-nez v3, :cond_19

    .line 357
    .line 358
    goto :goto_1

    .line 359
    :cond_19
    const/4 v4, 0x0

    .line 360
    :goto_1
    packed-switch v4, :pswitch_data_0

    .line 361
    .line 362
    .line 363
    if-nez v1, :cond_1a

    .line 364
    .line 365
    new-instance v1, Lj$/util/concurrent/ConcurrentHashMap;

    .line 366
    .line 367
    invoke-direct {v1}, Lj$/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 368
    .line 369
    .line 370
    :cond_1a
    invoke-virtual {p1, p2, v1, v2}, Lio/sentry/x0;->b1(Lio/sentry/g0;Ljava/util/Map;Ljava/lang/String;)V

    .line 371
    .line 372
    .line 373
    goto/16 :goto_0

    .line 374
    .line 375
    :pswitch_0
    new-instance v2, Lio/sentry/x1$a;

    .line 376
    .line 377
    invoke-direct {v2}, Lio/sentry/x1$a;-><init>()V

    .line 378
    .line 379
    .line 380
    invoke-virtual {p1, p2, v2}, Lio/sentry/x0;->U0(Lio/sentry/g0;Lio/sentry/r0;)Ljava/util/List;

    .line 381
    .line 382
    .line 383
    move-result-object v2

    .line 384
    if-eqz v2, :cond_0

    .line 385
    .line 386
    invoke-static {v0}, Lio/sentry/w1;->k(Lio/sentry/w1;)Ljava/util/List;

    .line 387
    .line 388
    .line 389
    move-result-object v3

    .line 390
    invoke-interface {v3, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 391
    .line 392
    .line 393
    goto/16 :goto_0

    .line 394
    .line 395
    :pswitch_1
    invoke-virtual {p1}, Lio/sentry/x0;->Z0()Ljava/lang/String;

    .line 396
    .line 397
    .line 398
    move-result-object v2

    .line 399
    if-eqz v2, :cond_0

    .line 400
    .line 401
    invoke-static {v0, v2}, Lio/sentry/w1;->s(Lio/sentry/w1;Ljava/lang/String;)Ljava/lang/String;

    .line 402
    .line 403
    .line 404
    goto/16 :goto_0

    .line 405
    .line 406
    :pswitch_2
    invoke-virtual {p1}, Lio/sentry/x0;->Z0()Ljava/lang/String;

    .line 407
    .line 408
    .line 409
    move-result-object v2

    .line 410
    if-eqz v2, :cond_0

    .line 411
    .line 412
    invoke-static {v0, v2}, Lio/sentry/w1;->e(Lio/sentry/w1;Ljava/lang/String;)Ljava/lang/String;

    .line 413
    .line 414
    .line 415
    goto/16 :goto_0

    .line 416
    .line 417
    :pswitch_3
    invoke-virtual {p1}, Lio/sentry/x0;->Z0()Ljava/lang/String;

    .line 418
    .line 419
    .line 420
    move-result-object v2

    .line 421
    if-eqz v2, :cond_0

    .line 422
    .line 423
    invoke-static {v0, v2}, Lio/sentry/w1;->m(Lio/sentry/w1;Ljava/lang/String;)Ljava/lang/String;

    .line 424
    .line 425
    .line 426
    goto/16 :goto_0

    .line 427
    .line 428
    :pswitch_4
    invoke-virtual {p1}, Lio/sentry/x0;->Z0()Ljava/lang/String;

    .line 429
    .line 430
    .line 431
    move-result-object v2

    .line 432
    if-eqz v2, :cond_0

    .line 433
    .line 434
    invoke-static {v0, v2}, Lio/sentry/w1;->q(Lio/sentry/w1;Ljava/lang/String;)Ljava/lang/String;

    .line 435
    .line 436
    .line 437
    goto/16 :goto_0

    .line 438
    .line 439
    :pswitch_5
    invoke-virtual {p1}, Lio/sentry/x0;->Z0()Ljava/lang/String;

    .line 440
    .line 441
    .line 442
    move-result-object v2

    .line 443
    if-eqz v2, :cond_0

    .line 444
    .line 445
    invoke-static {v0, v2}, Lio/sentry/w1;->x(Lio/sentry/w1;Ljava/lang/String;)Ljava/lang/String;

    .line 446
    .line 447
    .line 448
    goto/16 :goto_0

    .line 449
    .line 450
    :pswitch_6
    invoke-virtual {p1}, Lio/sentry/x0;->Z0()Ljava/lang/String;

    .line 451
    .line 452
    .line 453
    move-result-object v2

    .line 454
    if-eqz v2, :cond_0

    .line 455
    .line 456
    invoke-static {v0, v2}, Lio/sentry/w1;->l(Lio/sentry/w1;Ljava/lang/String;)Ljava/lang/String;

    .line 457
    .line 458
    .line 459
    goto/16 :goto_0

    .line 460
    .line 461
    :pswitch_7
    invoke-virtual {p1}, Lio/sentry/x0;->Z0()Ljava/lang/String;

    .line 462
    .line 463
    .line 464
    move-result-object v2

    .line 465
    if-eqz v2, :cond_0

    .line 466
    .line 467
    invoke-static {v0, v2}, Lio/sentry/w1;->z(Lio/sentry/w1;Ljava/lang/String;)Ljava/lang/String;

    .line 468
    .line 469
    .line 470
    goto/16 :goto_0

    .line 471
    .line 472
    :pswitch_8
    invoke-virtual {p1}, Lio/sentry/x0;->Z0()Ljava/lang/String;

    .line 473
    .line 474
    .line 475
    move-result-object v2

    .line 476
    if-eqz v2, :cond_0

    .line 477
    .line 478
    invoke-static {v0, v2}, Lio/sentry/w1;->w(Lio/sentry/w1;Ljava/lang/String;)Ljava/lang/String;

    .line 479
    .line 480
    .line 481
    goto/16 :goto_0

    .line 482
    .line 483
    :pswitch_9
    invoke-virtual {p1}, Lio/sentry/x0;->Z0()Ljava/lang/String;

    .line 484
    .line 485
    .line 486
    move-result-object v2

    .line 487
    if-eqz v2, :cond_0

    .line 488
    .line 489
    invoke-static {v0, v2}, Lio/sentry/w1;->g(Lio/sentry/w1;Ljava/lang/String;)Ljava/lang/String;

    .line 490
    .line 491
    .line 492
    goto/16 :goto_0

    .line 493
    .line 494
    :pswitch_a
    invoke-virtual {p1}, Lio/sentry/x0;->Z0()Ljava/lang/String;

    .line 495
    .line 496
    .line 497
    move-result-object v2

    .line 498
    if-eqz v2, :cond_0

    .line 499
    .line 500
    invoke-static {v0, v2}, Lio/sentry/w1;->p(Lio/sentry/w1;Ljava/lang/String;)Ljava/lang/String;

    .line 501
    .line 502
    .line 503
    goto/16 :goto_0

    .line 504
    .line 505
    :pswitch_b
    invoke-virtual {p1}, Lio/sentry/x0;->Z0()Ljava/lang/String;

    .line 506
    .line 507
    .line 508
    move-result-object v2

    .line 509
    if-eqz v2, :cond_0

    .line 510
    .line 511
    invoke-static {v0, v2}, Lio/sentry/w1;->j(Lio/sentry/w1;Ljava/lang/String;)Ljava/lang/String;

    .line 512
    .line 513
    .line 514
    goto/16 :goto_0

    .line 515
    .line 516
    :pswitch_c
    invoke-virtual {p1}, Lio/sentry/x0;->Z0()Ljava/lang/String;

    .line 517
    .line 518
    .line 519
    move-result-object v2

    .line 520
    if-eqz v2, :cond_0

    .line 521
    .line 522
    invoke-static {v0, v2}, Lio/sentry/w1;->i(Lio/sentry/w1;Ljava/lang/String;)Ljava/lang/String;

    .line 523
    .line 524
    .line 525
    goto/16 :goto_0

    .line 526
    .line 527
    :pswitch_d
    invoke-virtual {p1}, Lio/sentry/x0;->X0()Ljava/lang/Object;

    .line 528
    .line 529
    .line 530
    move-result-object v2

    .line 531
    check-cast v2, Ljava/util/List;

    .line 532
    .line 533
    if-eqz v2, :cond_0

    .line 534
    .line 535
    invoke-static {v0, v2}, Lio/sentry/w1;->b(Lio/sentry/w1;Ljava/util/List;)Ljava/util/List;

    .line 536
    .line 537
    .line 538
    goto/16 :goto_0

    .line 539
    .line 540
    :pswitch_e
    invoke-virtual {p1}, Lio/sentry/x0;->Z0()Ljava/lang/String;

    .line 541
    .line 542
    .line 543
    move-result-object v2

    .line 544
    if-eqz v2, :cond_0

    .line 545
    .line 546
    invoke-static {v0, v2}, Lio/sentry/w1;->d(Lio/sentry/w1;Ljava/lang/String;)Ljava/lang/String;

    .line 547
    .line 548
    .line 549
    goto/16 :goto_0

    .line 550
    .line 551
    :pswitch_f
    new-instance v2, Lio/sentry/profilemeasurements/a$a;

    .line 552
    .line 553
    invoke-direct {v2}, Lio/sentry/profilemeasurements/a$a;-><init>()V

    .line 554
    .line 555
    .line 556
    invoke-virtual {p1, p2, v2}, Lio/sentry/x0;->W0(Lio/sentry/g0;Lio/sentry/r0;)Ljava/util/Map;

    .line 557
    .line 558
    .line 559
    move-result-object v2

    .line 560
    if-eqz v2, :cond_0

    .line 561
    .line 562
    invoke-static {v0}, Lio/sentry/w1;->r(Lio/sentry/w1;)Ljava/util/Map;

    .line 563
    .line 564
    .line 565
    move-result-object v3

    .line 566
    invoke-interface {v3, v2}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 567
    .line 568
    .line 569
    goto/16 :goto_0

    .line 570
    .line 571
    :pswitch_10
    invoke-virtual {p1}, Lio/sentry/x0;->Z0()Ljava/lang/String;

    .line 572
    .line 573
    .line 574
    move-result-object v2

    .line 575
    if-eqz v2, :cond_0

    .line 576
    .line 577
    invoke-static {v0, v2}, Lio/sentry/w1;->h(Lio/sentry/w1;Ljava/lang/String;)Ljava/lang/String;

    .line 578
    .line 579
    .line 580
    goto/16 :goto_0

    .line 581
    .line 582
    :pswitch_11
    invoke-virtual {p1}, Lio/sentry/x0;->O0()Ljava/lang/Boolean;

    .line 583
    .line 584
    .line 585
    move-result-object v2

    .line 586
    if-eqz v2, :cond_0

    .line 587
    .line 588
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 589
    .line 590
    .line 591
    move-result v2

    .line 592
    invoke-static {v0, v2}, Lio/sentry/w1;->y(Lio/sentry/w1;Z)Z

    .line 593
    .line 594
    .line 595
    goto/16 :goto_0

    .line 596
    .line 597
    :pswitch_12
    invoke-virtual {p1}, Lio/sentry/x0;->Z0()Ljava/lang/String;

    .line 598
    .line 599
    .line 600
    move-result-object v2

    .line 601
    if-eqz v2, :cond_0

    .line 602
    .line 603
    invoke-static {v0, v2}, Lio/sentry/w1;->u(Lio/sentry/w1;Ljava/lang/String;)Ljava/lang/String;

    .line 604
    .line 605
    .line 606
    goto/16 :goto_0

    .line 607
    .line 608
    :pswitch_13
    invoke-virtual {p1}, Lio/sentry/x0;->Z0()Ljava/lang/String;

    .line 609
    .line 610
    .line 611
    move-result-object v2

    .line 612
    if-eqz v2, :cond_0

    .line 613
    .line 614
    invoke-static {v0, v2}, Lio/sentry/w1;->v(Lio/sentry/w1;Ljava/lang/String;)Ljava/lang/String;

    .line 615
    .line 616
    .line 617
    goto/16 :goto_0

    .line 618
    .line 619
    :pswitch_14
    invoke-virtual {p1}, Lio/sentry/x0;->Z0()Ljava/lang/String;

    .line 620
    .line 621
    .line 622
    move-result-object v2

    .line 623
    if-eqz v2, :cond_0

    .line 624
    .line 625
    invoke-static {v0, v2}, Lio/sentry/w1;->o(Lio/sentry/w1;Ljava/lang/String;)Ljava/lang/String;

    .line 626
    .line 627
    .line 628
    goto/16 :goto_0

    .line 629
    .line 630
    :pswitch_15
    invoke-virtual {p1}, Lio/sentry/x0;->Z0()Ljava/lang/String;

    .line 631
    .line 632
    .line 633
    move-result-object v2

    .line 634
    if-eqz v2, :cond_0

    .line 635
    .line 636
    invoke-static {v0, v2}, Lio/sentry/w1;->n(Lio/sentry/w1;Ljava/lang/String;)Ljava/lang/String;

    .line 637
    .line 638
    .line 639
    goto/16 :goto_0

    .line 640
    .line 641
    :pswitch_16
    invoke-virtual {p1}, Lio/sentry/x0;->Z0()Ljava/lang/String;

    .line 642
    .line 643
    .line 644
    move-result-object v2

    .line 645
    if-eqz v2, :cond_0

    .line 646
    .line 647
    invoke-static {v0, v2}, Lio/sentry/w1;->f(Lio/sentry/w1;Ljava/lang/String;)Ljava/lang/String;

    .line 648
    .line 649
    .line 650
    goto/16 :goto_0

    .line 651
    .line 652
    :pswitch_17
    invoke-virtual {p1}, Lio/sentry/x0;->T0()Ljava/lang/Integer;

    .line 653
    .line 654
    .line 655
    move-result-object v2

    .line 656
    if-eqz v2, :cond_0

    .line 657
    .line 658
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 659
    .line 660
    .line 661
    move-result v2

    .line 662
    invoke-static {v0, v2}, Lio/sentry/w1;->c(Lio/sentry/w1;I)I

    .line 663
    .line 664
    .line 665
    goto/16 :goto_0

    .line 666
    .line 667
    :pswitch_18
    invoke-virtual {p1}, Lio/sentry/x0;->Z0()Ljava/lang/String;

    .line 668
    .line 669
    .line 670
    move-result-object v2

    .line 671
    if-eqz v2, :cond_0

    .line 672
    .line 673
    invoke-static {v0, v2}, Lio/sentry/w1;->t(Lio/sentry/w1;Ljava/lang/String;)Ljava/lang/String;

    .line 674
    .line 675
    .line 676
    goto/16 :goto_0

    .line 677
    .line 678
    :cond_1b
    invoke-virtual {v0, v1}, Lio/sentry/w1;->G(Ljava/util/Map;)V

    .line 679
    .line 680
    .line 681
    invoke-virtual {p1}, Lio/sentry/vendor/gson/stream/a;->s()V

    .line 682
    .line 683
    .line 684
    return-object v0

    .line 685
    :sswitch_data_0
    .sparse-switch
        -0x7f2b14e6 -> :sswitch_18
        -0x761ad0b1 -> :sswitch_17
        -0x55461374 -> :sswitch_16
        -0x45ddbf9d -> :sswitch_15
        -0x41b8e48f -> :sswitch_14
        -0x2ab74f34 -> :sswitch_13
        -0x233b1c00 -> :sswitch_12
        -0x1e8c4ddf -> :sswitch_11
        -0x1c7eb3b0 -> :sswitch_10
        -0x159763c9 -> :sswitch_f
        -0x13d06b14 -> :sswitch_e
        -0xca6e506 -> :sswitch_d
        -0x6236f0c -> :sswitch_c
        -0x61ea26e -> :sswitch_b
        -0x51ecded -> :sswitch_a
        0x1e547b4c -> :sswitch_9
        0x2f79431d -> :sswitch_8
        0x320c6953 -> :sswitch_7
        0x3c3c4a1c -> :sswitch_6
        0x3ebcb306 -> :sswitch_5
        0x4560227a -> :sswitch_4
        0x4bb73e55 -> :sswitch_3
        0x6fbd6873 -> :sswitch_2
        0x746ad664 -> :sswitch_1
        0x74798955 -> :sswitch_0
    .end sparse-switch

    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
