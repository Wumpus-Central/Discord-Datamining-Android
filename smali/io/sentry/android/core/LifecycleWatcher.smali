.class final Lio/sentry/android/core/LifecycleWatcher;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/DefaultLifecycleObserver;


# instance fields
.field private final k:Ljava/util/concurrent/atomic/AtomicLong;

.field private final l:J

.field private m:Ljava/util/TimerTask;

.field private final n:Ljava/util/Timer;

.field private final o:Ljava/lang/Object;

.field private final p:Lio/sentry/f0;

.field private final q:Z

.field private final r:Z

.field private final s:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final t:Lio/sentry/transport/o;


# direct methods
.method constructor <init>(Lio/sentry/f0;JZZ)V
    .locals 7

    .line 1
    invoke-static {}, Lio/sentry/transport/m;->b()Lio/sentry/transport/o;

    move-result-object v6

    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    move v4, p4

    move v5, p5

    .line 2
    invoke-direct/range {v0 .. v6}, Lio/sentry/android/core/LifecycleWatcher;-><init>(Lio/sentry/f0;JZZLio/sentry/transport/o;)V

    return-void
.end method

.method constructor <init>(Lio/sentry/f0;JZZLio/sentry/transport/o;)V
    .locals 3

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v1, 0x0

    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object v0, p0, Lio/sentry/android/core/LifecycleWatcher;->k:Ljava/util/concurrent/atomic/AtomicLong;

    .line 5
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lio/sentry/android/core/LifecycleWatcher;->o:Ljava/lang/Object;

    .line 6
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, Lio/sentry/android/core/LifecycleWatcher;->s:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 7
    iput-wide p2, p0, Lio/sentry/android/core/LifecycleWatcher;->l:J

    .line 8
    iput-boolean p4, p0, Lio/sentry/android/core/LifecycleWatcher;->q:Z

    .line 9
    iput-boolean p5, p0, Lio/sentry/android/core/LifecycleWatcher;->r:Z

    .line 10
    iput-object p1, p0, Lio/sentry/android/core/LifecycleWatcher;->p:Lio/sentry/f0;

    .line 11
    iput-object p6, p0, Lio/sentry/android/core/LifecycleWatcher;->t:Lio/sentry/transport/o;

    if-eqz p4, :cond_0

    .line 12
    new-instance p1, Ljava/util/Timer;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Ljava/util/Timer;-><init>(Z)V

    iput-object p1, p0, Lio/sentry/android/core/LifecycleWatcher;->n:Ljava/util/Timer;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 13
    iput-object p1, p0, Lio/sentry/android/core/LifecycleWatcher;->n:Ljava/util/Timer;

    :goto_0
    return-void
.end method

