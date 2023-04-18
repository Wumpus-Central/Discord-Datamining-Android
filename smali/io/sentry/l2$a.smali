.class public final Lio/sentry/l2$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/sentry/l2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lio/sentry/l2;Ljava/lang/String;Lio/sentry/x0;Lio/sentry/g0;)Z
    .locals 4

    .line 1
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x1

    .line 10
    const/4 v3, -0x1

    .line 11
    sparse-switch v0, :sswitch_data_0

    .line 12
    .line 13
    .line 14
    goto/16 :goto_0

    .line 15
    .line 16
    :sswitch_0
    const-string v0, "platform"

    .line 17
    .line 18
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    if-nez p2, :cond_0

    .line 23
    .line 24
    goto/16 :goto_0

    .line 25
    .line 26
    :cond_0
    const/16 v3, 0xc

    .line 27
    .line 28
    goto/16 :goto_0

    .line 29
    .line 30
    :sswitch_1
    const-string v0, "request"

    .line 31
    .line 32
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result p2

    .line 36
    if-nez p2, :cond_1

    .line 37
    .line 38
    goto/16 :goto_0

    .line 39
    .line 40
    :cond_1
    const/16 v3, 0xb

    .line 41
    .line 42
    goto/16 :goto_0

    .line 43
    .line 44
    :sswitch_2
    const-string v0, "release"

    .line 45
    .line 46
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result p2

    .line 50
    if-nez p2, :cond_2

    .line 51
    .line 52
    goto/16 :goto_0

    .line 53
    .line 54
    :cond_2
    const/16 v3, 0xa

    .line 55
    .line 56
    goto/16 :goto_0

    .line 57
    .line 58
    :sswitch_3
    const-string v0, "event_id"

    .line 59
    .line 60
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result p2

    .line 64
    if-nez p2, :cond_3

    .line 65
    .line 66
    goto/16 :goto_0

    .line 67
    .line 68
    :cond_3
    const/16 v3, 0x9

    .line 69
    .line 70
    goto/16 :goto_0

    .line 71
    .line 72
    :sswitch_4
    const-string v0, "extra"

    .line 73
    .line 74
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result p2

    .line 78
    if-nez p2, :cond_4

    .line 79
    .line 80
    goto/16 :goto_0

    .line 81
    .line 82
    :cond_4
    const/16 v3, 0x8

    .line 83
    .line 84
    goto/16 :goto_0

    .line 85
    .line 86
    :sswitch_5
    const-string v0, "user"

    .line 87
    .line 88
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result p2

    .line 92
    if-nez p2, :cond_5

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_5
    const/4 v3, 0x7

    .line 96
    goto :goto_0

    .line 97
    :sswitch_6
    const-string v0, "tags"

    .line 98
    .line 99
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result p2

    .line 103
    if-nez p2, :cond_6

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_6
    const/4 v3, 0x6

    .line 107
    goto :goto_0

    .line 108
    :sswitch_7
    const-string v0, "dist"

    .line 109
    .line 110
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result p2

    .line 114
    if-nez p2, :cond_7

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_7
    const/4 v3, 0x5

    .line 118
    goto :goto_0

    .line 119
    :sswitch_8
    const-string v0, "sdk"

    .line 120
    .line 121
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result p2

    .line 125
    if-nez p2, :cond_8

    .line 126
    .line 127
    goto :goto_0

    .line 128
    :cond_8
    const/4 v3, 0x4

    .line 129
    goto :goto_0

    .line 130
    :sswitch_9
    const-string v0, "breadcrumbs"

    .line 131
    .line 132
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result p2

    .line 136
    if-nez p2, :cond_9

    .line 137
    .line 138
    goto :goto_0

    .line 139
    :cond_9
    const/4 v3, 0x3

    .line 140
    goto :goto_0

    .line 141
    :sswitch_a
    const-string v0, "environment"

    .line 142
    .line 143
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result p2

    .line 147
    if-nez p2, :cond_a

    .line 148
    .line 149
    goto :goto_0

    .line 150
    :cond_a
    const/4 v3, 0x2

    .line 151
    goto :goto_0

    .line 152
    :sswitch_b
    const-string v0, "contexts"

    .line 153
    .line 154
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result p2

    .line 158
    if-nez p2, :cond_b

    .line 159
    .line 160
    goto :goto_0

    .line 161
    :cond_b
    move v3, v2

    .line 162
    goto :goto_0

    .line 163
    :sswitch_c
    const-string v0, "server_name"

    .line 164
    .line 165
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result p2

    .line 169
    if-nez p2, :cond_c

    .line 170
    .line 171
    goto :goto_0

    .line 172
    :cond_c
    move v3, v1

    .line 173
    :goto_0
    packed-switch v3, :pswitch_data_0

    .line 174
    .line 175
    .line 176
    return v1

    .line 177
    :pswitch_0
    invoke-virtual {p3}, Lio/sentry/x0;->Z0()Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object p2

    .line 181
    invoke-static {p1, p2}, Lio/sentry/l2;->u(Lio/sentry/l2;Ljava/lang/String;)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    return v2

    .line 185
    :pswitch_1
    new-instance p2, Lio/sentry/protocol/k$a;

    .line 186
    .line 187
    invoke-direct {p2}, Lio/sentry/protocol/k$a;-><init>()V

    .line 188
    .line 189
    .line 190
    invoke-virtual {p3, p4, p2}, Lio/sentry/x0;->Y0(Lio/sentry/g0;Lio/sentry/r0;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object p2

    .line 194
    check-cast p2, Lio/sentry/protocol/k;

    .line 195
    .line 196
    invoke-static {p1, p2}, Lio/sentry/l2;->m(Lio/sentry/l2;Lio/sentry/protocol/k;)Lio/sentry/protocol/k;

    .line 197
    .line 198
    .line 199
    return v2

    .line 200
    :pswitch_2
    invoke-virtual {p3}, Lio/sentry/x0;->Z0()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object p2

    .line 204
    invoke-static {p1, p2}, Lio/sentry/l2;->q(Lio/sentry/l2;Ljava/lang/String;)Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    return v2

    .line 208
    :pswitch_3
    new-instance p2, Lio/sentry/protocol/p$a;

    .line 209
    .line 210
    invoke-direct {p2}, Lio/sentry/protocol/p$a;-><init>()V

    .line 211
    .line 212
    .line 213
    invoke-virtual {p3, p4, p2}, Lio/sentry/x0;->Y0(Lio/sentry/g0;Lio/sentry/r0;)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object p2

    .line 217
    check-cast p2, Lio/sentry/protocol/p;

    .line 218
    .line 219
    invoke-static {p1, p2}, Lio/sentry/l2;->b(Lio/sentry/l2;Lio/sentry/protocol/p;)Lio/sentry/protocol/p;

    .line 220
    .line 221
    .line 222
    return v2

    .line 223
    :pswitch_4
    invoke-virtual {p3}, Lio/sentry/x0;->X0()Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object p2

    .line 227
    check-cast p2, Ljava/util/Map;

    .line 228
    .line 229
    invoke-static {p2}, Lio/sentry/util/a;->b(Ljava/util/Map;)Ljava/util/Map;

    .line 230
    .line 231
    .line 232
    move-result-object p2

    .line 233
    invoke-static {p1, p2}, Lio/sentry/l2;->i(Lio/sentry/l2;Ljava/util/Map;)Ljava/util/Map;

    .line 234
    .line 235
    .line 236
    return v2

    .line 237
    :pswitch_5
    new-instance p2, Lio/sentry/protocol/z$a;

    .line 238
    .line 239
    invoke-direct {p2}, Lio/sentry/protocol/z$a;-><init>()V

    .line 240
    .line 241
    .line 242
    invoke-virtual {p3, p4, p2}, Lio/sentry/x0;->Y0(Lio/sentry/g0;Lio/sentry/r0;)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object p2

    .line 246
    check-cast p2, Lio/sentry/protocol/z;

    .line 247
    .line 248
    invoke-static {p1, p2}, Lio/sentry/l2;->w(Lio/sentry/l2;Lio/sentry/protocol/z;)Lio/sentry/protocol/z;

    .line 249
    .line 250
    .line 251
    return v2

    .line 252
    :pswitch_6
    invoke-virtual {p3}, Lio/sentry/x0;->X0()Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object p2

    .line 256
    check-cast p2, Ljava/util/Map;

    .line 257
    .line 258
    invoke-static {p2}, Lio/sentry/util/a;->b(Ljava/util/Map;)Ljava/util/Map;

    .line 259
    .line 260
    .line 261
    move-result-object p2

    .line 262
    invoke-static {p1, p2}, Lio/sentry/l2;->o(Lio/sentry/l2;Ljava/util/Map;)Ljava/util/Map;

    .line 263
    .line 264
    .line 265
    return v2

    .line 266
    :pswitch_7
    invoke-virtual {p3}, Lio/sentry/x0;->Z0()Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object p2

    .line 270
    invoke-static {p1, p2}, Lio/sentry/l2;->e(Lio/sentry/l2;Ljava/lang/String;)Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    return v2

    .line 274
    :pswitch_8
    new-instance p2, Lio/sentry/protocol/n$a;

    .line 275
    .line 276
    invoke-direct {p2}, Lio/sentry/protocol/n$a;-><init>()V

    .line 277
    .line 278
    .line 279
    invoke-virtual {p3, p4, p2}, Lio/sentry/x0;->Y0(Lio/sentry/g0;Lio/sentry/r0;)Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object p2

    .line 283
    check-cast p2, Lio/sentry/protocol/n;

    .line 284
    .line 285
    invoke-static {p1, p2}, Lio/sentry/l2;->k(Lio/sentry/l2;Lio/sentry/protocol/n;)Lio/sentry/protocol/n;

    .line 286
    .line 287
    .line 288
    return v2

    .line 289
    :pswitch_9
    new-instance p2, Lio/sentry/d$a;

    .line 290
    .line 291
    invoke-direct {p2}, Lio/sentry/d$a;-><init>()V

    .line 292
    .line 293
    .line 294
    invoke-virtual {p3, p4, p2}, Lio/sentry/x0;->U0(Lio/sentry/g0;Lio/sentry/r0;)Ljava/util/List;

    .line 295
    .line 296
    .line 297
    move-result-object p2

    .line 298
    invoke-static {p1, p2}, Lio/sentry/l2;->g(Lio/sentry/l2;Ljava/util/List;)Ljava/util/List;

    .line 299
    .line 300
    .line 301
    return v2

    .line 302
    :pswitch_a
    invoke-virtual {p3}, Lio/sentry/x0;->Z0()Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object p2

    .line 306
    invoke-static {p1, p2}, Lio/sentry/l2;->s(Lio/sentry/l2;Ljava/lang/String;)Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    return v2

    .line 310
    :pswitch_b
    new-instance p2, Lio/sentry/protocol/c$a;

    .line 311
    .line 312
    invoke-direct {p2}, Lio/sentry/protocol/c$a;-><init>()V

    .line 313
    .line 314
    .line 315
    invoke-virtual {p2, p3, p4}, Lio/sentry/protocol/c$a;->b(Lio/sentry/x0;Lio/sentry/g0;)Lio/sentry/protocol/c;

    .line 316
    .line 317
    .line 318
    move-result-object p2

    .line 319
    invoke-static {p1}, Lio/sentry/l2;->c(Lio/sentry/l2;)Lio/sentry/protocol/c;

    .line 320
    .line 321
    .line 322
    move-result-object p1

    .line 323
    invoke-virtual {p1, p2}, Ljava/util/AbstractMap;->putAll(Ljava/util/Map;)V

    .line 324
    .line 325
    .line 326
    return v2

    .line 327
    :pswitch_c
    invoke-virtual {p3}, Lio/sentry/x0;->Z0()Ljava/lang/String;

    .line 328
    .line 329
    .line 330
    move-result-object p2

    .line 331
    invoke-static {p1, p2}, Lio/sentry/l2;->y(Lio/sentry/l2;Ljava/lang/String;)Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    return v2

    .line 335
    :sswitch_data_0
    .sparse-switch
        -0x2d39e9f9 -> :sswitch_c
        -0x21d07f5c -> :sswitch_b
        -0x51ecded -> :sswitch_a
        -0x3112f30 -> :sswitch_9
        0x1bc3a -> :sswitch_8
        0x2f0da6 -> :sswitch_7
        0x363419 -> :sswitch_6
        0x36ebcb -> :sswitch_5
        0x5c79410 -> :sswitch_4
        0x1093c0e0 -> :sswitch_3
        0x41012807 -> :sswitch_2
        0x414ef28f -> :sswitch_1
        0x6fbd6873 -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_0
    .packed-switch 0x0
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
