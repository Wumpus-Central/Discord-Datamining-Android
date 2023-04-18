.class public final Lio/sentry/protocol/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/r0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/sentry/protocol/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/sentry/r0<",
        "Lio/sentry/protocol/e;",
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

    invoke-virtual {p0, p1, p2}, Lio/sentry/protocol/e$a;->b(Lio/sentry/x0;Lio/sentry/g0;)Lio/sentry/protocol/e;

    move-result-object p1

    return-object p1
.end method

.method public b(Lio/sentry/x0;Lio/sentry/g0;)Lio/sentry/protocol/e;
    .locals 5

    .line 1
    invoke-virtual {p1}, Lio/sentry/vendor/gson/stream/a;->f()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lio/sentry/protocol/e;

    .line 5
    .line 6
    invoke-direct {v0}, Lio/sentry/protocol/e;-><init>()V

    .line 7
    .line 8
    .line 9
    const/4 v1, 0x0

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
    if-ne v2, v3, :cond_21

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
    const-string v3, "screen_height_pixels"

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
    const/16 v4, 0x1e

    .line 46
    .line 47
    goto/16 :goto_1

    .line 48
    .line 49
    :sswitch_1
    const-string v3, "free_storage"

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
    const/16 v4, 0x1d

    .line 60
    .line 61
    goto/16 :goto_1

    .line 62
    .line 63
    :sswitch_2
    const-string v3, "external_free_storage"

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
    const/16 v4, 0x1c

    .line 74
    .line 75
    goto/16 :goto_1

    .line 76
    .line 77
    :sswitch_3
    const-string v3, "charging"

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
    const/16 v4, 0x1b

    .line 88
    .line 89
    goto/16 :goto_1

    .line 90
    .line 91
    :sswitch_4
    const-string v3, "memory_size"

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
    const/16 v4, 0x1a

    .line 102
    .line 103
    goto/16 :goto_1

    .line 104
    .line 105
    :sswitch_5
    const-string v3, "usable_memory"

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
    const/16 v4, 0x19

    .line 116
    .line 117
    goto/16 :goto_1

    .line 118
    .line 119
    :sswitch_6
    const-string v3, "storage_size"

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
    const/16 v4, 0x18

    .line 130
    .line 131
    goto/16 :goto_1

    .line 132
    .line 133
    :sswitch_7
    const-string v3, "external_storage_size"

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
    const/16 v4, 0x17

    .line 144
    .line 145
    goto/16 :goto_1

    .line 146
    .line 147
    :sswitch_8
    const-string v3, "screen_width_pixels"

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
    const/16 v4, 0x16

    .line 158
    .line 159
    goto/16 :goto_1

    .line 160
    .line 161
    :sswitch_9
    const-string v3, "connection_type"

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
    const/16 v4, 0x15

    .line 172
    .line 173
    goto/16 :goto_1

    .line 174
    .line 175
    :sswitch_a
    const-string v3, "model"

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
    const/16 v4, 0x14

    .line 186
    .line 187
    goto/16 :goto_1

    .line 188
    .line 189
    :sswitch_b
    const-string v3, "brand"

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
    const/16 v4, 0x13

    .line 200
    .line 201
    goto/16 :goto_1

    .line 202
    .line 203
    :sswitch_c
    const-string v3, "archs"

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
    const/16 v4, 0x12

    .line 214
    .line 215
    goto/16 :goto_1

    .line 216
    .line 217
    :sswitch_d
    const-string v3, "low_memory"

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
    const/16 v4, 0x11

    .line 228
    .line 229
    goto/16 :goto_1

    .line 230
    .line 231
    :sswitch_e
    const-string v3, "name"

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
    const/16 v4, 0x10

    .line 242
    .line 243
    goto/16 :goto_1

    .line 244
    .line 245
    :sswitch_f
    const-string v3, "id"

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
    const/16 v4, 0xf

    .line 256
    .line 257
    goto/16 :goto_1

    .line 258
    .line 259
    :sswitch_10
    const-string v3, "free_memory"

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
    const/16 v4, 0xe

    .line 270
    .line 271
    goto/16 :goto_1

    .line 272
    .line 273
    :sswitch_11
    const-string v3, "screen_dpi"

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
    goto/16 :goto_1

    .line 282
    .line 283
    :cond_12
    const/16 v4, 0xd

    .line 284
    .line 285
    goto/16 :goto_1

    .line 286
    .line 287
    :sswitch_12
    const-string v3, "screen_density"

    .line 288
    .line 289
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 290
    .line 291
    .line 292
    move-result v3

    .line 293
    if-nez v3, :cond_13

    .line 294
    .line 295
    goto/16 :goto_1

    .line 296
    .line 297
    :cond_13
    const/16 v4, 0xc

    .line 298
    .line 299
    goto/16 :goto_1

    .line 300
    .line 301
    :sswitch_13
    const-string v3, "model_id"

    .line 302
    .line 303
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 304
    .line 305
    .line 306
    move-result v3

    .line 307
    if-nez v3, :cond_14

    .line 308
    .line 309
    goto/16 :goto_1

    .line 310
    .line 311
    :cond_14
    const/16 v4, 0xb

    .line 312
    .line 313
    goto/16 :goto_1

    .line 314
    .line 315
    :sswitch_14
    const-string v3, "battery_level"

    .line 316
    .line 317
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 318
    .line 319
    .line 320
    move-result v3

    .line 321
    if-nez v3, :cond_15

    .line 322
    .line 323
    goto/16 :goto_1

    .line 324
    .line 325
    :cond_15
    const/16 v4, 0xa

    .line 326
    .line 327
    goto/16 :goto_1

    .line 328
    .line 329
    :sswitch_15
    const-string v3, "online"

    .line 330
    .line 331
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 332
    .line 333
    .line 334
    move-result v3

    .line 335
    if-nez v3, :cond_16

    .line 336
    .line 337
    goto/16 :goto_1

    .line 338
    .line 339
    :cond_16
    const/16 v4, 0x9

    .line 340
    .line 341
    goto/16 :goto_1

    .line 342
    .line 343
    :sswitch_16
    const-string v3, "locale"

    .line 344
    .line 345
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 346
    .line 347
    .line 348
    move-result v3

    .line 349
    if-nez v3, :cond_17

    .line 350
    .line 351
    goto/16 :goto_1

    .line 352
    .line 353
    :cond_17
    const/16 v4, 0x8

    .line 354
    .line 355
    goto/16 :goto_1

    .line 356
    .line 357
    :sswitch_17
    const-string v3, "family"

    .line 358
    .line 359
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 360
    .line 361
    .line 362
    move-result v3

    .line 363
    if-nez v3, :cond_18

    .line 364
    .line 365
    goto :goto_1

    .line 366
    :cond_18
    const/4 v4, 0x7

    .line 367
    goto :goto_1

    .line 368
    :sswitch_18
    const-string v3, "battery_temperature"

    .line 369
    .line 370
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 371
    .line 372
    .line 373
    move-result v3

    .line 374
    if-nez v3, :cond_19

    .line 375
    .line 376
    goto :goto_1

    .line 377
    :cond_19
    const/4 v4, 0x6

    .line 378
    goto :goto_1

    .line 379
    :sswitch_19
    const-string v3, "orientation"

    .line 380
    .line 381
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 382
    .line 383
    .line 384
    move-result v3

    .line 385
    if-nez v3, :cond_1a

    .line 386
    .line 387
    goto :goto_1

    .line 388
    :cond_1a
    const/4 v4, 0x5

    .line 389
    goto :goto_1

    .line 390
    :sswitch_1a
    const-string v3, "language"

    .line 391
    .line 392
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 393
    .line 394
    .line 395
    move-result v3

    .line 396
    if-nez v3, :cond_1b

    .line 397
    .line 398
    goto :goto_1

    .line 399
    :cond_1b
    const/4 v4, 0x4

    .line 400
    goto :goto_1

    .line 401
    :sswitch_1b
    const-string v3, "manufacturer"

    .line 402
    .line 403
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 404
    .line 405
    .line 406
    move-result v3

    .line 407
    if-nez v3, :cond_1c

    .line 408
    .line 409
    goto :goto_1

    .line 410
    :cond_1c
    const/4 v4, 0x3

    .line 411
    goto :goto_1

    .line 412
    :sswitch_1c
    const-string v3, "simulator"

    .line 413
    .line 414
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 415
    .line 416
    .line 417
    move-result v3

    .line 418
    if-nez v3, :cond_1d

    .line 419
    .line 420
    goto :goto_1

    .line 421
    :cond_1d
    const/4 v4, 0x2

    .line 422
    goto :goto_1

    .line 423
    :sswitch_1d
    const-string v3, "boot_time"

    .line 424
    .line 425
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 426
    .line 427
    .line 428
    move-result v3

    .line 429
    if-nez v3, :cond_1e

    .line 430
    .line 431
    goto :goto_1

    .line 432
    :cond_1e
    const/4 v4, 0x1

    .line 433
    goto :goto_1

    .line 434
    :sswitch_1e
    const-string v3, "timezone"

    .line 435
    .line 436
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 437
    .line 438
    .line 439
    move-result v3

    .line 440
    if-nez v3, :cond_1f

    .line 441
    .line 442
    goto :goto_1

    .line 443
    :cond_1f
    const/4 v4, 0x0

    .line 444
    :goto_1
    packed-switch v4, :pswitch_data_0

    .line 445
    .line 446
    .line 447
    if-nez v1, :cond_20

    .line 448
    .line 449
    new-instance v1, Lj$/util/concurrent/ConcurrentHashMap;

    .line 450
    .line 451
    invoke-direct {v1}, Lj$/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 452
    .line 453
    .line 454
    :cond_20
    invoke-virtual {p1, p2, v1, v2}, Lio/sentry/x0;->b1(Lio/sentry/g0;Ljava/util/Map;Ljava/lang/String;)V

    .line 455
    .line 456
    .line 457
    goto/16 :goto_0

    .line 458
    .line 459
    :pswitch_0
    invoke-virtual {p1}, Lio/sentry/x0;->T0()Ljava/lang/Integer;

    .line 460
    .line 461
    .line 462
    move-result-object v2

    .line 463
    invoke-static {v0, v2}, Lio/sentry/protocol/e;->o(Lio/sentry/protocol/e;Ljava/lang/Integer;)Ljava/lang/Integer;

    .line 464
    .line 465
    .line 466
    goto/16 :goto_0

    .line 467
    .line 468
    :pswitch_1
    invoke-virtual {p1}, Lio/sentry/x0;->V0()Ljava/lang/Long;

    .line 469
    .line 470
    .line 471
    move-result-object v2

    .line 472
    invoke-static {v0, v2}, Lio/sentry/protocol/e;->j(Lio/sentry/protocol/e;Ljava/lang/Long;)Ljava/lang/Long;

    .line 473
    .line 474
    .line 475
    goto/16 :goto_0

    .line 476
    .line 477
    :pswitch_2
    invoke-virtual {p1}, Lio/sentry/x0;->V0()Ljava/lang/Long;

    .line 478
    .line 479
    .line 480
    move-result-object v2

    .line 481
    invoke-static {v0, v2}, Lio/sentry/protocol/e;->l(Lio/sentry/protocol/e;Ljava/lang/Long;)Ljava/lang/Long;

    .line 482
    .line 483
    .line 484
    goto/16 :goto_0

    .line 485
    .line 486
    :pswitch_3
    invoke-virtual {p1}, Lio/sentry/x0;->O0()Ljava/lang/Boolean;

    .line 487
    .line 488
    .line 489
    move-result-object v2

    .line 490
    invoke-static {v0, v2}, Lio/sentry/protocol/e;->D(Lio/sentry/protocol/e;Ljava/lang/Boolean;)Ljava/lang/Boolean;

    .line 491
    .line 492
    .line 493
    goto/16 :goto_0

    .line 494
    .line 495
    :pswitch_4
    invoke-virtual {p1}, Lio/sentry/x0;->V0()Ljava/lang/Long;

    .line 496
    .line 497
    .line 498
    move-result-object v2

    .line 499
    invoke-static {v0, v2}, Lio/sentry/protocol/e;->e(Lio/sentry/protocol/e;Ljava/lang/Long;)Ljava/lang/Long;

    .line 500
    .line 501
    .line 502
    goto/16 :goto_0

    .line 503
    .line 504
    :pswitch_5
    invoke-virtual {p1}, Lio/sentry/x0;->V0()Ljava/lang/Long;

    .line 505
    .line 506
    .line 507
    move-result-object v2

    .line 508
    invoke-static {v0, v2}, Lio/sentry/protocol/e;->g(Lio/sentry/protocol/e;Ljava/lang/Long;)Ljava/lang/Long;

    .line 509
    .line 510
    .line 511
    goto/16 :goto_0

    .line 512
    .line 513
    :pswitch_6
    invoke-virtual {p1}, Lio/sentry/x0;->V0()Ljava/lang/Long;

    .line 514
    .line 515
    .line 516
    move-result-object v2

    .line 517
    invoke-static {v0, v2}, Lio/sentry/protocol/e;->i(Lio/sentry/protocol/e;Ljava/lang/Long;)Ljava/lang/Long;

    .line 518
    .line 519
    .line 520
    goto/16 :goto_0

    .line 521
    .line 522
    :pswitch_7
    invoke-virtual {p1}, Lio/sentry/x0;->V0()Ljava/lang/Long;

    .line 523
    .line 524
    .line 525
    move-result-object v2

    .line 526
    invoke-static {v0, v2}, Lio/sentry/protocol/e;->k(Lio/sentry/protocol/e;Ljava/lang/Long;)Ljava/lang/Long;

    .line 527
    .line 528
    .line 529
    goto/16 :goto_0

    .line 530
    .line 531
    :pswitch_8
    invoke-virtual {p1}, Lio/sentry/x0;->T0()Ljava/lang/Integer;

    .line 532
    .line 533
    .line 534
    move-result-object v2

    .line 535
    invoke-static {v0, v2}, Lio/sentry/protocol/e;->m(Lio/sentry/protocol/e;Ljava/lang/Integer;)Ljava/lang/Integer;

    .line 536
    .line 537
    .line 538
    goto/16 :goto_0

    .line 539
    .line 540
    :pswitch_9
    invoke-virtual {p1}, Lio/sentry/x0;->Z0()Ljava/lang/String;

    .line 541
    .line 542
    .line 543
    move-result-object v2

    .line 544
    invoke-static {v0, v2}, Lio/sentry/protocol/e;->v(Lio/sentry/protocol/e;Ljava/lang/String;)Ljava/lang/String;

    .line 545
    .line 546
    .line 547
    goto/16 :goto_0

    .line 548
    .line 549
    :pswitch_a
    invoke-virtual {p1}, Lio/sentry/x0;->Z0()Ljava/lang/String;

    .line 550
    .line 551
    .line 552
    move-result-object v2

    .line 553
    invoke-static {v0, v2}, Lio/sentry/protocol/e;->z(Lio/sentry/protocol/e;Ljava/lang/String;)Ljava/lang/String;

    .line 554
    .line 555
    .line 556
    goto/16 :goto_0

    .line 557
    .line 558
    :pswitch_b
    invoke-virtual {p1}, Lio/sentry/x0;->Z0()Ljava/lang/String;

    .line 559
    .line 560
    .line 561
    move-result-object v2

    .line 562
    invoke-static {v0, v2}, Lio/sentry/protocol/e;->n(Lio/sentry/protocol/e;Ljava/lang/String;)Ljava/lang/String;

    .line 563
    .line 564
    .line 565
    goto/16 :goto_0

    .line 566
    .line 567
    :pswitch_c
    invoke-virtual {p1}, Lio/sentry/x0;->X0()Ljava/lang/Object;

    .line 568
    .line 569
    .line 570
    move-result-object v2

    .line 571
    check-cast v2, Ljava/util/List;

    .line 572
    .line 573
    if-eqz v2, :cond_0

    .line 574
    .line 575
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 576
    .line 577
    .line 578
    move-result v3

    .line 579
    new-array v3, v3, [Ljava/lang/String;

    .line 580
    .line 581
    invoke-interface {v2, v3}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 582
    .line 583
    .line 584
    invoke-static {v0, v3}, Lio/sentry/protocol/e;->B(Lio/sentry/protocol/e;[Ljava/lang/String;)[Ljava/lang/String;

    .line 585
    .line 586
    .line 587
    goto/16 :goto_0

    .line 588
    .line 589
    :pswitch_d
    invoke-virtual {p1}, Lio/sentry/x0;->O0()Ljava/lang/Boolean;

    .line 590
    .line 591
    .line 592
    move-result-object v2

    .line 593
    invoke-static {v0, v2}, Lio/sentry/protocol/e;->h(Lio/sentry/protocol/e;Ljava/lang/Boolean;)Ljava/lang/Boolean;

    .line 594
    .line 595
    .line 596
    goto/16 :goto_0

    .line 597
    .line 598
    :pswitch_e
    invoke-virtual {p1}, Lio/sentry/x0;->Z0()Ljava/lang/String;

    .line 599
    .line 600
    .line 601
    move-result-object v2

    .line 602
    invoke-static {v0, v2}, Lio/sentry/protocol/e;->a(Lio/sentry/protocol/e;Ljava/lang/String;)Ljava/lang/String;

    .line 603
    .line 604
    .line 605
    goto/16 :goto_0

    .line 606
    .line 607
    :pswitch_f
    invoke-virtual {p1}, Lio/sentry/x0;->Z0()Ljava/lang/String;

    .line 608
    .line 609
    .line 610
    move-result-object v2

    .line 611
    invoke-static {v0, v2}, Lio/sentry/protocol/e;->t(Lio/sentry/protocol/e;Ljava/lang/String;)Ljava/lang/String;

    .line 612
    .line 613
    .line 614
    goto/16 :goto_0

    .line 615
    .line 616
    :pswitch_10
    invoke-virtual {p1}, Lio/sentry/x0;->V0()Ljava/lang/Long;

    .line 617
    .line 618
    .line 619
    move-result-object v2

    .line 620
    invoke-static {v0, v2}, Lio/sentry/protocol/e;->f(Lio/sentry/protocol/e;Ljava/lang/Long;)Ljava/lang/Long;

    .line 621
    .line 622
    .line 623
    goto/16 :goto_0

    .line 624
    .line 625
    :pswitch_11
    invoke-virtual {p1}, Lio/sentry/x0;->T0()Ljava/lang/Integer;

    .line 626
    .line 627
    .line 628
    move-result-object v2

    .line 629
    invoke-static {v0, v2}, Lio/sentry/protocol/e;->q(Lio/sentry/protocol/e;Ljava/lang/Integer;)Ljava/lang/Integer;

    .line 630
    .line 631
    .line 632
    goto/16 :goto_0

    .line 633
    .line 634
    :pswitch_12
    invoke-virtual {p1}, Lio/sentry/x0;->S0()Ljava/lang/Float;

    .line 635
    .line 636
    .line 637
    move-result-object v2

    .line 638
    invoke-static {v0, v2}, Lio/sentry/protocol/e;->p(Lio/sentry/protocol/e;Ljava/lang/Float;)Ljava/lang/Float;

    .line 639
    .line 640
    .line 641
    goto/16 :goto_0

    .line 642
    .line 643
    :pswitch_13
    invoke-virtual {p1}, Lio/sentry/x0;->Z0()Ljava/lang/String;

    .line 644
    .line 645
    .line 646
    move-result-object v2

    .line 647
    invoke-static {v0, v2}, Lio/sentry/protocol/e;->A(Lio/sentry/protocol/e;Ljava/lang/String;)Ljava/lang/String;

    .line 648
    .line 649
    .line 650
    goto/16 :goto_0

    .line 651
    .line 652
    :pswitch_14
    invoke-virtual {p1}, Lio/sentry/x0;->S0()Ljava/lang/Float;

    .line 653
    .line 654
    .line 655
    move-result-object v2

    .line 656
    invoke-static {v0, v2}, Lio/sentry/protocol/e;->C(Lio/sentry/protocol/e;Ljava/lang/Float;)Ljava/lang/Float;

    .line 657
    .line 658
    .line 659
    goto/16 :goto_0

    .line 660
    .line 661
    :pswitch_15
    invoke-virtual {p1}, Lio/sentry/x0;->O0()Ljava/lang/Boolean;

    .line 662
    .line 663
    .line 664
    move-result-object v2

    .line 665
    invoke-static {v0, v2}, Lio/sentry/protocol/e;->E(Lio/sentry/protocol/e;Ljava/lang/Boolean;)Ljava/lang/Boolean;

    .line 666
    .line 667
    .line 668
    goto/16 :goto_0

    .line 669
    .line 670
    :pswitch_16
    invoke-virtual {p1}, Lio/sentry/x0;->Z0()Ljava/lang/String;

    .line 671
    .line 672
    .line 673
    move-result-object v2

    .line 674
    invoke-static {v0, v2}, Lio/sentry/protocol/e;->x(Lio/sentry/protocol/e;Ljava/lang/String;)Ljava/lang/String;

    .line 675
    .line 676
    .line 677
    goto/16 :goto_0

    .line 678
    .line 679
    :pswitch_17
    invoke-virtual {p1}, Lio/sentry/x0;->Z0()Ljava/lang/String;

    .line 680
    .line 681
    .line 682
    move-result-object v2

    .line 683
    invoke-static {v0, v2}, Lio/sentry/protocol/e;->y(Lio/sentry/protocol/e;Ljava/lang/String;)Ljava/lang/String;

    .line 684
    .line 685
    .line 686
    goto/16 :goto_0

    .line 687
    .line 688
    :pswitch_18
    invoke-virtual {p1}, Lio/sentry/x0;->S0()Ljava/lang/Float;

    .line 689
    .line 690
    .line 691
    move-result-object v2

    .line 692
    invoke-static {v0, v2}, Lio/sentry/protocol/e;->w(Lio/sentry/protocol/e;Ljava/lang/Float;)Ljava/lang/Float;

    .line 693
    .line 694
    .line 695
    goto/16 :goto_0

    .line 696
    .line 697
    :pswitch_19
    new-instance v2, Lio/sentry/protocol/e$b$a;

    .line 698
    .line 699
    invoke-direct {v2}, Lio/sentry/protocol/e$b$a;-><init>()V

    .line 700
    .line 701
    .line 702
    invoke-virtual {p1, p2, v2}, Lio/sentry/x0;->Y0(Lio/sentry/g0;Lio/sentry/r0;)Ljava/lang/Object;

    .line 703
    .line 704
    .line 705
    move-result-object v2

    .line 706
    check-cast v2, Lio/sentry/protocol/e$b;

    .line 707
    .line 708
    invoke-static {v0, v2}, Lio/sentry/protocol/e;->b(Lio/sentry/protocol/e;Lio/sentry/protocol/e$b;)Lio/sentry/protocol/e$b;

    .line 709
    .line 710
    .line 711
    goto/16 :goto_0

    .line 712
    .line 713
    :pswitch_1a
    invoke-virtual {p1}, Lio/sentry/x0;->Z0()Ljava/lang/String;

    .line 714
    .line 715
    .line 716
    move-result-object v2

    .line 717
    invoke-static {v0, v2}, Lio/sentry/protocol/e;->u(Lio/sentry/protocol/e;Ljava/lang/String;)Ljava/lang/String;

    .line 718
    .line 719
    .line 720
    goto/16 :goto_0

    .line 721
    .line 722
    :pswitch_1b
    invoke-virtual {p1}, Lio/sentry/x0;->Z0()Ljava/lang/String;

    .line 723
    .line 724
    .line 725
    move-result-object v2

    .line 726
    invoke-static {v0, v2}, Lio/sentry/protocol/e;->c(Lio/sentry/protocol/e;Ljava/lang/String;)Ljava/lang/String;

    .line 727
    .line 728
    .line 729
    goto/16 :goto_0

    .line 730
    .line 731
    :pswitch_1c
    invoke-virtual {p1}, Lio/sentry/x0;->O0()Ljava/lang/Boolean;

    .line 732
    .line 733
    .line 734
    move-result-object v2

    .line 735
    invoke-static {v0, v2}, Lio/sentry/protocol/e;->d(Lio/sentry/protocol/e;Ljava/lang/Boolean;)Ljava/lang/Boolean;

    .line 736
    .line 737
    .line 738
    goto/16 :goto_0

    .line 739
    .line 740
    :pswitch_1d
    invoke-virtual {p1}, Lio/sentry/vendor/gson/stream/a;->z0()Lio/sentry/vendor/gson/stream/b;

    .line 741
    .line 742
    .line 743
    move-result-object v2

    .line 744
    sget-object v3, Lio/sentry/vendor/gson/stream/b;->STRING:Lio/sentry/vendor/gson/stream/b;

    .line 745
    .line 746
    if-ne v2, v3, :cond_0

    .line 747
    .line 748
    invoke-virtual {p1, p2}, Lio/sentry/x0;->P0(Lio/sentry/g0;)Ljava/util/Date;

    .line 749
    .line 750
    .line 751
    move-result-object v2

    .line 752
    invoke-static {v0, v2}, Lio/sentry/protocol/e;->r(Lio/sentry/protocol/e;Ljava/util/Date;)Ljava/util/Date;

    .line 753
    .line 754
    .line 755
    goto/16 :goto_0

    .line 756
    .line 757
    :pswitch_1e
    invoke-virtual {p1, p2}, Lio/sentry/x0;->a1(Lio/sentry/g0;)Ljava/util/TimeZone;

    .line 758
    .line 759
    .line 760
    move-result-object v2

    .line 761
    invoke-static {v0, v2}, Lio/sentry/protocol/e;->s(Lio/sentry/protocol/e;Ljava/util/TimeZone;)Ljava/util/TimeZone;

    .line 762
    .line 763
    .line 764
    goto/16 :goto_0

    .line 765
    .line 766
    :cond_21
    invoke-virtual {v0, v1}, Lio/sentry/protocol/e;->n0(Ljava/util/Map;)V

    .line 767
    .line 768
    .line 769
    invoke-virtual {p1}, Lio/sentry/vendor/gson/stream/a;->s()V

    .line 770
    .line 771
    .line 772
    return-object v0

    :sswitch_data_0
    .sparse-switch
        -0x7bc0b807 -> :sswitch_1e
        -0x77f42806 -> :sswitch_1d
        -0x7618bbfc -> :sswitch_1c
        -0x7561dc2f -> :sswitch_1b
        -0x602d6ca8 -> :sswitch_1a
        -0x55cd0a30 -> :sswitch_19
        -0x5412d9be -> :sswitch_18
        -0x4c67a49c -> :sswitch_17
        -0x4169f1a6 -> :sswitch_16
        -0x3c5549ad -> :sswitch_15
        -0x3449d12e -> :sswitch_14
        -0x24e5c60f -> :sswitch_13
        -0x21df2feb -> :sswitch_12
        -0x18dba0f6 -> :sswitch_11
        -0x8232dcc -> :sswitch_10
        0xd1b -> :sswitch_f
        0x337a8b -> :sswitch_e
        0x386704c -> :sswitch_d
        0x58c3add -> :sswitch_c
        0x59a4b87 -> :sswitch_b
        0x633fb29 -> :sswitch_a
        0x2b9f63fb -> :sswitch_9
        0x30bf1c39 -> :sswitch_8
        0x311b7339 -> :sswitch_7
        0x357dab45 -> :sswitch_6
        0x4f5c8e28 -> :sswitch_5
        0x5490d47f -> :sswitch_4
        0x55996271 -> :sswitch_3
        0x56769b9c -> :sswitch_2
        0x5ad8d3a8 -> :sswitch_1
        0x5cc30632 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
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
