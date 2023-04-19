.class public Lcom/yalantis/ucrop/task/BitmapCropTask;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/lang/Throwable;",
        ">;"
    }
.end annotation


# instance fields
.field private a:Landroid/graphics/Bitmap;

.field private final b:Landroid/graphics/RectF;

.field private final c:Landroid/graphics/RectF;

.field private d:F

.field private e:F

.field private final f:I

.field private final g:I

.field private final h:Landroid/graphics/Bitmap$CompressFormat;

.field private final i:I

.field private final j:Ljava/lang/String;

.field private final k:Ljava/lang/String;

.field private final l:Lgf/c;

.field private final m:Lff/a;

.field private n:I

.field private o:I

.field private p:I

.field private q:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "ucrop"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 4
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

.method public constructor <init>(Landroid/graphics/Bitmap;Lgf/d;Lgf/b;Lff/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/yalantis/ucrop/task/BitmapCropTask;->a:Landroid/graphics/Bitmap;

    .line 5
    .line 6
    invoke-virtual {p2}, Lgf/d;->a()Landroid/graphics/RectF;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Lcom/yalantis/ucrop/task/BitmapCropTask;->b:Landroid/graphics/RectF;

    .line 11
    .line 12
    invoke-virtual {p2}, Lgf/d;->c()Landroid/graphics/RectF;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, p0, Lcom/yalantis/ucrop/task/BitmapCropTask;->c:Landroid/graphics/RectF;

    .line 17
    .line 18
    invoke-virtual {p2}, Lgf/d;->d()F

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    iput p1, p0, Lcom/yalantis/ucrop/task/BitmapCropTask;->d:F

    .line 23
    .line 24
    invoke-virtual {p2}, Lgf/d;->b()F

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    iput p1, p0, Lcom/yalantis/ucrop/task/BitmapCropTask;->e:F

    .line 29
    .line 30
    invoke-virtual {p3}, Lgf/b;->f()I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    iput p1, p0, Lcom/yalantis/ucrop/task/BitmapCropTask;->f:I

    .line 35
    .line 36
    invoke-virtual {p3}, Lgf/b;->g()I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    iput p1, p0, Lcom/yalantis/ucrop/task/BitmapCropTask;->g:I

    .line 41
    .line 42
    invoke-virtual {p3}, Lgf/b;->a()Landroid/graphics/Bitmap$CompressFormat;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    iput-object p1, p0, Lcom/yalantis/ucrop/task/BitmapCropTask;->h:Landroid/graphics/Bitmap$CompressFormat;

    .line 47
    .line 48
    invoke-virtual {p3}, Lgf/b;->b()I

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    iput p1, p0, Lcom/yalantis/ucrop/task/BitmapCropTask;->i:I

    .line 53
    .line 54
    invoke-virtual {p3}, Lgf/b;->d()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    iput-object p1, p0, Lcom/yalantis/ucrop/task/BitmapCropTask;->j:Ljava/lang/String;

    .line 59
    .line 60
    invoke-virtual {p3}, Lgf/b;->e()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    iput-object p1, p0, Lcom/yalantis/ucrop/task/BitmapCropTask;->k:Ljava/lang/String;

    .line 65
    .line 66
    invoke-virtual {p3}, Lgf/b;->c()Lgf/c;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    iput-object p1, p0, Lcom/yalantis/ucrop/task/BitmapCropTask;->l:Lgf/c;

    .line 71
    .line 72
    iput-object p4, p0, Lcom/yalantis/ucrop/task/BitmapCropTask;->m:Lff/a;

    .line 73
    .line 74
    return-void
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
.end method

.method private a(F)Z
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Landroidx/exifinterface/media/a;

    .line 4
    .line 5
    iget-object v2, v0, Lcom/yalantis/ucrop/task/BitmapCropTask;->j:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {v1, v2}, Landroidx/exifinterface/media/a;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object v2, v0, Lcom/yalantis/ucrop/task/BitmapCropTask;->b:Landroid/graphics/RectF;

    .line 11
    .line 12
    iget v2, v2, Landroid/graphics/RectF;->left:F

    .line 13
    .line 14
    iget-object v3, v0, Lcom/yalantis/ucrop/task/BitmapCropTask;->c:Landroid/graphics/RectF;

    .line 15
    .line 16
    iget v3, v3, Landroid/graphics/RectF;->left:F

    .line 17
    .line 18
    sub-float/2addr v2, v3

    .line 19
    iget v3, v0, Lcom/yalantis/ucrop/task/BitmapCropTask;->d:F

    .line 20
    .line 21
    div-float/2addr v2, v3

    .line 22
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    iput v2, v0, Lcom/yalantis/ucrop/task/BitmapCropTask;->p:I

    .line 27
    .line 28
    iget-object v2, v0, Lcom/yalantis/ucrop/task/BitmapCropTask;->b:Landroid/graphics/RectF;

    .line 29
    .line 30
    iget v2, v2, Landroid/graphics/RectF;->top:F

    .line 31
    .line 32
    iget-object v3, v0, Lcom/yalantis/ucrop/task/BitmapCropTask;->c:Landroid/graphics/RectF;

    .line 33
    .line 34
    iget v3, v3, Landroid/graphics/RectF;->top:F

    .line 35
    .line 36
    sub-float/2addr v2, v3

    .line 37
    iget v3, v0, Lcom/yalantis/ucrop/task/BitmapCropTask;->d:F

    .line 38
    .line 39
    div-float/2addr v2, v3

    .line 40
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    iput v2, v0, Lcom/yalantis/ucrop/task/BitmapCropTask;->q:I

    .line 45
    .line 46
    iget-object v2, v0, Lcom/yalantis/ucrop/task/BitmapCropTask;->b:Landroid/graphics/RectF;

    .line 47
    .line 48
    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    iget v3, v0, Lcom/yalantis/ucrop/task/BitmapCropTask;->d:F

    .line 53
    .line 54
    div-float/2addr v2, v3

    .line 55
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    iput v2, v0, Lcom/yalantis/ucrop/task/BitmapCropTask;->n:I

    .line 60
    .line 61
    iget-object v2, v0, Lcom/yalantis/ucrop/task/BitmapCropTask;->b:Landroid/graphics/RectF;

    .line 62
    .line 63
    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    iget v3, v0, Lcom/yalantis/ucrop/task/BitmapCropTask;->d:F

    .line 68
    .line 69
    div-float/2addr v2, v3

    .line 70
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    iput v2, v0, Lcom/yalantis/ucrop/task/BitmapCropTask;->o:I

    .line 75
    .line 76
    iget v3, v0, Lcom/yalantis/ucrop/task/BitmapCropTask;->n:I

    .line 77
    .line 78
    invoke-direct {v0, v3, v2}, Lcom/yalantis/ucrop/task/BitmapCropTask;->e(II)Z

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    new-instance v3, Ljava/lang/StringBuilder;

    .line 83
    .line 84
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 85
    .line 86
    .line 87
    const-string v4, "Should crop: "

    .line 88
    .line 89
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    const-string v4, "BitmapCropTask"

    .line 100
    .line 101
    invoke-static {v4, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 102
    .line 103
    .line 104
    if-eqz v2, :cond_1

    .line 105
    .line 106
    iget-object v5, v0, Lcom/yalantis/ucrop/task/BitmapCropTask;->j:Ljava/lang/String;

    .line 107
    .line 108
    iget-object v6, v0, Lcom/yalantis/ucrop/task/BitmapCropTask;->k:Ljava/lang/String;

    .line 109
    .line 110
    iget v7, v0, Lcom/yalantis/ucrop/task/BitmapCropTask;->p:I

    .line 111
    .line 112
    iget v8, v0, Lcom/yalantis/ucrop/task/BitmapCropTask;->q:I

    .line 113
    .line 114
    iget v9, v0, Lcom/yalantis/ucrop/task/BitmapCropTask;->n:I

    .line 115
    .line 116
    iget v10, v0, Lcom/yalantis/ucrop/task/BitmapCropTask;->o:I

    .line 117
    .line 118
    iget v11, v0, Lcom/yalantis/ucrop/task/BitmapCropTask;->e:F

    .line 119
    .line 120
    iget-object v2, v0, Lcom/yalantis/ucrop/task/BitmapCropTask;->h:Landroid/graphics/Bitmap$CompressFormat;

    .line 121
    .line 122
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 123
    .line 124
    .line 125
    move-result v13

    .line 126
    iget v14, v0, Lcom/yalantis/ucrop/task/BitmapCropTask;->i:I

    .line 127
    .line 128
    iget-object v2, v0, Lcom/yalantis/ucrop/task/BitmapCropTask;->l:Lgf/c;

    .line 129
    .line 130
    invoke-virtual {v2}, Lgf/c;->a()I

    .line 131
    .line 132
    .line 133
    move-result v15

    .line 134
    iget-object v2, v0, Lcom/yalantis/ucrop/task/BitmapCropTask;->l:Lgf/c;

    .line 135
    .line 136
    invoke-virtual {v2}, Lgf/c;->b()I

    .line 137
    .line 138
    .line 139
    move-result v16

    .line 140
    move/from16 v12, p1

    .line 141
    .line 142
    invoke-static/range {v5 .. v16}, Lcom/yalantis/ucrop/task/BitmapCropTask;->cropCImg(Ljava/lang/String;Ljava/lang/String;IIIIFFIIII)Z

    .line 143
    .line 144
    .line 145
    move-result v2

    .line 146
    if-eqz v2, :cond_0

    .line 147
    .line 148
    iget-object v3, v0, Lcom/yalantis/ucrop/task/BitmapCropTask;->h:Landroid/graphics/Bitmap$CompressFormat;

    .line 149
    .line 150
    sget-object v4, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    .line 151
    .line 152
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v3

    .line 156
    if-eqz v3, :cond_0

    .line 157
    .line 158
    iget v3, v0, Lcom/yalantis/ucrop/task/BitmapCropTask;->n:I

    .line 159
    .line 160
    iget v4, v0, Lcom/yalantis/ucrop/task/BitmapCropTask;->o:I

    .line 161
    .line 162
    iget-object v5, v0, Lcom/yalantis/ucrop/task/BitmapCropTask;->k:Ljava/lang/String;

    .line 163
    .line 164
    invoke-static {v1, v3, v4, v5}, Lif/f;->b(Landroidx/exifinterface/media/a;IILjava/lang/String;)V

    .line 165
    .line 166
    .line 167
    :cond_0
    return v2

    .line 168
    :cond_1
    iget-object v1, v0, Lcom/yalantis/ucrop/task/BitmapCropTask;->j:Ljava/lang/String;

    .line 169
    .line 170
    iget-object v2, v0, Lcom/yalantis/ucrop/task/BitmapCropTask;->k:Ljava/lang/String;

    .line 171
    .line 172
    invoke-static {v1, v2}, Lif/e;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    const/4 v1, 0x0

    .line 176
    return v1
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

.method public static native cropCImg(Ljava/lang/String;Ljava/lang/String;IIIIFFIIII)Z
.end method

.method private d()F
    .locals 4

    .line 1
    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    iput-boolean v1, v0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 8
    .line 9
    iget-object v2, p0, Lcom/yalantis/ucrop/task/BitmapCropTask;->j:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v2, v0}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 12
    .line 13
    .line 14
    iget-object v2, p0, Lcom/yalantis/ucrop/task/BitmapCropTask;->l:Lgf/c;

    .line 15
    .line 16
    invoke-virtual {v2}, Lgf/c;->a()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    const/16 v3, 0x5a

    .line 21
    .line 22
    if-eq v2, v3, :cond_1

    .line 23
    .line 24
    iget-object v2, p0, Lcom/yalantis/ucrop/task/BitmapCropTask;->l:Lgf/c;

    .line 25
    .line 26
    invoke-virtual {v2}, Lgf/c;->a()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    const/16 v3, 0x10e

    .line 31
    .line 32
    if-ne v2, v3, :cond_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    const/4 v1, 0x0

    .line 36
    :cond_1
    :goto_0
    if-eqz v1, :cond_2

    .line 37
    .line 38
    iget v2, v0, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_2
    iget v2, v0, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 42
    .line 43
    :goto_1
    int-to-float v2, v2

    .line 44
    iget-object v3, p0, Lcom/yalantis/ucrop/task/BitmapCropTask;->a:Landroid/graphics/Bitmap;

    .line 45
    .line 46
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    int-to-float v3, v3

    .line 51
    div-float/2addr v2, v3

    .line 52
    if-eqz v1, :cond_3

    .line 53
    .line 54
    iget v0, v0, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_3
    iget v0, v0, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 58
    .line 59
    :goto_2
    int-to-float v0, v0

    .line 60
    iget-object v1, p0, Lcom/yalantis/ucrop/task/BitmapCropTask;->a:Landroid/graphics/Bitmap;

    .line 61
    .line 62
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    int-to-float v1, v1

    .line 67
    div-float/2addr v0, v1

    .line 68
    invoke-static {v2, v0}, Ljava/lang/Math;->min(FF)F

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    iget v1, p0, Lcom/yalantis/ucrop/task/BitmapCropTask;->d:F

    .line 73
    .line 74
    div-float/2addr v1, v0

    .line 75
    iput v1, p0, Lcom/yalantis/ucrop/task/BitmapCropTask;->d:F

    .line 76
    .line 77
    iget v0, p0, Lcom/yalantis/ucrop/task/BitmapCropTask;->f:I

    .line 78
    .line 79
    if-lez v0, :cond_5

    .line 80
    .line 81
    iget v0, p0, Lcom/yalantis/ucrop/task/BitmapCropTask;->g:I

    .line 82
    .line 83
    if-lez v0, :cond_5

    .line 84
    .line 85
    iget-object v0, p0, Lcom/yalantis/ucrop/task/BitmapCropTask;->b:Landroid/graphics/RectF;

    .line 86
    .line 87
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    iget v1, p0, Lcom/yalantis/ucrop/task/BitmapCropTask;->d:F

    .line 92
    .line 93
    div-float/2addr v0, v1

    .line 94
    iget-object v1, p0, Lcom/yalantis/ucrop/task/BitmapCropTask;->b:Landroid/graphics/RectF;

    .line 95
    .line 96
    invoke-virtual {v1}, Landroid/graphics/RectF;->height()F

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    iget v2, p0, Lcom/yalantis/ucrop/task/BitmapCropTask;->d:F

    .line 101
    .line 102
    div-float/2addr v1, v2

    .line 103
    iget v2, p0, Lcom/yalantis/ucrop/task/BitmapCropTask;->f:I

    .line 104
    .line 105
    int-to-float v3, v2

    .line 106
    cmpl-float v3, v0, v3

    .line 107
    .line 108
    if-gtz v3, :cond_4

    .line 109
    .line 110
    iget v3, p0, Lcom/yalantis/ucrop/task/BitmapCropTask;->g:I

    .line 111
    .line 112
    int-to-float v3, v3

    .line 113
    cmpl-float v3, v1, v3

    .line 114
    .line 115
    if-lez v3, :cond_5

    .line 116
    .line 117
    :cond_4
    int-to-float v2, v2

    .line 118
    div-float/2addr v2, v0

    .line 119
    iget v0, p0, Lcom/yalantis/ucrop/task/BitmapCropTask;->g:I

    .line 120
    .line 121
    int-to-float v0, v0

    .line 122
    div-float/2addr v0, v1

    .line 123
    invoke-static {v2, v0}, Ljava/lang/Math;->min(FF)F

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    iget v1, p0, Lcom/yalantis/ucrop/task/BitmapCropTask;->d:F

    .line 128
    .line 129
    div-float/2addr v1, v0

    .line 130
    iput v1, p0, Lcom/yalantis/ucrop/task/BitmapCropTask;->d:F

    .line 131
    .line 132
    goto :goto_3

    .line 133
    :cond_5
    const/high16 v0, 0x3f800000    # 1.0f

    .line 134
    .line 135
    :goto_3
    return v0
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
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
.end method

.method private e(II)Z
    .locals 2

    .line 1
    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    int-to-float p1, p1

    .line 6
    const/high16 p2, 0x447a0000    # 1000.0f

    .line 7
    .line 8
    div-float/2addr p1, p2

    .line 9
    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    const/4 p2, 0x1

    .line 14
    add-int/2addr p1, p2

    .line 15
    iget v0, p0, Lcom/yalantis/ucrop/task/BitmapCropTask;->f:I

    .line 16
    .line 17
    if-lez v0, :cond_0

    .line 18
    .line 19
    iget v0, p0, Lcom/yalantis/ucrop/task/BitmapCropTask;->g:I

    .line 20
    .line 21
    if-gtz v0, :cond_2

    .line 22
    .line 23
    :cond_0
    iget-object v0, p0, Lcom/yalantis/ucrop/task/BitmapCropTask;->b:Landroid/graphics/RectF;

    .line 24
    .line 25
    iget v0, v0, Landroid/graphics/RectF;->left:F

    .line 26
    .line 27
    iget-object v1, p0, Lcom/yalantis/ucrop/task/BitmapCropTask;->c:Landroid/graphics/RectF;

    .line 28
    .line 29
    iget v1, v1, Landroid/graphics/RectF;->left:F

    .line 30
    .line 31
    sub-float/2addr v0, v1

    .line 32
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    int-to-float p1, p1

    .line 37
    cmpl-float v0, v0, p1

    .line 38
    .line 39
    if-gtz v0, :cond_2

    .line 40
    .line 41
    iget-object v0, p0, Lcom/yalantis/ucrop/task/BitmapCropTask;->b:Landroid/graphics/RectF;

    .line 42
    .line 43
    iget v0, v0, Landroid/graphics/RectF;->top:F

    .line 44
    .line 45
    iget-object v1, p0, Lcom/yalantis/ucrop/task/BitmapCropTask;->c:Landroid/graphics/RectF;

    .line 46
    .line 47
    iget v1, v1, Landroid/graphics/RectF;->top:F

    .line 48
    .line 49
    sub-float/2addr v0, v1

    .line 50
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    cmpl-float v0, v0, p1

    .line 55
    .line 56
    if-gtz v0, :cond_2

    .line 57
    .line 58
    iget-object v0, p0, Lcom/yalantis/ucrop/task/BitmapCropTask;->b:Landroid/graphics/RectF;

    .line 59
    .line 60
    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    .line 61
    .line 62
    iget-object v1, p0, Lcom/yalantis/ucrop/task/BitmapCropTask;->c:Landroid/graphics/RectF;

    .line 63
    .line 64
    iget v1, v1, Landroid/graphics/RectF;->bottom:F

    .line 65
    .line 66
    sub-float/2addr v0, v1

    .line 67
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    cmpl-float v0, v0, p1

    .line 72
    .line 73
    if-gtz v0, :cond_2

    .line 74
    .line 75
    iget-object v0, p0, Lcom/yalantis/ucrop/task/BitmapCropTask;->b:Landroid/graphics/RectF;

    .line 76
    .line 77
    iget v0, v0, Landroid/graphics/RectF;->right:F

    .line 78
    .line 79
    iget-object v1, p0, Lcom/yalantis/ucrop/task/BitmapCropTask;->c:Landroid/graphics/RectF;

    .line 80
    .line 81
    iget v1, v1, Landroid/graphics/RectF;->right:F

    .line 82
    .line 83
    sub-float/2addr v0, v1

    .line 84
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    cmpl-float p1, v0, p1

    .line 89
    .line 90
    if-gtz p1, :cond_2

    .line 91
    .line 92
    iget p1, p0, Lcom/yalantis/ucrop/task/BitmapCropTask;->e:F

    .line 93
    .line 94
    const/4 v0, 0x0

    .line 95
    cmpl-float p1, p1, v0

    .line 96
    .line 97
    if-eqz p1, :cond_1

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_1
    const/4 p2, 0x0

    .line 101
    :cond_2
    :goto_0
    return p2
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
.method protected varargs b([Ljava/lang/Void;)Ljava/lang/Throwable;
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/yalantis/ucrop/task/BitmapCropTask;->a:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    new-instance p1, Ljava/lang/NullPointerException;

    .line 6
    .line 7
    const-string v0, "ViewBitmap is null"

    .line 8
    .line 9
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-object p1

    .line 13
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    new-instance p1, Ljava/lang/NullPointerException;

    .line 20
    .line 21
    const-string v0, "ViewBitmap is recycled"

    .line 22
    .line 23
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-object p1

    .line 27
    :cond_1
    iget-object p1, p0, Lcom/yalantis/ucrop/task/BitmapCropTask;->c:Landroid/graphics/RectF;

    .line 28
    .line 29
    invoke-virtual {p1}, Landroid/graphics/RectF;->isEmpty()Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_2

    .line 34
    .line 35
    new-instance p1, Ljava/lang/NullPointerException;

    .line 36
    .line 37
    const-string v0, "CurrentImageRect is empty"

    .line 38
    .line 39
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return-object p1

    .line 43
    :cond_2
    invoke-direct {p0}, Lcom/yalantis/ucrop/task/BitmapCropTask;->d()F

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    :try_start_0
    invoke-direct {p0, p1}, Lcom/yalantis/ucrop/task/BitmapCropTask;->a(F)Z

    .line 48
    .line 49
    .line 50
    const/4 p1, 0x0

    .line 51
    iput-object p1, p0, Lcom/yalantis/ucrop/task/BitmapCropTask;->a:Landroid/graphics/Bitmap;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    .line 53
    return-object p1

    .line 54
    :catchall_0
    move-exception p1

    .line 55
    return-object p1
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

.method protected c(Ljava/lang/Throwable;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/yalantis/ucrop/task/BitmapCropTask;->m:Lff/a;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    new-instance p1, Ljava/io/File;

    .line 8
    .line 9
    iget-object v0, p0, Lcom/yalantis/ucrop/task/BitmapCropTask;->k:Ljava/lang/String;

    .line 10
    .line 11
    invoke-direct {p1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-static {p1}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    iget-object v1, p0, Lcom/yalantis/ucrop/task/BitmapCropTask;->m:Lff/a;

    .line 19
    .line 20
    iget v3, p0, Lcom/yalantis/ucrop/task/BitmapCropTask;->p:I

    .line 21
    .line 22
    iget v4, p0, Lcom/yalantis/ucrop/task/BitmapCropTask;->q:I

    .line 23
    .line 24
    iget v5, p0, Lcom/yalantis/ucrop/task/BitmapCropTask;->n:I

    .line 25
    .line 26
    iget v6, p0, Lcom/yalantis/ucrop/task/BitmapCropTask;->o:I

    .line 27
    .line 28
    invoke-interface/range {v1 .. v6}, Lff/a;->a(Landroid/net/Uri;IIII)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-interface {v0, p1}, Lff/a;->b(Ljava/lang/Throwable;)V

    .line 33
    .line 34
    .line 35
    :cond_1
    :goto_0
    return-void
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

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/yalantis/ucrop/task/BitmapCropTask;->b([Ljava/lang/Void;)Ljava/lang/Throwable;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lcom/yalantis/ucrop/task/BitmapCropTask;->c(Ljava/lang/Throwable;)V

    return-void
.end method
