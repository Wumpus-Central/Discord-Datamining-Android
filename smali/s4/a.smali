.class public Ls4/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static a(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 3
    .line 4
    .line 5
    move-result p1

    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    const/4 p0, 0x0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    :goto_0
    return-object p0
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

.method private static b(Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;)Lcom/facebook/drawee/generic/a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->s()Lcom/facebook/drawee/generic/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Lcom/facebook/drawee/generic/a;

    .line 8
    .line 9
    invoke-direct {v0}, Lcom/facebook/drawee/generic/a;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->K(Lcom/facebook/drawee/generic/a;)Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->s()Lcom/facebook/drawee/generic/a;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
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
.end method

.method private static c(Landroid/content/res/TypedArray;I)Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;
    .locals 1

    .line 1
    const/4 v0, -0x2

    .line 2
    invoke-virtual {p0, p1, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 3
    .line 4
    .line 5
    move-result p0

    .line 6
    packed-switch p0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    new-instance p0, Ljava/lang/RuntimeException;

    .line 10
    .line 11
    const-string p1, "XML attribute not specified!"

    .line 12
    .line 13
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    throw p0

    .line 17
    :pswitch_0
    sget-object p0, Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;->k:Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;

    .line 18
    .line 19
    return-object p0

    .line 20
    :pswitch_1
    sget-object p0, Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;->j:Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;

    .line 21
    .line 22
    return-object p0

    .line 23
    :pswitch_2
    sget-object p0, Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;->i:Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;

    .line 24
    .line 25
    return-object p0

    .line 26
    :pswitch_3
    sget-object p0, Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;->h:Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;

    .line 27
    .line 28
    return-object p0

    .line 29
    :pswitch_4
    sget-object p0, Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;->g:Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;

    .line 30
    .line 31
    return-object p0

    .line 32
    :pswitch_5
    sget-object p0, Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;->f:Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;

    .line 33
    .line 34
    return-object p0

    .line 35
    :pswitch_6
    sget-object p0, Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;->e:Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;

    .line 36
    .line 37
    return-object p0

    .line 38
    :pswitch_7
    sget-object p0, Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;->d:Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;

    .line 39
    .line 40
    return-object p0

    .line 41
    :pswitch_8
    sget-object p0, Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;->a:Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;

    .line 42
    .line 43
    return-object p0

    .line 44
    :pswitch_9
    const/4 p0, 0x0

    .line 45
    return-object p0

    .line 46
    nop

    .line 47
    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public static d(Landroid/content/Context;Landroid/util/AttributeSet;)Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;
    .locals 2

    .line 1
    invoke-static {}, Lz5/b;->d()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string v0, "GenericDraweeHierarchyBuilder#inflateBuilder"

    .line 8
    .line 9
    invoke-static {v0}, Lz5/b;->a(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    new-instance v1, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;

    .line 17
    .line 18
    invoke-direct {v1, v0}, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;-><init>(Landroid/content/res/Resources;)V

    .line 19
    .line 20
    .line 21
    invoke-static {v1, p0, p1}, Ls4/a;->e(Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;Landroid/content/Context;Landroid/util/AttributeSet;)Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-static {}, Lz5/b;->d()Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    invoke-static {}, Lz5/b;->b()V

    .line 32
    .line 33
    .line 34
    :cond_1
    return-object p0
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

.method public static e(Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;Landroid/content/Context;Landroid/util/AttributeSet;)Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    if-eqz v2, :cond_26

    .line 1
    sget-object v6, Lj4/a;->d:[I

    .line 2
    invoke-virtual {v1, v2, v6}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v2

    .line 3
    :try_start_0
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x1

    const/4 v9, 0x1

    const/4 v10, 0x1

    const/4 v11, 0x1

    const/4 v12, 0x1

    const/4 v13, 0x1

    const/4 v14, 0x1

    const/4 v15, 0x1

    const/16 v16, 0x0

    :goto_0
    if-ge v7, v6, :cond_1d

    .line 4
    :try_start_1
    invoke-virtual {v2, v7}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v3

    .line 5
    sget v4, Lj4/a;->e:I

    if-ne v3, v4, :cond_0

    .line 6
    invoke-static {v2, v3}, Ls4/a;->c(Landroid/content/res/TypedArray;I)Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->w(Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;)Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;

    goto/16 :goto_1

    .line 7
    :cond_0
    sget v4, Lj4/a;->k:I

    if-ne v3, v4, :cond_1

    .line 8
    invoke-static {v1, v2, v3}, Ls4/a;->a(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->D(Landroid/graphics/drawable/Drawable;)Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;

    goto/16 :goto_1

    .line 9
    :cond_1
    sget v4, Lj4/a;->m:I

    if-ne v3, v4, :cond_2

    .line 10
    invoke-static {v1, v2, v3}, Ls4/a;->a(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->F(Landroid/graphics/drawable/Drawable;)Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;

    goto/16 :goto_1

    .line 11
    :cond_2
    sget v4, Lj4/a;->o:I

    if-ne v3, v4, :cond_3

    .line 12
    invoke-static {v1, v2, v3}, Ls4/a;->a(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->G(Landroid/graphics/drawable/Drawable;)Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;

    goto/16 :goto_1

    .line 13
    :cond_3
    sget v4, Lj4/a;->g:I

    if-ne v3, v4, :cond_4

    const/4 v4, 0x0

    .line 14
    invoke-virtual {v2, v3, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    invoke-virtual {v0, v3}, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->z(I)Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;

    goto :goto_1

    .line 15
    :cond_4
    sget v4, Lj4/a;->G:I

    if-ne v3, v4, :cond_5

    const/4 v4, 0x0

    .line 16
    invoke-virtual {v2, v3, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    invoke-virtual {v0, v3}, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->y(F)Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;

    goto :goto_1

    .line 17
    :cond_5
    sget v4, Lj4/a;->l:I

    if-ne v3, v4, :cond_6

    .line 18
    invoke-static {v2, v3}, Ls4/a;->c(Landroid/content/res/TypedArray;I)Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->E(Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;)Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;

    goto :goto_1

    .line 19
    :cond_6
    sget v4, Lj4/a;->q:I

    if-ne v3, v4, :cond_7

    .line 20
    invoke-static {v1, v2, v3}, Ls4/a;->a(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->I(Landroid/graphics/drawable/Drawable;)Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;

    goto :goto_1

    .line 21
    :cond_7
    sget v4, Lj4/a;->r:I

    if-ne v3, v4, :cond_8

    .line 22
    invoke-static {v2, v3}, Ls4/a;->c(Landroid/content/res/TypedArray;I)Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->J(Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;)Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;

    goto :goto_1

    .line 23
    :cond_8
    sget v4, Lj4/a;->h:I

    if-ne v3, v4, :cond_9

    .line 24
    invoke-static {v1, v2, v3}, Ls4/a;->a(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->A(Landroid/graphics/drawable/Drawable;)Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;

    goto :goto_1

    .line 25
    :cond_9
    sget v4, Lj4/a;->i:I

    if-ne v3, v4, :cond_a

    .line 26
    invoke-static {v2, v3}, Ls4/a;->c(Landroid/content/res/TypedArray;I)Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->B(Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;)Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;

    goto :goto_1

    .line 27
    :cond_a
    sget v4, Lj4/a;->p:I

    if-ne v3, v4, :cond_b

    .line 28
    invoke-static {v2, v3}, Ls4/a;->c(Landroid/content/res/TypedArray;I)Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->H(Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;)Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;

    goto :goto_1

    .line 29
    :cond_b
    sget v4, Lj4/a;->n:I

    if-ne v3, v4, :cond_d

    .line 30
    invoke-virtual {v2, v3, v5}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v5

    :cond_c
    :goto_1
    const/4 v4, 0x0

    goto/16 :goto_3

    .line 31
    :cond_d
    sget v4, Lj4/a;->f:I

    if-ne v3, v4, :cond_e

    .line 32
    invoke-static {v1, v2, v3}, Ls4/a;->a(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->x(Landroid/graphics/drawable/Drawable;)Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;

    goto :goto_1

    .line 33
    :cond_e
    sget v4, Lj4/a;->j:I

    if-ne v3, v4, :cond_f

    .line 34
    invoke-static {v1, v2, v3}, Ls4/a;->a(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->C(Landroid/graphics/drawable/Drawable;)Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;

    goto :goto_1

    .line 35
    :cond_f
    sget v4, Lj4/a;->s:I

    if-ne v3, v4, :cond_10

    .line 36
    invoke-static/range {p0 .. p0}, Ls4/a;->b(Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;)Lcom/facebook/drawee/generic/a;

    move-result-object v4

    const/4 v1, 0x0

    invoke-virtual {v2, v3, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v3

    invoke-virtual {v4, v3}, Lcom/facebook/drawee/generic/a;->t(Z)Lcom/facebook/drawee/generic/a;

    goto :goto_1

    .line 37
    :cond_10
    sget v1, Lj4/a;->C:I

    if-ne v3, v1, :cond_11

    move/from16 v4, v16

    .line 38
    invoke-virtual {v2, v3, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v16

    goto :goto_1

    :cond_11
    move/from16 v4, v16

    .line 39
    sget v1, Lj4/a;->y:I

    if-ne v3, v1, :cond_12

    .line 40
    invoke-virtual {v2, v3, v8}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v8

    :goto_2
    move/from16 v16, v4

    goto :goto_1

    .line 41
    :cond_12
    sget v1, Lj4/a;->z:I

    if-ne v3, v1, :cond_13

    .line 42
    invoke-virtual {v2, v3, v10}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v10

    goto :goto_2

    .line 43
    :cond_13
    sget v1, Lj4/a;->u:I

    if-ne v3, v1, :cond_14

    .line 44
    invoke-virtual {v2, v3, v14}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v14

    goto :goto_2

    .line 45
    :cond_14
    sget v1, Lj4/a;->v:I

    if-ne v3, v1, :cond_15

    .line 46
    invoke-virtual {v2, v3, v12}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v12

    goto :goto_2

    .line 47
    :cond_15
    sget v1, Lj4/a;->A:I

    if-ne v3, v1, :cond_16

    .line 48
    invoke-virtual {v2, v3, v9}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v9

    goto :goto_2

    .line 49
    :cond_16
    sget v1, Lj4/a;->x:I

    if-ne v3, v1, :cond_17

    .line 50
    invoke-virtual {v2, v3, v11}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v11

    goto :goto_2

    .line 51
    :cond_17
    sget v1, Lj4/a;->w:I

    if-ne v3, v1, :cond_18

    .line 52
    invoke-virtual {v2, v3, v15}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v15

    goto :goto_2

    .line 53
    :cond_18
    sget v1, Lj4/a;->t:I

    if-ne v3, v1, :cond_19

    .line 54
    invoke-virtual {v2, v3, v13}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v13

    goto :goto_2

    .line 55
    :cond_19
    sget v1, Lj4/a;->B:I

    if-ne v3, v1, :cond_1a

    .line 56
    invoke-static/range {p0 .. p0}, Ls4/a;->b(Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;)Lcom/facebook/drawee/generic/a;

    move-result-object v1

    move/from16 v16, v4

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v3

    invoke-virtual {v1, v3}, Lcom/facebook/drawee/generic/a;->q(I)Lcom/facebook/drawee/generic/a;

    goto/16 :goto_1

    :cond_1a
    move/from16 v16, v4

    .line 57
    sget v1, Lj4/a;->F:I

    if-ne v3, v1, :cond_1b

    .line 58
    invoke-static/range {p0 .. p0}, Ls4/a;->b(Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;)Lcom/facebook/drawee/generic/a;

    move-result-object v1

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {v1, v3}, Lcom/facebook/drawee/generic/a;->n(F)Lcom/facebook/drawee/generic/a;

    goto/16 :goto_1

    .line 59
    :cond_1b
    sget v1, Lj4/a;->D:I

    if-ne v3, v1, :cond_1c

    .line 60
    invoke-static/range {p0 .. p0}, Ls4/a;->b(Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;)Lcom/facebook/drawee/generic/a;

    move-result-object v1

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v3

    invoke-virtual {v1, v3}, Lcom/facebook/drawee/generic/a;->m(I)Lcom/facebook/drawee/generic/a;

    goto/16 :goto_1

    .line 61
    :cond_1c
    sget v1, Lj4/a;->E:I

    if-ne v3, v1, :cond_c

    .line 62
    invoke-static/range {p0 .. p0}, Ls4/a;->b(Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;)Lcom/facebook/drawee/generic/a;

    move-result-object v1

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {v1, v3}, Lcom/facebook/drawee/generic/a;->r(F)Lcom/facebook/drawee/generic/a;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_3
    add-int/lit8 v7, v7, 0x1

    move-object/from16 v1, p1

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_b

    :cond_1d
    const/4 v4, 0x0

    .line 63
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 64
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Configuration;->getLayoutDirection()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_21

    if-eqz v8, :cond_1e

    if-eqz v11, :cond_1e

    const/4 v1, 0x1

    goto :goto_4

    :cond_1e
    move v1, v4

    :goto_4
    if-eqz v10, :cond_1f

    if-eqz v9, :cond_1f

    const/4 v2, 0x1

    goto :goto_5

    :cond_1f
    move v2, v4

    :goto_5
    if-eqz v12, :cond_20

    if-eqz v15, :cond_20

    const/4 v3, 0x1

    goto :goto_6

    :cond_20
    move v3, v4

    :goto_6
    if-eqz v14, :cond_25

    if-eqz v13, :cond_25

    goto :goto_a

    :cond_21
    if-eqz v8, :cond_22

    if-eqz v9, :cond_22

    const/4 v1, 0x1

    goto :goto_7

    :cond_22
    move v1, v4

    :goto_7
    if-eqz v10, :cond_23

    if-eqz v11, :cond_23

    const/4 v2, 0x1

    goto :goto_8

    :cond_23
    move v2, v4

    :goto_8
    if-eqz v12, :cond_24

    if-eqz v13, :cond_24

    const/4 v3, 0x1

    goto :goto_9

    :cond_24
    move v3, v4

    :goto_9
    if-eqz v14, :cond_25

    if-eqz v15, :cond_25

    :goto_a
    const/4 v4, 0x1

    :cond_25
    move v6, v4

    move v4, v5

    move v5, v1

    move/from16 v1, v16

    goto :goto_c

    :catchall_1
    move-exception v0

    const/4 v8, 0x1

    const/4 v9, 0x1

    const/4 v10, 0x1

    const/4 v11, 0x1

    const/4 v12, 0x1

    const/4 v13, 0x1

    const/4 v14, 0x1

    const/4 v15, 0x1

    .line 65
    :goto_b
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 66
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Configuration;->getLayoutDirection()I

    move-result v1

    const/4 v2, 0x1

    .line 67
    throw v0

    :cond_26
    const/4 v2, 0x1

    const/4 v4, 0x0

    move v3, v2

    move v5, v3

    move v6, v5

    move v1, v4

    .line 68
    :goto_c
    invoke-virtual/range {p0 .. p0}, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->n()Landroid/graphics/drawable/Drawable;

    move-result-object v7

    if-eqz v7, :cond_27

    if-lez v4, :cond_27

    .line 69
    new-instance v7, Lcom/facebook/drawee/drawable/b;

    .line 70
    invoke-virtual/range {p0 .. p0}, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->n()Landroid/graphics/drawable/Drawable;

    move-result-object v8

    invoke-direct {v7, v8, v4}, Lcom/facebook/drawee/drawable/b;-><init>(Landroid/graphics/drawable/Drawable;I)V

    .line 71
    invoke-virtual {v0, v7}, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->G(Landroid/graphics/drawable/Drawable;)Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;

    :cond_27
    if-lez v1, :cond_2c

    .line 72
    invoke-static/range {p0 .. p0}, Ls4/a;->b(Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;)Lcom/facebook/drawee/generic/a;

    move-result-object v4

    if-eqz v5, :cond_28

    int-to-float v5, v1

    goto :goto_d

    :cond_28
    const/4 v5, 0x0

    :goto_d
    if-eqz v2, :cond_29

    int-to-float v2, v1

    goto :goto_e

    :cond_29
    const/4 v2, 0x0

    :goto_e
    if-eqz v3, :cond_2a

    int-to-float v3, v1

    goto :goto_f

    :cond_2a
    const/4 v3, 0x0

    :goto_f
    if-eqz v6, :cond_2b

    int-to-float v1, v1

    goto :goto_10

    :cond_2b
    const/4 v1, 0x0

    .line 73
    :goto_10
    invoke-virtual {v4, v5, v2, v3, v1}, Lcom/facebook/drawee/generic/a;->o(FFFF)Lcom/facebook/drawee/generic/a;

    :cond_2c
    return-object v0
.end method
