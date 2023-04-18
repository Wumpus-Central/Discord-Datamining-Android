.class public final Lio/sentry/android/core/s0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/q0;
.implements Ljava/io/Closeable;


# instance fields
.field private final k:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field private l:Lio/sentry/android/core/SentryAndroidOptions;


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/sentry/android/core/s0;->k:Ljava/lang/Class;

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
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
.end method

.method private f(Lio/sentry/o3;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, v0}, Lio/sentry/o3;->setEnableNdk(Z)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1, v0}, Lio/sentry/o3;->setEnableScopeSync(Z)V

    .line 6
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
.end method


# virtual methods
.method public final b(Lio/sentry/f0;Lio/sentry/o3;)V
    .locals 6

    .line 1
    const-string v0, "Hub is required"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    instance-of p1, p2, Lio/sentry/android/core/SentryAndroidOptions;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    check-cast p2, Lio/sentry/android/core/SentryAndroidOptions;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-object p2, v0

    .line 15
    :goto_0
    const-string p1, "SentryAndroidOptions is required"

    .line 16
    .line 17
    invoke-static {p2, p1}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, Lio/sentry/android/core/SentryAndroidOptions;

    .line 22
    .line 23
    iput-object p1, p0, Lio/sentry/android/core/s0;->l:Lio/sentry/android/core/SentryAndroidOptions;

    .line 24
    .line 25
    invoke-virtual {p1}, Lio/sentry/o3;->isEnableNdk()Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    iget-object p2, p0, Lio/sentry/android/core/s0;->l:Lio/sentry/android/core/SentryAndroidOptions;

    .line 30
    .line 31
    invoke-virtual {p2}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    sget-object v1, Lio/sentry/n3;->DEBUG:Lio/sentry/n3;

    .line 36
    .line 37
    const/4 v2, 0x1

    .line 38
    new-array v3, v2, [Ljava/lang/Object;

    .line 39
    .line 40
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

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
    const-string v4, "NdkIntegration enabled: %s"

    .line 48
    .line 49
    invoke-interface {p2, v1, v4, v3}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    if-eqz p1, :cond_2

    .line 53
    .line 54
    iget-object p1, p0, Lio/sentry/android/core/s0;->k:Ljava/lang/Class;

    .line 55
    .line 56
    if-eqz p1, :cond_2

    .line 57
    .line 58
    iget-object p1, p0, Lio/sentry/android/core/s0;->l:Lio/sentry/android/core/SentryAndroidOptions;

    .line 59
    .line 60
    invoke-virtual {p1}, Lio/sentry/o3;->getCacheDirPath()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    if-nez p1, :cond_1

    .line 65
    .line 66
    iget-object p1, p0, Lio/sentry/android/core/s0;->l:Lio/sentry/android/core/SentryAndroidOptions;

    .line 67
    .line 68
    invoke-virtual {p1}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    sget-object p2, Lio/sentry/n3;->ERROR:Lio/sentry/n3;

    .line 73
    .line 74
    const-string v0, "No cache dir path is defined in options."

    .line 75
    .line 76
    new-array v1, v5, [Ljava/lang/Object;

    .line 77
    .line 78
    invoke-interface {p1, p2, v0, v1}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    iget-object p1, p0, Lio/sentry/android/core/s0;->l:Lio/sentry/android/core/SentryAndroidOptions;

    .line 82
    .line 83
    invoke-direct {p0, p1}, Lio/sentry/android/core/s0;->f(Lio/sentry/o3;)V

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :cond_1
    :try_start_0
    iget-object p1, p0, Lio/sentry/android/core/s0;->k:Ljava/lang/Class;

    .line 88
    .line 89
    const-string p2, "init"

    .line 90
    .line 91
    new-array v3, v2, [Ljava/lang/Class;

    .line 92
    .line 93
    const-class v4, Lio/sentry/android/core/SentryAndroidOptions;

    .line 94
    .line 95
    aput-object v4, v3, v5

    .line 96
    .line 97
    invoke-virtual {p1, p2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    new-array p2, v2, [Ljava/lang/Object;

    .line 102
    .line 103
    iget-object v2, p0, Lio/sentry/android/core/s0;->l:Lio/sentry/android/core/SentryAndroidOptions;

    .line 104
    .line 105
    aput-object v2, p2, v5

    .line 106
    .line 107
    invoke-virtual {p1, v0, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    iget-object p1, p0, Lio/sentry/android/core/s0;->l:Lio/sentry/android/core/SentryAndroidOptions;

    .line 111
    .line 112
    invoke-virtual {p1}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    const-string p2, "NdkIntegration installed."

    .line 117
    .line 118
    new-array v0, v5, [Ljava/lang/Object;

    .line 119
    .line 120
    invoke-interface {p1, v1, p2, v0}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 121
    .line 122
    .line 123
    goto :goto_1

    .line 124
    :catchall_0
    move-exception p1

    .line 125
    iget-object p2, p0, Lio/sentry/android/core/s0;->l:Lio/sentry/android/core/SentryAndroidOptions;

    .line 126
    .line 127
    invoke-direct {p0, p2}, Lio/sentry/android/core/s0;->f(Lio/sentry/o3;)V

    .line 128
    .line 129
    .line 130
    iget-object p2, p0, Lio/sentry/android/core/s0;->l:Lio/sentry/android/core/SentryAndroidOptions;

    .line 131
    .line 132
    invoke-virtual {p2}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 133
    .line 134
    .line 135
    move-result-object p2

    .line 136
    sget-object v0, Lio/sentry/n3;->ERROR:Lio/sentry/n3;

    .line 137
    .line 138
    const-string v1, "Failed to initialize SentryNdk."

    .line 139
    .line 140
    invoke-interface {p2, v0, v1, p1}, Lio/sentry/g0;->b(Lio/sentry/n3;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 141
    .line 142
    .line 143
    goto :goto_1

    .line 144
    :catch_0
    move-exception p1

    .line 145
    iget-object p2, p0, Lio/sentry/android/core/s0;->l:Lio/sentry/android/core/SentryAndroidOptions;

    .line 146
    .line 147
    invoke-direct {p0, p2}, Lio/sentry/android/core/s0;->f(Lio/sentry/o3;)V

    .line 148
    .line 149
    .line 150
    iget-object p2, p0, Lio/sentry/android/core/s0;->l:Lio/sentry/android/core/SentryAndroidOptions;

    .line 151
    .line 152
    invoke-virtual {p2}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 153
    .line 154
    .line 155
    move-result-object p2

    .line 156
    sget-object v0, Lio/sentry/n3;->ERROR:Lio/sentry/n3;

    .line 157
    .line 158
    const-string v1, "Failed to invoke the SentryNdk.init method."

    .line 159
    .line 160
    invoke-interface {p2, v0, v1, p1}, Lio/sentry/g0;->b(Lio/sentry/n3;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 161
    .line 162
    .line 163
    goto :goto_1

    .line 164
    :cond_2
    iget-object p1, p0, Lio/sentry/android/core/s0;->l:Lio/sentry/android/core/SentryAndroidOptions;

    .line 165
    .line 166
    invoke-direct {p0, p1}, Lio/sentry/android/core/s0;->f(Lio/sentry/o3;)V

    .line 167
    .line 168
    .line 169
    :goto_1
    return-void
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
    iget-object v0, p0, Lio/sentry/android/core/s0;->l:Lio/sentry/android/core/SentryAndroidOptions;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lio/sentry/o3;->isEnableNdk()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lio/sentry/android/core/s0;->k:Ljava/lang/Class;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    :try_start_0
    const-string v1, "close"

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    new-array v3, v2, [Ljava/lang/Class;

    .line 19
    .line 20
    invoke-virtual {v0, v1, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    new-array v1, v2, [Ljava/lang/Object;

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    invoke-virtual {v0, v3, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lio/sentry/android/core/s0;->l:Lio/sentry/android/core/SentryAndroidOptions;

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
    const-string v3, "NdkIntegration removed."

    .line 39
    .line 40
    new-array v2, v2, [Ljava/lang/Object;

    .line 41
    .line 42
    invoke-interface {v0, v1, v3, v2}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :catchall_0
    move-exception v0

    .line 47
    :try_start_1
    iget-object v1, p0, Lio/sentry/android/core/s0;->l:Lio/sentry/android/core/SentryAndroidOptions;

    .line 48
    .line 49
    invoke-virtual {v1}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    sget-object v2, Lio/sentry/n3;->ERROR:Lio/sentry/n3;

    .line 54
    .line 55
    const-string v3, "Failed to close SentryNdk."

    .line 56
    .line 57
    invoke-interface {v1, v2, v3, v0}, Lio/sentry/g0;->b(Lio/sentry/n3;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :catch_0
    move-exception v0

    .line 62
    iget-object v1, p0, Lio/sentry/android/core/s0;->l:Lio/sentry/android/core/SentryAndroidOptions;

    .line 63
    .line 64
    invoke-virtual {v1}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    sget-object v2, Lio/sentry/n3;->ERROR:Lio/sentry/n3;

    .line 69
    .line 70
    const-string v3, "Failed to invoke the SentryNdk.close method."

    .line 71
    .line 72
    invoke-interface {v1, v2, v3, v0}, Lio/sentry/g0;->b(Lio/sentry/n3;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 73
    .line 74
    .line 75
    :goto_0
    iget-object v0, p0, Lio/sentry/android/core/s0;->l:Lio/sentry/android/core/SentryAndroidOptions;

    .line 76
    .line 77
    invoke-direct {p0, v0}, Lio/sentry/android/core/s0;->f(Lio/sentry/o3;)V

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :catchall_1
    move-exception v0

    .line 82
    iget-object v1, p0, Lio/sentry/android/core/s0;->l:Lio/sentry/android/core/SentryAndroidOptions;

    .line 83
    .line 84
    invoke-direct {p0, v1}, Lio/sentry/android/core/s0;->f(Lio/sentry/o3;)V

    .line 85
    .line 86
    .line 87
    throw v0

    .line 88
    :cond_0
    :goto_1
    return-void
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
