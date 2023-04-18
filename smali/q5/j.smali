.class public Lq5/j;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field protected a:Landroid/content/ContentResolver;

.field protected b:Landroid/content/res/Resources;

.field protected c:Landroid/content/res/AssetManager;

.field protected final d:Ly3/a;

.field protected final e:Ls5/c;

.field protected final f:Ls5/e;

.field protected final g:Z

.field protected final h:Z

.field protected final i:Z

.field protected final j:Lq5/e;

.field protected final k:Ly3/h;

.field protected final l:Lo5/e;

.field protected final m:Lo5/e;

.field protected final n:Lo5/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo5/s<",
            "Lcom/facebook/cache/common/CacheKey;",
            "Ly3/g;",
            ">;"
        }
    .end annotation
.end field

.field protected final o:Lo5/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo5/s<",
            "Lcom/facebook/cache/common/CacheKey;",
            "Lu5/c;",
            ">;"
        }
    .end annotation
.end field

.field protected final p:Lo5/f;

.field protected final q:Lo5/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo5/d<",
            "Lcom/facebook/cache/common/CacheKey;",
            ">;"
        }
    .end annotation
.end field

.field protected final r:Lo5/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo5/d<",
            "Lcom/facebook/cache/common/CacheKey;",
            ">;"
        }
    .end annotation
.end field

.field protected final s:Lcom/facebook/imagepipeline/bitmaps/PlatformBitmapFactory;

.field protected final t:I

.field protected final u:I

.field protected v:Z

.field protected final w:Lq5/a;

.field protected final x:I

.field protected final y:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Ly3/a;Ls5/c;Ls5/e;ZZZLq5/e;Ly3/h;Lo5/s;Lo5/s;Lo5/e;Lo5/e;Lo5/f;Lcom/facebook/imagepipeline/bitmaps/PlatformBitmapFactory;IIZILq5/a;ZI)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ly3/a;",
            "Ls5/c;",
            "Ls5/e;",
            "ZZZ",
            "Lq5/e;",
            "Ly3/h;",
            "Lo5/s<",
            "Lcom/facebook/cache/common/CacheKey;",
            "Lu5/c;",
            ">;",
            "Lo5/s<",
            "Lcom/facebook/cache/common/CacheKey;",
            "Ly3/g;",
            ">;",
            "Lo5/e;",
            "Lo5/e;",
            "Lo5/f;",
            "Lcom/facebook/imagepipeline/bitmaps/PlatformBitmapFactory;",
            "IIZI",
            "Lq5/a;",
            "ZI)V"
        }
    .end annotation

    move-object v0, p0

    move/from16 v1, p22

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v2

    iput-object v2, v0, Lq5/j;->a:Landroid/content/ContentResolver;

    .line 3
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    iput-object v2, v0, Lq5/j;->b:Landroid/content/res/Resources;

    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v2

    iput-object v2, v0, Lq5/j;->c:Landroid/content/res/AssetManager;

    move-object v2, p2

    .line 5
    iput-object v2, v0, Lq5/j;->d:Ly3/a;

    move-object v2, p3

    .line 6
    iput-object v2, v0, Lq5/j;->e:Ls5/c;

    move-object v2, p4

    .line 7
    iput-object v2, v0, Lq5/j;->f:Ls5/e;

    move v2, p5

    .line 8
    iput-boolean v2, v0, Lq5/j;->g:Z

    move v2, p6

    .line 9
    iput-boolean v2, v0, Lq5/j;->h:Z

    move v2, p7

    .line 10
    iput-boolean v2, v0, Lq5/j;->i:Z

    move-object v2, p8

    .line 11
    iput-object v2, v0, Lq5/j;->j:Lq5/e;

    move-object v2, p9

    .line 12
    iput-object v2, v0, Lq5/j;->k:Ly3/h;

    move-object v2, p10

    .line 13
    iput-object v2, v0, Lq5/j;->o:Lo5/s;

    move-object v2, p11

    .line 14
    iput-object v2, v0, Lq5/j;->n:Lo5/s;

    move-object v2, p12

    .line 15
    iput-object v2, v0, Lq5/j;->l:Lo5/e;

    move-object/from16 v2, p13

    .line 16
    iput-object v2, v0, Lq5/j;->m:Lo5/e;

    move-object/from16 v2, p14

    .line 17
    iput-object v2, v0, Lq5/j;->p:Lo5/f;

    move-object/from16 v2, p15

    .line 18
    iput-object v2, v0, Lq5/j;->s:Lcom/facebook/imagepipeline/bitmaps/PlatformBitmapFactory;

    .line 19
    new-instance v2, Lo5/d;

    invoke-direct {v2, v1}, Lo5/d;-><init>(I)V

    iput-object v2, v0, Lq5/j;->q:Lo5/d;

    .line 20
    new-instance v2, Lo5/d;

    invoke-direct {v2, v1}, Lo5/d;-><init>(I)V

    iput-object v2, v0, Lq5/j;->r:Lo5/d;

    move/from16 v1, p16

    .line 21
    iput v1, v0, Lq5/j;->t:I

    move/from16 v1, p17

    .line 22
    iput v1, v0, Lq5/j;->u:I

    move/from16 v1, p18

    .line 23
    iput-boolean v1, v0, Lq5/j;->v:Z

    move/from16 v1, p19

    .line 24
    iput v1, v0, Lq5/j;->x:I

    move-object/from16 v1, p20

    .line 25
    iput-object v1, v0, Lq5/j;->w:Lq5/a;

    move/from16 v1, p21

    .line 26
    iput-boolean v1, v0, Lq5/j;->y:Z

    return-void
