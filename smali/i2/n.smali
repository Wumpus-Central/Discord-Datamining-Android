.class public Li2/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li2/m;
.implements Lj2/a$b;
.implements Li2/k;


# instance fields
.field private final a:Landroid/graphics/Path;

.field private final b:Ljava/lang/String;

.field private final c:Lg2/e0;

.field private final d:Ln2/j$a;

.field private final e:Z

.field private final f:Z

.field private final g:Lj2/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj2/a<",
            "*",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field private final h:Lj2/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj2/a<",
            "*",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation
.end field

.field private final i:Lj2/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj2/a<",
            "*",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field private final j:Lj2/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj2/a<",
            "*",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field private final k:Lj2/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj2/a<",
            "*",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field private final l:Lj2/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj2/a<",
            "*",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field private final m:Lj2/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj2/a<",
            "*",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field private final n:Li2/b;

.field private o:Z


# direct methods
.method public constructor <init>(Lg2/e0;Lo2/b;Ln2/j;)V
    .locals 7

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/graphics/Path;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Li2/n;->a:Landroid/graphics/Path;

    .line 10
    .line 11
    new-instance v0, Li2/b;

    .line 12
    .line 13
    invoke-direct {v0}, Li2/b;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Li2/n;->n:Li2/b;

    .line 17
    .line 18
    iput-object p1, p0, Li2/n;->c:Lg2/e0;

    .line 19
    .line 20
    invoke-virtual {p3}, Ln2/j;->d()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iput-object p1, p0, Li2/n;->b:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {p3}, Ln2/j;->j()Ln2/j$a;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iput-object p1, p0, Li2/n;->d:Ln2/j$a;

    .line 31
    .line 32
    invoke-virtual {p3}, Ln2/j;->k()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iput-boolean v0, p0, Li2/n;->e:Z

    .line 37
    .line 38
    invoke-virtual {p3}, Ln2/j;->l()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    iput-boolean v0, p0, Li2/n;->f:Z

    .line 43
    .line 44
    invoke-virtual {p3}, Ln2/j;->g()Lm2/b;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v0}, Lm2/b;->a()Lj2/a;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iput-object v0, p0, Li2/n;->g:Lj2/a;

    .line 53
    .line 54
    invoke-virtual {p3}, Ln2/j;->h()Lm2/m;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-interface {v1}, Lm2/m;->a()Lj2/a;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    iput-object v1, p0, Li2/n;->h:Lj2/a;

    .line 63
    .line 64
    invoke-virtual {p3}, Ln2/j;->i()Lm2/b;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-virtual {v2}, Lm2/b;->a()Lj2/a;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    iput-object v2, p0, Li2/n;->i:Lj2/a;

    .line 73
    .line 74
    invoke-virtual {p3}, Ln2/j;->e()Lm2/b;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    invoke-virtual {v3}, Lm2/b;->a()Lj2/a;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    iput-object v3, p0, Li2/n;->k:Lj2/a;

    .line 83
    .line 84
    invoke-virtual {p3}, Ln2/j;->f()Lm2/b;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    invoke-virtual {v4}, Lm2/b;->a()Lj2/a;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    iput-object v4, p0, Li2/n;->m:Lj2/a;

    .line 93
    .line 94
    sget-object v5, Ln2/j$a;->l:Ln2/j$a;

    .line 95
    .line 96
    if-ne p1, v5, :cond_0

    .line 97
    .line 98
    invoke-virtual {p3}, Ln2/j;->b()Lm2/b;

    .line 99
    .line 100
    .line 101
    move-result-object v6

    .line 102
    invoke-virtual {v6}, Lm2/b;->a()Lj2/a;

    .line 103
    .line 104
    .line 105
    move-result-object v6

    .line 106
    iput-object v6, p0, Li2/n;->j:Lj2/a;

    .line 107
    .line 108
    invoke-virtual {p3}, Ln2/j;->c()Lm2/b;

    .line 109
    .line 110
    .line 111
    move-result-object p3

    .line 112
    invoke-virtual {p3}, Lm2/b;->a()Lj2/a;

    .line 113
    .line 114
    .line 115
    move-result-object p3

    .line 116
    iput-object p3, p0, Li2/n;->l:Lj2/a;

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_0
    const/4 p3, 0x0

    .line 120
    iput-object p3, p0, Li2/n;->j:Lj2/a;

    .line 121
    .line 122
    iput-object p3, p0, Li2/n;->l:Lj2/a;

    .line 123
    .line 124
    :goto_0
    invoke-virtual {p2, v0}, Lo2/b;->j(Lj2/a;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p2, v1}, Lo2/b;->j(Lj2/a;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p2, v2}, Lo2/b;->j(Lj2/a;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {p2, v3}, Lo2/b;->j(Lj2/a;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {p2, v4}, Lo2/b;->j(Lj2/a;)V

    .line 137
    .line 138
    .line 139
    if-ne p1, v5, :cond_1

    .line 140
    .line 141
    iget-object p3, p0, Li2/n;->j:Lj2/a;

    .line 142
    .line 143
    invoke-virtual {p2, p3}, Lo2/b;->j(Lj2/a;)V

    .line 144
    .line 145
    .line 146
    iget-object p3, p0, Li2/n;->l:Lj2/a;

    .line 147
    .line 148
    invoke-virtual {p2, p3}, Lo2/b;->j(Lj2/a;)V

    .line 149
    .line 150
    .line 151
    :cond_1
    invoke-virtual {v0, p0}, Lj2/a;->a(Lj2/a$b;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v1, p0}, Lj2/a;->a(Lj2/a$b;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v2, p0}, Lj2/a;->a(Lj2/a$b;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v3, p0}, Lj2/a;->a(Lj2/a$b;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v4, p0}, Lj2/a;->a(Lj2/a$b;)V

    .line 164
    .line 165
    .line 166
    if-ne p1, v5, :cond_2

    .line 167
    .line 168
    iget-object p1, p0, Li2/n;->j:Lj2/a;

    .line 169
    .line 170
    invoke-virtual {p1, p0}, Lj2/a;->a(Lj2/a$b;)V

    .line 171
    .line 172
    .line 173
    iget-object p1, p0, Li2/n;->l:Lj2/a;

    .line 174
    .line 175
    invoke-virtual {p1, p0}, Lj2/a;->a(Lj2/a$b;)V

    .line 176
    .line 177
    .line 178
    :cond_2
    return-void
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
.end method

.method private f()V
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Li2/n;->g:Lj2/a;

    .line 4
    .line 5
    invoke-virtual {v1}, Lj2/a;->h()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Ljava/lang/Float;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    float-to-double v1, v1

    .line 16
    invoke-static {v1, v2}, Ljava/lang/Math;->floor(D)D

    .line 17
    .line 18
    .line 19
    move-result-wide v1

    .line 20
    double-to-int v1, v1

    .line 21
    iget-object v2, v0, Li2/n;->i:Lj2/a;

    .line 22
    .line 23
    if-nez v2, :cond_0

    .line 24
    .line 25
    const-wide/16 v2, 0x0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-virtual {v2}, Lj2/a;->h()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    check-cast v2, Ljava/lang/Float;

    .line 33
    .line 34
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    float-to-double v2, v2

    .line 39
    :goto_0
    const-wide v4, 0x4056800000000000L    # 90.0

    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    sub-double/2addr v2, v4

    .line 45
    invoke-static {v2, v3}, Ljava/lang/Math;->toRadians(D)D

    .line 46
    .line 47
    .line 48
    move-result-wide v2

    .line 49
    int-to-double v4, v1

    .line 50
    const-wide v6, 0x401921fb54442d18L    # 6.283185307179586

    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    div-double/2addr v6, v4

    .line 56
    double-to-float v1, v6

    .line 57
    iget-object v6, v0, Li2/n;->m:Lj2/a;

    .line 58
    .line 59
    invoke-virtual {v6}, Lj2/a;->h()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v6

    .line 63
    check-cast v6, Ljava/lang/Float;

    .line 64
    .line 65
    invoke-virtual {v6}, Ljava/lang/Float;->floatValue()F

    .line 66
    .line 67
    .line 68
    move-result v6

    .line 69
    const/high16 v7, 0x42c80000    # 100.0f

    .line 70
    .line 71
    div-float/2addr v6, v7

    .line 72
    iget-object v7, v0, Li2/n;->k:Lj2/a;

    .line 73
    .line 74
    invoke-virtual {v7}, Lj2/a;->h()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v7

    .line 78
    check-cast v7, Ljava/lang/Float;

    .line 79
    .line 80
    invoke-virtual {v7}, Ljava/lang/Float;->floatValue()F

    .line 81
    .line 82
    .line 83
    move-result v7

    .line 84
    float-to-double v8, v7

    .line 85
    invoke-static {v2, v3}, Ljava/lang/Math;->cos(D)D

    .line 86
    .line 87
    .line 88
    move-result-wide v10

    .line 89
    mul-double/2addr v10, v8

    .line 90
    double-to-float v10, v10

    .line 91
    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    .line 92
    .line 93
    .line 94
    move-result-wide v11

    .line 95
    mul-double/2addr v11, v8

    .line 96
    double-to-float v11, v11

    .line 97
    iget-object v12, v0, Li2/n;->a:Landroid/graphics/Path;

    .line 98
    .line 99
    invoke-virtual {v12, v10, v11}, Landroid/graphics/Path;->moveTo(FF)V

    .line 100
    .line 101
    .line 102
    float-to-double v12, v1

    .line 103
    add-double/2addr v2, v12

    .line 104
    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    .line 105
    .line 106
    .line 107
    move-result-wide v4

    .line 108
    const/4 v1, 0x0

    .line 109
    :goto_1
    int-to-double v14, v1

    .line 110
    cmpg-double v14, v14, v4

    .line 111
    .line 112
    if-gez v14, :cond_2

    .line 113
    .line 114
    invoke-static {v2, v3}, Ljava/lang/Math;->cos(D)D

    .line 115
    .line 116
    .line 117
    move-result-wide v14

    .line 118
    mul-double/2addr v14, v8

    .line 119
    double-to-float v14, v14

    .line 120
    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    .line 121
    .line 122
    .line 123
    move-result-wide v15

    .line 124
    move-wide/from16 v23, v4

    .line 125
    .line 126
    mul-double v4, v8, v15

    .line 127
    .line 128
    double-to-float v4, v4

    .line 129
    const/4 v5, 0x0

    .line 130
    cmpl-float v5, v6, v5

    .line 131
    .line 132
    if-eqz v5, :cond_1

    .line 133
    .line 134
    move-wide/from16 v25, v8

    .line 135
    .line 136
    float-to-double v8, v11

    .line 137
    move v5, v1

    .line 138
    move-wide/from16 v27, v2

    .line 139
    .line 140
    float-to-double v1, v10

    .line 141
    invoke-static {v8, v9, v1, v2}, Ljava/lang/Math;->atan2(DD)D

    .line 142
    .line 143
    .line 144
    move-result-wide v1

    .line 145
    const-wide v8, 0x3ff921fb54442d18L    # 1.5707963267948966

    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    sub-double/2addr v1, v8

    .line 151
    double-to-float v1, v1

    .line 152
    float-to-double v1, v1

    .line 153
    invoke-static {v1, v2}, Ljava/lang/Math;->cos(D)D

    .line 154
    .line 155
    .line 156
    move-result-wide v8

    .line 157
    double-to-float v3, v8

    .line 158
    invoke-static {v1, v2}, Ljava/lang/Math;->sin(D)D

    .line 159
    .line 160
    .line 161
    move-result-wide v1

    .line 162
    double-to-float v1, v1

    .line 163
    float-to-double v8, v4

    .line 164
    move-wide/from16 v29, v12

    .line 165
    .line 166
    float-to-double v12, v14

    .line 167
    invoke-static {v8, v9, v12, v13}, Ljava/lang/Math;->atan2(DD)D

    .line 168
    .line 169
    .line 170
    move-result-wide v8

    .line 171
    const-wide v12, 0x3ff921fb54442d18L    # 1.5707963267948966

    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    sub-double/2addr v8, v12

    .line 177
    double-to-float v2, v8

    .line 178
    float-to-double v8, v2

    .line 179
    invoke-static {v8, v9}, Ljava/lang/Math;->cos(D)D

    .line 180
    .line 181
    .line 182
    move-result-wide v12

    .line 183
    double-to-float v2, v12

    .line 184
    invoke-static {v8, v9}, Ljava/lang/Math;->sin(D)D

    .line 185
    .line 186
    .line 187
    move-result-wide v8

    .line 188
    double-to-float v8, v8

    .line 189
    mul-float v9, v7, v6

    .line 190
    .line 191
    const/high16 v12, 0x3e800000    # 0.25f

    .line 192
    .line 193
    mul-float/2addr v9, v12

    .line 194
    mul-float/2addr v3, v9

    .line 195
    mul-float/2addr v1, v9

    .line 196
    mul-float/2addr v2, v9

    .line 197
    mul-float/2addr v9, v8

    .line 198
    iget-object v8, v0, Li2/n;->a:Landroid/graphics/Path;

    .line 199
    .line 200
    sub-float v17, v10, v3

    .line 201
    .line 202
    sub-float v18, v11, v1

    .line 203
    .line 204
    add-float v19, v14, v2

    .line 205
    .line 206
    add-float v20, v4, v9

    .line 207
    .line 208
    move-object/from16 v16, v8

    .line 209
    .line 210
    move/from16 v21, v14

    .line 211
    .line 212
    move/from16 v22, v4

    .line 213
    .line 214
    invoke-virtual/range {v16 .. v22}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 215
    .line 216
    .line 217
    goto :goto_2

    .line 218
    :cond_1
    move v5, v1

    .line 219
    move-wide/from16 v27, v2

    .line 220
    .line 221
    move-wide/from16 v25, v8

    .line 222
    .line 223
    move-wide/from16 v29, v12

    .line 224
    .line 225
    iget-object v1, v0, Li2/n;->a:Landroid/graphics/Path;

    .line 226
    .line 227
    invoke-virtual {v1, v14, v4}, Landroid/graphics/Path;->lineTo(FF)V

    .line 228
    .line 229
    .line 230
    :goto_2
    add-double v2, v27, v29

    .line 231
    .line 232
    add-int/lit8 v1, v5, 0x1

    .line 233
    .line 234
    move v11, v4

    .line 235
    move v10, v14

    .line 236
    move-wide/from16 v4, v23

    .line 237
    .line 238
    move-wide/from16 v8, v25

    .line 239
    .line 240
    move-wide/from16 v12, v29

    .line 241
    .line 242
    goto/16 :goto_1

    .line 243
    .line 244
    :cond_2
    iget-object v1, v0, Li2/n;->h:Lj2/a;

    .line 245
    .line 246
    invoke-virtual {v1}, Lj2/a;->h()Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v1

    .line 250
    check-cast v1, Landroid/graphics/PointF;

    .line 251
    .line 252
    iget-object v2, v0, Li2/n;->a:Landroid/graphics/Path;

    .line 253
    .line 254
    iget v3, v1, Landroid/graphics/PointF;->x:F

    .line 255
    .line 256
    iget v1, v1, Landroid/graphics/PointF;->y:F

    .line 257
    .line 258
    invoke-virtual {v2, v3, v1}, Landroid/graphics/Path;->offset(FF)V

    .line 259
    .line 260
    .line 261
    iget-object v1, v0, Li2/n;->a:Landroid/graphics/Path;

    .line 262
    .line 263
    invoke-virtual {v1}, Landroid/graphics/Path;->close()V

    .line 264
    .line 265
    .line 266
    return-void
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
.end method

.method private j()V
    .locals 45

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Li2/n;->g:Lj2/a;

    .line 4
    .line 5
    invoke-virtual {v1}, Lj2/a;->h()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Ljava/lang/Float;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    iget-object v2, v0, Li2/n;->i:Lj2/a;

    .line 16
    .line 17
    if-nez v2, :cond_0

    .line 18
    .line 19
    const-wide/16 v2, 0x0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {v2}, Lj2/a;->h()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Ljava/lang/Float;

    .line 27
    .line 28
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    float-to-double v2, v2

    .line 33
    :goto_0
    const-wide v4, 0x4056800000000000L    # 90.0

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    sub-double/2addr v2, v4

    .line 39
    invoke-static {v2, v3}, Ljava/lang/Math;->toRadians(D)D

    .line 40
    .line 41
    .line 42
    move-result-wide v2

    .line 43
    float-to-double v4, v1

    .line 44
    const-wide v6, 0x401921fb54442d18L    # 6.283185307179586

    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    div-double/2addr v6, v4

    .line 50
    double-to-float v6, v6

    .line 51
    iget-boolean v7, v0, Li2/n;->f:Z

    .line 52
    .line 53
    if-eqz v7, :cond_1

    .line 54
    .line 55
    const/high16 v7, -0x40800000    # -1.0f

    .line 56
    .line 57
    mul-float/2addr v6, v7

    .line 58
    :cond_1
    const/high16 v7, 0x40000000    # 2.0f

    .line 59
    .line 60
    div-float v8, v6, v7

    .line 61
    .line 62
    float-to-int v9, v1

    .line 63
    int-to-float v9, v9

    .line 64
    sub-float/2addr v1, v9

    .line 65
    const/4 v9, 0x0

    .line 66
    cmpl-float v10, v1, v9

    .line 67
    .line 68
    if-eqz v10, :cond_2

    .line 69
    .line 70
    const/high16 v11, 0x3f800000    # 1.0f

    .line 71
    .line 72
    sub-float/2addr v11, v1

    .line 73
    mul-float/2addr v11, v8

    .line 74
    float-to-double v11, v11

    .line 75
    add-double/2addr v2, v11

    .line 76
    :cond_2
    iget-object v11, v0, Li2/n;->k:Lj2/a;

    .line 77
    .line 78
    invoke-virtual {v11}, Lj2/a;->h()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v11

    .line 82
    check-cast v11, Ljava/lang/Float;

    .line 83
    .line 84
    invoke-virtual {v11}, Ljava/lang/Float;->floatValue()F

    .line 85
    .line 86
    .line 87
    move-result v11

    .line 88
    iget-object v12, v0, Li2/n;->j:Lj2/a;

    .line 89
    .line 90
    invoke-virtual {v12}, Lj2/a;->h()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v12

    .line 94
    check-cast v12, Ljava/lang/Float;

    .line 95
    .line 96
    invoke-virtual {v12}, Ljava/lang/Float;->floatValue()F

    .line 97
    .line 98
    .line 99
    move-result v12

    .line 100
    iget-object v13, v0, Li2/n;->l:Lj2/a;

    .line 101
    .line 102
    const/high16 v14, 0x42c80000    # 100.0f

    .line 103
    .line 104
    if-eqz v13, :cond_3

    .line 105
    .line 106
    invoke-virtual {v13}, Lj2/a;->h()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v13

    .line 110
    check-cast v13, Ljava/lang/Float;

    .line 111
    .line 112
    invoke-virtual {v13}, Ljava/lang/Float;->floatValue()F

    .line 113
    .line 114
    .line 115
    move-result v13

    .line 116
    div-float/2addr v13, v14

    .line 117
    goto :goto_1

    .line 118
    :cond_3
    move v13, v9

    .line 119
    :goto_1
    iget-object v15, v0, Li2/n;->m:Lj2/a;

    .line 120
    .line 121
    if-eqz v15, :cond_4

    .line 122
    .line 123
    invoke-virtual {v15}, Lj2/a;->h()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v15

    .line 127
    check-cast v15, Ljava/lang/Float;

    .line 128
    .line 129
    invoke-virtual {v15}, Ljava/lang/Float;->floatValue()F

    .line 130
    .line 131
    .line 132
    move-result v15

    .line 133
    div-float/2addr v15, v14

    .line 134
    goto :goto_2

    .line 135
    :cond_4
    move v15, v9

    .line 136
    :goto_2
    if-eqz v10, :cond_5

    .line 137
    .line 138
    sub-float v14, v11, v12

    .line 139
    .line 140
    mul-float/2addr v14, v1

    .line 141
    add-float/2addr v14, v12

    .line 142
    move/from16 v17, v10

    .line 143
    .line 144
    float-to-double v9, v14

    .line 145
    invoke-static {v2, v3}, Ljava/lang/Math;->cos(D)D

    .line 146
    .line 147
    .line 148
    move-result-wide v18

    .line 149
    move/from16 v21, v8

    .line 150
    .line 151
    mul-double v7, v9, v18

    .line 152
    .line 153
    double-to-float v7, v7

    .line 154
    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    .line 155
    .line 156
    .line 157
    move-result-wide v18

    .line 158
    mul-double v9, v9, v18

    .line 159
    .line 160
    double-to-float v8, v9

    .line 161
    iget-object v9, v0, Li2/n;->a:Landroid/graphics/Path;

    .line 162
    .line 163
    invoke-virtual {v9, v7, v8}, Landroid/graphics/Path;->moveTo(FF)V

    .line 164
    .line 165
    .line 166
    mul-float v9, v6, v1

    .line 167
    .line 168
    const/high16 v10, 0x40000000    # 2.0f

    .line 169
    .line 170
    div-float/2addr v9, v10

    .line 171
    float-to-double v9, v9

    .line 172
    add-double/2addr v2, v9

    .line 173
    move v10, v7

    .line 174
    move/from16 v7, v21

    .line 175
    .line 176
    goto :goto_3

    .line 177
    :cond_5
    move/from16 v21, v8

    .line 178
    .line 179
    move/from16 v17, v10

    .line 180
    .line 181
    float-to-double v7, v11

    .line 182
    invoke-static {v2, v3}, Ljava/lang/Math;->cos(D)D

    .line 183
    .line 184
    .line 185
    move-result-wide v9

    .line 186
    mul-double/2addr v9, v7

    .line 187
    double-to-float v9, v9

    .line 188
    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    .line 189
    .line 190
    .line 191
    move-result-wide v18

    .line 192
    mul-double v7, v7, v18

    .line 193
    .line 194
    double-to-float v8, v7

    .line 195
    iget-object v7, v0, Li2/n;->a:Landroid/graphics/Path;

    .line 196
    .line 197
    invoke-virtual {v7, v9, v8}, Landroid/graphics/Path;->moveTo(FF)V

    .line 198
    .line 199
    .line 200
    move v14, v8

    .line 201
    move v10, v9

    .line 202
    move/from16 v7, v21

    .line 203
    .line 204
    float-to-double v8, v7

    .line 205
    add-double/2addr v2, v8

    .line 206
    move v8, v14

    .line 207
    const/4 v14, 0x0

    .line 208
    :goto_3
    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    .line 209
    .line 210
    .line 211
    move-result-wide v4

    .line 212
    const-wide/high16 v18, 0x4000000000000000L    # 2.0

    .line 213
    .line 214
    mul-double v4, v4, v18

    .line 215
    .line 216
    const/4 v9, 0x0

    .line 217
    move/from16 v21, v7

    .line 218
    .line 219
    move v7, v10

    .line 220
    move/from16 v22, v11

    .line 221
    .line 222
    move/from16 v23, v12

    .line 223
    .line 224
    move v10, v9

    .line 225
    :goto_4
    int-to-double v11, v9

    .line 226
    cmpg-double v24, v11, v4

    .line 227
    .line 228
    if-gez v24, :cond_10

    .line 229
    .line 230
    if-eqz v10, :cond_6

    .line 231
    .line 232
    move/from16 v24, v22

    .line 233
    .line 234
    goto :goto_5

    .line 235
    :cond_6
    move/from16 v24, v23

    .line 236
    .line 237
    :goto_5
    const/16 v16, 0x0

    .line 238
    .line 239
    cmpl-float v25, v14, v16

    .line 240
    .line 241
    if-eqz v25, :cond_7

    .line 242
    .line 243
    sub-double v26, v4, v18

    .line 244
    .line 245
    cmpl-double v26, v11, v26

    .line 246
    .line 247
    if-nez v26, :cond_7

    .line 248
    .line 249
    mul-float v26, v6, v1

    .line 250
    .line 251
    const/high16 v20, 0x40000000    # 2.0f

    .line 252
    .line 253
    div-float v26, v26, v20

    .line 254
    .line 255
    move/from16 v44, v26

    .line 256
    .line 257
    move/from16 v26, v6

    .line 258
    .line 259
    move/from16 v6, v44

    .line 260
    .line 261
    goto :goto_6

    .line 262
    :cond_7
    const/high16 v20, 0x40000000    # 2.0f

    .line 263
    .line 264
    move/from16 v26, v6

    .line 265
    .line 266
    move/from16 v6, v21

    .line 267
    .line 268
    :goto_6
    const-wide/high16 v27, 0x3ff0000000000000L    # 1.0

    .line 269
    .line 270
    if-eqz v25, :cond_8

    .line 271
    .line 272
    sub-double v29, v4, v27

    .line 273
    .line 274
    cmpl-double v25, v11, v29

    .line 275
    .line 276
    if-nez v25, :cond_8

    .line 277
    .line 278
    move-wide/from16 v29, v11

    .line 279
    .line 280
    move/from16 v25, v14

    .line 281
    .line 282
    goto :goto_7

    .line 283
    :cond_8
    move-wide/from16 v29, v11

    .line 284
    .line 285
    move/from16 v25, v14

    .line 286
    .line 287
    move/from16 v14, v24

    .line 288
    .line 289
    :goto_7
    float-to-double v11, v14

    .line 290
    invoke-static {v2, v3}, Ljava/lang/Math;->cos(D)D

    .line 291
    .line 292
    .line 293
    move-result-wide v31

    .line 294
    move-wide/from16 v33, v4

    .line 295
    .line 296
    mul-double v4, v11, v31

    .line 297
    .line 298
    double-to-float v4, v4

    .line 299
    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    .line 300
    .line 301
    .line 302
    move-result-wide v31

    .line 303
    mul-double v11, v11, v31

    .line 304
    .line 305
    double-to-float v5, v11

    .line 306
    const/4 v11, 0x0

    .line 307
    cmpl-float v12, v13, v11

    .line 308
    .line 309
    if-nez v12, :cond_9

    .line 310
    .line 311
    cmpl-float v12, v15, v11

    .line 312
    .line 313
    if-nez v12, :cond_9

    .line 314
    .line 315
    iget-object v7, v0, Li2/n;->a:Landroid/graphics/Path;

    .line 316
    .line 317
    invoke-virtual {v7, v4, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 318
    .line 319
    .line 320
    move-wide/from16 v42, v2

    .line 321
    .line 322
    move/from16 v24, v13

    .line 323
    .line 324
    move v12, v15

    .line 325
    goto/16 :goto_d

    .line 326
    .line 327
    :cond_9
    float-to-double v11, v8

    .line 328
    move/from16 v24, v13

    .line 329
    .line 330
    float-to-double v13, v7

    .line 331
    invoke-static {v11, v12, v13, v14}, Ljava/lang/Math;->atan2(DD)D

    .line 332
    .line 333
    .line 334
    move-result-wide v11

    .line 335
    const-wide v13, 0x3ff921fb54442d18L    # 1.5707963267948966

    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    sub-double/2addr v11, v13

    .line 341
    double-to-float v11, v11

    .line 342
    float-to-double v11, v11

    .line 343
    invoke-static {v11, v12}, Ljava/lang/Math;->cos(D)D

    .line 344
    .line 345
    .line 346
    move-result-wide v13

    .line 347
    double-to-float v13, v13

    .line 348
    invoke-static {v11, v12}, Ljava/lang/Math;->sin(D)D

    .line 349
    .line 350
    .line 351
    move-result-wide v11

    .line 352
    double-to-float v11, v11

    .line 353
    move v12, v15

    .line 354
    float-to-double v14, v5

    .line 355
    move-wide/from16 v42, v2

    .line 356
    .line 357
    float-to-double v2, v4

    .line 358
    invoke-static {v14, v15, v2, v3}, Ljava/lang/Math;->atan2(DD)D

    .line 359
    .line 360
    .line 361
    move-result-wide v2

    .line 362
    const-wide v14, 0x3ff921fb54442d18L    # 1.5707963267948966

    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    sub-double/2addr v2, v14

    .line 368
    double-to-float v2, v2

    .line 369
    float-to-double v2, v2

    .line 370
    invoke-static {v2, v3}, Ljava/lang/Math;->cos(D)D

    .line 371
    .line 372
    .line 373
    move-result-wide v14

    .line 374
    double-to-float v14, v14

    .line 375
    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    .line 376
    .line 377
    .line 378
    move-result-wide v2

    .line 379
    double-to-float v2, v2

    .line 380
    if-eqz v10, :cond_a

    .line 381
    .line 382
    move/from16 v3, v24

    .line 383
    .line 384
    goto :goto_8

    .line 385
    :cond_a
    move v3, v12

    .line 386
    :goto_8
    if-eqz v10, :cond_b

    .line 387
    .line 388
    move v15, v12

    .line 389
    goto :goto_9

    .line 390
    :cond_b
    move/from16 v15, v24

    .line 391
    .line 392
    :goto_9
    if-eqz v10, :cond_c

    .line 393
    .line 394
    move/from16 v31, v23

    .line 395
    .line 396
    goto :goto_a

    .line 397
    :cond_c
    move/from16 v31, v22

    .line 398
    .line 399
    :goto_a
    if-eqz v10, :cond_d

    .line 400
    .line 401
    move/from16 v32, v22

    .line 402
    .line 403
    goto :goto_b

    .line 404
    :cond_d
    move/from16 v32, v23

    .line 405
    .line 406
    :goto_b
    mul-float v31, v31, v3

    .line 407
    .line 408
    const v3, 0x3ef4e26d    # 0.47829f

    .line 409
    .line 410
    .line 411
    mul-float v31, v31, v3

    .line 412
    .line 413
    mul-float v13, v13, v31

    .line 414
    .line 415
    mul-float v31, v31, v11

    .line 416
    .line 417
    mul-float v32, v32, v15

    .line 418
    .line 419
    mul-float v32, v32, v3

    .line 420
    .line 421
    mul-float v14, v14, v32

    .line 422
    .line 423
    mul-float v32, v32, v2

    .line 424
    .line 425
    if-eqz v17, :cond_f

    .line 426
    .line 427
    if-nez v9, :cond_e

    .line 428
    .line 429
    mul-float/2addr v13, v1

    .line 430
    mul-float v31, v31, v1

    .line 431
    .line 432
    goto :goto_c

    .line 433
    :cond_e
    sub-double v2, v33, v27

    .line 434
    .line 435
    cmpl-double v2, v29, v2

    .line 436
    .line 437
    if-nez v2, :cond_f

    .line 438
    .line 439
    mul-float/2addr v14, v1

    .line 440
    mul-float v32, v32, v1

    .line 441
    .line 442
    :cond_f
    :goto_c
    iget-object v2, v0, Li2/n;->a:Landroid/graphics/Path;

    .line 443
    .line 444
    sub-float v36, v7, v13

    .line 445
    .line 446
    sub-float v37, v8, v31

    .line 447
    .line 448
    add-float v38, v4, v14

    .line 449
    .line 450
    add-float v39, v5, v32

    .line 451
    .line 452
    move-object/from16 v35, v2

    .line 453
    .line 454
    move/from16 v40, v4

    .line 455
    .line 456
    move/from16 v41, v5

    .line 457
    .line 458
    invoke-virtual/range {v35 .. v41}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 459
    .line 460
    .line 461
    :goto_d
    float-to-double v2, v6

    .line 462
    add-double v2, v42, v2

    .line 463
    .line 464
    xor-int/lit8 v10, v10, 0x1

    .line 465
    .line 466
    add-int/lit8 v9, v9, 0x1

    .line 467
    .line 468
    move v7, v4

    .line 469
    move v8, v5

    .line 470
    move v15, v12

    .line 471
    move/from16 v13, v24

    .line 472
    .line 473
    move/from16 v14, v25

    .line 474
    .line 475
    move/from16 v6, v26

    .line 476
    .line 477
    move-wide/from16 v4, v33

    .line 478
    .line 479
    goto/16 :goto_4

    .line 480
    .line 481
    :cond_10
    iget-object v1, v0, Li2/n;->h:Lj2/a;

    .line 482
    .line 483
    invoke-virtual {v1}, Lj2/a;->h()Ljava/lang/Object;

    .line 484
    .line 485
    .line 486
    move-result-object v1

    .line 487
    check-cast v1, Landroid/graphics/PointF;

    .line 488
    .line 489
    iget-object v2, v0, Li2/n;->a:Landroid/graphics/Path;

    .line 490
    .line 491
    iget v3, v1, Landroid/graphics/PointF;->x:F

    .line 492
    .line 493
    iget v1, v1, Landroid/graphics/PointF;->y:F

    .line 494
    .line 495
    invoke-virtual {v2, v3, v1}, Landroid/graphics/Path;->offset(FF)V

    .line 496
    .line 497
    .line 498
    iget-object v1, v0, Li2/n;->a:Landroid/graphics/Path;

    .line 499
    .line 500
    invoke-virtual {v1}, Landroid/graphics/Path;->close()V

    .line 501
    .line 502
    .line 503
    return-void
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
.end method

.method private k()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Li2/n;->o:Z

    .line 3
    .line 4
    iget-object v0, p0, Li2/n;->c:Lg2/e0;

    .line 5
    .line 6
    invoke-virtual {v0}, Lg2/e0;->invalidateSelf()V

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
.end method


# virtual methods
.method public a()V
    .locals 0

    invoke-direct {p0}, Li2/n;->k()V

    return-void
.end method

.method public b(Ljava/util/List;Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Li2/c;",
            ">;",
            "Ljava/util/List<",
            "Li2/c;",
            ">;)V"
        }
    .end annotation

    .line 1
    const/4 p2, 0x0

    .line 2
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-ge p2, v0, :cond_1

    .line 7
    .line 8
    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Li2/c;

    .line 13
    .line 14
    instance-of v1, v0, Li2/u;

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    check-cast v0, Li2/u;

    .line 19
    .line 20
    invoke-virtual {v0}, Li2/u;->k()Ln2/s$a;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    sget-object v2, Ln2/s$a;->k:Ln2/s$a;

    .line 25
    .line 26
    if-ne v1, v2, :cond_0

    .line 27
    .line 28
    iget-object v1, p0, Li2/n;->n:Li2/b;

    .line 29
    .line 30
    invoke-virtual {v1, v0}, Li2/b;->a(Li2/u;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, p0}, Li2/u;->d(Lj2/a$b;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    add-int/lit8 p2, p2, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    return-void
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

.method public d(Ll2/e;ILjava/util/List;Ll2/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll2/e;",
            "I",
            "Ljava/util/List<",
            "Ll2/e;",
            ">;",
            "Ll2/e;",
            ")V"
        }
    .end annotation

    invoke-static {p1, p2, p3, p4, p0}, Ls2/i;->k(Ll2/e;ILjava/util/List;Ll2/e;Li2/k;)V

    return-void
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Li2/n;->b:Ljava/lang/String;

    return-object v0
.end method

.method public h()Landroid/graphics/Path;
    .locals 3

    .line 1
    iget-boolean v0, p0, Li2/n;->o:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Li2/n;->a:Landroid/graphics/Path;

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    iget-object v0, p0, Li2/n;->a:Landroid/graphics/Path;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 11
    .line 12
    .line 13
    iget-boolean v0, p0, Li2/n;->e:Z

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    iput-boolean v1, p0, Li2/n;->o:Z

    .line 19
    .line 20
    iget-object v0, p0, Li2/n;->a:Landroid/graphics/Path;

    .line 21
    .line 22
    return-object v0

    .line 23
    :cond_1
    sget-object v0, Li2/n$a;->a:[I

    .line 24
    .line 25
    iget-object v2, p0, Li2/n;->d:Ln2/j$a;

    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    aget v0, v0, v2

    .line 32
    .line 33
    if-eq v0, v1, :cond_3

    .line 34
    .line 35
    const/4 v2, 0x2

    .line 36
    if-eq v0, v2, :cond_2

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    invoke-direct {p0}, Li2/n;->f()V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_3
    invoke-direct {p0}, Li2/n;->j()V

    .line 44
    .line 45
    .line 46
    :goto_0
    iget-object v0, p0, Li2/n;->a:Landroid/graphics/Path;

    .line 47
    .line 48
    invoke-virtual {v0}, Landroid/graphics/Path;->close()V

    .line 49
    .line 50
    .line 51
    iget-object v0, p0, Li2/n;->n:Li2/b;

    .line 52
    .line 53
    iget-object v2, p0, Li2/n;->a:Landroid/graphics/Path;

    .line 54
    .line 55
    invoke-virtual {v0, v2}, Li2/b;->b(Landroid/graphics/Path;)V

    .line 56
    .line 57
    .line 58
    iput-boolean v1, p0, Li2/n;->o:Z

    .line 59
    .line 60
    iget-object v0, p0, Li2/n;->a:Landroid/graphics/Path;

    .line 61
    .line 62
    return-object v0
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
.end method

.method public i(Ljava/lang/Object;Lt2/c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Lt2/c<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    sget-object v0, Lg2/j0;->w:Ljava/lang/Float;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Li2/n;->g:Lj2/a;

    .line 6
    .line 7
    invoke-virtual {p1, p2}, Lj2/a;->n(Lt2/c;)V

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    sget-object v0, Lg2/j0;->x:Ljava/lang/Float;

    .line 12
    .line 13
    if-ne p1, v0, :cond_1

    .line 14
    .line 15
    iget-object p1, p0, Li2/n;->i:Lj2/a;

    .line 16
    .line 17
    invoke-virtual {p1, p2}, Lj2/a;->n(Lt2/c;)V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    sget-object v0, Lg2/j0;->n:Landroid/graphics/PointF;

    .line 22
    .line 23
    if-ne p1, v0, :cond_2

    .line 24
    .line 25
    iget-object p1, p0, Li2/n;->h:Lj2/a;

    .line 26
    .line 27
    invoke-virtual {p1, p2}, Lj2/a;->n(Lt2/c;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    sget-object v0, Lg2/j0;->y:Ljava/lang/Float;

    .line 32
    .line 33
    if-ne p1, v0, :cond_3

    .line 34
    .line 35
    iget-object v0, p0, Li2/n;->j:Lj2/a;

    .line 36
    .line 37
    if-eqz v0, :cond_3

    .line 38
    .line 39
    invoke-virtual {v0, p2}, Lj2/a;->n(Lt2/c;)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_3
    sget-object v0, Lg2/j0;->z:Ljava/lang/Float;

    .line 44
    .line 45
    if-ne p1, v0, :cond_4

    .line 46
    .line 47
    iget-object p1, p0, Li2/n;->k:Lj2/a;

    .line 48
    .line 49
    invoke-virtual {p1, p2}, Lj2/a;->n(Lt2/c;)V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_4
    sget-object v0, Lg2/j0;->A:Ljava/lang/Float;

    .line 54
    .line 55
    if-ne p1, v0, :cond_5

    .line 56
    .line 57
    iget-object v0, p0, Li2/n;->l:Lj2/a;

    .line 58
    .line 59
    if-eqz v0, :cond_5

    .line 60
    .line 61
    invoke-virtual {v0, p2}, Lj2/a;->n(Lt2/c;)V

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_5
    sget-object v0, Lg2/j0;->B:Ljava/lang/Float;

    .line 66
    .line 67
    if-ne p1, v0, :cond_6

    .line 68
    .line 69
    iget-object p1, p0, Li2/n;->m:Lj2/a;

    .line 70
    .line 71
    invoke-virtual {p1, p2}, Lj2/a;->n(Lt2/c;)V

    .line 72
    .line 73
    .line 74
    :cond_6
    :goto_0
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
.end method
