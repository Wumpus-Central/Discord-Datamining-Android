.class public abstract Ldh/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldh/a$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<TAnnotation:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final B(Ldh/i;Ldh/i;)Ldh/i;
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-object p2

    .line 4
    :cond_0
    if-nez p2, :cond_1

    .line 5
    .line 6
    return-object p1

    .line 7
    :cond_1
    invoke-virtual {p1}, Ldh/i;->d()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    invoke-virtual {p2}, Ldh/i;->d()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_2

    .line 18
    .line 19
    return-object p2

    .line 20
    :cond_2
    invoke-virtual {p1}, Ldh/i;->d()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_3

    .line 25
    .line 26
    invoke-virtual {p2}, Ldh/i;->d()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_3

    .line 31
    .line 32
    return-object p1

    .line 33
    :cond_3
    invoke-virtual {p1}, Ldh/i;->c()Ldh/h;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {p2}, Ldh/i;->c()Ldh/h;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-gez v0, :cond_4

    .line 46
    .line 47
    return-object p2

    .line 48
    :cond_4
    invoke-virtual {p1}, Ldh/i;->c()Ldh/h;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {p2}, Ldh/i;->c()Ldh/h;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {v0, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-lez v0, :cond_5

    .line 61
    .line 62
    return-object p1

    .line 63
    :cond_5
    return-object p2
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

.method private final C(Lhi/i;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhi/i;",
            ")",
            "Ljava/util/List<",
            "Ldh/a$a;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ldh/a;->v()Lhi/p;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ldh/a$a;

    .line 6
    .line 7
    invoke-virtual {p0}, Ldh/a;->m()Lvg/y;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-direct {p0, p1, v2}, Ldh/a;->c(Lhi/i;Lvg/y;)Lvg/y;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    const/4 v3, 0x0

    .line 16
    invoke-direct {v1, p1, v2, v3}, Ldh/a$a;-><init>(Lhi/i;Lvg/y;Lhi/o;)V

    .line 17
    .line 18
    .line 19
    new-instance p1, Ldh/a$d;

    .line 20
    .line 21
    invoke-direct {p1, p0, v0}, Ldh/a$d;-><init>(Ldh/a;Lhi/p;)V

    .line 22
    .line 23
    .line 24
    invoke-direct {p0, v1, p1}, Ldh/a;->f(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    return-object p1
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
.end method

.method public static final synthetic a(Ldh/a;Lhi/i;Lvg/y;)Lvg/y;
    .locals 0

    invoke-direct {p0, p1, p2}, Ldh/a;->c(Lhi/i;Lvg/y;)Lvg/y;

    move-result-object p0

    return-object p0
.end method

.method private final c(Lhi/i;Lvg/y;)Lvg/y;
    .locals 1

    invoke-virtual {p0}, Ldh/a;->h()Lvg/a;

    move-result-object v0

    invoke-virtual {p0, p1}, Ldh/a;->i(Lhi/i;)Ljava/lang/Iterable;

    move-result-object p1

    invoke-virtual {v0, p2, p1}, Lvg/a;->c(Lvg/y;Ljava/lang/Iterable;)Lvg/y;

    move-result-object p1

    return-object p1
.end method

.method private final d(Lhi/i;)Ldh/e;
    .locals 6

    .line 1
    invoke-direct {p0, p1}, Ldh/a;->t(Lhi/i;)Ldh/h;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Ldh/a;->p(Lhi/i;)Lhi/i;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    invoke-direct {p0, v2}, Ldh/a;->t(Lhi/i;)Ldh/h;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move-object v2, v1

    .line 20
    goto :goto_0

    .line 21
    :cond_1
    move-object v2, v0

    .line 22
    :goto_0
    invoke-virtual {p0}, Ldh/a;->v()Lhi/p;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    sget-object v4, Llg/c;->a:Llg/c;

    .line 27
    .line 28
    invoke-interface {v3, p1}, Lhi/p;->Q(Lhi/i;)Lhi/k;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    invoke-virtual {p0, v5}, Ldh/a;->s(Lhi/i;)Llh/d;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    invoke-virtual {v4, v5}, Llg/c;->l(Llh/d;)Z

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    if-eqz v5, :cond_2

    .line 41
    .line 42
    sget-object v1, Ldh/f;->k:Ldh/f;

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_2
    invoke-interface {v3, p1}, Lhi/p;->G(Lhi/i;)Lhi/k;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-virtual {p0, v3}, Ldh/a;->s(Lhi/i;)Llh/d;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-virtual {v4, v3}, Llg/c;->k(Llh/d;)Z

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-eqz v3, :cond_3

    .line 58
    .line 59
    sget-object v1, Ldh/f;->l:Ldh/f;

    .line 60
    .line 61
    :cond_3
    :goto_1
    invoke-virtual {p0}, Ldh/a;->v()Lhi/p;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    invoke-interface {v3, p1}, Lhi/p;->q(Lhi/i;)Z

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    const/4 v4, 0x0

    .line 70
    const/4 v5, 0x1

    .line 71
    if-nez v3, :cond_5

    .line 72
    .line 73
    invoke-virtual {p0, p1}, Ldh/a;->A(Lhi/i;)Z

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    if-eqz p1, :cond_4

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_4
    move p1, v4

    .line 81
    goto :goto_3

    .line 82
    :cond_5
    :goto_2
    move p1, v5

    .line 83
    :goto_3
    new-instance v3, Ldh/e;

    .line 84
    .line 85
    if-eq v2, v0, :cond_6

    .line 86
    .line 87
    move v4, v5

    .line 88
    :cond_6
    invoke-direct {v3, v2, v1, p1, v4}, Ldh/e;-><init>(Ldh/h;Ldh/f;ZZ)V

    .line 89
    .line 90
    .line 91
    return-object v3
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

.method private final e(Ldh/a$a;)Ldh/e;
    .locals 11

    .line 1
    invoke-virtual {p1}, Ldh/a$a;->b()Lhi/i;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    invoke-virtual {p0}, Ldh/a;->v()Lhi/p;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p1}, Ldh/a$a;->c()Lhi/o;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    invoke-interface {v0, v2}, Lhi/p;->e0(Lhi/o;)Lhi/u;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move-object v0, v1

    .line 24
    :goto_0
    sget-object v2, Lhi/u;->l:Lhi/u;

    .line 25
    .line 26
    if-ne v0, v2, :cond_1

    .line 27
    .line 28
    sget-object p1, Ldh/e;->e:Ldh/e$a;

    .line 29
    .line 30
    invoke-virtual {p1}, Ldh/e$a;->a()Ldh/e;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    return-object p1

    .line 35
    :cond_1
    invoke-virtual {p1}, Ldh/a$a;->c()Lhi/o;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    const/4 v2, 0x1

    .line 40
    const/4 v3, 0x0

    .line 41
    if-nez v0, :cond_2

    .line 42
    .line 43
    move v0, v2

    .line 44
    goto :goto_1

    .line 45
    :cond_2
    move v0, v3

    .line 46
    :goto_1
    invoke-virtual {p1}, Ldh/a$a;->b()Lhi/i;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    if-eqz v4, :cond_3

    .line 51
    .line 52
    invoke-virtual {p0, v4}, Ldh/a;->i(Lhi/i;)Ljava/lang/Iterable;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    if-nez v4, :cond_4

    .line 57
    .line 58
    :cond_3
    invoke-static {}, Lkotlin/collections/h;->i()Ljava/util/List;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    :cond_4
    invoke-virtual {p0}, Ldh/a;->v()Lhi/p;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    invoke-virtual {p1}, Ldh/a$a;->b()Lhi/i;

    .line 67
    .line 68
    .line 69
    move-result-object v6

    .line 70
    if-eqz v6, :cond_5

    .line 71
    .line 72
    invoke-interface {v5, v6}, Lhi/p;->C0(Lhi/i;)Lhi/n;

    .line 73
    .line 74
    .line 75
    move-result-object v6

    .line 76
    if-eqz v6, :cond_5

    .line 77
    .line 78
    invoke-interface {v5, v6}, Lhi/p;->D(Lhi/n;)Lhi/o;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    goto :goto_2

    .line 83
    :cond_5
    move-object v5, v1

    .line 84
    :goto_2
    invoke-virtual {p0}, Ldh/a;->l()Lvg/b;

    .line 85
    .line 86
    .line 87
    move-result-object v6

    .line 88
    sget-object v7, Lvg/b;->p:Lvg/b;

    .line 89
    .line 90
    if-ne v6, v7, :cond_6

    .line 91
    .line 92
    move v6, v2

    .line 93
    goto :goto_3

    .line 94
    :cond_6
    move v6, v3

    .line 95
    :goto_3
    if-nez v0, :cond_7

    .line 96
    .line 97
    goto :goto_6

    .line 98
    :cond_7
    if-nez v6, :cond_b

    .line 99
    .line 100
    invoke-virtual {p0}, Ldh/a;->o()Z

    .line 101
    .line 102
    .line 103
    move-result v7

    .line 104
    if-eqz v7, :cond_b

    .line 105
    .line 106
    invoke-virtual {p1}, Ldh/a$a;->b()Lhi/i;

    .line 107
    .line 108
    .line 109
    move-result-object v7

    .line 110
    if-eqz v7, :cond_8

    .line 111
    .line 112
    invoke-virtual {p0, v7}, Ldh/a;->w(Lhi/i;)Z

    .line 113
    .line 114
    .line 115
    move-result v7

    .line 116
    if-ne v7, v2, :cond_8

    .line 117
    .line 118
    move v7, v2

    .line 119
    goto :goto_4

    .line 120
    :cond_8
    move v7, v3

    .line 121
    :goto_4
    if-eqz v7, :cond_b

    .line 122
    .line 123
    invoke-virtual {p0}, Ldh/a;->k()Ljava/lang/Iterable;

    .line 124
    .line 125
    .line 126
    move-result-object v7

    .line 127
    new-instance v8, Ljava/util/ArrayList;

    .line 128
    .line 129
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 130
    .line 131
    .line 132
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 133
    .line 134
    .line 135
    move-result-object v7

    .line 136
    :cond_9
    :goto_5
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 137
    .line 138
    .line 139
    move-result v9

    .line 140
    if-eqz v9, :cond_a

    .line 141
    .line 142
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v9

    .line 146
    invoke-virtual {p0}, Ldh/a;->h()Lvg/a;

    .line 147
    .line 148
    .line 149
    move-result-object v10

    .line 150
    invoke-virtual {v10, v9}, Lvg/a;->m(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    move-result v10

    .line 154
    xor-int/2addr v10, v2

    .line 155
    if-eqz v10, :cond_9

    .line 156
    .line 157
    invoke-interface {v8, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    goto :goto_5

    .line 161
    :cond_a
    invoke-static {v8, v4}, Lkotlin/collections/h;->o0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    .line 162
    .line 163
    .line 164
    move-result-object v4

    .line 165
    goto :goto_6

    .line 166
    :cond_b
    invoke-virtual {p0}, Ldh/a;->k()Ljava/lang/Iterable;

    .line 167
    .line 168
    .line 169
    move-result-object v7

    .line 170
    invoke-static {v7, v4}, Lkotlin/collections/h;->m0(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/List;

    .line 171
    .line 172
    .line 173
    move-result-object v4

    .line 174
    :goto_6
    invoke-virtual {p0}, Ldh/a;->h()Lvg/a;

    .line 175
    .line 176
    .line 177
    move-result-object v7

    .line 178
    invoke-virtual {v7, v4}, Lvg/a;->e(Ljava/lang/Iterable;)Ldh/f;

    .line 179
    .line 180
    .line 181
    move-result-object v7

    .line 182
    invoke-virtual {p0}, Ldh/a;->h()Lvg/a;

    .line 183
    .line 184
    .line 185
    move-result-object v8

    .line 186
    new-instance v9, Ldh/a$c;

    .line 187
    .line 188
    invoke-direct {v9, p0}, Ldh/a$c;-><init>(Ldh/a;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v8, v4, v9}, Lvg/a;->f(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function1;)Ldh/i;

    .line 192
    .line 193
    .line 194
    move-result-object v4

    .line 195
    if-eqz v4, :cond_d

    .line 196
    .line 197
    new-instance p1, Ldh/e;

    .line 198
    .line 199
    invoke-virtual {v4}, Ldh/i;->c()Ldh/h;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    invoke-virtual {v4}, Ldh/i;->c()Ldh/h;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    sget-object v6, Ldh/h;->m:Ldh/h;

    .line 208
    .line 209
    if-ne v1, v6, :cond_c

    .line 210
    .line 211
    if-eqz v5, :cond_c

    .line 212
    .line 213
    goto :goto_7

    .line 214
    :cond_c
    move v2, v3

    .line 215
    :goto_7
    invoke-virtual {v4}, Ldh/i;->d()Z

    .line 216
    .line 217
    .line 218
    move-result v1

    .line 219
    invoke-direct {p1, v0, v7, v2, v1}, Ldh/e;-><init>(Ldh/h;Ldh/f;ZZ)V

    .line 220
    .line 221
    .line 222
    return-object p1

    .line 223
    :cond_d
    if-nez v0, :cond_f

    .line 224
    .line 225
    if-eqz v6, :cond_e

    .line 226
    .line 227
    goto :goto_8

    .line 228
    :cond_e
    sget-object v0, Lvg/b;->o:Lvg/b;

    .line 229
    .line 230
    goto :goto_9

    .line 231
    :cond_f
    :goto_8
    invoke-virtual {p0}, Ldh/a;->l()Lvg/b;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    :goto_9
    invoke-virtual {p1}, Ldh/a$a;->a()Lvg/y;

    .line 236
    .line 237
    .line 238
    move-result-object v4

    .line 239
    if-eqz v4, :cond_10

    .line 240
    .line 241
    invoke-virtual {v4, v0}, Lvg/y;->a(Lvg/b;)Lvg/r;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    goto :goto_a

    .line 246
    :cond_10
    move-object v0, v1

    .line 247
    :goto_a
    if-eqz v5, :cond_11

    .line 248
    .line 249
    invoke-direct {p0, v5}, Ldh/a;->j(Lhi/o;)Ldh/i;

    .line 250
    .line 251
    .line 252
    move-result-object v4

    .line 253
    goto :goto_b

    .line 254
    :cond_11
    move-object v4, v1

    .line 255
    :goto_b
    const/4 v6, 0x2

    .line 256
    if-eqz v4, :cond_12

    .line 257
    .line 258
    sget-object v8, Ldh/h;->m:Ldh/h;

    .line 259
    .line 260
    invoke-static {v4, v8, v3, v6, v1}, Ldh/i;->b(Ldh/i;Ldh/h;ZILjava/lang/Object;)Ldh/i;

    .line 261
    .line 262
    .line 263
    move-result-object v8

    .line 264
    if-nez v8, :cond_14

    .line 265
    .line 266
    :cond_12
    if-eqz v0, :cond_13

    .line 267
    .line 268
    invoke-virtual {v0}, Lvg/r;->d()Ldh/i;

    .line 269
    .line 270
    .line 271
    move-result-object v8

    .line 272
    goto :goto_c

    .line 273
    :cond_13
    move-object v8, v1

    .line 274
    :cond_14
    :goto_c
    if-eqz v4, :cond_15

    .line 275
    .line 276
    invoke-virtual {v4}, Ldh/i;->c()Ldh/h;

    .line 277
    .line 278
    .line 279
    move-result-object v4

    .line 280
    goto :goto_d

    .line 281
    :cond_15
    move-object v4, v1

    .line 282
    :goto_d
    sget-object v9, Ldh/h;->m:Ldh/h;

    .line 283
    .line 284
    if-eq v4, v9, :cond_18

    .line 285
    .line 286
    if-eqz v5, :cond_17

    .line 287
    .line 288
    if-eqz v0, :cond_16

    .line 289
    .line 290
    invoke-virtual {v0}, Lvg/r;->c()Z

    .line 291
    .line 292
    .line 293
    move-result v0

    .line 294
    if-ne v0, v2, :cond_16

    .line 295
    .line 296
    move v0, v2

    .line 297
    goto :goto_e

    .line 298
    :cond_16
    move v0, v3

    .line 299
    :goto_e
    if-eqz v0, :cond_17

    .line 300
    .line 301
    goto :goto_f

    .line 302
    :cond_17
    move v0, v3

    .line 303
    goto :goto_10

    .line 304
    :cond_18
    :goto_f
    move v0, v2

    .line 305
    :goto_10
    invoke-virtual {p1}, Ldh/a$a;->c()Lhi/o;

    .line 306
    .line 307
    .line 308
    move-result-object p1

    .line 309
    if-eqz p1, :cond_19

    .line 310
    .line 311
    invoke-direct {p0, p1}, Ldh/a;->j(Lhi/o;)Ldh/i;

    .line 312
    .line 313
    .line 314
    move-result-object p1

    .line 315
    if-eqz p1, :cond_19

    .line 316
    .line 317
    invoke-virtual {p1}, Ldh/i;->c()Ldh/h;

    .line 318
    .line 319
    .line 320
    move-result-object v4

    .line 321
    sget-object v5, Ldh/h;->l:Ldh/h;

    .line 322
    .line 323
    if-ne v4, v5, :cond_1a

    .line 324
    .line 325
    sget-object v4, Ldh/h;->k:Ldh/h;

    .line 326
    .line 327
    invoke-static {p1, v4, v3, v6, v1}, Ldh/i;->b(Ldh/i;Ldh/h;ZILjava/lang/Object;)Ldh/i;

    .line 328
    .line 329
    .line 330
    move-result-object p1

    .line 331
    goto :goto_11

    .line 332
    :cond_19
    move-object p1, v1

    .line 333
    :cond_1a
    :goto_11
    invoke-direct {p0, p1, v8}, Ldh/a;->B(Ldh/i;Ldh/i;)Ldh/i;

    .line 334
    .line 335
    .line 336
    move-result-object p1

    .line 337
    new-instance v4, Ldh/e;

    .line 338
    .line 339
    if-eqz p1, :cond_1b

    .line 340
    .line 341
    invoke-virtual {p1}, Ldh/i;->c()Ldh/h;

    .line 342
    .line 343
    .line 344
    move-result-object v1

    .line 345
    :cond_1b
    if-eqz p1, :cond_1c

    .line 346
    .line 347
    invoke-virtual {p1}, Ldh/i;->d()Z

    .line 348
    .line 349
    .line 350
    move-result p1

    .line 351
    if-ne p1, v2, :cond_1c

    .line 352
    .line 353
    goto :goto_12

    .line 354
    :cond_1c
    move v2, v3

    .line 355
    :goto_12
    invoke-direct {v4, v1, v7, v0, v2}, Ldh/e;-><init>(Ldh/h;Ldh/f;ZZ)V

    .line 356
    .line 357
    .line 358
    return-object v4
    .line 359
    .line 360
    .line 361
.end method

.method private final f(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Lkotlin/jvm/functions/Function1<",
            "-TT;+",
            "Ljava/lang/Iterable<",
            "+TT;>;>;)",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-direct {p0, p1, v0, p2}, Ldh/a;->g(Ljava/lang/Object;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V

    return-object v0
.end method

.method private final g(Ljava/lang/Object;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Ljava/util/List<",
            "TT;>;",
            "Lkotlin/jvm/functions/Function1<",
            "-TT;+",
            "Ljava/lang/Iterable<",
            "+TT;>;>;)V"
        }
    .end annotation

    .line 1
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    invoke-interface {p3, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Ljava/lang/Iterable;

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-direct {p0, v0, p2, p3}, Ldh/a;->g(Ljava/lang/Object;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    return-void
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

.method private final j(Lhi/o;)Ldh/i;
    .locals 7

    .line 1
    invoke-virtual {p0}, Ldh/a;->v()Lhi/p;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, p1}, Ldh/a;->z(Lhi/o;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    return-object v2

    .line 13
    :cond_0
    invoke-interface {v0, p1}, Lhi/p;->Y(Lhi/o;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    instance-of v1, p1, Ljava/util/Collection;

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    const/4 v4, 0x1

    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    if-eqz v5, :cond_2

    .line 28
    .line 29
    :cond_1
    move v5, v4

    .line 30
    goto :goto_0

    .line 31
    :cond_2
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    :cond_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    if-eqz v6, :cond_1

    .line 40
    .line 41
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v6

    .line 45
    check-cast v6, Lhi/i;

    .line 46
    .line 47
    invoke-interface {v0, v6}, Lhi/p;->m0(Lhi/i;)Z

    .line 48
    .line 49
    .line 50
    move-result v6

    .line 51
    if-nez v6, :cond_3

    .line 52
    .line 53
    move v5, v3

    .line 54
    :goto_0
    if-eqz v5, :cond_4

    .line 55
    .line 56
    return-object v2

    .line 57
    :cond_4
    if-eqz v1, :cond_6

    .line 58
    .line 59
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    if-eqz v5, :cond_6

    .line 64
    .line 65
    :cond_5
    move v5, v3

    .line 66
    goto :goto_2

    .line 67
    :cond_6
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    :cond_7
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 72
    .line 73
    .line 74
    move-result v6

    .line 75
    if-eqz v6, :cond_5

    .line 76
    .line 77
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v6

    .line 81
    check-cast v6, Lhi/i;

    .line 82
    .line 83
    invoke-direct {p0, v6}, Ldh/a;->t(Lhi/i;)Ldh/h;

    .line 84
    .line 85
    .line 86
    move-result-object v6

    .line 87
    if-eqz v6, :cond_8

    .line 88
    .line 89
    move v6, v4

    .line 90
    goto :goto_1

    .line 91
    :cond_8
    move v6, v3

    .line 92
    :goto_1
    if-eqz v6, :cond_7

    .line 93
    .line 94
    move v5, v4

    .line 95
    :goto_2
    if-eqz v5, :cond_9

    .line 96
    .line 97
    move-object v1, p1

    .line 98
    goto :goto_6

    .line 99
    :cond_9
    if-eqz v1, :cond_b

    .line 100
    .line 101
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    if-eqz v1, :cond_b

    .line 106
    .line 107
    :cond_a
    move v1, v3

    .line 108
    goto :goto_4

    .line 109
    :cond_b
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    :cond_c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 114
    .line 115
    .line 116
    move-result v5

    .line 117
    if-eqz v5, :cond_a

    .line 118
    .line 119
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v5

    .line 123
    check-cast v5, Lhi/i;

    .line 124
    .line 125
    invoke-virtual {p0, v5}, Ldh/a;->p(Lhi/i;)Lhi/i;

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    if-eqz v5, :cond_d

    .line 130
    .line 131
    move v5, v4

    .line 132
    goto :goto_3

    .line 133
    :cond_d
    move v5, v3

    .line 134
    :goto_3
    if-eqz v5, :cond_c

    .line 135
    .line 136
    move v1, v4

    .line 137
    :goto_4
    if-eqz v1, :cond_15

    .line 138
    .line 139
    new-instance v1, Ljava/util/ArrayList;

    .line 140
    .line 141
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 142
    .line 143
    .line 144
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    :cond_e
    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 149
    .line 150
    .line 151
    move-result v5

    .line 152
    if-eqz v5, :cond_f

    .line 153
    .line 154
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v5

    .line 158
    check-cast v5, Lhi/i;

    .line 159
    .line 160
    invoke-virtual {p0, v5}, Ldh/a;->p(Lhi/i;)Lhi/i;

    .line 161
    .line 162
    .line 163
    move-result-object v5

    .line 164
    if-eqz v5, :cond_e

    .line 165
    .line 166
    invoke-interface {v1, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    goto :goto_5

    .line 170
    :cond_f
    :goto_6
    instance-of v2, v1, Ljava/util/Collection;

    .line 171
    .line 172
    if-eqz v2, :cond_11

    .line 173
    .line 174
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 175
    .line 176
    .line 177
    move-result v2

    .line 178
    if-eqz v2, :cond_11

    .line 179
    .line 180
    :cond_10
    move v0, v4

    .line 181
    goto :goto_7

    .line 182
    :cond_11
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 183
    .line 184
    .line 185
    move-result-object v2

    .line 186
    :cond_12
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 187
    .line 188
    .line 189
    move-result v5

    .line 190
    if-eqz v5, :cond_10

    .line 191
    .line 192
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v5

    .line 196
    check-cast v5, Lhi/i;

    .line 197
    .line 198
    invoke-interface {v0, v5}, Lhi/p;->z(Lhi/i;)Z

    .line 199
    .line 200
    .line 201
    move-result v5

    .line 202
    if-nez v5, :cond_12

    .line 203
    .line 204
    move v0, v3

    .line 205
    :goto_7
    if-eqz v0, :cond_13

    .line 206
    .line 207
    sget-object v0, Ldh/h;->l:Ldh/h;

    .line 208
    .line 209
    goto :goto_8

    .line 210
    :cond_13
    sget-object v0, Ldh/h;->m:Ldh/h;

    .line 211
    .line 212
    :goto_8
    new-instance v2, Ldh/i;

    .line 213
    .line 214
    if-eq v1, p1, :cond_14

    .line 215
    .line 216
    move v3, v4

    .line 217
    :cond_14
    invoke-direct {v2, v0, v3}, Ldh/i;-><init>(Ldh/h;Z)V

    .line 218
    .line 219
    .line 220
    :cond_15
    return-object v2
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

.method private final t(Lhi/i;)Ldh/h;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ldh/a;->v()Lhi/p;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p1}, Lhi/p;->Q(Lhi/i;)Lhi/k;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-interface {v0, v1}, Lhi/p;->v0(Lhi/k;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    sget-object p1, Ldh/h;->l:Ldh/h;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-interface {v0, p1}, Lhi/p;->G(Lhi/i;)Lhi/k;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-interface {v0, p1}, Lhi/p;->v0(Lhi/k;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-nez p1, :cond_1

    .line 27
    .line 28
    sget-object p1, Ldh/h;->m:Ldh/h;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    const/4 p1, 0x0

    .line 32
    :goto_0
    return-object p1
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
.end method


# virtual methods
.method public abstract A(Lhi/i;)Z
.end method

.method public final b(Lhi/i;Ljava/lang/Iterable;Ldh/q;Z)Lkotlin/jvm/functions/Function1;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhi/i;",
            "Ljava/lang/Iterable<",
            "+",
            "Lhi/i;",
            ">;",
            "Ldh/q;",
            "Z)",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Integer;",
            "Ldh/e;",
            ">;"
        }
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "overrides"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p1}, Ldh/a;->C(Lhi/i;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, Ljava/util/ArrayList;

    .line 16
    .line 17
    const/16 v2, 0xa

    .line 18
    .line 19
    invoke-static {p2, v2}, Lkotlin/collections/h;->t(Ljava/lang/Iterable;I)I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 24
    .line 25
    .line 26
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-eqz v3, :cond_0

    .line 35
    .line 36
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    check-cast v3, Lhi/i;

    .line 41
    .line 42
    invoke-direct {p0, v3}, Ldh/a;->C(Lhi/i;)Ljava/util/List;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    invoke-virtual {p0}, Ldh/a;->q()Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    const/4 v3, 0x0

    .line 55
    const/4 v4, 0x1

    .line 56
    if-nez v2, :cond_5

    .line 57
    .line 58
    invoke-virtual {p0}, Ldh/a;->x()Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-eqz v2, :cond_4

    .line 63
    .line 64
    instance-of v2, p2, Ljava/util/Collection;

    .line 65
    .line 66
    if-eqz v2, :cond_2

    .line 67
    .line 68
    move-object v2, p2

    .line 69
    check-cast v2, Ljava/util/Collection;

    .line 70
    .line 71
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    if-eqz v2, :cond_2

    .line 76
    .line 77
    :cond_1
    move p1, v3

    .line 78
    goto :goto_1

    .line 79
    :cond_2
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    :cond_3
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    if-eqz v2, :cond_1

    .line 88
    .line 89
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    check-cast v2, Lhi/i;

    .line 94
    .line 95
    invoke-virtual {p0, p1, v2}, Ldh/a;->y(Lhi/i;Lhi/i;)Z

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    xor-int/2addr v2, v4

    .line 100
    if-eqz v2, :cond_3

    .line 101
    .line 102
    move p1, v4

    .line 103
    :goto_1
    if-eqz p1, :cond_4

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_4
    move p1, v3

    .line 107
    goto :goto_3

    .line 108
    :cond_5
    :goto_2
    move p1, v4

    .line 109
    :goto_3
    if-eqz p1, :cond_6

    .line 110
    .line 111
    move p1, v4

    .line 112
    goto :goto_4

    .line 113
    :cond_6
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 114
    .line 115
    .line 116
    move-result p1

    .line 117
    :goto_4
    new-array p2, p1, [Ldh/e;

    .line 118
    .line 119
    move v2, v3

    .line 120
    :goto_5
    if-ge v2, p1, :cond_c

    .line 121
    .line 122
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v5

    .line 126
    check-cast v5, Ldh/a$a;

    .line 127
    .line 128
    invoke-direct {p0, v5}, Ldh/a;->e(Ldh/a$a;)Ldh/e;

    .line 129
    .line 130
    .line 131
    move-result-object v5

    .line 132
    new-instance v6, Ljava/util/ArrayList;

    .line 133
    .line 134
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 135
    .line 136
    .line 137
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 138
    .line 139
    .line 140
    move-result-object v7

    .line 141
    :cond_7
    :goto_6
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 142
    .line 143
    .line 144
    move-result v8

    .line 145
    if-eqz v8, :cond_9

    .line 146
    .line 147
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v8

    .line 151
    check-cast v8, Ljava/util/List;

    .line 152
    .line 153
    invoke-static {v8, v2}, Lkotlin/collections/h;->X(Ljava/util/List;I)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v8

    .line 157
    check-cast v8, Ldh/a$a;

    .line 158
    .line 159
    if-eqz v8, :cond_8

    .line 160
    .line 161
    invoke-virtual {v8}, Ldh/a$a;->b()Lhi/i;

    .line 162
    .line 163
    .line 164
    move-result-object v8

    .line 165
    if-eqz v8, :cond_8

    .line 166
    .line 167
    invoke-direct {p0, v8}, Ldh/a;->d(Lhi/i;)Ldh/e;

    .line 168
    .line 169
    .line 170
    move-result-object v8

    .line 171
    goto :goto_7

    .line 172
    :cond_8
    const/4 v8, 0x0

    .line 173
    :goto_7
    if-eqz v8, :cond_7

    .line 174
    .line 175
    invoke-interface {v6, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    goto :goto_6

    .line 179
    :cond_9
    if-nez v2, :cond_a

    .line 180
    .line 181
    invoke-virtual {p0}, Ldh/a;->x()Z

    .line 182
    .line 183
    .line 184
    move-result v7

    .line 185
    if-eqz v7, :cond_a

    .line 186
    .line 187
    move v7, v4

    .line 188
    goto :goto_8

    .line 189
    :cond_a
    move v7, v3

    .line 190
    :goto_8
    if-nez v2, :cond_b

    .line 191
    .line 192
    invoke-virtual {p0}, Ldh/a;->n()Z

    .line 193
    .line 194
    .line 195
    move-result v8

    .line 196
    if-eqz v8, :cond_b

    .line 197
    .line 198
    move v8, v4

    .line 199
    goto :goto_9

    .line 200
    :cond_b
    move v8, v3

    .line 201
    :goto_9
    invoke-static {v5, v6, v7, v8, p4}, Ldh/s;->a(Ldh/e;Ljava/util/Collection;ZZZ)Ldh/e;

    .line 202
    .line 203
    .line 204
    move-result-object v5

    .line 205
    aput-object v5, p2, v2

    .line 206
    .line 207
    add-int/lit8 v2, v2, 0x1

    .line 208
    .line 209
    goto :goto_5

    .line 210
    :cond_c
    new-instance p1, Ldh/a$b;

    .line 211
    .line 212
    invoke-direct {p1, p3, p2}, Ldh/a$b;-><init>(Ldh/q;[Ldh/e;)V

    .line 213
    .line 214
    .line 215
    return-object p1
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
.end method

.method public abstract h()Lvg/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lvg/a<",
            "TTAnnotation;>;"
        }
    .end annotation
.end method

.method public abstract i(Lhi/i;)Ljava/lang/Iterable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhi/i;",
            ")",
            "Ljava/lang/Iterable<",
            "TTAnnotation;>;"
        }
    .end annotation
.end method

.method public abstract k()Ljava/lang/Iterable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Iterable<",
            "TTAnnotation;>;"
        }
    .end annotation
.end method

.method public abstract l()Lvg/b;
.end method

.method public abstract m()Lvg/y;
.end method

.method public abstract n()Z
.end method

.method public abstract o()Z
.end method

.method public abstract p(Lhi/i;)Lhi/i;
.end method

.method public q()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public abstract r(Ljava/lang/Object;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TTAnnotation;)Z"
        }
    .end annotation
.end method

.method public abstract s(Lhi/i;)Llh/d;
.end method

.method public abstract u()Z
.end method

.method public abstract v()Lhi/p;
.end method

.method public abstract w(Lhi/i;)Z
.end method

.method public abstract x()Z
.end method

.method public abstract y(Lhi/i;Lhi/i;)Z
.end method

.method public abstract z(Lhi/o;)Z
.end method
