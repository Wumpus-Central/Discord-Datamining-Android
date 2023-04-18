.class Lj$/util/stream/J0;
.super Lj$/util/stream/f;
.source "SourceFile"


# instance fields
.field protected final h:Lj$/util/stream/t0;

.field protected final i:Lj$/util/function/O;

.field protected final j:Lj$/util/function/d;


# direct methods
.method constructor <init>(Lj$/util/stream/J0;Lj$/util/Spliterator;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lj$/util/stream/f;-><init>(Lj$/util/stream/f;Lj$/util/Spliterator;)V

    iget-object p2, p1, Lj$/util/stream/J0;->h:Lj$/util/stream/t0;

    iput-object p2, p0, Lj$/util/stream/J0;->h:Lj$/util/stream/t0;

    iget-object p2, p1, Lj$/util/stream/J0;->i:Lj$/util/function/O;

    iput-object p2, p0, Lj$/util/stream/J0;->i:Lj$/util/function/O;

    iget-object p1, p1, Lj$/util/stream/J0;->j:Lj$/util/function/d;

    iput-object p1, p0, Lj$/util/stream/J0;->j:Lj$/util/function/d;

    return-void
.end method

.method constructor <init>(Lj$/util/stream/t0;Lj$/util/Spliterator;Lj$/util/function/O;Lj$/util/function/d;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lj$/util/stream/f;-><init>(Lj$/util/stream/t0;Lj$/util/Spliterator;)V

    iput-object p1, p0, Lj$/util/stream/J0;->h:Lj$/util/stream/t0;

    iput-object p3, p0, Lj$/util/stream/J0;->i:Lj$/util/function/O;

    iput-object p4, p0, Lj$/util/stream/J0;->j:Lj$/util/function/d;

    return-void
.end method


# virtual methods
.method protected final a()Ljava/lang/Object;
    .locals 3

    .line 0
    iget-object v0, p0, Lj$/util/stream/J0;->i:Lj$/util/function/O;

    iget-object v1, p0, Lj$/util/stream/J0;->h:Lj$/util/stream/t0;

    iget-object v2, p0, Lj$/util/stream/f;->b:Lj$/util/Spliterator;

    invoke-virtual {v1, v2}, Lj$/util/stream/t0;->v0(Lj$/util/Spliterator;)J

    move-result-wide v1

    invoke-interface {v0, v1, v2}, Lj$/util/function/O;->apply(J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj$/util/stream/x0;

    iget-object v1, p0, Lj$/util/stream/J0;->h:Lj$/util/stream/t0;

    iget-object v2, p0, Lj$/util/stream/f;->b:Lj$/util/Spliterator;

    invoke-virtual {v1, v2, v0}, Lj$/util/stream/t0;->J0(Lj$/util/Spliterator;Lj$/util/stream/e2;)Lj$/util/stream/e2;

    invoke-interface {v0}, Lj$/util/stream/x0;->build()Lj$/util/stream/C0;

    move-result-object v0

    return-object v0
.end method

.method protected final d(Lj$/util/Spliterator;)Lj$/util/stream/f;
    .locals 1

    .line 0
    new-instance v0, Lj$/util/stream/J0;

    invoke-direct {v0, p0, p1}, Lj$/util/stream/J0;-><init>(Lj$/util/stream/J0;Lj$/util/Spliterator;)V

    return-object v0
.end method

.method public final onCompletion(Ljava/util/concurrent/CountedCompleter;)V
    .locals 3

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
    iget-object v1, p0, Lj$/util/stream/J0;->j:Lj$/util/function/d;

    check-cast v0, Lj$/util/stream/J0;

    invoke-virtual {v0}, Lj$/util/stream/f;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj$/util/stream/C0;

    iget-object v2, p0, Lj$/util/stream/f;->e:Lj$/util/stream/f;

    check-cast v2, Lj$/util/stream/J0;

    invoke-virtual {v2}, Lj$/util/stream/f;->b()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lj$/util/stream/C0;

    invoke-interface {v1, v0, v2}, Lj$/util/function/BiFunction;->apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj$/util/stream/C0;

    invoke-virtual {p0, v0}, Lj$/util/stream/f;->e(Ljava/lang/Object;)V

    :cond_1
    invoke-super {p0, p1}, Lj$/util/stream/f;->onCompletion(Ljava/util/concurrent/CountedCompleter;)V

    return-void
.end method
