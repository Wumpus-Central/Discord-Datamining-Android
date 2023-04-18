.class Lcom/horcrux/svg/RenderableViewManager;
.super Lcom/facebook/react/uimanager/ViewGroupManager;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/horcrux/svg/RenderableViewManager$RadialGradientManager;,
        Lcom/horcrux/svg/RenderableViewManager$LinearGradientManager;,
        Lcom/horcrux/svg/RenderableViewManager$MarkerManager;,
        Lcom/horcrux/svg/RenderableViewManager$ForeignObjectManager;,
        Lcom/horcrux/svg/RenderableViewManager$MaskManager;,
        Lcom/horcrux/svg/RenderableViewManager$PatternManager;,
        Lcom/horcrux/svg/RenderableViewManager$SymbolManager;,
        Lcom/horcrux/svg/RenderableViewManager$UseViewManager;,
        Lcom/horcrux/svg/RenderableViewManager$DefsViewManager;,
        Lcom/horcrux/svg/RenderableViewManager$ClipPathViewManager;,
        Lcom/horcrux/svg/RenderableViewManager$RectViewManager;,
        Lcom/horcrux/svg/RenderableViewManager$LineViewManager;,
        Lcom/horcrux/svg/RenderableViewManager$EllipseViewManager;,
        Lcom/horcrux/svg/RenderableViewManager$CircleViewManager;,
        Lcom/horcrux/svg/RenderableViewManager$ImageViewManager;,
        Lcom/horcrux/svg/RenderableViewManager$TextPathViewManager;,
        Lcom/horcrux/svg/RenderableViewManager$TSpanViewManager;,
        Lcom/horcrux/svg/RenderableViewManager$TextViewManager;,
        Lcom/horcrux/svg/RenderableViewManager$PathViewManager;,
        Lcom/horcrux/svg/RenderableViewManager$GroupViewManager;,
        Lcom/horcrux/svg/RenderableViewManager$c;,
        Lcom/horcrux/svg/RenderableViewManager$d;,
        Lcom/horcrux/svg/RenderableViewManager$e;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/react/uimanager/ViewGroupManager<",
        "Lcom/horcrux/svg/VirtualView;",
        ">;"
    }
.end annotation


# static fields
.field private static final CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER:F = 5.0f

.field private static final EPSILON:D = 1.0E-5

.field private static final PERSPECTIVE_ARRAY_INVERTED_CAMERA_DISTANCE_INDEX:I = 0x2

.field private static final mTagToRenderableView:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lcom/horcrux/svg/RenderableView;",
            ">;"
        }
    .end annotation
.end field

.field private static final mTagToRunnable:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field

.field private static final sMatrixDecompositionContext:Lcom/horcrux/svg/RenderableViewManager$c;

