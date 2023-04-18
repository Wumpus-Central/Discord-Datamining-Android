.class final Lv7/p$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv7/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv7/p$b$a;
    }
.end annotation


# instance fields
.field private final a:Ll7/b0;

.field private final b:Z

.field private final c:Z

.field private final d:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lf9/w$b;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lf9/w$a;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Lf9/z;

.field private g:[B

.field private h:I

.field private i:I

.field private j:J

.field private k:Z

.field private l:J

.field private m:Lv7/p$b$a;

.field private n:Lv7/p$b$a;

.field private o:Z

.field private p:J

.field private q:J

.field private r:Z


# direct methods
.method public constructor <init>(Ll7/b0;ZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lv7/p$b;->a:Ll7/b0;

    .line 5
    .line 6
    iput-boolean p2, p0, Lv7/p$b;->b:Z

    .line 7
    .line 8
    iput-boolean p3, p0, Lv7/p$b;->c:Z

    .line 9
    .line 10
    new-instance p1, Landroid/util/SparseArray;

    .line 11
    .line 12
    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lv7/p$b;->d:Landroid/util/SparseArray;

    .line 16
    .line 17
    new-instance p1, Landroid/util/SparseArray;

    .line 18
    .line 19
    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Lv7/p$b;->e:Landroid/util/SparseArray;

    .line 23
    .line 24
    new-instance p1, Lv7/p$b$a;

    .line 25
    .line 26
    const/4 p2, 0x0

    .line 27
    invoke-direct {p1, p2}, Lv7/p$b$a;-><init>(Lv7/p$a;)V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Lv7/p$b;->m:Lv7/p$b$a;

    .line 31
    .line 32
    new-instance p1, Lv7/p$b$a;

    .line 33
    .line 34
    invoke-direct {p1, p2}, Lv7/p$b$a;-><init>(Lv7/p$a;)V

    .line 35
    .line 36
    .line 37
    iput-object p1, p0, Lv7/p$b;->n:Lv7/p$b$a;

    .line 38
    .line 39
    const/16 p1, 0x80

    .line 40
    .line 41
    new-array p1, p1, [B

    .line 42
    .line 43
    iput-object p1, p0, Lv7/p$b;->g:[B

    .line 44
    .line 45
    new-instance p2, Lf9/z;

    .line 46
    .line 47
    const/4 p3, 0x0

    .line 48
    invoke-direct {p2, p1, p3, p3}, Lf9/z;-><init>([BII)V

    .line 49
    .line 50
    .line 51
    iput-object p2, p0, Lv7/p$b;->f:Lf9/z;

    .line 52
    .line 53
    invoke-virtual {p0}, Lv7/p$b;->g()V

    .line 54
    .line 55
    .line 56
    return-void
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

.method private d(I)V
    .locals 7

    .line 1
    iget-boolean v3, p0, Lv7/p$b;->r:Z

    .line 2
    .line 3
    iget-wide v0, p0, Lv7/p$b;->j:J

    .line 4
    .line 5
    iget-wide v4, p0, Lv7/p$b;->p:J

    .line 6
    .line 7
    sub-long/2addr v0, v4

    .line 8
    long-to-int v4, v0

    .line 9
    iget-object v0, p0, Lv7/p$b;->a:Ll7/b0;

    .line 10
    .line 11
    iget-wide v1, p0, Lv7/p$b;->q:J

    .line 12
    .line 13
    const/4 v6, 0x0

    .line 14
    move v5, p1

    .line 15
    invoke-interface/range {v0 .. v6}, Ll7/b0;->d(JIIILl7/b0$a;)V

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


# virtual methods
.method public a([BII)V
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    iget-boolean v2, v0, Lv7/p$b;->k:Z

    .line 6
    .line 7
    if-nez v2, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    sub-int v2, p3, v1

    .line 11
    .line 12
    iget-object v3, v0, Lv7/p$b;->g:[B

    .line 13
    .line 14
    array-length v4, v3

    .line 15
    iget v5, v0, Lv7/p$b;->h:I

    .line 16
    .line 17
    add-int v6, v5, v2

    .line 18
    .line 19
    const/4 v7, 0x2

    .line 20
    if-ge v4, v6, :cond_1

    .line 21
    .line 22
    add-int/2addr v5, v2

    .line 23
    mul-int/2addr v5, v7

    .line 24
    invoke-static {v3, v5}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    iput-object v3, v0, Lv7/p$b;->g:[B

    .line 29
    .line 30
    :cond_1
    iget-object v3, v0, Lv7/p$b;->g:[B

    .line 31
    .line 32
    iget v4, v0, Lv7/p$b;->h:I

    .line 33
    .line 34
    move-object/from16 v5, p1

    .line 35
    .line 36
    invoke-static {v5, v1, v3, v4, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 37
    .line 38
    .line 39
    iget v1, v0, Lv7/p$b;->h:I

    .line 40
    .line 41
    add-int/2addr v1, v2

    .line 42
    iput v1, v0, Lv7/p$b;->h:I

    .line 43
    .line 44
    iget-object v2, v0, Lv7/p$b;->f:Lf9/z;

    .line 45
    .line 46
    iget-object v3, v0, Lv7/p$b;->g:[B

    .line 47
    .line 48
    const/4 v4, 0x0

    .line 49
    invoke-virtual {v2, v3, v4, v1}, Lf9/z;->i([BII)V

    .line 50
    .line 51
    .line 52
    iget-object v1, v0, Lv7/p$b;->f:Lf9/z;

    .line 53
    .line 54
    const/16 v2, 0x8

    .line 55
    .line 56
    invoke-virtual {v1, v2}, Lf9/z;->b(I)Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-nez v1, :cond_2

    .line 61
    .line 62
    return-void

    .line 63
    :cond_2
    iget-object v1, v0, Lv7/p$b;->f:Lf9/z;

    .line 64
    .line 65
    invoke-virtual {v1}, Lf9/z;->k()V

    .line 66
    .line 67
    .line 68
    iget-object v1, v0, Lv7/p$b;->f:Lf9/z;

    .line 69
    .line 70
    invoke-virtual {v1, v7}, Lf9/z;->e(I)I

    .line 71
    .line 72
    .line 73
    move-result v10

    .line 74
    iget-object v1, v0, Lv7/p$b;->f:Lf9/z;

    .line 75
    .line 76
    const/4 v2, 0x5

    .line 77
    invoke-virtual {v1, v2}, Lf9/z;->l(I)V

    .line 78
    .line 79
    .line 80
    iget-object v1, v0, Lv7/p$b;->f:Lf9/z;

    .line 81
    .line 82
    invoke-virtual {v1}, Lf9/z;->c()Z

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    if-nez v1, :cond_3

    .line 87
    .line 88
    return-void

    .line 89
    :cond_3
    iget-object v1, v0, Lv7/p$b;->f:Lf9/z;

    .line 90
    .line 91
    invoke-virtual {v1}, Lf9/z;->h()I

    .line 92
    .line 93
    .line 94
    iget-object v1, v0, Lv7/p$b;->f:Lf9/z;

    .line 95
    .line 96
    invoke-virtual {v1}, Lf9/z;->c()Z

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    if-nez v1, :cond_4

    .line 101
    .line 102
    return-void

    .line 103
    :cond_4
    iget-object v1, v0, Lv7/p$b;->f:Lf9/z;

    .line 104
    .line 105
    invoke-virtual {v1}, Lf9/z;->h()I

    .line 106
    .line 107
    .line 108
    move-result v11

    .line 109
    iget-boolean v1, v0, Lv7/p$b;->c:Z

    .line 110
    .line 111
    if-nez v1, :cond_5

    .line 112
    .line 113
    iput-boolean v4, v0, Lv7/p$b;->k:Z

    .line 114
    .line 115
    iget-object v1, v0, Lv7/p$b;->n:Lv7/p$b$a;

    .line 116
    .line 117
    invoke-virtual {v1, v11}, Lv7/p$b$a;->f(I)V

    .line 118
    .line 119
    .line 120
    return-void

    .line 121
    :cond_5
    iget-object v1, v0, Lv7/p$b;->f:Lf9/z;

    .line 122
    .line 123
    invoke-virtual {v1}, Lf9/z;->c()Z

    .line 124
    .line 125
    .line 126
    move-result v1

    .line 127
    if-nez v1, :cond_6

    .line 128
    .line 129
    return-void

    .line 130
    :cond_6
    iget-object v1, v0, Lv7/p$b;->f:Lf9/z;

    .line 131
    .line 132
    invoke-virtual {v1}, Lf9/z;->h()I

    .line 133
    .line 134
    .line 135
    move-result v13

    .line 136
    iget-object v1, v0, Lv7/p$b;->e:Landroid/util/SparseArray;

    .line 137
    .line 138
    invoke-virtual {v1, v13}, Landroid/util/SparseArray;->indexOfKey(I)I

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    if-gez v1, :cond_7

    .line 143
    .line 144
    iput-boolean v4, v0, Lv7/p$b;->k:Z

    .line 145
    .line 146
    return-void

    .line 147
    :cond_7
    iget-object v1, v0, Lv7/p$b;->e:Landroid/util/SparseArray;

    .line 148
    .line 149
    invoke-virtual {v1, v13}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    check-cast v1, Lf9/w$a;

    .line 154
    .line 155
    iget-object v3, v0, Lv7/p$b;->d:Landroid/util/SparseArray;

    .line 156
    .line 157
    iget v5, v1, Lf9/w$a;->b:I

    .line 158
    .line 159
    invoke-virtual {v3, v5}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v3

    .line 163
    move-object v9, v3

    .line 164
    check-cast v9, Lf9/w$b;

    .line 165
    .line 166
    iget-boolean v3, v9, Lf9/w$b;->h:Z

    .line 167
    .line 168
    if-eqz v3, :cond_9

    .line 169
    .line 170
    iget-object v3, v0, Lv7/p$b;->f:Lf9/z;

    .line 171
    .line 172
    invoke-virtual {v3, v7}, Lf9/z;->b(I)Z

    .line 173
    .line 174
    .line 175
    move-result v3

    .line 176
    if-nez v3, :cond_8

    .line 177
    .line 178
    return-void

    .line 179
    :cond_8
    iget-object v3, v0, Lv7/p$b;->f:Lf9/z;

    .line 180
    .line 181
    invoke-virtual {v3, v7}, Lf9/z;->l(I)V

    .line 182
    .line 183
    .line 184
    :cond_9
    iget-object v3, v0, Lv7/p$b;->f:Lf9/z;

    .line 185
    .line 186
    iget v5, v9, Lf9/w$b;->j:I

    .line 187
    .line 188
    invoke-virtual {v3, v5}, Lf9/z;->b(I)Z

    .line 189
    .line 190
    .line 191
    move-result v3

    .line 192
    if-nez v3, :cond_a

    .line 193
    .line 194
    return-void

    .line 195
    :cond_a
    iget-object v3, v0, Lv7/p$b;->f:Lf9/z;

    .line 196
    .line 197
    iget v5, v9, Lf9/w$b;->j:I

    .line 198
    .line 199
    invoke-virtual {v3, v5}, Lf9/z;->e(I)I

    .line 200
    .line 201
    .line 202
    move-result v12

    .line 203
    iget-boolean v3, v9, Lf9/w$b;->i:Z

    .line 204
    .line 205
    const/4 v5, 0x1

    .line 206
    if-nez v3, :cond_e

    .line 207
    .line 208
    iget-object v3, v0, Lv7/p$b;->f:Lf9/z;

    .line 209
    .line 210
    invoke-virtual {v3, v5}, Lf9/z;->b(I)Z

    .line 211
    .line 212
    .line 213
    move-result v3

    .line 214
    if-nez v3, :cond_b

    .line 215
    .line 216
    return-void

    .line 217
    :cond_b
    iget-object v3, v0, Lv7/p$b;->f:Lf9/z;

    .line 218
    .line 219
    invoke-virtual {v3}, Lf9/z;->d()Z

    .line 220
    .line 221
    .line 222
    move-result v3

    .line 223
    if-eqz v3, :cond_d

    .line 224
    .line 225
    iget-object v6, v0, Lv7/p$b;->f:Lf9/z;

    .line 226
    .line 227
    invoke-virtual {v6, v5}, Lf9/z;->b(I)Z

    .line 228
    .line 229
    .line 230
    move-result v6

    .line 231
    if-nez v6, :cond_c

    .line 232
    .line 233
    return-void

    .line 234
    :cond_c
    iget-object v6, v0, Lv7/p$b;->f:Lf9/z;

    .line 235
    .line 236
    invoke-virtual {v6}, Lf9/z;->d()Z

    .line 237
    .line 238
    .line 239
    move-result v6

    .line 240
    move v14, v3

    .line 241
    move v15, v5

    .line 242
    move/from16 v16, v6

    .line 243
    .line 244
    goto :goto_1

    .line 245
    :cond_d
    move v14, v3

    .line 246
    move v15, v4

    .line 247
    goto :goto_0

    .line 248
    :cond_e
    move v14, v4

    .line 249
    move v15, v14

    .line 250
    :goto_0
    move/from16 v16, v15

    .line 251
    .line 252
    :goto_1
    iget v3, v0, Lv7/p$b;->i:I

    .line 253
    .line 254
    if-ne v3, v2, :cond_f

    .line 255
    .line 256
    move/from16 v17, v5

    .line 257
    .line 258
    goto :goto_2

    .line 259
    :cond_f
    move/from16 v17, v4

    .line 260
    .line 261
    :goto_2
    if-eqz v17, :cond_11

    .line 262
    .line 263
    iget-object v2, v0, Lv7/p$b;->f:Lf9/z;

    .line 264
    .line 265
    invoke-virtual {v2}, Lf9/z;->c()Z

    .line 266
    .line 267
    .line 268
    move-result v2

    .line 269
    if-nez v2, :cond_10

    .line 270
    .line 271
    return-void

    .line 272
    :cond_10
    iget-object v2, v0, Lv7/p$b;->f:Lf9/z;

    .line 273
    .line 274
    invoke-virtual {v2}, Lf9/z;->h()I

    .line 275
    .line 276
    .line 277
    move-result v2

    .line 278
    move/from16 v18, v2

    .line 279
    .line 280
    goto :goto_3

    .line 281
    :cond_11
    move/from16 v18, v4

    .line 282
    .line 283
    :goto_3
    iget v2, v9, Lf9/w$b;->k:I

    .line 284
    .line 285
    if-nez v2, :cond_15

    .line 286
    .line 287
    iget-object v2, v0, Lv7/p$b;->f:Lf9/z;

    .line 288
    .line 289
    iget v3, v9, Lf9/w$b;->l:I

    .line 290
    .line 291
    invoke-virtual {v2, v3}, Lf9/z;->b(I)Z

    .line 292
    .line 293
    .line 294
    move-result v2

    .line 295
    if-nez v2, :cond_12

    .line 296
    .line 297
    return-void

    .line 298
    :cond_12
    iget-object v2, v0, Lv7/p$b;->f:Lf9/z;

    .line 299
    .line 300
    iget v3, v9, Lf9/w$b;->l:I

    .line 301
    .line 302
    invoke-virtual {v2, v3}, Lf9/z;->e(I)I

    .line 303
    .line 304
    .line 305
    move-result v2

    .line 306
    iget-boolean v1, v1, Lf9/w$a;->c:Z

    .line 307
    .line 308
    if-eqz v1, :cond_14

    .line 309
    .line 310
    if-nez v14, :cond_14

    .line 311
    .line 312
    iget-object v1, v0, Lv7/p$b;->f:Lf9/z;

    .line 313
    .line 314
    invoke-virtual {v1}, Lf9/z;->c()Z

    .line 315
    .line 316
    .line 317
    move-result v1

    .line 318
    if-nez v1, :cond_13

    .line 319
    .line 320
    return-void

    .line 321
    :cond_13
    iget-object v1, v0, Lv7/p$b;->f:Lf9/z;

    .line 322
    .line 323
    invoke-virtual {v1}, Lf9/z;->g()I

    .line 324
    .line 325
    .line 326
    move-result v1

    .line 327
    move/from16 v20, v1

    .line 328
    .line 329
    move/from16 v19, v2

    .line 330
    .line 331
    move/from16 v21, v4

    .line 332
    .line 333
    goto :goto_5

    .line 334
    :cond_14
    move/from16 v19, v2

    .line 335
    .line 336
    move/from16 v20, v4

    .line 337
    .line 338
    goto :goto_4

    .line 339
    :cond_15
    if-ne v2, v5, :cond_19

    .line 340
    .line 341
    iget-boolean v2, v9, Lf9/w$b;->m:Z

    .line 342
    .line 343
    if-nez v2, :cond_19

    .line 344
    .line 345
    iget-object v2, v0, Lv7/p$b;->f:Lf9/z;

    .line 346
    .line 347
    invoke-virtual {v2}, Lf9/z;->c()Z

    .line 348
    .line 349
    .line 350
    move-result v2

    .line 351
    if-nez v2, :cond_16

    .line 352
    .line 353
    return-void

    .line 354
    :cond_16
    iget-object v2, v0, Lv7/p$b;->f:Lf9/z;

    .line 355
    .line 356
    invoke-virtual {v2}, Lf9/z;->g()I

    .line 357
    .line 358
    .line 359
    move-result v2

    .line 360
    iget-boolean v1, v1, Lf9/w$a;->c:Z

    .line 361
    .line 362
    if-eqz v1, :cond_18

    .line 363
    .line 364
    if-nez v14, :cond_18

    .line 365
    .line 366
    iget-object v1, v0, Lv7/p$b;->f:Lf9/z;

    .line 367
    .line 368
    invoke-virtual {v1}, Lf9/z;->c()Z

    .line 369
    .line 370
    .line 371
    move-result v1

    .line 372
    if-nez v1, :cond_17

    .line 373
    .line 374
    return-void

    .line 375
    :cond_17
    iget-object v1, v0, Lv7/p$b;->f:Lf9/z;

    .line 376
    .line 377
    invoke-virtual {v1}, Lf9/z;->g()I

    .line 378
    .line 379
    .line 380
    move-result v1

    .line 381
    move/from16 v22, v1

    .line 382
    .line 383
    move/from16 v21, v2

    .line 384
    .line 385
    move/from16 v19, v4

    .line 386
    .line 387
    move/from16 v20, v19

    .line 388
    .line 389
    goto :goto_6

    .line 390
    :cond_18
    move/from16 v21, v2

    .line 391
    .line 392
    move/from16 v19, v4

    .line 393
    .line 394
    move/from16 v20, v19

    .line 395
    .line 396
    move/from16 v22, v20

    .line 397
    .line 398
    goto :goto_6

    .line 399
    :cond_19
    move/from16 v19, v4

    .line 400
    .line 401
    move/from16 v20, v19

    .line 402
    .line 403
    :goto_4
    move/from16 v21, v20

    .line 404
    .line 405
    :goto_5
    move/from16 v22, v21

    .line 406
    .line 407
    :goto_6
    iget-object v8, v0, Lv7/p$b;->n:Lv7/p$b$a;

    .line 408
    .line 409
    invoke-virtual/range {v8 .. v22}, Lv7/p$b$a;->e(Lf9/w$b;IIIIZZZZIIIII)V

    .line 410
    .line 411
    .line 412
    iput-boolean v4, v0, Lv7/p$b;->k:Z

    .line 413
    .line 414
    return-void
    .line 415
    .line 416
    .line 417
    .line 418
.end method

.method public b(JIZZ)Z
    .locals 4

    .line 1
    iget v0, p0, Lv7/p$b;->i:I

    .line 2
    .line 3
    const/16 v1, 0x9

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    .line 9
    iget-boolean v0, p0, Lv7/p$b;->c:Z

    .line 10
    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    iget-object v0, p0, Lv7/p$b;->n:Lv7/p$b$a;

    .line 14
    .line 15
    iget-object v1, p0, Lv7/p$b;->m:Lv7/p$b$a;

    .line 16
    .line 17
    invoke-static {v0, v1}, Lv7/p$b$a;->a(Lv7/p$b$a;Lv7/p$b$a;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    :cond_0
    if-eqz p4, :cond_1

    .line 24
    .line 25
    iget-boolean p4, p0, Lv7/p$b;->o:Z

    .line 26
    .line 27
    if-eqz p4, :cond_1

    .line 28
    .line 29
    iget-wide v0, p0, Lv7/p$b;->j:J

    .line 30
    .line 31
    sub-long/2addr p1, v0

    .line 32
    long-to-int p1, p1

    .line 33
    add-int/2addr p3, p1

    .line 34
    invoke-direct {p0, p3}, Lv7/p$b;->d(I)V

    .line 35
    .line 36
    .line 37
    :cond_1
    iget-wide p1, p0, Lv7/p$b;->j:J

    .line 38
    .line 39
    iput-wide p1, p0, Lv7/p$b;->p:J

    .line 40
    .line 41
    iget-wide p1, p0, Lv7/p$b;->l:J

    .line 42
    .line 43
    iput-wide p1, p0, Lv7/p$b;->q:J

    .line 44
    .line 45
    iput-boolean v2, p0, Lv7/p$b;->r:Z

    .line 46
    .line 47
    iput-boolean v3, p0, Lv7/p$b;->o:Z

    .line 48
    .line 49
    :cond_2
    iget-boolean p1, p0, Lv7/p$b;->b:Z

    .line 50
    .line 51
    if-eqz p1, :cond_3

    .line 52
    .line 53
    iget-object p1, p0, Lv7/p$b;->n:Lv7/p$b$a;

    .line 54
    .line 55
    invoke-virtual {p1}, Lv7/p$b$a;->d()Z

    .line 56
    .line 57
    .line 58
    move-result p5

    .line 59
    :cond_3
    iget-boolean p1, p0, Lv7/p$b;->r:Z

    .line 60
    .line 61
    iget p2, p0, Lv7/p$b;->i:I

    .line 62
    .line 63
    const/4 p3, 0x5

    .line 64
    if-eq p2, p3, :cond_4

    .line 65
    .line 66
    if-eqz p5, :cond_5

    .line 67
    .line 68
    if-ne p2, v3, :cond_5

    .line 69
    .line 70
    :cond_4
    move v2, v3

    .line 71
    :cond_5
    or-int/2addr p1, v2

    .line 72
    iput-boolean p1, p0, Lv7/p$b;->r:Z

    .line 73
    .line 74
    return p1
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
.end method

.method public c()Z
    .locals 1

    iget-boolean v0, p0, Lv7/p$b;->c:Z

    return v0
.end method

.method public e(Lf9/w$a;)V
    .locals 2

    iget-object v0, p0, Lv7/p$b;->e:Landroid/util/SparseArray;

    iget v1, p1, Lf9/w$a;->a:I

    invoke-virtual {v0, v1, p1}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    return-void
.end method

.method public f(Lf9/w$b;)V
    .locals 2

    iget-object v0, p0, Lv7/p$b;->d:Landroid/util/SparseArray;

    iget v1, p1, Lf9/w$b;->d:I

    invoke-virtual {v0, v1, p1}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    return-void
.end method

.method public g()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lv7/p$b;->k:Z

    .line 3
    .line 4
    iput-boolean v0, p0, Lv7/p$b;->o:Z

    .line 5
    .line 6
    iget-object v0, p0, Lv7/p$b;->n:Lv7/p$b$a;

    .line 7
    .line 8
    invoke-virtual {v0}, Lv7/p$b$a;->b()V

    .line 9
    .line 10
    .line 11
    return-void
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
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
.end method

.method public h(JIJ)V
    .locals 0

    .line 1
    iput p3, p0, Lv7/p$b;->i:I

    .line 2
    .line 3
    iput-wide p4, p0, Lv7/p$b;->l:J

    .line 4
    .line 5
    iput-wide p1, p0, Lv7/p$b;->j:J

    .line 6
    .line 7
    iget-boolean p1, p0, Lv7/p$b;->b:Z

    .line 8
    .line 9
    const/4 p2, 0x1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    if-eq p3, p2, :cond_1

    .line 13
    .line 14
    :cond_0
    iget-boolean p1, p0, Lv7/p$b;->c:Z

    .line 15
    .line 16
    if-eqz p1, :cond_2

    .line 17
    .line 18
    const/4 p1, 0x5

    .line 19
    if-eq p3, p1, :cond_1

    .line 20
    .line 21
    if-eq p3, p2, :cond_1

    .line 22
    .line 23
    const/4 p1, 0x2

    .line 24
    if-ne p3, p1, :cond_2

    .line 25
    .line 26
    :cond_1
    iget-object p1, p0, Lv7/p$b;->m:Lv7/p$b$a;

    .line 27
    .line 28
    iget-object p3, p0, Lv7/p$b;->n:Lv7/p$b$a;

    .line 29
    .line 30
    iput-object p3, p0, Lv7/p$b;->m:Lv7/p$b$a;

    .line 31
    .line 32
    iput-object p1, p0, Lv7/p$b;->n:Lv7/p$b$a;

    .line 33
    .line 34
    invoke-virtual {p1}, Lv7/p$b$a;->b()V

    .line 35
    .line 36
    .line 37
    const/4 p1, 0x0

    .line 38
    iput p1, p0, Lv7/p$b;->h:I

    .line 39
    .line 40
    iput-boolean p2, p0, Lv7/p$b;->k:Z

    .line 41
    .line 42
    :cond_2
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
