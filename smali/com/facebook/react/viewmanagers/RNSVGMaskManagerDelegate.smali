.class public Lcom/facebook/react/viewmanagers/RNSVGMaskManagerDelegate;
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
        "Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface<",
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
    const-string v0, "maskContentUnits"

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
    const/16 v3, 0x21

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
    const/16 v3, 0x20

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
    const/16 v3, 0x1f

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
    const/16 v3, 0x1e

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
    const/16 v3, 0x1d

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
    const/16 v3, 0x1c

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
    const/16 v3, 0x1b

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
    const/16 v3, 0x1a

    .line 125
    .line 126
    goto/16 :goto_0

    .line 127
    .line 128
    :sswitch_8
    const-string v0, "strokeDasharray"

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
    const/16 v3, 0x19

    .line 139
    .line 140
    goto/16 :goto_0

    .line 141
    .line 142
    :sswitch_9
    const-string v0, "fontSize"

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
    const/16 v3, 0x18

    .line 153
    .line 154
    goto/16 :goto_0

    .line 155
    .line 156
    :sswitch_a
    const-string v0, "markerStart"

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
    const/16 v3, 0x17

    .line 167
    .line 168
    goto/16 :goto_0

    .line 169
    .line 170
    :sswitch_b
    const-string v0, "width"

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
    const/16 v3, 0x16

    .line 181
    .line 182
    goto/16 :goto_0

    .line 183
    .line 184
    :sswitch_c
    const-string v0, "vectorEffect"

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
    const/16 v3, 0x15

    .line 195
    .line 196
    goto/16 :goto_0

    .line 197
    .line 198
    :sswitch_d
    const-string v0, "strokeMiterlimit"

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
    const/16 v3, 0x14

    .line 209
    .line 210
    goto/16 :goto_0

    .line 211
    .line 212
    :sswitch_e
    const-string v0, "name"

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
    const/16 v3, 0x13

    .line 223
    .line 224
    goto/16 :goto_0

    .line 225
    .line 226
    :sswitch_f
    const-string v0, "mask"

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
    const/16 v3, 0x12

    .line 237
    .line 238
    goto/16 :goto_0

    .line 239
    .line 240
    :sswitch_10
    const-string v0, "font"

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
    const/16 v3, 0x11

    .line 251
    .line 252
    goto/16 :goto_0

    .line 253
    .line 254
    :sswitch_11
    const-string v0, "fill"

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
    const/16 v3, 0x10

    .line 265
    .line 266
    goto/16 :goto_0

    .line 267
    .line 268
    :sswitch_12
    const-string v0, "y"

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
    const/16 v3, 0xf

    .line 279
    .line 280
    goto/16 :goto_0

    .line 281
    .line 282
    :sswitch_13
    const-string v0, "x"

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
    const/16 v3, 0xe

    .line 293
    .line 294
    goto/16 :goto_0

    .line 295
    .line 296
    :sswitch_14
    const-string v0, "strokeDashoffset"

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
    const/16 v3, 0xd

    .line 307
    .line 308
    goto/16 :goto_0

    .line 309
    .line 310
    :sswitch_15
    const-string v0, "fillOpacity"

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
    const/16 v3, 0xc

    .line 321
    .line 322
    goto/16 :goto_0

    .line 323
    .line 324
    :sswitch_16
    const-string v0, "maskUnits"

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
    const/16 v3, 0xb

    .line 335
    .line 336
    goto/16 :goto_0

    .line 337
    .line 338
    :sswitch_17
    const-string v0, "pointerEvents"

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
    const/16 v3, 0xa

    .line 349
    .line 350
    goto/16 :goto_0

    .line 351
    .line 352
    :sswitch_18
    const-string v0, "strokeOpacity"

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
    const/16 v3, 0x9

    .line 363
    .line 364
    goto/16 :goto_0

    .line 365
    .line 366
    :sswitch_19
    const-string v0, "fillRule"

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
    const/16 v3, 0x8

    .line 377
    .line 378
    goto/16 :goto_0

    .line 379
    .line 380
    :sswitch_1a
    const-string v0, "fontWeight"

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
    goto :goto_0

    .line 389
    :cond_1a
    const/4 v3, 0x7

    .line 390
    goto :goto_0

    .line 391
    :sswitch_1b
    const-string v0, "stroke"

    .line 392
    .line 393
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 394
    .line 395
    .line 396
    move-result v0

    .line 397
    if-nez v0, :cond_1b

    .line 398
    .line 399
    goto :goto_0

    .line 400
    :cond_1b
    const/4 v3, 0x6

    .line 401
    goto :goto_0

    .line 402
    :sswitch_1c
    const-string v0, "markerMid"

    .line 403
    .line 404
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 405
    .line 406
    .line 407
    move-result v0

    .line 408
    if-nez v0, :cond_1c

    .line 409
    .line 410
    goto :goto_0

    .line 411
    :cond_1c
    const/4 v3, 0x5

    .line 412
    goto :goto_0

    .line 413
    :sswitch_1d
    const-string v0, "markerEnd"

    .line 414
    .line 415
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 416
    .line 417
    .line 418
    move-result v0

    .line 419
    if-nez v0, :cond_1d

    .line 420
    .line 421
    goto :goto_0

    .line 422
    :cond_1d
    const/4 v3, 0x4

    .line 423
    goto :goto_0

    .line 424
    :sswitch_1e
    const-string v0, "propList"

    .line 425
    .line 426
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 427
    .line 428
    .line 429
    move-result v0

    .line 430
    if-nez v0, :cond_1e

    .line 431
    .line 432
    goto :goto_0

    .line 433
    :cond_1e
    const/4 v3, 0x3

    .line 434
    goto :goto_0

    .line 435
    :sswitch_1f
    const-string v0, "matrix"

    .line 436
    .line 437
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 438
    .line 439
    .line 440
    move-result v0

    .line 441
    if-nez v0, :cond_1f

    .line 442
    .line 443
    goto :goto_0

    .line 444
    :cond_1f
    const/4 v3, 0x2

    .line 445
    goto :goto_0

    .line 446
    :sswitch_20
    const-string v0, "height"

    .line 447
    .line 448
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 449
    .line 450
    .line 451
    move-result v0

    .line 452
    if-nez v0, :cond_20

    .line 453
    .line 454
    goto :goto_0

    .line 455
    :cond_20
    move v3, v1

    .line 456
    goto :goto_0

    .line 457
    :sswitch_21
    const-string v0, "opacity"

    .line 458
    .line 459
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 460
    .line 461
    .line 462
    move-result v0

    .line 463
    if-nez v0, :cond_21

    .line 464
    .line 465
    goto :goto_0

    .line 466
    :cond_21
    move v3, v2

    .line 467
    :goto_0
    const/4 v0, 0x0

    .line 468
    const/high16 v4, 0x3f800000    # 1.0f

    .line 469
    .line 470
    const/4 v5, 0x0

    .line 471
    packed-switch v3, :pswitch_data_0

    .line 472
    .line 473
    .line 474
    invoke-super {p0, p1, p2, p3}, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->setProperty(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V

    .line 475
    .line 476
    .line 477
    goto/16 :goto_16

    .line 478
    .line 479
    :pswitch_0
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 480
    .line 481
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;

    .line 482
    .line 483
    if-nez p3, :cond_22

    .line 484
    .line 485
    goto :goto_1

    .line 486
    :cond_22
    check-cast p3, Ljava/lang/Double;

    .line 487
    .line 488
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 489
    .line 490
    .line 491
    move-result v2

    .line 492
    :goto_1
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;->setMaskContentUnits(Landroid/view/View;I)V

    .line 493
    .line 494
    .line 495
    goto/16 :goto_16

    .line 496
    .line 497
    :pswitch_1
    instance-of p2, p3, Ljava/lang/String;

    .line 498
    .line 499
    if-eqz p2, :cond_23

    .line 500
    .line 501
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 502
    .line 503
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;

    .line 504
    .line 505
    check-cast p3, Ljava/lang/String;

    .line 506
    .line 507
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;->setStrokeWidth(Landroid/view/View;Ljava/lang/String;)V

    .line 508
    .line 509
    .line 510
    goto/16 :goto_16

    .line 511
    .line 512
    :cond_23
    instance-of p2, p3, Ljava/lang/Double;

    .line 513
    .line 514
    if-eqz p2, :cond_24

    .line 515
    .line 516
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 517
    .line 518
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;

    .line 519
    .line 520
    check-cast p3, Ljava/lang/Double;

    .line 521
    .line 522
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;->setStrokeWidth(Landroid/view/View;Ljava/lang/Double;)V

    .line 523
    .line 524
    .line 525
    goto/16 :goto_16

    .line 526
    .line 527
    :cond_24
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 528
    .line 529
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;

    .line 530
    .line 531
    const-string p3, "1"

    .line 532
    .line 533
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;->setStrokeWidth(Landroid/view/View;Ljava/lang/String;)V

    .line 534
    .line 535
    .line 536
    goto/16 :goto_16

    .line 537
    .line 538
    :pswitch_2
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 539
    .line 540
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;

    .line 541
    .line 542
    if-nez p3, :cond_25

    .line 543
    .line 544
    goto :goto_2

    .line 545
    :cond_25
    check-cast p3, Ljava/lang/Boolean;

    .line 546
    .line 547
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 548
    .line 549
    .line 550
    move-result v2

    .line 551
    :goto_2
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;->setResponsible(Landroid/view/View;Z)V

    .line 552
    .line 553
    .line 554
    goto/16 :goto_16

    .line 555
    .line 556
    :pswitch_3
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 557
    .line 558
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;

    .line 559
    .line 560
    if-nez p3, :cond_26

    .line 561
    .line 562
    goto :goto_3

    .line 563
    :cond_26
    check-cast p3, Ljava/lang/Double;

    .line 564
    .line 565
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 566
    .line 567
    .line 568
    move-result v2

    .line 569
    :goto_3
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;->setStrokeLinejoin(Landroid/view/View;I)V

    .line 570
    .line 571
    .line 572
    goto/16 :goto_16

    .line 573
    .line 574
    :pswitch_4
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 575
    .line 576
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;

    .line 577
    .line 578
    if-nez p3, :cond_27

    .line 579
    .line 580
    goto :goto_4

    .line 581
    :cond_27
    move-object v5, p3

    .line 582
    check-cast v5, Ljava/lang/String;

    .line 583
    .line 584
    :goto_4
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;->setDisplay(Landroid/view/View;Ljava/lang/String;)V

    .line 585
    .line 586
    .line 587
    goto/16 :goto_16

    .line 588
    .line 589
    :pswitch_5
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 590
    .line 591
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;

    .line 592
    .line 593
    if-nez p3, :cond_28

    .line 594
    .line 595
    goto :goto_5

    .line 596
    :cond_28
    check-cast p3, Ljava/lang/Double;

    .line 597
    .line 598
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 599
    .line 600
    .line 601
    move-result v2

    .line 602
    :goto_5
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;->setStrokeLinecap(Landroid/view/View;I)V

    .line 603
    .line 604
    .line 605
    goto/16 :goto_16

    .line 606
    .line 607
    :pswitch_6
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 608
    .line 609
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;

    .line 610
    .line 611
    if-nez p3, :cond_29

    .line 612
    .line 613
    goto :goto_6

    .line 614
    :cond_29
    check-cast p3, Ljava/lang/Double;

    .line 615
    .line 616
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 617
    .line 618
    .line 619
    move-result v2

    .line 620
    :goto_6
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;->setClipRule(Landroid/view/View;I)V

    .line 621
    .line 622
    .line 623
    goto/16 :goto_16

    .line 624
    .line 625
    :pswitch_7
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 626
    .line 627
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;

    .line 628
    .line 629
    if-nez p3, :cond_2a

    .line 630
    .line 631
    goto :goto_7

    .line 632
    :cond_2a
    move-object v5, p3

    .line 633
    check-cast v5, Ljava/lang/String;

    .line 634
    .line 635
    :goto_7
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;->setClipPath(Landroid/view/View;Ljava/lang/String;)V

    .line 636
    .line 637
    .line 638
    goto/16 :goto_16

    .line 639
    .line 640
    :pswitch_8
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 641
    .line 642
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;

    .line 643
    .line 644
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 645
    .line 646
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;->setStrokeDasharray(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 647
    .line 648
    .line 649
    goto/16 :goto_16

    .line 650
    .line 651
    :pswitch_9
    instance-of p2, p3, Ljava/lang/String;

    .line 652
    .line 653
    if-eqz p2, :cond_2b

    .line 654
    .line 655
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 656
    .line 657
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;

    .line 658
    .line 659
    check-cast p3, Ljava/lang/String;

    .line 660
    .line 661
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;->setFontSize(Landroid/view/View;Ljava/lang/String;)V

    .line 662
    .line 663
    .line 664
    goto/16 :goto_16

    .line 665
    .line 666
    :cond_2b
    instance-of p2, p3, Ljava/lang/Double;

    .line 667
    .line 668
    if-eqz p2, :cond_2c

    .line 669
    .line 670
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 671
    .line 672
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;

    .line 673
    .line 674
    check-cast p3, Ljava/lang/Double;

    .line 675
    .line 676
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;->setFontSize(Landroid/view/View;Ljava/lang/Double;)V

    .line 677
    .line 678
    .line 679
    goto/16 :goto_16

    .line 680
    .line 681
    :cond_2c
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 682
    .line 683
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;

    .line 684
    .line 685
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;->setFontSize(Landroid/view/View;Ljava/lang/Double;)V

    .line 686
    .line 687
    .line 688
    goto/16 :goto_16

    .line 689
    .line 690
    :pswitch_a
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 691
    .line 692
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;

    .line 693
    .line 694
    if-nez p3, :cond_2d

    .line 695
    .line 696
    goto :goto_8

    .line 697
    :cond_2d
    move-object v5, p3

    .line 698
    check-cast v5, Ljava/lang/String;

    .line 699
    .line 700
    :goto_8
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;->setMarkerStart(Landroid/view/View;Ljava/lang/String;)V

    .line 701
    .line 702
    .line 703
    goto/16 :goto_16

    .line 704
    .line 705
    :pswitch_b
    instance-of p2, p3, Ljava/lang/String;

    .line 706
    .line 707
    if-eqz p2, :cond_2e

    .line 708
    .line 709
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 710
    .line 711
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;

    .line 712
    .line 713
    check-cast p3, Ljava/lang/String;

    .line 714
    .line 715
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;->setWidth(Landroid/view/View;Ljava/lang/String;)V

    .line 716
    .line 717
    .line 718
    goto/16 :goto_16

    .line 719
    .line 720
    :cond_2e
    instance-of p2, p3, Ljava/lang/Double;

    .line 721
    .line 722
    if-eqz p2, :cond_2f

    .line 723
    .line 724
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 725
    .line 726
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;

    .line 727
    .line 728
    check-cast p3, Ljava/lang/Double;

    .line 729
    .line 730
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;->setWidth(Landroid/view/View;Ljava/lang/Double;)V

    .line 731
    .line 732
    .line 733
    goto/16 :goto_16

    .line 734
    .line 735
    :cond_2f
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 736
    .line 737
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;

    .line 738
    .line 739
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;->setWidth(Landroid/view/View;Ljava/lang/Double;)V

    .line 740
    .line 741
    .line 742
    goto/16 :goto_16

    .line 743
    .line 744
    :pswitch_c
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 745
    .line 746
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;

    .line 747
    .line 748
    if-nez p3, :cond_30

    .line 749
    .line 750
    goto :goto_9

    .line 751
    :cond_30
    check-cast p3, Ljava/lang/Double;

    .line 752
    .line 753
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 754
    .line 755
    .line 756
    move-result v2

    .line 757
    :goto_9
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;->setVectorEffect(Landroid/view/View;I)V

    .line 758
    .line 759
    .line 760
    goto/16 :goto_16

    .line 761
    .line 762
    :pswitch_d
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 763
    .line 764
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;

    .line 765
    .line 766
    if-nez p3, :cond_31

    .line 767
    .line 768
    goto :goto_a

    .line 769
    :cond_31
    check-cast p3, Ljava/lang/Double;

    .line 770
    .line 771
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 772
    .line 773
    .line 774
    move-result v0

    .line 775
    :goto_a
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;->setStrokeMiterlimit(Landroid/view/View;F)V

    .line 776
    .line 777
    .line 778
    goto/16 :goto_16

    .line 779
    .line 780
    :pswitch_e
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 781
    .line 782
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;

    .line 783
    .line 784
    if-nez p3, :cond_32

    .line 785
    .line 786
    goto :goto_b

    .line 787
    :cond_32
    move-object v5, p3

    .line 788
    check-cast v5, Ljava/lang/String;

    .line 789
    .line 790
    :goto_b
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;->setName(Landroid/view/View;Ljava/lang/String;)V

    .line 791
    .line 792
    .line 793
    goto/16 :goto_16

    .line 794
    .line 795
    :pswitch_f
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 796
    .line 797
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;

    .line 798
    .line 799
    if-nez p3, :cond_33

    .line 800
    .line 801
    goto :goto_c

    .line 802
    :cond_33
    move-object v5, p3

    .line 803
    check-cast v5, Ljava/lang/String;

    .line 804
    .line 805
    :goto_c
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;->setMask(Landroid/view/View;Ljava/lang/String;)V

    .line 806
    .line 807
    .line 808
    goto/16 :goto_16

    .line 809
    .line 810
    :pswitch_10
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 811
    .line 812
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;

    .line 813
    .line 814
    check-cast p3, Lcom/facebook/react/bridge/ReadableMap;

    .line 815
    .line 816
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;->setFont(Landroid/view/View;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 817
    .line 818
    .line 819
    goto/16 :goto_16

    .line 820
    .line 821
    :pswitch_11
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 822
    .line 823
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;

    .line 824
    .line 825
    check-cast p3, Lcom/facebook/react/bridge/ReadableMap;

    .line 826
    .line 827
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;->setFill(Landroid/view/View;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 828
    .line 829
    .line 830
    goto/16 :goto_16

    .line 831
    .line 832
    :pswitch_12
    instance-of p2, p3, Ljava/lang/String;

    .line 833
    .line 834
    if-eqz p2, :cond_34

    .line 835
    .line 836
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 837
    .line 838
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;

    .line 839
    .line 840
    check-cast p3, Ljava/lang/String;

    .line 841
    .line 842
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;->setY(Landroid/view/View;Ljava/lang/String;)V

    .line 843
    .line 844
    .line 845
    goto/16 :goto_16

    .line 846
    .line 847
    :cond_34
    instance-of p2, p3, Ljava/lang/Double;

    .line 848
    .line 849
    if-eqz p2, :cond_35

    .line 850
    .line 851
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 852
    .line 853
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;

    .line 854
    .line 855
    check-cast p3, Ljava/lang/Double;

    .line 856
    .line 857
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;->setY(Landroid/view/View;Ljava/lang/Double;)V

    .line 858
    .line 859
    .line 860
    goto/16 :goto_16

    .line 861
    .line 862
    :cond_35
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 863
    .line 864
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;

    .line 865
    .line 866
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;->setY(Landroid/view/View;Ljava/lang/Double;)V

    .line 867
    .line 868
    .line 869
    goto/16 :goto_16

    .line 870
    .line 871
    :pswitch_13
    instance-of p2, p3, Ljava/lang/String;

    .line 872
    .line 873
    if-eqz p2, :cond_36

    .line 874
    .line 875
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 876
    .line 877
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;

    .line 878
    .line 879
    check-cast p3, Ljava/lang/String;

    .line 880
    .line 881
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;->setX(Landroid/view/View;Ljava/lang/String;)V

    .line 882
    .line 883
    .line 884
    goto/16 :goto_16

    .line 885
    .line 886
    :cond_36
    instance-of p2, p3, Ljava/lang/Double;

    .line 887
    .line 888
    if-eqz p2, :cond_37

    .line 889
    .line 890
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 891
    .line 892
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;

    .line 893
    .line 894
    check-cast p3, Ljava/lang/Double;

    .line 895
    .line 896
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;->setX(Landroid/view/View;Ljava/lang/Double;)V

    .line 897
    .line 898
    .line 899
    goto/16 :goto_16

    .line 900
    .line 901
    :cond_37
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 902
    .line 903
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;

    .line 904
    .line 905
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;->setX(Landroid/view/View;Ljava/lang/Double;)V

    .line 906
    .line 907
    .line 908
    goto/16 :goto_16

    .line 909
    .line 910
    :pswitch_14
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 911
    .line 912
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;

    .line 913
    .line 914
    if-nez p3, :cond_38

    .line 915
    .line 916
    goto :goto_d

    .line 917
    :cond_38
    check-cast p3, Ljava/lang/Double;

    .line 918
    .line 919
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 920
    .line 921
    .line 922
    move-result v0

    .line 923
    :goto_d
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;->setStrokeDashoffset(Landroid/view/View;F)V

    .line 924
    .line 925
    .line 926
    goto/16 :goto_16

    .line 927
    .line 928
    :pswitch_15
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 929
    .line 930
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;

    .line 931
    .line 932
    if-nez p3, :cond_39

    .line 933
    .line 934
    goto :goto_e

    .line 935
    :cond_39
    check-cast p3, Ljava/lang/Double;

    .line 936
    .line 937
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 938
    .line 939
    .line 940
    move-result v4

    .line 941
    :goto_e
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;->setFillOpacity(Landroid/view/View;F)V

    .line 942
    .line 943
    .line 944
    goto/16 :goto_16

    .line 945
    .line 946
    :pswitch_16
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 947
    .line 948
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;

    .line 949
    .line 950
    if-nez p3, :cond_3a

    .line 951
    .line 952
    goto :goto_f

    .line 953
    :cond_3a
    check-cast p3, Ljava/lang/Double;

    .line 954
    .line 955
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 956
    .line 957
    .line 958
    move-result v2

    .line 959
    :goto_f
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;->setMaskUnits(Landroid/view/View;I)V

    .line 960
    .line 961
    .line 962
    goto/16 :goto_16

    .line 963
    .line 964
    :pswitch_17
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 965
    .line 966
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;

    .line 967
    .line 968
    if-nez p3, :cond_3b

    .line 969
    .line 970
    goto :goto_10

    .line 971
    :cond_3b
    move-object v5, p3

    .line 972
    check-cast v5, Ljava/lang/String;

    .line 973
    .line 974
    :goto_10
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;->setPointerEvents(Landroid/view/View;Ljava/lang/String;)V

    .line 975
    .line 976
    .line 977
    goto/16 :goto_16

    .line 978
    .line 979
    :pswitch_18
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 980
    .line 981
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;

    .line 982
    .line 983
    if-nez p3, :cond_3c

    .line 984
    .line 985
    goto :goto_11

    .line 986
    :cond_3c
    check-cast p3, Ljava/lang/Double;

    .line 987
    .line 988
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 989
    .line 990
    .line 991
    move-result v4

    .line 992
    :goto_11
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;->setStrokeOpacity(Landroid/view/View;F)V

    .line 993
    .line 994
    .line 995
    goto/16 :goto_16

    .line 996
    .line 997
    :pswitch_19
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 998
    .line 999
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;

    .line 1000
    .line 1001
    if-nez p3, :cond_3d

    .line 1002
    .line 1003
    goto :goto_12

    .line 1004
    :cond_3d
    check-cast p3, Ljava/lang/Double;

    .line 1005
    .line 1006
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 1007
    .line 1008
    .line 1009
    move-result v1

    .line 1010
    :goto_12
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;->setFillRule(Landroid/view/View;I)V

    .line 1011
    .line 1012
    .line 1013
    goto/16 :goto_16

    .line 1014
    .line 1015
    :pswitch_1a
    instance-of p2, p3, Ljava/lang/String;

    .line 1016
    .line 1017
    if-eqz p2, :cond_3e

    .line 1018
    .line 1019
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1020
    .line 1021
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;

    .line 1022
    .line 1023
    check-cast p3, Ljava/lang/String;

    .line 1024
    .line 1025
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;->setFontWeight(Landroid/view/View;Ljava/lang/String;)V

    .line 1026
    .line 1027
    .line 1028
    goto/16 :goto_16

    .line 1029
    .line 1030
    :cond_3e
    instance-of p2, p3, Ljava/lang/Double;

    .line 1031
    .line 1032
    if-eqz p2, :cond_3f

    .line 1033
    .line 1034
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1035
    .line 1036
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;

    .line 1037
    .line 1038
    check-cast p3, Ljava/lang/Double;

    .line 1039
    .line 1040
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;->setFontWeight(Landroid/view/View;Ljava/lang/Double;)V

    .line 1041
    .line 1042
    .line 1043
    goto/16 :goto_16

    .line 1044
    .line 1045
    :cond_3f
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1046
    .line 1047
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;

    .line 1048
    .line 1049
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;->setFontWeight(Landroid/view/View;Ljava/lang/Double;)V

    .line 1050
    .line 1051
    .line 1052
    goto/16 :goto_16

    .line 1053
    .line 1054
    :pswitch_1b
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1055
    .line 1056
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;

    .line 1057
    .line 1058
    check-cast p3, Lcom/facebook/react/bridge/ReadableMap;

    .line 1059
    .line 1060
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;->setStroke(Landroid/view/View;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 1061
    .line 1062
    .line 1063
    goto :goto_16

    .line 1064
    :pswitch_1c
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1065
    .line 1066
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;

    .line 1067
    .line 1068
    if-nez p3, :cond_40

    .line 1069
    .line 1070
    goto :goto_13

    .line 1071
    :cond_40
    move-object v5, p3

    .line 1072
    check-cast v5, Ljava/lang/String;

    .line 1073
    .line 1074
    :goto_13
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;->setMarkerMid(Landroid/view/View;Ljava/lang/String;)V

    .line 1075
    .line 1076
    .line 1077
    goto :goto_16

    .line 1078
    :pswitch_1d
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1079
    .line 1080
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;

    .line 1081
    .line 1082
    if-nez p3, :cond_41

    .line 1083
    .line 1084
    goto :goto_14

    .line 1085
    :cond_41
    move-object v5, p3

    .line 1086
    check-cast v5, Ljava/lang/String;

    .line 1087
    .line 1088
    :goto_14
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;->setMarkerEnd(Landroid/view/View;Ljava/lang/String;)V

    .line 1089
    .line 1090
    .line 1091
    goto :goto_16

    .line 1092
    :pswitch_1e
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1093
    .line 1094
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;

    .line 1095
    .line 1096
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 1097
    .line 1098
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;->setPropList(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 1099
    .line 1100
    .line 1101
    goto :goto_16

    .line 1102
    :pswitch_1f
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1103
    .line 1104
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;

    .line 1105
    .line 1106
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 1107
    .line 1108
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;->setMatrix(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 1109
    .line 1110
    .line 1111
    goto :goto_16

    .line 1112
    :pswitch_20
    instance-of p2, p3, Ljava/lang/String;

    .line 1113
    .line 1114
    if-eqz p2, :cond_42

    .line 1115
    .line 1116
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1117
    .line 1118
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;

    .line 1119
    .line 1120
    check-cast p3, Ljava/lang/String;

    .line 1121
    .line 1122
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;->setHeight(Landroid/view/View;Ljava/lang/String;)V

    .line 1123
    .line 1124
    .line 1125
    goto :goto_16

    .line 1126
    :cond_42
    instance-of p2, p3, Ljava/lang/Double;

    .line 1127
    .line 1128
    if-eqz p2, :cond_43

    .line 1129
    .line 1130
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1131
    .line 1132
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;

    .line 1133
    .line 1134
    check-cast p3, Ljava/lang/Double;

    .line 1135
    .line 1136
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;->setHeight(Landroid/view/View;Ljava/lang/Double;)V

    .line 1137
    .line 1138
    .line 1139
    goto :goto_16

    .line 1140
    :cond_43
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1141
    .line 1142
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;

    .line 1143
    .line 1144
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGMaskManagerInterface;->setHeight(Landroid/view/View;Ljava/lang/Double;)V

    .line 1145
    .line 1146
    .line 1147
    goto :goto_16

    .line 1148
    :pswitch_21
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1149
    .line 1150
    if-nez p3, :cond_44

    .line 1151
    .line 1152
    goto :goto_15

    .line 1153
    :cond_44
    check-cast p3, Ljava/lang/Double;

    .line 1154
    .line 1155
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 1156
    .line 1157
    .line 1158
    move-result v4

    .line 1159
    :goto_15
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/uimanager/BaseViewManagerInterface;->setOpacity(Landroid/view/View;F)V

    .line 1160
    .line 1161
    .line 1162
    :goto_16
    return-void

    .line 1163
    :sswitch_data_0
    .sparse-switch
        -0x4b8807f5 -> :sswitch_21
        -0x48c76ed9 -> :sswitch_20
        -0x4072683f -> :sswitch_1f
        -0x3b3da15f -> :sswitch_1e
        -0x37a9a5bf -> :sswitch_1d
        -0x37a98852 -> :sswitch_1c
        -0x352a89c8 -> :sswitch_1b
        -0x2bc67c59 -> :sswitch_1a
        -0x2b7578e1 -> :sswitch_19
        -0x18d3d54d -> :sswitch_18
        -0x117e564a -> :sswitch_17
        -0x3a62c1d -> :sswitch_16
        -0x3330ef8 -> :sswitch_15
        -0x2a83503 -> :sswitch_14
        0x78 -> :sswitch_13
        0x79 -> :sswitch_12
        0x2ff583 -> :sswitch_11
        0x300c4f -> :sswitch_10
        0x3306ec -> :sswitch_f
        0x337a8b -> :sswitch_e
        0x4b3162e -> :sswitch_d
        0x63a48b4 -> :sswitch_c
        0x6be2dc6 -> :sswitch_b
        0xcf0d448 -> :sswitch_a
        0x15caa0f0 -> :sswitch_9
        0x17f096af -> :sswitch_8
        0x36b25395 -> :sswitch_7
        0x36b3866c -> :sswitch_6
        0x3d3f8e06 -> :sswitch_5
        0x63a518c2 -> :sswitch_4
        0x6ab59576 -> :sswitch_3
        0x6e2146f6 -> :sswitch_2
        0x72aeea6e -> :sswitch_1
        0x79746f82 -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_0
    .packed-switch 0x0
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
.end method
