.class public final Lcom/google/android/gms/internal/gtm/zzft;
.super Lcom/google/android/gms/internal/gtm/zzbs;
.source "SourceFile"


# instance fields
.field protected zza:Ljava/lang/String;

.field protected zzb:Ljava/lang/String;

.field protected zzc:Z

.field protected zzd:I

.field protected zze:Z

.field protected zzf:Z


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/gtm/zzbv;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/gtm/zzbs;-><init>(Lcom/google/android/gms/internal/gtm/zzbv;)V

    return-void
.end method


# virtual methods
.method public final zzc()Z
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/gtm/zzbs;->zzW()V

    iget-boolean v0, p0, Lcom/google/android/gms/internal/gtm/zzft;->zzf:Z

    return v0
.end method

.method protected final zzd()V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/gtm/zzbr;->zzo()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :try_start_0
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/16 v2, 0x80

    .line 14
    .line 15
    invoke-virtual {v1, v0, v2}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    .line 16
    .line 17
    .line 18
    move-result-object v0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    goto :goto_0

    .line 20
    :catch_0
    move-exception v0

    .line 21
    const-string v1, "PackageManager doesn\'t know about the app package"

    .line 22
    .line 23
    invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/internal/gtm/zzbr;->zzS(Ljava/lang/String;Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    :goto_0
    if-nez v0, :cond_0

    .line 28
    .line 29
    const-string v0, "Couldn\'t get ApplicationInfo to load global config"

    .line 30
    .line 31
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/gtm/zzbr;->zzR(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_0
    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 36
    .line 37
    if-eqz v0, :cond_a

    .line 38
    .line 39
    const-string v1, "com.google.android.gms.analytics.globalConfigResource"

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-lez v0, :cond_a

    .line 46
    .line 47
    invoke-virtual {p0}, Lcom/google/android/gms/internal/gtm/zzbr;->zzt()Lcom/google/android/gms/internal/gtm/zzbv;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    new-instance v2, Lcom/google/android/gms/internal/gtm/zzev;

    .line 52
    .line 53
    invoke-direct {v2, v1}, Lcom/google/android/gms/internal/gtm/zzev;-><init>(Lcom/google/android/gms/internal/gtm/zzbv;)V

    .line 54
    .line 55
    .line 56
    new-instance v3, Lcom/google/android/gms/internal/gtm/zzcs;

    .line 57
    .line 58
    invoke-direct {v3, v1, v2}, Lcom/google/android/gms/internal/gtm/zzcs;-><init>(Lcom/google/android/gms/internal/gtm/zzbv;Lcom/google/android/gms/internal/gtm/zzcr;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v3, v0}, Lcom/google/android/gms/internal/gtm/zzcs;->zza(I)Lcom/google/android/gms/internal/gtm/zzcq;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    check-cast v0, Lcom/google/android/gms/internal/gtm/zzew;

    .line 66
    .line 67
    if-eqz v0, :cond_a

    .line 68
    .line 69
    const-string v1, "Loading global XML config values"

    .line 70
    .line 71
    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/gtm/zzbr;->zzO(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    iget-object v1, v0, Lcom/google/android/gms/internal/gtm/zzew;->zza:Ljava/lang/String;

    .line 75
    .line 76
    if-eqz v1, :cond_1

    .line 77
    .line 78
    iput-object v1, p0, Lcom/google/android/gms/internal/gtm/zzft;->zzb:Ljava/lang/String;

    .line 79
    .line 80
    const-string v2, "XML config - app name"

    .line 81
    .line 82
    invoke-virtual {p0, v2, v1}, Lcom/google/android/gms/internal/gtm/zzbr;->zzG(Ljava/lang/String;Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    :cond_1
    iget-object v1, v0, Lcom/google/android/gms/internal/gtm/zzew;->zzb:Ljava/lang/String;

    .line 86
    .line 87
    if-eqz v1, :cond_2

    .line 88
    .line 89
    iput-object v1, p0, Lcom/google/android/gms/internal/gtm/zzft;->zza:Ljava/lang/String;

    .line 90
    .line 91
    const-string v2, "XML config - app version"

    .line 92
    .line 93
    invoke-virtual {p0, v2, v1}, Lcom/google/android/gms/internal/gtm/zzbr;->zzG(Ljava/lang/String;Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    :cond_2
    iget-object v1, v0, Lcom/google/android/gms/internal/gtm/zzew;->zzc:Ljava/lang/String;

    .line 97
    .line 98
    const/4 v2, 0x0

    .line 99
    const/4 v3, -0x1

    .line 100
    const/4 v4, 0x1

    .line 101
    if-eqz v1, :cond_7

    .line 102
    .line 103
    sget-object v5, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 104
    .line 105
    invoke-virtual {v1, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    const-string v5, "verbose"

    .line 110
    .line 111
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v5

    .line 115
    if-eqz v5, :cond_3

    .line 116
    .line 117
    move v1, v2

    .line 118
    goto :goto_1

    .line 119
    :cond_3
    const-string v5, "info"

    .line 120
    .line 121
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v5

    .line 125
    if-eqz v5, :cond_4

    .line 126
    .line 127
    move v1, v4

    .line 128
    goto :goto_1

    .line 129
    :cond_4
    const-string v5, "warning"

    .line 130
    .line 131
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v5

    .line 135
    if-eqz v5, :cond_5

    .line 136
    .line 137
    const/4 v1, 0x2

    .line 138
    goto :goto_1

    .line 139
    :cond_5
    const-string v5, "error"

    .line 140
    .line 141
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v1

    .line 145
    if-eqz v1, :cond_6

    .line 146
    .line 147
    const/4 v1, 0x3

    .line 148
    goto :goto_1

    .line 149
    :cond_6
    move v1, v3

    .line 150
    :goto_1
    if-ltz v1, :cond_7

    .line 151
    .line 152
    const-string v5, "XML config - log level"

    .line 153
    .line 154
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    invoke-virtual {p0, v5, v1}, Lcom/google/android/gms/internal/gtm/zzbr;->zzP(Ljava/lang/String;Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    :cond_7
    iget v1, v0, Lcom/google/android/gms/internal/gtm/zzew;->zzd:I

    .line 162
    .line 163
    if-ltz v1, :cond_8

    .line 164
    .line 165
    iput v1, p0, Lcom/google/android/gms/internal/gtm/zzft;->zzd:I

    .line 166
    .line 167
    iput-boolean v4, p0, Lcom/google/android/gms/internal/gtm/zzft;->zzc:Z

    .line 168
    .line 169
    const-string v5, "XML config - dispatch period (sec)"

    .line 170
    .line 171
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    invoke-virtual {p0, v5, v1}, Lcom/google/android/gms/internal/gtm/zzbr;->zzG(Ljava/lang/String;Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    :cond_8
    iget v0, v0, Lcom/google/android/gms/internal/gtm/zzew;->zze:I

    .line 179
    .line 180
    if-eq v0, v3, :cond_a

    .line 181
    .line 182
    if-eq v4, v0, :cond_9

    .line 183
    .line 184
    goto :goto_2

    .line 185
    :cond_9
    move v2, v4

    .line 186
    :goto_2
    iput-boolean v2, p0, Lcom/google/android/gms/internal/gtm/zzft;->zzf:Z

    .line 187
    .line 188
    iput-boolean v4, p0, Lcom/google/android/gms/internal/gtm/zzft;->zze:Z

    .line 189
    .line 190
    const-string v0, "XML config - dry run"

    .line 191
    .line 192
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/gtm/zzbr;->zzG(Ljava/lang/String;Ljava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    :cond_a
    return-void
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
.end method

.method public final zze()Z
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/gtm/zzbs;->zzW()V

    iget-boolean v0, p0, Lcom/google/android/gms/internal/gtm/zzft;->zze:Z

    return v0
.end method

.method public final zzf()Z
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/gtm/zzbs;->zzW()V

    const/4 v0, 0x0

    return v0
.end method
