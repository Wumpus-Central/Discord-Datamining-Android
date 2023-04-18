.class public final Llg/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llg/c$a;
    }
.end annotation


# static fields
.field public static final a:Llg/c;

.field private static final b:Ljava/lang/String;

.field private static final c:Ljava/lang/String;

.field private static final d:Ljava/lang/String;

.field private static final e:Ljava/lang/String;

.field private static final f:Llh/b;

.field private static final g:Llh/c;

.field private static final h:Llh/b;

.field private static final i:Llh/b;

.field private static final j:Llh/b;

.field private static final k:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Llh/d;",
            "Llh/b;",
            ">;"
        }
    .end annotation
.end field

.field private static final l:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Llh/d;",
            "Llh/b;",
            ">;"
        }
    .end annotation
.end field

.field private static final m:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Llh/d;",
            "Llh/c;",
            ">;"
        }
    .end annotation
.end field

.field private static final n:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Llh/d;",
            "Llh/c;",
            ">;"
        }
    .end annotation
.end field

.field private static final o:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Llh/b;",
            "Llh/b;",
            ">;"
        }
    .end annotation
.end field

.field private static final p:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Llh/b;",
            "Llh/b;",
            ">;"
        }
    .end annotation
.end field

.field private static final q:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Llg/c$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    new-instance v0, Llg/c;

    .line 2
    .line 3
    invoke-direct {v0}, Llg/c;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Llg/c;->a:Llg/c;

    .line 7
    .line 8
    new-instance v1, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 11
    .line 12
    .line 13
    sget-object v2, Lkg/c;->p:Lkg/c;

    .line 14
    .line 15
    invoke-virtual {v2}, Lkg/c;->c()Llh/c;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-virtual {v3}, Llh/c;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const/16 v3, 0x2e

    .line 27
    .line 28
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2}, Lkg/c;->b()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    sput-object v1, Llg/c;->b:Ljava/lang/String;

    .line 43
    .line 44
    new-instance v1, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 47
    .line 48
    .line 49
    sget-object v2, Lkg/c;->r:Lkg/c;

    .line 50
    .line 51
    invoke-virtual {v2}, Lkg/c;->c()Llh/c;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    invoke-virtual {v4}, Llh/c;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v2}, Lkg/c;->b()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    sput-object v1, Llg/c;->c:Ljava/lang/String;

    .line 77
    .line 78
    new-instance v1, Ljava/lang/StringBuilder;

    .line 79
    .line 80
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 81
    .line 82
    .line 83
    sget-object v2, Lkg/c;->q:Lkg/c;

    .line 84
    .line 85
    invoke-virtual {v2}, Lkg/c;->c()Llh/c;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    invoke-virtual {v4}, Llh/c;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v2}, Lkg/c;->b()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    sput-object v1, Llg/c;->d:Ljava/lang/String;

    .line 111
    .line 112
    new-instance v1, Ljava/lang/StringBuilder;

    .line 113
    .line 114
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 115
    .line 116
    .line 117
    sget-object v2, Lkg/c;->s:Lkg/c;

    .line 118
    .line 119
    invoke-virtual {v2}, Lkg/c;->c()Llh/c;

    .line 120
    .line 121
    .line 122
    move-result-object v4

    .line 123
    invoke-virtual {v4}, Llh/c;->toString()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v4

    .line 127
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v2}, Lkg/c;->b()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    sput-object v1, Llg/c;->e:Ljava/lang/String;

    .line 145
    .line 146
    new-instance v1, Llh/c;

    .line 147
    .line 148
    const-string v2, "kotlin.jvm.functions.FunctionN"

    .line 149
    .line 150
    invoke-direct {v1, v2}, Llh/c;-><init>(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    invoke-static {v1}, Llh/b;->m(Llh/c;)Llh/b;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    const-string v2, "topLevel(FqName(\"kotlin.jvm.functions.FunctionN\"))"

    .line 158
    .line 159
    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    sput-object v1, Llg/c;->f:Llh/b;

    .line 163
    .line 164
    invoke-virtual {v1}, Llh/b;->b()Llh/c;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    const-string v2, "FUNCTION_N_CLASS_ID.asSingleFqName()"

    .line 169
    .line 170
    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    sput-object v1, Llg/c;->g:Llh/c;

    .line 174
    .line 175
    sget-object v1, Llh/i;->a:Llh/i;

    .line 176
    .line 177
    invoke-virtual {v1}, Llh/i;->k()Llh/b;

    .line 178
    .line 179
    .line 180
    move-result-object v2

    .line 181
    sput-object v2, Llg/c;->h:Llh/b;

    .line 182
    .line 183
    invoke-virtual {v1}, Llh/i;->j()Llh/b;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    sput-object v1, Llg/c;->i:Llh/b;

    .line 188
    .line 189
    const-class v1, Ljava/lang/Class;

    .line 190
    .line 191
    invoke-direct {v0, v1}, Llg/c;->g(Ljava/lang/Class;)Llh/b;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    sput-object v1, Llg/c;->j:Llh/b;

    .line 196
    .line 197
    new-instance v1, Ljava/util/HashMap;

    .line 198
    .line 199
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 200
    .line 201
    .line 202
    sput-object v1, Llg/c;->k:Ljava/util/HashMap;

    .line 203
    .line 204
    new-instance v1, Ljava/util/HashMap;

    .line 205
    .line 206
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 207
    .line 208
    .line 209
    sput-object v1, Llg/c;->l:Ljava/util/HashMap;

    .line 210
    .line 211
    new-instance v1, Ljava/util/HashMap;

    .line 212
    .line 213
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 214
    .line 215
    .line 216
    sput-object v1, Llg/c;->m:Ljava/util/HashMap;

    .line 217
    .line 218
    new-instance v1, Ljava/util/HashMap;

    .line 219
    .line 220
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 221
    .line 222
    .line 223
    sput-object v1, Llg/c;->n:Ljava/util/HashMap;

    .line 224
    .line 225
    new-instance v1, Ljava/util/HashMap;

    .line 226
    .line 227
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 228
    .line 229
    .line 230
    sput-object v1, Llg/c;->o:Ljava/util/HashMap;

    .line 231
    .line 232
    new-instance v1, Ljava/util/HashMap;

    .line 233
    .line 234
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 235
    .line 236
    .line 237
    sput-object v1, Llg/c;->p:Ljava/util/HashMap;

    .line 238
    .line 239
    const/16 v1, 0x8

    .line 240
    .line 241
    new-array v1, v1, [Llg/c$a;

    .line 242
    .line 243
    sget-object v2, Ljg/k$a;->T:Llh/c;

    .line 244
    .line 245
    invoke-static {v2}, Llh/b;->m(Llh/c;)Llh/b;

    .line 246
    .line 247
    .line 248
    move-result-object v2

    .line 249
    const-string v4, "topLevel(FqNames.iterable)"

    .line 250
    .line 251
    invoke-static {v2, v4}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    sget-object v4, Ljg/k$a;->b0:Llh/c;

    .line 255
    .line 256
    new-instance v5, Llh/b;

    .line 257
    .line 258
    invoke-virtual {v2}, Llh/b;->h()Llh/c;

    .line 259
    .line 260
    .line 261
    move-result-object v6

    .line 262
    invoke-virtual {v2}, Llh/b;->h()Llh/c;

    .line 263
    .line 264
    .line 265
    move-result-object v7

    .line 266
    const-string v8, "kotlinReadOnly.packageFqName"

    .line 267
    .line 268
    invoke-static {v7, v8}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 269
    .line 270
    .line 271
    invoke-static {v4, v7}, Llh/e;->g(Llh/c;Llh/c;)Llh/c;

    .line 272
    .line 273
    .line 274
    move-result-object v4

    .line 275
    const/4 v7, 0x0

    .line 276
    invoke-direct {v5, v6, v4, v7}, Llh/b;-><init>(Llh/c;Llh/c;Z)V

    .line 277
    .line 278
    .line 279
    new-instance v4, Llg/c$a;

    .line 280
    .line 281
    const-class v6, Ljava/lang/Iterable;

    .line 282
    .line 283
    invoke-direct {v0, v6}, Llg/c;->g(Ljava/lang/Class;)Llh/b;

    .line 284
    .line 285
    .line 286
    move-result-object v6

    .line 287
    invoke-direct {v4, v6, v2, v5}, Llg/c$a;-><init>(Llh/b;Llh/b;Llh/b;)V

    .line 288
    .line 289
    .line 290
    aput-object v4, v1, v7

    .line 291
    .line 292
    sget-object v2, Ljg/k$a;->S:Llh/c;

    .line 293
    .line 294
    invoke-static {v2}, Llh/b;->m(Llh/c;)Llh/b;

    .line 295
    .line 296
    .line 297
    move-result-object v2

    .line 298
    const-string v4, "topLevel(FqNames.iterator)"

    .line 299
    .line 300
    invoke-static {v2, v4}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 301
    .line 302
    .line 303
    sget-object v4, Ljg/k$a;->a0:Llh/c;

    .line 304
    .line 305
    new-instance v5, Llh/b;

    .line 306
    .line 307
    invoke-virtual {v2}, Llh/b;->h()Llh/c;

    .line 308
    .line 309
    .line 310
    move-result-object v6

    .line 311
    invoke-virtual {v2}, Llh/b;->h()Llh/c;

    .line 312
    .line 313
    .line 314
    move-result-object v9

    .line 315
    invoke-static {v9, v8}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 316
    .line 317
    .line 318
    invoke-static {v4, v9}, Llh/e;->g(Llh/c;Llh/c;)Llh/c;

    .line 319
    .line 320
    .line 321
    move-result-object v4

    .line 322
    invoke-direct {v5, v6, v4, v7}, Llh/b;-><init>(Llh/c;Llh/c;Z)V

    .line 323
    .line 324
    .line 325
    new-instance v4, Llg/c$a;

    .line 326
    .line 327
    const-class v6, Ljava/util/Iterator;

    .line 328
    .line 329
    invoke-direct {v0, v6}, Llg/c;->g(Ljava/lang/Class;)Llh/b;

    .line 330
    .line 331
    .line 332
    move-result-object v6

    .line 333
    invoke-direct {v4, v6, v2, v5}, Llg/c$a;-><init>(Llh/b;Llh/b;Llh/b;)V

    .line 334
    .line 335
    .line 336
    const/4 v2, 0x1

    .line 337
    aput-object v4, v1, v2

    .line 338
    .line 339
    sget-object v2, Ljg/k$a;->U:Llh/c;

    .line 340
    .line 341
    invoke-static {v2}, Llh/b;->m(Llh/c;)Llh/b;

    .line 342
    .line 343
    .line 344
    move-result-object v2

    .line 345
    const-string v4, "topLevel(FqNames.collection)"

    .line 346
    .line 347
    invoke-static {v2, v4}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 348
    .line 349
    .line 350
    sget-object v4, Ljg/k$a;->c0:Llh/c;

    .line 351
    .line 352
    new-instance v5, Llh/b;

    .line 353
    .line 354
    invoke-virtual {v2}, Llh/b;->h()Llh/c;

    .line 355
    .line 356
    .line 357
    move-result-object v6

    .line 358
    invoke-virtual {v2}, Llh/b;->h()Llh/c;

    .line 359
    .line 360
    .line 361
    move-result-object v9

    .line 362
    invoke-static {v9, v8}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 363
    .line 364
    .line 365
    invoke-static {v4, v9}, Llh/e;->g(Llh/c;Llh/c;)Llh/c;

    .line 366
    .line 367
    .line 368
    move-result-object v4

    .line 369
    invoke-direct {v5, v6, v4, v7}, Llh/b;-><init>(Llh/c;Llh/c;Z)V

    .line 370
    .line 371
    .line 372
    new-instance v4, Llg/c$a;

    .line 373
    .line 374
    const-class v6, Ljava/util/Collection;

    .line 375
    .line 376
    invoke-direct {v0, v6}, Llg/c;->g(Ljava/lang/Class;)Llh/b;

    .line 377
    .line 378
    .line 379
    move-result-object v6

    .line 380
    invoke-direct {v4, v6, v2, v5}, Llg/c$a;-><init>(Llh/b;Llh/b;Llh/b;)V

    .line 381
    .line 382
    .line 383
    const/4 v2, 0x2

    .line 384
    aput-object v4, v1, v2

    .line 385
    .line 386
    sget-object v2, Ljg/k$a;->V:Llh/c;

    .line 387
    .line 388
    invoke-static {v2}, Llh/b;->m(Llh/c;)Llh/b;

    .line 389
    .line 390
    .line 391
    move-result-object v2

    .line 392
    const-string v4, "topLevel(FqNames.list)"

    .line 393
    .line 394
    invoke-static {v2, v4}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 395
    .line 396
    .line 397
    sget-object v4, Ljg/k$a;->d0:Llh/c;

    .line 398
    .line 399
    new-instance v5, Llh/b;

    .line 400
    .line 401
    invoke-virtual {v2}, Llh/b;->h()Llh/c;

    .line 402
    .line 403
    .line 404
    move-result-object v6

    .line 405
    invoke-virtual {v2}, Llh/b;->h()Llh/c;

    .line 406
    .line 407
    .line 408
    move-result-object v9

    .line 409
    invoke-static {v9, v8}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 410
    .line 411
    .line 412
    invoke-static {v4, v9}, Llh/e;->g(Llh/c;Llh/c;)Llh/c;

    .line 413
    .line 414
    .line 415
    move-result-object v4

    .line 416
    invoke-direct {v5, v6, v4, v7}, Llh/b;-><init>(Llh/c;Llh/c;Z)V

    .line 417
    .line 418
    .line 419
    new-instance v4, Llg/c$a;

    .line 420
    .line 421
    const-class v6, Ljava/util/List;

    .line 422
    .line 423
    invoke-direct {v0, v6}, Llg/c;->g(Ljava/lang/Class;)Llh/b;

    .line 424
    .line 425
    .line 426
    move-result-object v6

    .line 427
    invoke-direct {v4, v6, v2, v5}, Llg/c$a;-><init>(Llh/b;Llh/b;Llh/b;)V

    .line 428
    .line 429
    .line 430
    const/4 v2, 0x3

    .line 431
    aput-object v4, v1, v2

    .line 432
    .line 433
    sget-object v2, Ljg/k$a;->X:Llh/c;

    .line 434
    .line 435
    invoke-static {v2}, Llh/b;->m(Llh/c;)Llh/b;

    .line 436
    .line 437
    .line 438
    move-result-object v2

    .line 439
    const-string v4, "topLevel(FqNames.set)"

    .line 440
    .line 441
    invoke-static {v2, v4}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 442
    .line 443
    .line 444
    sget-object v4, Ljg/k$a;->f0:Llh/c;

    .line 445
    .line 446
    new-instance v5, Llh/b;

    .line 447
    .line 448
    invoke-virtual {v2}, Llh/b;->h()Llh/c;

    .line 449
    .line 450
    .line 451
    move-result-object v6

    .line 452
    invoke-virtual {v2}, Llh/b;->h()Llh/c;

    .line 453
    .line 454
    .line 455
    move-result-object v9

    .line 456
    invoke-static {v9, v8}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 457
    .line 458
    .line 459
    invoke-static {v4, v9}, Llh/e;->g(Llh/c;Llh/c;)Llh/c;

    .line 460
    .line 461
    .line 462
    move-result-object v4

    .line 463
    invoke-direct {v5, v6, v4, v7}, Llh/b;-><init>(Llh/c;Llh/c;Z)V

    .line 464
    .line 465
    .line 466
    new-instance v4, Llg/c$a;

    .line 467
    .line 468
    const-class v6, Ljava/util/Set;

    .line 469
    .line 470
    invoke-direct {v0, v6}, Llg/c;->g(Ljava/lang/Class;)Llh/b;

    .line 471
    .line 472
    .line 473
    move-result-object v6

    .line 474
    invoke-direct {v4, v6, v2, v5}, Llg/c$a;-><init>(Llh/b;Llh/b;Llh/b;)V

    .line 475
    .line 476
    .line 477
    const/4 v2, 0x4

    .line 478
    aput-object v4, v1, v2

    .line 479
    .line 480
    sget-object v2, Ljg/k$a;->W:Llh/c;

    .line 481
    .line 482
    invoke-static {v2}, Llh/b;->m(Llh/c;)Llh/b;

    .line 483
    .line 484
    .line 485
    move-result-object v2

    .line 486
    const-string v4, "topLevel(FqNames.listIterator)"

    .line 487
    .line 488
    invoke-static {v2, v4}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 489
    .line 490
    .line 491
    sget-object v4, Ljg/k$a;->e0:Llh/c;

    .line 492
    .line 493
    new-instance v5, Llh/b;

    .line 494
    .line 495
    invoke-virtual {v2}, Llh/b;->h()Llh/c;

    .line 496
    .line 497
    .line 498
    move-result-object v6

    .line 499
    invoke-virtual {v2}, Llh/b;->h()Llh/c;

    .line 500
    .line 501
    .line 502
    move-result-object v9

    .line 503
    invoke-static {v9, v8}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 504
    .line 505
    .line 506
    invoke-static {v4, v9}, Llh/e;->g(Llh/c;Llh/c;)Llh/c;

    .line 507
    .line 508
    .line 509
    move-result-object v4

    .line 510
    invoke-direct {v5, v6, v4, v7}, Llh/b;-><init>(Llh/c;Llh/c;Z)V

    .line 511
    .line 512
    .line 513
    new-instance v4, Llg/c$a;

    .line 514
    .line 515
    const-class v6, Ljava/util/ListIterator;

    .line 516
    .line 517
    invoke-direct {v0, v6}, Llg/c;->g(Ljava/lang/Class;)Llh/b;

    .line 518
    .line 519
    .line 520
    move-result-object v6

    .line 521
    invoke-direct {v4, v6, v2, v5}, Llg/c$a;-><init>(Llh/b;Llh/b;Llh/b;)V

    .line 522
    .line 523
    .line 524
    const/4 v2, 0x5

    .line 525
    aput-object v4, v1, v2

    .line 526
    .line 527
    sget-object v2, Ljg/k$a;->Y:Llh/c;

    .line 528
    .line 529
    invoke-static {v2}, Llh/b;->m(Llh/c;)Llh/b;

    .line 530
    .line 531
    .line 532
    move-result-object v4

    .line 533
    const-string v5, "topLevel(FqNames.map)"

    .line 534
    .line 535
    invoke-static {v4, v5}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 536
    .line 537
    .line 538
    sget-object v5, Ljg/k$a;->g0:Llh/c;

    .line 539
    .line 540
    new-instance v6, Llh/b;

    .line 541
    .line 542
    invoke-virtual {v4}, Llh/b;->h()Llh/c;

    .line 543
    .line 544
    .line 545
    move-result-object v9

    .line 546
    invoke-virtual {v4}, Llh/b;->h()Llh/c;

    .line 547
    .line 548
    .line 549
    move-result-object v10

    .line 550
    invoke-static {v10, v8}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 551
    .line 552
    .line 553
    invoke-static {v5, v10}, Llh/e;->g(Llh/c;Llh/c;)Llh/c;

    .line 554
    .line 555
    .line 556
    move-result-object v5

    .line 557
    invoke-direct {v6, v9, v5, v7}, Llh/b;-><init>(Llh/c;Llh/c;Z)V

    .line 558
    .line 559
    .line 560
    new-instance v5, Llg/c$a;

    .line 561
    .line 562
    const-class v9, Ljava/util/Map;

    .line 563
    .line 564
    invoke-direct {v0, v9}, Llg/c;->g(Ljava/lang/Class;)Llh/b;

    .line 565
    .line 566
    .line 567
    move-result-object v9

    .line 568
    invoke-direct {v5, v9, v4, v6}, Llg/c$a;-><init>(Llh/b;Llh/b;Llh/b;)V

    .line 569
    .line 570
    .line 571
    const/4 v4, 0x6

    .line 572
    aput-object v5, v1, v4

    .line 573
    .line 574
    invoke-static {v2}, Llh/b;->m(Llh/c;)Llh/b;

    .line 575
    .line 576
    .line 577
    move-result-object v2

    .line 578
    sget-object v4, Ljg/k$a;->Z:Llh/c;

    .line 579
    .line 580
    invoke-virtual {v4}, Llh/c;->g()Llh/f;

    .line 581
    .line 582
    .line 583
    move-result-object v4

    .line 584
    invoke-virtual {v2, v4}, Llh/b;->d(Llh/f;)Llh/b;

    .line 585
    .line 586
    .line 587
    move-result-object v2

    .line 588
    const-string v4, "topLevel(FqNames.map).cr\u2026mes.mapEntry.shortName())"

    .line 589
    .line 590
    invoke-static {v2, v4}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 591
    .line 592
    .line 593
    sget-object v4, Ljg/k$a;->h0:Llh/c;

    .line 594
    .line 595
    new-instance v5, Llh/b;

    .line 596
    .line 597
    invoke-virtual {v2}, Llh/b;->h()Llh/c;

    .line 598
    .line 599
    .line 600
    move-result-object v6

    .line 601
    invoke-virtual {v2}, Llh/b;->h()Llh/c;

    .line 602
    .line 603
    .line 604
    move-result-object v9

    .line 605
    invoke-static {v9, v8}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 606
    .line 607
    .line 608
    invoke-static {v4, v9}, Llh/e;->g(Llh/c;Llh/c;)Llh/c;

    .line 609
    .line 610
    .line 611
    move-result-object v4

    .line 612
    invoke-direct {v5, v6, v4, v7}, Llh/b;-><init>(Llh/c;Llh/c;Z)V

    .line 613
    .line 614
    .line 615
    new-instance v4, Llg/c$a;

    .line 616
    .line 617
    const-class v6, Ljava/util/Map$Entry;

    .line 618
    .line 619
    invoke-direct {v0, v6}, Llg/c;->g(Ljava/lang/Class;)Llh/b;

    .line 620
    .line 621
    .line 622
    move-result-object v6

    .line 623
    invoke-direct {v4, v6, v2, v5}, Llg/c$a;-><init>(Llh/b;Llh/b;Llh/b;)V

    .line 624
    .line 625
    .line 626
    const/4 v2, 0x7

    .line 627
    aput-object v4, v1, v2

    .line 628
    .line 629
    invoke-static {v1}, Lkotlin/collections/h;->l([Ljava/lang/Object;)Ljava/util/List;

    .line 630
    .line 631
    .line 632
    move-result-object v1

    .line 633
    sput-object v1, Llg/c;->q:Ljava/util/List;

    .line 634
    .line 635
    const-class v2, Ljava/lang/Object;

    .line 636
    .line 637
    sget-object v4, Ljg/k$a;->b:Llh/d;

    .line 638
    .line 639
    invoke-direct {v0, v2, v4}, Llg/c;->f(Ljava/lang/Class;Llh/d;)V

    .line 640
    .line 641
    .line 642
    const-class v2, Ljava/lang/String;

    .line 643
    .line 644
    sget-object v4, Ljg/k$a;->h:Llh/d;

    .line 645
    .line 646
    invoke-direct {v0, v2, v4}, Llg/c;->f(Ljava/lang/Class;Llh/d;)V

    .line 647
    .line 648
    .line 649
    const-class v2, Ljava/lang/CharSequence;

    .line 650
    .line 651
    sget-object v4, Ljg/k$a;->g:Llh/d;

    .line 652
    .line 653
    invoke-direct {v0, v2, v4}, Llg/c;->f(Ljava/lang/Class;Llh/d;)V

    .line 654
    .line 655
    .line 656
    const-class v2, Ljava/lang/Throwable;

    .line 657
    .line 658
    sget-object v4, Ljg/k$a;->u:Llh/c;

    .line 659
    .line 660
    invoke-direct {v0, v2, v4}, Llg/c;->e(Ljava/lang/Class;Llh/c;)V

    .line 661
    .line 662
    .line 663
    const-class v2, Ljava/lang/Cloneable;

    .line 664
    .line 665
    sget-object v4, Ljg/k$a;->d:Llh/d;

    .line 666
    .line 667
    invoke-direct {v0, v2, v4}, Llg/c;->f(Ljava/lang/Class;Llh/d;)V

    .line 668
    .line 669
    .line 670
    const-class v2, Ljava/lang/Number;

    .line 671
    .line 672
    sget-object v4, Ljg/k$a;->r:Llh/d;

    .line 673
    .line 674
    invoke-direct {v0, v2, v4}, Llg/c;->f(Ljava/lang/Class;Llh/d;)V

    .line 675
    .line 676
    .line 677
    const-class v2, Ljava/lang/Comparable;

    .line 678
    .line 679
    sget-object v4, Ljg/k$a;->v:Llh/c;

    .line 680
    .line 681
    invoke-direct {v0, v2, v4}, Llg/c;->e(Ljava/lang/Class;Llh/c;)V

    .line 682
    .line 683
    .line 684
    const-class v2, Ljava/lang/Enum;

    .line 685
    .line 686
    sget-object v4, Ljg/k$a;->s:Llh/d;

    .line 687
    .line 688
    invoke-direct {v0, v2, v4}, Llg/c;->f(Ljava/lang/Class;Llh/d;)V

    .line 689
    .line 690
    .line 691
    const-class v2, Ljava/lang/annotation/Annotation;

    .line 692
    .line 693
    sget-object v4, Ljg/k$a;->G:Llh/c;

    .line 694
    .line 695
    invoke-direct {v0, v2, v4}, Llg/c;->e(Ljava/lang/Class;Llh/c;)V

    .line 696
    .line 697
    .line 698
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 699
    .line 700
    .line 701
    move-result-object v0

    .line 702
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 703
    .line 704
    .line 705
    move-result v1

    .line 706
    if-eqz v1, :cond_0

    .line 707
    .line 708
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 709
    .line 710
    .line 711
    move-result-object v1

    .line 712
    check-cast v1, Llg/c$a;

    .line 713
    .line 714
    sget-object v2, Llg/c;->a:Llg/c;

    .line 715
    .line 716
    invoke-direct {v2, v1}, Llg/c;->d(Llg/c$a;)V

    .line 717
    .line 718
    .line 719
    goto :goto_0

    .line 720
    :cond_0
    invoke-static {}, Luh/e;->values()[Luh/e;

    .line 721
    .line 722
    .line 723
    move-result-object v0

    .line 724
    array-length v1, v0

    .line 725
    move v2, v7

    .line 726
    :goto_1
    if-ge v2, v1, :cond_1

    .line 727
    .line 728
    aget-object v4, v0, v2

    .line 729
    .line 730
    sget-object v5, Llg/c;->a:Llg/c;

    .line 731
    .line 732
    invoke-virtual {v4}, Luh/e;->i()Llh/c;

    .line 733
    .line 734
    .line 735
    move-result-object v6

    .line 736
    invoke-static {v6}, Llh/b;->m(Llh/c;)Llh/b;

    .line 737
    .line 738
    .line 739
    move-result-object v6

    .line 740
    const-string v8, "topLevel(jvmType.wrapperFqName)"

    .line 741
    .line 742
    invoke-static {v6, v8}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 743
    .line 744
    .line 745
    invoke-virtual {v4}, Luh/e;->h()Ljg/i;

    .line 746
    .line 747
    .line 748
    move-result-object v4

    .line 749
    const-string v8, "jvmType.primitiveType"

    .line 750
    .line 751
    invoke-static {v4, v8}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 752
    .line 753
    .line 754
    invoke-static {v4}, Ljg/k;->c(Ljg/i;)Llh/c;

    .line 755
    .line 756
    .line 757
    move-result-object v4

    .line 758
    invoke-static {v4}, Llh/b;->m(Llh/c;)Llh/b;

    .line 759
    .line 760
    .line 761
    move-result-object v4

    .line 762
    const-string v8, "topLevel(StandardNames.g\u2026e(jvmType.primitiveType))"

    .line 763
    .line 764
    invoke-static {v4, v8}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 765
    .line 766
    .line 767
    invoke-direct {v5, v6, v4}, Llg/c;->a(Llh/b;Llh/b;)V

    .line 768
    .line 769
    .line 770
    add-int/lit8 v2, v2, 0x1

    .line 771
    .line 772
    goto :goto_1

    .line 773
    :cond_1
    sget-object v0, Ljg/c;->a:Ljg/c;

    .line 774
    .line 775
    invoke-virtual {v0}, Ljg/c;->a()Ljava/util/Set;

    .line 776
    .line 777
    .line 778
    move-result-object v0

    .line 779
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 780
    .line 781
    .line 782
    move-result-object v0

    .line 783
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 784
    .line 785
    .line 786
    move-result v1

    .line 787
    if-eqz v1, :cond_2

    .line 788
    .line 789
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 790
    .line 791
    .line 792
    move-result-object v1

    .line 793
    check-cast v1, Llh/b;

    .line 794
    .line 795
    sget-object v2, Llg/c;->a:Llg/c;

    .line 796
    .line 797
    new-instance v4, Llh/c;

    .line 798
    .line 799
    new-instance v5, Ljava/lang/StringBuilder;

    .line 800
    .line 801
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 802
    .line 803
    .line 804
    const-string v6, "kotlin.jvm.internal."

    .line 805
    .line 806
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 807
    .line 808
    .line 809
    invoke-virtual {v1}, Llh/b;->j()Llh/f;

    .line 810
    .line 811
    .line 812
    move-result-object v6

    .line 813
    invoke-virtual {v6}, Llh/f;->b()Ljava/lang/String;

    .line 814
    .line 815
    .line 816
    move-result-object v6

    .line 817
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 818
    .line 819
    .line 820
    const-string v6, "CompanionObject"

    .line 821
    .line 822
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 823
    .line 824
    .line 825
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 826
    .line 827
    .line 828
    move-result-object v5

    .line 829
    invoke-direct {v4, v5}, Llh/c;-><init>(Ljava/lang/String;)V

    .line 830
    .line 831
    .line 832
    invoke-static {v4}, Llh/b;->m(Llh/c;)Llh/b;

    .line 833
    .line 834
    .line 835
    move-result-object v4

    .line 836
    const-string v5, "topLevel(FqName(\"kotlin.\u2026g() + \"CompanionObject\"))"

    .line 837
    .line 838
    invoke-static {v4, v5}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 839
    .line 840
    .line 841
    sget-object v5, Llh/h;->d:Llh/f;

    .line 842
    .line 843
    invoke-virtual {v1, v5}, Llh/b;->d(Llh/f;)Llh/b;

    .line 844
    .line 845
    .line 846
    move-result-object v1

    .line 847
    const-string v5, "classId.createNestedClas\u2026AME_FOR_COMPANION_OBJECT)"

    .line 848
    .line 849
    invoke-static {v1, v5}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 850
    .line 851
    .line 852
    invoke-direct {v2, v4, v1}, Llg/c;->a(Llh/b;Llh/b;)V

    .line 853
    .line 854
    .line 855
    goto :goto_2

    .line 856
    :cond_2
    move v0, v7

    .line 857
    :goto_3
    const/16 v1, 0x17

    .line 858
    .line 859
    if-ge v0, v1, :cond_3

    .line 860
    .line 861
    sget-object v1, Llg/c;->a:Llg/c;

    .line 862
    .line 863
    new-instance v2, Llh/c;

    .line 864
    .line 865
    new-instance v4, Ljava/lang/StringBuilder;

    .line 866
    .line 867
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 868
    .line 869
    .line 870
    const-string v5, "kotlin.jvm.functions.Function"

    .line 871
    .line 872
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 873
    .line 874
    .line 875
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 876
    .line 877
    .line 878
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 879
    .line 880
    .line 881
    move-result-object v4

    .line 882
    invoke-direct {v2, v4}, Llh/c;-><init>(Ljava/lang/String;)V

    .line 883
    .line 884
    .line 885
    invoke-static {v2}, Llh/b;->m(Llh/c;)Llh/b;

    .line 886
    .line 887
    .line 888
    move-result-object v2

    .line 889
    const-string v4, "topLevel(FqName(\"kotlin.\u2026m.functions.Function$i\"))"

    .line 890
    .line 891
    invoke-static {v2, v4}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 892
    .line 893
    .line 894
    invoke-static {v0}, Ljg/k;->a(I)Llh/b;

    .line 895
    .line 896
    .line 897
    move-result-object v4

    .line 898
    invoke-direct {v1, v2, v4}, Llg/c;->a(Llh/b;Llh/b;)V

    .line 899
    .line 900
    .line 901
    new-instance v2, Llh/c;

    .line 902
    .line 903
    new-instance v4, Ljava/lang/StringBuilder;

    .line 904
    .line 905
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 906
    .line 907
    .line 908
    sget-object v5, Llg/c;->c:Ljava/lang/String;

    .line 909
    .line 910
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 911
    .line 912
    .line 913
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 914
    .line 915
    .line 916
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 917
    .line 918
    .line 919
    move-result-object v4

    .line 920
    invoke-direct {v2, v4}, Llh/c;-><init>(Ljava/lang/String;)V

    .line 921
    .line 922
    .line 923
    sget-object v4, Llg/c;->h:Llh/b;

    .line 924
    .line 925
    invoke-direct {v1, v2, v4}, Llg/c;->c(Llh/c;Llh/b;)V

    .line 926
    .line 927
    .line 928
    add-int/lit8 v0, v0, 0x1

    .line 929
    .line 930
    goto :goto_3

    .line 931
    :cond_3
    :goto_4
    const/16 v0, 0x16

    .line 932
    .line 933
    if-ge v7, v0, :cond_4

    .line 934
    .line 935
    sget-object v0, Lkg/c;->s:Lkg/c;

    .line 936
    .line 937
    new-instance v1, Ljava/lang/StringBuilder;

    .line 938
    .line 939
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 940
    .line 941
    .line 942
    invoke-virtual {v0}, Lkg/c;->c()Llh/c;

    .line 943
    .line 944
    .line 945
    move-result-object v2

    .line 946
    invoke-virtual {v2}, Llh/c;->toString()Ljava/lang/String;

    .line 947
    .line 948
    .line 949
    move-result-object v2

    .line 950
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 951
    .line 952
    .line 953
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 954
    .line 955
    .line 956
    invoke-virtual {v0}, Lkg/c;->b()Ljava/lang/String;

    .line 957
    .line 958
    .line 959
    move-result-object v0

    .line 960
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 961
    .line 962
    .line 963
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 964
    .line 965
    .line 966
    move-result-object v0

    .line 967
    sget-object v1, Llg/c;->a:Llg/c;

    .line 968
    .line 969
    new-instance v2, Llh/c;

    .line 970
    .line 971
    new-instance v4, Ljava/lang/StringBuilder;

    .line 972
    .line 973
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 974
    .line 975
    .line 976
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 977
    .line 978
    .line 979
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 980
    .line 981
    .line 982
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 983
    .line 984
    .line 985
    move-result-object v0

    .line 986
    invoke-direct {v2, v0}, Llh/c;-><init>(Ljava/lang/String;)V

    .line 987
    .line 988
    .line 989
    sget-object v0, Llg/c;->h:Llh/b;

    .line 990
    .line 991
    invoke-direct {v1, v2, v0}, Llg/c;->c(Llh/c;Llh/b;)V

    .line 992
    .line 993
    .line 994
    add-int/lit8 v7, v7, 0x1

    .line 995
    .line 996
    goto :goto_4

    .line 997
    :cond_4
    sget-object v0, Llg/c;->a:Llg/c;

    .line 998
    .line 999
    sget-object v1, Ljg/k$a;->c:Llh/d;

    .line 1000
    .line 1001
    invoke-virtual {v1}, Llh/d;->l()Llh/c;

    .line 1002
    .line 1003
    .line 1004
    move-result-object v1

    .line 1005
    const-string v2, "nothing.toSafe()"

    .line 1006
    .line 1007
    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1008
    .line 1009
    .line 1010
    const-class v2, Ljava/lang/Void;

    .line 1011
    .line 1012
    invoke-direct {v0, v2}, Llg/c;->g(Ljava/lang/Class;)Llh/b;

    .line 1013
    .line 1014
    .line 1015
    move-result-object v2

    .line 1016
    invoke-direct {v0, v1, v2}, Llg/c;->c(Llh/c;Llh/b;)V

    .line 1017
    .line 1018
    .line 1019
    return-void
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a(Llh/b;Llh/b;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1, p2}, Llg/c;->b(Llh/b;Llh/b;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Llh/b;->b()Llh/c;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    const-string v0, "kotlinClassId.asSingleFqName()"

    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0, p2, p1}, Llg/c;->c(Llh/c;Llh/b;)V

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

.method private final b(Llh/b;Llh/b;)V
    .locals 2

    sget-object v0, Llg/c;->k:Ljava/util/HashMap;

    invoke-virtual {p1}, Llh/b;->b()Llh/c;

    move-result-object p1

    invoke-virtual {p1}, Llh/c;->j()Llh/d;

    move-result-object p1

    const-string v1, "javaClassId.asSingleFqName().toUnsafe()"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private final c(Llh/c;Llh/b;)V
    .locals 2

    sget-object v0, Llg/c;->l:Ljava/util/HashMap;

    invoke-virtual {p1}, Llh/c;->j()Llh/d;

    move-result-object p1

    const-string v1, "kotlinFqNameUnsafe.toUnsafe()"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private final d(Llg/c$a;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Llg/c$a;->a()Llh/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Llg/c$a;->b()Llh/b;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p1}, Llg/c$a;->c()Llh/b;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-direct {p0, v0, v1}, Llg/c;->a(Llh/b;Llh/b;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Llh/b;->b()Llh/c;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    const-string v3, "mutableClassId.asSingleFqName()"

    .line 21
    .line 22
    invoke-static {v2, v3}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-direct {p0, v2, v0}, Llg/c;->c(Llh/c;Llh/b;)V

    .line 26
    .line 27
    .line 28
    sget-object v0, Llg/c;->o:Ljava/util/HashMap;

    .line 29
    .line 30
    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    sget-object v0, Llg/c;->p:Ljava/util/HashMap;

    .line 34
    .line 35
    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Llh/b;->b()Llh/c;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    const-string v1, "readOnlyClassId.asSingleFqName()"

    .line 43
    .line 44
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1}, Llh/b;->b()Llh/c;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    sget-object v2, Llg/c;->m:Ljava/util/HashMap;

    .line 55
    .line 56
    invoke-virtual {p1}, Llh/b;->b()Llh/c;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-virtual {p1}, Llh/c;->j()Llh/d;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    const-string v3, "mutableClassId.asSingleFqName().toUnsafe()"

    .line 65
    .line 66
    invoke-static {p1, v3}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-interface {v2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    sget-object p1, Llg/c;->n:Ljava/util/HashMap;

    .line 73
    .line 74
    invoke-virtual {v0}, Llh/c;->j()Llh/d;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    const-string v2, "readOnlyFqName.toUnsafe()"

    .line 79
    .line 80
    invoke-static {v0, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    return-void
    .line 87
    .line 88
    .line 89
    .line 90
.end method

.method private final e(Ljava/lang/Class;Llh/c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Llh/c;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1}, Llg/c;->g(Ljava/lang/Class;)Llh/b;

    move-result-object p1

    invoke-static {p2}, Llh/b;->m(Llh/c;)Llh/b;

    move-result-object p2

    const-string v0, "topLevel(kotlinFqName)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Llg/c;->a(Llh/b;Llh/b;)V

    return-void
.end method

.method private final f(Ljava/lang/Class;Llh/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Llh/d;",
            ")V"
        }
    .end annotation

    invoke-virtual {p2}, Llh/d;->l()Llh/c;

    move-result-object p2

    const-string v0, "kotlinFqName.toSafe()"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Llg/c;->e(Ljava/lang/Class;Llh/c;)V

    return-void
.end method

.method private final g(Ljava/lang/Class;)Llh/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Llh/b;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Class;->isPrimitive()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Class;->isArray()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaringClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    new-instance v0, Llh/c;

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-direct {v0, p1}, Llh/c;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-static {v0}, Llh/b;->m(Llh/c;)Llh/b;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    const-string v0, "topLevel(FqName(clazz.canonicalName))"

    .line 31
    .line 32
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    invoke-direct {p0, v0}, Llg/c;->g(Ljava/lang/Class;)Llh/b;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-static {p1}, Llh/f;->h(Ljava/lang/String;)Llh/f;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-virtual {v0, p1}, Llh/b;->d(Llh/f;)Llh/b;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    const-string v0, "classId(outer).createNes\u2026tifier(clazz.simpleName))"

    .line 53
    .line 54
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    :goto_0
    return-object p1
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

.method private final j(Llh/d;Ljava/lang/String;)Z
    .locals 4

    .line 1
    invoke-virtual {p1}, Llh/d;->b()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-string v0, "kotlinFqName.asString()"

    .line 6
    .line 7
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string v0, ""

    .line 11
    .line 12
    invoke-static {p1, p2, v0}, Lpi/l;->I0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    const/4 v0, 0x1

    .line 21
    const/4 v1, 0x0

    .line 22
    if-lez p2, :cond_0

    .line 23
    .line 24
    move p2, v0

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move p2, v1

    .line 27
    :goto_0
    if-eqz p2, :cond_2

    .line 28
    .line 29
    const/4 p2, 0x2

    .line 30
    const/4 v2, 0x0

    .line 31
    const/16 v3, 0x30

    .line 32
    .line 33
    invoke-static {p1, v3, v1, p2, v2}, Lpi/l;->E0(Ljava/lang/CharSequence;CZILjava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    if-nez p2, :cond_2

    .line 38
    .line 39
    invoke-static {p1}, Lpi/l;->m(Ljava/lang/String;)Ljava/lang/Integer;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    if-eqz p1, :cond_1

    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    const/16 p2, 0x17

    .line 50
    .line 51
    if-lt p1, p2, :cond_1

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    move v0, v1

    .line 55
    :goto_1
    return v0

    .line 56
    :cond_2
    return v1
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
.end method


# virtual methods
.method public final h()Llh/c;
    .locals 1

    sget-object v0, Llg/c;->g:Llh/c;

    return-object v0
.end method

.method public final i()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Llg/c$a;",
            ">;"
        }
    .end annotation

    sget-object v0, Llg/c;->q:Ljava/util/List;

    return-object v0
.end method

.method public final k(Llh/d;)Z
    .locals 1

    sget-object v0, Llg/c;->m:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final l(Llh/d;)Z
    .locals 1

    sget-object v0, Llg/c;->n:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final m(Llh/c;)Llh/b;
    .locals 1

    .line 1
    const-string v0, "fqName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Llg/c;->k:Ljava/util/HashMap;

    .line 7
    .line 8
    invoke-virtual {p1}, Llh/c;->j()Llh/d;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, Llh/b;

    .line 17
    .line 18
    return-object p1
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

.method public final n(Llh/d;)Llh/b;
    .locals 1

    .line 1
    const-string v0, "kotlinFqName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Llg/c;->b:Ljava/lang/String;

    .line 7
    .line 8
    invoke-direct {p0, p1, v0}, Llg/c;->j(Llh/d;Ljava/lang/String;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    sget-object p1, Llg/c;->f:Llh/b;

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    sget-object v0, Llg/c;->d:Ljava/lang/String;

    .line 18
    .line 19
    invoke-direct {p0, p1, v0}, Llg/c;->j(Llh/d;Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    sget-object p1, Llg/c;->f:Llh/b;

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    sget-object v0, Llg/c;->c:Ljava/lang/String;

    .line 29
    .line 30
    invoke-direct {p0, p1, v0}, Llg/c;->j(Llh/d;Ljava/lang/String;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    sget-object p1, Llg/c;->h:Llh/b;

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    sget-object v0, Llg/c;->e:Ljava/lang/String;

    .line 40
    .line 41
    invoke-direct {p0, p1, v0}, Llg/c;->j(Llh/d;Ljava/lang/String;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_3

    .line 46
    .line 47
    sget-object p1, Llg/c;->h:Llh/b;

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_3
    sget-object v0, Llg/c;->l:Ljava/util/HashMap;

    .line 51
    .line 52
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    check-cast p1, Llh/b;

    .line 57
    .line 58
    :goto_0
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
.end method

.method public final o(Llh/d;)Llh/c;
    .locals 1

    sget-object v0, Llg/c;->m:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Llh/c;

    return-object p1
.end method

.method public final p(Llh/d;)Llh/c;
    .locals 1

    sget-object v0, Llg/c;->n:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Llh/c;

    return-object p1
.end method
