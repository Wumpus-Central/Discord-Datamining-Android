.class public final Lio/sentry/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/f0;


# instance fields
.field private volatile a:Lio/sentry/protocol/p;

.field private final b:Lio/sentry/o3;

.field private volatile c:Z

.field private final d:Lio/sentry/g4;

.field private final e:Lio/sentry/l4;

.field private final f:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Throwable;",
            "Lio/sentry/util/l<",
            "Ljava/lang/ref/WeakReference<",
            "Lio/sentry/ISpan;",
            ">;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/sentry/o3;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lio/sentry/a0;->C(Lio/sentry/o3;)Lio/sentry/g4$a;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lio/sentry/a0;-><init>(Lio/sentry/o3;Lio/sentry/g4$a;)V

    return-void
.end method

.method private constructor <init>(Lio/sentry/o3;Lio/sentry/g4$a;)V
    .locals 2

    .line 11
    new-instance v0, Lio/sentry/g4;

    invoke-virtual {p1}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    move-result-object v1

    invoke-direct {v0, v1, p2}, Lio/sentry/g4;-><init>(Lio/sentry/g0;Lio/sentry/g4$a;)V

    invoke-direct {p0, p1, v0}, Lio/sentry/a0;-><init>(Lio/sentry/o3;Lio/sentry/g4;)V

    return-void
.end method

