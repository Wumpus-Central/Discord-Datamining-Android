.class public Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerDelegate;
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
        "Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface<",
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
    const/16 v3, 0x2c

    .line 27
    .line 28
    goto/16 :goto_0

    .line 29
    .line 30
    :sswitch_1
    const-string v0, "responsible"

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
    const/16 v3, 0x2b

    .line 41
    .line 42
    goto/16 :goto_0

    .line 43
    .line 44
    :sswitch_2
    const-string v0, "strokeLinejoin"

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
    const/16 v3, 0x2a

    .line 55
    .line 56
    goto/16 :goto_0

    .line 57
    .line 58
    :sswitch_3
    const-string v0, "display"

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
    const/16 v3, 0x29

    .line 69
    .line 70
    goto/16 :goto_0

    .line 71
    .line 72
    :sswitch_4
    const-string v0, "textLength"

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
    const/16 v3, 0x28

    .line 83
    .line 84
    goto/16 :goto_0

    .line 85
    .line 86
    :sswitch_5
    const-string v0, "midLine"

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
    const/16 v3, 0x27

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
    const/16 v3, 0x26

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
    const/16 v3, 0x25

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
    const/16 v3, 0x24

    .line 139
    .line 140
    goto/16 :goto_0

    .line 141
    .line 142
    :sswitch_9
    const-string v0, "inlineSize"

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
    const/16 v3, 0x23

    .line 153
    .line 154
    goto/16 :goto_0

    .line 155
    .line 156
    :sswitch_a
    const-string v0, "strokeDasharray"

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
    const/16 v3, 0x22

    .line 167
    .line 168
    goto/16 :goto_0

    .line 169
    .line 170
    :sswitch_b
    const-string v0, "fontSize"

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
    const/16 v3, 0x21

    .line 181
    .line 182
    goto/16 :goto_0

    .line 183
    .line 184
    :sswitch_c
    const-string v0, "baselineShift"

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
    const/16 v3, 0x20

    .line 195
    .line 196
    goto/16 :goto_0

    .line 197
    .line 198
    :sswitch_d
    const-string v0, "markerStart"

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
    const/16 v3, 0x1f

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
    const/16 v3, 0x1e

    .line 223
    .line 224
    goto/16 :goto_0

    .line 225
    .line 226
    :sswitch_f
    const-string v0, "strokeMiterlimit"

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
    const/16 v3, 0x1d

    .line 237
    .line 238
    goto/16 :goto_0

    .line 239
    .line 240
    :sswitch_10
    const-string v0, "side"

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
    const/16 v3, 0x1c

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
    const/16 v3, 0x1b

    .line 265
    .line 266
    goto/16 :goto_0

    .line 267
    .line 268
    :sswitch_12
    const-string v0, "mask"

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
    const/16 v3, 0x1a

    .line 279
    .line 280
    goto/16 :goto_0

    .line 281
    .line 282
    :sswitch_13
    const-string v0, "href"

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
    const/16 v3, 0x19

    .line 293
    .line 294
    goto/16 :goto_0

    .line 295
    .line 296
    :sswitch_14
    const-string v0, "font"

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
    const/16 v3, 0x18

    .line 307
    .line 308
    goto/16 :goto_0

    .line 309
    .line 310
    :sswitch_15
    const-string v0, "fill"

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
    const/16 v3, 0x17

    .line 321
    .line 322
    goto/16 :goto_0

    .line 323
    .line 324
    :sswitch_16
    const-string v0, "dy"

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
    const/16 v3, 0x16

    .line 335
    .line 336
    goto/16 :goto_0

    .line 337
    .line 338
    :sswitch_17
    const-string v0, "dx"

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
    const/16 v3, 0x15

    .line 349
    .line 350
    goto/16 :goto_0

    .line 351
    .line 352
    :sswitch_18
    const-string v0, "y"

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
    const/16 v3, 0x14

    .line 363
    .line 364
    goto/16 :goto_0

    .line 365
    .line 366
    :sswitch_19
    const-string v0, "x"

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
    const/16 v3, 0x13

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
    const/16 v3, 0x12

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
    const/16 v3, 0x11

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
    const/16 v3, 0x10

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
    const/16 v3, 0xf

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
    const/16 v3, 0xe

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
    const/16 v3, 0xd

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
    goto/16 :goto_0

    .line 473
    .line 474
    :cond_20
    const/16 v3, 0xc

    .line 475
    .line 476
    goto/16 :goto_0

    .line 477
    .line 478
    :sswitch_21
    const-string v0, "rotate"

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
    goto/16 :goto_0

    .line 487
    .line 488
    :cond_21
    const/16 v3, 0xb

    .line 489
    .line 490
    goto/16 :goto_0

    .line 491
    .line 492
    :sswitch_22
    const-string v0, "markerMid"

    .line 493
    .line 494
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 495
    .line 496
    .line 497
    move-result v0

    .line 498
    if-nez v0, :cond_22

    .line 499
    .line 500
    goto/16 :goto_0

    .line 501
    .line 502
    :cond_22
    const/16 v3, 0xa

    .line 503
    .line 504
    goto/16 :goto_0

    .line 505
    .line 506
    :sswitch_23
    const-string v0, "markerEnd"

    .line 507
    .line 508
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 509
    .line 510
    .line 511
    move-result v0

    .line 512
    if-nez v0, :cond_23

    .line 513
    .line 514
    goto/16 :goto_0

    .line 515
    .line 516
    :cond_23
    const/16 v3, 0x9

    .line 517
    .line 518
    goto/16 :goto_0

    .line 519
    .line 520
    :sswitch_24
    const-string v0, "propList"

    .line 521
    .line 522
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 523
    .line 524
    .line 525
    move-result v0

    .line 526
    if-nez v0, :cond_24

    .line 527
    .line 528
    goto/16 :goto_0

    .line 529
    .line 530
    :cond_24
    const/16 v3, 0x8

    .line 531
    .line 532
    goto/16 :goto_0

    .line 533
    .line 534
    :sswitch_25
    const-string v0, "method"

    .line 535
    .line 536
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 537
    .line 538
    .line 539
    move-result v0

    .line 540
    if-nez v0, :cond_25

    .line 541
    .line 542
    goto :goto_0

    .line 543
    :cond_25
    const/4 v3, 0x7

    .line 544
    goto :goto_0

    .line 545
    :sswitch_26
    const-string v0, "matrix"

    .line 546
    .line 547
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 548
    .line 549
    .line 550
    move-result v0

    .line 551
    if-nez v0, :cond_26

    .line 552
    .line 553
    goto :goto_0

    .line 554
    :cond_26
    const/4 v3, 0x6

    .line 555
    goto :goto_0

    .line 556
    :sswitch_27
    const-string v0, "verticalAlign"

    .line 557
    .line 558
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 559
    .line 560
    .line 561
    move-result v0

    .line 562
    if-nez v0, :cond_27

    .line 563
    .line 564
    goto :goto_0

    .line 565
    :cond_27
    const/4 v3, 0x5

    .line 566
    goto :goto_0

    .line 567
    :sswitch_28
    const-string v0, "alignmentBaseline"

    .line 568
    .line 569
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 570
    .line 571
    .line 572
    move-result v0

    .line 573
    if-nez v0, :cond_28

    .line 574
    .line 575
    goto :goto_0

    .line 576
    :cond_28
    const/4 v3, 0x4

    .line 577
    goto :goto_0

    .line 578
    :sswitch_29
    const-string v0, "opacity"

    .line 579
    .line 580
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 581
    .line 582
    .line 583
    move-result v0

    .line 584
    if-nez v0, :cond_29

    .line 585
    .line 586
    goto :goto_0

    .line 587
    :cond_29
    const/4 v3, 0x3

    .line 588
    goto :goto_0

    .line 589
    :sswitch_2a
    const-string v0, "lengthAdjust"

    .line 590
    .line 591
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 592
    .line 593
    .line 594
    move-result v0

    .line 595
    if-nez v0, :cond_2a

    .line 596
    .line 597
    goto :goto_0

    .line 598
    :cond_2a
    const/4 v3, 0x2

    .line 599
    goto :goto_0

    .line 600
    :sswitch_2b
    const-string v0, "startOffset"

    .line 601
    .line 602
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 603
    .line 604
    .line 605
    move-result v0

    .line 606
    if-nez v0, :cond_2b

    .line 607
    .line 608
    goto :goto_0

    .line 609
    :cond_2b
    move v3, v1

    .line 610
    goto :goto_0

    .line 611
    :sswitch_2c
    const-string v0, "spacing"

    .line 612
    .line 613
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 614
    .line 615
    .line 616
    move-result v0

    .line 617
    if-nez v0, :cond_2c

    .line 618
    .line 619
    goto :goto_0

    .line 620
    :cond_2c
    move v3, v2

    .line 621
    :goto_0
    const/4 v0, 0x0

    .line 622
    const/high16 v4, 0x3f800000    # 1.0f

    .line 623
    .line 624
    const/4 v5, 0x0

    .line 625
    packed-switch v3, :pswitch_data_0

    .line 626
    .line 627
    .line 628
    invoke-super {p0, p1, p2, p3}, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->setProperty(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V

    .line 629
    .line 630
    .line 631
    goto/16 :goto_1c

    .line 632
    .line 633
    :pswitch_0
    instance-of p2, p3, Ljava/lang/String;

    .line 634
    .line 635
    if-eqz p2, :cond_2d

    .line 636
    .line 637
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 638
    .line 639
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 640
    .line 641
    check-cast p3, Ljava/lang/String;

    .line 642
    .line 643
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setStrokeWidth(Landroid/view/View;Ljava/lang/String;)V

    .line 644
    .line 645
    .line 646
    goto/16 :goto_1c

    .line 647
    .line 648
    :cond_2d
    instance-of p2, p3, Ljava/lang/Double;

    .line 649
    .line 650
    if-eqz p2, :cond_2e

    .line 651
    .line 652
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 653
    .line 654
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 655
    .line 656
    check-cast p3, Ljava/lang/Double;

    .line 657
    .line 658
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setStrokeWidth(Landroid/view/View;Ljava/lang/Double;)V

    .line 659
    .line 660
    .line 661
    goto/16 :goto_1c

    .line 662
    .line 663
    :cond_2e
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 664
    .line 665
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 666
    .line 667
    const-string p3, "1"

    .line 668
    .line 669
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setStrokeWidth(Landroid/view/View;Ljava/lang/String;)V

    .line 670
    .line 671
    .line 672
    goto/16 :goto_1c

    .line 673
    .line 674
    :pswitch_1
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 675
    .line 676
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 677
    .line 678
    if-nez p3, :cond_2f

    .line 679
    .line 680
    goto :goto_1

    .line 681
    :cond_2f
    check-cast p3, Ljava/lang/Boolean;

    .line 682
    .line 683
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 684
    .line 685
    .line 686
    move-result v2

    .line 687
    :goto_1
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setResponsible(Landroid/view/View;Z)V

    .line 688
    .line 689
    .line 690
    goto/16 :goto_1c

    .line 691
    .line 692
    :pswitch_2
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 693
    .line 694
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 695
    .line 696
    if-nez p3, :cond_30

    .line 697
    .line 698
    goto :goto_2

    .line 699
    :cond_30
    check-cast p3, Ljava/lang/Double;

    .line 700
    .line 701
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 702
    .line 703
    .line 704
    move-result v2

    .line 705
    :goto_2
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setStrokeLinejoin(Landroid/view/View;I)V

    .line 706
    .line 707
    .line 708
    goto/16 :goto_1c

    .line 709
    .line 710
    :pswitch_3
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 711
    .line 712
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 713
    .line 714
    if-nez p3, :cond_31

    .line 715
    .line 716
    goto :goto_3

    .line 717
    :cond_31
    move-object v5, p3

    .line 718
    check-cast v5, Ljava/lang/String;

    .line 719
    .line 720
    :goto_3
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setDisplay(Landroid/view/View;Ljava/lang/String;)V

    .line 721
    .line 722
    .line 723
    goto/16 :goto_1c

    .line 724
    .line 725
    :pswitch_4
    instance-of p2, p3, Ljava/lang/String;

    .line 726
    .line 727
    if-eqz p2, :cond_32

    .line 728
    .line 729
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 730
    .line 731
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 732
    .line 733
    check-cast p3, Ljava/lang/String;

    .line 734
    .line 735
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setTextLength(Landroid/view/View;Ljava/lang/String;)V

    .line 736
    .line 737
    .line 738
    goto/16 :goto_1c

    .line 739
    .line 740
    :cond_32
    instance-of p2, p3, Ljava/lang/Double;

    .line 741
    .line 742
    if-eqz p2, :cond_33

    .line 743
    .line 744
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 745
    .line 746
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 747
    .line 748
    check-cast p3, Ljava/lang/Double;

    .line 749
    .line 750
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setTextLength(Landroid/view/View;Ljava/lang/Double;)V

    .line 751
    .line 752
    .line 753
    goto/16 :goto_1c

    .line 754
    .line 755
    :cond_33
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 756
    .line 757
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 758
    .line 759
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setTextLength(Landroid/view/View;Ljava/lang/Double;)V

    .line 760
    .line 761
    .line 762
    goto/16 :goto_1c

    .line 763
    .line 764
    :pswitch_5
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 765
    .line 766
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 767
    .line 768
    if-nez p3, :cond_34

    .line 769
    .line 770
    goto :goto_4

    .line 771
    :cond_34
    move-object v5, p3

    .line 772
    check-cast v5, Ljava/lang/String;

    .line 773
    .line 774
    :goto_4
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setMidLine(Landroid/view/View;Ljava/lang/String;)V

    .line 775
    .line 776
    .line 777
    goto/16 :goto_1c

    .line 778
    .line 779
    :pswitch_6
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 780
    .line 781
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 782
    .line 783
    if-nez p3, :cond_35

    .line 784
    .line 785
    goto :goto_5

    .line 786
    :cond_35
    check-cast p3, Ljava/lang/Double;

    .line 787
    .line 788
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 789
    .line 790
    .line 791
    move-result v2

    .line 792
    :goto_5
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setStrokeLinecap(Landroid/view/View;I)V

    .line 793
    .line 794
    .line 795
    goto/16 :goto_1c

    .line 796
    .line 797
    :pswitch_7
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 798
    .line 799
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 800
    .line 801
    if-nez p3, :cond_36

    .line 802
    .line 803
    goto :goto_6

    .line 804
    :cond_36
    check-cast p3, Ljava/lang/Double;

    .line 805
    .line 806
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 807
    .line 808
    .line 809
    move-result v2

    .line 810
    :goto_6
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setClipRule(Landroid/view/View;I)V

    .line 811
    .line 812
    .line 813
    goto/16 :goto_1c

    .line 814
    .line 815
    :pswitch_8
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 816
    .line 817
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 818
    .line 819
    if-nez p3, :cond_37

    .line 820
    .line 821
    goto :goto_7

    .line 822
    :cond_37
    move-object v5, p3

    .line 823
    check-cast v5, Ljava/lang/String;

    .line 824
    .line 825
    :goto_7
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setClipPath(Landroid/view/View;Ljava/lang/String;)V

    .line 826
    .line 827
    .line 828
    goto/16 :goto_1c

    .line 829
    .line 830
    :pswitch_9
    instance-of p2, p3, Ljava/lang/String;

    .line 831
    .line 832
    if-eqz p2, :cond_38

    .line 833
    .line 834
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 835
    .line 836
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 837
    .line 838
    check-cast p3, Ljava/lang/String;

    .line 839
    .line 840
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setInlineSize(Landroid/view/View;Ljava/lang/String;)V

    .line 841
    .line 842
    .line 843
    goto/16 :goto_1c

    .line 844
    .line 845
    :cond_38
    instance-of p2, p3, Ljava/lang/Double;

    .line 846
    .line 847
    if-eqz p2, :cond_39

    .line 848
    .line 849
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 850
    .line 851
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 852
    .line 853
    check-cast p3, Ljava/lang/Double;

    .line 854
    .line 855
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setInlineSize(Landroid/view/View;Ljava/lang/Double;)V

    .line 856
    .line 857
    .line 858
    goto/16 :goto_1c

    .line 859
    .line 860
    :cond_39
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 861
    .line 862
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 863
    .line 864
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setInlineSize(Landroid/view/View;Ljava/lang/Double;)V

    .line 865
    .line 866
    .line 867
    goto/16 :goto_1c

    .line 868
    .line 869
    :pswitch_a
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 870
    .line 871
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 872
    .line 873
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 874
    .line 875
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setStrokeDasharray(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 876
    .line 877
    .line 878
    goto/16 :goto_1c

    .line 879
    .line 880
    :pswitch_b
    instance-of p2, p3, Ljava/lang/String;

    .line 881
    .line 882
    if-eqz p2, :cond_3a

    .line 883
    .line 884
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 885
    .line 886
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 887
    .line 888
    check-cast p3, Ljava/lang/String;

    .line 889
    .line 890
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setFontSize(Landroid/view/View;Ljava/lang/String;)V

    .line 891
    .line 892
    .line 893
    goto/16 :goto_1c

    .line 894
    .line 895
    :cond_3a
    instance-of p2, p3, Ljava/lang/Double;

    .line 896
    .line 897
    if-eqz p2, :cond_3b

    .line 898
    .line 899
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 900
    .line 901
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 902
    .line 903
    check-cast p3, Ljava/lang/Double;

    .line 904
    .line 905
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setFontSize(Landroid/view/View;Ljava/lang/Double;)V

    .line 906
    .line 907
    .line 908
    goto/16 :goto_1c

    .line 909
    .line 910
    :cond_3b
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 911
    .line 912
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 913
    .line 914
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setFontSize(Landroid/view/View;Ljava/lang/Double;)V

    .line 915
    .line 916
    .line 917
    goto/16 :goto_1c

    .line 918
    .line 919
    :pswitch_c
    instance-of p2, p3, Ljava/lang/String;

    .line 920
    .line 921
    if-eqz p2, :cond_3c

    .line 922
    .line 923
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 924
    .line 925
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 926
    .line 927
    check-cast p3, Ljava/lang/String;

    .line 928
    .line 929
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setBaselineShift(Landroid/view/View;Ljava/lang/String;)V

    .line 930
    .line 931
    .line 932
    goto/16 :goto_1c

    .line 933
    .line 934
    :cond_3c
    instance-of p2, p3, Ljava/lang/Double;

    .line 935
    .line 936
    if-eqz p2, :cond_3d

    .line 937
    .line 938
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 939
    .line 940
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 941
    .line 942
    check-cast p3, Ljava/lang/Double;

    .line 943
    .line 944
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setBaselineShift(Landroid/view/View;Ljava/lang/Double;)V

    .line 945
    .line 946
    .line 947
    goto/16 :goto_1c

    .line 948
    .line 949
    :cond_3d
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 950
    .line 951
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 952
    .line 953
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setBaselineShift(Landroid/view/View;Ljava/lang/Double;)V

    .line 954
    .line 955
    .line 956
    goto/16 :goto_1c

    .line 957
    .line 958
    :pswitch_d
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 959
    .line 960
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 961
    .line 962
    if-nez p3, :cond_3e

    .line 963
    .line 964
    goto :goto_8

    .line 965
    :cond_3e
    move-object v5, p3

    .line 966
    check-cast v5, Ljava/lang/String;

    .line 967
    .line 968
    :goto_8
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setMarkerStart(Landroid/view/View;Ljava/lang/String;)V

    .line 969
    .line 970
    .line 971
    goto/16 :goto_1c

    .line 972
    .line 973
    :pswitch_e
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 974
    .line 975
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 976
    .line 977
    if-nez p3, :cond_3f

    .line 978
    .line 979
    goto :goto_9

    .line 980
    :cond_3f
    check-cast p3, Ljava/lang/Double;

    .line 981
    .line 982
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 983
    .line 984
    .line 985
    move-result v2

    .line 986
    :goto_9
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setVectorEffect(Landroid/view/View;I)V

    .line 987
    .line 988
    .line 989
    goto/16 :goto_1c

    .line 990
    .line 991
    :pswitch_f
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 992
    .line 993
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 994
    .line 995
    if-nez p3, :cond_40

    .line 996
    .line 997
    goto :goto_a

    .line 998
    :cond_40
    check-cast p3, Ljava/lang/Double;

    .line 999
    .line 1000
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 1001
    .line 1002
    .line 1003
    move-result v0

    .line 1004
    :goto_a
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setStrokeMiterlimit(Landroid/view/View;F)V

    .line 1005
    .line 1006
    .line 1007
    goto/16 :goto_1c

    .line 1008
    .line 1009
    :pswitch_10
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1010
    .line 1011
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 1012
    .line 1013
    if-nez p3, :cond_41

    .line 1014
    .line 1015
    goto :goto_b

    .line 1016
    :cond_41
    move-object v5, p3

    .line 1017
    check-cast v5, Ljava/lang/String;

    .line 1018
    .line 1019
    :goto_b
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setSide(Landroid/view/View;Ljava/lang/String;)V

    .line 1020
    .line 1021
    .line 1022
    goto/16 :goto_1c

    .line 1023
    .line 1024
    :pswitch_11
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1025
    .line 1026
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 1027
    .line 1028
    if-nez p3, :cond_42

    .line 1029
    .line 1030
    goto :goto_c

    .line 1031
    :cond_42
    move-object v5, p3

    .line 1032
    check-cast v5, Ljava/lang/String;

    .line 1033
    .line 1034
    :goto_c
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setName(Landroid/view/View;Ljava/lang/String;)V

    .line 1035
    .line 1036
    .line 1037
    goto/16 :goto_1c

    .line 1038
    .line 1039
    :pswitch_12
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1040
    .line 1041
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 1042
    .line 1043
    if-nez p3, :cond_43

    .line 1044
    .line 1045
    goto :goto_d

    .line 1046
    :cond_43
    move-object v5, p3

    .line 1047
    check-cast v5, Ljava/lang/String;

    .line 1048
    .line 1049
    :goto_d
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setMask(Landroid/view/View;Ljava/lang/String;)V

    .line 1050
    .line 1051
    .line 1052
    goto/16 :goto_1c

    .line 1053
    .line 1054
    :pswitch_13
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1055
    .line 1056
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 1057
    .line 1058
    if-nez p3, :cond_44

    .line 1059
    .line 1060
    goto :goto_e

    .line 1061
    :cond_44
    move-object v5, p3

    .line 1062
    check-cast v5, Ljava/lang/String;

    .line 1063
    .line 1064
    :goto_e
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setHref(Landroid/view/View;Ljava/lang/String;)V

    .line 1065
    .line 1066
    .line 1067
    goto/16 :goto_1c

    .line 1068
    .line 1069
    :pswitch_14
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1070
    .line 1071
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 1072
    .line 1073
    check-cast p3, Lcom/facebook/react/bridge/ReadableMap;

    .line 1074
    .line 1075
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setFont(Landroid/view/View;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 1076
    .line 1077
    .line 1078
    goto/16 :goto_1c

    .line 1079
    .line 1080
    :pswitch_15
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1081
    .line 1082
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 1083
    .line 1084
    check-cast p3, Lcom/facebook/react/bridge/ReadableMap;

    .line 1085
    .line 1086
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setFill(Landroid/view/View;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 1087
    .line 1088
    .line 1089
    goto/16 :goto_1c

    .line 1090
    .line 1091
    :pswitch_16
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1092
    .line 1093
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 1094
    .line 1095
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 1096
    .line 1097
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setDy(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 1098
    .line 1099
    .line 1100
    goto/16 :goto_1c

    .line 1101
    .line 1102
    :pswitch_17
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1103
    .line 1104
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 1105
    .line 1106
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 1107
    .line 1108
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setDx(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 1109
    .line 1110
    .line 1111
    goto/16 :goto_1c

    .line 1112
    .line 1113
    :pswitch_18
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1114
    .line 1115
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 1116
    .line 1117
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 1118
    .line 1119
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setY(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 1120
    .line 1121
    .line 1122
    goto/16 :goto_1c

    .line 1123
    .line 1124
    :pswitch_19
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1125
    .line 1126
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 1127
    .line 1128
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 1129
    .line 1130
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setX(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 1131
    .line 1132
    .line 1133
    goto/16 :goto_1c

    .line 1134
    .line 1135
    :pswitch_1a
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1136
    .line 1137
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 1138
    .line 1139
    if-nez p3, :cond_45

    .line 1140
    .line 1141
    goto :goto_f

    .line 1142
    :cond_45
    check-cast p3, Ljava/lang/Double;

    .line 1143
    .line 1144
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 1145
    .line 1146
    .line 1147
    move-result v0

    .line 1148
    :goto_f
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setStrokeDashoffset(Landroid/view/View;F)V

    .line 1149
    .line 1150
    .line 1151
    goto/16 :goto_1c

    .line 1152
    .line 1153
    :pswitch_1b
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1154
    .line 1155
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 1156
    .line 1157
    if-nez p3, :cond_46

    .line 1158
    .line 1159
    goto :goto_10

    .line 1160
    :cond_46
    check-cast p3, Ljava/lang/Double;

    .line 1161
    .line 1162
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 1163
    .line 1164
    .line 1165
    move-result v4

    .line 1166
    :goto_10
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setFillOpacity(Landroid/view/View;F)V

    .line 1167
    .line 1168
    .line 1169
    goto/16 :goto_1c

    .line 1170
    .line 1171
    :pswitch_1c
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1172
    .line 1173
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 1174
    .line 1175
    if-nez p3, :cond_47

    .line 1176
    .line 1177
    goto :goto_11

    .line 1178
    :cond_47
    move-object v5, p3

    .line 1179
    check-cast v5, Ljava/lang/String;

    .line 1180
    .line 1181
    :goto_11
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setPointerEvents(Landroid/view/View;Ljava/lang/String;)V

    .line 1182
    .line 1183
    .line 1184
    goto/16 :goto_1c

    .line 1185
    .line 1186
    :pswitch_1d
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1187
    .line 1188
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 1189
    .line 1190
    if-nez p3, :cond_48

    .line 1191
    .line 1192
    goto :goto_12

    .line 1193
    :cond_48
    check-cast p3, Ljava/lang/Double;

    .line 1194
    .line 1195
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 1196
    .line 1197
    .line 1198
    move-result v4

    .line 1199
    :goto_12
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setStrokeOpacity(Landroid/view/View;F)V

    .line 1200
    .line 1201
    .line 1202
    goto/16 :goto_1c

    .line 1203
    .line 1204
    :pswitch_1e
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1205
    .line 1206
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 1207
    .line 1208
    if-nez p3, :cond_49

    .line 1209
    .line 1210
    goto :goto_13

    .line 1211
    :cond_49
    check-cast p3, Ljava/lang/Double;

    .line 1212
    .line 1213
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 1214
    .line 1215
    .line 1216
    move-result v1

    .line 1217
    :goto_13
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setFillRule(Landroid/view/View;I)V

    .line 1218
    .line 1219
    .line 1220
    goto/16 :goto_1c

    .line 1221
    .line 1222
    :pswitch_1f
    instance-of p2, p3, Ljava/lang/String;

    .line 1223
    .line 1224
    if-eqz p2, :cond_4a

    .line 1225
    .line 1226
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1227
    .line 1228
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 1229
    .line 1230
    check-cast p3, Ljava/lang/String;

    .line 1231
    .line 1232
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setFontWeight(Landroid/view/View;Ljava/lang/String;)V

    .line 1233
    .line 1234
    .line 1235
    goto/16 :goto_1c

    .line 1236
    .line 1237
    :cond_4a
    instance-of p2, p3, Ljava/lang/Double;

    .line 1238
    .line 1239
    if-eqz p2, :cond_4b

    .line 1240
    .line 1241
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1242
    .line 1243
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 1244
    .line 1245
    check-cast p3, Ljava/lang/Double;

    .line 1246
    .line 1247
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setFontWeight(Landroid/view/View;Ljava/lang/Double;)V

    .line 1248
    .line 1249
    .line 1250
    goto/16 :goto_1c

    .line 1251
    .line 1252
    :cond_4b
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1253
    .line 1254
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 1255
    .line 1256
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setFontWeight(Landroid/view/View;Ljava/lang/Double;)V

    .line 1257
    .line 1258
    .line 1259
    goto/16 :goto_1c

    .line 1260
    .line 1261
    :pswitch_20
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1262
    .line 1263
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 1264
    .line 1265
    check-cast p3, Lcom/facebook/react/bridge/ReadableMap;

    .line 1266
    .line 1267
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setStroke(Landroid/view/View;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 1268
    .line 1269
    .line 1270
    goto/16 :goto_1c

    .line 1271
    .line 1272
    :pswitch_21
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1273
    .line 1274
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 1275
    .line 1276
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 1277
    .line 1278
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setRotate(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 1279
    .line 1280
    .line 1281
    goto/16 :goto_1c

    .line 1282
    .line 1283
    :pswitch_22
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1284
    .line 1285
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 1286
    .line 1287
    if-nez p3, :cond_4c

    .line 1288
    .line 1289
    goto :goto_14

    .line 1290
    :cond_4c
    move-object v5, p3

    .line 1291
    check-cast v5, Ljava/lang/String;

    .line 1292
    .line 1293
    :goto_14
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setMarkerMid(Landroid/view/View;Ljava/lang/String;)V

    .line 1294
    .line 1295
    .line 1296
    goto/16 :goto_1c

    .line 1297
    .line 1298
    :pswitch_23
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1299
    .line 1300
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 1301
    .line 1302
    if-nez p3, :cond_4d

    .line 1303
    .line 1304
    goto :goto_15

    .line 1305
    :cond_4d
    move-object v5, p3

    .line 1306
    check-cast v5, Ljava/lang/String;

    .line 1307
    .line 1308
    :goto_15
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setMarkerEnd(Landroid/view/View;Ljava/lang/String;)V

    .line 1309
    .line 1310
    .line 1311
    goto/16 :goto_1c

    .line 1312
    .line 1313
    :pswitch_24
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1314
    .line 1315
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 1316
    .line 1317
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 1318
    .line 1319
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setPropList(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 1320
    .line 1321
    .line 1322
    goto/16 :goto_1c

    .line 1323
    .line 1324
    :pswitch_25
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1325
    .line 1326
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 1327
    .line 1328
    if-nez p3, :cond_4e

    .line 1329
    .line 1330
    goto :goto_16

    .line 1331
    :cond_4e
    move-object v5, p3

    .line 1332
    check-cast v5, Ljava/lang/String;

    .line 1333
    .line 1334
    :goto_16
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setMethod(Landroid/view/View;Ljava/lang/String;)V

    .line 1335
    .line 1336
    .line 1337
    goto/16 :goto_1c

    .line 1338
    .line 1339
    :pswitch_26
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1340
    .line 1341
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 1342
    .line 1343
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 1344
    .line 1345
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setMatrix(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 1346
    .line 1347
    .line 1348
    goto/16 :goto_1c

    .line 1349
    .line 1350
    :pswitch_27
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1351
    .line 1352
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 1353
    .line 1354
    if-nez p3, :cond_4f

    .line 1355
    .line 1356
    goto :goto_17

    .line 1357
    :cond_4f
    move-object v5, p3

    .line 1358
    check-cast v5, Ljava/lang/String;

    .line 1359
    .line 1360
    :goto_17
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setVerticalAlign(Landroid/view/View;Ljava/lang/String;)V

    .line 1361
    .line 1362
    .line 1363
    goto :goto_1c

    .line 1364
    :pswitch_28
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1365
    .line 1366
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 1367
    .line 1368
    if-nez p3, :cond_50

    .line 1369
    .line 1370
    goto :goto_18

    .line 1371
    :cond_50
    move-object v5, p3

    .line 1372
    check-cast v5, Ljava/lang/String;

    .line 1373
    .line 1374
    :goto_18
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setAlignmentBaseline(Landroid/view/View;Ljava/lang/String;)V

    .line 1375
    .line 1376
    .line 1377
    goto :goto_1c

    .line 1378
    :pswitch_29
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1379
    .line 1380
    if-nez p3, :cond_51

    .line 1381
    .line 1382
    goto :goto_19

    .line 1383
    :cond_51
    check-cast p3, Ljava/lang/Double;

    .line 1384
    .line 1385
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 1386
    .line 1387
    .line 1388
    move-result v4

    .line 1389
    :goto_19
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/uimanager/BaseViewManagerInterface;->setOpacity(Landroid/view/View;F)V

    .line 1390
    .line 1391
    .line 1392
    goto :goto_1c

    .line 1393
    :pswitch_2a
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1394
    .line 1395
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 1396
    .line 1397
    if-nez p3, :cond_52

    .line 1398
    .line 1399
    goto :goto_1a

    .line 1400
    :cond_52
    move-object v5, p3

    .line 1401
    check-cast v5, Ljava/lang/String;

    .line 1402
    .line 1403
    :goto_1a
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setLengthAdjust(Landroid/view/View;Ljava/lang/String;)V

    .line 1404
    .line 1405
    .line 1406
    goto :goto_1c

    .line 1407
    :pswitch_2b
    instance-of p2, p3, Ljava/lang/String;

    .line 1408
    .line 1409
    if-eqz p2, :cond_53

    .line 1410
    .line 1411
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1412
    .line 1413
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 1414
    .line 1415
    check-cast p3, Ljava/lang/String;

    .line 1416
    .line 1417
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setStartOffset(Landroid/view/View;Ljava/lang/String;)V

    .line 1418
    .line 1419
    .line 1420
    goto :goto_1c

    .line 1421
    :cond_53
    instance-of p2, p3, Ljava/lang/Double;

    .line 1422
    .line 1423
    if-eqz p2, :cond_54

    .line 1424
    .line 1425
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1426
    .line 1427
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 1428
    .line 1429
    check-cast p3, Ljava/lang/Double;

    .line 1430
    .line 1431
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setStartOffset(Landroid/view/View;Ljava/lang/Double;)V

    .line 1432
    .line 1433
    .line 1434
    goto :goto_1c

    .line 1435
    :cond_54
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1436
    .line 1437
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 1438
    .line 1439
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setStartOffset(Landroid/view/View;Ljava/lang/Double;)V

    .line 1440
    .line 1441
    .line 1442
    goto :goto_1c

    .line 1443
    :pswitch_2c
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1444
    .line 1445
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 1446
    .line 1447
    if-nez p3, :cond_55

    .line 1448
    .line 1449
    goto :goto_1b

    .line 1450
    :cond_55
    move-object v5, p3

    .line 1451
    check-cast v5, Ljava/lang/String;

    .line 1452
    .line 1453
    :goto_1b
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setSpacing(Landroid/view/View;Ljava/lang/String;)V

    .line 1454
    .line 1455
    .line 1456
    :goto_1c
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x77ef1bbd -> :sswitch_2c
        -0x76d93c6b -> :sswitch_2b
        -0x5f8de5eb -> :sswitch_2a
        -0x4b8807f5 -> :sswitch_29
        -0x45d9a6b8 -> :sswitch_28
        -0x43f186d1 -> :sswitch_27
        -0x4072683f -> :sswitch_26
        -0x403a2f1f -> :sswitch_25
        -0x3b3da15f -> :sswitch_24
        -0x37a9a5bf -> :sswitch_23
        -0x37a98852 -> :sswitch_22
        -0x372522a5 -> :sswitch_21
        -0x352a89c8 -> :sswitch_20
        -0x2bc67c59 -> :sswitch_1f
        -0x2b7578e1 -> :sswitch_1e
        -0x18d3d54d -> :sswitch_1d
        -0x117e564a -> :sswitch_1c
        -0x3330ef8 -> :sswitch_1b
        -0x2a83503 -> :sswitch_1a
        0x78 -> :sswitch_19
        0x79 -> :sswitch_18
        0xc94 -> :sswitch_17
        0xc95 -> :sswitch_16
        0x2ff583 -> :sswitch_15
        0x300c4f -> :sswitch_14
        0x30ff2b -> :sswitch_13
        0x3306ec -> :sswitch_12
        0x337a8b -> :sswitch_11
        0x35dd57 -> :sswitch_10
        0x4b3162e -> :sswitch_f
        0x63a48b4 -> :sswitch_e
        0xcf0d448 -> :sswitch_d
        0x1071b93d -> :sswitch_c
        0x15caa0f0 -> :sswitch_b
        0x17f096af -> :sswitch_a
        0x2e60023a -> :sswitch_9
        0x36b25395 -> :sswitch_8
        0x36b3866c -> :sswitch_7
        0x3d3f8e06 -> :sswitch_6
        0x3ed9665c -> :sswitch_5
        0x619a1673 -> :sswitch_4
        0x63a518c2 -> :sswitch_3
        0x6ab59576 -> :sswitch_2
        0x6e2146f6 -> :sswitch_1
        0x72aeea6e -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
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
