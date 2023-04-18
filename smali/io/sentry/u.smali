.class public final Lio/sentry/u;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/Boolean;

.field private g:Ljava/lang/Boolean;

.field private h:Ljava/lang/Boolean;

.field private i:Ljava/lang/Double;

.field private j:Ljava/lang/Double;

.field private k:Lio/sentry/o3$f;

.field private final l:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private m:Lio/sentry/o3$e;

.field private final n:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final o:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private p:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final q:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private r:Ljava/lang/String;

.field private s:Ljava/lang/Long;

.field private final t:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "+",
            "Ljava/lang/Throwable;",
            ">;>;"
        }
    .end annotation
.end field

.field private u:Ljava/lang/Boolean;

.field private v:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lj$/util/concurrent/ConcurrentHashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Lj$/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lio/sentry/u;->l:Ljava/util/Map;

    .line 10
    .line 11
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lio/sentry/u;->n:Ljava/util/List;

    .line 17
    .line 18
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lio/sentry/u;->o:Ljava/util/List;

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    iput-object v0, p0, Lio/sentry/u;->p:Ljava/util/List;

    .line 27
    .line 28
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 29
    .line 30
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, Lio/sentry/u;->q:Ljava/util/List;

    .line 34
    .line 35
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 36
    .line 37
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    .line 38
    .line 39
    .line 40
    iput-object v0, p0, Lio/sentry/u;->t:Ljava/util/Set;

    .line 41
    .line 42
    return-void
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