.method static synthetic a(Lio/sentry/android/core/LifecycleWatcher;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/sentry/android/core/LifecycleWatcher;->f(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic b(Lio/sentry/android/core/LifecycleWatcher;)Lio/sentry/f0;
    .locals 0

    iget-object p0, p0, Lio/sentry/android/core/LifecycleWatcher;->p:Lio/sentry/f0;

    return-object p0
.end method

.method static synthetic d(Lio/sentry/android/core/LifecycleWatcher;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 0

    iget-object p0, p0, Lio/sentry/android/core/LifecycleWatcher;->s:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object p0
.end method

.method private e(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lio/sentry/android/core/LifecycleWatcher;->r:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lio/sentry/d;

    .line 6
    .line 7
    invoke-direct {v0}, Lio/sentry/d;-><init>()V

    .line 8
    .line 9
    .line 10
    const-string v1, "navigation"

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lio/sentry/d;->p(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-string v1, "state"

    .line 16
    .line 17
    invoke-virtual {v0, v1, p1}, Lio/sentry/d;->m(Ljava/lang/String;Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    const-string p1, "app.lifecycle"

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Lio/sentry/d;->l(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    sget-object p1, Lio/sentry/n3;->INFO:Lio/sentry/n3;

    .line 26
    .line 27
    invoke-virtual {v0, p1}, Lio/sentry/d;->n(Lio/sentry/n3;)V

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Lio/sentry/android/core/LifecycleWatcher;->p:Lio/sentry/f0;

    .line 31
    .line 32
    invoke-interface {p1, v0}, Lio/sentry/f0;->e(Lio/sentry/d;)V

    .line 33
    .line 34
    .line 35
    :cond_0
    return-void
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

.method private f(Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Lio/sentry/d;

    .line 2
    .line 3
    invoke-direct {v0}, Lio/sentry/d;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "session"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lio/sentry/d;->p(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v1, "state"

    .line 12
    .line 13
    invoke-virtual {v0, v1, p1}, Lio/sentry/d;->m(Ljava/lang/String;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    const-string p1, "app.lifecycle"

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lio/sentry/d;->l(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    sget-object p1, Lio/sentry/n3;->INFO:Lio/sentry/n3;

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Lio/sentry/d;->n(Lio/sentry/n3;)V

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, Lio/sentry/android/core/LifecycleWatcher;->p:Lio/sentry/f0;

    .line 27
    .line 28
    invoke-interface {p1, v0}, Lio/sentry/f0;->e(Lio/sentry/d;)V

    .line 29
    .line 30
    .line 31
    return-void
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

.method private g()V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/sentry/android/core/LifecycleWatcher;->o:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lio/sentry/android/core/LifecycleWatcher;->m:Ljava/util/TimerTask;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/util/TimerTask;->cancel()Z

    .line 9
    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    iput-object v1, p0, Lio/sentry/android/core/LifecycleWatcher;->m:Ljava/util/TimerTask;

    .line 13
    .line 14
    :cond_0
    monitor-exit v0

    .line 15
    return-void

    .line 16
    :catchall_0
    move-exception v1

    .line 17
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    throw v1
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method private h()V
    .locals 5

    .line 1
    iget-object v0, p0, Lio/sentry/android/core/LifecycleWatcher;->o:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-direct {p0}, Lio/sentry/android/core/LifecycleWatcher;->g()V

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, Lio/sentry/android/core/LifecycleWatcher;->n:Ljava/util/Timer;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    new-instance v1, Lio/sentry/android/core/LifecycleWatcher$a;

    .line 12
    .line 13
    invoke-direct {v1, p0}, Lio/sentry/android/core/LifecycleWatcher$a;-><init>(Lio/sentry/android/core/LifecycleWatcher;)V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, Lio/sentry/android/core/LifecycleWatcher;->m:Ljava/util/TimerTask;

    .line 17
    .line 18
    iget-object v2, p0, Lio/sentry/android/core/LifecycleWatcher;->n:Ljava/util/Timer;

    .line 19
    .line 20
    iget-wide v3, p0, Lio/sentry/android/core/LifecycleWatcher;->l:J

    .line 21
    .line 22
    invoke-virtual {v2, v1, v3, v4}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    .line 23
    .line 24
    .line 25
    :cond_0
    monitor-exit v0

    .line 26
    return-void

    .line 27
    :catchall_0
    move-exception v1

    .line 28
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    throw v1
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

.method private i()V
    .locals 6

    .line 1
    iget-boolean v0, p0, Lio/sentry/android/core/LifecycleWatcher;->q:Z

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    invoke-direct {p0}, Lio/sentry/android/core/LifecycleWatcher;->g()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lio/sentry/android/core/LifecycleWatcher;->t:Lio/sentry/transport/o;

    .line 9
    .line 10
    invoke-interface {v0}, Lio/sentry/transport/o;->a()J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    iget-object v2, p0, Lio/sentry/android/core/LifecycleWatcher;->k:Ljava/util/concurrent/atomic/AtomicLong;

    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 17
    .line 18
    .line 19
    move-result-wide v2

    .line 20
    const-wide/16 v4, 0x0

    .line 21
    .line 22
    cmp-long v4, v2, v4

    .line 23
    .line 24
    if-eqz v4, :cond_0

    .line 25
    .line 26
    iget-wide v4, p0, Lio/sentry/android/core/LifecycleWatcher;->l:J

    .line 27
    .line 28
    add-long/2addr v2, v4

    .line 29
    cmp-long v2, v2, v0

    .line 30
    .line 31
    if-gtz v2, :cond_1

    .line 32
    .line 33
    :cond_0
    const-string v2, "start"

    .line 34
    .line 35
    invoke-direct {p0, v2}, Lio/sentry/android/core/LifecycleWatcher;->f(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    iget-object v2, p0, Lio/sentry/android/core/LifecycleWatcher;->p:Lio/sentry/f0;

    .line 39
    .line 40
    invoke-interface {v2}, Lio/sentry/f0;->x()V

    .line 41
    .line 42
    .line 43
    iget-object v2, p0, Lio/sentry/android/core/LifecycleWatcher;->s:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 44
    .line 45
    const/4 v3, 0x1

    .line 46
    invoke-virtual {v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 47
    .line 48
    .line 49
    :cond_1
    iget-object v2, p0, Lio/sentry/android/core/LifecycleWatcher;->k:Ljava/util/concurrent/atomic/AtomicLong;

    .line 50
    .line 51
    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 52
    .line 53
    .line 54
    :cond_2
    return-void
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


# virtual methods
.method public synthetic onCreate(Landroidx/lifecycle/LifecycleOwner;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/lifecycle/c;->a(Landroidx/lifecycle/DefaultLifecycleObserver;Landroidx/lifecycle/LifecycleOwner;)V

    return-void
.end method

.method public synthetic onDestroy(Landroidx/lifecycle/LifecycleOwner;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/lifecycle/c;->b(Landroidx/lifecycle/DefaultLifecycleObserver;Landroidx/lifecycle/LifecycleOwner;)V

    return-void
.end method

.method public synthetic onPause(Landroidx/lifecycle/LifecycleOwner;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/lifecycle/c;->c(Landroidx/lifecycle/DefaultLifecycleObserver;Landroidx/lifecycle/LifecycleOwner;)V

    return-void
.end method

.method public synthetic onResume(Landroidx/lifecycle/LifecycleOwner;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/lifecycle/c;->d(Landroidx/lifecycle/DefaultLifecycleObserver;Landroidx/lifecycle/LifecycleOwner;)V

    return-void
.end method

.method public onStart(Landroidx/lifecycle/LifecycleOwner;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lio/sentry/android/core/LifecycleWatcher;->i()V

    .line 2
    .line 3
    .line 4
    const-string p1, "foreground"

    .line 5
    .line 6
    invoke-direct {p0, p1}, Lio/sentry/android/core/LifecycleWatcher;->e(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    return-void
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

.method public onStop(Landroidx/lifecycle/LifecycleOwner;)V
    .locals 2

    .line 1
    iget-boolean p1, p0, Lio/sentry/android/core/LifecycleWatcher;->q:Z

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lio/sentry/android/core/LifecycleWatcher;->t:Lio/sentry/transport/o;

    .line 6
    .line 7
    invoke-interface {p1}, Lio/sentry/transport/o;->a()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    iget-object p1, p0, Lio/sentry/android/core/LifecycleWatcher;->k:Ljava/util/concurrent/atomic/AtomicLong;

    .line 12
    .line 13
    invoke-virtual {p1, v0, v1}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Lio/sentry/android/core/LifecycleWatcher;->h()V

    .line 17
    .line 18
    .line 19
    :cond_0
    const-string p1, "background"

    .line 20
    .line 21
    invoke-direct {p0, p1}, Lio/sentry/android/core/LifecycleWatcher;->e(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-void
    .line 25
    .line 26
    .line 27
.end method
