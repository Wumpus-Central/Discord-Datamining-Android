.class public Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerDelegate;
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
        "Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface<",
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
    const/16 v3, 0x1e

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
    const/16 v3, 0x1d

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
    const/16 v3, 0x1c

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
    const/16 v3, 0x1b

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
    const/16 v3, 0x1a

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
    const/16 v3, 0x19

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
    const/16 v3, 0x18

    .line 125
    .line 126
    goto/16 :goto_0

    .line 127
    .line 128
    :sswitch_8
    const-string v0, "fontSize"

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
    const-string v0, "strokeMiterlimit"

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
    const-string v0, "name"

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
    const-string v0, "mask"

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
    const-string v0, "font"

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
    const/16 v3, 0xe

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
    const/16 v3, 0xd

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
    const/16 v3, 0xc

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
    const/16 v3, 0xb

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
    const/16 v3, 0xa

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
    const/16 v3, 0x9

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
    const-string v0, "fontWeight"

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
    goto/16 :goto_14

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
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;

    .line 458
    .line 459
    check-cast p3, Ljava/lang/String;

    .line 460
    .line 461
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;->setStrokeWidth(Landroid/view/View;Ljava/lang/String;)V

    .line 462
    .line 463
    .line 464
    goto/16 :goto_14

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
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;

    .line 473
    .line 474
    check-cast p3, Ljava/lang/Double;

    .line 475
    .line 476
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;->setStrokeWidth(Landroid/view/View;Ljava/lang/Double;)V

    .line 477
    .line 478
    .line 479
    goto/16 :goto_14

    .line 480
    .line 481
    :cond_21
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 482
    .line 483
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;

    .line 484
    .line 485
    const-string p3, "1"

    .line 486
    .line 487
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;->setStrokeWidth(Landroid/view/View;Ljava/lang/String;)V

    .line 488
    .line 489
    .line 490
    goto/16 :goto_14

    .line 491
    .line 492
    :pswitch_1
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 493
    .line 494
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;

    .line 495
    .line 496
    if-nez p3, :cond_22

    .line 497
    .line 498
    goto :goto_1

    .line 499
    :cond_22
    check-cast p3, Ljava/lang/Boolean;

    .line 500
    .line 501
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 502
    .line 503
    .line 504
    move-result v2

    .line 505
    :goto_1
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;->setResponsible(Landroid/view/View;Z)V

    .line 506
    .line 507
    .line 508
    goto/16 :goto_14

    .line 509
    .line 510
    :pswitch_2
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 511
    .line 512
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;

    .line 513
    .line 514
    if-nez p3, :cond_23

    .line 515
    .line 516
    goto :goto_2

    .line 517
    :cond_23
    check-cast p3, Ljava/lang/Double;

    .line 518
    .line 519
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 520
    .line 521
    .line 522
    move-result v2

    .line 523
    :goto_2
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;->setStrokeLinejoin(Landroid/view/View;I)V

    .line 524
    .line 525
    .line 526
    goto/16 :goto_14

    .line 527
    .line 528
    :pswitch_3
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 529
    .line 530
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;

    .line 531
    .line 532
    if-nez p3, :cond_24

    .line 533
    .line 534
    goto :goto_3

    .line 535
    :cond_24
    move-object v5, p3

    .line 536
    check-cast v5, Ljava/lang/String;

    .line 537
    .line 538
    :goto_3
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;->setDisplay(Landroid/view/View;Ljava/lang/String;)V

    .line 539
    .line 540
    .line 541
    goto/16 :goto_14

    .line 542
    .line 543
    :pswitch_4
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 544
    .line 545
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;

    .line 546
    .line 547
    if-nez p3, :cond_25

    .line 548
    .line 549
    goto :goto_4

    .line 550
    :cond_25
    check-cast p3, Ljava/lang/Double;

    .line 551
    .line 552
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 553
    .line 554
    .line 555
    move-result v2

    .line 556
    :goto_4
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;->setStrokeLinecap(Landroid/view/View;I)V

    .line 557
    .line 558
    .line 559
    goto/16 :goto_14

    .line 560
    .line 561
    :pswitch_5
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 562
    .line 563
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;

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
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;->setClipRule(Landroid/view/View;I)V

    .line 575
    .line 576
    .line 577
    goto/16 :goto_14

    .line 578
    .line 579
    :pswitch_6
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 580
    .line 581
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;

    .line 582
    .line 583
    if-nez p3, :cond_27

    .line 584
    .line 585
    goto :goto_6

    .line 586
    :cond_27
    move-object v5, p3

    .line 587
    check-cast v5, Ljava/lang/String;

    .line 588
    .line 589
    :goto_6
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;->setClipPath(Landroid/view/View;Ljava/lang/String;)V

    .line 590
    .line 591
    .line 592
    goto/16 :goto_14

    .line 593
    .line 594
    :pswitch_7
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 595
    .line 596
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;

    .line 597
    .line 598
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 599
    .line 600
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;->setStrokeDasharray(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 601
    .line 602
    .line 603
    goto/16 :goto_14

    .line 604
    .line 605
    :pswitch_8
    instance-of p2, p3, Ljava/lang/String;

    .line 606
    .line 607
    if-eqz p2, :cond_28

    .line 608
    .line 609
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 610
    .line 611
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;

    .line 612
    .line 613
    check-cast p3, Ljava/lang/String;

    .line 614
    .line 615
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;->setFontSize(Landroid/view/View;Ljava/lang/String;)V

    .line 616
    .line 617
    .line 618
    goto/16 :goto_14

    .line 619
    .line 620
    :cond_28
    instance-of p2, p3, Ljava/lang/Double;

    .line 621
    .line 622
    if-eqz p2, :cond_29

    .line 623
    .line 624
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 625
    .line 626
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;

    .line 627
    .line 628
    check-cast p3, Ljava/lang/Double;

    .line 629
    .line 630
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;->setFontSize(Landroid/view/View;Ljava/lang/Double;)V

    .line 631
    .line 632
    .line 633
    goto/16 :goto_14

    .line 634
    .line 635
    :cond_29
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 636
    .line 637
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;

    .line 638
    .line 639
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;->setFontSize(Landroid/view/View;Ljava/lang/Double;)V

    .line 640
    .line 641
    .line 642
    goto/16 :goto_14

    .line 643
    .line 644
    :pswitch_9
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 645
    .line 646
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;

    .line 647
    .line 648
    if-nez p3, :cond_2a

    .line 649
    .line 650
    goto :goto_7

    .line 651
    :cond_2a
    move-object v5, p3

    .line 652
    check-cast v5, Ljava/lang/String;

    .line 653
    .line 654
    :goto_7
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;->setMarkerStart(Landroid/view/View;Ljava/lang/String;)V

    .line 655
    .line 656
    .line 657
    goto/16 :goto_14

    .line 658
    .line 659
    :pswitch_a
    instance-of p2, p3, Ljava/lang/String;

    .line 660
    .line 661
    if-eqz p2, :cond_2b

    .line 662
    .line 663
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 664
    .line 665
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;

    .line 666
    .line 667
    check-cast p3, Ljava/lang/String;

    .line 668
    .line 669
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;->setWidth(Landroid/view/View;Ljava/lang/String;)V

    .line 670
    .line 671
    .line 672
    goto/16 :goto_14

    .line 673
    .line 674
    :cond_2b
    instance-of p2, p3, Ljava/lang/Double;

    .line 675
    .line 676
    if-eqz p2, :cond_2c

    .line 677
    .line 678
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 679
    .line 680
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;

    .line 681
    .line 682
    check-cast p3, Ljava/lang/Double;

    .line 683
    .line 684
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;->setWidth(Landroid/view/View;Ljava/lang/Double;)V

    .line 685
    .line 686
    .line 687
    goto/16 :goto_14

    .line 688
    .line 689
    :cond_2c
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 690
    .line 691
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;

    .line 692
    .line 693
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;->setWidth(Landroid/view/View;Ljava/lang/Double;)V

    .line 694
    .line 695
    .line 696
    goto/16 :goto_14

    .line 697
    .line 698
    :pswitch_b
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 699
    .line 700
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;

    .line 701
    .line 702
    if-nez p3, :cond_2d

    .line 703
    .line 704
    goto :goto_8

    .line 705
    :cond_2d
    check-cast p3, Ljava/lang/Double;

    .line 706
    .line 707
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 708
    .line 709
    .line 710
    move-result v2

    .line 711
    :goto_8
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;->setVectorEffect(Landroid/view/View;I)V

    .line 712
    .line 713
    .line 714
    goto/16 :goto_14

    .line 715
    .line 716
    :pswitch_c
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 717
    .line 718
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;

    .line 719
    .line 720
    if-nez p3, :cond_2e

    .line 721
    .line 722
    goto :goto_9

    .line 723
    :cond_2e
    check-cast p3, Ljava/lang/Double;

    .line 724
    .line 725
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 726
    .line 727
    .line 728
    move-result v0

    .line 729
    :goto_9
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;->setStrokeMiterlimit(Landroid/view/View;F)V

    .line 730
    .line 731
    .line 732
    goto/16 :goto_14

    .line 733
    .line 734
    :pswitch_d
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 735
    .line 736
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;

    .line 737
    .line 738
    if-nez p3, :cond_2f

    .line 739
    .line 740
    goto :goto_a

    .line 741
    :cond_2f
    move-object v5, p3

    .line 742
    check-cast v5, Ljava/lang/String;

    .line 743
    .line 744
    :goto_a
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;->setName(Landroid/view/View;Ljava/lang/String;)V

    .line 745
    .line 746
    .line 747
    goto/16 :goto_14

    .line 748
    .line 749
    :pswitch_e
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 750
    .line 751
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;

    .line 752
    .line 753
    if-nez p3, :cond_30

    .line 754
    .line 755
    goto :goto_b

    .line 756
    :cond_30
    move-object v5, p3

    .line 757
    check-cast v5, Ljava/lang/String;

    .line 758
    .line 759
    :goto_b
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;->setMask(Landroid/view/View;Ljava/lang/String;)V

    .line 760
    .line 761
    .line 762
    goto/16 :goto_14

    .line 763
    .line 764
    :pswitch_f
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 765
    .line 766
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;

    .line 767
    .line 768
    check-cast p3, Lcom/facebook/react/bridge/ReadableMap;

    .line 769
    .line 770
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;->setFont(Landroid/view/View;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 771
    .line 772
    .line 773
    goto/16 :goto_14

    .line 774
    .line 775
    :pswitch_10
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 776
    .line 777
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;

    .line 778
    .line 779
    check-cast p3, Lcom/facebook/react/bridge/ReadableMap;

    .line 780
    .line 781
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;->setFill(Landroid/view/View;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 782
    .line 783
    .line 784
    goto/16 :goto_14

    .line 785
    .line 786
    :pswitch_11
    instance-of p2, p3, Ljava/lang/String;

    .line 787
    .line 788
    if-eqz p2, :cond_31

    .line 789
    .line 790
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 791
    .line 792
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;

    .line 793
    .line 794
    check-cast p3, Ljava/lang/String;

    .line 795
    .line 796
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;->setY(Landroid/view/View;Ljava/lang/String;)V

    .line 797
    .line 798
    .line 799
    goto/16 :goto_14

    .line 800
    .line 801
    :cond_31
    instance-of p2, p3, Ljava/lang/Double;

    .line 802
    .line 803
    if-eqz p2, :cond_32

    .line 804
    .line 805
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 806
    .line 807
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;

    .line 808
    .line 809
    check-cast p3, Ljava/lang/Double;

    .line 810
    .line 811
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;->setY(Landroid/view/View;Ljava/lang/Double;)V

    .line 812
    .line 813
    .line 814
    goto/16 :goto_14

    .line 815
    .line 816
    :cond_32
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 817
    .line 818
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;

    .line 819
    .line 820
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;->setY(Landroid/view/View;Ljava/lang/Double;)V

    .line 821
    .line 822
    .line 823
    goto/16 :goto_14

    .line 824
    .line 825
    :pswitch_12
    instance-of p2, p3, Ljava/lang/String;

    .line 826
    .line 827
    if-eqz p2, :cond_33

    .line 828
    .line 829
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 830
    .line 831
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;

    .line 832
    .line 833
    check-cast p3, Ljava/lang/String;

    .line 834
    .line 835
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;->setX(Landroid/view/View;Ljava/lang/String;)V

    .line 836
    .line 837
    .line 838
    goto/16 :goto_14

    .line 839
    .line 840
    :cond_33
    instance-of p2, p3, Ljava/lang/Double;

    .line 841
    .line 842
    if-eqz p2, :cond_34

    .line 843
    .line 844
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 845
    .line 846
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;

    .line 847
    .line 848
    check-cast p3, Ljava/lang/Double;

    .line 849
    .line 850
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;->setX(Landroid/view/View;Ljava/lang/Double;)V

    .line 851
    .line 852
    .line 853
    goto/16 :goto_14

    .line 854
    .line 855
    :cond_34
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 856
    .line 857
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;

    .line 858
    .line 859
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;->setX(Landroid/view/View;Ljava/lang/Double;)V

    .line 860
    .line 861
    .line 862
    goto/16 :goto_14

    .line 863
    .line 864
    :pswitch_13
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 865
    .line 866
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;

    .line 867
    .line 868
    if-nez p3, :cond_35

    .line 869
    .line 870
    goto :goto_c

    .line 871
    :cond_35
    check-cast p3, Ljava/lang/Double;

    .line 872
    .line 873
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 874
    .line 875
    .line 876
    move-result v0

    .line 877
    :goto_c
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;->setStrokeDashoffset(Landroid/view/View;F)V

    .line 878
    .line 879
    .line 880
    goto/16 :goto_14

    .line 881
    .line 882
    :pswitch_14
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 883
    .line 884
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;

    .line 885
    .line 886
    if-nez p3, :cond_36

    .line 887
    .line 888
    goto :goto_d

    .line 889
    :cond_36
    check-cast p3, Ljava/lang/Double;

    .line 890
    .line 891
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 892
    .line 893
    .line 894
    move-result v4

    .line 895
    :goto_d
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;->setFillOpacity(Landroid/view/View;F)V

    .line 896
    .line 897
    .line 898
    goto/16 :goto_14

    .line 899
    .line 900
    :pswitch_15
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 901
    .line 902
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;

    .line 903
    .line 904
    if-nez p3, :cond_37

    .line 905
    .line 906
    goto :goto_e

    .line 907
    :cond_37
    move-object v5, p3

    .line 908
    check-cast v5, Ljava/lang/String;

    .line 909
    .line 910
    :goto_e
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;->setPointerEvents(Landroid/view/View;Ljava/lang/String;)V

    .line 911
    .line 912
    .line 913
    goto/16 :goto_14

    .line 914
    .line 915
    :pswitch_16
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 916
    .line 917
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;

    .line 918
    .line 919
    if-nez p3, :cond_38

    .line 920
    .line 921
    goto :goto_f

    .line 922
    :cond_38
    check-cast p3, Ljava/lang/Double;

    .line 923
    .line 924
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 925
    .line 926
    .line 927
    move-result v4

    .line 928
    :goto_f
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;->setStrokeOpacity(Landroid/view/View;F)V

    .line 929
    .line 930
    .line 931
    goto/16 :goto_14

    .line 932
    .line 933
    :pswitch_17
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 934
    .line 935
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;

    .line 936
    .line 937
    if-nez p3, :cond_39

    .line 938
    .line 939
    goto :goto_10

    .line 940
    :cond_39
    check-cast p3, Ljava/lang/Double;

    .line 941
    .line 942
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 943
    .line 944
    .line 945
    move-result v1

    .line 946
    :goto_10
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;->setFillRule(Landroid/view/View;I)V

    .line 947
    .line 948
    .line 949
    goto/16 :goto_14

    .line 950
    .line 951
    :pswitch_18
    instance-of p2, p3, Ljava/lang/String;

    .line 952
    .line 953
    if-eqz p2, :cond_3a

    .line 954
    .line 955
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 956
    .line 957
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;

    .line 958
    .line 959
    check-cast p3, Ljava/lang/String;

    .line 960
    .line 961
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;->setFontWeight(Landroid/view/View;Ljava/lang/String;)V

    .line 962
    .line 963
    .line 964
    goto/16 :goto_14

    .line 965
    .line 966
    :cond_3a
    instance-of p2, p3, Ljava/lang/Double;

    .line 967
    .line 968
    if-eqz p2, :cond_3b

    .line 969
    .line 970
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 971
    .line 972
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;

    .line 973
    .line 974
    check-cast p3, Ljava/lang/Double;

    .line 975
    .line 976
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;->setFontWeight(Landroid/view/View;Ljava/lang/Double;)V

    .line 977
    .line 978
    .line 979
    goto/16 :goto_14

    .line 980
    .line 981
    :cond_3b
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 982
    .line 983
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;

    .line 984
    .line 985
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;->setFontWeight(Landroid/view/View;Ljava/lang/Double;)V

    .line 986
    .line 987
    .line 988
    goto/16 :goto_14

    .line 989
    .line 990
    :pswitch_19
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 991
    .line 992
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;

    .line 993
    .line 994
    check-cast p3, Lcom/facebook/react/bridge/ReadableMap;

    .line 995
    .line 996
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;->setStroke(Landroid/view/View;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 997
    .line 998
    .line 999
    goto :goto_14

    .line 1000
    :pswitch_1a
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1001
    .line 1002
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;

    .line 1003
    .line 1004
    if-nez p3, :cond_3c

    .line 1005
    .line 1006
    goto :goto_11

    .line 1007
    :cond_3c
    move-object v5, p3

    .line 1008
    check-cast v5, Ljava/lang/String;

    .line 1009
    .line 1010
    :goto_11
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;->setMarkerMid(Landroid/view/View;Ljava/lang/String;)V

    .line 1011
    .line 1012
    .line 1013
    goto :goto_14

    .line 1014
    :pswitch_1b
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1015
    .line 1016
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;

    .line 1017
    .line 1018
    if-nez p3, :cond_3d

    .line 1019
    .line 1020
    goto :goto_12

    .line 1021
    :cond_3d
    move-object v5, p3

    .line 1022
    check-cast v5, Ljava/lang/String;

    .line 1023
    .line 1024
    :goto_12
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;->setMarkerEnd(Landroid/view/View;Ljava/lang/String;)V

    .line 1025
    .line 1026
    .line 1027
    goto :goto_14

    .line 1028
    :pswitch_1c
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1029
    .line 1030
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;

    .line 1031
    .line 1032
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 1033
    .line 1034
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;->setPropList(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 1035
    .line 1036
    .line 1037
    goto :goto_14

    .line 1038
    :pswitch_1d
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1039
    .line 1040
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;

    .line 1041
    .line 1042
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 1043
    .line 1044
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;->setMatrix(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 1045
    .line 1046
    .line 1047
    goto :goto_14

    .line 1048
    :pswitch_1e
    instance-of p2, p3, Ljava/lang/String;

    .line 1049
    .line 1050
    if-eqz p2, :cond_3e

    .line 1051
    .line 1052
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1053
    .line 1054
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;

    .line 1055
    .line 1056
    check-cast p3, Ljava/lang/String;

    .line 1057
    .line 1058
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;->setHeight(Landroid/view/View;Ljava/lang/String;)V

    .line 1059
    .line 1060
    .line 1061
    goto :goto_14

    .line 1062
    :cond_3e
    instance-of p2, p3, Ljava/lang/Double;

    .line 1063
    .line 1064
    if-eqz p2, :cond_3f

    .line 1065
    .line 1066
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1067
    .line 1068
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;

    .line 1069
    .line 1070
    check-cast p3, Ljava/lang/Double;

    .line 1071
    .line 1072
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;->setHeight(Landroid/view/View;Ljava/lang/Double;)V

    .line 1073
    .line 1074
    .line 1075
    goto :goto_14

    .line 1076
    :cond_3f
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1077
    .line 1078
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;

    .line 1079
    .line 1080
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;->setHeight(Landroid/view/View;Ljava/lang/Double;)V

    .line 1081
    .line 1082
    .line 1083
    goto :goto_14

    .line 1084
    :pswitch_1f
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 1085
    .line 1086
    if-nez p3, :cond_40

    .line 1087
    .line 1088
    goto :goto_13

    .line 1089
    :cond_40
    check-cast p3, Ljava/lang/Double;

    .line 1090
    .line 1091
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 1092
    .line 1093
    .line 1094
    move-result v4

    .line 1095
    :goto_13
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/uimanager/BaseViewManagerInterface;->setOpacity(Landroid/view/View;F)V

    .line 1096
    .line 1097
    .line 1098
    :goto_14
    return-void

    .line 1099
    :sswitch_data_0
    .sparse-switch
        -0x4b8807f5 -> :sswitch_1f
        -0x48c76ed9 -> :sswitch_1e
        -0x4072683f -> :sswitch_1d
        -0x3b3da15f -> :sswitch_1c
        -0x37a9a5bf -> :sswitch_1b
        -0x37a98852 -> :sswitch_1a
        -0x352a89c8 -> :sswitch_19
        -0x2bc67c59 -> :sswitch_18
        -0x2b7578e1 -> :sswitch_17
        -0x18d3d54d -> :sswitch_16
        -0x117e564a -> :sswitch_15
        -0x3330ef8 -> :sswitch_14
        -0x2a83503 -> :sswitch_13
        0x78 -> :sswitch_12
        0x79 -> :sswitch_11
        0x2ff583 -> :sswitch_10
        0x300c4f -> :sswitch_f
        0x3306ec -> :sswitch_e
        0x337a8b -> :sswitch_d
        0x4b3162e -> :sswitch_c
        0x63a48b4 -> :sswitch_b
        0x6be2dc6 -> :sswitch_a
        0xcf0d448 -> :sswitch_9
        0x15caa0f0 -> :sswitch_8
        0x17f096af -> :sswitch_7
        0x36b25395 -> :sswitch_6
        0x36b3866c -> :sswitch_5
        0x3d3f8e06 -> :sswitch_4
        0x63a518c2 -> :sswitch_3
        0x6ab59576 -> :sswitch_2
        0x6e2146f6 -> :sswitch_1
        0x72aeea6e -> :sswitch_0
    .end sparse-switch

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
