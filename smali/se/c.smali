.class public final Lse/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0003*\u00020\u0000\"\u0017\u0010\t\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0002\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\n"
    }
    d2 = {
        "Landroid/hardware/camera2/CameraCharacteristics;",
        "Lcom/facebook/react/bridge/ReadableArray;",
        "a",
        "",
        "b",
        "Landroid/util/Size;",
        "Landroid/util/Size;",
        "getSize35mm",
        "()Landroid/util/Size;",
        "Size35mm",
        "react-native-vision-camera_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field private static final a:Landroid/util/Size;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Landroid/util/Size;

    const/16 v1, 0x24

    const/16 v2, 0x18

    invoke-direct {v0, v1, v2}, Landroid/util/Size;-><init>(II)V

    sput-object v0, Lse/c;->a:Landroid/util/Size;

    return-void
.end method

.method public static final a(Landroid/hardware/camera2/CameraCharacteristics;)Lcom/facebook/react/bridge/ReadableArray;
    .locals 11

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Landroid/hardware/camera2/CameraCharacteristics;->LENS_INFO_AVAILABLE_FOCAL_LENGTHS:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {v0}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    check-cast v0, [F

    .line 16
    .line 17
    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->SENSOR_INFO_PHYSICAL_SIZE:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 18
    .line 19
    invoke-virtual {p0, v1}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-static {p0}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    check-cast p0, Landroid/util/SizeF;

    .line 27
    .line 28
    sget-object v1, Lse/c;->a:Landroid/util/Size;

    .line 29
    .line 30
    invoke-static {v1}, Lre/c;->c(Landroid/util/Size;)I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    int-to-float v1, v1

    .line 35
    invoke-static {p0}, Lre/c;->b(Landroid/util/SizeF;)F

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    div-float/2addr v1, p0

    .line 40
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createArray()Lcom/facebook/react/bridge/WritableArray;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    array-length v2, v0

    .line 45
    const/4 v3, 0x0

    .line 46
    move v4, v3

    .line 47
    :goto_0
    const/high16 v5, 0x420c0000    # 35.0f

    .line 48
    .line 49
    const/4 v6, 0x1

    .line 50
    if-ge v4, v2, :cond_2

    .line 51
    .line 52
    aget v7, v0, v4

    .line 53
    .line 54
    mul-float/2addr v7, v1

    .line 55
    cmpl-float v7, v7, v5

    .line 56
    .line 57
    if-lez v7, :cond_0

    .line 58
    .line 59
    move v7, v6

    .line 60
    goto :goto_1

    .line 61
    :cond_0
    move v7, v3

    .line 62
    :goto_1
    if-eqz v7, :cond_1

    .line 63
    .line 64
    move v2, v6

    .line 65
    goto :goto_2

    .line 66
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_2
    move v2, v3

    .line 70
    :goto_2
    array-length v4, v0

    .line 71
    move v7, v3

    .line 72
    :goto_3
    const/high16 v8, 0x41c00000    # 24.0f

    .line 73
    .line 74
    if-ge v7, v4, :cond_5

    .line 75
    .line 76
    aget v9, v0, v7

    .line 77
    .line 78
    mul-float/2addr v9, v1

    .line 79
    cmpl-float v10, v9, v8

    .line 80
    .line 81
    if-ltz v10, :cond_3

    .line 82
    .line 83
    cmpg-float v9, v9, v5

    .line 84
    .line 85
    if-gtz v9, :cond_3

    .line 86
    .line 87
    move v9, v6

    .line 88
    goto :goto_4

    .line 89
    :cond_3
    move v9, v3

    .line 90
    :goto_4
    if-eqz v9, :cond_4

    .line 91
    .line 92
    move v4, v6

    .line 93
    goto :goto_5

    .line 94
    :cond_4
    add-int/lit8 v7, v7, 0x1

    .line 95
    .line 96
    goto :goto_3

    .line 97
    :cond_5
    move v4, v3

    .line 98
    :goto_5
    array-length v5, v0

    .line 99
    move v7, v3

    .line 100
    :goto_6
    if-ge v7, v5, :cond_8

    .line 101
    .line 102
    aget v9, v0, v7

    .line 103
    .line 104
    mul-float/2addr v9, v1

    .line 105
    cmpg-float v9, v9, v8

    .line 106
    .line 107
    if-gez v9, :cond_6

    .line 108
    .line 109
    move v9, v6

    .line 110
    goto :goto_7

    .line 111
    :cond_6
    move v9, v3

    .line 112
    :goto_7
    if-eqz v9, :cond_7

    .line 113
    .line 114
    move v3, v6

    .line 115
    goto :goto_8

    .line 116
    :cond_7
    add-int/lit8 v7, v7, 0x1

    .line 117
    .line 118
    goto :goto_6

    .line 119
    :cond_8
    :goto_8
    if-eqz v2, :cond_9

    .line 120
    .line 121
    const-string v0, "telephoto-camera"

    .line 122
    .line 123
    invoke-interface {p0, v0}, Lcom/facebook/react/bridge/WritableArray;->pushString(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    :cond_9
    if-eqz v4, :cond_a

    .line 127
    .line 128
    const-string v0, "wide-angle-camera"

    .line 129
    .line 130
    invoke-interface {p0, v0}, Lcom/facebook/react/bridge/WritableArray;->pushString(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    :cond_a
    if-eqz v3, :cond_b

    .line 134
    .line 135
    const-string v0, "ultra-wide-angle-camera"

    .line 136
    .line 137
    invoke-interface {p0, v0}, Lcom/facebook/react/bridge/WritableArray;->pushString(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    :cond_b
    const-string v0, "deviceTypes"

    .line 141
    .line 142
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    return-object p0
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
    .line 358
.end method

.method public static final b(Landroid/hardware/camera2/CameraCharacteristics;)D
    .locals 4

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Landroid/hardware/camera2/CameraCharacteristics;->LENS_INFO_AVAILABLE_FOCAL_LENGTHS:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {v0}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    check-cast v0, [F

    .line 16
    .line 17
    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->SENSOR_INFO_PHYSICAL_SIZE:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 18
    .line 19
    invoke-virtual {p0, v1}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-static {p0}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    check-cast p0, Landroid/util/SizeF;

    .line 27
    .line 28
    const/4 v1, 0x2

    .line 29
    int-to-float v1, v1

    .line 30
    invoke-static {p0}, Lre/c;->b(Landroid/util/SizeF;)F

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    const/4 v2, 0x0

    .line 35
    aget v0, v0, v2

    .line 36
    .line 37
    mul-float/2addr v0, v1

    .line 38
    div-float/2addr p0, v0

    .line 39
    float-to-double v2, p0

    .line 40
    invoke-static {v2, v3}, Ljava/lang/Math;->atan(D)D

    .line 41
    .line 42
    .line 43
    move-result-wide v2

    .line 44
    double-to-float p0, v2

    .line 45
    mul-float/2addr v1, p0

    .line 46
    float-to-double v0, v1

    .line 47
    const-wide v2, 0x404ca5dc1a63c1f8L    # 57.29577951308232

    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    mul-double/2addr v0, v2

    .line 53
    return-wide v0
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
.end method
