.class public final Lio/sentry/android/core/b1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/util/Date;

.field private static final b:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    invoke-static {}, Lio/sentry/h;->b()Ljava/util/Date;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sput-object v0, Lio/sentry/android/core/b1;->a:Ljava/util/Date;

    .line 6
    .line 7
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    sput-wide v0, Lio/sentry/android/core/b1;->b:J

    .line 12
    .line 13
    return-void
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
.end method

.method public static synthetic a(Lio/sentry/g0;Landroid/content/Context;Lio/sentry/k2$a;Lio/sentry/android/core/SentryAndroidOptions;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lio/sentry/android/core/b1;->h(Lio/sentry/g0;Landroid/content/Context;Lio/sentry/k2$a;Lio/sentry/android/core/SentryAndroidOptions;)V

    return-void
.end method

.method public static synthetic b(Lio/sentry/android/core/SentryAndroidOptions;)V
    .locals 0

    invoke-static {p0}, Lio/sentry/android/core/b1;->g(Lio/sentry/android/core/SentryAndroidOptions;)V

    return-void
.end method

.method private static c(Lio/sentry/o3;ZZ)V
    .locals 5

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lio/sentry/o3;->getIntegrations()Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-eqz v3, :cond_2

    .line 24
    .line 25
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    check-cast v3, Lio/sentry/q0;

    .line 30
    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    instance-of v4, v3, Lio/sentry/android/fragment/FragmentLifecycleIntegration;

    .line 34
    .line 35
    if-eqz v4, :cond_1

    .line 36
    .line 37
    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    :cond_1
    if-eqz p2, :cond_0

    .line 41
    .line 42
    instance-of v4, v3, Lio/sentry/android/timber/SentryTimberIntegration;

    .line 43
    .line 44
    if-eqz v4, :cond_0

    .line 45
    .line 46
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    const/4 p2, 0x1

    .line 55
    if-le p1, p2, :cond_3

    .line 56
    .line 57
    move p1, p2

    .line 58
    :goto_1
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-ge p1, v2, :cond_3

    .line 63
    .line 64
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    check-cast v2, Lio/sentry/q0;

    .line 69
    .line 70
    invoke-virtual {p0}, Lio/sentry/o3;->getIntegrations()Ljava/util/List;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    invoke-interface {v3, v2}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    add-int/lit8 p1, p1, 0x1

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    if-le p1, p2, :cond_4

    .line 85
    .line 86
    :goto_2
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    if-ge p2, p1, :cond_4

    .line 91
    .line 92
    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    check-cast p1, Lio/sentry/q0;

    .line 97
    .line 98
    invoke-virtual {p0}, Lio/sentry/o3;->getIntegrations()Ljava/util/List;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    invoke-interface {v1, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    add-int/lit8 p2, p2, 0x1

    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_4
    return-void
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

.method public static d(Landroid/content/Context;Lio/sentry/g0;)V
    .locals 1

    new-instance v0, Lio/sentry/android/core/z0;

    invoke-direct {v0}, Lio/sentry/android/core/z0;-><init>()V

    invoke-static {p0, p1, v0}, Lio/sentry/android/core/b1;->e(Landroid/content/Context;Lio/sentry/g0;Lio/sentry/k2$a;)V

    return-void
.end method

.method public static declared-synchronized e(Landroid/content/Context;Lio/sentry/g0;Lio/sentry/k2$a;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lio/sentry/g0;",
            "Lio/sentry/k2$a<",
            "Lio/sentry/android/core/SentryAndroidOptions;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-class v0, Lio/sentry/android/core/b1;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-static {}, Lio/sentry/android/core/d0;->d()Lio/sentry/android/core/d0;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    sget-wide v2, Lio/sentry/android/core/b1;->b:J

    .line 9
    .line 10
    sget-object v4, Lio/sentry/android/core/b1;->a:Ljava/util/Date;

    .line 11
    .line 12
    invoke-virtual {v1, v2, v3, v4}, Lio/sentry/android/core/d0;->h(JLjava/util/Date;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    .line 15
    :try_start_1
    const-class v1, Lio/sentry/android/core/SentryAndroidOptions;

    .line 16
    .line 17
    invoke-static {v1}, Lio/sentry/r1;->a(Ljava/lang/Class;)Lio/sentry/r1;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    new-instance v2, Lio/sentry/android/core/a1;

    .line 22
    .line 23
    invoke-direct {v2, p1, p0, p2}, Lio/sentry/android/core/a1;-><init>(Lio/sentry/g0;Landroid/content/Context;Lio/sentry/k2$a;)V

    .line 24
    .line 25
    .line 26
    const/4 p0, 0x1

    .line 27
    invoke-static {v1, v2, p0}, Lio/sentry/k2;->n(Lio/sentry/r1;Lio/sentry/k2$a;Z)V
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/InstantiationException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 28
    .line 29
    .line 30
    monitor-exit v0

    .line 31
    return-void

    .line 32
    :catch_0
    move-exception p0

    .line 33
    :try_start_2
    sget-object p2, Lio/sentry/n3;->FATAL:Lio/sentry/n3;

    .line 34
    .line 35
    const-string v1, "Fatal error during SentryAndroid.init(...)"

    .line 36
    .line 37
    invoke-interface {p1, p2, v1, p0}, Lio/sentry/g0;->b(Lio/sentry/n3;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 38
    .line 39
    .line 40
    new-instance p1, Ljava/lang/RuntimeException;

    .line 41
    .line 42
    const-string p2, "Failed to initialize Sentry\'s SDK"

    .line 43
    .line 44
    invoke-direct {p1, p2, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 45
    .line 46
    .line 47
    throw p1

    .line 48
    :catch_1
    move-exception p0

    .line 49
    sget-object p2, Lio/sentry/n3;->FATAL:Lio/sentry/n3;

    .line 50
    .line 51
    const-string v1, "Fatal error during SentryAndroid.init(...)"

    .line 52
    .line 53
    invoke-interface {p1, p2, v1, p0}, Lio/sentry/g0;->b(Lio/sentry/n3;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 54
    .line 55
    .line 56
    new-instance p1, Ljava/lang/RuntimeException;

    .line 57
    .line 58
    const-string p2, "Failed to initialize Sentry\'s SDK"

    .line 59
    .line 60
    invoke-direct {p1, p2, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 61
    .line 62
    .line 63
    throw p1

    .line 64
    :catch_2
    move-exception p0

    .line 65
    sget-object p2, Lio/sentry/n3;->FATAL:Lio/sentry/n3;

    .line 66
    .line 67
    const-string v1, "Fatal error during SentryAndroid.init(...)"

    .line 68
    .line 69
    invoke-interface {p1, p2, v1, p0}, Lio/sentry/g0;->b(Lio/sentry/n3;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 70
    .line 71
    .line 72
    new-instance p1, Ljava/lang/RuntimeException;

    .line 73
    .line 74
    const-string p2, "Failed to initialize Sentry\'s SDK"

    .line 75
    .line 76
    invoke-direct {p1, p2, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 77
    .line 78
    .line 79
    throw p1

    .line 80
    :catch_3
    move-exception p0

    .line 81
    sget-object p2, Lio/sentry/n3;->FATAL:Lio/sentry/n3;

    .line 82
    .line 83
    const-string v1, "Fatal error during SentryAndroid.init(...)"

    .line 84
    .line 85
    invoke-interface {p1, p2, v1, p0}, Lio/sentry/g0;->b(Lio/sentry/n3;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 86
    .line 87
    .line 88
    new-instance p1, Ljava/lang/RuntimeException;

    .line 89
    .line 90
    const-string p2, "Failed to initialize Sentry\'s SDK"

    .line 91
    .line 92
    invoke-direct {p1, p2, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 93
    .line 94
    .line 95
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 96
    :catchall_0
    move-exception p0

    .line 97
    monitor-exit v0

    .line 98
    throw p0
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

.method public static f(Landroid/content/Context;Lio/sentry/k2$a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lio/sentry/k2$a<",
            "Lio/sentry/android/core/SentryAndroidOptions;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Lio/sentry/android/core/n;

    invoke-direct {v0}, Lio/sentry/android/core/n;-><init>()V

    invoke-static {p0, v0, p1}, Lio/sentry/android/core/b1;->e(Landroid/content/Context;Lio/sentry/g0;Lio/sentry/k2$a;)V

    return-void
.end method

.method private static synthetic g(Lio/sentry/android/core/SentryAndroidOptions;)V
    .locals 0

    return-void
.end method

.method private static synthetic h(Lio/sentry/g0;Landroid/content/Context;Lio/sentry/k2$a;Lio/sentry/android/core/SentryAndroidOptions;)V
    .locals 11

    .line 1
    new-instance v0, Lio/sentry/android/core/p0;

    .line 2
    .line 3
    invoke-direct {v0}, Lio/sentry/android/core/p0;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "timber.log.Timber"

    .line 7
    .line 8
    invoke-virtual {v0, v1, p3}, Lio/sentry/android/core/p0;->b(Ljava/lang/String;Lio/sentry/o3;)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const-string v2, "androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks"

    .line 13
    .line 14
    invoke-virtual {v0, v2, p3}, Lio/sentry/android/core/p0;->b(Ljava/lang/String;Lio/sentry/o3;)Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/4 v3, 0x1

    .line 19
    const/4 v4, 0x0

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    const-string v2, "io.sentry.android.fragment.FragmentLifecycleIntegration"

    .line 23
    .line 24
    invoke-virtual {v0, v2, p3}, Lio/sentry/android/core/p0;->b(Ljava/lang/String;Lio/sentry/o3;)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    move v2, v3

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    move v2, v4

    .line 33
    :goto_0
    if-eqz v1, :cond_1

    .line 34
    .line 35
    const-string v1, "io.sentry.android.timber.SentryTimberIntegration"

    .line 36
    .line 37
    invoke-virtual {v0, v1, p3}, Lio/sentry/android/core/p0;->b(Ljava/lang/String;Lio/sentry/o3;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_1

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    move v3, v4

    .line 45
    :goto_1
    new-instance v7, Lio/sentry/android/core/f0;

    .line 46
    .line 47
    invoke-direct {v7, p0}, Lio/sentry/android/core/f0;-><init>(Lio/sentry/g0;)V

    .line 48
    .line 49
    .line 50
    new-instance v8, Lio/sentry/android/core/p0;

    .line 51
    .line 52
    invoke-direct {v8}, Lio/sentry/android/core/p0;-><init>()V

    .line 53
    .line 54
    .line 55
    invoke-static {p3, p1, p0, v7}, Lio/sentry/android/core/q;->k(Lio/sentry/android/core/SentryAndroidOptions;Landroid/content/Context;Lio/sentry/g0;Lio/sentry/android/core/f0;)V

    .line 56
    .line 57
    .line 58
    invoke-interface {p2, p3}, Lio/sentry/k2$a;->a(Lio/sentry/o3;)V

    .line 59
    .line 60
    .line 61
    move-object v5, p3

    .line 62
    move-object v6, p1

    .line 63
    move v9, v2

    .line 64
    move v10, v3

    .line 65
    invoke-static/range {v5 .. v10}, Lio/sentry/android/core/q;->f(Lio/sentry/android/core/SentryAndroidOptions;Landroid/content/Context;Lio/sentry/android/core/f0;Lio/sentry/android/core/p0;ZZ)V

    .line 66
    .line 67
    .line 68
    invoke-static {p3, v2, v3}, Lio/sentry/android/core/b1;->c(Lio/sentry/o3;ZZ)V

    .line 69
    .line 70
    .line 71
    return-void
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
