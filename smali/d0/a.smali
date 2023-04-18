.class public final Ld0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/util/Size;Landroid/util/Rational;)Landroid/graphics/Rect;
    .locals 7

    .line 1
    invoke-static {p1}, Ld0/a;->e(Landroid/util/Rational;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string p0, "ImageUtil"

    .line 8
    .line 9
    const-string p1, "Invalid view ratio."

    .line 10
    .line 11
    invoke-static {p0, p1}, Landroidx/camera/core/r1;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const/4 p0, 0x0

    .line 15
    return-object p0

    .line 16
    :cond_0
    invoke-virtual {p0}, Landroid/util/Size;->getWidth()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    invoke-virtual {p0}, Landroid/util/Size;->getHeight()I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    int-to-float v1, v0

    .line 25
    int-to-float v2, p0

    .line 26
    div-float v3, v1, v2

    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/util/Rational;->getNumerator()I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    invoke-virtual {p1}, Landroid/util/Rational;->getDenominator()I

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    invoke-virtual {p1}, Landroid/util/Rational;->floatValue()F

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    cmpl-float p1, p1, v3

    .line 41
    .line 42
    const/4 v3, 0x0

    .line 43
    if-lez p1, :cond_1

    .line 44
    .line 45
    int-to-float p1, v4

    .line 46
    div-float/2addr v1, p1

    .line 47
    int-to-float p1, v5

    .line 48
    mul-float/2addr v1, p1

    .line 49
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    sub-int/2addr p0, p1

    .line 54
    div-int/lit8 p0, p0, 0x2

    .line 55
    .line 56
    move v6, p1

    .line 57
    move p1, p0

    .line 58
    move p0, v6

    .line 59
    goto :goto_0

    .line 60
    :cond_1
    int-to-float p1, v5

    .line 61
    div-float/2addr v2, p1

    .line 62
    int-to-float p1, v4

    .line 63
    mul-float/2addr v2, p1

    .line 64
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    sub-int/2addr v0, p1

    .line 69
    div-int/lit8 v0, v0, 0x2

    .line 70
    .line 71
    move v6, v0

    .line 72
    move v0, p1

    .line 73
    move p1, v3

    .line 74
    move v3, v6

    .line 75
    :goto_0
    new-instance v1, Landroid/graphics/Rect;

    .line 76
    .line 77
    add-int/2addr v0, v3

    .line 78
    add-int/2addr p0, p1

    .line 79
    invoke-direct {v1, v3, p1, v0, p0}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 80
    .line 81
    .line 82
    return-object v1
    .line 83
.end method

.method public static b(Landroid/graphics/Rect;ILandroid/util/Size;I)Landroid/graphics/Rect;
    .locals 4

    .line 1
    new-instance v0, Landroid/graphics/Matrix;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 4
    .line 5
    .line 6
    sub-int/2addr p3, p1

    .line 7
    int-to-float p1, p3

    .line 8
    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->setRotate(F)V

    .line 9
    .line 10
    .line 11
    invoke-static {p2}, Ld0/a;->i(Landroid/util/Size;)[F

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 16
    .line 17
    .line 18
    const/4 p2, 0x0

    .line 19
    aget p2, p1, p2

    .line 20
    .line 21
    const/4 p3, 0x2

    .line 22
    aget p3, p1, p3

    .line 23
    .line 24
    const/4 v1, 0x4

    .line 25
    aget v1, p1, v1

    .line 26
    .line 27
    const/4 v2, 0x6

    .line 28
    aget v2, p1, v2

    .line 29
    .line 30
    invoke-static {p2, p3, v1, v2}, Ld0/a;->h(FFFF)F

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    const/4 p3, 0x1

    .line 35
    aget p3, p1, p3

    .line 36
    .line 37
    const/4 v1, 0x3

    .line 38
    aget v1, p1, v1

    .line 39
    .line 40
    const/4 v2, 0x5

    .line 41
    aget v2, p1, v2

    .line 42
    .line 43
    const/4 v3, 0x7

    .line 44
    aget p1, p1, v3

    .line 45
    .line 46
    invoke-static {p3, v1, v2, p1}, Ld0/a;->h(FFFF)F

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    neg-float p2, p2

    .line 51
    neg-float p1, p1

    .line 52
    invoke-virtual {v0, p2, p1}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v0}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    .line 56
    .line 57
    .line 58
    new-instance p1, Landroid/graphics/RectF;

    .line 59
    .line 60
    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    .line 61
    .line 62
    .line 63
    new-instance p2, Landroid/graphics/RectF;

    .line 64
    .line 65
    invoke-direct {p2, p0}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, p1, p2}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;Landroid/graphics/RectF;)Z

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1}, Landroid/graphics/RectF;->sort()V

    .line 72
    .line 73
    .line 74
    new-instance p0, Landroid/graphics/Rect;

    .line 75
    .line 76
    invoke-direct {p0}, Landroid/graphics/Rect;-><init>()V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1, p0}, Landroid/graphics/RectF;->round(Landroid/graphics/Rect;)V

    .line 80
    .line 81
    .line 82
    return-object p0
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

