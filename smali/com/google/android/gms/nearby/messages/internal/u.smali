.class public final Lcom/google/android/gms/nearby/messages/internal/u;
.super Lu9/e;
.source "SourceFile"

# interfaces
.implements Lxa/d;


# static fields
.field private static final l:Lu9/a$g;

.field private static final m:Lu9/a$a;

.field private static final n:Lu9/a;

.field public static final synthetic o:I


# instance fields
.field private final k:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lu9/a$g;

    .line 2
    .line 3
    invoke-direct {v0}, Lu9/a$g;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/google/android/gms/nearby/messages/internal/u;->l:Lu9/a$g;

    .line 7
    .line 8
    new-instance v1, Lcom/google/android/gms/nearby/messages/internal/k;

    .line 9
    .line 10
    invoke-direct {v1}, Lcom/google/android/gms/nearby/messages/internal/k;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v1, Lcom/google/android/gms/nearby/messages/internal/u;->m:Lu9/a$a;

    .line 14
    .line 15
    new-instance v2, Lu9/a;

    .line 16
    .line 17
    const-string v3, "Nearby.MESSAGES_API"

    .line 18
    .line 19
    invoke-direct {v2, v3, v1, v0}, Lu9/a;-><init>(Ljava/lang/String;Lu9/a$a;Lu9/a$g;)V

    .line 20
    .line 21
    .line 22
    sput-object v2, Lcom/google/android/gms/nearby/messages/internal/u;->n:Lu9/a;

    .line 23
    .line 24
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lxa/e;)V
    .locals 2

    .line 1
    sget-object v0, Lcom/google/android/gms/nearby/messages/internal/u;->n:Lu9/a;

    .line 2
    .line 3
    sget-object v1, Lu9/e$a;->c:Lu9/e$a;

    .line 4
    .line 5
    invoke-direct {p0, p1, v0, p2, v1}, Lu9/e;-><init>(Landroid/content/Context;Lu9/a;Lu9/a$d;Lu9/e$a;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, Lcom/google/android/gms/nearby/messages/internal/b;->l0(Landroid/content/Context;)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    iput p1, p0, Lcom/google/android/gms/nearby/messages/internal/u;->k:I

    .line 13
    .line 14
    return-void
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
.end method

.method private final G(Ljava/lang/Object;)Lcom/google/android/gms/common/api/internal/d;
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lu9/e;->w(Ljava/lang/Object;Ljava/lang/String;)Lcom/google/android/gms/common/api/internal/d;

    move-result-object p1

    return-object p1
.end method

.method private final H(Lcom/google/android/gms/tasks/TaskCompletionSource;)Lcom/google/android/gms/common/api/internal/d;
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/nearby/messages/internal/n;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/nearby/messages/internal/n;-><init>(Lcom/google/android/gms/nearby/messages/internal/u;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 4
    .line 5
    .line 6
    const-class p1, Lcom/google/android/gms/common/api/Status;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p0, v0, p1}, Lu9/e;->w(Ljava/lang/Object;Ljava/lang/String;)Lcom/google/android/gms/common/api/internal/d;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
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
.end method

.method private final I(Lcom/google/android/gms/common/api/internal/d;Lcom/google/android/gms/nearby/messages/internal/p;Lcom/google/android/gms/nearby/messages/internal/p;I)Lcom/google/android/gms/tasks/Task;
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/android/gms/common/api/internal/g;->a()Lcom/google/android/gms/common/api/internal/g$a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/api/internal/g$a;->e(Lcom/google/android/gms/common/api/internal/d;)Lcom/google/android/gms/common/api/internal/g$a;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    new-instance v0, Lcom/google/android/gms/nearby/messages/internal/f;

    .line 10
    .line 11
    invoke-direct {v0, p0, p2}, Lcom/google/android/gms/nearby/messages/internal/f;-><init>(Lcom/google/android/gms/nearby/messages/internal/u;Lcom/google/android/gms/nearby/messages/internal/p;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/internal/g$a;->b(Lv9/i;)Lcom/google/android/gms/common/api/internal/g$a;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    new-instance p2, Lcom/google/android/gms/nearby/messages/internal/g;

    .line 19
    .line 20
    invoke-direct {p2, p0, p3}, Lcom/google/android/gms/nearby/messages/internal/g;-><init>(Lcom/google/android/gms/nearby/messages/internal/u;Lcom/google/android/gms/nearby/messages/internal/p;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, p2}, Lcom/google/android/gms/common/api/internal/g$a;->d(Lv9/i;)Lcom/google/android/gms/common/api/internal/g$a;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p1, p4}, Lcom/google/android/gms/common/api/internal/g$a;->c(I)Lcom/google/android/gms/common/api/internal/g$a;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p1}, Lcom/google/android/gms/common/api/internal/g$a;->a()Lcom/google/android/gms/common/api/internal/g;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {p0, p1}, Lu9/e;->m(Lcom/google/android/gms/common/api/internal/g;)Lcom/google/android/gms/tasks/Task;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    return-object p1
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