.field private static final sTransformDecompositionArray:[D


# instance fields
.field private final mClassName:Ljava/lang/String;

.field private final svgClass:Lcom/horcrux/svg/RenderableViewManager$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/horcrux/svg/RenderableViewManager$c;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/horcrux/svg/RenderableViewManager$c;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/horcrux/svg/RenderableViewManager;->sMatrixDecompositionContext:Lcom/horcrux/svg/RenderableViewManager$c;

    .line 7
    .line 8
    const/16 v0, 0x10

    .line 9
    .line 10
    new-array v0, v0, [D

    .line 11
    .line 12
    sput-object v0, Lcom/horcrux/svg/RenderableViewManager;->sTransformDecompositionArray:[D

    .line 13
    .line 14
    new-instance v0, Landroid/util/SparseArray;

    .line 15
    .line 16
    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lcom/horcrux/svg/RenderableViewManager;->mTagToRenderableView:Landroid/util/SparseArray;

    .line 20
    .line 21
    new-instance v0, Landroid/util/SparseArray;

    .line 22
    .line 23
    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 24
    .line 25
    .line 26
    sput-object v0, Lcom/horcrux/svg/RenderableViewManager;->mTagToRunnable:Landroid/util/SparseArray;

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

.method private constructor <init>(Lcom/horcrux/svg/RenderableViewManager$e;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/facebook/react/uimanager/ViewGroupManager;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/horcrux/svg/RenderableViewManager;->svgClass:Lcom/horcrux/svg/RenderableViewManager$e;

    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/horcrux/svg/RenderableViewManager;->mClassName:Ljava/lang/String;

    return-void
.end method

.method synthetic constructor <init>(Lcom/horcrux/svg/RenderableViewManager$e;Lcom/horcrux/svg/RenderableViewManager$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/horcrux/svg/RenderableViewManager;-><init>(Lcom/horcrux/svg/RenderableViewManager$e;)V

    return-void
.end method

.method static synthetic access$100(Lcom/horcrux/svg/RenderableViewManager;Lcom/horcrux/svg/VirtualView;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/horcrux/svg/RenderableViewManager;->invalidateSvgView(Lcom/horcrux/svg/VirtualView;)V

    return-void
.end method

.method private static decomposeMatrix()V
    .locals 22

    .line 1
    sget-object v0, Lcom/horcrux/svg/RenderableViewManager;->sMatrixDecompositionContext:Lcom/horcrux/svg/RenderableViewManager$c;

    .line 2
    .line 3
    iget-object v1, v0, Lcom/horcrux/svg/RenderableViewManager$c;->a:[D

    .line 4
    .line 5
    iget-object v2, v0, Lcom/horcrux/svg/RenderableViewManager$c;->b:[D

    .line 6
    .line 7
    iget-object v3, v0, Lcom/horcrux/svg/RenderableViewManager$c;->c:[D

    .line 8
    .line 9
    iget-object v4, v0, Lcom/horcrux/svg/RenderableViewManager$c;->d:[D

    .line 10
    .line 11
    iget-object v0, v0, Lcom/horcrux/svg/RenderableViewManager$c;->e:[D

    .line 12
    .line 13
    sget-object v5, Lcom/horcrux/svg/RenderableViewManager;->sTransformDecompositionArray:[D

    .line 14
    .line 15
    const/16 v6, 0xf

    .line 16
    .line 17
    aget-wide v7, v5, v6

    .line 18
    .line 19
    invoke-static {v7, v8}, Lcom/horcrux/svg/RenderableViewManager;->isZero(D)Z

    .line 20
    .line 21
    .line 22
    move-result v5

    .line 23
    if-eqz v5, :cond_0

    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    const/4 v5, 0x2

    .line 27
    new-array v7, v5, [I

    .line 28
    .line 29
    fill-array-data v7, :array_0

    .line 30
    .line 31
    .line 32
    sget-object v8, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 33
    .line 34
    invoke-static {v8, v7}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v7

    .line 38
    check-cast v7, [[D

    .line 39
    .line 40
    const/16 v8, 0x10

    .line 41
    .line 42
    new-array v8, v8, [D

    .line 43
    .line 44
    const/4 v9, 0x0

    .line 45
    move v10, v9

    .line 46
    :goto_0
    const-wide/16 v11, 0x0

    .line 47
    .line 48
    const/4 v13, 0x4

    .line 49
    const/4 v14, 0x3

    .line 50
    if-ge v10, v13, :cond_3

    .line 51
    .line 52
    move v15, v9

    .line 53
    :goto_1
    if-ge v15, v13, :cond_2

    .line 54
    .line 55
    sget-object v16, Lcom/horcrux/svg/RenderableViewManager;->sTransformDecompositionArray:[D

    .line 56
    .line 57
    mul-int/lit8 v17, v10, 0x4

    .line 58
    .line 59
    add-int v17, v17, v15

    .line 60
    .line 61
    aget-wide v18, v16, v17

    .line 62
    .line 63
    aget-wide v20, v16, v6

    .line 64
    .line 65
    div-double v18, v18, v20

    .line 66
    .line 67
    aget-object v16, v7, v10

    .line 68
    .line 69
    aput-wide v18, v16, v15

    .line 70
    .line 71
    if-ne v15, v14, :cond_1

    .line 72
    .line 73
    move-wide/from16 v18, v11

    .line 74
    .line 75
    :cond_1
    aput-wide v18, v8, v17

    .line 76
    .line 77
    add-int/lit8 v15, v15, 0x1

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_2
    add-int/lit8 v10, v10, 0x1

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_3
    const-wide/high16 v15, 0x3ff0000000000000L    # 1.0

    .line 84
    .line 85
    aput-wide v15, v8, v6

    .line 86
    .line 87
    invoke-static {v8}, Lcom/facebook/react/uimanager/MatrixMathHelper;->determinant([D)D

    .line 88
    .line 89
    .line 90
    move-result-wide v17

    .line 91
    invoke-static/range {v17 .. v18}, Lcom/horcrux/svg/RenderableViewManager;->isZero(D)Z

    .line 92
    .line 93
    .line 94
    move-result v6

    .line 95
    if-eqz v6, :cond_4

    .line 96
    .line 97
    return-void

    .line 98
    :cond_4
    aget-object v6, v7, v9

    .line 99
    .line 100
    aget-wide v17, v6, v14

    .line 101
    .line 102
    invoke-static/range {v17 .. v18}, Lcom/horcrux/svg/RenderableViewManager;->isZero(D)Z

    .line 103
    .line 104
    .line 105
    move-result v6

    .line 106
    const/4 v10, 0x1

    .line 107
    if-eqz v6, :cond_6

    .line 108
    .line 109
    aget-object v6, v7, v10

    .line 110
    .line 111
    aget-wide v17, v6, v14

    .line 112
    .line 113
    invoke-static/range {v17 .. v18}, Lcom/horcrux/svg/RenderableViewManager;->isZero(D)Z

    .line 114
    .line 115
    .line 116
    move-result v6

    .line 117
    if-eqz v6, :cond_6

    .line 118
    .line 119
    aget-object v6, v7, v5

    .line 120
    .line 121
    aget-wide v17, v6, v14

    .line 122
    .line 123
    invoke-static/range {v17 .. v18}, Lcom/horcrux/svg/RenderableViewManager;->isZero(D)Z

    .line 124
    .line 125
    .line 126
    move-result v6

    .line 127
    if-nez v6, :cond_5

    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_5
    aput-wide v11, v1, v5

    .line 131
    .line 132
    aput-wide v11, v1, v10

    .line 133
    .line 134
    aput-wide v11, v1, v9

    .line 135
    .line 136
    aput-wide v15, v1, v14

    .line 137
    .line 138
    goto :goto_3

    .line 139
    :cond_6
    :goto_2
    new-array v6, v13, [D

    .line 140
    .line 141
    aget-object v13, v7, v9

    .line 142
    .line 143
    aget-wide v15, v13, v14

    .line 144
    .line 145
    aput-wide v15, v6, v9

    .line 146
    .line 147
    aget-object v13, v7, v10

    .line 148
    .line 149
    aget-wide v15, v13, v14

    .line 150
    .line 151
    aput-wide v15, v6, v10

    .line 152
    .line 153
    aget-object v13, v7, v5

    .line 154
    .line 155
    aget-wide v15, v13, v14

    .line 156
    .line 157
    aput-wide v15, v6, v5

    .line 158
    .line 159
    aget-object v13, v7, v14

    .line 160
    .line 161
    aget-wide v15, v13, v14

    .line 162
    .line 163
    aput-wide v15, v6, v14

    .line 164
    .line 165
    invoke-static {v8}, Lcom/facebook/react/uimanager/MatrixMathHelper;->inverse([D)[D

    .line 166
    .line 167
    .line 168
    move-result-object v8

    .line 169
    invoke-static {v8}, Lcom/facebook/react/uimanager/MatrixMathHelper;->transpose([D)[D

    .line 170
    .line 171
    .line 172
    move-result-object v8

    .line 173
    invoke-static {v6, v8, v1}, Lcom/facebook/react/uimanager/MatrixMathHelper;->multiplyVectorByMatrix([D[D[D)V

    .line 174
    .line 175
    .line 176
    :goto_3
    aget-object v1, v7, v14

    .line 177
    .line 178
    invoke-static {v1, v9, v4, v9, v14}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 179
    .line 180
    .line 181
    new-array v1, v5, [I

    .line 182
    .line 183
    fill-array-data v1, :array_1

    .line 184
    .line 185
    .line 186
    sget-object v4, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 187
    .line 188
    invoke-static {v4, v1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    check-cast v1, [[D

    .line 193
    .line 194
    move v4, v9

    .line 195
    :goto_4
    if-ge v4, v14, :cond_7

    .line 196
    .line 197
    aget-object v6, v1, v4

    .line 198
    .line 199
    aget-object v8, v7, v4

    .line 200
    .line 201
    aget-wide v15, v8, v9

    .line 202
    .line 203
    aput-wide v15, v6, v9

    .line 204
    .line 205
    aget-wide v15, v8, v10

    .line 206
    .line 207
    aput-wide v15, v6, v10

    .line 208
    .line 209
    aget-wide v15, v8, v5

    .line 210
    .line 211
    aput-wide v15, v6, v5

    .line 212
    .line 213
    add-int/lit8 v4, v4, 0x1

    .line 214
    .line 215
    goto :goto_4

    .line 216
    :cond_7
    aget-object v4, v1, v9

    .line 217
    .line 218
    invoke-static {v4}, Lcom/facebook/react/uimanager/MatrixMathHelper;->v3Length([D)D

    .line 219
    .line 220
    .line 221
    move-result-wide v6

    .line 222
    aput-wide v6, v2, v9

    .line 223
    .line 224
    aget-object v4, v1, v9

    .line 225
    .line 226
    invoke-static {v4, v6, v7}, Lcom/facebook/react/uimanager/MatrixMathHelper;->v3Normalize([DD)[D

    .line 227
    .line 228
    .line 229
    move-result-object v4

    .line 230
    aput-object v4, v1, v9

    .line 231
    .line 232
    aget-object v6, v1, v10

    .line 233
    .line 234
    invoke-static {v4, v6}, Lcom/facebook/react/uimanager/MatrixMathHelper;->v3Dot([D[D)D

    .line 235
    .line 236
    .line 237
    move-result-wide v6

    .line 238
    aput-wide v6, v3, v9

    .line 239
    .line 240
    aget-object v15, v1, v10

    .line 241
    .line 242
    aget-object v16, v1, v9

    .line 243
    .line 244
    const-wide/high16 v17, 0x3ff0000000000000L    # 1.0

    .line 245
    .line 246
    neg-double v6, v6

    .line 247
    move-wide/from16 v19, v6

    .line 248
    .line 249
    invoke-static/range {v15 .. v20}, Lcom/facebook/react/uimanager/MatrixMathHelper;->v3Combine([D[DDD)[D

    .line 250
    .line 251
    .line 252
    move-result-object v4

    .line 253
    aput-object v4, v1, v10

    .line 254
    .line 255
    aget-object v6, v1, v9

    .line 256
    .line 257
    invoke-static {v6, v4}, Lcom/facebook/react/uimanager/MatrixMathHelper;->v3Dot([D[D)D

    .line 258
    .line 259
    .line 260
    move-result-wide v6

    .line 261
    aput-wide v6, v3, v9

    .line 262
    .line 263
    aget-object v15, v1, v10

    .line 264
    .line 265
    aget-object v16, v1, v9

    .line 266
    .line 267
    neg-double v6, v6

    .line 268
    move-wide/from16 v19, v6

    .line 269
    .line 270
    invoke-static/range {v15 .. v20}, Lcom/facebook/react/uimanager/MatrixMathHelper;->v3Combine([D[DDD)[D

    .line 271
    .line 272
    .line 273
    move-result-object v4

    .line 274
    aput-object v4, v1, v10

    .line 275
    .line 276
    invoke-static {v4}, Lcom/facebook/react/uimanager/MatrixMathHelper;->v3Length([D)D

    .line 277
    .line 278
    .line 279
    move-result-wide v6

    .line 280
    aput-wide v6, v2, v10

    .line 281
    .line 282
    aget-object v4, v1, v10

    .line 283
    .line 284
    invoke-static {v4, v6, v7}, Lcom/facebook/react/uimanager/MatrixMathHelper;->v3Normalize([DD)[D

    .line 285
    .line 286
    .line 287
    move-result-object v4

    .line 288
    aput-object v4, v1, v10

    .line 289
    .line 290
    aget-wide v6, v3, v9

    .line 291
    .line 292
    aget-wide v15, v2, v10

    .line 293
    .line 294
    div-double/2addr v6, v15

    .line 295
    aput-wide v6, v3, v9

    .line 296
    .line 297
    aget-object v4, v1, v9

    .line 298
    .line 299
    aget-object v6, v1, v5

    .line 300
    .line 301
    invoke-static {v4, v6}, Lcom/facebook/react/uimanager/MatrixMathHelper;->v3Dot([D[D)D

    .line 302
    .line 303
    .line 304
    move-result-wide v6

    .line 305
    aput-wide v6, v3, v10

    .line 306
    .line 307
    aget-object v15, v1, v5

    .line 308
    .line 309
    aget-object v16, v1, v9

    .line 310
    .line 311
    neg-double v6, v6

    .line 312
    move-wide/from16 v19, v6

    .line 313
    .line 314
    invoke-static/range {v15 .. v20}, Lcom/facebook/react/uimanager/MatrixMathHelper;->v3Combine([D[DDD)[D

    .line 315
    .line 316
    .line 317
    move-result-object v4

    .line 318
    aput-object v4, v1, v5

    .line 319
    .line 320
    aget-object v6, v1, v10

    .line 321
    .line 322
    invoke-static {v6, v4}, Lcom/facebook/react/uimanager/MatrixMathHelper;->v3Dot([D[D)D

    .line 323
    .line 324
    .line 325
    move-result-wide v6

    .line 326
    aput-wide v6, v3, v5

    .line 327
    .line 328
    aget-object v15, v1, v5

    .line 329
    .line 330
    aget-object v16, v1, v10

    .line 331
    .line 332
    neg-double v6, v6

    .line 333
    move-wide/from16 v19, v6

    .line 334
    .line 335
    invoke-static/range {v15 .. v20}, Lcom/facebook/react/uimanager/MatrixMathHelper;->v3Combine([D[DDD)[D

    .line 336
    .line 337
    .line 338
    move-result-object v4

    .line 339
    aput-object v4, v1, v5

    .line 340
    .line 341
    invoke-static {v4}, Lcom/facebook/react/uimanager/MatrixMathHelper;->v3Length([D)D

    .line 342
    .line 343
    .line 344
    move-result-wide v6

    .line 345
    aput-wide v6, v2, v5

    .line 346
    .line 347
    aget-object v4, v1, v5

    .line 348
    .line 349
    invoke-static {v4, v6, v7}, Lcom/facebook/react/uimanager/MatrixMathHelper;->v3Normalize([DD)[D

    .line 350
    .line 351
    .line 352
    move-result-object v4

    .line 353
    aput-object v4, v1, v5

    .line 354
    .line 355
    aget-wide v6, v3, v10

    .line 356
    .line 357
    aget-wide v15, v2, v5

    .line 358
    .line 359
    div-double/2addr v6, v15

    .line 360
    aput-wide v6, v3, v10

    .line 361
    .line 362
    aget-wide v6, v3, v5

    .line 363
    .line 364
    div-double/2addr v6, v15

    .line 365
    aput-wide v6, v3, v5

    .line 366
    .line 367
    aget-object v3, v1, v10

    .line 368
    .line 369
    invoke-static {v3, v4}, Lcom/facebook/react/uimanager/MatrixMathHelper;->v3Cross([D[D)[D

    .line 370
    .line 371
    .line 372
    move-result-object v3

    .line 373
    aget-object v4, v1, v9

    .line 374
    .line 375
    invoke-static {v4, v3}, Lcom/facebook/react/uimanager/MatrixMathHelper;->v3Dot([D[D)D

    .line 376
    .line 377
    .line 378
    move-result-wide v3

    .line 379
    cmpg-double v3, v3, v11

    .line 380
    .line 381
    if-gez v3, :cond_8

    .line 382
    .line 383
    move v3, v9

    .line 384
    :goto_5
    if-ge v3, v14, :cond_8

    .line 385
    .line 386
    aget-wide v6, v2, v3

    .line 387
    .line 388
    const-wide/high16 v11, -0x4010000000000000L    # -1.0

    .line 389
    .line 390
    mul-double/2addr v6, v11

    .line 391
    aput-wide v6, v2, v3

    .line 392
    .line 393
    aget-object v4, v1, v3

    .line 394
    .line 395
    aget-wide v6, v4, v9

    .line 396
    .line 397
    mul-double/2addr v6, v11

    .line 398
    aput-wide v6, v4, v9

    .line 399
    .line 400
    aget-wide v6, v4, v10

    .line 401
    .line 402
    mul-double/2addr v6, v11

    .line 403
    aput-wide v6, v4, v10

    .line 404
    .line 405
    aget-wide v6, v4, v5

    .line 406
    .line 407
    mul-double/2addr v6, v11

    .line 408
    aput-wide v6, v4, v5

    .line 409
    .line 410
    add-int/lit8 v3, v3, 0x1

    .line 411
    .line 412
    goto :goto_5

    .line 413
    :cond_8
    aget-object v2, v1, v5

    .line 414
    .line 415
    aget-wide v3, v2, v10

    .line 416
    .line 417
    aget-wide v6, v2, v5

    .line 418
    .line 419
    invoke-static {v3, v4, v6, v7}, Ljava/lang/Math;->atan2(DD)D

    .line 420
    .line 421
    .line 422
    move-result-wide v2

    .line 423
    neg-double v2, v2

    .line 424
    const-wide v6, 0x404ca5dc1a63c1f8L    # 57.29577951308232

    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    mul-double/2addr v2, v6

    .line 430
    invoke-static {v2, v3}, Lcom/facebook/react/uimanager/MatrixMathHelper;->roundTo3Places(D)D

    .line 431
    .line 432
    .line 433
    move-result-wide v2

    .line 434
    aput-wide v2, v0, v9

    .line 435
    .line 436
    aget-object v2, v1, v5

    .line 437
    .line 438
    aget-wide v3, v2, v9

    .line 439
    .line 440
    neg-double v3, v3

    .line 441
    aget-wide v11, v2, v10

    .line 442
    .line 443
    mul-double/2addr v11, v11

    .line 444
    aget-wide v13, v2, v5

    .line 445
    .line 446
    mul-double/2addr v13, v13

    .line 447
    add-double/2addr v11, v13

    .line 448
    invoke-static {v11, v12}, Ljava/lang/Math;->sqrt(D)D

    .line 449
    .line 450
    .line 451
    move-result-wide v11

    .line 452
    invoke-static {v3, v4, v11, v12}, Ljava/lang/Math;->atan2(DD)D

    .line 453
    .line 454
    .line 455
    move-result-wide v2

    .line 456
    neg-double v2, v2

    .line 457
    mul-double/2addr v2, v6

    .line 458
    invoke-static {v2, v3}, Lcom/facebook/react/uimanager/MatrixMathHelper;->roundTo3Places(D)D

    .line 459
    .line 460
    .line 461
    move-result-wide v2

    .line 462
    aput-wide v2, v0, v10

    .line 463
    .line 464
    aget-object v2, v1, v10

    .line 465
    .line 466
    aget-wide v3, v2, v9

    .line 467
    .line 468
    aget-object v1, v1, v9

    .line 469
    .line 470
    aget-wide v8, v1, v9

    .line 471
    .line 472
    invoke-static {v3, v4, v8, v9}, Ljava/lang/Math;->atan2(DD)D

    .line 473
    .line 474
    .line 475
    move-result-wide v1

    .line 476
    neg-double v1, v1

    .line 477
    mul-double/2addr v1, v6

    .line 478
    invoke-static {v1, v2}, Lcom/facebook/react/uimanager/MatrixMathHelper;->roundTo3Places(D)D

    .line 479
    .line 480
    .line 481
    move-result-wide v1

    .line 482
    aput-wide v1, v0, v5

    .line 483
    .line 484
    return-void

    :array_0
    .array-data 4
        0x4
        0x4
    .end array-data

    :array_1
    .array-data 4
        0x3
        0x3
    .end array-data
.end method

.method static getRenderableViewByTag(I)Lcom/horcrux/svg/RenderableView;
    .locals 1

    sget-object v0, Lcom/horcrux/svg/RenderableViewManager;->mTagToRenderableView:Landroid/util/SparseArray;

    invoke-virtual {v0, p0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/horcrux/svg/RenderableView;

    return-object p0
.end method

.method private invalidateSvgView(Lcom/horcrux/svg/VirtualView;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcom/horcrux/svg/VirtualView;->getSvgView()Lcom/horcrux/svg/SvgView;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/horcrux/svg/SvgView;->invalidate()V

    .line 8
    .line 9
    .line 10
    :cond_0
    instance-of v0, p1, Lcom/horcrux/svg/t0;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    check-cast p1, Lcom/horcrux/svg/t0;

    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/horcrux/svg/t0;->o()Lcom/horcrux/svg/t0;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p1}, Lcom/horcrux/svg/VirtualView;->clearChildCache()V

    .line 21
    .line 22
    .line 23
    :cond_1
    return-void
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method private static isZero(D)Z
    .locals 2

    invoke-static {p0, p1}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p0, p1}, Ljava/lang/Math;->abs(D)D

    move-result-wide p0

    const-wide v0, 0x3ee4f8b588e368f1L    # 1.0E-5

    cmpg-double p0, p0, v0

    if-gez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static resetTransformProperty(Landroid/view/View;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Landroid/view/View;->setTranslationX(F)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0}, Landroid/view/View;->setTranslationY(F)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroid/view/View;->setRotation(F)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Landroid/view/View;->setRotationX(F)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0}, Landroid/view/View;->setRotationY(F)V

    .line 15
    .line 16
    .line 17
    const/high16 v1, 0x3f800000    # 1.0f

    .line 18
    .line 19
    invoke-virtual {p0, v1}, Landroid/view/View;->setScaleX(F)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v1}, Landroid/view/View;->setScaleY(F)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v0}, Landroid/view/View;->setCameraDistance(F)V

    .line 26
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
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method

.method static runWhenViewIsAvailable(ILjava/lang/Runnable;)V
    .locals 1

    sget-object v0, Lcom/horcrux/svg/RenderableViewManager;->mTagToRunnable:Landroid/util/SparseArray;

    invoke-virtual {v0, p0, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    return-void
.end method

.method static setRenderableView(ILcom/horcrux/svg/RenderableView;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/horcrux/svg/RenderableViewManager;->mTagToRenderableView:Landroid/util/SparseArray;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    sget-object p1, Lcom/horcrux/svg/RenderableViewManager;->mTagToRunnable:Landroid/util/SparseArray;

    .line 7
    .line 8
    invoke-virtual {p1, p0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/lang/Runnable;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, p0}, Landroid/util/SparseArray;->delete(I)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
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
.end method

.method private static setTransformProperty(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 6

    .line 1
    sget-object v0, Lcom/horcrux/svg/RenderableViewManager;->sTransformDecompositionArray:[D

    .line 2
    .line 3
    invoke-static {p1, v0}, Lcom/facebook/react/uimanager/TransformHelper;->processTransform(Lcom/facebook/react/bridge/ReadableArray;[D)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/horcrux/svg/RenderableViewManager;->decomposeMatrix()V

    .line 7
    .line 8
    .line 9
    sget-object p1, Lcom/horcrux/svg/RenderableViewManager;->sMatrixDecompositionContext:Lcom/horcrux/svg/RenderableViewManager$c;

    .line 10
    .line 11
    iget-object v0, p1, Lcom/horcrux/svg/RenderableViewManager$c;->d:[D

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    aget-wide v2, v0, v1

    .line 15
    .line 16
    double-to-float v0, v2

    .line 17
    invoke-static {v0}, Lcom/facebook/react/uimanager/PixelUtil;->toPixelFromDIP(F)F

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-virtual {p0, v0}, Landroid/view/View;->setTranslationX(F)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p1, Lcom/horcrux/svg/RenderableViewManager$c;->d:[D

    .line 25
    .line 26
    const/4 v2, 0x1

    .line 27
    aget-wide v3, v0, v2

    .line 28
    .line 29
    double-to-float v0, v3

    .line 30
    invoke-static {v0}, Lcom/facebook/react/uimanager/PixelUtil;->toPixelFromDIP(F)F

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    invoke-virtual {p0, v0}, Landroid/view/View;->setTranslationY(F)V

    .line 35
    .line 36
    .line 37
    iget-object v0, p1, Lcom/horcrux/svg/RenderableViewManager$c;->e:[D

    .line 38
    .line 39
    const/4 v3, 0x2

    .line 40
    aget-wide v4, v0, v3

    .line 41
    .line 42
    double-to-float v0, v4

    .line 43
    invoke-virtual {p0, v0}, Landroid/view/View;->setRotation(F)V

    .line 44
    .line 45
    .line 46
    iget-object v0, p1, Lcom/horcrux/svg/RenderableViewManager$c;->e:[D

    .line 47
    .line 48
    aget-wide v4, v0, v1

    .line 49
    .line 50
    double-to-float v0, v4

    .line 51
    invoke-virtual {p0, v0}, Landroid/view/View;->setRotationX(F)V

    .line 52
    .line 53
    .line 54
    iget-object v0, p1, Lcom/horcrux/svg/RenderableViewManager$c;->e:[D

    .line 55
    .line 56
    aget-wide v4, v0, v2

    .line 57
    .line 58
    double-to-float v0, v4

    .line 59
    invoke-virtual {p0, v0}, Landroid/view/View;->setRotationY(F)V

    .line 60
    .line 61
    .line 62
    iget-object v0, p1, Lcom/horcrux/svg/RenderableViewManager$c;->b:[D

    .line 63
    .line 64
    aget-wide v4, v0, v1

    .line 65
    .line 66
    double-to-float v0, v4

    .line 67
    invoke-virtual {p0, v0}, Landroid/view/View;->setScaleX(F)V

    .line 68
    .line 69
    .line 70
    iget-object v0, p1, Lcom/horcrux/svg/RenderableViewManager$c;->b:[D

    .line 71
    .line 72
    aget-wide v1, v0, v2

    .line 73
    .line 74
    double-to-float v0, v1

    .line 75
    invoke-virtual {p0, v0}, Landroid/view/View;->setScaleY(F)V

    .line 76
    .line 77
    .line 78
    iget-object p1, p1, Lcom/horcrux/svg/RenderableViewManager$c;->a:[D

    .line 79
    .line 80
    array-length v0, p1

    .line 81
    if-le v0, v3, :cond_1

    .line 82
    .line 83
    aget-wide v0, p1, v3

    .line 84
    .line 85
    double-to-float p1, v0

    .line 86
    const/4 v0, 0x0

    .line 87
    cmpl-float v0, p1, v0

    .line 88
    .line 89
    if-nez v0, :cond_0

    .line 90
    .line 91
    const p1, 0x3a4ccccd

    .line 92
    .line 93
    .line 94
    :cond_0
    const/high16 v0, -0x40800000    # -1.0f

    .line 95
    .line 96
    div-float/2addr v0, p1

    .line 97
    invoke-static {}, Lcom/facebook/react/uimanager/DisplayMetricsHolder;->getScreenDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    .line 102
    .line 103
    mul-float/2addr p1, p1

    .line 104
    mul-float/2addr p1, v0

    .line 105
    const/high16 v0, 0x40a00000    # 5.0f

    .line 106
    .line 107
    mul-float/2addr p1, v0

    .line 108
    invoke-virtual {p0, p1}, Landroid/view/View;->setCameraDistance(F)V

    .line 109
    .line 110
    .line 111
    :cond_1
    return-void
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
.method protected bridge synthetic addEventEmitters(Lcom/facebook/react/uimanager/ThemedReactContext;Landroid/view/View;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/horcrux/svg/VirtualView;

    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager;->addEventEmitters(Lcom/facebook/react/uimanager/ThemedReactContext;Lcom/horcrux/svg/VirtualView;)V

    return-void
.end method

.method protected addEventEmitters(Lcom/facebook/react/uimanager/ThemedReactContext;Lcom/horcrux/svg/VirtualView;)V
    .locals 0

    .line 2
    invoke-super {p0, p1, p2}, Lcom/facebook/react/uimanager/ViewManager;->addEventEmitters(Lcom/facebook/react/uimanager/ThemedReactContext;Landroid/view/View;)V

    .line 3
    new-instance p1, Lcom/horcrux/svg/RenderableViewManager$a;

    invoke-direct {p1, p0}, Lcom/horcrux/svg/RenderableViewManager$a;-><init>(Lcom/horcrux/svg/RenderableViewManager;)V

    invoke-virtual {p2, p1}, Landroid/view/ViewGroup;->setOnHierarchyChangeListener(Landroid/view/ViewGroup$OnHierarchyChangeListener;)V

    return-void
.end method

.method public createShadowNodeInstance()Lcom/facebook/react/uimanager/LayoutShadowNode;
    .locals 1

    .line 2
    new-instance v0, Lcom/horcrux/svg/RenderableViewManager$d;

    invoke-direct {v0, p0}, Lcom/horcrux/svg/RenderableViewManager$d;-><init>(Lcom/horcrux/svg/RenderableViewManager;)V

    return-object v0
.end method

.method public bridge synthetic createShadowNodeInstance()Lcom/facebook/react/uimanager/ReactShadowNode;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/horcrux/svg/RenderableViewManager;->createShadowNodeInstance()Lcom/facebook/react/uimanager/LayoutShadowNode;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/horcrux/svg/RenderableViewManager;->createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/horcrux/svg/VirtualView;

    move-result-object p1

    return-object p1
.end method

.method protected createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/horcrux/svg/VirtualView;
    .locals 2

    .line 2
    sget-object v0, Lcom/horcrux/svg/RenderableViewManager$b;->b:[I

    iget-object v1, p0, Lcom/horcrux/svg/RenderableViewManager;->svgClass:Lcom/horcrux/svg/RenderableViewManager$e;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 3
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unexpected type "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/horcrux/svg/RenderableViewManager;->svgClass:Lcom/horcrux/svg/RenderableViewManager$e;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 4
    :pswitch_0
    new-instance v0, Lcom/horcrux/svg/i;

    invoke-direct {v0, p1}, Lcom/horcrux/svg/i;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    return-object v0

    .line 5
    :pswitch_1
    new-instance v0, Lcom/horcrux/svg/p;

    invoke-direct {v0, p1}, Lcom/horcrux/svg/p;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    return-object v0

    .line 6
    :pswitch_2
    new-instance v0, Lcom/horcrux/svg/q;

    invoke-direct {v0, p1}, Lcom/horcrux/svg/q;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    return-object v0

    .line 7
    :pswitch_3
    new-instance v0, Lcom/horcrux/svg/v;

    invoke-direct {v0, p1}, Lcom/horcrux/svg/v;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    return-object v0

    .line 8
    :pswitch_4
    new-instance v0, Lcom/horcrux/svg/a0;

    invoke-direct {v0, p1}, Lcom/horcrux/svg/a0;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    return-object v0

    .line 9
    :pswitch_5
    new-instance v0, Lcom/horcrux/svg/o;

    invoke-direct {v0, p1}, Lcom/horcrux/svg/o;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    return-object v0

    .line 10
    :pswitch_6
    new-instance v0, Lcom/horcrux/svg/d0;

    invoke-direct {v0, p1}, Lcom/horcrux/svg/d0;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    return-object v0

    .line 11
    :pswitch_7
    new-instance v0, Lcom/horcrux/svg/u0;

    invoke-direct {v0, p1}, Lcom/horcrux/svg/u0;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    return-object v0

    .line 12
    :pswitch_8
    new-instance v0, Lcom/horcrux/svg/e;

    invoke-direct {v0, p1}, Lcom/horcrux/svg/e;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    return-object v0

    .line 13
    :pswitch_9
    new-instance v0, Lcom/horcrux/svg/c;

    invoke-direct {v0, p1}, Lcom/horcrux/svg/c;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    return-object v0

    .line 14
    :pswitch_a
    new-instance v0, Lcom/horcrux/svg/m;

    invoke-direct {v0, p1}, Lcom/horcrux/svg/m;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    return-object v0

    .line 15
    :pswitch_b
    new-instance v0, Lcom/horcrux/svg/h0;

    invoke-direct {v0, p1}, Lcom/horcrux/svg/h0;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    return-object v0

    .line 16
    :pswitch_c
    new-instance v0, Lcom/horcrux/svg/g0;

    invoke-direct {v0, p1}, Lcom/horcrux/svg/g0;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    return-object v0

    .line 17
    :pswitch_d
    new-instance v0, Lcom/horcrux/svg/t0;

    invoke-direct {v0, p1}, Lcom/horcrux/svg/t0;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    return-object v0

    .line 18
    :pswitch_e
    new-instance v0, Lcom/horcrux/svg/b0;

    invoke-direct {v0, p1}, Lcom/horcrux/svg/b0;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    return-object v0

    .line 19
    :pswitch_f
    new-instance v0, Lcom/horcrux/svg/n;

    invoke-direct {v0, p1}, Lcom/horcrux/svg/n;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    return-object v0

    .line 20
    :pswitch_10
    new-instance v0, Lcom/horcrux/svg/g;

    invoke-direct {v0, p1}, Lcom/horcrux/svg/g;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    return-object v0

    .line 21
    :pswitch_11
    new-instance v0, Lcom/horcrux/svg/b;

    invoke-direct {v0, p1}, Lcom/horcrux/svg/b;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    return-object v0

    .line 22
    :pswitch_12
    new-instance v0, Lcom/horcrux/svg/u;

    invoke-direct {v0, p1}, Lcom/horcrux/svg/u;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    return-object v0

    .line 23
    :pswitch_13
    new-instance v0, Lcom/horcrux/svg/l;

    invoke-direct {v0, p1}, Lcom/horcrux/svg/l;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/horcrux/svg/RenderableViewManager;->mClassName:Ljava/lang/String;

    return-object v0
.end method

.method public getShadowNodeClass()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lcom/horcrux/svg/RenderableViewManager$d;",
            ">;"
        }
    .end annotation

    const-class v0, Lcom/horcrux/svg/RenderableViewManager$d;

    return-object v0
.end method

.method protected bridge synthetic onAfterUpdateTransaction(Landroid/view/View;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/horcrux/svg/VirtualView;

    invoke-virtual {p0, p1}, Lcom/horcrux/svg/RenderableViewManager;->onAfterUpdateTransaction(Lcom/horcrux/svg/VirtualView;)V

    return-void
.end method

.method protected onAfterUpdateTransaction(Lcom/horcrux/svg/VirtualView;)V
    .locals 0

    .line 2
    invoke-super {p0, p1}, Lcom/facebook/react/uimanager/BaseViewManager;->onAfterUpdateTransaction(Landroid/view/View;)V

    .line 3
    invoke-direct {p0, p1}, Lcom/horcrux/svg/RenderableViewManager;->invalidateSvgView(Lcom/horcrux/svg/VirtualView;)V

    return-void
.end method

.method public bridge synthetic onDropViewInstance(Landroid/view/View;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/horcrux/svg/VirtualView;

    invoke-virtual {p0, p1}, Lcom/horcrux/svg/RenderableViewManager;->onDropViewInstance(Lcom/horcrux/svg/VirtualView;)V

    return-void
.end method

.method public onDropViewInstance(Lcom/horcrux/svg/VirtualView;)V
    .locals 1

    .line 2
    invoke-super {p0, p1}, Lcom/facebook/react/uimanager/ViewManager;->onDropViewInstance(Landroid/view/View;)V

    .line 3
    sget-object v0, Lcom/horcrux/svg/RenderableViewManager;->mTagToRenderableView:Landroid/util/SparseArray;

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->remove(I)V

    return-void
.end method

.method public setClipPath(Lcom/horcrux/svg/VirtualView;Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "clipPath"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/horcrux/svg/VirtualView;->setClipPath(Ljava/lang/String;)V

    return-void
.end method

.method public setClipRule(Lcom/horcrux/svg/VirtualView;I)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "clipRule"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/horcrux/svg/VirtualView;->setClipRule(I)V

    return-void
.end method

.method public setDisplay(Lcom/horcrux/svg/VirtualView;Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "display"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/horcrux/svg/VirtualView;->setDisplay(Ljava/lang/String;)V

    return-void
.end method

.method public setFill(Lcom/horcrux/svg/RenderableView;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "fill"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/horcrux/svg/RenderableView;->setFill(Lcom/facebook/react/bridge/Dynamic;)V

    return-void
.end method

.method public setFillOpacity(Lcom/horcrux/svg/RenderableView;F)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        defaultFloat = 1.0f
        name = "fillOpacity"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/horcrux/svg/RenderableView;->setFillOpacity(F)V

    return-void
.end method

.method public setFillRule(Lcom/horcrux/svg/RenderableView;I)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        defaultInt = 0x1
        name = "fillRule"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/horcrux/svg/RenderableView;->setFillRule(I)V

    return-void
.end method

.method public setMarkerEnd(Lcom/horcrux/svg/VirtualView;Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "markerEnd"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/horcrux/svg/VirtualView;->setMarkerEnd(Ljava/lang/String;)V

    return-void
.end method

.method public setMarkerMid(Lcom/horcrux/svg/VirtualView;Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "markerMid"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/horcrux/svg/VirtualView;->setMarkerMid(Ljava/lang/String;)V

    return-void
.end method

.method public setMarkerStart(Lcom/horcrux/svg/VirtualView;Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "markerStart"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/horcrux/svg/VirtualView;->setMarkerStart(Ljava/lang/String;)V

    return-void
.end method

.method public setMask(Lcom/horcrux/svg/VirtualView;Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "mask"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/horcrux/svg/VirtualView;->setMask(Ljava/lang/String;)V

    return-void
.end method

.method public setMatrix(Lcom/horcrux/svg/VirtualView;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "matrix"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/horcrux/svg/VirtualView;->setMatrix(Lcom/facebook/react/bridge/Dynamic;)V

    return-void
.end method

.method public setName(Lcom/horcrux/svg/VirtualView;Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "name"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/horcrux/svg/VirtualView;->setName(Ljava/lang/String;)V

    return-void
.end method

.method public setOnLayout(Lcom/horcrux/svg/VirtualView;Z)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "onLayout"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/horcrux/svg/VirtualView;->setOnLayout(Z)V

    return-void
.end method

.method public bridge synthetic setOpacity(Landroid/view/View;F)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        defaultFloat = 1.0f
        name = "opacity"
    .end annotation

    .line 1
    check-cast p1, Lcom/horcrux/svg/VirtualView;

    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager;->setOpacity(Lcom/horcrux/svg/VirtualView;F)V

    return-void
.end method

.method public setOpacity(Lcom/horcrux/svg/VirtualView;F)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        defaultFloat = 1.0f
        name = "opacity"
    .end annotation

    .line 2
    invoke-virtual {p1, p2}, Lcom/horcrux/svg/VirtualView;->setOpacity(F)V

    return-void
.end method

.method public setPointerEvents(Lcom/horcrux/svg/VirtualView;Ljava/lang/String;)V
    .locals 2
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "pointerEvents"
    .end annotation

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    sget-object p2, Lcom/facebook/react/uimanager/PointerEvents;->AUTO:Lcom/facebook/react/uimanager/PointerEvents;

    .line 4
    .line 5
    invoke-virtual {p1, p2}, Lcom/horcrux/svg/VirtualView;->setPointerEvents(Lcom/facebook/react/uimanager/PointerEvents;)V

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 10
    .line 11
    invoke-virtual {p2, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    const-string v0, "-"

    .line 16
    .line 17
    const-string v1, "_"

    .line 18
    .line 19
    invoke-virtual {p2, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    invoke-static {p2}, Lcom/facebook/react/uimanager/PointerEvents;->valueOf(Ljava/lang/String;)Lcom/facebook/react/uimanager/PointerEvents;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    invoke-virtual {p1, p2}, Lcom/horcrux/svg/VirtualView;->setPointerEvents(Lcom/facebook/react/uimanager/PointerEvents;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    return-void
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
.end method

.method public setPropList(Lcom/horcrux/svg/RenderableView;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "propList"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/horcrux/svg/RenderableView;->setPropList(Lcom/facebook/react/bridge/ReadableArray;)V

    return-void
.end method

.method public setResponsible(Lcom/horcrux/svg/VirtualView;Z)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "responsible"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/horcrux/svg/VirtualView;->setResponsible(Z)V

    return-void
.end method

.method public setStroke(Lcom/horcrux/svg/RenderableView;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "stroke"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/horcrux/svg/RenderableView;->setStroke(Lcom/facebook/react/bridge/Dynamic;)V

    return-void
.end method

.method public setStrokeDasharray(Lcom/horcrux/svg/RenderableView;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "strokeDasharray"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/horcrux/svg/RenderableView;->setStrokeDasharray(Lcom/facebook/react/bridge/ReadableArray;)V

    return-void
.end method

.method public setStrokeDashoffset(Lcom/horcrux/svg/RenderableView;F)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "strokeDashoffset"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/horcrux/svg/RenderableView;->setStrokeDashoffset(F)V

    return-void
.end method

.method public setStrokeLinecap(Lcom/horcrux/svg/RenderableView;I)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        defaultInt = 0x1
        name = "strokeLinecap"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/horcrux/svg/RenderableView;->setStrokeLinecap(I)V

    return-void
.end method

.method public setStrokeLinejoin(Lcom/horcrux/svg/RenderableView;I)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        defaultInt = 0x1
        name = "strokeLinejoin"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/horcrux/svg/RenderableView;->setStrokeLinejoin(I)V

    return-void
.end method

.method public setStrokeMiterlimit(Lcom/horcrux/svg/RenderableView;F)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        defaultFloat = 4.0f
        name = "strokeMiterlimit"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/horcrux/svg/RenderableView;->setStrokeMiterlimit(F)V

    return-void
.end method

.method public setStrokeOpacity(Lcom/horcrux/svg/RenderableView;F)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        defaultFloat = 1.0f
        name = "strokeOpacity"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/horcrux/svg/RenderableView;->setStrokeOpacity(F)V

    return-void
.end method

.method public setStrokeWidth(Lcom/horcrux/svg/RenderableView;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "strokeWidth"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/horcrux/svg/RenderableView;->setStrokeWidth(Lcom/facebook/react/bridge/Dynamic;)V

    return-void
.end method

.method public setTransform(Lcom/horcrux/svg/VirtualView;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 2
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "transform"
    .end annotation

    .line 1
    invoke-interface {p2}, Lcom/facebook/react/bridge/Dynamic;->getType()Lcom/facebook/react/bridge/ReadableType;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lcom/facebook/react/bridge/ReadableType;->Array:Lcom/facebook/react/bridge/ReadableType;

    .line 6
    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    invoke-interface {p2}, Lcom/facebook/react/bridge/Dynamic;->asArray()Lcom/facebook/react/bridge/ReadableArray;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    if-nez p2, :cond_1

    .line 15
    .line 16
    invoke-static {p1}, Lcom/horcrux/svg/RenderableViewManager;->resetTransformProperty(Landroid/view/View;)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    invoke-static {p1, p2}, Lcom/horcrux/svg/RenderableViewManager;->setTransformProperty(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 21
    .line 22
    .line 23
    :goto_0
    invoke-virtual {p1}, Landroid/view/View;->getMatrix()Landroid/graphics/Matrix;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    iput-object p2, p1, Lcom/horcrux/svg/VirtualView;->mTransform:Landroid/graphics/Matrix;

    .line 28
    .line 29
    iget-object v0, p1, Lcom/horcrux/svg/VirtualView;->mInvTransform:Landroid/graphics/Matrix;

    .line 30
    .line 31
    invoke-virtual {p2, v0}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    iput-boolean p2, p1, Lcom/horcrux/svg/VirtualView;->mTransformInvertible:Z

    .line 36
    .line 37
    return-void
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
.end method

.method public setVectorEffect(Lcom/horcrux/svg/RenderableView;I)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "vectorEffect"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/horcrux/svg/RenderableView;->setVectorEffect(I)V

    return-void
.end method
