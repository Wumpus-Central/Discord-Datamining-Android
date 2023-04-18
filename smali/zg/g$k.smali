.class final Lzg/g$k;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzg/g;-><init>(Lyg/g;Lmg/e;Lch/g;ZLzg/g;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Llh/f;",
        "Lmg/e;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic k:Lzg/g;

.field final synthetic l:Lyg/g;


# direct methods
.method constructor <init>(Lzg/g;Lyg/g;)V
    .locals 0

    iput-object p1, p0, Lzg/g$k;->k:Lzg/g;

    iput-object p2, p0, Lzg/g$k;->l:Lyg/g;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Llh/f;)Lmg/e;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v3, p1

    .line 4
    .line 5
    const-string v1, "name"

    .line 6
    .line 7
    invoke-static {v3, v1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object v1, v0, Lzg/g$k;->k:Lzg/g;

    .line 11
    .line 12
    invoke-static {v1}, Lzg/g;->R(Lzg/g;)Lci/i;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-interface {v1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Ljava/util/Set;

    .line 21
    .line 22
    invoke-interface {v1, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    const/4 v2, 0x0

    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    iget-object v1, v0, Lzg/g$k;->l:Lyg/g;

    .line 30
    .line 31
    invoke-virtual {v1}, Lyg/g;->a()Lyg/b;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v1}, Lyg/b;->d()Lvg/p;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    new-instance v9, Lvg/p$a;

    .line 40
    .line 41
    iget-object v4, v0, Lzg/g$k;->k:Lzg/g;

    .line 42
    .line 43
    invoke-virtual {v4}, Lzg/g;->z0()Lmg/e;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    invoke-static {v4}, Lth/c;->k(Lmg/h;)Llh/b;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    invoke-static {v4}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v4, v3}, Llh/b;->d(Llh/f;)Llh/b;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    const-string v3, "ownerDescriptor.classId!\u2026createNestedClassId(name)"

    .line 59
    .line 60
    invoke-static {v4, v3}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    const/4 v5, 0x0

    .line 64
    iget-object v3, v0, Lzg/g$k;->k:Lzg/g;

    .line 65
    .line 66
    invoke-static {v3}, Lzg/g;->Q(Lzg/g;)Lch/g;

    .line 67
    .line 68
    .line 69
    move-result-object v6

    .line 70
    const/4 v7, 0x2

    .line 71
    const/4 v8, 0x0

    .line 72
    move-object v3, v9

    .line 73
    invoke-direct/range {v3 .. v8}, Lvg/p$a;-><init>(Llh/b;[BLch/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 74
    .line 75
    .line 76
    invoke-interface {v1, v9}, Lvg/p;->c(Lvg/p$a;)Lch/g;

    .line 77
    .line 78
    .line 79
    move-result-object v13

    .line 80
    if-eqz v13, :cond_3

    .line 81
    .line 82
    iget-object v1, v0, Lzg/g$k;->l:Lyg/g;

    .line 83
    .line 84
    iget-object v2, v0, Lzg/g$k;->k:Lzg/g;

    .line 85
    .line 86
    new-instance v3, Lzg/f;

    .line 87
    .line 88
    invoke-virtual {v2}, Lzg/g;->z0()Lmg/e;

    .line 89
    .line 90
    .line 91
    move-result-object v12

    .line 92
    const/4 v14, 0x0

    .line 93
    const/16 v15, 0x8

    .line 94
    .line 95
    const/16 v16, 0x0

    .line 96
    .line 97
    move-object v10, v3

    .line 98
    move-object v11, v1

    .line 99
    invoke-direct/range {v10 .. v16}, Lzg/f;-><init>(Lyg/g;Lmg/m;Lch/g;Lmg/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v1}, Lyg/g;->a()Lyg/b;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    invoke-virtual {v1}, Lyg/b;->e()Lvg/q;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    invoke-interface {v1, v3}, Lvg/q;->a(Lxg/c;)V

    .line 111
    .line 112
    .line 113
    move-object v2, v3

    .line 114
    goto/16 :goto_0

    .line 115
    .line 116
    :cond_0
    iget-object v1, v0, Lzg/g$k;->k:Lzg/g;

    .line 117
    .line 118
    invoke-static {v1}, Lzg/g;->P(Lzg/g;)Lci/i;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    invoke-interface {v1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    check-cast v1, Ljava/util/Set;

    .line 127
    .line 128
    invoke-interface {v1, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v1

    .line 132
    if-eqz v1, :cond_2

    .line 133
    .line 134
    iget-object v1, v0, Lzg/g$k;->l:Lyg/g;

    .line 135
    .line 136
    iget-object v4, v0, Lzg/g$k;->k:Lzg/g;

    .line 137
    .line 138
    invoke-static {}, Lkotlin/collections/h;->c()Ljava/util/List;

    .line 139
    .line 140
    .line 141
    move-result-object v5

    .line 142
    invoke-virtual {v1}, Lyg/g;->a()Lyg/b;

    .line 143
    .line 144
    .line 145
    move-result-object v6

    .line 146
    invoke-virtual {v6}, Lyg/b;->w()Luh/f;

    .line 147
    .line 148
    .line 149
    move-result-object v6

    .line 150
    invoke-virtual {v4}, Lzg/g;->z0()Lmg/e;

    .line 151
    .line 152
    .line 153
    move-result-object v4

    .line 154
    invoke-interface {v6, v1, v4, v3, v5}, Luh/f;->e(Lyg/g;Lmg/e;Llh/f;Ljava/util/List;)V

    .line 155
    .line 156
    .line 157
    invoke-static {v5}, Lkotlin/collections/h;->a(Ljava/util/List;)Ljava/util/List;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 162
    .line 163
    .line 164
    move-result v3

    .line 165
    if-eqz v3, :cond_3

    .line 166
    .line 167
    const/4 v2, 0x1

    .line 168
    if-ne v3, v2, :cond_1

    .line 169
    .line 170
    invoke-static {v1}, Lkotlin/collections/h;->r0(Ljava/util/List;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    move-object v2, v1

    .line 175
    check-cast v2, Lmg/e;

    .line 176
    .line 177
    goto :goto_0

    .line 178
    :cond_1
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 179
    .line 180
    new-instance v3, Ljava/lang/StringBuilder;

    .line 181
    .line 182
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 183
    .line 184
    .line 185
    const-string v4, "Multiple classes with same name are generated: "

    .line 186
    .line 187
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v1

    .line 197
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    throw v2

    .line 205
    :cond_2
    iget-object v1, v0, Lzg/g$k;->k:Lzg/g;

    .line 206
    .line 207
    invoke-static {v1}, Lzg/g;->O(Lzg/g;)Lci/i;

    .line 208
    .line 209
    .line 210
    move-result-object v1

    .line 211
    invoke-interface {v1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v1

    .line 215
    check-cast v1, Ljava/util/Map;

    .line 216
    .line 217
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v1

    .line 221
    check-cast v1, Lch/n;

    .line 222
    .line 223
    if-eqz v1, :cond_3

    .line 224
    .line 225
    iget-object v2, v0, Lzg/g$k;->l:Lyg/g;

    .line 226
    .line 227
    invoke-virtual {v2}, Lyg/g;->e()Lci/n;

    .line 228
    .line 229
    .line 230
    move-result-object v2

    .line 231
    new-instance v4, Lzg/g$k$a;

    .line 232
    .line 233
    iget-object v5, v0, Lzg/g$k;->k:Lzg/g;

    .line 234
    .line 235
    invoke-direct {v4, v5}, Lzg/g$k$a;-><init>(Lzg/g;)V

    .line 236
    .line 237
    .line 238
    invoke-interface {v2, v4}, Lci/n;->d(Lkotlin/jvm/functions/Function0;)Lci/i;

    .line 239
    .line 240
    .line 241
    move-result-object v4

    .line 242
    iget-object v2, v0, Lzg/g$k;->l:Lyg/g;

    .line 243
    .line 244
    invoke-virtual {v2}, Lyg/g;->e()Lci/n;

    .line 245
    .line 246
    .line 247
    move-result-object v2

    .line 248
    iget-object v5, v0, Lzg/g$k;->k:Lzg/g;

    .line 249
    .line 250
    invoke-virtual {v5}, Lzg/g;->z0()Lmg/e;

    .line 251
    .line 252
    .line 253
    move-result-object v5

    .line 254
    iget-object v6, v0, Lzg/g$k;->l:Lyg/g;

    .line 255
    .line 256
    invoke-static {v6, v1}, Lyg/e;->a(Lyg/g;Lch/d;)Lng/g;

    .line 257
    .line 258
    .line 259
    move-result-object v6

    .line 260
    iget-object v7, v0, Lzg/g$k;->l:Lyg/g;

    .line 261
    .line 262
    invoke-virtual {v7}, Lyg/g;->a()Lyg/b;

    .line 263
    .line 264
    .line 265
    move-result-object v7

    .line 266
    invoke-virtual {v7}, Lyg/b;->t()Lbh/b;

    .line 267
    .line 268
    .line 269
    move-result-object v7

    .line 270
    invoke-interface {v7, v1}, Lbh/b;->a(Lch/l;)Lbh/a;

    .line 271
    .line 272
    .line 273
    move-result-object v7

    .line 274
    move-object v1, v2

    .line 275
    move-object v2, v5

    .line 276
    move-object/from16 v3, p1

    .line 277
    .line 278
    move-object v5, v6

    .line 279
    move-object v6, v7

    .line 280
    invoke-static/range {v1 .. v6}, Lpg/n;->L0(Lci/n;Lmg/e;Llh/f;Lci/i;Lng/g;Lmg/a1;)Lpg/n;

    .line 281
    .line 282
    .line 283
    move-result-object v2

    .line 284
    :cond_3
    :goto_0
    return-object v2
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

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Llh/f;

    invoke-virtual {p0, p1}, Lzg/g$k;->a(Llh/f;)Lmg/e;

    move-result-object p1

    return-object p1
.end method
