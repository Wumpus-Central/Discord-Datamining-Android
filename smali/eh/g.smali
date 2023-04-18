.class public final Leh/g;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lmg/h0;Lci/n;Lmg/k0;Lyg/f;Leh/p;Leh/h;Lzh/r;)Leh/f;
    .locals 14

    .line 1
    move-object v2, p0

    .line 2
    move-object v1, p1

    .line 3
    move-object/from16 v7, p2

    .line 4
    .line 5
    move-object/from16 v0, p4

    .line 6
    .line 7
    move-object/from16 v3, p5

    .line 8
    .line 9
    const-string v4, "module"

    .line 10
    .line 11
    invoke-static {p0, v4}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v4, "storageManager"

    .line 15
    .line 16
    invoke-static {p1, v4}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const-string v4, "notFoundClasses"

    .line 20
    .line 21
    invoke-static {v7, v4}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const-string v4, "lazyJavaPackageFragmentProvider"

    .line 25
    .line 26
    move-object/from16 v6, p3

    .line 27
    .line 28
    invoke-static {v6, v4}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const-string v4, "reflectKotlinClassFinder"

    .line 32
    .line 33
    invoke-static {v0, v4}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const-string v4, "deserializedDescriptorResolver"

    .line 37
    .line 38
    invoke-static {v3, v4}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    const-string v4, "errorReporter"

    .line 42
    .line 43
    move-object/from16 v8, p6

    .line 44
    .line 45
    invoke-static {v8, v4}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    new-instance v4, Leh/i;

    .line 49
    .line 50
    invoke-direct {v4, v0, v3}, Leh/i;-><init>(Leh/p;Leh/h;)V

    .line 51
    .line 52
    .line 53
    new-instance v5, Leh/d;

    .line 54
    .line 55
    invoke-direct {v5, p0, v7, p1, v0}, Leh/d;-><init>(Lmg/h0;Lmg/k0;Lci/n;Leh/p;)V

    .line 56
    .line 57
    .line 58
    new-instance v13, Leh/f;

    .line 59
    .line 60
    sget-object v3, Lzh/l$a;->a:Lzh/l$a;

    .line 61
    .line 62
    sget-object v9, Lug/c$a;->a:Lug/c$a;

    .line 63
    .line 64
    sget-object v0, Lzh/j;->a:Lzh/j$a;

    .line 65
    .line 66
    invoke-virtual {v0}, Lzh/j$a;->a()Lzh/j;

    .line 67
    .line 68
    .line 69
    move-result-object v10

    .line 70
    sget-object v0, Lei/l;->b:Lei/l$a;

    .line 71
    .line 72
    invoke-virtual {v0}, Lei/l$a;->a()Lei/m;

    .line 73
    .line 74
    .line 75
    move-result-object v11

    .line 76
    new-instance v12, Lgi/a;

    .line 77
    .line 78
    sget-object v0, Ldi/o;->a:Ldi/o;

    .line 79
    .line 80
    invoke-static {v0}, Lkotlin/collections/h;->d(Ljava/lang/Object;)Ljava/util/List;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-direct {v12, v0}, Lgi/a;-><init>(Ljava/util/List;)V

    .line 85
    .line 86
    .line 87
    move-object v0, v13

    .line 88
    invoke-direct/range {v0 .. v12}, Leh/f;-><init>(Lci/n;Lmg/h0;Lzh/l;Leh/i;Leh/d;Lyg/f;Lmg/k0;Lzh/r;Lug/c;Lzh/j;Lei/l;Lgi/a;)V

    .line 89
    .line 90
    .line 91
    return-object v13
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
.end method

