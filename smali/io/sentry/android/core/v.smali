.class final Lio/sentry/android/core/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/n0;


# instance fields
.field private a:I

.field private b:Ljava/io/File;

.field private c:Ljava/io/File;

.field private d:Ljava/util/concurrent/Future;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/Future<",
            "*>;"
        }
    .end annotation
.end field

.field private final e:Landroid/content/Context;

.field private final f:Lio/sentry/android/core/SentryAndroidOptions;

.field private final g:Lio/sentry/f0;

.field private final h:Lio/sentry/android/core/f0;

.field private i:J

.field private j:J

.field private k:Z

.field private l:I

.field private m:Ljava/lang/String;

.field private final n:Lio/sentry/android/core/internal/util/k;

.field private final o:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/sentry/x1;",
            ">;"
        }
    .end annotation
.end field

.field private final p:Ljava/util/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "Lio/sentry/profilemeasurements/b;",
            ">;"
        }
    .end annotation
.end field

.field private final q:Ljava/util/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "Lio/sentry/profilemeasurements/b;",
            ">;"
        }
    .end annotation
.end field

.field private final r:Ljava/util/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "Lio/sentry/profilemeasurements/b;",
            ">;"
        }
    .end annotation
.end field

.field private final s:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/sentry/profilemeasurements/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lio/sentry/android/core/SentryAndroidOptions;Lio/sentry/android/core/f0;Lio/sentry/android/core/internal/util/k;)V
    .locals 6

    .line 1
    invoke-static {}, Lio/sentry/b0;->a()Lio/sentry/b0;

    move-result-object v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    .line 2
    invoke-direct/range {v0 .. v5}, Lio/sentry/android/core/v;-><init>(Landroid/content/Context;Lio/sentry/android/core/SentryAndroidOptions;Lio/sentry/android/core/f0;Lio/sentry/android/core/internal/util/k;Lio/sentry/f0;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lio/sentry/android/core/SentryAndroidOptions;Lio/sentry/android/core/f0;Lio/sentry/android/core/internal/util/k;Lio/sentry/f0;)V
    .locals 2

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Lio/sentry/android/core/v;->b:Ljava/io/File;

    .line 5
    iput-object v0, p0, Lio/sentry/android/core/v;->c:Ljava/io/File;

    .line 6
    iput-object v0, p0, Lio/sentry/android/core/v;->d:Ljava/util/concurrent/Future;

    const-wide/16 v0, 0x0

    .line 7
    iput-wide v0, p0, Lio/sentry/android/core/v;->i:J

    .line 8
    iput-wide v0, p0, Lio/sentry/android/core/v;->j:J

    const/4 v0, 0x0

    .line 9
    iput-boolean v0, p0, Lio/sentry/android/core/v;->k:Z

    .line 10
    iput v0, p0, Lio/sentry/android/core/v;->l:I

    .line 11
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lio/sentry/android/core/v;->o:Ljava/util/Map;

    .line 12
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Lio/sentry/android/core/v;->p:Ljava/util/ArrayDeque;

    .line 13
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Lio/sentry/android/core/v;->q:Ljava/util/ArrayDeque;

    .line 14
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Lio/sentry/android/core/v;->r:Ljava/util/ArrayDeque;

    .line 15
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lio/sentry/android/core/v;->s:Ljava/util/Map;

    const-string v0, "The application context is required"

    .line 16
    invoke-static {p1, v0}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    iput-object p1, p0, Lio/sentry/android/core/v;->e:Landroid/content/Context;

    const-string p1, "SentryAndroidOptions is required"

    .line 17
    invoke-static {p2, p1}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/sentry/android/core/SentryAndroidOptions;

    iput-object p1, p0, Lio/sentry/android/core/v;->f:Lio/sentry/android/core/SentryAndroidOptions;

    const-string p1, "Hub is required"

    .line 18
    invoke-static {p5, p1}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/sentry/f0;

    iput-object p1, p0, Lio/sentry/android/core/v;->g:Lio/sentry/f0;

    const-string p1, "SentryFrameMetricsCollector is required"

    .line 19
    invoke-static {p4, p1}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/sentry/android/core/internal/util/k;

    iput-object p1, p0, Lio/sentry/android/core/v;->n:Lio/sentry/android/core/internal/util/k;

    const-string p1, "The BuildInfoProvider is required."

    .line 20
    invoke-static {p3, p1}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/sentry/android/core/f0;

    iput-object p1, p0, Lio/sentry/android/core/v;->h:Lio/sentry/android/core/f0;

    return-void
.end method

