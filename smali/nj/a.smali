.class public Lnj/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnet/time4j/tz/r;
.implements Lmj/c;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "[B>;"
        }
    .end annotation
.end field

.field private final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Lnet/time4j/f0;

.field private final f:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lnet/time4j/base/a;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v2, ""

    .line 7
    .line 8
    invoke-static {}, Lnet/time4j/f0;->v0()Lfj/h0;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Lfj/h0;->O()Lfj/k0;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    move-object v3, v0

    .line 17
    check-cast v3, Lnet/time4j/f0;

    .line 18
    .line 19
    new-instance v4, Ljava/util/HashMap;

    .line 20
    .line 21
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 22
    .line 23
    .line 24
    new-instance v5, Ljava/util/HashMap;

    .line 25
    .line 26
    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 27
    .line 28
    .line 29
    const-string v0, "net.time4j.scale.leapseconds.path"

    .line 30
    .line 31
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const/4 v6, 0x1

    .line 36
    const/4 v7, 0x0

    .line 37
    if-eqz v0, :cond_0

    .line 38
    .line 39
    move v0, v6

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    move v0, v7

    .line 42
    :goto_0
    if-eqz v0, :cond_1

    .line 43
    .line 44
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    .line 45
    .line 46
    .line 47
    move-result-object v8

    .line 48
    iput-object v8, v1, Lnj/a;->f:Ljava/util/Map;

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    new-instance v8, Ljava/util/LinkedHashMap;

    .line 52
    .line 53
    const/16 v9, 0x32

    .line 54
    .line 55
    invoke-direct {v8, v9}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 56
    .line 57
    .line 58
    iput-object v8, v1, Lnj/a;->f:Ljava/util/Map;

    .line 59
    .line 60
    :goto_1
    const-string v8, "net.time4j.tz.repository.path"

    .line 61
    .line 62
    invoke-static {v8}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v8

    .line 66
    const-string v9, "net.time4j.tz.repository.version"

    .line 67
    .line 68
    invoke-static {v9}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v9

    .line 72
    const-string v10, "tzdata"

    .line 73
    .line 74
    if-nez v9, :cond_2

    .line 75
    .line 76
    const-string v9, "tzdata.repository"

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_2
    new-instance v11, Ljava/lang/StringBuilder;

    .line 80
    .line 81
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    const-string v9, ".repository"

    .line 91
    .line 92
    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v9

    .line 99
    :goto_2
    :try_start_0
    new-instance v12, Ljava/lang/StringBuilder;

    .line 100
    .line 101
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 102
    .line 103
    .line 104
    const-string v13, "tzrepo/"

    .line 105
    .line 106
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v12
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_5
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 116
    if-eqz v8, :cond_5

    .line 117
    .line 118
    :try_start_1
    new-instance v13, Ljava/io/File;

    .line 119
    .line 120
    invoke-direct {v13, v8, v9}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v13}, Ljava/io/File;->isAbsolute()Z

    .line 124
    .line 125
    .line 126
    move-result v8

    .line 127
    if-eqz v8, :cond_4

    .line 128
    .line 129
    invoke-virtual {v13}, Ljava/io/File;->exists()Z

    .line 130
    .line 131
    .line 132
    move-result v8

    .line 133
    if-eqz v8, :cond_3

    .line 134
    .line 135
    invoke-virtual {v13}, Ljava/io/File;->toURI()Ljava/net/URI;

    .line 136
    .line 137
    .line 138
    move-result-object v8

    .line 139
    goto :goto_3

    .line 140
    :cond_3
    new-instance v0, Ljava/io/FileNotFoundException;

    .line 141
    .line 142
    new-instance v6, Ljava/lang/StringBuilder;

    .line 143
    .line 144
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 145
    .line 146
    .line 147
    const-string v7, "Path to tz-repository not found: "

    .line 148
    .line 149
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v6, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v6

    .line 159
    invoke-direct {v0, v6}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    throw v0

    .line 163
    :cond_4
    invoke-static {}, Lnet/time4j/base/d;->c()Lnet/time4j/base/d;

    .line 164
    .line 165
    .line 166
    move-result-object v8

    .line 167
    invoke-static {}, Lnj/a;->l()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    move-result-object v9

    .line 171
    invoke-virtual {v13}, Ljava/io/File;->toString()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v13

    .line 175
    invoke-virtual {v8, v10, v9, v13}, Lnet/time4j/base/d;->f(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;)Ljava/net/URI;

    .line 176
    .line 177
    .line 178
    move-result-object v8
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 179
    goto :goto_3

    .line 180
    :catch_0
    move-exception v0

    .line 181
    move-object v8, v2

    .line 182
    move-object/from16 v16, v8

    .line 183
    .line 184
    move-object/from16 v17, v3

    .line 185
    .line 186
    goto/16 :goto_c

    .line 187
    .line 188
    :cond_5
    :try_start_2
    invoke-static {}, Lnet/time4j/base/d;->c()Lnet/time4j/base/d;

    .line 189
    .line 190
    .line 191
    move-result-object v8

    .line 192
    invoke-static {}, Lnj/a;->l()Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    move-result-object v9

    .line 196
    invoke-virtual {v8, v10, v9, v12}, Lnet/time4j/base/d;->f(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;)Ljava/net/URI;

    .line 197
    .line 198
    .line 199
    move-result-object v8
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_5
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 200
    :goto_3
    if-eqz v8, :cond_6

    .line 201
    .line 202
    :try_start_3
    invoke-static {}, Lnet/time4j/base/d;->c()Lnet/time4j/base/d;

    .line 203
    .line 204
    .line 205
    move-result-object v9

    .line 206
    invoke-virtual {v9, v8, v6}, Lnet/time4j/base/d;->e(Ljava/net/URI;Z)Ljava/io/InputStream;

    .line 207
    .line 208
    .line 209
    move-result-object v6
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 210
    :try_start_4
    invoke-virtual {v8}, Ljava/net/URI;->toString()Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v8
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 214
    goto :goto_4

    .line 215
    :catch_1
    move-exception v0

    .line 216
    move-object v8, v2

    .line 217
    move-object/from16 v16, v8

    .line 218
    .line 219
    goto/16 :goto_a

    .line 220
    .line 221
    :cond_6
    move-object v8, v2

    .line 222
    const/4 v6, 0x0

    .line 223
    :goto_4
    if-nez v6, :cond_8

    .line 224
    .line 225
    :try_start_5
    invoke-static {}, Lnj/a;->l()Ljava/lang/Class;

    .line 226
    .line 227
    .line 228
    move-result-object v9

    .line 229
    invoke-virtual {v9}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 230
    .line 231
    .line 232
    move-result-object v9

    .line 233
    invoke-virtual {v9, v12}, Ljava/lang/ClassLoader;->getResource(Ljava/lang/String;)Ljava/net/URL;

    .line 234
    .line 235
    .line 236
    move-result-object v9

    .line 237
    if-eqz v9, :cond_7

    .line 238
    .line 239
    invoke-virtual {v9}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 240
    .line 241
    .line 242
    move-result-object v10

    .line 243
    invoke-virtual {v10, v7}, Ljava/net/URLConnection;->setUseCaches(Z)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v10}, Ljava/net/URLConnection;->connect()V

    .line 247
    .line 248
    .line 249
    invoke-virtual {v10}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 250
    .line 251
    .line 252
    move-result-object v6

    .line 253
    invoke-virtual {v9}, Ljava/net/URL;->toString()Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v8

    .line 257
    goto :goto_5

    .line 258
    :cond_7
    new-instance v0, Ljava/io/FileNotFoundException;

    .line 259
    .line 260
    new-instance v7, Ljava/lang/StringBuilder;

    .line 261
    .line 262
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 263
    .line 264
    .line 265
    const-string v9, "Classloader cannot access tz-repository: "

    .line 266
    .line 267
    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 268
    .line 269
    .line 270
    invoke-virtual {v7, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 271
    .line 272
    .line 273
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v7

    .line 277
    invoke-direct {v0, v7}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    throw v0

    .line 281
    :cond_8
    :goto_5
    new-instance v9, Ljava/io/DataInputStream;

    .line 282
    .line 283
    invoke-direct {v9, v6}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    .line 284
    .line 285
    .line 286
    invoke-static {v9, v8}, Lnj/a;->j(Ljava/io/DataInputStream;Ljava/lang/String;)V

    .line 287
    .line 288
    .line 289
    invoke-virtual {v9}, Ljava/io/DataInputStream;->readUTF()Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v10

    .line 293
    invoke-virtual {v9}, Ljava/io/DataInputStream;->readInt()I

    .line 294
    .line 295
    .line 296
    move-result v12

    .line 297
    new-instance v13, Ljava/util/ArrayList;

    .line 298
    .line 299
    invoke-direct {v13, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 300
    .line 301
    .line 302
    move v14, v7

    .line 303
    :goto_6
    if-ge v14, v12, :cond_b

    .line 304
    .line 305
    invoke-virtual {v9}, Ljava/io/DataInputStream;->readUTF()Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object v15

    .line 309
    invoke-virtual {v9}, Ljava/io/DataInputStream;->readInt()I

    .line 310
    .line 311
    .line 312
    move-result v7

    .line 313
    new-array v11, v7, [B
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 314
    .line 315
    move-object/from16 v16, v2

    .line 316
    .line 317
    move-object/from16 v17, v3

    .line 318
    .line 319
    const/4 v2, 0x0

    .line 320
    :cond_9
    sub-int v3, v7, v2

    .line 321
    .line 322
    :try_start_6
    invoke-virtual {v9, v11, v2, v3}, Ljava/io/DataInputStream;->read([BII)I

    .line 323
    .line 324
    .line 325
    move-result v3

    .line 326
    add-int/2addr v2, v3

    .line 327
    const/4 v3, -0x1

    .line 328
    if-eq v2, v3, :cond_a

    .line 329
    .line 330
    if-gt v7, v2, :cond_9

    .line 331
    .line 332
    invoke-interface {v13, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 333
    .line 334
    .line 335
    invoke-interface {v4, v15, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    add-int/lit8 v14, v14, 0x1

    .line 339
    .line 340
    move-object/from16 v2, v16

    .line 341
    .line 342
    move-object/from16 v3, v17

    .line 343
    .line 344
    const/4 v7, 0x0

    .line 345
    goto :goto_6

    .line 346
    :cond_a
    new-instance v0, Ljava/io/EOFException;

    .line 347
    .line 348
    new-instance v2, Ljava/lang/StringBuilder;

    .line 349
    .line 350
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 351
    .line 352
    .line 353
    const-string v3, "Incomplete data: "

    .line 354
    .line 355
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 356
    .line 357
    .line 358
    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 359
    .line 360
    .line 361
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 362
    .line 363
    .line 364
    move-result-object v2

    .line 365
    invoke-direct {v0, v2}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    .line 366
    .line 367
    .line 368
    throw v0

    .line 369
    :cond_b
    move-object/from16 v16, v2

    .line 370
    .line 371
    move-object/from16 v17, v3

    .line 372
    .line 373
    invoke-virtual {v9}, Ljava/io/DataInputStream;->readShort()S

    .line 374
    .line 375
    .line 376
    move-result v2

    .line 377
    const/4 v3, 0x0

    .line 378
    :goto_7
    if-ge v3, v2, :cond_c

    .line 379
    .line 380
    invoke-virtual {v9}, Ljava/io/DataInputStream;->readUTF()Ljava/lang/String;

    .line 381
    .line 382
    .line 383
    move-result-object v7

    .line 384
    invoke-virtual {v9}, Ljava/io/DataInputStream;->readShort()S

    .line 385
    .line 386
    .line 387
    move-result v11

    .line 388
    invoke-interface {v13, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    move-result-object v11

    .line 392
    check-cast v11, Ljava/lang/String;

    .line 393
    .line 394
    invoke-interface {v5, v7, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 395
    .line 396
    .line 397
    add-int/lit8 v3, v3, 0x1

    .line 398
    .line 399
    goto :goto_7

    .line 400
    :cond_c
    if-nez v0, :cond_e

    .line 401
    .line 402
    invoke-virtual {v9}, Ljava/io/DataInputStream;->readShort()S

    .line 403
    .line 404
    .line 405
    move-result v0

    .line 406
    const/4 v7, 0x0

    .line 407
    :goto_8
    if-ge v7, v0, :cond_d

    .line 408
    .line 409
    invoke-virtual {v9}, Ljava/io/DataInputStream;->readShort()S

    .line 410
    .line 411
    .line 412
    move-result v2

    .line 413
    invoke-virtual {v9}, Ljava/io/DataInputStream;->readByte()B

    .line 414
    .line 415
    .line 416
    move-result v3

    .line 417
    invoke-virtual {v9}, Ljava/io/DataInputStream;->readByte()B

    .line 418
    .line 419
    .line 420
    move-result v11

    .line 421
    invoke-virtual {v9}, Ljava/io/DataInputStream;->readByte()B

    .line 422
    .line 423
    .line 424
    move-result v12

    .line 425
    iget-object v13, v1, Lnj/a;->f:Ljava/util/Map;

    .line 426
    .line 427
    invoke-static {v2, v3, v11}, Lnet/time4j/f0;->L0(III)Lnet/time4j/f0;

    .line 428
    .line 429
    .line 430
    move-result-object v2

    .line 431
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 432
    .line 433
    .line 434
    move-result-object v3

    .line 435
    invoke-interface {v13, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 436
    .line 437
    .line 438
    add-int/lit8 v7, v7, 0x1

    .line 439
    .line 440
    goto :goto_8

    .line 441
    :cond_d
    invoke-virtual {v9}, Ljava/io/DataInputStream;->readShort()S

    .line 442
    .line 443
    .line 444
    move-result v0

    .line 445
    invoke-virtual {v9}, Ljava/io/DataInputStream;->readByte()B

    .line 446
    .line 447
    .line 448
    move-result v2

    .line 449
    invoke-virtual {v9}, Ljava/io/DataInputStream;->readByte()B

    .line 450
    .line 451
    .line 452
    move-result v3

    .line 453
    invoke-static {v0, v2, v3}, Lnet/time4j/f0;->L0(III)Lnet/time4j/f0;

    .line 454
    .line 455
    .line 456
    move-result-object v3
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_3
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 457
    goto :goto_9

    .line 458
    :cond_e
    move-object/from16 v3, v17

    .line 459
    .line 460
    :goto_9
    if-eqz v6, :cond_f

    .line 461
    .line 462
    :try_start_7
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_2

    .line 463
    .line 464
    .line 465
    :catch_2
    :cond_f
    move-object v2, v10

    .line 466
    const/4 v11, 0x0

    .line 467
    goto :goto_e

    .line 468
    :catch_3
    move-exception v0

    .line 469
    goto :goto_b

    .line 470
    :catchall_0
    move-exception v0

    .line 471
    move-object v11, v6

    .line 472
    goto :goto_f

    .line 473
    :catch_4
    move-exception v0

    .line 474
    move-object/from16 v16, v2

    .line 475
    .line 476
    :goto_a
    move-object/from16 v17, v3

    .line 477
    .line 478
    :goto_b
    move-object v11, v6

    .line 479
    goto :goto_d

    .line 480
    :catchall_1
    move-exception v0

    .line 481
    const/4 v11, 0x0

    .line 482
    goto :goto_f

    .line 483
    :catch_5
    move-exception v0

    .line 484
    move-object/from16 v16, v2

    .line 485
    .line 486
    move-object/from16 v17, v3

    .line 487
    .line 488
    move-object/from16 v8, v16

    .line 489
    .line 490
    :goto_c
    const/4 v11, 0x0

    .line 491
    :goto_d
    :try_start_8
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 492
    .line 493
    new-instance v3, Ljava/lang/StringBuilder;

    .line 494
    .line 495
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 496
    .line 497
    .line 498
    const-string v6, "[ERROR] TZ-repository not available. => "

    .line 499
    .line 500
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 501
    .line 502
    .line 503
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 504
    .line 505
    .line 506
    move-result-object v6

    .line 507
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 508
    .line 509
    .line 510
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 511
    .line 512
    .line 513
    move-result-object v3

    .line 514
    invoke-direct {v2, v3, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 515
    .line 516
    .line 517
    if-eqz v11, :cond_10

    .line 518
    .line 519
    :try_start_9
    invoke-virtual {v11}, Ljava/io/InputStream;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_6

    .line 520
    .line 521
    .line 522
    :catch_6
    :cond_10
    move-object v11, v2

    .line 523
    move-object/from16 v2, v16

    .line 524
    .line 525
    move-object/from16 v3, v17

    .line 526
    .line 527
    :goto_e
    if-nez v11, :cond_11

    .line 528
    .line 529
    iput-object v2, v1, Lnj/a;->a:Ljava/lang/String;

    .line 530
    .line 531
    iput-object v8, v1, Lnj/a;->b:Ljava/lang/String;

    .line 532
    .line 533
    invoke-static {v4}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 534
    .line 535
    .line 536
    move-result-object v0

    .line 537
    iput-object v0, v1, Lnj/a;->c:Ljava/util/Map;

    .line 538
    .line 539
    invoke-static {v5}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 540
    .line 541
    .line 542
    move-result-object v0

    .line 543
    iput-object v0, v1, Lnj/a;->d:Ljava/util/Map;

    .line 544
    .line 545
    iput-object v3, v1, Lnj/a;->e:Lnet/time4j/f0;

    .line 546
    .line 547
    return-void

    .line 548
    :cond_11
    throw v11

    .line 549
    :catchall_2
    move-exception v0

    .line 550
    :goto_f
    if-eqz v11, :cond_12

    .line 551
    .line 552
    :try_start_a
    invoke-virtual {v11}, Ljava/io/InputStream;->close()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_7

    .line 553
    .line 554
    .line 555
    :catch_7
    :cond_12
    throw v0
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
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
.end method

.method private static j(Ljava/io/DataInputStream;Ljava/lang/String;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readByte()B

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readByte()B

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readByte()B

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readByte()B

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readByte()B

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readByte()B

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    const/16 v5, 0x74

    .line 26
    .line 27
    if-ne v0, v5, :cond_0

    .line 28
    .line 29
    const/16 v0, 0x7a

    .line 30
    .line 31
    if-ne v1, v0, :cond_0

    .line 32
    .line 33
    const/16 v0, 0x72

    .line 34
    .line 35
    if-ne v2, v0, :cond_0

    .line 36
    .line 37
    const/16 v0, 0x65

    .line 38
    .line 39
    if-ne v3, v0, :cond_0

    .line 40
    .line 41
    const/16 v0, 0x70

    .line 42
    .line 43
    if-ne v4, v0, :cond_0

    .line 44
    .line 45
    const/16 v0, 0x6f

    .line 46
    .line 47
    if-ne p0, v0, :cond_0

    .line 48
    .line 49
    return-void

    .line 50
    :cond_0
    new-instance p0, Ljava/io/IOException;

    .line 51
    .line 52
    new-instance v0, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 55
    .line 56
    .line 57
    const-string v1, "Invalid tz-repository: "

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    throw p0
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
.end method

.method private static l()Ljava/lang/Class;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    const-string v0, "test.environment"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Boolean;->getBoolean(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    :try_start_0
    const-string v0, "net.time4j.tz.spi.RepositoryTest"

    .line 10
    .line 11
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    return-object v0

    .line 16
    :catch_0
    move-exception v0

    .line 17
    new-instance v1, Ljava/lang/AssertionError;

    .line 18
    .line 19
    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    throw v1

    .line 23
    :cond_0
    const-class v0, Lnj/a;

    .line 24
    .line 25
    return-object v0
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
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lnj/a;->b:Ljava/lang/String;

    return-object v0
.end method

.method public b()Z
    .locals 1

    iget-object v0, p0, Lnj/a;->f:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public c()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lnj/a;->c:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    const-string v0, ""

    return-object v0
.end method

.method public e()Lnet/time4j/tz/s;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public f()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lnj/a;->d:Ljava/util/Map;

    return-object v0
.end method

.method public bridge synthetic g()Lnet/time4j/base/a;
    .locals 1

    invoke-virtual {p0}, Lnj/a;->k()Lnet/time4j/f0;

    move-result-object v0

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    const-string v0, "TZDB"

    return-object v0
.end method

.method public h()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lnet/time4j/base/a;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lnj/a;->f:Ljava/util/Map;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public i()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lnj/a;->a:Ljava/lang/String;

    return-object v0
.end method

.method public k()Lnet/time4j/f0;
    .locals 1

    iget-object v0, p0, Lnj/a;->e:Lnet/time4j/f0;

    return-object v0
.end method

.method public load(Ljava/lang/String;)Lnet/time4j/tz/m;
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lnj/a;->c:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, [B

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    new-instance v0, Ljava/io/ObjectInputStream;

    .line 12
    .line 13
    new-instance v1, Ljava/io/ByteArrayInputStream;

    .line 14
    .line 15
    invoke-direct {v1, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, v1}, Ljava/io/ObjectInputStream;-><init>(Ljava/io/InputStream;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, Lnet/time4j/tz/m;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    .line 27
    return-object p1

    .line 28
    :catch_0
    move-exception p1

    .line 29
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :catch_1
    move-exception p1

    .line 34
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 35
    .line 36
    .line 37
    :cond_0
    :goto_0
    const/4 p1, 0x0

    .line 38
    return-object p1
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
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "TZ-REPOSITORY("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lnj/a;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
