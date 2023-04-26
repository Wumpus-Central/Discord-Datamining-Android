.class public Lcom/facebook/react/viewmanagers/RNSScreenManagerDelegate;
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
        "Lcom/facebook/react/viewmanagers/RNSScreenManagerInterface<",
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
    .locals 4
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
    const-string v0, "nativeBackButtonDismissalEnabled"

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
    const/16 v3, 0x15

    .line 27
    .line 28
    goto/16 :goto_0

    .line 29
    .line 30
    :sswitch_1
    const-string v0, "statusBarAnimation"

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
    const/16 v3, 0x14

    .line 41
    .line 42
    goto/16 :goto_0

    .line 43
    .line 44
    :sswitch_2
    const-string v0, "customAnimationOnSwipe"

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
    const/16 v3, 0x13

    .line 55
    .line 56
    goto/16 :goto_0

    .line 57
    .line 58
    :sswitch_3
    const-string v0, "swipeDirection"

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
    const/16 v3, 0x12

    .line 69
    .line 70
    goto/16 :goto_0

    .line 71
    .line 72
    :sswitch_4
    const-string v0, "transitionDuration"

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
    const/16 v3, 0x11

    .line 83
    .line 84
    goto/16 :goto_0

    .line 85
    .line 86
    :sswitch_5
    const-string v0, "screenOrientation"

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
    const/16 v3, 0x10

    .line 97
    .line 98
    goto/16 :goto_0

    .line 99
    .line 100
    :sswitch_6
    const-string v0, "gestureResponseDistance"

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
    const/16 v3, 0xf

    .line 111
    .line 112
    goto/16 :goto_0

    .line 113
    .line 114
    :sswitch_7
    const-string v0, "fullScreenSwipeEnabled"

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
    const/16 v3, 0xe

    .line 125
    .line 126
    goto/16 :goto_0

    .line 127
    .line 128
    :sswitch_8
    const-string v0, "statusBarHidden"

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
    const/16 v3, 0xd

    .line 139
    .line 140
    goto/16 :goto_0

    .line 141
    .line 142
    :sswitch_9
    const-string v0, "preventNativeDismiss"

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
    const/16 v3, 0xc

    .line 153
    .line 154
    goto/16 :goto_0

    .line 155
    .line 156
    :sswitch_a
    const-string v0, "replaceAnimation"

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
    const/16 v3, 0xb

    .line 167
    .line 168
    goto/16 :goto_0

    .line 169
    .line 170
    :sswitch_b
    const-string v0, "navigationBarColor"

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
    const/16 v3, 0xa

    .line 181
    .line 182
    goto/16 :goto_0

    .line 183
    .line 184
    :sswitch_c
    const-string v0, "stackAnimation"

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
    const/16 v3, 0x9

    .line 195
    .line 196
    goto/16 :goto_0

    .line 197
    .line 198
    :sswitch_d
    const-string v0, "statusBarStyle"

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
    const/16 v3, 0x8

    .line 209
    .line 210
    goto/16 :goto_0

    .line 211
    .line 212
    :sswitch_e
    const-string v0, "statusBarColor"

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
    goto :goto_0

    .line 221
    :cond_e
    const/4 v3, 0x7

    .line 222
    goto :goto_0

    .line 223
    :sswitch_f
    const-string v0, "activityState"

    .line 224
    .line 225
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    move-result v0

    .line 229
    if-nez v0, :cond_f

    .line 230
    .line 231
    goto :goto_0

    .line 232
    :cond_f
    const/4 v3, 0x6

    .line 233
    goto :goto_0

    .line 234
    :sswitch_10
    const-string v0, "stackPresentation"

    .line 235
    .line 236
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    move-result v0

    .line 240
    if-nez v0, :cond_10

    .line 241
    .line 242
    goto :goto_0

    .line 243
    :cond_10
    const/4 v3, 0x5

    .line 244
    goto :goto_0

    .line 245
    :sswitch_11
    const-string v0, "statusBarTranslucent"

    .line 246
    .line 247
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 248
    .line 249
    .line 250
    move-result v0

    .line 251
    if-nez v0, :cond_11

    .line 252
    .line 253
    goto :goto_0

    .line 254
    :cond_11
    const/4 v3, 0x4

    .line 255
    goto :goto_0

    .line 256
    :sswitch_12
    const-string v0, "navigationBarHidden"

    .line 257
    .line 258
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    move-result v0

    .line 262
    if-nez v0, :cond_12

    .line 263
    .line 264
    goto :goto_0

    .line 265
    :cond_12
    const/4 v3, 0x3

    .line 266
    goto :goto_0

    .line 267
    :sswitch_13
    const-string v0, "hideKeyboardOnSwipe"

    .line 268
    .line 269
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 270
    .line 271
    .line 272
    move-result v0

    .line 273
    if-nez v0, :cond_13

    .line 274
    .line 275
    goto :goto_0

    .line 276
    :cond_13
    const/4 v3, 0x2

    .line 277
    goto :goto_0

    .line 278
    :sswitch_14
    const-string v0, "gestureEnabled"

    .line 279
    .line 280
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 281
    .line 282
    .line 283
    move-result v0

    .line 284
    if-nez v0, :cond_14

    .line 285
    .line 286
    goto :goto_0

    .line 287
    :cond_14
    move v3, v1

    .line 288
    goto :goto_0

    .line 289
    :sswitch_15
    const-string v0, "homeIndicatorHidden"

    .line 290
    .line 291
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 292
    .line 293
    .line 294
    move-result v0

    .line 295
    if-nez v0, :cond_15

    .line 296
    .line 297
    goto :goto_0

    .line 298
    :cond_15
    move v3, v2

    .line 299
    :goto_0
    const/4 v0, 0x0

    .line 300
    packed-switch v3, :pswitch_data_0

    .line 301
    .line 302
    .line 303
    invoke-super {p0, p1, p2, p3}, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->setProperty(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V

    .line 304
    .line 305
    .line 306
    goto/16 :goto_10

    .line 307
    .line 308
    :pswitch_0
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 309
    .line 310
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenManagerInterface;

    .line 311
    .line 312
    if-nez p3, :cond_16

    .line 313
    .line 314
    goto :goto_1

    .line 315
    :cond_16
    check-cast p3, Ljava/lang/Boolean;

    .line 316
    .line 317
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 318
    .line 319
    .line 320
    move-result v2

    .line 321
    :goto_1
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSScreenManagerInterface;->setNativeBackButtonDismissalEnabled(Landroid/view/View;Z)V

    .line 322
    .line 323
    .line 324
    goto/16 :goto_10

    .line 325
    .line 326
    :pswitch_1
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 327
    .line 328
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenManagerInterface;

    .line 329
    .line 330
    if-nez p3, :cond_17

    .line 331
    .line 332
    goto :goto_2

    .line 333
    :cond_17
    move-object v0, p3

    .line 334
    check-cast v0, Ljava/lang/String;

    .line 335
    .line 336
    :goto_2
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSScreenManagerInterface;->setStatusBarAnimation(Landroid/view/View;Ljava/lang/String;)V

    .line 337
    .line 338
    .line 339
    goto/16 :goto_10

    .line 340
    .line 341
    :pswitch_2
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 342
    .line 343
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenManagerInterface;

    .line 344
    .line 345
    if-nez p3, :cond_18

    .line 346
    .line 347
    goto :goto_3

    .line 348
    :cond_18
    check-cast p3, Ljava/lang/Boolean;

    .line 349
    .line 350
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 351
    .line 352
    .line 353
    move-result v2

    .line 354
    :goto_3
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSScreenManagerInterface;->setCustomAnimationOnSwipe(Landroid/view/View;Z)V

    .line 355
    .line 356
    .line 357
    goto/16 :goto_10

    .line 358
    .line 359
    :pswitch_3
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 360
    .line 361
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenManagerInterface;

    .line 362
    .line 363
    check-cast p3, Ljava/lang/String;

    .line 364
    .line 365
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSScreenManagerInterface;->setSwipeDirection(Landroid/view/View;Ljava/lang/String;)V

    .line 366
    .line 367
    .line 368
    goto/16 :goto_10

    .line 369
    .line 370
    :pswitch_4
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 371
    .line 372
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenManagerInterface;

    .line 373
    .line 374
    if-nez p3, :cond_19

    .line 375
    .line 376
    const/16 p3, 0x15e

    .line 377
    .line 378
    goto :goto_4

    .line 379
    :cond_19
    check-cast p3, Ljava/lang/Double;

    .line 380
    .line 381
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 382
    .line 383
    .line 384
    move-result p3

    .line 385
    :goto_4
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSScreenManagerInterface;->setTransitionDuration(Landroid/view/View;I)V

    .line 386
    .line 387
    .line 388
    goto/16 :goto_10

    .line 389
    .line 390
    :pswitch_5
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 391
    .line 392
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenManagerInterface;

    .line 393
    .line 394
    if-nez p3, :cond_1a

    .line 395
    .line 396
    goto :goto_5

    .line 397
    :cond_1a
    move-object v0, p3

    .line 398
    check-cast v0, Ljava/lang/String;

    .line 399
    .line 400
    :goto_5
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSScreenManagerInterface;->setScreenOrientation(Landroid/view/View;Ljava/lang/String;)V

    .line 401
    .line 402
    .line 403
    goto/16 :goto_10

    .line 404
    .line 405
    :pswitch_6
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 406
    .line 407
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenManagerInterface;

    .line 408
    .line 409
    check-cast p3, Lcom/facebook/react/bridge/ReadableMap;

    .line 410
    .line 411
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSScreenManagerInterface;->setGestureResponseDistance(Landroid/view/View;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 412
    .line 413
    .line 414
    goto/16 :goto_10

    .line 415
    .line 416
    :pswitch_7
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 417
    .line 418
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenManagerInterface;

    .line 419
    .line 420
    if-nez p3, :cond_1b

    .line 421
    .line 422
    goto :goto_6

    .line 423
    :cond_1b
    check-cast p3, Ljava/lang/Boolean;

    .line 424
    .line 425
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 426
    .line 427
    .line 428
    move-result v2

    .line 429
    :goto_6
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSScreenManagerInterface;->setFullScreenSwipeEnabled(Landroid/view/View;Z)V

    .line 430
    .line 431
    .line 432
    goto/16 :goto_10

    .line 433
    .line 434
    :pswitch_8
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 435
    .line 436
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenManagerInterface;

    .line 437
    .line 438
    if-nez p3, :cond_1c

    .line 439
    .line 440
    goto :goto_7

    .line 441
    :cond_1c
    check-cast p3, Ljava/lang/Boolean;

    .line 442
    .line 443
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 444
    .line 445
    .line 446
    move-result v2

    .line 447
    :goto_7
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSScreenManagerInterface;->setStatusBarHidden(Landroid/view/View;Z)V

    .line 448
    .line 449
    .line 450
    goto/16 :goto_10

    .line 451
    .line 452
    :pswitch_9
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 453
    .line 454
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenManagerInterface;

    .line 455
    .line 456
    if-nez p3, :cond_1d

    .line 457
    .line 458
    goto :goto_8

    .line 459
    :cond_1d
    check-cast p3, Ljava/lang/Boolean;

    .line 460
    .line 461
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 462
    .line 463
    .line 464
    move-result v2

    .line 465
    :goto_8
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSScreenManagerInterface;->setPreventNativeDismiss(Landroid/view/View;Z)V

    .line 466
    .line 467
    .line 468
    goto/16 :goto_10

    .line 469
    .line 470
    :pswitch_a
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 471
    .line 472
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenManagerInterface;

    .line 473
    .line 474
    check-cast p3, Ljava/lang/String;

    .line 475
    .line 476
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSScreenManagerInterface;->setReplaceAnimation(Landroid/view/View;Ljava/lang/String;)V

    .line 477
    .line 478
    .line 479
    goto/16 :goto_10

    .line 480
    .line 481
    :pswitch_b
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 482
    .line 483
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenManagerInterface;

    .line 484
    .line 485
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 486
    .line 487
    .line 488
    move-result-object v0

    .line 489
    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    .line 490
    .line 491
    .line 492
    move-result-object p3

    .line 493
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSScreenManagerInterface;->setNavigationBarColor(Landroid/view/View;Ljava/lang/Integer;)V

    .line 494
    .line 495
    .line 496
    goto/16 :goto_10

    .line 497
    .line 498
    :pswitch_c
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 499
    .line 500
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenManagerInterface;

    .line 501
    .line 502
    check-cast p3, Ljava/lang/String;

    .line 503
    .line 504
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSScreenManagerInterface;->setStackAnimation(Landroid/view/View;Ljava/lang/String;)V

    .line 505
    .line 506
    .line 507
    goto/16 :goto_10

    .line 508
    .line 509
    :pswitch_d
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 510
    .line 511
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenManagerInterface;

    .line 512
    .line 513
    if-nez p3, :cond_1e

    .line 514
    .line 515
    goto :goto_9

    .line 516
    :cond_1e
    move-object v0, p3

    .line 517
    check-cast v0, Ljava/lang/String;

    .line 518
    .line 519
    :goto_9
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSScreenManagerInterface;->setStatusBarStyle(Landroid/view/View;Ljava/lang/String;)V

    .line 520
    .line 521
    .line 522
    goto/16 :goto_10

    .line 523
    .line 524
    :pswitch_e
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 525
    .line 526
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenManagerInterface;

    .line 527
    .line 528
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 529
    .line 530
    .line 531
    move-result-object v0

    .line 532
    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    .line 533
    .line 534
    .line 535
    move-result-object p3

    .line 536
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSScreenManagerInterface;->setStatusBarColor(Landroid/view/View;Ljava/lang/Integer;)V

    .line 537
    .line 538
    .line 539
    goto/16 :goto_10

    .line 540
    .line 541
    :pswitch_f
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 542
    .line 543
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenManagerInterface;

    .line 544
    .line 545
    if-nez p3, :cond_1f

    .line 546
    .line 547
    const/high16 p3, -0x40800000    # -1.0f

    .line 548
    .line 549
    goto :goto_a

    .line 550
    :cond_1f
    check-cast p3, Ljava/lang/Double;

    .line 551
    .line 552
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 553
    .line 554
    .line 555
    move-result p3

    .line 556
    :goto_a
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSScreenManagerInterface;->setActivityState(Landroid/view/View;F)V

    .line 557
    .line 558
    .line 559
    goto :goto_10

    .line 560
    :pswitch_10
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 561
    .line 562
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenManagerInterface;

    .line 563
    .line 564
    check-cast p3, Ljava/lang/String;

    .line 565
    .line 566
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSScreenManagerInterface;->setStackPresentation(Landroid/view/View;Ljava/lang/String;)V

    .line 567
    .line 568
    .line 569
    goto :goto_10

    .line 570
    :pswitch_11
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 571
    .line 572
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenManagerInterface;

    .line 573
    .line 574
    if-nez p3, :cond_20

    .line 575
    .line 576
    goto :goto_b

    .line 577
    :cond_20
    check-cast p3, Ljava/lang/Boolean;

    .line 578
    .line 579
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 580
    .line 581
    .line 582
    move-result v2

    .line 583
    :goto_b
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSScreenManagerInterface;->setStatusBarTranslucent(Landroid/view/View;Z)V

    .line 584
    .line 585
    .line 586
    goto :goto_10

    .line 587
    :pswitch_12
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 588
    .line 589
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenManagerInterface;

    .line 590
    .line 591
    if-nez p3, :cond_21

    .line 592
    .line 593
    goto :goto_c

    .line 594
    :cond_21
    check-cast p3, Ljava/lang/Boolean;

    .line 595
    .line 596
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 597
    .line 598
    .line 599
    move-result v2

    .line 600
    :goto_c
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSScreenManagerInterface;->setNavigationBarHidden(Landroid/view/View;Z)V

    .line 601
    .line 602
    .line 603
    goto :goto_10

    .line 604
    :pswitch_13
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 605
    .line 606
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenManagerInterface;

    .line 607
    .line 608
    if-nez p3, :cond_22

    .line 609
    .line 610
    goto :goto_d

    .line 611
    :cond_22
    check-cast p3, Ljava/lang/Boolean;

    .line 612
    .line 613
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 614
    .line 615
    .line 616
    move-result v2

    .line 617
    :goto_d
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSScreenManagerInterface;->setHideKeyboardOnSwipe(Landroid/view/View;Z)V

    .line 618
    .line 619
    .line 620
    goto :goto_10

    .line 621
    :pswitch_14
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 622
    .line 623
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenManagerInterface;

    .line 624
    .line 625
    if-nez p3, :cond_23

    .line 626
    .line 627
    goto :goto_e

    .line 628
    :cond_23
    check-cast p3, Ljava/lang/Boolean;

    .line 629
    .line 630
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 631
    .line 632
    .line 633
    move-result v1

    .line 634
    :goto_e
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSScreenManagerInterface;->setGestureEnabled(Landroid/view/View;Z)V

    .line 635
    .line 636
    .line 637
    goto :goto_10

    .line 638
    :pswitch_15
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 639
    .line 640
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenManagerInterface;

    .line 641
    .line 642
    if-nez p3, :cond_24

    .line 643
    .line 644
    goto :goto_f

    .line 645
    :cond_24
    check-cast p3, Ljava/lang/Boolean;

    .line 646
    .line 647
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 648
    .line 649
    .line 650
    move-result v2

    .line 651
    :goto_f
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSScreenManagerInterface;->setHomeIndicatorHidden(Landroid/view/View;Z)V

    .line 652
    .line 653
    .line 654
    :goto_10
    return-void

    .line 655
    :sswitch_data_0
    .sparse-switch
        -0x737a3646 -> :sswitch_15
        -0x6e7b0e48 -> :sswitch_14
        -0x675c3aee -> :sswitch_13
        -0x4ecd6817 -> :sswitch_12
        -0x44e94228 -> :sswitch_11
        -0x4496763e -> :sswitch_10
        -0x3e6b8d3e -> :sswitch_f
        -0x3a0986de -> :sswitch_e
        -0x39259890 -> :sswitch_d
        -0x226f2e24 -> :sswitch_c
        -0x1b948ebc -> :sswitch_b
        -0xf53acd0 -> :sswitch_a
        -0x9ea6485 -> :sswitch_9
        0x1088bcb -> :sswitch_8
        0x7befa22 -> :sswitch_7
        0xb3022bf -> :sswitch_6
        0xd90a1c4 -> :sswitch_5
        0x1955fa09 -> :sswitch_4
        0x40806965 -> :sswitch_3
        0x42362208 -> :sswitch_2
        0x52b16dc3 -> :sswitch_1
        0x670fd7dc -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_0
    .packed-switch 0x0
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
