.class Lio/sentry/vendor/a$b;
.super Lio/sentry/vendor/a$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/sentry/vendor/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# static fields
.field private static final j:[B

.field private static final k:[B


# instance fields
.field private final c:[B

.field d:I

.field private e:I

.field public final f:Z

.field public final g:Z

.field public final h:Z

.field private final i:[B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/16 v0, 0x40

    .line 2
    .line 3
    new-array v1, v0, [B

    .line 4
    .line 5
    fill-array-data v1, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v1, Lio/sentry/vendor/a$b;->j:[B

    .line 9
    .line 10
    new-array v0, v0, [B

    .line 11
    .line 12
    fill-array-data v0, :array_1

    .line 13
    .line 14
    .line 15
    sput-object v0, Lio/sentry/vendor/a$b;->k:[B

    .line 16
    .line 17
    return-void

    .line 18
    nop

    .line 19
    :array_0
    .array-data 1
        0x41t
        0x42t
        0x43t
        0x44t
        0x45t
        0x46t
        0x47t
        0x48t
        0x49t
        0x4at
        0x4bt
        0x4ct
        0x4dt
        0x4et
        0x4ft
        0x50t
        0x51t
        0x52t
        0x53t
        0x54t
        0x55t
        0x56t
        0x57t
        0x58t
        0x59t
        0x5at
        0x61t
        0x62t
        0x63t
        0x64t
        0x65t
        0x66t
        0x67t
        0x68t
        0x69t
        0x6at
        0x6bt
        0x6ct
        0x6dt
        0x6et
        0x6ft
        0x70t
        0x71t
        0x72t
        0x73t
        0x74t
        0x75t
        0x76t
        0x77t
        0x78t
        0x79t
        0x7at
        0x30t
        0x31t
        0x32t
        0x33t
        0x34t
        0x35t
        0x36t
        0x37t
        0x38t
        0x39t
        0x2bt
        0x2ft
    .end array-data

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    :array_1
    .array-data 1
        0x41t
        0x42t
        0x43t
        0x44t
        0x45t
        0x46t
        0x47t
        0x48t
        0x49t
        0x4at
        0x4bt
        0x4ct
        0x4dt
        0x4et
        0x4ft
        0x50t
        0x51t
        0x52t
        0x53t
        0x54t
        0x55t
        0x56t
        0x57t
        0x58t
        0x59t
        0x5at
        0x61t
        0x62t
        0x63t
        0x64t
        0x65t
        0x66t
        0x67t
        0x68t
        0x69t
        0x6at
        0x6bt
        0x6ct
        0x6dt
        0x6et
        0x6ft
        0x70t
        0x71t
        0x72t
        0x73t
        0x74t
        0x75t
        0x76t
        0x77t
        0x78t
        0x79t
        0x7at
        0x30t
        0x31t
        0x32t
        0x33t
        0x34t
        0x35t
        0x36t
        0x37t
        0x38t
        0x39t
        0x2dt
        0x5ft
    .end array-data
.end method

.method public constructor <init>(I[B)V
    .locals 3

    .line 1
    invoke-direct {p0}, Lio/sentry/vendor/a$a;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lio/sentry/vendor/a$a;->a:[B

    .line 5
    .line 6
    and-int/lit8 p2, p1, 0x1

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-nez p2, :cond_0

    .line 11
    .line 12
    move p2, v1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move p2, v0

    .line 15
    :goto_0
    iput-boolean p2, p0, Lio/sentry/vendor/a$b;->f:Z

    .line 16
    .line 17
    and-int/lit8 p2, p1, 0x2

    .line 18
    .line 19
    if-nez p2, :cond_1

    .line 20
    .line 21
    move p2, v1

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move p2, v0

    .line 24
    :goto_1
    iput-boolean p2, p0, Lio/sentry/vendor/a$b;->g:Z

    .line 25
    .line 26
    and-int/lit8 v2, p1, 0x4

    .line 27
    .line 28
    if-eqz v2, :cond_2

    .line 29
    .line 30
    goto :goto_2

    .line 31
    :cond_2
    move v1, v0

    .line 32
    :goto_2
    iput-boolean v1, p0, Lio/sentry/vendor/a$b;->h:Z

    .line 33
    .line 34
    and-int/lit8 p1, p1, 0x8

    .line 35
    .line 36
    if-nez p1, :cond_3

    .line 37
    .line 38
    sget-object p1, Lio/sentry/vendor/a$b;->j:[B

    .line 39
    .line 40
    goto :goto_3

    .line 41
    :cond_3
    sget-object p1, Lio/sentry/vendor/a$b;->k:[B

    .line 42
    .line 43
    :goto_3
    iput-object p1, p0, Lio/sentry/vendor/a$b;->i:[B

    .line 44
    .line 45
    const/4 p1, 0x2

    .line 46
    new-array p1, p1, [B

    .line 47
    .line 48
    iput-object p1, p0, Lio/sentry/vendor/a$b;->c:[B

    .line 49
    .line 50
    iput v0, p0, Lio/sentry/vendor/a$b;->d:I

    .line 51
    .line 52
    if-eqz p2, :cond_4

    .line 53
    .line 54
    const/16 p1, 0x13

    .line 55
    .line 56
    goto :goto_4

    .line 57
    :cond_4
    const/4 p1, -0x1

    .line 58
    :goto_4
    iput p1, p0, Lio/sentry/vendor/a$b;->e:I

    .line 59
    .line 60
    return-void
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
.method public a([BIIZ)Z
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lio/sentry/vendor/a$b;->i:[B

    .line 4
    .line 5
    iget-object v2, v0, Lio/sentry/vendor/a$a;->a:[B

    .line 6
    .line 7
    iget v3, v0, Lio/sentry/vendor/a$b;->e:I

    .line 8
    .line 9
    add-int v4, p3, p2

    .line 10
    .line 11
    iget v5, v0, Lio/sentry/vendor/a$b;->d:I

    .line 12
    .line 13
    const/4 v6, 0x2

    .line 14
    const/4 v7, 0x1

    .line 15
    const/4 v8, 0x0

    .line 16
    const/4 v9, -0x1

    .line 17
    if-eq v5, v7, :cond_1

    .line 18
    .line 19
    if-eq v5, v6, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    add-int/lit8 v5, p2, 0x1

    .line 23
    .line 24
    if-gt v5, v4, :cond_2

    .line 25
    .line 26
    iget-object v10, v0, Lio/sentry/vendor/a$b;->c:[B

    .line 27
    .line 28
    aget-byte v11, v10, v8

    .line 29
    .line 30
    and-int/lit16 v11, v11, 0xff

    .line 31
    .line 32
    shl-int/lit8 v11, v11, 0x10

    .line 33
    .line 34
    aget-byte v10, v10, v7

    .line 35
    .line 36
    and-int/lit16 v10, v10, 0xff

    .line 37
    .line 38
    shl-int/lit8 v10, v10, 0x8

    .line 39
    .line 40
    or-int/2addr v10, v11

    .line 41
    aget-byte v11, p1, p2

    .line 42
    .line 43
    and-int/lit16 v11, v11, 0xff

    .line 44
    .line 45
    or-int/2addr v10, v11

    .line 46
    iput v8, v0, Lio/sentry/vendor/a$b;->d:I

    .line 47
    .line 48
    move v11, v5

    .line 49
    goto :goto_1

    .line 50
    :cond_1
    add-int/lit8 v5, p2, 0x2

    .line 51
    .line 52
    if-gt v5, v4, :cond_2

    .line 53
    .line 54
    iget-object v5, v0, Lio/sentry/vendor/a$b;->c:[B

    .line 55
    .line 56
    aget-byte v5, v5, v8

    .line 57
    .line 58
    and-int/lit16 v5, v5, 0xff

    .line 59
    .line 60
    shl-int/lit8 v5, v5, 0x10

    .line 61
    .line 62
    add-int/lit8 v10, p2, 0x1

    .line 63
    .line 64
    aget-byte v11, p1, p2

    .line 65
    .line 66
    and-int/lit16 v11, v11, 0xff

    .line 67
    .line 68
    shl-int/lit8 v11, v11, 0x8

    .line 69
    .line 70
    or-int/2addr v5, v11

    .line 71
    add-int/lit8 v11, v10, 0x1

    .line 72
    .line 73
    aget-byte v10, p1, v10

    .line 74
    .line 75
    and-int/lit16 v10, v10, 0xff

    .line 76
    .line 77
    or-int/2addr v10, v5

    .line 78
    iput v8, v0, Lio/sentry/vendor/a$b;->d:I

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_2
    :goto_0
    move/from16 v11, p2

    .line 82
    .line 83
    move v10, v9

    .line 84
    :goto_1
    const/4 v12, 0x4

    .line 85
    const/16 v13, 0xd

    .line 86
    .line 87
    const/16 v14, 0xa

    .line 88
    .line 89
    if-eq v10, v9, :cond_5

    .line 90
    .line 91
    shr-int/lit8 v9, v10, 0x12

    .line 92
    .line 93
    and-int/lit8 v9, v9, 0x3f

    .line 94
    .line 95
    aget-byte v9, v1, v9

    .line 96
    .line 97
    aput-byte v9, v2, v8

    .line 98
    .line 99
    shr-int/lit8 v9, v10, 0xc

    .line 100
    .line 101
    and-int/lit8 v9, v9, 0x3f

    .line 102
    .line 103
    aget-byte v9, v1, v9

    .line 104
    .line 105
    aput-byte v9, v2, v7

    .line 106
    .line 107
    shr-int/lit8 v9, v10, 0x6

    .line 108
    .line 109
    and-int/lit8 v9, v9, 0x3f

    .line 110
    .line 111
    aget-byte v9, v1, v9

    .line 112
    .line 113
    aput-byte v9, v2, v6

    .line 114
    .line 115
    and-int/lit8 v9, v10, 0x3f

    .line 116
    .line 117
    aget-byte v9, v1, v9

    .line 118
    .line 119
    const/4 v10, 0x3

    .line 120
    aput-byte v9, v2, v10

    .line 121
    .line 122
    add-int/lit8 v3, v3, -0x1

    .line 123
    .line 124
    if-nez v3, :cond_4

    .line 125
    .line 126
    iget-boolean v3, v0, Lio/sentry/vendor/a$b;->h:Z

    .line 127
    .line 128
    if-eqz v3, :cond_3

    .line 129
    .line 130
    aput-byte v13, v2, v12

    .line 131
    .line 132
    const/4 v3, 0x5

    .line 133
    goto :goto_2

    .line 134
    :cond_3
    move v3, v12

    .line 135
    :goto_2
    add-int/lit8 v9, v3, 0x1

    .line 136
    .line 137
    aput-byte v14, v2, v3

    .line 138
    .line 139
    :goto_3
    const/16 v3, 0x13

    .line 140
    .line 141
    goto :goto_4

    .line 142
    :cond_4
    move v9, v12

    .line 143
    goto :goto_4

    .line 144
    :cond_5
    move v9, v8

    .line 145
    :goto_4
    add-int/lit8 v10, v11, 0x3

    .line 146
    .line 147
    if-gt v10, v4, :cond_8

    .line 148
    .line 149
    aget-byte v15, p1, v11

    .line 150
    .line 151
    and-int/lit16 v15, v15, 0xff

    .line 152
    .line 153
    shl-int/lit8 v15, v15, 0x10

    .line 154
    .line 155
    add-int/lit8 v16, v11, 0x1

    .line 156
    .line 157
    aget-byte v5, p1, v16

    .line 158
    .line 159
    and-int/lit16 v5, v5, 0xff

    .line 160
    .line 161
    shl-int/lit8 v5, v5, 0x8

    .line 162
    .line 163
    or-int/2addr v5, v15

    .line 164
    add-int/lit8 v11, v11, 0x2

    .line 165
    .line 166
    aget-byte v11, p1, v11

    .line 167
    .line 168
    and-int/lit16 v11, v11, 0xff

    .line 169
    .line 170
    or-int/2addr v5, v11

    .line 171
    shr-int/lit8 v11, v5, 0x12

    .line 172
    .line 173
    and-int/lit8 v11, v11, 0x3f

    .line 174
    .line 175
    aget-byte v11, v1, v11

    .line 176
    .line 177
    aput-byte v11, v2, v9

    .line 178
    .line 179
    add-int/lit8 v11, v9, 0x1

    .line 180
    .line 181
    shr-int/lit8 v15, v5, 0xc

    .line 182
    .line 183
    and-int/lit8 v15, v15, 0x3f

    .line 184
    .line 185
    aget-byte v15, v1, v15

    .line 186
    .line 187
    aput-byte v15, v2, v11

    .line 188
    .line 189
    add-int/lit8 v11, v9, 0x2

    .line 190
    .line 191
    shr-int/lit8 v15, v5, 0x6

    .line 192
    .line 193
    and-int/lit8 v15, v15, 0x3f

    .line 194
    .line 195
    aget-byte v15, v1, v15

    .line 196
    .line 197
    aput-byte v15, v2, v11

    .line 198
    .line 199
    add-int/lit8 v11, v9, 0x3

    .line 200
    .line 201
    and-int/lit8 v5, v5, 0x3f

    .line 202
    .line 203
    aget-byte v5, v1, v5

    .line 204
    .line 205
    aput-byte v5, v2, v11

    .line 206
    .line 207
    add-int/lit8 v9, v9, 0x4

    .line 208
    .line 209
    add-int/lit8 v3, v3, -0x1

    .line 210
    .line 211
    if-nez v3, :cond_7

    .line 212
    .line 213
    iget-boolean v3, v0, Lio/sentry/vendor/a$b;->h:Z

    .line 214
    .line 215
    if-eqz v3, :cond_6

    .line 216
    .line 217
    add-int/lit8 v3, v9, 0x1

    .line 218
    .line 219
    aput-byte v13, v2, v9

    .line 220
    .line 221
    move v9, v3

    .line 222
    :cond_6
    add-int/lit8 v3, v9, 0x1

    .line 223
    .line 224
    aput-byte v14, v2, v9

    .line 225
    .line 226
    move v9, v3

    .line 227
    move v11, v10

    .line 228
    goto :goto_3

    .line 229
    :cond_7
    move v11, v10

    .line 230
    goto :goto_4

    .line 231
    :cond_8
    if-eqz p4, :cond_15

    .line 232
    .line 233
    iget v5, v0, Lio/sentry/vendor/a$b;->d:I

    .line 234
    .line 235
    sub-int v10, v11, v5

    .line 236
    .line 237
    add-int/lit8 v15, v4, -0x1

    .line 238
    .line 239
    const/16 v16, 0x3d

    .line 240
    .line 241
    if-ne v10, v15, :cond_d

    .line 242
    .line 243
    if-lez v5, :cond_9

    .line 244
    .line 245
    iget-object v4, v0, Lio/sentry/vendor/a$b;->c:[B

    .line 246
    .line 247
    aget-byte v4, v4, v8

    .line 248
    .line 249
    move v8, v7

    .line 250
    goto :goto_5

    .line 251
    :cond_9
    aget-byte v4, p1, v11

    .line 252
    .line 253
    :goto_5
    and-int/lit16 v4, v4, 0xff

    .line 254
    .line 255
    shl-int/2addr v4, v12

    .line 256
    sub-int/2addr v5, v8

    .line 257
    iput v5, v0, Lio/sentry/vendor/a$b;->d:I

    .line 258
    .line 259
    add-int/lit8 v5, v9, 0x1

    .line 260
    .line 261
    shr-int/lit8 v6, v4, 0x6

    .line 262
    .line 263
    and-int/lit8 v6, v6, 0x3f

    .line 264
    .line 265
    aget-byte v6, v1, v6

    .line 266
    .line 267
    aput-byte v6, v2, v9

    .line 268
    .line 269
    add-int/lit8 v6, v5, 0x1

    .line 270
    .line 271
    and-int/lit8 v4, v4, 0x3f

    .line 272
    .line 273
    aget-byte v1, v1, v4

    .line 274
    .line 275
    aput-byte v1, v2, v5

    .line 276
    .line 277
    iget-boolean v1, v0, Lio/sentry/vendor/a$b;->f:Z

    .line 278
    .line 279
    if-eqz v1, :cond_a

    .line 280
    .line 281
    add-int/lit8 v1, v6, 0x1

    .line 282
    .line 283
    aput-byte v16, v2, v6

    .line 284
    .line 285
    add-int/lit8 v6, v1, 0x1

    .line 286
    .line 287
    aput-byte v16, v2, v1

    .line 288
    .line 289
    :cond_a
    iget-boolean v1, v0, Lio/sentry/vendor/a$b;->g:Z

    .line 290
    .line 291
    if-eqz v1, :cond_c

    .line 292
    .line 293
    iget-boolean v1, v0, Lio/sentry/vendor/a$b;->h:Z

    .line 294
    .line 295
    if-eqz v1, :cond_b

    .line 296
    .line 297
    add-int/lit8 v1, v6, 0x1

    .line 298
    .line 299
    aput-byte v13, v2, v6

    .line 300
    .line 301
    move v6, v1

    .line 302
    :cond_b
    add-int/lit8 v1, v6, 0x1

    .line 303
    .line 304
    aput-byte v14, v2, v6

    .line 305
    .line 306
    move v6, v1

    .line 307
    :cond_c
    move v9, v6

    .line 308
    goto/16 :goto_8

    .line 309
    .line 310
    :cond_d
    sub-int v10, v11, v5

    .line 311
    .line 312
    sub-int/2addr v4, v6

    .line 313
    if-ne v10, v4, :cond_13

    .line 314
    .line 315
    if-le v5, v7, :cond_e

    .line 316
    .line 317
    iget-object v4, v0, Lio/sentry/vendor/a$b;->c:[B

    .line 318
    .line 319
    aget-byte v4, v4, v8

    .line 320
    .line 321
    move v8, v7

    .line 322
    goto :goto_6

    .line 323
    :cond_e
    add-int/lit8 v4, v11, 0x1

    .line 324
    .line 325
    aget-byte v10, p1, v11

    .line 326
    .line 327
    move v11, v4

    .line 328
    move v4, v10

    .line 329
    :goto_6
    and-int/lit16 v4, v4, 0xff

    .line 330
    .line 331
    shl-int/2addr v4, v14

    .line 332
    if-lez v5, :cond_f

    .line 333
    .line 334
    iget-object v10, v0, Lio/sentry/vendor/a$b;->c:[B

    .line 335
    .line 336
    add-int/lit8 v11, v8, 0x1

    .line 337
    .line 338
    aget-byte v8, v10, v8

    .line 339
    .line 340
    goto :goto_7

    .line 341
    :cond_f
    aget-byte v10, p1, v11

    .line 342
    .line 343
    move v11, v8

    .line 344
    move v8, v10

    .line 345
    :goto_7
    and-int/lit16 v8, v8, 0xff

    .line 346
    .line 347
    shl-int/lit8 v6, v8, 0x2

    .line 348
    .line 349
    or-int/2addr v4, v6

    .line 350
    sub-int/2addr v5, v11

    .line 351
    iput v5, v0, Lio/sentry/vendor/a$b;->d:I

    .line 352
    .line 353
    add-int/lit8 v5, v9, 0x1

    .line 354
    .line 355
    shr-int/lit8 v6, v4, 0xc

    .line 356
    .line 357
    and-int/lit8 v6, v6, 0x3f

    .line 358
    .line 359
    aget-byte v6, v1, v6

    .line 360
    .line 361
    aput-byte v6, v2, v9

    .line 362
    .line 363
    add-int/lit8 v6, v5, 0x1

    .line 364
    .line 365
    shr-int/lit8 v8, v4, 0x6

    .line 366
    .line 367
    and-int/lit8 v8, v8, 0x3f

    .line 368
    .line 369
    aget-byte v8, v1, v8

    .line 370
    .line 371
    aput-byte v8, v2, v5

    .line 372
    .line 373
    add-int/lit8 v5, v6, 0x1

    .line 374
    .line 375
    and-int/lit8 v4, v4, 0x3f

    .line 376
    .line 377
    aget-byte v1, v1, v4

    .line 378
    .line 379
    aput-byte v1, v2, v6

    .line 380
    .line 381
    iget-boolean v1, v0, Lio/sentry/vendor/a$b;->f:Z

    .line 382
    .line 383
    if-eqz v1, :cond_10

    .line 384
    .line 385
    add-int/lit8 v1, v5, 0x1

    .line 386
    .line 387
    aput-byte v16, v2, v5

    .line 388
    .line 389
    move v5, v1

    .line 390
    :cond_10
    iget-boolean v1, v0, Lio/sentry/vendor/a$b;->g:Z

    .line 391
    .line 392
    if-eqz v1, :cond_12

    .line 393
    .line 394
    iget-boolean v1, v0, Lio/sentry/vendor/a$b;->h:Z

    .line 395
    .line 396
    if-eqz v1, :cond_11

    .line 397
    .line 398
    add-int/lit8 v1, v5, 0x1

    .line 399
    .line 400
    aput-byte v13, v2, v5

    .line 401
    .line 402
    move v5, v1

    .line 403
    :cond_11
    add-int/lit8 v1, v5, 0x1

    .line 404
    .line 405
    aput-byte v14, v2, v5

    .line 406
    .line 407
    move v5, v1

    .line 408
    :cond_12
    move v9, v5

    .line 409
    goto :goto_8

    .line 410
    :cond_13
    iget-boolean v1, v0, Lio/sentry/vendor/a$b;->g:Z

    .line 411
    .line 412
    if-eqz v1, :cond_17

    .line 413
    .line 414
    if-lez v9, :cond_17

    .line 415
    .line 416
    const/16 v1, 0x13

    .line 417
    .line 418
    if-eq v3, v1, :cond_17

    .line 419
    .line 420
    iget-boolean v1, v0, Lio/sentry/vendor/a$b;->h:Z

    .line 421
    .line 422
    if-eqz v1, :cond_14

    .line 423
    .line 424
    add-int/lit8 v1, v9, 0x1

    .line 425
    .line 426
    aput-byte v13, v2, v9

    .line 427
    .line 428
    move v9, v1

    .line 429
    :cond_14
    add-int/lit8 v1, v9, 0x1

    .line 430
    .line 431
    aput-byte v14, v2, v9

    .line 432
    .line 433
    move v9, v1

    .line 434
    goto :goto_8

    .line 435
    :cond_15
    add-int/lit8 v1, v4, -0x1

    .line 436
    .line 437
    if-ne v11, v1, :cond_16

    .line 438
    .line 439
    iget-object v1, v0, Lio/sentry/vendor/a$b;->c:[B

    .line 440
    .line 441
    iget v2, v0, Lio/sentry/vendor/a$b;->d:I

    .line 442
    .line 443
    add-int/lit8 v4, v2, 0x1

    .line 444
    .line 445
    iput v4, v0, Lio/sentry/vendor/a$b;->d:I

    .line 446
    .line 447
    aget-byte v4, p1, v11

    .line 448
    .line 449
    aput-byte v4, v1, v2

    .line 450
    .line 451
    goto :goto_8

    .line 452
    :cond_16
    sub-int/2addr v4, v6

    .line 453
    if-ne v11, v4, :cond_17

    .line 454
    .line 455
    iget-object v1, v0, Lio/sentry/vendor/a$b;->c:[B

    .line 456
    .line 457
    iget v2, v0, Lio/sentry/vendor/a$b;->d:I

    .line 458
    .line 459
    add-int/lit8 v4, v2, 0x1

    .line 460
    .line 461
    aget-byte v5, p1, v11

    .line 462
    .line 463
    aput-byte v5, v1, v2

    .line 464
    .line 465
    add-int/lit8 v2, v4, 0x1

    .line 466
    .line 467
    iput v2, v0, Lio/sentry/vendor/a$b;->d:I

    .line 468
    .line 469
    add-int/2addr v11, v7

    .line 470
    aget-byte v2, p1, v11

    .line 471
    .line 472
    aput-byte v2, v1, v4

    .line 473
    .line 474
    :cond_17
    :goto_8
    iput v9, v0, Lio/sentry/vendor/a$a;->b:I

    .line 475
    .line 476
    iput v3, v0, Lio/sentry/vendor/a$b;->e:I

    .line 477
    .line 478
    return v7
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
.end method
