.class final Ltd/h;
.super Ltd/g;
.source "SourceFile"


# instance fields
.field private final c:Z


# direct methods
.method constructor <init>(Ltd/c;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ltd/g;-><init>(Ltd/c;)V

    .line 2
    .line 3
    .line 4
    iput-boolean p2, p0, Ltd/h;->c:Z

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
.end method

.method private h(Ltd/a;)V
    .locals 10

    .line 1
    invoke-virtual {p0}, Ltd/g;->a()Ltd/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v1, p0, Ltd/h;->c:Z

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Ltd/c;->h()Lcd/o;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {v0}, Ltd/c;->i()Lcd/o;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    :goto_0
    iget-boolean v2, p0, Ltd/h;->c:Z

    .line 19
    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    invoke-virtual {v0}, Ltd/c;->b()Lcd/o;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    invoke-virtual {v0}, Ltd/c;->c()Lcd/o;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    :goto_1
    invoke-virtual {v1}, Lcd/o;->d()F

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    float-to-int v1, v1

    .line 36
    invoke-virtual {p0, v1}, Ltd/g;->e(I)I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    invoke-virtual {v0}, Lcd/o;->d()F

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    float-to-int v0, v0

    .line 45
    invoke-virtual {p0, v0}, Ltd/g;->e(I)I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    invoke-virtual {p0}, Ltd/g;->d()[Ltd/d;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    const/4 v3, 0x1

    .line 54
    const/4 v4, -0x1

    .line 55
    const/4 v5, 0x0

    .line 56
    move v6, v3

    .line 57
    :goto_2
    if-ge v1, v0, :cond_6

    .line 58
    .line 59
    aget-object v7, v2, v1

    .line 60
    .line 61
    if-eqz v7, :cond_5

    .line 62
    .line 63
    invoke-virtual {v7}, Ltd/d;->j()V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v7}, Ltd/d;->c()I

    .line 67
    .line 68
    .line 69
    move-result v8

    .line 70
    sub-int/2addr v8, v4

    .line 71
    if-nez v8, :cond_2

    .line 72
    .line 73
    add-int/lit8 v5, v5, 0x1

    .line 74
    .line 75
    goto :goto_4

    .line 76
    :cond_2
    if-ne v8, v3, :cond_3

    .line 77
    .line 78
    invoke-static {v6, v5}, Ljava/lang/Math;->max(II)I

    .line 79
    .line 80
    .line 81
    move-result v6

    .line 82
    invoke-virtual {v7}, Ltd/d;->c()I

    .line 83
    .line 84
    .line 85
    move-result v4

    .line 86
    :goto_3
    move v5, v3

    .line 87
    goto :goto_4

    .line 88
    :cond_3
    invoke-virtual {v7}, Ltd/d;->c()I

    .line 89
    .line 90
    .line 91
    move-result v8

    .line 92
    invoke-virtual {p1}, Ltd/a;->c()I

    .line 93
    .line 94
    .line 95
    move-result v9

    .line 96
    if-lt v8, v9, :cond_4

    .line 97
    .line 98
    const/4 v7, 0x0

    .line 99
    aput-object v7, v2, v1

    .line 100
    .line 101
    goto :goto_4

    .line 102
    :cond_4
    invoke-virtual {v7}, Ltd/d;->c()I

    .line 103
    .line 104
    .line 105
    move-result v4

    .line 106
    goto :goto_3

    .line 107
    :cond_5
    :goto_4
    add-int/lit8 v1, v1, 0x1

    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_6
    return-void
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
.end method

.method private l([Ltd/d;Ltd/a;)V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    array-length v1, p1

    .line 3
    if-ge v0, v1, :cond_7

    .line 4
    .line 5
    aget-object v1, p1, v0

    .line 6
    .line 7
    if-eqz v1, :cond_6

    .line 8
    .line 9
    invoke-virtual {v1}, Ltd/d;->e()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    rem-int/lit8 v2, v2, 0x1e

    .line 14
    .line 15
    invoke-virtual {v1}, Ltd/d;->c()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-virtual {p2}, Ltd/a;->c()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    const/4 v4, 0x0

    .line 24
    if-le v1, v3, :cond_0

    .line 25
    .line 26
    aput-object v4, p1, v0

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_0
    iget-boolean v3, p0, Ltd/h;->c:Z

    .line 30
    .line 31
    if-nez v3, :cond_1

    .line 32
    .line 33
    add-int/lit8 v1, v1, 0x2

    .line 34
    .line 35
    :cond_1
    rem-int/lit8 v1, v1, 0x3

    .line 36
    .line 37
    const/4 v3, 0x1

    .line 38
    if-eqz v1, :cond_5

    .line 39
    .line 40
    if-eq v1, v3, :cond_3

    .line 41
    .line 42
    const/4 v3, 0x2

    .line 43
    if-eq v1, v3, :cond_2

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 47
    .line 48
    invoke-virtual {p2}, Ltd/a;->a()I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eq v2, v1, :cond_6

    .line 53
    .line 54
    aput-object v4, p1, v0

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_3
    div-int/lit8 v1, v2, 0x3

    .line 58
    .line 59
    invoke-virtual {p2}, Ltd/a;->b()I

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    if-ne v1, v3, :cond_4

    .line 64
    .line 65
    rem-int/lit8 v2, v2, 0x3

    .line 66
    .line 67
    invoke-virtual {p2}, Ltd/a;->d()I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-eq v2, v1, :cond_6

    .line 72
    .line 73
    :cond_4
    aput-object v4, p1, v0

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_5
    mul-int/lit8 v2, v2, 0x3

    .line 77
    .line 78
    add-int/2addr v2, v3

    .line 79
    invoke-virtual {p2}, Ltd/a;->e()I

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    if-eq v2, v1, :cond_6

    .line 84
    .line 85
    aput-object v4, p1, v0

    .line 86
    .line 87
    :cond_6
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_7
    return-void
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
.end method

.method private m()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Ltd/g;->d()[Ltd/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    array-length v1, v0

    .line 6
    const/4 v2, 0x0

    .line 7
    :goto_0
    if-ge v2, v1, :cond_1

    .line 8
    .line 9
    aget-object v3, v0, v2

    .line 10
    .line 11
    if-eqz v3, :cond_0

    .line 12
    .line 13
    invoke-virtual {v3}, Ltd/d;->j()V

    .line 14
    .line 15
    .line 16
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method


# virtual methods
.method g(Ltd/a;)V
    .locals 13

    .line 1
    invoke-virtual {p0}, Ltd/g;->d()[Ltd/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0}, Ltd/h;->m()V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, v0, p1}, Ltd/h;->l([Ltd/d;Ltd/a;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Ltd/g;->a()Ltd/c;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    iget-boolean v2, p0, Ltd/h;->c:Z

    .line 16
    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    invoke-virtual {v1}, Ltd/c;->h()Lcd/o;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {v1}, Ltd/c;->i()Lcd/o;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    :goto_0
    iget-boolean v3, p0, Ltd/h;->c:Z

    .line 29
    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    invoke-virtual {v1}, Ltd/c;->b()Lcd/o;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    goto :goto_1

    .line 37
    :cond_1
    invoke-virtual {v1}, Ltd/c;->c()Lcd/o;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    :goto_1
    invoke-virtual {v2}, Lcd/o;->d()F

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    float-to-int v2, v2

    .line 46
    invoke-virtual {p0, v2}, Ltd/g;->e(I)I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    invoke-virtual {v1}, Lcd/o;->d()F

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    float-to-int v1, v1

    .line 55
    invoke-virtual {p0, v1}, Ltd/g;->e(I)I

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    const/4 v3, 0x0

    .line 60
    const/4 v4, 0x1

    .line 61
    const/4 v5, -0x1

    .line 62
    move v6, v3

    .line 63
    move v7, v4

    .line 64
    :goto_2
    if-ge v2, v1, :cond_c

    .line 65
    .line 66
    aget-object v8, v0, v2

    .line 67
    .line 68
    if-eqz v8, :cond_b

    .line 69
    .line 70
    invoke-virtual {v8}, Ltd/d;->c()I

    .line 71
    .line 72
    .line 73
    move-result v9

    .line 74
    sub-int/2addr v9, v5

    .line 75
    if-nez v9, :cond_2

    .line 76
    .line 77
    add-int/lit8 v6, v6, 0x1

    .line 78
    .line 79
    goto :goto_8

    .line 80
    :cond_2
    if-ne v9, v4, :cond_3

    .line 81
    .line 82
    invoke-static {v7, v6}, Ljava/lang/Math;->max(II)I

    .line 83
    .line 84
    .line 85
    move-result v7

    .line 86
    invoke-virtual {v8}, Ltd/d;->c()I

    .line 87
    .line 88
    .line 89
    move-result v5

    .line 90
    :goto_3
    move v6, v4

    .line 91
    goto :goto_8

    .line 92
    :cond_3
    const/4 v10, 0x0

    .line 93
    if-ltz v9, :cond_a

    .line 94
    .line 95
    invoke-virtual {v8}, Ltd/d;->c()I

    .line 96
    .line 97
    .line 98
    move-result v11

    .line 99
    invoke-virtual {p1}, Ltd/a;->c()I

    .line 100
    .line 101
    .line 102
    move-result v12

    .line 103
    if-ge v11, v12, :cond_a

    .line 104
    .line 105
    if-le v9, v2, :cond_4

    .line 106
    .line 107
    goto :goto_7

    .line 108
    :cond_4
    const/4 v11, 0x2

    .line 109
    if-le v7, v11, :cond_5

    .line 110
    .line 111
    add-int/lit8 v11, v7, -0x2

    .line 112
    .line 113
    mul-int/2addr v9, v11

    .line 114
    :cond_5
    if-lt v9, v2, :cond_6

    .line 115
    .line 116
    move v11, v4

    .line 117
    goto :goto_4

    .line 118
    :cond_6
    move v11, v3

    .line 119
    :goto_4
    move v12, v4

    .line 120
    :goto_5
    if-gt v12, v9, :cond_8

    .line 121
    .line 122
    if-nez v11, :cond_8

    .line 123
    .line 124
    sub-int v11, v2, v12

    .line 125
    .line 126
    aget-object v11, v0, v11

    .line 127
    .line 128
    if-eqz v11, :cond_7

    .line 129
    .line 130
    move v11, v4

    .line 131
    goto :goto_6

    .line 132
    :cond_7
    move v11, v3

    .line 133
    :goto_6
    add-int/lit8 v12, v12, 0x1

    .line 134
    .line 135
    goto :goto_5

    .line 136
    :cond_8
    if-eqz v11, :cond_9

    .line 137
    .line 138
    aput-object v10, v0, v2

    .line 139
    .line 140
    goto :goto_8

    .line 141
    :cond_9
    invoke-virtual {v8}, Ltd/d;->c()I

    .line 142
    .line 143
    .line 144
    move-result v5

    .line 145
    goto :goto_3

    .line 146
    :cond_a
    :goto_7
    aput-object v10, v0, v2

    .line 147
    .line 148
    :cond_b
    :goto_8
    add-int/lit8 v2, v2, 0x1

    .line 149
    .line 150
    goto :goto_2

    .line 151
    :cond_c
    return-void
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
.end method

.method i()Ltd/a;
    .locals 12

    .line 1
    invoke-virtual {p0}, Ltd/g;->d()[Ltd/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ltd/b;

    .line 6
    .line 7
    invoke-direct {v1}, Ltd/b;-><init>()V

    .line 8
    .line 9
    .line 10
    new-instance v2, Ltd/b;

    .line 11
    .line 12
    invoke-direct {v2}, Ltd/b;-><init>()V

    .line 13
    .line 14
    .line 15
    new-instance v3, Ltd/b;

    .line 16
    .line 17
    invoke-direct {v3}, Ltd/b;-><init>()V

    .line 18
    .line 19
    .line 20
    new-instance v4, Ltd/b;

    .line 21
    .line 22
    invoke-direct {v4}, Ltd/b;-><init>()V

    .line 23
    .line 24
    .line 25
    array-length v5, v0

    .line 26
    const/4 v6, 0x0

    .line 27
    move v7, v6

    .line 28
    :goto_0
    const/4 v8, 0x3

    .line 29
    if-ge v7, v5, :cond_5

    .line 30
    .line 31
    aget-object v9, v0, v7

    .line 32
    .line 33
    if-eqz v9, :cond_4

    .line 34
    .line 35
    invoke-virtual {v9}, Ltd/d;->j()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v9}, Ltd/d;->e()I

    .line 39
    .line 40
    .line 41
    move-result v10

    .line 42
    rem-int/lit8 v10, v10, 0x1e

    .line 43
    .line 44
    invoke-virtual {v9}, Ltd/d;->c()I

    .line 45
    .line 46
    .line 47
    move-result v9

    .line 48
    iget-boolean v11, p0, Ltd/h;->c:Z

    .line 49
    .line 50
    if-nez v11, :cond_0

    .line 51
    .line 52
    add-int/lit8 v9, v9, 0x2

    .line 53
    .line 54
    :cond_0
    rem-int/2addr v9, v8

    .line 55
    const/4 v8, 0x1

    .line 56
    if-eqz v9, :cond_3

    .line 57
    .line 58
    if-eq v9, v8, :cond_2

    .line 59
    .line 60
    const/4 v8, 0x2

    .line 61
    if-eq v9, v8, :cond_1

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_1
    add-int/lit8 v10, v10, 0x1

    .line 65
    .line 66
    invoke-virtual {v1, v10}, Ltd/b;->b(I)V

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_2
    div-int/lit8 v8, v10, 0x3

    .line 71
    .line 72
    invoke-virtual {v4, v8}, Ltd/b;->b(I)V

    .line 73
    .line 74
    .line 75
    rem-int/lit8 v10, v10, 0x3

    .line 76
    .line 77
    invoke-virtual {v3, v10}, Ltd/b;->b(I)V

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_3
    mul-int/lit8 v10, v10, 0x3

    .line 82
    .line 83
    add-int/2addr v10, v8

    .line 84
    invoke-virtual {v2, v10}, Ltd/b;->b(I)V

    .line 85
    .line 86
    .line 87
    :cond_4
    :goto_1
    add-int/lit8 v7, v7, 0x1

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_5
    invoke-virtual {v1}, Ltd/b;->a()[I

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    array-length v5, v5

    .line 95
    if-eqz v5, :cond_7

    .line 96
    .line 97
    invoke-virtual {v2}, Ltd/b;->a()[I

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    array-length v5, v5

    .line 102
    if-eqz v5, :cond_7

    .line 103
    .line 104
    invoke-virtual {v3}, Ltd/b;->a()[I

    .line 105
    .line 106
    .line 107
    move-result-object v5

    .line 108
    array-length v5, v5

    .line 109
    if-eqz v5, :cond_7

    .line 110
    .line 111
    invoke-virtual {v4}, Ltd/b;->a()[I

    .line 112
    .line 113
    .line 114
    move-result-object v5

    .line 115
    array-length v5, v5

    .line 116
    if-eqz v5, :cond_7

    .line 117
    .line 118
    invoke-virtual {v1}, Ltd/b;->a()[I

    .line 119
    .line 120
    .line 121
    move-result-object v5

    .line 122
    aget v5, v5, v6

    .line 123
    .line 124
    if-lez v5, :cond_7

    .line 125
    .line 126
    invoke-virtual {v2}, Ltd/b;->a()[I

    .line 127
    .line 128
    .line 129
    move-result-object v5

    .line 130
    aget v5, v5, v6

    .line 131
    .line 132
    invoke-virtual {v3}, Ltd/b;->a()[I

    .line 133
    .line 134
    .line 135
    move-result-object v7

    .line 136
    aget v7, v7, v6

    .line 137
    .line 138
    add-int/2addr v5, v7

    .line 139
    if-lt v5, v8, :cond_7

    .line 140
    .line 141
    invoke-virtual {v2}, Ltd/b;->a()[I

    .line 142
    .line 143
    .line 144
    move-result-object v5

    .line 145
    aget v5, v5, v6

    .line 146
    .line 147
    invoke-virtual {v3}, Ltd/b;->a()[I

    .line 148
    .line 149
    .line 150
    move-result-object v7

    .line 151
    aget v7, v7, v6

    .line 152
    .line 153
    add-int/2addr v5, v7

    .line 154
    const/16 v7, 0x5a

    .line 155
    .line 156
    if-le v5, v7, :cond_6

    .line 157
    .line 158
    goto :goto_2

    .line 159
    :cond_6
    new-instance v5, Ltd/a;

    .line 160
    .line 161
    invoke-virtual {v1}, Ltd/b;->a()[I

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    aget v1, v1, v6

    .line 166
    .line 167
    invoke-virtual {v2}, Ltd/b;->a()[I

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    aget v2, v2, v6

    .line 172
    .line 173
    invoke-virtual {v3}, Ltd/b;->a()[I

    .line 174
    .line 175
    .line 176
    move-result-object v3

    .line 177
    aget v3, v3, v6

    .line 178
    .line 179
    invoke-virtual {v4}, Ltd/b;->a()[I

    .line 180
    .line 181
    .line 182
    move-result-object v4

    .line 183
    aget v4, v4, v6

    .line 184
    .line 185
    invoke-direct {v5, v1, v2, v3, v4}, Ltd/a;-><init>(IIII)V

    .line 186
    .line 187
    .line 188
    invoke-direct {p0, v0, v5}, Ltd/h;->l([Ltd/d;Ltd/a;)V

    .line 189
    .line 190
    .line 191
    return-object v5

    .line 192
    :cond_7
    :goto_2
    const/4 v0, 0x0

    .line 193
    return-object v0
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

.method j()[I
    .locals 7

    .line 1
    invoke-virtual {p0}, Ltd/h;->i()Ltd/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    return-object v0

    .line 9
    :cond_0
    invoke-direct {p0, v0}, Ltd/h;->h(Ltd/a;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Ltd/a;->c()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    new-array v1, v0, [I

    .line 17
    .line 18
    invoke-virtual {p0}, Ltd/g;->d()[Ltd/d;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    array-length v3, v2

    .line 23
    const/4 v4, 0x0

    .line 24
    :goto_0
    if-ge v4, v3, :cond_2

    .line 25
    .line 26
    aget-object v5, v2, v4

    .line 27
    .line 28
    if-eqz v5, :cond_1

    .line 29
    .line 30
    invoke-virtual {v5}, Ltd/d;->c()I

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    if-ge v5, v0, :cond_1

    .line 35
    .line 36
    aget v6, v1, v5

    .line 37
    .line 38
    add-int/lit8 v6, v6, 0x1

    .line 39
    .line 40
    aput v6, v1, v5

    .line 41
    .line 42
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    return-object v1
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
.end method

.method k()Z
    .locals 1

    iget-boolean v0, p0, Ltd/h;->c:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "IsLeft: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v1, p0, Ltd/h;->c:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-super {p0}, Ltd/g;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