.end method

.method public static a(Lcom/facebook/imagepipeline/producers/l0;)Lcom/facebook/imagepipeline/producers/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/producers/l0<",
            "Lu5/e;",
            ">;)",
            "Lcom/facebook/imagepipeline/producers/a;"
        }
    .end annotation

    new-instance v0, Lcom/facebook/imagepipeline/producers/a;

    invoke-direct {v0, p0}, Lcom/facebook/imagepipeline/producers/a;-><init>(Lcom/facebook/imagepipeline/producers/l0;)V

    return-object v0
.end method

.method public static h(Lcom/facebook/imagepipeline/producers/l0;Lcom/facebook/imagepipeline/producers/l0;)Lcom/facebook/imagepipeline/producers/k;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/producers/l0<",
            "Lu5/e;",
            ">;",
            "Lcom/facebook/imagepipeline/producers/l0<",
            "Lu5/e;",
            ">;)",
            "Lcom/facebook/imagepipeline/producers/k;"
        }
    .end annotation

    new-instance v0, Lcom/facebook/imagepipeline/producers/k;

    invoke-direct {v0, p0, p1}, Lcom/facebook/imagepipeline/producers/k;-><init>(Lcom/facebook/imagepipeline/producers/l0;Lcom/facebook/imagepipeline/producers/l0;)V

    return-object v0
.end method


# virtual methods
.method public A(Lcom/facebook/imagepipeline/producers/l0;)Lcom/facebook/imagepipeline/producers/j0;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/producers/l0<",
            "Lcom/facebook/common/references/CloseableReference<",
            "Lu5/c;",
            ">;>;)",
            "Lcom/facebook/imagepipeline/producers/j0;"
        }
    .end annotation

    new-instance v0, Lcom/facebook/imagepipeline/producers/j0;

    iget-object v1, p0, Lq5/j;->o:Lo5/s;

    iget-object v2, p0, Lq5/j;->p:Lo5/f;

    invoke-direct {v0, v1, v2, p1}, Lcom/facebook/imagepipeline/producers/j0;-><init>(Lo5/s;Lo5/f;Lcom/facebook/imagepipeline/producers/l0;)V

    return-object v0
.end method

.method public B(Lcom/facebook/imagepipeline/producers/l0;)Lcom/facebook/imagepipeline/producers/k0;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/producers/l0<",
            "Lcom/facebook/common/references/CloseableReference<",
            "Lu5/c;",
            ">;>;)",
            "Lcom/facebook/imagepipeline/producers/k0;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/facebook/imagepipeline/producers/k0;

    .line 2
    .line 3
    iget-object v1, p0, Lq5/j;->s:Lcom/facebook/imagepipeline/bitmaps/PlatformBitmapFactory;

    .line 4
    .line 5
    iget-object v2, p0, Lq5/j;->j:Lq5/e;

    .line 6
    .line 7
    invoke-interface {v2}, Lq5/e;->c()Ljava/util/concurrent/Executor;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-direct {v0, p1, v1, v2}, Lcom/facebook/imagepipeline/producers/k0;-><init>(Lcom/facebook/imagepipeline/producers/l0;Lcom/facebook/imagepipeline/bitmaps/PlatformBitmapFactory;Ljava/util/concurrent/Executor;)V

    .line 12
    .line 13
    .line 14
    return-object v0
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
.end method

