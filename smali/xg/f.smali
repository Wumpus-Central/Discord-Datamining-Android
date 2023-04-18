.class public Lxg/f;
.super Lpg/c0;
.source "SourceFile"

# interfaces
.implements Lxg/a;


# instance fields
.field private final M:Z

.field private final N:Lkotlin/Pair;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/Pair<",
            "Lmg/a$a<",
            "*>;*>;"
        }
    .end annotation
.end field

.field private O:Ldi/g0;


# direct methods
.method protected constructor <init>(Lmg/m;Lng/g;Lmg/e0;Lmg/u;ZLlh/f;Lmg/a1;Lmg/u0;Lmg/b$a;ZLkotlin/Pair;)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmg/m;",
            "Lng/g;",
            "Lmg/e0;",
            "Lmg/u;",
            "Z",
            "Llh/f;",
            "Lmg/a1;",
            "Lmg/u0;",
            "Lmg/b$a;",
            "Z",
            "Lkotlin/Pair<",
            "Lmg/a$a<",
            "*>;*>;)V"
        }
    .end annotation

    .line 1
    move-object/from16 v15, p0

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-static {v0}, Lxg/f;->G(I)V

    .line 7
    .line 8
    .line 9
    :cond_0
    if-nez p2, :cond_1

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    invoke-static {v0}, Lxg/f;->G(I)V

    .line 13
    .line 14
    .line 15
    :cond_1
    if-nez p3, :cond_2

    .line 16
    .line 17
    const/4 v0, 0x2

    .line 18
    invoke-static {v0}, Lxg/f;->G(I)V

    .line 19
    .line 20
    .line 21
    :cond_2
    if-nez p4, :cond_3

    .line 22
    .line 23
    const/4 v0, 0x3

    .line 24
    invoke-static {v0}, Lxg/f;->G(I)V

    .line 25
    .line 26
    .line 27
    :cond_3
    if-nez p6, :cond_4

    .line 28
    .line 29
    const/4 v0, 0x4

    .line 30
    invoke-static {v0}, Lxg/f;->G(I)V

    .line 31
    .line 32
    .line 33
    :cond_4
    if-nez p7, :cond_5

    .line 34
    .line 35
    const/4 v0, 0x5

    .line 36
    invoke-static {v0}, Lxg/f;->G(I)V

    .line 37
    .line 38
    .line 39
    :cond_5
    if-nez p9, :cond_6

    .line 40
    .line 41
    const/4 v0, 0x6

    .line 42
    invoke-static {v0}, Lxg/f;->G(I)V

    .line 43
    .line 44
    .line 45
    :cond_6
    const/4 v10, 0x0

    .line 46
    const/4 v11, 0x0

    .line 47
    const/4 v12, 0x0

    .line 48
    const/4 v13, 0x0

    .line 49
    const/4 v14, 0x0

    .line 50
    const/16 v16, 0x0

    .line 51
    .line 52
    move-object/from16 v0, p0

    .line 53
    .line 54
    move-object/from16 v1, p1

    .line 55
    .line 56
    move-object/from16 v2, p8

    .line 57
    .line 58
    move-object/from16 v3, p2

    .line 59
    .line 60
    move-object/from16 v4, p3

    .line 61
    .line 62
    move-object/from16 v5, p4

    .line 63
    .line 64
    move/from16 v6, p5

    .line 65
    .line 66
    move-object/from16 v7, p6

    .line 67
    .line 68
    move-object/from16 v8, p9

    .line 69
    .line 70
    move-object/from16 v9, p7

    .line 71
    .line 72
    move/from16 v15, v16

    .line 73
    .line 74
    invoke-direct/range {v0 .. v15}, Lpg/c0;-><init>(Lmg/m;Lmg/u0;Lng/g;Lmg/e0;Lmg/u;ZLlh/f;Lmg/b$a;Lmg/a1;ZZZZZZ)V

    .line 75
    .line 76
    .line 77
    const/4 v0, 0x0

    .line 78
    move-object/from16 v1, p0

    .line 79
    .line 80
    iput-object v0, v1, Lxg/f;->O:Ldi/g0;

    .line 81
    .line 82
    move/from16 v0, p10

    .line 83
    .line 84
    iput-boolean v0, v1, Lxg/f;->M:Z

    .line 85
    .line 86
    move-object/from16 v0, p11

    .line 87
    .line 88
    iput-object v0, v1, Lxg/f;->N:Lkotlin/Pair;

    .line 89
    .line 90
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
.end method

