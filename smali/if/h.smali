.class public Lif/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lif/h$a;,
        Lif/h$b;
    }
.end annotation


# instance fields
.field private a:F

.field private b:F

.field private c:F

.field private d:F

.field private e:I

.field private f:I

.field private g:F

.field private h:Z

.field private i:Lif/h$a;


# direct methods
.method public constructor <init>(Lif/h$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lif/h;->i:Lif/h$a;

    .line 5
    .line 6
    const/4 p1, -0x1

    .line 7
    iput p1, p0, Lif/h;->e:I

    .line 8
    .line 9
    iput p1, p0, Lif/h;->f:I

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
    .line 25
    .line 26
    .line 27
.end method

.method private a(FFFFFFFF)F
    .locals 2

    .line 1
    sub-float/2addr p2, p4

    .line 2
    float-to-double v0, p2

    .line 3
    sub-float/2addr p1, p3

    .line 4
    float-to-double p1, p1

    .line 5
    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->atan2(DD)D

    .line 6
    .line 7
    .line 8
    move-result-wide p1

    .line 9
    double-to-float p1, p1

    .line 10
    float-to-double p1, p1

    .line 11
    invoke-static {p1, p2}, Ljava/lang/Math;->toDegrees(D)D

    .line 12
    .line 13
    .line 14
    move-result-wide p1

    .line 15
    double-to-float p1, p1

    .line 16
    sub-float/2addr p6, p8

    .line 17
    float-to-double p2, p6

    .line 18
    sub-float/2addr p5, p7

    .line 19
    float-to-double p4, p5

    .line 20
    invoke-static {p2, p3, p4, p5}, Ljava/lang/Math;->atan2(DD)D

    .line 21
    .line 22
    .line 23
    move-result-wide p2

    .line 24
    double-to-float p2, p2

    .line 25
    float-to-double p2, p2

    .line 26
    invoke-static {p2, p3}, Ljava/lang/Math;->toDegrees(D)D

    .line 27
    .line 28
    .line 29
    move-result-wide p2

    .line 30
    double-to-float p2, p2

    .line 31
    invoke-direct {p0, p1, p2}, Lif/h;->b(FF)F

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    return p1
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
.end method

.method private b(FF)F
    .locals 1

    .line 1
    const/high16 v0, 0x43b40000    # 360.0f

    .line 2
    .line 3
    rem-float/2addr p2, v0

    .line 4
    rem-float/2addr p1, v0

    .line 5
    sub-float/2addr p2, p1

    .line 6
    iput p2, p0, Lif/h;->g:F

    .line 7
    .line 8
    const/high16 p1, -0x3ccc0000    # -180.0f

    .line 9
    .line 10
    cmpg-float p1, p2, p1

    .line 11
    .line 12
    if-gez p1, :cond_0

    .line 13
    .line 14
    add-float/2addr p2, v0

    .line 15
    iput p2, p0, Lif/h;->g:F

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/high16 p1, 0x43340000    # 180.0f

    .line 19
    .line 20
    cmpl-float p1, p2, p1

    .line 21
    .line 22
    if-lez p1, :cond_1

    .line 23
    .line 24
    sub-float/2addr p2, v0

    .line 25
    iput p2, p0, Lif/h;->g:F

    .line 26
    .line 27
    :cond_1
    :goto_0
    iget p1, p0, Lif/h;->g:F

    .line 28
    .line 29
    return p1
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


# virtual methods
.method public c()F
    .locals 1

    iget v0, p0, Lif/h;->g:F

    return v0
.end method

.method public d(Landroid/view/MotionEvent;)Z
    .locals 15

    .line 1
    move-object v9, p0

    .line 2
    move-object/from16 v0, p1

    .line 3
    .line 4
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v10, 0x1

    .line 11
    if-eqz v1, :cond_6

    .line 12
    .line 13
    const/4 v4, -0x1

    .line 14
    if-eq v1, v10, :cond_5

    .line 15
    .line 16
    const/4 v5, 0x2

    .line 17
    if-eq v1, v5, :cond_2

    .line 18
    .line 19
    const/4 v2, 0x5

    .line 20
    if-eq v1, v2, :cond_1

    .line 21
    .line 22
    const/4 v0, 0x6

    .line 23
    if-eq v1, v0, :cond_0

    .line 24
    .line 25
    goto/16 :goto_1

    .line 26
    .line 27
    :cond_0
    iput v4, v9, Lif/h;->f:I

    .line 28
    .line 29
    goto/16 :goto_1

    .line 30
    .line 31
    :cond_1
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getX()F

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    iput v1, v9, Lif/h;->a:F

    .line 36
    .line 37
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    iput v1, v9, Lif/h;->b:F

    .line 42
    .line 43
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    invoke-virtual {v0, v1}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    invoke-virtual {v0, v1}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    iput v0, v9, Lif/h;->f:I

    .line 56
    .line 57
    iput v3, v9, Lif/h;->g:F

    .line 58
    .line 59
    iput-boolean v10, v9, Lif/h;->h:Z

    .line 60
    .line 61
    goto/16 :goto_1

    .line 62
    .line 63
    :cond_2
    iget v1, v9, Lif/h;->e:I

    .line 64
    .line 65
    if-eq v1, v4, :cond_7

    .line 66
    .line 67
    iget v1, v9, Lif/h;->f:I

    .line 68
    .line 69
    if-eq v1, v4, :cond_7

    .line 70
    .line 71
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    iget v4, v9, Lif/h;->f:I

    .line 76
    .line 77
    if-le v1, v4, :cond_7

    .line 78
    .line 79
    iget v1, v9, Lif/h;->e:I

    .line 80
    .line 81
    invoke-virtual {v0, v1}, Landroid/view/MotionEvent;->getX(I)F

    .line 82
    .line 83
    .line 84
    move-result v11

    .line 85
    iget v1, v9, Lif/h;->e:I

    .line 86
    .line 87
    invoke-virtual {v0, v1}, Landroid/view/MotionEvent;->getY(I)F

    .line 88
    .line 89
    .line 90
    move-result v12

    .line 91
    iget v1, v9, Lif/h;->f:I

    .line 92
    .line 93
    invoke-virtual {v0, v1}, Landroid/view/MotionEvent;->getX(I)F

    .line 94
    .line 95
    .line 96
    move-result v13

    .line 97
    iget v1, v9, Lif/h;->f:I

    .line 98
    .line 99
    invoke-virtual {v0, v1}, Landroid/view/MotionEvent;->getY(I)F

    .line 100
    .line 101
    .line 102
    move-result v14

    .line 103
    iget-boolean v0, v9, Lif/h;->h:Z

    .line 104
    .line 105
    if-eqz v0, :cond_3

    .line 106
    .line 107
    iput v3, v9, Lif/h;->g:F

    .line 108
    .line 109
    iput-boolean v2, v9, Lif/h;->h:Z

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_3
    iget v1, v9, Lif/h;->a:F

    .line 113
    .line 114
    iget v2, v9, Lif/h;->b:F

    .line 115
    .line 116
    iget v3, v9, Lif/h;->c:F

    .line 117
    .line 118
    iget v4, v9, Lif/h;->d:F

    .line 119
    .line 120
    move-object v0, p0

    .line 121
    move v5, v13

    .line 122
    move v6, v14

    .line 123
    move v7, v11

    .line 124
    move v8, v12

    .line 125
    invoke-direct/range {v0 .. v8}, Lif/h;->a(FFFFFFFF)F

    .line 126
    .line 127
    .line 128
    :goto_0
    iget-object v0, v9, Lif/h;->i:Lif/h$a;

    .line 129
    .line 130
    if-eqz v0, :cond_4

    .line 131
    .line 132
    invoke-interface {v0, p0}, Lif/h$a;->a(Lif/h;)Z

    .line 133
    .line 134
    .line 135
    :cond_4
    iput v13, v9, Lif/h;->a:F

    .line 136
    .line 137
    iput v14, v9, Lif/h;->b:F

    .line 138
    .line 139
    iput v11, v9, Lif/h;->c:F

    .line 140
    .line 141
    iput v12, v9, Lif/h;->d:F

    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_5
    iput v4, v9, Lif/h;->e:I

    .line 145
    .line 146
    goto :goto_1

    .line 147
    :cond_6
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getX()F

    .line 148
    .line 149
    .line 150
    move-result v1

    .line 151
    iput v1, v9, Lif/h;->c:F

    .line 152
    .line 153
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    .line 154
    .line 155
    .line 156
    move-result v1

    .line 157
    iput v1, v9, Lif/h;->d:F

    .line 158
    .line 159
    invoke-virtual {v0, v2}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 160
    .line 161
    .line 162
    move-result v1

    .line 163
    invoke-virtual {v0, v1}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    .line 164
    .line 165
    .line 166
    move-result v0

    .line 167
    iput v0, v9, Lif/h;->e:I

    .line 168
    .line 169
    iput v3, v9, Lif/h;->g:F

    .line 170
    .line 171
    iput-boolean v10, v9, Lif/h;->h:Z

    .line 172
    .line 173
    :cond_7
    :goto_1
    return v10
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
