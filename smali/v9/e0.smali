.class public final Lv9/e0;
.super Lab/d;
.source "SourceFile"

# interfaces
.implements Lu9/f$a;
.implements Lu9/f$b;


# static fields
.field private static final h:Lu9/a$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lu9/a$a<",
            "+",
            "Lza/f;",
            "Lza/a;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Landroid/os/Handler;

.field private final c:Lu9/a$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lu9/a$a<",
            "+",
            "Lza/f;",
            "Lza/a;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/google/android/gms/common/api/Scope;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Lw9/d;

.field private f:Lza/f;

.field private g:Lv9/d0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lza/e;->c:Lu9/a$a;

    sput-object v0, Lv9/e0;->h:Lu9/a$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;Lw9/d;)V
    .locals 1

    .line 1
    sget-object v0, Lv9/e0;->h:Lu9/a$a;

    .line 2
    .line 3
    invoke-direct {p0}, Lab/d;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lv9/e0;->a:Landroid/content/Context;

    .line 7
    .line 8
    iput-object p2, p0, Lv9/e0;->b:Landroid/os/Handler;

    .line 9
    .line 10
    const-string p1, "ClientSettings must not be null"

    .line 11
    .line 12
    invoke-static {p3, p1}, Lw9/p;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, Lw9/d;

    .line 17
    .line 18
    iput-object p1, p0, Lv9/e0;->e:Lw9/d;

    .line 19
    .line 20
    invoke-virtual {p3}, Lw9/d;->g()Ljava/util/Set;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iput-object p1, p0, Lv9/e0;->d:Ljava/util/Set;

    .line 25
    .line 26
    iput-object v0, p0, Lv9/e0;->c:Lu9/a$a;

    .line 27
    .line 28
    return-void
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
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
.end method

.method static bridge synthetic f0(Lv9/e0;)Lv9/d0;
    .locals 0

    iget-object p0, p0, Lv9/e0;->g:Lv9/d0;

    return-object p0
.end method

.method static bridge synthetic g0(Lv9/e0;Lab/l;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Lab/l;->v()Lt9/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lt9/a;->I()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    invoke-virtual {p1}, Lab/l;->z()Lw9/q0;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {p1}, Lw9/p;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, Lw9/q0;

    .line 20
    .line 21
    invoke-virtual {p1}, Lw9/q0;->v()Lt9/a;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Lt9/a;->I()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-nez v1, :cond_0

    .line 30
    .line 31
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    new-instance v1, Ljava/lang/Exception;

    .line 36
    .line 37
    invoke-direct {v1}, Ljava/lang/Exception;-><init>()V

    .line 38
    .line 39
    .line 40
    const-string v2, "Sign-in succeeded with resolve account failure: "

    .line 41
    .line 42
    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    const-string v2, "SignInCoordinator"

    .line 47
    .line 48
    invoke-static {v2, p1, v1}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 49
    .line 50
    .line 51
    iget-object p1, p0, Lv9/e0;->g:Lv9/d0;

    .line 52
    .line 53
    invoke-interface {p1, v0}, Lv9/d0;->b(Lt9/a;)V

    .line 54
    .line 55
    .line 56
    iget-object p0, p0, Lv9/e0;->f:Lza/f;

    .line 57
    .line 58
    invoke-interface {p0}, Lu9/a$f;->g()V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_0
    iget-object v0, p0, Lv9/e0;->g:Lv9/d0;

    .line 63
    .line 64
    invoke-virtual {p1}, Lw9/q0;->z()Lw9/j;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    iget-object v1, p0, Lv9/e0;->d:Ljava/util/Set;

    .line 69
    .line 70
    invoke-interface {v0, p1, v1}, Lv9/d0;->a(Lw9/j;Ljava/util/Set;)V

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_1
    iget-object p1, p0, Lv9/e0;->g:Lv9/d0;

    .line 75
    .line 76
    invoke-interface {p1, v0}, Lv9/d0;->b(Lt9/a;)V

    .line 77
    .line 78
    .line 79
    :goto_0
    iget-object p0, p0, Lv9/e0;->f:Lza/f;

    .line 80
    .line 81
    invoke-interface {p0}, Lu9/a$f;->g()V

    .line 82
    .line 83
    .line 84
    return-void
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
.end method


# virtual methods
.method public final b(Lt9/a;)V
    .locals 1

    iget-object v0, p0, Lv9/e0;->g:Lv9/d0;

    invoke-interface {v0, p1}, Lv9/d0;->b(Lt9/a;)V

    return-void
.end method

.method public final d(I)V
    .locals 0

    iget-object p1, p0, Lv9/e0;->f:Lza/f;

    invoke-interface {p1}, Lu9/a$f;->g()V

    return-void
.end method

.method public final e(Landroid/os/Bundle;)V
    .locals 0

    iget-object p1, p0, Lv9/e0;->f:Lza/f;

    invoke-interface {p1, p0}, Lza/f;->j(Lab/f;)V

    return-void
.end method

.method public final h0(Lv9/d0;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lv9/e0;->f:Lza/f;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lu9/a$f;->g()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lv9/e0;->e:Lw9/d;

    .line 9
    .line 10
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v0, v1}, Lw9/d;->k(Ljava/lang/Integer;)V

    .line 19
    .line 20
    .line 21
    iget-object v2, p0, Lv9/e0;->c:Lu9/a$a;

    .line 22
    .line 23
    iget-object v3, p0, Lv9/e0;->a:Landroid/content/Context;

    .line 24
    .line 25
    iget-object v0, p0, Lv9/e0;->b:Landroid/os/Handler;

    .line 26
    .line 27
    invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    iget-object v5, p0, Lv9/e0;->e:Lw9/d;

    .line 32
    .line 33
    invoke-virtual {v5}, Lw9/d;->h()Lza/a;

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    move-object v7, p0

    .line 38
    move-object v8, p0

    .line 39
    invoke-virtual/range {v2 .. v8}, Lu9/a$a;->a(Landroid/content/Context;Landroid/os/Looper;Lw9/d;Ljava/lang/Object;Lu9/f$a;Lu9/f$b;)Lu9/a$f;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iput-object v0, p0, Lv9/e0;->f:Lza/f;

    .line 44
    .line 45
    iput-object p1, p0, Lv9/e0;->g:Lv9/d0;

    .line 46
    .line 47
    iget-object p1, p0, Lv9/e0;->d:Ljava/util/Set;

    .line 48
    .line 49
    if-eqz p1, :cond_2

    .line 50
    .line 51
    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    if-eqz p1, :cond_1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    iget-object p1, p0, Lv9/e0;->f:Lza/f;

    .line 59
    .line 60
    invoke-interface {p1}, Lza/f;->p()V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :cond_2
    :goto_0
    iget-object p1, p0, Lv9/e0;->b:Landroid/os/Handler;

    .line 65
    .line 66
    new-instance v0, Lv9/b0;

    .line 67
    .line 68
    invoke-direct {v0, p0}, Lv9/b0;-><init>(Lv9/e0;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 72
    .line 73
    .line 74
    return-void
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
.end method

.method public final i0()V
    .locals 1

    iget-object v0, p0, Lv9/e0;->f:Lza/f;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lu9/a$f;->g()V

    :cond_0
    return-void
.end method

.method public final k(Lab/l;)V
    .locals 2

    iget-object v0, p0, Lv9/e0;->b:Landroid/os/Handler;

    new-instance v1, Lv9/c0;

    invoke-direct {v1, p0, p1}, Lv9/c0;-><init>(Lv9/e0;Lab/l;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