.method public static c(ILandroid/util/Rational;)Landroid/util/Rational;
    .locals 1

    .line 1
    const/16 v0, 0x5a

    .line 2
    .line 3
    if-eq p0, v0, :cond_1

    .line 4
    .line 5
    const/16 v0, 0x10e

    .line 6
    .line 7
    if-ne p0, v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance p0, Landroid/util/Rational;

    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/util/Rational;->getNumerator()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    invoke-virtual {p1}, Landroid/util/Rational;->getDenominator()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    invoke-direct {p0, v0, p1}, Landroid/util/Rational;-><init>(II)V

    .line 21
    .line 22
    .line 23
    return-object p0

    .line 24
    :cond_1
    :goto_0
    invoke-static {p1}, Ld0/a;->d(Landroid/util/Rational;)Landroid/util/Rational;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
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

.method private static d(Landroid/util/Rational;)Landroid/util/Rational;
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    return-object p0

    .line 4
    :cond_0
    new-instance v0, Landroid/util/Rational;

    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/util/Rational;->getDenominator()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-virtual {p0}, Landroid/util/Rational;->getNumerator()I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    invoke-direct {v0, v1, p0}, Landroid/util/Rational;-><init>(II)V

    .line 15
    .line 16
    .line 17
    return-object v0
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

.method public static e(Landroid/util/Rational;)Z
    .locals 2

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/util/Rational;->floatValue()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    invoke-virtual {p0}, Landroid/util/Rational;->isNaN()Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static f(Landroid/util/Size;Landroid/util/Rational;)Z
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/util/Rational;->floatValue()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    cmpl-float v0, v0, v1

    .line 9
    .line 10
    if-lez v0, :cond_0

    .line 11
    .line 12
    invoke-static {p0, p1}, Ld0/a;->g(Landroid/util/Size;Landroid/util/Rational;)Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/util/Rational;->isNaN()Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    if-nez p0, :cond_0

    .line 23
    .line 24
    const/4 p0, 0x1

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 p0, 0x0

    .line 27
    :goto_0
    return p0
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

.method private static g(Landroid/util/Size;Landroid/util/Rational;)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/util/Size;->getWidth()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroid/util/Size;->getHeight()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    invoke-virtual {p1}, Landroid/util/Rational;->getNumerator()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-virtual {p1}, Landroid/util/Rational;->getDenominator()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    int-to-float v2, v0

    .line 18
    int-to-float v1, v1

    .line 19
    div-float/2addr v2, v1

    .line 20
    int-to-float p1, p1

    .line 21
    mul-float/2addr v2, p1

    .line 22
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-ne p0, v2, :cond_1

    .line 27
    .line 28
    int-to-float p0, p0

    .line 29
    div-float/2addr p0, p1

    .line 30
    mul-float/2addr p0, v1

    .line 31
    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    if-eq v0, p0, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const/4 p0, 0x0

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 41
    :goto_1
    return p0
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

.method public static h(FFFF)F
    .locals 0

    invoke-static {p0, p1}, Ljava/lang/Math;->min(FF)F

    move-result p0

    invoke-static {p2, p3}, Ljava/lang/Math;->min(FF)F

    move-result p1

    invoke-static {p0, p1}, Ljava/lang/Math;->min(FF)F

    move-result p0

    return p0
.end method

