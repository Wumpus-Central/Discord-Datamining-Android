.class public Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerDelegate;
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
        "Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface<",
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
    const-string v0, "markerHeight"

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
    const/16 v3, 0x27

    .line 27
    .line 28
    goto/16 :goto_0

    .line 29
    .line 30
    :sswitch_1
    const-string v0, "strokeWidth"

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
    const/16 v3, 0x26

    .line 41
    .line 42
    goto/16 :goto_0

    .line 43
    .line 44
    :sswitch_2
    const-string v0, "meetOrSlice"

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
    const/16 v3, 0x25

    .line 55
    .line 56
    goto/16 :goto_0

    .line 57
    .line 58
    :sswitch_3
    const-string v0, "responsible"

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
    const/16 v3, 0x24

    .line 69
    .line 70
    goto/16 :goto_0

    .line 71
    .line 72
    :sswitch_4
    const-string v0, "strokeLinejoin"

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
    const/16 v3, 0x23

    .line 83
    .line 84
    goto/16 :goto_0

    .line 85
    .line 86
    :sswitch_5
    const-string v0, "display"

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
    const/16 v3, 0x22

    .line 97
    .line 98
    goto/16 :goto_0

    .line 99
    .line 100
    :sswitch_6
    const-string v0, "strokeLinecap"

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
    const/16 v3, 0x21

    .line 111
    .line 112
    goto/16 :goto_0

    .line 113
    .line 114
    :sswitch_7
    const-string v0, "clipRule"

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
    const/16 v3, 0x20

    .line 125
    .line 126
    goto/16 :goto_0

    .line 127
    .line 128
    :sswitch_8
    const-string v0, "clipPath"

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
    const/16 v3, 0x1f

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
    const/16 v3, 0x1e

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
    const/16 v3, 0x1d

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
    const/16 v3, 0x1c

    .line 181
    .line 182
    goto/16 :goto_0

    .line 183
    .line 184
    :sswitch_c
    const-string v0, "markerWidth"

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
    const/16 v3, 0x1b

    .line 195
    .line 196
    goto/16 :goto_0

    .line 197
    .line 198
    :sswitch_d
    const-string v0, "markerUnits"

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
    const/16 v3, 0x1a

    .line 209
    .line 210
    goto/16 :goto_0

    .line 211
    .line 212
    :sswitch_e
    const-string v0, "markerStart"

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
    const/16 v3, 0x19

    .line 223
    .line 224
    goto/16 :goto_0

    .line 225
    .line 226
    :sswitch_f
    const-string v0, "vectorEffect"

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
    const/16 v3, 0x18

    .line 237
    .line 238
    goto/16 :goto_0

    .line 239
    .line 240
    :sswitch_10
    const-string v0, "align"

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
    const/16 v3, 0x17

    .line 251
    .line 252
    goto/16 :goto_0

    .line 253
    .line 254
    :sswitch_11
    const-string v0, "strokeMiterlimit"

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
    const/16 v3, 0x16

    .line 265
    .line 266
    goto/16 :goto_0

    .line 267
    .line 268
    :sswitch_12
    const-string v0, "refY"

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
    const/16 v3, 0x15

    .line 279
    .line 280
    goto/16 :goto_0

    .line 281
    .line 282
    :sswitch_13
    const-string v0, "refX"

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
    const/16 v3, 0x14

    .line 293
    .line 294
    goto/16 :goto_0

    .line 295
    .line 296
    :sswitch_14
    const-string v0, "name"

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
    const/16 v3, 0x13

    .line 307
    .line 308
    goto/16 :goto_0

    .line 309
    .line 310
    :sswitch_15
    const-string v0, "minY"

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
    const/16 v3, 0x12

    .line 321
    .line 322
    goto/16 :goto_0

    .line 323
    .line 324
    :sswitch_16
    const-string v0, "minX"

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
    const/16 v3, 0x11

    .line 335
    .line 336
    goto/16 :goto_0

    .line 337
    .line 338
    :sswitch_17
    const-string v0, "mask"

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
    const/16 v3, 0x10

    .line 349
    .line 350
    goto/16 :goto_0

    .line 351
    .line 352
    :sswitch_18
    const-string v0, "font"

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
    const/16 v3, 0xf

    .line 363
    .line 364
    goto/16 :goto_0

    .line 365
    .line 366
    :sswitch_19
    const-string v0, "fill"

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
    const/16 v3, 0xe

    .line 377
    .line 378
    goto/16 :goto_0

    .line 379
    .line 380
    :sswitch_1a
    const-string v0, "strokeDashoffset"

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
    const/16 v3, 0xd

    .line 391
    .line 392
    goto/16 :goto_0

    .line 393
    .line 394
    :sswitch_1b
    const-string v0, "fillOpacity"

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
    const/16 v3, 0xc

    .line 405
    .line 406
    goto/16 :goto_0

    .line 407
    .line 408
    :sswitch_1c
    const-string v0, "pointerEvents"

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
    const/16 v3, 0xb

    .line 419
    .line 420
    goto/16 :goto_0

    .line 421
    .line 422
    :sswitch_1d
    const-string v0, "strokeOpacity"

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
    const/16 v3, 0xa

    .line 433
    .line 434
    goto/16 :goto_0

    .line 435
    .line 436
    :sswitch_1e
    const-string v0, "fillRule"

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
    const/16 v3, 0x9

    .line 447
    .line 448
    goto/16 :goto_0

    .line 449
    .line 450
    :sswitch_1f
    const-string v0, "fontWeight"

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
    const/16 v3, 0x8

    .line 461
    .line 462
    goto/16 :goto_0

    .line 463
    .line 464
    :sswitch_20
    const-string v0, "stroke"

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
    goto :goto_0

    .line 473
    :cond_20
    const/4 v3, 0x7

    .line 474
    goto :goto_0

    .line 475
    :sswitch_21
    const-string v0, "markerMid"

    .line 476
    .line 477
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 478
    .line 479
    .line 480
    move-result v0

    .line 481
    if-nez v0, :cond_21

    .line 482
    .line 483
    goto :goto_0

    .line 484
    :cond_21
    const/4 v3, 0x6

    .line 485
    goto :goto_0

    .line 486
    :sswitch_22
    const-string v0, "markerEnd"

    .line 487
    .line 488
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 489
    .line 490
    .line 491
    move-result v0

    .line 492
    if-nez v0, :cond_22

    .line 493
    .line 494
    goto :goto_0

    .line 495
    :cond_22
    const/4 v3, 0x5

    .line 496
    goto :goto_0

    .line 497
    :sswitch_23
    const-string v0, "propList"

    .line 498
    .line 499
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 500
    .line 501
    .line 502
    move-result v0

    .line 503
    if-nez v0, :cond_23

    .line 504
    .line 505
    goto :goto_0

    .line 506
    :cond_23
    const/4 v3, 0x4

    .line 507
    goto :goto_0

    .line 508
    :sswitch_24
    const-string v0, "orient"

    .line 509
    .line 510
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 511
    .line 512
    .line 513
    move-result v0

    .line 514
    if-nez v0, :cond_24

    .line 515
    .line 516
    goto :goto_0

    .line 517
    :cond_24
    const/4 v3, 0x3

    .line 518
    goto :goto_0

    .line 519
    :sswitch_25
    const-string v0, "matrix"

    .line 520
    .line 521
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 522
    .line 523
    .line 524
    move-result v0

    .line 525
    if-nez v0, :cond_25

    .line 526
    .line 527
    goto :goto_0

    .line 528
    :cond_25
    const/4 v3, 0x2

    .line 529
    goto :goto_0

    .line 530
    :sswitch_26
    const-string v0, "opacity"

    .line 531
    .line 532
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 533
    .line 534
    .line 535
    move-result v0

    .line 536
    if-nez v0, :cond_26

    .line 537
    .line 538
    goto :goto_0

    .line 539
    :cond_26
    move v3, v1

    .line 540
    goto :goto_0

    .line 541
    :sswitch_27
    const-string v0, "vbHeight"

    .line 542
    .line 543
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 544
    .line 545
    .line 546
    move-result v0

    .line 547
    if-nez v0, :cond_27

    .line 548
    .line 549
    goto :goto_0

    .line 550
    :cond_27
    move v3, v2

    .line 551
    :goto_0
    const/high16 v0, 0x3f800000    # 1.0f

    .line 552
    .line 553
    const/4 v4, 0x0

    .line 554
    const/4 v5, 0x0

    .line 555
    packed-switch v3, :pswitch_data_0

    .line 556
    .line 557
    .line 558
    invoke-super {p0, p1, p2, p3}, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->setProperty(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V

    .line 559
    .line 560
    .line 561
    goto/16 :goto_1c

    .line 562
    .line 563
    :pswitch_0
    instance-of p2, p3, Ljava/lang/String;

    .line 564
    .line 565
    if-eqz p2, :cond_28

    .line 566
    .line 567
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 568
    .line 569
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;

    .line 570
    .line 571
    check-cast p3, Ljava/lang/String;

    .line 572
    .line 573
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;->setMarkerHeight(Landroid/view/View;Ljava/lang/String;)V

    .line 574
    .line 575
    .line 576
    goto/16 :goto_1c

    .line 577
    .line 578
    :cond_28
    instance-of p2, p3, Ljava/lang/Double;

    .line 579
    .line 580
    if-eqz p2, :cond_29

    .line 581
    .line 582
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 583
    .line 584
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;

    .line 585
    .line 586
    check-cast p3, Ljava/lang/Double;

    .line 587
    .line 588
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;->setMarkerHeight(Landroid/view/View;Ljava/lang/Double;)V

    .line 589
    .line 590
    .line 591
    goto/16 :goto_1c

    .line 592
    .line 593
    :cond_29
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 594
    .line 595
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;

    .line 596
    .line 597
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;->setMarkerHeight(Landroid/view/View;Ljava/lang/Double;)V

    .line 598
    .line 599
    .line 600
    goto/16 :goto_1c

    .line 601
    .line 602
    :pswitch_1
    instance-of p2, p3, Ljava/lang/String;

    .line 603
    .line 604
    if-eqz p2, :cond_2a

    .line 605
    .line 606
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 607
    .line 608
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;

    .line 609
    .line 610
    check-cast p3, Ljava/lang/String;

    .line 611
    .line 612
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;->setStrokeWidth(Landroid/view/View;Ljava/lang/String;)V

    .line 613
    .line 614
    .line 615
    goto/16 :goto_1c

    .line 616
    .line 617
    :cond_2a
    instance-of p2, p3, Ljava/lang/Double;

    .line 618
    .line 619
    if-eqz p2, :cond_2b

    .line 620
    .line 621
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 622
    .line 623
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;

    .line 624
    .line 625
    check-cast p3, Ljava/lang/Double;

    .line 626
    .line 627
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;->setStrokeWidth(Landroid/view/View;Ljava/lang/Double;)V

    .line 628
    .line 629
    .line 630
    goto/16 :goto_1c

    .line 631
    .line 632
    :cond_2b
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 633
    .line 634
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;

    .line 635
    .line 636
    const-string p3, "1"

    .line 637
    .line 638
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;->setStrokeWidth(Landroid/view/View;Ljava/lang/String;)V

    .line 639
    .line 640
    .line 641
    goto/16 :goto_1c

    .line 642
    .line 643
    :pswitch_2
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 644
    .line 645
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;

    .line 646
    .line 647
    if-nez p3, :cond_2c

    .line 648
    .line 649
    goto :goto_1

    .line 650
    :cond_2c
    check-cast p3, Ljava/lang/Double;

    .line 651
    .line 652
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 653
    .line 654
    .line 655
    move-result v2

    .line 656
    :goto_1
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;->setMeetOrSlice(Landroid/view/View;I)V

    .line 657
    .line 658
    .line 659
    goto/16 :goto_1c

    .line 660
    .line 661
    :pswitch_3
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 662
    .line 663
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;

    .line 664
    .line 665
    if-nez p3, :cond_2d

    .line 666
    .line 667
    goto :goto_2

    .line 668
    :cond_2d
    check-cast p3, Ljava/lang/Boolean;

    .line 669
    .line 670
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 671
    .line 672
    .line 673
    move-result v2

    .line 674
    :goto_2
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;->setResponsible(Landroid/view/View;Z)V

    .line 675
    .line 676
    .line 677
    goto/16 :goto_1c

    .line 678
    .line 679
    :pswitch_4
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 680
    .line 681
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;

    .line 682
    .line 683
    if-nez p3, :cond_2e

    .line 684
    .line 685
    goto :goto_3

    .line 686
    :cond_2e
    check-cast p3, Ljava/lang/Double;

    .line 687
    .line 688
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 689
    .line 690
    .line 691
    move-result v2

    .line 692
    :goto_3
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;->setStrokeLinejoin(Landroid/view/View;I)V

    .line 693
    .line 694
    .line 695
    goto/16 :goto_1c

    .line 696
    .line 697
    :pswitch_5
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 698
    .line 699
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;

    .line 700
    .line 701
    if-nez p3, :cond_2f

    .line 702
    .line 703
    goto :goto_4

    .line 704
    :cond_2f
    move-object v5, p3

    .line 705
    check-cast v5, Ljava/lang/String;

    .line 706
    .line 707
    :goto_4
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;->setDisplay(Landroid/view/View;Ljava/lang/String;)V

    .line 708
    .line 709
    .line 710
    goto/16 :goto_1c

    .line 711
    .line 712
    :pswitch_6
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 713
    .line 714
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;

    .line 715
    .line 716
    if-nez p3, :cond_30

    .line 717
    .line 718
    goto :goto_5

    .line 719
    :cond_30
    check-cast p3, Ljava/lang/Double;

    .line 720
    .line 721
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 722
    .line 723
    .line 724
    move-result v2

    .line 725
    :goto_5
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;->setStrokeLinecap(Landroid/view/View;I)V

    .line 726
    .line 727
    .line 728
    goto/16 :goto_1c

    .line 729
    .line 730
    :pswitch_7
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 731
    .line 732
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;

    .line 733
    .line 734
    if-nez p3, :cond_31

    .line 735
    .line 736
    goto :goto_6

    .line 737
    :cond_31
    check-cast p3, Ljava/lang/Double;

    .line 738
    .line 739
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 740
    .line 741
    .line 742
    move-result v2

    .line 743
    :goto_6
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;->setClipRule(Landroid/view/View;I)V

    .line 744
    .line 745
    .line 746
    goto/16 :goto_1c

    .line 747
    .line 748
    :pswitch_8
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 749
    .line 750
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;

    .line 751
    .line 752
    if-nez p3, :cond_32

    .line 753
    .line 754
    goto :goto_7

    .line 755
    :cond_32
    move-object v5, p3

    .line 756
    check-cast v5, Ljava/lang/String;

    .line 757
    .line 758
    :goto_7
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;->setClipPath(Landroid/view/View;Ljava/lang/String;)V

    .line 759
    .line 760
    .line 761
    goto/16 :goto_1c

    .line 762
    .line 763
    :pswitch_9
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 764
    .line 765
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;

    .line 766
    .line 767
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 768
    .line 769
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;->setStrokeDasharray(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 770
    .line 771
    .line 772
    goto/16 :goto_1c

    .line 773
    .line 774
    :pswitch_a
    instance-of p2, p3, Ljava/lang/String;

    .line 775
    .line 776
    if-eqz p2, :cond_33

    .line 777
    .line 778
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 779
    .line 780
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;

    .line 781
    .line 782
    check-cast p3, Ljava/lang/String;

    .line 783
    .line 784
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;->setFontSize(Landroid/view/View;Ljava/lang/String;)V

    .line 785
    .line 786
    .line 787
    goto/16 :goto_1c

    .line 788
    .line 789
    :cond_33
    instance-of p2, p3, Ljava/lang/Double;

    .line 790
    .line 791
    if-eqz p2, :cond_34

    .line 792
    .line 793
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 794
    .line 795
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;

    .line 796
    .line 797
    check-cast p3, Ljava/lang/Double;

    .line 798
    .line 799
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;->setFontSize(Landroid/view/View;Ljava/lang/Double;)V

    .line 800
    .line 801
    .line 802
    goto/16 :goto_1c

    .line 803
    .line 804
    :cond_34
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 805
    .line 806
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;

    .line 807
    .line 808
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;->setFontSize(Landroid/view/View;Ljava/lang/Double;)V

    .line 809
    .line 810
    .line 811
    goto/16 :goto_1c

    .line 812
    .line 813
    :pswitch_b
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 814
    .line 815
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;

    .line 816
    .line 817
    if-nez p3, :cond_35

    .line 818
    .line 819
    goto :goto_8

    .line 820
    :cond_35
    check-cast p3, Ljava/lang/Double;

    .line 821
    .line 822
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 823
    .line 824
    .line 825
    move-result v4

    .line 826
    :goto_8
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;->setVbWidth(Landroid/view/View;F)V

    .line 827
    .line 828
    .line 829
    goto/16 :goto_1c

    .line 830
    .line 831
    :pswitch_c
    instance-of p2, p3, Ljava/lang/String;

    .line 832
    .line 833
    if-eqz p2, :cond_36

    .line 834
    .line 835
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 836
    .line 837
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;

    .line 838
    .line 839
    check-cast p3, Ljava/lang/String;

    .line 840
    .line 841
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;->setMarkerWidth(Landroid/view/View;Ljava/lang/String;)V

    .line 842
    .line 843
    .line 844
    goto/16 :goto_1c

    .line 845
    .line 846
    :cond_36
    instance-of p2, p3, Ljava/lang/Double;

    .line 847
    .line 848
    if-eqz p2, :cond_37

    .line 849
    .line 850
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 851
    .line 852
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;

    .line 853
    .line 854
    check-cast p3, Ljava/lang/Double;

    .line 855
    .line 856
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;->setMarkerWidth(Landroid/view/View;Ljava/lang/Double;)V

    .line 857
    .line 858
    .line 859
    goto/16 :goto_1c

    .line 860
    .line 861
    :cond_37
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 862
    .line 863
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;

    .line 864
    .line 865
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;->setMarkerWidth(Landroid/view/View;Ljava/lang/Double;)V

    .line 866
    .line 867
    .line 868
    goto/16 :goto_1c

    .line 869
    .line 870
    :pswitch_d
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 871
    .line 872
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;

    .line 873
    .line 874
    if-nez p3, :cond_38

    .line 875
    .line 876
    goto :goto_9

    .line 877
    :cond_38
    move-object v5, p3

    .line 878
    check-cast v5, Ljava/lang/String;

    .line 879
    .line 880
    :goto_9
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;->setMarkerUnits(Landroid/view/View;Ljava/lang/String;)V

    .line 881
    .line 882
    .line 883
    goto/16 :goto_1c

    .line 884
    .line 885
    :pswitch_e
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 886
    .line 887
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;

    .line 888
    .line 889
    if-nez p3, :cond_39

    .line 890
    .line 891
    goto :goto_a

    .line 892
    :cond_39
    move-object v5, p3

    .line 893
    check-cast v5, Ljava/lang/String;

    .line 894
    .line 895
    :goto_a
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;->setMarkerStart(Landroid/view/View;Ljava/lang/String;)V

    .line 896
    .line 897
    .line 898
    goto/16 :goto_1c

    .line 899
    .line 900
    :pswitch_f
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 901
    .line 902
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;

    .line 903
    .line 904
    if-nez p3, :cond_3a

    .line 905
    .line 906
    goto :goto_b

    .line 907
    :cond_3a
    check-cast p3, Ljava/lang/Double;

    .line 908
    .line 909
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 910
    .line 911
    .line 912
    move-result v2

    .line 913
    :goto_b
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;->setVectorEffect(Landroid/view/View;I)V

    .line 914
    .line 915
    .line 916
    goto/16 :goto_1c

    .line 917
    .line 918
    :pswitch_10
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 919
    .line 920
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;

    .line 921
    .line 922
    if-nez p3, :cond_3b

    .line 923
    .line 924
    goto :goto_c

    .line 925
    :cond_3b
    move-object v5, p3

    .line 926
    check-cast v5, Ljava/lang/String;

    .line 927
    .line 928
    :goto_c
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;->setAlign(Landroid/view/View;Ljava/lang/String;)V

    .line 929
    .line 930
    .line 931
    goto/16 :goto_1c

    .line 932
    .line 933
    :pswitch_11
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 934
    .line 935
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;

    .line 936
    .line 937
    if-nez p3, :cond_3c

    .line 938
    .line 939
    goto :goto_d

    .line 940
    :cond_3c
    check-cast p3, Ljava/lang/Double;

    .line 941
    .line 942
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 943
    .line 944
    .line 945
    move-result v4

    .line 946
    :goto_d
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;->setStrokeMiterlimit(Landroid/view/View;F)V

    .line 947
    .line 948
    .line 949
    goto/16 :goto_1c

    .line 950
    .line 951
    :pswitch_12
    instance-of p2, p3, Ljava/lang/String;

    .line 952
    .line 953
    if-eqz p2, :cond_3d

    .line 954
    .line 955
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 956
    .line 957
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;

    .line 958
    .line 959
    check-cast p3, Ljava/lang/String;

    .line 960
    .line 961
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;->setRefY(Landroid/view/View;Ljava/lang/String;)V

    .line 962
    .line 963
    .line 964
    goto/16 :goto_1c

    .line 965
    .line 966
    :cond_3d
    instance-of p2, p3, Ljava/lang/Double;

    .line 967
    .line 968
    if-eqz p2, :cond_3e

    .line 969
    .line 970
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 971
    .line 972
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;

    .line 973
    .line 974
    check-cast p3, Ljava/lang/Double;

    .line 975
    .line 976
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;->setRefY(Landroid/view/View;Ljava/lang/Double;)V

    .line 977
    .line 978
    .line 979
    goto/16 :goto_1c

    .line 980
    .line 981
    :cond_3e
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 982
    .line 983
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;

    .line 984
    .line 985
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;->setRefY(Landroid/view/View;Ljava/lang/Double;)V

    .line 986
    .line 987
    .line 988
    goto/16 :goto_1c

    .line 989
    .line 990
    :pswitch_13
    instance-of p2, p3, Ljava/lang/String;

    .line 991
    .line 992
    if-eqz p2, :cond_3f

    .line 993
    .line 994
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 995
    .line 996
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;

    .line 997
    .line 998
    check-cast p3, Ljava/lang/String;

    .line 999
    .line 1000
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;->setRefX(Landroid/view/View;Ljava/lang/String;)V

    .line 1001
    .line 1002
    .line 1003
    goto/16 :goto_1c

    .line 1004
    .line 1005
    :cond_3f
    instance-of p2, p3, Ljava/lang/Double;

    .line 1006
    .line 1007
    if-eqz p2, :cond_40

    .line 1008
    .line 1009
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1010
    .line 1011
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;

    .line 1012
    .line 1013
    check-cast p3, Ljava/lang/Double;

    .line 1014
    .line 1015
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;->setRefX(Landroid/view/View;Ljava/lang/Double;)V

    .line 1016
    .line 1017
    .line 1018
    goto/16 :goto_1c

    .line 1019
    .line 1020
    :cond_40
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1021
    .line 1022
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;

    .line 1023
    .line 1024
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;->setRefX(Landroid/view/View;Ljava/lang/Double;)V

    .line 1025
    .line 1026
    .line 1027
    goto/16 :goto_1c

    .line 1028
    .line 1029
    :pswitch_14
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1030
    .line 1031
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;

    .line 1032
    .line 1033
    if-nez p3, :cond_41

    .line 1034
    .line 1035
    goto :goto_e

    .line 1036
    :cond_41
    move-object v5, p3

    .line 1037
    check-cast v5, Ljava/lang/String;

    .line 1038
    .line 1039
    :goto_e
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;->setName(Landroid/view/View;Ljava/lang/String;)V

    .line 1040
    .line 1041
    .line 1042
    goto/16 :goto_1c

    .line 1043
    .line 1044
    :pswitch_15
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1045
    .line 1046
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;

    .line 1047
    .line 1048
    if-nez p3, :cond_42

    .line 1049
    .line 1050
    goto :goto_f

    .line 1051
    :cond_42
    check-cast p3, Ljava/lang/Double;

    .line 1052
    .line 1053
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 1054
    .line 1055
    .line 1056
    move-result v4

    .line 1057
    :goto_f
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;->setMinY(Landroid/view/View;F)V

    .line 1058
    .line 1059
    .line 1060
    goto/16 :goto_1c

    .line 1061
    .line 1062
    :pswitch_16
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1063
    .line 1064
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;

    .line 1065
    .line 1066
    if-nez p3, :cond_43

    .line 1067
    .line 1068
    goto :goto_10

    .line 1069
    :cond_43
    check-cast p3, Ljava/lang/Double;

    .line 1070
    .line 1071
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 1072
    .line 1073
    .line 1074
    move-result v4

    .line 1075
    :goto_10
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;->setMinX(Landroid/view/View;F)V

    .line 1076
    .line 1077
    .line 1078
    goto/16 :goto_1c

    .line 1079
    .line 1080
    :pswitch_17
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1081
    .line 1082
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;

    .line 1083
    .line 1084
    if-nez p3, :cond_44

    .line 1085
    .line 1086
    goto :goto_11

    .line 1087
    :cond_44
    move-object v5, p3

    .line 1088
    check-cast v5, Ljava/lang/String;

    .line 1089
    .line 1090
    :goto_11
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;->setMask(Landroid/view/View;Ljava/lang/String;)V

    .line 1091
    .line 1092
    .line 1093
    goto/16 :goto_1c

    .line 1094
    .line 1095
    :pswitch_18
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1096
    .line 1097
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;

    .line 1098
    .line 1099
    check-cast p3, Lcom/facebook/react/bridge/ReadableMap;

    .line 1100
    .line 1101
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;->setFont(Landroid/view/View;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 1102
    .line 1103
    .line 1104
    goto/16 :goto_1c

    .line 1105
    .line 1106
    :pswitch_19
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1107
    .line 1108
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;

    .line 1109
    .line 1110
    check-cast p3, Lcom/facebook/react/bridge/ReadableMap;

    .line 1111
    .line 1112
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;->setFill(Landroid/view/View;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 1113
    .line 1114
    .line 1115
    goto/16 :goto_1c

    .line 1116
    .line 1117
    :pswitch_1a
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1118
    .line 1119
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;

    .line 1120
    .line 1121
    if-nez p3, :cond_45

    .line 1122
    .line 1123
    goto :goto_12

    .line 1124
    :cond_45
    check-cast p3, Ljava/lang/Double;

    .line 1125
    .line 1126
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 1127
    .line 1128
    .line 1129
    move-result v4

    .line 1130
    :goto_12
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;->setStrokeDashoffset(Landroid/view/View;F)V

    .line 1131
    .line 1132
    .line 1133
    goto/16 :goto_1c

    .line 1134
    .line 1135
    :pswitch_1b
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1136
    .line 1137
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;

    .line 1138
    .line 1139
    if-nez p3, :cond_46

    .line 1140
    .line 1141
    goto :goto_13

    .line 1142
    :cond_46
    check-cast p3, Ljava/lang/Double;

    .line 1143
    .line 1144
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 1145
    .line 1146
    .line 1147
    move-result v0

    .line 1148
    :goto_13
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;->setFillOpacity(Landroid/view/View;F)V

    .line 1149
    .line 1150
    .line 1151
    goto/16 :goto_1c

    .line 1152
    .line 1153
    :pswitch_1c
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1154
    .line 1155
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;

    .line 1156
    .line 1157
    if-nez p3, :cond_47

    .line 1158
    .line 1159
    goto :goto_14

    .line 1160
    :cond_47
    move-object v5, p3

    .line 1161
    check-cast v5, Ljava/lang/String;

    .line 1162
    .line 1163
    :goto_14
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;->setPointerEvents(Landroid/view/View;Ljava/lang/String;)V

    .line 1164
    .line 1165
    .line 1166
    goto/16 :goto_1c

    .line 1167
    .line 1168
    :pswitch_1d
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1169
    .line 1170
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;

    .line 1171
    .line 1172
    if-nez p3, :cond_48

    .line 1173
    .line 1174
    goto :goto_15

    .line 1175
    :cond_48
    check-cast p3, Ljava/lang/Double;

    .line 1176
    .line 1177
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 1178
    .line 1179
    .line 1180
    move-result v0

    .line 1181
    :goto_15
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;->setStrokeOpacity(Landroid/view/View;F)V

    .line 1182
    .line 1183
    .line 1184
    goto/16 :goto_1c

    .line 1185
    .line 1186
    :pswitch_1e
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1187
    .line 1188
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;

    .line 1189
    .line 1190
    if-nez p3, :cond_49

    .line 1191
    .line 1192
    goto :goto_16

    .line 1193
    :cond_49
    check-cast p3, Ljava/lang/Double;

    .line 1194
    .line 1195
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 1196
    .line 1197
    .line 1198
    move-result v1

    .line 1199
    :goto_16
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;->setFillRule(Landroid/view/View;I)V

    .line 1200
    .line 1201
    .line 1202
    goto/16 :goto_1c

    .line 1203
    .line 1204
    :pswitch_1f
    instance-of p2, p3, Ljava/lang/String;

    .line 1205
    .line 1206
    if-eqz p2, :cond_4a

    .line 1207
    .line 1208
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1209
    .line 1210
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;

    .line 1211
    .line 1212
    check-cast p3, Ljava/lang/String;

    .line 1213
    .line 1214
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;->setFontWeight(Landroid/view/View;Ljava/lang/String;)V

    .line 1215
    .line 1216
    .line 1217
    goto/16 :goto_1c

    .line 1218
    .line 1219
    :cond_4a
    instance-of p2, p3, Ljava/lang/Double;

    .line 1220
    .line 1221
    if-eqz p2, :cond_4b

    .line 1222
    .line 1223
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1224
    .line 1225
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;

    .line 1226
    .line 1227
    check-cast p3, Ljava/lang/Double;

    .line 1228
    .line 1229
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;->setFontWeight(Landroid/view/View;Ljava/lang/Double;)V

    .line 1230
    .line 1231
    .line 1232
    goto/16 :goto_1c

    .line 1233
    .line 1234
    :cond_4b
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1235
    .line 1236
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;

    .line 1237
    .line 1238
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;->setFontWeight(Landroid/view/View;Ljava/lang/Double;)V

    .line 1239
    .line 1240
    .line 1241
    goto/16 :goto_1c

    .line 1242
    .line 1243
    :pswitch_20
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1244
    .line 1245
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;

    .line 1246
    .line 1247
    check-cast p3, Lcom/facebook/react/bridge/ReadableMap;

    .line 1248
    .line 1249
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;->setStroke(Landroid/view/View;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 1250
    .line 1251
    .line 1252
    goto :goto_1c

    .line 1253
    :pswitch_21
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1254
    .line 1255
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;

    .line 1256
    .line 1257
    if-nez p3, :cond_4c

    .line 1258
    .line 1259
    goto :goto_17

    .line 1260
    :cond_4c
    move-object v5, p3

    .line 1261
    check-cast v5, Ljava/lang/String;

    .line 1262
    .line 1263
    :goto_17
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;->setMarkerMid(Landroid/view/View;Ljava/lang/String;)V

    .line 1264
    .line 1265
    .line 1266
    goto :goto_1c

    .line 1267
    :pswitch_22
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1268
    .line 1269
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;

    .line 1270
    .line 1271
    if-nez p3, :cond_4d

    .line 1272
    .line 1273
    goto :goto_18

    .line 1274
    :cond_4d
    move-object v5, p3

    .line 1275
    check-cast v5, Ljava/lang/String;

    .line 1276
    .line 1277
    :goto_18
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;->setMarkerEnd(Landroid/view/View;Ljava/lang/String;)V

    .line 1278
    .line 1279
    .line 1280
    goto :goto_1c

    .line 1281
    :pswitch_23
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1282
    .line 1283
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;

    .line 1284
    .line 1285
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 1286
    .line 1287
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;->setPropList(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 1288
    .line 1289
    .line 1290
    goto :goto_1c

    .line 1291
    :pswitch_24
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1292
    .line 1293
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;

    .line 1294
    .line 1295
    if-nez p3, :cond_4e

    .line 1296
    .line 1297
    goto :goto_19

    .line 1298
    :cond_4e
    move-object v5, p3

    .line 1299
    check-cast v5, Ljava/lang/String;

    .line 1300
    .line 1301
    :goto_19
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;->setOrient(Landroid/view/View;Ljava/lang/String;)V

    .line 1302
    .line 1303
    .line 1304
    goto :goto_1c

    .line 1305
    :pswitch_25
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1306
    .line 1307
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;

    .line 1308
    .line 1309
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 1310
    .line 1311
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;->setMatrix(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 1312
    .line 1313
    .line 1314
    goto :goto_1c

    .line 1315
    :pswitch_26
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1316
    .line 1317
    if-nez p3, :cond_4f

    .line 1318
    .line 1319
    goto :goto_1a

    .line 1320
    :cond_4f
    check-cast p3, Ljava/lang/Double;

    .line 1321
    .line 1322
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 1323
    .line 1324
    .line 1325
    move-result v0

    .line 1326
    :goto_1a
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/uimanager/BaseViewManagerInterface;->setOpacity(Landroid/view/View;F)V

    .line 1327
    .line 1328
    .line 1329
    goto :goto_1c

    .line 1330
    :pswitch_27
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1331
    .line 1332
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;

    .line 1333
    .line 1334
    if-nez p3, :cond_50

    .line 1335
    .line 1336
    goto :goto_1b

    .line 1337
    :cond_50
    check-cast p3, Ljava/lang/Double;

    .line 1338
    .line 1339
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 1340
    .line 1341
    .line 1342
    move-result v4

    .line 1343
    :goto_1b
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGMarkerManagerInterface;->setVbHeight(Landroid/view/View;F)V

    .line 1344
    .line 1345
    .line 1346
    :goto_1c
    return-void

    .line 1347
    :sswitch_data_0
    .sparse-switch
        -0x5d75250d -> :sswitch_27
        -0x4b8807f5 -> :sswitch_26
        -0x4072683f -> :sswitch_25
        -0x3c1e57bb -> :sswitch_24
        -0x3b3da15f -> :sswitch_23
        -0x37a9a5bf -> :sswitch_22
        -0x37a98852 -> :sswitch_21
        -0x352a89c8 -> :sswitch_20
        -0x2bc67c59 -> :sswitch_1f
        -0x2b7578e1 -> :sswitch_1e
        -0x18d3d54d -> :sswitch_1d
        -0x117e564a -> :sswitch_1c
        -0x3330ef8 -> :sswitch_1b
        -0x2a83503 -> :sswitch_1a
        0x2ff583 -> :sswitch_19
        0x300c4f -> :sswitch_18
        0x3306ec -> :sswitch_17
        0x332446 -> :sswitch_16
        0x332447 -> :sswitch_15
        0x337a8b -> :sswitch_14
        0x355a25 -> :sswitch_13
        0x355a26 -> :sswitch_12
        0x4b3162e -> :sswitch_11
        0x5899705 -> :sswitch_10
        0x63a48b4 -> :sswitch_f
        0xcf0d448 -> :sswitch_e
        0xd0a6755 -> :sswitch_d
        0xd243dac -> :sswitch_c
        0xe557a7a -> :sswitch_b
        0x15caa0f0 -> :sswitch_a
        0x17f096af -> :sswitch_9
        0x36b25395 -> :sswitch_8
        0x36b3866c -> :sswitch_7
        0x3d3f8e06 -> :sswitch_6
        0x63a518c2 -> :sswitch_5
        0x6ab59576 -> :sswitch_4
        0x6e2146f6 -> :sswitch_3
        0x71baeb28 -> :sswitch_2
        0x72aeea6e -> :sswitch_1
        0x7d947e01 -> :sswitch_0
    .end sparse-switch

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