.method public static synthetic c()Ljava/util/List;
    .locals 1

    invoke-static {}, Lio/sentry/android/core/v;->n()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d(Lio/sentry/android/core/v;Lio/sentry/m0;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/sentry/android/core/v;->m(Lio/sentry/m0;)V

    return-void
.end method

.method public static synthetic e(Lio/sentry/android/core/v;Lio/sentry/m0;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/sentry/android/core/v;->o(Lio/sentry/m0;)V

    return-void
.end method

.method public static synthetic f(Lio/sentry/android/core/v;Lio/sentry/m0;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/sentry/android/core/v;->p(Lio/sentry/m0;)V

    return-void
.end method

.method static synthetic g(Lio/sentry/android/core/v;)J
    .locals 2

    iget-wide v0, p0, Lio/sentry/android/core/v;->i:J

    return-wide v0
.end method

.method static synthetic h(Lio/sentry/android/core/v;)Ljava/util/ArrayDeque;
    .locals 0

    iget-object p0, p0, Lio/sentry/android/core/v;->r:Ljava/util/ArrayDeque;

    return-object p0
.end method

.method static synthetic i(Lio/sentry/android/core/v;)Ljava/util/ArrayDeque;
    .locals 0

    iget-object p0, p0, Lio/sentry/android/core/v;->q:Ljava/util/ArrayDeque;

    return-object p0
.end method

.method static synthetic j(Lio/sentry/android/core/v;)Ljava/util/ArrayDeque;
    .locals 0

    iget-object p0, p0, Lio/sentry/android/core/v;->p:Ljava/util/ArrayDeque;

    return-object p0
.end method

.method private k()Landroid/app/ActivityManager$MemoryInfo;
    .locals 5

    .line 1
    const-string v0, "Error getting MemoryInfo."

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    iget-object v2, p0, Lio/sentry/android/core/v;->e:Landroid/content/Context;

    .line 5
    .line 6
    const-string v3, "activity"

    .line 7
    .line 8
    invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    check-cast v2, Landroid/app/ActivityManager;

    .line 13
    .line 14
    new-instance v3, Landroid/app/ActivityManager$MemoryInfo;

    .line 15
    .line 16
    invoke-direct {v3}, Landroid/app/ActivityManager$MemoryInfo;-><init>()V

    .line 17
    .line 18
    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    invoke-virtual {v2, v3}, Landroid/app/ActivityManager;->getMemoryInfo(Landroid/app/ActivityManager$MemoryInfo;)V

    .line 22
    .line 23
    .line 24
    return-object v3

    .line 25
    :cond_0
    iget-object v2, p0, Lio/sentry/android/core/v;->f:Lio/sentry/android/core/SentryAndroidOptions;

    .line 26
    .line 27
    invoke-virtual {v2}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    sget-object v3, Lio/sentry/n3;->INFO:Lio/sentry/n3;

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    new-array v4, v4, [Ljava/lang/Object;

    .line 35
    .line 36
    invoke-interface {v2, v3, v0, v4}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    .line 39
    return-object v1

    .line 40
    :catchall_0
    move-exception v2

    .line 41
    iget-object v3, p0, Lio/sentry/android/core/v;->f:Lio/sentry/android/core/SentryAndroidOptions;

    .line 42
    .line 43
    invoke-virtual {v3}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    sget-object v4, Lio/sentry/n3;->ERROR:Lio/sentry/n3;

    .line 48
    .line 49
    invoke-interface {v3, v4, v0, v2}, Lio/sentry/g0;->b(Lio/sentry/n3;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 50
    .line 51
    .line 52
    return-object v1
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

.method private l()V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lio/sentry/android/core/v;->k:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lio/sentry/android/core/v;->k:Z

    .line 8
    .line 9
    iget-object v1, p0, Lio/sentry/android/core/v;->f:Lio/sentry/android/core/SentryAndroidOptions;

    .line 10
    .line 11
    invoke-virtual {v1}, Lio/sentry/o3;->getProfilingTracesDirPath()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    iget-object v2, p0, Lio/sentry/android/core/v;->f:Lio/sentry/android/core/SentryAndroidOptions;

    .line 16
    .line 17
    invoke-virtual {v2}, Lio/sentry/o3;->isProfilingEnabled()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    const/4 v3, 0x0

    .line 22
    if-nez v2, :cond_1

    .line 23
    .line 24
    iget-object v0, p0, Lio/sentry/android/core/v;->f:Lio/sentry/android/core/SentryAndroidOptions;

    .line 25
    .line 26
    invoke-virtual {v0}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    sget-object v1, Lio/sentry/n3;->INFO:Lio/sentry/n3;

    .line 31
    .line 32
    const-string v2, "Profiling is disabled in options."

    .line 33
    .line 34
    new-array v3, v3, [Ljava/lang/Object;

    .line 35
    .line 36
    invoke-interface {v0, v1, v2, v3}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_1
    if-nez v1, :cond_2

    .line 41
    .line 42
    iget-object v0, p0, Lio/sentry/android/core/v;->f:Lio/sentry/android/core/SentryAndroidOptions;

    .line 43
    .line 44
    invoke-virtual {v0}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    sget-object v1, Lio/sentry/n3;->WARNING:Lio/sentry/n3;

    .line 49
    .line 50
    const-string v2, "Disabling profiling because no profiling traces dir path is defined in options."

    .line 51
    .line 52
    new-array v3, v3, [Ljava/lang/Object;

    .line 53
    .line 54
    invoke-interface {v0, v1, v2, v3}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_2
    iget-object v2, p0, Lio/sentry/android/core/v;->f:Lio/sentry/android/core/SentryAndroidOptions;

    .line 59
    .line 60
    invoke-virtual {v2}, Lio/sentry/android/core/SentryAndroidOptions;->getProfilingTracesHz()I

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-gtz v2, :cond_3

    .line 65
    .line 66
    iget-object v1, p0, Lio/sentry/android/core/v;->f:Lio/sentry/android/core/SentryAndroidOptions;

    .line 67
    .line 68
    invoke-virtual {v1}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    sget-object v4, Lio/sentry/n3;->WARNING:Lio/sentry/n3;

    .line 73
    .line 74
    new-array v0, v0, [Ljava/lang/Object;

    .line 75
    .line 76
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    aput-object v2, v0, v3

    .line 81
    .line 82
    const-string v2, "Disabling profiling because trace rate is set to %d"

    .line 83
    .line 84
    invoke-interface {v1, v4, v2, v0}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :cond_3
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 89
    .line 90
    const-wide/16 v3, 0x1

    .line 91
    .line 92
    invoke-virtual {v0, v3, v4}, Ljava/util/concurrent/TimeUnit;->toMicros(J)J

    .line 93
    .line 94
    .line 95
    move-result-wide v3

    .line 96
    long-to-int v0, v3

    .line 97
    div-int/2addr v0, v2

    .line 98
    iput v0, p0, Lio/sentry/android/core/v;->a:I

    .line 99
    .line 100
    new-instance v0, Ljava/io/File;

    .line 101
    .line 102
    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    iput-object v0, p0, Lio/sentry/android/core/v;->c:Ljava/io/File;

    .line 106
    .line 107
    return-void
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
.end method

.method private synthetic m(Lio/sentry/m0;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lio/sentry/android/core/v;->s(Lio/sentry/m0;Z)V

    return-void
.end method

.method private static synthetic n()Ljava/util/List;
    .locals 1

    invoke-static {}, Lio/sentry/android/core/internal/util/c;->a()Lio/sentry/android/core/internal/util/c;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/android/core/internal/util/c;->c()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private synthetic o(Lio/sentry/m0;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lio/sentry/android/core/v;->s(Lio/sentry/m0;Z)V

    return-void
.end method

.method private synthetic p(Lio/sentry/m0;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/sentry/android/core/v;->t(Lio/sentry/m0;)V

    return-void
.end method

.method private q(Lio/sentry/m0;)V
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    iget-object v1, p0, Lio/sentry/android/core/v;->c:Ljava/io/File;

    .line 4
    .line 5
    new-instance v2, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v3, ".trace"

    .line 18
    .line 19
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, Lio/sentry/android/core/v;->b:Ljava/io/File;

    .line 30
    .line 31
    iget-object v0, p0, Lio/sentry/android/core/v;->s:Ljava/util/Map;

    .line 32
    .line 33
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lio/sentry/android/core/v;->p:Ljava/util/ArrayDeque;

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->clear()V

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, Lio/sentry/android/core/v;->q:Ljava/util/ArrayDeque;

    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->clear()V

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Lio/sentry/android/core/v;->r:Ljava/util/ArrayDeque;

    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->clear()V

    .line 49
    .line 50
    .line 51
    iget-object v0, p0, Lio/sentry/android/core/v;->n:Lio/sentry/android/core/internal/util/k;

    .line 52
    .line 53
    new-instance v1, Lio/sentry/android/core/v$a;

    .line 54
    .line 55
    invoke-direct {v1, p0}, Lio/sentry/android/core/v$a;-><init>(Lio/sentry/android/core/v;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v1}, Lio/sentry/android/core/internal/util/k;->f(Lio/sentry/android/core/internal/util/k$b;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    iput-object v0, p0, Lio/sentry/android/core/v;->m:Ljava/lang/String;

    .line 63
    .line 64
    iget-object v0, p0, Lio/sentry/android/core/v;->f:Lio/sentry/android/core/SentryAndroidOptions;

    .line 65
    .line 66
    invoke-virtual {v0}, Lio/sentry/o3;->getExecutorService()Lio/sentry/k0;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    new-instance v1, Lio/sentry/android/core/t;

    .line 71
    .line 72
    invoke-direct {v1, p0, p1}, Lio/sentry/android/core/t;-><init>(Lio/sentry/android/core/v;Lio/sentry/m0;)V

    .line 73
    .line 74
    .line 75
    const-wide/16 v2, 0x7530

    .line 76
    .line 77
    invoke-interface {v0, v1, v2, v3}, Lio/sentry/k0;->b(Ljava/lang/Runnable;J)Ljava/util/concurrent/Future;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    iput-object v0, p0, Lio/sentry/android/core/v;->d:Ljava/util/concurrent/Future;

    .line 82
    .line 83
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    .line 84
    .line 85
    .line 86
    move-result-wide v0

    .line 87
    iput-wide v0, p0, Lio/sentry/android/core/v;->i:J

    .line 88
    .line 89
    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    .line 90
    .line 91
    .line 92
    move-result-wide v0

    .line 93
    iput-wide v0, p0, Lio/sentry/android/core/v;->j:J

    .line 94
    .line 95
    new-instance v0, Lio/sentry/x1;

    .line 96
    .line 97
    iget-wide v1, p0, Lio/sentry/android/core/v;->i:J

    .line 98
    .line 99
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    iget-wide v2, p0, Lio/sentry/android/core/v;->j:J

    .line 104
    .line 105
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    invoke-direct {v0, p1, v1, v2}, Lio/sentry/x1;-><init>(Lio/sentry/m0;Ljava/lang/Long;Ljava/lang/Long;)V

    .line 110
    .line 111
    .line 112
    iget-object v1, p0, Lio/sentry/android/core/v;->o:Ljava/util/Map;

    .line 113
    .line 114
    invoke-interface {p1}, Lio/sentry/m0;->i()Lio/sentry/protocol/p;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    invoke-virtual {p1}, Lio/sentry/protocol/p;->toString()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    iget-object p1, p0, Lio/sentry/android/core/v;->b:Ljava/io/File;

    .line 126
    .line 127
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    const v0, 0x2dc6c0

    .line 132
    .line 133
    .line 134
    iget v1, p0, Lio/sentry/android/core/v;->a:I

    .line 135
    .line 136
    invoke-static {p1, v0, v1}, Landroid/os/Debug;->startMethodTracingSampling(Ljava/lang/String;II)V

    .line 137
    .line 138
    .line 139
    return-void
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

.method private r(Lio/sentry/m0;Z)V
    .locals 26
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    invoke-static {}, Landroid/os/Debug;->stopMethodTracing()V

    .line 4
    .line 5
    .line 6
    iget-object v0, v1, Lio/sentry/android/core/v;->n:Lio/sentry/android/core/internal/util/k;

    .line 7
    .line 8
    iget-object v2, v1, Lio/sentry/android/core/v;->m:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v2}, Lio/sentry/android/core/internal/util/k;->g(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    .line 14
    .line 15
    .line 16
    move-result-wide v2

    .line 17
    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    .line 18
    .line 19
    .line 20
    move-result-wide v4

    .line 21
    iget-wide v6, v1, Lio/sentry/android/core/v;->i:J

    .line 22
    .line 23
    sub-long v6, v2, v6

    .line 24
    .line 25
    new-instance v10, Ljava/util/ArrayList;

    .line 26
    .line 27
    iget-object v0, v1, Lio/sentry/android/core/v;->o:Ljava/util/Map;

    .line 28
    .line 29
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-direct {v10, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 34
    .line 35
    .line 36
    iget-object v0, v1, Lio/sentry/android/core/v;->o:Ljava/util/Map;

    .line 37
    .line 38
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 39
    .line 40
    .line 41
    const/4 v0, 0x0

    .line 42
    iput v0, v1, Lio/sentry/android/core/v;->l:I

    .line 43
    .line 44
    iget-object v8, v1, Lio/sentry/android/core/v;->d:Ljava/util/concurrent/Future;

    .line 45
    .line 46
    if-eqz v8, :cond_0

    .line 47
    .line 48
    const/4 v9, 0x1

    .line 49
    invoke-interface {v8, v9}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 50
    .line 51
    .line 52
    const/4 v8, 0x0

    .line 53
    iput-object v8, v1, Lio/sentry/android/core/v;->d:Ljava/util/concurrent/Future;

    .line 54
    .line 55
    :cond_0
    iget-object v8, v1, Lio/sentry/android/core/v;->b:Ljava/io/File;

    .line 56
    .line 57
    if-nez v8, :cond_1

    .line 58
    .line 59
    iget-object v2, v1, Lio/sentry/android/core/v;->f:Lio/sentry/android/core/SentryAndroidOptions;

    .line 60
    .line 61
    invoke-virtual {v2}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    sget-object v3, Lio/sentry/n3;->ERROR:Lio/sentry/n3;

    .line 66
    .line 67
    const-string v4, "Trace file does not exists"

    .line 68
    .line 69
    new-array v0, v0, [Ljava/lang/Object;

    .line 70
    .line 71
    invoke-interface {v2, v3, v4, v0}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :cond_1
    invoke-direct/range {p0 .. p0}, Lio/sentry/android/core/v;->k()Landroid/app/ActivityManager$MemoryInfo;

    .line 76
    .line 77
    .line 78
    move-result-object v8

    .line 79
    if-eqz v8, :cond_2

    .line 80
    .line 81
    iget-wide v8, v8, Landroid/app/ActivityManager$MemoryInfo;->totalMem:J

    .line 82
    .line 83
    invoke-static {v8, v9}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v8

    .line 87
    goto :goto_0

    .line 88
    :cond_2
    const-string v8, "0"

    .line 89
    .line 90
    :goto_0
    move-object/from16 v20, v8

    .line 91
    .line 92
    sget-object v8, Landroid/os/Build;->SUPPORTED_ABIS:[Ljava/lang/String;

    .line 93
    .line 94
    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 95
    .line 96
    .line 97
    move-result-object v9

    .line 98
    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 99
    .line 100
    .line 101
    move-result v11

    .line 102
    if-eqz v11, :cond_3

    .line 103
    .line 104
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v11

    .line 108
    check-cast v11, Lio/sentry/x1;

    .line 109
    .line 110
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 111
    .line 112
    .line 113
    move-result-object v12

    .line 114
    iget-wide v13, v1, Lio/sentry/android/core/v;->i:J

    .line 115
    .line 116
    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 117
    .line 118
    .line 119
    move-result-object v13

    .line 120
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 121
    .line 122
    .line 123
    move-result-object v14

    .line 124
    move-wide v15, v2

    .line 125
    iget-wide v2, v1, Lio/sentry/android/core/v;->j:J

    .line 126
    .line 127
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    invoke-virtual {v11, v12, v13, v14, v2}, Lio/sentry/x1;->h(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V

    .line 132
    .line 133
    .line 134
    move-wide v2, v15

    .line 135
    goto :goto_1

    .line 136
    :cond_3
    iget-object v2, v1, Lio/sentry/android/core/v;->q:Ljava/util/ArrayDeque;

    .line 137
    .line 138
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 139
    .line 140
    .line 141
    move-result v2

    .line 142
    const-string v3, "nanosecond"

    .line 143
    .line 144
    if-nez v2, :cond_4

    .line 145
    .line 146
    iget-object v2, v1, Lio/sentry/android/core/v;->s:Ljava/util/Map;

    .line 147
    .line 148
    new-instance v4, Lio/sentry/profilemeasurements/a;

    .line 149
    .line 150
    iget-object v5, v1, Lio/sentry/android/core/v;->q:Ljava/util/ArrayDeque;

    .line 151
    .line 152
    invoke-direct {v4, v3, v5}, Lio/sentry/profilemeasurements/a;-><init>(Ljava/lang/String;Ljava/util/Collection;)V

    .line 153
    .line 154
    .line 155
    const-string v5, "slow_frame_renders"

    .line 156
    .line 157
    invoke-interface {v2, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    :cond_4
    iget-object v2, v1, Lio/sentry/android/core/v;->r:Ljava/util/ArrayDeque;

    .line 161
    .line 162
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 163
    .line 164
    .line 165
    move-result v2

    .line 166
    if-nez v2, :cond_5

    .line 167
    .line 168
    iget-object v2, v1, Lio/sentry/android/core/v;->s:Ljava/util/Map;

    .line 169
    .line 170
    new-instance v4, Lio/sentry/profilemeasurements/a;

    .line 171
    .line 172
    iget-object v5, v1, Lio/sentry/android/core/v;->r:Ljava/util/ArrayDeque;

    .line 173
    .line 174
    invoke-direct {v4, v3, v5}, Lio/sentry/profilemeasurements/a;-><init>(Ljava/lang/String;Ljava/util/Collection;)V

    .line 175
    .line 176
    .line 177
    const-string v3, "frozen_frame_renders"

    .line 178
    .line 179
    invoke-interface {v2, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    :cond_5
    iget-object v2, v1, Lio/sentry/android/core/v;->p:Ljava/util/ArrayDeque;

    .line 183
    .line 184
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 185
    .line 186
    .line 187
    move-result v2

    .line 188
    if-nez v2, :cond_6

    .line 189
    .line 190
    iget-object v2, v1, Lio/sentry/android/core/v;->s:Ljava/util/Map;

    .line 191
    .line 192
    new-instance v3, Lio/sentry/profilemeasurements/a;

    .line 193
    .line 194
    const-string v4, "hz"

    .line 195
    .line 196
    iget-object v5, v1, Lio/sentry/android/core/v;->p:Ljava/util/ArrayDeque;

    .line 197
    .line 198
    invoke-direct {v3, v4, v5}, Lio/sentry/profilemeasurements/a;-><init>(Ljava/lang/String;Ljava/util/Collection;)V

    .line 199
    .line 200
    .line 201
    const-string v4, "screen_frame_rates"

    .line 202
    .line 203
    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    :cond_6
    new-instance v2, Lio/sentry/w1;

    .line 207
    .line 208
    iget-object v9, v1, Lio/sentry/android/core/v;->b:Ljava/io/File;

    .line 209
    .line 210
    invoke-static {v6, v7}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v12

    .line 214
    iget-object v3, v1, Lio/sentry/android/core/v;->h:Lio/sentry/android/core/f0;

    .line 215
    .line 216
    invoke-virtual {v3}, Lio/sentry/android/core/f0;->d()I

    .line 217
    .line 218
    .line 219
    move-result v13

    .line 220
    if-eqz v8, :cond_7

    .line 221
    .line 222
    array-length v3, v8

    .line 223
    if-lez v3, :cond_7

    .line 224
    .line 225
    aget-object v0, v8, v0

    .line 226
    .line 227
    goto :goto_2

    .line 228
    :cond_7
    const-string v0, ""

    .line 229
    .line 230
    :goto_2
    move-object v14, v0

    .line 231
    new-instance v15, Lio/sentry/android/core/u;

    .line 232
    .line 233
    invoke-direct {v15}, Lio/sentry/android/core/u;-><init>()V

    .line 234
    .line 235
    .line 236
    iget-object v0, v1, Lio/sentry/android/core/v;->h:Lio/sentry/android/core/f0;

    .line 237
    .line 238
    invoke-virtual {v0}, Lio/sentry/android/core/f0;->b()Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v16

    .line 242
    iget-object v0, v1, Lio/sentry/android/core/v;->h:Lio/sentry/android/core/f0;

    .line 243
    .line 244
    invoke-virtual {v0}, Lio/sentry/android/core/f0;->c()Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object v17

    .line 248
    iget-object v0, v1, Lio/sentry/android/core/v;->h:Lio/sentry/android/core/f0;

    .line 249
    .line 250
    invoke-virtual {v0}, Lio/sentry/android/core/f0;->e()Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v18

    .line 254
    iget-object v0, v1, Lio/sentry/android/core/v;->h:Lio/sentry/android/core/f0;

    .line 255
    .line 256
    invoke-virtual {v0}, Lio/sentry/android/core/f0;->f()Ljava/lang/Boolean;

    .line 257
    .line 258
    .line 259
    move-result-object v19

    .line 260
    iget-object v0, v1, Lio/sentry/android/core/v;->f:Lio/sentry/android/core/SentryAndroidOptions;

    .line 261
    .line 262
    invoke-virtual {v0}, Lio/sentry/o3;->getProguardUuid()Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v21

    .line 266
    iget-object v0, v1, Lio/sentry/android/core/v;->f:Lio/sentry/android/core/SentryAndroidOptions;

    .line 267
    .line 268
    invoke-virtual {v0}, Lio/sentry/o3;->getRelease()Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v22

    .line 272
    iget-object v0, v1, Lio/sentry/android/core/v;->f:Lio/sentry/android/core/SentryAndroidOptions;

    .line 273
    .line 274
    invoke-virtual {v0}, Lio/sentry/o3;->getEnvironment()Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v23

    .line 278
    if-eqz p2, :cond_8

    .line 279
    .line 280
    const-string v0, "timeout"

    .line 281
    .line 282
    goto :goto_3

    .line 283
    :cond_8
    const-string v0, "normal"

    .line 284
    .line 285
    :goto_3
    move-object/from16 v24, v0

    .line 286
    .line 287
    iget-object v0, v1, Lio/sentry/android/core/v;->s:Ljava/util/Map;

    .line 288
    .line 289
    move-object/from16 v25, v0

    .line 290
    .line 291
    move-object v8, v2

    .line 292
    move-object/from16 v11, p1

    .line 293
    .line 294
    invoke-direct/range {v8 .. v25}, Lio/sentry/w1;-><init>(Ljava/io/File;Ljava/util/List;Lio/sentry/m0;Ljava/lang/String;ILjava/lang/String;Ljava/util/concurrent/Callable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    .line 295
    .line 296
    .line 297
    :try_start_0
    iget-object v0, v1, Lio/sentry/android/core/v;->f:Lio/sentry/android/core/SentryAndroidOptions;

    .line 298
    .line 299
    invoke-virtual {v0}, Lio/sentry/o3;->getSerializer()Lio/sentry/l0;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    iget-object v3, v1, Lio/sentry/android/core/v;->f:Lio/sentry/android/core/SentryAndroidOptions;

    .line 304
    .line 305
    invoke-virtual {v3}, Lio/sentry/o3;->getMaxTraceFileSize()J

    .line 306
    .line 307
    .line 308
    move-result-wide v3

    .line 309
    iget-object v5, v1, Lio/sentry/android/core/v;->f:Lio/sentry/android/core/SentryAndroidOptions;

    .line 310
    .line 311
    invoke-virtual {v5}, Lio/sentry/o3;->getSdkVersion()Lio/sentry/protocol/n;

    .line 312
    .line 313
    .line 314
    move-result-object v5

    .line 315
    invoke-static {v0, v2, v3, v4, v5}, Lio/sentry/q2;->a(Lio/sentry/l0;Lio/sentry/w1;JLio/sentry/protocol/n;)Lio/sentry/q2;

    .line 316
    .line 317
    .line 318
    move-result-object v0
    :try_end_0
    .catch Lio/sentry/exception/b; {:try_start_0 .. :try_end_0} :catch_0

    .line 319
    iget-object v2, v1, Lio/sentry/android/core/v;->g:Lio/sentry/f0;

    .line 320
    .line 321
    invoke-interface {v2, v0}, Lio/sentry/f0;->w(Lio/sentry/q2;)Lio/sentry/protocol/p;

    .line 322
    .line 323
    .line 324
    return-void

    .line 325
    :catch_0
    move-exception v0

    .line 326
    iget-object v2, v1, Lio/sentry/android/core/v;->f:Lio/sentry/android/core/SentryAndroidOptions;

    .line 327
    .line 328
    invoke-virtual {v2}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 329
    .line 330
    .line 331
    move-result-object v2

    .line 332
    sget-object v3, Lio/sentry/n3;->ERROR:Lio/sentry/n3;

    .line 333
    .line 334
    const-string v4, "Failed to capture profile."

    .line 335
    .line 336
    invoke-interface {v2, v3, v4, v0}, Lio/sentry/g0;->b(Lio/sentry/n3;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 337
    .line 338
    .line 339
    return-void
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
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
.end method

.method private s(Lio/sentry/m0;Z)V
    .locals 7
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lio/sentry/android/core/v;->h:Lio/sentry/android/core/f0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/android/core/f0;->d()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x15

    .line 8
    .line 9
    if-ge v0, v1, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    iget-object v0, p0, Lio/sentry/android/core/v;->o:Ljava/util/Map;

    .line 13
    .line 14
    invoke-interface {p1}, Lio/sentry/m0;->i()Lio/sentry/protocol/p;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v1}, Lio/sentry/protocol/p;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const/4 v1, 0x0

    .line 27
    const/4 v2, 0x2

    .line 28
    const/4 v3, 0x1

    .line 29
    if-nez v0, :cond_1

    .line 30
    .line 31
    iget-object p2, p0, Lio/sentry/android/core/v;->f:Lio/sentry/android/core/SentryAndroidOptions;

    .line 32
    .line 33
    invoke-virtual {p2}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    sget-object v0, Lio/sentry/n3;->INFO:Lio/sentry/n3;

    .line 38
    .line 39
    new-array v2, v2, [Ljava/lang/Object;

    .line 40
    .line 41
    invoke-interface {p1}, Lio/sentry/m0;->getName()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    aput-object v4, v2, v1

    .line 46
    .line 47
    invoke-interface {p1}, Lio/sentry/ISpan;->l()Lio/sentry/c4;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {p1}, Lio/sentry/c4;->j()Lio/sentry/protocol/p;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-virtual {p1}, Lio/sentry/protocol/p;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    aput-object p1, v2, v3

    .line 60
    .line 61
    const-string p1, "Transaction %s (%s) finished, but was not currently being profiled. Skipping"

    .line 62
    .line 63
    invoke-interface {p2, v0, p1, v2}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :cond_1
    iget v0, p0, Lio/sentry/android/core/v;->l:I

    .line 68
    .line 69
    if-lez v0, :cond_2

    .line 70
    .line 71
    sub-int/2addr v0, v3

    .line 72
    iput v0, p0, Lio/sentry/android/core/v;->l:I

    .line 73
    .line 74
    :cond_2
    iget-object v0, p0, Lio/sentry/android/core/v;->f:Lio/sentry/android/core/SentryAndroidOptions;

    .line 75
    .line 76
    invoke-virtual {v0}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    sget-object v4, Lio/sentry/n3;->DEBUG:Lio/sentry/n3;

    .line 81
    .line 82
    const/4 v5, 0x3

    .line 83
    new-array v5, v5, [Ljava/lang/Object;

    .line 84
    .line 85
    invoke-interface {p1}, Lio/sentry/m0;->getName()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v6

    .line 89
    aput-object v6, v5, v1

    .line 90
    .line 91
    invoke-interface {p1}, Lio/sentry/ISpan;->l()Lio/sentry/c4;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-virtual {v1}, Lio/sentry/c4;->j()Lio/sentry/protocol/p;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    invoke-virtual {v1}, Lio/sentry/protocol/p;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    aput-object v1, v5, v3

    .line 104
    .line 105
    iget v1, p0, Lio/sentry/android/core/v;->l:I

    .line 106
    .line 107
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    aput-object v1, v5, v2

    .line 112
    .line 113
    const-string v1, "Transaction %s (%s) finished. Transactions to be profiled: %d"

    .line 114
    .line 115
    invoke-interface {v0, v4, v1, v5}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    iget v0, p0, Lio/sentry/android/core/v;->l:I

    .line 119
    .line 120
    if-eqz v0, :cond_4

    .line 121
    .line 122
    if-nez p2, :cond_4

    .line 123
    .line 124
    iget-object p2, p0, Lio/sentry/android/core/v;->o:Ljava/util/Map;

    .line 125
    .line 126
    invoke-interface {p1}, Lio/sentry/m0;->i()Lio/sentry/protocol/p;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    invoke-virtual {p1}, Lio/sentry/protocol/p;->toString()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    check-cast p1, Lio/sentry/x1;

    .line 139
    .line 140
    if-eqz p1, :cond_3

    .line 141
    .line 142
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    .line 143
    .line 144
    .line 145
    move-result-wide v0

    .line 146
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 147
    .line 148
    .line 149
    move-result-object p2

    .line 150
    iget-wide v0, p0, Lio/sentry/android/core/v;->i:J

    .line 151
    .line 152
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    .line 157
    .line 158
    .line 159
    move-result-wide v1

    .line 160
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    iget-wide v2, p0, Lio/sentry/android/core/v;->j:J

    .line 165
    .line 166
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    invoke-virtual {p1, p2, v0, v1, v2}, Lio/sentry/x1;->h(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V

    .line 171
    .line 172
    .line 173
    :cond_3
    return-void

    .line 174
    :cond_4
    invoke-direct {p0, p1, p2}, Lio/sentry/android/core/v;->r(Lio/sentry/m0;Z)V

    .line 175
    .line 176
    .line 177
    return-void
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

.method private t(Lio/sentry/m0;)V
    .locals 6
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lio/sentry/android/core/v;->h:Lio/sentry/android/core/f0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/android/core/f0;->d()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x15

    .line 8
    .line 9
    if-ge v0, v1, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-direct {p0}, Lio/sentry/android/core/v;->l()V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lio/sentry/android/core/v;->c:Ljava/io/File;

    .line 16
    .line 17
    if-eqz v0, :cond_3

    .line 18
    .line 19
    iget v1, p0, Lio/sentry/android/core/v;->a:I

    .line 20
    .line 21
    if-eqz v1, :cond_3

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/io/File;->canWrite()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    iget v0, p0, Lio/sentry/android/core/v;->l:I

    .line 31
    .line 32
    const/4 v1, 0x1

    .line 33
    add-int/2addr v0, v1

    .line 34
    iput v0, p0, Lio/sentry/android/core/v;->l:I

    .line 35
    .line 36
    if-ne v0, v1, :cond_2

    .line 37
    .line 38
    invoke-direct {p0, p1}, Lio/sentry/android/core/v;->q(Lio/sentry/m0;)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    new-instance v0, Lio/sentry/x1;

    .line 43
    .line 44
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    .line 45
    .line 46
    .line 47
    move-result-wide v2

    .line 48
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    .line 53
    .line 54
    .line 55
    move-result-wide v3

    .line 56
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-direct {v0, p1, v2, v3}, Lio/sentry/x1;-><init>(Lio/sentry/m0;Ljava/lang/Long;Ljava/lang/Long;)V

    .line 61
    .line 62
    .line 63
    iget-object v2, p0, Lio/sentry/android/core/v;->o:Ljava/util/Map;

    .line 64
    .line 65
    invoke-interface {p1}, Lio/sentry/m0;->i()Lio/sentry/protocol/p;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    invoke-virtual {v3}, Lio/sentry/protocol/p;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    :goto_0
    iget-object v0, p0, Lio/sentry/android/core/v;->f:Lio/sentry/android/core/SentryAndroidOptions;

    .line 77
    .line 78
    invoke-virtual {v0}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    sget-object v2, Lio/sentry/n3;->DEBUG:Lio/sentry/n3;

    .line 83
    .line 84
    const/4 v3, 0x3

    .line 85
    new-array v3, v3, [Ljava/lang/Object;

    .line 86
    .line 87
    invoke-interface {p1}, Lio/sentry/m0;->getName()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    const/4 v5, 0x0

    .line 92
    aput-object v4, v3, v5

    .line 93
    .line 94
    invoke-interface {p1}, Lio/sentry/ISpan;->l()Lio/sentry/c4;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-virtual {p1}, Lio/sentry/c4;->j()Lio/sentry/protocol/p;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    invoke-virtual {p1}, Lio/sentry/protocol/p;->toString()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    aput-object p1, v3, v1

    .line 107
    .line 108
    iget p1, p0, Lio/sentry/android/core/v;->l:I

    .line 109
    .line 110
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    const/4 v1, 0x2

    .line 115
    aput-object p1, v3, v1

    .line 116
    .line 117
    const-string p1, "Transaction %s (%s) started. Transactions being profiled: %d"

    .line 118
    .line 119
    invoke-interface {v0, v2, p1, v3}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    :cond_3
    :goto_1
    return-void
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
.method public declared-synchronized a(Lio/sentry/m0;)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lio/sentry/android/core/v;->f:Lio/sentry/android/core/SentryAndroidOptions;

    .line 3
    .line 4
    invoke-virtual {v0}, Lio/sentry/o3;->getExecutorService()Lio/sentry/k0;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    new-instance v1, Lio/sentry/android/core/r;

    .line 9
    .line 10
    invoke-direct {v1, p0, p1}, Lio/sentry/android/core/r;-><init>(Lio/sentry/android/core/v;Lio/sentry/m0;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {v0, v1}, Lio/sentry/k0;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    .line 15
    .line 16
    monitor-exit p0

    .line 17
    return-void

    .line 18
    :catchall_0
    move-exception p1

    .line 19
    monitor-exit p0

    .line 20
    throw p1
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public declared-synchronized b(Lio/sentry/m0;)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lio/sentry/android/core/v;->f:Lio/sentry/android/core/SentryAndroidOptions;

    .line 3
    .line 4
    invoke-virtual {v0}, Lio/sentry/o3;->getExecutorService()Lio/sentry/k0;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    new-instance v1, Lio/sentry/android/core/s;

    .line 9
    .line 10
    invoke-direct {v1, p0, p1}, Lio/sentry/android/core/s;-><init>(Lio/sentry/android/core/v;Lio/sentry/m0;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {v0, v1}, Lio/sentry/k0;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    .line 15
    .line 16
    monitor-exit p0

    .line 17
    return-void

    .line 18
    :catchall_0
    move-exception p1

    .line 19
    monitor-exit p0

    .line 20
    throw p1
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method