.method public static final b(Lvg/p;Lmg/h0;Lci/n;Lmg/k0;Leh/p;Leh/h;Lzh/r;Lbh/b;Lyg/i;Leh/x;)Lyg/f;
    .locals 31

    .line 1
    move-object/from16 v14, p1

    .line 2
    .line 3
    move-object/from16 v13, p2

    .line 4
    .line 5
    move-object/from16 v9, p3

    .line 6
    .line 7
    move-object/from16 v2, p0

    .line 8
    .line 9
    move-object/from16 v15, p1

    .line 10
    .line 11
    move-object/from16 v1, p2

    .line 12
    .line 13
    move-object/from16 v3, p4

    .line 14
    .line 15
    move-object/from16 v4, p5

    .line 16
    .line 17
    move-object/from16 v6, p6

    .line 18
    .line 19
    move-object/from16 v10, p7

    .line 20
    .line 21
    move-object/from16 v11, p8

    .line 22
    .line 23
    move-object/from16 v12, p9

    .line 24
    .line 25
    const-string v0, "javaClassFinder"

    .line 26
    .line 27
    move-object/from16 v5, p0

    .line 28
    .line 29
    invoke-static {v5, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const-string v0, "module"

    .line 33
    .line 34
    invoke-static {v14, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const-string v0, "storageManager"

    .line 38
    .line 39
    invoke-static {v13, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    const-string v0, "notFoundClasses"

    .line 43
    .line 44
    invoke-static {v9, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const-string v0, "reflectKotlinClassFinder"

    .line 48
    .line 49
    move-object/from16 v5, p4

    .line 50
    .line 51
    invoke-static {v5, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    const-string v0, "deserializedDescriptorResolver"

    .line 55
    .line 56
    move-object/from16 v5, p5

    .line 57
    .line 58
    invoke-static {v5, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    const-string v0, "errorReporter"

    .line 62
    .line 63
    move-object/from16 v5, p6

    .line 64
    .line 65
    invoke-static {v5, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    const-string v0, "javaSourceElementFactory"

    .line 69
    .line 70
    move-object/from16 v5, p7

    .line 71
    .line 72
    invoke-static {v5, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    const-string v0, "singleModuleClassResolver"

    .line 76
    .line 77
    move-object/from16 v5, p8

    .line 78
    .line 79
    invoke-static {v5, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    const-string v0, "packagePartProvider"

    .line 83
    .line 84
    move-object/from16 v5, p9

    .line 85
    .line 86
    invoke-static {v5, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    new-instance v8, Lyg/b;

    .line 90
    .line 91
    move-object v0, v8

    .line 92
    sget-object v7, Lwg/j;->a:Lwg/j;

    .line 93
    .line 94
    move-object v5, v7

    .line 95
    move-object/from16 p0, v8

    .line 96
    .line 97
    const-string v8, "DO_NOTHING"

    .line 98
    .line 99
    invoke-static {v7, v8}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    sget-object v8, Lwg/g;->a:Lwg/g;

    .line 103
    .line 104
    move-object v7, v8

    .line 105
    const-string v9, "EMPTY"

    .line 106
    .line 107
    invoke-static {v8, v9}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    sget-object v8, Lwg/f$a;->a:Lwg/f$a;

    .line 111
    .line 112
    move-object/from16 v9, p0

    .line 113
    .line 114
    new-instance v14, Lvh/b;

    .line 115
    .line 116
    move-object/from16 p0, v0

    .line 117
    .line 118
    move-object/from16 v27, v9

    .line 119
    .line 120
    move-object/from16 v0, p3

    .line 121
    .line 122
    move-object v9, v14

    .line 123
    move-object/from16 v28, v1

    .line 124
    .line 125
    invoke-static {}, Lkotlin/collections/h;->i()Ljava/util/List;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    invoke-direct {v14, v13, v1}, Lvh/b;-><init>(Lci/n;Ljava/lang/Iterable;)V

    .line 130
    .line 131
    .line 132
    sget-object v13, Lmg/d1$a;->a:Lmg/d1$a;

    .line 133
    .line 134
    sget-object v14, Lug/c$a;->a:Lug/c$a;

    .line 135
    .line 136
    move-object/from16 v1, p1

    .line 137
    .line 138
    move-object/from16 v29, v2

    .line 139
    .line 140
    new-instance v2, Ljg/j;

    .line 141
    .line 142
    move-object/from16 v16, v2

    .line 143
    .line 144
    invoke-direct {v2, v1, v0}, Ljg/j;-><init>(Lmg/h0;Lmg/k0;)V

    .line 145
    .line 146
    .line 147
    new-instance v0, Lvg/d;

    .line 148
    .line 149
    move-object/from16 v17, v0

    .line 150
    .line 151
    sget-object v1, Lvg/x;->d:Lvg/x$b;

    .line 152
    .line 153
    invoke-virtual {v1}, Lvg/x$b;->a()Lvg/x;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    invoke-direct {v0, v2}, Lvg/d;-><init>(Lvg/x;)V

    .line 158
    .line 159
    .line 160
    new-instance v0, Ldh/l;

    .line 161
    .line 162
    move-object/from16 v18, v0

    .line 163
    .line 164
    new-instance v2, Ldh/d;

    .line 165
    .line 166
    move-object/from16 v30, v3

    .line 167
    .line 168
    sget-object v3, Lyg/c$a;->a:Lyg/c$a;

    .line 169
    .line 170
    move-object/from16 v20, v3

    .line 171
    .line 172
    invoke-direct {v2, v3}, Ldh/d;-><init>(Lyg/c;)V

    .line 173
    .line 174
    .line 175
    invoke-direct {v0, v2}, Ldh/l;-><init>(Ldh/d;)V

    .line 176
    .line 177
    .line 178
    sget-object v19, Lvg/q$a;->a:Lvg/q$a;

    .line 179
    .line 180
    sget-object v0, Lei/l;->b:Lei/l$a;

    .line 181
    .line 182
    invoke-virtual {v0}, Lei/l$a;->a()Lei/m;

    .line 183
    .line 184
    .line 185
    move-result-object v21

    .line 186
    invoke-virtual {v1}, Lvg/x$b;->a()Lvg/x;

    .line 187
    .line 188
    .line 189
    move-result-object v22

    .line 190
    new-instance v0, Leh/g$a;

    .line 191
    .line 192
    move-object/from16 v23, v0

    .line 193
    .line 194
    invoke-direct {v0}, Leh/g$a;-><init>()V

    .line 195
    .line 196
    .line 197
    const/16 v24, 0x0

    .line 198
    .line 199
    const/high16 v25, 0x800000

    .line 200
    .line 201
    const/16 v26, 0x0

    .line 202
    .line 203
    move-object/from16 v0, p0

    .line 204
    .line 205
    move-object/from16 v1, v28

    .line 206
    .line 207
    move-object/from16 v2, v29

    .line 208
    .line 209
    move-object/from16 v3, v30

    .line 210
    .line 211
    invoke-direct/range {v0 .. v26}, Lyg/b;-><init>(Lci/n;Lvg/p;Leh/p;Leh/h;Lwg/j;Lzh/r;Lwg/g;Lwg/f;Lvh/a;Lbh/b;Lyg/i;Leh/x;Lmg/d1;Lug/c;Lmg/h0;Ljg/j;Lvg/d;Ldh/l;Lvg/q;Lyg/c;Lei/l;Lvg/x;Lvg/u;Luh/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 212
    .line 213
    .line 214
    new-instance v0, Lyg/f;

    .line 215
    .line 216
    move-object/from16 v1, v27

    .line 217
    .line 218
    invoke-direct {v0, v1}, Lyg/f;-><init>(Lyg/b;)V

    .line 219
    .line 220
    .line 221
    return-object v0
.end method

.method public static synthetic c(Lvg/p;Lmg/h0;Lci/n;Lmg/k0;Leh/p;Leh/h;Lzh/r;Lbh/b;Lyg/i;Leh/x;ILjava/lang/Object;)Lyg/f;
    .locals 11

    .line 1
    move/from16 v0, p10

    .line 2
    .line 3
    and-int/lit16 v0, v0, 0x200

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object v0, Leh/x$a;->a:Leh/x$a;

    .line 8
    .line 9
    move-object v10, v0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object/from16 v10, p9

    .line 12
    .line 13
    :goto_0
    move-object v1, p0

    .line 14
    move-object v2, p1

    .line 15
    move-object v3, p2

    .line 16
    move-object v4, p3

    .line 17
    move-object v5, p4

    .line 18
    move-object/from16 v6, p5

    .line 19
    .line 20
    move-object/from16 v7, p6

    .line 21
    .line 22
    move-object/from16 v8, p7

    .line 23
    .line 24
    move-object/from16 v9, p8

    .line 25
    .line 26
    invoke-static/range {v1 .. v10}, Leh/g;->b(Lvg/p;Lmg/h0;Lci/n;Lmg/k0;Leh/p;Leh/h;Lzh/r;Lbh/b;Lyg/i;Leh/x;)Lyg/f;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    return-object v0
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
