.class abstract Lh0/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/l2;


# instance fields
.field private a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Landroid/media/ImageReader;",
            ">;"
        }
    .end annotation
.end field

.field private b:Landroid/os/HandlerThread;

.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lw/w0;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Ljava/lang/Object;

.field private e:Ljava/lang/String;


# direct methods
.method constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lh0/l;->a:Ljava/util/Map;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lh0/l;->c:Ljava/util/List;

    .line 17
    .line 18
    new-instance v0, Ljava/lang/Object;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lh0/l;->d:Ljava/lang/Object;

    .line 24
    .line 25
    return-void
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

.method public static synthetic h(Landroid/media/ImageReader;)V
    .locals 0

    invoke-static {p0}, Lh0/l;->k(Landroid/media/ImageReader;)V

    return-void
.end method

.method private static synthetic k(Landroid/media/ImageReader;)V
    .locals 0

    invoke-virtual {p0}, Landroid/media/ImageReader;->close()V

    return-void
.end method


# virtual methods
.method public final c()V
    .locals 3

    .line 1
    const-string v0, "SessionProcessorBase"

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string v2, "deInitSession: cameraId="

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    iget-object v2, p0, Lh0/l;->e:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-static {v0, v1}, Landroidx/camera/core/r1;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lh0/l;->i()V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lh0/l;->d:Ljava/lang/Object;

    .line 29
    .line 30
    monitor-enter v0

    .line 31
    :try_start_0
    iget-object v1, p0, Lh0/l;->c:Ljava/util/List;

    .line 32
    .line 33
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-eqz v2, :cond_0

    .line 42
    .line 43
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    check-cast v2, Lw/w0;

    .line 48
    .line 49
    invoke-virtual {v2}, Lw/w0;->c()V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    iget-object v1, p0, Lh0/l;->c:Ljava/util/List;

    .line 54
    .line 55
    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 56
    .line 57
    .line 58
    iget-object v1, p0, Lh0/l;->a:Ljava/util/Map;

    .line 59
    .line 60
    invoke-interface {v1}, Ljava/util/Map;->clear()V

    .line 61
    .line 62
    .line 63
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    iget-object v0, p0, Lh0/l;->b:Landroid/os/HandlerThread;

    .line 65
    .line 66
    if-eqz v0, :cond_1

    .line 67
    .line 68
    invoke-virtual {v0}, Landroid/os/HandlerThread;->quitSafely()Z

    .line 69
    .line 70
    .line 71
    const/4 v0, 0x0

    .line 72
    iput-object v0, p0, Lh0/l;->b:Landroid/os/HandlerThread;

    .line 73
    .line 74
    :cond_1
    return-void

    .line 75
    :catchall_0
    move-exception v1

    .line 76
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 77
    throw v1
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

