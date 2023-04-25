.class public Lcom/facebook/react/viewmanagers/RNSVGRectManagerDelegate;
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
        "Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface<",
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
    const/16 v3, 0x1e

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
    const/16 v3, 0x1d

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
    const/16 v3, 0x1c

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
    const/16 v3, 0x1b

    .line 69
    .line 70
    goto/16 :goto_0

    .line 71
    .line 72
    :sswitch_4
    const-string v0, "strokeLinecap"

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
    const/16 v3, 0x1a

    .line 83
    .line 84
    goto/16 :goto_0

    .line 85
    .line 86
    :sswitch_5
    const-string v0, "clipRule"

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
    const/16 v3, 0x19

    .line 97
    .line 98
    goto/16 :goto_0

    .line 99
    .line 100
    :sswitch_6
    const-string v0, "clipPath"

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
    const/16 v3, 0x18

    .line 111
    .line 112
    goto/16 :goto_0

    .line 113
    .line 114
    :sswitch_7
    const-string v0, "strokeDasharray"

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
    const/16 v3, 0x17

    .line 125
    .line 126
    goto/16 :goto_0

    .line 127
    .line 128
    :sswitch_8
    const-string v0, "markerStart"

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
    const/16 v3, 0x16

    .line 139
    .line 140
    goto/16 :goto_0

    .line 141
    .line 142
    :sswitch_9
    const-string v0, "width"

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
    const/16 v3, 0x15

    .line 153
    .line 154
    goto/16 :goto_0

    .line 155
    .line 156
    :sswitch_a
    const-string v0, "vectorEffect"

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
    const/16 v3, 0x14

    .line 167
    .line 168
    goto/16 :goto_0

    .line 169
    .line 170
    :sswitch_b
    const-string v0, "strokeMiterlimit"

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
    const/16 v3, 0x13

    .line 181
    .line 182
    goto/16 :goto_0

    .line 183
    .line 184
    :sswitch_c
    const-string v0, "name"

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
    const/16 v3, 0x12

    .line 195
    .line 196
    goto/16 :goto_0

    .line 197
    .line 198
    :sswitch_d
    const-string v0, "mask"

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
    const/16 v3, 0x11

    .line 209
    .line 210
    goto/16 :goto_0

    .line 211
    .line 212
    :sswitch_e
    const-string v0, "fill"

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
    const/16 v3, 0x10

    .line 223
    .line 224
    goto/16 :goto_0

    .line 225
    .line 226
    :sswitch_f
    const-string v0, "ry"

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
    const/16 v3, 0xf

    .line 237
    .line 238
    goto/16 :goto_0

    .line 239
    .line 240
    :sswitch_10
    const-string v0, "rx"

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
    const/16 v3, 0xe

    .line 251
    .line 252
    goto/16 :goto_0

    .line 253
    .line 254
    :sswitch_11
    const-string v0, "y"

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
    const/16 v3, 0xd

    .line 265
    .line 266
    goto/16 :goto_0

    .line 267
    .line 268
    :sswitch_12
    const-string v0, "x"

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
    const/16 v3, 0xc

    .line 279
    .line 280
    goto/16 :goto_0

    .line 281
    .line 282
    :sswitch_13
    const-string v0, "strokeDashoffset"

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
    const/16 v3, 0xb

    .line 293
    .line 294
    goto/16 :goto_0

    .line 295
    .line 296
    :sswitch_14
    const-string v0, "fillOpacity"

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
    const/16 v3, 0xa

    .line 307
    .line 308
    goto/16 :goto_0

    .line 309
    .line 310
    :sswitch_15
    const-string v0, "pointerEvents"

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
    const/16 v3, 0x9

    .line 321
    .line 322
    goto/16 :goto_0

    .line 323
    .line 324
    :sswitch_16
    const-string v0, "strokeOpacity"

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
    const/16 v3, 0x8

    .line 335
    .line 336
    goto/16 :goto_0

    .line 337
    .line 338
    :sswitch_17
    const-string v0, "fillRule"

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
    goto :goto_0

    .line 347
    :cond_17
    const/4 v3, 0x7

    .line 348
    goto :goto_0

    .line 349
    :sswitch_18
    const-string v0, "stroke"

    .line 350
    .line 351
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 352
    .line 353
    .line 354
    move-result v0

    .line 355
    if-nez v0, :cond_18

    .line 356
    .line 357
    goto :goto_0

    .line 358
    :cond_18
    const/4 v3, 0x6

    .line 359
    goto :goto_0

    .line 360
    :sswitch_19
    const-string v0, "markerMid"

    .line 361
    .line 362
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 363
    .line 364
    .line 365
    move-result v0

    .line 366
    if-nez v0, :cond_19

    .line 367
    .line 368
    goto :goto_0

    .line 369
    :cond_19
    const/4 v3, 0x5

    .line 370
    goto :goto_0

    .line 371
    :sswitch_1a
    const-string v0, "markerEnd"

    .line 372
    .line 373
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 374
    .line 375
    .line 376
    move-result v0

    .line 377
    if-nez v0, :cond_1a

    .line 378
    .line 379
    goto :goto_0

    .line 380
    :cond_1a
    const/4 v3, 0x4

    .line 381
    goto :goto_0

    .line 382
    :sswitch_1b
    const-string v0, "propList"

    .line 383
    .line 384
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 385
    .line 386
    .line 387
    move-result v0

    .line 388
    if-nez v0, :cond_1b

    .line 389
    .line 390
    goto :goto_0

    .line 391
    :cond_1b
    const/4 v3, 0x3

    .line 392
    goto :goto_0

    .line 393
    :sswitch_1c
    const-string v0, "matrix"

    .line 394
    .line 395
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 396
    .line 397
    .line 398
    move-result v0

    .line 399
    if-nez v0, :cond_1c

    .line 400
    .line 401
    goto :goto_0

    .line 402
    :cond_1c
    const/4 v3, 0x2

    .line 403
    goto :goto_0

    .line 404
    :sswitch_1d
    const-string v0, "height"

    .line 405
    .line 406
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 407
    .line 408
    .line 409
    move-result v0

    .line 410
    if-nez v0, :cond_1d

    .line 411
    .line 412
    goto :goto_0

    .line 413
    :cond_1d
    move v3, v1

    .line 414
    goto :goto_0

    .line 415
    :sswitch_1e
    const-string v0, "opacity"

    .line 416
    .line 417
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 418
    .line 419
    .line 420
    move-result v0

    .line 421
    if-nez v0, :cond_1e

    .line 422
    .line 423
    goto :goto_0

    .line 424
    :cond_1e
    move v3, v2

    .line 425
    :goto_0
    const/4 v0, 0x0

    .line 426
    const/high16 v4, 0x3f800000    # 1.0f

    .line 427
    .line 428
    const/4 v5, 0x0

    .line 429
    packed-switch v3, :pswitch_data_0

    .line 430
    .line 431
    .line 432
    invoke-super {p0, p1, p2, p3}, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->setProperty(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V

    .line 433
    .line 434
    .line 435
    goto/16 :goto_14

    .line 436
    .line 437
    :pswitch_0
    instance-of p2, p3, Ljava/lang/String;

    .line 438
    .line 439
    if-eqz p2, :cond_1f

    .line 440
    .line 441
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 442
    .line 443
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;

    .line 444
    .line 445
    check-cast p3, Ljava/lang/String;

    .line 446
    .line 447
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;->setStrokeWidth(Landroid/view/View;Ljava/lang/String;)V

    .line 448
    .line 449
    .line 450
    goto/16 :goto_14

    .line 451
    .line 452
    :cond_1f
    instance-of p2, p3, Ljava/lang/Double;

    .line 453
    .line 454
    if-eqz p2, :cond_20

    .line 455
    .line 456
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 457
    .line 458
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;

    .line 459
    .line 460
    check-cast p3, Ljava/lang/Double;

    .line 461
    .line 462
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;->setStrokeWidth(Landroid/view/View;Ljava/lang/Double;)V

    .line 463
    .line 464
    .line 465
    goto/16 :goto_14

    .line 466
    .line 467
    :cond_20
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 468
    .line 469
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;

    .line 470
    .line 471
    const-string p3, "1"

    .line 472
    .line 473
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;->setStrokeWidth(Landroid/view/View;Ljava/lang/String;)V

    .line 474
    .line 475
    .line 476
    goto/16 :goto_14

    .line 477
    .line 478
    :pswitch_1
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 479
    .line 480
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;

    .line 481
    .line 482
    if-nez p3, :cond_21

    .line 483
    .line 484
    goto :goto_1

    .line 485
    :cond_21
    check-cast p3, Ljava/lang/Boolean;

    .line 486
    .line 487
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 488
    .line 489
    .line 490
    move-result v2

    .line 491
    :goto_1
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;->setResponsible(Landroid/view/View;Z)V

    .line 492
    .line 493
    .line 494
    goto/16 :goto_14

    .line 495
    .line 496
    :pswitch_2
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 497
    .line 498
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;

    .line 499
    .line 500
    if-nez p3, :cond_22

    .line 501
    .line 502
    goto :goto_2

    .line 503
    :cond_22
    check-cast p3, Ljava/lang/Double;

    .line 504
    .line 505
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 506
    .line 507
    .line 508
    move-result v2

    .line 509
    :goto_2
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;->setStrokeLinejoin(Landroid/view/View;I)V

    .line 510
    .line 511
    .line 512
    goto/16 :goto_14

    .line 513
    .line 514
    :pswitch_3
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 515
    .line 516
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;

    .line 517
    .line 518
    if-nez p3, :cond_23

    .line 519
    .line 520
    goto :goto_3

    .line 521
    :cond_23
    move-object v5, p3

    .line 522
    check-cast v5, Ljava/lang/String;

    .line 523
    .line 524
    :goto_3
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;->setDisplay(Landroid/view/View;Ljava/lang/String;)V

    .line 525
    .line 526
    .line 527
    goto/16 :goto_14

    .line 528
    .line 529
    :pswitch_4
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 530
    .line 531
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;

    .line 532
    .line 533
    if-nez p3, :cond_24

    .line 534
    .line 535
    goto :goto_4

    .line 536
    :cond_24
    check-cast p3, Ljava/lang/Double;

    .line 537
    .line 538
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 539
    .line 540
    .line 541
    move-result v2

    .line 542
    :goto_4
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;->setStrokeLinecap(Landroid/view/View;I)V

    .line 543
    .line 544
    .line 545
    goto/16 :goto_14

    .line 546
    .line 547
    :pswitch_5
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 548
    .line 549
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;

    .line 550
    .line 551
    if-nez p3, :cond_25

    .line 552
    .line 553
    goto :goto_5

    .line 554
    :cond_25
    check-cast p3, Ljava/lang/Double;

    .line 555
    .line 556
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 557
    .line 558
    .line 559
    move-result v2

    .line 560
    :goto_5
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;->setClipRule(Landroid/view/View;I)V

    .line 561
    .line 562
    .line 563
    goto/16 :goto_14

    .line 564
    .line 565
    :pswitch_6
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 566
    .line 567
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;

    .line 568
    .line 569
    if-nez p3, :cond_26

    .line 570
    .line 571
    goto :goto_6

    .line 572
    :cond_26
    move-object v5, p3

    .line 573
    check-cast v5, Ljava/lang/String;

    .line 574
    .line 575
    :goto_6
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;->setClipPath(Landroid/view/View;Ljava/lang/String;)V

    .line 576
    .line 577
    .line 578
    goto/16 :goto_14

    .line 579
    .line 580
    :pswitch_7
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 581
    .line 582
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;

    .line 583
    .line 584
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 585
    .line 586
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;->setStrokeDasharray(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 587
    .line 588
    .line 589
    goto/16 :goto_14

    .line 590
    .line 591
    :pswitch_8
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 592
    .line 593
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;

    .line 594
    .line 595
    if-nez p3, :cond_27

    .line 596
    .line 597
    goto :goto_7

    .line 598
    :cond_27
    move-object v5, p3

    .line 599
    check-cast v5, Ljava/lang/String;

    .line 600
    .line 601
    :goto_7
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;->setMarkerStart(Landroid/view/View;Ljava/lang/String;)V

    .line 602
    .line 603
    .line 604
    goto/16 :goto_14

    .line 605
    .line 606
    :pswitch_9
    instance-of p2, p3, Ljava/lang/String;

    .line 607
    .line 608
    if-eqz p2, :cond_28

    .line 609
    .line 610
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 611
    .line 612
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;

    .line 613
    .line 614
    check-cast p3, Ljava/lang/String;

    .line 615
    .line 616
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;->setWidth(Landroid/view/View;Ljava/lang/String;)V

    .line 617
    .line 618
    .line 619
    goto/16 :goto_14

    .line 620
    .line 621
    :cond_28
    instance-of p2, p3, Ljava/lang/Double;

    .line 622
    .line 623
    if-eqz p2, :cond_29

    .line 624
    .line 625
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 626
    .line 627
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;

    .line 628
    .line 629
    check-cast p3, Ljava/lang/Double;

    .line 630
    .line 631
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;->setWidth(Landroid/view/View;Ljava/lang/Double;)V

    .line 632
    .line 633
    .line 634
    goto/16 :goto_14

    .line 635
    .line 636
    :cond_29
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 637
    .line 638
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;

    .line 639
    .line 640
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;->setWidth(Landroid/view/View;Ljava/lang/Double;)V

    .line 641
    .line 642
    .line 643
    goto/16 :goto_14

    .line 644
    .line 645
    :pswitch_a
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 646
    .line 647
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;

    .line 648
    .line 649
    if-nez p3, :cond_2a

    .line 650
    .line 651
    goto :goto_8

    .line 652
    :cond_2a
    check-cast p3, Ljava/lang/Double;

    .line 653
    .line 654
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 655
    .line 656
    .line 657
    move-result v2

    .line 658
    :goto_8
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;->setVectorEffect(Landroid/view/View;I)V

    .line 659
    .line 660
    .line 661
    goto/16 :goto_14

    .line 662
    .line 663
    :pswitch_b
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 664
    .line 665
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;

    .line 666
    .line 667
    if-nez p3, :cond_2b

    .line 668
    .line 669
    goto :goto_9

    .line 670
    :cond_2b
    check-cast p3, Ljava/lang/Double;

    .line 671
    .line 672
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 673
    .line 674
    .line 675
    move-result v0

    .line 676
    :goto_9
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;->setStrokeMiterlimit(Landroid/view/View;F)V

    .line 677
    .line 678
    .line 679
    goto/16 :goto_14

    .line 680
    .line 681
    :pswitch_c
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 682
    .line 683
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;

    .line 684
    .line 685
    if-nez p3, :cond_2c

    .line 686
    .line 687
    goto :goto_a

    .line 688
    :cond_2c
    move-object v5, p3

    .line 689
    check-cast v5, Ljava/lang/String;

    .line 690
    .line 691
    :goto_a
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;->setName(Landroid/view/View;Ljava/lang/String;)V

    .line 692
    .line 693
    .line 694
    goto/16 :goto_14

    .line 695
    .line 696
    :pswitch_d
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 697
    .line 698
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;

    .line 699
    .line 700
    if-nez p3, :cond_2d

    .line 701
    .line 702
    goto :goto_b

    .line 703
    :cond_2d
    move-object v5, p3

    .line 704
    check-cast v5, Ljava/lang/String;

    .line 705
    .line 706
    :goto_b
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;->setMask(Landroid/view/View;Ljava/lang/String;)V

    .line 707
    .line 708
    .line 709
    goto/16 :goto_14

    .line 710
    .line 711
    :pswitch_e
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 712
    .line 713
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;

    .line 714
    .line 715
    check-cast p3, Lcom/facebook/react/bridge/ReadableMap;

    .line 716
    .line 717
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;->setFill(Landroid/view/View;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 718
    .line 719
    .line 720
    goto/16 :goto_14

    .line 721
    .line 722
    :pswitch_f
    instance-of p2, p3, Ljava/lang/String;

    .line 723
    .line 724
    if-eqz p2, :cond_2e

    .line 725
    .line 726
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 727
    .line 728
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;

    .line 729
    .line 730
    check-cast p3, Ljava/lang/String;

    .line 731
    .line 732
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;->setRy(Landroid/view/View;Ljava/lang/String;)V

    .line 733
    .line 734
    .line 735
    goto/16 :goto_14

    .line 736
    .line 737
    :cond_2e
    instance-of p2, p3, Ljava/lang/Double;

    .line 738
    .line 739
    if-eqz p2, :cond_2f

    .line 740
    .line 741
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 742
    .line 743
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;

    .line 744
    .line 745
    check-cast p3, Ljava/lang/Double;

    .line 746
    .line 747
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;->setRy(Landroid/view/View;Ljava/lang/Double;)V

    .line 748
    .line 749
    .line 750
    goto/16 :goto_14

    .line 751
    .line 752
    :cond_2f
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 753
    .line 754
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;

    .line 755
    .line 756
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;->setRy(Landroid/view/View;Ljava/lang/Double;)V

    .line 757
    .line 758
    .line 759
    goto/16 :goto_14

    .line 760
    .line 761
    :pswitch_10
    instance-of p2, p3, Ljava/lang/String;

    .line 762
    .line 763
    if-eqz p2, :cond_30

    .line 764
    .line 765
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 766
    .line 767
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;

    .line 768
    .line 769
    check-cast p3, Ljava/lang/String;

    .line 770
    .line 771
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;->setRx(Landroid/view/View;Ljava/lang/String;)V

    .line 772
    .line 773
    .line 774
    goto/16 :goto_14

    .line 775
    .line 776
    :cond_30
    instance-of p2, p3, Ljava/lang/Double;

    .line 777
    .line 778
    if-eqz p2, :cond_31

    .line 779
    .line 780
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 781
    .line 782
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;

    .line 783
    .line 784
    check-cast p3, Ljava/lang/Double;

    .line 785
    .line 786
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;->setRx(Landroid/view/View;Ljava/lang/Double;)V

    .line 787
    .line 788
    .line 789
    goto/16 :goto_14

    .line 790
    .line 791
    :cond_31
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 792
    .line 793
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;

    .line 794
    .line 795
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;->setRx(Landroid/view/View;Ljava/lang/Double;)V

    .line 796
    .line 797
    .line 798
    goto/16 :goto_14

    .line 799
    .line 800
    :pswitch_11
    instance-of p2, p3, Ljava/lang/String;

    .line 801
    .line 802
    if-eqz p2, :cond_32

    .line 803
    .line 804
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 805
    .line 806
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;

    .line 807
    .line 808
    check-cast p3, Ljava/lang/String;

    .line 809
    .line 810
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;->setY(Landroid/view/View;Ljava/lang/String;)V

    .line 811
    .line 812
    .line 813
    goto/16 :goto_14

    .line 814
    .line 815
    :cond_32
    instance-of p2, p3, Ljava/lang/Double;

    .line 816
    .line 817
    if-eqz p2, :cond_33

    .line 818
    .line 819
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 820
    .line 821
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;

    .line 822
    .line 823
    check-cast p3, Ljava/lang/Double;

    .line 824
    .line 825
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;->setY(Landroid/view/View;Ljava/lang/Double;)V

    .line 826
    .line 827
    .line 828
    goto/16 :goto_14

    .line 829
    .line 830
    :cond_33
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 831
    .line 832
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;

    .line 833
    .line 834
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;->setY(Landroid/view/View;Ljava/lang/Double;)V

    .line 835
    .line 836
    .line 837
    goto/16 :goto_14

    .line 838
    .line 839
    :pswitch_12
    instance-of p2, p3, Ljava/lang/String;

    .line 840
    .line 841
    if-eqz p2, :cond_34

    .line 842
    .line 843
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 844
    .line 845
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;

    .line 846
    .line 847
    check-cast p3, Ljava/lang/String;

    .line 848
    .line 849
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;->setX(Landroid/view/View;Ljava/lang/String;)V

    .line 850
    .line 851
    .line 852
    goto/16 :goto_14

    .line 853
    .line 854
    :cond_34
    instance-of p2, p3, Ljava/lang/Double;

    .line 855
    .line 856
    if-eqz p2, :cond_35

    .line 857
    .line 858
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 859
    .line 860
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;

    .line 861
    .line 862
    check-cast p3, Ljava/lang/Double;

    .line 863
    .line 864
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;->setX(Landroid/view/View;Ljava/lang/Double;)V

    .line 865
    .line 866
    .line 867
    goto/16 :goto_14

    .line 868
    .line 869
    :cond_35
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 870
    .line 871
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;

    .line 872
    .line 873
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;->setX(Landroid/view/View;Ljava/lang/Double;)V

    .line 874
    .line 875
    .line 876
    goto/16 :goto_14

    .line 877
    .line 878
    :pswitch_13
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 879
    .line 880
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;

    .line 881
    .line 882
    if-nez p3, :cond_36

    .line 883
    .line 884
    goto :goto_c

    .line 885
    :cond_36
    check-cast p3, Ljava/lang/Double;

    .line 886
    .line 887
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 888
    .line 889
    .line 890
    move-result v0

    .line 891
    :goto_c
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;->setStrokeDashoffset(Landroid/view/View;F)V

    .line 892
    .line 893
    .line 894
    goto/16 :goto_14

    .line 895
    .line 896
    :pswitch_14
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 897
    .line 898
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;

    .line 899
    .line 900
    if-nez p3, :cond_37

    .line 901
    .line 902
    goto :goto_d

    .line 903
    :cond_37
    check-cast p3, Ljava/lang/Double;

    .line 904
    .line 905
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 906
    .line 907
    .line 908
    move-result v4

    .line 909
    :goto_d
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;->setFillOpacity(Landroid/view/View;F)V

    .line 910
    .line 911
    .line 912
    goto/16 :goto_14

    .line 913
    .line 914
    :pswitch_15
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 915
    .line 916
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;

    .line 917
    .line 918
    if-nez p3, :cond_38

    .line 919
    .line 920
    goto :goto_e

    .line 921
    :cond_38
    move-object v5, p3

    .line 922
    check-cast v5, Ljava/lang/String;

    .line 923
    .line 924
    :goto_e
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;->setPointerEvents(Landroid/view/View;Ljava/lang/String;)V

    .line 925
    .line 926
    .line 927
    goto/16 :goto_14

    .line 928
    .line 929
    :pswitch_16
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 930
    .line 931
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;

    .line 932
    .line 933
    if-nez p3, :cond_39

    .line 934
    .line 935
    goto :goto_f

    .line 936
    :cond_39
    check-cast p3, Ljava/lang/Double;

    .line 937
    .line 938
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 939
    .line 940
    .line 941
    move-result v4

    .line 942
    :goto_f
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;->setStrokeOpacity(Landroid/view/View;F)V

    .line 943
    .line 944
    .line 945
    goto/16 :goto_14

    .line 946
    .line 947
    :pswitch_17
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 948
    .line 949
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;

    .line 950
    .line 951
    if-nez p3, :cond_3a

    .line 952
    .line 953
    goto :goto_10

    .line 954
    :cond_3a
    check-cast p3, Ljava/lang/Double;

    .line 955
    .line 956
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 957
    .line 958
    .line 959
    move-result v1

    .line 960
    :goto_10
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;->setFillRule(Landroid/view/View;I)V

    .line 961
    .line 962
    .line 963
    goto/16 :goto_14

    .line 964
    .line 965
    :pswitch_18
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 966
    .line 967
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;

    .line 968
    .line 969
    check-cast p3, Lcom/facebook/react/bridge/ReadableMap;

    .line 970
    .line 971
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;->setStroke(Landroid/view/View;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 972
    .line 973
    .line 974
    goto :goto_14

    .line 975
    :pswitch_19
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 976
    .line 977
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;

    .line 978
    .line 979
    if-nez p3, :cond_3b

    .line 980
    .line 981
    goto :goto_11

    .line 982
    :cond_3b
    move-object v5, p3

    .line 983
    check-cast v5, Ljava/lang/String;

    .line 984
    .line 985
    :goto_11
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;->setMarkerMid(Landroid/view/View;Ljava/lang/String;)V

    .line 986
    .line 987
    .line 988
    goto :goto_14

    .line 989
    :pswitch_1a
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 990
    .line 991
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;

    .line 992
    .line 993
    if-nez p3, :cond_3c

    .line 994
    .line 995
    goto :goto_12

    .line 996
    :cond_3c
    move-object v5, p3

    .line 997
    check-cast v5, Ljava/lang/String;

    .line 998
    .line 999
    :goto_12
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;->setMarkerEnd(Landroid/view/View;Ljava/lang/String;)V

    .line 1000
    .line 1001
    .line 1002
    goto :goto_14

    .line 1003
    :pswitch_1b
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1004
    .line 1005
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;

    .line 1006
    .line 1007
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 1008
    .line 1009
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;->setPropList(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 1010
    .line 1011
    .line 1012
    goto :goto_14

    .line 1013
    :pswitch_1c
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1014
    .line 1015
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;

    .line 1016
    .line 1017
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 1018
    .line 1019
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;->setMatrix(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 1020
    .line 1021
    .line 1022
    goto :goto_14

    .line 1023
    :pswitch_1d
    instance-of p2, p3, Ljava/lang/String;

    .line 1024
    .line 1025
    if-eqz p2, :cond_3d

    .line 1026
    .line 1027
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1028
    .line 1029
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;

    .line 1030
    .line 1031
    check-cast p3, Ljava/lang/String;

    .line 1032
    .line 1033
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;->setHeight(Landroid/view/View;Ljava/lang/String;)V

    .line 1034
    .line 1035
    .line 1036
    goto :goto_14

    .line 1037
    :cond_3d
    instance-of p2, p3, Ljava/lang/Double;

    .line 1038
    .line 1039
    if-eqz p2, :cond_3e

    .line 1040
    .line 1041
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1042
    .line 1043
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;

    .line 1044
    .line 1045
    check-cast p3, Ljava/lang/Double;

    .line 1046
    .line 1047
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;->setHeight(Landroid/view/View;Ljava/lang/Double;)V

    .line 1048
    .line 1049
    .line 1050
    goto :goto_14

    .line 1051
    :cond_3e
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1052
    .line 1053
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;

    .line 1054
    .line 1055
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;->setHeight(Landroid/view/View;Ljava/lang/Double;)V

    .line 1056
    .line 1057
    .line 1058
    goto :goto_14

    .line 1059
    :pswitch_1e
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1060
    .line 1061
    if-nez p3, :cond_3f

    .line 1062
    .line 1063
    goto :goto_13

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
    :goto_13
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/uimanager/BaseViewManagerInterface;->setOpacity(Landroid/view/View;F)V

    .line 1071
    .line 1072
    .line 1073
    :goto_14
    return-void

    .line 1074
    nop

    .line 1075
    :sswitch_data_0
    .sparse-switch
        -0x4b8807f5 -> :sswitch_1e
        -0x48c76ed9 -> :sswitch_1d
        -0x4072683f -> :sswitch_1c
        -0x3b3da15f -> :sswitch_1b
        -0x37a9a5bf -> :sswitch_1a
        -0x37a98852 -> :sswitch_19
        -0x352a89c8 -> :sswitch_18
        -0x2b7578e1 -> :sswitch_17
        -0x18d3d54d -> :sswitch_16
        -0x117e564a -> :sswitch_15
        -0x3330ef8 -> :sswitch_14
        -0x2a83503 -> :sswitch_13
        0x78 -> :sswitch_12
        0x79 -> :sswitch_11
        0xe46 -> :sswitch_10
        0xe47 -> :sswitch_f
        0x2ff583 -> :sswitch_e
        0x3306ec -> :sswitch_d
        0x337a8b -> :sswitch_c
        0x4b3162e -> :sswitch_b
        0x63a48b4 -> :sswitch_a
        0x6be2dc6 -> :sswitch_9
        0xcf0d448 -> :sswitch_8
        0x17f096af -> :sswitch_7
        0x36b25395 -> :sswitch_6
        0x36b3866c -> :sswitch_5
        0x3d3f8e06 -> :sswitch_4
        0x63a518c2 -> :sswitch_3
        0x6ab59576 -> :sswitch_2
        0x6e2146f6 -> :sswitch_1
        0x72aeea6e -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_0
    .packed-switch 0x0
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