.method public C()Lcom/facebook/imagepipeline/producers/p0;
    .locals 4

    .line 1
    new-instance v0, Lcom/facebook/imagepipeline/producers/p0;

    .line 2
    .line 3
    iget-object v1, p0, Lq5/j;->j:Lq5/e;

    .line 4
    .line 5
    invoke-interface {v1}, Lq5/e;->e()Ljava/util/concurrent/Executor;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, p0, Lq5/j;->k:Ly3/h;

    .line 10
    .line 11
    iget-object v3, p0, Lq5/j;->a:Landroid/content/ContentResolver;

    .line 12
    .line 13
    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/imagepipeline/producers/p0;-><init>(Ljava/util/concurrent/Executor;Ly3/h;Landroid/content/ContentResolver;)V

    .line 14
    .line 15
    .line 16
    return-object v0
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

.method public D(Lcom/facebook/imagepipeline/producers/l0;ZLa6/d;)Lcom/facebook/imagepipeline/producers/q0;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/producers/l0<",
            "Lu5/e;",
            ">;Z",
            "La6/d;",
            ")",
            "Lcom/facebook/imagepipeline/producers/q0;"
        }
    .end annotation

    .line 1
    new-instance v6, Lcom/facebook/imagepipeline/producers/q0;

    .line 2
    .line 3
    iget-object v0, p0, Lq5/j;->j:Lq5/e;

    .line 4
    .line 5
    invoke-interface {v0}, Lq5/e;->c()Ljava/util/concurrent/Executor;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, p0, Lq5/j;->k:Ly3/h;

    .line 10
    .line 11
    move-object v0, v6

    .line 12
    move-object v3, p1

    .line 13
    move v4, p2

    .line 14
    move-object v5, p3

    .line 15
    invoke-direct/range {v0 .. v5}, Lcom/facebook/imagepipeline/producers/q0;-><init>(Ljava/util/concurrent/Executor;Ly3/h;Lcom/facebook/imagepipeline/producers/l0;ZLa6/d;)V

    .line 16
    .line 17
    .line 18
    return-object v6
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
.end method

.method public E(Lcom/facebook/imagepipeline/producers/l0;)Lcom/facebook/imagepipeline/producers/t0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/facebook/imagepipeline/producers/l0<",
            "TT;>;)",
            "Lcom/facebook/imagepipeline/producers/t0<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lcom/facebook/imagepipeline/producers/t0;

    invoke-direct {v0, p1}, Lcom/facebook/imagepipeline/producers/t0;-><init>(Lcom/facebook/imagepipeline/producers/l0;)V

    return-object v0
.end method

.method public F(Lcom/facebook/imagepipeline/producers/l0;)Lcom/facebook/imagepipeline/producers/x0;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/facebook/imagepipeline/producers/l0<",
            "TT;>;)",
            "Lcom/facebook/imagepipeline/producers/x0<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/facebook/imagepipeline/producers/x0;

    .line 2
    .line 3
    iget-object v1, p0, Lq5/j;->j:Lq5/e;

    .line 4
    .line 5
    invoke-interface {v1}, Lq5/e;->b()Ljava/util/concurrent/Executor;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x5

    .line 10
    invoke-direct {v0, v2, v1, p1}, Lcom/facebook/imagepipeline/producers/x0;-><init>(ILjava/util/concurrent/Executor;Lcom/facebook/imagepipeline/producers/l0;)V

    .line 11
    .line 12
    .line 13
    return-object v0
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
.end method

