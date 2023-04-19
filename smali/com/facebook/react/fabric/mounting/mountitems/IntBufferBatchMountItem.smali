.class public Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/fabric/mounting/mountitems/MountItem;


# annotations
.annotation build Ld6/a;
.end annotation


# static fields
.field static final INSTRUCTION_CREATE:I = 0x2

.field static final INSTRUCTION_DELETE:I = 0x4

.field static final INSTRUCTION_FLAG_MULTIPLE:I = 0x1

.field static final INSTRUCTION_INSERT:I = 0x8

.field static final INSTRUCTION_REMOVE:I = 0x10

.field static final INSTRUCTION_REMOVE_DELETE_TREE:I = 0x800

.field static final INSTRUCTION_UPDATE_EVENT_EMITTER:I = 0x100

.field static final INSTRUCTION_UPDATE_LAYOUT:I = 0x80

.field static final INSTRUCTION_UPDATE_OVERFLOW_INSET:I = 0x400

.field static final INSTRUCTION_UPDATE_PADDING:I = 0x200

.field static final INSTRUCTION_UPDATE_PROPS:I = 0x20

.field static final INSTRUCTION_UPDATE_STATE:I = 0x40

.field static final TAG:Ljava/lang/String; = "IntBufferBatchMountItem"


# instance fields
.field private final mCommitNumber:I

