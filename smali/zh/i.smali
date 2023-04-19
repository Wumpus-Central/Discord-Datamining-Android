.class public final Lzh/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzh/i$a;,
        Lzh/i$b;
    }
.end annotation


# static fields
.field public static final c:Lzh/i$b;

.field private static final d:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Llh/b;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Lzh/k;

.field private final b:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lzh/i$a;",
            "Lmg/e;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lzh/i$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lzh/i$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lzh/i;->c:Lzh/i$b;

    .line 8
    .line 9
    sget-object v0, Ljg/k$a;->d:Llh/d;

    .line 10
    .line 11
    invoke-virtual {v0}, Llh/d;->l()Llh/c;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, Llh/b;->m(Llh/c;)Llh/b;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v0}, Lkotlin/collections/u;->c(Ljava/lang/Object;)Ljava/util/Set;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, Lzh/i;->d:Ljava/util/Set;

    .line 24
    .line 25
    return-void
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
.end method

.method public constructor <init>(Lzh/k;)V
    .locals 1

    .line 1
    const-string v0, "components"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lzh/i;->a:Lzh/k;

    .line 10
    .line 11
    invoke-virtual {p1}, Lzh/k;->u()Lci/n;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    new-instance v0, Lzh/i$c;

    .line 16
    .line 17
    invoke-direct {v0, p0}, Lzh/i$c;-><init>(Lzh/i;)V

    .line 18
    .line 19
    .line 20
    invoke-interface {p1, v0}, Lci/n;->i(Lkotlin/jvm/functions/Function1;)Lci/h;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iput-object p1, p0, Lzh/i;->b:Lkotlin/jvm/functions/Function1;

    .line 25
    .line 26
    return-void
    .line 27
.end method

.method public static final synthetic a(Lzh/i;Lzh/i$a;)Lmg/e;
    .locals 0

    invoke-direct {p0, p1}, Lzh/i;->c(Lzh/i$a;)Lmg/e;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b()Ljava/util/Set;
    .locals 1

    sget-object v0, Lzh/i;->d:Ljava/util/Set;

    return-object v0
.end method

