.class public Lcom/facebook/react/viewmanagers/RNSVGTextManagerDelegate;
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
        "Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface<",
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
    const/16 v3, 0x26

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
    const/16 v3, 0x25

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
    const/16 v3, 0x24

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
    const/16 v3, 0x23

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
    const/16 v3, 0x22

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
    const/16 v3, 0x21

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
    const/16 v3, 0x20

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
    const/16 v3, 0x1f

    .line 125
    .line 126
    goto/16 :goto_0

    .line 127
    .line 128
    :sswitch_8
    const-string v0, "inlineSize"

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
    const/16 v3, 0x1e

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
    const/16 v3, 0x1d

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
    const/16 v3, 0x1c

    .line 167
    .line 168
    goto/16 :goto_0

    .line 169
    .line 170
    :sswitch_b
    const-string v0, "baselineShift"

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
    const/16 v3, 0x1b

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
    const/16 v3, 0x1a

    .line 195
    .line 196
    goto/16 :goto_0

    .line 197
    .line 198
    :sswitch_d
    const-string v0, "vectorEffect"

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
    const/16 v3, 0x19

    .line 209
    .line 210
    goto/16 :goto_0

    .line 211
    .line 212
    :sswitch_e
    const-string v0, "strokeMiterlimit"

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
    const/16 v3, 0x18

    .line 223
    .line 224
    goto/16 :goto_0

    .line 225
    .line 226
    :sswitch_f
    const-string v0, "name"

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
    const/16 v3, 0x17

    .line 237
    .line 238
    goto/16 :goto_0

    .line 239
    .line 240
    :sswitch_10
    const-string v0, "mask"

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
    const/16 v3, 0x16

    .line 251
    .line 252
    goto/16 :goto_0

    .line 253
    .line 254
    :sswitch_11
    const-string v0, "font"

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
    const/16 v3, 0x15

    .line 265
    .line 266
    goto/16 :goto_0

    .line 267
    .line 268
    :sswitch_12
    const-string v0, "fill"

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
    const/16 v3, 0x14

    .line 279
    .line 280
    goto/16 :goto_0

    .line 281
    .line 282
    :sswitch_13
    const-string v0, "dy"

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
    const/16 v3, 0x13

    .line 293
    .line 294
    goto/16 :goto_0

    .line 295
    .line 296
    :sswitch_14
    const-string v0, "dx"

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
    const/16 v3, 0x12

    .line 307
    .line 308
    goto/16 :goto_0

    .line 309
    .line 310
    :sswitch_15
    const-string v0, "y"

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
    const/16 v3, 0x11

    .line 321
    .line 322
    goto/16 :goto_0

    .line 323
    .line 324
    :sswitch_16
    const-string v0, "x"

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
    const/16 v3, 0x10

    .line 335
    .line 336
    goto/16 :goto_0

    .line 337
    .line 338
    :sswitch_17
    const-string v0, "strokeDashoffset"

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
    const/16 v3, 0xf

    .line 349
    .line 350
    goto/16 :goto_0

    .line 351
    .line 352
    :sswitch_18
    const-string v0, "fillOpacity"

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
    const/16 v3, 0xe

    .line 363
    .line 364
    goto/16 :goto_0

    .line 365
    .line 366
    :sswitch_19
    const-string v0, "pointerEvents"

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
    const/16 v3, 0xd

    .line 377
    .line 378
    goto/16 :goto_0

    .line 379
    .line 380
    :sswitch_1a
    const-string v0, "strokeOpacity"

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
    const/16 v3, 0xc

    .line 391
    .line 392
    goto/16 :goto_0

    .line 393
    .line 394
    :sswitch_1b
    const-string v0, "fillRule"

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
    const/16 v3, 0xb

    .line 405
    .line 406
    goto/16 :goto_0

    .line 407
    .line 408
    :sswitch_1c
    const-string v0, "fontWeight"

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
    const/16 v3, 0xa

    .line 419
    .line 420
    goto/16 :goto_0

    .line 421
    .line 422
    :sswitch_1d
    const-string v0, "stroke"

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
    const/16 v3, 0x9

    .line 433
    .line 434
    goto/16 :goto_0

    .line 435
    .line 436
    :sswitch_1e
    const-string v0, "rotate"

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
    const/16 v3, 0x8

    .line 447
    .line 448
    goto/16 :goto_0

    .line 449
    .line 450
    :sswitch_1f
    const-string v0, "markerMid"

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
    goto :goto_0

    .line 459
    :cond_1f
    const/4 v3, 0x7

    .line 460
    goto :goto_0

    .line 461
    :sswitch_20
    const-string v0, "markerEnd"

    .line 462
    .line 463
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 464
    .line 465
    .line 466
    move-result v0

    .line 467
    if-nez v0, :cond_20

    .line 468
    .line 469
    goto :goto_0

    .line 470
    :cond_20
    const/4 v3, 0x6

    .line 471
    goto :goto_0

    .line 472
    :sswitch_21
    const-string v0, "propList"

    .line 473
    .line 474
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 475
    .line 476
    .line 477
    move-result v0

    .line 478
    if-nez v0, :cond_21

    .line 479
    .line 480
    goto :goto_0

    .line 481
    :cond_21
    const/4 v3, 0x5

    .line 482
    goto :goto_0

    .line 483
    :sswitch_22
    const-string v0, "matrix"

    .line 484
    .line 485
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 486
    .line 487
    .line 488
    move-result v0

    .line 489
    if-nez v0, :cond_22

    .line 490
    .line 491
    goto :goto_0

    .line 492
    :cond_22
    const/4 v3, 0x4

    .line 493
    goto :goto_0

    .line 494
    :sswitch_23
    const-string v0, "verticalAlign"

    .line 495
    .line 496
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 497
    .line 498
    .line 499
    move-result v0

    .line 500
    if-nez v0, :cond_23

    .line 501
    .line 502
    goto :goto_0

    .line 503
    :cond_23
    const/4 v3, 0x3

    .line 504
    goto :goto_0

    .line 505
    :sswitch_24
    const-string v0, "alignmentBaseline"

    .line 506
    .line 507
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 508
    .line 509
    .line 510
    move-result v0

    .line 511
    if-nez v0, :cond_24

    .line 512
    .line 513
    goto :goto_0

    .line 514
    :cond_24
    const/4 v3, 0x2

    .line 515
    goto :goto_0

    .line 516
    :sswitch_25
    const-string v0, "opacity"

    .line 517
    .line 518
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 519
    .line 520
    .line 521
    move-result v0

    .line 522
    if-nez v0, :cond_25

    .line 523
    .line 524
    goto :goto_0

    .line 525
    :cond_25
    move v3, v1

    .line 526
    goto :goto_0

    .line 527
    :sswitch_26
    const-string v0, "lengthAdjust"

    .line 528
    .line 529
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 530
    .line 531
    .line 532
    move-result v0

    .line 533
    if-nez v0, :cond_26

    .line 534
    .line 535
    goto :goto_0

    .line 536
    :cond_26
    move v3, v2

    .line 537
    :goto_0
    const/4 v0, 0x0

    .line 538
    const/high16 v4, 0x3f800000    # 1.0f

    .line 539
    .line 540
    const/4 v5, 0x0

    .line 541
    packed-switch v3, :pswitch_data_0

    .line 542
    .line 543
    .line 544
    invoke-super {p0, p1, p2, p3}, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->setProperty(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V

    .line 545
    .line 546
    .line 547
    goto/16 :goto_17

    .line 548
    .line 549
    :pswitch_0
    instance-of p2, p3, Ljava/lang/String;

    .line 550
    .line 551
    if-eqz p2, :cond_27

    .line 552
    .line 553
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 554
    .line 555
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;

    .line 556
    .line 557
    check-cast p3, Ljava/lang/String;

    .line 558
    .line 559
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;->setStrokeWidth(Landroid/view/View;Ljava/lang/String;)V

    .line 560
    .line 561
    .line 562
    goto/16 :goto_17

    .line 563
    .line 564
    :cond_27
    instance-of p2, p3, Ljava/lang/Double;

    .line 565
    .line 566
    if-eqz p2, :cond_28

    .line 567
    .line 568
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 569
    .line 570
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;

    .line 571
    .line 572
    check-cast p3, Ljava/lang/Double;

    .line 573
    .line 574
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;->setStrokeWidth(Landroid/view/View;Ljava/lang/Double;)V

    .line 575
    .line 576
    .line 577
    goto/16 :goto_17

    .line 578
    .line 579
    :cond_28
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 580
    .line 581
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;

    .line 582
    .line 583
    const-string p3, "1"

    .line 584
    .line 585
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;->setStrokeWidth(Landroid/view/View;Ljava/lang/String;)V

    .line 586
    .line 587
    .line 588
    goto/16 :goto_17

    .line 589
    .line 590
    :pswitch_1
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 591
    .line 592
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;

    .line 593
    .line 594
    if-nez p3, :cond_29

    .line 595
    .line 596
    goto :goto_1

    .line 597
    :cond_29
    check-cast p3, Ljava/lang/Boolean;

    .line 598
    .line 599
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 600
    .line 601
    .line 602
    move-result v2

    .line 603
    :goto_1
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;->setResponsible(Landroid/view/View;Z)V

    .line 604
    .line 605
    .line 606
    goto/16 :goto_17

    .line 607
    .line 608
    :pswitch_2
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 609
    .line 610
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;

    .line 611
    .line 612
    if-nez p3, :cond_2a

    .line 613
    .line 614
    goto :goto_2

    .line 615
    :cond_2a
    check-cast p3, Ljava/lang/Double;

    .line 616
    .line 617
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 618
    .line 619
    .line 620
    move-result v2

    .line 621
    :goto_2
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;->setStrokeLinejoin(Landroid/view/View;I)V

    .line 622
    .line 623
    .line 624
    goto/16 :goto_17

    .line 625
    .line 626
    :pswitch_3
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 627
    .line 628
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;

    .line 629
    .line 630
    if-nez p3, :cond_2b

    .line 631
    .line 632
    goto :goto_3

    .line 633
    :cond_2b
    move-object v5, p3

    .line 634
    check-cast v5, Ljava/lang/String;

    .line 635
    .line 636
    :goto_3
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;->setDisplay(Landroid/view/View;Ljava/lang/String;)V

    .line 637
    .line 638
    .line 639
    goto/16 :goto_17

    .line 640
    .line 641
    :pswitch_4
    instance-of p2, p3, Ljava/lang/String;

    .line 642
    .line 643
    if-eqz p2, :cond_2c

    .line 644
    .line 645
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 646
    .line 647
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;

    .line 648
    .line 649
    check-cast p3, Ljava/lang/String;

    .line 650
    .line 651
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;->setTextLength(Landroid/view/View;Ljava/lang/String;)V

    .line 652
    .line 653
    .line 654
    goto/16 :goto_17

    .line 655
    .line 656
    :cond_2c
    instance-of p2, p3, Ljava/lang/Double;

    .line 657
    .line 658
    if-eqz p2, :cond_2d

    .line 659
    .line 660
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 661
    .line 662
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;

    .line 663
    .line 664
    check-cast p3, Ljava/lang/Double;

    .line 665
    .line 666
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;->setTextLength(Landroid/view/View;Ljava/lang/Double;)V

    .line 667
    .line 668
    .line 669
    goto/16 :goto_17

    .line 670
    .line 671
    :cond_2d
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 672
    .line 673
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;

    .line 674
    .line 675
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;->setTextLength(Landroid/view/View;Ljava/lang/Double;)V

    .line 676
    .line 677
    .line 678
    goto/16 :goto_17

    .line 679
    .line 680
    :pswitch_5
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 681
    .line 682
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;

    .line 683
    .line 684
    if-nez p3, :cond_2e

    .line 685
    .line 686
    goto :goto_4

    .line 687
    :cond_2e
    check-cast p3, Ljava/lang/Double;

    .line 688
    .line 689
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 690
    .line 691
    .line 692
    move-result v2

    .line 693
    :goto_4
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;->setStrokeLinecap(Landroid/view/View;I)V

    .line 694
    .line 695
    .line 696
    goto/16 :goto_17

    .line 697
    .line 698
    :pswitch_6
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 699
    .line 700
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;

    .line 701
    .line 702
    if-nez p3, :cond_2f

    .line 703
    .line 704
    goto :goto_5

    .line 705
    :cond_2f
    check-cast p3, Ljava/lang/Double;

    .line 706
    .line 707
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 708
    .line 709
    .line 710
    move-result v2

    .line 711
    :goto_5
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;->setClipRule(Landroid/view/View;I)V

    .line 712
    .line 713
    .line 714
    goto/16 :goto_17

    .line 715
    .line 716
    :pswitch_7
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 717
    .line 718
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;

    .line 719
    .line 720
    if-nez p3, :cond_30

    .line 721
    .line 722
    goto :goto_6

    .line 723
    :cond_30
    move-object v5, p3

    .line 724
    check-cast v5, Ljava/lang/String;

    .line 725
    .line 726
    :goto_6
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;->setClipPath(Landroid/view/View;Ljava/lang/String;)V

    .line 727
    .line 728
    .line 729
    goto/16 :goto_17

    .line 730
    .line 731
    :pswitch_8
    instance-of p2, p3, Ljava/lang/String;

    .line 732
    .line 733
    if-eqz p2, :cond_31

    .line 734
    .line 735
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 736
    .line 737
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;

    .line 738
    .line 739
    check-cast p3, Ljava/lang/String;

    .line 740
    .line 741
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;->setInlineSize(Landroid/view/View;Ljava/lang/String;)V

    .line 742
    .line 743
    .line 744
    goto/16 :goto_17

    .line 745
    .line 746
    :cond_31
    instance-of p2, p3, Ljava/lang/Double;

    .line 747
    .line 748
    if-eqz p2, :cond_32

    .line 749
    .line 750
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 751
    .line 752
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;

    .line 753
    .line 754
    check-cast p3, Ljava/lang/Double;

    .line 755
    .line 756
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;->setInlineSize(Landroid/view/View;Ljava/lang/Double;)V

    .line 757
    .line 758
    .line 759
    goto/16 :goto_17

    .line 760
    .line 761
    :cond_32
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 762
    .line 763
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;

    .line 764
    .line 765
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;->setInlineSize(Landroid/view/View;Ljava/lang/Double;)V

    .line 766
    .line 767
    .line 768
    goto/16 :goto_17

    .line 769
    .line 770
    :pswitch_9
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 771
    .line 772
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;

    .line 773
    .line 774
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 775
    .line 776
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;->setStrokeDasharray(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 777
    .line 778
    .line 779
    goto/16 :goto_17

    .line 780
    .line 781
    :pswitch_a
    instance-of p2, p3, Ljava/lang/String;

    .line 782
    .line 783
    if-eqz p2, :cond_33

    .line 784
    .line 785
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 786
    .line 787
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;

    .line 788
    .line 789
    check-cast p3, Ljava/lang/String;

    .line 790
    .line 791
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;->setFontSize(Landroid/view/View;Ljava/lang/String;)V

    .line 792
    .line 793
    .line 794
    goto/16 :goto_17

    .line 795
    .line 796
    :cond_33
    instance-of p2, p3, Ljava/lang/Double;

    .line 797
    .line 798
    if-eqz p2, :cond_34

    .line 799
    .line 800
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 801
    .line 802
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;

    .line 803
    .line 804
    check-cast p3, Ljava/lang/Double;

    .line 805
    .line 806
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;->setFontSize(Landroid/view/View;Ljava/lang/Double;)V

    .line 807
    .line 808
    .line 809
    goto/16 :goto_17

    .line 810
    .line 811
    :cond_34
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 812
    .line 813
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;

    .line 814
    .line 815
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;->setFontSize(Landroid/view/View;Ljava/lang/Double;)V

    .line 816
    .line 817
    .line 818
    goto/16 :goto_17

    .line 819
    .line 820
    :pswitch_b
    instance-of p2, p3, Ljava/lang/String;

    .line 821
    .line 822
    if-eqz p2, :cond_35

    .line 823
    .line 824
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 825
    .line 826
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;

    .line 827
    .line 828
    check-cast p3, Ljava/lang/String;

    .line 829
    .line 830
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;->setBaselineShift(Landroid/view/View;Ljava/lang/String;)V

    .line 831
    .line 832
    .line 833
    goto/16 :goto_17

    .line 834
    .line 835
    :cond_35
    instance-of p2, p3, Ljava/lang/Double;

    .line 836
    .line 837
    if-eqz p2, :cond_36

    .line 838
    .line 839
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 840
    .line 841
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;

    .line 842
    .line 843
    check-cast p3, Ljava/lang/Double;

    .line 844
    .line 845
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;->setBaselineShift(Landroid/view/View;Ljava/lang/Double;)V

    .line 846
    .line 847
    .line 848
    goto/16 :goto_17

    .line 849
    .line 850
    :cond_36
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 851
    .line 852
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;

    .line 853
    .line 854
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;->setBaselineShift(Landroid/view/View;Ljava/lang/Double;)V

    .line 855
    .line 856
    .line 857
    goto/16 :goto_17

    .line 858
    .line 859
    :pswitch_c
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 860
    .line 861
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;

    .line 862
    .line 863
    if-nez p3, :cond_37

    .line 864
    .line 865
    goto :goto_7

    .line 866
    :cond_37
    move-object v5, p3

    .line 867
    check-cast v5, Ljava/lang/String;

    .line 868
    .line 869
    :goto_7
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;->setMarkerStart(Landroid/view/View;Ljava/lang/String;)V

    .line 870
    .line 871
    .line 872
    goto/16 :goto_17

    .line 873
    .line 874
    :pswitch_d
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 875
    .line 876
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;

    .line 877
    .line 878
    if-nez p3, :cond_38

    .line 879
    .line 880
    goto :goto_8

    .line 881
    :cond_38
    check-cast p3, Ljava/lang/Double;

    .line 882
    .line 883
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 884
    .line 885
    .line 886
    move-result v2

    .line 887
    :goto_8
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;->setVectorEffect(Landroid/view/View;I)V

    .line 888
    .line 889
    .line 890
    goto/16 :goto_17

    .line 891
    .line 892
    :pswitch_e
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 893
    .line 894
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;

    .line 895
    .line 896
    if-nez p3, :cond_39

    .line 897
    .line 898
    goto :goto_9

    .line 899
    :cond_39
    check-cast p3, Ljava/lang/Double;

    .line 900
    .line 901
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 902
    .line 903
    .line 904
    move-result v0

    .line 905
    :goto_9
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;->setStrokeMiterlimit(Landroid/view/View;F)V

    .line 906
    .line 907
    .line 908
    goto/16 :goto_17

    .line 909
    .line 910
    :pswitch_f
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 911
    .line 912
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;

    .line 913
    .line 914
    if-nez p3, :cond_3a

    .line 915
    .line 916
    goto :goto_a

    .line 917
    :cond_3a
    move-object v5, p3

    .line 918
    check-cast v5, Ljava/lang/String;

    .line 919
    .line 920
    :goto_a
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;->setName(Landroid/view/View;Ljava/lang/String;)V

    .line 921
    .line 922
    .line 923
    goto/16 :goto_17

    .line 924
    .line 925
    :pswitch_10
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 926
    .line 927
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;

    .line 928
    .line 929
    if-nez p3, :cond_3b

    .line 930
    .line 931
    goto :goto_b

    .line 932
    :cond_3b
    move-object v5, p3

    .line 933
    check-cast v5, Ljava/lang/String;

    .line 934
    .line 935
    :goto_b
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;->setMask(Landroid/view/View;Ljava/lang/String;)V

    .line 936
    .line 937
    .line 938
    goto/16 :goto_17

    .line 939
    .line 940
    :pswitch_11
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 941
    .line 942
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;

    .line 943
    .line 944
    check-cast p3, Lcom/facebook/react/bridge/ReadableMap;

    .line 945
    .line 946
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;->setFont(Landroid/view/View;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 947
    .line 948
    .line 949
    goto/16 :goto_17

    .line 950
    .line 951
    :pswitch_12
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 952
    .line 953
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;

    .line 954
    .line 955
    check-cast p3, Lcom/facebook/react/bridge/ReadableMap;

    .line 956
    .line 957
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;->setFill(Landroid/view/View;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 958
    .line 959
    .line 960
    goto/16 :goto_17

    .line 961
    .line 962
    :pswitch_13
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 963
    .line 964
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;

    .line 965
    .line 966
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 967
    .line 968
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;->setDy(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 969
    .line 970
    .line 971
    goto/16 :goto_17

    .line 972
    .line 973
    :pswitch_14
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 974
    .line 975
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;

    .line 976
    .line 977
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 978
    .line 979
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;->setDx(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 980
    .line 981
    .line 982
    goto/16 :goto_17

    .line 983
    .line 984
    :pswitch_15
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 985
    .line 986
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;

    .line 987
    .line 988
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 989
    .line 990
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;->setY(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 991
    .line 992
    .line 993
    goto/16 :goto_17

    .line 994
    .line 995
    :pswitch_16
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 996
    .line 997
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;

    .line 998
    .line 999
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 1000
    .line 1001
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;->setX(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 1002
    .line 1003
    .line 1004
    goto/16 :goto_17

    .line 1005
    .line 1006
    :pswitch_17
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1007
    .line 1008
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;

    .line 1009
    .line 1010
    if-nez p3, :cond_3c

    .line 1011
    .line 1012
    goto :goto_c

    .line 1013
    :cond_3c
    check-cast p3, Ljava/lang/Double;

    .line 1014
    .line 1015
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 1016
    .line 1017
    .line 1018
    move-result v0

    .line 1019
    :goto_c
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;->setStrokeDashoffset(Landroid/view/View;F)V

    .line 1020
    .line 1021
    .line 1022
    goto/16 :goto_17

    .line 1023
    .line 1024
    :pswitch_18
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1025
    .line 1026
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;

    .line 1027
    .line 1028
    if-nez p3, :cond_3d

    .line 1029
    .line 1030
    goto :goto_d

    .line 1031
    :cond_3d
    check-cast p3, Ljava/lang/Double;

    .line 1032
    .line 1033
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 1034
    .line 1035
    .line 1036
    move-result v4

    .line 1037
    :goto_d
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;->setFillOpacity(Landroid/view/View;F)V

    .line 1038
    .line 1039
    .line 1040
    goto/16 :goto_17

    .line 1041
    .line 1042
    :pswitch_19
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1043
    .line 1044
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;

    .line 1045
    .line 1046
    if-nez p3, :cond_3e

    .line 1047
    .line 1048
    goto :goto_e

    .line 1049
    :cond_3e
    move-object v5, p3

    .line 1050
    check-cast v5, Ljava/lang/String;

    .line 1051
    .line 1052
    :goto_e
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;->setPointerEvents(Landroid/view/View;Ljava/lang/String;)V

    .line 1053
    .line 1054
    .line 1055
    goto/16 :goto_17

    .line 1056
    .line 1057
    :pswitch_1a
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1058
    .line 1059
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;

    .line 1060
    .line 1061
    if-nez p3, :cond_3f

    .line 1062
    .line 1063
    goto :goto_f

    .line 1064
    :cond_3f
    check-cast p3, Ljava/lang/Double;

    .line 1065
    .line 1066
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 1067
    .line 1068
    .line 1069
    move-result v4

    .line 1070
    :goto_f
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;->setStrokeOpacity(Landroid/view/View;F)V

    .line 1071
    .line 1072
    .line 1073
    goto/16 :goto_17

    .line 1074
    .line 1075
    :pswitch_1b
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1076
    .line 1077
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;

    .line 1078
    .line 1079
    if-nez p3, :cond_40

    .line 1080
    .line 1081
    goto :goto_10

    .line 1082
    :cond_40
    check-cast p3, Ljava/lang/Double;

    .line 1083
    .line 1084
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 1085
    .line 1086
    .line 1087
    move-result v1

    .line 1088
    :goto_10
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;->setFillRule(Landroid/view/View;I)V

    .line 1089
    .line 1090
    .line 1091
    goto/16 :goto_17

    .line 1092
    .line 1093
    :pswitch_1c
    instance-of p2, p3, Ljava/lang/String;

    .line 1094
    .line 1095
    if-eqz p2, :cond_41

    .line 1096
    .line 1097
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1098
    .line 1099
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;

    .line 1100
    .line 1101
    check-cast p3, Ljava/lang/String;

    .line 1102
    .line 1103
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;->setFontWeight(Landroid/view/View;Ljava/lang/String;)V

    .line 1104
    .line 1105
    .line 1106
    goto/16 :goto_17

    .line 1107
    .line 1108
    :cond_41
    instance-of p2, p3, Ljava/lang/Double;

    .line 1109
    .line 1110
    if-eqz p2, :cond_42

    .line 1111
    .line 1112
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1113
    .line 1114
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;

    .line 1115
    .line 1116
    check-cast p3, Ljava/lang/Double;

    .line 1117
    .line 1118
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;->setFontWeight(Landroid/view/View;Ljava/lang/Double;)V

    .line 1119
    .line 1120
    .line 1121
    goto/16 :goto_17

    .line 1122
    .line 1123
    :cond_42
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1124
    .line 1125
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;

    .line 1126
    .line 1127
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;->setFontWeight(Landroid/view/View;Ljava/lang/Double;)V

    .line 1128
    .line 1129
    .line 1130
    goto/16 :goto_17

    .line 1131
    .line 1132
    :pswitch_1d
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1133
    .line 1134
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;

    .line 1135
    .line 1136
    check-cast p3, Lcom/facebook/react/bridge/ReadableMap;

    .line 1137
    .line 1138
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;->setStroke(Landroid/view/View;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 1139
    .line 1140
    .line 1141
    goto/16 :goto_17

    .line 1142
    .line 1143
    :pswitch_1e
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1144
    .line 1145
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;

    .line 1146
    .line 1147
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 1148
    .line 1149
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;->setRotate(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 1150
    .line 1151
    .line 1152
    goto/16 :goto_17

    .line 1153
    .line 1154
    :pswitch_1f
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1155
    .line 1156
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;

    .line 1157
    .line 1158
    if-nez p3, :cond_43

    .line 1159
    .line 1160
    goto :goto_11

    .line 1161
    :cond_43
    move-object v5, p3

    .line 1162
    check-cast v5, Ljava/lang/String;

    .line 1163
    .line 1164
    :goto_11
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;->setMarkerMid(Landroid/view/View;Ljava/lang/String;)V

    .line 1165
    .line 1166
    .line 1167
    goto :goto_17

    .line 1168
    :pswitch_20
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1169
    .line 1170
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;

    .line 1171
    .line 1172
    if-nez p3, :cond_44

    .line 1173
    .line 1174
    goto :goto_12

    .line 1175
    :cond_44
    move-object v5, p3

    .line 1176
    check-cast v5, Ljava/lang/String;

    .line 1177
    .line 1178
    :goto_12
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;->setMarkerEnd(Landroid/view/View;Ljava/lang/String;)V

    .line 1179
    .line 1180
    .line 1181
    goto :goto_17

    .line 1182
    :pswitch_21
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1183
    .line 1184
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;

    .line 1185
    .line 1186
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 1187
    .line 1188
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;->setPropList(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 1189
    .line 1190
    .line 1191
    goto :goto_17

    .line 1192
    :pswitch_22
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1193
    .line 1194
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;

    .line 1195
    .line 1196
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 1197
    .line 1198
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;->setMatrix(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 1199
    .line 1200
    .line 1201
    goto :goto_17

    .line 1202
    :pswitch_23
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1203
    .line 1204
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;

    .line 1205
    .line 1206
    if-nez p3, :cond_45

    .line 1207
    .line 1208
    goto :goto_13

    .line 1209
    :cond_45
    move-object v5, p3

    .line 1210
    check-cast v5, Ljava/lang/String;

    .line 1211
    .line 1212
    :goto_13
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;->setVerticalAlign(Landroid/view/View;Ljava/lang/String;)V

    .line 1213
    .line 1214
    .line 1215
    goto :goto_17

    .line 1216
    :pswitch_24
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1217
    .line 1218
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;

    .line 1219
    .line 1220
    if-nez p3, :cond_46

    .line 1221
    .line 1222
    goto :goto_14

    .line 1223
    :cond_46
    move-object v5, p3

    .line 1224
    check-cast v5, Ljava/lang/String;

    .line 1225
    .line 1226
    :goto_14
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;->setAlignmentBaseline(Landroid/view/View;Ljava/lang/String;)V

    .line 1227
    .line 1228
    .line 1229
    goto :goto_17

    .line 1230
    :pswitch_25
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1231
    .line 1232
    if-nez p3, :cond_47

    .line 1233
    .line 1234
    goto :goto_15

    .line 1235
    :cond_47
    check-cast p3, Ljava/lang/Double;

    .line 1236
    .line 1237
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 1238
    .line 1239
    .line 1240
    move-result v4

    .line 1241
    :goto_15
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/uimanager/BaseViewManagerInterface;->setOpacity(Landroid/view/View;F)V

    .line 1242
    .line 1243
    .line 1244
    goto :goto_17

    .line 1245
    :pswitch_26
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1246
    .line 1247
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;

    .line 1248
    .line 1249
    if-nez p3, :cond_48

    .line 1250
    .line 1251
    goto :goto_16

    .line 1252
    :cond_48
    move-object v5, p3

    .line 1253
    check-cast v5, Ljava/lang/String;

    .line 1254
    .line 1255
    :goto_16
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGTextManagerInterface;->setLengthAdjust(Landroid/view/View;Ljava/lang/String;)V

    .line 1256
    .line 1257
    .line 1258
    :goto_17
    return-void

    .line 1259
    :sswitch_data_0
    .sparse-switch
        -0x5f8de5eb -> :sswitch_26
        -0x4b8807f5 -> :sswitch_25
        -0x45d9a6b8 -> :sswitch_24
        -0x43f186d1 -> :sswitch_23
        -0x4072683f -> :sswitch_22
        -0x3b3da15f -> :sswitch_21
        -0x37a9a5bf -> :sswitch_20
        -0x37a98852 -> :sswitch_1f
        -0x372522a5 -> :sswitch_1e
        -0x352a89c8 -> :sswitch_1d
        -0x2bc67c59 -> :sswitch_1c
        -0x2b7578e1 -> :sswitch_1b
        -0x18d3d54d -> :sswitch_1a
        -0x117e564a -> :sswitch_19
        -0x3330ef8 -> :sswitch_18
        -0x2a83503 -> :sswitch_17
        0x78 -> :sswitch_16
        0x79 -> :sswitch_15
        0xc94 -> :sswitch_14
        0xc95 -> :sswitch_13
        0x2ff583 -> :sswitch_12
        0x300c4f -> :sswitch_11
        0x3306ec -> :sswitch_10
        0x337a8b -> :sswitch_f
        0x4b3162e -> :sswitch_e
        0x63a48b4 -> :sswitch_d
        0xcf0d448 -> :sswitch_c
        0x1071b93d -> :sswitch_b
        0x15caa0f0 -> :sswitch_a
        0x17f096af -> :sswitch_9
        0x2e60023a -> :sswitch_8
        0x36b25395 -> :sswitch_7
        0x36b3866c -> :sswitch_6
        0x3d3f8e06 -> :sswitch_5
        0x619a1673 -> :sswitch_4
        0x63a518c2 -> :sswitch_3
        0x6ab59576 -> :sswitch_2
        0x6e2146f6 -> :sswitch_1
        0x72aeea6e -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_0
    .packed-switch 0x0
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
.end method