.method public final d(Landroidx/camera/core/r;Lw/d2;Lw/d2;Lw/d2;)Lw/k2;
    .locals 6

    .line 1
    invoke-static {p1}, Lv/h;->b(Landroidx/camera/core/r;)Lv/h;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lv/h;->e()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p1}, Lv/h;->d()Ljava/util/Map;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    move-object v0, p0

    .line 14
    move-object v3, p2

    .line 15
    move-object v4, p3

    .line 16
    move-object v5, p4

    .line 17
    invoke-virtual/range {v0 .. v5}, Lh0/l;->j(Ljava/lang/String;Ljava/util/Map;Lw/d2;Lw/d2;Lw/d2;)Lh0/g;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    iget-object p3, p0, Lh0/l;->d:Ljava/lang/Object;

    .line 22
    .line 23
    monitor-enter p3

    .line 24
    :try_start_0
    invoke-interface {p2}, Lh0/g;->c()Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object p4

    .line 28
    invoke-interface {p4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object p4

    .line 32
    :goto_0
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_3

    .line 37
    .line 38
    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, Lh0/e;

    .line 43
    .line 44
    instance-of v1, v0, Lh0/m;

    .line 45
    .line 46
    if-eqz v1, :cond_0

    .line 47
    .line 48
    move-object v1, v0

    .line 49
    check-cast v1, Lh0/m;

    .line 50
    .line 51
    new-instance v2, Lw/m2;

    .line 52
    .line 53
    invoke-interface {v1}, Lh0/m;->getSurface()Landroid/view/Surface;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-interface {v0}, Lh0/e;->getId()I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    invoke-direct {v2, v1, v0}, Lw/m2;-><init>(Landroid/view/Surface;I)V

    .line 62
    .line 63
    .line 64
    iget-object v0, p0, Lh0/l;->c:Ljava/util/List;

    .line 65
    .line 66
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_0
    instance-of v1, v0, Lh0/i;

    .line 71
    .line 72
    if-eqz v1, :cond_1

    .line 73
    .line 74
    move-object v1, v0

    .line 75
    check-cast v1, Lh0/i;

    .line 76
    .line 77
    invoke-interface {v1}, Lh0/i;->getSize()Landroid/util/Size;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    invoke-virtual {v2}, Landroid/util/Size;->getWidth()I

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    invoke-interface {v1}, Lh0/i;->getSize()Landroid/util/Size;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    invoke-virtual {v3}, Landroid/util/Size;->getHeight()I

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    invoke-interface {v1}, Lh0/i;->a()I

    .line 94
    .line 95
    .line 96
    move-result v4

    .line 97
    invoke-interface {v1}, Lh0/i;->b()I

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    invoke-static {v2, v3, v4, v1}, Landroid/media/ImageReader;->newInstance(IIII)Landroid/media/ImageReader;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    iget-object v2, p0, Lh0/l;->a:Ljava/util/Map;

    .line 106
    .line 107
    invoke-interface {v0}, Lh0/e;->getId()I

    .line 108
    .line 109
    .line 110
    move-result v3

    .line 111
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    new-instance v2, Lw/m2;

    .line 119
    .line 120
    invoke-virtual {v1}, Landroid/media/ImageReader;->getSurface()Landroid/view/Surface;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    invoke-interface {v0}, Lh0/e;->getId()I

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    invoke-direct {v2, v3, v0}, Lw/m2;-><init>(Landroid/view/Surface;I)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v2}, Lw/w0;->i()Lfc/b;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    new-instance v3, Lh0/k;

    .line 136
    .line 137
    invoke-direct {v3, v1}, Lh0/k;-><init>(Landroid/media/ImageReader;)V

    .line 138
    .line 139
    .line 140
    invoke-static {}, Lx/a;->a()Ljava/util/concurrent/Executor;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    invoke-interface {v0, v3, v1}, Lfc/b;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 145
    .line 146
    .line 147
    iget-object v0, p0, Lh0/l;->c:Ljava/util/List;

    .line 148
    .line 149
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    goto :goto_0

    .line 153
    :cond_1
    instance-of v0, v0, Lh0/j;

    .line 154
    .line 155
    if-nez v0, :cond_2

    .line 156
    .line 157
    goto :goto_0

    .line 158
    :cond_2
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 159
    .line 160
    const-string p2, "MultiResolutionImageReader not supported"

    .line 161
    .line 162
    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    throw p1

    .line 166
    :cond_3
    monitor-exit p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 167
    new-instance p3, Lw/k2$b;

    .line 168
    .line 169
    invoke-direct {p3}, Lw/k2$b;-><init>()V

    .line 170
    .line 171
    .line 172
    iget-object p4, p0, Lh0/l;->d:Ljava/lang/Object;

    .line 173
    .line 174
    monitor-enter p4

    .line 175
    :try_start_1
    iget-object v0, p0, Lh0/l;->c:Ljava/util/List;

    .line 176
    .line 177
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 182
    .line 183
    .line 184
    move-result v1

    .line 185
    if-eqz v1, :cond_4

    .line 186
    .line 187
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    check-cast v1, Lw/w0;

    .line 192
    .line 193
    invoke-virtual {p3, v1}, Lw/k2$b;->k(Lw/w0;)V

    .line 194
    .line 195
    .line 196
    goto :goto_1

    .line 197
    :cond_4
    monitor-exit p4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 198
    new-instance p4, Lp/b$a;

    .line 199
    .line 200
    invoke-direct {p4}, Lp/b$a;-><init>()V

    .line 201
    .line 202
    .line 203
    invoke-interface {p2}, Lh0/g;->b()Ljava/util/Map;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 216
    .line 217
    .line 218
    move-result v1

    .line 219
    if-eqz v1, :cond_5

    .line 220
    .line 221
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v1

    .line 225
    check-cast v1, Landroid/hardware/camera2/CaptureRequest$Key;

    .line 226
    .line 227
    invoke-interface {p2}, Lh0/g;->b()Ljava/util/Map;

    .line 228
    .line 229
    .line 230
    move-result-object v2

    .line 231
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v2

    .line 235
    invoke-virtual {p4, v1, v2}, Lp/b$a;->e(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lp/b$a;

    .line 236
    .line 237
    .line 238
    goto :goto_2

    .line 239
    :cond_5
    invoke-virtual {p4}, Lp/b$a;->a()Lp/b;

    .line 240
    .line 241
    .line 242
    move-result-object p4

    .line 243
    invoke-virtual {p3, p4}, Lw/k2$b;->q(Lw/r0;)V

    .line 244
    .line 245
    .line 246
    invoke-interface {p2}, Lh0/g;->a()I

    .line 247
    .line 248
    .line 249
    move-result p2

    .line 250
    invoke-virtual {p3, p2}, Lw/k2$b;->r(I)V

    .line 251
    .line 252
    .line 253
    new-instance p2, Landroid/os/HandlerThread;

    .line 254
    .line 255
    const-string p4, "CameraX-extensions_image_reader"

    .line 256
    .line 257
    invoke-direct {p2, p4}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    iput-object p2, p0, Lh0/l;->b:Landroid/os/HandlerThread;

    .line 261
    .line 262
    invoke-virtual {p2}, Ljava/lang/Thread;->start()V

    .line 263
    .line 264
    .line 265
    invoke-virtual {p1}, Lv/h;->e()Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object p1

    .line 269
    iput-object p1, p0, Lh0/l;->e:Ljava/lang/String;

    .line 270
    .line 271
    const-string p1, "SessionProcessorBase"

    .line 272
    .line 273
    new-instance p2, Ljava/lang/StringBuilder;

    .line 274
    .line 275
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 276
    .line 277
    .line 278
    const-string p4, "initSession: cameraId="

    .line 279
    .line 280
    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 281
    .line 282
    .line 283
    iget-object p4, p0, Lh0/l;->e:Ljava/lang/String;

    .line 284
    .line 285
    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 286
    .line 287
    .line 288
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object p2

    .line 292
    invoke-static {p1, p2}, Landroidx/camera/core/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    invoke-virtual {p3}, Lw/k2$b;->m()Lw/k2;

    .line 296
    .line 297
    .line 298
    move-result-object p1

    .line 299
    return-object p1

    .line 300
    :catchall_0
    move-exception p1

    .line 301
    :try_start_2
    monitor-exit p4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 302
    throw p1

    .line 303
    :catchall_1
    move-exception p1

    .line 304
    :try_start_3
    monitor-exit p3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 305
    throw p1
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

.method protected abstract i()V
.end method

.method protected abstract j(Ljava/lang/String;Ljava/util/Map;Lw/d2;Lw/d2;Lw/d2;)Lh0/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Landroid/hardware/camera2/CameraCharacteristics;",
            ">;",
            "Lw/d2;",
            "Lw/d2;",
            "Lw/d2;",
            ")",
            "Lh0/g;"
        }
    .end annotation
.end method
