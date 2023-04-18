.class public abstract Lio/sentry/android/core/m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/q0;
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/sentry/android/core/m0$b;
    }
.end annotation


# instance fields
.field private k:Lio/sentry/android/core/l0;

.field private l:Lio/sentry/g0;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static f()Lio/sentry/android/core/m0;
    .locals 2

    new-instance v0, Lio/sentry/android/core/m0$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/sentry/android/core/m0$b;-><init>(Lio/sentry/android/core/m0$a;)V

    return-object v0
.end method


# virtual methods
.method public final b(Lio/sentry/f0;Lio/sentry/o3;)V
    .locals 12

    .line 1
    const-string v0, "Hub is required"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    const-string v0, "SentryOptions is required"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p2}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lio/sentry/android/core/m0;->l:Lio/sentry/g0;

    .line 16
    .line 17
    invoke-virtual {p0, p2}, Lio/sentry/android/core/m0;->i(Lio/sentry/o3;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const/4 v9, 0x0

    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    iget-object v0, p0, Lio/sentry/android/core/m0;->l:Lio/sentry/g0;

    .line 25
    .line 26
    sget-object v1, Lio/sentry/n3;->WARNING:Lio/sentry/n3;

    .line 27
    .line 28
    const-string v2, "Null given as a path to EnvelopeFileObserverIntegration. Nothing will be registered."

    .line 29
    .line 30
    new-array v3, v9, [Ljava/lang/Object;

    .line 31
    .line 32
    invoke-interface {v0, v1, v2, v3}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    iget-object v2, p0, Lio/sentry/android/core/m0;->l:Lio/sentry/g0;

    .line 37
    .line 38
    sget-object v10, Lio/sentry/n3;->DEBUG:Lio/sentry/n3;

    .line 39
    .line 40
    const/4 v4, 0x1

    .line 41
    new-array v4, v4, [Ljava/lang/Object;

    .line 42
    .line 43
    aput-object v0, v4, v9

    .line 44
    .line 45
    const-string v5, "Registering EnvelopeFileObserverIntegration for path: %s"

    .line 46
    .line 47
    invoke-interface {v2, v10, v5, v4}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    new-instance v11, Lio/sentry/u1;

    .line 51
    .line 52
    invoke-virtual {p2}, Lio/sentry/o3;->getEnvelopeReader()Lio/sentry/c0;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    invoke-virtual {p2}, Lio/sentry/o3;->getSerializer()Lio/sentry/l0;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    iget-object v6, p0, Lio/sentry/android/core/m0;->l:Lio/sentry/g0;

    .line 61
    .line 62
    invoke-virtual {p2}, Lio/sentry/o3;->getFlushTimeoutMillis()J

    .line 63
    .line 64
    .line 65
    move-result-wide v7

    .line 66
    move-object v2, v11

    .line 67
    move-object v3, p1

    .line 68
    invoke-direct/range {v2 .. v8}, Lio/sentry/u1;-><init>(Lio/sentry/f0;Lio/sentry/c0;Lio/sentry/l0;Lio/sentry/g0;J)V

    .line 69
    .line 70
    .line 71
    new-instance v8, Lio/sentry/android/core/l0;

    .line 72
    .line 73
    iget-object v5, p0, Lio/sentry/android/core/m0;->l:Lio/sentry/g0;

    .line 74
    .line 75
    invoke-virtual {p2}, Lio/sentry/o3;->getFlushTimeoutMillis()J

    .line 76
    .line 77
    .line 78
    move-result-wide v6

    .line 79
    move-object v2, v8

    .line 80
    move-object v3, v0

    .line 81
    move-object v4, v11

    .line 82
    invoke-direct/range {v2 .. v7}, Lio/sentry/android/core/l0;-><init>(Ljava/lang/String;Lio/sentry/d0;Lio/sentry/g0;J)V

    .line 83
    .line 84
    .line 85
    iput-object v8, p0, Lio/sentry/android/core/m0;->k:Lio/sentry/android/core/l0;

    .line 86
    .line 87
    :try_start_0
    invoke-virtual {v8}, Landroid/os/FileObserver;->startWatching()V

    .line 88
    .line 89
    .line 90
    iget-object v0, p0, Lio/sentry/android/core/m0;->l:Lio/sentry/g0;

    .line 91
    .line 92
    const-string v2, "EnvelopeFileObserverIntegration installed."

    .line 93
    .line 94
    new-array v3, v9, [Ljava/lang/Object;

    .line 95
    .line 96
    invoke-interface {v0, v10, v2, v3}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 97
    .line 98
    .line 99
    goto :goto_0

    .line 100
    :catchall_0
    move-exception v0

    .line 101
    invoke-virtual {p2}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    sget-object v2, Lio/sentry/n3;->ERROR:Lio/sentry/n3;

    .line 106
    .line 107
    const-string v3, "Failed to initialize EnvelopeFileObserverIntegration."

    .line 108
    .line 109
    invoke-interface {v1, v2, v3, v0}, Lio/sentry/g0;->b(Lio/sentry/n3;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 110
    .line 111
    .line 112
    :goto_0
    return-void
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
    iget-object v0, p0, Lio/sentry/android/core/m0;->k:Lio/sentry/android/core/l0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/os/FileObserver;->stopWatching()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lio/sentry/android/core/m0;->l:Lio/sentry/g0;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    sget-object v1, Lio/sentry/n3;->DEBUG:Lio/sentry/n3;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    new-array v2, v2, [Ljava/lang/Object;

    .line 16
    .line 17
    const-string v3, "EnvelopeFileObserverIntegration removed."

    .line 18
    .line 19
    invoke-interface {v0, v1, v3, v2}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
    .line 23
    .line 24
.end method

.method abstract i(Lio/sentry/o3;)Ljava/lang/String;
.end method
