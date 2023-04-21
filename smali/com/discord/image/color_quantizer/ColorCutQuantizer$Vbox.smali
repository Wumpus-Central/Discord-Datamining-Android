.class final Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/discord/image/color_quantizer/ColorCutQuantizer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "Vbox"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u0003J\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u0003J\n\u0010\u001e\u001a\u00060\u0000R\u00020\u001fR\u0011\u0010\u0006\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\n\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\r\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\u000cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0015\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0016\u0010\u000c\u00a8\u0006 "
    }
    d2 = {
        "Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;",
        "",
        "lowerIndex",
        "",
        "upperIndex",
        "(Lcom/discord/image/color_quantizer/ColorCutQuantizer;II)V",
        "averageColor",
        "Lcom/discord/image/color_quantizer/Swatch;",
        "getAverageColor",
        "()Lcom/discord/image/color_quantizer/Swatch;",
        "colorCount",
        "getColorCount",
        "()I",
        "longestColorDimension",
        "getLongestColorDimension",
        "maxBlue",
        "maxGreen",
        "maxRed",
        "minBlue",
        "minGreen",
        "minRed",
        "volume",
        "getVolume",
        "canSplit",
        "",
        "findSplitPoint",
        "fitBox",
        "",
        "midPoint",
        "dimension",
        "splitBox",
        "Lcom/discord/image/color_quantizer/ColorCutQuantizer;",
        "color_quantizer_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final lowerIndex:I

.field private maxBlue:I

.field private maxGreen:I

.field private maxRed:I

.field private minBlue:I

.field private minGreen:I

.field private minRed:I

.field final synthetic this$0:Lcom/discord/image/color_quantizer/ColorCutQuantizer;

.field private upperIndex:I


# direct methods
.method public constructor <init>(Lcom/discord/image/color_quantizer/ColorCutQuantizer;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;->this$0:Lcom/discord/image/color_quantizer/ColorCutQuantizer;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput p2, p0, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;->lowerIndex:I

    .line 7
    .line 8
    iput p3, p0, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;->upperIndex:I

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;->fitBox()V

    .line 11
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
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
.end method


# virtual methods
.method public final canSplit()Z
    .locals 2

    invoke-virtual {p0}, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;->getColorCount()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public final findSplitPoint()I
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;->getLongestColorDimension()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;->this$0:Lcom/discord/image/color_quantizer/ColorCutQuantizer;

    .line 6
    .line 7
    iget v2, p0, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;->lowerIndex:I

    .line 8
    .line 9
    iget v3, p0, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;->upperIndex:I

    .line 10
    .line 11
    invoke-static {v1, v0, v2, v3}, Lcom/discord/image/color_quantizer/ColorCutQuantizer;->access$modifySignificantOctet(Lcom/discord/image/color_quantizer/ColorCutQuantizer;III)V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;->this$0:Lcom/discord/image/color_quantizer/ColorCutQuantizer;

    .line 15
    .line 16
    invoke-static {v1}, Lcom/discord/image/color_quantizer/ColorCutQuantizer;->access$getMColors$p(Lcom/discord/image/color_quantizer/ColorCutQuantizer;)[I

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    iget v2, p0, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;->lowerIndex:I

    .line 21
    .line 22
    iget v3, p0, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;->upperIndex:I

    .line 23
    .line 24
    add-int/lit8 v3, v3, 0x1

    .line 25
    .line 26
    invoke-static {v1, v2, v3}, Ljava/util/Arrays;->sort([III)V

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;->this$0:Lcom/discord/image/color_quantizer/ColorCutQuantizer;

    .line 30
    .line 31
    iget v2, p0, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;->lowerIndex:I

    .line 32
    .line 33
    iget v3, p0, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;->upperIndex:I

    .line 34
    .line 35
    invoke-static {v1, v0, v2, v3}, Lcom/discord/image/color_quantizer/ColorCutQuantizer;->access$modifySignificantOctet(Lcom/discord/image/color_quantizer/ColorCutQuantizer;III)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, v0}, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;->midPoint(I)I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    iget v2, p0, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;->lowerIndex:I

    .line 43
    .line 44
    iget v3, p0, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;->upperIndex:I

    .line 45
    .line 46
    :goto_0
    if-ge v2, v3, :cond_4

    .line 47
    .line 48
    iget-object v4, p0, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;->this$0:Lcom/discord/image/color_quantizer/ColorCutQuantizer;

    .line 49
    .line 50
    invoke-static {v4}, Lcom/discord/image/color_quantizer/ColorCutQuantizer;->access$getMColors$p(Lcom/discord/image/color_quantizer/ColorCutQuantizer;)[I

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    aget v4, v4, v2

    .line 55
    .line 56
    const/4 v5, -0x3

    .line 57
    if-eq v0, v5, :cond_2

    .line 58
    .line 59
    const/4 v5, -0x2

    .line 60
    if-eq v0, v5, :cond_1

    .line 61
    .line 62
    const/4 v5, -0x1

    .line 63
    if-eq v0, v5, :cond_0

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_0
    invoke-static {v4}, Landroid/graphics/Color;->blue(I)I

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    if-le v4, v1, :cond_3

    .line 71
    .line 72
    return v2

    .line 73
    :cond_1
    invoke-static {v4}, Landroid/graphics/Color;->green(I)I

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    if-lt v4, v1, :cond_3

    .line 78
    .line 79
    return v2

    .line 80
    :cond_2
    invoke-static {v4}, Landroid/graphics/Color;->red(I)I

    .line 81
    .line 82
    .line 83
    move-result v4

    .line 84
    if-lt v4, v1, :cond_3

    .line 85
    .line 86
    return v2

    .line 87
    :cond_3
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_4
    iget v0, p0, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;->lowerIndex:I

    .line 91
    .line 92
    return v0
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
.end method

.method public final fitBox()V
    .locals 6

    .line 1
    const/16 v0, 0xff

    .line 2
    .line 3
    iput v0, p0, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;->minBlue:I

    .line 4
    .line 5
    iput v0, p0, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;->minGreen:I

    .line 6
    .line 7
    iput v0, p0, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;->minRed:I

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput v0, p0, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;->maxBlue:I

    .line 11
    .line 12
    iput v0, p0, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;->maxGreen:I

    .line 13
    .line 14
    iput v0, p0, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;->maxRed:I

    .line 15
    .line 16
    iget v0, p0, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;->lowerIndex:I

    .line 17
    .line 18
    iget v1, p0, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;->upperIndex:I

    .line 19
    .line 20
    if-gt v0, v1, :cond_6

    .line 21
    .line 22
    :goto_0
    iget-object v2, p0, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;->this$0:Lcom/discord/image/color_quantizer/ColorCutQuantizer;

    .line 23
    .line 24
    invoke-static {v2}, Lcom/discord/image/color_quantizer/ColorCutQuantizer;->access$getMColors$p(Lcom/discord/image/color_quantizer/ColorCutQuantizer;)[I

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    aget v2, v2, v0

    .line 29
    .line 30
    invoke-static {v2}, Landroid/graphics/Color;->red(I)I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    invoke-static {v2}, Landroid/graphics/Color;->green(I)I

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    invoke-static {v2}, Landroid/graphics/Color;->blue(I)I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    iget v5, p0, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;->maxRed:I

    .line 43
    .line 44
    if-le v3, v5, :cond_0

    .line 45
    .line 46
    iput v3, p0, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;->maxRed:I

    .line 47
    .line 48
    :cond_0
    iget v5, p0, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;->minRed:I

    .line 49
    .line 50
    if-ge v3, v5, :cond_1

    .line 51
    .line 52
    iput v3, p0, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;->minRed:I

    .line 53
    .line 54
    :cond_1
    iget v3, p0, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;->maxGreen:I

    .line 55
    .line 56
    if-le v4, v3, :cond_2

    .line 57
    .line 58
    iput v4, p0, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;->maxGreen:I

    .line 59
    .line 60
    :cond_2
    iget v3, p0, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;->minGreen:I

    .line 61
    .line 62
    if-ge v4, v3, :cond_3

    .line 63
    .line 64
    iput v4, p0, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;->minGreen:I

    .line 65
    .line 66
    :cond_3
    iget v3, p0, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;->maxBlue:I

    .line 67
    .line 68
    if-le v2, v3, :cond_4

    .line 69
    .line 70
    iput v2, p0, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;->maxBlue:I

    .line 71
    .line 72
    :cond_4
    iget v3, p0, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;->minBlue:I

    .line 73
    .line 74
    if-ge v2, v3, :cond_5

    .line 75
    .line 76
    iput v2, p0, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;->minBlue:I

    .line 77
    .line 78
    :cond_5
    if-eq v0, v1, :cond_6

    .line 79
    .line 80
    add-int/lit8 v0, v0, 0x1

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_6
    return-void
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
.end method

.method public final getAverageColor()Lcom/discord/image/color_quantizer/Swatch;
    .locals 9

    .line 1
    iget v0, p0, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;->lowerIndex:I

    .line 2
    .line 3
    iget v1, p0, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;->upperIndex:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-gt v0, v1, :cond_1

    .line 7
    .line 8
    move v3, v2

    .line 9
    move v4, v3

    .line 10
    move v5, v4

    .line 11
    :goto_0
    iget-object v6, p0, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;->this$0:Lcom/discord/image/color_quantizer/ColorCutQuantizer;

    .line 12
    .line 13
    invoke-static {v6}, Lcom/discord/image/color_quantizer/ColorCutQuantizer;->access$getMColors$p(Lcom/discord/image/color_quantizer/ColorCutQuantizer;)[I

    .line 14
    .line 15
    .line 16
    move-result-object v6

    .line 17
    aget v6, v6, v0

    .line 18
    .line 19
    iget-object v7, p0, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;->this$0:Lcom/discord/image/color_quantizer/ColorCutQuantizer;

    .line 20
    .line 21
    invoke-static {v7}, Lcom/discord/image/color_quantizer/ColorCutQuantizer;->access$getMColorPopulations$p(Lcom/discord/image/color_quantizer/ColorCutQuantizer;)Landroid/util/SparseIntArray;

    .line 22
    .line 23
    .line 24
    move-result-object v7

    .line 25
    invoke-virtual {v7, v6}, Landroid/util/SparseIntArray;->get(I)I

    .line 26
    .line 27
    .line 28
    move-result v7

    .line 29
    add-int/2addr v2, v7

    .line 30
    invoke-static {v6}, Landroid/graphics/Color;->red(I)I

    .line 31
    .line 32
    .line 33
    move-result v8

    .line 34
    mul-int/2addr v8, v7

    .line 35
    add-int/2addr v3, v8

    .line 36
    invoke-static {v6}, Landroid/graphics/Color;->green(I)I

    .line 37
    .line 38
    .line 39
    move-result v8

    .line 40
    mul-int/2addr v8, v7

    .line 41
    add-int/2addr v4, v8

    .line 42
    invoke-static {v6}, Landroid/graphics/Color;->blue(I)I

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    mul-int/2addr v7, v6

    .line 47
    add-int/2addr v5, v7

    .line 48
    if-eq v0, v1, :cond_0

    .line 49
    .line 50
    add-int/lit8 v0, v0, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    move v0, v2

    .line 54
    move v2, v3

    .line 55
    goto :goto_1

    .line 56
    :cond_1
    move v0, v2

    .line 57
    move v4, v0

    .line 58
    move v5, v4

    .line 59
    :goto_1
    int-to-float v1, v2

    .line 60
    int-to-float v2, v0

    .line 61
    div-float/2addr v1, v2

    .line 62
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    int-to-float v3, v4

    .line 67
    div-float/2addr v3, v2

    .line 68
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    int-to-float v4, v5

    .line 73
    div-float/2addr v4, v2

    .line 74
    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    new-instance v4, Lcom/discord/image/color_quantizer/Swatch;

    .line 79
    .line 80
    invoke-direct {v4, v1, v3, v2, v0}, Lcom/discord/image/color_quantizer/Swatch;-><init>(IIII)V

    .line 81
    .line 82
    .line 83
    return-object v4
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
.end method

.method public final getColorCount()I
    .locals 2

    iget v0, p0, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;->upperIndex:I

    iget v1, p0, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;->lowerIndex:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public final getLongestColorDimension()I
    .locals 4

    .line 1
    iget v0, p0, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;->maxRed:I

    .line 2
    .line 3
    iget v1, p0, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;->minRed:I

    .line 4
    .line 5
    sub-int/2addr v0, v1

    .line 6
    iget v1, p0, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;->maxGreen:I

    .line 7
    .line 8
    iget v2, p0, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;->minGreen:I

    .line 9
    .line 10
    sub-int/2addr v1, v2

    .line 11
    iget v2, p0, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;->maxBlue:I

    .line 12
    .line 13
    iget v3, p0, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;->minBlue:I

    .line 14
    .line 15
    sub-int/2addr v2, v3

    .line 16
    if-lt v0, v1, :cond_0

    .line 17
    .line 18
    if-lt v0, v2, :cond_0

    .line 19
    .line 20
    const/4 v0, -0x3

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    if-lt v1, v0, :cond_1

    .line 23
    .line 24
    if-lt v1, v2, :cond_1

    .line 25
    .line 26
    const/4 v0, -0x2

    .line 27
    goto :goto_0

    .line 28
    :cond_1
    const/4 v0, -0x1

    .line 29
    :goto_0
    return v0
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
.end method

.method public final getVolume()I
    .locals 3

    iget v0, p0, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;->maxRed:I

    iget v1, p0, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;->minRed:I

    sub-int/2addr v0, v1

    add-int/lit8 v0, v0, 0x1

    iget v1, p0, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;->maxGreen:I

    iget v2, p0, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;->minGreen:I

    sub-int/2addr v1, v2

    add-int/lit8 v1, v1, 0x1

    mul-int/2addr v0, v1

    iget v1, p0, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;->maxBlue:I

    iget v2, p0, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;->minBlue:I

    sub-int/2addr v1, v2

    add-int/lit8 v1, v1, 0x1

    mul-int/2addr v0, v1

    return v0
.end method

.method public final midPoint(I)I
    .locals 1

    .line 1
    const/4 v0, -0x3

    .line 2
    if-eq p1, v0, :cond_2

    .line 3
    .line 4
    const/4 v0, -0x2

    .line 5
    if-eq p1, v0, :cond_1

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    if-eq p1, v0, :cond_0

    .line 9
    .line 10
    iget p1, p0, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;->minRed:I

    .line 11
    .line 12
    iget v0, p0, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;->maxRed:I

    .line 13
    .line 14
    add-int/2addr p1, v0

    .line 15
    div-int/lit8 p1, p1, 0x2

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget p1, p0, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;->minBlue:I

    .line 19
    .line 20
    iget v0, p0, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;->maxBlue:I

    .line 21
    .line 22
    add-int/2addr p1, v0

    .line 23
    div-int/lit8 p1, p1, 0x2

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    iget p1, p0, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;->minGreen:I

    .line 27
    .line 28
    iget v0, p0, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;->maxGreen:I

    .line 29
    .line 30
    add-int/2addr p1, v0

    .line 31
    div-int/lit8 p1, p1, 0x2

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    iget p1, p0, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;->minRed:I

    .line 35
    .line 36
    iget v0, p0, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;->maxRed:I

    .line 37
    .line 38
    add-int/2addr p1, v0

    .line 39
    div-int/lit8 p1, p1, 0x2

    .line 40
    .line 41
    :goto_0
    return p1
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
.end method

.method public final splitBox()Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;->canSplit()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;->findSplitPoint()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    new-instance v1, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;

    .line 12
    .line 13
    iget-object v2, p0, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;->this$0:Lcom/discord/image/color_quantizer/ColorCutQuantizer;

    .line 14
    .line 15
    add-int/lit8 v3, v0, 0x1

    .line 16
    .line 17
    iget v4, p0, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;->upperIndex:I

    .line 18
    .line 19
    invoke-direct {v1, v2, v3, v4}, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;-><init>(Lcom/discord/image/color_quantizer/ColorCutQuantizer;II)V

    .line 20
    .line 21
    .line 22
    iput v0, p0, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;->upperIndex:I

    .line 23
    .line 24
    invoke-virtual {p0}, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;->fitBox()V

    .line 25
    .line 26
    .line 27
    return-object v1

    .line 28
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 29
    .line 30
    const-string v1, "Can not split a box with only 1 color"

    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw v0
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
.end method
