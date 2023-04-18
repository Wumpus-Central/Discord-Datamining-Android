.class abstract Lj$/util/stream/e1;
.super Lj$/util/stream/g1;
.source "SourceFile"

# interfaces
.implements Lj$/util/D;


# direct methods
.method constructor <init>(Lj$/util/stream/B0;)V
    .locals 0

    invoke-direct {p0, p1}, Lj$/util/stream/g1;-><init>(Lj$/util/stream/C0;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lj$/util/function/M;)V
    .locals 0

    invoke-virtual {p0, p1}, Lj$/util/stream/e1;->forEachRemaining(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic b(Lj$/util/function/M;)Z
    .locals 0

    invoke-virtual {p0, p1}, Lj$/util/stream/e1;->tryAdvance(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic f(Lj$/util/function/i;)Z
    .locals 0

    invoke-virtual {p0, p1}, Lj$/util/stream/e1;->tryAdvance(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic forEachRemaining(Lj$/util/function/IntConsumer;)V
    .locals 0

    invoke-virtual {p0, p1}, Lj$/util/stream/e1;->forEachRemaining(Ljava/lang/Object;)V

    return-void
.end method

.method public final forEachRemaining(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lj$/util/stream/g1;->a:Lj$/util/stream/C0;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lj$/util/stream/g1;->d:Lj$/util/Spliterator;

    if-nez v0, :cond_3

    iget-object v0, p0, Lj$/util/stream/g1;->c:Lj$/util/Spliterator;

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lj$/util/stream/g1;->d()Ljava/util/ArrayDeque;

    move-result-object v0

    :goto_0
    invoke-static {v0}, Lj$/util/stream/g1;->c(Ljava/util/ArrayDeque;)Lj$/util/stream/C0;

    move-result-object v1

    check-cast v1, Lj$/util/stream/B0;

    if-eqz v1, :cond_1

    invoke-interface {v1, p1}, Lj$/util/stream/B0;->g(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    iput-object p1, p0, Lj$/util/stream/g1;->a:Lj$/util/stream/C0;

    goto :goto_2

    :cond_2
    check-cast v0, Lj$/util/D;

    invoke-interface {v0, p1}, Lj$/util/D;->forEachRemaining(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    :goto_1
    invoke-virtual {p0, p1}, Lj$/util/stream/e1;->tryAdvance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_1

    :cond_4
    :goto_2
    return-void
.end method

.method public bridge synthetic g(Lj$/util/function/i;)V
    .locals 0

    invoke-virtual {p0, p1}, Lj$/util/stream/e1;->forEachRemaining(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic tryAdvance(Lj$/util/function/IntConsumer;)Z
    .locals 0

    invoke-virtual {p0, p1}, Lj$/util/stream/e1;->tryAdvance(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final tryAdvance(Ljava/lang/Object;)Z
    .locals 2

    invoke-virtual {p0}, Lj$/util/stream/g1;->e()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v0, p0, Lj$/util/stream/g1;->d:Lj$/util/Spliterator;

    check-cast v0, Lj$/util/D;

    invoke-interface {v0, p1}, Lj$/util/D;->tryAdvance(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v1, p0, Lj$/util/stream/g1;->c:Lj$/util/Spliterator;

    if-nez v1, :cond_1

    iget-object v1, p0, Lj$/util/stream/g1;->e:Ljava/util/ArrayDeque;

    invoke-static {v1}, Lj$/util/stream/g1;->c(Ljava/util/ArrayDeque;)Lj$/util/stream/C0;

    move-result-object v1

    check-cast v1, Lj$/util/stream/B0;

    if-eqz v1, :cond_1

    invoke-interface {v1}, Lj$/util/stream/B0;->spliterator()Lj$/util/D;

    move-result-object v0

    iput-object v0, p0, Lj$/util/stream/g1;->d:Lj$/util/Spliterator;

    invoke-interface {v0, p1}, Lj$/util/D;->tryAdvance(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    iput-object p1, p0, Lj$/util/stream/g1;->a:Lj$/util/stream/C0;

    :cond_2
    return v0
.end method
