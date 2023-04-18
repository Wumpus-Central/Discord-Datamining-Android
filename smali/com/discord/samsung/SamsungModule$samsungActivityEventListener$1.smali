.class public final Lcom/discord/samsung/SamsungModule$samsungActivityEventListener$1;
.super Lcom/facebook/react/bridge/BaseActivityEventListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/samsung/SamsungModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u00020\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u00072\u0008\u0010\t\u001a\u0004\u0018\u00010\nH\u0016\u00a8\u0006\u000b"
    }
    d2 = {
        "com/discord/samsung/SamsungModule$samsungActivityEventListener$1",
        "Lcom/facebook/react/bridge/BaseActivityEventListener;",
        "onActivityResult",
        "",
        "activity",
        "Landroid/app/Activity;",
        "requestCode",
        "",
        "resultCode",
        "data",
        "Landroid/content/Intent;",
        "samsung_release"
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
.field final synthetic this$0:Lcom/discord/samsung/SamsungModule;


# direct methods
.method constructor <init>(Lcom/discord/samsung/SamsungModule;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/discord/samsung/SamsungModule$samsungActivityEventListener$1;->this$0:Lcom/discord/samsung/SamsungModule;

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/facebook/react/bridge/BaseActivityEventListener;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
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
.end method


# virtual methods
.method public onActivityResult(Landroid/app/Activity;IILandroid/content/Intent;)V
    .locals 3

    .line 1
    const/16 v0, 0x64

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eq p2, v0, :cond_6

    .line 6
    .line 7
    const/16 v0, 0x65

    .line 8
    .line 9
    if-eq p2, v0, :cond_0

    .line 10
    .line 11
    invoke-super {p0, p1, p2, p3, p4}, Lcom/facebook/react/bridge/BaseActivityEventListener;->onActivityResult(Landroid/app/Activity;IILandroid/content/Intent;)V

    .line 12
    .line 13
    .line 14
    goto/16 :goto_2

    .line 15
    .line 16
    :cond_0
    const/16 p1, 0x1f4

    .line 17
    .line 18
    const/4 p2, 0x0

    .line 19
    if-ne p3, p1, :cond_2

    .line 20
    .line 21
    iget-object p1, p0, Lcom/discord/samsung/SamsungModule$samsungActivityEventListener$1;->this$0:Lcom/discord/samsung/SamsungModule;

    .line 22
    .line 23
    new-instance p3, Lcom/discord/samsung/SamsungConnectActivity$Result$Failure;

    .line 24
    .line 25
    if-eqz p4, :cond_1

    .line 26
    .line 27
    const-string v0, "com.discord.samsung.intent.extra.ATTEMPT_COUNT"

    .line 28
    .line 29
    invoke-virtual {p4, v0, p2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    :cond_1
    invoke-direct {p3, v1, p2}, Lcom/discord/samsung/SamsungConnectActivity$Result$Failure;-><init>(ZI)V

    .line 34
    .line 35
    .line 36
    invoke-static {p1, p3}, Lcom/discord/samsung/SamsungModule;->access$handleAuthResult(Lcom/discord/samsung/SamsungModule;Lcom/discord/samsung/SamsungConnectActivity$Result;)V

    .line 37
    .line 38
    .line 39
    goto/16 :goto_2

    .line 40
    .line 41
    :cond_2
    if-nez p4, :cond_3

    .line 42
    .line 43
    iget-object p1, p0, Lcom/discord/samsung/SamsungModule$samsungActivityEventListener$1;->this$0:Lcom/discord/samsung/SamsungModule;

    .line 44
    .line 45
    new-instance p3, Lcom/discord/samsung/SamsungConnectActivity$Result$Failure;

    .line 46
    .line 47
    const/4 p4, 0x2

    .line 48
    invoke-direct {p3, p2, p2, p4, v2}, Lcom/discord/samsung/SamsungConnectActivity$Result$Failure;-><init>(ZIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 49
    .line 50
    .line 51
    invoke-static {p1, p3}, Lcom/discord/samsung/SamsungModule;->access$handleAuthResult(Lcom/discord/samsung/SamsungModule;Lcom/discord/samsung/SamsungConnectActivity$Result;)V

    .line 52
    .line 53
    .line 54
    goto/16 :goto_2

    .line 55
    .line 56
    :cond_3
    const-string p1, "com.discord.samsung.intent.extra.AUTH_CODE"

    .line 57
    .line 58
    invoke-virtual {p4, p1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    const-string p2, ""

    .line 63
    .line 64
    if-nez p1, :cond_4

    .line 65
    .line 66
    move-object p1, p2

    .line 67
    :cond_4
    const-string p3, "com.discord.samsung.intent.extra.SERVER_URL"

    .line 68
    .line 69
    invoke-virtual {p4, p3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p3

    .line 73
    if-nez p3, :cond_5

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_5
    move-object p2, p3

    .line 77
    :goto_0
    iget-object p3, p0, Lcom/discord/samsung/SamsungModule$samsungActivityEventListener$1;->this$0:Lcom/discord/samsung/SamsungModule;

    .line 78
    .line 79
    new-instance p4, Lcom/discord/samsung/SamsungConnectActivity$Result$Success;

    .line 80
    .line 81
    invoke-direct {p4, p1, p2}, Lcom/discord/samsung/SamsungConnectActivity$Result$Success;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    invoke-static {p3, p4}, Lcom/discord/samsung/SamsungModule;->access$handleAuthResult(Lcom/discord/samsung/SamsungModule;Lcom/discord/samsung/SamsungConnectActivity$Result;)V

    .line 85
    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_6
    const/4 p1, -0x1

    .line 89
    if-ne p3, p1, :cond_7

    .line 90
    .line 91
    iget-object p1, p0, Lcom/discord/samsung/SamsungModule$samsungActivityEventListener$1;->this$0:Lcom/discord/samsung/SamsungModule;

    .line 92
    .line 93
    invoke-static {p1, v2, v1, v2}, Lcom/discord/samsung/SamsungModule;->resolveConnection$default(Lcom/discord/samsung/SamsungModule;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_7
    if-eqz p4, :cond_8

    .line 98
    .line 99
    invoke-virtual {p4}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    if-eqz p1, :cond_8

    .line 104
    .line 105
    const-string p2, "error_message"

    .line 106
    .line 107
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    goto :goto_1

    .line 112
    :cond_8
    move-object p1, v2

    .line 113
    :goto_1
    if-eqz p4, :cond_9

    .line 114
    .line 115
    invoke-virtual {p4}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 116
    .line 117
    .line 118
    move-result-object p2

    .line 119
    if-eqz p2, :cond_9

    .line 120
    .line 121
    const-string p3, "error_code"

    .line 122
    .line 123
    invoke-virtual {p2, p3}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    :cond_9
    iget-object p2, p0, Lcom/discord/samsung/SamsungModule$samsungActivityEventListener$1;->this$0:Lcom/discord/samsung/SamsungModule;

    .line 128
    .line 129
    new-instance p3, Ljava/lang/Throwable;

    .line 130
    .line 131
    new-instance p4, Ljava/lang/StringBuilder;

    .line 132
    .line 133
    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    .line 134
    .line 135
    .line 136
    const-string v0, "Connection requires disclaimer acceptance. ["

    .line 137
    .line 138
    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual {p4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    const-string v0, "] "

    .line 145
    .line 146
    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    invoke-direct {p3, p1}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    invoke-static {p2, p3}, Lcom/discord/samsung/SamsungModule;->access$rejectConnection(Lcom/discord/samsung/SamsungModule;Ljava/lang/Throwable;)V

    .line 160
    .line 161
    .line 162
    :goto_2
    return-void
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
.end method
