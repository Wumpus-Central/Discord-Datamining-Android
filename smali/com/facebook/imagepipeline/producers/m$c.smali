.class abstract Lcom/facebook/imagepipeline/producers/m$c;
.super Lcom/facebook/imagepipeline/producers/o;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/imagepipeline/producers/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x402
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/imagepipeline/producers/o<",
        "Lu5/e;",
        "Lcom/facebook/common/references/CloseableReference<",
        "Lu5/c;",
        ">;>;"
    }
.end annotation


# instance fields
.field private final c:Ljava/lang/String;

.field private final d:Lcom/facebook/imagepipeline/producers/ProducerContext;

.field private final e:Lcom/facebook/imagepipeline/producers/n0;

.field private final f:Lcom/facebook/imagepipeline/common/ImageDecodeOptions;

.field private g:Z

.field private final h:Lcom/facebook/imagepipeline/producers/y;

.field final synthetic i:Lcom/facebook/imagepipeline/producers/m;


# direct methods
.method public constructor <init>(Lcom/facebook/imagepipeline/producers/m;Lcom/facebook/imagepipeline/producers/Consumer;Lcom/facebook/imagepipeline/producers/ProducerContext;ZI)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/producers/Consumer<",
            "Lcom/facebook/common/references/CloseableReference<",
            "Lu5/c;",
            ">;>;",
            "Lcom/facebook/imagepipeline/producers/ProducerContext;",
            "ZI)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/m$c;->i:Lcom/facebook/imagepipeline/producers/m;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lcom/facebook/imagepipeline/producers/o;-><init>(Lcom/facebook/imagepipeline/producers/Consumer;)V

    .line 4
    .line 5
    .line 6
    const-string p2, "ProgressiveDecoder"

    .line 7
    .line 8
    iput-object p2, p0, Lcom/facebook/imagepipeline/producers/m$c;->c:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p3, p0, Lcom/facebook/imagepipeline/producers/m$c;->d:Lcom/facebook/imagepipeline/producers/ProducerContext;

    .line 11
    .line 12
    invoke-interface {p3}, Lcom/facebook/imagepipeline/producers/ProducerContext;->n()Lcom/facebook/imagepipeline/producers/n0;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    iput-object p2, p0, Lcom/facebook/imagepipeline/producers/m$c;->e:Lcom/facebook/imagepipeline/producers/n0;

    .line 17
    .line 18
    invoke-interface {p3}, Lcom/facebook/imagepipeline/producers/ProducerContext;->d()Lcom/facebook/imagepipeline/request/ImageRequest;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    invoke-virtual {p2}, Lcom/facebook/imagepipeline/request/ImageRequest;->getImageDecodeOptions()Lcom/facebook/imagepipeline/common/ImageDecodeOptions;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    iput-object p2, p0, Lcom/facebook/imagepipeline/producers/m$c;->f:Lcom/facebook/imagepipeline/common/ImageDecodeOptions;

    .line 27
    .line 28
    const/4 v0, 0x0

    .line 29
    iput-boolean v0, p0, Lcom/facebook/imagepipeline/producers/m$c;->g:Z

    .line 30
    .line 31
    new-instance v0, Lcom/facebook/imagepipeline/producers/m$c$a;

    .line 32
    .line 33
    invoke-direct {v0, p0, p1, p3, p5}, Lcom/facebook/imagepipeline/producers/m$c$a;-><init>(Lcom/facebook/imagepipeline/producers/m$c;Lcom/facebook/imagepipeline/producers/m;Lcom/facebook/imagepipeline/producers/ProducerContext;I)V

    .line 34
    .line 35
    .line 36
    new-instance p5, Lcom/facebook/imagepipeline/producers/y;

    .line 37
    .line 38
    invoke-static {p1}, Lcom/facebook/imagepipeline/producers/m;->g(Lcom/facebook/imagepipeline/producers/m;)Ljava/util/concurrent/Executor;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    iget p2, p2, Lcom/facebook/imagepipeline/common/ImageDecodeOptions;->a:I

    .line 43
    .line 44
    invoke-direct {p5, v1, v0, p2}, Lcom/facebook/imagepipeline/producers/y;-><init>(Ljava/util/concurrent/Executor;Lcom/facebook/imagepipeline/producers/y$d;I)V

    .line 45
    .line 46
    .line 47
    iput-object p5, p0, Lcom/facebook/imagepipeline/producers/m$c;->h:Lcom/facebook/imagepipeline/producers/y;

    .line 48
    .line 49
    new-instance p2, Lcom/facebook/imagepipeline/producers/m$c$b;

    .line 50
    .line 51
    invoke-direct {p2, p0, p1, p4}, Lcom/facebook/imagepipeline/producers/m$c$b;-><init>(Lcom/facebook/imagepipeline/producers/m$c;Lcom/facebook/imagepipeline/producers/m;Z)V

    .line 52
    .line 53
    .line 54
    invoke-interface {p3, p2}, Lcom/facebook/imagepipeline/producers/ProducerContext;->e(Lcom/facebook/imagepipeline/producers/m0;)V

    .line 55
    .line 56
    .line 57
    return-void
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
.end method

