.class final Lq/p2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq/u1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lq/p2$e;,
        Lq/p2$d;
    }
.end annotation


# static fields
.field private static r:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lw/w0;",
            ">;"
        }
    .end annotation
.end field

.field private static s:I


# instance fields
.field private final a:Lw/l2;

.field private final b:Lq/m0;

.field final c:Ljava/util/concurrent/Executor;

.field private final d:Ljava/util/concurrent/ScheduledExecutorService;

.field private final e:Lq/t1;

.field private f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lw/w0;",
            ">;"
        }
    .end annotation
.end field

.field private g:Lw/k2;

.field private h:Lq/e1;

.field private i:Lw/k2;

.field private j:Z

.field private k:Lq/p2$d;

.field private volatile l:Lw/n0;

.field volatile m:Z

.field private final n:Lq/p2$e;

.field private o:Lv/k;

.field private p:Lv/k;

.field private q:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lq/p2;->r:Ljava/util/List;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    sput v0, Lq/p2;->s:I

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
.end method

.method constructor <init>(Lw/l2;Lq/m0;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;)V
    .locals 2

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
    iput-object v0, p0, Lq/p2;->f:Ljava/util/List;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-boolean v0, p0, Lq/p2;->j:Z

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    iput-object v1, p0, Lq/p2;->l:Lw/n0;

    .line 16
    .line 17
    iput-boolean v0, p0, Lq/p2;->m:Z

    .line 18
    .line 19
    new-instance v1, Lv/k$a;

    .line 20
    .line 21
    invoke-direct {v1}, Lv/k$a;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Lv/k$a;->d()Lv/k;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    iput-object v1, p0, Lq/p2;->o:Lv/k;

    .line 29
    .line 30
    new-instance v1, Lv/k$a;

    .line 31
    .line 32
    invoke-direct {v1}, Lv/k$a;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Lv/k$a;->d()Lv/k;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    iput-object v1, p0, Lq/p2;->p:Lv/k;

    .line 40
    .line 41
    iput v0, p0, Lq/p2;->q:I

    .line 42
    .line 43
    new-instance v0, Lq/t1;

    .line 44
    .line 45
    invoke-direct {v0}, Lq/t1;-><init>()V

    .line 46
    .line 47
    .line 48
    iput-object v0, p0, Lq/p2;->e:Lq/t1;

    .line 49
    .line 50
    iput-object p1, p0, Lq/p2;->a:Lw/l2;

    .line 51
    .line 52
    iput-object p2, p0, Lq/p2;->b:Lq/m0;

    .line 53
    .line 54
    iput-object p3, p0, Lq/p2;->c:Ljava/util/concurrent/Executor;

    .line 55
    .line 56
    iput-object p4, p0, Lq/p2;->d:Ljava/util/concurrent/ScheduledExecutorService;

    .line 57
    .line 58
    sget-object p1, Lq/p2$d;->k:Lq/p2$d;

    .line 59
    .line 60
    iput-object p1, p0, Lq/p2;->k:Lq/p2$d;

    .line 61
    .line 62
    new-instance p1, Lq/p2$e;

    .line 63
    .line 64
    invoke-direct {p1, p3}, Lq/p2$e;-><init>(Ljava/util/concurrent/Executor;)V

    .line 65
    .line 66
    .line 67
    iput-object p1, p0, Lq/p2;->n:Lq/p2$e;

    .line 68
    .line 69
    sget p1, Lq/p2;->s:I

    .line 70
    .line 71
    add-int/lit8 p2, p1, 0x1

    .line 72
    .line 73
    sput p2, Lq/p2;->s:I

    .line 74
    .line 75
    iput p1, p0, Lq/p2;->q:I

    .line 76
    .line 77
    new-instance p1, Ljava/lang/StringBuilder;

    .line 78
    .line 79
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 80
    .line 81
    .line 82
    const-string p2, "New ProcessingCaptureSession (id="

    .line 83
    .line 84
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    iget p2, p0, Lq/p2;->q:I

    .line 88
    .line 89
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    const-string p2, ")"

    .line 93
    .line 94
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    const-string p2, "ProcessingCaptureSession"

    .line 102
    .line 103
    invoke-static {p2, p1}, Landroidx/camera/core/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    return-void
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
.end method