.method public G([Lcom/facebook/imagepipeline/producers/z0;)Lcom/facebook/imagepipeline/producers/y0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lcom/facebook/imagepipeline/producers/z0<",
            "Lu5/e;",
            ">;)",
            "Lcom/facebook/imagepipeline/producers/y0;"
        }
    .end annotation

    new-instance v0, Lcom/facebook/imagepipeline/producers/y0;

    invoke-direct {v0, p1}, Lcom/facebook/imagepipeline/producers/y0;-><init>([Lcom/facebook/imagepipeline/producers/z0;)V

    return-object v0
.end method

.method public H(Lcom/facebook/imagepipeline/producers/l0;)Lcom/facebook/imagepipeline/producers/b1;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/producers/l0<",
            "Lu5/e;",
            ">;)",
            "Lcom/facebook/imagepipeline/producers/b1;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/facebook/imagepipeline/producers/b1;

    .line 2
    .line 3
    iget-object v1, p0, Lq5/j;->j:Lq5/e;

    .line 4
    .line 5
    invoke-interface {v1}, Lq5/e;->c()Ljava/util/concurrent/Executor;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, p0, Lq5/j;->k:Ly3/h;

    .line 10
    .line 11
    invoke-direct {v0, v1, v2, p1}, Lcom/facebook/imagepipeline/producers/b1;-><init>(Ljava/util/concurrent/Executor;Ly3/h;Lcom/facebook/imagepipeline/producers/l0;)V

    .line 12
    .line 13
    .line 14
    return-object v0
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
.end method

.method public b(Lcom/facebook/imagepipeline/producers/l0;Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/l0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/facebook/imagepipeline/producers/l0<",
            "TT;>;",
            "Lcom/facebook/imagepipeline/producers/v0;",
            ")",
            "Lcom/facebook/imagepipeline/producers/l0<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lcom/facebook/imagepipeline/producers/u0;

    invoke-direct {v0, p1, p2}, Lcom/facebook/imagepipeline/producers/u0;-><init>(Lcom/facebook/imagepipeline/producers/l0;Lcom/facebook/imagepipeline/producers/v0;)V

    return-object v0
.end method

.method public c(Lcom/facebook/imagepipeline/producers/l0;)Lcom/facebook/imagepipeline/producers/f;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/producers/l0<",
            "Lcom/facebook/common/references/CloseableReference<",
            "Lu5/c;",
            ">;>;)",
            "Lcom/facebook/imagepipeline/producers/f;"
        }
    .end annotation

    new-instance v0, Lcom/facebook/imagepipeline/producers/f;

    iget-object v1, p0, Lq5/j;->o:Lo5/s;

    iget-object v2, p0, Lq5/j;->p:Lo5/f;

    invoke-direct {v0, v1, v2, p1}, Lcom/facebook/imagepipeline/producers/f;-><init>(Lo5/s;Lo5/f;Lcom/facebook/imagepipeline/producers/l0;)V

    return-object v0
.end method

.method public d(Lcom/facebook/imagepipeline/producers/l0;)Lcom/facebook/imagepipeline/producers/g;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/producers/l0<",
            "Lcom/facebook/common/references/CloseableReference<",
            "Lu5/c;",
            ">;>;)",
            "Lcom/facebook/imagepipeline/producers/g;"
        }
    .end annotation

    new-instance v0, Lcom/facebook/imagepipeline/producers/g;

    iget-object v1, p0, Lq5/j;->p:Lo5/f;

    invoke-direct {v0, v1, p1}, Lcom/facebook/imagepipeline/producers/g;-><init>(Lo5/f;Lcom/facebook/imagepipeline/producers/l0;)V

    return-object v0
.end method

.method public e(Lcom/facebook/imagepipeline/producers/l0;)Lcom/facebook/imagepipeline/producers/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/producers/l0<",
            "Lcom/facebook/common/references/CloseableReference<",
            "Lu5/c;",
            ">;>;)",
            "Lcom/facebook/imagepipeline/producers/h;"
        }
    .end annotation

    new-instance v0, Lcom/facebook/imagepipeline/producers/h;

    iget-object v1, p0, Lq5/j;->o:Lo5/s;

    iget-object v2, p0, Lq5/j;->p:Lo5/f;

    invoke-direct {v0, v1, v2, p1}, Lcom/facebook/imagepipeline/producers/h;-><init>(Lo5/s;Lo5/f;Lcom/facebook/imagepipeline/producers/l0;)V

    return-object v0
.end method

