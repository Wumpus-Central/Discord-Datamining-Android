.class public Lcom/facebook/drawee/drawable/RoundedColorDrawable;
.super Landroid/graphics/drawable/Drawable;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/drawee/drawable/i;


# instance fields
.field private final k:[F

.field final l:[F

.field m:[F

.field final n:Landroid/graphics/Paint;

.field private o:Z

.field private p:F

.field private q:F

.field private r:I

.field private s:Z

.field private t:Z

.field final u:Landroid/graphics/Path;

.field final v:Landroid/graphics/Path;

.field private w:I

.field private final x:Landroid/graphics/RectF;

.field private y:I


# direct methods
.method public constructor <init>(I)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x8

    .line 5
    .line 6
    new-array v1, v0, [F

    .line 7
    .line 8
    iput-object v1, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->k:[F

    .line 9
    .line 10
    new-array v0, v0, [F

    .line 11
    .line 12
    iput-object v0, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->l:[F

    .line 13
    .line 14
    new-instance v0, Landroid/graphics/Paint;

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->n:Landroid/graphics/Paint;

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    iput-boolean v0, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->o:Z

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    iput v1, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->p:F

    .line 27
    .line 28
    iput v1, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->q:F

    .line 29
    .line 30
    iput v0, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->r:I

    .line 31
    .line 32
    iput-boolean v0, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->s:Z

    .line 33
    .line 34
    iput-boolean v0, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->t:Z

    .line 35
    .line 36
    new-instance v1, Landroid/graphics/Path;

    .line 37
    .line 38
    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    .line 39
    .line 40
    .line 41
    iput-object v1, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->u:Landroid/graphics/Path;

    .line 42
    .line 43
    new-instance v1, Landroid/graphics/Path;

    .line 44
    .line 45
    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    .line 46
    .line 47
    .line 48
    iput-object v1, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->v:Landroid/graphics/Path;

    .line 49
    .line 50
    iput v0, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->w:I

    .line 51
    .line 52
    new-instance v0, Landroid/graphics/RectF;

    .line 53
    .line 54
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 55
    .line 56
    .line 57
    iput-object v0, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->x:Landroid/graphics/RectF;

    .line 58
    .line 59
    const/16 v0, 0xff

    .line 60
    .line 61
    iput v0, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->y:I

    .line 62
    .line 63
    invoke-virtual {p0, p1}, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->i(I)V

    .line 64
    .line 65
    .line 66
    return-void
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
.end method

.method public static f(Landroid/graphics/drawable/ColorDrawable;)Lcom/facebook/drawee/drawable/RoundedColorDrawable;
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    new-instance v0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;

    invoke-virtual {p0}, Landroid/graphics/drawable/ColorDrawable;->getColor()I

    move-result p0

    invoke-direct {v0, p0}, Lcom/facebook/drawee/drawable/RoundedColorDrawable;-><init>(I)V

    return-object v0
.end method

.method private j()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->u:Landroid/graphics/Path;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->v:Landroid/graphics/Path;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->x:Landroid/graphics/RectF;

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v0, v1}, Landroid/graphics/RectF;->set(Landroid/graphics/Rect;)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->x:Landroid/graphics/RectF;

    .line 21
    .line 22
    iget v1, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->p:F

    .line 23
    .line 24
    const/high16 v2, 0x40000000    # 2.0f

    .line 25
    .line 26
    div-float v3, v1, v2

    .line 27
    .line 28
    div-float/2addr v1, v2

    .line 29
    invoke-virtual {v0, v3, v1}, Landroid/graphics/RectF;->inset(FF)V

    .line 30
    .line 31
    .line 32
    iget-boolean v0, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->o:Z

    .line 33
    .line 34
    const/4 v1, 0x0

    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    iget-object v0, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->x:Landroid/graphics/RectF;

    .line 38
    .line 39
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    iget-object v3, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->x:Landroid/graphics/RectF;

    .line 44
    .line 45
    invoke-virtual {v3}, Landroid/graphics/RectF;->height()F

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    invoke-static {v0, v3}, Ljava/lang/Math;->min(FF)F

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    div-float/2addr v0, v2

    .line 54
    iget-object v3, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->v:Landroid/graphics/Path;

    .line 55
    .line 56
    iget-object v4, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->x:Landroid/graphics/RectF;

    .line 57
    .line 58
    invoke-virtual {v4}, Landroid/graphics/RectF;->centerX()F

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    iget-object v5, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->x:Landroid/graphics/RectF;

    .line 63
    .line 64
    invoke-virtual {v5}, Landroid/graphics/RectF;->centerY()F

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    sget-object v6, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 69
    .line 70
    invoke-virtual {v3, v4, v5, v0, v6}, Landroid/graphics/Path;->addCircle(FFFLandroid/graphics/Path$Direction;)V

    .line 71
    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_0
    move v0, v1

    .line 75
    :goto_0
    iget-object v3, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->l:[F

    .line 76
    .line 77
    array-length v4, v3

    .line 78
    if-ge v0, v4, :cond_1

    .line 79
    .line 80
    iget-object v4, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->k:[F

    .line 81
    .line 82
    aget v4, v4, v0

    .line 83
    .line 84
    iget v5, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->q:F

    .line 85
    .line 86
    add-float/2addr v4, v5

    .line 87
    iget v5, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->p:F

    .line 88
    .line 89
    div-float/2addr v5, v2

    .line 90
    sub-float/2addr v4, v5

    .line 91
    aput v4, v3, v0

    .line 92
    .line 93
    add-int/lit8 v0, v0, 0x1

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_1
    iget-object v0, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->v:Landroid/graphics/Path;

    .line 97
    .line 98
    iget-object v4, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->x:Landroid/graphics/RectF;

    .line 99
    .line 100
    sget-object v5, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 101
    .line 102
    invoke-virtual {v0, v4, v3, v5}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;[FLandroid/graphics/Path$Direction;)V

    .line 103
    .line 104
    .line 105
    :goto_1
    iget-object v0, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->x:Landroid/graphics/RectF;

    .line 106
    .line 107
    iget v3, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->p:F

    .line 108
    .line 109
    neg-float v4, v3

    .line 110
    div-float/2addr v4, v2

    .line 111
    neg-float v3, v3

    .line 112
    div-float/2addr v3, v2

    .line 113
    invoke-virtual {v0, v4, v3}, Landroid/graphics/RectF;->inset(FF)V

    .line 114
    .line 115
    .line 116
    iget v0, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->q:F

    .line 117
    .line 118
    iget-boolean v3, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->s:Z

    .line 119
    .line 120
    if-eqz v3, :cond_2

    .line 121
    .line 122
    iget v3, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->p:F

    .line 123
    .line 124
    goto :goto_2

    .line 125
    :cond_2
    const/4 v3, 0x0

    .line 126
    :goto_2
    add-float/2addr v0, v3

    .line 127
    iget-object v3, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->x:Landroid/graphics/RectF;

    .line 128
    .line 129
    invoke-virtual {v3, v0, v0}, Landroid/graphics/RectF;->inset(FF)V

    .line 130
    .line 131
    .line 132
    iget-boolean v3, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->o:Z

    .line 133
    .line 134
    if-eqz v3, :cond_3

    .line 135
    .line 136
    iget-object v1, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->x:Landroid/graphics/RectF;

    .line 137
    .line 138
    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    iget-object v3, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->x:Landroid/graphics/RectF;

    .line 143
    .line 144
    invoke-virtual {v3}, Landroid/graphics/RectF;->height()F

    .line 145
    .line 146
    .line 147
    move-result v3

    .line 148
    invoke-static {v1, v3}, Ljava/lang/Math;->min(FF)F

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    div-float/2addr v1, v2

    .line 153
    iget-object v2, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->u:Landroid/graphics/Path;

    .line 154
    .line 155
    iget-object v3, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->x:Landroid/graphics/RectF;

    .line 156
    .line 157
    invoke-virtual {v3}, Landroid/graphics/RectF;->centerX()F

    .line 158
    .line 159
    .line 160
    move-result v3

    .line 161
    iget-object v4, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->x:Landroid/graphics/RectF;

    .line 162
    .line 163
    invoke-virtual {v4}, Landroid/graphics/RectF;->centerY()F

    .line 164
    .line 165
    .line 166
    move-result v4

    .line 167
    sget-object v5, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 168
    .line 169
    invoke-virtual {v2, v3, v4, v1, v5}, Landroid/graphics/Path;->addCircle(FFFLandroid/graphics/Path$Direction;)V

    .line 170
    .line 171
    .line 172
    goto :goto_4

    .line 173
    :cond_3
    iget-boolean v2, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->s:Z

    .line 174
    .line 175
    if-eqz v2, :cond_6

    .line 176
    .line 177
    iget-object v2, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->m:[F

    .line 178
    .line 179
    if-nez v2, :cond_4

    .line 180
    .line 181
    const/16 v2, 0x8

    .line 182
    .line 183
    new-array v2, v2, [F

    .line 184
    .line 185
    iput-object v2, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->m:[F

    .line 186
    .line 187
    :cond_4
    :goto_3
    iget-object v2, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->m:[F

    .line 188
    .line 189
    array-length v3, v2

    .line 190
    if-ge v1, v3, :cond_5

    .line 191
    .line 192
    iget-object v3, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->k:[F

    .line 193
    .line 194
    aget v3, v3, v1

    .line 195
    .line 196
    iget v4, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->p:F

    .line 197
    .line 198
    sub-float/2addr v3, v4

    .line 199
    aput v3, v2, v1

    .line 200
    .line 201
    add-int/lit8 v1, v1, 0x1

    .line 202
    .line 203
    goto :goto_3

    .line 204
    :cond_5
    iget-object v1, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->u:Landroid/graphics/Path;

    .line 205
    .line 206
    iget-object v3, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->x:Landroid/graphics/RectF;

    .line 207
    .line 208
    sget-object v4, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 209
    .line 210
    invoke-virtual {v1, v3, v2, v4}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;[FLandroid/graphics/Path$Direction;)V

    .line 211
    .line 212
    .line 213
    goto :goto_4

    .line 214
    :cond_6
    iget-object v1, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->u:Landroid/graphics/Path;

    .line 215
    .line 216
    iget-object v2, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->x:Landroid/graphics/RectF;

    .line 217
    .line 218
    iget-object v3, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->k:[F

    .line 219
    .line 220
    sget-object v4, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 221
    .line 222
    invoke-virtual {v1, v2, v3, v4}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;[FLandroid/graphics/Path$Direction;)V

    .line 223
    .line 224
    .line 225
    :goto_4
    iget-object v1, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->x:Landroid/graphics/RectF;

    .line 226
    .line 227
    neg-float v0, v0

    .line 228
    invoke-virtual {v1, v0, v0}, Landroid/graphics/RectF;->inset(FF)V

    .line 229
    .line 230
    .line 231
    return-void
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
.end method


# virtual methods
.method public a(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->o:Z

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->j()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 7
    .line 8
    .line 9
    return-void
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
.end method

.method public b(F)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->q:F

    .line 2
    .line 3
    cmpl-float v0, v0, p1

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iput p1, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->q:F

    .line 8
    .line 9
    invoke-direct {p0}, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->j()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
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
.end method

.method public c(F)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpl-float v0, p1, v0

    .line 3
    .line 4
    if-ltz v0, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    const-string v1, "radius should be non negative"

    .line 10
    .line 11
    invoke-static {v0, v1}, Lw3/j;->c(ZLjava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->k:[F

    .line 15
    .line 16
    invoke-static {v0, p1}, Ljava/util/Arrays;->fill([FF)V

    .line 17
    .line 18
    .line 19
    invoke-direct {p0}, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->j()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 23
    .line 24
    .line 25
    return-void
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
.end method

.method public d(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->t:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-boolean p1, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->t:Z

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
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
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->n:Landroid/graphics/Paint;

    .line 2
    .line 3
    iget v1, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->w:I

    .line 4
    .line 5
    iget v2, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->y:I

    .line 6
    .line 7
    invoke-static {v1, v2}, Lcom/facebook/drawee/drawable/d;->c(II)I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->n:Landroid/graphics/Paint;

    .line 15
    .line 16
    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->n:Landroid/graphics/Paint;

    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->h()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->u:Landroid/graphics/Path;

    .line 31
    .line 32
    iget-object v1, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->n:Landroid/graphics/Paint;

    .line 33
    .line 34
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 35
    .line 36
    .line 37
    iget v0, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->p:F

    .line 38
    .line 39
    const/4 v1, 0x0

    .line 40
    cmpl-float v0, v0, v1

    .line 41
    .line 42
    if-eqz v0, :cond_0

    .line 43
    .line 44
    iget-object v0, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->n:Landroid/graphics/Paint;

    .line 45
    .line 46
    iget v1, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->r:I

    .line 47
    .line 48
    iget v2, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->y:I

    .line 49
    .line 50
    invoke-static {v1, v2}, Lcom/facebook/drawee/drawable/d;->c(II)I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 55
    .line 56
    .line 57
    iget-object v0, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->n:Landroid/graphics/Paint;

    .line 58
    .line 59
    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 62
    .line 63
    .line 64
    iget-object v0, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->n:Landroid/graphics/Paint;

    .line 65
    .line 66
    iget v1, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->p:F

    .line 67
    .line 68
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 69
    .line 70
    .line 71
    iget-object v0, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->v:Landroid/graphics/Path;

    .line 72
    .line 73
    iget-object v1, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->n:Landroid/graphics/Paint;

    .line 74
    .line 75
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 76
    .line 77
    .line 78
    :cond_0
    return-void
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
.end method

.method public e(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->s:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-boolean p1, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->s:Z

    .line 6
    .line 7
    invoke-direct {p0}, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->j()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 11
    .line 12
    .line 13
    :cond_0
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
.end method

.method public g([F)V
    .locals 4

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->k:[F

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-static {p1, v0}, Ljava/util/Arrays;->fill([FF)V

    .line 7
    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    array-length v0, p1

    .line 11
    const/16 v1, 0x8

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    if-ne v0, v1, :cond_1

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    goto :goto_0

    .line 18
    :cond_1
    move v0, v2

    .line 19
    :goto_0
    const-string v3, "radii should have exactly 8 values"

    .line 20
    .line 21
    invoke-static {v0, v3}, Lw3/j;->c(ZLjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->k:[F

    .line 25
    .line 26
    invoke-static {p1, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 27
    .line 28
    .line 29
    :goto_1
    invoke-direct {p0}, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->j()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 33
    .line 34
    .line 35
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
.end method

.method public getAlpha()I
    .locals 1

    iget v0, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->y:I

    return v0
.end method

.method public getOpacity()I
    .locals 2

    iget v0, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->w:I

    iget v1, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->y:I

    invoke-static {v0, v1}, Lcom/facebook/drawee/drawable/d;->c(II)I

    move-result v0

    invoke-static {v0}, Lcom/facebook/drawee/drawable/d;->b(I)I

    move-result v0

    return v0
.end method

.method public h()Z
    .locals 1

    iget-boolean v0, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->t:Z

    return v0
.end method

.method public i(I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->w:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput p1, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->w:I

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
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
.end method

.method protected onBoundsChange(Landroid/graphics/Rect;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->onBoundsChange(Landroid/graphics/Rect;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->j()V

    .line 5
    .line 6
    .line 7
    return-void
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
.end method

.method public setAlpha(I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->y:I

    .line 2
    .line 3
    if-eq p1, v0, :cond_0

    .line 4
    .line 5
    iput p1, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->y:I

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
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
.end method

.method public setBorder(IF)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->r:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput p1, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->r:I

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget p1, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->p:F

    .line 11
    .line 12
    cmpl-float p1, p1, p2

    .line 13
    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    iput p2, p0, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->p:F

    .line 17
    .line 18
    invoke-direct {p0}, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->j()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 22
    .line 23
    .line 24
    :cond_1
    return-void
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
.end method

.method public setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 0

    return-void
.end method
