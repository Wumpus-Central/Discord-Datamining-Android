.class public final Lio/sentry/k2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/sentry/k2$a;
    }
.end annotation


# static fields
.field private static final a:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Lio/sentry/f0;",
            ">;"
        }
    .end annotation
.end field

.field private static volatile b:Lio/sentry/f0;

.field private static volatile c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/ThreadLocal;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lio/sentry/k2;->a:Ljava/lang/ThreadLocal;

    .line 7
    .line 8
    invoke-static {}, Lio/sentry/h1;->a()Lio/sentry/h1;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sput-object v0, Lio/sentry/k2;->b:Lio/sentry/f0;

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    sput-boolean v0, Lio/sentry/k2;->c:Z

    .line 16
    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public static synthetic a([Ljava/io/File;)V
    .locals 0

    invoke-static {p0}, Lio/sentry/k2;->s([Ljava/io/File;)V

    return-void
.end method

.method public static b(Lio/sentry/d;)V
    .locals 1

    invoke-static {}, Lio/sentry/k2;->m()Lio/sentry/f0;

    move-result-object v0

    invoke-interface {v0, p0}, Lio/sentry/f0;->e(Lio/sentry/d;)V

    return-void
.end method

.method public static c(Lio/sentry/d;Lio/sentry/v;)V
    .locals 1

    invoke-static {}, Lio/sentry/k2;->m()Lio/sentry/f0;

    move-result-object v0

    invoke-interface {v0, p0, p1}, Lio/sentry/f0;->j(Lio/sentry/d;Lio/sentry/v;)V

    return-void
.end method

.method private static d(Lio/sentry/k2$a;Lio/sentry/o3;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lio/sentry/o3;",
            ">(",
            "Lio/sentry/k2$a<",
            "TT;>;TT;)V"
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-interface {p0, p1}, Lio/sentry/k2$a;->a(Lio/sentry/o3;)V
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
    const-string v1, "Error in the \'OptionsConfiguration.configure\' callback."

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

.method public static e(Lio/sentry/j3;Lio/sentry/v;)Lio/sentry/protocol/p;
    .locals 1

    invoke-static {}, Lio/sentry/k2;->m()Lio/sentry/f0;

    move-result-object v0

    invoke-interface {v0, p0, p1}, Lio/sentry/f0;->y(Lio/sentry/j3;Lio/sentry/v;)Lio/sentry/protocol/p;

    move-result-object p0

    return-object p0
.end method

.method public static f(Ljava/lang/Throwable;)Lio/sentry/protocol/p;
    .locals 1

    invoke-static {}, Lio/sentry/k2;->m()Lio/sentry/f0;

    move-result-object v0

    invoke-interface {v0, p0}, Lio/sentry/f0;->q(Ljava/lang/Throwable;)Lio/sentry/protocol/p;

    move-result-object p0

    return-object p0
.end method

.method public static g(Ljava/lang/Throwable;Lio/sentry/v;)Lio/sentry/protocol/p;
    .locals 1

    invoke-static {}, Lio/sentry/k2;->m()Lio/sentry/f0;

    move-result-object v0

    invoke-interface {v0, p0, p1}, Lio/sentry/f0;->s(Ljava/lang/Throwable;Lio/sentry/v;)Lio/sentry/protocol/p;

    move-result-object p0

    return-object p0
.end method

.method public static h(Ljava/lang/String;Lio/sentry/n3;)Lio/sentry/protocol/p;
    .locals 1

    invoke-static {}, Lio/sentry/k2;->m()Lio/sentry/f0;

    move-result-object v0

    invoke-interface {v0, p0, p1}, Lio/sentry/f0;->t(Ljava/lang/String;Lio/sentry/n3;)Lio/sentry/protocol/p;

    move-result-object p0

    return-object p0
.end method

.method public static declared-synchronized i()V
    .locals 3

    .line 1
    const-class v0, Lio/sentry/k2;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-static {}, Lio/sentry/k2;->m()Lio/sentry/f0;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-static {}, Lio/sentry/h1;->a()Lio/sentry/h1;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    sput-object v2, Lio/sentry/k2;->b:Lio/sentry/f0;

    .line 13
    .line 14
    sget-object v2, Lio/sentry/k2;->a:Ljava/lang/ThreadLocal;

    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/lang/ThreadLocal;->remove()V

    .line 17
    .line 18
    .line 19
    invoke-interface {v1}, Lio/sentry/f0;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    monitor-exit v0

    .line 23
    return-void

    .line 24
    :catchall_0
    move-exception v1

    .line 25
    monitor-exit v0

    .line 26
    throw v1
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

.method public static j(Lio/sentry/b2;)V
    .locals 1

    invoke-static {}, Lio/sentry/k2;->m()Lio/sentry/f0;

    move-result-object v0

    invoke-interface {v0, p0}, Lio/sentry/f0;->k(Lio/sentry/b2;)V

    return-void
.end method

.method public static k()V
    .locals 1

    invoke-static {}, Lio/sentry/k2;->m()Lio/sentry/f0;

    move-result-object v0

    invoke-interface {v0}, Lio/sentry/f0;->v()V

    return-void
.end method

.method public static l(J)V
    .locals 1

    invoke-static {}, Lio/sentry/k2;->m()Lio/sentry/f0;

    move-result-object v0

    invoke-interface {v0, p0, p1}, Lio/sentry/f0;->d(J)V

    return-void
.end method

.method public static m()Lio/sentry/f0;
    .locals 3

    .line 1
    sget-boolean v0, Lio/sentry/k2;->c:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lio/sentry/k2;->b:Lio/sentry/f0;

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    sget-object v0, Lio/sentry/k2;->a:Ljava/lang/ThreadLocal;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, Lio/sentry/f0;

    .line 15
    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    instance-of v2, v1, Lio/sentry/h1;

    .line 19
    .line 20
    if-eqz v2, :cond_2

    .line 21
    .line 22
    :cond_1
    sget-object v1, Lio/sentry/k2;->b:Lio/sentry/f0;

    .line 23
    .line 24
    invoke-interface {v1}, Lio/sentry/f0;->clone()Lio/sentry/f0;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    :cond_2
    return-object v1
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

.method public static n(Lio/sentry/r1;Lio/sentry/k2$a;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lio/sentry/o3;",
            ">(",
            "Lio/sentry/r1<",
            "TT;>;",
            "Lio/sentry/k2$a<",
            "TT;>;Z)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lio/sentry/r1;->b()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lio/sentry/o3;

    .line 6
    .line 7
    invoke-static {p1, p0}, Lio/sentry/k2;->d(Lio/sentry/k2$a;Lio/sentry/o3;)V

    .line 8
    .line 9
    .line 10
    invoke-static {p0, p2}, Lio/sentry/k2;->o(Lio/sentry/o3;Z)V

    .line 11
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

.method private static declared-synchronized o(Lio/sentry/o3;Z)V
    .locals 7

    .line 1
    const-class v0, Lio/sentry/k2;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-static {}, Lio/sentry/k2;->r()Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    const/4 v2, 0x0

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    sget-object v3, Lio/sentry/n3;->WARNING:Lio/sentry/n3;

    .line 16
    .line 17
    const-string v4, "Sentry has been already initialized. Previous configuration will be overwritten."

    .line 18
    .line 19
    new-array v5, v2, [Ljava/lang/Object;

    .line 20
    .line 21
    invoke-interface {v1, v3, v4, v5}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    invoke-static {p0}, Lio/sentry/k2;->p(Lio/sentry/o3;)Z

    .line 25
    .line 26
    .line 27
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    if-nez v1, :cond_1

    .line 29
    .line 30
    monitor-exit v0

    .line 31
    return-void

    .line 32
    :cond_1
    :try_start_1
    invoke-virtual {p0}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    sget-object v3, Lio/sentry/n3;->INFO:Lio/sentry/n3;

    .line 37
    .line 38
    const-string v4, "GlobalHubMode: \'%s\'"

    .line 39
    .line 40
    const/4 v5, 0x1

    .line 41
    new-array v5, v5, [Ljava/lang/Object;

    .line 42
    .line 43
    invoke-static {p1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v6

    .line 47
    aput-object v6, v5, v2

    .line 48
    .line 49
    invoke-interface {v1, v3, v4, v5}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    sput-boolean p1, Lio/sentry/k2;->c:Z

    .line 53
    .line 54
    invoke-static {}, Lio/sentry/k2;->m()Lio/sentry/f0;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    new-instance v1, Lio/sentry/a0;

    .line 59
    .line 60
    invoke-direct {v1, p0}, Lio/sentry/a0;-><init>(Lio/sentry/o3;)V

    .line 61
    .line 62
    .line 63
    sput-object v1, Lio/sentry/k2;->b:Lio/sentry/f0;

    .line 64
    .line 65
    sget-object v1, Lio/sentry/k2;->a:Ljava/lang/ThreadLocal;

    .line 66
    .line 67
    sget-object v2, Lio/sentry/k2;->b:Lio/sentry/f0;

    .line 68
    .line 69
    invoke-virtual {v1, v2}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    invoke-interface {p1}, Lio/sentry/f0;->close()V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0}, Lio/sentry/o3;->getIntegrations()Ljava/util/List;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    if-eqz v1, :cond_2

    .line 88
    .line 89
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    check-cast v1, Lio/sentry/q0;

    .line 94
    .line 95
    invoke-static {}, Lio/sentry/b0;->a()Lio/sentry/b0;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    invoke-interface {v1, v2, p0}, Lio/sentry/q0;->b(Lio/sentry/f0;Lio/sentry/o3;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 100
    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_2
    monitor-exit v0

    .line 104
    return-void

    .line 105
    :catchall_0
    move-exception p0

    .line 106
    monitor-exit v0

    .line 107
    throw p0
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

.method private static p(Lio/sentry/o3;)Z
    .locals 6

    .line 1
    invoke-virtual {p0}, Lio/sentry/o3;->isEnableExternalConfiguration()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {}, Lio/sentry/config/h;->a()Lio/sentry/config/g;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p0}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-static {v0, v1}, Lio/sentry/u;->f(Lio/sentry/config/g;Lio/sentry/g0;)Lio/sentry/u;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {p0, v0}, Lio/sentry/o3;->merge(Lio/sentry/u;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-virtual {p0}, Lio/sentry/o3;->getDsn()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    if-eqz v0, :cond_7

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    const/4 v2, 0x0

    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    invoke-static {}, Lio/sentry/k2;->i()V

    .line 36
    .line 37
    .line 38
    return v2

    .line 39
    :cond_1
    new-instance v1, Lio/sentry/l;

    .line 40
    .line 41
    invoke-direct {v1, v0}, Lio/sentry/l;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {p0}, Lio/sentry/o3;->isDebug()Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_2

    .line 53
    .line 54
    instance-of v1, v0, Lio/sentry/i1;

    .line 55
    .line 56
    if-eqz v1, :cond_2

    .line 57
    .line 58
    new-instance v0, Lio/sentry/j4;

    .line 59
    .line 60
    invoke-direct {v0}, Lio/sentry/j4;-><init>()V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0, v0}, Lio/sentry/o3;->setLogger(Lio/sentry/g0;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    :cond_2
    sget-object v1, Lio/sentry/n3;->INFO:Lio/sentry/n3;

    .line 71
    .line 72
    const/4 v3, 0x1

    .line 73
    new-array v4, v3, [Ljava/lang/Object;

    .line 74
    .line 75
    invoke-virtual {p0}, Lio/sentry/o3;->getDsn()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    aput-object v5, v4, v2

    .line 80
    .line 81
    const-string v5, "Initializing SDK with DSN: \'%s\'"

    .line 82
    .line 83
    invoke-interface {v0, v1, v5, v4}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0}, Lio/sentry/o3;->getOutboxPath()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    if-eqz v4, :cond_3

    .line 91
    .line 92
    new-instance v0, Ljava/io/File;

    .line 93
    .line 94
    invoke-direct {v0, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 98
    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_3
    const-string v4, "No outbox dir path is defined in options."

    .line 102
    .line 103
    new-array v2, v2, [Ljava/lang/Object;

    .line 104
    .line 105
    invoke-interface {v0, v1, v4, v2}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    :goto_0
    invoke-virtual {p0}, Lio/sentry/o3;->getCacheDirPath()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    if-eqz v0, :cond_4

    .line 113
    .line 114
    new-instance v1, Ljava/io/File;

    .line 115
    .line 116
    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    .line 120
    .line 121
    .line 122
    invoke-virtual {p0}, Lio/sentry/o3;->getEnvelopeDiskCache()Lio/sentry/cache/e;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    instance-of v0, v0, Lio/sentry/transport/r;

    .line 127
    .line 128
    if-eqz v0, :cond_4

    .line 129
    .line 130
    invoke-static {p0}, Lio/sentry/cache/d;->z(Lio/sentry/o3;)Lio/sentry/cache/e;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    invoke-virtual {p0, v0}, Lio/sentry/o3;->setEnvelopeDiskCache(Lio/sentry/cache/e;)V

    .line 135
    .line 136
    .line 137
    :cond_4
    invoke-virtual {p0}, Lio/sentry/o3;->getProfilingTracesDirPath()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    invoke-virtual {p0}, Lio/sentry/o3;->isProfilingEnabled()Z

    .line 142
    .line 143
    .line 144
    move-result v1

    .line 145
    if-eqz v1, :cond_5

    .line 146
    .line 147
    if-eqz v0, :cond_5

    .line 148
    .line 149
    new-instance v1, Ljava/io/File;

    .line 150
    .line 151
    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    .line 155
    .line 156
    .line 157
    invoke-virtual {v1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    invoke-virtual {p0}, Lio/sentry/o3;->getExecutorService()Lio/sentry/k0;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    new-instance v2, Lio/sentry/j2;

    .line 166
    .line 167
    invoke-direct {v2, v0}, Lio/sentry/j2;-><init>([Ljava/io/File;)V

    .line 168
    .line 169
    .line 170
    invoke-interface {v1, v2}, Lio/sentry/k0;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 171
    .line 172
    .line 173
    :cond_5
    invoke-virtual {p0}, Lio/sentry/o3;->getModulesLoader()Lio/sentry/internal/modules/a;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    instance-of v0, v0, Lio/sentry/internal/modules/c;

    .line 178
    .line 179
    if-eqz v0, :cond_6

    .line 180
    .line 181
    new-instance v0, Lio/sentry/internal/modules/d;

    .line 182
    .line 183
    invoke-virtual {p0}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    invoke-direct {v0, v1}, Lio/sentry/internal/modules/d;-><init>(Lio/sentry/g0;)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {p0, v0}, Lio/sentry/o3;->setModulesLoader(Lio/sentry/internal/modules/a;)V

    .line 191
    .line 192
    .line 193
    :cond_6
    return v3

    .line 194
    :cond_7
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 195
    .line 196
    const-string v0, "DSN is required. Use empty string to disable SDK."

    .line 197
    .line 198
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    throw p0
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
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
.end method

.method public static q()Ljava/lang/Boolean;
    .locals 1

    invoke-static {}, Lio/sentry/k2;->m()Lio/sentry/f0;

    move-result-object v0

    invoke-interface {v0}, Lio/sentry/f0;->m()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public static r()Z
    .locals 1

    invoke-static {}, Lio/sentry/k2;->m()Lio/sentry/f0;

    move-result-object v0

    invoke-interface {v0}, Lio/sentry/f0;->isEnabled()Z

    move-result v0

    return v0
.end method

.method private static synthetic s([Ljava/io/File;)V
    .locals 3

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    array-length v0, p0

    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    if-ge v1, v0, :cond_1

    .line 7
    .line 8
    aget-object v2, p0, v1

    .line 9
    .line 10
    invoke-static {v2}, Lio/sentry/util/c;->a(Ljava/io/File;)Z

    .line 11
    .line 12
    .line 13
    add-int/lit8 v1, v1, 0x1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
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
.end method

.method public static t()V
    .locals 1

    invoke-static {}, Lio/sentry/k2;->m()Lio/sentry/f0;

    move-result-object v0

    invoke-interface {v0}, Lio/sentry/f0;->x()V

    return-void
.end method

.method public static u(Lio/sentry/n4;Lio/sentry/f;Z)Lio/sentry/m0;
    .locals 1

    .line 1
    invoke-static {}, Lio/sentry/k2;->m()Lio/sentry/f0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p0, p1, p2}, Lio/sentry/f0;->l(Lio/sentry/n4;Lio/sentry/f;Z)Lio/sentry/m0;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
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

.method public static v(Lio/sentry/n4;Lio/sentry/p4;)Lio/sentry/m0;
    .locals 1

    invoke-static {}, Lio/sentry/k2;->m()Lio/sentry/f0;

    move-result-object v0

    invoke-interface {v0, p0, p1}, Lio/sentry/f0;->h(Lio/sentry/n4;Lio/sentry/p4;)Lio/sentry/m0;

    move-result-object p0

    return-object p0
.end method

.method public static w(Ljava/lang/String;Ljava/lang/String;)Lio/sentry/m0;
    .locals 1

    invoke-static {}, Lio/sentry/k2;->m()Lio/sentry/f0;

    move-result-object v0

    invoke-interface {v0, p0, p1}, Lio/sentry/f0;->g(Ljava/lang/String;Ljava/lang/String;)Lio/sentry/m0;

    move-result-object p0

    return-object p0
.end method

.method public static x(Lio/sentry/b2;)V
    .locals 1

    invoke-static {}, Lio/sentry/k2;->m()Lio/sentry/f0;

    move-result-object v0

    invoke-interface {v0, p0}, Lio/sentry/f0;->p(Lio/sentry/b2;)V

    return-void
.end method
