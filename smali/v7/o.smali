.class public final Lv7/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv7/m;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv7/o$b;,
        Lv7/o$a;
    }
.end annotation


# static fields
.field private static final l:[F


# instance fields
.field private final a:Lv7/k0;

.field private final b:Lf9/y;

.field private final c:[Z

.field private final d:Lv7/o$a;

.field private final e:Lv7/u;

.field private f:Lv7/o$b;

.field private g:J

.field private h:Ljava/lang/String;

.field private i:Ll7/b0;

.field private j:Z

.field private k:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x7

    .line 2
    new-array v0, v0, [F

    .line 3
    .line 4
    fill-array-data v0, :array_0

    .line 5
    .line 6
    .line 7
    sput-object v0, Lv7/o;->l:[F

    .line 8
    .line 9
    return-void

    .line 10
    nop

    .line 11
    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f8ba2e9
        0x3f68ba2f
        0x3fba2e8c
        0x3f9b26ca
        0x3f800000    # 1.0f
    .end array-data
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

.method constructor <init>(Lv7/k0;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lv7/o;->a:Lv7/k0;

    .line 5
    .line 6
    const/4 v0, 0x4

    .line 7
    new-array v0, v0, [Z

    .line 8
    .line 9
    iput-object v0, p0, Lv7/o;->c:[Z

    .line 10
    .line 11
    new-instance v0, Lv7/o$a;

    .line 12
    .line 13
    const/16 v1, 0x80

    .line 14
    .line 15
    invoke-direct {v0, v1}, Lv7/o$a;-><init>(I)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lv7/o;->d:Lv7/o$a;

    .line 19
    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    new-instance p1, Lv7/u;

    .line 23
    .line 24
    const/16 v0, 0xb2

    .line 25
    .line 26
    invoke-direct {p1, v0, v1}, Lv7/u;-><init>(II)V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Lv7/o;->e:Lv7/u;

    .line 30
    .line 31
    new-instance p1, Lf9/y;

    .line 32
    .line 33
    invoke-direct {p1}, Lf9/y;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object p1, p0, Lv7/o;->b:Lf9/y;

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const/4 p1, 0x0

    .line 40
    iput-object p1, p0, Lv7/o;->e:Lv7/u;

    .line 41
    .line 42
    iput-object p1, p0, Lv7/o;->b:Lf9/y;

    .line 43
    .line 44
    :goto_0
    return-void
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

.method private static a(Lv7/o$a;ILjava/lang/String;)Ld7/k;
    .locals 8

    .line 1
    iget-object v0, p0, Lv7/o$a;->e:[B

    .line 2
    .line 3
    iget p0, p0, Lv7/o$a;->c:I

    .line 4
    .line 5
    invoke-static {v0, p0}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    new-instance v0, Lf9/x;

    .line 10
    .line 11
    invoke-direct {v0, p0}, Lf9/x;-><init>([B)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lf9/x;->s(I)V

    .line 15
    .line 16
    .line 17
    const/4 p1, 0x4

    .line 18
    invoke-virtual {v0, p1}, Lf9/x;->s(I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Lf9/x;->q()V

    .line 22
    .line 23
    .line 24
    const/16 v1, 0x8

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Lf9/x;->r(I)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Lf9/x;->g()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    const/4 v3, 0x3

    .line 34
    if-eqz v2, :cond_0

    .line 35
    .line 36
    invoke-virtual {v0, p1}, Lf9/x;->r(I)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v3}, Lf9/x;->r(I)V

    .line 40
    .line 41
    .line 42
    :cond_0
    invoke-virtual {v0, p1}, Lf9/x;->h(I)I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    const/high16 v2, 0x3f800000    # 1.0f

    .line 47
    .line 48
    const-string v4, "Invalid aspect ratio"

    .line 49
    .line 50
    const-string v5, "H263Reader"

    .line 51
    .line 52
    const/16 v6, 0xf

    .line 53
    .line 54
    if-ne p1, v6, :cond_2

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Lf9/x;->h(I)I

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    invoke-virtual {v0, v1}, Lf9/x;->h(I)I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-nez v1, :cond_1

    .line 65
    .line 66
    invoke-static {v5, v4}, Lf9/r;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_1
    int-to-float p1, p1

    .line 71
    int-to-float v1, v1

    .line 72
    div-float/2addr p1, v1

    .line 73
    move v2, p1

    .line 74
    goto :goto_0

    .line 75
    :cond_2
    sget-object v1, Lv7/o;->l:[F

    .line 76
    .line 77
    array-length v7, v1

    .line 78
    if-ge p1, v7, :cond_3

    .line 79
    .line 80
    aget v2, v1, p1

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_3
    invoke-static {v5, v4}, Lf9/r;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    :goto_0
    invoke-virtual {v0}, Lf9/x;->g()Z

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    const/4 v1, 0x2

    .line 91
    if-eqz p1, :cond_4

    .line 92
    .line 93
    invoke-virtual {v0, v1}, Lf9/x;->r(I)V

    .line 94
    .line 95
    .line 96
    const/4 p1, 0x1

    .line 97
    invoke-virtual {v0, p1}, Lf9/x;->r(I)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0}, Lf9/x;->g()Z

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    if-eqz p1, :cond_4

    .line 105
    .line 106
    invoke-virtual {v0, v6}, Lf9/x;->r(I)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0}, Lf9/x;->q()V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0, v6}, Lf9/x;->r(I)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0}, Lf9/x;->q()V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0, v6}, Lf9/x;->r(I)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0}, Lf9/x;->q()V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v0, v3}, Lf9/x;->r(I)V

    .line 125
    .line 126
    .line 127
    const/16 p1, 0xb

    .line 128
    .line 129
    invoke-virtual {v0, p1}, Lf9/x;->r(I)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0}, Lf9/x;->q()V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v0, v6}, Lf9/x;->r(I)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v0}, Lf9/x;->q()V

    .line 139
    .line 140
    .line 141
    :cond_4
    invoke-virtual {v0, v1}, Lf9/x;->h(I)I

    .line 142
    .line 143
    .line 144
    move-result p1

    .line 145
    if-eqz p1, :cond_5

    .line 146
    .line 147
    const-string p1, "Unhandled video object layer shape"

    .line 148
    .line 149
    invoke-static {v5, p1}, Lf9/r;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    :cond_5
    invoke-virtual {v0}, Lf9/x;->q()V

    .line 153
    .line 154
    .line 155
    const/16 p1, 0x10

    .line 156
    .line 157
    invoke-virtual {v0, p1}, Lf9/x;->h(I)I

    .line 158
    .line 159
    .line 160
    move-result p1

    .line 161
    invoke-virtual {v0}, Lf9/x;->q()V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v0}, Lf9/x;->g()Z

    .line 165
    .line 166
    .line 167
    move-result v1

    .line 168
    if-eqz v1, :cond_8

    .line 169
    .line 170
    if-nez p1, :cond_6

    .line 171
    .line 172
    const-string p1, "Invalid vop_increment_time_resolution"

    .line 173
    .line 174
    invoke-static {v5, p1}, Lf9/r;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    goto :goto_2

    .line 178
    :cond_6
    add-int/lit8 p1, p1, -0x1

    .line 179
    .line 180
    const/4 v1, 0x0

    .line 181
    :goto_1
    if-lez p1, :cond_7

    .line 182
    .line 183
    add-int/lit8 v1, v1, 0x1

    .line 184
    .line 185
    shr-int/lit8 p1, p1, 0x1

    .line 186
    .line 187
    goto :goto_1

    .line 188
    :cond_7
    invoke-virtual {v0, v1}, Lf9/x;->r(I)V

    .line 189
    .line 190
    .line 191
    :cond_8
    :goto_2
    invoke-virtual {v0}, Lf9/x;->q()V

    .line 192
    .line 193
    .line 194
    const/16 p1, 0xd

    .line 195
    .line 196
    invoke-virtual {v0, p1}, Lf9/x;->h(I)I

    .line 197
    .line 198
    .line 199
    move-result v1

    .line 200
    invoke-virtual {v0}, Lf9/x;->q()V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v0, p1}, Lf9/x;->h(I)I

    .line 204
    .line 205
    .line 206
    move-result p1

    .line 207
    invoke-virtual {v0}, Lf9/x;->q()V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v0}, Lf9/x;->q()V

    .line 211
    .line 212
    .line 213
    new-instance v0, Ld7/k$b;

    .line 214
    .line 215
    invoke-direct {v0}, Ld7/k$b;-><init>()V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v0, p2}, Ld7/k$b;->S(Ljava/lang/String;)Ld7/k$b;

    .line 219
    .line 220
    .line 221
    move-result-object p2

    .line 222
    const-string v0, "video/mp4v-es"

    .line 223
    .line 224
    invoke-virtual {p2, v0}, Ld7/k$b;->e0(Ljava/lang/String;)Ld7/k$b;

    .line 225
    .line 226
    .line 227
    move-result-object p2

    .line 228
    invoke-virtual {p2, v1}, Ld7/k$b;->j0(I)Ld7/k$b;

    .line 229
    .line 230
    .line 231
    move-result-object p2

    .line 232
    invoke-virtual {p2, p1}, Ld7/k$b;->Q(I)Ld7/k$b;

    .line 233
    .line 234
    .line 235
    move-result-object p1

    .line 236
    invoke-virtual {p1, v2}, Ld7/k$b;->a0(F)Ld7/k$b;

    .line 237
    .line 238
    .line 239
    move-result-object p1

    .line 240
    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 241
    .line 242
    .line 243
    move-result-object p0

    .line 244
    invoke-virtual {p1, p0}, Ld7/k$b;->T(Ljava/util/List;)Ld7/k$b;

    .line 245
    .line 246
    .line 247
    move-result-object p0

    .line 248
    invoke-virtual {p0}, Ld7/k$b;->E()Ld7/k;

    .line 249
    .line 250
    .line 251
    move-result-object p0

    .line 252
    return-object p0
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


