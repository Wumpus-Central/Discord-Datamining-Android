.class public final Lcom/discord/foreground_service/service/ServiceNotification;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\n\u0010\u0013\u001a\u00020\u0014*\u00020\u000bJ \u0010\u0015\u001a\u00020\u0014*\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000b2\u000c\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0018R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0018\u0010\t\u001a\u00020\n*\u00020\u000b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/discord/foreground_service/service/ServiceNotification;",
        "",
        "()V",
        "FOREGROUND_NOTIFICATION_CHANNEL",
        "",
        "FOREGROUND_NOTIFICATION_ID",
        "",
        "FOREGROUND_NOTIFICATION_LIMIT",
        "FOREGROUND_NOTIFICATION_TAG",
        "notificationManagerCompat",
        "Landroidx/core/app/NotificationManagerCompat;",
        "Landroid/content/Context;",
        "getNotificationManagerCompat",
        "(Landroid/content/Context;)Landroidx/core/app/NotificationManagerCompat;",
        "buildNotification",
        "Landroid/app/Notification;",
        "context",
        "serviceNotificationConfiguration",
        "Lcom/discord/foreground_service/service/ServiceNotificationConfiguration;",
        "clearNotifications",
        "",
        "startForegroundCompat",
        "Landroid/app/Service;",
        "serviceNotificationConfigurations",
        "",
        "foreground_service_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final FOREGROUND_NOTIFICATION_CHANNEL:Ljava/lang/String; = "mediaConnections"

.field private static final FOREGROUND_NOTIFICATION_ID:I = 0x2239

.field private static final FOREGROUND_NOTIFICATION_LIMIT:I = 0x5

.field private static final FOREGROUND_NOTIFICATION_TAG:Ljava/lang/String; = "FOREGROUND_NOTIFICATION_TAG"

