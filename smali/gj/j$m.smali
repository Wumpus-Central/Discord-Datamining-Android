.class final enum Lgj/j$m;
.super Lgj/j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgj/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4008
    name = null
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, p3, v0}, Lgj/j;-><init>(Ljava/lang/String;ILjava/lang/String;Lgj/j$g;)V

    return-void
.end method


# virtual methods
.method public j(C)Z
    .locals 1

    const/16 v0, 0x1369

    if-lt p1, v0, :cond_0

    const/16 v0, 0x137c

    if-gt p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public l()Ljava/lang/String;
    .locals 1

    const-string v0, "\u1369\u136a\u136b\u136c\u136d\u136e\u136f\u1370\u1371\u1372\u1373\u1374\u1375\u1376\u1377\u1378\u1379\u137a\u137b\u137c"

    return-object v0
.end method

.method public n()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public p(Ljava/lang/String;Lgj/g;)I
    .locals 10

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    const/4 v0, 0x1

    .line 6
    sub-int/2addr p2, v0

    .line 7
    const/4 v1, 0x0

    .line 8
    move v6, v0

    .line 9
    move v2, v1

    .line 10
    move v3, v2

    .line 11
    move v4, v3

    .line 12
    move v5, v4

    .line 13
    :goto_0
    if-ltz p2, :cond_6

    .line 14
    .line 15
    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    .line 16
    .line 17
    .line 18
    move-result v7

    .line 19
    const/16 v8, 0x1369

    .line 20
    .line 21
    const/16 v9, 0x1372

    .line 22
    .line 23
    if-lt v7, v8, :cond_0

    .line 24
    .line 25
    if-ge v7, v9, :cond_0

    .line 26
    .line 27
    add-int/lit8 v7, v7, 0x1

    .line 28
    .line 29
    sub-int/2addr v7, v8

    .line 30
    :goto_1
    add-int/2addr v5, v7

    .line 31
    goto :goto_3

    .line 32
    :cond_0
    const/16 v8, 0x137b

    .line 33
    .line 34
    if-lt v7, v9, :cond_1

    .line 35
    .line 36
    if-ge v7, v8, :cond_1

    .line 37
    .line 38
    add-int/lit8 v7, v7, 0x1

    .line 39
    .line 40
    sub-int/2addr v7, v9

    .line 41
    mul-int/lit8 v7, v7, 0xa

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    const/16 v9, 0x137c

    .line 45
    .line 46
    if-ne v7, v9, :cond_4

    .line 47
    .line 48
    if-eqz v2, :cond_2

    .line 49
    .line 50
    if-nez v5, :cond_2

    .line 51
    .line 52
    move v5, v0

    .line 53
    :cond_2
    invoke-static {v4, v5, v6}, Lgj/j;->b(III)I

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    if-eqz v2, :cond_3

    .line 58
    .line 59
    mul-int/lit8 v6, v6, 0x64

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_3
    mul-int/lit16 v6, v6, 0x2710

    .line 63
    .line 64
    :goto_2
    move v3, v0

    .line 65
    move v2, v1

    .line 66
    move v5, v2

    .line 67
    goto :goto_3

    .line 68
    :cond_4
    if-ne v7, v8, :cond_5

    .line 69
    .line 70
    invoke-static {v4, v5, v6}, Lgj/j;->b(III)I

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    mul-int/lit8 v6, v6, 0x64

    .line 75
    .line 76
    move v2, v0

    .line 77
    move v3, v1

    .line 78
    move v5, v3

    .line 79
    :cond_5
    :goto_3
    add-int/lit8 p2, p2, -0x1

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_6
    if-nez v2, :cond_7

    .line 83
    .line 84
    if-eqz v3, :cond_8

    .line 85
    .line 86
    :cond_7
    if-nez v5, :cond_8

    .line 87
    .line 88
    goto :goto_4

    .line 89
    :cond_8
    move v0, v5

    .line 90
    :goto_4
    invoke-static {v4, v0, v6}, Lgj/j;->b(III)I

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    return p1
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

