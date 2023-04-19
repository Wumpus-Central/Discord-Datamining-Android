.class public final Lhg/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhg/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhg/h$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<M::",
        "Ljava/lang/reflect/Member;",
        ">",
        "Ljava/lang/Object;",
        "Lhg/e<",
        "TM;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u0000*\u000c\u0008\u0000\u0010\u0002 \u0001*\u0004\u0018\u00010\u00012\u0008\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\tB%\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u001f\u0010 J\u001d\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\u0008\u00030\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u001a\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00028\u00008VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\r\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u001a8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\u001b\u00a8\u0006!"
    }
    d2 = {
        "Lhg/h;",
        "Ljava/lang/reflect/Member;",
        "M",
        "Lhg/e;",
        "",
        "args",
        "",
        "call",
        "([Ljava/lang/Object;)Ljava/lang/Object;",
        "a",
        "Lhg/e;",
        "caller",
        "",
        "b",
        "Z",
        "isDefault",
        "Lhg/h$a;",
        "c",
        "Lhg/h$a;",
        "data",
        "()Ljava/lang/reflect/Member;",
        "member",
        "Ljava/lang/reflect/Type;",
        "getReturnType",
        "()Ljava/lang/reflect/Type;",
        "returnType",
        "",
        "()Ljava/util/List;",
        "parameterTypes",
        "Lmg/b;",
        "descriptor",
        "<init>",
        "(Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;Lhg/e;Z)V",
        "kotlin-reflection"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final a:Lhg/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhg/e<",
            "TM;>;"
        }
    .end annotation
.end field

.field private final b:Z

.field private final c:Lhg/h$a;


