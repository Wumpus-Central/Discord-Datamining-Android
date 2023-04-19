.class public abstract Lei/f;
.super Ldi/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lei/f$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ldi/h;-><init>()V

    return-void
.end method

.method private final c(Ldi/o0;)Ldi/o0;
    .locals 16

    .line 1
    invoke-virtual/range {p1 .. p1}, Ldi/g0;->N0()Ldi/g1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Lqh/c;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    const/4 v3, 0x0

    .line 9
    const/16 v4, 0xa

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    if-eqz v1, :cond_5

    .line 13
    .line 14
    check-cast v0, Lqh/c;

    .line 15
    .line 16
    invoke-virtual {v0}, Lqh/c;->b()Ldi/k1;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-interface {v1}, Ldi/k1;->a()Ldi/w1;

    .line 21
    .line 22
    .line 23
    move-result-object v6

    .line 24
    sget-object v7, Ldi/w1;->p:Ldi/w1;

    .line 25
    .line 26
    if-ne v6, v7, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move v2, v3

    .line 30
    :goto_0
    if-eqz v2, :cond_1

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    move-object v1, v5

    .line 34
    :goto_1
    if-eqz v1, :cond_2

    .line 35
    .line 36
    invoke-interface {v1}, Ldi/k1;->getType()Ldi/g0;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    if-eqz v1, :cond_2

    .line 41
    .line 42
    invoke-virtual {v1}, Ldi/g0;->Q0()Ldi/v1;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    :cond_2
    move-object v9, v5

    .line 47
    invoke-virtual {v0}, Lqh/c;->d()Lei/j;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    if-nez v1, :cond_4

    .line 52
    .line 53
    invoke-virtual {v0}, Lqh/c;->b()Ldi/k1;

    .line 54
    .line 55
    .line 56
    move-result-object v11

    .line 57
    invoke-virtual {v0}, Lqh/c;->n()Ljava/util/Collection;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    new-instance v12, Ljava/util/ArrayList;

    .line 62
    .line 63
    invoke-static {v1, v4}, Lkotlin/collections/h;->t(Ljava/lang/Iterable;I)I

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    invoke-direct {v12, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 68
    .line 69
    .line 70
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-eqz v2, :cond_3

    .line 79
    .line 80
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    check-cast v2, Ldi/g0;

    .line 85
    .line 86
    invoke-virtual {v2}, Ldi/g0;->Q0()Ldi/v1;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    invoke-interface {v12, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_3
    const/4 v13, 0x0

    .line 95
    const/4 v14, 0x4

    .line 96
    const/4 v15, 0x0

    .line 97
    new-instance v1, Lei/j;

    .line 98
    .line 99
    move-object v10, v1

    .line 100
    invoke-direct/range {v10 .. v15}, Lei/j;-><init>(Ldi/k1;Ljava/util/List;Lei/j;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0, v1}, Lqh/c;->f(Lei/j;)V

    .line 104
    .line 105
    .line 106
    :cond_4
    new-instance v1, Lei/i;

    .line 107
    .line 108
    sget-object v7, Lhi/b;->k:Lhi/b;

    .line 109
    .line 110
    invoke-virtual {v0}, Lqh/c;->d()Lei/j;

    .line 111
    .line 112
    .line 113
    move-result-object v8

    .line 114
    invoke-static {v8}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual/range {p1 .. p1}, Ldi/g0;->M0()Ldi/c1;

    .line 118
    .line 119
    .line 120
    move-result-object v10

    .line 121
    invoke-virtual/range {p1 .. p1}, Ldi/g0;->O0()Z

    .line 122
    .line 123
    .line 124
    move-result v11

    .line 125
    const/4 v12, 0x0

    .line 126
    const/16 v13, 0x20

    .line 127
    .line 128
    const/4 v14, 0x0

    .line 129
    move-object v6, v1

    .line 130
    invoke-direct/range {v6 .. v14}, Lei/i;-><init>(Lhi/b;Lei/j;Ldi/v1;Ldi/c1;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 131
    .line 132
    .line 133
    return-object v1

    .line 134
    :cond_5
    instance-of v1, v0, Lrh/p;

    .line 135
    .line 136
    if-eqz v1, :cond_7

    .line 137
    .line 138
    check-cast v0, Lrh/p;

    .line 139
    .line 140
    invoke-virtual {v0}, Lrh/p;->n()Ljava/util/Collection;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    new-instance v1, Ljava/util/ArrayList;

    .line 145
    .line 146
    invoke-static {v0, v4}, Lkotlin/collections/h;->t(Ljava/lang/Iterable;I)I

    .line 147
    .line 148
    .line 149
    move-result v2

    .line 150
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 151
    .line 152
    .line 153
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 158
    .line 159
    .line 160
    move-result v2

    .line 161
    if-eqz v2, :cond_6

    .line 162
    .line 163
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    check-cast v2, Ldi/g0;

    .line 168
    .line 169
    invoke-virtual/range {p1 .. p1}, Ldi/g0;->O0()Z

    .line 170
    .line 171
    .line 172
    move-result v4

    .line 173
    invoke-static {v2, v4}, Ldi/s1;->p(Ldi/g0;Z)Ldi/g0;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    const-string v4, "makeNullableAsSpecified(it, type.isMarkedNullable)"

    .line 178
    .line 179
    invoke-static {v2, v4}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    goto :goto_3

    .line 186
    :cond_6
    new-instance v0, Ldi/f0;

    .line 187
    .line 188
    invoke-direct {v0, v1}, Ldi/f0;-><init>(Ljava/util/Collection;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual/range {p1 .. p1}, Ldi/g0;->M0()Ldi/c1;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    invoke-static {}, Lkotlin/collections/h;->i()Ljava/util/List;

    .line 196
    .line 197
    .line 198
    move-result-object v2

    .line 199
    invoke-virtual/range {p1 .. p1}, Ldi/g0;->p()Lwh/h;

    .line 200
    .line 201
    .line 202
    move-result-object v4

    .line 203
    invoke-static {v1, v0, v2, v3, v4}, Ldi/h0;->k(Ldi/c1;Ldi/g1;Ljava/util/List;ZLwh/h;)Ldi/o0;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    return-object v0

    .line 208
    :cond_7
    instance-of v1, v0, Ldi/f0;

    .line 209
    .line 210
    if-eqz v1, :cond_c

    .line 211
    .line 212
    invoke-virtual/range {p1 .. p1}, Ldi/g0;->O0()Z

    .line 213
    .line 214
    .line 215
    move-result v1

    .line 216
    if-eqz v1, :cond_c

    .line 217
    .line 218
    check-cast v0, Ldi/f0;

    .line 219
    .line 220
    invoke-virtual {v0}, Ldi/f0;->n()Ljava/util/Collection;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    new-instance v6, Ljava/util/ArrayList;

    .line 225
    .line 226
    invoke-static {v1, v4}, Lkotlin/collections/h;->t(Ljava/lang/Iterable;I)I

    .line 227
    .line 228
    .line 229
    move-result v4

    .line 230
    invoke-direct {v6, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 231
    .line 232
    .line 233
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 234
    .line 235
    .line 236
    move-result-object v1

    .line 237
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 238
    .line 239
    .line 240
    move-result v4

    .line 241
    if-eqz v4, :cond_8

    .line 242
    .line 243
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v3

    .line 247
    check-cast v3, Ldi/g0;

    .line 248
    .line 249
    invoke-static {v3}, Lii/a;->u(Ldi/g0;)Ldi/g0;

    .line 250
    .line 251
    .line 252
    move-result-object v3

    .line 253
    invoke-interface {v6, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    move v3, v2

    .line 257
    goto :goto_4

    .line 258
    :cond_8
    if-nez v3, :cond_9

    .line 259
    .line 260
    goto :goto_5

    .line 261
    :cond_9
    invoke-virtual {v0}, Ldi/f0;->e()Ldi/g0;

    .line 262
    .line 263
    .line 264
    move-result-object v1

    .line 265
    if-eqz v1, :cond_a

    .line 266
    .line 267
    invoke-static {v1}, Lii/a;->u(Ldi/g0;)Ldi/g0;

    .line 268
    .line 269
    .line 270
    move-result-object v5

    .line 271
    :cond_a
    new-instance v1, Ldi/f0;

    .line 272
    .line 273
    invoke-direct {v1, v6}, Ldi/f0;-><init>(Ljava/util/Collection;)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {v1, v5}, Ldi/f0;->i(Ldi/g0;)Ldi/f0;

    .line 277
    .line 278
    .line 279
    move-result-object v5

    .line 280
    :goto_5
    if-nez v5, :cond_b

    .line 281
    .line 282
    goto :goto_6

    .line 283
    :cond_b
    move-object v0, v5

    .line 284
    :goto_6
    invoke-virtual {v0}, Ldi/f0;->d()Ldi/o0;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    return-object v0

    .line 289
    :cond_c
    return-object p1
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


# virtual methods
.method public bridge synthetic a(Lhi/i;)Lhi/i;
    .locals 0

    invoke-virtual {p0, p1}, Lei/f;->b(Lhi/i;)Ldi/v1;

    move-result-object p1

    return-object p1
.end method

.method public b(Lhi/i;)Ldi/v1;
    .locals 4

    .line 1
    const-string v0, "type"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p1, Ldi/g0;

    .line 7
    .line 8
    if-eqz v0, :cond_4

    .line 9
    .line 10
    check-cast p1, Ldi/g0;

    .line 11
    .line 12
    invoke-virtual {p1}, Ldi/g0;->Q0()Ldi/v1;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    instance-of v0, p1, Ldi/o0;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    move-object v0, p1

    .line 21
    check-cast v0, Ldi/o0;

    .line 22
    .line 23
    invoke-direct {p0, v0}, Lei/f;->c(Ldi/o0;)Ldi/o0;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    goto :goto_1

    .line 28
    :cond_0
    instance-of v0, p1, Ldi/a0;

    .line 29
    .line 30
    if-eqz v0, :cond_3

    .line 31
    .line 32
    move-object v0, p1

    .line 33
    check-cast v0, Ldi/a0;

    .line 34
    .line 35
    invoke-virtual {v0}, Ldi/a0;->V0()Ldi/o0;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-direct {p0, v1}, Lei/f;->c(Ldi/o0;)Ldi/o0;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v0}, Ldi/a0;->W0()Ldi/o0;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-direct {p0, v2}, Lei/f;->c(Ldi/o0;)Ldi/o0;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-virtual {v0}, Ldi/a0;->V0()Ldi/o0;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    if-ne v1, v3, :cond_2

    .line 56
    .line 57
    invoke-virtual {v0}, Ldi/a0;->W0()Ldi/o0;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    if-eq v2, v0, :cond_1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    move-object v0, p1

    .line 65
    goto :goto_1

    .line 66
    :cond_2
    :goto_0
    invoke-static {v1, v2}, Ldi/h0;->d(Ldi/o0;Ldi/o0;)Ldi/v1;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    :goto_1
    new-instance v1, Lei/f$b;

    .line 71
    .line 72
    invoke-direct {v1, p0}, Lei/f$b;-><init>(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    invoke-static {v0, p1, v1}, Ldi/u1;->c(Ldi/v1;Ldi/g0;Lkotlin/jvm/functions/Function1;)Ldi/v1;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    return-object p1

    .line 80
    :cond_3
    new-instance p1, Llf/q;

    .line 81
    .line 82
    invoke-direct {p1}, Llf/q;-><init>()V

    .line 83
    .line 84
    .line 85
    throw p1

    .line 86
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 87
    .line 88
    const-string v0, "Failed requirement."

    .line 89
    .line 90
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    throw p1
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
