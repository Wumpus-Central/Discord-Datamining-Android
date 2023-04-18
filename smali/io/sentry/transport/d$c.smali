.class final Lio/sentry/transport/d$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/sentry/transport/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "c"
.end annotation


# instance fields
.field private final k:Lio/sentry/q2;

.field private final l:Lio/sentry/v;

.field private final m:Lio/sentry/cache/e;

.field private final n:Lio/sentry/transport/a0;

.field final synthetic o:Lio/sentry/transport/d;


# direct methods
.method constructor <init>(Lio/sentry/transport/d;Lio/sentry/q2;Lio/sentry/v;Lio/sentry/cache/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/sentry/transport/d$c;->o:Lio/sentry/transport/d;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lio/sentry/transport/a0;->a()Lio/sentry/transport/a0;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Lio/sentry/transport/d$c;->n:Lio/sentry/transport/a0;

    .line 11
    .line 12
    const-string p1, "Envelope is required."

    .line 13
    .line 14
    invoke-static {p2, p1}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Lio/sentry/q2;

    .line 19
    .line 20
    iput-object p1, p0, Lio/sentry/transport/d$c;->k:Lio/sentry/q2;

    .line 21
    .line 22
    iput-object p3, p0, Lio/sentry/transport/d$c;->l:Lio/sentry/v;

    .line 23
    .line 24
    const-string p1, "EnvelopeCache is required."

    .line 25
    .line 26
    invoke-static {p4, p1}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    check-cast p1, Lio/sentry/cache/e;

    .line 31
    .line 32
    iput-object p1, p0, Lio/sentry/transport/d$c;->m:Lio/sentry/cache/e;

    .line 33
    .line 34
    return-void
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
.end method

.method public static synthetic a(Lio/sentry/transport/d$c;Lio/sentry/q2;Ljava/lang/Object;Ljava/lang/Class;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lio/sentry/transport/d$c;->n(Lio/sentry/q2;Ljava/lang/Object;Ljava/lang/Class;)V

    return-void
.end method

.method public static synthetic b(Lio/sentry/transport/d$c;Lio/sentry/q2;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/sentry/transport/d$c;->l(Lio/sentry/q2;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic c(Lio/sentry/transport/d$c;Lio/sentry/hints/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/sentry/transport/d$c;->k(Lio/sentry/hints/c;)V

    return-void
.end method

.method public static synthetic d(Lio/sentry/transport/d$c;Ljava/lang/Object;Ljava/lang/Class;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/sentry/transport/d$c;->p(Ljava/lang/Object;Ljava/lang/Class;)V

    return-void
.end method

.method public static synthetic e(Lio/sentry/hints/f;)V
    .locals 0

    invoke-static {p0}, Lio/sentry/transport/d$c;->m(Lio/sentry/hints/f;)V

    return-void
.end method

.method public static synthetic f(Lio/sentry/hints/f;)V
    .locals 0

    invoke-static {p0}, Lio/sentry/transport/d$c;->o(Lio/sentry/hints/f;)V

    return-void
.end method

.method public static synthetic g(Lio/sentry/transport/d$c;Lio/sentry/transport/a0;Lio/sentry/hints/k;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/sentry/transport/d$c;->q(Lio/sentry/transport/a0;Lio/sentry/hints/k;)V

    return-void
.end method

.method static synthetic h(Lio/sentry/transport/d$c;)Lio/sentry/v;
    .locals 0

    iget-object p0, p0, Lio/sentry/transport/d$c;->l:Lio/sentry/v;

    return-object p0
.end method

.method static synthetic i(Lio/sentry/transport/d$c;)Lio/sentry/q2;
    .locals 0

    iget-object p0, p0, Lio/sentry/transport/d$c;->k:Lio/sentry/q2;

    return-object p0
.end method

.method private j()Lio/sentry/transport/a0;
    .locals 7

    .line 1
    iget-object v0, p0, Lio/sentry/transport/d$c;->n:Lio/sentry/transport/a0;

    .line 2
    .line 3
    iget-object v1, p0, Lio/sentry/transport/d$c;->m:Lio/sentry/cache/e;

    .line 4
    .line 5
    iget-object v2, p0, Lio/sentry/transport/d$c;->k:Lio/sentry/q2;

    .line 6
    .line 7
    iget-object v3, p0, Lio/sentry/transport/d$c;->l:Lio/sentry/v;

    .line 8
    .line 9
    invoke-interface {v1, v2, v3}, Lio/sentry/cache/e;->g(Lio/sentry/q2;Lio/sentry/v;)V

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, Lio/sentry/transport/d$c;->l:Lio/sentry/v;

    .line 13
    .line 14
    new-instance v2, Lio/sentry/transport/f;

    .line 15
    .line 16
    invoke-direct {v2, p0}, Lio/sentry/transport/f;-><init>(Lio/sentry/transport/d$c;)V

    .line 17
    .line 18
    .line 19
    const-class v3, Lio/sentry/hints/c;

    .line 20
    .line 21
    invoke-static {v1, v3, v2}, Lio/sentry/util/h;->n(Lio/sentry/v;Ljava/lang/Class;Lio/sentry/util/h$a;)V

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Lio/sentry/transport/d$c;->o:Lio/sentry/transport/d;

    .line 25
    .line 26
    invoke-static {v1}, Lio/sentry/transport/d;->l(Lio/sentry/transport/d;)Lio/sentry/transport/q;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-interface {v1}, Lio/sentry/transport/q;->a()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    const-class v2, Lio/sentry/hints/f;

    .line 35
    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    iget-object v0, p0, Lio/sentry/transport/d$c;->o:Lio/sentry/transport/d;

    .line 39
    .line 40
    invoke-static {v0}, Lio/sentry/transport/d;->k(Lio/sentry/transport/d;)Lio/sentry/o3;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v0}, Lio/sentry/o3;->getClientReportRecorder()Lio/sentry/clientreport/g;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iget-object v1, p0, Lio/sentry/transport/d$c;->k:Lio/sentry/q2;

    .line 49
    .line 50
    invoke-interface {v0, v1}, Lio/sentry/clientreport/g;->c(Lio/sentry/q2;)Lio/sentry/q2;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    :try_start_0
    iget-object v1, p0, Lio/sentry/transport/d$c;->o:Lio/sentry/transport/d;

    .line 55
    .line 56
    invoke-static {v1}, Lio/sentry/transport/d;->p(Lio/sentry/transport/d;)Lio/sentry/transport/n;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-virtual {v1, v0}, Lio/sentry/transport/n;->h(Lio/sentry/q2;)Lio/sentry/transport/a0;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-virtual {v1}, Lio/sentry/transport/a0;->d()Z

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    if-eqz v3, :cond_0

    .line 69
    .line 70
    iget-object v3, p0, Lio/sentry/transport/d$c;->m:Lio/sentry/cache/e;

    .line 71
    .line 72
    iget-object v4, p0, Lio/sentry/transport/d$c;->k:Lio/sentry/q2;

    .line 73
    .line 74
    invoke-interface {v3, v4}, Lio/sentry/cache/e;->c(Lio/sentry/q2;)V

    .line 75
    .line 76
    .line 77
    move-object v0, v1

    .line 78
    goto :goto_0

    .line 79
    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    .line 80
    .line 81
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 82
    .line 83
    .line 84
    const-string v4, "The transport failed to send the envelope with response code "

    .line 85
    .line 86
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1}, Lio/sentry/transport/a0;->c()I

    .line 90
    .line 91
    .line 92
    move-result v4

    .line 93
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    iget-object v4, p0, Lio/sentry/transport/d$c;->o:Lio/sentry/transport/d;

    .line 101
    .line 102
    invoke-static {v4}, Lio/sentry/transport/d;->k(Lio/sentry/transport/d;)Lio/sentry/o3;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    invoke-virtual {v4}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    sget-object v5, Lio/sentry/n3;->ERROR:Lio/sentry/n3;

    .line 111
    .line 112
    const/4 v6, 0x0

    .line 113
    new-array v6, v6, [Ljava/lang/Object;

    .line 114
    .line 115
    invoke-interface {v4, v5, v3, v6}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v1}, Lio/sentry/transport/a0;->c()I

    .line 119
    .line 120
    .line 121
    move-result v4

    .line 122
    const/16 v5, 0x190

    .line 123
    .line 124
    if-lt v4, v5, :cond_1

    .line 125
    .line 126
    invoke-virtual {v1}, Lio/sentry/transport/a0;->c()I

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    const/16 v4, 0x1ad

    .line 131
    .line 132
    if-eq v1, v4, :cond_1

    .line 133
    .line 134
    iget-object v1, p0, Lio/sentry/transport/d$c;->l:Lio/sentry/v;

    .line 135
    .line 136
    new-instance v4, Lio/sentry/transport/g;

    .line 137
    .line 138
    invoke-direct {v4, p0, v0}, Lio/sentry/transport/g;-><init>(Lio/sentry/transport/d$c;Lio/sentry/q2;)V

    .line 139
    .line 140
    .line 141
    invoke-static {v1, v2, v4}, Lio/sentry/util/h;->m(Lio/sentry/v;Ljava/lang/Class;Lio/sentry/util/h$c;)V

    .line 142
    .line 143
    .line 144
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 145
    .line 146
    invoke-direct {v1, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    throw v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 150
    :catch_0
    move-exception v1

    .line 151
    iget-object v3, p0, Lio/sentry/transport/d$c;->l:Lio/sentry/v;

    .line 152
    .line 153
    new-instance v4, Lio/sentry/transport/h;

    .line 154
    .line 155
    invoke-direct {v4}, Lio/sentry/transport/h;-><init>()V

    .line 156
    .line 157
    .line 158
    new-instance v5, Lio/sentry/transport/i;

    .line 159
    .line 160
    invoke-direct {v5, p0, v0}, Lio/sentry/transport/i;-><init>(Lio/sentry/transport/d$c;Lio/sentry/q2;)V

    .line 161
    .line 162
    .line 163
    invoke-static {v3, v2, v4, v5}, Lio/sentry/util/h;->o(Lio/sentry/v;Ljava/lang/Class;Lio/sentry/util/h$a;Lio/sentry/util/h$b;)V

    .line 164
    .line 165
    .line 166
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 167
    .line 168
    const-string v2, "Sending the event failed."

    .line 169
    .line 170
    invoke-direct {v0, v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 171
    .line 172
    .line 173
    throw v0

    .line 174
    :cond_2
    iget-object v1, p0, Lio/sentry/transport/d$c;->l:Lio/sentry/v;

    .line 175
    .line 176
    new-instance v3, Lio/sentry/transport/j;

    .line 177
    .line 178
    invoke-direct {v3}, Lio/sentry/transport/j;-><init>()V

    .line 179
    .line 180
    .line 181
    new-instance v4, Lio/sentry/transport/k;

    .line 182
    .line 183
    invoke-direct {v4, p0}, Lio/sentry/transport/k;-><init>(Lio/sentry/transport/d$c;)V

    .line 184
    .line 185
    .line 186
    invoke-static {v1, v2, v3, v4}, Lio/sentry/util/h;->o(Lio/sentry/v;Ljava/lang/Class;Lio/sentry/util/h$a;Lio/sentry/util/h$b;)V

    .line 187
    .line 188
    .line 189
    :goto_0
    return-object v0
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
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
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
.end method

.method private synthetic k(Lio/sentry/hints/c;)V
    .locals 3

    .line 1
    invoke-interface {p1}, Lio/sentry/hints/c;->a()V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lio/sentry/transport/d$c;->o:Lio/sentry/transport/d;

    .line 5
    .line 6
    invoke-static {p1}, Lio/sentry/transport/d;->k(Lio/sentry/transport/d;)Lio/sentry/o3;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p1}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    sget-object v0, Lio/sentry/n3;->DEBUG:Lio/sentry/n3;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    new-array v1, v1, [Ljava/lang/Object;

    .line 18
    .line 19
    const-string v2, "Disk flush envelope fired"

    .line 20
    .line 21
    invoke-interface {p1, v0, v2, v1}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-void
    .line 25
    .line 26
    .line 27
.end method

.method private synthetic l(Lio/sentry/q2;Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object p2, p0, Lio/sentry/transport/d$c;->o:Lio/sentry/transport/d;

    .line 2
    .line 3
    invoke-static {p2}, Lio/sentry/transport/d;->k(Lio/sentry/transport/d;)Lio/sentry/o3;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    invoke-virtual {p2}, Lio/sentry/o3;->getClientReportRecorder()Lio/sentry/clientreport/g;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    sget-object v0, Lio/sentry/clientreport/e;->NETWORK_ERROR:Lio/sentry/clientreport/e;

    .line 12
    .line 13
    invoke-interface {p2, v0, p1}, Lio/sentry/clientreport/g;->b(Lio/sentry/clientreport/e;Lio/sentry/q2;)V

    .line 14
    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
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
.end method

.method private static synthetic m(Lio/sentry/hints/f;)V
    .locals 1

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lio/sentry/hints/f;->c(Z)V

    return-void
.end method

.method private synthetic n(Lio/sentry/q2;Ljava/lang/Object;Ljava/lang/Class;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/transport/d$c;->o:Lio/sentry/transport/d;

    .line 2
    .line 3
    invoke-static {v0}, Lio/sentry/transport/d;->k(Lio/sentry/transport/d;)Lio/sentry/o3;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {p3, p2, v0}, Lio/sentry/util/j;->a(Ljava/lang/Class;Ljava/lang/Object;Lio/sentry/g0;)V

    .line 12
    .line 13
    .line 14
    iget-object p2, p0, Lio/sentry/transport/d$c;->o:Lio/sentry/transport/d;

    .line 15
    .line 16
    invoke-static {p2}, Lio/sentry/transport/d;->k(Lio/sentry/transport/d;)Lio/sentry/o3;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    invoke-virtual {p2}, Lio/sentry/o3;->getClientReportRecorder()Lio/sentry/clientreport/g;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    sget-object p3, Lio/sentry/clientreport/e;->NETWORK_ERROR:Lio/sentry/clientreport/e;

    .line 25
    .line 26
    invoke-interface {p2, p3, p1}, Lio/sentry/clientreport/g;->b(Lio/sentry/clientreport/e;Lio/sentry/q2;)V

    .line 27
    .line 28
    .line 29
    return-void
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
.end method

.method private static synthetic o(Lio/sentry/hints/f;)V
    .locals 1

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lio/sentry/hints/f;->c(Z)V

    return-void
.end method

.method private synthetic p(Ljava/lang/Object;Ljava/lang/Class;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/transport/d$c;->o:Lio/sentry/transport/d;

    .line 2
    .line 3
    invoke-static {v0}, Lio/sentry/transport/d;->k(Lio/sentry/transport/d;)Lio/sentry/o3;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {p2, p1, v0}, Lio/sentry/util/j;->a(Ljava/lang/Class;Ljava/lang/Object;Lio/sentry/g0;)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lio/sentry/transport/d$c;->o:Lio/sentry/transport/d;

    .line 15
    .line 16
    invoke-static {p1}, Lio/sentry/transport/d;->k(Lio/sentry/transport/d;)Lio/sentry/o3;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p1}, Lio/sentry/o3;->getClientReportRecorder()Lio/sentry/clientreport/g;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    sget-object p2, Lio/sentry/clientreport/e;->NETWORK_ERROR:Lio/sentry/clientreport/e;

    .line 25
    .line 26
    iget-object v0, p0, Lio/sentry/transport/d$c;->k:Lio/sentry/q2;

    .line 27
    .line 28
    invoke-interface {p1, p2, v0}, Lio/sentry/clientreport/g;->b(Lio/sentry/clientreport/e;Lio/sentry/q2;)V

    .line 29
    .line 30
    .line 31
    return-void
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
.end method

.method private synthetic q(Lio/sentry/transport/a0;Lio/sentry/hints/k;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lio/sentry/transport/d$c;->o:Lio/sentry/transport/d;

    .line 2
    .line 3
    invoke-static {v0}, Lio/sentry/transport/d;->k(Lio/sentry/transport/d;)Lio/sentry/o3;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sget-object v1, Lio/sentry/n3;->DEBUG:Lio/sentry/n3;

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    new-array v2, v2, [Ljava/lang/Object;

    .line 15
    .line 16
    invoke-virtual {p1}, Lio/sentry/transport/a0;->d()Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    const/4 v4, 0x0

    .line 25
    aput-object v3, v2, v4

    .line 26
    .line 27
    const-string v3, "Marking envelope submission result: %s"

    .line 28
    .line 29
    invoke-interface {v0, v1, v3, v2}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Lio/sentry/transport/a0;->d()Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    invoke-interface {p2, p1}, Lio/sentry/hints/k;->b(Z)V

    .line 37
    .line 38
    .line 39
    return-void
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
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 1
    const-class v0, Lio/sentry/hints/k;

    .line 2
    .line 3
    iget-object v1, p0, Lio/sentry/transport/d$c;->n:Lio/sentry/transport/a0;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    :try_start_0
    invoke-direct {p0}, Lio/sentry/transport/d$c;->j()Lio/sentry/transport/a0;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    iget-object v3, p0, Lio/sentry/transport/d$c;->o:Lio/sentry/transport/d;

    .line 11
    .line 12
    invoke-static {v3}, Lio/sentry/transport/d;->k(Lio/sentry/transport/d;)Lio/sentry/o3;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    invoke-virtual {v3}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    sget-object v4, Lio/sentry/n3;->DEBUG:Lio/sentry/n3;

    .line 21
    .line 22
    const-string v5, "Envelope flushed"

    .line 23
    .line 24
    new-array v6, v2, [Ljava/lang/Object;

    .line 25
    .line 26
    invoke-interface {v3, v4, v5, v6}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    .line 29
    iget-object v2, p0, Lio/sentry/transport/d$c;->l:Lio/sentry/v;

    .line 30
    .line 31
    new-instance v3, Lio/sentry/transport/e;

    .line 32
    .line 33
    invoke-direct {v3, p0, v1}, Lio/sentry/transport/e;-><init>(Lio/sentry/transport/d$c;Lio/sentry/transport/a0;)V

    .line 34
    .line 35
    .line 36
    invoke-static {v2, v0, v3}, Lio/sentry/util/h;->n(Lio/sentry/v;Ljava/lang/Class;Lio/sentry/util/h$a;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :catchall_0
    move-exception v3

    .line 41
    :try_start_1
    iget-object v4, p0, Lio/sentry/transport/d$c;->o:Lio/sentry/transport/d;

    .line 42
    .line 43
    invoke-static {v4}, Lio/sentry/transport/d;->k(Lio/sentry/transport/d;)Lio/sentry/o3;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    invoke-virtual {v4}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    sget-object v5, Lio/sentry/n3;->ERROR:Lio/sentry/n3;

    .line 52
    .line 53
    const-string v6, "Envelope submission failed"

    .line 54
    .line 55
    new-array v2, v2, [Ljava/lang/Object;

    .line 56
    .line 57
    invoke-interface {v4, v5, v3, v6, v2}, Lio/sentry/g0;->a(Lio/sentry/n3;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    throw v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 61
    :catchall_1
    move-exception v2

    .line 62
    iget-object v3, p0, Lio/sentry/transport/d$c;->l:Lio/sentry/v;

    .line 63
    .line 64
    new-instance v4, Lio/sentry/transport/e;

    .line 65
    .line 66
    invoke-direct {v4, p0, v1}, Lio/sentry/transport/e;-><init>(Lio/sentry/transport/d$c;Lio/sentry/transport/a0;)V

    .line 67
    .line 68
    .line 69
    invoke-static {v3, v0, v4}, Lio/sentry/util/h;->n(Lio/sentry/v;Ljava/lang/Class;Lio/sentry/util/h$a;)V

    .line 70
    .line 71
    .line 72
    throw v2
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
.end method
