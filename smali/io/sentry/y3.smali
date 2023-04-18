.class public final Lio/sentry/y3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/b1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/sentry/y3$b;,
        Lio/sentry/y3$a;
    }
.end annotation


# instance fields
.field private final k:Ljava/util/Date;

.field private l:Ljava/util/Date;

.field private final m:Ljava/util/concurrent/atomic/AtomicInteger;

.field private final n:Ljava/lang/String;

.field private final o:Ljava/util/UUID;

.field private p:Ljava/lang/Boolean;

.field private q:Lio/sentry/y3$b;

.field private r:Ljava/lang/Long;

.field private s:Ljava/lang/Double;

.field private final t:Ljava/lang/String;

.field private u:Ljava/lang/String;

.field private final v:Ljava/lang/String;

.field private final w:Ljava/lang/String;

.field private final x:Ljava/lang/Object;

.field private y:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/sentry/y3$b;Ljava/util/Date;Ljava/util/Date;ILjava/lang/String;Ljava/util/UUID;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lio/sentry/y3;->x:Ljava/lang/Object;

    .line 3
    iput-object p1, p0, Lio/sentry/y3;->q:Lio/sentry/y3$b;

    .line 4
    iput-object p2, p0, Lio/sentry/y3;->k:Ljava/util/Date;

    .line 5
    iput-object p3, p0, Lio/sentry/y3;->l:Ljava/util/Date;

    .line 6
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {p1, p4}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object p1, p0, Lio/sentry/y3;->m:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 7
    iput-object p5, p0, Lio/sentry/y3;->n:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lio/sentry/y3;->o:Ljava/util/UUID;

    .line 9
    iput-object p7, p0, Lio/sentry/y3;->p:Ljava/lang/Boolean;

    .line 10
    iput-object p8, p0, Lio/sentry/y3;->r:Ljava/lang/Long;

    .line 11
    iput-object p9, p0, Lio/sentry/y3;->s:Ljava/lang/Double;

    .line 12
    iput-object p10, p0, Lio/sentry/y3;->t:Ljava/lang/String;

    .line 13
    iput-object p11, p0, Lio/sentry/y3;->u:Ljava/lang/String;

    .line 14
    iput-object p12, p0, Lio/sentry/y3;->v:Ljava/lang/String;

    .line 15
    iput-object p13, p0, Lio/sentry/y3;->w:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lio/sentry/protocol/z;Ljava/lang/String;Ljava/lang/String;)V
    .locals 14

    .line 16
    sget-object v1, Lio/sentry/y3$b;->Ok:Lio/sentry/y3$b;

    .line 17
    invoke-static {}, Lio/sentry/h;->b()Ljava/util/Date;

    move-result-object v2

    .line 18
    invoke-static {}, Lio/sentry/h;->b()Ljava/util/Date;

    move-result-object v3

    const/4 v4, 0x0

    .line 19
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v6

    .line 20
    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const/4 v8, 0x0

    const/4 v9, 0x0

    if-eqz p2, :cond_0

    .line 21
    invoke-virtual/range {p2 .. p2}, Lio/sentry/protocol/z;->k()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    move-object v10, v0

    const/4 v11, 0x0

    move-object v0, p0

    move-object v5, p1

    move-object/from16 v12, p3

    move-object/from16 v13, p4

    .line 22
    invoke-direct/range {v0 .. v13}, Lio/sentry/y3;-><init>(Lio/sentry/y3$b;Ljava/util/Date;Ljava/util/Date;ILjava/lang/String;Ljava/util/UUID;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private a(Ljava/util/Date;)D
    .locals 4

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    iget-object p1, p0, Lio/sentry/y3;->k:Ljava/util/Date;

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    sub-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    long-to-double v0, v0

    const-wide v2, 0x408f400000000000L    # 1000.0

    div-double/2addr v0, v2

    return-wide v0
.end method

.method private h(Ljava/util/Date;)J
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    cmp-long p1, v0, v2

    .line 8
    .line 9
    if-gez p1, :cond_0

    .line 10
    .line 11
    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    :cond_0
    return-wide v0
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
.method public b()Lio/sentry/y3;
    .locals 15

    .line 1
    new-instance v14, Lio/sentry/y3;

    .line 2
    .line 3
    iget-object v1, p0, Lio/sentry/y3;->q:Lio/sentry/y3$b;

    .line 4
    .line 5
    iget-object v2, p0, Lio/sentry/y3;->k:Ljava/util/Date;

    .line 6
    .line 7
    iget-object v3, p0, Lio/sentry/y3;->l:Ljava/util/Date;

    .line 8
    .line 9
    iget-object v0, p0, Lio/sentry/y3;->m:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    iget-object v5, p0, Lio/sentry/y3;->n:Ljava/lang/String;

    .line 16
    .line 17
    iget-object v6, p0, Lio/sentry/y3;->o:Ljava/util/UUID;

    .line 18
    .line 19
    iget-object v7, p0, Lio/sentry/y3;->p:Ljava/lang/Boolean;

    .line 20
    .line 21
    iget-object v8, p0, Lio/sentry/y3;->r:Ljava/lang/Long;

    .line 22
    .line 23
    iget-object v9, p0, Lio/sentry/y3;->s:Ljava/lang/Double;

    .line 24
    .line 25
    iget-object v10, p0, Lio/sentry/y3;->t:Ljava/lang/String;

    .line 26
    .line 27
    iget-object v11, p0, Lio/sentry/y3;->u:Ljava/lang/String;

    .line 28
    .line 29
    iget-object v12, p0, Lio/sentry/y3;->v:Ljava/lang/String;

    .line 30
    .line 31
    iget-object v13, p0, Lio/sentry/y3;->w:Ljava/lang/String;

    .line 32
    .line 33
    move-object v0, v14

    .line 34
    invoke-direct/range {v0 .. v13}, Lio/sentry/y3;-><init>(Lio/sentry/y3$b;Ljava/util/Date;Ljava/util/Date;ILjava/lang/String;Ljava/util/UUID;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return-object v14
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

.method public c()V
    .locals 1

    invoke-static {}, Lio/sentry/h;->b()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {p0, v0}, Lio/sentry/y3;->d(Ljava/util/Date;)V

    return-void
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lio/sentry/y3;->b()Lio/sentry/y3;

    move-result-object v0

    return-object v0
.end method

.method public d(Ljava/util/Date;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lio/sentry/y3;->x:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x0

    .line 5
    :try_start_0
    iput-object v1, p0, Lio/sentry/y3;->p:Ljava/lang/Boolean;

    .line 6
    .line 7
    iget-object v1, p0, Lio/sentry/y3;->q:Lio/sentry/y3$b;

    .line 8
    .line 9
    sget-object v2, Lio/sentry/y3$b;->Ok:Lio/sentry/y3$b;

    .line 10
    .line 11
    if-ne v1, v2, :cond_0

    .line 12
    .line 13
    sget-object v1, Lio/sentry/y3$b;->Exited:Lio/sentry/y3$b;

    .line 14
    .line 15
    iput-object v1, p0, Lio/sentry/y3;->q:Lio/sentry/y3$b;

    .line 16
    .line 17
    :cond_0
    if-eqz p1, :cond_1

    .line 18
    .line 19
    iput-object p1, p0, Lio/sentry/y3;->l:Ljava/util/Date;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    invoke-static {}, Lio/sentry/h;->b()Ljava/util/Date;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iput-object p1, p0, Lio/sentry/y3;->l:Ljava/util/Date;

    .line 27
    .line 28
    :goto_0
    iget-object p1, p0, Lio/sentry/y3;->l:Ljava/util/Date;

    .line 29
    .line 30
    if-eqz p1, :cond_2

    .line 31
    .line 32
    invoke-direct {p0, p1}, Lio/sentry/y3;->a(Ljava/util/Date;)D

    .line 33
    .line 34
    .line 35
    move-result-wide v1

    .line 36
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iput-object p1, p0, Lio/sentry/y3;->s:Ljava/lang/Double;

    .line 41
    .line 42
    iget-object p1, p0, Lio/sentry/y3;->l:Ljava/util/Date;

    .line 43
    .line 44
    invoke-direct {p0, p1}, Lio/sentry/y3;->h(Ljava/util/Date;)J

    .line 45
    .line 46
    .line 47
    move-result-wide v1

    .line 48
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    iput-object p1, p0, Lio/sentry/y3;->r:Ljava/lang/Long;

    .line 53
    .line 54
    :cond_2
    monitor-exit v0

    .line 55
    return-void

    .line 56
    :catchall_0
    move-exception p1

    .line 57
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    throw p1
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

.method public e()I
    .locals 1

    iget-object v0, p0, Lio/sentry/y3;->m:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    return v0
.end method

.method public f()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/sentry/y3;->p:Ljava/lang/Boolean;

    return-object v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/sentry/y3;->w:Ljava/lang/String;

    return-object v0
.end method

.method public i()Ljava/util/UUID;
    .locals 1

    iget-object v0, p0, Lio/sentry/y3;->o:Ljava/util/UUID;

    return-object v0
.end method

.method public j()Lio/sentry/y3$b;
    .locals 1

    iget-object v0, p0, Lio/sentry/y3;->q:Lio/sentry/y3$b;

    return-object v0
.end method

.method public k()V
    .locals 1

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v0, p0, Lio/sentry/y3;->p:Ljava/lang/Boolean;

    return-void
.end method

.method public l(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/sentry/y3;->y:Ljava/util/Map;

    return-void
.end method

.method public m(Lio/sentry/y3$b;Ljava/lang/String;Z)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lio/sentry/y3;->x:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    :try_start_0
    iput-object p1, p0, Lio/sentry/y3;->q:Lio/sentry/y3$b;

    .line 8
    .line 9
    move p1, v1

    .line 10
    goto :goto_0

    .line 11
    :catchall_0
    move-exception p1

    .line 12
    goto :goto_2

    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    :goto_0
    if-eqz p2, :cond_1

    .line 15
    .line 16
    iput-object p2, p0, Lio/sentry/y3;->u:Ljava/lang/String;

    .line 17
    .line 18
    move p1, v1

    .line 19
    :cond_1
    if-eqz p3, :cond_2

    .line 20
    .line 21
    iget-object p1, p0, Lio/sentry/y3;->m:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 22
    .line 23
    invoke-virtual {p1, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    .line 24
    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_2
    move v1, p1

    .line 28
    :goto_1
    if-eqz v1, :cond_3

    .line 29
    .line 30
    const/4 p1, 0x0

    .line 31
    iput-object p1, p0, Lio/sentry/y3;->p:Ljava/lang/Boolean;

    .line 32
    .line 33
    invoke-static {}, Lio/sentry/h;->b()Ljava/util/Date;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iput-object p1, p0, Lio/sentry/y3;->l:Ljava/util/Date;

    .line 38
    .line 39
    if-eqz p1, :cond_3

    .line 40
    .line 41
    invoke-direct {p0, p1}, Lio/sentry/y3;->h(Ljava/util/Date;)J

    .line 42
    .line 43
    .line 44
    move-result-wide p1

    .line 45
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    iput-object p1, p0, Lio/sentry/y3;->r:Ljava/lang/Long;

    .line 50
    .line 51
    :cond_3
    monitor-exit v0

    .line 52
    return v1

    .line 53
    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    throw p1
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

.method public serialize(Lio/sentry/z0;Lio/sentry/g0;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Lio/sentry/vendor/gson/stream/c;->k()Lio/sentry/vendor/gson/stream/c;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lio/sentry/y3;->o:Ljava/util/UUID;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const-string v0, "sid"

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Lio/sentry/z0;->B0(Ljava/lang/String;)Lio/sentry/z0;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v1, p0, Lio/sentry/y3;->o:Ljava/util/UUID;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v0, v1}, Lio/sentry/vendor/gson/stream/c;->t0(Ljava/lang/String;)Lio/sentry/vendor/gson/stream/c;

    .line 21
    .line 22
    .line 23
    :cond_0
    iget-object v0, p0, Lio/sentry/y3;->n:Ljava/lang/String;

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    const-string v0, "did"

    .line 28
    .line 29
    invoke-virtual {p1, v0}, Lio/sentry/z0;->B0(Ljava/lang/String;)Lio/sentry/z0;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget-object v1, p0, Lio/sentry/y3;->n:Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Lio/sentry/vendor/gson/stream/c;->t0(Ljava/lang/String;)Lio/sentry/vendor/gson/stream/c;

    .line 36
    .line 37
    .line 38
    :cond_1
    iget-object v0, p0, Lio/sentry/y3;->p:Ljava/lang/Boolean;

    .line 39
    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    const-string v0, "init"

    .line 43
    .line 44
    invoke-virtual {p1, v0}, Lio/sentry/z0;->B0(Ljava/lang/String;)Lio/sentry/z0;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iget-object v1, p0, Lio/sentry/y3;->p:Ljava/lang/Boolean;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Lio/sentry/vendor/gson/stream/c;->i0(Ljava/lang/Boolean;)Lio/sentry/vendor/gson/stream/c;

    .line 51
    .line 52
    .line 53
    :cond_2
    const-string v0, "started"

    .line 54
    .line 55
    invoke-virtual {p1, v0}, Lio/sentry/z0;->B0(Ljava/lang/String;)Lio/sentry/z0;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iget-object v1, p0, Lio/sentry/y3;->k:Ljava/util/Date;

    .line 60
    .line 61
    invoke-virtual {v0, p2, v1}, Lio/sentry/z0;->F0(Lio/sentry/g0;Ljava/lang/Object;)Lio/sentry/z0;

    .line 62
    .line 63
    .line 64
    const-string v0, "status"

    .line 65
    .line 66
    invoke-virtual {p1, v0}, Lio/sentry/z0;->B0(Ljava/lang/String;)Lio/sentry/z0;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    iget-object v1, p0, Lio/sentry/y3;->q:Lio/sentry/y3$b;

    .line 71
    .line 72
    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 77
    .line 78
    invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-virtual {v0, p2, v1}, Lio/sentry/z0;->F0(Lio/sentry/g0;Ljava/lang/Object;)Lio/sentry/z0;

    .line 83
    .line 84
    .line 85
    iget-object v0, p0, Lio/sentry/y3;->r:Ljava/lang/Long;

    .line 86
    .line 87
    if-eqz v0, :cond_3

    .line 88
    .line 89
    const-string v0, "seq"

    .line 90
    .line 91
    invoke-virtual {p1, v0}, Lio/sentry/z0;->B0(Ljava/lang/String;)Lio/sentry/z0;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    iget-object v1, p0, Lio/sentry/y3;->r:Ljava/lang/Long;

    .line 96
    .line 97
    invoke-virtual {v0, v1}, Lio/sentry/vendor/gson/stream/c;->k0(Ljava/lang/Number;)Lio/sentry/vendor/gson/stream/c;

    .line 98
    .line 99
    .line 100
    :cond_3
    const-string v0, "errors"

    .line 101
    .line 102
    invoke-virtual {p1, v0}, Lio/sentry/z0;->B0(Ljava/lang/String;)Lio/sentry/z0;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    iget-object v1, p0, Lio/sentry/y3;->m:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 107
    .line 108
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->intValue()I

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    int-to-long v1, v1

    .line 113
    invoke-virtual {v0, v1, v2}, Lio/sentry/vendor/gson/stream/c;->h0(J)Lio/sentry/vendor/gson/stream/c;

    .line 114
    .line 115
    .line 116
    iget-object v0, p0, Lio/sentry/y3;->s:Ljava/lang/Double;

    .line 117
    .line 118
    if-eqz v0, :cond_4

    .line 119
    .line 120
    const-string v0, "duration"

    .line 121
    .line 122
    invoke-virtual {p1, v0}, Lio/sentry/z0;->B0(Ljava/lang/String;)Lio/sentry/z0;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    iget-object v1, p0, Lio/sentry/y3;->s:Ljava/lang/Double;

    .line 127
    .line 128
    invoke-virtual {v0, v1}, Lio/sentry/vendor/gson/stream/c;->k0(Ljava/lang/Number;)Lio/sentry/vendor/gson/stream/c;

    .line 129
    .line 130
    .line 131
    :cond_4
    iget-object v0, p0, Lio/sentry/y3;->l:Ljava/util/Date;

    .line 132
    .line 133
    if-eqz v0, :cond_5

    .line 134
    .line 135
    const-string v0, "timestamp"

    .line 136
    .line 137
    invoke-virtual {p1, v0}, Lio/sentry/z0;->B0(Ljava/lang/String;)Lio/sentry/z0;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    iget-object v1, p0, Lio/sentry/y3;->l:Ljava/util/Date;

    .line 142
    .line 143
    invoke-virtual {v0, p2, v1}, Lio/sentry/z0;->F0(Lio/sentry/g0;Ljava/lang/Object;)Lio/sentry/z0;

    .line 144
    .line 145
    .line 146
    :cond_5
    const-string v0, "attrs"

    .line 147
    .line 148
    invoke-virtual {p1, v0}, Lio/sentry/z0;->B0(Ljava/lang/String;)Lio/sentry/z0;

    .line 149
    .line 150
    .line 151
    invoke-virtual {p1}, Lio/sentry/vendor/gson/stream/c;->k()Lio/sentry/vendor/gson/stream/c;

    .line 152
    .line 153
    .line 154
    const-string v0, "release"

    .line 155
    .line 156
    invoke-virtual {p1, v0}, Lio/sentry/z0;->B0(Ljava/lang/String;)Lio/sentry/z0;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    iget-object v1, p0, Lio/sentry/y3;->w:Ljava/lang/String;

    .line 161
    .line 162
    invoke-virtual {v0, p2, v1}, Lio/sentry/z0;->F0(Lio/sentry/g0;Ljava/lang/Object;)Lio/sentry/z0;

    .line 163
    .line 164
    .line 165
    iget-object v0, p0, Lio/sentry/y3;->v:Ljava/lang/String;

    .line 166
    .line 167
    if-eqz v0, :cond_6

    .line 168
    .line 169
    const-string v0, "environment"

    .line 170
    .line 171
    invoke-virtual {p1, v0}, Lio/sentry/z0;->B0(Ljava/lang/String;)Lio/sentry/z0;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    iget-object v1, p0, Lio/sentry/y3;->v:Ljava/lang/String;

    .line 176
    .line 177
    invoke-virtual {v0, p2, v1}, Lio/sentry/z0;->F0(Lio/sentry/g0;Ljava/lang/Object;)Lio/sentry/z0;

    .line 178
    .line 179
    .line 180
    :cond_6
    iget-object v0, p0, Lio/sentry/y3;->t:Ljava/lang/String;

    .line 181
    .line 182
    if-eqz v0, :cond_7

    .line 183
    .line 184
    const-string v0, "ip_address"

    .line 185
    .line 186
    invoke-virtual {p1, v0}, Lio/sentry/z0;->B0(Ljava/lang/String;)Lio/sentry/z0;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    iget-object v1, p0, Lio/sentry/y3;->t:Ljava/lang/String;

    .line 191
    .line 192
    invoke-virtual {v0, p2, v1}, Lio/sentry/z0;->F0(Lio/sentry/g0;Ljava/lang/Object;)Lio/sentry/z0;

    .line 193
    .line 194
    .line 195
    :cond_7
    iget-object v0, p0, Lio/sentry/y3;->u:Ljava/lang/String;

    .line 196
    .line 197
    if-eqz v0, :cond_8

    .line 198
    .line 199
    const-string v0, "user_agent"

    .line 200
    .line 201
    invoke-virtual {p1, v0}, Lio/sentry/z0;->B0(Ljava/lang/String;)Lio/sentry/z0;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    iget-object v1, p0, Lio/sentry/y3;->u:Ljava/lang/String;

    .line 206
    .line 207
    invoke-virtual {v0, p2, v1}, Lio/sentry/z0;->F0(Lio/sentry/g0;Ljava/lang/Object;)Lio/sentry/z0;

    .line 208
    .line 209
    .line 210
    :cond_8
    invoke-virtual {p1}, Lio/sentry/vendor/gson/stream/c;->s()Lio/sentry/vendor/gson/stream/c;

    .line 211
    .line 212
    .line 213
    iget-object v0, p0, Lio/sentry/y3;->y:Ljava/util/Map;

    .line 214
    .line 215
    if-eqz v0, :cond_9

    .line 216
    .line 217
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 226
    .line 227
    .line 228
    move-result v1

    .line 229
    if-eqz v1, :cond_9

    .line 230
    .line 231
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v1

    .line 235
    check-cast v1, Ljava/lang/String;

    .line 236
    .line 237
    iget-object v2, p0, Lio/sentry/y3;->y:Ljava/util/Map;

    .line 238
    .line 239
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v2

    .line 243
    invoke-virtual {p1, v1}, Lio/sentry/z0;->B0(Ljava/lang/String;)Lio/sentry/z0;

    .line 244
    .line 245
    .line 246
    invoke-virtual {p1, p2, v2}, Lio/sentry/z0;->F0(Lio/sentry/g0;Ljava/lang/Object;)Lio/sentry/z0;

    .line 247
    .line 248
    .line 249
    goto :goto_0

    .line 250
    :cond_9
    invoke-virtual {p1}, Lio/sentry/vendor/gson/stream/c;->s()Lio/sentry/vendor/gson/stream/c;

    .line 251
    .line 252
    .line 253
    return-void
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
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
.end method