# direct methods
.method public constructor <init>(Lmg/b;Lhg/e;Z)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmg/b;",
            "Lhg/e<",
            "+TM;>;Z)V"
        }
    .end annotation

    .line 1
    const-string v0, "descriptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "caller"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p2, p0, Lhg/h;->a:Lhg/e;

    .line 15
    .line 16
    iput-boolean p3, p0, Lhg/h;->b:Z

    .line 17
    .line 18
    invoke-interface {p1}, Lmg/a;->getReturnType()Ldi/g0;

    .line 19
    .line 20
    .line 21
    move-result-object p3

    .line 22
    invoke-static {p3}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    invoke-static {p3}, Lhg/i;->h(Ldi/g0;)Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-result-object p3

    .line 29
    const/4 v0, 0x0

    .line 30
    if-eqz p3, :cond_0

    .line 31
    .line 32
    invoke-static {p3, p1}, Lhg/i;->d(Ljava/lang/Class;Lmg/b;)Ljava/lang/reflect/Method;

    .line 33
    .line 34
    .line 35
    move-result-object p3

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    move-object p3, v0

    .line 38
    :goto_0
    invoke-static {p1}, Lph/g;->a(Lmg/a;)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    const/4 v2, 0x0

    .line 43
    if-eqz v1, :cond_1

    .line 44
    .line 45
    new-instance p1, Lhg/h$a;

    .line 46
    .line 47
    sget-object p2, Lkotlin/ranges/IntRange;->o:Lkotlin/ranges/IntRange$a;

    .line 48
    .line 49
    invoke-virtual {p2}, Lkotlin/ranges/IntRange$a;->a()Lkotlin/ranges/IntRange;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    new-array v0, v2, [Ljava/lang/reflect/Method;

    .line 54
    .line 55
    invoke-direct {p1, p2, v0, p3}, Lhg/h$a;-><init>(Lkotlin/ranges/IntRange;[Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V

    .line 56
    .line 57
    .line 58
    goto/16 :goto_b

    .line 59
    .line 60
    :cond_1
    instance-of v1, p2, Lhg/f$h$c;

    .line 61
    .line 62
    const-string v3, "descriptor.containingDeclaration"

    .line 63
    .line 64
    const/4 v4, -0x1

    .line 65
    const/4 v5, 0x1

    .line 66
    if-eqz v1, :cond_2

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_2
    instance-of v1, p1, Lmg/l;

    .line 70
    .line 71
    if-eqz v1, :cond_3

    .line 72
    .line 73
    instance-of p2, p2, Lhg/d;

    .line 74
    .line 75
    if-eqz p2, :cond_5

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_3
    invoke-interface {p1}, Lmg/a;->f0()Lmg/x0;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    if-eqz v1, :cond_5

    .line 83
    .line 84
    instance-of p2, p2, Lhg/d;

    .line 85
    .line 86
    if-nez p2, :cond_5

    .line 87
    .line 88
    invoke-interface {p1}, Lmg/n;->b()Lmg/m;

    .line 89
    .line 90
    .line 91
    move-result-object p2

    .line 92
    invoke-static {p2, v3}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    invoke-static {p2}, Lph/g;->b(Lmg/m;)Z

    .line 96
    .line 97
    .line 98
    move-result p2

    .line 99
    if-eqz p2, :cond_4

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_4
    move v4, v5

    .line 103
    goto :goto_2

    .line 104
    :cond_5
    :goto_1
    move v4, v2

    .line 105
    :goto_2
    new-instance p2, Ljava/util/ArrayList;

    .line 106
    .line 107
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 108
    .line 109
    .line 110
    invoke-interface {p1}, Lmg/a;->k0()Lmg/x0;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    if-eqz v1, :cond_6

    .line 115
    .line 116
    invoke-interface {v1}, Lmg/i1;->getType()Ldi/g0;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    goto :goto_3

    .line 121
    :cond_6
    move-object v1, v0

    .line 122
    :goto_3
    if-eqz v1, :cond_7

    .line 123
    .line 124
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    goto :goto_4

    .line 128
    :cond_7
    instance-of v1, p1, Lmg/l;

    .line 129
    .line 130
    if-eqz v1, :cond_8

    .line 131
    .line 132
    move-object v1, p1

    .line 133
    check-cast v1, Lmg/l;

    .line 134
    .line 135
    invoke-interface {v1}, Lmg/l;->A()Lmg/e;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    const-string v3, "descriptor.constructedClass"

    .line 140
    .line 141
    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    invoke-interface {v1}, Lmg/i;->L()Z

    .line 145
    .line 146
    .line 147
    move-result v3

    .line 148
    if-eqz v3, :cond_9

    .line 149
    .line 150
    invoke-interface {v1}, Lmg/e;->b()Lmg/m;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    const-string v3, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"

    .line 155
    .line 156
    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    check-cast v1, Lmg/e;

    .line 160
    .line 161
    invoke-interface {v1}, Lmg/e;->s()Ldi/o0;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    goto :goto_4

    .line 169
    :cond_8
    invoke-interface {p1}, Lmg/n;->b()Lmg/m;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    instance-of v3, v1, Lmg/e;

    .line 177
    .line 178
    if-eqz v3, :cond_9

    .line 179
    .line 180
    invoke-static {v1}, Lph/g;->b(Lmg/m;)Z

    .line 181
    .line 182
    .line 183
    move-result v3

    .line 184
    if-eqz v3, :cond_9

    .line 185
    .line 186
    check-cast v1, Lmg/e;

    .line 187
    .line 188
    invoke-interface {v1}, Lmg/e;->s()Ldi/o0;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    :cond_9
    :goto_4
    invoke-interface {p1}, Lmg/a;->i()Ljava/util/List;

    .line 196
    .line 197
    .line 198
    move-result-object v1

    .line 199
    const-string v3, "descriptor.valueParameters"

    .line 200
    .line 201
    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 209
    .line 210
    .line 211
    move-result v3

    .line 212
    if-eqz v3, :cond_a

    .line 213
    .line 214
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v3

    .line 218
    check-cast v3, Lmg/j1;

    .line 219
    .line 220
    invoke-interface {v3}, Lmg/i1;->getType()Ldi/g0;

    .line 221
    .line 222
    .line 223
    move-result-object v3

    .line 224
    invoke-interface {p2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    goto :goto_5

    .line 228
    :cond_a
    iget-boolean v1, p0, Lhg/h;->b:Z

    .line 229
    .line 230
    if-eqz v1, :cond_b

    .line 231
    .line 232
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 233
    .line 234
    .line 235
    move-result v1

    .line 236
    add-int/lit8 v1, v1, 0x20

    .line 237
    .line 238
    sub-int/2addr v1, v5

    .line 239
    div-int/lit8 v1, v1, 0x20

    .line 240
    .line 241
    add-int/2addr v1, v5

    .line 242
    goto :goto_6

    .line 243
    :cond_b
    move v1, v2

    .line 244
    :goto_6
    instance-of v3, p1, Lmg/y;

    .line 245
    .line 246
    if-eqz v3, :cond_c

    .line 247
    .line 248
    move-object v3, p1

    .line 249
    check-cast v3, Lmg/y;

    .line 250
    .line 251
    invoke-interface {v3}, Lmg/y;->isSuspend()Z

    .line 252
    .line 253
    .line 254
    move-result v3

    .line 255
    if-eqz v3, :cond_c

    .line 256
    .line 257
    move v3, v5

    .line 258
    goto :goto_7

    .line 259
    :cond_c
    move v3, v2

    .line 260
    :goto_7
    add-int/2addr v1, v3

    .line 261
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 262
    .line 263
    .line 264
    move-result v3

    .line 265
    add-int/2addr v3, v4

    .line 266
    add-int/2addr v3, v1

    .line 267
    invoke-static {p0}, Lhg/g;->a(Lhg/e;)I

    .line 268
    .line 269
    .line 270
    move-result v1

    .line 271
    if-ne v1, v3, :cond_10

    .line 272
    .line 273
    invoke-static {v4, v2}, Ljava/lang/Math;->max(II)I

    .line 274
    .line 275
    .line 276
    move-result v1

    .line 277
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 278
    .line 279
    .line 280
    move-result v6

    .line 281
    add-int/2addr v6, v4

    .line 282
    invoke-static {v1, v6}, Lcg/h;->q(II)Lkotlin/ranges/IntRange;

    .line 283
    .line 284
    .line 285
    move-result-object v1

    .line 286
    new-array v6, v3, [Ljava/lang/reflect/Method;

    .line 287
    .line 288
    move v7, v2

    .line 289
    :goto_8
    if-ge v7, v3, :cond_f

    .line 290
    .line 291
    invoke-virtual {v1}, Lkotlin/ranges/a;->b()I

    .line 292
    .line 293
    .line 294
    move-result v8

    .line 295
    invoke-virtual {v1}, Lkotlin/ranges/a;->f()I

    .line 296
    .line 297
    .line 298
    move-result v9

    .line 299
    if-gt v7, v9, :cond_d

    .line 300
    .line 301
    if-gt v8, v7, :cond_d

    .line 302
    .line 303
    move v8, v5

    .line 304
    goto :goto_9

    .line 305
    :cond_d
    move v8, v2

    .line 306
    :goto_9
    if-eqz v8, :cond_e

    .line 307
    .line 308
    sub-int v8, v7, v4

    .line 309
    .line 310
    invoke-interface {p2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v8

    .line 314
    check-cast v8, Ldi/g0;

    .line 315
    .line 316
    invoke-static {v8}, Lhg/i;->h(Ldi/g0;)Ljava/lang/Class;

    .line 317
    .line 318
    .line 319
    move-result-object v8

    .line 320
    if-eqz v8, :cond_e

    .line 321
    .line 322
    invoke-static {v8, p1}, Lhg/i;->f(Ljava/lang/Class;Lmg/b;)Ljava/lang/reflect/Method;

    .line 323
    .line 324
    .line 325
    move-result-object v8

    .line 326
    goto :goto_a

    .line 327
    :cond_e
    move-object v8, v0

    .line 328
    :goto_a
    aput-object v8, v6, v7

    .line 329
    .line 330
    add-int/lit8 v7, v7, 0x1

    .line 331
    .line 332
    goto :goto_8

    .line 333
    :cond_f
    new-instance p1, Lhg/h$a;

    .line 334
    .line 335
    invoke-direct {p1, v1, v6, p3}, Lhg/h$a;-><init>(Lkotlin/ranges/IntRange;[Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V

    .line 336
    .line 337
    .line 338
    :goto_b
    iput-object p1, p0, Lhg/h;->c:Lhg/h$a;

    .line 339
    .line 340
    return-void

    .line 341
    :cond_10
    new-instance p2, Lgg/h0;

    .line 342
    .line 343
    new-instance p3, Ljava/lang/StringBuilder;

    .line 344
    .line 345
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 346
    .line 347
    .line 348
    const-string v0, "Inconsistent number of parameters in the descriptor and Java reflection object: "

    .line 349
    .line 350
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 351
    .line 352
    .line 353
    invoke-static {p0}, Lhg/g;->a(Lhg/e;)I

    .line 354
    .line 355
    .line 356
    move-result v0

    .line 357
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 358
    .line 359
    .line 360
    const-string v0, " != "

    .line 361
    .line 362
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 363
    .line 364
    .line 365
    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 366
    .line 367
    .line 368
    const-string v0, "\nCalling: "

    .line 369
    .line 370
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 371
    .line 372
    .line 373
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 374
    .line 375
    .line 376
    const-string p1, "\nParameter types: "

    .line 377
    .line 378
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 379
    .line 380
    .line 381
    invoke-virtual {p0}, Lhg/h;->a()Ljava/util/List;

    .line 382
    .line 383
    .line 384
    move-result-object p1

    .line 385
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 386
    .line 387
    .line 388
    const-string p1, ")\nDefault: "

    .line 389
    .line 390
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 391
    .line 392
    .line 393
    iget-boolean p1, p0, Lhg/h;->b:Z

    .line 394
    .line 395
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 396
    .line 397
    .line 398
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 399
    .line 400
    .line 401
    move-result-object p1

    .line 402
    invoke-direct {p2, p1}, Lgg/h0;-><init>(Ljava/lang/String;)V

    .line 403
    .line 404
    .line 405
    throw p2
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


# virtual methods
.method public a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/reflect/Type;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lhg/h;->a:Lhg/e;

    invoke-interface {v0}, Lhg/e;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public b()Ljava/lang/reflect/Member;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TM;"
        }
    .end annotation

    iget-object v0, p0, Lhg/h;->a:Lhg/e;

    invoke-interface {v0}, Lhg/e;->b()Ljava/lang/reflect/Member;

    move-result-object v0

    return-object v0
.end method

.method public call([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    const-string v0, "args"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lhg/h;->c:Lhg/h$a;

    .line 7
    .line 8
    invoke-virtual {v0}, Lhg/h$a;->a()Lkotlin/ranges/IntRange;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0}, Lhg/h$a;->b()[Ljava/lang/reflect/Method;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {v0}, Lhg/h$a;->c()Ljava/lang/reflect/Method;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    array-length v3, p1

    .line 21
    invoke-static {p1, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    const-string v4, "copyOf(this, size)"

    .line 26
    .line 27
    invoke-static {v3, v4}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, Lkotlin/ranges/a;->b()I

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    invoke-virtual {v1}, Lkotlin/ranges/a;->f()I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    const/4 v5, 0x0

    .line 39
    if-gt v4, v1, :cond_2

    .line 40
    .line 41
    :goto_0
    aget-object v6, v2, v4

    .line 42
    .line 43
    aget-object v7, p1, v4

    .line 44
    .line 45
    if-eqz v6, :cond_1

    .line 46
    .line 47
    if-eqz v7, :cond_0

    .line 48
    .line 49
    new-array v8, v5, [Ljava/lang/Object;

    .line 50
    .line 51
    invoke-virtual {v6, v7, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v7

    .line 55
    goto :goto_1

    .line 56
    :cond_0
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    const-string v7, "method.returnType"

    .line 61
    .line 62
    invoke-static {v6, v7}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-static {v6}, Lgg/p0;->g(Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v7

    .line 69
    :cond_1
    :goto_1
    aput-object v7, v3, v4

    .line 70
    .line 71
    if-eq v4, v1, :cond_2

    .line 72
    .line 73
    add-int/lit8 v4, v4, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_2
    iget-object p1, p0, Lhg/h;->a:Lhg/e;

    .line 77
    .line 78
    invoke-interface {p1, v3}, Lhg/e;->call([Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    if-eqz v0, :cond_4

    .line 83
    .line 84
    const/4 v1, 0x1

    .line 85
    new-array v1, v1, [Ljava/lang/Object;

    .line 86
    .line 87
    aput-object p1, v1, v5

    .line 88
    .line 89
    const/4 v2, 0x0

    .line 90
    invoke-virtual {v0, v2, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    if-nez v0, :cond_3

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_3
    move-object p1, v0

    .line 98
    :cond_4
    :goto_2
    return-object p1
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

.method public getReturnType()Ljava/lang/reflect/Type;
    .locals 1

    iget-object v0, p0, Lhg/h;->a:Lhg/e;

    invoke-interface {v0}, Lhg/e;->getReturnType()Ljava/lang/reflect/Type;

    move-result-object v0

    return-object v0
.end method