.method private final c(Lzh/i$a;)Lmg/e;
    .locals 12

    .line 1
    invoke-virtual {p1}, Lzh/i$a;->b()Llh/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lzh/i;->a:Lzh/k;

    .line 6
    .line 7
    invoke-virtual {v1}, Lzh/k;->k()Ljava/lang/Iterable;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    check-cast v2, Log/b;

    .line 26
    .line 27
    invoke-interface {v2, v0}, Log/b;->c(Llh/b;)Lmg/e;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    if-eqz v2, :cond_0

    .line 32
    .line 33
    return-object v2

    .line 34
    :cond_1
    sget-object v1, Lzh/i;->d:Ljava/util/Set;

    .line 35
    .line 36
    invoke-interface {v1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    const/4 v2, 0x0

    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    return-object v2

    .line 44
    :cond_2
    invoke-virtual {p1}, Lzh/i$a;->a()Lzh/g;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    if-nez p1, :cond_3

    .line 49
    .line 50
    iget-object p1, p0, Lzh/i;->a:Lzh/k;

    .line 51
    .line 52
    invoke-virtual {p1}, Lzh/k;->e()Lzh/h;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-interface {p1, v0}, Lzh/h;->a(Llh/b;)Lzh/g;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    if-nez p1, :cond_3

    .line 61
    .line 62
    return-object v2

    .line 63
    :cond_3
    invoke-virtual {p1}, Lzh/g;->a()Lih/c;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-virtual {p1}, Lzh/g;->b()Lgh/c;

    .line 68
    .line 69
    .line 70
    move-result-object v10

    .line 71
    invoke-virtual {p1}, Lzh/g;->c()Lih/a;

    .line 72
    .line 73
    .line 74
    move-result-object v11

    .line 75
    invoke-virtual {p1}, Lzh/g;->d()Lmg/a1;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-virtual {v0}, Llh/b;->g()Llh/b;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    const-string v4, "classId.shortClassName"

    .line 84
    .line 85
    if-eqz v3, :cond_7

    .line 86
    .line 87
    const/4 v5, 0x2

    .line 88
    invoke-static {p0, v3, v2, v5, v2}, Lzh/i;->e(Lzh/i;Llh/b;Lzh/g;ILjava/lang/Object;)Lmg/e;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    instance-of v5, v3, Lbi/d;

    .line 93
    .line 94
    if-eqz v5, :cond_4

    .line 95
    .line 96
    check-cast v3, Lbi/d;

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_4
    move-object v3, v2

    .line 100
    :goto_0
    if-nez v3, :cond_5

    .line 101
    .line 102
    return-object v2

    .line 103
    :cond_5
    invoke-virtual {v0}, Llh/b;->j()Llh/f;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-static {v0, v4}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v3, v0}, Lbi/d;->g1(Llh/f;)Z

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    if-nez v0, :cond_6

    .line 115
    .line 116
    return-object v2

    .line 117
    :cond_6
    invoke-virtual {v3}, Lbi/d;->a1()Lzh/m;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    goto :goto_4

    .line 122
    :cond_7
    iget-object v3, p0, Lzh/i;->a:Lzh/k;

    .line 123
    .line 124
    invoke-virtual {v3}, Lzh/k;->r()Lmg/m0;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    invoke-virtual {v0}, Llh/b;->h()Llh/c;

    .line 129
    .line 130
    .line 131
    move-result-object v5

    .line 132
    const-string v6, "classId.packageFqName"

    .line 133
    .line 134
    invoke-static {v5, v6}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    invoke-static {v3, v5}, Lmg/o0;->c(Lmg/m0;Llh/c;)Ljava/util/List;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 142
    .line 143
    .line 144
    move-result-object v3

    .line 145
    :cond_8
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 146
    .line 147
    .line 148
    move-result v5

    .line 149
    if-eqz v5, :cond_b

    .line 150
    .line 151
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v5

    .line 155
    move-object v6, v5

    .line 156
    check-cast v6, Lmg/l0;

    .line 157
    .line 158
    instance-of v7, v6, Lzh/p;

    .line 159
    .line 160
    if-eqz v7, :cond_a

    .line 161
    .line 162
    check-cast v6, Lzh/p;

    .line 163
    .line 164
    invoke-virtual {v0}, Llh/b;->j()Llh/f;

    .line 165
    .line 166
    .line 167
    move-result-object v7

    .line 168
    invoke-static {v7, v4}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v6, v7}, Lzh/p;->K0(Llh/f;)Z

    .line 172
    .line 173
    .line 174
    move-result v6

    .line 175
    if-eqz v6, :cond_9

    .line 176
    .line 177
    goto :goto_1

    .line 178
    :cond_9
    const/4 v6, 0x0

    .line 179
    goto :goto_2

    .line 180
    :cond_a
    :goto_1
    const/4 v6, 0x1

    .line 181
    :goto_2
    if-eqz v6, :cond_8

    .line 182
    .line 183
    goto :goto_3

    .line 184
    :cond_b
    move-object v5, v2

    .line 185
    :goto_3
    move-object v4, v5

    .line 186
    check-cast v4, Lmg/l0;

    .line 187
    .line 188
    if-nez v4, :cond_c

    .line 189
    .line 190
    return-object v2

    .line 191
    :cond_c
    iget-object v3, p0, Lzh/i;->a:Lzh/k;

    .line 192
    .line 193
    new-instance v6, Lih/g;

    .line 194
    .line 195
    invoke-virtual {v10}, Lgh/c;->i1()Lgh/t;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    const-string v2, "classProto.typeTable"

    .line 200
    .line 201
    invoke-static {v0, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    invoke-direct {v6, v0}, Lih/g;-><init>(Lgh/t;)V

    .line 205
    .line 206
    .line 207
    sget-object v0, Lih/h;->b:Lih/h$a;

    .line 208
    .line 209
    invoke-virtual {v10}, Lgh/c;->k1()Lgh/w;

    .line 210
    .line 211
    .line 212
    move-result-object v2

    .line 213
    const-string v5, "classProto.versionRequirementTable"

    .line 214
    .line 215
    invoke-static {v2, v5}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v0, v2}, Lih/h$a;->a(Lgh/w;)Lih/h;

    .line 219
    .line 220
    .line 221
    move-result-object v7

    .line 222
    const/4 v9, 0x0

    .line 223
    move-object v5, v1

    .line 224
    move-object v8, v11

    .line 225
    invoke-virtual/range {v3 .. v9}, Lzh/k;->a(Lmg/l0;Lih/c;Lih/g;Lih/h;Lih/a;Lbi/f;)Lzh/m;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    :goto_4
    move-object v4, v0

    .line 230
    new-instance v0, Lbi/d;

    .line 231
    .line 232
    move-object v3, v0

    .line 233
    move-object v5, v10

    .line 234
    move-object v6, v1

    .line 235
    move-object v7, v11

    .line 236
    move-object v8, p1

    .line 237
    invoke-direct/range {v3 .. v8}, Lbi/d;-><init>(Lzh/m;Lgh/c;Lih/c;Lih/a;Lmg/a1;)V

    .line 238
    .line 239
    .line 240
    return-object v0
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

.method public static synthetic e(Lzh/i;Llh/b;Lzh/g;ILjava/lang/Object;)Lmg/e;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lzh/i;->d(Llh/b;Lzh/g;)Lmg/e;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final d(Llh/b;Lzh/g;)Lmg/e;
    .locals 2

    .line 1
    const-string v0, "classId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lzh/i;->b:Lkotlin/jvm/functions/Function1;

    .line 7
    .line 8
    new-instance v1, Lzh/i$a;

    .line 9
    .line 10
    invoke-direct {v1, p1, p2}, Lzh/i$a;-><init>(Llh/b;Lzh/g;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Lmg/e;

    .line 18
    .line 19
    return-object p1
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
