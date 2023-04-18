.class public final Lrh/q;
.super Lrh/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrh/q$b;,
        Lrh/q$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lrh/g<",
        "Lrh/q$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final b:Lrh/q$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lrh/q$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lrh/q$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lrh/q;->b:Lrh/q$a;

    return-void
.end method

.method public constructor <init>(Llh/b;I)V
    .locals 1

    const-string v0, "classId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    new-instance v0, Lrh/f;

    invoke-direct {v0, p1, p2}, Lrh/f;-><init>(Llh/b;I)V

    invoke-direct {p0, v0}, Lrh/q;-><init>(Lrh/f;)V

    return-void
.end method

.method public constructor <init>(Lrh/f;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Lrh/q$b$b;

    invoke-direct {v0, p1}, Lrh/q$b$b;-><init>(Lrh/f;)V

    invoke-direct {p0, v0}, Lrh/q;-><init>(Lrh/q$b;)V

    return-void
.end method

.method public constructor <init>(Lrh/q$b;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1}, Lrh/g;-><init>(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public a(Lmg/h0;)Ldi/g0;
    .locals 3

    .line 1
    const-string v0, "module"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Ldi/c1;->l:Ldi/c1$a;

    .line 7
    .line 8
    invoke-virtual {v0}, Ldi/c1$a;->h()Ldi/c1;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {p1}, Lmg/h0;->o()Ljg/h;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v1}, Ljg/h;->E()Lmg/e;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const-string v2, "module.builtIns.kClass"

    .line 21
    .line 22
    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    new-instance v2, Ldi/m1;

    .line 26
    .line 27
    invoke-virtual {p0, p1}, Lrh/q;->c(Lmg/h0;)Ldi/g0;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-direct {v2, p1}, Ldi/m1;-><init>(Ldi/g0;)V

    .line 32
    .line 33
    .line 34
    invoke-static {v2}, Lkotlin/collections/h;->d(Ljava/lang/Object;)Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-static {v0, v1, p1}, Ldi/h0;->g(Ldi/c1;Lmg/e;Ljava/util/List;)Ldi/o0;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    return-object p1
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

.method public final c(Lmg/h0;)Ldi/g0;
    .locals 5

    .line 1
    const-string v0, "module"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lrh/g;->b()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Lrh/q$b;

    .line 11
    .line 12
    instance-of v1, v0, Lrh/q$b$a;

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, Lrh/g;->b()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, Lrh/q$b$a;

    .line 21
    .line 22
    invoke-virtual {p1}, Lrh/q$b$a;->a()Ldi/g0;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1

    .line 27
    :cond_0
    instance-of v0, v0, Lrh/q$b$b;

    .line 28
    .line 29
    if-eqz v0, :cond_3

    .line 30
    .line 31
    invoke-virtual {p0}, Lrh/g;->b()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Lrh/q$b$b;

    .line 36
    .line 37
    invoke-virtual {v0}, Lrh/q$b$b;->c()Lrh/f;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v0}, Lrh/f;->a()Llh/b;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v0}, Lrh/f;->b()I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    invoke-static {p1, v1}, Lmg/x;->a(Lmg/h0;Llh/b;)Lmg/e;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    const/4 v3, 0x0

    .line 54
    if-nez v2, :cond_1

    .line 55
    .line 56
    sget-object p1, Lfi/j;->r:Lfi/j;

    .line 57
    .line 58
    const/4 v2, 0x2

    .line 59
    new-array v2, v2, [Ljava/lang/String;

    .line 60
    .line 61
    invoke-virtual {v1}, Llh/b;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    const-string v4, "classId.toString()"

    .line 66
    .line 67
    invoke-static {v1, v4}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    aput-object v1, v2, v3

    .line 71
    .line 72
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    const/4 v1, 0x1

    .line 77
    aput-object v0, v2, v1

    .line 78
    .line 79
    invoke-static {p1, v2}, Lfi/k;->d(Lfi/j;[Ljava/lang/String;)Lfi/h;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    return-object p1

    .line 84
    :cond_1
    invoke-interface {v2}, Lmg/e;->s()Ldi/o0;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    const-string v2, "descriptor.defaultType"

    .line 89
    .line 90
    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-static {v1}, Lii/a;->w(Ldi/g0;)Ldi/g0;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    :goto_0
    if-ge v3, v0, :cond_2

    .line 98
    .line 99
    invoke-interface {p1}, Lmg/h0;->o()Ljg/h;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    sget-object v4, Ldi/w1;->o:Ldi/w1;

    .line 104
    .line 105
    invoke-virtual {v2, v4, v1}, Ljg/h;->l(Ldi/w1;Ldi/g0;)Ldi/o0;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    const-string v2, "module.builtIns.getArray\u2026Variance.INVARIANT, type)"

    .line 110
    .line 111
    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    add-int/lit8 v3, v3, 0x1

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_2
    return-object v1

    .line 118
    :cond_3
    new-instance p1, Llf/q;

    .line 119
    .line 120
    invoke-direct {p1}, Llf/q;-><init>()V

    .line 121
    .line 122
    .line 123
    throw p1
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
.end method
