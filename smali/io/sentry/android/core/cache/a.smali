.class public final Lio/sentry/android/core/cache/a;
.super Lio/sentry/cache/d;
.source "SourceFile"


# instance fields
.field private final q:Lio/sentry/transport/o;


# direct methods
.method public constructor <init>(Lio/sentry/android/core/SentryAndroidOptions;)V
    .locals 1

    .line 1
    invoke-static {}, Lio/sentry/android/core/internal/util/a;->b()Lio/sentry/transport/o;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lio/sentry/android/core/cache/a;-><init>(Lio/sentry/android/core/SentryAndroidOptions;Lio/sentry/transport/o;)V

    return-void
.end method

.method constructor <init>(Lio/sentry/android/core/SentryAndroidOptions;Lio/sentry/transport/o;)V
    .locals 2

    .line 2
    invoke-virtual {p1}, Lio/sentry/o3;->getCacheDirPath()Ljava/lang/String;

    move-result-object v0

    const-string v1, "cacheDirPath must not be null"

    invoke-static {v0, v1}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 3
    invoke-virtual {p1}, Lio/sentry/o3;->getMaxCacheItems()I

    move-result v1

    .line 4
    invoke-direct {p0, p1, v0, v1}, Lio/sentry/cache/d;-><init>(Lio/sentry/o3;Ljava/lang/String;I)V

    .line 5
    iput-object p2, p0, Lio/sentry/android/core/cache/a;->q:Lio/sentry/transport/o;

    return-void
.end method