.method private final J(Ljava/lang/Object;I)Lcom/google/android/gms/tasks/Task;
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-static {p1, v1}, Lcom/google/android/gms/common/api/internal/e;->b(Ljava/lang/Object;Ljava/lang/String;)Lcom/google/android/gms/common/api/internal/d$a;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p0, p1, p2}, Lu9/e;->o(Lcom/google/android/gms/common/api/internal/d$a;I)Lcom/google/android/gms/tasks/Task;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    new-instance p2, Lcom/google/android/gms/nearby/messages/internal/o;

    .line 23
    .line 24
    invoke-direct {p2, p0, v0}, Lcom/google/android/gms/nearby/messages/internal/o;-><init>(Lcom/google/android/gms/nearby/messages/internal/u;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, p2}, Lcom/google/android/gms/tasks/Task;->b(Lcb/d;)Lcom/google/android/gms/tasks/Task;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->a()Lcom/google/android/gms/tasks/Task;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    return-object p1
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


# virtual methods
.method final synthetic C(Lcom/google/android/gms/nearby/messages/Message;Lcom/google/android/gms/nearby/messages/internal/r;Lxa/g;Lcom/google/android/gms/nearby/messages/internal/b;Lcom/google/android/gms/common/api/internal/d;)V
    .locals 6

    .line 1
    invoke-static {p1}, Lya/f;->v(Lcom/google/android/gms/nearby/messages/Message;)Lya/f;

    .line 2
    .line 3
    .line 4
    move-result-object v2

    .line 5
    iget v5, p0, Lcom/google/android/gms/nearby/messages/internal/u;->k:I

    .line 6
    .line 7
    move-object v0, p4

    .line 8
    move-object v1, p5

    .line 9
    move-object v3, p2

    .line 10
    move-object v4, p3

    .line 11
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/nearby/messages/internal/b;->n0(Lcom/google/android/gms/common/api/internal/d;Lya/f;Lya/s;Lxa/g;I)V

    .line 12
    .line 13
    .line 14
    return-void
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
.end method