.field public static final INSTANCE:Lcom/discord/foreground_service/service/ServiceNotification;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/discord/foreground_service/service/ServiceNotification;

    invoke-direct {v0}, Lcom/discord/foreground_service/service/ServiceNotification;-><init>()V

    sput-object v0, Lcom/discord/foreground_service/service/ServiceNotification;->INSTANCE:Lcom/discord/foreground_service/service/ServiceNotification;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final buildNotification(Landroid/content/Context;Lcom/discord/foreground_service/service/ServiceNotificationConfiguration;)Landroid/app/Notification;
    .locals 9

    .line 1
    new-instance v0, Landroidx/core/app/NotificationCompat$Builder;

    .line 2
    .line 3
    const-string v1, "mediaConnections"

    .line 4
    .line 5
    invoke-direct {v0, p1, v1}, Landroidx/core/app/NotificationCompat$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p2}, Lcom/discord/foreground_service/service/ServiceNotificationConfiguration;->getTitle()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$Builder;->E(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {p2}, Lcom/discord/foreground_service/service/ServiceNotificationConfiguration;->getContent()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$Builder;->D(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {p2}, Lcom/discord/foreground_service/service/ServiceNotificationConfiguration;->getContentAction()Lcom/discord/foreground_service/service/ServiceNotificationConfiguration$Action;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    new-instance v2, Lcom/discord/notifications/actions/intents/GenericAction;

    .line 31
    .line 32
    invoke-virtual {v1}, Lcom/discord/foreground_service/service/ServiceNotificationConfiguration$Action;->getTag()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-virtual {v1}, Lcom/discord/foreground_service/service/ServiceNotificationConfiguration$Action;->getTaskName()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    invoke-virtual {v1}, Lcom/discord/foreground_service/service/ServiceNotificationConfiguration$Action;->getData()Ljava/util/Map;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-direct {v2, v3, v4, v1}, Lcom/discord/notifications/actions/intents/GenericAction;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    .line 45
    .line 46
    .line 47
    const/4 v4, 0x0

    .line 48
    const/4 v5, 0x1

    .line 49
    const/4 v6, 0x2

    .line 50
    const/4 v7, 0x0

    .line 51
    move-object v3, p1

    .line 52
    invoke-static/range {v2 .. v7}, Lcom/discord/notifications/actions/intents/NotificationAction$DefaultImpls;->toPendingIntent$default(Lcom/discord/notifications/actions/intents/NotificationAction;Landroid/content/Context;IZILjava/lang/Object;)Landroid/app/PendingIntent;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    goto :goto_0

    .line 57
    :cond_0
    const/4 v1, 0x0

    .line 58
    :goto_0
    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$Builder;->C(Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Builder;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    sget v1, Lcom/discord/foreground_service/R$drawable;->ic_notification_24dp:I

    .line 63
    .line 64
    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$Builder;->Z(I)Landroidx/core/app/NotificationCompat$Builder;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    const/4 v1, 0x1

    .line 69
    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$Builder;->Q(Z)Landroidx/core/app/NotificationCompat$Builder;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$Builder;->Y(Z)Landroidx/core/app/NotificationCompat$Builder;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {p2}, Lcom/discord/foreground_service/service/ServiceNotificationConfiguration;->getAuxiliaryActions()Ljava/util/List;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 82
    .line 83
    .line 84
    move-result-object p2

    .line 85
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    if-eqz v1, :cond_1

    .line 90
    .line 91
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    check-cast v1, Lcom/discord/foreground_service/service/ServiceNotificationConfiguration$Action;

    .line 96
    .line 97
    invoke-virtual {v1}, Lcom/discord/foreground_service/service/ServiceNotificationConfiguration$Action;->getTitle()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    new-instance v3, Lcom/discord/notifications/actions/intents/GenericAction;

    .line 102
    .line 103
    invoke-virtual {v1}, Lcom/discord/foreground_service/service/ServiceNotificationConfiguration$Action;->getTag()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    invoke-virtual {v1}, Lcom/discord/foreground_service/service/ServiceNotificationConfiguration$Action;->getTaskName()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v5

    .line 111
    invoke-virtual {v1}, Lcom/discord/foreground_service/service/ServiceNotificationConfiguration$Action;->getData()Ljava/util/Map;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    invoke-direct {v3, v4, v5, v1}, Lcom/discord/notifications/actions/intents/GenericAction;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    .line 116
    .line 117
    .line 118
    const/4 v5, 0x0

    .line 119
    const/4 v6, 0x0

    .line 120
    const/4 v7, 0x2

    .line 121
    const/4 v8, 0x0

    .line 122
    move-object v4, p1

    .line 123
    invoke-static/range {v3 .. v8}, Lcom/discord/notifications/actions/intents/NotificationAction$DefaultImpls;->toPendingIntent$default(Lcom/discord/notifications/actions/intents/NotificationAction;Landroid/content/Context;IZILjava/lang/Object;)Landroid/app/PendingIntent;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    const/4 v3, 0x0

    .line 128
    invoke-virtual {v0, v3, v2, v1}, Landroidx/core/app/NotificationCompat$Builder;->a(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Builder;

    .line 129
    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_1
    invoke-virtual {v0}, Landroidx/core/app/NotificationCompat$Builder;->g()Landroid/app/Notification;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    const-string p2, "Builder(context, FOREGRO\u2026   }\n            .build()"

    .line 137
    .line 138
    invoke-static {p1, p2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    return-object p1
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
.end method

.method private final getNotificationManagerCompat(Landroid/content/Context;)Landroidx/core/app/NotificationManagerCompat;
    .locals 1

    invoke-static {p1}, Landroidx/core/app/NotificationManagerCompat;->g(Landroid/content/Context;)Landroidx/core/app/NotificationManagerCompat;

    move-result-object p1

    const-string v0, "from(this)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method


# virtual methods
.method public final clearNotifications(Landroid/content/Context;)V
    .locals 4

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lkotlin/ranges/IntRange;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x5

    .line 10
    invoke-direct {v0, v1, v2}, Lkotlin/ranges/IntRange;-><init>(II)V

    .line 11
    .line 12
    .line 13
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    move-object v1, v0

    .line 24
    check-cast v1, Lmf/p;

    .line 25
    .line 26
    invoke-virtual {v1}, Lmf/p;->nextInt()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    sget-object v2, Lcom/discord/foreground_service/service/ServiceNotification;->INSTANCE:Lcom/discord/foreground_service/service/ServiceNotification;

    .line 31
    .line 32
    invoke-direct {v2, p1}, Lcom/discord/foreground_service/service/ServiceNotification;->getNotificationManagerCompat(Landroid/content/Context;)Landroidx/core/app/NotificationManagerCompat;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    const-string v3, "FOREGROUND_NOTIFICATION_TAG"

    .line 37
    .line 38
    invoke-virtual {v2, v3, v1}, Landroidx/core/app/NotificationManagerCompat;->b(Ljava/lang/String;I)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    return-void
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

.method public final startForegroundCompat(Landroid/app/Service;Landroid/content/Context;Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Service;",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Lcom/discord/foreground_service/service/ServiceNotificationConfiguration;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "context"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "serviceNotificationConfigurations"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Lcom/discord/foreground_service/service/ServiceNotification$startForegroundCompat$$inlined$sortedBy$1;

    .line 17
    .line 18
    invoke-direct {v0}, Lcom/discord/foreground_service/service/ServiceNotification$startForegroundCompat$$inlined$sortedBy$1;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-static {p3, v0}, Lkotlin/collections/h;->w0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object p3

    .line 25
    invoke-static {p3}, Lkotlin/collections/h;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Lcom/discord/foreground_service/service/ServiceNotificationConfiguration;

    .line 30
    .line 31
    const/4 v1, 0x1

    .line 32
    invoke-static {p3, v1}, Lkotlin/collections/h;->O(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 33
    .line 34
    .line 35
    move-result-object p3

    .line 36
    const/16 v1, 0x2239

    .line 37
    .line 38
    invoke-direct {p0, p2, v0}, Lcom/discord/foreground_service/service/ServiceNotification;->buildNotification(Landroid/content/Context;Lcom/discord/foreground_service/service/ServiceNotificationConfiguration;)Landroid/app/Notification;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-static {p1, v1, v0}, Lcom/discord/foreground_service/utils/ForegroundServiceUtilsKt;->startForegroundCompat(Landroid/app/Service;ILandroid/app/Notification;)V

    .line 43
    .line 44
    .line 45
    new-instance v0, Lkotlin/ranges/IntRange;

    .line 46
    .line 47
    const/4 v1, 0x0

    .line 48
    const/4 v2, 0x5

    .line 49
    invoke-direct {v0, v1, v2}, Lkotlin/ranges/IntRange;-><init>(II)V

    .line 50
    .line 51
    .line 52
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-eqz v1, :cond_1

    .line 61
    .line 62
    move-object v1, v0

    .line 63
    check-cast v1, Lmf/p;

    .line 64
    .line 65
    invoke-virtual {v1}, Lmf/p;->nextInt()I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    invoke-static {p3, v1}, Lkotlin/collections/h;->X(Ljava/util/List;I)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    check-cast v2, Lcom/discord/foreground_service/service/ServiceNotificationConfiguration;

    .line 74
    .line 75
    const-string v3, "FOREGROUND_NOTIFICATION_TAG"

    .line 76
    .line 77
    if-eqz v2, :cond_0

    .line 78
    .line 79
    sget-object v4, Lcom/discord/foreground_service/service/ServiceNotification;->INSTANCE:Lcom/discord/foreground_service/service/ServiceNotification;

    .line 80
    .line 81
    invoke-direct {v4, p2, v2}, Lcom/discord/foreground_service/service/ServiceNotification;->buildNotification(Landroid/content/Context;Lcom/discord/foreground_service/service/ServiceNotificationConfiguration;)Landroid/app/Notification;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    invoke-direct {v4, p1}, Lcom/discord/foreground_service/service/ServiceNotification;->getNotificationManagerCompat(Landroid/content/Context;)Landroidx/core/app/NotificationManagerCompat;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    invoke-virtual {v4, v3, v1, v2}, Landroidx/core/app/NotificationManagerCompat;->m(Ljava/lang/String;ILandroid/app/Notification;)V

    .line 90
    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_0
    sget-object v2, Lcom/discord/foreground_service/service/ServiceNotification;->INSTANCE:Lcom/discord/foreground_service/service/ServiceNotification;

    .line 94
    .line 95
    invoke-direct {v2, p1}, Lcom/discord/foreground_service/service/ServiceNotification;->getNotificationManagerCompat(Landroid/content/Context;)Landroidx/core/app/NotificationManagerCompat;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    invoke-virtual {v2, v3, v1}, Landroidx/core/app/NotificationManagerCompat;->b(Ljava/lang/String;I)V

    .line 100
    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_1
    return-void
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
