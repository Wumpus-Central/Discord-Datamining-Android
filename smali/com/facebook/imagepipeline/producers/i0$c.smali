.class Lcom/facebook/imagepipeline/producers/i0$c;
.super Lcom/facebook/imagepipeline/producers/o;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/imagepipeline/producers/i0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/imagepipeline/producers/o<",
        "Lu5/e;",
        "Lu5/e;",
        ">;"
    }
.end annotation


# instance fields
.field private final c:Lo5/e;

.field private final d:Lcom/facebook/cache/common/CacheKey;

.field private final e:Ly3/h;

.field private final f:Ly3/a;

.field private final g:Lu5/e;


# direct methods
.method private constructor <init>(Lcom/facebook/imagepipeline/producers/Consumer;Lo5/e;Lcom/facebook/cache/common/CacheKey;Ly3/h;Ly3/a;Lu5/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/producers/Consumer<",
            "Lu5/e;",
            ">;",
            "Lo5/e;",
            "Lcom/facebook/cache/common/CacheKey;",
            "Ly3/h;",
            "Ly3/a;",
            "Lu5/e;",
            ")V"
        }
    .end annotation

    .line 2
    invoke-direct {p0, p1}, Lcom/facebook/imagepipeline/producers/o;-><init>(Lcom/facebook/imagepipeline/producers/Consumer;)V

    .line 3
    iput-object p2, p0, Lcom/facebook/imagepipeline/producers/i0$c;->c:Lo5/e;

    .line 4
    iput-object p3, p0, Lcom/facebook/imagepipeline/producers/i0$c;->d:Lcom/facebook/cache/common/CacheKey;

    .line 5
    iput-object p4, p0, Lcom/facebook/imagepipeline/producers/i0$c;->e:Ly3/h;

    .line 6
    iput-object p5, p0, Lcom/facebook/imagepipeline/producers/i0$c;->f:Ly3/a;

    .line 7
    iput-object p6, p0, Lcom/facebook/imagepipeline/producers/i0$c;->g:Lu5/e;

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/imagepipeline/producers/Consumer;Lo5/e;Lcom/facebook/cache/common/CacheKey;Ly3/h;Ly3/a;Lu5/e;Lcom/facebook/imagepipeline/producers/i0$a;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p6}, Lcom/facebook/imagepipeline/producers/i0$c;-><init>(Lcom/facebook/imagepipeline/producers/Consumer;Lo5/e;Lcom/facebook/cache/common/CacheKey;Ly3/h;Ly3/a;Lu5/e;)V

    return-void
.end method

