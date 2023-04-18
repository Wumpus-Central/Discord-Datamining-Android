.class final Lcom/budiyev/android/codescanner/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/budiyev/android/codescanner/f$b;,
        Lcom/budiyev/android/codescanner/f$c;,
        Lcom/budiyev/android/codescanner/f$a;
    }
.end annotation


# instance fields
.field private final a:Lcd/i;

.field private final b:Lcom/budiyev/android/codescanner/f$a;

.field private final c:Lcom/budiyev/android/codescanner/f$c;

.field private final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcd/e;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Ljava/lang/Object;

.field private volatile f:Lcom/budiyev/android/codescanner/d;

.field private volatile g:Lcom/budiyev/android/codescanner/e;

.field private volatile h:Lcom/budiyev/android/codescanner/f$b;


# direct methods
.method public constructor <init>(Lcom/budiyev/android/codescanner/f$c;Ljava/lang/Thread$UncaughtExceptionHandler;Ljava/util/List;Lcom/budiyev/android/codescanner/d;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/budiyev/android/codescanner/f$c;",
            "Ljava/lang/Thread$UncaughtExceptionHandler;",
            "Ljava/util/List<",
            "Lcd/a;",
            ">;",
            "Lcom/budiyev/android/codescanner/d;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/budiyev/android/codescanner/f;->e:Ljava/lang/Object;

    .line 10
    .line 11
    new-instance v0, Lcd/i;

    .line 12
    .line 13
    invoke-direct {v0}, Lcd/i;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/budiyev/android/codescanner/f;->a:Lcd/i;

    .line 17
    .line 18
    new-instance v1, Lcom/budiyev/android/codescanner/f$a;

    .line 19
    .line 20
    invoke-direct {v1, p0}, Lcom/budiyev/android/codescanner/f$a;-><init>(Lcom/budiyev/android/codescanner/f;)V

    .line 21
    .line 22
    .line 23
    iput-object v1, p0, Lcom/budiyev/android/codescanner/f;->b:Lcom/budiyev/android/codescanner/f$a;

    .line 24
    .line 25
    invoke-virtual {v1, p2}, Ljava/lang/Thread;->setUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    .line 26
    .line 27
    .line 28
    new-instance p2, Ljava/util/EnumMap;

    .line 29
    .line 30
    const-class v1, Lcd/e;

    .line 31
    .line 32
    invoke-direct {p2, v1}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    .line 33
    .line 34
    .line 35
    iput-object p2, p0, Lcom/budiyev/android/codescanner/f;->d:Ljava/util/Map;

    .line 36
    .line 37
    sget-object v1, Lcd/e;->n:Lcd/e;

    .line 38
    .line 39
    invoke-interface {p2, v1, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, p2}, Lcd/i;->d(Ljava/util/Map;)V

    .line 43
    .line 44
    .line 45
    iput-object p4, p0, Lcom/budiyev/android/codescanner/f;->f:Lcom/budiyev/android/codescanner/d;

    .line 46
    .line 47
    iput-object p1, p0, Lcom/budiyev/android/codescanner/f;->c:Lcom/budiyev/android/codescanner/f$c;

    .line 48
    .line 49
    sget-object p1, Lcom/budiyev/android/codescanner/f$b;->k:Lcom/budiyev/android/codescanner/f$b;

    .line 50
    .line 51
    iput-object p1, p0, Lcom/budiyev/android/codescanner/f;->h:Lcom/budiyev/android/codescanner/f$b;

    .line 52
    .line 53
    return-void
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
.end method

.method static synthetic a(Lcom/budiyev/android/codescanner/f;Lcom/budiyev/android/codescanner/f$b;)Z
    .locals 0

    invoke-direct {p0, p1}, Lcom/budiyev/android/codescanner/f;->k(Lcom/budiyev/android/codescanner/f$b;)Z

    move-result p0

    return p0
.end method

.method static synthetic b(Lcom/budiyev/android/codescanner/f;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lcom/budiyev/android/codescanner/f;->e:Ljava/lang/Object;

    return-object p0
.end method

.method static synthetic c(Lcom/budiyev/android/codescanner/f;)Lcom/budiyev/android/codescanner/e;
    .locals 0

    iget-object p0, p0, Lcom/budiyev/android/codescanner/f;->g:Lcom/budiyev/android/codescanner/e;

    return-object p0
.end method

.method static synthetic d(Lcom/budiyev/android/codescanner/f;Lcom/budiyev/android/codescanner/e;)Lcom/budiyev/android/codescanner/e;
    .locals 0

    iput-object p1, p0, Lcom/budiyev/android/codescanner/f;->g:Lcom/budiyev/android/codescanner/e;

    return-object p1
.end method

.method static synthetic e(Lcom/budiyev/android/codescanner/f;)Lcd/i;
    .locals 0

    iget-object p0, p0, Lcom/budiyev/android/codescanner/f;->a:Lcd/i;

    return-object p0
.end method

.method static synthetic f(Lcom/budiyev/android/codescanner/f;)Lcom/budiyev/android/codescanner/d;
    .locals 0

    iget-object p0, p0, Lcom/budiyev/android/codescanner/f;->f:Lcom/budiyev/android/codescanner/d;

    return-object p0
.end method

.method private k(Lcom/budiyev/android/codescanner/f$b;)Z
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/budiyev/android/codescanner/f;->h:Lcom/budiyev/android/codescanner/f$b;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/budiyev/android/codescanner/f;->c:Lcom/budiyev/android/codescanner/f$c;

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lcom/budiyev/android/codescanner/f$c;->a(Lcom/budiyev/android/codescanner/f$b;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
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
.end method


# virtual methods
.method public g(Lcom/budiyev/android/codescanner/e;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/budiyev/android/codescanner/f;->e:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/budiyev/android/codescanner/f;->h:Lcom/budiyev/android/codescanner/f$b;

    .line 5
    .line 6
    sget-object v2, Lcom/budiyev/android/codescanner/f$b;->o:Lcom/budiyev/android/codescanner/f$b;

    .line 7
    .line 8
    if-eq v1, v2, :cond_0

    .line 9
    .line 10
    iput-object p1, p0, Lcom/budiyev/android/codescanner/f;->g:Lcom/budiyev/android/codescanner/e;

    .line 11
    .line 12
    iget-object p1, p0, Lcom/budiyev/android/codescanner/f;->e:Ljava/lang/Object;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->notify()V

    .line 15
    .line 16
    .line 17
    :cond_0
    monitor-exit v0

    .line 18
    return-void

    .line 19
    :catchall_0
    move-exception p1

    .line 20
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    throw p1
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
.end method

.method public h()Lcom/budiyev/android/codescanner/f$b;
    .locals 1

    iget-object v0, p0, Lcom/budiyev/android/codescanner/f;->h:Lcom/budiyev/android/codescanner/f$b;

    return-object v0
.end method

.method public i(Lcom/budiyev/android/codescanner/d;)V
    .locals 0

    iput-object p1, p0, Lcom/budiyev/android/codescanner/f;->f:Lcom/budiyev/android/codescanner/d;

    return-void
.end method

.method public j(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcd/a;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/budiyev/android/codescanner/f;->d:Ljava/util/Map;

    .line 2
    .line 3
    sget-object v1, Lcd/e;->n:Lcd/e;

    .line 4
    .line 5
    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Lcom/budiyev/android/codescanner/f;->a:Lcd/i;

    .line 9
    .line 10
    iget-object v0, p0, Lcom/budiyev/android/codescanner/f;->d:Ljava/util/Map;

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Lcd/i;->d(Ljava/util/Map;)V

    .line 13
    .line 14
    .line 15
    return-void
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
.end method

.method public l()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/budiyev/android/codescanner/f;->b:Lcom/budiyev/android/codescanner/f$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, Lcom/budiyev/android/codescanner/f;->g:Lcom/budiyev/android/codescanner/e;

    .line 8
    .line 9
    return-void
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
.end method

.method public m()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/budiyev/android/codescanner/f;->h:Lcom/budiyev/android/codescanner/f$b;

    .line 2
    .line 3
    sget-object v1, Lcom/budiyev/android/codescanner/f$b;->k:Lcom/budiyev/android/codescanner/f$b;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/budiyev/android/codescanner/f;->b:Lcom/budiyev/android/codescanner/f$a;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 14
    .line 15
    const-string v1, "Illegal decoder state"

    .line 16
    .line 17
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw v0
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
.end method
