.class final Lio/sentry/android/core/y0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/q0;


# instance fields
.field private final k:Lio/sentry/g2;

.field private final l:Z


# direct methods
.method public constructor <init>(Lio/sentry/g2;Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "SendFireAndForgetFactory is required"

    .line 5
    .line 6
    invoke-static {p1, v0}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, Lio/sentry/g2;

    .line 11
    .line 12
    iput-object p1, p0, Lio/sentry/android/core/y0;->k:Lio/sentry/g2;

    .line 13
    .line 14
    iput-boolean p2, p0, Lio/sentry/android/core/y0;->l:Z

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

.method public static synthetic a(Lio/sentry/c2;Lio/sentry/android/core/SentryAndroidOptions;)V
    .locals 0

    invoke-static {p0, p1}, Lio/sentry/android/core/y0;->c(Lio/sentry/c2;Lio/sentry/android/core/SentryAndroidOptions;)V

    return-void
.end method

.method private static synthetic c(Lio/sentry/c2;Lio/sentry/android/core/SentryAndroidOptions;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-interface {p0}, Lio/sentry/c2;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    .line 3
    .line 4
    goto :goto_0

    .line 5
    :catchall_0
    move-exception p0

    .line 6
    invoke-virtual {p1}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    sget-object v0, Lio/sentry/n3;->ERROR:Lio/sentry/n3;

    .line 11
    .line 12
    const-string v1, "Failed trying to send cached events."

    .line 13
    .line 14
    invoke-interface {p1, v0, v1, p0}, Lio/sentry/g0;->b(Lio/sentry/n3;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 15
    .line 16
    .line 17
    :goto_0
    return-void
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


# virtual methods
.method public b(Lio/sentry/f0;Lio/sentry/o3;)V
    .locals 5

    .line 1
    const-string v0, "Hub is required"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    instance-of v0, p2, Lio/sentry/android/core/SentryAndroidOptions;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    move-object v0, p2

    .line 11
    check-cast v0, Lio/sentry/android/core/SentryAndroidOptions;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    :goto_0
    const-string v1, "SentryAndroidOptions is required"

    .line 16
    .line 17
    invoke-static {v0, v1}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lio/sentry/android/core/SentryAndroidOptions;

    .line 22
    .line 23
    invoke-virtual {p2}, Lio/sentry/o3;->getCacheDirPath()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    iget-object v2, p0, Lio/sentry/android/core/y0;->k:Lio/sentry/g2;

    .line 28
    .line 29
    invoke-virtual {p2}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-interface {v2, v1, v3}, Lio/sentry/g2;->b(Ljava/lang/String;Lio/sentry/g0;)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    const/4 v2, 0x0

    .line 38
    if-nez v1, :cond_1

    .line 39
    .line 40
    invoke-virtual {p2}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    sget-object p2, Lio/sentry/n3;->ERROR:Lio/sentry/n3;

    .line 45
    .line 46
    const-string v0, "No cache dir path is defined in options."

    .line 47
    .line 48
    new-array v1, v2, [Ljava/lang/Object;

    .line 49
    .line 50
    invoke-interface {p1, p2, v0, v1}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_1
    iget-object p2, p0, Lio/sentry/android/core/y0;->k:Lio/sentry/g2;

    .line 55
    .line 56
    invoke-interface {p2, p1, v0}, Lio/sentry/g2;->a(Lio/sentry/f0;Lio/sentry/o3;)Lio/sentry/c2;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    if-nez p1, :cond_2

    .line 61
    .line 62
    invoke-virtual {v0}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    sget-object p2, Lio/sentry/n3;->ERROR:Lio/sentry/n3;

    .line 67
    .line 68
    const-string v0, "SendFireAndForget factory is null."

    .line 69
    .line 70
    new-array v1, v2, [Ljava/lang/Object;

    .line 71
    .line 72
    invoke-interface {p1, p2, v0, v1}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :cond_2
    :try_start_0
    invoke-virtual {v0}, Lio/sentry/o3;->getExecutorService()Lio/sentry/k0;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    new-instance v1, Lio/sentry/android/core/x0;

    .line 81
    .line 82
    invoke-direct {v1, p1, v0}, Lio/sentry/android/core/x0;-><init>(Lio/sentry/c2;Lio/sentry/android/core/SentryAndroidOptions;)V

    .line 83
    .line 84
    .line 85
    invoke-interface {p2, v1}, Lio/sentry/k0;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    iget-boolean p2, p0, Lio/sentry/android/core/y0;->l:Z

    .line 90
    .line 91
    if-eqz p2, :cond_3

    .line 92
    .line 93
    invoke-virtual {v0}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    sget-object v1, Lio/sentry/n3;->DEBUG:Lio/sentry/n3;

    .line 98
    .line 99
    const-string v3, "Startup Crash marker exists, blocking flush."

    .line 100
    .line 101
    new-array v4, v2, [Ljava/lang/Object;

    .line 102
    .line 103
    invoke-interface {p2, v1, v3, v4}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 104
    .line 105
    .line 106
    :try_start_1
    invoke-virtual {v0}, Lio/sentry/android/core/SentryAndroidOptions;->getStartupCrashFlushTimeoutMillis()J

    .line 107
    .line 108
    .line 109
    move-result-wide v3

    .line 110
    sget-object p2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 111
    .line 112
    invoke-interface {p1, v3, v4, p2}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 113
    .line 114
    .line 115
    goto :goto_1

    .line 116
    :catch_0
    :try_start_2
    invoke-virtual {v0}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    sget-object p2, Lio/sentry/n3;->DEBUG:Lio/sentry/n3;

    .line 121
    .line 122
    const-string v1, "Synchronous send timed out, continuing in the background."

    .line 123
    .line 124
    new-array v3, v2, [Ljava/lang/Object;

    .line 125
    .line 126
    invoke-interface {p1, p2, v1, v3}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    :cond_3
    :goto_1
    invoke-virtual {v0}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    sget-object p2, Lio/sentry/n3;->DEBUG:Lio/sentry/n3;

    .line 134
    .line 135
    const-string v1, "SendCachedEnvelopeIntegration installed."

    .line 136
    .line 137
    new-array v2, v2, [Ljava/lang/Object;

    .line 138
    .line 139
    invoke-interface {p1, p2, v1, v2}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 140
    .line 141
    .line 142
    goto :goto_2

    .line 143
    :catchall_0
    move-exception p1

    .line 144
    invoke-virtual {v0}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 145
    .line 146
    .line 147
    move-result-object p2

    .line 148
    sget-object v0, Lio/sentry/n3;->ERROR:Lio/sentry/n3;

    .line 149
    .line 150
    const-string v1, "Failed to call the executor. Cached events will not be sent"

    .line 151
    .line 152
    invoke-interface {p2, v0, v1, p1}, Lio/sentry/g0;->b(Lio/sentry/n3;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 153
    .line 154
    .line 155
    :goto_2
    return-void
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
