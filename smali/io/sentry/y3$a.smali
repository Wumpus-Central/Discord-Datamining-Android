.class public final Lio/sentry/y3$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/r0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/sentry/y3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/sentry/r0<",
        "Lio/sentry/y3;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private c(Ljava/lang/String;Lio/sentry/g0;)Ljava/lang/Exception;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "Missing required field \""

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const-string p1, "\""

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 24
    .line 25
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    sget-object v1, Lio/sentry/n3;->ERROR:Lio/sentry/n3;

    .line 29
    .line 30
    invoke-interface {p2, v1, p1, v0}, Lio/sentry/g0;->b(Lio/sentry/n3;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 31
    .line 32
    .line 33
    return-object v0
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
.end method


# virtual methods
.method public bridge synthetic a(Lio/sentry/x0;Lio/sentry/g0;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lio/sentry/y3$a;->b(Lio/sentry/x0;Lio/sentry/g0;)Lio/sentry/y3;

    move-result-object p1

    return-object p1
.end method

.method public b(Lio/sentry/x0;Lio/sentry/g0;)Lio/sentry/y3;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    invoke-virtual/range {p1 .. p1}, Lio/sentry/vendor/gson/stream/a;->f()V

    .line 6
    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v6, 0x0

    .line 12
    const/4 v7, 0x0

    .line 13
    const/4 v8, 0x0

    .line 14
    const/4 v9, 0x0

    .line 15
    const/4 v10, 0x0

    .line 16
    const/4 v11, 0x0

    .line 17
    const/4 v12, 0x0

    .line 18
    const/4 v13, 0x0

    .line 19
    const/4 v14, 0x0

    .line 20
    const/4 v15, 0x0

    .line 21
    const/16 v16, 0x0

    .line 22
    .line 23
    :goto_0
    invoke-virtual/range {p1 .. p1}, Lio/sentry/vendor/gson/stream/a;->z0()Lio/sentry/vendor/gson/stream/b;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    sget-object v0, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    .line 28
    .line 29
    move-object/from16 v17, v15

    .line 30
    .line 31
    const-string v15, "release"

    .line 32
    .line 33
    move-object/from16 v18, v14

    .line 34
    .line 35
    const-string v14, "status"

    .line 36
    .line 37
    move-object/from16 v19, v13

    .line 38
    .line 39
    const-string v13, "errors"

    .line 40
    .line 41
    move-object/from16 v20, v12

    .line 42
    .line 43
    const-string v12, "started"

    .line 44
    .line 45
    if-ne v2, v0, :cond_11

    .line 46
    .line 47
    invoke-virtual/range {p1 .. p1}, Lio/sentry/vendor/gson/stream/a;->g0()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    const/16 v21, 0x3

    .line 59
    .line 60
    const/16 v22, 0x2

    .line 61
    .line 62
    const/16 v23, -0x1

    .line 63
    .line 64
    move-object/from16 v24, v11

    .line 65
    .line 66
    const/4 v11, 0x1

    .line 67
    const/16 v25, 0x0

    .line 68
    .line 69
    sparse-switch v2, :sswitch_data_0

    .line 70
    .line 71
    .line 72
    :goto_1
    move/from16 v2, v23

    .line 73
    .line 74
    goto/16 :goto_2

    .line 75
    .line 76
    :sswitch_0
    const-string v2, "attrs"

    .line 77
    .line 78
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    if-nez v2, :cond_0

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_0
    const/16 v2, 0x9

    .line 86
    .line 87
    goto/16 :goto_2

    .line 88
    .line 89
    :sswitch_1
    const-string v2, "timestamp"

    .line 90
    .line 91
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    if-nez v2, :cond_1

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_1
    const/16 v2, 0x8

    .line 99
    .line 100
    goto/16 :goto_2

    .line 101
    .line 102
    :sswitch_2
    const-string v2, "init"

    .line 103
    .line 104
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    if-nez v2, :cond_2

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_2
    const/4 v2, 0x7

    .line 112
    goto :goto_2

    .line 113
    :sswitch_3
    const-string v2, "sid"

    .line 114
    .line 115
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    if-nez v2, :cond_3

    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_3
    const/4 v2, 0x6

    .line 123
    goto :goto_2

    .line 124
    :sswitch_4
    const-string v2, "seq"

    .line 125
    .line 126
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v2

    .line 130
    if-nez v2, :cond_4

    .line 131
    .line 132
    goto :goto_1

    .line 133
    :cond_4
    const/4 v2, 0x5

    .line 134
    goto :goto_2

    .line 135
    :sswitch_5
    const-string v2, "did"

    .line 136
    .line 137
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result v2

    .line 141
    if-nez v2, :cond_5

    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_5
    const/4 v2, 0x4

    .line 145
    goto :goto_2

    .line 146
    :sswitch_6
    invoke-virtual {v0, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result v2

    .line 150
    if-nez v2, :cond_6

    .line 151
    .line 152
    goto :goto_1

    .line 153
    :cond_6
    move/from16 v2, v21

    .line 154
    .line 155
    goto :goto_2

    .line 156
    :sswitch_7
    invoke-virtual {v0, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result v2

    .line 160
    if-nez v2, :cond_7

    .line 161
    .line 162
    goto :goto_1

    .line 163
    :cond_7
    move/from16 v2, v22

    .line 164
    .line 165
    goto :goto_2

    .line 166
    :sswitch_8
    invoke-virtual {v0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result v2

    .line 170
    if-nez v2, :cond_8

    .line 171
    .line 172
    goto :goto_1

    .line 173
    :cond_8
    move v2, v11

    .line 174
    goto :goto_2

    .line 175
    :sswitch_9
    const-string v2, "duration"

    .line 176
    .line 177
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result v2

    .line 181
    if-nez v2, :cond_9

    .line 182
    .line 183
    goto :goto_1

    .line 184
    :cond_9
    move/from16 v2, v25

    .line 185
    .line 186
    :goto_2
    packed-switch v2, :pswitch_data_0

    .line 187
    .line 188
    .line 189
    if-nez v7, :cond_a

    .line 190
    .line 191
    new-instance v2, Lj$/util/concurrent/ConcurrentHashMap;

    .line 192
    .line 193
    invoke-direct {v2}, Lj$/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 194
    .line 195
    .line 196
    move-object v7, v2

    .line 197
    :cond_a
    move-object/from16 v2, p1

    .line 198
    .line 199
    invoke-virtual {v2, v1, v7, v0}, Lio/sentry/x0;->b1(Lio/sentry/g0;Ljava/util/Map;Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    goto/16 :goto_6

    .line 203
    .line 204
    :pswitch_0
    move-object/from16 v2, p1

    .line 205
    .line 206
    invoke-virtual/range {p1 .. p1}, Lio/sentry/vendor/gson/stream/a;->f()V

    .line 207
    .line 208
    .line 209
    move-object/from16 v14, v18

    .line 210
    .line 211
    move-object/from16 v13, v19

    .line 212
    .line 213
    :goto_3
    invoke-virtual/range {p1 .. p1}, Lio/sentry/vendor/gson/stream/a;->z0()Lio/sentry/vendor/gson/stream/b;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    sget-object v12, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    .line 218
    .line 219
    if-ne v0, v12, :cond_f

    .line 220
    .line 221
    invoke-virtual/range {p1 .. p1}, Lio/sentry/vendor/gson/stream/a;->g0()Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 226
    .line 227
    .line 228
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 229
    .line 230
    .line 231
    move-result v12

    .line 232
    sparse-switch v12, :sswitch_data_1

    .line 233
    .line 234
    .line 235
    :goto_4
    move/from16 v0, v23

    .line 236
    .line 237
    goto :goto_5

    .line 238
    :sswitch_a
    const-string v12, "user_agent"

    .line 239
    .line 240
    invoke-virtual {v0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 241
    .line 242
    .line 243
    move-result v0

    .line 244
    if-nez v0, :cond_b

    .line 245
    .line 246
    goto :goto_4

    .line 247
    :cond_b
    move/from16 v0, v21

    .line 248
    .line 249
    goto :goto_5

    .line 250
    :sswitch_b
    const-string v12, "ip_address"

    .line 251
    .line 252
    invoke-virtual {v0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 253
    .line 254
    .line 255
    move-result v0

    .line 256
    if-nez v0, :cond_c

    .line 257
    .line 258
    goto :goto_4

    .line 259
    :cond_c
    move/from16 v0, v22

    .line 260
    .line 261
    goto :goto_5

    .line 262
    :sswitch_c
    invoke-virtual {v0, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 263
    .line 264
    .line 265
    move-result v0

    .line 266
    if-nez v0, :cond_d

    .line 267
    .line 268
    goto :goto_4

    .line 269
    :cond_d
    move v0, v11

    .line 270
    goto :goto_5

    .line 271
    :sswitch_d
    const-string v12, "environment"

    .line 272
    .line 273
    invoke-virtual {v0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 274
    .line 275
    .line 276
    move-result v0

    .line 277
    if-nez v0, :cond_e

    .line 278
    .line 279
    goto :goto_4

    .line 280
    :cond_e
    move/from16 v0, v25

    .line 281
    .line 282
    :goto_5
    packed-switch v0, :pswitch_data_1

    .line 283
    .line 284
    .line 285
    invoke-virtual/range {p1 .. p1}, Lio/sentry/vendor/gson/stream/a;->M0()V

    .line 286
    .line 287
    .line 288
    goto :goto_3

    .line 289
    :pswitch_1
    invoke-virtual/range {p1 .. p1}, Lio/sentry/x0;->Z0()Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v14

    .line 293
    goto :goto_3

    .line 294
    :pswitch_2
    invoke-virtual/range {p1 .. p1}, Lio/sentry/x0;->Z0()Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object v13

    .line 298
    goto :goto_3

    .line 299
    :pswitch_3
    invoke-virtual/range {p1 .. p1}, Lio/sentry/x0;->Z0()Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v16

    .line 303
    goto :goto_3

    .line 304
    :pswitch_4
    invoke-virtual/range {p1 .. p1}, Lio/sentry/x0;->Z0()Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object v17

    .line 308
    goto :goto_3

    .line 309
    :cond_f
    invoke-virtual/range {p1 .. p1}, Lio/sentry/vendor/gson/stream/a;->s()V

    .line 310
    .line 311
    .line 312
    move-object/from16 v15, v17

    .line 313
    .line 314
    goto :goto_7

    .line 315
    :pswitch_5
    move-object/from16 v2, p1

    .line 316
    .line 317
    invoke-virtual/range {p1 .. p2}, Lio/sentry/x0;->P0(Lio/sentry/g0;)Ljava/util/Date;

    .line 318
    .line 319
    .line 320
    move-result-object v6

    .line 321
    goto :goto_6

    .line 322
    :pswitch_6
    move-object/from16 v2, p1

    .line 323
    .line 324
    invoke-virtual/range {p1 .. p1}, Lio/sentry/x0;->O0()Ljava/lang/Boolean;

    .line 325
    .line 326
    .line 327
    move-result-object v10

    .line 328
    goto :goto_6

    .line 329
    :pswitch_7
    move-object/from16 v2, p1

    .line 330
    .line 331
    :try_start_0
    invoke-virtual/range {p1 .. p1}, Lio/sentry/x0;->Z0()Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 335
    :try_start_1
    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    .line 336
    .line 337
    .line 338
    move-result-object v9
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    .line 339
    goto :goto_6

    .line 340
    :catch_0
    const/4 v0, 0x0

    .line 341
    :catch_1
    sget-object v12, Lio/sentry/n3;->ERROR:Lio/sentry/n3;

    .line 342
    .line 343
    new-array v11, v11, [Ljava/lang/Object;

    .line 344
    .line 345
    aput-object v0, v11, v25

    .line 346
    .line 347
    const-string v0, "%s sid is not valid."

    .line 348
    .line 349
    invoke-interface {v1, v12, v0, v11}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 350
    .line 351
    .line 352
    goto :goto_6

    .line 353
    :pswitch_8
    move-object/from16 v2, p1

    .line 354
    .line 355
    invoke-virtual/range {p1 .. p1}, Lio/sentry/x0;->V0()Ljava/lang/Long;

    .line 356
    .line 357
    .line 358
    move-result-object v11

    .line 359
    move-object/from16 v15, v17

    .line 360
    .line 361
    move-object/from16 v14, v18

    .line 362
    .line 363
    move-object/from16 v13, v19

    .line 364
    .line 365
    move-object/from16 v12, v20

    .line 366
    .line 367
    goto :goto_9

    .line 368
    :pswitch_9
    move-object/from16 v2, p1

    .line 369
    .line 370
    invoke-virtual/range {p1 .. p1}, Lio/sentry/x0;->Z0()Ljava/lang/String;

    .line 371
    .line 372
    .line 373
    move-result-object v8

    .line 374
    :cond_10
    :goto_6
    move-object/from16 v15, v17

    .line 375
    .line 376
    move-object/from16 v14, v18

    .line 377
    .line 378
    move-object/from16 v13, v19

    .line 379
    .line 380
    :goto_7
    move-object/from16 v12, v20

    .line 381
    .line 382
    :goto_8
    move-object/from16 v11, v24

    .line 383
    .line 384
    goto :goto_9

    .line 385
    :pswitch_a
    move-object/from16 v2, p1

    .line 386
    .line 387
    invoke-virtual/range {p1 .. p1}, Lio/sentry/x0;->Z0()Ljava/lang/String;

    .line 388
    .line 389
    .line 390
    move-result-object v0

    .line 391
    invoke-static {v0}, Lio/sentry/util/o;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 392
    .line 393
    .line 394
    move-result-object v0

    .line 395
    if-eqz v0, :cond_10

    .line 396
    .line 397
    invoke-static {v0}, Lio/sentry/y3$b;->valueOf(Ljava/lang/String;)Lio/sentry/y3$b;

    .line 398
    .line 399
    .line 400
    move-result-object v4

    .line 401
    goto :goto_6

    .line 402
    :pswitch_b
    move-object/from16 v2, p1

    .line 403
    .line 404
    invoke-virtual/range {p1 .. p1}, Lio/sentry/x0;->T0()Ljava/lang/Integer;

    .line 405
    .line 406
    .line 407
    move-result-object v3

    .line 408
    goto :goto_6

    .line 409
    :pswitch_c
    move-object/from16 v2, p1

    .line 410
    .line 411
    invoke-virtual/range {p1 .. p2}, Lio/sentry/x0;->P0(Lio/sentry/g0;)Ljava/util/Date;

    .line 412
    .line 413
    .line 414
    move-result-object v5

    .line 415
    goto :goto_6

    .line 416
    :pswitch_d
    move-object/from16 v2, p1

    .line 417
    .line 418
    invoke-virtual/range {p1 .. p1}, Lio/sentry/x0;->Q0()Ljava/lang/Double;

    .line 419
    .line 420
    .line 421
    move-result-object v12

    .line 422
    move-object/from16 v15, v17

    .line 423
    .line 424
    move-object/from16 v14, v18

    .line 425
    .line 426
    move-object/from16 v13, v19

    .line 427
    .line 428
    goto :goto_8

    .line 429
    :goto_9
    move-object/from16 v0, p0

    .line 430
    .line 431
    goto/16 :goto_0

    .line 432
    .line 433
    :cond_11
    move-object/from16 v2, p1

    .line 434
    .line 435
    move-object/from16 v24, v11

    .line 436
    .line 437
    if-eqz v4, :cond_15

    .line 438
    .line 439
    if-eqz v5, :cond_14

    .line 440
    .line 441
    if-eqz v3, :cond_13

    .line 442
    .line 443
    if-eqz v16, :cond_12

    .line 444
    .line 445
    new-instance v0, Lio/sentry/y3;

    .line 446
    .line 447
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 448
    .line 449
    .line 450
    move-result v1

    .line 451
    move-object v3, v0

    .line 452
    move-object v15, v7

    .line 453
    move v7, v1

    .line 454
    move-object/from16 v11, v24

    .line 455
    .line 456
    move-object/from16 v12, v20

    .line 457
    .line 458
    move-object/from16 v13, v19

    .line 459
    .line 460
    move-object/from16 v14, v18

    .line 461
    .line 462
    move-object v1, v15

    .line 463
    move-object/from16 v15, v17

    .line 464
    .line 465
    invoke-direct/range {v3 .. v16}, Lio/sentry/y3;-><init>(Lio/sentry/y3$b;Ljava/util/Date;Ljava/util/Date;ILjava/lang/String;Ljava/util/UUID;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 466
    .line 467
    .line 468
    invoke-virtual {v0, v1}, Lio/sentry/y3;->l(Ljava/util/Map;)V

    .line 469
    .line 470
    .line 471
    invoke-virtual/range {p1 .. p1}, Lio/sentry/vendor/gson/stream/a;->s()V

    .line 472
    .line 473
    .line 474
    return-object v0

    .line 475
    :cond_12
    move-object/from16 v0, p0

    .line 476
    .line 477
    invoke-direct {v0, v15, v1}, Lio/sentry/y3$a;->c(Ljava/lang/String;Lio/sentry/g0;)Ljava/lang/Exception;

    .line 478
    .line 479
    .line 480
    move-result-object v1

    .line 481
    throw v1

    .line 482
    :cond_13
    move-object/from16 v0, p0

    .line 483
    .line 484
    invoke-direct {v0, v13, v1}, Lio/sentry/y3$a;->c(Ljava/lang/String;Lio/sentry/g0;)Ljava/lang/Exception;

    .line 485
    .line 486
    .line 487
    move-result-object v1

    .line 488
    throw v1

    .line 489
    :cond_14
    move-object/from16 v0, p0

    .line 490
    .line 491
    invoke-direct {v0, v12, v1}, Lio/sentry/y3$a;->c(Ljava/lang/String;Lio/sentry/g0;)Ljava/lang/Exception;

    .line 492
    .line 493
    .line 494
    move-result-object v1

    .line 495
    throw v1

    .line 496
    :cond_15
    move-object/from16 v0, p0

    .line 497
    .line 498
    invoke-direct {v0, v14, v1}, Lio/sentry/y3$a;->c(Ljava/lang/String;Lio/sentry/g0;)Ljava/lang/Exception;

    .line 499
    .line 500
    .line 501
    move-result-object v1

    .line 502
    throw v1

    .line 503
    :sswitch_data_0
    .sparse-switch
        -0x76bbb26c -> :sswitch_9
        -0x7114bf7f -> :sswitch_8
        -0x4d2a9095 -> :sswitch_7
        -0x3532300e -> :sswitch_6
        0x1847f -> :sswitch_5
        0x1bc5f -> :sswitch_4
        0x1bcce -> :sswitch_3
        0x316510 -> :sswitch_2
        0x3492916 -> :sswitch_1
        0x58d64a2 -> :sswitch_0
    .end sparse-switch

    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_0
    .end packed-switch

    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    :sswitch_data_1
    .sparse-switch
        -0x51ecded -> :sswitch_d
        0x41012807 -> :sswitch_c
        0x583738dc -> :sswitch_b
        0x724f4d91 -> :sswitch_a
    .end sparse-switch

    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
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
.end method
