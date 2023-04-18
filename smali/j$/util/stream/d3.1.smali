.class final Lj$/util/stream/d3;
.super Lj$/util/stream/U2;
.source "SourceFile"

# interfaces
.implements Lj$/util/y;


# direct methods
.method constructor <init>(Lj$/util/stream/t0;Lj$/util/Spliterator;Z)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lj$/util/stream/U2;-><init>(Lj$/util/stream/t0;Lj$/util/Spliterator;Z)V

    return-void
.end method

.method constructor <init>(Lj$/util/stream/t0;Lj$/util/stream/a;Z)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lj$/util/stream/U2;-><init>(Lj$/util/stream/t0;Lj$/util/stream/a;Z)V

    return-void
.end method


# virtual methods
.method public final f(Lj$/util/function/i;)Z
    .locals 8

    .line 0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    invoke-virtual {p0}, Lj$/util/stream/U2;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Lj$/util/stream/U2;->h:Lj$/util/stream/e;

    check-cast v1, Lj$/util/stream/I2;

    iget-wide v2, p0, Lj$/util/stream/U2;->g:J

    .line 0
    invoke-virtual {v1, v2, v3}, Lj$/util/stream/O2;->q(J)I

    move-result v4

    .line 0
    iget v5, v1, Lj$/util/stream/e;->c:I

    if-nez v5, :cond_0

    if-nez v4, :cond_0

    iget-object v1, v1, Lj$/util/stream/O2;->e:Ljava/lang/Object;

    check-cast v1, [D

    long-to-int v2, v2

    aget-wide v2, v1, v2

    goto :goto_0

    :cond_0
    iget-object v5, v1, Lj$/util/stream/O2;->f:[Ljava/lang/Object;

    check-cast v5, [[D

    aget-object v5, v5, v4

    iget-object v1, v1, Lj$/util/stream/e;->d:[J

    aget-wide v6, v1, v4

    sub-long/2addr v2, v6

    long-to-int v1, v2

    aget-wide v2, v5, v1

    .line 0
    :goto_0
    invoke-interface {p1, v2, v3}, Lj$/util/function/i;->accept(D)V

    :cond_1
    return v0
.end method

.method public final synthetic forEachRemaining(Lj$/util/function/Consumer;)V
    .locals 0

    invoke-static {p0, p1}, Lj$/util/n;->c(Lj$/util/y;Lj$/util/function/Consumer;)V

    return-void
.end method

.method public final bridge synthetic forEachRemaining(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lj$/util/function/i;

    invoke-virtual {p0, p1}, Lj$/util/stream/d3;->g(Lj$/util/function/i;)V

    return-void
.end method

.method public final g(Lj$/util/function/i;)V
    .locals 3

    iget-object v0, p0, Lj$/util/stream/U2;->h:Lj$/util/stream/e;

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lj$/util/stream/U2;->i:Z

    if-nez v0, :cond_0

    .line 0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    invoke-virtual {p0}, Lj$/util/stream/U2;->e()V

    new-instance v0, Lj$/util/stream/c3;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Lj$/util/stream/c3;-><init>(Lj$/util/function/i;I)V

    iget-object p1, p0, Lj$/util/stream/U2;->d:Lj$/util/Spliterator;

    iget-object v2, p0, Lj$/util/stream/U2;->b:Lj$/util/stream/t0;

    invoke-virtual {v2, p1, v0}, Lj$/util/stream/t0;->J0(Lj$/util/Spliterator;Lj$/util/stream/e2;)Lj$/util/stream/e2;

    iput-boolean v1, p0, Lj$/util/stream/U2;->i:Z

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Lj$/util/stream/d3;->f(Lj$/util/function/i;)Z

    move-result v0

    if-nez v0, :cond_0

    :goto_0
    return-void
.end method

.method final h()V
    .locals 3

    new-instance v0, Lj$/util/stream/I2;

    invoke-direct {v0}, Lj$/util/stream/I2;-><init>()V

    iput-object v0, p0, Lj$/util/stream/U2;->h:Lj$/util/stream/e;

    new-instance v1, Lj$/util/stream/c3;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Lj$/util/stream/c3;-><init>(Lj$/util/function/i;I)V

    iget-object v0, p0, Lj$/util/stream/U2;->b:Lj$/util/stream/t0;

    invoke-virtual {v0, v1}, Lj$/util/stream/t0;->K0(Lj$/util/stream/e2;)Lj$/util/stream/e2;

    move-result-object v0

    iput-object v0, p0, Lj$/util/stream/U2;->e:Lj$/util/stream/e2;

    new-instance v0, Lj$/util/stream/a;

    const/4 v1, 0x4

    invoke-direct {v0, v1, p0}, Lj$/util/stream/a;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, Lj$/util/stream/U2;->f:Lj$/util/stream/a;

    return-void
.end method

.method final i(Lj$/util/Spliterator;)Lj$/util/stream/U2;
    .locals 3

    new-instance v0, Lj$/util/stream/d3;

    iget-object v1, p0, Lj$/util/stream/U2;->b:Lj$/util/stream/t0;

    iget-boolean v2, p0, Lj$/util/stream/U2;->a:Z

    invoke-direct {v0, v1, p1, v2}, Lj$/util/stream/d3;-><init>(Lj$/util/stream/t0;Lj$/util/Spliterator;Z)V

    return-object v0
.end method

.method public final synthetic tryAdvance(Lj$/util/function/Consumer;)Z
    .locals 0

    invoke-static {p0, p1}, Lj$/util/n;->h(Lj$/util/y;Lj$/util/function/Consumer;)Z

    move-result p1

    return p1
.end method

.method public final bridge synthetic tryAdvance(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lj$/util/function/i;

    invoke-virtual {p0, p1}, Lj$/util/stream/d3;->f(Lj$/util/function/i;)Z

    move-result p1

    return p1
.end method

.method public final bridge synthetic trySplit()Lj$/util/D;
    .locals 1

    invoke-virtual {p0}, Lj$/util/stream/d3;->trySplit()Lj$/util/y;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic trySplit()Lj$/util/Spliterator;
    .locals 1

    invoke-virtual {p0}, Lj$/util/stream/d3;->trySplit()Lj$/util/y;

    move-result-object v0

    return-object v0
.end method

.method public final trySplit()Lj$/util/y;
    .locals 1

    invoke-super {p0}, Lj$/util/stream/U2;->trySplit()Lj$/util/Spliterator;

    move-result-object v0

    check-cast v0, Lj$/util/y;

    return-object v0
.end method