.method public static i(Landroid/util/Size;)[F
    .locals 4

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    new-array v0, v0, [F

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    aput v2, v0, v1

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    aput v2, v0, v1

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/util/Size;->getWidth()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    int-to-float v1, v1

    .line 17
    const/4 v3, 0x2

    .line 18
    aput v1, v0, v3

    .line 19
    .line 20
    const/4 v1, 0x3

    .line 21
    aput v2, v0, v1

    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/util/Size;->getWidth()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    int-to-float v1, v1

    .line 28
    const/4 v3, 0x4

    .line 29
    aput v1, v0, v3

    .line 30
    .line 31
    invoke-virtual {p0}, Landroid/util/Size;->getHeight()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    int-to-float v1, v1

    .line 36
    const/4 v3, 0x5

    .line 37
    aput v1, v0, v3

    .line 38
    .line 39
    const/4 v1, 0x6

    .line 40
    aput v2, v0, v1

    .line 41
    .line 42
    invoke-virtual {p0}, Landroid/util/Size;->getHeight()I

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    int-to-float p0, p0

    .line 47
    const/4 v1, 0x7

    .line 48
    aput p0, v0, v1

    .line 49
    .line 50
    return-object v0
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

.method public static j(Landroidx/camera/core/ImageProxy;)[B
    .locals 19

    .line 1
    invoke-interface/range {p0 .. p0}, Landroidx/camera/core/ImageProxy;->n()[Landroidx/camera/core/ImageProxy$a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    aget-object v0, v0, v1

    .line 7
    .line 8
    invoke-interface/range {p0 .. p0}, Landroidx/camera/core/ImageProxy;->n()[Landroidx/camera/core/ImageProxy$a;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    const/4 v3, 0x1

    .line 13
    aget-object v2, v2, v3

    .line 14
    .line 15
    invoke-interface/range {p0 .. p0}, Landroidx/camera/core/ImageProxy;->n()[Landroidx/camera/core/ImageProxy$a;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    const/4 v4, 0x2

    .line 20
    aget-object v3, v3, v4

    .line 21
    .line 22
    invoke-interface {v0}, Landroidx/camera/core/ImageProxy$a;->c()Ljava/nio/ByteBuffer;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    invoke-interface {v2}, Landroidx/camera/core/ImageProxy$a;->c()Ljava/nio/ByteBuffer;

    .line 27
    .line 28
    .line 29
    move-result-object v6

    .line 30
    invoke-interface {v3}, Landroidx/camera/core/ImageProxy$a;->c()Ljava/nio/ByteBuffer;

    .line 31
    .line 32
    .line 33
    move-result-object v7

    .line 34
    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v7}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v5}, Ljava/nio/Buffer;->remaining()I

    .line 44
    .line 45
    .line 46
    move-result v8

    .line 47
    invoke-interface/range {p0 .. p0}, Landroidx/camera/core/ImageProxy;->getWidth()I

    .line 48
    .line 49
    .line 50
    move-result v9

    .line 51
    invoke-interface/range {p0 .. p0}, Landroidx/camera/core/ImageProxy;->getHeight()I

    .line 52
    .line 53
    .line 54
    move-result v10

    .line 55
    mul-int/2addr v9, v10

    .line 56
    div-int/2addr v9, v4

    .line 57
    add-int/2addr v9, v8

    .line 58
    new-array v9, v9, [B

    .line 59
    .line 60
    move v10, v1

    .line 61
    move v11, v10

    .line 62
    :goto_0
    invoke-interface/range {p0 .. p0}, Landroidx/camera/core/ImageProxy;->getHeight()I

    .line 63
    .line 64
    .line 65
    move-result v12

    .line 66
    if-ge v10, v12, :cond_0

    .line 67
    .line 68
    invoke-interface/range {p0 .. p0}, Landroidx/camera/core/ImageProxy;->getWidth()I

    .line 69
    .line 70
    .line 71
    move-result v12

    .line 72
    invoke-virtual {v5, v9, v11, v12}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 73
    .line 74
    .line 75
    invoke-interface/range {p0 .. p0}, Landroidx/camera/core/ImageProxy;->getWidth()I

    .line 76
    .line 77
    .line 78
    move-result v12

    .line 79
    add-int/2addr v11, v12

    .line 80
    invoke-virtual {v5}, Ljava/nio/Buffer;->position()I

    .line 81
    .line 82
    .line 83
    move-result v12

    .line 84
    invoke-interface/range {p0 .. p0}, Landroidx/camera/core/ImageProxy;->getWidth()I

    .line 85
    .line 86
    .line 87
    move-result v13

    .line 88
    sub-int/2addr v12, v13

    .line 89
    invoke-interface {v0}, Landroidx/camera/core/ImageProxy$a;->d()I

    .line 90
    .line 91
    .line 92
    move-result v13

    .line 93
    add-int/2addr v12, v13

    .line 94
    invoke-static {v8, v12}, Ljava/lang/Math;->min(II)I

    .line 95
    .line 96
    .line 97
    move-result v12

    .line 98
    invoke-virtual {v5, v12}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 99
    .line 100
    .line 101
    add-int/lit8 v10, v10, 0x1

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_0
    invoke-interface/range {p0 .. p0}, Landroidx/camera/core/ImageProxy;->getHeight()I

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    div-int/2addr v0, v4

    .line 109
    invoke-interface/range {p0 .. p0}, Landroidx/camera/core/ImageProxy;->getWidth()I

    .line 110
    .line 111
    .line 112
    move-result v5

    .line 113
    div-int/2addr v5, v4

    .line 114
    invoke-interface {v3}, Landroidx/camera/core/ImageProxy$a;->d()I

    .line 115
    .line 116
    .line 117
    move-result v4

    .line 118
    invoke-interface {v2}, Landroidx/camera/core/ImageProxy$a;->d()I

    .line 119
    .line 120
    .line 121
    move-result v8

    .line 122
    invoke-interface {v3}, Landroidx/camera/core/ImageProxy$a;->e()I

    .line 123
    .line 124
    .line 125
    move-result v3

    .line 126
    invoke-interface {v2}, Landroidx/camera/core/ImageProxy$a;->e()I

    .line 127
    .line 128
    .line 129
    move-result v2

    .line 130
    new-array v10, v4, [B

    .line 131
    .line 132
    new-array v12, v8, [B

    .line 133
    .line 134
    move v13, v1

    .line 135
    :goto_1
    if-ge v13, v0, :cond_2

    .line 136
    .line 137
    invoke-virtual {v7}, Ljava/nio/Buffer;->remaining()I

    .line 138
    .line 139
    .line 140
    move-result v14

    .line 141
    invoke-static {v4, v14}, Ljava/lang/Math;->min(II)I

    .line 142
    .line 143
    .line 144
    move-result v14

    .line 145
    invoke-virtual {v7, v10, v1, v14}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v6}, Ljava/nio/Buffer;->remaining()I

    .line 149
    .line 150
    .line 151
    move-result v14

    .line 152
    invoke-static {v8, v14}, Ljava/lang/Math;->min(II)I

    .line 153
    .line 154
    .line 155
    move-result v14

    .line 156
    invoke-virtual {v6, v12, v1, v14}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 157
    .line 158
    .line 159
    move v14, v1

    .line 160
    move v15, v14

    .line 161
    move/from16 v16, v15

    .line 162
    .line 163
    :goto_2
    if-ge v14, v5, :cond_1

    .line 164
    .line 165
    add-int/lit8 v17, v11, 0x1

    .line 166
    .line 167
    aget-byte v18, v10, v15

    .line 168
    .line 169
    aput-byte v18, v9, v11

    .line 170
    .line 171
    add-int/lit8 v11, v17, 0x1

    .line 172
    .line 173
    aget-byte v18, v12, v16

    .line 174
    .line 175
    aput-byte v18, v9, v17

    .line 176
    .line 177
    add-int/2addr v15, v3

    .line 178
    add-int v16, v16, v2

    .line 179
    .line 180
    add-int/lit8 v14, v14, 0x1

    .line 181
    .line 182
    goto :goto_2

    .line 183
    :cond_1
    add-int/lit8 v13, v13, 0x1

    .line 184
    .line 185
    goto :goto_1

    .line 186
    :cond_2
    return-object v9
    .line 187
    .line 188
    .line 189
.end method
