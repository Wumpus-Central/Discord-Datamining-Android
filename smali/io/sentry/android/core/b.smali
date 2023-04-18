.class final Lio/sentry/android/core/b;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/sentry/android/core/b$a;
    }
.end annotation


# instance fields
.field private final k:Z

.field private final l:Lio/sentry/android/core/b$a;

.field private final m:Lio/sentry/android/core/q0;

.field private final n:J

.field private final o:Lio/sentry/g0;

.field private final p:Ljava/util/concurrent/atomic/AtomicLong;

.field private final q:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final r:Landroid/content/Context;

.field private final s:Ljava/lang/Runnable;


# direct methods
.method constructor <init>(JZLio/sentry/android/core/b$a;Lio/sentry/g0;Landroid/content/Context;)V
    .locals 8

    .line 1
    new-instance v6, Lio/sentry/android/core/q0;

    invoke-direct {v6}, Lio/sentry/android/core/q0;-><init>()V

    move-object v0, p0

    move-wide v1, p1

    move v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Lio/sentry/android/core/b;-><init>(JZLio/sentry/android/core/b$a;Lio/sentry/g0;Lio/sentry/android/core/q0;Landroid/content/Context;)V

    return-void
.end method

.method constructor <init>(JZLio/sentry/android/core/b$a;Lio/sentry/g0;Lio/sentry/android/core/q0;Landroid/content/Context;)V
    .locals 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    .line 3
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v1, 0x0

    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object v0, p0, Lio/sentry/android/core/b;->p:Ljava/util/concurrent/atomic/AtomicLong;

    .line 4
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lio/sentry/android/core/b;->q:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 5
    new-instance v0, Lio/sentry/android/core/a;

    invoke-direct {v0, p0}, Lio/sentry/android/core/a;-><init>(Lio/sentry/android/core/b;)V

    iput-object v0, p0, Lio/sentry/android/core/b;->s:Ljava/lang/Runnable;

    .line 6
    iput-boolean p3, p0, Lio/sentry/android/core/b;->k:Z

    .line 7
    iput-object p4, p0, Lio/sentry/android/core/b;->l:Lio/sentry/android/core/b$a;

    .line 8
    iput-wide p1, p0, Lio/sentry/android/core/b;->n:J

    .line 9
    iput-object p5, p0, Lio/sentry/android/core/b;->o:Lio/sentry/g0;

    .line 10
    iput-object p6, p0, Lio/sentry/android/core/b;->m:Lio/sentry/android/core/q0;

    .line 11
    iput-object p7, p0, Lio/sentry/android/core/b;->r:Landroid/content/Context;

    return-void
.end method

.method public static synthetic a(Lio/sentry/android/core/b;)V
    .locals 0

    invoke-direct {p0}, Lio/sentry/android/core/b;->b()V

    return-void
.end method

.method private synthetic b()V
    .locals 3

    .line 1
    iget-object v0, p0, Lio/sentry/android/core/b;->p:Ljava/util/concurrent/atomic/AtomicLong;

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lio/sentry/android/core/b;->q:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 12
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
.end method


