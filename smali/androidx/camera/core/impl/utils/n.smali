.class public final Landroidx/camera/core/impl/utils/n;
.super Ljava/io/FilterOutputStream;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/core/impl/utils/n$a;
    }
.end annotation


# static fields
.field private static final q:[B


# instance fields
.field private final k:Landroidx/camera/core/impl/utils/m;

.field private final l:[B

.field private final m:Ljava/nio/ByteBuffer;

.field private n:I

.field private o:I

.field private p:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "Exif\u0000\u0000"

    .line 2
    .line 3
    sget-object v1, Landroidx/camera/core/impl/utils/l;->e:Ljava/nio/charset/Charset;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Landroidx/camera/core/impl/utils/n;->q:[B

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

.method public constructor <init>(Ljava/io/OutputStream;Landroidx/camera/core/impl/utils/m;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/io/BufferedOutputStream;

    .line 2
    .line 3
    const/high16 v1, 0x10000

    .line 4
    .line 5
    invoke-direct {v0, p1, v1}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;I)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, v0}, Ljava/io/FilterOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 9
    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    new-array p1, p1, [B

    .line 13
    .line 14
    iput-object p1, p0, Landroidx/camera/core/impl/utils/n;->l:[B

    .line 15
    .line 16
    const/4 p1, 0x4

    .line 17
    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iput-object p1, p0, Landroidx/camera/core/impl/utils/n;->m:Ljava/nio/ByteBuffer;

    .line 22
    .line 23
    const/4 p1, 0x0

    .line 24
    iput p1, p0, Landroidx/camera/core/impl/utils/n;->n:I

    .line 25
    .line 26
    iput-object p2, p0, Landroidx/camera/core/impl/utils/n;->k:Landroidx/camera/core/impl/utils/m;

    .line 27
    .line 28
    return-void
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

.method private b(I[BII)I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/camera/core/impl/utils/n;->m:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    sub-int/2addr p1, v0

    .line 8
    invoke-static {p4, p1}, Ljava/lang/Math;->min(II)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    iget-object p4, p0, Landroidx/camera/core/impl/utils/n;->m:Ljava/nio/ByteBuffer;

    .line 13
    .line 14
    invoke-virtual {p4, p2, p3, p1}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    .line 15
    .line 16
    .line 17
    return p1
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
.end method

.method private f(Landroidx/camera/core/impl/utils/a;)V
    .locals 14

    .line 1
    sget-object v0, Landroidx/camera/core/impl/utils/m;->i:[[Landroidx/camera/core/impl/utils/o;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    new-array v1, v1, [I

    .line 5
    .line 6
    array-length v0, v0

    .line 7
    new-array v0, v0, [I

    .line 8
    .line 9
    sget-object v2, Landroidx/camera/core/impl/utils/m;->g:[Landroidx/camera/core/impl/utils/o;

    .line 10
    .line 11
    array-length v3, v2

    .line 12
    const/4 v4, 0x0

    .line 13
    move v5, v4

    .line 14
    :goto_0
    if-ge v5, v3, :cond_1

    .line 15
    .line 16
    aget-object v6, v2, v5

    .line 17
    .line 18
    move v7, v4

    .line 19
    :goto_1
    sget-object v8, Landroidx/camera/core/impl/utils/m;->i:[[Landroidx/camera/core/impl/utils/o;

    .line 20
    .line 21
    array-length v8, v8

    .line 22
    if-ge v7, v8, :cond_0

    .line 23
    .line 24
    iget-object v8, p0, Landroidx/camera/core/impl/utils/n;->k:Landroidx/camera/core/impl/utils/m;

    .line 25
    .line 26
    invoke-virtual {v8, v7}, Landroidx/camera/core/impl/utils/m;->b(I)Ljava/util/Map;

    .line 27
    .line 28
    .line 29
    move-result-object v8

    .line 30
    iget-object v9, v6, Landroidx/camera/core/impl/utils/o;->b:Ljava/lang/String;

    .line 31
    .line 32
    invoke-interface {v8, v9}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    add-int/lit8 v7, v7, 0x1

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_0
    add-int/lit8 v5, v5, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    iget-object v2, p0, Landroidx/camera/core/impl/utils/n;->k:Landroidx/camera/core/impl/utils/m;

    .line 42
    .line 43
    const/4 v3, 0x1

    .line 44
    invoke-virtual {v2, v3}, Landroidx/camera/core/impl/utils/m;->b(I)Ljava/util/Map;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    const-wide/16 v5, 0x0

    .line 53
    .line 54
    if-nez v2, :cond_2

    .line 55
    .line 56
    iget-object v2, p0, Landroidx/camera/core/impl/utils/n;->k:Landroidx/camera/core/impl/utils/m;

    .line 57
    .line 58
    invoke-virtual {v2, v4}, Landroidx/camera/core/impl/utils/m;->b(I)Ljava/util/Map;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    sget-object v7, Landroidx/camera/core/impl/utils/m;->g:[Landroidx/camera/core/impl/utils/o;

    .line 63
    .line 64
    aget-object v7, v7, v3

    .line 65
    .line 66
    iget-object v7, v7, Landroidx/camera/core/impl/utils/o;->b:Ljava/lang/String;

    .line 67
    .line 68
    iget-object v8, p0, Landroidx/camera/core/impl/utils/n;->k:Landroidx/camera/core/impl/utils/m;

    .line 69
    .line 70
    invoke-virtual {v8}, Landroidx/camera/core/impl/utils/m;->c()Ljava/nio/ByteOrder;

    .line 71
    .line 72
    .line 73
    move-result-object v8

    .line 74
    invoke-static {v5, v6, v8}, Landroidx/camera/core/impl/utils/l;->f(JLjava/nio/ByteOrder;)Landroidx/camera/core/impl/utils/l;

    .line 75
    .line 76
    .line 77
    move-result-object v8

    .line 78
    invoke-interface {v2, v7, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    :cond_2
    iget-object v2, p0, Landroidx/camera/core/impl/utils/n;->k:Landroidx/camera/core/impl/utils/m;

    .line 82
    .line 83
    const/4 v7, 0x2

    .line 84
    invoke-virtual {v2, v7}, Landroidx/camera/core/impl/utils/m;->b(I)Ljava/util/Map;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    if-nez v2, :cond_3

    .line 93
    .line 94
    iget-object v2, p0, Landroidx/camera/core/impl/utils/n;->k:Landroidx/camera/core/impl/utils/m;

    .line 95
    .line 96
    invoke-virtual {v2, v4}, Landroidx/camera/core/impl/utils/m;->b(I)Ljava/util/Map;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    sget-object v8, Landroidx/camera/core/impl/utils/m;->g:[Landroidx/camera/core/impl/utils/o;

    .line 101
    .line 102
    aget-object v8, v8, v7

    .line 103
    .line 104
    iget-object v8, v8, Landroidx/camera/core/impl/utils/o;->b:Ljava/lang/String;

    .line 105
    .line 106
    iget-object v9, p0, Landroidx/camera/core/impl/utils/n;->k:Landroidx/camera/core/impl/utils/m;

    .line 107
    .line 108
    invoke-virtual {v9}, Landroidx/camera/core/impl/utils/m;->c()Ljava/nio/ByteOrder;

    .line 109
    .line 110
    .line 111
    move-result-object v9

    .line 112
    invoke-static {v5, v6, v9}, Landroidx/camera/core/impl/utils/l;->f(JLjava/nio/ByteOrder;)Landroidx/camera/core/impl/utils/l;

    .line 113
    .line 114
    .line 115
    move-result-object v9

    .line 116
    invoke-interface {v2, v8, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    :cond_3
    iget-object v2, p0, Landroidx/camera/core/impl/utils/n;->k:Landroidx/camera/core/impl/utils/m;

    .line 120
    .line 121
    const/4 v8, 0x3

    .line 122
    invoke-virtual {v2, v8}, Landroidx/camera/core/impl/utils/m;->b(I)Ljava/util/Map;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    .line 127
    .line 128
    .line 129
    move-result v2

    .line 130
    if-nez v2, :cond_4

    .line 131
    .line 132
    iget-object v2, p0, Landroidx/camera/core/impl/utils/n;->k:Landroidx/camera/core/impl/utils/m;

    .line 133
    .line 134
    invoke-virtual {v2, v3}, Landroidx/camera/core/impl/utils/m;->b(I)Ljava/util/Map;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    sget-object v9, Landroidx/camera/core/impl/utils/m;->g:[Landroidx/camera/core/impl/utils/o;

    .line 139
    .line 140
    aget-object v9, v9, v8

    .line 141
    .line 142
    iget-object v9, v9, Landroidx/camera/core/impl/utils/o;->b:Ljava/lang/String;

    .line 143
    .line 144
    iget-object v10, p0, Landroidx/camera/core/impl/utils/n;->k:Landroidx/camera/core/impl/utils/m;

    .line 145
    .line 146
    invoke-virtual {v10}, Landroidx/camera/core/impl/utils/m;->c()Ljava/nio/ByteOrder;

    .line 147
    .line 148
    .line 149
    move-result-object v10

    .line 150
    invoke-static {v5, v6, v10}, Landroidx/camera/core/impl/utils/l;->f(JLjava/nio/ByteOrder;)Landroidx/camera/core/impl/utils/l;

    .line 151
    .line 152
    .line 153
    move-result-object v10

    .line 154
    invoke-interface {v2, v9, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    :cond_4
    move v2, v4

    .line 158
    :goto_2
    sget-object v9, Landroidx/camera/core/impl/utils/m;->i:[[Landroidx/camera/core/impl/utils/o;

    .line 159
    .line 160
    array-length v9, v9

    .line 161
    const/4 v10, 0x4

    .line 162
    if-ge v2, v9, :cond_7

    .line 163
    .line 164
    iget-object v9, p0, Landroidx/camera/core/impl/utils/n;->k:Landroidx/camera/core/impl/utils/m;

    .line 165
    .line 166
    invoke-virtual {v9, v2}, Landroidx/camera/core/impl/utils/m;->b(I)Ljava/util/Map;

    .line 167
    .line 168
    .line 169
    move-result-object v9

    .line 170
    invoke-interface {v9}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 171
    .line 172
    .line 173
    move-result-object v9

    .line 174
    invoke-interface {v9}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 175
    .line 176
    .line 177
    move-result-object v9

    .line 178
    move v11, v4

    .line 179
    :cond_5
    :goto_3
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 180
    .line 181
    .line 182
    move-result v12

    .line 183
    if-eqz v12, :cond_6

    .line 184
    .line 185
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v12

    .line 189
    check-cast v12, Ljava/util/Map$Entry;

    .line 190
    .line 191
    invoke-interface {v12}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v12

    .line 195
    check-cast v12, Landroidx/camera/core/impl/utils/l;

    .line 196
    .line 197
    invoke-virtual {v12}, Landroidx/camera/core/impl/utils/l;->j()I

    .line 198
    .line 199
    .line 200
    move-result v12

    .line 201
    if-le v12, v10, :cond_5

    .line 202
    .line 203
    add-int/2addr v11, v12

    .line 204
    goto :goto_3

    .line 205
    :cond_6
    aget v9, v0, v2

    .line 206
    .line 207
    add-int/2addr v9, v11

    .line 208
    aput v9, v0, v2

    .line 209
    .line 210
    add-int/lit8 v2, v2, 0x1

    .line 211
    .line 212
    goto :goto_2

    .line 213
    :cond_7
    const/16 v2, 0x8

    .line 214
    .line 215
    move v11, v2

    .line 216
    move v9, v4

    .line 217
    :goto_4
    sget-object v12, Landroidx/camera/core/impl/utils/m;->i:[[Landroidx/camera/core/impl/utils/o;

    .line 218
    .line 219
    array-length v12, v12

    .line 220
    if-ge v9, v12, :cond_9

    .line 221
    .line 222
    iget-object v12, p0, Landroidx/camera/core/impl/utils/n;->k:Landroidx/camera/core/impl/utils/m;

    .line 223
    .line 224
    invoke-virtual {v12, v9}, Landroidx/camera/core/impl/utils/m;->b(I)Ljava/util/Map;

    .line 225
    .line 226
    .line 227
    move-result-object v12

    .line 228
    invoke-interface {v12}, Ljava/util/Map;->isEmpty()Z

    .line 229
    .line 230
    .line 231
    move-result v12

    .line 232
    if-nez v12, :cond_8

    .line 233
    .line 234
    aput v11, v1, v9

    .line 235
    .line 236
    iget-object v12, p0, Landroidx/camera/core/impl/utils/n;->k:Landroidx/camera/core/impl/utils/m;

    .line 237
    .line 238
    invoke-virtual {v12, v9}, Landroidx/camera/core/impl/utils/m;->b(I)Ljava/util/Map;

    .line 239
    .line 240
    .line 241
    move-result-object v12

    .line 242
    invoke-interface {v12}, Ljava/util/Map;->size()I

    .line 243
    .line 244
    .line 245
    move-result v12

    .line 246
    mul-int/lit8 v12, v12, 0xc

    .line 247
    .line 248
    add-int/2addr v12, v7

    .line 249
    add-int/2addr v12, v10

    .line 250
    aget v13, v0, v9

    .line 251
    .line 252
    add-int/2addr v12, v13

    .line 253
    add-int/2addr v11, v12

    .line 254
    :cond_8
    add-int/lit8 v9, v9, 0x1

    .line 255
    .line 256
    goto :goto_4

    .line 257
    :cond_9
    add-int/2addr v11, v2

    .line 258
    iget-object v0, p0, Landroidx/camera/core/impl/utils/n;->k:Landroidx/camera/core/impl/utils/m;

    .line 259
    .line 260
    invoke-virtual {v0, v3}, Landroidx/camera/core/impl/utils/m;->b(I)Ljava/util/Map;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 265
    .line 266
    .line 267
    move-result v0

    .line 268
    if-nez v0, :cond_a

    .line 269
    .line 270
    iget-object v0, p0, Landroidx/camera/core/impl/utils/n;->k:Landroidx/camera/core/impl/utils/m;

    .line 271
    .line 272
    invoke-virtual {v0, v4}, Landroidx/camera/core/impl/utils/m;->b(I)Ljava/util/Map;

    .line 273
    .line 274
    .line 275
    move-result-object v0

    .line 276
    sget-object v2, Landroidx/camera/core/impl/utils/m;->g:[Landroidx/camera/core/impl/utils/o;

    .line 277
    .line 278
    aget-object v2, v2, v3

    .line 279
    .line 280
    iget-object v2, v2, Landroidx/camera/core/impl/utils/o;->b:Ljava/lang/String;

    .line 281
    .line 282
    aget v9, v1, v3

    .line 283
    .line 284
    int-to-long v12, v9

    .line 285
    iget-object v9, p0, Landroidx/camera/core/impl/utils/n;->k:Landroidx/camera/core/impl/utils/m;

    .line 286
    .line 287
    invoke-virtual {v9}, Landroidx/camera/core/impl/utils/m;->c()Ljava/nio/ByteOrder;

    .line 288
    .line 289
    .line 290
    move-result-object v9

    .line 291
    invoke-static {v12, v13, v9}, Landroidx/camera/core/impl/utils/l;->f(JLjava/nio/ByteOrder;)Landroidx/camera/core/impl/utils/l;

    .line 292
    .line 293
    .line 294
    move-result-object v9

    .line 295
    invoke-interface {v0, v2, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    :cond_a
    iget-object v0, p0, Landroidx/camera/core/impl/utils/n;->k:Landroidx/camera/core/impl/utils/m;

    .line 299
    .line 300
    invoke-virtual {v0, v7}, Landroidx/camera/core/impl/utils/m;->b(I)Ljava/util/Map;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 305
    .line 306
    .line 307
    move-result v0

    .line 308
    if-nez v0, :cond_b

    .line 309
    .line 310
    iget-object v0, p0, Landroidx/camera/core/impl/utils/n;->k:Landroidx/camera/core/impl/utils/m;

    .line 311
    .line 312
    invoke-virtual {v0, v4}, Landroidx/camera/core/impl/utils/m;->b(I)Ljava/util/Map;

    .line 313
    .line 314
    .line 315
    move-result-object v0

    .line 316
    sget-object v2, Landroidx/camera/core/impl/utils/m;->g:[Landroidx/camera/core/impl/utils/o;

    .line 317
    .line 318
    aget-object v2, v2, v7

    .line 319
    .line 320
    iget-object v2, v2, Landroidx/camera/core/impl/utils/o;->b:Ljava/lang/String;

    .line 321
    .line 322
    aget v9, v1, v7

    .line 323
    .line 324
    int-to-long v12, v9

    .line 325
    iget-object v9, p0, Landroidx/camera/core/impl/utils/n;->k:Landroidx/camera/core/impl/utils/m;

    .line 326
    .line 327
    invoke-virtual {v9}, Landroidx/camera/core/impl/utils/m;->c()Ljava/nio/ByteOrder;

    .line 328
    .line 329
    .line 330
    move-result-object v9

    .line 331
    invoke-static {v12, v13, v9}, Landroidx/camera/core/impl/utils/l;->f(JLjava/nio/ByteOrder;)Landroidx/camera/core/impl/utils/l;

    .line 332
    .line 333
    .line 334
    move-result-object v9

    .line 335
    invoke-interface {v0, v2, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    :cond_b
    iget-object v0, p0, Landroidx/camera/core/impl/utils/n;->k:Landroidx/camera/core/impl/utils/m;

    .line 339
    .line 340
    invoke-virtual {v0, v8}, Landroidx/camera/core/impl/utils/m;->b(I)Ljava/util/Map;

    .line 341
    .line 342
    .line 343
    move-result-object v0

    .line 344
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 345
    .line 346
    .line 347
    move-result v0

    .line 348
    if-nez v0, :cond_c

    .line 349
    .line 350
    iget-object v0, p0, Landroidx/camera/core/impl/utils/n;->k:Landroidx/camera/core/impl/utils/m;

    .line 351
    .line 352
    invoke-virtual {v0, v3}, Landroidx/camera/core/impl/utils/m;->b(I)Ljava/util/Map;

    .line 353
    .line 354
    .line 355
    move-result-object v0

    .line 356
    sget-object v2, Landroidx/camera/core/impl/utils/m;->g:[Landroidx/camera/core/impl/utils/o;

    .line 357
    .line 358
    aget-object v2, v2, v8

    .line 359
    .line 360
    iget-object v2, v2, Landroidx/camera/core/impl/utils/o;->b:Ljava/lang/String;

    .line 361
    .line 362
    aget v3, v1, v8

    .line 363
    .line 364
    int-to-long v8, v3

    .line 365
    iget-object v3, p0, Landroidx/camera/core/impl/utils/n;->k:Landroidx/camera/core/impl/utils/m;

    .line 366
    .line 367
    invoke-virtual {v3}, Landroidx/camera/core/impl/utils/m;->c()Ljava/nio/ByteOrder;

    .line 368
    .line 369
    .line 370
    move-result-object v3

    .line 371
    invoke-static {v8, v9, v3}, Landroidx/camera/core/impl/utils/l;->f(JLjava/nio/ByteOrder;)Landroidx/camera/core/impl/utils/l;

    .line 372
    .line 373
    .line 374
    move-result-object v3

    .line 375
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    :cond_c
    invoke-virtual {p1, v11}, Landroidx/camera/core/impl/utils/a;->p(I)V

    .line 379
    .line 380
    .line 381
    sget-object v0, Landroidx/camera/core/impl/utils/n;->q:[B

    .line 382
    .line 383
    invoke-virtual {p1, v0}, Landroidx/camera/core/impl/utils/a;->write([B)V

    .line 384
    .line 385
    .line 386
    iget-object v0, p0, Landroidx/camera/core/impl/utils/n;->k:Landroidx/camera/core/impl/utils/m;

    .line 387
    .line 388
    invoke-virtual {v0}, Landroidx/camera/core/impl/utils/m;->c()Ljava/nio/ByteOrder;

    .line 389
    .line 390
    .line 391
    move-result-object v0

    .line 392
    sget-object v2, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 393
    .line 394
    if-ne v0, v2, :cond_d

    .line 395
    .line 396
    const/16 v0, 0x4d4d

    .line 397
    .line 398
    goto :goto_5

    .line 399
    :cond_d
    const/16 v0, 0x4949

    .line 400
    .line 401
    :goto_5
    invoke-virtual {p1, v0}, Landroidx/camera/core/impl/utils/a;->k(S)V

    .line 402
    .line 403
    .line 404
    iget-object v0, p0, Landroidx/camera/core/impl/utils/n;->k:Landroidx/camera/core/impl/utils/m;

    .line 405
    .line 406
    invoke-virtual {v0}, Landroidx/camera/core/impl/utils/m;->c()Ljava/nio/ByteOrder;

    .line 407
    .line 408
    .line 409
    move-result-object v0

    .line 410
    invoke-virtual {p1, v0}, Landroidx/camera/core/impl/utils/a;->b(Ljava/nio/ByteOrder;)V

    .line 411
    .line 412
    .line 413
    const/16 v0, 0x2a

    .line 414
    .line 415
    invoke-virtual {p1, v0}, Landroidx/camera/core/impl/utils/a;->p(I)V

    .line 416
    .line 417
    .line 418
    const-wide/16 v2, 0x8

    .line 419
    .line 420
    invoke-virtual {p1, v2, v3}, Landroidx/camera/core/impl/utils/a;->l(J)V

    .line 421
    .line 422
    .line 423
    move v0, v4

    .line 424
    :goto_6
    sget-object v2, Landroidx/camera/core/impl/utils/m;->i:[[Landroidx/camera/core/impl/utils/o;

    .line 425
    .line 426
    array-length v2, v2

    .line 427
    if-ge v0, v2, :cond_13

    .line 428
    .line 429
    iget-object v2, p0, Landroidx/camera/core/impl/utils/n;->k:Landroidx/camera/core/impl/utils/m;

    .line 430
    .line 431
    invoke-virtual {v2, v0}, Landroidx/camera/core/impl/utils/m;->b(I)Ljava/util/Map;

    .line 432
    .line 433
    .line 434
    move-result-object v2

    .line 435
    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    .line 436
    .line 437
    .line 438
    move-result v2

    .line 439
    if-nez v2, :cond_12

    .line 440
    .line 441
    iget-object v2, p0, Landroidx/camera/core/impl/utils/n;->k:Landroidx/camera/core/impl/utils/m;

    .line 442
    .line 443
    invoke-virtual {v2, v0}, Landroidx/camera/core/impl/utils/m;->b(I)Ljava/util/Map;

    .line 444
    .line 445
    .line 446
    move-result-object v2

    .line 447
    invoke-interface {v2}, Ljava/util/Map;->size()I

    .line 448
    .line 449
    .line 450
    move-result v2

    .line 451
    invoke-virtual {p1, v2}, Landroidx/camera/core/impl/utils/a;->p(I)V

    .line 452
    .line 453
    .line 454
    aget v2, v1, v0

    .line 455
    .line 456
    add-int/2addr v2, v7

    .line 457
    iget-object v3, p0, Landroidx/camera/core/impl/utils/n;->k:Landroidx/camera/core/impl/utils/m;

    .line 458
    .line 459
    invoke-virtual {v3, v0}, Landroidx/camera/core/impl/utils/m;->b(I)Ljava/util/Map;

    .line 460
    .line 461
    .line 462
    move-result-object v3

    .line 463
    invoke-interface {v3}, Ljava/util/Map;->size()I

    .line 464
    .line 465
    .line 466
    move-result v3

    .line 467
    mul-int/lit8 v3, v3, 0xc

    .line 468
    .line 469
    add-int/2addr v2, v3

    .line 470
    add-int/2addr v2, v10

    .line 471
    iget-object v3, p0, Landroidx/camera/core/impl/utils/n;->k:Landroidx/camera/core/impl/utils/m;

    .line 472
    .line 473
    invoke-virtual {v3, v0}, Landroidx/camera/core/impl/utils/m;->b(I)Ljava/util/Map;

    .line 474
    .line 475
    .line 476
    move-result-object v3

    .line 477
    invoke-interface {v3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 478
    .line 479
    .line 480
    move-result-object v3

    .line 481
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 482
    .line 483
    .line 484
    move-result-object v3

    .line 485
    :cond_e
    :goto_7
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 486
    .line 487
    .line 488
    move-result v8

    .line 489
    if-eqz v8, :cond_10

    .line 490
    .line 491
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 492
    .line 493
    .line 494
    move-result-object v8

    .line 495
    check-cast v8, Ljava/util/Map$Entry;

    .line 496
    .line 497
    sget-object v9, Landroidx/camera/core/impl/utils/m$b;->f:Ljava/util/List;

    .line 498
    .line 499
    invoke-interface {v9, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 500
    .line 501
    .line 502
    move-result-object v9

    .line 503
    check-cast v9, Ljava/util/HashMap;

    .line 504
    .line 505
    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 506
    .line 507
    .line 508
    move-result-object v11

    .line 509
    invoke-virtual {v9, v11}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 510
    .line 511
    .line 512
    move-result-object v9

    .line 513
    check-cast v9, Landroidx/camera/core/impl/utils/o;

    .line 514
    .line 515
    new-instance v11, Ljava/lang/StringBuilder;

    .line 516
    .line 517
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 518
    .line 519
    .line 520
    const-string v12, "Tag not supported: "

    .line 521
    .line 522
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 523
    .line 524
    .line 525
    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 526
    .line 527
    .line 528
    move-result-object v12

    .line 529
    check-cast v12, Ljava/lang/String;

    .line 530
    .line 531
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 532
    .line 533
    .line 534
    const-string v12, ". Tag needs to be ported from ExifInterface to ExifData."

    .line 535
    .line 536
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 537
    .line 538
    .line 539
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 540
    .line 541
    .line 542
    move-result-object v11

    .line 543
    invoke-static {v9, v11}, Landroidx/core/util/g;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 544
    .line 545
    .line 546
    move-result-object v9

    .line 547
    check-cast v9, Landroidx/camera/core/impl/utils/o;

    .line 548
    .line 549
    iget v9, v9, Landroidx/camera/core/impl/utils/o;->a:I

    .line 550
    .line 551
    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 552
    .line 553
    .line 554
    move-result-object v8

    .line 555
    check-cast v8, Landroidx/camera/core/impl/utils/l;

    .line 556
    .line 557
    invoke-virtual {v8}, Landroidx/camera/core/impl/utils/l;->j()I

    .line 558
    .line 559
    .line 560
    move-result v11

    .line 561
    invoke-virtual {p1, v9}, Landroidx/camera/core/impl/utils/a;->p(I)V

    .line 562
    .line 563
    .line 564
    iget v9, v8, Landroidx/camera/core/impl/utils/l;->a:I

    .line 565
    .line 566
    invoke-virtual {p1, v9}, Landroidx/camera/core/impl/utils/a;->p(I)V

    .line 567
    .line 568
    .line 569
    iget v9, v8, Landroidx/camera/core/impl/utils/l;->b:I

    .line 570
    .line 571
    invoke-virtual {p1, v9}, Landroidx/camera/core/impl/utils/a;->i(I)V

    .line 572
    .line 573
    .line 574
    if-le v11, v10, :cond_f

    .line 575
    .line 576
    int-to-long v8, v2

    .line 577
    invoke-virtual {p1, v8, v9}, Landroidx/camera/core/impl/utils/a;->l(J)V

    .line 578
    .line 579
    .line 580
    add-int/2addr v2, v11

    .line 581
    goto :goto_7

    .line 582
    :cond_f
    iget-object v8, v8, Landroidx/camera/core/impl/utils/l;->d:[B

    .line 583
    .line 584
    invoke-virtual {p1, v8}, Landroidx/camera/core/impl/utils/a;->write([B)V

    .line 585
    .line 586
    .line 587
    if-ge v11, v10, :cond_e

    .line 588
    .line 589
    :goto_8
    if-ge v11, v10, :cond_e

    .line 590
    .line 591
    invoke-virtual {p1, v4}, Landroidx/camera/core/impl/utils/a;->f(I)V

    .line 592
    .line 593
    .line 594
    add-int/lit8 v11, v11, 0x1

    .line 595
    .line 596
    goto :goto_8

    .line 597
    :cond_10
    invoke-virtual {p1, v5, v6}, Landroidx/camera/core/impl/utils/a;->l(J)V

    .line 598
    .line 599
    .line 600
    iget-object v2, p0, Landroidx/camera/core/impl/utils/n;->k:Landroidx/camera/core/impl/utils/m;

    .line 601
    .line 602
    invoke-virtual {v2, v0}, Landroidx/camera/core/impl/utils/m;->b(I)Ljava/util/Map;

    .line 603
    .line 604
    .line 605
    move-result-object v2

    .line 606
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 607
    .line 608
    .line 609
    move-result-object v2

    .line 610
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 611
    .line 612
    .line 613
    move-result-object v2

    .line 614
    :cond_11
    :goto_9
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 615
    .line 616
    .line 617
    move-result v3

    .line 618
    if-eqz v3, :cond_12

    .line 619
    .line 620
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 621
    .line 622
    .line 623
    move-result-object v3

    .line 624
    check-cast v3, Ljava/util/Map$Entry;

    .line 625
    .line 626
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 627
    .line 628
    .line 629
    move-result-object v3

    .line 630
    check-cast v3, Landroidx/camera/core/impl/utils/l;

    .line 631
    .line 632
    iget-object v3, v3, Landroidx/camera/core/impl/utils/l;->d:[B

    .line 633
    .line 634
    array-length v8, v3

    .line 635
    if-le v8, v10, :cond_11

    .line 636
    .line 637
    array-length v8, v3

    .line 638
    invoke-virtual {p1, v3, v4, v8}, Landroidx/camera/core/impl/utils/a;->write([BII)V

    .line 639
    .line 640
    .line 641
    goto :goto_9

    .line 642
    :cond_12
    add-int/lit8 v0, v0, 0x1

    .line 643
    .line 644
    goto/16 :goto_6

    .line 645
    .line 646
    :cond_13
    sget-object v0, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 647
    .line 648
    invoke-virtual {p1, v0}, Landroidx/camera/core/impl/utils/a;->b(Ljava/nio/ByteOrder;)V

    .line 649
    .line 650
    .line 651
    return-void
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


# virtual methods
.method public write(I)V
    .locals 2

    .line 37
    iget-object v0, p0, Landroidx/camera/core/impl/utils/n;->l:[B

    and-int/lit16 p1, p1, 0xff

    int-to-byte p1, p1

    const/4 v1, 0x0

    aput-byte p1, v0, v1

    .line 38
    invoke-virtual {p0, v0}, Landroidx/camera/core/impl/utils/n;->write([B)V

    return-void
.end method

.method public write([B)V
    .locals 2

    .line 39
    array-length v0, p1

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1, v0}, Landroidx/camera/core/impl/utils/n;->write([BII)V

    return-void
.end method

.method public write([BII)V
    .locals 6

    .line 1
    :goto_0
    iget v0, p0, Landroidx/camera/core/impl/utils/n;->o:I

    const/4 v1, 0x2

    if-gtz v0, :cond_0

    iget v2, p0, Landroidx/camera/core/impl/utils/n;->p:I

    if-gtz v2, :cond_0

    iget v2, p0, Landroidx/camera/core/impl/utils/n;->n:I

    if-eq v2, v1, :cond_c

    :cond_0
    if-lez p3, :cond_c

    if-lez v0, :cond_1

    .line 2
    invoke-static {p3, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    sub-int/2addr p3, v0

    .line 3
    iget v2, p0, Landroidx/camera/core/impl/utils/n;->o:I

    sub-int/2addr v2, v0

    iput v2, p0, Landroidx/camera/core/impl/utils/n;->o:I

    add-int/2addr p2, v0

    .line 4
    :cond_1
    iget v0, p0, Landroidx/camera/core/impl/utils/n;->p:I

    if-lez v0, :cond_2

    .line 5
    invoke-static {p3, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 6
    iget-object v2, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    invoke-virtual {v2, p1, p2, v0}, Ljava/io/OutputStream;->write([BII)V

    sub-int/2addr p3, v0

    .line 7
    iget v2, p0, Landroidx/camera/core/impl/utils/n;->p:I

    sub-int/2addr v2, v0

    iput v2, p0, Landroidx/camera/core/impl/utils/n;->p:I

    add-int/2addr p2, v0

    :cond_2
    if-nez p3, :cond_3

    return-void

    .line 8
    :cond_3
    iget v0, p0, Landroidx/camera/core/impl/utils/n;->n:I

    const/16 v2, -0x1f

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v0, :cond_9

    if-eq v0, v3, :cond_4

    goto :goto_0

    :cond_4
    const/4 v0, 0x4

    .line 9
    invoke-direct {p0, v0, p1, p2, p3}, Landroidx/camera/core/impl/utils/n;->b(I[BII)I

    move-result v3

    add-int/2addr p2, v3

    sub-int/2addr p3, v3

    .line 10
    iget-object v3, p0, Landroidx/camera/core/impl/utils/n;->m:Ljava/nio/ByteBuffer;

    invoke-virtual {v3}, Ljava/nio/Buffer;->position()I

    move-result v3

    if-ne v3, v1, :cond_5

    .line 11
    iget-object v3, p0, Landroidx/camera/core/impl/utils/n;->m:Ljava/nio/ByteBuffer;

    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v3

    const/16 v5, -0x27

    if-ne v3, v5, :cond_5

    .line 12
    iget-object v3, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    iget-object v5, p0, Landroidx/camera/core/impl/utils/n;->m:Ljava/nio/ByteBuffer;

    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v5

    invoke-virtual {v3, v5, v4, v1}, Ljava/io/OutputStream;->write([BII)V

    .line 13
    iget-object v3, p0, Landroidx/camera/core/impl/utils/n;->m:Ljava/nio/ByteBuffer;

    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 14
    :cond_5
    iget-object v3, p0, Landroidx/camera/core/impl/utils/n;->m:Ljava/nio/ByteBuffer;

    invoke-virtual {v3}, Ljava/nio/Buffer;->position()I

    move-result v3

    if-ge v3, v0, :cond_6

    return-void

    .line 15
    :cond_6
    iget-object v3, p0, Landroidx/camera/core/impl/utils/n;->m:Ljava/nio/ByteBuffer;

    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 16
    iget-object v3, p0, Landroidx/camera/core/impl/utils/n;->m:Ljava/nio/ByteBuffer;

    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v3

    const v5, 0xffff

    if-ne v3, v2, :cond_7

    .line 17
    iget-object v0, p0, Landroidx/camera/core/impl/utils/n;->m:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v0

    and-int/2addr v0, v5

    sub-int/2addr v0, v1

    iput v0, p0, Landroidx/camera/core/impl/utils/n;->o:I

    .line 18
    iput v1, p0, Landroidx/camera/core/impl/utils/n;->n:I

    goto :goto_1

    .line 19
    :cond_7
    invoke-static {v3}, Landroidx/camera/core/impl/utils/n$a;->a(S)Z

    move-result v2

    if-nez v2, :cond_8

    .line 20
    iget-object v2, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    iget-object v3, p0, Landroidx/camera/core/impl/utils/n;->m:Ljava/nio/ByteBuffer;

    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v3

    invoke-virtual {v2, v3, v4, v0}, Ljava/io/OutputStream;->write([BII)V

    .line 21
    iget-object v0, p0, Landroidx/camera/core/impl/utils/n;->m:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v0

    and-int/2addr v0, v5

    sub-int/2addr v0, v1

    iput v0, p0, Landroidx/camera/core/impl/utils/n;->p:I

    goto :goto_1

    .line 22
    :cond_8
    iget-object v2, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    iget-object v3, p0, Landroidx/camera/core/impl/utils/n;->m:Ljava/nio/ByteBuffer;

    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v3

    invoke-virtual {v2, v3, v4, v0}, Ljava/io/OutputStream;->write([BII)V

    .line 23
    iput v1, p0, Landroidx/camera/core/impl/utils/n;->n:I

    .line 24
    :goto_1
    iget-object v0, p0, Landroidx/camera/core/impl/utils/n;->m:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    goto/16 :goto_0

    .line 25
    :cond_9
    invoke-direct {p0, v1, p1, p2, p3}, Landroidx/camera/core/impl/utils/n;->b(I[BII)I

    move-result v0

    add-int/2addr p2, v0

    sub-int/2addr p3, v0

    .line 26
    iget-object v0, p0, Landroidx/camera/core/impl/utils/n;->m:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v0

    if-ge v0, v1, :cond_a

    return-void

    .line 27
    :cond_a
    iget-object v0, p0, Landroidx/camera/core/impl/utils/n;->m:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 28
    iget-object v0, p0, Landroidx/camera/core/impl/utils/n;->m:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v0

    const/16 v5, -0x28

    if-ne v0, v5, :cond_b

    .line 29
    iget-object v0, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    iget-object v5, p0, Landroidx/camera/core/impl/utils/n;->m:Ljava/nio/ByteBuffer;

    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v5

    invoke-virtual {v0, v5, v4, v1}, Ljava/io/OutputStream;->write([BII)V

    .line 30
    iput v3, p0, Landroidx/camera/core/impl/utils/n;->n:I

    .line 31
    iget-object v0, p0, Landroidx/camera/core/impl/utils/n;->m:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 32
    new-instance v0, Landroidx/camera/core/impl/utils/a;

    iget-object v1, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    sget-object v3, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    invoke-direct {v0, v1, v3}, Landroidx/camera/core/impl/utils/a;-><init>(Ljava/io/OutputStream;Ljava/nio/ByteOrder;)V

    .line 33
    invoke-virtual {v0, v2}, Landroidx/camera/core/impl/utils/a;->k(S)V

    .line 34
    invoke-direct {p0, v0}, Landroidx/camera/core/impl/utils/n;->f(Landroidx/camera/core/impl/utils/a;)V

    goto/16 :goto_0

    .line 35
    :cond_b
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Not a valid jpeg image, cannot write exif"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_c
    if-lez p3, :cond_d

    .line 36
    iget-object v0, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V

    :cond_d
    return-void
.end method
