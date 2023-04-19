.class final Lrg/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lrg/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lrg/c;

    invoke-direct {v0}, Lrg/c;-><init>()V

    sput-object v0, Lrg/c;->a:Lrg/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a(Ljava/lang/Class;)Lrh/f;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lrh/f;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Class;->isArray()Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    add-int/lit8 v0, v0, 0x1

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const-string v1, "currentClass.componentType"

    .line 15
    .line 16
    invoke-static {p1, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Class;->isPrimitive()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_3

    .line 25
    .line 26
    sget-object v1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 27
    .line 28
    invoke-static {p1, v1}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    new-instance p1, Lrh/f;

    .line 35
    .line 36
    sget-object v1, Ljg/k$a;->f:Llh/d;

    .line 37
    .line 38
    invoke-virtual {v1}, Llh/d;->l()Llh/c;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-static {v1}, Llh/b;->m(Llh/c;)Llh/b;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    const-string v2, "topLevel(StandardNames.FqNames.unit.toSafe())"

    .line 47
    .line 48
    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-direct {p1, v1, v0}, Lrh/f;-><init>(Llh/b;I)V

    .line 52
    .line 53
    .line 54
    return-object p1

    .line 55
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-static {p1}, Luh/e;->b(Ljava/lang/String;)Luh/e;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-virtual {p1}, Luh/e;->h()Ljg/i;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    const-string v1, "get(currentClass.name).primitiveType"

    .line 68
    .line 69
    invoke-static {p1, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    if-lez v0, :cond_2

    .line 73
    .line 74
    new-instance v1, Lrh/f;

    .line 75
    .line 76
    invoke-virtual {p1}, Ljg/i;->b()Llh/c;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-static {p1}, Llh/b;->m(Llh/c;)Llh/b;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    const-string v2, "topLevel(primitiveType.arrayTypeFqName)"

    .line 85
    .line 86
    invoke-static {p1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    add-int/lit8 v0, v0, -0x1

    .line 90
    .line 91
    invoke-direct {v1, p1, v0}, Lrh/f;-><init>(Llh/b;I)V

    .line 92
    .line 93
    .line 94
    return-object v1

    .line 95
    :cond_2
    new-instance v1, Lrh/f;

    .line 96
    .line 97
    invoke-virtual {p1}, Ljg/i;->e()Llh/c;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-static {p1}, Llh/b;->m(Llh/c;)Llh/b;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    const-string v2, "topLevel(primitiveType.typeFqName)"

    .line 106
    .line 107
    invoke-static {p1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    invoke-direct {v1, p1, v0}, Lrh/f;-><init>(Llh/b;I)V

    .line 111
    .line 112
    .line 113
    return-object v1

    .line 114
    :cond_3
    invoke-static {p1}, Lsg/d;->a(Ljava/lang/Class;)Llh/b;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    sget-object v1, Llg/c;->a:Llg/c;

    .line 119
    .line 120
    invoke-virtual {p1}, Llh/b;->b()Llh/c;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    const-string v3, "javaClassId.asSingleFqName()"

    .line 125
    .line 126
    invoke-static {v2, v3}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v1, v2}, Llg/c;->m(Llh/c;)Llh/b;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    if-nez v1, :cond_4

    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_4
    move-object p1, v1

    .line 137
    :goto_1
    new-instance v1, Lrh/f;

    .line 138
    .line 139
    invoke-direct {v1, p1, v0}, Lrh/f;-><init>(Llh/b;I)V

    .line 140
    .line 141
    .line 142
    return-object v1
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

.method private final c(Ljava/lang/Class;Leh/r$d;)V
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Leh/r$d;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "klass.declaredConstructors"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    array-length v1, v0

    .line 11
    const/4 v3, 0x0

    .line 12
    :goto_0
    if-ge v3, v1, :cond_6

    .line 13
    .line 14
    aget-object v4, v0, v3

    .line 15
    .line 16
    sget-object v5, Llh/h;->j:Llh/f;

    .line 17
    .line 18
    sget-object v6, Lrg/m;->a:Lrg/m;

    .line 19
    .line 20
    const-string v7, "constructor"

    .line 21
    .line 22
    invoke-static {v4, v7}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v6, v4}, Lrg/m;->a(Ljava/lang/reflect/Constructor;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v6

    .line 29
    move-object/from16 v7, p2

    .line 30
    .line 31
    invoke-interface {v7, v5, v6}, Leh/r$d;->a(Llh/f;Ljava/lang/String;)Leh/r$e;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    if-nez v5, :cond_0

    .line 36
    .line 37
    move-object/from16 v12, p0

    .line 38
    .line 39
    move-object/from16 v16, v0

    .line 40
    .line 41
    move/from16 v17, v1

    .line 42
    .line 43
    goto/16 :goto_5

    .line 44
    .line 45
    :cond_0
    invoke-virtual {v4}, Ljava/lang/reflect/Constructor;->getDeclaredAnnotations()[Ljava/lang/annotation/Annotation;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    const-string v8, "constructor.declaredAnnotations"

    .line 50
    .line 51
    invoke-static {v6, v8}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    array-length v8, v6

    .line 55
    const/4 v9, 0x0

    .line 56
    :goto_1
    const-string v10, "annotation"

    .line 57
    .line 58
    if-ge v9, v8, :cond_1

    .line 59
    .line 60
    aget-object v11, v6, v9

    .line 61
    .line 62
    invoke-static {v11, v10}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    move-object/from16 v12, p0

    .line 66
    .line 67
    invoke-direct {v12, v5, v11}, Lrg/c;->f(Leh/r$c;Ljava/lang/annotation/Annotation;)V

    .line 68
    .line 69
    .line 70
    add-int/lit8 v9, v9, 0x1

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_1
    move-object/from16 v12, p0

    .line 74
    .line 75
    invoke-virtual {v4}, Ljava/lang/reflect/Constructor;->getParameterAnnotations()[[Ljava/lang/annotation/Annotation;

    .line 76
    .line 77
    .line 78
    move-result-object v6

    .line 79
    const-string v8, "parameterAnnotations"

    .line 80
    .line 81
    invoke-static {v6, v8}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    array-length v8, v6

    .line 85
    const/4 v9, 0x1

    .line 86
    if-nez v8, :cond_2

    .line 87
    .line 88
    move v8, v9

    .line 89
    goto :goto_2

    .line 90
    :cond_2
    const/4 v8, 0x0

    .line 91
    :goto_2
    xor-int/2addr v8, v9

    .line 92
    if-eqz v8, :cond_5

    .line 93
    .line 94
    invoke-virtual {v4}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    array-length v4, v4

    .line 99
    array-length v8, v6

    .line 100
    sub-int/2addr v4, v8

    .line 101
    array-length v8, v6

    .line 102
    const/4 v9, 0x0

    .line 103
    :goto_3
    if-ge v9, v8, :cond_5

    .line 104
    .line 105
    aget-object v11, v6, v9

    .line 106
    .line 107
    const-string v13, "annotations"

    .line 108
    .line 109
    invoke-static {v11, v13}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    array-length v13, v11

    .line 113
    const/4 v14, 0x0

    .line 114
    :goto_4
    if-ge v14, v13, :cond_4

    .line 115
    .line 116
    aget-object v15, v11, v14

    .line 117
    .line 118
    invoke-static {v15}, Lwf/a;->a(Ljava/lang/annotation/Annotation;)Lkotlin/reflect/KClass;

    .line 119
    .line 120
    .line 121
    move-result-object v16

    .line 122
    invoke-static/range {v16 .. v16}, Lwf/a;->b(Lkotlin/reflect/KClass;)Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    move-object/from16 v16, v0

    .line 127
    .line 128
    add-int v0, v9, v4

    .line 129
    .line 130
    move/from16 v17, v1

    .line 131
    .line 132
    invoke-static {v2}, Lsg/d;->a(Ljava/lang/Class;)Llh/b;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    move/from16 v18, v4

    .line 137
    .line 138
    new-instance v4, Lrg/b;

    .line 139
    .line 140
    invoke-static {v15, v10}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    invoke-direct {v4, v15}, Lrg/b;-><init>(Ljava/lang/annotation/Annotation;)V

    .line 144
    .line 145
    .line 146
    invoke-interface {v5, v0, v1, v4}, Leh/r$e;->c(ILlh/b;Lmg/a1;)Leh/r$a;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    if-eqz v0, :cond_3

    .line 151
    .line 152
    sget-object v1, Lrg/c;->a:Lrg/c;

    .line 153
    .line 154
    invoke-direct {v1, v0, v15, v2}, Lrg/c;->h(Leh/r$a;Ljava/lang/annotation/Annotation;Ljava/lang/Class;)V

    .line 155
    .line 156
    .line 157
    :cond_3
    add-int/lit8 v14, v14, 0x1

    .line 158
    .line 159
    move-object/from16 v0, v16

    .line 160
    .line 161
    move/from16 v1, v17

    .line 162
    .line 163
    move/from16 v4, v18

    .line 164
    .line 165
    goto :goto_4

    .line 166
    :cond_4
    move-object/from16 v16, v0

    .line 167
    .line 168
    move/from16 v17, v1

    .line 169
    .line 170
    move/from16 v18, v4

    .line 171
    .line 172
    add-int/lit8 v9, v9, 0x1

    .line 173
    .line 174
    goto :goto_3

    .line 175
    :cond_5
    move-object/from16 v16, v0

    .line 176
    .line 177
    move/from16 v17, v1

    .line 178
    .line 179
    invoke-interface {v5}, Leh/r$c;->a()V

    .line 180
    .line 181
    .line 182
    :goto_5
    add-int/lit8 v3, v3, 0x1

    .line 183
    .line 184
    move-object/from16 v0, v16

    .line 185
    .line 186
    move/from16 v1, v17

    .line 187
    .line 188
    goto/16 :goto_0

    .line 189
    .line 190
    :cond_6
    move-object/from16 v12, p0

    .line 191
    .line 192
    return-void
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
.end method

.method private final d(Ljava/lang/Class;Leh/r$d;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Leh/r$d;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-string v0, "klass.declaredFields"

    .line 6
    .line 7
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    array-length v0, p1

    .line 11
    const/4 v1, 0x0

    .line 12
    move v2, v1

    .line 13
    :goto_0
    if-ge v2, v0, :cond_2

    .line 14
    .line 15
    aget-object v3, p1, v2

    .line 16
    .line 17
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    invoke-static {v4}, Llh/f;->h(Ljava/lang/String;)Llh/f;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    const-string v5, "identifier(field.name)"

    .line 26
    .line 27
    invoke-static {v4, v5}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    sget-object v5, Lrg/m;->a:Lrg/m;

    .line 31
    .line 32
    const-string v6, "field"

    .line 33
    .line 34
    invoke-static {v3, v6}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v5, v3}, Lrg/m;->b(Ljava/lang/reflect/Field;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    const/4 v6, 0x0

    .line 42
    invoke-interface {p2, v4, v5, v6}, Leh/r$d;->b(Llh/f;Ljava/lang/String;Ljava/lang/Object;)Leh/r$c;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    if-nez v4, :cond_0

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_0
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getDeclaredAnnotations()[Ljava/lang/annotation/Annotation;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    const-string v5, "field.declaredAnnotations"

    .line 54
    .line 55
    invoke-static {v3, v5}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    array-length v5, v3

    .line 59
    move v6, v1

    .line 60
    :goto_1
    if-ge v6, v5, :cond_1

    .line 61
    .line 62
    aget-object v7, v3, v6

    .line 63
    .line 64
    const-string v8, "annotation"

    .line 65
    .line 66
    invoke-static {v7, v8}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-direct {p0, v4, v7}, Lrg/c;->f(Leh/r$c;Ljava/lang/annotation/Annotation;)V

    .line 70
    .line 71
    .line 72
    add-int/lit8 v6, v6, 0x1

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_1
    invoke-interface {v4}, Leh/r$c;->a()V

    .line 76
    .line 77
    .line 78
    :goto_2
    add-int/lit8 v2, v2, 0x1

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_2
    return-void
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
.end method

.method private final e(Ljava/lang/Class;Leh/r$d;)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Leh/r$d;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "klass.declaredMethods"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    array-length v1, v0

    .line 11
    const/4 v3, 0x0

    .line 12
    :goto_0
    if-ge v3, v1, :cond_5

    .line 13
    .line 14
    aget-object v4, v0, v3

    .line 15
    .line 16
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v5

    .line 20
    invoke-static {v5}, Llh/f;->h(Ljava/lang/String;)Llh/f;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    const-string v6, "identifier(method.name)"

    .line 25
    .line 26
    invoke-static {v5, v6}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    sget-object v6, Lrg/m;->a:Lrg/m;

    .line 30
    .line 31
    const-string v7, "method"

    .line 32
    .line 33
    invoke-static {v4, v7}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v6, v4}, Lrg/m;->c(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v6

    .line 40
    move-object/from16 v7, p2

    .line 41
    .line 42
    invoke-interface {v7, v5, v6}, Leh/r$d;->a(Llh/f;Ljava/lang/String;)Leh/r$e;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    if-nez v5, :cond_0

    .line 47
    .line 48
    move-object/from16 v12, p0

    .line 49
    .line 50
    move-object/from16 v16, v0

    .line 51
    .line 52
    goto :goto_4

    .line 53
    :cond_0
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getDeclaredAnnotations()[Ljava/lang/annotation/Annotation;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    const-string v8, "method.declaredAnnotations"

    .line 58
    .line 59
    invoke-static {v6, v8}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    array-length v8, v6

    .line 63
    const/4 v9, 0x0

    .line 64
    :goto_1
    const-string v10, "annotation"

    .line 65
    .line 66
    if-ge v9, v8, :cond_1

    .line 67
    .line 68
    aget-object v11, v6, v9

    .line 69
    .line 70
    invoke-static {v11, v10}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    move-object/from16 v12, p0

    .line 74
    .line 75
    invoke-direct {v12, v5, v11}, Lrg/c;->f(Leh/r$c;Ljava/lang/annotation/Annotation;)V

    .line 76
    .line 77
    .line 78
    add-int/lit8 v9, v9, 0x1

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_1
    move-object/from16 v12, p0

    .line 82
    .line 83
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterAnnotations()[[Ljava/lang/annotation/Annotation;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    const-string v6, "method.parameterAnnotations"

    .line 88
    .line 89
    invoke-static {v4, v6}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    check-cast v4, [[Ljava/lang/annotation/Annotation;

    .line 93
    .line 94
    array-length v6, v4

    .line 95
    const/4 v8, 0x0

    .line 96
    :goto_2
    if-ge v8, v6, :cond_4

    .line 97
    .line 98
    aget-object v9, v4, v8

    .line 99
    .line 100
    const-string v11, "annotations"

    .line 101
    .line 102
    invoke-static {v9, v11}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    array-length v11, v9

    .line 106
    const/4 v13, 0x0

    .line 107
    :goto_3
    if-ge v13, v11, :cond_3

    .line 108
    .line 109
    aget-object v14, v9, v13

    .line 110
    .line 111
    invoke-static {v14}, Lwf/a;->a(Ljava/lang/annotation/Annotation;)Lkotlin/reflect/KClass;

    .line 112
    .line 113
    .line 114
    move-result-object v15

    .line 115
    invoke-static {v15}, Lwf/a;->b(Lkotlin/reflect/KClass;)Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    move-result-object v15

    .line 119
    invoke-static {v15}, Lsg/d;->a(Ljava/lang/Class;)Llh/b;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    move-object/from16 v16, v0

    .line 124
    .line 125
    new-instance v0, Lrg/b;

    .line 126
    .line 127
    invoke-static {v14, v10}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    invoke-direct {v0, v14}, Lrg/b;-><init>(Ljava/lang/annotation/Annotation;)V

    .line 131
    .line 132
    .line 133
    invoke-interface {v5, v8, v2, v0}, Leh/r$e;->c(ILlh/b;Lmg/a1;)Leh/r$a;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    if-eqz v0, :cond_2

    .line 138
    .line 139
    sget-object v2, Lrg/c;->a:Lrg/c;

    .line 140
    .line 141
    invoke-direct {v2, v0, v14, v15}, Lrg/c;->h(Leh/r$a;Ljava/lang/annotation/Annotation;Ljava/lang/Class;)V

    .line 142
    .line 143
    .line 144
    :cond_2
    add-int/lit8 v13, v13, 0x1

    .line 145
    .line 146
    move-object/from16 v0, v16

    .line 147
    .line 148
    goto :goto_3

    .line 149
    :cond_3
    move-object/from16 v16, v0

    .line 150
    .line 151
    add-int/lit8 v8, v8, 0x1

    .line 152
    .line 153
    goto :goto_2

    .line 154
    :cond_4
    move-object/from16 v16, v0

    .line 155
    .line 156
    invoke-interface {v5}, Leh/r$c;->a()V

    .line 157
    .line 158
    .line 159
    :goto_4
    add-int/lit8 v3, v3, 0x1

    .line 160
    .line 161
    move-object/from16 v0, v16

    .line 162
    .line 163
    goto/16 :goto_0

    .line 164
    .line 165
    :cond_5
    move-object/from16 v12, p0

    .line 166
    .line 167
    return-void
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

.method private final f(Leh/r$c;Ljava/lang/annotation/Annotation;)V
    .locals 3

    .line 1
    invoke-static {p2}, Lwf/a;->a(Ljava/lang/annotation/Annotation;)Lkotlin/reflect/KClass;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lwf/a;->b(Lkotlin/reflect/KClass;)Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lsg/d;->a(Ljava/lang/Class;)Llh/b;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    new-instance v2, Lrg/b;

    .line 14
    .line 15
    invoke-direct {v2, p2}, Lrg/b;-><init>(Ljava/lang/annotation/Annotation;)V

    .line 16
    .line 17
    .line 18
    invoke-interface {p1, v1, v2}, Leh/r$c;->b(Llh/b;Lmg/a1;)Leh/r$a;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    sget-object v1, Lrg/c;->a:Lrg/c;

    .line 25
    .line 26
    invoke-direct {v1, p1, p2, v0}, Lrg/c;->h(Leh/r$a;Ljava/lang/annotation/Annotation;Ljava/lang/Class;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    return-void
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

.method private final g(Leh/r$a;Llh/f;Ljava/lang/Object;)V
    .locals 9

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Ljava/lang/Class;

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const-string v3, "null cannot be cast to non-null type java.lang.Class<*>"

    .line 12
    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    invoke-static {p3, v3}, Lkotlin/jvm/internal/q;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    check-cast p3, Ljava/lang/Class;

    .line 19
    .line 20
    invoke-direct {p0, p3}, Lrg/c;->a(Ljava/lang/Class;)Lrh/f;

    .line 21
    .line 22
    .line 23
    move-result-object p3

    .line 24
    invoke-interface {p1, p2, p3}, Leh/r$a;->e(Llh/f;Lrh/f;)V

    .line 25
    .line 26
    .line 27
    goto/16 :goto_6

    .line 28
    .line 29
    :cond_0
    invoke-static {}, Lrg/i;->a()Ljava/util/Set;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-interface {v2, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-eqz v2, :cond_1

    .line 38
    .line 39
    invoke-interface {p1, p2, p3}, Leh/r$a;->d(Llh/f;Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto/16 :goto_6

    .line 43
    .line 44
    :cond_1
    invoke-static {v0}, Lsg/d;->h(Ljava/lang/Class;)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    const-string v4, "null cannot be cast to non-null type kotlin.Enum<*>"

    .line 49
    .line 50
    if-eqz v2, :cond_3

    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/Class;->isEnum()Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_2

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Class;->getEnclosingClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    :goto_0
    const-string v1, "if (clazz.isEnum) clazz else clazz.enclosingClass"

    .line 64
    .line 65
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-static {v0}, Lsg/d;->a(Ljava/lang/Class;)Llh/b;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-static {p3, v4}, Lkotlin/jvm/internal/q;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    check-cast p3, Ljava/lang/Enum;

    .line 76
    .line 77
    invoke-virtual {p3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p3

    .line 81
    invoke-static {p3}, Llh/f;->h(Ljava/lang/String;)Llh/f;

    .line 82
    .line 83
    .line 84
    move-result-object p3

    .line 85
    const-string v1, "identifier((value as Enum<*>).name)"

    .line 86
    .line 87
    invoke-static {p3, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    invoke-interface {p1, p2, v0, p3}, Leh/r$a;->f(Llh/f;Llh/b;Llh/f;)V

    .line 91
    .line 92
    .line 93
    goto/16 :goto_6

    .line 94
    .line 95
    :cond_3
    const-class v2, Ljava/lang/annotation/Annotation;

    .line 96
    .line 97
    invoke-virtual {v2, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 98
    .line 99
    .line 100
    move-result v5

    .line 101
    const-string v6, "null cannot be cast to non-null type kotlin.Annotation"

    .line 102
    .line 103
    if-eqz v5, :cond_5

    .line 104
    .line 105
    invoke-virtual {v0}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    const-string v1, "clazz.interfaces"

    .line 110
    .line 111
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    invoke-static {v0}, Lkotlin/collections/b;->h0([Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    check-cast v0, Ljava/lang/Class;

    .line 119
    .line 120
    const-string v1, "annotationClass"

    .line 121
    .line 122
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    invoke-static {v0}, Lsg/d;->a(Ljava/lang/Class;)Llh/b;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    invoke-interface {p1, p2, v1}, Leh/r$a;->b(Llh/f;Llh/b;)Leh/r$a;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    if-nez p1, :cond_4

    .line 134
    .line 135
    return-void

    .line 136
    :cond_4
    invoke-static {p3, v6}, Lkotlin/jvm/internal/q;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    check-cast p3, Ljava/lang/annotation/Annotation;

    .line 140
    .line 141
    invoke-direct {p0, p1, p3, v0}, Lrg/c;->h(Leh/r$a;Ljava/lang/annotation/Annotation;Ljava/lang/Class;)V

    .line 142
    .line 143
    .line 144
    goto/16 :goto_6

    .line 145
    .line 146
    :cond_5
    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    .line 147
    .line 148
    .line 149
    move-result v5

    .line 150
    if-eqz v5, :cond_c

    .line 151
    .line 152
    invoke-interface {p1, p2}, Leh/r$a;->c(Llh/f;)Leh/r$b;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    if-nez p1, :cond_6

    .line 157
    .line 158
    return-void

    .line 159
    :cond_6
    invoke-virtual {v0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    move-result-object p2

    .line 163
    invoke-virtual {p2}, Ljava/lang/Class;->isEnum()Z

    .line 164
    .line 165
    .line 166
    move-result v0

    .line 167
    const-string v5, "componentType"

    .line 168
    .line 169
    const/4 v7, 0x0

    .line 170
    const-string v8, "null cannot be cast to non-null type kotlin.Array<*>"

    .line 171
    .line 172
    if-eqz v0, :cond_7

    .line 173
    .line 174
    invoke-static {p2, v5}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    invoke-static {p2}, Lsg/d;->a(Ljava/lang/Class;)Llh/b;

    .line 178
    .line 179
    .line 180
    move-result-object p2

    .line 181
    invoke-static {p3, v8}, Lkotlin/jvm/internal/q;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    check-cast p3, [Ljava/lang/Object;

    .line 185
    .line 186
    array-length v0, p3

    .line 187
    :goto_1
    if-ge v7, v0, :cond_b

    .line 188
    .line 189
    aget-object v1, p3, v7

    .line 190
    .line 191
    invoke-static {v1, v4}, Lkotlin/jvm/internal/q;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    check-cast v1, Ljava/lang/Enum;

    .line 195
    .line 196
    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    invoke-static {v1}, Llh/f;->h(Ljava/lang/String;)Llh/f;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    const-string v2, "identifier((element as Enum<*>).name)"

    .line 205
    .line 206
    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    invoke-interface {p1, p2, v1}, Leh/r$b;->b(Llh/b;Llh/f;)V

    .line 210
    .line 211
    .line 212
    add-int/lit8 v7, v7, 0x1

    .line 213
    .line 214
    goto :goto_1

    .line 215
    :cond_7
    invoke-static {p2, v1}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    move-result v0

    .line 219
    if-eqz v0, :cond_8

    .line 220
    .line 221
    invoke-static {p3, v8}, Lkotlin/jvm/internal/q;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    check-cast p3, [Ljava/lang/Object;

    .line 225
    .line 226
    array-length p2, p3

    .line 227
    :goto_2
    if-ge v7, p2, :cond_b

    .line 228
    .line 229
    aget-object v0, p3, v7

    .line 230
    .line 231
    invoke-static {v0, v3}, Lkotlin/jvm/internal/q;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    check-cast v0, Ljava/lang/Class;

    .line 235
    .line 236
    invoke-direct {p0, v0}, Lrg/c;->a(Ljava/lang/Class;)Lrh/f;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    invoke-interface {p1, v0}, Leh/r$b;->e(Lrh/f;)V

    .line 241
    .line 242
    .line 243
    add-int/lit8 v7, v7, 0x1

    .line 244
    .line 245
    goto :goto_2

    .line 246
    :cond_8
    invoke-virtual {v2, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 247
    .line 248
    .line 249
    move-result v0

    .line 250
    if-eqz v0, :cond_a

    .line 251
    .line 252
    invoke-static {p3, v8}, Lkotlin/jvm/internal/q;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 253
    .line 254
    .line 255
    check-cast p3, [Ljava/lang/Object;

    .line 256
    .line 257
    array-length v0, p3

    .line 258
    :goto_3
    if-ge v7, v0, :cond_b

    .line 259
    .line 260
    aget-object v1, p3, v7

    .line 261
    .line 262
    invoke-static {p2, v5}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    invoke-static {p2}, Lsg/d;->a(Ljava/lang/Class;)Llh/b;

    .line 266
    .line 267
    .line 268
    move-result-object v2

    .line 269
    invoke-interface {p1, v2}, Leh/r$b;->d(Llh/b;)Leh/r$a;

    .line 270
    .line 271
    .line 272
    move-result-object v2

    .line 273
    if-nez v2, :cond_9

    .line 274
    .line 275
    goto :goto_4

    .line 276
    :cond_9
    invoke-static {v1, v6}, Lkotlin/jvm/internal/q;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 277
    .line 278
    .line 279
    check-cast v1, Ljava/lang/annotation/Annotation;

    .line 280
    .line 281
    invoke-direct {p0, v2, v1, p2}, Lrg/c;->h(Leh/r$a;Ljava/lang/annotation/Annotation;Ljava/lang/Class;)V

    .line 282
    .line 283
    .line 284
    :goto_4
    add-int/lit8 v7, v7, 0x1

    .line 285
    .line 286
    goto :goto_3

    .line 287
    :cond_a
    invoke-static {p3, v8}, Lkotlin/jvm/internal/q;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    check-cast p3, [Ljava/lang/Object;

    .line 291
    .line 292
    array-length p2, p3

    .line 293
    :goto_5
    if-ge v7, p2, :cond_b

    .line 294
    .line 295
    aget-object v0, p3, v7

    .line 296
    .line 297
    invoke-interface {p1, v0}, Leh/r$b;->c(Ljava/lang/Object;)V

    .line 298
    .line 299
    .line 300
    add-int/lit8 v7, v7, 0x1

    .line 301
    .line 302
    goto :goto_5

    .line 303
    :cond_b
    invoke-interface {p1}, Leh/r$b;->a()V

    .line 304
    .line 305
    .line 306
    :goto_6
    return-void

    .line 307
    :cond_c
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 308
    .line 309
    new-instance p2, Ljava/lang/StringBuilder;

    .line 310
    .line 311
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 312
    .line 313
    .line 314
    const-string v1, "Unsupported annotation argument value ("

    .line 315
    .line 316
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 317
    .line 318
    .line 319
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 320
    .line 321
    .line 322
    const-string v0, "): "

    .line 323
    .line 324
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 325
    .line 326
    .line 327
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 328
    .line 329
    .line 330
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object p2

    .line 334
    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 335
    .line 336
    .line 337
    throw p1
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
.end method

.method private final h(Leh/r$a;Ljava/lang/annotation/Annotation;Ljava/lang/Class;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Leh/r$a;",
            "Ljava/lang/annotation/Annotation;",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p3}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    const-string v0, "annotationType.declaredMethods"

    .line 6
    .line 7
    invoke-static {p3, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    array-length v0, p3

    .line 11
    const/4 v1, 0x0

    .line 12
    move v2, v1

    .line 13
    :goto_0
    if-ge v2, v0, :cond_0

    .line 14
    .line 15
    aget-object v3, p3, v2

    .line 16
    .line 17
    :try_start_0
    new-array v4, v1, [Ljava/lang/Object;

    .line 18
    .line 19
    invoke-virtual {v3, p2, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    invoke-static {v4}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    .line 25
    .line 26
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-static {v3}, Llh/f;->h(Ljava/lang/String;)Llh/f;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    const-string v5, "identifier(method.name)"

    .line 35
    .line 36
    invoke-static {v3, v5}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-direct {p0, p1, v3, v4}, Lrg/c;->g(Leh/r$a;Llh/f;Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    :catch_0
    add-int/lit8 v2, v2, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    invoke-interface {p1}, Leh/r$a;->a()V

    .line 46
    .line 47
    .line 48
    return-void
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
.end method


# virtual methods
.method public final b(Ljava/lang/Class;Leh/r$c;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Leh/r$c;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "klass"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "visitor"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredAnnotations()[Ljava/lang/annotation/Annotation;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const-string v0, "klass.declaredAnnotations"

    .line 16
    .line 17
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    array-length v0, p1

    .line 21
    const/4 v1, 0x0

    .line 22
    :goto_0
    if-ge v1, v0, :cond_0

    .line 23
    .line 24
    aget-object v2, p1, v1

    .line 25
    .line 26
    const-string v3, "annotation"

    .line 27
    .line 28
    invoke-static {v2, v3}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-direct {p0, p2, v2}, Lrg/c;->f(Leh/r$c;Ljava/lang/annotation/Annotation;)V

    .line 32
    .line 33
    .line 34
    add-int/lit8 v1, v1, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    invoke-interface {p2}, Leh/r$c;->a()V

    .line 38
    .line 39
    .line 40
    return-void
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

.method public final i(Ljava/lang/Class;Leh/r$d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Leh/r$d;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "klass"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "memberVisitor"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p1, p2}, Lrg/c;->e(Ljava/lang/Class;Leh/r$d;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0, p1, p2}, Lrg/c;->c(Ljava/lang/Class;Leh/r$d;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {p0, p1, p2}, Lrg/c;->d(Ljava/lang/Class;Leh/r$d;)V

    .line 18
    .line 19
    .line 20
    return-void
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