.method public f(Lcom/facebook/imagepipeline/producers/l0;)Lcom/facebook/imagepipeline/producers/i;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/producers/l0<",
            "Lcom/facebook/common/references/CloseableReference<",
            "Lu5/c;",
            ">;>;)",
            "Lcom/facebook/imagepipeline/producers/i;"
        }
    .end annotation

    new-instance v0, Lcom/facebook/imagepipeline/producers/i;

    iget v1, p0, Lq5/j;->t:I

    iget v2, p0, Lq5/j;->u:I

    iget-boolean v3, p0, Lq5/j;->v:Z

    invoke-direct {v0, p1, v1, v2, v3}, Lcom/facebook/imagepipeline/producers/i;-><init>(Lcom/facebook/imagepipeline/producers/l0;IIZ)V

    return-object v0
.end method

.method public g(Lcom/facebook/imagepipeline/producers/l0;)Lcom/facebook/imagepipeline/producers/j;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/producers/l0<",
            "Lcom/facebook/common/references/CloseableReference<",
            "Lu5/c;",
            ">;>;)",
            "Lcom/facebook/imagepipeline/producers/j;"
        }
    .end annotation

    new-instance v8, Lcom/facebook/imagepipeline/producers/j;

    iget-object v1, p0, Lq5/j;->n:Lo5/s;

    iget-object v2, p0, Lq5/j;->l:Lo5/e;

    iget-object v3, p0, Lq5/j;->m:Lo5/e;

    iget-object v4, p0, Lq5/j;->p:Lo5/f;

    iget-object v5, p0, Lq5/j;->q:Lo5/d;

    iget-object v6, p0, Lq5/j;->r:Lo5/d;

    move-object v0, v8

    move-object v7, p1

    invoke-direct/range {v0 .. v7}, Lcom/facebook/imagepipeline/producers/j;-><init>(Lo5/s;Lo5/e;Lo5/e;Lo5/f;Lo5/d;Lo5/d;Lcom/facebook/imagepipeline/producers/l0;)V

    return-object v8
.end method

.method public i(Lcom/facebook/imagepipeline/producers/NetworkFetcher;)Lcom/facebook/imagepipeline/producers/l0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/producers/NetworkFetcher;",
            ")",
            "Lcom/facebook/imagepipeline/producers/l0<",
            "Lu5/e;",
            ">;"
        }
    .end annotation

    const/4 p1, 0x0

    return-object p1
.end method

.method public j()Lcom/facebook/imagepipeline/producers/l;
    .locals 2

    new-instance v0, Lcom/facebook/imagepipeline/producers/l;

    iget-object v1, p0, Lq5/j;->k:Ly3/h;

    invoke-direct {v0, v1}, Lcom/facebook/imagepipeline/producers/l;-><init>(Ly3/h;)V

    return-object v0
.end method

.method public k(Lcom/facebook/imagepipeline/producers/l0;)Lcom/facebook/imagepipeline/producers/m;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/producers/l0<",
            "Lu5/e;",
            ">;)",
            "Lcom/facebook/imagepipeline/producers/m;"
        }
    .end annotation

    .line 1
    new-instance v13, Lcom/facebook/imagepipeline/producers/m;

    .line 2
    .line 3
    iget-object v1, p0, Lq5/j;->d:Ly3/a;

    .line 4
    .line 5
    iget-object v0, p0, Lq5/j;->j:Lq5/e;

    .line 6
    .line 7
    invoke-interface {v0}, Lq5/e;->a()Ljava/util/concurrent/Executor;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    iget-object v3, p0, Lq5/j;->e:Ls5/c;

    .line 12
    .line 13
    iget-object v4, p0, Lq5/j;->f:Ls5/e;

    .line 14
    .line 15
    iget-boolean v5, p0, Lq5/j;->g:Z

    .line 16
    .line 17
    iget-boolean v6, p0, Lq5/j;->h:Z

    .line 18
    .line 19
    iget-boolean v7, p0, Lq5/j;->i:Z

    .line 20
    .line 21
    iget v9, p0, Lq5/j;->x:I

    .line 22
    .line 23
    iget-object v10, p0, Lq5/j;->w:Lq5/a;

    .line 24
    .line 25
    const/4 v11, 0x0

    .line 26
    sget-object v12, Lv3/m;->b:Lcom/facebook/common/internal/Supplier;

    .line 27
    .line 28
    move-object v0, v13

    .line 29
    move-object v8, p1

    .line 30
    invoke-direct/range {v0 .. v12}, Lcom/facebook/imagepipeline/producers/m;-><init>(Ly3/a;Ljava/util/concurrent/Executor;Ls5/c;Ls5/e;ZZZLcom/facebook/imagepipeline/producers/l0;ILq5/a;Ljava/lang/Runnable;Lcom/facebook/common/internal/Supplier;)V

    .line 31
    .line 32
    .line 33
    return-object v13
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

