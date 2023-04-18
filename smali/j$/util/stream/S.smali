.class final Lj$/util/stream/S;
.super Ljava/util/concurrent/CountedCompleter;
.source "SourceFile"


# instance fields
.field private a:Lj$/util/Spliterator;

.field private final b:Lj$/util/stream/e2;

.field private final c:Lj$/util/stream/t0;

.field private d:J


# direct methods
.method constructor <init>(Lj$/util/stream/S;Lj$/util/Spliterator;)V
    .locals 2

    invoke-direct {p0, p1}, Ljava/util/concurrent/CountedCompleter;-><init>(Ljava/util/concurrent/CountedCompleter;)V

    iput-object p2, p0, Lj$/util/stream/S;->a:Lj$/util/Spliterator;

    iget-object p2, p1, Lj$/util/stream/S;->b:Lj$/util/stream/e2;

    iput-object p2, p0, Lj$/util/stream/S;->b:Lj$/util/stream/e2;

    iget-wide v0, p1, Lj$/util/stream/S;->d:J

    iput-wide v0, p0, Lj$/util/stream/S;->d:J

    iget-object p1, p1, Lj$/util/stream/S;->c:Lj$/util/stream/t0;

    iput-object p1, p0, Lj$/util/stream/S;->c:Lj$/util/stream/t0;

    return-void
.end method

.method constructor <init>(Lj$/util/stream/t0;Lj$/util/Spliterator;Lj$/util/stream/e2;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ljava/util/concurrent/CountedCompleter;-><init>(Ljava/util/concurrent/CountedCompleter;)V

    iput-object p3, p0, Lj$/util/stream/S;->b:Lj$/util/stream/e2;

    iput-object p1, p0, Lj$/util/stream/S;->c:Lj$/util/stream/t0;

    iput-object p2, p0, Lj$/util/stream/S;->a:Lj$/util/Spliterator;

    const-wide/16 p1, 0x0

    iput-wide p1, p0, Lj$/util/stream/S;->d:J

    return-void
.end method


# virtual methods
.method public final compute()V
    .locals 12

    iget-object v0, p0, Lj$/util/stream/S;->a:Lj$/util/Spliterator;

    invoke-interface {v0}, Lj$/util/Spliterator;->estimateSize()J

    move-result-wide v1

    iget-wide v3, p0, Lj$/util/stream/S;->d:J

    const-wide/16 v5, 0x0

    cmp-long v5, v3, v5

    if-nez v5, :cond_0

    invoke-static {v1, v2}, Lj$/util/stream/f;->f(J)J

    move-result-wide v3

    iput-wide v3, p0, Lj$/util/stream/S;->d:J

    :cond_0
    sget-object v5, Lj$/util/stream/S2;->SHORT_CIRCUIT:Lj$/util/stream/S2;

    iget-object v6, p0, Lj$/util/stream/S;->c:Lj$/util/stream/t0;

    invoke-virtual {v6}, Lj$/util/stream/t0;->A0()I

    move-result v6

    invoke-virtual {v5, v6}, Lj$/util/stream/S2;->d(I)Z

    move-result v5

    iget-object v6, p0, Lj$/util/stream/S;->b:Lj$/util/stream/e2;

    const/4 v7, 0x0

    move-object v8, p0

    :goto_0
    if-eqz v5, :cond_1

    invoke-interface {v6}, Lj$/util/stream/e2;->e()Z

    move-result v9

    if-nez v9, :cond_5

    :cond_1
    cmp-long v1, v1, v3

    if-lez v1, :cond_4

    invoke-interface {v0}, Lj$/util/Spliterator;->trySplit()Lj$/util/Spliterator;

    move-result-object v1

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    new-instance v2, Lj$/util/stream/S;

    invoke-direct {v2, v8, v1}, Lj$/util/stream/S;-><init>(Lj$/util/stream/S;Lj$/util/Spliterator;)V

    const/4 v9, 0x1

    invoke-virtual {v8, v9}, Ljava/util/concurrent/CountedCompleter;->addToPendingCount(I)V

    if-eqz v7, :cond_3

    move-object v0, v1

    goto :goto_1

    :cond_3
    move-object v10, v8

    move-object v8, v2

    move-object v2, v10

    :goto_1
    xor-int/lit8 v7, v7, 0x1

    invoke-virtual {v8}, Ljava/util/concurrent/ForkJoinTask;->fork()Ljava/util/concurrent/ForkJoinTask;

    invoke-interface {v0}, Lj$/util/Spliterator;->estimateSize()J

    move-result-wide v8

    move-wide v10, v8

    move-object v8, v2

    move-wide v1, v10

    goto :goto_0

    :cond_4
    :goto_2
    iget-object v1, v8, Lj$/util/stream/S;->c:Lj$/util/stream/t0;

    invoke-virtual {v1, v0, v6}, Lj$/util/stream/t0;->r0(Lj$/util/Spliterator;Lj$/util/stream/e2;)V

    :cond_5
    const/4 v0, 0x0

    iput-object v0, v8, Lj$/util/stream/S;->a:Lj$/util/Spliterator;

    invoke-virtual {v8}, Ljava/util/concurrent/CountedCompleter;->propagateCompletion()V

    return-void
.end method
