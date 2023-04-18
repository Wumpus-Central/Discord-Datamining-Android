.class public final Lio/sentry/android/core/e1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/q0;
.implements Ljava/io/Closeable;
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# instance fields
.field private final k:Landroid/app/Application;

.field private l:Lio/sentry/f0;

.field private m:Lio/sentry/android/core/SentryAndroidOptions;

.field private final n:Z

.field private final o:Z


# direct methods
.method public constructor <init>(Landroid/app/Application;Lio/sentry/android/core/p0;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "Application is required"

    .line 5
    .line 6
    invoke-static {p1, v0}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, Landroid/app/Application;

    .line 11
    .line 12
    iput-object p1, p0, Lio/sentry/android/core/e1;->k:Landroid/app/Application;

    .line 13
    .line 14
    const-string p1, "androidx.core.view.GestureDetectorCompat"

    .line 15
    .line 16
    iget-object v0, p0, Lio/sentry/android/core/e1;->m:Lio/sentry/android/core/SentryAndroidOptions;

    .line 17
    .line 18
    invoke-virtual {p2, p1, v0}, Lio/sentry/android/core/p0;->b(Ljava/lang/String;Lio/sentry/o3;)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    iput-boolean p1, p0, Lio/sentry/android/core/e1;->n:Z

    .line 23
    .line 24
    const-string p1, "androidx.core.view.ScrollingView"

    .line 25
    .line 26
    iget-object v0, p0, Lio/sentry/android/core/e1;->m:Lio/sentry/android/core/SentryAndroidOptions;

    .line 27
    .line 28
    invoke-virtual {p2, p1, v0}, Lio/sentry/android/core/p0;->b(Ljava/lang/String;Lio/sentry/o3;)Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    iput-boolean p1, p0, Lio/sentry/android/core/e1;->o:Z

    .line 33
    .line 34
    return-void
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

.method private f(Landroid/app/Activity;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    iget-object p1, p0, Lio/sentry/android/core/e1;->m:Lio/sentry/android/core/SentryAndroidOptions;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    sget-object v0, Lio/sentry/n3;->INFO:Lio/sentry/n3;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    new-array v1, v1, [Ljava/lang/Object;

    .line 19
    .line 20
    const-string v2, "Window was null in startTracking"

    .line 21
    .line 22
    invoke-interface {p1, v0, v2, v1}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void

    .line 26
    :cond_1
    iget-object v1, p0, Lio/sentry/android/core/e1;->l:Lio/sentry/f0;

    .line 27
    .line 28
    if-eqz v1, :cond_3

    .line 29
    .line 30
    iget-object v1, p0, Lio/sentry/android/core/e1;->m:Lio/sentry/android/core/SentryAndroidOptions;

    .line 31
    .line 32
    if-eqz v1, :cond_3

    .line 33
    .line 34
    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    if-nez v1, :cond_2

    .line 39
    .line 40
    new-instance v1, Lio/sentry/android/core/internal/gestures/a;

    .line 41
    .line 42
    invoke-direct {v1}, Lio/sentry/android/core/internal/gestures/a;-><init>()V

    .line 43
    .line 44
    .line 45
    :cond_2
    new-instance v2, Lio/sentry/android/core/internal/gestures/g;

    .line 46
    .line 47
    iget-object v3, p0, Lio/sentry/android/core/e1;->l:Lio/sentry/f0;

    .line 48
    .line 49
    iget-object v4, p0, Lio/sentry/android/core/e1;->m:Lio/sentry/android/core/SentryAndroidOptions;

    .line 50
    .line 51
    iget-boolean v5, p0, Lio/sentry/android/core/e1;->o:Z

    .line 52
    .line 53
    invoke-direct {v2, p1, v3, v4, v5}, Lio/sentry/android/core/internal/gestures/g;-><init>(Landroid/app/Activity;Lio/sentry/f0;Lio/sentry/android/core/SentryAndroidOptions;Z)V

    .line 54
    .line 55
    .line 56
    new-instance v3, Lio/sentry/android/core/internal/gestures/h;

    .line 57
    .line 58
    iget-object v4, p0, Lio/sentry/android/core/e1;->m:Lio/sentry/android/core/SentryAndroidOptions;

    .line 59
    .line 60
    invoke-direct {v3, v1, p1, v2, v4}, Lio/sentry/android/core/internal/gestures/h;-><init>(Landroid/view/Window$Callback;Landroid/content/Context;Lio/sentry/android/core/internal/gestures/g;Lio/sentry/o3;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v3}, Landroid/view/Window;->setCallback(Landroid/view/Window$Callback;)V

    .line 64
    .line 65
    .line 66
    :cond_3
    return-void
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

.method private i(Landroid/app/Activity;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-nez p1, :cond_1

    .line 6
    .line 7
    iget-object p1, p0, Lio/sentry/android/core/e1;->m:Lio/sentry/android/core/SentryAndroidOptions;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    sget-object v0, Lio/sentry/n3;->INFO:Lio/sentry/n3;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    new-array v1, v1, [Ljava/lang/Object;

    .line 19
    .line 20
    const-string v2, "Window was null in stopTracking"

    .line 21
    .line 22
    invoke-interface {p1, v0, v2, v1}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void

    .line 26
    :cond_1
    invoke-virtual {p1}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    instance-of v1, v0, Lio/sentry/android/core/internal/gestures/h;

    .line 31
    .line 32
    if-eqz v1, :cond_3

    .line 33
    .line 34
    check-cast v0, Lio/sentry/android/core/internal/gestures/h;

    .line 35
    .line 36
    invoke-virtual {v0}, Lio/sentry/android/core/internal/gestures/h;->c()V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Lio/sentry/android/core/internal/gestures/h;->a()Landroid/view/Window$Callback;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    instance-of v1, v1, Lio/sentry/android/core/internal/gestures/a;

    .line 44
    .line 45
    if-eqz v1, :cond_2

    .line 46
    .line 47
    const/4 v0, 0x0

    .line 48
    invoke-virtual {p1, v0}, Landroid/view/Window;->setCallback(Landroid/view/Window$Callback;)V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_2
    invoke-virtual {v0}, Lio/sentry/android/core/internal/gestures/h;->a()Landroid/view/Window$Callback;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {p1, v0}, Landroid/view/Window;->setCallback(Landroid/view/Window$Callback;)V

    .line 57
    .line 58
    .line 59
    :cond_3
    :goto_0
    return-void
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
    instance-of v0, p2, Lio/sentry/android/core/SentryAndroidOptions;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lio/sentry/android/core/SentryAndroidOptions;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    const-string v1, "SentryAndroidOptions is required"

    .line 11
    .line 12
    invoke-static {v0, v1}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Lio/sentry/android/core/SentryAndroidOptions;

    .line 17
    .line 18
    iput-object v0, p0, Lio/sentry/android/core/e1;->m:Lio/sentry/android/core/SentryAndroidOptions;

    .line 19
    .line 20
    const-string v0, "Hub is required"

    .line 21
    .line 22
    invoke-static {p1, v0}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, Lio/sentry/f0;

    .line 27
    .line 28
    iput-object p1, p0, Lio/sentry/android/core/e1;->l:Lio/sentry/f0;

    .line 29
    .line 30
    iget-object p1, p0, Lio/sentry/android/core/e1;->m:Lio/sentry/android/core/SentryAndroidOptions;

    .line 31
    .line 32
    invoke-virtual {p1}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    sget-object v0, Lio/sentry/n3;->DEBUG:Lio/sentry/n3;

    .line 37
    .line 38
    const/4 v1, 0x1

    .line 39
    new-array v1, v1, [Ljava/lang/Object;

    .line 40
    .line 41
    iget-object v2, p0, Lio/sentry/android/core/e1;->m:Lio/sentry/android/core/SentryAndroidOptions;

    .line 42
    .line 43
    invoke-virtual {v2}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableUserInteractionBreadcrumbs()Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    const/4 v3, 0x0

    .line 52
    aput-object v2, v1, v3

    .line 53
    .line 54
    const-string v2, "UserInteractionIntegration enabled: %s"

    .line 55
    .line 56
    invoke-interface {p1, v0, v2, v1}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    iget-object p1, p0, Lio/sentry/android/core/e1;->m:Lio/sentry/android/core/SentryAndroidOptions;

    .line 60
    .line 61
    invoke-virtual {p1}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableUserInteractionBreadcrumbs()Z

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    if-eqz p1, :cond_2

    .line 66
    .line 67
    iget-boolean p1, p0, Lio/sentry/android/core/e1;->n:Z

    .line 68
    .line 69
    if-eqz p1, :cond_1

    .line 70
    .line 71
    iget-object p1, p0, Lio/sentry/android/core/e1;->k:Landroid/app/Application;

    .line 72
    .line 73
    invoke-virtual {p1, p0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 74
    .line 75
    .line 76
    iget-object p1, p0, Lio/sentry/android/core/e1;->m:Lio/sentry/android/core/SentryAndroidOptions;

    .line 77
    .line 78
    invoke-virtual {p1}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    const-string p2, "UserInteractionIntegration installed."

    .line 83
    .line 84
    new-array v1, v3, [Ljava/lang/Object;

    .line 85
    .line 86
    invoke-interface {p1, v0, p2, v1}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_1
    invoke-virtual {p2}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    sget-object p2, Lio/sentry/n3;->INFO:Lio/sentry/n3;

    .line 95
    .line 96
    const-string v0, "androidx.core is not available, UserInteractionIntegration won\'t be installed"

    .line 97
    .line 98
    new-array v1, v3, [Ljava/lang/Object;

    .line 99
    .line 100
    invoke-interface {p1, p2, v0, v1}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    :cond_2
    :goto_1
    return-void
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
    .locals 4

    .line 1
    iget-object v0, p0, Lio/sentry/android/core/e1;->k:Landroid/app/Application;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lio/sentry/android/core/e1;->m:Lio/sentry/android/core/SentryAndroidOptions;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sget-object v1, Lio/sentry/n3;->DEBUG:Lio/sentry/n3;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    new-array v2, v2, [Ljava/lang/Object;

    .line 18
    .line 19
    const-string v3, "UserInteractionIntegration removed."

    .line 20
    .line 21
    invoke-interface {v0, v1, v3, v2}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method public onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public onActivityDestroyed(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public onActivityPaused(Landroid/app/Activity;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/sentry/android/core/e1;->i(Landroid/app/Activity;)V

    return-void
.end method

.method public onActivityResumed(Landroid/app/Activity;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/sentry/android/core/e1;->f(Landroid/app/Activity;)V

    return-void
.end method

.method public onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public onActivityStarted(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public onActivityStopped(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method
