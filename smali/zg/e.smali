.class public final Lzg/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lng/c;
.implements Lxg/g;


# static fields
.field static final synthetic i:[Lkotlin/reflect/KProperty;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lkotlin/reflect/KProperty<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Lyg/g;

.field private final b:Lch/a;

.field private final c:Lci/j;

.field private final d:Lci/i;

.field private final e:Lbh/a;

.field private final f:Lci/i;

.field private final g:Z

.field private final h:Z


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    const/4 v0, 0x3

    .line 2
    new-array v0, v0, [Lkotlin/reflect/KProperty;

    .line 3
    .line 4
    new-instance v1, Lkotlin/jvm/internal/c0;

    .line 5
    .line 6
    const-class v2, Lzg/e;

    .line 7
    .line 8
    invoke-static {v2}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 9
    .line 10
    .line 11
    move-result-object v3

    .line 12
    const-string v4, "fqName"

    .line 13
    .line 14
    const-string v5, "getFqName()Lorg/jetbrains/kotlin/name/FqName;"

    .line 15
    .line 16
    invoke-direct {v1, v3, v4, v5}, Lkotlin/jvm/internal/c0;-><init>(Lkotlin/reflect/KDeclarationContainer;Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-static {v1}, Lkotlin/jvm/internal/f0;->g(Lkotlin/jvm/internal/b0;)Ldg/h;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const/4 v3, 0x0

    .line 24
    aput-object v1, v0, v3

    .line 25
    .line 26
    new-instance v1, Lkotlin/jvm/internal/c0;

    .line 27
    .line 28
    invoke-static {v2}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    const-string v4, "type"

    .line 33
    .line 34
    const-string v5, "getType()Lorg/jetbrains/kotlin/types/SimpleType;"

    .line 35
    .line 36
    invoke-direct {v1, v3, v4, v5}, Lkotlin/jvm/internal/c0;-><init>(Lkotlin/reflect/KDeclarationContainer;Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-static {v1}, Lkotlin/jvm/internal/f0;->g(Lkotlin/jvm/internal/b0;)Ldg/h;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    const/4 v3, 0x1

    .line 44
    aput-object v1, v0, v3

    .line 45
    .line 46
    new-instance v1, Lkotlin/jvm/internal/c0;

    .line 47
    .line 48
    invoke-static {v2}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    const-string v3, "allValueArguments"

    .line 53
    .line 54
    const-string v4, "getAllValueArguments()Ljava/util/Map;"

    .line 55
    .line 56
    invoke-direct {v1, v2, v3, v4}, Lkotlin/jvm/internal/c0;-><init>(Lkotlin/reflect/KDeclarationContainer;Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-static {v1}, Lkotlin/jvm/internal/f0;->g(Lkotlin/jvm/internal/b0;)Ldg/h;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    const/4 v2, 0x2

    .line 64
    aput-object v1, v0, v2

    .line 65
    .line 66
    sput-object v0, Lzg/e;->i:[Lkotlin/reflect/KProperty;

    .line 67
    .line 68
    return-void
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

.method public constructor <init>(Lyg/g;Lch/a;Z)V
    .locals 2

    const-string v0, "c"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "javaAnnotation"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lzg/e;->a:Lyg/g;

    .line 3
    iput-object p2, p0, Lzg/e;->b:Lch/a;

    .line 4
    invoke-virtual {p1}, Lyg/g;->e()Lci/n;

    move-result-object v0

    new-instance v1, Lzg/e$b;

    invoke-direct {v1, p0}, Lzg/e$b;-><init>(Lzg/e;)V

    invoke-interface {v0, v1}, Lci/n;->f(Lkotlin/jvm/functions/Function0;)Lci/j;

    move-result-object v0

    iput-object v0, p0, Lzg/e;->c:Lci/j;

    .line 5
    invoke-virtual {p1}, Lyg/g;->e()Lci/n;

    move-result-object v0

    new-instance v1, Lzg/e$c;

    invoke-direct {v1, p0}, Lzg/e$c;-><init>(Lzg/e;)V

    invoke-interface {v0, v1}, Lci/n;->d(Lkotlin/jvm/functions/Function0;)Lci/i;

    move-result-object v0

    iput-object v0, p0, Lzg/e;->d:Lci/i;

    .line 6
    invoke-virtual {p1}, Lyg/g;->a()Lyg/b;

    move-result-object v0

    invoke-virtual {v0}, Lyg/b;->t()Lbh/b;

    move-result-object v0

    invoke-interface {v0, p2}, Lbh/b;->a(Lch/l;)Lbh/a;

    move-result-object v0

    iput-object v0, p0, Lzg/e;->e:Lbh/a;

    .line 7
    invoke-virtual {p1}, Lyg/g;->e()Lci/n;

    move-result-object p1

    new-instance v0, Lzg/e$a;

    invoke-direct {v0, p0}, Lzg/e$a;-><init>(Lzg/e;)V

    invoke-interface {p1, v0}, Lci/n;->d(Lkotlin/jvm/functions/Function0;)Lci/i;

    move-result-object p1

    iput-object p1, p0, Lzg/e;->f:Lci/i;

    .line 8
    invoke-interface {p2}, Lch/a;->g()Z

    move-result p1

    iput-boolean p1, p0, Lzg/e;->g:Z

    .line 9
    invoke-interface {p2}, Lch/a;->v()Z

    move-result p1

    if-nez p1, :cond_1

    if-eqz p3, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    iput-boolean p1, p0, Lzg/e;->h:Z

    return-void
.end method

.method public synthetic constructor <init>(Lyg/g;Lch/a;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    .line 10
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lzg/e;-><init>(Lyg/g;Lch/a;Z)V

    return-void
.end method

.method public static final synthetic b(Lzg/e;Llh/c;)Lmg/e;
    .locals 0

    invoke-direct {p0, p1}, Lzg/e;->h(Llh/c;)Lmg/e;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(Lzg/e;)Lyg/g;
    .locals 0

    iget-object p0, p0, Lzg/e;->a:Lyg/g;

    return-object p0
.end method

.method public static final synthetic e(Lzg/e;)Lch/a;
    .locals 0

    iget-object p0, p0, Lzg/e;->b:Lch/a;

    return-object p0
.end method

.method public static final synthetic f(Lzg/e;Lch/b;)Lrh/g;
    .locals 0

    invoke-direct {p0, p1}, Lzg/e;->m(Lch/b;)Lrh/g;

    move-result-object p0

    return-object p0
.end method

.method private final h(Llh/c;)Lmg/e;
    .locals 2

    .line 1
    iget-object v0, p0, Lzg/e;->a:Lyg/g;

    .line 2
    .line 3
    invoke-virtual {v0}, Lyg/g;->d()Lmg/h0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {p1}, Llh/b;->m(Llh/c;)Llh/b;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const-string v1, "topLevel(fqName)"

    .line 12
    .line 13
    invoke-static {p1, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, Lzg/e;->a:Lyg/g;

    .line 17
    .line 18
    invoke-virtual {v1}, Lyg/g;->a()Lyg/b;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v1}, Lyg/b;->b()Leh/h;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v1}, Leh/h;->d()Lzh/k;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v1}, Lzh/k;->q()Lmg/k0;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-static {v0, p1, v1}, Lmg/x;->c(Lmg/h0;Llh/b;Lmg/k0;)Lmg/e;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    return-object p1
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
.end method

.method private final m(Lch/b;)Lrh/g;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lch/b;",
            ")",
            "Lrh/g<",
            "*>;"
        }
    .end annotation

    .line 1
    instance-of v0, p1, Lch/o;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lrh/h;->a:Lrh/h;

    .line 6
    .line 7
    check-cast p1, Lch/o;

    .line 8
    .line 9
    invoke-interface {p1}, Lch/o;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {v0, p1}, Lrh/h;->c(Ljava/lang/Object;)Lrh/g;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    instance-of v0, p1, Lch/m;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    check-cast p1, Lch/m;

    .line 23
    .line 24
    invoke-interface {p1}, Lch/m;->b()Llh/b;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-interface {p1}, Lch/m;->d()Llh/f;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-direct {p0, v0, p1}, Lzg/e;->p(Llh/b;Llh/f;)Lrh/g;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    instance-of v0, p1, Lch/e;

    .line 38
    .line 39
    if-eqz v0, :cond_3

    .line 40
    .line 41
    check-cast p1, Lch/e;

    .line 42
    .line 43
    invoke-interface {p1}, Lch/b;->getName()Llh/f;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    if-nez v0, :cond_2

    .line 48
    .line 49
    sget-object v0, Lvg/b0;->c:Llh/f;

    .line 50
    .line 51
    :cond_2
    const-string v1, "argument.name ?: DEFAULT_ANNOTATION_MEMBER_NAME"

    .line 52
    .line 53
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-interface {p1}, Lch/e;->e()Ljava/util/List;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-direct {p0, v0, p1}, Lzg/e;->o(Llh/f;Ljava/util/List;)Lrh/g;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    goto :goto_0

    .line 65
    :cond_3
    instance-of v0, p1, Lch/c;

    .line 66
    .line 67
    if-eqz v0, :cond_4

    .line 68
    .line 69
    check-cast p1, Lch/c;

    .line 70
    .line 71
    invoke-interface {p1}, Lch/c;->a()Lch/a;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-direct {p0, p1}, Lzg/e;->n(Lch/a;)Lrh/g;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    goto :goto_0

    .line 80
    :cond_4
    instance-of v0, p1, Lch/h;

    .line 81
    .line 82
    if-eqz v0, :cond_5

    .line 83
    .line 84
    check-cast p1, Lch/h;

    .line 85
    .line 86
    invoke-interface {p1}, Lch/h;->c()Lch/x;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-direct {p0, p1}, Lzg/e;->q(Lch/x;)Lrh/g;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    goto :goto_0

    .line 95
    :cond_5
    const/4 p1, 0x0

    .line 96
    :goto_0
    return-object p1
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
.end method

.method private final n(Lch/a;)Lrh/g;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lch/a;",
            ")",
            "Lrh/g<",
            "*>;"
        }
    .end annotation

    new-instance v0, Lrh/a;

    new-instance v7, Lzg/e;

    iget-object v2, p0, Lzg/e;->a:Lyg/g;

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v1, v7

    move-object v3, p1

    invoke-direct/range {v1 .. v6}, Lzg/e;-><init>(Lyg/g;Lch/a;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v0, v7}, Lrh/a;-><init>(Lng/c;)V

    return-object v0
.end method

.method private final o(Llh/f;Ljava/util/List;)Lrh/g;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llh/f;",
            "Ljava/util/List<",
            "+",
            "Lch/b;",
            ">;)",
            "Lrh/g<",
            "*>;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lzg/e;->k()Ldi/o0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "type"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Ldi/i0;->a(Ldi/g0;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    return-object p1

    .line 18
    :cond_0
    invoke-static {p0}, Lth/c;->i(Lng/c;)Lmg/e;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-static {v0}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    invoke-static {p1, v0}, Lwg/a;->b(Llh/f;Lmg/e;)Lmg/j1;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    invoke-interface {p1}, Lmg/i1;->getType()Ldi/g0;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    if-nez p1, :cond_2

    .line 36
    .line 37
    :cond_1
    iget-object p1, p0, Lzg/e;->a:Lyg/g;

    .line 38
    .line 39
    invoke-virtual {p1}, Lyg/g;->a()Lyg/b;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p1}, Lyg/b;->m()Lmg/h0;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-interface {p1}, Lmg/h0;->o()Ljg/h;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    sget-object v0, Ldi/w1;->o:Ldi/w1;

    .line 52
    .line 53
    sget-object v1, Lfi/j;->O0:Lfi/j;

    .line 54
    .line 55
    const/4 v2, 0x0

    .line 56
    new-array v2, v2, [Ljava/lang/String;

    .line 57
    .line 58
    invoke-static {v1, v2}, Lfi/k;->d(Lfi/j;[Ljava/lang/String;)Lfi/h;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-virtual {p1, v0, v1}, Ljg/h;->l(Ldi/w1;Ldi/g0;)Ldi/o0;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    :cond_2
    const-string v0, "DescriptorResolverUtils.\u2026GUMENT)\n                )"

    .line 67
    .line 68
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    new-instance v0, Ljava/util/ArrayList;

    .line 72
    .line 73
    const/16 v1, 0xa

    .line 74
    .line 75
    invoke-static {p2, v1}, Lkotlin/collections/h;->t(Ljava/lang/Iterable;I)I

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 80
    .line 81
    .line 82
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 83
    .line 84
    .line 85
    move-result-object p2

    .line 86
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    if-eqz v1, :cond_4

    .line 91
    .line 92
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    check-cast v1, Lch/b;

    .line 97
    .line 98
    invoke-direct {p0, v1}, Lzg/e;->m(Lch/b;)Lrh/g;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    if-nez v1, :cond_3

    .line 103
    .line 104
    new-instance v1, Lrh/s;

    .line 105
    .line 106
    invoke-direct {v1}, Lrh/s;-><init>()V

    .line 107
    .line 108
    .line 109
    :cond_3
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_4
    sget-object p2, Lrh/h;->a:Lrh/h;

    .line 114
    .line 115
    invoke-virtual {p2, v0, p1}, Lrh/h;->a(Ljava/util/List;Ldi/g0;)Lrh/b;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    return-object p1
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

.method private final p(Llh/b;Llh/f;)Lrh/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llh/b;",
            "Llh/f;",
            ")",
            "Lrh/g<",
            "*>;"
        }
    .end annotation

    if-eqz p1, :cond_1

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lrh/j;

    invoke-direct {v0, p1, p2}, Lrh/j;-><init>(Llh/b;Llh/f;)V

    return-object v0

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private final q(Lch/x;)Lrh/g;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lch/x;",
            ")",
            "Lrh/g<",
            "*>;"
        }
    .end annotation

    sget-object v0, Lrh/q;->b:Lrh/q$a;

    iget-object v1, p0, Lzg/e;->a:Lyg/g;

    invoke-virtual {v1}, Lyg/g;->g()Lah/d;

    move-result-object v1

    sget-object v2, Ldi/r1;->l:Ldi/r1;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x7

    const/4 v7, 0x0

    invoke-static/range {v2 .. v7}, Lah/b;->b(Ldi/r1;ZZLmg/f1;ILjava/lang/Object;)Lah/a;

    move-result-object v2

    invoke-virtual {v1, p1, v2}, Lah/d;->o(Lch/x;Lah/a;)Ldi/g0;

    move-result-object p1

    invoke-virtual {v0, p1}, Lrh/q$a;->a(Ldi/g0;)Lrh/g;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public a()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Llh/f;",
            "Lrh/g<",
            "*>;>;"
        }
    .end annotation

    iget-object v0, p0, Lzg/e;->f:Lci/i;

    sget-object v1, Lzg/e;->i:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x2

    aget-object v1, v1, v2

    invoke-static {v0, p0, v1}, Lci/m;->a(Lci/i;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    return-object v0
.end method

.method public d()Llh/c;
    .locals 3

    iget-object v0, p0, Lzg/e;->c:Lci/j;

    sget-object v1, Lzg/e;->i:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-static {v0, p0, v1}, Lci/m;->b(Lci/j;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llh/c;

    return-object v0
.end method

.method public g()Z
    .locals 1

    iget-boolean v0, p0, Lzg/e;->g:Z

    return v0
.end method

.method public bridge synthetic getType()Ldi/g0;
    .locals 1

    invoke-virtual {p0}, Lzg/e;->k()Ldi/o0;

    move-result-object v0

    return-object v0
.end method

.method public i()Lbh/a;
    .locals 1

    iget-object v0, p0, Lzg/e;->e:Lbh/a;

    return-object v0
.end method

.method public bridge synthetic j()Lmg/a1;
    .locals 1

    invoke-virtual {p0}, Lzg/e;->i()Lbh/a;

    move-result-object v0

    return-object v0
.end method

.method public k()Ldi/o0;
    .locals 3

    iget-object v0, p0, Lzg/e;->d:Lci/i;

    sget-object v1, Lzg/e;->i:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-static {v0, p0, v1}, Lci/m;->a(Lci/i;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldi/o0;

    return-object v0
.end method

.method public final l()Z
    .locals 1

    iget-boolean v0, p0, Lzg/e;->h:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    sget-object v0, Loh/c;->g:Loh/c;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, p0, v1, v2, v1}, Loh/c;->s(Loh/c;Lng/c;Lng/e;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
