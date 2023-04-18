.class public final Lfi/a;
.super Lpg/h;
.source "SourceFile"


# direct methods
.method public constructor <init>(Llh/f;)V
    .locals 20

    .line 1
    move-object/from16 v9, p0

    .line 2
    .line 3
    const-string v0, "name"

    .line 4
    .line 5
    move-object/from16 v2, p1

    .line 6
    .line 7
    invoke-static {v2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    sget-object v10, Lfi/k;->a:Lfi/k;

    .line 11
    .line 12
    invoke-virtual {v10}, Lfi/k;->i()Lmg/h0;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    sget-object v3, Lmg/e0;->n:Lmg/e0;

    .line 17
    .line 18
    sget-object v4, Lmg/f;->l:Lmg/f;

    .line 19
    .line 20
    invoke-static {}, Lkotlin/collections/h;->i()Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    sget-object v11, Lmg/a1;->a:Lmg/a1;

    .line 25
    .line 26
    const/4 v7, 0x0

    .line 27
    sget-object v8, Lci/f;->e:Lci/n;

    .line 28
    .line 29
    move-object/from16 v0, p0

    .line 30
    .line 31
    move-object v6, v11

    .line 32
    invoke-direct/range {v0 .. v8}, Lpg/h;-><init>(Lmg/m;Llh/f;Lmg/e0;Lmg/f;Ljava/util/Collection;Lmg/a1;ZLci/n;)V

    .line 33
    .line 34
    .line 35
    sget-object v0, Lng/g;->f:Lng/g$a;

    .line 36
    .line 37
    invoke-virtual {v0}, Lng/g$a;->b()Lng/g;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    const/4 v1, 0x1

    .line 42
    invoke-static {v9, v0, v1, v11}, Lpg/f;->n1(Lmg/e;Lng/g;ZLmg/a1;)Lpg/f;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-static {}, Lkotlin/collections/h;->i()Ljava/util/List;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    sget-object v3, Lmg/t;->d:Lmg/u;

    .line 51
    .line 52
    invoke-virtual {v0, v2, v3}, Lpg/f;->q1(Ljava/util/List;Lmg/u;)Lpg/f;

    .line 53
    .line 54
    .line 55
    const-string v2, "create(this, Annotations\u2026          )\n            }"

    .line 56
    .line 57
    invoke-static {v0, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    sget-object v2, Lfi/g;->t:Lfi/g;

    .line 61
    .line 62
    const/4 v3, 0x2

    .line 63
    new-array v3, v3, [Ljava/lang/String;

    .line 64
    .line 65
    invoke-virtual {v0}, Lpg/j;->getName()Llh/f;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    invoke-virtual {v4}, Llh/f;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    const-string v5, "errorConstructor.name.toString()"

    .line 74
    .line 75
    invoke-static {v4, v5}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    const/4 v5, 0x0

    .line 79
    aput-object v4, v3, v5

    .line 80
    .line 81
    const-string v4, ""

    .line 82
    .line 83
    aput-object v4, v3, v1

    .line 84
    .line 85
    invoke-static {v2, v3}, Lfi/k;->b(Lfi/g;[Ljava/lang/String;)Lfi/f;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    new-instance v2, Lfi/h;

    .line 90
    .line 91
    sget-object v14, Lfi/j;->D0:Lfi/j;

    .line 92
    .line 93
    new-array v3, v5, [Ljava/lang/String;

    .line 94
    .line 95
    invoke-virtual {v10, v14, v3}, Lfi/k;->e(Lfi/j;[Ljava/lang/String;)Lfi/i;

    .line 96
    .line 97
    .line 98
    move-result-object v12

    .line 99
    const/4 v15, 0x0

    .line 100
    const/16 v16, 0x0

    .line 101
    .line 102
    new-array v3, v5, [Ljava/lang/String;

    .line 103
    .line 104
    const/16 v18, 0x18

    .line 105
    .line 106
    const/16 v19, 0x0

    .line 107
    .line 108
    move-object v11, v2

    .line 109
    move-object v13, v1

    .line 110
    move-object/from16 v17, v3

    .line 111
    .line 112
    invoke-direct/range {v11 .. v19}, Lfi/h;-><init>(Ldi/g1;Lwh/h;Lfi/j;Ljava/util/List;Z[Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0, v2}, Lpg/p;->g1(Ldi/g0;)V

    .line 116
    .line 117
    .line 118
    invoke-static {v0}, Lkotlin/collections/u;->c(Ljava/lang/Object;)Ljava/util/Set;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    invoke-virtual {v9, v1, v2, v0}, Lpg/h;->K0(Lwh/h;Ljava/util/Set;Lmg/d;)V

    .line 123
    .line 124
    .line 125
    return-void
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


# virtual methods
.method public F0(Ldi/p1;)Lmg/e;
    .locals 1

    const-string v0, "substitutor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public G(Ldi/n1;Lei/g;)Lwh/h;
    .locals 3

    .line 1
    const-string v0, "typeSubstitution"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "kotlinTypeRefiner"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object p2, Lfi/g;->t:Lfi/g;

    .line 12
    .line 13
    const/4 v0, 0x2

    .line 14
    new-array v0, v0, [Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {p0}, Lpg/a;->getName()Llh/f;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v1}, Llh/f;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    const-string v2, "name.toString()"

    .line 25
    .line 26
    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    aput-object v1, v0, v2

    .line 31
    .line 32
    const/4 v1, 0x1

    .line 33
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    aput-object p1, v0, v1

    .line 38
    .line 39
    invoke-static {p2, v0}, Lfi/k;->b(Lfi/g;[Ljava/lang/String;)Lfi/f;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    return-object p1
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
.end method

.method public bridge synthetic c(Ldi/p1;)Lmg/n;
    .locals 0

    invoke-virtual {p0, p1}, Lfi/a;->F0(Ldi/p1;)Lmg/e;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Lpg/a;->getName()Llh/f;

    move-result-object v0

    invoke-virtual {v0}, Llh/f;->b()Ljava/lang/String;

    move-result-object v0

    const-string v1, "name.asString()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
