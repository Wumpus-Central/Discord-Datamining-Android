.class public final Lcom/discord/chat/presentation/events/CreateChatReactEventsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0008\u0010\u0000\u001a\u00020\u0001H\u0000\u00a8\u0006\u0002"
    }
    d2 = {
        "createChatReactEvents",
        "Lcom/discord/reactevents/ReactEvents;",
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
.method public static final createChatReactEvents()Lcom/discord/reactevents/ReactEvents;
    .locals 4

    .line 1
    new-instance v0, Lcom/discord/reactevents/ReactEvents;

    .line 2
    .line 3
    const/16 v1, 0x37

    .line 4
    .line 5
    new-array v1, v1, [Lkotlin/Pair;

    .line 6
    .line 7
    const-class v2, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;

    .line 8
    .line 9
    invoke-static {v2}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    const-string v3, "onChatScrollPosition"

    .line 14
    .line 15
    invoke-static {v3, v2}, Lnf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    const/4 v3, 0x0

    .line 20
    aput-object v2, v1, v3

    .line 21
    .line 22
    const-class v2, Lcom/discord/chat/reactevents/LongPressAvatarData;

    .line 23
    .line 24
    invoke-static {v2}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    const-string v3, "onLongPressAvatar"

    .line 29
    .line 30
    invoke-static {v3, v2}, Lnf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    const/4 v3, 0x1

    .line 35
    aput-object v2, v1, v3

    .line 36
    .line 37
    const-class v2, Lcom/discord/chat/reactevents/LongPressMessageEvent;

    .line 38
    .line 39
    invoke-static {v2}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    const-string v3, "onLongPressMessage"

    .line 44
    .line 45
    invoke-static {v3, v2}, Lnf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    const/4 v3, 0x2

    .line 50
    aput-object v2, v1, v3

    .line 51
    .line 52
    const-class v2, Lcom/discord/chat/reactevents/LongPressReactionData;

    .line 53
    .line 54
    invoke-static {v2}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    const-string v3, "onLongPressReaction"

    .line 59
    .line 60
    invoke-static {v3, v2}, Lnf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    const/4 v3, 0x3

    .line 65
    aput-object v2, v1, v3

    .line 66
    .line 67
    const-class v2, Lcom/discord/chat/reactevents/LongPressStickerData;

    .line 68
    .line 69
    invoke-static {v2}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    const-string v3, "onLongPressSticker"

    .line 74
    .line 75
    invoke-static {v3, v2}, Lnf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    const/4 v3, 0x4

    .line 80
    aput-object v2, v1, v3

    .line 81
    .line 82
    const-class v2, Lcom/discord/chat/reactevents/LongPressUsernameData;

    .line 83
    .line 84
    invoke-static {v2}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    const-string v3, "onLongPressUsername"

    .line 89
    .line 90
    invoke-static {v3, v2}, Lnf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    const/4 v3, 0x5

    .line 95
    aput-object v2, v1, v3

    .line 96
    .line 97
    const-class v2, Lcom/discord/chat/reactevents/LongPressCommandData;

    .line 98
    .line 99
    invoke-static {v2}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    const-string v3, "onLongPressCommandMention"

    .line 104
    .line 105
    invoke-static {v3, v2}, Lnf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    const/4 v3, 0x6

    .line 110
    aput-object v2, v1, v3

    .line 111
    .line 112
    const-class v2, Lcom/discord/chat/reactevents/LongPressChannelData;

    .line 113
    .line 114
    invoke-static {v2}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    const-string v3, "onLongPressChannel"

    .line 119
    .line 120
    invoke-static {v3, v2}, Lnf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    const/4 v3, 0x7

    .line 125
    aput-object v2, v1, v3

    .line 126
    .line 127
    const-class v2, Lcom/discord/chat/reactevents/TapAvatarData;

    .line 128
    .line 129
    invoke-static {v2}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    const-string v3, "onTapAvatar"

    .line 134
    .line 135
    invoke-static {v3, v2}, Lnf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    const/16 v3, 0x8

    .line 140
    .line 141
    aput-object v2, v1, v3

    .line 142
    .line 143
    const-class v2, Lcom/discord/chat/reactevents/TapButtonActionComponent;

    .line 144
    .line 145
    invoke-static {v2}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    const-string v3, "onTapButtonActionComponent"

    .line 150
    .line 151
    invoke-static {v3, v2}, Lnf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    const/16 v3, 0x9

    .line 156
    .line 157
    aput-object v2, v1, v3

    .line 158
    .line 159
    const-class v2, Lcom/discord/chat/reactevents/TapCallData;

    .line 160
    .line 161
    invoke-static {v2}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    const-string v3, "onTapCall"

    .line 166
    .line 167
    invoke-static {v3, v2}, Lnf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    const/16 v3, 0xa

    .line 172
    .line 173
    aput-object v2, v1, v3

    .line 174
    .line 175
    const-class v2, Lcom/discord/chat/reactevents/TapChannelData;

    .line 176
    .line 177
    invoke-static {v2}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 178
    .line 179
    .line 180
    move-result-object v2

    .line 181
    const-string v3, "onTapChannel"

    .line 182
    .line 183
    invoke-static {v3, v2}, Lnf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 184
    .line 185
    .line 186
    move-result-object v2

    .line 187
    const/16 v3, 0xb

    .line 188
    .line 189
    aput-object v2, v1, v3

    .line 190
    .line 191
    const-class v2, Lcom/discord/chat/reactevents/TapCopyText;

    .line 192
    .line 193
    invoke-static {v2}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 194
    .line 195
    .line 196
    move-result-object v2

    .line 197
    const-string v3, "onTapCopyText"

    .line 198
    .line 199
    invoke-static {v3, v2}, Lnf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 200
    .line 201
    .line 202
    move-result-object v2

    .line 203
    const/16 v3, 0xc

    .line 204
    .line 205
    aput-object v2, v1, v3

    .line 206
    .line 207
    const-class v2, Lcom/discord/chat/reactevents/TapGiftCodeAcceptData;

    .line 208
    .line 209
    invoke-static {v2}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 210
    .line 211
    .line 212
    move-result-object v2

    .line 213
    const-string v3, "onTapGiftCodeAccept"

    .line 214
    .line 215
    invoke-static {v3, v2}, Lnf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 216
    .line 217
    .line 218
    move-result-object v2

    .line 219
    const/16 v3, 0xd

    .line 220
    .line 221
    aput-object v2, v1, v3

    .line 222
    .line 223
    const-class v2, Lcom/discord/chat/reactevents/TapGiftCodeEmbedData;

    .line 224
    .line 225
    invoke-static {v2}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 226
    .line 227
    .line 228
    move-result-object v2

    .line 229
    const-string v3, "onTapGiftCodeEmbed"

    .line 230
    .line 231
    invoke-static {v3, v2}, Lnf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 232
    .line 233
    .line 234
    move-result-object v2

    .line 235
    const/16 v3, 0xe

    .line 236
    .line 237
    aput-object v2, v1, v3

    .line 238
    .line 239
    const-class v2, Lcom/discord/chat/reactevents/TapImageData;

    .line 240
    .line 241
    invoke-static {v2}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 242
    .line 243
    .line 244
    move-result-object v2

    .line 245
    const-string v3, "onTapImage"

    .line 246
    .line 247
    invoke-static {v3, v2}, Lnf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 248
    .line 249
    .line 250
    move-result-object v2

    .line 251
    const/16 v3, 0xf

    .line 252
    .line 253
    aput-object v2, v1, v3

    .line 254
    .line 255
    const-class v2, Lcom/discord/chat/reactevents/TapInviteEvent;

    .line 256
    .line 257
    invoke-static {v2}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 258
    .line 259
    .line 260
    move-result-object v2

    .line 261
    const-string v3, "onTapInviteEmbed"

    .line 262
    .line 263
    invoke-static {v3, v2}, Lnf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 264
    .line 265
    .line 266
    move-result-object v2

    .line 267
    const/16 v3, 0x10

    .line 268
    .line 269
    aput-object v2, v1, v3

    .line 270
    .line 271
    const-class v2, Lcom/discord/chat/reactevents/TapJoinActivityData;

    .line 272
    .line 273
    invoke-static {v2}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 274
    .line 275
    .line 276
    move-result-object v2

    .line 277
    const-string v3, "onTapJoinActivity"

    .line 278
    .line 279
    invoke-static {v3, v2}, Lnf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 280
    .line 281
    .line 282
    move-result-object v2

    .line 283
    const/16 v3, 0x11

    .line 284
    .line 285
    aput-object v2, v1, v3

    .line 286
    .line 287
    const-class v2, Lcom/discord/chat/reactevents/TapLinkData;

    .line 288
    .line 289
    invoke-static {v2}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 290
    .line 291
    .line 292
    move-result-object v2

    .line 293
    const-string v3, "onTapLink"

    .line 294
    .line 295
    invoke-static {v3, v2}, Lnf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 296
    .line 297
    .line 298
    move-result-object v2

    .line 299
    const/16 v3, 0x12

    .line 300
    .line 301
    aput-object v2, v1, v3

    .line 302
    .line 303
    const-class v2, Lcom/discord/chat/reactevents/LongPressLinkData;

    .line 304
    .line 305
    invoke-static {v2}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 306
    .line 307
    .line 308
    move-result-object v2

    .line 309
    const-string v3, "onLongPressLink"

    .line 310
    .line 311
    invoke-static {v3, v2}, Lnf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 312
    .line 313
    .line 314
    move-result-object v2

    .line 315
    const/16 v3, 0x13

    .line 316
    .line 317
    aput-object v2, v1, v3

    .line 318
    .line 319
    const-class v2, Lcom/discord/chat/reactevents/TapMentionData;

    .line 320
    .line 321
    invoke-static {v2}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 322
    .line 323
    .line 324
    move-result-object v2

    .line 325
    const-string v3, "onTapMention"

    .line 326
    .line 327
    invoke-static {v3, v2}, Lnf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 328
    .line 329
    .line 330
    move-result-object v2

    .line 331
    const/16 v3, 0x14

    .line 332
    .line 333
    aput-object v2, v1, v3

    .line 334
    .line 335
    const-class v2, Lcom/discord/chat/reactevents/TapCommandData;

    .line 336
    .line 337
    invoke-static {v2}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 338
    .line 339
    .line 340
    move-result-object v2

    .line 341
    const-string v3, "onTapCommandMention"

    .line 342
    .line 343
    invoke-static {v3, v2}, Lnf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 344
    .line 345
    .line 346
    move-result-object v2

    .line 347
    const/16 v3, 0x15

    .line 348
    .line 349
    aput-object v2, v1, v3

    .line 350
    .line 351
    const-class v2, Lcom/discord/chat/reactevents/TapMessageData;

    .line 352
    .line 353
    invoke-static {v2}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 354
    .line 355
    .line 356
    move-result-object v2

    .line 357
    const-string v3, "onTapMessage"

    .line 358
    .line 359
    invoke-static {v3, v2}, Lnf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 360
    .line 361
    .line 362
    move-result-object v2

    .line 363
    const/16 v3, 0x16

    .line 364
    .line 365
    aput-object v2, v1, v3

    .line 366
    .line 367
    const-class v2, Lcom/discord/chat/reactevents/TapMessageReplyData;

    .line 368
    .line 369
    invoke-static {v2}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 370
    .line 371
    .line 372
    move-result-object v2

    .line 373
    const-string v3, "onTapMessageReply"

    .line 374
    .line 375
    invoke-static {v3, v2}, Lnf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 376
    .line 377
    .line 378
    move-result-object v2

    .line 379
    const/16 v3, 0x17

    .line 380
    .line 381
    aput-object v2, v1, v3

    .line 382
    .line 383
    const-class v2, Lcom/discord/chat/reactevents/TapReactionData;

    .line 384
    .line 385
    invoke-static {v2}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 386
    .line 387
    .line 388
    move-result-object v2

    .line 389
    const-string v3, "onTapReaction"

    .line 390
    .line 391
    invoke-static {v3, v2}, Lnf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 392
    .line 393
    .line 394
    move-result-object v2

    .line 395
    const/16 v3, 0x18

    .line 396
    .line 397
    aput-object v2, v1, v3

    .line 398
    .line 399
    const-class v2, Lcom/discord/chat/reactevents/TapRoleIconData;

    .line 400
    .line 401
    invoke-static {v2}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 402
    .line 403
    .line 404
    move-result-object v2

    .line 405
    const-string v3, "onTapRoleIcon"

    .line 406
    .line 407
    invoke-static {v3, v2}, Lnf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 408
    .line 409
    .line 410
    move-result-object v2

    .line 411
    const/16 v3, 0x19

    .line 412
    .line 413
    aput-object v2, v1, v3

    .line 414
    .line 415
    const-class v2, Lcom/discord/chat/reactevents/TapSuppressNotificationsIconData;

    .line 416
    .line 417
    invoke-static {v2}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 418
    .line 419
    .line 420
    move-result-object v2

    .line 421
    const-string v3, "onTapSuppressNotificationsIcon"

    .line 422
    .line 423
    invoke-static {v3, v2}, Lnf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 424
    .line 425
    .line 426
    move-result-object v2

    .line 427
    const/16 v3, 0x1a

    .line 428
    .line 429
    aput-object v2, v1, v3

    .line 430
    .line 431
    const-class v2, Lcom/discord/chat/reactevents/TapSeeMoreData;

    .line 432
    .line 433
    invoke-static {v2}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 434
    .line 435
    .line 436
    move-result-object v2

    .line 437
    const-string v3, "onTapSeeMore"

    .line 438
    .line 439
    invoke-static {v3, v2}, Lnf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 440
    .line 441
    .line 442
    move-result-object v2

    .line 443
    const/16 v3, 0x1b

    .line 444
    .line 445
    aput-object v2, v1, v3

    .line 446
    .line 447
    const-class v2, Lcom/discord/chat/reactevents/InitiateReplyData;

    .line 448
    .line 449
    invoke-static {v2}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 450
    .line 451
    .line 452
    move-result-object v2

    .line 453
    const-string v3, "onInitiateReply"

    .line 454
    .line 455
    invoke-static {v3, v2}, Lnf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 456
    .line 457
    .line 458
    move-result-object v2

    .line 459
    const/16 v3, 0x1c

    .line 460
    .line 461
    aput-object v2, v1, v3

    .line 462
    .line 463
    const-class v2, Lcom/discord/chat/reactevents/TapConnectionsRoleTagData;

    .line 464
    .line 465
    invoke-static {v2}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 466
    .line 467
    .line 468
    move-result-object v2

    .line 469
    const-string v3, "onTapConnectionsRoleTag"

    .line 470
    .line 471
    invoke-static {v3, v2}, Lnf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 472
    .line 473
    .line 474
    move-result-object v2

    .line 475
    const/16 v3, 0x1d

    .line 476
    .line 477
    aput-object v2, v1, v3

    .line 478
    .line 479
    const-class v2, Lcom/discord/chat/reactevents/TapSelectActionComponent;

    .line 480
    .line 481
    invoke-static {v2}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 482
    .line 483
    .line 484
    move-result-object v2

    .line 485
    const-string v3, "onTapSelectActionComponent"

    .line 486
    .line 487
    invoke-static {v3, v2}, Lnf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 488
    .line 489
    .line 490
    move-result-object v2

    .line 491
    const/16 v3, 0x1e

    .line 492
    .line 493
    aput-object v2, v1, v3

    .line 494
    .line 495
    const-class v2, Lcom/discord/chat/reactevents/TapSeparatorData;

    .line 496
    .line 497
    invoke-static {v2}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 498
    .line 499
    .line 500
    move-result-object v2

    .line 501
    const-string v3, "onTapSeparator"

    .line 502
    .line 503
    invoke-static {v3, v2}, Lnf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 504
    .line 505
    .line 506
    move-result-object v2

    .line 507
    const/16 v3, 0x1f

    .line 508
    .line 509
    aput-object v2, v1, v3

    .line 510
    .line 511
    const-class v2, Lcom/discord/chat/reactevents/TapStickerData;

    .line 512
    .line 513
    invoke-static {v2}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 514
    .line 515
    .line 516
    move-result-object v2

    .line 517
    const-string v3, "onTapSticker"

    .line 518
    .line 519
    invoke-static {v3, v2}, Lnf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 520
    .line 521
    .line 522
    move-result-object v2

    .line 523
    const/16 v3, 0x20

    .line 524
    .line 525
    aput-object v2, v1, v3

    .line 526
    .line 527
    const-class v2, Lcom/discord/chat/reactevents/TapTimestampEvent;

    .line 528
    .line 529
    invoke-static {v2}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 530
    .line 531
    .line 532
    move-result-object v2

    .line 533
    const-string v3, "onTapTimestamp"

    .line 534
    .line 535
    invoke-static {v3, v2}, Lnf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 536
    .line 537
    .line 538
    move-result-object v2

    .line 539
    const/16 v3, 0x21

    .line 540
    .line 541
    aput-object v2, v1, v3

    .line 542
    .line 543
    const-class v2, Lcom/discord/chat/reactevents/TapThreadEmbedEvent;

    .line 544
    .line 545
    invoke-static {v2}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 546
    .line 547
    .line 548
    move-result-object v2

    .line 549
    const-string v3, "onTapThreadEmbed"

    .line 550
    .line 551
    invoke-static {v3, v2}, Lnf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 552
    .line 553
    .line 554
    move-result-object v2

    .line 555
    const/16 v3, 0x22

    .line 556
    .line 557
    aput-object v2, v1, v3

    .line 558
    .line 559
    const-class v2, Lcom/discord/chat/reactevents/TapUsernameData;

    .line 560
    .line 561
    invoke-static {v2}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 562
    .line 563
    .line 564
    move-result-object v2

    .line 565
    const-string v3, "onTapUsername"

    .line 566
    .line 567
    invoke-static {v3, v2}, Lnf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 568
    .line 569
    .line 570
    move-result-object v2

    .line 571
    const/16 v3, 0x23

    .line 572
    .line 573
    aput-object v2, v1, v3

    .line 574
    .line 575
    const-class v2, Lcom/discord/chat/reactevents/TapUploadProgressCloseData;

    .line 576
    .line 577
    invoke-static {v2}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 578
    .line 579
    .line 580
    move-result-object v2

    .line 581
    const-string v3, "onTapUploadProgressClose"

    .line 582
    .line 583
    invoke-static {v3, v2}, Lnf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 584
    .line 585
    .line 586
    move-result-object v2

    .line 587
    const/16 v3, 0x24

    .line 588
    .line 589
    aput-object v2, v1, v3

    .line 590
    .line 591
    const-class v2, Lcom/discord/chat/reactevents/TapCancelUploadItemData;

    .line 592
    .line 593
    invoke-static {v2}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 594
    .line 595
    .line 596
    move-result-object v2

    .line 597
    const-string v3, "onTapCancelUploadItem"

    .line 598
    .line 599
    invoke-static {v3, v2}, Lnf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 600
    .line 601
    .line 602
    move-result-object v2

    .line 603
    const/16 v3, 0x25

    .line 604
    .line 605
    aput-object v2, v1, v3

    .line 606
    .line 607
    const-class v2, Lcom/discord/chat/reactevents/TapWelcomeReplyData;

    .line 608
    .line 609
    invoke-static {v2}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 610
    .line 611
    .line 612
    move-result-object v2

    .line 613
    const-string v3, "onTapWelcomeReply"

    .line 614
    .line 615
    invoke-static {v3, v2}, Lnf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 616
    .line 617
    .line 618
    move-result-object v2

    .line 619
    const/16 v3, 0x26

    .line 620
    .line 621
    aput-object v2, v1, v3

    .line 622
    .line 623
    const-class v2, Lcom/discord/chat/reactevents/TapInviteToSpeakData;

    .line 624
    .line 625
    invoke-static {v2}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 626
    .line 627
    .line 628
    move-result-object v2

    .line 629
    const-string v3, "onTapInviteToSpeak"

    .line 630
    .line 631
    invoke-static {v3, v2}, Lnf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 632
    .line 633
    .line 634
    move-result-object v2

    .line 635
    const/16 v3, 0x27

    .line 636
    .line 637
    aput-object v2, v1, v3

    .line 638
    .line 639
    const-class v2, Lcom/discord/chat/reactevents/TapEmojiData;

    .line 640
    .line 641
    invoke-static {v2}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 642
    .line 643
    .line 644
    move-result-object v2

    .line 645
    const-string v3, "onTapEmoji"

    .line 646
    .line 647
    invoke-static {v3, v2}, Lnf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 648
    .line 649
    .line 650
    move-result-object v2

    .line 651
    const/16 v3, 0x28

    .line 652
    .line 653
    aput-object v2, v1, v3

    .line 654
    .line 655
    const-class v2, Lcom/discord/chat/reactevents/TapFollowForumPost;

    .line 656
    .line 657
    invoke-static {v2}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 658
    .line 659
    .line 660
    move-result-object v2

    .line 661
    const-string v3, "onTapFollowForumPost"

    .line 662
    .line 663
    invoke-static {v3, v2}, Lnf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 664
    .line 665
    .line 666
    move-result-object v2

    .line 667
    const/16 v3, 0x29

    .line 668
    .line 669
    aput-object v2, v1, v3

    .line 670
    .line 671
    const-class v2, Lcom/discord/chat/reactevents/TapShareForumPost;

    .line 672
    .line 673
    invoke-static {v2}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 674
    .line 675
    .line 676
    move-result-object v2

    .line 677
    const-string v3, "onTapShareForumPost"

    .line 678
    .line 679
    invoke-static {v3, v2}, Lnf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 680
    .line 681
    .line 682
    move-result-object v2

    .line 683
    const/16 v3, 0x2a

    .line 684
    .line 685
    aput-object v2, v1, v3

    .line 686
    .line 687
    const-class v2, Lcom/discord/chat/presentation/events/TapReactionOverflow;

    .line 688
    .line 689
    invoke-static {v2}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 690
    .line 691
    .line 692
    move-result-object v2

    .line 693
    const-string v3, "onTapReactionOverflow"

    .line 694
    .line 695
    invoke-static {v3, v2}, Lnf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 696
    .line 697
    .line 698
    move-result-object v2

    .line 699
    const/16 v3, 0x2b

    .line 700
    .line 701
    aput-object v2, v1, v3

    .line 702
    .line 703
    const-class v2, Lcom/discord/chat/reactevents/TapAutoModerationActionsData;

    .line 704
    .line 705
    invoke-static {v2}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 706
    .line 707
    .line 708
    move-result-object v2

    .line 709
    const-string v3, "onTapAutoModerationActions"

    .line 710
    .line 711
    invoke-static {v3, v2}, Lnf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 712
    .line 713
    .line 714
    move-result-object v2

    .line 715
    const/16 v3, 0x2c

    .line 716
    .line 717
    aput-object v2, v1, v3

    .line 718
    .line 719
    const-class v2, Lcom/discord/chat/reactevents/TapAutoModerationFeedbackData;

    .line 720
    .line 721
    invoke-static {v2}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 722
    .line 723
    .line 724
    move-result-object v2

    .line 725
    const-string v3, "onTapAutoModerationFeedback"

    .line 726
    .line 727
    invoke-static {v3, v2}, Lnf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 728
    .line 729
    .line 730
    move-result-object v2

    .line 731
    const/16 v3, 0x2d

    .line 732
    .line 733
    aput-object v2, v1, v3

    .line 734
    .line 735
    const-class v2, Lcom/discord/chat/reactevents/TapOpTagData;

    .line 736
    .line 737
    invoke-static {v2}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 738
    .line 739
    .line 740
    move-result-object v2

    .line 741
    const-string v3, "onTapOpTag"

    .line 742
    .line 743
    invoke-static {v3, v2}, Lnf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 744
    .line 745
    .line 746
    move-result-object v2

    .line 747
    const/16 v3, 0x2e

    .line 748
    .line 749
    aput-object v2, v1, v3

    .line 750
    .line 751
    const-class v2, Lcom/discord/chat/reactevents/TapShowAltTextData;

    .line 752
    .line 753
    invoke-static {v2}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 754
    .line 755
    .line 756
    move-result-object v2

    .line 757
    const-string v3, "onTapShowAltText"

    .line 758
    .line 759
    invoke-static {v3, v2}, Lnf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 760
    .line 761
    .line 762
    move-result-object v2

    .line 763
    const/16 v3, 0x2f

    .line 764
    .line 765
    aput-object v2, v1, v3

    .line 766
    .line 767
    const-class v2, Lcom/discord/chat/reactevents/VoiceMessagePlaybackEndedData;

    .line 768
    .line 769
    invoke-static {v2}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 770
    .line 771
    .line 772
    move-result-object v2

    .line 773
    const-string v3, "onVoiceMessagePlaybackEnded"

    .line 774
    .line 775
    invoke-static {v3, v2}, Lnf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 776
    .line 777
    .line 778
    move-result-object v2

    .line 779
    const/16 v3, 0x30

    .line 780
    .line 781
    aput-object v2, v1, v3

    .line 782
    .line 783
    const-class v2, Lcom/discord/chat/reactevents/VoiceMessagePlaybackFailedData;

    .line 784
    .line 785
    invoke-static {v2}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 786
    .line 787
    .line 788
    move-result-object v2

    .line 789
    const-string v3, "onVoiceMessagePlaybackFailed"

    .line 790
    .line 791
    invoke-static {v3, v2}, Lnf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 792
    .line 793
    .line 794
    move-result-object v2

    .line 795
    const/16 v3, 0x31

    .line 796
    .line 797
    aput-object v2, v1, v3

    .line 798
    .line 799
    const-class v2, Lcom/discord/chat/reactevents/VoiceMessagePlaybackStartedData;

    .line 800
    .line 801
    invoke-static {v2}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 802
    .line 803
    .line 804
    move-result-object v2

    .line 805
    const-string v3, "onVoiceMessagePlaybackStarted"

    .line 806
    .line 807
    invoke-static {v3, v2}, Lnf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 808
    .line 809
    .line 810
    move-result-object v2

    .line 811
    const/16 v3, 0x32

    .line 812
    .line 813
    aput-object v2, v1, v3

    .line 814
    .line 815
    const-class v2, Lcom/discord/chat/reactevents/TapJoinEmbeddedActivityData;

    .line 816
    .line 817
    invoke-static {v2}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 818
    .line 819
    .line 820
    move-result-object v2

    .line 821
    const-string v3, "onTapJoinEmbeddedActivity"

    .line 822
    .line 823
    invoke-static {v3, v2}, Lnf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 824
    .line 825
    .line 826
    move-result-object v2

    .line 827
    const/16 v3, 0x33

    .line 828
    .line 829
    aput-object v2, v1, v3

    .line 830
    .line 831
    const-class v2, Lcom/discord/chat/reactevents/TapDismissEmbeddedActivityData;

    .line 832
    .line 833
    invoke-static {v2}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 834
    .line 835
    .line 836
    move-result-object v2

    .line 837
    const-string v3, "onTapDismissEmbeddedActivity"

    .line 838
    .line 839
    invoke-static {v3, v2}, Lnf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 840
    .line 841
    .line 842
    move-result-object v2

    .line 843
    const/16 v3, 0x34

    .line 844
    .line 845
    aput-object v2, v1, v3

    .line 846
    .line 847
    const-class v2, Lcom/discord/chat/reactevents/TapActivityLauncherEmbedData;

    .line 848
    .line 849
    invoke-static {v2}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 850
    .line 851
    .line 852
    move-result-object v2

    .line 853
    const-string v3, "onTapActivityLauncherEmbed"

    .line 854
    .line 855
    invoke-static {v3, v2}, Lnf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 856
    .line 857
    .line 858
    move-result-object v2

    .line 859
    const/16 v3, 0x35

    .line 860
    .line 861
    aput-object v2, v1, v3

    .line 862
    .line 863
    const-class v2, Lcom/discord/chat/reactevents/TapPostPreviewEmbedData;

    .line 864
    .line 865
    invoke-static {v2}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 866
    .line 867
    .line 868
    move-result-object v2

    .line 869
    const-string v3, "onTapPostPreviewEmbed"

    .line 870
    .line 871
    invoke-static {v3, v2}, Lnf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 872
    .line 873
    .line 874
    move-result-object v2

    .line 875
    const/16 v3, 0x36

    .line 876
    .line 877
    aput-object v2, v1, v3

    .line 878
    .line 879
    invoke-direct {v0, v1}, Lcom/discord/reactevents/ReactEvents;-><init>([Lkotlin/Pair;)V

    .line 880
    .line 881
    .line 882
    return-object v0
.end method
