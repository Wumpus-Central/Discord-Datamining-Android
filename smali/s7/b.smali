.class final Ls7/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls7/b$e;,
        Ls7/b$d;,
        Ls7/b$b;,
        Ls7/b$c;,
        Ls7/b$f;,
        Ls7/b$a;
    }
.end annotation


# static fields
.field private static final a:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "OpusHead"

    .line 2
    .line 3
    invoke-static {v0}, Lf9/q0;->l0(Ljava/lang/String;)[B

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Ls7/b;->a:[B

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
.end method

.method public static A(Ls7/a$b;)Landroid/util/Pair;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls7/a$b;",
            ")",
            "Landroid/util/Pair<",
            "Ly7/a;",
            "Ly7/a;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Ls7/a$b;->b:Lf9/y;

    .line 2
    .line 3
    const/16 v0, 0x8

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lf9/y;->P(I)V

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    move-object v2, v1

    .line 10
    :goto_0
    invoke-virtual {p0}, Lf9/y;->a()I

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    if-lt v3, v0, :cond_2

    .line 15
    .line 16
    invoke-virtual {p0}, Lf9/y;->e()I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    invoke-virtual {p0}, Lf9/y;->n()I

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    invoke-virtual {p0}, Lf9/y;->n()I

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    const v6, 0x6d657461

    .line 29
    .line 30
    .line 31
    if-ne v5, v6, :cond_0

    .line 32
    .line 33
    invoke-virtual {p0, v3}, Lf9/y;->P(I)V

    .line 34
    .line 35
    .line 36
    add-int v1, v3, v4

    .line 37
    .line 38
    invoke-static {p0, v1}, Ls7/b;->B(Lf9/y;I)Ly7/a;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    goto :goto_1

    .line 43
    :cond_0
    const v6, 0x736d7461

    .line 44
    .line 45
    .line 46
    if-ne v5, v6, :cond_1

    .line 47
    .line 48
    invoke-virtual {p0, v3}, Lf9/y;->P(I)V

    .line 49
    .line 50
    .line 51
    add-int v2, v3, v4

    .line 52
    .line 53
    invoke-static {p0, v2}, Ls7/b;->t(Lf9/y;I)Ly7/a;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    :cond_1
    :goto_1
    add-int/2addr v3, v4

    .line 58
    invoke-virtual {p0, v3}, Lf9/y;->P(I)V

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    invoke-static {v1, v2}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    return-object p0
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
.end method

.method private static B(Lf9/y;I)Ly7/a;
    .locals 4

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lf9/y;->Q(I)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Ls7/b;->d(Lf9/y;)V

    .line 7
    .line 8
    .line 9
    :goto_0
    invoke-virtual {p0}, Lf9/y;->e()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-ge v0, p1, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0}, Lf9/y;->e()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-virtual {p0}, Lf9/y;->n()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    invoke-virtual {p0}, Lf9/y;->n()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    const v3, 0x696c7374

    .line 28
    .line 29
    .line 30
    if-ne v2, v3, :cond_0

    .line 31
    .line 32
    invoke-virtual {p0, v0}, Lf9/y;->P(I)V

    .line 33
    .line 34
    .line 35
    add-int/2addr v0, v1

    .line 36
    invoke-static {p0, v0}, Ls7/b;->k(Lf9/y;I)Ly7/a;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0

    .line 41
    :cond_0
    add-int/2addr v0, v1

    .line 42
    invoke-virtual {p0, v0}, Lf9/y;->P(I)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    const/4 p0, 0x0

    .line 47
    return-object p0
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
.end method

.method private static C(Lf9/y;IIIIILj7/l;Ls7/b$c;I)V
    .locals 18

    move-object/from16 v0, p0

    move/from16 v1, p2

    move/from16 v2, p3

    move-object/from16 v3, p6

    move-object/from16 v4, p7

    add-int/lit8 v5, v1, 0x8

    add-int/lit8 v5, v5, 0x8

    .line 1
    invoke-virtual {v0, v5}, Lf9/y;->P(I)V

    const/16 v5, 0x10

    .line 2
    invoke-virtual {v0, v5}, Lf9/y;->Q(I)V

    .line 3
    invoke-virtual/range {p0 .. p0}, Lf9/y;->J()I

    move-result v5

    .line 4
    invoke-virtual/range {p0 .. p0}, Lf9/y;->J()I

    move-result v6

    const/16 v7, 0x32

    .line 5
    invoke-virtual {v0, v7}, Lf9/y;->Q(I)V

    .line 6
    invoke-virtual/range {p0 .. p0}, Lf9/y;->e()I

    move-result v7

    const v8, 0x656e6376

    const/4 v9, 0x0

    move/from16 v10, p1

    if-ne v10, v8, :cond_2

    .line 7
    invoke-static {v0, v1, v2}, Ls7/b;->r(Lf9/y;II)Landroid/util/Pair;

    move-result-object v8

    if-eqz v8, :cond_1

    .line 8
    iget-object v10, v8, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v10, Ljava/lang/Integer;

    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v10

    if-nez v3, :cond_0

    move-object v3, v9

    goto :goto_0

    .line 9
    :cond_0
    iget-object v11, v8, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v11, Ls7/p;

    iget-object v11, v11, Ls7/p;->b:Ljava/lang/String;

    invoke-virtual {v3, v11}, Lj7/l;->C(Ljava/lang/String;)Lj7/l;

    move-result-object v3

    .line 10
    :goto_0
    iget-object v11, v4, Ls7/b$c;->a:[Ls7/p;

    iget-object v8, v8, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v8, Ls7/p;

    aput-object v8, v11, p8

    .line 11
    :cond_1
    invoke-virtual {v0, v7}, Lf9/y;->P(I)V

    :cond_2
    const v8, 0x6d317620

    if-ne v10, v8, :cond_3

    const-string v8, "video/mpeg"

    goto :goto_1

    :cond_3
    move-object v8, v9

    :goto_1
    const/high16 v12, 0x3f800000    # 1.0f

    const/4 v13, -0x1

    move v14, v12

    move v15, v13

    const/16 v16, 0x0

    move-object v12, v9

    move-object v13, v12

    :goto_2
    sub-int v11, v7, v1

    if-ge v11, v2, :cond_1d

    .line 12
    invoke-virtual {v0, v7}, Lf9/y;->P(I)V

    .line 13
    invoke-virtual/range {p0 .. p0}, Lf9/y;->e()I

    move-result v11

    move-object/from16 p6, v3

    .line 14
    invoke-virtual/range {p0 .. p0}, Lf9/y;->n()I

    move-result v3

    if-nez v3, :cond_4

    .line 15
    invoke-virtual/range {p0 .. p0}, Lf9/y;->e()I

    move-result v17

    move-object/from16 p8, v13

    sub-int v13, v17, v1

    if-ne v13, v2, :cond_5

    goto/16 :goto_f

    :cond_4
    move-object/from16 p8, v13

    :cond_5
    if-lez v3, :cond_6

    const/4 v13, 0x1

    goto :goto_3

    :cond_6
    const/4 v13, 0x0

    :goto_3
    const-string v1, "childAtomSize should be positive"

    .line 16
    invoke-static {v13, v1}, Lf9/a;->g(ZLjava/lang/Object;)V

    .line 17
    invoke-virtual/range {p0 .. p0}, Lf9/y;->n()I

    move-result v1

    const v13, 0x61766343

    if-ne v1, v13, :cond_9

    if-nez v8, :cond_7

    const/4 v13, 0x1

    goto :goto_4

    :cond_7
    const/4 v13, 0x0

    .line 18
    :goto_4
    invoke-static {v13}, Lf9/a;->f(Z)V

    add-int/lit8 v11, v11, 0x8

    .line 19
    invoke-virtual {v0, v11}, Lf9/y;->P(I)V

    .line 20
    invoke-static/range {p0 .. p0}, Lg9/a;->b(Lf9/y;)Lg9/a;

    move-result-object v1

    .line 21
    iget-object v8, v1, Lg9/a;->a:Ljava/util/List;

    .line 22
    iget v9, v1, Lg9/a;->b:I

    iput v9, v4, Ls7/b$c;->c:I

    if-nez v16, :cond_8

    .line 23
    iget v14, v1, Lg9/a;->e:F

    .line 24
    :cond_8
    iget-object v1, v1, Lg9/a;->f:Ljava/lang/String;

    const-string v9, "video/avc"

    goto :goto_6

    :cond_9
    const v13, 0x68766343

    if-ne v1, v13, :cond_b

    if-nez v8, :cond_a

    const/4 v13, 0x1

    goto :goto_5

    :cond_a
    const/4 v13, 0x0

    .line 25
    :goto_5
    invoke-static {v13}, Lf9/a;->f(Z)V

    add-int/lit8 v11, v11, 0x8

    .line 26
    invoke-virtual {v0, v11}, Lf9/y;->P(I)V

    .line 27
    invoke-static/range {p0 .. p0}, Lg9/f;->a(Lf9/y;)Lg9/f;

    move-result-object v1

    .line 28
    iget-object v8, v1, Lg9/f;->a:Ljava/util/List;

    .line 29
    iget v9, v1, Lg9/f;->b:I

    iput v9, v4, Ls7/b$c;->c:I

    .line 30
    iget-object v1, v1, Lg9/f;->c:Ljava/lang/String;

    const-string v9, "video/hevc"

    :goto_6
    move-object v13, v8

    move-object v8, v9

    move-object v9, v1

    goto/16 :goto_e

    :cond_b
    const v13, 0x64766343

    if-eq v1, v13, :cond_1b

    const v13, 0x64767643

    if-ne v1, v13, :cond_c

    goto/16 :goto_c

    :cond_c
    const v13, 0x76706343

    if-ne v1, v13, :cond_f

    if-nez v8, :cond_d

    const/4 v13, 0x1

    goto :goto_7

    :cond_d
    const/4 v13, 0x0

    .line 31
    :goto_7
    invoke-static {v13}, Lf9/a;->f(Z)V

    const v1, 0x76703038

    if-ne v10, v1, :cond_e

    const-string v1, "video/x-vnd.on2.vp8"

    goto :goto_9

    :cond_e
    const-string v1, "video/x-vnd.on2.vp9"

    goto :goto_9

    :cond_f
    const v13, 0x61763143

    if-ne v1, v13, :cond_11

    if-nez v8, :cond_10

    const/4 v13, 0x1

    goto :goto_8

    :cond_10
    const/4 v13, 0x0

    .line 32
    :goto_8
    invoke-static {v13}, Lf9/a;->f(Z)V

    const-string v1, "video/av01"

    :goto_9
    move-object/from16 v13, p8

    move-object v8, v1

    goto/16 :goto_e

    :cond_11
    const v13, 0x64323633

    if-ne v1, v13, :cond_13

    if-nez v8, :cond_12

    const/4 v13, 0x1

    goto :goto_a

    :cond_12
    const/4 v13, 0x0

    .line 33
    :goto_a
    invoke-static {v13}, Lf9/a;->f(Z)V

    const-string v1, "video/3gpp"

    goto :goto_9

    :cond_13
    const v13, 0x65736473

    if-ne v1, v13, :cond_15

    if-nez v8, :cond_14

    const/4 v13, 0x1

    goto :goto_b

    :cond_14
    const/4 v13, 0x0

    .line 34
    :goto_b
    invoke-static {v13}, Lf9/a;->f(Z)V

    .line 35
    invoke-static {v0, v11}, Ls7/b;->h(Lf9/y;I)Landroid/util/Pair;

    move-result-object v1

    .line 36
    iget-object v8, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    .line 37
    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v1, [B

    if-eqz v1, :cond_1c

    .line 38
    invoke-static {v1}, Lbc/i0;->y(Ljava/lang/Object;)Lbc/i0;

    move-result-object v13

    goto :goto_e

    :cond_15
    const v13, 0x70617370

    if-ne v1, v13, :cond_16

    .line 39
    invoke-static {v0, v11}, Ls7/b;->p(Lf9/y;I)F

    move-result v1

    move-object/from16 v13, p8

    move v14, v1

    const/16 v16, 0x1

    goto :goto_e

    :cond_16
    const v13, 0x73763364

    if-ne v1, v13, :cond_17

    .line 40
    invoke-static {v0, v11, v3}, Ls7/b;->q(Lf9/y;II)[B

    move-result-object v1

    move-object/from16 v13, p8

    move-object v12, v1

    goto :goto_e

    :cond_17
    const v11, 0x73743364

    if-ne v1, v11, :cond_1c

    .line 41
    invoke-virtual/range {p0 .. p0}, Lf9/y;->D()I

    move-result v1

    const/4 v11, 0x3

    .line 42
    invoke-virtual {v0, v11}, Lf9/y;->Q(I)V

    if-nez v1, :cond_1c

    .line 43
    invoke-virtual/range {p0 .. p0}, Lf9/y;->D()I

    move-result v1

    if-eqz v1, :cond_1a

    const/4 v13, 0x1

    if-eq v1, v13, :cond_19

    const/4 v13, 0x2

    if-eq v1, v13, :cond_19

    if-eq v1, v11, :cond_18

    goto :goto_d

    :cond_18
    move-object/from16 v13, p8

    move v15, v11

    goto :goto_e

    :cond_19
    move v15, v13

    goto :goto_d

    :cond_1a
    move-object/from16 v13, p8

    const/4 v15, 0x0

    goto :goto_e

    .line 44
    :cond_1b
    :goto_c
    invoke-static/range {p0 .. p0}, Lg9/c;->a(Lf9/y;)Lg9/c;

    move-result-object v1

    if-eqz v1, :cond_1c

    .line 45
    iget-object v9, v1, Lg9/c;->c:Ljava/lang/String;

    const-string v8, "video/dolby-vision"

    :cond_1c
    :goto_d
    move-object/from16 v13, p8

    :goto_e
    add-int/2addr v7, v3

    move/from16 v1, p2

    move-object/from16 v3, p6

    goto/16 :goto_2

    :cond_1d
    move-object/from16 p6, v3

    move-object/from16 p8, v13

    :goto_f
    if-nez v8, :cond_1e

    return-void

    .line 46
    :cond_1e
    new-instance v0, Ld7/k$b;

    invoke-direct {v0}, Ld7/k$b;-><init>()V

    move/from16 v1, p4

    .line 47
    invoke-virtual {v0, v1}, Ld7/k$b;->R(I)Ld7/k$b;

    move-result-object v0

    .line 48
    invoke-virtual {v0, v8}, Ld7/k$b;->e0(Ljava/lang/String;)Ld7/k$b;

    move-result-object v0

    .line 49
    invoke-virtual {v0, v9}, Ld7/k$b;->I(Ljava/lang/String;)Ld7/k$b;

    move-result-object v0

    .line 50
    invoke-virtual {v0, v5}, Ld7/k$b;->j0(I)Ld7/k$b;

    move-result-object v0

    .line 51
    invoke-virtual {v0, v6}, Ld7/k$b;->Q(I)Ld7/k$b;

    move-result-object v0

    .line 52
    invoke-virtual {v0, v14}, Ld7/k$b;->a0(F)Ld7/k$b;

    move-result-object v0

    move/from16 v1, p5

    .line 53
    invoke-virtual {v0, v1}, Ld7/k$b;->d0(I)Ld7/k$b;

    move-result-object v0

    .line 54
    invoke-virtual {v0, v12}, Ld7/k$b;->b0([B)Ld7/k$b;

    move-result-object v0

    .line 55
    invoke-virtual {v0, v15}, Ld7/k$b;->h0(I)Ld7/k$b;

    move-result-object v0

    move-object/from16 v9, p8

    .line 56
    invoke-virtual {v0, v9}, Ld7/k$b;->T(Ljava/util/List;)Ld7/k$b;

    move-result-object v0

    move-object/from16 v3, p6

    .line 57
    invoke-virtual {v0, v3}, Ld7/k$b;->L(Lj7/l;)Ld7/k$b;

    move-result-object v0

    .line 58
    invoke-virtual {v0}, Ld7/k$b;->E()Ld7/k;

    move-result-object v0

    iput-object v0, v4, Ls7/b$c;->b:Ld7/k;

    return-void
.end method

.method private static a([JJJJ)Z
    .locals 7

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, 0x1

    .line 3
    sub-int/2addr v0, v1

    .line 4
    const/4 v2, 0x4

    .line 5
    const/4 v3, 0x0

    .line 6
    invoke-static {v2, v3, v0}, Lf9/q0;->r(III)I

    .line 7
    .line 8
    .line 9
    move-result v4

    .line 10
    array-length v5, p0

    .line 11
    sub-int/2addr v5, v2

    .line 12
    invoke-static {v5, v3, v0}, Lf9/q0;->r(III)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    aget-wide v5, p0, v3

    .line 17
    .line 18
    cmp-long v2, v5, p3

    .line 19
    .line 20
    if-gtz v2, :cond_0

    .line 21
    .line 22
    aget-wide v4, p0, v4

    .line 23
    .line 24
    cmp-long p3, p3, v4

    .line 25
    .line 26
    if-gez p3, :cond_0

    .line 27
    .line 28
    aget-wide p3, p0, v0

    .line 29
    .line 30
    cmp-long p0, p3, p5

    .line 31
    .line 32
    if-gez p0, :cond_0

    .line 33
    .line 34
    cmp-long p0, p5, p1

    .line 35
    .line 36
    if-gtz p0, :cond_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    move v1, v3

    .line 40
    :goto_0
    return v1
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
.end method

.method private static b(Lf9/y;II)I
    .locals 4

    .line 1
    invoke-virtual {p0}, Lf9/y;->e()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    :goto_0
    sub-int v1, v0, p1

    .line 6
    .line 7
    if-ge v1, p2, :cond_2

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lf9/y;->P(I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lf9/y;->n()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-lez v1, :cond_0

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    goto :goto_1

    .line 20
    :cond_0
    const/4 v2, 0x0

    .line 21
    :goto_1
    const-string v3, "childAtomSize should be positive"

    .line 22
    .line 23
    invoke-static {v2, v3}, Lf9/a;->g(ZLjava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lf9/y;->n()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    const v3, 0x65736473

    .line 31
    .line 32
    .line 33
    if-ne v2, v3, :cond_1

    .line 34
    .line 35
    return v0

    .line 36
    :cond_1
    add-int/2addr v0, v1

    .line 37
    goto :goto_0

    .line 38
    :cond_2
    const/4 p0, -0x1

    .line 39
    return p0
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
.end method

.method private static c(I)I
    .locals 1

    const v0, 0x736f756e

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const v0, 0x76696465

    if-ne p0, v0, :cond_1

    const/4 p0, 0x2

    return p0

    :cond_1
    const v0, 0x74657874

    if-eq p0, v0, :cond_4

    const v0, 0x7362746c

    if-eq p0, v0, :cond_4

    const v0, 0x73756274

    if-eq p0, v0, :cond_4

    const v0, 0x636c6370

    if-ne p0, v0, :cond_2

    goto :goto_0

    :cond_2
    const v0, 0x6d657461

    if-ne p0, v0, :cond_3

    const/4 p0, 0x5

    return p0

    :cond_3
    const/4 p0, -0x1

    return p0

    :cond_4
    :goto_0
    const/4 p0, 0x3

    return p0
.end method

.method public static d(Lf9/y;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lf9/y;->e()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x4

    .line 6
    invoke-virtual {p0, v1}, Lf9/y;->Q(I)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lf9/y;->n()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const v2, 0x68646c72    # 4.3148E24f

    .line 14
    .line 15
    .line 16
    if-eq v1, v2, :cond_0

    .line 17
    .line 18
    add-int/lit8 v0, v0, 0x4

    .line 19
    .line 20
    :cond_0
    invoke-virtual {p0, v0}, Lf9/y;->P(I)V

    .line 21
    .line 22
    .line 23
    return-void
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
.end method

.method private static e(Lf9/y;IIIILjava/lang/String;ZLj7/l;Ls7/b$c;I)V
    .locals 20

    move-object/from16 v0, p0

    move/from16 v1, p2

    move/from16 v2, p3

    move/from16 v3, p4

    move-object/from16 v4, p5

    move-object/from16 v5, p7

    move-object/from16 v6, p8

    add-int/lit8 v7, v1, 0x8

    const/16 v8, 0x8

    add-int/2addr v7, v8

    .line 1
    invoke-virtual {v0, v7}, Lf9/y;->P(I)V

    const/4 v7, 0x6

    if-eqz p6, :cond_0

    .line 2
    invoke-virtual/range {p0 .. p0}, Lf9/y;->J()I

    move-result v8

    .line 3
    invoke-virtual {v0, v7}, Lf9/y;->Q(I)V

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {v0, v8}, Lf9/y;->Q(I)V

    const/4 v8, 0x0

    :goto_0
    const/16 v10, 0x10

    const/4 v11, 0x2

    const/4 v12, 0x1

    if-eqz v8, :cond_3

    if-ne v8, v12, :cond_1

    goto :goto_1

    :cond_1
    if-ne v8, v11, :cond_2

    .line 5
    invoke-virtual {v0, v10}, Lf9/y;->Q(I)V

    .line 6
    invoke-virtual/range {p0 .. p0}, Lf9/y;->l()D

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Math;->round(D)J

    move-result-wide v7

    long-to-int v7, v7

    .line 7
    invoke-virtual/range {p0 .. p0}, Lf9/y;->H()I

    move-result v8

    const/16 v10, 0x14

    .line 8
    invoke-virtual {v0, v10}, Lf9/y;->Q(I)V

    goto :goto_2

    :cond_2
    return-void

    .line 9
    :cond_3
    :goto_1
    invoke-virtual/range {p0 .. p0}, Lf9/y;->J()I

    move-result v13

    .line 10
    invoke-virtual {v0, v7}, Lf9/y;->Q(I)V

    .line 11
    invoke-virtual/range {p0 .. p0}, Lf9/y;->E()I

    move-result v7

    if-ne v8, v12, :cond_4

    .line 12
    invoke-virtual {v0, v10}, Lf9/y;->Q(I)V

    :cond_4
    move v8, v13

    .line 13
    :goto_2
    invoke-virtual/range {p0 .. p0}, Lf9/y;->e()I

    move-result v10

    const v13, 0x656e6361

    move/from16 v15, p1

    if-ne v15, v13, :cond_7

    .line 14
    invoke-static {v0, v1, v2}, Ls7/b;->r(Lf9/y;II)Landroid/util/Pair;

    move-result-object v13

    if-eqz v13, :cond_6

    .line 15
    iget-object v15, v13, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v15, Ljava/lang/Integer;

    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    move-result v15

    if-nez v5, :cond_5

    const/4 v14, 0x0

    goto :goto_3

    .line 16
    :cond_5
    iget-object v14, v13, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v14, Ls7/p;

    iget-object v14, v14, Ls7/p;->b:Ljava/lang/String;

    invoke-virtual {v5, v14}, Lj7/l;->C(Ljava/lang/String;)Lj7/l;

    move-result-object v5

    move-object v14, v5

    .line 17
    :goto_3
    iget-object v5, v6, Ls7/b$c;->a:[Ls7/p;

    iget-object v13, v13, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v13, Ls7/p;

    aput-object v13, v5, p9

    goto :goto_4

    :cond_6
    move-object v14, v5

    .line 18
    :goto_4
    invoke-virtual {v0, v10}, Lf9/y;->P(I)V

    goto :goto_5

    :cond_7
    move-object v14, v5

    :goto_5
    const v5, 0x61632d33

    const v13, 0x616c6163

    if-ne v15, v5, :cond_8

    const-string v5, "audio/ac3"

    :goto_6
    move-object/from16 v18, v5

    const/4 v5, -0x1

    goto/16 :goto_a

    :cond_8
    const v5, 0x65632d33

    if-ne v15, v5, :cond_9

    const-string v5, "audio/eac3"

    goto :goto_6

    :cond_9
    const v5, 0x61632d34

    if-ne v15, v5, :cond_a

    const-string v5, "audio/ac4"

    goto :goto_6

    :cond_a
    const v5, 0x64747363

    if-ne v15, v5, :cond_b

    const-string v5, "audio/vnd.dts"

    goto :goto_6

    :cond_b
    const v5, 0x64747368

    if-eq v15, v5, :cond_1a

    const v5, 0x6474736c

    if-ne v15, v5, :cond_c

    goto/16 :goto_9

    :cond_c
    const v5, 0x64747365

    if-ne v15, v5, :cond_d

    const-string v5, "audio/vnd.dts.hd;profile=lbr"

    goto :goto_6

    :cond_d
    const v5, 0x73616d72

    if-ne v15, v5, :cond_e

    const-string v5, "audio/3gpp"

    goto :goto_6

    :cond_e
    const v5, 0x73617762

    if-ne v15, v5, :cond_f

    const-string v5, "audio/amr-wb"

    goto :goto_6

    :cond_f
    const v5, 0x6c70636d

    const-string v18, "audio/raw"

    if-eq v15, v5, :cond_19

    const v5, 0x736f7774

    if-ne v15, v5, :cond_10

    goto :goto_8

    :cond_10
    const v5, 0x74776f73

    if-ne v15, v5, :cond_11

    const/high16 v5, 0x10000000

    goto :goto_a

    :cond_11
    const v5, 0x2e6d7032

    if-eq v15, v5, :cond_18

    const v5, 0x2e6d7033

    if-ne v15, v5, :cond_12

    goto :goto_7

    :cond_12
    if-ne v15, v13, :cond_13

    const-string v5, "audio/alac"

    goto :goto_6

    :cond_13
    const v5, 0x616c6177

    if-ne v15, v5, :cond_14

    const-string v5, "audio/g711-alaw"

    goto :goto_6

    :cond_14
    const v5, 0x756c6177

    if-ne v15, v5, :cond_15

    const-string v5, "audio/g711-mlaw"

    goto :goto_6

    :cond_15
    const v5, 0x4f707573

    if-ne v15, v5, :cond_16

    const-string v5, "audio/opus"

    goto :goto_6

    :cond_16
    const v5, 0x664c6143

    if-ne v15, v5, :cond_17

    const-string v5, "audio/flac"

    goto/16 :goto_6

    :cond_17
    const/4 v5, -0x1

    const/16 v18, 0x0

    goto :goto_a

    :cond_18
    :goto_7
    const-string v5, "audio/mpeg"

    goto/16 :goto_6

    :cond_19
    :goto_8
    const/4 v5, 0x2

    goto :goto_a

    :cond_1a
    :goto_9
    const-string v5, "audio/vnd.dts.hd"

    goto/16 :goto_6

    :goto_a
    move-object/from16 v11, v18

    const/4 v15, 0x0

    const/16 v19, 0x0

    :goto_b
    sub-int v13, v10, v1

    if-ge v13, v2, :cond_28

    .line 19
    invoke-virtual {v0, v10}, Lf9/y;->P(I)V

    .line 20
    invoke-virtual/range {p0 .. p0}, Lf9/y;->n()I

    move-result v13

    if-lez v13, :cond_1b

    goto :goto_c

    :cond_1b
    const/4 v12, 0x0

    :goto_c
    const-string v9, "childAtomSize should be positive"

    .line 21
    invoke-static {v12, v9}, Lf9/a;->g(ZLjava/lang/Object;)V

    .line 22
    invoke-virtual/range {p0 .. p0}, Lf9/y;->n()I

    move-result v9

    const v12, 0x65736473

    if-eq v9, v12, :cond_24

    if-eqz p6, :cond_1c

    const v12, 0x77617665

    if-ne v9, v12, :cond_1c

    const v1, 0x65736473

    const/4 v2, 0x0

    const/4 v12, 0x1

    const/16 v16, 0x2

    goto/16 :goto_f

    :cond_1c
    const v12, 0x64616333

    if-ne v9, v12, :cond_1d

    add-int/lit8 v9, v10, 0x8

    .line 23
    invoke-virtual {v0, v9}, Lf9/y;->P(I)V

    .line 24
    invoke-static/range {p4 .. p4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v9

    invoke-static {v0, v9, v4, v14}, Lf7/b;->c(Lf9/y;Ljava/lang/String;Ljava/lang/String;Lj7/l;)Ld7/k;

    move-result-object v9

    iput-object v9, v6, Ls7/b$c;->b:Ld7/k;

    :goto_d
    const v1, 0x616c6163

    const/4 v9, 0x0

    const/4 v12, 0x1

    const/16 v16, 0x2

    goto/16 :goto_e

    :cond_1d
    const v12, 0x64656333

    if-ne v9, v12, :cond_1e

    add-int/lit8 v9, v10, 0x8

    .line 25
    invoke-virtual {v0, v9}, Lf9/y;->P(I)V

    .line 26
    invoke-static/range {p4 .. p4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v9

    invoke-static {v0, v9, v4, v14}, Lf7/b;->g(Lf9/y;Ljava/lang/String;Ljava/lang/String;Lj7/l;)Ld7/k;

    move-result-object v9

    iput-object v9, v6, Ls7/b$c;->b:Ld7/k;

    goto :goto_d

    :cond_1e
    const v12, 0x64616334

    if-ne v9, v12, :cond_1f

    add-int/lit8 v9, v10, 0x8

    .line 27
    invoke-virtual {v0, v9}, Lf9/y;->P(I)V

    .line 28
    invoke-static/range {p4 .. p4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v9

    invoke-static {v0, v9, v4, v14}, Lf7/c;->b(Lf9/y;Ljava/lang/String;Ljava/lang/String;Lj7/l;)Ld7/k;

    move-result-object v9

    iput-object v9, v6, Ls7/b$c;->b:Ld7/k;

    goto :goto_d

    :cond_1f
    const v12, 0x64647473

    if-ne v9, v12, :cond_20

    .line 29
    new-instance v9, Ld7/k$b;

    invoke-direct {v9}, Ld7/k$b;-><init>()V

    .line 30
    invoke-virtual {v9, v3}, Ld7/k$b;->R(I)Ld7/k$b;

    move-result-object v9

    .line 31
    invoke-virtual {v9, v11}, Ld7/k$b;->e0(Ljava/lang/String;)Ld7/k$b;

    move-result-object v9

    .line 32
    invoke-virtual {v9, v8}, Ld7/k$b;->H(I)Ld7/k$b;

    move-result-object v9

    .line 33
    invoke-virtual {v9, v7}, Ld7/k$b;->f0(I)Ld7/k$b;

    move-result-object v9

    .line 34
    invoke-virtual {v9, v14}, Ld7/k$b;->L(Lj7/l;)Ld7/k$b;

    move-result-object v9

    .line 35
    invoke-virtual {v9, v4}, Ld7/k$b;->V(Ljava/lang/String;)Ld7/k$b;

    move-result-object v9

    .line 36
    invoke-virtual {v9}, Ld7/k$b;->E()Ld7/k;

    move-result-object v9

    iput-object v9, v6, Ls7/b$c;->b:Ld7/k;

    goto :goto_d

    :cond_20
    const v12, 0x644f7073

    if-ne v9, v12, :cond_21

    add-int/lit8 v9, v13, -0x8

    .line 37
    sget-object v12, Ls7/b;->a:[B

    array-length v1, v12

    add-int/2addr v1, v9

    invoke-static {v12, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v1

    add-int/lit8 v2, v10, 0x8

    .line 38
    invoke-virtual {v0, v2}, Lf9/y;->P(I)V

    .line 39
    array-length v2, v12

    invoke-virtual {v0, v1, v2, v9}, Lf9/y;->j([BII)V

    .line 40
    invoke-static {v1}, Lf7/m0;->a([B)Ljava/util/List;

    move-result-object v1

    move-object/from16 v19, v1

    const/4 v9, -0x1

    const/4 v12, 0x1

    const/16 v16, 0x2

    goto/16 :goto_11

    :cond_21
    const v1, 0x64664c61

    if-ne v9, v1, :cond_22

    add-int/lit8 v1, v13, -0xc

    add-int/lit8 v2, v1, 0x4

    .line 41
    new-array v2, v2, [B

    const/16 v9, 0x66

    const/4 v12, 0x0

    .line 42
    aput-byte v9, v2, v12

    const/16 v9, 0x4c

    const/4 v12, 0x1

    .line 43
    aput-byte v9, v2, v12

    const/16 v9, 0x61

    const/16 v16, 0x2

    .line 44
    aput-byte v9, v2, v16

    const/4 v9, 0x3

    const/16 v17, 0x43

    .line 45
    aput-byte v17, v2, v9

    add-int/lit8 v9, v10, 0xc

    .line 46
    invoke-virtual {v0, v9}, Lf9/y;->P(I)V

    const/4 v9, 0x4

    .line 47
    invoke-virtual {v0, v2, v9, v1}, Lf9/y;->j([BII)V

    .line 48
    invoke-static {v2}, Lbc/i0;->y(Ljava/lang/Object;)Lbc/i0;

    move-result-object v1

    move-object/from16 v19, v1

    goto :goto_e

    :cond_22
    const v1, 0x616c6163

    const/4 v12, 0x1

    const/16 v16, 0x2

    if-ne v9, v1, :cond_23

    add-int/lit8 v2, v13, -0xc

    .line 49
    new-array v7, v2, [B

    add-int/lit8 v8, v10, 0xc

    .line 50
    invoke-virtual {v0, v8}, Lf9/y;->P(I)V

    const/4 v9, 0x0

    .line 51
    invoke-virtual {v0, v7, v9, v2}, Lf9/y;->j([BII)V

    .line 52
    invoke-static {v7}, Lf9/d;->g([B)Landroid/util/Pair;

    move-result-object v2

    .line 53
    iget-object v8, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v8, Ljava/lang/Integer;

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    .line 54
    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    .line 55
    invoke-static {v7}, Lbc/i0;->y(Ljava/lang/Object;)Lbc/i0;

    move-result-object v7

    move-object/from16 v19, v7

    move v7, v8

    const/4 v9, -0x1

    move v8, v2

    goto :goto_11

    :cond_23
    const/4 v9, 0x0

    :goto_e
    const/4 v9, -0x1

    goto :goto_11

    :cond_24
    const/4 v2, 0x0

    const/4 v12, 0x1

    const/16 v16, 0x2

    const v1, 0x65736473

    :goto_f
    if-ne v9, v1, :cond_25

    move v1, v10

    goto :goto_10

    .line 56
    :cond_25
    invoke-static {v0, v10, v13}, Ls7/b;->b(Lf9/y;II)I

    move-result v1

    :goto_10
    const/4 v9, -0x1

    if-eq v1, v9, :cond_27

    .line 57
    invoke-static {v0, v1}, Ls7/b;->h(Lf9/y;I)Landroid/util/Pair;

    move-result-object v1

    .line 58
    iget-object v11, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v11, Ljava/lang/String;

    .line 59
    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v1, [B

    if-eqz v1, :cond_27

    const-string v2, "audio/mp4a-latm"

    .line 60
    invoke-virtual {v2, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_26

    .line 61
    invoke-static {v1}, Lf7/a;->g([B)Lf7/a$b;

    move-result-object v2

    .line 62
    iget v7, v2, Lf7/a$b;->a:I

    .line 63
    iget v8, v2, Lf7/a$b;->b:I

    .line 64
    iget-object v15, v2, Lf7/a$b;->c:Ljava/lang/String;

    .line 65
    :cond_26
    invoke-static {v1}, Lbc/i0;->y(Ljava/lang/Object;)Lbc/i0;

    move-result-object v19

    :cond_27
    :goto_11
    add-int/2addr v10, v13

    move/from16 v1, p2

    move/from16 v2, p3

    goto/16 :goto_b

    .line 66
    :cond_28
    iget-object v0, v6, Ls7/b$c;->b:Ld7/k;

    if-nez v0, :cond_29

    if-eqz v11, :cond_29

    .line 67
    new-instance v0, Ld7/k$b;

    invoke-direct {v0}, Ld7/k$b;-><init>()V

    .line 68
    invoke-virtual {v0, v3}, Ld7/k$b;->R(I)Ld7/k$b;

    move-result-object v0

    .line 69
    invoke-virtual {v0, v11}, Ld7/k$b;->e0(Ljava/lang/String;)Ld7/k$b;

    move-result-object v0

    .line 70
    invoke-virtual {v0, v15}, Ld7/k$b;->I(Ljava/lang/String;)Ld7/k$b;

    move-result-object v0

    .line 71
    invoke-virtual {v0, v8}, Ld7/k$b;->H(I)Ld7/k$b;

    move-result-object v0

    .line 72
    invoke-virtual {v0, v7}, Ld7/k$b;->f0(I)Ld7/k$b;

    move-result-object v0

    .line 73
    invoke-virtual {v0, v5}, Ld7/k$b;->Y(I)Ld7/k$b;

    move-result-object v0

    move-object/from16 v1, v19

    .line 74
    invoke-virtual {v0, v1}, Ld7/k$b;->T(Ljava/util/List;)Ld7/k$b;

    move-result-object v0

    .line 75
    invoke-virtual {v0, v14}, Ld7/k$b;->L(Lj7/l;)Ld7/k$b;

    move-result-object v0

    .line 76
    invoke-virtual {v0, v4}, Ld7/k$b;->V(Ljava/lang/String;)Ld7/k$b;

    move-result-object v0

    .line 77
    invoke-virtual {v0}, Ld7/k$b;->E()Ld7/k;

    move-result-object v0

    iput-object v0, v6, Ls7/b$c;->b:Ld7/k;

    :cond_29
    return-void
.end method

.method static f(Lf9/y;II)Landroid/util/Pair;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf9/y;",
            "II)",
            "Landroid/util/Pair<",
            "Ljava/lang/Integer;",
            "Ls7/p;",
            ">;"
        }
    .end annotation

    .line 1
    add-int/lit8 v0, p1, 0x8

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x0

    .line 6
    move v5, v1

    .line 7
    move v6, v2

    .line 8
    move-object v4, v3

    .line 9
    move-object v7, v4

    .line 10
    :goto_0
    sub-int v8, v0, p1

    .line 11
    .line 12
    if-ge v8, p2, :cond_3

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lf9/y;->P(I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lf9/y;->n()I

    .line 18
    .line 19
    .line 20
    move-result v8

    .line 21
    invoke-virtual {p0}, Lf9/y;->n()I

    .line 22
    .line 23
    .line 24
    move-result v9

    .line 25
    const v10, 0x66726d61

    .line 26
    .line 27
    .line 28
    if-ne v9, v10, :cond_0

    .line 29
    .line 30
    invoke-virtual {p0}, Lf9/y;->n()I

    .line 31
    .line 32
    .line 33
    move-result v7

    .line 34
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 35
    .line 36
    .line 37
    move-result-object v7

    .line 38
    goto :goto_1

    .line 39
    :cond_0
    const v10, 0x7363686d

    .line 40
    .line 41
    .line 42
    if-ne v9, v10, :cond_1

    .line 43
    .line 44
    const/4 v4, 0x4

    .line 45
    invoke-virtual {p0, v4}, Lf9/y;->Q(I)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, v4}, Lf9/y;->A(I)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    goto :goto_1

    .line 53
    :cond_1
    const v10, 0x73636869

    .line 54
    .line 55
    .line 56
    if-ne v9, v10, :cond_2

    .line 57
    .line 58
    move v5, v0

    .line 59
    move v6, v8

    .line 60
    :cond_2
    :goto_1
    add-int/2addr v0, v8

    .line 61
    goto :goto_0

    .line 62
    :cond_3
    const-string p1, "cenc"

    .line 63
    .line 64
    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-nez p1, :cond_5

    .line 69
    .line 70
    const-string p1, "cbc1"

    .line 71
    .line 72
    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    if-nez p1, :cond_5

    .line 77
    .line 78
    const-string p1, "cens"

    .line 79
    .line 80
    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    if-nez p1, :cond_5

    .line 85
    .line 86
    const-string p1, "cbcs"

    .line 87
    .line 88
    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    if-eqz p1, :cond_4

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_4
    return-object v3

    .line 96
    :cond_5
    :goto_2
    const-string p1, "frma atom is mandatory"

    .line 97
    .line 98
    invoke-static {v7, p1}, Lf9/a;->i(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    if-eq v5, v1, :cond_6

    .line 102
    .line 103
    const/4 v2, 0x1

    .line 104
    :cond_6
    const-string p1, "schi atom is mandatory"

    .line 105
    .line 106
    invoke-static {v2, p1}, Lf9/a;->g(ZLjava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    invoke-static {p0, v5, v6, v4}, Ls7/b;->s(Lf9/y;IILjava/lang/String;)Ls7/p;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    const-string p1, "tenc atom is mandatory"

    .line 114
    .line 115
    invoke-static {p0, p1}, Lf9/a;->i(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    check-cast p0, Ls7/p;

    .line 120
    .line 121
    invoke-static {v7, p0}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    return-object p0
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
.end method

.method private static g(Ls7/a$a;)Landroid/util/Pair;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls7/a$a;",
            ")",
            "Landroid/util/Pair<",
            "[J[J>;"
        }
    .end annotation

    .line 1
    const v0, 0x656c7374

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Ls7/a$a;->g(I)Ls7/a$b;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    if-nez p0, :cond_0

    .line 9
    .line 10
    const/4 p0, 0x0

    .line 11
    return-object p0

    .line 12
    :cond_0
    iget-object p0, p0, Ls7/a$b;->b:Lf9/y;

    .line 13
    .line 14
    const/16 v0, 0x8

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lf9/y;->P(I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lf9/y;->n()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-static {v0}, Ls7/a;->c(I)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-virtual {p0}, Lf9/y;->H()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    new-array v2, v1, [J

    .line 32
    .line 33
    new-array v3, v1, [J

    .line 34
    .line 35
    const/4 v4, 0x0

    .line 36
    :goto_0
    if-ge v4, v1, :cond_4

    .line 37
    .line 38
    const/4 v5, 0x1

    .line 39
    if-ne v0, v5, :cond_1

    .line 40
    .line 41
    invoke-virtual {p0}, Lf9/y;->I()J

    .line 42
    .line 43
    .line 44
    move-result-wide v6

    .line 45
    goto :goto_1

    .line 46
    :cond_1
    invoke-virtual {p0}, Lf9/y;->F()J

    .line 47
    .line 48
    .line 49
    move-result-wide v6

    .line 50
    :goto_1
    aput-wide v6, v2, v4

    .line 51
    .line 52
    if-ne v0, v5, :cond_2

    .line 53
    .line 54
    invoke-virtual {p0}, Lf9/y;->w()J

    .line 55
    .line 56
    .line 57
    move-result-wide v6

    .line 58
    goto :goto_2

    .line 59
    :cond_2
    invoke-virtual {p0}, Lf9/y;->n()I

    .line 60
    .line 61
    .line 62
    move-result v6

    .line 63
    int-to-long v6, v6

    .line 64
    :goto_2
    aput-wide v6, v3, v4

    .line 65
    .line 66
    invoke-virtual {p0}, Lf9/y;->z()S

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    if-ne v6, v5, :cond_3

    .line 71
    .line 72
    const/4 v5, 0x2

    .line 73
    invoke-virtual {p0, v5}, Lf9/y;->Q(I)V

    .line 74
    .line 75
    .line 76
    add-int/lit8 v4, v4, 0x1

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 80
    .line 81
    const-string v0, "Unsupported media rate."

    .line 82
    .line 83
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    throw p0

    .line 87
    :cond_4
    invoke-static {v2, v3}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    return-object p0
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
.end method

.method private static h(Lf9/y;I)Landroid/util/Pair;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf9/y;",
            "I)",
            "Landroid/util/Pair<",
            "Ljava/lang/String;",
            "[B>;"
        }
    .end annotation

    .line 1
    add-int/lit8 p1, p1, 0x8

    .line 2
    .line 3
    add-int/lit8 p1, p1, 0x4

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lf9/y;->P(I)V

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    invoke-virtual {p0, p1}, Lf9/y;->Q(I)V

    .line 10
    .line 11
    .line 12
    invoke-static {p0}, Ls7/b;->i(Lf9/y;)I

    .line 13
    .line 14
    .line 15
    const/4 v0, 0x2

    .line 16
    invoke-virtual {p0, v0}, Lf9/y;->Q(I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lf9/y;->D()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    and-int/lit16 v2, v1, 0x80

    .line 24
    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    invoke-virtual {p0, v0}, Lf9/y;->Q(I)V

    .line 28
    .line 29
    .line 30
    :cond_0
    and-int/lit8 v2, v1, 0x40

    .line 31
    .line 32
    if-eqz v2, :cond_1

    .line 33
    .line 34
    invoke-virtual {p0}, Lf9/y;->J()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    invoke-virtual {p0, v2}, Lf9/y;->Q(I)V

    .line 39
    .line 40
    .line 41
    :cond_1
    and-int/lit8 v1, v1, 0x20

    .line 42
    .line 43
    if-eqz v1, :cond_2

    .line 44
    .line 45
    invoke-virtual {p0, v0}, Lf9/y;->Q(I)V

    .line 46
    .line 47
    .line 48
    :cond_2
    invoke-virtual {p0, p1}, Lf9/y;->Q(I)V

    .line 49
    .line 50
    .line 51
    invoke-static {p0}, Ls7/b;->i(Lf9/y;)I

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Lf9/y;->D()I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    invoke-static {v0}, Lf9/u;->h(I)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    const-string v1, "audio/mpeg"

    .line 63
    .line 64
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    if-nez v1, :cond_4

    .line 69
    .line 70
    const-string v1, "audio/vnd.dts"

    .line 71
    .line 72
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    if-nez v1, :cond_4

    .line 77
    .line 78
    const-string v1, "audio/vnd.dts.hd"

    .line 79
    .line 80
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    if-eqz v1, :cond_3

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_3
    const/16 v1, 0xc

    .line 88
    .line 89
    invoke-virtual {p0, v1}, Lf9/y;->Q(I)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0, p1}, Lf9/y;->Q(I)V

    .line 93
    .line 94
    .line 95
    invoke-static {p0}, Ls7/b;->i(Lf9/y;)I

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    new-array v1, p1, [B

    .line 100
    .line 101
    const/4 v2, 0x0

    .line 102
    invoke-virtual {p0, v1, v2, p1}, Lf9/y;->j([BII)V

    .line 103
    .line 104
    .line 105
    invoke-static {v0, v1}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    return-object p0

    .line 110
    :cond_4
    :goto_0
    const/4 p0, 0x0

    .line 111
    invoke-static {v0, p0}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    return-object p0
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
.end method

.method private static i(Lf9/y;)I
    .locals 3

    .line 1
    invoke-virtual {p0}, Lf9/y;->D()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    and-int/lit8 v1, v0, 0x7f

    .line 6
    .line 7
    :goto_0
    const/16 v2, 0x80

    .line 8
    .line 9
    and-int/2addr v0, v2

    .line 10
    if-ne v0, v2, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Lf9/y;->D()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    shl-int/lit8 v1, v1, 0x7

    .line 17
    .line 18
    and-int/lit8 v2, v0, 0x7f

    .line 19
    .line 20
    or-int/2addr v1, v2

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    return v1
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
.end method

.method private static j(Lf9/y;)I
    .locals 1

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lf9/y;->P(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lf9/y;->n()I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0
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
.end method

.method private static k(Lf9/y;I)Ly7/a;
    .locals 2

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lf9/y;->Q(I)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    :cond_0
    :goto_0
    invoke-virtual {p0}, Lf9/y;->e()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-ge v1, p1, :cond_1

    .line 16
    .line 17
    invoke-static {p0}, Ls7/h;->c(Lf9/y;)Ly7/a$b;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-eqz p0, :cond_2

    .line 32
    .line 33
    const/4 p0, 0x0

    .line 34
    goto :goto_1

    .line 35
    :cond_2
    new-instance p0, Ly7/a;

    .line 36
    .line 37
    invoke-direct {p0, v0}, Ly7/a;-><init>(Ljava/util/List;)V

    .line 38
    .line 39
    .line 40
    :goto_1
    return-object p0
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
.end method

.method private static l(Lf9/y;)Landroid/util/Pair;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf9/y;",
            ")",
            "Landroid/util/Pair<",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lf9/y;->P(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lf9/y;->n()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-static {v1}, Ls7/a;->c(I)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    move v2, v0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/16 v2, 0x10

    .line 19
    .line 20
    :goto_0
    invoke-virtual {p0, v2}, Lf9/y;->Q(I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lf9/y;->F()J

    .line 24
    .line 25
    .line 26
    move-result-wide v2

    .line 27
    if-nez v1, :cond_1

    .line 28
    .line 29
    const/4 v0, 0x4

    .line 30
    :cond_1
    invoke-virtual {p0, v0}, Lf9/y;->Q(I)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Lf9/y;->J()I

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    new-instance v0, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 40
    .line 41
    .line 42
    const-string v1, ""

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    shr-int/lit8 v1, p0, 0xa

    .line 48
    .line 49
    and-int/lit8 v1, v1, 0x1f

    .line 50
    .line 51
    add-int/lit8 v1, v1, 0x60

    .line 52
    .line 53
    int-to-char v1, v1

    .line 54
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    shr-int/lit8 v1, p0, 0x5

    .line 58
    .line 59
    and-int/lit8 v1, v1, 0x1f

    .line 60
    .line 61
    add-int/lit8 v1, v1, 0x60

    .line 62
    .line 63
    int-to-char v1, v1

    .line 64
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    and-int/lit8 p0, p0, 0x1f

    .line 68
    .line 69
    add-int/lit8 p0, p0, 0x60

    .line 70
    .line 71
    int-to-char p0, p0

    .line 72
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-static {v0, p0}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    return-object p0
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
.end method

.method public static m(Ls7/a$a;)Ly7/a;
    .locals 10

    .line 1
    const v0, 0x68646c72    # 4.3148E24f

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Ls7/a$a;->g(I)Ls7/a$b;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const v1, 0x6b657973

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v1}, Ls7/a$a;->g(I)Ls7/a$b;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const v2, 0x696c7374

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v2}, Ls7/a$a;->g(I)Ls7/a$b;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    const/4 v2, 0x0

    .line 23
    if-eqz v0, :cond_6

    .line 24
    .line 25
    if-eqz v1, :cond_6

    .line 26
    .line 27
    if-eqz p0, :cond_6

    .line 28
    .line 29
    iget-object v0, v0, Ls7/a$b;->b:Lf9/y;

    .line 30
    .line 31
    invoke-static {v0}, Ls7/b;->j(Lf9/y;)I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    const v3, 0x6d647461

    .line 36
    .line 37
    .line 38
    if-eq v0, v3, :cond_0

    .line 39
    .line 40
    goto/16 :goto_3

    .line 41
    .line 42
    :cond_0
    iget-object v0, v1, Ls7/a$b;->b:Lf9/y;

    .line 43
    .line 44
    const/16 v1, 0xc

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Lf9/y;->P(I)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Lf9/y;->n()I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    new-array v3, v1, [Ljava/lang/String;

    .line 54
    .line 55
    const/4 v4, 0x0

    .line 56
    :goto_0
    const/16 v5, 0x8

    .line 57
    .line 58
    if-ge v4, v1, :cond_1

    .line 59
    .line 60
    invoke-virtual {v0}, Lf9/y;->n()I

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    const/4 v7, 0x4

    .line 65
    invoke-virtual {v0, v7}, Lf9/y;->Q(I)V

    .line 66
    .line 67
    .line 68
    sub-int/2addr v6, v5

    .line 69
    invoke-virtual {v0, v6}, Lf9/y;->A(I)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    aput-object v5, v3, v4

    .line 74
    .line 75
    add-int/lit8 v4, v4, 0x1

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_1
    iget-object p0, p0, Ls7/a$b;->b:Lf9/y;

    .line 79
    .line 80
    invoke-virtual {p0, v5}, Lf9/y;->P(I)V

    .line 81
    .line 82
    .line 83
    new-instance v0, Ljava/util/ArrayList;

    .line 84
    .line 85
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 86
    .line 87
    .line 88
    :goto_1
    invoke-virtual {p0}, Lf9/y;->a()I

    .line 89
    .line 90
    .line 91
    move-result v4

    .line 92
    if-le v4, v5, :cond_4

    .line 93
    .line 94
    invoke-virtual {p0}, Lf9/y;->e()I

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    invoke-virtual {p0}, Lf9/y;->n()I

    .line 99
    .line 100
    .line 101
    move-result v6

    .line 102
    invoke-virtual {p0}, Lf9/y;->n()I

    .line 103
    .line 104
    .line 105
    move-result v7

    .line 106
    add-int/lit8 v7, v7, -0x1

    .line 107
    .line 108
    if-ltz v7, :cond_2

    .line 109
    .line 110
    if-ge v7, v1, :cond_2

    .line 111
    .line 112
    aget-object v7, v3, v7

    .line 113
    .line 114
    add-int v8, v4, v6

    .line 115
    .line 116
    invoke-static {p0, v8, v7}, Ls7/h;->f(Lf9/y;ILjava/lang/String;)Le8/a;

    .line 117
    .line 118
    .line 119
    move-result-object v7

    .line 120
    if-eqz v7, :cond_3

    .line 121
    .line 122
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_2
    new-instance v8, Ljava/lang/StringBuilder;

    .line 127
    .line 128
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 129
    .line 130
    .line 131
    const-string v9, "Skipped metadata with unknown key index: "

    .line 132
    .line 133
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v7

    .line 143
    const-string v8, "AtomParsers"

    .line 144
    .line 145
    invoke-static {v8, v7}, Lf9/r;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    :cond_3
    :goto_2
    add-int/2addr v4, v6

    .line 149
    invoke-virtual {p0, v4}, Lf9/y;->P(I)V

    .line 150
    .line 151
    .line 152
    goto :goto_1

    .line 153
    :cond_4
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 154
    .line 155
    .line 156
    move-result p0

    .line 157
    if-eqz p0, :cond_5

    .line 158
    .line 159
    goto :goto_3

    .line 160
    :cond_5
    new-instance v2, Ly7/a;

    .line 161
    .line 162
    invoke-direct {v2, v0}, Ly7/a;-><init>(Ljava/util/List;)V

    .line 163
    .line 164
    .line 165
    :cond_6
    :goto_3
    return-object v2
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
.end method

.method private static n(Lf9/y;IIILs7/b$c;)V
    .locals 0

    .line 1
    add-int/lit8 p2, p2, 0x8

    .line 2
    .line 3
    add-int/lit8 p2, p2, 0x8

    .line 4
    .line 5
    invoke-virtual {p0, p2}, Lf9/y;->P(I)V

    .line 6
    .line 7
    .line 8
    const p2, 0x6d657474

    .line 9
    .line 10
    .line 11
    if-ne p1, p2, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Lf9/y;->x()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lf9/y;->x()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    if-eqz p0, :cond_0

    .line 21
    .line 22
    new-instance p1, Ld7/k$b;

    .line 23
    .line 24
    invoke-direct {p1}, Ld7/k$b;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, p3}, Ld7/k$b;->R(I)Ld7/k$b;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p1, p0}, Ld7/k$b;->e0(Ljava/lang/String;)Ld7/k$b;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-virtual {p0}, Ld7/k$b;->E()Ld7/k;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    iput-object p0, p4, Ls7/b$c;->b:Ld7/k;

    .line 40
    .line 41
    :cond_0
    return-void
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
.end method

.method private static o(Lf9/y;)J
    .locals 2

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lf9/y;->P(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lf9/y;->n()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-static {v1}, Ls7/a;->c(I)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/16 v0, 0x10

    .line 18
    .line 19
    :goto_0
    invoke-virtual {p0, v0}, Lf9/y;->Q(I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lf9/y;->F()J

    .line 23
    .line 24
    .line 25
    move-result-wide v0

    .line 26
    return-wide v0
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
.end method

.method private static p(Lf9/y;I)F
    .locals 0

    .line 1
    add-int/lit8 p1, p1, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lf9/y;->P(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lf9/y;->H()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    invoke-virtual {p0}, Lf9/y;->H()I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    int-to-float p1, p1

    .line 15
    int-to-float p0, p0

    .line 16
    div-float/2addr p1, p0

    .line 17
    return p1
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
.end method

.method private static q(Lf9/y;II)[B
    .locals 4

    .line 1
    add-int/lit8 v0, p1, 0x8

    .line 2
    .line 3
    :goto_0
    sub-int v1, v0, p1

    .line 4
    .line 5
    if-ge v1, p2, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lf9/y;->P(I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lf9/y;->n()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-virtual {p0}, Lf9/y;->n()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const v3, 0x70726f6a

    .line 19
    .line 20
    .line 21
    if-ne v2, v3, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0}, Lf9/y;->d()[B

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    add-int/2addr v1, v0

    .line 28
    invoke-static {p0, v0, v1}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0

    .line 33
    :cond_0
    add-int/2addr v0, v1

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const/4 p0, 0x0

    .line 36
    return-object p0
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
.end method

.method private static r(Lf9/y;II)Landroid/util/Pair;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf9/y;",
            "II)",
            "Landroid/util/Pair<",
            "Ljava/lang/Integer;",
            "Ls7/p;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lf9/y;->e()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    :goto_0
    sub-int v1, v0, p1

    .line 6
    .line 7
    if-ge v1, p2, :cond_2

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lf9/y;->P(I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lf9/y;->n()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-lez v1, :cond_0

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    goto :goto_1

    .line 20
    :cond_0
    const/4 v2, 0x0

    .line 21
    :goto_1
    const-string v3, "childAtomSize should be positive"

    .line 22
    .line 23
    invoke-static {v2, v3}, Lf9/a;->g(ZLjava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lf9/y;->n()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    const v3, 0x73696e66

    .line 31
    .line 32
    .line 33
    if-ne v2, v3, :cond_1

    .line 34
    .line 35
    invoke-static {p0, v0, v1}, Ls7/b;->f(Lf9/y;II)Landroid/util/Pair;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    if-eqz v2, :cond_1

    .line 40
    .line 41
    return-object v2

    .line 42
    :cond_1
    add-int/2addr v0, v1

    .line 43
    goto :goto_0

    .line 44
    :cond_2
    const/4 p0, 0x0

    .line 45
    return-object p0
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
.end method

.method private static s(Lf9/y;IILjava/lang/String;)Ls7/p;
    .locals 11

    .line 1
    add-int/lit8 v0, p1, 0x8

    .line 2
    .line 3
    :goto_0
    sub-int v1, v0, p1

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-ge v1, p2, :cond_4

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lf9/y;->P(I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lf9/y;->n()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-virtual {p0}, Lf9/y;->n()I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    const v4, 0x74656e63

    .line 20
    .line 21
    .line 22
    if-ne v3, v4, :cond_3

    .line 23
    .line 24
    invoke-virtual {p0}, Lf9/y;->n()I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    invoke-static {p1}, Ls7/a;->c(I)I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    const/4 p2, 0x1

    .line 33
    invoke-virtual {p0, p2}, Lf9/y;->Q(I)V

    .line 34
    .line 35
    .line 36
    const/4 v0, 0x0

    .line 37
    if-nez p1, :cond_0

    .line 38
    .line 39
    invoke-virtual {p0, p2}, Lf9/y;->Q(I)V

    .line 40
    .line 41
    .line 42
    move v8, v0

    .line 43
    move v9, v8

    .line 44
    goto :goto_1

    .line 45
    :cond_0
    invoke-virtual {p0}, Lf9/y;->D()I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    and-int/lit16 v1, p1, 0xf0

    .line 50
    .line 51
    shr-int/lit8 v1, v1, 0x4

    .line 52
    .line 53
    and-int/lit8 p1, p1, 0xf

    .line 54
    .line 55
    move v9, p1

    .line 56
    move v8, v1

    .line 57
    :goto_1
    invoke-virtual {p0}, Lf9/y;->D()I

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-ne p1, p2, :cond_1

    .line 62
    .line 63
    move v4, p2

    .line 64
    goto :goto_2

    .line 65
    :cond_1
    move v4, v0

    .line 66
    :goto_2
    invoke-virtual {p0}, Lf9/y;->D()I

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    const/16 p1, 0x10

    .line 71
    .line 72
    new-array v7, p1, [B

    .line 73
    .line 74
    invoke-virtual {p0, v7, v0, p1}, Lf9/y;->j([BII)V

    .line 75
    .line 76
    .line 77
    if-eqz v4, :cond_2

    .line 78
    .line 79
    if-nez v6, :cond_2

    .line 80
    .line 81
    invoke-virtual {p0}, Lf9/y;->D()I

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    new-array v2, p1, [B

    .line 86
    .line 87
    invoke-virtual {p0, v2, v0, p1}, Lf9/y;->j([BII)V

    .line 88
    .line 89
    .line 90
    :cond_2
    move-object v10, v2

    .line 91
    new-instance p0, Ls7/p;

    .line 92
    .line 93
    move-object v3, p0

    .line 94
    move-object v5, p3

    .line 95
    invoke-direct/range {v3 .. v10}, Ls7/p;-><init>(ZLjava/lang/String;I[BII[B)V

    .line 96
    .line 97
    .line 98
    return-object p0

    .line 99
    :cond_3
    add-int/2addr v0, v1

    .line 100
    goto :goto_0

    .line 101
    :cond_4
    return-object v2
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
.end method

.method private static t(Lf9/y;I)Ly7/a;
    .locals 6

    .line 1
    const/16 v0, 0xc

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lf9/y;->Q(I)V

    .line 4
    .line 5
    .line 6
    :goto_0
    invoke-virtual {p0}, Lf9/y;->e()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x0

    .line 11
    if-ge v1, p1, :cond_4

    .line 12
    .line 13
    invoke-virtual {p0}, Lf9/y;->e()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-virtual {p0}, Lf9/y;->n()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    invoke-virtual {p0}, Lf9/y;->n()I

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    const v5, 0x73617574

    .line 26
    .line 27
    .line 28
    if-ne v4, v5, :cond_3

    .line 29
    .line 30
    const/16 p1, 0xe

    .line 31
    .line 32
    if-ge v3, p1, :cond_0

    .line 33
    .line 34
    return-object v2

    .line 35
    :cond_0
    const/4 p1, 0x5

    .line 36
    invoke-virtual {p0, p1}, Lf9/y;->Q(I)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Lf9/y;->D()I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-eq p1, v0, :cond_1

    .line 44
    .line 45
    const/16 v1, 0xd

    .line 46
    .line 47
    if-eq p1, v1, :cond_1

    .line 48
    .line 49
    return-object v2

    .line 50
    :cond_1
    if-ne p1, v0, :cond_2

    .line 51
    .line 52
    const/high16 p1, 0x43700000    # 240.0f

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_2
    const/high16 p1, 0x42f00000    # 120.0f

    .line 56
    .line 57
    :goto_1
    const/4 v0, 0x1

    .line 58
    invoke-virtual {p0, v0}, Lf9/y;->Q(I)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0}, Lf9/y;->D()I

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    new-instance v1, Ly7/a;

    .line 66
    .line 67
    new-array v0, v0, [Ly7/a$b;

    .line 68
    .line 69
    new-instance v2, Le8/e;

    .line 70
    .line 71
    invoke-direct {v2, p1, p0}, Le8/e;-><init>(FI)V

    .line 72
    .line 73
    .line 74
    const/4 p0, 0x0

    .line 75
    aput-object v2, v0, p0

    .line 76
    .line 77
    invoke-direct {v1, v0}, Ly7/a;-><init>([Ly7/a$b;)V

    .line 78
    .line 79
    .line 80
    return-object v1

    .line 81
    :cond_3
    add-int/2addr v1, v3

    .line 82
    invoke-virtual {p0, v1}, Lf9/y;->P(I)V

    .line 83
    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_4
    return-object v2
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
.end method

.method private static u(Ls7/o;Ls7/a$a;Ll7/u;)Ls7/r;
    .locals 38

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    const v3, 0x7374737a

    .line 1
    invoke-virtual {v0, v3}, Ls7/a$a;->g(I)Ls7/a$b;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 2
    new-instance v4, Ls7/b$d;

    iget-object v5, v1, Ls7/o;->f:Ld7/k;

    invoke-direct {v4, v3, v5}, Ls7/b$d;-><init>(Ls7/a$b;Ld7/k;)V

    goto :goto_0

    :cond_0
    const v3, 0x73747a32

    .line 3
    invoke-virtual {v0, v3}, Ls7/a$a;->g(I)Ls7/a$b;

    move-result-object v3

    if-eqz v3, :cond_2f

    .line 4
    new-instance v4, Ls7/b$e;

    invoke-direct {v4, v3}, Ls7/b$e;-><init>(Ls7/a$b;)V

    .line 5
    :goto_0
    invoke-interface {v4}, Ls7/b$b;->b()I

    move-result v3

    const/4 v5, 0x0

    if-nez v3, :cond_1

    .line 6
    new-instance v9, Ls7/r;

    new-array v2, v5, [J

    new-array v3, v5, [I

    const/4 v4, 0x0

    new-array v6, v5, [J

    new-array v7, v5, [I

    const-wide/16 v10, 0x0

    move-object v0, v9

    move-object/from16 v1, p0

    move-object v5, v6

    move-object v6, v7

    move-wide v7, v10

    invoke-direct/range {v0 .. v8}, Ls7/r;-><init>(Ls7/o;[J[II[J[IJ)V

    return-object v9

    :cond_1
    const v6, 0x7374636f

    .line 7
    invoke-virtual {v0, v6}, Ls7/a$a;->g(I)Ls7/a$b;

    move-result-object v6

    const/4 v7, 0x1

    if-nez v6, :cond_2

    const v6, 0x636f3634

    .line 8
    invoke-virtual {v0, v6}, Ls7/a$a;->g(I)Ls7/a$b;

    move-result-object v6

    invoke-static {v6}, Lf9/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ls7/a$b;

    move v8, v7

    goto :goto_1

    :cond_2
    move v8, v5

    .line 9
    :goto_1
    iget-object v6, v6, Ls7/a$b;->b:Lf9/y;

    const v9, 0x73747363

    .line 10
    invoke-virtual {v0, v9}, Ls7/a$a;->g(I)Ls7/a$b;

    move-result-object v9

    invoke-static {v9}, Lf9/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ls7/a$b;

    iget-object v9, v9, Ls7/a$b;->b:Lf9/y;

    const v10, 0x73747473

    .line 11
    invoke-virtual {v0, v10}, Ls7/a$a;->g(I)Ls7/a$b;

    move-result-object v10

    invoke-static {v10}, Lf9/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ls7/a$b;

    iget-object v10, v10, Ls7/a$b;->b:Lf9/y;

    const v11, 0x73747373

    .line 12
    invoke-virtual {v0, v11}, Ls7/a$a;->g(I)Ls7/a$b;

    move-result-object v11

    if-eqz v11, :cond_3

    .line 13
    iget-object v11, v11, Ls7/a$b;->b:Lf9/y;

    goto :goto_2

    :cond_3
    const/4 v11, 0x0

    :goto_2
    const v13, 0x63747473

    .line 14
    invoke-virtual {v0, v13}, Ls7/a$a;->g(I)Ls7/a$b;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 15
    iget-object v0, v0, Ls7/a$b;->b:Lf9/y;

    goto :goto_3

    :cond_4
    const/4 v0, 0x0

    .line 16
    :goto_3
    new-instance v13, Ls7/b$a;

    invoke-direct {v13, v9, v6, v8}, Ls7/b$a;-><init>(Lf9/y;Lf9/y;Z)V

    const/16 v6, 0xc

    .line 17
    invoke-virtual {v10, v6}, Lf9/y;->P(I)V

    .line 18
    invoke-virtual {v10}, Lf9/y;->H()I

    move-result v8

    sub-int/2addr v8, v7

    .line 19
    invoke-virtual {v10}, Lf9/y;->H()I

    move-result v9

    .line 20
    invoke-virtual {v10}, Lf9/y;->H()I

    move-result v14

    if-eqz v0, :cond_5

    .line 21
    invoke-virtual {v0, v6}, Lf9/y;->P(I)V

    .line 22
    invoke-virtual {v0}, Lf9/y;->H()I

    move-result v15

    goto :goto_4

    :cond_5
    move v15, v5

    :goto_4
    const/4 v12, -0x1

    if-eqz v11, :cond_7

    .line 23
    invoke-virtual {v11, v6}, Lf9/y;->P(I)V

    .line 24
    invoke-virtual {v11}, Lf9/y;->H()I

    move-result v6

    if-lez v6, :cond_6

    .line 25
    invoke-virtual {v11}, Lf9/y;->H()I

    move-result v16

    add-int/lit8 v16, v16, -0x1

    goto :goto_5

    :cond_6
    move/from16 v16, v12

    const/4 v11, 0x0

    goto :goto_5

    :cond_7
    move v6, v5

    move/from16 v16, v12

    .line 26
    :goto_5
    invoke-interface {v4}, Ls7/b$b;->a()I

    move-result v5

    .line 27
    iget-object v7, v1, Ls7/o;->f:Ld7/k;

    iget-object v7, v7, Ld7/k;->v:Ljava/lang/String;

    if-eq v5, v12, :cond_9

    const-string v12, "audio/raw"

    .line 28
    invoke-virtual {v12, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_8

    const-string v12, "audio/g711-mlaw"

    .line 29
    invoke-virtual {v12, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_8

    const-string v12, "audio/g711-alaw"

    .line 30
    invoke-virtual {v12, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_9

    :cond_8
    if-nez v8, :cond_9

    if-nez v15, :cond_9

    if-nez v6, :cond_9

    move/from16 p1, v8

    move v12, v9

    const/4 v7, 0x1

    goto :goto_6

    :cond_9
    move/from16 p1, v8

    move v12, v9

    const/4 v7, 0x0

    :goto_6
    if-eqz v7, :cond_b

    .line 31
    iget v0, v13, Ls7/b$a;->a:I

    new-array v4, v0, [J

    .line 32
    new-array v0, v0, [I

    .line 33
    :goto_7
    invoke-virtual {v13}, Ls7/b$a;->a()Z

    move-result v6

    if-eqz v6, :cond_a

    .line 34
    iget v6, v13, Ls7/b$a;->b:I

    iget-wide v10, v13, Ls7/b$a;->d:J

    aput-wide v10, v4, v6

    .line 35
    iget v7, v13, Ls7/b$a;->c:I

    aput v7, v0, v6

    goto :goto_7

    :cond_a
    int-to-long v6, v14

    .line 36
    invoke-static {v5, v4, v0, v6, v7}, Ls7/d;->a(I[J[IJ)Ls7/d$b;

    move-result-object v0

    .line 37
    iget-object v4, v0, Ls7/d$b;->a:[J

    .line 38
    iget-object v5, v0, Ls7/d$b;->b:[I

    .line 39
    iget v6, v0, Ls7/d$b;->c:I

    .line 40
    iget-object v7, v0, Ls7/d$b;->d:[J

    .line 41
    iget-object v10, v0, Ls7/d$b;->e:[I

    .line 42
    iget-wide v11, v0, Ls7/d$b;->f:J

    move v0, v3

    move-object v2, v4

    move-object v3, v5

    move v4, v6

    move-object v5, v7

    move-object v6, v10

    move-wide v13, v11

    move-object v11, v1

    goto/16 :goto_13

    .line 43
    :cond_b
    new-array v5, v3, [J

    .line 44
    new-array v7, v3, [I

    .line 45
    new-array v8, v3, [J

    .line 46
    new-array v9, v3, [I

    move-object/from16 v24, v10

    move/from16 v2, v16

    const/4 v1, 0x0

    const/4 v10, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const-wide/16 v25, 0x0

    const-wide/16 v27, 0x0

    move/from16 v16, v15

    move v15, v14

    move v14, v12

    :goto_8
    const-string v12, "AtomParsers"

    if-ge v1, v3, :cond_14

    move-wide/from16 v28, v27

    move/from16 v27, v22

    const/16 v22, 0x1

    :goto_9
    if-nez v27, :cond_c

    .line 47
    invoke-virtual {v13}, Ls7/b$a;->a()Z

    move-result v22

    if-eqz v22, :cond_c

    move/from16 v30, v14

    move/from16 v31, v15

    .line 48
    iget-wide v14, v13, Ls7/b$a;->d:J

    move/from16 v32, v3

    .line 49
    iget v3, v13, Ls7/b$a;->c:I

    move/from16 v27, v3

    move-wide/from16 v28, v14

    move/from16 v14, v30

    move/from16 v15, v31

    move/from16 v3, v32

    goto :goto_9

    :cond_c
    move/from16 v32, v3

    move/from16 v30, v14

    move/from16 v31, v15

    if-nez v22, :cond_d

    const-string v2, "Unexpected end of chunk data"

    .line 50
    invoke-static {v12, v2}, Lf9/r;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    invoke-static {v5, v1}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v5

    .line 52
    invoke-static {v7, v1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v7

    .line 53
    invoke-static {v8, v1}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v8

    .line 54
    invoke-static {v9, v1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v9

    move v3, v1

    move/from16 v2, v21

    move/from16 v1, v27

    goto/16 :goto_d

    :cond_d
    if-eqz v0, :cond_f

    :goto_a
    if-nez v23, :cond_e

    if-lez v16, :cond_e

    .line 55
    invoke-virtual {v0}, Lf9/y;->H()I

    move-result v23

    .line 56
    invoke-virtual {v0}, Lf9/y;->n()I

    move-result v21

    add-int/lit8 v16, v16, -0x1

    goto :goto_a

    :cond_e
    add-int/lit8 v23, v23, -0x1

    :cond_f
    move/from16 v3, v21

    .line 57
    aput-wide v28, v5, v1

    .line 58
    invoke-interface {v4}, Ls7/b$b;->c()I

    move-result v12

    aput v12, v7, v1

    if-le v12, v10, :cond_10

    move v10, v12

    :cond_10
    int-to-long v14, v3

    add-long v14, v25, v14

    .line 59
    aput-wide v14, v8, v1

    if-nez v11, :cond_11

    const/4 v12, 0x1

    goto :goto_b

    :cond_11
    const/4 v12, 0x0

    .line 60
    :goto_b
    aput v12, v9, v1

    if-ne v1, v2, :cond_12

    const/4 v12, 0x1

    .line 61
    aput v12, v9, v1

    add-int/lit8 v6, v6, -0x1

    if-lez v6, :cond_12

    .line 62
    invoke-static {v11}, Lf9/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lf9/y;

    invoke-virtual {v2}, Lf9/y;->H()I

    move-result v2

    sub-int/2addr v2, v12

    :cond_12
    move v15, v2

    move v12, v3

    move/from16 v14, v31

    int-to-long v2, v14

    add-long v25, v25, v2

    add-int/lit8 v2, v30, -0x1

    if-nez v2, :cond_13

    if-lez p1, :cond_13

    .line 63
    invoke-virtual/range {v24 .. v24}, Lf9/y;->H()I

    move-result v2

    .line 64
    invoke-virtual/range {v24 .. v24}, Lf9/y;->n()I

    move-result v3

    add-int/lit8 v14, p1, -0x1

    goto :goto_c

    :cond_13
    move v3, v14

    move/from16 v14, p1

    :goto_c
    move/from16 p1, v2

    .line 65
    aget v2, v7, v1

    move/from16 v21, v3

    int-to-long v2, v2

    add-long v2, v28, v2

    add-int/lit8 v22, v27, -0x1

    add-int/lit8 v1, v1, 0x1

    move-wide/from16 v27, v2

    move v2, v15

    move/from16 v15, v21

    move/from16 v3, v32

    move/from16 v21, v12

    move/from16 v37, v14

    move/from16 v14, p1

    move/from16 p1, v37

    goto/16 :goto_8

    :cond_14
    move/from16 v32, v3

    move/from16 v30, v14

    move/from16 v2, v21

    move/from16 v1, v22

    :goto_d
    int-to-long v13, v2

    add-long v13, v25, v13

    if-eqz v0, :cond_16

    :goto_e
    if-lez v16, :cond_16

    .line 66
    invoke-virtual {v0}, Lf9/y;->H()I

    move-result v2

    if-eqz v2, :cond_15

    const/4 v0, 0x0

    goto :goto_f

    .line 67
    :cond_15
    invoke-virtual {v0}, Lf9/y;->n()I

    add-int/lit8 v16, v16, -0x1

    goto :goto_e

    :cond_16
    const/4 v0, 0x1

    :goto_f
    if-nez v6, :cond_18

    if-nez v30, :cond_18

    if-nez v1, :cond_18

    if-nez p1, :cond_18

    move/from16 v2, v23

    if-nez v2, :cond_19

    if-nez v0, :cond_17

    goto :goto_10

    :cond_17
    move-object/from16 v11, p0

    goto :goto_12

    :cond_18
    move/from16 v2, v23

    .line 68
    :cond_19
    :goto_10
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "Inconsistent stbl box for track "

    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v11, p0

    iget v15, v11, Ls7/o;->a:I

    invoke-virtual {v4, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v15, ": remainingSynchronizationSamples "

    invoke-virtual {v4, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, ", remainingSamplesAtTimestampDelta "

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v6, v30

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, ", remainingSamplesInChunk "

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", remainingTimestampDeltaChanges "

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, p1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", remainingSamplesAtTimestampOffset "

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    if-nez v0, :cond_1a

    const-string v0, ", ctts invalid"

    goto :goto_11

    :cond_1a
    const-string v0, ""

    .line 69
    :goto_11
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 70
    invoke-static {v12, v0}, Lf9/r;->h(Ljava/lang/String;Ljava/lang/String;)V

    :goto_12
    move v0, v3

    move-object v2, v5

    move-object v3, v7

    move-object v5, v8

    move-object v6, v9

    move v4, v10

    :goto_13
    const-wide/32 v23, 0xf4240

    .line 71
    iget-wide v7, v11, Ls7/o;->c:J

    move-wide/from16 v21, v13

    move-wide/from16 v25, v7

    invoke-static/range {v21 .. v26}, Lf9/q0;->I0(JJJ)J

    move-result-wide v7

    .line 72
    iget-object v1, v11, Ls7/o;->h:[J

    const-wide/32 v9, 0xf4240

    if-nez v1, :cond_1b

    .line 73
    iget-wide v0, v11, Ls7/o;->c:J

    invoke-static {v5, v9, v10, v0, v1}, Lf9/q0;->K0([JJJ)V

    .line 74
    new-instance v9, Ls7/r;

    move-object v0, v9

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v8}, Ls7/r;-><init>(Ls7/o;[J[II[J[IJ)V

    return-object v9

    .line 75
    :cond_1b
    array-length v1, v1

    const/4 v7, 0x1

    if-ne v1, v7, :cond_1d

    iget v1, v11, Ls7/o;->b:I

    if-ne v1, v7, :cond_1d

    array-length v1, v5

    const/4 v7, 0x2

    if-lt v1, v7, :cond_1d

    .line 76
    iget-object v1, v11, Ls7/o;->i:[J

    invoke-static {v1}, Lf9/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [J

    const/4 v7, 0x0

    aget-wide v15, v1, v7

    .line 77
    iget-object v1, v11, Ls7/o;->h:[J

    aget-wide v21, v1, v7

    iget-wide v7, v11, Ls7/o;->c:J

    iget-wide v9, v11, Ls7/o;->d:J

    move-wide/from16 v23, v7

    move-wide/from16 v25, v9

    invoke-static/range {v21 .. v26}, Lf9/q0;->I0(JJJ)J

    move-result-wide v7

    add-long/2addr v7, v15

    move-object/from16 v21, v5

    move-wide/from16 v22, v13

    move-wide/from16 v24, v15

    move-wide/from16 v26, v7

    .line 78
    invoke-static/range {v21 .. v27}, Ls7/b;->a([JJJJ)Z

    move-result v1

    if-eqz v1, :cond_1d

    sub-long v21, v13, v7

    const/4 v1, 0x0

    .line 79
    aget-wide v7, v5, v1

    sub-long v30, v15, v7

    iget-object v1, v11, Ls7/o;->f:Ld7/k;

    iget v1, v1, Ld7/k;->J:I

    int-to-long v7, v1

    iget-wide v9, v11, Ls7/o;->c:J

    move-wide/from16 v32, v7

    move-wide/from16 v34, v9

    invoke-static/range {v30 .. v35}, Lf9/q0;->I0(JJJ)J

    move-result-wide v7

    .line 80
    iget-object v1, v11, Ls7/o;->f:Ld7/k;

    iget v1, v1, Ld7/k;->J:I

    int-to-long v9, v1

    move v12, v0

    iget-wide v0, v11, Ls7/o;->c:J

    move-wide/from16 v23, v9

    move-wide/from16 v25, v0

    invoke-static/range {v21 .. v26}, Lf9/q0;->I0(JJJ)J

    move-result-wide v0

    const-wide/16 v9, 0x0

    cmp-long v15, v7, v9

    if-nez v15, :cond_1c

    cmp-long v15, v0, v9

    if-eqz v15, :cond_1e

    :cond_1c
    const-wide/32 v9, 0x7fffffff

    cmp-long v15, v7, v9

    if-gtz v15, :cond_1e

    cmp-long v9, v0, v9

    if-gtz v9, :cond_1e

    long-to-int v7, v7

    move-object/from16 v8, p2

    .line 81
    iput v7, v8, Ll7/u;->a:I

    long-to-int v0, v0

    .line 82
    iput v0, v8, Ll7/u;->b:I

    .line 83
    iget-wide v0, v11, Ls7/o;->c:J

    const-wide/32 v7, 0xf4240

    invoke-static {v5, v7, v8, v0, v1}, Lf9/q0;->K0([JJJ)V

    .line 84
    iget-object v0, v11, Ls7/o;->h:[J

    const/4 v1, 0x0

    aget-wide v12, v0, v1

    const-wide/32 v14, 0xf4240

    iget-wide v0, v11, Ls7/o;->d:J

    move-wide/from16 v16, v0

    .line 85
    invoke-static/range {v12 .. v17}, Lf9/q0;->I0(JJJ)J

    move-result-wide v7

    .line 86
    new-instance v9, Ls7/r;

    move-object v0, v9

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v8}, Ls7/r;-><init>(Ls7/o;[J[II[J[IJ)V

    return-object v9

    :cond_1d
    move v12, v0

    .line 87
    :cond_1e
    iget-object v0, v11, Ls7/o;->h:[J

    array-length v1, v0

    const/4 v7, 0x1

    if-ne v1, v7, :cond_20

    const/4 v1, 0x0

    aget-wide v7, v0, v1

    const-wide/16 v9, 0x0

    cmp-long v7, v7, v9

    if-nez v7, :cond_20

    .line 88
    iget-object v0, v11, Ls7/o;->i:[J

    invoke-static {v0}, Lf9/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [J

    aget-wide v7, v0, v1

    const/4 v0, 0x0

    .line 89
    :goto_14
    array-length v1, v5

    if-ge v0, v1, :cond_1f

    .line 90
    aget-wide v9, v5, v0

    sub-long v15, v9, v7

    const-wide/32 v17, 0xf4240

    iget-wide v9, v11, Ls7/o;->c:J

    move-wide/from16 v19, v9

    .line 91
    invoke-static/range {v15 .. v20}, Lf9/q0;->I0(JJJ)J

    move-result-wide v9

    aput-wide v9, v5, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_14

    :cond_1f
    sub-long v15, v13, v7

    const-wide/32 v17, 0xf4240

    .line 92
    iget-wide v0, v11, Ls7/o;->c:J

    move-wide/from16 v19, v0

    .line 93
    invoke-static/range {v15 .. v20}, Lf9/q0;->I0(JJJ)J

    move-result-wide v7

    .line 94
    new-instance v9, Ls7/r;

    move-object v0, v9

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v8}, Ls7/r;-><init>(Ls7/o;[J[II[J[IJ)V

    return-object v9

    .line 95
    :cond_20
    iget v1, v11, Ls7/o;->b:I

    const/4 v7, 0x1

    if-ne v1, v7, :cond_21

    const/4 v1, 0x1

    goto :goto_15

    :cond_21
    const/4 v1, 0x0

    .line 96
    :goto_15
    array-length v7, v0

    new-array v7, v7, [I

    .line 97
    array-length v0, v0

    new-array v0, v0, [I

    .line 98
    iget-object v8, v11, Ls7/o;->i:[J

    invoke-static {v8}, Lf9/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, [J

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    .line 99
    :goto_16
    iget-object v15, v11, Ls7/o;->h:[J

    move/from16 p1, v4

    array-length v4, v15

    if-ge v9, v4, :cond_25

    move-object/from16 v16, v3

    .line 100
    aget-wide v3, v8, v9

    const-wide/16 v21, -0x1

    cmp-long v21, v3, v21

    if-eqz v21, :cond_24

    .line 101
    aget-wide v22, v15, v9

    move/from16 v21, v14

    iget-wide v14, v11, Ls7/o;->c:J

    move/from16 v28, v12

    move/from16 p2, v13

    iget-wide v12, v11, Ls7/o;->d:J

    move-wide/from16 v24, v14

    move-wide/from16 v26, v12

    .line 102
    invoke-static/range {v22 .. v27}, Lf9/q0;->I0(JJJ)J

    move-result-wide v12

    const/4 v14, 0x1

    .line 103
    invoke-static {v5, v3, v4, v14, v14}, Lf9/q0;->i([JJZZ)I

    move-result v15

    aput v15, v7, v9

    add-long/2addr v3, v12

    const/4 v12, 0x0

    .line 104
    invoke-static {v5, v3, v4, v1, v12}, Lf9/q0;->e([JJZZ)I

    move-result v3

    aput v3, v0, v9

    .line 105
    :goto_17
    aget v3, v7, v9

    aget v4, v0, v9

    if-ge v3, v4, :cond_22

    aget v13, v6, v3

    and-int/2addr v13, v14

    if-nez v13, :cond_22

    add-int/lit8 v3, v3, 0x1

    .line 106
    aput v3, v7, v9

    goto :goto_17

    :cond_22
    sub-int v13, v4, v3

    add-int v13, p2, v13

    move/from16 v15, v21

    if-eq v15, v3, :cond_23

    move v3, v14

    goto :goto_18

    :cond_23
    move v3, v12

    :goto_18
    or-int/2addr v3, v10

    move v10, v3

    move v15, v4

    goto :goto_19

    :cond_24
    move/from16 v28, v12

    move/from16 p2, v13

    move v15, v14

    const/4 v12, 0x0

    const/4 v14, 0x1

    :goto_19
    add-int/lit8 v9, v9, 0x1

    move/from16 v4, p1

    move v14, v15

    move-object/from16 v3, v16

    move/from16 v12, v28

    goto :goto_16

    :cond_25
    move-object/from16 v16, v3

    move v3, v12

    const/4 v12, 0x0

    const/4 v14, 0x1

    if-eq v13, v3, :cond_26

    goto :goto_1a

    :cond_26
    move v14, v12

    :goto_1a
    or-int v1, v10, v14

    if-eqz v1, :cond_27

    .line 107
    new-array v3, v13, [J

    goto :goto_1b

    :cond_27
    move-object v3, v2

    :goto_1b
    if-eqz v1, :cond_28

    .line 108
    new-array v4, v13, [I

    goto :goto_1c

    :cond_28
    move-object/from16 v4, v16

    :goto_1c
    if-eqz v1, :cond_29

    move v8, v12

    goto :goto_1d

    :cond_29
    move/from16 v8, p1

    :goto_1d
    if-eqz v1, :cond_2a

    .line 109
    new-array v9, v13, [I

    goto :goto_1e

    :cond_2a
    move-object v9, v6

    .line 110
    :goto_1e
    new-array v10, v13, [J

    move/from16 p1, v8

    move v13, v12

    const-wide/16 v14, 0x0

    .line 111
    :goto_1f
    iget-object v8, v11, Ls7/o;->h:[J

    array-length v8, v8

    if-ge v12, v8, :cond_2e

    .line 112
    iget-object v8, v11, Ls7/o;->i:[J

    aget-wide v17, v8, v12

    .line 113
    aget v8, v7, v12

    move-object/from16 v27, v7

    .line 114
    aget v7, v0, v12

    move-object/from16 v28, v0

    if-eqz v1, :cond_2b

    sub-int v0, v7, v8

    .line 115
    invoke-static {v2, v8, v3, v13, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object/from16 v29, v2

    move-object/from16 v2, v16

    .line 116
    invoke-static {v2, v8, v4, v13, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 117
    invoke-static {v6, v8, v9, v13, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_20

    :cond_2b
    move-object/from16 v29, v2

    move-object/from16 v2, v16

    :goto_20
    move/from16 v0, p1

    :goto_21
    if-ge v8, v7, :cond_2d

    const-wide/32 v23, 0xf4240

    move-object/from16 v16, v6

    move/from16 p2, v7

    .line 118
    iget-wide v6, v11, Ls7/o;->d:J

    move-wide/from16 v21, v14

    move-wide/from16 v25, v6

    invoke-static/range {v21 .. v26}, Lf9/q0;->I0(JJJ)J

    move-result-wide v6

    .line 119
    aget-wide v21, v5, v8

    move-wide/from16 v23, v14

    sub-long v14, v21, v17

    move-object/from16 v21, v2

    move-object/from16 v30, v3

    const-wide/16 v2, 0x0

    .line 120
    invoke-static {v2, v3, v14, v15}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v31

    const-wide/32 v33, 0xf4240

    iget-wide v14, v11, Ls7/o;->c:J

    move-wide/from16 v35, v14

    .line 121
    invoke-static/range {v31 .. v36}, Lf9/q0;->I0(JJJ)J

    move-result-wide v14

    add-long/2addr v6, v14

    .line 122
    aput-wide v6, v10, v13

    if-eqz v1, :cond_2c

    .line 123
    aget v6, v4, v13

    if-le v6, v0, :cond_2c

    .line 124
    aget v0, v21, v8

    :cond_2c
    add-int/lit8 v13, v13, 0x1

    add-int/lit8 v8, v8, 0x1

    move/from16 v7, p2

    move-object/from16 v6, v16

    move-object/from16 v2, v21

    move-wide/from16 v14, v23

    move-object/from16 v3, v30

    goto :goto_21

    :cond_2d
    move-object/from16 v21, v2

    move-object/from16 v30, v3

    move-object/from16 v16, v6

    move-wide/from16 v23, v14

    const-wide/16 v2, 0x0

    .line 125
    iget-object v6, v11, Ls7/o;->h:[J

    aget-wide v7, v6, v12

    add-long v14, v23, v7

    add-int/lit8 v12, v12, 0x1

    move/from16 p1, v0

    move-object/from16 v6, v16

    move-object/from16 v16, v21

    move-object/from16 v7, v27

    move-object/from16 v0, v28

    move-object/from16 v2, v29

    move-object/from16 v3, v30

    goto/16 :goto_1f

    :cond_2e
    move-object/from16 v30, v3

    move-wide/from16 v23, v14

    const-wide/32 v0, 0xf4240

    .line 126
    iget-wide v2, v11, Ls7/o;->d:J

    move-wide/from16 v21, v23

    move-wide/from16 v23, v0

    move-wide/from16 v25, v2

    .line 127
    invoke-static/range {v21 .. v26}, Lf9/q0;->I0(JJJ)J

    move-result-wide v7

    .line 128
    new-instance v12, Ls7/r;

    move-object v0, v12

    move-object/from16 v1, p0

    move-object/from16 v2, v30

    move-object v3, v4

    move/from16 v4, p1

    move-object v5, v10

    move-object v6, v9

    invoke-direct/range {v0 .. v8}, Ls7/r;-><init>(Ls7/o;[J[II[J[IJ)V

    return-object v12

    .line 129
    :cond_2f
    new-instance v0, Ld7/o;

    const-string v1, "Track has no sample table size information"

    invoke-direct {v0, v1}, Ld7/o;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static v(Lf9/y;IILjava/lang/String;Lj7/l;Z)Ls7/b$c;
    .locals 18

    .line 1
    move-object/from16 v10, p0

    .line 2
    .line 3
    move/from16 v11, p1

    .line 4
    .line 5
    const/16 v0, 0xc

    .line 6
    .line 7
    invoke-virtual {v10, v0}, Lf9/y;->P(I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual/range {p0 .. p0}, Lf9/y;->n()I

    .line 11
    .line 12
    .line 13
    move-result v12

    .line 14
    new-instance v13, Ls7/b$c;

    .line 15
    .line 16
    invoke-direct {v13, v12}, Ls7/b$c;-><init>(I)V

    .line 17
    .line 18
    .line 19
    const/4 v14, 0x0

    .line 20
    move v15, v14

    .line 21
    :goto_0
    if-ge v15, v12, :cond_9

    .line 22
    .line 23
    invoke-virtual/range {p0 .. p0}, Lf9/y;->e()I

    .line 24
    .line 25
    .line 26
    move-result v9

    .line 27
    invoke-virtual/range {p0 .. p0}, Lf9/y;->n()I

    .line 28
    .line 29
    .line 30
    move-result v16

    .line 31
    if-lez v16, :cond_0

    .line 32
    .line 33
    const/4 v0, 0x1

    .line 34
    goto :goto_1

    .line 35
    :cond_0
    move v0, v14

    .line 36
    :goto_1
    const-string v1, "childAtomSize should be positive"

    .line 37
    .line 38
    invoke-static {v0, v1}, Lf9/a;->g(ZLjava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual/range {p0 .. p0}, Lf9/y;->n()I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    const v0, 0x61766331

    .line 46
    .line 47
    .line 48
    if-eq v1, v0, :cond_8

    .line 49
    .line 50
    const v0, 0x61766333

    .line 51
    .line 52
    .line 53
    if-eq v1, v0, :cond_8

    .line 54
    .line 55
    const v0, 0x656e6376

    .line 56
    .line 57
    .line 58
    if-eq v1, v0, :cond_8

    .line 59
    .line 60
    const v0, 0x6d317620

    .line 61
    .line 62
    .line 63
    if-eq v1, v0, :cond_8

    .line 64
    .line 65
    const v0, 0x6d703476

    .line 66
    .line 67
    .line 68
    if-eq v1, v0, :cond_8

    .line 69
    .line 70
    const v0, 0x68766331

    .line 71
    .line 72
    .line 73
    if-eq v1, v0, :cond_8

    .line 74
    .line 75
    const v0, 0x68657631

    .line 76
    .line 77
    .line 78
    if-eq v1, v0, :cond_8

    .line 79
    .line 80
    const v0, 0x73323633

    .line 81
    .line 82
    .line 83
    if-eq v1, v0, :cond_8

    .line 84
    .line 85
    const v0, 0x76703038

    .line 86
    .line 87
    .line 88
    if-eq v1, v0, :cond_8

    .line 89
    .line 90
    const v0, 0x76703039

    .line 91
    .line 92
    .line 93
    if-eq v1, v0, :cond_8

    .line 94
    .line 95
    const v0, 0x61763031

    .line 96
    .line 97
    .line 98
    if-eq v1, v0, :cond_8

    .line 99
    .line 100
    const v0, 0x64766176

    .line 101
    .line 102
    .line 103
    if-eq v1, v0, :cond_8

    .line 104
    .line 105
    const v0, 0x64766131

    .line 106
    .line 107
    .line 108
    if-eq v1, v0, :cond_8

    .line 109
    .line 110
    const v0, 0x64766865

    .line 111
    .line 112
    .line 113
    if-eq v1, v0, :cond_8

    .line 114
    .line 115
    const v0, 0x64766831

    .line 116
    .line 117
    .line 118
    if-ne v1, v0, :cond_1

    .line 119
    .line 120
    goto/16 :goto_5

    .line 121
    .line 122
    :cond_1
    const v0, 0x6d703461

    .line 123
    .line 124
    .line 125
    if-eq v1, v0, :cond_7

    .line 126
    .line 127
    const v0, 0x656e6361

    .line 128
    .line 129
    .line 130
    if-eq v1, v0, :cond_7

    .line 131
    .line 132
    const v0, 0x61632d33

    .line 133
    .line 134
    .line 135
    if-eq v1, v0, :cond_7

    .line 136
    .line 137
    const v0, 0x65632d33

    .line 138
    .line 139
    .line 140
    if-eq v1, v0, :cond_7

    .line 141
    .line 142
    const v0, 0x61632d34

    .line 143
    .line 144
    .line 145
    if-eq v1, v0, :cond_7

    .line 146
    .line 147
    const v0, 0x64747363

    .line 148
    .line 149
    .line 150
    if-eq v1, v0, :cond_7

    .line 151
    .line 152
    const v0, 0x64747365

    .line 153
    .line 154
    .line 155
    if-eq v1, v0, :cond_7

    .line 156
    .line 157
    const v0, 0x64747368

    .line 158
    .line 159
    .line 160
    if-eq v1, v0, :cond_7

    .line 161
    .line 162
    const v0, 0x6474736c

    .line 163
    .line 164
    .line 165
    if-eq v1, v0, :cond_7

    .line 166
    .line 167
    const v0, 0x73616d72

    .line 168
    .line 169
    .line 170
    if-eq v1, v0, :cond_7

    .line 171
    .line 172
    const v0, 0x73617762

    .line 173
    .line 174
    .line 175
    if-eq v1, v0, :cond_7

    .line 176
    .line 177
    const v0, 0x6c70636d

    .line 178
    .line 179
    .line 180
    if-eq v1, v0, :cond_7

    .line 181
    .line 182
    const v0, 0x736f7774

    .line 183
    .line 184
    .line 185
    if-eq v1, v0, :cond_7

    .line 186
    .line 187
    const v0, 0x74776f73

    .line 188
    .line 189
    .line 190
    if-eq v1, v0, :cond_7

    .line 191
    .line 192
    const v0, 0x2e6d7032

    .line 193
    .line 194
    .line 195
    if-eq v1, v0, :cond_7

    .line 196
    .line 197
    const v0, 0x2e6d7033

    .line 198
    .line 199
    .line 200
    if-eq v1, v0, :cond_7

    .line 201
    .line 202
    const v0, 0x616c6163

    .line 203
    .line 204
    .line 205
    if-eq v1, v0, :cond_7

    .line 206
    .line 207
    const v0, 0x616c6177

    .line 208
    .line 209
    .line 210
    if-eq v1, v0, :cond_7

    .line 211
    .line 212
    const v0, 0x756c6177

    .line 213
    .line 214
    .line 215
    if-eq v1, v0, :cond_7

    .line 216
    .line 217
    const v0, 0x4f707573

    .line 218
    .line 219
    .line 220
    if-eq v1, v0, :cond_7

    .line 221
    .line 222
    const v0, 0x664c6143

    .line 223
    .line 224
    .line 225
    if-ne v1, v0, :cond_2

    .line 226
    .line 227
    goto :goto_4

    .line 228
    :cond_2
    const v0, 0x54544d4c

    .line 229
    .line 230
    .line 231
    if-eq v1, v0, :cond_5

    .line 232
    .line 233
    const v0, 0x74783367

    .line 234
    .line 235
    .line 236
    if-eq v1, v0, :cond_5

    .line 237
    .line 238
    const v0, 0x77767474

    .line 239
    .line 240
    .line 241
    if-eq v1, v0, :cond_5

    .line 242
    .line 243
    const v0, 0x73747070

    .line 244
    .line 245
    .line 246
    if-eq v1, v0, :cond_5

    .line 247
    .line 248
    const v0, 0x63363038

    .line 249
    .line 250
    .line 251
    if-ne v1, v0, :cond_3

    .line 252
    .line 253
    goto :goto_2

    .line 254
    :cond_3
    const v0, 0x6d657474

    .line 255
    .line 256
    .line 257
    if-ne v1, v0, :cond_4

    .line 258
    .line 259
    invoke-static {v10, v1, v9, v11, v13}, Ls7/b;->n(Lf9/y;IIILs7/b$c;)V

    .line 260
    .line 261
    .line 262
    goto :goto_3

    .line 263
    :cond_4
    const v0, 0x63616d6d

    .line 264
    .line 265
    .line 266
    if-ne v1, v0, :cond_6

    .line 267
    .line 268
    new-instance v0, Ld7/k$b;

    .line 269
    .line 270
    invoke-direct {v0}, Ld7/k$b;-><init>()V

    .line 271
    .line 272
    .line 273
    invoke-virtual {v0, v11}, Ld7/k$b;->R(I)Ld7/k$b;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    const-string v1, "application/x-camera-motion"

    .line 278
    .line 279
    invoke-virtual {v0, v1}, Ld7/k$b;->e0(Ljava/lang/String;)Ld7/k$b;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    invoke-virtual {v0}, Ld7/k$b;->E()Ld7/k;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    iput-object v0, v13, Ls7/b$c;->b:Ld7/k;

    .line 288
    .line 289
    goto :goto_3

    .line 290
    :cond_5
    :goto_2
    move-object/from16 v0, p0

    .line 291
    .line 292
    move v2, v9

    .line 293
    move/from16 v3, v16

    .line 294
    .line 295
    move/from16 v4, p1

    .line 296
    .line 297
    move-object/from16 v5, p3

    .line 298
    .line 299
    move-object v6, v13

    .line 300
    invoke-static/range {v0 .. v6}, Ls7/b;->w(Lf9/y;IIIILjava/lang/String;Ls7/b$c;)V

    .line 301
    .line 302
    .line 303
    :cond_6
    :goto_3
    move/from16 v17, v9

    .line 304
    .line 305
    goto :goto_6

    .line 306
    :cond_7
    :goto_4
    move-object/from16 v0, p0

    .line 307
    .line 308
    move v2, v9

    .line 309
    move/from16 v3, v16

    .line 310
    .line 311
    move/from16 v4, p1

    .line 312
    .line 313
    move-object/from16 v5, p3

    .line 314
    .line 315
    move/from16 v6, p5

    .line 316
    .line 317
    move-object/from16 v7, p4

    .line 318
    .line 319
    move-object v8, v13

    .line 320
    move/from16 v17, v9

    .line 321
    .line 322
    move v9, v15

    .line 323
    invoke-static/range {v0 .. v9}, Ls7/b;->e(Lf9/y;IIIILjava/lang/String;ZLj7/l;Ls7/b$c;I)V

    .line 324
    .line 325
    .line 326
    goto :goto_6

    .line 327
    :cond_8
    :goto_5
    move/from16 v17, v9

    .line 328
    .line 329
    move-object/from16 v0, p0

    .line 330
    .line 331
    move/from16 v2, v17

    .line 332
    .line 333
    move/from16 v3, v16

    .line 334
    .line 335
    move/from16 v4, p1

    .line 336
    .line 337
    move/from16 v5, p2

    .line 338
    .line 339
    move-object/from16 v6, p4

    .line 340
    .line 341
    move-object v7, v13

    .line 342
    move v8, v15

    .line 343
    invoke-static/range {v0 .. v8}, Ls7/b;->C(Lf9/y;IIIIILj7/l;Ls7/b$c;I)V

    .line 344
    .line 345
    .line 346
    :goto_6
    add-int v9, v17, v16

    .line 347
    .line 348
    invoke-virtual {v10, v9}, Lf9/y;->P(I)V

    .line 349
    .line 350
    .line 351
    add-int/lit8 v15, v15, 0x1

    .line 352
    .line 353
    goto/16 :goto_0

    .line 354
    .line 355
    :cond_9
    return-object v13
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
.end method

.method private static w(Lf9/y;IIIILjava/lang/String;Ls7/b$c;)V
    .locals 4

    .line 1
    add-int/lit8 p2, p2, 0x8

    .line 2
    .line 3
    add-int/lit8 p2, p2, 0x8

    .line 4
    .line 5
    invoke-virtual {p0, p2}, Lf9/y;->P(I)V

    .line 6
    .line 7
    .line 8
    const p2, 0x54544d4c

    .line 9
    .line 10
    .line 11
    const-string v0, "application/ttml+xml"

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    const-wide v2, 0x7fffffffffffffffL

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    if-ne p1, p2, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const p2, 0x74783367

    .line 23
    .line 24
    .line 25
    if-ne p1, p2, :cond_1

    .line 26
    .line 27
    add-int/lit8 p3, p3, -0x8

    .line 28
    .line 29
    add-int/lit8 p3, p3, -0x8

    .line 30
    .line 31
    new-array p1, p3, [B

    .line 32
    .line 33
    const/4 p2, 0x0

    .line 34
    invoke-virtual {p0, p1, p2, p3}, Lf9/y;->j([BII)V

    .line 35
    .line 36
    .line 37
    invoke-static {p1}, Lbc/i0;->y(Ljava/lang/Object;)Lbc/i0;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    const-string v0, "application/x-quicktime-tx3g"

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    const p0, 0x77767474

    .line 45
    .line 46
    .line 47
    if-ne p1, p0, :cond_2

    .line 48
    .line 49
    const-string v0, "application/x-mp4-vtt"

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_2
    const p0, 0x73747070

    .line 53
    .line 54
    .line 55
    if-ne p1, p0, :cond_3

    .line 56
    .line 57
    const-wide/16 v2, 0x0

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_3
    const p0, 0x63363038

    .line 61
    .line 62
    .line 63
    if-ne p1, p0, :cond_4

    .line 64
    .line 65
    const/4 p0, 0x1

    .line 66
    iput p0, p6, Ls7/b$c;->d:I

    .line 67
    .line 68
    const-string v0, "application/x-mp4-cea-608"

    .line 69
    .line 70
    :goto_0
    new-instance p0, Ld7/k$b;

    .line 71
    .line 72
    invoke-direct {p0}, Ld7/k$b;-><init>()V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0, p4}, Ld7/k$b;->R(I)Ld7/k$b;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    invoke-virtual {p0, v0}, Ld7/k$b;->e0(Ljava/lang/String;)Ld7/k$b;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    invoke-virtual {p0, p5}, Ld7/k$b;->V(Ljava/lang/String;)Ld7/k$b;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    invoke-virtual {p0, v2, v3}, Ld7/k$b;->i0(J)Ld7/k$b;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-virtual {p0, v1}, Ld7/k$b;->T(Ljava/util/List;)Ld7/k$b;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-virtual {p0}, Ld7/k$b;->E()Ld7/k;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    iput-object p0, p6, Ls7/b$c;->b:Ld7/k;

    .line 100
    .line 101
    return-void

    .line 102
    :cond_4
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 103
    .line 104
    invoke-direct {p0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 105
    .line 106
    .line 107
    throw p0
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
.end method

.method private static x(Lf9/y;)Ls7/b$f;
    .locals 11

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lf9/y;->P(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lf9/y;->n()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-static {v1}, Ls7/a;->c(I)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/16 v2, 0x10

    .line 15
    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    move v3, v0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move v3, v2

    .line 21
    :goto_0
    invoke-virtual {p0, v3}, Lf9/y;->Q(I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lf9/y;->n()I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    const/4 v4, 0x4

    .line 29
    invoke-virtual {p0, v4}, Lf9/y;->Q(I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Lf9/y;->e()I

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    if-nez v1, :cond_1

    .line 37
    .line 38
    move v0, v4

    .line 39
    :cond_1
    const/4 v6, 0x0

    .line 40
    move v7, v6

    .line 41
    :goto_1
    if-ge v7, v0, :cond_3

    .line 42
    .line 43
    invoke-virtual {p0}, Lf9/y;->d()[B

    .line 44
    .line 45
    .line 46
    move-result-object v8

    .line 47
    add-int v9, v5, v7

    .line 48
    .line 49
    aget-byte v8, v8, v9

    .line 50
    .line 51
    const/4 v9, -0x1

    .line 52
    if-eq v8, v9, :cond_2

    .line 53
    .line 54
    move v5, v6

    .line 55
    goto :goto_2

    .line 56
    :cond_2
    add-int/lit8 v7, v7, 0x1

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_3
    const/4 v5, 0x1

    .line 60
    :goto_2
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    if-eqz v5, :cond_4

    .line 66
    .line 67
    invoke-virtual {p0, v0}, Lf9/y;->Q(I)V

    .line 68
    .line 69
    .line 70
    goto :goto_4

    .line 71
    :cond_4
    if-nez v1, :cond_5

    .line 72
    .line 73
    invoke-virtual {p0}, Lf9/y;->F()J

    .line 74
    .line 75
    .line 76
    move-result-wide v0

    .line 77
    goto :goto_3

    .line 78
    :cond_5
    invoke-virtual {p0}, Lf9/y;->I()J

    .line 79
    .line 80
    .line 81
    move-result-wide v0

    .line 82
    :goto_3
    const-wide/16 v9, 0x0

    .line 83
    .line 84
    cmp-long v5, v0, v9

    .line 85
    .line 86
    if-nez v5, :cond_6

    .line 87
    .line 88
    goto :goto_4

    .line 89
    :cond_6
    move-wide v7, v0

    .line 90
    :goto_4
    invoke-virtual {p0, v2}, Lf9/y;->Q(I)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0}, Lf9/y;->n()I

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    invoke-virtual {p0}, Lf9/y;->n()I

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    invoke-virtual {p0, v4}, Lf9/y;->Q(I)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p0}, Lf9/y;->n()I

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    invoke-virtual {p0}, Lf9/y;->n()I

    .line 109
    .line 110
    .line 111
    move-result p0

    .line 112
    const/high16 v4, -0x10000

    .line 113
    .line 114
    const/high16 v5, 0x10000

    .line 115
    .line 116
    if-nez v0, :cond_7

    .line 117
    .line 118
    if-ne v1, v5, :cond_7

    .line 119
    .line 120
    if-ne v2, v4, :cond_7

    .line 121
    .line 122
    if-nez p0, :cond_7

    .line 123
    .line 124
    const/16 v6, 0x5a

    .line 125
    .line 126
    goto :goto_5

    .line 127
    :cond_7
    if-nez v0, :cond_8

    .line 128
    .line 129
    if-ne v1, v4, :cond_8

    .line 130
    .line 131
    if-ne v2, v5, :cond_8

    .line 132
    .line 133
    if-nez p0, :cond_8

    .line 134
    .line 135
    const/16 v6, 0x10e

    .line 136
    .line 137
    goto :goto_5

    .line 138
    :cond_8
    if-ne v0, v4, :cond_9

    .line 139
    .line 140
    if-nez v1, :cond_9

    .line 141
    .line 142
    if-nez v2, :cond_9

    .line 143
    .line 144
    if-ne p0, v4, :cond_9

    .line 145
    .line 146
    const/16 v6, 0xb4

    .line 147
    .line 148
    :cond_9
    :goto_5
    new-instance p0, Ls7/b$f;

    .line 149
    .line 150
    invoke-direct {p0, v3, v7, v8, v6}, Ls7/b$f;-><init>(IJI)V

    .line 151
    .line 152
    .line 153
    return-object p0
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
.end method

.method private static y(Ls7/a$a;Ls7/a$b;JLj7/l;ZZ)Ls7/o;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const v1, 0x6d646961

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, v1}, Ls7/a$a;->f(I)Ls7/a$a;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-static {v1}, Lf9/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, Ls7/a$a;

    .line 15
    .line 16
    const v2, 0x68646c72    # 4.3148E24f

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, v2}, Ls7/a$a;->g(I)Ls7/a$b;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-static {v2}, Lf9/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, Ls7/a$b;

    .line 28
    .line 29
    iget-object v2, v2, Ls7/a$b;->b:Lf9/y;

    .line 30
    .line 31
    invoke-static {v2}, Ls7/b;->j(Lf9/y;)I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    invoke-static {v2}, Ls7/b;->c(I)I

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    const/4 v2, -0x1

    .line 40
    const/4 v3, 0x0

    .line 41
    if-ne v5, v2, :cond_0

    .line 42
    .line 43
    return-object v3

    .line 44
    :cond_0
    const v2, 0x746b6864

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v2}, Ls7/a$a;->g(I)Ls7/a$b;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-static {v2}, Lf9/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    check-cast v2, Ls7/a$b;

    .line 56
    .line 57
    iget-object v2, v2, Ls7/a$b;->b:Lf9/y;

    .line 58
    .line 59
    invoke-static {v2}, Ls7/b;->x(Lf9/y;)Ls7/b$f;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    cmp-long v4, p2, v6

    .line 69
    .line 70
    if-nez v4, :cond_1

    .line 71
    .line 72
    invoke-static {v2}, Ls7/b$f;->a(Ls7/b$f;)J

    .line 73
    .line 74
    .line 75
    move-result-wide v8

    .line 76
    move-object/from16 v4, p1

    .line 77
    .line 78
    move-wide v10, v8

    .line 79
    goto :goto_0

    .line 80
    :cond_1
    move-object/from16 v4, p1

    .line 81
    .line 82
    move-wide/from16 v10, p2

    .line 83
    .line 84
    :goto_0
    iget-object v4, v4, Ls7/a$b;->b:Lf9/y;

    .line 85
    .line 86
    invoke-static {v4}, Ls7/b;->o(Lf9/y;)J

    .line 87
    .line 88
    .line 89
    move-result-wide v8

    .line 90
    cmp-long v4, v10, v6

    .line 91
    .line 92
    if-nez v4, :cond_2

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_2
    const-wide/32 v12, 0xf4240

    .line 96
    .line 97
    .line 98
    move-wide v14, v8

    .line 99
    invoke-static/range {v10 .. v15}, Lf9/q0;->I0(JJJ)J

    .line 100
    .line 101
    .line 102
    move-result-wide v6

    .line 103
    :goto_1
    move-wide v10, v6

    .line 104
    const v4, 0x6d696e66

    .line 105
    .line 106
    .line 107
    invoke-virtual {v1, v4}, Ls7/a$a;->f(I)Ls7/a$a;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    invoke-static {v4}, Lf9/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    check-cast v4, Ls7/a$a;

    .line 116
    .line 117
    const v6, 0x7374626c

    .line 118
    .line 119
    .line 120
    invoke-virtual {v4, v6}, Ls7/a$a;->f(I)Ls7/a$a;

    .line 121
    .line 122
    .line 123
    move-result-object v4

    .line 124
    invoke-static {v4}, Lf9/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v4

    .line 128
    check-cast v4, Ls7/a$a;

    .line 129
    .line 130
    const v6, 0x6d646864

    .line 131
    .line 132
    .line 133
    invoke-virtual {v1, v6}, Ls7/a$a;->g(I)Ls7/a$b;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    invoke-static {v1}, Lf9/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    check-cast v1, Ls7/a$b;

    .line 142
    .line 143
    iget-object v1, v1, Ls7/a$b;->b:Lf9/y;

    .line 144
    .line 145
    invoke-static {v1}, Ls7/b;->l(Lf9/y;)Landroid/util/Pair;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    const v6, 0x73747364

    .line 150
    .line 151
    .line 152
    invoke-virtual {v4, v6}, Ls7/a$a;->g(I)Ls7/a$b;

    .line 153
    .line 154
    .line 155
    move-result-object v4

    .line 156
    invoke-static {v4}, Lf9/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v4

    .line 160
    check-cast v4, Ls7/a$b;

    .line 161
    .line 162
    iget-object v12, v4, Ls7/a$b;->b:Lf9/y;

    .line 163
    .line 164
    invoke-static {v2}, Ls7/b$f;->b(Ls7/b$f;)I

    .line 165
    .line 166
    .line 167
    move-result v13

    .line 168
    invoke-static {v2}, Ls7/b$f;->c(Ls7/b$f;)I

    .line 169
    .line 170
    .line 171
    move-result v14

    .line 172
    iget-object v4, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 173
    .line 174
    move-object v15, v4

    .line 175
    check-cast v15, Ljava/lang/String;

    .line 176
    .line 177
    move-object/from16 v16, p4

    .line 178
    .line 179
    move/from16 v17, p6

    .line 180
    .line 181
    invoke-static/range {v12 .. v17}, Ls7/b;->v(Lf9/y;IILjava/lang/String;Lj7/l;Z)Ls7/b$c;

    .line 182
    .line 183
    .line 184
    move-result-object v4

    .line 185
    if-nez p5, :cond_3

    .line 186
    .line 187
    const v6, 0x65647473

    .line 188
    .line 189
    .line 190
    invoke-virtual {v0, v6}, Ls7/a$a;->f(I)Ls7/a$a;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    if-eqz v0, :cond_3

    .line 195
    .line 196
    invoke-static {v0}, Ls7/b;->g(Ls7/a$a;)Landroid/util/Pair;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    if-eqz v0, :cond_3

    .line 201
    .line 202
    iget-object v6, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 203
    .line 204
    check-cast v6, [J

    .line 205
    .line 206
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 207
    .line 208
    check-cast v0, [J

    .line 209
    .line 210
    move-object/from16 v17, v0

    .line 211
    .line 212
    move-object/from16 v16, v6

    .line 213
    .line 214
    goto :goto_2

    .line 215
    :cond_3
    move-object/from16 v16, v3

    .line 216
    .line 217
    move-object/from16 v17, v16

    .line 218
    .line 219
    :goto_2
    iget-object v0, v4, Ls7/b$c;->b:Ld7/k;

    .line 220
    .line 221
    if-nez v0, :cond_4

    .line 222
    .line 223
    goto :goto_3

    .line 224
    :cond_4
    new-instance v0, Ls7/o;

    .line 225
    .line 226
    invoke-static {v2}, Ls7/b$f;->b(Ls7/b$f;)I

    .line 227
    .line 228
    .line 229
    move-result v2

    .line 230
    iget-object v1, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 231
    .line 232
    check-cast v1, Ljava/lang/Long;

    .line 233
    .line 234
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 235
    .line 236
    .line 237
    move-result-wide v6

    .line 238
    iget-object v12, v4, Ls7/b$c;->b:Ld7/k;

    .line 239
    .line 240
    iget v13, v4, Ls7/b$c;->d:I

    .line 241
    .line 242
    iget-object v14, v4, Ls7/b$c;->a:[Ls7/p;

    .line 243
    .line 244
    iget v15, v4, Ls7/b$c;->c:I

    .line 245
    .line 246
    move-object v3, v0

    .line 247
    move v4, v2

    .line 248
    invoke-direct/range {v3 .. v17}, Ls7/o;-><init>(IIJJJLd7/k;I[Ls7/p;I[J[J)V

    .line 249
    .line 250
    .line 251
    :goto_3
    return-object v3
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
.end method

.method public static z(Ls7/a$a;Ll7/u;JLj7/l;ZZLac/f;)Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls7/a$a;",
            "Ll7/u;",
            "J",
            "Lj7/l;",
            "ZZ",
            "Lac/f<",
            "Ls7/o;",
            "Ls7/o;",
            ">;)",
            "Ljava/util/List<",
            "Ls7/r;",
            ">;"
        }
    .end annotation

    .line 1
    move-object v0, p0

    .line 2
    new-instance v1, Ljava/util/ArrayList;

    .line 3
    .line 4
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 5
    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    :goto_0
    iget-object v3, v0, Ls7/a$a;->d:Ljava/util/List;

    .line 9
    .line 10
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    if-ge v2, v3, :cond_2

    .line 15
    .line 16
    iget-object v3, v0, Ls7/a$a;->d:Ljava/util/List;

    .line 17
    .line 18
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    check-cast v3, Ls7/a$a;

    .line 23
    .line 24
    iget v4, v3, Ls7/a;->a:I

    .line 25
    .line 26
    const v5, 0x7472616b

    .line 27
    .line 28
    .line 29
    if-eq v4, v5, :cond_0

    .line 30
    .line 31
    move-object v6, p1

    .line 32
    move-object/from16 v5, p7

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_0
    const v4, 0x6d766864

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, v4}, Ls7/a$a;->g(I)Ls7/a$b;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    invoke-static {v4}, Lf9/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    move-object v5, v4

    .line 47
    check-cast v5, Ls7/a$b;

    .line 48
    .line 49
    move-object v4, v3

    .line 50
    move-wide v6, p2

    .line 51
    move-object v8, p4

    .line 52
    move/from16 v9, p5

    .line 53
    .line 54
    move/from16 v10, p6

    .line 55
    .line 56
    invoke-static/range {v4 .. v10}, Ls7/b;->y(Ls7/a$a;Ls7/a$b;JLj7/l;ZZ)Ls7/o;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    move-object/from16 v5, p7

    .line 61
    .line 62
    invoke-interface {v5, v4}, Lac/f;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    check-cast v4, Ls7/o;

    .line 67
    .line 68
    if-nez v4, :cond_1

    .line 69
    .line 70
    move-object v6, p1

    .line 71
    goto :goto_1

    .line 72
    :cond_1
    const v6, 0x6d646961

    .line 73
    .line 74
    .line 75
    invoke-virtual {v3, v6}, Ls7/a$a;->f(I)Ls7/a$a;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    invoke-static {v3}, Lf9/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    check-cast v3, Ls7/a$a;

    .line 84
    .line 85
    const v6, 0x6d696e66

    .line 86
    .line 87
    .line 88
    invoke-virtual {v3, v6}, Ls7/a$a;->f(I)Ls7/a$a;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    invoke-static {v3}, Lf9/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    check-cast v3, Ls7/a$a;

    .line 97
    .line 98
    const v6, 0x7374626c

    .line 99
    .line 100
    .line 101
    invoke-virtual {v3, v6}, Ls7/a$a;->f(I)Ls7/a$a;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    invoke-static {v3}, Lf9/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    check-cast v3, Ls7/a$a;

    .line 110
    .line 111
    move-object v6, p1

    .line 112
    invoke-static {v4, v3, p1}, Ls7/b;->u(Ls7/o;Ls7/a$a;Ll7/u;)Ls7/r;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 120
    .line 121
    goto :goto_0

    .line 122
    :cond_2
    return-object v1
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
.end method
