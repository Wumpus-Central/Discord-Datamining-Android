.class public final Lokio/Buffer$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokio/Buffer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0012\n\u0002\u0008\u000b\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\"\u0010#J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004J\u0008\u0010\n\u001a\u00020\tH\u0016R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u0016\u0010!\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0006\n\u0004\u0008 \u0010\u001e\u00a8\u0006$"
    }
    d2 = {
        "Lokio/Buffer$a;",
        "Ljava/io/Closeable;",
        "",
        "b",
        "",
        "offset",
        "i",
        "newSize",
        "f",
        "",
        "close",
        "Lokio/Buffer;",
        "k",
        "Lokio/Buffer;",
        "buffer",
        "",
        "l",
        "Z",
        "readWrite",
        "Ldk/u;",
        "m",
        "Ldk/u;",
        "segment",
        "n",
        "J",
        "",
        "o",
        "[B",
        "data",
        "p",
        "I",
        "start",
        "q",
        "end",
        "<init>",
        "()V",
        "okio"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# instance fields
.field public k:Lokio/Buffer;

.field public l:Z

.field private m:Ldk/u;

.field public n:J

.field public o:[B

.field public p:I

.field public q:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, -0x1

    .line 5
    .line 6
    iput-wide v0, p0, Lokio/Buffer$a;->n:J

    .line 7
    .line 8
    const/4 v0, -0x1

    .line 9
    iput v0, p0, Lokio/Buffer$a;->p:I

    .line 10
    .line 11
    iput v0, p0, Lokio/Buffer$a;->q:I

    .line 12
    .line 13
    return-void
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
.end method


# virtual methods
.method public final b()I
    .locals 4

    .line 1
    iget-wide v0, p0, Lokio/Buffer$a;->n:J

    .line 2
    .line 3
    iget-object v2, p0, Lokio/Buffer$a;->k:Lokio/Buffer;

    .line 4
    .line 5
    invoke-static {v2}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v2}, Lokio/Buffer;->size()J

    .line 9
    .line 10
    .line 11
    move-result-wide v2

    .line 12
    cmp-long v0, v0, v2

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    :goto_0
    if-eqz v0, :cond_2

    .line 20
    .line 21
    iget-wide v0, p0, Lokio/Buffer$a;->n:J

    .line 22
    .line 23
    const-wide/16 v2, -0x1

    .line 24
    .line 25
    cmp-long v2, v0, v2

    .line 26
    .line 27
    if-nez v2, :cond_1

    .line 28
    .line 29
    const-wide/16 v0, 0x0

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    iget v2, p0, Lokio/Buffer$a;->q:I

    .line 33
    .line 34
    iget v3, p0, Lokio/Buffer$a;->p:I

    .line 35
    .line 36
    sub-int/2addr v2, v3

    .line 37
    int-to-long v2, v2

    .line 38
    add-long/2addr v0, v2

    .line 39
    :goto_1
    invoke-virtual {p0, v0, v1}, Lokio/Buffer$a;->i(J)I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    return v0

    .line 44
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 45
    .line 46
    const-string v1, "no more bytes"

    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw v0
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
.end method

.method public close()V
    .locals 3

    .line 1
    iget-object v0, p0, Lokio/Buffer$a;->k:Lokio/Buffer;

    .line 2
    .line 3
    if-eqz v0, :cond_0

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
    if-eqz v0, :cond_1

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    iput-object v0, p0, Lokio/Buffer$a;->k:Lokio/Buffer;

    .line 12
    .line 13
    iput-object v0, p0, Lokio/Buffer$a;->m:Ldk/u;

    .line 14
    .line 15
    const-wide/16 v1, -0x1

    .line 16
    .line 17
    iput-wide v1, p0, Lokio/Buffer$a;->n:J

    .line 18
    .line 19
    iput-object v0, p0, Lokio/Buffer$a;->o:[B

    .line 20
    .line 21
    const/4 v0, -0x1

    .line 22
    iput v0, p0, Lokio/Buffer$a;->p:I

    .line 23
    .line 24
    iput v0, p0, Lokio/Buffer$a;->q:I

    .line 25
    .line 26
    return-void

    .line 27
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 28
    .line 29
    const-string v1, "not attached to a buffer"

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw v0
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
.end method

.method public final f(J)J
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v1, p1

    .line 4
    .line 5
    iget-object v3, v0, Lokio/Buffer$a;->k:Lokio/Buffer;

    .line 6
    .line 7
    if-eqz v3, :cond_8

    .line 8
    .line 9
    iget-boolean v4, v0, Lokio/Buffer$a;->l:Z

    .line 10
    .line 11
    if-eqz v4, :cond_7

    .line 12
    .line 13
    invoke-virtual {v3}, Lokio/Buffer;->size()J

    .line 14
    .line 15
    .line 16
    move-result-wide v4

    .line 17
    cmp-long v6, v1, v4

    .line 18
    .line 19
    const/4 v8, 0x1

    .line 20
    const-wide/16 v9, 0x0

    .line 21
    .line 22
    if-gtz v6, :cond_4

    .line 23
    .line 24
    cmp-long v6, v1, v9

    .line 25
    .line 26
    if-ltz v6, :cond_0

    .line 27
    .line 28
    move v7, v8

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 v7, 0x0

    .line 31
    :goto_0
    if-eqz v7, :cond_3

    .line 32
    .line 33
    sub-long v6, v4, v1

    .line 34
    .line 35
    :goto_1
    cmp-long v8, v6, v9

    .line 36
    .line 37
    if-lez v8, :cond_2

    .line 38
    .line 39
    iget-object v8, v3, Lokio/Buffer;->k:Ldk/u;

    .line 40
    .line 41
    invoke-static {v8}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    iget-object v8, v8, Ldk/u;->g:Ldk/u;

    .line 45
    .line 46
    invoke-static {v8}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    iget v11, v8, Ldk/u;->c:I

    .line 50
    .line 51
    iget v12, v8, Ldk/u;->b:I

    .line 52
    .line 53
    sub-int v12, v11, v12

    .line 54
    .line 55
    int-to-long v12, v12

    .line 56
    cmp-long v14, v12, v6

    .line 57
    .line 58
    if-gtz v14, :cond_1

    .line 59
    .line 60
    invoke-virtual {v8}, Ldk/u;->b()Ldk/u;

    .line 61
    .line 62
    .line 63
    move-result-object v11

    .line 64
    iput-object v11, v3, Lokio/Buffer;->k:Ldk/u;

    .line 65
    .line 66
    invoke-static {v8}, Ldk/v;->b(Ldk/u;)V

    .line 67
    .line 68
    .line 69
    sub-long/2addr v6, v12

    .line 70
    goto :goto_1

    .line 71
    :cond_1
    long-to-int v6, v6

    .line 72
    sub-int/2addr v11, v6

    .line 73
    iput v11, v8, Ldk/u;->c:I

    .line 74
    .line 75
    :cond_2
    const/4 v6, 0x0

    .line 76
    iput-object v6, v0, Lokio/Buffer$a;->m:Ldk/u;

    .line 77
    .line 78
    iput-wide v1, v0, Lokio/Buffer$a;->n:J

    .line 79
    .line 80
    iput-object v6, v0, Lokio/Buffer$a;->o:[B

    .line 81
    .line 82
    const/4 v6, -0x1

    .line 83
    iput v6, v0, Lokio/Buffer$a;->p:I

    .line 84
    .line 85
    iput v6, v0, Lokio/Buffer$a;->q:I

    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_3
    new-instance v3, Ljava/lang/StringBuilder;

    .line 89
    .line 90
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 91
    .line 92
    .line 93
    const-string v4, "newSize < 0: "

    .line 94
    .line 95
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 106
    .line 107
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    throw v2

    .line 115
    :cond_4
    if-lez v6, :cond_6

    .line 116
    .line 117
    sub-long v11, v1, v4

    .line 118
    .line 119
    move v6, v8

    .line 120
    :goto_2
    cmp-long v13, v11, v9

    .line 121
    .line 122
    if-lez v13, :cond_6

    .line 123
    .line 124
    invoke-virtual {v3, v8}, Lokio/Buffer;->I0(I)Ldk/u;

    .line 125
    .line 126
    .line 127
    move-result-object v13

    .line 128
    iget v14, v13, Ldk/u;->c:I

    .line 129
    .line 130
    rsub-int v14, v14, 0x2000

    .line 131
    .line 132
    int-to-long v14, v14

    .line 133
    invoke-static {v11, v12, v14, v15}, Ljava/lang/Math;->min(JJ)J

    .line 134
    .line 135
    .line 136
    move-result-wide v14

    .line 137
    long-to-int v14, v14

    .line 138
    iget v15, v13, Ldk/u;->c:I

    .line 139
    .line 140
    add-int/2addr v15, v14

    .line 141
    iput v15, v13, Ldk/u;->c:I

    .line 142
    .line 143
    int-to-long v7, v14

    .line 144
    sub-long/2addr v11, v7

    .line 145
    if-eqz v6, :cond_5

    .line 146
    .line 147
    iput-object v13, v0, Lokio/Buffer$a;->m:Ldk/u;

    .line 148
    .line 149
    iput-wide v4, v0, Lokio/Buffer$a;->n:J

    .line 150
    .line 151
    iget-object v6, v13, Ldk/u;->a:[B

    .line 152
    .line 153
    iput-object v6, v0, Lokio/Buffer$a;->o:[B

    .line 154
    .line 155
    sub-int v6, v15, v14

    .line 156
    .line 157
    iput v6, v0, Lokio/Buffer$a;->p:I

    .line 158
    .line 159
    iput v15, v0, Lokio/Buffer$a;->q:I

    .line 160
    .line 161
    const/4 v6, 0x0

    .line 162
    :cond_5
    const/4 v8, 0x1

    .line 163
    goto :goto_2

    .line 164
    :cond_6
    :goto_3
    invoke-virtual {v3, v1, v2}, Lokio/Buffer;->F0(J)V

    .line 165
    .line 166
    .line 167
    return-wide v4

    .line 168
    :cond_7
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 169
    .line 170
    const-string v2, "resizeBuffer() only permitted for read/write buffers"

    .line 171
    .line 172
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    throw v1

    .line 180
    :cond_8
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 181
    .line 182
    const-string v2, "not attached to a buffer"

    .line 183
    .line 184
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    throw v1
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
.end method

.method public final i(J)I
    .locals 11

    .line 1
    iget-object v0, p0, Lokio/Buffer$a;->k:Lokio/Buffer;

    .line 2
    .line 3
    if-eqz v0, :cond_a

    .line 4
    .line 5
    const/4 v1, -0x1

    .line 6
    int-to-long v2, v1

    .line 7
    cmp-long v2, p1, v2

    .line 8
    .line 9
    if-ltz v2, :cond_9

    .line 10
    .line 11
    invoke-virtual {v0}, Lokio/Buffer;->size()J

    .line 12
    .line 13
    .line 14
    move-result-wide v2

    .line 15
    cmp-long v2, p1, v2

    .line 16
    .line 17
    if-gtz v2, :cond_9

    .line 18
    .line 19
    const-wide/16 v2, -0x1

    .line 20
    .line 21
    cmp-long v2, p1, v2

    .line 22
    .line 23
    if-eqz v2, :cond_8

    .line 24
    .line 25
    invoke-virtual {v0}, Lokio/Buffer;->size()J

    .line 26
    .line 27
    .line 28
    move-result-wide v2

    .line 29
    cmp-long v2, p1, v2

    .line 30
    .line 31
    if-nez v2, :cond_0

    .line 32
    .line 33
    goto/16 :goto_3

    .line 34
    .line 35
    :cond_0
    invoke-virtual {v0}, Lokio/Buffer;->size()J

    .line 36
    .line 37
    .line 38
    move-result-wide v1

    .line 39
    iget-object v3, v0, Lokio/Buffer;->k:Ldk/u;

    .line 40
    .line 41
    iget-object v4, p0, Lokio/Buffer$a;->m:Ldk/u;

    .line 42
    .line 43
    const-wide/16 v5, 0x0

    .line 44
    .line 45
    if-eqz v4, :cond_2

    .line 46
    .line 47
    iget-wide v7, p0, Lokio/Buffer$a;->n:J

    .line 48
    .line 49
    iget v9, p0, Lokio/Buffer$a;->p:I

    .line 50
    .line 51
    invoke-static {v4}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    iget v4, v4, Ldk/u;->b:I

    .line 55
    .line 56
    sub-int/2addr v9, v4

    .line 57
    int-to-long v9, v9

    .line 58
    sub-long/2addr v7, v9

    .line 59
    cmp-long v4, v7, p1

    .line 60
    .line 61
    if-lez v4, :cond_1

    .line 62
    .line 63
    iget-object v1, p0, Lokio/Buffer$a;->m:Ldk/u;

    .line 64
    .line 65
    move-object v4, v3

    .line 66
    move-object v3, v1

    .line 67
    move-wide v1, v7

    .line 68
    goto :goto_0

    .line 69
    :cond_1
    iget-object v4, p0, Lokio/Buffer$a;->m:Ldk/u;

    .line 70
    .line 71
    move-wide v5, v7

    .line 72
    goto :goto_0

    .line 73
    :cond_2
    move-object v4, v3

    .line 74
    :goto_0
    sub-long v7, v1, p1

    .line 75
    .line 76
    sub-long v9, p1, v5

    .line 77
    .line 78
    cmp-long v7, v7, v9

    .line 79
    .line 80
    if-lez v7, :cond_3

    .line 81
    .line 82
    :goto_1
    invoke-static {v4}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    iget v1, v4, Ldk/u;->c:I

    .line 86
    .line 87
    iget v2, v4, Ldk/u;->b:I

    .line 88
    .line 89
    sub-int v3, v1, v2

    .line 90
    .line 91
    int-to-long v7, v3

    .line 92
    add-long/2addr v7, v5

    .line 93
    cmp-long v3, p1, v7

    .line 94
    .line 95
    if-ltz v3, :cond_5

    .line 96
    .line 97
    sub-int/2addr v1, v2

    .line 98
    int-to-long v1, v1

    .line 99
    add-long/2addr v5, v1

    .line 100
    iget-object v4, v4, Ldk/u;->f:Ldk/u;

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_3
    :goto_2
    cmp-long v4, v1, p1

    .line 104
    .line 105
    if-lez v4, :cond_4

    .line 106
    .line 107
    invoke-static {v3}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    iget-object v3, v3, Ldk/u;->g:Ldk/u;

    .line 111
    .line 112
    invoke-static {v3}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    iget v4, v3, Ldk/u;->c:I

    .line 116
    .line 117
    iget v5, v3, Ldk/u;->b:I

    .line 118
    .line 119
    sub-int/2addr v4, v5

    .line 120
    int-to-long v4, v4

    .line 121
    sub-long/2addr v1, v4

    .line 122
    goto :goto_2

    .line 123
    :cond_4
    move-wide v5, v1

    .line 124
    move-object v4, v3

    .line 125
    :cond_5
    iget-boolean v1, p0, Lokio/Buffer$a;->l:Z

    .line 126
    .line 127
    if-eqz v1, :cond_7

    .line 128
    .line 129
    invoke-static {v4}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    iget-boolean v1, v4, Ldk/u;->d:Z

    .line 133
    .line 134
    if-eqz v1, :cond_7

    .line 135
    .line 136
    invoke-virtual {v4}, Ldk/u;->f()Ldk/u;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    iget-object v2, v0, Lokio/Buffer;->k:Ldk/u;

    .line 141
    .line 142
    if-ne v2, v4, :cond_6

    .line 143
    .line 144
    iput-object v1, v0, Lokio/Buffer;->k:Ldk/u;

    .line 145
    .line 146
    :cond_6
    invoke-virtual {v4, v1}, Ldk/u;->c(Ldk/u;)Ldk/u;

    .line 147
    .line 148
    .line 149
    move-result-object v4

    .line 150
    iget-object v0, v4, Ldk/u;->g:Ldk/u;

    .line 151
    .line 152
    invoke-static {v0}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v0}, Ldk/u;->b()Ldk/u;

    .line 156
    .line 157
    .line 158
    :cond_7
    iput-object v4, p0, Lokio/Buffer$a;->m:Ldk/u;

    .line 159
    .line 160
    iput-wide p1, p0, Lokio/Buffer$a;->n:J

    .line 161
    .line 162
    invoke-static {v4}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    iget-object v0, v4, Ldk/u;->a:[B

    .line 166
    .line 167
    iput-object v0, p0, Lokio/Buffer$a;->o:[B

    .line 168
    .line 169
    iget v0, v4, Ldk/u;->b:I

    .line 170
    .line 171
    sub-long/2addr p1, v5

    .line 172
    long-to-int p1, p1

    .line 173
    add-int/2addr v0, p1

    .line 174
    iput v0, p0, Lokio/Buffer$a;->p:I

    .line 175
    .line 176
    iget p1, v4, Ldk/u;->c:I

    .line 177
    .line 178
    iput p1, p0, Lokio/Buffer$a;->q:I

    .line 179
    .line 180
    sub-int/2addr p1, v0

    .line 181
    return p1

    .line 182
    :cond_8
    :goto_3
    const/4 v0, 0x0

    .line 183
    iput-object v0, p0, Lokio/Buffer$a;->m:Ldk/u;

    .line 184
    .line 185
    iput-wide p1, p0, Lokio/Buffer$a;->n:J

    .line 186
    .line 187
    iput-object v0, p0, Lokio/Buffer$a;->o:[B

    .line 188
    .line 189
    iput v1, p0, Lokio/Buffer$a;->p:I

    .line 190
    .line 191
    iput v1, p0, Lokio/Buffer$a;->q:I

    .line 192
    .line 193
    return v1

    .line 194
    :cond_9
    new-instance v1, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 195
    .line 196
    sget-object v2, Lkotlin/jvm/internal/k0;->a:Lkotlin/jvm/internal/k0;

    .line 197
    .line 198
    const/4 v2, 0x2

    .line 199
    new-array v3, v2, [Ljava/lang/Object;

    .line 200
    .line 201
    const/4 v4, 0x0

    .line 202
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    aput-object p1, v3, v4

    .line 207
    .line 208
    invoke-virtual {v0}, Lokio/Buffer;->size()J

    .line 209
    .line 210
    .line 211
    move-result-wide p1

    .line 212
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    const/4 p2, 0x1

    .line 217
    aput-object p1, v3, p2

    .line 218
    .line 219
    invoke-static {v3, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object p1

    .line 223
    const-string p2, "offset=%s > size=%s"

    .line 224
    .line 225
    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object p1

    .line 229
    const-string p2, "java.lang.String.format(format, *args)"

    .line 230
    .line 231
    invoke-static {p1, p2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    invoke-direct {v1, p1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    throw v1

    .line 238
    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 239
    .line 240
    const-string p2, "not attached to a buffer"

    .line 241
    .line 242
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object p2

    .line 246
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    throw p1
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
.end method
