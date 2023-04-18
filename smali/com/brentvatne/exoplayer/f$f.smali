.class Lcom/brentvatne/exoplayer/f$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/brentvatne/exoplayer/f;->n0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic k:Lcom/brentvatne/exoplayer/f;

.field final synthetic l:Lcom/brentvatne/exoplayer/f;


# direct methods
.method constructor <init>(Lcom/brentvatne/exoplayer/f;Lcom/brentvatne/exoplayer/f;)V
    .locals 0

    iput-object p1, p0, Lcom/brentvatne/exoplayer/f$f;->l:Lcom/brentvatne/exoplayer/f;

    iput-object p2, p0, Lcom/brentvatne/exoplayer/f$f;->k:Lcom/brentvatne/exoplayer/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/brentvatne/exoplayer/f$f;->l:Lcom/brentvatne/exoplayer/f;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/brentvatne/exoplayer/f;->a(Lcom/brentvatne/exoplayer/f;)Lcom/google/android/exoplayer2/SimpleExoPlayer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, -0x1

    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v3, 0x1

    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    new-instance v0, La9/a$b;

    .line 13
    .line 14
    invoke-direct {v0}, La9/a$b;-><init>()V

    .line 15
    .line 16
    .line 17
    iget-object v4, p0, Lcom/brentvatne/exoplayer/f$f;->l:Lcom/brentvatne/exoplayer/f;

    .line 18
    .line 19
    new-instance v5, La9/f;

    .line 20
    .line 21
    invoke-direct {v5, v0}, La9/f;-><init>(La9/h$b;)V

    .line 22
    .line 23
    .line 24
    invoke-static {v4, v5}, Lcom/brentvatne/exoplayer/f;->R(Lcom/brentvatne/exoplayer/f;La9/f;)La9/f;

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lcom/brentvatne/exoplayer/f$f;->l:Lcom/brentvatne/exoplayer/f;

    .line 28
    .line 29
    invoke-static {v0}, Lcom/brentvatne/exoplayer/f;->Q(Lcom/brentvatne/exoplayer/f;)La9/f;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget-object v4, p0, Lcom/brentvatne/exoplayer/f$f;->l:Lcom/brentvatne/exoplayer/f;

    .line 34
    .line 35
    invoke-static {v4}, Lcom/brentvatne/exoplayer/f;->Q(Lcom/brentvatne/exoplayer/f;)La9/f;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    invoke-virtual {v4}, La9/f;->o()La9/f$e;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    iget-object v5, p0, Lcom/brentvatne/exoplayer/f$f;->l:Lcom/brentvatne/exoplayer/f;

    .line 44
    .line 45
    invoke-static {v5}, Lcom/brentvatne/exoplayer/f;->S(Lcom/brentvatne/exoplayer/f;)I

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    if-nez v5, :cond_0

    .line 50
    .line 51
    const v5, 0x7fffffff

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    iget-object v5, p0, Lcom/brentvatne/exoplayer/f$f;->l:Lcom/brentvatne/exoplayer/f;

    .line 56
    .line 57
    invoke-static {v5}, Lcom/brentvatne/exoplayer/f;->S(Lcom/brentvatne/exoplayer/f;)I

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    :goto_0
    invoke-virtual {v4, v5}, La9/f$e;->g(I)La9/f$e;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    invoke-virtual {v0, v4}, La9/f;->N(La9/f$e;)V

    .line 66
    .line 67
    .line 68
    new-instance v0, Ld9/n;

    .line 69
    .line 70
    const/high16 v4, 0x10000

    .line 71
    .line 72
    invoke-direct {v0, v3, v4}, Ld9/n;-><init>(ZI)V

    .line 73
    .line 74
    .line 75
    new-instance v4, Ld7/e$a;

    .line 76
    .line 77
    invoke-direct {v4}, Ld7/e$a;-><init>()V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v4, v0}, Ld7/e$a;->c(Ld9/n;)Ld7/e$a;

    .line 81
    .line 82
    .line 83
    iget-object v0, p0, Lcom/brentvatne/exoplayer/f$f;->l:Lcom/brentvatne/exoplayer/f;

    .line 84
    .line 85
    invoke-static {v0}, Lcom/brentvatne/exoplayer/f;->T(Lcom/brentvatne/exoplayer/f;)I

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    iget-object v5, p0, Lcom/brentvatne/exoplayer/f$f;->l:Lcom/brentvatne/exoplayer/f;

    .line 90
    .line 91
    invoke-static {v5}, Lcom/brentvatne/exoplayer/f;->f(Lcom/brentvatne/exoplayer/f;)I

    .line 92
    .line 93
    .line 94
    move-result v5

    .line 95
    iget-object v6, p0, Lcom/brentvatne/exoplayer/f$f;->l:Lcom/brentvatne/exoplayer/f;

    .line 96
    .line 97
    invoke-static {v6}, Lcom/brentvatne/exoplayer/f;->i(Lcom/brentvatne/exoplayer/f;)I

    .line 98
    .line 99
    .line 100
    move-result v6

    .line 101
    iget-object v7, p0, Lcom/brentvatne/exoplayer/f$f;->l:Lcom/brentvatne/exoplayer/f;

    .line 102
    .line 103
    invoke-static {v7}, Lcom/brentvatne/exoplayer/f;->j(Lcom/brentvatne/exoplayer/f;)I

    .line 104
    .line 105
    .line 106
    move-result v7

    .line 107
    invoke-virtual {v4, v0, v5, v6, v7}, Ld7/e$a;->d(IIII)Ld7/e$a;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v4, v1}, Ld7/e$a;->f(I)Ld7/e$a;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v4, v3}, Ld7/e$a;->e(Z)Ld7/e$a;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v4}, Ld7/e$a;->b()Ld7/e;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    new-instance v4, Ld7/f;

    .line 121
    .line 122
    iget-object v5, p0, Lcom/brentvatne/exoplayer/f$f;->l:Lcom/brentvatne/exoplayer/f;

    .line 123
    .line 124
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 125
    .line 126
    .line 127
    move-result-object v5

    .line 128
    invoke-direct {v4, v5}, Ld7/f;-><init>(Landroid/content/Context;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v4, v2}, Ld7/f;->i(I)Ld7/f;

    .line 132
    .line 133
    .line 134
    move-result-object v4

    .line 135
    iget-object v5, p0, Lcom/brentvatne/exoplayer/f$f;->l:Lcom/brentvatne/exoplayer/f;

    .line 136
    .line 137
    new-instance v6, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;

    .line 138
    .line 139
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 140
    .line 141
    .line 142
    move-result-object v7

    .line 143
    invoke-direct {v6, v7, v4}, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;-><init>(Landroid/content/Context;Ld7/v;)V

    .line 144
    .line 145
    .line 146
    iget-object v4, p0, Lcom/brentvatne/exoplayer/f$f;->l:Lcom/brentvatne/exoplayer/f;

    .line 147
    .line 148
    invoke-static {v4}, Lcom/brentvatne/exoplayer/f;->Q(Lcom/brentvatne/exoplayer/f;)La9/f;

    .line 149
    .line 150
    .line 151
    move-result-object v4

    .line 152
    invoke-virtual {v6, v4}, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;->z(La9/m;)Lcom/google/android/exoplayer2/SimpleExoPlayer$b;

    .line 153
    .line 154
    .line 155
    move-result-object v4

    .line 156
    iget-object v6, p0, Lcom/brentvatne/exoplayer/f$f;->l:Lcom/brentvatne/exoplayer/f;

    .line 157
    .line 158
    invoke-static {v6}, Lcom/brentvatne/exoplayer/f;->k(Lcom/brentvatne/exoplayer/f;)Ld9/o;

    .line 159
    .line 160
    .line 161
    move-result-object v6

    .line 162
    invoke-virtual {v4, v6}, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;->x(Ld9/e;)Lcom/google/android/exoplayer2/SimpleExoPlayer$b;

    .line 163
    .line 164
    .line 165
    move-result-object v4

    .line 166
    invoke-virtual {v4, v0}, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;->y(Ld7/n;)Lcom/google/android/exoplayer2/SimpleExoPlayer$b;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;->w()Lcom/google/android/exoplayer2/SimpleExoPlayer;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    invoke-static {v5, v0}, Lcom/brentvatne/exoplayer/f;->c(Lcom/brentvatne/exoplayer/f;Lcom/google/android/exoplayer2/SimpleExoPlayer;)Lcom/google/android/exoplayer2/SimpleExoPlayer;

    .line 175
    .line 176
    .line 177
    iget-object v0, p0, Lcom/brentvatne/exoplayer/f$f;->l:Lcom/brentvatne/exoplayer/f;

    .line 178
    .line 179
    invoke-static {v0}, Lcom/brentvatne/exoplayer/f;->a(Lcom/brentvatne/exoplayer/f;)Lcom/google/android/exoplayer2/SimpleExoPlayer;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    iget-object v4, p0, Lcom/brentvatne/exoplayer/f$f;->k:Lcom/brentvatne/exoplayer/f;

    .line 184
    .line 185
    invoke-virtual {v0, v4}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->o(Lcom/google/android/exoplayer2/Player$a;)V

    .line 186
    .line 187
    .line 188
    iget-object v0, p0, Lcom/brentvatne/exoplayer/f$f;->l:Lcom/brentvatne/exoplayer/f;

    .line 189
    .line 190
    invoke-static {v0}, Lcom/brentvatne/exoplayer/f;->a(Lcom/brentvatne/exoplayer/f;)Lcom/google/android/exoplayer2/SimpleExoPlayer;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    iget-object v4, p0, Lcom/brentvatne/exoplayer/f$f;->k:Lcom/brentvatne/exoplayer/f;

    .line 195
    .line 196
    invoke-virtual {v0, v4}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->E0(Ly7/f;)V

    .line 197
    .line 198
    .line 199
    iget-object v0, p0, Lcom/brentvatne/exoplayer/f$f;->l:Lcom/brentvatne/exoplayer/f;

    .line 200
    .line 201
    invoke-static {v0}, Lcom/brentvatne/exoplayer/f;->l(Lcom/brentvatne/exoplayer/f;)Lcom/brentvatne/exoplayer/d;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    iget-object v4, p0, Lcom/brentvatne/exoplayer/f$f;->l:Lcom/brentvatne/exoplayer/f;

    .line 206
    .line 207
    invoke-static {v4}, Lcom/brentvatne/exoplayer/f;->a(Lcom/brentvatne/exoplayer/f;)Lcom/google/android/exoplayer2/SimpleExoPlayer;

    .line 208
    .line 209
    .line 210
    move-result-object v4

    .line 211
    invoke-virtual {v0, v4}, Lcom/brentvatne/exoplayer/d;->setPlayer(Lcom/google/android/exoplayer2/SimpleExoPlayer;)V

    .line 212
    .line 213
    .line 214
    iget-object v0, p0, Lcom/brentvatne/exoplayer/f$f;->l:Lcom/brentvatne/exoplayer/f;

    .line 215
    .line 216
    invoke-static {v0}, Lcom/brentvatne/exoplayer/f;->n(Lcom/brentvatne/exoplayer/f;)Lz2/a;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    iget-object v4, p0, Lcom/brentvatne/exoplayer/f$f;->k:Lcom/brentvatne/exoplayer/f;

    .line 221
    .line 222
    invoke-virtual {v0, v4}, Lz2/a;->b(Lz2/b;)V

    .line 223
    .line 224
    .line 225
    iget-object v0, p0, Lcom/brentvatne/exoplayer/f$f;->l:Lcom/brentvatne/exoplayer/f;

    .line 226
    .line 227
    invoke-static {v0}, Lcom/brentvatne/exoplayer/f;->k(Lcom/brentvatne/exoplayer/f;)Ld9/o;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    new-instance v4, Landroid/os/Handler;

    .line 232
    .line 233
    invoke-direct {v4}, Landroid/os/Handler;-><init>()V

    .line 234
    .line 235
    .line 236
    iget-object v5, p0, Lcom/brentvatne/exoplayer/f$f;->k:Lcom/brentvatne/exoplayer/f;

    .line 237
    .line 238
    invoke-virtual {v0, v4, v5}, Ld9/o;->e(Landroid/os/Handler;Ld9/e$a;)V

    .line 239
    .line 240
    .line 241
    iget-object v0, p0, Lcom/brentvatne/exoplayer/f$f;->l:Lcom/brentvatne/exoplayer/f;

    .line 242
    .line 243
    invoke-static {v0}, Lcom/brentvatne/exoplayer/f;->p(Lcom/brentvatne/exoplayer/f;)Z

    .line 244
    .line 245
    .line 246
    move-result v4

    .line 247
    xor-int/2addr v4, v3

    .line 248
    invoke-static {v0, v4}, Lcom/brentvatne/exoplayer/f;->q(Lcom/brentvatne/exoplayer/f;Z)V

    .line 249
    .line 250
    .line 251
    iget-object v0, p0, Lcom/brentvatne/exoplayer/f$f;->l:Lcom/brentvatne/exoplayer/f;

    .line 252
    .line 253
    invoke-static {v0, v3}, Lcom/brentvatne/exoplayer/f;->s(Lcom/brentvatne/exoplayer/f;Z)Z

    .line 254
    .line 255
    .line 256
    new-instance v0, Lcom/google/android/exoplayer2/PlaybackParameters;

    .line 257
    .line 258
    iget-object v4, p0, Lcom/brentvatne/exoplayer/f$f;->l:Lcom/brentvatne/exoplayer/f;

    .line 259
    .line 260
    invoke-static {v4}, Lcom/brentvatne/exoplayer/f;->t(Lcom/brentvatne/exoplayer/f;)F

    .line 261
    .line 262
    .line 263
    move-result v4

    .line 264
    const/high16 v5, 0x3f800000    # 1.0f

    .line 265
    .line 266
    invoke-direct {v0, v4, v5}, Lcom/google/android/exoplayer2/PlaybackParameters;-><init>(FF)V

    .line 267
    .line 268
    .line 269
    iget-object v4, p0, Lcom/brentvatne/exoplayer/f$f;->l:Lcom/brentvatne/exoplayer/f;

    .line 270
    .line 271
    invoke-static {v4}, Lcom/brentvatne/exoplayer/f;->a(Lcom/brentvatne/exoplayer/f;)Lcom/google/android/exoplayer2/SimpleExoPlayer;

    .line 272
    .line 273
    .line 274
    move-result-object v4

    .line 275
    invoke-virtual {v4, v0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->Y0(Lcom/google/android/exoplayer2/PlaybackParameters;)V

    .line 276
    .line 277
    .line 278
    :cond_1
    iget-object v0, p0, Lcom/brentvatne/exoplayer/f$f;->l:Lcom/brentvatne/exoplayer/f;

    .line 279
    .line 280
    invoke-static {v0}, Lcom/brentvatne/exoplayer/f;->r(Lcom/brentvatne/exoplayer/f;)Z

    .line 281
    .line 282
    .line 283
    move-result v0

    .line 284
    if-eqz v0, :cond_8

    .line 285
    .line 286
    iget-object v0, p0, Lcom/brentvatne/exoplayer/f$f;->l:Lcom/brentvatne/exoplayer/f;

    .line 287
    .line 288
    invoke-static {v0}, Lcom/brentvatne/exoplayer/f;->v(Lcom/brentvatne/exoplayer/f;)Landroid/net/Uri;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    if-eqz v0, :cond_8

    .line 293
    .line 294
    iget-object v0, p0, Lcom/brentvatne/exoplayer/f$f;->l:Lcom/brentvatne/exoplayer/f;

    .line 295
    .line 296
    invoke-static {v0}, Lcom/brentvatne/exoplayer/f;->l(Lcom/brentvatne/exoplayer/f;)Lcom/brentvatne/exoplayer/d;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    invoke-virtual {v0}, Lcom/brentvatne/exoplayer/d;->g()V

    .line 301
    .line 302
    .line 303
    iget-object v0, p0, Lcom/brentvatne/exoplayer/f$f;->k:Lcom/brentvatne/exoplayer/f;

    .line 304
    .line 305
    invoke-static {v0}, Lcom/brentvatne/exoplayer/f;->w(Lcom/brentvatne/exoplayer/f;)Ljava/util/UUID;

    .line 306
    .line 307
    .line 308
    move-result-object v0

    .line 309
    if-eqz v0, :cond_4

    .line 310
    .line 311
    :try_start_0
    iget-object v0, p0, Lcom/brentvatne/exoplayer/f$f;->l:Lcom/brentvatne/exoplayer/f;

    .line 312
    .line 313
    iget-object v4, p0, Lcom/brentvatne/exoplayer/f$f;->k:Lcom/brentvatne/exoplayer/f;

    .line 314
    .line 315
    invoke-static {v4}, Lcom/brentvatne/exoplayer/f;->w(Lcom/brentvatne/exoplayer/f;)Ljava/util/UUID;

    .line 316
    .line 317
    .line 318
    move-result-object v4

    .line 319
    iget-object v5, p0, Lcom/brentvatne/exoplayer/f$f;->k:Lcom/brentvatne/exoplayer/f;

    .line 320
    .line 321
    invoke-static {v5}, Lcom/brentvatne/exoplayer/f;->z(Lcom/brentvatne/exoplayer/f;)Ljava/lang/String;

    .line 322
    .line 323
    .line 324
    move-result-object v5

    .line 325
    iget-object v6, p0, Lcom/brentvatne/exoplayer/f$f;->k:Lcom/brentvatne/exoplayer/f;

    .line 326
    .line 327
    invoke-static {v6}, Lcom/brentvatne/exoplayer/f;->A(Lcom/brentvatne/exoplayer/f;)[Ljava/lang/String;

    .line 328
    .line 329
    .line 330
    move-result-object v6

    .line 331
    invoke-static {v0, v4, v5, v6}, Lcom/brentvatne/exoplayer/f;->C(Lcom/brentvatne/exoplayer/f;Ljava/util/UUID;Ljava/lang/String;[Ljava/lang/String;)Lj7/x;

    .line 332
    .line 333
    .line 334
    move-result-object v0
    :try_end_0
    .catch Lj7/l0; {:try_start_0 .. :try_end_0} :catch_0

    .line 335
    goto :goto_2

    .line 336
    :catch_0
    move-exception v0

    .line 337
    sget v1, Lf9/q0;->a:I

    .line 338
    .line 339
    const/16 v2, 0x12

    .line 340
    .line 341
    if-ge v1, v2, :cond_2

    .line 342
    .line 343
    sget v1, Ly2/b;->a:I

    .line 344
    .line 345
    goto :goto_1

    .line 346
    :cond_2
    iget v1, v0, Lj7/l0;->k:I

    .line 347
    .line 348
    if-ne v1, v3, :cond_3

    .line 349
    .line 350
    sget v1, Ly2/b;->c:I

    .line 351
    .line 352
    goto :goto_1

    .line 353
    :cond_3
    sget v1, Ly2/b;->b:I

    .line 354
    .line 355
    :goto_1
    iget-object v2, p0, Lcom/brentvatne/exoplayer/f$f;->l:Lcom/brentvatne/exoplayer/f;

    .line 356
    .line 357
    invoke-static {v2}, Lcom/brentvatne/exoplayer/f;->d(Lcom/brentvatne/exoplayer/f;)Lcom/brentvatne/exoplayer/h;

    .line 358
    .line 359
    .line 360
    move-result-object v2

    .line 361
    iget-object v3, p0, Lcom/brentvatne/exoplayer/f$f;->l:Lcom/brentvatne/exoplayer/f;

    .line 362
    .line 363
    invoke-virtual {v3}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 364
    .line 365
    .line 366
    move-result-object v3

    .line 367
    invoke-virtual {v3, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 368
    .line 369
    .line 370
    move-result-object v1

    .line 371
    invoke-virtual {v2, v1, v0}, Lcom/brentvatne/exoplayer/h;->f(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 372
    .line 373
    .line 374
    return-void

    .line 375
    :cond_4
    const/4 v0, 0x0

    .line 376
    :goto_2
    iget-object v4, p0, Lcom/brentvatne/exoplayer/f$f;->l:Lcom/brentvatne/exoplayer/f;

    .line 377
    .line 378
    invoke-static {v4}, Lcom/brentvatne/exoplayer/f;->D(Lcom/brentvatne/exoplayer/f;)Ljava/util/ArrayList;

    .line 379
    .line 380
    .line 381
    move-result-object v4

    .line 382
    iget-object v5, p0, Lcom/brentvatne/exoplayer/f$f;->l:Lcom/brentvatne/exoplayer/f;

    .line 383
    .line 384
    invoke-static {v5}, Lcom/brentvatne/exoplayer/f;->v(Lcom/brentvatne/exoplayer/f;)Landroid/net/Uri;

    .line 385
    .line 386
    .line 387
    move-result-object v6

    .line 388
    iget-object v7, p0, Lcom/brentvatne/exoplayer/f$f;->l:Lcom/brentvatne/exoplayer/f;

    .line 389
    .line 390
    invoke-static {v7}, Lcom/brentvatne/exoplayer/f;->E(Lcom/brentvatne/exoplayer/f;)Ljava/lang/String;

    .line 391
    .line 392
    .line 393
    move-result-object v7

    .line 394
    invoke-static {v5, v6, v7, v0}, Lcom/brentvatne/exoplayer/f;->F(Lcom/brentvatne/exoplayer/f;Landroid/net/Uri;Ljava/lang/String;Lj7/x;)Lh8/u;

    .line 395
    .line 396
    .line 397
    move-result-object v0

    .line 398
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 399
    .line 400
    .line 401
    move-result v5

    .line 402
    if-nez v5, :cond_5

    .line 403
    .line 404
    goto :goto_3

    .line 405
    :cond_5
    invoke-virtual {v4, v2, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 406
    .line 407
    .line 408
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 409
    .line 410
    .line 411
    move-result v0

    .line 412
    new-array v0, v0, [Lh8/u;

    .line 413
    .line 414
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 415
    .line 416
    .line 417
    move-result-object v0

    .line 418
    check-cast v0, [Lh8/u;

    .line 419
    .line 420
    new-instance v4, Lh8/e0;

    .line 421
    .line 422
    invoke-direct {v4, v0}, Lh8/e0;-><init>([Lh8/u;)V

    .line 423
    .line 424
    .line 425
    move-object v0, v4

    .line 426
    :goto_3
    iget-object v4, p0, Lcom/brentvatne/exoplayer/f$f;->l:Lcom/brentvatne/exoplayer/f;

    .line 427
    .line 428
    invoke-static {v4}, Lcom/brentvatne/exoplayer/f;->G(Lcom/brentvatne/exoplayer/f;)I

    .line 429
    .line 430
    .line 431
    move-result v4

    .line 432
    if-eq v4, v1, :cond_6

    .line 433
    .line 434
    move v1, v3

    .line 435
    goto :goto_4

    .line 436
    :cond_6
    move v1, v2

    .line 437
    :goto_4
    if-eqz v1, :cond_7

    .line 438
    .line 439
    iget-object v4, p0, Lcom/brentvatne/exoplayer/f$f;->l:Lcom/brentvatne/exoplayer/f;

    .line 440
    .line 441
    invoke-static {v4}, Lcom/brentvatne/exoplayer/f;->a(Lcom/brentvatne/exoplayer/f;)Lcom/google/android/exoplayer2/SimpleExoPlayer;

    .line 442
    .line 443
    .line 444
    move-result-object v4

    .line 445
    iget-object v5, p0, Lcom/brentvatne/exoplayer/f$f;->l:Lcom/brentvatne/exoplayer/f;

    .line 446
    .line 447
    invoke-static {v5}, Lcom/brentvatne/exoplayer/f;->G(Lcom/brentvatne/exoplayer/f;)I

    .line 448
    .line 449
    .line 450
    move-result v5

    .line 451
    iget-object v6, p0, Lcom/brentvatne/exoplayer/f$f;->l:Lcom/brentvatne/exoplayer/f;

    .line 452
    .line 453
    invoke-static {v6}, Lcom/brentvatne/exoplayer/f;->H(Lcom/brentvatne/exoplayer/f;)J

    .line 454
    .line 455
    .line 456
    move-result-wide v6

    .line 457
    invoke-virtual {v4, v5, v6, v7}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->g(IJ)V

    .line 458
    .line 459
    .line 460
    :cond_7
    iget-object v4, p0, Lcom/brentvatne/exoplayer/f$f;->l:Lcom/brentvatne/exoplayer/f;

    .line 461
    .line 462
    invoke-static {v4}, Lcom/brentvatne/exoplayer/f;->a(Lcom/brentvatne/exoplayer/f;)Lcom/google/android/exoplayer2/SimpleExoPlayer;

    .line 463
    .line 464
    .line 465
    move-result-object v4

    .line 466
    xor-int/2addr v1, v3

    .line 467
    invoke-virtual {v4, v0, v1, v2}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->Q0(Lh8/u;ZZ)V

    .line 468
    .line 469
    .line 470
    iget-object v0, p0, Lcom/brentvatne/exoplayer/f$f;->l:Lcom/brentvatne/exoplayer/f;

    .line 471
    .line 472
    invoke-static {v0, v2}, Lcom/brentvatne/exoplayer/f;->s(Lcom/brentvatne/exoplayer/f;Z)Z

    .line 473
    .line 474
    .line 475
    iget-object v0, p0, Lcom/brentvatne/exoplayer/f$f;->l:Lcom/brentvatne/exoplayer/f;

    .line 476
    .line 477
    invoke-static {v0}, Lcom/brentvatne/exoplayer/f;->l(Lcom/brentvatne/exoplayer/f;)Lcom/brentvatne/exoplayer/d;

    .line 478
    .line 479
    .line 480
    move-result-object v1

    .line 481
    invoke-static {v0, v1}, Lcom/brentvatne/exoplayer/f;->O(Lcom/brentvatne/exoplayer/f;Landroid/view/View;)V

    .line 482
    .line 483
    .line 484
    iget-object v0, p0, Lcom/brentvatne/exoplayer/f$f;->l:Lcom/brentvatne/exoplayer/f;

    .line 485
    .line 486
    invoke-static {v0}, Lcom/brentvatne/exoplayer/f;->d(Lcom/brentvatne/exoplayer/f;)Lcom/brentvatne/exoplayer/h;

    .line 487
    .line 488
    .line 489
    move-result-object v0

    .line 490
    invoke-virtual {v0}, Lcom/brentvatne/exoplayer/h;->m()V

    .line 491
    .line 492
    .line 493
    iget-object v0, p0, Lcom/brentvatne/exoplayer/f$f;->l:Lcom/brentvatne/exoplayer/f;

    .line 494
    .line 495
    invoke-static {v0, v3}, Lcom/brentvatne/exoplayer/f;->J(Lcom/brentvatne/exoplayer/f;Z)Z

    .line 496
    .line 497
    .line 498
    :cond_8
    iget-object v0, p0, Lcom/brentvatne/exoplayer/f$f;->l:Lcom/brentvatne/exoplayer/f;

    .line 499
    .line 500
    invoke-static {v0}, Lcom/brentvatne/exoplayer/f;->K(Lcom/brentvatne/exoplayer/f;)V

    .line 501
    .line 502
    .line 503
    iget-object v0, p0, Lcom/brentvatne/exoplayer/f$f;->l:Lcom/brentvatne/exoplayer/f;

    .line 504
    .line 505
    invoke-static {v0}, Lcom/brentvatne/exoplayer/f;->L(Lcom/brentvatne/exoplayer/f;)Z

    .line 506
    .line 507
    .line 508
    move-result v1

    .line 509
    invoke-virtual {v0, v1}, Lcom/brentvatne/exoplayer/f;->z0(Z)V

    .line 510
    .line 511
    .line 512
    iget-object v0, p0, Lcom/brentvatne/exoplayer/f$f;->l:Lcom/brentvatne/exoplayer/f;

    .line 513
    .line 514
    invoke-static {v0}, Lcom/brentvatne/exoplayer/f;->M(Lcom/brentvatne/exoplayer/f;)V

    .line 515
    .line 516
    .line 517
    return-void
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
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
.end method
