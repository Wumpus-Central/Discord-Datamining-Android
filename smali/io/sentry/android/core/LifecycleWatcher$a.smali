.class Lio/sentry/android/core/LifecycleWatcher$a;
.super Ljava/util/TimerTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/sentry/android/core/LifecycleWatcher;->h()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic k:Lio/sentry/android/core/LifecycleWatcher;


# direct methods
.method constructor <init>(Lio/sentry/android/core/LifecycleWatcher;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/android/core/LifecycleWatcher$a;->k:Lio/sentry/android/core/LifecycleWatcher;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/sentry/android/core/LifecycleWatcher$a;->k:Lio/sentry/android/core/LifecycleWatcher;

    .line 2
    .line 3
    const-string v1, "end"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lio/sentry/android/core/LifecycleWatcher;->a(Lio/sentry/android/core/LifecycleWatcher;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lio/sentry/android/core/LifecycleWatcher$a;->k:Lio/sentry/android/core/LifecycleWatcher;

    .line 9
    .line 10
    invoke-static {v0}, Lio/sentry/android/core/LifecycleWatcher;->b(Lio/sentry/android/core/LifecycleWatcher;)Lio/sentry/f0;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0}, Lio/sentry/f0;->v()V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lio/sentry/android/core/LifecycleWatcher$a;->k:Lio/sentry/android/core/LifecycleWatcher;

    .line 18
    .line 19
    invoke-static {v0}, Lio/sentry/android/core/LifecycleWatcher;->d(Lio/sentry/android/core/LifecycleWatcher;)Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const/4 v1, 0x0

    .line 24
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 25
    .line 26
    .line 27
    return-void
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
