.class public Lcf/u;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcf/u$b;
    }
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lcf/u$b;

.field private c:F

.field private d:F

.field private e:Z

.field private f:Z

.field private g:F

.field private h:F

.field private i:F

.field private j:F

.field private k:F

.field private l:F

.field private m:F

.field private n:J

.field private o:J

.field private p:Z

.field private q:I

.field private r:I

.field private final s:Landroid/os/Handler;

.field private t:F

.field private u:F

.field private v:I

.field private w:Landroid/view/GestureDetector;

.field private x:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcf/u$b;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, p2, v0}, Lcf/u;-><init>(Landroid/content/Context;Lcf/u$b;Landroid/os/Handler;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcf/u$b;Landroid/os/Handler;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 3
    iput v0, p0, Lcf/u;->v:I

    .line 4
    iput-object p1, p0, Lcf/u;->a:Landroid/content/Context;

    .line 5
    iput-object p2, p0, Lcf/u;->b:Lcf/u$b;

    .line 6
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p2

    .line 7
    invoke-virtual {p2}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result p2

    mul-int/lit8 p2, p2, 0x2

    iput p2, p0, Lcf/u;->q:I

    .line 8
    iput v0, p0, Lcf/u;->r:I

    .line 9
    iput-object p3, p0, Lcf/u;->s:Landroid/os/Handler;

    .line 10
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object p1

    iget p1, p1, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    const/16 p2, 0x12

    const/4 p3, 0x1

    if-le p1, p2, :cond_0

    .line 11
    invoke-virtual {p0, p3}, Lcf/u;->k(Z)V

    :cond_0
    const/16 p2, 0x16

    if-le p1, p2, :cond_1

    .line 12
    invoke-virtual {p0, p3}, Lcf/u;->l(Z)V

    :cond_1
    return-void
.end method

.method static synthetic a(Lcf/u;F)F
    .locals 0

    iput p1, p0, Lcf/u;->t:F

    return p1
.end method

.method static synthetic b(Lcf/u;F)F
    .locals 0

    iput p1, p0, Lcf/u;->u:F

    return p1
.end method

.method static synthetic c(Lcf/u;I)I
    .locals 0

    iput p1, p0, Lcf/u;->v:I

    return p1
.end method

.method private i()Z
    .locals 1

    iget v0, p0, Lcf/u;->v:I

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public d()F
    .locals 1

    iget v0, p0, Lcf/u;->g:F

    return v0
.end method

.method public e()F
    .locals 1

    iget v0, p0, Lcf/u;->c:F

    return v0
.end method

.method public f()F
    .locals 1

    iget v0, p0, Lcf/u;->d:F

    return v0
.end method

.method public g()F
    .locals 5

    .line 1
    invoke-direct {p0}, Lcf/u;->i()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/high16 v1, 0x3f800000    # 1.0f

    .line 6
    .line 7
    if-eqz v0, :cond_5

    .line 8
    .line 9
    iget-boolean v0, p0, Lcf/u;->x:Z

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget v2, p0, Lcf/u;->g:F

    .line 14
    .line 15
    iget v3, p0, Lcf/u;->h:F

    .line 16
    .line 17
    cmpg-float v2, v2, v3

    .line 18
    .line 19
    if-ltz v2, :cond_1

    .line 20
    .line 21
    :cond_0
    if-nez v0, :cond_2

    .line 22
    .line 23
    iget v0, p0, Lcf/u;->g:F

    .line 24
    .line 25
    iget v2, p0, Lcf/u;->h:F

    .line 26
    .line 27
    cmpl-float v0, v0, v2

    .line 28
    .line 29
    if-lez v0, :cond_2

    .line 30
    .line 31
    :cond_1
    const/4 v0, 0x1

    .line 32
    goto :goto_0

    .line 33
    :cond_2
    const/4 v0, 0x0

    .line 34
    :goto_0
    iget v2, p0, Lcf/u;->g:F

    .line 35
    .line 36
    iget v3, p0, Lcf/u;->h:F

    .line 37
    .line 38
    div-float/2addr v2, v3

    .line 39
    sub-float v2, v1, v2

    .line 40
    .line 41
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    const/high16 v3, 0x3f000000    # 0.5f

    .line 46
    .line 47
    mul-float/2addr v2, v3

    .line 48
    iget v3, p0, Lcf/u;->h:F

    .line 49
    .line 50
    iget v4, p0, Lcf/u;->q:I

    .line 51
    .line 52
    int-to-float v4, v4

    .line 53
    cmpg-float v3, v3, v4

    .line 54
    .line 55
    if-gtz v3, :cond_3

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_3
    if-eqz v0, :cond_4

    .line 59
    .line 60
    add-float/2addr v1, v2

    .line 61
    goto :goto_1

    .line 62
    :cond_4
    sub-float/2addr v1, v2

    .line 63
    :goto_1
    return v1

    .line 64
    :cond_5
    iget v0, p0, Lcf/u;->h:F

    .line 65
    .line 66
    const/4 v2, 0x0

    .line 67
    cmpl-float v2, v0, v2

    .line 68
    .line 69
    if-lez v2, :cond_6

    .line 70
    .line 71
    iget v1, p0, Lcf/u;->g:F

    .line 72
    .line 73
    div-float/2addr v1, v0

    .line 74
    :cond_6
    return v1
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

.method public h()J
    .locals 4

    iget-wide v0, p0, Lcf/u;->n:J

    iget-wide v2, p0, Lcf/u;->o:J

    sub-long/2addr v0, v2

    return-wide v0
.end method

.method public j(Landroid/view/MotionEvent;)Z
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getEventTime()J

    .line 6
    .line 7
    .line 8
    move-result-wide v2

    .line 9
    iput-wide v2, v0, Lcf/u;->n:J

    .line 10
    .line 11
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    iget-boolean v3, v0, Lcf/u;->e:Z

    .line 16
    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    iget-object v3, v0, Lcf/u;->w:Landroid/view/GestureDetector;

    .line 20
    .line 21
    invoke-virtual {v3, v1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 22
    .line 23
    .line 24
    :cond_0
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getButtonState()I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    and-int/lit8 v4, v4, 0x20

    .line 33
    .line 34
    const/4 v5, 0x1

    .line 35
    const/4 v6, 0x0

    .line 36
    if-eqz v4, :cond_1

    .line 37
    .line 38
    move v4, v5

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    move v4, v6

    .line 41
    :goto_0
    iget v7, v0, Lcf/u;->v:I

    .line 42
    .line 43
    const/4 v8, 0x2

    .line 44
    if-ne v7, v8, :cond_2

    .line 45
    .line 46
    if-nez v4, :cond_2

    .line 47
    .line 48
    move v7, v5

    .line 49
    goto :goto_1

    .line 50
    :cond_2
    move v7, v6

    .line 51
    :goto_1
    if-eq v2, v5, :cond_4

    .line 52
    .line 53
    const/4 v9, 0x3

    .line 54
    if-eq v2, v9, :cond_4

    .line 55
    .line 56
    if-eqz v7, :cond_3

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_3
    move v9, v6

    .line 60
    goto :goto_3

    .line 61
    :cond_4
    :goto_2
    move v9, v5

    .line 62
    :goto_3
    const/4 v10, 0x0

    .line 63
    if-eqz v2, :cond_5

    .line 64
    .line 65
    if-eqz v9, :cond_8

    .line 66
    .line 67
    :cond_5
    iget-boolean v11, v0, Lcf/u;->p:Z

    .line 68
    .line 69
    if-eqz v11, :cond_6

    .line 70
    .line 71
    iget-object v11, v0, Lcf/u;->b:Lcf/u$b;

    .line 72
    .line 73
    invoke-interface {v11, v0}, Lcf/u$b;->b(Lcf/u;)V

    .line 74
    .line 75
    .line 76
    iput-boolean v6, v0, Lcf/u;->p:Z

    .line 77
    .line 78
    iput v10, v0, Lcf/u;->i:F

    .line 79
    .line 80
    iput v6, v0, Lcf/u;->v:I

    .line 81
    .line 82
    goto :goto_4

    .line 83
    :cond_6
    invoke-direct/range {p0 .. p0}, Lcf/u;->i()Z

    .line 84
    .line 85
    .line 86
    move-result v11

    .line 87
    if-eqz v11, :cond_7

    .line 88
    .line 89
    if-eqz v9, :cond_7

    .line 90
    .line 91
    iput-boolean v6, v0, Lcf/u;->p:Z

    .line 92
    .line 93
    iput v10, v0, Lcf/u;->i:F

    .line 94
    .line 95
    iput v6, v0, Lcf/u;->v:I

    .line 96
    .line 97
    :cond_7
    :goto_4
    if-eqz v9, :cond_8

    .line 98
    .line 99
    return v5

    .line 100
    :cond_8
    iget-boolean v11, v0, Lcf/u;->p:Z

    .line 101
    .line 102
    if-nez v11, :cond_9

    .line 103
    .line 104
    iget-boolean v11, v0, Lcf/u;->f:Z

    .line 105
    .line 106
    if-eqz v11, :cond_9

    .line 107
    .line 108
    invoke-direct/range {p0 .. p0}, Lcf/u;->i()Z

    .line 109
    .line 110
    .line 111
    move-result v11

    .line 112
    if-nez v11, :cond_9

    .line 113
    .line 114
    if-nez v9, :cond_9

    .line 115
    .line 116
    if-eqz v4, :cond_9

    .line 117
    .line 118
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getX()F

    .line 119
    .line 120
    .line 121
    move-result v4

    .line 122
    iput v4, v0, Lcf/u;->t:F

    .line 123
    .line 124
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    .line 125
    .line 126
    .line 127
    move-result v4

    .line 128
    iput v4, v0, Lcf/u;->u:F

    .line 129
    .line 130
    iput v8, v0, Lcf/u;->v:I

    .line 131
    .line 132
    iput v10, v0, Lcf/u;->i:F

    .line 133
    .line 134
    :cond_9
    const/4 v4, 0x6

    .line 135
    if-eqz v2, :cond_b

    .line 136
    .line 137
    if-eq v2, v4, :cond_b

    .line 138
    .line 139
    const/4 v9, 0x5

    .line 140
    if-eq v2, v9, :cond_b

    .line 141
    .line 142
    if-eqz v7, :cond_a

    .line 143
    .line 144
    goto :goto_5

    .line 145
    :cond_a
    move v7, v6

    .line 146
    goto :goto_6

    .line 147
    :cond_b
    :goto_5
    move v7, v5

    .line 148
    :goto_6
    if-ne v2, v4, :cond_c

    .line 149
    .line 150
    move v4, v5

    .line 151
    goto :goto_7

    .line 152
    :cond_c
    move v4, v6

    .line 153
    :goto_7
    if-eqz v4, :cond_d

    .line 154
    .line 155
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 156
    .line 157
    .line 158
    move-result v9

    .line 159
    goto :goto_8

    .line 160
    :cond_d
    const/4 v9, -0x1

    .line 161
    :goto_8
    if-eqz v4, :cond_e

    .line 162
    .line 163
    add-int/lit8 v4, v3, -0x1

    .line 164
    .line 165
    goto :goto_9

    .line 166
    :cond_e
    move v4, v3

    .line 167
    :goto_9
    invoke-direct/range {p0 .. p0}, Lcf/u;->i()Z

    .line 168
    .line 169
    .line 170
    move-result v11

    .line 171
    if-eqz v11, :cond_10

    .line 172
    .line 173
    iget v11, v0, Lcf/u;->t:F

    .line 174
    .line 175
    iget v12, v0, Lcf/u;->u:F

    .line 176
    .line 177
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    .line 178
    .line 179
    .line 180
    move-result v13

    .line 181
    cmpg-float v13, v13, v12

    .line 182
    .line 183
    if-gez v13, :cond_f

    .line 184
    .line 185
    iput-boolean v5, v0, Lcf/u;->x:Z

    .line 186
    .line 187
    goto :goto_c

    .line 188
    :cond_f
    iput-boolean v6, v0, Lcf/u;->x:Z

    .line 189
    .line 190
    goto :goto_c

    .line 191
    :cond_10
    move v11, v6

    .line 192
    move v12, v10

    .line 193
    move v13, v12

    .line 194
    :goto_a
    if-ge v11, v3, :cond_12

    .line 195
    .line 196
    if-ne v9, v11, :cond_11

    .line 197
    .line 198
    goto :goto_b

    .line 199
    :cond_11
    invoke-virtual {v1, v11}, Landroid/view/MotionEvent;->getX(I)F

    .line 200
    .line 201
    .line 202
    move-result v14

    .line 203
    add-float/2addr v12, v14

    .line 204
    invoke-virtual {v1, v11}, Landroid/view/MotionEvent;->getY(I)F

    .line 205
    .line 206
    .line 207
    move-result v14

    .line 208
    add-float/2addr v13, v14

    .line 209
    :goto_b
    add-int/lit8 v11, v11, 0x1

    .line 210
    .line 211
    goto :goto_a

    .line 212
    :cond_12
    int-to-float v11, v4

    .line 213
    div-float/2addr v12, v11

    .line 214
    div-float v11, v13, v11

    .line 215
    .line 216
    move/from16 v16, v12

    .line 217
    .line 218
    move v12, v11

    .line 219
    move/from16 v11, v16

    .line 220
    .line 221
    :goto_c
    move v14, v6

    .line 222
    move v13, v10

    .line 223
    :goto_d
    if-ge v14, v3, :cond_14

    .line 224
    .line 225
    if-ne v9, v14, :cond_13

    .line 226
    .line 227
    goto :goto_e

    .line 228
    :cond_13
    invoke-virtual {v1, v14}, Landroid/view/MotionEvent;->getX(I)F

    .line 229
    .line 230
    .line 231
    move-result v15

    .line 232
    sub-float/2addr v15, v11

    .line 233
    invoke-static {v15}, Ljava/lang/Math;->abs(F)F

    .line 234
    .line 235
    .line 236
    move-result v15

    .line 237
    add-float/2addr v10, v15

    .line 238
    invoke-virtual {v1, v14}, Landroid/view/MotionEvent;->getY(I)F

    .line 239
    .line 240
    .line 241
    move-result v15

    .line 242
    sub-float/2addr v15, v12

    .line 243
    invoke-static {v15}, Ljava/lang/Math;->abs(F)F

    .line 244
    .line 245
    .line 246
    move-result v15

    .line 247
    add-float/2addr v13, v15

    .line 248
    :goto_e
    add-int/lit8 v14, v14, 0x1

    .line 249
    .line 250
    goto :goto_d

    .line 251
    :cond_14
    int-to-float v1, v4

    .line 252
    div-float/2addr v10, v1

    .line 253
    div-float/2addr v13, v1

    .line 254
    const/high16 v1, 0x40000000    # 2.0f

    .line 255
    .line 256
    mul-float/2addr v10, v1

    .line 257
    mul-float/2addr v13, v1

    .line 258
    invoke-direct/range {p0 .. p0}, Lcf/u;->i()Z

    .line 259
    .line 260
    .line 261
    move-result v1

    .line 262
    if-eqz v1, :cond_15

    .line 263
    .line 264
    move v1, v13

    .line 265
    goto :goto_f

    .line 266
    :cond_15
    float-to-double v3, v10

    .line 267
    float-to-double v14, v13

    .line 268
    invoke-static {v3, v4, v14, v15}, Ljava/lang/Math;->hypot(DD)D

    .line 269
    .line 270
    .line 271
    move-result-wide v3

    .line 272
    double-to-float v1, v3

    .line 273
    :goto_f
    iget-boolean v3, v0, Lcf/u;->p:Z

    .line 274
    .line 275
    iput v11, v0, Lcf/u;->c:F

    .line 276
    .line 277
    iput v12, v0, Lcf/u;->d:F

    .line 278
    .line 279
    invoke-direct/range {p0 .. p0}, Lcf/u;->i()Z

    .line 280
    .line 281
    .line 282
    move-result v4

    .line 283
    if-nez v4, :cond_17

    .line 284
    .line 285
    iget-boolean v4, v0, Lcf/u;->p:Z

    .line 286
    .line 287
    if-eqz v4, :cond_17

    .line 288
    .line 289
    iget v4, v0, Lcf/u;->r:I

    .line 290
    .line 291
    int-to-float v4, v4

    .line 292
    cmpg-float v4, v1, v4

    .line 293
    .line 294
    if-ltz v4, :cond_16

    .line 295
    .line 296
    if-eqz v7, :cond_17

    .line 297
    .line 298
    :cond_16
    iget-object v4, v0, Lcf/u;->b:Lcf/u$b;

    .line 299
    .line 300
    invoke-interface {v4, v0}, Lcf/u$b;->b(Lcf/u;)V

    .line 301
    .line 302
    .line 303
    iput-boolean v6, v0, Lcf/u;->p:Z

    .line 304
    .line 305
    iput v1, v0, Lcf/u;->i:F

    .line 306
    .line 307
    :cond_17
    if-eqz v7, :cond_18

    .line 308
    .line 309
    iput v10, v0, Lcf/u;->j:F

    .line 310
    .line 311
    iput v10, v0, Lcf/u;->l:F

    .line 312
    .line 313
    iput v13, v0, Lcf/u;->k:F

    .line 314
    .line 315
    iput v13, v0, Lcf/u;->m:F

    .line 316
    .line 317
    iput v1, v0, Lcf/u;->g:F

    .line 318
    .line 319
    iput v1, v0, Lcf/u;->h:F

    .line 320
    .line 321
    iput v1, v0, Lcf/u;->i:F

    .line 322
    .line 323
    :cond_18
    invoke-direct/range {p0 .. p0}, Lcf/u;->i()Z

    .line 324
    .line 325
    .line 326
    move-result v4

    .line 327
    if-eqz v4, :cond_19

    .line 328
    .line 329
    iget v4, v0, Lcf/u;->q:I

    .line 330
    .line 331
    goto :goto_10

    .line 332
    :cond_19
    iget v4, v0, Lcf/u;->r:I

    .line 333
    .line 334
    :goto_10
    iget-boolean v6, v0, Lcf/u;->p:Z

    .line 335
    .line 336
    if-nez v6, :cond_1b

    .line 337
    .line 338
    int-to-float v4, v4

    .line 339
    cmpl-float v4, v1, v4

    .line 340
    .line 341
    if-ltz v4, :cond_1b

    .line 342
    .line 343
    if-nez v3, :cond_1a

    .line 344
    .line 345
    iget v3, v0, Lcf/u;->i:F

    .line 346
    .line 347
    sub-float v3, v1, v3

    .line 348
    .line 349
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 350
    .line 351
    .line 352
    move-result v3

    .line 353
    iget v4, v0, Lcf/u;->q:I

    .line 354
    .line 355
    int-to-float v4, v4

    .line 356
    cmpl-float v3, v3, v4

    .line 357
    .line 358
    if-lez v3, :cond_1b

    .line 359
    .line 360
    :cond_1a
    iput v10, v0, Lcf/u;->j:F

    .line 361
    .line 362
    iput v10, v0, Lcf/u;->l:F

    .line 363
    .line 364
    iput v13, v0, Lcf/u;->k:F

    .line 365
    .line 366
    iput v13, v0, Lcf/u;->m:F

    .line 367
    .line 368
    iput v1, v0, Lcf/u;->g:F

    .line 369
    .line 370
    iput v1, v0, Lcf/u;->h:F

    .line 371
    .line 372
    iget-wide v3, v0, Lcf/u;->n:J

    .line 373
    .line 374
    iput-wide v3, v0, Lcf/u;->o:J

    .line 375
    .line 376
    iget-object v3, v0, Lcf/u;->b:Lcf/u$b;

    .line 377
    .line 378
    invoke-interface {v3, v0}, Lcf/u$b;->a(Lcf/u;)Z

    .line 379
    .line 380
    .line 381
    move-result v3

    .line 382
    iput-boolean v3, v0, Lcf/u;->p:Z

    .line 383
    .line 384
    :cond_1b
    if-ne v2, v8, :cond_1d

    .line 385
    .line 386
    iput v10, v0, Lcf/u;->j:F

    .line 387
    .line 388
    iput v13, v0, Lcf/u;->k:F

    .line 389
    .line 390
    iput v1, v0, Lcf/u;->g:F

    .line 391
    .line 392
    iget-boolean v1, v0, Lcf/u;->p:Z

    .line 393
    .line 394
    if-eqz v1, :cond_1c

    .line 395
    .line 396
    iget-object v1, v0, Lcf/u;->b:Lcf/u$b;

    .line 397
    .line 398
    invoke-interface {v1, v0}, Lcf/u$b;->c(Lcf/u;)Z

    .line 399
    .line 400
    .line 401
    move-result v1

    .line 402
    goto :goto_11

    .line 403
    :cond_1c
    move v1, v5

    .line 404
    :goto_11
    if-eqz v1, :cond_1d

    .line 405
    .line 406
    iget v1, v0, Lcf/u;->j:F

    .line 407
    .line 408
    iput v1, v0, Lcf/u;->l:F

    .line 409
    .line 410
    iget v1, v0, Lcf/u;->k:F

    .line 411
    .line 412
    iput v1, v0, Lcf/u;->m:F

    .line 413
    .line 414
    iget v1, v0, Lcf/u;->g:F

    .line 415
    .line 416
    iput v1, v0, Lcf/u;->h:F

    .line 417
    .line 418
    iget-wide v1, v0, Lcf/u;->n:J

    .line 419
    .line 420
    iput-wide v1, v0, Lcf/u;->o:J

    .line 421
    .line 422
    :cond_1d
    return v5
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
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
.end method

.method public k(Z)V
    .locals 3

    .line 1
    iput-boolean p1, p0, Lcf/u;->e:Z

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lcf/u;->w:Landroid/view/GestureDetector;

    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    new-instance p1, Lcf/u$a;

    .line 10
    .line 11
    invoke-direct {p1, p0}, Lcf/u$a;-><init>(Lcf/u;)V

    .line 12
    .line 13
    .line 14
    new-instance v0, Landroid/view/GestureDetector;

    .line 15
    .line 16
    iget-object v1, p0, Lcf/u;->a:Landroid/content/Context;

    .line 17
    .line 18
    iget-object v2, p0, Lcf/u;->s:Landroid/os/Handler;

    .line 19
    .line 20
    invoke-direct {v0, v1, p1, v2}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;Landroid/os/Handler;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lcf/u;->w:Landroid/view/GestureDetector;

    .line 24
    .line 25
    :cond_0
    return-void
    .line 26
    .line 27
.end method

.method public l(Z)V
    .locals 0

    iput-boolean p1, p0, Lcf/u;->f:Z

    return-void
.end method