# virtual methods
.method public run()V
    .locals 9

    .line 1
    const-string v0, "|ANR-WatchDog|"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-wide v0, p0, Lio/sentry/android/core/b;->n:J

    .line 7
    .line 8
    :cond_0
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Thread;->isInterrupted()Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-nez v2, :cond_9

    .line 13
    .line 14
    iget-object v2, p0, Lio/sentry/android/core/b;->p:Ljava/util/concurrent/atomic/AtomicLong;

    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 17
    .line 18
    .line 19
    move-result-wide v2

    .line 20
    const-wide/16 v4, 0x0

    .line 21
    .line 22
    cmp-long v2, v2, v4

    .line 23
    .line 24
    const/4 v3, 0x1

    .line 25
    const/4 v6, 0x0

    .line 26
    if-nez v2, :cond_1

    .line 27
    .line 28
    move v2, v3

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    move v2, v6

    .line 31
    :goto_1
    iget-object v7, p0, Lio/sentry/android/core/b;->p:Ljava/util/concurrent/atomic/AtomicLong;

    .line 32
    .line 33
    invoke-virtual {v7, v0, v1}, Ljava/util/concurrent/atomic/AtomicLong;->addAndGet(J)J

    .line 34
    .line 35
    .line 36
    if-eqz v2, :cond_2

    .line 37
    .line 38
    iget-object v2, p0, Lio/sentry/android/core/b;->m:Lio/sentry/android/core/q0;

    .line 39
    .line 40
    iget-object v7, p0, Lio/sentry/android/core/b;->s:Ljava/lang/Runnable;

    .line 41
    .line 42
    invoke-virtual {v2, v7}, Lio/sentry/android/core/q0;->b(Ljava/lang/Runnable;)V

    .line 43
    .line 44
    .line 45
    :cond_2
    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    .line 47
    .line 48
    iget-object v2, p0, Lio/sentry/android/core/b;->p:Ljava/util/concurrent/atomic/AtomicLong;

    .line 49
    .line 50
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 51
    .line 52
    .line 53
    move-result-wide v7

    .line 54
    cmp-long v2, v7, v4

    .line 55
    .line 56
    if-eqz v2, :cond_0

    .line 57
    .line 58
    iget-object v2, p0, Lio/sentry/android/core/b;->q:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 59
    .line 60
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-nez v2, :cond_0

    .line 65
    .line 66
    iget-boolean v2, p0, Lio/sentry/android/core/b;->k:Z

    .line 67
    .line 68
    if-nez v2, :cond_4

    .line 69
    .line 70
    invoke-static {}, Landroid/os/Debug;->isDebuggerConnected()Z

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    if-nez v2, :cond_3

    .line 75
    .line 76
    invoke-static {}, Landroid/os/Debug;->waitingForDebugger()Z

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    if-eqz v2, :cond_4

    .line 81
    .line 82
    :cond_3
    iget-object v2, p0, Lio/sentry/android/core/b;->o:Lio/sentry/g0;

    .line 83
    .line 84
    sget-object v4, Lio/sentry/n3;->DEBUG:Lio/sentry/n3;

    .line 85
    .line 86
    const-string v5, "An ANR was detected but ignored because the debugger is connected."

    .line 87
    .line 88
    new-array v6, v6, [Ljava/lang/Object;

    .line 89
    .line 90
    invoke-interface {v2, v4, v5, v6}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    iget-object v2, p0, Lio/sentry/android/core/b;->q:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 94
    .line 95
    invoke-virtual {v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 96
    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_4
    iget-object v2, p0, Lio/sentry/android/core/b;->r:Landroid/content/Context;

    .line 100
    .line 101
    const-string v4, "activity"

    .line 102
    .line 103
    invoke-virtual {v2, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    check-cast v2, Landroid/app/ActivityManager;

    .line 108
    .line 109
    if-eqz v2, :cond_8

    .line 110
    .line 111
    :try_start_1
    invoke-virtual {v2}, Landroid/app/ActivityManager;->getProcessesInErrorState()Ljava/util/List;

    .line 112
    .line 113
    .line 114
    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 115
    goto :goto_2

    .line 116
    :catchall_0
    move-exception v2

    .line 117
    iget-object v4, p0, Lio/sentry/android/core/b;->o:Lio/sentry/g0;

    .line 118
    .line 119
    sget-object v5, Lio/sentry/n3;->ERROR:Lio/sentry/n3;

    .line 120
    .line 121
    const-string v7, "Error getting ActivityManager#getProcessesInErrorState."

    .line 122
    .line 123
    invoke-interface {v4, v5, v7, v2}, Lio/sentry/g0;->b(Lio/sentry/n3;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 124
    .line 125
    .line 126
    const/4 v2, 0x0

    .line 127
    :goto_2
    if-nez v2, :cond_5

    .line 128
    .line 129
    goto :goto_0

    .line 130
    :cond_5
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    :cond_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 135
    .line 136
    .line 137
    move-result v4

    .line 138
    if-eqz v4, :cond_7

    .line 139
    .line 140
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v4

    .line 144
    check-cast v4, Landroid/app/ActivityManager$ProcessErrorStateInfo;

    .line 145
    .line 146
    iget v4, v4, Landroid/app/ActivityManager$ProcessErrorStateInfo;->condition:I

    .line 147
    .line 148
    const/4 v5, 0x2

    .line 149
    if-ne v4, v5, :cond_6

    .line 150
    .line 151
    move v2, v3

    .line 152
    goto :goto_3

    .line 153
    :cond_7
    move v2, v6

    .line 154
    :goto_3
    if-nez v2, :cond_8

    .line 155
    .line 156
    goto/16 :goto_0

    .line 157
    .line 158
    :cond_8
    iget-object v0, p0, Lio/sentry/android/core/b;->o:Lio/sentry/g0;

    .line 159
    .line 160
    sget-object v1, Lio/sentry/n3;->INFO:Lio/sentry/n3;

    .line 161
    .line 162
    const-string v2, "Raising ANR"

    .line 163
    .line 164
    new-array v4, v6, [Ljava/lang/Object;

    .line 165
    .line 166
    invoke-interface {v0, v1, v2, v4}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    new-instance v0, Ljava/lang/StringBuilder;

    .line 170
    .line 171
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 172
    .line 173
    .line 174
    const-string v1, "Application Not Responding for at least "

    .line 175
    .line 176
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    iget-wide v1, p0, Lio/sentry/android/core/b;->n:J

    .line 180
    .line 181
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    const-string v1, " ms."

    .line 185
    .line 186
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    new-instance v1, Lio/sentry/android/core/e0;

    .line 194
    .line 195
    iget-object v2, p0, Lio/sentry/android/core/b;->m:Lio/sentry/android/core/q0;

    .line 196
    .line 197
    invoke-virtual {v2}, Lio/sentry/android/core/q0;->a()Ljava/lang/Thread;

    .line 198
    .line 199
    .line 200
    move-result-object v2

    .line 201
    invoke-direct {v1, v0, v2}, Lio/sentry/android/core/e0;-><init>(Ljava/lang/String;Ljava/lang/Thread;)V

    .line 202
    .line 203
    .line 204
    iget-object v0, p0, Lio/sentry/android/core/b;->l:Lio/sentry/android/core/b$a;

    .line 205
    .line 206
    invoke-interface {v0, v1}, Lio/sentry/android/core/b$a;->a(Lio/sentry/android/core/e0;)V

    .line 207
    .line 208
    .line 209
    iget-wide v0, p0, Lio/sentry/android/core/b;->n:J

    .line 210
    .line 211
    iget-object v2, p0, Lio/sentry/android/core/b;->q:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 212
    .line 213
    invoke-virtual {v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 214
    .line 215
    .line 216
    goto/16 :goto_0

    .line 217
    .line 218
    :catch_0
    move-exception v0

    .line 219
    :try_start_2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 220
    .line 221
    .line 222
    move-result-object v1

    .line 223
    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V
    :try_end_2
    .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_1

    .line 224
    .line 225
    .line 226
    iget-object v1, p0, Lio/sentry/android/core/b;->o:Lio/sentry/g0;

    .line 227
    .line 228
    sget-object v2, Lio/sentry/n3;->WARNING:Lio/sentry/n3;

    .line 229
    .line 230
    new-array v3, v3, [Ljava/lang/Object;

    .line 231
    .line 232
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    aput-object v0, v3, v6

    .line 237
    .line 238
    const-string v0, "Interrupted: %s"

    .line 239
    .line 240
    invoke-interface {v1, v2, v0, v3}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 241
    .line 242
    .line 243
    return-void

    .line 244
    :catch_1
    iget-object v1, p0, Lio/sentry/android/core/b;->o:Lio/sentry/g0;

    .line 245
    .line 246
    sget-object v2, Lio/sentry/n3;->WARNING:Lio/sentry/n3;

    .line 247
    .line 248
    new-array v3, v3, [Ljava/lang/Object;

    .line 249
    .line 250
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    aput-object v0, v3, v6

    .line 255
    .line 256
    const-string v0, "Failed to interrupt due to SecurityException: %s"

    .line 257
    .line 258
    invoke-interface {v1, v2, v0, v3}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 259
    .line 260
    .line 261
    :cond_9
    return-void
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
.end method