.method public r(I)Ljava/lang/String;
    .locals 10

    .line 1
    const/4 v0, 0x1

    .line 2
    if-lt p1, v0, :cond_c

    .line 3
    .line 4
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    sub-int/2addr v1, v0

    .line 13
    rem-int/lit8 v2, v1, 0x2

    .line 14
    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    new-instance v2, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    .line 22
    const-string v3, "0"

    .line 23
    .line 24
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    add-int/lit8 v1, v1, 0x1

    .line 35
    .line 36
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 39
    .line 40
    .line 41
    move v3, v1

    .line 42
    :goto_0
    if-ltz v3, :cond_b

    .line 43
    .line 44
    sub-int v4, v1, v3

    .line 45
    .line 46
    invoke-virtual {p1, v4}, Ljava/lang/String;->charAt(I)C

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    add-int/lit8 v3, v3, -0x1

    .line 51
    .line 52
    sub-int v5, v1, v3

    .line 53
    .line 54
    invoke-virtual {p1, v5}, Ljava/lang/String;->charAt(I)C

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    const/16 v6, 0x30

    .line 59
    .line 60
    const/4 v7, 0x0

    .line 61
    if-eq v5, v6, :cond_1

    .line 62
    .line 63
    add-int/lit16 v5, v5, 0x1338

    .line 64
    .line 65
    int-to-char v5, v5

    .line 66
    goto :goto_1

    .line 67
    :cond_1
    move v5, v7

    .line 68
    :goto_1
    if-eq v4, v6, :cond_2

    .line 69
    .line 70
    add-int/lit16 v4, v4, 0x1341

    .line 71
    .line 72
    int-to-char v4, v4

    .line 73
    goto :goto_2

    .line 74
    :cond_2
    move v4, v7

    .line 75
    :goto_2
    rem-int/lit8 v6, v3, 0x4

    .line 76
    .line 77
    div-int/lit8 v6, v6, 0x2

    .line 78
    .line 79
    const/16 v8, 0x137b

    .line 80
    .line 81
    if-eqz v3, :cond_5

    .line 82
    .line 83
    if-eqz v6, :cond_4

    .line 84
    .line 85
    if-nez v5, :cond_3

    .line 86
    .line 87
    if-eqz v4, :cond_5

    .line 88
    .line 89
    :cond_3
    move v6, v8

    .line 90
    goto :goto_3

    .line 91
    :cond_4
    const/16 v6, 0x137c

    .line 92
    .line 93
    goto :goto_3

    .line 94
    :cond_5
    move v6, v7

    .line 95
    :goto_3
    const/16 v9, 0x1369

    .line 96
    .line 97
    if-ne v5, v9, :cond_6

    .line 98
    .line 99
    if-nez v4, :cond_6

    .line 100
    .line 101
    if-le v1, v0, :cond_6

    .line 102
    .line 103
    if-eq v6, v8, :cond_7

    .line 104
    .line 105
    add-int/lit8 v8, v3, 0x1

    .line 106
    .line 107
    if-ne v8, v1, :cond_6

    .line 108
    .line 109
    goto :goto_4

    .line 110
    :cond_6
    move v7, v5

    .line 111
    :cond_7
    :goto_4
    if-eqz v4, :cond_8

    .line 112
    .line 113
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    :cond_8
    if-eqz v7, :cond_9

    .line 117
    .line 118
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    :cond_9
    if-eqz v6, :cond_a

    .line 122
    .line 123
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    :cond_a
    add-int/lit8 v3, v3, -0x1

    .line 127
    .line 128
    goto :goto_0

    .line 129
    :cond_b
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    return-object p1

    .line 134
    :cond_c
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 135
    .line 136
    new-instance v1, Ljava/lang/StringBuilder;

    .line 137
    .line 138
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 139
    .line 140
    .line 141
    const-string v2, "Can only convert positive numbers: "

    .line 142
    .line 143
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    throw v0
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
.end method
