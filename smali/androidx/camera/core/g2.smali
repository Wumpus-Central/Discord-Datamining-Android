.class final Landroidx/camera/core/g2;
.super Lw/w0;
.source "SourceFile"


# instance fields
.field final m:Ljava/lang/Object;

.field private final n:Lw/m1$a;

.field o:Z

.field private final p:Landroid/util/Size;

.field final q:Landroidx/camera/core/u1;

.field final r:Landroid/view/Surface;

.field private final s:Landroid/os/Handler;

.field final t:Lw/p0;

.field final u:Lw/o0;

.field private final v:Lw/k;

.field private final w:Lw/w0;

.field private x:Ljava/lang/String;


# direct methods
.method constructor <init>(IIILandroid/os/Handler;Lw/p0;Lw/o0;Lw/w0;Ljava/lang/String;)V
    .locals 4

    .line 1
    new-instance v0, Landroid/util/Size;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Landroid/util/Size;-><init>(II)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, v0, p3}, Lw/w0;-><init>(Landroid/util/Size;I)V

    .line 7
    .line 8
    .line 9
    new-instance v0, Ljava/lang/Object;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Landroidx/camera/core/g2;->m:Ljava/lang/Object;

    .line 15
    .line 16
    new-instance v0, Landroidx/camera/core/e2;

    .line 17
    .line 18
    invoke-direct {v0, p0}, Landroidx/camera/core/e2;-><init>(Landroidx/camera/core/g2;)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Landroidx/camera/core/g2;->n:Lw/m1$a;

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    iput-boolean v1, p0, Landroidx/camera/core/g2;->o:Z

    .line 25
    .line 26
    new-instance v1, Landroid/util/Size;

    .line 27
    .line 28
    invoke-direct {v1, p1, p2}, Landroid/util/Size;-><init>(II)V

    .line 29
    .line 30
    .line 31
    iput-object v1, p0, Landroidx/camera/core/g2;->p:Landroid/util/Size;

    .line 32
    .line 33
    if-eqz p4, :cond_0

    .line 34
    .line 35
    iput-object p4, p0, Landroidx/camera/core/g2;->s:Landroid/os/Handler;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 39
    .line 40
    .line 41
    move-result-object p4

    .line 42
    if-eqz p4, :cond_1

    .line 43
    .line 44
    new-instance v2, Landroid/os/Handler;

    .line 45
    .line 46
    invoke-direct {v2, p4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 47
    .line 48
    .line 49
    iput-object v2, p0, Landroidx/camera/core/g2;->s:Landroid/os/Handler;

    .line 50
    .line 51
    :goto_0
    iget-object p4, p0, Landroidx/camera/core/g2;->s:Landroid/os/Handler;

    .line 52
    .line 53
    invoke-static {p4}, Lx/a;->f(Landroid/os/Handler;)Ljava/util/concurrent/ScheduledExecutorService;

    .line 54
    .line 55
    .line 56
    move-result-object p4

    .line 57
    new-instance v2, Landroidx/camera/core/u1;

    .line 58
    .line 59
    const/4 v3, 0x2

    .line 60
    invoke-direct {v2, p1, p2, p3, v3}, Landroidx/camera/core/u1;-><init>(IIII)V

    .line 61
    .line 62
    .line 63
    iput-object v2, p0, Landroidx/camera/core/g2;->q:Landroidx/camera/core/u1;

    .line 64
    .line 65
    invoke-virtual {v2, v0, p4}, Landroidx/camera/core/u1;->f(Lw/m1$a;Ljava/util/concurrent/Executor;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2}, Landroidx/camera/core/u1;->getSurface()Landroid/view/Surface;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    iput-object p1, p0, Landroidx/camera/core/g2;->r:Landroid/view/Surface;

    .line 73
    .line 74
    invoke-virtual {v2}, Landroidx/camera/core/u1;->m()Lw/k;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    iput-object p1, p0, Landroidx/camera/core/g2;->v:Lw/k;

    .line 79
    .line 80
    iput-object p6, p0, Landroidx/camera/core/g2;->u:Lw/o0;

    .line 81
    .line 82
    invoke-interface {p6, v1}, Lw/o0;->c(Landroid/util/Size;)V

    .line 83
    .line 84
    .line 85
    iput-object p5, p0, Landroidx/camera/core/g2;->t:Lw/p0;

    .line 86
    .line 87
    iput-object p7, p0, Landroidx/camera/core/g2;->w:Lw/w0;

    .line 88
    .line 89
    iput-object p8, p0, Landroidx/camera/core/g2;->x:Ljava/lang/String;

    .line 90
    .line 91
    invoke-virtual {p7}, Lw/w0;->h()Lfc/b;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    new-instance p2, Landroidx/camera/core/g2$a;

    .line 96
    .line 97
    invoke-direct {p2, p0}, Landroidx/camera/core/g2$a;-><init>(Landroidx/camera/core/g2;)V

    .line 98
    .line 99
    .line 100
    invoke-static {}, Lx/a;->a()Ljava/util/concurrent/Executor;

    .line 101
    .line 102
    .line 103
    move-result-object p3

    .line 104
    invoke-static {p1, p2, p3}, Ly/f;->b(Lfc/b;Ly/c;Ljava/util/concurrent/Executor;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0}, Lw/w0;->i()Lfc/b;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    new-instance p2, Landroidx/camera/core/f2;

    .line 112
    .line 113
    invoke-direct {p2, p0}, Landroidx/camera/core/f2;-><init>(Landroidx/camera/core/g2;)V

    .line 114
    .line 115
    .line 116
    invoke-static {}, Lx/a;->a()Ljava/util/concurrent/Executor;

    .line 117
    .line 118
    .line 119
    move-result-object p3

    .line 120
    invoke-interface {p1, p2, p3}, Lfc/b;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 121
    .line 122
    .line 123
    return-void

    .line 124
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 125
    .line 126
    const-string p2, "Creating a ProcessingSurface requires a non-null Handler, or be created  on a thread with a Looper."

    .line 127
    .line 128
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    throw p1
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
.end method

.method public static synthetic p(Landroidx/camera/core/g2;)V
    .locals 0

    invoke-direct {p0}, Landroidx/camera/core/g2;->u()V

    return-void
.end method

.method public static synthetic q(Landroidx/camera/core/g2;Lw/m1;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/camera/core/g2;->t(Lw/m1;)V

    return-void
.end method

.method private synthetic t(Lw/m1;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/camera/core/g2;->m:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {p0, p1}, Landroidx/camera/core/g2;->s(Lw/m1;)V

    .line 5
    .line 6
    .line 7
    monitor-exit v0

    .line 8
    return-void

    .line 9
    :catchall_0
    move-exception p1

    .line 10
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    throw p1
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
.end method

.method private u()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/core/g2;->m:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Landroidx/camera/core/g2;->o:Z

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    monitor-exit v0

    .line 9
    return-void

    .line 10
    :cond_0
    iget-object v1, p0, Landroidx/camera/core/g2;->q:Landroidx/camera/core/u1;

    .line 11
    .line 12
    invoke-virtual {v1}, Landroidx/camera/core/u1;->close()V

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, Landroidx/camera/core/g2;->r:Landroid/view/Surface;

    .line 16
    .line 17
    invoke-virtual {v1}, Landroid/view/Surface;->release()V

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Landroidx/camera/core/g2;->w:Lw/w0;

    .line 21
    .line 22
    invoke-virtual {v1}, Lw/w0;->c()V

    .line 23
    .line 24
    .line 25
    const/4 v1, 0x1

    .line 26
    iput-boolean v1, p0, Landroidx/camera/core/g2;->o:Z

    .line 27
    .line 28
    monitor-exit v0

    .line 29
    return-void

    .line 30
    :catchall_0
    move-exception v1

    .line 31
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    throw v1
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
.end method


# virtual methods
.method public n()Lfc/b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lfc/b<",
            "Landroid/view/Surface;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/camera/core/g2;->m:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Landroidx/camera/core/g2;->r:Landroid/view/Surface;

    .line 5
    .line 6
    invoke-static {v1}, Ly/f;->h(Ljava/lang/Object;)Lfc/b;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    monitor-exit v0

    .line 11
    return-object v1

    .line 12
    :catchall_0
    move-exception v1

    .line 13
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    throw v1
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
.end method

.method r()Lw/k;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/camera/core/g2;->m:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Landroidx/camera/core/g2;->o:Z

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    iget-object v1, p0, Landroidx/camera/core/g2;->v:Lw/k;

    .line 9
    .line 10
    monitor-exit v0

    .line 11
    return-object v1

    .line 12
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 13
    .line 14
    const-string v2, "ProcessingSurface already released!"

    .line 15
    .line 16
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw v1

    .line 20
    :catchall_0
    move-exception v1

    .line 21
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    throw v1
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
.end method

.method s(Lw/m1;)V
    .locals 4

    .line 1
    const-string v0, "ProcessingSurfaceTextur"

    .line 2
    .line 3
    iget-boolean v1, p0, Landroidx/camera/core/g2;->o:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    :try_start_0
    invoke-interface {p1}, Lw/m1;->g()Landroidx/camera/core/ImageProxy;

    .line 9
    .line 10
    .line 11
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    goto :goto_0

    .line 13
    :catch_0
    move-exception p1

    .line 14
    const-string v1, "Failed to acquire next image."

    .line 15
    .line 16
    invoke-static {v0, v1, p1}, Landroidx/camera/core/r1;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 17
    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    :goto_0
    if-nez p1, :cond_1

    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    invoke-interface {p1}, Landroidx/camera/core/ImageProxy;->e0()Landroidx/camera/core/k1;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    if-nez v1, :cond_2

    .line 28
    .line 29
    invoke-interface {p1}, Landroidx/camera/core/ImageProxy;->close()V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_2
    invoke-interface {v1}, Landroidx/camera/core/k1;->b()Lw/s2;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    iget-object v2, p0, Landroidx/camera/core/g2;->x:Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {v1, v2}, Lw/s2;->c(Ljava/lang/String;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    check-cast v1, Ljava/lang/Integer;

    .line 44
    .line 45
    if-nez v1, :cond_3

    .line 46
    .line 47
    invoke-interface {p1}, Landroidx/camera/core/ImageProxy;->close()V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_3
    iget-object v2, p0, Landroidx/camera/core/g2;->t:Lw/p0;

    .line 52
    .line 53
    invoke-interface {v2}, Lw/p0;->getId()I

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    if-eq v2, v3, :cond_4

    .line 62
    .line 63
    new-instance v2, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 66
    .line 67
    .line 68
    const-string v3, "ImageProxyBundle does not contain this id: "

    .line 69
    .line 70
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-static {v0, v1}, Landroidx/camera/core/r1;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    invoke-interface {p1}, Landroidx/camera/core/ImageProxy;->close()V

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_4
    new-instance v0, Lw/n2;

    .line 88
    .line 89
    iget-object v1, p0, Landroidx/camera/core/g2;->x:Ljava/lang/String;

    .line 90
    .line 91
    invoke-direct {v0, p1, v1}, Lw/n2;-><init>(Landroidx/camera/core/ImageProxy;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    iget-object p1, p0, Landroidx/camera/core/g2;->u:Lw/o0;

    .line 95
    .line 96
    invoke-interface {p1, v0}, Lw/o0;->a(Lw/l1;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0}, Lw/n2;->c()V

    .line 100
    .line 101
    .line 102
    :goto_1
    return-void
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
.end method
