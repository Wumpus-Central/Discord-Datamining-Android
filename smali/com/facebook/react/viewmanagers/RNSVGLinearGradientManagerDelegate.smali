.class public Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerDelegate;
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
        "Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface<",
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
    .locals 3
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
    const-string v0, "responsible"

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
    const/16 v2, 0x12

    .line 26
    .line 27
    goto/16 :goto_0

    .line 28
    .line 29
    :sswitch_1
    const-string v0, "gradientTransform"

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
    const/16 v2, 0x11

    .line 40
    .line 41
    goto/16 :goto_0

    .line 42
    .line 43
    :sswitch_2
    const-string v0, "display"

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
    const/16 v2, 0x10

    .line 54
    .line 55
    goto/16 :goto_0

    .line 56
    .line 57
    :sswitch_3
    const-string v0, "clipRule"

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
    const/16 v2, 0xf

    .line 68
    .line 69
    goto/16 :goto_0

    .line 70
    .line 71
    :sswitch_4
    const-string v0, "clipPath"

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
    const/16 v2, 0xe

    .line 82
    .line 83
    goto/16 :goto_0

    .line 84
    .line 85
    :sswitch_5
    const-string v0, "markerStart"

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
    const/16 v2, 0xd

    .line 96
    .line 97
    goto/16 :goto_0

    .line 98
    .line 99
    :sswitch_6
    const-string v0, "gradient"

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
    const/16 v2, 0xc

    .line 110
    .line 111
    goto/16 :goto_0

    .line 112
    .line 113
    :sswitch_7
    const-string v0, "name"

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
    const/16 v2, 0xb

    .line 124
    .line 125
    goto/16 :goto_0

    .line 126
    .line 127
    :sswitch_8
    const-string v0, "mask"

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
    const/16 v2, 0xa

    .line 138
    .line 139
    goto/16 :goto_0

    .line 140
    .line 141
    :sswitch_9
    const-string v0, "y2"

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
    const/16 v2, 0x9

    .line 152
    .line 153
    goto/16 :goto_0

    .line 154
    .line 155
    :sswitch_a
    const-string v0, "y1"

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
    const/16 v2, 0x8

    .line 166
    .line 167
    goto/16 :goto_0

    .line 168
    .line 169
    :sswitch_b
    const-string v0, "x2"

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
    goto :goto_0

    .line 178
    :cond_b
    const/4 v2, 0x7

    .line 179
    goto :goto_0

    .line 180
    :sswitch_c
    const-string v0, "x1"

    .line 181
    .line 182
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    move-result v0

    .line 186
    if-nez v0, :cond_c

    .line 187
    .line 188
    goto :goto_0

    .line 189
    :cond_c
    const/4 v2, 0x6

    .line 190
    goto :goto_0

    .line 191
    :sswitch_d
    const-string v0, "pointerEvents"

    .line 192
    .line 193
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    move-result v0

    .line 197
    if-nez v0, :cond_d

    .line 198
    .line 199
    goto :goto_0

    .line 200
    :cond_d
    const/4 v2, 0x5

    .line 201
    goto :goto_0

    .line 202
    :sswitch_e
    const-string v0, "markerMid"

    .line 203
    .line 204
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    move-result v0

    .line 208
    if-nez v0, :cond_e

    .line 209
    .line 210
    goto :goto_0

    .line 211
    :cond_e
    const/4 v2, 0x4

    .line 212
    goto :goto_0

    .line 213
    :sswitch_f
    const-string v0, "markerEnd"

    .line 214
    .line 215
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    move-result v0

    .line 219
    if-nez v0, :cond_f

    .line 220
    .line 221
    goto :goto_0

    .line 222
    :cond_f
    const/4 v2, 0x3

    .line 223
    goto :goto_0

    .line 224
    :sswitch_10
    const-string v0, "matrix"

    .line 225
    .line 226
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    move-result v0

    .line 230
    if-nez v0, :cond_10

    .line 231
    .line 232
    goto :goto_0

    .line 233
    :cond_10
    const/4 v2, 0x2

    .line 234
    goto :goto_0

    .line 235
    :sswitch_11
    const-string v0, "opacity"

    .line 236
    .line 237
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    move-result v0

    .line 241
    if-nez v0, :cond_11

    .line 242
    .line 243
    goto :goto_0

    .line 244
    :cond_11
    const/4 v2, 0x1

    .line 245
    goto :goto_0

    .line 246
    :sswitch_12
    const-string v0, "gradientUnits"

    .line 247
    .line 248
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 249
    .line 250
    .line 251
    move-result v0

    .line 252
    if-nez v0, :cond_12

    .line 253
    .line 254
    goto :goto_0

    .line 255
    :cond_12
    move v2, v1

    .line 256
    :goto_0
    const/4 v0, 0x0

    .line 257
    packed-switch v2, :pswitch_data_0

    .line 258
    .line 259
    .line 260
    invoke-super {p0, p1, p2, p3}, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->setProperty(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V

    .line 261
    .line 262
    .line 263
    goto/16 :goto_d

    .line 264
    .line 265
    :pswitch_0
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 266
    .line 267
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface;

    .line 268
    .line 269
    if-nez p3, :cond_13

    .line 270
    .line 271
    goto :goto_1

    .line 272
    :cond_13
    check-cast p3, Ljava/lang/Boolean;

    .line 273
    .line 274
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 275
    .line 276
    .line 277
    move-result v1

    .line 278
    :goto_1
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface;->setResponsible(Landroid/view/View;Z)V

    .line 279
    .line 280
    .line 281
    goto/16 :goto_d

    .line 282
    .line 283
    :pswitch_1
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 284
    .line 285
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface;

    .line 286
    .line 287
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 288
    .line 289
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface;->setGradientTransform(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 290
    .line 291
    .line 292
    goto/16 :goto_d

    .line 293
    .line 294
    :pswitch_2
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 295
    .line 296
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface;

    .line 297
    .line 298
    if-nez p3, :cond_14

    .line 299
    .line 300
    goto :goto_2

    .line 301
    :cond_14
    move-object v0, p3

    .line 302
    check-cast v0, Ljava/lang/String;

    .line 303
    .line 304
    :goto_2
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface;->setDisplay(Landroid/view/View;Ljava/lang/String;)V

    .line 305
    .line 306
    .line 307
    goto/16 :goto_d

    .line 308
    .line 309
    :pswitch_3
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 310
    .line 311
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface;

    .line 312
    .line 313
    if-nez p3, :cond_15

    .line 314
    .line 315
    goto :goto_3

    .line 316
    :cond_15
    check-cast p3, Ljava/lang/Double;

    .line 317
    .line 318
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 319
    .line 320
    .line 321
    move-result v1

    .line 322
    :goto_3
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface;->setClipRule(Landroid/view/View;I)V

    .line 323
    .line 324
    .line 325
    goto/16 :goto_d

    .line 326
    .line 327
    :pswitch_4
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 328
    .line 329
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface;

    .line 330
    .line 331
    if-nez p3, :cond_16

    .line 332
    .line 333
    goto :goto_4

    .line 334
    :cond_16
    move-object v0, p3

    .line 335
    check-cast v0, Ljava/lang/String;

    .line 336
    .line 337
    :goto_4
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface;->setClipPath(Landroid/view/View;Ljava/lang/String;)V

    .line 338
    .line 339
    .line 340
    goto/16 :goto_d

    .line 341
    .line 342
    :pswitch_5
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 343
    .line 344
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface;

    .line 345
    .line 346
    if-nez p3, :cond_17

    .line 347
    .line 348
    goto :goto_5

    .line 349
    :cond_17
    move-object v0, p3

    .line 350
    check-cast v0, Ljava/lang/String;

    .line 351
    .line 352
    :goto_5
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface;->setMarkerStart(Landroid/view/View;Ljava/lang/String;)V

    .line 353
    .line 354
    .line 355
    goto/16 :goto_d

    .line 356
    .line 357
    :pswitch_6
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 358
    .line 359
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface;

    .line 360
    .line 361
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 362
    .line 363
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface;->setGradient(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 364
    .line 365
    .line 366
    goto/16 :goto_d

    .line 367
    .line 368
    :pswitch_7
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 369
    .line 370
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface;

    .line 371
    .line 372
    if-nez p3, :cond_18

    .line 373
    .line 374
    goto :goto_6

    .line 375
    :cond_18
    move-object v0, p3

    .line 376
    check-cast v0, Ljava/lang/String;

    .line 377
    .line 378
    :goto_6
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface;->setName(Landroid/view/View;Ljava/lang/String;)V

    .line 379
    .line 380
    .line 381
    goto/16 :goto_d

    .line 382
    .line 383
    :pswitch_8
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 384
    .line 385
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface;

    .line 386
    .line 387
    if-nez p3, :cond_19

    .line 388
    .line 389
    goto :goto_7

    .line 390
    :cond_19
    move-object v0, p3

    .line 391
    check-cast v0, Ljava/lang/String;

    .line 392
    .line 393
    :goto_7
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface;->setMask(Landroid/view/View;Ljava/lang/String;)V

    .line 394
    .line 395
    .line 396
    goto/16 :goto_d

    .line 397
    .line 398
    :pswitch_9
    instance-of p2, p3, Ljava/lang/String;

    .line 399
    .line 400
    if-eqz p2, :cond_1a

    .line 401
    .line 402
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 403
    .line 404
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface;

    .line 405
    .line 406
    check-cast p3, Ljava/lang/String;

    .line 407
    .line 408
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface;->setY2(Landroid/view/View;Ljava/lang/String;)V

    .line 409
    .line 410
    .line 411
    goto/16 :goto_d

    .line 412
    .line 413
    :cond_1a
    instance-of p2, p3, Ljava/lang/Double;

    .line 414
    .line 415
    if-eqz p2, :cond_1b

    .line 416
    .line 417
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 418
    .line 419
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface;

    .line 420
    .line 421
    check-cast p3, Ljava/lang/Double;

    .line 422
    .line 423
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface;->setY2(Landroid/view/View;Ljava/lang/Double;)V

    .line 424
    .line 425
    .line 426
    goto/16 :goto_d

    .line 427
    .line 428
    :cond_1b
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 429
    .line 430
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface;

    .line 431
    .line 432
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface;->setY2(Landroid/view/View;Ljava/lang/Double;)V

    .line 433
    .line 434
    .line 435
    goto/16 :goto_d

    .line 436
    .line 437
    :pswitch_a
    instance-of p2, p3, Ljava/lang/String;

    .line 438
    .line 439
    if-eqz p2, :cond_1c

    .line 440
    .line 441
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 442
    .line 443
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface;

    .line 444
    .line 445
    check-cast p3, Ljava/lang/String;

    .line 446
    .line 447
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface;->setY1(Landroid/view/View;Ljava/lang/String;)V

    .line 448
    .line 449
    .line 450
    goto/16 :goto_d

    .line 451
    .line 452
    :cond_1c
    instance-of p2, p3, Ljava/lang/Double;

    .line 453
    .line 454
    if-eqz p2, :cond_1d

    .line 455
    .line 456
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 457
    .line 458
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface;

    .line 459
    .line 460
    check-cast p3, Ljava/lang/Double;

    .line 461
    .line 462
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface;->setY1(Landroid/view/View;Ljava/lang/Double;)V

    .line 463
    .line 464
    .line 465
    goto/16 :goto_d

    .line 466
    .line 467
    :cond_1d
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 468
    .line 469
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface;

    .line 470
    .line 471
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface;->setY1(Landroid/view/View;Ljava/lang/Double;)V

    .line 472
    .line 473
    .line 474
    goto/16 :goto_d

    .line 475
    .line 476
    :pswitch_b
    instance-of p2, p3, Ljava/lang/String;

    .line 477
    .line 478
    if-eqz p2, :cond_1e

    .line 479
    .line 480
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 481
    .line 482
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface;

    .line 483
    .line 484
    check-cast p3, Ljava/lang/String;

    .line 485
    .line 486
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface;->setX2(Landroid/view/View;Ljava/lang/String;)V

    .line 487
    .line 488
    .line 489
    goto/16 :goto_d

    .line 490
    .line 491
    :cond_1e
    instance-of p2, p3, Ljava/lang/Double;

    .line 492
    .line 493
    if-eqz p2, :cond_1f

    .line 494
    .line 495
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 496
    .line 497
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface;

    .line 498
    .line 499
    check-cast p3, Ljava/lang/Double;

    .line 500
    .line 501
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface;->setX2(Landroid/view/View;Ljava/lang/Double;)V

    .line 502
    .line 503
    .line 504
    goto/16 :goto_d

    .line 505
    .line 506
    :cond_1f
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 507
    .line 508
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface;

    .line 509
    .line 510
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface;->setX2(Landroid/view/View;Ljava/lang/Double;)V

    .line 511
    .line 512
    .line 513
    goto/16 :goto_d

    .line 514
    .line 515
    :pswitch_c
    instance-of p2, p3, Ljava/lang/String;

    .line 516
    .line 517
    if-eqz p2, :cond_20

    .line 518
    .line 519
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 520
    .line 521
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface;

    .line 522
    .line 523
    check-cast p3, Ljava/lang/String;

    .line 524
    .line 525
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface;->setX1(Landroid/view/View;Ljava/lang/String;)V

    .line 526
    .line 527
    .line 528
    goto/16 :goto_d

    .line 529
    .line 530
    :cond_20
    instance-of p2, p3, Ljava/lang/Double;

    .line 531
    .line 532
    if-eqz p2, :cond_21

    .line 533
    .line 534
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 535
    .line 536
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface;

    .line 537
    .line 538
    check-cast p3, Ljava/lang/Double;

    .line 539
    .line 540
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface;->setX1(Landroid/view/View;Ljava/lang/Double;)V

    .line 541
    .line 542
    .line 543
    goto :goto_d

    .line 544
    :cond_21
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 545
    .line 546
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface;

    .line 547
    .line 548
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface;->setX1(Landroid/view/View;Ljava/lang/Double;)V

    .line 549
    .line 550
    .line 551
    goto :goto_d

    .line 552
    :pswitch_d
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 553
    .line 554
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface;

    .line 555
    .line 556
    if-nez p3, :cond_22

    .line 557
    .line 558
    goto :goto_8

    .line 559
    :cond_22
    move-object v0, p3

    .line 560
    check-cast v0, Ljava/lang/String;

    .line 561
    .line 562
    :goto_8
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface;->setPointerEvents(Landroid/view/View;Ljava/lang/String;)V

    .line 563
    .line 564
    .line 565
    goto :goto_d

    .line 566
    :pswitch_e
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 567
    .line 568
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface;

    .line 569
    .line 570
    if-nez p3, :cond_23

    .line 571
    .line 572
    goto :goto_9

    .line 573
    :cond_23
    move-object v0, p3

    .line 574
    check-cast v0, Ljava/lang/String;

    .line 575
    .line 576
    :goto_9
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface;->setMarkerMid(Landroid/view/View;Ljava/lang/String;)V

    .line 577
    .line 578
    .line 579
    goto :goto_d

    .line 580
    :pswitch_f
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 581
    .line 582
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface;

    .line 583
    .line 584
    if-nez p3, :cond_24

    .line 585
    .line 586
    goto :goto_a

    .line 587
    :cond_24
    move-object v0, p3

    .line 588
    check-cast v0, Ljava/lang/String;

    .line 589
    .line 590
    :goto_a
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface;->setMarkerEnd(Landroid/view/View;Ljava/lang/String;)V

    .line 591
    .line 592
    .line 593
    goto :goto_d

    .line 594
    :pswitch_10
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 595
    .line 596
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface;

    .line 597
    .line 598
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 599
    .line 600
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface;->setMatrix(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 601
    .line 602
    .line 603
    goto :goto_d

    .line 604
    :pswitch_11
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 605
    .line 606
    if-nez p3, :cond_25

    .line 607
    .line 608
    const/high16 p3, 0x3f800000    # 1.0f

    .line 609
    .line 610
    goto :goto_b

    .line 611
    :cond_25
    check-cast p3, Ljava/lang/Double;

    .line 612
    .line 613
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 614
    .line 615
    .line 616
    move-result p3

    .line 617
    :goto_b
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/uimanager/BaseViewManagerInterface;->setOpacity(Landroid/view/View;F)V

    .line 618
    .line 619
    .line 620
    goto :goto_d

    .line 621
    :pswitch_12
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 622
    .line 623
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface;

    .line 624
    .line 625
    if-nez p3, :cond_26

    .line 626
    .line 627
    goto :goto_c

    .line 628
    :cond_26
    check-cast p3, Ljava/lang/Double;

    .line 629
    .line 630
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 631
    .line 632
    .line 633
    move-result v1

    .line 634
    :goto_c
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface;->setGradientUnits(Landroid/view/View;I)V

    .line 635
    .line 636
    .line 637
    :goto_d
    return-void

    .line 638
    nop

    .line 639
    :sswitch_data_0
    .sparse-switch
        -0x732b91e1 -> :sswitch_12
        -0x4b8807f5 -> :sswitch_11
        -0x4072683f -> :sswitch_10
        -0x37a9a5bf -> :sswitch_f
        -0x37a98852 -> :sswitch_e
        -0x117e564a -> :sswitch_d
        0xeb9 -> :sswitch_c
        0xeba -> :sswitch_b
        0xed8 -> :sswitch_a
        0xed9 -> :sswitch_9
        0x3306ec -> :sswitch_8
        0x337a8b -> :sswitch_7
        0x557f730 -> :sswitch_6
        0xcf0d448 -> :sswitch_5
        0x36b25395 -> :sswitch_4
        0x36b3866c -> :sswitch_3
        0x63a518c2 -> :sswitch_2
        0x6ca3aa1c -> :sswitch_1
        0x6e2146f6 -> :sswitch_0
    .end sparse-switch

    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    :pswitch_data_0
    .packed-switch 0x0
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
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
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