.method final synthetic D(Lcom/google/android/gms/nearby/messages/internal/p;Lcom/google/android/gms/nearby/messages/internal/b;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 0

    invoke-direct {p0, p3}, Lcom/google/android/gms/nearby/messages/internal/u;->H(Lcom/google/android/gms/tasks/TaskCompletionSource;)Lcom/google/android/gms/common/api/internal/d;

    move-result-object p3

    invoke-interface {p1, p2, p3}, Lcom/google/android/gms/nearby/messages/internal/p;->a(Lcom/google/android/gms/nearby/messages/internal/b;Lcom/google/android/gms/common/api/internal/d;)V

    return-void
.end method

.method final synthetic E(Lcom/google/android/gms/nearby/messages/internal/p;Lcom/google/android/gms/nearby/messages/internal/b;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 0

    invoke-direct {p0, p3}, Lcom/google/android/gms/nearby/messages/internal/u;->H(Lcom/google/android/gms/tasks/TaskCompletionSource;)Lcom/google/android/gms/common/api/internal/d;

    move-result-object p3

    invoke-interface {p1, p2, p3}, Lcom/google/android/gms/nearby/messages/internal/p;->a(Lcom/google/android/gms/nearby/messages/internal/b;Lcom/google/android/gms/common/api/internal/d;)V

    return-void
.end method

.method final synthetic F(Lcom/google/android/gms/common/api/internal/d;Lcom/google/android/gms/nearby/messages/internal/t;Lcom/google/android/gms/nearby/messages/SubscribeOptions;Lcom/google/android/gms/nearby/messages/internal/b;Lcom/google/android/gms/common/api/internal/d;)V
    .locals 7

    const/4 v5, 0x0

    iget v6, p0, Lcom/google/android/gms/nearby/messages/internal/u;->k:I

    move-object v0, p4

    move-object v1, p5

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/nearby/messages/internal/b;->p0(Lcom/google/android/gms/common/api/internal/d;Lcom/google/android/gms/common/api/internal/d;Lya/b;Lcom/google/android/gms/nearby/messages/SubscribeOptions;[BI)V

    return-void
.end method

.method public final a(Lcom/google/android/gms/nearby/messages/Message;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/nearby/messages/Message;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lw9/p;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x50a

    .line 5
    .line 6
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/nearby/messages/internal/u;->J(Ljava/lang/Object;I)Lcom/google/android/gms/tasks/Task;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
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
.end method

.method public final b(Lxa/h;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxa/h;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lw9/p;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x4f7

    .line 5
    .line 6
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/nearby/messages/internal/u;->J(Ljava/lang/Object;I)Lcom/google/android/gms/tasks/Task;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
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
.end method

.method public final c(Lxa/b;Lcom/google/android/gms/nearby/messages/SubscribeOptions;)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxa/b;",
            "Lcom/google/android/gms/nearby/messages/SubscribeOptions;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lw9/p;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    invoke-static {p2}, Lw9/p;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2}, Lcom/google/android/gms/nearby/messages/SubscribeOptions;->c()Lxa/i;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Lxa/i;->v()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    :goto_0
    const-string v1, "Strategy.setBackgroundScanMode() is only supported by background subscribe (the version which takes a PendingIntent)."

    .line 21
    .line 22
    invoke-static {v0, v1}, Lw9/p;->b(ZLjava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    invoke-direct {p0, p1}, Lcom/google/android/gms/nearby/messages/internal/u;->G(Ljava/lang/Object;)Lcom/google/android/gms/common/api/internal/d;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {p2}, Lcom/google/android/gms/nearby/messages/SubscribeOptions;->a()Lxa/j;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-direct {p0, v0}, Lcom/google/android/gms/nearby/messages/internal/u;->G(Ljava/lang/Object;)Lcom/google/android/gms/common/api/internal/d;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    new-instance v1, Lcom/google/android/gms/nearby/messages/internal/m;

    .line 38
    .line 39
    invoke-direct {v1, p0, v0, v0}, Lcom/google/android/gms/nearby/messages/internal/m;-><init>(Lcom/google/android/gms/nearby/messages/internal/u;Lcom/google/android/gms/common/api/internal/d;Lcom/google/android/gms/common/api/internal/d;)V

    .line 40
    .line 41
    .line 42
    new-instance v0, Lcom/google/android/gms/nearby/messages/internal/h;

    .line 43
    .line 44
    invoke-direct {v0, p0, p1, v1, p2}, Lcom/google/android/gms/nearby/messages/internal/h;-><init>(Lcom/google/android/gms/nearby/messages/internal/u;Lcom/google/android/gms/common/api/internal/d;Lcom/google/android/gms/nearby/messages/internal/t;Lcom/google/android/gms/nearby/messages/SubscribeOptions;)V

    .line 45
    .line 46
    .line 47
    new-instance p2, Lcom/google/android/gms/nearby/messages/internal/i;

    .line 48
    .line 49
    invoke-direct {p2, p1}, Lcom/google/android/gms/nearby/messages/internal/i;-><init>(Lcom/google/android/gms/common/api/internal/d;)V

    .line 50
    .line 51
    .line 52
    const/16 v1, 0x509

    .line 53
    .line 54
    invoke-direct {p0, p1, v0, p2, v1}, Lcom/google/android/gms/nearby/messages/internal/u;->I(Lcom/google/android/gms/common/api/internal/d;Lcom/google/android/gms/nearby/messages/internal/p;Lcom/google/android/gms/nearby/messages/internal/p;I)Lcom/google/android/gms/tasks/Task;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    return-object p1
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
.end method

.method public final d(Lcom/google/android/gms/nearby/messages/Message;)Lcom/google/android/gms/tasks/Task;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/nearby/messages/Message;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lxa/g;->c:Lxa/g;

    .line 2
    .line 3
    invoke-static {p1}, Lw9/p;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lw9/p;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    invoke-direct {p0, p1}, Lcom/google/android/gms/nearby/messages/internal/u;->G(Ljava/lang/Object;)Lcom/google/android/gms/common/api/internal/d;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v0}, Lxa/g;->a()Lxa/f;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-direct {p0, v2}, Lcom/google/android/gms/nearby/messages/internal/u;->G(Ljava/lang/Object;)Lcom/google/android/gms/common/api/internal/d;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    new-instance v3, Lcom/google/android/gms/nearby/messages/internal/l;

    .line 22
    .line 23
    invoke-direct {v3, p0, v2, v1}, Lcom/google/android/gms/nearby/messages/internal/l;-><init>(Lcom/google/android/gms/nearby/messages/internal/u;Lcom/google/android/gms/common/api/internal/d;Lcom/google/android/gms/common/api/internal/d;)V

    .line 24
    .line 25
    .line 26
    new-instance v2, Lcom/google/android/gms/nearby/messages/internal/j;

    .line 27
    .line 28
    invoke-direct {v2, p0, p1, v3, v0}, Lcom/google/android/gms/nearby/messages/internal/j;-><init>(Lcom/google/android/gms/nearby/messages/internal/u;Lcom/google/android/gms/nearby/messages/Message;Lcom/google/android/gms/nearby/messages/internal/r;Lxa/g;)V

    .line 29
    .line 30
    .line 31
    new-instance v0, Lcom/google/android/gms/nearby/messages/internal/c;

    .line 32
    .line 33
    invoke-direct {v0, p1}, Lcom/google/android/gms/nearby/messages/internal/c;-><init>(Lcom/google/android/gms/nearby/messages/Message;)V

    .line 34
    .line 35
    .line 36
    const/16 p1, 0x50b

    .line 37
    .line 38
    invoke-direct {p0, v1, v2, v0, p1}, Lcom/google/android/gms/nearby/messages/internal/u;->I(Lcom/google/android/gms/common/api/internal/d;Lcom/google/android/gms/nearby/messages/internal/p;Lcom/google/android/gms/nearby/messages/internal/p;I)Lcom/google/android/gms/tasks/Task;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    return-object p1
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

.method public final e(Lxa/h;)Lcom/google/android/gms/tasks/Task;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxa/h;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lw9/p;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1}, Lcom/google/android/gms/nearby/messages/internal/u;->G(Ljava/lang/Object;)Lcom/google/android/gms/common/api/internal/d;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    new-instance v0, Lcom/google/android/gms/nearby/messages/internal/d;

    .line 9
    .line 10
    invoke-direct {v0, p1}, Lcom/google/android/gms/nearby/messages/internal/d;-><init>(Lcom/google/android/gms/common/api/internal/d;)V

    .line 11
    .line 12
    .line 13
    new-instance v1, Lcom/google/android/gms/nearby/messages/internal/e;

    .line 14
    .line 15
    invoke-direct {v1, p1}, Lcom/google/android/gms/nearby/messages/internal/e;-><init>(Lcom/google/android/gms/common/api/internal/d;)V

    .line 16
    .line 17
    .line 18
    const/16 v2, 0x4f6

    .line 19
    .line 20
    invoke-direct {p0, p1, v0, v1, v2}, Lcom/google/android/gms/nearby/messages/internal/u;->I(Lcom/google/android/gms/common/api/internal/d;Lcom/google/android/gms/nearby/messages/internal/p;Lcom/google/android/gms/nearby/messages/internal/p;I)Lcom/google/android/gms/tasks/Task;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    return-object p1
    .line 25
    .line 26
    .line 27
.end method

.method public final f(Lxa/b;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxa/b;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lw9/p;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x506

    .line 5
    .line 6
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/nearby/messages/internal/u;->J(Ljava/lang/Object;I)Lcom/google/android/gms/tasks/Task;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
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
.end method

.method protected final i()Lw9/d$a;
    .locals 2

    .line 1
    invoke-super {p0}, Lu9/e;->i()Lw9/d$a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lu9/e;->s()Lu9/a$d;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lu9/e;->s()Lu9/a$d;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Lxa/e;

    .line 16
    .line 17
    iget-object v1, v1, Lxa/e;->m:Ljava/lang/String;

    .line 18
    .line 19
    :cond_0
    return-object v0
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method
