.class abstract Lj$/util/stream/o3;
.super Lj$/util/stream/q3;
.source "SourceFile"

# interfaces
.implements Lj$/util/D;


# direct methods
.method constructor <init>(Lj$/util/D;JJ)V
    .locals 10

    const-wide/16 v6, 0x0

    invoke-interface {p1}, Lj$/util/Spliterator;->estimateSize()J

    move-result-wide v0

    invoke-static {v0, v1, p4, p5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v8

    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    move-wide v4, p4

    .line 0
    invoke-direct/range {v0 .. v9}, Lj$/util/stream/q3;-><init>(Lj$/util/Spliterator;JJJJ)V

    return-void
.end method

.method constructor <init>(Lj$/util/D;JJJJ)V
    .locals 0

    .line 0
    invoke-direct/range {p0 .. p9}, Lj$/util/stream/q3;-><init>(Lj$/util/Spliterator;JJJJ)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lj$/util/function/M;)V
    .locals 0

    invoke-virtual {p0, p1}, Lj$/util/stream/o3;->forEachRemaining(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic b(Lj$/util/function/M;)Z
    .locals 0

    invoke-virtual {p0, p1}, Lj$/util/stream/o3;->tryAdvance(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method protected abstract d()Ljava/lang/Object;
.end method

.method public bridge synthetic f(Lj$/util/function/i;)Z
    .locals 0

    invoke-virtual {p0, p1}, Lj$/util/stream/o3;->tryAdvance(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic forEachRemaining(Lj$/util/function/IntConsumer;)V
    .locals 0

    invoke-virtual {p0, p1}, Lj$/util/stream/o3;->forEachRemaining(Ljava/lang/Object;)V

    return-void
.end method

.method public final forEachRemaining(Ljava/lang/Object;)V
    .locals 6

    .line 0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    iget-wide v0, p0, Lj$/util/stream/q3;->e:J

    iget-wide v2, p0, Lj$/util/stream/q3;->a:J

    cmp-long v4, v2, v0

    if-ltz v4, :cond_0

    return-void

    :cond_0
    iget-wide v4, p0, Lj$/util/stream/q3;->d:J

    cmp-long v0, v4, v0

    if-ltz v0, :cond_1

    return-void

    :cond_1
    cmp-long v0, v4, v2

    if-ltz v0, :cond_2

    iget-object v0, p0, Lj$/util/stream/q3;->c:Lj$/util/Spliterator;

    check-cast v0, Lj$/util/D;

    invoke-interface {v0}, Lj$/util/Spliterator;->estimateSize()J

    move-result-wide v0

    add-long/2addr v0, v4

    iget-wide v4, p0, Lj$/util/stream/q3;->b:J

    cmp-long v0, v0, v4

    if-gtz v0, :cond_2

    iget-object v0, p0, Lj$/util/stream/q3;->c:Lj$/util/Spliterator;

    check-cast v0, Lj$/util/D;

    invoke-interface {v0, p1}, Lj$/util/D;->forEachRemaining(Ljava/lang/Object;)V

    iget-wide v0, p0, Lj$/util/stream/q3;->e:J

    iput-wide v0, p0, Lj$/util/stream/q3;->d:J

    goto :goto_2

    :cond_2
    :goto_0
    iget-wide v0, p0, Lj$/util/stream/q3;->d:J

    cmp-long v0, v2, v0

    const-wide/16 v4, 0x1

    if-lez v0, :cond_3

    iget-object v0, p0, Lj$/util/stream/q3;->c:Lj$/util/Spliterator;

    check-cast v0, Lj$/util/D;

    invoke-virtual {p0}, Lj$/util/stream/o3;->d()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Lj$/util/D;->tryAdvance(Ljava/lang/Object;)Z

    iget-wide v0, p0, Lj$/util/stream/q3;->d:J

    add-long/2addr v0, v4

    iput-wide v0, p0, Lj$/util/stream/q3;->d:J

    goto :goto_0

    :cond_3
    :goto_1
    iget-wide v0, p0, Lj$/util/stream/q3;->d:J

    iget-wide v2, p0, Lj$/util/stream/q3;->e:J

    cmp-long v0, v0, v2

    if-gez v0, :cond_4

    iget-object v0, p0, Lj$/util/stream/q3;->c:Lj$/util/Spliterator;

    check-cast v0, Lj$/util/D;

    invoke-interface {v0, p1}, Lj$/util/D;->tryAdvance(Ljava/lang/Object;)Z

    iget-wide v0, p0, Lj$/util/stream/q3;->d:J

    add-long/2addr v0, v4

    iput-wide v0, p0, Lj$/util/stream/q3;->d:J

    goto :goto_1

    :cond_4
    :goto_2
    return-void
.end method

.method public bridge synthetic g(Lj$/util/function/i;)V
    .locals 0

    invoke-virtual {p0, p1}, Lj$/util/stream/o3;->forEachRemaining(Ljava/lang/Object;)V

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

.method public bridge synthetic tryAdvance(Lj$/util/function/IntConsumer;)Z
    .locals 0

    invoke-virtual {p0, p1}, Lj$/util/stream/o3;->tryAdvance(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final tryAdvance(Ljava/lang/Object;)Z
    .locals 8

    .line 0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    iget-wide v0, p0, Lj$/util/stream/q3;->e:J

    iget-wide v2, p0, Lj$/util/stream/q3;->a:J

    cmp-long v0, v2, v0

    const/4 v1, 0x0

    if-ltz v0, :cond_0

    return v1

    :cond_0
    :goto_0
    iget-wide v4, p0, Lj$/util/stream/q3;->d:J

    cmp-long v0, v2, v4

    const-wide/16 v6, 0x1

    if-lez v0, :cond_1

    iget-object v0, p0, Lj$/util/stream/q3;->c:Lj$/util/Spliterator;

    check-cast v0, Lj$/util/D;

    invoke-virtual {p0}, Lj$/util/stream/o3;->d()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v0, v4}, Lj$/util/D;->tryAdvance(Ljava/lang/Object;)Z

    iget-wide v4, p0, Lj$/util/stream/q3;->d:J

    add-long/2addr v4, v6

    iput-wide v4, p0, Lj$/util/stream/q3;->d:J

    goto :goto_0

    :cond_1
    iget-wide v2, p0, Lj$/util/stream/q3;->e:J

    cmp-long v0, v4, v2

    if-ltz v0, :cond_2

    return v1

    :cond_2
    add-long/2addr v4, v6

    iput-wide v4, p0, Lj$/util/stream/q3;->d:J

    iget-object v0, p0, Lj$/util/stream/q3;->c:Lj$/util/Spliterator;

    check-cast v0, Lj$/util/D;

    invoke-interface {v0, p1}, Lj$/util/D;->tryAdvance(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
