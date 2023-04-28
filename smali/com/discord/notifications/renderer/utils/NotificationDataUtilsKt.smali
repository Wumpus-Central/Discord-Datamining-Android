.class public final Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000l\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000b\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0000\u001a,\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u001a/\u0010\u0008\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00032\u0008\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0006H\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0002\u0008\r\u001a(\u0010\u000e\u001a\u00020\u0001*\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005H\u0000\u001a0\u0010\u0010\u001a\u0004\u0018\u00010\u0011*\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005\u001a\u0016\u0010\u0014\u001a\u0004\u0018\u00010\t*\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a(\u0010\u0015\u001a\u00020\u0001*\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005H\u0000\u001a\u000e\u0010\u0016\u001a\u0004\u0018\u00010\t*\u00020\u000fH\u0000\u001a\u0014\u0010\u0017\u001a\u00020\u0001*\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u0011*\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u000c\u0010\u0019\u001a\u00020\u0006*\u00020\u000fH\u0000\u001a\u0014\u0010\u001a\u001a\u00020\u0006*\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u0014\u0010\u001b\u001a\u00020\u0006*\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u0011*\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u000c\u0010\u001d\u001a\u00020\u0006*\u00020\u000fH\u0000\u001a\u000c\u0010\u001e\u001a\u00020\u001f*\u00020\u000fH\u0000\u001a\u0016\u0010 \u001a\u00020!*\u00020\u000f2\u0008\u0010\"\u001a\u0004\u0018\u00010#H\u0000\u001a\u0018\u0010$\u001a\u0004\u0018\u00010!*\u00020\u000f2\u0008\u0010\"\u001a\u0004\u0018\u00010#H\u0000\u001a<\u0010%\u001a\u00020&*\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\u0008\u0010\"\u001a\u0004\u0018\u00010#2\u0008\u0010\'\u001a\u0004\u0018\u00010#H\u0000\u001a\u000c\u0010(\u001a\u00020)*\u00020\u000fH\u0000\u001a\u0016\u0010*\u001a\u0004\u0018\u00010+*\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\n\u0010,\u001a\u00020\u0006*\u00020\u000f\u001a\u001c\u0010-\u001a\u0004\u0018\u00010\u0011*\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010.\u001a\u00020)\u001a\u0014\u0010/\u001a\u00020\t*\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u000c\u00100\u001a\u00020\u0013*\u00020\u000fH\u0000\u001a\u000c\u00101\u001a\u00020\u0013*\u00020\u000fH\u0000\u001a\u0016\u00102\u001a\u0004\u0018\u00010\t*\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u000c\u00103\u001a\u00020\u0013*\u00020\u000fH\u0000\u001a\u000c\u00104\u001a\u000205*\u00020#H\u0002\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u00066"
    }
    d2 = {
        "getPendingIntent",
        "Landroid/app/PendingIntent;",
        "context",
        "Landroid/content/Context;",
        "notificationDataMap",
        "",
        "",
        "tag",
        "getSystemMessageUserJoin",
        "",
        "userId",
        "Lcom/discord/primitives/UserId;",
        "userName",
        "getSystemMessageUserJoin-_NT-lnE",
        "getButtonPendingIntent",
        "Lcom/discord/notifications/api/NotificationData;",
        "getCallAction",
        "Landroidx/core/app/NotificationCompat$Action;",
        "isAcceptAction",
        "",
        "getContent",
        "getContentPendingIntent",
        "getConversationTitle",
        "getDeletePendingIntent",
        "getDirectReplyAction",
        "getGroupKey",
        "getIconUrl",
        "getIconUrlForAvatar",
        "getMarkAsReadAction",
        "getNotificationCategory",
        "getSendTime",
        "",
        "getSender",
        "Landroidx/core/app/Person;",
        "icon",
        "Landroid/graphics/Bitmap;",
        "getSenderForMessageNotification",
        "getShortcutInfo",
        "Landroidx/core/content/pm/ShortcutInfoCompat;",
        "avatar",
        "getSmallIcon",
        "",
        "getSound",
        "Landroid/net/Uri;",
        "getTag",
        "getTimedMuteAction",
        "numMessages",
        "getTitle",
        "isConversation",
        "isGroupConversation",
        "renderMessageContent",
        "shouldUseBigText",
        "toIconCompat",
        "Landroidx/core/graphics/drawable/IconCompat;",
        "notification_renderer_release"
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
.method public static final getButtonPendingIntent(Lcom/discord/notifications/api/NotificationData;Landroid/content/Context;Ljava/util/Map;)Landroid/app/PendingIntent;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/discord/notifications/api/NotificationData;",
            "Landroid/content/Context;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Landroid/app/PendingIntent;"
        }
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "context"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "notificationDataMap"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-static {p0}, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt;->getTag(Lcom/discord/notifications/api/NotificationData;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    new-instance v0, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string p0, "button"

    .line 29
    .line 30
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-static {p1, p2, p0}, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt;->getPendingIntent(Landroid/content/Context;Ljava/util/Map;Ljava/lang/String;)Landroid/app/PendingIntent;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0
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
.end method

.method public static final getCallAction(Lcom/discord/notifications/api/NotificationData;Landroid/content/Context;ZLjava/util/Map;)Landroidx/core/app/NotificationCompat$Action;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/discord/notifications/api/NotificationData;",
            "Landroid/content/Context;",
            "Z",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Landroidx/core/app/NotificationCompat$Action;"
        }
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "context"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "notificationDataMap"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getType()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-string v1, "CALL_RING"

    .line 21
    .line 22
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const/4 v1, 0x0

    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    return-object v1

    .line 30
    :cond_0
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getChannelId-qMVnFVQ()Lcom/discord/primitives/ChannelId;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    if-eqz v0, :cond_4

    .line 35
    .line 36
    invoke-virtual {v0}, Lcom/discord/primitives/ChannelId;->unbox-impl()J

    .line 37
    .line 38
    .line 39
    move-result-wide v2

    .line 40
    if-eqz p2, :cond_1

    .line 41
    .line 42
    invoke-static {p3}, Lof/s;->v(Ljava/util/Map;)Ljava/util/Map;

    .line 43
    .line 44
    .line 45
    move-result-object p3

    .line 46
    const-string v0, "type"

    .line 47
    .line 48
    const-string v2, "CALL_CONNECT"

    .line 49
    .line 50
    invoke-interface {p3, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-static {p0, p1, p3}, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt;->getButtonPendingIntent(Lcom/discord/notifications/api/NotificationData;Landroid/content/Context;Ljava/util/Map;)Landroid/app/PendingIntent;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    goto :goto_0

    .line 60
    :cond_1
    new-instance p3, Lcom/discord/notifications/actions/intents/DismissCallAction;

    .line 61
    .line 62
    invoke-static {p0}, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt;->getTag(Lcom/discord/notifications/api/NotificationData;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-direct {p3, p0, v2, v3, v1}, Lcom/discord/notifications/actions/intents/DismissCallAction;-><init>(Ljava/lang/String;JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 67
    .line 68
    .line 69
    const/4 v4, 0x0

    .line 70
    const/4 v5, 0x0

    .line 71
    const/4 v6, 0x6

    .line 72
    const/4 v7, 0x0

    .line 73
    move-object v2, p3

    .line 74
    move-object v3, p1

    .line 75
    invoke-static/range {v2 .. v7}, Lcom/discord/notifications/actions/intents/NotificationAction$DefaultImpls;->toPendingIntent$default(Lcom/discord/notifications/actions/intents/NotificationAction;Landroid/content/Context;IZILjava/lang/Object;)Landroid/app/PendingIntent;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    :goto_0
    const/4 p3, 0x2

    .line 80
    if-eqz p2, :cond_2

    .line 81
    .line 82
    sget-object v0, Lcom/discord/react_strings/I18nMessage;->JOIN_CALL:Lcom/discord/react_strings/I18nMessage;

    .line 83
    .line 84
    invoke-static {p1, v0, v1, p3, v1}, Lcom/discord/react_strings/I18nUtilsKt;->i18nFormat$default(Landroid/content/Context;Lcom/discord/react_strings/I18nMessage;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/CharSequence;

    .line 85
    .line 86
    .line 87
    move-result-object p3

    .line 88
    sget v0, Lcom/discord/notifications/renderer/R$color;->green_360:I

    .line 89
    .line 90
    invoke-static {p1, v0}, Lcom/discord/theme/utils/ColorUtilsKt;->getColorCompat(Landroid/content/Context;I)I

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-static {p3, p1}, Lnf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    goto :goto_1

    .line 103
    :cond_2
    sget-object v0, Lcom/discord/react_strings/I18nMessage;->DECLINE:Lcom/discord/react_strings/I18nMessage;

    .line 104
    .line 105
    invoke-static {p1, v0, v1, p3, v1}, Lcom/discord/react_strings/I18nUtilsKt;->i18nFormat$default(Landroid/content/Context;Lcom/discord/react_strings/I18nMessage;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/CharSequence;

    .line 106
    .line 107
    .line 108
    move-result-object p3

    .line 109
    sget v0, Lcom/discord/notifications/renderer/R$color;->red_400:I

    .line 110
    .line 111
    invoke-static {p1, v0}, Lcom/discord/theme/utils/ColorUtilsKt;->getColorCompat(Landroid/content/Context;I)I

    .line 112
    .line 113
    .line 114
    move-result p1

    .line 115
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    invoke-static {p3, p1}, Lnf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    :goto_1
    invoke-virtual {p1}, Lkotlin/Pair;->a()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p3

    .line 127
    check-cast p3, Ljava/lang/CharSequence;

    .line 128
    .line 129
    invoke-virtual {p1}, Lkotlin/Pair;->b()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    check-cast p1, Ljava/lang/Number;

    .line 134
    .line 135
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 136
    .line 137
    .line 138
    move-result p1

    .line 139
    new-instance v0, Landroid/text/SpannableStringBuilder;

    .line 140
    .line 141
    invoke-direct {v0}, Landroid/text/SpannableStringBuilder;-><init>()V

    .line 142
    .line 143
    .line 144
    new-instance v1, Landroid/text/style/StyleSpan;

    .line 145
    .line 146
    const/4 v2, 0x1

    .line 147
    invoke-direct {v1, v2}, Landroid/text/style/StyleSpan;-><init>(I)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0}, Landroid/text/SpannableStringBuilder;->length()I

    .line 151
    .line 152
    .line 153
    move-result v2

    .line 154
    new-instance v3, Landroid/text/style/ForegroundColorSpan;

    .line 155
    .line 156
    invoke-direct {v3, p1}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v0}, Landroid/text/SpannableStringBuilder;->length()I

    .line 160
    .line 161
    .line 162
    move-result p1

    .line 163
    invoke-virtual {v0, p3}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v0}, Landroid/text/SpannableStringBuilder;->length()I

    .line 167
    .line 168
    .line 169
    move-result p3

    .line 170
    const/16 v4, 0x11

    .line 171
    .line 172
    invoke-virtual {v0, v3, p1, p3, v4}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v0}, Landroid/text/SpannableStringBuilder;->length()I

    .line 176
    .line 177
    .line 178
    move-result p1

    .line 179
    invoke-virtual {v0, v1, v2, p1, v4}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 180
    .line 181
    .line 182
    new-instance p1, Landroidx/core/app/NotificationCompat$Action$a;

    .line 183
    .line 184
    if-eqz p2, :cond_3

    .line 185
    .line 186
    sget p2, Lcom/discord/notifications/renderer/R$drawable;->ic_call_24dp:I

    .line 187
    .line 188
    goto :goto_2

    .line 189
    :cond_3
    sget p2, Lcom/discord/notifications/renderer/R$drawable;->ic_call_disconnect_24dp:I

    .line 190
    .line 191
    :goto_2
    invoke-direct {p1, p2, v0, p0}, Landroidx/core/app/NotificationCompat$Action$a;-><init>(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {p1}, Landroidx/core/app/NotificationCompat$Action$a;->b()Landroidx/core/app/NotificationCompat$Action;

    .line 195
    .line 196
    .line 197
    move-result-object p0

    .line 198
    return-object p0

    .line 199
    :cond_4
    return-object v1
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
.end method

.method public static final getContent(Lcom/discord/notifications/api/NotificationData;Landroid/content/Context;)Ljava/lang/CharSequence;
    .locals 7

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "context"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getType()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/4 v2, 0x3

    .line 20
    const/4 v3, 0x2

    .line 21
    const-string v4, ""

    .line 22
    .line 23
    const/4 v5, 0x0

    .line 24
    const/4 v6, 0x1

    .line 25
    sparse-switch v1, :sswitch_data_0

    .line 26
    .line 27
    .line 28
    goto/16 :goto_1a

    .line 29
    .line 30
    :sswitch_0
    const-string v1, "CALL_RING"

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-nez v0, :cond_0

    .line 37
    .line 38
    goto/16 :goto_1a

    .line 39
    .line 40
    :cond_0
    sget-object v0, Lcom/discord/react_strings/I18nMessage;->OVERLAY_FRIEND_CALLING:Lcom/discord/react_strings/I18nMessage;

    .line 41
    .line 42
    new-instance v1, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt$getContent$4;

    .line 43
    .line 44
    invoke-direct {v1, p0}, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt$getContent$4;-><init>(Lcom/discord/notifications/api/NotificationData;)V

    .line 45
    .line 46
    .line 47
    invoke-static {p1, v0, v1}, Lcom/discord/react_strings/I18nUtilsKt;->i18nFormat(Landroid/content/Context;Lcom/discord/react_strings/I18nMessage;Lkotlin/jvm/functions/Function1;)Ljava/lang/CharSequence;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    goto/16 :goto_1a

    .line 52
    .line 53
    :sswitch_1
    const-string v1, "MESSAGE_CREATE"

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-nez v0, :cond_1

    .line 60
    .line 61
    goto/16 :goto_1a

    .line 62
    .line 63
    :cond_1
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getChannelType()Ljava/lang/Integer;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    if-nez v0, :cond_2

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    if-nez v1, :cond_3

    .line 75
    .line 76
    :goto_0
    move v1, v6

    .line 77
    goto :goto_3

    .line 78
    :cond_3
    :goto_1
    if-nez v0, :cond_4

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_4
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    if-ne v1, v3, :cond_5

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_5
    :goto_2
    move v1, v5

    .line 89
    :goto_3
    if-eqz v1, :cond_6

    .line 90
    .line 91
    :goto_4
    move v1, v6

    .line 92
    goto :goto_6

    .line 93
    :cond_6
    if-nez v0, :cond_7

    .line 94
    .line 95
    goto :goto_5

    .line 96
    :cond_7
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    const/4 v3, 0x5

    .line 101
    if-ne v1, v3, :cond_8

    .line 102
    .line 103
    goto :goto_4

    .line 104
    :cond_8
    :goto_5
    move v1, v5

    .line 105
    :goto_6
    if-eqz v1, :cond_9

    .line 106
    .line 107
    :goto_7
    move v1, v6

    .line 108
    goto :goto_9

    .line 109
    :cond_9
    if-nez v0, :cond_a

    .line 110
    .line 111
    goto :goto_8

    .line 112
    :cond_a
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    const/16 v3, 0xa

    .line 117
    .line 118
    if-ne v1, v3, :cond_b

    .line 119
    .line 120
    goto :goto_7

    .line 121
    :cond_b
    :goto_8
    move v1, v5

    .line 122
    :goto_9
    if-eqz v1, :cond_c

    .line 123
    .line 124
    :goto_a
    move v1, v6

    .line 125
    goto :goto_c

    .line 126
    :cond_c
    if-nez v0, :cond_d

    .line 127
    .line 128
    goto :goto_b

    .line 129
    :cond_d
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 130
    .line 131
    .line 132
    move-result v1

    .line 133
    const/16 v3, 0xb

    .line 134
    .line 135
    if-ne v1, v3, :cond_e

    .line 136
    .line 137
    goto :goto_a

    .line 138
    :cond_e
    :goto_b
    move v1, v5

    .line 139
    :goto_c
    if-eqz v1, :cond_f

    .line 140
    .line 141
    :goto_d
    move v1, v6

    .line 142
    goto :goto_f

    .line 143
    :cond_f
    if-nez v0, :cond_10

    .line 144
    .line 145
    goto :goto_e

    .line 146
    :cond_10
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 147
    .line 148
    .line 149
    move-result v1

    .line 150
    const/16 v3, 0xc

    .line 151
    .line 152
    if-ne v1, v3, :cond_11

    .line 153
    .line 154
    goto :goto_d

    .line 155
    :cond_11
    :goto_e
    move v1, v5

    .line 156
    :goto_f
    if-eqz v1, :cond_16

    .line 157
    .line 158
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getMessageType()Ljava/lang/Integer;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    if-nez v0, :cond_12

    .line 163
    .line 164
    goto :goto_10

    .line 165
    :cond_12
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 166
    .line 167
    .line 168
    move-result v0

    .line 169
    const/4 v1, 0x7

    .line 170
    if-ne v0, v1, :cond_13

    .line 171
    .line 172
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getUserId-wUX8bhU()Lcom/discord/primitives/UserId;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getUserUsername()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object p0

    .line 180
    invoke-static {p1, v0, p0}, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt;->getSystemMessageUserJoin-_NT-lnE(Landroid/content/Context;Lcom/discord/primitives/UserId;Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 181
    .line 182
    .line 183
    move-result-object v4

    .line 184
    goto/16 :goto_1a

    .line 185
    .line 186
    :cond_13
    :goto_10
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getMessageActivityType()Ljava/lang/Integer;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    if-nez v0, :cond_14

    .line 191
    .line 192
    goto :goto_11

    .line 193
    :cond_14
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 194
    .line 195
    .line 196
    move-result v0

    .line 197
    if-ne v0, v6, :cond_15

    .line 198
    .line 199
    sget-object v0, Lcom/discord/react_strings/I18nMessage;->NOTIFICATION_MESSAGE_CREATE_GUILD_ACTIVITY_JOIN:Lcom/discord/react_strings/I18nMessage;

    .line 200
    .line 201
    new-instance v1, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt$getContent$1;

    .line 202
    .line 203
    invoke-direct {v1, p0}, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt$getContent$1;-><init>(Lcom/discord/notifications/api/NotificationData;)V

    .line 204
    .line 205
    .line 206
    invoke-static {p1, v0, v1}, Lcom/discord/react_strings/I18nUtilsKt;->i18nFormat(Landroid/content/Context;Lcom/discord/react_strings/I18nMessage;Lkotlin/jvm/functions/Function1;)Ljava/lang/CharSequence;

    .line 207
    .line 208
    .line 209
    move-result-object v4

    .line 210
    goto/16 :goto_1a

    .line 211
    .line 212
    :cond_15
    :goto_11
    invoke-static {p0, p1}, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt;->renderMessageContent(Lcom/discord/notifications/api/NotificationData;Landroid/content/Context;)Ljava/lang/CharSequence;

    .line 213
    .line 214
    .line 215
    move-result-object v4

    .line 216
    goto/16 :goto_1a

    .line 217
    .line 218
    :cond_16
    if-nez v0, :cond_17

    .line 219
    .line 220
    goto :goto_13

    .line 221
    :cond_17
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 222
    .line 223
    .line 224
    move-result v1

    .line 225
    if-ne v1, v2, :cond_18

    .line 226
    .line 227
    :goto_12
    move v5, v6

    .line 228
    goto :goto_14

    .line 229
    :cond_18
    :goto_13
    if-nez v0, :cond_19

    .line 230
    .line 231
    goto :goto_14

    .line 232
    :cond_19
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 233
    .line 234
    .line 235
    move-result v0

    .line 236
    if-ne v0, v6, :cond_1a

    .line 237
    .line 238
    goto :goto_12

    .line 239
    :cond_1a
    :goto_14
    if-eqz v5, :cond_2f

    .line 240
    .line 241
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getMessageActivityType()Ljava/lang/Integer;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    if-nez v0, :cond_1b

    .line 246
    .line 247
    goto :goto_15

    .line 248
    :cond_1b
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 249
    .line 250
    .line 251
    move-result v0

    .line 252
    if-ne v0, v6, :cond_1c

    .line 253
    .line 254
    sget-object v0, Lcom/discord/react_strings/I18nMessage;->NOTIFICATION_MESSAGE_CREATE_DM_ACTIVITY_JOIN:Lcom/discord/react_strings/I18nMessage;

    .line 255
    .line 256
    new-instance v1, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt$getContent$2;

    .line 257
    .line 258
    invoke-direct {v1, p0}, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt$getContent$2;-><init>(Lcom/discord/notifications/api/NotificationData;)V

    .line 259
    .line 260
    .line 261
    invoke-static {p1, v0, v1}, Lcom/discord/react_strings/I18nUtilsKt;->i18nFormat(Landroid/content/Context;Lcom/discord/react_strings/I18nMessage;Lkotlin/jvm/functions/Function1;)Ljava/lang/CharSequence;

    .line 262
    .line 263
    .line 264
    move-result-object v4

    .line 265
    goto/16 :goto_1a

    .line 266
    .line 267
    :cond_1c
    :goto_15
    invoke-static {p0, p1}, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt;->renderMessageContent(Lcom/discord/notifications/api/NotificationData;Landroid/content/Context;)Ljava/lang/CharSequence;

    .line 268
    .line 269
    .line 270
    move-result-object v4

    .line 271
    goto/16 :goto_1a

    .line 272
    .line 273
    :sswitch_2
    const-string v1, "ACTIVITY_START"

    .line 274
    .line 275
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    move-result v0

    .line 279
    if-nez v0, :cond_1d

    .line 280
    .line 281
    goto/16 :goto_1a

    .line 282
    .line 283
    :cond_1d
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getActivityType()Ljava/lang/Integer;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    if-nez v0, :cond_1e

    .line 288
    .line 289
    goto/16 :goto_1a

    .line 290
    .line 291
    :cond_1e
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 292
    .line 293
    .line 294
    move-result v0

    .line 295
    if-nez v0, :cond_2f

    .line 296
    .line 297
    sget-object v0, Lcom/discord/react_strings/I18nMessage;->NOTIFICATION_BODY_START_GAME:Lcom/discord/react_strings/I18nMessage;

    .line 298
    .line 299
    new-instance v1, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt$getContent$3;

    .line 300
    .line 301
    invoke-direct {v1, p0}, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt$getContent$3;-><init>(Lcom/discord/notifications/api/NotificationData;)V

    .line 302
    .line 303
    .line 304
    invoke-static {p1, v0, v1}, Lcom/discord/react_strings/I18nUtilsKt;->i18nFormat(Landroid/content/Context;Lcom/discord/react_strings/I18nMessage;Lkotlin/jvm/functions/Function1;)Ljava/lang/CharSequence;

    .line 305
    .line 306
    .line 307
    move-result-object v4

    .line 308
    goto/16 :goto_1a

    .line 309
    .line 310
    :sswitch_3
    const-string v1, "FORUM_THREAD_CREATED"

    .line 311
    .line 312
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 313
    .line 314
    .line 315
    move-result v0

    .line 316
    if-nez v0, :cond_1f

    .line 317
    .line 318
    goto/16 :goto_1a

    .line 319
    .line 320
    :cond_1f
    sget-object v0, Lcom/discord/react_strings/I18nMessage;->FORUM_CHANNEL_THREAD_CREATED_PUSH_BODY_MOBILE:Lcom/discord/react_strings/I18nMessage;

    .line 321
    .line 322
    new-instance v1, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt$getContent$7;

    .line 323
    .line 324
    invoke-direct {v1, p0}, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt$getContent$7;-><init>(Lcom/discord/notifications/api/NotificationData;)V

    .line 325
    .line 326
    .line 327
    invoke-static {p1, v0, v1}, Lcom/discord/react_strings/I18nUtilsKt;->i18nFormat(Landroid/content/Context;Lcom/discord/react_strings/I18nMessage;Lkotlin/jvm/functions/Function1;)Ljava/lang/CharSequence;

    .line 328
    .line 329
    .line 330
    move-result-object v4

    .line 331
    goto/16 :goto_1a

    .line 332
    .line 333
    :sswitch_4
    const-string v1, "APPLICATION_LIBRARY_INSTALL_COMPLETE"

    .line 334
    .line 335
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 336
    .line 337
    .line 338
    move-result v0

    .line 339
    if-nez v0, :cond_20

    .line 340
    .line 341
    goto/16 :goto_1a

    .line 342
    .line 343
    :cond_20
    sget-object v0, Lcom/discord/react_strings/I18nMessage;->GAME_LIBRARY_NOTIFICATION_GAME_INSTALLED_BODY:Lcom/discord/react_strings/I18nMessage;

    .line 344
    .line 345
    new-instance v1, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt$getContent$5;

    .line 346
    .line 347
    invoke-direct {v1, p0}, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt$getContent$5;-><init>(Lcom/discord/notifications/api/NotificationData;)V

    .line 348
    .line 349
    .line 350
    invoke-static {p1, v0, v1}, Lcom/discord/react_strings/I18nUtilsKt;->i18nFormat(Landroid/content/Context;Lcom/discord/react_strings/I18nMessage;Lkotlin/jvm/functions/Function1;)Ljava/lang/CharSequence;

    .line 351
    .line 352
    .line 353
    move-result-object v4

    .line 354
    goto/16 :goto_1a

    .line 355
    .line 356
    :sswitch_5
    const-string v1, "STAGE_INSTANCE_CREATE"

    .line 357
    .line 358
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 359
    .line 360
    .line 361
    move-result v0

    .line 362
    if-nez v0, :cond_21

    .line 363
    .line 364
    goto/16 :goto_1a

    .line 365
    .line 366
    :cond_21
    sget-object v0, Lcom/discord/react_strings/I18nMessage;->STAGE_START_PUSH_NOTIFICATION_BODY:Lcom/discord/react_strings/I18nMessage;

    .line 367
    .line 368
    new-instance v1, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt$getContent$6;

    .line 369
    .line 370
    invoke-direct {v1, p0}, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt$getContent$6;-><init>(Lcom/discord/notifications/api/NotificationData;)V

    .line 371
    .line 372
    .line 373
    invoke-static {p1, v0, v1}, Lcom/discord/react_strings/I18nUtilsKt;->i18nFormat(Landroid/content/Context;Lcom/discord/react_strings/I18nMessage;Lkotlin/jvm/functions/Function1;)Ljava/lang/CharSequence;

    .line 374
    .line 375
    .line 376
    move-result-object v4

    .line 377
    goto/16 :goto_1a

    .line 378
    .line 379
    :sswitch_6
    const-string v1, "RELATIONSHIP_ADD"

    .line 380
    .line 381
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 382
    .line 383
    .line 384
    move-result v0

    .line 385
    if-nez v0, :cond_22

    .line 386
    .line 387
    goto/16 :goto_1a

    .line 388
    .line 389
    :cond_22
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getRelationshipType()Ljava/lang/Integer;

    .line 390
    .line 391
    .line 392
    move-result-object p0

    .line 393
    const/4 v0, 0x0

    .line 394
    if-nez p0, :cond_23

    .line 395
    .line 396
    goto :goto_16

    .line 397
    :cond_23
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 398
    .line 399
    .line 400
    move-result v1

    .line 401
    if-ne v1, v6, :cond_24

    .line 402
    .line 403
    sget-object p0, Lcom/discord/react_strings/I18nMessage;->NOTIFICATION_ACCEPTED_FRIEND_REQUEST:Lcom/discord/react_strings/I18nMessage;

    .line 404
    .line 405
    invoke-static {p1, p0, v0, v3, v0}, Lcom/discord/react_strings/I18nUtilsKt;->i18nFormat$default(Landroid/content/Context;Lcom/discord/react_strings/I18nMessage;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/CharSequence;

    .line 406
    .line 407
    .line 408
    move-result-object v4

    .line 409
    goto/16 :goto_1a

    .line 410
    .line 411
    :cond_24
    :goto_16
    if-nez p0, :cond_25

    .line 412
    .line 413
    goto/16 :goto_1a

    .line 414
    .line 415
    :cond_25
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 416
    .line 417
    .line 418
    move-result p0

    .line 419
    if-ne p0, v2, :cond_2f

    .line 420
    .line 421
    sget-object p0, Lcom/discord/react_strings/I18nMessage;->NOTIFICATION_PENDING_FRIEND_REQUEST:Lcom/discord/react_strings/I18nMessage;

    .line 422
    .line 423
    invoke-static {p1, p0, v0, v3, v0}, Lcom/discord/react_strings/I18nUtilsKt;->i18nFormat$default(Landroid/content/Context;Lcom/discord/react_strings/I18nMessage;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/CharSequence;

    .line 424
    .line 425
    .line 426
    move-result-object v4

    .line 427
    goto :goto_1a

    .line 428
    :sswitch_7
    const-string v1, "GUILD_SCHEDULED_EVENT_UPDATE"

    .line 429
    .line 430
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 431
    .line 432
    .line 433
    move-result v0

    .line 434
    if-nez v0, :cond_26

    .line 435
    .line 436
    goto :goto_1a

    .line 437
    :cond_26
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getGuildScheduledEventEntityType()Ljava/lang/Integer;

    .line 438
    .line 439
    .line 440
    move-result-object v0

    .line 441
    if-nez v0, :cond_27

    .line 442
    .line 443
    goto :goto_18

    .line 444
    :cond_27
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 445
    .line 446
    .line 447
    move-result v1

    .line 448
    if-ne v1, v3, :cond_28

    .line 449
    .line 450
    :goto_17
    move v5, v6

    .line 451
    goto :goto_19

    .line 452
    :cond_28
    :goto_18
    if-nez v0, :cond_29

    .line 453
    .line 454
    goto :goto_19

    .line 455
    :cond_29
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 456
    .line 457
    .line 458
    move-result v1

    .line 459
    if-ne v1, v6, :cond_2a

    .line 460
    .line 461
    goto :goto_17

    .line 462
    :cond_2a
    :goto_19
    if-eqz v5, :cond_2b

    .line 463
    .line 464
    sget-object v0, Lcom/discord/react_strings/I18nMessage;->GUILD_SCHEDULED_EVENT_STAGE_START_BODY:Lcom/discord/react_strings/I18nMessage;

    .line 465
    .line 466
    new-instance v1, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt$getContent$8;

    .line 467
    .line 468
    invoke-direct {v1, p0}, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt$getContent$8;-><init>(Lcom/discord/notifications/api/NotificationData;)V

    .line 469
    .line 470
    .line 471
    invoke-static {p1, v0, v1}, Lcom/discord/react_strings/I18nUtilsKt;->i18nFormat(Landroid/content/Context;Lcom/discord/react_strings/I18nMessage;Lkotlin/jvm/functions/Function1;)Ljava/lang/CharSequence;

    .line 472
    .line 473
    .line 474
    move-result-object v4

    .line 475
    goto :goto_1a

    .line 476
    :cond_2b
    if-nez v0, :cond_2c

    .line 477
    .line 478
    goto :goto_1a

    .line 479
    :cond_2c
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 480
    .line 481
    .line 482
    move-result v0

    .line 483
    if-ne v0, v2, :cond_2f

    .line 484
    .line 485
    sget-object v0, Lcom/discord/react_strings/I18nMessage;->GUILD_SCHEDULED_EVENT_EXTERNAL_START_BODY:Lcom/discord/react_strings/I18nMessage;

    .line 486
    .line 487
    new-instance v1, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt$getContent$9;

    .line 488
    .line 489
    invoke-direct {v1, p0}, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt$getContent$9;-><init>(Lcom/discord/notifications/api/NotificationData;)V

    .line 490
    .line 491
    .line 492
    invoke-static {p1, v0, v1}, Lcom/discord/react_strings/I18nUtilsKt;->i18nFormat(Landroid/content/Context;Lcom/discord/react_strings/I18nMessage;Lkotlin/jvm/functions/Function1;)Ljava/lang/CharSequence;

    .line 493
    .line 494
    .line 495
    move-result-object v4

    .line 496
    goto :goto_1a

    .line 497
    :sswitch_8
    const-string p1, "GENERIC_PUSH_NOTIFICATION_SENT"

    .line 498
    .line 499
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 500
    .line 501
    .line 502
    move-result p1

    .line 503
    if-nez p1, :cond_2d

    .line 504
    .line 505
    goto :goto_1a

    .line 506
    :cond_2d
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getSubtitle()Ljava/lang/String;

    .line 507
    .line 508
    .line 509
    move-result-object p0

    .line 510
    if-nez p0, :cond_2e

    .line 511
    .line 512
    goto :goto_1a

    .line 513
    :cond_2e
    move-object v4, p0

    .line 514
    :cond_2f
    :goto_1a
    return-object v4

    :sswitch_data_0
    .sparse-switch
        -0x598b8bf1 -> :sswitch_8
        -0x58c48974 -> :sswitch_7
        -0x4f1a5206 -> :sswitch_6
        -0x4b4caf7b -> :sswitch_5
        -0x49c69930 -> :sswitch_4
        -0x1a15df6f -> :sswitch_3
        0x3a0e4b12 -> :sswitch_2
        0x3b7f2454 -> :sswitch_1
        0x69807371 -> :sswitch_0
    .end sparse-switch
.end method

.method public static final getContentPendingIntent(Lcom/discord/notifications/api/NotificationData;Landroid/content/Context;Ljava/util/Map;)Landroid/app/PendingIntent;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/discord/notifications/api/NotificationData;",
            "Landroid/content/Context;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Landroid/app/PendingIntent;"
        }
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "context"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "notificationDataMap"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-static {p0}, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt;->getTag(Lcom/discord/notifications/api/NotificationData;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    new-instance v0, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string p0, "content"

    .line 29
    .line 30
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-static {p1, p2, p0}, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt;->getPendingIntent(Landroid/content/Context;Ljava/util/Map;Ljava/lang/String;)Landroid/app/PendingIntent;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0
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
.end method

.method public static final getConversationTitle(Lcom/discord/notifications/api/NotificationData;)Ljava/lang/CharSequence;
    .locals 6

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getType()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-string v1, "MESSAGE_CREATE"

    .line 11
    .line 12
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v1, 0x0

    .line 17
    if-eqz v0, :cond_13

    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getChannelType()Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const/4 v2, 0x0

    .line 24
    const/4 v3, 0x1

    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-nez v4, :cond_1

    .line 33
    .line 34
    :goto_0
    move v4, v3

    .line 35
    goto :goto_3

    .line 36
    :cond_1
    :goto_1
    if-nez v0, :cond_2

    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    const/4 v5, 0x2

    .line 44
    if-ne v4, v5, :cond_3

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_3
    :goto_2
    move v4, v2

    .line 48
    :goto_3
    if-eqz v4, :cond_4

    .line 49
    .line 50
    :goto_4
    move v4, v3

    .line 51
    goto :goto_6

    .line 52
    :cond_4
    if-nez v0, :cond_5

    .line 53
    .line 54
    goto :goto_5

    .line 55
    :cond_5
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    const/4 v5, 0x5

    .line 60
    if-ne v4, v5, :cond_6

    .line 61
    .line 62
    goto :goto_4

    .line 63
    :cond_6
    :goto_5
    move v4, v2

    .line 64
    :goto_6
    if-eqz v4, :cond_7

    .line 65
    .line 66
    :goto_7
    move v4, v3

    .line 67
    goto :goto_9

    .line 68
    :cond_7
    if-nez v0, :cond_8

    .line 69
    .line 70
    goto :goto_8

    .line 71
    :cond_8
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    const/16 v5, 0xa

    .line 76
    .line 77
    if-ne v4, v5, :cond_9

    .line 78
    .line 79
    goto :goto_7

    .line 80
    :cond_9
    :goto_8
    move v4, v2

    .line 81
    :goto_9
    if-eqz v4, :cond_a

    .line 82
    .line 83
    :goto_a
    move v4, v3

    .line 84
    goto :goto_c

    .line 85
    :cond_a
    if-nez v0, :cond_b

    .line 86
    .line 87
    goto :goto_b

    .line 88
    :cond_b
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 89
    .line 90
    .line 91
    move-result v4

    .line 92
    const/16 v5, 0xb

    .line 93
    .line 94
    if-ne v4, v5, :cond_c

    .line 95
    .line 96
    goto :goto_a

    .line 97
    :cond_c
    :goto_b
    move v4, v2

    .line 98
    :goto_c
    if-eqz v4, :cond_d

    .line 99
    .line 100
    :goto_d
    move v2, v3

    .line 101
    goto :goto_e

    .line 102
    :cond_d
    if-nez v0, :cond_e

    .line 103
    .line 104
    goto :goto_e

    .line 105
    :cond_e
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 106
    .line 107
    .line 108
    move-result v4

    .line 109
    const/16 v5, 0xc

    .line 110
    .line 111
    if-ne v4, v5, :cond_f

    .line 112
    .line 113
    goto :goto_d

    .line 114
    :cond_f
    :goto_e
    if-eqz v2, :cond_10

    .line 115
    .line 116
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getGuildName()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getChannelName()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    new-instance v1, Ljava/lang/StringBuilder;

    .line 125
    .line 126
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    const-string v0, " #"

    .line 133
    .line 134
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    :goto_f
    move-object v1, p0

    .line 145
    goto :goto_10

    .line 146
    :cond_10
    if-nez v0, :cond_11

    .line 147
    .line 148
    goto :goto_10

    .line 149
    :cond_11
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    const/4 v2, 0x3

    .line 154
    if-ne v0, v2, :cond_13

    .line 155
    .line 156
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getChannelName()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    if-nez v0, :cond_12

    .line 161
    .line 162
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getUserUsername()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    goto :goto_f

    .line 167
    :cond_12
    move-object v1, v0

    .line 168
    :cond_13
    :goto_10
    return-object v1
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
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
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
.end method

.method public static final getDeletePendingIntent(Lcom/discord/notifications/api/NotificationData;Landroid/content/Context;)Landroid/app/PendingIntent;
    .locals 7

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "context"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v1, Lcom/discord/notifications/actions/intents/DeleteAction;

    .line 12
    .line 13
    invoke-static {p0}, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt;->getTag(Lcom/discord/notifications/api/NotificationData;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-direct {v1, p0}, Lcom/discord/notifications/actions/intents/DeleteAction;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    const/4 v4, 0x0

    .line 22
    const/4 v5, 0x6

    .line 23
    const/4 v6, 0x0

    .line 24
    move-object v2, p1

    .line 25
    invoke-static/range {v1 .. v6}, Lcom/discord/notifications/actions/intents/NotificationAction$DefaultImpls;->toPendingIntent$default(Lcom/discord/notifications/actions/intents/NotificationAction;Landroid/content/Context;IZILjava/lang/Object;)Landroid/app/PendingIntent;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0
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
.end method

.method public static final getDirectReplyAction(Lcom/discord/notifications/api/NotificationData;Landroid/content/Context;)Landroidx/core/app/NotificationCompat$Action;
    .locals 16

    .line 1
    move-object/from16 v6, p1

    .line 2
    .line 3
    const-string v0, "<this>"

    .line 4
    .line 5
    move-object/from16 v1, p0

    .line 6
    .line 7
    invoke-static {v1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string v0, "context"

    .line 11
    .line 12
    invoke-static {v6, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual/range {p0 .. p0}, Lcom/discord/notifications/api/NotificationData;->getType()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-string v2, "MESSAGE_CREATE"

    .line 20
    .line 21
    invoke-static {v0, v2}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const/4 v7, 0x0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    invoke-virtual/range {p0 .. p0}, Lcom/discord/notifications/api/NotificationData;->getCanReply()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-virtual/range {p0 .. p0}, Lcom/discord/notifications/api/NotificationData;->getChannelId-qMVnFVQ()Lcom/discord/primitives/ChannelId;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    if-eqz v0, :cond_1

    .line 40
    .line 41
    invoke-virtual {v0}, Lcom/discord/primitives/ChannelId;->unbox-impl()J

    .line 42
    .line 43
    .line 44
    move-result-wide v10

    .line 45
    sget-object v0, Lcom/discord/react_strings/I18nMessage;->SEND_MESSAGE:Lcom/discord/react_strings/I18nMessage;

    .line 46
    .line 47
    const/4 v5, 0x2

    .line 48
    invoke-static {v6, v0, v7, v5, v7}, Lcom/discord/react_strings/I18nUtilsKt;->i18nFormat$default(Landroid/content/Context;Lcom/discord/react_strings/I18nMessage;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/CharSequence;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    sget-object v2, Lcom/discord/notifications/actions/intents/DirectReplyAction;->Companion:Lcom/discord/notifications/actions/intents/DirectReplyAction$Companion;

    .line 57
    .line 58
    invoke-virtual {v2, v0}, Lcom/discord/notifications/actions/intents/DirectReplyAction$Companion;->toRemoteInput(Ljava/lang/String;)Landroidx/core/app/RemoteInput;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    new-instance v0, Lcom/discord/notifications/actions/intents/DirectReplyAction;

    .line 63
    .line 64
    invoke-static/range {p0 .. p0}, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt;->getTag(Lcom/discord/notifications/api/NotificationData;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v9

    .line 68
    invoke-virtual/range {p0 .. p0}, Lcom/discord/notifications/api/NotificationData;->getChannelName()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v12

    .line 72
    invoke-virtual/range {p0 .. p0}, Lcom/discord/notifications/api/NotificationData;->getChannelType()Ljava/lang/Integer;

    .line 73
    .line 74
    .line 75
    move-result-object v13

    .line 76
    invoke-virtual/range {p0 .. p0}, Lcom/discord/notifications/api/NotificationData;->getGuildName()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v14

    .line 80
    const/4 v15, 0x0

    .line 81
    move-object v8, v0

    .line 82
    invoke-direct/range {v8 .. v15}, Lcom/discord/notifications/actions/intents/DirectReplyAction;-><init>(Ljava/lang/String;JLjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 83
    .line 84
    .line 85
    sget-object v1, Lcom/discord/misc/utilities/intent/PendingIntentUtils;->INSTANCE:Lcom/discord/misc/utilities/intent/PendingIntentUtils;

    .line 86
    .line 87
    const/4 v8, 0x0

    .line 88
    const/4 v9, 0x1

    .line 89
    invoke-static {v1, v8, v9, v7}, Lcom/discord/misc/utilities/intent/PendingIntentUtils;->mutablePendingIntentFlag$default(Lcom/discord/misc/utilities/intent/PendingIntentUtils;IILjava/lang/Object;)I

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    const/4 v3, 0x0

    .line 94
    const/4 v10, 0x4

    .line 95
    const/4 v11, 0x0

    .line 96
    move-object/from16 v1, p1

    .line 97
    .line 98
    move-object v12, v4

    .line 99
    move v4, v10

    .line 100
    move v10, v5

    .line 101
    move-object v5, v11

    .line 102
    invoke-static/range {v0 .. v5}, Lcom/discord/notifications/actions/intents/NotificationAction$DefaultImpls;->toPendingIntent$default(Lcom/discord/notifications/actions/intents/NotificationAction;Landroid/content/Context;IZILjava/lang/Object;)Landroid/app/PendingIntent;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    new-instance v1, Landroidx/core/app/NotificationCompat$Action$a;

    .line 107
    .line 108
    sget v2, Lcom/discord/notifications/renderer/R$drawable;->ic_send_white_24dp:I

    .line 109
    .line 110
    sget-object v3, Lcom/discord/react_strings/I18nMessage;->NOTIFICATION_REPLY:Lcom/discord/react_strings/I18nMessage;

    .line 111
    .line 112
    invoke-static {v6, v3, v7, v10, v7}, Lcom/discord/react_strings/I18nUtilsKt;->i18nFormat$default(Landroid/content/Context;Lcom/discord/react_strings/I18nMessage;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/CharSequence;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    invoke-direct {v1, v2, v3, v0}, Landroidx/core/app/NotificationCompat$Action$a;-><init>(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v1, v12}, Landroidx/core/app/NotificationCompat$Action$a;->a(Landroidx/core/app/RemoteInput;)Landroidx/core/app/NotificationCompat$Action$a;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    invoke-virtual {v0, v9}, Landroidx/core/app/NotificationCompat$Action$a;->e(Z)Landroidx/core/app/NotificationCompat$Action$a;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    invoke-virtual {v0, v9}, Landroidx/core/app/NotificationCompat$Action$a;->h(I)Landroidx/core/app/NotificationCompat$Action$a;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-virtual {v0, v8}, Landroidx/core/app/NotificationCompat$Action$a;->i(Z)Landroidx/core/app/NotificationCompat$Action$a;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    invoke-virtual {v0}, Landroidx/core/app/NotificationCompat$Action$a;->b()Landroidx/core/app/NotificationCompat$Action;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    return-object v0

    .line 140
    :cond_1
    :goto_0
    return-object v7
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
.end method

.method public static final getGroupKey(Lcom/discord/notifications/api/NotificationData;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getType()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    .line 15
    const-string v1, "GROUP_"

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
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
.end method

.method public static final getIconUrl(Lcom/discord/notifications/api/NotificationData;Landroid/content/Context;)Ljava/lang/String;
    .locals 12

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "context"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getType()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const-string v2, ""

    .line 20
    .line 21
    sparse-switch v1, :sswitch_data_0

    .line 22
    .line 23
    .line 24
    goto/16 :goto_13

    .line 25
    .line 26
    :sswitch_0
    const-string v1, "CALL_RING"

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_0

    .line 33
    .line 34
    goto/16 :goto_13

    .line 35
    .line 36
    :sswitch_1
    const-string v1, "MESSAGE_CREATE"

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-nez v0, :cond_0

    .line 43
    .line 44
    goto/16 :goto_13

    .line 45
    .line 46
    :cond_0
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getChannelType()Ljava/lang/Integer;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    const/4 v1, 0x1

    .line 51
    if-nez v0, :cond_1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-ne v2, v1, :cond_2

    .line 59
    .line 60
    sget-object v3, Lcom/discord/icons/IconUrlUtils;->INSTANCE:Lcom/discord/icons/IconUrlUtils;

    .line 61
    .line 62
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getUserId-wUX8bhU()Lcom/discord/primitives/UserId;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getUserAvatar()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v6

    .line 70
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getUserDiscriminator()Ljava/lang/Integer;

    .line 71
    .line 72
    .line 73
    move-result-object v7

    .line 74
    const/4 v8, 0x0

    .line 75
    const/4 v9, 0x0

    .line 76
    const/16 v10, 0x20

    .line 77
    .line 78
    const/4 v11, 0x0

    .line 79
    move-object v4, p1

    .line 80
    invoke-static/range {v3 .. v11}, Lcom/discord/icons/IconUrlUtils;->getForUser-_fRzTXg$default(Lcom/discord/icons/IconUrlUtils;Landroid/content/Context;Lcom/discord/primitives/UserId;Ljava/lang/String;Ljava/lang/Integer;ZLjava/lang/Integer;ILjava/lang/Object;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    goto/16 :goto_13

    .line 85
    .line 86
    :cond_2
    :goto_0
    const/4 v2, 0x0

    .line 87
    if-nez v0, :cond_3

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_3
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    if-nez v3, :cond_4

    .line 95
    .line 96
    :goto_1
    move v3, v1

    .line 97
    goto :goto_4

    .line 98
    :cond_4
    :goto_2
    if-nez v0, :cond_5

    .line 99
    .line 100
    goto :goto_3

    .line 101
    :cond_5
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 102
    .line 103
    .line 104
    move-result v3

    .line 105
    const/4 v4, 0x2

    .line 106
    if-ne v3, v4, :cond_6

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_6
    :goto_3
    move v3, v2

    .line 110
    :goto_4
    if-eqz v3, :cond_7

    .line 111
    .line 112
    :goto_5
    move v3, v1

    .line 113
    goto :goto_7

    .line 114
    :cond_7
    if-nez v0, :cond_8

    .line 115
    .line 116
    goto :goto_6

    .line 117
    :cond_8
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    const/4 v4, 0x5

    .line 122
    if-ne v3, v4, :cond_9

    .line 123
    .line 124
    goto :goto_5

    .line 125
    :cond_9
    :goto_6
    move v3, v2

    .line 126
    :goto_7
    if-eqz v3, :cond_a

    .line 127
    .line 128
    :goto_8
    move v3, v1

    .line 129
    goto :goto_a

    .line 130
    :cond_a
    if-nez v0, :cond_b

    .line 131
    .line 132
    goto :goto_9

    .line 133
    :cond_b
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 134
    .line 135
    .line 136
    move-result v3

    .line 137
    const/16 v4, 0xa

    .line 138
    .line 139
    if-ne v3, v4, :cond_c

    .line 140
    .line 141
    goto :goto_8

    .line 142
    :cond_c
    :goto_9
    move v3, v2

    .line 143
    :goto_a
    if-eqz v3, :cond_d

    .line 144
    .line 145
    :goto_b
    move v3, v1

    .line 146
    goto :goto_d

    .line 147
    :cond_d
    if-nez v0, :cond_e

    .line 148
    .line 149
    goto :goto_c

    .line 150
    :cond_e
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 151
    .line 152
    .line 153
    move-result v3

    .line 154
    const/16 v4, 0xb

    .line 155
    .line 156
    if-ne v3, v4, :cond_f

    .line 157
    .line 158
    goto :goto_b

    .line 159
    :cond_f
    :goto_c
    move v3, v2

    .line 160
    :goto_d
    if-eqz v3, :cond_10

    .line 161
    .line 162
    :goto_e
    move v0, v1

    .line 163
    goto :goto_10

    .line 164
    :cond_10
    if-nez v0, :cond_11

    .line 165
    .line 166
    goto :goto_f

    .line 167
    :cond_11
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 168
    .line 169
    .line 170
    move-result v0

    .line 171
    const/16 v3, 0xc

    .line 172
    .line 173
    if-ne v0, v3, :cond_12

    .line 174
    .line 175
    goto :goto_e

    .line 176
    :cond_12
    :goto_f
    move v0, v2

    .line 177
    :goto_10
    if-eqz v0, :cond_13

    .line 178
    .line 179
    sget-object v3, Lcom/discord/icons/IconUrlUtils;->INSTANCE:Lcom/discord/icons/IconUrlUtils;

    .line 180
    .line 181
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getGuildId-qOKuAAo()Lcom/discord/primitives/GuildId;

    .line 182
    .line 183
    .line 184
    move-result-object v4

    .line 185
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getGuildIcon()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v5

    .line 189
    const-string v6, ""

    .line 190
    .line 191
    const/4 v7, 0x0

    .line 192
    const/4 v8, 0x0

    .line 193
    const/16 v9, 0x18

    .line 194
    .line 195
    const/4 v10, 0x0

    .line 196
    invoke-static/range {v3 .. v10}, Lcom/discord/icons/IconUrlUtils;->getForGuild-14CJxO4$default(Lcom/discord/icons/IconUrlUtils;Lcom/discord/primitives/GuildId;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;ILjava/lang/Object;)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    goto/16 :goto_13

    .line 201
    .line 202
    :cond_13
    sget-object v3, Lcom/discord/icons/IconUrlUtils;->INSTANCE:Lcom/discord/icons/IconUrlUtils;

    .line 203
    .line 204
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getChannelId-qMVnFVQ()Lcom/discord/primitives/ChannelId;

    .line 205
    .line 206
    .line 207
    move-result-object v5

    .line 208
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getChannelIcon()Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v6

    .line 212
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getChannelType()Ljava/lang/Integer;

    .line 213
    .line 214
    .line 215
    move-result-object p0

    .line 216
    if-nez p0, :cond_14

    .line 217
    .line 218
    goto :goto_11

    .line 219
    :cond_14
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 220
    .line 221
    .line 222
    move-result p0

    .line 223
    const/4 v0, 0x3

    .line 224
    if-ne p0, v0, :cond_15

    .line 225
    .line 226
    move v7, v1

    .line 227
    goto :goto_12

    .line 228
    :cond_15
    :goto_11
    move v7, v2

    .line 229
    :goto_12
    const/4 v8, 0x0

    .line 230
    const/16 v9, 0x10

    .line 231
    .line 232
    const/4 v10, 0x0

    .line 233
    move-object v4, p1

    .line 234
    invoke-static/range {v3 .. v10}, Lcom/discord/icons/IconUrlUtils;->getForChannel-JYSGpIY$default(Lcom/discord/icons/IconUrlUtils;Landroid/content/Context;Lcom/discord/primitives/ChannelId;Ljava/lang/String;ZLjava/lang/Integer;ILjava/lang/Object;)Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v2

    .line 238
    goto/16 :goto_13

    .line 239
    .line 240
    :sswitch_2
    const-string p1, "ACTIVITY_START"

    .line 241
    .line 242
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    move-result p1

    .line 246
    if-nez p1, :cond_16

    .line 247
    .line 248
    goto/16 :goto_13

    .line 249
    .line 250
    :sswitch_3
    const-string p1, "FORUM_THREAD_CREATED"

    .line 251
    .line 252
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 253
    .line 254
    .line 255
    move-result p1

    .line 256
    if-nez p1, :cond_17

    .line 257
    .line 258
    goto :goto_13

    .line 259
    :sswitch_4
    const-string p1, "APPLICATION_LIBRARY_INSTALL_COMPLETE"

    .line 260
    .line 261
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    move-result p1

    .line 265
    if-nez p1, :cond_16

    .line 266
    .line 267
    goto :goto_13

    .line 268
    :sswitch_5
    const-string p1, "STAGE_INSTANCE_CREATE"

    .line 269
    .line 270
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 271
    .line 272
    .line 273
    move-result p1

    .line 274
    if-nez p1, :cond_17

    .line 275
    .line 276
    goto :goto_13

    .line 277
    :sswitch_6
    const-string p1, "RELATIONSHIP_ADD"

    .line 278
    .line 279
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 280
    .line 281
    .line 282
    move-result p1

    .line 283
    if-nez p1, :cond_16

    .line 284
    .line 285
    goto :goto_13

    .line 286
    :cond_16
    sget-object v3, Lcom/discord/icons/IconUrlUtils;->INSTANCE:Lcom/discord/icons/IconUrlUtils;

    .line 287
    .line 288
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getApplicationId-UtIrSio()Lcom/discord/primitives/ApplicationId;

    .line 289
    .line 290
    .line 291
    move-result-object v4

    .line 292
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getApplicationIcon()Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v5

    .line 296
    const/4 v6, 0x0

    .line 297
    const/4 v7, 0x4

    .line 298
    const/4 v8, 0x0

    .line 299
    invoke-static/range {v3 .. v8}, Lcom/discord/icons/IconUrlUtils;->getApplicationIcon-weIltyw$default(Lcom/discord/icons/IconUrlUtils;Lcom/discord/primitives/ApplicationId;Ljava/lang/String;IILjava/lang/Object;)Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v2

    .line 303
    goto :goto_13

    .line 304
    :sswitch_7
    const-string p1, "GUILD_SCHEDULED_EVENT_UPDATE"

    .line 305
    .line 306
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 307
    .line 308
    .line 309
    move-result p1

    .line 310
    if-nez p1, :cond_17

    .line 311
    .line 312
    goto :goto_13

    .line 313
    :cond_17
    sget-object v3, Lcom/discord/icons/IconUrlUtils;->INSTANCE:Lcom/discord/icons/IconUrlUtils;

    .line 314
    .line 315
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getGuildId-qOKuAAo()Lcom/discord/primitives/GuildId;

    .line 316
    .line 317
    .line 318
    move-result-object v4

    .line 319
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getGuildIcon()Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object v5

    .line 323
    const-string v6, ""

    .line 324
    .line 325
    const/4 v7, 0x0

    .line 326
    const/4 v8, 0x0

    .line 327
    const/16 v9, 0x18

    .line 328
    .line 329
    const/4 v10, 0x0

    .line 330
    invoke-static/range {v3 .. v10}, Lcom/discord/icons/IconUrlUtils;->getForGuild-14CJxO4$default(Lcom/discord/icons/IconUrlUtils;Lcom/discord/primitives/GuildId;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;ILjava/lang/Object;)Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object v2

    .line 334
    goto :goto_13

    .line 335
    :sswitch_8
    const-string p1, "GENERIC_PUSH_NOTIFICATION_SENT"

    .line 336
    .line 337
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 338
    .line 339
    .line 340
    move-result p1

    .line 341
    if-nez p1, :cond_18

    .line 342
    .line 343
    goto :goto_13

    .line 344
    :cond_18
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getIconUrl()Ljava/lang/String;

    .line 345
    .line 346
    .line 347
    move-result-object p0

    .line 348
    if-nez p0, :cond_19

    .line 349
    .line 350
    goto :goto_13

    .line 351
    :cond_19
    move-object v2, p0

    .line 352
    :goto_13
    return-object v2

    .line 353
    :sswitch_data_0
    .sparse-switch
        -0x598b8bf1 -> :sswitch_8
        -0x58c48974 -> :sswitch_7
        -0x4f1a5206 -> :sswitch_6
        -0x4b4caf7b -> :sswitch_5
        -0x49c69930 -> :sswitch_4
        -0x1a15df6f -> :sswitch_3
        0x3a0e4b12 -> :sswitch_2
        0x3b7f2454 -> :sswitch_1
        0x69807371 -> :sswitch_0
    .end sparse-switch
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
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
.end method

.method public static final getIconUrlForAvatar(Lcom/discord/notifications/api/NotificationData;Landroid/content/Context;)Ljava/lang/String;
    .locals 10

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "context"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Lcom/discord/icons/IconUrlUtils;->INSTANCE:Lcom/discord/icons/IconUrlUtils;

    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getUserGuildAvatar()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getGuildId-qOKuAAo()Lcom/discord/primitives/GuildId;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getUserId-wUX8bhU()Lcom/discord/primitives/UserId;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    const/4 v5, 0x0

    .line 26
    const/4 v6, 0x0

    .line 27
    const/16 v7, 0x18

    .line 28
    .line 29
    const/4 v8, 0x0

    .line 30
    move-object v1, v0

    .line 31
    invoke-static/range {v1 .. v8}, Lcom/discord/icons/IconUrlUtils;->getForGuildMember-2tNb6hE$default(Lcom/discord/icons/IconUrlUtils;Ljava/lang/String;Lcom/discord/primitives/GuildId;Lcom/discord/primitives/UserId;Ljava/lang/Integer;ZILjava/lang/Object;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-nez v2, :cond_0

    .line 40
    .line 41
    const/4 v2, 0x1

    .line 42
    goto :goto_0

    .line 43
    :cond_0
    const/4 v2, 0x0

    .line 44
    :goto_0
    if-eqz v2, :cond_1

    .line 45
    .line 46
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getUserId-wUX8bhU()Lcom/discord/primitives/UserId;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getUserAvatar()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getUserDiscriminator()Ljava/lang/Integer;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    const/4 v6, 0x0

    .line 59
    const/4 v7, 0x0

    .line 60
    const/16 v8, 0x20

    .line 61
    .line 62
    const/4 v9, 0x0

    .line 63
    move-object v1, v0

    .line 64
    move-object v2, p1

    .line 65
    invoke-static/range {v1 .. v9}, Lcom/discord/icons/IconUrlUtils;->getForUser-_fRzTXg$default(Lcom/discord/icons/IconUrlUtils;Landroid/content/Context;Lcom/discord/primitives/UserId;Ljava/lang/String;Ljava/lang/Integer;ZLjava/lang/Integer;ILjava/lang/Object;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    :cond_1
    return-object v1
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
.end method

.method public static final getMarkAsReadAction(Lcom/discord/notifications/api/NotificationData;Landroid/content/Context;)Landroidx/core/app/NotificationCompat$Action;
    .locals 13

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "context"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getType()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, "MESSAGE_CREATE"

    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const/4 v1, 0x0

    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    return-object v1

    .line 25
    :cond_0
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getChannelId-qMVnFVQ()Lcom/discord/primitives/ChannelId;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    invoke-virtual {v0}, Lcom/discord/primitives/ChannelId;->unbox-impl()J

    .line 32
    .line 33
    .line 34
    move-result-wide v4

    .line 35
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getMessageId-N_6c4I0()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    if-nez v6, :cond_1

    .line 40
    .line 41
    return-object v1

    .line 42
    :cond_1
    new-instance v0, Lcom/discord/notifications/actions/intents/MarkAsReadAction;

    .line 43
    .line 44
    invoke-static {p0}, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt;->getTag(Lcom/discord/notifications/api/NotificationData;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    const/4 v7, 0x0

    .line 49
    move-object v2, v0

    .line 50
    invoke-direct/range {v2 .. v7}, Lcom/discord/notifications/actions/intents/MarkAsReadAction;-><init>(Ljava/lang/String;JLjava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 51
    .line 52
    .line 53
    const/4 v9, 0x0

    .line 54
    const/4 v10, 0x0

    .line 55
    const/4 v11, 0x6

    .line 56
    const/4 v12, 0x0

    .line 57
    move-object v7, v0

    .line 58
    move-object v8, p1

    .line 59
    invoke-static/range {v7 .. v12}, Lcom/discord/notifications/actions/intents/NotificationAction$DefaultImpls;->toPendingIntent$default(Lcom/discord/notifications/actions/intents/NotificationAction;Landroid/content/Context;IZILjava/lang/Object;)Landroid/app/PendingIntent;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    new-instance v0, Landroidx/core/app/NotificationCompat$Action$a;

    .line 64
    .line 65
    sget v2, Lcom/discord/notifications/renderer/R$drawable;->ic_check_grey_24dp:I

    .line 66
    .line 67
    sget-object v3, Lcom/discord/react_strings/I18nMessage;->MARK_AS_READ:Lcom/discord/react_strings/I18nMessage;

    .line 68
    .line 69
    const/4 v4, 0x2

    .line 70
    invoke-static {p1, v3, v1, v4, v1}, Lcom/discord/react_strings/I18nUtilsKt;->i18nFormat$default(Landroid/content/Context;Lcom/discord/react_strings/I18nMessage;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/CharSequence;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-direct {v0, v2, p1, p0}, Landroidx/core/app/NotificationCompat$Action$a;-><init>(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, v4}, Landroidx/core/app/NotificationCompat$Action$a;->h(I)Landroidx/core/app/NotificationCompat$Action$a;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    const/4 p1, 0x0

    .line 82
    invoke-virtual {p0, p1}, Landroidx/core/app/NotificationCompat$Action$a;->i(Z)Landroidx/core/app/NotificationCompat$Action$a;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    invoke-virtual {p0}, Landroidx/core/app/NotificationCompat$Action$a;->b()Landroidx/core/app/NotificationCompat$Action;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    return-object p0

    .line 91
    :cond_2
    return-object v1
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
.end method

.method public static final getNotificationCategory(Lcom/discord/notifications/api/NotificationData;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getType()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    sparse-switch v0, :sswitch_data_0

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :sswitch_0
    const-string v0, "CALL_RING"

    .line 19
    .line 20
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    if-nez p0, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const-string p0, "call"

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :sswitch_1
    const-string v0, "ACTIVITY_START"

    .line 31
    .line 32
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    if-nez p0, :cond_2

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :sswitch_2
    const-string v0, "FORUM_THREAD_CREATED"

    .line 40
    .line 41
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    if-nez p0, :cond_2

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :sswitch_3
    const-string v0, "APPLICATION_LIBRARY_INSTALL_COMPLETE"

    .line 49
    .line 50
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    if-nez p0, :cond_1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    const-string p0, "progress"

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :sswitch_4
    const-string v0, "STAGE_INSTANCE_CREATE"

    .line 61
    .line 62
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    if-nez p0, :cond_2

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :sswitch_5
    const-string v0, "RELATIONSHIP_ADD"

    .line 70
    .line 71
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    if-nez p0, :cond_2

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :sswitch_6
    const-string v0, "GUILD_SCHEDULED_EVENT_UPDATE"

    .line 79
    .line 80
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result p0

    .line 84
    if-nez p0, :cond_2

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :sswitch_7
    const-string v0, "GENERIC_PUSH_NOTIFICATION_SENT"

    .line 88
    .line 89
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result p0

    .line 93
    if-nez p0, :cond_2

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_2
    const-string p0, "social"

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :goto_0
    const-string p0, "msg"

    .line 100
    .line 101
    :goto_1
    return-object p0

    .line 102
    nop

    .line 103
    :sswitch_data_0
    .sparse-switch
        -0x598b8bf1 -> :sswitch_7
        -0x58c48974 -> :sswitch_6
        -0x4f1a5206 -> :sswitch_5
        -0x4b4caf7b -> :sswitch_4
        -0x49c69930 -> :sswitch_3
        -0x1a15df6f -> :sswitch_2
        0x3a0e4b12 -> :sswitch_1
        0x69807371 -> :sswitch_0
    .end sparse-switch
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
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
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
.end method

.method private static final getPendingIntent(Landroid/content/Context;Ljava/util/Map;Ljava/lang/String;)Landroid/app/PendingIntent;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Landroid/app/PendingIntent;"
        }
    .end annotation

    new-instance v0, Lcom/discord/notifications/actions/intents/ContentAction;

    invoke-direct {v0, p2, p1}, Lcom/discord/notifications/actions/intents/ContentAction;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x2

    const/4 v5, 0x0

    move-object v1, p0

    invoke-static/range {v0 .. v5}, Lcom/discord/notifications/actions/intents/NotificationAction$DefaultImpls;->toPendingIntent$default(Lcom/discord/notifications/actions/intents/NotificationAction;Landroid/content/Context;IZILjava/lang/Object;)Landroid/app/PendingIntent;

    move-result-object p0

    return-object p0
.end method

.method public static final getSendTime(Lcom/discord/notifications/api/NotificationData;)J
    .locals 2

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    return-wide v0
    .line 11
    .line 12
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
.end method

.method public static final getSender(Lcom/discord/notifications/api/NotificationData;Landroid/graphics/Bitmap;)Landroidx/core/app/Person;
    .locals 2

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroidx/core/app/Person$c;

    .line 7
    .line 8
    invoke-direct {v0}, Landroidx/core/app/Person$c;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getUserUsername()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, Landroidx/core/app/Person$c;->f(Ljava/lang/CharSequence;)Landroidx/core/app/Person$c;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getUserId-wUX8bhU()Lcom/discord/primitives/UserId;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v0, v1}, Landroidx/core/app/Person$c;->e(Ljava/lang/String;)Landroidx/core/app/Person$c;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getRelationshipType()Ljava/lang/Integer;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    if-nez p0, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    const/4 v1, 0x1

    .line 43
    if-ne p0, v1, :cond_1

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    :goto_0
    const/4 v1, 0x0

    .line 47
    :goto_1
    invoke-virtual {v0, v1}, Landroidx/core/app/Person$c;->d(Z)Landroidx/core/app/Person$c;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    if-eqz p1, :cond_2

    .line 52
    .line 53
    invoke-static {p1}, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt;->toIconCompat(Landroid/graphics/Bitmap;)Landroidx/core/graphics/drawable/IconCompat;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    goto :goto_2

    .line 58
    :cond_2
    const/4 p1, 0x0

    .line 59
    :goto_2
    invoke-virtual {p0, p1}, Landroidx/core/app/Person$c;->c(Landroidx/core/graphics/drawable/IconCompat;)Landroidx/core/app/Person$c;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-virtual {p0}, Landroidx/core/app/Person$c;->a()Landroidx/core/app/Person;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    const-string p1, "Builder()\n        .setNa\u2026ompat())\n        .build()"

    .line 68
    .line 69
    invoke-static {p0, p1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    return-object p0
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
.end method

.method public static final getSenderForMessageNotification(Lcom/discord/notifications/api/NotificationData;Landroid/graphics/Bitmap;)Landroidx/core/app/Person;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->isFromCurrentUser()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const/4 p0, 0x0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-static {p0, p1}, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt;->getSender(Lcom/discord/notifications/api/NotificationData;Landroid/graphics/Bitmap;)Landroidx/core/app/Person;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    :goto_0
    return-object p0
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
.end method

.method public static final getShortcutInfo(Lcom/discord/notifications/api/NotificationData;Landroid/content/Context;Ljava/util/Map;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)Landroidx/core/content/pm/ShortcutInfoCompat;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/discord/notifications/api/NotificationData;",
            "Landroid/content/Context;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Landroid/graphics/Bitmap;",
            "Landroid/graphics/Bitmap;",
            ")",
            "Landroidx/core/content/pm/ShortcutInfoCompat;"
        }
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "context"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "notificationDataMap"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getChannelId-qMVnFVQ()Lcom/discord/primitives/ChannelId;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-static {p0, p1}, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt;->getTitle(Lcom/discord/notifications/api/NotificationData;Landroid/content/Context;)Ljava/lang/CharSequence;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-static {p0, p1}, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt;->getTitle(Lcom/discord/notifications/api/NotificationData;Landroid/content/Context;)Ljava/lang/CharSequence;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    sget-object v5, Lcom/discord/shortcuts/ShortcutData;->Companion:Lcom/discord/shortcuts/ShortcutData$Companion;

    .line 33
    .line 34
    const-string v7, "android.intent.action.VIEW"

    .line 35
    .line 36
    sget-object v0, Lcom/discord/notifications/actions/intents/NotificationAction;->Companion:Lcom/discord/notifications/actions/intents/NotificationAction$Companion;

    .line 37
    .line 38
    invoke-virtual {v0}, Lcom/discord/notifications/actions/intents/NotificationAction$Companion;->getActivityClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    move-result-object v8

    .line 42
    invoke-static {p0}, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt;->getTag(Lcom/discord/notifications/api/NotificationData;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v9

    .line 46
    move-object v6, p1

    .line 47
    move-object v10, p2

    .line 48
    invoke-virtual/range {v5 .. v10}, Lcom/discord/shortcuts/ShortcutData$Companion;->createShortcutIntent(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;Ljava/util/Map;)Landroid/content/Intent;

    .line 49
    .line 50
    .line 51
    move-result-object v7

    .line 52
    invoke-static {p0, p4}, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt;->getSender(Lcom/discord/notifications/api/NotificationData;Landroid/graphics/Bitmap;)Landroidx/core/app/Person;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-static {p0}, Lkotlin/collections/h;->d(Ljava/lang/Object;)Ljava/util/List;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    const/4 v8, 0x0

    .line 61
    const/16 v9, 0x40

    .line 62
    .line 63
    const/4 v10, 0x0

    .line 64
    move-object v1, p1

    .line 65
    move-object v5, p3

    .line 66
    invoke-static/range {v1 .. v10}, Lcom/discord/shortcuts/ShortcutUtilsKt;->createShortcut$default(Landroid/content/Context;Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/graphics/Bitmap;Ljava/util/List;Landroid/content/Intent;IILjava/lang/Object;)Landroidx/core/content/pm/ShortcutInfoCompat;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    return-object p0
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
.end method

.method public static final getSmallIcon(Lcom/discord/notifications/api/NotificationData;)I
    .locals 2

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getType()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const v1, -0x4f1a5206

    .line 15
    .line 16
    .line 17
    if-eq v0, v1, :cond_4

    .line 18
    .line 19
    const v1, 0x3b7f2454

    .line 20
    .line 21
    .line 22
    if-eq v0, v1, :cond_2

    .line 23
    .line 24
    const v1, 0x69807371

    .line 25
    .line 26
    .line 27
    if-eq v0, v1, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const-string v0, "CALL_RING"

    .line 31
    .line 32
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    if-nez p0, :cond_1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    sget p0, Lcom/discord/notifications/renderer/R$drawable;->ic_notification_call_24dp:I

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_2
    const-string v0, "MESSAGE_CREATE"

    .line 43
    .line 44
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    if-nez p0, :cond_3

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_3
    sget p0, Lcom/discord/notifications/renderer/R$drawable;->ic_notification_message_24dp:I

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_4
    const-string v0, "RELATIONSHIP_ADD"

    .line 55
    .line 56
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    if-nez p0, :cond_5

    .line 61
    .line 62
    :goto_0
    sget p0, Lcom/discord/notifications/renderer/R$drawable;->ic_notification_24dp:I

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_5
    sget p0, Lcom/discord/notifications/renderer/R$drawable;->ic_notification_friends_24dp:I

    .line 66
    .line 67
    :goto_1
    return p0
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
.end method

.method public static final getSound(Lcom/discord/notifications/api/NotificationData;Landroid/content/Context;)Landroid/net/Uri;
    .locals 2

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "context"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getType()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const-string v0, "CALL_RING"

    .line 16
    .line 17
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-eqz p0, :cond_0

    .line 22
    .line 23
    new-instance p0, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 26
    .line 27
    .line 28
    const-string v0, "android.resource://"

    .line 29
    .line 30
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    sget v0, Lcom/discord/notifications/renderer/R$raw;->call_ringing:I

    .line 38
    .line 39
    new-instance v1, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string p1, "/"

    .line 48
    .line 49
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    goto :goto_0

    .line 71
    :cond_0
    const/4 p0, 0x0

    .line 72
    :goto_0
    return-object p0
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
.end method

.method private static final getSystemMessageUserJoin-_NT-lnE(Landroid/content/Context;Lcom/discord/primitives/UserId;Ljava/lang/String;)Ljava/lang/CharSequence;
    .locals 5

    .line 1
    const/16 v0, 0xd

    .line 2
    .line 3
    new-array v0, v0, [Lcom/discord/react_strings/I18nMessage;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    sget-object v2, Lcom/discord/react_strings/I18nMessage;->SYSTEM_MESSAGE_GUILD_MEMBER_JOIN_001:Lcom/discord/react_strings/I18nMessage;

    .line 7
    .line 8
    aput-object v2, v0, v1

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    sget-object v2, Lcom/discord/react_strings/I18nMessage;->SYSTEM_MESSAGE_GUILD_MEMBER_JOIN_002:Lcom/discord/react_strings/I18nMessage;

    .line 12
    .line 13
    aput-object v2, v0, v1

    .line 14
    .line 15
    const/4 v1, 0x2

    .line 16
    sget-object v2, Lcom/discord/react_strings/I18nMessage;->SYSTEM_MESSAGE_GUILD_MEMBER_JOIN_003:Lcom/discord/react_strings/I18nMessage;

    .line 17
    .line 18
    aput-object v2, v0, v1

    .line 19
    .line 20
    const/4 v1, 0x3

    .line 21
    sget-object v2, Lcom/discord/react_strings/I18nMessage;->SYSTEM_MESSAGE_GUILD_MEMBER_JOIN_004:Lcom/discord/react_strings/I18nMessage;

    .line 22
    .line 23
    aput-object v2, v0, v1

    .line 24
    .line 25
    const/4 v1, 0x4

    .line 26
    sget-object v2, Lcom/discord/react_strings/I18nMessage;->SYSTEM_MESSAGE_GUILD_MEMBER_JOIN_005:Lcom/discord/react_strings/I18nMessage;

    .line 27
    .line 28
    aput-object v2, v0, v1

    .line 29
    .line 30
    const/4 v1, 0x5

    .line 31
    sget-object v2, Lcom/discord/react_strings/I18nMessage;->SYSTEM_MESSAGE_GUILD_MEMBER_JOIN_006:Lcom/discord/react_strings/I18nMessage;

    .line 32
    .line 33
    aput-object v2, v0, v1

    .line 34
    .line 35
    const/4 v1, 0x6

    .line 36
    sget-object v2, Lcom/discord/react_strings/I18nMessage;->SYSTEM_MESSAGE_GUILD_MEMBER_JOIN_007:Lcom/discord/react_strings/I18nMessage;

    .line 37
    .line 38
    aput-object v2, v0, v1

    .line 39
    .line 40
    const/4 v1, 0x7

    .line 41
    sget-object v2, Lcom/discord/react_strings/I18nMessage;->SYSTEM_MESSAGE_GUILD_MEMBER_JOIN_008:Lcom/discord/react_strings/I18nMessage;

    .line 42
    .line 43
    aput-object v2, v0, v1

    .line 44
    .line 45
    const/16 v1, 0x8

    .line 46
    .line 47
    sget-object v2, Lcom/discord/react_strings/I18nMessage;->SYSTEM_MESSAGE_GUILD_MEMBER_JOIN_009:Lcom/discord/react_strings/I18nMessage;

    .line 48
    .line 49
    aput-object v2, v0, v1

    .line 50
    .line 51
    const/16 v1, 0x9

    .line 52
    .line 53
    sget-object v2, Lcom/discord/react_strings/I18nMessage;->SYSTEM_MESSAGE_GUILD_MEMBER_JOIN_010:Lcom/discord/react_strings/I18nMessage;

    .line 54
    .line 55
    aput-object v2, v0, v1

    .line 56
    .line 57
    const/16 v1, 0xa

    .line 58
    .line 59
    sget-object v2, Lcom/discord/react_strings/I18nMessage;->SYSTEM_MESSAGE_GUILD_MEMBER_JOIN_011:Lcom/discord/react_strings/I18nMessage;

    .line 60
    .line 61
    aput-object v2, v0, v1

    .line 62
    .line 63
    const/16 v1, 0xb

    .line 64
    .line 65
    sget-object v2, Lcom/discord/react_strings/I18nMessage;->SYSTEM_MESSAGE_GUILD_MEMBER_JOIN_012:Lcom/discord/react_strings/I18nMessage;

    .line 66
    .line 67
    aput-object v2, v0, v1

    .line 68
    .line 69
    const/16 v1, 0xc

    .line 70
    .line 71
    sget-object v2, Lcom/discord/react_strings/I18nMessage;->SYSTEM_MESSAGE_GUILD_MEMBER_JOIN_013:Lcom/discord/react_strings/I18nMessage;

    .line 72
    .line 73
    aput-object v2, v0, v1

    .line 74
    .line 75
    invoke-static {v0}, Lkotlin/collections/h;->l([Ljava/lang/Object;)Ljava/util/List;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    if-eqz p1, :cond_0

    .line 80
    .line 81
    invoke-virtual {p1}, Lcom/discord/primitives/UserId;->unbox-impl()J

    .line 82
    .line 83
    .line 84
    move-result-wide v1

    .line 85
    goto :goto_0

    .line 86
    :cond_0
    const-wide/16 v1, 0x0

    .line 87
    .line 88
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    int-to-long v3, p1

    .line 93
    rem-long/2addr v1, v3

    .line 94
    long-to-int p1, v1

    .line 95
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    check-cast p1, Lcom/discord/react_strings/I18nMessage;

    .line 100
    .line 101
    new-instance v0, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt$getSystemMessageUserJoin$1$1;

    .line 102
    .line 103
    invoke-direct {v0, p2}, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt$getSystemMessageUserJoin$1$1;-><init>(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    invoke-static {p0, p1, v0}, Lcom/discord/react_strings/I18nUtilsKt;->i18nFormat(Landroid/content/Context;Lcom/discord/react_strings/I18nMessage;Lkotlin/jvm/functions/Function1;)Ljava/lang/CharSequence;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    return-object p0
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
.end method

.method public static final getTag(Lcom/discord/notifications/api/NotificationData;)Ljava/lang/String;
    .locals 3

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getType()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    sparse-switch v1, :sswitch_data_0

    .line 15
    .line 16
    .line 17
    goto/16 :goto_2

    .line 18
    .line 19
    :sswitch_0
    const-string v1, "CALL_RING"

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    goto/16 :goto_0

    .line 28
    .line 29
    :sswitch_1
    const-string v1, "MESSAGE_CREATE"

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    goto/16 :goto_0

    .line 38
    .line 39
    :sswitch_2
    const-string v1, "ACTIVITY_START"

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_0

    .line 46
    .line 47
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getType()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getActivityType()Ljava/lang/Integer;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getActivityName()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    new-instance v2, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    goto/16 :goto_1

    .line 78
    .line 79
    :sswitch_3
    const-string v1, "FORUM_THREAD_CREATED"

    .line 80
    .line 81
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-eqz v0, :cond_0

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :sswitch_4
    const-string v1, "APPLICATION_LIBRARY_INSTALL_COMPLETE"

    .line 89
    .line 90
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    if-eqz v0, :cond_0

    .line 95
    .line 96
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getType()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getApplicationId-UtIrSio()Lcom/discord/primitives/ApplicationId;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    new-instance v1, Ljava/lang/StringBuilder;

    .line 105
    .line 106
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    goto :goto_1

    .line 120
    :sswitch_5
    const-string v1, "STAGE_INSTANCE_CREATE"

    .line 121
    .line 122
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    if-eqz v0, :cond_0

    .line 127
    .line 128
    goto :goto_0

    .line 129
    :sswitch_6
    const-string v1, "RELATIONSHIP_ADD"

    .line 130
    .line 131
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    if-eqz v0, :cond_0

    .line 136
    .line 137
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getType()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getUserId-wUX8bhU()Lcom/discord/primitives/UserId;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    new-instance v1, Ljava/lang/StringBuilder;

    .line 146
    .line 147
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    goto :goto_1

    .line 161
    :sswitch_7
    const-string v1, "GUILD_SCHEDULED_EVENT_UPDATE"

    .line 162
    .line 163
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result v0

    .line 167
    if-eqz v0, :cond_0

    .line 168
    .line 169
    :goto_0
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getType()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getChannelId-qMVnFVQ()Lcom/discord/primitives/ChannelId;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    new-instance v1, Ljava/lang/StringBuilder;

    .line 178
    .line 179
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object p0

    .line 192
    goto :goto_1

    .line 193
    :sswitch_8
    const-string v1, "GENERIC_PUSH_NOTIFICATION_SENT"

    .line 194
    .line 195
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    move-result v0

    .line 199
    if-eqz v0, :cond_0

    .line 200
    .line 201
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getType()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getDeeplink()Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object p0

    .line 209
    new-instance v1, Ljava/lang/StringBuilder;

    .line 210
    .line 211
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 212
    .line 213
    .line 214
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 215
    .line 216
    .line 217
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object p0

    .line 224
    :goto_1
    return-object p0

    .line 225
    :cond_0
    :goto_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 226
    .line 227
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getType()Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object p0

    .line 231
    new-instance v1, Ljava/lang/StringBuilder;

    .line 232
    .line 233
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 234
    .line 235
    .line 236
    const-string v2, "Unknown notification type: "

    .line 237
    .line 238
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 239
    .line 240
    .line 241
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 242
    .line 243
    .line 244
    const-string p0, "."

    .line 245
    .line 246
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 247
    .line 248
    .line 249
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object p0

    .line 253
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    throw v0

    .line 257
    :sswitch_data_0
    .sparse-switch
        -0x598b8bf1 -> :sswitch_8
        -0x58c48974 -> :sswitch_7
        -0x4f1a5206 -> :sswitch_6
        -0x4b4caf7b -> :sswitch_5
        -0x49c69930 -> :sswitch_4
        -0x1a15df6f -> :sswitch_3
        0x3a0e4b12 -> :sswitch_2
        0x3b7f2454 -> :sswitch_1
        0x69807371 -> :sswitch_0
    .end sparse-switch
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
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
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
.end method

.method public static final getTimedMuteAction(Lcom/discord/notifications/api/NotificationData;Landroid/content/Context;I)Landroidx/core/app/NotificationCompat$Action;
    .locals 13

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "context"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getType()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, "MESSAGE_CREATE"

    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const/4 v1, 0x0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    const/4 v0, 0x2

    .line 25
    if-ge p2, v0, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getChannelId-qMVnFVQ()Lcom/discord/primitives/ChannelId;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    if-eqz p2, :cond_1

    .line 33
    .line 34
    invoke-virtual {p2}, Lcom/discord/primitives/ChannelId;->unbox-impl()J

    .line 35
    .line 36
    .line 37
    move-result-wide v5

    .line 38
    new-instance p2, Lcom/discord/notifications/actions/intents/MuteAction;

    .line 39
    .line 40
    invoke-static {p0}, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt;->getTag(Lcom/discord/notifications/api/NotificationData;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getGuildId-qOKuAAo()Lcom/discord/primitives/GuildId;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    const/4 v7, 0x0

    .line 49
    move-object v2, p2

    .line 50
    invoke-direct/range {v2 .. v7}, Lcom/discord/notifications/actions/intents/MuteAction;-><init>(Ljava/lang/String;Lcom/discord/primitives/GuildId;JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 51
    .line 52
    .line 53
    const/4 v9, 0x0

    .line 54
    const/4 v10, 0x0

    .line 55
    const/4 v11, 0x6

    .line 56
    const/4 v12, 0x0

    .line 57
    move-object v7, p2

    .line 58
    move-object v8, p1

    .line 59
    invoke-static/range {v7 .. v12}, Lcom/discord/notifications/actions/intents/NotificationAction$DefaultImpls;->toPendingIntent$default(Lcom/discord/notifications/actions/intents/NotificationAction;Landroid/content/Context;IZILjava/lang/Object;)Landroid/app/PendingIntent;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    new-instance p2, Landroidx/core/app/NotificationCompat$Action$a;

    .line 64
    .line 65
    sget v2, Lcom/discord/notifications/renderer/R$drawable;->ic_notifications_off_24dp:I

    .line 66
    .line 67
    sget-object v3, Lcom/discord/react_strings/I18nMessage;->NOTIFICATION_MUTE_1_HOUR:Lcom/discord/react_strings/I18nMessage;

    .line 68
    .line 69
    invoke-static {p1, v3, v1, v0, v1}, Lcom/discord/react_strings/I18nUtilsKt;->i18nFormat$default(Landroid/content/Context;Lcom/discord/react_strings/I18nMessage;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/CharSequence;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-direct {p2, v2, p1, p0}, Landroidx/core/app/NotificationCompat$Action$a;-><init>(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p2}, Landroidx/core/app/NotificationCompat$Action$a;->b()Landroidx/core/app/NotificationCompat$Action;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    return-object p0

    .line 81
    :cond_1
    :goto_0
    return-object v1
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
.end method

.method public static final getTitle(Lcom/discord/notifications/api/NotificationData;Landroid/content/Context;)Ljava/lang/CharSequence;
    .locals 6

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "context"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getType()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/4 v2, 0x2

    .line 20
    const/4 v3, 0x0

    .line 21
    const-string v4, ""

    .line 22
    .line 23
    const/4 v5, 0x1

    .line 24
    sparse-switch v1, :sswitch_data_0

    .line 25
    .line 26
    .line 27
    goto/16 :goto_12

    .line 28
    .line 29
    :sswitch_0
    const-string v1, "CALL_RING"

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-nez v0, :cond_0

    .line 36
    .line 37
    goto/16 :goto_12

    .line 38
    .line 39
    :cond_0
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getChannelType()Ljava/lang/Integer;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    if-nez v0, :cond_1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-ne v0, v5, :cond_2

    .line 51
    .line 52
    sget-object p0, Lcom/discord/react_strings/I18nMessage;->INCOMING_CALL:Lcom/discord/react_strings/I18nMessage;

    .line 53
    .line 54
    invoke-static {p1, p0, v3, v2, v3}, Lcom/discord/react_strings/I18nUtilsKt;->i18nFormat$default(Landroid/content/Context;Lcom/discord/react_strings/I18nMessage;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/CharSequence;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    goto/16 :goto_12

    .line 59
    .line 60
    :cond_2
    :goto_0
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getChannelName()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    if-nez p0, :cond_3

    .line 65
    .line 66
    goto/16 :goto_12

    .line 67
    .line 68
    :cond_3
    :goto_1
    move-object v4, p0

    .line 69
    goto/16 :goto_12

    .line 70
    .line 71
    :sswitch_1
    const-string p1, "MESSAGE_CREATE"

    .line 72
    .line 73
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    if-nez p1, :cond_4

    .line 78
    .line 79
    goto/16 :goto_12

    .line 80
    .line 81
    :cond_4
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getChannelType()Ljava/lang/Integer;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    const/4 v0, 0x0

    .line 86
    if-nez p1, :cond_5

    .line 87
    .line 88
    goto :goto_3

    .line 89
    :cond_5
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    if-nez v1, :cond_6

    .line 94
    .line 95
    :goto_2
    move v1, v5

    .line 96
    goto :goto_5

    .line 97
    :cond_6
    :goto_3
    if-nez p1, :cond_7

    .line 98
    .line 99
    goto :goto_4

    .line 100
    :cond_7
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    if-ne v1, v2, :cond_8

    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_8
    :goto_4
    move v1, v0

    .line 108
    :goto_5
    if-eqz v1, :cond_9

    .line 109
    .line 110
    :goto_6
    move v1, v5

    .line 111
    goto :goto_8

    .line 112
    :cond_9
    if-nez p1, :cond_a

    .line 113
    .line 114
    goto :goto_7

    .line 115
    :cond_a
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 116
    .line 117
    .line 118
    move-result v1

    .line 119
    const/4 v2, 0x5

    .line 120
    if-ne v1, v2, :cond_b

    .line 121
    .line 122
    goto :goto_6

    .line 123
    :cond_b
    :goto_7
    move v1, v0

    .line 124
    :goto_8
    if-eqz v1, :cond_c

    .line 125
    .line 126
    :goto_9
    move v1, v5

    .line 127
    goto :goto_b

    .line 128
    :cond_c
    if-nez p1, :cond_d

    .line 129
    .line 130
    goto :goto_a

    .line 131
    :cond_d
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    const/16 v2, 0xa

    .line 136
    .line 137
    if-ne v1, v2, :cond_e

    .line 138
    .line 139
    goto :goto_9

    .line 140
    :cond_e
    :goto_a
    move v1, v0

    .line 141
    :goto_b
    if-eqz v1, :cond_f

    .line 142
    .line 143
    :goto_c
    move v1, v5

    .line 144
    goto :goto_e

    .line 145
    :cond_f
    if-nez p1, :cond_10

    .line 146
    .line 147
    goto :goto_d

    .line 148
    :cond_10
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    const/16 v2, 0xb

    .line 153
    .line 154
    if-ne v1, v2, :cond_11

    .line 155
    .line 156
    goto :goto_c

    .line 157
    :cond_11
    :goto_d
    move v1, v0

    .line 158
    :goto_e
    if-eqz v1, :cond_12

    .line 159
    .line 160
    :goto_f
    move v0, v5

    .line 161
    goto :goto_10

    .line 162
    :cond_12
    if-nez p1, :cond_13

    .line 163
    .line 164
    goto :goto_10

    .line 165
    :cond_13
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 166
    .line 167
    .line 168
    move-result v1

    .line 169
    const/16 v2, 0xc

    .line 170
    .line 171
    if-ne v1, v2, :cond_14

    .line 172
    .line 173
    goto :goto_f

    .line 174
    :cond_14
    :goto_10
    if-eqz v0, :cond_15

    .line 175
    .line 176
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getGuildName()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getChannelName()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object p0

    .line 184
    new-instance v0, Ljava/lang/StringBuilder;

    .line 185
    .line 186
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    const-string p1, " #"

    .line 193
    .line 194
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 195
    .line 196
    .line 197
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object p0

    .line 204
    goto/16 :goto_1

    .line 205
    .line 206
    :cond_15
    if-nez p1, :cond_16

    .line 207
    .line 208
    goto :goto_11

    .line 209
    :cond_16
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 210
    .line 211
    .line 212
    move-result v0

    .line 213
    if-ne v0, v5, :cond_17

    .line 214
    .line 215
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getUserUsername()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object p0

    .line 219
    if-nez p0, :cond_3

    .line 220
    .line 221
    goto/16 :goto_12

    .line 222
    .line 223
    :cond_17
    :goto_11
    if-nez p1, :cond_18

    .line 224
    .line 225
    goto/16 :goto_12

    .line 226
    .line 227
    :cond_18
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 228
    .line 229
    .line 230
    move-result p1

    .line 231
    const/4 v0, 0x3

    .line 232
    if-ne p1, v0, :cond_23

    .line 233
    .line 234
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getChannelName()Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object p1

    .line 238
    if-nez p1, :cond_19

    .line 239
    .line 240
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getUserUsername()Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object p0

    .line 244
    if-nez p0, :cond_3

    .line 245
    .line 246
    goto/16 :goto_12

    .line 247
    .line 248
    :cond_19
    move-object v4, p1

    .line 249
    goto/16 :goto_12

    .line 250
    .line 251
    :sswitch_2
    const-string v1, "ACTIVITY_START"

    .line 252
    .line 253
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    move-result v0

    .line 257
    if-nez v0, :cond_1a

    .line 258
    .line 259
    goto/16 :goto_12

    .line 260
    .line 261
    :cond_1a
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getActivityType()Ljava/lang/Integer;

    .line 262
    .line 263
    .line 264
    move-result-object p0

    .line 265
    if-nez p0, :cond_1b

    .line 266
    .line 267
    goto/16 :goto_12

    .line 268
    .line 269
    :cond_1b
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 270
    .line 271
    .line 272
    move-result p0

    .line 273
    if-nez p0, :cond_23

    .line 274
    .line 275
    sget-object p0, Lcom/discord/react_strings/I18nMessage;->NOTIFICATION_TITLE_START_GAME:Lcom/discord/react_strings/I18nMessage;

    .line 276
    .line 277
    invoke-static {p1, p0, v3, v2, v3}, Lcom/discord/react_strings/I18nUtilsKt;->i18nFormat$default(Landroid/content/Context;Lcom/discord/react_strings/I18nMessage;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/CharSequence;

    .line 278
    .line 279
    .line 280
    move-result-object v4

    .line 281
    goto/16 :goto_12

    .line 282
    .line 283
    :sswitch_3
    const-string v1, "FORUM_THREAD_CREATED"

    .line 284
    .line 285
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 286
    .line 287
    .line 288
    move-result v0

    .line 289
    if-nez v0, :cond_1c

    .line 290
    .line 291
    goto/16 :goto_12

    .line 292
    .line 293
    :cond_1c
    sget-object v0, Lcom/discord/react_strings/I18nMessage;->FORUM_CHANNEL_THREAD_CREATED_PUSH_TITLE_MOBILE:Lcom/discord/react_strings/I18nMessage;

    .line 294
    .line 295
    new-instance v1, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt$getTitle$2;

    .line 296
    .line 297
    invoke-direct {v1, p0}, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt$getTitle$2;-><init>(Lcom/discord/notifications/api/NotificationData;)V

    .line 298
    .line 299
    .line 300
    invoke-static {p1, v0, v1}, Lcom/discord/react_strings/I18nUtilsKt;->i18nFormat(Landroid/content/Context;Lcom/discord/react_strings/I18nMessage;Lkotlin/jvm/functions/Function1;)Ljava/lang/CharSequence;

    .line 301
    .line 302
    .line 303
    move-result-object v4

    .line 304
    goto/16 :goto_12

    .line 305
    .line 306
    :sswitch_4
    const-string p0, "APPLICATION_LIBRARY_INSTALL_COMPLETE"

    .line 307
    .line 308
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 309
    .line 310
    .line 311
    move-result p0

    .line 312
    if-nez p0, :cond_1d

    .line 313
    .line 314
    goto :goto_12

    .line 315
    :cond_1d
    sget-object p0, Lcom/discord/react_strings/I18nMessage;->GAME_LIBRARY_NOTIFICATION_GAME_INSTALLED_TITLE:Lcom/discord/react_strings/I18nMessage;

    .line 316
    .line 317
    invoke-static {p1, p0, v3, v2, v3}, Lcom/discord/react_strings/I18nUtilsKt;->i18nFormat$default(Landroid/content/Context;Lcom/discord/react_strings/I18nMessage;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/CharSequence;

    .line 318
    .line 319
    .line 320
    move-result-object v4

    .line 321
    goto :goto_12

    .line 322
    :sswitch_5
    const-string v1, "STAGE_INSTANCE_CREATE"

    .line 323
    .line 324
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 325
    .line 326
    .line 327
    move-result v0

    .line 328
    if-nez v0, :cond_1e

    .line 329
    .line 330
    goto :goto_12

    .line 331
    :cond_1e
    sget-object v0, Lcom/discord/react_strings/I18nMessage;->STAGE_START_PUSH_NOTIFICATION_TITLE:Lcom/discord/react_strings/I18nMessage;

    .line 332
    .line 333
    new-instance v1, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt$getTitle$1;

    .line 334
    .line 335
    invoke-direct {v1, p0}, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt$getTitle$1;-><init>(Lcom/discord/notifications/api/NotificationData;)V

    .line 336
    .line 337
    .line 338
    invoke-static {p1, v0, v1}, Lcom/discord/react_strings/I18nUtilsKt;->i18nFormat(Landroid/content/Context;Lcom/discord/react_strings/I18nMessage;Lkotlin/jvm/functions/Function1;)Ljava/lang/CharSequence;

    .line 339
    .line 340
    .line 341
    move-result-object v4

    .line 342
    goto :goto_12

    .line 343
    :sswitch_6
    const-string p1, "RELATIONSHIP_ADD"

    .line 344
    .line 345
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 346
    .line 347
    .line 348
    move-result p1

    .line 349
    if-nez p1, :cond_1f

    .line 350
    .line 351
    goto :goto_12

    .line 352
    :cond_1f
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getUserUsername()Ljava/lang/String;

    .line 353
    .line 354
    .line 355
    move-result-object p0

    .line 356
    if-nez p0, :cond_3

    .line 357
    .line 358
    goto :goto_12

    .line 359
    :sswitch_7
    const-string v1, "GUILD_SCHEDULED_EVENT_UPDATE"

    .line 360
    .line 361
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 362
    .line 363
    .line 364
    move-result v0

    .line 365
    if-nez v0, :cond_20

    .line 366
    .line 367
    goto :goto_12

    .line 368
    :cond_20
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getGuildScheduledEventEntityType()Ljava/lang/Integer;

    .line 369
    .line 370
    .line 371
    move-result-object v0

    .line 372
    if-nez v0, :cond_21

    .line 373
    .line 374
    goto :goto_12

    .line 375
    :cond_21
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 376
    .line 377
    .line 378
    move-result v0

    .line 379
    if-ne v0, v5, :cond_23

    .line 380
    .line 381
    sget-object v0, Lcom/discord/react_strings/I18nMessage;->GUILD_SCHEDULED_EVENT_STAGE_START_TITLE:Lcom/discord/react_strings/I18nMessage;

    .line 382
    .line 383
    new-instance v1, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt$getTitle$3;

    .line 384
    .line 385
    invoke-direct {v1, p0}, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt$getTitle$3;-><init>(Lcom/discord/notifications/api/NotificationData;)V

    .line 386
    .line 387
    .line 388
    invoke-static {p1, v0, v1}, Lcom/discord/react_strings/I18nUtilsKt;->i18nFormat(Landroid/content/Context;Lcom/discord/react_strings/I18nMessage;Lkotlin/jvm/functions/Function1;)Ljava/lang/CharSequence;

    .line 389
    .line 390
    .line 391
    move-result-object v4

    .line 392
    goto :goto_12

    .line 393
    :sswitch_8
    const-string p1, "GENERIC_PUSH_NOTIFICATION_SENT"

    .line 394
    .line 395
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 396
    .line 397
    .line 398
    move-result p1

    .line 399
    if-nez p1, :cond_22

    .line 400
    .line 401
    goto :goto_12

    .line 402
    :cond_22
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getTitle()Ljava/lang/String;

    .line 403
    .line 404
    .line 405
    move-result-object p0

    .line 406
    if-nez p0, :cond_3

    .line 407
    .line 408
    :cond_23
    :goto_12
    return-object v4

    .line 409
    :sswitch_data_0
    .sparse-switch
        -0x598b8bf1 -> :sswitch_8
        -0x58c48974 -> :sswitch_7
        -0x4f1a5206 -> :sswitch_6
        -0x4b4caf7b -> :sswitch_5
        -0x49c69930 -> :sswitch_4
        -0x1a15df6f -> :sswitch_3
        0x3a0e4b12 -> :sswitch_2
        0x3b7f2454 -> :sswitch_1
        0x69807371 -> :sswitch_0
    .end sparse-switch
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
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
.end method

.method public static final isConversation(Lcom/discord/notifications/api/NotificationData;)Z
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getType()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const-string v0, "MESSAGE_CREATE"

    .line 11
    .line 12
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0
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
.end method

.method public static final isGroupConversation(Lcom/discord/notifications/api/NotificationData;)Z
    .locals 2

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getType()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-string v1, "MESSAGE_CREATE"

    .line 11
    .line 12
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getChannelType()Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    const/4 v0, 0x1

    .line 23
    if-nez p0, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-eq p0, v0, :cond_1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    const/4 v0, 0x0

    .line 34
    :goto_0
    return v0
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
.end method

.method public static final renderMessageContent(Lcom/discord/notifications/api/NotificationData;Landroid/content/Context;)Ljava/lang/CharSequence;
    .locals 3

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "context"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getMessage()Lcom/discord/notifications/api/NotificationMessage;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const/4 v1, 0x0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/discord/notifications/api/NotificationMessage;->getSticker()Lcom/discord/notifications/api/Sticker;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move-object v0, v1

    .line 24
    :goto_0
    if-eqz v0, :cond_1

    .line 25
    .line 26
    sget-object p0, Lcom/discord/react_strings/I18nMessage;->STICKER_NOTIFICATION_BODY:Lcom/discord/react_strings/I18nMessage;

    .line 27
    .line 28
    new-instance v1, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt$renderMessageContent$1;

    .line 29
    .line 30
    invoke-direct {v1, v0}, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt$renderMessageContent$1;-><init>(Lcom/discord/notifications/api/Sticker;)V

    .line 31
    .line 32
    .line 33
    invoke-static {p1, p0, v1}, Lcom/discord/react_strings/I18nUtilsKt;->i18nFormat(Landroid/content/Context;Lcom/discord/react_strings/I18nMessage;Lkotlin/jvm/functions/Function1;)Ljava/lang/CharSequence;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0

    .line 38
    :cond_1
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getMessageFlags()Ljava/lang/Long;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    sget-object v2, Lcom/discord/primitives/MessageFlag;->IS_VOICE_MESSAGE:Lcom/discord/primitives/MessageFlag;

    .line 43
    .line 44
    invoke-static {v0, v2}, Lcom/discord/primitives/MessageFlagKt;->hasMessageFlag(Ljava/lang/Long;Lcom/discord/primitives/MessageFlag;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_2

    .line 49
    .line 50
    sget-object p0, Lcom/discord/react_strings/I18nMessage;->VOICE_MESSAGES_SENT_NOTIFICATION:Lcom/discord/react_strings/I18nMessage;

    .line 51
    .line 52
    const/4 v0, 0x2

    .line 53
    invoke-static {p1, p0, v1, v0, v1}, Lcom/discord/react_strings/I18nUtilsKt;->i18nFormat$default(Landroid/content/Context;Lcom/discord/react_strings/I18nMessage;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/CharSequence;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    return-object p0

    .line 58
    :cond_2
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getMessageContent()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    if-eqz p1, :cond_4

    .line 63
    .line 64
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-nez p1, :cond_3

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_3
    const/4 p1, 0x0

    .line 72
    goto :goto_2

    .line 73
    :cond_4
    :goto_1
    const/4 p1, 0x1

    .line 74
    :goto_2
    if-eqz p1, :cond_5

    .line 75
    .line 76
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getMessageContent()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    return-object p0

    .line 81
    :cond_5
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getMessageContent()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-static {p0}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    invoke-static {p0}, Lcom/discord/notifications/renderer/utils/RenderNotificationMessageContentKt;->renderNotificationMessageContent(Ljava/lang/String;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    return-object p0
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
.end method

.method public static final shouldUseBigText(Lcom/discord/notifications/api/NotificationData;)Z
    .locals 2

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getType()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-string v1, "GENERIC_PUSH_NOTIFICATION_SENT"

    .line 11
    .line 12
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getExpandSubtitle()Ljava/lang/Boolean;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 23
    .line 24
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    if-eqz p0, :cond_0

    .line 29
    .line 30
    const/4 p0, 0x1

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/4 p0, 0x0

    .line 33
    :goto_0
    return p0
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
.end method

.method private static final toIconCompat(Landroid/graphics/Bitmap;)Landroidx/core/graphics/drawable/IconCompat;
    .locals 1

    invoke-static {p0}, Landroidx/core/graphics/drawable/IconCompat;->h(Landroid/graphics/Bitmap;)Landroidx/core/graphics/drawable/IconCompat;

    move-result-object p0

    const-string v0, "createWithBitmap(this)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method