.method public l(Lcom/facebook/imagepipeline/producers/l0;)Lcom/facebook/imagepipeline/producers/n;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/producers/l0<",
            "Lcom/facebook/common/references/CloseableReference<",
            "Lu5/c;",
            ">;>;)",
            "Lcom/facebook/imagepipeline/producers/n;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/facebook/imagepipeline/producers/n;

    .line 2
    .line 3
    iget-object v1, p0, Lq5/j;->j:Lq5/e;

    .line 4
    .line 5
    invoke-interface {v1}, Lq5/e;->g()Ljava/util/concurrent/ScheduledExecutorService;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, p1, v1}, Lcom/facebook/imagepipeline/producers/n;-><init>(Lcom/facebook/imagepipeline/producers/l0;Ljava/util/concurrent/ScheduledExecutorService;)V

    .line 10
    .line 11
    .line 12
    return-object v0
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
.end method

.method public m(Lcom/facebook/imagepipeline/producers/l0;)Lcom/facebook/imagepipeline/producers/p;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/producers/l0<",
            "Lu5/e;",
            ">;)",
            "Lcom/facebook/imagepipeline/producers/p;"
        }
    .end annotation

    new-instance v0, Lcom/facebook/imagepipeline/producers/p;

    iget-object v1, p0, Lq5/j;->l:Lo5/e;

    iget-object v2, p0, Lq5/j;->m:Lo5/e;

    iget-object v3, p0, Lq5/j;->p:Lo5/f;

    invoke-direct {v0, v1, v2, v3, p1}, Lcom/facebook/imagepipeline/producers/p;-><init>(Lo5/e;Lo5/e;Lo5/f;Lcom/facebook/imagepipeline/producers/l0;)V

    return-object v0
.end method

.method public n(Lcom/facebook/imagepipeline/producers/l0;)Lcom/facebook/imagepipeline/producers/q;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/producers/l0<",
            "Lu5/e;",
            ">;)",
            "Lcom/facebook/imagepipeline/producers/q;"
        }
    .end annotation

    new-instance v0, Lcom/facebook/imagepipeline/producers/q;

    iget-object v1, p0, Lq5/j;->l:Lo5/e;

    iget-object v2, p0, Lq5/j;->m:Lo5/e;

    iget-object v3, p0, Lq5/j;->p:Lo5/f;

    invoke-direct {v0, v1, v2, v3, p1}, Lcom/facebook/imagepipeline/producers/q;-><init>(Lo5/e;Lo5/e;Lo5/f;Lcom/facebook/imagepipeline/producers/l0;)V

    return-object v0
.end method

.method public o(Lcom/facebook/imagepipeline/producers/l0;)Lcom/facebook/imagepipeline/producers/r;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/producers/l0<",
            "Lu5/e;",
            ">;)",
            "Lcom/facebook/imagepipeline/producers/r;"
        }
    .end annotation

    new-instance v0, Lcom/facebook/imagepipeline/producers/r;

    iget-object v1, p0, Lq5/j;->p:Lo5/f;

    iget-boolean v2, p0, Lq5/j;->y:Z

    invoke-direct {v0, v1, v2, p1}, Lcom/facebook/imagepipeline/producers/r;-><init>(Lo5/f;ZLcom/facebook/imagepipeline/producers/l0;)V

    return-object v0
.end method

.method public p(Lcom/facebook/imagepipeline/producers/l0;)Lcom/facebook/imagepipeline/producers/s;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/producers/l0<",
            "Lu5/e;",
            ">;)",
            "Lcom/facebook/imagepipeline/producers/s;"
        }
    .end annotation

    new-instance v0, Lcom/facebook/imagepipeline/producers/s;

    iget-object v1, p0, Lq5/j;->n:Lo5/s;

    iget-object v2, p0, Lq5/j;->p:Lo5/f;

    invoke-direct {v0, v1, v2, p1}, Lcom/facebook/imagepipeline/producers/s;-><init>(Lo5/s;Lo5/f;Lcom/facebook/imagepipeline/producers/l0;)V

    return-object v0