# virtual methods
.method public b(Lf9/y;)V
    .locals 13

    .line 1
    iget-object v0, p0, Lv7/o;->f:Lv7/o$b;

    .line 2
    .line 3
    invoke-static {v0}, Lf9/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lv7/o;->i:Ll7/b0;

    .line 7
    .line 8
    invoke-static {v0}, Lf9/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lf9/y;->e()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-virtual {p1}, Lf9/y;->f()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-virtual {p1}, Lf9/y;->d()[B

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    iget-wide v3, p0, Lv7/o;->g:J

    .line 24
    .line 25
    invoke-virtual {p1}, Lf9/y;->a()I

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    int-to-long v5, v5

    .line 30
    add-long/2addr v3, v5

    .line 31
    iput-wide v3, p0, Lv7/o;->g:J

    .line 32
    .line 33
    iget-object v3, p0, Lv7/o;->i:Ll7/b0;

    .line 34
    .line 35
    invoke-virtual {p1}, Lf9/y;->a()I

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    invoke-interface {v3, p1, v4}, Ll7/b0;->e(Lf9/y;I)V

    .line 40
    .line 41
    .line 42
    :goto_0
    iget-object v3, p0, Lv7/o;->c:[Z

    .line 43
    .line 44
    invoke-static {v2, v0, v1, v3}, Lf9/w;->c([BII[Z)I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-ne v3, v1, :cond_2

    .line 49
    .line 50
    iget-boolean p1, p0, Lv7/o;->j:Z

    .line 51
    .line 52
    if-nez p1, :cond_0

    .line 53
    .line 54
    iget-object p1, p0, Lv7/o;->d:Lv7/o$a;

    .line 55
    .line 56
    invoke-virtual {p1, v2, v0, v1}, Lv7/o$a;->a([BII)V

    .line 57
    .line 58
    .line 59
    :cond_0
    iget-object p1, p0, Lv7/o;->f:Lv7/o$b;

    .line 60
    .line 61
    invoke-virtual {p1, v2, v0, v1}, Lv7/o$b;->a([BII)V

    .line 62
    .line 63
    .line 64
    iget-object p1, p0, Lv7/o;->e:Lv7/u;

    .line 65
    .line 66
    if-eqz p1, :cond_1

    .line 67
    .line 68
    invoke-virtual {p1, v2, v0, v1}, Lv7/u;->a([BII)V

    .line 69
    .line 70
    .line 71
    :cond_1
    return-void

    .line 72
    :cond_2
    invoke-virtual {p1}, Lf9/y;->d()[B

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    add-int/lit8 v5, v3, 0x3

    .line 77
    .line 78
    aget-byte v4, v4, v5

    .line 79
    .line 80
    and-int/lit16 v4, v4, 0xff

    .line 81
    .line 82
    sub-int v6, v3, v0

    .line 83
    .line 84
    iget-boolean v7, p0, Lv7/o;->j:Z

    .line 85
    .line 86
    const/4 v8, 0x1

    .line 87
    const/4 v9, 0x0

    .line 88
    if-nez v7, :cond_5

    .line 89
    .line 90
    if-lez v6, :cond_3

    .line 91
    .line 92
    iget-object v7, p0, Lv7/o;->d:Lv7/o$a;

    .line 93
    .line 94
    invoke-virtual {v7, v2, v0, v3}, Lv7/o$a;->a([BII)V

    .line 95
    .line 96
    .line 97
    :cond_3
    if-gez v6, :cond_4

    .line 98
    .line 99
    neg-int v7, v6

    .line 100
    goto :goto_1

    .line 101
    :cond_4
    move v7, v9

    .line 102
    :goto_1
    iget-object v10, p0, Lv7/o;->d:Lv7/o$a;

    .line 103
    .line 104
    invoke-virtual {v10, v4, v7}, Lv7/o$a;->b(II)Z

    .line 105
    .line 106
    .line 107
    move-result v7

    .line 108
    if-eqz v7, :cond_5

    .line 109
    .line 110
    iget-object v7, p0, Lv7/o;->i:Ll7/b0;

    .line 111
    .line 112
    iget-object v10, p0, Lv7/o;->d:Lv7/o$a;

    .line 113
    .line 114
    iget v11, v10, Lv7/o$a;->d:I

    .line 115
    .line 116
    iget-object v12, p0, Lv7/o;->h:Ljava/lang/String;

    .line 117
    .line 118
    invoke-static {v12}, Lf9/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v12

    .line 122
    check-cast v12, Ljava/lang/String;

    .line 123
    .line 124
    invoke-static {v10, v11, v12}, Lv7/o;->a(Lv7/o$a;ILjava/lang/String;)Ld7/k;

    .line 125
    .line 126
    .line 127
    move-result-object v10

    .line 128
    invoke-interface {v7, v10}, Ll7/b0;->a(Ld7/k;)V

    .line 129
    .line 130
    .line 131
    iput-boolean v8, p0, Lv7/o;->j:Z

    .line 132
    .line 133
    :cond_5
    iget-object v7, p0, Lv7/o;->f:Lv7/o$b;

    .line 134
    .line 135
    invoke-virtual {v7, v2, v0, v3}, Lv7/o$b;->a([BII)V

    .line 136
    .line 137
    .line 138
    iget-object v7, p0, Lv7/o;->e:Lv7/u;

    .line 139
    .line 140
    if-eqz v7, :cond_8

    .line 141
    .line 142
    if-lez v6, :cond_6

    .line 143
    .line 144
    invoke-virtual {v7, v2, v0, v3}, Lv7/u;->a([BII)V

    .line 145
    .line 146
    .line 147
    goto :goto_2

    .line 148
    :cond_6
    neg-int v9, v6

    .line 149
    :goto_2
    iget-object v0, p0, Lv7/o;->e:Lv7/u;

    .line 150
    .line 151
    invoke-virtual {v0, v9}, Lv7/u;->b(I)Z

    .line 152
    .line 153
    .line 154
    move-result v0

    .line 155
    if-eqz v0, :cond_7

    .line 156
    .line 157
    iget-object v0, p0, Lv7/o;->e:Lv7/u;

    .line 158
    .line 159
    iget-object v6, v0, Lv7/u;->d:[B

    .line 160
    .line 161
    iget v0, v0, Lv7/u;->e:I

    .line 162
    .line 163
    invoke-static {v6, v0}, Lf9/w;->k([BI)I

    .line 164
    .line 165
    .line 166
    move-result v0

    .line 167
    iget-object v6, p0, Lv7/o;->b:Lf9/y;

    .line 168
    .line 169
    invoke-static {v6}, Lf9/q0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v6

    .line 173
    check-cast v6, Lf9/y;

    .line 174
    .line 175
    iget-object v7, p0, Lv7/o;->e:Lv7/u;

    .line 176
    .line 177
    iget-object v7, v7, Lv7/u;->d:[B

    .line 178
    .line 179
    invoke-virtual {v6, v7, v0}, Lf9/y;->N([BI)V

    .line 180
    .line 181
    .line 182
    iget-object v0, p0, Lv7/o;->a:Lv7/k0;

    .line 183
    .line 184
    invoke-static {v0}, Lf9/q0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    check-cast v0, Lv7/k0;

    .line 189
    .line 190
    iget-wide v6, p0, Lv7/o;->k:J

    .line 191
    .line 192
    iget-object v9, p0, Lv7/o;->b:Lf9/y;

    .line 193
    .line 194
    invoke-virtual {v0, v6, v7, v9}, Lv7/k0;->a(JLf9/y;)V

    .line 195
    .line 196
    .line 197
    :cond_7
    const/16 v0, 0xb2

    .line 198
    .line 199
    if-ne v4, v0, :cond_8

    .line 200
    .line 201
    invoke-virtual {p1}, Lf9/y;->d()[B

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    add-int/lit8 v6, v3, 0x2

    .line 206
    .line 207
    aget-byte v0, v0, v6

    .line 208
    .line 209
    if-ne v0, v8, :cond_8

    .line 210
    .line 211
    iget-object v0, p0, Lv7/o;->e:Lv7/u;

    .line 212
    .line 213
    invoke-virtual {v0, v4}, Lv7/u;->e(I)V

    .line 214
    .line 215
    .line 216
    :cond_8
    sub-int v0, v1, v3

    .line 217
    .line 218
    iget-wide v6, p0, Lv7/o;->g:J

    .line 219
    .line 220
    int-to-long v8, v0

    .line 221
    sub-long/2addr v6, v8

    .line 222
    iget-object v3, p0, Lv7/o;->f:Lv7/o$b;

    .line 223
    .line 224
    iget-boolean v8, p0, Lv7/o;->j:Z

    .line 225
    .line 226
    invoke-virtual {v3, v6, v7, v0, v8}, Lv7/o$b;->b(JIZ)V

    .line 227
    .line 228
    .line 229
    iget-object v0, p0, Lv7/o;->f:Lv7/o$b;

    .line 230
    .line 231
    iget-wide v6, p0, Lv7/o;->k:J

    .line 232
    .line 233
    invoke-virtual {v0, v4, v6, v7}, Lv7/o$b;->c(IJ)V

    .line 234
    .line 235
    .line 236
    move v0, v5

    .line 237
    goto/16 :goto_0
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

.method public c()V
    .locals 2

    .line 1
    iget-object v0, p0, Lv7/o;->c:[Z

    .line 2
    .line 3
    invoke-static {v0}, Lf9/w;->a([Z)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lv7/o;->d:Lv7/o$a;

    .line 7
    .line 8
    invoke-virtual {v0}, Lv7/o$a;->c()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lv7/o;->f:Lv7/o$b;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Lv7/o$b;->d()V

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-object v0, p0, Lv7/o;->e:Lv7/u;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    invoke-virtual {v0}, Lv7/u;->d()V

    .line 23
    .line 24
    .line 25
    :cond_1
    const-wide/16 v0, 0x0

    .line 26
    .line 27
    iput-wide v0, p0, Lv7/o;->g:J

    .line 28
    .line 29
    return-void
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

.method public d()V
    .locals 0

    return-void
.end method

.method public e(Ll7/k;Lv7/i0$d;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Lv7/i0$d;->a()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Lv7/i0$d;->b()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lv7/o;->h:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {p2}, Lv7/i0$d;->c()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x2

    .line 15
    invoke-interface {p1, v0, v1}, Ll7/k;->d(II)Ll7/b0;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, Lv7/o;->i:Ll7/b0;

    .line 20
    .line 21
    new-instance v1, Lv7/o$b;

    .line 22
    .line 23
    invoke-direct {v1, v0}, Lv7/o$b;-><init>(Ll7/b0;)V

    .line 24
    .line 25
    .line 26
    iput-object v1, p0, Lv7/o;->f:Lv7/o$b;

    .line 27
    .line 28
    iget-object v0, p0, Lv7/o;->a:Lv7/k0;

    .line 29
    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    invoke-virtual {v0, p1, p2}, Lv7/k0;->b(Ll7/k;Lv7/i0$d;)V

    .line 33
    .line 34
    .line 35
    :cond_0
    return-void
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

.method public f(JI)V
    .locals 0

    iput-wide p1, p0, Lv7/o;->k:J

    return-void
.end method
