.class public Lwd/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcd/l;


# static fields
.field private static final b:[Lcd/o;


# instance fields
.field private final a:Lxd/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Lcd/o;

    .line 3
    .line 4
    sput-object v0, Lwd/a;->b:[Lcd/o;

    .line 5
    .line 6
    return-void
    .line 7
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
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lxd/e;

    .line 5
    .line 6
    invoke-direct {v0}, Lxd/e;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lwd/a;->a:Lxd/e;

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
.end method

.method private static b(Lgd/b;)Lgd/b;
    .locals 11

    .line 1
    invoke-virtual {p0}, Lgd/b;->m()[I

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lgd/b;->g()[I

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v0, :cond_c

    .line 10
    .line 11
    if-eqz v1, :cond_c

    .line 12
    .line 13
    invoke-static {v0, p0}, Lwd/a;->c([ILgd/b;)F

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const/4 v3, 0x1

    .line 18
    aget v4, v0, v3

    .line 19
    .line 20
    aget v5, v1, v3

    .line 21
    .line 22
    const/4 v6, 0x0

    .line 23
    aget v0, v0, v6

    .line 24
    .line 25
    aget v1, v1, v6

    .line 26
    .line 27
    if-ge v0, v1, :cond_b

    .line 28
    .line 29
    if-ge v4, v5, :cond_b

    .line 30
    .line 31
    sub-int v7, v5, v4

    .line 32
    .line 33
    sub-int v8, v1, v0

    .line 34
    .line 35
    if-eq v7, v8, :cond_1

    .line 36
    .line 37
    add-int v1, v0, v7

    .line 38
    .line 39
    invoke-virtual {p0}, Lgd/b;->n()I

    .line 40
    .line 41
    .line 42
    move-result v8

    .line 43
    if-ge v1, v8, :cond_0

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    invoke-static {}, Lcd/j;->a()Lcd/j;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    throw p0

    .line 51
    :cond_1
    :goto_0
    sub-int v8, v1, v0

    .line 52
    .line 53
    add-int/2addr v8, v3

    .line 54
    int-to-float v8, v8

    .line 55
    div-float/2addr v8, v2

    .line 56
    invoke-static {v8}, Ljava/lang/Math;->round(F)I

    .line 57
    .line 58
    .line 59
    move-result v8

    .line 60
    add-int/2addr v7, v3

    .line 61
    int-to-float v3, v7

    .line 62
    div-float/2addr v3, v2

    .line 63
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-lez v8, :cond_a

    .line 68
    .line 69
    if-lez v3, :cond_a

    .line 70
    .line 71
    if-ne v3, v8, :cond_9

    .line 72
    .line 73
    const/high16 v7, 0x40000000    # 2.0f

    .line 74
    .line 75
    div-float v7, v2, v7

    .line 76
    .line 77
    float-to-int v7, v7

    .line 78
    add-int/2addr v4, v7

    .line 79
    add-int/2addr v0, v7

    .line 80
    add-int/lit8 v9, v8, -0x1

    .line 81
    .line 82
    int-to-float v9, v9

    .line 83
    mul-float/2addr v9, v2

    .line 84
    float-to-int v9, v9

    .line 85
    add-int/2addr v9, v0

    .line 86
    sub-int/2addr v9, v1

    .line 87
    if-lez v9, :cond_3

    .line 88
    .line 89
    if-gt v9, v7, :cond_2

    .line 90
    .line 91
    sub-int/2addr v0, v9

    .line 92
    goto :goto_1

    .line 93
    :cond_2
    invoke-static {}, Lcd/j;->a()Lcd/j;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    throw p0

    .line 98
    :cond_3
    :goto_1
    add-int/lit8 v1, v3, -0x1

    .line 99
    .line 100
    int-to-float v1, v1

    .line 101
    mul-float/2addr v1, v2

    .line 102
    float-to-int v1, v1

    .line 103
    add-int/2addr v1, v4

    .line 104
    sub-int/2addr v1, v5

    .line 105
    if-lez v1, :cond_5

    .line 106
    .line 107
    if-gt v1, v7, :cond_4

    .line 108
    .line 109
    sub-int/2addr v4, v1

    .line 110
    goto :goto_2

    .line 111
    :cond_4
    invoke-static {}, Lcd/j;->a()Lcd/j;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    throw p0

    .line 116
    :cond_5
    :goto_2
    new-instance v1, Lgd/b;

    .line 117
    .line 118
    invoke-direct {v1, v8, v3}, Lgd/b;-><init>(II)V

    .line 119
    .line 120
    .line 121
    move v5, v6

    .line 122
    :goto_3
    if-ge v5, v3, :cond_8

    .line 123
    .line 124
    int-to-float v7, v5

    .line 125
    mul-float/2addr v7, v2

    .line 126
    float-to-int v7, v7

    .line 127
    add-int/2addr v7, v4

    .line 128
    move v9, v6

    .line 129
    :goto_4
    if-ge v9, v8, :cond_7

    .line 130
    .line 131
    int-to-float v10, v9

    .line 132
    mul-float/2addr v10, v2

    .line 133
    float-to-int v10, v10

    .line 134
    add-int/2addr v10, v0

    .line 135
    invoke-virtual {p0, v10, v7}, Lgd/b;->e(II)Z

    .line 136
    .line 137
    .line 138
    move-result v10

    .line 139
    if-eqz v10, :cond_6

    .line 140
    .line 141
    invoke-virtual {v1, v9, v5}, Lgd/b;->p(II)V

    .line 142
    .line 143
    .line 144
    :cond_6
    add-int/lit8 v9, v9, 0x1

    .line 145
    .line 146
    goto :goto_4

    .line 147
    :cond_7
    add-int/lit8 v5, v5, 0x1

    .line 148
    .line 149
    goto :goto_3

    .line 150
    :cond_8
    return-object v1

    .line 151
    :cond_9
    invoke-static {}, Lcd/j;->a()Lcd/j;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    throw p0

    .line 156
    :cond_a
    invoke-static {}, Lcd/j;->a()Lcd/j;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    throw p0

    .line 161
    :cond_b
    invoke-static {}, Lcd/j;->a()Lcd/j;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    throw p0

    .line 166
    :cond_c
    invoke-static {}, Lcd/j;->a()Lcd/j;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    throw p0
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
    .line 358
    .line 359
    .line 360
    .line 361
.end method

.method private static c([ILgd/b;)F
    .locals 8

    .line 1
    invoke-virtual {p1}, Lgd/b;->j()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Lgd/b;->n()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    aget v3, p0, v2

    .line 11
    .line 12
    const/4 v4, 0x1

    .line 13
    aget v5, p0, v4

    .line 14
    .line 15
    move v6, v2

    .line 16
    :goto_0
    if-ge v3, v1, :cond_1

    .line 17
    .line 18
    if-ge v5, v0, :cond_1

    .line 19
    .line 20
    invoke-virtual {p1, v3, v5}, Lgd/b;->e(II)Z

    .line 21
    .line 22
    .line 23
    move-result v7

    .line 24
    if-eq v4, v7, :cond_0

    .line 25
    .line 26
    add-int/lit8 v6, v6, 0x1

    .line 27
    .line 28
    const/4 v7, 0x5

    .line 29
    if-eq v6, v7, :cond_1

    .line 30
    .line 31
    xor-int/lit8 v4, v4, 0x1

    .line 32
    .line 33
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 34
    .line 35
    add-int/lit8 v5, v5, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    if-eq v3, v1, :cond_2

    .line 39
    .line 40
    if-eq v5, v0, :cond_2

    .line 41
    .line 42
    aget p0, p0, v2

    .line 43
    .line 44
    sub-int/2addr v3, p0

    .line 45
    int-to-float p0, v3

    .line 46
    const/high16 p1, 0x40e00000    # 7.0f

    .line 47
    .line 48
    div-float/2addr p0, p1

    .line 49
    return p0

    .line 50
    :cond_2
    invoke-static {}, Lcd/j;->a()Lcd/j;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    throw p0
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
.end method


# virtual methods
.method public final a(Lcd/c;Ljava/util/Map;)Lcom/google/zxing/Result;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcd/c;",
            "Ljava/util/Map<",
            "Lcd/e;",
            "*>;)",
            "Lcom/google/zxing/Result;"
        }
    .end annotation

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    sget-object v0, Lcd/e;->m:Lcd/e;

    .line 4
    .line 5
    invoke-interface {p2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1}, Lcd/c;->a()Lgd/b;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {p1}, Lwd/a;->b(Lgd/b;)Lgd/b;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iget-object v0, p0, Lwd/a;->a:Lxd/e;

    .line 20
    .line 21
    invoke-virtual {v0, p1, p2}, Lxd/e;->b(Lgd/b;Ljava/util/Map;)Lgd/e;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    sget-object p2, Lwd/a;->b:[Lcd/o;

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance v0, Lyd/c;

    .line 29
    .line 30
    invoke-virtual {p1}, Lcd/c;->a()Lgd/b;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-direct {v0, p1}, Lyd/c;-><init>(Lgd/b;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, p2}, Lyd/c;->e(Ljava/util/Map;)Lgd/g;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    iget-object v0, p0, Lwd/a;->a:Lxd/e;

    .line 42
    .line 43
    invoke-virtual {p1}, Lgd/g;->a()Lgd/b;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {v0, v1, p2}, Lxd/e;->b(Lgd/b;Ljava/util/Map;)Lgd/e;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    invoke-virtual {p1}, Lgd/g;->b()[Lcd/o;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    move-object v4, p2

    .line 56
    move-object p2, p1

    .line 57
    move-object p1, v4

    .line 58
    :goto_0
    invoke-virtual {p1}, Lgd/e;->d()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    instance-of v0, v0, Lxd/i;

    .line 63
    .line 64
    if-eqz v0, :cond_1

    .line 65
    .line 66
    invoke-virtual {p1}, Lgd/e;->d()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    check-cast v0, Lxd/i;

    .line 71
    .line 72
    invoke-virtual {v0, p2}, Lxd/i;->a([Lcd/o;)V

    .line 73
    .line 74
    .line 75
    :cond_1
    new-instance v0, Lcom/google/zxing/Result;

    .line 76
    .line 77
    invoke-virtual {p1}, Lgd/e;->h()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-virtual {p1}, Lgd/e;->e()[B

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    sget-object v3, Lcd/a;->v:Lcd/a;

    .line 86
    .line 87
    invoke-direct {v0, v1, v2, p2, v3}, Lcom/google/zxing/Result;-><init>(Ljava/lang/String;[B[Lcd/o;Lcd/a;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1}, Lgd/e;->a()Ljava/util/List;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    if-eqz p2, :cond_2

    .line 95
    .line 96
    sget-object v1, Lcd/n;->m:Lcd/n;

    .line 97
    .line 98
    invoke-virtual {v0, v1, p2}, Lcom/google/zxing/Result;->h(Lcd/n;Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    :cond_2
    invoke-virtual {p1}, Lgd/e;->b()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p2

    .line 105
    if-eqz p2, :cond_3

    .line 106
    .line 107
    sget-object v1, Lcd/n;->n:Lcd/n;

    .line 108
    .line 109
    invoke-virtual {v0, v1, p2}, Lcom/google/zxing/Result;->h(Lcd/n;Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    :cond_3
    invoke-virtual {p1}, Lgd/e;->i()Z

    .line 113
    .line 114
    .line 115
    move-result p2

    .line 116
    if-eqz p2, :cond_4

    .line 117
    .line 118
    sget-object p2, Lcd/n;->t:Lcd/n;

    .line 119
    .line 120
    invoke-virtual {p1}, Lgd/e;->g()I

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    invoke-virtual {v0, p2, v1}, Lcom/google/zxing/Result;->h(Lcd/n;Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    sget-object p2, Lcd/n;->u:Lcd/n;

    .line 132
    .line 133
    invoke-virtual {p1}, Lgd/e;->f()I

    .line 134
    .line 135
    .line 136
    move-result p1

    .line 137
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    invoke-virtual {v0, p2, p1}, Lcom/google/zxing/Result;->h(Lcd/n;Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    :cond_4
    return-object v0
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
.end method

.method public reset()V
    .locals 0

    return-void
.end method
