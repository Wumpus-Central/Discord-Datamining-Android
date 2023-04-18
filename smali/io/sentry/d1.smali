.class public final Lio/sentry/d1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/t;
.implements Ljava/io/Closeable;


# instance fields
.field private final k:Lio/sentry/o3;

.field private final l:Lio/sentry/r3;

.field private final m:Lio/sentry/k3;

.field private volatile n:Lio/sentry/y;


# direct methods
.method public constructor <init>(Lio/sentry/o3;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lio/sentry/d1;->n:Lio/sentry/y;

    .line 6
    .line 7
    const-string v0, "The SentryOptions is required."

    .line 8
    .line 9
    invoke-static {p1, v0}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Lio/sentry/o3;

    .line 14
    .line 15
    iput-object p1, p0, Lio/sentry/d1;->k:Lio/sentry/o3;

    .line 16
    .line 17
    new-instance v0, Lio/sentry/q3;

    .line 18
    .line 19
    invoke-virtual {p1}, Lio/sentry/o3;->getInAppExcludes()Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {p1}, Lio/sentry/o3;->getInAppIncludes()Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-direct {v0, v1, v2}, Lio/sentry/q3;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 28
    .line 29
    .line 30
    new-instance v1, Lio/sentry/k3;

    .line 31
    .line 32
    invoke-direct {v1, v0}, Lio/sentry/k3;-><init>(Lio/sentry/q3;)V

    .line 33
    .line 34
    .line 35
    iput-object v1, p0, Lio/sentry/d1;->m:Lio/sentry/k3;

    .line 36
    .line 37
    new-instance v1, Lio/sentry/r3;

    .line 38
    .line 39
    invoke-direct {v1, v0, p1}, Lio/sentry/r3;-><init>(Lio/sentry/q3;Lio/sentry/o3;)V

    .line 40
    .line 41
    .line 42
    iput-object v1, p0, Lio/sentry/d1;->l:Lio/sentry/r3;

    .line 43
    .line 44
    return-void
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
.end method

.method private F(Lio/sentry/j3;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/sentry/d1;->k:Lio/sentry/o3;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/o3;->getModulesLoader()Lio/sentry/internal/modules/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Lio/sentry/internal/modules/a;->a()Ljava/util/Map;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    invoke-virtual {p1}, Lio/sentry/j3;->p0()Ljava/util/Map;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    if-nez v1, :cond_1

    .line 19
    .line 20
    invoke-virtual {p1, v0}, Lio/sentry/j3;->z0(Ljava/util/Map;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    invoke-interface {v1, v0}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    return-void
.end method

.method private K(Lio/sentry/l2;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lio/sentry/l2;->G()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, "java"

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Lio/sentry/l2;->U(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
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

.method private Q(Lio/sentry/l2;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lio/sentry/l2;->H()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lio/sentry/d1;->k:Lio/sentry/o3;

    .line 8
    .line 9
    invoke-virtual {v0}, Lio/sentry/o3;->getRelease()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p1, v0}, Lio/sentry/l2;->V(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
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

.method private T(Lio/sentry/l2;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lio/sentry/l2;->J()Lio/sentry/protocol/n;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lio/sentry/d1;->k:Lio/sentry/o3;

    .line 8
    .line 9
    invoke-virtual {v0}, Lio/sentry/o3;->getSdkVersion()Lio/sentry/protocol/n;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p1, v0}, Lio/sentry/l2;->X(Lio/sentry/protocol/n;)V

    .line 14
    .line 15
    .line 16
    :cond_0
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

.method private g0(Lio/sentry/l2;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lio/sentry/l2;->K()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lio/sentry/d1;->k:Lio/sentry/o3;

    .line 8
    .line 9
    invoke-virtual {v0}, Lio/sentry/o3;->getServerName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p1, v0}, Lio/sentry/l2;->Y(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Lio/sentry/d1;->k:Lio/sentry/o3;

    .line 17
    .line 18
    invoke-virtual {v0}, Lio/sentry/o3;->isAttachServerName()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    invoke-virtual {p1}, Lio/sentry/l2;->K()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    if-nez v0, :cond_1

    .line 29
    .line 30
    invoke-direct {p0}, Lio/sentry/d1;->i()V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Lio/sentry/d1;->n:Lio/sentry/y;

    .line 34
    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    iget-object v0, p0, Lio/sentry/d1;->n:Lio/sentry/y;

    .line 38
    .line 39
    invoke-virtual {v0}, Lio/sentry/y;->d()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {p1, v0}, Lio/sentry/l2;->Y(Ljava/lang/String;)V

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
.end method

.method private h0(Lio/sentry/l2;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Lio/sentry/l2;->L()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Ljava/util/HashMap;

    .line 8
    .line 9
    iget-object v1, p0, Lio/sentry/d1;->k:Lio/sentry/o3;

    .line 10
    .line 11
    invoke-virtual {v1}, Lio/sentry/o3;->getTags()Ljava/util/Map;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, v0}, Lio/sentry/l2;->a0(Ljava/util/Map;)V

    .line 19
    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    iget-object v0, p0, Lio/sentry/d1;->k:Lio/sentry/o3;

    .line 23
    .line 24
    invoke-virtual {v0}, Lio/sentry/o3;->getTags()Ljava/util/Map;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_2

    .line 41
    .line 42
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    check-cast v1, Ljava/util/Map$Entry;

    .line 47
    .line 48
    invoke-virtual {p1}, Lio/sentry/l2;->L()Ljava/util/Map;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    invoke-interface {v2, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    if-nez v2, :cond_1

    .line 61
    .line 62
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    check-cast v2, Ljava/lang/String;

    .line 67
    .line 68
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    check-cast v1, Ljava/lang/String;

    .line 73
    .line 74
    invoke-virtual {p1, v2, v1}, Lio/sentry/l2;->Z(Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_2
    :goto_1
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

.method private i()V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/d1;->n:Lio/sentry/y;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    monitor-enter p0

    .line 6
    :try_start_0
    iget-object v0, p0, Lio/sentry/d1;->n:Lio/sentry/y;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    invoke-static {}, Lio/sentry/y;->e()Lio/sentry/y;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, Lio/sentry/d1;->n:Lio/sentry/y;

    .line 15
    .line 16
    :cond_0
    monitor-exit p0

    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    move-exception v0

    .line 19
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    throw v0

    .line 21
    :cond_1
    :goto_0
    return-void
    .line 22
    .line 23
    .line 24
.end method

.method private i0(Lio/sentry/j3;Lio/sentry/v;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Lio/sentry/j3;->q0()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_5

    .line 6
    .line 7
    invoke-virtual {p1}, Lio/sentry/j3;->n0()Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_2

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-nez v2, :cond_2

    .line 19
    .line 20
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-eqz v3, :cond_2

    .line 29
    .line 30
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    check-cast v3, Lio/sentry/protocol/o;

    .line 35
    .line 36
    invoke-virtual {v3}, Lio/sentry/protocol/o;->g()Lio/sentry/protocol/h;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    if-eqz v4, :cond_0

    .line 41
    .line 42
    invoke-virtual {v3}, Lio/sentry/protocol/o;->h()Ljava/lang/Long;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    if-eqz v4, :cond_0

    .line 47
    .line 48
    if-nez v1, :cond_1

    .line 49
    .line 50
    new-instance v1, Ljava/util/ArrayList;

    .line 51
    .line 52
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 53
    .line 54
    .line 55
    :cond_1
    invoke-virtual {v3}, Lio/sentry/protocol/o;->h()Ljava/lang/Long;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_2
    iget-object v2, p0, Lio/sentry/d1;->k:Lio/sentry/o3;

    .line 64
    .line 65
    invoke-virtual {v2}, Lio/sentry/o3;->isAttachThreads()Z

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    if-eqz v2, :cond_3

    .line 70
    .line 71
    iget-object p2, p0, Lio/sentry/d1;->l:Lio/sentry/r3;

    .line 72
    .line 73
    invoke-virtual {p2, v1}, Lio/sentry/r3;->b(Ljava/util/List;)Ljava/util/List;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    invoke-virtual {p1, p2}, Lio/sentry/j3;->A0(Ljava/util/List;)V

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_3
    iget-object v1, p0, Lio/sentry/d1;->k:Lio/sentry/o3;

    .line 82
    .line 83
    invoke-virtual {v1}, Lio/sentry/o3;->isAttachStacktrace()Z

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    if-eqz v1, :cond_5

    .line 88
    .line 89
    if-eqz v0, :cond_4

    .line 90
    .line 91
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-eqz v0, :cond_5

    .line 96
    .line 97
    :cond_4
    invoke-direct {p0, p2}, Lio/sentry/d1;->k(Lio/sentry/v;)Z

    .line 98
    .line 99
    .line 100
    move-result p2

    .line 101
    if-nez p2, :cond_5

    .line 102
    .line 103
    iget-object p2, p0, Lio/sentry/d1;->l:Lio/sentry/r3;

    .line 104
    .line 105
    invoke-virtual {p2}, Lio/sentry/r3;->a()Ljava/util/List;

    .line 106
    .line 107
    .line 108
    move-result-object p2

    .line 109
    invoke-virtual {p1, p2}, Lio/sentry/j3;->A0(Ljava/util/List;)V

    .line 110
    .line 111
    .line 112
    :cond_5
    :goto_1
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

.method private k(Lio/sentry/v;)Z
    .locals 1

    const-class v0, Lio/sentry/hints/b;

    invoke-static {p1, v0}, Lio/sentry/util/h;->g(Lio/sentry/v;Ljava/lang/Class;)Z

    move-result p1

    return p1
.end method

.method private k0(Lio/sentry/l2;Lio/sentry/v;)Z
    .locals 3

    .line 1
    invoke-static {p2}, Lio/sentry/util/h;->s(Lio/sentry/v;)Z

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    const/4 v0, 0x1

    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    return v0

    .line 9
    :cond_0
    iget-object p2, p0, Lio/sentry/d1;->k:Lio/sentry/o3;

    .line 10
    .line 11
    invoke-virtual {p2}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    sget-object v1, Lio/sentry/n3;->DEBUG:Lio/sentry/n3;

    .line 16
    .line 17
    new-array v0, v0, [Ljava/lang/Object;

    .line 18
    .line 19
    invoke-virtual {p1}, Lio/sentry/l2;->E()Lio/sentry/protocol/p;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const/4 v2, 0x0

    .line 24
    aput-object p1, v0, v2

    .line 25
    .line 26
    const-string p1, "Event was cached so not applying data relevant to the current app execution/version: %s"

    .line 27
    .line 28
    invoke-interface {p2, v1, p1, v0}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    return v2
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

.method private l(Lio/sentry/l2;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/sentry/d1;->k:Lio/sentry/o3;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/o3;->isSendDefaultPii()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {p1}, Lio/sentry/l2;->O()Lio/sentry/protocol/z;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, "{{auto}}"

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    new-instance v0, Lio/sentry/protocol/z;

    .line 18
    .line 19
    invoke-direct {v0}, Lio/sentry/protocol/z;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Lio/sentry/protocol/z;->q(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, v0}, Lio/sentry/l2;->b0(Lio/sentry/protocol/z;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-virtual {p1}, Lio/sentry/l2;->O()Lio/sentry/protocol/z;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v0}, Lio/sentry/protocol/z;->k()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    if-nez v0, :cond_1

    .line 38
    .line 39
    invoke-virtual {p1}, Lio/sentry/l2;->O()Lio/sentry/protocol/z;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p1, v1}, Lio/sentry/protocol/z;->q(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    :cond_1
    :goto_0
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
.end method

.method private p(Lio/sentry/l2;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lio/sentry/d1;->Q(Lio/sentry/l2;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1}, Lio/sentry/d1;->x(Lio/sentry/l2;)V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p1}, Lio/sentry/d1;->g0(Lio/sentry/l2;)V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0, p1}, Lio/sentry/d1;->w(Lio/sentry/l2;)V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0, p1}, Lio/sentry/d1;->T(Lio/sentry/l2;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, p1}, Lio/sentry/d1;->h0(Lio/sentry/l2;)V

    .line 17
    .line 18
    .line 19
    invoke-direct {p0, p1}, Lio/sentry/d1;->l(Lio/sentry/l2;)V

    .line 20
    .line 21
    .line 22
    return-void
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method private s(Lio/sentry/l2;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/sentry/d1;->K(Lio/sentry/l2;)V

    return-void
.end method

.method private v(Lio/sentry/j3;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lio/sentry/d1;->k:Lio/sentry/o3;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/o3;->getProguardUuid()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    invoke-virtual {p1}, Lio/sentry/j3;->m0()Lio/sentry/protocol/d;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    new-instance v0, Lio/sentry/protocol/d;

    .line 16
    .line 17
    invoke-direct {v0}, Lio/sentry/protocol/d;-><init>()V

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-virtual {v0}, Lio/sentry/protocol/d;->c()Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    if-nez v1, :cond_1

    .line 25
    .line 26
    new-instance v1, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1}, Lio/sentry/protocol/d;->d(Ljava/util/List;)V

    .line 32
    .line 33
    .line 34
    :cond_1
    invoke-virtual {v0}, Lio/sentry/protocol/d;->c()Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    if-eqz v1, :cond_2

    .line 39
    .line 40
    new-instance v2, Lio/sentry/protocol/DebugImage;

    .line 41
    .line 42
    invoke-direct {v2}, Lio/sentry/protocol/DebugImage;-><init>()V

    .line 43
    .line 44
    .line 45
    const-string v3, "proguard"

    .line 46
    .line 47
    invoke-virtual {v2, v3}, Lio/sentry/protocol/DebugImage;->setType(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    iget-object v3, p0, Lio/sentry/d1;->k:Lio/sentry/o3;

    .line 51
    .line 52
    invoke-virtual {v3}, Lio/sentry/o3;->getProguardUuid()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    invoke-virtual {v2, v3}, Lio/sentry/protocol/DebugImage;->setUuid(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1, v0}, Lio/sentry/j3;->u0(Lio/sentry/protocol/d;)V

    .line 63
    .line 64
    .line 65
    :cond_2
    return-void
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

.method private w(Lio/sentry/l2;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lio/sentry/l2;->C()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lio/sentry/d1;->k:Lio/sentry/o3;

    .line 8
    .line 9
    invoke-virtual {v0}, Lio/sentry/o3;->getDist()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p1, v0}, Lio/sentry/l2;->Q(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
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

.method private x(Lio/sentry/l2;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lio/sentry/l2;->D()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, Lio/sentry/d1;->k:Lio/sentry/o3;

    .line 8
    .line 9
    invoke-virtual {v0}, Lio/sentry/o3;->getEnvironment()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lio/sentry/d1;->k:Lio/sentry/o3;

    .line 16
    .line 17
    invoke-virtual {v0}, Lio/sentry/o3;->getEnvironment()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const-string v0, "production"

    .line 23
    .line 24
    :goto_0
    invoke-virtual {p1, v0}, Lio/sentry/l2;->R(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    :cond_1
    return-void
.end method

.method private y(Lio/sentry/j3;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lio/sentry/l2;->N()Ljava/lang/Throwable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, Lio/sentry/d1;->m:Lio/sentry/k3;

    .line 8
    .line 9
    invoke-virtual {v1, v0}, Lio/sentry/k3;->c(Ljava/lang/Throwable;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p1, v0}, Lio/sentry/j3;->v0(Ljava/util/List;)V

    .line 14
    .line 15
    .line 16
    :cond_0
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


# virtual methods
.method public b(Lio/sentry/j3;Lio/sentry/v;)Lio/sentry/j3;
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lio/sentry/d1;->s(Lio/sentry/l2;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1}, Lio/sentry/d1;->y(Lio/sentry/j3;)V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p1}, Lio/sentry/d1;->v(Lio/sentry/j3;)V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0, p1}, Lio/sentry/d1;->F(Lio/sentry/j3;)V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0, p1, p2}, Lio/sentry/d1;->k0(Lio/sentry/l2;Lio/sentry/v;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-direct {p0, p1}, Lio/sentry/d1;->p(Lio/sentry/l2;)V

    .line 20
    .line 21
    .line 22
    invoke-direct {p0, p1, p2}, Lio/sentry/d1;->i0(Lio/sentry/j3;Lio/sentry/v;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-object p1
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
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/d1;->n:Lio/sentry/y;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lio/sentry/d1;->n:Lio/sentry/y;

    .line 6
    .line 7
    invoke-virtual {v0}, Lio/sentry/y;->c()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
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
.end method

.method public f(Lio/sentry/protocol/w;Lio/sentry/v;)Lio/sentry/protocol/w;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lio/sentry/d1;->s(Lio/sentry/l2;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1, p2}, Lio/sentry/d1;->k0(Lio/sentry/l2;Lio/sentry/v;)Z

    .line 5
    .line 6
    .line 7
    move-result p2

    .line 8
    if-eqz p2, :cond_0

    .line 9
    .line 10
    invoke-direct {p0, p1}, Lio/sentry/d1;->p(Lio/sentry/l2;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-object p1
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
.end method