.method private constructor <init>(Lio/sentry/o3;Lio/sentry/g4;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 4
    invoke-static {v0}, Lj$/util/DesugarCollections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lio/sentry/a0;->f:Ljava/util/Map;

    .line 5
    invoke-static {p1}, Lio/sentry/a0;->H(Lio/sentry/o3;)V

    .line 6
    iput-object p1, p0, Lio/sentry/a0;->b:Lio/sentry/o3;

    .line 7
    new-instance v0, Lio/sentry/l4;

    invoke-direct {v0, p1}, Lio/sentry/l4;-><init>(Lio/sentry/o3;)V

    iput-object v0, p0, Lio/sentry/a0;->e:Lio/sentry/l4;

    .line 8
    iput-object p2, p0, Lio/sentry/a0;->d:Lio/sentry/g4;

    .line 9
    sget-object p1, Lio/sentry/protocol/p;->l:Lio/sentry/protocol/p;

    iput-object p1, p0, Lio/sentry/a0;->a:Lio/sentry/protocol/p;

    const/4 p1, 0x1

    .line 10
    iput-boolean p1, p0, Lio/sentry/a0;->c:Z

    return-void
.end method

.method private A(Ljava/lang/Throwable;Lio/sentry/v;Lio/sentry/b2;)Lio/sentry/protocol/p;
    .locals 4

    .line 1
    sget-object v0, Lio/sentry/protocol/p;->l:Lio/sentry/protocol/p;

    .line 2
    .line 3
    invoke-virtual {p0}, Lio/sentry/a0;->isEnabled()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    iget-object p1, p0, Lio/sentry/a0;->b:Lio/sentry/o3;

    .line 11
    .line 12
    invoke-virtual {p1}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    sget-object p2, Lio/sentry/n3;->WARNING:Lio/sentry/n3;

    .line 17
    .line 18
    const-string p3, "Instance is disabled and this \'captureException\' call is a no-op."

    .line 19
    .line 20
    new-array v1, v2, [Ljava/lang/Object;

    .line 21
    .line 22
    invoke-interface {p1, p2, p3, v1}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    if-nez p1, :cond_1

    .line 27
    .line 28
    iget-object p1, p0, Lio/sentry/a0;->b:Lio/sentry/o3;

    .line 29
    .line 30
    invoke-virtual {p1}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    sget-object p2, Lio/sentry/n3;->WARNING:Lio/sentry/n3;

    .line 35
    .line 36
    const-string p3, "captureException called with null parameter."

    .line 37
    .line 38
    new-array v1, v2, [Ljava/lang/Object;

    .line 39
    .line 40
    invoke-interface {p1, p2, p3, v1}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    :try_start_0
    iget-object v1, p0, Lio/sentry/a0;->d:Lio/sentry/g4;

    .line 45
    .line 46
    invoke-virtual {v1}, Lio/sentry/g4;->a()Lio/sentry/g4$a;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    new-instance v2, Lio/sentry/j3;

    .line 51
    .line 52
    invoke-direct {v2, p1}, Lio/sentry/j3;-><init>(Ljava/lang/Throwable;)V

    .line 53
    .line 54
    .line 55
    invoke-direct {p0, v2}, Lio/sentry/a0;->b(Lio/sentry/j3;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1}, Lio/sentry/g4$a;->c()Lio/sentry/Scope;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    invoke-direct {p0, v3, p3}, Lio/sentry/a0;->c(Lio/sentry/Scope;Lio/sentry/b2;)Lio/sentry/Scope;

    .line 63
    .line 64
    .line 65
    move-result-object p3

    .line 66
    invoke-virtual {v1}, Lio/sentry/g4$a;->a()Lio/sentry/j0;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-interface {v1, v2, p3, p2}, Lio/sentry/j0;->e(Lio/sentry/j3;Lio/sentry/Scope;Lio/sentry/v;)Lio/sentry/protocol/p;

    .line 71
    .line 72
    .line 73
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 74
    goto :goto_0

    .line 75
    :catchall_0
    move-exception p2

    .line 76
    iget-object p3, p0, Lio/sentry/a0;->b:Lio/sentry/o3;

    .line 77
    .line 78
    invoke-virtual {p3}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 79
    .line 80
    .line 81
    move-result-object p3

    .line 82
    sget-object v1, Lio/sentry/n3;->ERROR:Lio/sentry/n3;

    .line 83
    .line 84
    new-instance v2, Ljava/lang/StringBuilder;

    .line 85
    .line 86
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 87
    .line 88
    .line 89
    const-string v3, "Error while capturing exception: "

    .line 90
    .line 91
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-interface {p3, v1, p1, p2}, Lio/sentry/g0;->b(Lio/sentry/n3;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 106
    .line 107
    .line 108
    :goto_0
    iput-object v0, p0, Lio/sentry/a0;->a:Lio/sentry/protocol/p;

    .line 109
    .line 110
    return-object v0
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

.method private B(Ljava/lang/String;Lio/sentry/n3;Lio/sentry/b2;)Lio/sentry/protocol/p;
    .locals 4

    .line 1
    sget-object v0, Lio/sentry/protocol/p;->l:Lio/sentry/protocol/p;

    .line 2
    .line 3
    invoke-virtual {p0}, Lio/sentry/a0;->isEnabled()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    iget-object p1, p0, Lio/sentry/a0;->b:Lio/sentry/o3;

    .line 11
    .line 12
    invoke-virtual {p1}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    sget-object p2, Lio/sentry/n3;->WARNING:Lio/sentry/n3;

    .line 17
    .line 18
    const-string p3, "Instance is disabled and this \'captureMessage\' call is a no-op."

    .line 19
    .line 20
    new-array v1, v2, [Ljava/lang/Object;

    .line 21
    .line 22
    invoke-interface {p1, p2, p3, v1}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    if-nez p1, :cond_1

    .line 27
    .line 28
    iget-object p1, p0, Lio/sentry/a0;->b:Lio/sentry/o3;

    .line 29
    .line 30
    invoke-virtual {p1}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    sget-object p2, Lio/sentry/n3;->WARNING:Lio/sentry/n3;

    .line 35
    .line 36
    const-string p3, "captureMessage called with null parameter."

    .line 37
    .line 38
    new-array v1, v2, [Ljava/lang/Object;

    .line 39
    .line 40
    invoke-interface {p1, p2, p3, v1}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    :try_start_0
    iget-object v1, p0, Lio/sentry/a0;->d:Lio/sentry/g4;

    .line 45
    .line 46
    invoke-virtual {v1}, Lio/sentry/g4;->a()Lio/sentry/g4$a;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-virtual {v1}, Lio/sentry/g4$a;->c()Lio/sentry/Scope;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-direct {p0, v2, p3}, Lio/sentry/a0;->c(Lio/sentry/Scope;Lio/sentry/b2;)Lio/sentry/Scope;

    .line 55
    .line 56
    .line 57
    move-result-object p3

    .line 58
    invoke-virtual {v1}, Lio/sentry/g4$a;->a()Lio/sentry/j0;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-interface {v1, p1, p2, p3}, Lio/sentry/j0;->g(Ljava/lang/String;Lio/sentry/n3;Lio/sentry/Scope;)Lio/sentry/protocol/p;

    .line 63
    .line 64
    .line 65
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 66
    goto :goto_0

    .line 67
    :catchall_0
    move-exception p2

    .line 68
    iget-object p3, p0, Lio/sentry/a0;->b:Lio/sentry/o3;

    .line 69
    .line 70
    invoke-virtual {p3}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 71
    .line 72
    .line 73
    move-result-object p3

    .line 74
    sget-object v1, Lio/sentry/n3;->ERROR:Lio/sentry/n3;

    .line 75
    .line 76
    new-instance v2, Ljava/lang/StringBuilder;

    .line 77
    .line 78
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 79
    .line 80
    .line 81
    const-string v3, "Error while capturing message: "

    .line 82
    .line 83
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-interface {p3, v1, p1, p2}, Lio/sentry/g0;->b(Lio/sentry/n3;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 94
    .line 95
    .line 96
    :goto_0
    iput-object v0, p0, Lio/sentry/a0;->a:Lio/sentry/protocol/p;

    .line 97
    .line 98
    return-object v0
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

.method private static C(Lio/sentry/o3;)Lio/sentry/g4$a;
    .locals 3

    .line 1
    invoke-static {p0}, Lio/sentry/a0;->H(Lio/sentry/o3;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lio/sentry/Scope;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lio/sentry/Scope;-><init>(Lio/sentry/o3;)V

    .line 7
    .line 8
    .line 9
    new-instance v1, Lio/sentry/o2;

    .line 10
    .line 11
    invoke-direct {v1, p0}, Lio/sentry/o2;-><init>(Lio/sentry/o3;)V

    .line 12
    .line 13
    .line 14
    new-instance v2, Lio/sentry/g4$a;

    .line 15
    .line 16
    invoke-direct {v2, p0, v1, v0}, Lio/sentry/g4$a;-><init>(Lio/sentry/o3;Lio/sentry/j0;Lio/sentry/Scope;)V

    .line 17
    .line 18
    .line 19
    return-object v2
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method private D(Lio/sentry/n4;Lio/sentry/f;ZLjava/util/Date;ZLjava/lang/Long;ZLio/sentry/o4;)Lio/sentry/m0;
    .locals 11

    .line 1
    move-object v8, p0

    .line 2
    move-object v1, p1

    .line 3
    const-string v0, "transactionContext is required"

    .line 4
    .line 5
    invoke-static {p1, v0}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lio/sentry/a0;->isEnabled()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v2, 0x0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    iget-object v0, v8, Lio/sentry/a0;->b:Lio/sentry/o3;

    .line 16
    .line 17
    invoke-virtual {v0}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sget-object v1, Lio/sentry/n3;->WARNING:Lio/sentry/n3;

    .line 22
    .line 23
    const-string v3, "Instance is disabled and this \'startTransaction\' returns a no-op."

    .line 24
    .line 25
    new-array v2, v2, [Ljava/lang/Object;

    .line 26
    .line 27
    invoke-interface {v0, v1, v3, v2}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    invoke-static {}, Lio/sentry/o1;->n()Lio/sentry/o1;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    goto/16 :goto_0

    .line 35
    .line 36
    :cond_0
    iget-object v0, v8, Lio/sentry/a0;->b:Lio/sentry/o3;

    .line 37
    .line 38
    invoke-virtual {v0}, Lio/sentry/o3;->getInstrumenter()Lio/sentry/p0;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {p1}, Lio/sentry/n4;->p()Lio/sentry/p0;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-nez v0, :cond_1

    .line 51
    .line 52
    iget-object v0, v8, Lio/sentry/a0;->b:Lio/sentry/o3;

    .line 53
    .line 54
    invoke-virtual {v0}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    sget-object v3, Lio/sentry/n3;->DEBUG:Lio/sentry/n3;

    .line 59
    .line 60
    const/4 v4, 0x2

    .line 61
    new-array v4, v4, [Ljava/lang/Object;

    .line 62
    .line 63
    invoke-virtual {p1}, Lio/sentry/n4;->p()Lio/sentry/p0;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    aput-object v1, v4, v2

    .line 68
    .line 69
    iget-object v1, v8, Lio/sentry/a0;->b:Lio/sentry/o3;

    .line 70
    .line 71
    invoke-virtual {v1}, Lio/sentry/o3;->getInstrumenter()Lio/sentry/p0;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    const/4 v2, 0x1

    .line 76
    aput-object v1, v4, v2

    .line 77
    .line 78
    const-string v1, "Returning no-op for instrumenter %s as the SDK has been configured to use instrumenter %s"

    .line 79
    .line 80
    invoke-interface {v0, v3, v1, v4}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    invoke-static {}, Lio/sentry/o1;->n()Lio/sentry/o1;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    goto :goto_0

    .line 88
    :cond_1
    iget-object v0, v8, Lio/sentry/a0;->b:Lio/sentry/o3;

    .line 89
    .line 90
    invoke-virtual {v0}, Lio/sentry/o3;->isTracingEnabled()Z

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    if-nez v0, :cond_2

    .line 95
    .line 96
    iget-object v0, v8, Lio/sentry/a0;->b:Lio/sentry/o3;

    .line 97
    .line 98
    invoke-virtual {v0}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    sget-object v1, Lio/sentry/n3;->INFO:Lio/sentry/n3;

    .line 103
    .line 104
    const-string v3, "Tracing is disabled and this \'startTransaction\' returns a no-op."

    .line 105
    .line 106
    new-array v2, v2, [Ljava/lang/Object;

    .line 107
    .line 108
    invoke-interface {v0, v1, v3, v2}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    invoke-static {}, Lio/sentry/o1;->n()Lio/sentry/o1;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    goto :goto_0

    .line 116
    :cond_2
    new-instance v0, Lio/sentry/a2;

    .line 117
    .line 118
    move-object v2, p2

    .line 119
    invoke-direct {v0, p1, p2}, Lio/sentry/a2;-><init>(Lio/sentry/n4;Lio/sentry/f;)V

    .line 120
    .line 121
    .line 122
    iget-object v2, v8, Lio/sentry/a0;->e:Lio/sentry/l4;

    .line 123
    .line 124
    invoke-virtual {v2, v0}, Lio/sentry/l4;->a(Lio/sentry/a2;)Lio/sentry/m4;

    .line 125
    .line 126
    .line 127
    move-result-object v9

    .line 128
    invoke-virtual {p1, v9}, Lio/sentry/c4;->l(Lio/sentry/m4;)V

    .line 129
    .line 130
    .line 131
    new-instance v10, Lio/sentry/w3;

    .line 132
    .line 133
    move-object v0, v10

    .line 134
    move-object v1, p1

    .line 135
    move-object v2, p0

    .line 136
    move-object v3, p4

    .line 137
    move/from16 v4, p5

    .line 138
    .line 139
    move-object/from16 v5, p6

    .line 140
    .line 141
    move/from16 v6, p7

    .line 142
    .line 143
    move-object/from16 v7, p8

    .line 144
    .line 145
    invoke-direct/range {v0 .. v7}, Lio/sentry/w3;-><init>(Lio/sentry/n4;Lio/sentry/f0;Ljava/util/Date;ZLjava/lang/Long;ZLio/sentry/o4;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v9}, Lio/sentry/m4;->c()Ljava/lang/Boolean;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 153
    .line 154
    .line 155
    move-result v0

    .line 156
    if-eqz v0, :cond_3

    .line 157
    .line 158
    invoke-virtual {v9}, Lio/sentry/m4;->a()Ljava/lang/Boolean;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    if-eqz v0, :cond_3

    .line 167
    .line 168
    iget-object v0, v8, Lio/sentry/a0;->b:Lio/sentry/o3;

    .line 169
    .line 170
    invoke-virtual {v0}, Lio/sentry/o3;->getTransactionProfiler()Lio/sentry/n0;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    invoke-interface {v0, v10}, Lio/sentry/n0;->a(Lio/sentry/m0;)V

    .line 175
    .line 176
    .line 177
    :cond_3
    move-object v0, v10

    .line 178
    :goto_0
    if-eqz p3, :cond_4

    .line 179
    .line 180
    new-instance v1, Lio/sentry/z;

    .line 181
    .line 182
    invoke-direct {v1, v0}, Lio/sentry/z;-><init>(Lio/sentry/m0;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {p0, v1}, Lio/sentry/a0;->k(Lio/sentry/b2;)V

    .line 186
    .line 187
    .line 188
    :cond_4
    return-object v0
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
    .line 201
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
.end method

.method private static synthetic E(Lio/sentry/m0;Lio/sentry/Scope;)V
    .locals 0

    invoke-virtual {p1, p0}, Lio/sentry/Scope;->x(Lio/sentry/m0;)V

    return-void
.end method

.method private static H(Lio/sentry/o3;)V
    .locals 1

    .line 1
    const-string v0, "SentryOptions is required."

    .line 2
    .line 3
    invoke-static {p0, v0}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lio/sentry/o3;->getDsn()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Lio/sentry/o3;->getDsn()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    if-nez p0, :cond_0

    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 24
    .line 25
    const-string v0, "Hub requires a DSN to be instantiated. Considering using the NoOpHub if no DSN is available."

    .line 26
    .line 27
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw p0
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
.end method

.method public static synthetic a(Lio/sentry/m0;Lio/sentry/Scope;)V
    .locals 0

    invoke-static {p0, p1}, Lio/sentry/a0;->E(Lio/sentry/m0;Lio/sentry/Scope;)V

    return-void
.end method

.method private b(Lio/sentry/j3;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lio/sentry/a0;->b:Lio/sentry/o3;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/o3;->isTracingEnabled()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {p1}, Lio/sentry/l2;->M()Ljava/lang/Throwable;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-object v0, p0, Lio/sentry/a0;->f:Ljava/util/Map;

    .line 16
    .line 17
    invoke-virtual {p1}, Lio/sentry/l2;->M()Ljava/lang/Throwable;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-static {v1}, Lio/sentry/util/b;->a(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Lio/sentry/util/l;

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    invoke-virtual {v0}, Lio/sentry/util/l;->a()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, Ljava/lang/ref/WeakReference;

    .line 38
    .line 39
    invoke-virtual {p1}, Lio/sentry/l2;->B()Lio/sentry/protocol/c;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-virtual {v2}, Lio/sentry/protocol/c;->f()Lio/sentry/c4;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    if-nez v2, :cond_0

    .line 48
    .line 49
    if-eqz v1, :cond_0

    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    check-cast v1, Lio/sentry/ISpan;

    .line 56
    .line 57
    if-eqz v1, :cond_0

    .line 58
    .line 59
    invoke-virtual {p1}, Lio/sentry/l2;->B()Lio/sentry/protocol/c;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-interface {v1}, Lio/sentry/ISpan;->l()Lio/sentry/c4;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-virtual {v2, v1}, Lio/sentry/protocol/c;->n(Lio/sentry/c4;)V

    .line 68
    .line 69
    .line 70
    :cond_0
    invoke-virtual {v0}, Lio/sentry/util/l;->b()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    check-cast v0, Ljava/lang/String;

    .line 75
    .line 76
    invoke-virtual {p1}, Lio/sentry/j3;->r0()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    if-nez v1, :cond_1

    .line 81
    .line 82
    if-eqz v0, :cond_1

    .line 83
    .line 84
    invoke-virtual {p1, v0}, Lio/sentry/j3;->B0(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    :cond_1
    return-void
    .line 88
    .line 89
    .line 90
.end method

.method private c(Lio/sentry/Scope;Lio/sentry/b2;)Lio/sentry/Scope;
    .locals 3

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    :try_start_0
    new-instance v0, Lio/sentry/Scope;

    .line 4
    .line 5
    invoke-direct {v0, p1}, Lio/sentry/Scope;-><init>(Lio/sentry/Scope;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p2, v0}, Lio/sentry/b2;->a(Lio/sentry/Scope;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    .line 11
    return-object v0

    .line 12
    :catchall_0
    move-exception p2

    .line 13
    iget-object v0, p0, Lio/sentry/a0;->b:Lio/sentry/o3;

    .line 14
    .line 15
    invoke-virtual {v0}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sget-object v1, Lio/sentry/n3;->ERROR:Lio/sentry/n3;

    .line 20
    .line 21
    const-string v2, "Error in the \'ScopeCallback\' callback."

    .line 22
    .line 23
    invoke-interface {v0, v1, v2, p2}, Lio/sentry/g0;->b(Lio/sentry/n3;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-object p1
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

.method private z(Lio/sentry/j3;Lio/sentry/v;Lio/sentry/b2;)Lio/sentry/protocol/p;
    .locals 4

    .line 1
    sget-object v0, Lio/sentry/protocol/p;->l:Lio/sentry/protocol/p;

    .line 2
    .line 3
    invoke-virtual {p0}, Lio/sentry/a0;->isEnabled()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    iget-object p1, p0, Lio/sentry/a0;->b:Lio/sentry/o3;

    .line 11
    .line 12
    invoke-virtual {p1}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    sget-object p2, Lio/sentry/n3;->WARNING:Lio/sentry/n3;

    .line 17
    .line 18
    const-string p3, "Instance is disabled and this \'captureEvent\' call is a no-op."

    .line 19
    .line 20
    new-array v1, v2, [Ljava/lang/Object;

    .line 21
    .line 22
    invoke-interface {p1, p2, p3, v1}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    if-nez p1, :cond_1

    .line 27
    .line 28
    iget-object p1, p0, Lio/sentry/a0;->b:Lio/sentry/o3;

    .line 29
    .line 30
    invoke-virtual {p1}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    sget-object p2, Lio/sentry/n3;->WARNING:Lio/sentry/n3;

    .line 35
    .line 36
    const-string p3, "captureEvent called with null parameter."

    .line 37
    .line 38
    new-array v1, v2, [Ljava/lang/Object;

    .line 39
    .line 40
    invoke-interface {p1, p2, p3, v1}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    :try_start_0
    invoke-direct {p0, p1}, Lio/sentry/a0;->b(Lio/sentry/j3;)V

    .line 45
    .line 46
    .line 47
    iget-object v1, p0, Lio/sentry/a0;->d:Lio/sentry/g4;

    .line 48
    .line 49
    invoke-virtual {v1}, Lio/sentry/g4;->a()Lio/sentry/g4$a;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-virtual {v1}, Lio/sentry/g4$a;->c()Lio/sentry/Scope;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-direct {p0, v2, p3}, Lio/sentry/a0;->c(Lio/sentry/Scope;Lio/sentry/b2;)Lio/sentry/Scope;

    .line 58
    .line 59
    .line 60
    move-result-object p3

    .line 61
    invoke-virtual {v1}, Lio/sentry/g4$a;->a()Lio/sentry/j0;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-interface {v1, p1, p3, p2}, Lio/sentry/j0;->e(Lio/sentry/j3;Lio/sentry/Scope;Lio/sentry/v;)Lio/sentry/protocol/p;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    iput-object v0, p0, Lio/sentry/a0;->a:Lio/sentry/protocol/p;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :catchall_0
    move-exception p2

    .line 73
    iget-object p3, p0, Lio/sentry/a0;->b:Lio/sentry/o3;

    .line 74
    .line 75
    invoke-virtual {p3}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 76
    .line 77
    .line 78
    move-result-object p3

    .line 79
    sget-object v1, Lio/sentry/n3;->ERROR:Lio/sentry/n3;

    .line 80
    .line 81
    new-instance v2, Ljava/lang/StringBuilder;

    .line 82
    .line 83
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 84
    .line 85
    .line 86
    const-string v3, "Error while capturing event with id: "

    .line 87
    .line 88
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1}, Lio/sentry/l2;->E()Lio/sentry/protocol/p;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    invoke-interface {p3, v1, p1, p2}, Lio/sentry/g0;->b(Lio/sentry/n3;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 103
    .line 104
    .line 105
    :goto_0
    return-object v0
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


# virtual methods
.method public F()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lio/sentry/a0;->isEnabled()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lio/sentry/a0;->b:Lio/sentry/o3;

    .line 8
    .line 9
    invoke-virtual {v0}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sget-object v1, Lio/sentry/n3;->WARNING:Lio/sentry/n3;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    new-array v2, v2, [Ljava/lang/Object;

    .line 17
    .line 18
    const-string v3, "Instance is disabled and this \'popScope\' call is a no-op."

    .line 19
    .line 20
    invoke-interface {v0, v1, v3, v2}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget-object v0, p0, Lio/sentry/a0;->d:Lio/sentry/g4;

    .line 25
    .line 26
    invoke-virtual {v0}, Lio/sentry/g4;->b()V

    .line 27
    .line 28
    .line 29
    :goto_0
    return-void
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

.method public G()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lio/sentry/a0;->isEnabled()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lio/sentry/a0;->b:Lio/sentry/o3;

    .line 8
    .line 9
    invoke-virtual {v0}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sget-object v1, Lio/sentry/n3;->WARNING:Lio/sentry/n3;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    new-array v2, v2, [Ljava/lang/Object;

    .line 17
    .line 18
    const-string v3, "Instance is disabled and this \'pushScope\' call is a no-op."

    .line 19
    .line 20
    invoke-interface {v0, v1, v3, v2}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget-object v0, p0, Lio/sentry/a0;->d:Lio/sentry/g4;

    .line 25
    .line 26
    invoke-virtual {v0}, Lio/sentry/g4;->a()Lio/sentry/g4$a;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    new-instance v1, Lio/sentry/g4$a;

    .line 31
    .line 32
    iget-object v2, p0, Lio/sentry/a0;->b:Lio/sentry/o3;

    .line 33
    .line 34
    invoke-virtual {v0}, Lio/sentry/g4$a;->a()Lio/sentry/j0;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    new-instance v4, Lio/sentry/Scope;

    .line 39
    .line 40
    invoke-virtual {v0}, Lio/sentry/g4$a;->c()Lio/sentry/Scope;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-direct {v4, v0}, Lio/sentry/Scope;-><init>(Lio/sentry/Scope;)V

    .line 45
    .line 46
    .line 47
    invoke-direct {v1, v2, v3, v4}, Lio/sentry/g4$a;-><init>(Lio/sentry/o3;Lio/sentry/j0;Lio/sentry/Scope;)V

    .line 48
    .line 49
    .line 50
    iget-object v0, p0, Lio/sentry/a0;->d:Lio/sentry/g4;

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Lio/sentry/g4;->c(Lio/sentry/g4$a;)V

    .line 53
    .line 54
    .line 55
    :goto_0
    return-void
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

.method public clone()Lio/sentry/f0;
    .locals 4

    .line 2
    invoke-virtual {p0}, Lio/sentry/a0;->isEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    iget-object v0, p0, Lio/sentry/a0;->b:Lio/sentry/o3;

    invoke-virtual {v0}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    move-result-object v0

    sget-object v1, Lio/sentry/n3;->WARNING:Lio/sentry/n3;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Disabled Hub cloned."

    invoke-interface {v0, v1, v3, v2}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4
    :cond_0
    new-instance v0, Lio/sentry/a0;

    iget-object v1, p0, Lio/sentry/a0;->b:Lio/sentry/o3;

    new-instance v2, Lio/sentry/g4;

    iget-object v3, p0, Lio/sentry/a0;->d:Lio/sentry/g4;

    invoke-direct {v2, v3}, Lio/sentry/g4;-><init>(Lio/sentry/g4;)V

    invoke-direct {v0, v1, v2}, Lio/sentry/a0;-><init>(Lio/sentry/o3;Lio/sentry/g4;)V

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lio/sentry/a0;->clone()Lio/sentry/f0;

    move-result-object v0

    return-object v0
.end method

.method public close()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lio/sentry/a0;->isEnabled()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lio/sentry/a0;->b:Lio/sentry/o3;

    .line 9
    .line 10
    invoke-virtual {v0}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sget-object v2, Lio/sentry/n3;->WARNING:Lio/sentry/n3;

    .line 15
    .line 16
    const-string v3, "Instance is disabled and this \'close\' call is a no-op."

    .line 17
    .line 18
    new-array v1, v1, [Ljava/lang/Object;

    .line 19
    .line 20
    invoke-interface {v0, v2, v3, v1}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    goto :goto_2

    .line 24
    :cond_0
    :try_start_0
    iget-object v0, p0, Lio/sentry/a0;->b:Lio/sentry/o3;

    .line 25
    .line 26
    invoke-virtual {v0}, Lio/sentry/o3;->getIntegrations()Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_2

    .line 39
    .line 40
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    check-cast v2, Lio/sentry/q0;

    .line 45
    .line 46
    instance-of v3, v2, Ljava/io/Closeable;

    .line 47
    .line 48
    if-eqz v3, :cond_1

    .line 49
    .line 50
    check-cast v2, Ljava/io/Closeable;

    .line 51
    .line 52
    invoke-interface {v2}, Ljava/io/Closeable;->close()V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_2
    iget-object v0, p0, Lio/sentry/a0;->b:Lio/sentry/o3;

    .line 57
    .line 58
    invoke-virtual {v0}, Lio/sentry/o3;->getExecutorService()Lio/sentry/k0;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    iget-object v2, p0, Lio/sentry/a0;->b:Lio/sentry/o3;

    .line 63
    .line 64
    invoke-virtual {v2}, Lio/sentry/o3;->getShutdownTimeoutMillis()J

    .line 65
    .line 66
    .line 67
    move-result-wide v2

    .line 68
    invoke-interface {v0, v2, v3}, Lio/sentry/k0;->a(J)V

    .line 69
    .line 70
    .line 71
    iget-object v0, p0, Lio/sentry/a0;->d:Lio/sentry/g4;

    .line 72
    .line 73
    invoke-virtual {v0}, Lio/sentry/g4;->a()Lio/sentry/g4$a;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {v0}, Lio/sentry/g4$a;->a()Lio/sentry/j0;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-interface {v0}, Lio/sentry/j0;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :catchall_0
    move-exception v0

    .line 86
    iget-object v2, p0, Lio/sentry/a0;->b:Lio/sentry/o3;

    .line 87
    .line 88
    invoke-virtual {v2}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    sget-object v3, Lio/sentry/n3;->ERROR:Lio/sentry/n3;

    .line 93
    .line 94
    const-string v4, "Error while closing the Hub."

    .line 95
    .line 96
    invoke-interface {v2, v3, v4, v0}, Lio/sentry/g0;->b(Lio/sentry/n3;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 97
    .line 98
    .line 99
    :goto_1
    iput-boolean v1, p0, Lio/sentry/a0;->c:Z

    .line 100
    .line 101
    :goto_2
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
    .line 201
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
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
.end method

.method public d(J)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lio/sentry/a0;->isEnabled()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, Lio/sentry/a0;->b:Lio/sentry/o3;

    .line 8
    .line 9
    invoke-virtual {p1}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    sget-object p2, Lio/sentry/n3;->WARNING:Lio/sentry/n3;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    new-array v0, v0, [Ljava/lang/Object;

    .line 17
    .line 18
    const-string v1, "Instance is disabled and this \'flush\' call is a no-op."

    .line 19
    .line 20
    invoke-interface {p1, p2, v1, v0}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    :try_start_0
    iget-object v0, p0, Lio/sentry/a0;->d:Lio/sentry/g4;

    .line 25
    .line 26
    invoke-virtual {v0}, Lio/sentry/g4;->a()Lio/sentry/g4$a;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, Lio/sentry/g4$a;->a()Lio/sentry/j0;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-interface {v0, p1, p2}, Lio/sentry/j0;->d(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :catchall_0
    move-exception p1

    .line 39
    iget-object p2, p0, Lio/sentry/a0;->b:Lio/sentry/o3;

    .line 40
    .line 41
    invoke-virtual {p2}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    sget-object v0, Lio/sentry/n3;->ERROR:Lio/sentry/n3;

    .line 46
    .line 47
    const-string v1, "Error in the \'client.flush\'."

    .line 48
    .line 49
    invoke-interface {p2, v0, v1, p1}, Lio/sentry/g0;->b(Lio/sentry/n3;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 50
    .line 51
    .line 52
    :goto_0
    return-void
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

.method public synthetic e(Lio/sentry/d;)V
    .locals 0

    invoke-static {p0, p1}, Lio/sentry/e0;->a(Lio/sentry/f0;Lio/sentry/d;)V

    return-void
.end method

.method public f(Lio/sentry/q2;Lio/sentry/v;)Lio/sentry/protocol/p;
    .locals 3

    .line 1
    const-string v0, "SentryEnvelope is required."

    .line 2
    .line 3
    invoke-static {p1, v0}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    sget-object v0, Lio/sentry/protocol/p;->l:Lio/sentry/protocol/p;

    .line 7
    .line 8
    invoke-virtual {p0}, Lio/sentry/a0;->isEnabled()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    iget-object p1, p0, Lio/sentry/a0;->b:Lio/sentry/o3;

    .line 15
    .line 16
    invoke-virtual {p1}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    sget-object p2, Lio/sentry/n3;->WARNING:Lio/sentry/n3;

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    new-array v1, v1, [Ljava/lang/Object;

    .line 24
    .line 25
    const-string v2, "Instance is disabled and this \'captureEnvelope\' call is a no-op."

    .line 26
    .line 27
    invoke-interface {p1, p2, v2, v1}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    :try_start_0
    iget-object v1, p0, Lio/sentry/a0;->d:Lio/sentry/g4;

    .line 32
    .line 33
    invoke-virtual {v1}, Lio/sentry/g4;->a()Lio/sentry/g4$a;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v1}, Lio/sentry/g4$a;->a()Lio/sentry/j0;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-interface {v1, p1, p2}, Lio/sentry/j0;->f(Lio/sentry/q2;Lio/sentry/v;)Lio/sentry/protocol/p;

    .line 42
    .line 43
    .line 44
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    if-eqz p1, :cond_1

    .line 46
    .line 47
    move-object v0, p1

    .line 48
    goto :goto_0

    .line 49
    :catchall_0
    move-exception p1

    .line 50
    iget-object p2, p0, Lio/sentry/a0;->b:Lio/sentry/o3;

    .line 51
    .line 52
    invoke-virtual {p2}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    sget-object v1, Lio/sentry/n3;->ERROR:Lio/sentry/n3;

    .line 57
    .line 58
    const-string v2, "Error while capturing envelope."

    .line 59
    .line 60
    invoke-interface {p2, v1, v2, p1}, Lio/sentry/g0;->b(Lio/sentry/n3;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 61
    .line 62
    .line 63
    :cond_1
    :goto_0
    return-object v0
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

.method public synthetic g(Ljava/lang/String;Ljava/lang/String;)Lio/sentry/m0;
    .locals 0

    invoke-static {p0, p1, p2}, Lio/sentry/e0;->d(Lio/sentry/f0;Ljava/lang/String;Ljava/lang/String;)Lio/sentry/m0;

    move-result-object p1

    return-object p1
.end method

.method public h(Lio/sentry/n4;Lio/sentry/p4;)Lio/sentry/m0;
    .locals 9

    .line 1
    invoke-virtual {p2}, Lio/sentry/p4;->a()Lio/sentry/f;

    .line 2
    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-virtual {p2}, Lio/sentry/p4;->e()Z

    .line 6
    .line 7
    .line 8
    move-result v3

    .line 9
    invoke-virtual {p2}, Lio/sentry/p4;->c()Ljava/util/Date;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    invoke-virtual {p2}, Lio/sentry/p4;->g()Z

    .line 14
    .line 15
    .line 16
    move-result v5

    .line 17
    invoke-virtual {p2}, Lio/sentry/p4;->b()Ljava/lang/Long;

    .line 18
    .line 19
    .line 20
    move-result-object v6

    .line 21
    invoke-virtual {p2}, Lio/sentry/p4;->f()Z

    .line 22
    .line 23
    .line 24
    move-result v7

    .line 25
    invoke-virtual {p2}, Lio/sentry/p4;->d()Lio/sentry/o4;

    .line 26
    .line 27
    .line 28
    move-result-object v8

    .line 29
    move-object v0, p0

    .line 30
    move-object v1, p1

    .line 31
    invoke-direct/range {v0 .. v8}, Lio/sentry/a0;->D(Lio/sentry/n4;Lio/sentry/f;ZLjava/util/Date;ZLjava/lang/Long;ZLio/sentry/o4;)Lio/sentry/m0;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1
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

.method public i(Lio/sentry/protocol/w;Lio/sentry/k4;Lio/sentry/v;)Lio/sentry/protocol/p;
    .locals 5

    .line 1
    const-string v0, "transaction is required"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    sget-object v0, Lio/sentry/protocol/p;->l:Lio/sentry/protocol/p;

    .line 7
    .line 8
    invoke-virtual {p0}, Lio/sentry/a0;->isEnabled()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const/4 v2, 0x0

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    iget-object p1, p0, Lio/sentry/a0;->b:Lio/sentry/o3;

    .line 16
    .line 17
    invoke-virtual {p1}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    sget-object p2, Lio/sentry/n3;->WARNING:Lio/sentry/n3;

    .line 22
    .line 23
    const-string p3, "Instance is disabled and this \'captureTransaction\' call is a no-op."

    .line 24
    .line 25
    new-array v1, v2, [Ljava/lang/Object;

    .line 26
    .line 27
    invoke-interface {p1, p2, p3, v1}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    goto/16 :goto_0

    .line 31
    .line 32
    :cond_0
    invoke-virtual {p1}, Lio/sentry/protocol/w;->m0()Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    const/4 v3, 0x1

    .line 37
    if-nez v1, :cond_1

    .line 38
    .line 39
    iget-object p2, p0, Lio/sentry/a0;->b:Lio/sentry/o3;

    .line 40
    .line 41
    invoke-virtual {p2}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    sget-object p3, Lio/sentry/n3;->WARNING:Lio/sentry/n3;

    .line 46
    .line 47
    new-array v1, v3, [Ljava/lang/Object;

    .line 48
    .line 49
    invoke-virtual {p1}, Lio/sentry/l2;->E()Lio/sentry/protocol/p;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    aput-object p1, v1, v2

    .line 54
    .line 55
    const-string p1, "Transaction: %s is not finished and this \'captureTransaction\' call is a no-op."

    .line 56
    .line 57
    invoke-interface {p2, p3, p1, v1}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 62
    .line 63
    invoke-virtual {p1}, Lio/sentry/protocol/w;->n0()Z

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    invoke-virtual {v1, v4}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-nez v1, :cond_2

    .line 76
    .line 77
    iget-object p2, p0, Lio/sentry/a0;->b:Lio/sentry/o3;

    .line 78
    .line 79
    invoke-virtual {p2}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    sget-object p3, Lio/sentry/n3;->DEBUG:Lio/sentry/n3;

    .line 84
    .line 85
    new-array v1, v3, [Ljava/lang/Object;

    .line 86
    .line 87
    invoke-virtual {p1}, Lio/sentry/l2;->E()Lio/sentry/protocol/p;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    aput-object p1, v1, v2

    .line 92
    .line 93
    const-string p1, "Transaction %s was dropped due to sampling decision."

    .line 94
    .line 95
    invoke-interface {p2, p3, p1, v1}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    iget-object p1, p0, Lio/sentry/a0;->b:Lio/sentry/o3;

    .line 99
    .line 100
    invoke-virtual {p1}, Lio/sentry/o3;->getClientReportRecorder()Lio/sentry/clientreport/g;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    sget-object p2, Lio/sentry/clientreport/e;->SAMPLE_RATE:Lio/sentry/clientreport/e;

    .line 105
    .line 106
    sget-object p3, Lio/sentry/g;->Transaction:Lio/sentry/g;

    .line 107
    .line 108
    invoke-interface {p1, p2, p3}, Lio/sentry/clientreport/g;->a(Lio/sentry/clientreport/e;Lio/sentry/g;)V

    .line 109
    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_2
    :try_start_0
    iget-object v1, p0, Lio/sentry/a0;->d:Lio/sentry/g4;

    .line 113
    .line 114
    invoke-virtual {v1}, Lio/sentry/g4;->a()Lio/sentry/g4$a;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    invoke-virtual {v1}, Lio/sentry/g4$a;->a()Lio/sentry/j0;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    invoke-virtual {v1}, Lio/sentry/g4$a;->c()Lio/sentry/Scope;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    invoke-interface {v2, p1, p2, v1, p3}, Lio/sentry/j0;->b(Lio/sentry/protocol/w;Lio/sentry/k4;Lio/sentry/Scope;Lio/sentry/v;)Lio/sentry/protocol/p;

    .line 127
    .line 128
    .line 129
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 130
    goto :goto_0

    .line 131
    :catchall_0
    move-exception p2

    .line 132
    iget-object p3, p0, Lio/sentry/a0;->b:Lio/sentry/o3;

    .line 133
    .line 134
    invoke-virtual {p3}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 135
    .line 136
    .line 137
    move-result-object p3

    .line 138
    sget-object v1, Lio/sentry/n3;->ERROR:Lio/sentry/n3;

    .line 139
    .line 140
    new-instance v2, Ljava/lang/StringBuilder;

    .line 141
    .line 142
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 143
    .line 144
    .line 145
    const-string v3, "Error while capturing transaction with id: "

    .line 146
    .line 147
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {p1}, Lio/sentry/l2;->E()Lio/sentry/protocol/p;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    invoke-interface {p3, v1, p1, p2}, Lio/sentry/g0;->b(Lio/sentry/n3;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 162
    .line 163
    .line 164
    :goto_0
    return-object v0
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
    .line 201
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
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
.end method

.method public isEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/a0;->c:Z

    return v0
.end method

.method public j(Lio/sentry/d;Lio/sentry/v;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lio/sentry/a0;->isEnabled()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    iget-object p1, p0, Lio/sentry/a0;->b:Lio/sentry/o3;

    .line 9
    .line 10
    invoke-virtual {p1}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    sget-object p2, Lio/sentry/n3;->WARNING:Lio/sentry/n3;

    .line 15
    .line 16
    const-string v0, "Instance is disabled and this \'addBreadcrumb\' call is a no-op."

    .line 17
    .line 18
    new-array v1, v1, [Ljava/lang/Object;

    .line 19
    .line 20
    invoke-interface {p1, p2, v0, v1}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    if-nez p1, :cond_1

    .line 25
    .line 26
    iget-object p1, p0, Lio/sentry/a0;->b:Lio/sentry/o3;

    .line 27
    .line 28
    invoke-virtual {p1}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    sget-object p2, Lio/sentry/n3;->WARNING:Lio/sentry/n3;

    .line 33
    .line 34
    const-string v0, "addBreadcrumb called with null parameter."

    .line 35
    .line 36
    new-array v1, v1, [Ljava/lang/Object;

    .line 37
    .line 38
    invoke-interface {p1, p2, v0, v1}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    iget-object v0, p0, Lio/sentry/a0;->d:Lio/sentry/g4;

    .line 43
    .line 44
    invoke-virtual {v0}, Lio/sentry/g4;->a()Lio/sentry/g4$a;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v0}, Lio/sentry/g4$a;->c()Lio/sentry/Scope;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v0, p1, p2}, Lio/sentry/Scope;->b(Lio/sentry/d;Lio/sentry/v;)V

    .line 53
    .line 54
    .line 55
    :goto_0
    return-void
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

.method public k(Lio/sentry/b2;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lio/sentry/a0;->isEnabled()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, Lio/sentry/a0;->b:Lio/sentry/o3;

    .line 8
    .line 9
    invoke-virtual {p1}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    sget-object v0, Lio/sentry/n3;->WARNING:Lio/sentry/n3;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    new-array v1, v1, [Ljava/lang/Object;

    .line 17
    .line 18
    const-string v2, "Instance is disabled and this \'configureScope\' call is a no-op."

    .line 19
    .line 20
    invoke-interface {p1, v0, v2, v1}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    :try_start_0
    iget-object v0, p0, Lio/sentry/a0;->d:Lio/sentry/g4;

    .line 25
    .line 26
    invoke-virtual {v0}, Lio/sentry/g4;->a()Lio/sentry/g4$a;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, Lio/sentry/g4$a;->c()Lio/sentry/Scope;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-interface {p1, v0}, Lio/sentry/b2;->a(Lio/sentry/Scope;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :catchall_0
    move-exception p1

    .line 39
    iget-object v0, p0, Lio/sentry/a0;->b:Lio/sentry/o3;

    .line 40
    .line 41
    invoke-virtual {v0}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sget-object v1, Lio/sentry/n3;->ERROR:Lio/sentry/n3;

    .line 46
    .line 47
    const-string v2, "Error in the \'configureScope\' callback."

    .line 48
    .line 49
    invoke-interface {v0, v1, v2, p1}, Lio/sentry/g0;->b(Lio/sentry/n3;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 50
    .line 51
    .line 52
    :goto_0
    return-void
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

.method public l(Lio/sentry/n4;Lio/sentry/f;Z)Lio/sentry/m0;
    .locals 9

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    invoke-direct/range {v0 .. v8}, Lio/sentry/a0;->D(Lio/sentry/n4;Lio/sentry/f;ZLjava/util/Date;ZLjava/lang/Long;ZLio/sentry/o4;)Lio/sentry/m0;

    move-result-object p1

    return-object p1
.end method

.method public m()Ljava/lang/Boolean;
    .locals 3

    .line 1
    invoke-static {}, Lio/sentry/p2;->a()Lio/sentry/p2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lio/sentry/a0;->b:Lio/sentry/o3;

    .line 6
    .line 7
    invoke-virtual {v1}, Lio/sentry/o3;->getCacheDirPath()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object v2, p0, Lio/sentry/a0;->b:Lio/sentry/o3;

    .line 12
    .line 13
    invoke-virtual {v2}, Lio/sentry/o3;->isEnableAutoSessionTracking()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    xor-int/lit8 v2, v2, 0x1

    .line 18
    .line 19
    invoke-virtual {v0, v1, v2}, Lio/sentry/p2;->b(Ljava/lang/String;Z)Ljava/lang/Boolean;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    return-object v0
    .line 24
.end method

.method public n(Ljava/lang/Throwable;Lio/sentry/ISpan;Ljava/lang/String;)V
    .locals 3

    .line 1
    const-string v0, "throwable is required"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    const-string v0, "span is required"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    const-string v0, "transactionName is required"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    invoke-static {p1}, Lio/sentry/util/b;->a(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iget-object v0, p0, Lio/sentry/a0;->f:Ljava/util/Map;

    .line 21
    .line 22
    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_0

    .line 27
    .line 28
    iget-object v0, p0, Lio/sentry/a0;->f:Ljava/util/Map;

    .line 29
    .line 30
    new-instance v1, Lio/sentry/util/l;

    .line 31
    .line 32
    new-instance v2, Ljava/lang/ref/WeakReference;

    .line 33
    .line 34
    invoke-direct {v2, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    invoke-direct {v1, v2, p3}, Lio/sentry/util/l;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    :cond_0
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

.method public o()Lio/sentry/o3;
    .locals 1

    iget-object v0, p0, Lio/sentry/a0;->d:Lio/sentry/g4;

    invoke-virtual {v0}, Lio/sentry/g4;->a()Lio/sentry/g4$a;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/g4$a;->b()Lio/sentry/o3;

    move-result-object v0

    return-object v0
.end method

.method public p(Lio/sentry/b2;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lio/sentry/a0;->isEnabled()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, Lio/sentry/a0;->b:Lio/sentry/o3;

    .line 8
    .line 9
    invoke-virtual {p1}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    sget-object v0, Lio/sentry/n3;->WARNING:Lio/sentry/n3;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    new-array v1, v1, [Ljava/lang/Object;

    .line 17
    .line 18
    const-string v2, "Instance is disabled and this \'withScope\' call is a no-op."

    .line 19
    .line 20
    invoke-interface {p1, v0, v2, v1}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    invoke-virtual {p0}, Lio/sentry/a0;->G()V

    .line 25
    .line 26
    .line 27
    :try_start_0
    iget-object v0, p0, Lio/sentry/a0;->d:Lio/sentry/g4;

    .line 28
    .line 29
    invoke-virtual {v0}, Lio/sentry/g4;->a()Lio/sentry/g4$a;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v0}, Lio/sentry/g4$a;->c()Lio/sentry/Scope;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-interface {p1, v0}, Lio/sentry/b2;->a(Lio/sentry/Scope;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :catchall_0
    move-exception p1

    .line 42
    iget-object v0, p0, Lio/sentry/a0;->b:Lio/sentry/o3;

    .line 43
    .line 44
    invoke-virtual {v0}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    sget-object v1, Lio/sentry/n3;->ERROR:Lio/sentry/n3;

    .line 49
    .line 50
    const-string v2, "Error in the \'withScope\' callback."

    .line 51
    .line 52
    invoke-interface {v0, v1, v2, p1}, Lio/sentry/g0;->b(Lio/sentry/n3;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 53
    .line 54
    .line 55
    :goto_0
    invoke-virtual {p0}, Lio/sentry/a0;->F()V

    .line 56
    .line 57
    .line 58
    :goto_1
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

.method public synthetic q(Ljava/lang/Throwable;)Lio/sentry/protocol/p;
    .locals 0

    invoke-static {p0, p1}, Lio/sentry/e0;->c(Lio/sentry/f0;Ljava/lang/Throwable;)Lio/sentry/protocol/p;

    move-result-object p1

    return-object p1
.end method

.method public synthetic r(Ljava/lang/String;Ljava/lang/String;Lio/sentry/f;Z)Lio/sentry/m0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lio/sentry/e0;->f(Lio/sentry/f0;Ljava/lang/String;Ljava/lang/String;Lio/sentry/f;Z)Lio/sentry/m0;

    move-result-object p1

    return-object p1
.end method

.method public s(Ljava/lang/Throwable;Lio/sentry/v;)Lio/sentry/protocol/p;
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lio/sentry/a0;->A(Ljava/lang/Throwable;Lio/sentry/v;Lio/sentry/b2;)Lio/sentry/protocol/p;

    move-result-object p1

    return-object p1
.end method

.method public t(Ljava/lang/String;Lio/sentry/n3;)Lio/sentry/protocol/p;
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lio/sentry/a0;->B(Ljava/lang/String;Lio/sentry/n3;Lio/sentry/b2;)Lio/sentry/protocol/p;

    move-result-object p1

    return-object p1
.end method

.method public synthetic u(Ljava/lang/String;Ljava/lang/String;Lio/sentry/f;)Lio/sentry/m0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lio/sentry/e0;->e(Lio/sentry/f0;Ljava/lang/String;Ljava/lang/String;Lio/sentry/f;)Lio/sentry/m0;

    move-result-object p1

    return-object p1
.end method

.method public v()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lio/sentry/a0;->isEnabled()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lio/sentry/a0;->b:Lio/sentry/o3;

    .line 8
    .line 9
    invoke-virtual {v0}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sget-object v1, Lio/sentry/n3;->WARNING:Lio/sentry/n3;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    new-array v2, v2, [Ljava/lang/Object;

    .line 17
    .line 18
    const-string v3, "Instance is disabled and this \'endSession\' call is a no-op."

    .line 19
    .line 20
    invoke-interface {v0, v1, v3, v2}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget-object v0, p0, Lio/sentry/a0;->d:Lio/sentry/g4;

    .line 25
    .line 26
    invoke-virtual {v0}, Lio/sentry/g4;->a()Lio/sentry/g4$a;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, Lio/sentry/g4$a;->c()Lio/sentry/Scope;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v1}, Lio/sentry/Scope;->f()Lio/sentry/y3;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    if-eqz v1, :cond_1

    .line 39
    .line 40
    new-instance v2, Lio/sentry/hints/h;

    .line 41
    .line 42
    invoke-direct {v2}, Lio/sentry/hints/h;-><init>()V

    .line 43
    .line 44
    .line 45
    invoke-static {v2}, Lio/sentry/util/h;->e(Ljava/lang/Object;)Lio/sentry/v;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-virtual {v0}, Lio/sentry/g4$a;->a()Lio/sentry/j0;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-interface {v0, v1, v2}, Lio/sentry/j0;->a(Lio/sentry/y3;Lio/sentry/v;)V

    .line 54
    .line 55
    .line 56
    :cond_1
    :goto_0
    return-void
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

.method public synthetic w(Lio/sentry/q2;)Lio/sentry/protocol/p;
    .locals 0

    invoke-static {p0, p1}, Lio/sentry/e0;->b(Lio/sentry/f0;Lio/sentry/q2;)Lio/sentry/protocol/p;

    move-result-object p1

    return-object p1
.end method

.method public x()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lio/sentry/a0;->isEnabled()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lio/sentry/a0;->b:Lio/sentry/o3;

    .line 9
    .line 10
    invoke-virtual {v0}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sget-object v2, Lio/sentry/n3;->WARNING:Lio/sentry/n3;

    .line 15
    .line 16
    const-string v3, "Instance is disabled and this \'startSession\' call is a no-op."

    .line 17
    .line 18
    new-array v1, v1, [Ljava/lang/Object;

    .line 19
    .line 20
    invoke-interface {v0, v2, v3, v1}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget-object v0, p0, Lio/sentry/a0;->d:Lio/sentry/g4;

    .line 25
    .line 26
    invoke-virtual {v0}, Lio/sentry/g4;->a()Lio/sentry/g4$a;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, Lio/sentry/g4$a;->c()Lio/sentry/Scope;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-virtual {v2}, Lio/sentry/Scope;->z()Lio/sentry/Scope$c;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    if-eqz v2, :cond_2

    .line 39
    .line 40
    invoke-virtual {v2}, Lio/sentry/Scope$c;->b()Lio/sentry/y3;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    if-eqz v1, :cond_1

    .line 45
    .line 46
    new-instance v1, Lio/sentry/hints/h;

    .line 47
    .line 48
    invoke-direct {v1}, Lio/sentry/hints/h;-><init>()V

    .line 49
    .line 50
    .line 51
    invoke-static {v1}, Lio/sentry/util/h;->e(Ljava/lang/Object;)Lio/sentry/v;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-virtual {v0}, Lio/sentry/g4$a;->a()Lio/sentry/j0;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    invoke-virtual {v2}, Lio/sentry/Scope$c;->b()Lio/sentry/y3;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    invoke-interface {v3, v4, v1}, Lio/sentry/j0;->a(Lio/sentry/y3;Lio/sentry/v;)V

    .line 64
    .line 65
    .line 66
    :cond_1
    new-instance v1, Lio/sentry/hints/j;

    .line 67
    .line 68
    invoke-direct {v1}, Lio/sentry/hints/j;-><init>()V

    .line 69
    .line 70
    .line 71
    invoke-static {v1}, Lio/sentry/util/h;->e(Ljava/lang/Object;)Lio/sentry/v;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-virtual {v0}, Lio/sentry/g4$a;->a()Lio/sentry/j0;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {v2}, Lio/sentry/Scope$c;->a()Lio/sentry/y3;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    invoke-interface {v0, v2, v1}, Lio/sentry/j0;->a(Lio/sentry/y3;Lio/sentry/v;)V

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_2
    iget-object v0, p0, Lio/sentry/a0;->b:Lio/sentry/o3;

    .line 88
    .line 89
    invoke-virtual {v0}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    sget-object v2, Lio/sentry/n3;->WARNING:Lio/sentry/n3;

    .line 94
    .line 95
    const-string v3, "Session could not be started."

    .line 96
    .line 97
    new-array v1, v1, [Ljava/lang/Object;

    .line 98
    .line 99
    invoke-interface {v0, v2, v3, v1}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    :goto_0
    return-void
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
    .line 201
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
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
.end method

.method public y(Lio/sentry/j3;Lio/sentry/v;)Lio/sentry/protocol/p;
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lio/sentry/a0;->z(Lio/sentry/j3;Lio/sentry/v;Lio/sentry/b2;)Lio/sentry/protocol/p;

    move-result-object p1

    return-object p1
.end method
