.class public Lcom/facebook/react/views/text/FontMetricsUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final AMPLIFICATION_FACTOR:F = 100.0f

.field private static final CAP_HEIGHT_MEASUREMENT_TEXT:Ljava/lang/String; = "T"

.field private static final X_HEIGHT_MEASUREMENT_TEXT:Ljava/lang/String; = "x"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getFontMetrics(Ljava/lang/CharSequence;Landroid/text/Layout;Landroid/text/TextPaint;Landroid/content/Context;)Lcom/facebook/react/bridge/WritableArray;
    .locals 11

    .line 1
    invoke-virtual {p3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    invoke-virtual {p3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 6
    .line 7
    .line 8
    move-result-object p3

    .line 9
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createArray()Lcom/facebook/react/bridge/WritableArray;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    new-instance v1, Landroid/text/TextPaint;

    .line 14
    .line 15
    invoke-direct {v1, p2}, Landroid/text/TextPaint;-><init>(Landroid/graphics/Paint;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Landroid/graphics/Paint;->getTextSize()F

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    const/high16 v2, 0x42c80000    # 100.0f

    .line 23
    .line 24
    mul-float/2addr p2, v2

    .line 25
    invoke-virtual {v1, p2}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 26
    .line 27
    .line 28
    new-instance p2, Landroid/graphics/Rect;

    .line 29
    .line 30
    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    .line 31
    .line 32
    .line 33
    const-string v3, "T"

    .line 34
    .line 35
    const/4 v4, 0x0

    .line 36
    const/4 v5, 0x1

    .line 37
    invoke-virtual {v1, v3, v4, v5, p2}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p2}, Landroid/graphics/Rect;->height()I

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    int-to-float p2, p2

    .line 45
    div-float/2addr p2, v2

    .line 46
    iget v3, p3, Landroid/util/DisplayMetrics;->density:F

    .line 47
    .line 48
    div-float/2addr p2, v3

    .line 49
    float-to-double v6, p2

    .line 50
    new-instance p2, Landroid/graphics/Rect;

    .line 51
    .line 52
    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    .line 53
    .line 54
    .line 55
    const-string v3, "x"

    .line 56
    .line 57
    invoke-virtual {v1, v3, v4, v5, p2}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p2}, Landroid/graphics/Rect;->height()I

    .line 61
    .line 62
    .line 63
    move-result p2

    .line 64
    int-to-float p2, p2

    .line 65
    div-float/2addr p2, v2

    .line 66
    iget v1, p3, Landroid/util/DisplayMetrics;->density:F

    .line 67
    .line 68
    div-float/2addr p2, v1

    .line 69
    float-to-double v1, p2

    .line 70
    :goto_0
    invoke-virtual {p1}, Landroid/text/Layout;->getLineCount()I

    .line 71
    .line 72
    .line 73
    move-result p2

    .line 74
    if-ge v4, p2, :cond_0

    .line 75
    .line 76
    new-instance p2, Landroid/graphics/Rect;

    .line 77
    .line 78
    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1, v4, p2}, Landroid/text/Layout;->getLineBounds(ILandroid/graphics/Rect;)I

    .line 82
    .line 83
    .line 84
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    invoke-virtual {p1, v4}, Landroid/text/Layout;->getLineLeft(I)F

    .line 89
    .line 90
    .line 91
    move-result v8

    .line 92
    iget v9, p3, Landroid/util/DisplayMetrics;->density:F

    .line 93
    .line 94
    div-float/2addr v8, v9

    .line 95
    float-to-double v8, v8

    .line 96
    invoke-interface {v5, v3, v8, v9}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 97
    .line 98
    .line 99
    iget v8, p2, Landroid/graphics/Rect;->top:I

    .line 100
    .line 101
    int-to-float v8, v8

    .line 102
    iget v9, p3, Landroid/util/DisplayMetrics;->density:F

    .line 103
    .line 104
    div-float/2addr v8, v9

    .line 105
    float-to-double v8, v8

    .line 106
    const-string v10, "y"

    .line 107
    .line 108
    invoke-interface {v5, v10, v8, v9}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p1, v4}, Landroid/text/Layout;->getLineWidth(I)F

    .line 112
    .line 113
    .line 114
    move-result v8

    .line 115
    iget v9, p3, Landroid/util/DisplayMetrics;->density:F

    .line 116
    .line 117
    div-float/2addr v8, v9

    .line 118
    float-to-double v8, v8

    .line 119
    const-string v10, "width"

    .line 120
    .line 121
    invoke-interface {v5, v10, v8, v9}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p2}, Landroid/graphics/Rect;->height()I

    .line 125
    .line 126
    .line 127
    move-result p2

    .line 128
    int-to-float p2, p2

    .line 129
    iget v8, p3, Landroid/util/DisplayMetrics;->density:F

    .line 130
    .line 131
    div-float/2addr p2, v8

    .line 132
    float-to-double v8, p2

    .line 133
    const-string p2, "height"

    .line 134
    .line 135
    invoke-interface {v5, p2, v8, v9}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {p1, v4}, Landroid/text/Layout;->getLineDescent(I)I

    .line 139
    .line 140
    .line 141
    move-result p2

    .line 142
    int-to-float p2, p2

    .line 143
    iget v8, p3, Landroid/util/DisplayMetrics;->density:F

    .line 144
    .line 145
    div-float/2addr p2, v8

    .line 146
    float-to-double v8, p2

    .line 147
    const-string p2, "descender"

    .line 148
    .line 149
    invoke-interface {v5, p2, v8, v9}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {p1, v4}, Landroid/text/Layout;->getLineAscent(I)I

    .line 153
    .line 154
    .line 155
    move-result p2

    .line 156
    neg-int p2, p2

    .line 157
    int-to-float p2, p2

    .line 158
    iget v8, p3, Landroid/util/DisplayMetrics;->density:F

    .line 159
    .line 160
    div-float/2addr p2, v8

    .line 161
    float-to-double v8, p2

    .line 162
    const-string p2, "ascender"

    .line 163
    .line 164
    invoke-interface {v5, p2, v8, v9}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {p1, v4}, Landroid/text/Layout;->getLineBaseline(I)I

    .line 168
    .line 169
    .line 170
    move-result p2

    .line 171
    int-to-float p2, p2

    .line 172
    iget v8, p3, Landroid/util/DisplayMetrics;->density:F

    .line 173
    .line 174
    div-float/2addr p2, v8

    .line 175
    float-to-double v8, p2

    .line 176
    const-string p2, "baseline"

    .line 177
    .line 178
    invoke-interface {v5, p2, v8, v9}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 179
    .line 180
    .line 181
    const-string p2, "capHeight"

    .line 182
    .line 183
    invoke-interface {v5, p2, v6, v7}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 184
    .line 185
    .line 186
    const-string p2, "xHeight"

    .line 187
    .line 188
    invoke-interface {v5, p2, v1, v2}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {p1, v4}, Landroid/text/Layout;->getLineStart(I)I

    .line 192
    .line 193
    .line 194
    move-result p2

    .line 195
    invoke-virtual {p1, v4}, Landroid/text/Layout;->getLineEnd(I)I

    .line 196
    .line 197
    .line 198
    move-result v8

    .line 199
    invoke-interface {p0, p2, v8}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 200
    .line 201
    .line 202
    move-result-object p2

    .line 203
    invoke-interface {p2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object p2

    .line 207
    const-string v8, "text"

    .line 208
    .line 209
    invoke-interface {v5, v8, p2}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    invoke-interface {v0, v5}, Lcom/facebook/react/bridge/WritableArray;->pushMap(Lcom/facebook/react/bridge/ReadableMap;)V

    .line 213
    .line 214
    .line 215
    add-int/lit8 v4, v4, 0x1

    .line 216
    .line 217
    goto/16 :goto_0

    .line 218
    .line 219
    :cond_0
    return-object v0
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
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
.end method
