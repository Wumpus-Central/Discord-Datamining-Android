.class final Lzg/i$c;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzg/i;-><init>(Lyg/g;Lch/u;Lzg/h;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Lzg/i$a;",
        "Lmg/e;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic k:Lzg/i;

.field final synthetic l:Lyg/g;


# direct methods
.method constructor <init>(Lzg/i;Lyg/g;)V
    .locals 0

    iput-object p1, p0, Lzg/i$c;->k:Lzg/i;

    iput-object p2, p0, Lzg/i$c;->l:Lyg/g;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lzg/i$a;)Lmg/e;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "request"

    .line 4
    .line 5
    move-object/from16 v2, p1

    .line 6
    .line 7
    invoke-static {v2, v1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Llh/b;

    .line 11
    .line 12
    iget-object v3, v0, Lzg/i$c;->k:Lzg/i;

    .line 13
    .line 14
    invoke-virtual {v3}, Lzg/i;->Q()Lzg/h;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    invoke-virtual {v3}, Lpg/z;->d()Llh/c;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-virtual/range {p1 .. p1}, Lzg/i$a;->b()Llh/f;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    invoke-direct {v1, v3, v4}, Llh/b;-><init>(Llh/c;Llh/f;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual/range {p1 .. p1}, Lzg/i$a;->a()Lch/g;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    if-eqz v3, :cond_0

    .line 34
    .line 35
    iget-object v3, v0, Lzg/i$c;->l:Lyg/g;

    .line 36
    .line 37
    invoke-virtual {v3}, Lyg/g;->a()Lyg/b;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-virtual {v3}, Lyg/b;->j()Leh/p;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-virtual/range {p1 .. p1}, Lzg/i$a;->a()Lch/g;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    invoke-interface {v3, v4}, Leh/p;->a(Lch/g;)Leh/p$a;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    goto :goto_0

    .line 54
    :cond_0
    iget-object v3, v0, Lzg/i$c;->l:Lyg/g;

    .line 55
    .line 56
    invoke-virtual {v3}, Lyg/g;->a()Lyg/b;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-virtual {v3}, Lyg/b;->j()Leh/p;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    invoke-interface {v3, v1}, Leh/p;->b(Llh/b;)Leh/p$a;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    :goto_0
    const/4 v8, 0x0

    .line 69
    if-eqz v3, :cond_1

    .line 70
    .line 71
    invoke-virtual {v3}, Leh/p$a;->a()Leh/r;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    goto :goto_1

    .line 76
    :cond_1
    move-object v4, v8

    .line 77
    :goto_1
    if-eqz v4, :cond_2

    .line 78
    .line 79
    invoke-interface {v4}, Leh/r;->f()Llh/b;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    goto :goto_2

    .line 84
    :cond_2
    move-object v5, v8

    .line 85
    :goto_2
    if-eqz v5, :cond_4

    .line 86
    .line 87
    invoke-virtual {v5}, Llh/b;->l()Z

    .line 88
    .line 89
    .line 90
    move-result v6

    .line 91
    if-nez v6, :cond_3

    .line 92
    .line 93
    invoke-virtual {v5}, Llh/b;->k()Z

    .line 94
    .line 95
    .line 96
    move-result v5

    .line 97
    if-eqz v5, :cond_4

    .line 98
    .line 99
    :cond_3
    return-object v8

    .line 100
    :cond_4
    iget-object v5, v0, Lzg/i$c;->k:Lzg/i;

    .line 101
    .line 102
    invoke-static {v5, v4}, Lzg/i;->M(Lzg/i;Leh/r;)Lzg/i$b;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    instance-of v5, v4, Lzg/i$b$a;

    .line 107
    .line 108
    if-eqz v5, :cond_5

    .line 109
    .line 110
    check-cast v4, Lzg/i$b$a;

    .line 111
    .line 112
    invoke-virtual {v4}, Lzg/i$b$a;->a()Lmg/e;

    .line 113
    .line 114
    .line 115
    move-result-object v8

    .line 116
    goto/16 :goto_6

    .line 117
    .line 118
    :cond_5
    instance-of v5, v4, Lzg/i$b$c;

    .line 119
    .line 120
    if-eqz v5, :cond_6

    .line 121
    .line 122
    goto/16 :goto_6

    .line 123
    .line 124
    :cond_6
    instance-of v4, v4, Lzg/i$b$b;

    .line 125
    .line 126
    if-eqz v4, :cond_f

    .line 127
    .line 128
    invoke-virtual/range {p1 .. p1}, Lzg/i$a;->a()Lch/g;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    if-nez v2, :cond_9

    .line 133
    .line 134
    iget-object v2, v0, Lzg/i$c;->l:Lyg/g;

    .line 135
    .line 136
    invoke-virtual {v2}, Lyg/g;->a()Lyg/b;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    invoke-virtual {v2}, Lyg/b;->d()Lvg/p;

    .line 141
    .line 142
    .line 143
    move-result-object v9

    .line 144
    new-instance v10, Lvg/p$a;

    .line 145
    .line 146
    if-eqz v3, :cond_8

    .line 147
    .line 148
    instance-of v2, v3, Leh/p$a$a;

    .line 149
    .line 150
    if-nez v2, :cond_7

    .line 151
    .line 152
    move-object v3, v8

    .line 153
    :cond_7
    check-cast v3, Leh/p$a$a;

    .line 154
    .line 155
    if-eqz v3, :cond_8

    .line 156
    .line 157
    invoke-virtual {v3}, Leh/p$a$a;->b()[B

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    move-object v4, v2

    .line 162
    goto :goto_3

    .line 163
    :cond_8
    move-object v4, v8

    .line 164
    :goto_3
    const/4 v5, 0x0

    .line 165
    const/4 v6, 0x4

    .line 166
    const/4 v7, 0x0

    .line 167
    move-object v2, v10

    .line 168
    move-object v3, v1

    .line 169
    invoke-direct/range {v2 .. v7}, Lvg/p$a;-><init>(Llh/b;[BLch/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 170
    .line 171
    .line 172
    invoke-interface {v9, v10}, Lvg/p;->c(Lvg/p$a;)Lch/g;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    :cond_9
    move-object v12, v2

    .line 177
    if-eqz v12, :cond_a

    .line 178
    .line 179
    invoke-interface {v12}, Lch/g;->H()Lch/d0;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    goto :goto_4

    .line 184
    :cond_a
    move-object v2, v8

    .line 185
    :goto_4
    sget-object v3, Lch/d0;->l:Lch/d0;

    .line 186
    .line 187
    if-eq v2, v3, :cond_e

    .line 188
    .line 189
    if-eqz v12, :cond_b

    .line 190
    .line 191
    invoke-interface {v12}, Lch/g;->d()Llh/c;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    goto :goto_5

    .line 196
    :cond_b
    move-object v1, v8

    .line 197
    :goto_5
    if-eqz v1, :cond_d

    .line 198
    .line 199
    invoke-virtual {v1}, Llh/c;->d()Z

    .line 200
    .line 201
    .line 202
    move-result v2

    .line 203
    if-nez v2, :cond_d

    .line 204
    .line 205
    invoke-virtual {v1}, Llh/c;->e()Llh/c;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    iget-object v2, v0, Lzg/i$c;->k:Lzg/i;

    .line 210
    .line 211
    invoke-virtual {v2}, Lzg/i;->Q()Lzg/h;

    .line 212
    .line 213
    .line 214
    move-result-object v2

    .line 215
    invoke-virtual {v2}, Lpg/z;->d()Llh/c;

    .line 216
    .line 217
    .line 218
    move-result-object v2

    .line 219
    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    move-result v1

    .line 223
    if-nez v1, :cond_c

    .line 224
    .line 225
    goto :goto_6

    .line 226
    :cond_c
    new-instance v1, Lzg/f;

    .line 227
    .line 228
    iget-object v10, v0, Lzg/i$c;->l:Lyg/g;

    .line 229
    .line 230
    iget-object v2, v0, Lzg/i$c;->k:Lzg/i;

    .line 231
    .line 232
    invoke-virtual {v2}, Lzg/i;->Q()Lzg/h;

    .line 233
    .line 234
    .line 235
    move-result-object v11

    .line 236
    const/4 v13, 0x0

    .line 237
    const/16 v14, 0x8

    .line 238
    .line 239
    const/4 v15, 0x0

    .line 240
    move-object v9, v1

    .line 241
    invoke-direct/range {v9 .. v15}, Lzg/f;-><init>(Lyg/g;Lmg/m;Lch/g;Lmg/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 242
    .line 243
    .line 244
    iget-object v2, v0, Lzg/i$c;->l:Lyg/g;

    .line 245
    .line 246
    invoke-virtual {v2}, Lyg/g;->a()Lyg/b;

    .line 247
    .line 248
    .line 249
    move-result-object v2

    .line 250
    invoke-virtual {v2}, Lyg/b;->e()Lvg/q;

    .line 251
    .line 252
    .line 253
    move-result-object v2

    .line 254
    invoke-interface {v2, v1}, Lvg/q;->a(Lxg/c;)V

    .line 255
    .line 256
    .line 257
    move-object v8, v1

    .line 258
    :cond_d
    :goto_6
    return-object v8

    .line 259
    :cond_e
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 260
    .line 261
    new-instance v3, Ljava/lang/StringBuilder;

    .line 262
    .line 263
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 264
    .line 265
    .line 266
    const-string v4, "Couldn\'t find kotlin binary class for light class created by kotlin binary file\nJavaClass: "

    .line 267
    .line 268
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 269
    .line 270
    .line 271
    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 272
    .line 273
    .line 274
    const-string v4, "\nClassId: "

    .line 275
    .line 276
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 277
    .line 278
    .line 279
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 280
    .line 281
    .line 282
    const-string v4, "\nfindKotlinClass(JavaClass) = "

    .line 283
    .line 284
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 285
    .line 286
    .line 287
    iget-object v4, v0, Lzg/i$c;->l:Lyg/g;

    .line 288
    .line 289
    invoke-virtual {v4}, Lyg/g;->a()Lyg/b;

    .line 290
    .line 291
    .line 292
    move-result-object v4

    .line 293
    invoke-virtual {v4}, Lyg/b;->j()Leh/p;

    .line 294
    .line 295
    .line 296
    move-result-object v4

    .line 297
    invoke-static {v4, v12}, Leh/q;->a(Leh/p;Lch/g;)Leh/r;

    .line 298
    .line 299
    .line 300
    move-result-object v4

    .line 301
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 302
    .line 303
    .line 304
    const-string v4, "\nfindKotlinClass(ClassId) = "

    .line 305
    .line 306
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 307
    .line 308
    .line 309
    iget-object v4, v0, Lzg/i$c;->l:Lyg/g;

    .line 310
    .line 311
    invoke-virtual {v4}, Lyg/g;->a()Lyg/b;

    .line 312
    .line 313
    .line 314
    move-result-object v4

    .line 315
    invoke-virtual {v4}, Lyg/b;->j()Leh/p;

    .line 316
    .line 317
    .line 318
    move-result-object v4

    .line 319
    invoke-static {v4, v1}, Leh/q;->b(Leh/p;Llh/b;)Leh/r;

    .line 320
    .line 321
    .line 322
    move-result-object v1

    .line 323
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 324
    .line 325
    .line 326
    const/16 v1, 0xa

    .line 327
    .line 328
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 329
    .line 330
    .line 331
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object v1

    .line 335
    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 336
    .line 337
    .line 338
    throw v2

    .line 339
    :cond_f
    new-instance v1, Llf/q;

    .line 340
    .line 341
    invoke-direct {v1}, Llf/q;-><init>()V

    .line 342
    .line 343
    .line 344
    throw v1
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

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lzg/i$a;

    invoke-virtual {p0, p1}, Lzg/i$c;->a(Lzg/i$a;)Lmg/e;

    move-result-object p1

    return-object p1
.end method