.end method

.method public q(Lcom/facebook/imagepipeline/producers/l0;)Lcom/facebook/imagepipeline/producers/t;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/producers/l0<",
            "Lu5/e;",
            ">;)",
            "Lcom/facebook/imagepipeline/producers/t;"
        }
    .end annotation

    new-instance v7, Lcom/facebook/imagepipeline/producers/t;

    iget-object v1, p0, Lq5/j;->l:Lo5/e;

    iget-object v2, p0, Lq5/j;->m:Lo5/e;

    iget-object v3, p0, Lq5/j;->p:Lo5/f;

    iget-object v4, p0, Lq5/j;->q:Lo5/d;

    iget-object v5, p0, Lq5/j;->r:Lo5/d;

    move-object v0, v7

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/facebook/imagepipeline/producers/t;-><init>(Lo5/e;Lo5/e;Lo5/f;Lo5/d;Lo5/d;Lcom/facebook/imagepipeline/producers/l0;)V

    return-object v7
.end method

.method public r()Lcom/facebook/imagepipeline/producers/z;
    .locals 4

    .line 1
    new-instance v0, Lcom/facebook/imagepipeline/producers/z;

    .line 2
    .line 3
    iget-object v1, p0, Lq5/j;->j:Lq5/e;

    .line 4
    .line 5
    invoke-interface {v1}, Lq5/e;->e()Ljava/util/concurrent/Executor;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, p0, Lq5/j;->k:Ly3/h;

    .line 10
    .line 11
    iget-object v3, p0, Lq5/j;->c:Landroid/content/res/AssetManager;

    .line 12
    .line 13
    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/imagepipeline/producers/z;-><init>(Ljava/util/concurrent/Executor;Ly3/h;Landroid/content/res/AssetManager;)V

    .line 14
    .line 15
    .line 16
    return-object v0
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

.method public s()Lcom/facebook/imagepipeline/producers/a0;
    .locals 4

    .line 1
    new-instance v0, Lcom/facebook/imagepipeline/producers/a0;

    .line 2
    .line 3
    iget-object v1, p0, Lq5/j;->j:Lq5/e;

    .line 4
    .line 5
    invoke-interface {v1}, Lq5/e;->e()Ljava/util/concurrent/Executor;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, p0, Lq5/j;->k:Ly3/h;

    .line 10
    .line 11
    iget-object v3, p0, Lq5/j;->a:Landroid/content/ContentResolver;

    .line 12
    .line 13
    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/imagepipeline/producers/a0;-><init>(Ljava/util/concurrent/Executor;Ly3/h;Landroid/content/ContentResolver;)V

    .line 14
    .line 15
    .line 16
    return-object v0
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

.method public t()Lcom/facebook/imagepipeline/producers/b0;
    .locals 4

    .line 1
    new-instance v0, Lcom/facebook/imagepipeline/producers/b0;

    .line 2
    .line 3
    iget-object v1, p0, Lq5/j;->j:Lq5/e;

    .line 4
    .line 5
    invoke-interface {v1}, Lq5/e;->e()Ljava/util/concurrent/Executor;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, p0, Lq5/j;->k:Ly3/h;

    .line 10
    .line 11
    iget-object v3, p0, Lq5/j;->a:Landroid/content/ContentResolver;

    .line 12
    .line 13
    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/imagepipeline/producers/b0;-><init>(Ljava/util/concurrent/Executor;Ly3/h;Landroid/content/ContentResolver;)V

    .line 14
    .line 15
    .line 16
    return-object v0
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

.method public u()Lcom/facebook/imagepipeline/producers/LocalExifThumbnailProducer;
    .locals 4

    .line 1
    new-instance v0, Lcom/facebook/imagepipeline/producers/LocalExifThumbnailProducer;

    .line 2
    .line 3
    iget-object v1, p0, Lq5/j;->j:Lq5/e;

    .line 4
    .line 5
    invoke-interface {v1}, Lq5/e;->f()Ljava/util/concurrent/Executor;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, p0, Lq5/j;->k:Ly3/h;

    .line 10
    .line 11
    iget-object v3, p0, Lq5/j;->a:Landroid/content/ContentResolver;

    .line 12
    .line 13
    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/imagepipeline/producers/LocalExifThumbnailProducer;-><init>(Ljava/util/concurrent/Executor;Ly3/h;Landroid/content/ContentResolver;)V

    .line 14
    .line 15
    .line 16
    return-object v0
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

