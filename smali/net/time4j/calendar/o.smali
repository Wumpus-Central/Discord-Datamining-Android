.class public Lnet/time4j/calendar/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/time4j/calendar/o$a;,
        Lnet/time4j/calendar/o$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lnet/time4j/calendar/o;",
        ">;",
        "Ljava/io/Serializable;"
    }
.end annotation


# static fields
.field private static final k:[Ljava/lang/String;

.field private static final l:[Ljava/lang/String;

.field private static final m:[Ljava/lang/String;

.field private static final n:[Ljava/lang/String;

.field private static final o:[Ljava/lang/String;

.field private static final p:[Ljava/lang/String;

.field private static final q:[Ljava/lang/String;

.field private static final r:[Ljava/lang/String;

.field private static final s:[Ljava/lang/String;

.field private static final serialVersionUID:J = -0x3f3c89f2788f42b5L

.field private static final t:[Ljava/lang/String;

.field private static final u:[Ljava/lang/String;

.field private static final v:[Ljava/lang/String;

.field private static final w:[Lnet/time4j/calendar/o;

.field private static final x:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final y:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final z:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final number:I


# direct methods
.method static constructor <clinit>()V
    .locals 13

    .line 1
    const-string v0, "jia"

    .line 2
    .line 3
    const-string v1, "yi"

    .line 4
    .line 5
    const-string v2, "bing"

    .line 6
    .line 7
    const-string v3, "ding"

    .line 8
    .line 9
    const-string v4, "wu"

    .line 10
    .line 11
    const-string v5, "ji"

    .line 12
    .line 13
    const-string v6, "geng"

    .line 14
    .line 15
    const-string v7, "xin"

    .line 16
    .line 17
    const-string v8, "ren"

    .line 18
    .line 19
    const-string v9, "gui"

    .line 20
    .line 21
    filled-new-array/range {v0 .. v9}, [Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Lnet/time4j/calendar/o;->k:[Ljava/lang/String;

    .line 26
    .line 27
    const-string v1, "ji\u01ce"

    .line 28
    .line 29
    const-string v2, "y\u01d0"

    .line 30
    .line 31
    const-string v3, "b\u01d0ng"

    .line 32
    .line 33
    const-string v4, "d\u012bng"

    .line 34
    .line 35
    const-string v5, "w\u00f9"

    .line 36
    .line 37
    const-string v6, "j\u01d0"

    .line 38
    .line 39
    const-string v7, "g\u0113ng"

    .line 40
    .line 41
    const-string v8, "x\u012bn"

    .line 42
    .line 43
    const-string v9, "r\u00e9n"

    .line 44
    .line 45
    const-string v10, "gu\u01d0"

    .line 46
    .line 47
    filled-new-array/range {v1 .. v10}, [Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    sput-object v0, Lnet/time4j/calendar/o;->l:[Ljava/lang/String;

    .line 52
    .line 53
    const-string v1, "\u7532"

    .line 54
    .line 55
    const-string v2, "\u4e59"

    .line 56
    .line 57
    const-string v3, "\u4e19"

    .line 58
    .line 59
    const-string v4, "\u4e01"

    .line 60
    .line 61
    const-string v5, "\u620a"

    .line 62
    .line 63
    const-string v6, "\u5df1"

    .line 64
    .line 65
    const-string v7, "\u5e9a"

    .line 66
    .line 67
    const-string v8, "\u8f9b"

    .line 68
    .line 69
    const-string v9, "\u58ec"

    .line 70
    .line 71
    const-string v10, "\u7678"

    .line 72
    .line 73
    filled-new-array/range {v1 .. v10}, [Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    sput-object v0, Lnet/time4j/calendar/o;->m:[Ljava/lang/String;

    .line 78
    .line 79
    const-string v1, "\uac11"

    .line 80
    .line 81
    const-string v2, "\uc744"

    .line 82
    .line 83
    const-string v3, "\ubcd1"

    .line 84
    .line 85
    const-string v4, "\uc815"

    .line 86
    .line 87
    const-string v5, "\ubb34"

    .line 88
    .line 89
    const-string v6, "\uae30"

    .line 90
    .line 91
    const-string v7, "\uacbd"

    .line 92
    .line 93
    const-string v8, "\uc2e0"

    .line 94
    .line 95
    const-string v9, "\uc784"

    .line 96
    .line 97
    const-string v10, "\uacc4"

    .line 98
    .line 99
    filled-new-array/range {v1 .. v10}, [Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    sput-object v0, Lnet/time4j/calendar/o;->n:[Ljava/lang/String;

    .line 104
    .line 105
    const-string v1, "gi\u00e1p"

    .line 106
    .line 107
    const-string v2, "\u1ea5t"

    .line 108
    .line 109
    const-string v3, "b\u00ednh"

    .line 110
    .line 111
    const-string v4, "\u0111inh"

    .line 112
    .line 113
    const-string v5, "m\u1eadu"

    .line 114
    .line 115
    const-string v6, "k\u1ef7"

    .line 116
    .line 117
    const-string v7, "canh"

    .line 118
    .line 119
    const-string v8, "t\u00e2n"

    .line 120
    .line 121
    const-string v9, "nh\u00e2m"

    .line 122
    .line 123
    const-string v10, "qu\u00fd"

    .line 124
    .line 125
    filled-new-array/range {v1 .. v10}, [Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    sput-object v0, Lnet/time4j/calendar/o;->o:[Ljava/lang/String;

    .line 130
    .line 131
    const-string v1, "\u0426\u0437\u044f"

    .line 132
    .line 133
    const-string v2, "\u0418"

    .line 134
    .line 135
    const-string v3, "\u0411\u0438\u043d"

    .line 136
    .line 137
    const-string v4, "\u0414\u0438\u043d"

    .line 138
    .line 139
    const-string v5, "\u0423"

    .line 140
    .line 141
    const-string v6, "\u0426\u0437\u0438"

    .line 142
    .line 143
    const-string v7, "\u0413\u044d\u043d"

    .line 144
    .line 145
    const-string v8, "\u0421\u0438\u043d\u044c"

    .line 146
    .line 147
    const-string v9, "\u0416\u044d\u043d\u044c"

    .line 148
    .line 149
    const-string v10, "\u0413\u0443\u0439"

    .line 150
    .line 151
    filled-new-array/range {v1 .. v10}, [Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    sput-object v0, Lnet/time4j/calendar/o;->p:[Ljava/lang/String;

    .line 156
    .line 157
    const-string v1, "zi"

    .line 158
    .line 159
    const-string v2, "chou"

    .line 160
    .line 161
    const-string v3, "yin"

    .line 162
    .line 163
    const-string v4, "mao"

    .line 164
    .line 165
    const-string v5, "chen"

    .line 166
    .line 167
    const-string v6, "si"

    .line 168
    .line 169
    const-string v7, "wu"

    .line 170
    .line 171
    const-string v8, "wei"

    .line 172
    .line 173
    const-string v9, "shen"

    .line 174
    .line 175
    const-string v10, "you"

    .line 176
    .line 177
    const-string v11, "xu"

    .line 178
    .line 179
    const-string v12, "hai"

    .line 180
    .line 181
    filled-new-array/range {v1 .. v12}, [Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    sput-object v0, Lnet/time4j/calendar/o;->q:[Ljava/lang/String;

    .line 186
    .line 187
    const-string v1, "z\u01d0"

    .line 188
    .line 189
    const-string v2, "ch\u01d2u"

    .line 190
    .line 191
    const-string v3, "y\u00edn"

    .line 192
    .line 193
    const-string v4, "m\u01ceo"

    .line 194
    .line 195
    const-string v5, "ch\u00e9n"

    .line 196
    .line 197
    const-string v6, "s\u00ec"

    .line 198
    .line 199
    const-string v7, "w\u01d4"

    .line 200
    .line 201
    const-string v8, "w\u00e8i"

    .line 202
    .line 203
    const-string v9, "sh\u0113n"

    .line 204
    .line 205
    const-string v10, "y\u01d2u"

    .line 206
    .line 207
    const-string v11, "x\u016b"

    .line 208
    .line 209
    const-string v12, "h\u00e0i"

    .line 210
    .line 211
    filled-new-array/range {v1 .. v12}, [Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    sput-object v0, Lnet/time4j/calendar/o;->r:[Ljava/lang/String;

    .line 216
    .line 217
    const-string v1, "\u5b50"

    .line 218
    .line 219
    const-string v2, "\u4e11"

    .line 220
    .line 221
    const-string v3, "\u5bc5"

    .line 222
    .line 223
    const-string v4, "\u536f"

    .line 224
    .line 225
    const-string v5, "\u8fb0"

    .line 226
    .line 227
    const-string v6, "\u5df3"

    .line 228
    .line 229
    const-string v7, "\u5348"

    .line 230
    .line 231
    const-string v8, "\u672a"

    .line 232
    .line 233
    const-string v9, "\u7533"

    .line 234
    .line 235
    const-string v10, "\u9149"

    .line 236
    .line 237
    const-string v11, "\u620c"

    .line 238
    .line 239
    const-string v12, "\u4ea5"

    .line 240
    .line 241
    filled-new-array/range {v1 .. v12}, [Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    sput-object v0, Lnet/time4j/calendar/o;->s:[Ljava/lang/String;

    .line 246
    .line 247
    const-string v1, "\uc790"

    .line 248
    .line 249
    const-string v2, "\ucd95"

    .line 250
    .line 251
    const-string v3, "\uc778"

    .line 252
    .line 253
    const-string v4, "\ubb18"

    .line 254
    .line 255
    const-string v5, "\uc9c4"

    .line 256
    .line 257
    const-string v6, "\uc0ac"

    .line 258
    .line 259
    const-string v7, "\uc624"

    .line 260
    .line 261
    const-string v8, "\ubbf8"

    .line 262
    .line 263
    const-string v9, "\uc2e0"

    .line 264
    .line 265
    const-string v10, "\uc720"

    .line 266
    .line 267
    const-string v11, "\uc220"

    .line 268
    .line 269
    const-string v12, "\ud574"

    .line 270
    .line 271
    filled-new-array/range {v1 .. v12}, [Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    sput-object v0, Lnet/time4j/calendar/o;->t:[Ljava/lang/String;

    .line 276
    .line 277
    const-string v1, "t\u00ed"

    .line 278
    .line 279
    const-string v2, "s\u1eedu"

    .line 280
    .line 281
    const-string v3, "d\u1ea7n"

    .line 282
    .line 283
    const-string v4, "m\u00e3o"

    .line 284
    .line 285
    const-string v5, "th\u00ecn"

    .line 286
    .line 287
    const-string v6, "t\u1ecb"

    .line 288
    .line 289
    const-string v7, "ng\u1ecd"

    .line 290
    .line 291
    const-string v8, "m\u00f9i"

    .line 292
    .line 293
    const-string v9, "th\u00e2n"

    .line 294
    .line 295
    const-string v10, "d\u1eadu"

    .line 296
    .line 297
    const-string v11, "tu\u1ea5t"

    .line 298
    .line 299
    const-string v12, "h\u1ee3i"

    .line 300
    .line 301
    filled-new-array/range {v1 .. v12}, [Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object v0

    .line 305
    sput-object v0, Lnet/time4j/calendar/o;->u:[Ljava/lang/String;

    .line 306
    .line 307
    const-string v1, "\u0426\u0437\u044b"

    .line 308
    .line 309
    const-string v2, "\u0427\u043e\u0443"

    .line 310
    .line 311
    const-string v3, "\u0418\u043d\u044c"

    .line 312
    .line 313
    const-string v4, "\u041c\u0430\u043e"

    .line 314
    .line 315
    const-string v5, "\u0427\u044d\u043d\u044c"

    .line 316
    .line 317
    const-string v6, "\u0421\u044b"

    .line 318
    .line 319
    const-string v7, "\u0423"

    .line 320
    .line 321
    const-string v8, "\u0412\u044d\u0439"

    .line 322
    .line 323
    const-string v9, "\u0428\u044d\u043d\u044c"

    .line 324
    .line 325
    const-string v10, "\u042e"

    .line 326
    .line 327
    const-string v11, "\u0421\u044e\u0439"

    .line 328
    .line 329
    const-string v12, "\u0425\u0430\u0439"

    .line 330
    .line 331
    filled-new-array/range {v1 .. v12}, [Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object v0

    .line 335
    sput-object v0, Lnet/time4j/calendar/o;->v:[Ljava/lang/String;

    .line 336
    .line 337
    const/16 v0, 0x3c

    .line 338
    .line 339
    new-array v1, v0, [Lnet/time4j/calendar/o;

    .line 340
    .line 341
    const/4 v2, 0x0

    .line 342
    :goto_0
    if-ge v2, v0, :cond_0

    .line 343
    .line 344
    new-instance v3, Lnet/time4j/calendar/o;

    .line 345
    .line 346
    add-int/lit8 v4, v2, 0x1

    .line 347
    .line 348
    invoke-direct {v3, v4}, Lnet/time4j/calendar/o;-><init>(I)V

    .line 349
    .line 350
    .line 351
    aput-object v3, v1, v2

    .line 352
    .line 353
    move v2, v4

    .line 354
    goto :goto_0

    .line 355
    :cond_0
    sput-object v1, Lnet/time4j/calendar/o;->w:[Lnet/time4j/calendar/o;

    .line 356
    .line 357
    new-instance v0, Ljava/util/HashMap;

    .line 358
    .line 359
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 360
    .line 361
    .line 362
    sget-object v1, Lnet/time4j/calendar/o;->k:[Ljava/lang/String;

    .line 363
    .line 364
    const-string v2, "root"

    .line 365
    .line 366
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 367
    .line 368
    .line 369
    sget-object v1, Lnet/time4j/calendar/o;->m:[Ljava/lang/String;

    .line 370
    .line 371
    const-string v3, "zh"

    .line 372
    .line 373
    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    const-string v4, "ja"

    .line 377
    .line 378
    invoke-interface {v0, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 379
    .line 380
    .line 381
    sget-object v1, Lnet/time4j/calendar/o;->n:[Ljava/lang/String;

    .line 382
    .line 383
    const-string v5, "ko"

    .line 384
    .line 385
    invoke-interface {v0, v5, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 386
    .line 387
    .line 388
    sget-object v1, Lnet/time4j/calendar/o;->o:[Ljava/lang/String;

    .line 389
    .line 390
    const-string v6, "vi"

    .line 391
    .line 392
    invoke-interface {v0, v6, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 393
    .line 394
    .line 395
    sget-object v1, Lnet/time4j/calendar/o;->p:[Ljava/lang/String;

    .line 396
    .line 397
    const-string v7, "ru"

    .line 398
    .line 399
    invoke-interface {v0, v7, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 400
    .line 401
    .line 402
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 403
    .line 404
    .line 405
    move-result-object v0

    .line 406
    sput-object v0, Lnet/time4j/calendar/o;->x:Ljava/util/Map;

    .line 407
    .line 408
    new-instance v0, Ljava/util/HashMap;

    .line 409
    .line 410
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 411
    .line 412
    .line 413
    sget-object v1, Lnet/time4j/calendar/o;->q:[Ljava/lang/String;

    .line 414
    .line 415
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 416
    .line 417
    .line 418
    sget-object v1, Lnet/time4j/calendar/o;->s:[Ljava/lang/String;

    .line 419
    .line 420
    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    invoke-interface {v0, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 424
    .line 425
    .line 426
    sget-object v1, Lnet/time4j/calendar/o;->t:[Ljava/lang/String;

    .line 427
    .line 428
    invoke-interface {v0, v5, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 429
    .line 430
    .line 431
    sget-object v1, Lnet/time4j/calendar/o;->u:[Ljava/lang/String;

    .line 432
    .line 433
    invoke-interface {v0, v6, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    sget-object v1, Lnet/time4j/calendar/o;->v:[Ljava/lang/String;

    .line 437
    .line 438
    invoke-interface {v0, v7, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 439
    .line 440
    .line 441
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 442
    .line 443
    .line 444
    move-result-object v0

    .line 445
    sput-object v0, Lnet/time4j/calendar/o;->y:Ljava/util/Map;

    .line 446
    .line 447
    new-instance v0, Ljava/util/HashSet;

    .line 448
    .line 449
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 450
    .line 451
    .line 452
    invoke-interface {v0, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 453
    .line 454
    .line 455
    invoke-interface {v0, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 456
    .line 457
    .line 458
    invoke-interface {v0, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 459
    .line 460
    .line 461
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 462
    .line 463
    .line 464
    move-result-object v0

    .line 465
    sput-object v0, Lnet/time4j/calendar/o;->z:Ljava/util/Set;

    .line 466
    .line 467
    return-void
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

.method constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lnet/time4j/calendar/o;->number:I

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
.end method

.method static synthetic a()Ljava/util/Map;
    .locals 1

    sget-object v0, Lnet/time4j/calendar/o;->x:Ljava/util/Map;

    return-object v0
.end method

.method static synthetic b()[Ljava/lang/String;
    .locals 1

    sget-object v0, Lnet/time4j/calendar/o;->l:[Ljava/lang/String;

    return-object v0
.end method

.method static synthetic c()Ljava/util/Map;
    .locals 1

    sget-object v0, Lnet/time4j/calendar/o;->y:Ljava/util/Map;

    return-object v0
.end method

.method static synthetic e()[Ljava/lang/String;
    .locals 1

    sget-object v0, Lnet/time4j/calendar/o;->r:[Ljava/lang/String;

    return-object v0
.end method

.method public static k(I)Lnet/time4j/calendar/o;
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-lt p0, v0, :cond_0

    .line 3
    .line 4
    const/16 v1, 0x3c

    .line 5
    .line 6
    if-gt p0, v1, :cond_0

    .line 7
    .line 8
    sget-object v1, Lnet/time4j/calendar/o;->w:[Lnet/time4j/calendar/o;

    .line 9
    .line 10
    sub-int/2addr p0, v0

    .line 11
    aget-object p0, v1, p0

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 15
    .line 16
    new-instance v1, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    const-string v2, "Out of range: "

    .line 22
    .line 23
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw v0
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
.end method

.method public static l(Lnet/time4j/calendar/o$b;Lnet/time4j/calendar/o$a;)Lnet/time4j/calendar/o;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    add-int/lit8 v2, v0, 0x1

    .line 10
    .line 11
    sub-int/2addr v1, v0

    .line 12
    mul-int/lit8 v1, v1, 0x19

    .line 13
    .line 14
    const/16 v0, 0x3c

    .line 15
    .line 16
    invoke-static {v1, v0}, Lnet/time4j/base/c;->c(II)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    add-int/2addr v2, v0

    .line 21
    invoke-static {v2}, Lnet/time4j/calendar/o;->k(I)Lnet/time4j/calendar/o;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Lnet/time4j/calendar/o;->j()Lnet/time4j/calendar/o$b;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    if-ne v1, p0, :cond_0

    .line 30
    .line 31
    invoke-virtual {v0}, Lnet/time4j/calendar/o;->h()Lnet/time4j/calendar/o$a;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    if-ne p0, p1, :cond_0

    .line 36
    .line 37
    return-object v0

    .line 38
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 39
    .line 40
    const-string p1, "Invalid combination of stem and branch."

    .line 41
    .line 42
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw p0
    .line 46
    .line 47
    .line 48
    .line 49
.end method

.method static m(Ljava/lang/CharSequence;Ljava/text/ParsePosition;Ljava/util/Locale;Z)Lnet/time4j/calendar/o;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    invoke-virtual/range {p1 .. p1}, Ljava/text/ParsePosition;->getIndex()I

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    invoke-interface/range {p0 .. p0}, Ljava/lang/CharSequence;->length()I

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    invoke-virtual/range {p2 .. p2}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v5

    .line 19
    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    .line 20
    .line 21
    .line 22
    move-result v5

    .line 23
    add-int/lit8 v6, v3, 0x1

    .line 24
    .line 25
    const/4 v7, 0x0

    .line 26
    if-ge v6, v4, :cond_18

    .line 27
    .line 28
    if-gez v3, :cond_0

    .line 29
    .line 30
    goto/16 :goto_d

    .line 31
    .line 32
    :cond_0
    sget-object v8, Lnet/time4j/calendar/o;->z:Ljava/util/Set;

    .line 33
    .line 34
    invoke-virtual/range {p2 .. p2}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v9

    .line 38
    invoke-interface {v8, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v8

    .line 42
    const/4 v9, 0x0

    .line 43
    if-eqz v8, :cond_5

    .line 44
    .line 45
    invoke-static {}, Lnet/time4j/calendar/o$b;->values()[Lnet/time4j/calendar/o$b;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    array-length v8, v4

    .line 50
    move v11, v9

    .line 51
    :goto_0
    if-ge v11, v8, :cond_2

    .line 52
    .line 53
    aget-object v12, v4, v11

    .line 54
    .line 55
    invoke-virtual {v12, v2}, Lnet/time4j/calendar/o$b;->a(Ljava/util/Locale;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v13

    .line 59
    invoke-virtual {v13, v9}, Ljava/lang/String;->charAt(I)C

    .line 60
    .line 61
    .line 62
    move-result v13

    .line 63
    invoke-interface {v0, v3}, Ljava/lang/CharSequence;->charAt(I)C

    .line 64
    .line 65
    .line 66
    move-result v14

    .line 67
    if-ne v13, v14, :cond_1

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_1
    add-int/lit8 v11, v11, 0x1

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_2
    move-object v12, v7

    .line 74
    :goto_1
    if-eqz v12, :cond_4

    .line 75
    .line 76
    invoke-static {}, Lnet/time4j/calendar/o$a;->values()[Lnet/time4j/calendar/o$a;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    array-length v8, v4

    .line 81
    move v11, v9

    .line 82
    :goto_2
    if-ge v11, v8, :cond_4

    .line 83
    .line 84
    aget-object v13, v4, v11

    .line 85
    .line 86
    invoke-virtual {v13, v2}, Lnet/time4j/calendar/o$a;->a(Ljava/util/Locale;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v14

    .line 90
    invoke-virtual {v14, v9}, Ljava/lang/String;->charAt(I)C

    .line 91
    .line 92
    .line 93
    move-result v14

    .line 94
    invoke-interface {v0, v6}, Ljava/lang/CharSequence;->charAt(I)C

    .line 95
    .line 96
    .line 97
    move-result v15

    .line 98
    if-ne v14, v15, :cond_3

    .line 99
    .line 100
    add-int/lit8 v3, v3, 0x2

    .line 101
    .line 102
    goto/16 :goto_b

    .line 103
    .line 104
    :cond_3
    add-int/lit8 v11, v11, 0x1

    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_4
    move-object v13, v7

    .line 108
    goto/16 :goto_b

    .line 109
    .line 110
    :cond_5
    :goto_3
    const/4 v8, -0x1

    .line 111
    if-ge v6, v4, :cond_7

    .line 112
    .line 113
    invoke-interface {v0, v6}, Ljava/lang/CharSequence;->charAt(I)C

    .line 114
    .line 115
    .line 116
    move-result v11

    .line 117
    const/16 v12, 0x2d

    .line 118
    .line 119
    if-ne v11, v12, :cond_6

    .line 120
    .line 121
    goto :goto_4

    .line 122
    :cond_6
    add-int/lit8 v6, v6, 0x1

    .line 123
    .line 124
    goto :goto_3

    .line 125
    :cond_7
    move v6, v8

    .line 126
    :goto_4
    if-ne v6, v8, :cond_8

    .line 127
    .line 128
    invoke-virtual {v1, v3}, Ljava/text/ParsePosition;->setErrorIndex(I)V

    .line 129
    .line 130
    .line 131
    return-object v7

    .line 132
    :cond_8
    invoke-static {}, Lnet/time4j/calendar/o$b;->values()[Lnet/time4j/calendar/o$b;

    .line 133
    .line 134
    .line 135
    move-result-object v8

    .line 136
    array-length v11, v8

    .line 137
    move-object v12, v7

    .line 138
    move v13, v9

    .line 139
    :goto_5
    if-ge v13, v11, :cond_d

    .line 140
    .line 141
    aget-object v14, v8, v13

    .line 142
    .line 143
    invoke-virtual {v14, v2}, Lnet/time4j/calendar/o$b;->a(Ljava/util/Locale;)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v15

    .line 147
    move v9, v3

    .line 148
    :goto_6
    if-ge v9, v6, :cond_b

    .line 149
    .line 150
    sub-int v7, v9, v3

    .line 151
    .line 152
    invoke-interface {v0, v9}, Ljava/lang/CharSequence;->charAt(I)C

    .line 153
    .line 154
    .line 155
    move-result v17

    .line 156
    if-eqz v5, :cond_9

    .line 157
    .line 158
    invoke-static/range {v17 .. v17}, Lnet/time4j/calendar/o;->n(C)C

    .line 159
    .line 160
    .line 161
    move-result v17

    .line 162
    :cond_9
    move/from16 v10, v17

    .line 163
    .line 164
    move-object/from16 v17, v8

    .line 165
    .line 166
    invoke-virtual {v15}, Ljava/lang/String;->length()I

    .line 167
    .line 168
    .line 169
    move-result v8

    .line 170
    if-ge v7, v8, :cond_c

    .line 171
    .line 172
    invoke-virtual {v15, v7}, Ljava/lang/String;->charAt(I)C

    .line 173
    .line 174
    .line 175
    move-result v8

    .line 176
    if-ne v8, v10, :cond_c

    .line 177
    .line 178
    add-int/lit8 v7, v7, 0x1

    .line 179
    .line 180
    invoke-virtual {v15}, Ljava/lang/String;->length()I

    .line 181
    .line 182
    .line 183
    move-result v8

    .line 184
    if-ne v7, v8, :cond_a

    .line 185
    .line 186
    move-object v12, v14

    .line 187
    goto :goto_7

    .line 188
    :cond_a
    add-int/lit8 v9, v9, 0x1

    .line 189
    .line 190
    move-object/from16 v8, v17

    .line 191
    .line 192
    const/4 v7, 0x0

    .line 193
    goto :goto_6

    .line 194
    :cond_b
    move-object/from16 v17, v8

    .line 195
    .line 196
    :cond_c
    :goto_7
    add-int/lit8 v13, v13, 0x1

    .line 197
    .line 198
    move-object/from16 v8, v17

    .line 199
    .line 200
    const/4 v7, 0x0

    .line 201
    const/4 v9, 0x0

    .line 202
    goto :goto_5

    .line 203
    :cond_d
    if-nez v12, :cond_f

    .line 204
    .line 205
    if-eqz p3, :cond_e

    .line 206
    .line 207
    if-nez v5, :cond_e

    .line 208
    .line 209
    const/4 v2, 0x1

    .line 210
    add-int/2addr v6, v2

    .line 211
    if-ge v6, v4, :cond_e

    .line 212
    .line 213
    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 214
    .line 215
    invoke-static {v0, v1, v3, v2}, Lnet/time4j/calendar/o;->m(Ljava/lang/CharSequence;Ljava/text/ParsePosition;Ljava/util/Locale;Z)Lnet/time4j/calendar/o;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    return-object v0

    .line 220
    :cond_e
    invoke-virtual {v1, v3}, Ljava/text/ParsePosition;->setErrorIndex(I)V

    .line 221
    .line 222
    .line 223
    const/4 v0, 0x0

    .line 224
    return-object v0

    .line 225
    :cond_f
    invoke-static {}, Lnet/time4j/calendar/o$a;->values()[Lnet/time4j/calendar/o$a;

    .line 226
    .line 227
    .line 228
    move-result-object v7

    .line 229
    array-length v8, v7

    .line 230
    const/4 v9, 0x0

    .line 231
    const/4 v13, 0x0

    .line 232
    :goto_8
    if-ge v9, v8, :cond_14

    .line 233
    .line 234
    aget-object v10, v7, v9

    .line 235
    .line 236
    invoke-virtual {v10, v2}, Lnet/time4j/calendar/o$a;->a(Ljava/util/Locale;)Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object v11

    .line 240
    add-int/lit8 v14, v6, 0x1

    .line 241
    .line 242
    :goto_9
    if-ge v14, v4, :cond_12

    .line 243
    .line 244
    sub-int v15, v14, v6

    .line 245
    .line 246
    const/16 v16, 0x1

    .line 247
    .line 248
    add-int/lit8 v15, v15, -0x1

    .line 249
    .line 250
    invoke-interface {v0, v14}, Ljava/lang/CharSequence;->charAt(I)C

    .line 251
    .line 252
    .line 253
    move-result v16

    .line 254
    if-eqz v5, :cond_10

    .line 255
    .line 256
    invoke-static/range {v16 .. v16}, Lnet/time4j/calendar/o;->n(C)C

    .line 257
    .line 258
    .line 259
    move-result v16

    .line 260
    :cond_10
    move/from16 v2, v16

    .line 261
    .line 262
    move/from16 v16, v3

    .line 263
    .line 264
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 265
    .line 266
    .line 267
    move-result v3

    .line 268
    if-ge v15, v3, :cond_13

    .line 269
    .line 270
    invoke-virtual {v11, v15}, Ljava/lang/String;->charAt(I)C

    .line 271
    .line 272
    .line 273
    move-result v3

    .line 274
    if-ne v3, v2, :cond_13

    .line 275
    .line 276
    add-int/lit8 v15, v15, 0x1

    .line 277
    .line 278
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 279
    .line 280
    .line 281
    move-result v2

    .line 282
    if-ne v15, v2, :cond_11

    .line 283
    .line 284
    add-int/lit8 v3, v14, 0x1

    .line 285
    .line 286
    move-object v13, v10

    .line 287
    goto :goto_a

    .line 288
    :cond_11
    add-int/lit8 v14, v14, 0x1

    .line 289
    .line 290
    move-object/from16 v2, p2

    .line 291
    .line 292
    move/from16 v3, v16

    .line 293
    .line 294
    goto :goto_9

    .line 295
    :cond_12
    move/from16 v16, v3

    .line 296
    .line 297
    :cond_13
    move/from16 v3, v16

    .line 298
    .line 299
    :goto_a
    add-int/lit8 v9, v9, 0x1

    .line 300
    .line 301
    move-object/from16 v2, p2

    .line 302
    .line 303
    goto :goto_8

    .line 304
    :cond_14
    move/from16 v16, v3

    .line 305
    .line 306
    :goto_b
    if-eqz v12, :cond_16

    .line 307
    .line 308
    if-nez v13, :cond_15

    .line 309
    .line 310
    goto :goto_c

    .line 311
    :cond_15
    invoke-virtual {v1, v3}, Ljava/text/ParsePosition;->setIndex(I)V

    .line 312
    .line 313
    .line 314
    invoke-static {v12, v13}, Lnet/time4j/calendar/o;->l(Lnet/time4j/calendar/o$b;Lnet/time4j/calendar/o$a;)Lnet/time4j/calendar/o;

    .line 315
    .line 316
    .line 317
    move-result-object v0

    .line 318
    return-object v0

    .line 319
    :cond_16
    :goto_c
    if-eqz p3, :cond_17

    .line 320
    .line 321
    if-nez v5, :cond_17

    .line 322
    .line 323
    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 324
    .line 325
    const/4 v3, 0x1

    .line 326
    invoke-static {v0, v1, v2, v3}, Lnet/time4j/calendar/o;->m(Ljava/lang/CharSequence;Ljava/text/ParsePosition;Ljava/util/Locale;Z)Lnet/time4j/calendar/o;

    .line 327
    .line 328
    .line 329
    move-result-object v0

    .line 330
    return-object v0

    .line 331
    :cond_17
    invoke-virtual {v1, v3}, Ljava/text/ParsePosition;->setErrorIndex(I)V

    .line 332
    .line 333
    .line 334
    const/4 v0, 0x0

    .line 335
    return-object v0

    .line 336
    :cond_18
    :goto_d
    move-object v0, v7

    .line 337
    invoke-virtual {v1, v3}, Ljava/text/ParsePosition;->setErrorIndex(I)V

    .line 338
    .line 339
    .line 340
    return-object v0
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
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
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
    .line 546
    .line 547
.end method

.method private static n(C)C
    .locals 1

    const/16 v0, 0xe0

    if-eq p0, v0, :cond_4

    const/16 v0, 0xf9

    if-eq p0, v0, :cond_3

    const/16 v0, 0x113

    if-eq p0, v0, :cond_2

    const/16 v0, 0x12b

    if-eq p0, v0, :cond_1

    const/16 v0, 0x16b

    if-eq p0, v0, :cond_3

    const/16 v0, 0x1ce

    if-eq p0, v0, :cond_4

    const/16 v0, 0x1d0

    if-eq p0, v0, :cond_1

    const/16 v0, 0x1d2

    if-eq p0, v0, :cond_0

    const/16 v0, 0xe8

    if-eq p0, v0, :cond_2

    const/16 v0, 0xe9

    if-eq p0, v0, :cond_2

    const/16 v0, 0xec

    if-eq p0, v0, :cond_1

    const/16 v0, 0xed

    if-eq p0, v0, :cond_1

    return p0

    :cond_0
    const/16 p0, 0x6f

    return p0

    :cond_1
    const/16 p0, 0x69

    return p0

    :cond_2
    const/16 p0, 0x65

    return p0

    :cond_3
    const/16 p0, 0x75

    return p0

    :cond_4
    const/16 p0, 0x61

    return p0
.end method


# virtual methods
.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lnet/time4j/calendar/o;

    invoke-virtual {p0, p1}, Lnet/time4j/calendar/o;->f(Lnet/time4j/calendar/o;)I

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iget v0, p0, Lnet/time4j/calendar/o;->number:I

    .line 17
    .line 18
    check-cast p1, Lnet/time4j/calendar/o;

    .line 19
    .line 20
    iget p1, p1, Lnet/time4j/calendar/o;->number:I

    .line 21
    .line 22
    if-ne v0, p1, :cond_0

    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    :cond_0
    return v1
    .line 26
    .line 27
.end method

.method public f(Lnet/time4j/calendar/o;)I
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget v0, p0, Lnet/time4j/calendar/o;->number:I

    .line 16
    .line 17
    const-class v1, Lnet/time4j/calendar/o;

    .line 18
    .line 19
    invoke-virtual {v1, p1}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    check-cast p1, Lnet/time4j/calendar/o;

    .line 24
    .line 25
    iget p1, p1, Lnet/time4j/calendar/o;->number:I

    .line 26
    .line 27
    sub-int/2addr v0, p1

    .line 28
    return v0

    .line 29
    :cond_0
    new-instance p1, Ljava/lang/ClassCastException;

    .line 30
    .line 31
    const-string v0, "Cannot compare different types."

    .line 32
    .line 33
    invoke-direct {p1, v0}, Ljava/lang/ClassCastException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw p1
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
.end method

.method public getNumber()I
    .locals 1

    iget v0, p0, Lnet/time4j/calendar/o;->number:I

    return v0
.end method

.method public h()Lnet/time4j/calendar/o$a;
    .locals 2

    .line 1
    iget v0, p0, Lnet/time4j/calendar/o;->number:I

    .line 2
    .line 3
    const/16 v1, 0xc

    .line 4
    .line 5
    rem-int/2addr v0, v1

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v1, v0

    .line 10
    :goto_0
    invoke-static {}, Lnet/time4j/calendar/o$a;->values()[Lnet/time4j/calendar/o$a;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    add-int/lit8 v1, v1, -0x1

    .line 15
    .line 16
    aget-object v0, v0, v1

    .line 17
    .line 18
    return-object v0
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public hashCode()I
    .locals 1

    iget v0, p0, Lnet/time4j/calendar/o;->number:I

    return v0
.end method

.method public i(Ljava/util/Locale;)Ljava/lang/String;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lnet/time4j/calendar/o;->j()Lnet/time4j/calendar/o$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lnet/time4j/calendar/o;->h()Lnet/time4j/calendar/o$a;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    sget-object v2, Lnet/time4j/calendar/o;->z:Ljava/util/Set;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    invoke-interface {v2, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    const-string v2, ""

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const-string v2, "-"

    .line 25
    .line 26
    :goto_0
    new-instance v3, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, p1}, Lnet/time4j/calendar/o$b;->a(Ljava/util/Locale;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, p1}, Lnet/time4j/calendar/o$a;->a(Ljava/util/Locale;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    return-object p1
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

.method public j()Lnet/time4j/calendar/o$b;
    .locals 2

    .line 1
    iget v0, p0, Lnet/time4j/calendar/o;->number:I

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    rem-int/2addr v0, v1

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v1, v0

    .line 10
    :goto_0
    invoke-static {}, Lnet/time4j/calendar/o$b;->values()[Lnet/time4j/calendar/o$b;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    add-int/lit8 v1, v1, -0x1

    .line 15
    .line 16
    aget-object v0, v0, v1

    .line 17
    .line 18
    return-object v0
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method readResolve()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lnet/time4j/calendar/o;->number:I

    invoke-static {v0}, Lnet/time4j/calendar/o;->k(I)Lnet/time4j/calendar/o;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p0, v1}, Lnet/time4j/calendar/o;->i(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lnet/time4j/calendar/o;->number:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
