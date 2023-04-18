.class public Lcom/facebook/react/uimanager/MatrixMathHelper;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/uimanager/MatrixMathHelper$MatrixDecompositionContext;
    }
.end annotation


# static fields
.field private static final EPSILON:D = 1.0E-5


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static applyPerspective([DD)V
    .locals 2

    const-wide/high16 v0, -0x4010000000000000L    # -1.0

    div-double/2addr v0, p1

    const/16 p1, 0xb

    aput-wide v0, p0, p1

    return-void
.end method

.method public static applyRotateX([DD)V
    .locals 3

    .line 1
    const/4 v0, 0x5

    .line 2
    invoke-static {p1, p2}, Ljava/lang/Math;->cos(D)D

    .line 3
    .line 4
    .line 5
    move-result-wide v1

    .line 6
    aput-wide v1, p0, v0

    .line 7
    .line 8
    const/4 v0, 0x6

    .line 9
    invoke-static {p1, p2}, Ljava/lang/Math;->sin(D)D

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    aput-wide v1, p0, v0

    .line 14
    .line 15
    invoke-static {p1, p2}, Ljava/lang/Math;->sin(D)D

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    neg-double v0, v0

    .line 20
    const/16 v2, 0x9

    .line 21
    .line 22
    aput-wide v0, p0, v2

    .line 23
    .line 24
    const/16 v0, 0xa

    .line 25
    .line 26
    invoke-static {p1, p2}, Ljava/lang/Math;->cos(D)D

    .line 27
    .line 28
    .line 29
    move-result-wide p1

    .line 30
    aput-wide p1, p0, v0

    .line 31
    .line 32
    return-void
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
.end method

.method public static applyRotateY([DD)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p1, p2}, Ljava/lang/Math;->cos(D)D

    .line 3
    .line 4
    .line 5
    move-result-wide v1

    .line 6
    aput-wide v1, p0, v0

    .line 7
    .line 8
    invoke-static {p1, p2}, Ljava/lang/Math;->sin(D)D

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    neg-double v0, v0

    .line 13
    const/4 v2, 0x2

    .line 14
    aput-wide v0, p0, v2

    .line 15
    .line 16
    const/16 v0, 0x8

    .line 17
    .line 18
    invoke-static {p1, p2}, Ljava/lang/Math;->sin(D)D

    .line 19
    .line 20
    .line 21
    move-result-wide v1

    .line 22
    aput-wide v1, p0, v0

    .line 23
    .line 24
    const/16 v0, 0xa

    .line 25
    .line 26
    invoke-static {p1, p2}, Ljava/lang/Math;->cos(D)D

    .line 27
    .line 28
    .line 29
    move-result-wide p1

    .line 30
    aput-wide p1, p0, v0

    .line 31
    .line 32
    return-void
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
.end method

.method public static applyRotateZ([DD)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p1, p2}, Ljava/lang/Math;->cos(D)D

    .line 3
    .line 4
    .line 5
    move-result-wide v1

    .line 6
    aput-wide v1, p0, v0

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    invoke-static {p1, p2}, Ljava/lang/Math;->sin(D)D

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    aput-wide v1, p0, v0

    .line 14
    .line 15
    invoke-static {p1, p2}, Ljava/lang/Math;->sin(D)D

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    neg-double v0, v0

    .line 20
    const/4 v2, 0x4

    .line 21
    aput-wide v0, p0, v2

    .line 22
    .line 23
    const/4 v0, 0x5

    .line 24
    invoke-static {p1, p2}, Ljava/lang/Math;->cos(D)D

    .line 25
    .line 26
    .line 27
    move-result-wide p1

    .line 28
    aput-wide p1, p0, v0

    .line 29
    .line 30
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
.end method

.method public static applyScaleX([DD)V
    .locals 1

    const/4 v0, 0x0

    aput-wide p1, p0, v0

    return-void
.end method

.method public static applyScaleY([DD)V
    .locals 1

    const/4 v0, 0x5

    aput-wide p1, p0, v0

    return-void
.end method

.method public static applyScaleZ([DD)V
    .locals 1

    const/16 v0, 0xa

    aput-wide p1, p0, v0

    return-void
.end method

.method public static applySkewX([DD)V
    .locals 1

    const/4 v0, 0x4

    invoke-static {p1, p2}, Ljava/lang/Math;->tan(D)D

    move-result-wide p1

    aput-wide p1, p0, v0

    return-void
.end method

.method public static applySkewY([DD)V
    .locals 1

    const/4 v0, 0x1

    invoke-static {p1, p2}, Ljava/lang/Math;->tan(D)D

    move-result-wide p1

    aput-wide p1, p0, v0

    return-void
.end method

.method public static applyTranslate2D([DDD)V
    .locals 1

    .line 1
    const/16 v0, 0xc

    .line 2
    .line 3
    aput-wide p1, p0, v0

    .line 4
    .line 5
    const/16 p1, 0xd

    .line 6
    .line 7
    aput-wide p3, p0, p1

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
.end method

.method public static applyTranslate3D([DDDD)V
    .locals 1

    .line 1
    const/16 v0, 0xc

    .line 2
    .line 3
    aput-wide p1, p0, v0

    .line 4
    .line 5
    const/16 p1, 0xd

    .line 6
    .line 7
    aput-wide p3, p0, p1

    .line 8
    .line 9
    const/16 p1, 0xe

    .line 10
    .line 11
    aput-wide p5, p0, p1

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
.end method

.method public static createIdentityMatrix()[D
    .locals 1

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    new-array v0, v0, [D

    .line 4
    .line 5
    invoke-static {v0}, Lcom/facebook/react/uimanager/MatrixMathHelper;->resetIdentityMatrix([D)V

    .line 6
    .line 7
    .line 8
    return-object v0
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
.end method

.method public static decomposeMatrix([DLcom/facebook/react/uimanager/MatrixMathHelper$MatrixDecompositionContext;)V
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    array-length v2, v0

    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x1

    .line 8
    const/16 v5, 0x10

    .line 9
    .line 10
    if-ne v2, v5, :cond_0

    .line 11
    .line 12
    move v2, v4

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move v2, v3

    .line 15
    :goto_0
    invoke-static {v2}, Lc6/a;->a(Z)V

    .line 16
    .line 17
    .line 18
    iget-object v2, v1, Lcom/facebook/react/uimanager/MatrixMathHelper$MatrixDecompositionContext;->perspective:[D

    .line 19
    .line 20
    iget-object v6, v1, Lcom/facebook/react/uimanager/MatrixMathHelper$MatrixDecompositionContext;->scale:[D

    .line 21
    .line 22
    iget-object v7, v1, Lcom/facebook/react/uimanager/MatrixMathHelper$MatrixDecompositionContext;->skew:[D

    .line 23
    .line 24
    iget-object v8, v1, Lcom/facebook/react/uimanager/MatrixMathHelper$MatrixDecompositionContext;->translation:[D

    .line 25
    .line 26
    iget-object v1, v1, Lcom/facebook/react/uimanager/MatrixMathHelper$MatrixDecompositionContext;->rotationDegrees:[D

    .line 27
    .line 28
    const/16 v9, 0xf

    .line 29
    .line 30
    aget-wide v10, v0, v9

    .line 31
    .line 32
    invoke-static {v10, v11}, Lcom/facebook/react/uimanager/MatrixMathHelper;->isZero(D)Z

    .line 33
    .line 34
    .line 35
    move-result v10

    .line 36
    if-eqz v10, :cond_1

    .line 37
    .line 38
    return-void

    .line 39
    :cond_1
    const/4 v10, 0x2

    .line 40
    new-array v11, v10, [I

    .line 41
    .line 42
    fill-array-data v11, :array_0

    .line 43
    .line 44
    .line 45
    sget-object v12, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 46
    .line 47
    invoke-static {v12, v11}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v11

    .line 51
    check-cast v11, [[D

    .line 52
    .line 53
    new-array v5, v5, [D

    .line 54
    .line 55
    move v12, v3

    .line 56
    :goto_1
    const/4 v15, 0x4

    .line 57
    const/4 v13, 0x3

    .line 58
    if-ge v12, v15, :cond_4

    .line 59
    .line 60
    move v14, v3

    .line 61
    :goto_2
    if-ge v14, v15, :cond_3

    .line 62
    .line 63
    mul-int/lit8 v18, v12, 0x4

    .line 64
    .line 65
    add-int v18, v18, v14

    .line 66
    .line 67
    aget-wide v19, v0, v18

    .line 68
    .line 69
    aget-wide v21, v0, v9

    .line 70
    .line 71
    div-double v19, v19, v21

    .line 72
    .line 73
    aget-object v21, v11, v12

    .line 74
    .line 75
    aput-wide v19, v21, v14

    .line 76
    .line 77
    if-ne v14, v13, :cond_2

    .line 78
    .line 79
    const-wide/16 v19, 0x0

    .line 80
    .line 81
    :cond_2
    aput-wide v19, v5, v18

    .line 82
    .line 83
    add-int/lit8 v14, v14, 0x1

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_3
    add-int/lit8 v12, v12, 0x1

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_4
    const-wide/high16 v18, 0x3ff0000000000000L    # 1.0

    .line 90
    .line 91
    aput-wide v18, v5, v9

    .line 92
    .line 93
    invoke-static {v5}, Lcom/facebook/react/uimanager/MatrixMathHelper;->determinant([D)D

    .line 94
    .line 95
    .line 96
    move-result-wide v20

    .line 97
    invoke-static/range {v20 .. v21}, Lcom/facebook/react/uimanager/MatrixMathHelper;->isZero(D)Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    if-eqz v0, :cond_5

    .line 102
    .line 103
    return-void

    .line 104
    :cond_5
    aget-object v0, v11, v3

    .line 105
    .line 106
    aget-wide v20, v0, v13

    .line 107
    .line 108
    invoke-static/range {v20 .. v21}, Lcom/facebook/react/uimanager/MatrixMathHelper;->isZero(D)Z

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    if-eqz v0, :cond_7

    .line 113
    .line 114
    aget-object v0, v11, v4

    .line 115
    .line 116
    aget-wide v20, v0, v13

    .line 117
    .line 118
    invoke-static/range {v20 .. v21}, Lcom/facebook/react/uimanager/MatrixMathHelper;->isZero(D)Z

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    if-eqz v0, :cond_7

    .line 123
    .line 124
    aget-object v0, v11, v10

    .line 125
    .line 126
    aget-wide v20, v0, v13

    .line 127
    .line 128
    invoke-static/range {v20 .. v21}, Lcom/facebook/react/uimanager/MatrixMathHelper;->isZero(D)Z

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    if-nez v0, :cond_6

    .line 133
    .line 134
    goto :goto_3

    .line 135
    :cond_6
    const-wide/16 v16, 0x0

    .line 136
    .line 137
    aput-wide v16, v2, v10

    .line 138
    .line 139
    aput-wide v16, v2, v4

    .line 140
    .line 141
    aput-wide v16, v2, v3

    .line 142
    .line 143
    aput-wide v18, v2, v13

    .line 144
    .line 145
    goto :goto_4

    .line 146
    :cond_7
    :goto_3
    new-array v0, v15, [D

    .line 147
    .line 148
    aget-object v9, v11, v3

    .line 149
    .line 150
    aget-wide v14, v9, v13

    .line 151
    .line 152
    aput-wide v14, v0, v3

    .line 153
    .line 154
    aget-object v9, v11, v4

    .line 155
    .line 156
    aget-wide v14, v9, v13

    .line 157
    .line 158
    aput-wide v14, v0, v4

    .line 159
    .line 160
    aget-object v9, v11, v10

    .line 161
    .line 162
    aget-wide v14, v9, v13

    .line 163
    .line 164
    aput-wide v14, v0, v10

    .line 165
    .line 166
    aget-object v9, v11, v13

    .line 167
    .line 168
    aget-wide v14, v9, v13

    .line 169
    .line 170
    aput-wide v14, v0, v13

    .line 171
    .line 172
    invoke-static {v5}, Lcom/facebook/react/uimanager/MatrixMathHelper;->inverse([D)[D

    .line 173
    .line 174
    .line 175
    move-result-object v5

    .line 176
    invoke-static {v5}, Lcom/facebook/react/uimanager/MatrixMathHelper;->transpose([D)[D

    .line 177
    .line 178
    .line 179
    move-result-object v5

    .line 180
    invoke-static {v0, v5, v2}, Lcom/facebook/react/uimanager/MatrixMathHelper;->multiplyVectorByMatrix([D[D[D)V

    .line 181
    .line 182
    .line 183
    :goto_4
    move v0, v3

    .line 184
    :goto_5
    if-ge v0, v13, :cond_8

    .line 185
    .line 186
    aget-object v2, v11, v13

    .line 187
    .line 188
    aget-wide v14, v2, v0

    .line 189
    .line 190
    aput-wide v14, v8, v0

    .line 191
    .line 192
    add-int/lit8 v0, v0, 0x1

    .line 193
    .line 194
    goto :goto_5

    .line 195
    :cond_8
    new-array v0, v10, [I

    .line 196
    .line 197
    fill-array-data v0, :array_1

    .line 198
    .line 199
    .line 200
    sget-object v2, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 201
    .line 202
    invoke-static {v2, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    check-cast v0, [[D

    .line 207
    .line 208
    move v2, v3

    .line 209
    :goto_6
    if-ge v2, v13, :cond_9

    .line 210
    .line 211
    aget-object v5, v0, v2

    .line 212
    .line 213
    aget-object v8, v11, v2

    .line 214
    .line 215
    aget-wide v14, v8, v3

    .line 216
    .line 217
    aput-wide v14, v5, v3

    .line 218
    .line 219
    aget-wide v14, v8, v4

    .line 220
    .line 221
    aput-wide v14, v5, v4

    .line 222
    .line 223
    aget-wide v14, v8, v10

    .line 224
    .line 225
    aput-wide v14, v5, v10

    .line 226
    .line 227
    add-int/lit8 v2, v2, 0x1

    .line 228
    .line 229
    goto :goto_6

    .line 230
    :cond_9
    aget-object v2, v0, v3

    .line 231
    .line 232
    invoke-static {v2}, Lcom/facebook/react/uimanager/MatrixMathHelper;->v3Length([D)D

    .line 233
    .line 234
    .line 235
    move-result-wide v8

    .line 236
    aput-wide v8, v6, v3

    .line 237
    .line 238
    aget-object v2, v0, v3

    .line 239
    .line 240
    invoke-static {v2, v8, v9}, Lcom/facebook/react/uimanager/MatrixMathHelper;->v3Normalize([DD)[D

    .line 241
    .line 242
    .line 243
    move-result-object v2

    .line 244
    aput-object v2, v0, v3

    .line 245
    .line 246
    aget-object v5, v0, v4

    .line 247
    .line 248
    invoke-static {v2, v5}, Lcom/facebook/react/uimanager/MatrixMathHelper;->v3Dot([D[D)D

    .line 249
    .line 250
    .line 251
    move-result-wide v8

    .line 252
    aput-wide v8, v7, v3

    .line 253
    .line 254
    aget-object v18, v0, v4

    .line 255
    .line 256
    aget-object v19, v0, v3

    .line 257
    .line 258
    const-wide/high16 v20, 0x3ff0000000000000L    # 1.0

    .line 259
    .line 260
    neg-double v8, v8

    .line 261
    move-wide/from16 v22, v8

    .line 262
    .line 263
    invoke-static/range {v18 .. v23}, Lcom/facebook/react/uimanager/MatrixMathHelper;->v3Combine([D[DDD)[D

    .line 264
    .line 265
    .line 266
    move-result-object v2

    .line 267
    aput-object v2, v0, v4

    .line 268
    .line 269
    invoke-static {v2}, Lcom/facebook/react/uimanager/MatrixMathHelper;->v3Length([D)D

    .line 270
    .line 271
    .line 272
    move-result-wide v8

    .line 273
    aput-wide v8, v6, v4

    .line 274
    .line 275
    aget-object v2, v0, v4

    .line 276
    .line 277
    invoke-static {v2, v8, v9}, Lcom/facebook/react/uimanager/MatrixMathHelper;->v3Normalize([DD)[D

    .line 278
    .line 279
    .line 280
    move-result-object v2

    .line 281
    aput-object v2, v0, v4

    .line 282
    .line 283
    aget-wide v8, v7, v3

    .line 284
    .line 285
    aget-wide v11, v6, v4

    .line 286
    .line 287
    div-double/2addr v8, v11

    .line 288
    aput-wide v8, v7, v3

    .line 289
    .line 290
    aget-object v2, v0, v3

    .line 291
    .line 292
    aget-object v5, v0, v10

    .line 293
    .line 294
    invoke-static {v2, v5}, Lcom/facebook/react/uimanager/MatrixMathHelper;->v3Dot([D[D)D

    .line 295
    .line 296
    .line 297
    move-result-wide v8

    .line 298
    aput-wide v8, v7, v4

    .line 299
    .line 300
    aget-object v18, v0, v10

    .line 301
    .line 302
    aget-object v19, v0, v3

    .line 303
    .line 304
    neg-double v8, v8

    .line 305
    move-wide/from16 v22, v8

    .line 306
    .line 307
    invoke-static/range {v18 .. v23}, Lcom/facebook/react/uimanager/MatrixMathHelper;->v3Combine([D[DDD)[D

    .line 308
    .line 309
    .line 310
    move-result-object v2

    .line 311
    aput-object v2, v0, v10

    .line 312
    .line 313
    aget-object v5, v0, v4

    .line 314
    .line 315
    invoke-static {v5, v2}, Lcom/facebook/react/uimanager/MatrixMathHelper;->v3Dot([D[D)D

    .line 316
    .line 317
    .line 318
    move-result-wide v8

    .line 319
    aput-wide v8, v7, v10

    .line 320
    .line 321
    aget-object v18, v0, v10

    .line 322
    .line 323
    aget-object v19, v0, v4

    .line 324
    .line 325
    neg-double v8, v8

    .line 326
    move-wide/from16 v22, v8

    .line 327
    .line 328
    invoke-static/range {v18 .. v23}, Lcom/facebook/react/uimanager/MatrixMathHelper;->v3Combine([D[DDD)[D

    .line 329
    .line 330
    .line 331
    move-result-object v2

    .line 332
    aput-object v2, v0, v10

    .line 333
    .line 334
    invoke-static {v2}, Lcom/facebook/react/uimanager/MatrixMathHelper;->v3Length([D)D

    .line 335
    .line 336
    .line 337
    move-result-wide v8

    .line 338
    aput-wide v8, v6, v10

    .line 339
    .line 340
    aget-object v2, v0, v10

    .line 341
    .line 342
    invoke-static {v2, v8, v9}, Lcom/facebook/react/uimanager/MatrixMathHelper;->v3Normalize([DD)[D

    .line 343
    .line 344
    .line 345
    move-result-object v2

    .line 346
    aput-object v2, v0, v10

    .line 347
    .line 348
    aget-wide v8, v7, v4

    .line 349
    .line 350
    aget-wide v11, v6, v10

    .line 351
    .line 352
    div-double/2addr v8, v11

    .line 353
    aput-wide v8, v7, v4

    .line 354
    .line 355
    aget-wide v8, v7, v10

    .line 356
    .line 357
    div-double/2addr v8, v11

    .line 358
    aput-wide v8, v7, v10

    .line 359
    .line 360
    aget-object v5, v0, v4

    .line 361
    .line 362
    invoke-static {v5, v2}, Lcom/facebook/react/uimanager/MatrixMathHelper;->v3Cross([D[D)[D

    .line 363
    .line 364
    .line 365
    move-result-object v2

    .line 366
    aget-object v5, v0, v3

    .line 367
    .line 368
    invoke-static {v5, v2}, Lcom/facebook/react/uimanager/MatrixMathHelper;->v3Dot([D[D)D

    .line 369
    .line 370
    .line 371
    move-result-wide v7

    .line 372
    const-wide/16 v11, 0x0

    .line 373
    .line 374
    cmpg-double v2, v7, v11

    .line 375
    .line 376
    if-gez v2, :cond_a

    .line 377
    .line 378
    move v2, v3

    .line 379
    :goto_7
    if-ge v2, v13, :cond_a

    .line 380
    .line 381
    aget-wide v7, v6, v2

    .line 382
    .line 383
    const-wide/high16 v11, -0x4010000000000000L    # -1.0

    .line 384
    .line 385
    mul-double/2addr v7, v11

    .line 386
    aput-wide v7, v6, v2

    .line 387
    .line 388
    aget-object v5, v0, v2

    .line 389
    .line 390
    aget-wide v7, v5, v3

    .line 391
    .line 392
    mul-double/2addr v7, v11

    .line 393
    aput-wide v7, v5, v3

    .line 394
    .line 395
    aget-wide v7, v5, v4

    .line 396
    .line 397
    mul-double/2addr v7, v11

    .line 398
    aput-wide v7, v5, v4

    .line 399
    .line 400
    aget-wide v7, v5, v10

    .line 401
    .line 402
    mul-double/2addr v7, v11

    .line 403
    aput-wide v7, v5, v10

    .line 404
    .line 405
    add-int/lit8 v2, v2, 0x1

    .line 406
    .line 407
    goto :goto_7

    .line 408
    :cond_a
    aget-object v2, v0, v10

    .line 409
    .line 410
    aget-wide v5, v2, v4

    .line 411
    .line 412
    aget-wide v7, v2, v10

    .line 413
    .line 414
    invoke-static {v5, v6, v7, v8}, Ljava/lang/Math;->atan2(DD)D

    .line 415
    .line 416
    .line 417
    move-result-wide v5

    .line 418
    neg-double v5, v5

    .line 419
    const-wide v7, 0x404ca5dc1a63c1f8L    # 57.29577951308232

    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    mul-double/2addr v5, v7

    .line 425
    invoke-static {v5, v6}, Lcom/facebook/react/uimanager/MatrixMathHelper;->roundTo3Places(D)D

    .line 426
    .line 427
    .line 428
    move-result-wide v5

    .line 429
    aput-wide v5, v1, v3

    .line 430
    .line 431
    aget-object v2, v0, v10

    .line 432
    .line 433
    aget-wide v5, v2, v3

    .line 434
    .line 435
    neg-double v5, v5

    .line 436
    aget-wide v11, v2, v4

    .line 437
    .line 438
    mul-double/2addr v11, v11

    .line 439
    aget-wide v13, v2, v10

    .line 440
    .line 441
    mul-double/2addr v13, v13

    .line 442
    add-double/2addr v11, v13

    .line 443
    invoke-static {v11, v12}, Ljava/lang/Math;->sqrt(D)D

    .line 444
    .line 445
    .line 446
    move-result-wide v11

    .line 447
    invoke-static {v5, v6, v11, v12}, Ljava/lang/Math;->atan2(DD)D

    .line 448
    .line 449
    .line 450
    move-result-wide v5

    .line 451
    neg-double v5, v5

    .line 452
    mul-double/2addr v5, v7

    .line 453
    invoke-static {v5, v6}, Lcom/facebook/react/uimanager/MatrixMathHelper;->roundTo3Places(D)D

    .line 454
    .line 455
    .line 456
    move-result-wide v5

    .line 457
    aput-wide v5, v1, v4

    .line 458
    .line 459
    aget-object v2, v0, v4

    .line 460
    .line 461
    aget-wide v4, v2, v3

    .line 462
    .line 463
    aget-object v0, v0, v3

    .line 464
    .line 465
    aget-wide v2, v0, v3

    .line 466
    .line 467
    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->atan2(DD)D

    .line 468
    .line 469
    .line 470
    move-result-wide v2

    .line 471
    neg-double v2, v2

    .line 472
    mul-double/2addr v2, v7

    .line 473
    invoke-static {v2, v3}, Lcom/facebook/react/uimanager/MatrixMathHelper;->roundTo3Places(D)D

    .line 474
    .line 475
    .line 476
    move-result-wide v2

    .line 477
    aput-wide v2, v1, v10

    .line 478
    .line 479
    return-void

    .line 480
    nop

    .line 481
    :array_0
    .array-data 4
        0x4
        0x4
    .end array-data

    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    :array_1
    .array-data 4
        0x3
        0x3
    .end array-data
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
.end method

.method public static degreesToRadians(D)D
    .locals 2

    const-wide v0, 0x400921fb54442d18L    # Math.PI

    mul-double/2addr p0, v0

    const-wide v0, 0x4066800000000000L    # 180.0

    div-double/2addr p0, v0

    return-wide p0
.end method

.method public static determinant([D)D
    .locals 48

    .line 1
    const/4 v0, 0x0

    .line 2
    aget-wide v0, p0, v0

    .line 3
    .line 4
    const/4 v2, 0x1

    .line 5
    aget-wide v2, p0, v2

    .line 6
    .line 7
    const/4 v4, 0x2

    .line 8
    aget-wide v4, p0, v4

    .line 9
    .line 10
    const/4 v6, 0x3

    .line 11
    aget-wide v6, p0, v6

    .line 12
    .line 13
    const/4 v8, 0x4

    .line 14
    aget-wide v8, p0, v8

    .line 15
    .line 16
    const/4 v10, 0x5

    .line 17
    aget-wide v10, p0, v10

    .line 18
    .line 19
    const/4 v12, 0x6

    .line 20
    aget-wide v12, p0, v12

    .line 21
    .line 22
    const/4 v14, 0x7

    .line 23
    aget-wide v14, p0, v14

    .line 24
    .line 25
    const/16 v16, 0x8

    .line 26
    .line 27
    aget-wide v16, p0, v16

    .line 28
    .line 29
    const/16 v18, 0x9

    .line 30
    .line 31
    aget-wide v18, p0, v18

    .line 32
    .line 33
    const/16 v20, 0xa

    .line 34
    .line 35
    aget-wide v20, p0, v20

    .line 36
    .line 37
    const/16 v22, 0xb

    .line 38
    .line 39
    aget-wide v22, p0, v22

    .line 40
    .line 41
    const/16 v24, 0xc

    .line 42
    .line 43
    aget-wide v24, p0, v24

    .line 44
    .line 45
    const/16 v26, 0xd

    .line 46
    .line 47
    aget-wide v26, p0, v26

    .line 48
    .line 49
    const/16 v28, 0xe

    .line 50
    .line 51
    aget-wide v28, p0, v28

    .line 52
    .line 53
    const/16 v30, 0xf

    .line 54
    .line 55
    aget-wide v30, p0, v30

    .line 56
    .line 57
    mul-double v32, v6, v12

    .line 58
    .line 59
    mul-double v34, v32, v18

    .line 60
    .line 61
    mul-double v34, v34, v24

    .line 62
    .line 63
    mul-double v36, v4, v14

    .line 64
    .line 65
    mul-double v38, v36, v18

    .line 66
    .line 67
    mul-double v38, v38, v24

    .line 68
    .line 69
    sub-double v34, v34, v38

    .line 70
    .line 71
    mul-double v38, v6, v10

    .line 72
    .line 73
    mul-double v40, v38, v20

    .line 74
    .line 75
    mul-double v40, v40, v24

    .line 76
    .line 77
    sub-double v34, v34, v40

    .line 78
    .line 79
    mul-double v40, v2, v14

    .line 80
    .line 81
    mul-double v42, v40, v20

    .line 82
    .line 83
    mul-double v42, v42, v24

    .line 84
    .line 85
    add-double v34, v34, v42

    .line 86
    .line 87
    mul-double v42, v4, v10

    .line 88
    .line 89
    mul-double v44, v42, v22

    .line 90
    .line 91
    mul-double v44, v44, v24

    .line 92
    .line 93
    add-double v34, v34, v44

    .line 94
    .line 95
    mul-double v44, v2, v12

    .line 96
    .line 97
    mul-double v46, v44, v22

    .line 98
    .line 99
    mul-double v46, v46, v24

    .line 100
    .line 101
    sub-double v34, v34, v46

    .line 102
    .line 103
    mul-double v32, v32, v16

    .line 104
    .line 105
    mul-double v32, v32, v26

    .line 106
    .line 107
    sub-double v34, v34, v32

    .line 108
    .line 109
    mul-double v36, v36, v16

    .line 110
    .line 111
    mul-double v36, v36, v26

    .line 112
    .line 113
    add-double v34, v34, v36

    .line 114
    .line 115
    mul-double/2addr v6, v8

    .line 116
    mul-double v24, v6, v20

    .line 117
    .line 118
    mul-double v24, v24, v26

    .line 119
    .line 120
    add-double v34, v34, v24

    .line 121
    .line 122
    mul-double/2addr v14, v0

    .line 123
    mul-double v24, v14, v20

    .line 124
    .line 125
    mul-double v24, v24, v26

    .line 126
    .line 127
    sub-double v34, v34, v24

    .line 128
    .line 129
    mul-double/2addr v4, v8

    .line 130
    mul-double v24, v4, v22

    .line 131
    .line 132
    mul-double v24, v24, v26

    .line 133
    .line 134
    sub-double v34, v34, v24

    .line 135
    .line 136
    mul-double/2addr v12, v0

    .line 137
    mul-double v24, v12, v22

    .line 138
    .line 139
    mul-double v24, v24, v26

    .line 140
    .line 141
    add-double v34, v34, v24

    .line 142
    .line 143
    mul-double v38, v38, v16

    .line 144
    .line 145
    mul-double v38, v38, v28

    .line 146
    .line 147
    add-double v34, v34, v38

    .line 148
    .line 149
    mul-double v40, v40, v16

    .line 150
    .line 151
    mul-double v40, v40, v28

    .line 152
    .line 153
    sub-double v34, v34, v40

    .line 154
    .line 155
    mul-double v6, v6, v18

    .line 156
    .line 157
    mul-double v6, v6, v28

    .line 158
    .line 159
    sub-double v34, v34, v6

    .line 160
    .line 161
    mul-double v14, v14, v18

    .line 162
    .line 163
    mul-double v14, v14, v28

    .line 164
    .line 165
    add-double v34, v34, v14

    .line 166
    .line 167
    mul-double/2addr v2, v8

    .line 168
    mul-double v6, v2, v22

    .line 169
    .line 170
    mul-double v6, v6, v28

    .line 171
    .line 172
    add-double v34, v34, v6

    .line 173
    .line 174
    mul-double/2addr v0, v10

    .line 175
    mul-double v22, v22, v0

    .line 176
    .line 177
    mul-double v22, v22, v28

    .line 178
    .line 179
    sub-double v34, v34, v22

    .line 180
    .line 181
    mul-double v42, v42, v16

    .line 182
    .line 183
    mul-double v42, v42, v30

    .line 184
    .line 185
    sub-double v34, v34, v42

    .line 186
    .line 187
    mul-double v44, v44, v16

    .line 188
    .line 189
    mul-double v44, v44, v30

    .line 190
    .line 191
    add-double v34, v34, v44

    .line 192
    .line 193
    mul-double v4, v4, v18

    .line 194
    .line 195
    mul-double v4, v4, v30

    .line 196
    .line 197
    add-double v34, v34, v4

    .line 198
    .line 199
    mul-double v12, v12, v18

    .line 200
    .line 201
    mul-double v12, v12, v30

    .line 202
    .line 203
    sub-double v34, v34, v12

    .line 204
    .line 205
    mul-double v2, v2, v20

    .line 206
    .line 207
    mul-double v2, v2, v30

    .line 208
    .line 209
    sub-double v34, v34, v2

    .line 210
    .line 211
    mul-double v0, v0, v20

    .line 212
    .line 213
    mul-double v0, v0, v30

    .line 214
    .line 215
    add-double v34, v34, v0

    .line 216
    .line 217
    return-wide v34
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
.end method

.method public static inverse([D)[D
    .locals 99

    .line 1
    invoke-static/range {p0 .. p0}, Lcom/facebook/react/uimanager/MatrixMathHelper;->determinant([D)D

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-static {v0, v1}, Lcom/facebook/react/uimanager/MatrixMathHelper;->isZero(D)Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const/4 v2, 0x0

    .line 13
    aget-wide v3, p0, v2

    .line 14
    .line 15
    const/4 v5, 0x1

    .line 16
    aget-wide v6, p0, v5

    .line 17
    .line 18
    const/4 v8, 0x2

    .line 19
    aget-wide v9, p0, v8

    .line 20
    .line 21
    const/4 v11, 0x3

    .line 22
    aget-wide v12, p0, v11

    .line 23
    .line 24
    const/4 v14, 0x4

    .line 25
    aget-wide v15, p0, v14

    .line 26
    .line 27
    const/16 v17, 0x5

    .line 28
    .line 29
    aget-wide v18, p0, v17

    .line 30
    .line 31
    const/16 v20, 0x6

    .line 32
    .line 33
    aget-wide v21, p0, v20

    .line 34
    .line 35
    const/16 v23, 0x7

    .line 36
    .line 37
    aget-wide v24, p0, v23

    .line 38
    .line 39
    const/16 v26, 0x8

    .line 40
    .line 41
    aget-wide v27, p0, v26

    .line 42
    .line 43
    const/16 v29, 0x9

    .line 44
    .line 45
    aget-wide v30, p0, v29

    .line 46
    .line 47
    const/16 v32, 0xa

    .line 48
    .line 49
    aget-wide v33, p0, v32

    .line 50
    .line 51
    const/16 v35, 0xb

    .line 52
    .line 53
    aget-wide v36, p0, v35

    .line 54
    .line 55
    const/16 v38, 0xc

    .line 56
    .line 57
    aget-wide v39, p0, v38

    .line 58
    .line 59
    const/16 v41, 0xd

    .line 60
    .line 61
    aget-wide v42, p0, v41

    .line 62
    .line 63
    const/16 v44, 0xe

    .line 64
    .line 65
    aget-wide v45, p0, v44

    .line 66
    .line 67
    const/16 v47, 0xf

    .line 68
    .line 69
    aget-wide v48, p0, v47

    .line 70
    .line 71
    const/16 v14, 0x10

    .line 72
    .line 73
    new-array v14, v14, [D

    .line 74
    .line 75
    mul-double v51, v21, v36

    .line 76
    .line 77
    mul-double v53, v51, v42

    .line 78
    .line 79
    mul-double v55, v24, v33

    .line 80
    .line 81
    mul-double v57, v55, v42

    .line 82
    .line 83
    sub-double v53, v53, v57

    .line 84
    .line 85
    mul-double v57, v24, v30

    .line 86
    .line 87
    mul-double v59, v57, v45

    .line 88
    .line 89
    add-double v53, v53, v59

    .line 90
    .line 91
    mul-double v59, v18, v36

    .line 92
    .line 93
    mul-double v61, v59, v45

    .line 94
    .line 95
    sub-double v53, v53, v61

    .line 96
    .line 97
    mul-double v61, v21, v30

    .line 98
    .line 99
    mul-double v63, v61, v48

    .line 100
    .line 101
    sub-double v53, v53, v63

    .line 102
    .line 103
    mul-double v63, v18, v33

    .line 104
    .line 105
    mul-double v65, v63, v48

    .line 106
    .line 107
    add-double v53, v53, v65

    .line 108
    .line 109
    div-double v53, v53, v0

    .line 110
    .line 111
    aput-wide v53, v14, v2

    .line 112
    .line 113
    mul-double v53, v12, v33

    .line 114
    .line 115
    mul-double v65, v53, v42

    .line 116
    .line 117
    mul-double v67, v9, v36

    .line 118
    .line 119
    mul-double v69, v67, v42

    .line 120
    .line 121
    sub-double v65, v65, v69

    .line 122
    .line 123
    mul-double v69, v12, v30

    .line 124
    .line 125
    mul-double v71, v69, v45

    .line 126
    .line 127
    sub-double v65, v65, v71

    .line 128
    .line 129
    mul-double v71, v6, v36

    .line 130
    .line 131
    mul-double v73, v71, v45

    .line 132
    .line 133
    add-double v65, v65, v73

    .line 134
    .line 135
    mul-double v73, v9, v30

    .line 136
    .line 137
    mul-double v75, v73, v48

    .line 138
    .line 139
    add-double v65, v65, v75

    .line 140
    .line 141
    mul-double v75, v6, v33

    .line 142
    .line 143
    mul-double v77, v75, v48

    .line 144
    .line 145
    sub-double v65, v65, v77

    .line 146
    .line 147
    div-double v65, v65, v0

    .line 148
    .line 149
    aput-wide v65, v14, v5

    .line 150
    .line 151
    mul-double v65, v9, v24

    .line 152
    .line 153
    mul-double v77, v65, v42

    .line 154
    .line 155
    mul-double v79, v12, v21

    .line 156
    .line 157
    mul-double v81, v79, v42

    .line 158
    .line 159
    sub-double v77, v77, v81

    .line 160
    .line 161
    mul-double v81, v12, v18

    .line 162
    .line 163
    mul-double v83, v81, v45

    .line 164
    .line 165
    add-double v77, v77, v83

    .line 166
    .line 167
    mul-double v83, v6, v24

    .line 168
    .line 169
    mul-double v85, v83, v45

    .line 170
    .line 171
    sub-double v77, v77, v85

    .line 172
    .line 173
    mul-double v85, v9, v18

    .line 174
    .line 175
    mul-double v87, v85, v48

    .line 176
    .line 177
    sub-double v77, v77, v87

    .line 178
    .line 179
    mul-double v87, v6, v21

    .line 180
    .line 181
    mul-double v89, v87, v48

    .line 182
    .line 183
    add-double v77, v77, v89

    .line 184
    .line 185
    div-double v77, v77, v0

    .line 186
    .line 187
    aput-wide v77, v14, v8

    .line 188
    .line 189
    mul-double v77, v79, v30

    .line 190
    .line 191
    mul-double v89, v65, v30

    .line 192
    .line 193
    sub-double v77, v77, v89

    .line 194
    .line 195
    mul-double v89, v81, v33

    .line 196
    .line 197
    sub-double v77, v77, v89

    .line 198
    .line 199
    mul-double v89, v83, v33

    .line 200
    .line 201
    add-double v77, v77, v89

    .line 202
    .line 203
    mul-double v89, v85, v36

    .line 204
    .line 205
    add-double v77, v77, v89

    .line 206
    .line 207
    mul-double v89, v87, v36

    .line 208
    .line 209
    sub-double v77, v77, v89

    .line 210
    .line 211
    div-double v77, v77, v0

    .line 212
    .line 213
    aput-wide v77, v14, v11

    .line 214
    .line 215
    mul-double v55, v55, v39

    .line 216
    .line 217
    mul-double v51, v51, v39

    .line 218
    .line 219
    sub-double v55, v55, v51

    .line 220
    .line 221
    mul-double v51, v24, v27

    .line 222
    .line 223
    mul-double v77, v51, v45

    .line 224
    .line 225
    sub-double v55, v55, v77

    .line 226
    .line 227
    mul-double v77, v15, v36

    .line 228
    .line 229
    mul-double v89, v77, v45

    .line 230
    .line 231
    add-double v55, v55, v89

    .line 232
    .line 233
    mul-double v89, v21, v27

    .line 234
    .line 235
    mul-double v91, v89, v48

    .line 236
    .line 237
    add-double v55, v55, v91

    .line 238
    .line 239
    mul-double v91, v15, v33

    .line 240
    .line 241
    mul-double v93, v91, v48

    .line 242
    .line 243
    sub-double v55, v55, v93

    .line 244
    .line 245
    div-double v55, v55, v0

    .line 246
    .line 247
    const/4 v2, 0x4

    .line 248
    aput-wide v55, v14, v2

    .line 249
    .line 250
    mul-double v67, v67, v39

    .line 251
    .line 252
    mul-double v53, v53, v39

    .line 253
    .line 254
    sub-double v67, v67, v53

    .line 255
    .line 256
    mul-double v53, v12, v27

    .line 257
    .line 258
    mul-double v55, v53, v45

    .line 259
    .line 260
    add-double v67, v67, v55

    .line 261
    .line 262
    mul-double v55, v3, v36

    .line 263
    .line 264
    mul-double v93, v55, v45

    .line 265
    .line 266
    sub-double v67, v67, v93

    .line 267
    .line 268
    mul-double v93, v9, v27

    .line 269
    .line 270
    mul-double v95, v93, v48

    .line 271
    .line 272
    sub-double v67, v67, v95

    .line 273
    .line 274
    mul-double v95, v3, v33

    .line 275
    .line 276
    mul-double v97, v95, v48

    .line 277
    .line 278
    add-double v67, v67, v97

    .line 279
    .line 280
    div-double v67, v67, v0

    .line 281
    .line 282
    aput-wide v67, v14, v17

    .line 283
    .line 284
    mul-double v67, v79, v39

    .line 285
    .line 286
    mul-double v97, v65, v39

    .line 287
    .line 288
    sub-double v67, v67, v97

    .line 289
    .line 290
    mul-double/2addr v12, v15

    .line 291
    mul-double v97, v12, v45

    .line 292
    .line 293
    sub-double v67, v67, v97

    .line 294
    .line 295
    mul-double v24, v24, v3

    .line 296
    .line 297
    mul-double v97, v24, v45

    .line 298
    .line 299
    add-double v67, v67, v97

    .line 300
    .line 301
    mul-double/2addr v9, v15

    .line 302
    mul-double v97, v9, v48

    .line 303
    .line 304
    add-double v67, v67, v97

    .line 305
    .line 306
    mul-double v21, v21, v3

    .line 307
    .line 308
    mul-double v97, v21, v48

    .line 309
    .line 310
    sub-double v67, v67, v97

    .line 311
    .line 312
    div-double v67, v67, v0

    .line 313
    .line 314
    aput-wide v67, v14, v20

    .line 315
    .line 316
    mul-double v65, v65, v27

    .line 317
    .line 318
    mul-double v79, v79, v27

    .line 319
    .line 320
    sub-double v65, v65, v79

    .line 321
    .line 322
    mul-double v67, v12, v33

    .line 323
    .line 324
    add-double v65, v65, v67

    .line 325
    .line 326
    mul-double v67, v24, v33

    .line 327
    .line 328
    sub-double v65, v65, v67

    .line 329
    .line 330
    mul-double v67, v9, v36

    .line 331
    .line 332
    sub-double v65, v65, v67

    .line 333
    .line 334
    mul-double v67, v21, v36

    .line 335
    .line 336
    add-double v65, v65, v67

    .line 337
    .line 338
    div-double v65, v65, v0

    .line 339
    .line 340
    aput-wide v65, v14, v23

    .line 341
    .line 342
    mul-double v59, v59, v39

    .line 343
    .line 344
    mul-double v57, v57, v39

    .line 345
    .line 346
    sub-double v59, v59, v57

    .line 347
    .line 348
    mul-double v51, v51, v42

    .line 349
    .line 350
    add-double v59, v59, v51

    .line 351
    .line 352
    mul-double v77, v77, v42

    .line 353
    .line 354
    sub-double v59, v59, v77

    .line 355
    .line 356
    mul-double v50, v18, v27

    .line 357
    .line 358
    mul-double v57, v50, v48

    .line 359
    .line 360
    sub-double v59, v59, v57

    .line 361
    .line 362
    mul-double v57, v15, v30

    .line 363
    .line 364
    mul-double v65, v57, v48

    .line 365
    .line 366
    add-double v59, v59, v65

    .line 367
    .line 368
    div-double v59, v59, v0

    .line 369
    .line 370
    aput-wide v59, v14, v26

    .line 371
    .line 372
    mul-double v69, v69, v39

    .line 373
    .line 374
    mul-double v71, v71, v39

    .line 375
    .line 376
    sub-double v69, v69, v71

    .line 377
    .line 378
    mul-double v53, v53, v42

    .line 379
    .line 380
    sub-double v69, v69, v53

    .line 381
    .line 382
    mul-double v55, v55, v42

    .line 383
    .line 384
    add-double v69, v69, v55

    .line 385
    .line 386
    mul-double v52, v6, v27

    .line 387
    .line 388
    mul-double v54, v52, v48

    .line 389
    .line 390
    add-double v69, v69, v54

    .line 391
    .line 392
    mul-double v54, v3, v30

    .line 393
    .line 394
    mul-double v59, v54, v48

    .line 395
    .line 396
    sub-double v69, v69, v59

    .line 397
    .line 398
    div-double v69, v69, v0

    .line 399
    .line 400
    aput-wide v69, v14, v29

    .line 401
    .line 402
    mul-double v59, v83, v39

    .line 403
    .line 404
    mul-double v65, v81, v39

    .line 405
    .line 406
    sub-double v59, v59, v65

    .line 407
    .line 408
    mul-double v65, v12, v42

    .line 409
    .line 410
    add-double v59, v59, v65

    .line 411
    .line 412
    mul-double v65, v24, v42

    .line 413
    .line 414
    sub-double v59, v59, v65

    .line 415
    .line 416
    mul-double/2addr v6, v15

    .line 417
    mul-double v15, v6, v48

    .line 418
    .line 419
    sub-double v59, v59, v15

    .line 420
    .line 421
    mul-double v3, v3, v18

    .line 422
    .line 423
    mul-double v48, v48, v3

    .line 424
    .line 425
    add-double v59, v59, v48

    .line 426
    .line 427
    div-double v59, v59, v0

    .line 428
    .line 429
    aput-wide v59, v14, v32

    .line 430
    .line 431
    mul-double v81, v81, v27

    .line 432
    .line 433
    mul-double v83, v83, v27

    .line 434
    .line 435
    sub-double v81, v81, v83

    .line 436
    .line 437
    mul-double v12, v12, v30

    .line 438
    .line 439
    sub-double v81, v81, v12

    .line 440
    .line 441
    mul-double v24, v24, v30

    .line 442
    .line 443
    add-double v81, v81, v24

    .line 444
    .line 445
    mul-double v11, v6, v36

    .line 446
    .line 447
    add-double v81, v81, v11

    .line 448
    .line 449
    mul-double v36, v36, v3

    .line 450
    .line 451
    sub-double v81, v81, v36

    .line 452
    .line 453
    div-double v81, v81, v0

    .line 454
    .line 455
    aput-wide v81, v14, v35

    .line 456
    .line 457
    mul-double v61, v61, v39

    .line 458
    .line 459
    mul-double v63, v63, v39

    .line 460
    .line 461
    sub-double v61, v61, v63

    .line 462
    .line 463
    mul-double v89, v89, v42

    .line 464
    .line 465
    sub-double v61, v61, v89

    .line 466
    .line 467
    mul-double v91, v91, v42

    .line 468
    .line 469
    add-double v61, v61, v91

    .line 470
    .line 471
    mul-double v50, v50, v45

    .line 472
    .line 473
    add-double v61, v61, v50

    .line 474
    .line 475
    mul-double v57, v57, v45

    .line 476
    .line 477
    sub-double v61, v61, v57

    .line 478
    .line 479
    div-double v61, v61, v0

    .line 480
    .line 481
    aput-wide v61, v14, v38

    .line 482
    .line 483
    mul-double v75, v75, v39

    .line 484
    .line 485
    mul-double v73, v73, v39

    .line 486
    .line 487
    sub-double v75, v75, v73

    .line 488
    .line 489
    mul-double v93, v93, v42

    .line 490
    .line 491
    add-double v75, v75, v93

    .line 492
    .line 493
    mul-double v95, v95, v42

    .line 494
    .line 495
    sub-double v75, v75, v95

    .line 496
    .line 497
    mul-double v52, v52, v45

    .line 498
    .line 499
    sub-double v75, v75, v52

    .line 500
    .line 501
    mul-double v54, v54, v45

    .line 502
    .line 503
    add-double v75, v75, v54

    .line 504
    .line 505
    div-double v75, v75, v0

    .line 506
    .line 507
    aput-wide v75, v14, v41

    .line 508
    .line 509
    mul-double v11, v85, v39

    .line 510
    .line 511
    mul-double v39, v39, v87

    .line 512
    .line 513
    sub-double v11, v11, v39

    .line 514
    .line 515
    mul-double v15, v9, v42

    .line 516
    .line 517
    sub-double/2addr v11, v15

    .line 518
    mul-double v42, v42, v21

    .line 519
    .line 520
    add-double v11, v11, v42

    .line 521
    .line 522
    mul-double v15, v6, v45

    .line 523
    .line 524
    add-double/2addr v11, v15

    .line 525
    mul-double v45, v45, v3

    .line 526
    .line 527
    sub-double v11, v11, v45

    .line 528
    .line 529
    div-double/2addr v11, v0

    .line 530
    aput-wide v11, v14, v44

    .line 531
    .line 532
    mul-double v87, v87, v27

    .line 533
    .line 534
    mul-double v85, v85, v27

    .line 535
    .line 536
    sub-double v87, v87, v85

    .line 537
    .line 538
    mul-double v9, v9, v30

    .line 539
    .line 540
    add-double v87, v87, v9

    .line 541
    .line 542
    mul-double v21, v21, v30

    .line 543
    .line 544
    sub-double v87, v87, v21

    .line 545
    .line 546
    mul-double v6, v6, v33

    .line 547
    .line 548
    sub-double v87, v87, v6

    .line 549
    .line 550
    mul-double v3, v3, v33

    .line 551
    .line 552
    add-double v87, v87, v3

    .line 553
    .line 554
    div-double v87, v87, v0

    .line 555
    .line 556
    aput-wide v87, v14, v47

    .line 557
    .line 558
    return-object v14
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
.end method

.method private static isZero(D)Z
    .locals 4

    .line 1
    invoke-static {p0, p1}, Ljava/lang/Double;->isNaN(D)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    invoke-static {p0, p1}, Ljava/lang/Math;->abs(D)D

    .line 10
    .line 11
    .line 12
    move-result-wide p0

    .line 13
    const-wide v2, 0x3ee4f8b588e368f1L    # 1.0E-5

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    cmpg-double p0, p0, v2

    .line 19
    .line 20
    if-gez p0, :cond_1

    .line 21
    .line 22
    const/4 v1, 0x1

    .line 23
    :cond_1
    return v1
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
.end method

.method public static multiplyInto([D[D[D)V
    .locals 60

    .line 1
    const/4 v0, 0x0

    .line 2
    aget-wide v1, p1, v0

    .line 3
    .line 4
    const/4 v3, 0x1

    .line 5
    aget-wide v4, p1, v3

    .line 6
    .line 7
    const/4 v6, 0x2

    .line 8
    aget-wide v7, p1, v6

    .line 9
    .line 10
    const/4 v9, 0x3

    .line 11
    aget-wide v10, p1, v9

    .line 12
    .line 13
    const/4 v12, 0x4

    .line 14
    aget-wide v13, p1, v12

    .line 15
    .line 16
    const/4 v15, 0x5

    .line 17
    aget-wide v16, p1, v15

    .line 18
    .line 19
    const/16 v18, 0x6

    .line 20
    .line 21
    aget-wide v19, p1, v18

    .line 22
    .line 23
    const/16 v21, 0x7

    .line 24
    .line 25
    aget-wide v22, p1, v21

    .line 26
    .line 27
    const/16 v24, 0x8

    .line 28
    .line 29
    aget-wide v25, p1, v24

    .line 30
    .line 31
    const/16 v27, 0x9

    .line 32
    .line 33
    aget-wide v28, p1, v27

    .line 34
    .line 35
    const/16 v30, 0xa

    .line 36
    .line 37
    aget-wide v31, p1, v30

    .line 38
    .line 39
    const/16 v33, 0xb

    .line 40
    .line 41
    aget-wide v34, p1, v33

    .line 42
    .line 43
    const/16 v36, 0xc

    .line 44
    .line 45
    aget-wide v37, p1, v36

    .line 46
    .line 47
    const/16 v39, 0xd

    .line 48
    .line 49
    aget-wide v40, p1, v39

    .line 50
    .line 51
    const/16 v42, 0xe

    .line 52
    .line 53
    aget-wide v43, p1, v42

    .line 54
    .line 55
    const/16 v45, 0xf

    .line 56
    .line 57
    aget-wide v46, p1, v45

    .line 58
    .line 59
    aget-wide v48, p2, v0

    .line 60
    .line 61
    aget-wide v50, p2, v3

    .line 62
    .line 63
    aget-wide v52, p2, v6

    .line 64
    .line 65
    aget-wide v54, p2, v9

    .line 66
    .line 67
    mul-double v56, v48, v1

    .line 68
    .line 69
    mul-double v58, v50, v13

    .line 70
    .line 71
    add-double v56, v56, v58

    .line 72
    .line 73
    mul-double v58, v52, v25

    .line 74
    .line 75
    add-double v56, v56, v58

    .line 76
    .line 77
    mul-double v58, v54, v37

    .line 78
    .line 79
    add-double v56, v56, v58

    .line 80
    .line 81
    aput-wide v56, p0, v0

    .line 82
    .line 83
    mul-double v56, v48, v4

    .line 84
    .line 85
    mul-double v58, v50, v16

    .line 86
    .line 87
    add-double v56, v56, v58

    .line 88
    .line 89
    mul-double v58, v52, v28

    .line 90
    .line 91
    add-double v56, v56, v58

    .line 92
    .line 93
    mul-double v58, v54, v40

    .line 94
    .line 95
    add-double v56, v56, v58

    .line 96
    .line 97
    aput-wide v56, p0, v3

    .line 98
    .line 99
    mul-double v56, v48, v7

    .line 100
    .line 101
    mul-double v58, v50, v19

    .line 102
    .line 103
    add-double v56, v56, v58

    .line 104
    .line 105
    mul-double v58, v52, v31

    .line 106
    .line 107
    add-double v56, v56, v58

    .line 108
    .line 109
    mul-double v58, v54, v43

    .line 110
    .line 111
    add-double v56, v56, v58

    .line 112
    .line 113
    aput-wide v56, p0, v6

    .line 114
    .line 115
    mul-double v48, v48, v10

    .line 116
    .line 117
    mul-double v50, v50, v22

    .line 118
    .line 119
    add-double v48, v48, v50

    .line 120
    .line 121
    mul-double v52, v52, v34

    .line 122
    .line 123
    add-double v48, v48, v52

    .line 124
    .line 125
    mul-double v54, v54, v46

    .line 126
    .line 127
    add-double v48, v48, v54

    .line 128
    .line 129
    aput-wide v48, p0, v9

    .line 130
    .line 131
    aget-wide v48, p2, v12

    .line 132
    .line 133
    aget-wide v50, p2, v15

    .line 134
    .line 135
    aget-wide v52, p2, v18

    .line 136
    .line 137
    aget-wide v54, p2, v21

    .line 138
    .line 139
    mul-double v56, v48, v1

    .line 140
    .line 141
    mul-double v58, v50, v13

    .line 142
    .line 143
    add-double v56, v56, v58

    .line 144
    .line 145
    mul-double v58, v52, v25

    .line 146
    .line 147
    add-double v56, v56, v58

    .line 148
    .line 149
    mul-double v58, v54, v37

    .line 150
    .line 151
    add-double v56, v56, v58

    .line 152
    .line 153
    aput-wide v56, p0, v12

    .line 154
    .line 155
    mul-double v56, v48, v4

    .line 156
    .line 157
    mul-double v58, v50, v16

    .line 158
    .line 159
    add-double v56, v56, v58

    .line 160
    .line 161
    mul-double v58, v52, v28

    .line 162
    .line 163
    add-double v56, v56, v58

    .line 164
    .line 165
    mul-double v58, v54, v40

    .line 166
    .line 167
    add-double v56, v56, v58

    .line 168
    .line 169
    aput-wide v56, p0, v15

    .line 170
    .line 171
    mul-double v56, v48, v7

    .line 172
    .line 173
    mul-double v58, v50, v19

    .line 174
    .line 175
    add-double v56, v56, v58

    .line 176
    .line 177
    mul-double v58, v52, v31

    .line 178
    .line 179
    add-double v56, v56, v58

    .line 180
    .line 181
    mul-double v58, v54, v43

    .line 182
    .line 183
    add-double v56, v56, v58

    .line 184
    .line 185
    aput-wide v56, p0, v18

    .line 186
    .line 187
    mul-double v48, v48, v10

    .line 188
    .line 189
    mul-double v50, v50, v22

    .line 190
    .line 191
    add-double v48, v48, v50

    .line 192
    .line 193
    mul-double v52, v52, v34

    .line 194
    .line 195
    add-double v48, v48, v52

    .line 196
    .line 197
    mul-double v54, v54, v46

    .line 198
    .line 199
    add-double v48, v48, v54

    .line 200
    .line 201
    aput-wide v48, p0, v21

    .line 202
    .line 203
    aget-wide v48, p2, v24

    .line 204
    .line 205
    aget-wide v50, p2, v27

    .line 206
    .line 207
    aget-wide v52, p2, v30

    .line 208
    .line 209
    aget-wide v54, p2, v33

    .line 210
    .line 211
    mul-double v56, v48, v1

    .line 212
    .line 213
    mul-double v58, v50, v13

    .line 214
    .line 215
    add-double v56, v56, v58

    .line 216
    .line 217
    mul-double v58, v52, v25

    .line 218
    .line 219
    add-double v56, v56, v58

    .line 220
    .line 221
    mul-double v58, v54, v37

    .line 222
    .line 223
    add-double v56, v56, v58

    .line 224
    .line 225
    aput-wide v56, p0, v24

    .line 226
    .line 227
    mul-double v56, v48, v4

    .line 228
    .line 229
    mul-double v58, v50, v16

    .line 230
    .line 231
    add-double v56, v56, v58

    .line 232
    .line 233
    mul-double v58, v52, v28

    .line 234
    .line 235
    add-double v56, v56, v58

    .line 236
    .line 237
    mul-double v58, v54, v40

    .line 238
    .line 239
    add-double v56, v56, v58

    .line 240
    .line 241
    aput-wide v56, p0, v27

    .line 242
    .line 243
    mul-double v56, v48, v7

    .line 244
    .line 245
    mul-double v58, v50, v19

    .line 246
    .line 247
    add-double v56, v56, v58

    .line 248
    .line 249
    mul-double v58, v52, v31

    .line 250
    .line 251
    add-double v56, v56, v58

    .line 252
    .line 253
    mul-double v58, v54, v43

    .line 254
    .line 255
    add-double v56, v56, v58

    .line 256
    .line 257
    aput-wide v56, p0, v30

    .line 258
    .line 259
    mul-double v48, v48, v10

    .line 260
    .line 261
    mul-double v50, v50, v22

    .line 262
    .line 263
    add-double v48, v48, v50

    .line 264
    .line 265
    mul-double v52, v52, v34

    .line 266
    .line 267
    add-double v48, v48, v52

    .line 268
    .line 269
    mul-double v54, v54, v46

    .line 270
    .line 271
    add-double v48, v48, v54

    .line 272
    .line 273
    aput-wide v48, p0, v33

    .line 274
    .line 275
    aget-wide v48, p2, v36

    .line 276
    .line 277
    aget-wide v50, p2, v39

    .line 278
    .line 279
    aget-wide v52, p2, v42

    .line 280
    .line 281
    aget-wide v54, p2, v45

    .line 282
    .line 283
    mul-double v1, v1, v48

    .line 284
    .line 285
    mul-double v13, v13, v50

    .line 286
    .line 287
    add-double/2addr v1, v13

    .line 288
    mul-double v25, v25, v52

    .line 289
    .line 290
    add-double v1, v1, v25

    .line 291
    .line 292
    mul-double v37, v37, v54

    .line 293
    .line 294
    add-double v1, v1, v37

    .line 295
    .line 296
    aput-wide v1, p0, v36

    .line 297
    .line 298
    mul-double v4, v4, v48

    .line 299
    .line 300
    mul-double v16, v16, v50

    .line 301
    .line 302
    add-double v4, v4, v16

    .line 303
    .line 304
    mul-double v28, v28, v52

    .line 305
    .line 306
    add-double v4, v4, v28

    .line 307
    .line 308
    mul-double v40, v40, v54

    .line 309
    .line 310
    add-double v4, v4, v40

    .line 311
    .line 312
    aput-wide v4, p0, v39

    .line 313
    .line 314
    mul-double v7, v7, v48

    .line 315
    .line 316
    mul-double v19, v19, v50

    .line 317
    .line 318
    add-double v7, v7, v19

    .line 319
    .line 320
    mul-double v31, v31, v52

    .line 321
    .line 322
    add-double v7, v7, v31

    .line 323
    .line 324
    mul-double v43, v43, v54

    .line 325
    .line 326
    add-double v7, v7, v43

    .line 327
    .line 328
    aput-wide v7, p0, v42

    .line 329
    .line 330
    mul-double v48, v48, v10

    .line 331
    .line 332
    mul-double v50, v50, v22

    .line 333
    .line 334
    add-double v48, v48, v50

    .line 335
    .line 336
    mul-double v52, v52, v34

    .line 337
    .line 338
    add-double v48, v48, v52

    .line 339
    .line 340
    mul-double v54, v54, v46

    .line 341
    .line 342
    add-double v48, v48, v54

    .line 343
    .line 344
    aput-wide v48, p0, v45

    .line 345
    .line 346
    return-void
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
.end method

.method public static multiplyVectorByMatrix([D[D[D)V
    .locals 16

    .line 1
    const/4 v0, 0x0

    .line 2
    aget-wide v1, p0, v0

    .line 3
    .line 4
    const/4 v3, 0x1

    .line 5
    aget-wide v4, p0, v3

    .line 6
    .line 7
    const/4 v6, 0x2

    .line 8
    aget-wide v7, p0, v6

    .line 9
    .line 10
    const/4 v9, 0x3

    .line 11
    aget-wide v10, p0, v9

    .line 12
    .line 13
    aget-wide v12, p1, v0

    .line 14
    .line 15
    mul-double/2addr v12, v1

    .line 16
    const/4 v14, 0x4

    .line 17
    aget-wide v14, p1, v14

    .line 18
    .line 19
    mul-double/2addr v14, v4

    .line 20
    add-double/2addr v12, v14

    .line 21
    const/16 v14, 0x8

    .line 22
    .line 23
    aget-wide v14, p1, v14

    .line 24
    .line 25
    mul-double/2addr v14, v7

    .line 26
    add-double/2addr v12, v14

    .line 27
    const/16 v14, 0xc

    .line 28
    .line 29
    aget-wide v14, p1, v14

    .line 30
    .line 31
    mul-double/2addr v14, v10

    .line 32
    add-double/2addr v12, v14

    .line 33
    aput-wide v12, p2, v0

    .line 34
    .line 35
    aget-wide v12, p1, v3

    .line 36
    .line 37
    mul-double/2addr v12, v1

    .line 38
    const/4 v0, 0x5

    .line 39
    aget-wide v14, p1, v0

    .line 40
    .line 41
    mul-double/2addr v14, v4

    .line 42
    add-double/2addr v12, v14

    .line 43
    const/16 v0, 0x9

    .line 44
    .line 45
    aget-wide v14, p1, v0

    .line 46
    .line 47
    mul-double/2addr v14, v7

    .line 48
    add-double/2addr v12, v14

    .line 49
    const/16 v0, 0xd

    .line 50
    .line 51
    aget-wide v14, p1, v0

    .line 52
    .line 53
    mul-double/2addr v14, v10

    .line 54
    add-double/2addr v12, v14

    .line 55
    aput-wide v12, p2, v3

    .line 56
    .line 57
    aget-wide v12, p1, v6

    .line 58
    .line 59
    mul-double/2addr v12, v1

    .line 60
    const/4 v0, 0x6

    .line 61
    aget-wide v14, p1, v0

    .line 62
    .line 63
    mul-double/2addr v14, v4

    .line 64
    add-double/2addr v12, v14

    .line 65
    const/16 v0, 0xa

    .line 66
    .line 67
    aget-wide v14, p1, v0

    .line 68
    .line 69
    mul-double/2addr v14, v7

    .line 70
    add-double/2addr v12, v14

    .line 71
    const/16 v0, 0xe

    .line 72
    .line 73
    aget-wide v14, p1, v0

    .line 74
    .line 75
    mul-double/2addr v14, v10

    .line 76
    add-double/2addr v12, v14

    .line 77
    aput-wide v12, p2, v6

    .line 78
    .line 79
    aget-wide v12, p1, v9

    .line 80
    .line 81
    mul-double/2addr v1, v12

    .line 82
    const/4 v0, 0x7

    .line 83
    aget-wide v12, p1, v0

    .line 84
    .line 85
    mul-double/2addr v4, v12

    .line 86
    add-double/2addr v1, v4

    .line 87
    const/16 v0, 0xb

    .line 88
    .line 89
    aget-wide v3, p1, v0

    .line 90
    .line 91
    mul-double/2addr v7, v3

    .line 92
    add-double/2addr v1, v7

    .line 93
    const/16 v0, 0xf

    .line 94
    .line 95
    aget-wide v3, p1, v0

    .line 96
    .line 97
    mul-double/2addr v10, v3

    .line 98
    add-double/2addr v1, v10

    .line 99
    aput-wide v1, p2, v9

    .line 100
    .line 101
    return-void
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
.end method

.method public static resetIdentityMatrix([D)V
    .locals 3

    .line 1
    const/16 v0, 0xe

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    aput-wide v1, p0, v0

    .line 6
    .line 7
    const/16 v0, 0xd

    .line 8
    .line 9
    aput-wide v1, p0, v0

    .line 10
    .line 11
    const/16 v0, 0xc

    .line 12
    .line 13
    aput-wide v1, p0, v0

    .line 14
    .line 15
    const/16 v0, 0xb

    .line 16
    .line 17
    aput-wide v1, p0, v0

    .line 18
    .line 19
    const/16 v0, 0x9

    .line 20
    .line 21
    aput-wide v1, p0, v0

    .line 22
    .line 23
    const/16 v0, 0x8

    .line 24
    .line 25
    aput-wide v1, p0, v0

    .line 26
    .line 27
    const/4 v0, 0x7

    .line 28
    aput-wide v1, p0, v0

    .line 29
    .line 30
    const/4 v0, 0x6

    .line 31
    aput-wide v1, p0, v0

    .line 32
    .line 33
    const/4 v0, 0x4

    .line 34
    aput-wide v1, p0, v0

    .line 35
    .line 36
    const/4 v0, 0x3

    .line 37
    aput-wide v1, p0, v0

    .line 38
    .line 39
    const/4 v0, 0x2

    .line 40
    aput-wide v1, p0, v0

    .line 41
    .line 42
    const/4 v0, 0x1

    .line 43
    aput-wide v1, p0, v0

    .line 44
    .line 45
    const/16 v0, 0xf

    .line 46
    .line 47
    const-wide/high16 v1, 0x3ff0000000000000L    # 1.0

    .line 48
    .line 49
    aput-wide v1, p0, v0

    .line 50
    .line 51
    const/16 v0, 0xa

    .line 52
    .line 53
    aput-wide v1, p0, v0

    .line 54
    .line 55
    const/4 v0, 0x5

    .line 56
    aput-wide v1, p0, v0

    .line 57
    .line 58
    const/4 v0, 0x0

    .line 59
    aput-wide v1, p0, v0

    .line 60
    .line 61
    return-void
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
.end method

.method public static roundTo3Places(D)D
    .locals 2

    const-wide v0, 0x408f400000000000L    # 1000.0

    mul-double/2addr p0, v0

    invoke-static {p0, p1}, Ljava/lang/Math;->round(D)J

    move-result-wide p0

    long-to-double p0, p0

    const-wide v0, 0x3f50624dd2f1a9fcL    # 0.001

    mul-double/2addr p0, v0

    return-wide p0
.end method

.method public static transpose([D)[D
    .locals 11

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    new-array v0, v0, [D

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    aget-wide v2, p0, v1

    .line 7
    .line 8
    aput-wide v2, v0, v1

    .line 9
    .line 10
    const/4 v1, 0x4

    .line 11
    aget-wide v2, p0, v1

    .line 12
    .line 13
    const/4 v4, 0x1

    .line 14
    aput-wide v2, v0, v4

    .line 15
    .line 16
    const/16 v2, 0x8

    .line 17
    .line 18
    aget-wide v5, p0, v2

    .line 19
    .line 20
    const/4 v3, 0x2

    .line 21
    aput-wide v5, v0, v3

    .line 22
    .line 23
    const/16 v5, 0xc

    .line 24
    .line 25
    aget-wide v6, p0, v5

    .line 26
    .line 27
    const/4 v8, 0x3

    .line 28
    aput-wide v6, v0, v8

    .line 29
    .line 30
    aget-wide v6, p0, v4

    .line 31
    .line 32
    aput-wide v6, v0, v1

    .line 33
    .line 34
    const/4 v1, 0x5

    .line 35
    aget-wide v6, p0, v1

    .line 36
    .line 37
    aput-wide v6, v0, v1

    .line 38
    .line 39
    const/16 v1, 0x9

    .line 40
    .line 41
    aget-wide v6, p0, v1

    .line 42
    .line 43
    const/4 v4, 0x6

    .line 44
    aput-wide v6, v0, v4

    .line 45
    .line 46
    const/16 v6, 0xd

    .line 47
    .line 48
    aget-wide v9, p0, v6

    .line 49
    .line 50
    const/4 v7, 0x7

    .line 51
    aput-wide v9, v0, v7

    .line 52
    .line 53
    aget-wide v9, p0, v3

    .line 54
    .line 55
    aput-wide v9, v0, v2

    .line 56
    .line 57
    aget-wide v2, p0, v4

    .line 58
    .line 59
    aput-wide v2, v0, v1

    .line 60
    .line 61
    const/16 v1, 0xa

    .line 62
    .line 63
    aget-wide v2, p0, v1

    .line 64
    .line 65
    aput-wide v2, v0, v1

    .line 66
    .line 67
    const/16 v1, 0xe

    .line 68
    .line 69
    aget-wide v2, p0, v1

    .line 70
    .line 71
    const/16 v4, 0xb

    .line 72
    .line 73
    aput-wide v2, v0, v4

    .line 74
    .line 75
    aget-wide v2, p0, v8

    .line 76
    .line 77
    aput-wide v2, v0, v5

    .line 78
    .line 79
    aget-wide v2, p0, v7

    .line 80
    .line 81
    aput-wide v2, v0, v6

    .line 82
    .line 83
    aget-wide v2, p0, v4

    .line 84
    .line 85
    aput-wide v2, v0, v1

    .line 86
    .line 87
    const/16 v1, 0xf

    .line 88
    .line 89
    aget-wide v2, p0, v1

    .line 90
    .line 91
    aput-wide v2, v0, v1

    .line 92
    .line 93
    return-object v0
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
.end method

.method public static v3Combine([D[DDD)[D
    .locals 6

    .line 1
    const/4 v0, 0x3

    .line 2
    new-array v0, v0, [D

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    aget-wide v2, p0, v1

    .line 6
    .line 7
    mul-double/2addr v2, p2

    .line 8
    aget-wide v4, p1, v1

    .line 9
    .line 10
    mul-double/2addr v4, p4

    .line 11
    add-double/2addr v2, v4

    .line 12
    aput-wide v2, v0, v1

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    aget-wide v2, p0, v1

    .line 16
    .line 17
    mul-double/2addr v2, p2

    .line 18
    aget-wide v4, p1, v1

    .line 19
    .line 20
    mul-double/2addr v4, p4

    .line 21
    add-double/2addr v2, v4

    .line 22
    aput-wide v2, v0, v1

    .line 23
    .line 24
    const/4 v1, 0x2

    .line 25
    aget-wide v2, p0, v1

    .line 26
    .line 27
    mul-double/2addr p2, v2

    .line 28
    aget-wide p0, p1, v1

    .line 29
    .line 30
    mul-double/2addr p4, p0

    .line 31
    add-double/2addr p2, p4

    .line 32
    aput-wide p2, v0, v1

    .line 33
    .line 34
    return-object v0
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
.end method

.method public static v3Cross([D[D)[D
    .locals 11

    .line 1
    const/4 v0, 0x3

    .line 2
    new-array v0, v0, [D

    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    aget-wide v2, p0, v1

    .line 6
    .line 7
    const/4 v4, 0x2

    .line 8
    aget-wide v5, p1, v4

    .line 9
    .line 10
    mul-double/2addr v2, v5

    .line 11
    aget-wide v7, p0, v4

    .line 12
    .line 13
    aget-wide v9, p1, v1

    .line 14
    .line 15
    mul-double/2addr v9, v7

    .line 16
    sub-double/2addr v2, v9

    .line 17
    const/4 v9, 0x0

    .line 18
    aput-wide v2, v0, v9

    .line 19
    .line 20
    aget-wide v2, p1, v9

    .line 21
    .line 22
    mul-double/2addr v7, v2

    .line 23
    aget-wide v9, p0, v9

    .line 24
    .line 25
    mul-double/2addr v5, v9

    .line 26
    sub-double/2addr v7, v5

    .line 27
    aput-wide v7, v0, v1

    .line 28
    .line 29
    aget-wide v5, p1, v1

    .line 30
    .line 31
    mul-double/2addr v9, v5

    .line 32
    aget-wide v5, p0, v1

    .line 33
    .line 34
    mul-double/2addr v5, v2

    .line 35
    sub-double/2addr v9, v5

    .line 36
    aput-wide v9, v0, v4

    .line 37
    .line 38
    return-object v0
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
.end method

.method public static v3Dot([D[D)D
    .locals 7

    const/4 v0, 0x0

    aget-wide v1, p0, v0

    aget-wide v3, p1, v0

    mul-double/2addr v1, v3

    const/4 v0, 0x1

    aget-wide v3, p0, v0

    aget-wide v5, p1, v0

    mul-double/2addr v3, v5

    add-double/2addr v1, v3

    const/4 v0, 0x2

    aget-wide v3, p0, v0

    aget-wide p0, p1, v0

    mul-double/2addr v3, p0

    add-double/2addr v1, v3

    return-wide v1
.end method

.method public static v3Length([D)D
    .locals 4

    const/4 v0, 0x0

    aget-wide v0, p0, v0

    mul-double/2addr v0, v0

    const/4 v2, 0x1

    aget-wide v2, p0, v2

    mul-double/2addr v2, v2

    add-double/2addr v0, v2

    const/4 v2, 0x2

    aget-wide v2, p0, v2

    mul-double/2addr v2, v2

    add-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    return-wide v0
.end method

.method public static v3Normalize([DD)[D
    .locals 4

    .line 1
    invoke-static {p1, p2}, Lcom/facebook/react/uimanager/MatrixMathHelper;->isZero(D)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {p0}, Lcom/facebook/react/uimanager/MatrixMathHelper;->v3Length([D)D

    .line 8
    .line 9
    .line 10
    move-result-wide p1

    .line 11
    :cond_0
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    .line 12
    .line 13
    div-double/2addr v0, p1

    .line 14
    const/4 p1, 0x3

    .line 15
    new-array p1, p1, [D

    .line 16
    .line 17
    const/4 p2, 0x0

    .line 18
    aget-wide v2, p0, p2

    .line 19
    .line 20
    mul-double/2addr v2, v0

    .line 21
    aput-wide v2, p1, p2

    .line 22
    .line 23
    const/4 p2, 0x1

    .line 24
    aget-wide v2, p0, p2

    .line 25
    .line 26
    mul-double/2addr v2, v0

    .line 27
    aput-wide v2, p1, p2

    .line 28
    .line 29
    const/4 p2, 0x2

    .line 30
    aget-wide v2, p0, p2

    .line 31
    .line 32
    mul-double/2addr v2, v0

    .line 33
    aput-wide v2, p1, p2

    .line 34
    .line 35
    return-object p1
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
.end method
