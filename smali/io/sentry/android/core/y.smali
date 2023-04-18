.class public final Lio/sentry/android/core/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/q0;
.implements Ljava/io/Closeable;


# static fields
.field private static m:Lio/sentry/android/core/b;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "StaticFieldLeak"
        }
    .end annotation
.end field

.field private static final n:Ljava/lang/Object;


# instance fields
.field private final k:Landroid/content/Context;

.field private l:Lio/sentry/o3;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/sentry/android/core/y;->n:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/sentry/android/core/y;->k:Landroid/content/Context;

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

.method public static synthetic f(Lio/sentry/android/core/y;Lio/sentry/f0;Lio/sentry/android/core/SentryAndroidOptions;Lio/sentry/android/core/e0;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lio/sentry/android/core/y;->i(Lio/sentry/f0;Lio/sentry/android/core/SentryAndroidOptions;Lio/sentry/android/core/e0;)V

    return-void
.end method

.method private synthetic i(Lio/sentry/f0;Lio/sentry/android/core/SentryAndroidOptions;Lio/sentry/android/core/e0;)V
    .locals 0

    invoke-virtual {p2}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    move-result-object p2

    invoke-virtual {p0, p1, p2, p3}, Lio/sentry/android/core/y;->l(Lio/sentry/f0;Lio/sentry/g0;Lio/sentry/android/core/e0;)V

    return-void
.end method

.method private k(Lio/sentry/f0;Lio/sentry/android/core/SentryAndroidOptions;)V
    .locals 15

    .line 1
    move-object v1, p0

    .line 2
    invoke-virtual/range {p2 .. p2}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    sget-object v2, Lio/sentry/n3;->DEBUG:Lio/sentry/n3;

    .line 7
    .line 8
    const-string v3, "AnrIntegration enabled: %s"

    .line 9
    .line 10
    const/4 v4, 0x1

    .line 11
    new-array v5, v4, [Ljava/lang/Object;

    .line 12
    .line 13
    invoke-virtual/range {p2 .. p2}, Lio/sentry/android/core/SentryAndroidOptions;->isAnrEnabled()Z

    .line 14
    .line 15
    .line 16
    move-result v6

    .line 17
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 18
    .line 19
    .line 20
    move-result-object v6

    .line 21
    const/4 v7, 0x0

    .line 22
    aput-object v6, v5, v7

    .line 23
    .line 24
    invoke-interface {v0, v2, v3, v5}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual/range {p2 .. p2}, Lio/sentry/android/core/SentryAndroidOptions;->isAnrEnabled()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    sget-object v3, Lio/sentry/android/core/y;->n:Ljava/lang/Object;

    .line 34
    .line 35
    monitor-enter v3

    .line 36
    :try_start_0
    sget-object v0, Lio/sentry/android/core/y;->m:Lio/sentry/android/core/b;

    .line 37
    .line 38
    if-nez v0, :cond_0

    .line 39
    .line 40
    invoke-virtual/range {p2 .. p2}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    const-string v5, "ANR timeout in milliseconds: %d"

    .line 45
    .line 46
    new-array v4, v4, [Ljava/lang/Object;

    .line 47
    .line 48
    invoke-virtual/range {p2 .. p2}, Lio/sentry/android/core/SentryAndroidOptions;->getAnrTimeoutIntervalMillis()J

    .line 49
    .line 50
    .line 51
    move-result-wide v8

    .line 52
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 53
    .line 54
    .line 55
    move-result-object v6

    .line 56
    aput-object v6, v4, v7

    .line 57
    .line 58
    invoke-interface {v0, v2, v5, v4}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    new-instance v0, Lio/sentry/android/core/b;

    .line 62
    .line 63
    invoke-virtual/range {p2 .. p2}, Lio/sentry/android/core/SentryAndroidOptions;->getAnrTimeoutIntervalMillis()J

    .line 64
    .line 65
    .line 66
    move-result-wide v9

    .line 67
    invoke-virtual/range {p2 .. p2}, Lio/sentry/android/core/SentryAndroidOptions;->isAnrReportInDebug()Z

    .line 68
    .line 69
    .line 70
    move-result v11

    .line 71
    new-instance v12, Lio/sentry/android/core/x;

    .line 72
    .line 73
    move-object/from16 v4, p1

    .line 74
    .line 75
    move-object/from16 v5, p2

    .line 76
    .line 77
    invoke-direct {v12, p0, v4, v5}, Lio/sentry/android/core/x;-><init>(Lio/sentry/android/core/y;Lio/sentry/f0;Lio/sentry/android/core/SentryAndroidOptions;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual/range {p2 .. p2}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 81
    .line 82
    .line 83
    move-result-object v13

    .line 84
    iget-object v14, v1, Lio/sentry/android/core/y;->k:Landroid/content/Context;

    .line 85
    .line 86
    move-object v8, v0

    .line 87
    invoke-direct/range {v8 .. v14}, Lio/sentry/android/core/b;-><init>(JZLio/sentry/android/core/b$a;Lio/sentry/g0;Landroid/content/Context;)V

    .line 88
    .line 89
    .line 90
    sput-object v0, Lio/sentry/android/core/y;->m:Lio/sentry/android/core/b;

    .line 91
    .line 92
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 93
    .line 94
    .line 95
    invoke-virtual/range {p2 .. p2}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    const-string v4, "AnrIntegration installed."

    .line 100
    .line 101
    new-array v5, v7, [Ljava/lang/Object;

    .line 102
    .line 103
    invoke-interface {v0, v2, v4, v5}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    :cond_0
    monitor-exit v3

    .line 107
    goto :goto_0

    .line 108
    :catchall_0
    move-exception v0

    .line 109
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 110
    throw v0

    .line 111
    :cond_1
    :goto_0
    return-void
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


# virtual methods
.method public final b(Lio/sentry/f0;Lio/sentry/o3;)V
    .locals 1

    .line 1
    const-string v0, "SentryOptions is required"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lio/sentry/o3;

    .line 8
    .line 9
    iput-object v0, p0, Lio/sentry/android/core/y;->l:Lio/sentry/o3;

    .line 10
    .line 11
    check-cast p2, Lio/sentry/android/core/SentryAndroidOptions;

    .line 12
    .line 13
    invoke-direct {p0, p1, p2}, Lio/sentry/android/core/y;->k(Lio/sentry/f0;Lio/sentry/android/core/SentryAndroidOptions;)V

    .line 14
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

.method public close()V
    .locals 5

    .line 1
    sget-object v0, Lio/sentry/android/core/y;->n:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lio/sentry/android/core/y;->m:Lio/sentry/android/core/b;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    .line 9
    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    sput-object v1, Lio/sentry/android/core/y;->m:Lio/sentry/android/core/b;

    .line 13
    .line 14
    iget-object v1, p0, Lio/sentry/android/core/y;->l:Lio/sentry/o3;

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-virtual {v1}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    sget-object v2, Lio/sentry/n3;->DEBUG:Lio/sentry/n3;

    .line 23
    .line 24
    const-string v3, "AnrIntegration removed."

    .line 25
    .line 26
    const/4 v4, 0x0

    .line 27
    new-array v4, v4, [Ljava/lang/Object;

    .line 28
    .line 29
    invoke-interface {v1, v2, v3, v4}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    monitor-exit v0

    .line 33
    return-void

    .line 34
    :catchall_0
    move-exception v1

    .line 35
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    throw v1
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

.method l(Lio/sentry/f0;Lio/sentry/g0;Lio/sentry/android/core/e0;)V
    .locals 5

    .line 1
    sget-object v0, Lio/sentry/n3;->INFO:Lio/sentry/n3;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    new-array v2, v1, [Ljava/lang/Object;

    .line 5
    .line 6
    invoke-virtual {p3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v3

    .line 10
    const/4 v4, 0x0

    .line 11
    aput-object v3, v2, v4

    .line 12
    .line 13
    const-string v3, "ANR triggered with message: %s"

    .line 14
    .line 15
    invoke-interface {p2, v0, v3, v2}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    new-instance p2, Lio/sentry/protocol/h;

    .line 19
    .line 20
    invoke-direct {p2}, Lio/sentry/protocol/h;-><init>()V

    .line 21
    .line 22
    .line 23
    const-string v0, "ANR"

    .line 24
    .line 25
    invoke-virtual {p2, v0}, Lio/sentry/protocol/h;->j(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    new-instance v0, Lio/sentry/exception/a;

    .line 29
    .line 30
    invoke-virtual {p3}, Lio/sentry/android/core/e0;->a()Ljava/lang/Thread;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-direct {v0, p2, p3, v2, v1}, Lio/sentry/exception/a;-><init>(Lio/sentry/protocol/h;Ljava/lang/Throwable;Ljava/lang/Thread;Z)V

    .line 35
    .line 36
    .line 37
    invoke-interface {p1, v0}, Lio/sentry/f0;->q(Ljava/lang/Throwable;)Lio/sentry/protocol/p;

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
