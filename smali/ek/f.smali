.class public final Lek/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0010\u000e\n\u0002\u0010\u0012\n\u0002\u0008\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u00a8\u0006\u0003"
    }
    d2 = {
        "",
        "",
        "a",
        "okio"
    }
    k = 0x2
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# direct methods
.method public static final a(Ljava/lang/String;)[B
    .locals 12

    .line 1
    const-string v0, "$this$commonAsUtf8ToByteArray"

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
    mul-int/lit8 v0, v0, 0x4

    .line 11
    .line 12
    new-array v0, v0, [B

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/4 v2, 0x0

    .line 19
    :goto_0
    const-string v3, "java.util.Arrays.copyOf(this, newSize)"

    .line 20
    .line 21
    if-ge v2, v1, :cond_9

    .line 22
    .line 23
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    const/16 v5, 0x80

    .line 28
    .line 29
    invoke-static {v4, v5}, Lkotlin/jvm/internal/q;->i(II)I

    .line 30
    .line 31
    .line 32
    move-result v6

    .line 33
    if-ltz v6, :cond_8

    .line 34
    .line 35
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    move v4, v2

    .line 40
    :goto_1
    if-ge v2, v1, :cond_7

    .line 41
    .line 42
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    invoke-static {v6, v5}, Lkotlin/jvm/internal/q;->i(II)I

    .line 47
    .line 48
    .line 49
    move-result v7

    .line 50
    if-gez v7, :cond_1

    .line 51
    .line 52
    int-to-byte v6, v6

    .line 53
    add-int/lit8 v7, v4, 0x1

    .line 54
    .line 55
    aput-byte v6, v0, v4

    .line 56
    .line 57
    add-int/lit8 v2, v2, 0x1

    .line 58
    .line 59
    :goto_2
    if-ge v2, v1, :cond_0

    .line 60
    .line 61
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    invoke-static {v4, v5}, Lkotlin/jvm/internal/q;->i(II)I

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    if-gez v4, :cond_0

    .line 70
    .line 71
    add-int/lit8 v4, v2, 0x1

    .line 72
    .line 73
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    int-to-byte v2, v2

    .line 78
    add-int/lit8 v6, v7, 0x1

    .line 79
    .line 80
    aput-byte v2, v0, v7

    .line 81
    .line 82
    move v2, v4

    .line 83
    move v7, v6

    .line 84
    goto :goto_2

    .line 85
    :cond_0
    move v4, v7

    .line 86
    goto :goto_1

    .line 87
    :cond_1
    const/16 v7, 0x800

    .line 88
    .line 89
    invoke-static {v6, v7}, Lkotlin/jvm/internal/q;->i(II)I

    .line 90
    .line 91
    .line 92
    move-result v7

    .line 93
    if-gez v7, :cond_2

    .line 94
    .line 95
    shr-int/lit8 v7, v6, 0x6

    .line 96
    .line 97
    or-int/lit16 v7, v7, 0xc0

    .line 98
    .line 99
    int-to-byte v7, v7

    .line 100
    add-int/lit8 v8, v4, 0x1

    .line 101
    .line 102
    aput-byte v7, v0, v4

    .line 103
    .line 104
    and-int/lit8 v4, v6, 0x3f

    .line 105
    .line 106
    or-int/2addr v4, v5

    .line 107
    int-to-byte v4, v4

    .line 108
    add-int/lit8 v6, v8, 0x1

    .line 109
    .line 110
    aput-byte v4, v0, v8

    .line 111
    .line 112
    :goto_3
    add-int/lit8 v2, v2, 0x1

    .line 113
    .line 114
    :goto_4
    move v4, v6

    .line 115
    goto :goto_1

    .line 116
    :cond_2
    const v7, 0xd800

    .line 117
    .line 118
    .line 119
    const/16 v8, 0x3f

    .line 120
    .line 121
    if-gt v7, v6, :cond_6

    .line 122
    .line 123
    const v7, 0xdfff

    .line 124
    .line 125
    .line 126
    if-ge v7, v6, :cond_3

    .line 127
    .line 128
    goto :goto_6

    .line 129
    :cond_3
    const v9, 0xdbff

    .line 130
    .line 131
    .line 132
    invoke-static {v6, v9}, Lkotlin/jvm/internal/q;->i(II)I

    .line 133
    .line 134
    .line 135
    move-result v9

    .line 136
    if-gtz v9, :cond_5

    .line 137
    .line 138
    add-int/lit8 v9, v2, 0x1

    .line 139
    .line 140
    if-le v1, v9, :cond_5

    .line 141
    .line 142
    invoke-virtual {p0, v9}, Ljava/lang/String;->charAt(I)C

    .line 143
    .line 144
    .line 145
    move-result v10

    .line 146
    const v11, 0xdc00

    .line 147
    .line 148
    .line 149
    if-gt v11, v10, :cond_5

    .line 150
    .line 151
    if-ge v7, v10, :cond_4

    .line 152
    .line 153
    goto :goto_5

    .line 154
    :cond_4
    shl-int/lit8 v6, v6, 0xa

    .line 155
    .line 156
    invoke-virtual {p0, v9}, Ljava/lang/String;->charAt(I)C

    .line 157
    .line 158
    .line 159
    move-result v7

    .line 160
    add-int/2addr v6, v7

    .line 161
    const v7, -0x35fdc00

    .line 162
    .line 163
    .line 164
    add-int/2addr v6, v7

    .line 165
    shr-int/lit8 v7, v6, 0x12

    .line 166
    .line 167
    or-int/lit16 v7, v7, 0xf0

    .line 168
    .line 169
    int-to-byte v7, v7

    .line 170
    add-int/lit8 v9, v4, 0x1

    .line 171
    .line 172
    aput-byte v7, v0, v4

    .line 173
    .line 174
    shr-int/lit8 v4, v6, 0xc

    .line 175
    .line 176
    and-int/2addr v4, v8

    .line 177
    or-int/2addr v4, v5

    .line 178
    int-to-byte v4, v4

    .line 179
    add-int/lit8 v7, v9, 0x1

    .line 180
    .line 181
    aput-byte v4, v0, v9

    .line 182
    .line 183
    shr-int/lit8 v4, v6, 0x6

    .line 184
    .line 185
    and-int/2addr v4, v8

    .line 186
    or-int/2addr v4, v5

    .line 187
    int-to-byte v4, v4

    .line 188
    add-int/lit8 v9, v7, 0x1

    .line 189
    .line 190
    aput-byte v4, v0, v7

    .line 191
    .line 192
    and-int/lit8 v4, v6, 0x3f

    .line 193
    .line 194
    or-int/2addr v4, v5

    .line 195
    int-to-byte v4, v4

    .line 196
    add-int/lit8 v6, v9, 0x1

    .line 197
    .line 198
    aput-byte v4, v0, v9

    .line 199
    .line 200
    add-int/lit8 v2, v2, 0x2

    .line 201
    .line 202
    goto :goto_4

    .line 203
    :cond_5
    :goto_5
    add-int/lit8 v6, v4, 0x1

    .line 204
    .line 205
    aput-byte v8, v0, v4

    .line 206
    .line 207
    goto :goto_3

    .line 208
    :cond_6
    :goto_6
    shr-int/lit8 v7, v6, 0xc

    .line 209
    .line 210
    or-int/lit16 v7, v7, 0xe0

    .line 211
    .line 212
    int-to-byte v7, v7

    .line 213
    add-int/lit8 v9, v4, 0x1

    .line 214
    .line 215
    aput-byte v7, v0, v4

    .line 216
    .line 217
    shr-int/lit8 v4, v6, 0x6

    .line 218
    .line 219
    and-int/2addr v4, v8

    .line 220
    or-int/2addr v4, v5

    .line 221
    int-to-byte v4, v4

    .line 222
    add-int/lit8 v7, v9, 0x1

    .line 223
    .line 224
    aput-byte v4, v0, v9

    .line 225
    .line 226
    and-int/lit8 v4, v6, 0x3f

    .line 227
    .line 228
    or-int/2addr v4, v5

    .line 229
    int-to-byte v4, v4

    .line 230
    add-int/lit8 v6, v7, 0x1

    .line 231
    .line 232
    aput-byte v4, v0, v7

    .line 233
    .line 234
    goto :goto_3

    .line 235
    :cond_7
    invoke-static {v0, v4}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 236
    .line 237
    .line 238
    move-result-object p0

    .line 239
    invoke-static {p0, v3}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    return-object p0

    .line 243
    :cond_8
    int-to-byte v3, v4

    .line 244
    aput-byte v3, v0, v2

    .line 245
    .line 246
    add-int/lit8 v2, v2, 0x1

    .line 247
    .line 248
    goto/16 :goto_0

    .line 249
    .line 250
    :cond_9
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 251
    .line 252
    .line 253
    move-result p0

    .line 254
    invoke-static {v0, p0}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 255
    .line 256
    .line 257
    move-result-object p0

    .line 258
    invoke-static {p0, v3}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    return-object p0
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
