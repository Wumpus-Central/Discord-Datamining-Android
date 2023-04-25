.class public Lcom/facebook/react/viewmanagers/RNSVGGroupManagerDelegate;
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
        "Lcom/facebook/react/viewmanagers/RNSVGGroupManagerInterface<",
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
    const/16 v3, 0x1b

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
    const/16 v3, 0x1a

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
    const/16 v3, 0x19

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
    const/16 v3, 0x18

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
    const/16 v3, 0x17

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
    const/16 v3, 0x16

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
    const/16 v3, 0x15

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
    const/16 v3, 0x14

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
    const/16 v3, 0x13

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
    const/16 v3, 0x12

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
    const/16 v3, 0x11

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
    const/16 v3, 0x10

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
    const/16 v3, 0xf

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
    const/16 v3, 0xe

    .line 209
    .line 210
    goto/16 :goto_0

    .line 211
    .line 212
    :sswitch_e
    const-string v0, "font"

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
    const/16 v3, 0xd

    .line 223
    .line 224
    goto/16 :goto_0

    .line 225
    .line 226
    :sswitch_f
    const-string v0, "fill"

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
    const/16 v3, 0xc

    .line 237
    .line 238
    goto/16 :goto_0

    .line 239
    .line 240
    :sswitch_10
    const-string v0, "strokeDashoffset"

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
    const/16 v3, 0xb

    .line 251
    .line 252
    goto/16 :goto_0

    .line 253
    .line 254
    :sswitch_11
    const-string v0, "fillOpacity"

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
    const/16 v3, 0xa

    .line 265
    .line 266
    goto/16 :goto_0

    .line 267
    .line 268
    :sswitch_12
    const-string v0, "pointerEvents"

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
    const/16 v3, 0x9

    .line 279
    .line 280
    goto/16 :goto_0

    .line 281
    .line 282
    :sswitch_13
    const-string v0, "strokeOpacity"

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
    const/16 v3, 0x8

    .line 293
    .line 294
    goto/16 :goto_0

    .line 295
    .line 296
    :sswitch_14
    const-string v0, "fillRule"

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
    goto :goto_0

    .line 305
    :cond_14
    const/4 v3, 0x7

    .line 306
    goto :goto_0

    .line 307
    :sswitch_15
    const-string v0, "fontWeight"

    .line 308
    .line 309
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 310
    .line 311
    .line 312
    move-result v0

    .line 313
    if-nez v0, :cond_15

    .line 314
    .line 315
    goto :goto_0

    .line 316
    :cond_15
    const/4 v3, 0x6

    .line 317
    goto :goto_0

    .line 318
    :sswitch_16
    const-string v0, "stroke"

    .line 319
    .line 320
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 321
    .line 322
    .line 323
    move-result v0

    .line 324
    if-nez v0, :cond_16

    .line 325
    .line 326
    goto :goto_0

    .line 327
    :cond_16
    const/4 v3, 0x5

    .line 328
    goto :goto_0

    .line 329
    :sswitch_17
    const-string v0, "markerMid"

    .line 330
    .line 331
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 332
    .line 333
    .line 334
    move-result v0

    .line 335
    if-nez v0, :cond_17

    .line 336
    .line 337
    goto :goto_0

    .line 338
    :cond_17
    const/4 v3, 0x4

    .line 339
    goto :goto_0

    .line 340
    :sswitch_18
    const-string v0, "markerEnd"

    .line 341
    .line 342
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 343
    .line 344
    .line 345
    move-result v0

    .line 346
    if-nez v0, :cond_18

    .line 347
    .line 348
    goto :goto_0

    .line 349
    :cond_18
    const/4 v3, 0x3

    .line 350
    goto :goto_0

    .line 351
    :sswitch_19
    const-string v0, "propList"

    .line 352
    .line 353
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 354
    .line 355
    .line 356
    move-result v0

    .line 357
    if-nez v0, :cond_19

    .line 358
    .line 359
    goto :goto_0

    .line 360
    :cond_19
    const/4 v3, 0x2

    .line 361
    goto :goto_0

    .line 362
    :sswitch_1a
    const-string v0, "matrix"

    .line 363
    .line 364
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 365
    .line 366
    .line 367
    move-result v0

    .line 368
    if-nez v0, :cond_1a

    .line 369
    .line 370
    goto :goto_0

    .line 371
    :cond_1a
    move v3, v1

    .line 372
    goto :goto_0

    .line 373
    :sswitch_1b
    const-string v0, "opacity"

    .line 374
    .line 375
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 376
    .line 377
    .line 378
    move-result v0

    .line 379
    if-nez v0, :cond_1b

    .line 380
    .line 381
    goto :goto_0

    .line 382
    :cond_1b
    move v3, v2

    .line 383
    :goto_0
    const/4 v0, 0x0

    .line 384
    const/high16 v4, 0x3f800000    # 1.0f

    .line 385
    .line 386
    const/4 v5, 0x0

    .line 387
    packed-switch v3, :pswitch_data_0

    .line 388
    .line 389
    .line 390
    invoke-super {p0, p1, p2, p3}, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->setProperty(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V

    .line 391
    .line 392
    .line 393
    goto/16 :goto_14

    .line 394
    .line 395
    :pswitch_0
    instance-of p2, p3, Ljava/lang/String;

    .line 396
    .line 397
    if-eqz p2, :cond_1c

    .line 398
    .line 399
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 400
    .line 401
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGGroupManagerInterface;

    .line 402
    .line 403
    check-cast p3, Ljava/lang/String;

    .line 404
    .line 405
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGGroupManagerInterface;->setStrokeWidth(Landroid/view/View;Ljava/lang/String;)V

    .line 406
    .line 407
    .line 408
    goto/16 :goto_14

    .line 409
    .line 410
    :cond_1c
    instance-of p2, p3, Ljava/lang/Double;

    .line 411
    .line 412
    if-eqz p2, :cond_1d

    .line 413
    .line 414
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 415
    .line 416
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGGroupManagerInterface;

    .line 417
    .line 418
    check-cast p3, Ljava/lang/Double;

    .line 419
    .line 420
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGGroupManagerInterface;->setStrokeWidth(Landroid/view/View;Ljava/lang/Double;)V

    .line 421
    .line 422
    .line 423
    goto/16 :goto_14

    .line 424
    .line 425
    :cond_1d
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 426
    .line 427
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGGroupManagerInterface;

    .line 428
    .line 429
    const-string p3, "1"

    .line 430
    .line 431
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGGroupManagerInterface;->setStrokeWidth(Landroid/view/View;Ljava/lang/String;)V

    .line 432
    .line 433
    .line 434
    goto/16 :goto_14

    .line 435
    .line 436
    :pswitch_1
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 437
    .line 438
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGGroupManagerInterface;

    .line 439
    .line 440
    if-nez p3, :cond_1e

    .line 441
    .line 442
    goto :goto_1

    .line 443
    :cond_1e
    check-cast p3, Ljava/lang/Boolean;

    .line 444
    .line 445
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 446
    .line 447
    .line 448
    move-result v2

    .line 449
    :goto_1
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGGroupManagerInterface;->setResponsible(Landroid/view/View;Z)V

    .line 450
    .line 451
    .line 452
    goto/16 :goto_14

    .line 453
    .line 454
    :pswitch_2
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 455
    .line 456
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGGroupManagerInterface;

    .line 457
    .line 458
    if-nez p3, :cond_1f

    .line 459
    .line 460
    goto :goto_2

    .line 461
    :cond_1f
    check-cast p3, Ljava/lang/Double;

    .line 462
    .line 463
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 464
    .line 465
    .line 466
    move-result v2

    .line 467
    :goto_2
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGGroupManagerInterface;->setStrokeLinejoin(Landroid/view/View;I)V

    .line 468
    .line 469
    .line 470
    goto/16 :goto_14

    .line 471
    .line 472
    :pswitch_3
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 473
    .line 474
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGGroupManagerInterface;

    .line 475
    .line 476
    if-nez p3, :cond_20

    .line 477
    .line 478
    goto :goto_3

    .line 479
    :cond_20
    move-object v5, p3

    .line 480
    check-cast v5, Ljava/lang/String;

    .line 481
    .line 482
    :goto_3
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGGroupManagerInterface;->setDisplay(Landroid/view/View;Ljava/lang/String;)V

    .line 483
    .line 484
    .line 485
    goto/16 :goto_14

    .line 486
    .line 487
    :pswitch_4
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 488
    .line 489
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGGroupManagerInterface;

    .line 490
    .line 491
    if-nez p3, :cond_21

    .line 492
    .line 493
    goto :goto_4

    .line 494
    :cond_21
    check-cast p3, Ljava/lang/Double;

    .line 495
    .line 496
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 497
    .line 498
    .line 499
    move-result v2

    .line 500
    :goto_4
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGGroupManagerInterface;->setStrokeLinecap(Landroid/view/View;I)V

    .line 501
    .line 502
    .line 503
    goto/16 :goto_14

    .line 504
    .line 505
    :pswitch_5
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 506
    .line 507
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGGroupManagerInterface;

    .line 508
    .line 509
    if-nez p3, :cond_22

    .line 510
    .line 511
    goto :goto_5

    .line 512
    :cond_22
    check-cast p3, Ljava/lang/Double;

    .line 513
    .line 514
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 515
    .line 516
    .line 517
    move-result v2

    .line 518
    :goto_5
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGGroupManagerInterface;->setClipRule(Landroid/view/View;I)V

    .line 519
    .line 520
    .line 521
    goto/16 :goto_14

    .line 522
    .line 523
    :pswitch_6
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 524
    .line 525
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGGroupManagerInterface;

    .line 526
    .line 527
    if-nez p3, :cond_23

    .line 528
    .line 529
    goto :goto_6

    .line 530
    :cond_23
    move-object v5, p3

    .line 531
    check-cast v5, Ljava/lang/String;

    .line 532
    .line 533
    :goto_6
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGGroupManagerInterface;->setClipPath(Landroid/view/View;Ljava/lang/String;)V

    .line 534
    .line 535
    .line 536
    goto/16 :goto_14

    .line 537
    .line 538
    :pswitch_7
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 539
    .line 540
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGGroupManagerInterface;

    .line 541
    .line 542
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 543
    .line 544
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGGroupManagerInterface;->setStrokeDasharray(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 545
    .line 546
    .line 547
    goto/16 :goto_14

    .line 548
    .line 549
    :pswitch_8
    instance-of p2, p3, Ljava/lang/String;

    .line 550
    .line 551
    if-eqz p2, :cond_24

    .line 552
    .line 553
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 554
    .line 555
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGGroupManagerInterface;

    .line 556
    .line 557
    check-cast p3, Ljava/lang/String;

    .line 558
    .line 559
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGGroupManagerInterface;->setFontSize(Landroid/view/View;Ljava/lang/String;)V

    .line 560
    .line 561
    .line 562
    goto/16 :goto_14

    .line 563
    .line 564
    :cond_24
    instance-of p2, p3, Ljava/lang/Double;

    .line 565
    .line 566
    if-eqz p2, :cond_25

    .line 567
    .line 568
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 569
    .line 570
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGGroupManagerInterface;

    .line 571
    .line 572
    check-cast p3, Ljava/lang/Double;

    .line 573
    .line 574
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGGroupManagerInterface;->setFontSize(Landroid/view/View;Ljava/lang/Double;)V

    .line 575
    .line 576
    .line 577
    goto/16 :goto_14

    .line 578
    .line 579
    :cond_25
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 580
    .line 581
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGGroupManagerInterface;

    .line 582
    .line 583
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGGroupManagerInterface;->setFontSize(Landroid/view/View;Ljava/lang/Double;)V

    .line 584
    .line 585
    .line 586
    goto/16 :goto_14

    .line 587
    .line 588
    :pswitch_9
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 589
    .line 590
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGGroupManagerInterface;

    .line 591
    .line 592
    if-nez p3, :cond_26

    .line 593
    .line 594
    goto :goto_7

    .line 595
    :cond_26
    move-object v5, p3

    .line 596
    check-cast v5, Ljava/lang/String;

    .line 597
    .line 598
    :goto_7
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGGroupManagerInterface;->setMarkerStart(Landroid/view/View;Ljava/lang/String;)V

    .line 599
    .line 600
    .line 601
    goto/16 :goto_14

    .line 602
    .line 603
    :pswitch_a
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 604
    .line 605
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGGroupManagerInterface;

    .line 606
    .line 607
    if-nez p3, :cond_27

    .line 608
    .line 609
    goto :goto_8

    .line 610
    :cond_27
    check-cast p3, Ljava/lang/Double;

    .line 611
    .line 612
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 613
    .line 614
    .line 615
    move-result v2

    .line 616
    :goto_8
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGGroupManagerInterface;->setVectorEffect(Landroid/view/View;I)V

    .line 617
    .line 618
    .line 619
    goto/16 :goto_14

    .line 620
    .line 621
    :pswitch_b
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 622
    .line 623
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGGroupManagerInterface;

    .line 624
    .line 625
    if-nez p3, :cond_28

    .line 626
    .line 627
    goto :goto_9

    .line 628
    :cond_28
    check-cast p3, Ljava/lang/Double;

    .line 629
    .line 630
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 631
    .line 632
    .line 633
    move-result v0

    .line 634
    :goto_9
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGGroupManagerInterface;->setStrokeMiterlimit(Landroid/view/View;F)V

    .line 635
    .line 636
    .line 637
    goto/16 :goto_14

    .line 638
    .line 639
    :pswitch_c
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 640
    .line 641
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGGroupManagerInterface;

    .line 642
    .line 643
    if-nez p3, :cond_29

    .line 644
    .line 645
    goto :goto_a

    .line 646
    :cond_29
    move-object v5, p3

    .line 647
    check-cast v5, Ljava/lang/String;

    .line 648
    .line 649
    :goto_a
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGGroupManagerInterface;->setName(Landroid/view/View;Ljava/lang/String;)V

    .line 650
    .line 651
    .line 652
    goto/16 :goto_14

    .line 653
    .line 654
    :pswitch_d
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 655
    .line 656
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGGroupManagerInterface;

    .line 657
    .line 658
    if-nez p3, :cond_2a

    .line 659
    .line 660
    goto :goto_b

    .line 661
    :cond_2a
    move-object v5, p3

    .line 662
    check-cast v5, Ljava/lang/String;

    .line 663
    .line 664
    :goto_b
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGGroupManagerInterface;->setMask(Landroid/view/View;Ljava/lang/String;)V

    .line 665
    .line 666
    .line 667
    goto/16 :goto_14

    .line 668
    .line 669
    :pswitch_e
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 670
    .line 671
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGGroupManagerInterface;

    .line 672
    .line 673
    check-cast p3, Lcom/facebook/react/bridge/ReadableMap;

    .line 674
    .line 675
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGGroupManagerInterface;->setFont(Landroid/view/View;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 676
    .line 677
    .line 678
    goto/16 :goto_14

    .line 679
    .line 680
    :pswitch_f
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 681
    .line 682
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGGroupManagerInterface;

    .line 683
    .line 684
    check-cast p3, Lcom/facebook/react/bridge/ReadableMap;

    .line 685
    .line 686
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGGroupManagerInterface;->setFill(Landroid/view/View;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 687
    .line 688
    .line 689
    goto/16 :goto_14

    .line 690
    .line 691
    :pswitch_10
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 692
    .line 693
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGGroupManagerInterface;

    .line 694
    .line 695
    if-nez p3, :cond_2b

    .line 696
    .line 697
    goto :goto_c

    .line 698
    :cond_2b
    check-cast p3, Ljava/lang/Double;

    .line 699
    .line 700
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 701
    .line 702
    .line 703
    move-result v0

    .line 704
    :goto_c
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGGroupManagerInterface;->setStrokeDashoffset(Landroid/view/View;F)V

    .line 705
    .line 706
    .line 707
    goto/16 :goto_14

    .line 708
    .line 709
    :pswitch_11
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 710
    .line 711
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGGroupManagerInterface;

    .line 712
    .line 713
    if-nez p3, :cond_2c

    .line 714
    .line 715
    goto :goto_d

    .line 716
    :cond_2c
    check-cast p3, Ljava/lang/Double;

    .line 717
    .line 718
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 719
    .line 720
    .line 721
    move-result v4

    .line 722
    :goto_d
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGGroupManagerInterface;->setFillOpacity(Landroid/view/View;F)V

    .line 723
    .line 724
    .line 725
    goto/16 :goto_14

    .line 726
    .line 727
    :pswitch_12
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 728
    .line 729
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGGroupManagerInterface;

    .line 730
    .line 731
    if-nez p3, :cond_2d

    .line 732
    .line 733
    goto :goto_e

    .line 734
    :cond_2d
    move-object v5, p3

    .line 735
    check-cast v5, Ljava/lang/String;

    .line 736
    .line 737
    :goto_e
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGGroupManagerInterface;->setPointerEvents(Landroid/view/View;Ljava/lang/String;)V

    .line 738
    .line 739
    .line 740
    goto/16 :goto_14

    .line 741
    .line 742
    :pswitch_13
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 743
    .line 744
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGGroupManagerInterface;

    .line 745
    .line 746
    if-nez p3, :cond_2e

    .line 747
    .line 748
    goto :goto_f

    .line 749
    :cond_2e
    check-cast p3, Ljava/lang/Double;

    .line 750
    .line 751
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 752
    .line 753
    .line 754
    move-result v4

    .line 755
    :goto_f
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGGroupManagerInterface;->setStrokeOpacity(Landroid/view/View;F)V

    .line 756
    .line 757
    .line 758
    goto/16 :goto_14

    .line 759
    .line 760
    :pswitch_14
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 761
    .line 762
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGGroupManagerInterface;

    .line 763
    .line 764
    if-nez p3, :cond_2f

    .line 765
    .line 766
    goto :goto_10

    .line 767
    :cond_2f
    check-cast p3, Ljava/lang/Double;

    .line 768
    .line 769
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 770
    .line 771
    .line 772
    move-result v1

    .line 773
    :goto_10
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSVGGroupManagerInterface;->setFillRule(Landroid/view/View;I)V

    .line 774
    .line 775
    .line 776
    goto/16 :goto_14

    .line 777
    .line 778
    :pswitch_15
    instance-of p2, p3, Ljava/lang/String;

    .line 779
    .line 780
    if-eqz p2, :cond_30

    .line 781
    .line 782
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 783
    .line 784
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGGroupManagerInterface;

    .line 785
    .line 786
    check-cast p3, Ljava/lang/String;

    .line 787
    .line 788
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGGroupManagerInterface;->setFontWeight(Landroid/view/View;Ljava/lang/String;)V

    .line 789
    .line 790
    .line 791
    goto :goto_14

    .line 792
    :cond_30
    instance-of p2, p3, Ljava/lang/Double;

    .line 793
    .line 794
    if-eqz p2, :cond_31

    .line 795
    .line 796
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 797
    .line 798
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGGroupManagerInterface;

    .line 799
    .line 800
    check-cast p3, Ljava/lang/Double;

    .line 801
    .line 802
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGGroupManagerInterface;->setFontWeight(Landroid/view/View;Ljava/lang/Double;)V

    .line 803
    .line 804
    .line 805
    goto :goto_14

    .line 806
    :cond_31
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 807
    .line 808
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGGroupManagerInterface;

    .line 809
    .line 810
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGGroupManagerInterface;->setFontWeight(Landroid/view/View;Ljava/lang/Double;)V

    .line 811
    .line 812
    .line 813
    goto :goto_14

    .line 814
    :pswitch_16
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 815
    .line 816
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGGroupManagerInterface;

    .line 817
    .line 818
    check-cast p3, Lcom/facebook/react/bridge/ReadableMap;

    .line 819
    .line 820
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGGroupManagerInterface;->setStroke(Landroid/view/View;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 821
    .line 822
    .line 823
    goto :goto_14

    .line 824
    :pswitch_17
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 825
    .line 826
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGGroupManagerInterface;

    .line 827
    .line 828
    if-nez p3, :cond_32

    .line 829
    .line 830
    goto :goto_11

    .line 831
    :cond_32
    move-object v5, p3

    .line 832
    check-cast v5, Ljava/lang/String;

    .line 833
    .line 834
    :goto_11
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGGroupManagerInterface;->setMarkerMid(Landroid/view/View;Ljava/lang/String;)V

    .line 835
    .line 836
    .line 837
    goto :goto_14

    .line 838
    :pswitch_18
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 839
    .line 840
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGGroupManagerInterface;

    .line 841
    .line 842
    if-nez p3, :cond_33

    .line 843
    .line 844
    goto :goto_12

    .line 845
    :cond_33
    move-object v5, p3

    .line 846
    check-cast v5, Ljava/lang/String;

    .line 847
    .line 848
    :goto_12
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGGroupManagerInterface;->setMarkerEnd(Landroid/view/View;Ljava/lang/String;)V

    .line 849
    .line 850
    .line 851
    goto :goto_14

    .line 852
    :pswitch_19
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 853
    .line 854
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGGroupManagerInterface;

    .line 855
    .line 856
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 857
    .line 858
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGGroupManagerInterface;->setPropList(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 859
    .line 860
    .line 861
    goto :goto_14

    .line 862
    :pswitch_1a
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 863
    .line 864
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGGroupManagerInterface;

    .line 865
    .line 866
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 867
    .line 868
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGGroupManagerInterface;->setMatrix(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 869
    .line 870
    .line 871
    goto :goto_14

    .line 872
    :pswitch_1b
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 873
    .line 874
    if-nez p3, :cond_34

    .line 875
    .line 876
    goto :goto_13

    .line 877
    :cond_34
    check-cast p3, Ljava/lang/Double;

    .line 878
    .line 879
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 880
    .line 881
    .line 882
    move-result v4

    .line 883
    :goto_13
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/uimanager/BaseViewManagerInterface;->setOpacity(Landroid/view/View;F)V

    .line 884
    .line 885
    .line 886
    :goto_14
    return-void

    .line 887
    :sswitch_data_0
    .sparse-switch
        -0x4b8807f5 -> :sswitch_1b
        -0x4072683f -> :sswitch_1a
        -0x3b3da15f -> :sswitch_19
        -0x37a9a5bf -> :sswitch_18
        -0x37a98852 -> :sswitch_17
        -0x352a89c8 -> :sswitch_16
        -0x2bc67c59 -> :sswitch_15
        -0x2b7578e1 -> :sswitch_14
        -0x18d3d54d -> :sswitch_13
        -0x117e564a -> :sswitch_12
        -0x3330ef8 -> :sswitch_11
        -0x2a83503 -> :sswitch_10
        0x2ff583 -> :sswitch_f
        0x300c4f -> :sswitch_e
        0x3306ec -> :sswitch_d
        0x337a8b -> :sswitch_c
        0x4b3162e -> :sswitch_b
        0x63a48b4 -> :sswitch_a
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

    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    :pswitch_data_0
    .packed-switch 0x0
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
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
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
