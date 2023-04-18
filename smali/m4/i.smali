.class public Lm4/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private A:Ljava/lang/String;

.field private B:Lf5/b$a;

.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Lcom/facebook/imagepipeline/request/ImageRequest;

.field private d:Ljava/lang/Object;

.field private e:Lcom/facebook/imagepipeline/image/ImageInfo;

.field private f:Lcom/facebook/imagepipeline/request/ImageRequest;

.field private g:Lcom/facebook/imagepipeline/request/ImageRequest;

.field private h:[Lcom/facebook/imagepipeline/request/ImageRequest;

.field private i:J

.field private j:J

.field private k:J

.field private l:J

.field private m:J

.field private n:J

.field private o:J

.field private p:I

.field private q:Ljava/lang/String;

.field private r:Z

.field private s:I

.field private t:I

.field private u:Ljava/lang/Throwable;

.field private v:I

.field private w:I

.field private x:J

.field private y:J

.field private z:J


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, -0x1

    .line 5
    .line 6
    iput-wide v0, p0, Lm4/i;->i:J

    .line 7
    .line 8
    iput-wide v0, p0, Lm4/i;->j:J

    .line 9
    .line 10
    iput-wide v0, p0, Lm4/i;->k:J

    .line 11
    .line 12
    iput-wide v0, p0, Lm4/i;->l:J

    .line 13
    .line 14
    iput-wide v0, p0, Lm4/i;->m:J

    .line 15
    .line 16
    iput-wide v0, p0, Lm4/i;->n:J

    .line 17
    .line 18
    iput-wide v0, p0, Lm4/i;->o:J

    .line 19
    .line 20
    const/4 v2, 0x1

    .line 21
    iput v2, p0, Lm4/i;->p:I

    .line 22
    .line 23
    const/4 v2, -0x1

    .line 24
    iput v2, p0, Lm4/i;->s:I

    .line 25
    .line 26
    iput v2, p0, Lm4/i;->t:I

    .line 27
    .line 28
    iput v2, p0, Lm4/i;->v:I

    .line 29
    .line 30
    iput v2, p0, Lm4/i;->w:I

    .line 31
    .line 32
    iput-wide v0, p0, Lm4/i;->x:J

    .line 33
    .line 34
    iput-wide v0, p0, Lm4/i;->y:J

    .line 35
    .line 36
    iput-wide v0, p0, Lm4/i;->z:J

    .line 37
    .line 38
    return-void
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
.method public A(Z)V
    .locals 0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x2

    :goto_0
    iput p1, p0, Lm4/i;->w:I

    return-void
.end method

.method public B()Lm4/e;
    .locals 43

    move-object/from16 v0, p0

    new-instance v40, Lm4/e;

    move-object/from16 v1, v40

    iget-object v2, v0, Lm4/i;->a:Ljava/lang/String;

    iget-object v3, v0, Lm4/i;->b:Ljava/lang/String;

    iget-object v4, v0, Lm4/i;->c:Lcom/facebook/imagepipeline/request/ImageRequest;

    iget-object v5, v0, Lm4/i;->d:Ljava/lang/Object;

    iget-object v6, v0, Lm4/i;->e:Lcom/facebook/imagepipeline/image/ImageInfo;

    iget-object v7, v0, Lm4/i;->f:Lcom/facebook/imagepipeline/request/ImageRequest;

    iget-object v8, v0, Lm4/i;->g:Lcom/facebook/imagepipeline/request/ImageRequest;

    iget-object v9, v0, Lm4/i;->h:[Lcom/facebook/imagepipeline/request/ImageRequest;

    iget-wide v10, v0, Lm4/i;->i:J

    iget-wide v12, v0, Lm4/i;->j:J

    iget-wide v14, v0, Lm4/i;->k:J

    move-object/from16 v41, v1

    move-object/from16 v42, v2

    iget-wide v1, v0, Lm4/i;->l:J

    move-wide/from16 v16, v1

    iget-wide v1, v0, Lm4/i;->m:J

    move-wide/from16 v18, v1

    iget-wide v1, v0, Lm4/i;->n:J

    move-wide/from16 v20, v1

    iget-wide v1, v0, Lm4/i;->o:J

    move-wide/from16 v22, v1

    iget v1, v0, Lm4/i;->p:I

    move/from16 v24, v1

    iget-object v1, v0, Lm4/i;->q:Ljava/lang/String;

    move-object/from16 v25, v1

    iget-boolean v1, v0, Lm4/i;->r:Z

    move/from16 v26, v1

    iget v1, v0, Lm4/i;->s:I

    move/from16 v27, v1

    iget v1, v0, Lm4/i;->t:I

    move/from16 v28, v1

    iget-object v1, v0, Lm4/i;->u:Ljava/lang/Throwable;

    move-object/from16 v29, v1

    iget v1, v0, Lm4/i;->w:I

    move/from16 v30, v1

    iget-wide v1, v0, Lm4/i;->x:J

    move-wide/from16 v31, v1

    iget-wide v1, v0, Lm4/i;->y:J

    move-wide/from16 v33, v1

    iget-object v1, v0, Lm4/i;->A:Ljava/lang/String;

    move-object/from16 v35, v1

    iget-wide v1, v0, Lm4/i;->z:J

    move-wide/from16 v36, v1

    const/16 v38, 0x0

    iget-object v1, v0, Lm4/i;->B:Lf5/b$a;

    move-object/from16 v39, v1

    move-object/from16 v1, v41

    move-object/from16 v2, v42

    invoke-direct/range {v1 .. v39}, Lm4/e;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/imagepipeline/request/ImageRequest;Ljava/lang/Object;Lcom/facebook/imagepipeline/image/ImageInfo;Lcom/facebook/imagepipeline/request/ImageRequest;Lcom/facebook/imagepipeline/request/ImageRequest;[Lcom/facebook/imagepipeline/request/ImageRequest;JJJJJJJILjava/lang/String;ZIILjava/lang/Throwable;IJJLjava/lang/String;JLf5/c;Lf5/b$a;)V

    return-object v40
.end method

.method public a()I
    .locals 1

    iget v0, p0, Lm4/i;->v:I

    return v0
.end method

.method public b()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lm4/i;->b:Ljava/lang/String;

    .line 3
    .line 4
    iput-object v0, p0, Lm4/i;->c:Lcom/facebook/imagepipeline/request/ImageRequest;

    .line 5
    .line 6
    iput-object v0, p0, Lm4/i;->d:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object v0, p0, Lm4/i;->e:Lcom/facebook/imagepipeline/image/ImageInfo;

    .line 9
    .line 10
    iput-object v0, p0, Lm4/i;->f:Lcom/facebook/imagepipeline/request/ImageRequest;

    .line 11
    .line 12
    iput-object v0, p0, Lm4/i;->g:Lcom/facebook/imagepipeline/request/ImageRequest;

    .line 13
    .line 14
    iput-object v0, p0, Lm4/i;->h:[Lcom/facebook/imagepipeline/request/ImageRequest;

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    iput v1, p0, Lm4/i;->p:I

    .line 18
    .line 19
    iput-object v0, p0, Lm4/i;->q:Ljava/lang/String;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    iput-boolean v1, p0, Lm4/i;->r:Z

    .line 23
    .line 24
    const/4 v1, -0x1

    .line 25
    iput v1, p0, Lm4/i;->s:I

    .line 26
    .line 27
    iput v1, p0, Lm4/i;->t:I

    .line 28
    .line 29
    iput-object v0, p0, Lm4/i;->u:Ljava/lang/Throwable;

    .line 30
    .line 31
    iput v1, p0, Lm4/i;->v:I

    .line 32
    .line 33
    iput v1, p0, Lm4/i;->w:I

    .line 34
    .line 35
    iput-object v0, p0, Lm4/i;->A:Ljava/lang/String;

    .line 36
    .line 37
    iput-object v0, p0, Lm4/i;->B:Lf5/b$a;

    .line 38
    .line 39
    invoke-virtual {p0}, Lm4/i;->c()V

    .line 40
    .line 41
    .line 42
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
.end method

.method public c()V
    .locals 2

    .line 1
    const-wide/16 v0, -0x1

    .line 2
    .line 3
    iput-wide v0, p0, Lm4/i;->n:J

    .line 4
    .line 5
    iput-wide v0, p0, Lm4/i;->o:J

    .line 6
    .line 7
    iput-wide v0, p0, Lm4/i;->i:J

    .line 8
    .line 9
    iput-wide v0, p0, Lm4/i;->k:J

    .line 10
    .line 11
    iput-wide v0, p0, Lm4/i;->l:J

    .line 12
    .line 13
    iput-wide v0, p0, Lm4/i;->m:J

    .line 14
    .line 15
    iput-wide v0, p0, Lm4/i;->x:J

    .line 16
    .line 17
    iput-wide v0, p0, Lm4/i;->y:J

    .line 18
    .line 19
    iput-wide v0, p0, Lm4/i;->z:J

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
.end method

.method public d(Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lm4/i;->d:Ljava/lang/Object;

    return-void
.end method

.method public e(J)V
    .locals 0

    iput-wide p1, p0, Lm4/i;->m:J

    return-void
.end method

.method public f(J)V
    .locals 0

    iput-wide p1, p0, Lm4/i;->l:J

    return-void
.end method

.method public g(J)V
    .locals 0

    iput-wide p1, p0, Lm4/i;->k:J

    return-void
.end method

.method public h(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lm4/i;->a:Ljava/lang/String;

    return-void
.end method

.method public i(Lcom/facebook/imagepipeline/request/ImageRequest;Lcom/facebook/imagepipeline/request/ImageRequest;[Lcom/facebook/imagepipeline/request/ImageRequest;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lm4/i;->f:Lcom/facebook/imagepipeline/request/ImageRequest;

    .line 2
    .line 3
    iput-object p2, p0, Lm4/i;->g:Lcom/facebook/imagepipeline/request/ImageRequest;

    .line 4
    .line 5
    iput-object p3, p0, Lm4/i;->h:[Lcom/facebook/imagepipeline/request/ImageRequest;

    .line 6
    .line 7
    return-void
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

.method public j(J)V
    .locals 0

    iput-wide p1, p0, Lm4/i;->j:J

    return-void
.end method

.method public k(J)V
    .locals 0

    iput-wide p1, p0, Lm4/i;->i:J

    return-void
.end method

.method public l(Ljava/lang/Throwable;)V
    .locals 0

    iput-object p1, p0, Lm4/i;->u:Ljava/lang/Throwable;

    return-void
.end method

.method public m(Lf5/b$a;)V
    .locals 0

    iput-object p1, p0, Lm4/i;->B:Lf5/b$a;

    return-void
.end method

.method public n(Lcom/facebook/imagepipeline/image/ImageInfo;)V
    .locals 0

    iput-object p1, p0, Lm4/i;->e:Lcom/facebook/imagepipeline/image/ImageInfo;

    return-void
.end method

.method public o(I)V
    .locals 0

    iput p1, p0, Lm4/i;->v:I

    return-void
.end method

.method public p(I)V
    .locals 0

    iput p1, p0, Lm4/i;->p:I

    return-void
.end method

.method public q(Lcom/facebook/imagepipeline/request/ImageRequest;)V
    .locals 0

    iput-object p1, p0, Lm4/i;->c:Lcom/facebook/imagepipeline/request/ImageRequest;

    return-void
.end method

.method public r(J)V
    .locals 0

    iput-wide p1, p0, Lm4/i;->o:J

    return-void
.end method

.method public s(J)V
    .locals 0

    iput-wide p1, p0, Lm4/i;->n:J

    return-void
.end method

.method public t(J)V
    .locals 0

    iput-wide p1, p0, Lm4/i;->y:J

    return-void
.end method

.method public u(I)V
    .locals 0

    iput p1, p0, Lm4/i;->t:I

    return-void
.end method

.method public v(I)V
    .locals 0

    iput p1, p0, Lm4/i;->s:I

    return-void
.end method

.method public w(Z)V
    .locals 0

    iput-boolean p1, p0, Lm4/i;->r:Z

    return-void
.end method

.method public x(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lm4/i;->b:Ljava/lang/String;

    return-void
.end method

.method public y(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lm4/i;->q:Ljava/lang/String;

    return-void
.end method

.method public z(J)V
    .locals 0

    iput-wide p1, p0, Lm4/i;->x:J

    return-void
.end method