.method public static f(Lio/sentry/config/g;Lio/sentry/g0;)Lio/sentry/u;
    .locals 8

    .line 1
    new-instance v0, Lio/sentry/u;

    .line 2
    .line 3
    invoke-direct {v0}, Lio/sentry/u;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "dsn"

    .line 7
    .line 8
    invoke-interface {p0, v1}, Lio/sentry/config/g;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Lio/sentry/u;->D(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-string v1, "environment"

    .line 16
    .line 17
    invoke-interface {p0, v1}, Lio/sentry/config/g;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v0, v1}, Lio/sentry/u;->G(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const-string v1, "release"

    .line 25
    .line 26
    invoke-interface {p0, v1}, Lio/sentry/config/g;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v0, v1}, Lio/sentry/u;->N(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const-string v1, "dist"

    .line 34
    .line 35
    invoke-interface {p0, v1}, Lio/sentry/config/g;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v0, v1}, Lio/sentry/u;->C(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    const-string v1, "servername"

    .line 43
    .line 44
    invoke-interface {p0, v1}, Lio/sentry/config/g;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-virtual {v0, v1}, Lio/sentry/u;->P(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const-string v1, "uncaught.handler.enabled"

    .line 52
    .line 53
    invoke-interface {p0, v1}, Lio/sentry/config/g;->a(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {v0, v1}, Lio/sentry/u;->F(Ljava/lang/Boolean;)V

    .line 58
    .line 59
    .line 60
    const-string v1, "uncaught.handler.print-stacktrace"

    .line 61
    .line 62
    invoke-interface {p0, v1}, Lio/sentry/config/g;->a(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-virtual {v0, v1}, Lio/sentry/u;->J(Ljava/lang/Boolean;)V

    .line 67
    .line 68
    .line 69
    const-string v1, "traces-sample-rate"

    .line 70
    .line 71
    invoke-interface {p0, v1}, Lio/sentry/config/g;->c(Ljava/lang/String;)Ljava/lang/Double;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-virtual {v0, v1}, Lio/sentry/u;->R(Ljava/lang/Double;)V

    .line 76
    .line 77
    .line 78
    const-string v1, "profiles-sample-rate"

    .line 79
    .line 80
    invoke-interface {p0, v1}, Lio/sentry/config/g;->c(Ljava/lang/String;)Ljava/lang/Double;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-virtual {v0, v1}, Lio/sentry/u;->K(Ljava/lang/Double;)V

    .line 85
    .line 86
    .line 87
    const-string v1, "debug"

    .line 88
    .line 89
    invoke-interface {p0, v1}, Lio/sentry/config/g;->a(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    invoke-virtual {v0, v1}, Lio/sentry/u;->B(Ljava/lang/Boolean;)V

    .line 94
    .line 95
    .line 96
    const-string v1, "enable-deduplication"

    .line 97
    .line 98
    invoke-interface {p0, v1}, Lio/sentry/config/g;->a(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    invoke-virtual {v0, v1}, Lio/sentry/u;->E(Ljava/lang/Boolean;)V

    .line 103
    .line 104
    .line 105
    const-string v1, "send-client-reports"

    .line 106
    .line 107
    invoke-interface {p0, v1}, Lio/sentry/config/g;->a(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    invoke-virtual {v0, v1}, Lio/sentry/u;->O(Ljava/lang/Boolean;)V

    .line 112
    .line 113
    .line 114
    const-string v1, "max-request-body-size"

    .line 115
    .line 116
    invoke-interface {p0, v1}, Lio/sentry/config/g;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    if-eqz v1, :cond_0

    .line 121
    .line 122
    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 123
    .line 124
    invoke-virtual {v1, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    invoke-static {v1}, Lio/sentry/o3$f;->valueOf(Ljava/lang/String;)Lio/sentry/o3$f;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    invoke-virtual {v0, v1}, Lio/sentry/u;->I(Lio/sentry/o3$f;)V

    .line 133
    .line 134
    .line 135
    :cond_0
    const-string v1, "tags"

    .line 136
    .line 137
    invoke-interface {p0, v1}, Lio/sentry/config/g;->getMap(Ljava/lang/String;)Ljava/util/Map;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 150
    .line 151
    .line 152
    move-result v2

    .line 153
    if-eqz v2, :cond_1

    .line 154
    .line 155
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    check-cast v2, Ljava/util/Map$Entry;

    .line 160
    .line 161
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v3

    .line 165
    check-cast v3, Ljava/lang/String;

    .line 166
    .line 167
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    check-cast v2, Ljava/lang/String;

    .line 172
    .line 173
    invoke-virtual {v0, v3, v2}, Lio/sentry/u;->Q(Ljava/lang/String;Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    goto :goto_0

    .line 177
    :cond_1
    const-string v1, "proxy.host"

    .line 178
    .line 179
    invoke-interface {p0, v1}, Lio/sentry/config/g;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    const-string v2, "proxy.user"

    .line 184
    .line 185
    invoke-interface {p0, v2}, Lio/sentry/config/g;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v2

    .line 189
    const-string v3, "proxy.pass"

    .line 190
    .line 191
    invoke-interface {p0, v3}, Lio/sentry/config/g;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v3

    .line 195
    const-string v4, "proxy.port"

    .line 196
    .line 197
    const-string v5, "80"

    .line 198
    .line 199
    invoke-interface {p0, v4, v5}, Lio/sentry/config/g;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v4

    .line 203
    if-eqz v1, :cond_2

    .line 204
    .line 205
    new-instance v5, Lio/sentry/o3$e;

    .line 206
    .line 207
    invoke-direct {v5, v1, v4, v2, v3}, Lio/sentry/o3$e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v0, v5}, Lio/sentry/u;->M(Lio/sentry/o3$e;)V

    .line 211
    .line 212
    .line 213
    :cond_2
    const-string v1, "in-app-includes"

    .line 214
    .line 215
    invoke-interface {p0, v1}, Lio/sentry/config/g;->e(Ljava/lang/String;)Ljava/util/List;

    .line 216
    .line 217
    .line 218
    move-result-object v1

    .line 219
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 220
    .line 221
    .line 222
    move-result-object v1

    .line 223
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 224
    .line 225
    .line 226
    move-result v2

    .line 227
    if-eqz v2, :cond_3

    .line 228
    .line 229
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v2

    .line 233
    check-cast v2, Ljava/lang/String;

    .line 234
    .line 235
    invoke-virtual {v0, v2}, Lio/sentry/u;->d(Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    goto :goto_1

    .line 239
    :cond_3
    const-string v1, "in-app-excludes"

    .line 240
    .line 241
    invoke-interface {p0, v1}, Lio/sentry/config/g;->e(Ljava/lang/String;)Ljava/util/List;

    .line 242
    .line 243
    .line 244
    move-result-object v1

    .line 245
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 246
    .line 247
    .line 248
    move-result-object v1

    .line 249
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 250
    .line 251
    .line 252
    move-result v2

    .line 253
    if-eqz v2, :cond_4

    .line 254
    .line 255
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v2

    .line 259
    check-cast v2, Ljava/lang/String;

    .line 260
    .line 261
    invoke-virtual {v0, v2}, Lio/sentry/u;->c(Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    goto :goto_2

    .line 265
    :cond_4
    const-string v1, "trace-propagation-targets"

    .line 266
    .line 267
    invoke-interface {p0, v1}, Lio/sentry/config/g;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object v2

    .line 271
    if-eqz v2, :cond_5

    .line 272
    .line 273
    invoke-interface {p0, v1}, Lio/sentry/config/g;->e(Ljava/lang/String;)Ljava/util/List;

    .line 274
    .line 275
    .line 276
    move-result-object v1

    .line 277
    goto :goto_3

    .line 278
    :cond_5
    const/4 v1, 0x0

    .line 279
    :goto_3
    if-nez v1, :cond_6

    .line 280
    .line 281
    const-string v2, "tracing-origins"

    .line 282
    .line 283
    invoke-interface {p0, v2}, Lio/sentry/config/g;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v3

    .line 287
    if-eqz v3, :cond_6

    .line 288
    .line 289
    invoke-interface {p0, v2}, Lio/sentry/config/g;->e(Ljava/lang/String;)Ljava/util/List;

    .line 290
    .line 291
    .line 292
    move-result-object v1

    .line 293
    :cond_6
    if-eqz v1, :cond_7

    .line 294
    .line 295
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 296
    .line 297
    .line 298
    move-result-object v1

    .line 299
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 300
    .line 301
    .line 302
    move-result v2

    .line 303
    if-eqz v2, :cond_7

    .line 304
    .line 305
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    move-result-object v2

    .line 309
    check-cast v2, Ljava/lang/String;

    .line 310
    .line 311
    invoke-virtual {v0, v2}, Lio/sentry/u;->e(Ljava/lang/String;)V

    .line 312
    .line 313
    .line 314
    goto :goto_4

    .line 315
    :cond_7
    const-string v1, "context-tags"

    .line 316
    .line 317
    invoke-interface {p0, v1}, Lio/sentry/config/g;->e(Ljava/lang/String;)Ljava/util/List;

    .line 318
    .line 319
    .line 320
    move-result-object v1

    .line 321
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 322
    .line 323
    .line 324
    move-result-object v1

    .line 325
    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 326
    .line 327
    .line 328
    move-result v2

    .line 329
    if-eqz v2, :cond_8

    .line 330
    .line 331
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 332
    .line 333
    .line 334
    move-result-object v2

    .line 335
    check-cast v2, Ljava/lang/String;

    .line 336
    .line 337
    invoke-virtual {v0, v2}, Lio/sentry/u;->a(Ljava/lang/String;)V

    .line 338
    .line 339
    .line 340
    goto :goto_5

    .line 341
    :cond_8
    const-string v1, "proguard-uuid"

    .line 342
    .line 343
    invoke-interface {p0, v1}, Lio/sentry/config/g;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 344
    .line 345
    .line 346
    move-result-object v1

    .line 347
    invoke-virtual {v0, v1}, Lio/sentry/u;->L(Ljava/lang/String;)V

    .line 348
    .line 349
    .line 350
    const-string v1, "idle-timeout"

    .line 351
    .line 352
    invoke-interface {p0, v1}, Lio/sentry/config/g;->b(Ljava/lang/String;)Ljava/lang/Long;

    .line 353
    .line 354
    .line 355
    move-result-object v1

    .line 356
    invoke-virtual {v0, v1}, Lio/sentry/u;->H(Ljava/lang/Long;)V

    .line 357
    .line 358
    .line 359
    const-string v1, "ignored-exceptions-for-type"

    .line 360
    .line 361
    invoke-interface {p0, v1}, Lio/sentry/config/g;->e(Ljava/lang/String;)Ljava/util/List;

    .line 362
    .line 363
    .line 364
    move-result-object p0

    .line 365
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 366
    .line 367
    .line 368
    move-result-object p0

    .line 369
    :goto_6
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 370
    .line 371
    .line 372
    move-result v1

    .line 373
    if-eqz v1, :cond_a

    .line 374
    .line 375
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    move-result-object v1

    .line 379
    check-cast v1, Ljava/lang/String;

    .line 380
    .line 381
    const/4 v2, 0x1

    .line 382
    const/4 v3, 0x0

    .line 383
    const/4 v4, 0x2

    .line 384
    :try_start_0
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 385
    .line 386
    .line 387
    move-result-object v5

    .line 388
    const-class v6, Ljava/lang/Throwable;

    .line 389
    .line 390
    invoke-virtual {v6, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 391
    .line 392
    .line 393
    move-result v6

    .line 394
    if-eqz v6, :cond_9

    .line 395
    .line 396
    invoke-virtual {v0, v5}, Lio/sentry/u;->b(Ljava/lang/Class;)V

    .line 397
    .line 398
    .line 399
    goto :goto_6

    .line 400
    :cond_9
    sget-object v5, Lio/sentry/n3;->WARNING:Lio/sentry/n3;

    .line 401
    .line 402
    const-string v6, "Skipping setting %s as ignored-exception-for-type. Reason: %s does not extend Throwable"

    .line 403
    .line 404
    new-array v7, v4, [Ljava/lang/Object;

    .line 405
    .line 406
    aput-object v1, v7, v3

    .line 407
    .line 408
    aput-object v1, v7, v2

    .line 409
    .line 410
    invoke-interface {p1, v5, v6, v7}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 411
    .line 412
    .line 413
    goto :goto_6

    .line 414
    :catch_0
    sget-object v5, Lio/sentry/n3;->WARNING:Lio/sentry/n3;

    .line 415
    .line 416
    new-array v4, v4, [Ljava/lang/Object;

    .line 417
    .line 418
    aput-object v1, v4, v3

    .line 419
    .line 420
    aput-object v1, v4, v2

    .line 421
    .line 422
    const-string v1, "Skipping setting %s as ignored-exception-for-type. Reason: %s class is not found"

    .line 423
    .line 424
    invoke-interface {p1, v5, v1, v4}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 425
    .line 426
    .line 427
    goto :goto_6

    .line 428
    :cond_a
    return-object v0
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


# virtual methods
.method public A()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lio/sentry/u;->i:Ljava/lang/Double;

    return-object v0
.end method

.method public B(Ljava/lang/Boolean;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/u;->g:Ljava/lang/Boolean;

    return-void
.end method

.method public C(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/u;->d:Ljava/lang/String;

    return-void
.end method

.method public D(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/u;->a:Ljava/lang/String;

    return-void
.end method

.method public E(Ljava/lang/Boolean;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/u;->h:Ljava/lang/Boolean;

    return-void
.end method

.method public F(Ljava/lang/Boolean;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/u;->f:Ljava/lang/Boolean;

    return-void
.end method

.method public G(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/u;->b:Ljava/lang/String;

    return-void
.end method

.method public H(Ljava/lang/Long;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/u;->s:Ljava/lang/Long;

    return-void
.end method

.method public I(Lio/sentry/o3$f;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/u;->k:Lio/sentry/o3$f;

    return-void
.end method

.method public J(Ljava/lang/Boolean;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/u;->u:Ljava/lang/Boolean;

    return-void
.end method

.method public K(Ljava/lang/Double;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/u;->j:Ljava/lang/Double;

    return-void
.end method

.method public L(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/u;->r:Ljava/lang/String;

    return-void
.end method

.method public M(Lio/sentry/o3$e;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/u;->m:Lio/sentry/o3$e;

    return-void
.end method

.method public N(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/u;->c:Ljava/lang/String;

    return-void
.end method

.method public O(Ljava/lang/Boolean;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/u;->v:Ljava/lang/Boolean;

    return-void
.end method

.method public P(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/u;->e:Ljava/lang/String;

    return-void
.end method

.method public Q(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lio/sentry/u;->l:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public R(Ljava/lang/Double;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/u;->i:Ljava/lang/Double;

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lio/sentry/u;->q:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public b(Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Ljava/lang/Throwable;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/sentry/u;->t:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lio/sentry/u;->n:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lio/sentry/u;->o:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/u;->p:Ljava/util/List;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lio/sentry/u;->p:Ljava/util/List;

    .line 11
    .line 12
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    iget-object v0, p0, Lio/sentry/u;->p:Ljava/util/List;

    .line 19
    .line 20
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    :cond_1
    return-void
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public g()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/sentry/u;->q:Ljava/util/List;

    return-object v0
.end method

.method public h()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/sentry/u;->g:Ljava/lang/Boolean;

    return-object v0
.end method

.method public i()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/sentry/u;->d:Ljava/lang/String;

    return-object v0
.end method

.method public j()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/sentry/u;->a:Ljava/lang/String;

    return-object v0
.end method

.method public k()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/sentry/u;->h:Ljava/lang/Boolean;

    return-object v0
.end method

.method public l()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/sentry/u;->f:Ljava/lang/Boolean;

    return-object v0
.end method

.method public m()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/sentry/u;->b:Ljava/lang/String;

    return-object v0
.end method

.method public n()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lio/sentry/u;->s:Ljava/lang/Long;

    return-object v0
.end method

.method public o()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "+",
            "Ljava/lang/Throwable;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lio/sentry/u;->t:Ljava/util/Set;

    return-object v0
.end method

.method public p()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/sentry/u;->n:Ljava/util/List;

    return-object v0
.end method

.method public q()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/sentry/u;->o:Ljava/util/List;

    return-object v0
.end method

.method public r()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/sentry/u;->u:Ljava/lang/Boolean;

    return-object v0
.end method

.method public s()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lio/sentry/u;->j:Ljava/lang/Double;

    return-object v0
.end method

.method public t()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/sentry/u;->r:Ljava/lang/String;

    return-object v0
.end method

.method public u()Lio/sentry/o3$e;
    .locals 1

    iget-object v0, p0, Lio/sentry/u;->m:Lio/sentry/o3$e;

    return-object v0
.end method

.method public v()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/sentry/u;->c:Ljava/lang/String;

    return-object v0
.end method

.method public w()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/sentry/u;->v:Ljava/lang/Boolean;

    return-object v0
.end method

.method public x()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/sentry/u;->e:Ljava/lang/String;

    return-object v0
.end method

.method public y()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/sentry/u;->l:Ljava/util/Map;

    return-object v0
.end method

.method public z()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/sentry/u;->p:Ljava/util/List;

    return-object v0
.end method
