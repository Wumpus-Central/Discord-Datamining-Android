.class final Lio/sentry/g4;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/sentry/g4$a;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/Deque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Deque<",
            "Lio/sentry/g4$a;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lio/sentry/g0;


# direct methods
.method public constructor <init>(Lio/sentry/g0;Lio/sentry/g4$a;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/concurrent/LinkedBlockingDeque;

    invoke-direct {v0}, Ljava/util/concurrent/LinkedBlockingDeque;-><init>()V

    iput-object v0, p0, Lio/sentry/g4;->a:Ljava/util/Deque;

    const-string v1, "logger is required"

    .line 3
    invoke-static {p1, v1}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/sentry/g0;

    iput-object p1, p0, Lio/sentry/g4;->b:Lio/sentry/g0;

    const-string p1, "rootStackItem is required"

    .line 4
    invoke-static {p2, p1}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/sentry/g4$a;

    invoke-interface {v0, p1}, Ljava/util/Deque;->push(Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Lio/sentry/g4;)V
    .locals 3

    .line 5
    iget-object v0, p1, Lio/sentry/g4;->b:Lio/sentry/g0;

    new-instance v1, Lio/sentry/g4$a;

    iget-object v2, p1, Lio/sentry/g4;->a:Ljava/util/Deque;

    invoke-interface {v2}, Ljava/util/Deque;->getLast()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/sentry/g4$a;

    invoke-direct {v1, v2}, Lio/sentry/g4$a;-><init>(Lio/sentry/g4$a;)V

    invoke-direct {p0, v0, v1}, Lio/sentry/g4;-><init>(Lio/sentry/g0;Lio/sentry/g4$a;)V

    .line 6
    iget-object p1, p1, Lio/sentry/g4;->a:Ljava/util/Deque;

    invoke-interface {p1}, Ljava/util/Deque;->descendingIterator()Ljava/util/Iterator;

    move-result-object p1

    .line 7
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 8
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 9
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 10
    new-instance v0, Lio/sentry/g4$a;

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/sentry/g4$a;

    invoke-direct {v0, v1}, Lio/sentry/g4$a;-><init>(Lio/sentry/g4$a;)V

    invoke-virtual {p0, v0}, Lio/sentry/g4;->c(Lio/sentry/g4$a;)V

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method a()Lio/sentry/g4$a;
    .locals 1

    iget-object v0, p0, Lio/sentry/g4;->a:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/g4$a;

    return-object v0
.end method

.method b()V
    .locals 5

    .line 1
    iget-object v0, p0, Lio/sentry/g4;->a:Ljava/util/Deque;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lio/sentry/g4;->a:Ljava/util/Deque;

    .line 5
    .line 6
    invoke-interface {v1}, Ljava/util/Deque;->size()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x1

    .line 11
    if-eq v1, v2, :cond_0

    .line 12
    .line 13
    iget-object v1, p0, Lio/sentry/g4;->a:Ljava/util/Deque;

    .line 14
    .line 15
    invoke-interface {v1}, Ljava/util/Deque;->pop()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-object v1, p0, Lio/sentry/g4;->b:Lio/sentry/g0;

    .line 20
    .line 21
    sget-object v2, Lio/sentry/n3;->WARNING:Lio/sentry/n3;

    .line 22
    .line 23
    const-string v3, "Attempt to pop the root scope."

    .line 24
    .line 25
    const/4 v4, 0x0

    .line 26
    new-array v4, v4, [Ljava/lang/Object;

    .line 27
    .line 28
    invoke-interface {v1, v2, v3, v4}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    monitor-exit v0

    .line 32
    return-void

    .line 33
    :catchall_0
    move-exception v1

    .line 34
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    throw v1
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

.method c(Lio/sentry/g4$a;)V
    .locals 1

    iget-object v0, p0, Lio/sentry/g4;->a:Ljava/util/Deque;

    invoke-interface {v0, p1}, Ljava/util/Deque;->push(Ljava/lang/Object;)V

    return-void
.end method
