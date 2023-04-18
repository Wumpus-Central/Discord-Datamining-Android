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
    invoke-static {p3}, Lmf/s;->v(Ljava/util/Map;)Ljava/util/Map;

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
    invoke-static {p3, p1}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

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
    invoke-static {p3, p1}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

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
.end method

.method public static final getContent(Lcom/discord/notifications/api/NotificationData;Landroid/content/Context;)Ljava/lang/CharSequence;
    .locals 7

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getType()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/4 v2, 0x3

    const/4 v3, 0x2

    const-string v4, ""

    const/4 v5, 0x0

    const/4 v6, 0x1

    sparse-switch v1, :sswitch_data_0

    goto/16 :goto_1a

    :sswitch_0
    const-string v1, "CALL_RING"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_1a

    .line 2
    :cond_0
    sget-object v0, Lcom/discord/react_strings/I18nMessage;->OVERLAY_FRIEND_CALLING:Lcom/discord/react_strings/I18nMessage;

    new-instance v1, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt$getContent$4;

    invoke-direct {v1, p0}, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt$getContent$4;-><init>(Lcom/discord/notifications/api/NotificationData;)V

    invoke-static {p1, v0, v1}, Lcom/discord/react_strings/I18nUtilsKt;->i18nFormat(Landroid/content/Context;Lcom/discord/react_strings/I18nMessage;Lkotlin/jvm/functions/Function1;)Ljava/lang/CharSequence;

    move-result-object v4

    goto/16 :goto_1a

    :sswitch_1
    const-string v1, "MESSAGE_CREATE"

    .line 3
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_1a

    .line 4
    :cond_1
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getChannelType()Ljava/lang/Integer;

    move-result-object v0

    if-nez v0, :cond_2

    goto :goto_1

    .line 5
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-nez v1, :cond_3

    :goto_0
    move v1, v6

    goto :goto_3

    :cond_3
    :goto_1
    if-nez v0, :cond_4

    goto :goto_2

    .line 6
    :cond_4
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne v1, v3, :cond_5

    goto :goto_0

    :cond_5
    :goto_2
    move v1, v5

    :goto_3
    if-eqz v1, :cond_6

    :goto_4
    move v1, v6

    goto :goto_6

    :cond_6
    if-nez v0, :cond_7

    goto :goto_5

    .line 7
    :cond_7
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v3, 0x5

    if-ne v1, v3, :cond_8

    goto :goto_4

    :cond_8
    :goto_5
    move v1, v5

    :goto_6
    if-eqz v1, :cond_9

    :goto_7
    move v1, v6

    goto :goto_9

    :cond_9
    if-nez v0, :cond_a

    goto :goto_8

    .line 8
    :cond_a
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/16 v3, 0xa

    if-ne v1, v3, :cond_b

    goto :goto_7

    :cond_b
    :goto_8
    move v1, v5

    :goto_9
    if-eqz v1, :cond_c

    :goto_a
    move v1, v6

    goto :goto_c

    :cond_c
    if-nez v0, :cond_d

    goto :goto_b

    .line 9
    :cond_d
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/16 v3, 0xb

    if-ne v1, v3, :cond_e

    goto :goto_a

    :cond_e
    :goto_b
    move v1, v5

    :goto_c
    if-eqz v1, :cond_f

    :goto_d
    move v1, v6

    goto :goto_f

    :cond_f
    if-nez v0, :cond_10

    goto :goto_e

    .line 10
    :cond_10
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/16 v3, 0xc

    if-ne v1, v3, :cond_11

    goto :goto_d

    :cond_11
    :goto_e
    move v1, v5

    :goto_f
    if-eqz v1, :cond_16

    .line 11
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getMessageType()Ljava/lang/Integer;

    move-result-object v0

    if-nez v0, :cond_12

    goto :goto_10

    :cond_12
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x7

    if-ne v0, v1, :cond_13

    .line 12
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getUserId-wUX8bhU()Lcom/discord/primitives/UserId;

    move-result-object v0

    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getUserUsername()Ljava/lang/String;

    move-result-object p0

    invoke-static {p1, v0, p0}, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt;->getSystemMessageUserJoin-_NT-lnE(Landroid/content/Context;Lcom/discord/primitives/UserId;Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v4

    goto/16 :goto_1a

    .line 13
    :cond_13
    :goto_10
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getMessageActivityType()Ljava/lang/Integer;

    move-result-object v0

    if-nez v0, :cond_14

    goto :goto_11

    :cond_14
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ne v0, v6, :cond_15

    .line 14
    sget-object v0, Lcom/discord/react_strings/I18nMessage;->NOTIFICATION_MESSAGE_CREATE_GUILD_ACTIVITY_JOIN:Lcom/discord/react_strings/I18nMessage;

    new-instance v1, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt$getContent$1;

    invoke-direct {v1, p0}, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt$getContent$1;-><init>(Lcom/discord/notifications/api/NotificationData;)V

    invoke-static {p1, v0, v1}, Lcom/discord/react_strings/I18nUtilsKt;->i18nFormat(Landroid/content/Context;Lcom/discord/react_strings/I18nMessage;Lkotlin/jvm/functions/Function1;)Ljava/lang/CharSequence;

    move-result-object v4

    goto/16 :goto_1a

    .line 15
    :cond_15
    :goto_11
    invoke-static {p0, p1}, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt;->renderMessageContent(Lcom/discord/notifications/api/NotificationData;Landroid/content/Context;)Ljava/lang/CharSequence;

    move-result-object v4

    goto/16 :goto_1a

    :cond_16
    if-nez v0, :cond_17

    goto :goto_13

    .line 16
    :cond_17
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne v1, v2, :cond_18

    :goto_12
    move v5, v6

    goto :goto_14

    :cond_18
    :goto_13
    if-nez v0, :cond_19

    goto :goto_14

    .line 17
    :cond_19
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ne v0, v6, :cond_1a

    goto :goto_12

    :cond_1a
    :goto_14
    if-eqz v5, :cond_2f

    .line 18
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getMessageActivityType()Ljava/lang/Integer;

    move-result-object v0

    if-nez v0, :cond_1b

    goto :goto_15

    :cond_1b
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ne v0, v6, :cond_1c

    .line 19
    sget-object v0, Lcom/discord/react_strings/I18nMessage;->NOTIFICATION_MESSAGE_CREATE_DM_ACTIVITY_JOIN:Lcom/discord/react_strings/I18nMessage;

    new-instance v1, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt$getContent$2;

    invoke-direct {v1, p0}, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt$getContent$2;-><init>(Lcom/discord/notifications/api/NotificationData;)V

    invoke-static {p1, v0, v1}, Lcom/discord/react_strings/I18nUtilsKt;->i18nFormat(Landroid/content/Context;Lcom/discord/react_strings/I18nMessage;Lkotlin/jvm/functions/Function1;)Ljava/lang/CharSequence;

    move-result-object v4

    goto/16 :goto_1a

    .line 20
    :cond_1c
    :goto_15
    invoke-static {p0, p1}, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt;->renderMessageContent(Lcom/discord/notifications/api/NotificationData;Landroid/content/Context;)Ljava/lang/CharSequence;

    move-result-object v4

    goto/16 :goto_1a

    :sswitch_2
    const-string v1, "ACTIVITY_START"

    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1d

    goto/16 :goto_1a

    .line 22
    :cond_1d
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getActivityType()Ljava/lang/Integer;

    move-result-object v0

    if-nez v0, :cond_1e

    goto/16 :goto_1a

    :cond_1e
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-nez v0, :cond_2f

    .line 23
    sget-object v0, Lcom/discord/react_strings/I18nMessage;->NOTIFICATION_BODY_START_GAME:Lcom/discord/react_strings/I18nMessage;

    new-instance v1, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt$getContent$3;

    invoke-direct {v1, p0}, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt$getContent$3;-><init>(Lcom/discord/notifications/api/NotificationData;)V

    invoke-static {p1, v0, v1}, Lcom/discord/react_strings/I18nUtilsKt;->i18nFormat(Landroid/content/Context;Lcom/discord/react_strings/I18nMessage;Lkotlin/jvm/functions/Function1;)Ljava/lang/CharSequence;

    move-result-object v4

    goto/16 :goto_1a

    :sswitch_3
    const-string v1, "FORUM_THREAD_CREATED"

    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1f

    goto/16 :goto_1a

    .line 25
    :cond_1f
    sget-object v0, Lcom/discord/react_strings/I18nMessage;->FORUM_CHANNEL_THREAD_CREATED_PUSH_BODY_MOBILE:Lcom/discord/react_strings/I18nMessage;

    new-instance v1, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt$getContent$7;

    invoke-direct {v1, p0}, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt$getContent$7;-><init>(Lcom/discord/notifications/api/NotificationData;)V

    invoke-static {p1, v0, v1}, Lcom/discord/react_strings/I18nUtilsKt;->i18nFormat(Landroid/content/Context;Lcom/discord/react_strings/I18nMessage;Lkotlin/jvm/functions/Function1;)Ljava/lang/CharSequence;

    move-result-object v4

    goto/16 :goto_1a

    :sswitch_4
    const-string v1, "APPLICATION_LIBRARY_INSTALL_COMPLETE"

    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_20

    goto/16 :goto_1a

    .line 27
    :cond_20
    sget-object v0, Lcom/discord/react_strings/I18nMessage;->GAME_LIBRARY_NOTIFICATION_GAME_INSTALLED_BODY:Lcom/discord/react_strings/I18nMessage;

    new-instance v1, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt$getContent$5;

    invoke-direct {v1, p0}, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt$getContent$5;-><init>(Lcom/discord/notifications/api/NotificationData;)V

    invoke-static {p1, v0, v1}, Lcom/discord/react_strings/I18nUtilsKt;->i18nFormat(Landroid/content/Context;Lcom/discord/react_strings/I18nMessage;Lkotlin/jvm/functions/Function1;)Ljava/lang/CharSequence;

    move-result-object v4

    goto/16 :goto_1a

    :sswitch_5
    const-string v1, "STAGE_INSTANCE_CREATE"

    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_21

    goto/16 :goto_1a

    .line 29
    :cond_21
    sget-object v0, Lcom/discord/react_strings/I18nMessage;->STAGE_START_PUSH_NOTIFICATION_BODY:Lcom/discord/react_strings/I18nMessage;

    new-instance v1, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt$getContent$6;

    invoke-direct {v1, p0}, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt$getContent$6;-><init>(Lcom/discord/notifications/api/NotificationData;)V

    invoke-static {p1, v0, v1}, Lcom/discord/react_strings/I18nUtilsKt;->i18nFormat(Landroid/content/Context;Lcom/discord/react_strings/I18nMessage;Lkotlin/jvm/functions/Function1;)Ljava/lang/CharSequence;

    move-result-object v4

    goto/16 :goto_1a

    :sswitch_6
    const-string v1, "RELATIONSHIP_ADD"

    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_22

    goto/16 :goto_1a

    .line 31
    :cond_22
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getRelationshipType()Ljava/lang/Integer;

    move-result-object p0

    const/4 v0, 0x0

    if-nez p0, :cond_23

    goto :goto_16

    .line 32
    :cond_23
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne v1, v6, :cond_24

    .line 33
    sget-object p0, Lcom/discord/react_strings/I18nMessage;->NOTIFICATION_ACCEPTED_FRIEND_REQUEST:Lcom/discord/react_strings/I18nMessage;

    invoke-static {p1, p0, v0, v3, v0}, Lcom/discord/react_strings/I18nUtilsKt;->i18nFormat$default(Landroid/content/Context;Lcom/discord/react_strings/I18nMessage;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object v4

    goto/16 :goto_1a

    :cond_24
    :goto_16
    if-nez p0, :cond_25

    goto/16 :goto_1a

    .line 34
    :cond_25
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    if-ne p0, v2, :cond_2f

    .line 35
    sget-object p0, Lcom/discord/react_strings/I18nMessage;->NOTIFICATION_PENDING_FRIEND_REQUEST:Lcom/discord/react_strings/I18nMessage;

    invoke-static {p1, p0, v0, v3, v0}, Lcom/discord/react_strings/I18nUtilsKt;->i18nFormat$default(Landroid/content/Context;Lcom/discord/react_strings/I18nMessage;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object v4

    goto :goto_1a

    :sswitch_7
    const-string v1, "GUILD_SCHEDULED_EVENT_UPDATE"

    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_26

    goto :goto_1a

    .line 37
    :cond_26
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getGuildScheduledEventEntityType()Ljava/lang/Integer;

    move-result-object v0

    if-nez v0, :cond_27

    goto :goto_18

    .line 38
    :cond_27
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne v1, v3, :cond_28

    :goto_17
    move v5, v6

    goto :goto_19

    :cond_28
    :goto_18
    if-nez v0, :cond_29

    goto :goto_19

    .line 39
    :cond_29
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne v1, v6, :cond_2a

    goto :goto_17

    :cond_2a
    :goto_19
    if-eqz v5, :cond_2b

    .line 40
    sget-object v0, Lcom/discord/react_strings/I18nMessage;->GUILD_SCHEDULED_EVENT_STAGE_START_BODY:Lcom/discord/react_strings/I18nMessage;

    new-instance v1, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt$getContent$8;

    invoke-direct {v1, p0}, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt$getContent$8;-><init>(Lcom/discord/notifications/api/NotificationData;)V

    invoke-static {p1, v0, v1}, Lcom/discord/react_strings/I18nUtilsKt;->i18nFormat(Landroid/content/Context;Lcom/discord/react_strings/I18nMessage;Lkotlin/jvm/functions/Function1;)Ljava/lang/CharSequence;

    move-result-object v4

    goto :goto_1a

    :cond_2b
    if-nez v0, :cond_2c

    goto :goto_1a

    .line 41
    :cond_2c
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ne v0, v2, :cond_2f

    .line 42
    sget-object v0, Lcom/discord/react_strings/I18nMessage;->GUILD_SCHEDULED_EVENT_EXTERNAL_START_BODY:Lcom/discord/react_strings/I18nMessage;

    new-instance v1, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt$getContent$9;

    invoke-direct {v1, p0}, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt$getContent$9;-><init>(Lcom/discord/notifications/api/NotificationData;)V

    invoke-static {p1, v0, v1}, Lcom/discord/react_strings/I18nUtilsKt;->i18nFormat(Landroid/content/Context;Lcom/discord/react_strings/I18nMessage;Lkotlin/jvm/functions/Function1;)Ljava/lang/CharSequence;

    move-result-object v4

    goto :goto_1a

    :sswitch_8
    const-string p1, "GENERIC_PUSH_NOTIFICATION_SENT"

    .line 43
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2d

    goto :goto_1a

    .line 44
    :cond_2d
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getSubtitle()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_2e

    goto :goto_1a

    :cond_2e
    move-object v4, p0

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
.end method

.method public static final getIconUrl(Lcom/discord/notifications/api/NotificationData;Landroid/content/Context;)Ljava/lang/String;
    .locals 12

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getType()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const-string v2, ""

    sparse-switch v1, :sswitch_data_0

    goto/16 :goto_13

    :sswitch_0
    const-string v1, "CALL_RING"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_13

    :sswitch_1
    const-string v1, "MESSAGE_CREATE"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_13

    .line 2
    :cond_0
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getChannelType()Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x1

    if-nez v0, :cond_1

    goto :goto_0

    .line 3
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ne v2, v1, :cond_2

    .line 4
    sget-object v3, Lcom/discord/icons/IconUrlUtils;->INSTANCE:Lcom/discord/icons/IconUrlUtils;

    .line 5
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getUserId-wUX8bhU()Lcom/discord/primitives/UserId;

    move-result-object v5

    .line 6
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getUserAvatar()Ljava/lang/String;

    move-result-object v6

    .line 7
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getUserDiscriminator()Ljava/lang/Integer;

    move-result-object v7

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/16 v10, 0x20

    const/4 v11, 0x0

    move-object v4, p1

    .line 8
    invoke-static/range {v3 .. v11}, Lcom/discord/icons/IconUrlUtils;->getForUser-_fRzTXg$default(Lcom/discord/icons/IconUrlUtils;Landroid/content/Context;Lcom/discord/primitives/UserId;Ljava/lang/String;Ljava/lang/Integer;ZLjava/lang/Integer;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    goto/16 :goto_13

    :cond_2
    :goto_0
    const/4 v2, 0x0

    if-nez v0, :cond_3

    goto :goto_2

    .line 9
    :cond_3
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-nez v3, :cond_4

    :goto_1
    move v3, v1

    goto :goto_4

    :cond_4
    :goto_2
    if-nez v0, :cond_5

    goto :goto_3

    .line 10
    :cond_5
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const/4 v4, 0x2

    if-ne v3, v4, :cond_6

    goto :goto_1

    :cond_6
    :goto_3
    move v3, v2

    :goto_4
    if-eqz v3, :cond_7

    :goto_5
    move v3, v1

    goto :goto_7

    :cond_7
    if-nez v0, :cond_8

    goto :goto_6

    .line 11
    :cond_8
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const/4 v4, 0x5

    if-ne v3, v4, :cond_9

    goto :goto_5

    :cond_9
    :goto_6
    move v3, v2

    :goto_7
    if-eqz v3, :cond_a

    :goto_8
    move v3, v1

    goto :goto_a

    :cond_a
    if-nez v0, :cond_b

    goto :goto_9

    .line 12
    :cond_b
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const/16 v4, 0xa

    if-ne v3, v4, :cond_c

    goto :goto_8

    :cond_c
    :goto_9
    move v3, v2

    :goto_a
    if-eqz v3, :cond_d

    :goto_b
    move v3, v1

    goto :goto_d

    :cond_d
    if-nez v0, :cond_e

    goto :goto_c

    .line 13
    :cond_e
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const/16 v4, 0xb

    if-ne v3, v4, :cond_f

    goto :goto_b

    :cond_f
    :goto_c
    move v3, v2

    :goto_d
    if-eqz v3, :cond_10

    :goto_e
    move v0, v1

    goto :goto_10

    :cond_10
    if-nez v0, :cond_11

    goto :goto_f

    .line 14
    :cond_11
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v3, 0xc

    if-ne v0, v3, :cond_12

    goto :goto_e

    :cond_12
    :goto_f
    move v0, v2

    :goto_10
    if-eqz v0, :cond_13

    .line 15
    sget-object v3, Lcom/discord/icons/IconUrlUtils;->INSTANCE:Lcom/discord/icons/IconUrlUtils;

    .line 16
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getGuildId-qOKuAAo()Lcom/discord/primitives/GuildId;

    move-result-object v4

    .line 17
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getGuildIcon()Ljava/lang/String;

    move-result-object v5

    const-string v6, ""

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/16 v9, 0x18

    const/4 v10, 0x0

    .line 18
    invoke-static/range {v3 .. v10}, Lcom/discord/icons/IconUrlUtils;->getForGuild-14CJxO4$default(Lcom/discord/icons/IconUrlUtils;Lcom/discord/primitives/GuildId;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    goto/16 :goto_13

    .line 19
    :cond_13
    sget-object v3, Lcom/discord/icons/IconUrlUtils;->INSTANCE:Lcom/discord/icons/IconUrlUtils;

    .line 20
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getChannelId-qMVnFVQ()Lcom/discord/primitives/ChannelId;

    move-result-object v5

    .line 21
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getChannelIcon()Ljava/lang/String;

    move-result-object v6

    .line 22
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getChannelType()Ljava/lang/Integer;

    move-result-object p0

    if-nez p0, :cond_14

    goto :goto_11

    :cond_14
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    const/4 v0, 0x3

    if-ne p0, v0, :cond_15

    move v7, v1

    goto :goto_12

    :cond_15
    :goto_11
    move v7, v2

    :goto_12
    const/4 v8, 0x0

    const/16 v9, 0x10

    const/4 v10, 0x0

    move-object v4, p1

    .line 23
    invoke-static/range {v3 .. v10}, Lcom/discord/icons/IconUrlUtils;->getForChannel-JYSGpIY$default(Lcom/discord/icons/IconUrlUtils;Landroid/content/Context;Lcom/discord/primitives/ChannelId;Ljava/lang/String;ZLjava/lang/Integer;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    goto/16 :goto_13

    :sswitch_2
    const-string p1, "ACTIVITY_START"

    .line 24
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_16

    goto/16 :goto_13

    :sswitch_3
    const-string p1, "FORUM_THREAD_CREATED"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_17

    goto :goto_13

    :sswitch_4
    const-string p1, "APPLICATION_LIBRARY_INSTALL_COMPLETE"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_16

    goto :goto_13

    :sswitch_5
    const-string p1, "STAGE_INSTANCE_CREATE"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_17

    goto :goto_13

    :sswitch_6
    const-string p1, "RELATIONSHIP_ADD"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_16

    goto :goto_13

    .line 25
    :cond_16
    sget-object v3, Lcom/discord/icons/IconUrlUtils;->INSTANCE:Lcom/discord/icons/IconUrlUtils;

    .line 26
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getApplicationId-UtIrSio()Lcom/discord/primitives/ApplicationId;

    move-result-object v4

    .line 27
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getApplicationIcon()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x4

    const/4 v8, 0x0

    .line 28
    invoke-static/range {v3 .. v8}, Lcom/discord/icons/IconUrlUtils;->getApplicationIcon-weIltyw$default(Lcom/discord/icons/IconUrlUtils;Lcom/discord/primitives/ApplicationId;Ljava/lang/String;IILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    goto :goto_13

    :sswitch_7
    const-string p1, "GUILD_SCHEDULED_EVENT_UPDATE"

    .line 29
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_17

    goto :goto_13

    .line 30
    :cond_17
    sget-object v3, Lcom/discord/icons/IconUrlUtils;->INSTANCE:Lcom/discord/icons/IconUrlUtils;

    .line 31
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getGuildId-qOKuAAo()Lcom/discord/primitives/GuildId;

    move-result-object v4

    .line 32
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getGuildIcon()Ljava/lang/String;

    move-result-object v5

    const-string v6, ""

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/16 v9, 0x18

    const/4 v10, 0x0

    .line 33
    invoke-static/range {v3 .. v10}, Lcom/discord/icons/IconUrlUtils;->getForGuild-14CJxO4$default(Lcom/discord/icons/IconUrlUtils;Lcom/discord/primitives/GuildId;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    goto :goto_13

    :sswitch_8
    const-string p1, "GENERIC_PUSH_NOTIFICATION_SENT"

    .line 34
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_18

    goto :goto_13

    .line 35
    :cond_18
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getIconUrl()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_19

    goto :goto_13

    :cond_19
    move-object v2, p0

    :goto_13
    return-object v2

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
.end method

.method public static final getTitle(Lcom/discord/notifications/api/NotificationData;Landroid/content/Context;)Ljava/lang/CharSequence;
    .locals 6

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getType()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    const-string v4, ""

    const/4 v5, 0x1

    sparse-switch v1, :sswitch_data_0

    goto/16 :goto_12

    :sswitch_0
    const-string v1, "CALL_RING"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_12

    .line 2
    :cond_0
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getChannelType()Ljava/lang/Integer;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 3
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ne v0, v5, :cond_2

    .line 4
    sget-object p0, Lcom/discord/react_strings/I18nMessage;->INCOMING_CALL:Lcom/discord/react_strings/I18nMessage;

    invoke-static {p1, p0, v3, v2, v3}, Lcom/discord/react_strings/I18nUtilsKt;->i18nFormat$default(Landroid/content/Context;Lcom/discord/react_strings/I18nMessage;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object v4

    goto/16 :goto_12

    .line 5
    :cond_2
    :goto_0
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getChannelName()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_3

    goto/16 :goto_12

    :cond_3
    :goto_1
    move-object v4, p0

    goto/16 :goto_12

    :sswitch_1
    const-string p1, "MESSAGE_CREATE"

    .line 6
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto/16 :goto_12

    .line 7
    :cond_4
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getChannelType()Ljava/lang/Integer;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_5

    goto :goto_3

    .line 8
    :cond_5
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-nez v1, :cond_6

    :goto_2
    move v1, v5

    goto :goto_5

    :cond_6
    :goto_3
    if-nez p1, :cond_7

    goto :goto_4

    .line 9
    :cond_7
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne v1, v2, :cond_8

    goto :goto_2

    :cond_8
    :goto_4
    move v1, v0

    :goto_5
    if-eqz v1, :cond_9

    :goto_6
    move v1, v5

    goto :goto_8

    :cond_9
    if-nez p1, :cond_a

    goto :goto_7

    .line 10
    :cond_a
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v2, 0x5

    if-ne v1, v2, :cond_b

    goto :goto_6

    :cond_b
    :goto_7
    move v1, v0

    :goto_8
    if-eqz v1, :cond_c

    :goto_9
    move v1, v5

    goto :goto_b

    :cond_c
    if-nez p1, :cond_d

    goto :goto_a

    .line 11
    :cond_d
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/16 v2, 0xa

    if-ne v1, v2, :cond_e

    goto :goto_9

    :cond_e
    :goto_a
    move v1, v0

    :goto_b
    if-eqz v1, :cond_f

    :goto_c
    move v1, v5

    goto :goto_e

    :cond_f
    if-nez p1, :cond_10

    goto :goto_d

    .line 12
    :cond_10
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/16 v2, 0xb

    if-ne v1, v2, :cond_11

    goto :goto_c

    :cond_11
    :goto_d
    move v1, v0

    :goto_e
    if-eqz v1, :cond_12

    :goto_f
    move v0, v5

    goto :goto_10

    :cond_12
    if-nez p1, :cond_13

    goto :goto_10

    .line 13
    :cond_13
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/16 v2, 0xc

    if-ne v1, v2, :cond_14

    goto :goto_f

    :cond_14
    :goto_10
    if-eqz v0, :cond_15

    .line 14
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getGuildName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getChannelName()Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " #"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    goto/16 :goto_1

    :cond_15
    if-nez p1, :cond_16

    goto :goto_11

    .line 15
    :cond_16
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ne v0, v5, :cond_17

    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getUserUsername()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_3

    goto/16 :goto_12

    :cond_17
    :goto_11
    if-nez p1, :cond_18

    goto/16 :goto_12

    .line 16
    :cond_18
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_23

    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getChannelName()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_19

    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getUserUsername()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_3

    goto/16 :goto_12

    :cond_19
    move-object v4, p1

    goto/16 :goto_12

    :sswitch_2
    const-string v1, "ACTIVITY_START"

    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1a

    goto/16 :goto_12

    .line 18
    :cond_1a
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getActivityType()Ljava/lang/Integer;

    move-result-object p0

    if-nez p0, :cond_1b

    goto/16 :goto_12

    :cond_1b
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    if-nez p0, :cond_23

    .line 19
    sget-object p0, Lcom/discord/react_strings/I18nMessage;->NOTIFICATION_TITLE_START_GAME:Lcom/discord/react_strings/I18nMessage;

    invoke-static {p1, p0, v3, v2, v3}, Lcom/discord/react_strings/I18nUtilsKt;->i18nFormat$default(Landroid/content/Context;Lcom/discord/react_strings/I18nMessage;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object v4

    goto/16 :goto_12

    :sswitch_3
    const-string v1, "FORUM_THREAD_CREATED"

    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1c

    goto/16 :goto_12

    .line 21
    :cond_1c
    sget-object v0, Lcom/discord/react_strings/I18nMessage;->FORUM_CHANNEL_THREAD_CREATED_PUSH_TITLE_MOBILE:Lcom/discord/react_strings/I18nMessage;

    new-instance v1, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt$getTitle$2;

    invoke-direct {v1, p0}, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt$getTitle$2;-><init>(Lcom/discord/notifications/api/NotificationData;)V

    invoke-static {p1, v0, v1}, Lcom/discord/react_strings/I18nUtilsKt;->i18nFormat(Landroid/content/Context;Lcom/discord/react_strings/I18nMessage;Lkotlin/jvm/functions/Function1;)Ljava/lang/CharSequence;

    move-result-object v4

    goto/16 :goto_12

    :sswitch_4
    const-string p0, "APPLICATION_LIBRARY_INSTALL_COMPLETE"

    .line 22
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1d

    goto :goto_12

    .line 23
    :cond_1d
    sget-object p0, Lcom/discord/react_strings/I18nMessage;->GAME_LIBRARY_NOTIFICATION_GAME_INSTALLED_TITLE:Lcom/discord/react_strings/I18nMessage;

    invoke-static {p1, p0, v3, v2, v3}, Lcom/discord/react_strings/I18nUtilsKt;->i18nFormat$default(Landroid/content/Context;Lcom/discord/react_strings/I18nMessage;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object v4

    goto :goto_12

    :sswitch_5
    const-string v1, "STAGE_INSTANCE_CREATE"

    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1e

    goto :goto_12

    .line 25
    :cond_1e
    sget-object v0, Lcom/discord/react_strings/I18nMessage;->STAGE_START_PUSH_NOTIFICATION_TITLE:Lcom/discord/react_strings/I18nMessage;

    new-instance v1, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt$getTitle$1;

    invoke-direct {v1, p0}, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt$getTitle$1;-><init>(Lcom/discord/notifications/api/NotificationData;)V

    invoke-static {p1, v0, v1}, Lcom/discord/react_strings/I18nUtilsKt;->i18nFormat(Landroid/content/Context;Lcom/discord/react_strings/I18nMessage;Lkotlin/jvm/functions/Function1;)Ljava/lang/CharSequence;

    move-result-object v4

    goto :goto_12

    :sswitch_6
    const-string p1, "RELATIONSHIP_ADD"

    .line 26
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1f

    goto :goto_12

    .line 27
    :cond_1f
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getUserUsername()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_3

    goto :goto_12

    :sswitch_7
    const-string v1, "GUILD_SCHEDULED_EVENT_UPDATE"

    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_20

    goto :goto_12

    .line 29
    :cond_20
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getGuildScheduledEventEntityType()Ljava/lang/Integer;

    move-result-object v0

    if-nez v0, :cond_21

    goto :goto_12

    .line 30
    :cond_21
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ne v0, v5, :cond_23

    .line 31
    sget-object v0, Lcom/discord/react_strings/I18nMessage;->GUILD_SCHEDULED_EVENT_STAGE_START_TITLE:Lcom/discord/react_strings/I18nMessage;

    new-instance v1, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt$getTitle$3;

    invoke-direct {v1, p0}, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt$getTitle$3;-><init>(Lcom/discord/notifications/api/NotificationData;)V

    invoke-static {p1, v0, v1}, Lcom/discord/react_strings/I18nUtilsKt;->i18nFormat(Landroid/content/Context;Lcom/discord/react_strings/I18nMessage;Lkotlin/jvm/functions/Function1;)Ljava/lang/CharSequence;

    move-result-object v4

    goto :goto_12

    :sswitch_8
    const-string p1, "GENERIC_PUSH_NOTIFICATION_SENT"

    .line 32
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_22

    goto :goto_12

    .line 33
    :cond_22
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData;->getTitle()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_3

    :cond_23
    :goto_12
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
.end method

.method private static final toIconCompat(Landroid/graphics/Bitmap;)Landroidx/core/graphics/drawable/IconCompat;
    .locals 1

    invoke-static {p0}, Landroidx/core/graphics/drawable/IconCompat;->h(Landroid/graphics/Bitmap;)Landroidx/core/graphics/drawable/IconCompat;

    move-result-object p0

    const-string v0, "createWithBitmap(this)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method
