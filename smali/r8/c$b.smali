.class final Lr8/c$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr8/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# static fields
.field private static final A:[I

.field private static final B:[I

.field private static final C:[Z

.field private static final D:[I

.field private static final E:[I

.field private static final F:[I

.field private static final G:[I

.field public static final w:I

.field public static final x:I

.field public static final y:I

.field private static final z:[I


# instance fields
.field private final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/text/SpannableString;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Landroid/text/SpannableStringBuilder;

.field private c:Z

.field private d:Z

.field private e:I

.field private f:Z

.field private g:I

.field private h:I

.field private i:I

.field private j:I

.field private k:Z

.field private l:I

.field private m:I

.field private n:I

.field private o:I

.field private p:I

.field private q:I

.field private r:I

.field private s:I

.field private t:I

.field private u:I

.field private v:I


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-static {v0, v0, v0, v1}, Lr8/c$b;->h(IIII)I

    .line 4
    .line 5
    .line 6
    move-result v2

    .line 7
    sput v2, Lr8/c$b;->w:I

    .line 8
    .line 9
    invoke-static {v1, v1, v1, v1}, Lr8/c$b;->h(IIII)I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    sput v2, Lr8/c$b;->x:I

    .line 14
    .line 15
    const/4 v3, 0x3

    .line 16
    invoke-static {v1, v1, v1, v3}, Lr8/c$b;->h(IIII)I

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    sput v4, Lr8/c$b;->y:I

    .line 21
    .line 22
    const/4 v5, 0x7

    .line 23
    new-array v6, v5, [I

    .line 24
    .line 25
    fill-array-data v6, :array_0

    .line 26
    .line 27
    .line 28
    sput-object v6, Lr8/c$b;->z:[I

    .line 29
    .line 30
    new-array v6, v5, [I

    .line 31
    .line 32
    fill-array-data v6, :array_1

    .line 33
    .line 34
    .line 35
    sput-object v6, Lr8/c$b;->A:[I

    .line 36
    .line 37
    new-array v6, v5, [I

    .line 38
    .line 39
    fill-array-data v6, :array_2

    .line 40
    .line 41
    .line 42
    sput-object v6, Lr8/c$b;->B:[I

    .line 43
    .line 44
    new-array v6, v5, [Z

    .line 45
    .line 46
    fill-array-data v6, :array_3

    .line 47
    .line 48
    .line 49
    sput-object v6, Lr8/c$b;->C:[Z

    .line 50
    .line 51
    new-array v6, v5, [I

    .line 52
    .line 53
    aput v2, v6, v1

    .line 54
    .line 55
    const/4 v7, 0x1

    .line 56
    aput v4, v6, v7

    .line 57
    .line 58
    aput v2, v6, v0

    .line 59
    .line 60
    aput v2, v6, v3

    .line 61
    .line 62
    const/4 v8, 0x4

    .line 63
    aput v4, v6, v8

    .line 64
    .line 65
    const/4 v9, 0x5

    .line 66
    aput v2, v6, v9

    .line 67
    .line 68
    const/4 v10, 0x6

    .line 69
    aput v2, v6, v10

    .line 70
    .line 71
    sput-object v6, Lr8/c$b;->D:[I

    .line 72
    .line 73
    new-array v6, v5, [I

    .line 74
    .line 75
    fill-array-data v6, :array_4

    .line 76
    .line 77
    .line 78
    sput-object v6, Lr8/c$b;->E:[I

    .line 79
    .line 80
    new-array v6, v5, [I

    .line 81
    .line 82
    fill-array-data v6, :array_5

    .line 83
    .line 84
    .line 85
    sput-object v6, Lr8/c$b;->F:[I

    .line 86
    .line 87
    new-array v5, v5, [I

    .line 88
    .line 89
    aput v2, v5, v1

    .line 90
    .line 91
    aput v2, v5, v7

    .line 92
    .line 93
    aput v2, v5, v0

    .line 94
    .line 95
    aput v2, v5, v3

    .line 96
    .line 97
    aput v2, v5, v8

    .line 98
    .line 99
    aput v4, v5, v9

    .line 100
    .line 101
    aput v4, v5, v10

    .line 102
    .line 103
    sput-object v5, Lr8/c$b;->G:[I

    .line 104
    .line 105
    return-void

    .line 106
    nop

    .line 107
    :array_0
    .array-data 4
        0x0
        0x0
        0x0
        0x0
        0x0
        0x2
        0x0
    .end array-data

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
    :array_1
    .array-data 4
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x2
    .end array-data

    .line 126
    :array_2
    .array-data 4
        0x3
        0x3
        0x3
        0x3
        0x3
        0x3
        0x1
    .end array-data

    :array_3
    .array-data 1
        0x0t
        0x0t
        0x0t
        0x1t
        0x1t
        0x1t
        0x0t
    .end array-data

    :array_4
    .array-data 4
        0x0
        0x1
        0x2
        0x3
        0x4
        0x3
        0x4
    .end array-data

    :array_5
    .array-data 4
        0x0
        0x0
        0x0
        0x0
        0x0
        0x3
        0x3
    .end array-data
.end method

.method public constructor <init>()V
    .locals 1

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
    iput-object v0, p0, Lr8/c$b;->a:Ljava/util/List;

    .line 10
    .line 11
    new-instance v0, Landroid/text/SpannableStringBuilder;

    .line 12
    .line 13
    invoke-direct {v0}, Landroid/text/SpannableStringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lr8/c$b;->b:Landroid/text/SpannableStringBuilder;

    .line 17
    .line 18
    invoke-virtual {p0}, Lr8/c$b;->l()V

    .line 19
    .line 20
    .line 21
    return-void
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
.end method

.method public static g(III)I
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, p1, p2, v0}, Lr8/c$b;->h(IIII)I

    move-result p0

    return p0
.end method

.method public static h(IIII)I
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x4

    .line 3
    invoke-static {p0, v0, v1}, Lf9/a;->c(III)I

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0, v1}, Lf9/a;->c(III)I

    .line 7
    .line 8
    .line 9
    invoke-static {p2, v0, v1}, Lf9/a;->c(III)I

    .line 10
    .line 11
    .line 12
    invoke-static {p3, v0, v1}, Lf9/a;->c(III)I

    .line 13
    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    const/16 v2, 0xff

    .line 17
    .line 18
    if-eqz p3, :cond_2

    .line 19
    .line 20
    if-eq p3, v1, :cond_2

    .line 21
    .line 22
    const/4 v3, 0x2

    .line 23
    if-eq p3, v3, :cond_1

    .line 24
    .line 25
    const/4 v3, 0x3

    .line 26
    if-eq p3, v3, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move p3, v0

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    const/16 p3, 0x7f

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_2
    :goto_0
    move p3, v2

    .line 35
    :goto_1
    if-le p0, v1, :cond_3

    .line 36
    .line 37
    move p0, v2

    .line 38
    goto :goto_2

    .line 39
    :cond_3
    move p0, v0

    .line 40
    :goto_2
    if-le p1, v1, :cond_4

    .line 41
    .line 42
    move p1, v2

    .line 43
    goto :goto_3

    .line 44
    :cond_4
    move p1, v0

    .line 45
    :goto_3
    if-le p2, v1, :cond_5

    .line 46
    .line 47
    move v0, v2

    .line 48
    :cond_5
    invoke-static {p3, p0, p1, v0}, Landroid/graphics/Color;->argb(IIII)I

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    return p0
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
.end method


# virtual methods
.method public a(C)V
    .locals 2

    .line 1
    const/16 v0, 0xa

    .line 2
    .line 3
    if-ne p1, v0, :cond_6

    .line 4
    .line 5
    iget-object p1, p0, Lr8/c$b;->a:Ljava/util/List;

    .line 6
    .line 7
    invoke-virtual {p0}, Lr8/c$b;->d()Landroid/text/SpannableString;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lr8/c$b;->b:Landroid/text/SpannableStringBuilder;

    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/text/SpannableStringBuilder;->clear()V

    .line 17
    .line 18
    .line 19
    iget p1, p0, Lr8/c$b;->p:I

    .line 20
    .line 21
    const/4 v0, -0x1

    .line 22
    const/4 v1, 0x0

    .line 23
    if-eq p1, v0, :cond_0

    .line 24
    .line 25
    iput v1, p0, Lr8/c$b;->p:I

    .line 26
    .line 27
    :cond_0
    iget p1, p0, Lr8/c$b;->q:I

    .line 28
    .line 29
    if-eq p1, v0, :cond_1

    .line 30
    .line 31
    iput v1, p0, Lr8/c$b;->q:I

    .line 32
    .line 33
    :cond_1
    iget p1, p0, Lr8/c$b;->r:I

    .line 34
    .line 35
    if-eq p1, v0, :cond_2

    .line 36
    .line 37
    iput v1, p0, Lr8/c$b;->r:I

    .line 38
    .line 39
    :cond_2
    iget p1, p0, Lr8/c$b;->t:I

    .line 40
    .line 41
    if-eq p1, v0, :cond_3

    .line 42
    .line 43
    iput v1, p0, Lr8/c$b;->t:I

    .line 44
    .line 45
    :cond_3
    :goto_0
    iget-boolean p1, p0, Lr8/c$b;->k:Z

    .line 46
    .line 47
    if-eqz p1, :cond_4

    .line 48
    .line 49
    iget-object p1, p0, Lr8/c$b;->a:Ljava/util/List;

    .line 50
    .line 51
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    iget v0, p0, Lr8/c$b;->j:I

    .line 56
    .line 57
    if-ge p1, v0, :cond_5

    .line 58
    .line 59
    :cond_4
    iget-object p1, p0, Lr8/c$b;->a:Ljava/util/List;

    .line 60
    .line 61
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    const/16 v0, 0xf

    .line 66
    .line 67
    if-lt p1, v0, :cond_7

    .line 68
    .line 69
    :cond_5
    iget-object p1, p0, Lr8/c$b;->a:Ljava/util/List;

    .line 70
    .line 71
    invoke-interface {p1, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_6
    iget-object v0, p0, Lr8/c$b;->b:Landroid/text/SpannableStringBuilder;

    .line 76
    .line 77
    invoke-virtual {v0, p1}, Landroid/text/SpannableStringBuilder;->append(C)Landroid/text/SpannableStringBuilder;

    .line 78
    .line 79
    .line 80
    :cond_7
    return-void
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

.method public b()V
    .locals 3

    .line 1
    iget-object v0, p0, Lr8/c$b;->b:Landroid/text/SpannableStringBuilder;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/text/SpannableStringBuilder;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-lez v0, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, Lr8/c$b;->b:Landroid/text/SpannableStringBuilder;

    .line 10
    .line 11
    add-int/lit8 v2, v0, -0x1

    .line 12
    .line 13
    invoke-virtual {v1, v2, v0}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    .line 14
    .line 15
    .line 16
    :cond_0
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
.end method

.method public c()Lr8/c$a;
    .locals 15

    .line 1
    invoke-virtual {p0}, Lr8/c$b;->j()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    return-object v0

    .line 9
    :cond_0
    new-instance v2, Landroid/text/SpannableStringBuilder;

    .line 10
    .line 11
    invoke-direct {v2}, Landroid/text/SpannableStringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    move v1, v0

    .line 16
    :goto_0
    iget-object v3, p0, Lr8/c$b;->a:Ljava/util/List;

    .line 17
    .line 18
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-ge v1, v3, :cond_1

    .line 23
    .line 24
    iget-object v3, p0, Lr8/c$b;->a:Ljava/util/List;

    .line 25
    .line 26
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    check-cast v3, Ljava/lang/CharSequence;

    .line 31
    .line 32
    invoke-virtual {v2, v3}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 33
    .line 34
    .line 35
    const/16 v3, 0xa

    .line 36
    .line 37
    invoke-virtual {v2, v3}, Landroid/text/SpannableStringBuilder;->append(C)Landroid/text/SpannableStringBuilder;

    .line 38
    .line 39
    .line 40
    add-int/lit8 v1, v1, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    invoke-virtual {p0}, Lr8/c$b;->d()Landroid/text/SpannableString;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {v2, v1}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 48
    .line 49
    .line 50
    iget v1, p0, Lr8/c$b;->l:I

    .line 51
    .line 52
    const/4 v3, 0x2

    .line 53
    const/4 v4, 0x3

    .line 54
    const/4 v5, 0x1

    .line 55
    if-eqz v1, :cond_5

    .line 56
    .line 57
    if-eq v1, v5, :cond_4

    .line 58
    .line 59
    if-eq v1, v3, :cond_3

    .line 60
    .line 61
    if-ne v1, v4, :cond_2

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 65
    .line 66
    new-instance v1, Ljava/lang/StringBuilder;

    .line 67
    .line 68
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 69
    .line 70
    .line 71
    const-string v2, "Unexpected justification value: "

    .line 72
    .line 73
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    iget v2, p0, Lr8/c$b;->l:I

    .line 77
    .line 78
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    throw v0

    .line 89
    :cond_3
    sget-object v1, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_4
    sget-object v1, Landroid/text/Layout$Alignment;->ALIGN_OPPOSITE:Landroid/text/Layout$Alignment;

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_5
    :goto_1
    sget-object v1, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    .line 96
    .line 97
    :goto_2
    move-object v6, v1

    .line 98
    iget-boolean v1, p0, Lr8/c$b;->f:Z

    .line 99
    .line 100
    if-eqz v1, :cond_6

    .line 101
    .line 102
    iget v1, p0, Lr8/c$b;->h:I

    .line 103
    .line 104
    int-to-float v1, v1

    .line 105
    const/high16 v7, 0x42c60000    # 99.0f

    .line 106
    .line 107
    div-float/2addr v1, v7

    .line 108
    iget v8, p0, Lr8/c$b;->g:I

    .line 109
    .line 110
    int-to-float v8, v8

    .line 111
    div-float/2addr v8, v7

    .line 112
    goto :goto_3

    .line 113
    :cond_6
    iget v1, p0, Lr8/c$b;->h:I

    .line 114
    .line 115
    int-to-float v1, v1

    .line 116
    const/high16 v7, 0x43510000    # 209.0f

    .line 117
    .line 118
    div-float/2addr v1, v7

    .line 119
    iget v7, p0, Lr8/c$b;->g:I

    .line 120
    .line 121
    int-to-float v7, v7

    .line 122
    const/high16 v8, 0x42940000    # 74.0f

    .line 123
    .line 124
    div-float v8, v7, v8

    .line 125
    .line 126
    :goto_3
    const v7, 0x3f666666    # 0.9f

    .line 127
    .line 128
    .line 129
    mul-float/2addr v1, v7

    .line 130
    const v9, 0x3d4ccccd    # 0.05f

    .line 131
    .line 132
    .line 133
    add-float v10, v1, v9

    .line 134
    .line 135
    mul-float/2addr v8, v7

    .line 136
    add-float v7, v8, v9

    .line 137
    .line 138
    iget v1, p0, Lr8/c$b;->i:I

    .line 139
    .line 140
    div-int/lit8 v8, v1, 0x3

    .line 141
    .line 142
    if-nez v8, :cond_7

    .line 143
    .line 144
    move v8, v0

    .line 145
    goto :goto_4

    .line 146
    :cond_7
    div-int/lit8 v8, v1, 0x3

    .line 147
    .line 148
    if-ne v8, v5, :cond_8

    .line 149
    .line 150
    move v8, v5

    .line 151
    goto :goto_4

    .line 152
    :cond_8
    move v8, v3

    .line 153
    :goto_4
    rem-int/lit8 v9, v1, 0x3

    .line 154
    .line 155
    if-nez v9, :cond_9

    .line 156
    .line 157
    move v9, v0

    .line 158
    goto :goto_5

    .line 159
    :cond_9
    rem-int/2addr v1, v4

    .line 160
    if-ne v1, v5, :cond_a

    .line 161
    .line 162
    move v9, v5

    .line 163
    goto :goto_5

    .line 164
    :cond_a
    move v9, v3

    .line 165
    :goto_5
    iget v1, p0, Lr8/c$b;->o:I

    .line 166
    .line 167
    sget v3, Lr8/c$b;->x:I

    .line 168
    .line 169
    if-eq v1, v3, :cond_b

    .line 170
    .line 171
    move v0, v5

    .line 172
    :cond_b
    new-instance v13, Lr8/c$a;

    .line 173
    .line 174
    const/4 v5, 0x0

    .line 175
    const v11, -0x800001

    .line 176
    .line 177
    .line 178
    iget v12, p0, Lr8/c$b;->o:I

    .line 179
    .line 180
    iget v14, p0, Lr8/c$b;->e:I

    .line 181
    .line 182
    move-object v1, v13

    .line 183
    move-object v3, v6

    .line 184
    move v4, v7

    .line 185
    move v6, v8

    .line 186
    move v7, v10

    .line 187
    move v8, v9

    .line 188
    move v9, v11

    .line 189
    move v10, v0

    .line 190
    move v11, v12

    .line 191
    move v12, v14

    .line 192
    invoke-direct/range {v1 .. v12}, Lr8/c$a;-><init>(Ljava/lang/CharSequence;Landroid/text/Layout$Alignment;FIIFIFZII)V

    .line 193
    .line 194
    .line 195
    return-object v13
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
.end method

.method public d()Landroid/text/SpannableString;
    .locals 6

    .line 1
    new-instance v0, Landroid/text/SpannableStringBuilder;

    .line 2
    .line 3
    iget-object v1, p0, Lr8/c$b;->b:Landroid/text/SpannableStringBuilder;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/text/SpannableStringBuilder;->length()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-lez v1, :cond_3

    .line 13
    .line 14
    iget v2, p0, Lr8/c$b;->p:I

    .line 15
    .line 16
    const/16 v3, 0x21

    .line 17
    .line 18
    const/4 v4, -0x1

    .line 19
    if-eq v2, v4, :cond_0

    .line 20
    .line 21
    new-instance v2, Landroid/text/style/StyleSpan;

    .line 22
    .line 23
    const/4 v5, 0x2

    .line 24
    invoke-direct {v2, v5}, Landroid/text/style/StyleSpan;-><init>(I)V

    .line 25
    .line 26
    .line 27
    iget v5, p0, Lr8/c$b;->p:I

    .line 28
    .line 29
    invoke-virtual {v0, v2, v5, v1, v3}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 30
    .line 31
    .line 32
    :cond_0
    iget v2, p0, Lr8/c$b;->q:I

    .line 33
    .line 34
    if-eq v2, v4, :cond_1

    .line 35
    .line 36
    new-instance v2, Landroid/text/style/UnderlineSpan;

    .line 37
    .line 38
    invoke-direct {v2}, Landroid/text/style/UnderlineSpan;-><init>()V

    .line 39
    .line 40
    .line 41
    iget v5, p0, Lr8/c$b;->q:I

    .line 42
    .line 43
    invoke-virtual {v0, v2, v5, v1, v3}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 44
    .line 45
    .line 46
    :cond_1
    iget v2, p0, Lr8/c$b;->r:I

    .line 47
    .line 48
    if-eq v2, v4, :cond_2

    .line 49
    .line 50
    new-instance v2, Landroid/text/style/ForegroundColorSpan;

    .line 51
    .line 52
    iget v5, p0, Lr8/c$b;->s:I

    .line 53
    .line 54
    invoke-direct {v2, v5}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 55
    .line 56
    .line 57
    iget v5, p0, Lr8/c$b;->r:I

    .line 58
    .line 59
    invoke-virtual {v0, v2, v5, v1, v3}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 60
    .line 61
    .line 62
    :cond_2
    iget v2, p0, Lr8/c$b;->t:I

    .line 63
    .line 64
    if-eq v2, v4, :cond_3

    .line 65
    .line 66
    new-instance v2, Landroid/text/style/BackgroundColorSpan;

    .line 67
    .line 68
    iget v4, p0, Lr8/c$b;->u:I

    .line 69
    .line 70
    invoke-direct {v2, v4}, Landroid/text/style/BackgroundColorSpan;-><init>(I)V

    .line 71
    .line 72
    .line 73
    iget v4, p0, Lr8/c$b;->t:I

    .line 74
    .line 75
    invoke-virtual {v0, v2, v4, v1, v3}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 76
    .line 77
    .line 78
    :cond_3
    new-instance v1, Landroid/text/SpannableString;

    .line 79
    .line 80
    invoke-direct {v1, v0}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 81
    .line 82
    .line 83
    return-object v1
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
.end method

.method public e()V
    .locals 1

    .line 1
    iget-object v0, p0, Lr8/c$b;->a:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lr8/c$b;->b:Landroid/text/SpannableStringBuilder;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/text/SpannableStringBuilder;->clear()V

    .line 9
    .line 10
    .line 11
    const/4 v0, -0x1

    .line 12
    iput v0, p0, Lr8/c$b;->p:I

    .line 13
    .line 14
    iput v0, p0, Lr8/c$b;->q:I

    .line 15
    .line 16
    iput v0, p0, Lr8/c$b;->r:I

    .line 17
    .line 18
    iput v0, p0, Lr8/c$b;->t:I

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    iput v0, p0, Lr8/c$b;->v:I

    .line 22
    .line 23
    return-void
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
.end method

.method public f(ZZZIZIIIIIII)V
    .locals 11

    .line 1
    move-object v0, p0

    .line 2
    move v1, p2

    .line 3
    move/from16 v2, p11

    .line 4
    .line 5
    move/from16 v3, p12

    .line 6
    .line 7
    const/4 v4, 0x1

    .line 8
    iput-boolean v4, v0, Lr8/c$b;->c:Z

    .line 9
    .line 10
    move v5, p1

    .line 11
    iput-boolean v5, v0, Lr8/c$b;->d:Z

    .line 12
    .line 13
    iput-boolean v1, v0, Lr8/c$b;->k:Z

    .line 14
    .line 15
    move v5, p4

    .line 16
    iput v5, v0, Lr8/c$b;->e:I

    .line 17
    .line 18
    move/from16 v5, p5

    .line 19
    .line 20
    iput-boolean v5, v0, Lr8/c$b;->f:Z

    .line 21
    .line 22
    move/from16 v5, p6

    .line 23
    .line 24
    iput v5, v0, Lr8/c$b;->g:I

    .line 25
    .line 26
    move/from16 v5, p7

    .line 27
    .line 28
    iput v5, v0, Lr8/c$b;->h:I

    .line 29
    .line 30
    move/from16 v5, p10

    .line 31
    .line 32
    iput v5, v0, Lr8/c$b;->i:I

    .line 33
    .line 34
    iget v5, v0, Lr8/c$b;->j:I

    .line 35
    .line 36
    add-int/lit8 v6, p8, 0x1

    .line 37
    .line 38
    if-eq v5, v6, :cond_2

    .line 39
    .line 40
    iput v6, v0, Lr8/c$b;->j:I

    .line 41
    .line 42
    :goto_0
    if-eqz v1, :cond_0

    .line 43
    .line 44
    iget-object v5, v0, Lr8/c$b;->a:Ljava/util/List;

    .line 45
    .line 46
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    iget v6, v0, Lr8/c$b;->j:I

    .line 51
    .line 52
    if-ge v5, v6, :cond_1

    .line 53
    .line 54
    :cond_0
    iget-object v5, v0, Lr8/c$b;->a:Ljava/util/List;

    .line 55
    .line 56
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    const/16 v6, 0xf

    .line 61
    .line 62
    if-lt v5, v6, :cond_2

    .line 63
    .line 64
    :cond_1
    iget-object v5, v0, Lr8/c$b;->a:Ljava/util/List;

    .line 65
    .line 66
    const/4 v6, 0x0

    .line 67
    invoke-interface {v5, v6}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_2
    if-eqz v2, :cond_3

    .line 72
    .line 73
    iget v1, v0, Lr8/c$b;->m:I

    .line 74
    .line 75
    if-eq v1, v2, :cond_3

    .line 76
    .line 77
    iput v2, v0, Lr8/c$b;->m:I

    .line 78
    .line 79
    add-int/lit8 v1, v2, -0x1

    .line 80
    .line 81
    sget-object v2, Lr8/c$b;->D:[I

    .line 82
    .line 83
    aget v2, v2, v1

    .line 84
    .line 85
    sget v5, Lr8/c$b;->y:I

    .line 86
    .line 87
    sget-object v6, Lr8/c$b;->C:[Z

    .line 88
    .line 89
    aget-boolean v6, v6, v1

    .line 90
    .line 91
    const/4 v7, 0x0

    .line 92
    sget-object v8, Lr8/c$b;->A:[I

    .line 93
    .line 94
    aget v8, v8, v1

    .line 95
    .line 96
    sget-object v9, Lr8/c$b;->B:[I

    .line 97
    .line 98
    aget v9, v9, v1

    .line 99
    .line 100
    sget-object v10, Lr8/c$b;->z:[I

    .line 101
    .line 102
    aget v1, v10, v1

    .line 103
    .line 104
    move-object p1, p0

    .line 105
    move p2, v2

    .line 106
    move p3, v5

    .line 107
    move p4, v6

    .line 108
    move/from16 p5, v7

    .line 109
    .line 110
    move/from16 p6, v8

    .line 111
    .line 112
    move/from16 p7, v9

    .line 113
    .line 114
    move/from16 p8, v1

    .line 115
    .line 116
    invoke-virtual/range {p1 .. p8}, Lr8/c$b;->q(IIZIIII)V

    .line 117
    .line 118
    .line 119
    :cond_3
    if-eqz v3, :cond_4

    .line 120
    .line 121
    iget v1, v0, Lr8/c$b;->n:I

    .line 122
    .line 123
    if-eq v1, v3, :cond_4

    .line 124
    .line 125
    iput v3, v0, Lr8/c$b;->n:I

    .line 126
    .line 127
    add-int/lit8 v1, v3, -0x1

    .line 128
    .line 129
    const/4 v2, 0x0

    .line 130
    const/4 v3, 0x1

    .line 131
    const/4 v4, 0x1

    .line 132
    const/4 v5, 0x0

    .line 133
    const/4 v6, 0x0

    .line 134
    sget-object v7, Lr8/c$b;->F:[I

    .line 135
    .line 136
    aget v7, v7, v1

    .line 137
    .line 138
    sget-object v8, Lr8/c$b;->E:[I

    .line 139
    .line 140
    aget v8, v8, v1

    .line 141
    .line 142
    move-object p1, p0

    .line 143
    move p2, v2

    .line 144
    move p3, v3

    .line 145
    move p4, v4

    .line 146
    move/from16 p5, v5

    .line 147
    .line 148
    move/from16 p6, v6

    .line 149
    .line 150
    move/from16 p7, v7

    .line 151
    .line 152
    move/from16 p8, v8

    .line 153
    .line 154
    invoke-virtual/range {p1 .. p8}, Lr8/c$b;->m(IIIZZII)V

    .line 155
    .line 156
    .line 157
    sget v2, Lr8/c$b;->w:I

    .line 158
    .line 159
    sget-object v3, Lr8/c$b;->G:[I

    .line 160
    .line 161
    aget v1, v3, v1

    .line 162
    .line 163
    sget v3, Lr8/c$b;->x:I

    .line 164
    .line 165
    invoke-virtual {p0, v2, v1, v3}, Lr8/c$b;->n(III)V

    .line 166
    .line 167
    .line 168
    :cond_4
    return-void
.end method

.method public i()Z
    .locals 1

    iget-boolean v0, p0, Lr8/c$b;->c:Z

    return v0
.end method

.method public j()Z
    .locals 1

    invoke-virtual {p0}, Lr8/c$b;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lr8/c$b;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lr8/c$b;->b:Landroid/text/SpannableStringBuilder;

    invoke-virtual {v0}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public k()Z
    .locals 1

    iget-boolean v0, p0, Lr8/c$b;->d:Z

    return v0
.end method

.method public l()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lr8/c$b;->e()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lr8/c$b;->c:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Lr8/c$b;->d:Z

    .line 8
    .line 9
    const/4 v1, 0x4

    .line 10
    iput v1, p0, Lr8/c$b;->e:I

    .line 11
    .line 12
    iput-boolean v0, p0, Lr8/c$b;->f:Z

    .line 13
    .line 14
    iput v0, p0, Lr8/c$b;->g:I

    .line 15
    .line 16
    iput v0, p0, Lr8/c$b;->h:I

    .line 17
    .line 18
    iput v0, p0, Lr8/c$b;->i:I

    .line 19
    .line 20
    const/16 v1, 0xf

    .line 21
    .line 22
    iput v1, p0, Lr8/c$b;->j:I

    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    iput-boolean v1, p0, Lr8/c$b;->k:Z

    .line 26
    .line 27
    iput v0, p0, Lr8/c$b;->l:I

    .line 28
    .line 29
    iput v0, p0, Lr8/c$b;->m:I

    .line 30
    .line 31
    iput v0, p0, Lr8/c$b;->n:I

    .line 32
    .line 33
    sget v0, Lr8/c$b;->x:I

    .line 34
    .line 35
    iput v0, p0, Lr8/c$b;->o:I

    .line 36
    .line 37
    sget v1, Lr8/c$b;->w:I

    .line 38
    .line 39
    iput v1, p0, Lr8/c$b;->s:I

    .line 40
    .line 41
    iput v0, p0, Lr8/c$b;->u:I

    .line 42
    .line 43
    return-void
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
.end method

.method public m(IIIZZII)V
    .locals 0

    .line 1
    iget p1, p0, Lr8/c$b;->p:I

    .line 2
    .line 3
    const/16 p2, 0x21

    .line 4
    .line 5
    const/4 p3, -0x1

    .line 6
    if-eq p1, p3, :cond_0

    .line 7
    .line 8
    if-nez p4, :cond_1

    .line 9
    .line 10
    iget-object p1, p0, Lr8/c$b;->b:Landroid/text/SpannableStringBuilder;

    .line 11
    .line 12
    new-instance p4, Landroid/text/style/StyleSpan;

    .line 13
    .line 14
    const/4 p6, 0x2

    .line 15
    invoke-direct {p4, p6}, Landroid/text/style/StyleSpan;-><init>(I)V

    .line 16
    .line 17
    .line 18
    iget p6, p0, Lr8/c$b;->p:I

    .line 19
    .line 20
    iget-object p7, p0, Lr8/c$b;->b:Landroid/text/SpannableStringBuilder;

    .line 21
    .line 22
    invoke-virtual {p7}, Landroid/text/SpannableStringBuilder;->length()I

    .line 23
    .line 24
    .line 25
    move-result p7

    .line 26
    invoke-virtual {p1, p4, p6, p7, p2}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 27
    .line 28
    .line 29
    iput p3, p0, Lr8/c$b;->p:I

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    if-eqz p4, :cond_1

    .line 33
    .line 34
    iget-object p1, p0, Lr8/c$b;->b:Landroid/text/SpannableStringBuilder;

    .line 35
    .line 36
    invoke-virtual {p1}, Landroid/text/SpannableStringBuilder;->length()I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    iput p1, p0, Lr8/c$b;->p:I

    .line 41
    .line 42
    :cond_1
    :goto_0
    iget p1, p0, Lr8/c$b;->q:I

    .line 43
    .line 44
    if-eq p1, p3, :cond_2

    .line 45
    .line 46
    if-nez p5, :cond_3

    .line 47
    .line 48
    iget-object p1, p0, Lr8/c$b;->b:Landroid/text/SpannableStringBuilder;

    .line 49
    .line 50
    new-instance p4, Landroid/text/style/UnderlineSpan;

    .line 51
    .line 52
    invoke-direct {p4}, Landroid/text/style/UnderlineSpan;-><init>()V

    .line 53
    .line 54
    .line 55
    iget p5, p0, Lr8/c$b;->q:I

    .line 56
    .line 57
    iget-object p6, p0, Lr8/c$b;->b:Landroid/text/SpannableStringBuilder;

    .line 58
    .line 59
    invoke-virtual {p6}, Landroid/text/SpannableStringBuilder;->length()I

    .line 60
    .line 61
    .line 62
    move-result p6

    .line 63
    invoke-virtual {p1, p4, p5, p6, p2}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 64
    .line 65
    .line 66
    iput p3, p0, Lr8/c$b;->q:I

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_2
    if-eqz p5, :cond_3

    .line 70
    .line 71
    iget-object p1, p0, Lr8/c$b;->b:Landroid/text/SpannableStringBuilder;

    .line 72
    .line 73
    invoke-virtual {p1}, Landroid/text/SpannableStringBuilder;->length()I

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    iput p1, p0, Lr8/c$b;->q:I

    .line 78
    .line 79
    :cond_3
    :goto_1
    return-void
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
.end method

.method public n(III)V
    .locals 5

    .line 1
    iget p3, p0, Lr8/c$b;->r:I

    .line 2
    .line 3
    const/16 v0, 0x21

    .line 4
    .line 5
    const/4 v1, -0x1

    .line 6
    if-eq p3, v1, :cond_0

    .line 7
    .line 8
    iget p3, p0, Lr8/c$b;->s:I

    .line 9
    .line 10
    if-eq p3, p1, :cond_0

    .line 11
    .line 12
    iget-object p3, p0, Lr8/c$b;->b:Landroid/text/SpannableStringBuilder;

    .line 13
    .line 14
    new-instance v2, Landroid/text/style/ForegroundColorSpan;

    .line 15
    .line 16
    iget v3, p0, Lr8/c$b;->s:I

    .line 17
    .line 18
    invoke-direct {v2, v3}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 19
    .line 20
    .line 21
    iget v3, p0, Lr8/c$b;->r:I

    .line 22
    .line 23
    iget-object v4, p0, Lr8/c$b;->b:Landroid/text/SpannableStringBuilder;

    .line 24
    .line 25
    invoke-virtual {v4}, Landroid/text/SpannableStringBuilder;->length()I

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    invoke-virtual {p3, v2, v3, v4, v0}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 30
    .line 31
    .line 32
    :cond_0
    sget p3, Lr8/c$b;->w:I

    .line 33
    .line 34
    if-eq p1, p3, :cond_1

    .line 35
    .line 36
    iget-object p3, p0, Lr8/c$b;->b:Landroid/text/SpannableStringBuilder;

    .line 37
    .line 38
    invoke-virtual {p3}, Landroid/text/SpannableStringBuilder;->length()I

    .line 39
    .line 40
    .line 41
    move-result p3

    .line 42
    iput p3, p0, Lr8/c$b;->r:I

    .line 43
    .line 44
    iput p1, p0, Lr8/c$b;->s:I

    .line 45
    .line 46
    :cond_1
    iget p1, p0, Lr8/c$b;->t:I

    .line 47
    .line 48
    if-eq p1, v1, :cond_2

    .line 49
    .line 50
    iget p1, p0, Lr8/c$b;->u:I

    .line 51
    .line 52
    if-eq p1, p2, :cond_2

    .line 53
    .line 54
    iget-object p1, p0, Lr8/c$b;->b:Landroid/text/SpannableStringBuilder;

    .line 55
    .line 56
    new-instance p3, Landroid/text/style/BackgroundColorSpan;

    .line 57
    .line 58
    iget v1, p0, Lr8/c$b;->u:I

    .line 59
    .line 60
    invoke-direct {p3, v1}, Landroid/text/style/BackgroundColorSpan;-><init>(I)V

    .line 61
    .line 62
    .line 63
    iget v1, p0, Lr8/c$b;->t:I

    .line 64
    .line 65
    iget-object v2, p0, Lr8/c$b;->b:Landroid/text/SpannableStringBuilder;

    .line 66
    .line 67
    invoke-virtual {v2}, Landroid/text/SpannableStringBuilder;->length()I

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    invoke-virtual {p1, p3, v1, v2, v0}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 72
    .line 73
    .line 74
    :cond_2
    sget p1, Lr8/c$b;->x:I

    .line 75
    .line 76
    if-eq p2, p1, :cond_3

    .line 77
    .line 78
    iget-object p1, p0, Lr8/c$b;->b:Landroid/text/SpannableStringBuilder;

    .line 79
    .line 80
    invoke-virtual {p1}, Landroid/text/SpannableStringBuilder;->length()I

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    iput p1, p0, Lr8/c$b;->t:I

    .line 85
    .line 86
    iput p2, p0, Lr8/c$b;->u:I

    .line 87
    .line 88
    :cond_3
    return-void
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
.end method

.method public o(II)V
    .locals 0

    .line 1
    iget p2, p0, Lr8/c$b;->v:I

    .line 2
    .line 3
    if-eq p2, p1, :cond_0

    .line 4
    .line 5
    const/16 p2, 0xa

    .line 6
    .line 7
    invoke-virtual {p0, p2}, Lr8/c$b;->a(C)V

    .line 8
    .line 9
    .line 10
    :cond_0
    iput p1, p0, Lr8/c$b;->v:I

    .line 11
    .line 12
    return-void
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
.end method

.method public p(Z)V
    .locals 0

    iput-boolean p1, p0, Lr8/c$b;->d:Z

    return-void
.end method

.method public q(IIZIIII)V
    .locals 0

    .line 1
    iput p1, p0, Lr8/c$b;->o:I

    .line 2
    .line 3
    iput p7, p0, Lr8/c$b;->l:I

    .line 4
    .line 5
    return-void
    .line 6
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
.end method
