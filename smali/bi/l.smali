.class public final Lbi/l;
.super Lpg/d;
.source "SourceFile"

# interfaces
.implements Lbi/g;


# instance fields
.field private A:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lmg/f1;",
            ">;"
        }
    .end annotation
.end field

.field private B:Ldi/o0;

.field private final r:Lci/n;

.field private final s:Lgh/r;

.field private final t:Lih/c;

.field private final u:Lih/g;

.field private final v:Lih/h;

.field private final w:Lbi/f;

.field private x:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "+",
            "Lpg/i0;",
            ">;"
        }
    .end annotation
.end field

.field private y:Ldi/o0;

.field private z:Ldi/o0;


# direct methods
.method public constructor <init>(Lci/n;Lmg/m;Lng/g;Llh/f;Lmg/u;Lgh/r;Lih/c;Lih/g;Lih/h;Lbi/f;)V
    .locals 12

    .line 1
    move-object v6, p0

    .line 2
    move-object v7, p1

    .line 3
    move-object/from16 v8, p6

    .line 4
    .line 5
    move-object/from16 v9, p7

    .line 6
    .line 7
    move-object/from16 v10, p8

    .line 8
    .line 9
    move-object/from16 v11, p9

    .line 10
    .line 11
    const-string v0, "storageManager"

    .line 12
    .line 13
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "containingDeclaration"

    .line 17
    .line 18
    move-object v1, p2

    .line 19
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const-string v0, "annotations"

    .line 23
    .line 24
    move-object v2, p3

    .line 25
    invoke-static {p3, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const-string v0, "name"

    .line 29
    .line 30
    move-object/from16 v3, p4

    .line 31
    .line 32
    invoke-static {v3, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    const-string v0, "visibility"

    .line 36
    .line 37
    move-object/from16 v5, p5

    .line 38
    .line 39
    invoke-static {v5, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    const-string v0, "proto"

    .line 43
    .line 44
    invoke-static {v8, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const-string v0, "nameResolver"

    .line 48
    .line 49
    invoke-static {v9, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    const-string v0, "typeTable"

    .line 53
    .line 54
    invoke-static {v10, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    const-string v0, "versionRequirementTable"

    .line 58
    .line 59
    invoke-static {v11, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    sget-object v4, Lmg/a1;->a:Lmg/a1;

    .line 63
    .line 64
    const-string v0, "NO_SOURCE"

    .line 65
    .line 66
    invoke-static {v4, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    move-object v0, p0

    .line 70
    invoke-direct/range {v0 .. v5}, Lpg/d;-><init>(Lmg/m;Lng/g;Llh/f;Lmg/a1;Lmg/u;)V

    .line 71
    .line 72
    .line 73
    iput-object v7, v6, Lbi/l;->r:Lci/n;

    .line 74
    .line 75
    iput-object v8, v6, Lbi/l;->s:Lgh/r;

    .line 76
    .line 77
    iput-object v9, v6, Lbi/l;->t:Lih/c;

    .line 78
    .line 79
    iput-object v10, v6, Lbi/l;->u:Lih/g;

    .line 80
    .line 81
    iput-object v11, v6, Lbi/l;->v:Lih/h;

    .line 82
    .line 83
    move-object/from16 v0, p10

    .line 84
    .line 85
    iput-object v0, v6, Lbi/l;->w:Lbi/f;

    .line 86
    .line 87
    return-void
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
.end method


# virtual methods
.method protected M0()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lmg/f1;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lbi/l;->A:Ljava/util/List;

    if-nez v0, :cond_0

    const-string v0, "typeConstructorParameters"

    invoke-static {v0}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    return-object v0
.end method

.method public O0()Lgh/r;
    .locals 1

    iget-object v0, p0, Lbi/l;->s:Lgh/r;

    return-object v0
.end method

.method public P0()Lih/h;
    .locals 1

    iget-object v0, p0, Lbi/l;->v:Lih/h;

    return-object v0
.end method

.method public final Q0(Ljava/util/List;Ldi/o0;Ldi/o0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lmg/f1;",
            ">;",
            "Ldi/o0;",
            "Ldi/o0;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "declaredTypeParameters"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "underlyingType"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "expandedType"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p1}, Lpg/d;->N0(Ljava/util/List;)V

    .line 17
    .line 18
    .line 19
    iput-object p2, p0, Lbi/l;->y:Ldi/o0;

    .line 20
    .line 21
    iput-object p3, p0, Lbi/l;->z:Ldi/o0;

    .line 22
    .line 23
    invoke-static {p0}, Lmg/g1;->d(Lmg/i;)Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, p0, Lbi/l;->A:Ljava/util/List;

    .line 28
    .line 29
    invoke-virtual {p0}, Lpg/d;->F0()Ldi/o0;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iput-object p1, p0, Lbi/l;->B:Ldi/o0;

    .line 34
    .line 35
    invoke-virtual {p0}, Lpg/d;->L0()Ljava/util/Collection;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iput-object p1, p0, Lbi/l;->x:Ljava/util/Collection;

    .line 40
    .line 41
    return-void
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

.method public R0(Ldi/p1;)Lmg/e1;
    .locals 12

    .line 1
    const-string v0, "substitutor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ldi/p1;->k()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_0
    new-instance v0, Lbi/l;

    .line 14
    .line 15
    invoke-virtual {p0}, Lbi/l;->h0()Lci/n;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {p0}, Lpg/k;->b()Lmg/m;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    const-string v1, "containingDeclaration"

    .line 24
    .line 25
    invoke-static {v3, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Lng/b;->getAnnotations()Lng/g;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    const-string v1, "annotations"

    .line 33
    .line 34
    invoke-static {v4, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Lpg/j;->getName()Llh/f;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    const-string v1, "name"

    .line 42
    .line 43
    invoke-static {v5, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Lpg/d;->getVisibility()Lmg/u;

    .line 47
    .line 48
    .line 49
    move-result-object v6

    .line 50
    invoke-virtual {p0}, Lbi/l;->O0()Lgh/r;

    .line 51
    .line 52
    .line 53
    move-result-object v7

    .line 54
    invoke-virtual {p0}, Lbi/l;->a0()Lih/c;

    .line 55
    .line 56
    .line 57
    move-result-object v8

    .line 58
    invoke-virtual {p0}, Lbi/l;->T()Lih/g;

    .line 59
    .line 60
    .line 61
    move-result-object v9

    .line 62
    invoke-virtual {p0}, Lbi/l;->P0()Lih/h;

    .line 63
    .line 64
    .line 65
    move-result-object v10

    .line 66
    invoke-virtual {p0}, Lbi/l;->d0()Lbi/f;

    .line 67
    .line 68
    .line 69
    move-result-object v11

    .line 70
    move-object v1, v0

    .line 71
    invoke-direct/range {v1 .. v11}, Lbi/l;-><init>(Lci/n;Lmg/m;Lng/g;Llh/f;Lmg/u;Lgh/r;Lih/c;Lih/g;Lih/h;Lbi/f;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0}, Lpg/d;->u()Ljava/util/List;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-virtual {p0}, Lbi/l;->g0()Ldi/o0;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    sget-object v3, Ldi/w1;->o:Ldi/w1;

    .line 83
    .line 84
    invoke-virtual {p1, v2, v3}, Ldi/p1;->n(Ldi/g0;Ldi/w1;)Ldi/g0;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    const-string v4, "substitutor.safeSubstitu\u2026Type, Variance.INVARIANT)"

    .line 89
    .line 90
    invoke-static {v2, v4}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-static {v2}, Ldi/o1;->a(Ldi/g0;)Ldi/o0;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    invoke-virtual {p0}, Lbi/l;->W()Ldi/o0;

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    invoke-virtual {p1, v5, v3}, Ldi/p1;->n(Ldi/g0;Ldi/w1;)Ldi/g0;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-static {p1, v4}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    invoke-static {p1}, Ldi/o1;->a(Ldi/g0;)Ldi/o0;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    invoke-virtual {v0, v1, v2, p1}, Lbi/l;->Q0(Ljava/util/List;Ldi/o0;Ldi/o0;)V

    .line 113
    .line 114
    .line 115
    return-object v0
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
.end method

.method public T()Lih/g;
    .locals 1

    iget-object v0, p0, Lbi/l;->u:Lih/g;

    return-object v0
.end method

.method public W()Ldi/o0;
    .locals 1

    iget-object v0, p0, Lbi/l;->z:Ldi/o0;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "expandedType"

    invoke-static {v0}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public a0()Lih/c;
    .locals 1

    iget-object v0, p0, Lbi/l;->t:Lih/c;

    return-object v0
.end method

.method public bridge synthetic c(Ldi/p1;)Lmg/n;
    .locals 0

    invoke-virtual {p0, p1}, Lbi/l;->R0(Ldi/p1;)Lmg/e1;

    move-result-object p1

    return-object p1
.end method

.method public d0()Lbi/f;
    .locals 1

    iget-object v0, p0, Lbi/l;->w:Lbi/f;

    return-object v0
.end method

.method public g0()Ldi/o0;
    .locals 1

    iget-object v0, p0, Lbi/l;->y:Ldi/o0;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "underlyingType"

    invoke-static {v0}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method protected h0()Lci/n;
    .locals 1

    iget-object v0, p0, Lbi/l;->r:Lci/n;

    return-object v0
.end method

.method public q()Lmg/e;
    .locals 3

    invoke-virtual {p0}, Lbi/l;->W()Ldi/o0;

    move-result-object v0

    invoke-static {v0}, Ldi/i0;->a(Ldi/g0;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lbi/l;->W()Ldi/o0;

    move-result-object v0

    invoke-virtual {v0}, Ldi/g0;->N0()Ldi/g1;

    move-result-object v0

    invoke-interface {v0}, Ldi/g1;->q()Lmg/h;

    move-result-object v0

    instance-of v2, v0, Lmg/e;

    if-eqz v2, :cond_1

    move-object v1, v0

    check-cast v1, Lmg/e;

    :cond_1
    :goto_0
    return-object v1
.end method

.method public s()Ldi/o0;
    .locals 1

    iget-object v0, p0, Lbi/l;->B:Ldi/o0;

    if-nez v0, :cond_0

    const-string v0, "defaultTypeImpl"

    invoke-static {v0}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    return-object v0
.end method
