.class public final Lio/sentry/android/core/w0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/t;
.implements Landroid/app/Application$ActivityLifecycleCallbacks;
.implements Ljava/io/Closeable;


# instance fields
.field private final k:Landroid/app/Application;

.field private final l:Lio/sentry/android/core/SentryAndroidOptions;

.field private final m:Lio/sentry/android/core/f0;

.field private n:Z


# direct methods
.method public constructor <init>(Landroid/app/Application;Lio/sentry/android/core/SentryAndroidOptions;Lio/sentry/android/core/f0;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lio/sentry/android/core/w0;->n:Z

    .line 6
    .line 7
    const-string v0, "Application is required"

    .line 8
    .line 9
    invoke-static {p1, v0}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Landroid/app/Application;

    .line 14
    .line 15
    iput-object v0, p0, Lio/sentry/android/core/w0;->k:Landroid/app/Application;

    .line 16
    .line 17
    const-string v0, "SentryAndroidOptions is required"

    .line 18
    .line 19
    invoke-static {p2, v0}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    check-cast p2, Lio/sentry/android/core/SentryAndroidOptions;

    .line 24
    .line 25
    iput-object p2, p0, Lio/sentry/android/core/w0;->l:Lio/sentry/android/core/SentryAndroidOptions;

    .line 26
    .line 27
    const-string p2, "BuildInfoProvider is required"

    .line 28
    .line 29
    invoke-static {p3, p2}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    check-cast p2, Lio/sentry/android/core/f0;

    .line 34
    .line 35
    iput-object p2, p0, Lio/sentry/android/core/w0;->m:Lio/sentry/android/core/f0;

    .line 36
    .line 37
    invoke-virtual {p1, p0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 38
    .line 39
    .line 40
    return-void
    .line 41
    .line 42
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
.end method

.method private i(Landroid/app/Activity;)V
    .locals 1

    .line 1
    invoke-static {}, Lio/sentry/android/core/i0;->c()Lio/sentry/android/core/i0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lio/sentry/android/core/i0;->b()Landroid/app/Activity;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-ne v0, p1, :cond_0

    .line 10
    .line 11
    invoke-static {}, Lio/sentry/android/core/i0;->c()Lio/sentry/android/core/i0;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1}, Lio/sentry/android/core/i0;->a()V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
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

.method private k(Landroid/app/Activity;)V
    .locals 1

    invoke-static {}, Lio/sentry/android/core/i0;->c()Lio/sentry/android/core/i0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lio/sentry/android/core/i0;->d(Landroid/app/Activity;)V

    return-void
.end method


# virtual methods
.method public b(Lio/sentry/j3;Lio/sentry/v;)Lio/sentry/j3;
    .locals 3

    .line 1
    iget-boolean v0, p0, Lio/sentry/android/core/w0;->n:Z

    .line 2
    .line 3
    if-eqz v0, :cond_4

    .line 4
    .line 5
    invoke-virtual {p1}, Lio/sentry/j3;->t0()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v0, p0, Lio/sentry/android/core/w0;->l:Lio/sentry/android/core/SentryAndroidOptions;

    .line 13
    .line 14
    invoke-virtual {v0}, Lio/sentry/android/core/SentryAndroidOptions;->isAttachScreenshot()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    iget-object p2, p0, Lio/sentry/android/core/w0;->k:Landroid/app/Application;

    .line 21
    .line 22
    invoke-virtual {p2, p0}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 23
    .line 24
    .line 25
    const/4 p2, 0x0

    .line 26
    iput-boolean p2, p0, Lio/sentry/android/core/w0;->n:Z

    .line 27
    .line 28
    iget-object v0, p0, Lio/sentry/android/core/w0;->l:Lio/sentry/android/core/SentryAndroidOptions;

    .line 29
    .line 30
    invoke-virtual {v0}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    sget-object v1, Lio/sentry/n3;->DEBUG:Lio/sentry/n3;

    .line 35
    .line 36
    const-string v2, "attachScreenshot is disabled, ScreenshotEventProcessor isn\'t installed."

    .line 37
    .line 38
    new-array p2, p2, [Ljava/lang/Object;

    .line 39
    .line 40
    invoke-interface {v0, v1, v2, p2}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    return-object p1

    .line 44
    :cond_1
    invoke-static {}, Lio/sentry/android/core/i0;->c()Lio/sentry/android/core/i0;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v0}, Lio/sentry/android/core/i0;->b()Landroid/app/Activity;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    if-eqz v0, :cond_4

    .line 53
    .line 54
    invoke-static {p2}, Lio/sentry/util/h;->h(Lio/sentry/v;)Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-eqz v1, :cond_2

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    iget-object v1, p0, Lio/sentry/android/core/w0;->l:Lio/sentry/android/core/SentryAndroidOptions;

    .line 62
    .line 63
    invoke-virtual {v1}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    iget-object v2, p0, Lio/sentry/android/core/w0;->m:Lio/sentry/android/core/f0;

    .line 68
    .line 69
    invoke-static {v0, v1, v2}, Lio/sentry/android/core/internal/util/h;->b(Landroid/app/Activity;Lio/sentry/g0;Lio/sentry/android/core/f0;)[B

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    if-nez v1, :cond_3

    .line 74
    .line 75
    return-object p1

    .line 76
    :cond_3
    invoke-static {v1}, Lio/sentry/b;->a([B)Lio/sentry/b;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-virtual {p2, v1}, Lio/sentry/v;->i(Lio/sentry/b;)V

    .line 81
    .line 82
    .line 83
    const-string v1, "android:activity"

    .line 84
    .line 85
    invoke-virtual {p2, v1, v0}, Lio/sentry/v;->h(Ljava/lang/String;Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    :cond_4
    :goto_0
    return-object p1
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

.method public close()V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/android/core/w0;->l:Lio/sentry/android/core/SentryAndroidOptions;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/android/core/SentryAndroidOptions;->isAttachScreenshot()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lio/sentry/android/core/w0;->k:Landroid/app/Application;

    .line 10
    .line 11
    invoke-virtual {v0, p0}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 12
    .line 13
    .line 14
    invoke-static {}, Lio/sentry/android/core/i0;->c()Lio/sentry/android/core/i0;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Lio/sentry/android/core/i0;->a()V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
    .line 22
    .line 23
    .line 24
.end method

.method public synthetic f(Lio/sentry/protocol/w;Lio/sentry/v;)Lio/sentry/protocol/w;
    .locals 0

    invoke-static {p0, p1, p2}, Lio/sentry/s;->a(Lio/sentry/t;Lio/sentry/protocol/w;Lio/sentry/v;)Lio/sentry/protocol/w;

    move-result-object p1

    return-object p1
.end method

.method public onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    invoke-static {}, Lio/sentry/android/core/i0;->c()Lio/sentry/android/core/i0;

    move-result-object p2

    invoke-virtual {p2, p1}, Lio/sentry/android/core/i0;->d(Landroid/app/Activity;)V

    return-void
.end method

.method public onActivityDestroyed(Landroid/app/Activity;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/sentry/android/core/w0;->i(Landroid/app/Activity;)V

    return-void
.end method

.method public onActivityPaused(Landroid/app/Activity;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/sentry/android/core/w0;->i(Landroid/app/Activity;)V

    return-void
.end method

.method public onActivityResumed(Landroid/app/Activity;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/sentry/android/core/w0;->k(Landroid/app/Activity;)V

    return-void
.end method

.method public onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public onActivityStarted(Landroid/app/Activity;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/sentry/android/core/w0;->k(Landroid/app/Activity;)V

    return-void
.end method

.method public onActivityStopped(Landroid/app/Activity;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/sentry/android/core/w0;->i(Landroid/app/Activity;)V

    return-void
.end method