.method private A(Lu5/c;I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/m$c;->i:Lcom/facebook/imagepipeline/producers/m;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/facebook/imagepipeline/producers/m;->e(Lcom/facebook/imagepipeline/producers/m;)Lq5/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1}, Lq5/a;->b(Ljava/io/Closeable;)Lcom/facebook/common/references/CloseableReference;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    :try_start_0
    invoke-static {p2}, Lcom/facebook/imagepipeline/producers/b;->d(I)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-direct {p0, v0}, Lcom/facebook/imagepipeline/producers/m$c;->D(Z)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/o;->o()Lcom/facebook/imagepipeline/producers/Consumer;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-interface {v0, p1, p2}, Lcom/facebook/imagepipeline/producers/Consumer;->c(Ljava/lang/Object;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    .line 25
    invoke-static {p1}, Lcom/facebook/common/references/CloseableReference;->x(Lcom/facebook/common/references/CloseableReference;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :catchall_0
    move-exception p2

    .line 30
    invoke-static {p1}, Lcom/facebook/common/references/CloseableReference;->x(Lcom/facebook/common/references/CloseableReference;)V

    .line 31
    .line 32
    .line 33
    throw p2
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
.end method

.method private B(Lu5/e;ILu5/i;)Lu5/c;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/m$c;->i:Lcom/facebook/imagepipeline/producers/m;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/facebook/imagepipeline/producers/m;->h(Lcom/facebook/imagepipeline/producers/m;)Ljava/lang/Runnable;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/m$c;->i:Lcom/facebook/imagepipeline/producers/m;

    .line 10
    .line 11
    invoke-static {v0}, Lcom/facebook/imagepipeline/producers/m;->i(Lcom/facebook/imagepipeline/producers/m;)Lcom/facebook/common/internal/Supplier;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0}, Lcom/facebook/common/internal/Supplier;->get()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Ljava/lang/Boolean;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 v0, 0x0

    .line 30
    :goto_0
    :try_start_0
    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/m$c;->i:Lcom/facebook/imagepipeline/producers/m;

    .line 31
    .line 32
    invoke-static {v1}, Lcom/facebook/imagepipeline/producers/m;->d(Lcom/facebook/imagepipeline/producers/m;)Ls5/c;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    iget-object v2, p0, Lcom/facebook/imagepipeline/producers/m$c;->f:Lcom/facebook/imagepipeline/common/ImageDecodeOptions;

    .line 37
    .line 38
    invoke-interface {v1, p1, p2, p3, v2}, Ls5/c;->a(Lu5/e;ILu5/i;Lcom/facebook/imagepipeline/common/ImageDecodeOptions;)Lu5/c;

    .line 39
    .line 40
    .line 41
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    .line 42
    goto :goto_1

    .line 43
    :catch_0
    move-exception v1

    .line 44
    if-eqz v0, :cond_1

    .line 45
    .line 46
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/m$c;->i:Lcom/facebook/imagepipeline/producers/m;

    .line 47
    .line 48
    invoke-static {v0}, Lcom/facebook/imagepipeline/producers/m;->h(Lcom/facebook/imagepipeline/producers/m;)Ljava/lang/Runnable;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 53
    .line 54
    .line 55
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 56
    .line 57
    .line 58
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/m$c;->i:Lcom/facebook/imagepipeline/producers/m;

    .line 59
    .line 60
    invoke-static {v0}, Lcom/facebook/imagepipeline/producers/m;->d(Lcom/facebook/imagepipeline/producers/m;)Ls5/c;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/m$c;->f:Lcom/facebook/imagepipeline/common/ImageDecodeOptions;

    .line 65
    .line 66
    invoke-interface {v0, p1, p2, p3, v1}, Ls5/c;->a(Lu5/e;ILu5/i;Lcom/facebook/imagepipeline/common/ImageDecodeOptions;)Lu5/c;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    :goto_1
    return-object p1

    .line 71
    :cond_1
    throw v1
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
.end method

.method private declared-synchronized C()Z
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lcom/facebook/imagepipeline/producers/m$c;->g:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return v0

    .line 6
    :catchall_0
    move-exception v0

    .line 7
    monitor-exit p0

    .line 8
    throw v0
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
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
.end method

.method private D(Z)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    :try_start_0
    iget-boolean p1, p0, Lcom/facebook/imagepipeline/producers/m$c;->g:Z

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/o;->o()Lcom/facebook/imagepipeline/producers/Consumer;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const/high16 v0, 0x3f800000    # 1.0f

    .line 14
    .line 15
    invoke-interface {p1, v0}, Lcom/facebook/imagepipeline/producers/Consumer;->b(F)V

    .line 16
    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    iput-boolean p1, p0, Lcom/facebook/imagepipeline/producers/m$c;->g:Z

    .line 20
    .line 21
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    iget-object p1, p0, Lcom/facebook/imagepipeline/producers/m$c;->h:Lcom/facebook/imagepipeline/producers/y;

    .line 23
    .line 24
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/producers/y;->c()V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    :goto_0
    :try_start_1
    monitor-exit p0

    .line 29
    return-void

    .line 30
    :catchall_0
    move-exception p1

    .line 31
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    throw p1
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
.end method

.method private E(Lu5/e;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lu5/e;->x()Li5/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Li5/b;->a:Li5/c;

    .line 6
    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/m$c;->f:Lcom/facebook/imagepipeline/common/ImageDecodeOptions;

    .line 11
    .line 12
    iget-object v0, v0, Lcom/facebook/imagepipeline/common/ImageDecodeOptions;->g:Landroid/graphics/Bitmap$Config;

    .line 13
    .line 14
    invoke-static {v0}, Lcom/facebook/imageutils/a;->c(Landroid/graphics/Bitmap$Config;)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/high16 v1, 0x6400000

    .line 19
    .line 20
    invoke-static {p1, v0, v1}, La6/a;->c(Lu5/e;II)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    invoke-virtual {p1, v0}, Lu5/e;->M0(I)V

    .line 25
    .line 26
    .line 27
    return-void
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
.end method

.method private G(Lu5/e;Lu5/c;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/m$c;->d:Lcom/facebook/imagepipeline/producers/ProducerContext;

    .line 2
    .line 3
    invoke-virtual {p1}, Lu5/e;->getWidth()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-string v2, "encoded_width"

    .line 12
    .line 13
    invoke-interface {v0, v2, v1}, Lcom/facebook/imagepipeline/producers/ProducerContext;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/m$c;->d:Lcom/facebook/imagepipeline/producers/ProducerContext;

    .line 17
    .line 18
    invoke-virtual {p1}, Lu5/e;->getHeight()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    const-string v2, "encoded_height"

    .line 27
    .line 28
    invoke-interface {v0, v2, v1}, Lcom/facebook/imagepipeline/producers/ProducerContext;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/m$c;->d:Lcom/facebook/imagepipeline/producers/ProducerContext;

    .line 32
    .line 33
    invoke-virtual {p1}, Lu5/e;->T()I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    const-string v1, "encoded_size"

    .line 42
    .line 43
    invoke-interface {v0, v1, p1}, Lcom/facebook/imagepipeline/producers/ProducerContext;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    instance-of p1, p2, Lu5/b;

    .line 47
    .line 48
    if-eqz p1, :cond_1

    .line 49
    .line 50
    move-object p1, p2

    .line 51
    check-cast p1, Lu5/b;

    .line 52
    .line 53
    invoke-virtual {p1}, Lu5/b;->p()Landroid/graphics/Bitmap;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    if-nez p1, :cond_0

    .line 58
    .line 59
    const/4 p1, 0x0

    .line 60
    goto :goto_0

    .line 61
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    :goto_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/m$c;->d:Lcom/facebook/imagepipeline/producers/ProducerContext;

    .line 66
    .line 67
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    const-string v1, "bitmap_config"

    .line 72
    .line 73
    invoke-interface {v0, v1, p1}, Lcom/facebook/imagepipeline/producers/ProducerContext;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    :cond_1
    if-eqz p2, :cond_2

    .line 77
    .line 78
    iget-object p1, p0, Lcom/facebook/imagepipeline/producers/m$c;->d:Lcom/facebook/imagepipeline/producers/ProducerContext;

    .line 79
    .line 80
    invoke-interface {p1}, Lcom/facebook/imagepipeline/producers/ProducerContext;->getExtras()Ljava/util/Map;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-virtual {p2, p1}, Lu5/c;->l(Ljava/util/Map;)V

    .line 85
    .line 86
    .line 87
    :cond_2
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
.end method

.method static synthetic p(Lcom/facebook/imagepipeline/producers/m$c;)Lcom/facebook/imagepipeline/producers/ProducerContext;
    .locals 0

    iget-object p0, p0, Lcom/facebook/imagepipeline/producers/m$c;->d:Lcom/facebook/imagepipeline/producers/ProducerContext;

    return-object p0
.end method

.method static synthetic q(Lcom/facebook/imagepipeline/producers/m$c;Lu5/e;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/facebook/imagepipeline/producers/m$c;->E(Lu5/e;)V

    return-void
.end method

.method static synthetic r(Lcom/facebook/imagepipeline/producers/m$c;Lu5/e;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/facebook/imagepipeline/producers/m$c;->u(Lu5/e;I)V

    return-void
.end method

.method static synthetic s(Lcom/facebook/imagepipeline/producers/m$c;)Lcom/facebook/imagepipeline/producers/y;
    .locals 0

    iget-object p0, p0, Lcom/facebook/imagepipeline/producers/m$c;->h:Lcom/facebook/imagepipeline/producers/y;

    return-object p0
.end method

.method static synthetic t(Lcom/facebook/imagepipeline/producers/m$c;)V
    .locals 0

    invoke-direct {p0}, Lcom/facebook/imagepipeline/producers/m$c;->y()V

    return-void
.end method

.method private u(Lu5/e;I)V
    .locals 20

    .line 1
    move-object/from16 v11, p0

    .line 2
    .line 3
    move-object/from16 v12, p1

    .line 4
    .line 5
    move/from16 v0, p2

    .line 6
    .line 7
    const-string v13, "DecodeProducer"

    .line 8
    .line 9
    invoke-virtual/range {p1 .. p1}, Lu5/e;->x()Li5/c;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    sget-object v2, Li5/b;->a:Li5/c;

    .line 14
    .line 15
    if-eq v1, v2, :cond_0

    .line 16
    .line 17
    invoke-static/range {p2 .. p2}, Lcom/facebook/imagepipeline/producers/b;->e(I)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    invoke-direct/range {p0 .. p0}, Lcom/facebook/imagepipeline/producers/m$c;->C()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_a

    .line 29
    .line 30
    invoke-static/range {p1 .. p1}, Lu5/e;->v0(Lu5/e;)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-nez v1, :cond_1

    .line 35
    .line 36
    goto/16 :goto_8

    .line 37
    .line 38
    :cond_1
    invoke-virtual/range {p1 .. p1}, Lu5/e;->x()Li5/c;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    const-string v2, "unknown"

    .line 43
    .line 44
    if-eqz v1, :cond_2

    .line 45
    .line 46
    invoke-virtual {v1}, Li5/c;->a()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    move-object v7, v1

    .line 51
    goto :goto_0

    .line 52
    :cond_2
    move-object v7, v2

    .line 53
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 56
    .line 57
    .line 58
    invoke-virtual/range {p1 .. p1}, Lu5/e;->getWidth()I

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const-string v3, "x"

    .line 66
    .line 67
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual/range {p1 .. p1}, Lu5/e;->getHeight()I

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v8

    .line 81
    invoke-virtual/range {p1 .. p1}, Lu5/e;->Q()I

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v10

    .line 89
    invoke-static/range {p2 .. p2}, Lcom/facebook/imagepipeline/producers/b;->d(I)Z

    .line 90
    .line 91
    .line 92
    move-result v6

    .line 93
    const/4 v4, 0x1

    .line 94
    if-eqz v6, :cond_3

    .line 95
    .line 96
    const/16 v5, 0x8

    .line 97
    .line 98
    invoke-static {v0, v5}, Lcom/facebook/imagepipeline/producers/b;->m(II)Z

    .line 99
    .line 100
    .line 101
    move-result v5

    .line 102
    if-nez v5, :cond_3

    .line 103
    .line 104
    move v5, v4

    .line 105
    goto :goto_1

    .line 106
    :cond_3
    const/4 v5, 0x0

    .line 107
    :goto_1
    const/4 v9, 0x4

    .line 108
    invoke-static {v0, v9}, Lcom/facebook/imagepipeline/producers/b;->m(II)Z

    .line 109
    .line 110
    .line 111
    move-result v14

    .line 112
    iget-object v15, v11, Lcom/facebook/imagepipeline/producers/m$c;->d:Lcom/facebook/imagepipeline/producers/ProducerContext;

    .line 113
    .line 114
    invoke-interface {v15}, Lcom/facebook/imagepipeline/producers/ProducerContext;->d()Lcom/facebook/imagepipeline/request/ImageRequest;

    .line 115
    .line 116
    .line 117
    move-result-object v15

    .line 118
    invoke-virtual {v15}, Lcom/facebook/imagepipeline/request/ImageRequest;->getResizeOptions()Lcom/facebook/imagepipeline/common/ResizeOptions;

    .line 119
    .line 120
    .line 121
    move-result-object v15

    .line 122
    if-eqz v15, :cond_4

    .line 123
    .line 124
    new-instance v2, Ljava/lang/StringBuilder;

    .line 125
    .line 126
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 127
    .line 128
    .line 129
    iget v1, v15, Lcom/facebook/imagepipeline/common/ResizeOptions;->a:I

    .line 130
    .line 131
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    iget v1, v15, Lcom/facebook/imagepipeline/common/ResizeOptions;->b:I

    .line 138
    .line 139
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    move-object v15, v1

    .line 147
    goto :goto_2

    .line 148
    :cond_4
    move-object v15, v2

    .line 149
    :goto_2
    :try_start_0
    iget-object v1, v11, Lcom/facebook/imagepipeline/producers/m$c;->h:Lcom/facebook/imagepipeline/producers/y;

    .line 150
    .line 151
    invoke-virtual {v1}, Lcom/facebook/imagepipeline/producers/y;->f()J

    .line 152
    .line 153
    .line 154
    move-result-wide v17

    .line 155
    iget-object v1, v11, Lcom/facebook/imagepipeline/producers/m$c;->d:Lcom/facebook/imagepipeline/producers/ProducerContext;

    .line 156
    .line 157
    invoke-interface {v1}, Lcom/facebook/imagepipeline/producers/ProducerContext;->d()Lcom/facebook/imagepipeline/request/ImageRequest;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    invoke-virtual {v1}, Lcom/facebook/imagepipeline/request/ImageRequest;->getSourceUri()Landroid/net/Uri;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    if-nez v5, :cond_6

    .line 170
    .line 171
    if-eqz v14, :cond_5

    .line 172
    .line 173
    goto :goto_3

    .line 174
    :cond_5
    invoke-virtual/range {p0 .. p1}, Lcom/facebook/imagepipeline/producers/m$c;->w(Lu5/e;)I

    .line 175
    .line 176
    .line 177
    move-result v2

    .line 178
    goto :goto_4

    .line 179
    :cond_6
    :goto_3
    invoke-virtual/range {p1 .. p1}, Lu5/e;->T()I

    .line 180
    .line 181
    .line 182
    move-result v2

    .line 183
    :goto_4
    if-nez v5, :cond_8

    .line 184
    .line 185
    if-eqz v14, :cond_7

    .line 186
    .line 187
    goto :goto_5

    .line 188
    :cond_7
    invoke-virtual/range {p0 .. p0}, Lcom/facebook/imagepipeline/producers/m$c;->x()Lu5/i;

    .line 189
    .line 190
    .line 191
    move-result-object v3

    .line 192
    goto :goto_6

    .line 193
    :cond_8
    :goto_5
    sget-object v3, Lu5/h;->d:Lu5/i;

    .line 194
    .line 195
    :goto_6
    move-object v5, v3

    .line 196
    iget-object v3, v11, Lcom/facebook/imagepipeline/producers/m$c;->e:Lcom/facebook/imagepipeline/producers/n0;

    .line 197
    .line 198
    iget-object v14, v11, Lcom/facebook/imagepipeline/producers/m$c;->d:Lcom/facebook/imagepipeline/producers/ProducerContext;

    .line 199
    .line 200
    invoke-interface {v3, v14, v13}, Lcom/facebook/imagepipeline/producers/n0;->e(Lcom/facebook/imagepipeline/producers/ProducerContext;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 201
    .line 202
    .line 203
    :try_start_1
    invoke-direct {v11, v12, v2, v5}, Lcom/facebook/imagepipeline/producers/m$c;->B(Lu5/e;ILu5/i;)Lu5/c;

    .line 204
    .line 205
    .line 206
    move-result-object v14
    :try_end_1
    .catch Ls5/a; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 207
    :try_start_2
    invoke-virtual/range {p1 .. p1}, Lu5/e;->Q()I

    .line 208
    .line 209
    .line 210
    move-result v1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 211
    if-eq v1, v4, :cond_9

    .line 212
    .line 213
    or-int/lit8 v0, v0, 0x10

    .line 214
    .line 215
    :cond_9
    move-object/from16 v1, p0

    .line 216
    .line 217
    move-object v2, v14

    .line 218
    move-wide/from16 v3, v17

    .line 219
    .line 220
    move-object v9, v15

    .line 221
    :try_start_3
    invoke-direct/range {v1 .. v10}, Lcom/facebook/imagepipeline/producers/m$c;->v(Lu5/c;JLu5/i;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    .line 222
    .line 223
    .line 224
    move-result-object v1

    .line 225
    iget-object v2, v11, Lcom/facebook/imagepipeline/producers/m$c;->e:Lcom/facebook/imagepipeline/producers/n0;

    .line 226
    .line 227
    iget-object v3, v11, Lcom/facebook/imagepipeline/producers/m$c;->d:Lcom/facebook/imagepipeline/producers/ProducerContext;

    .line 228
    .line 229
    invoke-interface {v2, v3, v13, v1}, Lcom/facebook/imagepipeline/producers/n0;->j(Lcom/facebook/imagepipeline/producers/ProducerContext;Ljava/lang/String;Ljava/util/Map;)V

    .line 230
    .line 231
    .line 232
    invoke-direct {v11, v12, v14}, Lcom/facebook/imagepipeline/producers/m$c;->G(Lu5/e;Lu5/c;)V

    .line 233
    .line 234
    .line 235
    invoke-direct {v11, v14, v0}, Lcom/facebook/imagepipeline/producers/m$c;->A(Lu5/c;I)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 236
    .line 237
    .line 238
    invoke-static/range {p1 .. p1}, Lu5/e;->i(Lu5/e;)V

    .line 239
    .line 240
    .line 241
    return-void

    .line 242
    :catch_0
    move-exception v0

    .line 243
    move-object v2, v14

    .line 244
    goto :goto_7

    .line 245
    :catch_1
    move-exception v0

    .line 246
    const/4 v2, 0x0

    .line 247
    goto :goto_7

    .line 248
    :catch_2
    move-exception v0

    .line 249
    move-object v2, v0

    .line 250
    :try_start_4
    invoke-virtual {v2}, Ls5/a;->a()Lu5/e;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    const-string v14, "ProgressiveDecoder"

    .line 255
    .line 256
    const-string v3, "%s, {uri: %s, firstEncodedBytes: %s, length: %d}"

    .line 257
    .line 258
    new-array v9, v9, [Ljava/lang/Object;

    .line 259
    .line 260
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v19

    .line 264
    const/16 v16, 0x0

    .line 265
    .line 266
    aput-object v19, v9, v16

    .line 267
    .line 268
    aput-object v1, v9, v4

    .line 269
    .line 270
    const/16 v1, 0xa

    .line 271
    .line 272
    invoke-virtual {v0, v1}, Lu5/e;->w(I)Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v1

    .line 276
    const/4 v4, 0x2

    .line 277
    aput-object v1, v9, v4

    .line 278
    .line 279
    invoke-virtual {v0}, Lu5/e;->T()I

    .line 280
    .line 281
    .line 282
    move-result v0

    .line 283
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    const/4 v1, 0x3

    .line 288
    aput-object v0, v9, v1

    .line 289
    .line 290
    invoke-static {v14, v3, v9}, Lw3/a;->J(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 291
    .line 292
    .line 293
    throw v2
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 294
    :goto_7
    move-object/from16 v1, p0

    .line 295
    .line 296
    move-wide/from16 v3, v17

    .line 297
    .line 298
    move-object v9, v15

    .line 299
    :try_start_5
    invoke-direct/range {v1 .. v10}, Lcom/facebook/imagepipeline/producers/m$c;->v(Lu5/c;JLu5/i;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    .line 300
    .line 301
    .line 302
    move-result-object v1

    .line 303
    iget-object v2, v11, Lcom/facebook/imagepipeline/producers/m$c;->e:Lcom/facebook/imagepipeline/producers/n0;

    .line 304
    .line 305
    iget-object v3, v11, Lcom/facebook/imagepipeline/producers/m$c;->d:Lcom/facebook/imagepipeline/producers/ProducerContext;

    .line 306
    .line 307
    invoke-interface {v2, v3, v13, v0, v1}, Lcom/facebook/imagepipeline/producers/n0;->k(Lcom/facebook/imagepipeline/producers/ProducerContext;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/Map;)V

    .line 308
    .line 309
    .line 310
    invoke-direct {v11, v0}, Lcom/facebook/imagepipeline/producers/m$c;->z(Ljava/lang/Throwable;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 311
    .line 312
    .line 313
    invoke-static/range {p1 .. p1}, Lu5/e;->i(Lu5/e;)V

    .line 314
    .line 315
    .line 316
    return-void

    .line 317
    :catchall_0
    move-exception v0

    .line 318
    invoke-static/range {p1 .. p1}, Lu5/e;->i(Lu5/e;)V

    .line 319
    .line 320
    .line 321
    throw v0

    .line 322
    :cond_a
    :goto_8
    return-void
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
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
.end method

.method private v(Lu5/c;JLu5/i;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu5/c;",
            "J",
            "Lu5/i;",
            "Z",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p6

    .line 6
    .line 7
    move-object/from16 v3, p7

    .line 8
    .line 9
    move-object/from16 v4, p8

    .line 10
    .line 11
    move-object/from16 v5, p9

    .line 12
    .line 13
    iget-object v6, v0, Lcom/facebook/imagepipeline/producers/m$c;->e:Lcom/facebook/imagepipeline/producers/n0;

    .line 14
    .line 15
    iget-object v7, v0, Lcom/facebook/imagepipeline/producers/m$c;->d:Lcom/facebook/imagepipeline/producers/ProducerContext;

    .line 16
    .line 17
    const-string v8, "DecodeProducer"

    .line 18
    .line 19
    invoke-interface {v6, v7, v8}, Lcom/facebook/imagepipeline/producers/n0;->g(Lcom/facebook/imagepipeline/producers/ProducerContext;Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result v6

    .line 23
    if-nez v6, :cond_0

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    return-object v1

    .line 27
    :cond_0
    invoke-static/range {p2 .. p3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    invoke-interface/range {p4 .. p4}, Lu5/i;->b()Z

    .line 32
    .line 33
    .line 34
    move-result v7

    .line 35
    invoke-static {v7}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v7

    .line 39
    invoke-static/range {p5 .. p5}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v8

    .line 43
    instance-of v9, v1, Lu5/d;

    .line 44
    .line 45
    const-string v10, "sampleSize"

    .line 46
    .line 47
    const-string v11, "requestedImageSize"

    .line 48
    .line 49
    const-string v12, "imageFormat"

    .line 50
    .line 51
    const-string v13, "encodedImageSize"

    .line 52
    .line 53
    const-string v14, "isFinal"

    .line 54
    .line 55
    const-string v15, "hasGoodQuality"

    .line 56
    .line 57
    const-string v0, "queueTime"

    .line 58
    .line 59
    if-eqz v9, :cond_1

    .line 60
    .line 61
    check-cast v1, Lu5/d;

    .line 62
    .line 63
    invoke-virtual {v1}, Lu5/d;->p()Landroid/graphics/Bitmap;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-static {v1}, Lv3/j;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    new-instance v9, Ljava/lang/StringBuilder;

    .line 71
    .line 72
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 76
    .line 77
    .line 78
    move-result v5

    .line 79
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    const-string v5, "x"

    .line 83
    .line 84
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 88
    .line 89
    .line 90
    move-result v5

    .line 91
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    new-instance v9, Ljava/util/HashMap;

    .line 99
    .line 100
    move-object/from16 p1, v1

    .line 101
    .line 102
    const/16 v1, 0x8

    .line 103
    .line 104
    invoke-direct {v9, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 105
    .line 106
    .line 107
    const-string v1, "bitmapSize"

    .line 108
    .line 109
    invoke-interface {v9, v1, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    invoke-interface {v9, v0, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    invoke-interface {v9, v15, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    invoke-interface {v9, v14, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    invoke-interface {v9, v13, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    invoke-interface {v9, v12, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    invoke-interface {v9, v11, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-object/from16 v1, p9

    .line 131
    .line 132
    invoke-interface {v9, v10, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    new-instance v0, Ljava/lang/StringBuilder;

    .line 136
    .line 137
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 138
    .line 139
    .line 140
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Bitmap;->getByteCount()I

    .line 141
    .line 142
    .line 143
    move-result v1

    .line 144
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    const-string v1, ""

    .line 148
    .line 149
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    const-string v1, "byteCount"

    .line 157
    .line 158
    invoke-interface {v9, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    invoke-static {v9}, Lv3/f;->a(Ljava/util/Map;)Lv3/f;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    return-object v0

    .line 166
    :cond_1
    move-object v1, v5

    .line 167
    new-instance v5, Ljava/util/HashMap;

    .line 168
    .line 169
    const/4 v9, 0x7

    .line 170
    invoke-direct {v5, v9}, Ljava/util/HashMap;-><init>(I)V

    .line 171
    .line 172
    .line 173
    invoke-interface {v5, v0, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    invoke-interface {v5, v15, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    invoke-interface {v5, v14, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    invoke-interface {v5, v13, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    invoke-interface {v5, v12, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    invoke-interface {v5, v11, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    invoke-interface {v5, v10, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    invoke-static {v5}, Lv3/f;->a(Ljava/util/Map;)Lv3/f;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    return-object v0
.end method

.method private y()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, Lcom/facebook/imagepipeline/producers/m$c;->D(Z)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/o;->o()Lcom/facebook/imagepipeline/producers/Consumer;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Lcom/facebook/imagepipeline/producers/Consumer;->a()V

    .line 10
    .line 11
    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
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
.end method

.method private z(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, Lcom/facebook/imagepipeline/producers/m$c;->D(Z)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/o;->o()Lcom/facebook/imagepipeline/producers/Consumer;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0, p1}, Lcom/facebook/imagepipeline/producers/Consumer;->onFailure(Ljava/lang/Throwable;)V

    .line 10
    .line 11
    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
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
.end method


# virtual methods
.method public F(Lu5/e;I)V
    .locals 2

    .line 1
    :try_start_0
    invoke-static {}, Lz5/b;->d()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string v0, "DecodeProducer#onNewResultImpl"

    .line 8
    .line 9
    invoke-static {v0}, Lz5/b;->a(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-static {p2}, Lcom/facebook/imagepipeline/producers/b;->d(I)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_4

    .line 17
    .line 18
    if-nez p1, :cond_2

    .line 19
    .line 20
    new-instance p1, Ld4/a;

    .line 21
    .line 22
    const-string p2, "Encoded image is null."

    .line 23
    .line 24
    invoke-direct {p1, p2}, Ld4/a;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-direct {p0, p1}, Lcom/facebook/imagepipeline/producers/m$c;->z(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    .line 30
    invoke-static {}, Lz5/b;->d()Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    invoke-static {}, Lz5/b;->b()V

    .line 37
    .line 38
    .line 39
    :cond_1
    return-void

    .line 40
    :cond_2
    :try_start_1
    invoke-virtual {p1}, Lu5/e;->t0()Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-nez v1, :cond_4

    .line 45
    .line 46
    new-instance p1, Ld4/a;

    .line 47
    .line 48
    const-string p2, "Encoded image is not valid."

    .line 49
    .line 50
    invoke-direct {p1, p2}, Ld4/a;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-direct {p0, p1}, Lcom/facebook/imagepipeline/producers/m$c;->z(Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 54
    .line 55
    .line 56
    invoke-static {}, Lz5/b;->d()Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    if-eqz p1, :cond_3

    .line 61
    .line 62
    invoke-static {}, Lz5/b;->b()V

    .line 63
    .line 64
    .line 65
    :cond_3
    return-void

    .line 66
    :cond_4
    :try_start_2
    invoke-virtual {p0, p1, p2}, Lcom/facebook/imagepipeline/producers/m$c;->H(Lu5/e;I)Z

    .line 67
    .line 68
    .line 69
    move-result p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 70
    if-nez p1, :cond_6

    .line 71
    .line 72
    invoke-static {}, Lz5/b;->d()Z

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    if-eqz p1, :cond_5

    .line 77
    .line 78
    invoke-static {}, Lz5/b;->b()V

    .line 79
    .line 80
    .line 81
    :cond_5
    return-void

    .line 82
    :cond_6
    const/4 p1, 0x4

    .line 83
    :try_start_3
    invoke-static {p2, p1}, Lcom/facebook/imagepipeline/producers/b;->m(II)Z

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    if-nez v0, :cond_7

    .line 88
    .line 89
    if-nez p1, :cond_7

    .line 90
    .line 91
    iget-object p1, p0, Lcom/facebook/imagepipeline/producers/m$c;->d:Lcom/facebook/imagepipeline/producers/ProducerContext;

    .line 92
    .line 93
    invoke-interface {p1}, Lcom/facebook/imagepipeline/producers/ProducerContext;->o()Z

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    if-eqz p1, :cond_8

    .line 98
    .line 99
    :cond_7
    iget-object p1, p0, Lcom/facebook/imagepipeline/producers/m$c;->h:Lcom/facebook/imagepipeline/producers/y;

    .line 100
    .line 101
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/producers/y;->h()Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 102
    .line 103
    .line 104
    :cond_8
    invoke-static {}, Lz5/b;->d()Z

    .line 105
    .line 106
    .line 107
    move-result p1

    .line 108
    if-eqz p1, :cond_9

    .line 109
    .line 110
    invoke-static {}, Lz5/b;->b()V

    .line 111
    .line 112
    .line 113
    :cond_9
    return-void

    .line 114
    :catchall_0
    move-exception p1

    .line 115
    invoke-static {}, Lz5/b;->d()Z

    .line 116
    .line 117
    .line 118
    move-result p2

    .line 119
    if-eqz p2, :cond_a

    .line 120
    .line 121
    invoke-static {}, Lz5/b;->b()V

    .line 122
    .line 123
    .line 124
    :cond_a
    throw p1
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
.end method

.method protected H(Lu5/e;I)Z
    .locals 1

    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/m$c;->h:Lcom/facebook/imagepipeline/producers/y;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/imagepipeline/producers/y;->k(Lu5/e;I)Z

    move-result p1

    return p1
.end method

.method public f()V
    .locals 0

    invoke-direct {p0}, Lcom/facebook/imagepipeline/producers/m$c;->y()V

    return-void
.end method

.method public g(Ljava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/facebook/imagepipeline/producers/m$c;->z(Ljava/lang/Throwable;)V

    return-void
.end method

.method public bridge synthetic h(Ljava/lang/Object;I)V
    .locals 0

    check-cast p1, Lu5/e;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/imagepipeline/producers/m$c;->F(Lu5/e;I)V

    return-void
.end method

.method protected i(F)V
    .locals 1

    const v0, 0x3f7d70a4    # 0.99f

    mul-float/2addr p1, v0

    invoke-super {p0, p1}, Lcom/facebook/imagepipeline/producers/o;->i(F)V

    return-void
.end method

.method protected abstract w(Lu5/e;)I
.end method

.method protected abstract x()Lu5/i;
.end method
