.class Landroidx/core/app/u2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/core/app/m;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Landroid/app/Notification$Builder;

.field private final c:Landroidx/core/app/NotificationCompat$Builder;

.field private d:Landroid/widget/RemoteViews;

.field private e:Landroid/widget/RemoteViews;

.field private final f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/os/Bundle;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Landroid/os/Bundle;

.field private h:I

.field private i:Landroid/widget/RemoteViews;


# direct methods
.method constructor <init>(Landroidx/core/app/NotificationCompat$Builder;)V
    .locals 13

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroidx/core/app/u2;->f:Ljava/util/List;

    .line 10
    .line 11
    new-instance v0, Landroid/os/Bundle;

    .line 12
    .line 13
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Landroidx/core/app/u2;->g:Landroid/os/Bundle;

    .line 17
    .line 18
    iput-object p1, p0, Landroidx/core/app/u2;->c:Landroidx/core/app/NotificationCompat$Builder;

    .line 19
    .line 20
    iget-object v0, p1, Landroidx/core/app/NotificationCompat$Builder;->a:Landroid/content/Context;

    .line 21
    .line 22
    iput-object v0, p0, Landroidx/core/app/u2;->a:Landroid/content/Context;

    .line 23
    .line 24
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 25
    .line 26
    const/16 v1, 0x1a

    .line 27
    .line 28
    if-lt v0, v1, :cond_0

    .line 29
    .line 30
    new-instance v0, Landroid/app/Notification$Builder;

    .line 31
    .line 32
    iget-object v2, p1, Landroidx/core/app/NotificationCompat$Builder;->a:Landroid/content/Context;

    .line 33
    .line 34
    iget-object v3, p1, Landroidx/core/app/NotificationCompat$Builder;->L:Ljava/lang/String;

    .line 35
    .line 36
    invoke-direct {v0, v2, v3}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    iput-object v0, p0, Landroidx/core/app/u2;->b:Landroid/app/Notification$Builder;

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    new-instance v0, Landroid/app/Notification$Builder;

    .line 43
    .line 44
    iget-object v2, p1, Landroidx/core/app/NotificationCompat$Builder;->a:Landroid/content/Context;

    .line 45
    .line 46
    invoke-direct {v0, v2}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;)V

    .line 47
    .line 48
    .line 49
    iput-object v0, p0, Landroidx/core/app/u2;->b:Landroid/app/Notification$Builder;

    .line 50
    .line 51
    :goto_0
    iget-object v0, p1, Landroidx/core/app/NotificationCompat$Builder;->U:Landroid/app/Notification;

    .line 52
    .line 53
    iget-object v2, p0, Landroidx/core/app/u2;->b:Landroid/app/Notification$Builder;

    .line 54
    .line 55
    iget-wide v3, v0, Landroid/app/Notification;->when:J

    .line 56
    .line 57
    invoke-virtual {v2, v3, v4}, Landroid/app/Notification$Builder;->setWhen(J)Landroid/app/Notification$Builder;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    iget v3, v0, Landroid/app/Notification;->icon:I

    .line 62
    .line 63
    iget v4, v0, Landroid/app/Notification;->iconLevel:I

    .line 64
    .line 65
    invoke-virtual {v2, v3, v4}, Landroid/app/Notification$Builder;->setSmallIcon(II)Landroid/app/Notification$Builder;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    iget-object v3, v0, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    .line 70
    .line 71
    invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setContent(Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    iget-object v3, v0, Landroid/app/Notification;->tickerText:Ljava/lang/CharSequence;

    .line 76
    .line 77
    iget-object v4, p1, Landroidx/core/app/NotificationCompat$Builder;->i:Landroid/widget/RemoteViews;

    .line 78
    .line 79
    invoke-virtual {v2, v3, v4}, Landroid/app/Notification$Builder;->setTicker(Ljava/lang/CharSequence;Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    iget-object v3, v0, Landroid/app/Notification;->vibrate:[J

    .line 84
    .line 85
    invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setVibrate([J)Landroid/app/Notification$Builder;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    iget v3, v0, Landroid/app/Notification;->ledARGB:I

    .line 90
    .line 91
    iget v4, v0, Landroid/app/Notification;->ledOnMS:I

    .line 92
    .line 93
    iget v5, v0, Landroid/app/Notification;->ledOffMS:I

    .line 94
    .line 95
    invoke-virtual {v2, v3, v4, v5}, Landroid/app/Notification$Builder;->setLights(III)Landroid/app/Notification$Builder;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    iget v3, v0, Landroid/app/Notification;->flags:I

    .line 100
    .line 101
    const/4 v4, 0x2

    .line 102
    and-int/2addr v3, v4

    .line 103
    const/4 v5, 0x1

    .line 104
    const/4 v6, 0x0

    .line 105
    if-eqz v3, :cond_1

    .line 106
    .line 107
    move v3, v5

    .line 108
    goto :goto_1

    .line 109
    :cond_1
    move v3, v6

    .line 110
    :goto_1
    invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setOngoing(Z)Landroid/app/Notification$Builder;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    iget v3, v0, Landroid/app/Notification;->flags:I

    .line 115
    .line 116
    and-int/lit8 v3, v3, 0x8

    .line 117
    .line 118
    if-eqz v3, :cond_2

    .line 119
    .line 120
    move v3, v5

    .line 121
    goto :goto_2

    .line 122
    :cond_2
    move v3, v6

    .line 123
    :goto_2
    invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setOnlyAlertOnce(Z)Landroid/app/Notification$Builder;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    iget v3, v0, Landroid/app/Notification;->flags:I

    .line 128
    .line 129
    and-int/lit8 v3, v3, 0x10

    .line 130
    .line 131
    if-eqz v3, :cond_3

    .line 132
    .line 133
    move v3, v5

    .line 134
    goto :goto_3

    .line 135
    :cond_3
    move v3, v6

    .line 136
    :goto_3
    invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setAutoCancel(Z)Landroid/app/Notification$Builder;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    iget v3, v0, Landroid/app/Notification;->defaults:I

    .line 141
    .line 142
    invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setDefaults(I)Landroid/app/Notification$Builder;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    iget-object v3, p1, Landroidx/core/app/NotificationCompat$Builder;->e:Ljava/lang/CharSequence;

    .line 147
    .line 148
    invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    iget-object v3, p1, Landroidx/core/app/NotificationCompat$Builder;->f:Ljava/lang/CharSequence;

    .line 153
    .line 154
    invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    iget-object v3, p1, Landroidx/core/app/NotificationCompat$Builder;->k:Ljava/lang/CharSequence;

    .line 159
    .line 160
    invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setContentInfo(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    iget-object v3, p1, Landroidx/core/app/NotificationCompat$Builder;->g:Landroid/app/PendingIntent;

    .line 165
    .line 166
    invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    iget-object v3, v0, Landroid/app/Notification;->deleteIntent:Landroid/app/PendingIntent;

    .line 171
    .line 172
    invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setDeleteIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    iget-object v3, p1, Landroidx/core/app/NotificationCompat$Builder;->h:Landroid/app/PendingIntent;

    .line 177
    .line 178
    iget v7, v0, Landroid/app/Notification;->flags:I

    .line 179
    .line 180
    and-int/lit16 v7, v7, 0x80

    .line 181
    .line 182
    if-eqz v7, :cond_4

    .line 183
    .line 184
    move v7, v5

    .line 185
    goto :goto_4

    .line 186
    :cond_4
    move v7, v6

    .line 187
    :goto_4
    invoke-virtual {v2, v3, v7}, Landroid/app/Notification$Builder;->setFullScreenIntent(Landroid/app/PendingIntent;Z)Landroid/app/Notification$Builder;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    iget-object v3, p1, Landroidx/core/app/NotificationCompat$Builder;->j:Landroid/graphics/Bitmap;

    .line 192
    .line 193
    invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setLargeIcon(Landroid/graphics/Bitmap;)Landroid/app/Notification$Builder;

    .line 194
    .line 195
    .line 196
    move-result-object v2

    .line 197
    iget v3, p1, Landroidx/core/app/NotificationCompat$Builder;->l:I

    .line 198
    .line 199
    invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setNumber(I)Landroid/app/Notification$Builder;

    .line 200
    .line 201
    .line 202
    move-result-object v2

    .line 203
    iget v3, p1, Landroidx/core/app/NotificationCompat$Builder;->u:I

    .line 204
    .line 205
    iget v7, p1, Landroidx/core/app/NotificationCompat$Builder;->v:I

    .line 206
    .line 207
    iget-boolean v8, p1, Landroidx/core/app/NotificationCompat$Builder;->w:Z

    .line 208
    .line 209
    invoke-virtual {v2, v3, v7, v8}, Landroid/app/Notification$Builder;->setProgress(IIZ)Landroid/app/Notification$Builder;

    .line 210
    .line 211
    .line 212
    iget-object v2, p0, Landroidx/core/app/u2;->b:Landroid/app/Notification$Builder;

    .line 213
    .line 214
    iget-object v3, p1, Landroidx/core/app/NotificationCompat$Builder;->r:Ljava/lang/CharSequence;

    .line 215
    .line 216
    invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setSubText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 217
    .line 218
    .line 219
    move-result-object v2

    .line 220
    iget-boolean v3, p1, Landroidx/core/app/NotificationCompat$Builder;->o:Z

    .line 221
    .line 222
    invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setUsesChronometer(Z)Landroid/app/Notification$Builder;

    .line 223
    .line 224
    .line 225
    move-result-object v2

    .line 226
    iget v3, p1, Landroidx/core/app/NotificationCompat$Builder;->m:I

    .line 227
    .line 228
    invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setPriority(I)Landroid/app/Notification$Builder;

    .line 229
    .line 230
    .line 231
    iget-object v2, p1, Landroidx/core/app/NotificationCompat$Builder;->b:Ljava/util/ArrayList;

    .line 232
    .line 233
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 234
    .line 235
    .line 236
    move-result-object v2

    .line 237
    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 238
    .line 239
    .line 240
    move-result v3

    .line 241
    if-eqz v3, :cond_5

    .line 242
    .line 243
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v3

    .line 247
    check-cast v3, Landroidx/core/app/NotificationCompat$Action;

    .line 248
    .line 249
    invoke-direct {p0, v3}, Landroidx/core/app/u2;->b(Landroidx/core/app/NotificationCompat$Action;)V

    .line 250
    .line 251
    .line 252
    goto :goto_5

    .line 253
    :cond_5
    iget-object v2, p1, Landroidx/core/app/NotificationCompat$Builder;->E:Landroid/os/Bundle;

    .line 254
    .line 255
    if-eqz v2, :cond_6

    .line 256
    .line 257
    iget-object v3, p0, Landroidx/core/app/u2;->g:Landroid/os/Bundle;

    .line 258
    .line 259
    invoke-virtual {v3, v2}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 260
    .line 261
    .line 262
    :cond_6
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 263
    .line 264
    iget-object v3, p1, Landroidx/core/app/NotificationCompat$Builder;->I:Landroid/widget/RemoteViews;

    .line 265
    .line 266
    iput-object v3, p0, Landroidx/core/app/u2;->d:Landroid/widget/RemoteViews;

    .line 267
    .line 268
    iget-object v3, p1, Landroidx/core/app/NotificationCompat$Builder;->J:Landroid/widget/RemoteViews;

    .line 269
    .line 270
    iput-object v3, p0, Landroidx/core/app/u2;->e:Landroid/widget/RemoteViews;

    .line 271
    .line 272
    iget-object v3, p0, Landroidx/core/app/u2;->b:Landroid/app/Notification$Builder;

    .line 273
    .line 274
    iget-boolean v7, p1, Landroidx/core/app/NotificationCompat$Builder;->n:Z

    .line 275
    .line 276
    invoke-virtual {v3, v7}, Landroid/app/Notification$Builder;->setShowWhen(Z)Landroid/app/Notification$Builder;

    .line 277
    .line 278
    .line 279
    iget-object v3, p0, Landroidx/core/app/u2;->b:Landroid/app/Notification$Builder;

    .line 280
    .line 281
    iget-boolean v7, p1, Landroidx/core/app/NotificationCompat$Builder;->A:Z

    .line 282
    .line 283
    invoke-virtual {v3, v7}, Landroid/app/Notification$Builder;->setLocalOnly(Z)Landroid/app/Notification$Builder;

    .line 284
    .line 285
    .line 286
    move-result-object v3

    .line 287
    iget-object v7, p1, Landroidx/core/app/NotificationCompat$Builder;->x:Ljava/lang/String;

    .line 288
    .line 289
    invoke-virtual {v3, v7}, Landroid/app/Notification$Builder;->setGroup(Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 290
    .line 291
    .line 292
    move-result-object v3

    .line 293
    iget-boolean v7, p1, Landroidx/core/app/NotificationCompat$Builder;->y:Z

    .line 294
    .line 295
    invoke-virtual {v3, v7}, Landroid/app/Notification$Builder;->setGroupSummary(Z)Landroid/app/Notification$Builder;

    .line 296
    .line 297
    .line 298
    move-result-object v3

    .line 299
    iget-object v7, p1, Landroidx/core/app/NotificationCompat$Builder;->z:Ljava/lang/String;

    .line 300
    .line 301
    invoke-virtual {v3, v7}, Landroid/app/Notification$Builder;->setSortKey(Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 302
    .line 303
    .line 304
    iget v3, p1, Landroidx/core/app/NotificationCompat$Builder;->Q:I

    .line 305
    .line 306
    iput v3, p0, Landroidx/core/app/u2;->h:I

    .line 307
    .line 308
    iget-object v3, p0, Landroidx/core/app/u2;->b:Landroid/app/Notification$Builder;

    .line 309
    .line 310
    iget-object v7, p1, Landroidx/core/app/NotificationCompat$Builder;->D:Ljava/lang/String;

    .line 311
    .line 312
    invoke-virtual {v3, v7}, Landroid/app/Notification$Builder;->setCategory(Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 313
    .line 314
    .line 315
    move-result-object v3

    .line 316
    iget v7, p1, Landroidx/core/app/NotificationCompat$Builder;->F:I

    .line 317
    .line 318
    invoke-virtual {v3, v7}, Landroid/app/Notification$Builder;->setColor(I)Landroid/app/Notification$Builder;

    .line 319
    .line 320
    .line 321
    move-result-object v3

    .line 322
    iget v7, p1, Landroidx/core/app/NotificationCompat$Builder;->G:I

    .line 323
    .line 324
    invoke-virtual {v3, v7}, Landroid/app/Notification$Builder;->setVisibility(I)Landroid/app/Notification$Builder;

    .line 325
    .line 326
    .line 327
    move-result-object v3

    .line 328
    iget-object v7, p1, Landroidx/core/app/NotificationCompat$Builder;->H:Landroid/app/Notification;

    .line 329
    .line 330
    invoke-virtual {v3, v7}, Landroid/app/Notification$Builder;->setPublicVersion(Landroid/app/Notification;)Landroid/app/Notification$Builder;

    .line 331
    .line 332
    .line 333
    move-result-object v3

    .line 334
    iget-object v7, v0, Landroid/app/Notification;->sound:Landroid/net/Uri;

    .line 335
    .line 336
    iget-object v8, v0, Landroid/app/Notification;->audioAttributes:Landroid/media/AudioAttributes;

    .line 337
    .line 338
    invoke-virtual {v3, v7, v8}, Landroid/app/Notification$Builder;->setSound(Landroid/net/Uri;Landroid/media/AudioAttributes;)Landroid/app/Notification$Builder;

    .line 339
    .line 340
    .line 341
    const/16 v3, 0x1c

    .line 342
    .line 343
    if-ge v2, v3, :cond_7

    .line 344
    .line 345
    iget-object v2, p1, Landroidx/core/app/NotificationCompat$Builder;->c:Ljava/util/ArrayList;

    .line 346
    .line 347
    invoke-static {v2}, Landroidx/core/app/u2;->g(Ljava/util/List;)Ljava/util/List;

    .line 348
    .line 349
    .line 350
    move-result-object v2

    .line 351
    iget-object v7, p1, Landroidx/core/app/NotificationCompat$Builder;->X:Ljava/util/ArrayList;

    .line 352
    .line 353
    invoke-static {v2, v7}, Landroidx/core/app/u2;->e(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    .line 354
    .line 355
    .line 356
    move-result-object v2

    .line 357
    goto :goto_6

    .line 358
    :cond_7
    iget-object v2, p1, Landroidx/core/app/NotificationCompat$Builder;->X:Ljava/util/ArrayList;

    .line 359
    .line 360
    :goto_6
    if-eqz v2, :cond_8

    .line 361
    .line 362
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 363
    .line 364
    .line 365
    move-result v7

    .line 366
    if-nez v7, :cond_8

    .line 367
    .line 368
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 369
    .line 370
    .line 371
    move-result-object v2

    .line 372
    :goto_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 373
    .line 374
    .line 375
    move-result v7

    .line 376
    if-eqz v7, :cond_8

    .line 377
    .line 378
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 379
    .line 380
    .line 381
    move-result-object v7

    .line 382
    check-cast v7, Ljava/lang/String;

    .line 383
    .line 384
    iget-object v8, p0, Landroidx/core/app/u2;->b:Landroid/app/Notification$Builder;

    .line 385
    .line 386
    invoke-virtual {v8, v7}, Landroid/app/Notification$Builder;->addPerson(Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 387
    .line 388
    .line 389
    goto :goto_7

    .line 390
    :cond_8
    iget-object v2, p1, Landroidx/core/app/NotificationCompat$Builder;->K:Landroid/widget/RemoteViews;

    .line 391
    .line 392
    iput-object v2, p0, Landroidx/core/app/u2;->i:Landroid/widget/RemoteViews;

    .line 393
    .line 394
    iget-object v2, p1, Landroidx/core/app/NotificationCompat$Builder;->d:Ljava/util/ArrayList;

    .line 395
    .line 396
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 397
    .line 398
    .line 399
    move-result v2

    .line 400
    if-lez v2, :cond_b

    .line 401
    .line 402
    invoke-virtual {p1}, Landroidx/core/app/NotificationCompat$Builder;->l()Landroid/os/Bundle;

    .line 403
    .line 404
    .line 405
    move-result-object v2

    .line 406
    const-string v7, "android.car.EXTENSIONS"

    .line 407
    .line 408
    invoke-virtual {v2, v7}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 409
    .line 410
    .line 411
    move-result-object v2

    .line 412
    if-nez v2, :cond_9

    .line 413
    .line 414
    new-instance v2, Landroid/os/Bundle;

    .line 415
    .line 416
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 417
    .line 418
    .line 419
    :cond_9
    new-instance v8, Landroid/os/Bundle;

    .line 420
    .line 421
    invoke-direct {v8, v2}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 422
    .line 423
    .line 424
    new-instance v9, Landroid/os/Bundle;

    .line 425
    .line 426
    invoke-direct {v9}, Landroid/os/Bundle;-><init>()V

    .line 427
    .line 428
    .line 429
    move v10, v6

    .line 430
    :goto_8
    iget-object v11, p1, Landroidx/core/app/NotificationCompat$Builder;->d:Ljava/util/ArrayList;

    .line 431
    .line 432
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 433
    .line 434
    .line 435
    move-result v11

    .line 436
    if-ge v10, v11, :cond_a

    .line 437
    .line 438
    invoke-static {v10}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 439
    .line 440
    .line 441
    move-result-object v11

    .line 442
    iget-object v12, p1, Landroidx/core/app/NotificationCompat$Builder;->d:Ljava/util/ArrayList;

    .line 443
    .line 444
    invoke-virtual {v12, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    move-result-object v12

    .line 448
    check-cast v12, Landroidx/core/app/NotificationCompat$Action;

    .line 449
    .line 450
    invoke-static {v12}, Landroidx/core/app/v2;->e(Landroidx/core/app/NotificationCompat$Action;)Landroid/os/Bundle;

    .line 451
    .line 452
    .line 453
    move-result-object v12

    .line 454
    invoke-virtual {v9, v11, v12}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 455
    .line 456
    .line 457
    add-int/lit8 v10, v10, 0x1

    .line 458
    .line 459
    goto :goto_8

    .line 460
    :cond_a
    const-string v10, "invisible_actions"

    .line 461
    .line 462
    invoke-virtual {v2, v10, v9}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 463
    .line 464
    .line 465
    invoke-virtual {v8, v10, v9}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 466
    .line 467
    .line 468
    invoke-virtual {p1}, Landroidx/core/app/NotificationCompat$Builder;->l()Landroid/os/Bundle;

    .line 469
    .line 470
    .line 471
    move-result-object v9

    .line 472
    invoke-virtual {v9, v7, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 473
    .line 474
    .line 475
    iget-object v2, p0, Landroidx/core/app/u2;->g:Landroid/os/Bundle;

    .line 476
    .line 477
    invoke-virtual {v2, v7, v8}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 478
    .line 479
    .line 480
    :cond_b
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 481
    .line 482
    iget-object v7, p1, Landroidx/core/app/NotificationCompat$Builder;->W:Landroid/graphics/drawable/Icon;

    .line 483
    .line 484
    if-eqz v7, :cond_c

    .line 485
    .line 486
    iget-object v8, p0, Landroidx/core/app/u2;->b:Landroid/app/Notification$Builder;

    .line 487
    .line 488
    invoke-virtual {v8, v7}, Landroid/app/Notification$Builder;->setSmallIcon(Landroid/graphics/drawable/Icon;)Landroid/app/Notification$Builder;

    .line 489
    .line 490
    .line 491
    :cond_c
    const/16 v7, 0x18

    .line 492
    .line 493
    if-lt v2, v7, :cond_f

    .line 494
    .line 495
    iget-object v7, p0, Landroidx/core/app/u2;->b:Landroid/app/Notification$Builder;

    .line 496
    .line 497
    iget-object v8, p1, Landroidx/core/app/NotificationCompat$Builder;->E:Landroid/os/Bundle;

    .line 498
    .line 499
    invoke-virtual {v7, v8}, Landroid/app/Notification$Builder;->setExtras(Landroid/os/Bundle;)Landroid/app/Notification$Builder;

    .line 500
    .line 501
    .line 502
    move-result-object v7

    .line 503
    iget-object v8, p1, Landroidx/core/app/NotificationCompat$Builder;->t:[Ljava/lang/CharSequence;

    .line 504
    .line 505
    invoke-static {v7, v8}, Landroidx/core/app/b2;->a(Landroid/app/Notification$Builder;[Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 506
    .line 507
    .line 508
    iget-object v7, p1, Landroidx/core/app/NotificationCompat$Builder;->I:Landroid/widget/RemoteViews;

    .line 509
    .line 510
    if-eqz v7, :cond_d

    .line 511
    .line 512
    iget-object v8, p0, Landroidx/core/app/u2;->b:Landroid/app/Notification$Builder;

    .line 513
    .line 514
    invoke-static {v8, v7}, Landroidx/core/app/r2;->a(Landroid/app/Notification$Builder;Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;

    .line 515
    .line 516
    .line 517
    :cond_d
    iget-object v7, p1, Landroidx/core/app/NotificationCompat$Builder;->J:Landroid/widget/RemoteViews;

    .line 518
    .line 519
    if-eqz v7, :cond_e

    .line 520
    .line 521
    iget-object v8, p0, Landroidx/core/app/u2;->b:Landroid/app/Notification$Builder;

    .line 522
    .line 523
    invoke-static {v8, v7}, Landroidx/core/app/s2;->a(Landroid/app/Notification$Builder;Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;

    .line 524
    .line 525
    .line 526
    :cond_e
    iget-object v7, p1, Landroidx/core/app/NotificationCompat$Builder;->K:Landroid/widget/RemoteViews;

    .line 527
    .line 528
    if-eqz v7, :cond_f

    .line 529
    .line 530
    iget-object v8, p0, Landroidx/core/app/u2;->b:Landroid/app/Notification$Builder;

    .line 531
    .line 532
    invoke-static {v8, v7}, Landroidx/core/app/t2;->a(Landroid/app/Notification$Builder;Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;

    .line 533
    .line 534
    .line 535
    :cond_f
    const/4 v7, 0x0

    .line 536
    if-lt v2, v1, :cond_11

    .line 537
    .line 538
    iget-object v8, p0, Landroidx/core/app/u2;->b:Landroid/app/Notification$Builder;

    .line 539
    .line 540
    iget v9, p1, Landroidx/core/app/NotificationCompat$Builder;->M:I

    .line 541
    .line 542
    invoke-static {v8, v9}, Landroidx/core/app/c2;->a(Landroid/app/Notification$Builder;I)Landroid/app/Notification$Builder;

    .line 543
    .line 544
    .line 545
    move-result-object v8

    .line 546
    iget-object v9, p1, Landroidx/core/app/NotificationCompat$Builder;->s:Ljava/lang/CharSequence;

    .line 547
    .line 548
    invoke-static {v8, v9}, Landroidx/core/app/d2;->a(Landroid/app/Notification$Builder;Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 549
    .line 550
    .line 551
    move-result-object v8

    .line 552
    iget-object v9, p1, Landroidx/core/app/NotificationCompat$Builder;->N:Ljava/lang/String;

    .line 553
    .line 554
    invoke-static {v8, v9}, Landroidx/core/app/e2;->a(Landroid/app/Notification$Builder;Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 555
    .line 556
    .line 557
    move-result-object v8

    .line 558
    iget-wide v9, p1, Landroidx/core/app/NotificationCompat$Builder;->P:J

    .line 559
    .line 560
    invoke-static {v8, v9, v10}, Landroidx/core/app/f2;->a(Landroid/app/Notification$Builder;J)Landroid/app/Notification$Builder;

    .line 561
    .line 562
    .line 563
    move-result-object v8

    .line 564
    iget v9, p1, Landroidx/core/app/NotificationCompat$Builder;->Q:I

    .line 565
    .line 566
    invoke-static {v8, v9}, Landroidx/core/app/q2;->a(Landroid/app/Notification$Builder;I)Landroid/app/Notification$Builder;

    .line 567
    .line 568
    .line 569
    iget-boolean v8, p1, Landroidx/core/app/NotificationCompat$Builder;->C:Z

    .line 570
    .line 571
    if-eqz v8, :cond_10

    .line 572
    .line 573
    iget-object v8, p0, Landroidx/core/app/u2;->b:Landroid/app/Notification$Builder;

    .line 574
    .line 575
    iget-boolean v9, p1, Landroidx/core/app/NotificationCompat$Builder;->B:Z

    .line 576
    .line 577
    invoke-static {v8, v9}, Landroidx/core/app/g2;->a(Landroid/app/Notification$Builder;Z)Landroid/app/Notification$Builder;

    .line 578
    .line 579
    .line 580
    :cond_10
    iget-object v8, p1, Landroidx/core/app/NotificationCompat$Builder;->L:Ljava/lang/String;

    .line 581
    .line 582
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 583
    .line 584
    .line 585
    move-result v8

    .line 586
    if-nez v8, :cond_11

    .line 587
    .line 588
    iget-object v8, p0, Landroidx/core/app/u2;->b:Landroid/app/Notification$Builder;

    .line 589
    .line 590
    invoke-virtual {v8, v7}, Landroid/app/Notification$Builder;->setSound(Landroid/net/Uri;)Landroid/app/Notification$Builder;

    .line 591
    .line 592
    .line 593
    move-result-object v8

    .line 594
    invoke-virtual {v8, v6}, Landroid/app/Notification$Builder;->setDefaults(I)Landroid/app/Notification$Builder;

    .line 595
    .line 596
    .line 597
    move-result-object v8

    .line 598
    invoke-virtual {v8, v6, v6, v6}, Landroid/app/Notification$Builder;->setLights(III)Landroid/app/Notification$Builder;

    .line 599
    .line 600
    .line 601
    move-result-object v6

    .line 602
    invoke-virtual {v6, v7}, Landroid/app/Notification$Builder;->setVibrate([J)Landroid/app/Notification$Builder;

    .line 603
    .line 604
    .line 605
    :cond_11
    if-lt v2, v3, :cond_12

    .line 606
    .line 607
    iget-object v2, p1, Landroidx/core/app/NotificationCompat$Builder;->c:Ljava/util/ArrayList;

    .line 608
    .line 609
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 610
    .line 611
    .line 612
    move-result-object v2

    .line 613
    :goto_9
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 614
    .line 615
    .line 616
    move-result v3

    .line 617
    if-eqz v3, :cond_12

    .line 618
    .line 619
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 620
    .line 621
    .line 622
    move-result-object v3

    .line 623
    check-cast v3, Landroidx/core/app/Person;

    .line 624
    .line 625
    iget-object v6, p0, Landroidx/core/app/u2;->b:Landroid/app/Notification$Builder;

    .line 626
    .line 627
    invoke-virtual {v3}, Landroidx/core/app/Person;->j()Landroid/app/Person;

    .line 628
    .line 629
    .line 630
    move-result-object v3

    .line 631
    invoke-static {v6, v3}, Landroidx/core/app/l2;->a(Landroid/app/Notification$Builder;Landroid/app/Person;)Landroid/app/Notification$Builder;

    .line 632
    .line 633
    .line 634
    goto :goto_9

    .line 635
    :cond_12
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 636
    .line 637
    const/16 v3, 0x1d

    .line 638
    .line 639
    if-lt v2, v3, :cond_13

    .line 640
    .line 641
    iget-object v3, p0, Landroidx/core/app/u2;->b:Landroid/app/Notification$Builder;

    .line 642
    .line 643
    iget-boolean v6, p1, Landroidx/core/app/NotificationCompat$Builder;->S:Z

    .line 644
    .line 645
    invoke-static {v3, v6}, Landroidx/core/app/m2;->a(Landroid/app/Notification$Builder;Z)Landroid/app/Notification$Builder;

    .line 646
    .line 647
    .line 648
    iget-object v3, p0, Landroidx/core/app/u2;->b:Landroid/app/Notification$Builder;

    .line 649
    .line 650
    iget-object v6, p1, Landroidx/core/app/NotificationCompat$Builder;->T:Landroidx/core/app/NotificationCompat$d;

    .line 651
    .line 652
    invoke-static {v6}, Landroidx/core/app/NotificationCompat$d;->k(Landroidx/core/app/NotificationCompat$d;)Landroid/app/Notification$BubbleMetadata;

    .line 653
    .line 654
    .line 655
    move-result-object v6

    .line 656
    invoke-static {v3, v6}, Landroidx/core/app/n2;->a(Landroid/app/Notification$Builder;Landroid/app/Notification$BubbleMetadata;)Landroid/app/Notification$Builder;

    .line 657
    .line 658
    .line 659
    iget-object v3, p1, Landroidx/core/app/NotificationCompat$Builder;->O:Landroidx/core/content/g;

    .line 660
    .line 661
    if-eqz v3, :cond_13

    .line 662
    .line 663
    iget-object v6, p0, Landroidx/core/app/u2;->b:Landroid/app/Notification$Builder;

    .line 664
    .line 665
    invoke-virtual {v3}, Landroidx/core/content/g;->c()Landroid/content/LocusId;

    .line 666
    .line 667
    .line 668
    move-result-object v3

    .line 669
    invoke-static {v6, v3}, Landroidx/core/app/o2;->a(Landroid/app/Notification$Builder;Landroid/content/LocusId;)Landroid/app/Notification$Builder;

    .line 670
    .line 671
    .line 672
    :cond_13
    const/16 v3, 0x1f

    .line 673
    .line 674
    if-lt v2, v3, :cond_14

    .line 675
    .line 676
    iget v3, p1, Landroidx/core/app/NotificationCompat$Builder;->R:I

    .line 677
    .line 678
    if-eqz v3, :cond_14

    .line 679
    .line 680
    iget-object v6, p0, Landroidx/core/app/u2;->b:Landroid/app/Notification$Builder;

    .line 681
    .line 682
    invoke-static {v6, v3}, Landroidx/core/app/p2;->a(Landroid/app/Notification$Builder;I)Landroid/app/Notification$Builder;

    .line 683
    .line 684
    .line 685
    :cond_14
    iget-boolean p1, p1, Landroidx/core/app/NotificationCompat$Builder;->V:Z

    .line 686
    .line 687
    if-eqz p1, :cond_17

    .line 688
    .line 689
    iget-object p1, p0, Landroidx/core/app/u2;->c:Landroidx/core/app/NotificationCompat$Builder;

    .line 690
    .line 691
    iget-boolean p1, p1, Landroidx/core/app/NotificationCompat$Builder;->y:Z

    .line 692
    .line 693
    if-eqz p1, :cond_15

    .line 694
    .line 695
    iput v4, p0, Landroidx/core/app/u2;->h:I

    .line 696
    .line 697
    goto :goto_a

    .line 698
    :cond_15
    iput v5, p0, Landroidx/core/app/u2;->h:I

    .line 699
    .line 700
    :goto_a
    iget-object p1, p0, Landroidx/core/app/u2;->b:Landroid/app/Notification$Builder;

    .line 701
    .line 702
    invoke-virtual {p1, v7}, Landroid/app/Notification$Builder;->setVibrate([J)Landroid/app/Notification$Builder;

    .line 703
    .line 704
    .line 705
    iget-object p1, p0, Landroidx/core/app/u2;->b:Landroid/app/Notification$Builder;

    .line 706
    .line 707
    invoke-virtual {p1, v7}, Landroid/app/Notification$Builder;->setSound(Landroid/net/Uri;)Landroid/app/Notification$Builder;

    .line 708
    .line 709
    .line 710
    iget p1, v0, Landroid/app/Notification;->defaults:I

    .line 711
    .line 712
    and-int/lit8 p1, p1, -0x2

    .line 713
    .line 714
    and-int/lit8 p1, p1, -0x3

    .line 715
    .line 716
    iput p1, v0, Landroid/app/Notification;->defaults:I

    .line 717
    .line 718
    iget-object v0, p0, Landroidx/core/app/u2;->b:Landroid/app/Notification$Builder;

    .line 719
    .line 720
    invoke-virtual {v0, p1}, Landroid/app/Notification$Builder;->setDefaults(I)Landroid/app/Notification$Builder;

    .line 721
    .line 722
    .line 723
    if-lt v2, v1, :cond_17

    .line 724
    .line 725
    iget-object p1, p0, Landroidx/core/app/u2;->c:Landroidx/core/app/NotificationCompat$Builder;

    .line 726
    .line 727
    iget-object p1, p1, Landroidx/core/app/NotificationCompat$Builder;->x:Ljava/lang/String;

    .line 728
    .line 729
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 730
    .line 731
    .line 732
    move-result p1

    .line 733
    if-eqz p1, :cond_16

    .line 734
    .line 735
    iget-object p1, p0, Landroidx/core/app/u2;->b:Landroid/app/Notification$Builder;

    .line 736
    .line 737
    const-string v0, "silent"

    .line 738
    .line 739
    invoke-virtual {p1, v0}, Landroid/app/Notification$Builder;->setGroup(Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 740
    .line 741
    .line 742
    :cond_16
    iget-object p1, p0, Landroidx/core/app/u2;->b:Landroid/app/Notification$Builder;

    .line 743
    .line 744
    iget v0, p0, Landroidx/core/app/u2;->h:I

    .line 745
    .line 746
    invoke-static {p1, v0}, Landroidx/core/app/q2;->a(Landroid/app/Notification$Builder;I)Landroid/app/Notification$Builder;

    .line 747
    .line 748
    .line 749
    :cond_17
    return-void
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
.end method

.method private b(Landroidx/core/app/NotificationCompat$Action;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Landroidx/core/app/NotificationCompat$Action;->d()Landroidx/core/graphics/drawable/IconCompat;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Landroid/app/Notification$Action$Builder;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/core/graphics/drawable/IconCompat;->x()Landroid/graphics/drawable/Icon;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    :goto_0
    invoke-virtual {p1}, Landroidx/core/app/NotificationCompat$Action;->h()Ljava/lang/CharSequence;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {p1}, Landroidx/core/app/NotificationCompat$Action;->a()Landroid/app/PendingIntent;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-direct {v1, v0, v2, v3}, Landroid/app/Notification$Action$Builder;-><init>(Landroid/graphics/drawable/Icon;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Landroidx/core/app/NotificationCompat$Action;->e()[Landroidx/core/app/RemoteInput;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    invoke-virtual {p1}, Landroidx/core/app/NotificationCompat$Action;->e()[Landroidx/core/app/RemoteInput;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-static {v0}, Landroidx/core/app/RemoteInput;->b([Landroidx/core/app/RemoteInput;)[Landroid/app/RemoteInput;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    array-length v2, v0

    .line 41
    const/4 v3, 0x0

    .line 42
    :goto_1
    if-ge v3, v2, :cond_1

    .line 43
    .line 44
    aget-object v4, v0, v3

    .line 45
    .line 46
    invoke-virtual {v1, v4}, Landroid/app/Notification$Action$Builder;->addRemoteInput(Landroid/app/RemoteInput;)Landroid/app/Notification$Action$Builder;

    .line 47
    .line 48
    .line 49
    add-int/lit8 v3, v3, 0x1

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    invoke-virtual {p1}, Landroidx/core/app/NotificationCompat$Action;->c()Landroid/os/Bundle;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    if-eqz v0, :cond_2

    .line 57
    .line 58
    new-instance v0, Landroid/os/Bundle;

    .line 59
    .line 60
    invoke-virtual {p1}, Landroidx/core/app/NotificationCompat$Action;->c()Landroid/os/Bundle;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-direct {v0, v2}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 65
    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_2
    new-instance v0, Landroid/os/Bundle;

    .line 69
    .line 70
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 71
    .line 72
    .line 73
    :goto_2
    const-string v2, "android.support.allowGeneratedReplies"

    .line 74
    .line 75
    invoke-virtual {p1}, Landroidx/core/app/NotificationCompat$Action;->b()Z

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    invoke-virtual {v0, v2, v3}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 80
    .line 81
    .line 82
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 83
    .line 84
    const/16 v3, 0x18

    .line 85
    .line 86
    if-lt v2, v3, :cond_3

    .line 87
    .line 88
    invoke-virtual {p1}, Landroidx/core/app/NotificationCompat$Action;->b()Z

    .line 89
    .line 90
    .line 91
    move-result v3

    .line 92
    invoke-static {v1, v3}, Landroidx/core/app/h2;->a(Landroid/app/Notification$Action$Builder;Z)Landroid/app/Notification$Action$Builder;

    .line 93
    .line 94
    .line 95
    :cond_3
    const-string v3, "android.support.action.semanticAction"

    .line 96
    .line 97
    invoke-virtual {p1}, Landroidx/core/app/NotificationCompat$Action;->f()I

    .line 98
    .line 99
    .line 100
    move-result v4

    .line 101
    invoke-virtual {v0, v3, v4}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 102
    .line 103
    .line 104
    const/16 v3, 0x1c

    .line 105
    .line 106
    if-lt v2, v3, :cond_4

    .line 107
    .line 108
    invoke-virtual {p1}, Landroidx/core/app/NotificationCompat$Action;->f()I

    .line 109
    .line 110
    .line 111
    move-result v3

    .line 112
    invoke-static {v1, v3}, Landroidx/core/app/i2;->a(Landroid/app/Notification$Action$Builder;I)Landroid/app/Notification$Action$Builder;

    .line 113
    .line 114
    .line 115
    :cond_4
    const/16 v3, 0x1d

    .line 116
    .line 117
    if-lt v2, v3, :cond_5

    .line 118
    .line 119
    invoke-virtual {p1}, Landroidx/core/app/NotificationCompat$Action;->j()Z

    .line 120
    .line 121
    .line 122
    move-result v3

    .line 123
    invoke-static {v1, v3}, Landroidx/core/app/j2;->a(Landroid/app/Notification$Action$Builder;Z)Landroid/app/Notification$Action$Builder;

    .line 124
    .line 125
    .line 126
    :cond_5
    const/16 v3, 0x1f

    .line 127
    .line 128
    if-lt v2, v3, :cond_6

    .line 129
    .line 130
    invoke-virtual {p1}, Landroidx/core/app/NotificationCompat$Action;->i()Z

    .line 131
    .line 132
    .line 133
    move-result v2

    .line 134
    invoke-static {v1, v2}, Landroidx/core/app/k2;->a(Landroid/app/Notification$Action$Builder;Z)Landroid/app/Notification$Action$Builder;

    .line 135
    .line 136
    .line 137
    :cond_6
    const-string v2, "android.support.action.showsUserInterface"

    .line 138
    .line 139
    invoke-virtual {p1}, Landroidx/core/app/NotificationCompat$Action;->g()Z

    .line 140
    .line 141
    .line 142
    move-result p1

    .line 143
    invoke-virtual {v0, v2, p1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v1, v0}, Landroid/app/Notification$Action$Builder;->addExtras(Landroid/os/Bundle;)Landroid/app/Notification$Action$Builder;

    .line 147
    .line 148
    .line 149
    iget-object p1, p0, Landroidx/core/app/u2;->b:Landroid/app/Notification$Builder;

    .line 150
    .line 151
    invoke-virtual {v1}, Landroid/app/Notification$Action$Builder;->build()Landroid/app/Notification$Action;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    invoke-virtual {p1, v0}, Landroid/app/Notification$Builder;->addAction(Landroid/app/Notification$Action;)Landroid/app/Notification$Builder;

    .line 156
    .line 157
    .line 158
    return-void
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
.end method

.method private static e(Ljava/util/List;Ljava/util/List;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    return-object p1

    .line 4
    :cond_0
    if-nez p1, :cond_1

    .line 5
    .line 6
    return-object p0

    .line 7
    :cond_1
    new-instance v0, Landroidx/collection/b;

    .line 8
    .line 9
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    add-int/2addr v1, v2

    .line 18
    invoke-direct {v0, v1}, Landroidx/collection/b;-><init>(I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p0}, Landroidx/collection/b;->addAll(Ljava/util/Collection;)Z

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p1}, Landroidx/collection/b;->addAll(Ljava/util/Collection;)Z

    .line 25
    .line 26
    .line 27
    new-instance p0, Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-direct {p0, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 30
    .line 31
    .line 32
    return-object p0
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
.end method

.method private static g(Ljava/util/List;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/core/app/Person;",
            ">;)",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 12
    .line 13
    .line 14
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Landroidx/core/app/Person;

    .line 29
    .line 30
    invoke-virtual {v1}, Landroidx/core/app/Person;->i()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    return-object v0
    .line 39
    .line 40
.end method

.method private h(Landroid/app/Notification;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p1, Landroid/app/Notification;->sound:Landroid/net/Uri;

    .line 3
    .line 4
    iput-object v0, p1, Landroid/app/Notification;->vibrate:[J

    .line 5
    .line 6
    iget v0, p1, Landroid/app/Notification;->defaults:I

    .line 7
    .line 8
    and-int/lit8 v0, v0, -0x2

    .line 9
    .line 10
    and-int/lit8 v0, v0, -0x3

    .line 11
    .line 12
    iput v0, p1, Landroid/app/Notification;->defaults:I

    .line 13
    .line 14
    return-void
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
.end method


# virtual methods
.method public a()Landroid/app/Notification$Builder;
    .locals 1

    iget-object v0, p0, Landroidx/core/app/u2;->b:Landroid/app/Notification$Builder;

    return-object v0
.end method

.method public c()Landroid/app/Notification;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/core/app/u2;->c:Landroidx/core/app/NotificationCompat$Builder;

    .line 2
    .line 3
    iget-object v0, v0, Landroidx/core/app/NotificationCompat$Builder;->q:Landroidx/core/app/NotificationCompat$g;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0, p0}, Landroidx/core/app/NotificationCompat$g;->b(Landroidx/core/app/m;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {v0, p0}, Landroidx/core/app/NotificationCompat$g;->t(Landroidx/core/app/m;)Landroid/widget/RemoteViews;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    goto :goto_0

    .line 17
    :cond_1
    const/4 v1, 0x0

    .line 18
    :goto_0
    invoke-virtual {p0}, Landroidx/core/app/u2;->d()Landroid/app/Notification;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    if-eqz v1, :cond_2

    .line 23
    .line 24
    iput-object v1, v2, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_2
    iget-object v1, p0, Landroidx/core/app/u2;->c:Landroidx/core/app/NotificationCompat$Builder;

    .line 28
    .line 29
    iget-object v1, v1, Landroidx/core/app/NotificationCompat$Builder;->I:Landroid/widget/RemoteViews;

    .line 30
    .line 31
    if-eqz v1, :cond_3

    .line 32
    .line 33
    iput-object v1, v2, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    .line 34
    .line 35
    :cond_3
    :goto_1
    if-eqz v0, :cond_4

    .line 36
    .line 37
    invoke-virtual {v0, p0}, Landroidx/core/app/NotificationCompat$g;->s(Landroidx/core/app/m;)Landroid/widget/RemoteViews;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    if-eqz v1, :cond_4

    .line 42
    .line 43
    iput-object v1, v2, Landroid/app/Notification;->bigContentView:Landroid/widget/RemoteViews;

    .line 44
    .line 45
    :cond_4
    if-eqz v0, :cond_5

    .line 46
    .line 47
    iget-object v1, p0, Landroidx/core/app/u2;->c:Landroidx/core/app/NotificationCompat$Builder;

    .line 48
    .line 49
    iget-object v1, v1, Landroidx/core/app/NotificationCompat$Builder;->q:Landroidx/core/app/NotificationCompat$g;

    .line 50
    .line 51
    invoke-virtual {v1, p0}, Landroidx/core/app/NotificationCompat$g;->u(Landroidx/core/app/m;)Landroid/widget/RemoteViews;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    if-eqz v1, :cond_5

    .line 56
    .line 57
    iput-object v1, v2, Landroid/app/Notification;->headsUpContentView:Landroid/widget/RemoteViews;

    .line 58
    .line 59
    :cond_5
    if-eqz v0, :cond_6

    .line 60
    .line 61
    invoke-static {v2}, Landroidx/core/app/NotificationCompat;->k(Landroid/app/Notification;)Landroid/os/Bundle;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    if-eqz v1, :cond_6

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$g;->a(Landroid/os/Bundle;)V

    .line 68
    .line 69
    .line 70
    :cond_6
    return-object v2
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
.end method

.method protected d()Landroid/app/Notification;
    .locals 4

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Landroidx/core/app/u2;->b:Landroid/app/Notification$Builder;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0

    .line 14
    :cond_0
    const/16 v1, 0x18

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    const/4 v3, 0x2

    .line 18
    if-lt v0, v1, :cond_3

    .line 19
    .line 20
    iget-object v0, p0, Landroidx/core/app/u2;->b:Landroid/app/Notification$Builder;

    .line 21
    .line 22
    invoke-virtual {v0}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iget v1, p0, Landroidx/core/app/u2;->h:I

    .line 27
    .line 28
    if-eqz v1, :cond_2

    .line 29
    .line 30
    invoke-virtual {v0}, Landroid/app/Notification;->getGroup()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    iget v1, v0, Landroid/app/Notification;->flags:I

    .line 37
    .line 38
    and-int/lit16 v1, v1, 0x200

    .line 39
    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    iget v1, p0, Landroidx/core/app/u2;->h:I

    .line 43
    .line 44
    if-ne v1, v3, :cond_1

    .line 45
    .line 46
    invoke-direct {p0, v0}, Landroidx/core/app/u2;->h(Landroid/app/Notification;)V

    .line 47
    .line 48
    .line 49
    :cond_1
    invoke-virtual {v0}, Landroid/app/Notification;->getGroup()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    if-eqz v1, :cond_2

    .line 54
    .line 55
    iget v1, v0, Landroid/app/Notification;->flags:I

    .line 56
    .line 57
    and-int/lit16 v1, v1, 0x200

    .line 58
    .line 59
    if-nez v1, :cond_2

    .line 60
    .line 61
    iget v1, p0, Landroidx/core/app/u2;->h:I

    .line 62
    .line 63
    if-ne v1, v2, :cond_2

    .line 64
    .line 65
    invoke-direct {p0, v0}, Landroidx/core/app/u2;->h(Landroid/app/Notification;)V

    .line 66
    .line 67
    .line 68
    :cond_2
    return-object v0

    .line 69
    :cond_3
    iget-object v0, p0, Landroidx/core/app/u2;->b:Landroid/app/Notification$Builder;

    .line 70
    .line 71
    iget-object v1, p0, Landroidx/core/app/u2;->g:Landroid/os/Bundle;

    .line 72
    .line 73
    invoke-virtual {v0, v1}, Landroid/app/Notification$Builder;->setExtras(Landroid/os/Bundle;)Landroid/app/Notification$Builder;

    .line 74
    .line 75
    .line 76
    iget-object v0, p0, Landroidx/core/app/u2;->b:Landroid/app/Notification$Builder;

    .line 77
    .line 78
    invoke-virtual {v0}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    iget-object v1, p0, Landroidx/core/app/u2;->d:Landroid/widget/RemoteViews;

    .line 83
    .line 84
    if-eqz v1, :cond_4

    .line 85
    .line 86
    iput-object v1, v0, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    .line 87
    .line 88
    :cond_4
    iget-object v1, p0, Landroidx/core/app/u2;->e:Landroid/widget/RemoteViews;

    .line 89
    .line 90
    if-eqz v1, :cond_5

    .line 91
    .line 92
    iput-object v1, v0, Landroid/app/Notification;->bigContentView:Landroid/widget/RemoteViews;

    .line 93
    .line 94
    :cond_5
    iget-object v1, p0, Landroidx/core/app/u2;->i:Landroid/widget/RemoteViews;

    .line 95
    .line 96
    if-eqz v1, :cond_6

    .line 97
    .line 98
    iput-object v1, v0, Landroid/app/Notification;->headsUpContentView:Landroid/widget/RemoteViews;

    .line 99
    .line 100
    :cond_6
    iget v1, p0, Landroidx/core/app/u2;->h:I

    .line 101
    .line 102
    if-eqz v1, :cond_8

    .line 103
    .line 104
    invoke-virtual {v0}, Landroid/app/Notification;->getGroup()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    if-eqz v1, :cond_7

    .line 109
    .line 110
    iget v1, v0, Landroid/app/Notification;->flags:I

    .line 111
    .line 112
    and-int/lit16 v1, v1, 0x200

    .line 113
    .line 114
    if-eqz v1, :cond_7

    .line 115
    .line 116
    iget v1, p0, Landroidx/core/app/u2;->h:I

    .line 117
    .line 118
    if-ne v1, v3, :cond_7

    .line 119
    .line 120
    invoke-direct {p0, v0}, Landroidx/core/app/u2;->h(Landroid/app/Notification;)V

    .line 121
    .line 122
    .line 123
    :cond_7
    invoke-virtual {v0}, Landroid/app/Notification;->getGroup()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    if-eqz v1, :cond_8

    .line 128
    .line 129
    iget v1, v0, Landroid/app/Notification;->flags:I

    .line 130
    .line 131
    and-int/lit16 v1, v1, 0x200

    .line 132
    .line 133
    if-nez v1, :cond_8

    .line 134
    .line 135
    iget v1, p0, Landroidx/core/app/u2;->h:I

    .line 136
    .line 137
    if-ne v1, v2, :cond_8

    .line 138
    .line 139
    invoke-direct {p0, v0}, Landroidx/core/app/u2;->h(Landroid/app/Notification;)V

    .line 140
    .line 141
    .line 142
    :cond_8
    return-object v0
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
.end method

.method f()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Landroidx/core/app/u2;->a:Landroid/content/Context;

    return-object v0
.end method
