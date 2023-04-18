.class public Lz/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/o0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz/o$a;
    }
.end annotation


# static fields
.field private static final h:Landroid/graphics/Rect;


# instance fields
.field private a:I

.field private final b:I

.field private final c:Ljava/lang/Object;

.field private d:Z

.field private e:I

.field private f:Landroid/media/ImageWriter;

.field private g:Landroid/graphics/Rect;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroid/graphics/Rect;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1, v1, v1}, Landroid/graphics/Rect;-><init>(IIII)V

    sput-object v0, Lz/o;->h:Landroid/graphics/Rect;

    return-void
.end method

.method public constructor <init>(II)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lz/o;->c:Ljava/lang/Object;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-boolean v0, p0, Lz/o;->d:Z

    .line 13
    .line 14
    iput v0, p0, Lz/o;->e:I

    .line 15
    .line 16
    sget-object v0, Lz/o;->h:Landroid/graphics/Rect;

    .line 17
    .line 18
    iput-object v0, p0, Lz/o;->g:Landroid/graphics/Rect;

    .line 19
    .line 20
    iput p1, p0, Lz/o;->a:I

    .line 21
    .line 22
    iput p2, p0, Lz/o;->b:I

    .line 23
    .line 24
    return-void
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

.method private static e(Landroidx/camera/core/ImageProxy;)Landroidx/camera/core/impl/utils/m;
    .locals 2

    .line 1
    invoke-static {}, Landroidx/camera/core/impl/utils/m;->a()Landroidx/camera/core/impl/utils/m$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {p0}, Landroidx/camera/core/ImageProxy;->e0()Landroidx/camera/core/k1;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-interface {v1, v0}, Landroidx/camera/core/k1;->c(Landroidx/camera/core/impl/utils/m$b;)V

    .line 10
    .line 11
    .line 12
    invoke-interface {p0}, Landroidx/camera/core/ImageProxy;->getWidth()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-virtual {v0, v1}, Landroidx/camera/core/impl/utils/m$b;->j(I)Landroidx/camera/core/impl/utils/m$b;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-interface {p0}, Landroidx/camera/core/ImageProxy;->getHeight()I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    invoke-virtual {v0, p0}, Landroidx/camera/core/impl/utils/m$b;->i(I)Landroidx/camera/core/impl/utils/m$b;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p0}, Landroidx/camera/core/impl/utils/m$b;->a()Landroidx/camera/core/impl/utils/m;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0
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
.method public a(Lw/l1;)V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    invoke-interface/range {p1 .. p1}, Lw/l1;->b()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const/4 v3, 0x0

    .line 12
    const/4 v4, 0x1

    .line 13
    if-ne v2, v4, :cond_0

    .line 14
    .line 15
    move v2, v4

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move v2, v3

    .line 18
    :goto_0
    new-instance v5, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    .line 23
    const-string v6, "Processing image bundle have single capture id, but found "

    .line 24
    .line 25
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 29
    .line 30
    .line 31
    move-result v6

    .line 32
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    invoke-static {v2, v5}, Landroidx/core/util/g;->b(ZLjava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    check-cast v0, Ljava/lang/Integer;

    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    move-object/from16 v2, p1

    .line 53
    .line 54
    invoke-interface {v2, v0}, Lw/l1;->a(I)Lfc/b;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-interface {v0}, Ljava/util/concurrent/Future;->isDone()Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    invoke-static {v2}, Landroidx/core/util/g;->a(Z)V

    .line 63
    .line 64
    .line 65
    iget-object v2, v1, Lz/o;->c:Ljava/lang/Object;

    .line 66
    .line 67
    monitor-enter v2

    .line 68
    :try_start_0
    iget-object v5, v1, Lz/o;->f:Landroid/media/ImageWriter;

    .line 69
    .line 70
    iget-boolean v6, v1, Lz/o;->d:Z

    .line 71
    .line 72
    if-nez v6, :cond_1

    .line 73
    .line 74
    move v6, v4

    .line 75
    goto :goto_1

    .line 76
    :cond_1
    move v6, v3

    .line 77
    :goto_1
    iget-object v7, v1, Lz/o;->g:Landroid/graphics/Rect;

    .line 78
    .line 79
    if-eqz v6, :cond_2

    .line 80
    .line 81
    iget v8, v1, Lz/o;->e:I

    .line 82
    .line 83
    add-int/2addr v8, v4

    .line 84
    iput v8, v1, Lz/o;->e:I

    .line 85
    .line 86
    :cond_2
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_a

    .line 87
    const/4 v2, 0x0

    .line 88
    :try_start_1
    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v8

    .line 92
    check-cast v8, Landroidx/camera/core/ImageProxy;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_5

    .line 93
    .line 94
    if-nez v6, :cond_5

    .line 95
    .line 96
    :try_start_2
    const-string v0, "YuvToJpegProcessor"

    .line 97
    .line 98
    const-string v7, "Image enqueued for processing on closed processor."

    .line 99
    .line 100
    invoke-static {v0, v7}, Landroidx/camera/core/r1;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    invoke-interface {v8}, Landroidx/camera/core/ImageProxy;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    .line 104
    .line 105
    .line 106
    iget-object v7, v1, Lz/o;->c:Ljava/lang/Object;

    .line 107
    .line 108
    monitor-enter v7

    .line 109
    if-eqz v6, :cond_3

    .line 110
    .line 111
    :try_start_3
    iget v0, v1, Lz/o;->e:I

    .line 112
    .line 113
    add-int/lit8 v2, v0, -0x1

    .line 114
    .line 115
    iput v2, v1, Lz/o;->e:I

    .line 116
    .line 117
    if-nez v0, :cond_3

    .line 118
    .line 119
    iget-boolean v0, v1, Lz/o;->d:Z

    .line 120
    .line 121
    if-eqz v0, :cond_3

    .line 122
    .line 123
    move v3, v4

    .line 124
    goto :goto_2

    .line 125
    :catchall_0
    move-exception v0

    .line 126
    goto :goto_3

    .line 127
    :cond_3
    :goto_2
    monitor-exit v7
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 128
    if-eqz v3, :cond_4

    .line 129
    .line 130
    invoke-virtual {v5}, Landroid/media/ImageWriter;->close()V

    .line 131
    .line 132
    .line 133
    const-string v0, "YuvToJpegProcessor"

    .line 134
    .line 135
    const-string v2, "Closed after completion of last image processed."

    .line 136
    .line 137
    invoke-static {v0, v2}, Landroidx/camera/core/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    :cond_4
    return-void

    .line 141
    :goto_3
    :try_start_4
    monitor-exit v7
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 142
    throw v0

    .line 143
    :cond_5
    :try_start_5
    invoke-virtual {v5}, Landroid/media/ImageWriter;->dequeueInputImage()Landroid/media/Image;

    .line 144
    .line 145
    .line 146
    move-result-object v9
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 147
    :try_start_6
    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    move-object v10, v0

    .line 152
    check-cast v10, Landroidx/camera/core/ImageProxy;
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 153
    .line 154
    :try_start_7
    invoke-interface {v10}, Landroidx/camera/core/ImageProxy;->getFormat()I

    .line 155
    .line 156
    .line 157
    move-result v0

    .line 158
    const/16 v8, 0x23

    .line 159
    .line 160
    if-ne v0, v8, :cond_6

    .line 161
    .line 162
    move v0, v4

    .line 163
    goto :goto_4

    .line 164
    :cond_6
    move v0, v3

    .line 165
    :goto_4
    const-string v8, "Input image is not expected YUV_420_888 image format"

    .line 166
    .line 167
    invoke-static {v0, v8}, Landroidx/core/util/g;->j(ZLjava/lang/String;)V

    .line 168
    .line 169
    .line 170
    invoke-static {v10}, Ld0/a;->j(Landroidx/camera/core/ImageProxy;)[B

    .line 171
    .line 172
    .line 173
    move-result-object v12

    .line 174
    new-instance v0, Landroid/graphics/YuvImage;

    .line 175
    .line 176
    const/16 v13, 0x11

    .line 177
    .line 178
    invoke-interface {v10}, Landroidx/camera/core/ImageProxy;->getWidth()I

    .line 179
    .line 180
    .line 181
    move-result v14

    .line 182
    invoke-interface {v10}, Landroidx/camera/core/ImageProxy;->getHeight()I

    .line 183
    .line 184
    .line 185
    move-result v15

    .line 186
    const/16 v16, 0x0

    .line 187
    .line 188
    move-object v11, v0

    .line 189
    invoke-direct/range {v11 .. v16}, Landroid/graphics/YuvImage;-><init>([BIII[I)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v9}, Landroid/media/Image;->getPlanes()[Landroid/media/Image$Plane;

    .line 193
    .line 194
    .line 195
    move-result-object v8

    .line 196
    aget-object v8, v8, v3

    .line 197
    .line 198
    invoke-virtual {v8}, Landroid/media/Image$Plane;->getBuffer()Ljava/nio/ByteBuffer;

    .line 199
    .line 200
    .line 201
    move-result-object v8

    .line 202
    invoke-virtual {v8}, Ljava/nio/Buffer;->position()I

    .line 203
    .line 204
    .line 205
    move-result v11

    .line 206
    new-instance v12, Landroidx/camera/core/impl/utils/n;

    .line 207
    .line 208
    new-instance v13, Lz/o$a;

    .line 209
    .line 210
    invoke-direct {v13, v8}, Lz/o$a;-><init>(Ljava/nio/ByteBuffer;)V

    .line 211
    .line 212
    .line 213
    invoke-static {v10}, Lz/o;->e(Landroidx/camera/core/ImageProxy;)Landroidx/camera/core/impl/utils/m;

    .line 214
    .line 215
    .line 216
    move-result-object v14

    .line 217
    invoke-direct {v12, v13, v14}, Landroidx/camera/core/impl/utils/n;-><init>(Ljava/io/OutputStream;Landroidx/camera/core/impl/utils/m;)V

    .line 218
    .line 219
    .line 220
    iget v13, v1, Lz/o;->a:I

    .line 221
    .line 222
    invoke-virtual {v0, v7, v13, v12}, Landroid/graphics/YuvImage;->compressToJpeg(Landroid/graphics/Rect;ILjava/io/OutputStream;)Z

    .line 223
    .line 224
    .line 225
    invoke-interface {v10}, Landroidx/camera/core/ImageProxy;->close()V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_1
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 226
    .line 227
    .line 228
    :try_start_8
    invoke-virtual {v8}, Ljava/nio/Buffer;->position()I

    .line 229
    .line 230
    .line 231
    move-result v0

    .line 232
    invoke-virtual {v8, v0}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 233
    .line 234
    .line 235
    invoke-virtual {v8, v11}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 236
    .line 237
    .line 238
    invoke-virtual {v5, v9}, Landroid/media/ImageWriter;->queueInputImage(Landroid/media/Image;)V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_0
    .catchall {:try_start_8 .. :try_end_8} :catchall_7

    .line 239
    .line 240
    .line 241
    iget-object v7, v1, Lz/o;->c:Ljava/lang/Object;

    .line 242
    .line 243
    monitor-enter v7

    .line 244
    if-eqz v6, :cond_7

    .line 245
    .line 246
    :try_start_9
    iget v0, v1, Lz/o;->e:I

    .line 247
    .line 248
    add-int/lit8 v2, v0, -0x1

    .line 249
    .line 250
    iput v2, v1, Lz/o;->e:I

    .line 251
    .line 252
    if-nez v0, :cond_7

    .line 253
    .line 254
    iget-boolean v0, v1, Lz/o;->d:Z

    .line 255
    .line 256
    if-eqz v0, :cond_7

    .line 257
    .line 258
    move v3, v4

    .line 259
    goto :goto_5

    .line 260
    :catchall_1
    move-exception v0

    .line 261
    goto :goto_7

    .line 262
    :cond_7
    :goto_5
    monitor-exit v7
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 263
    if-eqz v3, :cond_10

    .line 264
    .line 265
    :goto_6
    invoke-virtual {v5}, Landroid/media/ImageWriter;->close()V

    .line 266
    .line 267
    .line 268
    const-string v0, "YuvToJpegProcessor"

    .line 269
    .line 270
    const-string v2, "Closed after completion of last image processed."

    .line 271
    .line 272
    invoke-static {v0, v2}, Landroidx/camera/core/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    goto/16 :goto_10

    .line 276
    .line 277
    :goto_7
    :try_start_a
    monitor-exit v7
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    .line 278
    throw v0

    .line 279
    :catch_0
    move-exception v0

    .line 280
    goto :goto_a

    .line 281
    :catchall_2
    move-exception v0

    .line 282
    move-object v2, v10

    .line 283
    goto :goto_b

    .line 284
    :catch_1
    move-exception v0

    .line 285
    move-object v2, v10

    .line 286
    goto :goto_a

    .line 287
    :catchall_3
    move-exception v0

    .line 288
    goto :goto_8

    .line 289
    :catch_2
    move-exception v0

    .line 290
    goto :goto_9

    .line 291
    :catchall_4
    move-exception v0

    .line 292
    move-object v9, v2

    .line 293
    :goto_8
    move-object v2, v8

    .line 294
    goto :goto_b

    .line 295
    :catch_3
    move-exception v0

    .line 296
    move-object v9, v2

    .line 297
    :goto_9
    move-object v2, v8

    .line 298
    goto :goto_a

    .line 299
    :catchall_5
    move-exception v0

    .line 300
    move-object v9, v2

    .line 301
    goto :goto_b

    .line 302
    :catch_4
    move-exception v0

    .line 303
    move-object v9, v2

    .line 304
    :goto_a
    if-eqz v6, :cond_c

    .line 305
    .line 306
    :try_start_b
    const-string v7, "YuvToJpegProcessor"

    .line 307
    .line 308
    const-string v8, "Failed to process YUV -> JPEG"

    .line 309
    .line 310
    invoke-static {v7, v8, v0}, Landroidx/camera/core/r1;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 311
    .line 312
    .line 313
    invoke-virtual {v5}, Landroid/media/ImageWriter;->dequeueInputImage()Landroid/media/Image;

    .line 314
    .line 315
    .line 316
    move-result-object v7
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_7

    .line 317
    :try_start_c
    invoke-virtual {v7}, Landroid/media/Image;->getPlanes()[Landroid/media/Image$Plane;

    .line 318
    .line 319
    .line 320
    move-result-object v0

    .line 321
    aget-object v0, v0, v3

    .line 322
    .line 323
    invoke-virtual {v0}, Landroid/media/Image$Plane;->getBuffer()Ljava/nio/ByteBuffer;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 328
    .line 329
    .line 330
    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 331
    .line 332
    .line 333
    invoke-virtual {v5, v7}, Landroid/media/ImageWriter;->queueInputImage(Landroid/media/Image;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_6

    .line 334
    .line 335
    .line 336
    move-object v9, v7

    .line 337
    goto :goto_e

    .line 338
    :catchall_6
    move-exception v0

    .line 339
    move-object v9, v7

    .line 340
    goto :goto_b

    .line 341
    :catchall_7
    move-exception v0

    .line 342
    :goto_b
    iget-object v7, v1, Lz/o;->c:Ljava/lang/Object;

    .line 343
    .line 344
    monitor-enter v7

    .line 345
    if-eqz v6, :cond_8

    .line 346
    .line 347
    :try_start_d
    iget v6, v1, Lz/o;->e:I

    .line 348
    .line 349
    add-int/lit8 v8, v6, -0x1

    .line 350
    .line 351
    iput v8, v1, Lz/o;->e:I

    .line 352
    .line 353
    if-nez v6, :cond_8

    .line 354
    .line 355
    iget-boolean v6, v1, Lz/o;->d:Z

    .line 356
    .line 357
    if-eqz v6, :cond_8

    .line 358
    .line 359
    move v3, v4

    .line 360
    goto :goto_c

    .line 361
    :catchall_8
    move-exception v0

    .line 362
    goto :goto_d

    .line 363
    :cond_8
    :goto_c
    monitor-exit v7
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_8

    .line 364
    if-eqz v9, :cond_9

    .line 365
    .line 366
    invoke-virtual {v9}, Landroid/media/Image;->close()V

    .line 367
    .line 368
    .line 369
    :cond_9
    if-eqz v2, :cond_a

    .line 370
    .line 371
    invoke-interface {v2}, Landroidx/camera/core/ImageProxy;->close()V

    .line 372
    .line 373
    .line 374
    :cond_a
    if-eqz v3, :cond_b

    .line 375
    .line 376
    invoke-virtual {v5}, Landroid/media/ImageWriter;->close()V

    .line 377
    .line 378
    .line 379
    const-string v2, "YuvToJpegProcessor"

    .line 380
    .line 381
    const-string v3, "Closed after completion of last image processed."

    .line 382
    .line 383
    invoke-static {v2, v3}, Landroidx/camera/core/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 384
    .line 385
    .line 386
    :cond_b
    throw v0

    .line 387
    :goto_d
    :try_start_e
    monitor-exit v7
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_8

    .line 388
    throw v0

    .line 389
    :cond_c
    :goto_e
    iget-object v7, v1, Lz/o;->c:Ljava/lang/Object;

    .line 390
    .line 391
    monitor-enter v7

    .line 392
    if-eqz v6, :cond_d

    .line 393
    .line 394
    :try_start_f
    iget v0, v1, Lz/o;->e:I

    .line 395
    .line 396
    add-int/lit8 v6, v0, -0x1

    .line 397
    .line 398
    iput v6, v1, Lz/o;->e:I

    .line 399
    .line 400
    if-nez v0, :cond_d

    .line 401
    .line 402
    iget-boolean v0, v1, Lz/o;->d:Z

    .line 403
    .line 404
    if-eqz v0, :cond_d

    .line 405
    .line 406
    move v3, v4

    .line 407
    goto :goto_f

    .line 408
    :catchall_9
    move-exception v0

    .line 409
    goto :goto_11

    .line 410
    :cond_d
    :goto_f
    monitor-exit v7
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_9

    .line 411
    if-eqz v9, :cond_e

    .line 412
    .line 413
    invoke-virtual {v9}, Landroid/media/Image;->close()V

    .line 414
    .line 415
    .line 416
    :cond_e
    if-eqz v2, :cond_f

    .line 417
    .line 418
    invoke-interface {v2}, Landroidx/camera/core/ImageProxy;->close()V

    .line 419
    .line 420
    .line 421
    :cond_f
    if-eqz v3, :cond_10

    .line 422
    .line 423
    goto/16 :goto_6

    .line 424
    .line 425
    :cond_10
    :goto_10
    return-void

    .line 426
    :goto_11
    :try_start_10
    monitor-exit v7
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_9

    .line 427
    throw v0

    .line 428
    :catchall_a
    move-exception v0

    .line 429
    :try_start_11
    monitor-exit v2
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_a

    .line 430
    throw v0
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
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
.end method

.method public b(Landroid/view/Surface;I)V
    .locals 2

    .line 1
    const/16 v0, 0x100

    .line 2
    .line 3
    if-ne p2, v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    :goto_0
    const-string v1, "YuvToJpegProcessor only supports JPEG output format."

    .line 9
    .line 10
    invoke-static {v0, v1}, Landroidx/core/util/g;->j(ZLjava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lz/o;->c:Ljava/lang/Object;

    .line 14
    .line 15
    monitor-enter v0

    .line 16
    :try_start_0
    iget-boolean v1, p0, Lz/o;->d:Z

    .line 17
    .line 18
    if-nez v1, :cond_2

    .line 19
    .line 20
    iget-object v1, p0, Lz/o;->f:Landroid/media/ImageWriter;

    .line 21
    .line 22
    if-nez v1, :cond_1

    .line 23
    .line 24
    iget v1, p0, Lz/o;->b:I

    .line 25
    .line 26
    invoke-static {p1, v1, p2}, La0/a;->d(Landroid/view/Surface;II)Landroid/media/ImageWriter;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iput-object p1, p0, Lz/o;->f:Landroid/media/ImageWriter;

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 34
    .line 35
    const-string p2, "Output surface already set."

    .line 36
    .line 37
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw p1

    .line 41
    :cond_2
    const-string p1, "YuvToJpegProcessor"

    .line 42
    .line 43
    const-string p2, "Cannot set output surface. Processor is closed."

    .line 44
    .line 45
    invoke-static {p1, p2}, Landroidx/camera/core/r1;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    :goto_1
    monitor-exit v0

    .line 49
    return-void

    .line 50
    :catchall_0
    move-exception p1

    .line 51
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    throw p1
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

.method public c(Landroid/util/Size;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lz/o;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    new-instance v1, Landroid/graphics/Rect;

    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    const/4 v3, 0x0

    .line 15
    invoke-direct {v1, v3, v3, v2, p1}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 16
    .line 17
    .line 18
    iput-object v1, p0, Lz/o;->g:Landroid/graphics/Rect;

    .line 19
    .line 20
    monitor-exit v0

    .line 21
    return-void

    .line 22
    :catchall_0
    move-exception p1

    .line 23
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    throw p1
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

.method public d()V
    .locals 3

    .line 1
    iget-object v0, p0, Lz/o;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Lz/o;->d:Z

    .line 5
    .line 6
    if-nez v1, :cond_1

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    iput-boolean v1, p0, Lz/o;->d:Z

    .line 10
    .line 11
    iget v1, p0, Lz/o;->e:I

    .line 12
    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    iget-object v1, p0, Lz/o;->f:Landroid/media/ImageWriter;

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    const-string v1, "YuvToJpegProcessor"

    .line 20
    .line 21
    const-string v2, "No processing in progress. Closing immediately."

    .line 22
    .line 23
    invoke-static {v1, v2}, Landroidx/camera/core/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Lz/o;->f:Landroid/media/ImageWriter;

    .line 27
    .line 28
    invoke-virtual {v1}, Landroid/media/ImageWriter;->close()V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const-string v1, "YuvToJpegProcessor"

    .line 33
    .line 34
    const-string v2, "close() called while processing. Will close after completion."

    .line 35
    .line 36
    invoke-static {v1, v2}, Landroidx/camera/core/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    :cond_1
    :goto_0
    monitor-exit v0

    .line 40
    return-void

    .line 41
    :catchall_0
    move-exception v1

    .line 42
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    throw v1
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
.end method

.method public f(I)V
    .locals 0

    iput p1, p0, Lz/o;->a:I

    return-void
.end method
