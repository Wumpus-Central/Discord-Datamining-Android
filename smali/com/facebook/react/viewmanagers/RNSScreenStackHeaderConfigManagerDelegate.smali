.class public Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerDelegate;
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
        "Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface<",
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
    const-string v0, "topInsetEnabled"

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
    const/16 v2, 0x18

    .line 26
    .line 27
    goto/16 :goto_0

    .line 28
    .line 29
    :sswitch_1
    const-string v0, "largeTitle"

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
    const/16 v2, 0x17

    .line 40
    .line 41
    goto/16 :goto_0

    .line 42
    .line 43
    :sswitch_2
    const-string v0, "largeTitleHideShadow"

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
    const/16 v2, 0x16

    .line 54
    .line 55
    goto/16 :goto_0

    .line 56
    .line 57
    :sswitch_3
    const-string v0, "titleFontSize"

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
    const/16 v2, 0x15

    .line 68
    .line 69
    goto/16 :goto_0

    .line 70
    .line 71
    :sswitch_4
    const-string v0, "backTitle"

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
    const/16 v2, 0x14

    .line 82
    .line 83
    goto/16 :goto_0

    .line 84
    .line 85
    :sswitch_5
    const-string v0, "backgroundColor"

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
    const/16 v2, 0x13

    .line 96
    .line 97
    goto/16 :goto_0

    .line 98
    .line 99
    :sswitch_6
    const-string v0, "hideBackButton"

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
    const/16 v2, 0x12

    .line 110
    .line 111
    goto/16 :goto_0

    .line 112
    .line 113
    :sswitch_7
    const-string v0, "largeTitleFontWeight"

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
    const/16 v2, 0x11

    .line 124
    .line 125
    goto/16 :goto_0

    .line 126
    .line 127
    :sswitch_8
    const-string v0, "hideShadow"

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
    const/16 v2, 0x10

    .line 138
    .line 139
    goto/16 :goto_0

    .line 140
    .line 141
    :sswitch_9
    const-string v0, "backTitleFontFamily"

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
    const/16 v2, 0xf

    .line 152
    .line 153
    goto/16 :goto_0

    .line 154
    .line 155
    :sswitch_a
    const-string v0, "backTitleFontSize"

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
    const/16 v2, 0xe

    .line 166
    .line 167
    goto/16 :goto_0

    .line 168
    .line 169
    :sswitch_b
    const-string v0, "title"

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
    goto/16 :goto_0

    .line 178
    .line 179
    :cond_b
    const/16 v2, 0xd

    .line 180
    .line 181
    goto/16 :goto_0

    .line 182
    .line 183
    :sswitch_c
    const-string v0, "color"

    .line 184
    .line 185
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    move-result v0

    .line 189
    if-nez v0, :cond_c

    .line 190
    .line 191
    goto/16 :goto_0

    .line 192
    .line 193
    :cond_c
    const/16 v2, 0xc

    .line 194
    .line 195
    goto/16 :goto_0

    .line 196
    .line 197
    :sswitch_d
    const-string v0, "largeTitleFontFamily"

    .line 198
    .line 199
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    move-result v0

    .line 203
    if-nez v0, :cond_d

    .line 204
    .line 205
    goto/16 :goto_0

    .line 206
    .line 207
    :cond_d
    const/16 v2, 0xb

    .line 208
    .line 209
    goto/16 :goto_0

    .line 210
    .line 211
    :sswitch_e
    const-string v0, "backButtonInCustomView"

    .line 212
    .line 213
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    move-result v0

    .line 217
    if-nez v0, :cond_e

    .line 218
    .line 219
    goto/16 :goto_0

    .line 220
    .line 221
    :cond_e
    const/16 v2, 0xa

    .line 222
    .line 223
    goto/16 :goto_0

    .line 224
    .line 225
    :sswitch_f
    const-string v0, "largeTitleBackgroundColor"

    .line 226
    .line 227
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    move-result v0

    .line 231
    if-nez v0, :cond_f

    .line 232
    .line 233
    goto/16 :goto_0

    .line 234
    .line 235
    :cond_f
    const/16 v2, 0x9

    .line 236
    .line 237
    goto/16 :goto_0

    .line 238
    .line 239
    :sswitch_10
    const-string v0, "direction"

    .line 240
    .line 241
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 242
    .line 243
    .line 244
    move-result v0

    .line 245
    if-nez v0, :cond_10

    .line 246
    .line 247
    goto/16 :goto_0

    .line 248
    .line 249
    :cond_10
    const/16 v2, 0x8

    .line 250
    .line 251
    goto/16 :goto_0

    .line 252
    .line 253
    :sswitch_11
    const-string v0, "largeTitleFontSize"

    .line 254
    .line 255
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    move-result v0

    .line 259
    if-nez v0, :cond_11

    .line 260
    .line 261
    goto :goto_0

    .line 262
    :cond_11
    const/4 v2, 0x7

    .line 263
    goto :goto_0

    .line 264
    :sswitch_12
    const-string v0, "hidden"

    .line 265
    .line 266
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 267
    .line 268
    .line 269
    move-result v0

    .line 270
    if-nez v0, :cond_12

    .line 271
    .line 272
    goto :goto_0

    .line 273
    :cond_12
    const/4 v2, 0x6

    .line 274
    goto :goto_0

    .line 275
    :sswitch_13
    const-string v0, "titleFontWeight"

    .line 276
    .line 277
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 278
    .line 279
    .line 280
    move-result v0

    .line 281
    if-nez v0, :cond_13

    .line 282
    .line 283
    goto :goto_0

    .line 284
    :cond_13
    const/4 v2, 0x5

    .line 285
    goto :goto_0

    .line 286
    :sswitch_14
    const-string v0, "disableBackButtonMenu"

    .line 287
    .line 288
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 289
    .line 290
    .line 291
    move-result v0

    .line 292
    if-nez v0, :cond_14

    .line 293
    .line 294
    goto :goto_0

    .line 295
    :cond_14
    const/4 v2, 0x4

    .line 296
    goto :goto_0

    .line 297
    :sswitch_15
    const-string v0, "titleFontFamily"

    .line 298
    .line 299
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 300
    .line 301
    .line 302
    move-result v0

    .line 303
    if-nez v0, :cond_15

    .line 304
    .line 305
    goto :goto_0

    .line 306
    :cond_15
    const/4 v2, 0x3

    .line 307
    goto :goto_0

    .line 308
    :sswitch_16
    const-string v0, "largeTitleColor"

    .line 309
    .line 310
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 311
    .line 312
    .line 313
    move-result v0

    .line 314
    if-nez v0, :cond_16

    .line 315
    .line 316
    goto :goto_0

    .line 317
    :cond_16
    const/4 v2, 0x2

    .line 318
    goto :goto_0

    .line 319
    :sswitch_17
    const-string v0, "titleColor"

    .line 320
    .line 321
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 322
    .line 323
    .line 324
    move-result v0

    .line 325
    if-nez v0, :cond_17

    .line 326
    .line 327
    goto :goto_0

    .line 328
    :cond_17
    const/4 v2, 0x1

    .line 329
    goto :goto_0

    .line 330
    :sswitch_18
    const-string v0, "translucent"

    .line 331
    .line 332
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 333
    .line 334
    .line 335
    move-result v0

    .line 336
    if-nez v0, :cond_18

    .line 337
    .line 338
    goto :goto_0

    .line 339
    :cond_18
    move v2, v1

    .line 340
    :goto_0
    const/4 v0, 0x0

    .line 341
    packed-switch v2, :pswitch_data_0

    .line 342
    .line 343
    .line 344
    invoke-super {p0, p1, p2, p3}, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->setProperty(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V

    .line 345
    .line 346
    .line 347
    goto/16 :goto_14

    .line 348
    .line 349
    :pswitch_0
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 350
    .line 351
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;

    .line 352
    .line 353
    if-nez p3, :cond_19

    .line 354
    .line 355
    goto :goto_1

    .line 356
    :cond_19
    check-cast p3, Ljava/lang/Boolean;

    .line 357
    .line 358
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 359
    .line 360
    .line 361
    move-result v1

    .line 362
    :goto_1
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;->setTopInsetEnabled(Landroid/view/View;Z)V

    .line 363
    .line 364
    .line 365
    goto/16 :goto_14

    .line 366
    .line 367
    :pswitch_1
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 368
    .line 369
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;

    .line 370
    .line 371
    if-nez p3, :cond_1a

    .line 372
    .line 373
    goto :goto_2

    .line 374
    :cond_1a
    check-cast p3, Ljava/lang/Boolean;

    .line 375
    .line 376
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 377
    .line 378
    .line 379
    move-result v1

    .line 380
    :goto_2
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;->setLargeTitle(Landroid/view/View;Z)V

    .line 381
    .line 382
    .line 383
    goto/16 :goto_14

    .line 384
    .line 385
    :pswitch_2
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 386
    .line 387
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;

    .line 388
    .line 389
    if-nez p3, :cond_1b

    .line 390
    .line 391
    goto :goto_3

    .line 392
    :cond_1b
    check-cast p3, Ljava/lang/Boolean;

    .line 393
    .line 394
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 395
    .line 396
    .line 397
    move-result v1

    .line 398
    :goto_3
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;->setLargeTitleHideShadow(Landroid/view/View;Z)V

    .line 399
    .line 400
    .line 401
    goto/16 :goto_14

    .line 402
    .line 403
    :pswitch_3
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 404
    .line 405
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;

    .line 406
    .line 407
    if-nez p3, :cond_1c

    .line 408
    .line 409
    goto :goto_4

    .line 410
    :cond_1c
    check-cast p3, Ljava/lang/Double;

    .line 411
    .line 412
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 413
    .line 414
    .line 415
    move-result v1

    .line 416
    :goto_4
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;->setTitleFontSize(Landroid/view/View;I)V

    .line 417
    .line 418
    .line 419
    goto/16 :goto_14

    .line 420
    .line 421
    :pswitch_4
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 422
    .line 423
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;

    .line 424
    .line 425
    if-nez p3, :cond_1d

    .line 426
    .line 427
    goto :goto_5

    .line 428
    :cond_1d
    move-object v0, p3

    .line 429
    check-cast v0, Ljava/lang/String;

    .line 430
    .line 431
    :goto_5
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;->setBackTitle(Landroid/view/View;Ljava/lang/String;)V

    .line 432
    .line 433
    .line 434
    goto/16 :goto_14

    .line 435
    .line 436
    :pswitch_5
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 437
    .line 438
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;

    .line 439
    .line 440
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 441
    .line 442
    .line 443
    move-result-object v0

    .line 444
    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    .line 445
    .line 446
    .line 447
    move-result-object p3

    .line 448
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;->setBackgroundColor(Landroid/view/View;Ljava/lang/Integer;)V

    .line 449
    .line 450
    .line 451
    goto/16 :goto_14

    .line 452
    .line 453
    :pswitch_6
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 454
    .line 455
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;

    .line 456
    .line 457
    if-nez p3, :cond_1e

    .line 458
    .line 459
    goto :goto_6

    .line 460
    :cond_1e
    check-cast p3, Ljava/lang/Boolean;

    .line 461
    .line 462
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 463
    .line 464
    .line 465
    move-result v1

    .line 466
    :goto_6
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;->setHideBackButton(Landroid/view/View;Z)V

    .line 467
    .line 468
    .line 469
    goto/16 :goto_14

    .line 470
    .line 471
    :pswitch_7
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 472
    .line 473
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;

    .line 474
    .line 475
    if-nez p3, :cond_1f

    .line 476
    .line 477
    goto :goto_7

    .line 478
    :cond_1f
    move-object v0, p3

    .line 479
    check-cast v0, Ljava/lang/String;

    .line 480
    .line 481
    :goto_7
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;->setLargeTitleFontWeight(Landroid/view/View;Ljava/lang/String;)V

    .line 482
    .line 483
    .line 484
    goto/16 :goto_14

    .line 485
    .line 486
    :pswitch_8
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 487
    .line 488
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;

    .line 489
    .line 490
    if-nez p3, :cond_20

    .line 491
    .line 492
    goto :goto_8

    .line 493
    :cond_20
    check-cast p3, Ljava/lang/Boolean;

    .line 494
    .line 495
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 496
    .line 497
    .line 498
    move-result v1

    .line 499
    :goto_8
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;->setHideShadow(Landroid/view/View;Z)V

    .line 500
    .line 501
    .line 502
    goto/16 :goto_14

    .line 503
    .line 504
    :pswitch_9
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 505
    .line 506
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;

    .line 507
    .line 508
    if-nez p3, :cond_21

    .line 509
    .line 510
    goto :goto_9

    .line 511
    :cond_21
    move-object v0, p3

    .line 512
    check-cast v0, Ljava/lang/String;

    .line 513
    .line 514
    :goto_9
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;->setBackTitleFontFamily(Landroid/view/View;Ljava/lang/String;)V

    .line 515
    .line 516
    .line 517
    goto/16 :goto_14

    .line 518
    .line 519
    :pswitch_a
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 520
    .line 521
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;

    .line 522
    .line 523
    if-nez p3, :cond_22

    .line 524
    .line 525
    goto :goto_a

    .line 526
    :cond_22
    check-cast p3, Ljava/lang/Double;

    .line 527
    .line 528
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 529
    .line 530
    .line 531
    move-result v1

    .line 532
    :goto_a
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;->setBackTitleFontSize(Landroid/view/View;I)V

    .line 533
    .line 534
    .line 535
    goto/16 :goto_14

    .line 536
    .line 537
    :pswitch_b
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 538
    .line 539
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;

    .line 540
    .line 541
    if-nez p3, :cond_23

    .line 542
    .line 543
    goto :goto_b

    .line 544
    :cond_23
    move-object v0, p3

    .line 545
    check-cast v0, Ljava/lang/String;

    .line 546
    .line 547
    :goto_b
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;->setTitle(Landroid/view/View;Ljava/lang/String;)V

    .line 548
    .line 549
    .line 550
    goto/16 :goto_14

    .line 551
    .line 552
    :pswitch_c
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 553
    .line 554
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;

    .line 555
    .line 556
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 557
    .line 558
    .line 559
    move-result-object v0

    .line 560
    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    .line 561
    .line 562
    .line 563
    move-result-object p3

    .line 564
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;->setColor(Landroid/view/View;Ljava/lang/Integer;)V

    .line 565
    .line 566
    .line 567
    goto/16 :goto_14

    .line 568
    .line 569
    :pswitch_d
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 570
    .line 571
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;

    .line 572
    .line 573
    if-nez p3, :cond_24

    .line 574
    .line 575
    goto :goto_c

    .line 576
    :cond_24
    move-object v0, p3

    .line 577
    check-cast v0, Ljava/lang/String;

    .line 578
    .line 579
    :goto_c
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;->setLargeTitleFontFamily(Landroid/view/View;Ljava/lang/String;)V

    .line 580
    .line 581
    .line 582
    goto/16 :goto_14

    .line 583
    .line 584
    :pswitch_e
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 585
    .line 586
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;

    .line 587
    .line 588
    if-nez p3, :cond_25

    .line 589
    .line 590
    goto :goto_d

    .line 591
    :cond_25
    check-cast p3, Ljava/lang/Boolean;

    .line 592
    .line 593
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 594
    .line 595
    .line 596
    move-result v1

    .line 597
    :goto_d
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;->setBackButtonInCustomView(Landroid/view/View;Z)V

    .line 598
    .line 599
    .line 600
    goto/16 :goto_14

    .line 601
    .line 602
    :pswitch_f
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 603
    .line 604
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;

    .line 605
    .line 606
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 607
    .line 608
    .line 609
    move-result-object v0

    .line 610
    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    .line 611
    .line 612
    .line 613
    move-result-object p3

    .line 614
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;->setLargeTitleBackgroundColor(Landroid/view/View;Ljava/lang/Integer;)V

    .line 615
    .line 616
    .line 617
    goto/16 :goto_14

    .line 618
    .line 619
    :pswitch_10
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 620
    .line 621
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;

    .line 622
    .line 623
    check-cast p3, Ljava/lang/String;

    .line 624
    .line 625
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;->setDirection(Landroid/view/View;Ljava/lang/String;)V

    .line 626
    .line 627
    .line 628
    goto/16 :goto_14

    .line 629
    .line 630
    :pswitch_11
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 631
    .line 632
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;

    .line 633
    .line 634
    if-nez p3, :cond_26

    .line 635
    .line 636
    goto :goto_e

    .line 637
    :cond_26
    check-cast p3, Ljava/lang/Double;

    .line 638
    .line 639
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 640
    .line 641
    .line 642
    move-result v1

    .line 643
    :goto_e
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;->setLargeTitleFontSize(Landroid/view/View;I)V

    .line 644
    .line 645
    .line 646
    goto/16 :goto_14

    .line 647
    .line 648
    :pswitch_12
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 649
    .line 650
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;

    .line 651
    .line 652
    if-nez p3, :cond_27

    .line 653
    .line 654
    goto :goto_f

    .line 655
    :cond_27
    check-cast p3, Ljava/lang/Boolean;

    .line 656
    .line 657
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 658
    .line 659
    .line 660
    move-result v1

    .line 661
    :goto_f
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;->setHidden(Landroid/view/View;Z)V

    .line 662
    .line 663
    .line 664
    goto :goto_14

    .line 665
    :pswitch_13
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 666
    .line 667
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;

    .line 668
    .line 669
    if-nez p3, :cond_28

    .line 670
    .line 671
    goto :goto_10

    .line 672
    :cond_28
    move-object v0, p3

    .line 673
    check-cast v0, Ljava/lang/String;

    .line 674
    .line 675
    :goto_10
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;->setTitleFontWeight(Landroid/view/View;Ljava/lang/String;)V

    .line 676
    .line 677
    .line 678
    goto :goto_14

    .line 679
    :pswitch_14
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 680
    .line 681
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;

    .line 682
    .line 683
    if-nez p3, :cond_29

    .line 684
    .line 685
    goto :goto_11

    .line 686
    :cond_29
    check-cast p3, Ljava/lang/Boolean;

    .line 687
    .line 688
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 689
    .line 690
    .line 691
    move-result v1

    .line 692
    :goto_11
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;->setDisableBackButtonMenu(Landroid/view/View;Z)V

    .line 693
    .line 694
    .line 695
    goto :goto_14

    .line 696
    :pswitch_15
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 697
    .line 698
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;

    .line 699
    .line 700
    if-nez p3, :cond_2a

    .line 701
    .line 702
    goto :goto_12

    .line 703
    :cond_2a
    move-object v0, p3

    .line 704
    check-cast v0, Ljava/lang/String;

    .line 705
    .line 706
    :goto_12
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;->setTitleFontFamily(Landroid/view/View;Ljava/lang/String;)V

    .line 707
    .line 708
    .line 709
    goto :goto_14

    .line 710
    :pswitch_16
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 711
    .line 712
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;

    .line 713
    .line 714
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 715
    .line 716
    .line 717
    move-result-object v0

    .line 718
    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    .line 719
    .line 720
    .line 721
    move-result-object p3

    .line 722
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;->setLargeTitleColor(Landroid/view/View;Ljava/lang/Integer;)V

    .line 723
    .line 724
    .line 725
    goto :goto_14

    .line 726
    :pswitch_17
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 727
    .line 728
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;

    .line 729
    .line 730
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 731
    .line 732
    .line 733
    move-result-object v0

    .line 734
    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    .line 735
    .line 736
    .line 737
    move-result-object p3

    .line 738
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;->setTitleColor(Landroid/view/View;Ljava/lang/Integer;)V

    .line 739
    .line 740
    .line 741
    goto :goto_14

    .line 742
    :pswitch_18
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 743
    .line 744
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;

    .line 745
    .line 746
    if-nez p3, :cond_2b

    .line 747
    .line 748
    goto :goto_13

    .line 749
    :cond_2b
    check-cast p3, Ljava/lang/Boolean;

    .line 750
    .line 751
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 752
    .line 753
    .line 754
    move-result v1

    .line 755
    :goto_13
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;->setTranslucent(Landroid/view/View;Z)V

    .line 756
    .line 757
    .line 758
    :goto_14
    return-void

    .line 759
    :sswitch_data_0
    .sparse-switch
        -0x6ca400a7 -> :sswitch_18
        -0x6b402c15 -> :sswitch_17
        -0x69c7227a -> :sswitch_16
        -0x663e72f5 -> :sswitch_15
        -0x59a25300 -> :sswitch_14
        -0x49058be1 -> :sswitch_13
        -0x48916256 -> :sswitch_12
        -0x413de413 -> :sswitch_11
        -0x395ff881 -> :sswitch_10
        -0x17336ac8 -> :sswitch_f
        -0x85931ac -> :sswitch_e
        0x54c50 -> :sswitch_d
        0x5a72f63 -> :sswitch_c
        0x6942258 -> :sswitch_b
        0xaf5e9c1 -> :sswitch_a
        0xe7cf524 -> :sswitch_9
        0x143bc902 -> :sswitch_8
        0x1d3e3364 -> :sswitch_7
        0x3dea1ddb -> :sswitch_6
        0x4cb7f6d5 -> :sswitch_5
        0x4ef525b1 -> :sswitch_4
        0x5a7d4f68 -> :sswitch_3
        0x5d4078bf -> :sswitch_2
        0x78fc43dd -> :sswitch_1
        0x7d247559 -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_0
    .packed-switch 0x0
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
