.class final Lm8/i;
.super Lj8/m;
.source "SourceFile"


# static fields
.field private static final L:Ljava/util/concurrent/atomic/AtomicInteger;


# instance fields
.field private final A:Z

.field private final B:Z

.field private C:Lm8/j;

.field private D:Lm8/q;

.field private E:I

.field private F:Z

.field private volatile G:Z

.field private H:Z

.field private I:Lbc/i0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbc/i0<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private J:Z

.field private K:Z

.field public final k:I

.field public final l:I

.field public final m:Landroid/net/Uri;

.field public final n:Z

.field public final o:I

.field private final p:Lcom/google/android/exoplayer2/upstream/DataSource;

.field private final q:Lcom/google/android/exoplayer2/upstream/a;

.field private final r:Lm8/j;

.field private final s:Z

.field private final t:Z

.field private final u:Lf9/l0;

.field private final v:Lm8/h;

.field private final w:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ld7/k;",
            ">;"
        }
    .end annotation
.end field

.field private final x:Lj7/l;

.field private final y:Ld8/h;

.field private final z:Lf9/y;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    sput-object v0, Lm8/i;->L:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method

.method private constructor <init>(Lm8/h;Lcom/google/android/exoplayer2/upstream/DataSource;Lcom/google/android/exoplayer2/upstream/a;Ld7/k;ZLcom/google/android/exoplayer2/upstream/DataSource;Lcom/google/android/exoplayer2/upstream/a;ZLandroid/net/Uri;Ljava/util/List;ILjava/lang/Object;JJJIZIZZLf9/l0;Lj7/l;Lm8/j;Ld8/h;Lf9/y;Z)V
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm8/h;",
            "Lcom/google/android/exoplayer2/upstream/DataSource;",
            "Lcom/google/android/exoplayer2/upstream/a;",
            "Ld7/k;",
            "Z",
            "Lcom/google/android/exoplayer2/upstream/DataSource;",
            "Lcom/google/android/exoplayer2/upstream/a;",
            "Z",
            "Landroid/net/Uri;",
            "Ljava/util/List<",
            "Ld7/k;",
            ">;I",
            "Ljava/lang/Object;",
            "JJJIZIZZ",
            "Lf9/l0;",
            "Lj7/l;",
            "Lm8/j;",
            "Ld8/h;",
            "Lf9/y;",
            "Z)V"
        }
    .end annotation

    move-object v12, p0

    move-object/from16 v13, p7

    move-object v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    move/from16 v4, p11

    move-object/from16 v5, p12

    move-wide/from16 v6, p13

    move-wide/from16 v8, p15

    move-wide/from16 v10, p17

    .line 1
    invoke-direct/range {v0 .. v11}, Lj8/m;-><init>(Lcom/google/android/exoplayer2/upstream/DataSource;Lcom/google/android/exoplayer2/upstream/a;Ld7/k;ILjava/lang/Object;JJJ)V

    move/from16 v0, p5

    .line 2
    iput-boolean v0, v12, Lm8/i;->A:Z

    move/from16 v0, p19

    .line 3
    iput v0, v12, Lm8/i;->o:I

    move/from16 v0, p20

    .line 4
    iput-boolean v0, v12, Lm8/i;->K:Z

    move/from16 v0, p21

    .line 5
    iput v0, v12, Lm8/i;->l:I

    .line 6
    iput-object v13, v12, Lm8/i;->q:Lcom/google/android/exoplayer2/upstream/a;

    move-object/from16 v0, p6

    .line 7
    iput-object v0, v12, Lm8/i;->p:Lcom/google/android/exoplayer2/upstream/DataSource;

    if-eqz v13, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 8
    :goto_0
    iput-boolean v0, v12, Lm8/i;->F:Z

    move/from16 v0, p8

    .line 9
    iput-boolean v0, v12, Lm8/i;->B:Z

    move-object/from16 v0, p9

    .line 10
    iput-object v0, v12, Lm8/i;->m:Landroid/net/Uri;

    move/from16 v0, p23

    .line 11
    iput-boolean v0, v12, Lm8/i;->s:Z

    move-object/from16 v0, p24

    .line 12
    iput-object v0, v12, Lm8/i;->u:Lf9/l0;

    move/from16 v0, p22

    .line 13
    iput-boolean v0, v12, Lm8/i;->t:Z

    move-object v0, p1

    .line 14
    iput-object v0, v12, Lm8/i;->v:Lm8/h;

    move-object/from16 v0, p10

    .line 15
    iput-object v0, v12, Lm8/i;->w:Ljava/util/List;

    move-object/from16 v0, p25

    .line 16
    iput-object v0, v12, Lm8/i;->x:Lj7/l;

    move-object/from16 v0, p26

    .line 17
    iput-object v0, v12, Lm8/i;->r:Lm8/j;

    move-object/from16 v0, p27

    .line 18
    iput-object v0, v12, Lm8/i;->y:Ld8/h;

    move-object/from16 v0, p28

    .line 19
    iput-object v0, v12, Lm8/i;->z:Lf9/y;

    move/from16 v0, p29

    .line 20
    iput-boolean v0, v12, Lm8/i;->n:Z

    .line 21
    invoke-static {}, Lbc/i0;->x()Lbc/i0;

    move-result-object v0

    iput-object v0, v12, Lm8/i;->I:Lbc/i0;

    .line 22
    sget-object v0, Lm8/i;->L:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    iput v0, v12, Lm8/i;->k:I

    return-void
