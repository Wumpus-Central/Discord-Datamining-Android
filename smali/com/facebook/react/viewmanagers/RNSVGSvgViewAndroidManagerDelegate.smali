.class public Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerDelegate;
.super Lcom/facebook/react/uimanager/BaseViewManagerDelegate;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Landroid/view/View;",
        "U::",
        "Lcom/facebook/react/uimanager/BaseViewManagerInterface<",
        "TT;>;:",
        "Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface<",
        "TT;>;>",
        "Lcom/facebook/react/uimanager/BaseViewManagerDelegate<",
        "TT;TU;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/facebook/react/uimanager/BaseViewManagerInterface;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TU;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;-><init>(Lcom/facebook/react/uimanager/BaseViewManagerInterface;)V

    return-void
.end method


# virtual methods
.method public setProperty(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

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
    const/4 v2, -0x1

    .line 10
    sparse-switch v0, :sswitch_data_0

    .line 11
    .line 12
    .line 13
    goto/16 :goto_0

    .line 14
    .line 15
    :sswitch_0
    const-string v0, "borderStartColor"

    .line 16
    .line 17
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    goto/16 :goto_0

    .line 24
    .line 25
    :cond_0
    const/16 v2, 0x29

    .line 26
    .line 27
    goto/16 :goto_0

    .line 28
    .line 29
    :sswitch_1
    const-string v0, "nextFocusRight"

    .line 30
    .line 31
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-nez v0, :cond_1

    .line 36
    .line 37
    goto/16 :goto_0

    .line 38
    .line 39
    :cond_1
    const/16 v2, 0x28

    .line 40
    .line 41
    goto/16 :goto_0

    .line 42
    .line 43
    :sswitch_2
    const-string v0, "meetOrSlice"

    .line 44
    .line 45
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-nez v0, :cond_2

    .line 50
    .line 51
    goto/16 :goto_0

    .line 52
    .line 53
    :cond_2
    const/16 v2, 0x27

    .line 54
    .line 55
    goto/16 :goto_0

    .line 56
    .line 57
    :sswitch_3
    const-string v0, "nativeBackgroundAndroid"

    .line 58
    .line 59
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-nez v0, :cond_3

    .line 64
    .line 65
    goto/16 :goto_0

    .line 66
    .line 67
    :cond_3
    const/16 v2, 0x26

    .line 68
    .line 69
    goto/16 :goto_0

    .line 70
    .line 71
    :sswitch_4
    const-string v0, "needsOffscreenAlphaCompositing"

    .line 72
    .line 73
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-nez v0, :cond_4

    .line 78
    .line 79
    goto/16 :goto_0

    .line 80
    .line 81
    :cond_4
    const/16 v2, 0x25

    .line 82
    .line 83
    goto/16 :goto_0

    .line 84
    .line 85
    :sswitch_5
    const-string v0, "focusable"

    .line 86
    .line 87
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    if-nez v0, :cond_5

    .line 92
    .line 93
    goto/16 :goto_0

    .line 94
    .line 95
    :cond_5
    const/16 v2, 0x24

    .line 96
    .line 97
    goto/16 :goto_0

    .line 98
    .line 99
    :sswitch_6
    const-string v0, "borderRadius"

    .line 100
    .line 101
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    if-nez v0, :cond_6

    .line 106
    .line 107
    goto/16 :goto_0

    .line 108
    .line 109
    :cond_6
    const/16 v2, 0x23

    .line 110
    .line 111
    goto/16 :goto_0

    .line 112
    .line 113
    :sswitch_7
    const-string v0, "tintColor"

    .line 114
    .line 115
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    if-nez v0, :cond_7

    .line 120
    .line 121
    goto/16 :goto_0

    .line 122
    .line 123
    :cond_7
    const/16 v2, 0x22

    .line 124
    .line 125
    goto/16 :goto_0

    .line 126
    .line 127
    :sswitch_8
    const-string v0, "borderEndColor"

    .line 128
    .line 129
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    if-nez v0, :cond_8

    .line 134
    .line 135
    goto/16 :goto_0

    .line 136
    .line 137
    :cond_8
    const/16 v2, 0x21

    .line 138
    .line 139
    goto/16 :goto_0

    .line 140
    .line 141
    :sswitch_9
    const-string v0, "hitSlop"

    .line 142
    .line 143
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result v0

    .line 147
    if-nez v0, :cond_9

    .line 148
    .line 149
    goto/16 :goto_0

    .line 150
    .line 151
    :cond_9
    const/16 v2, 0x20

    .line 152
    .line 153
    goto/16 :goto_0

    .line 154
    .line 155
    :sswitch_a
    const-string v0, "borderStyle"

    .line 156
    .line 157
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result v0

    .line 161
    if-nez v0, :cond_a

    .line 162
    .line 163
    goto/16 :goto_0

    .line 164
    .line 165
    :cond_a
    const/16 v2, 0x1f

    .line 166
    .line 167
    goto/16 :goto_0

    .line 168
    .line 169
    :sswitch_b
    const-string v0, "borderColor"

    .line 170
    .line 171
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result v0

    .line 175
    if-nez v0, :cond_b

    .line 176
    .line 177
    goto/16 :goto_0

    .line 178
    .line 179
    :cond_b
    const/16 v2, 0x1e

    .line 180
    .line 181
    goto/16 :goto_0

    .line 182
    .line 183
    :sswitch_c
    const-string v0, "nextFocusUp"

    .line 184
    .line 185
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    move-result v0

    .line 189
    if-nez v0, :cond_c

    .line 190
    .line 191
    goto/16 :goto_0

    .line 192
    .line 193
    :cond_c
    const/16 v2, 0x1d

    .line 194
    .line 195
    goto/16 :goto_0

    .line 196
    .line 197
    :sswitch_d
    const-string v0, "borderBottomRightRadius"

    .line 198
    .line 199
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    move-result v0

    .line 203
    if-nez v0, :cond_d

    .line 204
    .line 205
    goto/16 :goto_0

    .line 206
    .line 207
    :cond_d
    const/16 v2, 0x1c

    .line 208
    .line 209
    goto/16 :goto_0

    .line 210
    .line 211
    :sswitch_e
    const-string v0, "borderBottomLeftRadius"

    .line 212
    .line 213
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    move-result v0

    .line 217
    if-nez v0, :cond_e

    .line 218
    .line 219
    goto/16 :goto_0

    .line 220
    .line 221
    :cond_e
    const/16 v2, 0x1b

    .line 222
    .line 223
    goto/16 :goto_0

    .line 224
    .line 225
    :sswitch_f
    const-string v0, "nextFocusForward"

    .line 226
    .line 227
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    move-result v0

    .line 231
    if-nez v0, :cond_f

    .line 232
    .line 233
    goto/16 :goto_0

    .line 234
    .line 235
    :cond_f
    const/16 v2, 0x1a

    .line 236
    .line 237
    goto/16 :goto_0

    .line 238
    .line 239
    :sswitch_10
    const-string v0, "borderTopRightRadius"

    .line 240
    .line 241
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 242
    .line 243
    .line 244
    move-result v0

    .line 245
    if-nez v0, :cond_10

    .line 246
    .line 247
    goto/16 :goto_0

    .line 248
    .line 249
    :cond_10
    const/16 v2, 0x19

    .line 250
    .line 251
    goto/16 :goto_0

    .line 252
    .line 253
    :sswitch_11
    const-string v0, "vbWidth"

    .line 254
    .line 255
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    move-result v0

    .line 259
    if-nez v0, :cond_11

    .line 260
    .line 261
    goto/16 :goto_0

    .line 262
    .line 263
    :cond_11
    const/16 v2, 0x18

    .line 264
    .line 265
    goto/16 :goto_0

    .line 266
    .line 267
    :sswitch_12
    const-string v0, "color"

    .line 268
    .line 269
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 270
    .line 271
    .line 272
    move-result v0

    .line 273
    if-nez v0, :cond_12

    .line 274
    .line 275
    goto/16 :goto_0

    .line 276
    .line 277
    :cond_12
    const/16 v2, 0x17

    .line 278
    .line 279
    goto/16 :goto_0

    .line 280
    .line 281
    :sswitch_13
    const-string v0, "align"

    .line 282
    .line 283
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 284
    .line 285
    .line 286
    move-result v0

    .line 287
    if-nez v0, :cond_13

    .line 288
    .line 289
    goto/16 :goto_0

    .line 290
    .line 291
    :cond_13
    const/16 v2, 0x16

    .line 292
    .line 293
    goto/16 :goto_0

    .line 294
    .line 295
    :sswitch_14
    const-string v0, "minY"

    .line 296
    .line 297
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 298
    .line 299
    .line 300
    move-result v0

    .line 301
    if-nez v0, :cond_14

    .line 302
    .line 303
    goto/16 :goto_0

    .line 304
    .line 305
    :cond_14
    const/16 v2, 0x15

    .line 306
    .line 307
    goto/16 :goto_0

    .line 308
    .line 309
    :sswitch_15
    const-string v0, "minX"

    .line 310
    .line 311
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 312
    .line 313
    .line 314
    move-result v0

    .line 315
    if-nez v0, :cond_15

    .line 316
    .line 317
    goto/16 :goto_0

    .line 318
    .line 319
    :cond_15
    const/16 v2, 0x14

    .line 320
    .line 321
    goto/16 :goto_0

    .line 322
    .line 323
    :sswitch_16
    const-string v0, "nativeForegroundAndroid"

    .line 324
    .line 325
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 326
    .line 327
    .line 328
    move-result v0

    .line 329
    if-nez v0, :cond_16

    .line 330
    .line 331
    goto/16 :goto_0

    .line 332
    .line 333
    :cond_16
    const/16 v2, 0x13

    .line 334
    .line 335
    goto/16 :goto_0

    .line 336
    .line 337
    :sswitch_17
    const-string v0, "borderBottomEndRadius"

    .line 338
    .line 339
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 340
    .line 341
    .line 342
    move-result v0

    .line 343
    if-nez v0, :cond_17

    .line 344
    .line 345
    goto/16 :goto_0

    .line 346
    .line 347
    :cond_17
    const/16 v2, 0x12

    .line 348
    .line 349
    goto/16 :goto_0

    .line 350
    .line 351
    :sswitch_18
    const-string v0, "borderLeftColor"

    .line 352
    .line 353
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 354
    .line 355
    .line 356
    move-result v0

    .line 357
    if-nez v0, :cond_18

    .line 358
    .line 359
    goto/16 :goto_0

    .line 360
    .line 361
    :cond_18
    const/16 v2, 0x11

    .line 362
    .line 363
    goto/16 :goto_0

    .line 364
    .line 365
    :sswitch_19
    const-string v0, "removeClippedSubviews"

    .line 366
    .line 367
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 368
    .line 369
    .line 370
    move-result v0

    .line 371
    if-nez v0, :cond_19

    .line 372
    .line 373
    goto/16 :goto_0

    .line 374
    .line 375
    :cond_19
    const/16 v2, 0x10

    .line 376
    .line 377
    goto/16 :goto_0

    .line 378
    .line 379
    :sswitch_1a
    const-string v0, "pointerEvents"

    .line 380
    .line 381
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 382
    .line 383
    .line 384
    move-result v0

    .line 385
    if-nez v0, :cond_1a

    .line 386
    .line 387
    goto/16 :goto_0

    .line 388
    .line 389
    :cond_1a
    const/16 v2, 0xf

    .line 390
    .line 391
    goto/16 :goto_0

    .line 392
    .line 393
    :sswitch_1b
    const-string v0, "bbWidth"

    .line 394
    .line 395
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 396
    .line 397
    .line 398
    move-result v0

    .line 399
    if-nez v0, :cond_1b

    .line 400
    .line 401
    goto/16 :goto_0

    .line 402
    .line 403
    :cond_1b
    const/16 v2, 0xe

    .line 404
    .line 405
    goto/16 :goto_0

    .line 406
    .line 407
    :sswitch_1c
    const-string v0, "borderTopEndRadius"

    .line 408
    .line 409
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 410
    .line 411
    .line 412
    move-result v0

    .line 413
    if-nez v0, :cond_1c

    .line 414
    .line 415
    goto/16 :goto_0

    .line 416
    .line 417
    :cond_1c
    const/16 v2, 0xd

    .line 418
    .line 419
    goto/16 :goto_0

    .line 420
    .line 421
    :sswitch_1d
    const-string v0, "nextFocusLeft"

    .line 422
    .line 423
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 424
    .line 425
    .line 426
    move-result v0

    .line 427
    if-nez v0, :cond_1d

    .line 428
    .line 429
    goto/16 :goto_0

    .line 430
    .line 431
    :cond_1d
    const/16 v2, 0xc

    .line 432
    .line 433
    goto/16 :goto_0

    .line 434
    .line 435
    :sswitch_1e
    const-string v0, "nextFocusDown"

    .line 436
    .line 437
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 438
    .line 439
    .line 440
    move-result v0

    .line 441
    if-nez v0, :cond_1e

    .line 442
    .line 443
    goto/16 :goto_0

    .line 444
    .line 445
    :cond_1e
    const/16 v2, 0xb

    .line 446
    .line 447
    goto/16 :goto_0

    .line 448
    .line 449
    :sswitch_1f
    const-string v0, "hasTVPreferredFocus"

    .line 450
    .line 451
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 452
    .line 453
    .line 454
    move-result v0

    .line 455
    if-nez v0, :cond_1f

    .line 456
    .line 457
    goto/16 :goto_0

    .line 458
    .line 459
    :cond_1f
    const/16 v2, 0xa

    .line 460
    .line 461
    goto/16 :goto_0

    .line 462
    .line 463
    :sswitch_20
    const-string v0, "borderBottomStartRadius"

    .line 464
    .line 465
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 466
    .line 467
    .line 468
    move-result v0

    .line 469
    if-nez v0, :cond_20

    .line 470
    .line 471
    goto/16 :goto_0

    .line 472
    .line 473
    :cond_20
    const/16 v2, 0x9

    .line 474
    .line 475
    goto/16 :goto_0

    .line 476
    .line 477
    :sswitch_21
    const-string v0, "borderTopStartRadius"

    .line 478
    .line 479
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 480
    .line 481
    .line 482
    move-result v0

    .line 483
    if-nez v0, :cond_21

    .line 484
    .line 485
    goto/16 :goto_0

    .line 486
    .line 487
    :cond_21
    const/16 v2, 0x8

    .line 488
    .line 489
    goto/16 :goto_0

    .line 490
    .line 491
    :sswitch_22
    const-string v0, "accessible"

    .line 492
    .line 493
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 494
    .line 495
    .line 496
    move-result v0

    .line 497
    if-nez v0, :cond_22

    .line 498
    .line 499
    goto :goto_0

    .line 500
    :cond_22
    const/4 v2, 0x7

    .line 501
    goto :goto_0

    .line 502
    :sswitch_23
    const-string v0, "borderTopLeftRadius"

    .line 503
    .line 504
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 505
    .line 506
    .line 507
    move-result v0

    .line 508
    if-nez v0, :cond_23

    .line 509
    .line 510
    goto :goto_0

    .line 511
    :cond_23
    const/4 v2, 0x6

    .line 512
    goto :goto_0

    .line 513
    :sswitch_24
    const-string v0, "borderBottomColor"

    .line 514
    .line 515
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 516
    .line 517
    .line 518
    move-result v0

    .line 519
    if-nez v0, :cond_24

    .line 520
    .line 521
    goto :goto_0

    .line 522
    :cond_24
    const/4 v2, 0x5

    .line 523
    goto :goto_0

    .line 524
    :sswitch_25
    const-string v0, "borderTopColor"

    .line 525
    .line 526
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 527
    .line 528
    .line 529
    move-result v0

    .line 530
    if-nez v0, :cond_25

    .line 531
    .line 532
    goto :goto_0

    .line 533
    :cond_25
    const/4 v2, 0x4

    .line 534
    goto :goto_0

    .line 535
    :sswitch_26
    const-string v0, "vbHeight"

    .line 536
    .line 537
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 538
    .line 539
    .line 540
    move-result v0

    .line 541
    if-nez v0, :cond_26

    .line 542
    .line 543
    goto :goto_0

    .line 544
    :cond_26
    const/4 v2, 0x3

    .line 545
    goto :goto_0

    .line 546
    :sswitch_27
    const-string v0, "backfaceVisibility"

    .line 547
    .line 548
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 549
    .line 550
    .line 551
    move-result v0

    .line 552
    if-nez v0, :cond_27

    .line 553
    .line 554
    goto :goto_0

    .line 555
    :cond_27
    const/4 v2, 0x2

    .line 556
    goto :goto_0

    .line 557
    :sswitch_28
    const-string v0, "borderRightColor"

    .line 558
    .line 559
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 560
    .line 561
    .line 562
    move-result v0

    .line 563
    if-nez v0, :cond_28

    .line 564
    .line 565
    goto :goto_0

    .line 566
    :cond_28
    const/4 v2, 0x1

    .line 567
    goto :goto_0

    .line 568
    :sswitch_29
    const-string v0, "bbHeight"

    .line 569
    .line 570
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 571
    .line 572
    .line 573
    move-result v0

    .line 574
    if-nez v0, :cond_29

    .line 575
    .line 576
    goto :goto_0

    .line 577
    :cond_29
    move v2, v1

    .line 578
    :goto_0
    const/4 v0, 0x0

    .line 579
    const/high16 v3, 0x7fc00000    # Float.NaN

    .line 580
    .line 581
    const-wide/16 v4, 0x0

    .line 582
    .line 583
    const/4 v6, 0x0

    .line 584
    packed-switch v2, :pswitch_data_0

    .line 585
    .line 586
    .line 587
    invoke-super {p0, p1, p2, p3}, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->setProperty(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V

    .line 588
    .line 589
    .line 590
    goto/16 :goto_1d

    .line 591
    .line 592
    :pswitch_0
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 593
    .line 594
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 595
    .line 596
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 597
    .line 598
    .line 599
    move-result-object v0

    .line 600
    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    .line 601
    .line 602
    .line 603
    move-result-object p3

    .line 604
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setBorderStartColor(Landroid/view/View;Ljava/lang/Integer;)V

    .line 605
    .line 606
    .line 607
    goto/16 :goto_1d

    .line 608
    .line 609
    :pswitch_1
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 610
    .line 611
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 612
    .line 613
    if-nez p3, :cond_2a

    .line 614
    .line 615
    goto :goto_1

    .line 616
    :cond_2a
    check-cast p3, Ljava/lang/Double;

    .line 617
    .line 618
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 619
    .line 620
    .line 621
    move-result v1

    .line 622
    :goto_1
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setNextFocusRight(Landroid/view/View;I)V

    .line 623
    .line 624
    .line 625
    goto/16 :goto_1d

    .line 626
    .line 627
    :pswitch_2
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 628
    .line 629
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 630
    .line 631
    if-nez p3, :cond_2b

    .line 632
    .line 633
    goto :goto_2

    .line 634
    :cond_2b
    check-cast p3, Ljava/lang/Double;

    .line 635
    .line 636
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 637
    .line 638
    .line 639
    move-result v1

    .line 640
    :goto_2
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setMeetOrSlice(Landroid/view/View;I)V

    .line 641
    .line 642
    .line 643
    goto/16 :goto_1d

    .line 644
    .line 645
    :pswitch_3
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 646
    .line 647
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 648
    .line 649
    check-cast p3, Lcom/facebook/react/bridge/ReadableMap;

    .line 650
    .line 651
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setNativeBackgroundAndroid(Landroid/view/View;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 652
    .line 653
    .line 654
    goto/16 :goto_1d

    .line 655
    .line 656
    :pswitch_4
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 657
    .line 658
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 659
    .line 660
    if-nez p3, :cond_2c

    .line 661
    .line 662
    goto :goto_3

    .line 663
    :cond_2c
    check-cast p3, Ljava/lang/Boolean;

    .line 664
    .line 665
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 666
    .line 667
    .line 668
    move-result v1

    .line 669
    :goto_3
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setNeedsOffscreenAlphaCompositing(Landroid/view/View;Z)V

    .line 670
    .line 671
    .line 672
    goto/16 :goto_1d

    .line 673
    .line 674
    :pswitch_5
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 675
    .line 676
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 677
    .line 678
    if-nez p3, :cond_2d

    .line 679
    .line 680
    goto :goto_4

    .line 681
    :cond_2d
    check-cast p3, Ljava/lang/Boolean;

    .line 682
    .line 683
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 684
    .line 685
    .line 686
    move-result v1

    .line 687
    :goto_4
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setFocusable(Landroid/view/View;Z)V

    .line 688
    .line 689
    .line 690
    goto/16 :goto_1d

    .line 691
    .line 692
    :pswitch_6
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 693
    .line 694
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 695
    .line 696
    if-nez p3, :cond_2e

    .line 697
    .line 698
    goto :goto_5

    .line 699
    :cond_2e
    check-cast p3, Ljava/lang/Double;

    .line 700
    .line 701
    invoke-virtual {p3}, Ljava/lang/Double;->doubleValue()D

    .line 702
    .line 703
    .line 704
    move-result-wide v4

    .line 705
    :goto_5
    invoke-interface {p2, p1, v4, v5}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setBorderRadius(Landroid/view/View;D)V

    .line 706
    .line 707
    .line 708
    goto/16 :goto_1d

    .line 709
    .line 710
    :pswitch_7
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 711
    .line 712
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 713
    .line 714
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 715
    .line 716
    .line 717
    move-result-object v0

    .line 718
    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    .line 719
    .line 720
    .line 721
    move-result-object p3

    .line 722
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setTintColor(Landroid/view/View;Ljava/lang/Integer;)V

    .line 723
    .line 724
    .line 725
    goto/16 :goto_1d

    .line 726
    .line 727
    :pswitch_8
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 728
    .line 729
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 730
    .line 731
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 732
    .line 733
    .line 734
    move-result-object v0

    .line 735
    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    .line 736
    .line 737
    .line 738
    move-result-object p3

    .line 739
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setBorderEndColor(Landroid/view/View;Ljava/lang/Integer;)V

    .line 740
    .line 741
    .line 742
    goto/16 :goto_1d

    .line 743
    .line 744
    :pswitch_9
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 745
    .line 746
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 747
    .line 748
    check-cast p3, Lcom/facebook/react/bridge/ReadableMap;

    .line 749
    .line 750
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setHitSlop(Landroid/view/View;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 751
    .line 752
    .line 753
    goto/16 :goto_1d

    .line 754
    .line 755
    :pswitch_a
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 756
    .line 757
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 758
    .line 759
    if-nez p3, :cond_2f

    .line 760
    .line 761
    goto :goto_6

    .line 762
    :cond_2f
    move-object v6, p3

    .line 763
    check-cast v6, Ljava/lang/String;

    .line 764
    .line 765
    :goto_6
    invoke-interface {p2, p1, v6}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setBorderStyle(Landroid/view/View;Ljava/lang/String;)V

    .line 766
    .line 767
    .line 768
    goto/16 :goto_1d

    .line 769
    .line 770
    :pswitch_b
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 771
    .line 772
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 773
    .line 774
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 775
    .line 776
    .line 777
    move-result-object v0

    .line 778
    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    .line 779
    .line 780
    .line 781
    move-result-object p3

    .line 782
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setBorderColor(Landroid/view/View;Ljava/lang/Integer;)V

    .line 783
    .line 784
    .line 785
    goto/16 :goto_1d

    .line 786
    .line 787
    :pswitch_c
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 788
    .line 789
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 790
    .line 791
    if-nez p3, :cond_30

    .line 792
    .line 793
    goto :goto_7

    .line 794
    :cond_30
    check-cast p3, Ljava/lang/Double;

    .line 795
    .line 796
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 797
    .line 798
    .line 799
    move-result v1

    .line 800
    :goto_7
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setNextFocusUp(Landroid/view/View;I)V

    .line 801
    .line 802
    .line 803
    goto/16 :goto_1d

    .line 804
    .line 805
    :pswitch_d
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 806
    .line 807
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 808
    .line 809
    if-nez p3, :cond_31

    .line 810
    .line 811
    goto :goto_8

    .line 812
    :cond_31
    check-cast p3, Ljava/lang/Double;

    .line 813
    .line 814
    invoke-virtual {p3}, Ljava/lang/Double;->doubleValue()D

    .line 815
    .line 816
    .line 817
    move-result-wide v4

    .line 818
    :goto_8
    invoke-interface {p2, p1, v4, v5}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setBorderBottomRightRadius(Landroid/view/View;D)V

    .line 819
    .line 820
    .line 821
    goto/16 :goto_1d

    .line 822
    .line 823
    :pswitch_e
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 824
    .line 825
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 826
    .line 827
    if-nez p3, :cond_32

    .line 828
    .line 829
    goto :goto_9

    .line 830
    :cond_32
    check-cast p3, Ljava/lang/Double;

    .line 831
    .line 832
    invoke-virtual {p3}, Ljava/lang/Double;->doubleValue()D

    .line 833
    .line 834
    .line 835
    move-result-wide v4

    .line 836
    :goto_9
    invoke-interface {p2, p1, v4, v5}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setBorderBottomLeftRadius(Landroid/view/View;D)V

    .line 837
    .line 838
    .line 839
    goto/16 :goto_1d

    .line 840
    .line 841
    :pswitch_f
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 842
    .line 843
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 844
    .line 845
    if-nez p3, :cond_33

    .line 846
    .line 847
    goto :goto_a

    .line 848
    :cond_33
    check-cast p3, Ljava/lang/Double;

    .line 849
    .line 850
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 851
    .line 852
    .line 853
    move-result v1

    .line 854
    :goto_a
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setNextFocusForward(Landroid/view/View;I)V

    .line 855
    .line 856
    .line 857
    goto/16 :goto_1d

    .line 858
    .line 859
    :pswitch_10
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 860
    .line 861
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 862
    .line 863
    if-nez p3, :cond_34

    .line 864
    .line 865
    goto :goto_b

    .line 866
    :cond_34
    check-cast p3, Ljava/lang/Double;

    .line 867
    .line 868
    invoke-virtual {p3}, Ljava/lang/Double;->doubleValue()D

    .line 869
    .line 870
    .line 871
    move-result-wide v4

    .line 872
    :goto_b
    invoke-interface {p2, p1, v4, v5}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setBorderTopRightRadius(Landroid/view/View;D)V

    .line 873
    .line 874
    .line 875
    goto/16 :goto_1d

    .line 876
    .line 877
    :pswitch_11
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 878
    .line 879
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 880
    .line 881
    if-nez p3, :cond_35

    .line 882
    .line 883
    goto :goto_c

    .line 884
    :cond_35
    check-cast p3, Ljava/lang/Double;

    .line 885
    .line 886
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 887
    .line 888
    .line 889
    move-result v3

    .line 890
    :goto_c
    invoke-interface {p2, p1, v3}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setVbWidth(Landroid/view/View;F)V

    .line 891
    .line 892
    .line 893
    goto/16 :goto_1d

    .line 894
    .line 895
    :pswitch_12
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 896
    .line 897
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 898
    .line 899
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 900
    .line 901
    .line 902
    move-result-object v0

    .line 903
    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    .line 904
    .line 905
    .line 906
    move-result-object p3

    .line 907
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setColor(Landroid/view/View;Ljava/lang/Integer;)V

    .line 908
    .line 909
    .line 910
    goto/16 :goto_1d

    .line 911
    .line 912
    :pswitch_13
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 913
    .line 914
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 915
    .line 916
    if-nez p3, :cond_36

    .line 917
    .line 918
    goto :goto_d

    .line 919
    :cond_36
    move-object v6, p3

    .line 920
    check-cast v6, Ljava/lang/String;

    .line 921
    .line 922
    :goto_d
    invoke-interface {p2, p1, v6}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setAlign(Landroid/view/View;Ljava/lang/String;)V

    .line 923
    .line 924
    .line 925
    goto/16 :goto_1d

    .line 926
    .line 927
    :pswitch_14
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 928
    .line 929
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 930
    .line 931
    if-nez p3, :cond_37

    .line 932
    .line 933
    goto :goto_e

    .line 934
    :cond_37
    check-cast p3, Ljava/lang/Double;

    .line 935
    .line 936
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 937
    .line 938
    .line 939
    move-result v3

    .line 940
    :goto_e
    invoke-interface {p2, p1, v3}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setMinY(Landroid/view/View;F)V

    .line 941
    .line 942
    .line 943
    goto/16 :goto_1d

    .line 944
    .line 945
    :pswitch_15
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 946
    .line 947
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 948
    .line 949
    if-nez p3, :cond_38

    .line 950
    .line 951
    goto :goto_f

    .line 952
    :cond_38
    check-cast p3, Ljava/lang/Double;

    .line 953
    .line 954
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 955
    .line 956
    .line 957
    move-result v3

    .line 958
    :goto_f
    invoke-interface {p2, p1, v3}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setMinX(Landroid/view/View;F)V

    .line 959
    .line 960
    .line 961
    goto/16 :goto_1d

    .line 962
    .line 963
    :pswitch_16
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 964
    .line 965
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 966
    .line 967
    check-cast p3, Lcom/facebook/react/bridge/ReadableMap;

    .line 968
    .line 969
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setNativeForegroundAndroid(Landroid/view/View;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 970
    .line 971
    .line 972
    goto/16 :goto_1d

    .line 973
    .line 974
    :pswitch_17
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 975
    .line 976
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 977
    .line 978
    if-nez p3, :cond_39

    .line 979
    .line 980
    goto :goto_10

    .line 981
    :cond_39
    check-cast p3, Ljava/lang/Double;

    .line 982
    .line 983
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 984
    .line 985
    .line 986
    move-result v0

    .line 987
    :goto_10
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setBorderBottomEndRadius(Landroid/view/View;F)V

    .line 988
    .line 989
    .line 990
    goto/16 :goto_1d

    .line 991
    .line 992
    :pswitch_18
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 993
    .line 994
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 995
    .line 996
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 997
    .line 998
    .line 999
    move-result-object v0

    .line 1000
    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    .line 1001
    .line 1002
    .line 1003
    move-result-object p3

    .line 1004
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setBorderLeftColor(Landroid/view/View;Ljava/lang/Integer;)V

    .line 1005
    .line 1006
    .line 1007
    goto/16 :goto_1d

    .line 1008
    .line 1009
    :pswitch_19
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1010
    .line 1011
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 1012
    .line 1013
    if-nez p3, :cond_3a

    .line 1014
    .line 1015
    goto :goto_11

    .line 1016
    :cond_3a
    check-cast p3, Ljava/lang/Boolean;

    .line 1017
    .line 1018
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1019
    .line 1020
    .line 1021
    move-result v1

    .line 1022
    :goto_11
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setRemoveClippedSubviews(Landroid/view/View;Z)V

    .line 1023
    .line 1024
    .line 1025
    goto/16 :goto_1d

    .line 1026
    .line 1027
    :pswitch_1a
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1028
    .line 1029
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 1030
    .line 1031
    if-nez p3, :cond_3b

    .line 1032
    .line 1033
    goto :goto_12

    .line 1034
    :cond_3b
    move-object v6, p3

    .line 1035
    check-cast v6, Ljava/lang/String;

    .line 1036
    .line 1037
    :goto_12
    invoke-interface {p2, p1, v6}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setPointerEvents(Landroid/view/View;Ljava/lang/String;)V

    .line 1038
    .line 1039
    .line 1040
    goto/16 :goto_1d

    .line 1041
    .line 1042
    :pswitch_1b
    instance-of p2, p3, Ljava/lang/String;

    .line 1043
    .line 1044
    if-eqz p2, :cond_3c

    .line 1045
    .line 1046
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1047
    .line 1048
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 1049
    .line 1050
    check-cast p3, Ljava/lang/String;

    .line 1051
    .line 1052
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setBbWidth(Landroid/view/View;Ljava/lang/String;)V

    .line 1053
    .line 1054
    .line 1055
    goto/16 :goto_1d

    .line 1056
    .line 1057
    :cond_3c
    instance-of p2, p3, Ljava/lang/Double;

    .line 1058
    .line 1059
    if-eqz p2, :cond_3d

    .line 1060
    .line 1061
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1062
    .line 1063
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 1064
    .line 1065
    check-cast p3, Ljava/lang/Double;

    .line 1066
    .line 1067
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setBbWidth(Landroid/view/View;Ljava/lang/Double;)V

    .line 1068
    .line 1069
    .line 1070
    goto/16 :goto_1d

    .line 1071
    .line 1072
    :cond_3d
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1073
    .line 1074
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 1075
    .line 1076
    invoke-interface {p2, p1, v6}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setBbWidth(Landroid/view/View;Ljava/lang/Double;)V

    .line 1077
    .line 1078
    .line 1079
    goto/16 :goto_1d

    .line 1080
    .line 1081
    :pswitch_1c
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1082
    .line 1083
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 1084
    .line 1085
    if-nez p3, :cond_3e

    .line 1086
    .line 1087
    goto :goto_13

    .line 1088
    :cond_3e
    check-cast p3, Ljava/lang/Double;

    .line 1089
    .line 1090
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 1091
    .line 1092
    .line 1093
    move-result v0

    .line 1094
    :goto_13
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setBorderTopEndRadius(Landroid/view/View;F)V

    .line 1095
    .line 1096
    .line 1097
    goto/16 :goto_1d

    .line 1098
    .line 1099
    :pswitch_1d
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1100
    .line 1101
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 1102
    .line 1103
    if-nez p3, :cond_3f

    .line 1104
    .line 1105
    goto :goto_14

    .line 1106
    :cond_3f
    check-cast p3, Ljava/lang/Double;

    .line 1107
    .line 1108
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 1109
    .line 1110
    .line 1111
    move-result v1

    .line 1112
    :goto_14
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setNextFocusLeft(Landroid/view/View;I)V

    .line 1113
    .line 1114
    .line 1115
    goto/16 :goto_1d

    .line 1116
    .line 1117
    :pswitch_1e
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1118
    .line 1119
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 1120
    .line 1121
    if-nez p3, :cond_40

    .line 1122
    .line 1123
    goto :goto_15

    .line 1124
    :cond_40
    check-cast p3, Ljava/lang/Double;

    .line 1125
    .line 1126
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 1127
    .line 1128
    .line 1129
    move-result v1

    .line 1130
    :goto_15
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setNextFocusDown(Landroid/view/View;I)V

    .line 1131
    .line 1132
    .line 1133
    goto/16 :goto_1d

    .line 1134
    .line 1135
    :pswitch_1f
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1136
    .line 1137
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 1138
    .line 1139
    if-nez p3, :cond_41

    .line 1140
    .line 1141
    goto :goto_16

    .line 1142
    :cond_41
    check-cast p3, Ljava/lang/Boolean;

    .line 1143
    .line 1144
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1145
    .line 1146
    .line 1147
    move-result v1

    .line 1148
    :goto_16
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setHasTVPreferredFocus(Landroid/view/View;Z)V

    .line 1149
    .line 1150
    .line 1151
    goto/16 :goto_1d

    .line 1152
    .line 1153
    :pswitch_20
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1154
    .line 1155
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 1156
    .line 1157
    if-nez p3, :cond_42

    .line 1158
    .line 1159
    goto :goto_17

    .line 1160
    :cond_42
    check-cast p3, Ljava/lang/Double;

    .line 1161
    .line 1162
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 1163
    .line 1164
    .line 1165
    move-result v0

    .line 1166
    :goto_17
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setBorderBottomStartRadius(Landroid/view/View;F)V

    .line 1167
    .line 1168
    .line 1169
    goto/16 :goto_1d

    .line 1170
    .line 1171
    :pswitch_21
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1172
    .line 1173
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 1174
    .line 1175
    if-nez p3, :cond_43

    .line 1176
    .line 1177
    goto :goto_18

    .line 1178
    :cond_43
    check-cast p3, Ljava/lang/Double;

    .line 1179
    .line 1180
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 1181
    .line 1182
    .line 1183
    move-result v0

    .line 1184
    :goto_18
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setBorderTopStartRadius(Landroid/view/View;F)V

    .line 1185
    .line 1186
    .line 1187
    goto/16 :goto_1d

    .line 1188
    .line 1189
    :pswitch_22
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1190
    .line 1191
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 1192
    .line 1193
    if-nez p3, :cond_44

    .line 1194
    .line 1195
    goto :goto_19

    .line 1196
    :cond_44
    check-cast p3, Ljava/lang/Boolean;

    .line 1197
    .line 1198
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1199
    .line 1200
    .line 1201
    move-result v1

    .line 1202
    :goto_19
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setAccessible(Landroid/view/View;Z)V

    .line 1203
    .line 1204
    .line 1205
    goto/16 :goto_1d

    .line 1206
    .line 1207
    :pswitch_23
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1208
    .line 1209
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 1210
    .line 1211
    if-nez p3, :cond_45

    .line 1212
    .line 1213
    goto :goto_1a

    .line 1214
    :cond_45
    check-cast p3, Ljava/lang/Double;

    .line 1215
    .line 1216
    invoke-virtual {p3}, Ljava/lang/Double;->doubleValue()D

    .line 1217
    .line 1218
    .line 1219
    move-result-wide v4

    .line 1220
    :goto_1a
    invoke-interface {p2, p1, v4, v5}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setBorderTopLeftRadius(Landroid/view/View;D)V

    .line 1221
    .line 1222
    .line 1223
    goto/16 :goto_1d

    .line 1224
    .line 1225
    :pswitch_24
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1226
    .line 1227
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 1228
    .line 1229
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1230
    .line 1231
    .line 1232
    move-result-object v0

    .line 1233
    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    .line 1234
    .line 1235
    .line 1236
    move-result-object p3

    .line 1237
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setBorderBottomColor(Landroid/view/View;Ljava/lang/Integer;)V

    .line 1238
    .line 1239
    .line 1240
    goto :goto_1d

    .line 1241
    :pswitch_25
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1242
    .line 1243
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 1244
    .line 1245
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1246
    .line 1247
    .line 1248
    move-result-object v0

    .line 1249
    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    .line 1250
    .line 1251
    .line 1252
    move-result-object p3

    .line 1253
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setBorderTopColor(Landroid/view/View;Ljava/lang/Integer;)V

    .line 1254
    .line 1255
    .line 1256
    goto :goto_1d

    .line 1257
    :pswitch_26
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1258
    .line 1259
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 1260
    .line 1261
    if-nez p3, :cond_46

    .line 1262
    .line 1263
    goto :goto_1b

    .line 1264
    :cond_46
    check-cast p3, Ljava/lang/Double;

    .line 1265
    .line 1266
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 1267
    .line 1268
    .line 1269
    move-result v3

    .line 1270
    :goto_1b
    invoke-interface {p2, p1, v3}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setVbHeight(Landroid/view/View;F)V

    .line 1271
    .line 1272
    .line 1273
    goto :goto_1d

    .line 1274
    :pswitch_27
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1275
    .line 1276
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 1277
    .line 1278
    if-nez p3, :cond_47

    .line 1279
    .line 1280
    goto :goto_1c

    .line 1281
    :cond_47
    move-object v6, p3

    .line 1282
    check-cast v6, Ljava/lang/String;

    .line 1283
    .line 1284
    :goto_1c
    invoke-interface {p2, p1, v6}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setBackfaceVisibility(Landroid/view/View;Ljava/lang/String;)V

    .line 1285
    .line 1286
    .line 1287
    goto :goto_1d

    .line 1288
    :pswitch_28
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1289
    .line 1290
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 1291
    .line 1292
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1293
    .line 1294
    .line 1295
    move-result-object v0

    .line 1296
    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    .line 1297
    .line 1298
    .line 1299
    move-result-object p3

    .line 1300
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setBorderRightColor(Landroid/view/View;Ljava/lang/Integer;)V

    .line 1301
    .line 1302
    .line 1303
    goto :goto_1d

    .line 1304
    :pswitch_29
    instance-of p2, p3, Ljava/lang/String;

    .line 1305
    .line 1306
    if-eqz p2, :cond_48

    .line 1307
    .line 1308
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1309
    .line 1310
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 1311
    .line 1312
    check-cast p3, Ljava/lang/String;

    .line 1313
    .line 1314
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setBbHeight(Landroid/view/View;Ljava/lang/String;)V

    .line 1315
    .line 1316
    .line 1317
    goto :goto_1d

    .line 1318
    :cond_48
    instance-of p2, p3, Ljava/lang/Double;

    .line 1319
    .line 1320
    if-eqz p2, :cond_49

    .line 1321
    .line 1322
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1323
    .line 1324
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 1325
    .line 1326
    check-cast p3, Ljava/lang/Double;

    .line 1327
    .line 1328
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setBbHeight(Landroid/view/View;Ljava/lang/Double;)V

    .line 1329
    .line 1330
    .line 1331
    goto :goto_1d

    .line 1332
    :cond_49
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1333
    .line 1334
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 1335
    .line 1336
    invoke-interface {p2, p1, v6}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setBbHeight(Landroid/view/View;Ljava/lang/Double;)V

    .line 1337
    .line 1338
    .line 1339
    :goto_1d
    return-void

    .line 1340
    nop

    .line 1341
    :sswitch_data_0
    .sparse-switch
        -0x7b0ca679 -> :sswitch_29
        -0x7696880d -> :sswitch_28
        -0x6532960a -> :sswitch_27
        -0x5d75250d -> :sswitch_26
        -0x57ab08a6 -> :sswitch_25
        -0x4e0397d4 -> :sswitch_24
        -0x4932ce1e -> :sswitch_23
        -0x4408644a -> :sswitch_22
        -0x42e281b5 -> :sswitch_21
        -0x33b27663 -> :sswitch_20
        -0x2881956d -> :sswitch_1f
        -0x25a40819 -> :sswitch_1e
        -0x25a08cb4 -> :sswitch_1d
        -0x1cd17a3c -> :sswitch_1c
        -0x13a7269a -> :sswitch_1b
        -0x117e564a -> :sswitch_1a
        -0xf06d417 -> :sswitch_19
        -0xe70d730 -> :sswitch_18
        -0x8d2c26a -> :sswitch_17
        -0x689bbab -> :sswitch_16
        0x332446 -> :sswitch_15
        0x332447 -> :sswitch_14
        0x5899705 -> :sswitch_13
        0x5a72f63 -> :sswitch_12
        0xe557a7a -> :sswitch_11
        0x13dfc885 -> :sswitch_10
        0x1e013d60 -> :sswitch_f
        0x22a57450 -> :sswitch_e
        0x230fd3d7 -> :sswitch_d
        0x2762ef20 -> :sswitch_c
        0x2b158697 -> :sswitch_b
        0x2bf974e5 -> :sswitch_a
        0x373ef02d -> :sswitch_9
        0x48c2f394 -> :sswitch_8
        0x4f219128 -> :sswitch_7
        0x506afbde -> :sswitch_6
        0x6118be32 -> :sswitch_5
        0x636835e4 -> :sswitch_4
        0x682c2a0a -> :sswitch_3
        0x71baeb28 -> :sswitch_2
        0x71e55777 -> :sswitch_1
        0x7e5af16d -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
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
