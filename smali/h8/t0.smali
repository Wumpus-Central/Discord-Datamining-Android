.class public final Lh8/t0;
.super Lh8/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh8/t0$b;
    }
.end annotation


# instance fields
.field private final q:Lcom/google/android/exoplayer2/upstream/a;

.field private final r:Lcom/google/android/exoplayer2/upstream/DataSource$Factory;

.field private final s:Ld7/k;

.field private final t:J

.field private final u:Lcom/google/android/exoplayer2/upstream/g;

.field private final v:Z

.field private final w:Lcom/google/android/exoplayer2/Timeline;

.field private final x:Lcom/google/android/exoplayer2/MediaItem;

.field private y:Ld9/x;


# direct methods
.method private constructor <init>(Ljava/lang/String;Lcom/google/android/exoplayer2/MediaItem$h;Lcom/google/android/exoplayer2/upstream/DataSource$Factory;JLcom/google/android/exoplayer2/upstream/g;ZLjava/lang/Object;)V
    .locals 10

    move-object v0, p0

    move-object v1, p2

    .line 2
    invoke-direct {p0}, Lh8/a;-><init>()V

    move-object v2, p3

    .line 3
    iput-object v2, v0, Lh8/t0;->r:Lcom/google/android/exoplayer2/upstream/DataSource$Factory;

    move-wide v2, p4

    .line 4
    iput-wide v2, v0, Lh8/t0;->t:J

    move-object/from16 v4, p6

    .line 5
    iput-object v4, v0, Lh8/t0;->u:Lcom/google/android/exoplayer2/upstream/g;

    move/from16 v4, p7

    .line 6
    iput-boolean v4, v0, Lh8/t0;->v:Z

    .line 7
    new-instance v4, Lcom/google/android/exoplayer2/MediaItem$c;

    invoke-direct {v4}, Lcom/google/android/exoplayer2/MediaItem$c;-><init>()V

    sget-object v5, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    .line 8
    invoke-virtual {v4, v5}, Lcom/google/android/exoplayer2/MediaItem$c;->i(Landroid/net/Uri;)Lcom/google/android/exoplayer2/MediaItem$c;

    move-result-object v4

    iget-object v5, v1, Lcom/google/android/exoplayer2/MediaItem$h;->a:Landroid/net/Uri;

    .line 9
    invoke-virtual {v5}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/google/android/exoplayer2/MediaItem$c;->d(Ljava/lang/String;)Lcom/google/android/exoplayer2/MediaItem$c;

    move-result-object v4

    .line 10
    invoke-static {p2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/google/android/exoplayer2/MediaItem$c;->g(Ljava/util/List;)Lcom/google/android/exoplayer2/MediaItem$c;

    move-result-object v4

    move-object/from16 v5, p8

    .line 11
    invoke-virtual {v4, v5}, Lcom/google/android/exoplayer2/MediaItem$c;->h(Ljava/lang/Object;)Lcom/google/android/exoplayer2/MediaItem$c;

    move-result-object v4

    .line 12
    invoke-virtual {v4}, Lcom/google/android/exoplayer2/MediaItem$c;->a()Lcom/google/android/exoplayer2/MediaItem;

    move-result-object v8

    iput-object v8, v0, Lh8/t0;->x:Lcom/google/android/exoplayer2/MediaItem;

    .line 13
    new-instance v4, Ld7/k$b;

    invoke-direct {v4}, Ld7/k$b;-><init>()V

    move-object v5, p1

    .line 14
    invoke-virtual {v4, p1}, Ld7/k$b;->S(Ljava/lang/String;)Ld7/k$b;

    move-result-object v4

    iget-object v5, v1, Lcom/google/android/exoplayer2/MediaItem$h;->b:Ljava/lang/String;

    .line 15
    invoke-virtual {v4, v5}, Ld7/k$b;->e0(Ljava/lang/String;)Ld7/k$b;

    move-result-object v4

    iget-object v5, v1, Lcom/google/android/exoplayer2/MediaItem$h;->c:Ljava/lang/String;

    .line 16
    invoke-virtual {v4, v5}, Ld7/k$b;->V(Ljava/lang/String;)Ld7/k$b;

    move-result-object v4

    iget v5, v1, Lcom/google/android/exoplayer2/MediaItem$h;->d:I

    .line 17
    invoke-virtual {v4, v5}, Ld7/k$b;->g0(I)Ld7/k$b;

    move-result-object v4

    iget v5, v1, Lcom/google/android/exoplayer2/MediaItem$h;->e:I

    .line 18
    invoke-virtual {v4, v5}, Ld7/k$b;->c0(I)Ld7/k$b;

    move-result-object v4

    iget-object v5, v1, Lcom/google/android/exoplayer2/MediaItem$h;->f:Ljava/lang/String;

    .line 19
    invoke-virtual {v4, v5}, Ld7/k$b;->U(Ljava/lang/String;)Ld7/k$b;

    move-result-object v4

    .line 20
    invoke-virtual {v4}, Ld7/k$b;->E()Ld7/k;

    move-result-object v4

    iput-object v4, v0, Lh8/t0;->s:Ld7/k;

    .line 21
    new-instance v4, Lcom/google/android/exoplayer2/upstream/a$b;

    invoke-direct {v4}, Lcom/google/android/exoplayer2/upstream/a$b;-><init>()V

    iget-object v1, v1, Lcom/google/android/exoplayer2/MediaItem$h;->a:Landroid/net/Uri;

    .line 22
    invoke-virtual {v4, v1}, Lcom/google/android/exoplayer2/upstream/a$b;->i(Landroid/net/Uri;)Lcom/google/android/exoplayer2/upstream/a$b;

    move-result-object v1

    const/4 v4, 0x1

    invoke-virtual {v1, v4}, Lcom/google/android/exoplayer2/upstream/a$b;->b(I)Lcom/google/android/exoplayer2/upstream/a$b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/exoplayer2/upstream/a$b;->a()Lcom/google/android/exoplayer2/upstream/a;

    move-result-object v1

    iput-object v1, v0, Lh8/t0;->q:Lcom/google/android/exoplayer2/upstream/a;

    .line 23
    new-instance v9, Lh8/r0;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, v9

    invoke-direct/range {v1 .. v8}, Lh8/r0;-><init>(JZZZLjava/lang/Object;Lcom/google/android/exoplayer2/MediaItem;)V

    iput-object v9, v0, Lh8/t0;->w:Lcom/google/android/exoplayer2/Timeline;

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;Lcom/google/android/exoplayer2/MediaItem$h;Lcom/google/android/exoplayer2/upstream/DataSource$Factory;JLcom/google/android/exoplayer2/upstream/g;ZLjava/lang/Object;Lh8/t0$a;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p8}, Lh8/t0;-><init>(Ljava/lang/String;Lcom/google/android/exoplayer2/MediaItem$h;Lcom/google/android/exoplayer2/upstream/DataSource$Factory;JLcom/google/android/exoplayer2/upstream/g;ZLjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method protected A(Ld9/x;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lh8/t0;->y:Ld9/x;

    .line 2
    .line 3
    iget-object p1, p0, Lh8/t0;->w:Lcom/google/android/exoplayer2/Timeline;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lh8/a;->B(Lcom/google/android/exoplayer2/Timeline;)V

    .line 6
    .line 7
    .line 8
    return-void
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

.method protected C()V
    .locals 0

    return-void
.end method

.method public f(Lh8/u$a;Ld9/b;J)Lh8/r;
    .locals 10

    .line 1
    new-instance p2, Lh8/s0;

    .line 2
    .line 3
    iget-object v1, p0, Lh8/t0;->q:Lcom/google/android/exoplayer2/upstream/a;

    .line 4
    .line 5
    iget-object v2, p0, Lh8/t0;->r:Lcom/google/android/exoplayer2/upstream/DataSource$Factory;

    .line 6
    .line 7
    iget-object v3, p0, Lh8/t0;->y:Ld9/x;

    .line 8
    .line 9
    iget-object v4, p0, Lh8/t0;->s:Ld7/k;

    .line 10
    .line 11
    iget-wide v5, p0, Lh8/t0;->t:J

    .line 12
    .line 13
    iget-object v7, p0, Lh8/t0;->u:Lcom/google/android/exoplayer2/upstream/g;

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Lh8/a;->v(Lh8/u$a;)Lh8/b0$a;

    .line 16
    .line 17
    .line 18
    move-result-object v8

    .line 19
    iget-boolean v9, p0, Lh8/t0;->v:Z

    .line 20
    .line 21
    move-object v0, p2

    .line 22
    invoke-direct/range {v0 .. v9}, Lh8/s0;-><init>(Lcom/google/android/exoplayer2/upstream/a;Lcom/google/android/exoplayer2/upstream/DataSource$Factory;Ld9/x;Ld7/k;JLcom/google/android/exoplayer2/upstream/g;Lh8/b0$a;Z)V

    .line 23
    .line 24
    .line 25
    return-object p2
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
.end method

.method public h()Lcom/google/android/exoplayer2/MediaItem;
    .locals 1

    iget-object v0, p0, Lh8/t0;->x:Lcom/google/android/exoplayer2/MediaItem;

    return-object v0
.end method

.method public j()V
    .locals 0

    return-void
.end method

.method public q(Lh8/r;)V
    .locals 0

    check-cast p1, Lh8/s0;

    invoke-virtual {p1}, Lh8/s0;->q()V

    return-void
.end method