.end method

.method private static i(Lcom/google/android/exoplayer2/upstream/DataSource;[B[B)Lcom/google/android/exoplayer2/upstream/DataSource;
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-static {p2}, Lf9/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    new-instance v0, Lm8/a;

    .line 7
    .line 8
    invoke-direct {v0, p0, p1, p2}, Lm8/a;-><init>(Lcom/google/android/exoplayer2/upstream/DataSource;[B[B)V

    .line 9
    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    return-object p0
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

.method public static j(Lm8/h;Lcom/google/android/exoplayer2/upstream/DataSource;Ld7/k;JLn8/g;Lm8/f$e;Landroid/net/Uri;Ljava/util/List;ILjava/lang/Object;ZLm8/t;Lm8/i;[B[B)Lm8/i;
    .locals 40
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm8/h;",
            "Lcom/google/android/exoplayer2/upstream/DataSource;",
            "Ld7/k;",
            "J",
            "Ln8/g;",
            "Lm8/f$e;",
            "Landroid/net/Uri;",
            "Ljava/util/List<",
            "Ld7/k;",
            ">;I",
            "Ljava/lang/Object;",
            "Z",
            "Lm8/t;",
            "Lm8/i;",
            "[B[B)",
            "Lm8/i;"
        }
    .end annotation

    move-object/from16 v0, p1

    move-object/from16 v1, p5

    move-object/from16 v2, p6

    move-object/from16 v3, p13

    move-object/from16 v4, p14

    move-object/from16 v5, p15

    .line 1
    iget-object v6, v2, Lm8/f$e;->a:Ln8/g$e;

    .line 2
    new-instance v7, Lcom/google/android/exoplayer2/upstream/a$b;

    invoke-direct {v7}, Lcom/google/android/exoplayer2/upstream/a$b;-><init>()V

    iget-object v8, v1, Ln8/h;->a:Ljava/lang/String;

    iget-object v9, v6, Ln8/g$e;->k:Ljava/lang/String;

    .line 3
    invoke-static {v8, v9}, Lf9/n0;->d(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/google/android/exoplayer2/upstream/a$b;->i(Landroid/net/Uri;)Lcom/google/android/exoplayer2/upstream/a$b;

    move-result-object v7

    iget-wide v8, v6, Ln8/g$e;->s:J

    .line 4
    invoke-virtual {v7, v8, v9}, Lcom/google/android/exoplayer2/upstream/a$b;->h(J)Lcom/google/android/exoplayer2/upstream/a$b;

    move-result-object v7

    iget-wide v8, v6, Ln8/g$e;->t:J

    .line 5
    invoke-virtual {v7, v8, v9}, Lcom/google/android/exoplayer2/upstream/a$b;->g(J)Lcom/google/android/exoplayer2/upstream/a$b;

    move-result-object v7

    .line 6
    iget-boolean v8, v2, Lm8/f$e;->d:Z

    if-eqz v8, :cond_0

    const/16 v8, 0x8

    goto :goto_0

    :cond_0
    const/4 v8, 0x0

    :goto_0
    invoke-virtual {v7, v8}, Lcom/google/android/exoplayer2/upstream/a$b;->b(I)Lcom/google/android/exoplayer2/upstream/a$b;

    move-result-object v7

    .line 7
    invoke-virtual {v7}, Lcom/google/android/exoplayer2/upstream/a$b;->a()Lcom/google/android/exoplayer2/upstream/a;

    move-result-object v13

    if-eqz v4, :cond_1

    const/4 v15, 0x1

    goto :goto_1

    :cond_1
    const/4 v15, 0x0

    :goto_1
    if-eqz v15, :cond_2

    .line 8
    iget-object v10, v6, Ln8/g$e;->r:Ljava/lang/String;

    invoke-static {v10}, Lf9/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    invoke-static {v10}, Lm8/i;->l(Ljava/lang/String;)[B

    move-result-object v10

    goto :goto_2

    :cond_2
    const/4 v10, 0x0

    .line 9
    :goto_2
    invoke-static {v0, v4, v10}, Lm8/i;->i(Lcom/google/android/exoplayer2/upstream/DataSource;[B[B)Lcom/google/android/exoplayer2/upstream/DataSource;

    move-result-object v12

    .line 10
    iget-object v4, v6, Ln8/g$e;->l:Ln8/g$d;

    if-eqz v4, :cond_5

    if-eqz v5, :cond_3

    const/4 v10, 0x1

    goto :goto_3

    :cond_3
    const/4 v10, 0x0

    :goto_3
    if-eqz v10, :cond_4

    .line 11
    iget-object v11, v4, Ln8/g$e;->r:Ljava/lang/String;

    invoke-static {v11}, Lf9/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    invoke-static {v11}, Lm8/i;->l(Ljava/lang/String;)[B

    move-result-object v11

    goto :goto_4

    :cond_4
    const/4 v11, 0x0

    .line 12
    :goto_4
    iget-object v14, v1, Ln8/h;->a:Ljava/lang/String;

    iget-object v8, v4, Ln8/g$e;->k:Ljava/lang/String;

    invoke-static {v14, v8}, Lf9/n0;->d(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v18

    .line 13
    new-instance v8, Lcom/google/android/exoplayer2/upstream/a;

    move/from16 p14, v10

    iget-wide v9, v4, Ln8/g$e;->s:J

    move/from16 v23, v15

    iget-wide v14, v4, Ln8/g$e;->t:J

    move-object/from16 v17, v8

    move-wide/from16 v19, v9

    move-wide/from16 v21, v14

    invoke-direct/range {v17 .. v22}, Lcom/google/android/exoplayer2/upstream/a;-><init>(Landroid/net/Uri;JJ)V

    .line 14
    invoke-static {v0, v5, v11}, Lm8/i;->i(Lcom/google/android/exoplayer2/upstream/DataSource;[B[B)Lcom/google/android/exoplayer2/upstream/DataSource;

    move-result-object v0

    move/from16 v18, p14

    goto :goto_5

    :cond_5
    move/from16 v23, v15

    const/4 v0, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    .line 15
    :goto_5
    iget-wide v4, v6, Ln8/g$e;->o:J

    add-long v4, p3, v4

    .line 16
    iget-wide v8, v6, Ln8/g$e;->m:J

    add-long v25, v4, v8

    .line 17
    iget v8, v1, Ln8/g;->h:I

    iget v9, v6, Ln8/g$e;->n:I

    add-int/2addr v8, v9

    if-eqz v3, :cond_b

    .line 18
    iget-object v9, v3, Lm8/i;->m:Landroid/net/Uri;

    move-object/from16 v15, p7

    .line 19
    invoke-virtual {v15, v9}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_6

    iget-boolean v9, v3, Lm8/i;->H:Z

    if-eqz v9, :cond_6

    const/4 v9, 0x1

    goto :goto_6

    :cond_6
    const/4 v9, 0x0

    .line 20
    :goto_6
    iget-object v10, v3, Lm8/i;->y:Ld8/h;

    .line 21
    iget-object v11, v3, Lm8/i;->z:Lf9/y;

    .line 22
    invoke-static {v2, v1}, Lm8/i;->p(Lm8/f$e;Ln8/g;)Z

    move-result v1

    move/from16 p1, v8

    if-nez v9, :cond_8

    if-eqz v1, :cond_7

    .line 23
    iget-wide v7, v3, Lj8/e;->h:J

    cmp-long v7, v4, v7

    if-ltz v7, :cond_7

    goto :goto_7

    :cond_7
    const/16 v24, 0x0

    goto :goto_8

    :cond_8
    :goto_7
    const/16 v24, 0x1

    :goto_8
    const/4 v1, 0x1

    xor-int/lit8 v7, v24, 0x1

    if-eqz v9, :cond_9

    .line 24
    iget-boolean v8, v3, Lm8/i;->J:Z

    if-nez v8, :cond_9

    iget v8, v3, Lm8/i;->l:I

    move/from16 v9, p1

    if-ne v8, v9, :cond_a

    .line 25
    iget-object v8, v3, Lm8/i;->C:Lm8/j;

    goto :goto_9

    :cond_9
    move/from16 v9, p1

    :cond_a
    const/4 v8, 0x0

    :goto_9
    move/from16 v39, v7

    move-object/from16 v36, v8

    move-object/from16 v37, v10

    move-object/from16 v38, v11

    goto :goto_a

    :cond_b
    move-object/from16 v15, p7

    move v9, v8

    .line 26
    new-instance v3, Ld8/h;

    invoke-direct {v3}, Ld8/h;-><init>()V

    .line 27
    new-instance v7, Lf9/y;

    const/16 v8, 0xa

    invoke-direct {v7, v8}, Lf9/y;-><init>(I)V

    move-object/from16 v37, v3

    move-object/from16 v38, v7

    const/16 v36, 0x0

    const/16 v39, 0x0

    .line 28
    :goto_a
    new-instance v3, Lm8/i;

    iget-wide v7, v2, Lm8/f$e;->b:J

    iget v14, v2, Lm8/f$e;->c:I

    iget-boolean v2, v2, Lm8/f$e;->d:Z

    const/4 v1, 0x1

    xor-int/lit8 v30, v2, 0x1

    iget-boolean v1, v6, Ln8/g$e;->u:Z

    move/from16 v32, v1

    move-object/from16 v1, p12

    .line 29
    invoke-virtual {v1, v9}, Lm8/t;->a(I)Lf9/l0;

    move-result-object v34

    iget-object v1, v6, Ln8/g$e;->p:Lj7/l;

    move-object/from16 v35, v1

    move-object v10, v3

    move-object/from16 v11, p0

    move v1, v14

    move-object/from16 v14, p2

    move/from16 v15, v23

    move-object/from16 v16, v0

    move-object/from16 v19, p7

    move-object/from16 v20, p8

    move/from16 v21, p9

    move-object/from16 v22, p10

    move-wide/from16 v23, v4

    move-wide/from16 v27, v7

    move/from16 v29, v1

    move/from16 v31, v9

    move/from16 v33, p11

    invoke-direct/range {v10 .. v39}, Lm8/i;-><init>(Lm8/h;Lcom/google/android/exoplayer2/upstream/DataSource;Lcom/google/android/exoplayer2/upstream/a;Ld7/k;ZLcom/google/android/exoplayer2/upstream/DataSource;Lcom/google/android/exoplayer2/upstream/a;ZLandroid/net/Uri;Ljava/util/List;ILjava/lang/Object;JJJIZIZZLf9/l0;Lj7/l;Lm8/j;Ld8/h;Lf9/y;Z)V

    return-object v3
.end method

.method private k(Lcom/google/android/exoplayer2/upstream/DataSource;Lcom/google/android/exoplayer2/upstream/a;Z)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p3, :cond_1

    .line 3
    .line 4
    iget p3, p0, Lm8/i;->E:I

    .line 5
    .line 6
    if-eqz p3, :cond_0

    .line 7
    .line 8
    const/4 p3, 0x1

    .line 9
    move v0, p3

    .line 10
    :cond_0
    move-object p3, p2

    .line 11
    goto :goto_0

    .line 12
    :cond_1
    iget p3, p0, Lm8/i;->E:I

    .line 13
    .line 14
    int-to-long v1, p3

    .line 15
    invoke-virtual {p2, v1, v2}, Lcom/google/android/exoplayer2/upstream/a;->e(J)Lcom/google/android/exoplayer2/upstream/a;

    .line 16
    .line 17
    .line 18
    move-result-object p3

    .line 19
    :goto_0
    :try_start_0
    invoke-direct {p0, p1, p3}, Lm8/i;->u(Lcom/google/android/exoplayer2/upstream/DataSource;Lcom/google/android/exoplayer2/upstream/a;)Ll7/f;

    .line 20
    .line 21
    .line 22
    move-result-object p3

    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    iget v0, p0, Lm8/i;->E:I

    .line 26
    .line 27
    invoke-interface {p3, v0}, Ll7/j;->k(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 28
    .line 29
    .line 30
    :cond_2
    :goto_1
    :try_start_1
    iget-boolean v0, p0, Lm8/i;->G:Z

    .line 31
    .line 32
    if-nez v0, :cond_3

    .line 33
    .line 34
    iget-object v0, p0, Lm8/i;->C:Lm8/j;

    .line 35
    .line 36
    invoke-interface {v0, p3}, Lm8/j;->a(Ll7/j;)Z

    .line 37
    .line 38
    .line 39
    move-result v0
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 40
    if-eqz v0, :cond_3

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_3
    :try_start_2
    invoke-interface {p3}, Ll7/j;->getPosition()J

    .line 44
    .line 45
    .line 46
    move-result-wide v0

    .line 47
    iget-wide p2, p2, Lcom/google/android/exoplayer2/upstream/a;->g:J

    .line 48
    .line 49
    :goto_2
    sub-long/2addr v0, p2

    .line 50
    long-to-int p2, v0

    .line 51
    iput p2, p0, Lm8/i;->E:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 52
    .line 53
    goto :goto_3

    .line 54
    :catchall_0
    move-exception v0

    .line 55
    goto :goto_4

    .line 56
    :catch_0
    move-exception v0

    .line 57
    :try_start_3
    iget-object v1, p0, Lj8/e;->d:Ld7/k;

    .line 58
    .line 59
    iget v1, v1, Ld7/k;->o:I

    .line 60
    .line 61
    and-int/lit16 v1, v1, 0x4000

    .line 62
    .line 63
    if-eqz v1, :cond_4

    .line 64
    .line 65
    iget-object v0, p0, Lm8/i;->C:Lm8/j;

    .line 66
    .line 67
    invoke-interface {v0}, Lm8/j;->c()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 68
    .line 69
    .line 70
    :try_start_4
    invoke-interface {p3}, Ll7/j;->getPosition()J

    .line 71
    .line 72
    .line 73
    move-result-wide v0

    .line 74
    iget-wide p2, p2, Lcom/google/android/exoplayer2/upstream/a;->g:J
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :goto_3
    invoke-static {p1}, Lf9/q0;->n(Lcom/google/android/exoplayer2/upstream/DataSource;)V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :cond_4
    :try_start_5
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 82
    :goto_4
    :try_start_6
    invoke-interface {p3}, Ll7/j;->getPosition()J

    .line 83
    .line 84
    .line 85
    move-result-wide v1

    .line 86
    iget-wide p2, p2, Lcom/google/android/exoplayer2/upstream/a;->g:J

    .line 87
    .line 88
    sub-long/2addr v1, p2

    .line 89
    long-to-int p2, v1

    .line 90
    iput p2, p0, Lm8/i;->E:I

    .line 91
    .line 92
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 93
    :catchall_1
    move-exception p2

    .line 94
    invoke-static {p1}, Lf9/q0;->n(Lcom/google/android/exoplayer2/upstream/DataSource;)V

    .line 95
    .line 96
    .line 97
    throw p2
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

.method private static l(Ljava/lang/String;)[B
    .locals 4

    .line 1
    invoke-static {p0}, Lf9/q0;->U0(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "0x"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x2

    .line 14
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    :cond_0
    new-instance v0, Ljava/math/BigInteger;

    .line 19
    .line 20
    const/16 v1, 0x10

    .line 21
    .line 22
    invoke-direct {v0, p0, v1}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;I)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/math/BigInteger;->toByteArray()[B

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    new-array v0, v1, [B

    .line 30
    .line 31
    array-length v2, p0

    .line 32
    if-le v2, v1, :cond_1

    .line 33
    .line 34
    array-length v2, p0

    .line 35
    sub-int/2addr v2, v1

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const/4 v2, 0x0

    .line 38
    :goto_0
    array-length v3, p0

    .line 39
    sub-int/2addr v1, v3

    .line 40
    add-int/2addr v1, v2

    .line 41
    array-length v3, p0

    .line 42
    sub-int/2addr v3, v2

    .line 43
    invoke-static {p0, v2, v0, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 44
    .line 45
    .line 46
    return-object v0
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

.method private static p(Lm8/f$e;Ln8/g;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lm8/f$e;->a:Ln8/g$e;

    .line 2
    .line 3
    instance-of v1, v0, Ln8/g$b;

    .line 4
    .line 5
    if-eqz v1, :cond_2

    .line 6
    .line 7
    check-cast v0, Ln8/g$b;

    .line 8
    .line 9
    iget-boolean v0, v0, Ln8/g$b;->v:Z

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    iget p0, p0, Lm8/f$e;->c:I

    .line 14
    .line 15
    if-nez p0, :cond_0

    .line 16
    .line 17
    iget-boolean p0, p1, Ln8/h;->c:Z

    .line 18
    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 25
    :goto_1
    return p0

    .line 26
    :cond_2
    iget-boolean p0, p1, Ln8/h;->c:Z

    .line 27
    .line 28
    return p0
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

.method private r()V
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p0, Lm8/i;->u:Lf9/l0;

    .line 2
    .line 3
    iget-boolean v1, p0, Lm8/i;->s:Z

    .line 4
    .line 5
    iget-wide v2, p0, Lj8/e;->g:J

    .line 6
    .line 7
    invoke-virtual {v0, v1, v2, v3}, Lf9/l0;->h(ZJ)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lj8/e;->i:Ld9/v;

    .line 11
    .line 12
    iget-object v1, p0, Lj8/e;->b:Lcom/google/android/exoplayer2/upstream/a;

    .line 13
    .line 14
    iget-boolean v2, p0, Lm8/i;->A:Z

    .line 15
    .line 16
    invoke-direct {p0, v0, v1, v2}, Lm8/i;->k(Lcom/google/android/exoplayer2/upstream/DataSource;Lcom/google/android/exoplayer2/upstream/a;Z)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :catch_0
    new-instance v0, Ljava/io/InterruptedIOException;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/io/InterruptedIOException;-><init>()V

    .line 23
    .line 24
    .line 25
    throw v0
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

.method private s()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lm8/i;->F:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lm8/i;->p:Lcom/google/android/exoplayer2/upstream/DataSource;

    .line 7
    .line 8
    invoke-static {v0}, Lf9/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lm8/i;->q:Lcom/google/android/exoplayer2/upstream/a;

    .line 12
    .line 13
    invoke-static {v0}, Lf9/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lm8/i;->p:Lcom/google/android/exoplayer2/upstream/DataSource;

    .line 17
    .line 18
    iget-object v1, p0, Lm8/i;->q:Lcom/google/android/exoplayer2/upstream/a;

    .line 19
    .line 20
    iget-boolean v2, p0, Lm8/i;->B:Z

    .line 21
    .line 22
    invoke-direct {p0, v0, v1, v2}, Lm8/i;->k(Lcom/google/android/exoplayer2/upstream/DataSource;Lcom/google/android/exoplayer2/upstream/a;Z)V

    .line 23
    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    iput v0, p0, Lm8/i;->E:I

    .line 27
    .line 28
    iput-boolean v0, p0, Lm8/i;->F:Z

    .line 29
    .line 30
    return-void
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

.method private t(Ll7/j;)J
    .locals 8

    .line 1
    invoke-interface {p1}, Ll7/j;->j()V

    .line 2
    .line 3
    .line 4
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    :try_start_0
    iget-object v2, p0, Lm8/i;->z:Lf9/y;

    .line 10
    .line 11
    const/16 v3, 0xa

    .line 12
    .line 13
    invoke-virtual {v2, v3}, Lf9/y;->L(I)V

    .line 14
    .line 15
    .line 16
    iget-object v2, p0, Lm8/i;->z:Lf9/y;

    .line 17
    .line 18
    invoke-virtual {v2}, Lf9/y;->d()[B

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    const/4 v4, 0x0

    .line 23
    invoke-interface {p1, v2, v4, v3}, Ll7/j;->n([BII)V
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    .line 25
    .line 26
    iget-object v2, p0, Lm8/i;->z:Lf9/y;

    .line 27
    .line 28
    invoke-virtual {v2}, Lf9/y;->G()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    const v5, 0x494433

    .line 33
    .line 34
    .line 35
    if-eq v2, v5, :cond_0

    .line 36
    .line 37
    return-wide v0

    .line 38
    :cond_0
    iget-object v2, p0, Lm8/i;->z:Lf9/y;

    .line 39
    .line 40
    const/4 v5, 0x3

    .line 41
    invoke-virtual {v2, v5}, Lf9/y;->Q(I)V

    .line 42
    .line 43
    .line 44
    iget-object v2, p0, Lm8/i;->z:Lf9/y;

    .line 45
    .line 46
    invoke-virtual {v2}, Lf9/y;->C()I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    add-int/lit8 v5, v2, 0xa

    .line 51
    .line 52
    iget-object v6, p0, Lm8/i;->z:Lf9/y;

    .line 53
    .line 54
    invoke-virtual {v6}, Lf9/y;->b()I

    .line 55
    .line 56
    .line 57
    move-result v6

    .line 58
    if-le v5, v6, :cond_1

    .line 59
    .line 60
    iget-object v6, p0, Lm8/i;->z:Lf9/y;

    .line 61
    .line 62
    invoke-virtual {v6}, Lf9/y;->d()[B

    .line 63
    .line 64
    .line 65
    move-result-object v6

    .line 66
    iget-object v7, p0, Lm8/i;->z:Lf9/y;

    .line 67
    .line 68
    invoke-virtual {v7, v5}, Lf9/y;->L(I)V

    .line 69
    .line 70
    .line 71
    iget-object v5, p0, Lm8/i;->z:Lf9/y;

    .line 72
    .line 73
    invoke-virtual {v5}, Lf9/y;->d()[B

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    invoke-static {v6, v4, v5, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 78
    .line 79
    .line 80
    :cond_1
    iget-object v5, p0, Lm8/i;->z:Lf9/y;

    .line 81
    .line 82
    invoke-virtual {v5}, Lf9/y;->d()[B

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    invoke-interface {p1, v5, v3, v2}, Ll7/j;->n([BII)V

    .line 87
    .line 88
    .line 89
    iget-object p1, p0, Lm8/i;->y:Ld8/h;

    .line 90
    .line 91
    iget-object v3, p0, Lm8/i;->z:Lf9/y;

    .line 92
    .line 93
    invoke-virtual {v3}, Lf9/y;->d()[B

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    invoke-virtual {p1, v3, v2}, Ld8/h;->e([BI)Ly7/a;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    if-nez p1, :cond_2

    .line 102
    .line 103
    return-wide v0

    .line 104
    :cond_2
    invoke-virtual {p1}, Ly7/a;->f()I

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    move v3, v4

    .line 109
    :goto_0
    if-ge v3, v2, :cond_4

    .line 110
    .line 111
    invoke-virtual {p1, v3}, Ly7/a;->e(I)Ly7/a$b;

    .line 112
    .line 113
    .line 114
    move-result-object v5

    .line 115
    instance-of v6, v5, Ld8/l;

    .line 116
    .line 117
    if-eqz v6, :cond_3

    .line 118
    .line 119
    check-cast v5, Ld8/l;

    .line 120
    .line 121
    iget-object v6, v5, Ld8/l;->l:Ljava/lang/String;

    .line 122
    .line 123
    const-string v7, "com.apple.streaming.transportStreamTimestamp"

    .line 124
    .line 125
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v6

    .line 129
    if-eqz v6, :cond_3

    .line 130
    .line 131
    iget-object p1, v5, Ld8/l;->m:[B

    .line 132
    .line 133
    iget-object v0, p0, Lm8/i;->z:Lf9/y;

    .line 134
    .line 135
    invoke-virtual {v0}, Lf9/y;->d()[B

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    const/16 v1, 0x8

    .line 140
    .line 141
    invoke-static {p1, v4, v0, v4, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 142
    .line 143
    .line 144
    iget-object p1, p0, Lm8/i;->z:Lf9/y;

    .line 145
    .line 146
    invoke-virtual {p1, v4}, Lf9/y;->P(I)V

    .line 147
    .line 148
    .line 149
    iget-object p1, p0, Lm8/i;->z:Lf9/y;

    .line 150
    .line 151
    invoke-virtual {p1, v1}, Lf9/y;->O(I)V

    .line 152
    .line 153
    .line 154
    iget-object p1, p0, Lm8/i;->z:Lf9/y;

    .line 155
    .line 156
    invoke-virtual {p1}, Lf9/y;->w()J

    .line 157
    .line 158
    .line 159
    move-result-wide v0

    .line 160
    const-wide v2, 0x1ffffffffL

    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    and-long/2addr v0, v2

    .line 166
    return-wide v0

    .line 167
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 168
    .line 169
    goto :goto_0

    .line 170
    :catch_0
    :cond_4
    return-wide v0
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
.end method

.method private u(Lcom/google/android/exoplayer2/upstream/DataSource;Lcom/google/android/exoplayer2/upstream/a;)Ll7/f;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    invoke-interface/range {p1 .. p2}, Lcom/google/android/exoplayer2/upstream/DataSource;->b(Lcom/google/android/exoplayer2/upstream/a;)J

    .line 6
    .line 7
    .line 8
    move-result-wide v6

    .line 9
    new-instance v15, Ll7/f;

    .line 10
    .line 11
    iget-wide v4, v1, Lcom/google/android/exoplayer2/upstream/a;->g:J

    .line 12
    .line 13
    move-object v2, v15

    .line 14
    move-object/from16 v3, p1

    .line 15
    .line 16
    invoke-direct/range {v2 .. v7}, Ll7/f;-><init>(Ld9/h;JJ)V

    .line 17
    .line 18
    .line 19
    iget-object v2, v0, Lm8/i;->C:Lm8/j;

    .line 20
    .line 21
    if-nez v2, :cond_3

    .line 22
    .line 23
    invoke-direct {v0, v15}, Lm8/i;->t(Ll7/j;)J

    .line 24
    .line 25
    .line 26
    move-result-wide v2

    .line 27
    invoke-virtual {v15}, Ll7/f;->j()V

    .line 28
    .line 29
    .line 30
    iget-object v4, v0, Lm8/i;->r:Lm8/j;

    .line 31
    .line 32
    if-eqz v4, :cond_0

    .line 33
    .line 34
    invoke-interface {v4}, Lm8/j;->f()Lm8/j;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    iget-object v8, v0, Lm8/i;->v:Lm8/h;

    .line 40
    .line 41
    iget-object v9, v1, Lcom/google/android/exoplayer2/upstream/a;->a:Landroid/net/Uri;

    .line 42
    .line 43
    iget-object v10, v0, Lj8/e;->d:Ld7/k;

    .line 44
    .line 45
    iget-object v11, v0, Lm8/i;->w:Ljava/util/List;

    .line 46
    .line 47
    iget-object v12, v0, Lm8/i;->u:Lf9/l0;

    .line 48
    .line 49
    invoke-interface/range {p1 .. p1}, Lcom/google/android/exoplayer2/upstream/DataSource;->i()Ljava/util/Map;

    .line 50
    .line 51
    .line 52
    move-result-object v13

    .line 53
    move-object v14, v15

    .line 54
    invoke-interface/range {v8 .. v14}, Lm8/h;->a(Landroid/net/Uri;Ld7/k;Ljava/util/List;Lf9/l0;Ljava/util/Map;Ll7/j;)Lm8/j;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    :goto_0
    iput-object v1, v0, Lm8/i;->C:Lm8/j;

    .line 59
    .line 60
    invoke-interface {v1}, Lm8/j;->d()Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-eqz v1, :cond_2

    .line 65
    .line 66
    iget-object v1, v0, Lm8/i;->D:Lm8/q;

    .line 67
    .line 68
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    cmp-long v4, v2, v4

    .line 74
    .line 75
    if-eqz v4, :cond_1

    .line 76
    .line 77
    iget-object v4, v0, Lm8/i;->u:Lf9/l0;

    .line 78
    .line 79
    invoke-virtual {v4, v2, v3}, Lf9/l0;->b(J)J

    .line 80
    .line 81
    .line 82
    move-result-wide v2

    .line 83
    goto :goto_1

    .line 84
    :cond_1
    iget-wide v2, v0, Lj8/e;->g:J

    .line 85
    .line 86
    :goto_1
    invoke-virtual {v1, v2, v3}, Lm8/q;->m0(J)V

    .line 87
    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_2
    iget-object v1, v0, Lm8/i;->D:Lm8/q;

    .line 91
    .line 92
    const-wide/16 v2, 0x0

    .line 93
    .line 94
    invoke-virtual {v1, v2, v3}, Lm8/q;->m0(J)V

    .line 95
    .line 96
    .line 97
    :goto_2
    iget-object v1, v0, Lm8/i;->D:Lm8/q;

    .line 98
    .line 99
    invoke-virtual {v1}, Lm8/q;->Y()V

    .line 100
    .line 101
    .line 102
    iget-object v1, v0, Lm8/i;->C:Lm8/j;

    .line 103
    .line 104
    iget-object v2, v0, Lm8/i;->D:Lm8/q;

    .line 105
    .line 106
    invoke-interface {v1, v2}, Lm8/j;->b(Ll7/k;)V

    .line 107
    .line 108
    .line 109
    :cond_3
    iget-object v1, v0, Lm8/i;->D:Lm8/q;

    .line 110
    .line 111
    iget-object v2, v0, Lm8/i;->x:Lj7/l;

    .line 112
    .line 113
    invoke-virtual {v1, v2}, Lm8/q;->j0(Lj7/l;)V

    .line 114
    .line 115
    .line 116
    return-object v15
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


# virtual methods
.method public a()V
    .locals 1

    .line 1
    iget-object v0, p0, Lm8/i;->D:Lm8/q;

    .line 2
    .line 3
    invoke-static {v0}, Lf9/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lm8/i;->C:Lm8/j;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lm8/i;->r:Lm8/j;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-interface {v0}, Lm8/j;->e()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    iget-object v0, p0, Lm8/i;->r:Lm8/j;

    .line 21
    .line 22
    iput-object v0, p0, Lm8/i;->C:Lm8/j;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    iput-boolean v0, p0, Lm8/i;->F:Z

    .line 26
    .line 27
    :cond_0
    invoke-direct {p0}, Lm8/i;->s()V

    .line 28
    .line 29
    .line 30
    iget-boolean v0, p0, Lm8/i;->G:Z

    .line 31
    .line 32
    if-nez v0, :cond_2

    .line 33
    .line 34
    iget-boolean v0, p0, Lm8/i;->t:Z

    .line 35
    .line 36
    if-nez v0, :cond_1

    .line 37
    .line 38
    invoke-direct {p0}, Lm8/i;->r()V

    .line 39
    .line 40
    .line 41
    :cond_1
    iget-boolean v0, p0, Lm8/i;->G:Z

    .line 42
    .line 43
    xor-int/lit8 v0, v0, 0x1

    .line 44
    .line 45
    iput-boolean v0, p0, Lm8/i;->H:Z

    .line 46
    .line 47
    :cond_2
    return-void
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

.method public b()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lm8/i;->G:Z

    return-void
.end method

.method public h()Z
    .locals 1

    iget-boolean v0, p0, Lm8/i;->H:Z

    return v0
.end method

.method public m(I)I
    .locals 1

    .line 1
    iget-boolean v0, p0, Lm8/i;->n:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    invoke-static {v0}, Lf9/a;->f(Z)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lm8/i;->I:Lbc/i0;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-lt p1, v0, :cond_0

    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    return p1

    .line 18
    :cond_0
    iget-object v0, p0, Lm8/i;->I:Lbc/i0;

    .line 19
    .line 20
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    check-cast p1, Ljava/lang/Integer;

    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    return p1
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

.method public n(Lm8/q;Lbc/i0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm8/q;",
            "Lbc/i0<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lm8/i;->D:Lm8/q;

    .line 2
    .line 3
    iput-object p2, p0, Lm8/i;->I:Lbc/i0;

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
.end method

.method public o()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lm8/i;->J:Z

    return-void
.end method

.method public q()Z
    .locals 1

    iget-boolean v0, p0, Lm8/i;->K:Z

    return v0
.end method

.method public v()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lm8/i;->K:Z

    return-void
.end method
