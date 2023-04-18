.class public final Lio/sentry/android/core/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/q0;
.implements Ljava/io/Closeable;


# instance fields
.field k:Lio/sentry/android/core/LifecycleWatcher;

.field private l:Lio/sentry/android/core/SentryAndroidOptions;

.field private final m:Lio/sentry/android/core/q0;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    new-instance v0, Lio/sentry/android/core/q0;

    invoke-direct {v0}, Lio/sentry/android/core/q0;-><init>()V

    invoke-direct {p0, v0}, Lio/sentry/android/core/c0;-><init>(Lio/sentry/android/core/q0;)V

    return-void
.end method

.method constructor <init>(Lio/sentry/android/core/q0;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lio/sentry/android/core/c0;->m:Lio/sentry/android/core/q0;

    return-void
.end method

.method public static synthetic f(Lio/sentry/android/core/c0;)V
    .locals 0

    invoke-direct {p0}, Lio/sentry/android/core/c0;->l()V

    return-void
.end method

.method public static synthetic i(Lio/sentry/android/core/c0;Lio/sentry/f0;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/sentry/android/core/c0;->p(Lio/sentry/f0;)V

    return-void
.end method

.method private k(Lio/sentry/f0;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lio/sentry/android/core/c0;->l:Lio/sentry/android/core/SentryAndroidOptions;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance v7, Lio/sentry/android/core/LifecycleWatcher;

    .line 7
    .line 8
    invoke-virtual {v0}, Lio/sentry/o3;->getSessionTrackingIntervalMillis()J

    .line 9
    .line 10
    .line 11
    move-result-wide v3

    .line 12
    iget-object v0, p0, Lio/sentry/android/core/c0;->l:Lio/sentry/android/core/SentryAndroidOptions;

    .line 13
    .line 14
    invoke-virtual {v0}, Lio/sentry/o3;->isEnableAutoSessionTracking()Z

    .line 15
    .line 16
    .line 17
    move-result v5

    .line 18
    iget-object v0, p0, Lio/sentry/android/core/c0;->l:Lio/sentry/android/core/SentryAndroidOptions;

    .line 19
    .line 20
    invoke-virtual {v0}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableAppLifecycleBreadcrumbs()Z

    .line 21
    .line 22
    .line 23
    move-result v6

    .line 24
    move-object v1, v7

    .line 25
    move-object v2, p1

    .line 26
    invoke-direct/range {v1 .. v6}, Lio/sentry/android/core/LifecycleWatcher;-><init>(Lio/sentry/f0;JZZ)V

    .line 27
    .line 28
    .line 29
    iput-object v7, p0, Lio/sentry/android/core/c0;->k:Lio/sentry/android/core/LifecycleWatcher;

    .line 30
    .line 31
    :try_start_0
    invoke-static {}, Landroidx/lifecycle/ProcessLifecycleOwner;->h()Landroidx/lifecycle/LifecycleOwner;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-interface {p1}, Landroidx/lifecycle/LifecycleOwner;->getLifecycle()Landroidx/lifecycle/Lifecycle;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iget-object v0, p0, Lio/sentry/android/core/c0;->k:Lio/sentry/android/core/LifecycleWatcher;

    .line 40
    .line 41
    invoke-virtual {p1, v0}, Landroidx/lifecycle/Lifecycle;->a(Landroidx/lifecycle/l;)V

    .line 42
    .line 43
    .line 44
    iget-object p1, p0, Lio/sentry/android/core/c0;->l:Lio/sentry/android/core/SentryAndroidOptions;

    .line 45
    .line 46
    invoke-virtual {p1}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    sget-object v0, Lio/sentry/n3;->DEBUG:Lio/sentry/n3;

    .line 51
    .line 52
    const-string v1, "AppLifecycleIntegration installed."

    .line 53
    .line 54
    const/4 v2, 0x0

    .line 55
    new-array v2, v2, [Ljava/lang/Object;

    .line 56
    .line 57
    invoke-interface {p1, v0, v1, v2}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :catchall_0
    move-exception p1

    .line 62
    const/4 v0, 0x0

    .line 63
    iput-object v0, p0, Lio/sentry/android/core/c0;->k:Lio/sentry/android/core/LifecycleWatcher;

    .line 64
    .line 65
    iget-object v0, p0, Lio/sentry/android/core/c0;->l:Lio/sentry/android/core/SentryAndroidOptions;

    .line 66
    .line 67
    invoke-virtual {v0}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    sget-object v1, Lio/sentry/n3;->ERROR:Lio/sentry/n3;

    .line 72
    .line 73
    const-string v2, "AppLifecycleIntegration failed to get Lifecycle and could not be installed."

    .line 74
    .line 75
    invoke-interface {v0, v1, v2, p1}, Lio/sentry/g0;->b(Lio/sentry/n3;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 76
    .line 77
    .line 78
    :goto_0
    return-void
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

.method private synthetic l()V
    .locals 0

    invoke-direct {p0}, Lio/sentry/android/core/c0;->s()V

    return-void
.end method

.method private synthetic p(Lio/sentry/f0;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/sentry/android/core/c0;->k(Lio/sentry/f0;)V

    return-void
.end method

.method private s()V
    .locals 2

    invoke-static {}, Landroidx/lifecycle/ProcessLifecycleOwner;->h()Landroidx/lifecycle/LifecycleOwner;

    move-result-object v0

    invoke-interface {v0}, Landroidx/lifecycle/LifecycleOwner;->getLifecycle()Landroidx/lifecycle/Lifecycle;

    move-result-object v0

    iget-object v1, p0, Lio/sentry/android/core/c0;->k:Lio/sentry/android/core/LifecycleWatcher;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/Lifecycle;->c(Landroidx/lifecycle/l;)V

    return-void
.end method


# virtual methods
.method public b(Lio/sentry/f0;Lio/sentry/o3;)V
    .locals 6

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
    iput-object v0, p0, Lio/sentry/android/core/c0;->l:Lio/sentry/android/core/SentryAndroidOptions;

    .line 24
    .line 25
    invoke-virtual {v0}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    sget-object v1, Lio/sentry/n3;->DEBUG:Lio/sentry/n3;

    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    new-array v3, v2, [Ljava/lang/Object;

    .line 33
    .line 34
    iget-object v4, p0, Lio/sentry/android/core/c0;->l:Lio/sentry/android/core/SentryAndroidOptions;

    .line 35
    .line 36
    invoke-virtual {v4}, Lio/sentry/o3;->isEnableAutoSessionTracking()Z

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    const/4 v5, 0x0

    .line 45
    aput-object v4, v3, v5

    .line 46
    .line 47
    const-string v4, "enableSessionTracking enabled: %s"

    .line 48
    .line 49
    invoke-interface {v0, v1, v4, v3}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object v0, p0, Lio/sentry/android/core/c0;->l:Lio/sentry/android/core/SentryAndroidOptions;

    .line 53
    .line 54
    invoke-virtual {v0}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    new-array v2, v2, [Ljava/lang/Object;

    .line 59
    .line 60
    iget-object v3, p0, Lio/sentry/android/core/c0;->l:Lio/sentry/android/core/SentryAndroidOptions;

    .line 61
    .line 62
    invoke-virtual {v3}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableAppLifecycleBreadcrumbs()Z

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    aput-object v3, v2, v5

    .line 71
    .line 72
    const-string v3, "enableAppLifecycleBreadcrumbs enabled: %s"

    .line 73
    .line 74
    invoke-interface {v0, v1, v3, v2}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    iget-object v0, p0, Lio/sentry/android/core/c0;->l:Lio/sentry/android/core/SentryAndroidOptions;

    .line 78
    .line 79
    invoke-virtual {v0}, Lio/sentry/o3;->isEnableAutoSessionTracking()Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-nez v0, :cond_1

    .line 84
    .line 85
    iget-object v0, p0, Lio/sentry/android/core/c0;->l:Lio/sentry/android/core/SentryAndroidOptions;

    .line 86
    .line 87
    invoke-virtual {v0}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableAppLifecycleBreadcrumbs()Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    if-eqz v0, :cond_3

    .line 92
    .line 93
    :cond_1
    :try_start_0
    sget v0, Landroidx/lifecycle/ProcessLifecycleOwner;->t:I

    .line 94
    .line 95
    invoke-static {}, Lio/sentry/android/core/internal/util/e;->a()Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-eqz v0, :cond_2

    .line 100
    .line 101
    invoke-direct {p0, p1}, Lio/sentry/android/core/c0;->k(Lio/sentry/f0;)V

    .line 102
    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_2
    iget-object v0, p0, Lio/sentry/android/core/c0;->m:Lio/sentry/android/core/q0;

    .line 106
    .line 107
    new-instance v1, Lio/sentry/android/core/b0;

    .line 108
    .line 109
    invoke-direct {v1, p0, p1}, Lio/sentry/android/core/b0;-><init>(Lio/sentry/android/core/c0;Lio/sentry/f0;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0, v1}, Lio/sentry/android/core/q0;->b(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 113
    .line 114
    .line 115
    goto :goto_1

    .line 116
    :catch_0
    move-exception p1

    .line 117
    invoke-virtual {p2}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 118
    .line 119
    .line 120
    move-result-object p2

    .line 121
    sget-object v0, Lio/sentry/n3;->ERROR:Lio/sentry/n3;

    .line 122
    .line 123
    const-string v1, "AppLifecycleIntegration could not be installed"

    .line 124
    .line 125
    invoke-interface {p2, v0, v1, p1}, Lio/sentry/g0;->b(Lio/sentry/n3;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 126
    .line 127
    .line 128
    goto :goto_1

    .line 129
    :catch_1
    move-exception p1

    .line 130
    invoke-virtual {p2}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 131
    .line 132
    .line 133
    move-result-object p2

    .line 134
    sget-object v0, Lio/sentry/n3;->INFO:Lio/sentry/n3;

    .line 135
    .line 136
    const-string v1, "androidx.lifecycle is not available, AppLifecycleIntegration won\'t be installed"

    .line 137
    .line 138
    invoke-interface {p2, v0, v1, p1}, Lio/sentry/g0;->b(Lio/sentry/n3;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 139
    .line 140
    .line 141
    :cond_3
    :goto_1
    return-void
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

.method public close()V
    .locals 4

    .line 1
    iget-object v0, p0, Lio/sentry/android/core/c0;->k:Lio/sentry/android/core/LifecycleWatcher;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-static {}, Lio/sentry/android/core/internal/util/e;->a()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-direct {p0}, Lio/sentry/android/core/c0;->s()V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-object v0, p0, Lio/sentry/android/core/c0;->m:Lio/sentry/android/core/q0;

    .line 16
    .line 17
    new-instance v1, Lio/sentry/android/core/a0;

    .line 18
    .line 19
    invoke-direct {v1, p0}, Lio/sentry/android/core/a0;-><init>(Lio/sentry/android/core/c0;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Lio/sentry/android/core/q0;->b(Ljava/lang/Runnable;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    const/4 v0, 0x0

    .line 26
    iput-object v0, p0, Lio/sentry/android/core/c0;->k:Lio/sentry/android/core/LifecycleWatcher;

    .line 27
    .line 28
    iget-object v0, p0, Lio/sentry/android/core/c0;->l:Lio/sentry/android/core/SentryAndroidOptions;

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    invoke-virtual {v0}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    sget-object v1, Lio/sentry/n3;->DEBUG:Lio/sentry/n3;

    .line 37
    .line 38
    const/4 v2, 0x0

    .line 39
    new-array v2, v2, [Ljava/lang/Object;

    .line 40
    .line 41
    const-string v3, "AppLifecycleIntegration removed."

    .line 42
    .line 43
    invoke-interface {v0, v1, v3, v2}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    :cond_1
    return-void
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
