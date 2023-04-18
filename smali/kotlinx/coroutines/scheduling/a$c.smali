.class public final Lkotlinx/coroutines/scheduling/a$c;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkotlinx/coroutines/scheduling/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "c"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u000e\u0008\u0080\u0004\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008@\u0010AB\u0011\u0008\u0016\u0012\u0006\u0010\'\u001a\u00020\u000e\u00a2\u0006\u0004\u0008@\u0010BJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\u0008\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\t\u0010\u0004J\u0017\u0010\u000c\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0007J\u000f\u0010\u0014\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0007J\u0017\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0011J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0017\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\nH\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0019\u0010\u001d\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001c\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u001d\u0010\u0019J\u0015\u0010 \u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001e\u00a2\u0006\u0004\u0008 \u0010!J\u000f\u0010\"\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\"\u0010\u0007J\u0015\u0010$\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u000e\u00a2\u0006\u0004\u0008$\u0010%J\u0017\u0010&\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0017\u001a\u00020\u0002\u00a2\u0006\u0004\u0008&\u0010\u0019R*\u0010(\u001a\u00020\u000e2\u0006\u0010\'\u001a\u00020\u000e8\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008(\u0010)\u001a\u0004\u0008*\u0010+\"\u0004\u0008,\u0010\u0011R\u0014\u0010/\u001a\u00020-8\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u0008$\u0010.R\u0016\u00101\u001a\u00020\u001e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0013\u00100R\u0016\u00104\u001a\u0002028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001a\u00103R$\u00106\u001a\u0004\u0018\u0001058\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u00086\u00107\u001a\u0004\u00088\u00109\"\u0004\u0008:\u0010;R\u0016\u0010<\u001a\u0002028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0006\u00103R\u0016\u0010=\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008,\u0010)R\u0016\u0010?\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0006\n\u0004\u0008:\u0010>\u00a8\u0006C"
    }
    d2 = {
        "Lkotlinx/coroutines/scheduling/a$c;",
        "Ljava/lang/Thread;",
        "",
        "q",
        "()Z",
        "",
        "n",
        "()V",
        "r",
        "j",
        "Lkotlinx/coroutines/scheduling/h;",
        "task",
        "d",
        "(Lkotlinx/coroutines/scheduling/h;)V",
        "",
        "taskMode",
        "c",
        "(I)V",
        "b",
        "l",
        "u",
        "mode",
        "i",
        "scanLocalQueue",
        "e",
        "(Z)Lkotlinx/coroutines/scheduling/h;",
        "m",
        "()Lkotlinx/coroutines/scheduling/h;",
        "blockingOnly",
        "t",
        "Lkotlinx/coroutines/scheduling/a$d;",
        "newState",
        "s",
        "(Lkotlinx/coroutines/scheduling/a$d;)Z",
        "run",
        "upperBound",
        "k",
        "(I)I",
        "f",
        "index",
        "indexInArray",
        "I",
        "g",
        "()I",
        "o",
        "Lkotlinx/coroutines/scheduling/o;",
        "Lkotlinx/coroutines/scheduling/o;",
        "localQueue",
        "Lkotlinx/coroutines/scheduling/a$d;",
        "state",
        "",
        "J",
        "terminationDeadline",
        "",
        "nextParkedWorker",
        "Ljava/lang/Object;",
        "h",
        "()Ljava/lang/Object;",
        "p",
        "(Ljava/lang/Object;)V",
        "minDelayUntilStealableTaskNs",
        "rngState",
        "Z",
        "mayHaveLocalTasks",
        "<init>",
        "(Lkotlinx/coroutines/scheduling/a;)V",
        "(Lkotlinx/coroutines/scheduling/a;I)V",
        "kotlinx-coroutines-core"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# static fields
.field static final synthetic r:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field private volatile indexInArray:I

.field public final k:Lkotlinx/coroutines/scheduling/o;

.field public l:Lkotlinx/coroutines/scheduling/a$d;

.field private m:J

.field private n:J

.field private volatile nextParkedWorker:Ljava/lang/Object;

.field private o:I

.field public p:Z

.field final synthetic q:Lkotlinx/coroutines/scheduling/a;

.field volatile synthetic workerCtl:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lkotlinx/coroutines/scheduling/a$c;

    const-string v1, "workerCtl"

    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, Lkotlinx/coroutines/scheduling/a$c;->r:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-void
.end method

.method private constructor <init>(Lkotlinx/coroutines/scheduling/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lkotlinx/coroutines/scheduling/a$c;->q:Lkotlinx/coroutines/scheduling/a;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    const/4 p1, 0x1

    .line 2
    invoke-virtual {p0, p1}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 3
    new-instance p1, Lkotlinx/coroutines/scheduling/o;

    invoke-direct {p1}, Lkotlinx/coroutines/scheduling/o;-><init>()V

    iput-object p1, p0, Lkotlinx/coroutines/scheduling/a$c;->k:Lkotlinx/coroutines/scheduling/o;

    .line 4
    sget-object p1, Lkotlinx/coroutines/scheduling/a$d;->n:Lkotlinx/coroutines/scheduling/a$d;

    iput-object p1, p0, Lkotlinx/coroutines/scheduling/a$c;->l:Lkotlinx/coroutines/scheduling/a$d;

    const/4 p1, 0x0

    .line 5
    iput p1, p0, Lkotlinx/coroutines/scheduling/a$c;->workerCtl:I

    .line 6
    sget-object p1, Lkotlinx/coroutines/scheduling/a;->v:Lkotlinx/coroutines/internal/d0;

    iput-object p1, p0, Lkotlinx/coroutines/scheduling/a$c;->nextParkedWorker:Ljava/lang/Object;

    .line 7
    sget-object p1, Lag/c;->k:Lag/c$a;

    invoke-virtual {p1}, Lag/c$a;->c()I

    move-result p1

    iput p1, p0, Lkotlinx/coroutines/scheduling/a$c;->o:I

    return-void
.end method

.method public constructor <init>(Lkotlinx/coroutines/scheduling/a;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 8
    invoke-direct {p0, p1}, Lkotlinx/coroutines/scheduling/a$c;-><init>(Lkotlinx/coroutines/scheduling/a;)V

    .line 9
    invoke-virtual {p0, p2}, Lkotlinx/coroutines/scheduling/a$c;->o(I)V

    return-void
.end method

.method public static final synthetic a(Lkotlinx/coroutines/scheduling/a$c;)Lkotlinx/coroutines/scheduling/a;
    .locals 0

    iget-object p0, p0, Lkotlinx/coroutines/scheduling/a$c;->q:Lkotlinx/coroutines/scheduling/a;

    return-object p0
.end method

.method private final b(I)V
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    iget-object p1, p0, Lkotlinx/coroutines/scheduling/a$c;->q:Lkotlinx/coroutines/scheduling/a;

    .line 5
    .line 6
    sget-object v0, Lkotlinx/coroutines/scheduling/a;->t:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 7
    .line 8
    const-wide/32 v1, -0x200000

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1, v1, v2}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->addAndGet(Ljava/lang/Object;J)J

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lkotlinx/coroutines/scheduling/a$c;->l:Lkotlinx/coroutines/scheduling/a$d;

    .line 15
    .line 16
    sget-object v0, Lkotlinx/coroutines/scheduling/a$d;->o:Lkotlinx/coroutines/scheduling/a$d;

    .line 17
    .line 18
    if-eq p1, v0, :cond_1

    .line 19
    .line 20
    sget-object p1, Lkotlinx/coroutines/scheduling/a$d;->n:Lkotlinx/coroutines/scheduling/a$d;

    .line 21
    .line 22
    iput-object p1, p0, Lkotlinx/coroutines/scheduling/a$c;->l:Lkotlinx/coroutines/scheduling/a$d;

    .line 23
    .line 24
    :cond_1
    return-void
    .line 25
    .line 26
    .line 27
.end method

.method private final c(I)V
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    sget-object p1, Lkotlinx/coroutines/scheduling/a$d;->l:Lkotlinx/coroutines/scheduling/a$d;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lkotlinx/coroutines/scheduling/a$c;->s(Lkotlinx/coroutines/scheduling/a$d;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    iget-object p1, p0, Lkotlinx/coroutines/scheduling/a$c;->q:Lkotlinx/coroutines/scheduling/a;

    .line 13
    .line 14
    invoke-virtual {p1}, Lkotlinx/coroutines/scheduling/a;->Q()V

    .line 15
    .line 16
    .line 17
    :cond_1
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
.end method

.method private final d(Lkotlinx/coroutines/scheduling/h;)V
    .locals 2

    .line 1
    iget-object v0, p1, Lkotlinx/coroutines/scheduling/h;->l:Lkotlinx/coroutines/scheduling/i;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlinx/coroutines/scheduling/i;->b()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-direct {p0, v0}, Lkotlinx/coroutines/scheduling/a$c;->i(I)V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0, v0}, Lkotlinx/coroutines/scheduling/a$c;->c(I)V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lkotlinx/coroutines/scheduling/a$c;->q:Lkotlinx/coroutines/scheduling/a;

    .line 14
    .line 15
    invoke-virtual {v1, p1}, Lkotlinx/coroutines/scheduling/a;->y(Lkotlinx/coroutines/scheduling/h;)V

    .line 16
    .line 17
    .line 18
    invoke-direct {p0, v0}, Lkotlinx/coroutines/scheduling/a$c;->b(I)V

    .line 19
    .line 20
    .line 21
    return-void
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method private final e(Z)Lkotlinx/coroutines/scheduling/h;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_3

    .line 3
    .line 4
    iget-object p1, p0, Lkotlinx/coroutines/scheduling/a$c;->q:Lkotlinx/coroutines/scheduling/a;

    .line 5
    .line 6
    iget p1, p1, Lkotlinx/coroutines/scheduling/a;->k:I

    .line 7
    .line 8
    mul-int/lit8 p1, p1, 0x2

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lkotlinx/coroutines/scheduling/a$c;->k(I)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-nez p1, :cond_0

    .line 15
    .line 16
    const/4 p1, 0x1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move p1, v0

    .line 19
    :goto_0
    if-eqz p1, :cond_1

    .line 20
    .line 21
    invoke-direct {p0}, Lkotlinx/coroutines/scheduling/a$c;->m()Lkotlinx/coroutines/scheduling/h;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    return-object v1

    .line 28
    :cond_1
    iget-object v1, p0, Lkotlinx/coroutines/scheduling/a$c;->k:Lkotlinx/coroutines/scheduling/o;

    .line 29
    .line 30
    invoke-virtual {v1}, Lkotlinx/coroutines/scheduling/o;->h()Lkotlinx/coroutines/scheduling/h;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    if-eqz v1, :cond_2

    .line 35
    .line 36
    return-object v1

    .line 37
    :cond_2
    if-nez p1, :cond_4

    .line 38
    .line 39
    invoke-direct {p0}, Lkotlinx/coroutines/scheduling/a$c;->m()Lkotlinx/coroutines/scheduling/h;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    if-eqz p1, :cond_4

    .line 44
    .line 45
    return-object p1

    .line 46
    :cond_3
    invoke-direct {p0}, Lkotlinx/coroutines/scheduling/a$c;->m()Lkotlinx/coroutines/scheduling/h;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    if-eqz p1, :cond_4

    .line 51
    .line 52
    return-object p1

    .line 53
    :cond_4
    invoke-direct {p0, v0}, Lkotlinx/coroutines/scheduling/a$c;->t(Z)Lkotlinx/coroutines/scheduling/h;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    return-object p1
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

.method private final i(I)V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    iput-wide v0, p0, Lkotlinx/coroutines/scheduling/a$c;->m:J

    .line 4
    .line 5
    iget-object p1, p0, Lkotlinx/coroutines/scheduling/a$c;->l:Lkotlinx/coroutines/scheduling/a$d;

    .line 6
    .line 7
    sget-object v0, Lkotlinx/coroutines/scheduling/a$d;->m:Lkotlinx/coroutines/scheduling/a$d;

    .line 8
    .line 9
    if-ne p1, v0, :cond_0

    .line 10
    .line 11
    sget-object p1, Lkotlinx/coroutines/scheduling/a$d;->l:Lkotlinx/coroutines/scheduling/a$d;

    .line 12
    .line 13
    iput-object p1, p0, Lkotlinx/coroutines/scheduling/a$c;->l:Lkotlinx/coroutines/scheduling/a$d;

    .line 14
    .line 15
    :cond_0
    return-void
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

.method private final j()Z
    .locals 2

    iget-object v0, p0, Lkotlinx/coroutines/scheduling/a$c;->nextParkedWorker:Ljava/lang/Object;

    sget-object v1, Lkotlinx/coroutines/scheduling/a;->v:Lkotlinx/coroutines/internal/d0;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private final l()V
    .locals 6

    .line 1
    iget-wide v0, p0, Lkotlinx/coroutines/scheduling/a$c;->m:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    iget-object v4, p0, Lkotlinx/coroutines/scheduling/a$c;->q:Lkotlinx/coroutines/scheduling/a;

    .line 14
    .line 15
    iget-wide v4, v4, Lkotlinx/coroutines/scheduling/a;->m:J

    .line 16
    .line 17
    add-long/2addr v0, v4

    .line 18
    iput-wide v0, p0, Lkotlinx/coroutines/scheduling/a$c;->m:J

    .line 19
    .line 20
    :cond_0
    iget-object v0, p0, Lkotlinx/coroutines/scheduling/a$c;->q:Lkotlinx/coroutines/scheduling/a;

    .line 21
    .line 22
    iget-wide v0, v0, Lkotlinx/coroutines/scheduling/a;->m:J

    .line 23
    .line 24
    invoke-static {v0, v1}, Ljava/util/concurrent/locks/LockSupport;->parkNanos(J)V

    .line 25
    .line 26
    .line 27
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 28
    .line 29
    .line 30
    move-result-wide v0

    .line 31
    iget-wide v4, p0, Lkotlinx/coroutines/scheduling/a$c;->m:J

    .line 32
    .line 33
    sub-long/2addr v0, v4

    .line 34
    cmp-long v0, v0, v2

    .line 35
    .line 36
    if-ltz v0, :cond_1

    .line 37
    .line 38
    iput-wide v2, p0, Lkotlinx/coroutines/scheduling/a$c;->m:J

    .line 39
    .line 40
    invoke-direct {p0}, Lkotlinx/coroutines/scheduling/a$c;->u()V

    .line 41
    .line 42
    .line 43
    :cond_1
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
.end method

.method private final m()Lkotlinx/coroutines/scheduling/h;
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-virtual {p0, v0}, Lkotlinx/coroutines/scheduling/a$c;->k(I)I

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    iget-object v0, p0, Lkotlinx/coroutines/scheduling/a$c;->q:Lkotlinx/coroutines/scheduling/a;

    .line 9
    .line 10
    iget-object v0, v0, Lkotlinx/coroutines/scheduling/a;->o:Lkotlinx/coroutines/scheduling/d;

    .line 11
    .line 12
    invoke-virtual {v0}, Lkotlinx/coroutines/internal/r;->d()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Lkotlinx/coroutines/scheduling/h;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    return-object v0

    .line 21
    :cond_0
    iget-object v0, p0, Lkotlinx/coroutines/scheduling/a$c;->q:Lkotlinx/coroutines/scheduling/a;

    .line 22
    .line 23
    iget-object v0, v0, Lkotlinx/coroutines/scheduling/a;->p:Lkotlinx/coroutines/scheduling/d;

    .line 24
    .line 25
    invoke-virtual {v0}, Lkotlinx/coroutines/internal/r;->d()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Lkotlinx/coroutines/scheduling/h;

    .line 30
    .line 31
    return-object v0

    .line 32
    :cond_1
    iget-object v0, p0, Lkotlinx/coroutines/scheduling/a$c;->q:Lkotlinx/coroutines/scheduling/a;

    .line 33
    .line 34
    iget-object v0, v0, Lkotlinx/coroutines/scheduling/a;->p:Lkotlinx/coroutines/scheduling/d;

    .line 35
    .line 36
    invoke-virtual {v0}, Lkotlinx/coroutines/internal/r;->d()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, Lkotlinx/coroutines/scheduling/h;

    .line 41
    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    return-object v0

    .line 45
    :cond_2
    iget-object v0, p0, Lkotlinx/coroutines/scheduling/a$c;->q:Lkotlinx/coroutines/scheduling/a;

    .line 46
    .line 47
    iget-object v0, v0, Lkotlinx/coroutines/scheduling/a;->o:Lkotlinx/coroutines/scheduling/d;

    .line 48
    .line 49
    invoke-virtual {v0}, Lkotlinx/coroutines/internal/r;->d()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    check-cast v0, Lkotlinx/coroutines/scheduling/h;

    .line 54
    .line 55
    return-object v0
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

.method private final n()V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    move v1, v0

    .line 3
    :goto_1
    iget-object v2, p0, Lkotlinx/coroutines/scheduling/a$c;->q:Lkotlinx/coroutines/scheduling/a;

    .line 4
    .line 5
    invoke-virtual {v2}, Lkotlinx/coroutines/scheduling/a;->isTerminated()Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-nez v2, :cond_3

    .line 10
    .line 11
    iget-object v2, p0, Lkotlinx/coroutines/scheduling/a$c;->l:Lkotlinx/coroutines/scheduling/a$d;

    .line 12
    .line 13
    sget-object v3, Lkotlinx/coroutines/scheduling/a$d;->o:Lkotlinx/coroutines/scheduling/a$d;

    .line 14
    .line 15
    if-eq v2, v3, :cond_3

    .line 16
    .line 17
    iget-boolean v2, p0, Lkotlinx/coroutines/scheduling/a$c;->p:Z

    .line 18
    .line 19
    invoke-virtual {p0, v2}, Lkotlinx/coroutines/scheduling/a$c;->f(Z)Lkotlinx/coroutines/scheduling/h;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    const-wide/16 v3, 0x0

    .line 24
    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    iput-wide v3, p0, Lkotlinx/coroutines/scheduling/a$c;->n:J

    .line 28
    .line 29
    invoke-direct {p0, v2}, Lkotlinx/coroutines/scheduling/a$c;->d(Lkotlinx/coroutines/scheduling/h;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    iput-boolean v0, p0, Lkotlinx/coroutines/scheduling/a$c;->p:Z

    .line 34
    .line 35
    iget-wide v5, p0, Lkotlinx/coroutines/scheduling/a$c;->n:J

    .line 36
    .line 37
    cmp-long v2, v5, v3

    .line 38
    .line 39
    if-eqz v2, :cond_2

    .line 40
    .line 41
    if-nez v1, :cond_1

    .line 42
    .line 43
    const/4 v1, 0x1

    .line 44
    goto :goto_1

    .line 45
    :cond_1
    sget-object v1, Lkotlinx/coroutines/scheduling/a$d;->m:Lkotlinx/coroutines/scheduling/a$d;

    .line 46
    .line 47
    invoke-virtual {p0, v1}, Lkotlinx/coroutines/scheduling/a$c;->s(Lkotlinx/coroutines/scheduling/a$d;)Z

    .line 48
    .line 49
    .line 50
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    .line 51
    .line 52
    .line 53
    iget-wide v1, p0, Lkotlinx/coroutines/scheduling/a$c;->n:J

    .line 54
    .line 55
    invoke-static {v1, v2}, Ljava/util/concurrent/locks/LockSupport;->parkNanos(J)V

    .line 56
    .line 57
    .line 58
    iput-wide v3, p0, Lkotlinx/coroutines/scheduling/a$c;->n:J

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    invoke-direct {p0}, Lkotlinx/coroutines/scheduling/a$c;->r()V

    .line 62
    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_3
    sget-object v0, Lkotlinx/coroutines/scheduling/a$d;->o:Lkotlinx/coroutines/scheduling/a$d;

    .line 66
    .line 67
    invoke-virtual {p0, v0}, Lkotlinx/coroutines/scheduling/a$c;->s(Lkotlinx/coroutines/scheduling/a$d;)Z

    .line 68
    .line 69
    .line 70
    return-void
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

.method private final q()Z
    .locals 10

    .line 1
    iget-object v0, p0, Lkotlinx/coroutines/scheduling/a$c;->l:Lkotlinx/coroutines/scheduling/a$d;

    .line 2
    .line 3
    sget-object v1, Lkotlinx/coroutines/scheduling/a$d;->k:Lkotlinx/coroutines/scheduling/a$d;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_0
    iget-object v0, p0, Lkotlinx/coroutines/scheduling/a$c;->q:Lkotlinx/coroutines/scheduling/a;

    .line 10
    .line 11
    :cond_1
    iget-wide v5, v0, Lkotlinx/coroutines/scheduling/a;->controlState:J

    .line 12
    .line 13
    const-wide v3, 0x7ffffc0000000000L

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    and-long/2addr v3, v5

    .line 19
    const/16 v1, 0x2a

    .line 20
    .line 21
    shr-long/2addr v3, v1

    .line 22
    long-to-int v1, v3

    .line 23
    const/4 v9, 0x0

    .line 24
    if-nez v1, :cond_2

    .line 25
    .line 26
    move v0, v9

    .line 27
    goto :goto_0

    .line 28
    :cond_2
    const-wide v3, 0x40000000000L

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    sub-long v7, v5, v3

    .line 34
    .line 35
    sget-object v3, Lkotlinx/coroutines/scheduling/a;->t:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 36
    .line 37
    move-object v4, v0

    .line 38
    invoke-virtual/range {v3 .. v8}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_1

    .line 43
    .line 44
    move v0, v2

    .line 45
    :goto_0
    if-eqz v0, :cond_3

    .line 46
    .line 47
    sget-object v0, Lkotlinx/coroutines/scheduling/a$d;->k:Lkotlinx/coroutines/scheduling/a$d;

    .line 48
    .line 49
    iput-object v0, p0, Lkotlinx/coroutines/scheduling/a$c;->l:Lkotlinx/coroutines/scheduling/a$d;

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_3
    move v2, v9

    .line 53
    :goto_1
    return v2
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

.method private final r()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lkotlinx/coroutines/scheduling/a$c;->j()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lkotlinx/coroutines/scheduling/a$c;->q:Lkotlinx/coroutines/scheduling/a;

    .line 8
    .line 9
    invoke-virtual {v0, p0}, Lkotlinx/coroutines/scheduling/a;->w(Lkotlinx/coroutines/scheduling/a$c;)Z

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    const/4 v0, -0x1

    .line 14
    iput v0, p0, Lkotlinx/coroutines/scheduling/a$c;->workerCtl:I

    .line 15
    .line 16
    :goto_0
    invoke-direct {p0}, Lkotlinx/coroutines/scheduling/a$c;->j()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_2

    .line 21
    .line 22
    iget v1, p0, Lkotlinx/coroutines/scheduling/a$c;->workerCtl:I

    .line 23
    .line 24
    if-ne v1, v0, :cond_2

    .line 25
    .line 26
    iget-object v1, p0, Lkotlinx/coroutines/scheduling/a$c;->q:Lkotlinx/coroutines/scheduling/a;

    .line 27
    .line 28
    invoke-virtual {v1}, Lkotlinx/coroutines/scheduling/a;->isTerminated()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_2

    .line 33
    .line 34
    iget-object v1, p0, Lkotlinx/coroutines/scheduling/a$c;->l:Lkotlinx/coroutines/scheduling/a$d;

    .line 35
    .line 36
    sget-object v2, Lkotlinx/coroutines/scheduling/a$d;->o:Lkotlinx/coroutines/scheduling/a$d;

    .line 37
    .line 38
    if-ne v1, v2, :cond_1

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    sget-object v1, Lkotlinx/coroutines/scheduling/a$d;->m:Lkotlinx/coroutines/scheduling/a$d;

    .line 42
    .line 43
    invoke-virtual {p0, v1}, Lkotlinx/coroutines/scheduling/a$c;->s(Lkotlinx/coroutines/scheduling/a$d;)Z

    .line 44
    .line 45
    .line 46
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    .line 47
    .line 48
    .line 49
    invoke-direct {p0}, Lkotlinx/coroutines/scheduling/a$c;->l()V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    :goto_1
    return-void
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

.method private final t(Z)Lkotlinx/coroutines/scheduling/h;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lkotlinx/coroutines/scheduling/a$c;->q:Lkotlinx/coroutines/scheduling/a;

    .line 4
    .line 5
    iget-wide v1, v1, Lkotlinx/coroutines/scheduling/a;->controlState:J

    .line 6
    .line 7
    const-wide/32 v3, 0x1fffff

    .line 8
    .line 9
    .line 10
    and-long/2addr v1, v3

    .line 11
    long-to-int v1, v1

    .line 12
    const/4 v2, 0x2

    .line 13
    const/4 v3, 0x0

    .line 14
    if-ge v1, v2, :cond_0

    .line 15
    .line 16
    return-object v3

    .line 17
    :cond_0
    invoke-virtual {v0, v1}, Lkotlinx/coroutines/scheduling/a$c;->k(I)I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    iget-object v4, v0, Lkotlinx/coroutines/scheduling/a$c;->q:Lkotlinx/coroutines/scheduling/a;

    .line 22
    .line 23
    const-wide v5, 0x7fffffffffffffffL

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    const/4 v7, 0x0

    .line 29
    move-wide v8, v5

    .line 30
    :goto_0
    const-wide/16 v10, 0x0

    .line 31
    .line 32
    if-ge v7, v1, :cond_5

    .line 33
    .line 34
    const/4 v12, 0x1

    .line 35
    add-int/2addr v2, v12

    .line 36
    if-le v2, v1, :cond_1

    .line 37
    .line 38
    move v2, v12

    .line 39
    :cond_1
    iget-object v12, v4, Lkotlinx/coroutines/scheduling/a;->q:Lkotlinx/coroutines/internal/a0;

    .line 40
    .line 41
    invoke-virtual {v12, v2}, Lkotlinx/coroutines/internal/a0;->b(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v12

    .line 45
    check-cast v12, Lkotlinx/coroutines/scheduling/a$c;

    .line 46
    .line 47
    if-eqz v12, :cond_4

    .line 48
    .line 49
    if-eq v12, v0, :cond_4

    .line 50
    .line 51
    if-eqz p1, :cond_2

    .line 52
    .line 53
    iget-object v13, v0, Lkotlinx/coroutines/scheduling/a$c;->k:Lkotlinx/coroutines/scheduling/o;

    .line 54
    .line 55
    iget-object v12, v12, Lkotlinx/coroutines/scheduling/a$c;->k:Lkotlinx/coroutines/scheduling/o;

    .line 56
    .line 57
    invoke-virtual {v13, v12}, Lkotlinx/coroutines/scheduling/o;->k(Lkotlinx/coroutines/scheduling/o;)J

    .line 58
    .line 59
    .line 60
    move-result-wide v12

    .line 61
    goto :goto_1

    .line 62
    :cond_2
    iget-object v13, v0, Lkotlinx/coroutines/scheduling/a$c;->k:Lkotlinx/coroutines/scheduling/o;

    .line 63
    .line 64
    iget-object v12, v12, Lkotlinx/coroutines/scheduling/a$c;->k:Lkotlinx/coroutines/scheduling/o;

    .line 65
    .line 66
    invoke-virtual {v13, v12}, Lkotlinx/coroutines/scheduling/o;->l(Lkotlinx/coroutines/scheduling/o;)J

    .line 67
    .line 68
    .line 69
    move-result-wide v12

    .line 70
    :goto_1
    const-wide/16 v14, -0x1

    .line 71
    .line 72
    cmp-long v14, v12, v14

    .line 73
    .line 74
    if-nez v14, :cond_3

    .line 75
    .line 76
    iget-object v1, v0, Lkotlinx/coroutines/scheduling/a$c;->k:Lkotlinx/coroutines/scheduling/o;

    .line 77
    .line 78
    invoke-virtual {v1}, Lkotlinx/coroutines/scheduling/o;->h()Lkotlinx/coroutines/scheduling/h;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    return-object v1

    .line 83
    :cond_3
    cmp-long v10, v12, v10

    .line 84
    .line 85
    if-lez v10, :cond_4

    .line 86
    .line 87
    invoke-static {v8, v9, v12, v13}, Ljava/lang/Math;->min(JJ)J

    .line 88
    .line 89
    .line 90
    move-result-wide v8

    .line 91
    :cond_4
    add-int/lit8 v7, v7, 0x1

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_5
    cmp-long v1, v8, v5

    .line 95
    .line 96
    if-eqz v1, :cond_6

    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_6
    move-wide v8, v10

    .line 100
    :goto_2
    iput-wide v8, v0, Lkotlinx/coroutines/scheduling/a$c;->n:J

    .line 101
    .line 102
    return-object v3
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
.end method

.method private final u()V
    .locals 8

    .line 1
    iget-object v0, p0, Lkotlinx/coroutines/scheduling/a$c;->q:Lkotlinx/coroutines/scheduling/a;

    .line 2
    .line 3
    iget-object v1, v0, Lkotlinx/coroutines/scheduling/a;->q:Lkotlinx/coroutines/internal/a0;

    .line 4
    .line 5
    monitor-enter v1

    .line 6
    :try_start_0
    invoke-virtual {v0}, Lkotlinx/coroutines/scheduling/a;->isTerminated()Z

    .line 7
    .line 8
    .line 9
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    monitor-exit v1

    .line 13
    return-void

    .line 14
    :cond_0
    :try_start_1
    iget-wide v2, v0, Lkotlinx/coroutines/scheduling/a;->controlState:J

    .line 15
    .line 16
    const-wide/32 v4, 0x1fffff

    .line 17
    .line 18
    .line 19
    and-long/2addr v2, v4

    .line 20
    long-to-int v2, v2

    .line 21
    iget v3, v0, Lkotlinx/coroutines/scheduling/a;->k:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    .line 23
    if-gt v2, v3, :cond_1

    .line 24
    .line 25
    monitor-exit v1

    .line 26
    return-void

    .line 27
    :cond_1
    :try_start_2
    sget-object v2, Lkotlinx/coroutines/scheduling/a$c;->r:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 28
    .line 29
    const/4 v3, -0x1

    .line 30
    const/4 v6, 0x1

    .line 31
    invoke-virtual {v2, p0, v3, v6}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    .line 32
    .line 33
    .line 34
    move-result v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 35
    if-nez v2, :cond_2

    .line 36
    .line 37
    monitor-exit v1

    .line 38
    return-void

    .line 39
    :cond_2
    :try_start_3
    iget v2, p0, Lkotlinx/coroutines/scheduling/a$c;->indexInArray:I

    .line 40
    .line 41
    const/4 v3, 0x0

    .line 42
    invoke-virtual {p0, v3}, Lkotlinx/coroutines/scheduling/a$c;->o(I)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, p0, v2, v3}, Lkotlinx/coroutines/scheduling/a;->x(Lkotlinx/coroutines/scheduling/a$c;II)V

    .line 46
    .line 47
    .line 48
    sget-object v3, Lkotlinx/coroutines/scheduling/a;->t:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 49
    .line 50
    invoke-virtual {v3, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndDecrement(Ljava/lang/Object;)J

    .line 51
    .line 52
    .line 53
    move-result-wide v6

    .line 54
    and-long v3, v6, v4

    .line 55
    .line 56
    long-to-int v3, v3

    .line 57
    if-eq v3, v2, :cond_3

    .line 58
    .line 59
    iget-object v4, v0, Lkotlinx/coroutines/scheduling/a;->q:Lkotlinx/coroutines/internal/a0;

    .line 60
    .line 61
    invoke-virtual {v4, v3}, Lkotlinx/coroutines/internal/a0;->b(I)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    invoke-static {v4}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    check-cast v4, Lkotlinx/coroutines/scheduling/a$c;

    .line 69
    .line 70
    iget-object v5, v0, Lkotlinx/coroutines/scheduling/a;->q:Lkotlinx/coroutines/internal/a0;

    .line 71
    .line 72
    invoke-virtual {v5, v2, v4}, Lkotlinx/coroutines/internal/a0;->c(ILjava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v4, v2}, Lkotlinx/coroutines/scheduling/a$c;->o(I)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, v4, v3, v2}, Lkotlinx/coroutines/scheduling/a;->x(Lkotlinx/coroutines/scheduling/a$c;II)V

    .line 79
    .line 80
    .line 81
    :cond_3
    iget-object v0, v0, Lkotlinx/coroutines/scheduling/a;->q:Lkotlinx/coroutines/internal/a0;

    .line 82
    .line 83
    const/4 v2, 0x0

    .line 84
    invoke-virtual {v0, v3, v2}, Lkotlinx/coroutines/internal/a0;->c(ILjava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 88
    .line 89
    monitor-exit v1

    .line 90
    sget-object v0, Lkotlinx/coroutines/scheduling/a$d;->o:Lkotlinx/coroutines/scheduling/a$d;

    .line 91
    .line 92
    iput-object v0, p0, Lkotlinx/coroutines/scheduling/a$c;->l:Lkotlinx/coroutines/scheduling/a$d;

    .line 93
    .line 94
    return-void

    .line 95
    :catchall_0
    move-exception v0

    .line 96
    monitor-exit v1

    .line 97
    throw v0
.end method


# virtual methods
.method public final f(Z)Lkotlinx/coroutines/scheduling/h;
    .locals 1

    .line 1
    invoke-direct {p0}, Lkotlinx/coroutines/scheduling/a$c;->q()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-direct {p0, p1}, Lkotlinx/coroutines/scheduling/a$c;->e(Z)Lkotlinx/coroutines/scheduling/h;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1

    .line 12
    :cond_0
    if-eqz p1, :cond_1

    .line 13
    .line 14
    iget-object p1, p0, Lkotlinx/coroutines/scheduling/a$c;->k:Lkotlinx/coroutines/scheduling/o;

    .line 15
    .line 16
    invoke-virtual {p1}, Lkotlinx/coroutines/scheduling/o;->h()Lkotlinx/coroutines/scheduling/h;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    if-nez p1, :cond_2

    .line 21
    .line 22
    iget-object p1, p0, Lkotlinx/coroutines/scheduling/a$c;->q:Lkotlinx/coroutines/scheduling/a;

    .line 23
    .line 24
    iget-object p1, p1, Lkotlinx/coroutines/scheduling/a;->p:Lkotlinx/coroutines/scheduling/d;

    .line 25
    .line 26
    invoke-virtual {p1}, Lkotlinx/coroutines/internal/r;->d()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    check-cast p1, Lkotlinx/coroutines/scheduling/h;

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    iget-object p1, p0, Lkotlinx/coroutines/scheduling/a$c;->q:Lkotlinx/coroutines/scheduling/a;

    .line 34
    .line 35
    iget-object p1, p1, Lkotlinx/coroutines/scheduling/a;->p:Lkotlinx/coroutines/scheduling/d;

    .line 36
    .line 37
    invoke-virtual {p1}, Lkotlinx/coroutines/internal/r;->d()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    check-cast p1, Lkotlinx/coroutines/scheduling/h;

    .line 42
    .line 43
    :cond_2
    :goto_0
    if-nez p1, :cond_3

    .line 44
    .line 45
    const/4 p1, 0x1

    .line 46
    invoke-direct {p0, p1}, Lkotlinx/coroutines/scheduling/a$c;->t(Z)Lkotlinx/coroutines/scheduling/h;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    :cond_3
    return-object p1
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

.method public final g()I
    .locals 1

    iget v0, p0, Lkotlinx/coroutines/scheduling/a$c;->indexInArray:I

    return v0
.end method

.method public final h()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lkotlinx/coroutines/scheduling/a$c;->nextParkedWorker:Ljava/lang/Object;

    return-object v0
.end method

.method public final k(I)I
    .locals 3

    .line 1
    iget v0, p0, Lkotlinx/coroutines/scheduling/a$c;->o:I

    .line 2
    .line 3
    shl-int/lit8 v1, v0, 0xd

    .line 4
    .line 5
    xor-int/2addr v0, v1

    .line 6
    shr-int/lit8 v1, v0, 0x11

    .line 7
    .line 8
    xor-int/2addr v0, v1

    .line 9
    shl-int/lit8 v1, v0, 0x5

    .line 10
    .line 11
    xor-int/2addr v0, v1

    .line 12
    iput v0, p0, Lkotlinx/coroutines/scheduling/a$c;->o:I

    .line 13
    .line 14
    add-int/lit8 v1, p1, -0x1

    .line 15
    .line 16
    and-int v2, v1, p1

    .line 17
    .line 18
    if-nez v2, :cond_0

    .line 19
    .line 20
    and-int p1, v0, v1

    .line 21
    .line 22
    return p1

    .line 23
    :cond_0
    const v1, 0x7fffffff

    .line 24
    .line 25
    .line 26
    and-int/2addr v0, v1

    .line 27
    rem-int/2addr v0, p1

    .line 28
    return v0
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
.end method

.method public final o(I)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lkotlinx/coroutines/scheduling/a$c;->q:Lkotlinx/coroutines/scheduling/a;

    .line 7
    .line 8
    iget-object v1, v1, Lkotlinx/coroutines/scheduling/a;->n:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, "-worker-"

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    if-nez p1, :cond_0

    .line 19
    .line 20
    const-string v1, "TERMINATED"

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {p0, v0}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iput p1, p0, Lkotlinx/coroutines/scheduling/a$c;->indexInArray:I

    .line 38
    .line 39
    return-void
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

.method public final p(Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lkotlinx/coroutines/scheduling/a$c;->nextParkedWorker:Ljava/lang/Object;

    return-void
.end method

.method public run()V
    .locals 0

    invoke-direct {p0}, Lkotlinx/coroutines/scheduling/a$c;->n()V

    return-void
.end method

.method public final s(Lkotlinx/coroutines/scheduling/a$d;)Z
    .locals 6

    .line 1
    iget-object v0, p0, Lkotlinx/coroutines/scheduling/a$c;->l:Lkotlinx/coroutines/scheduling/a$d;

    .line 2
    .line 3
    sget-object v1, Lkotlinx/coroutines/scheduling/a$d;->k:Lkotlinx/coroutines/scheduling/a$d;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v1, 0x0

    .line 10
    :goto_0
    if-eqz v1, :cond_1

    .line 11
    .line 12
    iget-object v2, p0, Lkotlinx/coroutines/scheduling/a$c;->q:Lkotlinx/coroutines/scheduling/a;

    .line 13
    .line 14
    sget-object v3, Lkotlinx/coroutines/scheduling/a;->t:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 15
    .line 16
    const-wide v4, 0x40000000000L

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    invoke-virtual {v3, v2, v4, v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->addAndGet(Ljava/lang/Object;J)J

    .line 22
    .line 23
    .line 24
    :cond_1
    if-eq v0, p1, :cond_2

    .line 25
    .line 26
    iput-object p1, p0, Lkotlinx/coroutines/scheduling/a$c;->l:Lkotlinx/coroutines/scheduling/a$d;

    .line 27
    .line 28
    :cond_2
    return v1
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
.end method
