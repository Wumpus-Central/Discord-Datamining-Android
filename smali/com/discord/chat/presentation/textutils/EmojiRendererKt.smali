.class public final Lcom/discord/chat/presentation/textutils/EmojiRendererKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u001a\n\u0010\u0008\u001a\u00020\t*\u00020\u0005\u00a8\u0006\n"
    }
    d2 = {
        "renderEmoji",
        "",
        "builder",
        "Lcom/facebook/drawee/span/DraweeSpanStringBuilder;",
        "emoji",
        "Lcom/discord/chat/bridge/contentnode/EmojiContentNode;",
        "rc",
        "Lcom/discord/chat/presentation/textutils/RenderContext;",
        "renderable",
        "Lcom/discord/emoji/RenderableEmoji;",
        "chat_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final renderEmoji(Lcom/facebook/drawee/span/DraweeSpanStringBuilder;Lcom/discord/chat/bridge/contentnode/EmojiContentNode;Lcom/discord/chat/presentation/textutils/RenderContext;)V
    .locals 17

    .line 1
    move-object/from16 v7, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v1, p2

    .line 6
    .line 7
    const-string v2, "builder"

    .line 8
    .line 9
    invoke-static {v7, v2}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v2, "emoji"

    .line 13
    .line 14
    invoke-static {v0, v2}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const-string v2, "rc"

    .line 18
    .line 19
    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-interface/range {p1 .. p1}, Lcom/discord/chat/presentation/textutils/Jumboable;->getJumboable()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    const/16 v3, 0x30

    .line 29
    .line 30
    invoke-static {v3}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getDpToPx(I)I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    const/16 v3, 0x14

    .line 36
    .line 37
    invoke-static {v3}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getDpToPx(I)I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    int-to-float v3, v3

    .line 42
    sget-object v4, Lcom/discord/react/FontManager;->INSTANCE:Lcom/discord/react/FontManager;

    .line 43
    .line 44
    invoke-virtual/range {p2 .. p2}, Lcom/discord/chat/presentation/textutils/RenderContext;->getContext()Landroid/content/Context;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    invoke-virtual {v4, v5}, Lcom/discord/react/FontManager;->getFontScale(Landroid/content/Context;)F

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    mul-float/2addr v3, v4

    .line 53
    float-to-int v3, v3

    .line 54
    :goto_0
    const/4 v8, 0x2

    .line 55
    const/4 v4, 0x1

    .line 56
    if-eqz v2, :cond_1

    .line 57
    .line 58
    move v5, v4

    .line 59
    goto :goto_1

    .line 60
    :cond_1
    move v5, v8

    .line 61
    :goto_1
    invoke-static/range {p1 .. p1}, Lcom/discord/chat/presentation/textutils/EmojiRendererKt;->renderable(Lcom/discord/chat/bridge/contentnode/EmojiContentNode;)Lcom/discord/emoji/RenderableEmoji;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    new-instance v6, Lcom/discord/span/utilities/spannable/EmojiAccessibilitySpan;

    .line 66
    .line 67
    invoke-virtual {v2}, Lcom/discord/emoji/RenderableEmoji;->getContentDescription()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v9

    .line 71
    invoke-direct {v6, v9}, Lcom/discord/span/utilities/spannable/EmojiAccessibilitySpan;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    new-instance v9, Lcom/discord/span/utilities/spannable/ClickableSpan;

    .line 75
    .line 76
    const/4 v11, 0x0

    .line 77
    const/4 v12, 0x0

    .line 78
    const/4 v13, 0x0

    .line 79
    new-instance v14, Lcom/discord/chat/presentation/textutils/EmojiRendererKt$renderEmoji$clickableSpan$1;

    .line 80
    .line 81
    invoke-direct {v14, v1, v0}, Lcom/discord/chat/presentation/textutils/EmojiRendererKt$renderEmoji$clickableSpan$1;-><init>(Lcom/discord/chat/presentation/textutils/RenderContext;Lcom/discord/chat/bridge/contentnode/EmojiContentNode;)V

    .line 82
    .line 83
    .line 84
    const/4 v15, 0x7

    .line 85
    const/16 v16, 0x0

    .line 86
    .line 87
    move-object v10, v9

    .line 88
    invoke-direct/range {v10 .. v16}, Lcom/discord/span/utilities/spannable/ClickableSpan;-><init>(Lcom/discord/react_gesture_handler/nested_touch/NestedClickableSpan$TouchPriority;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 89
    .line 90
    .line 91
    new-array v10, v8, [Ljava/lang/Object;

    .line 92
    .line 93
    const/4 v11, 0x0

    .line 94
    aput-object v6, v10, v11

    .line 95
    .line 96
    aput-object v9, v10, v4

    .line 97
    .line 98
    invoke-virtual/range {p0 .. p0}, Landroid/text/SpannableStringBuilder;->length()I

    .line 99
    .line 100
    .line 101
    move-result v9

    .line 102
    invoke-virtual/range {p2 .. p2}, Lcom/discord/chat/presentation/textutils/RenderContext;->getContext()Landroid/content/Context;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    invoke-virtual/range {p2 .. p2}, Lcom/discord/chat/presentation/textutils/RenderContext;->getAnimateEmoji()Z

    .line 107
    .line 108
    .line 109
    move-result v6

    .line 110
    new-instance v12, Lcom/discord/chat/presentation/textutils/EmojiRendererKt$renderEmoji$1$1;

    .line 111
    .line 112
    invoke-direct {v12, v1}, Lcom/discord/chat/presentation/textutils/EmojiRendererKt$renderEmoji$1$1;-><init>(Lcom/discord/chat/presentation/textutils/RenderContext;)V

    .line 113
    .line 114
    .line 115
    move-object/from16 v0, p0

    .line 116
    .line 117
    move-object v1, v2

    .line 118
    move-object v2, v4

    .line 119
    move v4, v6

    .line 120
    move-object v6, v12

    .line 121
    invoke-static/range {v0 .. v6}, Lcom/discord/emoji/RenderableEmojiKt;->renderEmojiInto(Lcom/facebook/drawee/span/DraweeSpanStringBuilder;Lcom/discord/emoji/RenderableEmoji;Landroid/content/Context;IZILkotlin/jvm/functions/Function1;)V

    .line 122
    .line 123
    .line 124
    :goto_2
    if-ge v11, v8, :cond_3

    .line 125
    .line 126
    aget-object v0, v10, v11

    .line 127
    .line 128
    if-eqz v0, :cond_2

    .line 129
    .line 130
    invoke-virtual/range {p0 .. p0}, Landroid/text/SpannableStringBuilder;->length()I

    .line 131
    .line 132
    .line 133
    move-result v1

    .line 134
    const/16 v2, 0x21

    .line 135
    .line 136
    invoke-virtual {v7, v0, v9, v1, v2}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 137
    .line 138
    .line 139
    :cond_2
    add-int/lit8 v11, v11, 0x1

    .line 140
    .line 141
    goto :goto_2

    .line 142
    :cond_3
    return-void
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
.end method

.method public static final renderable(Lcom/discord/chat/bridge/contentnode/EmojiContentNode;)Lcom/discord/emoji/RenderableEmoji;
    .locals 6

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p0, Lcom/discord/chat/bridge/contentnode/CustomEmojiContentNode;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    sget-object v0, Lcom/discord/emoji/RenderableEmoji;->Companion:Lcom/discord/emoji/RenderableEmoji$Companion;

    .line 11
    .line 12
    check-cast p0, Lcom/discord/chat/bridge/contentnode/CustomEmojiContentNode;

    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/discord/chat/bridge/contentnode/CustomEmojiContentNode;->getId()J

    .line 15
    .line 16
    .line 17
    move-result-wide v1

    .line 18
    invoke-virtual {p0}, Lcom/discord/chat/bridge/contentnode/CustomEmojiContentNode;->getSrc()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-static {v3}, Lpi/l;->w(Ljava/lang/CharSequence;)Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    const/4 v4, 0x1

    .line 27
    xor-int/2addr v3, v4

    .line 28
    if-eqz v3, :cond_0

    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/discord/chat/bridge/contentnode/CustomEmojiContentNode;->getSrc()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-virtual {p0}, Lcom/discord/chat/bridge/contentnode/CustomEmojiContentNode;->getFrozenSrc()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    invoke-static {v3, v5}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-nez v3, :cond_0

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    const/4 v4, 0x0

    .line 46
    :goto_0
    invoke-virtual {p0}, Lcom/discord/chat/bridge/contentnode/CustomEmojiContentNode;->getAlt()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-virtual {v0, v1, v2, v4, p0}, Lcom/discord/emoji/RenderableEmoji$Companion;->customWithEmojiId(JZLjava/lang/String;)Lcom/discord/emoji/RenderableEmoji$CustomWithEmojiId;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    goto :goto_1

    .line 55
    :cond_1
    instance-of v0, p0, Lcom/discord/chat/bridge/contentnode/UnicodeEmojiContentNode;

    .line 56
    .line 57
    if-eqz v0, :cond_2

    .line 58
    .line 59
    sget-object v0, Lcom/discord/emoji/RenderableEmoji;->Companion:Lcom/discord/emoji/RenderableEmoji$Companion;

    .line 60
    .line 61
    check-cast p0, Lcom/discord/chat/bridge/contentnode/UnicodeEmojiContentNode;

    .line 62
    .line 63
    invoke-virtual {p0}, Lcom/discord/chat/bridge/contentnode/UnicodeEmojiContentNode;->getSurrogate()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-virtual {v0, p0}, Lcom/discord/emoji/RenderableEmoji$Companion;->unicode(Ljava/lang/String;)Lcom/discord/emoji/RenderableEmoji$Unicode;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    :goto_1
    return-object p0

    .line 72
    :cond_2
    new-instance p0, Llf/q;

    .line 73
    .line 74
    invoke-direct {p0}, Llf/q;-><init>()V

    .line 75
    .line 76
    .line 77
    throw p0
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
.end method
