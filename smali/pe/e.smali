.class public Lpe/e;
.super Lpe/c;
.source "SourceFile"


# static fields
.field private static final t:Ljava/lang/String; = "e"


# instance fields
.field m:I

.field n:I

.field o:I

.field p:Loe/g;

.field private q:Landroid/media/MediaFormat;

.field private r:Landroid/media/MediaFormat;

.field private s:Loe/e;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method constructor <init>(Lne/c;ILne/d;ILandroid/media/MediaFormat;Loe/i;Lhe/a;Lhe/b;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p8}, Lpe/c;-><init>(Lne/c;ILne/d;ILandroid/media/MediaFormat;Loe/i;Lhe/a;Lhe/b;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x2

    .line 5
    iput p1, p0, Lpe/e;->m:I

    .line 6
    .line 7
    iput p1, p0, Lpe/e;->n:I

    .line 8
    .line 9
    iput p1, p0, Lpe/e;->o:I

    .line 10
    .line 11
    iput-object p5, p0, Lpe/e;->r:Landroid/media/MediaFormat;

    .line 12
    .line 13
    instance-of p1, p6, Loe/g;

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    check-cast p6, Loe/g;

    .line 18
    .line 19
    iput-object p6, p0, Lpe/e;->p:Loe/g;

    .line 20
    .line 21
    invoke-direct {p0}, Lpe/e;->l()V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 26
    .line 27
    new-instance p2, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 30
    .line 31
    .line 32
    const-string p3, "Cannot use non-OpenGL video renderer in "

    .line 33
    .line 34
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-class p3, Lpe/e;

    .line 38
    .line 39
    invoke-virtual {p3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p3

    .line 43
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p1
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
.end method

.method private j()Loe/e;
    .locals 4

    .line 1
    iget-object v0, p0, Lpe/e;->q:Landroid/media/MediaFormat;

    .line 2
    .line 3
    const-string v1, "frame-rate"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lqe/f;->b(Landroid/media/MediaFormat;Ljava/lang/String;)Ljava/lang/Number;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v2, p0, Lpe/e;->r:Landroid/media/MediaFormat;

    .line 10
    .line 11
    invoke-static {v2, v1}, Lqe/f;->b(Landroid/media/MediaFormat;Ljava/lang/String;)Ljava/lang/Number;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    const/4 v3, 0x1

    .line 22
    if-ge v2, v3, :cond_1

    .line 23
    .line 24
    :cond_0
    move-object v1, v0

    .line 25
    :cond_1
    if-eqz v0, :cond_2

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-le v2, v3, :cond_2

    .line 36
    .line 37
    new-instance v2, Loe/d;

    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    invoke-direct {v2, v0, v1}, Loe/d;-><init>(II)V

    .line 48
    .line 49
    .line 50
    return-object v2

    .line 51
    :cond_2
    const/4 v0, 0x0

    .line 52
    return-object v0
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
.end method

.method private k()I
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lpe/c;->a:Lne/c;

    .line 4
    .line 5
    invoke-interface {v1}, Lne/c;->getSampleTrackIndex()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    iget v2, v0, Lpe/c;->g:I

    .line 10
    .line 11
    const/4 v3, -0x1

    .line 12
    const/4 v4, 0x2

    .line 13
    if-eq v1, v2, :cond_0

    .line 14
    .line 15
    if-ne v1, v3, :cond_6

    .line 16
    .line 17
    :cond_0
    iget-object v1, v0, Lpe/c;->d:Lhe/a;

    .line 18
    .line 19
    const-wide/16 v5, 0x0

    .line 20
    .line 21
    invoke-interface {v1, v5, v6}, Lhe/a;->f(J)I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-ltz v1, :cond_5

    .line 26
    .line 27
    iget-object v2, v0, Lpe/c;->d:Lhe/a;

    .line 28
    .line 29
    invoke-interface {v2, v1}, Lhe/a;->c(I)Lhe/c;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    if-eqz v1, :cond_4

    .line 34
    .line 35
    iget-object v2, v0, Lpe/c;->a:Lne/c;

    .line 36
    .line 37
    iget-object v3, v1, Lhe/c;->b:Ljava/nio/ByteBuffer;

    .line 38
    .line 39
    const/4 v5, 0x0

    .line 40
    invoke-interface {v2, v3, v5}, Lne/c;->readSampleData(Ljava/nio/ByteBuffer;I)I

    .line 41
    .line 42
    .line 43
    move-result v8

    .line 44
    iget-object v2, v0, Lpe/c;->a:Lne/c;

    .line 45
    .line 46
    invoke-interface {v2}, Lne/c;->getSampleTime()J

    .line 47
    .line 48
    .line 49
    move-result-wide v9

    .line 50
    iget-object v2, v0, Lpe/c;->a:Lne/c;

    .line 51
    .line 52
    invoke-interface {v2}, Lne/c;->getSampleFlags()I

    .line 53
    .line 54
    .line 55
    move-result v11

    .line 56
    if-ltz v8, :cond_3

    .line 57
    .line 58
    and-int/lit8 v2, v11, 0x4

    .line 59
    .line 60
    if-eqz v2, :cond_1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    iget-object v2, v0, Lpe/c;->f:Lcom/linkedin/android/litr/io/MediaRange;

    .line 64
    .line 65
    invoke-virtual {v2}, Lcom/linkedin/android/litr/io/MediaRange;->a()J

    .line 66
    .line 67
    .line 68
    move-result-wide v2

    .line 69
    cmp-long v2, v9, v2

    .line 70
    .line 71
    if-ltz v2, :cond_2

    .line 72
    .line 73
    iget-object v12, v1, Lhe/c;->c:Landroid/media/MediaCodec$BufferInfo;

    .line 74
    .line 75
    const/4 v13, 0x0

    .line 76
    const/4 v14, 0x0

    .line 77
    const-wide/16 v15, -0x1

    .line 78
    .line 79
    const/16 v17, 0x4

    .line 80
    .line 81
    invoke-virtual/range {v12 .. v17}, Landroid/media/MediaCodec$BufferInfo;->set(IIJI)V

    .line 82
    .line 83
    .line 84
    iget-object v2, v0, Lpe/c;->d:Lhe/a;

    .line 85
    .line 86
    invoke-interface {v2, v1}, Lhe/a;->a(Lhe/c;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual/range {p0 .. p0}, Lpe/c;->b()I

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    sget-object v2, Lpe/e;->t:Ljava/lang/String;

    .line 94
    .line 95
    const-string v3, "Selection end reached on the input stream"

    .line 96
    .line 97
    invoke-static {v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 98
    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_2
    iget-object v6, v1, Lhe/c;->c:Landroid/media/MediaCodec$BufferInfo;

    .line 102
    .line 103
    const/4 v7, 0x0

    .line 104
    invoke-virtual/range {v6 .. v11}, Landroid/media/MediaCodec$BufferInfo;->set(IIJI)V

    .line 105
    .line 106
    .line 107
    iget-object v2, v0, Lpe/c;->d:Lhe/a;

    .line 108
    .line 109
    invoke-interface {v2, v1}, Lhe/a;->a(Lhe/c;)V

    .line 110
    .line 111
    .line 112
    iget-object v1, v0, Lpe/c;->a:Lne/c;

    .line 113
    .line 114
    invoke-interface {v1}, Lne/c;->advance()V

    .line 115
    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_3
    :goto_0
    iget-object v5, v1, Lhe/c;->c:Landroid/media/MediaCodec$BufferInfo;

    .line 119
    .line 120
    const/4 v6, 0x0

    .line 121
    const/4 v7, 0x0

    .line 122
    const-wide/16 v8, -0x1

    .line 123
    .line 124
    const/4 v10, 0x4

    .line 125
    invoke-virtual/range {v5 .. v10}, Landroid/media/MediaCodec$BufferInfo;->set(IIJI)V

    .line 126
    .line 127
    .line 128
    iget-object v2, v0, Lpe/c;->d:Lhe/a;

    .line 129
    .line 130
    invoke-interface {v2, v1}, Lhe/a;->a(Lhe/c;)V

    .line 131
    .line 132
    .line 133
    sget-object v1, Lpe/e;->t:Ljava/lang/String;

    .line 134
    .line 135
    const-string v2, "EoS reached on the input stream"

    .line 136
    .line 137
    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 138
    .line 139
    .line 140
    const/4 v1, 0x4

    .line 141
    :goto_1
    move v4, v1

    .line 142
    goto :goto_2

    .line 143
    :cond_4
    new-instance v1, Lie/e;

    .line 144
    .line 145
    sget-object v2, Lie/e$a;->v:Lie/e$a;

    .line 146
    .line 147
    invoke-direct {v1, v2}, Lie/e;-><init>(Lie/e$a;)V

    .line 148
    .line 149
    .line 150
    throw v1

    .line 151
    :cond_5
    if-eq v1, v3, :cond_6

    .line 152
    .line 153
    sget-object v2, Lpe/e;->t:Ljava/lang/String;

    .line 154
    .line 155
    new-instance v3, Ljava/lang/StringBuilder;

    .line 156
    .line 157
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 158
    .line 159
    .line 160
    const-string v5, "Unhandled value "

    .line 161
    .line 162
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    const-string v1, " when decoding an input frame"

    .line 169
    .line 170
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    invoke-static {v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 178
    .line 179
    .line 180
    :cond_6
    :goto_2
    return v4
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
.end method

.method private l()V
    .locals 4

    .line 1
    iget-object v0, p0, Lpe/c;->a:Lne/c;

    .line 2
    .line 3
    iget v1, p0, Lpe/c;->g:I

    .line 4
    .line 5
    invoke-interface {v0, v1}, Lne/c;->getTrackFormat(I)Landroid/media/MediaFormat;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lpe/e;->q:Landroid/media/MediaFormat;

    .line 10
    .line 11
    invoke-direct {p0}, Lpe/e;->j()Loe/e;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lpe/e;->s:Loe/e;

    .line 16
    .line 17
    iget-object v0, p0, Lpe/c;->e:Lhe/b;

    .line 18
    .line 19
    iget-object v1, p0, Lpe/c;->j:Landroid/media/MediaFormat;

    .line 20
    .line 21
    invoke-interface {v0, v1}, Lhe/b;->e(Landroid/media/MediaFormat;)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lpe/e;->p:Loe/g;

    .line 25
    .line 26
    iget-object v1, p0, Lpe/c;->e:Lhe/b;

    .line 27
    .line 28
    invoke-interface {v1}, Lhe/b;->createInputSurface()Landroid/view/Surface;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    iget-object v2, p0, Lpe/e;->q:Landroid/media/MediaFormat;

    .line 33
    .line 34
    iget-object v3, p0, Lpe/e;->r:Landroid/media/MediaFormat;

    .line 35
    .line 36
    invoke-virtual {v0, v1, v2, v3}, Loe/g;->c(Landroid/view/Surface;Landroid/media/MediaFormat;Landroid/media/MediaFormat;)V

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, Lpe/c;->d:Lhe/a;

    .line 40
    .line 41
    iget-object v1, p0, Lpe/e;->q:Landroid/media/MediaFormat;

    .line 42
    .line 43
    iget-object v2, p0, Lpe/e;->p:Loe/g;

    .line 44
    .line 45
    invoke-virtual {v2}, Loe/g;->f()Landroid/view/Surface;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-interface {v0, v1, v2}, Lhe/a;->g(Landroid/media/MediaFormat;Landroid/view/Surface;)V

    .line 50
    .line 51
    .line 52
    return-void
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
.end method

.method private m()I
    .locals 9

    .line 1
    iget-object v0, p0, Lpe/c;->d:Lhe/a;

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    invoke-interface {v0, v1, v2}, Lhe/a;->d(J)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x2

    .line 10
    if-ltz v0, :cond_6

    .line 11
    .line 12
    iget-object v2, p0, Lpe/c;->d:Lhe/a;

    .line 13
    .line 14
    invoke-interface {v2, v0}, Lhe/a;->b(I)Lhe/c;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    if-eqz v2, :cond_5

    .line 19
    .line 20
    iget-object v3, v2, Lhe/c;->c:Landroid/media/MediaCodec$BufferInfo;

    .line 21
    .line 22
    iget v4, v3, Landroid/media/MediaCodec$BufferInfo;->flags:I

    .line 23
    .line 24
    const/4 v5, 0x4

    .line 25
    and-int/2addr v4, v5

    .line 26
    const/4 v6, 0x0

    .line 27
    if-eqz v4, :cond_0

    .line 28
    .line 29
    sget-object v1, Lpe/e;->t:Ljava/lang/String;

    .line 30
    .line 31
    const-string v2, "EoS on decoder output stream"

    .line 32
    .line 33
    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 34
    .line 35
    .line 36
    iget-object v1, p0, Lpe/c;->d:Lhe/a;

    .line 37
    .line 38
    invoke-interface {v1, v0, v6}, Lhe/a;->h(IZ)V

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, Lpe/c;->e:Lhe/b;

    .line 42
    .line 43
    invoke-interface {v0}, Lhe/b;->g()V

    .line 44
    .line 45
    .line 46
    move v1, v5

    .line 47
    goto/16 :goto_1

    .line 48
    .line 49
    :cond_0
    iget-wide v3, v3, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 50
    .line 51
    iget-object v5, p0, Lpe/c;->f:Lcom/linkedin/android/litr/io/MediaRange;

    .line 52
    .line 53
    invoke-virtual {v5}, Lcom/linkedin/android/litr/io/MediaRange;->b()J

    .line 54
    .line 55
    .line 56
    move-result-wide v7

    .line 57
    cmp-long v3, v3, v7

    .line 58
    .line 59
    const/4 v4, 0x1

    .line 60
    if-ltz v3, :cond_1

    .line 61
    .line 62
    move v3, v4

    .line 63
    goto :goto_0

    .line 64
    :cond_1
    move v3, v6

    .line 65
    :goto_0
    iget-object v5, p0, Lpe/c;->d:Lhe/a;

    .line 66
    .line 67
    invoke-interface {v5, v0, v3}, Lhe/a;->h(IZ)V

    .line 68
    .line 69
    .line 70
    iget-object v0, p0, Lpe/e;->s:Loe/e;

    .line 71
    .line 72
    if-eqz v0, :cond_2

    .line 73
    .line 74
    invoke-interface {v0}, Loe/e;->a()Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-eqz v0, :cond_3

    .line 79
    .line 80
    :cond_2
    move v6, v4

    .line 81
    :cond_3
    if-eqz v3, :cond_4

    .line 82
    .line 83
    if-eqz v6, :cond_4

    .line 84
    .line 85
    iget-object v0, p0, Lpe/e;->p:Loe/g;

    .line 86
    .line 87
    sget-object v3, Ljava/util/concurrent/TimeUnit;->MICROSECONDS:Ljava/util/concurrent/TimeUnit;

    .line 88
    .line 89
    iget-object v2, v2, Lhe/c;->c:Landroid/media/MediaCodec$BufferInfo;

    .line 90
    .line 91
    iget-wide v4, v2, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 92
    .line 93
    iget-object v2, p0, Lpe/c;->f:Lcom/linkedin/android/litr/io/MediaRange;

    .line 94
    .line 95
    invoke-virtual {v2}, Lcom/linkedin/android/litr/io/MediaRange;->b()J

    .line 96
    .line 97
    .line 98
    move-result-wide v6

    .line 99
    sub-long/2addr v4, v6

    .line 100
    invoke-virtual {v3, v4, v5}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    .line 101
    .line 102
    .line 103
    move-result-wide v2

    .line 104
    const/4 v4, 0x0

    .line 105
    invoke-virtual {v0, v4, v2, v3}, Loe/g;->b(Lhe/c;J)V

    .line 106
    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_4
    const/4 v0, 0x3

    .line 110
    move v1, v0

    .line 111
    goto :goto_1

    .line 112
    :cond_5
    new-instance v0, Lie/e;

    .line 113
    .line 114
    sget-object v1, Lie/e$a;->v:Lie/e$a;

    .line 115
    .line 116
    invoke-direct {v0, v1}, Lie/e;-><init>(Lie/e$a;)V

    .line 117
    .line 118
    .line 119
    throw v0

    .line 120
    :cond_6
    const/4 v2, -0x2

    .line 121
    if-eq v0, v2, :cond_7

    .line 122
    .line 123
    const/4 v2, -0x1

    .line 124
    if-eq v0, v2, :cond_8

    .line 125
    .line 126
    sget-object v2, Lpe/e;->t:Ljava/lang/String;

    .line 127
    .line 128
    new-instance v3, Ljava/lang/StringBuilder;

    .line 129
    .line 130
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 131
    .line 132
    .line 133
    const-string v4, "Unhandled value "

    .line 134
    .line 135
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    const-string v0, " when receiving decoded input frame"

    .line 142
    .line 143
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    invoke-static {v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 151
    .line 152
    .line 153
    goto :goto_1

    .line 154
    :cond_7
    iget-object v0, p0, Lpe/e;->q:Landroid/media/MediaFormat;

    .line 155
    .line 156
    iget-object v2, p0, Lpe/c;->d:Lhe/a;

    .line 157
    .line 158
    invoke-interface {v2}, Lhe/a;->getOutputFormat()Landroid/media/MediaFormat;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    invoke-virtual {p0, v0, v2}, Lpe/c;->a(Landroid/media/MediaFormat;Landroid/media/MediaFormat;)Landroid/media/MediaFormat;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    iput-object v0, p0, Lpe/e;->q:Landroid/media/MediaFormat;

    .line 167
    .line 168
    iget-object v2, p0, Lpe/e;->p:Loe/g;

    .line 169
    .line 170
    iget-object v3, p0, Lpe/e;->r:Landroid/media/MediaFormat;

    .line 171
    .line 172
    invoke-virtual {v2, v0, v3}, Loe/g;->d(Landroid/media/MediaFormat;Landroid/media/MediaFormat;)V

    .line 173
    .line 174
    .line 175
    sget-object v0, Lpe/e;->t:Ljava/lang/String;

    .line 176
    .line 177
    new-instance v2, Ljava/lang/StringBuilder;

    .line 178
    .line 179
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 180
    .line 181
    .line 182
    const-string v3, "Decoder output format changed: "

    .line 183
    .line 184
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    iget-object v3, p0, Lpe/e;->q:Landroid/media/MediaFormat;

    .line 188
    .line 189
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v2

    .line 196
    invoke-static {v0, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 197
    .line 198
    .line 199
    :cond_8
    :goto_1
    return v1
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

.method private n()I
    .locals 9

    .line 1
    iget-object v0, p0, Lpe/c;->e:Lhe/b;

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    invoke-interface {v0, v1, v2}, Lhe/b;->d(J)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v3, 0x2

    .line 10
    if-ltz v0, :cond_3

    .line 11
    .line 12
    iget-object v4, p0, Lpe/c;->e:Lhe/b;

    .line 13
    .line 14
    invoke-interface {v4, v0}, Lhe/b;->b(I)Lhe/c;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    if-eqz v4, :cond_2

    .line 19
    .line 20
    iget-object v5, v4, Lhe/c;->c:Landroid/media/MediaCodec$BufferInfo;

    .line 21
    .line 22
    iget v6, v5, Landroid/media/MediaCodec$BufferInfo;->flags:I

    .line 23
    .line 24
    and-int/lit8 v7, v6, 0x4

    .line 25
    .line 26
    if-eqz v7, :cond_0

    .line 27
    .line 28
    sget-object v1, Lpe/e;->t:Ljava/lang/String;

    .line 29
    .line 30
    const-string v2, "Encoder produced EoS, we are done"

    .line 31
    .line 32
    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 33
    .line 34
    .line 35
    const/high16 v1, 0x3f800000    # 1.0f

    .line 36
    .line 37
    iput v1, p0, Lpe/c;->l:F

    .line 38
    .line 39
    const/4 v1, 0x4

    .line 40
    move v3, v1

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    iget v7, v5, Landroid/media/MediaCodec$BufferInfo;->size:I

    .line 43
    .line 44
    if-lez v7, :cond_1

    .line 45
    .line 46
    and-int/2addr v6, v3

    .line 47
    if-nez v6, :cond_1

    .line 48
    .line 49
    iget-object v6, p0, Lpe/c;->b:Lne/d;

    .line 50
    .line 51
    iget v7, p0, Lpe/c;->h:I

    .line 52
    .line 53
    iget-object v8, v4, Lhe/c;->b:Ljava/nio/ByteBuffer;

    .line 54
    .line 55
    invoke-interface {v6, v7, v8, v5}, Lne/d;->a(ILjava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;)V

    .line 56
    .line 57
    .line 58
    iget-wide v5, p0, Lpe/c;->k:J

    .line 59
    .line 60
    cmp-long v1, v5, v1

    .line 61
    .line 62
    if-lez v1, :cond_1

    .line 63
    .line 64
    iget-object v1, v4, Lhe/c;->c:Landroid/media/MediaCodec$BufferInfo;

    .line 65
    .line 66
    iget-wide v1, v1, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 67
    .line 68
    long-to-float v1, v1

    .line 69
    long-to-float v2, v5

    .line 70
    div-float/2addr v1, v2

    .line 71
    iput v1, p0, Lpe/c;->l:F

    .line 72
    .line 73
    :cond_1
    :goto_0
    iget-object v1, p0, Lpe/c;->e:Lhe/b;

    .line 74
    .line 75
    invoke-interface {v1, v0}, Lhe/b;->h(I)V

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_2
    new-instance v0, Lie/e;

    .line 80
    .line 81
    sget-object v1, Lie/e$a;->v:Lie/e$a;

    .line 82
    .line 83
    invoke-direct {v0, v1}, Lie/e;-><init>(Lie/e$a;)V

    .line 84
    .line 85
    .line 86
    throw v0

    .line 87
    :cond_3
    const/4 v1, -0x2

    .line 88
    if-eq v0, v1, :cond_4

    .line 89
    .line 90
    const/4 v1, -0x1

    .line 91
    if-eq v0, v1, :cond_6

    .line 92
    .line 93
    sget-object v1, Lpe/e;->t:Ljava/lang/String;

    .line 94
    .line 95
    new-instance v2, Ljava/lang/StringBuilder;

    .line 96
    .line 97
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 98
    .line 99
    .line 100
    const-string v4, "Unhandled value "

    .line 101
    .line 102
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    const-string v0, " when receiving encoded output frame"

    .line 109
    .line 110
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 118
    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_4
    iget-object v0, p0, Lpe/c;->e:Lhe/b;

    .line 122
    .line 123
    invoke-interface {v0}, Lhe/b;->getOutputFormat()Landroid/media/MediaFormat;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    iget-boolean v1, p0, Lpe/c;->i:Z

    .line 128
    .line 129
    const/4 v3, 0x1

    .line 130
    if-nez v1, :cond_5

    .line 131
    .line 132
    iget-object v1, p0, Lpe/e;->q:Landroid/media/MediaFormat;

    .line 133
    .line 134
    invoke-virtual {p0, v1, v0}, Lpe/c;->a(Landroid/media/MediaFormat;Landroid/media/MediaFormat;)Landroid/media/MediaFormat;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    iput-object v1, p0, Lpe/c;->j:Landroid/media/MediaFormat;

    .line 139
    .line 140
    iput-object v1, p0, Lpe/e;->r:Landroid/media/MediaFormat;

    .line 141
    .line 142
    iget-object v2, p0, Lpe/c;->b:Lne/d;

    .line 143
    .line 144
    iget v4, p0, Lpe/c;->h:I

    .line 145
    .line 146
    invoke-interface {v2, v1, v4}, Lne/d;->c(Landroid/media/MediaFormat;I)I

    .line 147
    .line 148
    .line 149
    move-result v1

    .line 150
    iput v1, p0, Lpe/c;->h:I

    .line 151
    .line 152
    iput-boolean v3, p0, Lpe/c;->i:Z

    .line 153
    .line 154
    iget-object v1, p0, Lpe/e;->p:Loe/g;

    .line 155
    .line 156
    iget-object v2, p0, Lpe/e;->q:Landroid/media/MediaFormat;

    .line 157
    .line 158
    iget-object v4, p0, Lpe/e;->r:Landroid/media/MediaFormat;

    .line 159
    .line 160
    invoke-virtual {v1, v2, v4}, Loe/g;->d(Landroid/media/MediaFormat;Landroid/media/MediaFormat;)V

    .line 161
    .line 162
    .line 163
    :cond_5
    sget-object v1, Lpe/e;->t:Ljava/lang/String;

    .line 164
    .line 165
    new-instance v2, Ljava/lang/StringBuilder;

    .line 166
    .line 167
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 168
    .line 169
    .line 170
    const-string v4, "Encoder output format received "

    .line 171
    .line 172
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 183
    .line 184
    .line 185
    :cond_6
    :goto_1
    return v3
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
.end method


# virtual methods
.method public g()I
    .locals 5

    .line 1
    iget-object v0, p0, Lpe/c;->e:Lhe/b;

    .line 2
    .line 3
    invoke-interface {v0}, Lhe/b;->isRunning()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_9

    .line 8
    .line 9
    iget-object v0, p0, Lpe/c;->d:Lhe/a;

    .line 10
    .line 11
    invoke-interface {v0}, Lhe/a;->isRunning()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    goto :goto_2

    .line 18
    :cond_0
    iget v0, p0, Lpe/e;->m:I

    .line 19
    .line 20
    const/4 v1, 0x5

    .line 21
    if-ne v0, v1, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0}, Lpe/c;->b()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    iput v0, p0, Lpe/e;->m:I

    .line 28
    .line 29
    :cond_1
    iget v0, p0, Lpe/e;->m:I

    .line 30
    .line 31
    const/4 v2, 0x4

    .line 32
    if-eq v0, v2, :cond_2

    .line 33
    .line 34
    if-eq v0, v1, :cond_2

    .line 35
    .line 36
    invoke-direct {p0}, Lpe/e;->k()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iput v0, p0, Lpe/e;->m:I

    .line 41
    .line 42
    :cond_2
    iget v0, p0, Lpe/e;->n:I

    .line 43
    .line 44
    if-eq v0, v2, :cond_3

    .line 45
    .line 46
    invoke-direct {p0}, Lpe/e;->m()I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    iput v0, p0, Lpe/e;->n:I

    .line 51
    .line 52
    :cond_3
    iget v0, p0, Lpe/e;->o:I

    .line 53
    .line 54
    if-eq v0, v2, :cond_4

    .line 55
    .line 56
    invoke-direct {p0}, Lpe/e;->n()I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    iput v0, p0, Lpe/e;->o:I

    .line 61
    .line 62
    :cond_4
    iget v0, p0, Lpe/e;->o:I

    .line 63
    .line 64
    const/4 v3, 0x1

    .line 65
    if-ne v0, v3, :cond_5

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_5
    const/4 v3, 0x2

    .line 69
    :goto_0
    iget v4, p0, Lpe/e;->m:I

    .line 70
    .line 71
    if-eq v4, v2, :cond_6

    .line 72
    .line 73
    if-ne v4, v1, :cond_7

    .line 74
    .line 75
    :cond_6
    iget v1, p0, Lpe/e;->n:I

    .line 76
    .line 77
    if-ne v1, v2, :cond_7

    .line 78
    .line 79
    if-ne v0, v2, :cond_7

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_7
    iget v0, p0, Lpe/e;->n:I

    .line 83
    .line 84
    const/4 v2, 0x3

    .line 85
    if-ne v0, v2, :cond_8

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_8
    move v2, v3

    .line 89
    :goto_1
    return v2

    .line 90
    :cond_9
    :goto_2
    const/4 v0, -0x3

    .line 91
    return v0
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
.end method

.method public h()V
    .locals 2

    .line 1
    iget-object v0, p0, Lpe/c;->a:Lne/c;

    .line 2
    .line 3
    iget v1, p0, Lpe/c;->g:I

    .line 4
    .line 5
    invoke-interface {v0, v1}, Lne/c;->selectTrack(I)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lpe/c;->e:Lhe/b;

    .line 9
    .line 10
    invoke-interface {v0}, Lhe/b;->start()V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lpe/c;->d:Lhe/a;

    .line 14
    .line 15
    invoke-interface {v0}, Lhe/a;->start()V

    .line 16
    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public i()V
    .locals 1

    .line 1
    iget-object v0, p0, Lpe/c;->e:Lhe/b;

    .line 2
    .line 3
    invoke-interface {v0}, Lhe/b;->stop()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lpe/c;->e:Lhe/b;

    .line 7
    .line 8
    invoke-interface {v0}, Lhe/b;->release()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lpe/c;->d:Lhe/a;

    .line 12
    .line 13
    invoke-interface {v0}, Lhe/a;->stop()V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lpe/c;->d:Lhe/a;

    .line 17
    .line 18
    invoke-interface {v0}, Lhe/a;->release()V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lpe/e;->p:Loe/g;

    .line 22
    .line 23
    invoke-virtual {v0}, Loe/g;->release()V

    .line 24
    .line 25
    .line 26
    return-void
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
.end method
