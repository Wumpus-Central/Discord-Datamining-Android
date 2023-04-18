.class public final Ldk/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0010\u000e\n\u0002\u0010\u0012\n\u0002\u0008\n\u001a\u000e\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000\u001a\u0016\u0010\u0004\u001a\u00020\u0000*\u00020\u00012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0001H\u0000\"\u001a\u0010\u0008\u001a\u00020\u00018\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0002\u0010\u0005\u001a\u0004\u0008\u0006\u0010\u0007\"\u001a\u0010\n\u001a\u00020\u00018\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u0005\u001a\u0004\u0008\t\u0010\u0007\u00a8\u0006\u000b"
    }
    d2 = {
        "",
        "",
        "a",
        "map",
        "b",
        "[B",
        "getBASE64",
        "()[B",
        "BASE64",
        "getBASE64_URL_SAFE",
        "BASE64_URL_SAFE",
        "okio"
    }
    k = 0x2
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# static fields
.field private static final a:[B

.field private static final b:[B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Lokio/ByteString;->o:Lokio/ByteString$a;

    .line 2
    .line 3
    const-string v1, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lokio/ByteString$a;->d(Ljava/lang/String;)Lokio/ByteString;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Lokio/ByteString;->i()[B

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    sput-object v1, Ldk/a;->a:[B

    .line 14
    .line 15
    const-string v1, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_"

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lokio/ByteString$a;->d(Ljava/lang/String;)Lokio/ByteString;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Lokio/ByteString;->i()[B

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Ldk/a;->b:[B

    .line 26
    .line 27
    return-void
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
.end method

.method public static final a(Ljava/lang/String;)[B
    .locals 14

    .line 1
    const-string v0, "$this$decodeBase64ToArray"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    :goto_0
    const/16 v1, 0x9

    .line 11
    .line 12
    const/16 v2, 0x20

    .line 13
    .line 14
    const/16 v3, 0xd

    .line 15
    .line 16
    const/16 v4, 0xa

    .line 17
    .line 18
    if-lez v0, :cond_1

    .line 19
    .line 20
    add-int/lit8 v5, v0, -0x1

    .line 21
    .line 22
    invoke-virtual {p0, v5}, Ljava/lang/String;->charAt(I)C

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    const/16 v6, 0x3d

    .line 27
    .line 28
    if-eq v5, v6, :cond_0

    .line 29
    .line 30
    if-eq v5, v4, :cond_0

    .line 31
    .line 32
    if-eq v5, v3, :cond_0

    .line 33
    .line 34
    if-eq v5, v2, :cond_0

    .line 35
    .line 36
    if-eq v5, v1, :cond_0

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_0
    add-int/lit8 v0, v0, -0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    :goto_1
    int-to-long v5, v0

    .line 43
    const-wide/16 v7, 0x6

    .line 44
    .line 45
    mul-long/2addr v5, v7

    .line 46
    const-wide/16 v7, 0x8

    .line 47
    .line 48
    div-long/2addr v5, v7

    .line 49
    long-to-int v5, v5

    .line 50
    new-array v6, v5, [B

    .line 51
    .line 52
    const/4 v7, 0x0

    .line 53
    move v8, v7

    .line 54
    move v9, v8

    .line 55
    move v10, v9

    .line 56
    :goto_2
    const/4 v11, 0x0

    .line 57
    if-ge v7, v0, :cond_e

    .line 58
    .line 59
    invoke-virtual {p0, v7}, Ljava/lang/String;->charAt(I)C

    .line 60
    .line 61
    .line 62
    move-result v12

    .line 63
    const/16 v13, 0x41

    .line 64
    .line 65
    if-le v13, v12, :cond_2

    .line 66
    .line 67
    goto :goto_3

    .line 68
    :cond_2
    const/16 v13, 0x5a

    .line 69
    .line 70
    if-lt v13, v12, :cond_3

    .line 71
    .line 72
    add-int/lit8 v12, v12, -0x41

    .line 73
    .line 74
    goto :goto_8

    .line 75
    :cond_3
    :goto_3
    const/16 v13, 0x61

    .line 76
    .line 77
    if-le v13, v12, :cond_4

    .line 78
    .line 79
    goto :goto_4

    .line 80
    :cond_4
    const/16 v13, 0x7a

    .line 81
    .line 82
    if-lt v13, v12, :cond_5

    .line 83
    .line 84
    add-int/lit8 v12, v12, -0x47

    .line 85
    .line 86
    goto :goto_8

    .line 87
    :cond_5
    :goto_4
    const/16 v13, 0x30

    .line 88
    .line 89
    if-le v13, v12, :cond_6

    .line 90
    .line 91
    goto :goto_5

    .line 92
    :cond_6
    const/16 v13, 0x39

    .line 93
    .line 94
    if-lt v13, v12, :cond_7

    .line 95
    .line 96
    add-int/lit8 v12, v12, 0x4

    .line 97
    .line 98
    goto :goto_8

    .line 99
    :cond_7
    :goto_5
    const/16 v13, 0x2b

    .line 100
    .line 101
    if-eq v12, v13, :cond_c

    .line 102
    .line 103
    const/16 v13, 0x2d

    .line 104
    .line 105
    if-ne v12, v13, :cond_8

    .line 106
    .line 107
    goto :goto_7

    .line 108
    :cond_8
    const/16 v13, 0x2f

    .line 109
    .line 110
    if-eq v12, v13, :cond_b

    .line 111
    .line 112
    const/16 v13, 0x5f

    .line 113
    .line 114
    if-ne v12, v13, :cond_9

    .line 115
    .line 116
    goto :goto_6

    .line 117
    :cond_9
    if-eq v12, v4, :cond_d

    .line 118
    .line 119
    if-eq v12, v3, :cond_d

    .line 120
    .line 121
    if-eq v12, v2, :cond_d

    .line 122
    .line 123
    if-ne v12, v1, :cond_a

    .line 124
    .line 125
    goto :goto_9

    .line 126
    :cond_a
    return-object v11

    .line 127
    :cond_b
    :goto_6
    const/16 v12, 0x3f

    .line 128
    .line 129
    goto :goto_8

    .line 130
    :cond_c
    :goto_7
    const/16 v12, 0x3e

    .line 131
    .line 132
    :goto_8
    shl-int/lit8 v9, v9, 0x6

    .line 133
    .line 134
    or-int/2addr v9, v12

    .line 135
    add-int/lit8 v8, v8, 0x1

    .line 136
    .line 137
    rem-int/lit8 v11, v8, 0x4

    .line 138
    .line 139
    if-nez v11, :cond_d

    .line 140
    .line 141
    add-int/lit8 v11, v10, 0x1

    .line 142
    .line 143
    shr-int/lit8 v12, v9, 0x10

    .line 144
    .line 145
    int-to-byte v12, v12

    .line 146
    aput-byte v12, v6, v10

    .line 147
    .line 148
    add-int/lit8 v10, v11, 0x1

    .line 149
    .line 150
    shr-int/lit8 v12, v9, 0x8

    .line 151
    .line 152
    int-to-byte v12, v12

    .line 153
    aput-byte v12, v6, v11

    .line 154
    .line 155
    add-int/lit8 v11, v10, 0x1

    .line 156
    .line 157
    int-to-byte v12, v9

    .line 158
    aput-byte v12, v6, v10

    .line 159
    .line 160
    move v10, v11

    .line 161
    :cond_d
    :goto_9
    add-int/lit8 v7, v7, 0x1

    .line 162
    .line 163
    goto :goto_2

    .line 164
    :cond_e
    rem-int/lit8 v8, v8, 0x4

    .line 165
    .line 166
    const/4 p0, 0x1

    .line 167
    if-eq v8, p0, :cond_12

    .line 168
    .line 169
    const/4 p0, 0x2

    .line 170
    if-eq v8, p0, :cond_10

    .line 171
    .line 172
    const/4 p0, 0x3

    .line 173
    if-eq v8, p0, :cond_f

    .line 174
    .line 175
    goto :goto_a

    .line 176
    :cond_f
    shl-int/lit8 p0, v9, 0x6

    .line 177
    .line 178
    add-int/lit8 v0, v10, 0x1

    .line 179
    .line 180
    shr-int/lit8 v1, p0, 0x10

    .line 181
    .line 182
    int-to-byte v1, v1

    .line 183
    aput-byte v1, v6, v10

    .line 184
    .line 185
    add-int/lit8 v10, v0, 0x1

    .line 186
    .line 187
    shr-int/lit8 p0, p0, 0x8

    .line 188
    .line 189
    int-to-byte p0, p0

    .line 190
    aput-byte p0, v6, v0

    .line 191
    .line 192
    goto :goto_a

    .line 193
    :cond_10
    shl-int/lit8 p0, v9, 0xc

    .line 194
    .line 195
    add-int/lit8 v0, v10, 0x1

    .line 196
    .line 197
    shr-int/lit8 p0, p0, 0x10

    .line 198
    .line 199
    int-to-byte p0, p0

    .line 200
    aput-byte p0, v6, v10

    .line 201
    .line 202
    move v10, v0

    .line 203
    :goto_a
    if-ne v10, v5, :cond_11

    .line 204
    .line 205
    return-object v6

    .line 206
    :cond_11
    invoke-static {v6, v10}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 207
    .line 208
    .line 209
    move-result-object p0

    .line 210
    const-string v0, "java.util.Arrays.copyOf(this, newSize)"

    .line 211
    .line 212
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    return-object p0

    .line 216
    :cond_12
    return-object v11
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

.method public static final b([B[B)Ljava/lang/String;
    .locals 10

    .line 1
    const-string v0, "$this$encodeBase64"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "map"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    array-length v0, p0

    .line 12
    const/4 v1, 0x2

    .line 13
    add-int/2addr v0, v1

    .line 14
    div-int/lit8 v0, v0, 0x3

    .line 15
    .line 16
    mul-int/lit8 v0, v0, 0x4

    .line 17
    .line 18
    new-array v0, v0, [B

    .line 19
    .line 20
    array-length v2, p0

    .line 21
    array-length v3, p0

    .line 22
    rem-int/lit8 v3, v3, 0x3

    .line 23
    .line 24
    sub-int/2addr v2, v3

    .line 25
    const/4 v3, 0x0

    .line 26
    move v4, v3

    .line 27
    :goto_0
    if-ge v3, v2, :cond_0

    .line 28
    .line 29
    add-int/lit8 v5, v3, 0x1

    .line 30
    .line 31
    aget-byte v3, p0, v3

    .line 32
    .line 33
    add-int/lit8 v6, v5, 0x1

    .line 34
    .line 35
    aget-byte v5, p0, v5

    .line 36
    .line 37
    add-int/lit8 v7, v6, 0x1

    .line 38
    .line 39
    aget-byte v6, p0, v6

    .line 40
    .line 41
    add-int/lit8 v8, v4, 0x1

    .line 42
    .line 43
    and-int/lit16 v9, v3, 0xff

    .line 44
    .line 45
    shr-int/2addr v9, v1

    .line 46
    aget-byte v9, p1, v9

    .line 47
    .line 48
    aput-byte v9, v0, v4

    .line 49
    .line 50
    add-int/lit8 v4, v8, 0x1

    .line 51
    .line 52
    and-int/lit8 v3, v3, 0x3

    .line 53
    .line 54
    shl-int/lit8 v3, v3, 0x4

    .line 55
    .line 56
    and-int/lit16 v9, v5, 0xff

    .line 57
    .line 58
    shr-int/lit8 v9, v9, 0x4

    .line 59
    .line 60
    or-int/2addr v3, v9

    .line 61
    aget-byte v3, p1, v3

    .line 62
    .line 63
    aput-byte v3, v0, v8

    .line 64
    .line 65
    add-int/lit8 v3, v4, 0x1

    .line 66
    .line 67
    and-int/lit8 v5, v5, 0xf

    .line 68
    .line 69
    shl-int/2addr v5, v1

    .line 70
    and-int/lit16 v8, v6, 0xff

    .line 71
    .line 72
    shr-int/lit8 v8, v8, 0x6

    .line 73
    .line 74
    or-int/2addr v5, v8

    .line 75
    aget-byte v5, p1, v5

    .line 76
    .line 77
    aput-byte v5, v0, v4

    .line 78
    .line 79
    add-int/lit8 v4, v3, 0x1

    .line 80
    .line 81
    and-int/lit8 v5, v6, 0x3f

    .line 82
    .line 83
    aget-byte v5, p1, v5

    .line 84
    .line 85
    aput-byte v5, v0, v3

    .line 86
    .line 87
    move v3, v7

    .line 88
    goto :goto_0

    .line 89
    :cond_0
    array-length v5, p0

    .line 90
    sub-int/2addr v5, v2

    .line 91
    const/16 v2, 0x3d

    .line 92
    .line 93
    const/4 v6, 0x1

    .line 94
    if-eq v5, v6, :cond_2

    .line 95
    .line 96
    if-eq v5, v1, :cond_1

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_1
    add-int/lit8 v5, v3, 0x1

    .line 100
    .line 101
    aget-byte v3, p0, v3

    .line 102
    .line 103
    aget-byte p0, p0, v5

    .line 104
    .line 105
    add-int/lit8 v5, v4, 0x1

    .line 106
    .line 107
    and-int/lit16 v6, v3, 0xff

    .line 108
    .line 109
    shr-int/2addr v6, v1

    .line 110
    aget-byte v6, p1, v6

    .line 111
    .line 112
    aput-byte v6, v0, v4

    .line 113
    .line 114
    add-int/lit8 v4, v5, 0x1

    .line 115
    .line 116
    and-int/lit8 v3, v3, 0x3

    .line 117
    .line 118
    shl-int/lit8 v3, v3, 0x4

    .line 119
    .line 120
    and-int/lit16 v6, p0, 0xff

    .line 121
    .line 122
    shr-int/lit8 v6, v6, 0x4

    .line 123
    .line 124
    or-int/2addr v3, v6

    .line 125
    aget-byte v3, p1, v3

    .line 126
    .line 127
    aput-byte v3, v0, v5

    .line 128
    .line 129
    add-int/lit8 v3, v4, 0x1

    .line 130
    .line 131
    and-int/lit8 p0, p0, 0xf

    .line 132
    .line 133
    shl-int/2addr p0, v1

    .line 134
    aget-byte p0, p1, p0

    .line 135
    .line 136
    aput-byte p0, v0, v4

    .line 137
    .line 138
    int-to-byte p0, v2

    .line 139
    aput-byte p0, v0, v3

    .line 140
    .line 141
    goto :goto_1

    .line 142
    :cond_2
    aget-byte p0, p0, v3

    .line 143
    .line 144
    add-int/lit8 v3, v4, 0x1

    .line 145
    .line 146
    and-int/lit16 v5, p0, 0xff

    .line 147
    .line 148
    shr-int/lit8 v1, v5, 0x2

    .line 149
    .line 150
    aget-byte v1, p1, v1

    .line 151
    .line 152
    aput-byte v1, v0, v4

    .line 153
    .line 154
    add-int/lit8 v1, v3, 0x1

    .line 155
    .line 156
    and-int/lit8 p0, p0, 0x3

    .line 157
    .line 158
    shl-int/lit8 p0, p0, 0x4

    .line 159
    .line 160
    aget-byte p0, p1, p0

    .line 161
    .line 162
    aput-byte p0, v0, v3

    .line 163
    .line 164
    add-int/lit8 p0, v1, 0x1

    .line 165
    .line 166
    int-to-byte p1, v2

    .line 167
    aput-byte p1, v0, v1

    .line 168
    .line 169
    aput-byte p1, v0, p0

    .line 170
    .line 171
    :goto_1
    invoke-static {v0}, Ldk/b;->b([B)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    return-object p0
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

.method public static synthetic c([B[BILjava/lang/Object;)Ljava/lang/String;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    sget-object p1, Ldk/a;->a:[B

    :cond_0
    invoke-static {p0, p1}, Ldk/a;->b([B[B)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