.field private final mIntBuffer:[I

.field private final mIntBufferLen:I

.field private final mObjBuffer:[Ljava/lang/Object;

.field private final mObjBufferLen:I

.field private final mSurfaceId:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(I[I[Ljava/lang/Object;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->mSurfaceId:I

    .line 5
    .line 6
    iput p4, p0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->mCommitNumber:I

    .line 7
    .line 8
    iput-object p2, p0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->mIntBuffer:[I

    .line 9
    .line 10
    iput-object p3, p0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->mObjBuffer:[Ljava/lang/Object;

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    if-eqz p2, :cond_0

    .line 14
    .line 15
    array-length p2, p2

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move p2, p1

    .line 18
    :goto_0
    iput p2, p0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->mIntBufferLen:I

    .line 19
    .line 20
    if-eqz p3, :cond_1

    .line 21
    .line 22
    array-length p1, p3

    .line 23
    :cond_1
    iput p1, p0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->mObjBufferLen:I

    .line 24
    .line 25
    return-void
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
.end method

.method private beginMarkers(Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "FabricUIManager::"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    const-wide/16 v0, 0x0

    .line 19
    .line 20
    invoke-static {v0, v1, p1}, Lg6/a;->c(JLjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget p1, p0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->mCommitNumber:I

    .line 24
    .line 25
    if-lez p1, :cond_0

    .line 26
    .line 27
    sget-object v0, Lcom/facebook/react/bridge/ReactMarkerConstants;->FABRIC_BATCH_EXECUTION_START:Lcom/facebook/react/bridge/ReactMarkerConstants;

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    invoke-static {v0, v1, p1}, Lcom/facebook/react/bridge/ReactMarker;->logFabricMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;Ljava/lang/String;I)V

    .line 31
    .line 32
    .line 33
    :cond_0
    return-void
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

.method private static castToEventEmitter(Ljava/lang/Object;)Lcom/facebook/react/fabric/events/EventEmitterWrapper;
    .locals 0

    if-eqz p0, :cond_0

    check-cast p0, Lcom/facebook/react/fabric/events/EventEmitterWrapper;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method private static castToState(Ljava/lang/Object;)Lcom/facebook/react/uimanager/StateWrapper;
    .locals 0

    if-eqz p0, :cond_0

    check-cast p0, Lcom/facebook/react/uimanager/StateWrapper;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method private endMarkers()V
    .locals 3

    .line 1
    iget v0, p0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->mCommitNumber:I

    .line 2
    .line 3
    if-lez v0, :cond_0

    .line 4
    .line 5
    sget-object v1, Lcom/facebook/react/bridge/ReactMarkerConstants;->FABRIC_BATCH_EXECUTION_END:Lcom/facebook/react/bridge/ReactMarkerConstants;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-static {v1, v2, v0}, Lcom/facebook/react/bridge/ReactMarker;->logFabricMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;Ljava/lang/String;I)V

    .line 9
    .line 10
    .line 11
    :cond_0
    const-wide/16 v0, 0x0

    .line 12
    .line 13
    invoke-static {v0, v1}, Lg6/a;->g(J)V

    .line 14
    .line 15
    .line 16
    return-void
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
.end method


# virtual methods
.method public execute(Lcom/facebook/react/fabric/mounting/MountingManager;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->mSurfaceId:I

    .line 4
    .line 5
    move-object/from16 v2, p1

    .line 6
    .line 7
    invoke-virtual {v2, v1}, Lcom/facebook/react/fabric/mounting/MountingManager;->getSurfaceManager(I)Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const/4 v9, 0x0

    .line 12
    const/4 v10, 0x1

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    sget-object v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->TAG:Ljava/lang/String;

    .line 16
    .line 17
    new-array v2, v10, [Ljava/lang/Object;

    .line 18
    .line 19
    iget v3, v0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->mSurfaceId:I

    .line 20
    .line 21
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    aput-object v3, v2, v9

    .line 26
    .line 27
    const-string v3, "Skipping batch of MountItems; no SurfaceMountingManager found for [%d]."

    .line 28
    .line 29
    invoke-static {v1, v3, v2}, Lw3/a;->l(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_0
    invoke-virtual {v1}, Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;->isStopped()Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-eqz v2, :cond_1

    .line 38
    .line 39
    sget-object v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->TAG:Ljava/lang/String;

    .line 40
    .line 41
    new-array v2, v10, [Ljava/lang/Object;

    .line 42
    .line 43
    iget v3, v0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->mSurfaceId:I

    .line 44
    .line 45
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    aput-object v3, v2, v9

    .line 50
    .line 51
    const-string v3, "Skipping batch of MountItems; was stopped [%d]."

    .line 52
    .line 53
    invoke-static {v1, v3, v2}, Lw3/a;->l(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :cond_1
    sget-boolean v2, Lcom/facebook/react/fabric/FabricUIManager;->ENABLE_FABRIC_LOGS:Z

    .line 58
    .line 59
    if-eqz v2, :cond_2

    .line 60
    .line 61
    sget-object v2, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->TAG:Ljava/lang/String;

    .line 62
    .line 63
    iget v3, v0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->mSurfaceId:I

    .line 64
    .line 65
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    const-string v4, "Executing IntBufferBatchMountItem on surface [%d]"

    .line 70
    .line 71
    invoke-static {v2, v4, v3}, Lw3/a;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    :cond_2
    const-string v2, "mountViews"

    .line 75
    .line 76
    invoke-direct {v0, v2}, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->beginMarkers(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    move v2, v9

    .line 80
    move v3, v2

    .line 81
    :goto_0
    iget v4, v0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->mIntBufferLen:I

    .line 82
    .line 83
    if-ge v2, v4, :cond_11

    .line 84
    .line 85
    iget-object v4, v0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->mIntBuffer:[I

    .line 86
    .line 87
    add-int/lit8 v5, v2, 0x1

    .line 88
    .line 89
    aget v2, v4, v2

    .line 90
    .line 91
    and-int/lit8 v11, v2, -0x2

    .line 92
    .line 93
    and-int/2addr v2, v10

    .line 94
    if-eqz v2, :cond_3

    .line 95
    .line 96
    add-int/lit8 v2, v5, 0x1

    .line 97
    .line 98
    aget v4, v4, v5

    .line 99
    .line 100
    move v5, v2

    .line 101
    move v12, v4

    .line 102
    goto :goto_1

    .line 103
    :cond_3
    move v12, v10

    .line 104
    :goto_1
    move v13, v3

    .line 105
    move v2, v5

    .line 106
    move v14, v9

    .line 107
    :goto_2
    if-ge v14, v12, :cond_10

    .line 108
    .line 109
    const/4 v3, 0x2

    .line 110
    if-ne v11, v3, :cond_5

    .line 111
    .line 112
    iget-object v3, v0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->mObjBuffer:[Ljava/lang/Object;

    .line 113
    .line 114
    add-int/lit8 v4, v13, 0x1

    .line 115
    .line 116
    aget-object v3, v3, v13

    .line 117
    .line 118
    check-cast v3, Ljava/lang/String;

    .line 119
    .line 120
    invoke-static {v3}, Lcom/facebook/react/fabric/FabricComponents;->getFabricComponentName(Ljava/lang/String;)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    iget-object v5, v0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->mIntBuffer:[I

    .line 125
    .line 126
    add-int/lit8 v6, v2, 0x1

    .line 127
    .line 128
    aget v5, v5, v2

    .line 129
    .line 130
    iget-object v2, v0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->mObjBuffer:[Ljava/lang/Object;

    .line 131
    .line 132
    add-int/lit8 v7, v4, 0x1

    .line 133
    .line 134
    aget-object v8, v2, v4

    .line 135
    .line 136
    add-int/lit8 v4, v7, 0x1

    .line 137
    .line 138
    aget-object v2, v2, v7

    .line 139
    .line 140
    invoke-static {v2}, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->castToState(Ljava/lang/Object;)Lcom/facebook/react/uimanager/StateWrapper;

    .line 141
    .line 142
    .line 143
    move-result-object v7

    .line 144
    iget-object v2, v0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->mObjBuffer:[Ljava/lang/Object;

    .line 145
    .line 146
    add-int/lit8 v13, v4, 0x1

    .line 147
    .line 148
    aget-object v2, v2, v4

    .line 149
    .line 150
    invoke-static {v2}, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->castToEventEmitter(Ljava/lang/Object;)Lcom/facebook/react/fabric/events/EventEmitterWrapper;

    .line 151
    .line 152
    .line 153
    move-result-object v15

    .line 154
    iget-object v2, v0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->mIntBuffer:[I

    .line 155
    .line 156
    add-int/lit8 v16, v6, 0x1

    .line 157
    .line 158
    aget v2, v2, v6

    .line 159
    .line 160
    if-ne v2, v10, :cond_4

    .line 161
    .line 162
    move/from16 v17, v10

    .line 163
    .line 164
    goto :goto_3

    .line 165
    :cond_4
    move/from16 v17, v9

    .line 166
    .line 167
    :goto_3
    move-object v2, v1

    .line 168
    move v4, v5

    .line 169
    move-object v5, v8

    .line 170
    move-object v6, v7

    .line 171
    move-object v7, v15

    .line 172
    move/from16 v8, v17

    .line 173
    .line 174
    invoke-virtual/range {v2 .. v8}, Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;->createView(Ljava/lang/String;ILjava/lang/Object;Lcom/facebook/react/uimanager/StateWrapper;Lcom/facebook/react/fabric/events/EventEmitterWrapper;Z)V

    .line 175
    .line 176
    .line 177
    :goto_4
    move/from16 v2, v16

    .line 178
    .line 179
    goto/16 :goto_8

    .line 180
    .line 181
    :cond_5
    const/4 v3, 0x4

    .line 182
    if-ne v11, v3, :cond_6

    .line 183
    .line 184
    iget-object v3, v0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->mIntBuffer:[I

    .line 185
    .line 186
    add-int/lit8 v4, v2, 0x1

    .line 187
    .line 188
    aget v2, v3, v2

    .line 189
    .line 190
    invoke-virtual {v1, v2}, Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;->deleteView(I)V

    .line 191
    .line 192
    .line 193
    move v2, v4

    .line 194
    goto/16 :goto_8

    .line 195
    .line 196
    :cond_6
    const/16 v3, 0x8

    .line 197
    .line 198
    if-ne v11, v3, :cond_7

    .line 199
    .line 200
    iget-object v3, v0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->mIntBuffer:[I

    .line 201
    .line 202
    add-int/lit8 v4, v2, 0x1

    .line 203
    .line 204
    aget v2, v3, v2

    .line 205
    .line 206
    add-int/lit8 v5, v4, 0x1

    .line 207
    .line 208
    aget v4, v3, v4

    .line 209
    .line 210
    add-int/lit8 v6, v5, 0x1

    .line 211
    .line 212
    aget v3, v3, v5

    .line 213
    .line 214
    invoke-virtual {v1, v4, v2, v3}, Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;->addViewAt(III)V

    .line 215
    .line 216
    .line 217
    :goto_5
    move v2, v6

    .line 218
    goto/16 :goto_8

    .line 219
    .line 220
    :cond_7
    const/16 v3, 0x10

    .line 221
    .line 222
    if-ne v11, v3, :cond_8

    .line 223
    .line 224
    iget-object v3, v0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->mIntBuffer:[I

    .line 225
    .line 226
    add-int/lit8 v4, v2, 0x1

    .line 227
    .line 228
    aget v2, v3, v2

    .line 229
    .line 230
    add-int/lit8 v5, v4, 0x1

    .line 231
    .line 232
    aget v4, v3, v4

    .line 233
    .line 234
    add-int/lit8 v6, v5, 0x1

    .line 235
    .line 236
    aget v3, v3, v5

    .line 237
    .line 238
    invoke-virtual {v1, v2, v4, v3}, Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;->removeViewAt(III)V

    .line 239
    .line 240
    .line 241
    goto :goto_5

    .line 242
    :cond_8
    const/16 v3, 0x800

    .line 243
    .line 244
    if-ne v11, v3, :cond_9

    .line 245
    .line 246
    iget-object v3, v0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->mIntBuffer:[I

    .line 247
    .line 248
    add-int/lit8 v4, v2, 0x1

    .line 249
    .line 250
    aget v2, v3, v2

    .line 251
    .line 252
    add-int/lit8 v5, v4, 0x1

    .line 253
    .line 254
    aget v4, v3, v4

    .line 255
    .line 256
    add-int/lit8 v6, v5, 0x1

    .line 257
    .line 258
    aget v3, v3, v5

    .line 259
    .line 260
    invoke-virtual {v1, v2, v4, v3}, Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;->removeDeleteTreeAt(III)V

    .line 261
    .line 262
    .line 263
    goto :goto_5

    .line 264
    :cond_9
    const/16 v3, 0x20

    .line 265
    .line 266
    if-ne v11, v3, :cond_a

    .line 267
    .line 268
    iget-object v3, v0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->mIntBuffer:[I

    .line 269
    .line 270
    add-int/lit8 v4, v2, 0x1

    .line 271
    .line 272
    aget v2, v3, v2

    .line 273
    .line 274
    iget-object v3, v0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->mObjBuffer:[Ljava/lang/Object;

    .line 275
    .line 276
    add-int/lit8 v5, v13, 0x1

    .line 277
    .line 278
    aget-object v3, v3, v13

    .line 279
    .line 280
    invoke-virtual {v1, v2, v3}, Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;->updateProps(ILjava/lang/Object;)V

    .line 281
    .line 282
    .line 283
    :goto_6
    move v2, v4

    .line 284
    move v13, v5

    .line 285
    goto/16 :goto_8

    .line 286
    .line 287
    :cond_a
    const/16 v3, 0x40

    .line 288
    .line 289
    if-ne v11, v3, :cond_b

    .line 290
    .line 291
    iget-object v3, v0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->mIntBuffer:[I

    .line 292
    .line 293
    add-int/lit8 v4, v2, 0x1

    .line 294
    .line 295
    aget v2, v3, v2

    .line 296
    .line 297
    iget-object v3, v0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->mObjBuffer:[Ljava/lang/Object;

    .line 298
    .line 299
    add-int/lit8 v5, v13, 0x1

    .line 300
    .line 301
    aget-object v3, v3, v13

    .line 302
    .line 303
    invoke-static {v3}, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->castToState(Ljava/lang/Object;)Lcom/facebook/react/uimanager/StateWrapper;

    .line 304
    .line 305
    .line 306
    move-result-object v3

    .line 307
    invoke-virtual {v1, v2, v3}, Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;->updateState(ILcom/facebook/react/uimanager/StateWrapper;)V

    .line 308
    .line 309
    .line 310
    goto :goto_6

    .line 311
    :cond_b
    const/16 v3, 0x80

    .line 312
    .line 313
    if-ne v11, v3, :cond_c

    .line 314
    .line 315
    iget-object v3, v0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->mIntBuffer:[I

    .line 316
    .line 317
    add-int/lit8 v4, v2, 0x1

    .line 318
    .line 319
    aget v5, v3, v2

    .line 320
    .line 321
    add-int/lit8 v2, v4, 0x1

    .line 322
    .line 323
    aget v4, v3, v4

    .line 324
    .line 325
    add-int/lit8 v6, v2, 0x1

    .line 326
    .line 327
    aget v7, v3, v2

    .line 328
    .line 329
    add-int/lit8 v2, v6, 0x1

    .line 330
    .line 331
    aget v6, v3, v6

    .line 332
    .line 333
    add-int/lit8 v8, v2, 0x1

    .line 334
    .line 335
    aget v15, v3, v2

    .line 336
    .line 337
    add-int/lit8 v16, v8, 0x1

    .line 338
    .line 339
    aget v8, v3, v8

    .line 340
    .line 341
    move-object v2, v1

    .line 342
    move v3, v5

    .line 343
    move v5, v7

    .line 344
    move v7, v15

    .line 345
    invoke-virtual/range {v2 .. v8}, Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;->updateLayout(IIIIII)V

    .line 346
    .line 347
    .line 348
    goto/16 :goto_4

    .line 349
    .line 350
    :cond_c
    const/16 v3, 0x200

    .line 351
    .line 352
    if-ne v11, v3, :cond_d

    .line 353
    .line 354
    iget-object v3, v0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->mIntBuffer:[I

    .line 355
    .line 356
    add-int/lit8 v4, v2, 0x1

    .line 357
    .line 358
    aget v5, v3, v2

    .line 359
    .line 360
    add-int/lit8 v2, v4, 0x1

    .line 361
    .line 362
    aget v4, v3, v4

    .line 363
    .line 364
    add-int/lit8 v6, v2, 0x1

    .line 365
    .line 366
    aget v7, v3, v2

    .line 367
    .line 368
    add-int/lit8 v2, v6, 0x1

    .line 369
    .line 370
    aget v6, v3, v6

    .line 371
    .line 372
    add-int/lit8 v8, v2, 0x1

    .line 373
    .line 374
    aget v15, v3, v2

    .line 375
    .line 376
    move-object v2, v1

    .line 377
    move v3, v5

    .line 378
    move v5, v7

    .line 379
    move v7, v15

    .line 380
    invoke-virtual/range {v2 .. v7}, Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;->updatePadding(IIIII)V

    .line 381
    .line 382
    .line 383
    :goto_7
    move v2, v8

    .line 384
    goto :goto_8

    .line 385
    :cond_d
    const/16 v3, 0x400

    .line 386
    .line 387
    if-ne v11, v3, :cond_e

    .line 388
    .line 389
    iget-object v3, v0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->mIntBuffer:[I

    .line 390
    .line 391
    add-int/lit8 v4, v2, 0x1

    .line 392
    .line 393
    aget v5, v3, v2

    .line 394
    .line 395
    add-int/lit8 v2, v4, 0x1

    .line 396
    .line 397
    aget v4, v3, v4

    .line 398
    .line 399
    add-int/lit8 v6, v2, 0x1

    .line 400
    .line 401
    aget v7, v3, v2

    .line 402
    .line 403
    add-int/lit8 v2, v6, 0x1

    .line 404
    .line 405
    aget v6, v3, v6

    .line 406
    .line 407
    add-int/lit8 v8, v2, 0x1

    .line 408
    .line 409
    aget v15, v3, v2

    .line 410
    .line 411
    move-object v2, v1

    .line 412
    move v3, v5

    .line 413
    move v5, v7

    .line 414
    move v7, v15

    .line 415
    invoke-virtual/range {v2 .. v7}, Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;->updateOverflowInset(IIIII)V

    .line 416
    .line 417
    .line 418
    goto :goto_7

    .line 419
    :cond_e
    const/16 v3, 0x100

    .line 420
    .line 421
    if-ne v11, v3, :cond_f

    .line 422
    .line 423
    iget-object v3, v0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->mIntBuffer:[I

    .line 424
    .line 425
    add-int/lit8 v4, v2, 0x1

    .line 426
    .line 427
    aget v2, v3, v2

    .line 428
    .line 429
    iget-object v3, v0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->mObjBuffer:[Ljava/lang/Object;

    .line 430
    .line 431
    add-int/lit8 v5, v13, 0x1

    .line 432
    .line 433
    aget-object v3, v3, v13

    .line 434
    .line 435
    invoke-static {v3}, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->castToEventEmitter(Ljava/lang/Object;)Lcom/facebook/react/fabric/events/EventEmitterWrapper;

    .line 436
    .line 437
    .line 438
    move-result-object v3

    .line 439
    invoke-virtual {v1, v2, v3}, Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;->updateEventEmitter(ILcom/facebook/react/fabric/events/EventEmitterWrapper;)V

    .line 440
    .line 441
    .line 442
    goto/16 :goto_6

    .line 443
    .line 444
    :goto_8
    add-int/lit8 v14, v14, 0x1

    .line 445
    .line 446
    goto/16 :goto_2

    .line 447
    .line 448
    :cond_f
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 449
    .line 450
    new-instance v3, Ljava/lang/StringBuilder;

    .line 451
    .line 452
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 453
    .line 454
    .line 455
    const-string v4, "Invalid type argument to IntBufferBatchMountItem: "

    .line 456
    .line 457
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 458
    .line 459
    .line 460
    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 461
    .line 462
    .line 463
    const-string v4, " at index: "

    .line 464
    .line 465
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 466
    .line 467
    .line 468
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 469
    .line 470
    .line 471
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 472
    .line 473
    .line 474
    move-result-object v2

    .line 475
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 476
    .line 477
    .line 478
    throw v1

    .line 479
    :cond_10
    move v3, v13

    .line 480
    goto/16 :goto_0

    .line 481
    .line 482
    :cond_11
    invoke-virtual {v1}, Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;->didUpdateViews()V

    .line 483
    .line 484
    .line 485
    invoke-direct/range {p0 .. p0}, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->endMarkers()V

    .line 486
    .line 487
    .line 488
    return-void
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
.end method

.method public getSurfaceId()I
    .locals 1

    iget v0, p0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->mSurfaceId:I

    return v0
.end method

.method public shouldSchedule()Z
    .locals 1

    iget v0, p0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->mIntBufferLen:I

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 7
    .line 8
    .line 9
    const-string v3, "IntBufferBatchMountItem [surface:%d]:\n"

    .line 10
    .line 11
    const/4 v4, 0x1

    .line 12
    new-array v5, v4, [Ljava/lang/Object;

    .line 13
    .line 14
    iget v6, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->mSurfaceId:I

    .line 15
    .line 16
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 17
    .line 18
    .line 19
    move-result-object v6

    .line 20
    aput-object v6, v5, v2

    .line 21
    .line 22
    invoke-static {v3, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    move v3, v2

    .line 30
    move v5, v3

    .line 31
    :cond_0
    iget v6, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->mIntBufferLen:I

    .line 32
    .line 33
    if-ge v3, v6, :cond_d

    .line 34
    .line 35
    iget-object v6, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->mIntBuffer:[I

    .line 36
    .line 37
    add-int/lit8 v7, v3, 0x1

    .line 38
    .line 39
    aget v3, v6, v3

    .line 40
    .line 41
    and-int/lit8 v8, v3, -0x2

    .line 42
    .line 43
    and-int/2addr v3, v4

    .line 44
    if-eqz v3, :cond_1

    .line 45
    .line 46
    add-int/lit8 v3, v7, 0x1

    .line 47
    .line 48
    aget v6, v6, v7

    .line 49
    .line 50
    move v7, v3

    .line 51
    goto :goto_0

    .line 52
    :cond_1
    move v6, v4

    .line 53
    :goto_0
    move v3, v7

    .line 54
    move v7, v2

    .line 55
    :goto_1
    if-ge v7, v6, :cond_0

    .line 56
    .line 57
    const/4 v9, 0x3

    .line 58
    const/4 v10, 0x2

    .line 59
    if-ne v8, v10, :cond_2

    .line 60
    .line 61
    iget-object v11, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->mObjBuffer:[Ljava/lang/Object;

    .line 62
    .line 63
    add-int/lit8 v12, v5, 0x1

    .line 64
    .line 65
    aget-object v5, v11, v5

    .line 66
    .line 67
    check-cast v5, Ljava/lang/String;

    .line 68
    .line 69
    invoke-static {v5}, Lcom/facebook/react/fabric/FabricComponents;->getFabricComponentName(Ljava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    add-int/2addr v12, v9

    .line 74
    const-string v11, "CREATE [%d] - layoutable:%d - %s\n"

    .line 75
    .line 76
    new-array v9, v9, [Ljava/lang/Object;

    .line 77
    .line 78
    iget-object v13, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->mIntBuffer:[I

    .line 79
    .line 80
    add-int/lit8 v14, v3, 0x1

    .line 81
    .line 82
    aget v3, v13, v3

    .line 83
    .line 84
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    aput-object v3, v9, v2

    .line 89
    .line 90
    iget-object v3, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->mIntBuffer:[I

    .line 91
    .line 92
    add-int/lit8 v13, v14, 0x1

    .line 93
    .line 94
    aget v3, v3, v14

    .line 95
    .line 96
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    aput-object v3, v9, v4

    .line 101
    .line 102
    aput-object v5, v9, v10

    .line 103
    .line 104
    invoke-static {v11, v9}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    move v5, v12

    .line 112
    :goto_2
    move v3, v13

    .line 113
    goto/16 :goto_6

    .line 114
    .line 115
    :cond_2
    const/4 v11, 0x4

    .line 116
    if-ne v8, v11, :cond_3

    .line 117
    .line 118
    const-string v9, "DELETE [%d]\n"

    .line 119
    .line 120
    new-array v10, v4, [Ljava/lang/Object;

    .line 121
    .line 122
    iget-object v11, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->mIntBuffer:[I

    .line 123
    .line 124
    add-int/lit8 v12, v3, 0x1

    .line 125
    .line 126
    aget v3, v11, v3

    .line 127
    .line 128
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    aput-object v3, v10, v2

    .line 133
    .line 134
    invoke-static {v9, v10}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    :goto_3
    move v3, v12

    .line 142
    goto/16 :goto_6

    .line 143
    .line 144
    :cond_3
    const/16 v12, 0x8

    .line 145
    .line 146
    if-ne v8, v12, :cond_4

    .line 147
    .line 148
    const-string v11, "INSERT [%d]->[%d] @%d\n"

    .line 149
    .line 150
    new-array v9, v9, [Ljava/lang/Object;

    .line 151
    .line 152
    iget-object v12, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->mIntBuffer:[I

    .line 153
    .line 154
    add-int/lit8 v13, v3, 0x1

    .line 155
    .line 156
    aget v3, v12, v3

    .line 157
    .line 158
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 159
    .line 160
    .line 161
    move-result-object v3

    .line 162
    aput-object v3, v9, v2

    .line 163
    .line 164
    iget-object v3, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->mIntBuffer:[I

    .line 165
    .line 166
    add-int/lit8 v12, v13, 0x1

    .line 167
    .line 168
    aget v3, v3, v13

    .line 169
    .line 170
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    aput-object v3, v9, v4

    .line 175
    .line 176
    iget-object v3, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->mIntBuffer:[I

    .line 177
    .line 178
    add-int/lit8 v13, v12, 0x1

    .line 179
    .line 180
    aget v3, v3, v12

    .line 181
    .line 182
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 183
    .line 184
    .line 185
    move-result-object v3

    .line 186
    aput-object v3, v9, v10

    .line 187
    .line 188
    invoke-static {v11, v9}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v3

    .line 192
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    goto :goto_2

    .line 196
    :cond_4
    const/16 v12, 0x10

    .line 197
    .line 198
    if-ne v8, v12, :cond_5

    .line 199
    .line 200
    const-string v11, "REMOVE [%d]->[%d] @%d\n"

    .line 201
    .line 202
    new-array v9, v9, [Ljava/lang/Object;

    .line 203
    .line 204
    iget-object v12, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->mIntBuffer:[I

    .line 205
    .line 206
    add-int/lit8 v13, v3, 0x1

    .line 207
    .line 208
    aget v3, v12, v3

    .line 209
    .line 210
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 211
    .line 212
    .line 213
    move-result-object v3

    .line 214
    aput-object v3, v9, v2

    .line 215
    .line 216
    iget-object v3, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->mIntBuffer:[I

    .line 217
    .line 218
    add-int/lit8 v12, v13, 0x1

    .line 219
    .line 220
    aget v3, v3, v13

    .line 221
    .line 222
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 223
    .line 224
    .line 225
    move-result-object v3

    .line 226
    aput-object v3, v9, v4

    .line 227
    .line 228
    iget-object v3, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->mIntBuffer:[I

    .line 229
    .line 230
    add-int/lit8 v13, v12, 0x1

    .line 231
    .line 232
    aget v3, v3, v12

    .line 233
    .line 234
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 235
    .line 236
    .line 237
    move-result-object v3

    .line 238
    aput-object v3, v9, v10

    .line 239
    .line 240
    invoke-static {v11, v9}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v3

    .line 244
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    goto/16 :goto_2

    .line 248
    .line 249
    :cond_5
    const/16 v12, 0x800

    .line 250
    .line 251
    if-ne v8, v12, :cond_6

    .line 252
    .line 253
    const-string v11, "REMOVE+DELETE TREE [%d]->[%d] @%d\n"

    .line 254
    .line 255
    new-array v9, v9, [Ljava/lang/Object;

    .line 256
    .line 257
    iget-object v12, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->mIntBuffer:[I

    .line 258
    .line 259
    add-int/lit8 v13, v3, 0x1

    .line 260
    .line 261
    aget v3, v12, v3

    .line 262
    .line 263
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 264
    .line 265
    .line 266
    move-result-object v3

    .line 267
    aput-object v3, v9, v2

    .line 268
    .line 269
    iget-object v3, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->mIntBuffer:[I

    .line 270
    .line 271
    add-int/lit8 v12, v13, 0x1

    .line 272
    .line 273
    aget v3, v3, v13

    .line 274
    .line 275
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 276
    .line 277
    .line 278
    move-result-object v3

    .line 279
    aput-object v3, v9, v4

    .line 280
    .line 281
    iget-object v3, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->mIntBuffer:[I

    .line 282
    .line 283
    add-int/lit8 v13, v12, 0x1

    .line 284
    .line 285
    aget v3, v3, v12

    .line 286
    .line 287
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 288
    .line 289
    .line 290
    move-result-object v3

    .line 291
    aput-object v3, v9, v10

    .line 292
    .line 293
    invoke-static {v11, v9}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v3

    .line 297
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 298
    .line 299
    .line 300
    goto/16 :goto_2

    .line 301
    .line 302
    :cond_6
    const/16 v12, 0x20

    .line 303
    .line 304
    const-string v13, "<hidden>"

    .line 305
    .line 306
    if-ne v8, v12, :cond_7

    .line 307
    .line 308
    :try_start_1
    iget-object v9, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->mObjBuffer:[Ljava/lang/Object;

    .line 309
    .line 310
    add-int/lit8 v11, v5, 0x1

    .line 311
    .line 312
    aget-object v5, v9, v5

    .line 313
    .line 314
    const-string v5, "UPDATE PROPS [%d]: %s\n"

    .line 315
    .line 316
    new-array v9, v10, [Ljava/lang/Object;

    .line 317
    .line 318
    iget-object v10, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->mIntBuffer:[I

    .line 319
    .line 320
    add-int/lit8 v12, v3, 0x1

    .line 321
    .line 322
    aget v3, v10, v3

    .line 323
    .line 324
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 325
    .line 326
    .line 327
    move-result-object v3

    .line 328
    aput-object v3, v9, v2

    .line 329
    .line 330
    aput-object v13, v9, v4

    .line 331
    .line 332
    invoke-static {v5, v9}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    move-result-object v3

    .line 336
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 337
    .line 338
    .line 339
    :goto_4
    move v5, v11

    .line 340
    goto/16 :goto_3

    .line 341
    .line 342
    :cond_7
    const/16 v12, 0x40

    .line 343
    .line 344
    if-ne v8, v12, :cond_8

    .line 345
    .line 346
    iget-object v9, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->mObjBuffer:[Ljava/lang/Object;

    .line 347
    .line 348
    add-int/lit8 v11, v5, 0x1

    .line 349
    .line 350
    aget-object v5, v9, v5

    .line 351
    .line 352
    invoke-static {v5}, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->castToState(Ljava/lang/Object;)Lcom/facebook/react/uimanager/StateWrapper;

    .line 353
    .line 354
    .line 355
    const-string v5, "UPDATE STATE [%d]: %s\n"

    .line 356
    .line 357
    new-array v9, v10, [Ljava/lang/Object;

    .line 358
    .line 359
    iget-object v10, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->mIntBuffer:[I

    .line 360
    .line 361
    add-int/lit8 v12, v3, 0x1

    .line 362
    .line 363
    aget v3, v10, v3

    .line 364
    .line 365
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 366
    .line 367
    .line 368
    move-result-object v3

    .line 369
    aput-object v3, v9, v2

    .line 370
    .line 371
    aput-object v13, v9, v4

    .line 372
    .line 373
    invoke-static {v5, v9}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 374
    .line 375
    .line 376
    move-result-object v3

    .line 377
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 378
    .line 379
    .line 380
    goto :goto_4

    .line 381
    :cond_8
    const/16 v12, 0x80

    .line 382
    .line 383
    const/4 v13, 0x5

    .line 384
    if-ne v8, v12, :cond_9

    .line 385
    .line 386
    const-string v12, "UPDATE LAYOUT [%d]: x:%d y:%d w:%d h:%d displayType:%d\n"

    .line 387
    .line 388
    const/4 v14, 0x6

    .line 389
    new-array v14, v14, [Ljava/lang/Object;

    .line 390
    .line 391
    iget-object v15, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->mIntBuffer:[I

    .line 392
    .line 393
    add-int/lit8 v16, v3, 0x1

    .line 394
    .line 395
    aget v3, v15, v3

    .line 396
    .line 397
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 398
    .line 399
    .line 400
    move-result-object v3

    .line 401
    aput-object v3, v14, v2

    .line 402
    .line 403
    iget-object v3, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->mIntBuffer:[I

    .line 404
    .line 405
    add-int/lit8 v15, v16, 0x1

    .line 406
    .line 407
    aget v3, v3, v16

    .line 408
    .line 409
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 410
    .line 411
    .line 412
    move-result-object v3

    .line 413
    aput-object v3, v14, v4

    .line 414
    .line 415
    iget-object v3, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->mIntBuffer:[I

    .line 416
    .line 417
    add-int/lit8 v16, v15, 0x1

    .line 418
    .line 419
    aget v3, v3, v15

    .line 420
    .line 421
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 422
    .line 423
    .line 424
    move-result-object v3

    .line 425
    aput-object v3, v14, v10

    .line 426
    .line 427
    iget-object v3, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->mIntBuffer:[I

    .line 428
    .line 429
    add-int/lit8 v10, v16, 0x1

    .line 430
    .line 431
    aget v3, v3, v16

    .line 432
    .line 433
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 434
    .line 435
    .line 436
    move-result-object v3

    .line 437
    aput-object v3, v14, v9

    .line 438
    .line 439
    iget-object v3, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->mIntBuffer:[I

    .line 440
    .line 441
    add-int/lit8 v9, v10, 0x1

    .line 442
    .line 443
    aget v3, v3, v10

    .line 444
    .line 445
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 446
    .line 447
    .line 448
    move-result-object v3

    .line 449
    aput-object v3, v14, v11

    .line 450
    .line 451
    iget-object v3, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->mIntBuffer:[I

    .line 452
    .line 453
    add-int/lit8 v10, v9, 0x1

    .line 454
    .line 455
    aget v3, v3, v9

    .line 456
    .line 457
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 458
    .line 459
    .line 460
    move-result-object v3

    .line 461
    aput-object v3, v14, v13

    .line 462
    .line 463
    invoke-static {v12, v14}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 464
    .line 465
    .line 466
    move-result-object v3

    .line 467
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 468
    .line 469
    .line 470
    move v3, v10

    .line 471
    goto/16 :goto_6

    .line 472
    .line 473
    :cond_9
    const/16 v12, 0x200

    .line 474
    .line 475
    if-ne v8, v12, :cond_a

    .line 476
    .line 477
    const-string v12, "UPDATE PADDING [%d]: top:%d right:%d bottom:%d left:%d\n"

    .line 478
    .line 479
    new-array v13, v13, [Ljava/lang/Object;

    .line 480
    .line 481
    iget-object v14, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->mIntBuffer:[I

    .line 482
    .line 483
    add-int/lit8 v15, v3, 0x1

    .line 484
    .line 485
    aget v3, v14, v3

    .line 486
    .line 487
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 488
    .line 489
    .line 490
    move-result-object v3

    .line 491
    aput-object v3, v13, v2

    .line 492
    .line 493
    iget-object v3, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->mIntBuffer:[I

    .line 494
    .line 495
    add-int/lit8 v14, v15, 0x1

    .line 496
    .line 497
    aget v3, v3, v15

    .line 498
    .line 499
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 500
    .line 501
    .line 502
    move-result-object v3

    .line 503
    aput-object v3, v13, v4

    .line 504
    .line 505
    iget-object v3, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->mIntBuffer:[I

    .line 506
    .line 507
    add-int/lit8 v15, v14, 0x1

    .line 508
    .line 509
    aget v3, v3, v14

    .line 510
    .line 511
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 512
    .line 513
    .line 514
    move-result-object v3

    .line 515
    aput-object v3, v13, v10

    .line 516
    .line 517
    iget-object v3, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->mIntBuffer:[I

    .line 518
    .line 519
    add-int/lit8 v10, v15, 0x1

    .line 520
    .line 521
    aget v3, v3, v15

    .line 522
    .line 523
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 524
    .line 525
    .line 526
    move-result-object v3

    .line 527
    aput-object v3, v13, v9

    .line 528
    .line 529
    iget-object v3, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->mIntBuffer:[I

    .line 530
    .line 531
    add-int/lit8 v9, v10, 0x1

    .line 532
    .line 533
    aget v3, v3, v10

    .line 534
    .line 535
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 536
    .line 537
    .line 538
    move-result-object v3

    .line 539
    aput-object v3, v13, v11

    .line 540
    .line 541
    invoke-static {v12, v13}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 542
    .line 543
    .line 544
    move-result-object v3

    .line 545
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 546
    .line 547
    .line 548
    :goto_5
    move v3, v9

    .line 549
    goto :goto_6

    .line 550
    :cond_a
    const/16 v12, 0x400

    .line 551
    .line 552
    if-ne v8, v12, :cond_b

    .line 553
    .line 554
    const-string v12, "UPDATE OVERFLOWINSET [%d]: left:%d top:%d right:%d bottom:%d\n"

    .line 555
    .line 556
    new-array v13, v13, [Ljava/lang/Object;

    .line 557
    .line 558
    iget-object v14, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->mIntBuffer:[I

    .line 559
    .line 560
    add-int/lit8 v15, v3, 0x1

    .line 561
    .line 562
    aget v3, v14, v3

    .line 563
    .line 564
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 565
    .line 566
    .line 567
    move-result-object v3

    .line 568
    aput-object v3, v13, v2

    .line 569
    .line 570
    iget-object v3, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->mIntBuffer:[I

    .line 571
    .line 572
    add-int/lit8 v14, v15, 0x1

    .line 573
    .line 574
    aget v3, v3, v15

    .line 575
    .line 576
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 577
    .line 578
    .line 579
    move-result-object v3

    .line 580
    aput-object v3, v13, v4

    .line 581
    .line 582
    iget-object v3, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->mIntBuffer:[I

    .line 583
    .line 584
    add-int/lit8 v15, v14, 0x1

    .line 585
    .line 586
    aget v3, v3, v14

    .line 587
    .line 588
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 589
    .line 590
    .line 591
    move-result-object v3

    .line 592
    aput-object v3, v13, v10

    .line 593
    .line 594
    iget-object v3, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->mIntBuffer:[I

    .line 595
    .line 596
    add-int/lit8 v10, v15, 0x1

    .line 597
    .line 598
    aget v3, v3, v15

    .line 599
    .line 600
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 601
    .line 602
    .line 603
    move-result-object v3

    .line 604
    aput-object v3, v13, v9

    .line 605
    .line 606
    iget-object v3, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->mIntBuffer:[I

    .line 607
    .line 608
    add-int/lit8 v9, v10, 0x1

    .line 609
    .line 610
    aget v3, v3, v10

    .line 611
    .line 612
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 613
    .line 614
    .line 615
    move-result-object v3

    .line 616
    aput-object v3, v13, v11

    .line 617
    .line 618
    invoke-static {v12, v13}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 619
    .line 620
    .line 621
    move-result-object v3

    .line 622
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 623
    .line 624
    .line 625
    goto :goto_5

    .line 626
    :cond_b
    const/16 v9, 0x100

    .line 627
    .line 628
    if-ne v8, v9, :cond_c

    .line 629
    .line 630
    add-int/lit8 v5, v5, 0x1

    .line 631
    .line 632
    const-string v9, "UPDATE EVENTEMITTER [%d]\n"

    .line 633
    .line 634
    new-array v10, v4, [Ljava/lang/Object;

    .line 635
    .line 636
    iget-object v11, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->mIntBuffer:[I

    .line 637
    .line 638
    add-int/lit8 v12, v3, 0x1

    .line 639
    .line 640
    aget v3, v11, v3

    .line 641
    .line 642
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 643
    .line 644
    .line 645
    move-result-object v3

    .line 646
    aput-object v3, v10, v2

    .line 647
    .line 648
    invoke-static {v9, v10}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 649
    .line 650
    .line 651
    move-result-object v3

    .line 652
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 653
    .line 654
    .line 655
    goto/16 :goto_3

    .line 656
    .line 657
    :goto_6
    add-int/lit8 v7, v7, 0x1

    .line 658
    .line 659
    goto/16 :goto_1

    .line 660
    .line 661
    :cond_c
    sget-object v4, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->TAG:Ljava/lang/String;

    .line 662
    .line 663
    new-instance v5, Ljava/lang/StringBuilder;

    .line 664
    .line 665
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 666
    .line 667
    .line 668
    const-string v6, "String so far: "

    .line 669
    .line 670
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 671
    .line 672
    .line 673
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 674
    .line 675
    .line 676
    move-result-object v0

    .line 677
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 678
    .line 679
    .line 680
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 681
    .line 682
    .line 683
    move-result-object v0

    .line 684
    invoke-static {v4, v0}, Lw3/a;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 685
    .line 686
    .line 687
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 688
    .line 689
    new-instance v4, Ljava/lang/StringBuilder;

    .line 690
    .line 691
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 692
    .line 693
    .line 694
    const-string v5, "Invalid type argument to IntBufferBatchMountItem: "

    .line 695
    .line 696
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 697
    .line 698
    .line 699
    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 700
    .line 701
    .line 702
    const-string v5, " at index: "

    .line 703
    .line 704
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 705
    .line 706
    .line 707
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 708
    .line 709
    .line 710
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 711
    .line 712
    .line 713
    move-result-object v3

    .line 714
    invoke-direct {v0, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 715
    .line 716
    .line 717
    throw v0

    .line 718
    :cond_d
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 719
    .line 720
    .line 721
    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 722
    return-object v0

    .line 723
    :catch_0
    move-exception v0

    .line 724
    sget-object v3, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->TAG:Ljava/lang/String;

    .line 725
    .line 726
    const-string v4, "Caught exception trying to print"

    .line 727
    .line 728
    invoke-static {v3, v4, v0}, Lw3/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 729
    .line 730
    .line 731
    new-instance v0, Ljava/lang/StringBuilder;

    .line 732
    .line 733
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 734
    .line 735
    .line 736
    move v3, v2

    .line 737
    :goto_7
    iget v4, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->mIntBufferLen:I

    .line 738
    .line 739
    if-ge v3, v4, :cond_e

    .line 740
    .line 741
    iget-object v4, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->mIntBuffer:[I

    .line 742
    .line 743
    aget v4, v4, v3

    .line 744
    .line 745
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 746
    .line 747
    .line 748
    const-string v4, ", "

    .line 749
    .line 750
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 751
    .line 752
    .line 753
    add-int/lit8 v3, v3, 0x1

    .line 754
    .line 755
    goto :goto_7

    .line 756
    :cond_e
    sget-object v3, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->TAG:Ljava/lang/String;

    .line 757
    .line 758
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 759
    .line 760
    .line 761
    move-result-object v0

    .line 762
    invoke-static {v3, v0}, Lw3/a;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 763
    .line 764
    .line 765
    :goto_8
    iget v0, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->mObjBufferLen:I

    .line 766
    .line 767
    if-ge v2, v0, :cond_10

    .line 768
    .line 769
    sget-object v0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->TAG:Ljava/lang/String;

    .line 770
    .line 771
    iget-object v3, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->mObjBuffer:[Ljava/lang/Object;

    .line 772
    .line 773
    aget-object v3, v3, v2

    .line 774
    .line 775
    if-eqz v3, :cond_f

    .line 776
    .line 777
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 778
    .line 779
    .line 780
    move-result-object v3

    .line 781
    goto :goto_9

    .line 782
    :cond_f
    const-string v3, "null"

    .line 783
    .line 784
    :goto_9
    invoke-static {v0, v3}, Lw3/a;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 785
    .line 786
    .line 787
    add-int/lit8 v2, v2, 0x1

    .line 788
    .line 789
    goto :goto_8

    .line 790
    :cond_10
    const-string v0, ""

    .line 791
    .line 792
    return-object v0
.end method