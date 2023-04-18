.class public final Lcom/discord/chat/presentation/message/viewholder/ThreadEmbedViewHolder;
.super Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J%\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\n\u00f8\u0001\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/discord/chat/presentation/message/viewholder/ThreadEmbedViewHolder;",
        "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;",
        "threadEmbedView",
        "Lcom/discord/chat/presentation/message/view/ThreadEmbedView;",
        "(Lcom/discord/chat/presentation/message/view/ThreadEmbedView;)V",
        "bind",
        "",
        "threadItem",
        "Lcom/discord/chat/presentation/message/messagepart/ThreadEmbedMessageAccessory;",
        "onTapThreadEmbed",
        "Lkotlin/Function1;",
        "Lcom/discord/primitives/MessageId;",
        "chat_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final threadEmbedView:Lcom/discord/chat/presentation/message/view/ThreadEmbedView;


# direct methods
.method public constructor <init>(Lcom/discord/chat/presentation/message/view/ThreadEmbedView;)V
    .locals 1

    .line 1
    const-string v0, "threadEmbedView"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-direct {p0, p1, v0}, Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;-><init>(Landroid/view/View;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lcom/discord/chat/presentation/message/viewholder/ThreadEmbedViewHolder;->threadEmbedView:Lcom/discord/chat/presentation/message/view/ThreadEmbedView;

    .line 11
    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
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

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Lcom/discord/chat/presentation/message/messagepart/ThreadEmbedMessageAccessory;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/discord/chat/presentation/message/viewholder/ThreadEmbedViewHolder;->bind$lambda$1$lambda$0(Lkotlin/jvm/functions/Function1;Lcom/discord/chat/presentation/message/messagepart/ThreadEmbedMessageAccessory;Landroid/view/View;)V

    return-void
.end method

.method private static final bind$lambda$1$lambda$0(Lkotlin/jvm/functions/Function1;Lcom/discord/chat/presentation/message/messagepart/ThreadEmbedMessageAccessory;Landroid/view/View;)V
    .locals 0

    .line 1
    const-string p2, "$onTapThreadEmbed"

    .line 2
    .line 3
    invoke-static {p0, p2}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p2, "$threadItem"

    .line 7
    .line 8
    invoke-static {p1, p2}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/discord/chat/presentation/message/messagepart/ThreadEmbedMessageAccessory;->getMessageId-3Eiw7ao()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {p1}, Lcom/discord/primitives/MessageId;->box-impl(Ljava/lang/String;)Lcom/discord/primitives/MessageId;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    return-void
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
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


# virtual methods
.method public final bind(Lcom/discord/chat/presentation/message/messagepart/ThreadEmbedMessageAccessory;Lkotlin/jvm/functions/Function1;)V
    .locals 33
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/discord/chat/presentation/message/messagepart/ThreadEmbedMessageAccessory;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/discord/primitives/MessageId;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    const-string v2, "threadItem"

    .line 6
    .line 7
    invoke-static {v0, v2}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string v2, "onTapThreadEmbed"

    .line 11
    .line 12
    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/presentation/message/messagepart/ThreadEmbedMessageAccessory;->getThreadEmbed()Lcom/discord/chat/bridge/threads/ThreadEmbed;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    move-object/from16 v3, p0

    .line 20
    .line 21
    iget-object v4, v3, Lcom/discord/chat/presentation/message/viewholder/ThreadEmbedViewHolder;->threadEmbedView:Lcom/discord/chat/presentation/message/view/ThreadEmbedView;

    .line 22
    .line 23
    invoke-virtual {v2}, Lcom/discord/chat/bridge/threads/ThreadEmbed;->getTitle()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    invoke-virtual {v4, v5}, Lcom/discord/chat/presentation/message/view/ThreadEmbedView;->setTitle(Ljava/lang/CharSequence;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2}, Lcom/discord/chat/bridge/threads/ThreadEmbed;->getMessageCountLabel()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    invoke-virtual {v4, v5}, Lcom/discord/chat/presentation/message/view/ThreadEmbedView;->setLabel(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2}, Lcom/discord/chat/bridge/threads/ThreadEmbed;->getArchived()Ljava/lang/Boolean;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 42
    .line 43
    invoke-static {v5, v6}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    invoke-virtual {v2}, Lcom/discord/chat/bridge/threads/ThreadEmbed;->getArchivedIconUrl()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v7

    .line 51
    invoke-virtual {v4, v5, v7}, Lcom/discord/chat/presentation/message/view/ThreadEmbedView;->setArchived(ZLjava/lang/String;)V

    .line 52
    .line 53
    .line 54
    new-instance v5, Lcom/discord/chat/presentation/message/viewholder/q;

    .line 55
    .line 56
    invoke-direct {v5, v1, v0}, Lcom/discord/chat/presentation/message/viewholder/q;-><init>(Lkotlin/jvm/functions/Function1;Lcom/discord/chat/presentation/message/messagepart/ThreadEmbedMessageAccessory;)V

    .line 57
    .line 58
    .line 59
    const/4 v0, 0x0

    .line 60
    const/4 v1, 0x1

    .line 61
    const/4 v7, 0x0

    .line 62
    invoke-static {v4, v0, v5, v1, v7}, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchUtilsKt;->setOnClickListenerNested$default(Landroid/view/View;ZLandroid/view/View$OnClickListener;ILjava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v2}, Lcom/discord/chat/bridge/threads/ThreadEmbed;->getReferencedMessage()Lcom/discord/chat/bridge/threads/ThreadEmbedMessage;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    if-eqz v5, :cond_0

    .line 70
    .line 71
    invoke-virtual {v5}, Lcom/discord/chat/bridge/threads/ThreadEmbedMessage;->getMessage()Lcom/discord/chat/bridge/Message;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    goto :goto_0

    .line 76
    :cond_0
    move-object v5, v7

    .line 77
    :goto_0
    const-string v8, ""

    .line 78
    .line 79
    const-string v9, "context"

    .line 80
    .line 81
    if-nez v5, :cond_2

    .line 82
    .line 83
    new-instance v10, Lcom/facebook/drawee/span/DraweeSpanStringBuilder;

    .line 84
    .line 85
    invoke-virtual {v2}, Lcom/discord/chat/bridge/threads/ThreadEmbed;->getMessagePreviewString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v11

    .line 89
    if-nez v11, :cond_1

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_1
    move-object v8, v11

    .line 93
    :goto_1
    invoke-direct {v10, v8}, Lcom/facebook/drawee/span/DraweeSpanStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 94
    .line 95
    .line 96
    goto :goto_3

    .line 97
    :cond_2
    invoke-virtual {v5}, Lcom/discord/chat/bridge/Message;->getContent()Lcom/discord/chat/bridge/structurabletext/StructurableText;

    .line 98
    .line 99
    .line 100
    move-result-object v10

    .line 101
    if-eqz v10, :cond_3

    .line 102
    .line 103
    invoke-virtual {v5}, Lcom/discord/chat/bridge/Message;->getContent()Lcom/discord/chat/bridge/structurabletext/StructurableText;

    .line 104
    .line 105
    .line 106
    move-result-object v11

    .line 107
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 108
    .line 109
    .line 110
    move-result-object v8

    .line 111
    move-object v12, v8

    .line 112
    invoke-static {v8, v9}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v5}, Lcom/discord/chat/bridge/Message;->getId-3Eiw7ao()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v13

    .line 119
    invoke-static {v5}, Lcom/discord/chat/bridge/MessageKt;->shouldAnimateEmoji(Lcom/discord/chat/bridge/Message;)Z

    .line 120
    .line 121
    .line 122
    move-result v14

    .line 123
    invoke-virtual {v5}, Lcom/discord/chat/bridge/Message;->getShouldShowRoleDot()Z

    .line 124
    .line 125
    .line 126
    move-result v15

    .line 127
    invoke-virtual {v5}, Lcom/discord/chat/bridge/Message;->getShouldShowRoleOnName()Z

    .line 128
    .line 129
    .line 130
    move-result v16

    .line 131
    const/16 v17, 0x0

    .line 132
    .line 133
    const/16 v18, 0x0

    .line 134
    .line 135
    const/16 v19, 0x0

    .line 136
    .line 137
    const/16 v20, 0x0

    .line 138
    .line 139
    const/16 v21, 0x0

    .line 140
    .line 141
    const/16 v22, 0x0

    .line 142
    .line 143
    const/16 v23, 0x0

    .line 144
    .line 145
    const/16 v24, 0x0

    .line 146
    .line 147
    const/16 v25, 0x0

    .line 148
    .line 149
    const/16 v26, 0x0

    .line 150
    .line 151
    const/16 v27, 0x0

    .line 152
    .line 153
    const/16 v28, 0x1

    .line 154
    .line 155
    const/16 v29, 0x0

    .line 156
    .line 157
    invoke-virtual {v4}, Lcom/discord/chat/presentation/message/view/ThreadEmbedView;->getBinding()Lcom/discord/chat/databinding/ThreadEmbedViewBinding;

    .line 158
    .line 159
    .line 160
    move-result-object v8

    .line 161
    iget-object v8, v8, Lcom/discord/chat/databinding/ThreadEmbedViewBinding;->threadEmbedMostRecentMessageContent:Lcom/facebook/drawee/span/SimpleDraweeSpanTextView;

    .line 162
    .line 163
    invoke-virtual {v8}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 164
    .line 165
    .line 166
    move-result-object v8

    .line 167
    invoke-virtual {v8}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    .line 168
    .line 169
    .line 170
    move-result-object v8

    .line 171
    const-string v10, "binding.threadEmbedMostR\u2026Content.paint.fontMetrics"

    .line 172
    .line 173
    invoke-static {v8, v10}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    invoke-static {v8}, Lcom/discord/chat/presentation/textutils/TextUtilsKt;->getBaselineHeight(Landroid/graphics/Paint$FontMetrics;)F

    .line 177
    .line 178
    .line 179
    move-result v30

    .line 180
    const v31, 0x2ffe0

    .line 181
    .line 182
    .line 183
    const/16 v32, 0x0

    .line 184
    .line 185
    invoke-static/range {v11 .. v32}, Lcom/discord/chat/presentation/textutils/TextUtilsKt;->toSpannable$default(Lcom/discord/chat/bridge/structurabletext/StructurableText;Landroid/content/Context;Ljava/lang/String;ZZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ZLcom/discord/theme/DiscordTheme;FILjava/lang/Object;)Lcom/facebook/drawee/span/DraweeSpanStringBuilder;

    .line 186
    .line 187
    .line 188
    move-result-object v10

    .line 189
    goto :goto_3

    .line 190
    :cond_3
    new-instance v10, Lcom/facebook/drawee/span/DraweeSpanStringBuilder;

    .line 191
    .line 192
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 193
    .line 194
    .line 195
    move-result-object v11

    .line 196
    invoke-static {v11, v9}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    invoke-static {v11, v5}, Lcom/discord/chat/presentation/message/viewholder/ThreadEmbedViewHolderKt;->access$getContentlessPreviewText(Landroid/content/Context;Lcom/discord/chat/bridge/Message;)Ljava/lang/CharSequence;

    .line 200
    .line 201
    .line 202
    move-result-object v11

    .line 203
    if-nez v11, :cond_4

    .line 204
    .line 205
    goto :goto_2

    .line 206
    :cond_4
    move-object v8, v11

    .line 207
    :goto_2
    invoke-direct {v10, v8}, Lcom/facebook/drawee/span/DraweeSpanStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 208
    .line 209
    .line 210
    :goto_3
    if-eqz v5, :cond_5

    .line 211
    .line 212
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 213
    .line 214
    .line 215
    move-result-object v8

    .line 216
    invoke-static {v8, v9}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    invoke-static {v5, v8}, Lcom/discord/chat/bridge/MessageKt;->avatarUrl(Lcom/discord/chat/bridge/Message;Landroid/content/Context;)Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v8

    .line 223
    goto :goto_4

    .line 224
    :cond_5
    move-object v8, v7

    .line 225
    :goto_4
    if-eqz v5, :cond_6

    .line 226
    .line 227
    invoke-virtual {v5}, Lcom/discord/chat/bridge/Message;->getUsername()Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v7

    .line 231
    :cond_6
    invoke-virtual {v2}, Lcom/discord/chat/bridge/threads/ThreadEmbed;->getArchived()Ljava/lang/Boolean;

    .line 232
    .line 233
    .line 234
    move-result-object v2

    .line 235
    invoke-static {v2, v6}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    move-result v2

    .line 239
    if-nez v2, :cond_7

    .line 240
    .line 241
    if-eqz v5, :cond_7

    .line 242
    .line 243
    invoke-virtual {v5}, Lcom/discord/chat/bridge/Message;->getContent()Lcom/discord/chat/bridge/structurabletext/StructurableText;

    .line 244
    .line 245
    .line 246
    move-result-object v2

    .line 247
    if-nez v2, :cond_8

    .line 248
    .line 249
    :cond_7
    move v0, v1

    .line 250
    :cond_8
    invoke-virtual {v4, v8, v7, v10, v0}, Lcom/discord/chat/presentation/message/view/ThreadEmbedView;->setMessage(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/drawee/span/DraweeSpanStringBuilder;Z)V

    .line 251
    .line 252
    .line 253
    return-void
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
.end method
