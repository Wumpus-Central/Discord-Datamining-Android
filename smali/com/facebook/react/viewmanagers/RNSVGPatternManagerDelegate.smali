.class public Lcom/facebook/react/viewmanagers/RNSVGPatternManagerDelegate;
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
        "Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface<",
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
    .locals 6
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
    const/4 v1, 0x1

    .line 9
    const/4 v2, 0x0

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
    const-string v0, "strokeWidth"

    .line 17
    .line 18
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    goto/16 :goto_0

    .line 25
    .line 26
    :cond_0
    const/16 v3, 0x28

    .line 27
    .line 28
    goto/16 :goto_0

    .line 29
    .line 30
    :sswitch_1
    const-string v0, "meetOrSlice"

    .line 31
    .line 32
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-nez v0, :cond_1

    .line 37
    .line 38
    goto/16 :goto_0

    .line 39
    .line 40
    :cond_1
    const/16 v3, 0x27

    .line 41
    .line 42
    goto/16 :goto_0

    .line 43
    .line 44
    :sswitch_2
    const-string v0, "responsible"

    .line 45
    .line 46
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-nez v0, :cond_2

    .line 51
    .line 52
    goto/16 :goto_0

    .line 53
    .line 54
    :cond_2
    const/16 v3, 0x26

    .line 55
    .line 56
    goto/16 :goto_0

    .line 57
    .line 58
    :sswitch_3
    const-string v0, "strokeLinejoin"

    .line 59
    .line 60
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-nez v0, :cond_3

    .line 65
    .line 66
    goto/16 :goto_0

    .line 67
    .line 68
    :cond_3
    const/16 v3, 0x25

    .line 69
    .line 70
    goto/16 :goto_0

    .line 71
    .line 72
    :sswitch_4
    const-string v0, "display"

    .line 73
    .line 74
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-nez v0, :cond_4

    .line 79
    .line 80
    goto/16 :goto_0

    .line 81
    .line 82
    :cond_4
    const/16 v3, 0x24

    .line 83
    .line 84
    goto/16 :goto_0

    .line 85
    .line 86
    :sswitch_5
    const-string v0, "strokeLinecap"

    .line 87
    .line 88
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-nez v0, :cond_5

    .line 93
    .line 94
    goto/16 :goto_0

    .line 95
    .line 96
    :cond_5
    const/16 v3, 0x23

    .line 97
    .line 98
    goto/16 :goto_0

    .line 99
    .line 100
    :sswitch_6
    const-string v0, "clipRule"

    .line 101
    .line 102
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    if-nez v0, :cond_6

    .line 107
    .line 108
    goto/16 :goto_0

    .line 109
    .line 110
    :cond_6
    const/16 v3, 0x22

    .line 111
    .line 112
    goto/16 :goto_0

    .line 113
    .line 114
    :sswitch_7
    const-string v0, "clipPath"

    .line 115
    .line 116
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    if-nez v0, :cond_7

    .line 121
    .line 122
    goto/16 :goto_0

    .line 123
    .line 124
    :cond_7
    const/16 v3, 0x21

    .line 125
    .line 126
    goto/16 :goto_0

    .line 127
    .line 128
    :sswitch_8
    const-string v0, "patternTransform"

    .line 129
    .line 130
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    if-nez v0, :cond_8

    .line 135
    .line 136
    goto/16 :goto_0

    .line 137
    .line 138
    :cond_8
    const/16 v3, 0x20

    .line 139
    .line 140
    goto/16 :goto_0

    .line 141
    .line 142
    :sswitch_9
    const-string v0, "strokeDasharray"

    .line 143
    .line 144
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    if-nez v0, :cond_9

    .line 149
    .line 150
    goto/16 :goto_0

    .line 151
    .line 152
    :cond_9
    const/16 v3, 0x1f

    .line 153
    .line 154
    goto/16 :goto_0

    .line 155
    .line 156
    :sswitch_a
    const-string v0, "fontSize"

    .line 157
    .line 158
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result v0

    .line 162
    if-nez v0, :cond_a

    .line 163
    .line 164
    goto/16 :goto_0

    .line 165
    .line 166
    :cond_a
    const/16 v3, 0x1e

    .line 167
    .line 168
    goto/16 :goto_0

    .line 169
    .line 170
    :sswitch_b
    const-string v0, "vbWidth"

    .line 171
    .line 172
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v0

    .line 176
    if-nez v0, :cond_b

    .line 177
    .line 178
    goto/16 :goto_0

    .line 179
    .line 180
    :cond_b
    const/16 v3, 0x1d

    .line 181
    .line 182
    goto/16 :goto_0

    .line 183
    .line 184
    :sswitch_c
    const-string v0, "markerStart"

    .line 185
    .line 186
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move-result v0

    .line 190
    if-nez v0, :cond_c

    .line 191
    .line 192
    goto/16 :goto_0

    .line 193
    .line 194
    :cond_c
    const/16 v3, 0x1c

    .line 195
    .line 196
    goto/16 :goto_0

    .line 197
    .line 198
    :sswitch_d
    const-string v0, "width"

    .line 199
    .line 200
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    move-result v0

    .line 204
    if-nez v0, :cond_d

    .line 205
    .line 206
    goto/16 :goto_0

    .line 207
    .line 208
    :cond_d
    const/16 v3, 0x1b

    .line 209
    .line 210
    goto/16 :goto_0

    .line 211
    .line 212
    :sswitch_e
    const-string v0, "vectorEffect"

    .line 213
    .line 214
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    move-result v0

    .line 218
    if-nez v0, :cond_e

    .line 219
    .line 220
    goto/16 :goto_0

    .line 221
    .line 222
    :cond_e
    const/16 v3, 0x1a

    .line 223
    .line 224
    goto/16 :goto_0

    .line 225
    .line 226
    :sswitch_f
    const-string v0, "align"

    .line 227
    .line 228
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    move-result v0

    .line 232
    if-nez v0, :cond_f

    .line 233
    .line 234
    goto/16 :goto_0

    .line 235
    .line 236
    :cond_f
    const/16 v3, 0x19

    .line 237
    .line 238
    goto/16 :goto_0

    .line 239
    .line 240
    :sswitch_10
    const-string v0, "strokeMiterlimit"

    .line 241
    .line 242
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    move-result v0

    .line 246
    if-nez v0, :cond_10

    .line 247
    .line 248
    goto/16 :goto_0

    .line 249
    .line 250
    :cond_10
    const/16 v3, 0x18

    .line 251
    .line 252
    goto/16 :goto_0

    .line 253
    .line 254
    :sswitch_11
    const-string v0, "name"

    .line 255
    .line 256
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 257
    .line 258
    .line 259
    move-result v0

    .line 260
    if-nez v0, :cond_11

    .line 261
    .line 262
    goto/16 :goto_0

    .line 263
    .line 264
    :cond_11
    const/16 v3, 0x17

    .line 265
    .line 266
    goto/16 :goto_0

    .line 267
    .line 268
    :sswitch_12
    const-string v0, "minY"

    .line 269
    .line 270
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 271
    .line 272
    .line 273
    move-result v0

    .line 274
    if-nez v0, :cond_12

    .line 275
    .line 276
    goto/16 :goto_0

    .line 277
    .line 278
    :cond_12
    const/16 v3, 0x16

    .line 279
    .line 280
    goto/16 :goto_0

    .line 281
    .line 282
    :sswitch_13
    const-string v0, "minX"

    .line 283
    .line 284
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 285
    .line 286
    .line 287
    move-result v0

    .line 288
    if-nez v0, :cond_13

    .line 289
    .line 290
    goto/16 :goto_0

    .line 291
    .line 292
    :cond_13
    const/16 v3, 0x15

    .line 293
    .line 294
    goto/16 :goto_0

    .line 295
    .line 296
    :sswitch_14
    const-string v0, "mask"

    .line 297
    .line 298
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 299
    .line 300
    .line 301
    move-result v0

    .line 302
    if-nez v0, :cond_14

    .line 303
    .line 304
    goto/16 :goto_0

    .line 305
    .line 306
    :cond_14
    const/16 v3, 0x14

    .line 307
    .line 308
    goto/16 :goto_0

    .line 309
    .line 310
    :sswitch_15
    const-string v0, "font"

    .line 311
    .line 312
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 313
    .line 314
    .line 315
    move-result v0

    .line 316
    if-nez v0, :cond_15

    .line 317
    .line 318
    goto/16 :goto_0

    .line 319
    .line 320
    :cond_15
    const/16 v3, 0x13

    .line 321
    .line 322
    goto/16 :goto_0

    .line 323
    .line 324
    :sswitch_16
    const-string v0, "fill"

    .line 325
    .line 326
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 327
    .line 328
    .line 329
    move-result v0

    .line 330
    if-nez v0, :cond_16

    .line 331
    .line 332
    goto/16 :goto_0

    .line 333
    .line 334
    :cond_16
    const/16 v3, 0x12

    .line 335
    .line 336
    goto/16 :goto_0

    .line 337
    .line 338
    :sswitch_17
    const-string v0, "y"

    .line 339
    .line 340
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 341
    .line 342
    .line 343
    move-result v0

    .line 344
    if-nez v0, :cond_17

    .line 345
    .line 346
    goto/16 :goto_0

    .line 347
    .line 348
    :cond_17
    const/16 v3, 0x11

    .line 349
    .line 350
    goto/16 :goto_0

    .line 351
    .line 352
    :sswitch_18
    const-string v0, "x"

    .line 353
    .line 354
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 355
    .line 356
    .line 357
    move-result v0

    .line 358
    if-nez v0, :cond_18

    .line 359
    .line 360
    goto/16 :goto_0

    .line 361
    .line 362
    :cond_18
    const/16 v3, 0x10

    .line 363
    .line 364
    goto/16 :goto_0

    .line 365
    .line 366
    :sswitch_19
    const-string v0, "strokeDashoffset"

    .line 367
    .line 368
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 369
    .line 370
    .line 371
    move-result v0

    .line 372
    if-nez v0, :cond_19

    .line 373
    .line 374
    goto/16 :goto_0

    .line 375
    .line 376
    :cond_19
    const/16 v3, 0xf

    .line 377
    .line 378
    goto/16 :goto_0

    .line 379
    .line 380
    :sswitch_1a
    const-string v0, "fillOpacity"

    .line 381
    .line 382
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 383
    .line 384
    .line 385
    move-result v0

    .line 386
    if-nez v0, :cond_1a

    .line 387
    .line 388
    goto/16 :goto_0

    .line 389
    .line 390
    :cond_1a
    const/16 v3, 0xe

    .line 391
    .line 392
    goto/16 :goto_0

    .line 393
    .line 394
    :sswitch_1b
    const-string v0, "patternContentUnits"

    .line 395
    .line 396
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 397
    .line 398
    .line 399
    move-result v0

    .line 400
    if-nez v0, :cond_1b

    .line 401
    .line 402
    goto/16 :goto_0

    .line 403
    .line 404
    :cond_1b
    const/16 v3, 0xd

    .line 405
    .line 406
    goto/16 :goto_0

    .line 407
    .line 408
    :sswitch_1c
    const-string v0, "patternUnits"

    .line 409
    .line 410
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 411
    .line 412
    .line 413
    move-result v0

    .line 414
    if-nez v0, :cond_1c

    .line 415
    .line 416
    goto/16 :goto_0

    .line 417
    .line 418
    :cond_1c
    const/16 v3, 0xc

    .line 419
    .line 420
    goto/16 :goto_0

    .line 421
    .line 422
    :sswitch_1d
    const-string v0, "pointerEvents"

    .line 423
    .line 424
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 425
    .line 426
    .line 427
    move-result v0

    .line 428
    if-nez v0, :cond_1d

    .line 429
    .line 430
    goto/16 :goto_0

    .line 431
    .line 432
    :cond_1d
    const/16 v3, 0xb

    .line 433
    .line 434
    goto/16 :goto_0

    .line 435
    .line 436
    :sswitch_1e
    const-string v0, "strokeOpacity"

    .line 437
    .line 438
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 439
    .line 440
    .line 441
    move-result v0

    .line 442
    if-nez v0, :cond_1e

    .line 443
    .line 444
    goto/16 :goto_0

    .line 445
    .line 446
    :cond_1e
    const/16 v3, 0xa

    .line 447
    .line 448
    goto/16 :goto_0

    .line 449
    .line 450
    :sswitch_1f
    const-string v0, "fillRule"

    .line 451
    .line 452
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 453
    .line 454
    .line 455
    move-result v0

    .line 456
    if-nez v0, :cond_1f

    .line 457
    .line 458
    goto/16 :goto_0

    .line 459
    .line 460
    :cond_1f
    const/16 v3, 0x9

    .line 461
    .line 462
    goto/16 :goto_0

    .line 463
    .line 464
    :sswitch_20
    const-string v0, "fontWeight"

    .line 465
    .line 466
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 467
    .line 468
    .line 469
    move-result v0

    .line 470
    if-nez v0, :cond_20

    .line 471
    .line 472
    goto/16 :goto_0

    .line 473
    .line 474
    :cond_20
    const/16 v3, 0x8

    .line 475
    .line 476
    goto/16 :goto_0

    .line 477
    .line 478
    :sswitch_21
    const-string v0, "stroke"

    .line 479
    .line 480
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 481
    .line 482
    .line 483
    move-result v0

    .line 484
    if-nez v0, :cond_21

    .line 485
    .line 486
    goto :goto_0

    .line 487
    :cond_21
    const/4 v3, 0x7

    .line 488
    goto :goto_0

    .line 489
    :sswitch_22
    const-string v0, "markerMid"

    .line 490
    .line 491
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 492
    .line 493
    .line 494
    move-result v0

    .line 495
    if-nez v0, :cond_22

    .line 496
    .line 497
    goto :goto_0

    .line 498
    :cond_22
    const/4 v3, 0x6

    .line 499
    goto :goto_0

    .line 500
    :sswitch_23
    const-string v0, "markerEnd"

    .line 501
    .line 502
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 503
    .line 504
    .line 505
    move-result v0

    .line 506
    if-nez v0, :cond_23

    .line 507
    .line 508
    goto :goto_0

    .line 509
    :cond_23
    const/4 v3, 0x5

    .line 510
    goto :goto_0

    .line 511
    :sswitch_24
    const-string v0, "propList"

    .line 512
    .line 513
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 514
    .line 515
    .line 516
    move-result v0

    .line 517
    if-nez v0, :cond_24

    .line 518
    .line 519
    goto :goto_0

    .line 520
    :cond_24
    const/4 v3, 0x4

    .line 521
    goto :goto_0

    .line 522
    :sswitch_25
    const-string v0, "matrix"

    .line 523
    .line 524
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 525
    .line 526
    .line 527
    move-result v0

    .line 528
    if-nez v0, :cond_25

    .line 529
    .line 530
    goto :goto_0

    .line 531
    :cond_25
    const/4 v3, 0x3

    .line 532
    goto :goto_0

    .line 533
    :sswitch_26
    const-string v0, "height"

    .line 534
    .line 535
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 536
    .line 537
    .line 538
    move-result v0

    .line 539
    if-nez v0, :cond_26

    .line 540
    .line 541
    goto :goto_0

    .line 542
    :cond_26
    const/4 v3, 0x2

    .line 543
    goto :goto_0

    .line 544
    :sswitch_27
    const-string v0, "opacity"

    .line 545
    .line 546
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 547
    .line 548
    .line 549
    move-result v0

    .line 550
    if-nez v0, :cond_27

    .line 551
    .line 552
    goto :goto_0

    .line 553
    :cond_27
    move v3, v1

    .line 554
    goto :goto_0

    .line 555
    :sswitch_28
    const-string v0, "vbHeight"

    .line 556
    .line 557
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 558
    .line 559
    .line 560
    move-result v0

    .line 561
    if-nez v0, :cond_28

    .line 562
    .line 563
    goto :goto_0

    .line 564
    :cond_28
    move v3, v2

    .line 565
    :goto_0
    const/high16 v0, 0x3f800000    # 1.0f

    .line 566
    .line 567
    const/4 v4, 0x0

    .line 568
    const/4 v5, 0x0

    .line 569
    packed-switch v3, :pswitch_data_0

    .line 570
    .line 571
    .line 572
    invoke-super {p0, p1, p2, p3}, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->setProperty(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V

    .line 573
    .line 574
    .line 575
    goto/16 :goto_1c

    .line 576
    .line 577
    :pswitch_0
    instance-of p2, p3, Ljava/lang/String;

    .line 578
    .line 579
    if-eqz p2, :cond_29

    .line 580
    .line 581
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 582
    .line 583
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 584
    .line 585
    check-cast p3, Ljava/lang/String;

    .line 586
    .line 587
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setStrokeWidth(Landroid/view/View;Ljava/lang/String;)V

    .line 588
    .line 589
    .line 590
    goto/16 :goto_1c

    .line 591
    .line 592
    :cond_29
    instance-of p2, p3, Ljava/lang/Double;

    .line 593
    .line 594
    if-eqz p2, :cond_2a

    .line 595
    .line 596
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 597
    .line 598
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 599
    .line 600
    check-cast p3, Ljava/lang/Double;

    .line 601
    .line 602
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setStrokeWidth(Landroid/view/View;Ljava/lang/Double;)V

    .line 603
    .line 604
    .line 605
    goto/16 :goto_1c

    .line 606
    .line 607
    :cond_2a
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 608
    .line 609
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 610
    .line 611
    const-string p3, "1"

    .line 612
    .line 613
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setStrokeWidth(Landroid/view/View;Ljava/lang/String;)V

    .line 614
    .line 615
    .line 616
    goto/16 :goto_1c

    .line 617
    .line 618
    :pswitch_1
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 619
    .line 620
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 621
    .line 622
    if-nez p3, :cond_2b

    .line 623
    .line 624
    goto :goto_1

    .line 625
    :cond_2b
    check-cast p3, Ljava/lang/Double;

    .line 626
    .line 627
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 628
    .line 629
    .line 630
    move-result v2

    .line 631
    :goto_1
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setMeetOrSlice(Landroid/view/View;I)V

    .line 632
    .line 633
    .line 634
    goto/16 :goto_1c

    .line 635
    .line 636
    :pswitch_2
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 637
    .line 638
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 639
    .line 640
    if-nez p3, :cond_2c

    .line 641
    .line 642
    goto :goto_2

    .line 643
    :cond_2c
    check-cast p3, Ljava/lang/Boolean;

    .line 644
    .line 645
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 646
    .line 647
    .line 648
    move-result v2

    .line 649
    :goto_2
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setResponsible(Landroid/view/View;Z)V

    .line 650
    .line 651
    .line 652
    goto/16 :goto_1c

    .line 653
    .line 654
    :pswitch_3
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 655
    .line 656
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 657
    .line 658
    if-nez p3, :cond_2d

    .line 659
    .line 660
    goto :goto_3

    .line 661
    :cond_2d
    check-cast p3, Ljava/lang/Double;

    .line 662
    .line 663
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 664
    .line 665
    .line 666
    move-result v2

    .line 667
    :goto_3
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setStrokeLinejoin(Landroid/view/View;I)V

    .line 668
    .line 669
    .line 670
    goto/16 :goto_1c

    .line 671
    .line 672
    :pswitch_4
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 673
    .line 674
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 675
    .line 676
    if-nez p3, :cond_2e

    .line 677
    .line 678
    goto :goto_4

    .line 679
    :cond_2e
    move-object v5, p3

    .line 680
    check-cast v5, Ljava/lang/String;

    .line 681
    .line 682
    :goto_4
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setDisplay(Landroid/view/View;Ljava/lang/String;)V

    .line 683
    .line 684
    .line 685
    goto/16 :goto_1c

    .line 686
    .line 687
    :pswitch_5
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 688
    .line 689
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 690
    .line 691
    if-nez p3, :cond_2f

    .line 692
    .line 693
    goto :goto_5

    .line 694
    :cond_2f
    check-cast p3, Ljava/lang/Double;

    .line 695
    .line 696
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 697
    .line 698
    .line 699
    move-result v2

    .line 700
    :goto_5
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setStrokeLinecap(Landroid/view/View;I)V

    .line 701
    .line 702
    .line 703
    goto/16 :goto_1c

    .line 704
    .line 705
    :pswitch_6
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 706
    .line 707
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 708
    .line 709
    if-nez p3, :cond_30

    .line 710
    .line 711
    goto :goto_6

    .line 712
    :cond_30
    check-cast p3, Ljava/lang/Double;

    .line 713
    .line 714
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 715
    .line 716
    .line 717
    move-result v2

    .line 718
    :goto_6
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setClipRule(Landroid/view/View;I)V

    .line 719
    .line 720
    .line 721
    goto/16 :goto_1c

    .line 722
    .line 723
    :pswitch_7
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 724
    .line 725
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 726
    .line 727
    if-nez p3, :cond_31

    .line 728
    .line 729
    goto :goto_7

    .line 730
    :cond_31
    move-object v5, p3

    .line 731
    check-cast v5, Ljava/lang/String;

    .line 732
    .line 733
    :goto_7
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setClipPath(Landroid/view/View;Ljava/lang/String;)V

    .line 734
    .line 735
    .line 736
    goto/16 :goto_1c

    .line 737
    .line 738
    :pswitch_8
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 739
    .line 740
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 741
    .line 742
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 743
    .line 744
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setPatternTransform(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 745
    .line 746
    .line 747
    goto/16 :goto_1c

    .line 748
    .line 749
    :pswitch_9
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 750
    .line 751
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 752
    .line 753
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 754
    .line 755
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setStrokeDasharray(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 756
    .line 757
    .line 758
    goto/16 :goto_1c

    .line 759
    .line 760
    :pswitch_a
    instance-of p2, p3, Ljava/lang/String;

    .line 761
    .line 762
    if-eqz p2, :cond_32

    .line 763
    .line 764
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 765
    .line 766
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 767
    .line 768
    check-cast p3, Ljava/lang/String;

    .line 769
    .line 770
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setFontSize(Landroid/view/View;Ljava/lang/String;)V

    .line 771
    .line 772
    .line 773
    goto/16 :goto_1c

    .line 774
    .line 775
    :cond_32
    instance-of p2, p3, Ljava/lang/Double;

    .line 776
    .line 777
    if-eqz p2, :cond_33

    .line 778
    .line 779
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 780
    .line 781
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 782
    .line 783
    check-cast p3, Ljava/lang/Double;

    .line 784
    .line 785
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setFontSize(Landroid/view/View;Ljava/lang/Double;)V

    .line 786
    .line 787
    .line 788
    goto/16 :goto_1c

    .line 789
    .line 790
    :cond_33
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 791
    .line 792
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 793
    .line 794
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setFontSize(Landroid/view/View;Ljava/lang/Double;)V

    .line 795
    .line 796
    .line 797
    goto/16 :goto_1c

    .line 798
    .line 799
    :pswitch_b
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 800
    .line 801
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 802
    .line 803
    if-nez p3, :cond_34

    .line 804
    .line 805
    goto :goto_8

    .line 806
    :cond_34
    check-cast p3, Ljava/lang/Double;

    .line 807
    .line 808
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 809
    .line 810
    .line 811
    move-result v4

    .line 812
    :goto_8
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setVbWidth(Landroid/view/View;F)V

    .line 813
    .line 814
    .line 815
    goto/16 :goto_1c

    .line 816
    .line 817
    :pswitch_c
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 818
    .line 819
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 820
    .line 821
    if-nez p3, :cond_35

    .line 822
    .line 823
    goto :goto_9

    .line 824
    :cond_35
    move-object v5, p3

    .line 825
    check-cast v5, Ljava/lang/String;

    .line 826
    .line 827
    :goto_9
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setMarkerStart(Landroid/view/View;Ljava/lang/String;)V

    .line 828
    .line 829
    .line 830
    goto/16 :goto_1c

    .line 831
    .line 832
    :pswitch_d
    instance-of p2, p3, Ljava/lang/String;

    .line 833
    .line 834
    if-eqz p2, :cond_36

    .line 835
    .line 836
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 837
    .line 838
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 839
    .line 840
    check-cast p3, Ljava/lang/String;

    .line 841
    .line 842
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setWidth(Landroid/view/View;Ljava/lang/String;)V

    .line 843
    .line 844
    .line 845
    goto/16 :goto_1c

    .line 846
    .line 847
    :cond_36
    instance-of p2, p3, Ljava/lang/Double;

    .line 848
    .line 849
    if-eqz p2, :cond_37

    .line 850
    .line 851
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 852
    .line 853
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 854
    .line 855
    check-cast p3, Ljava/lang/Double;

    .line 856
    .line 857
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setWidth(Landroid/view/View;Ljava/lang/Double;)V

    .line 858
    .line 859
    .line 860
    goto/16 :goto_1c

    .line 861
    .line 862
    :cond_37
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 863
    .line 864
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 865
    .line 866
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setWidth(Landroid/view/View;Ljava/lang/Double;)V

    .line 867
    .line 868
    .line 869
    goto/16 :goto_1c

    .line 870
    .line 871
    :pswitch_e
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 872
    .line 873
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 874
    .line 875
    if-nez p3, :cond_38

    .line 876
    .line 877
    goto :goto_a

    .line 878
    :cond_38
    check-cast p3, Ljava/lang/Double;

    .line 879
    .line 880
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 881
    .line 882
    .line 883
    move-result v2

    .line 884
    :goto_a
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setVectorEffect(Landroid/view/View;I)V

    .line 885
    .line 886
    .line 887
    goto/16 :goto_1c

    .line 888
    .line 889
    :pswitch_f
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 890
    .line 891
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 892
    .line 893
    if-nez p3, :cond_39

    .line 894
    .line 895
    goto :goto_b

    .line 896
    :cond_39
    move-object v5, p3

    .line 897
    check-cast v5, Ljava/lang/String;

    .line 898
    .line 899
    :goto_b
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setAlign(Landroid/view/View;Ljava/lang/String;)V

    .line 900
    .line 901
    .line 902
    goto/16 :goto_1c

    .line 903
    .line 904
    :pswitch_10
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 905
    .line 906
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 907
    .line 908
    if-nez p3, :cond_3a

    .line 909
    .line 910
    goto :goto_c

    .line 911
    :cond_3a
    check-cast p3, Ljava/lang/Double;

    .line 912
    .line 913
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 914
    .line 915
    .line 916
    move-result v4

    .line 917
    :goto_c
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setStrokeMiterlimit(Landroid/view/View;F)V

    .line 918
    .line 919
    .line 920
    goto/16 :goto_1c

    .line 921
    .line 922
    :pswitch_11
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 923
    .line 924
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 925
    .line 926
    if-nez p3, :cond_3b

    .line 927
    .line 928
    goto :goto_d

    .line 929
    :cond_3b
    move-object v5, p3

    .line 930
    check-cast v5, Ljava/lang/String;

    .line 931
    .line 932
    :goto_d
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setName(Landroid/view/View;Ljava/lang/String;)V

    .line 933
    .line 934
    .line 935
    goto/16 :goto_1c

    .line 936
    .line 937
    :pswitch_12
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 938
    .line 939
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 940
    .line 941
    if-nez p3, :cond_3c

    .line 942
    .line 943
    goto :goto_e

    .line 944
    :cond_3c
    check-cast p3, Ljava/lang/Double;

    .line 945
    .line 946
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 947
    .line 948
    .line 949
    move-result v4

    .line 950
    :goto_e
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setMinY(Landroid/view/View;F)V

    .line 951
    .line 952
    .line 953
    goto/16 :goto_1c

    .line 954
    .line 955
    :pswitch_13
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 956
    .line 957
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 958
    .line 959
    if-nez p3, :cond_3d

    .line 960
    .line 961
    goto :goto_f

    .line 962
    :cond_3d
    check-cast p3, Ljava/lang/Double;

    .line 963
    .line 964
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 965
    .line 966
    .line 967
    move-result v4

    .line 968
    :goto_f
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setMinX(Landroid/view/View;F)V

    .line 969
    .line 970
    .line 971
    goto/16 :goto_1c

    .line 972
    .line 973
    :pswitch_14
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 974
    .line 975
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 976
    .line 977
    if-nez p3, :cond_3e

    .line 978
    .line 979
    goto :goto_10

    .line 980
    :cond_3e
    move-object v5, p3

    .line 981
    check-cast v5, Ljava/lang/String;

    .line 982
    .line 983
    :goto_10
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setMask(Landroid/view/View;Ljava/lang/String;)V

    .line 984
    .line 985
    .line 986
    goto/16 :goto_1c

    .line 987
    .line 988
    :pswitch_15
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 989
    .line 990
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 991
    .line 992
    check-cast p3, Lcom/facebook/react/bridge/ReadableMap;

    .line 993
    .line 994
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setFont(Landroid/view/View;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 995
    .line 996
    .line 997
    goto/16 :goto_1c

    .line 998
    .line 999
    :pswitch_16
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1000
    .line 1001
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 1002
    .line 1003
    check-cast p3, Lcom/facebook/react/bridge/ReadableMap;

    .line 1004
    .line 1005
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setFill(Landroid/view/View;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 1006
    .line 1007
    .line 1008
    goto/16 :goto_1c

    .line 1009
    .line 1010
    :pswitch_17
    instance-of p2, p3, Ljava/lang/String;

    .line 1011
    .line 1012
    if-eqz p2, :cond_3f

    .line 1013
    .line 1014
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1015
    .line 1016
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 1017
    .line 1018
    check-cast p3, Ljava/lang/String;

    .line 1019
    .line 1020
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setY(Landroid/view/View;Ljava/lang/String;)V

    .line 1021
    .line 1022
    .line 1023
    goto/16 :goto_1c

    .line 1024
    .line 1025
    :cond_3f
    instance-of p2, p3, Ljava/lang/Double;

    .line 1026
    .line 1027
    if-eqz p2, :cond_40

    .line 1028
    .line 1029
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1030
    .line 1031
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 1032
    .line 1033
    check-cast p3, Ljava/lang/Double;

    .line 1034
    .line 1035
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setY(Landroid/view/View;Ljava/lang/Double;)V

    .line 1036
    .line 1037
    .line 1038
    goto/16 :goto_1c

    .line 1039
    .line 1040
    :cond_40
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1041
    .line 1042
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 1043
    .line 1044
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setY(Landroid/view/View;Ljava/lang/Double;)V

    .line 1045
    .line 1046
    .line 1047
    goto/16 :goto_1c

    .line 1048
    .line 1049
    :pswitch_18
    instance-of p2, p3, Ljava/lang/String;

    .line 1050
    .line 1051
    if-eqz p2, :cond_41

    .line 1052
    .line 1053
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1054
    .line 1055
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 1056
    .line 1057
    check-cast p3, Ljava/lang/String;

    .line 1058
    .line 1059
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setX(Landroid/view/View;Ljava/lang/String;)V

    .line 1060
    .line 1061
    .line 1062
    goto/16 :goto_1c

    .line 1063
    .line 1064
    :cond_41
    instance-of p2, p3, Ljava/lang/Double;

    .line 1065
    .line 1066
    if-eqz p2, :cond_42

    .line 1067
    .line 1068
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1069
    .line 1070
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 1071
    .line 1072
    check-cast p3, Ljava/lang/Double;

    .line 1073
    .line 1074
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setX(Landroid/view/View;Ljava/lang/Double;)V

    .line 1075
    .line 1076
    .line 1077
    goto/16 :goto_1c

    .line 1078
    .line 1079
    :cond_42
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1080
    .line 1081
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 1082
    .line 1083
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setX(Landroid/view/View;Ljava/lang/Double;)V

    .line 1084
    .line 1085
    .line 1086
    goto/16 :goto_1c

    .line 1087
    .line 1088
    :pswitch_19
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1089
    .line 1090
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 1091
    .line 1092
    if-nez p3, :cond_43

    .line 1093
    .line 1094
    goto :goto_11

    .line 1095
    :cond_43
    check-cast p3, Ljava/lang/Double;

    .line 1096
    .line 1097
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 1098
    .line 1099
    .line 1100
    move-result v4

    .line 1101
    :goto_11
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setStrokeDashoffset(Landroid/view/View;F)V

    .line 1102
    .line 1103
    .line 1104
    goto/16 :goto_1c

    .line 1105
    .line 1106
    :pswitch_1a
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1107
    .line 1108
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 1109
    .line 1110
    if-nez p3, :cond_44

    .line 1111
    .line 1112
    goto :goto_12

    .line 1113
    :cond_44
    check-cast p3, Ljava/lang/Double;

    .line 1114
    .line 1115
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 1116
    .line 1117
    .line 1118
    move-result v0

    .line 1119
    :goto_12
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setFillOpacity(Landroid/view/View;F)V

    .line 1120
    .line 1121
    .line 1122
    goto/16 :goto_1c

    .line 1123
    .line 1124
    :pswitch_1b
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1125
    .line 1126
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 1127
    .line 1128
    if-nez p3, :cond_45

    .line 1129
    .line 1130
    goto :goto_13

    .line 1131
    :cond_45
    check-cast p3, Ljava/lang/Double;

    .line 1132
    .line 1133
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 1134
    .line 1135
    .line 1136
    move-result v2

    .line 1137
    :goto_13
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setPatternContentUnits(Landroid/view/View;I)V

    .line 1138
    .line 1139
    .line 1140
    goto/16 :goto_1c

    .line 1141
    .line 1142
    :pswitch_1c
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1143
    .line 1144
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 1145
    .line 1146
    if-nez p3, :cond_46

    .line 1147
    .line 1148
    goto :goto_14

    .line 1149
    :cond_46
    check-cast p3, Ljava/lang/Double;

    .line 1150
    .line 1151
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 1152
    .line 1153
    .line 1154
    move-result v2

    .line 1155
    :goto_14
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setPatternUnits(Landroid/view/View;I)V

    .line 1156
    .line 1157
    .line 1158
    goto/16 :goto_1c

    .line 1159
    .line 1160
    :pswitch_1d
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1161
    .line 1162
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 1163
    .line 1164
    if-nez p3, :cond_47

    .line 1165
    .line 1166
    goto :goto_15

    .line 1167
    :cond_47
    move-object v5, p3

    .line 1168
    check-cast v5, Ljava/lang/String;

    .line 1169
    .line 1170
    :goto_15
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setPointerEvents(Landroid/view/View;Ljava/lang/String;)V

    .line 1171
    .line 1172
    .line 1173
    goto/16 :goto_1c

    .line 1174
    .line 1175
    :pswitch_1e
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1176
    .line 1177
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 1178
    .line 1179
    if-nez p3, :cond_48

    .line 1180
    .line 1181
    goto :goto_16

    .line 1182
    :cond_48
    check-cast p3, Ljava/lang/Double;

    .line 1183
    .line 1184
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 1185
    .line 1186
    .line 1187
    move-result v0

    .line 1188
    :goto_16
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setStrokeOpacity(Landroid/view/View;F)V

    .line 1189
    .line 1190
    .line 1191
    goto/16 :goto_1c

    .line 1192
    .line 1193
    :pswitch_1f
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1194
    .line 1195
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 1196
    .line 1197
    if-nez p3, :cond_49

    .line 1198
    .line 1199
    goto :goto_17

    .line 1200
    :cond_49
    check-cast p3, Ljava/lang/Double;

    .line 1201
    .line 1202
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 1203
    .line 1204
    .line 1205
    move-result v1

    .line 1206
    :goto_17
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setFillRule(Landroid/view/View;I)V

    .line 1207
    .line 1208
    .line 1209
    goto/16 :goto_1c

    .line 1210
    .line 1211
    :pswitch_20
    instance-of p2, p3, Ljava/lang/String;

    .line 1212
    .line 1213
    if-eqz p2, :cond_4a

    .line 1214
    .line 1215
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1216
    .line 1217
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 1218
    .line 1219
    check-cast p3, Ljava/lang/String;

    .line 1220
    .line 1221
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setFontWeight(Landroid/view/View;Ljava/lang/String;)V

    .line 1222
    .line 1223
    .line 1224
    goto/16 :goto_1c

    .line 1225
    .line 1226
    :cond_4a
    instance-of p2, p3, Ljava/lang/Double;

    .line 1227
    .line 1228
    if-eqz p2, :cond_4b

    .line 1229
    .line 1230
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1231
    .line 1232
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 1233
    .line 1234
    check-cast p3, Ljava/lang/Double;

    .line 1235
    .line 1236
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setFontWeight(Landroid/view/View;Ljava/lang/Double;)V

    .line 1237
    .line 1238
    .line 1239
    goto/16 :goto_1c

    .line 1240
    .line 1241
    :cond_4b
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1242
    .line 1243
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 1244
    .line 1245
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setFontWeight(Landroid/view/View;Ljava/lang/Double;)V

    .line 1246
    .line 1247
    .line 1248
    goto/16 :goto_1c

    .line 1249
    .line 1250
    :pswitch_21
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1251
    .line 1252
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 1253
    .line 1254
    check-cast p3, Lcom/facebook/react/bridge/ReadableMap;

    .line 1255
    .line 1256
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setStroke(Landroid/view/View;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 1257
    .line 1258
    .line 1259
    goto/16 :goto_1c

    .line 1260
    .line 1261
    :pswitch_22
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1262
    .line 1263
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 1264
    .line 1265
    if-nez p3, :cond_4c

    .line 1266
    .line 1267
    goto :goto_18

    .line 1268
    :cond_4c
    move-object v5, p3

    .line 1269
    check-cast v5, Ljava/lang/String;

    .line 1270
    .line 1271
    :goto_18
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setMarkerMid(Landroid/view/View;Ljava/lang/String;)V

    .line 1272
    .line 1273
    .line 1274
    goto/16 :goto_1c

    .line 1275
    .line 1276
    :pswitch_23
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1277
    .line 1278
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 1279
    .line 1280
    if-nez p3, :cond_4d

    .line 1281
    .line 1282
    goto :goto_19

    .line 1283
    :cond_4d
    move-object v5, p3

    .line 1284
    check-cast v5, Ljava/lang/String;

    .line 1285
    .line 1286
    :goto_19
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setMarkerEnd(Landroid/view/View;Ljava/lang/String;)V

    .line 1287
    .line 1288
    .line 1289
    goto :goto_1c

    .line 1290
    :pswitch_24
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1291
    .line 1292
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 1293
    .line 1294
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 1295
    .line 1296
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setPropList(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 1297
    .line 1298
    .line 1299
    goto :goto_1c

    .line 1300
    :pswitch_25
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1301
    .line 1302
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 1303
    .line 1304
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 1305
    .line 1306
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setMatrix(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 1307
    .line 1308
    .line 1309
    goto :goto_1c

    .line 1310
    :pswitch_26
    instance-of p2, p3, Ljava/lang/String;

    .line 1311
    .line 1312
    if-eqz p2, :cond_4e

    .line 1313
    .line 1314
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1315
    .line 1316
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 1317
    .line 1318
    check-cast p3, Ljava/lang/String;

    .line 1319
    .line 1320
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setHeight(Landroid/view/View;Ljava/lang/String;)V

    .line 1321
    .line 1322
    .line 1323
    goto :goto_1c

    .line 1324
    :cond_4e
    instance-of p2, p3, Ljava/lang/Double;

    .line 1325
    .line 1326
    if-eqz p2, :cond_4f

    .line 1327
    .line 1328
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1329
    .line 1330
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 1331
    .line 1332
    check-cast p3, Ljava/lang/Double;

    .line 1333
    .line 1334
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setHeight(Landroid/view/View;Ljava/lang/Double;)V

    .line 1335
    .line 1336
    .line 1337
    goto :goto_1c

    .line 1338
    :cond_4f
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1339
    .line 1340
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 1341
    .line 1342
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setHeight(Landroid/view/View;Ljava/lang/Double;)V

    .line 1343
    .line 1344
    .line 1345
    goto :goto_1c

    .line 1346
    :pswitch_27
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1347
    .line 1348
    if-nez p3, :cond_50

    .line 1349
    .line 1350
    goto :goto_1a

    .line 1351
    :cond_50
    check-cast p3, Ljava/lang/Double;

    .line 1352
    .line 1353
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 1354
    .line 1355
    .line 1356
    move-result v0

    .line 1357
    :goto_1a
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/uimanager/BaseViewManagerInterface;->setOpacity(Landroid/view/View;F)V

    .line 1358
    .line 1359
    .line 1360
    goto :goto_1c

    .line 1361
    :pswitch_28
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1362
    .line 1363
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 1364
    .line 1365
    if-nez p3, :cond_51

    .line 1366
    .line 1367
    goto :goto_1b

    .line 1368
    :cond_51
    check-cast p3, Ljava/lang/Double;

    .line 1369
    .line 1370
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 1371
    .line 1372
    .line 1373
    move-result v4

    .line 1374
    :goto_1b
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setVbHeight(Landroid/view/View;F)V

    .line 1375
    .line 1376
    .line 1377
    :goto_1c
    return-void

    .line 1378
    nop

    .line 1379
    :sswitch_data_0
    .sparse-switch
        -0x5d75250d -> :sswitch_28
        -0x4b8807f5 -> :sswitch_27
        -0x48c76ed9 -> :sswitch_26
        -0x4072683f -> :sswitch_25
        -0x3b3da15f -> :sswitch_24
        -0x37a9a5bf -> :sswitch_23
        -0x37a98852 -> :sswitch_22
        -0x352a89c8 -> :sswitch_21
        -0x2bc67c59 -> :sswitch_20
        -0x2b7578e1 -> :sswitch_1f
        -0x18d3d54d -> :sswitch_1e
        -0x117e564a -> :sswitch_1d
        -0xc62ca41 -> :sswitch_1c
        -0x7ab81da -> :sswitch_1b
        -0x3330ef8 -> :sswitch_1a
        -0x2a83503 -> :sswitch_19
        0x78 -> :sswitch_18
        0x79 -> :sswitch_17
        0x2ff583 -> :sswitch_16
        0x300c4f -> :sswitch_15
        0x3306ec -> :sswitch_14
        0x332446 -> :sswitch_13
        0x332447 -> :sswitch_12
        0x337a8b -> :sswitch_11
        0x4b3162e -> :sswitch_10
        0x5899705 -> :sswitch_f
        0x63a48b4 -> :sswitch_e
        0x6be2dc6 -> :sswitch_d
        0xcf0d448 -> :sswitch_c
        0xe557a7a -> :sswitch_b
        0x15caa0f0 -> :sswitch_a
        0x17f096af -> :sswitch_9
        0x2c7fa1bc -> :sswitch_8
        0x36b25395 -> :sswitch_7
        0x36b3866c -> :sswitch_6
        0x3d3f8e06 -> :sswitch_5
        0x63a518c2 -> :sswitch_4
        0x6ab59576 -> :sswitch_3
        0x6e2146f6 -> :sswitch_2
        0x71baeb28 -> :sswitch_1
        0x72aeea6e -> :sswitch_0
    .end sparse-switch

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
