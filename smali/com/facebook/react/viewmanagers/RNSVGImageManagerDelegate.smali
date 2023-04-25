.class public Lcom/facebook/react/viewmanagers/RNSVGImageManagerDelegate;
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
        "Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface<",
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
    const/16 v3, 0x1f

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
    const/16 v3, 0x1e

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
    const/16 v3, 0x1d

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
    const/16 v3, 0x1c

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
    const/16 v3, 0x1b

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
    const/16 v3, 0x1a

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
    const/16 v3, 0x19

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
    const/16 v3, 0x18

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
    const/16 v3, 0x17

    .line 139
    .line 140
    goto/16 :goto_0

    .line 141
    .line 142
    :sswitch_9
    const-string v0, "markerStart"

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
    const/16 v3, 0x16

    .line 153
    .line 154
    goto/16 :goto_0

    .line 155
    .line 156
    :sswitch_a
    const-string v0, "width"

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
    const/16 v3, 0x15

    .line 167
    .line 168
    goto/16 :goto_0

    .line 169
    .line 170
    :sswitch_b
    const-string v0, "vectorEffect"

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
    const/16 v3, 0x14

    .line 181
    .line 182
    goto/16 :goto_0

    .line 183
    .line 184
    :sswitch_c
    const-string v0, "align"

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
    const/16 v3, 0x13

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
    const/16 v3, 0x12

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
    const/16 v3, 0x11

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
    const/16 v3, 0x10

    .line 237
    .line 238
    goto/16 :goto_0

    .line 239
    .line 240
    :sswitch_10
    const-string v0, "fill"

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
    const/16 v3, 0xf

    .line 251
    .line 252
    goto/16 :goto_0

    .line 253
    .line 254
    :sswitch_11
    const-string v0, "src"

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
    const/16 v3, 0xe

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
    const/16 v3, 0xd

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
    const/16 v3, 0xc

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
    const/16 v3, 0xb

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
    const/16 v3, 0xa

    .line 321
    .line 322
    goto/16 :goto_0

    .line 323
    .line 324
    :sswitch_16
    const-string v0, "pointerEvents"

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
    const/16 v3, 0x9

    .line 335
    .line 336
    goto/16 :goto_0

    .line 337
    .line 338
    :sswitch_17
    const-string v0, "strokeOpacity"

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
    const/16 v3, 0x8

    .line 349
    .line 350
    goto/16 :goto_0

    .line 351
    .line 352
    :sswitch_18
    const-string v0, "fillRule"

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
    goto :goto_0

    .line 361
    :cond_18
    const/4 v3, 0x7

    .line 362
    goto :goto_0

    .line 363
    :sswitch_19
    const-string v0, "stroke"

    .line 364
    .line 365
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 366
    .line 367
    .line 368
    move-result v0

    .line 369
    if-nez v0, :cond_19

    .line 370
    .line 371
    goto :goto_0

    .line 372
    :cond_19
    const/4 v3, 0x6

    .line 373
    goto :goto_0

    .line 374
    :sswitch_1a
    const-string v0, "markerMid"

    .line 375
    .line 376
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 377
    .line 378
    .line 379
    move-result v0

    .line 380
    if-nez v0, :cond_1a

    .line 381
    .line 382
    goto :goto_0

    .line 383
    :cond_1a
    const/4 v3, 0x5

    .line 384
    goto :goto_0

    .line 385
    :sswitch_1b
    const-string v0, "markerEnd"

    .line 386
    .line 387
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 388
    .line 389
    .line 390
    move-result v0

    .line 391
    if-nez v0, :cond_1b

    .line 392
    .line 393
    goto :goto_0

    .line 394
    :cond_1b
    const/4 v3, 0x4

    .line 395
    goto :goto_0

    .line 396
    :sswitch_1c
    const-string v0, "propList"

    .line 397
    .line 398
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 399
    .line 400
    .line 401
    move-result v0

    .line 402
    if-nez v0, :cond_1c

    .line 403
    .line 404
    goto :goto_0

    .line 405
    :cond_1c
    const/4 v3, 0x3

    .line 406
    goto :goto_0

    .line 407
    :sswitch_1d
    const-string v0, "matrix"

    .line 408
    .line 409
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 410
    .line 411
    .line 412
    move-result v0

    .line 413
    if-nez v0, :cond_1d

    .line 414
    .line 415
    goto :goto_0

    .line 416
    :cond_1d
    const/4 v3, 0x2

    .line 417
    goto :goto_0

    .line 418
    :sswitch_1e
    const-string v0, "height"

    .line 419
    .line 420
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 421
    .line 422
    .line 423
    move-result v0

    .line 424
    if-nez v0, :cond_1e

    .line 425
    .line 426
    goto :goto_0

    .line 427
    :cond_1e
    move v3, v1

    .line 428
    goto :goto_0

    .line 429
    :sswitch_1f
    const-string v0, "opacity"

    .line 430
    .line 431
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 432
    .line 433
    .line 434
    move-result v0

    .line 435
    if-nez v0, :cond_1f

    .line 436
    .line 437
    goto :goto_0

    .line 438
    :cond_1f
    move v3, v2

    .line 439
    :goto_0
    const/4 v0, 0x0

    .line 440
    const/high16 v4, 0x3f800000    # 1.0f

    .line 441
    .line 442
    const/4 v5, 0x0

    .line 443
    packed-switch v3, :pswitch_data_0

    .line 444
    .line 445
    .line 446
    invoke-super {p0, p1, p2, p3}, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->setProperty(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V

    .line 447
    .line 448
    .line 449
    goto/16 :goto_16

    .line 450
    .line 451
    :pswitch_0
    instance-of p2, p3, Ljava/lang/String;

    .line 452
    .line 453
    if-eqz p2, :cond_20

    .line 454
    .line 455
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 456
    .line 457
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;

    .line 458
    .line 459
    check-cast p3, Ljava/lang/String;

    .line 460
    .line 461
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;->setStrokeWidth(Landroid/view/View;Ljava/lang/String;)V

    .line 462
    .line 463
    .line 464
    goto/16 :goto_16

    .line 465
    .line 466
    :cond_20
    instance-of p2, p3, Ljava/lang/Double;

    .line 467
    .line 468
    if-eqz p2, :cond_21

    .line 469
    .line 470
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 471
    .line 472
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;

    .line 473
    .line 474
    check-cast p3, Ljava/lang/Double;

    .line 475
    .line 476
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;->setStrokeWidth(Landroid/view/View;Ljava/lang/Double;)V

    .line 477
    .line 478
    .line 479
    goto/16 :goto_16

    .line 480
    .line 481
    :cond_21
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 482
    .line 483
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;

    .line 484
    .line 485
    const-string p3, "1"

    .line 486
    .line 487
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;->setStrokeWidth(Landroid/view/View;Ljava/lang/String;)V

    .line 488
    .line 489
    .line 490
    goto/16 :goto_16

    .line 491
    .line 492
    :pswitch_1
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 493
    .line 494
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;

    .line 495
    .line 496
    if-nez p3, :cond_22

    .line 497
    .line 498
    goto :goto_1

    .line 499
    :cond_22
    check-cast p3, Ljava/lang/Double;

    .line 500
    .line 501
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 502
    .line 503
    .line 504
    move-result v2

    .line 505
    :goto_1
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;->setMeetOrSlice(Landroid/view/View;I)V

    .line 506
    .line 507
    .line 508
    goto/16 :goto_16

    .line 509
    .line 510
    :pswitch_2
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 511
    .line 512
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;

    .line 513
    .line 514
    if-nez p3, :cond_23

    .line 515
    .line 516
    goto :goto_2

    .line 517
    :cond_23
    check-cast p3, Ljava/lang/Boolean;

    .line 518
    .line 519
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 520
    .line 521
    .line 522
    move-result v2

    .line 523
    :goto_2
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;->setResponsible(Landroid/view/View;Z)V

    .line 524
    .line 525
    .line 526
    goto/16 :goto_16

    .line 527
    .line 528
    :pswitch_3
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 529
    .line 530
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;

    .line 531
    .line 532
    if-nez p3, :cond_24

    .line 533
    .line 534
    goto :goto_3

    .line 535
    :cond_24
    check-cast p3, Ljava/lang/Double;

    .line 536
    .line 537
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 538
    .line 539
    .line 540
    move-result v2

    .line 541
    :goto_3
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;->setStrokeLinejoin(Landroid/view/View;I)V

    .line 542
    .line 543
    .line 544
    goto/16 :goto_16

    .line 545
    .line 546
    :pswitch_4
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 547
    .line 548
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;

    .line 549
    .line 550
    if-nez p3, :cond_25

    .line 551
    .line 552
    goto :goto_4

    .line 553
    :cond_25
    move-object v5, p3

    .line 554
    check-cast v5, Ljava/lang/String;

    .line 555
    .line 556
    :goto_4
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;->setDisplay(Landroid/view/View;Ljava/lang/String;)V

    .line 557
    .line 558
    .line 559
    goto/16 :goto_16

    .line 560
    .line 561
    :pswitch_5
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 562
    .line 563
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;

    .line 564
    .line 565
    if-nez p3, :cond_26

    .line 566
    .line 567
    goto :goto_5

    .line 568
    :cond_26
    check-cast p3, Ljava/lang/Double;

    .line 569
    .line 570
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 571
    .line 572
    .line 573
    move-result v2

    .line 574
    :goto_5
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;->setStrokeLinecap(Landroid/view/View;I)V

    .line 575
    .line 576
    .line 577
    goto/16 :goto_16

    .line 578
    .line 579
    :pswitch_6
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 580
    .line 581
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;

    .line 582
    .line 583
    if-nez p3, :cond_27

    .line 584
    .line 585
    goto :goto_6

    .line 586
    :cond_27
    check-cast p3, Ljava/lang/Double;

    .line 587
    .line 588
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 589
    .line 590
    .line 591
    move-result v2

    .line 592
    :goto_6
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;->setClipRule(Landroid/view/View;I)V

    .line 593
    .line 594
    .line 595
    goto/16 :goto_16

    .line 596
    .line 597
    :pswitch_7
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 598
    .line 599
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;

    .line 600
    .line 601
    if-nez p3, :cond_28

    .line 602
    .line 603
    goto :goto_7

    .line 604
    :cond_28
    move-object v5, p3

    .line 605
    check-cast v5, Ljava/lang/String;

    .line 606
    .line 607
    :goto_7
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;->setClipPath(Landroid/view/View;Ljava/lang/String;)V

    .line 608
    .line 609
    .line 610
    goto/16 :goto_16

    .line 611
    .line 612
    :pswitch_8
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 613
    .line 614
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;

    .line 615
    .line 616
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 617
    .line 618
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;->setStrokeDasharray(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 619
    .line 620
    .line 621
    goto/16 :goto_16

    .line 622
    .line 623
    :pswitch_9
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 624
    .line 625
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;

    .line 626
    .line 627
    if-nez p3, :cond_29

    .line 628
    .line 629
    goto :goto_8

    .line 630
    :cond_29
    move-object v5, p3

    .line 631
    check-cast v5, Ljava/lang/String;

    .line 632
    .line 633
    :goto_8
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;->setMarkerStart(Landroid/view/View;Ljava/lang/String;)V

    .line 634
    .line 635
    .line 636
    goto/16 :goto_16

    .line 637
    .line 638
    :pswitch_a
    instance-of p2, p3, Ljava/lang/String;

    .line 639
    .line 640
    if-eqz p2, :cond_2a

    .line 641
    .line 642
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 643
    .line 644
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;

    .line 645
    .line 646
    check-cast p3, Ljava/lang/String;

    .line 647
    .line 648
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;->setWidth(Landroid/view/View;Ljava/lang/String;)V

    .line 649
    .line 650
    .line 651
    goto/16 :goto_16

    .line 652
    .line 653
    :cond_2a
    instance-of p2, p3, Ljava/lang/Double;

    .line 654
    .line 655
    if-eqz p2, :cond_2b

    .line 656
    .line 657
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 658
    .line 659
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;

    .line 660
    .line 661
    check-cast p3, Ljava/lang/Double;

    .line 662
    .line 663
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;->setWidth(Landroid/view/View;Ljava/lang/Double;)V

    .line 664
    .line 665
    .line 666
    goto/16 :goto_16

    .line 667
    .line 668
    :cond_2b
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 669
    .line 670
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;

    .line 671
    .line 672
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;->setWidth(Landroid/view/View;Ljava/lang/Double;)V

    .line 673
    .line 674
    .line 675
    goto/16 :goto_16

    .line 676
    .line 677
    :pswitch_b
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 678
    .line 679
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;

    .line 680
    .line 681
    if-nez p3, :cond_2c

    .line 682
    .line 683
    goto :goto_9

    .line 684
    :cond_2c
    check-cast p3, Ljava/lang/Double;

    .line 685
    .line 686
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 687
    .line 688
    .line 689
    move-result v2

    .line 690
    :goto_9
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;->setVectorEffect(Landroid/view/View;I)V

    .line 691
    .line 692
    .line 693
    goto/16 :goto_16

    .line 694
    .line 695
    :pswitch_c
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 696
    .line 697
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;

    .line 698
    .line 699
    if-nez p3, :cond_2d

    .line 700
    .line 701
    goto :goto_a

    .line 702
    :cond_2d
    move-object v5, p3

    .line 703
    check-cast v5, Ljava/lang/String;

    .line 704
    .line 705
    :goto_a
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;->setAlign(Landroid/view/View;Ljava/lang/String;)V

    .line 706
    .line 707
    .line 708
    goto/16 :goto_16

    .line 709
    .line 710
    :pswitch_d
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 711
    .line 712
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;

    .line 713
    .line 714
    if-nez p3, :cond_2e

    .line 715
    .line 716
    goto :goto_b

    .line 717
    :cond_2e
    check-cast p3, Ljava/lang/Double;

    .line 718
    .line 719
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 720
    .line 721
    .line 722
    move-result v0

    .line 723
    :goto_b
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;->setStrokeMiterlimit(Landroid/view/View;F)V

    .line 724
    .line 725
    .line 726
    goto/16 :goto_16

    .line 727
    .line 728
    :pswitch_e
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 729
    .line 730
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;

    .line 731
    .line 732
    if-nez p3, :cond_2f

    .line 733
    .line 734
    goto :goto_c

    .line 735
    :cond_2f
    move-object v5, p3

    .line 736
    check-cast v5, Ljava/lang/String;

    .line 737
    .line 738
    :goto_c
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;->setName(Landroid/view/View;Ljava/lang/String;)V

    .line 739
    .line 740
    .line 741
    goto/16 :goto_16

    .line 742
    .line 743
    :pswitch_f
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 744
    .line 745
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;

    .line 746
    .line 747
    if-nez p3, :cond_30

    .line 748
    .line 749
    goto :goto_d

    .line 750
    :cond_30
    move-object v5, p3

    .line 751
    check-cast v5, Ljava/lang/String;

    .line 752
    .line 753
    :goto_d
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;->setMask(Landroid/view/View;Ljava/lang/String;)V

    .line 754
    .line 755
    .line 756
    goto/16 :goto_16

    .line 757
    .line 758
    :pswitch_10
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 759
    .line 760
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;

    .line 761
    .line 762
    check-cast p3, Lcom/facebook/react/bridge/ReadableMap;

    .line 763
    .line 764
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;->setFill(Landroid/view/View;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 765
    .line 766
    .line 767
    goto/16 :goto_16

    .line 768
    .line 769
    :pswitch_11
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 770
    .line 771
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;

    .line 772
    .line 773
    check-cast p3, Lcom/facebook/react/bridge/ReadableMap;

    .line 774
    .line 775
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;->setSrc(Landroid/view/View;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 776
    .line 777
    .line 778
    goto/16 :goto_16

    .line 779
    .line 780
    :pswitch_12
    instance-of p2, p3, Ljava/lang/String;

    .line 781
    .line 782
    if-eqz p2, :cond_31

    .line 783
    .line 784
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 785
    .line 786
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;

    .line 787
    .line 788
    check-cast p3, Ljava/lang/String;

    .line 789
    .line 790
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;->setY(Landroid/view/View;Ljava/lang/String;)V

    .line 791
    .line 792
    .line 793
    goto/16 :goto_16

    .line 794
    .line 795
    :cond_31
    instance-of p2, p3, Ljava/lang/Double;

    .line 796
    .line 797
    if-eqz p2, :cond_32

    .line 798
    .line 799
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 800
    .line 801
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;

    .line 802
    .line 803
    check-cast p3, Ljava/lang/Double;

    .line 804
    .line 805
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;->setY(Landroid/view/View;Ljava/lang/Double;)V

    .line 806
    .line 807
    .line 808
    goto/16 :goto_16

    .line 809
    .line 810
    :cond_32
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 811
    .line 812
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;

    .line 813
    .line 814
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;->setY(Landroid/view/View;Ljava/lang/Double;)V

    .line 815
    .line 816
    .line 817
    goto/16 :goto_16

    .line 818
    .line 819
    :pswitch_13
    instance-of p2, p3, Ljava/lang/String;

    .line 820
    .line 821
    if-eqz p2, :cond_33

    .line 822
    .line 823
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 824
    .line 825
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;

    .line 826
    .line 827
    check-cast p3, Ljava/lang/String;

    .line 828
    .line 829
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;->setX(Landroid/view/View;Ljava/lang/String;)V

    .line 830
    .line 831
    .line 832
    goto/16 :goto_16

    .line 833
    .line 834
    :cond_33
    instance-of p2, p3, Ljava/lang/Double;

    .line 835
    .line 836
    if-eqz p2, :cond_34

    .line 837
    .line 838
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 839
    .line 840
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;

    .line 841
    .line 842
    check-cast p3, Ljava/lang/Double;

    .line 843
    .line 844
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;->setX(Landroid/view/View;Ljava/lang/Double;)V

    .line 845
    .line 846
    .line 847
    goto/16 :goto_16

    .line 848
    .line 849
    :cond_34
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 850
    .line 851
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;

    .line 852
    .line 853
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;->setX(Landroid/view/View;Ljava/lang/Double;)V

    .line 854
    .line 855
    .line 856
    goto/16 :goto_16

    .line 857
    .line 858
    :pswitch_14
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 859
    .line 860
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;

    .line 861
    .line 862
    if-nez p3, :cond_35

    .line 863
    .line 864
    goto :goto_e

    .line 865
    :cond_35
    check-cast p3, Ljava/lang/Double;

    .line 866
    .line 867
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 868
    .line 869
    .line 870
    move-result v0

    .line 871
    :goto_e
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;->setStrokeDashoffset(Landroid/view/View;F)V

    .line 872
    .line 873
    .line 874
    goto/16 :goto_16

    .line 875
    .line 876
    :pswitch_15
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 877
    .line 878
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;

    .line 879
    .line 880
    if-nez p3, :cond_36

    .line 881
    .line 882
    goto :goto_f

    .line 883
    :cond_36
    check-cast p3, Ljava/lang/Double;

    .line 884
    .line 885
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 886
    .line 887
    .line 888
    move-result v4

    .line 889
    :goto_f
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;->setFillOpacity(Landroid/view/View;F)V

    .line 890
    .line 891
    .line 892
    goto/16 :goto_16

    .line 893
    .line 894
    :pswitch_16
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 895
    .line 896
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;

    .line 897
    .line 898
    if-nez p3, :cond_37

    .line 899
    .line 900
    goto :goto_10

    .line 901
    :cond_37
    move-object v5, p3

    .line 902
    check-cast v5, Ljava/lang/String;

    .line 903
    .line 904
    :goto_10
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;->setPointerEvents(Landroid/view/View;Ljava/lang/String;)V

    .line 905
    .line 906
    .line 907
    goto/16 :goto_16

    .line 908
    .line 909
    :pswitch_17
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 910
    .line 911
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;

    .line 912
    .line 913
    if-nez p3, :cond_38

    .line 914
    .line 915
    goto :goto_11

    .line 916
    :cond_38
    check-cast p3, Ljava/lang/Double;

    .line 917
    .line 918
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 919
    .line 920
    .line 921
    move-result v4

    .line 922
    :goto_11
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;->setStrokeOpacity(Landroid/view/View;F)V

    .line 923
    .line 924
    .line 925
    goto/16 :goto_16

    .line 926
    .line 927
    :pswitch_18
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 928
    .line 929
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;

    .line 930
    .line 931
    if-nez p3, :cond_39

    .line 932
    .line 933
    goto :goto_12

    .line 934
    :cond_39
    check-cast p3, Ljava/lang/Double;

    .line 935
    .line 936
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 937
    .line 938
    .line 939
    move-result v1

    .line 940
    :goto_12
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;->setFillRule(Landroid/view/View;I)V

    .line 941
    .line 942
    .line 943
    goto/16 :goto_16

    .line 944
    .line 945
    :pswitch_19
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 946
    .line 947
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;

    .line 948
    .line 949
    check-cast p3, Lcom/facebook/react/bridge/ReadableMap;

    .line 950
    .line 951
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;->setStroke(Landroid/view/View;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 952
    .line 953
    .line 954
    goto :goto_16

    .line 955
    :pswitch_1a
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 956
    .line 957
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;

    .line 958
    .line 959
    if-nez p3, :cond_3a

    .line 960
    .line 961
    goto :goto_13

    .line 962
    :cond_3a
    move-object v5, p3

    .line 963
    check-cast v5, Ljava/lang/String;

    .line 964
    .line 965
    :goto_13
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;->setMarkerMid(Landroid/view/View;Ljava/lang/String;)V

    .line 966
    .line 967
    .line 968
    goto :goto_16

    .line 969
    :pswitch_1b
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 970
    .line 971
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;

    .line 972
    .line 973
    if-nez p3, :cond_3b

    .line 974
    .line 975
    goto :goto_14

    .line 976
    :cond_3b
    move-object v5, p3

    .line 977
    check-cast v5, Ljava/lang/String;

    .line 978
    .line 979
    :goto_14
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;->setMarkerEnd(Landroid/view/View;Ljava/lang/String;)V

    .line 980
    .line 981
    .line 982
    goto :goto_16

    .line 983
    :pswitch_1c
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 984
    .line 985
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;

    .line 986
    .line 987
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 988
    .line 989
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;->setPropList(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 990
    .line 991
    .line 992
    goto :goto_16

    .line 993
    :pswitch_1d
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 994
    .line 995
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;

    .line 996
    .line 997
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 998
    .line 999
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;->setMatrix(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 1000
    .line 1001
    .line 1002
    goto :goto_16

    .line 1003
    :pswitch_1e
    instance-of p2, p3, Ljava/lang/String;

    .line 1004
    .line 1005
    if-eqz p2, :cond_3c

    .line 1006
    .line 1007
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1008
    .line 1009
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;

    .line 1010
    .line 1011
    check-cast p3, Ljava/lang/String;

    .line 1012
    .line 1013
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;->setHeight(Landroid/view/View;Ljava/lang/String;)V

    .line 1014
    .line 1015
    .line 1016
    goto :goto_16

    .line 1017
    :cond_3c
    instance-of p2, p3, Ljava/lang/Double;

    .line 1018
    .line 1019
    if-eqz p2, :cond_3d

    .line 1020
    .line 1021
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1022
    .line 1023
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;

    .line 1024
    .line 1025
    check-cast p3, Ljava/lang/Double;

    .line 1026
    .line 1027
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;->setHeight(Landroid/view/View;Ljava/lang/Double;)V

    .line 1028
    .line 1029
    .line 1030
    goto :goto_16

    .line 1031
    :cond_3d
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1032
    .line 1033
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;

    .line 1034
    .line 1035
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;->setHeight(Landroid/view/View;Ljava/lang/Double;)V

    .line 1036
    .line 1037
    .line 1038
    goto :goto_16

    .line 1039
    :pswitch_1f
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1040
    .line 1041
    if-nez p3, :cond_3e

    .line 1042
    .line 1043
    goto :goto_15

    .line 1044
    :cond_3e
    check-cast p3, Ljava/lang/Double;

    .line 1045
    .line 1046
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 1047
    .line 1048
    .line 1049
    move-result v4

    .line 1050
    :goto_15
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/uimanager/BaseViewManagerInterface;->setOpacity(Landroid/view/View;F)V

    .line 1051
    .line 1052
    .line 1053
    :goto_16
    return-void

    .line 1054
    nop

    .line 1055
    :sswitch_data_0
    .sparse-switch
        -0x4b8807f5 -> :sswitch_1f
        -0x48c76ed9 -> :sswitch_1e
        -0x4072683f -> :sswitch_1d
        -0x3b3da15f -> :sswitch_1c
        -0x37a9a5bf -> :sswitch_1b
        -0x37a98852 -> :sswitch_1a
        -0x352a89c8 -> :sswitch_19
        -0x2b7578e1 -> :sswitch_18
        -0x18d3d54d -> :sswitch_17
        -0x117e564a -> :sswitch_16
        -0x3330ef8 -> :sswitch_15
        -0x2a83503 -> :sswitch_14
        0x78 -> :sswitch_13
        0x79 -> :sswitch_12
        0x1bde4 -> :sswitch_11
        0x2ff583 -> :sswitch_10
        0x3306ec -> :sswitch_f
        0x337a8b -> :sswitch_e
        0x4b3162e -> :sswitch_d
        0x5899705 -> :sswitch_c
        0x63a48b4 -> :sswitch_b
        0x6be2dc6 -> :sswitch_a
        0xcf0d448 -> :sswitch_9
        0x17f096af -> :sswitch_8
        0x36b25395 -> :sswitch_7
        0x36b3866c -> :sswitch_6
        0x3d3f8e06 -> :sswitch_5
        0x63a518c2 -> :sswitch_4
        0x6ab59576 -> :sswitch_3
        0x6e2146f6 -> :sswitch_2
        0x71baeb28 -> :sswitch_1
        0x72aeea6e -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_0
    .packed-switch 0x0
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
.end method