.method public static synthetic h(Lq/p2;Lw/k2;Landroid/hardware/camera2/CameraDevice;Lq/c3;Ljava/util/List;)Lfc/b;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lq/p2;->q(Lw/k2;Landroid/hardware/camera2/CameraDevice;Lq/c3;Ljava/util/List;)Lfc/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lq/p2;)V
    .locals 0

    invoke-direct {p0}, Lq/p2;->o()V

    return-void
.end method

.method public static synthetic j(Lw/w0;)V
    .locals 0

    invoke-static {p0}, Lq/p2;->p(Lw/w0;)V

    return-void
.end method

.method public static synthetic k(Lq/p2;Ljava/lang/Void;)Ljava/lang/Void;
    .locals 0

    invoke-direct {p0, p1}, Lq/p2;->r(Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object p0

    return-object p0
.end method

.method private static l(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lw/n0;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lw/n0;

    .line 16
    .line 17
    invoke-virtual {v0}, Lw/n0;->b()Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Lw/k;

    .line 36
    .line 37
    invoke-virtual {v1}, Lw/k;->a()V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    return-void
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
.end method

.method private static m(Ljava/util/List;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lw/w0;",
            ">;)",
            "Ljava/util/List<",
            "Lw/m2;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Lw/w0;

    .line 21
    .line 22
    instance-of v2, v1, Lw/m2;

    .line 23
    .line 24
    const-string v3, "Surface must be SessionProcessorSurface"

    .line 25
    .line 26
    invoke-static {v2, v3}, Landroidx/core/util/g;->b(ZLjava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    check-cast v1, Lw/m2;

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    return-object v0
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
.end method

.method private n(Ljava/util/List;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lw/n0;",
            ">;)Z"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Lw/n0;

    .line 24
    .line 25
    invoke-virtual {v0}, Lw/n0;->f()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    const/4 v2, 0x2

    .line 30
    if-eq v0, v2, :cond_1

    .line 31
    .line 32
    return v1

    .line 33
    :cond_2
    const/4 p1, 0x1

    .line 34
    return p1
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
.end method

.method private synthetic o()V
    .locals 1

    iget-object v0, p0, Lq/p2;->f:Ljava/util/List;

    invoke-static {v0}, Lw/b1;->e(Ljava/util/List;)V

    return-void
.end method

.method private static synthetic p(Lw/w0;)V
    .locals 1

    sget-object v0, Lq/p2;->r:Ljava/util/List;

    invoke-interface {v0, p0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method private synthetic q(Lw/k2;Landroid/hardware/camera2/CameraDevice;Lq/c3;Ljava/util/List;)Lfc/b;
    .locals 10

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "-- getSurfaces done, start init (id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lq/p2;->q:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "ProcessingCaptureSession"

    invoke-static {v2, v0}, Landroidx/camera/core/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lq/p2;->k:Lq/p2$d;

    sget-object v3, Lq/p2$d;->o:Lq/p2$d;

    if-ne v0, v3, :cond_0

    .line 3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "SessionProcessorCaptureSession is closed."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Ly/f;->f(Ljava/lang/Throwable;)Lfc/b;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 v0, 0x0

    .line 4
    invoke-interface {p4, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 5
    invoke-virtual {p1}, Lw/k2;->i()Ljava/util/List;

    move-result-object p1

    invoke-interface {p4, v0}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result p2

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lw/w0;

    .line 6
    new-instance p2, Lw/w0$a;

    const-string p3, "Surface closed"

    invoke-direct {p2, p3, p1}, Lw/w0$a;-><init>(Ljava/lang/String;Lw/w0;)V

    invoke-static {p2}, Ly/f;->f(Ljava/lang/Throwable;)Lfc/b;

    move-result-object p1

    return-object p1

    .line 7
    :cond_1
    :try_start_0
    iget-object p4, p0, Lq/p2;->f:Ljava/util/List;

    invoke-static {p4}, Lw/b1;->f(Ljava/util/List;)V
    :try_end_0
    .catch Lw/w0$a; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p4, 0x0

    move v5, p4

    move-object v3, v0

    move-object v4, v3

    .line 8
    :goto_0
    invoke-virtual {p1}, Lw/k2;->i()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    if-ge v5, v6, :cond_5

    .line 9
    invoke-virtual {p1}, Lw/k2;->i()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lw/w0;

    .line 10
    invoke-virtual {v6}, Lw/w0;->e()Ljava/lang/Class;

    move-result-object v7

    const-class v8, Landroidx/camera/core/a2;

    invoke-static {v7, v8}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    .line 11
    invoke-virtual {v6}, Lw/w0;->h()Lfc/b;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/Surface;

    new-instance v7, Landroid/util/Size;

    .line 12
    invoke-virtual {v6}, Lw/w0;->f()Landroid/util/Size;

    move-result-object v8

    invoke-virtual {v8}, Landroid/util/Size;->getWidth()I

    move-result v8

    .line 13
    invoke-virtual {v6}, Lw/w0;->f()Landroid/util/Size;

    move-result-object v9

    invoke-virtual {v9}, Landroid/util/Size;->getHeight()I

    move-result v9

    invoke-direct {v7, v8, v9}, Landroid/util/Size;-><init>(II)V

    .line 14
    invoke-virtual {v6}, Lw/w0;->g()I

    move-result v6

    .line 15
    invoke-static {v0, v7, v6}, Lw/d2;->a(Landroid/view/Surface;Landroid/util/Size;I)Lw/d2;

    move-result-object v0

    goto :goto_1

    .line 16
    :cond_2
    invoke-virtual {v6}, Lw/w0;->e()Ljava/lang/Class;

    move-result-object v7

    const-class v8, Landroidx/camera/core/g1;

    invoke-static {v7, v8}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    .line 17
    invoke-virtual {v6}, Lw/w0;->h()Lfc/b;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/Surface;

    new-instance v7, Landroid/util/Size;

    .line 18
    invoke-virtual {v6}, Lw/w0;->f()Landroid/util/Size;

    move-result-object v8

    invoke-virtual {v8}, Landroid/util/Size;->getWidth()I

    move-result v8

    .line 19
    invoke-virtual {v6}, Lw/w0;->f()Landroid/util/Size;

    move-result-object v9

    invoke-virtual {v9}, Landroid/util/Size;->getHeight()I

    move-result v9

    invoke-direct {v7, v8, v9}, Landroid/util/Size;-><init>(II)V

    .line 20
    invoke-virtual {v6}, Lw/w0;->g()I

    move-result v6

    .line 21
    invoke-static {v3, v7, v6}, Lw/d2;->a(Landroid/view/Surface;Landroid/util/Size;I)Lw/d2;

    move-result-object v3

    goto :goto_1

    .line 22
    :cond_3
    invoke-virtual {v6}, Lw/w0;->e()Ljava/lang/Class;

    move-result-object v7

    const-class v8, Landroidx/camera/core/m0;

    invoke-static {v7, v8}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    .line 23
    invoke-virtual {v6}, Lw/w0;->h()Lfc/b;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/view/Surface;

    new-instance v7, Landroid/util/Size;

    .line 24
    invoke-virtual {v6}, Lw/w0;->f()Landroid/util/Size;

    move-result-object v8

    invoke-virtual {v8}, Landroid/util/Size;->getWidth()I

    move-result v8

    .line 25
    invoke-virtual {v6}, Lw/w0;->f()Landroid/util/Size;

    move-result-object v9

    invoke-virtual {v9}, Landroid/util/Size;->getHeight()I

    move-result v9

    invoke-direct {v7, v8, v9}, Landroid/util/Size;-><init>(II)V

    .line 26
    invoke-virtual {v6}, Lw/w0;->g()I

    move-result v6

    .line 27
    invoke-static {v4, v7, v6}, Lw/d2;->a(Landroid/view/Surface;Landroid/util/Size;I)Lw/d2;

    move-result-object v4

    :cond_4
    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_0

    .line 28
    :cond_5
    sget-object v5, Lq/p2$d;->l:Lq/p2$d;

    iput-object v5, p0, Lq/p2;->k:Lq/p2$d;

    .line 29
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "== initSession (id="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v6, p0, Lq/p2;->q:I

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Landroidx/camera/core/r1;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    iget-object v1, p0, Lq/p2;->a:Lw/l2;

    iget-object v2, p0, Lq/p2;->b:Lq/m0;

    invoke-interface {v1, v2, v0, v3, v4}, Lw/l2;->d(Landroidx/camera/core/r;Lw/d2;Lw/d2;Lw/d2;)Lw/k2;

    move-result-object v0

    iput-object v0, p0, Lq/p2;->i:Lw/k2;

    .line 31
    invoke-virtual {v0}, Lw/k2;->i()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lw/w0;

    invoke-virtual {p4}, Lw/w0;->i()Lfc/b;

    move-result-object p4

    new-instance v0, Lq/n2;

    invoke-direct {v0, p0}, Lq/n2;-><init>(Lq/p2;)V

    .line 32
    invoke-static {}, Lx/a;->a()Ljava/util/concurrent/Executor;

    move-result-object v1

    .line 33
    invoke-interface {p4, v0, v1}, Lfc/b;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 34
    iget-object p4, p0, Lq/p2;->i:Lw/k2;

    invoke-virtual {p4}, Lw/k2;->i()Ljava/util/List;

    move-result-object p4

    invoke-interface {p4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p4

    :goto_2
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw/w0;

    .line 35
    sget-object v1, Lq/p2;->r:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 36
    invoke-virtual {v0}, Lw/w0;->i()Lfc/b;

    move-result-object v1

    new-instance v2, Lq/o2;

    invoke-direct {v2, v0}, Lq/o2;-><init>(Lw/w0;)V

    iget-object v0, p0, Lq/p2;->c:Ljava/util/concurrent/Executor;

    invoke-interface {v1, v2, v0}, Lfc/b;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    goto :goto_2

    .line 37
    :cond_6
    new-instance p4, Lw/k2$f;

    invoke-direct {p4}, Lw/k2$f;-><init>()V

    .line 38
    invoke-virtual {p4, p1}, Lw/k2$f;->a(Lw/k2;)V

    .line 39
    invoke-virtual {p4}, Lw/k2$f;->c()V

    .line 40
    iget-object p1, p0, Lq/p2;->i:Lw/k2;

    invoke-virtual {p4, p1}, Lw/k2$f;->a(Lw/k2;)V

    .line 41
    invoke-virtual {p4}, Lw/k2$f;->d()Z

    move-result p1

    const-string v0, "Cannot transform the SessionConfig"

    invoke-static {p1, v0}, Landroidx/core/util/g;->b(ZLjava/lang/Object;)V

    .line 42
    invoke-virtual {p4}, Lw/k2$f;->b()Lw/k2;

    move-result-object p1

    .line 43
    iget-object p4, p0, Lq/p2;->e:Lq/t1;

    .line 44
    invoke-static {p2}, Landroidx/core/util/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/hardware/camera2/CameraDevice;

    .line 45
    invoke-virtual {p4, p1, p2, p3}, Lq/t1;->g(Lw/k2;Landroid/hardware/camera2/CameraDevice;Lq/c3;)Lfc/b;

    move-result-object p1

    .line 46
    new-instance p2, Lq/p2$a;

    invoke-direct {p2, p0}, Lq/p2$a;-><init>(Lq/p2;)V

    iget-object p3, p0, Lq/p2;->c:Ljava/util/concurrent/Executor;

    invoke-static {p1, p2, p3}, Ly/f;->b(Lfc/b;Ly/c;Ljava/util/concurrent/Executor;)V

    return-object p1

    :catch_0
    move-exception p1

    .line 47
    invoke-static {p1}, Ly/f;->f(Ljava/lang/Throwable;)Lfc/b;

    move-result-object p1

    return-object p1
.end method

.method private synthetic r(Ljava/lang/Void;)Ljava/lang/Void;
    .locals 0

    iget-object p1, p0, Lq/p2;->e:Lq/t1;

    invoke-virtual {p0, p1}, Lq/p2;->s(Lq/t1;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method private t(Lv/k;Lv/k;)V
    .locals 1

    .line 1
    new-instance v0, Lp/b$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lp/b$a;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lp/b$a;->d(Lw/r0;)Lp/b$a;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p2}, Lp/b$a;->d(Lw/r0;)Lp/b$a;

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Lq/p2;->a:Lw/l2;

    .line 13
    .line 14
    invoke-virtual {v0}, Lp/b$a;->a()Lp/b;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    invoke-interface {p1, p2}, Lw/l2;->g(Lw/r0;)V

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
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "cancelIssuedCaptureRequests (id="

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget v1, p0, Lq/p2;->q:I

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v1, ")"

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const-string v1, "ProcessingCaptureSession"

    .line 26
    .line 27
    invoke-static {v1, v0}, Landroidx/camera/core/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lq/p2;->l:Lw/n0;

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    iget-object v0, p0, Lq/p2;->l:Lw/n0;

    .line 35
    .line 36
    invoke-virtual {v0}, Lw/n0;->b()Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eqz v1, :cond_0

    .line 49
    .line 50
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    check-cast v1, Lw/k;

    .line 55
    .line 56
    invoke-virtual {v1}, Lw/k;->a()V

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    const/4 v0, 0x0

    .line 61
    iput-object v0, p0, Lq/p2;->l:Lw/n0;

    .line 62
    .line 63
    :cond_1
    return-void
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
.end method

.method public b(Lw/k2;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "setSessionConfig (id="

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget v1, p0, Lq/p2;->q:I

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v1, ")"

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const-string v1, "ProcessingCaptureSession"

    .line 26
    .line 27
    invoke-static {v1, v0}, Landroidx/camera/core/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Lq/p2;->g:Lw/k2;

    .line 31
    .line 32
    if-nez p1, :cond_0

    .line 33
    .line 34
    return-void

    .line 35
    :cond_0
    iget-object v0, p0, Lq/p2;->n:Lq/p2$e;

    .line 36
    .line 37
    invoke-virtual {p1}, Lw/k2;->e()Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v0, v1}, Lq/p2$e;->a(Ljava/util/List;)V

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, Lq/p2;->k:Lq/p2$d;

    .line 45
    .line 46
    sget-object v1, Lq/p2$d;->m:Lq/p2$d;

    .line 47
    .line 48
    if-ne v0, v1, :cond_1

    .line 49
    .line 50
    invoke-virtual {p1}, Lw/k2;->d()Lw/r0;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-static {p1}, Lv/k$a;->e(Lw/r0;)Lv/k$a;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-virtual {p1}, Lv/k$a;->d()Lv/k;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    iput-object p1, p0, Lq/p2;->o:Lv/k;

    .line 63
    .line 64
    iget-object v0, p0, Lq/p2;->p:Lv/k;

    .line 65
    .line 66
    invoke-direct {p0, p1, v0}, Lq/p2;->t(Lv/k;Lv/k;)V

    .line 67
    .line 68
    .line 69
    iget-boolean p1, p0, Lq/p2;->j:Z

    .line 70
    .line 71
    if-nez p1, :cond_1

    .line 72
    .line 73
    iget-object p1, p0, Lq/p2;->a:Lw/l2;

    .line 74
    .line 75
    iget-object v0, p0, Lq/p2;->n:Lq/p2$e;

    .line 76
    .line 77
    invoke-interface {p1, v0}, Lw/l2;->e(Lw/l2$a;)I

    .line 78
    .line 79
    .line 80
    const/4 p1, 0x1

    .line 81
    iput-boolean p1, p0, Lq/p2;->j:Z

    .line 82
    .line 83
    :cond_1
    return-void
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
.end method

.method public c(Z)Lfc/b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lfc/b<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lq/p2;->k:Lq/p2$d;

    .line 2
    .line 3
    sget-object v1, Lq/p2$d;->o:Lq/p2$d;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    const-string v1, "release() can only be called in CLOSED state"

    .line 11
    .line 12
    invoke-static {v0, v1}, Landroidx/core/util/g;->j(ZLjava/lang/String;)V

    .line 13
    .line 14
    .line 15
    new-instance v0, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    .line 19
    .line 20
    const-string v1, "release (id="

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget v1, p0, Lq/p2;->q:I

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v1, ")"

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    const-string v1, "ProcessingCaptureSession"

    .line 40
    .line 41
    invoke-static {v1, v0}, Landroidx/camera/core/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, Lq/p2;->e:Lq/t1;

    .line 45
    .line 46
    invoke-virtual {v0, p1}, Lq/t1;->c(Z)Lfc/b;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    return-object p1
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
.end method

.method public close()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "close (id="

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget v1, p0, Lq/p2;->q:I

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v1, ") state="

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Lq/p2;->k:Lq/p2$d;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    const-string v1, "ProcessingCaptureSession"

    .line 31
    .line 32
    invoke-static {v1, v0}, Landroidx/camera/core/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sget-object v0, Lq/p2$c;->a:[I

    .line 36
    .line 37
    iget-object v1, p0, Lq/p2;->k:Lq/p2$d;

    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    aget v0, v0, v1

    .line 44
    .line 45
    const/4 v1, 0x2

    .line 46
    if-eq v0, v1, :cond_3

    .line 47
    .line 48
    const/4 v1, 0x3

    .line 49
    if-eq v0, v1, :cond_1

    .line 50
    .line 51
    const/4 v1, 0x4

    .line 52
    if-eq v0, v1, :cond_3

    .line 53
    .line 54
    const/4 v1, 0x5

    .line 55
    if-eq v0, v1, :cond_0

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    return-void

    .line 59
    :cond_1
    iget-object v0, p0, Lq/p2;->a:Lw/l2;

    .line 60
    .line 61
    invoke-interface {v0}, Lw/l2;->b()V

    .line 62
    .line 63
    .line 64
    iget-object v0, p0, Lq/p2;->h:Lq/e1;

    .line 65
    .line 66
    if-eqz v0, :cond_2

    .line 67
    .line 68
    invoke-virtual {v0}, Lq/e1;->a()V

    .line 69
    .line 70
    .line 71
    :cond_2
    sget-object v0, Lq/p2$d;->n:Lq/p2$d;

    .line 72
    .line 73
    iput-object v0, p0, Lq/p2;->k:Lq/p2$d;

    .line 74
    .line 75
    :cond_3
    iget-object v0, p0, Lq/p2;->a:Lw/l2;

    .line 76
    .line 77
    invoke-interface {v0}, Lw/l2;->c()V

    .line 78
    .line 79
    .line 80
    :goto_0
    sget-object v0, Lq/p2$d;->o:Lq/p2$d;

    .line 81
    .line 82
    iput-object v0, p0, Lq/p2;->k:Lq/p2$d;

    .line 83
    .line 84
    iget-object v0, p0, Lq/p2;->e:Lq/t1;

    .line 85
    .line 86
    invoke-virtual {v0}, Lq/t1;->close()V

    .line 87
    .line 88
    .line 89
    return-void
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
.end method

.method public d()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lw/n0;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lq/p2;->l:Lw/n0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    new-array v0, v0, [Lw/n0;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    iget-object v2, p0, Lq/p2;->l:Lw/n0;

    .line 10
    .line 11
    aput-object v2, v0, v1

    .line 12
    .line 13
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    :goto_0
    return-object v0
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

.method public e(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lw/n0;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x1

    .line 13
    if-gt v0, v1, :cond_7

    .line 14
    .line 15
    invoke-direct {p0, p1}, Lq/p2;->n(Ljava/util/List;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    goto/16 :goto_2

    .line 22
    .line 23
    :cond_1
    iget-object v0, p0, Lq/p2;->l:Lw/n0;

    .line 24
    .line 25
    if-nez v0, :cond_6

    .line 26
    .line 27
    iget-boolean v0, p0, Lq/p2;->m:Z

    .line 28
    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    goto/16 :goto_1

    .line 32
    .line 33
    :cond_2
    const/4 v0, 0x0

    .line 34
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    check-cast v0, Lw/n0;

    .line 39
    .line 40
    new-instance v2, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 43
    .line 44
    .line 45
    const-string v3, "issueCaptureRequests (id="

    .line 46
    .line 47
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    iget v3, p0, Lq/p2;->q:I

    .line 51
    .line 52
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string v3, ") + state ="

    .line 56
    .line 57
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    iget-object v3, p0, Lq/p2;->k:Lq/p2$d;

    .line 61
    .line 62
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    const-string v3, "ProcessingCaptureSession"

    .line 70
    .line 71
    invoke-static {v3, v2}, Landroidx/camera/core/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    sget-object v2, Lq/p2$c;->a:[I

    .line 75
    .line 76
    iget-object v4, p0, Lq/p2;->k:Lq/p2$d;

    .line 77
    .line 78
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 79
    .line 80
    .line 81
    move-result v4

    .line 82
    aget v2, v2, v4

    .line 83
    .line 84
    if-eq v2, v1, :cond_5

    .line 85
    .line 86
    const/4 v4, 0x2

    .line 87
    if-eq v2, v4, :cond_5

    .line 88
    .line 89
    const/4 v4, 0x3

    .line 90
    if-eq v2, v4, :cond_4

    .line 91
    .line 92
    const/4 v0, 0x4

    .line 93
    if-eq v2, v0, :cond_3

    .line 94
    .line 95
    const/4 v0, 0x5

    .line 96
    if-eq v2, v0, :cond_3

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 100
    .line 101
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 102
    .line 103
    .line 104
    const-string v1, "Run issueCaptureRequests in wrong state, state = "

    .line 105
    .line 106
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    iget-object v1, p0, Lq/p2;->k:Lq/p2$d;

    .line 110
    .line 111
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    invoke-static {v3, v0}, Landroidx/camera/core/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    invoke-static {p1}, Lq/p2;->l(Ljava/util/List;)V

    .line 122
    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_4
    iput-boolean v1, p0, Lq/p2;->m:Z

    .line 126
    .line 127
    invoke-virtual {v0}, Lw/n0;->c()Lw/r0;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    invoke-static {p1}, Lv/k$a;->e(Lw/r0;)Lv/k$a;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    invoke-virtual {p1}, Lv/k$a;->d()Lv/k;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    iput-object p1, p0, Lq/p2;->p:Lv/k;

    .line 140
    .line 141
    iget-object v1, p0, Lq/p2;->o:Lv/k;

    .line 142
    .line 143
    invoke-direct {p0, v1, p1}, Lq/p2;->t(Lv/k;Lv/k;)V

    .line 144
    .line 145
    .line 146
    iget-object p1, p0, Lq/p2;->a:Lw/l2;

    .line 147
    .line 148
    new-instance v1, Lq/p2$b;

    .line 149
    .line 150
    invoke-direct {v1, p0, v0}, Lq/p2$b;-><init>(Lq/p2;Lw/n0;)V

    .line 151
    .line 152
    .line 153
    invoke-interface {p1, v1}, Lw/l2;->a(Lw/l2$a;)I

    .line 154
    .line 155
    .line 156
    goto :goto_0

    .line 157
    :cond_5
    iput-object v0, p0, Lq/p2;->l:Lw/n0;

    .line 158
    .line 159
    :goto_0
    return-void

    .line 160
    :cond_6
    :goto_1
    invoke-static {p1}, Lq/p2;->l(Ljava/util/List;)V

    .line 161
    .line 162
    .line 163
    return-void

    .line 164
    :cond_7
    :goto_2
    invoke-static {p1}, Lq/p2;->l(Ljava/util/List;)V

    .line 165
    .line 166
    .line 167
    return-void
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

.method public f()Lw/k2;
    .locals 1

    iget-object v0, p0, Lq/p2;->g:Lw/k2;

    return-object v0
.end method

.method public g(Lw/k2;Landroid/hardware/camera2/CameraDevice;Lq/c3;)Lfc/b;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw/k2;",
            "Landroid/hardware/camera2/CameraDevice;",
            "Lq/c3;",
            ")",
            "Lfc/b<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lq/p2;->k:Lq/p2$d;

    .line 2
    .line 3
    sget-object v1, Lq/p2$d;->k:Lq/p2$d;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    move v0, v2

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    const-string v3, "Invalid state state:"

    .line 17
    .line 18
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    iget-object v3, p0, Lq/p2;->k:Lq/p2$d;

    .line 22
    .line 23
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-static {v0, v1}, Landroidx/core/util/g;->b(ZLjava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Lw/k2;->i()Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    xor-int/2addr v0, v2

    .line 42
    const-string v1, "SessionConfig contains no surfaces"

    .line 43
    .line 44
    invoke-static {v0, v1}, Landroidx/core/util/g;->b(ZLjava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    new-instance v0, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 50
    .line 51
    .line 52
    const-string v1, "open (id="

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    iget v1, p0, Lq/p2;->q:I

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const-string v1, ")"

    .line 63
    .line 64
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    const-string v1, "ProcessingCaptureSession"

    .line 72
    .line 73
    invoke-static {v1, v0}, Landroidx/camera/core/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1}, Lw/k2;->i()Ljava/util/List;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    iput-object v2, p0, Lq/p2;->f:Ljava/util/List;

    .line 81
    .line 82
    const/4 v3, 0x0

    .line 83
    const-wide/16 v4, 0x1388

    .line 84
    .line 85
    iget-object v6, p0, Lq/p2;->c:Ljava/util/concurrent/Executor;

    .line 86
    .line 87
    iget-object v7, p0, Lq/p2;->d:Ljava/util/concurrent/ScheduledExecutorService;

    .line 88
    .line 89
    invoke-static/range {v2 .. v7}, Lw/b1;->k(Ljava/util/Collection;ZJLjava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;)Lfc/b;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-static {v0}, Ly/d;->b(Lfc/b;)Ly/d;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    new-instance v1, Lq/l2;

    .line 98
    .line 99
    invoke-direct {v1, p0, p1, p2, p3}, Lq/l2;-><init>(Lq/p2;Lw/k2;Landroid/hardware/camera2/CameraDevice;Lq/c3;)V

    .line 100
    .line 101
    .line 102
    iget-object p1, p0, Lq/p2;->c:Ljava/util/concurrent/Executor;

    .line 103
    .line 104
    invoke-virtual {v0, v1, p1}, Ly/d;->f(Ly/a;Ljava/util/concurrent/Executor;)Ly/d;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    new-instance p2, Lq/m2;

    .line 109
    .line 110
    invoke-direct {p2, p0}, Lq/m2;-><init>(Lq/p2;)V

    .line 111
    .line 112
    .line 113
    iget-object p3, p0, Lq/p2;->c:Ljava/util/concurrent/Executor;

    .line 114
    .line 115
    invoke-virtual {p1, p2, p3}, Ly/d;->e(Landroidx/arch/core/util/Function;Ljava/util/concurrent/Executor;)Ly/d;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    return-object p1
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
.end method

.method s(Lq/t1;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lq/p2;->k:Lq/p2$d;

    .line 2
    .line 3
    sget-object v1, Lq/p2$d;->l:Lq/p2$d;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    move v0, v2

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v0, v3

    .line 12
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 15
    .line 16
    .line 17
    const-string v4, "Invalid state state:"

    .line 18
    .line 19
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    iget-object v4, p0, Lq/p2;->k:Lq/p2$d;

    .line 23
    .line 24
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-static {v0, v1}, Landroidx/core/util/g;->b(ZLjava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    new-instance v0, Lq/e1;

    .line 35
    .line 36
    iget-object v1, p0, Lq/p2;->i:Lw/k2;

    .line 37
    .line 38
    invoke-virtual {v1}, Lw/k2;->i()Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-static {v1}, Lq/p2;->m(Ljava/util/List;)Ljava/util/List;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-direct {v0, p1, v1}, Lq/e1;-><init>(Lq/t1;Ljava/util/List;)V

    .line 47
    .line 48
    .line 49
    iput-object v0, p0, Lq/p2;->h:Lq/e1;

    .line 50
    .line 51
    iget-object p1, p0, Lq/p2;->a:Lw/l2;

    .line 52
    .line 53
    invoke-interface {p1, v0}, Lw/l2;->f(Lw/j2;)V

    .line 54
    .line 55
    .line 56
    sget-object p1, Lq/p2$d;->m:Lq/p2$d;

    .line 57
    .line 58
    iput-object p1, p0, Lq/p2;->k:Lq/p2$d;

    .line 59
    .line 60
    iget-object p1, p0, Lq/p2;->g:Lw/k2;

    .line 61
    .line 62
    if-eqz p1, :cond_1

    .line 63
    .line 64
    invoke-virtual {p0, p1}, Lq/p2;->b(Lw/k2;)V

    .line 65
    .line 66
    .line 67
    :cond_1
    iget-object p1, p0, Lq/p2;->l:Lw/n0;

    .line 68
    .line 69
    if-eqz p1, :cond_2

    .line 70
    .line 71
    new-array p1, v2, [Lw/n0;

    .line 72
    .line 73
    iget-object v0, p0, Lq/p2;->l:Lw/n0;

    .line 74
    .line 75
    aput-object v0, p1, v3

    .line 76
    .line 77
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    const/4 v0, 0x0

    .line 82
    iput-object v0, p0, Lq/p2;->l:Lw/n0;

    .line 83
    .line 84
    invoke-virtual {p0, p1}, Lq/p2;->e(Ljava/util/List;)V

    .line 85
    .line 86
    .line 87
    :cond_2
    return-void
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
.end method
