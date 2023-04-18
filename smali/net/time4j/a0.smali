.class public final Lnet/time4j/a0;
.super Lfj/k0;
.source "SourceFile"

# interfaces
.implements Lmj/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/time4j/a0$g;,
        Lnet/time4j/a0$f;,
        Lnet/time4j/a0$b;,
        Lnet/time4j/a0$e;,
        Lnet/time4j/a0$c;,
        Lnet/time4j/a0$d;,
        Lnet/time4j/a0$h;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lfj/k0<",
        "Ljava/util/concurrent/TimeUnit;",
        "Lnet/time4j/a0;",
        ">;",
        "Lmj/g;"
    }
.end annotation

.annotation runtime Lgj/c;
    value = "iso8601"
.end annotation


# static fields
.field private static final m:J

.field private static final n:J

.field private static final o:Lnet/time4j/a0;

.field private static final p:Lnet/time4j/a0;

.field private static final q:Lnet/time4j/a0;

.field private static final r:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lfj/p<",
            "*>;>;"
        }
    .end annotation
.end field

.field private static final s:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lfj/p<",
            "*>;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private static final serialVersionUID:J = -0x2c4f67bd83444cc2L

.field private static final t:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/util/concurrent/TimeUnit;",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation
.end field

.field private static final u:Lfj/h0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfj/h0<",
            "Ljava/util/concurrent/TimeUnit;",
            "Lnet/time4j/a0;",
            ">;"
        }
    .end annotation
.end field

.field public static final v:Lnet/time4j/a0;

.field public static final w:Lfj/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfj/p<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field public static final x:Lfj/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfj/p<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final y:Lfj/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfj/p<",
            "Ljava/util/concurrent/TimeUnit;",
            ">;"
        }
    .end annotation
.end field

.field private static final z:Lfj/v;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfj/v<",
            "Lnet/time4j/a0;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final transient k:J

.field private final transient l:I


