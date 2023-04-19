.class abstract Lio/sentry/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/sentry/k$a;
    }
.end annotation


# instance fields
.field private final a:Lio/sentry/g0;

.field private final b:J


# direct methods
.method constructor <init>(Lio/sentry/g0;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/sentry/k;->a:Lio/sentry/g0;

    .line 5
    .line 6
    iput-wide p2, p0, Lio/sentry/k;->b:J

    .line 7
    .line 8
    return-void
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
.end method

.method public static synthetic b(Lio/sentry/k;Ljava/io/File;Ljava/lang/String;)Z
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/sentry/k;->d(Ljava/io/File;Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method private synthetic d(Ljava/io/File;Ljava/lang/String;)Z
    .locals 0

    invoke-virtual {p0, p2}, Lio/sentry/k;->c(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method


# virtual methods
.method protected abstract c(Ljava/lang/String;)Z
.end method

.method public e(Ljava/io/File;)V
    .locals 11

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    :try_start_0
    iget-object v2, p0, Lio/sentry/k;->a:Lio/sentry/g0;

    .line 4
    .line 5
    sget-object v3, Lio/sentry/n3;->DEBUG:Lio/sentry/n3;

    .line 6
    .line 7
    const-string v4, "Processing dir. %s"

    .line 8
    .line 9
    new-array v5, v0, [Ljava/lang/Object;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v6

    .line 15
    aput-object v6, v5, v1

    .line 16
    .line 17
    invoke-interface {v2, v3, v4, v5}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-nez v2, :cond_0

    .line 25
    .line 26
    iget-object v2, p0, Lio/sentry/k;->a:Lio/sentry/g0;

    .line 27
    .line 28
    sget-object v3, Lio/sentry/n3;->WARNING:Lio/sentry/n3;

    .line 29
    .line 30
    const-string v4, "Directory \'%s\' doesn\'t exist. No cached events to send."

    .line 31
    .line 32
    new-array v5, v0, [Ljava/lang/Object;

    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v6

    .line 38
    aput-object v6, v5, v1

    .line 39
    .line 40
    invoke-interface {v2, v3, v4, v5}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_0
    invoke-virtual {p1}, Ljava/io/File;->isDirectory()Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-nez v2, :cond_1

    .line 49
    .line 50
    iget-object v2, p0, Lio/sentry/k;->a:Lio/sentry/g0;

    .line 51
    .line 52
    sget-object v3, Lio/sentry/n3;->ERROR:Lio/sentry/n3;

    .line 53
    .line 54
    const-string v4, "Cache dir %s is not a directory."

    .line 55
    .line 56
    new-array v5, v0, [Ljava/lang/Object;

    .line 57
    .line 58
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    aput-object v6, v5, v1

    .line 63
    .line 64
    invoke-interface {v2, v3, v4, v5}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :cond_1
    invoke-virtual {p1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    if-nez v2, :cond_2

    .line 73
    .line 74
    iget-object v2, p0, Lio/sentry/k;->a:Lio/sentry/g0;

    .line 75
    .line 76
    sget-object v3, Lio/sentry/n3;->ERROR:Lio/sentry/n3;

    .line 77
    .line 78
    const-string v4, "Cache dir %s is null."

    .line 79
    .line 80
    new-array v5, v0, [Ljava/lang/Object;

    .line 81
    .line 82
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v6

    .line 86
    aput-object v6, v5, v1

    .line 87
    .line 88
    invoke-interface {v2, v3, v4, v5}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :cond_2
    new-instance v4, Lio/sentry/j;

    .line 93
    .line 94
    invoke-direct {v4, p0}, Lio/sentry/j;-><init>(Lio/sentry/k;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1, v4}, Ljava/io/File;->listFiles(Ljava/io/FilenameFilter;)[Ljava/io/File;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    iget-object v5, p0, Lio/sentry/k;->a:Lio/sentry/g0;

    .line 102
    .line 103
    const-string v6, "Processing %d items from cache dir %s"

    .line 104
    .line 105
    const/4 v7, 0x2

    .line 106
    new-array v7, v7, [Ljava/lang/Object;

    .line 107
    .line 108
    if-eqz v4, :cond_3

    .line 109
    .line 110
    array-length v4, v4

    .line 111
    goto :goto_0

    .line 112
    :cond_3
    move v4, v1

    .line 113
    :goto_0
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    aput-object v4, v7, v1

    .line 118
    .line 119
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v4

    .line 123
    aput-object v4, v7, v0

    .line 124
    .line 125
    invoke-interface {v5, v3, v6, v7}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    array-length v3, v2

    .line 129
    move v4, v1

    .line 130
    :goto_1
    if-ge v4, v3, :cond_5

    .line 131
    .line 132
    aget-object v5, v2, v4

    .line 133
    .line 134
    invoke-virtual {v5}, Ljava/io/File;->isFile()Z

    .line 135
    .line 136
    .line 137
    move-result v6

    .line 138
    if-nez v6, :cond_4

    .line 139
    .line 140
    iget-object v6, p0, Lio/sentry/k;->a:Lio/sentry/g0;

    .line 141
    .line 142
    sget-object v7, Lio/sentry/n3;->DEBUG:Lio/sentry/n3;

    .line 143
    .line 144
    const-string v8, "File %s is not a File."

    .line 145
    .line 146
    new-array v9, v0, [Ljava/lang/Object;

    .line 147
    .line 148
    invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v5

    .line 152
    aput-object v5, v9, v1

    .line 153
    .line 154
    invoke-interface {v6, v7, v8, v9}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    goto :goto_2

    .line 158
    :cond_4
    iget-object v6, p0, Lio/sentry/k;->a:Lio/sentry/g0;

    .line 159
    .line 160
    sget-object v7, Lio/sentry/n3;->DEBUG:Lio/sentry/n3;

    .line 161
    .line 162
    const-string v8, "Processing file: %s"

    .line 163
    .line 164
    new-array v9, v0, [Ljava/lang/Object;

    .line 165
    .line 166
    invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v10

    .line 170
    aput-object v10, v9, v1

    .line 171
    .line 172
    invoke-interface {v6, v7, v8, v9}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    new-instance v6, Lio/sentry/k$a;

    .line 176
    .line 177
    iget-wide v7, p0, Lio/sentry/k;->b:J

    .line 178
    .line 179
    iget-object v9, p0, Lio/sentry/k;->a:Lio/sentry/g0;

    .line 180
    .line 181
    invoke-direct {v6, v7, v8, v9}, Lio/sentry/k$a;-><init>(JLio/sentry/g0;)V

    .line 182
    .line 183
    .line 184
    invoke-static {v6}, Lio/sentry/util/h;->e(Ljava/lang/Object;)Lio/sentry/v;

    .line 185
    .line 186
    .line 187
    move-result-object v6

    .line 188
    invoke-virtual {p0, v5, v6}, Lio/sentry/k;->f(Ljava/io/File;Lio/sentry/v;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 189
    .line 190
    .line 191
    :goto_2
    add-int/lit8 v4, v4, 0x1

    .line 192
    .line 193
    goto :goto_1

    .line 194
    :catchall_0
    move-exception v2

    .line 195
    iget-object v3, p0, Lio/sentry/k;->a:Lio/sentry/g0;

    .line 196
    .line 197
    sget-object v4, Lio/sentry/n3;->ERROR:Lio/sentry/n3;

    .line 198
    .line 199
    new-array v0, v0, [Ljava/lang/Object;

    .line 200
    .line 201
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object p1

    .line 205
    aput-object p1, v0, v1

    .line 206
    .line 207
    const-string p1, "Failed processing \'%s\'"

    .line 208
    .line 209
    invoke-interface {v3, v4, v2, p1, v0}, Lio/sentry/g0;->a(Lio/sentry/n3;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 210
    .line 211
    .line 212
    :cond_5
    return-void
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
.end method

.method protected abstract f(Ljava/io/File;Lio/sentry/v;)V
.end method