.method public static I(Lio/sentry/o3;)Z
    .locals 7

    .line 1
    invoke-virtual {p0}, Lio/sentry/o3;->getOutboxPath()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    sget-object v0, Lio/sentry/n3;->DEBUG:Lio/sentry/n3;

    .line 13
    .line 14
    const-string v2, "Outbox path is null, the startup crash marker file does not exist"

    .line 15
    .line 16
    new-array v3, v1, [Ljava/lang/Object;

    .line 17
    .line 18
    invoke-interface {p0, v0, v2, v3}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    return v1

    .line 22
    :cond_0
    new-instance v0, Ljava/io/File;

    .line 23
    .line 24
    invoke-virtual {p0}, Lio/sentry/o3;->getOutboxPath()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    const-string v3, "startup_crash"

    .line 29
    .line 30
    invoke-direct {v0, v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :try_start_0
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-eqz v2, :cond_1

    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-nez v3, :cond_1

    .line 44
    .line 45
    invoke-virtual {p0}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    sget-object v4, Lio/sentry/n3;->ERROR:Lio/sentry/n3;

    .line 50
    .line 51
    const-string v5, "Failed to delete the startup crash marker file. %s."

    .line 52
    .line 53
    const/4 v6, 0x1

    .line 54
    new-array v6, v6, [Ljava/lang/Object;

    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    aput-object v0, v6, v1

    .line 61
    .line 62
    invoke-interface {v3, v4, v5, v6}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    .line 64
    .line 65
    :cond_1
    return v2

    .line 66
    :catchall_0
    move-exception v0

    .line 67
    invoke-virtual {p0}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    sget-object v2, Lio/sentry/n3;->ERROR:Lio/sentry/n3;

    .line 72
    .line 73
    const-string v3, "Error reading/deleting the startup crash marker file on the disk"

    .line 74
    .line 75
    invoke-interface {p0, v2, v3, v0}, Lio/sentry/g0;->b(Lio/sentry/n3;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 76
    .line 77
    .line 78
    return v1
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

.method private J()V
    .locals 4

    .line 1
    iget-object v0, p0, Lio/sentry/android/core/cache/a;->k:Lio/sentry/o3;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/o3;->getOutboxPath()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lio/sentry/android/core/cache/a;->k:Lio/sentry/o3;

    .line 10
    .line 11
    invoke-virtual {v0}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sget-object v1, Lio/sentry/n3;->DEBUG:Lio/sentry/n3;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    new-array v2, v2, [Ljava/lang/Object;

    .line 19
    .line 20
    const-string v3, "Outbox path is null, the startup crash marker file will not be written"

    .line 21
    .line 22
    invoke-interface {v0, v1, v3, v2}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    new-instance v0, Ljava/io/File;

    .line 27
    .line 28
    iget-object v1, p0, Lio/sentry/android/core/cache/a;->k:Lio/sentry/o3;

    .line 29
    .line 30
    invoke-virtual {v1}, Lio/sentry/o3;->getOutboxPath()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    const-string v2, "startup_crash"

    .line 35
    .line 36
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    :try_start_0
    invoke-virtual {v0}, Ljava/io/File;->createNewFile()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :catchall_0
    move-exception v0

    .line 44
    iget-object v1, p0, Lio/sentry/android/core/cache/a;->k:Lio/sentry/o3;

    .line 45
    .line 46
    invoke-virtual {v1}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    sget-object v2, Lio/sentry/n3;->ERROR:Lio/sentry/n3;

    .line 51
    .line 52
    const-string v3, "Error writing the startup crash marker file to the disk"

    .line 53
    .line 54
    invoke-interface {v1, v2, v3, v0}, Lio/sentry/g0;->b(Lio/sentry/n3;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 55
    .line 56
    .line 57
    :goto_0
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
.end method


# virtual methods
.method public g(Lio/sentry/q2;Lio/sentry/v;)V
    .locals 5

    .line 1
    invoke-super {p0, p1, p2}, Lio/sentry/cache/d;->g(Lio/sentry/q2;Lio/sentry/v;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lio/sentry/android/core/cache/a;->k:Lio/sentry/o3;

    .line 5
    .line 6
    check-cast p1, Lio/sentry/android/core/SentryAndroidOptions;

    .line 7
    .line 8
    invoke-static {}, Lio/sentry/android/core/d0;->d()Lio/sentry/android/core/d0;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Lio/sentry/android/core/d0;->b()Ljava/lang/Long;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-class v1, Lio/sentry/hints/c;

    .line 17
    .line 18
    invoke-static {p2, v1}, Lio/sentry/util/h;->g(Lio/sentry/v;Ljava/lang/Class;)Z

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    if-eqz p2, :cond_0

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    iget-object p2, p0, Lio/sentry/android/core/cache/a;->q:Lio/sentry/transport/o;

    .line 27
    .line 28
    invoke-interface {p2}, Lio/sentry/transport/o;->a()J

    .line 29
    .line 30
    .line 31
    move-result-wide v1

    .line 32
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 33
    .line 34
    .line 35
    move-result-wide v3

    .line 36
    sub-long/2addr v1, v3

    .line 37
    invoke-virtual {p1}, Lio/sentry/android/core/SentryAndroidOptions;->getStartupCrashDurationThresholdMillis()J

    .line 38
    .line 39
    .line 40
    move-result-wide v3

    .line 41
    cmp-long p2, v1, v3

    .line 42
    .line 43
    if-gtz p2, :cond_0

    .line 44
    .line 45
    invoke-virtual {p1}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    sget-object p2, Lio/sentry/n3;->DEBUG:Lio/sentry/n3;

    .line 50
    .line 51
    const/4 v0, 0x1

    .line 52
    new-array v0, v0, [Ljava/lang/Object;

    .line 53
    .line 54
    const/4 v3, 0x0

    .line 55
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    aput-object v1, v0, v3

    .line 60
    .line 61
    const-string v1, "Startup Crash detected %d milliseconds after SDK init. Writing a startup crash marker file to disk."

    .line 62
    .line 63
    invoke-interface {p1, p2, v1, v0}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    invoke-direct {p0}, Lio/sentry/android/core/cache/a;->J()V

    .line 67
    .line 68
    .line 69
    :cond_0
    return-void
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
