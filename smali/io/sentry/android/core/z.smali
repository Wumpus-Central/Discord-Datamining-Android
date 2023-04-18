.class public final Lio/sentry/android/core/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/q0;
.implements Ljava/io/Closeable;
.implements Landroid/content/ComponentCallbacks2;


# instance fields
.field private final k:Landroid/content/Context;

.field private l:Lio/sentry/f0;

.field private m:Lio/sentry/android/core/SentryAndroidOptions;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "Context is required"

    .line 5
    .line 6
    invoke-static {p1, v0}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, Landroid/content/Context;

    .line 11
    .line 12
    iput-object p1, p0, Lio/sentry/android/core/z;->k:Landroid/content/Context;

    .line 13
    .line 14
    return-void
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

.method private f(Ljava/lang/Integer;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lio/sentry/android/core/z;->l:Lio/sentry/f0;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    new-instance v0, Lio/sentry/d;

    .line 6
    .line 7
    invoke-direct {v0}, Lio/sentry/d;-><init>()V

    .line 8
    .line 9
    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/16 v2, 0x28

    .line 17
    .line 18
    if-ge v1, v2, :cond_0

    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    const-string v1, "level"

    .line 22
    .line 23
    invoke-virtual {v0, v1, p1}, Lio/sentry/d;->m(Ljava/lang/String;Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    :cond_1
    const-string p1, "system"

    .line 27
    .line 28
    invoke-virtual {v0, p1}, Lio/sentry/d;->p(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const-string p1, "device.event"

    .line 32
    .line 33
    invoke-virtual {v0, p1}, Lio/sentry/d;->l(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const-string p1, "Low memory"

    .line 37
    .line 38
    invoke-virtual {v0, p1}, Lio/sentry/d;->o(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    const-string p1, "action"

    .line 42
    .line 43
    const-string v1, "LOW_MEMORY"

    .line 44
    .line 45
    invoke-virtual {v0, p1, v1}, Lio/sentry/d;->m(Ljava/lang/String;Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    sget-object p1, Lio/sentry/n3;->WARNING:Lio/sentry/n3;

    .line 49
    .line 50
    invoke-virtual {v0, p1}, Lio/sentry/d;->n(Lio/sentry/n3;)V

    .line 51
    .line 52
    .line 53
    iget-object p1, p0, Lio/sentry/android/core/z;->l:Lio/sentry/f0;

    .line 54
    .line 55
    invoke-interface {p1, v0}, Lio/sentry/f0;->e(Lio/sentry/d;)V

    .line 56
    .line 57
    .line 58
    :cond_2
    return-void
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


# virtual methods
.method public b(Lio/sentry/f0;Lio/sentry/o3;)V
    .locals 4

    .line 1
    const-string v0, "Hub is required"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lio/sentry/f0;

    .line 8
    .line 9
    iput-object p1, p0, Lio/sentry/android/core/z;->l:Lio/sentry/f0;

    .line 10
    .line 11
    instance-of p1, p2, Lio/sentry/android/core/SentryAndroidOptions;

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    move-object p1, p2

    .line 16
    check-cast p1, Lio/sentry/android/core/SentryAndroidOptions;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    :goto_0
    const-string v0, "SentryAndroidOptions is required"

    .line 21
    .line 22
    invoke-static {p1, v0}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, Lio/sentry/android/core/SentryAndroidOptions;

    .line 27
    .line 28
    iput-object p1, p0, Lio/sentry/android/core/z;->m:Lio/sentry/android/core/SentryAndroidOptions;

    .line 29
    .line 30
    invoke-virtual {p1}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    sget-object v0, Lio/sentry/n3;->DEBUG:Lio/sentry/n3;

    .line 35
    .line 36
    const/4 v1, 0x1

    .line 37
    new-array v1, v1, [Ljava/lang/Object;

    .line 38
    .line 39
    iget-object v2, p0, Lio/sentry/android/core/z;->m:Lio/sentry/android/core/SentryAndroidOptions;

    .line 40
    .line 41
    invoke-virtual {v2}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableAppComponentBreadcrumbs()Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    const/4 v3, 0x0

    .line 50
    aput-object v2, v1, v3

    .line 51
    .line 52
    const-string v2, "AppComponentsBreadcrumbsIntegration enabled: %s"

    .line 53
    .line 54
    invoke-interface {p1, v0, v2, v1}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iget-object p1, p0, Lio/sentry/android/core/z;->m:Lio/sentry/android/core/SentryAndroidOptions;

    .line 58
    .line 59
    invoke-virtual {p1}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableAppComponentBreadcrumbs()Z

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    if-eqz p1, :cond_1

    .line 64
    .line 65
    :try_start_0
    iget-object p1, p0, Lio/sentry/android/core/z;->k:Landroid/content/Context;

    .line 66
    .line 67
    invoke-virtual {p1, p0}, Landroid/content/Context;->registerComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p2}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    const-string v1, "AppComponentsBreadcrumbsIntegration installed."

    .line 75
    .line 76
    new-array v2, v3, [Ljava/lang/Object;

    .line 77
    .line 78
    invoke-interface {p1, v0, v1, v2}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 79
    .line 80
    .line 81
    goto :goto_1

    .line 82
    :catchall_0
    move-exception p1

    .line 83
    iget-object v0, p0, Lio/sentry/android/core/z;->m:Lio/sentry/android/core/SentryAndroidOptions;

    .line 84
    .line 85
    invoke-virtual {v0, v3}, Lio/sentry/android/core/SentryAndroidOptions;->setEnableAppComponentBreadcrumbs(Z)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p2}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 89
    .line 90
    .line 91
    move-result-object p2

    .line 92
    sget-object v0, Lio/sentry/n3;->INFO:Lio/sentry/n3;

    .line 93
    .line 94
    const-string v1, "ComponentCallbacks2 is not available."

    .line 95
    .line 96
    new-array v2, v3, [Ljava/lang/Object;

    .line 97
    .line 98
    invoke-interface {p2, v0, p1, v1, v2}, Lio/sentry/g0;->a(Lio/sentry/n3;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    :cond_1
    :goto_1
    return-void
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

.method public close()V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object v1, p0, Lio/sentry/android/core/z;->k:Landroid/content/Context;

    .line 3
    .line 4
    invoke-virtual {v1, p0}, Landroid/content/Context;->unregisterComponentCallbacks(Landroid/content/ComponentCallbacks;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    .line 7
    goto :goto_0

    .line 8
    :catchall_0
    move-exception v1

    .line 9
    iget-object v2, p0, Lio/sentry/android/core/z;->m:Lio/sentry/android/core/SentryAndroidOptions;

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    invoke-virtual {v2}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    sget-object v3, Lio/sentry/n3;->DEBUG:Lio/sentry/n3;

    .line 18
    .line 19
    const-string v4, "It was not possible to unregisterComponentCallbacks"

    .line 20
    .line 21
    new-array v5, v0, [Ljava/lang/Object;

    .line 22
    .line 23
    invoke-interface {v2, v3, v1, v4, v5}, Lio/sentry/g0;->a(Lio/sentry/n3;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    :goto_0
    iget-object v1, p0, Lio/sentry/android/core/z;->m:Lio/sentry/android/core/SentryAndroidOptions;

    .line 27
    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    invoke-virtual {v1}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    sget-object v2, Lio/sentry/n3;->DEBUG:Lio/sentry/n3;

    .line 35
    .line 36
    const-string v3, "AppComponentsBreadcrumbsIntegration removed."

    .line 37
    .line 38
    new-array v0, v0, [Ljava/lang/Object;

    .line 39
    .line 40
    invoke-interface {v1, v2, v3, v0}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    :cond_1
    return-void
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

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lio/sentry/android/core/z;->l:Lio/sentry/f0;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lio/sentry/android/core/z;->k:Landroid/content/Context;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    .line 16
    .line 17
    invoke-static {v0}, Lio/sentry/android/core/internal/util/d;->a(I)Lio/sentry/protocol/e$b;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const-string v0, "undefined"

    .line 35
    .line 36
    :goto_0
    new-instance v1, Lio/sentry/d;

    .line 37
    .line 38
    invoke-direct {v1}, Lio/sentry/d;-><init>()V

    .line 39
    .line 40
    .line 41
    const-string v2, "navigation"

    .line 42
    .line 43
    invoke-virtual {v1, v2}, Lio/sentry/d;->p(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const-string v2, "device.orientation"

    .line 47
    .line 48
    invoke-virtual {v1, v2}, Lio/sentry/d;->l(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const-string v2, "position"

    .line 52
    .line 53
    invoke-virtual {v1, v2, v0}, Lio/sentry/d;->m(Ljava/lang/String;Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    sget-object v0, Lio/sentry/n3;->INFO:Lio/sentry/n3;

    .line 57
    .line 58
    invoke-virtual {v1, v0}, Lio/sentry/d;->n(Lio/sentry/n3;)V

    .line 59
    .line 60
    .line 61
    new-instance v0, Lio/sentry/v;

    .line 62
    .line 63
    invoke-direct {v0}, Lio/sentry/v;-><init>()V

    .line 64
    .line 65
    .line 66
    const-string v2, "android:configuration"

    .line 67
    .line 68
    invoke-virtual {v0, v2, p1}, Lio/sentry/v;->h(Ljava/lang/String;Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    iget-object p1, p0, Lio/sentry/android/core/z;->l:Lio/sentry/f0;

    .line 72
    .line 73
    invoke-interface {p1, v1, v0}, Lio/sentry/f0;->j(Lio/sentry/d;Lio/sentry/v;)V

    .line 74
    .line 75
    .line 76
    :cond_1
    return-void
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

.method public onLowMemory()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lio/sentry/android/core/z;->f(Ljava/lang/Integer;)V

    return-void
.end method

.method public onTrimMemory(I)V
    .locals 0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/sentry/android/core/z;->f(Ljava/lang/Integer;)V

    return-void
.end method