.method private static synthetic G(I)V
    .locals 7

    const/16 v0, 0x15

    if-eq p0, v0, :cond_0

    const-string v1, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    goto :goto_0

    :cond_0
    const-string v1, "@NotNull method %s.%s must not return null"

    :goto_0
    const/4 v2, 0x2

    if-eq p0, v0, :cond_1

    const/4 v3, 0x3

    goto :goto_1

    :cond_1
    move v3, v2

    :goto_1
    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor"

    const/4 v5, 0x0

    packed-switch p0, :pswitch_data_0

    :pswitch_0
    const-string v6, "containingDeclaration"

    aput-object v6, v3, v5

    goto :goto_2

    :pswitch_1
    const-string v6, "inType"

    aput-object v6, v3, v5

    goto :goto_2

    :pswitch_2
    aput-object v4, v3, v5

    goto :goto_2

    :pswitch_3
    const-string v6, "enhancedReturnType"

    aput-object v6, v3, v5

    goto :goto_2

    :pswitch_4
    const-string v6, "enhancedValueParameterTypes"

    aput-object v6, v3, v5

    goto :goto_2

    :pswitch_5
    const-string v6, "newName"

    aput-object v6, v3, v5

    goto :goto_2

    :pswitch_6
    const-string v6, "newVisibility"

    aput-object v6, v3, v5

    goto :goto_2

    :pswitch_7
    const-string v6, "newModality"

    aput-object v6, v3, v5

    goto :goto_2

    :pswitch_8
    const-string v6, "newOwner"

    aput-object v6, v3, v5

    goto :goto_2

    :pswitch_9
    const-string v6, "kind"

    aput-object v6, v3, v5

    goto :goto_2

    :pswitch_a
    const-string v6, "source"

    aput-object v6, v3, v5

    goto :goto_2

    :pswitch_b
    const-string v6, "name"

    aput-object v6, v3, v5

    goto :goto_2

    :pswitch_c
    const-string v6, "visibility"

    aput-object v6, v3, v5

    goto :goto_2

    :pswitch_d
    const-string v6, "modality"

    aput-object v6, v3, v5

    goto :goto_2

    :pswitch_e
    const-string v6, "annotations"

    aput-object v6, v3, v5

    :goto_2
    const-string v5, "enhance"

    const/4 v6, 0x1

    if-eq p0, v0, :cond_2

    aput-object v4, v3, v6

    goto :goto_3

    :cond_2
    aput-object v5, v3, v6

    :goto_3
    packed-switch p0, :pswitch_data_1

    const-string v4, "<init>"

    aput-object v4, v3, v2

    goto :goto_4

    :pswitch_f
    const-string v4, "setInType"

    aput-object v4, v3, v2

    goto :goto_4

    :pswitch_10
    aput-object v5, v3, v2

    goto :goto_4

    :pswitch_11
    const-string v4, "createSubstitutedCopy"

    aput-object v4, v3, v2

    goto :goto_4

    :pswitch_12
    const-string v4, "create"

    aput-object v4, v3, v2

    :goto_4
    :pswitch_13
    invoke-static {v1, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    if-eq p0, v0, :cond_3

    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_5

    :cond_3
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    :goto_5
    throw p0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_0
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_9
        :pswitch_5
        :pswitch_a
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x7
        :pswitch_12
        :pswitch_12
        :pswitch_12
        :pswitch_12
        :pswitch_12
        :pswitch_12
        :pswitch_11
        :pswitch_11
        :pswitch_11
        :pswitch_11
        :pswitch_11
        :pswitch_11
        :pswitch_10
        :pswitch_10
        :pswitch_13
        :pswitch_f
    .end packed-switch
.end method

.method public static f1(Lmg/m;Lng/g;Lmg/e0;Lmg/u;ZLlh/f;Lmg/a1;Z)Lxg/f;
    .locals 13

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x7

    .line 4
    invoke-static {v0}, Lxg/f;->G(I)V

    .line 5
    .line 6
    .line 7
    :cond_0
    if-nez p1, :cond_1

    .line 8
    .line 9
    const/16 v0, 0x8

    .line 10
    .line 11
    invoke-static {v0}, Lxg/f;->G(I)V

    .line 12
    .line 13
    .line 14
    :cond_1
    if-nez p2, :cond_2

    .line 15
    .line 16
    const/16 v0, 0x9

    .line 17
    .line 18
    invoke-static {v0}, Lxg/f;->G(I)V

    .line 19
    .line 20
    .line 21
    :cond_2
    if-nez p3, :cond_3

    .line 22
    .line 23
    const/16 v0, 0xa

    .line 24
    .line 25
    invoke-static {v0}, Lxg/f;->G(I)V

    .line 26
    .line 27
    .line 28
    :cond_3
    if-nez p5, :cond_4

    .line 29
    .line 30
    const/16 v0, 0xb

    .line 31
    .line 32
    invoke-static {v0}, Lxg/f;->G(I)V

    .line 33
    .line 34
    .line 35
    :cond_4
    if-nez p6, :cond_5

    .line 36
    .line 37
    const/16 v0, 0xc

    .line 38
    .line 39
    invoke-static {v0}, Lxg/f;->G(I)V

    .line 40
    .line 41
    .line 42
    :cond_5
    new-instance v12, Lxg/f;

    .line 43
    .line 44
    const/4 v8, 0x0

    .line 45
    sget-object v9, Lmg/b$a;->k:Lmg/b$a;

    .line 46
    .line 47
    const/4 v11, 0x0

    .line 48
    move-object v0, v12

    .line 49
    move-object v1, p0

    .line 50
    move-object v2, p1

    .line 51
    move-object v3, p2

    .line 52
    move-object/from16 v4, p3

    .line 53
    .line 54
    move/from16 v5, p4

    .line 55
    .line 56
    move-object/from16 v6, p5

    .line 57
    .line 58
    move-object/from16 v7, p6

    .line 59
    .line 60
    move/from16 v10, p7

    .line 61
    .line 62
    invoke-direct/range {v0 .. v11}, Lxg/f;-><init>(Lmg/m;Lng/g;Lmg/e0;Lmg/u;ZLlh/f;Lmg/a1;Lmg/u0;Lmg/b$a;ZLkotlin/Pair;)V

    .line 63
    .line 64
    .line 65
    return-object v12
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
.end method


# virtual methods
.method public F()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public N(Ldi/g0;Ljava/util/List;Ldi/g0;Lkotlin/Pair;)Lxg/a;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldi/g0;",
            "Ljava/util/List<",
            "Ldi/g0;",
            ">;",
            "Ldi/g0;",
            "Lkotlin/Pair<",
            "Lmg/a$a<",
            "*>;*>;)",
            "Lxg/a;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    if-nez p2, :cond_0

    .line 8
    .line 9
    const/16 v3, 0x13

    .line 10
    .line 11
    invoke-static {v3}, Lxg/f;->G(I)V

    .line 12
    .line 13
    .line 14
    :cond_0
    if-nez v2, :cond_1

    .line 15
    .line 16
    const/16 v3, 0x14

    .line 17
    .line 18
    invoke-static {v3}, Lxg/f;->G(I)V

    .line 19
    .line 20
    .line 21
    :cond_1
    invoke-virtual/range {p0 .. p0}, Lpg/c0;->a()Lmg/u0;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    if-ne v3, v0, :cond_2

    .line 26
    .line 27
    const/4 v3, 0x0

    .line 28
    goto :goto_0

    .line 29
    :cond_2
    invoke-virtual/range {p0 .. p0}, Lpg/c0;->a()Lmg/u0;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    :goto_0
    new-instance v15, Lxg/f;

    .line 34
    .line 35
    invoke-virtual/range {p0 .. p0}, Lpg/k;->b()Lmg/m;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    invoke-virtual/range {p0 .. p0}, Lng/b;->getAnnotations()Lng/g;

    .line 40
    .line 41
    .line 42
    move-result-object v7

    .line 43
    invoke-virtual/range {p0 .. p0}, Lpg/c0;->l()Lmg/e0;

    .line 44
    .line 45
    .line 46
    move-result-object v8

    .line 47
    invoke-virtual/range {p0 .. p0}, Lpg/c0;->getVisibility()Lmg/u;

    .line 48
    .line 49
    .line 50
    move-result-object v9

    .line 51
    invoke-virtual/range {p0 .. p0}, Lpg/n0;->i0()Z

    .line 52
    .line 53
    .line 54
    move-result v10

    .line 55
    invoke-virtual/range {p0 .. p0}, Lpg/j;->getName()Llh/f;

    .line 56
    .line 57
    .line 58
    move-result-object v11

    .line 59
    invoke-virtual/range {p0 .. p0}, Lpg/k;->j()Lmg/a1;

    .line 60
    .line 61
    .line 62
    move-result-object v12

    .line 63
    invoke-virtual/range {p0 .. p0}, Lpg/c0;->g()Lmg/b$a;

    .line 64
    .line 65
    .line 66
    move-result-object v14

    .line 67
    iget-boolean v13, v0, Lxg/f;->M:Z

    .line 68
    .line 69
    move-object v5, v15

    .line 70
    move/from16 v16, v13

    .line 71
    .line 72
    move-object v13, v3

    .line 73
    move-object/from16 p2, v15

    .line 74
    .line 75
    move/from16 v15, v16

    .line 76
    .line 77
    move-object/from16 v16, p4

    .line 78
    .line 79
    invoke-direct/range {v5 .. v16}, Lxg/f;-><init>(Lmg/m;Lng/g;Lmg/e0;Lmg/u;ZLlh/f;Lmg/a1;Lmg/u0;Lmg/b$a;ZLkotlin/Pair;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual/range {p0 .. p0}, Lpg/c0;->R0()Lpg/d0;

    .line 83
    .line 84
    .line 85
    move-result-object v16

    .line 86
    if-eqz v16, :cond_4

    .line 87
    .line 88
    new-instance v15, Lpg/d0;

    .line 89
    .line 90
    invoke-virtual/range {v16 .. v16}, Lng/b;->getAnnotations()Lng/g;

    .line 91
    .line 92
    .line 93
    move-result-object v7

    .line 94
    invoke-virtual/range {v16 .. v16}, Lpg/b0;->l()Lmg/e0;

    .line 95
    .line 96
    .line 97
    move-result-object v8

    .line 98
    invoke-virtual/range {v16 .. v16}, Lpg/b0;->getVisibility()Lmg/u;

    .line 99
    .line 100
    .line 101
    move-result-object v9

    .line 102
    invoke-virtual/range {v16 .. v16}, Lpg/b0;->V()Z

    .line 103
    .line 104
    .line 105
    move-result v10

    .line 106
    invoke-virtual/range {v16 .. v16}, Lpg/b0;->isExternal()Z

    .line 107
    .line 108
    .line 109
    move-result v11

    .line 110
    invoke-virtual/range {v16 .. v16}, Lpg/b0;->isInline()Z

    .line 111
    .line 112
    .line 113
    move-result v12

    .line 114
    invoke-virtual/range {p0 .. p0}, Lpg/c0;->g()Lmg/b$a;

    .line 115
    .line 116
    .line 117
    move-result-object v13

    .line 118
    if-nez v3, :cond_3

    .line 119
    .line 120
    const/4 v14, 0x0

    .line 121
    goto :goto_1

    .line 122
    :cond_3
    invoke-interface {v3}, Lmg/u0;->f()Lmg/v0;

    .line 123
    .line 124
    .line 125
    move-result-object v5

    .line 126
    move-object v14, v5

    .line 127
    :goto_1
    invoke-virtual/range {v16 .. v16}, Lpg/k;->j()Lmg/a1;

    .line 128
    .line 129
    .line 130
    move-result-object v17

    .line 131
    move-object v5, v15

    .line 132
    move-object/from16 v6, p2

    .line 133
    .line 134
    move-object v4, v15

    .line 135
    move-object/from16 v15, v17

    .line 136
    .line 137
    invoke-direct/range {v5 .. v15}, Lpg/d0;-><init>(Lmg/u0;Lng/g;Lmg/e0;Lmg/u;ZZZLmg/b$a;Lmg/v0;Lmg/a1;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual/range {v16 .. v16}, Lpg/b0;->e0()Lmg/y;

    .line 141
    .line 142
    .line 143
    move-result-object v5

    .line 144
    invoke-virtual {v4, v5}, Lpg/b0;->N0(Lmg/y;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v4, v2}, Lpg/d0;->Q0(Ldi/g0;)V

    .line 148
    .line 149
    .line 150
    goto :goto_2

    .line 151
    :cond_4
    const/4 v4, 0x0

    .line 152
    :goto_2
    invoke-virtual/range {p0 .. p0}, Lpg/c0;->h()Lmg/w0;

    .line 153
    .line 154
    .line 155
    move-result-object v16

    .line 156
    if-eqz v16, :cond_6

    .line 157
    .line 158
    new-instance v15, Lpg/e0;

    .line 159
    .line 160
    invoke-interface/range {v16 .. v16}, Lng/a;->getAnnotations()Lng/g;

    .line 161
    .line 162
    .line 163
    move-result-object v7

    .line 164
    invoke-interface/range {v16 .. v16}, Lmg/d0;->l()Lmg/e0;

    .line 165
    .line 166
    .line 167
    move-result-object v8

    .line 168
    invoke-interface/range {v16 .. v16}, Lmg/d0;->getVisibility()Lmg/u;

    .line 169
    .line 170
    .line 171
    move-result-object v9

    .line 172
    invoke-interface/range {v16 .. v16}, Lmg/t0;->V()Z

    .line 173
    .line 174
    .line 175
    move-result v10

    .line 176
    invoke-interface/range {v16 .. v16}, Lmg/d0;->isExternal()Z

    .line 177
    .line 178
    .line 179
    move-result v11

    .line 180
    invoke-interface/range {v16 .. v16}, Lmg/y;->isInline()Z

    .line 181
    .line 182
    .line 183
    move-result v12

    .line 184
    invoke-virtual/range {p0 .. p0}, Lpg/c0;->g()Lmg/b$a;

    .line 185
    .line 186
    .line 187
    move-result-object v13

    .line 188
    if-nez v3, :cond_5

    .line 189
    .line 190
    const/4 v14, 0x0

    .line 191
    goto :goto_3

    .line 192
    :cond_5
    invoke-interface {v3}, Lmg/u0;->h()Lmg/w0;

    .line 193
    .line 194
    .line 195
    move-result-object v3

    .line 196
    move-object v14, v3

    .line 197
    :goto_3
    invoke-interface/range {v16 .. v16}, Lmg/p;->j()Lmg/a1;

    .line 198
    .line 199
    .line 200
    move-result-object v3

    .line 201
    move-object v5, v15

    .line 202
    move-object/from16 v6, p2

    .line 203
    .line 204
    move-object/from16 p4, v15

    .line 205
    .line 206
    move-object v15, v3

    .line 207
    invoke-direct/range {v5 .. v15}, Lpg/e0;-><init>(Lmg/u0;Lng/g;Lmg/e0;Lmg/u;ZZZLmg/b$a;Lmg/w0;Lmg/a1;)V

    .line 208
    .line 209
    .line 210
    invoke-virtual/range {p4 .. p4}, Lpg/b0;->e0()Lmg/y;

    .line 211
    .line 212
    .line 213
    move-result-object v3

    .line 214
    move-object/from16 v5, p4

    .line 215
    .line 216
    invoke-virtual {v5, v3}, Lpg/b0;->N0(Lmg/y;)V

    .line 217
    .line 218
    .line 219
    invoke-interface/range {v16 .. v16}, Lmg/a;->i()Ljava/util/List;

    .line 220
    .line 221
    .line 222
    move-result-object v3

    .line 223
    const/4 v6, 0x0

    .line 224
    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v3

    .line 228
    check-cast v3, Lmg/j1;

    .line 229
    .line 230
    invoke-virtual {v5, v3}, Lpg/e0;->R0(Lmg/j1;)V

    .line 231
    .line 232
    .line 233
    move-object v15, v5

    .line 234
    goto :goto_4

    .line 235
    :cond_6
    const/4 v15, 0x0

    .line 236
    :goto_4
    invoke-virtual/range {p0 .. p0}, Lpg/c0;->o0()Lmg/w;

    .line 237
    .line 238
    .line 239
    move-result-object v3

    .line 240
    invoke-virtual/range {p0 .. p0}, Lpg/c0;->l0()Lmg/w;

    .line 241
    .line 242
    .line 243
    move-result-object v5

    .line 244
    move-object/from16 v7, p2

    .line 245
    .line 246
    invoke-virtual {v7, v4, v15, v3, v5}, Lpg/c0;->V0(Lpg/d0;Lmg/w0;Lmg/w;Lmg/w;)V

    .line 247
    .line 248
    .line 249
    invoke-virtual/range {p0 .. p0}, Lpg/c0;->W0()Z

    .line 250
    .line 251
    .line 252
    move-result v3

    .line 253
    invoke-virtual {v7, v3}, Lpg/c0;->a1(Z)V

    .line 254
    .line 255
    .line 256
    iget-object v3, v0, Lpg/n0;->r:Lkotlin/jvm/functions/Function0;

    .line 257
    .line 258
    if-eqz v3, :cond_7

    .line 259
    .line 260
    iget-object v4, v0, Lpg/n0;->q:Lci/j;

    .line 261
    .line 262
    invoke-virtual {v7, v4, v3}, Lpg/n0;->K0(Lci/j;Lkotlin/jvm/functions/Function0;)V

    .line 263
    .line 264
    .line 265
    :cond_7
    invoke-virtual/range {p0 .. p0}, Lpg/c0;->e()Ljava/util/Collection;

    .line 266
    .line 267
    .line 268
    move-result-object v3

    .line 269
    invoke-virtual {v7, v3}, Lpg/c0;->x0(Ljava/util/Collection;)V

    .line 270
    .line 271
    .line 272
    if-nez v1, :cond_8

    .line 273
    .line 274
    const/4 v5, 0x0

    .line 275
    goto :goto_5

    .line 276
    :cond_8
    sget-object v3, Lng/g;->f:Lng/g$a;

    .line 277
    .line 278
    invoke-virtual {v3}, Lng/g$a;->b()Lng/g;

    .line 279
    .line 280
    .line 281
    move-result-object v3

    .line 282
    invoke-static {v0, v1, v3}, Lph/d;->i(Lmg/a;Ldi/g0;Lng/g;)Lmg/x0;

    .line 283
    .line 284
    .line 285
    move-result-object v1

    .line 286
    move-object v5, v1

    .line 287
    :goto_5
    invoke-virtual/range {p0 .. p0}, Lpg/c0;->getTypeParameters()Ljava/util/List;

    .line 288
    .line 289
    .line 290
    move-result-object v3

    .line 291
    invoke-virtual/range {p0 .. p0}, Lpg/c0;->f0()Lmg/x0;

    .line 292
    .line 293
    .line 294
    move-result-object v4

    .line 295
    invoke-static {}, Lkotlin/collections/h;->i()Ljava/util/List;

    .line 296
    .line 297
    .line 298
    move-result-object v6

    .line 299
    move-object v1, v7

    .line 300
    move-object/from16 v2, p3

    .line 301
    .line 302
    invoke-virtual/range {v1 .. v6}, Lpg/c0;->b1(Ldi/g0;Ljava/util/List;Lmg/x0;Lmg/x0;Ljava/util/List;)V

    .line 303
    .line 304
    .line 305
    return-object v7
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
.end method

.method protected P0(Lmg/m;Lmg/e0;Lmg/u;Lmg/u0;Lmg/b$a;Llh/f;Lmg/a1;)Lpg/c0;
    .locals 14

    .line 1
    move-object v0, p0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    const/16 v1, 0xd

    .line 5
    .line 6
    invoke-static {v1}, Lxg/f;->G(I)V

    .line 7
    .line 8
    .line 9
    :cond_0
    if-nez p2, :cond_1

    .line 10
    .line 11
    const/16 v1, 0xe

    .line 12
    .line 13
    invoke-static {v1}, Lxg/f;->G(I)V

    .line 14
    .line 15
    .line 16
    :cond_1
    if-nez p3, :cond_2

    .line 17
    .line 18
    const/16 v1, 0xf

    .line 19
    .line 20
    invoke-static {v1}, Lxg/f;->G(I)V

    .line 21
    .line 22
    .line 23
    :cond_2
    if-nez p5, :cond_3

    .line 24
    .line 25
    const/16 v1, 0x10

    .line 26
    .line 27
    invoke-static {v1}, Lxg/f;->G(I)V

    .line 28
    .line 29
    .line 30
    :cond_3
    if-nez p6, :cond_4

    .line 31
    .line 32
    const/16 v1, 0x11

    .line 33
    .line 34
    invoke-static {v1}, Lxg/f;->G(I)V

    .line 35
    .line 36
    .line 37
    :cond_4
    if-nez p7, :cond_5

    .line 38
    .line 39
    const/16 v1, 0x12

    .line 40
    .line 41
    invoke-static {v1}, Lxg/f;->G(I)V

    .line 42
    .line 43
    .line 44
    :cond_5
    new-instance v13, Lxg/f;

    .line 45
    .line 46
    invoke-virtual {p0}, Lng/b;->getAnnotations()Lng/g;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-virtual {p0}, Lpg/n0;->i0()Z

    .line 51
    .line 52
    .line 53
    move-result v6

    .line 54
    iget-boolean v11, v0, Lxg/f;->M:Z

    .line 55
    .line 56
    iget-object v12, v0, Lxg/f;->N:Lkotlin/Pair;

    .line 57
    .line 58
    move-object v1, v13

    .line 59
    move-object v2, p1

    .line 60
    move-object/from16 v4, p2

    .line 61
    .line 62
    move-object/from16 v5, p3

    .line 63
    .line 64
    move-object/from16 v7, p6

    .line 65
    .line 66
    move-object/from16 v8, p7

    .line 67
    .line 68
    move-object/from16 v9, p4

    .line 69
    .line 70
    move-object/from16 v10, p5

    .line 71
    .line 72
    invoke-direct/range {v1 .. v12}, Lxg/f;-><init>(Lmg/m;Lng/g;Lmg/e0;Lmg/u;ZLlh/f;Lmg/a1;Lmg/u0;Lmg/b$a;ZLkotlin/Pair;)V

    .line 73
    .line 74
    .line 75
    return-object v13
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
.end method

.method public Z0(Ldi/g0;)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/16 v0, 0x16

    .line 4
    .line 5
    invoke-static {v0}, Lxg/f;->G(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iput-object p1, p0, Lxg/f;->O:Ldi/g0;

    .line 9
    .line 10
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
.end method

.method public v0(Lmg/a$a;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Lmg/a$a<",
            "TV;>;)TV;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lxg/f;->N:Lkotlin/Pair;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lkotlin/Pair;->c()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lmg/a$a;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    iget-object p1, p0, Lxg/f;->N:Lkotlin/Pair;

    .line 18
    .line 19
    invoke-virtual {p1}, Lkotlin/Pair;->d()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1

    .line 24
    :cond_0
    const/4 p1, 0x0

    .line 25
    return-object p1
    .line 26
    .line 27
.end method

.method public y()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lpg/m0;->getType()Ldi/g0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v1, p0, Lxg/f;->M:Z

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    invoke-static {v0}, Lmg/j;->a(Ldi/g0;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    invoke-static {v0}, Ldh/r;->i(Ldi/g0;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    invoke-static {v0}, Ljg/h;->u0(Ldi/g0;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    :cond_0
    const/4 v0, 0x1

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    const/4 v0, 0x0

    .line 30
    :goto_0
    return v0
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
.end method
