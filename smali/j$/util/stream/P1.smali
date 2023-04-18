.class final Lj$/util/stream/P1;
.super Lj$/util/stream/f;
.source "SourceFile"


# instance fields
.field private final h:Lj$/util/stream/t0;


# direct methods
.method constructor <init>(Lj$/util/stream/P1;Lj$/util/Spliterator;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lj$/util/stream/f;-><init>(Lj$/util/stream/f;Lj$/util/Spliterator;)V

    iget-object p1, p1, Lj$/util/stream/P1;->h:Lj$/util/stream/t0;

    iput-object p1, p0, Lj$/util/stream/P1;->h:Lj$/util/stream/t0;

    return-void
.end method

.method constructor <init>(Lj$/util/stream/t0;Lj$/util/stream/t0;Lj$/util/Spliterator;)V
    .locals 0

    invoke-direct {p0, p2, p3}, Lj$/util/stream/f;-><init>(Lj$/util/stream/t0;Lj$/util/Spliterator;)V

    iput-object p1, p0, Lj$/util/stream/P1;->h:Lj$/util/stream/t0;

    return-void
.end method


# virtual methods
.method protected final a()Ljava/lang/Object;
    .locals 3

    .line 0
    iget-object v0, p0, Lj$/util/stream/f;->a:Lj$/util/stream/t0;

    iget-object v1, p0, Lj$/util/stream/P1;->h:Lj$/util/stream/t0;

    invoke-virtual {v1}, Lj$/util/stream/t0;->I0()Lj$/util/stream/N1;

    move-result-object v1

    iget-object v2, p0, Lj$/util/stream/f;->b:Lj$/util/Spliterator;

    invoke-virtual {v0, v2, v1}, Lj$/util/stream/t0;->J0(Lj$/util/Spliterator;Lj$/util/stream/e2;)Lj$/util/stream/e2;

    return-object v1
.end method

.method protected final d(Lj$/util/Spliterator;)Lj$/util/stream/f;
    .locals 1

    .line 0
    new-instance v0, Lj$/util/stream/P1;

    invoke-direct {v0, p0, p1}, Lj$/util/stream/P1;-><init>(Lj$/util/stream/P1;Lj$/util/Spliterator;)V

    return-object v0
.end method

.method public final onCompletion(Ljava/util/concurrent/CountedCompleter;)V
    .locals 2

    .line 0
    iget-object v0, p0, Lj$/util/stream/f;->d:Lj$/util/stream/f;

    if-nez v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_1

    .line 0
    check-cast v0, Lj$/util/stream/P1;

    invoke-virtual {v0}, Lj$/util/stream/f;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj$/util/stream/N1;

    iget-object v1, p0, Lj$/util/stream/f;->e:Lj$/util/stream/f;

    check-cast v1, Lj$/util/stream/P1;

    invoke-virtual {v1}, Lj$/util/stream/f;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lj$/util/stream/N1;

    invoke-interface {v0, v1}, Lj$/util/stream/N1;->h(Lj$/util/stream/N1;)V

    invoke-virtual {p0, v0}, Lj$/util/stream/f;->e(Ljava/lang/Object;)V

    :cond_1
    invoke-super {p0, p1}, Lj$/util/stream/f;->onCompletion(Ljava/util/concurrent/CountedCompleter;)V

    return-void
.end method