.method public v()Lcom/facebook/imagepipeline/producers/d0;
    .locals 3

    .line 1
    new-instance v0, Lcom/facebook/imagepipeline/producers/d0;

    .line 2
    .line 3
    iget-object v1, p0, Lq5/j;->j:Lq5/e;

    .line 4
    .line 5
    invoke-interface {v1}, Lq5/e;->e()Ljava/util/concurrent/Executor;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, p0, Lq5/j;->k:Ly3/h;

    .line 10
    .line 11
    invoke-direct {v0, v1, v2}, Lcom/facebook/imagepipeline/producers/d0;-><init>(Ljava/util/concurrent/Executor;Ly3/h;)V

    .line 12
    .line 13
    .line 14
    return-object v0
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
.end method

.method public w()Lcom/facebook/imagepipeline/producers/e0;
    .locals 4

    .line 1
    new-instance v0, Lcom/facebook/imagepipeline/producers/e0;

    .line 2
    .line 3
    iget-object v1, p0, Lq5/j;->j:Lq5/e;

    .line 4
    .line 5
    invoke-interface {v1}, Lq5/e;->e()Ljava/util/concurrent/Executor;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, p0, Lq5/j;->k:Ly3/h;

    .line 10
    .line 11
    iget-object v3, p0, Lq5/j;->b:Landroid/content/res/Resources;

    .line 12
    .line 13
    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/imagepipeline/producers/e0;-><init>(Ljava/util/concurrent/Executor;Ly3/h;Landroid/content/res/Resources;)V

    .line 14
    .line 15
    .line 16
    return-object v0
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

.method public x()Lcom/facebook/imagepipeline/producers/f0;
    .locals 3

    .line 1
    new-instance v0, Lcom/facebook/imagepipeline/producers/f0;

    .line 2
    .line 3
    iget-object v1, p0, Lq5/j;->j:Lq5/e;

    .line 4
    .line 5
    invoke-interface {v1}, Lq5/e;->e()Ljava/util/concurrent/Executor;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, p0, Lq5/j;->a:Landroid/content/ContentResolver;

    .line 10
    .line 11
    invoke-direct {v0, v1, v2}, Lcom/facebook/imagepipeline/producers/f0;-><init>(Ljava/util/concurrent/Executor;Landroid/content/ContentResolver;)V

    .line 12
    .line 13
    .line 14
    return-object v0
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
.end method

.method public y(Lcom/facebook/imagepipeline/producers/NetworkFetcher;)Lcom/facebook/imagepipeline/producers/l0;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/producers/NetworkFetcher;",
            ")",
            "Lcom/facebook/imagepipeline/producers/l0<",
            "Lu5/e;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/facebook/imagepipeline/producers/h0;

    iget-object v1, p0, Lq5/j;->k:Ly3/h;

    iget-object v2, p0, Lq5/j;->d:Ly3/a;

    invoke-direct {v0, v1, v2, p1}, Lcom/facebook/imagepipeline/producers/h0;-><init>(Ly3/h;Ly3/a;Lcom/facebook/imagepipeline/producers/NetworkFetcher;)V

    return-object v0
.end method

.method public z(Lcom/facebook/imagepipeline/producers/l0;)Lcom/facebook/imagepipeline/producers/i0;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/producers/l0<",
            "Lu5/e;",
            ">;)",
            "Lcom/facebook/imagepipeline/producers/i0;"
        }
    .end annotation

    new-instance v6, Lcom/facebook/imagepipeline/producers/i0;

    iget-object v1, p0, Lq5/j;->l:Lo5/e;

    iget-object v2, p0, Lq5/j;->p:Lo5/f;

    iget-object v3, p0, Lq5/j;->k:Ly3/h;

    iget-object v4, p0, Lq5/j;->d:Ly3/a;

    move-object v0, v6

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Lcom/facebook/imagepipeline/producers/i0;-><init>(Lo5/e;Lo5/f;Ly3/h;Ly3/a;Lcom/facebook/imagepipeline/producers/l0;)V

    return-object v6
.end method
