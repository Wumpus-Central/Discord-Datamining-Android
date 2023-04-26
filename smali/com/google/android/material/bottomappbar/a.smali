.class public Lcom/google/android/material/bottomappbar/a;
.super Lwb/f;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field private k:F

.field private l:F

.field private m:F

.field private n:F

.field private o:F

.field private p:F


# virtual methods
.method public c(FFFLwb/m;)V
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v9, p4

    .line 6
    .line 7
    iget v2, v0, Lcom/google/android/material/bottomappbar/a;->m:F

    .line 8
    .line 9
    const/4 v10, 0x0

    .line 10
    cmpl-float v3, v2, v10

    .line 11
    .line 12
    if-nez v3, :cond_0

    .line 13
    .line 14
    invoke-virtual {v9, v1, v10}, Lwb/m;->m(FF)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget v3, v0, Lcom/google/android/material/bottomappbar/a;->l:F

    .line 19
    .line 20
    const/high16 v11, 0x40000000    # 2.0f

    .line 21
    .line 22
    mul-float/2addr v3, v11

    .line 23
    add-float/2addr v3, v2

    .line 24
    div-float v12, v3, v11

    .line 25
    .line 26
    iget v3, v0, Lcom/google/android/material/bottomappbar/a;->k:F

    .line 27
    .line 28
    mul-float v13, p3, v3

    .line 29
    .line 30
    iget v3, v0, Lcom/google/android/material/bottomappbar/a;->o:F

    .line 31
    .line 32
    add-float v14, p2, v3

    .line 33
    .line 34
    iget v3, v0, Lcom/google/android/material/bottomappbar/a;->n:F

    .line 35
    .line 36
    mul-float v3, v3, p3

    .line 37
    .line 38
    const/high16 v4, 0x3f800000    # 1.0f

    .line 39
    .line 40
    sub-float v5, v4, p3

    .line 41
    .line 42
    mul-float/2addr v5, v12

    .line 43
    add-float/2addr v3, v5

    .line 44
    div-float v5, v3, v12

    .line 45
    .line 46
    cmpl-float v4, v5, v4

    .line 47
    .line 48
    if-ltz v4, :cond_1

    .line 49
    .line 50
    invoke-virtual {v9, v1, v10}, Lwb/m;->m(FF)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_1
    iget v4, v0, Lcom/google/android/material/bottomappbar/a;->p:F

    .line 55
    .line 56
    mul-float v15, v4, p3

    .line 57
    .line 58
    const/high16 v5, -0x40800000    # -1.0f

    .line 59
    .line 60
    cmpl-float v5, v4, v5

    .line 61
    .line 62
    if-eqz v5, :cond_3

    .line 63
    .line 64
    mul-float/2addr v4, v11

    .line 65
    sub-float/2addr v4, v2

    .line 66
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    const v4, 0x3dcccccd    # 0.1f

    .line 71
    .line 72
    .line 73
    cmpg-float v2, v2, v4

    .line 74
    .line 75
    if-gez v2, :cond_2

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_2
    const/4 v2, 0x0

    .line 79
    goto :goto_1

    .line 80
    :cond_3
    :goto_0
    const/4 v2, 0x1

    .line 81
    :goto_1
    move/from16 v16, v2

    .line 82
    .line 83
    if-nez v16, :cond_4

    .line 84
    .line 85
    const/high16 v2, 0x3fe00000    # 1.75f

    .line 86
    .line 87
    move/from16 v17, v10

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_4
    move/from16 v17, v3

    .line 91
    .line 92
    move v2, v10

    .line 93
    :goto_2
    add-float v3, v12, v13

    .line 94
    .line 95
    mul-float/2addr v3, v3

    .line 96
    add-float v4, v17, v13

    .line 97
    .line 98
    mul-float v5, v4, v4

    .line 99
    .line 100
    sub-float/2addr v3, v5

    .line 101
    float-to-double v5, v3

    .line 102
    invoke-static {v5, v6}, Ljava/lang/Math;->sqrt(D)D

    .line 103
    .line 104
    .line 105
    move-result-wide v5

    .line 106
    double-to-float v3, v5

    .line 107
    sub-float v5, v14, v3

    .line 108
    .line 109
    add-float v18, v14, v3

    .line 110
    .line 111
    div-float/2addr v3, v4

    .line 112
    float-to-double v3, v3

    .line 113
    invoke-static {v3, v4}, Ljava/lang/Math;->atan(D)D

    .line 114
    .line 115
    .line 116
    move-result-wide v3

    .line 117
    invoke-static {v3, v4}, Ljava/lang/Math;->toDegrees(D)D

    .line 118
    .line 119
    .line 120
    move-result-wide v3

    .line 121
    double-to-float v8, v3

    .line 122
    const/high16 v3, 0x42b40000    # 90.0f

    .line 123
    .line 124
    sub-float/2addr v3, v8

    .line 125
    add-float v19, v3, v2

    .line 126
    .line 127
    invoke-virtual {v9, v5, v10}, Lwb/m;->m(FF)V

    .line 128
    .line 129
    .line 130
    sub-float v3, v5, v13

    .line 131
    .line 132
    const/4 v4, 0x0

    .line 133
    add-float/2addr v5, v13

    .line 134
    mul-float v20, v13, v11

    .line 135
    .line 136
    const/high16 v7, 0x43870000    # 270.0f

    .line 137
    .line 138
    move-object/from16 v2, p4

    .line 139
    .line 140
    move/from16 v6, v20

    .line 141
    .line 142
    move/from16 v21, v8

    .line 143
    .line 144
    invoke-virtual/range {v2 .. v8}, Lwb/m;->a(FFFFFF)V

    .line 145
    .line 146
    .line 147
    const/high16 v2, 0x43340000    # 180.0f

    .line 148
    .line 149
    if-eqz v16, :cond_5

    .line 150
    .line 151
    sub-float v3, v14, v12

    .line 152
    .line 153
    neg-float v4, v12

    .line 154
    sub-float v4, v4, v17

    .line 155
    .line 156
    add-float v5, v14, v12

    .line 157
    .line 158
    sub-float v6, v12, v17

    .line 159
    .line 160
    sub-float v7, v2, v19

    .line 161
    .line 162
    mul-float v19, v19, v11

    .line 163
    .line 164
    sub-float v8, v19, v2

    .line 165
    .line 166
    move-object/from16 v2, p4

    .line 167
    .line 168
    invoke-virtual/range {v2 .. v8}, Lwb/m;->a(FFFFFF)V

    .line 169
    .line 170
    .line 171
    goto :goto_3

    .line 172
    :cond_5
    iget v3, v0, Lcom/google/android/material/bottomappbar/a;->l:F

    .line 173
    .line 174
    mul-float v16, v15, v11

    .line 175
    .line 176
    add-float v4, v3, v16

    .line 177
    .line 178
    sub-float v5, v14, v12

    .line 179
    .line 180
    add-float v6, v15, v3

    .line 181
    .line 182
    neg-float v6, v6

    .line 183
    add-float v7, v5, v4

    .line 184
    .line 185
    add-float v8, v3, v15

    .line 186
    .line 187
    sub-float v17, v2, v19

    .line 188
    .line 189
    mul-float v3, v19, v11

    .line 190
    .line 191
    sub-float/2addr v3, v2

    .line 192
    div-float v22, v3, v11

    .line 193
    .line 194
    move-object/from16 v2, p4

    .line 195
    .line 196
    move v3, v5

    .line 197
    move v4, v6

    .line 198
    move v5, v7

    .line 199
    move v6, v8

    .line 200
    move/from16 v7, v17

    .line 201
    .line 202
    move/from16 v8, v22

    .line 203
    .line 204
    invoke-virtual/range {v2 .. v8}, Lwb/m;->a(FFFFFF)V

    .line 205
    .line 206
    .line 207
    add-float v5, v14, v12

    .line 208
    .line 209
    iget v2, v0, Lcom/google/android/material/bottomappbar/a;->l:F

    .line 210
    .line 211
    div-float v3, v2, v11

    .line 212
    .line 213
    add-float/2addr v3, v15

    .line 214
    sub-float v3, v5, v3

    .line 215
    .line 216
    add-float/2addr v2, v15

    .line 217
    invoke-virtual {v9, v3, v2}, Lwb/m;->m(FF)V

    .line 218
    .line 219
    .line 220
    iget v2, v0, Lcom/google/android/material/bottomappbar/a;->l:F

    .line 221
    .line 222
    add-float v16, v16, v2

    .line 223
    .line 224
    sub-float v3, v5, v16

    .line 225
    .line 226
    add-float v4, v15, v2

    .line 227
    .line 228
    neg-float v4, v4

    .line 229
    add-float v6, v2, v15

    .line 230
    .line 231
    const/high16 v7, 0x42b40000    # 90.0f

    .line 232
    .line 233
    const/high16 v2, -0x3d4c0000    # -90.0f

    .line 234
    .line 235
    add-float v8, v19, v2

    .line 236
    .line 237
    move-object/from16 v2, p4

    .line 238
    .line 239
    invoke-virtual/range {v2 .. v8}, Lwb/m;->a(FFFFFF)V

    .line 240
    .line 241
    .line 242
    :goto_3
    sub-float v3, v18, v13

    .line 243
    .line 244
    const/4 v4, 0x0

    .line 245
    add-float v5, v18, v13

    .line 246
    .line 247
    const/high16 v2, 0x43870000    # 270.0f

    .line 248
    .line 249
    sub-float v7, v2, v21

    .line 250
    .line 251
    move-object/from16 v2, p4

    .line 252
    .line 253
    move/from16 v6, v20

    .line 254
    .line 255
    move/from16 v8, v21

    .line 256
    .line 257
    invoke-virtual/range {v2 .. v8}, Lwb/m;->a(FFFFFF)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {v9, v1, v10}, Lwb/m;->m(FF)V

    .line 261
    .line 262
    .line 263
    return-void
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
.end method