.method private p(Ljava/io/InputStream;Ljava/io/OutputStream;I)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/i0$c;->f:Ly3/a;

    .line 2
    .line 3
    const/16 v1, 0x4000

    .line 4
    .line 5
    invoke-interface {v0, v1}, Ly3/e;->get(I)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, [B

    .line 10
    .line 11
    move v2, p3

    .line 12
    :cond_0
    :goto_0
    const/4 v3, 0x0

    .line 13
    if-lez v2, :cond_1

    .line 14
    .line 15
    :try_start_0
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    invoke-virtual {p1, v0, v3, v4}, Ljava/io/InputStream;->read([BII)I

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    if-ltz v4, :cond_1

    .line 24
    .line 25
    if-lez v4, :cond_0

    .line 26
    .line 27
    invoke-virtual {p2, v0, v3, v4}, Ljava/io/OutputStream;->write([BII)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    .line 30
    sub-int/2addr v2, v4

    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception p1

    .line 33
    iget-object p2, p0, Lcom/facebook/imagepipeline/producers/i0$c;->f:Ly3/a;

    .line 34
    .line 35
    invoke-interface {p2, v0}, Ly3/e;->release(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    throw p1

    .line 39
    :cond_1
    iget-object p1, p0, Lcom/facebook/imagepipeline/producers/i0$c;->f:Ly3/a;

    .line 40
    .line 41
    invoke-interface {p1, v0}, Ly3/e;->release(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    if-gtz v2, :cond_2

    .line 45
    .line 46
    return-void

    .line 47
    :cond_2
    new-instance p1, Ljava/io/IOException;

    .line 48
    .line 49
    const/4 p2, 0x2

    .line 50
    new-array p2, p2, [Ljava/lang/Object;

    .line 51
    .line 52
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 53
    .line 54
    .line 55
    move-result-object p3

    .line 56
    aput-object p3, p2, v3

    .line 57
    .line 58
    const/4 p3, 0x1

    .line 59
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    aput-object v0, p2, p3

    .line 64
    .line 65
    const/4 p3, 0x0

    .line 66
    const-string v0, "Failed to read %d bytes - finished %d short"

    .line 67
    .line 68
    invoke-static {p3, v0, p2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    throw p1
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

.method private q(Lu5/e;Lu5/e;)Ly3/j;
    .locals 3

    .line 1
    invoke-virtual {p2}, Lu5/e;->p()Lcom/facebook/imagepipeline/common/BytesRange;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lv3/j;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lcom/facebook/imagepipeline/common/BytesRange;

    .line 10
    .line 11
    iget v0, v0, Lcom/facebook/imagepipeline/common/BytesRange;->a:I

    .line 12
    .line 13
    invoke-virtual {p2}, Lu5/e;->T()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    add-int/2addr v1, v0

    .line 18
    iget-object v2, p0, Lcom/facebook/imagepipeline/producers/i0$c;->e:Ly3/h;

    .line 19
    .line 20
    invoke-interface {v2, v1}, Ly3/h;->e(I)Ly3/j;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {p1}, Lu5/e;->F()Ljava/io/InputStream;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-direct {p0, p1, v1, v0}, Lcom/facebook/imagepipeline/producers/i0$c;->p(Ljava/io/InputStream;Ljava/io/OutputStream;I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p2}, Lu5/e;->F()Ljava/io/InputStream;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {p2}, Lu5/e;->T()I

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    invoke-direct {p0, p1, v1, p2}, Lcom/facebook/imagepipeline/producers/i0$c;->p(Ljava/io/InputStream;Ljava/io/OutputStream;I)V

    .line 40
    .line 41
    .line 42
    return-object v1
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
.end method

.method private s(Ly3/j;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ly3/j;->b()Ly3/g;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p1}, Lcom/facebook/common/references/CloseableReference;->g0(Ljava/io/Closeable;)Lcom/facebook/common/references/CloseableReference;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const/4 v0, 0x0

    .line 10
    :try_start_0
    new-instance v1, Lu5/e;

    .line 11
    .line 12
    invoke-direct {v1, p1}, Lu5/e;-><init>(Lcom/facebook/common/references/CloseableReference;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 13
    .line 14
    .line 15
    :try_start_1
    invoke-virtual {v1}, Lu5/e;->z0()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/o;->o()Lcom/facebook/imagepipeline/producers/Consumer;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const/4 v2, 0x1

    .line 23
    invoke-interface {v0, v1, v2}, Lcom/facebook/imagepipeline/producers/Consumer;->c(Ljava/lang/Object;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 24
    .line 25
    .line 26
    invoke-static {v1}, Lu5/e;->i(Lu5/e;)V

    .line 27
    .line 28
    .line 29
    invoke-static {p1}, Lcom/facebook/common/references/CloseableReference;->x(Lcom/facebook/common/references/CloseableReference;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :catchall_0
    move-exception v0

    .line 34
    goto :goto_0

    .line 35
    :catchall_1
    move-exception v1

    .line 36
    move-object v3, v1

    .line 37
    move-object v1, v0

    .line 38
    move-object v0, v3

    .line 39
    :goto_0
    invoke-static {v1}, Lu5/e;->i(Lu5/e;)V

    .line 40
    .line 41
    .line 42
    invoke-static {p1}, Lcom/facebook/common/references/CloseableReference;->x(Lcom/facebook/common/references/CloseableReference;)V

    .line 43
    .line 44
    .line 45
    throw v0
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


# virtual methods
.method public bridge synthetic h(Ljava/lang/Object;I)V
    .locals 0

    check-cast p1, Lu5/e;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/imagepipeline/producers/i0$c;->r(Lu5/e;I)V

    return-void
.end method

.method public r(Lu5/e;I)V
    .locals 2

    .line 1
    invoke-static {p2}, Lcom/facebook/imagepipeline/producers/b;->e(I)Z

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
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/i0$c;->g:Lu5/e;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    if-eqz p1, :cond_1

    .line 13
    .line 14
    invoke-virtual {p1}, Lu5/e;->p()Lcom/facebook/imagepipeline/common/BytesRange;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    :try_start_0
    iget-object p2, p0, Lcom/facebook/imagepipeline/producers/i0$c;->g:Lu5/e;

    .line 21
    .line 22
    invoke-direct {p0, p2, p1}, Lcom/facebook/imagepipeline/producers/i0$c;->q(Lu5/e;Lu5/e;)Ly3/j;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    invoke-direct {p0, p2}, Lcom/facebook/imagepipeline/producers/i0$c;->s(Ly3/j;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    .line 29
    :goto_0
    invoke-virtual {p1}, Lu5/e;->close()V

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Lcom/facebook/imagepipeline/producers/i0$c;->g:Lu5/e;

    .line 33
    .line 34
    invoke-virtual {p1}, Lu5/e;->close()V

    .line 35
    .line 36
    .line 37
    goto :goto_1

    .line 38
    :catchall_0
    move-exception p2

    .line 39
    goto :goto_2

    .line 40
    :catch_0
    move-exception p2

    .line 41
    :try_start_1
    const-string v0, "PartialDiskCacheProducer"

    .line 42
    .line 43
    const-string v1, "Error while merging image data"

    .line 44
    .line 45
    invoke-static {v0, v1, p2}, Lw3/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/o;->o()Lcom/facebook/imagepipeline/producers/Consumer;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-interface {v0, p2}, Lcom/facebook/imagepipeline/producers/Consumer;->onFailure(Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :goto_1
    iget-object p1, p0, Lcom/facebook/imagepipeline/producers/i0$c;->c:Lo5/e;

    .line 57
    .line 58
    iget-object p2, p0, Lcom/facebook/imagepipeline/producers/i0$c;->d:Lcom/facebook/cache/common/CacheKey;

    .line 59
    .line 60
    invoke-virtual {p1, p2}, Lo5/e;->r(Lcom/facebook/cache/common/CacheKey;)La2/f;

    .line 61
    .line 62
    .line 63
    goto :goto_3

    .line 64
    :goto_2
    invoke-virtual {p1}, Lu5/e;->close()V

    .line 65
    .line 66
    .line 67
    iget-object p1, p0, Lcom/facebook/imagepipeline/producers/i0$c;->g:Lu5/e;

    .line 68
    .line 69
    invoke-virtual {p1}, Lu5/e;->close()V

    .line 70
    .line 71
    .line 72
    throw p2

    .line 73
    :cond_1
    const/16 v0, 0x8

    .line 74
    .line 75
    invoke-static {p2, v0}, Lcom/facebook/imagepipeline/producers/b;->m(II)Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-eqz v0, :cond_2

    .line 80
    .line 81
    invoke-static {p2}, Lcom/facebook/imagepipeline/producers/b;->d(I)Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-eqz v0, :cond_2

    .line 86
    .line 87
    if-eqz p1, :cond_2

    .line 88
    .line 89
    invoke-virtual {p1}, Lu5/e;->x()Li5/c;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    sget-object v1, Li5/c;->c:Li5/c;

    .line 94
    .line 95
    if-eq v0, v1, :cond_2

    .line 96
    .line 97
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/i0$c;->c:Lo5/e;

    .line 98
    .line 99
    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/i0$c;->d:Lcom/facebook/cache/common/CacheKey;

    .line 100
    .line 101
    invoke-virtual {v0, v1, p1}, Lo5/e;->p(Lcom/facebook/cache/common/CacheKey;Lu5/e;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/o;->o()Lcom/facebook/imagepipeline/producers/Consumer;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-interface {v0, p1, p2}, Lcom/facebook/imagepipeline/producers/Consumer;->c(Ljava/lang/Object;I)V

    .line 109
    .line 110
    .line 111
    goto :goto_3

    .line 112
    :cond_2
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/o;->o()Lcom/facebook/imagepipeline/producers/Consumer;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-interface {v0, p1, p2}, Lcom/facebook/imagepipeline/producers/Consumer;->c(Ljava/lang/Object;I)V

    .line 117
    .line 118
    .line 119
    :goto_3
    return-void
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
.end method
