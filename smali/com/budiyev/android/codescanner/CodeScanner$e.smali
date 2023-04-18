.class final Lcom/budiyev/android/codescanner/CodeScanner$e;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/budiyev/android/codescanner/CodeScanner;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "e"
.end annotation


# instance fields
.field private final k:I

.field private final l:I

.field final synthetic m:Lcom/budiyev/android/codescanner/CodeScanner;


# direct methods
.method public constructor <init>(Lcom/budiyev/android/codescanner/CodeScanner;II)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/budiyev/android/codescanner/CodeScanner$e;->m:Lcom/budiyev/android/codescanner/CodeScanner;

    .line 2
    .line 3
    const-string p1, "cs-init"

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iput p2, p0, Lcom/budiyev/android/codescanner/CodeScanner$e;->k:I

    .line 9
    .line 10
    iput p3, p0, Lcom/budiyev/android/codescanner/CodeScanner$e;->l:I

    .line 11
    .line 12
    return-void
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
.end method

.method private a()V
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    new-instance v4, Landroid/hardware/Camera$CameraInfo;

    .line 4
    .line 5
    invoke-direct {v4}, Landroid/hardware/Camera$CameraInfo;-><init>()V

    .line 6
    .line 7
    .line 8
    iget-object v0, v1, Lcom/budiyev/android/codescanner/CodeScanner$e;->m:Lcom/budiyev/android/codescanner/CodeScanner;

    .line 9
    .line 10
    invoke-static {v0}, Lcom/budiyev/android/codescanner/CodeScanner;->s(Lcom/budiyev/android/codescanner/CodeScanner;)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v12, 0x1

    .line 15
    const/4 v13, 0x0

    .line 16
    const/4 v2, -0x1

    .line 17
    if-eq v0, v2, :cond_1

    .line 18
    .line 19
    const/4 v3, -0x2

    .line 20
    if-ne v0, v3, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-static {v0}, Landroid/hardware/Camera;->open(I)Landroid/hardware/Camera;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-static {v0, v4}, Landroid/hardware/Camera;->getCameraInfo(ILandroid/hardware/Camera$CameraInfo;)V

    .line 28
    .line 29
    .line 30
    move-object v3, v2

    .line 31
    goto :goto_4

    .line 32
    :cond_1
    :goto_0
    invoke-static {}, Landroid/hardware/Camera;->getNumberOfCameras()I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-ne v0, v2, :cond_2

    .line 37
    .line 38
    move v0, v13

    .line 39
    goto :goto_1

    .line 40
    :cond_2
    move v0, v12

    .line 41
    :goto_1
    move v2, v13

    .line 42
    :goto_2
    if-ge v2, v3, :cond_4

    .line 43
    .line 44
    invoke-static {v2, v4}, Landroid/hardware/Camera;->getCameraInfo(ILandroid/hardware/Camera$CameraInfo;)V

    .line 45
    .line 46
    .line 47
    iget v5, v4, Landroid/hardware/Camera$CameraInfo;->facing:I

    .line 48
    .line 49
    if-ne v5, v0, :cond_3

    .line 50
    .line 51
    invoke-static {v2}, Landroid/hardware/Camera;->open(I)Landroid/hardware/Camera;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    iget-object v3, v1, Lcom/budiyev/android/codescanner/CodeScanner$e;->m:Lcom/budiyev/android/codescanner/CodeScanner;

    .line 56
    .line 57
    invoke-static {v3, v2}, Lcom/budiyev/android/codescanner/CodeScanner;->t(Lcom/budiyev/android/codescanner/CodeScanner;I)I

    .line 58
    .line 59
    .line 60
    goto :goto_3

    .line 61
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_4
    const/4 v0, 0x0

    .line 65
    :goto_3
    move-object v3, v0

    .line 66
    :goto_4
    if-eqz v3, :cond_11

    .line 67
    .line 68
    invoke-virtual {v3}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    if-eqz v0, :cond_10

    .line 73
    .line 74
    iget-object v2, v1, Lcom/budiyev/android/codescanner/CodeScanner$e;->m:Lcom/budiyev/android/codescanner/CodeScanner;

    .line 75
    .line 76
    invoke-static {v2}, Lcom/budiyev/android/codescanner/CodeScanner;->u(Lcom/budiyev/android/codescanner/CodeScanner;)Landroid/content/Context;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    invoke-static {v2, v4}, Lcom/budiyev/android/codescanner/n;->k(Landroid/content/Context;Landroid/hardware/Camera$CameraInfo;)I

    .line 81
    .line 82
    .line 83
    move-result v15

    .line 84
    invoke-static {v15}, Lcom/budiyev/android/codescanner/n;->o(I)Z

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    if-eqz v2, :cond_5

    .line 89
    .line 90
    iget v5, v1, Lcom/budiyev/android/codescanner/CodeScanner$e;->l:I

    .line 91
    .line 92
    goto :goto_5

    .line 93
    :cond_5
    iget v5, v1, Lcom/budiyev/android/codescanner/CodeScanner$e;->k:I

    .line 94
    .line 95
    :goto_5
    if-eqz v2, :cond_6

    .line 96
    .line 97
    iget v6, v1, Lcom/budiyev/android/codescanner/CodeScanner$e;->k:I

    .line 98
    .line 99
    goto :goto_6

    .line 100
    :cond_6
    iget v6, v1, Lcom/budiyev/android/codescanner/CodeScanner$e;->l:I

    .line 101
    .line 102
    :goto_6
    invoke-static {v0, v5, v6}, Lcom/budiyev/android/codescanner/n;->j(Landroid/hardware/Camera$Parameters;II)Lcom/budiyev/android/codescanner/i;

    .line 103
    .line 104
    .line 105
    move-result-object v16

    .line 106
    invoke-virtual/range {v16 .. v16}, Lcom/budiyev/android/codescanner/i;->a()I

    .line 107
    .line 108
    .line 109
    move-result v9

    .line 110
    invoke-virtual/range {v16 .. v16}, Lcom/budiyev/android/codescanner/i;->b()I

    .line 111
    .line 112
    .line 113
    move-result v10

    .line 114
    invoke-virtual {v0, v9, v10}, Landroid/hardware/Camera$Parameters;->setPreviewSize(II)V

    .line 115
    .line 116
    .line 117
    const/16 v5, 0x11

    .line 118
    .line 119
    invoke-virtual {v0, v5}, Landroid/hardware/Camera$Parameters;->setPreviewFormat(I)V

    .line 120
    .line 121
    .line 122
    if-eqz v2, :cond_7

    .line 123
    .line 124
    move v5, v10

    .line 125
    goto :goto_7

    .line 126
    :cond_7
    move v5, v9

    .line 127
    :goto_7
    if-eqz v2, :cond_8

    .line 128
    .line 129
    move v2, v9

    .line 130
    goto :goto_8

    .line 131
    :cond_8
    move v2, v10

    .line 132
    :goto_8
    iget v6, v1, Lcom/budiyev/android/codescanner/CodeScanner$e;->k:I

    .line 133
    .line 134
    iget v7, v1, Lcom/budiyev/android/codescanner/CodeScanner$e;->l:I

    .line 135
    .line 136
    invoke-static {v5, v2, v6, v7}, Lcom/budiyev/android/codescanner/n;->n(IIII)Lcom/budiyev/android/codescanner/i;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    invoke-virtual {v0}, Landroid/hardware/Camera$Parameters;->getSupportedFocusModes()Ljava/util/List;

    .line 141
    .line 142
    .line 143
    move-result-object v5

    .line 144
    if-eqz v5, :cond_a

    .line 145
    .line 146
    const-string v6, "auto"

    .line 147
    .line 148
    invoke-interface {v5, v6}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v6

    .line 152
    if-nez v6, :cond_9

    .line 153
    .line 154
    const-string v6, "continuous-picture"

    .line 155
    .line 156
    invoke-interface {v5, v6}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result v5

    .line 160
    if-eqz v5, :cond_a

    .line 161
    .line 162
    :cond_9
    move/from16 v17, v12

    .line 163
    .line 164
    goto :goto_9

    .line 165
    :cond_a
    move/from16 v17, v13

    .line 166
    .line 167
    :goto_9
    if-nez v17, :cond_b

    .line 168
    .line 169
    iget-object v5, v1, Lcom/budiyev/android/codescanner/CodeScanner$e;->m:Lcom/budiyev/android/codescanner/CodeScanner;

    .line 170
    .line 171
    invoke-static {v5, v13}, Lcom/budiyev/android/codescanner/CodeScanner;->w(Lcom/budiyev/android/codescanner/CodeScanner;Z)Z

    .line 172
    .line 173
    .line 174
    :cond_b
    new-instance v11, Lcom/budiyev/android/codescanner/i;

    .line 175
    .line 176
    iget v5, v1, Lcom/budiyev/android/codescanner/CodeScanner$e;->k:I

    .line 177
    .line 178
    iget v6, v1, Lcom/budiyev/android/codescanner/CodeScanner$e;->l:I

    .line 179
    .line 180
    invoke-direct {v11, v5, v6}, Lcom/budiyev/android/codescanner/i;-><init>(II)V

    .line 181
    .line 182
    .line 183
    if-eqz v17, :cond_c

    .line 184
    .line 185
    iget-object v5, v1, Lcom/budiyev/android/codescanner/CodeScanner$e;->m:Lcom/budiyev/android/codescanner/CodeScanner;

    .line 186
    .line 187
    invoke-static {v5}, Lcom/budiyev/android/codescanner/CodeScanner;->v(Lcom/budiyev/android/codescanner/CodeScanner;)Z

    .line 188
    .line 189
    .line 190
    move-result v5

    .line 191
    if-eqz v5, :cond_c

    .line 192
    .line 193
    iget-object v5, v1, Lcom/budiyev/android/codescanner/CodeScanner$e;->m:Lcom/budiyev/android/codescanner/CodeScanner;

    .line 194
    .line 195
    invoke-static {v5}, Lcom/budiyev/android/codescanner/CodeScanner;->x(Lcom/budiyev/android/codescanner/CodeScanner;)Lcom/budiyev/android/codescanner/a;

    .line 196
    .line 197
    .line 198
    move-result-object v5

    .line 199
    invoke-static {v0, v5}, Lcom/budiyev/android/codescanner/n;->r(Landroid/hardware/Camera$Parameters;Lcom/budiyev/android/codescanner/a;)V

    .line 200
    .line 201
    .line 202
    iget-object v5, v1, Lcom/budiyev/android/codescanner/CodeScanner$e;->m:Lcom/budiyev/android/codescanner/CodeScanner;

    .line 203
    .line 204
    invoke-static {v5}, Lcom/budiyev/android/codescanner/CodeScanner;->n(Lcom/budiyev/android/codescanner/CodeScanner;)Lcom/budiyev/android/codescanner/CodeScannerView;

    .line 205
    .line 206
    .line 207
    move-result-object v5

    .line 208
    invoke-virtual {v5}, Lcom/budiyev/android/codescanner/CodeScannerView;->getFrameRect()Lcom/budiyev/android/codescanner/l;

    .line 209
    .line 210
    .line 211
    move-result-object v6

    .line 212
    if-eqz v6, :cond_c

    .line 213
    .line 214
    move-object v5, v0

    .line 215
    move-object v7, v2

    .line 216
    move-object v8, v11

    .line 217
    move-object/from16 v18, v11

    .line 218
    .line 219
    move v11, v15

    .line 220
    invoke-static/range {v5 .. v11}, Lcom/budiyev/android/codescanner/n;->b(Landroid/hardware/Camera$Parameters;Lcom/budiyev/android/codescanner/l;Lcom/budiyev/android/codescanner/i;Lcom/budiyev/android/codescanner/i;III)V

    .line 221
    .line 222
    .line 223
    goto :goto_a

    .line 224
    :cond_c
    move-object/from16 v18, v11

    .line 225
    .line 226
    :goto_a
    invoke-virtual {v0}, Landroid/hardware/Camera$Parameters;->getSupportedFlashModes()Ljava/util/List;

    .line 227
    .line 228
    .line 229
    move-result-object v5

    .line 230
    if-eqz v5, :cond_d

    .line 231
    .line 232
    const-string v6, "torch"

    .line 233
    .line 234
    invoke-interface {v5, v6}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    move-result v5

    .line 238
    if-eqz v5, :cond_d

    .line 239
    .line 240
    move v11, v12

    .line 241
    goto :goto_b

    .line 242
    :cond_d
    move v11, v13

    .line 243
    :goto_b
    if-nez v11, :cond_e

    .line 244
    .line 245
    iget-object v5, v1, Lcom/budiyev/android/codescanner/CodeScanner$e;->m:Lcom/budiyev/android/codescanner/CodeScanner;

    .line 246
    .line 247
    invoke-static {v5, v13}, Lcom/budiyev/android/codescanner/CodeScanner;->y(Lcom/budiyev/android/codescanner/CodeScanner;Z)Z

    .line 248
    .line 249
    .line 250
    :cond_e
    iget-object v5, v1, Lcom/budiyev/android/codescanner/CodeScanner$e;->m:Lcom/budiyev/android/codescanner/CodeScanner;

    .line 251
    .line 252
    invoke-static {v5}, Lcom/budiyev/android/codescanner/CodeScanner;->z(Lcom/budiyev/android/codescanner/CodeScanner;)I

    .line 253
    .line 254
    .line 255
    move-result v5

    .line 256
    if-eqz v5, :cond_f

    .line 257
    .line 258
    invoke-static {v0, v5}, Lcom/budiyev/android/codescanner/n;->t(Landroid/hardware/Camera$Parameters;I)V

    .line 259
    .line 260
    .line 261
    :cond_f
    invoke-static {v0}, Lcom/budiyev/android/codescanner/n;->e(Landroid/hardware/Camera$Parameters;)V

    .line 262
    .line 263
    .line 264
    invoke-static {v0}, Lcom/budiyev/android/codescanner/n;->f(Landroid/hardware/Camera$Parameters;)V

    .line 265
    .line 266
    .line 267
    invoke-static {v0}, Lcom/budiyev/android/codescanner/n;->g(Landroid/hardware/Camera$Parameters;)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {v3, v0}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V

    .line 271
    .line 272
    .line 273
    invoke-virtual {v3, v15}, Landroid/hardware/Camera;->setDisplayOrientation(I)V

    .line 274
    .line 275
    .line 276
    iget-object v0, v1, Lcom/budiyev/android/codescanner/CodeScanner$e;->m:Lcom/budiyev/android/codescanner/CodeScanner;

    .line 277
    .line 278
    invoke-static {v0}, Lcom/budiyev/android/codescanner/CodeScanner;->L(Lcom/budiyev/android/codescanner/CodeScanner;)Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v19

    .line 282
    monitor-enter v19

    .line 283
    :try_start_0
    new-instance v0, Lcom/budiyev/android/codescanner/f;

    .line 284
    .line 285
    iget-object v5, v1, Lcom/budiyev/android/codescanner/CodeScanner$e;->m:Lcom/budiyev/android/codescanner/CodeScanner;

    .line 286
    .line 287
    invoke-static {v5}, Lcom/budiyev/android/codescanner/CodeScanner;->A(Lcom/budiyev/android/codescanner/CodeScanner;)Lcom/budiyev/android/codescanner/CodeScanner$b;

    .line 288
    .line 289
    .line 290
    move-result-object v5

    .line 291
    iget-object v6, v1, Lcom/budiyev/android/codescanner/CodeScanner$e;->m:Lcom/budiyev/android/codescanner/CodeScanner;

    .line 292
    .line 293
    invoke-static {v6}, Lcom/budiyev/android/codescanner/CodeScanner;->B(Lcom/budiyev/android/codescanner/CodeScanner;)Lcom/budiyev/android/codescanner/CodeScanner$c;

    .line 294
    .line 295
    .line 296
    move-result-object v6

    .line 297
    iget-object v7, v1, Lcom/budiyev/android/codescanner/CodeScanner$e;->m:Lcom/budiyev/android/codescanner/CodeScanner;

    .line 298
    .line 299
    invoke-static {v7}, Lcom/budiyev/android/codescanner/CodeScanner;->C(Lcom/budiyev/android/codescanner/CodeScanner;)Ljava/util/List;

    .line 300
    .line 301
    .line 302
    move-result-object v7

    .line 303
    iget-object v8, v1, Lcom/budiyev/android/codescanner/CodeScanner$e;->m:Lcom/budiyev/android/codescanner/CodeScanner;

    .line 304
    .line 305
    invoke-static {v8}, Lcom/budiyev/android/codescanner/CodeScanner;->D(Lcom/budiyev/android/codescanner/CodeScanner;)Lcom/budiyev/android/codescanner/d;

    .line 306
    .line 307
    .line 308
    move-result-object v8

    .line 309
    invoke-direct {v0, v5, v6, v7, v8}, Lcom/budiyev/android/codescanner/f;-><init>(Lcom/budiyev/android/codescanner/f$c;Ljava/lang/Thread$UncaughtExceptionHandler;Ljava/util/List;Lcom/budiyev/android/codescanner/d;)V

    .line 310
    .line 311
    .line 312
    iget-object v10, v1, Lcom/budiyev/android/codescanner/CodeScanner$e;->m:Lcom/budiyev/android/codescanner/CodeScanner;

    .line 313
    .line 314
    new-instance v9, Lcom/budiyev/android/codescanner/g;

    .line 315
    .line 316
    move-object v8, v2

    .line 317
    move-object v2, v9

    .line 318
    move-object v5, v0

    .line 319
    move-object/from16 v6, v16

    .line 320
    .line 321
    move-object v7, v8

    .line 322
    move-object/from16 v20, v8

    .line 323
    .line 324
    move-object/from16 v8, v18

    .line 325
    .line 326
    move-object v14, v9

    .line 327
    move v9, v15

    .line 328
    move-object v15, v10

    .line 329
    move/from16 v10, v17

    .line 330
    .line 331
    invoke-direct/range {v2 .. v11}, Lcom/budiyev/android/codescanner/g;-><init>(Landroid/hardware/Camera;Landroid/hardware/Camera$CameraInfo;Lcom/budiyev/android/codescanner/f;Lcom/budiyev/android/codescanner/i;Lcom/budiyev/android/codescanner/i;Lcom/budiyev/android/codescanner/i;IZZ)V

    .line 332
    .line 333
    .line 334
    invoke-static {v15, v14}, Lcom/budiyev/android/codescanner/CodeScanner;->m(Lcom/budiyev/android/codescanner/CodeScanner;Lcom/budiyev/android/codescanner/g;)Lcom/budiyev/android/codescanner/g;

    .line 335
    .line 336
    .line 337
    invoke-virtual {v0}, Lcom/budiyev/android/codescanner/f;->m()V

    .line 338
    .line 339
    .line 340
    iget-object v0, v1, Lcom/budiyev/android/codescanner/CodeScanner$e;->m:Lcom/budiyev/android/codescanner/CodeScanner;

    .line 341
    .line 342
    invoke-static {v0, v13}, Lcom/budiyev/android/codescanner/CodeScanner;->E(Lcom/budiyev/android/codescanner/CodeScanner;Z)Z

    .line 343
    .line 344
    .line 345
    iget-object v0, v1, Lcom/budiyev/android/codescanner/CodeScanner$e;->m:Lcom/budiyev/android/codescanner/CodeScanner;

    .line 346
    .line 347
    invoke-static {v0, v12}, Lcom/budiyev/android/codescanner/CodeScanner;->f(Lcom/budiyev/android/codescanner/CodeScanner;Z)Z

    .line 348
    .line 349
    .line 350
    monitor-exit v19
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 351
    iget-object v0, v1, Lcom/budiyev/android/codescanner/CodeScanner$e;->m:Lcom/budiyev/android/codescanner/CodeScanner;

    .line 352
    .line 353
    invoke-static {v0}, Lcom/budiyev/android/codescanner/CodeScanner;->r(Lcom/budiyev/android/codescanner/CodeScanner;)Landroid/os/Handler;

    .line 354
    .line 355
    .line 356
    move-result-object v0

    .line 357
    new-instance v2, Lcom/budiyev/android/codescanner/CodeScanner$d;

    .line 358
    .line 359
    iget-object v3, v1, Lcom/budiyev/android/codescanner/CodeScanner$e;->m:Lcom/budiyev/android/codescanner/CodeScanner;

    .line 360
    .line 361
    move-object/from16 v4, v20

    .line 362
    .line 363
    const/4 v5, 0x0

    .line 364
    invoke-direct {v2, v3, v4, v5}, Lcom/budiyev/android/codescanner/CodeScanner$d;-><init>(Lcom/budiyev/android/codescanner/CodeScanner;Lcom/budiyev/android/codescanner/i;Lcom/budiyev/android/codescanner/CodeScanner$a;)V

    .line 365
    .line 366
    .line 367
    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 368
    .line 369
    .line 370
    return-void

    .line 371
    :catchall_0
    move-exception v0

    .line 372
    :try_start_1
    monitor-exit v19
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 373
    throw v0

    .line 374
    :cond_10
    new-instance v0, Lcom/budiyev/android/codescanner/c;

    .line 375
    .line 376
    const-string v2, "Unable to configure camera"

    .line 377
    .line 378
    invoke-direct {v0, v2}, Lcom/budiyev/android/codescanner/c;-><init>(Ljava/lang/String;)V

    .line 379
    .line 380
    .line 381
    throw v0

    .line 382
    :cond_11
    new-instance v0, Lcom/budiyev/android/codescanner/c;

    .line 383
    .line 384
    const-string v2, "Unable to access camera"

    .line 385
    .line 386
    invoke-direct {v0, v2}, Lcom/budiyev/android/codescanner/c;-><init>(Ljava/lang/String;)V

    .line 387
    .line 388
    .line 389
    throw v0
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


# virtual methods
.method public run()V
    .locals 1

    .line 1
    const/16 v0, 0xa

    .line 2
    .line 3
    invoke-static {v0}, Landroid/os/Process;->setThreadPriority(I)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/budiyev/android/codescanner/CodeScanner$e;->a()V

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