.method d()F
    .locals 1

    iget v0, p0, Lcom/google/android/material/bottomappbar/a;->n:F

    return v0
.end method

.method public e()F
    .locals 1

    iget v0, p0, Lcom/google/android/material/bottomappbar/a;->p:F

    return v0
.end method

.method f()F
    .locals 1

    iget v0, p0, Lcom/google/android/material/bottomappbar/a;->l:F

    return v0
.end method

.method i()F
    .locals 1

    iget v0, p0, Lcom/google/android/material/bottomappbar/a;->k:F

    return v0
.end method

.method public j()F
    .locals 1

    iget v0, p0, Lcom/google/android/material/bottomappbar/a;->m:F

    return v0
.end method

.method k(F)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpg-float v0, p1, v0

    .line 3
    .line 4
    if-ltz v0, :cond_0

    .line 5
    .line 6
    iput p1, p0, Lcom/google/android/material/bottomappbar/a;->n:F

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 10
    .line 11
    const-string v0, "cradleVerticalOffset must be positive."

    .line 12
    .line 13
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    throw p1
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
.end method

.method public l(F)V
    .locals 0

    iput p1, p0, Lcom/google/android/material/bottomappbar/a;->p:F

    return-void
.end method

.method m(F)V
    .locals 0

    iput p1, p0, Lcom/google/android/material/bottomappbar/a;->l:F

    return-void
.end method

.method n(F)V
    .locals 0

    iput p1, p0, Lcom/google/android/material/bottomappbar/a;->k:F

    return-void
.end method

.method public o(F)V
    .locals 0

    iput p1, p0, Lcom/google/android/material/bottomappbar/a;->m:F

    return-void
.end method

.method q(F)V
    .locals 0

    iput p1, p0, Lcom/google/android/material/bottomappbar/a;->o:F

    return-void
.end method
