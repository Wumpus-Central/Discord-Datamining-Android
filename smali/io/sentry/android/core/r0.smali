.class final Lio/sentry/android/core/r0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static a(Landroid/content/Context;Lio/sentry/android/core/SentryAndroidOptions;Lio/sentry/android/core/f0;)V
    .locals 10

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    const-string v1, "io.sentry.traces.trace-propagation-targets"

    .line 4
    .line 5
    const-string v2, "The application context is required."

    .line 6
    .line 7
    invoke-static {p0, v2}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    const-string v2, "The options object is required."

    .line 11
    .line 12
    invoke-static {p1, v2}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    :try_start_0
    invoke-virtual {p1}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-static {p0, v2, p2}, Lio/sentry/android/core/r0;->b(Landroid/content/Context;Lio/sentry/g0;Lio/sentry/android/core/f0;)Landroid/os/Bundle;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {p1}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    const/4 v2, 0x0

    .line 28
    if-eqz p0, :cond_d

    .line 29
    .line 30
    const-string v3, "io.sentry.debug"

    .line 31
    .line 32
    invoke-virtual {p1}, Lio/sentry/o3;->isDebug()Z

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    invoke-static {p0, p2, v3, v4}, Lio/sentry/android/core/r0;->d(Landroid/os/Bundle;Lio/sentry/g0;Ljava/lang/String;Z)Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    invoke-virtual {p1, v3}, Lio/sentry/o3;->setDebug(Z)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1}, Lio/sentry/o3;->isDebug()Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-eqz v3, :cond_0

    .line 48
    .line 49
    const-string v3, "io.sentry.debug.level"

    .line 50
    .line 51
    invoke-virtual {p1}, Lio/sentry/o3;->getDiagnosticLevel()Lio/sentry/n3;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 60
    .line 61
    invoke-virtual {v4, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    invoke-static {p0, p2, v3, v4}, Lio/sentry/android/core/r0;->h(Landroid/os/Bundle;Lio/sentry/g0;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    if-eqz v3, :cond_0

    .line 70
    .line 71
    invoke-virtual {v3, v5}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    invoke-static {v3}, Lio/sentry/n3;->valueOf(Ljava/lang/String;)Lio/sentry/n3;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    invoke-virtual {p1, v3}, Lio/sentry/o3;->setDiagnosticLevel(Lio/sentry/n3;)V

    .line 80
    .line 81
    .line 82
    :cond_0
    const-string v3, "io.sentry.anr.enable"

    .line 83
    .line 84
    invoke-virtual {p1}, Lio/sentry/android/core/SentryAndroidOptions;->isAnrEnabled()Z

    .line 85
    .line 86
    .line 87
    move-result v4

    .line 88
    invoke-static {p0, p2, v3, v4}, Lio/sentry/android/core/r0;->d(Landroid/os/Bundle;Lio/sentry/g0;Ljava/lang/String;Z)Z

    .line 89
    .line 90
    .line 91
    move-result v3

    .line 92
    invoke-virtual {p1, v3}, Lio/sentry/android/core/SentryAndroidOptions;->setAnrEnabled(Z)V

    .line 93
    .line 94
    .line 95
    const-string v3, "io.sentry.session-tracking.enable"

    .line 96
    .line 97
    invoke-virtual {p1}, Lio/sentry/o3;->isEnableAutoSessionTracking()Z

    .line 98
    .line 99
    .line 100
    move-result v4

    .line 101
    invoke-static {p0, p2, v3, v4}, Lio/sentry/android/core/r0;->d(Landroid/os/Bundle;Lio/sentry/g0;Ljava/lang/String;Z)Z

    .line 102
    .line 103
    .line 104
    move-result v3

    .line 105
    const-string v4, "io.sentry.auto-session-tracking.enable"

    .line 106
    .line 107
    invoke-static {p0, p2, v4, v3}, Lio/sentry/android/core/r0;->d(Landroid/os/Bundle;Lio/sentry/g0;Ljava/lang/String;Z)Z

    .line 108
    .line 109
    .line 110
    move-result v3

    .line 111
    invoke-virtual {p1, v3}, Lio/sentry/o3;->setEnableAutoSessionTracking(Z)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1}, Lio/sentry/o3;->getSampleRate()Ljava/lang/Double;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    const-wide/high16 v4, -0x4010000000000000L    # -1.0

    .line 119
    .line 120
    if-nez v3, :cond_1

    .line 121
    .line 122
    const-string v3, "io.sentry.sample-rate"

    .line 123
    .line 124
    invoke-static {p0, p2, v3}, Lio/sentry/android/core/r0;->e(Landroid/os/Bundle;Lio/sentry/g0;Ljava/lang/String;)Ljava/lang/Double;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    .line 129
    .line 130
    .line 131
    move-result-wide v6

    .line 132
    cmpl-double v6, v6, v4

    .line 133
    .line 134
    if-eqz v6, :cond_1

    .line 135
    .line 136
    invoke-virtual {p1, v3}, Lio/sentry/o3;->setSampleRate(Ljava/lang/Double;)V

    .line 137
    .line 138
    .line 139
    :cond_1
    const-string v3, "io.sentry.anr.report-debug"

    .line 140
    .line 141
    invoke-virtual {p1}, Lio/sentry/android/core/SentryAndroidOptions;->isAnrReportInDebug()Z

    .line 142
    .line 143
    .line 144
    move-result v6

    .line 145
    invoke-static {p0, p2, v3, v6}, Lio/sentry/android/core/r0;->d(Landroid/os/Bundle;Lio/sentry/g0;Ljava/lang/String;Z)Z

    .line 146
    .line 147
    .line 148
    move-result v3

    .line 149
    invoke-virtual {p1, v3}, Lio/sentry/android/core/SentryAndroidOptions;->setAnrReportInDebug(Z)V

    .line 150
    .line 151
    .line 152
    const-string v3, "io.sentry.anr.timeout-interval-millis"

    .line 153
    .line 154
    invoke-virtual {p1}, Lio/sentry/android/core/SentryAndroidOptions;->getAnrTimeoutIntervalMillis()J

    .line 155
    .line 156
    .line 157
    move-result-wide v6

    .line 158
    invoke-static {p0, p2, v3, v6, v7}, Lio/sentry/android/core/r0;->g(Landroid/os/Bundle;Lio/sentry/g0;Ljava/lang/String;J)J

    .line 159
    .line 160
    .line 161
    move-result-wide v6

    .line 162
    invoke-virtual {p1, v6, v7}, Lio/sentry/android/core/SentryAndroidOptions;->setAnrTimeoutIntervalMillis(J)V

    .line 163
    .line 164
    .line 165
    const-string v3, "io.sentry.dsn"

    .line 166
    .line 167
    invoke-virtual {p1}, Lio/sentry/o3;->getDsn()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v6

    .line 171
    invoke-static {p0, p2, v3, v6}, Lio/sentry/android/core/r0;->h(Landroid/os/Bundle;Lio/sentry/g0;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v3

    .line 175
    if-nez v3, :cond_2

    .line 176
    .line 177
    invoke-virtual {p1}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 178
    .line 179
    .line 180
    move-result-object v6

    .line 181
    sget-object v7, Lio/sentry/n3;->FATAL:Lio/sentry/n3;

    .line 182
    .line 183
    const-string v8, "DSN is required. Use empty string to disable SDK."

    .line 184
    .line 185
    new-array v9, v2, [Ljava/lang/Object;

    .line 186
    .line 187
    invoke-interface {v6, v7, v8, v9}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    goto :goto_0

    .line 191
    :cond_2
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    .line 192
    .line 193
    .line 194
    move-result v6

    .line 195
    if-eqz v6, :cond_3

    .line 196
    .line 197
    invoke-virtual {p1}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 198
    .line 199
    .line 200
    move-result-object v6

    .line 201
    sget-object v7, Lio/sentry/n3;->DEBUG:Lio/sentry/n3;

    .line 202
    .line 203
    const-string v8, "DSN is empty, disabling sentry-android"

    .line 204
    .line 205
    new-array v9, v2, [Ljava/lang/Object;

    .line 206
    .line 207
    invoke-interface {v6, v7, v8, v9}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 208
    .line 209
    .line 210
    :cond_3
    :goto_0
    invoke-virtual {p1, v3}, Lio/sentry/o3;->setDsn(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    const-string v3, "io.sentry.ndk.enable"

    .line 214
    .line 215
    invoke-virtual {p1}, Lio/sentry/o3;->isEnableNdk()Z

    .line 216
    .line 217
    .line 218
    move-result v6

    .line 219
    invoke-static {p0, p2, v3, v6}, Lio/sentry/android/core/r0;->d(Landroid/os/Bundle;Lio/sentry/g0;Ljava/lang/String;Z)Z

    .line 220
    .line 221
    .line 222
    move-result v3

    .line 223
    invoke-virtual {p1, v3}, Lio/sentry/o3;->setEnableNdk(Z)V

    .line 224
    .line 225
    .line 226
    const-string v3, "io.sentry.ndk.scope-sync.enable"

    .line 227
    .line 228
    invoke-virtual {p1}, Lio/sentry/o3;->isEnableScopeSync()Z

    .line 229
    .line 230
    .line 231
    move-result v6

    .line 232
    invoke-static {p0, p2, v3, v6}, Lio/sentry/android/core/r0;->d(Landroid/os/Bundle;Lio/sentry/g0;Ljava/lang/String;Z)Z

    .line 233
    .line 234
    .line 235
    move-result v3

    .line 236
    invoke-virtual {p1, v3}, Lio/sentry/o3;->setEnableScopeSync(Z)V

    .line 237
    .line 238
    .line 239
    const-string v3, "io.sentry.release"

    .line 240
    .line 241
    invoke-virtual {p1}, Lio/sentry/o3;->getRelease()Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v6

    .line 245
    invoke-static {p0, p2, v3, v6}, Lio/sentry/android/core/r0;->h(Landroid/os/Bundle;Lio/sentry/g0;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v3

    .line 249
    invoke-virtual {p1, v3}, Lio/sentry/o3;->setRelease(Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    const-string v3, "io.sentry.environment"

    .line 253
    .line 254
    invoke-virtual {p1}, Lio/sentry/o3;->getEnvironment()Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v6

    .line 258
    invoke-static {p0, p2, v3, v6}, Lio/sentry/android/core/r0;->h(Landroid/os/Bundle;Lio/sentry/g0;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v3

    .line 262
    invoke-virtual {p1, v3}, Lio/sentry/o3;->setEnvironment(Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    const-string v3, "io.sentry.session-tracking.timeout-interval-millis"

    .line 266
    .line 267
    invoke-virtual {p1}, Lio/sentry/o3;->getSessionTrackingIntervalMillis()J

    .line 268
    .line 269
    .line 270
    move-result-wide v6

    .line 271
    invoke-static {p0, p2, v3, v6, v7}, Lio/sentry/android/core/r0;->g(Landroid/os/Bundle;Lio/sentry/g0;Ljava/lang/String;J)J

    .line 272
    .line 273
    .line 274
    move-result-wide v6

    .line 275
    invoke-virtual {p1, v6, v7}, Lio/sentry/o3;->setSessionTrackingIntervalMillis(J)V

    .line 276
    .line 277
    .line 278
    const-string v3, "io.sentry.breadcrumbs.activity-lifecycle"

    .line 279
    .line 280
    invoke-virtual {p1}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableActivityLifecycleBreadcrumbs()Z

    .line 281
    .line 282
    .line 283
    move-result v6

    .line 284
    invoke-static {p0, p2, v3, v6}, Lio/sentry/android/core/r0;->d(Landroid/os/Bundle;Lio/sentry/g0;Ljava/lang/String;Z)Z

    .line 285
    .line 286
    .line 287
    move-result v3

    .line 288
    invoke-virtual {p1, v3}, Lio/sentry/android/core/SentryAndroidOptions;->setEnableActivityLifecycleBreadcrumbs(Z)V

    .line 289
    .line 290
    .line 291
    const-string v3, "io.sentry.breadcrumbs.app-lifecycle"

    .line 292
    .line 293
    invoke-virtual {p1}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableAppComponentBreadcrumbs()Z

    .line 294
    .line 295
    .line 296
    move-result v6

    .line 297
    invoke-static {p0, p2, v3, v6}, Lio/sentry/android/core/r0;->d(Landroid/os/Bundle;Lio/sentry/g0;Ljava/lang/String;Z)Z

    .line 298
    .line 299
    .line 300
    move-result v3

    .line 301
    invoke-virtual {p1, v3}, Lio/sentry/android/core/SentryAndroidOptions;->setEnableAppLifecycleBreadcrumbs(Z)V

    .line 302
    .line 303
    .line 304
    const-string v3, "io.sentry.breadcrumbs.system-events"

    .line 305
    .line 306
    invoke-virtual {p1}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableSystemEventBreadcrumbs()Z

    .line 307
    .line 308
    .line 309
    move-result v6

    .line 310
    invoke-static {p0, p2, v3, v6}, Lio/sentry/android/core/r0;->d(Landroid/os/Bundle;Lio/sentry/g0;Ljava/lang/String;Z)Z

    .line 311
    .line 312
    .line 313
    move-result v3

    .line 314
    invoke-virtual {p1, v3}, Lio/sentry/android/core/SentryAndroidOptions;->setEnableSystemEventBreadcrumbs(Z)V

    .line 315
    .line 316
    .line 317
    const-string v3, "io.sentry.breadcrumbs.app-components"

    .line 318
    .line 319
    invoke-virtual {p1}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableAppComponentBreadcrumbs()Z

    .line 320
    .line 321
    .line 322
    move-result v6

    .line 323
    invoke-static {p0, p2, v3, v6}, Lio/sentry/android/core/r0;->d(Landroid/os/Bundle;Lio/sentry/g0;Ljava/lang/String;Z)Z

    .line 324
    .line 325
    .line 326
    move-result v3

    .line 327
    invoke-virtual {p1, v3}, Lio/sentry/android/core/SentryAndroidOptions;->setEnableAppComponentBreadcrumbs(Z)V

    .line 328
    .line 329
    .line 330
    const-string v3, "io.sentry.breadcrumbs.user-interaction"

    .line 331
    .line 332
    invoke-virtual {p1}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableUserInteractionBreadcrumbs()Z

    .line 333
    .line 334
    .line 335
    move-result v6

    .line 336
    invoke-static {p0, p2, v3, v6}, Lio/sentry/android/core/r0;->d(Landroid/os/Bundle;Lio/sentry/g0;Ljava/lang/String;Z)Z

    .line 337
    .line 338
    .line 339
    move-result v3

    .line 340
    invoke-virtual {p1, v3}, Lio/sentry/android/core/SentryAndroidOptions;->setEnableUserInteractionBreadcrumbs(Z)V

    .line 341
    .line 342
    .line 343
    const-string v3, "io.sentry.uncaught-exception-handler.enable"

    .line 344
    .line 345
    invoke-virtual {p1}, Lio/sentry/o3;->isEnableUncaughtExceptionHandler()Z

    .line 346
    .line 347
    .line 348
    move-result v6

    .line 349
    invoke-static {p0, p2, v3, v6}, Lio/sentry/android/core/r0;->d(Landroid/os/Bundle;Lio/sentry/g0;Ljava/lang/String;Z)Z

    .line 350
    .line 351
    .line 352
    move-result v3

    .line 353
    invoke-virtual {p1, v3}, Lio/sentry/o3;->setEnableUncaughtExceptionHandler(Z)V

    .line 354
    .line 355
    .line 356
    const-string v3, "io.sentry.attach-threads"

    .line 357
    .line 358
    invoke-virtual {p1}, Lio/sentry/o3;->isAttachThreads()Z

    .line 359
    .line 360
    .line 361
    move-result v6

    .line 362
    invoke-static {p0, p2, v3, v6}, Lio/sentry/android/core/r0;->d(Landroid/os/Bundle;Lio/sentry/g0;Ljava/lang/String;Z)Z

    .line 363
    .line 364
    .line 365
    move-result v3

    .line 366
    invoke-virtual {p1, v3}, Lio/sentry/o3;->setAttachThreads(Z)V

    .line 367
    .line 368
    .line 369
    const-string v3, "io.sentry.attach-screenshot"

    .line 370
    .line 371
    invoke-virtual {p1}, Lio/sentry/android/core/SentryAndroidOptions;->isAttachScreenshot()Z

    .line 372
    .line 373
    .line 374
    move-result v6

    .line 375
    invoke-static {p0, p2, v3, v6}, Lio/sentry/android/core/r0;->d(Landroid/os/Bundle;Lio/sentry/g0;Ljava/lang/String;Z)Z

    .line 376
    .line 377
    .line 378
    move-result v3

    .line 379
    invoke-virtual {p1, v3}, Lio/sentry/android/core/SentryAndroidOptions;->setAttachScreenshot(Z)V

    .line 380
    .line 381
    .line 382
    const-string v3, "io.sentry.send-client-reports"

    .line 383
    .line 384
    invoke-virtual {p1}, Lio/sentry/o3;->isSendClientReports()Z

    .line 385
    .line 386
    .line 387
    move-result v6

    .line 388
    invoke-static {p0, p2, v3, v6}, Lio/sentry/android/core/r0;->d(Landroid/os/Bundle;Lio/sentry/g0;Ljava/lang/String;Z)Z

    .line 389
    .line 390
    .line 391
    move-result v3

    .line 392
    invoke-virtual {p1, v3}, Lio/sentry/o3;->setSendClientReports(Z)V

    .line 393
    .line 394
    .line 395
    const-string v3, "io.sentry.additional-context"

    .line 396
    .line 397
    invoke-virtual {p1}, Lio/sentry/android/core/SentryAndroidOptions;->isCollectAdditionalContext()Z

    .line 398
    .line 399
    .line 400
    move-result v6

    .line 401
    invoke-static {p0, p2, v3, v6}, Lio/sentry/android/core/r0;->d(Landroid/os/Bundle;Lio/sentry/g0;Ljava/lang/String;Z)Z

    .line 402
    .line 403
    .line 404
    move-result v3

    .line 405
    invoke-virtual {p1, v3}, Lio/sentry/android/core/SentryAndroidOptions;->setCollectAdditionalContext(Z)V

    .line 406
    .line 407
    .line 408
    invoke-virtual {p1}, Lio/sentry/o3;->getTracesSampleRate()Ljava/lang/Double;

    .line 409
    .line 410
    .line 411
    move-result-object v3

    .line 412
    if-nez v3, :cond_4

    .line 413
    .line 414
    const-string v3, "io.sentry.traces.sample-rate"

    .line 415
    .line 416
    invoke-static {p0, p2, v3}, Lio/sentry/android/core/r0;->e(Landroid/os/Bundle;Lio/sentry/g0;Ljava/lang/String;)Ljava/lang/Double;

    .line 417
    .line 418
    .line 419
    move-result-object v3

    .line 420
    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    .line 421
    .line 422
    .line 423
    move-result-wide v6

    .line 424
    cmpl-double v6, v6, v4

    .line 425
    .line 426
    if-eqz v6, :cond_4

    .line 427
    .line 428
    invoke-virtual {p1, v3}, Lio/sentry/o3;->setTracesSampleRate(Ljava/lang/Double;)V

    .line 429
    .line 430
    .line 431
    :cond_4
    const-string v3, "io.sentry.traces.trace-sampling"

    .line 432
    .line 433
    invoke-virtual {p1}, Lio/sentry/o3;->isTraceSampling()Z

    .line 434
    .line 435
    .line 436
    move-result v6

    .line 437
    invoke-static {p0, p2, v3, v6}, Lio/sentry/android/core/r0;->d(Landroid/os/Bundle;Lio/sentry/g0;Ljava/lang/String;Z)Z

    .line 438
    .line 439
    .line 440
    move-result v3

    .line 441
    invoke-virtual {p1, v3}, Lio/sentry/o3;->setTraceSampling(Z)V

    .line 442
    .line 443
    .line 444
    const-string v3, "io.sentry.traces.activity.enable"

    .line 445
    .line 446
    invoke-virtual {p1}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableAutoActivityLifecycleTracing()Z

    .line 447
    .line 448
    .line 449
    move-result v6

    .line 450
    invoke-static {p0, p2, v3, v6}, Lio/sentry/android/core/r0;->d(Landroid/os/Bundle;Lio/sentry/g0;Ljava/lang/String;Z)Z

    .line 451
    .line 452
    .line 453
    move-result v3

    .line 454
    invoke-virtual {p1, v3}, Lio/sentry/android/core/SentryAndroidOptions;->setEnableAutoActivityLifecycleTracing(Z)V

    .line 455
    .line 456
    .line 457
    const-string v3, "io.sentry.traces.activity.auto-finish.enable"

    .line 458
    .line 459
    invoke-virtual {p1}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableActivityLifecycleTracingAutoFinish()Z

    .line 460
    .line 461
    .line 462
    move-result v6

    .line 463
    invoke-static {p0, p2, v3, v6}, Lio/sentry/android/core/r0;->d(Landroid/os/Bundle;Lio/sentry/g0;Ljava/lang/String;Z)Z

    .line 464
    .line 465
    .line 466
    move-result v3

    .line 467
    invoke-virtual {p1, v3}, Lio/sentry/android/core/SentryAndroidOptions;->setEnableActivityLifecycleTracingAutoFinish(Z)V

    .line 468
    .line 469
    .line 470
    const-string v3, "io.sentry.traces.profiling.enable"

    .line 471
    .line 472
    invoke-virtual {p1}, Lio/sentry/o3;->isProfilingEnabled()Z

    .line 473
    .line 474
    .line 475
    move-result v6

    .line 476
    invoke-static {p0, p2, v3, v6}, Lio/sentry/android/core/r0;->d(Landroid/os/Bundle;Lio/sentry/g0;Ljava/lang/String;Z)Z

    .line 477
    .line 478
    .line 479
    move-result v3

    .line 480
    invoke-virtual {p1, v3}, Lio/sentry/o3;->setProfilingEnabled(Z)V

    .line 481
    .line 482
    .line 483
    invoke-virtual {p1}, Lio/sentry/o3;->getProfilesSampleRate()Ljava/lang/Double;

    .line 484
    .line 485
    .line 486
    move-result-object v3

    .line 487
    if-nez v3, :cond_5

    .line 488
    .line 489
    const-string v3, "io.sentry.traces.profiling.sample-rate"

    .line 490
    .line 491
    invoke-static {p0, p2, v3}, Lio/sentry/android/core/r0;->e(Landroid/os/Bundle;Lio/sentry/g0;Ljava/lang/String;)Ljava/lang/Double;

    .line 492
    .line 493
    .line 494
    move-result-object v3

    .line 495
    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    .line 496
    .line 497
    .line 498
    move-result-wide v6

    .line 499
    cmpl-double v4, v6, v4

    .line 500
    .line 501
    if-eqz v4, :cond_5

    .line 502
    .line 503
    invoke-virtual {p1, v3}, Lio/sentry/o3;->setProfilesSampleRate(Ljava/lang/Double;)V

    .line 504
    .line 505
    .line 506
    :cond_5
    const-string v3, "io.sentry.traces.user-interaction.enable"

    .line 507
    .line 508
    invoke-virtual {p1}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableUserInteractionTracing()Z

    .line 509
    .line 510
    .line 511
    move-result v4

    .line 512
    invoke-static {p0, p2, v3, v4}, Lio/sentry/android/core/r0;->d(Landroid/os/Bundle;Lio/sentry/g0;Ljava/lang/String;Z)Z

    .line 513
    .line 514
    .line 515
    move-result v3

    .line 516
    invoke-virtual {p1, v3}, Lio/sentry/android/core/SentryAndroidOptions;->setEnableUserInteractionTracing(Z)V

    .line 517
    .line 518
    .line 519
    const-string v3, "io.sentry.traces.idle-timeout"

    .line 520
    .line 521
    const-wide/16 v4, -0x1

    .line 522
    .line 523
    invoke-static {p0, p2, v3, v4, v5}, Lio/sentry/android/core/r0;->g(Landroid/os/Bundle;Lio/sentry/g0;Ljava/lang/String;J)J

    .line 524
    .line 525
    .line 526
    move-result-wide v6

    .line 527
    cmp-long v3, v6, v4

    .line 528
    .line 529
    if-eqz v3, :cond_6

    .line 530
    .line 531
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 532
    .line 533
    .line 534
    move-result-object v3

    .line 535
    invoke-virtual {p1, v3}, Lio/sentry/o3;->setIdleTimeout(Ljava/lang/Long;)V

    .line 536
    .line 537
    .line 538
    :cond_6
    invoke-static {p0, p2, v1}, Lio/sentry/android/core/r0;->f(Landroid/os/Bundle;Lio/sentry/g0;Ljava/lang/String;)Ljava/util/List;

    .line 539
    .line 540
    .line 541
    move-result-object v3

    .line 542
    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 543
    .line 544
    .line 545
    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 546
    const-string v5, "io.sentry.traces.tracing-origins"

    .line 547
    .line 548
    if-nez v4, :cond_8

    .line 549
    .line 550
    if-eqz v3, :cond_7

    .line 551
    .line 552
    :try_start_1
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 553
    .line 554
    .line 555
    move-result v4

    .line 556
    if-eqz v4, :cond_8

    .line 557
    .line 558
    :cond_7
    invoke-static {p0, p2, v5}, Lio/sentry/android/core/r0;->f(Landroid/os/Bundle;Lio/sentry/g0;Ljava/lang/String;)Ljava/util/List;

    .line 559
    .line 560
    .line 561
    move-result-object v3

    .line 562
    :cond_8
    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 563
    .line 564
    .line 565
    move-result v1

    .line 566
    if-nez v1, :cond_9

    .line 567
    .line 568
    invoke-virtual {p0, v5}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 569
    .line 570
    .line 571
    move-result v1

    .line 572
    if-eqz v1, :cond_a

    .line 573
    .line 574
    :cond_9
    if-nez v3, :cond_a

    .line 575
    .line 576
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 577
    .line 578
    .line 579
    move-result-object v1

    .line 580
    invoke-virtual {p1, v1}, Lio/sentry/o3;->setTracePropagationTargets(Ljava/util/List;)V

    .line 581
    .line 582
    .line 583
    goto :goto_1

    .line 584
    :cond_a
    if-eqz v3, :cond_b

    .line 585
    .line 586
    invoke-virtual {p1, v3}, Lio/sentry/o3;->setTracePropagationTargets(Ljava/util/List;)V

    .line 587
    .line 588
    .line 589
    :cond_b
    :goto_1
    const-string v1, "io.sentry.traces.frames-tracking"

    .line 590
    .line 591
    const/4 v3, 0x1

    .line 592
    invoke-static {p0, p2, v1, v3}, Lio/sentry/android/core/r0;->d(Landroid/os/Bundle;Lio/sentry/g0;Ljava/lang/String;Z)Z

    .line 593
    .line 594
    .line 595
    move-result v1

    .line 596
    invoke-virtual {p1, v1}, Lio/sentry/android/core/SentryAndroidOptions;->setEnableFramesTracking(Z)V

    .line 597
    .line 598
    .line 599
    const-string v1, "io.sentry.proguard-uuid"

    .line 600
    .line 601
    invoke-virtual {p1}, Lio/sentry/o3;->getProguardUuid()Ljava/lang/String;

    .line 602
    .line 603
    .line 604
    move-result-object v3

    .line 605
    invoke-static {p0, p2, v1, v3}, Lio/sentry/android/core/r0;->h(Landroid/os/Bundle;Lio/sentry/g0;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 606
    .line 607
    .line 608
    move-result-object v1

    .line 609
    invoke-virtual {p1, v1}, Lio/sentry/o3;->setProguardUuid(Ljava/lang/String;)V

    .line 610
    .line 611
    .line 612
    invoke-virtual {p1}, Lio/sentry/o3;->getSdkVersion()Lio/sentry/protocol/n;

    .line 613
    .line 614
    .line 615
    move-result-object v1

    .line 616
    if-nez v1, :cond_c

    .line 617
    .line 618
    new-instance v1, Lio/sentry/protocol/n;

    .line 619
    .line 620
    invoke-direct {v1, v0, v0}, Lio/sentry/protocol/n;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 621
    .line 622
    .line 623
    :cond_c
    const-string v0, "io.sentry.sdk.name"

    .line 624
    .line 625
    invoke-virtual {v1}, Lio/sentry/protocol/n;->f()Ljava/lang/String;

    .line 626
    .line 627
    .line 628
    move-result-object v3

    .line 629
    invoke-static {p0, p2, v0, v3}, Lio/sentry/android/core/r0;->i(Landroid/os/Bundle;Lio/sentry/g0;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 630
    .line 631
    .line 632
    move-result-object v0

    .line 633
    invoke-virtual {v1, v0}, Lio/sentry/protocol/n;->i(Ljava/lang/String;)V

    .line 634
    .line 635
    .line 636
    const-string v0, "io.sentry.sdk.version"

    .line 637
    .line 638
    invoke-virtual {v1}, Lio/sentry/protocol/n;->h()Ljava/lang/String;

    .line 639
    .line 640
    .line 641
    move-result-object v3

    .line 642
    invoke-static {p0, p2, v0, v3}, Lio/sentry/android/core/r0;->i(Landroid/os/Bundle;Lio/sentry/g0;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 643
    .line 644
    .line 645
    move-result-object v0

    .line 646
    invoke-virtual {v1, v0}, Lio/sentry/protocol/n;->k(Ljava/lang/String;)V

    .line 647
    .line 648
    .line 649
    invoke-virtual {p1, v1}, Lio/sentry/o3;->setSdkVersion(Lio/sentry/protocol/n;)V

    .line 650
    .line 651
    .line 652
    const-string v0, "io.sentry.send-default-pii"

    .line 653
    .line 654
    invoke-virtual {p1}, Lio/sentry/o3;->isSendDefaultPii()Z

    .line 655
    .line 656
    .line 657
    move-result v1

    .line 658
    invoke-static {p0, p2, v0, v1}, Lio/sentry/android/core/r0;->d(Landroid/os/Bundle;Lio/sentry/g0;Ljava/lang/String;Z)Z

    .line 659
    .line 660
    .line 661
    move-result p0

    .line 662
    invoke-virtual {p1, p0}, Lio/sentry/o3;->setSendDefaultPii(Z)V

    .line 663
    .line 664
    .line 665
    :cond_d
    invoke-virtual {p1}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 666
    .line 667
    .line 668
    move-result-object p0

    .line 669
    sget-object p2, Lio/sentry/n3;->INFO:Lio/sentry/n3;

    .line 670
    .line 671
    const-string v0, "Retrieving configuration from AndroidManifest.xml"

    .line 672
    .line 673
    new-array v1, v2, [Ljava/lang/Object;

    .line 674
    .line 675
    invoke-interface {p0, p2, v0, v1}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 676
    .line 677
    .line 678
    goto :goto_2

    .line 679
    :catchall_0
    move-exception p0

    .line 680
    invoke-virtual {p1}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 681
    .line 682
    .line 683
    move-result-object p1

    .line 684
    sget-object p2, Lio/sentry/n3;->ERROR:Lio/sentry/n3;

    .line 685
    .line 686
    const-string v0, "Failed to read configuration from android manifest metadata."

    .line 687
    .line 688
    invoke-interface {p1, p2, v0, p0}, Lio/sentry/g0;->b(Lio/sentry/n3;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 689
    .line 690
    .line 691
    :goto_2
    return-void
.end method

.method private static b(Landroid/content/Context;Lio/sentry/g0;Lio/sentry/android/core/f0;)Landroid/os/Bundle;
    .locals 2

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    new-instance p2, Lio/sentry/android/core/f0;

    .line 5
    .line 6
    invoke-direct {p2, p1}, Lio/sentry/android/core/f0;-><init>(Lio/sentry/g0;)V

    .line 7
    .line 8
    .line 9
    :goto_0
    const-wide/16 v0, 0x80

    .line 10
    .line 11
    invoke-static {p0, v0, v1, p2}, Lio/sentry/android/core/h0;->a(Landroid/content/Context;JLio/sentry/android/core/f0;)Landroid/content/pm/ApplicationInfo;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    iget-object p0, p0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 16
    .line 17
    return-object p0
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
.end method

.method static c(Landroid/content/Context;Lio/sentry/g0;)Z
    .locals 3

    .line 1
    const-string v0, "The application context is required."

    .line 2
    .line 3
    invoke-static {p0, v0}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    const/4 v1, 0x1

    .line 8
    :try_start_0
    invoke-static {p0, p1, v0}, Lio/sentry/android/core/r0;->b(Landroid/content/Context;Lio/sentry/g0;Lio/sentry/android/core/f0;)Landroid/os/Bundle;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    const-string v0, "io.sentry.auto-init"

    .line 15
    .line 16
    invoke-static {p0, p1, v0, v1}, Lio/sentry/android/core/r0;->d(Landroid/os/Bundle;Lio/sentry/g0;Ljava/lang/String;Z)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    :cond_0
    sget-object p0, Lio/sentry/n3;->INFO:Lio/sentry/n3;

    .line 21
    .line 22
    const-string v0, "Retrieving auto-init from AndroidManifest.xml"

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    new-array v2, v2, [Ljava/lang/Object;

    .line 26
    .line 27
    invoke-interface {p1, p0, v0, v2}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception p0

    .line 32
    sget-object v0, Lio/sentry/n3;->ERROR:Lio/sentry/n3;

    .line 33
    .line 34
    const-string v2, "Failed to read auto-init from android manifest metadata."

    .line 35
    .line 36
    invoke-interface {p1, v0, v2, p0}, Lio/sentry/g0;->b(Lio/sentry/n3;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    :goto_0
    return v1
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
.end method

.method private static d(Landroid/os/Bundle;Lio/sentry/g0;Ljava/lang/String;Z)Z
    .locals 2

    .line 1
    invoke-virtual {p0, p2, p3}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    sget-object p3, Lio/sentry/n3;->DEBUG:Lio/sentry/n3;

    .line 6
    .line 7
    const/4 v0, 0x2

    .line 8
    new-array v0, v0, [Ljava/lang/Object;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    aput-object p2, v0, v1

    .line 12
    .line 13
    const/4 p2, 0x1

    .line 14
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    aput-object v1, v0, p2

    .line 19
    .line 20
    const-string p2, "%s read: %s"

    .line 21
    .line 22
    invoke-interface {p1, p3, p2, v0}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    return p0
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
.end method

.method private static e(Landroid/os/Bundle;Lio/sentry/g0;Ljava/lang/String;)Ljava/lang/Double;
    .locals 3

    .line 1
    const/high16 v0, -0x40800000    # -1.0f

    .line 2
    .line 3
    invoke-virtual {p0, p2, v0}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;F)F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Ljava/lang/Float;->doubleValue()D

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    sget-object v0, Lio/sentry/n3;->DEBUG:Lio/sentry/n3;

    .line 20
    .line 21
    const/4 v1, 0x2

    .line 22
    new-array v1, v1, [Ljava/lang/Object;

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    aput-object p2, v1, v2

    .line 26
    .line 27
    const/4 p2, 0x1

    .line 28
    aput-object p0, v1, p2

    .line 29
    .line 30
    const-string p2, "%s read: %s"

    .line 31
    .line 32
    invoke-interface {p1, v0, p2, v1}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    return-object p0
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
.end method

.method private static f(Landroid/os/Bundle;Lio/sentry/g0;Ljava/lang/String;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Bundle;",
            "Lio/sentry/g0;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object v0, Lio/sentry/n3;->DEBUG:Lio/sentry/n3;

    .line 6
    .line 7
    const/4 v1, 0x2

    .line 8
    new-array v1, v1, [Ljava/lang/Object;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    aput-object p2, v1, v2

    .line 12
    .line 13
    const/4 p2, 0x1

    .line 14
    aput-object p0, v1, p2

    .line 15
    .line 16
    const-string p2, "%s read: %s"

    .line 17
    .line 18
    invoke-interface {p1, v0, p2, v1}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    if-eqz p0, :cond_0

    .line 22
    .line 23
    const-string p1, ","

    .line 24
    .line 25
    const/4 p2, -0x1

    .line 26
    invoke-virtual {p0, p1, p2}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0

    .line 35
    :cond_0
    const/4 p0, 0x0

    .line 36
    return-object p0
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
.end method

.method private static g(Landroid/os/Bundle;Lio/sentry/g0;Ljava/lang/String;J)J
    .locals 2

    .line 1
    long-to-int p3, p3

    .line 2
    invoke-virtual {p0, p2, p3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 3
    .line 4
    .line 5
    move-result p0

    .line 6
    int-to-long p3, p0

    .line 7
    sget-object p0, Lio/sentry/n3;->DEBUG:Lio/sentry/n3;

    .line 8
    .line 9
    const/4 v0, 0x2

    .line 10
    new-array v0, v0, [Ljava/lang/Object;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    aput-object p2, v0, v1

    .line 14
    .line 15
    const/4 p2, 0x1

    .line 16
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    aput-object v1, v0, p2

    .line 21
    .line 22
    const-string p2, "%s read: %s"

    .line 23
    .line 24
    invoke-interface {p1, p0, p2, v0}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    return-wide p3
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
.end method

.method private static h(Landroid/os/Bundle;Lio/sentry/g0;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0, p2, p3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object p3, Lio/sentry/n3;->DEBUG:Lio/sentry/n3;

    .line 6
    .line 7
    const/4 v0, 0x2

    .line 8
    new-array v0, v0, [Ljava/lang/Object;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    aput-object p2, v0, v1

    .line 12
    .line 13
    const/4 p2, 0x1

    .line 14
    aput-object p0, v0, p2

    .line 15
    .line 16
    const-string p2, "%s read: %s"

    .line 17
    .line 18
    invoke-interface {p1, p3, p2, v0}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    return-object p0
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
.end method

.method private static i(Landroid/os/Bundle;Lio/sentry/g0;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0, p2, p3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object p3, Lio/sentry/n3;->DEBUG:Lio/sentry/n3;

    .line 6
    .line 7
    const/4 v0, 0x2

    .line 8
    new-array v0, v0, [Ljava/lang/Object;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    aput-object p2, v0, v1

    .line 12
    .line 13
    const/4 p2, 0x1

    .line 14
    aput-object p0, v0, p2

    .line 15
    .line 16
    const-string p2, "%s read: %s"

    .line 17
    .line 18
    invoke-interface {p1, p3, p2, v0}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    return-object p0
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
.end method
