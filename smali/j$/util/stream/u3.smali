.class abstract Lj$/util/stream/u3;
.super Lj$/util/stream/x3;
.source "SourceFile"

# interfaces
.implements Lj$/util/D;


# direct methods
.method constructor <init>(Lj$/util/D;JJ)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lj$/util/stream/x3;-><init>(Lj$/util/Spliterator;JJ)V

    return-void
.end method

.method constructor <init>(Lj$/util/D;Lj$/util/stream/u3;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lj$/util/stream/x3;-><init>(Lj$/util/Spliterator;Lj$/util/stream/x3;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lj$/util/function/M;)V
    .locals 0

    invoke-virtual {p0, p1}, Lj$/util/stream/u3;->forEachRemaining(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic b(Lj$/util/function/M;)Z
    .locals 0

    invoke-virtual {p0, p1}, Lj$/util/stream/u3;->tryAdvance(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic f(Lj$/util/function/i;)Z
    .locals 0

    invoke-virtual {p0, p1}, Lj$/util/stream/u3;->tryAdvance(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic forEachRemaining(Lj$/util/function/IntConsumer;)V
    .locals 0

    invoke-virtual {p0, p1}, Lj$/util/stream/u3;->forEachRemaining(Ljava/lang/Object;)V

    return-void
.end method

.method public final forEachRemaining(Ljava/lang/Object;)V
    .locals 8

    .line 0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    .line 0
    :goto_0
    invoke-virtual {p0}, Lj$/util/stream/x3;->m()Lj$/util/stream/w3;

    move-result-object v1

    sget-object v2, Lj$/util/stream/w3;->NO_MORE:Lj$/util/stream/w3;

    if-eq v1, v2, :cond_5

    sget-object v2, Lj$/util/stream/w3;->MAYBE_MORE:Lj$/util/stream/w3;

    iget-object v3, p0, Lj$/util/stream/x3;->a:Lj$/util/Spliterator;

    if-ne v1, v2, :cond_4

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lj$/util/stream/u3;->o()Lj$/util/stream/Y2;

    move-result-object v0

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    .line 0
    iput v1, v0, Lj$/util/stream/Y2;->b:I

    :goto_1
    const-wide/16 v1, 0x0

    move-wide v4, v1

    .line 0
    :cond_1
    move-object v6, v3

    check-cast v6, Lj$/util/D;

    invoke-interface {v6, v0}, Lj$/util/D;->tryAdvance(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const-wide/16 v6, 0x1

    add-long/2addr v4, v6

    const-wide/16 v6, 0x80

    cmp-long v6, v4, v6

    if-ltz v6, :cond_1

    :cond_2
    cmp-long v1, v4, v1

    if-nez v1, :cond_3

    return-void

    :cond_3
    invoke-virtual {p0, v4, v5}, Lj$/util/stream/x3;->i(J)J

    move-result-wide v1

    invoke-virtual {v0, p1, v1, v2}, Lj$/util/stream/Y2;->a(Ljava/lang/Object;J)V

    goto :goto_0

    :cond_4
    check-cast v3, Lj$/util/D;

    invoke-interface {v3, p1}, Lj$/util/D;->forEachRemaining(Ljava/lang/Object;)V

    :cond_5
    return-void
.end method

.method public bridge synthetic g(Lj$/util/function/i;)V
    .locals 0

    invoke-virtual {p0, p1}, Lj$/util/stream/u3;->forEachRemaining(Ljava/lang/Object;)V

    return-void
.end method

.method public final synthetic getComparator()Ljava/util/Comparator;
    .locals 1

    invoke-static {p0}, Lj$/util/Spliterator$-CC;->$default$getComparator(Lj$/util/Spliterator;)Ljava/util/Comparator;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic getExactSizeIfKnown()J
    .locals 2

    invoke-static {p0}, Lj$/util/Spliterator$-CC;->$default$getExactSizeIfKnown(Lj$/util/Spliterator;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final synthetic hasCharacteristics(I)Z
    .locals 0

    invoke-static {p0, p1}, Lj$/util/Spliterator$-CC;->$default$hasCharacteristics(Lj$/util/Spliterator;I)Z

    move-result p1

    return p1
.end method

.method protected abstract n(Ljava/lang/Object;)V
.end method

.method protected abstract o()Lj$/util/stream/Y2;
.end method

.method public bridge synthetic tryAdvance(Lj$/util/function/IntConsumer;)Z
    .locals 0

    invoke-virtual {p0, p1}, Lj$/util/stream/u3;->tryAdvance(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final tryAdvance(Ljava/lang/Object;)Z
    .locals 4

    .line 0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    :cond_0
    invoke-virtual {p0}, Lj$/util/stream/x3;->m()Lj$/util/stream/w3;

    move-result-object v0

    sget-object v1, Lj$/util/stream/w3;->NO_MORE:Lj$/util/stream/w3;

    const/4 v2, 0x0

    if-eq v0, v1, :cond_2

    iget-object v0, p0, Lj$/util/stream/x3;->a:Lj$/util/Spliterator;

    check-cast v0, Lj$/util/D;

    invoke-interface {v0, p0}, Lj$/util/D;->tryAdvance(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    return v2

    :cond_1
    const-wide/16 v0, 0x1

    invoke-virtual {p0, v0, v1}, Lj$/util/stream/x3;->i(J)J

    move-result-wide v2

    cmp-long v0, v2, v0

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, Lj$/util/stream/u3;->n(Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1

    :cond_2
    return v2
.end method