# direct methods
.method static constructor <clinit>()V
    .locals 15

    .line 1
    const v0, -0x3b9ac9ff

    .line 2
    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-static {v0, v1, v1}, Lnet/time4j/base/b;->j(III)J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    const/16 v3, 0xc

    .line 14
    .line 15
    const/16 v4, 0x1f

    .line 16
    .line 17
    const v5, 0x3b9ac9ff

    .line 18
    .line 19
    .line 20
    invoke-static {v5, v3, v4}, Lnet/time4j/base/b;->j(III)J

    .line 21
    .line 22
    .line 23
    move-result-wide v3

    .line 24
    sget-object v6, Lfj/a0;->l:Lfj/a0;

    .line 25
    .line 26
    sget-object v7, Lfj/a0;->m:Lfj/a0;

    .line 27
    .line 28
    invoke-virtual {v6, v0, v1, v7}, Lfj/a0;->l(JLfj/a0;)J

    .line 29
    .line 30
    .line 31
    move-result-wide v0

    .line 32
    const-wide/32 v8, 0x15180

    .line 33
    .line 34
    .line 35
    mul-long/2addr v0, v8

    .line 36
    sput-wide v0, Lnet/time4j/a0;->m:J

    .line 37
    .line 38
    invoke-virtual {v6, v3, v4, v7}, Lfj/a0;->l(JLfj/a0;)J

    .line 39
    .line 40
    .line 41
    move-result-wide v3

    .line 42
    mul-long/2addr v3, v8

    .line 43
    const-wide/32 v6, 0x1517f

    .line 44
    .line 45
    .line 46
    add-long/2addr v3, v6

    .line 47
    sput-wide v3, Lnet/time4j/a0;->n:J

    .line 48
    .line 49
    new-instance v6, Lnet/time4j/a0;

    .line 50
    .line 51
    sget-object v7, Lmj/f;->k:Lmj/f;

    .line 52
    .line 53
    const/4 v8, 0x0

    .line 54
    invoke-direct {v6, v0, v1, v8, v7}, Lnet/time4j/a0;-><init>(JILmj/f;)V

    .line 55
    .line 56
    .line 57
    sput-object v6, Lnet/time4j/a0;->o:Lnet/time4j/a0;

    .line 58
    .line 59
    new-instance v0, Lnet/time4j/a0;

    .line 60
    .line 61
    invoke-direct {v0, v3, v4, v5, v7}, Lnet/time4j/a0;-><init>(JILmj/f;)V

    .line 62
    .line 63
    .line 64
    sput-object v0, Lnet/time4j/a0;->p:Lnet/time4j/a0;

    .line 65
    .line 66
    new-instance v1, Lnet/time4j/a0;

    .line 67
    .line 68
    const-wide/32 v3, 0x3c3b880

    .line 69
    .line 70
    .line 71
    invoke-direct {v1, v3, v4, v8, v7}, Lnet/time4j/a0;-><init>(JILmj/f;)V

    .line 72
    .line 73
    .line 74
    sput-object v1, Lnet/time4j/a0;->q:Lnet/time4j/a0;

    .line 75
    .line 76
    new-instance v1, Ljava/util/HashSet;

    .line 77
    .line 78
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 79
    .line 80
    .line 81
    sget-object v3, Lnet/time4j/g0;->F:Lnet/time4j/k0;

    .line 82
    .line 83
    invoke-interface {v1, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    sget-object v3, Lnet/time4j/g0;->E:Lnet/time4j/k0;

    .line 87
    .line 88
    invoke-interface {v1, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    sget-object v3, Lnet/time4j/g0;->D:Lnet/time4j/k0;

    .line 92
    .line 93
    invoke-interface {v1, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    sget-object v3, Lnet/time4j/g0;->C:Lnet/time4j/c;

    .line 97
    .line 98
    invoke-interface {v1, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    sget-object v3, Lnet/time4j/g0;->B:Lnet/time4j/c;

    .line 102
    .line 103
    invoke-interface {v1, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    sget-object v3, Lnet/time4j/g0;->A:Lnet/time4j/c1;

    .line 107
    .line 108
    invoke-interface {v1, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    sget-object v3, Lnet/time4j/g0;->G:Lnet/time4j/k0;

    .line 112
    .line 113
    invoke-interface {v1, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    sget-object v3, Lnet/time4j/g0;->H:Lnet/time4j/k0;

    .line 117
    .line 118
    invoke-interface {v1, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    sput-object v1, Lnet/time4j/a0;->r:Ljava/util/Set;

    .line 126
    .line 127
    new-instance v1, Ljava/util/HashMap;

    .line 128
    .line 129
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 130
    .line 131
    .line 132
    sget-object v3, Lnet/time4j/g0;->I:Lnet/time4j/k0;

    .line 133
    .line 134
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    sget-object v3, Lnet/time4j/g0;->J:Lnet/time4j/k0;

    .line 138
    .line 139
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    sget-object v2, Lnet/time4j/g0;->K:Lnet/time4j/k0;

    .line 143
    .line 144
    const/16 v3, 0x3e8

    .line 145
    .line 146
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 147
    .line 148
    .line 149
    move-result-object v3

    .line 150
    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    sget-object v2, Lnet/time4j/g0;->N:Lnet/time4j/k0;

    .line 154
    .line 155
    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    sget-object v2, Lnet/time4j/g0;->L:Lnet/time4j/k0;

    .line 159
    .line 160
    const v3, 0xf4240

    .line 161
    .line 162
    .line 163
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 164
    .line 165
    .line 166
    move-result-object v3

    .line 167
    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    sget-object v2, Lnet/time4j/g0;->O:Lnet/time4j/k0;

    .line 171
    .line 172
    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    sget-object v2, Lnet/time4j/g0;->M:Lnet/time4j/k0;

    .line 176
    .line 177
    const v3, 0x3b9aca00

    .line 178
    .line 179
    .line 180
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 181
    .line 182
    .line 183
    move-result-object v3

    .line 184
    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    sget-object v2, Lnet/time4j/g0;->P:Lnet/time4j/k0;

    .line 188
    .line 189
    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    sput-object v1, Lnet/time4j/a0;->s:Ljava/util/Map;

    .line 197
    .line 198
    new-instance v1, Ljava/util/EnumMap;

    .line 199
    .line 200
    const-class v2, Ljava/util/concurrent/TimeUnit;

    .line 201
    .line 202
    invoke-direct {v1, v2}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    .line 203
    .line 204
    .line 205
    sget-object v3, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    .line 206
    .line 207
    const-wide v4, 0x40f5180000000000L    # 86400.0

    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 213
    .line 214
    .line 215
    move-result-object v4

    .line 216
    invoke-interface {v1, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    sget-object v3, Ljava/util/concurrent/TimeUnit;->HOURS:Ljava/util/concurrent/TimeUnit;

    .line 220
    .line 221
    const-wide v4, 0x40ac200000000000L    # 3600.0

    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 227
    .line 228
    .line 229
    move-result-object v4

    .line 230
    invoke-interface {v1, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    sget-object v3, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    .line 234
    .line 235
    const-wide/high16 v4, 0x404e000000000000L    # 60.0

    .line 236
    .line 237
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 238
    .line 239
    .line 240
    move-result-object v4

    .line 241
    invoke-interface {v1, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 245
    .line 246
    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    .line 247
    .line 248
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 249
    .line 250
    .line 251
    move-result-object v4

    .line 252
    invoke-interface {v1, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 256
    .line 257
    const-wide v4, 0x3f50624dd2f1a9fcL    # 0.001

    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 263
    .line 264
    .line 265
    move-result-object v4

    .line 266
    invoke-interface {v1, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    sget-object v3, Ljava/util/concurrent/TimeUnit;->MICROSECONDS:Ljava/util/concurrent/TimeUnit;

    .line 270
    .line 271
    const-wide v4, 0x3eb0c6f7a0b5ed8dL    # 1.0E-6

    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 277
    .line 278
    .line 279
    move-result-object v4

    .line 280
    invoke-interface {v1, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    sget-object v3, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    .line 284
    .line 285
    const-wide v4, 0x3e112e0be826d695L    # 1.0E-9

    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 291
    .line 292
    .line 293
    move-result-object v4

    .line 294
    invoke-interface {v1, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 298
    .line 299
    .line 300
    move-result-object v1

    .line 301
    sput-object v1, Lnet/time4j/a0;->t:Ljava/util/Map;

    .line 302
    .line 303
    new-instance v1, Lnet/time4j/a0$e;

    .line 304
    .line 305
    const/4 v3, 0x0

    .line 306
    invoke-direct {v1, v3}, Lnet/time4j/a0$e;-><init>(Lnet/time4j/a0$a;)V

    .line 307
    .line 308
    .line 309
    const-class v4, Lnet/time4j/a0;

    .line 310
    .line 311
    invoke-static {v2, v4, v1, v6, v0}, Lfj/h0$b;->k(Ljava/lang/Class;Ljava/lang/Class;Lfj/u;Lfj/k0;Lfj/k0;)Lfj/h0$b;

    .line 312
    .line 313
    .line 314
    move-result-object v0

    .line 315
    invoke-static {}, Ljava/util/concurrent/TimeUnit;->values()[Ljava/util/concurrent/TimeUnit;

    .line 316
    .line 317
    .line 318
    move-result-object v1

    .line 319
    array-length v2, v1

    .line 320
    move v4, v8

    .line 321
    :goto_0
    if-ge v4, v2, :cond_0

    .line 322
    .line 323
    aget-object v10, v1, v4

    .line 324
    .line 325
    new-instance v11, Lnet/time4j/a0$h;

    .line 326
    .line 327
    invoke-direct {v11, v10}, Lnet/time4j/a0$h;-><init>(Ljava/util/concurrent/TimeUnit;)V

    .line 328
    .line 329
    .line 330
    sget-object v5, Lnet/time4j/a0;->t:Ljava/util/Map;

    .line 331
    .line 332
    invoke-interface {v5, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    move-result-object v6

    .line 336
    check-cast v6, Ljava/lang/Double;

    .line 337
    .line 338
    invoke-virtual {v6}, Ljava/lang/Double;->doubleValue()D

    .line 339
    .line 340
    .line 341
    move-result-wide v12

    .line 342
    invoke-interface {v5}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 343
    .line 344
    .line 345
    move-result-object v14

    .line 346
    move-object v9, v0

    .line 347
    invoke-virtual/range {v9 .. v14}, Lfj/h0$b;->g(Ljava/lang/Object;Lfj/m0;DLjava/util/Set;)Lfj/h0$b;

    .line 348
    .line 349
    .line 350
    add-int/lit8 v4, v4, 0x1

    .line 351
    .line 352
    goto :goto_0

    .line 353
    :cond_0
    sget-object v1, Lnet/time4j/a0$d;->k:Lnet/time4j/a0$d;

    .line 354
    .line 355
    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 356
    .line 357
    invoke-virtual {v0, v1, v1, v2}, Lfj/h0$b;->e(Lfj/p;Lfj/z;Ljava/lang/Object;)Lfj/h0$b;

    .line 358
    .line 359
    .line 360
    sget-object v2, Lnet/time4j/a0$c;->k:Lnet/time4j/a0$c;

    .line 361
    .line 362
    sget-object v4, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    .line 363
    .line 364
    invoke-virtual {v0, v2, v2, v4}, Lfj/h0$b;->e(Lfj/p;Lfj/z;Ljava/lang/Object;)Lfj/h0$b;

    .line 365
    .line 366
    .line 367
    sget-object v4, Lnet/time4j/i0;->o:Lfj/p;

    .line 368
    .line 369
    new-instance v5, Lnet/time4j/a0$g;

    .line 370
    .line 371
    invoke-direct {v5, v3}, Lnet/time4j/a0$g;-><init>(Lnet/time4j/a0$a;)V

    .line 372
    .line 373
    .line 374
    invoke-virtual {v0, v4, v5}, Lfj/h0$b;->d(Lfj/p;Lfj/z;)Lfj/h0$b;

    .line 375
    .line 376
    .line 377
    new-instance v5, Lnet/time4j/a0$b;

    .line 378
    .line 379
    invoke-direct {v5, v3}, Lnet/time4j/a0$b;-><init>(Lnet/time4j/a0$a;)V

    .line 380
    .line 381
    .line 382
    invoke-virtual {v0, v5}, Lfj/h0$b;->l(Lfj/i0;)Lfj/h0$b;

    .line 383
    .line 384
    .line 385
    move-result-object v0

    .line 386
    invoke-virtual {v0}, Lfj/h0$b;->h()Lfj/h0;

    .line 387
    .line 388
    .line 389
    move-result-object v0

    .line 390
    sput-object v0, Lnet/time4j/a0;->u:Lfj/h0;

    .line 391
    .line 392
    new-instance v0, Lnet/time4j/a0;

    .line 393
    .line 394
    const-wide/16 v5, 0x0

    .line 395
    .line 396
    sget-object v7, Lmj/f;->k:Lmj/f;

    .line 397
    .line 398
    invoke-direct {v0, v5, v6, v8, v7}, Lnet/time4j/a0;-><init>(JILmj/f;)V

    .line 399
    .line 400
    .line 401
    sput-object v0, Lnet/time4j/a0;->v:Lnet/time4j/a0;

    .line 402
    .line 403
    sput-object v1, Lnet/time4j/a0;->w:Lfj/p;

    .line 404
    .line 405
    sput-object v2, Lnet/time4j/a0;->x:Lfj/p;

    .line 406
    .line 407
    sput-object v4, Lnet/time4j/a0;->y:Lfj/p;

    .line 408
    .line 409
    new-instance v0, Lnet/time4j/a0$f;

    .line 410
    .line 411
    invoke-direct {v0, v3}, Lnet/time4j/a0$f;-><init>(Lnet/time4j/a0$a;)V

    .line 412
    .line 413
    .line 414
    sput-object v0, Lnet/time4j/a0;->z:Lfj/v;

    .line 415
    .line 416
    return-void
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

.method private constructor <init>(IJ)V
    .locals 0

    .line 49
    invoke-direct {p0}, Lfj/k0;-><init>()V

    .line 50
    invoke-static {p2, p3}, Lnet/time4j/a0;->a0(J)V

    .line 51
    iput-wide p2, p0, Lnet/time4j/a0;->k:J

    .line 52
    iput p1, p0, Lnet/time4j/a0;->l:I

    return-void
.end method

.method synthetic constructor <init>(IJLnet/time4j/a0$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lnet/time4j/a0;-><init>(IJ)V

    return-void
.end method

.method private constructor <init>(JILmj/f;)V
    .locals 17

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    move/from16 v3, p3

    move-object/from16 v4, p4

    .line 2
    invoke-direct/range {p0 .. p0}, Lfj/k0;-><init>()V

    .line 3
    sget-object v5, Lmj/f;->k:Lmj/f;

    if-ne v4, v5, :cond_0

    .line 4
    iput-wide v1, v0, Lnet/time4j/a0;->k:J

    .line 5
    iput v3, v0, Lnet/time4j/a0;->l:I

    goto/16 :goto_5

    .line 6
    :cond_0
    invoke-static {}, Lmj/d;->x()Lmj/d;

    move-result-object v5

    .line 7
    invoke-virtual {v5}, Lmj/d;->C()Z

    move-result v6

    if-eqz v6, :cond_11

    .line 8
    sget-object v6, Lmj/f;->l:Lmj/f;

    const-wide/16 v7, 0x1

    const-wide/16 v9, 0x0

    if-ne v4, v6, :cond_1

    goto/16 :goto_1

    .line 9
    :cond_1
    sget-object v6, Lmj/f;->m:Lmj/f;

    const-wide v13, 0x41cdcd6500000000L    # 1.0E9

    const v11, 0x3b9aca00

    const v12, 0xaf79e00

    if-ne v4, v6, :cond_5

    cmp-long v4, v1, v9

    if-ltz v4, :cond_4

    const-wide/32 v15, 0x1a54c580

    cmp-long v4, v1, v15

    if-gez v4, :cond_3

    const-wide/32 v9, -0x1a54c560

    .line 10
    invoke-static {v1, v2, v9, v10}, Lnet/time4j/base/c;->f(JJ)J

    move-result-wide v9

    .line 11
    invoke-static {v3, v12}, Lnet/time4j/base/c;->e(II)I

    move-result v3

    if-lt v3, v11, :cond_2

    .line 12
    invoke-static {v9, v10, v7, v8}, Lnet/time4j/base/c;->f(JJ)J

    move-result-wide v9

    .line 13
    invoke-static {v3, v11}, Lnet/time4j/base/c;->l(II)I

    move-result v3

    :cond_2
    long-to-double v9, v9

    int-to-double v3, v3

    div-double/2addr v3, v13

    add-double/2addr v9, v3

    const-wide v3, 0x4045178d4fdf3b64L    # 42.184

    sub-double v3, v9, v3

    double-to-long v3, v3

    const v6, 0x15180

    .line 14
    invoke-static {v3, v4, v6}, Lnet/time4j/base/c;->b(JI)J

    move-result-wide v3

    sget-object v6, Lfj/a0;->k:Lfj/a0;

    invoke-static {v3, v4, v6}, Lnet/time4j/f0;->Q0(JLfj/a0;)Lnet/time4j/f0;

    move-result-object v3

    .line 15
    invoke-static {v3}, Lmj/f;->c(Lnet/time4j/base/a;)D

    move-result-wide v3

    sub-double/2addr v9, v3

    .line 16
    invoke-static {v9, v10}, Ljava/lang/Math;->floor(D)D

    move-result-wide v3

    double-to-long v3, v3

    .line 17
    invoke-static {v9, v10, v3, v4}, Lnet/time4j/a0;->u0(DJ)I

    move-result v6

    goto/16 :goto_2

    :cond_3
    const-wide/32 v9, 0x1a54c58a

    .line 18
    invoke-static {v1, v2, v9, v10}, Lnet/time4j/base/c;->m(JJ)J

    move-result-wide v9

    move v6, v3

    move-wide v3, v9

    goto/16 :goto_2

    .line 19
    :cond_4
    new-instance v3, Ljava/lang/IllegalArgumentException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "TAI not supported before 1958-01-01: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v3, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v3

    .line 20
    :cond_5
    sget-object v6, Lmj/f;->n:Lmj/f;

    if-ne v4, v6, :cond_7

    const-wide/32 v9, 0xf12d689

    .line 21
    invoke-static {v1, v2, v9, v10}, Lnet/time4j/base/c;->f(JJ)J

    move-result-wide v11

    cmp-long v4, v11, v9

    if-ltz v4, :cond_6

    move v6, v3

    move-wide v3, v11

    goto/16 :goto_2

    .line 22
    :cond_6
    new-instance v3, Ljava/lang/IllegalArgumentException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "GPS not supported before 1980-01-06: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v3, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v3

    .line 23
    :cond_7
    sget-object v6, Lmj/f;->o:Lmj/f;

    if-ne v4, v6, :cond_a

    const-wide/16 v9, 0x2a

    cmp-long v4, v1, v9

    if-ltz v4, :cond_9

    if-nez v4, :cond_8

    if-ge v3, v12, :cond_8

    goto :goto_0

    .line 24
    :cond_8
    invoke-static {v1, v2, v9, v10}, Lnet/time4j/base/c;->m(JJ)J

    move-result-wide v1

    .line 25
    invoke-static {v3, v12}, Lnet/time4j/base/c;->l(II)I

    move-result v3

    if-gez v3, :cond_b

    .line 26
    invoke-static {v1, v2, v7, v8}, Lnet/time4j/base/c;->m(JJ)J

    move-result-wide v1

    .line 27
    invoke-static {v3, v11}, Lnet/time4j/base/c;->e(II)I

    move-result v3

    goto :goto_1

    :cond_9
    :goto_0
    long-to-double v9, v1

    int-to-double v3, v3

    div-double/2addr v3, v13

    add-double/2addr v9, v3

    const-wide v3, 0x4045178d4fdf3b64L    # 42.184

    sub-double v3, v9, v3

    double-to-long v3, v3

    const v6, 0x15180

    .line 28
    invoke-static {v3, v4, v6}, Lnet/time4j/base/c;->b(JI)J

    move-result-wide v3

    sget-object v6, Lfj/a0;->k:Lfj/a0;

    invoke-static {v3, v4, v6}, Lnet/time4j/f0;->Q0(JLfj/a0;)Lnet/time4j/f0;

    move-result-object v3

    .line 29
    invoke-static {v3}, Lmj/f;->c(Lnet/time4j/base/a;)D

    move-result-wide v3

    sub-double/2addr v9, v3

    .line 30
    invoke-static {v9, v10}, Ljava/lang/Math;->floor(D)D

    move-result-wide v3

    double-to-long v3, v3

    .line 31
    invoke-static {v9, v10, v3, v4}, Lnet/time4j/a0;->u0(DJ)I

    move-result v6

    goto :goto_2

    .line 32
    :cond_a
    sget-object v6, Lmj/f;->p:Lmj/f;

    if-ne v4, v6, :cond_10

    const-wide/16 v9, 0x0

    cmp-long v4, v1, v9

    if-gez v4, :cond_c

    :cond_b
    :goto_1
    move v6, v3

    move-wide v3, v1

    goto :goto_2

    :cond_c
    const v4, 0x15180

    .line 33
    invoke-static {v1, v2, v4}, Lnet/time4j/base/c;->b(JI)J

    move-result-wide v9

    sget-object v4, Lfj/a0;->k:Lfj/a0;

    invoke-static {v9, v10, v4}, Lnet/time4j/f0;->Q0(JLfj/a0;)Lnet/time4j/f0;

    move-result-object v4

    long-to-double v9, v1

    int-to-double v11, v3

    div-double/2addr v11, v13

    add-double/2addr v9, v11

    .line 34
    invoke-static {v4}, Lmj/f;->c(Lnet/time4j/base/a;)D

    move-result-wide v3

    add-double/2addr v9, v3

    const-wide v3, 0x4045178d4fdf3b64L    # 42.184

    sub-double/2addr v9, v3

    .line 35
    invoke-static {v9, v10}, Ljava/lang/Math;->floor(D)D

    move-result-wide v3

    double-to-long v3, v3

    .line 36
    invoke-static {v9, v10, v3, v4}, Lnet/time4j/a0;->u0(DJ)I

    move-result v6

    .line 37
    :goto_2
    invoke-virtual {v5, v3, v4}, Lmj/d;->E(J)J

    move-result-wide v9

    .line 38
    invoke-virtual {v5, v9, v10}, Lmj/d;->r(J)J

    move-result-wide v11

    sub-long/2addr v3, v11

    .line 39
    iput-wide v9, v0, Lnet/time4j/a0;->k:J

    const-wide/16 v11, 0x0

    cmp-long v5, v3, v11

    if-eqz v5, :cond_f

    .line 40
    sget-wide v11, Lnet/time4j/a0;->n:J

    cmp-long v5, v9, v11

    if-nez v5, :cond_d

    goto :goto_3

    :cond_d
    cmp-long v3, v3, v7

    if-nez v3, :cond_e

    const/high16 v1, 0x40000000    # 2.0f

    or-int/2addr v1, v6

    .line 41
    iput v1, v0, Lnet/time4j/a0;->l:I

    goto :goto_4

    .line 42
    :cond_e
    new-instance v3, Ljava/lang/IllegalStateException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Cannot handle leap shift of "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, "."

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v3, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v3

    .line 43
    :cond_f
    :goto_3
    iput v6, v0, Lnet/time4j/a0;->l:I

    :goto_4
    move v3, v6

    .line 44
    :goto_5
    iget-wide v1, v0, Lnet/time4j/a0;->k:J

    invoke-static {v1, v2}, Lnet/time4j/a0;->a0(J)V

    .line 45
    invoke-static {v3}, Lnet/time4j/a0;->Y(I)V

    return-void

    .line 46
    :cond_10
    new-instance v1, Ljava/lang/UnsupportedOperationException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Not yet implemented: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    invoke-virtual/range {p4 .. p4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 48
    :cond_11
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Leap seconds are not supported by configuration."

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method static synthetic O()J
    .locals 2

    sget-wide v0, Lnet/time4j/a0;->m:J

    return-wide v0
.end method

.method static synthetic Q()J
    .locals 2

    sget-wide v0, Lnet/time4j/a0;->n:J

    return-wide v0
.end method

.method static synthetic R(Lnet/time4j/a0;Lmj/f;)Lnet/time4j/a0;
    .locals 0

    invoke-direct {p0, p1}, Lnet/time4j/a0;->x0(Lmj/f;)Lnet/time4j/a0;

    move-result-object p0

    return-object p0
.end method

.method static synthetic S(Lnet/time4j/a0;)Lnet/time4j/f0;
    .locals 0

    invoke-direct {p0}, Lnet/time4j/a0;->f0()Lnet/time4j/f0;

    move-result-object p0

    return-object p0
.end method

.method static synthetic T(Lnet/time4j/a0;)Z
    .locals 0

    invoke-direct {p0}, Lnet/time4j/a0;->n0()Z

    move-result p0

    return p0
.end method

.method static synthetic U(Lnet/time4j/a0;Lmj/f;)Lnet/time4j/a0;
    .locals 0

    invoke-direct {p0, p1}, Lnet/time4j/a0;->y0(Lmj/f;)Lnet/time4j/a0;

    move-result-object p0

    return-object p0
.end method

.method static synthetic V(Lnet/time4j/a0;)J
    .locals 2

    iget-wide v0, p0, Lnet/time4j/a0;->k:J

    return-wide v0
.end method

.method public static W()Lfj/h0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lfj/h0<",
            "Ljava/util/concurrent/TimeUnit;",
            "Lnet/time4j/a0;",
            ">;"
        }
    .end annotation

    sget-object v0, Lnet/time4j/a0;->u:Lfj/h0;

    return-object v0
.end method

.method static X(Lnet/time4j/a0;)V
    .locals 4

    .line 1
    iget-wide v0, p0, Lnet/time4j/a0;->k:J

    .line 2
    .line 3
    const-wide/32 v2, 0x3c26700

    .line 4
    .line 5
    .line 6
    cmp-long p0, v0, v2

    .line 7
    .line 8
    if-ltz p0, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 12
    .line 13
    const-string v0, "Cannot calculate SI-duration before 1972-01-01."

    .line 14
    .line 15
    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    throw p0
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

.method private static Y(I)V
    .locals 3

    const v0, 0x3b9aca00

    if-ge p0, v0, :cond_0

    if-ltz p0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Nanosecond out of range: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method static Z(JLnet/time4j/h0;)V
    .locals 3

    .line 1
    invoke-static {}, Lmj/d;->x()Lmj/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lmj/d;->F()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    invoke-virtual {v0, p0, p1}, Lmj/d;->r(J)J

    .line 12
    .line 13
    .line 14
    move-result-wide v1

    .line 15
    invoke-virtual {v0, v1, v2}, Lmj/d;->E(J)J

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    cmp-long p0, v0, p0

    .line 20
    .line 21
    if-gtz p0, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance p0, Lfj/r;

    .line 25
    .line 26
    new-instance p1, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 29
    .line 30
    .line 31
    const-string v0, "Illegal local timestamp due to negative leap second: "

    .line 32
    .line 33
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-direct {p0, p1}, Lfj/r;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw p0

    .line 47
    :cond_1
    :goto_0
    return-void
    .line 48
    .line 49
.end method

.method private static a0(J)V
    .locals 3

    .line 1
    sget-wide v0, Lnet/time4j/a0;->n:J

    .line 2
    .line 3
    cmp-long v0, p0, v0

    .line 4
    .line 5
    if-gtz v0, :cond_0

    .line 6
    .line 7
    sget-wide v0, Lnet/time4j/a0;->m:J

    .line 8
    .line 9
    cmp-long v0, p0, v0

    .line 10
    .line 11
    if-ltz v0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 15
    .line 16
    new-instance v1, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    const-string v2, "UNIX time (UT) out of supported range: "

    .line 22
    .line 23
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw v0
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

.method private static c0(IILjava/lang/StringBuilder;)V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    move v2, v0

    .line 4
    :goto_0
    add-int/lit8 v3, p1, -0x1

    .line 5
    .line 6
    if-ge v1, v3, :cond_0

    .line 7
    .line 8
    mul-int/lit8 v2, v2, 0xa

    .line 9
    .line 10
    add-int/lit8 v1, v1, 0x1

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    :goto_1
    if-ge p0, v2, :cond_1

    .line 14
    .line 15
    const/16 p1, 0xa

    .line 16
    .line 17
    if-lt v2, p1, :cond_1

    .line 18
    .line 19
    const/16 p1, 0x30

    .line 20
    .line 21
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    div-int/lit8 v2, v2, 0xa

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_1
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
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
.end method

.method public static d0(Lnet/time4j/base/f;)Lnet/time4j/a0;
    .locals 3

    .line 1
    instance-of v0, p0, Lnet/time4j/a0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-class v0, Lnet/time4j/a0;

    .line 6
    .line 7
    invoke-virtual {v0, p0}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Lnet/time4j/a0;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    instance-of v0, p0, Lmj/g;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-static {}, Lmj/d;->x()Lmj/d;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, Lmj/d;->C()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    const-class v0, Lmj/g;

    .line 29
    .line 30
    invoke-virtual {v0, p0}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, Lmj/g;

    .line 35
    .line 36
    sget-object v0, Lmj/f;->l:Lmj/f;

    .line 37
    .line 38
    invoke-interface {p0, v0}, Lmj/g;->l(Lmj/f;)J

    .line 39
    .line 40
    .line 41
    move-result-wide v1

    .line 42
    invoke-interface {p0, v0}, Lmj/g;->n(Lmj/f;)I

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    invoke-static {v1, v2, p0, v0}, Lnet/time4j/a0;->o0(JILmj/f;)Lnet/time4j/a0;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0

    .line 51
    :cond_1
    invoke-interface {p0}, Lnet/time4j/base/f;->u()J

    .line 52
    .line 53
    .line 54
    move-result-wide v0

    .line 55
    invoke-interface {p0}, Lnet/time4j/base/f;->a()I

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    sget-object v2, Lmj/f;->k:Lmj/f;

    .line 60
    .line 61
    invoke-static {v0, v1, p0, v2}, Lnet/time4j/a0;->o0(JILmj/f;)Lnet/time4j/a0;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    return-object p0
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

.method private f0()Lnet/time4j/f0;
    .locals 3

    .line 1
    iget-wide v0, p0, Lnet/time4j/a0;->k:J

    .line 2
    .line 3
    const v2, 0x15180

    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1, v2}, Lnet/time4j/base/c;->b(JI)J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    sget-object v2, Lfj/a0;->l:Lfj/a0;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, Lnet/time4j/f0;->Q0(JLfj/a0;)Lnet/time4j/f0;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method private g0()J
    .locals 4

    .line 1
    invoke-static {}, Lmj/d;->x()Lmj/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lmj/d;->C()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-static {}, Lmj/d;->x()Lmj/d;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-wide v1, p0, Lnet/time4j/a0;->k:J

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2}, Lmj/d;->r(J)J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    invoke-direct {p0}, Lnet/time4j/a0;->n0()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    const-wide/16 v2, 0x1

    .line 28
    .line 29
    add-long/2addr v0, v2

    .line 30
    :cond_0
    return-wide v0

    .line 31
    :cond_1
    iget-wide v0, p0, Lnet/time4j/a0;->k:J

    .line 32
    .line 33
    const-wide/32 v2, 0x3c26700

    .line 34
    .line 35
    .line 36
    sub-long/2addr v0, v2

    .line 37
    return-wide v0
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
.end method

.method private h0()D
    .locals 9

    .line 1
    invoke-direct {p0}, Lnet/time4j/a0;->f0()Lnet/time4j/f0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0}, Lnet/time4j/a0;->g0()J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    long-to-double v1, v1

    .line 10
    const-wide v3, 0x4045178d4fdf3b64L    # 42.184

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    add-double/2addr v1, v3

    .line 16
    invoke-virtual {p0}, Lnet/time4j/a0;->a()I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    int-to-double v3, v3

    .line 21
    const-wide v5, 0x41cdcd6500000000L    # 1.0E9

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    div-double/2addr v3, v5

    .line 27
    add-double/2addr v1, v3

    .line 28
    invoke-static {v0}, Lmj/f;->c(Lnet/time4j/base/a;)D

    .line 29
    .line 30
    .line 31
    move-result-wide v3

    .line 32
    sub-double/2addr v1, v3

    .line 33
    invoke-static {v1, v2}, Ljava/lang/Math;->floor(D)D

    .line 34
    .line 35
    .line 36
    move-result-wide v3

    .line 37
    double-to-long v3, v3

    .line 38
    long-to-double v7, v3

    .line 39
    sub-double v7, v1, v7

    .line 40
    .line 41
    mul-double/2addr v7, v5

    .line 42
    sub-double/2addr v5, v7

    .line 43
    const-wide/high16 v7, 0x3ff0000000000000L    # 1.0

    .line 44
    .line 45
    invoke-static {v5, v6, v7, v8}, Ljava/lang/Double;->compare(DD)I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-gez v0, :cond_0

    .line 50
    .line 51
    const-wide/16 v0, 0x1

    .line 52
    .line 53
    add-long/2addr v3, v0

    .line 54
    long-to-double v0, v3

    .line 55
    return-wide v0

    .line 56
    :cond_0
    return-wide v1
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
.end method

.method private static i0(Lnet/time4j/a0;)I
    .locals 2

    iget-wide v0, p0, Lnet/time4j/a0;->k:J

    const p0, 0x15180

    invoke-static {v0, v1, p0}, Lnet/time4j/base/c;->d(JI)I

    move-result p0

    return p0
.end method

.method private j0(Lnet/time4j/tz/l;)Lnet/time4j/h0;
    .locals 0

    invoke-virtual {p1, p0}, Lnet/time4j/tz/l;->B(Lnet/time4j/base/f;)Lnet/time4j/tz/p;

    move-result-object p1

    invoke-static {p0, p1}, Lnet/time4j/h0;->X(Lnet/time4j/base/f;Lnet/time4j/tz/p;)Lnet/time4j/h0;

    move-result-object p1

    return-object p1
.end method

.method private n0()Z
    .locals 1

    iget v0, p0, Lnet/time4j/a0;->l:I

    ushr-int/lit8 v0, v0, 0x1e

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static o0(JILmj/f;)Lnet/time4j/a0;
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p0, v0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    if-nez p2, :cond_0

    .line 8
    .line 9
    sget-object v0, Lmj/f;->k:Lmj/f;

    .line 10
    .line 11
    if-ne p3, v0, :cond_0

    .line 12
    .line 13
    sget-object p0, Lnet/time4j/a0;->v:Lnet/time4j/a0;

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    new-instance v0, Lnet/time4j/a0;

    .line 17
    .line 18
    invoke-direct {v0, p0, p1, p2, p3}, Lnet/time4j/a0;-><init>(JILmj/f;)V

    .line 19
    .line 20
    .line 21
    return-object v0
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
.end method

.method public static p0(JLmj/f;)Lnet/time4j/a0;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, p1, v0, p2}, Lnet/time4j/a0;->o0(JILmj/f;)Lnet/time4j/a0;

    move-result-object p0

    return-object p0
.end method

.method static r0(Ljava/io/DataInput;ZZ)Lnet/time4j/a0;
    .locals 6

    .line 1
    invoke-interface {p0}, Ljava/io/DataInput;->readLong()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    invoke-interface {p0}, Ljava/io/DataInput;->readInt()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    :goto_0
    const-wide/16 v2, 0x0

    .line 14
    .line 15
    cmp-long p2, v0, v2

    .line 16
    .line 17
    if-nez p2, :cond_2

    .line 18
    .line 19
    if-nez p1, :cond_1

    .line 20
    .line 21
    if-nez p0, :cond_2

    .line 22
    .line 23
    sget-object p0, Lnet/time4j/a0;->v:Lnet/time4j/a0;

    .line 24
    .line 25
    return-object p0

    .line 26
    :cond_1
    new-instance p0, Ljava/io/InvalidObjectException;

    .line 27
    .line 28
    const-string p1, "UTC epoch is no leap second."

    .line 29
    .line 30
    invoke-direct {p0, p1}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw p0

    .line 34
    :cond_2
    sget-wide v2, Lnet/time4j/a0;->m:J

    .line 35
    .line 36
    cmp-long p2, v0, v2

    .line 37
    .line 38
    if-nez p2, :cond_4

    .line 39
    .line 40
    if-nez p0, :cond_4

    .line 41
    .line 42
    if-nez p1, :cond_3

    .line 43
    .line 44
    sget-object p0, Lnet/time4j/a0;->o:Lnet/time4j/a0;

    .line 45
    .line 46
    return-object p0

    .line 47
    :cond_3
    new-instance p0, Ljava/io/InvalidObjectException;

    .line 48
    .line 49
    const-string p1, "Minimum is no leap second."

    .line 50
    .line 51
    invoke-direct {p0, p1}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw p0

    .line 55
    :cond_4
    sget-wide v2, Lnet/time4j/a0;->n:J

    .line 56
    .line 57
    cmp-long p2, v0, v2

    .line 58
    .line 59
    if-nez p2, :cond_6

    .line 60
    .line 61
    const p2, 0x3b9ac9ff

    .line 62
    .line 63
    .line 64
    if-ne p0, p2, :cond_6

    .line 65
    .line 66
    if-nez p1, :cond_5

    .line 67
    .line 68
    sget-object p0, Lnet/time4j/a0;->p:Lnet/time4j/a0;

    .line 69
    .line 70
    return-object p0

    .line 71
    :cond_5
    new-instance p0, Ljava/io/InvalidObjectException;

    .line 72
    .line 73
    const-string p1, "Maximum is no leap second."

    .line 74
    .line 75
    invoke-direct {p0, p1}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    throw p0

    .line 79
    :cond_6
    invoke-static {p0}, Lnet/time4j/a0;->Y(I)V

    .line 80
    .line 81
    .line 82
    if-eqz p1, :cond_b

    .line 83
    .line 84
    invoke-static {}, Lmj/d;->x()Lmj/d;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-virtual {p1}, Lmj/d;->C()Z

    .line 89
    .line 90
    .line 91
    move-result p2

    .line 92
    if-eqz p2, :cond_a

    .line 93
    .line 94
    invoke-virtual {p1, v0, v1}, Lmj/d;->r(J)J

    .line 95
    .line 96
    .line 97
    move-result-wide v2

    .line 98
    const-wide/16 v4, 0x1

    .line 99
    .line 100
    add-long/2addr v2, v4

    .line 101
    invoke-virtual {p1, v2, v3}, Lmj/d;->D(J)Z

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    if-eqz p1, :cond_7

    .line 106
    .line 107
    goto :goto_3

    .line 108
    :cond_7
    invoke-static {v0, v1}, Lnet/time4j/base/b;->l(J)J

    .line 109
    .line 110
    .line 111
    move-result-wide p0

    .line 112
    invoke-static {p0, p1}, Lnet/time4j/base/b;->h(J)I

    .line 113
    .line 114
    .line 115
    move-result p2

    .line 116
    invoke-static {p0, p1}, Lnet/time4j/base/b;->g(J)I

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    new-instance v1, Ljava/io/InvalidObjectException;

    .line 121
    .line 122
    new-instance v2, Ljava/lang/StringBuilder;

    .line 123
    .line 124
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 125
    .line 126
    .line 127
    const-string v3, "Not registered as leap second event: "

    .line 128
    .line 129
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-static {p0, p1}, Lnet/time4j/base/b;->i(J)I

    .line 133
    .line 134
    .line 135
    move-result p0

    .line 136
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    const-string p0, "-"

    .line 140
    .line 141
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    const-string p0, "0"

    .line 145
    .line 146
    const-string p1, ""

    .line 147
    .line 148
    const/16 v3, 0xa

    .line 149
    .line 150
    if-ge p2, v3, :cond_8

    .line 151
    .line 152
    move-object v4, p0

    .line 153
    goto :goto_1

    .line 154
    :cond_8
    move-object v4, p1

    .line 155
    :goto_1
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    if-ge v0, v3, :cond_9

    .line 162
    .line 163
    goto :goto_2

    .line 164
    :cond_9
    move-object p0, p1

    .line 165
    :goto_2
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    const-string p0, " [Please check leap second configurations "

    .line 172
    .line 173
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    const-string p0, "either of emitter vm or this target vm]"

    .line 177
    .line 178
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object p0

    .line 185
    invoke-direct {v1, p0}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    throw v1

    .line 189
    :cond_a
    :goto_3
    const/high16 p1, 0x40000000    # 2.0f

    .line 190
    .line 191
    or-int/2addr p0, p1

    .line 192
    :cond_b
    new-instance p1, Lnet/time4j/a0;

    .line 193
    .line 194
    invoke-direct {p1, p0, v0, v1}, Lnet/time4j/a0;-><init>(IJ)V

    .line 195
    .line 196
    .line 197
    return-object p1
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
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 1

    new-instance p1, Ljava/io/InvalidObjectException;

    const-string v0, "Serialization proxy required."

    invoke-direct {p1, v0}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private static u0(DJ)I
    .locals 6

    const-wide v0, 0x41cdcd6500000000L    # 1.0E9

    mul-double v2, p0, v0

    const-wide/32 v4, 0x3b9aca00

    :try_start_0
    invoke-static {p2, p3, v4, v5}, Lnet/time4j/base/c;->i(JJ)J

    move-result-wide p0
    :try_end_0
    .catch Ljava/lang/ArithmeticException; {:try_start_0 .. :try_end_0} :catch_0

    long-to-double p0, p0

    sub-double/2addr v2, p0

    double-to-int p0, v2

    return p0

    :catch_0
    long-to-double p2, p2

    sub-double/2addr p0, p2

    mul-double/2addr p0, v0

    double-to-int p0, p0

    return p0
.end method

.method private v0(Z)Ljava/lang/String;
    .locals 7

    .line 1
    invoke-direct {p0}, Lnet/time4j/a0;->f0()Lnet/time4j/f0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p0}, Lnet/time4j/a0;->i0(Lnet/time4j/a0;)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    div-int/lit8 v2, v1, 0x3c

    .line 10
    .line 11
    div-int/lit8 v3, v2, 0x3c

    .line 12
    .line 13
    rem-int/lit8 v2, v2, 0x3c

    .line 14
    .line 15
    rem-int/lit8 v1, v1, 0x3c

    .line 16
    .line 17
    invoke-static {}, Lmj/d;->x()Lmj/d;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    invoke-direct {p0}, Lnet/time4j/a0;->g0()J

    .line 22
    .line 23
    .line 24
    move-result-wide v5

    .line 25
    invoke-virtual {v4, v5, v6}, Lmj/d;->A(J)I

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    add-int/2addr v1, v4

    .line 30
    invoke-virtual {p0}, Lnet/time4j/a0;->a()I

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    new-instance v5, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    const/16 v6, 0x32

    .line 37
    .line 38
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const/16 v0, 0x54

    .line 45
    .line 46
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const/4 v0, 0x2

    .line 50
    invoke-static {v3, v0, v5}, Lnet/time4j/a0;->c0(IILjava/lang/StringBuilder;)V

    .line 51
    .line 52
    .line 53
    if-nez p1, :cond_0

    .line 54
    .line 55
    or-int v3, v2, v1

    .line 56
    .line 57
    or-int/2addr v3, v4

    .line 58
    if-eqz v3, :cond_2

    .line 59
    .line 60
    :cond_0
    const/16 v3, 0x3a

    .line 61
    .line 62
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-static {v2, v0, v5}, Lnet/time4j/a0;->c0(IILjava/lang/StringBuilder;)V

    .line 66
    .line 67
    .line 68
    if-nez p1, :cond_1

    .line 69
    .line 70
    or-int p1, v1, v4

    .line 71
    .line 72
    if-eqz p1, :cond_2

    .line 73
    .line 74
    :cond_1
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-static {v1, v0, v5}, Lnet/time4j/a0;->c0(IILjava/lang/StringBuilder;)V

    .line 78
    .line 79
    .line 80
    if-lez v4, :cond_2

    .line 81
    .line 82
    const/16 p1, 0x2c

    .line 83
    .line 84
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    const/16 p1, 0x9

    .line 88
    .line 89
    invoke-static {v4, p1, v5}, Lnet/time4j/a0;->c0(IILjava/lang/StringBuilder;)V

    .line 90
    .line 91
    .line 92
    :cond_2
    const/16 p1, 0x5a

    .line 93
    .line 94
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    return-object p1
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

.method private writeReplace()Ljava/lang/Object;
    .locals 2

    new-instance v0, Lnet/time4j/SPX;

    const/4 v1, 0x4

    invoke-direct {v0, p0, v1}, Lnet/time4j/SPX;-><init>(Ljava/lang/Object;I)V

    return-object v0
.end method

.method private x0(Lmj/f;)Lnet/time4j/a0;
    .locals 5

    .line 1
    sget-object v0, Lmj/f;->l:Lmj/f;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    invoke-virtual {p0}, Lnet/time4j/a0;->m0()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_6

    .line 11
    .line 12
    sget-object v0, Lnet/time4j/a0$a;->a:[I

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    aget v0, v0, v1

    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    if-eq v0, v1, :cond_5

    .line 22
    .line 23
    const/4 v1, 0x3

    .line 24
    if-eq v0, v1, :cond_4

    .line 25
    .line 26
    const/4 v1, 0x4

    .line 27
    if-eq v0, v1, :cond_3

    .line 28
    .line 29
    const/4 v1, 0x5

    .line 30
    if-eq v0, v1, :cond_2

    .line 31
    .line 32
    const/4 v1, 0x6

    .line 33
    if-ne v0, v1, :cond_1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-direct {v0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw v0

    .line 46
    :cond_2
    :goto_0
    new-instance v0, Lnet/time4j/a0;

    .line 47
    .line 48
    iget-wide v1, p0, Lnet/time4j/a0;->k:J

    .line 49
    .line 50
    const-wide/32 v3, 0x3c26700

    .line 51
    .line 52
    .line 53
    invoke-static {v1, v2, v3, v4}, Lnet/time4j/base/c;->m(JJ)J

    .line 54
    .line 55
    .line 56
    move-result-wide v1

    .line 57
    invoke-virtual {p0}, Lnet/time4j/a0;->a()I

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    invoke-direct {v0, v1, v2, v3, p1}, Lnet/time4j/a0;-><init>(JILmj/f;)V

    .line 62
    .line 63
    .line 64
    return-object v0

    .line 65
    :cond_3
    new-instance v0, Lnet/time4j/a0;

    .line 66
    .line 67
    iget-wide v1, p0, Lnet/time4j/a0;->k:J

    .line 68
    .line 69
    const-wide/32 v3, 0x12d53d80

    .line 70
    .line 71
    .line 72
    invoke-static {v1, v2, v3, v4}, Lnet/time4j/base/c;->m(JJ)J

    .line 73
    .line 74
    .line 75
    move-result-wide v1

    .line 76
    invoke-virtual {p0}, Lnet/time4j/a0;->a()I

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    invoke-direct {v0, v1, v2, v3, p1}, Lnet/time4j/a0;-><init>(JILmj/f;)V

    .line 81
    .line 82
    .line 83
    return-object v0

    .line 84
    :cond_4
    new-instance v0, Lnet/time4j/a0;

    .line 85
    .line 86
    iget-wide v1, p0, Lnet/time4j/a0;->k:J

    .line 87
    .line 88
    const-wide/32 v3, -0x16925e80

    .line 89
    .line 90
    .line 91
    invoke-static {v1, v2, v3, v4}, Lnet/time4j/base/c;->m(JJ)J

    .line 92
    .line 93
    .line 94
    move-result-wide v1

    .line 95
    invoke-virtual {p0}, Lnet/time4j/a0;->a()I

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    invoke-direct {v0, v1, v2, v3, p1}, Lnet/time4j/a0;-><init>(JILmj/f;)V

    .line 100
    .line 101
    .line 102
    return-object v0

    .line 103
    :cond_5
    return-object p0

    .line 104
    :cond_6
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 105
    .line 106
    new-instance v1, Ljava/lang/StringBuilder;

    .line 107
    .line 108
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 109
    .line 110
    .line 111
    const-string v2, "Leap seconds do not exist on continuous time scale: "

    .line 112
    .line 113
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    throw v0
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

.method private y0(Lmj/f;)Lnet/time4j/a0;
    .locals 6

    .line 1
    sget-object v0, Lnet/time4j/a0$a;->a:[I

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    aget v0, v0, v1

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-direct {v0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw v0

    .line 22
    :pswitch_0
    new-instance v0, Lnet/time4j/a0;

    .line 23
    .line 24
    invoke-virtual {p0, p1}, Lnet/time4j/a0;->n(Lmj/f;)I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    invoke-virtual {p0, p1}, Lnet/time4j/a0;->l(Lmj/f;)J

    .line 29
    .line 30
    .line 31
    move-result-wide v2

    .line 32
    const-wide/32 v4, 0x3c26700

    .line 33
    .line 34
    .line 35
    invoke-static {v2, v3, v4, v5}, Lnet/time4j/base/c;->f(JJ)J

    .line 36
    .line 37
    .line 38
    move-result-wide v2

    .line 39
    invoke-direct {v0, v1, v2, v3}, Lnet/time4j/a0;-><init>(IJ)V

    .line 40
    .line 41
    .line 42
    return-object v0

    .line 43
    :pswitch_1
    new-instance p1, Lnet/time4j/a0;

    .line 44
    .line 45
    invoke-virtual {p0}, Lnet/time4j/a0;->a()I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    sget-object v1, Lmj/f;->n:Lmj/f;

    .line 50
    .line 51
    invoke-virtual {p0, v1}, Lnet/time4j/a0;->l(Lmj/f;)J

    .line 52
    .line 53
    .line 54
    move-result-wide v1

    .line 55
    const-wide/32 v3, 0x12d53d80

    .line 56
    .line 57
    .line 58
    invoke-static {v1, v2, v3, v4}, Lnet/time4j/base/c;->f(JJ)J

    .line 59
    .line 60
    .line 61
    move-result-wide v1

    .line 62
    invoke-direct {p1, v0, v1, v2}, Lnet/time4j/a0;-><init>(IJ)V

    .line 63
    .line 64
    .line 65
    return-object p1

    .line 66
    :pswitch_2
    new-instance v0, Lnet/time4j/a0;

    .line 67
    .line 68
    invoke-virtual {p0, p1}, Lnet/time4j/a0;->n(Lmj/f;)I

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    invoke-virtual {p0, p1}, Lnet/time4j/a0;->l(Lmj/f;)J

    .line 73
    .line 74
    .line 75
    move-result-wide v2

    .line 76
    const-wide/32 v4, -0x16925e80

    .line 77
    .line 78
    .line 79
    invoke-static {v2, v3, v4, v5}, Lnet/time4j/base/c;->f(JJ)J

    .line 80
    .line 81
    .line 82
    move-result-wide v2

    .line 83
    invoke-direct {v0, v1, v2, v3}, Lnet/time4j/a0;-><init>(IJ)V

    .line 84
    .line 85
    .line 86
    return-object v0

    .line 87
    :pswitch_3
    return-object p0

    .line 88
    :pswitch_4
    invoke-virtual {p0}, Lnet/time4j/a0;->m0()Z

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    if-eqz p1, :cond_0

    .line 93
    .line 94
    new-instance p1, Lnet/time4j/a0;

    .line 95
    .line 96
    invoke-virtual {p0}, Lnet/time4j/a0;->a()I

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    iget-wide v1, p0, Lnet/time4j/a0;->k:J

    .line 101
    .line 102
    invoke-direct {p1, v0, v1, v2}, Lnet/time4j/a0;-><init>(IJ)V

    .line 103
    .line 104
    .line 105
    return-object p1

    .line 106
    :cond_0
    return-object p0

    .line 107
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
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


# virtual methods
.method public bridge synthetic G(Lfj/k0;)I
    .locals 0

    check-cast p1, Lnet/time4j/a0;

    invoke-virtual {p0, p1}, Lnet/time4j/a0;->b0(Lnet/time4j/a0;)I

    move-result p1

    return p1
.end method

.method protected H()Lfj/h0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lfj/h0<",
            "Ljava/util/concurrent/TimeUnit;",
            "Lnet/time4j/a0;",
            ">;"
        }
    .end annotation

    sget-object v0, Lnet/time4j/a0;->u:Lfj/h0;

    return-object v0
.end method

.method public a()I
    .locals 2

    iget v0, p0, Lnet/time4j/a0;->l:I

    const v1, -0x40000001    # -1.9999999f

    and-int/2addr v0, v1

    return v0
.end method

.method public b0(Lnet/time4j/a0;)I
    .locals 4

    .line 1
    invoke-direct {p0}, Lnet/time4j/a0;->g0()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-direct {p1}, Lnet/time4j/a0;->g0()J

    .line 6
    .line 7
    .line 8
    move-result-wide v2

    .line 9
    cmp-long v0, v0, v2

    .line 10
    .line 11
    const/4 v1, -0x1

    .line 12
    if-gez v0, :cond_0

    .line 13
    .line 14
    return v1

    .line 15
    :cond_0
    const/4 v2, 0x1

    .line 16
    if-lez v0, :cond_1

    .line 17
    .line 18
    return v2

    .line 19
    :cond_1
    invoke-virtual {p0}, Lnet/time4j/a0;->a()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-virtual {p1}, Lnet/time4j/a0;->a()I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    sub-int/2addr v0, p1

    .line 28
    if-lez v0, :cond_2

    .line 29
    .line 30
    move v1, v2

    .line 31
    goto :goto_0

    .line 32
    :cond_2
    if-gez v0, :cond_3

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_3
    const/4 v1, 0x0

    .line 36
    :goto_0
    return v1
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

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lnet/time4j/a0;

    invoke-virtual {p0, p1}, Lnet/time4j/a0;->b0(Lnet/time4j/a0;)I

    move-result p1

    return p1
.end method

.method protected e0()Lnet/time4j/a0;
    .locals 0

    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lnet/time4j/a0;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_5

    .line 9
    .line 10
    check-cast p1, Lnet/time4j/a0;

    .line 11
    .line 12
    iget-wide v3, p0, Lnet/time4j/a0;->k:J

    .line 13
    .line 14
    iget-wide v5, p1, Lnet/time4j/a0;->k:J

    .line 15
    .line 16
    cmp-long v1, v3, v5

    .line 17
    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    return v2

    .line 21
    :cond_1
    invoke-static {}, Lmj/d;->x()Lmj/d;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v1}, Lmj/d;->C()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_3

    .line 30
    .line 31
    iget v1, p0, Lnet/time4j/a0;->l:I

    .line 32
    .line 33
    iget p1, p1, Lnet/time4j/a0;->l:I

    .line 34
    .line 35
    if-ne v1, p1, :cond_2

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    move v0, v2

    .line 39
    :goto_0
    return v0

    .line 40
    :cond_3
    invoke-virtual {p0}, Lnet/time4j/a0;->a()I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    invoke-virtual {p1}, Lnet/time4j/a0;->a()I

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-ne v1, p1, :cond_4

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_4
    move v0, v2

    .line 52
    :goto_1
    return v0

    .line 53
    :cond_5
    return v2
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

.method public hashCode()I
    .locals 4

    .line 1
    iget-wide v0, p0, Lnet/time4j/a0;->k:J

    .line 2
    .line 3
    const/16 v2, 0x20

    .line 4
    .line 5
    ushr-long v2, v0, v2

    .line 6
    .line 7
    xor-long/2addr v0, v2

    .line 8
    long-to-int v0, v0

    .line 9
    mul-int/lit8 v0, v0, 0x13

    .line 10
    .line 11
    invoke-virtual {p0}, Lnet/time4j/a0;->a()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    mul-int/lit8 v1, v1, 0x25

    .line 16
    .line 17
    add-int/2addr v0, v1

    .line 18
    return v0
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public k0(Lnet/time4j/tz/k;)Lnet/time4j/b1;
    .locals 0

    invoke-static {p1}, Lnet/time4j/tz/l;->N(Lnet/time4j/tz/k;)Lnet/time4j/tz/l;

    move-result-object p1

    invoke-static {p0, p1}, Lnet/time4j/b1;->e(Lnet/time4j/a0;Lnet/time4j/tz/l;)Lnet/time4j/b1;

    move-result-object p1

    return-object p1
.end method

.method public l(Lmj/f;)J
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Lnet/time4j/a0$a;->a:[I

    .line 4
    .line 5
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    aget v1, v1, v2

    .line 10
    .line 11
    const v2, 0xaf79e00

    .line 12
    .line 13
    .line 14
    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    .line 15
    .line 16
    const-wide/16 v5, 0x1

    .line 17
    .line 18
    const-wide/32 v7, 0x3c26700

    .line 19
    .line 20
    .line 21
    const-wide v9, 0x41cdcd6500000000L    # 1.0E9

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    packed-switch v1, :pswitch_data_0

    .line 27
    .line 28
    .line 29
    new-instance v1, Ljava/lang/UnsupportedOperationException;

    .line 30
    .line 31
    new-instance v2, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 34
    .line 35
    .line 36
    const-string v3, "Not yet implemented: "

    .line 37
    .line 38
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    move-object/from16 v3, p1

    .line 42
    .line 43
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-direct {v1, v2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw v1

    .line 54
    :pswitch_0
    iget-wide v1, v0, Lnet/time4j/a0;->k:J

    .line 55
    .line 56
    cmp-long v3, v1, v7

    .line 57
    .line 58
    if-gez v3, :cond_0

    .line 59
    .line 60
    sub-long/2addr v1, v7

    .line 61
    return-wide v1

    .line 62
    :cond_0
    invoke-direct/range {p0 .. p0}, Lnet/time4j/a0;->h0()D

    .line 63
    .line 64
    .line 65
    move-result-wide v1

    .line 66
    invoke-static {v1, v2}, Ljava/lang/Math;->floor(D)D

    .line 67
    .line 68
    .line 69
    move-result-wide v1

    .line 70
    double-to-long v1, v1

    .line 71
    return-wide v1

    .line 72
    :pswitch_1
    iget-wide v11, v0, Lnet/time4j/a0;->k:J

    .line 73
    .line 74
    cmp-long v1, v11, v7

    .line 75
    .line 76
    if-gez v1, :cond_2

    .line 77
    .line 78
    invoke-direct/range {p0 .. p0}, Lnet/time4j/a0;->f0()Lnet/time4j/f0;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-static {v1}, Lmj/f;->c(Lnet/time4j/base/a;)D

    .line 83
    .line 84
    .line 85
    move-result-wide v1

    .line 86
    iget-wide v11, v0, Lnet/time4j/a0;->k:J

    .line 87
    .line 88
    sub-long/2addr v11, v7

    .line 89
    long-to-double v7, v11

    .line 90
    add-double/2addr v1, v7

    .line 91
    invoke-virtual/range {p0 .. p0}, Lnet/time4j/a0;->a()I

    .line 92
    .line 93
    .line 94
    move-result v7

    .line 95
    int-to-double v7, v7

    .line 96
    div-double/2addr v7, v9

    .line 97
    add-double/2addr v1, v7

    .line 98
    invoke-static {v1, v2}, Ljava/lang/Math;->floor(D)D

    .line 99
    .line 100
    .line 101
    move-result-wide v7

    .line 102
    double-to-long v7, v7

    .line 103
    long-to-double v11, v7

    .line 104
    sub-double/2addr v1, v11

    .line 105
    mul-double/2addr v1, v9

    .line 106
    sub-double/2addr v9, v1

    .line 107
    invoke-static {v9, v10, v3, v4}, Ljava/lang/Double;->compare(DD)I

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    if-gez v1, :cond_1

    .line 112
    .line 113
    add-long/2addr v7, v5

    .line 114
    :cond_1
    return-wide v7

    .line 115
    :cond_2
    invoke-direct/range {p0 .. p0}, Lnet/time4j/a0;->g0()J

    .line 116
    .line 117
    .line 118
    move-result-wide v3

    .line 119
    const-wide/16 v7, 0x2a

    .line 120
    .line 121
    add-long/2addr v3, v7

    .line 122
    invoke-virtual/range {p0 .. p0}, Lnet/time4j/a0;->a()I

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    add-int/2addr v1, v2

    .line 127
    const v2, 0x3b9aca00

    .line 128
    .line 129
    .line 130
    if-lt v1, v2, :cond_3

    .line 131
    .line 132
    add-long/2addr v3, v5

    .line 133
    :cond_3
    return-wide v3

    .line 134
    :pswitch_2
    invoke-direct/range {p0 .. p0}, Lnet/time4j/a0;->g0()J

    .line 135
    .line 136
    .line 137
    move-result-wide v1

    .line 138
    invoke-static {}, Lmj/d;->x()Lmj/d;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    invoke-virtual {v3, v1, v2}, Lmj/d;->E(J)J

    .line 143
    .line 144
    .line 145
    move-result-wide v3

    .line 146
    const-wide/32 v5, 0x12d53d80

    .line 147
    .line 148
    .line 149
    cmp-long v3, v3, v5

    .line 150
    .line 151
    if-ltz v3, :cond_5

    .line 152
    .line 153
    invoke-static {}, Lmj/d;->x()Lmj/d;

    .line 154
    .line 155
    .line 156
    move-result-object v3

    .line 157
    invoke-virtual {v3}, Lmj/d;->C()Z

    .line 158
    .line 159
    .line 160
    move-result v3

    .line 161
    if-eqz v3, :cond_4

    .line 162
    .line 163
    goto :goto_0

    .line 164
    :cond_4
    const-wide/16 v3, 0x9

    .line 165
    .line 166
    add-long/2addr v1, v3

    .line 167
    :goto_0
    const-wide/32 v3, 0xf12d689

    .line 168
    .line 169
    .line 170
    sub-long/2addr v1, v3

    .line 171
    return-wide v1

    .line 172
    :cond_5
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 173
    .line 174
    new-instance v2, Ljava/lang/StringBuilder;

    .line 175
    .line 176
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 177
    .line 178
    .line 179
    const-string v3, "GPS not supported before 1980-01-06: "

    .line 180
    .line 181
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    throw v1

    .line 195
    :pswitch_3
    invoke-direct/range {p0 .. p0}, Lnet/time4j/a0;->g0()J

    .line 196
    .line 197
    .line 198
    move-result-wide v11

    .line 199
    const-wide/16 v13, 0x0

    .line 200
    .line 201
    cmp-long v1, v11, v13

    .line 202
    .line 203
    if-gez v1, :cond_7

    .line 204
    .line 205
    invoke-direct/range {p0 .. p0}, Lnet/time4j/a0;->f0()Lnet/time4j/f0;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    invoke-static {v1}, Lmj/f;->c(Lnet/time4j/base/a;)D

    .line 210
    .line 211
    .line 212
    move-result-wide v15

    .line 213
    iget-wide v13, v0, Lnet/time4j/a0;->k:J

    .line 214
    .line 215
    sub-long/2addr v13, v7

    .line 216
    long-to-double v7, v13

    .line 217
    add-double/2addr v15, v7

    .line 218
    invoke-virtual/range {p0 .. p0}, Lnet/time4j/a0;->a()I

    .line 219
    .line 220
    .line 221
    move-result v1

    .line 222
    int-to-double v7, v1

    .line 223
    div-double/2addr v7, v9

    .line 224
    add-double/2addr v7, v15

    .line 225
    invoke-static {v7, v8}, Ljava/lang/Math;->floor(D)D

    .line 226
    .line 227
    .line 228
    move-result-wide v13

    .line 229
    double-to-long v13, v13

    .line 230
    long-to-double v11, v13

    .line 231
    sub-double v11, v7, v11

    .line 232
    .line 233
    mul-double/2addr v11, v9

    .line 234
    sub-double/2addr v9, v11

    .line 235
    invoke-static {v9, v10, v3, v4}, Ljava/lang/Double;->compare(DD)I

    .line 236
    .line 237
    .line 238
    move-result v1

    .line 239
    if-gez v1, :cond_6

    .line 240
    .line 241
    add-long/2addr v13, v5

    .line 242
    const/4 v1, 0x0

    .line 243
    goto :goto_1

    .line 244
    :cond_6
    invoke-static {v7, v8, v13, v14}, Lnet/time4j/a0;->u0(DJ)I

    .line 245
    .line 246
    .line 247
    move-result v1

    .line 248
    :goto_1
    const-wide/16 v3, 0x20

    .line 249
    .line 250
    sub-long/2addr v13, v3

    .line 251
    const-wide/32 v3, 0x1a54c580

    .line 252
    .line 253
    .line 254
    add-long/2addr v13, v3

    .line 255
    sub-int/2addr v1, v2

    .line 256
    if-gez v1, :cond_8

    .line 257
    .line 258
    sub-long/2addr v13, v5

    .line 259
    goto :goto_2

    .line 260
    :cond_7
    const-wide/32 v3, 0x1a54c580

    .line 261
    .line 262
    .line 263
    invoke-direct/range {p0 .. p0}, Lnet/time4j/a0;->g0()J

    .line 264
    .line 265
    .line 266
    move-result-wide v1

    .line 267
    add-long/2addr v1, v3

    .line 268
    const-wide/16 v3, 0xa

    .line 269
    .line 270
    add-long v13, v1, v3

    .line 271
    .line 272
    :cond_8
    :goto_2
    const-wide/16 v1, 0x0

    .line 273
    .line 274
    cmp-long v1, v13, v1

    .line 275
    .line 276
    if-ltz v1, :cond_9

    .line 277
    .line 278
    return-wide v13

    .line 279
    :cond_9
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 280
    .line 281
    new-instance v2, Ljava/lang/StringBuilder;

    .line 282
    .line 283
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 284
    .line 285
    .line 286
    const-string v3, "TAI not supported before 1958-01-01: "

    .line 287
    .line 288
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 289
    .line 290
    .line 291
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 292
    .line 293
    .line 294
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object v2

    .line 298
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 299
    .line 300
    .line 301
    throw v1

    .line 302
    :pswitch_4
    invoke-direct/range {p0 .. p0}, Lnet/time4j/a0;->g0()J

    .line 303
    .line 304
    .line 305
    move-result-wide v1

    .line 306
    return-wide v1

    .line 307
    :pswitch_5
    iget-wide v1, v0, Lnet/time4j/a0;->k:J

    .line 308
    .line 309
    return-wide v1

    .line 310
    nop

    .line 311
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public l0(Lmj/g;)Z
    .locals 0

    .line 1
    invoke-static {p1}, Lnet/time4j/a0;->d0(Lnet/time4j/base/f;)Lnet/time4j/a0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, Lnet/time4j/a0;->b0(Lnet/time4j/a0;)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-gez p1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    :goto_0
    return p1
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

.method public m0()Z
    .locals 1

    invoke-direct {p0}, Lnet/time4j/a0;->n0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lmj/d;->x()Lmj/d;

    move-result-object v0

    invoke-virtual {v0}, Lmj/d;->C()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public n(Lmj/f;)I
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Lnet/time4j/a0$a;->a:[I

    .line 4
    .line 5
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    aget v1, v1, v2

    .line 10
    .line 11
    const v3, 0xaf79e00

    .line 12
    .line 13
    .line 14
    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    .line 15
    .line 16
    const v6, 0x3b9aca00

    .line 17
    .line 18
    .line 19
    const-wide/32 v7, 0x3c26700

    .line 20
    .line 21
    .line 22
    const-wide v9, 0x41cdcd6500000000L    # 1.0E9

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    packed-switch v1, :pswitch_data_0

    .line 28
    .line 29
    .line 30
    new-instance v1, Ljava/lang/UnsupportedOperationException;

    .line 31
    .line 32
    new-instance v2, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 35
    .line 36
    .line 37
    const-string v3, "Not yet implemented: "

    .line 38
    .line 39
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    move-object/from16 v3, p1

    .line 43
    .line 44
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-direct {v1, v2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw v1

    .line 55
    :pswitch_0
    iget-wide v1, v0, Lnet/time4j/a0;->k:J

    .line 56
    .line 57
    cmp-long v1, v1, v7

    .line 58
    .line 59
    if-gez v1, :cond_0

    .line 60
    .line 61
    invoke-virtual/range {p0 .. p0}, Lnet/time4j/a0;->a()I

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    return v1

    .line 66
    :cond_0
    invoke-direct/range {p0 .. p0}, Lnet/time4j/a0;->h0()D

    .line 67
    .line 68
    .line 69
    move-result-wide v1

    .line 70
    invoke-static {v1, v2}, Ljava/lang/Math;->floor(D)D

    .line 71
    .line 72
    .line 73
    move-result-wide v3

    .line 74
    double-to-long v3, v3

    .line 75
    invoke-static {v1, v2, v3, v4}, Lnet/time4j/a0;->u0(DJ)I

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    return v1

    .line 80
    :pswitch_1
    iget-wide v11, v0, Lnet/time4j/a0;->k:J

    .line 81
    .line 82
    cmp-long v1, v11, v7

    .line 83
    .line 84
    if-gez v1, :cond_2

    .line 85
    .line 86
    invoke-direct/range {p0 .. p0}, Lnet/time4j/a0;->f0()Lnet/time4j/f0;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-static {v1}, Lmj/f;->c(Lnet/time4j/base/a;)D

    .line 91
    .line 92
    .line 93
    move-result-wide v11

    .line 94
    iget-wide v13, v0, Lnet/time4j/a0;->k:J

    .line 95
    .line 96
    sub-long/2addr v13, v7

    .line 97
    long-to-double v6, v13

    .line 98
    add-double/2addr v11, v6

    .line 99
    invoke-virtual/range {p0 .. p0}, Lnet/time4j/a0;->a()I

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    int-to-double v6, v1

    .line 104
    div-double/2addr v6, v9

    .line 105
    add-double/2addr v11, v6

    .line 106
    invoke-static {v11, v12}, Ljava/lang/Math;->floor(D)D

    .line 107
    .line 108
    .line 109
    move-result-wide v6

    .line 110
    double-to-long v6, v6

    .line 111
    long-to-double v13, v6

    .line 112
    sub-double v13, v11, v13

    .line 113
    .line 114
    mul-double/2addr v13, v9

    .line 115
    sub-double/2addr v9, v13

    .line 116
    invoke-static {v9, v10, v4, v5}, Ljava/lang/Double;->compare(DD)I

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    if-gez v1, :cond_1

    .line 121
    .line 122
    const/4 v2, 0x0

    .line 123
    goto :goto_0

    .line 124
    :cond_1
    invoke-static {v11, v12, v6, v7}, Lnet/time4j/a0;->u0(DJ)I

    .line 125
    .line 126
    .line 127
    move-result v2

    .line 128
    goto :goto_0

    .line 129
    :cond_2
    invoke-virtual/range {p0 .. p0}, Lnet/time4j/a0;->a()I

    .line 130
    .line 131
    .line 132
    move-result v1

    .line 133
    add-int v2, v1, v3

    .line 134
    .line 135
    if-lt v2, v6, :cond_3

    .line 136
    .line 137
    sub-int/2addr v2, v6

    .line 138
    :cond_3
    :goto_0
    return v2

    .line 139
    :pswitch_2
    invoke-direct/range {p0 .. p0}, Lnet/time4j/a0;->g0()J

    .line 140
    .line 141
    .line 142
    move-result-wide v1

    .line 143
    invoke-static {}, Lmj/d;->x()Lmj/d;

    .line 144
    .line 145
    .line 146
    move-result-object v3

    .line 147
    invoke-virtual {v3, v1, v2}, Lmj/d;->E(J)J

    .line 148
    .line 149
    .line 150
    move-result-wide v1

    .line 151
    const-wide/32 v3, 0x12d53d80

    .line 152
    .line 153
    .line 154
    cmp-long v1, v1, v3

    .line 155
    .line 156
    if-ltz v1, :cond_4

    .line 157
    .line 158
    invoke-virtual/range {p0 .. p0}, Lnet/time4j/a0;->a()I

    .line 159
    .line 160
    .line 161
    move-result v1

    .line 162
    return v1

    .line 163
    :cond_4
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 164
    .line 165
    new-instance v2, Ljava/lang/StringBuilder;

    .line 166
    .line 167
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 168
    .line 169
    .line 170
    const-string v3, "GPS not supported before 1980-01-06: "

    .line 171
    .line 172
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    throw v1

    .line 186
    :pswitch_3
    invoke-direct/range {p0 .. p0}, Lnet/time4j/a0;->g0()J

    .line 187
    .line 188
    .line 189
    move-result-wide v11

    .line 190
    const-wide/16 v13, 0x0

    .line 191
    .line 192
    cmp-long v1, v11, v13

    .line 193
    .line 194
    const-wide/32 v11, 0x1a54c580

    .line 195
    .line 196
    .line 197
    if-gez v1, :cond_6

    .line 198
    .line 199
    invoke-direct/range {p0 .. p0}, Lnet/time4j/a0;->f0()Lnet/time4j/f0;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    invoke-static {v1}, Lmj/f;->c(Lnet/time4j/base/a;)D

    .line 204
    .line 205
    .line 206
    move-result-wide v15

    .line 207
    iget-wide v13, v0, Lnet/time4j/a0;->k:J

    .line 208
    .line 209
    sub-long/2addr v13, v7

    .line 210
    long-to-double v7, v13

    .line 211
    add-double/2addr v15, v7

    .line 212
    invoke-virtual/range {p0 .. p0}, Lnet/time4j/a0;->a()I

    .line 213
    .line 214
    .line 215
    move-result v1

    .line 216
    int-to-double v7, v1

    .line 217
    div-double/2addr v7, v9

    .line 218
    add-double/2addr v7, v15

    .line 219
    invoke-static {v7, v8}, Ljava/lang/Math;->floor(D)D

    .line 220
    .line 221
    .line 222
    move-result-wide v13

    .line 223
    double-to-long v13, v13

    .line 224
    long-to-double v2, v13

    .line 225
    sub-double v2, v7, v2

    .line 226
    .line 227
    mul-double/2addr v2, v9

    .line 228
    sub-double/2addr v9, v2

    .line 229
    invoke-static {v9, v10, v4, v5}, Ljava/lang/Double;->compare(DD)I

    .line 230
    .line 231
    .line 232
    move-result v2

    .line 233
    const-wide/16 v3, 0x1

    .line 234
    .line 235
    if-gez v2, :cond_5

    .line 236
    .line 237
    add-long/2addr v13, v3

    .line 238
    const/4 v2, 0x0

    .line 239
    goto :goto_1

    .line 240
    :cond_5
    invoke-static {v7, v8, v13, v14}, Lnet/time4j/a0;->u0(DJ)I

    .line 241
    .line 242
    .line 243
    move-result v2

    .line 244
    :goto_1
    const-wide/16 v7, 0x20

    .line 245
    .line 246
    sub-long/2addr v13, v7

    .line 247
    add-long/2addr v13, v11

    .line 248
    const v1, 0xaf79e00

    .line 249
    .line 250
    .line 251
    sub-int/2addr v2, v1

    .line 252
    if-gez v2, :cond_7

    .line 253
    .line 254
    sub-long/2addr v13, v3

    .line 255
    add-int/2addr v2, v6

    .line 256
    goto :goto_2

    .line 257
    :cond_6
    invoke-direct/range {p0 .. p0}, Lnet/time4j/a0;->g0()J

    .line 258
    .line 259
    .line 260
    move-result-wide v1

    .line 261
    add-long v13, v1, v11

    .line 262
    .line 263
    invoke-virtual/range {p0 .. p0}, Lnet/time4j/a0;->a()I

    .line 264
    .line 265
    .line 266
    move-result v2

    .line 267
    :cond_7
    :goto_2
    const-wide/16 v3, 0x0

    .line 268
    .line 269
    cmp-long v1, v13, v3

    .line 270
    .line 271
    if-ltz v1, :cond_8

    .line 272
    .line 273
    return v2

    .line 274
    :cond_8
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 275
    .line 276
    new-instance v2, Ljava/lang/StringBuilder;

    .line 277
    .line 278
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 279
    .line 280
    .line 281
    const-string v3, "TAI not supported before 1958-01-01: "

    .line 282
    .line 283
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 284
    .line 285
    .line 286
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 287
    .line 288
    .line 289
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v2

    .line 293
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 294
    .line 295
    .line 296
    throw v1

    .line 297
    :pswitch_4
    invoke-virtual/range {p0 .. p0}, Lnet/time4j/a0;->a()I

    .line 298
    .line 299
    .line 300
    move-result v1

    .line 301
    return v1

    .line 302
    nop

    .line 303
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public q0(JLnet/time4j/n0;)Lnet/time4j/a0;
    .locals 4

    .line 1
    invoke-static {p0}, Lnet/time4j/a0;->X(Lnet/time4j/a0;)V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    cmp-long v0, p1, v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_0
    :try_start_0
    sget-object v1, Lnet/time4j/a0$a;->b:[I

    .line 12
    .line 13
    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    .line 14
    .line 15
    .line 16
    move-result p3

    .line 17
    aget p3, v1, p3

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    if-eq p3, v1, :cond_3

    .line 21
    .line 22
    const/4 v1, 0x2

    .line 23
    if-ne p3, v1, :cond_2

    .line 24
    .line 25
    invoke-virtual {p0}, Lnet/time4j/a0;->a()I

    .line 26
    .line 27
    .line 28
    move-result p3

    .line 29
    int-to-long v1, p3

    .line 30
    invoke-static {v1, v2, p1, p2}, Lnet/time4j/base/c;->f(JJ)J

    .line 31
    .line 32
    .line 33
    move-result-wide p1

    .line 34
    const p3, 0x3b9aca00

    .line 35
    .line 36
    .line 37
    invoke-static {p1, p2, p3}, Lnet/time4j/base/c;->d(JI)I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    invoke-static {p1, p2, p3}, Lnet/time4j/base/c;->b(JI)J

    .line 42
    .line 43
    .line 44
    move-result-wide p1

    .line 45
    invoke-static {}, Lmj/d;->x()Lmj/d;

    .line 46
    .line 47
    .line 48
    move-result-object p3

    .line 49
    invoke-virtual {p3}, Lmj/d;->C()Z

    .line 50
    .line 51
    .line 52
    move-result p3

    .line 53
    if-eqz p3, :cond_1

    .line 54
    .line 55
    new-instance p3, Lnet/time4j/a0;

    .line 56
    .line 57
    invoke-direct {p0}, Lnet/time4j/a0;->g0()J

    .line 58
    .line 59
    .line 60
    move-result-wide v2

    .line 61
    invoke-static {v2, v3, p1, p2}, Lnet/time4j/base/c;->f(JJ)J

    .line 62
    .line 63
    .line 64
    move-result-wide p1

    .line 65
    sget-object v2, Lmj/f;->l:Lmj/f;

    .line 66
    .line 67
    invoke-direct {p3, p1, p2, v1, v2}, Lnet/time4j/a0;-><init>(JILmj/f;)V

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_1
    iget-wide v2, p0, Lnet/time4j/a0;->k:J

    .line 72
    .line 73
    invoke-static {v2, v3, p1, p2}, Lnet/time4j/base/c;->f(JJ)J

    .line 74
    .line 75
    .line 76
    move-result-wide p1

    .line 77
    sget-object p3, Lmj/f;->k:Lmj/f;

    .line 78
    .line 79
    invoke-static {p1, p2, v1, p3}, Lnet/time4j/a0;->o0(JILmj/f;)Lnet/time4j/a0;

    .line 80
    .line 81
    .line 82
    move-result-object p3

    .line 83
    goto :goto_0

    .line 84
    :cond_2
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 85
    .line 86
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 87
    .line 88
    .line 89
    throw p1

    .line 90
    :cond_3
    invoke-static {}, Lmj/d;->x()Lmj/d;

    .line 91
    .line 92
    .line 93
    move-result-object p3

    .line 94
    invoke-virtual {p3}, Lmj/d;->C()Z

    .line 95
    .line 96
    .line 97
    move-result p3

    .line 98
    if-eqz p3, :cond_4

    .line 99
    .line 100
    new-instance p3, Lnet/time4j/a0;

    .line 101
    .line 102
    invoke-direct {p0}, Lnet/time4j/a0;->g0()J

    .line 103
    .line 104
    .line 105
    move-result-wide v1

    .line 106
    invoke-static {v1, v2, p1, p2}, Lnet/time4j/base/c;->f(JJ)J

    .line 107
    .line 108
    .line 109
    move-result-wide p1

    .line 110
    invoke-virtual {p0}, Lnet/time4j/a0;->a()I

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    sget-object v2, Lmj/f;->l:Lmj/f;

    .line 115
    .line 116
    invoke-direct {p3, p1, p2, v1, v2}, Lnet/time4j/a0;-><init>(JILmj/f;)V

    .line 117
    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_4
    iget-wide v1, p0, Lnet/time4j/a0;->k:J

    .line 121
    .line 122
    invoke-static {v1, v2, p1, p2}, Lnet/time4j/base/c;->f(JJ)J

    .line 123
    .line 124
    .line 125
    move-result-wide p1

    .line 126
    invoke-virtual {p0}, Lnet/time4j/a0;->a()I

    .line 127
    .line 128
    .line 129
    move-result p3

    .line 130
    sget-object v1, Lmj/f;->k:Lmj/f;

    .line 131
    .line 132
    invoke-static {p1, p2, p3, v1}, Lnet/time4j/a0;->o0(JILmj/f;)Lnet/time4j/a0;

    .line 133
    .line 134
    .line 135
    move-result-object p3
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 136
    :goto_0
    if-gez v0, :cond_5

    .line 137
    .line 138
    invoke-static {p3}, Lnet/time4j/a0;->X(Lnet/time4j/a0;)V

    .line 139
    .line 140
    .line 141
    :cond_5
    return-object p3

    .line 142
    :catch_0
    move-exception p1

    .line 143
    new-instance p2, Ljava/lang/ArithmeticException;

    .line 144
    .line 145
    const-string p3, "Result beyond boundaries of time axis."

    .line 146
    .line 147
    invoke-direct {p2, p3}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 151
    .line 152
    .line 153
    throw p2
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

.method public s0(Lfj/j;Ljava/lang/String;Lnet/time4j/tz/k;Lfj/f0;)Lnet/time4j/r;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<C:",
            "Lfj/l<",
            "TC;>;>(",
            "Lfj/j<",
            "TC;>;",
            "Ljava/lang/String;",
            "Lnet/time4j/tz/k;",
            "Lfj/f0;",
            ")",
            "Lnet/time4j/r<",
            "TC;>;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p3}, Lnet/time4j/a0;->w0(Lnet/time4j/tz/k;)Lnet/time4j/h0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lnet/time4j/h0;->a0()Lnet/time4j/g0;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0}, Lnet/time4j/h0;->Y()Lnet/time4j/f0;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {p4, v2, p3}, Lfj/f0;->b(Lfj/g;Lnet/time4j/tz/k;)I

    .line 14
    .line 15
    .line 16
    move-result p3

    .line 17
    int-to-long p3, p3

    .line 18
    sget-object v2, Lnet/time4j/g;->m:Lnet/time4j/g;

    .line 19
    .line 20
    invoke-virtual {v0, p3, p4, v2}, Lfj/k0;->J(JLjava/lang/Object;)Lfj/k0;

    .line 21
    .line 22
    .line 23
    move-result-object p3

    .line 24
    check-cast p3, Lnet/time4j/h0;

    .line 25
    .line 26
    invoke-virtual {p3}, Lnet/time4j/h0;->Y()Lnet/time4j/f0;

    .line 27
    .line 28
    .line 29
    move-result-object p3

    .line 30
    invoke-virtual {p1}, Lfj/x;->q()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {p3, p1, p2}, Lfj/m;->V(Ljava/lang/Class;Ljava/lang/String;)Lfj/l;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-static {p1, v1}, Lnet/time4j/r;->b(Lfj/l;Lnet/time4j/g0;)Lnet/time4j/r;

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

.method public t0(Lfj/x;Lnet/time4j/tz/k;Lfj/f0;)Lnet/time4j/r;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<C:",
            "Lfj/m<",
            "*TC;>;>(",
            "Lfj/x<",
            "TC;>;",
            "Lnet/time4j/tz/k;",
            "Lfj/f0;",
            ")",
            "Lnet/time4j/r<",
            "TC;>;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p2}, Lnet/time4j/a0;->w0(Lnet/time4j/tz/k;)Lnet/time4j/h0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lnet/time4j/h0;->a0()Lnet/time4j/g0;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0}, Lnet/time4j/h0;->Y()Lnet/time4j/f0;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {p3, v2, p2}, Lfj/f0;->b(Lfj/g;Lnet/time4j/tz/k;)I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    int-to-long p2, p2

    .line 18
    sget-object v2, Lnet/time4j/g;->m:Lnet/time4j/g;

    .line 19
    .line 20
    invoke-virtual {v0, p2, p3, v2}, Lfj/k0;->J(JLjava/lang/Object;)Lfj/k0;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    check-cast p2, Lnet/time4j/h0;

    .line 25
    .line 26
    invoke-virtual {p2}, Lnet/time4j/h0;->Y()Lnet/time4j/f0;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    invoke-virtual {p1}, Lfj/x;->q()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {p2, p1}, Lfj/m;->W(Ljava/lang/Class;)Lfj/m;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-static {p1, v1}, Lnet/time4j/r;->d(Lfj/m;Lnet/time4j/g0;)Lnet/time4j/r;

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

.method public toString()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lnet/time4j/a0;->v0(Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u()J
    .locals 2

    iget-wide v0, p0, Lnet/time4j/a0;->k:J

    return-wide v0
.end method

.method protected bridge synthetic v()Lfj/x;
    .locals 1

    invoke-virtual {p0}, Lnet/time4j/a0;->H()Lfj/h0;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic w()Lfj/q;
    .locals 1

    invoke-virtual {p0}, Lnet/time4j/a0;->e0()Lnet/time4j/a0;

    move-result-object v0

    return-object v0
.end method

.method public w0(Lnet/time4j/tz/k;)Lnet/time4j/h0;
    .locals 0

    invoke-static {p1}, Lnet/time4j/tz/l;->N(Lnet/time4j/tz/k;)Lnet/time4j/tz/l;

    move-result-object p1

    invoke-direct {p0, p1}, Lnet/time4j/a0;->j0(Lnet/time4j/tz/l;)Lnet/time4j/h0;

    move-result-object p1

    return-object p1
.end method

.method z0(Ljava/io/DataOutput;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Lnet/time4j/a0;->n0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/16 v0, 0x41

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/16 v0, 0x40

    .line 11
    .line 12
    :goto_0
    invoke-virtual {p0}, Lnet/time4j/a0;->a()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-lez v1, :cond_1

    .line 17
    .line 18
    or-int/lit8 v0, v0, 0x2

    .line 19
    .line 20
    :cond_1
    invoke-interface {p1, v0}, Ljava/io/DataOutput;->writeByte(I)V

    .line 21
    .line 22
    .line 23
    iget-wide v2, p0, Lnet/time4j/a0;->k:J

    .line 24
    .line 25
    invoke-interface {p1, v2, v3}, Ljava/io/DataOutput;->writeLong(J)V

    .line 26
    .line 27
    .line 28
    if-lez v1, :cond_2

    .line 29
    .line 30
    invoke-interface {p1, v1}, Ljava/io/DataOutput;->writeInt(I)V

    .line 31
    .line 32
    .line 33
    :cond_2
    return-void
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
