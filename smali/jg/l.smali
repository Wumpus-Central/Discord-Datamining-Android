.class public final Ljg/l;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lpg/y;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    new-instance v8, Lpg/y;

    .line 2
    .line 3
    new-instance v1, Lpg/m;

    .line 4
    .line 5
    sget-object v0, Lfi/k;->a:Lfi/k;

    .line 6
    .line 7
    invoke-virtual {v0}, Lfi/k;->i()Lmg/h0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sget-object v2, Ljg/k;->m:Llh/c;

    .line 12
    .line 13
    invoke-direct {v1, v0, v2}, Lpg/m;-><init>(Lmg/h0;Llh/c;)V

    .line 14
    .line 15
    .line 16
    sget-object v2, Lmg/f;->m:Lmg/f;

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    const/4 v4, 0x0

    .line 20
    sget-object v0, Ljg/k;->p:Llh/c;

    .line 21
    .line 22
    invoke-virtual {v0}, Llh/c;->g()Llh/f;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    sget-object v6, Lmg/a1;->a:Lmg/a1;

    .line 27
    .line 28
    sget-object v9, Lci/f;->e:Lci/n;

    .line 29
    .line 30
    move-object v0, v8

    .line 31
    move-object v7, v9

    .line 32
    invoke-direct/range {v0 .. v7}, Lpg/y;-><init>(Lmg/m;Lmg/f;ZZLlh/f;Lmg/a1;Lci/n;)V

    .line 33
    .line 34
    .line 35
    sget-object v0, Lmg/e0;->o:Lmg/e0;

    .line 36
    .line 37
    invoke-virtual {v8, v0}, Lpg/y;->M0(Lmg/e0;)V

    .line 38
    .line 39
    .line 40
    sget-object v0, Lmg/t;->e:Lmg/u;

    .line 41
    .line 42
    invoke-virtual {v8, v0}, Lpg/y;->O0(Lmg/u;)V

    .line 43
    .line 44
    .line 45
    sget-object v0, Lng/g;->f:Lng/g$a;

    .line 46
    .line 47
    invoke-virtual {v0}, Lng/g$a;->b()Lng/g;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    const/4 v2, 0x0

    .line 52
    sget-object v3, Ldi/w1;->p:Ldi/w1;

    .line 53
    .line 54
    const-string v0, "T"

    .line 55
    .line 56
    invoke-static {v0}, Llh/f;->h(Ljava/lang/String;)Llh/f;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    const/4 v5, 0x0

    .line 61
    move-object v0, v8

    .line 62
    move-object v6, v9

    .line 63
    invoke-static/range {v0 .. v6}, Lpg/k0;->R0(Lmg/m;Lng/g;ZLdi/w1;Llh/f;ILci/n;)Lmg/f1;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-static {v0}, Lkotlin/collections/h;->d(Ljava/lang/Object;)Ljava/util/List;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-virtual {v8, v0}, Lpg/y;->N0(Ljava/util/List;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v8}, Lpg/y;->K0()V

    .line 75
    .line 76
    .line 77
    sput-object v8, Ljg/l;->a:Lpg/y;

    .line 78
    .line 79
    return-void
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

.method public static final a(Ldi/g0;)Ldi/o0;
    .locals 13

    .line 1
    const-string v0, "suspendFunType"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Ljg/g;->q(Ldi/g0;)Z

    .line 7
    .line 8
    .line 9
    invoke-static {p0}, Lii/a;->i(Ldi/g0;)Ljg/h;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {p0}, Ldi/g0;->getAnnotations()Lng/g;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-static {p0}, Ljg/g;->j(Ldi/g0;)Ldi/g0;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-static {p0}, Ljg/g;->e(Ldi/g0;)Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    invoke-static {p0}, Ljg/g;->l(Ldi/g0;)Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    new-instance v5, Ljava/util/ArrayList;

    .line 30
    .line 31
    const/16 v6, 0xa

    .line 32
    .line 33
    invoke-static {v0, v6}, Lkotlin/collections/h;->t(Ljava/lang/Iterable;I)I

    .line 34
    .line 35
    .line 36
    move-result v6

    .line 37
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 38
    .line 39
    .line 40
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    if-eqz v6, :cond_0

    .line 49
    .line 50
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v6

    .line 54
    check-cast v6, Ldi/k1;

    .line 55
    .line 56
    invoke-interface {v6}, Ldi/k1;->getType()Ldi/g0;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_0
    sget-object v0, Ldi/c1;->l:Ldi/c1$a;

    .line 65
    .line 66
    invoke-virtual {v0}, Ldi/c1$a;->h()Ldi/c1;

    .line 67
    .line 68
    .line 69
    move-result-object v6

    .line 70
    sget-object v0, Ljg/l;->a:Lpg/y;

    .line 71
    .line 72
    invoke-virtual {v0}, Lpg/y;->k()Ldi/g1;

    .line 73
    .line 74
    .line 75
    move-result-object v7

    .line 76
    const-string v0, "FAKE_CONTINUATION_CLASS_DESCRIPTOR.typeConstructor"

    .line 77
    .line 78
    invoke-static {v7, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-static {p0}, Ljg/g;->k(Ldi/g0;)Ldi/g0;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-static {v0}, Lii/a;->a(Ldi/g0;)Ldi/k1;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-static {v0}, Lkotlin/collections/h;->d(Ljava/lang/Object;)Ljava/util/List;

    .line 90
    .line 91
    .line 92
    move-result-object v8

    .line 93
    const/4 v9, 0x0

    .line 94
    const/4 v10, 0x0

    .line 95
    const/16 v11, 0x10

    .line 96
    .line 97
    const/4 v12, 0x0

    .line 98
    invoke-static/range {v6 .. v12}, Ldi/h0;->j(Ldi/c1;Ldi/g1;Ljava/util/List;ZLei/g;ILjava/lang/Object;)Ldi/o0;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-static {v5, v0}, Lkotlin/collections/h;->p0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    const/4 v6, 0x0

    .line 107
    invoke-static {p0}, Lii/a;->i(Ldi/g0;)Ljg/h;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-virtual {v0}, Ljg/h;->I()Ldi/o0;

    .line 112
    .line 113
    .line 114
    move-result-object v7

    .line 115
    const-string v0, "suspendFunType.builtIns.nullableAnyType"

    .line 116
    .line 117
    invoke-static {v7, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    const/4 v8, 0x0

    .line 121
    const/16 v9, 0x80

    .line 122
    .line 123
    invoke-static/range {v1 .. v10}, Ljg/g;->c(Ljg/h;Lng/g;Ldi/g0;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ldi/g0;ZILjava/lang/Object;)Ldi/o0;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    invoke-virtual {p0}, Ldi/g0;->O0()Z

    .line 128
    .line 129
    .line 130
    move-result p0

    .line 131
    invoke-virtual {v0, p0}, Ldi/o0;->U0(Z)Ldi/o0;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    return-object p0
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
